package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterObjectArrayMethod<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    final java.lang.Class itemClass;
    com.alibaba.fastjson2.writer.ObjectWriter itemObjectWriter;
    final java.lang.reflect.Type itemType;

    public FieldWriterObjectArrayMethod(java.lang.String r12, java.lang.reflect.Type r13, int r14, long r15, java.lang.String r17, java.lang.String r18, java.lang.reflect.Type r19, java.lang.Class r20, java.lang.reflect.Field r21, java.lang.reflect.Method r22) {
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r15
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            r11.itemType = r13
            boolean r12 = r13 instanceof java.lang.Class
            if (r12 == 0) goto L1e
            java.lang.Class r13 = (java.lang.Class) r13
            r11.itemClass = r13
            return
        L1e:
            java.lang.Class r12 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r13)
            r11.itemClass = r12
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Object getFieldValue(java.lang.Object r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.method     // Catch: java.lang.reflect.InvocationTargetException -> L8 java.lang.IllegalAccessException -> La java.lang.IllegalArgumentException -> Lc
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L8 java.lang.IllegalAccessException -> La java.lang.IllegalArgumentException -> Lc
            return r3
        L8:
            r3 = move-exception
            goto Ld
        La:
            r3 = move-exception
            goto Ld
        Lc:
            r3 = move-exception
        Ld:
            java.lang.String r0 = "field.get error, "
            java.lang.String r1 = r2.fieldName
            ah.a.o(r0, r1, r3)
            r3 = 0
            return r3
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public com.alibaba.fastjson2.writer.ObjectWriter getItemWriter(com.alibaba.fastjson2.JSONWriter r6, java.lang.reflect.Type r7) {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto Ld
            java.lang.reflect.Type r1 = r5.itemType
            if (r7 != r1) goto L8
            goto Ld
        L8:
            com.alibaba.fastjson2.writer.ObjectWriter r6 = r6.getObjectWriter(r7, r0)
            return r6
        Ld:
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r5.itemObjectWriter
            if (r1 == 0) goto L12
            return r1
        L12:
            java.lang.Class<java.lang.Float[]> r1 = java.lang.Float[].class
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            if (r7 != r1) goto L27
            java.text.DecimalFormat r6 = r5.decimalFormat
            if (r6 == 0) goto L24
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r6 = new com.alibaba.fastjson2.writer.ObjectWriterArrayFinal
            java.text.DecimalFormat r7 = r5.decimalFormat
            r6.<init>(r2, r7)
            return r6
        L24:
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r6 = com.alibaba.fastjson2.writer.ObjectWriterArrayFinal.FLOAT_ARRAY
            return r6
        L27:
            java.lang.Class<java.lang.Double[]> r1 = java.lang.Double[].class
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            if (r7 != r1) goto L3c
            java.text.DecimalFormat r6 = r5.decimalFormat
            if (r6 == 0) goto L39
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r6 = new com.alibaba.fastjson2.writer.ObjectWriterArrayFinal
            java.text.DecimalFormat r7 = r5.decimalFormat
            r6.<init>(r3, r7)
            return r6
        L39:
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r6 = com.alibaba.fastjson2.writer.ObjectWriterArrayFinal.DOUBLE_ARRAY
            return r6
        L3c:
            java.lang.Class<java.math.BigDecimal[]> r1 = java.math.BigDecimal[].class
            java.lang.Class<java.math.BigDecimal> r4 = java.math.BigDecimal.class
            if (r7 != r1) goto L51
            java.text.DecimalFormat r6 = r5.decimalFormat
            if (r6 == 0) goto L4e
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r6 = new com.alibaba.fastjson2.writer.ObjectWriterArrayFinal
            java.text.DecimalFormat r7 = r5.decimalFormat
            r6.<init>(r4, r7)
            return r6
        L4e:
            com.alibaba.fastjson2.writer.ObjectWriterArrayFinal r6 = com.alibaba.fastjson2.writer.ObjectWriterArrayFinal.DECIMAL_ARRAY
            return r6
        L51:
            if (r7 != r2) goto L62
            java.text.DecimalFormat r6 = r5.decimalFormat
            if (r6 == 0) goto L5f
            com.alibaba.fastjson2.writer.ObjectWriterImplFloat r6 = new com.alibaba.fastjson2.writer.ObjectWriterImplFloat
            java.text.DecimalFormat r7 = r5.decimalFormat
            r6.<init>(r7)
            return r6
        L5f:
            com.alibaba.fastjson2.writer.ObjectWriterImplFloat r6 = com.alibaba.fastjson2.writer.ObjectWriterImplFloat.INSTANCE
            return r6
        L62:
            if (r7 != r3) goto L73
            java.text.DecimalFormat r6 = r5.decimalFormat
            if (r6 == 0) goto L70
            com.alibaba.fastjson2.writer.ObjectWriterImplDouble r6 = new com.alibaba.fastjson2.writer.ObjectWriterImplDouble
            java.text.DecimalFormat r7 = r5.decimalFormat
            r6.<init>(r7)
            return r6
        L70:
            com.alibaba.fastjson2.writer.ObjectWriterImplDouble r6 = com.alibaba.fastjson2.writer.ObjectWriterImplDouble.INSTANCE
            return r6
        L73:
            if (r7 != r4) goto L84
            java.text.DecimalFormat r6 = r5.decimalFormat
            if (r6 == 0) goto L81
            com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal r6 = new com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal
            java.text.DecimalFormat r7 = r5.decimalFormat
            r6.<init>(r7, r0)
            return r6
        L81:
            com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal r6 = com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal.INSTANCE
            return r6
        L84:
            java.lang.reflect.Type r7 = r5.itemType
            java.lang.Class r0 = r5.itemClass
            com.alibaba.fastjson2.writer.ObjectWriter r6 = r6.getObjectWriter(r7, r0)
            r5.itemObjectWriter = r6
            return r6
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

    public void writeArray(com.alibaba.fastjson2.JSONWriter r14, boolean r15, java.lang.Object[] r16) {
            r13 = this;
            r7 = r16
            if (r15 == 0) goto L7
            r13.writeFieldName(r14)
        L7:
            boolean r8 = r14.isRefDetect()
            if (r8 == 0) goto L19
            java.lang.String r0 = r13.fieldName
            java.lang.String r0 = r14.setPath(r0, r7)
            if (r0 == 0) goto L19
            r14.writeReference(r0)
            return
        L19:
            boolean r0 = r14.jsonb
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L88
            java.lang.Class r0 = r7.getClass()
            java.lang.Class r4 = r13.fieldClass
            if (r0 == r4) goto L2e
            java.lang.String r0 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r0)
            r14.writeTypeName(r0)
        L2e:
            int r9 = r7.length
            r14.startArray(r9)
            r10 = r2
            r0 = r3
            r2 = r8
        L35:
            if (r10 >= r9) goto L82
            r4 = r2
            r2 = r7[r10]
            if (r2 != 0) goto L41
            r14.writeNull()
            r2 = r4
            goto L7f
        L41:
            java.lang.Class r5 = r2.getClass()
            if (r5 == r3) goto L5b
            boolean r0 = r14.isRefDetect()
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r13.getItemWriter(r14, r5)
            if (r0 == 0) goto L57
            boolean r0 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r5)
            r0 = r0 ^ 1
        L57:
            r11 = r0
            r0 = r3
            r12 = r5
            goto L5d
        L5b:
            r12 = r3
            r11 = r4
        L5d:
            if (r11 == 0) goto L6c
            java.lang.String r3 = r14.setPath(r10, r2)
            if (r3 == 0) goto L6c
            r14.writeReference(r3)
            r14.popPath(r2)
            goto L7d
        L6c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.lang.reflect.Type r4 = r13.itemType
            long r5 = r13.features
            r1 = r14
            r0.writeJSONB(r1, r2, r3, r4, r5)
            if (r11 == 0) goto L7d
            r14.popPath(r2)
        L7d:
            r2 = r11
            r3 = r12
        L7f:
            int r10 = r10 + 1
            goto L35
        L82:
            if (r8 == 0) goto L87
            r14.popPath(r7)
        L87:
            return
        L88:
            r14.startArray()
            r8 = r2
            r0 = r3
        L8d:
            int r2 = r7.length
            if (r8 >= r2) goto Lb6
            if (r8 == 0) goto L95
            r14.writeComma()
        L95:
            r2 = r7[r8]
            if (r2 != 0) goto L9d
            r14.writeNull()
            goto Lb3
        L9d:
            java.lang.Class r4 = r2.getClass()
            if (r4 != r3) goto La5
            r9 = r3
            goto Laa
        La5:
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r13.getItemWriter(r14, r4)
            r9 = r4
        Laa:
            r4 = 0
            long r5 = r13.features
            r3 = 0
            r1 = r14
            r0.write(r1, r2, r3, r4, r5)
            r3 = r9
        Lb3:
            int r8 = r8 + 1
            goto L8d
        Lb6:
            r14.endArray()
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
