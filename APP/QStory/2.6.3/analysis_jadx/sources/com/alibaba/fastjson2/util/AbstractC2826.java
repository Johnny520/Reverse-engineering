package com.alibaba.fastjson2.util;

import java.nio.charset.StandardCharsets;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2826 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final short[] f8798;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int f8799;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final short f8800;

    static {
        byte[] bytes = "\\u00".getBytes(StandardCharsets.UTF_8);
        Unsafe unsafe = AbstractC2854.f8921;
        long j = AbstractC2854.f8920;
        f8800 = unsafe.getShort(bytes, j);
        f8799 = unsafe.getInt(bytes, j);
        short[] sArr = new short[128];
        sArr[92] = 23644;
        sArr[10] = 28252;
        sArr[13] = 29276;
        sArr[12] = 26204;
        sArr[8] = 25180;
        sArr[9] = 29788;
        f8798 = sArr;
    }
}
