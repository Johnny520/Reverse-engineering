package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderInt64ValueArrayFinalField<T> extends com.alibaba.fastjson2.reader.FieldReaderObjectField<T> {
    public FieldReaderInt64ValueArrayFinalField(java.lang.String r11, java.lang.Class r12, int r13, long r14, java.lang.String r16, long[] r17, java.lang.reflect.Field r18) {
            r10 = this;
            r3 = r12
            r0 = r10
            r1 = r11
            r2 = r12
            r4 = r13
            r5 = r14
            r7 = r16
            r8 = r17
            r9 = r18
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r5, T r6) {
            r4 = this;
            boolean r0 = r5.readIfNull()
            if (r0 == 0) goto L7
            goto L2b
        L7:
            java.lang.reflect.Field r0 = r4.field     // Catch: java.lang.Exception -> L2c
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Exception -> L2c
            long[] r6 = (long[]) r6     // Catch: java.lang.Exception -> L2c
            boolean r0 = r5.nextIfArrayStart()
            if (r0 == 0) goto L2b
            r0 = 0
        L16:
            boolean r1 = r5.nextIfArrayEnd()
            if (r1 == 0) goto L1d
            goto L2b
        L1d:
            long r1 = r5.readInt64Value()
            if (r6 == 0) goto L28
            int r3 = r6.length
            if (r0 >= r3) goto L28
            r6[r0] = r1
        L28:
            int r0 = r0 + 1
            goto L16
        L2b:
            return
        L2c:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "set "
            r0.<init>(r1)
            java.lang.String r1 = r4.fieldName
            java.lang.String r2 = " error"
            java.lang.String r5 = bc.e.m(r0, r1, r2, r5)
            ah.a.x(r5, r6)
            return
    }
}
