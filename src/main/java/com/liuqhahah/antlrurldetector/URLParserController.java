package com.liuqhahah.antlrurldetector;

import com.liuqhahah.url.URLLexer;
import com.liuqhahah.url.URLParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.springframework.web.bind.annotation.*;

@RestController
public class URLParserController {
    @PostMapping("/parse-url")
    public String parseUrls(@RequestBody String input) {
        URLLexer lexer = new URLLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        URLParser parser = new URLParser(tokens);

        // Set up a custom listener to handle parsing results
        UrlParsingListener listener = new UrlParsingListener();
        parser.addParseListener(listener);

        // Start parsing
        parser.url();

        // Retrieve and return parsing results
        return listener.getParsingResults();
    }

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
