package com.liuqhahah.antlrurldetector;


import com.liuqhahah.url.MultiURLBaseListener;
import com.liuqhahah.url.MultiURLParser;

public class UrlParsingListener extends MultiURLBaseListener {
    private String scheme;
    private String host;
    private String path;
    private String query;

    private String url;
    private String uri;

    @Override
    public void enterUrl(MultiURLParser.UrlContext ctx) {
        url = ctx.getText();
    }


    @Override
    public void enterUri(MultiURLParser.UriContext ctx) {
        uri = ctx.getText();
    }

    @Override
    public void enterScheme(MultiURLParser.SchemeContext ctx) {
        scheme = ctx.getText();
    }

    @Override
    public void enterHost(MultiURLParser.HostContext ctx) {
       host = ctx.getText();
    }

    @Override
    public void enterQuery(MultiURLParser.QueryContext ctx) {
       query = ctx.getText();
    }

    public String getScheme() {
        return scheme;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }

    public String getUrl(){
        return url;
    }

    public String getUri(){
        return uri;
    }
}
