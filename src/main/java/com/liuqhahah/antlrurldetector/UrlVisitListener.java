package com.liuqhahah.antlrurldetector;

import com.liuqhahah.url.URLBaseVisitor;
import com.liuqhahah.url.URLParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class UrlVisitListener extends URLBaseVisitor {
    @Override
    public Object visitUrl(URLParser.UrlContext ctx) {
        return super.visitUrl(ctx);
    }

    @Override
    public Object visitUri(URLParser.UriContext ctx) {
        return super.visitUri(ctx);
    }

    @Override
    public Object visitScheme(URLParser.SchemeContext ctx) {
        return super.visitScheme(ctx);
    }

    @Override
    public Object visitHost(URLParser.HostContext ctx) {
        return super.visitHost(ctx);
    }

    @Override
    public Object visitDomainNameOrIPv4Host(URLParser.DomainNameOrIPv4HostContext ctx) {
        return super.visitDomainNameOrIPv4Host(ctx);
    }

    @Override
    public Object visitIPv6Host(URLParser.IPv6HostContext ctx) {
        return super.visitIPv6Host(ctx);
    }

    @Override
    public Object visitV6host(URLParser.V6hostContext ctx) {
        return super.visitV6host(ctx);
    }

    @Override
    public Object visitPort(URLParser.PortContext ctx) {
        return super.visitPort(ctx);
    }

    @Override
    public Object visitPath(URLParser.PathContext ctx) {
        return super.visitPath(ctx);
    }

    @Override
    public Object visitUser(URLParser.UserContext ctx) {
        return super.visitUser(ctx);
    }

    @Override
    public Object visitLogin(URLParser.LoginContext ctx) {
        return super.visitLogin(ctx);
    }

    @Override
    public Object visitPassword(URLParser.PasswordContext ctx) {
        return super.visitPassword(ctx);
    }

    @Override
    public Object visitFrag(URLParser.FragContext ctx) {
        return super.visitFrag(ctx);
    }

    @Override
    public Object visitQuery(URLParser.QueryContext ctx) {
        return super.visitQuery(ctx);
    }

    @Override
    public Object visitSearch(URLParser.SearchContext ctx) {
        return super.visitSearch(ctx);
    }

    @Override
    public Object visitSearchparameter(URLParser.SearchparameterContext ctx) {
        return super.visitSearchparameter(ctx);
    }

    @Override
    public Object visitString(URLParser.StringContext ctx) {
        return super.visitString(ctx);
    }

    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Object defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Object currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
