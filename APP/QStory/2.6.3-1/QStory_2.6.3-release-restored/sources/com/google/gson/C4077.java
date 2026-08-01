package com.google.gson;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4077 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4077 f11260 = new C4077("", "", false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f11261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f11262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f11263;

    static {
        new C4077("\n", "  ", true);
    }

    public C4077(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            C6755.m11869("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            C6755.m11869("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.f11263 = str;
        this.f11262 = str2;
        this.f11261 = z;
    }
}
