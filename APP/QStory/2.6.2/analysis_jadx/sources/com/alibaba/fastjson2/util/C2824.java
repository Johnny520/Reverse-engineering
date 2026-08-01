package com.alibaba.fastjson2.util;

import p007.AbstractC6136;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2824 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f8792;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f8793;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f8794;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f8795;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C2824 f8789 = new C2824(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C2824 f8788 = new C2824(3, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C2824 f8791 = new C2824(3, 0, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C2824 f8790 = new C2824(2, -324, 49);

    public C2824(int i) {
        this.f8793 = i;
        this.f8792 = true;
        this.f8795 = 0L;
        this.f8794 = 0;
    }

    public final String toString() {
        if (this == f8789) {
            return "null";
        }
        if (this == f8788) {
            return "0.0";
        }
        if (this == f8791) {
            return "-0.0";
        }
        boolean z = this.f8792;
        int i = this.f8793;
        if (z) {
            return AbstractC6136.m11556(i, "1e");
        }
        return this.f8795 + "|" + i;
    }

    public C2824(int i, int i2, long j) {
        this.f8795 = j;
        this.f8794 = i;
        this.f8793 = i2;
        this.f8792 = false;
    }
}
