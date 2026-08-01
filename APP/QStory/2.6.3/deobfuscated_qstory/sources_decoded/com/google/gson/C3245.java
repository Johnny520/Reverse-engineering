package com.google.gson;

import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3245 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3245 f10915 = new C3245("", "", false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f10916;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f10917;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f10918;

    static {
        new C3245("\n", "  ", true);
    }

    public C3245(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            C5925.m11310("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            C5925.m11310("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.f10918 = str;
        this.f10917 = str2;
        this.f10916 = z;
    }
}
