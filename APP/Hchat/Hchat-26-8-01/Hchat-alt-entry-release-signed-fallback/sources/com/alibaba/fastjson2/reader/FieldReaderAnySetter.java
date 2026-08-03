package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderAnySetter<T> extends com.alibaba.fastjson2.reader.FieldReaderObject<T> {
    public FieldReaderAnySetter(java.lang.reflect.Type r14, java.lang.Class r15, int r16, long r17, java.lang.String r19, java.lang.reflect.Method r20) {
            r13 = this;
            r11 = 0
            r12 = 0
            java.lang.String r1 = "$$any$$"
            r8 = 0
            r9 = 0
            r0 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r7 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void acceptExtra(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            r1 = this;
            java.lang.reflect.Method r0 = r1.method     // Catch: java.lang.Exception -> La
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}     // Catch: java.lang.Exception -> La
            r0.invoke(r2, r3)     // Catch: java.lang.Exception -> La
            return
        La:
            java.lang.String r2 = "any set error"
            ah.a.w(r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public com.alibaba.fastjson2.reader.ObjectReader getItemObjectReader(com.alibaba.fastjson2.JSONReader r2) {
            r1 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r1.itemReader
            if (r0 == 0) goto L7
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.itemReader
            return r2
        L7:
            java.lang.reflect.Type r0 = r1.fieldType
            com.alibaba.fastjson2.reader.ObjectReader r2 = r2.getObjectReader(r0)
            r1.itemReader = r2
            return r2
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void processExtra(com.alibaba.fastjson2.JSONReader r8, java.lang.Object r9) {
            r7 = this;
            java.lang.String r0 = r8.getFieldName()
            com.alibaba.fastjson2.reader.ObjectReader r1 = r7.getItemObjectReader(r8)
            java.lang.reflect.Type r3 = r7.fieldType
            java.lang.String r4 = r7.fieldName
            r5 = 0
            r2 = r8
            java.lang.Object r8 = r1.readObject(r2, r3, r4, r5)
            java.lang.reflect.Method r1 = r7.method     // Catch: java.lang.Exception -> L1d
            java.lang.Object[] r8 = new java.lang.Object[]{r0, r8}     // Catch: java.lang.Exception -> L1d
            r1.invoke(r9, r8)     // Catch: java.lang.Exception -> L1d
            return
        L1d:
            r0 = move-exception
            r8 = r0
            java.lang.String r9 = "any set error"
            java.lang.String r9 = r2.info(r9)
            ah.a.x(r9, r8)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r1, T r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
