package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FieldReaderAtomicReference<T> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    final java.lang.reflect.Type referenceType;

    public FieldReaderAtomicReference(java.lang.String r13, java.lang.reflect.Type r14, java.lang.Class r15, int r16, long r17, java.lang.String r19, java.lang.reflect.Method r20, java.lang.reflect.Field r21) {
            r12 = this;
            r8 = 0
            r9 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r7 = r19
            r10 = r20
            r11 = r21
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            boolean r13 = r14 instanceof java.lang.reflect.ParameterizedType
            if (r13 == 0) goto L25
            java.lang.reflect.ParameterizedType r14 = (java.lang.reflect.ParameterizedType) r14
            java.lang.reflect.Type[] r13 = r14.getActualTypeArguments()
            int r14 = r13.length
            r15 = 1
            if (r14 != r15) goto L25
            r14 = 0
            r13 = r13[r14]
            goto L26
        L25:
            r13 = 0
        L26:
            r12.referenceType = r13
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r2) {
            r1 = this;
            java.lang.reflect.Type r0 = r1.referenceType
            java.lang.Object r2 = r2.read(r0)
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r2, T r3) {
            r1 = this;
            boolean r0 = r2.nextIfNull()
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.reflect.Type r0 = r1.referenceType
            java.lang.Object r2 = r2.read(r0)
            r1.accept(r3, r2)
            return
    }
}
