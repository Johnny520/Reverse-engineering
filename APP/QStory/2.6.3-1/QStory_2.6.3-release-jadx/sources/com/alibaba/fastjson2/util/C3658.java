package com.alibaba.fastjson2.util;

import p025.AbstractC7012;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3658 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f9139;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f9140;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f9141;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f9142;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C3658 f9136 = new C3658(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C3658 f9135 = new C3658(3, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C3658 f9138 = new C3658(3, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C3658 f9137 = new C3658(2, -324, 49);

    public C3658(int i) {
        this.f9140 = i;
        this.f9139 = true;
        this.f9142 = 0L;
        this.f9141 = 0;
    }

    public final String toString() {
        if (this == f9136) {
            return "null";
        }
        if (this == f9135) {
            return "0.0";
        }
        if (this == f9138) {
            return "-0.0";
        }
        boolean z = this.f9139;
        int i = this.f9140;
        if (z) {
            return AbstractC7012.m12147(i, "1e");
        }
        return this.f9142 + "|" + i;
    }

    public C3658(int i, int i2, long j) {
        this.f9142 = j;
        this.f9141 = i;
        this.f9140 = i2;
        this.f9139 = false;
    }
}
