package com.liuqhahah.antlrurldetector;


import com.liuqhahah.url.MultiURLLexer;
import com.liuqhahah.url.MultiURLParser;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class URLParserController {

    public static class RequestDTO {
        private String[] urls;

        public String[] getUrls() {
            return urls;
        }

        public void setUrls(String[] urls) {
            this.urls = urls;
        }

        @Override
        public String toString() {
            return "RequestDTO{" +
                    "urls=" + Arrays.toString(urls) +
                    '}';
        }
    }
    @PostMapping("/parse-url")
    public String parseUrls(@RequestBody RequestDTO request) {
        ArrayList<String> results = new ArrayList<>();
        System.out.println(request.toString());
        String[] urls = request.getUrls();

        for (String url:urls){
            MultiURLLexer lexer = new MultiURLLexer(CharStreams.fromString(url));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MultiURLParser parser = new MultiURLParser(tokens);

            // Set up a custom listener to handle parsing results
            UrlParsingListener listener = new UrlParsingListener();
            parser.addParseListener(listener);
            // Start parsing

            // Replace "url" with the name of your starting rule
            MultiURLParser.UrlsContext urlsContext = parser.urls();

            if (urlsContext.uri()!=null){
                for (MultiURLParser.UriContext uriContext :urlsContext.uri()){
                    System.out.println("s: " + uriContext.toString());
                    // You can now traverse the parse tree or extract information from the context
                    if(uriContext.scheme()!=null){
                        System.out.println("Scheme: " +uriContext.scheme().getText());
                    }
                    if (uriContext.host()!=null){
                        System.out.println("Host: " + uriContext.host().getText());
                    }

                    results.add(uriContext.getText());
                }
            }
        }
        return results.toString();
    }
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
