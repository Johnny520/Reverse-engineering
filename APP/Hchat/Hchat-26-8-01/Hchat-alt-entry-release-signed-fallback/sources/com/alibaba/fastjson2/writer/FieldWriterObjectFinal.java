package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldWriterObjectFinal<T> extends com.alibaba.fastjson2.writer.FieldWriterObject<T> {
    final java.lang.Class fieldClass;
    final java.lang.reflect.Type fieldType;
    volatile com.alibaba.fastjson2.writer.ObjectWriter objectWriter;
    final boolean refDetect;

    public FieldWriterObjectFinal(java.lang.String r1, int r2, long r3, java.lang.String r5, java.lang.String r6, java.lang.reflect.Type r7, java.lang.Class r8, java.lang.reflect.Field r9, java.lang.reflect.Method r10) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            r1 = r0
            r1.fieldType = r7
            r1.fieldClass = r8
            boolean r2 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r8)
            r2 = r2 ^ 1
            r1.refDetect = r2
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public com.alibaba.fastjson2.writer.ObjectWriter getObjectWriter(com.alibaba.fastjson2.JSONWriter r2, java.lang.Class r3) {
            r1 = this;
            java.lang.Class r0 = r1.fieldClass
            if (r0 == r3) goto L9
            com.alibaba.fastjson2.writer.ObjectWriter r2 = super.getObjectWriter(r2, r3)
            return r2
        L9:
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r1.objectWriter
            if (r0 == 0) goto L10
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r1.objectWriter
            return r2
        L10:
            com.alibaba.fastjson2.writer.ObjectWriter r2 = super.getObjectWriter(r2, r3)
            r1.objectWriter = r2
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r11, T r12) {
            r10 = this;
            r1 = 0
            java.lang.Object r4 = r10.getFieldValue(r12)     // Catch: java.lang.RuntimeException -> L77
            r12 = 1
            if (r4 != 0) goto L42
            long r2 = r10.features
            long r4 = r11.getFeatures()
            long r2 = r2 | r4
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r4 = r0.mask
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r6 = r0.mask
            long r4 = r4 | r6
            long r2 = r2 & r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L20
            return r1
        L20:
            r10.writeFieldName(r11)
            java.lang.Class r0 = r10.fieldClass
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L2f
            r11.writeArrayNull()
            goto L41
        L2f:
            java.lang.Class r0 = r10.fieldClass
            java.lang.Class<java.lang.StringBuffer> r1 = java.lang.StringBuffer.class
            if (r0 == r1) goto L3e
            java.lang.Class<java.lang.StringBuilder> r1 = java.lang.StringBuilder.class
            if (r0 != r1) goto L3a
            goto L3e
        L3a:
            r11.writeObjectNull(r0)
            goto L41
        L3e:
            r11.writeStringNull()
        L41:
            return r12
        L42:
            java.lang.Class r0 = r10.fieldClass
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r10.getObjectWriter(r11, r0)
            boolean r0 = r10.unwrapped
            if (r0 == 0) goto L5c
            long r5 = r10.features
            boolean r7 = r10.refDetect
            r3 = r11
            r8 = r2
            r2 = r10
            boolean r11 = r2.writeWithUnwrapped(r3, r4, r5, r7, r8)
            r9 = r2
            r2 = r8
            if (r11 == 0) goto L5e
            return r12
        L5c:
            r9 = r10
            r3 = r11
        L5e:
            r10.writeFieldName(r3)
            boolean r11 = r3.jsonb
            java.lang.String r5 = r9.fieldName
            if (r11 == 0) goto L6f
            java.lang.reflect.Type r6 = r9.fieldType
            long r7 = r9.features
            r2.writeJSONB(r3, r4, r5, r6, r7)
            goto L76
        L6f:
            java.lang.reflect.Type r6 = r9.fieldType
            long r7 = r9.features
            r2.write(r3, r4, r5, r6, r7)
        L76:
            return r12
        L77:
            r0 = move-exception
            r9 = r10
            r3 = r11
            r11 = r0
            boolean r12 = r3.isIgnoreErrorGetter()
            if (r12 == 0) goto L82
            return r1
        L82:
            throw r11
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r11, T r12) {
            r10 = this;
            java.lang.Object r2 = r10.getFieldValue(r12)
            if (r2 != 0) goto La
            r11.writeNull()
            return
        La:
            boolean r0 = r10.refDetect
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L18
            boolean r0 = r11.isRefDetect()
            if (r0 == 0) goto L18
            r7 = r3
            goto L19
        L18:
            r7 = r1
        L19:
            if (r7 == 0) goto L32
            if (r2 != r12) goto L23
            java.lang.String r12 = ".."
            r11.writeReference(r12)
            return
        L23:
            java.lang.String r12 = r10.fieldName
            java.lang.String r12 = r11.setPath(r12, r2)
            if (r12 == 0) goto L32
            r11.writeReference(r12)
            r11.popPath(r2)
            return
        L32:
            java.lang.Class r12 = r10.fieldClass
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r10.getObjectWriter(r11, r12)
            long r4 = r10.features
            long r4 = r11.getFeatures(r4)
            com.alibaba.fastjson2.JSONWriter$Feature r12 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray
            long r8 = r12.mask
            long r4 = r4 & r8
            r8 = 0
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 == 0) goto L4a
            r1 = r3
        L4a:
            boolean r12 = r11.jsonb
            if (r12 == 0) goto L64
            java.lang.String r3 = r10.fieldName
            if (r1 == 0) goto L5b
            java.lang.reflect.Type r4 = r10.fieldType
            long r5 = r10.features
            r1 = r11
            r0.writeArrayMappingJSONB(r1, r2, r3, r4, r5)
            goto L79
        L5b:
            r1 = r11
            java.lang.reflect.Type r4 = r10.fieldType
            long r5 = r10.features
            r0.writeJSONB(r1, r2, r3, r4, r5)
            goto L79
        L64:
            java.lang.String r3 = r10.fieldName
            if (r1 == 0) goto L71
            java.lang.reflect.Type r4 = r10.fieldType
            long r5 = r10.features
            r1 = r11
            r0.writeArrayMapping(r1, r2, r3, r4, r5)
            goto L79
        L71:
            r1 = r11
            java.lang.reflect.Type r4 = r10.fieldType
            long r5 = r10.features
            r0.write(r1, r2, r3, r4, r5)
        L79:
            if (r7 == 0) goto L7e
            r1.popPath(r2)
        L7e:
            return
    }
}
