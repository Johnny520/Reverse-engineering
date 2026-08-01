package com.alibaba.fastjson2.util;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2827 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static long m5632(long j, long j2) {
        long j3 = j >> 32;
        long j4 = j & 4294967295L;
        long j5 = j2 >> 32;
        long j6 = j2 & 4294967295L;
        long j7 = (j6 * j3) + ((j4 * j6) >>> 32);
        return (j3 * j5) + (j7 >> 32) + (((j4 * j5) + (4294967295L & j7)) >> 32);
    }
}
