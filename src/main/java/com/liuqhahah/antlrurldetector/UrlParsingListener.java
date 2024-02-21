package com.liuqhahah.antlrurldetector;


import com.liuqhahah.url.MultiURLBaseListener;
import com.liuqhahah.url.MultiURLParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class UrlParsingListener extends MultiURLBaseListener {
    private String scheme;
    private String host;
    private String path;
    private String query;

    private String url;
    private String uri;
    private String statement;
    private String statements;

    public String getStatement() {
        return statement;
    }

    public String getStatements() {
        return statements;
    }





    @Override
    public void enterUri(MultiURLParser.UriContext ctx) {
        System.out.println("enterUri start:"+ctx.start.getStartIndex());

        uri = ctx.getText();
    }

    @Override
    public void enterScheme(MultiURLParser.SchemeContext ctx) {
        System.out.println("enterScheme start:"+ctx.start.getStartIndex());

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



    @Override
    public void exitUri(MultiURLParser.UriContext ctx) {
        super.exitUri(ctx);
    }

    @Override
    public void exitScheme(MultiURLParser.SchemeContext ctx) {
        super.exitScheme(ctx);
    }

    @Override
    public void exitHost(MultiURLParser.HostContext ctx) {
        super.exitHost(ctx);
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
        super.enterPath(ctx);
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
