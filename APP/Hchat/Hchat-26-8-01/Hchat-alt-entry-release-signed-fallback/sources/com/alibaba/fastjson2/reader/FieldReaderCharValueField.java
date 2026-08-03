package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderCharValueField<T> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    public FieldReaderCharValueField(java.lang.String r13, int r14, long r15, java.lang.String r17, java.lang.Character r18, java.lang.reflect.Field r19) {
            r12 = this;
            r8 = 0
            r10 = 0
            java.lang.Class r2 = java.lang.Character.TYPE
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
    public void accept(T r3, java.lang.Object r4) {
            r2 = this;
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto Lc
            java.lang.String r4 = (java.lang.String) r4
            r0 = 0
            char r4 = r4.charAt(r0)
            goto L16
        Lc:
            boolean r0 = r4 instanceof java.lang.Character
            if (r0 == 0) goto L34
            java.lang.Character r4 = (java.lang.Character) r4
            char r4 = r4.charValue()
        L16:
            java.lang.reflect.Field r0 = r2.field     // Catch: java.lang.Exception -> L20
            java.lang.Character r4 = java.lang.Character.valueOf(r4)     // Catch: java.lang.Exception -> L20
            r0.set(r3, r4)     // Catch: java.lang.Exception -> L20
            return
        L20:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "set "
            r4.<init>(r0)
            java.lang.String r0 = r2.fieldName
            java.lang.String r1 = " error"
            java.lang.String r4 = eh.a.r(r4, r0, r1)
            ah.a.x(r4, r3)
            return
        L34:
            java.lang.String r3 = "cast to char error"
            ah.a.w(r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            char r1 = r1.readCharValue()
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r2, T r3) {
            r1 = this;
            char r0 = r2.readCharValue()
            if (r0 != 0) goto Ld
            boolean r2 = r2.wasNull()
            if (r2 == 0) goto Ld
            return
        Ld:
            r1.accept(r3, r0)
            return
    }
}
