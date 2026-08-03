package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderStringMethod<T> extends com.alibaba.fastjson2.reader.FieldReaderObject<T> {
    final boolean trim;
    final boolean upper;

    public FieldReaderStringMethod(java.lang.String r14, java.lang.reflect.Type r15, java.lang.Class r16, int r17, long r18, java.lang.String r20, java.util.Locale r21, java.lang.String r22, java.lang.reflect.Method r23) {
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
            java.lang.String r14 = "trim"
            boolean r14 = r14.equals(r7)
            if (r14 != 0) goto L2d
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.TrimString
            long r14 = r14.mask
            long r14 = r18 & r14
            r1 = 0
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 == 0) goto L2b
            goto L2d
        L2b:
            r14 = 0
            goto L2e
        L2d:
            r14 = 1
        L2e:
            r13.trim = r14
            java.lang.String r14 = "upper"
            boolean r14 = r14.equals(r7)
            r13.upper = r14
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r3, java.lang.Object r4) {
            r2 = this;
            boolean r0 = r4 instanceof java.lang.String
            if (r0 != 0) goto Lc
            if (r4 != 0) goto L7
            goto Lc
        L7:
            java.lang.String r4 = r4.toString()
            goto Le
        Lc:
            java.lang.String r4 = (java.lang.String) r4
        Le:
            if (r4 == 0) goto L20
            boolean r0 = r2.trim
            if (r0 == 0) goto L18
            java.lang.String r4 = r4.trim()
        L18:
            boolean r0 = r2.upper
            if (r0 == 0) goto L20
            java.lang.String r4 = r4.toUpperCase()
        L20:
            java.lang.reflect.Method r0 = r2.method     // Catch: java.lang.Exception -> L2a
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L2a
            r0.invoke(r3, r4)     // Catch: java.lang.Exception -> L2a
            return
        L2a:
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
    public /* bridge */ /* synthetic */ java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            java.lang.String r1 = r0.readFieldValue(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public java.lang.String readFieldValue(com.alibaba.fastjson2.JSONReader r2) {
            r1 = this;
            java.lang.String r2 = r2.readString()
            if (r2 == 0) goto L16
            boolean r0 = r1.trim
            if (r0 == 0) goto Le
            java.lang.String r2 = r2.trim()
        Le:
            boolean r0 = r1.upper
            if (r0 == 0) goto L16
            java.lang.String r2 = r2.toUpperCase()
        L16:
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r4, T r5) {
            r3 = this;
            java.lang.String r0 = r4.readString()
            if (r0 == 0) goto L16
            boolean r1 = r3.trim
            if (r1 == 0) goto Le
            java.lang.String r0 = r0.trim()
        Le:
            boolean r1 = r3.upper
            if (r1 == 0) goto L16
            java.lang.String r0 = r0.toUpperCase()
        L16:
            java.lang.reflect.Method r1 = r3.method     // Catch: java.lang.Exception -> L20
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Exception -> L20
            r1.invoke(r5, r0)     // Catch: java.lang.Exception -> L20
            return
        L20:
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

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean supportAcceptType(java.lang.Class r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}
