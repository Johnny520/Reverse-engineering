package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterObjectArrayField<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    final java.lang.Class itemClass;
    com.alibaba.fastjson2.writer.ObjectWriter itemObjectWriter;
    final java.lang.reflect.Type itemType;

    public FieldWriterObjectArrayField(java.lang.String r12, java.lang.reflect.Type r13, int r14, long r15, java.lang.String r17, java.lang.String r18, java.lang.reflect.Type r19, java.lang.Class r20, java.lang.reflect.Field r21) {
            r11 = this;
            r10 = 0
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r15
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            r11.itemType = r13
            boolean r12 = r13 instanceof java.lang.Class
            if (r12 == 0) goto L1d
            java.lang.Class r13 = (java.lang.Class) r13
            r11.itemClass = r13
            return
        L1d:
            java.lang.Class r12 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r13)
            r11.itemClass = r12
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public com.alibaba.fastjson2.writer.ObjectWriter getItemWriter(com.alibaba.fastjson2.JSONWriter r2, java.lang.reflect.Type r3) {
            r1 = this;
            if (r3 == 0) goto L10
            java.lang.reflect.Type r0 = r1.itemType
            if (r3 != r0) goto L7
            goto L10
        L7:
            java.lang.Class r0 = com.alibaba.fastjson2.util.TypeUtils.getClass(r3)
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r2.getObjectWriter(r3, r0)
            return r2
        L10:
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r1.itemObjectWriter
            if (r0 == 0) goto L15
            return r0
        L15:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r3 != r0) goto L28
            com.alibaba.fastjson2.writer.ObjectWriterImplDouble r2 = new com.alibaba.fastjson2.writer.ObjectWriterImplDouble
            java.text.DecimalFormat r3 = new java.text.DecimalFormat
            java.lang.String r0 = r1.format
            r3.<init>(r0)
            r2.<init>(r3)
            r1.itemObjectWriter = r2
            goto L58
        L28:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r3 != r0) goto L3b
            com.alibaba.fastjson2.writer.ObjectWriterImplFloat r2 = new com.alibaba.fastjson2.writer.ObjectWriterImplFloat
            java.text.DecimalFormat r3 = new java.text.DecimalFormat
            java.lang.String r0 = r1.format
            r3.<init>(r0)
            r2.<init>(r3)
            r1.itemObjectWriter = r2
            goto L58
        L3b:
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            if (r3 != r0) goto L4e
            java.text.DecimalFormat r3 = r1.decimalFormat
            if (r3 == 0) goto L4e
            com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal r2 = new com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal
            java.text.DecimalFormat r3 = r1.decimalFormat
            r0 = 0
            r2.<init>(r3, r0)
            r1.itemObjectWriter = r2
            goto L58
        L4e:
            java.lang.reflect.Type r3 = r1.itemType
            java.lang.Class r0 = r1.itemClass
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r2.getObjectWriter(r3, r0)
            r1.itemObjectWriter = r2
        L58:
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r1.itemObjectWriter
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public com.alibaba.fastjson2.writer.ObjectWriter getObjectWriter(com.alibaba.fastjson2.JSONWriter r2, java.lang.Class r3) {
            r1 = this;
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            if (r3 != r0) goto L7
            com.alibaba.fastjson2.writer.ObjectWriterImplStringArray r2 = com.alibaba.fastjson2.writer.ObjectWriterImplStringArray.INSTANCE
            return r2
        L7:
            java.lang.Class<java.lang.Float[]> r0 = java.lang.Float[].class
            if (r3 != r0) goto L1c
            java.text.DecimalFormat r2 = r1.decimalFormat
            if (r2 == 0) goto L19
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r2 = new com.alibaba.fastjson2.writer.ObjectWriterArrayFinal
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            java.text.DecimalFormat r0 = r1.decimalFormat
            r2.<init>(r3, r0)
            return r2
        L19:
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r2 = com.alibaba.fastjson2.writer.ObjectWriterArrayFinal.FLOAT_ARRAY
            return r2
        L1c:
            java.lang.Class<java.lang.Double[]> r0 = java.lang.Double[].class
            if (r3 != r0) goto L31
            java.text.DecimalFormat r2 = r1.decimalFormat
            if (r2 == 0) goto L2e
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r2 = new com.alibaba.fastjson2.writer.ObjectWriterArrayFinal
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            java.text.DecimalFormat r0 = r1.decimalFormat
            r2.<init>(r3, r0)
            return r2
        L2e:
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r2 = com.alibaba.fastjson2.writer.ObjectWriterArrayFinal.DOUBLE_ARRAY
            return r2
        L31:
            java.lang.Class<java.math.BigDecimal[]> r0 = java.math.BigDecimal[].class
            if (r3 != r0) goto L46
            java.text.DecimalFormat r2 = r1.decimalFormat
            if (r2 == 0) goto L43
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r2 = new com.alibaba.fastjson2.writer.ObjectWriterArrayFinal
            java.lang.Class<java.math.BigDecimal> r3 = java.math.BigDecimal.class
            java.text.DecimalFormat r0 = r1.decimalFormat
            r2.<init>(r3, r0)
            return r2
        L43:
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r2 = com.alibaba.fastjson2.writer.ObjectWriterArrayFinal.DECIMAL_ARRAY
            return r2
        L46:
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r2.getObjectWriter(r3)
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(com.alibaba.fastjson2.JSONWriter r8, T r9) {
            r7 = this;
            java.lang.Object r9 = r7.getFieldValue(r9)
            java.lang.Object[] r9 = (java.lang.Object[]) r9
            r0 = 1
            if (r9 != 0) goto L2e
            long r1 = r7.features
            long r3 = r8.getFeatures()
            long r1 = r1 | r3
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls
            long r3 = r9.mask
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.NullAsDefaultValue
            long r5 = r9.mask
            long r3 = r3 | r5
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullListAsEmpty
            long r5 = r9.mask
            long r3 = r3 | r5
            long r1 = r1 & r3
            r3 = 0
            int r9 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r9 == 0) goto L2c
            r7.writeFieldName(r8)
            r8.writeArrayNull()
            return r0
        L2c:
            r8 = 0
            return r8
        L2e:
            r7.writeArray(r8, r0, r9)
            return r0
    }

    public void writeArray(com.alibaba.fastjson2.JSONWriter r15, boolean r16, java.lang.Object[] r17) {
            r14 = this;
            r1 = r15
            r7 = r17
            long r2 = r15.getFeatures()
            long r4 = r14.features
            long r5 = r2 | r4
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r2 = r0.mask
            long r2 = r2 & r5
            r8 = 0
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            r2 = 0
            r10 = 1
            if (r0 == 0) goto L1a
            r11 = r10
            goto L1b
        L1a:
            r11 = r2
        L1b:
            if (r16 == 0) goto L2e
            int r0 = r7.length
            if (r0 != 0) goto L2b
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray
            long r3 = r0.mask
            long r3 = r3 & r5
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L2b
            goto La7
        L2b:
            r14.writeFieldName(r15)
        L2e:
            if (r11 == 0) goto L3c
            java.lang.String r0 = r14.fieldName
            java.lang.String r0 = r15.setPath(r0, r7)
            if (r0 == 0) goto L3c
            r15.writeReference(r0)
            return
        L3c:
            boolean r0 = r1.jsonb
            r3 = 0
            if (r0 == 0) goto La8
            java.lang.Class r0 = r7.getClass()
            java.lang.Class r4 = r14.fieldClass
            if (r0 == r4) goto L50
            java.lang.String r0 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r0)
            r15.writeTypeName(r0)
        L50:
            int r8 = r7.length
            r15.startArray(r8)
            r9 = r2
            r0 = r3
            r2 = r11
        L57:
            if (r9 >= r8) goto La2
            r4 = r2
            r2 = r7[r9]
            if (r2 != 0) goto L63
            r15.writeNull()
            r2 = r4
            goto L9f
        L63:
            java.lang.Class r5 = r2.getClass()
            if (r5 == r3) goto L7c
            boolean r0 = r15.isRefDetect()
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r14.getItemWriter(r15, r5)
            if (r0 == 0) goto L78
            boolean r0 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r5)
            r0 = r0 ^ r10
        L78:
            r12 = r0
            r0 = r3
            r13 = r5
            goto L7e
        L7c:
            r13 = r3
            r12 = r4
        L7e:
            if (r12 == 0) goto L8d
            java.lang.String r3 = r15.setPath(r9, r2)
            if (r3 == 0) goto L8d
            r15.writeReference(r3)
            r15.popPath(r2)
            goto L9d
        L8d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            java.lang.reflect.Type r4 = r14.itemType
            long r5 = r14.features
            r0.writeJSONB(r1, r2, r3, r4, r5)
            if (r12 == 0) goto L9d
            r15.popPath(r2)
        L9d:
            r2 = r12
            r3 = r13
        L9f:
            int r9 = r9 + 1
            goto L57
        La2:
            if (r11 == 0) goto La7
            r15.popPath(r7)
        La7:
            return
        La8:
            r15.startArray()
            r8 = r2
            r0 = r3
        Lad:
            int r2 = r7.length
            if (r8 >= r2) goto Ld8
            if (r8 == 0) goto Lb5
            r15.writeComma()
        Lb5:
            r2 = r7[r8]
            if (r2 != 0) goto Lbd
            r15.writeNull()
            goto Ld4
        Lbd:
            java.lang.Class r4 = r2.getClass()
            if (r4 != r3) goto Lc5
            r9 = r3
            goto Lca
        Lc5:
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r14.getItemWriter(r15, r4)
            r9 = r4
        Lca:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            java.lang.reflect.Type r4 = r14.fieldType
            r0.write(r1, r2, r3, r4, r5)
            r3 = r9
        Ld4:
            int r8 = r8 + 1
            r1 = r15
            goto Lad
        Ld8:
            r15.endArray()
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(com.alibaba.fastjson2.JSONWriter r2, T r3) {
            r1 = this;
            java.lang.Object r3 = r1.getFieldValue(r3)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            if (r3 != 0) goto Lc
            r2.writeNull()
            return
        Lc:
            r0 = 0
            r1.writeArray(r2, r0, r3)
            return
    }
}
