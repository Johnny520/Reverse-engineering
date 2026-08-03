package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderBigDecimalFunc<T, V> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    final java.util.function.BiConsumer<T, V> function;

    public FieldReaderBigDecimalFunc(java.lang.String r13, java.lang.Class<V> r14, int r15, long r16, java.lang.String r18, java.util.Locale r19, java.lang.Object r20, java.lang.reflect.Method r21, java.util.function.BiConsumer<T, V> r22) {
            r12 = this;
            r11 = 0
            r3 = r14
            r0 = r12
            r1 = r13
            r2 = r14
            r4 = r15
            r5 = r16
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            r13 = r22
            r12.function = r13
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r4, int r5) {
            r3 = this;
            java.util.function.BiConsumer<T, V> r0 = r3.function     // Catch: java.lang.Exception -> Lb
            long r1 = (long) r5     // Catch: java.lang.Exception -> Lb
            java.math.BigDecimal r5 = java.math.BigDecimal.valueOf(r1)     // Catch: java.lang.Exception -> Lb
            r0.accept(r4, r5)     // Catch: java.lang.Exception -> Lb
            return
        Lb:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r5.<init>(r0)
            java.lang.String r0 = super.toString()
            java.lang.String r1 = " error"
            java.lang.String r5 = eh.a.r(r5, r0, r1)
            ah.a.x(r5, r4)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r2, long r3) {
            r1 = this;
            java.util.function.BiConsumer<T, V> r0 = r1.function     // Catch: java.lang.Exception -> La
            java.math.BigDecimal r3 = java.math.BigDecimal.valueOf(r3)     // Catch: java.lang.Exception -> La
            r0.accept(r2, r3)     // Catch: java.lang.Exception -> La
            return
        La:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "set "
            r3.<init>(r4)
            java.lang.String r4 = super.toString()
            java.lang.String r0 = " error"
            java.lang.String r3 = eh.a.r(r3, r4, r0)
            ah.a.x(r3, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r3, java.lang.Object r4) {
            r2 = this;
            java.math.BigDecimal r4 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r4)
            java.util.function.BiConsumer<T, V> r0 = r2.function     // Catch: java.lang.Exception -> La
            r0.accept(r3, r4)     // Catch: java.lang.Exception -> La
            return
        La:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r4.<init>(r0)
            java.lang.String r0 = super.toString()
            java.lang.String r1 = " error"
            java.lang.String r4 = eh.a.r(r4, r0, r1)
            ah.a.x(r4, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            java.math.BigDecimal r1 = r1.readBigDecimal()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r6, T r7) {
            r5 = this;
            java.math.BigDecimal r6 = r6.readBigDecimal()     // Catch: java.lang.Exception -> L5
            goto L18
        L5:
            r0 = move-exception
            long r1 = r5.features
            long r1 = r6.features(r1)
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.NullOnError
            long r3 = r6.mask
            long r1 = r1 & r3
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L1e
            r6 = 0
        L18:
            java.util.function.BiConsumer<T, V> r0 = r5.function
            r0.accept(r7, r6)
            return
        L1e:
            throw r0
    }
}
