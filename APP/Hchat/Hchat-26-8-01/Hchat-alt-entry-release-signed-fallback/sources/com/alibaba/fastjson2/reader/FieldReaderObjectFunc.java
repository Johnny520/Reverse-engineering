package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderObjectFunc<T, V> extends com.alibaba.fastjson2.reader.FieldReaderObject<T> {
    public FieldReaderObjectFunc(java.lang.String r14, java.lang.reflect.Type r15, java.lang.Class<V> r16, int r17, long r18, java.lang.String r20, java.util.Locale r21, java.lang.Object r22, java.lang.reflect.Method r23, java.util.function.BiConsumer<T, V> r24, com.alibaba.fastjson2.reader.ObjectReader r25) {
            r13 = this;
            r11 = 0
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r12 = r24
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            r14 = r25
            r13.initReader = r14
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r3, java.lang.Object r4) {
            r2 = this;
            java.lang.reflect.Type r0 = r2.fieldType
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r0 != r1) goto Lb
            java.lang.Float r4 = com.alibaba.fastjson2.util.TypeUtils.toFloat(r4)
            goto L13
        Lb:
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r0 != r1) goto L13
            java.lang.Double r4 = com.alibaba.fastjson2.util.TypeUtils.toDouble(r4)
        L13:
            if (r4 != 0) goto L1c
            java.lang.Class r0 = r2.fieldClass
            java.lang.Class<java.lang.StackTraceElement[]> r1 = java.lang.StackTraceElement[].class
            if (r0 != r1) goto L1c
            return
        L1c:
            java.util.function.BiConsumer r0 = r2.function
            r0.accept(r3, r4)
            return
    }
}
