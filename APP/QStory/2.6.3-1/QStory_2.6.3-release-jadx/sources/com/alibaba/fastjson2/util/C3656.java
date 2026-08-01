package com.alibaba.fastjson2.util;

import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3656 implements Function {
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        byte[] bArr = (byte[]) obj;
        Class cls = AbstractC3700.f9396;
        char[] cArr = new char[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            cArr[i] = (char) bArr[i];
        }
        return cArr;
    }
}
