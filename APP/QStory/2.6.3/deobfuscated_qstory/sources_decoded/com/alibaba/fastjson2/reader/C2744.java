package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2744 implements Function {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final long[] f8381;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String[] f8382;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Function f8383;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final BiFunction f8384;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Method f8385;

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2744(java.lang.reflect.Method r8, java.lang.String... r9) {
        /*
            r7 = this;
            r7.<init>()
            r7.f8385 = r8
            java.lang.reflect.Parameter[] r0 = r8.getParameters()
            int r1 = r0.length
            java.lang.String[] r1 = new java.lang.String[r1]
            r7.f8382 = r1
            int r1 = r0.length
            long[] r1 = new long[r1]
            r7.f8381 = r1
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
            long[] r3 = r7.f8381
            long r4 = com.alibaba.fastjson2.util.AbstractC2860.m5774(r2)
            r3[r1] = r4
            int r1 = r1 + 1
            goto L14
        L30:
            boolean r9 = com.alibaba.fastjson2.reader.C2776.f8477
            r0 = 0
            if (r9 == 0) goto L4c
            int r9 = r8.getParameterCount()
            r1 = 1
            if (r9 != r1) goto L44
            java.util.function.Function r8 = p293.AbstractC8567.m14139(r8)
            r6 = r0
            r0 = r8
            r8 = r6
            goto L4d
        L44:
            r1 = 2
            if (r9 != r1) goto L4c
            java.util.function.BiFunction r8 = p293.AbstractC8567.m14141(r8)
            goto L4d
        L4c:
            r8 = r0
        L4d:
            r7.f8383 = r0
            r7.f8384 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.C2744.<init>(java.lang.reflect.Method, java.lang.String[]):void");
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Map map = (Map) obj;
        long[] jArr = this.f8381;
        Function function = this.f8383;
        if (function != null) {
            return function.apply(map.get(Long.valueOf(jArr[0])));
        }
        BiFunction biFunction = this.f8384;
        if (biFunction != null) {
            return biFunction.apply(map.get(Long.valueOf(jArr[0])), map.get(Long.valueOf(jArr[1])));
        }
        int length = jArr.length;
        Object[] objArr = new Object[length];
        for (int i = 0; i < length; i++) {
            objArr[i] = map.get(Long.valueOf(jArr[i]));
        }
        try {
            return this.f8385.invoke(null, objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            C0276.m843("invoke factoryMethod error", e);
            return null;
        }
    }
}
