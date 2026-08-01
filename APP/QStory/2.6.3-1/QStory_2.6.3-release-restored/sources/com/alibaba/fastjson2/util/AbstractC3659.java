package com.alibaba.fastjson2.util;

import java.nio.charset.StandardCharsets;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3659 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final short[] f9143;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final int f9144;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final short f9145;

    static {
        byte[] bytes = "\\u00".getBytes(StandardCharsets.UTF_8);
        Unsafe unsafe = AbstractC3687.f9266;
        long j = AbstractC3687.f9265;
        f9145 = unsafe.getShort(bytes, j);
        f9144 = unsafe.getInt(bytes, j);
        short[] sArr = new short[128];
        sArr[92] = 23644;
        sArr[10] = 28252;
        sArr[13] = 29276;
        sArr[12] = 26204;
        sArr[8] = 25180;
        sArr[9] = 29788;
        f9143 = sArr;
    }
}
