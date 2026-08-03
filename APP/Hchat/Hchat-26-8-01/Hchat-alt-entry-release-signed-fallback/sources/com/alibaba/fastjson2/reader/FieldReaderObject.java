package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class FieldReaderObject<T> extends com.alibaba.fastjson2.reader.FieldReader<T> {
    protected final java.util.function.BiConsumer function;
    protected com.alibaba.fastjson2.reader.ObjectReader initReader;

    public FieldReaderObject(java.lang.String r1, java.lang.reflect.Type r2, java.lang.Class r3, int r4, long r5, java.lang.String r7, java.util.Locale r8, java.lang.Object r9, java.lang.reflect.Method r10, java.lang.reflect.Field r11, java.util.function.BiConsumer r12) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            r1 = r0
            r1.function = r12
            return
    }

    public static /* synthetic */ void a(java.lang.String r0, com.alibaba.fastjson2.PropertyNamingStrategy r1, com.alibaba.fastjson2.reader.ObjectReader r2, java.util.Map r3, java.util.function.BiConsumer r4, java.lang.Object r5) {
            lambda$arrayToMap$0(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void arrayToMap(java.util.Map r6, java.util.Collection r7, java.lang.String r8, com.alibaba.fastjson2.PropertyNamingStrategy r9, com.alibaba.fastjson2.reader.ObjectReader r10, java.util.function.BiConsumer r11) {
            com.alibaba.fastjson2.reader.a r0 = new com.alibaba.fastjson2.reader.a
            r4 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r7.forEach(r0)
            return
    }

    private static /* synthetic */ void lambda$arrayToMap$0(java.lang.String r4, com.alibaba.fastjson2.PropertyNamingStrategy r5, com.alibaba.fastjson2.reader.ObjectReader r6, java.util.Map r7, java.util.function.BiConsumer r8, java.lang.Object r9) {
            boolean r0 = r9 instanceof java.util.Map
            if (r0 == 0) goto Lc
            r1 = r9
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r4 = r1.get(r4)
            goto L1c
        Lc:
            if (r9 == 0) goto L63
            java.lang.Class r1 = r9.getClass()
            r2 = 0
            com.alibaba.fastjson2.writer.ObjectWriter r1 = com.alibaba.fastjson2.JSONFactory.getObjectWriter(r1, r2)
            java.lang.Object r4 = r1.getFieldValue(r9, r4)
        L1c:
            if (r5 == 0) goto L28
            boolean r1 = r4 instanceof java.lang.String
            if (r1 == 0) goto L28
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r5.fieldName(r4)
        L28:
            java.lang.Class r5 = r6.getObjectClass()
            boolean r5 = r5.isInstance(r9)
            r1 = 0
            if (r5 == 0) goto L34
            goto L3e
        L34:
            if (r0 == 0) goto L53
            java.util.Map r9 = (java.util.Map) r9
            com.alibaba.fastjson2.JSONReader$Feature[] r5 = new com.alibaba.fastjson2.JSONReader.Feature[r1]
            java.lang.Object r9 = r6.createInstance(r9, r5)
        L3e:
            java.lang.Object r4 = r7.putIfAbsent(r4, r9)
            r5 = 1
            if (r4 == 0) goto L47
            r6 = r5
            goto L48
        L47:
            r6 = r1
        L48:
            if (r8 == 0) goto L4b
            r1 = r5
        L4b:
            r5 = r6 & r1
            if (r5 == 0) goto L52
            r8.accept(r4, r9)
        L52:
            return
        L53:
            com.alibaba.fastjson2.JSONWriter$Feature r4 = com.alibaba.fastjson2.JSONWriter.Feature.ReferenceDetection
            com.alibaba.fastjson2.JSONWriter$Feature[] r4 = new com.alibaba.fastjson2.JSONWriter.Feature[]{r4}
            java.lang.String r4 = com.alibaba.fastjson2.JSON.toJSONString(r9, r4)
            java.lang.String r5 = "can not accept "
            ah.a.i(r4, r5)
            return
        L63:
            java.lang.String r5 = "key not found "
            java.lang.String r4 = wb.en.g(r5, r4)
            ah.a.w(r4)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, byte r2) {
            r0 = this;
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, char r2) {
            r0 = this;
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, double r2) {
            r0 = this;
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, float r2) {
            r0 = this;
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, int r2) {
            r0 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, long r2) {
            r0 = this;
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r5, java.lang.Object r6) {
            r4 = this;
            if (r6 != 0) goto L10
            long r0 = r4.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreSetNullValue
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L10
            return
        L10:
            java.lang.Class r0 = r4.fieldClass
            java.lang.Class r1 = java.lang.Character.TYPE
            if (r0 != r1) goto L30
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L30
            java.lang.String r6 = (java.lang.String) r6
            int r0 = r6.length()
            r1 = 0
            if (r0 <= 0) goto L2c
            char r6 = r6.charAt(r1)
            java.lang.Character r6 = java.lang.Character.valueOf(r6)
            goto L30
        L2c:
            java.lang.Character r6 = java.lang.Character.valueOf(r1)
        L30:
            if (r6 == 0) goto L40
            java.lang.Class r0 = r4.fieldClass
            boolean r0 = r0.isInstance(r6)
            if (r0 != 0) goto L40
            java.lang.reflect.Type r0 = r4.fieldType
            java.lang.Object r6 = com.alibaba.fastjson2.util.TypeUtils.cast(r6, r0)
        L40:
            java.util.function.BiConsumer r0 = r4.function     // Catch: java.lang.Exception -> L48
            if (r0 == 0) goto L4a
            r0.accept(r5, r6)     // Catch: java.lang.Exception -> L48
            return
        L48:
            r5 = move-exception
            goto L5c
        L4a:
            java.lang.reflect.Method r0 = r4.method     // Catch: java.lang.Exception -> L48
            if (r0 == 0) goto L56
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Exception -> L48
            r0.invoke(r5, r6)     // Catch: java.lang.Exception -> L48
            return
        L56:
            java.lang.reflect.Field r0 = r4.field     // Catch: java.lang.Exception -> L48
            r0.set(r5, r6)     // Catch: java.lang.Exception -> L48
            return
        L5c:
            com.alibaba.fastjson2.JSONException r6 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "set "
            r0.<init>(r1)
            java.util.function.BiConsumer r1 = r4.function
            if (r1 == 0) goto L6e
            java.lang.String r1 = super.toString()
            goto L70
        L6e:
            java.lang.String r1 = r4.fieldName
        L70:
            java.lang.String r2 = " error"
            java.lang.String r0 = eh.a.r(r0, r1, r2)
            r6.<init>(r0, r5)
            throw r6
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, short r2) {
            r0 = this;
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T r1, boolean r2) {
            r0 = this;
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.accept(r1, r2)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public com.alibaba.fastjson2.reader.ObjectReader getInitReader() {
            r1 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r1.initReader
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public com.alibaba.fastjson2.reader.ObjectReader getObjectReader(com.alibaba.fastjson2.JSONReader.Context r5) {
            r4 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r4.reader
            if (r0 == 0) goto L7
            com.alibaba.fastjson2.reader.ObjectReader r5 = r4.reader
            return r5
        L7:
            java.lang.reflect.Type r0 = r4.fieldType
            java.lang.Class r1 = r4.fieldClass
            java.lang.String r2 = r4.format
            java.util.Locale r3 = r4.locale
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.FieldReader.createFormattedObjectReader(r0, r1, r2, r3)
            if (r0 == 0) goto L18
            r4.reader = r0
            return r0
        L18:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            java.lang.Class r1 = r4.fieldClass
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L2f
            java.lang.reflect.Type r5 = r4.fieldType
            java.lang.Class r0 = r4.fieldClass
            long r1 = r4.features
            com.alibaba.fastjson2.reader.ObjectReader r5 = com.alibaba.fastjson2.reader.ObjectReaderImplMap.of(r5, r0, r1)
            r4.reader = r5
            return r5
        L2f:
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            java.lang.Class r1 = r4.fieldClass
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L46
            java.lang.reflect.Type r5 = r4.fieldType
            java.lang.Class r0 = r4.fieldClass
            long r1 = r4.features
            com.alibaba.fastjson2.reader.ObjectReader r5 = com.alibaba.fastjson2.reader.ObjectReaderImplList.of(r5, r0, r1)
            r4.reader = r5
            return r5
        L46:
            long r0 = r5.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L55
            r0 = 1
            goto L56
        L55:
            r0 = 0
        L56:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r5 = r5.provider
            java.lang.reflect.Type r1 = r4.fieldType
            com.alibaba.fastjson2.reader.ObjectReader r5 = r5.getObjectReader(r1, r0)
            r4.reader = r5
            return r5
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public com.alibaba.fastjson2.reader.ObjectReader getObjectReader(com.alibaba.fastjson2.JSONReader r5) {
            r4 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r4.initReader
            if (r0 == 0) goto L5
            return r0
        L5:
            com.alibaba.fastjson2.reader.ObjectReader r0 = r4.reader
            if (r0 == 0) goto Lc
            com.alibaba.fastjson2.reader.ObjectReader r5 = r4.reader
            return r5
        Lc:
            java.lang.reflect.Type r0 = r4.fieldType
            java.lang.Class r1 = r4.fieldClass
            java.lang.String r2 = r4.format
            java.util.Locale r3 = r4.locale
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.FieldReader.createFormattedObjectReader(r0, r1, r2, r3)
            if (r0 == 0) goto L1d
            r4.reader = r0
            return r0
        L1d:
            java.lang.Class r0 = r4.fieldClass
            if (r0 == 0) goto L36
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L36
            java.lang.reflect.Type r5 = r4.fieldType
            java.lang.Class r0 = r4.fieldClass
            long r1 = r4.features
            com.alibaba.fastjson2.reader.ObjectReader r5 = com.alibaba.fastjson2.reader.ObjectReaderImplMap.of(r5, r0, r1)
            r4.reader = r5
            return r5
        L36:
            java.lang.Class r0 = r4.fieldClass
            if (r0 == 0) goto L4f
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L4f
            java.lang.reflect.Type r5 = r4.fieldType
            java.lang.Class r0 = r4.fieldClass
            long r1 = r4.features
            com.alibaba.fastjson2.reader.ObjectReader r5 = com.alibaba.fastjson2.reader.ObjectReaderImplList.of(r5, r0, r1)
            r4.reader = r5
            return r5
        L4f:
            com.alibaba.fastjson2.JSONReader$Context r5 = r5.context
            long r0 = r5.features
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L60
            r0 = 1
            goto L61
        L60:
            r0 = 0
        L61:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r5 = r5.provider
            java.lang.reflect.Type r1 = r4.fieldType
            com.alibaba.fastjson2.reader.ObjectReader r5 = r5.getObjectReader(r1, r0)
            r4.reader = r5
            return r5
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void processExtra(com.alibaba.fastjson2.JSONReader r5, java.lang.Object r6) {
            r4 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r4.initReader
            if (r0 != 0) goto La
            com.alibaba.fastjson2.reader.ObjectReader r0 = r4.getObjectReader(r5)
            r4.initReader = r0
        La:
            com.alibaba.fastjson2.reader.ObjectReader r0 = r4.initReader
            boolean r0 = r0 instanceof com.alibaba.fastjson2.reader.ObjectReaderBean
            if (r0 == 0) goto L40
            java.lang.reflect.Field r0 = r4.field
            if (r0 == 0) goto L40
            java.lang.String r0 = r5.getFieldName()
            com.alibaba.fastjson2.reader.ObjectReader r1 = r4.initReader
            com.alibaba.fastjson2.reader.FieldReader r0 = r1.getFieldReader(r0)
            if (r0 == 0) goto L40
            java.lang.reflect.Field r1 = r4.field     // Catch: java.lang.Exception -> L34
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Exception -> L34
            if (r1 != 0) goto L36
            com.alibaba.fastjson2.reader.ObjectReader r1 = r4.initReader     // Catch: java.lang.Exception -> L34
            long r2 = r4.features     // Catch: java.lang.Exception -> L34
            java.lang.Object r1 = r1.createInstance(r2)     // Catch: java.lang.Exception -> L34
            r4.accept(r6, r1)     // Catch: java.lang.Exception -> L34
            goto L36
        L34:
            r5 = move-exception
            goto L3a
        L36:
            r0.readFieldValue(r5, r1)     // Catch: java.lang.Exception -> L34
            return
        L3a:
            java.lang.String r6 = "read unwrapped field error"
            ah.a.x(r6, r5)
            return
        L40:
            r5.skipValue()
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public java.lang.Object readFieldValue(com.alibaba.fastjson2.JSONReader r8) {
            r7 = this;
            com.alibaba.fastjson2.reader.ObjectReader r0 = r7.initReader
            if (r0 != 0) goto La
            com.alibaba.fastjson2.reader.ObjectReader r0 = r7.getObjectReader(r8)
            r7.initReader = r0
        La:
            boolean r0 = r8.jsonb
            com.alibaba.fastjson2.reader.ObjectReader r1 = r7.initReader
            if (r0 == 0) goto L1c
            java.lang.reflect.Type r3 = r7.fieldType
            java.lang.String r4 = r7.fieldName
            long r5 = r7.features
            r2 = r8
            java.lang.Object r8 = r1.readJSONBObject(r2, r3, r4, r5)
            goto L27
        L1c:
            r2 = r8
            java.lang.reflect.Type r3 = r7.fieldType
            java.lang.String r4 = r7.fieldName
            long r5 = r7.features
            java.lang.Object r8 = r1.readObject(r2, r3, r4, r5)
        L27:
            com.alibaba.fastjson2.reader.ObjectReader r0 = r7.initReader
            java.util.function.Function r0 = r0.getBuildFunction()
            if (r0 == 0) goto L33
            java.lang.Object r8 = r0.apply(r8)
        L33:
            return r8
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(com.alibaba.fastjson2.JSONReader r10, T r11) {
            r9 = this;
            boolean r1 = r9.fieldClassSerializable
            if (r1 != 0) goto L27
            com.alibaba.fastjson2.JSONReader$Context r1 = r10.context
            long r3 = r1.features
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreNoneSerializable
            long r5 = r1.mask
            long r5 = r5 & r3
            r7 = 0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L17
            r10.skipValue()
            return
        L17:
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNoneSerializable
            long r5 = r1.mask
            long r3 = r3 & r5
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 != 0) goto L21
            goto L27
        L21:
            java.lang.String r0 = "not support none-Serializable"
            ah.a.w(r0)
            return
        L27:
            com.alibaba.fastjson2.reader.ObjectReader r1 = r9.initReader
            if (r1 == 0) goto L2c
            goto L47
        L2c:
            java.lang.reflect.Type r1 = r9.fieldType
            java.lang.Class r3 = r9.fieldClass
            java.lang.String r4 = r9.format
            java.util.Locale r5 = r9.locale
            com.alibaba.fastjson2.reader.ObjectReader r1 = com.alibaba.fastjson2.reader.FieldReader.createFormattedObjectReader(r1, r3, r4, r5)
            if (r1 == 0) goto L3d
            r9.initReader = r1
            goto L47
        L3d:
            com.alibaba.fastjson2.JSONReader$Context r1 = r10.context
            java.lang.reflect.Type r3 = r9.fieldType
            com.alibaba.fastjson2.reader.ObjectReader r1 = r1.getObjectReader(r3)
            r9.initReader = r1
        L47:
            boolean r3 = r10.isReference()
            if (r3 == 0) goto L61
            java.lang.String r1 = r10.readReference()
            java.lang.String r3 = ".."
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L5d
            r9.accept(r11, r11)
            return
        L5d:
            r9.addResolveTask(r10, r11, r1)
            return
        L61:
            char r3 = r10.current()     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            boolean r4 = r10.nextIfNullOrEmptyString()     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            if (r4 == 0) goto La7
            java.lang.Object r1 = r9.defaultValue     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            if (r1 == 0) goto L71
            goto Le7
        L71:
            java.lang.Class r1 = r9.fieldClass     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            java.lang.Class<java.util.OptionalInt> r4 = java.util.OptionalInt.class
            if (r1 != r4) goto L83
            java.util.OptionalInt r1 = java.util.OptionalInt.empty()     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            goto Le7
        L7d:
            r0 = move-exception
            goto Lf2
        L80:
            r0 = move-exception
            goto Lf2
        L83:
            java.lang.Class<java.util.OptionalLong> r4 = java.util.OptionalLong.class
            if (r1 != r4) goto L8c
            java.util.OptionalLong r1 = java.util.OptionalLong.empty()     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            goto Le7
        L8c:
            java.lang.Class<java.util.OptionalDouble> r4 = java.util.OptionalDouble.class
            if (r1 != r4) goto L95
            java.util.OptionalDouble r1 = java.util.OptionalDouble.empty()     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            goto Le7
        L95:
            java.lang.Class<java.util.Optional> r4 = java.util.Optional.class
            if (r1 != r4) goto L9e
            java.util.Optional r1 = java.util.Optional.empty()     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            goto Le7
        L9e:
            r1 = 110(0x6e, float:1.54E-43)
            if (r3 != r1) goto La4
            r1 = 0
            goto Le7
        La4:
            java.lang.String r1 = ""
            goto Le7
        La7:
            boolean r3 = r10.jsonb     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            if (r3 == 0) goto Ldc
            java.lang.Class r3 = r9.fieldClass     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            if (r3 != r4) goto Ld0
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            long r5 = r9.features     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            r3 = 0
            r1 = r10
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.checkAutoType(r2, r3, r5)     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            if (r2 == 0) goto Lcb
            java.lang.reflect.Type r3 = r9.fieldType     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            java.lang.String r4 = r9.fieldName     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            long r5 = r9.features     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            r1 = r2
            r2 = r10
            java.lang.Object r1 = r1.readJSONBObject(r2, r3, r4, r5)     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            goto Le7
        Lcb:
            java.lang.Object r1 = r10.readAny()     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            goto Le7
        Ld0:
            java.lang.reflect.Type r3 = r9.fieldType     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            java.lang.String r4 = r9.fieldName     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            long r5 = r9.features     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            r2 = r10
            java.lang.Object r1 = r1.readJSONBObject(r2, r3, r4, r5)     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            goto Le7
        Ldc:
            java.lang.reflect.Type r3 = r9.fieldType     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            java.lang.String r4 = r9.fieldName     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            long r5 = r9.features     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            r2 = r10
            java.lang.Object r1 = r1.readObject(r2, r3, r4, r5)     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
        Le7:
            r9.accept(r11, r1)     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            boolean r3 = r9.noneStaticMemberClass     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
            if (r3 == 0) goto Lf1
            com.alibaba.fastjson2.util.BeanUtils.setNoneStaticMemberClassParent(r1, r11)     // Catch: java.lang.IllegalAccessError -> L7d java.lang.Exception -> L80
        Lf1:
            return
        Lf2:
            java.lang.reflect.Field r1 = r9.field
            if (r1 == 0) goto Lf7
            goto Lf9
        Lf7:
            java.lang.reflect.Method r1 = r9.method
        Lf9:
            if (r1 == 0) goto L11e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "read field '"
            r3.<init>(r4)
            java.lang.Class r4 = r1.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = "."
            r3.append(r4)
            java.lang.String r1 = r1.getName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            goto L12d
        L11e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "read field "
            r1.<init>(r3)
            java.lang.String r3 = r9.fieldName
            java.lang.String r4 = " error"
            java.lang.String r1 = eh.a.r(r1, r3, r4)
        L12d:
            java.lang.String r1 = r10.info(r1)
            ah.a.x(r1, r0)
            return
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValueJSONB(com.alibaba.fastjson2.JSONReader r10, T r11) {
            r9 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r10.context
            long r1 = r0.features
            boolean r3 = r9.fieldClassSerializable
            r4 = 0
            if (r3 != 0) goto L41
            byte r3 = r10.getType()
            r6 = -110(0xffffffffffffff92, float:NaN)
            if (r3 == r6) goto L41
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreNoneSerializable
            long r7 = r3.mask
            long r7 = r7 & r1
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 == 0) goto L1f
            r10.skipValue()
            return
        L1f:
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNoneSerializable
            long r7 = r3.mask
            long r7 = r7 & r1
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 == 0) goto L41
            java.lang.Class r3 = r9.fieldClass
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            if (r3 != r7) goto L3b
            boolean r3 = r10.isObject()
            if (r3 != 0) goto L3b
            byte r3 = r10.getType()
            if (r3 == r6) goto L3b
            goto L41
        L3b:
            java.lang.String r10 = "not support none-Serializable"
            ah.a.w(r10)
            return
        L41:
            com.alibaba.fastjson2.reader.ObjectReader r3 = r9.initReader
            if (r3 != 0) goto L5b
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r6 = r3.mask
            long r1 = r1 & r6
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L50
            r1 = 1
            goto L51
        L50:
            r1 = 0
        L51:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = r0.provider
            java.lang.reflect.Type r2 = r9.fieldType
            com.alibaba.fastjson2.reader.ObjectReader r0 = r0.getObjectReader(r2, r1)
            r9.initReader = r0
        L5b:
            boolean r0 = r10.isReference()
            if (r0 == 0) goto L75
            java.lang.String r0 = r10.readReference()
            java.lang.String r1 = ".."
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L71
            r9.accept(r11, r11)
            return
        L71:
            r9.addResolveTask(r10, r11, r0)
            return
        L75:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r9.initReader
            java.lang.reflect.Type r4 = r9.fieldType
            java.lang.String r5 = r9.fieldName
            long r6 = r9.features
            r3 = r10
            java.lang.Object r10 = r2.readJSONBObject(r3, r4, r5, r6)
            r9.accept(r11, r10)
            return
    }
}
