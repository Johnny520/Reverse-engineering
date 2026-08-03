package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderCharValueFunc<T> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    final com.alibaba.fastjson2.function.ObjCharConsumer<T> function;

    public FieldReaderCharValueFunc(java.lang.String r13, int r14, java.lang.String r15, java.lang.Character r16, java.lang.reflect.Method r17, com.alibaba.fastjson2.function.ObjCharConsumer<T> r18) {
            r12 = this;
            r8 = 0
            r11 = 0
            java.lang.Class r2 = java.lang.Character.TYPE
            r5 = 0
            r3 = r2
            r0 = r12
            r1 = r13
            r4 = r14
            r7 = r15
            r9 = r16
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            r13 = r18
            r12.function = r13
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r2, char r3) {
            r1 = this;
            com.alibaba.fastjson2.function.ObjCharConsumer<T> r0 = r1.function
            r0.accept(r2, r3)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto Lc
            java.lang.String r3 = (java.lang.String) r3
            r0 = 0
            char r3 = r3.charAt(r0)
            goto L16
        Lc:
            boolean r0 = r3 instanceof java.lang.Character
            if (r0 == 0) goto L1a
            java.lang.Character r3 = (java.lang.Character) r3
            char r3 = r3.charValue()
        L16:
            r1.accept(r2, r3)
            return
        L1a:
            java.lang.String r2 = "cast to char error"
            ah.a.w(r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public /* bridge */ /* synthetic */ java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            java.lang.String r1 = r0.readFieldValue(r1)
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public java.lang.String readFieldValue(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            java.lang.String r1 = r1.readString()
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
            com.alibaba.fastjson2.function.ObjCharConsumer<T> r2 = r1.function
            r2.accept(r3, r0)
            return
    }
}
