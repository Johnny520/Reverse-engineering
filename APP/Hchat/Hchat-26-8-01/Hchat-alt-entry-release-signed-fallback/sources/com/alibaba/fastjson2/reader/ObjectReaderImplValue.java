package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplValue<I, T> implements com.alibaba.fastjson2.reader.ObjectReader<T> {
    final java.lang.reflect.Constructor<T> constructor;
    final java.lang.Object emptyVariantArgs;
    final java.lang.reflect.Method factoryMethod;
    final long features;
    final java.util.function.Function<I, T> function;
    final java.lang.Class<I> valueClass;
    com.alibaba.fastjson2.reader.ObjectReader valueReader;
    final java.lang.reflect.Type valueType;

    public ObjectReaderImplValue(java.lang.Class<T> r1, java.lang.reflect.Type r2, java.lang.Class<I> r3, long r4, java.lang.String r6, java.lang.Object r7, java.lang.reflect.Constructor<T> r8, java.lang.reflect.Method r9, java.util.function.Function<I, T> r10) {
            r0 = this;
            r0.<init>()
            r0.valueType = r2
            r0.valueClass = r3
            r0.features = r4
            r0.constructor = r8
            r0.factoryMethod = r9
            r0.function = r10
            if (r9 == 0) goto L28
            java.lang.Class[] r1 = r9.getParameterTypes()
            int r2 = r1.length
            r3 = 2
            if (r2 != r3) goto L28
            r2 = 1
            r1 = r1[r2]
            java.lang.Class r1 = r1.getComponentType()
            r2 = 0
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            r0.emptyVariantArgs = r1
            return
        L28:
            r1 = 0
            r0.emptyVariantArgs = r1
            return
    }

    public static <I, T> com.alibaba.fastjson2.reader.ObjectReaderImplValue<I, T> of(java.lang.Class<T> r11, java.lang.Class<I> r12, java.lang.reflect.Method r13) {
            com.alibaba.fastjson2.reader.ObjectReaderImplValue r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplValue
            r8 = 0
            r10 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r3 = r12
            r1 = r11
            r2 = r12
            r9 = r13
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r0
    }

    public static <I, T> com.alibaba.fastjson2.reader.ObjectReaderImplValue<I, T> of(java.lang.Class<T> r11, java.lang.Class<I> r12, java.util.function.Function<I, T> r13) {
            com.alibaba.fastjson2.reader.ObjectReaderImplValue r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplValue
            r8 = 0
            r9 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r3 = r12
            r1 = r11
            r2 = r12
            r10 = r13
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(com.alibaba.fastjson2.JSONReader r1, java.lang.reflect.Type r2, java.lang.Object r3, long r4) {
            r0 = this;
            java.lang.Object r1 = r0.readObject(r1, r2, r3, r4)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(com.alibaba.fastjson2.JSONReader r8, java.lang.reflect.Type r9, java.lang.Object r10, long r11) {
            r7 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r7.valueReader
            if (r0 != 0) goto Lc
            java.lang.reflect.Type r0 = r7.valueType
            com.alibaba.fastjson2.reader.ObjectReader r0 = r8.getObjectReader(r0)
            r7.valueReader = r0
        Lc:
            com.alibaba.fastjson2.reader.ObjectReader r1 = r7.valueReader
            long r2 = r7.features
            long r5 = r11 | r2
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.Object r8 = r1.readObject(r2, r3, r4, r5)
            r9 = 0
            if (r8 != 0) goto L1d
            return r9
        L1d:
            java.util.function.Function<I, T> r10 = r7.function
            java.lang.String r11 = "create object error"
            if (r10 == 0) goto L33
            java.lang.Object r8 = r10.apply(r8)     // Catch: java.lang.Exception -> L28
            return r8
        L28:
            r0 = move-exception
            r8 = r0
            java.lang.String r9 = r2.info(r11)
            ah.a.x(r9, r8)
        L31:
            r8 = 0
            return r8
        L33:
            java.lang.reflect.Constructor<T> r10 = r7.constructor
            if (r10 == 0) goto L4a
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Exception -> L40
            java.lang.Object r8 = r10.newInstance(r8)     // Catch: java.lang.Exception -> L40
            return r8
        L40:
            r0 = move-exception
            r8 = r0
            java.lang.String r9 = r2.info(r11)
            ah.a.x(r9, r8)
            goto L31
        L4a:
            java.lang.reflect.Method r10 = r7.factoryMethod
            if (r10 == 0) goto L6f
            java.lang.Object r12 = r7.emptyVariantArgs     // Catch: java.lang.Exception -> L5b
            if (r12 == 0) goto L5e
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r12}     // Catch: java.lang.Exception -> L5b
            java.lang.Object r8 = r10.invoke(r9, r8)     // Catch: java.lang.Exception -> L5b
            return r8
        L5b:
            r0 = move-exception
            r8 = r0
            goto L67
        L5e:
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Exception -> L5b
            java.lang.Object r8 = r10.invoke(r9, r8)     // Catch: java.lang.Exception -> L5b
            return r8
        L67:
            java.lang.String r9 = r2.info(r11)
            ah.a.x(r9, r8)
            goto L31
        L6f:
            java.lang.String r8 = r2.info(r11)
            ah.a.w(r8)
            goto L31
    }
}
