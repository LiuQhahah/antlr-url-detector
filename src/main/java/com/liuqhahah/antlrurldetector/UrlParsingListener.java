package com.liuqhahah.antlrurldetector;

import com.liuqhahah.url.URLBaseListener;
import com.liuqhahah.url.URLParser;

public class UrlParsingListener extends URLBaseListener {
    private StringBuilder parsingResults = new StringBuilder();
    @Override
    public void enterUrl(URLParser.UrlContext ctx) {
        parsingResults.append("URL Parsing Results:\n");
    }

    @Override
    public void enterScheme(URLParser.SchemeContext ctx) {
        parsingResults.append("Scheme: ").append(ctx.getText()).append("\n");
    }

    @Override
    public void enterHost(URLParser.HostContext ctx) {
        parsingResults.append("Host: ").append(ctx.getText()).append("\n");
    }

    // Implement other methods for additional URL components

    public String getParsingResults() {
        return parsingResults.toString();
    }
}
