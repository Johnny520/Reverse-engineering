package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2743 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long[] f8379;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String[] f8380;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Function f8381;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final BiFunction f8382;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Method f8383;

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2743(java.lang.reflect.Method r8, java.lang.String... r9) {
        /*
            r7 = this;
            r7.<init>()
            r7.f8383 = r8
            java.lang.reflect.Parameter[] r0 = r8.getParameters()
            int r1 = r0.length
            java.lang.String[] r1 = new java.lang.String[r1]
            r7.f8380 = r1
            int r1 = r0.length
            long[] r1 = new long[r1]
            r7.f8379 = r1
            r1 = 0
        L14:
            int r2 = r0.length
            if (r1 >= r2) goto L30
            int r2 = r9.length
            if (r1 >= r2) goto L1d
            r2 = r9[r1]
            goto L23
        L1d:
            r2 = r0[r1]
            java.lang.String r2 = r2.getName()
        L23:
            r9[r1] = r2
            long[] r3 = r7.f8379
            long r4 = com.alibaba.fastjson2.util.AbstractC2859.m5729(r2)
            r3[r1] = r4
            int r1 = r1 + 1
            goto L14
        L30:
            boolean r9 = com.alibaba.fastjson2.reader.C2775.f8475
            r0 = 0
            if (r9 == 0) goto L4c
            int r9 = r8.getParameterCount()
            r1 = 1
            if (r9 != r1) goto L44
            java.util.function.Function r8 = p293.AbstractC8575.m14120(r8)
            r6 = r0
            r0 = r8
            r8 = r6
            goto L4d
        L44:
            r1 = 2
            if (r9 != r1) goto L4c
            java.util.function.BiFunction r8 = p293.AbstractC8575.m14122(r8)
            goto L4d
        L4c:
            r8 = r0
        L4d:
            r7.f8381 = r0
            r7.f8382 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2743.<init>(java.lang.reflect.Method, java.lang.String[]):void");
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        long[] jArr = this.f8379;
        Function function = this.f8381;
        if (function != null) {
            return function.apply(map.get(Long.valueOf(jArr[0])));
        }
        BiFunction biFunction = this.f8382;
        if (biFunction != null) {
            return biFunction.apply(map.get(Long.valueOf(jArr[0])), map.get(Long.valueOf(jArr[1])));
        }
        int length = jArr.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            objArr[i] = map.get(Long.valueOf(jArr[i]));
        }
        try {
            return this.f8383.invoke(null, objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            C0276.m842("invoke factoryMethod error", e);
            return null;
        }
    }
}
