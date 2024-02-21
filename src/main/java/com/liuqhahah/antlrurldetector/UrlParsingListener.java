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

        super.enterUri(ctx);
    }





    @Override
    public void enterQuery(MultiURLParser.QueryContext ctx) {
        System.out.println("enterQuery start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        query = ctx.getText();
        super.enterQuery(ctx);
    }


    @Override
    public void exitUri(MultiURLParser.UriContext ctx) {
        System.out.println("exitUri start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
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
        super.exitHost(ctx);
    }

    @Override
    public void enterHostname(MultiURLParser.HostnameContext ctx) {
        System.out.println("enterHostname start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.enterHostname(ctx);
    }

    @Override
    public void exitHostname(MultiURLParser.HostnameContext ctx) {
        System.out.println("exitHostname start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.exitHostname(ctx);
    }

    @Override
    public void enterV6host(MultiURLParser.V6hostContext ctx) {
        System.out.println("enterV6host start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.enterV6host(ctx);
    }

    @Override
    public void exitV6host(MultiURLParser.V6hostContext ctx) {
        System.out.println("exitV6host start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.exitV6host(ctx);
    }

    @Override
    public void enterPort(MultiURLParser.PortContext ctx) {
        System.out.println("enterPort start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.enterPort(ctx);
    }

    @Override
    public void exitPort(MultiURLParser.PortContext ctx) {
        System.out.println("exitPort start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.exitPort(ctx);
    }

    @Override
    public void enterPath(MultiURLParser.PathContext ctx) {
        path = ctx.getText();
        System.out.println("enterPath start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
    }

    @Override
    public void exitPath(MultiURLParser.PathContext ctx) {

        System.out.println("exitPath start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
    }

    @Override
    public void enterUser(MultiURLParser.UserContext ctx) {
        System.out.println("enterUser start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
    }

    @Override
    public void exitUser(MultiURLParser.UserContext ctx) {
        System.out.println("exitUser start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
    }

    @Override
    public void enterLogin(MultiURLParser.LoginContext ctx) {
        System.out.println("enterLogin start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.enterLogin(ctx);
    }

    @Override
    public void exitLogin(MultiURLParser.LoginContext ctx) {
        System.out.println("exitLogin start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.exitLogin(ctx);
    }

    @Override
    public void enterPassword(MultiURLParser.PasswordContext ctx) {
        System.out.println("enterPassword start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.enterPassword(ctx);
    }

    @Override
    public void exitPassword(MultiURLParser.PasswordContext ctx) {
        System.out.println("exitPassword start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.exitPassword(ctx);
    }

    @Override
    public void enterFrag(MultiURLParser.FragContext ctx) {
        System.out.println("enterFrag start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.enterFrag(ctx);
    }

    @Override
    public void exitFrag(MultiURLParser.FragContext ctx) {
        System.out.println("exitFrag start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.exitFrag(ctx);
    }

    @Override
    public void exitQuery(MultiURLParser.QueryContext ctx) {
        System.out.println("exitQuery start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.exitQuery(ctx);
    }

    @Override
    public void enterSearch(MultiURLParser.SearchContext ctx) {
        System.out.println("enterSearch start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.enterSearch(ctx);
    }

    @Override
    public void exitSearch(MultiURLParser.SearchContext ctx) {
        System.out.println("exitSearch start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.exitSearch(ctx);
    }

    @Override
    public void enterSearchparameter(MultiURLParser.SearchparameterContext ctx) {
        System.out.println("enterSearchparameter start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.enterSearchparameter(ctx);
    }

    @Override
    public void exitSearchparameter(MultiURLParser.SearchparameterContext ctx) {
        System.out.println("exitSearchparameter start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.exitSearchparameter(ctx);
    }

    @Override
    public void enterString(MultiURLParser.StringContext ctx) {
        System.out.println("enterString start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.enterString(ctx);
    }

    @Override
    public void exitString(MultiURLParser.StringContext ctx) {
        System.out.println("exitString start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.exitString(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println("enterEveryRule start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        System.out.println("exitEveryRule start:" + ctx.start.getStartIndex() + ",text:" + ctx.getText());
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
