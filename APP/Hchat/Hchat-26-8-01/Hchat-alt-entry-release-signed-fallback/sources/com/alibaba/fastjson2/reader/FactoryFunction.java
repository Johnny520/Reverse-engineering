package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FactoryFunction<T> implements java.util.function.Function<java.util.Map<java.lang.Long, java.lang.Object>, T> {
    final java.util.function.BiFunction biFunction;
    final java.lang.reflect.Method factoryMethod;
    final java.util.function.Function function;
    final long[] hashCodes;
    final java.lang.String[] paramNames;

    public FactoryFunction(java.lang.reflect.Method r5, java.lang.String... r6) {
            r4 = this;
            r4.<init>()
            r4.factoryMethod = r5
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r0 = r5.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r4.paramNames = r0
            int r0 = r5.length
            long[] r0 = new long[r0]
            r4.hashCodes = r0
            r0 = 0
        L14:
            int r1 = r5.length
            r2 = 0
            if (r0 >= r1) goto L32
            int r1 = r6.length
            if (r0 >= r1) goto L1d
            r2 = r6[r0]
        L1d:
            if (r2 != 0) goto L25
            java.lang.String r1 = "arg"
            java.lang.String r2 = eh.a.l(r0, r1)
        L25:
            r6[r0] = r2
            long[] r1 = r4.hashCodes
            long r2 = com.alibaba.fastjson2.util.Fnv.hashCode64(r2)
            r1[r0] = r2
            int r0 = r0 + 1
            goto L14
        L32:
            r4.function = r2
            r4.biFunction = r2
            return
    }

    @Override // java.util.function.Function
    public /* bridge */ /* synthetic */ java.lang.Object apply(java.util.Map<java.lang.Long, java.lang.Object> r1) {
            r0 = this;
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r0.apply2(r1)
            return r1
    }

    /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
    public T apply2(java.util.Map<java.lang.Long, java.lang.Object> r7) {
            r6 = this;
            java.util.function.Function r0 = r6.function
            r1 = 0
            if (r0 == 0) goto L18
            long[] r0 = r6.hashCodes
            r1 = r0[r1]
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            java.lang.Object r7 = r7.get(r0)
            java.util.function.Function r0 = r6.function
            java.lang.Object r7 = r0.apply(r7)
            return r7
        L18:
            java.util.function.BiFunction r0 = r6.biFunction
            long[] r2 = r6.hashCodes
            if (r0 == 0) goto L3c
            r0 = r2[r1]
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r7.get(r0)
            long[] r1 = r6.hashCodes
            r2 = 1
            r2 = r1[r2]
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.Object r7 = r7.get(r1)
            java.util.function.BiFunction r1 = r6.biFunction
            java.lang.Object r7 = r1.apply(r0, r7)
            return r7
        L3c:
            int r0 = r2.length
            java.lang.Object[] r2 = new java.lang.Object[r0]
        L3f:
            if (r1 >= r0) goto L52
            long[] r3 = r6.hashCodes
            r4 = r3[r1]
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            java.lang.Object r3 = r7.get(r3)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L3f
        L52:
            java.lang.reflect.Method r7 = r6.factoryMethod     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.reflect.InvocationTargetException -> L5c java.lang.IllegalAccessException -> L5e
            r0 = 0
            java.lang.Object r7 = r7.invoke(r0, r2)     // Catch: java.lang.IllegalArgumentException -> L5a java.lang.reflect.InvocationTargetException -> L5c java.lang.IllegalAccessException -> L5e
            return r7
        L5a:
            r7 = move-exception
            goto L5f
        L5c:
            r7 = move-exception
            goto L5f
        L5e:
            r7 = move-exception
        L5f:
            java.lang.String r0 = "invoke factoryMethod error"
            ah.a.x(r0, r7)
            r7 = 0
            return r7
    }
}
