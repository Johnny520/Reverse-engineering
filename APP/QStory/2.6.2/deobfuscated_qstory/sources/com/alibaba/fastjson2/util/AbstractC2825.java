package com.alibaba.fastjson2.util;

import java.nio.charset.StandardCharsets;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2825 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final short[] f8796;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int f8797;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final short f8798;

    static {
        byte[] bytes = "\\u00".getBytes(StandardCharsets.UTF_8);
        Unsafe unsafe = AbstractC2853.f8919;
        long j = AbstractC2853.f8918;
        f8798 = unsafe.getShort(bytes, j);
        f8797 = unsafe.getInt(bytes, j);
        short[] sArr = new short[128];
        sArr[92] = 23644;
        sArr[10] = 28252;
        sArr[13] = 29276;
        sArr[12] = 26204;
        sArr[8] = 25180;
        sArr[9] = 29788;
        f8796 = sArr;
    }
}
