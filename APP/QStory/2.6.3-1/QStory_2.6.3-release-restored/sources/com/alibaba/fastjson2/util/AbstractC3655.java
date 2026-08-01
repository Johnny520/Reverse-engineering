package com.alibaba.fastjson2.util;

import net.bytebuddy.asm.Advice;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3655 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int[] f9131;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f9132;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int f9133;

    static {
        char[] cArr = {'\\', 'u', '0', '0'};
        Unsafe unsafe = AbstractC3687.f9266;
        long j = AbstractC3687.f9265;
        f9133 = unsafe.getInt(cArr, j);
        f9132 = unsafe.getLong(cArr, j);
        char[] cArr2 = {'\\', '\\', '\n', 'n', '\r', Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName.SYMBOL, '\f', 'f', '\b', 'b', '\t', Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL};
        char[] cArr3 = {'\\', 0};
        int[] iArr = new int[128];
        for (int i = 0; i < 12; i += 2) {
            cArr3[1] = cArr2[i + 1];
            iArr[cArr2[i]] = AbstractC3682.m6286(cArr3);
        }
        f9131 = iArr;
    }
}
