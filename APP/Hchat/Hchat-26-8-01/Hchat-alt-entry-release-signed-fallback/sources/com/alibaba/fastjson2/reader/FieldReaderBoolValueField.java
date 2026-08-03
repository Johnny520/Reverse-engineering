package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderBoolValueField<T> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    public FieldReaderBoolValueField(java.lang.String r13, int r14, long r15, java.lang.String r17, java.lang.Boolean r18, java.lang.reflect.Field r19) {
            r12 = this;
            r8 = 0
            r10 = 0
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r3 = r2
            r0 = r12
            r1 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            r9 = r18
            r11 = r19
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, int r2) {
            r0 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = com.alibaba.fastjson2.util.TypeUtils.toBooleanValue(r2)
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r5, java.lang.Object r6) {
            r4 = this;
            if (r6 != 0) goto L15
            long r0 = r4.features
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreSetNullValue
            long r2 = r6.mask
            long r0 = r0 & r2
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L10
            return
        L10:
            r6 = 0
            r4.accept(r5, r6)
            return
        L15:
            boolean r0 = r6 instanceof java.lang.Boolean
            if (r0 == 0) goto L23
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r4.accept(r5, r6)
            return
        L23:
            java.lang.String r5 = r4.fieldName
            java.lang.String r0 = " error, type not support "
            java.lang.Class r6 = r6.getClass()
            java.lang.String r1 = "set "
            ah.a.m(r1, r5, r0, r6)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r5, boolean r6) {
            r4 = this;
            long r0 = r4.fieldOffset
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto Le
            sun.misc.Unsafe r2 = com.alibaba.fastjson2.util.JDKUtils.UNSAFE
            r2.putBoolean(r5, r0, r6)
            return
        Le:
            java.lang.reflect.Field r0 = r4.field     // Catch: java.lang.Exception -> L14
            r0.setBoolean(r5, r6)     // Catch: java.lang.Exception -> L14
            return
        L14:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r6.<init>(r0)
            java.lang.String r0 = r4.fieldName
            java.lang.String r1 = " error"
            java.lang.String r6 = eh.a.r(r6, r0, r1)
            ah.a.x(r6, r5)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            boolean r1 = r1.readBoolValue()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r4, T r5) {
            r3 = this;
            boolean r0 = r4.readBoolValue()
            java.lang.reflect.Field r1 = r3.field     // Catch: java.lang.Exception -> La
            r1.setBoolean(r5, r0)     // Catch: java.lang.Exception -> La
            return
        La:
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
