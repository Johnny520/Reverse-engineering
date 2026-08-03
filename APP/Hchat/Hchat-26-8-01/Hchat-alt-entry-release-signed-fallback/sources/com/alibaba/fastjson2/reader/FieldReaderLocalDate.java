package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderLocalDate extends com.alibaba.fastjson2.reader.FieldReaderObject {
    public FieldReaderLocalDate(java.lang.String r1, java.lang.reflect.Type r2, java.lang.Class r3, int r4, long r5, java.lang.String r7, java.util.Locale r8, java.lang.Object r9, java.lang.reflect.Method r10, java.lang.reflect.Field r11, java.util.function.BiConsumer r12) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            r1 = r0
            com.alibaba.fastjson2.reader.ObjectReaderImplLocalDate r2 = com.alibaba.fastjson2.reader.ObjectReaderImplLocalDate.of(r7, r8)
            r1.initReader = r2
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public com.alibaba.fastjson2.reader.ObjectReader getObjectReader(com.alibaba.fastjson2.JSONReader.Context r1) {
            r0 = this;
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.initReader
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public com.alibaba.fastjson2.reader.ObjectReader getObjectReader(com.alibaba.fastjson2.JSONReader r1) {
            r0 = this;
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.initReader
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r8, java.lang.Object r9) {
            r7 = this;
            boolean r0 = r8.jsonb
            if (r0 == 0) goto L14
            com.alibaba.fastjson2.reader.ObjectReader r1 = r7.initReader
            java.lang.reflect.Type r3 = r7.fieldType
            java.lang.String r4 = r7.fieldName
            long r5 = r7.features
            r2 = r8
            java.lang.Object r8 = r1.readJSONBObject(r2, r3, r4, r5)
            java.time.LocalDate r8 = (java.time.LocalDate) r8
            goto L2c
        L14:
            r1 = r8
            java.lang.String r8 = r7.format
            if (r8 == 0) goto L28
            com.alibaba.fastjson2.reader.ObjectReader r0 = r7.initReader
            java.lang.reflect.Type r2 = r7.fieldType
            java.lang.String r3 = r7.fieldName
            long r4 = r7.features
            java.lang.Object r8 = r0.readObject(r1, r2, r3, r4)
            java.time.LocalDate r8 = (java.time.LocalDate) r8
            goto L2c
        L28:
            java.time.LocalDate r8 = r1.readLocalDate()
        L2c:
            r7.accept(r9, r8)
            return
    }
}
