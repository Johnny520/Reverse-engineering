package com.typesafe.config.impl;

import com.alibaba.fastjson2.C2942;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3822 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3837 f12019 = C3837.m8204(TokenType.START, "start of file", "");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3837 f12018 = C3837.m8204(TokenType.END, "end of file", "");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C3837 f12017 = C3837.m8204(TokenType.COMMA, "','", ",");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3837 f12016 = C3837.m8204(TokenType.EQUALS, "'='", "=");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3837 f12015 = C3837.m8204(TokenType.COLON, "':'", ":");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3837 f12014 = C3837.m8204(TokenType.OPEN_CURLY, "'{'", "{");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C3837 f12021 = C3837.m8204(TokenType.CLOSE_CURLY, "'}'", "}");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C3837 f12020 = C3837.m8204(TokenType.OPEN_SQUARE, "'['", "[");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C3837 f12022 = C3837.m8204(TokenType.CLOSE_SQUARE, "']'", "]");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C3837 f12023 = C3837.m8204(TokenType.PLUS_EQUALS, "'+='", "+=");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC3843 m8196(C3837 c3837) {
        if (c3837 instanceof C3824) {
            return ((C3824) c3837).f12025;
        }
        C2942.m6395(c3837, "tried to get value of non-value token ");
        return null;
    }
}
