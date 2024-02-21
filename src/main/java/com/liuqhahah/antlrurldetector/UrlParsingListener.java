package com.liuqhahah.antlrurldetector;


import com.liuqhahah.url.MultiURLBaseListener;
import com.liuqhahah.url.MultiURLParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Locale;
import java.util.Set;

public class UrlParsingListener extends MultiURLBaseListener {
    private String scheme;
    private String login;
    private String host;
    private String path;

    private String query;
    private String frag;

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setFrag(String frag) {
        this.frag = frag;
    }

    public String getScheme() {
        return scheme;
    }

    public String getLogin() {
        return login;
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

    public String getFrag() {
        return frag;
    }



    @Override
    public void enterUri(MultiURLParser.UriContext ctx) {
        System.out.println("enterUri start:" + ctx.start.getStartIndex());

    }





    @Override
    public void enterQuery(MultiURLParser.QueryContext ctx) {
        query = ctx.getText();
    }


    @Override
    public void exitUri(MultiURLParser.UriContext ctx) {
        super.exitUri(ctx);
    }

    @Override
    public void exitScheme(MultiURLParser.SchemeContext ctx) {

        System.out.println("exitScheme start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        scheme = ctx.getText();
        if (scheme.contains("https://")) {
            scheme = "https://";
        } else if (scheme.contains("http://")) {
            scheme = "http://";
        } else if (scheme.contains("ftp://")) {
            scheme = "ftp://";
        } else if (scheme.contains("ftps://")) {
            scheme = "ftps://";
        } else if (scheme.contains("https%3a//")) {
            scheme = "https://";
        } else if (scheme.contains("http%3a//")) {
            scheme = "http://";
        } else if (scheme.contains("ftp%3a//")) {
            scheme = "ftp://";
        }
        setScheme(scheme);
    }

    @Override
    public void exitHost(MultiURLParser.HostContext ctx) {
        host = ctx.getText();
        setHost(host);
    }

    @Override
    public void enterHostname(MultiURLParser.HostnameContext ctx) {
        super.enterHostname(ctx);
    }

    @Override
    public void exitHostname(MultiURLParser.HostnameContext ctx) {
        super.exitHostname(ctx);
    }

    @Override
    public void enterV6host(MultiURLParser.V6hostContext ctx) {
        super.enterV6host(ctx);
    }

    @Override
    public void exitV6host(MultiURLParser.V6hostContext ctx) {
        super.exitV6host(ctx);
    }

    @Override
    public void enterPort(MultiURLParser.PortContext ctx) {
        super.enterPort(ctx);
    }

    @Override
    public void exitPort(MultiURLParser.PortContext ctx) {
        super.exitPort(ctx);
    }

    @Override
    public void enterPath(MultiURLParser.PathContext ctx) {
        path = ctx.getText();
    }

    @Override
    public void exitPath(MultiURLParser.PathContext ctx) {
        super.exitPath(ctx);
    }

    @Override
    public void enterUser(MultiURLParser.UserContext ctx) {
        super.enterUser(ctx);
    }

    @Override
    public void exitUser(MultiURLParser.UserContext ctx) {
        super.exitUser(ctx);
    }

    @Override
    public void enterLogin(MultiURLParser.LoginContext ctx) {
        super.enterLogin(ctx);
    }

    @Override
    public void exitLogin(MultiURLParser.LoginContext ctx) {
        super.exitLogin(ctx);
    }

    @Override
    public void enterPassword(MultiURLParser.PasswordContext ctx) {
        super.enterPassword(ctx);
    }

    @Override
    public void exitPassword(MultiURLParser.PasswordContext ctx) {
        super.exitPassword(ctx);
    }

    @Override
    public void enterFrag(MultiURLParser.FragContext ctx) {
        super.enterFrag(ctx);
    }

    @Override
    public void exitFrag(MultiURLParser.FragContext ctx) {
        super.exitFrag(ctx);
    }

    @Override
    public void exitQuery(MultiURLParser.QueryContext ctx) {
        super.exitQuery(ctx);
    }

    @Override
    public void enterSearch(MultiURLParser.SearchContext ctx) {
        super.enterSearch(ctx);
    }

    @Override
    public void exitSearch(MultiURLParser.SearchContext ctx) {
        super.exitSearch(ctx);
    }

    @Override
    public void enterSearchparameter(MultiURLParser.SearchparameterContext ctx) {
        super.enterSearchparameter(ctx);
    }

    @Override
    public void exitSearchparameter(MultiURLParser.SearchparameterContext ctx) {
        super.exitSearchparameter(ctx);
    }

    @Override
    public void enterString(MultiURLParser.StringContext ctx) {
        super.enterString(ctx);
    }

    @Override
    public void exitString(MultiURLParser.StringContext ctx) {
        super.exitString(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }


}
