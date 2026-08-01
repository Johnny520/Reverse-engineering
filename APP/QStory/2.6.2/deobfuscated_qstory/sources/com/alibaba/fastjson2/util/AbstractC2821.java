package com.alibaba.fastjson2.util;

import net.bytebuddy.asm.Advice;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2821 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final int[] f8784;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f8785;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final int f8786;

    static {
        char[] cArr = {'\\', 'u', '0', '0'};
        Unsafe unsafe = AbstractC2853.f8919;
        long j = AbstractC2853.f8918;
        f8786 = unsafe.getInt(cArr, j);
        f8785 = unsafe.getLong(cArr, j);
        char[] cArr2 = {'\\', '\\', '\n', 'n', '\r', Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName.SYMBOL, '\f', 'f', '\b', 'b', '\t', Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL};
        char[] cArr3 = {'\\', 0};
        int[] iArr = new int[128];
        for (int i = 0; i < 12; i += 2) {
            cArr3[1] = cArr2[i + 1];
            iArr[cArr2[i]] = AbstractC2848.m5681(cArr3);
        }
        f8784 = iArr;
    }
}
