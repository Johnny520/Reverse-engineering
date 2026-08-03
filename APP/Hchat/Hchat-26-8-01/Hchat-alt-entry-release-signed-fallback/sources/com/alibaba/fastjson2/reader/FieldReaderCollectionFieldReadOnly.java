package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderCollectionFieldReadOnly<T> extends com.alibaba.fastjson2.reader.FieldReaderObjectField<T> {
    public FieldReaderCollectionFieldReadOnly(java.lang.String r11, java.lang.reflect.Type r12, java.lang.Class r13, int r14, long r15, java.lang.String r17, java.lang.reflect.Field r18) {
            r10 = this;
            r8 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            r9 = r18
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObjectField, com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r3, java.lang.Object r4) {
            r2 = this;
            if (r4 != 0) goto L3
            goto L42
        L3:
            java.lang.reflect.Field r0 = r2.field     // Catch: java.lang.Exception -> L43
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Exception -> L43
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Exception -> L43
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            if (r3 == r0) goto L42
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            if (r3 == r0) goto L42
            if (r3 == 0) goto L42
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L1c
            goto L42
        L1c:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "java.util.Collections$UnmodifiableRandomAccessList"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L42
            java.lang.String r1 = "java.util.Arrays$ArrayList"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L42
            java.lang.String r1 = "java.util.Collections$SingletonList"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3d
            goto L42
        L3d:
            java.util.Collection r4 = (java.util.Collection) r4
            r3.addAll(r4)
        L42:
            return
        L43:
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

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r8, T r9) {
            r7 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r7.initReader
            if (r0 != 0) goto Le
            com.alibaba.fastjson2.JSONReader$Context r0 = r8.context
            java.lang.reflect.Type r1 = r7.fieldType
            com.alibaba.fastjson2.reader.ObjectReader r0 = r0.getObjectReader(r1)
            r7.initReader = r0
        Le:
            com.alibaba.fastjson2.reader.ObjectReader r1 = r7.initReader
            java.lang.reflect.Type r3 = r7.fieldType
            java.lang.String r4 = r7.fieldName
            r5 = 0
            r2 = r8
            java.lang.Object r8 = r1.readObject(r2, r3, r4, r5)
            r7.accept(r9, r8)
            return
    }
}
