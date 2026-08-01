package com.alibaba.fastjson2.util;

import net.bytebuddy.asm.Advice;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2822 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int[] f8786;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f8787;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int f8788;

    static {
        char[] cArr = {'\\', 'u', '0', '0'};
        Unsafe unsafe = AbstractC2854.f8921;
        long j = AbstractC2854.f8920;
        f8788 = unsafe.getInt(cArr, j);
        f8787 = unsafe.getLong(cArr, j);
        char[] cArr2 = {'\\', '\\', '\n', 'n', '\r', Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName.SYMBOL, '\f', 'f', '\b', 'b', '\t', Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL};
        char[] cArr3 = {'\\', 0};
        int[] iArr = new int[128];
        for (int i = 0; i < 12; i += 2) {
            cArr3[1] = cArr2[i + 1];
            iArr[cArr2[i]] = AbstractC2849.m5726(cArr3);
        }
        f8786 = iArr;
    }
}
