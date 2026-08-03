package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldWriterList<T> extends com.alibaba.fastjson2.writer.FieldWriter<T> {
    final java.lang.Class<?> contentAs;
    final java.lang.Class itemClass;
    final boolean itemClassNotReferenceDetect;
    com.alibaba.fastjson2.writer.ObjectWriter itemObjectWriter;
    final java.lang.reflect.Type itemType;
    com.alibaba.fastjson2.writer.ObjectWriter listWriter;
    final boolean writeAsString;

    public FieldWriterList(java.lang.String r12, java.lang.reflect.Type r13, int r14, long r15, java.lang.String r17, java.lang.String r18, java.lang.reflect.Type r19, java.lang.Class r20, java.lang.reflect.Field r21, java.lang.reflect.Method r22, java.lang.Class<?> r23) {
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
            r0 = r23
            r14 = r5
            r11.contentAs = r0
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString
            long r0 = r0.mask
            long r0 = r0 & r3
            r5 = 0
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r7 = 0
            r8 = 1
            if (r0 == 0) goto L27
            r0 = r8
            goto L28
        L27:
            r0 = r7
        L28:
            r11.writeAsString = r0
            if (r13 != 0) goto L2f
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            goto L30
        L2f:
            r0 = r13
        L30:
            r11.itemType = r0
            boolean r0 = r0 instanceof java.lang.Class
            if (r0 == 0) goto L67
            r0 = r13
            java.lang.Class r0 = (java.lang.Class) r0
            r11.itemClass = r0
            if (r0 == 0) goto L6d
            java.lang.Class<java.lang.Enum> r1 = java.lang.Enum.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 == 0) goto L4f
            com.alibaba.fastjson2.writer.ObjectWriterImplListEnum r13 = new com.alibaba.fastjson2.writer.ObjectWriterImplListEnum
            r1 = r20
            r13.<init>(r1, r0, r3)
            r11.listWriter = r13
            goto L6d
        L4f:
            r1 = r20
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r0 != r2) goto L5a
            com.alibaba.fastjson2.writer.ObjectWriterImplListStr r13 = com.alibaba.fastjson2.writer.ObjectWriterImplListStr.INSTANCE
            r11.listWriter = r13
            goto L6d
        L5a:
            r3 = r0
            com.alibaba.fastjson2.writer.ObjectWriterImplList r0 = new com.alibaba.fastjson2.writer.ObjectWriterImplList
            r4 = r13
            r5 = r15
            r2 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r11.listWriter = r0
            goto L6d
        L67:
            java.lang.Class r13 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r13)
            r11.itemClass = r13
        L6d:
            java.lang.Class r13 = r11.itemClass
            if (r13 == 0) goto L78
            boolean r13 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r13)
            if (r13 == 0) goto L78
            r7 = r8
        L78:
            r11.itemClassNotReferenceDetect = r7
            if (r14 == 0) goto L8a
            java.lang.Class r13 = r11.itemClass
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            if (r13 != r0) goto L8a
            com.alibaba.fastjson2.writer.ObjectWriterImplDate r13 = new com.alibaba.fastjson2.writer.ObjectWriterImplDate
            r0 = 0
            r13.<init>(r14, r0)
            r11.itemObjectWriter = r13
        L8a:
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.Class getItemClass() {
            r1 = this;
            java.lang.Class r0 = r1.itemClass
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public java.lang.reflect.Type getItemType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.itemType
            return r0
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public com.alibaba.fastjson2.writer.ObjectWriter getItemWriter(com.alibaba.fastjson2.JSONWriter r2, java.lang.reflect.Type r3) {
            r1 = this;
            java.lang.Class<?> r0 = r1.contentAs
            if (r0 == 0) goto L10
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r1.itemObjectWriter
            if (r3 == 0) goto L9
            return r3
        L9:
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r2.getObjectWriter(r0, r0)
            r1.itemObjectWriter = r2
            return r2
        L10:
            if (r3 == 0) goto L20
            java.lang.reflect.Type r0 = r1.itemType
            if (r3 != r0) goto L17
            goto L20
        L17:
            java.lang.Class r0 = com.alibaba.fastjson2.util.TypeUtils.getClass(r3)
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r2.getObjectWriter(r3, r0)
            return r2
        L20:
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r1.itemObjectWriter
            if (r0 == 0) goto L25
            return r0
        L25:
            java.lang.String r0 = r1.format
            if (r0 == 0) goto L63
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r3 != r0) goto L3c
            com.alibaba.fastjson2.writer.ObjectWriterImplDouble r2 = new com.alibaba.fastjson2.writer.ObjectWriterImplDouble
            java.text.DecimalFormat r3 = new java.text.DecimalFormat
            java.lang.String r0 = r1.format
            r3.<init>(r0)
            r2.<init>(r3)
            r1.itemObjectWriter = r2
            return r2
        L3c:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r3 != r0) goto L4f
            com.alibaba.fastjson2.writer.ObjectWriterImplFloat r2 = new com.alibaba.fastjson2.writer.ObjectWriterImplFloat
            java.text.DecimalFormat r3 = new java.text.DecimalFormat
            java.lang.String r0 = r1.format
            r3.<init>(r0)
            r2.<init>(r3)
            r1.itemObjectWriter = r2
            return r2
        L4f:
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            if (r3 != r0) goto L63
            com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal r2 = new com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal
            java.text.DecimalFormat r3 = new java.text.DecimalFormat
            java.lang.String r0 = r1.format
            r3.<init>(r0)
            r0 = 0
            r2.<init>(r3, r0)
            r1.itemObjectWriter = r2
            return r2
        L63:
            java.lang.reflect.Type r3 = r1.itemType
            java.lang.Class r0 = r1.itemClass
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r2.getObjectWriter(r3, r0)
            r1.itemObjectWriter = r2
            return r2
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public com.alibaba.fastjson2.writer.ObjectWriter getObjectWriter(com.alibaba.fastjson2.JSONWriter r3, java.lang.Class r4) {
            r2 = this;
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r2.listWriter
            if (r0 == 0) goto Ld
            java.lang.Class r1 = r2.fieldClass
            boolean r1 = r1.isAssignableFrom(r4)
            if (r1 == 0) goto Ld
            return r0
        Ld:
            if (r0 != 0) goto L1a
            java.lang.Class r0 = r2.fieldClass
            if (r4 != r0) goto L1a
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r3.getObjectWriter(r4)
            r2.listWriter = r3
            return r3
        L1a:
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r3.getObjectWriter(r4)
            return r3
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeList(com.alibaba.fastjson2.JSONWriter r12, boolean r13, java.util.List r14) {
            r11 = this;
            boolean r0 = r12.jsonb
            if (r0 == 0) goto L8
            r11.writeListJSONB(r12, r13, r14)
            return
        L8:
            long r0 = r11.features
            long r7 = r12.getFeatures(r0)
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray
            long r0 = r0.mask
            long r0 = r0 & r7
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L22
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L22
            if (r13 == 0) goto L22
            return
        L22:
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r0 = r0.mask
            long r0 = r0 & r7
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r9 = 1
            if (r0 == 0) goto L2f
            r0 = r9
            goto L30
        L2f:
            r0 = r1
        L30:
            if (r13 == 0) goto L35
            r11.writeFieldName(r12)
        L35:
            r12.startArray()
            r13 = 0
            r10 = r1
            r1 = r0
            r0 = r13
        L3c:
            int r2 = r14.size()
            if (r10 >= r2) goto L97
            if (r10 == 0) goto L47
            r12.writeComma()
        L47:
            java.lang.Object r4 = r14.get(r10)
            if (r4 != 0) goto L51
            r12.writeNull()
            goto L5e
        L51:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 != r3) goto L60
            java.lang.String r4 = (java.lang.String) r4
            r12.writeString(r4)
        L5e:
            r3 = r12
            goto L93
        L60:
            if (r2 != r13) goto L64
        L62:
            r2 = r0
            goto L76
        L64:
            boolean r13 = r12.isRefDetect()
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r11.getItemWriter(r12, r2)
            if (r13 == 0) goto L73
            boolean r13 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r2)
            r13 = r13 ^ r9
        L73:
            r1 = r13
            r13 = r2
            goto L62
        L76:
            if (r1 == 0) goto L86
            java.lang.String r0 = r12.setPath(r10, r4)
            if (r0 == 0) goto L86
            r12.writeReference(r0)
            r12.popPath(r4)
            r3 = r12
            goto L92
        L86:
            r5 = 0
            java.lang.reflect.Type r6 = r11.itemType
            r3 = r12
            r2.write(r3, r4, r5, r6, r7)
            if (r1 == 0) goto L92
            r3.popPath(r4)
        L92:
            r0 = r2
        L93:
            int r10 = r10 + 1
            r12 = r3
            goto L3c
        L97:
            r3 = r12
            r3.endArray()
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeListJSONB(com.alibaba.fastjson2.JSONWriter r14, java.util.List r15) {
            r13 = this;
            long r0 = r13.features
            long r7 = r14.getFeatures(r0)
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray
            long r0 = r0.mask
            long r0 = r0 & r7
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r9 = 1
            if (r0 == 0) goto L15
            r0 = r9
            goto L16
        L15:
            r0 = r1
        L16:
            int r10 = r15.size()
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray
            long r4 = r4.mask
            long r4 = r4 & r7
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L27
            if (r10 != 0) goto L27
            goto Lb5
        L27:
            r13.writeFieldName(r14)
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r4 = r4.mask
            long r4 = r4 & r7
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L35
            r2 = r9
            goto L36
        L35:
            r2 = r1
        L36:
            java.lang.Class r3 = r13.fieldClass
            boolean r3 = r14.isWriteTypeInfo(r15, r3)
            if (r3 == 0) goto L49
            java.lang.Class r3 = r15.getClass()
            java.lang.String r3 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r3)
            r14.writeTypeName(r3)
        L49:
            r14.startArray(r10)
            r3 = 0
            r4 = r3
        L4e:
            if (r1 >= r10) goto Lb5
            r5 = r4
            java.lang.Object r4 = r15.get(r1)
            if (r4 != 0) goto L5e
            r14.writeNull()
            r12 = r3
            r4 = r5
            r3 = r14
            goto Lb0
        L5e:
            java.lang.Class r6 = r4.getClass()
            if (r6 == r3) goto L87
            boolean r2 = r14.isRefDetect()
            java.lang.reflect.Type r3 = r13.itemType
            if (r6 != r3) goto L71
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r13.itemObjectWriter
            if (r3 == 0) goto L71
            goto L75
        L71:
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r13.getItemWriter(r14, r6)
        L75:
            if (r2 == 0) goto L7e
            java.lang.Class r2 = r13.itemClass
            if (r6 != r2) goto L82
            boolean r2 = r13.itemClassNotReferenceDetect
        L7d:
            r2 = r2 ^ r9
        L7e:
            r11 = r2
            r2 = r3
            r12 = r6
            goto L8a
        L82:
            boolean r2 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r6)
            goto L7d
        L87:
            r11 = r2
            r12 = r3
            r2 = r5
        L8a:
            if (r11 == 0) goto L94
            boolean r3 = r14.writeReference(r1, r4)
            if (r3 == 0) goto L94
            r3 = r14
            goto Lae
        L94:
            java.lang.reflect.Type r6 = r13.itemType
            if (r0 == 0) goto La1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r3 = r14
            r2.writeArrayMappingJSONB(r3, r4, r5, r6, r7)
            goto La9
        La1:
            r3 = r14
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r2.writeJSONB(r3, r4, r5, r6, r7)
        La9:
            if (r11 == 0) goto Lae
            r3.popPath(r4)
        Lae:
            r4 = r2
            r2 = r11
        Lb0:
            int r1 = r1 + 1
            r14 = r3
            r3 = r12
            goto L4e
        Lb5:
            return
    }

    public final void writeListJSONB(com.alibaba.fastjson2.JSONWriter r13, boolean r14, java.util.List r15) {
            r12 = this;
            long r0 = r12.features
            long r7 = r13.getFeatures(r0)
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray
            long r0 = r0.mask
            long r0 = r0 & r7
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r9 = 1
            if (r0 == 0) goto L15
            r0 = r9
            goto L16
        L15:
            r0 = r1
        L16:
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteEmptyArray
            long r4 = r4.mask
            long r4 = r4 & r7
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L29
            boolean r4 = r15.isEmpty()
            if (r4 == 0) goto L29
            if (r14 == 0) goto L29
            goto Lc4
        L29:
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r4 = r4.mask
            long r4 = r4 & r7
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L34
            r2 = r9
            goto L35
        L34:
            r2 = r1
        L35:
            if (r14 == 0) goto L3a
            r12.writeFieldName(r13)
        L3a:
            int r14 = r15.size()
            java.lang.Class r3 = r12.fieldClass
            boolean r3 = r13.isWriteTypeInfo(r15, r3)
            if (r3 == 0) goto L51
            java.lang.Class r3 = r15.getClass()
            java.lang.String r3 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r3)
            r13.writeTypeName(r3)
        L51:
            r13.startArray(r14)
            r3 = 0
            r4 = r3
        L56:
            if (r1 >= r14) goto Lc4
            r5 = r4
            java.lang.Object r4 = r15.get(r1)
            if (r4 != 0) goto L67
            r13.writeNull()
            r11 = r3
            r4 = r5
            r3 = r13
            goto Lbf
        L67:
            java.lang.Class r6 = r4.getClass()
            if (r6 == r3) goto L90
            boolean r2 = r13.isRefDetect()
            java.lang.reflect.Type r3 = r12.itemType
            if (r6 != r3) goto L7a
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r12.itemObjectWriter
            if (r3 == 0) goto L7a
            goto L7e
        L7a:
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r12.getItemWriter(r13, r6)
        L7e:
            if (r2 == 0) goto L87
            java.lang.Class r2 = r12.itemClass
            if (r6 != r2) goto L8b
            boolean r2 = r12.itemClassNotReferenceDetect
        L86:
            r2 = r2 ^ r9
        L87:
            r10 = r2
            r2 = r3
            r11 = r6
            goto L93
        L8b:
            boolean r2 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r6)
            goto L86
        L90:
            r10 = r2
            r11 = r3
            r2 = r5
        L93:
            if (r10 == 0) goto La3
            java.lang.String r3 = r13.setPath(r1, r4)
            if (r3 == 0) goto La3
            r13.writeReference(r3)
            r13.popPath(r4)
            r3 = r13
            goto Lbd
        La3:
            java.lang.reflect.Type r6 = r12.itemType
            if (r0 == 0) goto Lb0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r3 = r13
            r2.writeArrayMappingJSONB(r3, r4, r5, r6, r7)
            goto Lb8
        Lb0:
            r3 = r13
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r2.writeJSONB(r3, r4, r5, r6, r7)
        Lb8:
            if (r10 == 0) goto Lbd
            r3.popPath(r4)
        Lbd:
            r4 = r2
            r2 = r10
        Lbf:
            int r1 = r1 + 1
            r13 = r3
            r3 = r11
            goto L56
        Lc4:
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeListStr(com.alibaba.fastjson2.JSONWriter r1, boolean r2, java.util.List<java.lang.String> r3) {
            r0 = this;
            if (r2 == 0) goto L5
            r0.writeFieldName(r1)
        L5:
            boolean r2 = r1.jsonb
            if (r2 == 0) goto L1c
            java.lang.Class r2 = r0.fieldClass
            boolean r2 = r1.isWriteTypeInfo(r3, r2)
            if (r2 == 0) goto L1c
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r2)
            r1.writeTypeName(r2)
        L1c:
            r1.writeString(r3)
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeListValue(com.alibaba.fastjson2.JSONWriter r17, java.util.List r18) {
            r16 = this;
            r0 = r16
            r2 = r17
            boolean r1 = r2.jsonb
            if (r1 == 0) goto Lc
            r16.writeListJSONB(r17, r18)
            return
        Lc:
            long r3 = r0.features
            long r6 = r2.getFeatures(r3)
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r3 = r1.mask
            long r3 = r3 & r6
            r8 = 0
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            r10 = 0
            r11 = 1
            if (r1 == 0) goto L21
            r1 = r11
            goto L22
        L21:
            r1 = r10
        L22:
            r2.startArray()
            r3 = 0
            r4 = r3
            r12 = r10
        L28:
            int r5 = r18.size()
            if (r12 >= r5) goto L93
            if (r12 == 0) goto L33
            r2.writeComma()
        L33:
            r13 = r18
            java.lang.Object r5 = r13.get(r12)
            if (r5 != 0) goto L3f
            r2.writeNull()
            goto L90
        L3f:
            java.lang.Class r14 = r5.getClass()
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            if (r14 != r15) goto L4d
            java.lang.String r5 = (java.lang.String) r5
            r2.writeString(r5)
            goto L90
        L4d:
            boolean r15 = r0.writeAsString
            if (r15 == 0) goto L59
            java.lang.String r5 = r5.toString()
            r2.writeString(r5)
            goto L90
        L59:
            if (r14 != r3) goto L5f
            r15 = r3
        L5c:
            r14 = r1
            r1 = r4
            goto L78
        L5f:
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r3 = r1.mask
            long r3 = r3 & r6
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 == 0) goto L6a
            r1 = r11
            goto L6b
        L6a:
            r1 = r10
        L6b:
            com.alibaba.fastjson2.writer.ObjectWriter r4 = r0.getItemWriter(r2, r14)
            if (r1 == 0) goto L76
            boolean r1 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r14)
            r1 = r1 ^ r11
        L76:
            r15 = r14
            goto L5c
        L78:
            if (r14 == 0) goto L81
            boolean r3 = r2.writeReference(r12, r5)
            if (r3 == 0) goto L81
            goto L8d
        L81:
            r4 = 0
            r3 = r5
            java.lang.reflect.Type r5 = r0.itemType
            r1.write(r2, r3, r4, r5, r6)
            if (r14 == 0) goto L8d
            r2.popPath(r3)
        L8d:
            r4 = r1
            r1 = r14
            r3 = r15
        L90:
            int r12 = r12 + 1
            goto L28
        L93:
            r2.endArray()
            return
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeListValueJSONB(com.alibaba.fastjson2.JSONWriter r14, java.util.List r15) {
            r13 = this;
            long r0 = r13.features
            long r7 = r14.getFeatures(r0)
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray
            long r0 = r0.mask
            long r0 = r0 & r7
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r9 = 1
            if (r0 == 0) goto L15
            r0 = r9
            goto L16
        L15:
            r0 = r1
        L16:
            int r10 = r15.size()
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            long r4 = r4.mask
            long r4 = r4 & r7
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L25
            r2 = r9
            goto L26
        L25:
            r2 = r1
        L26:
            java.lang.Class r3 = r13.fieldClass
            boolean r3 = r14.isWriteTypeInfo(r15, r3)
            if (r3 == 0) goto L39
            java.lang.Class r3 = r15.getClass()
            java.lang.String r3 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r3)
            r14.writeTypeName(r3)
        L39:
            r14.startArray(r10)
            r3 = 0
            r4 = r3
        L3e:
            if (r1 >= r10) goto La5
            r5 = r4
            java.lang.Object r4 = r15.get(r1)
            if (r4 != 0) goto L4e
            r14.writeNull()
            r12 = r3
            r4 = r5
            r3 = r14
            goto La0
        L4e:
            java.lang.Class r6 = r4.getClass()
            if (r6 == r3) goto L77
            boolean r2 = r14.isRefDetect()
            java.lang.reflect.Type r3 = r13.itemType
            if (r6 != r3) goto L61
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r13.itemObjectWriter
            if (r3 == 0) goto L61
            goto L65
        L61:
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r13.getItemWriter(r14, r6)
        L65:
            if (r2 == 0) goto L6e
            java.lang.Class r2 = r13.itemClass
            if (r6 != r2) goto L72
            boolean r2 = r13.itemClassNotReferenceDetect
        L6d:
            r2 = r2 ^ r9
        L6e:
            r11 = r2
            r2 = r3
            r12 = r6
            goto L7a
        L72:
            boolean r2 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isNotReferenceDetect(r6)
            goto L6d
        L77:
            r11 = r2
            r12 = r3
            r2 = r5
        L7a:
            if (r11 == 0) goto L84
            boolean r3 = r14.writeReference(r1, r4)
            if (r3 == 0) goto L84
            r3 = r14
            goto L9e
        L84:
            java.lang.reflect.Type r6 = r13.itemType
            if (r0 == 0) goto L91
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r3 = r14
            r2.writeArrayMappingJSONB(r3, r4, r5, r6, r7)
            goto L99
        L91:
            r3 = r14
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r2.writeJSONB(r3, r4, r5, r6, r7)
        L99:
            if (r11 == 0) goto L9e
            r3.popPath(r4)
        L9e:
            r4 = r2
            r2 = r11
        La0:
            int r1 = r1 + 1
            r14 = r3
            r3 = r12
            goto L3e
        La5:
            return
    }
}
