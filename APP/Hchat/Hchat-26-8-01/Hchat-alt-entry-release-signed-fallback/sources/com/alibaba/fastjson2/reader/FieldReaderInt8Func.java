package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderInt8Func<T, V> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    final java.util.function.BiConsumer<T, V> function;

    public FieldReaderInt8Func(java.lang.String r13, java.lang.Class<V> r14, int r15, long r16, java.lang.String r18, java.util.Locale r19, java.lang.Object r20, java.lang.reflect.Method r21, java.util.function.BiConsumer<T, V> r22) {
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
    public void accept(T r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Byte r3 = com.alibaba.fastjson2.util.TypeUtils.toByte(r3)
            java.util.function.BiConsumer<T, V> r0 = r1.function
            r0.accept(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            java.lang.Integer r1 = r1.readInt32()
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r7, T r8) {
            r6 = this;
            r0 = 0
            java.lang.Integer r1 = r7.readInt32()     // Catch: java.lang.Exception -> L11
            if (r1 != 0) goto L8
            goto L23
        L8:
            byte r1 = r1.byteValue()     // Catch: java.lang.Exception -> L11
            java.lang.Byte r0 = java.lang.Byte.valueOf(r1)     // Catch: java.lang.Exception -> L11
            goto L23
        L11:
            r1 = move-exception
            long r2 = r6.features
            long r2 = r7.features(r2)
            com.alibaba.fastjson2.JSONReader$Feature r7 = com.alibaba.fastjson2.JSONReader.Feature.NullOnError
            long r4 = r7.mask
            long r2 = r2 & r4
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L29
        L23:
            java.util.function.BiConsumer<T, V> r7 = r6.function
            r7.accept(r8, r0)
            return
        L29:
            throw r1
    }
}
