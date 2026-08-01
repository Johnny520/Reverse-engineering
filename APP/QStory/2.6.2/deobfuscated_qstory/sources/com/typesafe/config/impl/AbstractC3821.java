package com.typesafe.config.impl;

import com.alibaba.fastjson2.C2941;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3821 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3836 f12014 = C3836.m8217(TokenType.START, "start of file", "");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3836 f12013 = C3836.m8217(TokenType.END, "end of file", "");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3836 f12012 = C3836.m8217(TokenType.COMMA, "','", ",");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3836 f12011 = C3836.m8217(TokenType.EQUALS, "'='", "=");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3836 f12010 = C3836.m8217(TokenType.COLON, "':'", ":");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3836 f12009 = C3836.m8217(TokenType.OPEN_CURLY, "'{'", "{");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C3836 f12016 = C3836.m8217(TokenType.CLOSE_CURLY, "'}'", "}");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C3836 f12015 = C3836.m8217(TokenType.OPEN_SQUARE, "'['", "[");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C3836 f12017 = C3836.m8217(TokenType.CLOSE_SQUARE, "']'", "]");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C3836 f12018 = C3836.m8217(TokenType.PLUS_EQUALS, "'+='", "+=");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC3842 m8209(C3836 c3836) {
        if (c3836 instanceof C3823) {
            return ((C3823) c3836).f12020;
        }
        C2941.m6337(c3836, "tried to get value of non-value token ");
        return null;
    }
}
