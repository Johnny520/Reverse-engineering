package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderInt16ValueMethod<T> extends com.alibaba.fastjson2.reader.FieldReaderObject<T> {
    public FieldReaderInt16ValueMethod(java.lang.String r14, java.lang.reflect.Type r15, java.lang.Class r16, int r17, long r18, java.lang.String r20, java.util.Locale r21, java.lang.Short r22, java.lang.reflect.Method r23) {
            r13 = this;
            r11 = 0
            r12 = 0
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
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r3, java.lang.Object r4) {
            r2 = this;
            short r4 = com.alibaba.fastjson2.util.TypeUtils.toShortValue(r4)
            java.lang.reflect.Method r0 = r2.method     // Catch: java.lang.Exception -> L12
            java.lang.Short r4 = java.lang.Short.valueOf(r4)     // Catch: java.lang.Exception -> L12
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L12
            r0.invoke(r3, r4)     // Catch: java.lang.Exception -> L12
            return
        L12:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r4.<init>(r0)
            java.lang.String r0 = r2.fieldName
            java.lang.String r1 = " error"
            java.lang.String r4 = eh.a.r(r4, r0, r1)
            ah.a.x(r4, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            int r1 = r1.readInt32Value()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r4, T r5) {
            r3 = this;
            int r0 = r4.readInt32Value()
            java.lang.reflect.Method r1 = r3.method     // Catch: java.lang.Exception -> L13
            short r0 = (short) r0     // Catch: java.lang.Exception -> L13
            java.lang.Short r0 = java.lang.Short.valueOf(r0)     // Catch: java.lang.Exception -> L13
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> L13
            r1.invoke(r5, r0)     // Catch: java.lang.Exception -> L13
            return
        L13:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "set "
            r0.<init>(r1)
            java.lang.String r1 = r3.fieldName
            java.lang.String r2 = " error"
            java.lang.String r4 = bc.e.m(r0, r1, r2, r4)
            ah.a.x(r4, r5)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValueJSONB(com.alibaba.fastjson2.JSONReader r4, T r5) {
            r3 = this;
            int r0 = r4.readInt32Value()
            java.lang.reflect.Method r1 = r3.method     // Catch: java.lang.Exception -> L13
            short r0 = (short) r0     // Catch: java.lang.Exception -> L13
            java.lang.Short r0 = java.lang.Short.valueOf(r0)     // Catch: java.lang.Exception -> L13
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> L13
            r1.invoke(r5, r0)     // Catch: java.lang.Exception -> L13
            return
        L13:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "set "
            r0.<init>(r1)
            java.lang.String r1 = r3.fieldName
            java.lang.String r2 = " error"
            java.lang.String r4 = bc.e.m(r0, r1, r2, r4)
            ah.a.x(r4, r5)
            return
    }
}
