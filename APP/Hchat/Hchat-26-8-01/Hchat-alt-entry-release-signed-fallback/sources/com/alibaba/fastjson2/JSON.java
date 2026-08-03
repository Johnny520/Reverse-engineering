package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface JSON {
    public static final java.lang.String VERSION = "2.0.60";

    static void config(com.alibaba.fastjson2.JSONReader.Feature r2, boolean r3) {
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            if (r2 != r0) goto Ld
            if (r3 != 0) goto L7
            goto Ld
        L7:
            java.lang.String r2 = "not support config global autotype support"
            ah.a.w(r2)
            return
        Ld:
            if (r3 == 0) goto L17
            long r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures
            long r2 = r2.mask
            long r2 = r2 | r0
            com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures = r2
            return
        L17:
            long r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures
            long r2 = r2.mask
            long r2 = ~r2
            long r2 = r2 & r0
            com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures = r2
            return
    }

    static void config(com.alibaba.fastjson2.JSONWriter.Feature r2, boolean r3) {
            if (r3 == 0) goto La
            long r0 = com.alibaba.fastjson2.JSONFactory.defaultWriterFeatures
            long r2 = r2.mask
            long r2 = r2 | r0
            com.alibaba.fastjson2.JSONFactory.defaultWriterFeatures = r2
            return
        La:
            long r0 = com.alibaba.fastjson2.JSONFactory.defaultWriterFeatures
            long r2 = r2.mask
            long r2 = ~r2
            long r2 = r2 & r0
            com.alibaba.fastjson2.JSONFactory.defaultWriterFeatures = r2
            return
    }

    static void config(com.alibaba.fastjson2.JSONReader.Feature... r6) {
            r0 = 0
        L1:
            int r1 = r6.length
            if (r0 >= r1) goto L1a
            r1 = r6[r0]
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            if (r1 == r2) goto L15
            long r2 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures
            long r4 = r1.mask
            long r1 = r2 | r4
            com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures = r1
            int r0 = r0 + 1
            goto L1
        L15:
            java.lang.String r6 = "not support config global autotype support"
            ah.a.w(r6)
        L1a:
            return
    }

    static void config(com.alibaba.fastjson2.JSONWriter.Feature... r6) {
            r0 = 0
        L1:
            int r1 = r6.length
            if (r0 >= r1) goto L11
            r1 = r6[r0]
            long r2 = com.alibaba.fastjson2.JSONFactory.defaultWriterFeatures
            long r4 = r1.mask
            long r1 = r2 | r4
            com.alibaba.fastjson2.JSONFactory.defaultWriterFeatures = r1
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    @java.lang.SafeVarargs
    static void configEnumAsJavaBean(java.lang.Class<? extends java.lang.Enum>... r1) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectWriterProvider()
            r0.configEnumAsJavaBean(r1)
            return
    }

    static void configReaderDateFormat(java.lang.String r0) {
            com.alibaba.fastjson2.JSONFactory.defaultReaderFormat = r0
            return
    }

    static void configReaderZoneId(java.time.ZoneId r0) {
            com.alibaba.fastjson2.JSONFactory.defaultReaderZoneId = r0
            return
    }

    static void configWriterDateFormat(java.lang.String r0) {
            com.alibaba.fastjson2.JSONFactory.defaultWriterFormat = r0
            return
    }

    static void configWriterZoneId(java.time.ZoneId r0) {
            com.alibaba.fastjson2.JSONFactory.defaultWriterZoneId = r0
            return
    }

    static <T> T copy(T r12, com.alibaba.fastjson2.JSONWriter.Feature... r13) {
            if (r12 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.lang.Class r1 = r12.getClass()
            boolean r3 = com.alibaba.fastjson2.writer.ObjectWriterProvider.isPrimitiveOrEnum(r1)
            if (r3 == 0) goto Lf
            return r12
        Lf:
            r3 = 0
            r4 = 0
            r7 = r3
            r10 = r4
            r4 = r7
            r5 = r4
        L16:
            int r6 = r13.length
            if (r4 >= r6) goto L2d
            r6 = r13[r4]
            long r8 = r6.mask
            long r10 = r10 | r8
            com.alibaba.fastjson2.JSONWriter$Feature r8 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            r9 = 1
            if (r6 != r8) goto L25
            r5 = r9
            goto L2a
        L25:
            com.alibaba.fastjson2.JSONWriter$Feature r8 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray
            if (r6 != r8) goto L2a
            r7 = r9
        L2a:
            int r4 = r4 + 1
            goto L16
        L2d:
            com.alibaba.fastjson2.writer.ObjectWriterProvider r4 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.writer.ObjectWriter r4 = r4.getObjectWriter(r1, r1, r5)
            com.alibaba.fastjson2.reader.ObjectReaderProvider r6 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.reader.ObjectReader r8 = r6.getObjectReader(r1, r5)
            boolean r1 = r4 instanceof com.alibaba.fastjson2.writer.ObjectWriterAdapter
            if (r1 == 0) goto L9a
            boolean r1 = r8 instanceof com.alibaba.fastjson2.reader.ObjectReaderBean
            if (r1 == 0) goto L9a
            java.util.List r0 = r4.getFieldWriters()
            boolean r1 = r8 instanceof com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor
            if (r1 == 0) goto L6f
            java.util.HashMap r1 = new java.util.HashMap
            int r4 = r0.size()
            r1.<init>(r4)
        L52:
            int r4 = r0.size()
            if (r3 >= r4) goto L6a
            java.lang.Object r4 = r0.get(r3)
            com.alibaba.fastjson2.writer.FieldWriter r4 = (com.alibaba.fastjson2.writer.FieldWriter) r4
            java.lang.Object r5 = r4.getFieldValue(r12)
            java.lang.String r4 = r4.fieldName
            r1.put(r4, r5)
            int r3 = r3 + 1
            goto L52
        L6a:
            java.lang.Object r0 = r8.createInstance(r1, r10)
            return r0
        L6f:
            java.lang.Object r1 = r8.createInstance(r10)
            r4 = r3
        L74:
            int r5 = r0.size()
            if (r4 >= r5) goto L99
            java.lang.Object r5 = r0.get(r4)
            com.alibaba.fastjson2.writer.FieldWriter r5 = (com.alibaba.fastjson2.writer.FieldWriter) r5
            java.lang.String r6 = r5.fieldName
            com.alibaba.fastjson2.reader.FieldReader r6 = r8.getFieldReader(r6)
            if (r6 != 0) goto L89
            goto L96
        L89:
            java.lang.Object r5 = r5.getFieldValue(r12)
            com.alibaba.fastjson2.JSONWriter$Feature[] r7 = new com.alibaba.fastjson2.JSONWriter.Feature[r3]
            java.lang.Object r5 = copy(r5, r7)
            r6.accept(r1, r5)
        L96:
            int r4 = r4 + 1
            goto L74
        L99:
            return r1
        L9a:
            com.alibaba.fastjson2.JSONWriter r1 = com.alibaba.fastjson2.JSONWriter.ofJSONB(r13)
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName     // Catch: java.lang.Throwable -> Lf0
            com.alibaba.fastjson2.JSONWriter$Feature[] r0 = new com.alibaba.fastjson2.JSONWriter.Feature[]{r0}     // Catch: java.lang.Throwable -> Lf0
            r1.config(r0)     // Catch: java.lang.Throwable -> Lf0
            r0 = r4
            r4 = 0
            r5 = 0
            r3 = 0
            r2 = r12
            r0.writeJSONB(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Lf0
            byte[] r0 = r1.getBytes()     // Catch: java.lang.Throwable -> Lf0
            r1.close()
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.SupportClassForName
            com.alibaba.fastjson2.JSONReader$Feature[] r1 = new com.alibaba.fastjson2.JSONReader.Feature[]{r1, r2}
            com.alibaba.fastjson2.JSONReader r1 = com.alibaba.fastjson2.JSONReader.ofJSONB(r0, r1)
            if (r7 == 0) goto Ld0
            com.alibaba.fastjson2.JSONReader$Context r0 = r1.context     // Catch: java.lang.Throwable -> Ld2
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.SupportArrayToBean     // Catch: java.lang.Throwable -> Ld2
            com.alibaba.fastjson2.JSONReader$Feature[] r2 = new com.alibaba.fastjson2.JSONReader.Feature[]{r2}     // Catch: java.lang.Throwable -> Ld2
            r0.config(r2)     // Catch: java.lang.Throwable -> Ld2
        Ld0:
            r6 = r8
            goto Ld6
        Ld2:
            r0 = move-exception
            r7 = r1
        Ld4:
            r1 = r0
            goto Le5
        Ld6:
            r8 = 0
            r9 = 0
            r7 = r1
            java.lang.Object r0 = r6.readJSONBObject(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Le3
            if (r7 == 0) goto Le2
            r7.close()
        Le2:
            return r0
        Le3:
            r0 = move-exception
            goto Ld4
        Le5:
            if (r7 == 0) goto Lef
            r7.close()     // Catch: java.lang.Throwable -> Leb
            goto Lef
        Leb:
            r0 = move-exception
            r1.addSuppressed(r0)
        Lef:
            throw r1
        Lf0:
            r0 = move-exception
            r2 = r0
            if (r1 == 0) goto Lfc
            r1.close()     // Catch: java.lang.Throwable -> Lf8
            goto Lfc
        Lf8:
            r0 = move-exception
            r2.addSuppressed(r0)
        Lfc:
            throw r2
    }

    static <T> T copyTo(java.lang.Object r15, java.lang.Class<T> r16, com.alibaba.fastjson2.JSONWriter.Feature... r17) {
            r0 = r17
            if (r15 != 0) goto L6
            r15 = 0
            return r15
        L6:
            java.lang.Class r1 = r15.getClass()
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r5
            r7 = r6
        L10:
            int r8 = r0.length
            if (r5 >= r8) goto L27
            r8 = r0[r5]
            long r9 = r8.mask
            long r3 = r3 | r9
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            r10 = 1
            if (r8 != r9) goto L1f
            r6 = r10
            goto L24
        L1f:
            com.alibaba.fastjson2.JSONWriter$Feature r9 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray
            if (r8 != r9) goto L24
            r7 = r10
        L24:
            int r5 = r5 + 1
            goto L10
        L27:
            com.alibaba.fastjson2.writer.ObjectWriterProvider r5 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.writer.ObjectWriter r8 = r5.getObjectWriter(r1, r1, r6)
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r5 = r16
            com.alibaba.fastjson2.reader.ObjectReader r1 = r1.getObjectReader(r5, r6)
            boolean r5 = r8 instanceof com.alibaba.fastjson2.writer.ObjectWriterAdapter
            if (r5 == 0) goto Lc9
            boolean r5 = r1 instanceof com.alibaba.fastjson2.reader.ObjectReaderBean
            if (r5 == 0) goto Lc9
            java.util.List r0 = r8.getFieldWriters()
            boolean r5 = r1 instanceof com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor
            if (r5 == 0) goto L6b
            java.util.HashMap r5 = new java.util.HashMap
            int r6 = r0.size()
            r5.<init>(r6)
        L4e:
            int r6 = r0.size()
            if (r2 >= r6) goto L66
            java.lang.Object r6 = r0.get(r2)
            com.alibaba.fastjson2.writer.FieldWriter r6 = (com.alibaba.fastjson2.writer.FieldWriter) r6
            java.lang.Object r7 = r6.getFieldValue(r15)
            java.lang.String r6 = r6.fieldName
            r5.put(r6, r7)
            int r2 = r2 + 1
            goto L4e
        L66:
            java.lang.Object r15 = r1.createInstance(r5, r3)
            return r15
        L6b:
            java.lang.Object r3 = r1.createInstance(r3)
            r4 = r2
        L70:
            int r5 = r0.size()
            if (r4 >= r5) goto Lc8
            java.lang.Object r5 = r0.get(r4)
            com.alibaba.fastjson2.writer.FieldWriter r5 = (com.alibaba.fastjson2.writer.FieldWriter) r5
            java.lang.String r6 = r5.fieldName
            com.alibaba.fastjson2.reader.FieldReader r6 = r1.getFieldReader(r6)
            if (r6 != 0) goto L85
            goto Lc5
        L85:
            java.lang.Object r7 = r5.getFieldValue(r15)
            java.lang.Class r8 = r5.fieldClass
            java.lang.Class<java.util.Date> r9 = java.util.Date.class
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            if (r8 != r9) goto L9e
            java.lang.Class r9 = r6.fieldClass
            if (r9 != r10) goto L9e
            java.util.Date r7 = (java.util.Date) r7
            java.lang.String r5 = r5.format
            java.lang.String r7 = com.alibaba.fastjson2.util.DateUtils.format(r7, r5)
            goto Lc2
        L9e:
            java.lang.Class<java.time.LocalDate> r9 = java.time.LocalDate.class
            if (r8 != r9) goto Laf
            java.lang.Class r8 = r6.fieldClass
            if (r8 != r10) goto Laf
            java.time.LocalDate r7 = (java.time.LocalDate) r7
            java.lang.String r5 = r5.format
            java.lang.String r7 = com.alibaba.fastjson2.util.DateUtils.format(r7, r5)
            goto Lc2
        Laf:
            if (r7 == 0) goto Lc2
            java.lang.Class r5 = r7.getClass()
            boolean r5 = r6.supportAcceptType(r5)
            if (r5 == 0) goto Lbc
            goto Lc2
        Lbc:
            com.alibaba.fastjson2.JSONWriter$Feature[] r5 = new com.alibaba.fastjson2.JSONWriter.Feature[r2]
            java.lang.Object r7 = copy(r7, r5)
        Lc2:
            r6.accept(r3, r7)
        Lc5:
            int r4 = r4 + 1
            goto L70
        Lc8:
            return r3
        Lc9:
            com.alibaba.fastjson2.JSONWriter r9 = com.alibaba.fastjson2.JSONWriter.ofJSONB(r0)
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName     // Catch: java.lang.Throwable -> L11c
            com.alibaba.fastjson2.JSONWriter$Feature[] r0 = new com.alibaba.fastjson2.JSONWriter.Feature[]{r0}     // Catch: java.lang.Throwable -> L11c
            r9.config(r0)     // Catch: java.lang.Throwable -> L11c
            r12 = 0
            r13 = 0
            r11 = 0
            r10 = r15
            r8.writeJSONB(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L11c
            byte[] r15 = r9.getBytes()     // Catch: java.lang.Throwable -> L11c
            r9.close()
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.SupportClassForName
            com.alibaba.fastjson2.JSONReader$Feature[] r0 = new com.alibaba.fastjson2.JSONReader.Feature[]{r0, r2}
            com.alibaba.fastjson2.JSONReader r10 = com.alibaba.fastjson2.JSONReader.ofJSONB(r15, r0)
            if (r7 == 0) goto L102
            com.alibaba.fastjson2.JSONReader$Context r15 = r10.context     // Catch: java.lang.Throwable -> Lff
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.SupportArrayToBean     // Catch: java.lang.Throwable -> Lff
            com.alibaba.fastjson2.JSONReader$Feature[] r0 = new com.alibaba.fastjson2.JSONReader.Feature[]{r0}     // Catch: java.lang.Throwable -> Lff
            r15.config(r0)     // Catch: java.lang.Throwable -> Lff
            goto L102
        Lff:
            r0 = move-exception
            r15 = r0
            goto L111
        L102:
            r12 = 0
            r13 = 0
            r11 = 0
            r9 = r1
            java.lang.Object r15 = r9.readJSONBObject(r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lff
            if (r10 == 0) goto L110
            r10.close()
        L110:
            return r15
        L111:
            if (r10 == 0) goto L11b
            r10.close()     // Catch: java.lang.Throwable -> L117
            goto L11b
        L117:
            r0 = move-exception
            r15.addSuppressed(r0)
        L11b:
            throw r15
        L11c:
            r0 = move-exception
            r15 = r0
            if (r9 == 0) goto L128
            r9.close()     // Catch: java.lang.Throwable -> L124
            goto L128
        L124:
            r0 = move-exception
            r15.addSuppressed(r0)
        L128:
            throw r15
    }

    static boolean isEnabled(com.alibaba.fastjson2.JSONReader.Feature r4) {
            long r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures
            long r2 = r4.mask
            long r0 = r0 & r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r4 = 1
            return r4
        Ld:
            r4 = 0
            return r4
    }

    static boolean isEnabled(com.alibaba.fastjson2.JSONWriter.Feature r4) {
            long r0 = com.alibaba.fastjson2.JSONFactory.defaultWriterFeatures
            long r2 = r4.mask
            long r0 = r0 & r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld
            r4 = 1
            return r4
        Ld:
            r4 = 0
            return r4
    }

    static boolean isValid(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto L2f
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto La
            goto L2f
        La:
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.of(r2)     // Catch: com.alibaba.fastjson2.JSONException -> L2f
            r2.skipValue()     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r2.isEnd()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            boolean r1 = r2.comma     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            r1 = 1
            goto L20
        L1d:
            r1 = move-exception
            goto L24
        L1f:
            r1 = r0
        L20:
            r2.close()     // Catch: com.alibaba.fastjson2.JSONException -> L2f
            return r1
        L24:
            if (r2 == 0) goto L2e
            r2.close()     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L2a:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: com.alibaba.fastjson2.JSONException -> L2f
        L2e:
            throw r1     // Catch: com.alibaba.fastjson2.JSONException -> L2f
        L2f:
            return r0
    }

    static boolean isValid(java.lang.String r2, com.alibaba.fastjson2.JSONReader.Feature... r3) {
            r0 = 0
            if (r2 == 0) goto L33
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto La
            goto L33
        La:
            com.alibaba.fastjson2.JSONReader$Context r3 = com.alibaba.fastjson2.JSONFactory.createReadContext(r3)     // Catch: java.lang.Throwable -> L33
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.of(r2, r3)     // Catch: java.lang.Throwable -> L33
            r2.skipValue()     // Catch: java.lang.Throwable -> L21
            boolean r3 = r2.isEnd()     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L23
            boolean r3 = r2.comma     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L23
            r3 = 1
            goto L24
        L21:
            r3 = move-exception
            goto L28
        L23:
            r3 = r0
        L24:
            r2.close()     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L33
            return r3
        L28:
            if (r2 == 0) goto L32
            r2.close()     // Catch: java.lang.Throwable -> L2e
            goto L32
        L2e:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L33
        L32:
            throw r3     // Catch: java.lang.Throwable -> L33 java.lang.Throwable -> L33
        L33:
            return r0
    }

    static boolean isValid(byte[] r2) {
            r0 = 0
            if (r2 == 0) goto L2c
            int r1 = r2.length
            if (r1 != 0) goto L7
            goto L2c
        L7:
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.of(r2)     // Catch: com.alibaba.fastjson2.JSONException -> L2c
            r2.skipValue()     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r2.isEnd()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            boolean r1 = r2.comma     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1c
            r1 = 1
            goto L1d
        L1a:
            r1 = move-exception
            goto L21
        L1c:
            r1 = r0
        L1d:
            r2.close()     // Catch: com.alibaba.fastjson2.JSONException -> L2c
            return r1
        L21:
            if (r2 == 0) goto L2b
            r2.close()     // Catch: java.lang.Throwable -> L27
            goto L2b
        L27:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: com.alibaba.fastjson2.JSONException -> L2c
        L2b:
            throw r1     // Catch: com.alibaba.fastjson2.JSONException -> L2c
        L2c:
            return r0
    }

    static boolean isValid(byte[] r2, int r3, int r4, java.nio.charset.Charset r5) {
            r0 = 0
            if (r2 == 0) goto L2e
            int r1 = r2.length
            if (r1 == 0) goto L2e
            if (r4 != 0) goto L9
            goto L2e
        L9:
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.of(r2, r3, r4, r5)     // Catch: com.alibaba.fastjson2.JSONException -> L2e
            r2.skipValue()     // Catch: java.lang.Throwable -> L1c
            boolean r3 = r2.isEnd()     // Catch: java.lang.Throwable -> L1c
            if (r3 == 0) goto L1e
            boolean r3 = r2.comma     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L1e
            r3 = 1
            goto L1f
        L1c:
            r3 = move-exception
            goto L23
        L1e:
            r3 = r0
        L1f:
            r2.close()     // Catch: com.alibaba.fastjson2.JSONException -> L2e
            return r3
        L23:
            if (r2 == 0) goto L2d
            r2.close()     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: com.alibaba.fastjson2.JSONException -> L2e
        L2d:
            throw r3     // Catch: com.alibaba.fastjson2.JSONException -> L2e
        L2e:
            return r0
    }

    static boolean isValid(byte[] r2, java.nio.charset.Charset r3) {
            r0 = 0
            if (r2 == 0) goto Ld
            int r1 = r2.length
            if (r1 != 0) goto L7
            goto Ld
        L7:
            int r1 = r2.length
            boolean r2 = isValid(r2, r0, r1, r3)
            return r2
        Ld:
            return r0
    }

    static boolean isValid(char[] r2) {
            r0 = 0
            if (r2 == 0) goto L2c
            int r1 = r2.length
            if (r1 != 0) goto L7
            goto L2c
        L7:
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.of(r2)     // Catch: com.alibaba.fastjson2.JSONException -> L2c
            r2.skipValue()     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r2.isEnd()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1c
            boolean r1 = r2.comma     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L1c
            r1 = 1
            goto L1d
        L1a:
            r1 = move-exception
            goto L21
        L1c:
            r1 = r0
        L1d:
            r2.close()     // Catch: com.alibaba.fastjson2.JSONException -> L2c
            return r1
        L21:
            if (r2 == 0) goto L2b
            r2.close()     // Catch: java.lang.Throwable -> L27
            goto L2b
        L27:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: com.alibaba.fastjson2.JSONException -> L2c
        L2b:
            throw r1     // Catch: com.alibaba.fastjson2.JSONException -> L2c
        L2c:
            return r0
    }

    static boolean isValidArray(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto L39
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto La
            goto L39
        La:
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.of(r2)     // Catch: com.alibaba.fastjson2.JSONException -> L39
            boolean r1 = r2.isArray()     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L18
            r2.close()     // Catch: com.alibaba.fastjson2.JSONException -> L39
            return r0
        L18:
            r2.skipValue()     // Catch: java.lang.Throwable -> L27
            boolean r1 = r2.isEnd()     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L29
            boolean r1 = r2.comma     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L29
            r1 = 1
            goto L2a
        L27:
            r1 = move-exception
            goto L2e
        L29:
            r1 = r0
        L2a:
            r2.close()     // Catch: com.alibaba.fastjson2.JSONException -> L39
            return r1
        L2e:
            if (r2 == 0) goto L38
            r2.close()     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: com.alibaba.fastjson2.JSONException -> L39
        L38:
            throw r1     // Catch: com.alibaba.fastjson2.JSONException -> L39
        L39:
            return r0
    }

    static boolean isValidArray(byte[] r2) {
            r0 = 0
            if (r2 == 0) goto L36
            int r1 = r2.length
            if (r1 != 0) goto L7
            goto L36
        L7:
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.of(r2)     // Catch: com.alibaba.fastjson2.JSONException -> L36
            boolean r1 = r2.isArray()     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L15
            r2.close()     // Catch: com.alibaba.fastjson2.JSONException -> L36
            return r0
        L15:
            r2.skipValue()     // Catch: java.lang.Throwable -> L24
            boolean r1 = r2.isEnd()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            boolean r1 = r2.comma     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L26
            r1 = 1
            goto L27
        L24:
            r1 = move-exception
            goto L2b
        L26:
            r1 = r0
        L27:
            r2.close()     // Catch: com.alibaba.fastjson2.JSONException -> L36
            return r1
        L2b:
            if (r2 == 0) goto L35
            r2.close()     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: com.alibaba.fastjson2.JSONException -> L36
        L35:
            throw r1     // Catch: com.alibaba.fastjson2.JSONException -> L36
        L36:
            return r0
    }

    static boolean isValidObject(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto L39
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto La
            goto L39
        La:
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.of(r2)     // Catch: com.alibaba.fastjson2.JSONException -> L39
            boolean r1 = r2.isObject()     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L18
            r2.close()     // Catch: com.alibaba.fastjson2.JSONException -> L39
            return r0
        L18:
            r2.skipValue()     // Catch: java.lang.Throwable -> L27
            boolean r1 = r2.isEnd()     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L29
            boolean r1 = r2.comma     // Catch: java.lang.Throwable -> L27
            if (r1 != 0) goto L29
            r1 = 1
            goto L2a
        L27:
            r1 = move-exception
            goto L2e
        L29:
            r1 = r0
        L2a:
            r2.close()     // Catch: com.alibaba.fastjson2.JSONException -> L39
            return r1
        L2e:
            if (r2 == 0) goto L38
            r2.close()     // Catch: java.lang.Throwable -> L34
            goto L38
        L34:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: com.alibaba.fastjson2.JSONException -> L39
        L38:
            throw r1     // Catch: com.alibaba.fastjson2.JSONException -> L39
        L39:
            return r0
    }

    static boolean isValidObject(byte[] r2) {
            r0 = 0
            if (r2 == 0) goto L36
            int r1 = r2.length
            if (r1 != 0) goto L7
            goto L36
        L7:
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.of(r2)     // Catch: com.alibaba.fastjson2.JSONException -> L36
            boolean r1 = r2.isObject()     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L15
            r2.close()     // Catch: com.alibaba.fastjson2.JSONException -> L36
            return r0
        L15:
            r2.skipValue()     // Catch: java.lang.Throwable -> L24
            boolean r1 = r2.isEnd()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            boolean r1 = r2.comma     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L26
            r1 = 1
            goto L27
        L24:
            r1 = move-exception
            goto L2b
        L26:
            r1 = r0
        L27:
            r2.close()     // Catch: com.alibaba.fastjson2.JSONException -> L36
            return r1
        L2b:
            if (r2 == 0) goto L35
            r2.close()     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: com.alibaba.fastjson2.JSONException -> L36
        L35:
            throw r1     // Catch: com.alibaba.fastjson2.JSONException -> L36
        L36:
            return r0
    }

    static void mixIn(java.lang.Class<?> r1, java.lang.Class<?> r2) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r0.mixIn(r1, r2)
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r0.mixIn(r1, r2)
            return
    }

    static java.lang.Object parse(java.io.InputStream r7, com.alibaba.fastjson2.JSONReader.Context r8) {
            if (r7 != 0) goto L4
            r7 = 0
            return r7
        L4:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            com.alibaba.fastjson2.reader.ObjectReader r1 = r8.getObjectReader(r0)
            com.alibaba.fastjson2.JSONReaderUTF8 r2 = new com.alibaba.fastjson2.JSONReaderUTF8
            r2.<init>(r8, r7)
            r4 = 0
            r5 = 0
            r3 = 0
            java.lang.Object r7 = r1.readObject(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L37
            char r0 = r2.f1814ch     // Catch: java.lang.Throwable -> L37
            r1 = 26
            if (r0 == r1) goto L3a
            long r0 = r8.features     // Catch: java.lang.Throwable -> L37
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L37
            long r3 = r8.mask     // Catch: java.lang.Throwable -> L37
            long r0 = r0 & r3
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 == 0) goto L2b
            goto L3a
        L2b:
            com.alibaba.fastjson2.JSONException r7 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L37
            java.lang.String r8 = "input not end"
            java.lang.String r8 = r2.info(r8)     // Catch: java.lang.Throwable -> L37
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L37
            throw r7     // Catch: java.lang.Throwable -> L37
        L37:
            r0 = move-exception
            r7 = r0
            goto L3e
        L3a:
            r2.close()
            return r7
        L3e:
            r2.close()     // Catch: java.lang.Throwable -> L42
            goto L47
        L42:
            r0 = move-exception
            r8 = r0
            r7.addSuppressed(r8)
        L47:
            throw r7
    }

    static java.lang.Object parse(java.lang.String r12) {
            if (r12 == 0) goto L91
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto La
            goto L91
        La:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectReaderProvider()
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0)
            com.alibaba.fastjson2.JSONReaderUTF16 r3 = new com.alibaba.fastjson2.JSONReaderUTF16
            int r2 = r12.length()
            r4 = 0
            r3.<init>(r1, r12, r4, r2)
            char r12 = r3.current()     // Catch: java.lang.Throwable -> L45
            java.util.function.Supplier<java.util.Map> r2 = r1.objectSupplier     // Catch: java.lang.Throwable -> L45
            r8 = 0
            if (r2 != 0) goto L58
            long r5 = r1.features     // Catch: java.lang.Throwable -> L45
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.UseNativeObject     // Catch: java.lang.Throwable -> L45
            long r10 = r2.mask     // Catch: java.lang.Throwable -> L45
            long r5 = r5 & r10
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 != 0) goto L58
            r2 = 123(0x7b, float:1.72E-43)
            if (r12 == r2) goto L3a
            r5 = 91
            if (r12 != r5) goto L58
        L3a:
            if (r12 != r2) goto L48
            com.alibaba.fastjson2.JSONObject r12 = new com.alibaba.fastjson2.JSONObject     // Catch: java.lang.Throwable -> L45
            r12.<init>()     // Catch: java.lang.Throwable -> L45
            r3.read(r12, r8)     // Catch: java.lang.Throwable -> L45
            goto L50
        L45:
            r0 = move-exception
            r12 = r0
            goto L88
        L48:
            com.alibaba.fastjson2.JSONArray r12 = new com.alibaba.fastjson2.JSONArray     // Catch: java.lang.Throwable -> L45
            r12.<init>()     // Catch: java.lang.Throwable -> L45
            r3.read(r12)     // Catch: java.lang.Throwable -> L45
        L50:
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r3.resolveTasks     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L66
            r3.handleResolveTasks(r12)     // Catch: java.lang.Throwable -> L45
            goto L66
        L58:
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r12, r4)     // Catch: java.lang.Throwable -> L45
            r5 = 0
            r6 = 0
            r4 = 0
            java.lang.Object r12 = r2.readObject(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L45
        L66:
            char r0 = r3.f1814ch     // Catch: java.lang.Throwable -> L45
            r2 = 26
            if (r0 == r2) goto L84
            long r0 = r1.features     // Catch: java.lang.Throwable -> L45
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L45
            long r4 = r2.mask     // Catch: java.lang.Throwable -> L45
            long r0 = r0 & r4
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L78
            goto L84
        L78:
            com.alibaba.fastjson2.JSONException r12 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r3.info(r0)     // Catch: java.lang.Throwable -> L45
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L45
            throw r12     // Catch: java.lang.Throwable -> L45
        L84:
            r3.close()
            return r12
        L88:
            r3.close()     // Catch: java.lang.Throwable -> L8c
            goto L90
        L8c:
            r0 = move-exception
            r12.addSuppressed(r0)
        L90:
            throw r12
        L91:
            r12 = 0
            return r12
    }

    static java.lang.Object parse(java.lang.String r9, int r10, int r11, com.alibaba.fastjson2.JSONReader.Feature... r12) {
            if (r9 == 0) goto L5a
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L5a
            if (r11 != 0) goto Lb
            goto L5a
        Lb:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectReaderProvider()
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r12)
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            r2 = 0
            com.alibaba.fastjson2.reader.ObjectReader r3 = r0.getObjectReader(r12, r2)
            com.alibaba.fastjson2.JSONReader r4 = com.alibaba.fastjson2.JSONReader.of(r9, r10, r11, r1)
            r6 = 0
            r7 = 0
            r5 = 0
            java.lang.Object r9 = r3.readObject(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L47
            char r10 = r4.f1814ch     // Catch: java.lang.Throwable -> L47
            r11 = 26
            if (r10 == r11) goto L4a
            long r10 = r1.features     // Catch: java.lang.Throwable -> L47
            com.alibaba.fastjson2.JSONReader$Feature r12 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L47
            long r0 = r12.mask     // Catch: java.lang.Throwable -> L47
            long r10 = r10 & r0
            r0 = 0
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 == 0) goto L3b
            goto L4a
        L3b:
            com.alibaba.fastjson2.JSONException r9 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L47
            java.lang.String r10 = "input not end"
            java.lang.String r10 = r4.info(r10)     // Catch: java.lang.Throwable -> L47
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L47
            throw r9     // Catch: java.lang.Throwable -> L47
        L47:
            r0 = move-exception
            r9 = r0
            goto L4e
        L4a:
            r4.close()
            return r9
        L4e:
            if (r4 == 0) goto L59
            r4.close()     // Catch: java.lang.Throwable -> L54
            goto L59
        L54:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L59:
            throw r9
        L5a:
            r9 = 0
            return r9
    }

    static java.lang.Object parse(java.lang.String r7, com.alibaba.fastjson2.JSONReader.Context r8) {
            if (r7 == 0) goto L52
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L9
            goto L52
        L9:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            com.alibaba.fastjson2.reader.ObjectReader r1 = r8.getObjectReader(r0)
            com.alibaba.fastjson2.JSONReaderUTF16 r2 = new com.alibaba.fastjson2.JSONReaderUTF16
            r0 = 0
            int r3 = r7.length()
            r2.<init>(r8, r7, r0, r3)
            r4 = 0
            r5 = 0
            r3 = 0
            java.lang.Object r7 = r1.readObject(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L41
            char r0 = r2.f1814ch     // Catch: java.lang.Throwable -> L41
            r1 = 26
            if (r0 == r1) goto L44
            long r0 = r8.features     // Catch: java.lang.Throwable -> L41
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L41
            long r3 = r8.mask     // Catch: java.lang.Throwable -> L41
            long r0 = r0 & r3
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 == 0) goto L35
            goto L44
        L35:
            com.alibaba.fastjson2.JSONException r7 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L41
            java.lang.String r8 = "input not end"
            java.lang.String r8 = r2.info(r8)     // Catch: java.lang.Throwable -> L41
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L41
            throw r7     // Catch: java.lang.Throwable -> L41
        L41:
            r0 = move-exception
            r7 = r0
            goto L48
        L44:
            r2.close()
            return r7
        L48:
            r2.close()     // Catch: java.lang.Throwable -> L4c
            goto L51
        L4c:
            r0 = move-exception
            r8 = r0
            r7.addSuppressed(r8)
        L51:
            throw r7
        L52:
            r7 = 0
            return r7
    }

    static java.lang.Object parse(java.lang.String r9, com.alibaba.fastjson2.JSONReader.Feature... r10) {
            if (r9 == 0) goto L5b
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L9
            goto L5b
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectReaderProvider()
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r10)
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            r2 = 0
            com.alibaba.fastjson2.reader.ObjectReader r3 = r0.getObjectReader(r10, r2)
            com.alibaba.fastjson2.JSONReaderUTF16 r4 = new com.alibaba.fastjson2.JSONReaderUTF16
            int r10 = r9.length()
            r4.<init>(r1, r9, r2, r10)
            r6 = 0
            r7 = 0
            r5 = 0
            java.lang.Object r9 = r3.readObject(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4a
            char r10 = r4.f1814ch     // Catch: java.lang.Throwable -> L4a
            r0 = 26
            if (r10 == r0) goto L4d
            long r0 = r1.features     // Catch: java.lang.Throwable -> L4a
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L4a
            long r2 = r10.mask     // Catch: java.lang.Throwable -> L4a
            long r0 = r0 & r2
            r2 = 0
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L3e
            goto L4d
        L3e:
            com.alibaba.fastjson2.JSONException r9 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r10 = "input not end"
            java.lang.String r10 = r4.info(r10)     // Catch: java.lang.Throwable -> L4a
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L4a
            throw r9     // Catch: java.lang.Throwable -> L4a
        L4a:
            r0 = move-exception
            r9 = r0
            goto L51
        L4d:
            r4.close()
            return r9
        L51:
            r4.close()     // Catch: java.lang.Throwable -> L55
            goto L5a
        L55:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L5a:
            throw r9
        L5b:
            r9 = 0
            return r9
    }

    static java.lang.Object parse(byte[] r7, int r8, int r9, java.nio.charset.Charset r10, com.alibaba.fastjson2.JSONReader.Context r11) {
            if (r7 == 0) goto L4b
            int r0 = r7.length
            if (r0 != 0) goto L6
            goto L4b
        L6:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            com.alibaba.fastjson2.reader.ObjectReader r1 = r11.getObjectReader(r0)
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.of(r7, r8, r9, r10, r11)
            r4 = 0
            r5 = 0
            r3 = 0
            java.lang.Object r7 = r1.readObject(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L38
            char r8 = r2.f1814ch     // Catch: java.lang.Throwable -> L38
            r9 = 26
            if (r8 == r9) goto L3b
            long r8 = r11.features     // Catch: java.lang.Throwable -> L38
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L38
            long r10 = r10.mask     // Catch: java.lang.Throwable -> L38
            long r8 = r8 & r10
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L2c
            goto L3b
        L2c:
            com.alibaba.fastjson2.JSONException r7 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = "input not end"
            java.lang.String r8 = r2.info(r8)     // Catch: java.lang.Throwable -> L38
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L38
            throw r7     // Catch: java.lang.Throwable -> L38
        L38:
            r0 = move-exception
            r7 = r0
            goto L3f
        L3b:
            r2.close()
            return r7
        L3f:
            if (r2 == 0) goto L4a
            r2.close()     // Catch: java.lang.Throwable -> L45
            goto L4a
        L45:
            r0 = move-exception
            r8 = r0
            r7.addSuppressed(r8)
        L4a:
            throw r7
        L4b:
            r7 = 0
            return r7
    }

    static java.lang.Object parse(byte[] r8, com.alibaba.fastjson2.JSONReader.Context r9) {
            if (r8 == 0) goto L50
            int r0 = r8.length
            if (r0 != 0) goto L6
            goto L50
        L6:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            com.alibaba.fastjson2.reader.ObjectReader r1 = r9.getObjectReader(r0)
            com.alibaba.fastjson2.JSONReaderUTF8 r2 = new com.alibaba.fastjson2.JSONReaderUTF8
            r6 = 0
            int r7 = r8.length
            r4 = 0
            r5 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r8 = r3
            r4 = 0
            r5 = 0
            r3 = 0
            java.lang.Object r9 = r1.readObject(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L3f
            char r0 = r2.f1814ch     // Catch: java.lang.Throwable -> L3f
            r1 = 26
            if (r0 == r1) goto L42
            long r0 = r8.features     // Catch: java.lang.Throwable -> L3f
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L3f
            long r3 = r8.mask     // Catch: java.lang.Throwable -> L3f
            long r0 = r0 & r3
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 == 0) goto L33
            goto L42
        L33:
            com.alibaba.fastjson2.JSONException r8 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L3f
            java.lang.String r9 = "input not end"
            java.lang.String r9 = r2.info(r9)     // Catch: java.lang.Throwable -> L3f
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L3f
            throw r8     // Catch: java.lang.Throwable -> L3f
        L3f:
            r0 = move-exception
            r8 = r0
            goto L46
        L42:
            r2.close()
            return r9
        L46:
            r2.close()     // Catch: java.lang.Throwable -> L4a
            goto L4f
        L4a:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)
        L4f:
            throw r8
        L50:
            r8 = 0
            return r8
    }

    static java.lang.Object parse(byte[] r9, com.alibaba.fastjson2.JSONReader.Feature... r10) {
            if (r9 == 0) goto L5d
            int r0 = r9.length
            if (r0 != 0) goto L6
            goto L5d
        L6:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectReaderProvider()
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r0, r10)
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            r1 = 0
            com.alibaba.fastjson2.reader.ObjectReader r10 = r0.getObjectReader(r10, r1)
            com.alibaba.fastjson2.JSONReaderUTF8 r1 = new com.alibaba.fastjson2.JSONReaderUTF8
            r5 = 0
            int r6 = r9.length
            r3 = 0
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r10
            r4 = r1
            java.lang.Object r9 = r3.readObject(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L50
            char r10 = r1.f1814ch     // Catch: java.lang.Throwable -> L49
            r0 = 26
            if (r10 == r0) goto L4c
            long r2 = r2.features     // Catch: java.lang.Throwable -> L49
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L49
            long r4 = r10.mask     // Catch: java.lang.Throwable -> L49
            long r2 = r2 & r4
            r4 = 0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 == 0) goto L3d
            goto L4c
        L3d:
            com.alibaba.fastjson2.JSONException r9 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L49
            java.lang.String r10 = "input not end"
            java.lang.String r10 = r1.info(r10)     // Catch: java.lang.Throwable -> L49
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L49
            throw r9     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
        L4a:
            r9 = r0
            goto L53
        L4c:
            r1.close()
            return r9
        L50:
            r0 = move-exception
            r1 = r4
            goto L4a
        L53:
            r1.close()     // Catch: java.lang.Throwable -> L57
            goto L5c
        L57:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L5c:
            throw r9
        L5d:
            r9 = 0
            return r9
    }

    static java.lang.Object parse(char[] r7, com.alibaba.fastjson2.JSONReader.Context r8) {
            if (r7 == 0) goto L4b
            int r0 = r7.length
            if (r0 != 0) goto L6
            goto L4b
        L6:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            com.alibaba.fastjson2.reader.ObjectReader r1 = r8.getObjectReader(r0)
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.of(r7, r8)
            r4 = 0
            r5 = 0
            r3 = 0
            java.lang.Object r7 = r1.readObject(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L38
            char r0 = r2.f1814ch     // Catch: java.lang.Throwable -> L38
            r1 = 26
            if (r0 == r1) goto L3b
            long r0 = r8.features     // Catch: java.lang.Throwable -> L38
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L38
            long r3 = r8.mask     // Catch: java.lang.Throwable -> L38
            long r0 = r0 & r3
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 == 0) goto L2c
            goto L3b
        L2c:
            com.alibaba.fastjson2.JSONException r7 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = "input not end"
            java.lang.String r8 = r2.info(r8)     // Catch: java.lang.Throwable -> L38
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L38
            throw r7     // Catch: java.lang.Throwable -> L38
        L38:
            r0 = move-exception
            r7 = r0
            goto L3f
        L3b:
            r2.close()
            return r7
        L3f:
            if (r2 == 0) goto L4a
            r2.close()     // Catch: java.lang.Throwable -> L45
            goto L4a
        L45:
            r0 = move-exception
            r8 = r0
            r7.addSuppressed(r8)
        L4a:
            throw r7
        L4b:
            r7 = 0
            return r7
    }

    static java.lang.Object parse(char[] r9, com.alibaba.fastjson2.JSONReader.Feature... r10) {
            if (r9 == 0) goto L5d
            int r0 = r9.length
            if (r0 != 0) goto L6
            goto L5d
        L6:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectReaderProvider()
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r0, r10)
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            r1 = 0
            com.alibaba.fastjson2.reader.ObjectReader r10 = r0.getObjectReader(r10, r1)
            com.alibaba.fastjson2.JSONReaderUTF16 r1 = new com.alibaba.fastjson2.JSONReaderUTF16
            r5 = 0
            int r6 = r9.length
            r3 = 0
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r10
            r4 = r1
            java.lang.Object r9 = r3.readObject(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L50
            char r10 = r1.f1814ch     // Catch: java.lang.Throwable -> L49
            r0 = 26
            if (r10 == r0) goto L4c
            long r2 = r2.features     // Catch: java.lang.Throwable -> L49
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L49
            long r4 = r10.mask     // Catch: java.lang.Throwable -> L49
            long r2 = r2 & r4
            r4 = 0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 == 0) goto L3d
            goto L4c
        L3d:
            com.alibaba.fastjson2.JSONException r9 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L49
            java.lang.String r10 = "input not end"
            java.lang.String r10 = r1.info(r10)     // Catch: java.lang.Throwable -> L49
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L49
            throw r9     // Catch: java.lang.Throwable -> L49
        L49:
            r0 = move-exception
        L4a:
            r9 = r0
            goto L53
        L4c:
            r1.close()
            return r9
        L50:
            r0 = move-exception
            r1 = r4
            goto L4a
        L53:
            r1.close()     // Catch: java.lang.Throwable -> L57
            goto L5c
        L57:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L5c:
            throw r9
        L5d:
            r9 = 0
            return r9
    }

    static com.alibaba.fastjson2.JSONArray parseArray(java.io.InputStream r4, java.nio.charset.Charset r5, com.alibaba.fastjson2.JSONReader.Context r6) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.alibaba.fastjson2.JSONReader r4 = com.alibaba.fastjson2.JSONReader.of(r4, r5, r6)
            boolean r5 = r4.nextIfNull()     // Catch: java.lang.Throwable -> L22
            if (r5 == 0) goto L12
            r4.close()
            return r0
        L12:
            com.alibaba.fastjson2.JSONArray r5 = new com.alibaba.fastjson2.JSONArray     // Catch: java.lang.Throwable -> L22
            r5.<init>()     // Catch: java.lang.Throwable -> L22
            r4.read(r5)     // Catch: java.lang.Throwable -> L22
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r4.resolveTasks     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L24
            r4.handleResolveTasks(r5)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r5 = move-exception
            goto L48
        L24:
            char r0 = r4.f1814ch     // Catch: java.lang.Throwable -> L22
            r1 = 26
            if (r0 == r1) goto L44
            long r0 = r6.features     // Catch: java.lang.Throwable -> L22
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L22
            long r2 = r6.mask     // Catch: java.lang.Throwable -> L22
            long r0 = r0 & r2
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L38
            goto L44
        L38:
            com.alibaba.fastjson2.JSONException r5 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L22
            java.lang.String r6 = "input not end"
            java.lang.String r6 = r4.info(r6)     // Catch: java.lang.Throwable -> L22
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L22
            throw r5     // Catch: java.lang.Throwable -> L22
        L44:
            r4.close()
            return r5
        L48:
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e
            goto L52
        L4e:
            r4 = move-exception
            r5.addSuppressed(r4)
        L52:
            throw r5
    }

    static com.alibaba.fastjson2.JSONArray parseArray(java.io.InputStream r4, com.alibaba.fastjson2.JSONReader.Feature... r5) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r1, r5)
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            com.alibaba.fastjson2.JSONReader r4 = com.alibaba.fastjson2.JSONReader.of(r4, r5, r2)
            boolean r5 = r4.nextIfNull()     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L1b
            r4.close()
            return r0
        L1b:
            com.alibaba.fastjson2.JSONArray r5 = new com.alibaba.fastjson2.JSONArray     // Catch: java.lang.Throwable -> L2b
            r5.<init>()     // Catch: java.lang.Throwable -> L2b
            r4.read(r5)     // Catch: java.lang.Throwable -> L2b
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r4.resolveTasks     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2d
            r4.handleResolveTasks(r5)     // Catch: java.lang.Throwable -> L2b
            goto L2d
        L2b:
            r5 = move-exception
            goto L51
        L2d:
            char r0 = r4.f1814ch     // Catch: java.lang.Throwable -> L2b
            r1 = 26
            if (r0 == r1) goto L4d
            long r0 = r2.features     // Catch: java.lang.Throwable -> L2b
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L2b
            long r2 = r2.mask     // Catch: java.lang.Throwable -> L2b
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L41
            goto L4d
        L41:
            com.alibaba.fastjson2.JSONException r5 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r4.info(r0)     // Catch: java.lang.Throwable -> L2b
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            throw r5     // Catch: java.lang.Throwable -> L2b
        L4d:
            r4.close()
            return r5
        L51:
            if (r4 == 0) goto L5b
            r4.close()     // Catch: java.lang.Throwable -> L57
            goto L5b
        L57:
            r4 = move-exception
            r5.addSuppressed(r4)
        L5b:
            throw r5
    }

    static com.alibaba.fastjson2.JSONArray parseArray(java.lang.String r6) {
            r0 = 0
            if (r6 == 0) goto L64
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto La
            goto L64
        La:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r1)
            com.alibaba.fastjson2.JSONReaderUTF16 r1 = new com.alibaba.fastjson2.JSONReaderUTF16
            r3 = 0
            int r4 = r6.length()
            r1.<init>(r2, r6, r3, r4)
            boolean r6 = r1.nextIfNull()     // Catch: java.lang.Throwable -> L35
            if (r6 == 0) goto L25
            r1.close()
            return r0
        L25:
            com.alibaba.fastjson2.JSONArray r6 = new com.alibaba.fastjson2.JSONArray     // Catch: java.lang.Throwable -> L35
            r6.<init>()     // Catch: java.lang.Throwable -> L35
            r1.read(r6)     // Catch: java.lang.Throwable -> L35
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r1.resolveTasks     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L37
            r1.handleResolveTasks(r6)     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r6 = move-exception
            goto L5b
        L37:
            char r0 = r1.f1814ch     // Catch: java.lang.Throwable -> L35
            r3 = 26
            if (r0 == r3) goto L57
            long r2 = r2.features     // Catch: java.lang.Throwable -> L35
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L35
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L35
            long r2 = r2 & r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L4b
            goto L57
        L4b:
            com.alibaba.fastjson2.JSONException r6 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r1.info(r0)     // Catch: java.lang.Throwable -> L35
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L35
            throw r6     // Catch: java.lang.Throwable -> L35
        L57:
            r1.close()
            return r6
        L5b:
            r1.close()     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r0 = move-exception
            r6.addSuppressed(r0)
        L63:
            throw r6
        L64:
            return r0
    }

    static com.alibaba.fastjson2.JSONArray parseArray(java.lang.String r4, com.alibaba.fastjson2.JSONReader.Feature... r5) {
            r0 = 0
            if (r4 == 0) goto L64
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto La
            goto L64
        La:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r1, r5)
            com.alibaba.fastjson2.JSONReaderUTF16 r5 = new com.alibaba.fastjson2.JSONReaderUTF16
            r1 = 0
            int r3 = r4.length()
            r5.<init>(r2, r4, r1, r3)
            boolean r4 = r5.nextIfNull()     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L25
            r5.close()
            return r0
        L25:
            com.alibaba.fastjson2.JSONArray r4 = new com.alibaba.fastjson2.JSONArray     // Catch: java.lang.Throwable -> L35
            r4.<init>()     // Catch: java.lang.Throwable -> L35
            r5.read(r4)     // Catch: java.lang.Throwable -> L35
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r5.resolveTasks     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L37
            r5.handleResolveTasks(r4)     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r4 = move-exception
            goto L5b
        L37:
            char r0 = r5.f1814ch     // Catch: java.lang.Throwable -> L35
            r1 = 26
            if (r0 == r1) goto L57
            long r0 = r2.features     // Catch: java.lang.Throwable -> L35
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L35
            long r2 = r2.mask     // Catch: java.lang.Throwable -> L35
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L4b
            goto L57
        L4b:
            com.alibaba.fastjson2.JSONException r4 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r5.info(r0)     // Catch: java.lang.Throwable -> L35
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L35
            throw r4     // Catch: java.lang.Throwable -> L35
        L57:
            r5.close()
            return r4
        L5b:
            r5.close()     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r5 = move-exception
            r4.addSuppressed(r5)
        L63:
            throw r4
        L64:
            return r0
    }

    static com.alibaba.fastjson2.JSONArray parseArray(java.net.URL r3, com.alibaba.fastjson2.JSONReader.Feature... r4) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.io.InputStream r0 = r3.openStream()     // Catch: java.io.IOException -> L12
            com.alibaba.fastjson2.JSONArray r4 = parseArray(r0, r4)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L14
            r0.close()     // Catch: java.io.IOException -> L12
            return r4
        L12:
            r4 = move-exception
            goto L21
        L14:
            return r4
        L15:
            r4 = move-exception
            if (r0 == 0) goto L20
            r0.close()     // Catch: java.lang.Throwable -> L1c
            goto L20
        L1c:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.io.IOException -> L12
        L20:
            throw r4     // Catch: java.io.IOException -> L12
        L21:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "JSON#parseArray cannot parse '"
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = "' to '"
            r1.append(r3)
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r3 = com.alibaba.fastjson2.JSONArray.class
            r1.append(r3)
            java.lang.String r3 = "'"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r4)
            throw r0
    }

    static com.alibaba.fastjson2.JSONArray parseArray(byte[] r8) {
            r0 = 0
            if (r8 == 0) goto L61
            int r1 = r8.length
            if (r1 != 0) goto L7
            goto L61
        L7:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r3 = new com.alibaba.fastjson2.JSONReader$Context
            r3.<init>(r1)
            com.alibaba.fastjson2.JSONReaderUTF8 r2 = new com.alibaba.fastjson2.JSONReaderUTF8
            r6 = 0
            int r7 = r8.length
            r4 = 0
            r5 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            boolean r8 = r2.nextIfNull()     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L21
            r2.close()
            return r0
        L21:
            com.alibaba.fastjson2.JSONArray r8 = new com.alibaba.fastjson2.JSONArray     // Catch: java.lang.Throwable -> L31
            r8.<init>()     // Catch: java.lang.Throwable -> L31
            r2.read(r8)     // Catch: java.lang.Throwable -> L31
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r2.resolveTasks     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L34
            r2.handleResolveTasks(r8)     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r0 = move-exception
            r8 = r0
            goto L58
        L34:
            char r0 = r2.f1814ch     // Catch: java.lang.Throwable -> L31
            r1 = 26
            if (r0 == r1) goto L54
            long r0 = r3.features     // Catch: java.lang.Throwable -> L31
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L31
            long r3 = r3.mask     // Catch: java.lang.Throwable -> L31
            long r0 = r0 & r3
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L48
            goto L54
        L48:
            com.alibaba.fastjson2.JSONException r8 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r2.info(r0)     // Catch: java.lang.Throwable -> L31
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L31
            throw r8     // Catch: java.lang.Throwable -> L31
        L54:
            r2.close()
            return r8
        L58:
            r2.close()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r0 = move-exception
            r8.addSuppressed(r0)
        L60:
            throw r8
        L61:
            return r0
    }

    static com.alibaba.fastjson2.JSONArray parseArray(byte[] r3, int r4, int r5, java.nio.charset.Charset r6) {
            r0 = 0
            if (r3 == 0) goto L5f
            int r1 = r3.length
            if (r1 == 0) goto L5f
            if (r5 != 0) goto L9
            goto L5f
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r1)
            com.alibaba.fastjson2.JSONReader r3 = com.alibaba.fastjson2.JSONReader.of(r3, r4, r5, r6, r2)
            boolean r4 = r3.nextIfNull()     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L1e
            r3.close()
            return r0
        L1e:
            com.alibaba.fastjson2.JSONArray r4 = new com.alibaba.fastjson2.JSONArray     // Catch: java.lang.Throwable -> L2e
            r4.<init>()     // Catch: java.lang.Throwable -> L2e
            r3.read(r4)     // Catch: java.lang.Throwable -> L2e
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r5 = r3.resolveTasks     // Catch: java.lang.Throwable -> L2e
            if (r5 == 0) goto L30
            r3.handleResolveTasks(r4)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r4 = move-exception
            goto L54
        L30:
            char r5 = r3.f1814ch     // Catch: java.lang.Throwable -> L2e
            r6 = 26
            if (r5 == r6) goto L50
            long r5 = r2.features     // Catch: java.lang.Throwable -> L2e
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L2e
            long r0 = r0.mask     // Catch: java.lang.Throwable -> L2e
            long r5 = r5 & r0
            r0 = 0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L44
            goto L50
        L44:
            com.alibaba.fastjson2.JSONException r4 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = "input not end"
            java.lang.String r5 = r3.info(r5)     // Catch: java.lang.Throwable -> L2e
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2e
            throw r4     // Catch: java.lang.Throwable -> L2e
        L50:
            r3.close()
            return r4
        L54:
            if (r3 == 0) goto L5e
            r3.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r3 = move-exception
            r4.addSuppressed(r3)
        L5e:
            throw r4
        L5f:
            return r0
    }

    static com.alibaba.fastjson2.JSONArray parseArray(char[] r8) {
            r0 = 0
            if (r8 == 0) goto L61
            int r1 = r8.length
            if (r1 != 0) goto L7
            goto L61
        L7:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r3 = new com.alibaba.fastjson2.JSONReader$Context
            r3.<init>(r1)
            com.alibaba.fastjson2.JSONReaderUTF16 r2 = new com.alibaba.fastjson2.JSONReaderUTF16
            r6 = 0
            int r7 = r8.length
            r4 = 0
            r5 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            boolean r8 = r2.nextIfNull()     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L21
            r2.close()
            return r0
        L21:
            com.alibaba.fastjson2.JSONArray r8 = new com.alibaba.fastjson2.JSONArray     // Catch: java.lang.Throwable -> L31
            r8.<init>()     // Catch: java.lang.Throwable -> L31
            r2.read(r8)     // Catch: java.lang.Throwable -> L31
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r2.resolveTasks     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L34
            r2.handleResolveTasks(r8)     // Catch: java.lang.Throwable -> L31
            goto L34
        L31:
            r0 = move-exception
            r8 = r0
            goto L58
        L34:
            char r0 = r2.f1814ch     // Catch: java.lang.Throwable -> L31
            r1 = 26
            if (r0 == r1) goto L54
            long r0 = r3.features     // Catch: java.lang.Throwable -> L31
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L31
            long r3 = r3.mask     // Catch: java.lang.Throwable -> L31
            long r0 = r0 & r3
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L48
            goto L54
        L48:
            com.alibaba.fastjson2.JSONException r8 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r2.info(r0)     // Catch: java.lang.Throwable -> L31
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L31
            throw r8     // Catch: java.lang.Throwable -> L31
        L54:
            r2.close()
            return r8
        L58:
            r2.close()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r0 = move-exception
            r8.addSuppressed(r0)
        L60:
            throw r8
        L61:
            return r0
    }

    static <T> java.util.List<T> parseArray(java.lang.String r5, java.lang.Class<T> r6) {
            if (r5 == 0) goto L55
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9
            goto L55
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0)
            com.alibaba.fastjson2.JSONReaderUTF16 r0 = new com.alibaba.fastjson2.JSONReaderUTF16
            r2 = 0
            int r3 = r5.length()
            r0.<init>(r1, r5, r2, r3)
            java.util.List r5 = r0.readArray(r6)     // Catch: java.lang.Throwable -> L26
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r6 = r0.resolveTasks     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L28
            r0.handleResolveTasks(r5)     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r5 = move-exception
            goto L4c
        L28:
            char r6 = r0.f1814ch     // Catch: java.lang.Throwable -> L26
            r2 = 26
            if (r6 == r2) goto L48
            long r1 = r1.features     // Catch: java.lang.Throwable -> L26
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L26
            long r3 = r6.mask     // Catch: java.lang.Throwable -> L26
            long r1 = r1 & r3
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L3c
            goto L48
        L3c:
            com.alibaba.fastjson2.JSONException r5 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L26
            java.lang.String r6 = "input not end"
            java.lang.String r6 = r0.info(r6)     // Catch: java.lang.Throwable -> L26
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L26
            throw r5     // Catch: java.lang.Throwable -> L26
        L48:
            r0.close()
            return r5
        L4c:
            r0.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r6 = move-exception
            r5.addSuppressed(r6)
        L54:
            throw r5
        L55:
            r5 = 0
            return r5
    }

    static <T> java.util.List<T> parseArray(java.lang.String r4, java.lang.Class<T> r5, com.alibaba.fastjson2.JSONReader.Feature... r6) {
            if (r4 == 0) goto L55
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L55
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r6)
            com.alibaba.fastjson2.JSONReaderUTF16 r6 = new com.alibaba.fastjson2.JSONReaderUTF16
            r0 = 0
            int r2 = r4.length()
            r6.<init>(r1, r4, r0, r2)
            java.util.List r4 = r6.readArray(r5)     // Catch: java.lang.Throwable -> L26
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r5 = r6.resolveTasks     // Catch: java.lang.Throwable -> L26
            if (r5 == 0) goto L28
            r6.handleResolveTasks(r4)     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r4 = move-exception
            goto L4c
        L28:
            char r5 = r6.f1814ch     // Catch: java.lang.Throwable -> L26
            r0 = 26
            if (r5 == r0) goto L48
            long r0 = r1.features     // Catch: java.lang.Throwable -> L26
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L26
            long r2 = r5.mask     // Catch: java.lang.Throwable -> L26
            long r0 = r0 & r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L3c
            goto L48
        L3c:
            com.alibaba.fastjson2.JSONException r4 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = "input not end"
            java.lang.String r5 = r6.info(r5)     // Catch: java.lang.Throwable -> L26
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L26
            throw r4     // Catch: java.lang.Throwable -> L26
        L48:
            r6.close()
            return r4
        L4c:
            r6.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r5 = move-exception
            r4.addSuppressed(r5)
        L54:
            throw r4
        L55:
            r4 = 0
            return r4
    }

    static <T> java.util.List<T> parseArray(java.lang.String r5, java.lang.reflect.Type r6) {
            if (r5 == 0) goto L55
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9
            goto L55
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0)
            com.alibaba.fastjson2.JSONReaderUTF16 r0 = new com.alibaba.fastjson2.JSONReaderUTF16
            r2 = 0
            int r3 = r5.length()
            r0.<init>(r1, r5, r2, r3)
            java.util.List r5 = r0.readArray(r6)     // Catch: java.lang.Throwable -> L26
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r6 = r0.resolveTasks     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L28
            r0.handleResolveTasks(r5)     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r5 = move-exception
            goto L4c
        L28:
            char r6 = r0.f1814ch     // Catch: java.lang.Throwable -> L26
            r2 = 26
            if (r6 == r2) goto L48
            long r1 = r1.features     // Catch: java.lang.Throwable -> L26
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L26
            long r3 = r6.mask     // Catch: java.lang.Throwable -> L26
            long r1 = r1 & r3
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L3c
            goto L48
        L3c:
            com.alibaba.fastjson2.JSONException r5 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L26
            java.lang.String r6 = "input not end"
            java.lang.String r6 = r0.info(r6)     // Catch: java.lang.Throwable -> L26
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L26
            throw r5     // Catch: java.lang.Throwable -> L26
        L48:
            r0.close()
            return r5
        L4c:
            r0.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r6 = move-exception
            r5.addSuppressed(r6)
        L54:
            throw r5
        L55:
            r5 = 0
            return r5
    }

    static <T> java.util.List<T> parseArray(java.lang.String r4, java.lang.reflect.Type r5, com.alibaba.fastjson2.JSONReader.Feature... r6) {
            if (r4 == 0) goto L55
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L55
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r6)
            com.alibaba.fastjson2.JSONReaderUTF16 r6 = new com.alibaba.fastjson2.JSONReaderUTF16
            r0 = 0
            int r2 = r4.length()
            r6.<init>(r1, r4, r0, r2)
            java.util.List r4 = r6.readArray(r5)     // Catch: java.lang.Throwable -> L26
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r5 = r6.resolveTasks     // Catch: java.lang.Throwable -> L26
            if (r5 == 0) goto L28
            r6.handleResolveTasks(r4)     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r4 = move-exception
            goto L4c
        L28:
            char r5 = r6.f1814ch     // Catch: java.lang.Throwable -> L26
            r0 = 26
            if (r5 == r0) goto L48
            long r0 = r1.features     // Catch: java.lang.Throwable -> L26
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L26
            long r2 = r5.mask     // Catch: java.lang.Throwable -> L26
            long r0 = r0 & r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L3c
            goto L48
        L3c:
            com.alibaba.fastjson2.JSONException r4 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = "input not end"
            java.lang.String r5 = r6.info(r5)     // Catch: java.lang.Throwable -> L26
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L26
            throw r4     // Catch: java.lang.Throwable -> L26
        L48:
            r6.close()
            return r4
        L4c:
            r6.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r5 = move-exception
            r4.addSuppressed(r5)
        L54:
            throw r4
        L55:
            r4 = 0
            return r4
    }

    static <T> java.util.List<T> parseArray(java.lang.String r5, java.lang.reflect.Type... r6) {
            if (r5 == 0) goto L55
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9
            goto L55
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0)
            com.alibaba.fastjson2.JSONReaderUTF16 r0 = new com.alibaba.fastjson2.JSONReaderUTF16
            r2 = 0
            int r3 = r5.length()
            r0.<init>(r1, r5, r2, r3)
            java.util.List r5 = r0.readList(r6)     // Catch: java.lang.Throwable -> L26
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r6 = r0.resolveTasks     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L28
            r0.handleResolveTasks(r5)     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r5 = move-exception
            goto L4c
        L28:
            char r6 = r0.f1814ch     // Catch: java.lang.Throwable -> L26
            r2 = 26
            if (r6 == r2) goto L48
            long r1 = r1.features     // Catch: java.lang.Throwable -> L26
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L26
            long r3 = r6.mask     // Catch: java.lang.Throwable -> L26
            long r1 = r1 & r3
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L3c
            goto L48
        L3c:
            com.alibaba.fastjson2.JSONException r5 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L26
            java.lang.String r6 = "input not end"
            java.lang.String r6 = r0.info(r6)     // Catch: java.lang.Throwable -> L26
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L26
            throw r5     // Catch: java.lang.Throwable -> L26
        L48:
            r0.close()
            return r5
        L4c:
            r0.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r6 = move-exception
            r5.addSuppressed(r6)
        L54:
            throw r5
        L55:
            r5 = 0
            return r5
    }

    static <T> java.util.List<T> parseArray(java.lang.String r4, java.lang.reflect.Type[] r5, com.alibaba.fastjson2.JSONReader.Feature... r6) {
            r0 = 0
            if (r4 == 0) goto L76
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto La
            goto L76
        La:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r1, r6)
            com.alibaba.fastjson2.JSONReaderUTF16 r6 = new com.alibaba.fastjson2.JSONReaderUTF16
            int r1 = r4.length()
            r3 = 0
            r6.<init>(r2, r4, r3, r1)
            boolean r4 = r6.nextIfNull()     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L25
            r6.close()
            return r0
        L25:
            r6.startArray()     // Catch: java.lang.Throwable -> L3d
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3d
            int r0 = r5.length     // Catch: java.lang.Throwable -> L3d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L3d
        L2e:
            int r0 = r5.length     // Catch: java.lang.Throwable -> L3d
            if (r3 >= r0) goto L3f
            r0 = r5[r3]     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r0 = r6.read(r0)     // Catch: java.lang.Throwable -> L3d
            r4.add(r0)     // Catch: java.lang.Throwable -> L3d
            int r3 = r3 + 1
            goto L2e
        L3d:
            r4 = move-exception
            goto L6d
        L3f:
            r6.endArray()     // Catch: java.lang.Throwable -> L3d
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r5 = r6.resolveTasks     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L49
            r6.handleResolveTasks(r4)     // Catch: java.lang.Throwable -> L3d
        L49:
            char r5 = r6.f1814ch     // Catch: java.lang.Throwable -> L3d
            r0 = 26
            if (r5 == r0) goto L69
            long r0 = r2.features     // Catch: java.lang.Throwable -> L3d
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L3d
            long r2 = r5.mask     // Catch: java.lang.Throwable -> L3d
            long r0 = r0 & r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L5d
            goto L69
        L5d:
            com.alibaba.fastjson2.JSONException r4 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L3d
            java.lang.String r5 = "input not end"
            java.lang.String r5 = r6.info(r5)     // Catch: java.lang.Throwable -> L3d
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3d
            throw r4     // Catch: java.lang.Throwable -> L3d
        L69:
            r6.close()
            return r4
        L6d:
            r6.close()     // Catch: java.lang.Throwable -> L71
            goto L75
        L71:
            r5 = move-exception
            r4.addSuppressed(r5)
        L75:
            throw r4
        L76:
            return r0
    }

    static <T> java.util.List<T> parseArray(byte[] r2, int r3, int r4, java.nio.charset.Charset r5, java.lang.Class<T> r6, com.alibaba.fastjson2.JSONReader.Feature... r7) {
            if (r2 == 0) goto L50
            int r0 = r2.length
            if (r0 == 0) goto L50
            if (r4 != 0) goto L8
            goto L50
        L8:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r7)
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.of(r2, r3, r4, r5, r1)
            java.util.List r3 = r2.readArray(r6)     // Catch: java.lang.Throwable -> L1f
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r4 = r2.resolveTasks     // Catch: java.lang.Throwable -> L1f
            if (r4 == 0) goto L21
            r2.handleResolveTasks(r3)     // Catch: java.lang.Throwable -> L1f
            goto L21
        L1f:
            r3 = move-exception
            goto L45
        L21:
            char r4 = r2.f1814ch     // Catch: java.lang.Throwable -> L1f
            r5 = 26
            if (r4 == r5) goto L41
            long r4 = r1.features     // Catch: java.lang.Throwable -> L1f
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L1f
            long r6 = r6.mask     // Catch: java.lang.Throwable -> L1f
            long r4 = r4 & r6
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L35
            goto L41
        L35:
            com.alibaba.fastjson2.JSONException r3 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = "input not end"
            java.lang.String r4 = r2.info(r4)     // Catch: java.lang.Throwable -> L1f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1f
            throw r3     // Catch: java.lang.Throwable -> L1f
        L41:
            r2.close()
            return r3
        L45:
            if (r2 == 0) goto L4f
            r2.close()     // Catch: java.lang.Throwable -> L4b
            goto L4f
        L4b:
            r2 = move-exception
            r3.addSuppressed(r2)
        L4f:
            throw r3
        L50:
            r2 = 0
            return r2
    }

    static <T> java.util.List<T> parseArray(byte[] r7, java.lang.Class<T> r8, com.alibaba.fastjson2.JSONReader.Feature... r9) {
            if (r7 == 0) goto L53
            int r0 = r7.length
            if (r0 != 0) goto L6
            goto L53
        L6:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r0, r9)
            com.alibaba.fastjson2.JSONReaderUTF8 r1 = new com.alibaba.fastjson2.JSONReaderUTF8
            r5 = 0
            int r6 = r7.length
            r3 = 0
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.List r7 = r1.readArray(r8)     // Catch: java.lang.Throwable -> L22
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r8 = r1.resolveTasks     // Catch: java.lang.Throwable -> L22
            if (r8 == 0) goto L25
            r1.handleResolveTasks(r7)     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r0 = move-exception
            r7 = r0
            goto L49
        L25:
            char r8 = r1.f1814ch     // Catch: java.lang.Throwable -> L22
            r9 = 26
            if (r8 == r9) goto L45
            long r8 = r2.features     // Catch: java.lang.Throwable -> L22
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L22
            long r2 = r0.mask     // Catch: java.lang.Throwable -> L22
            long r8 = r8 & r2
            r2 = 0
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 == 0) goto L39
            goto L45
        L39:
            com.alibaba.fastjson2.JSONException r7 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L22
            java.lang.String r8 = "input not end"
            java.lang.String r8 = r1.info(r8)     // Catch: java.lang.Throwable -> L22
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L22
            throw r7     // Catch: java.lang.Throwable -> L22
        L45:
            r1.close()
            return r7
        L49:
            r1.close()     // Catch: java.lang.Throwable -> L4d
            goto L52
        L4d:
            r0 = move-exception
            r8 = r0
            r7.addSuppressed(r8)
        L52:
            throw r7
        L53:
            r7 = 0
            return r7
    }

    static <T> java.util.List<T> parseArray(byte[] r7, java.lang.reflect.Type r8, com.alibaba.fastjson2.JSONReader.Feature... r9) {
            if (r7 == 0) goto L53
            int r0 = r7.length
            if (r0 != 0) goto L6
            goto L53
        L6:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r0, r9)
            com.alibaba.fastjson2.JSONReaderUTF8 r1 = new com.alibaba.fastjson2.JSONReaderUTF8
            r5 = 0
            int r6 = r7.length
            r3 = 0
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.List r7 = r1.readArray(r8)     // Catch: java.lang.Throwable -> L22
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r8 = r1.resolveTasks     // Catch: java.lang.Throwable -> L22
            if (r8 == 0) goto L25
            r1.handleResolveTasks(r7)     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r0 = move-exception
            r7 = r0
            goto L49
        L25:
            char r8 = r1.f1814ch     // Catch: java.lang.Throwable -> L22
            r9 = 26
            if (r8 == r9) goto L45
            long r8 = r2.features     // Catch: java.lang.Throwable -> L22
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L22
            long r2 = r0.mask     // Catch: java.lang.Throwable -> L22
            long r8 = r8 & r2
            r2 = 0
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 == 0) goto L39
            goto L45
        L39:
            com.alibaba.fastjson2.JSONException r7 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L22
            java.lang.String r8 = "input not end"
            java.lang.String r8 = r1.info(r8)     // Catch: java.lang.Throwable -> L22
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L22
            throw r7     // Catch: java.lang.Throwable -> L22
        L45:
            r1.close()
            return r7
        L49:
            r1.close()     // Catch: java.lang.Throwable -> L4d
            goto L52
        L4d:
            r0 = move-exception
            r8 = r0
            r7.addSuppressed(r8)
        L52:
            throw r7
        L53:
            r7 = 0
            return r7
    }

    static <T> java.util.List<T> parseArray(char[] r7, java.lang.Class<T> r8, com.alibaba.fastjson2.JSONReader.Feature... r9) {
            if (r7 == 0) goto L53
            int r0 = r7.length
            if (r0 != 0) goto L6
            goto L53
        L6:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r0, r9)
            com.alibaba.fastjson2.JSONReaderUTF16 r1 = new com.alibaba.fastjson2.JSONReaderUTF16
            r5 = 0
            int r6 = r7.length
            r3 = 0
            r4 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.List r7 = r1.readArray(r8)     // Catch: java.lang.Throwable -> L22
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r8 = r1.resolveTasks     // Catch: java.lang.Throwable -> L22
            if (r8 == 0) goto L25
            r1.handleResolveTasks(r7)     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r0 = move-exception
            r7 = r0
            goto L49
        L25:
            char r8 = r1.f1814ch     // Catch: java.lang.Throwable -> L22
            r9 = 26
            if (r8 == r9) goto L45
            long r8 = r2.features     // Catch: java.lang.Throwable -> L22
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L22
            long r2 = r0.mask     // Catch: java.lang.Throwable -> L22
            long r8 = r8 & r2
            r2 = 0
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 == 0) goto L39
            goto L45
        L39:
            com.alibaba.fastjson2.JSONException r7 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L22
            java.lang.String r8 = "input not end"
            java.lang.String r8 = r1.info(r8)     // Catch: java.lang.Throwable -> L22
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L22
            throw r7     // Catch: java.lang.Throwable -> L22
        L45:
            r1.close()
            return r7
        L49:
            r1.close()     // Catch: java.lang.Throwable -> L4d
            goto L52
        L4d:
            r0 = move-exception
            r8 = r0
            r7.addSuppressed(r8)
        L52:
            throw r7
        L53:
            r7 = 0
            return r7
    }

    static com.alibaba.fastjson2.JSONObject parseObject(java.io.InputStream r6, java.nio.charset.Charset r7) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            com.alibaba.fastjson2.JSONReader$Context r1 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            com.alibaba.fastjson2.JSONReader r6 = com.alibaba.fastjson2.JSONReader.of(r6, r7, r1)
            boolean r7 = r6.nextIfNull()     // Catch: java.lang.Throwable -> L28
            if (r7 == 0) goto L16
            r6.close()
            return r0
        L16:
            com.alibaba.fastjson2.JSONObject r7 = new com.alibaba.fastjson2.JSONObject     // Catch: java.lang.Throwable -> L28
            r7.<init>()     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r6.read(r7, r2)     // Catch: java.lang.Throwable -> L28
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r6.resolveTasks     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L2a
            r6.handleResolveTasks(r7)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r7 = move-exception
            goto L4c
        L2a:
            char r0 = r6.f1814ch     // Catch: java.lang.Throwable -> L28
            r4 = 26
            if (r0 == r4) goto L48
            long r0 = r1.features     // Catch: java.lang.Throwable -> L28
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L28
            long r4 = r4.mask     // Catch: java.lang.Throwable -> L28
            long r0 = r0 & r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3c
            goto L48
        L3c:
            com.alibaba.fastjson2.JSONException r7 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r6.info(r0)     // Catch: java.lang.Throwable -> L28
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L28
            throw r7     // Catch: java.lang.Throwable -> L28
        L48:
            r6.close()
            return r7
        L4c:
            if (r6 == 0) goto L56
            r6.close()     // Catch: java.lang.Throwable -> L52
            goto L56
        L52:
            r6 = move-exception
            r7.addSuppressed(r6)
        L56:
            throw r7
    }

    static com.alibaba.fastjson2.JSONObject parseObject(java.io.InputStream r6, java.nio.charset.Charset r7, com.alibaba.fastjson2.JSONReader.Context r8) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            com.alibaba.fastjson2.JSONReader r6 = com.alibaba.fastjson2.JSONReader.of(r6, r7, r8)
            boolean r7 = r6.isEnd()     // Catch: java.lang.Throwable -> L24
            if (r7 == 0) goto L12
            r6.close()
            return r0
        L12:
            com.alibaba.fastjson2.JSONObject r7 = new com.alibaba.fastjson2.JSONObject     // Catch: java.lang.Throwable -> L24
            r7.<init>()     // Catch: java.lang.Throwable -> L24
            r0 = 0
            r6.read(r7, r0)     // Catch: java.lang.Throwable -> L24
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r2 = r6.resolveTasks     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L26
            r6.handleResolveTasks(r7)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r7 = move-exception
            goto L48
        L26:
            char r2 = r6.f1814ch     // Catch: java.lang.Throwable -> L24
            r3 = 26
            if (r2 == r3) goto L44
            long r2 = r8.features     // Catch: java.lang.Throwable -> L24
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L24
            long r4 = r8.mask     // Catch: java.lang.Throwable -> L24
            long r2 = r2 & r4
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L38
            goto L44
        L38:
            com.alibaba.fastjson2.JSONException r7 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L24
            java.lang.String r8 = "input not end"
            java.lang.String r8 = r6.info(r8)     // Catch: java.lang.Throwable -> L24
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L24
            throw r7     // Catch: java.lang.Throwable -> L24
        L44:
            r6.close()
            return r7
        L48:
            if (r6 == 0) goto L52
            r6.close()     // Catch: java.lang.Throwable -> L4e
            goto L52
        L4e:
            r6 = move-exception
            r7.addSuppressed(r6)
        L52:
            throw r7
    }

    static com.alibaba.fastjson2.JSONObject parseObject(java.io.InputStream r7, com.alibaba.fastjson2.JSONReader.Feature... r8) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            com.alibaba.fastjson2.JSONReader$Context r8 = com.alibaba.fastjson2.JSONFactory.createReadContext(r8)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            com.alibaba.fastjson2.JSONReader r7 = com.alibaba.fastjson2.JSONReader.of(r7, r1, r8)
            boolean r1 = r7.isEnd()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L18
            r7.close()
            return r0
        L18:
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject     // Catch: java.lang.Throwable -> L2a
            r0.<init>()     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            r7.read(r0, r1)     // Catch: java.lang.Throwable -> L2a
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r3 = r7.resolveTasks     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L2c
            r7.handleResolveTasks(r0)     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r8 = move-exception
            goto L4e
        L2c:
            char r3 = r7.f1814ch     // Catch: java.lang.Throwable -> L2a
            r4 = 26
            if (r3 == r4) goto L4a
            long r3 = r8.features     // Catch: java.lang.Throwable -> L2a
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L2a
            long r5 = r8.mask     // Catch: java.lang.Throwable -> L2a
            long r3 = r3 & r5
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 == 0) goto L3e
            goto L4a
        L3e:
            com.alibaba.fastjson2.JSONException r8 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r7.info(r0)     // Catch: java.lang.Throwable -> L2a
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            throw r8     // Catch: java.lang.Throwable -> L2a
        L4a:
            r7.close()
            return r0
        L4e:
            if (r7 == 0) goto L58
            r7.close()     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r7 = move-exception
            r8.addSuppressed(r7)
        L58:
            throw r8
    }

    static com.alibaba.fastjson2.JSONObject parseObject(java.io.Reader r7, com.alibaba.fastjson2.JSONReader.Feature... r8) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            com.alibaba.fastjson2.JSONReader$Context r8 = com.alibaba.fastjson2.JSONFactory.createReadContext(r8)
            com.alibaba.fastjson2.JSONReader r7 = com.alibaba.fastjson2.JSONReader.of(r7, r8)
            boolean r1 = r7.isEnd()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L16
            r7.close()
            return r0
        L16:
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject     // Catch: java.lang.Throwable -> L28
            r0.<init>()     // Catch: java.lang.Throwable -> L28
            r1 = 0
            r7.read(r0, r1)     // Catch: java.lang.Throwable -> L28
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r3 = r7.resolveTasks     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L2a
            r7.handleResolveTasks(r0)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r8 = move-exception
            goto L4c
        L2a:
            char r3 = r7.f1814ch     // Catch: java.lang.Throwable -> L28
            r4 = 26
            if (r3 == r4) goto L48
            long r3 = r8.features     // Catch: java.lang.Throwable -> L28
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L28
            long r5 = r8.mask     // Catch: java.lang.Throwable -> L28
            long r3 = r3 & r5
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 == 0) goto L3c
            goto L48
        L3c:
            com.alibaba.fastjson2.JSONException r8 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r7.info(r0)     // Catch: java.lang.Throwable -> L28
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L28
            throw r8     // Catch: java.lang.Throwable -> L28
        L48:
            r7.close()
            return r0
        L4c:
            if (r7 == 0) goto L56
            r7.close()     // Catch: java.lang.Throwable -> L52
            goto L56
        L52:
            r7 = move-exception
            r8.addSuppressed(r7)
        L56:
            throw r8
    }

    static com.alibaba.fastjson2.JSONObject parseObject(java.lang.String r7) {
            r0 = 0
            if (r7 == 0) goto L64
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto La
            goto L64
        La:
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r1.<init>(r2)
            com.alibaba.fastjson2.JSONReaderUTF16 r2 = new com.alibaba.fastjson2.JSONReaderUTF16
            r3 = 0
            int r4 = r7.length()
            r2.<init>(r1, r7, r3, r4)
            boolean r7 = r2.nextIfNull()     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L25
            r2.close()
            return r0
        L25:
            com.alibaba.fastjson2.JSONObject r7 = new com.alibaba.fastjson2.JSONObject     // Catch: java.lang.Throwable -> L37
            r7.<init>()     // Catch: java.lang.Throwable -> L37
            r3 = 0
            r2.read(r7, r3)     // Catch: java.lang.Throwable -> L37
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r2.resolveTasks     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L39
            r2.handleResolveTasks(r7)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r7 = move-exception
            goto L5b
        L39:
            char r0 = r2.f1814ch     // Catch: java.lang.Throwable -> L37
            r5 = 26
            if (r0 == r5) goto L57
            long r0 = r1.features     // Catch: java.lang.Throwable -> L37
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L37
            long r5 = r5.mask     // Catch: java.lang.Throwable -> L37
            long r0 = r0 & r5
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 == 0) goto L4b
            goto L57
        L4b:
            com.alibaba.fastjson2.JSONException r7 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r2.info(r0)     // Catch: java.lang.Throwable -> L37
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L37
            throw r7     // Catch: java.lang.Throwable -> L37
        L57:
            r2.close()
            return r7
        L5b:
            r2.close()     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r0 = move-exception
            r7.addSuppressed(r0)
        L63:
            throw r7
        L64:
            return r0
    }

    static com.alibaba.fastjson2.JSONObject parseObject(java.lang.String r4, int r5, int r6, com.alibaba.fastjson2.JSONReader.Context r7) {
            r0 = 0
            if (r4 == 0) goto L5b
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L5b
            if (r6 != 0) goto Lc
            goto L5b
        Lc:
            com.alibaba.fastjson2.JSONReader r4 = com.alibaba.fastjson2.JSONReader.of(r4, r5, r6, r7)
            boolean r5 = r4.nextIfNull()     // Catch: java.lang.Throwable -> L2c
            if (r5 == 0) goto L1a
            r4.close()
            return r0
        L1a:
            com.alibaba.fastjson2.JSONObject r5 = new com.alibaba.fastjson2.JSONObject     // Catch: java.lang.Throwable -> L2c
            r5.<init>()     // Catch: java.lang.Throwable -> L2c
            r0 = 0
            r4.read(r5, r0)     // Catch: java.lang.Throwable -> L2c
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r6 = r4.resolveTasks     // Catch: java.lang.Throwable -> L2c
            if (r6 == 0) goto L2e
            r4.handleResolveTasks(r5)     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r5 = move-exception
            goto L50
        L2e:
            char r6 = r4.f1814ch     // Catch: java.lang.Throwable -> L2c
            r2 = 26
            if (r6 == r2) goto L4c
            long r6 = r7.features     // Catch: java.lang.Throwable -> L2c
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L2c
            long r2 = r2.mask     // Catch: java.lang.Throwable -> L2c
            long r6 = r6 & r2
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L40
            goto L4c
        L40:
            com.alibaba.fastjson2.JSONException r5 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L2c
            java.lang.String r6 = "input not end"
            java.lang.String r6 = r4.info(r6)     // Catch: java.lang.Throwable -> L2c
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L2c
            throw r5     // Catch: java.lang.Throwable -> L2c
        L4c:
            r4.close()
            return r5
        L50:
            if (r4 == 0) goto L5a
            r4.close()     // Catch: java.lang.Throwable -> L56
            goto L5a
        L56:
            r4 = move-exception
            r5.addSuppressed(r4)
        L5a:
            throw r5
        L5b:
            return r0
    }

    static com.alibaba.fastjson2.JSONObject parseObject(java.lang.String r4, int r5, int r6, com.alibaba.fastjson2.JSONReader.Feature... r7) {
            r0 = 0
            if (r4 == 0) goto L5f
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L5f
            if (r6 != 0) goto Lc
            goto L5f
        Lc:
            com.alibaba.fastjson2.JSONReader$Context r7 = com.alibaba.fastjson2.JSONFactory.createReadContext(r7)
            com.alibaba.fastjson2.JSONReader r4 = com.alibaba.fastjson2.JSONReader.of(r4, r5, r6, r7)
            boolean r5 = r4.nextIfNull()     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto L1e
            r4.close()
            return r0
        L1e:
            com.alibaba.fastjson2.JSONObject r5 = new com.alibaba.fastjson2.JSONObject     // Catch: java.lang.Throwable -> L30
            r5.<init>()     // Catch: java.lang.Throwable -> L30
            r0 = 0
            r4.read(r5, r0)     // Catch: java.lang.Throwable -> L30
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r6 = r4.resolveTasks     // Catch: java.lang.Throwable -> L30
            if (r6 == 0) goto L32
            r4.handleResolveTasks(r5)     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r5 = move-exception
            goto L54
        L32:
            char r6 = r4.f1814ch     // Catch: java.lang.Throwable -> L30
            r2 = 26
            if (r6 == r2) goto L50
            long r6 = r7.features     // Catch: java.lang.Throwable -> L30
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L30
            long r2 = r2.mask     // Catch: java.lang.Throwable -> L30
            long r6 = r6 & r2
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L44
            goto L50
        L44:
            com.alibaba.fastjson2.JSONException r5 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = "input not end"
            java.lang.String r6 = r4.info(r6)     // Catch: java.lang.Throwable -> L30
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L30
            throw r5     // Catch: java.lang.Throwable -> L30
        L50:
            r4.close()
            return r5
        L54:
            if (r4 == 0) goto L5e
            r4.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r4 = move-exception
            r5.addSuppressed(r4)
        L5e:
            throw r5
        L5f:
            return r0
    }

    static com.alibaba.fastjson2.JSONObject parseObject(java.lang.String r7, com.alibaba.fastjson2.JSONReader.Context r8) {
            r0 = 0
            if (r7 == 0) goto L59
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto La
            goto L59
        La:
            com.alibaba.fastjson2.JSONReader r7 = com.alibaba.fastjson2.JSONReader.of(r7, r8)
            boolean r1 = r7.nextIfNull()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L18
            r7.close()
            return r0
        L18:
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject     // Catch: java.lang.Throwable -> L2a
            r0.<init>()     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            r7.read(r0, r1)     // Catch: java.lang.Throwable -> L2a
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r3 = r7.resolveTasks     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L2c
            r7.handleResolveTasks(r0)     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r8 = move-exception
            goto L4e
        L2c:
            char r3 = r7.f1814ch     // Catch: java.lang.Throwable -> L2a
            r4 = 26
            if (r3 == r4) goto L4a
            long r3 = r8.features     // Catch: java.lang.Throwable -> L2a
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L2a
            long r5 = r8.mask     // Catch: java.lang.Throwable -> L2a
            long r3 = r3 & r5
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 == 0) goto L3e
            goto L4a
        L3e:
            com.alibaba.fastjson2.JSONException r8 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r7.info(r0)     // Catch: java.lang.Throwable -> L2a
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L2a
            throw r8     // Catch: java.lang.Throwable -> L2a
        L4a:
            r7.close()
            return r0
        L4e:
            if (r7 == 0) goto L58
            r7.close()     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r7 = move-exception
            r8.addSuppressed(r7)
        L58:
            throw r8
        L59:
            return r0
    }

    static com.alibaba.fastjson2.JSONObject parseObject(java.lang.String r8, com.alibaba.fastjson2.JSONReader.Feature... r9) {
            r0 = 0
            if (r8 == 0) goto L61
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto La
            goto L61
        La:
            com.alibaba.fastjson2.JSONReader$Context r9 = com.alibaba.fastjson2.JSONFactory.createReadContext(r9)
            com.alibaba.fastjson2.JSONReaderUTF16 r1 = new com.alibaba.fastjson2.JSONReaderUTF16
            r2 = 0
            int r3 = r8.length()
            r1.<init>(r9, r8, r2, r3)
            boolean r8 = r1.nextIfNull()     // Catch: java.lang.Throwable -> L34
            if (r8 == 0) goto L22
            r1.close()
            return r0
        L22:
            com.alibaba.fastjson2.JSONObject r8 = new com.alibaba.fastjson2.JSONObject     // Catch: java.lang.Throwable -> L34
            r8.<init>()     // Catch: java.lang.Throwable -> L34
            r2 = 0
            r1.read(r8, r2)     // Catch: java.lang.Throwable -> L34
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r1.resolveTasks     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L36
            r1.handleResolveTasks(r8)     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r8 = move-exception
            goto L58
        L36:
            char r0 = r1.f1814ch     // Catch: java.lang.Throwable -> L34
            r4 = 26
            if (r0 == r4) goto L54
            long r4 = r9.features     // Catch: java.lang.Throwable -> L34
            com.alibaba.fastjson2.JSONReader$Feature r9 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L34
            long r6 = r9.mask     // Catch: java.lang.Throwable -> L34
            long r4 = r4 & r6
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 == 0) goto L48
            goto L54
        L48:
            com.alibaba.fastjson2.JSONException r8 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L34
            java.lang.String r9 = "input not end"
            java.lang.String r9 = r1.info(r9)     // Catch: java.lang.Throwable -> L34
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L34
            throw r8     // Catch: java.lang.Throwable -> L34
        L54:
            r1.close()
            return r8
        L58:
            r1.close()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r9 = move-exception
            r8.addSuppressed(r9)
        L60:
            throw r8
        L61:
            return r0
    }

    static com.alibaba.fastjson2.JSONObject parseObject(java.net.URL r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.io.InputStream r0 = r3.openStream()     // Catch: java.io.IOException -> L14
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L17
            com.alibaba.fastjson2.JSONObject r1 = parseObject(r0, r1)     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L16
            r0.close()     // Catch: java.io.IOException -> L14
            return r1
        L14:
            r0 = move-exception
            goto L23
        L16:
            return r1
        L17:
            r1 = move-exception
            if (r0 == 0) goto L22
            r0.close()     // Catch: java.lang.Throwable -> L1e
            goto L22
        L1e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.io.IOException -> L14
        L22:
            throw r1     // Catch: java.io.IOException -> L14
        L23:
            java.lang.String r1 = "JSON#parseObject cannot parse '"
            java.lang.String r2 = "'"
            ah.a.n(r1, r3, r2, r0)
            r3 = 0
            return r3
    }

    static com.alibaba.fastjson2.JSONObject parseObject(byte[] r8) {
            r0 = 0
            if (r8 == 0) goto L5e
            int r1 = r8.length
            if (r1 != 0) goto L7
            goto L5e
        L7:
            com.alibaba.fastjson2.JSONReader$Context r3 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            com.alibaba.fastjson2.JSONReaderUTF8 r2 = new com.alibaba.fastjson2.JSONReaderUTF8
            r6 = 0
            int r7 = r8.length
            r4 = 0
            r5 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            boolean r8 = r2.nextIfNull()     // Catch: java.lang.Throwable -> L30
            if (r8 == 0) goto L1e
            r2.close()
            return r0
        L1e:
            com.alibaba.fastjson2.JSONObject r8 = new com.alibaba.fastjson2.JSONObject     // Catch: java.lang.Throwable -> L30
            r8.<init>()     // Catch: java.lang.Throwable -> L30
            r0 = 0
            r2.read(r8, r0)     // Catch: java.lang.Throwable -> L30
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r4 = r2.resolveTasks     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L33
            r2.handleResolveTasks(r8)     // Catch: java.lang.Throwable -> L30
            goto L33
        L30:
            r0 = move-exception
            r8 = r0
            goto L55
        L33:
            char r4 = r2.f1814ch     // Catch: java.lang.Throwable -> L30
            r5 = 26
            if (r4 == r5) goto L51
            long r3 = r3.features     // Catch: java.lang.Throwable -> L30
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L30
            long r5 = r5.mask     // Catch: java.lang.Throwable -> L30
            long r3 = r3 & r5
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L45
            goto L51
        L45:
            com.alibaba.fastjson2.JSONException r8 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r2.info(r0)     // Catch: java.lang.Throwable -> L30
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L30
            throw r8     // Catch: java.lang.Throwable -> L30
        L51:
            r2.close()
            return r8
        L55:
            r2.close()     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r0 = move-exception
            r8.addSuppressed(r0)
        L5d:
            throw r8
        L5e:
            return r0
    }

    static com.alibaba.fastjson2.JSONObject parseObject(byte[] r4, int r5, int r6, java.nio.charset.Charset r7, com.alibaba.fastjson2.JSONReader.Feature... r8) {
            r0 = 0
            if (r4 == 0) goto L5f
            int r1 = r4.length
            if (r1 == 0) goto L5f
            if (r6 != 0) goto L9
            goto L5f
        L9:
            com.alibaba.fastjson2.JSONReader$Context r1 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            com.alibaba.fastjson2.JSONReader r4 = com.alibaba.fastjson2.JSONReader.of(r4, r5, r6, r7, r1)
            boolean r5 = r4.nextIfNull()     // Catch: java.lang.Throwable -> L30
            if (r5 == 0) goto L1b
            r4.close()
            return r0
        L1b:
            r1.config(r8)     // Catch: java.lang.Throwable -> L30
            com.alibaba.fastjson2.JSONObject r5 = new com.alibaba.fastjson2.JSONObject     // Catch: java.lang.Throwable -> L30
            r5.<init>()     // Catch: java.lang.Throwable -> L30
            r6 = 0
            r4.read(r5, r6)     // Catch: java.lang.Throwable -> L30
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r8 = r4.resolveTasks     // Catch: java.lang.Throwable -> L30
            if (r8 == 0) goto L32
            r4.handleResolveTasks(r5)     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r5 = move-exception
            goto L54
        L32:
            char r8 = r4.f1814ch     // Catch: java.lang.Throwable -> L30
            r0 = 26
            if (r8 == r0) goto L50
            long r0 = r1.features     // Catch: java.lang.Throwable -> L30
            com.alibaba.fastjson2.JSONReader$Feature r8 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L30
            long r2 = r8.mask     // Catch: java.lang.Throwable -> L30
            long r0 = r0 & r2
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L44
            goto L50
        L44:
            com.alibaba.fastjson2.JSONException r5 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L30
            java.lang.String r6 = "input not end"
            java.lang.String r6 = r4.info(r6)     // Catch: java.lang.Throwable -> L30
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L30
            throw r5     // Catch: java.lang.Throwable -> L30
        L50:
            r4.close()
            return r5
        L54:
            if (r4 == 0) goto L5e
            r4.close()     // Catch: java.lang.Throwable -> L5a
            goto L5e
        L5a:
            r4 = move-exception
            r5.addSuppressed(r4)
        L5e:
            throw r5
        L5f:
            return r0
    }

    static com.alibaba.fastjson2.JSONObject parseObject(byte[] r8, int r9, int r10, com.alibaba.fastjson2.JSONReader.Feature... r11) {
            r0 = 0
            if (r8 == 0) goto L61
            int r1 = r8.length
            if (r1 == 0) goto L61
            if (r10 != 0) goto L9
            goto L61
        L9:
            com.alibaba.fastjson2.JSONReader$Context r3 = com.alibaba.fastjson2.JSONFactory.createReadContext(r11)
            com.alibaba.fastjson2.JSONReaderUTF8 r2 = new com.alibaba.fastjson2.JSONReaderUTF8
            r4 = 0
            r5 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            boolean r8 = r2.nextIfNull()     // Catch: java.lang.Throwable -> L32
            if (r8 == 0) goto L20
            r2.close()
            return r0
        L20:
            com.alibaba.fastjson2.JSONObject r8 = new com.alibaba.fastjson2.JSONObject     // Catch: java.lang.Throwable -> L32
            r8.<init>()     // Catch: java.lang.Throwable -> L32
            r9 = 0
            r2.read(r8, r9)     // Catch: java.lang.Throwable -> L32
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r11 = r2.resolveTasks     // Catch: java.lang.Throwable -> L32
            if (r11 == 0) goto L35
            r2.handleResolveTasks(r8)     // Catch: java.lang.Throwable -> L32
            goto L35
        L32:
            r0 = move-exception
            r8 = r0
            goto L57
        L35:
            char r11 = r2.f1814ch     // Catch: java.lang.Throwable -> L32
            r0 = 26
            if (r11 == r0) goto L53
            long r0 = r3.features     // Catch: java.lang.Throwable -> L32
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L32
            long r3 = r11.mask     // Catch: java.lang.Throwable -> L32
            long r0 = r0 & r3
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 == 0) goto L47
            goto L53
        L47:
            com.alibaba.fastjson2.JSONException r8 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L32
            java.lang.String r9 = "input not end"
            java.lang.String r9 = r2.info(r9)     // Catch: java.lang.Throwable -> L32
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L32
            throw r8     // Catch: java.lang.Throwable -> L32
        L53:
            r2.close()
            return r8
        L57:
            r2.close()     // Catch: java.lang.Throwable -> L5b
            goto L60
        L5b:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)
        L60:
            throw r8
        L61:
            return r0
    }

    static com.alibaba.fastjson2.JSONObject parseObject(byte[] r8, com.alibaba.fastjson2.JSONReader.Feature... r9) {
            r0 = 0
            if (r8 == 0) goto L5f
            int r1 = r8.length
            if (r1 != 0) goto L7
            goto L5f
        L7:
            com.alibaba.fastjson2.JSONReader$Context r3 = com.alibaba.fastjson2.JSONFactory.createReadContext(r9)
            com.alibaba.fastjson2.JSONReaderUTF8 r2 = new com.alibaba.fastjson2.JSONReaderUTF8
            r6 = 0
            int r7 = r8.length
            r4 = 0
            r5 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            boolean r8 = r2.nextIfNull()     // Catch: java.lang.Throwable -> L30
            if (r8 == 0) goto L1e
            r2.close()
            return r0
        L1e:
            com.alibaba.fastjson2.JSONObject r8 = new com.alibaba.fastjson2.JSONObject     // Catch: java.lang.Throwable -> L30
            r8.<init>()     // Catch: java.lang.Throwable -> L30
            r0 = 0
            r2.read(r8, r0)     // Catch: java.lang.Throwable -> L30
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r9 = r2.resolveTasks     // Catch: java.lang.Throwable -> L30
            if (r9 == 0) goto L33
            r2.handleResolveTasks(r8)     // Catch: java.lang.Throwable -> L30
            goto L33
        L30:
            r0 = move-exception
            r8 = r0
            goto L55
        L33:
            char r9 = r2.f1814ch     // Catch: java.lang.Throwable -> L30
            r4 = 26
            if (r9 == r4) goto L51
            long r3 = r3.features     // Catch: java.lang.Throwable -> L30
            com.alibaba.fastjson2.JSONReader$Feature r9 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L30
            long r5 = r9.mask     // Catch: java.lang.Throwable -> L30
            long r3 = r3 & r5
            int r9 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r9 == 0) goto L45
            goto L51
        L45:
            com.alibaba.fastjson2.JSONException r8 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L30
            java.lang.String r9 = "input not end"
            java.lang.String r9 = r2.info(r9)     // Catch: java.lang.Throwable -> L30
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L30
            throw r8     // Catch: java.lang.Throwable -> L30
        L51:
            r2.close()
            return r8
        L55:
            r2.close()     // Catch: java.lang.Throwable -> L59
            goto L5e
        L59:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)
        L5e:
            throw r8
        L5f:
            return r0
    }

    static com.alibaba.fastjson2.JSONObject parseObject(char[] r8) {
            r0 = 0
            if (r8 == 0) goto L5e
            int r1 = r8.length
            if (r1 != 0) goto L7
            goto L5e
        L7:
            com.alibaba.fastjson2.JSONReader$Context r3 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            com.alibaba.fastjson2.JSONReaderUTF16 r2 = new com.alibaba.fastjson2.JSONReaderUTF16
            r6 = 0
            int r7 = r8.length
            r4 = 0
            r5 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            boolean r8 = r2.nextIfNull()     // Catch: java.lang.Throwable -> L30
            if (r8 == 0) goto L1e
            r2.close()
            return r0
        L1e:
            com.alibaba.fastjson2.JSONObject r8 = new com.alibaba.fastjson2.JSONObject     // Catch: java.lang.Throwable -> L30
            r8.<init>()     // Catch: java.lang.Throwable -> L30
            r0 = 0
            r2.read(r8, r0)     // Catch: java.lang.Throwable -> L30
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r4 = r2.resolveTasks     // Catch: java.lang.Throwable -> L30
            if (r4 == 0) goto L33
            r2.handleResolveTasks(r8)     // Catch: java.lang.Throwable -> L30
            goto L33
        L30:
            r0 = move-exception
            r8 = r0
            goto L55
        L33:
            char r4 = r2.f1814ch     // Catch: java.lang.Throwable -> L30
            r5 = 26
            if (r4 == r5) goto L51
            long r3 = r3.features     // Catch: java.lang.Throwable -> L30
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L30
            long r5 = r5.mask     // Catch: java.lang.Throwable -> L30
            long r3 = r3 & r5
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L45
            goto L51
        L45:
            com.alibaba.fastjson2.JSONException r8 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L30
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r2.info(r0)     // Catch: java.lang.Throwable -> L30
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L30
            throw r8     // Catch: java.lang.Throwable -> L30
        L51:
            r2.close()
            return r8
        L55:
            r2.close()     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r0 = move-exception
            r8.addSuppressed(r0)
        L5d:
            throw r8
        L5e:
            return r0
    }

    static com.alibaba.fastjson2.JSONObject parseObject(char[] r8, int r9, int r10, com.alibaba.fastjson2.JSONReader.Feature... r11) {
            r0 = 0
            if (r8 == 0) goto L61
            int r1 = r8.length
            if (r1 == 0) goto L61
            if (r10 != 0) goto L9
            goto L61
        L9:
            com.alibaba.fastjson2.JSONReader$Context r3 = com.alibaba.fastjson2.JSONFactory.createReadContext(r11)
            com.alibaba.fastjson2.JSONReaderUTF16 r2 = new com.alibaba.fastjson2.JSONReaderUTF16
            r4 = 0
            r5 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            boolean r8 = r2.nextIfNull()     // Catch: java.lang.Throwable -> L32
            if (r8 == 0) goto L20
            r2.close()
            return r0
        L20:
            com.alibaba.fastjson2.JSONObject r8 = new com.alibaba.fastjson2.JSONObject     // Catch: java.lang.Throwable -> L32
            r8.<init>()     // Catch: java.lang.Throwable -> L32
            r9 = 0
            r2.read(r8, r9)     // Catch: java.lang.Throwable -> L32
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r11 = r2.resolveTasks     // Catch: java.lang.Throwable -> L32
            if (r11 == 0) goto L35
            r2.handleResolveTasks(r8)     // Catch: java.lang.Throwable -> L32
            goto L35
        L32:
            r0 = move-exception
            r8 = r0
            goto L57
        L35:
            char r11 = r2.f1814ch     // Catch: java.lang.Throwable -> L32
            r0 = 26
            if (r11 == r0) goto L53
            long r0 = r3.features     // Catch: java.lang.Throwable -> L32
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L32
            long r3 = r11.mask     // Catch: java.lang.Throwable -> L32
            long r0 = r0 & r3
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 == 0) goto L47
            goto L53
        L47:
            com.alibaba.fastjson2.JSONException r8 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L32
            java.lang.String r9 = "input not end"
            java.lang.String r9 = r2.info(r9)     // Catch: java.lang.Throwable -> L32
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L32
            throw r8     // Catch: java.lang.Throwable -> L32
        L53:
            r2.close()
            return r8
        L57:
            r2.close()     // Catch: java.lang.Throwable -> L5b
            goto L60
        L5b:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)
        L60:
            throw r8
        L61:
            return r0
    }

    static <T> T parseObject(java.io.InputStream r10, java.lang.reflect.Type r11, java.lang.String r12, com.alibaba.fastjson2.JSONReader.Feature... r13) {
            if (r10 != 0) goto L4
            r10 = 0
            return r10
        L4:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r13)
            if (r12 == 0) goto L16
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L16
            r1.setDateFormat(r12)
        L16:
            long r12 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r2 = r2.mask
            long r12 = r12 & r2
            r2 = 0
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L25
            r12 = 1
            goto L26
        L25:
            r12 = 0
        L26:
            com.alibaba.fastjson2.reader.ObjectReader r4 = r0.getObjectReader(r11, r12)
            java.nio.charset.Charset r12 = java.nio.charset.StandardCharsets.UTF_8
            com.alibaba.fastjson2.JSONReader r5 = com.alibaba.fastjson2.JSONReader.of(r10, r12, r1)
            r7 = 0
            r8 = 0
            r6 = r11
            java.lang.Object r10 = r4.readObject(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L40
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r11 = r5.resolveTasks     // Catch: java.lang.Throwable -> L40
            if (r11 == 0) goto L43
            r5.handleResolveTasks(r10)     // Catch: java.lang.Throwable -> L40
            goto L43
        L40:
            r0 = move-exception
            r10 = r0
            goto L65
        L43:
            char r11 = r5.f1814ch     // Catch: java.lang.Throwable -> L40
            r12 = 26
            if (r11 == r12) goto L61
            long r11 = r1.features     // Catch: java.lang.Throwable -> L40
            com.alibaba.fastjson2.JSONReader$Feature r13 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L40
            long r0 = r13.mask     // Catch: java.lang.Throwable -> L40
            long r11 = r11 & r0
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L55
            goto L61
        L55:
            com.alibaba.fastjson2.JSONException r10 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L40
            java.lang.String r11 = "input not end"
            java.lang.String r11 = r5.info(r11)     // Catch: java.lang.Throwable -> L40
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L40
            throw r10     // Catch: java.lang.Throwable -> L40
        L61:
            r5.close()
            return r10
        L65:
            if (r5 == 0) goto L70
            r5.close()     // Catch: java.lang.Throwable -> L6b
            goto L70
        L6b:
            r0 = move-exception
            r11 = r0
            r10.addSuppressed(r11)
        L70:
            throw r10
    }

    static <T> T parseObject(java.io.InputStream r13, java.lang.reflect.Type r14, com.alibaba.fastjson2.JSONReader.Feature... r15) {
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r1, r15)
            long r3 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r15 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r5 = r15.mask
            long r3 = r3 & r5
            r5 = 0
            int r15 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r15 == 0) goto L1a
            r15 = 1
            goto L1b
        L1a:
            r15 = 0
        L1b:
            com.alibaba.fastjson2.reader.ObjectReader r7 = r1.getObjectReader(r14, r15)
            java.nio.charset.Charset r15 = java.nio.charset.StandardCharsets.UTF_8
            com.alibaba.fastjson2.JSONReader r8 = com.alibaba.fastjson2.JSONReader.of(r13, r15, r2)
            boolean r13 = r8.isEnd()     // Catch: java.lang.Throwable -> L3f
            if (r13 == 0) goto L2f
            r8.close()
            return r0
        L2f:
            r10 = 0
            r11 = 0
            r9 = r14
            java.lang.Object r13 = r7.readObject(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L3f
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r14 = r8.resolveTasks     // Catch: java.lang.Throwable -> L3f
            if (r14 == 0) goto L42
            r8.handleResolveTasks(r13)     // Catch: java.lang.Throwable -> L3f
            goto L42
        L3f:
            r0 = move-exception
            r13 = r0
            goto L64
        L42:
            char r14 = r8.f1814ch     // Catch: java.lang.Throwable -> L3f
            r15 = 26
            if (r14 == r15) goto L60
            long r14 = r2.features     // Catch: java.lang.Throwable -> L3f
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L3f
            long r0 = r0.mask     // Catch: java.lang.Throwable -> L3f
            long r14 = r14 & r0
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 == 0) goto L54
            goto L60
        L54:
            com.alibaba.fastjson2.JSONException r13 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L3f
            java.lang.String r14 = "input not end"
            java.lang.String r14 = r8.info(r14)     // Catch: java.lang.Throwable -> L3f
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L3f
            throw r13     // Catch: java.lang.Throwable -> L3f
        L60:
            r8.close()
            return r13
        L64:
            if (r8 == 0) goto L6f
            r8.close()     // Catch: java.lang.Throwable -> L6a
            goto L6f
        L6a:
            r0 = move-exception
            r14 = r0
            r13.addSuppressed(r14)
        L6f:
            throw r13
    }

    static <T> T parseObject(java.io.InputStream r11, java.nio.charset.Charset r12, java.lang.Class<T> r13, com.alibaba.fastjson2.JSONReader.Context r14) {
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            long r1 = r14.features
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r3 = r3.mask
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = r14.provider
            com.alibaba.fastjson2.reader.ObjectReader r5 = r2.getObjectReader(r13, r1)
            com.alibaba.fastjson2.JSONReader r6 = com.alibaba.fastjson2.JSONReader.of(r11, r12, r14)
            boolean r11 = r6.isEnd()     // Catch: java.lang.Throwable -> L38
            if (r11 == 0) goto L28
            r6.close()
            return r0
        L28:
            r8 = 0
            r9 = 0
            r7 = r13
            java.lang.Object r11 = r5.readObject(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L38
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r12 = r6.resolveTasks     // Catch: java.lang.Throwable -> L38
            if (r12 == 0) goto L3b
            r6.handleResolveTasks(r11)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r0 = move-exception
            r11 = r0
            goto L5d
        L3b:
            char r12 = r6.f1814ch     // Catch: java.lang.Throwable -> L38
            r13 = 26
            if (r12 == r13) goto L59
            long r12 = r14.features     // Catch: java.lang.Throwable -> L38
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L38
            long r0 = r14.mask     // Catch: java.lang.Throwable -> L38
            long r12 = r12 & r0
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 == 0) goto L4d
            goto L59
        L4d:
            com.alibaba.fastjson2.JSONException r11 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L38
            java.lang.String r12 = "input not end"
            java.lang.String r12 = r6.info(r12)     // Catch: java.lang.Throwable -> L38
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L38
            throw r11     // Catch: java.lang.Throwable -> L38
        L59:
            r6.close()
            return r11
        L5d:
            if (r6 == 0) goto L68
            r6.close()     // Catch: java.lang.Throwable -> L63
            goto L68
        L63:
            r0 = move-exception
            r12 = r0
            r11.addSuppressed(r12)
        L68:
            throw r11
    }

    static <T> T parseObject(java.io.InputStream r11, java.nio.charset.Charset r12, java.lang.reflect.Type r13, com.alibaba.fastjson2.JSONReader.Context r14) {
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            long r1 = r14.features
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r3 = r3.mask
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = r14.provider
            com.alibaba.fastjson2.reader.ObjectReader r5 = r2.getObjectReader(r13, r1)
            com.alibaba.fastjson2.JSONReader r6 = com.alibaba.fastjson2.JSONReader.of(r11, r12, r14)
            boolean r11 = r6.isEnd()     // Catch: java.lang.Throwable -> L38
            if (r11 == 0) goto L28
            r6.close()
            return r0
        L28:
            r8 = 0
            r9 = 0
            r7 = r13
            java.lang.Object r11 = r5.readObject(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L38
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r12 = r6.resolveTasks     // Catch: java.lang.Throwable -> L38
            if (r12 == 0) goto L3b
            r6.handleResolveTasks(r11)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r0 = move-exception
            r11 = r0
            goto L5d
        L3b:
            char r12 = r6.f1814ch     // Catch: java.lang.Throwable -> L38
            r13 = 26
            if (r12 == r13) goto L59
            long r12 = r14.features     // Catch: java.lang.Throwable -> L38
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L38
            long r0 = r14.mask     // Catch: java.lang.Throwable -> L38
            long r12 = r12 & r0
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 == 0) goto L4d
            goto L59
        L4d:
            com.alibaba.fastjson2.JSONException r11 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L38
            java.lang.String r12 = "input not end"
            java.lang.String r12 = r6.info(r12)     // Catch: java.lang.Throwable -> L38
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L38
            throw r11     // Catch: java.lang.Throwable -> L38
        L59:
            r6.close()
            return r11
        L5d:
            if (r6 == 0) goto L68
            r6.close()     // Catch: java.lang.Throwable -> L63
            goto L68
        L63:
            r0 = move-exception
            r12 = r0
            r11.addSuppressed(r12)
        L68:
            throw r11
    }

    static <T> T parseObject(java.io.InputStream r12, java.nio.charset.Charset r13, java.lang.reflect.Type r14, com.alibaba.fastjson2.JSONReader.Feature... r15) {
            if (r12 != 0) goto L4
            r12 = 0
            return r12
        L4:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r15)
            long r2 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r15 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r4 = r15.mask
            long r2 = r2 & r4
            r4 = 0
            int r15 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r15 == 0) goto L1a
            r15 = 1
            goto L1b
        L1a:
            r15 = 0
        L1b:
            com.alibaba.fastjson2.reader.ObjectReader r6 = r0.getObjectReader(r14, r15)
            com.alibaba.fastjson2.JSONReader r7 = com.alibaba.fastjson2.JSONReader.of(r12, r13, r1)
            r9 = 0
            r10 = 0
            r8 = r14
            java.lang.Object r12 = r6.readObject(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L33
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r13 = r7.resolveTasks     // Catch: java.lang.Throwable -> L33
            if (r13 == 0) goto L36
            r7.handleResolveTasks(r12)     // Catch: java.lang.Throwable -> L33
            goto L36
        L33:
            r0 = move-exception
            r12 = r0
            goto L58
        L36:
            char r13 = r7.f1814ch     // Catch: java.lang.Throwable -> L33
            r14 = 26
            if (r13 == r14) goto L54
            long r13 = r1.features     // Catch: java.lang.Throwable -> L33
            com.alibaba.fastjson2.JSONReader$Feature r15 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L33
            long r0 = r15.mask     // Catch: java.lang.Throwable -> L33
            long r13 = r13 & r0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 == 0) goto L48
            goto L54
        L48:
            com.alibaba.fastjson2.JSONException r12 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L33
            java.lang.String r13 = "input not end"
            java.lang.String r13 = r7.info(r13)     // Catch: java.lang.Throwable -> L33
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L33
            throw r12     // Catch: java.lang.Throwable -> L33
        L54:
            r7.close()
            return r12
        L58:
            if (r7 == 0) goto L63
            r7.close()     // Catch: java.lang.Throwable -> L5e
            goto L63
        L5e:
            r0 = move-exception
            r13 = r0
            r12.addSuppressed(r13)
        L63:
            throw r12
    }

    static <T> T parseObject(java.io.Reader r13, java.lang.reflect.Type r14, com.alibaba.fastjson2.JSONReader.Feature... r15) {
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r1, r15)
            long r3 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r15 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r5 = r15.mask
            long r3 = r3 & r5
            r5 = 0
            int r15 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r15 == 0) goto L1a
            r15 = 1
            goto L1b
        L1a:
            r15 = 0
        L1b:
            com.alibaba.fastjson2.reader.ObjectReader r7 = r1.getObjectReader(r14, r15)
            com.alibaba.fastjson2.JSONReaderUTF16 r8 = new com.alibaba.fastjson2.JSONReaderUTF16
            r8.<init>(r2, r13)
            boolean r13 = r8.isEnd()     // Catch: java.lang.Throwable -> L3e
            if (r13 == 0) goto L2e
            r8.close()
            return r0
        L2e:
            r10 = 0
            r11 = 0
            r9 = r14
            java.lang.Object r13 = r7.readObject(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L3e
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r14 = r8.resolveTasks     // Catch: java.lang.Throwable -> L3e
            if (r14 == 0) goto L41
            r8.handleResolveTasks(r13)     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r0 = move-exception
            r13 = r0
            goto L63
        L41:
            char r14 = r8.f1814ch     // Catch: java.lang.Throwable -> L3e
            r15 = 26
            if (r14 == r15) goto L5f
            long r14 = r2.features     // Catch: java.lang.Throwable -> L3e
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L3e
            long r0 = r0.mask     // Catch: java.lang.Throwable -> L3e
            long r14 = r14 & r0
            int r14 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r14 == 0) goto L53
            goto L5f
        L53:
            com.alibaba.fastjson2.JSONException r13 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r14 = "input not end"
            java.lang.String r14 = r8.info(r14)     // Catch: java.lang.Throwable -> L3e
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L3e
            throw r13     // Catch: java.lang.Throwable -> L3e
        L5f:
            r8.close()
            return r13
        L63:
            r8.close()     // Catch: java.lang.Throwable -> L67
            goto L6c
        L67:
            r0 = move-exception
            r14 = r0
            r13.addSuppressed(r14)
        L6c:
            throw r13
    }

    static <T> T parseObject(java.lang.String r13, int r14, int r15, java.lang.Class<T> r16, com.alibaba.fastjson2.JSONReader.Feature... r17) {
            if (r13 == 0) goto L6e
            boolean r1 = r13.isEmpty()
            if (r1 != 0) goto L6e
            if (r15 != 0) goto Lb
            goto L6e
        Lb:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r3 = r17
            r2.<init>(r1, r3)
            long r3 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r5 = r5.mask
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L25
            r3 = 1
        L22:
            r9 = r16
            goto L27
        L25:
            r3 = 0
            goto L22
        L27:
            com.alibaba.fastjson2.reader.ObjectReader r7 = r1.getObjectReader(r9, r3)
            com.alibaba.fastjson2.JSONReaderUTF16 r8 = new com.alibaba.fastjson2.JSONReaderUTF16
            r8.<init>(r2, r13, r14, r15)
            r10 = 0
            r11 = 0
            java.lang.Object r13 = r7.readObject(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L3f
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r14 = r8.resolveTasks     // Catch: java.lang.Throwable -> L3f
            if (r14 == 0) goto L42
            r8.handleResolveTasks(r13)     // Catch: java.lang.Throwable -> L3f
            goto L42
        L3f:
            r0 = move-exception
            r13 = r0
            goto L64
        L42:
            char r14 = r8.f1814ch     // Catch: java.lang.Throwable -> L3f
            r0 = 26
            if (r14 == r0) goto L60
            long r0 = r2.features     // Catch: java.lang.Throwable -> L3f
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L3f
            long r2 = r14.mask     // Catch: java.lang.Throwable -> L3f
            long r0 = r0 & r2
            int r14 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r14 == 0) goto L54
            goto L60
        L54:
            com.alibaba.fastjson2.JSONException r13 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L3f
            java.lang.String r14 = "input not end"
            java.lang.String r14 = r8.info(r14)     // Catch: java.lang.Throwable -> L3f
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L3f
            throw r13     // Catch: java.lang.Throwable -> L3f
        L60:
            r8.close()
            return r13
        L64:
            r8.close()     // Catch: java.lang.Throwable -> L68
            goto L6d
        L68:
            r0 = move-exception
            r14 = r0
            r13.addSuppressed(r14)
        L6d:
            throw r13
        L6e:
            r13 = 0
            return r13
    }

    static <T> T parseObject(java.lang.String r11, com.alibaba.fastjson2.TypeReference<T> r12, com.alibaba.fastjson2.filter.Filter r13, com.alibaba.fastjson2.JSONReader.Feature... r14) {
            r0 = 0
            if (r11 == 0) goto L71
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto La
            goto L71
        La:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r1, r0, r13, r14)
            java.lang.reflect.Type r5 = r12.getType()
            long r12 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r3 = r14.mask
            long r12 = r12 & r3
            r9 = 0
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            r13 = 0
            if (r12 == 0) goto L25
            r12 = 1
            goto L26
        L25:
            r12 = r13
        L26:
            com.alibaba.fastjson2.reader.ObjectReader r3 = r1.getObjectReader(r5, r12)
            com.alibaba.fastjson2.JSONReaderUTF16 r4 = new com.alibaba.fastjson2.JSONReaderUTF16
            int r12 = r11.length()
            r4.<init>(r2, r11, r13, r12)
            r6 = 0
            r7 = 0
            java.lang.Object r11 = r3.readObject(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L42
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r12 = r4.resolveTasks     // Catch: java.lang.Throwable -> L42
            if (r12 == 0) goto L45
            r4.handleResolveTasks(r11)     // Catch: java.lang.Throwable -> L42
            goto L45
        L42:
            r0 = move-exception
            r11 = r0
            goto L67
        L45:
            char r12 = r4.f1814ch     // Catch: java.lang.Throwable -> L42
            r13 = 26
            if (r12 == r13) goto L63
            long r12 = r2.features     // Catch: java.lang.Throwable -> L42
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L42
            long r0 = r14.mask     // Catch: java.lang.Throwable -> L42
            long r12 = r12 & r0
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r12 == 0) goto L57
            goto L63
        L57:
            com.alibaba.fastjson2.JSONException r11 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L42
            java.lang.String r12 = "input not end"
            java.lang.String r12 = r4.info(r12)     // Catch: java.lang.Throwable -> L42
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L42
            throw r11     // Catch: java.lang.Throwable -> L42
        L63:
            r4.close()
            return r11
        L67:
            r4.close()     // Catch: java.lang.Throwable -> L6b
            goto L70
        L6b:
            r0 = move-exception
            r12 = r0
            r11.addSuppressed(r12)
        L70:
            throw r11
        L71:
            return r0
    }

    static <T> T parseObject(java.lang.String r10, com.alibaba.fastjson2.TypeReference<T> r11, com.alibaba.fastjson2.JSONReader.Feature... r12) {
            if (r10 == 0) goto L70
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L9
            goto L70
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r12)
            java.lang.reflect.Type r4 = r11.getType()
            long r11 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r2 = r2.mask
            long r11 = r11 & r2
            r8 = 0
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            r12 = 0
            if (r11 == 0) goto L24
            r11 = 1
            goto L25
        L24:
            r11 = r12
        L25:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r4, r11)
            com.alibaba.fastjson2.JSONReaderUTF16 r3 = new com.alibaba.fastjson2.JSONReaderUTF16
            int r11 = r10.length()
            r3.<init>(r1, r10, r12, r11)
            r5 = 0
            r6 = 0
            java.lang.Object r10 = r2.readObject(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L41
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r11 = r3.resolveTasks     // Catch: java.lang.Throwable -> L41
            if (r11 == 0) goto L44
            r3.handleResolveTasks(r10)     // Catch: java.lang.Throwable -> L41
            goto L44
        L41:
            r0 = move-exception
            r10 = r0
            goto L66
        L44:
            char r11 = r3.f1814ch     // Catch: java.lang.Throwable -> L41
            r12 = 26
            if (r11 == r12) goto L62
            long r11 = r1.features     // Catch: java.lang.Throwable -> L41
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L41
            long r0 = r0.mask     // Catch: java.lang.Throwable -> L41
            long r11 = r11 & r0
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 == 0) goto L56
            goto L62
        L56:
            com.alibaba.fastjson2.JSONException r10 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L41
            java.lang.String r11 = "input not end"
            java.lang.String r11 = r3.info(r11)     // Catch: java.lang.Throwable -> L41
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L41
            throw r10     // Catch: java.lang.Throwable -> L41
        L62:
            r3.close()
            return r10
        L66:
            r3.close()     // Catch: java.lang.Throwable -> L6a
            goto L6f
        L6a:
            r0 = move-exception
            r11 = r0
            r10.addSuppressed(r11)
        L6f:
            throw r10
        L70:
            r10 = 0
            return r10
    }

    static <T> T parseObject(java.lang.String r12, java.lang.Class<T> r13) {
            if (r12 == 0) goto L6d
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L9
            goto L6d
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0)
            long r2 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r4 = r4.mask
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L20
            r2 = 1
            goto L21
        L20:
            r2 = r3
        L21:
            com.alibaba.fastjson2.reader.ObjectReader r6 = r0.getObjectReader(r13, r2)
            com.alibaba.fastjson2.JSONReaderUTF16 r7 = new com.alibaba.fastjson2.JSONReaderUTF16
            int r0 = r12.length()
            r7.<init>(r1, r12, r3, r0)
            r9 = 0
            r10 = 0
            r8 = r13
            java.lang.Object r12 = r6.readObject(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L3e
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r13 = r7.resolveTasks     // Catch: java.lang.Throwable -> L3e
            if (r13 == 0) goto L41
            r7.handleResolveTasks(r12)     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r0 = move-exception
            r12 = r0
            goto L63
        L41:
            char r13 = r7.f1814ch     // Catch: java.lang.Throwable -> L3e
            r0 = 26
            if (r13 == r0) goto L5f
            long r0 = r1.features     // Catch: java.lang.Throwable -> L3e
            com.alibaba.fastjson2.JSONReader$Feature r13 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L3e
            long r2 = r13.mask     // Catch: java.lang.Throwable -> L3e
            long r0 = r0 & r2
            int r13 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r13 == 0) goto L53
            goto L5f
        L53:
            com.alibaba.fastjson2.JSONException r12 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r13 = "input not end"
            java.lang.String r13 = r7.info(r13)     // Catch: java.lang.Throwable -> L3e
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L3e
            throw r12     // Catch: java.lang.Throwable -> L3e
        L5f:
            r7.close()
            return r12
        L63:
            r7.close()     // Catch: java.lang.Throwable -> L67
            goto L6c
        L67:
            r0 = move-exception
            r13 = r0
            r12.addSuppressed(r13)
        L6c:
            throw r12
        L6d:
            r12 = 0
            return r12
    }

    static <T> T parseObject(java.lang.String r11, java.lang.Class<T> r12, com.alibaba.fastjson2.JSONReader.Context r13) {
            if (r11 == 0) goto L68
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L9
            goto L68
        L9:
            long r0 = r13.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = r1
        L1a:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r4 = r13.provider
            com.alibaba.fastjson2.reader.ObjectReader r5 = r4.getObjectReader(r12, r0)
            com.alibaba.fastjson2.JSONReaderUTF16 r6 = new com.alibaba.fastjson2.JSONReaderUTF16
            int r0 = r11.length()
            r6.<init>(r13, r11, r1, r0)
            r8 = 0
            r9 = 0
            r7 = r12
            java.lang.Object r11 = r5.readObject(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L39
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r12 = r6.resolveTasks     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L3c
            r6.handleResolveTasks(r11)     // Catch: java.lang.Throwable -> L39
            goto L3c
        L39:
            r0 = move-exception
            r11 = r0
            goto L5e
        L3c:
            char r12 = r6.f1814ch     // Catch: java.lang.Throwable -> L39
            r0 = 26
            if (r12 == r0) goto L5a
            long r12 = r13.features     // Catch: java.lang.Throwable -> L39
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L39
            long r0 = r0.mask     // Catch: java.lang.Throwable -> L39
            long r12 = r12 & r0
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L4e
            goto L5a
        L4e:
            com.alibaba.fastjson2.JSONException r11 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L39
            java.lang.String r12 = "input not end"
            java.lang.String r12 = r6.info(r12)     // Catch: java.lang.Throwable -> L39
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L39
            throw r11     // Catch: java.lang.Throwable -> L39
        L5a:
            r6.close()
            return r11
        L5e:
            r6.close()     // Catch: java.lang.Throwable -> L62
            goto L67
        L62:
            r0 = move-exception
            r12 = r0
            r11.addSuppressed(r12)
        L67:
            throw r11
        L68:
            r11 = 0
            return r11
    }

    static <T> T parseObject(java.lang.String r11, java.lang.Class<T> r12, com.alibaba.fastjson2.filter.Filter r13, com.alibaba.fastjson2.JSONReader.Feature... r14) {
            r0 = 0
            if (r11 == 0) goto L78
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto Lb
            goto L78
        Lb:
            com.alibaba.fastjson2.JSONReader$Context r13 = com.alibaba.fastjson2.JSONFactory.createReadContext(r13, r14)
            long r1 = r13.features
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r3 = r14.mask
            long r1 = r1 & r3
            r3 = 0
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = 0
            if (r14 == 0) goto L1f
            r14 = 1
            goto L20
        L1f:
            r14 = r1
        L20:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = r13.provider
            com.alibaba.fastjson2.reader.ObjectReader r5 = r2.getObjectReader(r12, r14)
            com.alibaba.fastjson2.JSONReaderUTF16 r6 = new com.alibaba.fastjson2.JSONReaderUTF16
            int r14 = r11.length()
            r6.<init>(r13, r11, r1, r14)
            boolean r11 = r6.nextIfNull()     // Catch: java.lang.Throwable -> L49
            if (r11 == 0) goto L39
            r6.close()
            return r0
        L39:
            r8 = 0
            r9 = 0
            r7 = r12
            java.lang.Object r11 = r5.readObject(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L49
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r12 = r6.resolveTasks     // Catch: java.lang.Throwable -> L49
            if (r12 == 0) goto L4c
            r6.handleResolveTasks(r11)     // Catch: java.lang.Throwable -> L49
            goto L4c
        L49:
            r0 = move-exception
            r11 = r0
            goto L6e
        L4c:
            char r12 = r6.f1814ch     // Catch: java.lang.Throwable -> L49
            r14 = 26
            if (r12 == r14) goto L6a
            long r12 = r13.features     // Catch: java.lang.Throwable -> L49
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L49
            long r0 = r14.mask     // Catch: java.lang.Throwable -> L49
            long r12 = r12 & r0
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 == 0) goto L5e
            goto L6a
        L5e:
            com.alibaba.fastjson2.JSONException r11 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L49
            java.lang.String r12 = "input not end"
            java.lang.String r12 = r6.info(r12)     // Catch: java.lang.Throwable -> L49
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L49
            throw r11     // Catch: java.lang.Throwable -> L49
        L6a:
            r6.close()
            return r11
        L6e:
            r6.close()     // Catch: java.lang.Throwable -> L72
            goto L77
        L72:
            r0 = move-exception
            r12 = r0
            r11.addSuppressed(r12)
        L77:
            throw r11
        L78:
            return r0
    }

    static <T> T parseObject(java.lang.String r10, java.lang.Class<T> r11, java.lang.String r12, com.alibaba.fastjson2.JSONReader.Feature... r13) {
            if (r10 == 0) goto L79
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto La
            goto L79
        La:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r13)
            if (r12 == 0) goto L1c
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L1c
            r1.setDateFormat(r12)
        L1c:
            long r12 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r2 = r2.mask
            long r12 = r12 & r2
            r2 = 0
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            r13 = 0
            if (r12 == 0) goto L2c
            r12 = 1
            goto L2d
        L2c:
            r12 = r13
        L2d:
            com.alibaba.fastjson2.reader.ObjectReader r4 = r0.getObjectReader(r11, r12)
            com.alibaba.fastjson2.JSONReaderUTF16 r5 = new com.alibaba.fastjson2.JSONReaderUTF16
            int r12 = r10.length()
            r5.<init>(r1, r10, r13, r12)
            r7 = 0
            r8 = 0
            r6 = r11
            java.lang.Object r10 = r4.readObject(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L4a
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r11 = r5.resolveTasks     // Catch: java.lang.Throwable -> L4a
            if (r11 == 0) goto L4d
            r5.handleResolveTasks(r10)     // Catch: java.lang.Throwable -> L4a
            goto L4d
        L4a:
            r0 = move-exception
            r10 = r0
            goto L6f
        L4d:
            char r11 = r5.f1814ch     // Catch: java.lang.Throwable -> L4a
            r12 = 26
            if (r11 == r12) goto L6b
            long r11 = r1.features     // Catch: java.lang.Throwable -> L4a
            com.alibaba.fastjson2.JSONReader$Feature r13 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L4a
            long r0 = r13.mask     // Catch: java.lang.Throwable -> L4a
            long r11 = r11 & r0
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L5f
            goto L6b
        L5f:
            com.alibaba.fastjson2.JSONException r10 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r11 = "input not end"
            java.lang.String r11 = r5.info(r11)     // Catch: java.lang.Throwable -> L4a
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L4a
            throw r10     // Catch: java.lang.Throwable -> L4a
        L6b:
            r5.close()
            return r10
        L6f:
            r5.close()     // Catch: java.lang.Throwable -> L73
            goto L78
        L73:
            r0 = move-exception
            r11 = r0
            r10.addSuppressed(r11)
        L78:
            throw r10
        L79:
            r10 = 0
            return r10
    }

    static <T> T parseObject(java.lang.String r12, java.lang.Class<T> r13, com.alibaba.fastjson2.JSONReader.Feature... r14) {
            if (r12 == 0) goto L6d
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L9
            goto L6d
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r14)
            long r2 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r4 = r14.mask
            long r2 = r2 & r4
            r4 = 0
            int r14 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r2 = 0
            if (r14 == 0) goto L20
            r14 = 1
            goto L21
        L20:
            r14 = r2
        L21:
            com.alibaba.fastjson2.reader.ObjectReader r6 = r0.getObjectReader(r13, r14)
            com.alibaba.fastjson2.JSONReaderUTF16 r7 = new com.alibaba.fastjson2.JSONReaderUTF16
            int r14 = r12.length()
            r7.<init>(r1, r12, r2, r14)
            r9 = 0
            r10 = 0
            r8 = r13
            java.lang.Object r12 = r6.readObject(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L3e
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r13 = r7.resolveTasks     // Catch: java.lang.Throwable -> L3e
            if (r13 == 0) goto L41
            r7.handleResolveTasks(r12)     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r0 = move-exception
            r12 = r0
            goto L63
        L41:
            char r13 = r7.f1814ch     // Catch: java.lang.Throwable -> L3e
            r14 = 26
            if (r13 == r14) goto L5f
            long r13 = r1.features     // Catch: java.lang.Throwable -> L3e
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L3e
            long r0 = r0.mask     // Catch: java.lang.Throwable -> L3e
            long r13 = r13 & r0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 == 0) goto L53
            goto L5f
        L53:
            com.alibaba.fastjson2.JSONException r12 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r13 = "input not end"
            java.lang.String r13 = r7.info(r13)     // Catch: java.lang.Throwable -> L3e
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L3e
            throw r12     // Catch: java.lang.Throwable -> L3e
        L5f:
            r7.close()
            return r12
        L63:
            r7.close()     // Catch: java.lang.Throwable -> L67
            goto L6c
        L67:
            r0 = move-exception
            r13 = r0
            r12.addSuppressed(r13)
        L6c:
            throw r12
        L6d:
            r12 = 0
            return r12
    }

    static <T> T parseObject(java.lang.String r10, java.lang.reflect.Type r11) {
            if (r10 == 0) goto L6b
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L9
            goto L6b
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0)
            com.alibaba.fastjson2.JSONReaderUTF16 r3 = new com.alibaba.fastjson2.JSONReaderUTF16
            int r2 = r10.length()
            r4 = 0
            r3.<init>(r1, r10, r4, r2)
            long r5 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures     // Catch: java.lang.Throwable -> L3c
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased     // Catch: java.lang.Throwable -> L3c
            long r7 = r10.mask     // Catch: java.lang.Throwable -> L3c
            long r5 = r5 & r7
            r8 = 0
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 == 0) goto L28
            r4 = 1
        L28:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r11, r4)     // Catch: java.lang.Throwable -> L3c
            r5 = 0
            r6 = 0
            r4 = r11
            java.lang.Object r10 = r2.readObject(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3c
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r11 = r3.resolveTasks     // Catch: java.lang.Throwable -> L3c
            if (r11 == 0) goto L3f
            r3.handleResolveTasks(r10)     // Catch: java.lang.Throwable -> L3c
            goto L3f
        L3c:
            r0 = move-exception
            r10 = r0
            goto L61
        L3f:
            char r11 = r3.f1814ch     // Catch: java.lang.Throwable -> L3c
            r0 = 26
            if (r11 == r0) goto L5d
            long r0 = r1.features     // Catch: java.lang.Throwable -> L3c
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L3c
            long r4 = r11.mask     // Catch: java.lang.Throwable -> L3c
            long r0 = r0 & r4
            int r11 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r11 == 0) goto L51
            goto L5d
        L51:
            com.alibaba.fastjson2.JSONException r10 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L3c
            java.lang.String r11 = "input not end"
            java.lang.String r11 = r3.info(r11)     // Catch: java.lang.Throwable -> L3c
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L3c
            throw r10     // Catch: java.lang.Throwable -> L3c
        L5d:
            r3.close()
            return r10
        L61:
            r3.close()     // Catch: java.lang.Throwable -> L65
            goto L6a
        L65:
            r0 = move-exception
            r11 = r0
            r10.addSuppressed(r11)
        L6a:
            throw r10
        L6b:
            r10 = 0
            return r10
    }

    static <T> T parseObject(java.lang.String r7, java.lang.reflect.Type r8, com.alibaba.fastjson2.JSONReader.Context r9) {
            if (r7 == 0) goto L54
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L9
            goto L54
        L9:
            com.alibaba.fastjson2.reader.ObjectReader r1 = r9.getObjectReader(r8)
            com.alibaba.fastjson2.JSONReader r2 = com.alibaba.fastjson2.JSONReader.of(r7, r9)
            r4 = 0
            r5 = 0
            r3 = r8
            java.lang.Object r7 = r1.readObject(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L21
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r8 = r2.resolveTasks     // Catch: java.lang.Throwable -> L21
            if (r8 == 0) goto L24
            r2.handleResolveTasks(r7)     // Catch: java.lang.Throwable -> L21
            goto L24
        L21:
            r0 = move-exception
            r7 = r0
            goto L48
        L24:
            char r8 = r2.f1814ch     // Catch: java.lang.Throwable -> L21
            r0 = 26
            if (r8 == r0) goto L44
            long r8 = r9.features     // Catch: java.lang.Throwable -> L21
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L21
            long r0 = r0.mask     // Catch: java.lang.Throwable -> L21
            long r8 = r8 & r0
            r0 = 0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 == 0) goto L38
            goto L44
        L38:
            com.alibaba.fastjson2.JSONException r7 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L21
            java.lang.String r8 = "input not end"
            java.lang.String r8 = r2.info(r8)     // Catch: java.lang.Throwable -> L21
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L21
            throw r7     // Catch: java.lang.Throwable -> L21
        L44:
            r2.close()
            return r7
        L48:
            if (r2 == 0) goto L53
            r2.close()     // Catch: java.lang.Throwable -> L4e
            goto L53
        L4e:
            r0 = move-exception
            r8 = r0
            r7.addSuppressed(r8)
        L53:
            throw r7
        L54:
            r7 = 0
            return r7
    }

    static <T> T parseObject(java.lang.String r11, java.lang.reflect.Type r12, com.alibaba.fastjson2.filter.Filter r13, com.alibaba.fastjson2.JSONReader.Feature... r14) {
            r0 = 0
            if (r11 == 0) goto L6e
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto La
            goto L6e
        La:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r1, r0, r13, r14)
            long r13 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r3 = r0.mask
            long r13 = r13 & r3
            r3 = 0
            int r13 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            r14 = 0
            if (r13 == 0) goto L21
            r13 = 1
            goto L22
        L21:
            r13 = r14
        L22:
            com.alibaba.fastjson2.reader.ObjectReader r5 = r1.getObjectReader(r12, r13)
            com.alibaba.fastjson2.JSONReaderUTF16 r6 = new com.alibaba.fastjson2.JSONReaderUTF16
            int r13 = r11.length()
            r6.<init>(r2, r11, r14, r13)
            r8 = 0
            r9 = 0
            r7 = r12
            java.lang.Object r11 = r5.readObject(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L3f
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r12 = r6.resolveTasks     // Catch: java.lang.Throwable -> L3f
            if (r12 == 0) goto L42
            r6.handleResolveTasks(r11)     // Catch: java.lang.Throwable -> L3f
            goto L42
        L3f:
            r0 = move-exception
            r11 = r0
            goto L64
        L42:
            char r12 = r6.f1814ch     // Catch: java.lang.Throwable -> L3f
            r13 = 26
            if (r12 == r13) goto L60
            long r12 = r2.features     // Catch: java.lang.Throwable -> L3f
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L3f
            long r0 = r14.mask     // Catch: java.lang.Throwable -> L3f
            long r12 = r12 & r0
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 == 0) goto L54
            goto L60
        L54:
            com.alibaba.fastjson2.JSONException r11 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L3f
            java.lang.String r12 = "input not end"
            java.lang.String r12 = r6.info(r12)     // Catch: java.lang.Throwable -> L3f
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L3f
            throw r11     // Catch: java.lang.Throwable -> L3f
        L60:
            r6.close()
            return r11
        L64:
            r6.close()     // Catch: java.lang.Throwable -> L68
            goto L6d
        L68:
            r0 = move-exception
            r12 = r0
            r11.addSuppressed(r12)
        L6d:
            throw r11
        L6e:
            return r0
    }

    static <T> T parseObject(java.lang.String r10, java.lang.reflect.Type r11, java.lang.String r12, com.alibaba.fastjson2.JSONReader.Feature... r13) {
            if (r10 == 0) goto L79
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto La
            goto L79
        La:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r13)
            if (r12 == 0) goto L1c
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L1c
            r1.setDateFormat(r12)
        L1c:
            long r12 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r2 = r2.mask
            long r12 = r12 & r2
            r2 = 0
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            r13 = 0
            if (r12 == 0) goto L2c
            r12 = 1
            goto L2d
        L2c:
            r12 = r13
        L2d:
            com.alibaba.fastjson2.reader.ObjectReader r4 = r0.getObjectReader(r11, r12)
            com.alibaba.fastjson2.JSONReaderUTF16 r5 = new com.alibaba.fastjson2.JSONReaderUTF16
            int r12 = r10.length()
            r5.<init>(r1, r10, r13, r12)
            r7 = 0
            r8 = 0
            r6 = r11
            java.lang.Object r10 = r4.readObject(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L4a
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r11 = r5.resolveTasks     // Catch: java.lang.Throwable -> L4a
            if (r11 == 0) goto L4d
            r5.handleResolveTasks(r10)     // Catch: java.lang.Throwable -> L4a
            goto L4d
        L4a:
            r0 = move-exception
            r10 = r0
            goto L6f
        L4d:
            char r11 = r5.f1814ch     // Catch: java.lang.Throwable -> L4a
            r12 = 26
            if (r11 == r12) goto L6b
            long r11 = r1.features     // Catch: java.lang.Throwable -> L4a
            com.alibaba.fastjson2.JSONReader$Feature r13 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L4a
            long r0 = r13.mask     // Catch: java.lang.Throwable -> L4a
            long r11 = r11 & r0
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 == 0) goto L5f
            goto L6b
        L5f:
            com.alibaba.fastjson2.JSONException r10 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r11 = "input not end"
            java.lang.String r11 = r5.info(r11)     // Catch: java.lang.Throwable -> L4a
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L4a
            throw r10     // Catch: java.lang.Throwable -> L4a
        L6b:
            r5.close()
            return r10
        L6f:
            r5.close()     // Catch: java.lang.Throwable -> L73
            goto L78
        L73:
            r0 = move-exception
            r11 = r0
            r10.addSuppressed(r11)
        L78:
            throw r10
        L79:
            r10 = 0
            return r10
    }

    static <T> T parseObject(java.lang.String r11, java.lang.reflect.Type r12, java.lang.String r13, com.alibaba.fastjson2.filter.Filter[] r14, com.alibaba.fastjson2.JSONReader.Feature... r15) {
            r0 = 0
            if (r11 == 0) goto L7b
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto Lb
            goto L7b
        Lb:
            com.alibaba.fastjson2.JSONReader$Context r14 = com.alibaba.fastjson2.JSONFactory.createReadContext(r14, r15)
            r14.setDateFormat(r13)
            long r1 = r14.features
            com.alibaba.fastjson2.JSONReader$Feature r13 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r3 = r13.mask
            long r1 = r1 & r3
            r3 = 0
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r15 = 0
            if (r13 == 0) goto L22
            r13 = 1
            goto L23
        L22:
            r13 = r15
        L23:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = r14.provider
            com.alibaba.fastjson2.reader.ObjectReader r5 = r1.getObjectReader(r12, r13)
            com.alibaba.fastjson2.JSONReaderUTF16 r6 = new com.alibaba.fastjson2.JSONReaderUTF16
            int r13 = r11.length()
            r6.<init>(r14, r11, r15, r13)
            boolean r11 = r6.nextIfNull()     // Catch: java.lang.Throwable -> L4c
            if (r11 == 0) goto L3c
            r6.close()
            return r0
        L3c:
            r8 = 0
            r9 = 0
            r7 = r12
            java.lang.Object r11 = r5.readObject(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4c
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r12 = r6.resolveTasks     // Catch: java.lang.Throwable -> L4c
            if (r12 == 0) goto L4f
            r6.handleResolveTasks(r11)     // Catch: java.lang.Throwable -> L4c
            goto L4f
        L4c:
            r0 = move-exception
            r11 = r0
            goto L71
        L4f:
            char r12 = r6.f1814ch     // Catch: java.lang.Throwable -> L4c
            r13 = 26
            if (r12 == r13) goto L6d
            long r12 = r14.features     // Catch: java.lang.Throwable -> L4c
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L4c
            long r14 = r14.mask     // Catch: java.lang.Throwable -> L4c
            long r12 = r12 & r14
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 == 0) goto L61
            goto L6d
        L61:
            com.alibaba.fastjson2.JSONException r11 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L4c
            java.lang.String r12 = "input not end"
            java.lang.String r12 = r6.info(r12)     // Catch: java.lang.Throwable -> L4c
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L4c
            throw r11     // Catch: java.lang.Throwable -> L4c
        L6d:
            r6.close()
            return r11
        L71:
            r6.close()     // Catch: java.lang.Throwable -> L75
            goto L7a
        L75:
            r0 = move-exception
            r12 = r0
            r11.addSuppressed(r12)
        L7a:
            throw r11
        L7b:
            return r0
    }

    static <T> T parseObject(java.lang.String r12, java.lang.reflect.Type r13, com.alibaba.fastjson2.JSONReader.Feature... r14) {
            if (r12 == 0) goto L6d
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L9
            goto L6d
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0, r14)
            long r2 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r4 = r14.mask
            long r2 = r2 & r4
            r4 = 0
            int r14 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r2 = 0
            if (r14 == 0) goto L20
            r14 = 1
            goto L21
        L20:
            r14 = r2
        L21:
            com.alibaba.fastjson2.reader.ObjectReader r6 = r0.getObjectReader(r13, r14)
            com.alibaba.fastjson2.JSONReaderUTF16 r7 = new com.alibaba.fastjson2.JSONReaderUTF16
            int r14 = r12.length()
            r7.<init>(r1, r12, r2, r14)
            r9 = 0
            r10 = 0
            r8 = r13
            java.lang.Object r12 = r6.readObject(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L3e
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r13 = r7.resolveTasks     // Catch: java.lang.Throwable -> L3e
            if (r13 == 0) goto L41
            r7.handleResolveTasks(r12)     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r0 = move-exception
            r12 = r0
            goto L63
        L41:
            char r13 = r7.f1814ch     // Catch: java.lang.Throwable -> L3e
            r14 = 26
            if (r13 == r14) goto L5f
            long r13 = r1.features     // Catch: java.lang.Throwable -> L3e
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L3e
            long r0 = r0.mask     // Catch: java.lang.Throwable -> L3e
            long r13 = r13 & r0
            int r13 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r13 == 0) goto L53
            goto L5f
        L53:
            com.alibaba.fastjson2.JSONException r12 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r13 = "input not end"
            java.lang.String r13 = r7.info(r13)     // Catch: java.lang.Throwable -> L3e
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L3e
            throw r12     // Catch: java.lang.Throwable -> L3e
        L5f:
            r7.close()
            return r12
        L63:
            r7.close()     // Catch: java.lang.Throwable -> L67
            goto L6c
        L67:
            r0 = move-exception
            r13 = r0
            r12.addSuppressed(r13)
        L6c:
            throw r12
        L6d:
            r12 = 0
            return r12
    }

    static <T> T parseObject(java.lang.String r1, java.lang.reflect.Type... r2) {
            com.alibaba.fastjson2.util.MultiType r0 = new com.alibaba.fastjson2.util.MultiType
            r0.<init>(r2)
            java.lang.Object r1 = parseObject(r1, r0)
            return r1
    }

    static <T> T parseObject(java.net.URL r3, java.lang.Class<T> r4, com.alibaba.fastjson2.JSONReader.Feature... r5) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            java.io.InputStream r0 = r3.openStream()     // Catch: java.io.IOException -> L12
            java.lang.Object r5 = parseObject(r0, r4, r5)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L14
            r0.close()     // Catch: java.io.IOException -> L12
            return r5
        L12:
            r5 = move-exception
            goto L21
        L14:
            return r5
        L15:
            r5 = move-exception
            if (r0 == 0) goto L20
            r0.close()     // Catch: java.lang.Throwable -> L1c
            goto L20
        L1c:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.io.IOException -> L12
        L20:
            throw r5     // Catch: java.io.IOException -> L12
        L21:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "JSON#parseObject cannot parse '"
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = "' to '"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = "'"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3, r5)
            throw r0
    }

    static <T> T parseObject(java.net.URL r0, java.lang.reflect.Type r1, com.alibaba.fastjson2.JSONReader.Feature... r2) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            java.io.InputStream r0 = r0.openStream()     // Catch: java.io.IOException -> L1e
            java.lang.Object r1 = parseObject(r0, r1, r2)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L11
            r0.close()     // Catch: java.io.IOException -> L1e
        L11:
            return r1
        L12:
            r1 = move-exception
            if (r0 == 0) goto L1d
            r0.close()     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.io.IOException -> L1e
        L1d:
            throw r1     // Catch: java.io.IOException -> L1e
        L1e:
            r0 = move-exception
            java.lang.String r1 = "parseObject error"
            ah.a.x(r1, r0)
            r0 = 0
            return r0
    }

    static <T> T parseObject(java.net.URL r2, java.util.function.Function<com.alibaba.fastjson2.JSONObject, T> r3, com.alibaba.fastjson2.JSONReader.Feature... r4) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.io.InputStream r1 = r2.openStream()     // Catch: java.io.IOException -> L14
            com.alibaba.fastjson2.JSONObject r4 = parseObject(r1, r4)     // Catch: java.lang.Throwable -> L21
            if (r4 != 0) goto L17
            if (r1 == 0) goto L16
            r1.close()     // Catch: java.io.IOException -> L14
            return r0
        L14:
            r3 = move-exception
            goto L2d
        L16:
            return r0
        L17:
            java.lang.Object r3 = r3.apply(r4)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L20
            r1.close()     // Catch: java.io.IOException -> L14
        L20:
            return r3
        L21:
            r3 = move-exception
            if (r1 == 0) goto L2c
            r1.close()     // Catch: java.lang.Throwable -> L28
            goto L2c
        L28:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch: java.io.IOException -> L14
        L2c:
            throw r3     // Catch: java.io.IOException -> L14
        L2d:
            java.lang.String r4 = "JSON#parseObject cannot parse '"
            java.lang.String r0 = "'"
            ah.a.n(r4, r2, r0, r3)
            r2 = 0
            return r2
    }

    static <T> T parseObject(java.nio.ByteBuffer r13, java.lang.Class<T> r14) {
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r1)
            long r3 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r5 = r5.mask
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L1a
            r3 = 1
            goto L1b
        L1a:
            r3 = 0
        L1b:
            com.alibaba.fastjson2.reader.ObjectReader r7 = r1.getObjectReader(r14, r3)
            com.alibaba.fastjson2.JSONReader r8 = com.alibaba.fastjson2.JSONReader.of(r13, r2, r0)
            r10 = 0
            r11 = 0
            r9 = r14
            java.lang.Object r13 = r7.readObject(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L33
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r14 = r8.resolveTasks     // Catch: java.lang.Throwable -> L33
            if (r14 == 0) goto L36
            r8.handleResolveTasks(r13)     // Catch: java.lang.Throwable -> L33
            goto L36
        L33:
            r0 = move-exception
            r13 = r0
            goto L58
        L36:
            char r14 = r8.f1814ch     // Catch: java.lang.Throwable -> L33
            r0 = 26
            if (r14 == r0) goto L54
            long r0 = r2.features     // Catch: java.lang.Throwable -> L33
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L33
            long r2 = r14.mask     // Catch: java.lang.Throwable -> L33
            long r0 = r0 & r2
            int r14 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r14 == 0) goto L48
            goto L54
        L48:
            com.alibaba.fastjson2.JSONException r13 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L33
            java.lang.String r14 = "input not end"
            java.lang.String r14 = r8.info(r14)     // Catch: java.lang.Throwable -> L33
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L33
            throw r13     // Catch: java.lang.Throwable -> L33
        L54:
            r8.close()
            return r13
        L58:
            if (r8 == 0) goto L63
            r8.close()     // Catch: java.lang.Throwable -> L5e
            goto L63
        L5e:
            r0 = move-exception
            r14 = r0
            r13.addSuppressed(r14)
        L63:
            throw r13
    }

    static <T> T parseObject(byte[] r15, int r16, int r17, java.lang.reflect.Type r18, com.alibaba.fastjson2.JSONReader.Feature... r19) {
            if (r15 == 0) goto L75
            int r0 = r15.length
            if (r0 == 0) goto L75
            if (r17 != 0) goto L9
            goto L75
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r1 = r19
            r2.<init>(r0, r1)
            long r3 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r5 = r1.mask
            long r3 = r3 & r5
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L23
            r1 = 1
        L20:
            r11 = r18
            goto L25
        L23:
            r1 = 0
            goto L20
        L25:
            com.alibaba.fastjson2.reader.ObjectReader r9 = r0.getObjectReader(r11, r1)
            com.alibaba.fastjson2.JSONReaderUTF8 r1 = new com.alibaba.fastjson2.JSONReaderUTF8
            r3 = 0
            r4 = r15
            r5 = r16
            r6 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r12 = 0
            r13 = 0
            r10 = r1
            java.lang.Object r15 = r9.readObject(r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L69
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r1.resolveTasks     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L47
            r1.handleResolveTasks(r15)     // Catch: java.lang.Throwable -> L44
            goto L47
        L44:
            r0 = move-exception
        L45:
            r15 = r0
            goto L6c
        L47:
            char r0 = r1.f1814ch     // Catch: java.lang.Throwable -> L44
            r3 = 26
            if (r0 == r3) goto L65
            long r2 = r2.features     // Catch: java.lang.Throwable -> L44
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L44
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L44
            long r2 = r2 & r4
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L59
            goto L65
        L59:
            com.alibaba.fastjson2.JSONException r15 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r1.info(r0)     // Catch: java.lang.Throwable -> L44
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L44
            throw r15     // Catch: java.lang.Throwable -> L44
        L65:
            r1.close()
            return r15
        L69:
            r0 = move-exception
            r1 = r10
            goto L45
        L6c:
            r1.close()     // Catch: java.lang.Throwable -> L70
            goto L74
        L70:
            r0 = move-exception
            r15.addSuppressed(r0)
        L74:
            throw r15
        L75:
            r15 = 0
            return r15
    }

    static <T> T parseObject(byte[] r13, int r14, int r15, java.nio.charset.Charset r16, java.lang.Class<T> r17, com.alibaba.fastjson2.JSONReader.Feature... r18) {
            if (r13 == 0) goto L6f
            int r1 = r13.length
            if (r1 == 0) goto L6f
            if (r15 != 0) goto L9
            goto L6f
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r3 = r18
            r2.<init>(r1, r3)
            long r3 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r5 = r5.mask
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L23
            r3 = 1
        L20:
            r9 = r17
            goto L25
        L23:
            r3 = 0
            goto L20
        L25:
            com.alibaba.fastjson2.reader.ObjectReader r7 = r1.getObjectReader(r9, r3)
            r1 = r16
            com.alibaba.fastjson2.JSONReader r8 = com.alibaba.fastjson2.JSONReader.of(r13, r14, r15, r1, r2)
            r10 = 0
            r11 = 0
            java.lang.Object r13 = r7.readObject(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L3e
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r14 = r8.resolveTasks     // Catch: java.lang.Throwable -> L3e
            if (r14 == 0) goto L41
            r8.handleResolveTasks(r13)     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r0 = move-exception
            r13 = r0
            goto L63
        L41:
            char r14 = r8.f1814ch     // Catch: java.lang.Throwable -> L3e
            r0 = 26
            if (r14 == r0) goto L5f
            long r0 = r2.features     // Catch: java.lang.Throwable -> L3e
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L3e
            long r2 = r14.mask     // Catch: java.lang.Throwable -> L3e
            long r0 = r0 & r2
            int r14 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r14 == 0) goto L53
            goto L5f
        L53:
            com.alibaba.fastjson2.JSONException r13 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r14 = "input not end"
            java.lang.String r14 = r8.info(r14)     // Catch: java.lang.Throwable -> L3e
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L3e
            throw r13     // Catch: java.lang.Throwable -> L3e
        L5f:
            r8.close()
            return r13
        L63:
            if (r8 == 0) goto L6e
            r8.close()     // Catch: java.lang.Throwable -> L69
            goto L6e
        L69:
            r0 = move-exception
            r14 = r0
            r13.addSuppressed(r14)
        L6e:
            throw r13
        L6f:
            r13 = 0
            return r13
    }

    static <T> T parseObject(byte[] r13, int r14, int r15, java.nio.charset.Charset r16, java.lang.reflect.Type r17) {
            if (r13 == 0) goto L6c
            int r1 = r13.length
            if (r1 == 0) goto L6c
            if (r15 != 0) goto L8
            goto L6c
        L8:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r1)
            long r3 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r5 = r5.mask
            long r3 = r3 & r5
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L20
            r3 = 1
        L1d:
            r9 = r17
            goto L22
        L20:
            r3 = 0
            goto L1d
        L22:
            com.alibaba.fastjson2.reader.ObjectReader r7 = r1.getObjectReader(r9, r3)
            r1 = r16
            com.alibaba.fastjson2.JSONReader r8 = com.alibaba.fastjson2.JSONReader.of(r13, r14, r15, r1, r2)
            r10 = 0
            r11 = 0
            java.lang.Object r13 = r7.readObject(r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L3b
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r14 = r8.resolveTasks     // Catch: java.lang.Throwable -> L3b
            if (r14 == 0) goto L3e
            r8.handleResolveTasks(r13)     // Catch: java.lang.Throwable -> L3b
            goto L3e
        L3b:
            r0 = move-exception
            r13 = r0
            goto L60
        L3e:
            char r14 = r8.f1814ch     // Catch: java.lang.Throwable -> L3b
            r0 = 26
            if (r14 == r0) goto L5c
            long r0 = r2.features     // Catch: java.lang.Throwable -> L3b
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L3b
            long r2 = r14.mask     // Catch: java.lang.Throwable -> L3b
            long r0 = r0 & r2
            int r14 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r14 == 0) goto L50
            goto L5c
        L50:
            com.alibaba.fastjson2.JSONException r13 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L3b
            java.lang.String r14 = "input not end"
            java.lang.String r14 = r8.info(r14)     // Catch: java.lang.Throwable -> L3b
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L3b
            throw r13     // Catch: java.lang.Throwable -> L3b
        L5c:
            r8.close()
            return r13
        L60:
            if (r8 == 0) goto L6b
            r8.close()     // Catch: java.lang.Throwable -> L66
            goto L6b
        L66:
            r0 = move-exception
            r14 = r0
            r13.addSuppressed(r14)
        L6b:
            throw r13
        L6c:
            r13 = 0
            return r13
    }

    static <T> T parseObject(byte[] r9, java.lang.Class<T> r10) {
            if (r9 == 0) goto L5c
            int r0 = r9.length
            if (r0 != 0) goto L6
            goto L5c
        L6:
            com.alibaba.fastjson2.JSONReader$Context r2 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            com.alibaba.fastjson2.JSONReaderUTF8 r1 = new com.alibaba.fastjson2.JSONReaderUTF8
            r5 = 0
            int r6 = r9.length
            r3 = 0
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            com.alibaba.fastjson2.reader.ObjectReader r3 = r2.getObjectReader(r10)     // Catch: java.lang.Throwable -> L28
            r6 = 0
            r7 = 0
            r5 = r10
            r4 = r1
            java.lang.Object r9 = r3.readObject(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4f
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r10 = r1.resolveTasks     // Catch: java.lang.Throwable -> L28
            if (r10 == 0) goto L2b
            r1.handleResolveTasks(r9)     // Catch: java.lang.Throwable -> L28
            goto L2b
        L28:
            r0 = move-exception
        L29:
            r9 = r0
            goto L52
        L2b:
            char r10 = r1.f1814ch     // Catch: java.lang.Throwable -> L28
            r0 = 26
            if (r10 == r0) goto L4b
            long r2 = r2.features     // Catch: java.lang.Throwable -> L28
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L28
            long r4 = r10.mask     // Catch: java.lang.Throwable -> L28
            long r2 = r2 & r4
            r4 = 0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 == 0) goto L3f
            goto L4b
        L3f:
            com.alibaba.fastjson2.JSONException r9 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L28
            java.lang.String r10 = "input not end"
            java.lang.String r10 = r1.info(r10)     // Catch: java.lang.Throwable -> L28
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L28
            throw r9     // Catch: java.lang.Throwable -> L28
        L4b:
            r1.close()
            return r9
        L4f:
            r0 = move-exception
            r1 = r4
            goto L29
        L52:
            r1.close()     // Catch: java.lang.Throwable -> L56
            goto L5b
        L56:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L5b:
            throw r9
        L5c:
            r9 = 0
            return r9
    }

    static <T> T parseObject(byte[] r9, java.lang.Class<T> r10, com.alibaba.fastjson2.JSONReader.Context r11) {
            if (r9 == 0) goto L6d
            int r0 = r9.length
            if (r0 != 0) goto L7
            goto L6d
        L7:
            com.alibaba.fastjson2.JSONReaderUTF8 r1 = new com.alibaba.fastjson2.JSONReaderUTF8
            r5 = 0
            int r6 = r9.length
            r3 = 0
            r4 = r9
            r2 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r9 = r2
            long r2 = r9.features     // Catch: java.lang.Throwable -> L3b
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased     // Catch: java.lang.Throwable -> L3b
            long r4 = r11.mask     // Catch: java.lang.Throwable -> L3b
            long r2 = r2 & r4
            r7 = 0
            int r11 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r11 == 0) goto L21
            r11 = 1
            goto L22
        L21:
            r11 = 0
        L22:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = r9.provider     // Catch: java.lang.Throwable -> L3b
            com.alibaba.fastjson2.reader.ObjectReader r11 = r0.getObjectReader(r10, r11)     // Catch: java.lang.Throwable -> L3b
            r4 = 0
            r5 = 0
            r3 = r10
            r2 = r1
            r1 = r11
            java.lang.Object r10 = r1.readObject(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L60
            r1 = r2
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r11 = r1.resolveTasks     // Catch: java.lang.Throwable -> L3b
            if (r11 == 0) goto L3e
            r1.handleResolveTasks(r10)     // Catch: java.lang.Throwable -> L3b
            goto L3e
        L3b:
            r0 = move-exception
        L3c:
            r9 = r0
            goto L63
        L3e:
            char r11 = r1.f1814ch     // Catch: java.lang.Throwable -> L3b
            r0 = 26
            if (r11 == r0) goto L5c
            long r2 = r9.features     // Catch: java.lang.Throwable -> L3b
            com.alibaba.fastjson2.JSONReader$Feature r9 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L3b
            long r4 = r9.mask     // Catch: java.lang.Throwable -> L3b
            long r2 = r2 & r4
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 == 0) goto L50
            goto L5c
        L50:
            com.alibaba.fastjson2.JSONException r9 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L3b
            java.lang.String r10 = "input not end"
            java.lang.String r10 = r1.info(r10)     // Catch: java.lang.Throwable -> L3b
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L3b
            throw r9     // Catch: java.lang.Throwable -> L3b
        L5c:
            r1.close()
            return r10
        L60:
            r0 = move-exception
            r1 = r2
            goto L3c
        L63:
            r1.close()     // Catch: java.lang.Throwable -> L67
            goto L6c
        L67:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L6c:
            throw r9
        L6d:
            r9 = 0
            return r9
    }

    static <T> T parseObject(byte[] r11, java.lang.Class<T> r12, com.alibaba.fastjson2.filter.Filter r13, com.alibaba.fastjson2.JSONReader.Feature... r14) {
            if (r11 == 0) goto L70
            int r0 = r11.length
            if (r0 != 0) goto L7
            goto L70
        L7:
            com.alibaba.fastjson2.JSONReader$Context r2 = com.alibaba.fastjson2.JSONFactory.createReadContext()
            com.alibaba.fastjson2.JSONReaderUTF8 r1 = new com.alibaba.fastjson2.JSONReaderUTF8
            r5 = 0
            int r6 = r11.length
            r3 = 0
            r4 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r2.config(r13, r14)     // Catch: java.lang.Throwable -> L3e
            long r13 = r2.features     // Catch: java.lang.Throwable -> L3e
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased     // Catch: java.lang.Throwable -> L3e
            long r3 = r11.mask     // Catch: java.lang.Throwable -> L3e
            long r13 = r13 & r3
            r9 = 0
            int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r11 == 0) goto L26
            r11 = 1
            goto L27
        L26:
            r11 = 0
        L27:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r13 = r2.provider     // Catch: java.lang.Throwable -> L3e
            com.alibaba.fastjson2.reader.ObjectReader r3 = r13.getObjectReader(r12, r11)     // Catch: java.lang.Throwable -> L3e
            r6 = 0
            r7 = 0
            r5 = r12
            r4 = r1
            java.lang.Object r11 = r3.readObject(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L63
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r12 = r1.resolveTasks     // Catch: java.lang.Throwable -> L3e
            if (r12 == 0) goto L41
            r1.handleResolveTasks(r11)     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r0 = move-exception
        L3f:
            r11 = r0
            goto L66
        L41:
            char r12 = r1.f1814ch     // Catch: java.lang.Throwable -> L3e
            r13 = 26
            if (r12 == r13) goto L5f
            long r12 = r2.features     // Catch: java.lang.Throwable -> L3e
            com.alibaba.fastjson2.JSONReader$Feature r14 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L3e
            long r2 = r14.mask     // Catch: java.lang.Throwable -> L3e
            long r12 = r12 & r2
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r12 == 0) goto L53
            goto L5f
        L53:
            com.alibaba.fastjson2.JSONException r11 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r12 = "input not end"
            java.lang.String r12 = r1.info(r12)     // Catch: java.lang.Throwable -> L3e
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L3e
            throw r11     // Catch: java.lang.Throwable -> L3e
        L5f:
            r1.close()
            return r11
        L63:
            r0 = move-exception
            r1 = r4
            goto L3f
        L66:
            r1.close()     // Catch: java.lang.Throwable -> L6a
            goto L6f
        L6a:
            r0 = move-exception
            r12 = r0
            r11.addSuppressed(r12)
        L6f:
            throw r11
        L70:
            r11 = 0
            return r11
    }

    static <T> T parseObject(byte[] r15, java.lang.Class<T> r16, com.alibaba.fastjson2.JSONReader.Feature... r17) {
            if (r15 == 0) goto L71
            int r0 = r15.length
            if (r0 != 0) goto L7
            goto L71
        L7:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r1 = r17
            r2.<init>(r0, r1)
            long r3 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r5 = r1.mask
            long r3 = r3 & r5
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L21
            r1 = 1
        L1e:
            r11 = r16
            goto L23
        L21:
            r1 = 0
            goto L1e
        L23:
            com.alibaba.fastjson2.reader.ObjectReader r9 = r0.getObjectReader(r11, r1)
            com.alibaba.fastjson2.JSONReaderUTF8 r1 = new com.alibaba.fastjson2.JSONReaderUTF8
            r5 = 0
            int r6 = r15.length
            r3 = 0
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r12 = 0
            r13 = 0
            r10 = r1
            java.lang.Object r15 = r9.readObject(r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L65
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r1.resolveTasks     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L43
            r1.handleResolveTasks(r15)     // Catch: java.lang.Throwable -> L40
            goto L43
        L40:
            r0 = move-exception
        L41:
            r15 = r0
            goto L68
        L43:
            char r0 = r1.f1814ch     // Catch: java.lang.Throwable -> L40
            r3 = 26
            if (r0 == r3) goto L61
            long r2 = r2.features     // Catch: java.lang.Throwable -> L40
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L40
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L40
            long r2 = r2 & r4
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L55
            goto L61
        L55:
            com.alibaba.fastjson2.JSONException r15 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r1.info(r0)     // Catch: java.lang.Throwable -> L40
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L40
            throw r15     // Catch: java.lang.Throwable -> L40
        L61:
            r1.close()
            return r15
        L65:
            r0 = move-exception
            r1 = r10
            goto L41
        L68:
            r1.close()     // Catch: java.lang.Throwable -> L6c
            goto L70
        L6c:
            r0 = move-exception
            r15.addSuppressed(r0)
        L70:
            throw r15
        L71:
            r15 = 0
            return r15
    }

    static <T> T parseObject(byte[] r15, java.lang.reflect.Type r16) {
            if (r15 == 0) goto L6f
            int r0 = r15.length
            if (r0 != 0) goto L7
            goto L6f
        L7:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r0)
            long r3 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r5 = r1.mask
            long r3 = r3 & r5
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L1f
            r1 = 1
        L1c:
            r11 = r16
            goto L21
        L1f:
            r1 = 0
            goto L1c
        L21:
            com.alibaba.fastjson2.reader.ObjectReader r9 = r0.getObjectReader(r11, r1)
            com.alibaba.fastjson2.JSONReaderUTF8 r1 = new com.alibaba.fastjson2.JSONReaderUTF8
            r5 = 0
            int r6 = r15.length
            r3 = 0
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r12 = 0
            r13 = 0
            r10 = r1
            java.lang.Object r15 = r9.readObject(r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L63
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r1.resolveTasks     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L41
            r1.handleResolveTasks(r15)     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r0 = move-exception
        L3f:
            r15 = r0
            goto L66
        L41:
            char r0 = r1.f1814ch     // Catch: java.lang.Throwable -> L3e
            r3 = 26
            if (r0 == r3) goto L5f
            long r2 = r2.features     // Catch: java.lang.Throwable -> L3e
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L3e
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L3e
            long r2 = r2 & r4
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L53
            goto L5f
        L53:
            com.alibaba.fastjson2.JSONException r15 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r1.info(r0)     // Catch: java.lang.Throwable -> L3e
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L3e
            throw r15     // Catch: java.lang.Throwable -> L3e
        L5f:
            r1.close()
            return r15
        L63:
            r0 = move-exception
            r1 = r10
            goto L3f
        L66:
            r1.close()     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r0 = move-exception
            r15.addSuppressed(r0)
        L6e:
            throw r15
        L6f:
            r15 = 0
            return r15
    }

    static <T> T parseObject(byte[] r15, java.lang.reflect.Type r16, com.alibaba.fastjson2.filter.Filter r17, com.alibaba.fastjson2.JSONReader.Feature... r18) {
            r0 = 0
            if (r15 == 0) goto L74
            int r1 = r15.length
            if (r1 != 0) goto L8
            goto L74
        L8:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r3 = r17
            r5 = r18
            r2.<init>(r1, r0, r3, r5)
            long r5 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r7 = r0.mask
            long r5 = r5 & r7
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L24
            r0 = 1
        L21:
            r11 = r16
            goto L26
        L24:
            r0 = 0
            goto L21
        L26:
            com.alibaba.fastjson2.reader.ObjectReader r9 = r1.getObjectReader(r11, r0)
            com.alibaba.fastjson2.JSONReaderUTF8 r1 = new com.alibaba.fastjson2.JSONReaderUTF8
            r5 = 0
            int r6 = r15.length
            r3 = 0
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r12 = 0
            r13 = 0
            r10 = r1
            java.lang.Object r0 = r9.readObject(r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L68
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r3 = r1.resolveTasks     // Catch: java.lang.Throwable -> L43
            if (r3 == 0) goto L46
            r1.handleResolveTasks(r0)     // Catch: java.lang.Throwable -> L43
            goto L46
        L43:
            r0 = move-exception
        L44:
            r2 = r0
            goto L6b
        L46:
            char r3 = r1.f1814ch     // Catch: java.lang.Throwable -> L43
            r4 = 26
            if (r3 == r4) goto L64
            long r2 = r2.features     // Catch: java.lang.Throwable -> L43
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L43
            long r4 = r4.mask     // Catch: java.lang.Throwable -> L43
            long r2 = r2 & r4
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L58
            goto L64
        L58:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "input not end"
            java.lang.String r2 = r1.info(r2)     // Catch: java.lang.Throwable -> L43
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L43
            throw r0     // Catch: java.lang.Throwable -> L43
        L64:
            r1.close()
            return r0
        L68:
            r0 = move-exception
            r1 = r10
            goto L44
        L6b:
            r1.close()     // Catch: java.lang.Throwable -> L6f
            goto L73
        L6f:
            r0 = move-exception
            r2.addSuppressed(r0)
        L73:
            throw r2
        L74:
            return r0
    }

    static <T> T parseObject(byte[] r15, java.lang.reflect.Type r16, java.lang.String r17, com.alibaba.fastjson2.JSONReader.Feature... r18) {
            r0 = r17
            if (r15 == 0) goto L7e
            int r1 = r15.length
            if (r1 != 0) goto L9
            goto L7e
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r3 = r18
            r2.<init>(r1, r3)
            if (r0 == 0) goto L1d
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L1d
            r2.setDateFormat(r0)
        L1d:
            long r5 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r7 = r0.mask
            long r5 = r5 & r7
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L2e
            r0 = 1
        L2b:
            r11 = r16
            goto L30
        L2e:
            r0 = 0
            goto L2b
        L30:
            com.alibaba.fastjson2.reader.ObjectReader r9 = r1.getObjectReader(r11, r0)
            com.alibaba.fastjson2.JSONReaderUTF8 r1 = new com.alibaba.fastjson2.JSONReaderUTF8
            r5 = 0
            int r6 = r15.length
            r3 = 0
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r12 = 0
            r13 = 0
            r10 = r1
            java.lang.Object r0 = r9.readObject(r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L72
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r3 = r1.resolveTasks     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L50
            r1.handleResolveTasks(r0)     // Catch: java.lang.Throwable -> L4d
            goto L50
        L4d:
            r0 = move-exception
        L4e:
            r2 = r0
            goto L75
        L50:
            char r3 = r1.f1814ch     // Catch: java.lang.Throwable -> L4d
            r4 = 26
            if (r3 == r4) goto L6e
            long r2 = r2.features     // Catch: java.lang.Throwable -> L4d
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L4d
            long r4 = r4.mask     // Catch: java.lang.Throwable -> L4d
            long r2 = r2 & r4
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L62
            goto L6e
        L62:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = "input not end"
            java.lang.String r2 = r1.info(r2)     // Catch: java.lang.Throwable -> L4d
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L4d
            throw r0     // Catch: java.lang.Throwable -> L4d
        L6e:
            r1.close()
            return r0
        L72:
            r0 = move-exception
            r1 = r10
            goto L4e
        L75:
            r1.close()     // Catch: java.lang.Throwable -> L79
            goto L7d
        L79:
            r0 = move-exception
            r2.addSuppressed(r0)
        L7d:
            throw r2
        L7e:
            r0 = 0
            return r0
    }

    static <T> T parseObject(byte[] r15, java.lang.reflect.Type r16, java.lang.String r17, com.alibaba.fastjson2.filter.Filter[] r18, com.alibaba.fastjson2.JSONReader.Feature... r19) {
            r0 = 0
            if (r15 == 0) goto L79
            int r1 = r15.length
            if (r1 != 0) goto L8
            goto L79
        L8:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r3 = r18
            r5 = r19
            r2.<init>(r1, r0, r3, r5)
            r0 = r17
            r2.setDateFormat(r0)
            long r5 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r7 = r0.mask
            long r5 = r5 & r7
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L29
            r0 = 1
        L26:
            r11 = r16
            goto L2b
        L29:
            r0 = 0
            goto L26
        L2b:
            com.alibaba.fastjson2.reader.ObjectReader r9 = r1.getObjectReader(r11, r0)
            com.alibaba.fastjson2.JSONReaderUTF8 r1 = new com.alibaba.fastjson2.JSONReaderUTF8
            r5 = 0
            int r6 = r15.length
            r3 = 0
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r12 = 0
            r13 = 0
            r10 = r1
            java.lang.Object r0 = r9.readObject(r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L6d
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r3 = r1.resolveTasks     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L4b
            r1.handleResolveTasks(r0)     // Catch: java.lang.Throwable -> L48
            goto L4b
        L48:
            r0 = move-exception
        L49:
            r2 = r0
            goto L70
        L4b:
            char r3 = r1.f1814ch     // Catch: java.lang.Throwable -> L48
            r4 = 26
            if (r3 == r4) goto L69
            long r2 = r2.features     // Catch: java.lang.Throwable -> L48
            com.alibaba.fastjson2.JSONReader$Feature r4 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L48
            long r4 = r4.mask     // Catch: java.lang.Throwable -> L48
            long r2 = r2 & r4
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto L5d
            goto L69
        L5d:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L48
            java.lang.String r2 = "input not end"
            java.lang.String r2 = r1.info(r2)     // Catch: java.lang.Throwable -> L48
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L48
            throw r0     // Catch: java.lang.Throwable -> L48
        L69:
            r1.close()
            return r0
        L6d:
            r0 = move-exception
            r1 = r10
            goto L49
        L70:
            r1.close()     // Catch: java.lang.Throwable -> L74
            goto L78
        L74:
            r0 = move-exception
            r2.addSuppressed(r0)
        L78:
            throw r2
        L79:
            return r0
    }

    static <T> T parseObject(byte[] r15, java.lang.reflect.Type r16, com.alibaba.fastjson2.JSONReader.Feature... r17) {
            if (r15 == 0) goto L71
            int r0 = r15.length
            if (r0 != 0) goto L7
            goto L71
        L7:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r1 = r17
            r2.<init>(r0, r1)
            long r3 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r5 = r1.mask
            long r3 = r3 & r5
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L21
            r1 = 1
        L1e:
            r11 = r16
            goto L23
        L21:
            r1 = 0
            goto L1e
        L23:
            com.alibaba.fastjson2.reader.ObjectReader r9 = r0.getObjectReader(r11, r1)
            com.alibaba.fastjson2.JSONReaderUTF8 r1 = new com.alibaba.fastjson2.JSONReaderUTF8
            r5 = 0
            int r6 = r15.length
            r3 = 0
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r12 = 0
            r13 = 0
            r10 = r1
            java.lang.Object r15 = r9.readObject(r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L65
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r1.resolveTasks     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L43
            r1.handleResolveTasks(r15)     // Catch: java.lang.Throwable -> L40
            goto L43
        L40:
            r0 = move-exception
        L41:
            r15 = r0
            goto L68
        L43:
            char r0 = r1.f1814ch     // Catch: java.lang.Throwable -> L40
            r3 = 26
            if (r0 == r3) goto L61
            long r2 = r2.features     // Catch: java.lang.Throwable -> L40
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L40
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L40
            long r2 = r2 & r4
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L55
            goto L61
        L55:
            com.alibaba.fastjson2.JSONException r15 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r1.info(r0)     // Catch: java.lang.Throwable -> L40
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L40
            throw r15     // Catch: java.lang.Throwable -> L40
        L61:
            r1.close()
            return r15
        L65:
            r0 = move-exception
            r1 = r10
            goto L41
        L68:
            r1.close()     // Catch: java.lang.Throwable -> L6c
            goto L70
        L6c:
            r0 = move-exception
            r15.addSuppressed(r0)
        L70:
            throw r15
        L71:
            r15 = 0
            return r15
    }

    static <T> T parseObject(char[] r15, int r16, int r17, java.lang.reflect.Type r18, com.alibaba.fastjson2.JSONReader.Feature... r19) {
            if (r15 == 0) goto L75
            int r0 = r15.length
            if (r0 == 0) goto L75
            if (r17 != 0) goto L9
            goto L75
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r1 = r19
            r2.<init>(r0, r1)
            long r3 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r5 = r1.mask
            long r3 = r3 & r5
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L23
            r1 = 1
        L20:
            r11 = r18
            goto L25
        L23:
            r1 = 0
            goto L20
        L25:
            com.alibaba.fastjson2.reader.ObjectReader r9 = r0.getObjectReader(r11, r1)
            com.alibaba.fastjson2.JSONReaderUTF16 r1 = new com.alibaba.fastjson2.JSONReaderUTF16
            r3 = 0
            r4 = r15
            r5 = r16
            r6 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r12 = 0
            r13 = 0
            r10 = r1
            java.lang.Object r15 = r9.readObject(r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L69
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r1.resolveTasks     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L47
            r1.handleResolveTasks(r15)     // Catch: java.lang.Throwable -> L44
            goto L47
        L44:
            r0 = move-exception
        L45:
            r15 = r0
            goto L6c
        L47:
            char r0 = r1.f1814ch     // Catch: java.lang.Throwable -> L44
            r3 = 26
            if (r0 == r3) goto L65
            long r2 = r2.features     // Catch: java.lang.Throwable -> L44
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L44
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L44
            long r2 = r2 & r4
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L59
            goto L65
        L59:
            com.alibaba.fastjson2.JSONException r15 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r1.info(r0)     // Catch: java.lang.Throwable -> L44
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L44
            throw r15     // Catch: java.lang.Throwable -> L44
        L65:
            r1.close()
            return r15
        L69:
            r0 = move-exception
            r1 = r10
            goto L45
        L6c:
            r1.close()     // Catch: java.lang.Throwable -> L70
            goto L74
        L70:
            r0 = move-exception
            r15.addSuppressed(r0)
        L74:
            throw r15
        L75:
            r15 = 0
            return r15
    }

    static <T> T parseObject(char[] r15, java.lang.Class<T> r16) {
            if (r15 == 0) goto L6f
            int r0 = r15.length
            if (r0 != 0) goto L7
            goto L6f
        L7:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r2.<init>(r0)
            long r3 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r5 = r1.mask
            long r3 = r3 & r5
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L1f
            r1 = 1
        L1c:
            r11 = r16
            goto L21
        L1f:
            r1 = 0
            goto L1c
        L21:
            com.alibaba.fastjson2.reader.ObjectReader r9 = r0.getObjectReader(r11, r1)
            com.alibaba.fastjson2.JSONReaderUTF16 r1 = new com.alibaba.fastjson2.JSONReaderUTF16
            r5 = 0
            int r6 = r15.length
            r3 = 0
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r12 = 0
            r13 = 0
            r10 = r1
            java.lang.Object r15 = r9.readObject(r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L63
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r1.resolveTasks     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L41
            r1.handleResolveTasks(r15)     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r0 = move-exception
        L3f:
            r15 = r0
            goto L66
        L41:
            char r0 = r1.f1814ch     // Catch: java.lang.Throwable -> L3e
            r3 = 26
            if (r0 == r3) goto L5f
            long r2 = r2.features     // Catch: java.lang.Throwable -> L3e
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L3e
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L3e
            long r2 = r2 & r4
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L53
            goto L5f
        L53:
            com.alibaba.fastjson2.JSONException r15 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r1.info(r0)     // Catch: java.lang.Throwable -> L3e
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L3e
            throw r15     // Catch: java.lang.Throwable -> L3e
        L5f:
            r1.close()
            return r15
        L63:
            r0 = move-exception
            r1 = r10
            goto L3f
        L66:
            r1.close()     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r0 = move-exception
            r15.addSuppressed(r0)
        L6e:
            throw r15
        L6f:
            r15 = 0
            return r15
    }

    static <T> T parseObject(char[] r15, java.lang.Class<T> r16, com.alibaba.fastjson2.JSONReader.Feature... r17) {
            if (r15 == 0) goto L71
            int r0 = r15.length
            if (r0 != 0) goto L7
            goto L71
        L7:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r1 = r17
            r2.<init>(r0, r1)
            long r3 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r5 = r1.mask
            long r3 = r3 & r5
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L21
            r1 = 1
        L1e:
            r11 = r16
            goto L23
        L21:
            r1 = 0
            goto L1e
        L23:
            com.alibaba.fastjson2.reader.ObjectReader r9 = r0.getObjectReader(r11, r1)
            com.alibaba.fastjson2.JSONReaderUTF16 r1 = new com.alibaba.fastjson2.JSONReaderUTF16
            r5 = 0
            int r6 = r15.length
            r3 = 0
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r12 = 0
            r13 = 0
            r10 = r1
            java.lang.Object r15 = r9.readObject(r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L65
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r1.resolveTasks     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L43
            r1.handleResolveTasks(r15)     // Catch: java.lang.Throwable -> L40
            goto L43
        L40:
            r0 = move-exception
        L41:
            r15 = r0
            goto L68
        L43:
            char r0 = r1.f1814ch     // Catch: java.lang.Throwable -> L40
            r3 = 26
            if (r0 == r3) goto L61
            long r2 = r2.features     // Catch: java.lang.Throwable -> L40
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L40
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L40
            long r2 = r2 & r4
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L55
            goto L61
        L55:
            com.alibaba.fastjson2.JSONException r15 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r1.info(r0)     // Catch: java.lang.Throwable -> L40
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L40
            throw r15     // Catch: java.lang.Throwable -> L40
        L61:
            r1.close()
            return r15
        L65:
            r0 = move-exception
            r1 = r10
            goto L41
        L68:
            r1.close()     // Catch: java.lang.Throwable -> L6c
            goto L70
        L6c:
            r0 = move-exception
            r15.addSuppressed(r0)
        L70:
            throw r15
        L71:
            r15 = 0
            return r15
    }

    static <T> T parseObject(char[] r15, java.lang.reflect.Type r16, com.alibaba.fastjson2.JSONReader.Feature... r17) {
            if (r15 == 0) goto L71
            int r0 = r15.length
            if (r0 != 0) goto L7
            goto L71
        L7:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r2 = new com.alibaba.fastjson2.JSONReader$Context
            r1 = r17
            r2.<init>(r0, r1)
            long r3 = r2.features
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r5 = r1.mask
            long r3 = r3 & r5
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L21
            r1 = 1
        L1e:
            r11 = r16
            goto L23
        L21:
            r1 = 0
            goto L1e
        L23:
            com.alibaba.fastjson2.reader.ObjectReader r9 = r0.getObjectReader(r11, r1)
            com.alibaba.fastjson2.JSONReaderUTF16 r1 = new com.alibaba.fastjson2.JSONReaderUTF16
            r5 = 0
            int r6 = r15.length
            r3 = 0
            r4 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            r12 = 0
            r13 = 0
            r10 = r1
            java.lang.Object r15 = r9.readObject(r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L65
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r0 = r1.resolveTasks     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L43
            r1.handleResolveTasks(r15)     // Catch: java.lang.Throwable -> L40
            goto L43
        L40:
            r0 = move-exception
        L41:
            r15 = r0
            goto L68
        L43:
            char r0 = r1.f1814ch     // Catch: java.lang.Throwable -> L40
            r3 = 26
            if (r0 == r3) goto L61
            long r2 = r2.features     // Catch: java.lang.Throwable -> L40
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L40
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L40
            long r2 = r2 & r4
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L55
            goto L61
        L55:
            com.alibaba.fastjson2.JSONException r15 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = "input not end"
            java.lang.String r0 = r1.info(r0)     // Catch: java.lang.Throwable -> L40
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L40
            throw r15     // Catch: java.lang.Throwable -> L40
        L61:
            r1.close()
            return r15
        L65:
            r0 = move-exception
            r1 = r10
            goto L41
        L68:
            r1.close()     // Catch: java.lang.Throwable -> L6c
            goto L70
        L6c:
            r0 = move-exception
            r15.addSuppressed(r0)
        L70:
            throw r15
        L71:
            r15 = 0
            return r15
    }

    static <T extends java.util.Map<java.lang.String, java.lang.Object>> T parseObject(java.lang.String r10, com.alibaba.fastjson2.util.MapMultiValueType<T> r11) {
            if (r10 == 0) goto L6d
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L9
            goto L6d
        L9:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r1 = new com.alibaba.fastjson2.JSONReader$Context
            r1.<init>(r0)
            com.alibaba.fastjson2.JSONReaderUTF16 r3 = new com.alibaba.fastjson2.JSONReaderUTF16
            int r2 = r10.length()
            r4 = 0
            r3.<init>(r1, r10, r4, r2)
            long r5 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures     // Catch: java.lang.Throwable -> L3e
            com.alibaba.fastjson2.JSONReader$Feature r10 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased     // Catch: java.lang.Throwable -> L3e
            long r7 = r10.mask     // Catch: java.lang.Throwable -> L3e
            long r5 = r5 & r7
            r8 = 0
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 == 0) goto L28
            r4 = 1
        L28:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r0.getObjectReader(r11, r4)     // Catch: java.lang.Throwable -> L3e
            r5 = 0
            r6 = 0
            r4 = r11
            java.lang.Object r10 = r2.readObject(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3e
            java.util.Map r10 = (java.util.Map) r10     // Catch: java.lang.Throwable -> L3e
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r11 = r3.resolveTasks     // Catch: java.lang.Throwable -> L3e
            if (r11 == 0) goto L41
            r3.handleResolveTasks(r10)     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r0 = move-exception
            r10 = r0
            goto L63
        L41:
            char r11 = r3.f1814ch     // Catch: java.lang.Throwable -> L3e
            r0 = 26
            if (r11 == r0) goto L5f
            long r0 = r1.features     // Catch: java.lang.Throwable -> L3e
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L3e
            long r4 = r11.mask     // Catch: java.lang.Throwable -> L3e
            long r0 = r0 & r4
            int r11 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r11 == 0) goto L53
            goto L5f
        L53:
            com.alibaba.fastjson2.JSONException r10 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L3e
            java.lang.String r11 = "input not end"
            java.lang.String r11 = r3.info(r11)     // Catch: java.lang.Throwable -> L3e
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L3e
            throw r10     // Catch: java.lang.Throwable -> L3e
        L5f:
            r3.close()
            return r10
        L63:
            r3.close()     // Catch: java.lang.Throwable -> L67
            goto L6c
        L67:
            r0 = move-exception
            r11 = r0
            r10.addSuppressed(r11)
        L6c:
            throw r10
        L6d:
            r10 = 0
            return r10
    }

    static <T> void parseObject(java.io.InputStream r6, java.lang.reflect.Type r7, java.util.function.Consumer<T> r8, com.alibaba.fastjson2.JSONReader.Feature... r9) {
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            r2 = 10
            r0 = r6
            r3 = r7
            r4 = r8
            r5 = r9
            parseObject(r0, r1, r2, r3, r4, r5)
            return
    }

    static <T> void parseObject(java.io.InputStream r21, java.nio.charset.Charset r22, char r23, java.lang.reflect.Type r24, java.util.function.Consumer<T> r25, com.alibaba.fastjson2.JSONReader.Feature... r26) {
            r2 = r24
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            int r0 = java.lang.System.identityHashCode(r0)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r1 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            int r3 = r1.length
            r6 = 1
            int r3 = r3 - r6
            r0 = r0 & r3
            r7 = r1[r0]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r0 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r7, r1)
            byte[] r0 = (byte[]) r0
            r8 = 524288(0x80000, float:7.34684E-40)
            if (r0 != 0) goto L21
            byte[] r0 = new byte[r8]
        L21:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r9 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r10 = new com.alibaba.fastjson2.JSONReader$Context
            r3 = r26
            r10.<init>(r9, r3)
            long r3 = r10.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r11 = r5.mask
            long r3 = r3 & r11
            r11 = 0
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r3 == 0) goto L39
            r14 = r6
            goto L3a
        L39:
            r14 = 0
        L3a:
            r15 = r0
            r0 = 0
            r3 = 0
        L3d:
            int r4 = r15.length     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            int r4 = r4 - r0
            r5 = r21
            int r4 = r5.read(r15, r0, r4)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            r6 = -1
            if (r4 != r6) goto L4e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r0 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            r0.lazySet(r7, r15)
            return
        L4e:
            int r6 = r0 + r4
            r4 = 0
        L51:
            if (r0 >= r6) goto Lc0
            r16 = r8
            r8 = r15[r0]     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            r17 = r11
            r11 = r23
            if (r8 != r11) goto Lb2
            int r4 = r0 - r3
            r8 = r22
            com.alibaba.fastjson2.JSONReader r3 = com.alibaba.fastjson2.JSONReader.of(r15, r3, r4, r8, r10)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            if (r1 != 0) goto L6b
            com.alibaba.fastjson2.reader.ObjectReader r1 = r9.getObjectReader(r2, r14)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
        L6b:
            r4 = r3
            goto L73
        L6d:
            r0 = move-exception
            goto L107
        L70:
            r0 = move-exception
            goto Leb
        L73:
            r3 = 0
            r12 = r0
            r0 = r1
            r1 = r4
            r4 = 0
            java.lang.Object r3 = r0.readObject(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            java.util.List<com.alibaba.fastjson2.JSONReader$ResolveTask> r4 = r1.resolveTasks     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            if (r4 == 0) goto L84
            r1.handleResolveTasks(r3)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
        L84:
            char r4 = r1.f1814ch     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            r5 = 26
            if (r4 == r5) goto L9a
            com.alibaba.fastjson2.JSONReader$Context r4 = r1.context     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            long r4 = r4.features     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            com.alibaba.fastjson2.JSONReader$Feature r13 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreCheckClose     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            r19 = r4
            long r4 = r13.mask     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            long r4 = r19 & r4
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 == 0) goto L9d
        L9a:
            r5 = r25
            goto La9
        L9d:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            java.lang.String r3 = "input not end"
            java.lang.String r1 = r1.info(r3)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            throw r0     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
        La9:
            r5.accept(r3)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            int r1 = r12 + 1
            r3 = r1
            r4 = 1
            r1 = r0
            goto Lb7
        Lb2:
            r8 = r22
            r5 = r25
            r12 = r0
        Lb7:
            int r0 = r12 + 1
            r5 = r21
            r8 = r16
            r11 = r17
            goto L51
        Lc0:
            r5 = r25
            r16 = r8
            r17 = r11
            r8 = r22
            r11 = r23
            int r0 = r15.length     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            if (r6 != r0) goto Le2
            if (r4 == 0) goto Ld7
            int r0 = r15.length     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            int r0 = r0 - r3
            r4 = 0
            java.lang.System.arraycopy(r15, r3, r15, r4, r0)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            r3 = r4
            goto Le4
        Ld7:
            r4 = 0
            int r0 = r15.length     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            int r0 = r0 + r16
            byte[] r0 = java.util.Arrays.copyOf(r15, r0)     // Catch: java.lang.Throwable -> L6d java.io.IOException -> L70
            r15 = r0
        Le0:
            r0 = r6
            goto Le4
        Le2:
            r4 = 0
            goto Le0
        Le4:
            r8 = r16
            r11 = r17
            r6 = 1
            goto L3d
        Leb:
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L6d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d
            r3.<init>()     // Catch: java.lang.Throwable -> L6d
            java.lang.String r4 = "JSON#parseObject cannot parse the 'InputStream' to '"
            r3.append(r4)     // Catch: java.lang.Throwable -> L6d
            r3.append(r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = "'"
            r3.append(r2)     // Catch: java.lang.Throwable -> L6d
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L6d
            throw r1     // Catch: java.lang.Throwable -> L6d
        L107:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, byte[]> r1 = com.alibaba.fastjson2.JSONFactory.BYTES_UPDATER
            r1.lazySet(r7, r15)
            throw r0
    }

    static <T> void parseObject(java.io.Reader r17, char r18, java.lang.reflect.Type r19, java.util.function.Consumer<T> r20) {
            r2 = r19
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            int r0 = java.lang.System.identityHashCode(r0)
            com.alibaba.fastjson2.JSONFactory$CacheItem[] r1 = com.alibaba.fastjson2.JSONFactory.CACHE_ITEMS
            int r3 = r1.length
            r6 = 1
            int r3 = r3 - r6
            r0 = r0 & r3
            r7 = r1[r0]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r0 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r7, r1)
            char[] r0 = (char[]) r0
            r8 = 8192(0x2000, float:1.148E-41)
            if (r0 != 0) goto L21
            char[] r0 = new char[r8]
        L21:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r9 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.JSONReader$Context r10 = new com.alibaba.fastjson2.JSONReader$Context
            r10.<init>(r9)
            long r3 = r10.features
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r11 = r5.mask
            long r3 = r3 & r11
            r11 = 0
            int r3 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            r11 = 0
            if (r3 == 0) goto L38
            r12 = r6
            goto L39
        L38:
            r12 = r11
        L39:
            r13 = r0
            r0 = r11
            r3 = r0
        L3c:
            int r4 = r13.length     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            int r4 = r4 - r0
            r14 = r17
            int r4 = r14.read(r13, r0, r4)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            r5 = -1
            if (r4 != r5) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r0 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            r0.lazySet(r7, r13)
            return
        L4d:
            int r15 = r0 + r4
            r4 = r11
        L50:
            if (r0 >= r15) goto L88
            char r5 = r13[r0]     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            r6 = r18
            if (r5 != r6) goto L80
            int r4 = r0 - r3
            com.alibaba.fastjson2.JSONReader r3 = com.alibaba.fastjson2.JSONReader.of(r13, r3, r4, r10)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            if (r1 != 0) goto L64
            com.alibaba.fastjson2.reader.ObjectReader r1 = r9.getObjectReader(r2, r12)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
        L64:
            r4 = r3
            goto L6a
        L66:
            r0 = move-exception
            goto Lbe
        L68:
            r0 = move-exception
            goto La2
        L6a:
            r3 = 0
            r16 = r0
            r0 = r1
            r1 = r4
            r4 = 0
            java.lang.Object r1 = r0.readObject(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            r5 = r20
            r5.accept(r1)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            int r1 = r16 + 1
            r3 = r1
            r4 = 1
            r1 = r0
            goto L84
        L80:
            r5 = r20
            r16 = r0
        L84:
            int r0 = r16 + 1
            r6 = 1
            goto L50
        L88:
            r6 = r18
            r5 = r20
            int r0 = r13.length     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            if (r15 != r0) goto L9f
            if (r4 == 0) goto L98
            int r0 = r13.length     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            int r0 = r0 - r3
            java.lang.System.arraycopy(r13, r3, r13, r11, r0)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            r3 = r11
            goto La0
        L98:
            int r0 = r13.length     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            int r0 = r0 + r8
            char[] r0 = java.util.Arrays.copyOf(r13, r0)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
            r13 = r0
        L9f:
            r0 = r15
        La0:
            r6 = 1
            goto L3c
        La2:
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException     // Catch: java.lang.Throwable -> L66
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r3.<init>()     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = "JSON#parseObject cannot parse the 'Reader' to '"
            r3.append(r4)     // Catch: java.lang.Throwable -> L66
            r3.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = "'"
            r3.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L66
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L66
            throw r1     // Catch: java.lang.Throwable -> L66
        Lbe:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.JSONFactory$CacheItem, char[]> r1 = com.alibaba.fastjson2.JSONFactory.CHARS_UPDATER
            r1.lazySet(r7, r13)
            throw r0
    }

    static com.alibaba.fastjson2.reader.ObjectReader<?> register(java.lang.reflect.Type r1, com.alibaba.fastjson2.reader.ObjectReader<?> r2) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.register(r1, r2)
            return r1
    }

    static com.alibaba.fastjson2.writer.ObjectWriter<?> register(java.lang.reflect.Type r1, com.alibaba.fastjson2.writer.ObjectWriter<?> r2) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.register(r1, r2)
            return r1
    }

    static void register(java.lang.Class r1, com.alibaba.fastjson2.filter.Filter r2) {
            boolean r0 = r2 instanceof com.alibaba.fastjson2.filter.AfterFilter
            if (r0 != 0) goto L26
            boolean r0 = r2 instanceof com.alibaba.fastjson2.filter.BeforeFilter
            if (r0 != 0) goto L26
            boolean r0 = r2 instanceof com.alibaba.fastjson2.filter.ContextNameFilter
            if (r0 != 0) goto L26
            boolean r0 = r2 instanceof com.alibaba.fastjson2.filter.ContextValueFilter
            if (r0 != 0) goto L26
            boolean r0 = r2 instanceof com.alibaba.fastjson2.filter.LabelFilter
            if (r0 != 0) goto L26
            boolean r0 = r2 instanceof com.alibaba.fastjson2.filter.NameFilter
            if (r0 != 0) goto L26
            boolean r0 = r2 instanceof com.alibaba.fastjson2.filter.PropertyFilter
            if (r0 != 0) goto L26
            boolean r0 = r2 instanceof com.alibaba.fastjson2.filter.PropertyPreFilter
            if (r0 != 0) goto L26
            boolean r0 = r2 instanceof com.alibaba.fastjson2.filter.ValueFilter
            if (r0 == 0) goto L25
            goto L26
        L25:
            return
        L26:
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.getObjectWriter(r1)
            r1.setFilter(r2)
            return
    }

    static com.alibaba.fastjson2.reader.ObjectReader<?> registerIfAbsent(java.lang.reflect.Type r1, com.alibaba.fastjson2.reader.ObjectReader<?> r2) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.registerIfAbsent(r1, r2)
            return r1
    }

    static com.alibaba.fastjson2.writer.ObjectWriter<?> registerIfAbsent(java.lang.reflect.Type r1, com.alibaba.fastjson2.writer.ObjectWriter<?> r2) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.registerIfAbsent(r1, r2)
            return r1
    }

    static void registerSeeAlsoSubType(java.lang.Class r1) {
            r0 = 0
            registerSeeAlsoSubType(r1, r0)
            return
    }

    static void registerSeeAlsoSubType(java.lang.Class r1, java.lang.String r2) {
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r0.registerSeeAlsoSubType(r1, r2)
            return
    }

    static <T> T to(java.lang.Class<T> r1, java.lang.Object r2) {
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r0 = r2 instanceof com.alibaba.fastjson2.JSONObject
            if (r0 == 0) goto L12
            com.alibaba.fastjson2.JSONObject r2 = (com.alibaba.fastjson2.JSONObject) r2
            r0 = 0
            com.alibaba.fastjson2.JSONReader$Feature[] r0 = new com.alibaba.fastjson2.JSONReader.Feature[r0]
            java.lang.Object r1 = r2.to(r1, r0)
            return r1
        L12:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.cast(r2, r1, r0)
            return r1
    }

    static java.lang.Object toJSON(java.lang.Object r1) {
            r0 = 0
            java.lang.Object r1 = toJSON(r1, r0)
            return r1
    }

    static java.lang.Object toJSON(java.lang.Object r8, com.alibaba.fastjson2.JSONWriter.Feature... r9) {
            if (r8 != 0) goto L4
            r8 = 0
            return r8
        L4:
            boolean r0 = r8 instanceof com.alibaba.fastjson2.JSONObject
            if (r0 != 0) goto L73
            boolean r0 = r8 instanceof com.alibaba.fastjson2.JSONArray
            if (r0 == 0) goto Ld
            return r8
        Ld:
            if (r9 != 0) goto L14
            com.alibaba.fastjson2.JSONWriter$Context r9 = com.alibaba.fastjson2.JSONFactory.createWriteContext()
            goto L18
        L14:
            com.alibaba.fastjson2.JSONWriter$Context r9 = com.alibaba.fastjson2.JSONFactory.createWriteContext(r9)
        L18:
            java.lang.Class r0 = r8.getClass()
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r9.getObjectWriter(r0, r0)
            boolean r0 = r1 instanceof com.alibaba.fastjson2.writer.ObjectWriterAdapter
            if (r0 == 0) goto L44
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            boolean r0 = r9.isEnabled(r0)
            if (r0 != 0) goto L44
            long r2 = r1.getFeatures()
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r4 = r0.mask
            long r2 = r2 & r4
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L44
            com.alibaba.fastjson2.writer.ObjectWriterAdapter r1 = (com.alibaba.fastjson2.writer.ObjectWriterAdapter) r1
            long r2 = r9.features
            com.alibaba.fastjson2.JSONObject r8 = r1.toJSONObject(r8, r2)
            return r8
        L44:
            com.alibaba.fastjson2.JSONWriter r2 = com.alibaba.fastjson2.JSONWriter.of(r9)     // Catch: java.lang.Throwable -> L6a
            long r6 = r9.features     // Catch: java.lang.Throwable -> L5c
            r4 = 0
            r5 = 0
            r3 = r8
            r1.write(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L5c
            r2.close()     // Catch: java.lang.Throwable -> L6a java.lang.Throwable -> L6a
            java.lang.Object r8 = parse(r8)
            return r8
        L5c:
            r0 = move-exception
            r8 = r0
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.lang.Throwable -> L64
            goto L69
        L64:
            r0 = move-exception
            r9 = r0
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> L6a java.lang.Throwable -> L6a
        L69:
            throw r8     // Catch: java.lang.Throwable -> L6a java.lang.Throwable -> L6a
        L6a:
            r0 = move-exception
            r8 = r0
            java.lang.String r9 = "toJSONString error"
            ah.a.x(r9, r8)
            r8 = 0
            return r8
        L73:
            r3 = r8
            return r3
    }

    static byte[] toJSONBytes(java.lang.Object r13) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0)
            long r2 = r1.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r4 = r4.mask
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            com.alibaba.fastjson2.JSONWriterUTF8 r7 = new com.alibaba.fastjson2.JSONWriterUTF8
            r7.<init>(r1)
            if (r13 != 0) goto L25
            r7.writeNull()     // Catch: java.lang.Throwable -> L22
            goto L4d
        L22:
            r0 = move-exception
            r13 = r0
            goto L55
        L25:
            r7.rootObject = r13     // Catch: java.lang.Throwable -> L22
            com.alibaba.fastjson2.JSONWriter$Path r1 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L22
            r7.path = r1     // Catch: java.lang.Throwable -> L22
            java.lang.Class r1 = r13.getClass()     // Catch: java.lang.Throwable -> L22
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r3 = com.alibaba.fastjson2.JSONObject.class
            if (r1 != r3) goto L41
            com.alibaba.fastjson2.JSONWriter$Context r3 = r7.context     // Catch: java.lang.Throwable -> L22
            long r8 = r3.features     // Catch: java.lang.Throwable -> L22
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 != 0) goto L41
            com.alibaba.fastjson2.JSONObject r13 = (com.alibaba.fastjson2.JSONObject) r13     // Catch: java.lang.Throwable -> L22
            r7.write(r13)     // Catch: java.lang.Throwable -> L22
            goto L4d
        L41:
            com.alibaba.fastjson2.writer.ObjectWriter r6 = r0.getObjectWriter(r1, r1, r2)     // Catch: java.lang.Throwable -> L22
            r10 = 0
            r11 = 0
            r9 = 0
            r8 = r13
            r6.write(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L22
        L4d:
            byte[] r13 = r7.getBytes()     // Catch: java.lang.Throwable -> L22
            r7.close()
            return r13
        L55:
            r7.close()     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r0 = move-exception
            r13.addSuppressed(r0)
        L5d:
            throw r13
    }

    static byte[] toJSONBytes(java.lang.Object r9, java.lang.String r10, com.alibaba.fastjson2.JSONWriter.Feature... r11) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0, r11)
            if (r10 == 0) goto L12
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L12
            r1.setDateFormat(r10)
        L12:
            long r10 = r1.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r2 = r2.mask
            long r10 = r10 & r2
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 == 0) goto L21
            r10 = 1
            goto L22
        L21:
            r10 = 0
        L22:
            com.alibaba.fastjson2.JSONWriterUTF8 r3 = new com.alibaba.fastjson2.JSONWriterUTF8
            r3.<init>(r1)
            if (r9 != 0) goto L30
            r3.writeNull()     // Catch: java.lang.Throwable -> L2d
            goto L46
        L2d:
            r0 = move-exception
            r9 = r0
            goto L4e
        L30:
            r3.rootObject = r9     // Catch: java.lang.Throwable -> L2d
            com.alibaba.fastjson2.JSONWriter$Path r11 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L2d
            r3.path = r11     // Catch: java.lang.Throwable -> L2d
            java.lang.Class r11 = r9.getClass()     // Catch: java.lang.Throwable -> L2d
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r11, r11, r10)     // Catch: java.lang.Throwable -> L2d
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r9
            r2.write(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2d
        L46:
            byte[] r9 = r3.getBytes()     // Catch: java.lang.Throwable -> L2d
            r3.close()
            return r9
        L4e:
            r3.close()     // Catch: java.lang.Throwable -> L52
            goto L57
        L52:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L57:
            throw r9
    }

    static byte[] toJSONBytes(java.lang.Object r9, java.lang.String r10, com.alibaba.fastjson2.filter.Filter[] r11, com.alibaba.fastjson2.JSONWriter.Feature... r12) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0, r12)
            r1.configFilter(r11)
            long r2 = r1.features
            com.alibaba.fastjson2.JSONWriter$Feature r12 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r4 = r12.mask
            long r2 = r2 & r4
            r4 = 0
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 == 0) goto L19
            r12 = 1
            goto L1a
        L19:
            r12 = 0
        L1a:
            com.alibaba.fastjson2.JSONWriterUTF8 r3 = new com.alibaba.fastjson2.JSONWriterUTF8
            r3.<init>(r1)
            if (r9 != 0) goto L28
            r3.writeNull()     // Catch: java.lang.Throwable -> L25
            goto L55
        L25:
            r0 = move-exception
            r9 = r0
            goto L5d
        L28:
            r3.rootObject = r9     // Catch: java.lang.Throwable -> L25
            com.alibaba.fastjson2.JSONWriter$Path r1 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L25
            r3.path = r1     // Catch: java.lang.Throwable -> L25
            if (r10 == 0) goto L3b
            boolean r1 = r10.isEmpty()     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L3b
            com.alibaba.fastjson2.JSONWriter$Context r1 = r3.context     // Catch: java.lang.Throwable -> L25
            r1.setDateFormat(r10)     // Catch: java.lang.Throwable -> L25
        L3b:
            if (r11 == 0) goto L45
            int r10 = r11.length     // Catch: java.lang.Throwable -> L25
            if (r10 == 0) goto L45
            com.alibaba.fastjson2.JSONWriter$Context r10 = r3.context     // Catch: java.lang.Throwable -> L25
            r10.configFilter(r11)     // Catch: java.lang.Throwable -> L25
        L45:
            java.lang.Class r10 = r9.getClass()     // Catch: java.lang.Throwable -> L25
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r10, r10, r12)     // Catch: java.lang.Throwable -> L25
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r9
            r2.write(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L25
        L55:
            byte[] r9 = r3.getBytes()     // Catch: java.lang.Throwable -> L25
            r3.close()
            return r9
        L5d:
            r3.close()     // Catch: java.lang.Throwable -> L61
            goto L66
        L61:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L66:
            throw r9
    }

    static byte[] toJSONBytes(java.lang.Object r9, java.nio.charset.Charset r10, com.alibaba.fastjson2.JSONWriter.Context r11) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = r11.provider
            com.alibaba.fastjson2.JSONWriter r2 = com.alibaba.fastjson2.JSONWriter.ofUTF8(r11)
            if (r9 != 0) goto Lf
            r2.writeNull()     // Catch: java.lang.Throwable -> Lc
            goto L47
        Lc:
            r0 = move-exception
            r9 = r0
            goto L4f
        Lf:
            r2.rootObject = r9     // Catch: java.lang.Throwable -> Lc
            com.alibaba.fastjson2.JSONWriter$Path r11 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> Lc
            r2.path = r11     // Catch: java.lang.Throwable -> Lc
            java.lang.Class r11 = r9.getClass()     // Catch: java.lang.Throwable -> Lc
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r1 = com.alibaba.fastjson2.JSONObject.class
            r3 = 0
            if (r11 != r1) goto L2d
            com.alibaba.fastjson2.JSONWriter$Context r1 = r2.context     // Catch: java.lang.Throwable -> Lc
            long r5 = r1.features     // Catch: java.lang.Throwable -> Lc
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L2d
            com.alibaba.fastjson2.JSONObject r9 = (com.alibaba.fastjson2.JSONObject) r9     // Catch: java.lang.Throwable -> Lc
            r2.write(r9)     // Catch: java.lang.Throwable -> Lc
            goto L47
        L2d:
            long r5 = com.alibaba.fastjson2.JSONFactory.defaultWriterFeatures     // Catch: java.lang.Throwable -> Lc
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased     // Catch: java.lang.Throwable -> Lc
            long r7 = r1.mask     // Catch: java.lang.Throwable -> Lc
            long r5 = r5 & r7
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 == 0) goto L3a
            r1 = 1
            goto L3b
        L3a:
            r1 = 0
        L3b:
            com.alibaba.fastjson2.writer.ObjectWriter r1 = r0.getObjectWriter(r11, r11, r1)     // Catch: java.lang.Throwable -> Lc
            r5 = 0
            r6 = 0
            r4 = 0
            r3 = r9
            r1.write(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lc
        L47:
            byte[] r9 = r2.getBytes(r10)     // Catch: java.lang.Throwable -> Lc
            r2.close()
            return r9
        L4f:
            if (r2 == 0) goto L5a
            r2.close()     // Catch: java.lang.Throwable -> L55
            goto L5a
        L55:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L5a:
            throw r9
    }

    static byte[] toJSONBytes(java.lang.Object r9, java.nio.charset.Charset r10, com.alibaba.fastjson2.JSONWriter.Feature... r11) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0, r11)
            com.alibaba.fastjson2.JSONWriter r3 = com.alibaba.fastjson2.JSONWriter.ofUTF8(r1)
            if (r9 != 0) goto L14
            r3.writeNull()     // Catch: java.lang.Throwable -> L11
            goto L4c
        L11:
            r0 = move-exception
            r9 = r0
            goto L54
        L14:
            r3.rootObject = r9     // Catch: java.lang.Throwable -> L11
            com.alibaba.fastjson2.JSONWriter$Path r11 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L11
            r3.path = r11     // Catch: java.lang.Throwable -> L11
            java.lang.Class r11 = r9.getClass()     // Catch: java.lang.Throwable -> L11
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r1 = com.alibaba.fastjson2.JSONObject.class
            r4 = 0
            if (r11 != r1) goto L32
            com.alibaba.fastjson2.JSONWriter$Context r1 = r3.context     // Catch: java.lang.Throwable -> L11
            long r1 = r1.features     // Catch: java.lang.Throwable -> L11
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L32
            com.alibaba.fastjson2.JSONObject r9 = (com.alibaba.fastjson2.JSONObject) r9     // Catch: java.lang.Throwable -> L11
            r3.write(r9)     // Catch: java.lang.Throwable -> L11
            goto L4c
        L32:
            long r1 = com.alibaba.fastjson2.JSONFactory.defaultWriterFeatures     // Catch: java.lang.Throwable -> L11
            com.alibaba.fastjson2.JSONWriter$Feature r6 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased     // Catch: java.lang.Throwable -> L11
            long r6 = r6.mask     // Catch: java.lang.Throwable -> L11
            long r1 = r1 & r6
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L3f
            r1 = 1
            goto L40
        L3f:
            r1 = 0
        L40:
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r11, r11, r1)     // Catch: java.lang.Throwable -> L11
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r9
            r2.write(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L11
        L4c:
            byte[] r9 = r3.getBytes(r10)     // Catch: java.lang.Throwable -> L11
            r3.close()
            return r9
        L54:
            if (r3 == 0) goto L5f
            r3.close()     // Catch: java.lang.Throwable -> L5a
            goto L5f
        L5a:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L5f:
            throw r9
    }

    static byte[] toJSONBytes(java.lang.Object r9, com.alibaba.fastjson2.JSONWriter.Feature... r10) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0, r10)
            long r2 = r1.features
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r4 = r10.mask
            long r2 = r2 & r4
            r4 = 0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 == 0) goto L16
            r10 = 1
            goto L17
        L16:
            r10 = 0
        L17:
            com.alibaba.fastjson2.JSONWriterUTF8 r3 = new com.alibaba.fastjson2.JSONWriterUTF8
            r3.<init>(r1)
            if (r9 != 0) goto L25
            r3.writeNull()     // Catch: java.lang.Throwable -> L22
            goto L3b
        L22:
            r0 = move-exception
            r9 = r0
            goto L43
        L25:
            r3.rootObject = r9     // Catch: java.lang.Throwable -> L22
            com.alibaba.fastjson2.JSONWriter$Path r1 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L22
            r3.path = r1     // Catch: java.lang.Throwable -> L22
            java.lang.Class r1 = r9.getClass()     // Catch: java.lang.Throwable -> L22
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r1, r1, r10)     // Catch: java.lang.Throwable -> L22
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r9
            r2.write(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L22
        L3b:
            byte[] r9 = r3.getBytes()     // Catch: java.lang.Throwable -> L22
            r3.close()
            return r9
        L43:
            r3.close()     // Catch: java.lang.Throwable -> L47
            goto L4c
        L47:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L4c:
            throw r9
    }

    static byte[] toJSONBytes(java.lang.Object r10, com.alibaba.fastjson2.filter.Filter... r11) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0)
            r1.configFilter(r11)
            long r2 = r1.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r4 = r4.mask
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L19
            r2 = 1
            goto L1a
        L19:
            r2 = 0
        L1a:
            com.alibaba.fastjson2.JSONWriterUTF8 r4 = new com.alibaba.fastjson2.JSONWriterUTF8
            r4.<init>(r1)
            if (r11 == 0) goto L2d
            int r1 = r11.length     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2d
            com.alibaba.fastjson2.JSONWriter$Context r1 = r4.context     // Catch: java.lang.Throwable -> L2a
            r1.configFilter(r11)     // Catch: java.lang.Throwable -> L2a
            goto L2d
        L2a:
            r0 = move-exception
            r10 = r0
            goto L51
        L2d:
            if (r10 != 0) goto L33
            r4.writeNull()     // Catch: java.lang.Throwable -> L2a
            goto L49
        L33:
            r4.rootObject = r10     // Catch: java.lang.Throwable -> L2a
            com.alibaba.fastjson2.JSONWriter$Path r11 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L2a
            r4.path = r11     // Catch: java.lang.Throwable -> L2a
            java.lang.Class r11 = r10.getClass()     // Catch: java.lang.Throwable -> L2a
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r0.getObjectWriter(r11, r11, r2)     // Catch: java.lang.Throwable -> L2a
            r7 = 0
            r8 = 0
            r6 = 0
            r5 = r10
            r3.write(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2a
        L49:
            byte[] r10 = r4.getBytes()     // Catch: java.lang.Throwable -> L2a
            r4.close()
            return r10
        L51:
            r4.close()     // Catch: java.lang.Throwable -> L55
            goto L5a
        L55:
            r0 = move-exception
            r11 = r0
            r10.addSuppressed(r11)
        L5a:
            throw r10
    }

    static byte[] toJSONBytes(java.lang.Object r9, com.alibaba.fastjson2.filter.Filter[] r10, com.alibaba.fastjson2.JSONWriter.Feature... r11) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0, r11)
            r1.configFilter(r10)
            long r10 = r1.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r2 = r2.mask
            long r10 = r10 & r2
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 == 0) goto L19
            r10 = 1
            goto L1a
        L19:
            r10 = 0
        L1a:
            com.alibaba.fastjson2.JSONWriterUTF8 r3 = new com.alibaba.fastjson2.JSONWriterUTF8
            r3.<init>(r1)
            if (r9 != 0) goto L28
            r3.writeNull()     // Catch: java.lang.Throwable -> L25
            goto L3e
        L25:
            r0 = move-exception
            r9 = r0
            goto L46
        L28:
            r3.rootObject = r9     // Catch: java.lang.Throwable -> L25
            com.alibaba.fastjson2.JSONWriter$Path r11 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L25
            r3.path = r11     // Catch: java.lang.Throwable -> L25
            java.lang.Class r11 = r9.getClass()     // Catch: java.lang.Throwable -> L25
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r11, r11, r10)     // Catch: java.lang.Throwable -> L25
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r9
            r2.write(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L25
        L3e:
            byte[] r9 = r3.getBytes()     // Catch: java.lang.Throwable -> L25
            r3.close()
            return r9
        L46:
            r3.close()     // Catch: java.lang.Throwable -> L4a
            goto L4f
        L4a:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L4f:
            throw r9
    }

    static java.lang.String toJSONString(java.lang.Object r13) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0)
            long r2 = com.alibaba.fastjson2.JSONFactory.defaultWriterFeatures
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.OptimizedForAscii
            long r4 = r4.mask
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            com.alibaba.fastjson2.JSONWriterUTF8 r2 = new com.alibaba.fastjson2.JSONWriterUTF8     // Catch: java.lang.NumberFormatException -> L1b java.lang.NullPointerException -> L1f
            r2.<init>(r1)     // Catch: java.lang.NumberFormatException -> L1b java.lang.NullPointerException -> L1f
        L19:
            r7 = r2
            goto L27
        L1b:
            r0 = move-exception
        L1c:
            r8 = r13
            goto L7e
        L1f:
            r0 = move-exception
            goto L1c
        L21:
            com.alibaba.fastjson2.JSONWriterUTF16 r2 = new com.alibaba.fastjson2.JSONWriterUTF16     // Catch: java.lang.NumberFormatException -> L1b java.lang.NullPointerException -> L1f
            r2.<init>(r1)     // Catch: java.lang.NumberFormatException -> L1b java.lang.NullPointerException -> L1f
            goto L19
        L27:
            if (r13 != 0) goto L32
            r7.writeNull()     // Catch: java.lang.Throwable -> L2e
        L2c:
            r8 = r13
            goto L67
        L2e:
            r0 = move-exception
            r8 = r13
        L30:
            r13 = r0
            goto L75
        L32:
            r7.rootObject = r13     // Catch: java.lang.Throwable -> L2e
            com.alibaba.fastjson2.JSONWriter$Path r2 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L2e
            r7.path = r2     // Catch: java.lang.Throwable -> L2e
            java.lang.Class r2 = r13.getClass()     // Catch: java.lang.Throwable -> L2e
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r3 = com.alibaba.fastjson2.JSONObject.class
            if (r2 != r3) goto L4d
            long r8 = r1.features     // Catch: java.lang.Throwable -> L2e
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 != 0) goto L4d
            r0 = r13
            com.alibaba.fastjson2.JSONObject r0 = (com.alibaba.fastjson2.JSONObject) r0     // Catch: java.lang.Throwable -> L2e
            r7.write(r0)     // Catch: java.lang.Throwable -> L2e
            goto L2c
        L4d:
            long r8 = r1.features     // Catch: java.lang.Throwable -> L2e
            com.alibaba.fastjson2.JSONWriter$Feature r1 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased     // Catch: java.lang.Throwable -> L2e
            long r10 = r1.mask     // Catch: java.lang.Throwable -> L2e
            long r8 = r8 & r10
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 == 0) goto L5a
            r1 = 1
            goto L5b
        L5a:
            r1 = 0
        L5b:
            com.alibaba.fastjson2.writer.ObjectWriter r6 = r0.getObjectWriter(r2, r2, r1)     // Catch: java.lang.Throwable -> L2e
            r10 = 0
            r11 = 0
            r9 = 0
            r8 = r13
            r6.write(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L73
        L67:
            java.lang.String r13 = r7.toString()     // Catch: java.lang.Throwable -> L73
            r7.close()     // Catch: java.lang.NumberFormatException -> L6f java.lang.NullPointerException -> L71
            return r13
        L6f:
            r0 = move-exception
            goto L7e
        L71:
            r0 = move-exception
            goto L7e
        L73:
            r0 = move-exception
            goto L30
        L75:
            r7.close()     // Catch: java.lang.Throwable -> L79
            goto L7d
        L79:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch: java.lang.NumberFormatException -> L6f java.lang.NullPointerException -> L71
        L7d:
            throw r13     // Catch: java.lang.NumberFormatException -> L6f java.lang.NullPointerException -> L71
        L7e:
            java.lang.String r13 = "JSON#toJSONString cannot serialize '"
            java.lang.String r1 = "'"
            ah.a.n(r13, r8, r1, r0)
            r13 = 0
            return r13
    }

    static java.lang.String toJSONString(java.lang.Object r7, com.alibaba.fastjson2.JSONWriter.Context r8) {
            com.alibaba.fastjson2.JSONWriter r1 = com.alibaba.fastjson2.JSONWriter.of(r8)     // Catch: java.lang.NumberFormatException -> L44 java.lang.NullPointerException -> L47
            if (r7 != 0) goto Lf
            r1.writeNull()     // Catch: java.lang.Throwable -> Lb
            r2 = r7
            goto L25
        Lb:
            r0 = move-exception
            r8 = r0
            r2 = r7
            goto L38
        Lf:
            r1.rootObject = r7     // Catch: java.lang.Throwable -> L35
            com.alibaba.fastjson2.JSONWriter$Path r8 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L35
            r1.path = r8     // Catch: java.lang.Throwable -> L35
            java.lang.Class r8 = r7.getClass()     // Catch: java.lang.Throwable -> L35
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r1.getObjectWriter(r8, r8)     // Catch: java.lang.Throwable -> L35
            r4 = 0
            r5 = 0
            r3 = 0
            r2 = r7
            r0.write(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L32
        L25:
            java.lang.String r7 = r1.toString()     // Catch: java.lang.Throwable -> L32
            r1.close()     // Catch: java.lang.NumberFormatException -> L2d java.lang.NullPointerException -> L30
            return r7
        L2d:
            r0 = move-exception
        L2e:
            r7 = r0
            goto L49
        L30:
            r0 = move-exception
            goto L2e
        L32:
            r0 = move-exception
        L33:
            r8 = r0
            goto L38
        L35:
            r0 = move-exception
            r2 = r7
            goto L33
        L38:
            if (r1 == 0) goto L43
            r1.close()     // Catch: java.lang.Throwable -> L3e
            goto L43
        L3e:
            r0 = move-exception
            r7 = r0
            r8.addSuppressed(r7)     // Catch: java.lang.NumberFormatException -> L2d java.lang.NullPointerException -> L30
        L43:
            throw r8     // Catch: java.lang.NumberFormatException -> L2d java.lang.NullPointerException -> L30
        L44:
            r0 = move-exception
        L45:
            r2 = r7
            goto L2e
        L47:
            r0 = move-exception
            goto L45
        L49:
            java.lang.String r8 = "JSON#toJSONString cannot serialize '"
            java.lang.String r0 = "'"
            ah.a.n(r8, r2, r0, r7)
            r7 = 0
            return r7
    }

    static java.lang.String toJSONString(java.lang.Object r9, com.alibaba.fastjson2.filter.Filter r10, com.alibaba.fastjson2.JSONWriter.Feature... r11) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r2 = 0
            r1.<init>(r0, r2, r10, r11)
            long r10 = r1.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r2 = r2.mask
            long r10 = r10 & r2
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 == 0) goto L17
            r10 = 1
            goto L18
        L17:
            r10 = 0
        L18:
            com.alibaba.fastjson2.JSONWriter r3 = com.alibaba.fastjson2.JSONWriter.of(r1)
            if (r9 != 0) goto L25
            r3.writeNull()     // Catch: java.lang.Throwable -> L22
            goto L3b
        L22:
            r0 = move-exception
            r9 = r0
            goto L43
        L25:
            r3.rootObject = r9     // Catch: java.lang.Throwable -> L22
            com.alibaba.fastjson2.JSONWriter$Path r11 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L22
            r3.path = r11     // Catch: java.lang.Throwable -> L22
            java.lang.Class r11 = r9.getClass()     // Catch: java.lang.Throwable -> L22
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r11, r11, r10)     // Catch: java.lang.Throwable -> L22
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r9
            r2.write(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L22
        L3b:
            java.lang.String r9 = r3.toString()     // Catch: java.lang.Throwable -> L22
            r3.close()
            return r9
        L43:
            if (r3 == 0) goto L4e
            r3.close()     // Catch: java.lang.Throwable -> L49
            goto L4e
        L49:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L4e:
            throw r9
    }

    static java.lang.String toJSONString(java.lang.Object r9, java.lang.String r10, com.alibaba.fastjson2.JSONWriter.Feature... r11) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0, r11)
            if (r10 == 0) goto L12
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L12
            r1.setDateFormat(r10)
        L12:
            long r10 = r1.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r2 = r2.mask
            long r10 = r10 & r2
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 == 0) goto L21
            r10 = 1
            goto L22
        L21:
            r10 = 0
        L22:
            com.alibaba.fastjson2.JSONWriter r3 = com.alibaba.fastjson2.JSONWriter.of(r1)
            if (r9 != 0) goto L2f
            r3.writeNull()     // Catch: java.lang.Throwable -> L2c
            goto L45
        L2c:
            r0 = move-exception
            r9 = r0
            goto L4d
        L2f:
            r3.rootObject = r9     // Catch: java.lang.Throwable -> L2c
            com.alibaba.fastjson2.JSONWriter$Path r11 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L2c
            r3.path = r11     // Catch: java.lang.Throwable -> L2c
            java.lang.Class r11 = r9.getClass()     // Catch: java.lang.Throwable -> L2c
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r11, r11, r10)     // Catch: java.lang.Throwable -> L2c
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r9
            r2.write(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2c
        L45:
            java.lang.String r9 = r3.toString()     // Catch: java.lang.Throwable -> L2c
            r3.close()
            return r9
        L4d:
            if (r3 == 0) goto L58
            r3.close()     // Catch: java.lang.Throwable -> L53
            goto L58
        L53:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L58:
            throw r9
    }

    static java.lang.String toJSONString(java.lang.Object r9, java.lang.String r10, com.alibaba.fastjson2.filter.Filter[] r11, com.alibaba.fastjson2.JSONWriter.Feature... r12) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0, r12)
            r1.configFilter(r11)
            if (r10 == 0) goto L15
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L15
            r1.setDateFormat(r10)
        L15:
            long r10 = r1.features
            com.alibaba.fastjson2.JSONWriter$Feature r12 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r2 = r12.mask
            long r10 = r10 & r2
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 == 0) goto L24
            r10 = 1
            goto L25
        L24:
            r10 = 0
        L25:
            com.alibaba.fastjson2.JSONWriter r3 = com.alibaba.fastjson2.JSONWriter.of(r1)
            if (r9 != 0) goto L32
            r3.writeNull()     // Catch: java.lang.Throwable -> L2f
            goto L48
        L2f:
            r0 = move-exception
            r9 = r0
            goto L50
        L32:
            r3.rootObject = r9     // Catch: java.lang.Throwable -> L2f
            com.alibaba.fastjson2.JSONWriter$Path r11 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L2f
            r3.path = r11     // Catch: java.lang.Throwable -> L2f
            java.lang.Class r11 = r9.getClass()     // Catch: java.lang.Throwable -> L2f
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r11, r11, r10)     // Catch: java.lang.Throwable -> L2f
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r9
            r2.write(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2f
        L48:
            java.lang.String r9 = r3.toString()     // Catch: java.lang.Throwable -> L2f
            r3.close()
            return r9
        L50:
            if (r3 == 0) goto L5b
            r3.close()     // Catch: java.lang.Throwable -> L56
            goto L5b
        L56:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L5b:
            throw r9
    }

    static java.lang.String toJSONString(java.lang.Object r9, com.alibaba.fastjson2.JSONWriter.Feature... r10) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0, r10)
            long r2 = r1.features
            com.alibaba.fastjson2.JSONWriter$Feature r10 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r4 = r10.mask
            long r2 = r2 & r4
            r4 = 0
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 == 0) goto L16
            r10 = 1
            goto L17
        L16:
            r10 = 0
        L17:
            com.alibaba.fastjson2.JSONWriter r3 = com.alibaba.fastjson2.JSONWriter.of(r1)
            if (r9 != 0) goto L24
            r3.writeNull()     // Catch: java.lang.Throwable -> L21
            goto L3a
        L21:
            r0 = move-exception
            r9 = r0
            goto L42
        L24:
            r3.rootObject = r9     // Catch: java.lang.Throwable -> L21
            com.alibaba.fastjson2.JSONWriter$Path r1 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L21
            r3.path = r1     // Catch: java.lang.Throwable -> L21
            java.lang.Class r1 = r9.getClass()     // Catch: java.lang.Throwable -> L21
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r1, r1, r10)     // Catch: java.lang.Throwable -> L21
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r9
            r2.write(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L21
        L3a:
            java.lang.String r9 = r3.toString()     // Catch: java.lang.Throwable -> L21
            r3.close()
            return r9
        L42:
            if (r3 == 0) goto L4d
            r3.close()     // Catch: java.lang.Throwable -> L48
            goto L4d
        L48:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L4d:
            throw r9
    }

    static java.lang.String toJSONString(java.lang.Object r9, com.alibaba.fastjson2.filter.Filter[] r10, com.alibaba.fastjson2.JSONWriter.Feature... r11) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0, r11)
            r1.configFilter(r10)
            long r10 = r1.features
            com.alibaba.fastjson2.JSONWriter$Feature r2 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r2 = r2.mask
            long r10 = r10 & r2
            r2 = 0
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 == 0) goto L19
            r10 = 1
            goto L1a
        L19:
            r10 = 0
        L1a:
            com.alibaba.fastjson2.JSONWriter r3 = com.alibaba.fastjson2.JSONWriter.of(r1)
            if (r9 != 0) goto L27
            r3.writeNull()     // Catch: java.lang.Throwable -> L24
            goto L3d
        L24:
            r0 = move-exception
            r9 = r0
            goto L45
        L27:
            r3.rootObject = r9     // Catch: java.lang.Throwable -> L24
            com.alibaba.fastjson2.JSONWriter$Path r11 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L24
            r3.path = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Class r11 = r9.getClass()     // Catch: java.lang.Throwable -> L24
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r11, r11, r10)     // Catch: java.lang.Throwable -> L24
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r9
            r2.write(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L24
        L3d:
            java.lang.String r9 = r3.toString()     // Catch: java.lang.Throwable -> L24
            r3.close()
            return r9
        L45:
            if (r3 == 0) goto L50
            r3.close()     // Catch: java.lang.Throwable -> L4b
            goto L50
        L4b:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)
        L50:
            throw r9
    }

    static <T> T toJavaObject(java.lang.Object r0, java.lang.Class<T> r1) {
            java.lang.Object r0 = to(r1, r0)
            return r0
    }

    static int writeTo(java.io.OutputStream r10, java.lang.Object r11) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0)
            long r2 = r1.features
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r4 = r4.mask
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            com.alibaba.fastjson2.JSONWriter r4 = com.alibaba.fastjson2.JSONWriter.ofUTF8(r1)     // Catch: java.lang.Exception -> L4e
            if (r11 != 0) goto L24
            r4.writeNull()     // Catch: java.lang.Throwable -> L21
            goto L3a
        L21:
            r0 = move-exception
            r10 = r0
            goto L42
        L24:
            r4.rootObject = r11     // Catch: java.lang.Throwable -> L21
            com.alibaba.fastjson2.JSONWriter$Path r1 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L21
            r4.path = r1     // Catch: java.lang.Throwable -> L21
            java.lang.Class r1 = r11.getClass()     // Catch: java.lang.Throwable -> L21
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r0.getObjectWriter(r1, r1, r2)     // Catch: java.lang.Throwable -> L21
            r7 = 0
            r8 = 0
            r6 = 0
            r5 = r11
            r3.write(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L21
        L3a:
            int r10 = r4.flushTo(r10)     // Catch: java.lang.Throwable -> L21
            r4.close()     // Catch: java.lang.Exception -> L4e
            return r10
        L42:
            if (r4 == 0) goto L4d
            r4.close()     // Catch: java.lang.Throwable -> L48
            goto L4d
        L48:
            r0 = move-exception
            r11 = r0
            r10.addSuppressed(r11)     // Catch: java.lang.Exception -> L4e
        L4d:
            throw r10     // Catch: java.lang.Exception -> L4e
        L4e:
            r0 = move-exception
            r10 = r0
            java.lang.String r11 = r10.getMessage()
            ah.a.x(r11, r10)
            r10 = 0
            return r10
    }

    static int writeTo(java.io.OutputStream r7, java.lang.Object r8, com.alibaba.fastjson2.JSONWriter.Context r9) {
            com.alibaba.fastjson2.JSONWriter r1 = com.alibaba.fastjson2.JSONWriter.ofUTF8(r9)     // Catch: java.lang.Exception -> L37
            if (r8 != 0) goto Ld
            r1.writeNull()     // Catch: java.lang.Throwable -> La
            goto L23
        La:
            r0 = move-exception
            r7 = r0
            goto L2b
        Ld:
            r1.rootObject = r8     // Catch: java.lang.Throwable -> La
            com.alibaba.fastjson2.JSONWriter$Path r0 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> La
            r1.path = r0     // Catch: java.lang.Throwable -> La
            java.lang.Class r0 = r8.getClass()     // Catch: java.lang.Throwable -> La
            com.alibaba.fastjson2.writer.ObjectWriter r0 = r9.getObjectWriter(r0, r0)     // Catch: java.lang.Throwable -> La
            r4 = 0
            r5 = 0
            r3 = 0
            r2 = r8
            r0.write(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> La
        L23:
            int r7 = r1.flushTo(r7)     // Catch: java.lang.Throwable -> La
            r1.close()     // Catch: java.lang.Exception -> L37
            return r7
        L2b:
            if (r1 == 0) goto L36
            r1.close()     // Catch: java.lang.Throwable -> L31
            goto L36
        L31:
            r0 = move-exception
            r8 = r0
            r7.addSuppressed(r8)     // Catch: java.lang.Exception -> L37
        L36:
            throw r7     // Catch: java.lang.Exception -> L37
        L37:
            r0 = move-exception
            r7 = r0
            java.lang.String r8 = r7.getMessage()
            ah.a.x(r8, r7)
            r7 = 0
            return r7
    }

    static int writeTo(java.io.OutputStream r9, java.lang.Object r10, java.lang.String r11, com.alibaba.fastjson2.filter.Filter[] r12, com.alibaba.fastjson2.JSONWriter.Feature... r13) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0, r13)
            r1.configFilter(r12)
            long r2 = r1.features
            com.alibaba.fastjson2.JSONWriter$Feature r13 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r4 = r13.mask
            long r2 = r2 & r4
            r4 = 0
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 == 0) goto L19
            r13 = 1
            goto L1a
        L19:
            r13 = 0
        L1a:
            com.alibaba.fastjson2.JSONWriter r3 = com.alibaba.fastjson2.JSONWriter.ofUTF8(r1)     // Catch: java.lang.Exception -> L73
            if (r10 != 0) goto L29
            r3.writeNull()     // Catch: java.lang.Throwable -> L25
            r4 = r10
            goto L56
        L25:
            r0 = move-exception
            r9 = r0
            r4 = r10
            goto L67
        L29:
            r3.rootObject = r10     // Catch: java.lang.Throwable -> L64
            com.alibaba.fastjson2.JSONWriter$Path r1 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L64
            r3.path = r1     // Catch: java.lang.Throwable -> L64
            if (r11 == 0) goto L3c
            boolean r1 = r11.isEmpty()     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L3c
            com.alibaba.fastjson2.JSONWriter$Context r1 = r3.context     // Catch: java.lang.Throwable -> L25
            r1.setDateFormat(r11)     // Catch: java.lang.Throwable -> L25
        L3c:
            if (r12 == 0) goto L46
            int r11 = r12.length     // Catch: java.lang.Throwable -> L25
            if (r11 == 0) goto L46
            com.alibaba.fastjson2.JSONWriter$Context r11 = r3.context     // Catch: java.lang.Throwable -> L25
            r11.configFilter(r12)     // Catch: java.lang.Throwable -> L25
        L46:
            java.lang.Class r11 = r10.getClass()     // Catch: java.lang.Throwable -> L64
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r11, r11, r13)     // Catch: java.lang.Throwable -> L64
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r10
            r2.write(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L61
        L56:
            int r9 = r3.flushTo(r9)     // Catch: java.lang.Throwable -> L61
            r3.close()     // Catch: java.lang.Exception -> L5e
            return r9
        L5e:
            r0 = move-exception
        L5f:
            r9 = r0
            goto L76
        L61:
            r0 = move-exception
        L62:
            r9 = r0
            goto L67
        L64:
            r0 = move-exception
            r4 = r10
            goto L62
        L67:
            if (r3 == 0) goto L72
            r3.close()     // Catch: java.lang.Throwable -> L6d
            goto L72
        L6d:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)     // Catch: java.lang.Exception -> L5e
        L72:
            throw r9     // Catch: java.lang.Exception -> L5e
        L73:
            r0 = move-exception
            r4 = r10
            goto L5f
        L76:
            java.lang.String r10 = "JSON#writeTo cannot serialize '"
            java.lang.String r11 = "' to 'OutputStream'"
            ah.a.n(r10, r4, r11, r9)
            r9 = 0
            return r9
    }

    static int writeTo(java.io.OutputStream r9, java.lang.Object r10, com.alibaba.fastjson2.JSONWriter.Feature... r11) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0, r11)
            long r2 = r1.features
            com.alibaba.fastjson2.JSONWriter$Feature r11 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r4 = r11.mask
            long r2 = r2 & r4
            r4 = 0
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 == 0) goto L16
            r11 = 1
            goto L17
        L16:
            r11 = 0
        L17:
            com.alibaba.fastjson2.JSONWriter r3 = com.alibaba.fastjson2.JSONWriter.ofUTF8(r1)     // Catch: java.lang.Exception -> L4e
            if (r10 != 0) goto L24
            r3.writeNull()     // Catch: java.lang.Throwable -> L21
            goto L3a
        L21:
            r0 = move-exception
            r9 = r0
            goto L42
        L24:
            r3.rootObject = r10     // Catch: java.lang.Throwable -> L21
            com.alibaba.fastjson2.JSONWriter$Path r1 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L21
            r3.path = r1     // Catch: java.lang.Throwable -> L21
            java.lang.Class r1 = r10.getClass()     // Catch: java.lang.Throwable -> L21
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r1, r1, r11)     // Catch: java.lang.Throwable -> L21
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r10
            r2.write(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L21
        L3a:
            int r9 = r3.flushTo(r9)     // Catch: java.lang.Throwable -> L21
            r3.close()     // Catch: java.lang.Exception -> L4e
            return r9
        L42:
            if (r3 == 0) goto L4d
            r3.close()     // Catch: java.lang.Throwable -> L48
            goto L4d
        L48:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)     // Catch: java.lang.Exception -> L4e
        L4d:
            throw r9     // Catch: java.lang.Exception -> L4e
        L4e:
            r0 = move-exception
            r9 = r0
            java.lang.String r10 = r9.getMessage()
            ah.a.x(r10, r9)
            r9 = 0
            return r9
    }

    static int writeTo(java.io.OutputStream r9, java.lang.Object r10, com.alibaba.fastjson2.filter.Filter[] r11, com.alibaba.fastjson2.JSONWriter.Feature... r12) {
            com.alibaba.fastjson2.writer.ObjectWriterProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.JSONWriter$Context r1 = new com.alibaba.fastjson2.JSONWriter$Context
            r1.<init>(r0, r12)
            r1.configFilter(r11)
            long r2 = r1.features
            com.alibaba.fastjson2.JSONWriter$Feature r12 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r4 = r12.mask
            long r2 = r2 & r4
            r4 = 0
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 == 0) goto L19
            r12 = 1
            goto L1a
        L19:
            r12 = 0
        L1a:
            com.alibaba.fastjson2.JSONWriter r3 = com.alibaba.fastjson2.JSONWriter.ofUTF8(r1)     // Catch: java.lang.Exception -> L66
            if (r10 != 0) goto L29
            r3.writeNull()     // Catch: java.lang.Throwable -> L25
            r4 = r10
            goto L49
        L25:
            r0 = move-exception
            r9 = r0
            r4 = r10
            goto L5a
        L29:
            r3.rootObject = r10     // Catch: java.lang.Throwable -> L57
            com.alibaba.fastjson2.JSONWriter$Path r1 = com.alibaba.fastjson2.JSONWriter.Path.ROOT     // Catch: java.lang.Throwable -> L57
            r3.path = r1     // Catch: java.lang.Throwable -> L57
            if (r11 == 0) goto L39
            int r1 = r11.length     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L39
            com.alibaba.fastjson2.JSONWriter$Context r1 = r3.context     // Catch: java.lang.Throwable -> L25
            r1.configFilter(r11)     // Catch: java.lang.Throwable -> L25
        L39:
            java.lang.Class r11 = r10.getClass()     // Catch: java.lang.Throwable -> L57
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r0.getObjectWriter(r11, r11, r12)     // Catch: java.lang.Throwable -> L57
            r6 = 0
            r7 = 0
            r5 = 0
            r4 = r10
            r2.write(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L54
        L49:
            int r9 = r3.flushTo(r9)     // Catch: java.lang.Throwable -> L54
            r3.close()     // Catch: java.lang.Exception -> L51
            return r9
        L51:
            r0 = move-exception
        L52:
            r9 = r0
            goto L69
        L54:
            r0 = move-exception
        L55:
            r9 = r0
            goto L5a
        L57:
            r0 = move-exception
            r4 = r10
            goto L55
        L5a:
            if (r3 == 0) goto L65
            r3.close()     // Catch: java.lang.Throwable -> L60
            goto L65
        L60:
            r0 = move-exception
            r10 = r0
            r9.addSuppressed(r10)     // Catch: java.lang.Exception -> L51
        L65:
            throw r9     // Catch: java.lang.Exception -> L51
        L66:
            r0 = move-exception
            r4 = r10
            goto L52
        L69:
            java.lang.String r10 = "JSON#writeTo cannot serialize '"
            java.lang.String r11 = "' to 'OutputStream'"
            ah.a.n(r10, r4, r11, r9)
            r9 = 0
            return r9
    }
}
