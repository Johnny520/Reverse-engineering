package com.typesafe.config.impl;

import com.alibaba.fastjson2.C3775;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4654 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4669 f12364 = C4669.m8763(TokenType.START, "start of file", "");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4669 f12363 = C4669.m8763(TokenType.END, "end of file", "");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4669 f12362 = C4669.m8763(TokenType.COMMA, "','", ",");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4669 f12361 = C4669.m8763(TokenType.EQUALS, "'='", "=");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4669 f12360 = C4669.m8763(TokenType.COLON, "':'", ":");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4669 f12359 = C4669.m8763(TokenType.OPEN_CURLY, "'{'", "{");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4669 f12366 = C4669.m8763(TokenType.CLOSE_CURLY, "'}'", "}");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4669 f12365 = C4669.m8763(TokenType.OPEN_SQUARE, "'['", "[");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C4669 f12367 = C4669.m8763(TokenType.CLOSE_SQUARE, "']'", "]");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C4669 f12368 = C4669.m8763(TokenType.PLUS_EQUALS, "'+='", "+=");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static AbstractC4675 m8755(C4669 c4669) {
        if (c4669 instanceof C4656) {
            return ((C4656) c4669).f12370;
        }
        C3775.m6955(c4669, "tried to get value of non-value token ");
        return null;
    }
}
