package com.alibaba.fastjson2.util;

import p009.AbstractC6183;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2825 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f8794;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f8795;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f8796;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f8797;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2825 f8791 = new C2825(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2825 f8790 = new C2825(3, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2825 f8793 = new C2825(3, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2825 f8792 = new C2825(2, -324, 49);

    public C2825(int i) {
        this.f8795 = i;
        this.f8794 = true;
        this.f8797 = 0L;
        this.f8796 = 0;
    }

    public final String toString() {
        if (this == f8791) {
            return "null";
        }
        if (this == f8790) {
            return "0.0";
        }
        if (this == f8793) {
            return "-0.0";
        }
        boolean z = this.f8794;
        int i = this.f8795;
        if (z) {
            return AbstractC6183.m11588(i, "1e");
        }
        return this.f8797 + "|" + i;
    }

    public C2825(int i, int i2, long j) {
        this.f8797 = j;
        this.f8796 = i;
        this.f8795 = i2;
        this.f8794 = false;
    }
}
