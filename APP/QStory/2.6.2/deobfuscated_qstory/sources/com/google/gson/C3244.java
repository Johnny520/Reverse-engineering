package com.google.gson;

import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.gson.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3244 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C3244 f10910 = new C3244("", "", false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f10911;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f10912;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f10913;

    static {
        new C3244("\n", "  ", true);
    }

    public C3244(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            C5919.m11249("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            C5919.m11249("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.f10913 = str;
        this.f10912 = str2;
        this.f10911 = z;
    }
}
