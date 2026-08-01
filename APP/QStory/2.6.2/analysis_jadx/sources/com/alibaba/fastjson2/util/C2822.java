package com.alibaba.fastjson2.util;

import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2822 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        byte[] bArr = (byte[]) obj;
        Class cls = AbstractC2866.f9049;
        char[] cArr = new char[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            cArr[i] = (char) bArr[i];
        }
        return cArr;
    }
}
