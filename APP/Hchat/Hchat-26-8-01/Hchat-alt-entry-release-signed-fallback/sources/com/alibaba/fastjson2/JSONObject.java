package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class JSONObject extends java.util.LinkedHashMap<java.lang.String, java.lang.Object> implements java.lang.reflect.InvocationHandler {
    static com.alibaba.fastjson2.reader.ObjectReader<com.alibaba.fastjson2.JSONArray> arrayReader = null;
    private static final long serialVersionUID = 1;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class NameConsumer implements java.util.function.Consumer<java.lang.reflect.Method> {
        final java.lang.annotation.Annotation annotation;
        java.lang.String name;

        public NameConsumer(java.lang.annotation.Annotation r1) {
                r0 = this;
                r0.<init>()
                r0.annotation = r1
                return
        }

        @Override // java.util.function.Consumer
        public /* bridge */ /* synthetic */ void accept(java.lang.reflect.Method r1) {
                r0 = this;
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                r0.accept2(r1)
                return
        }

        /* JADX INFO: renamed from: accept, reason: avoid collision after fix types in other method */
        public void accept2(java.lang.reflect.Method r3) {
                r2 = this;
                java.lang.String r0 = r3.getName()
                java.lang.String r1 = "name"
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L1d
                java.lang.annotation.Annotation r0 = r2.annotation     // Catch: java.lang.Throwable -> L1d
                r1 = 0
                java.lang.Object r3 = r3.invoke(r0, r1)     // Catch: java.lang.Throwable -> L1d
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1d
                boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> L1d
                if (r0 != 0) goto L1d
                r2.name = r3     // Catch: java.lang.Throwable -> L1d
            L1d:
                return
        }
    }

    public JSONObject() {
            r0 = this;
            r0.<init>()
            return
    }

    public JSONObject(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public JSONObject(int r1, float r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public JSONObject(int r1, float r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public JSONObject(java.util.Map r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static /* synthetic */ boolean a(int r0) {
            boolean r0 = lambda$of$3(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object c(int r0, java.lang.Object[] r1) {
            java.lang.Object r0 = lambda$of$4(r1, r0)
            return r0
    }

    public static /* synthetic */ boolean d(int r0) {
            boolean r0 = lambda$of$0(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object e(int r0, java.lang.Object[] r1) {
            java.lang.Object r0 = lambda$of$1(r1, r0)
            return r0
    }

    public static /* synthetic */ void f(java.lang.Object r0) {
            lambda$of$2(r0)
            return
    }

    public static com.alibaba.fastjson2.JSONObject from(java.lang.Object r0) {
            java.lang.Object r0 = com.alibaba.fastjson2.JSON.toJSON(r0)
            com.alibaba.fastjson2.JSONObject r0 = (com.alibaba.fastjson2.JSONObject) r0
            return r0
    }

    public static com.alibaba.fastjson2.JSONObject from(java.lang.Object r0, com.alibaba.fastjson2.JSONWriter.Feature... r1) {
            java.lang.Object r0 = com.alibaba.fastjson2.JSON.toJSON(r0, r1)
            com.alibaba.fastjson2.JSONObject r0 = (com.alibaba.fastjson2.JSONObject) r0
            return r0
    }

    private java.lang.String getJSONFieldName(java.lang.reflect.Method r9) {
            r8 = this;
            java.lang.annotation.Annotation[] r9 = r9.getAnnotations()
            int r0 = r9.length
            r1 = 0
            r2 = 0
            r3 = r1
        L8:
            if (r2 >= r0) goto L42
            r4 = r9[r2]
            java.lang.Class r5 = r4.annotationType()
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONField> r6 = com.alibaba.fastjson2.annotation.JSONField.class
            java.lang.annotation.Annotation r6 = com.alibaba.fastjson2.util.BeanUtils.findAnnotation(r4, r6)
            com.alibaba.fastjson2.annotation.JSONField r6 = (com.alibaba.fastjson2.annotation.JSONField) r6
            if (r6 == 0) goto L26
            java.lang.String r3 = r6.name()
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L3f
            r3 = r1
            goto L3f
        L26:
            java.lang.String r6 = "com.alibaba.fastjson.annotation.JSONField"
            java.lang.String r7 = r5.getName()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L3f
            com.alibaba.fastjson2.JSONObject$NameConsumer r6 = new com.alibaba.fastjson2.JSONObject$NameConsumer
            r6.<init>(r4)
            com.alibaba.fastjson2.util.BeanUtils.annotationMethods(r5, r6)
            java.lang.String r4 = r6.name
            if (r4 == 0) goto L3f
            r3 = r4
        L3f:
            int r2 = r2 + 1
            goto L8
        L42:
            return r3
    }

    private static /* synthetic */ boolean lambda$of$0(int r0) {
            int r0 = r0 % 2
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$of$1(java.lang.Object[] r0, int r1) {
            r0 = r0[r1]
            return r0
    }

    private static /* synthetic */ void lambda$of$2(java.lang.Object r0) {
            if (r0 == 0) goto L7
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r0 = "The value corresponding to the even bit index of kvArray is key, which cannot be null and must be of type string"
            ah.a.w(r0)
            return
    }

    private static /* synthetic */ boolean lambda$of$3(int r0) {
            int r0 = r0 % 2
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$of$4(java.lang.Object[] r0, int r1) {
            r0 = r0[r1]
            return r0
    }

    public static void nameFilter(java.lang.Iterable<?> r2, com.alibaba.fastjson2.filter.NameFilter r3) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.next()
            boolean r1 = r0 instanceof com.alibaba.fastjson2.JSONObject
            if (r1 == 0) goto L18
            com.alibaba.fastjson2.JSONObject r0 = (com.alibaba.fastjson2.JSONObject) r0
            r0.nameFilter(r3)
            goto L4
        L18:
            boolean r1 = r0 instanceof java.lang.Iterable
            if (r1 == 0) goto L4
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            nameFilter(r0, r3)
            goto L4
        L22:
            return
    }

    public static void nameFilter(java.util.Map r5, com.alibaba.fastjson2.filter.NameFilter r6) {
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L9:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            boolean r4 = r2 instanceof com.alibaba.fastjson2.JSONObject
            if (r4 == 0) goto L28
            r4 = r2
            com.alibaba.fastjson2.JSONObject r4 = (com.alibaba.fastjson2.JSONObject) r4
            r4.nameFilter(r6)
            goto L32
        L28:
            boolean r4 = r2 instanceof java.lang.Iterable
            if (r4 == 0) goto L32
            r4 = r2
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            nameFilter(r4, r6)
        L32:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L9
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r6.process(r5, r3, r2)
            if (r4 == 0) goto L9
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L9
            if (r1 != 0) goto L4b
            com.alibaba.fastjson2.JSONObject r1 = new com.alibaba.fastjson2.JSONObject
            r1.<init>()
        L4b:
            r1.put(r4, r2)
            r0.remove()
            goto L9
        L52:
            if (r1 == 0) goto L57
            r5.putAll(r1)
        L57:
            return
    }

    public static com.alibaba.fastjson2.JSONObject of() {
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r0.<init>()
            return r0
    }

    private static com.alibaba.fastjson2.JSONObject of(com.alibaba.fastjson2.JSONObject r5, java.lang.Object... r6) {
            if (r6 == 0) goto L9a
            int r0 = r6.length
            if (r0 <= 0) goto L9a
            int r0 = r6.length
            r1 = r0 & 1
            r2 = 1
            if (r1 == r2) goto L94
            r1 = 0
            java.util.stream.IntStream r2 = java.util.stream.IntStream.range(r1, r0)
            com.alibaba.fastjson2.a r3 = new com.alibaba.fastjson2.a
            r4 = 0
            r3.<init>(r4)
            java.util.stream.IntStream r2 = r2.filter(r3)
            com.alibaba.fastjson2.b r3 = new com.alibaba.fastjson2.b
            r3.<init>(r4, r6)
            java.util.stream.Stream r2 = r2.mapToObj(r3)
            java.util.stream.Collector r3 = java.util.stream.Collectors.toList()
            java.lang.Object r2 = r2.collect(r3)
            java.util.List r2 = (java.util.List) r2
            ae.e r3 = new ae.e
            r4 = 17
            r3.<init>(r4)
            r2.forEach(r3)
            java.util.stream.Stream r3 = r2.stream()
            java.util.stream.Stream r3 = r3.distinct()
            java.util.stream.Collector r4 = java.util.stream.Collectors.toList()
            java.lang.Object r3 = r3.collect(r4)
            java.util.List r3 = (java.util.List) r3
            int r4 = r2.size()
            int r3 = r3.size()
            if (r4 != r3) goto L8d
            java.util.stream.IntStream r0 = java.util.stream.IntStream.range(r1, r0)
            com.alibaba.fastjson2.a r3 = new com.alibaba.fastjson2.a
            r4 = 1
            r3.<init>(r4)
            java.util.stream.IntStream r0 = r0.filter(r3)
            com.alibaba.fastjson2.b r3 = new com.alibaba.fastjson2.b
            r3.<init>(r4, r6)
            java.util.stream.Stream r6 = r0.mapToObj(r3)
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()
            java.lang.Object r6 = r6.collect(r0)
            java.util.List r6 = (java.util.List) r6
        L74:
            int r0 = r2.size()
            if (r1 >= r0) goto L8c
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r3 = r6.get(r1)
            r5.put(r0, r3)
            int r1 = r1 + 1
            goto L74
        L8c:
            return r5
        L8d:
            java.lang.String r5 = "The value corresponding to the even bit index of kvArray is key and cannot be duplicated"
            ah.a.w(r5)
        L92:
            r5 = 0
            return r5
        L94:
            java.lang.String r5 = "The length of kvArray cannot be odd"
            ah.a.w(r5)
            goto L92
        L9a:
            java.lang.String r5 = "The kvArray cannot be empty"
            ah.a.w(r5)
            goto L92
    }

    public static com.alibaba.fastjson2.JSONObject of(java.lang.String r2, java.lang.Object r3) {
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r1 = 1
            r0.<init>(r1)
            r0.put(r2, r3)
            return r0
    }

    public static com.alibaba.fastjson2.JSONObject of(java.lang.String r2, java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r1 = 2
            r0.<init>(r1)
            r0.put(r2, r3)
            r0.put(r4, r5)
            return r0
    }

    public static com.alibaba.fastjson2.JSONObject of(java.lang.String r2, java.lang.Object r3, java.lang.String r4, java.lang.Object r5, java.lang.String r6, java.lang.Object r7) {
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r1 = 3
            r0.<init>(r1)
            r0.put(r2, r3)
            r0.put(r4, r5)
            r0.put(r6, r7)
            return r0
    }

    public static com.alibaba.fastjson2.JSONObject of(java.lang.String r2, java.lang.Object r3, java.lang.String r4, java.lang.Object r5, java.lang.String r6, java.lang.Object r7, java.lang.String r8, java.lang.Object r9) {
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r1 = 4
            r0.<init>(r1)
            r0.put(r2, r3)
            r0.put(r4, r5)
            r0.put(r6, r7)
            r0.put(r8, r9)
            return r0
    }

    public static com.alibaba.fastjson2.JSONObject of(java.lang.String r2, java.lang.Object r3, java.lang.String r4, java.lang.Object r5, java.lang.String r6, java.lang.Object r7, java.lang.String r8, java.lang.Object r9, java.lang.String r10, java.lang.Object r11) {
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r1 = 5
            r0.<init>(r1)
            r0.put(r2, r3)
            r0.put(r4, r5)
            r0.put(r6, r7)
            r0.put(r8, r9)
            r0.put(r10, r11)
            return r0
    }

    public static com.alibaba.fastjson2.JSONObject of(java.lang.String r2, java.lang.Object r3, java.lang.String r4, java.lang.Object r5, java.lang.String r6, java.lang.Object r7, java.lang.String r8, java.lang.Object r9, java.lang.String r10, java.lang.Object r11, java.lang.Object... r12) {
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r1 = 5
            r0.<init>(r1)
            r0.put(r2, r3)
            r0.put(r4, r5)
            r0.put(r6, r7)
            r0.put(r8, r9)
            r0.put(r10, r11)
            if (r12 == 0) goto L1d
            int r2 = r12.length
            if (r2 <= 0) goto L1d
            of(r0, r12)
        L1d:
            return r0
    }

    public static com.alibaba.fastjson2.JSONObject parse(java.lang.String r0, com.alibaba.fastjson2.JSONReader.Feature... r1) {
            com.alibaba.fastjson2.JSONObject r0 = com.alibaba.fastjson2.JSON.parseObject(r0, r1)
            return r0
    }

    public static com.alibaba.fastjson2.JSONObject parseObject(java.lang.String r0) {
            com.alibaba.fastjson2.JSONObject r0 = com.alibaba.fastjson2.JSON.parseObject(r0)
            return r0
    }

    public static <T> T parseObject(java.lang.String r0, com.alibaba.fastjson2.TypeReference<T> r1, com.alibaba.fastjson2.JSONReader.Feature... r2) {
            java.lang.Object r0 = com.alibaba.fastjson2.JSON.parseObject(r0, r1, r2)
            return r0
    }

    public static <T> T parseObject(java.lang.String r0, java.lang.Class<T> r1) {
            java.lang.Object r0 = com.alibaba.fastjson2.JSON.parseObject(r0, r1)
            return r0
    }

    public static <T> T parseObject(java.lang.String r0, java.lang.Class<T> r1, com.alibaba.fastjson2.JSONReader.Feature... r2) {
            java.lang.Object r0 = com.alibaba.fastjson2.JSON.parseObject(r0, r1, r2)
            return r0
    }

    public static <T> T parseObject(java.lang.String r0, java.lang.reflect.Type r1, com.alibaba.fastjson2.JSONReader.Feature... r2) {
            java.lang.Object r0 = com.alibaba.fastjson2.JSON.parseObject(r0, r1, r2)
            return r0
    }

    public static java.lang.String toJSONString(java.lang.Object r0, com.alibaba.fastjson2.JSONWriter.Feature... r1) {
            java.lang.String r0 = com.alibaba.fastjson2.JSON.toJSONString(r0, r1)
            return r0
    }

    public static void valueFilter(java.lang.Iterable<?> r2, com.alibaba.fastjson2.filter.ValueFilter r3) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r2.next()
            boolean r1 = r0 instanceof java.util.Map
            if (r1 == 0) goto L18
            java.util.Map r0 = (java.util.Map) r0
            valueFilter(r0, r3)
            goto L4
        L18:
            boolean r1 = r0 instanceof java.lang.Iterable
            if (r1 == 0) goto L4
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            valueFilter(r0, r3)
            goto L4
        L22:
            return
    }

    public static void valueFilter(java.util.Map r5, com.alibaba.fastjson2.filter.ValueFilter r6) {
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L41
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r3 = r1.getValue()
            boolean r4 = r3 instanceof java.util.Map
            if (r4 == 0) goto L27
            r4 = r3
            java.util.Map r4 = (java.util.Map) r4
            valueFilter(r4, r6)
            goto L31
        L27:
            boolean r4 = r3 instanceof java.lang.Iterable
            if (r4 == 0) goto L31
            r4 = r3
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            valueFilter(r4, r6)
        L31:
            boolean r4 = r2 instanceof java.lang.String
            if (r4 == 0) goto L8
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r6.apply(r5, r2, r3)
            if (r2 == r3) goto L8
            r1.setValue(r2)
            goto L8
        L41:
            return
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    public com.alibaba.fastjson2.JSONObject clone() {
            r1 = this;
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            com.alibaba.fastjson2.JSONObject r0 = r1.clone()
            return r0
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 != 0) goto L16
            boolean r0 = r2 instanceof java.lang.Character
            if (r0 != 0) goto L16
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 != 0) goto L16
            boolean r0 = r2 instanceof java.util.UUID
            if (r0 == 0) goto L11
            goto L16
        L11:
            boolean r2 = super.containsKey(r2)
            return r2
        L16:
            boolean r0 = super.containsKey(r2)
            if (r0 != 0) goto L29
            java.lang.String r2 = r2.toString()
            boolean r2 = super.containsKey(r2)
            if (r2 == 0) goto L27
            goto L29
        L27:
            r2 = 0
            return r2
        L29:
            r2 = 1
            return r2
    }

    public boolean containsKey(java.lang.String r1) {
            r0 = this;
            boolean r1 = super.containsKey(r1)
            return r1
    }

    public void copyTo(java.lang.Object r5, com.alibaba.fastjson2.JSONReader.Feature... r6) {
            r4 = this;
            long r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures
            long r2 = com.alibaba.fastjson2.JSONReader.Feature.of(r6)
            long r0 = r0 | r2
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            boolean r6 = r6.isEnabled(r0)
            java.lang.Class r2 = r5.getClass()
            com.alibaba.fastjson2.reader.ObjectReaderProvider r3 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectReaderProvider()
            com.alibaba.fastjson2.reader.ObjectReader r6 = r3.getObjectReader(r2, r6)
            r6.accept(r5, r4, r0)
            return
    }

    public java.lang.Object eval(com.alibaba.fastjson2.JSONPath r1) {
            r0 = this;
            java.lang.Object r1 = r1.eval(r0)
            return r1
    }

    public com.alibaba.fastjson2.JSONObject fluentPut(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            r0.put(r1, r2)
            return r0
    }

    public void forEachArrayObject(java.lang.String r3, java.util.function.Consumer<com.alibaba.fastjson2.JSONObject> r4) {
            r2 = this;
            com.alibaba.fastjson2.JSONArray r3 = r2.getJSONArray(r3)
            if (r3 != 0) goto L7
            goto L18
        L7:
            r0 = 0
        L8:
            int r1 = r3.size()
            if (r0 >= r1) goto L18
            com.alibaba.fastjson2.JSONObject r1 = r3.getJSONObject(r0)
            r4.accept(r1)
            int r0 = r0 + 1
            goto L8
        L18:
            return
    }

    @java.lang.Deprecated
    public void forEchArrayObject(java.lang.String r1, java.util.function.Consumer<com.alibaba.fastjson2.JSONObject> r2) {
            r0 = this;
            r0.forEachArrayObject(r1, r2)
            return
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 != 0) goto L10
            boolean r0 = r2 instanceof java.lang.Character
            if (r0 != 0) goto L10
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 != 0) goto L10
            boolean r0 = r2 instanceof java.util.UUID
            if (r0 == 0) goto L1b
        L10:
            java.lang.String r0 = r2.toString()
            java.lang.Object r0 = super.get(r0)
            if (r0 == 0) goto L1b
            return r0
        L1b:
            java.lang.Object r2 = super.get(r2)
            return r2
    }

    public java.lang.Object get(java.lang.String r1) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            return r1
    }

    public java.math.BigDecimal getBigDecimal(java.lang.String r3) {
            r2 = this;
            java.lang.Object r3 = super.get(r3)
            if (r3 != 0) goto L8
            r3 = 0
            return r3
        L8:
            boolean r0 = r3 instanceof java.lang.Number
            if (r0 == 0) goto L48
            boolean r0 = r3 instanceof java.math.BigDecimal
            if (r0 == 0) goto L13
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            return r3
        L13:
            boolean r0 = r3 instanceof java.math.BigInteger
            if (r0 == 0) goto L1f
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            r0.<init>(r3)
            return r0
        L1f:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L2e
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            java.math.BigDecimal r3 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r3)
            return r3
        L2e:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L3d
            java.lang.Double r3 = (java.lang.Double) r3
            double r0 = r3.doubleValue()
            java.math.BigDecimal r3 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r0)
            return r3
        L3d:
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            java.math.BigDecimal r3 = java.math.BigDecimal.valueOf(r0)
            return r3
        L48:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L57
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r3.trim()
            java.math.BigDecimal r3 = com.alibaba.fastjson2.util.TypeUtils.toBigDecimal(r3)
            return r3
        L57:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L69
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L66
            java.math.BigDecimal r3 = java.math.BigDecimal.ONE
            return r3
        L66:
            java.math.BigDecimal r3 = java.math.BigDecimal.ZERO
            return r3
        L69:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to BigDecimal"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public java.math.BigInteger getBigInteger(java.lang.String r3) {
            r2 = this;
            java.lang.Object r3 = super.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L29
            boolean r0 = r3 instanceof java.math.BigInteger
            if (r0 == 0) goto L13
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            return r3
        L13:
            boolean r0 = r3 instanceof java.math.BigDecimal
            if (r0 == 0) goto L1e
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigInteger r3 = r3.toBigInteger()
            return r3
        L1e:
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r0)
            return r3
        L29:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L44
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L43
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L3e
            goto L43
        L3e:
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r3)
        L43:
            return r0
        L44:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L56
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L53
            java.math.BigInteger r3 = java.math.BigInteger.ONE
            return r3
        L53:
            java.math.BigInteger r3 = java.math.BigInteger.ZERO
            return r3
        L56:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to BigInteger"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public java.lang.Boolean getBoolean(java.lang.String r5) {
            r4 = this;
            java.lang.Object r5 = super.get(r5)
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            boolean r1 = r5 instanceof java.lang.Boolean
            if (r1 == 0) goto Lf
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            return r5
        Lf:
            boolean r1 = r5 instanceof java.lang.Number
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L23
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 != r3) goto L1e
            r2 = r3
        L1e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L23:
            boolean r1 = r5 instanceof java.lang.String
            if (r1 == 0) goto L4f
            java.lang.String r5 = (java.lang.String) r5
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L4e
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r5)
            if (r1 == 0) goto L38
            goto L4e
        L38:
            java.lang.String r0 = "true"
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 != 0) goto L48
            java.lang.String r0 = "1"
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto L49
        L48:
            r2 = r3
        L49:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L4e:
            return r0
        L4f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to Boolean"
            java.lang.String r5 = bc.e.h(r5, r1, r0)
            ah.a.w(r5)
            r5 = 0
            return r5
    }

    public boolean getBooleanValue(java.lang.String r4) {
            r3 = this;
            java.lang.Object r4 = super.get(r4)
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            boolean r1 = r4 instanceof java.lang.Boolean
            if (r1 == 0) goto L13
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L13:
            boolean r1 = r4 instanceof java.lang.Number
            r2 = 1
            if (r1 == 0) goto L22
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 != r2) goto L21
            return r2
        L21:
            return r0
        L22:
            boolean r1 = r4 instanceof java.lang.String
            if (r1 == 0) goto L3b
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r1 = "true"
            boolean r1 = r1.equalsIgnoreCase(r4)
            if (r1 != 0) goto L3a
            java.lang.String r1 = "1"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L39
            goto L3a
        L39:
            return r0
        L3a:
            return r2
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to boolean value"
            java.lang.String r4 = bc.e.h(r4, r1, r0)
            ah.a.w(r4)
            r4 = 0
            return r4
    }

    public boolean getBooleanValue(java.lang.String r3, boolean r4) {
            r2 = this;
            java.lang.Object r3 = super.get(r3)
            if (r3 != 0) goto L7
            return r4
        L7:
            boolean r4 = r3 instanceof java.lang.Boolean
            if (r4 == 0) goto L12
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
        L12:
            boolean r4 = r3 instanceof java.lang.Number
            r0 = 0
            r1 = 1
            if (r4 == 0) goto L22
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 != r1) goto L21
            return r1
        L21:
            return r0
        L22:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L3b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "true"
            boolean r4 = r4.equalsIgnoreCase(r3)
            if (r4 != 0) goto L3a
            java.lang.String r4 = "1"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            goto L3a
        L39:
            return r0
        L3a:
            return r1
        L3b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Can not cast '"
            r4.<init>(r0)
            java.lang.String r0 = "' to boolean value"
            java.lang.String r3 = bc.e.h(r3, r0, r4)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public java.lang.Object getByPath(java.lang.String r1) {
            r0 = this;
            com.alibaba.fastjson2.JSONPath r1 = com.alibaba.fastjson2.JSONPath.of(r1)
            java.lang.Object r1 = r1.eval(r0)
            return r1
    }

    public java.lang.Byte getByte(java.lang.String r3) {
            r2 = this;
            java.lang.Object r3 = super.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L17
            java.lang.Number r3 = (java.lang.Number) r3
            byte r3 = r3.byteValue()
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            return r3
        L17:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L36
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L35
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L2c
            goto L35
        L2c:
            byte r3 = java.lang.Byte.parseByte(r3)
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            return r3
        L35:
            return r0
        L36:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to Byte"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public byte getByteValue(java.lang.String r3) {
            r2 = this;
            java.lang.Object r3 = super.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L13
            java.lang.Number r3 = (java.lang.Number) r3
            byte r3 = r3.byteValue()
            return r3
        L13:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L2e
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L2d
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L28
            goto L2d
        L28:
            byte r3 = java.lang.Byte.parseByte(r3)
            return r3
        L2d:
            return r0
        L2e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to byte value"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public byte[] getBytes(java.lang.String r2) {
            r1 = this;
            java.lang.Object r2 = r1.get(r2)
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto Lf
            byte[] r2 = (byte[]) r2
            return r2
        Lf:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L1a
            java.lang.String r2 = (java.lang.String) r2
            byte[] r2 = com.alibaba.fastjson2.util.IOUtils.decodeBase64(r2)
            return r2
        L1a:
            java.lang.String r0 = "can not cast to byte[], value : "
            ah.a.v(r2, r0)
            r2 = 0
            return r2
    }

    public java.util.Date getDate(java.lang.String r6) {
            r5 = this;
            java.lang.Object r6 = super.get(r6)
            r0 = 0
            if (r6 != 0) goto L8
            return r0
        L8:
            boolean r1 = r6 instanceof java.util.Date
            if (r1 == 0) goto Lf
            java.util.Date r6 = (java.util.Date) r6
            return r6
        Lf:
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L28
            java.lang.String r6 = (java.lang.String) r6
            java.time.ZoneId r1 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            long r1 = com.alibaba.fastjson2.util.DateUtils.parseMillis(r6, r1)
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L22
            return r0
        L22:
            java.util.Date r6 = new java.util.Date
            r6.<init>(r1)
            return r6
        L28:
            boolean r0 = r6 instanceof java.lang.Number
            if (r0 == 0) goto L38
            java.lang.Number r6 = (java.lang.Number) r6
            long r0 = r6.longValue()
            java.util.Date r6 = new java.util.Date
            r6.<init>(r0)
            return r6
        L38:
            java.util.Date r6 = com.alibaba.fastjson2.util.TypeUtils.toDate(r6)
            return r6
    }

    public java.util.Date getDate(java.lang.String r1, java.util.Date r2) {
            r0 = this;
            java.util.Date r1 = r0.getDate(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            return r1
    }

    public java.lang.Double getDouble(java.lang.String r3) {
            r2 = this;
            java.lang.Object r3 = super.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Double
            if (r1 == 0) goto Lf
            java.lang.Double r3 = (java.lang.Double) r3
            return r3
        Lf:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L1e
            java.lang.Number r3 = (java.lang.Number) r3
            double r0 = r3.doubleValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
        L1e:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L3d
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L3c
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L33
            goto L3c
        L33:
            double r0 = java.lang.Double.parseDouble(r3)
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            return r3
        L3c:
            return r0
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to double"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public double getDoubleValue(java.lang.String r3) {
            r2 = this;
            java.lang.Double r3 = r2.getDouble(r3)
            if (r3 != 0) goto L9
            r0 = 0
            return r0
        L9:
            double r0 = r3.doubleValue()
            return r0
    }

    public java.lang.Float getFloat(java.lang.String r3) {
            r2 = this;
            java.lang.Object r3 = super.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Float
            if (r1 == 0) goto Lf
            java.lang.Float r3 = (java.lang.Float) r3
            return r3
        Lf:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L1e
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            return r3
        L1e:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L3d
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L3c
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L33
            goto L3c
        L33:
            float r3 = java.lang.Float.parseFloat(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            return r3
        L3c:
            return r0
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to float"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public float getFloatValue(java.lang.String r1) {
            r0 = this;
            java.lang.Float r1 = r0.getFloat(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            float r1 = r1.floatValue()
            return r1
    }

    public java.time.Instant getInstant(java.lang.String r6) {
            r5 = this;
            java.lang.Object r6 = super.get(r6)
            r0 = 0
            if (r6 != 0) goto L8
            return r0
        L8:
            boolean r1 = r6 instanceof java.time.Instant
            if (r1 == 0) goto Lf
            java.time.Instant r6 = (java.time.Instant) r6
            return r6
        Lf:
            boolean r1 = r6 instanceof java.lang.Number
            if (r1 == 0) goto L25
            java.lang.Number r6 = (java.lang.Number) r6
            long r1 = r6.longValue()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L20
            return r0
        L20:
            java.time.Instant r6 = java.time.Instant.ofEpochMilli(r1)
            return r6
        L25:
            java.time.Instant r6 = com.alibaba.fastjson2.util.TypeUtils.toInstant(r6)
            return r6
    }

    public int getIntValue(java.lang.String r3) {
            r2 = this;
            java.lang.Object r3 = super.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L13
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            return r3
        L13:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L3d
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L3c
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L28
            goto L3c
        L28:
            r0 = 46
            int r0 = r3.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto L37
            double r0 = java.lang.Double.parseDouble(r3)
            int r3 = (int) r0
            return r3
        L37:
            int r3 = java.lang.Integer.parseInt(r3)
            return r3
        L3c:
            return r0
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to int value"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public int getIntValue(java.lang.String r2, int r3) {
            r1 = this;
            java.lang.Object r2 = super.get(r2)
            if (r2 != 0) goto L7
            goto L3b
        L7:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L12
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            return r2
        L12:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L3c
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L3b
            java.lang.String r0 = "null"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L27
            goto L3b
        L27:
            r3 = 46
            int r3 = r2.indexOf(r3)
            r0 = -1
            if (r3 == r0) goto L36
            double r2 = java.lang.Double.parseDouble(r2)
            int r2 = (int) r2
            return r2
        L36:
            int r2 = java.lang.Integer.parseInt(r2)
            return r2
        L3b:
            return r3
        L3c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Can not cast '"
            r3.<init>(r0)
            java.lang.String r0 = "' to int value"
            java.lang.String r2 = bc.e.h(r2, r0, r3)
            ah.a.w(r2)
            r2 = 0
            return r2
    }

    public java.lang.Integer getInteger(java.lang.String r3) {
            r2 = this;
            java.lang.Object r3 = super.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Integer
            if (r1 == 0) goto Lf
            java.lang.Integer r3 = (java.lang.Integer) r3
            return r3
        Lf:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L1e
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L1e:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L50
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L4f
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L33
            goto L4f
        L33:
            r0 = 46
            int r0 = r3.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto L46
            double r0 = java.lang.Double.parseDouble(r3)
            int r3 = (int) r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L46:
            int r3 = java.lang.Integer.parseInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L4f:
            return r0
        L50:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L68
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L62
            r3 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L62:
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
        L68:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to Integer"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public com.alibaba.fastjson2.JSONArray getJSONArray(java.lang.String r7) {
            r6 = this;
            java.lang.Object r0 = super.get(r7)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r0 instanceof com.alibaba.fastjson2.JSONArray
            if (r2 == 0) goto Lf
            com.alibaba.fastjson2.JSONArray r0 = (com.alibaba.fastjson2.JSONArray) r0
            return r0
        Lf:
            boolean r2 = r0 instanceof com.alibaba.fastjson2.JSONObject
            if (r2 == 0) goto L18
            com.alibaba.fastjson2.JSONArray r7 = com.alibaba.fastjson2.JSONArray.of(r0)
            return r7
        L18:
            boolean r2 = r0 instanceof java.lang.String
            r3 = 0
            if (r2 == 0) goto L59
            java.lang.String r0 = (java.lang.String) r0
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L58
            java.lang.String r7 = "null"
            boolean r7 = r7.equalsIgnoreCase(r0)
            if (r7 == 0) goto L2e
            goto L58
        L2e:
            char r7 = r0.charAt(r3)
            r1 = 91
            if (r7 == r1) goto L3b
            com.alibaba.fastjson2.JSONArray r7 = com.alibaba.fastjson2.JSONArray.of(r0)
            return r7
        L3b:
            com.alibaba.fastjson2.JSONReader r1 = com.alibaba.fastjson2.JSONReader.of(r0)
            com.alibaba.fastjson2.reader.ObjectReader<com.alibaba.fastjson2.JSONArray> r7 = com.alibaba.fastjson2.JSONObject.arrayReader
            if (r7 != 0) goto L4b
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r7 = com.alibaba.fastjson2.JSONArray.class
            com.alibaba.fastjson2.reader.ObjectReader r7 = r1.getObjectReader(r7)
            com.alibaba.fastjson2.JSONObject.arrayReader = r7
        L4b:
            com.alibaba.fastjson2.reader.ObjectReader<com.alibaba.fastjson2.JSONArray> r0 = com.alibaba.fastjson2.JSONObject.arrayReader
            r3 = 0
            r4 = 0
            r2 = 0
            java.lang.Object r7 = r0.readObject(r1, r2, r3, r4)
            com.alibaba.fastjson2.JSONArray r7 = (com.alibaba.fastjson2.JSONArray) r7
            return r7
        L58:
            return r1
        L59:
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L68
            com.alibaba.fastjson2.JSONArray r1 = new com.alibaba.fastjson2.JSONArray
            java.util.Collection r0 = (java.util.Collection) r0
            r1.<init>(r0)
            r6.put(r7, r1)
            return r1
        L68:
            boolean r2 = r0 instanceof java.lang.Object[]
            if (r2 == 0) goto L76
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            com.alibaba.fastjson2.JSONArray r0 = com.alibaba.fastjson2.JSONArray.of(r0)
            r6.put(r7, r0)
            return r0
        L76:
            java.lang.Class r2 = r0.getClass()
            boolean r2 = r2.isArray()
            if (r2 == 0) goto L99
            int r1 = java.lang.reflect.Array.getLength(r0)
            com.alibaba.fastjson2.JSONArray r2 = new com.alibaba.fastjson2.JSONArray
            r2.<init>(r1)
        L89:
            if (r3 >= r1) goto L95
            java.lang.Object r4 = java.lang.reflect.Array.get(r0, r3)
            r2.add(r4)
            int r3 = r3 + 1
            goto L89
        L95:
            r6.put(r7, r2)
            return r2
        L99:
            return r1
    }

    public com.alibaba.fastjson2.JSONObject getJSONObject(java.lang.String r9) {
            r8 = this;
            java.lang.Object r0 = super.get(r9)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r0 instanceof com.alibaba.fastjson2.JSONObject
            if (r2 == 0) goto Lf
            com.alibaba.fastjson2.JSONObject r0 = (com.alibaba.fastjson2.JSONObject) r0
            return r0
        Lf:
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L36
            java.lang.String r0 = (java.lang.String) r0
            boolean r9 = r0.isEmpty()
            if (r9 != 0) goto L35
            java.lang.String r9 = "null"
            boolean r9 = r9.equalsIgnoreCase(r0)
            if (r9 == 0) goto L24
            goto L35
        L24:
            com.alibaba.fastjson2.JSONReader r3 = com.alibaba.fastjson2.JSONReader.of(r0)
            com.alibaba.fastjson2.reader.ObjectReader<com.alibaba.fastjson2.JSONObject> r2 = com.alibaba.fastjson2.JSONFactory.OBJECT_READER
            r5 = 0
            r6 = 0
            r4 = 0
            java.lang.Object r9 = r2.readObject(r3, r4, r5, r6)
            com.alibaba.fastjson2.JSONObject r9 = (com.alibaba.fastjson2.JSONObject) r9
            return r9
        L35:
            return r1
        L36:
            boolean r2 = r0 instanceof java.util.Map
            if (r2 == 0) goto L45
            com.alibaba.fastjson2.JSONObject r1 = new com.alibaba.fastjson2.JSONObject
            java.util.Map r0 = (java.util.Map) r0
            r1.<init>(r0)
            r8.put(r9, r1)
            return r1
        L45:
            java.lang.Class r2 = r0.getClass()
            com.alibaba.fastjson2.writer.ObjectWriterProvider r3 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.writer.ObjectWriter r2 = r3.getObjectWriter(r2)
            boolean r3 = r2 instanceof com.alibaba.fastjson2.writer.ObjectWriterAdapter
            if (r3 == 0) goto L5d
            com.alibaba.fastjson2.writer.ObjectWriterAdapter r2 = (com.alibaba.fastjson2.writer.ObjectWriterAdapter) r2
            com.alibaba.fastjson2.JSONObject r0 = r2.toJSONObject(r0)
            r8.put(r9, r0)
            return r0
        L5d:
            return r1
    }

    public <T> java.util.List<T> getList(java.lang.String r1, java.lang.Class<T> r2, com.alibaba.fastjson2.JSONReader.Feature... r3) {
            r0 = this;
            com.alibaba.fastjson2.JSONArray r1 = r0.getJSONArray(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.util.List r1 = r1.toList(r2, r3)
            return r1
    }

    public java.time.LocalDate getLocalDate(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.time.LocalDate r2 = r1.getLocalDate(r2, r0)
            return r2
    }

    public java.time.LocalDate getLocalDate(java.lang.String r1, java.time.LocalDate r2) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            boolean r2 = r1 instanceof java.time.LocalDate
            if (r2 == 0) goto Le
            java.time.LocalDate r1 = (java.time.LocalDate) r1
            return r1
        Le:
            java.lang.Class<java.time.LocalDate> r2 = java.time.LocalDate.class
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.cast(r1, r2)
            java.time.LocalDate r1 = (java.time.LocalDate) r1
            return r1
    }

    public java.time.LocalDateTime getLocalDateTime(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.time.LocalDateTime r2 = r1.getLocalDateTime(r2, r0)
            return r2
    }

    public java.time.LocalDateTime getLocalDateTime(java.lang.String r1, java.time.LocalDateTime r2) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            boolean r2 = r1 instanceof java.time.LocalDateTime
            if (r2 == 0) goto Le
            java.time.LocalDateTime r1 = (java.time.LocalDateTime) r1
            return r1
        Le:
            java.lang.Class<java.time.LocalDateTime> r2 = java.time.LocalDateTime.class
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.cast(r1, r2)
            java.time.LocalDateTime r1 = (java.time.LocalDateTime) r1
            return r1
    }

    public java.time.LocalTime getLocalTime(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.time.LocalTime r2 = r1.getLocalTime(r2, r0)
            return r2
    }

    public java.time.LocalTime getLocalTime(java.lang.String r1, java.time.LocalTime r2) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            boolean r2 = r1 instanceof java.time.LocalTime
            if (r2 == 0) goto Le
            java.time.LocalTime r1 = (java.time.LocalTime) r1
            return r1
        Le:
            java.lang.Class<java.time.LocalTime> r2 = java.time.LocalTime.class
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.cast(r1, r2)
            java.time.LocalTime r1 = (java.time.LocalTime) r1
            return r1
    }

    public java.lang.Long getLong(java.lang.String r3) {
            r2 = this;
            java.lang.Object r3 = super.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Long
            if (r1 == 0) goto Lf
            java.lang.Long r3 = (java.lang.Long) r3
            return r3
        Lf:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L1e
            java.lang.Number r3 = (java.lang.Number) r3
            long r0 = r3.longValue()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L1e:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L50
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L4f
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L33
            goto L4f
        L33:
            r0 = 46
            int r0 = r3.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto L46
            double r0 = java.lang.Double.parseDouble(r3)
            long r0 = (long) r0
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L46:
            long r0 = java.lang.Long.parseLong(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L4f:
            return r0
        L50:
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L6a
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L63
            r0 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L63:
            r0 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L6a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to Long"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public long getLongValue(java.lang.String r4) {
            r3 = this;
            java.lang.Object r4 = super.get(r4)
            r0 = 0
            if (r4 != 0) goto L9
            return r0
        L9:
            boolean r2 = r4 instanceof java.lang.Number
            if (r2 == 0) goto L14
            java.lang.Number r4 = (java.lang.Number) r4
            long r0 = r4.longValue()
            return r0
        L14:
            boolean r2 = r4 instanceof java.lang.String
            if (r2 == 0) goto L3d
            java.lang.String r4 = (java.lang.String) r4
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L3c
            java.lang.String r2 = "null"
            boolean r2 = r2.equalsIgnoreCase(r4)
            if (r2 == 0) goto L29
            goto L3c
        L29:
            r0 = 46
            int r0 = r4.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto L38
            double r0 = java.lang.Double.parseDouble(r4)
            long r0 = (long) r0
            return r0
        L38:
            long r0 = java.lang.Long.parseLong(r4)
        L3c:
            return r0
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to long value"
            java.lang.String r4 = bc.e.h(r4, r1, r0)
            ah.a.w(r4)
            r0 = 0
            return r0
    }

    public long getLongValue(java.lang.String r2, long r3) {
            r1 = this;
            java.lang.Object r2 = super.get(r2)
            if (r2 != 0) goto L7
            goto L3b
        L7:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L12
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            return r2
        L12:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L3c
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L3b
            java.lang.String r0 = "null"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L27
            goto L3b
        L27:
            r3 = 46
            int r3 = r2.indexOf(r3)
            r4 = -1
            if (r3 == r4) goto L36
            double r2 = java.lang.Double.parseDouble(r2)
            long r2 = (long) r2
            return r2
        L36:
            long r2 = java.lang.Long.parseLong(r2)
            return r2
        L3b:
            return r3
        L3c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can not cast '"
            r3.<init>(r4)
            java.lang.String r4 = "' to long value"
            java.lang.String r2 = bc.e.h(r2, r4, r3)
            ah.a.w(r2)
            r2 = 0
            return r2
    }

    public <T> T getObject(java.lang.String r1, com.alibaba.fastjson2.TypeReference<T> r2, com.alibaba.fastjson2.JSONReader.Feature... r3) {
            r0 = this;
            java.lang.reflect.Type r2 = r2.type
            java.lang.Object r1 = r0.getObject(r1, r2, r3)
            return r1
    }

    public <T> T getObject(java.lang.String r11, java.lang.Class<T> r12, com.alibaba.fastjson2.JSONReader.Feature... r13) {
            r10 = this;
            java.lang.Object r11 = super.get(r11)
            r0 = 0
            if (r11 != 0) goto L8
            return r0
        L8:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r12 != r1) goto L10
            int r1 = r13.length
            if (r1 != 0) goto L10
            goto L59
        L10:
            int r1 = r13.length
            r2 = 0
            r3 = r2
        L13:
            if (r3 >= r1) goto L20
            r4 = r13[r3]
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            if (r4 != r5) goto L1d
            r2 = 1
            goto L20
        L1d:
            int r3 = r3 + 1
            goto L13
        L20:
            java.lang.Class r1 = r11.getClass()
            com.alibaba.fastjson2.reader.ObjectReaderProvider r3 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.util.function.Function r1 = r3.getTypeConvert(r1, r12)
            if (r1 == 0) goto L31
            java.lang.Object r11 = r1.apply(r11)
            return r11
        L31:
            boolean r1 = r11 instanceof java.util.Map
            if (r1 == 0) goto L40
            com.alibaba.fastjson2.reader.ObjectReader r12 = r3.getObjectReader(r12, r2)
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r11 = r12.createInstance(r11, r13)
            return r11
        L40:
            boolean r1 = r11 instanceof java.util.Collection
            if (r1 == 0) goto L4f
            com.alibaba.fastjson2.reader.ObjectReader r12 = r3.getObjectReader(r12, r2)
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r11 = r12.createInstance(r11, r13)
            return r11
        L4f:
            java.lang.Class r12 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r12)
            boolean r1 = r12.isInstance(r11)
            if (r1 == 0) goto L5a
        L59:
            return r11
        L5a:
            boolean r1 = r11 instanceof java.lang.String
            if (r1 == 0) goto L8a
            r1 = r11
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L89
            java.lang.String r4 = "null"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L70
            goto L89
        L70:
            boolean r4 = r12.isEnum()
            if (r4 == 0) goto L8a
            com.alibaba.fastjson2.reader.ObjectReader r0 = r3.getObjectReader(r12, r2)
            boolean r4 = r0 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplEnum
            if (r4 == 0) goto L8a
            long r11 = com.alibaba.fastjson2.util.Fnv.hashCode64(r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplEnum r0 = (com.alibaba.fastjson2.reader.ObjectReaderImplEnum) r0
            java.lang.Enum r11 = r0.getEnumByHashCode(r11)
            return r11
        L89:
            return r0
        L8a:
            java.lang.String r11 = com.alibaba.fastjson2.JSON.toJSONString(r11)
            com.alibaba.fastjson2.JSONReader r5 = com.alibaba.fastjson2.JSONReader.of(r11)
            com.alibaba.fastjson2.JSONReader$Context r1 = r5.context
            r1.config(r13)
            if (r0 != 0) goto L9d
            com.alibaba.fastjson2.reader.ObjectReader r0 = r3.getObjectReader(r12, r2)
        L9d:
            r4 = r0
            r7 = 0
            r8 = 0
            r6 = 0
            java.lang.Object r12 = r4.readObject(r5, r6, r7, r8)
            boolean r13 = r5.isEnd()
            if (r13 == 0) goto Lad
            return r12
        Lad:
            java.lang.String r12 = "not support input "
            java.lang.String r11 = wb.en.g(r12, r11)
            ah.a.w(r11)
            r11 = 0
            return r11
    }

    public <T> T getObject(java.lang.String r11, java.lang.reflect.Type r12, com.alibaba.fastjson2.JSONReader.Feature... r13) {
            r10 = this;
            java.lang.Object r11 = super.get(r11)
            r0 = 0
            if (r11 != 0) goto L8
            return r0
        L8:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r12 != r1) goto L10
            int r1 = r13.length
            if (r1 != 0) goto L10
            goto L5c
        L10:
            int r1 = r13.length
            r2 = 0
            r3 = r2
        L13:
            if (r3 >= r1) goto L20
            r4 = r13[r3]
            com.alibaba.fastjson2.JSONReader$Feature r5 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            if (r4 != r5) goto L1d
            r2 = 1
            goto L20
        L1d:
            int r3 = r3 + 1
            goto L13
        L20:
            java.lang.Class r1 = r11.getClass()
            com.alibaba.fastjson2.reader.ObjectReaderProvider r3 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.util.function.Function r1 = r3.getTypeConvert(r1, r12)
            if (r1 == 0) goto L31
            java.lang.Object r11 = r1.apply(r11)
            return r11
        L31:
            boolean r1 = r11 instanceof java.util.Map
            if (r1 == 0) goto L40
            com.alibaba.fastjson2.reader.ObjectReader r12 = r3.getObjectReader(r12, r2)
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r11 = r12.createInstance(r11, r13)
            return r11
        L40:
            boolean r1 = r11 instanceof java.util.Collection
            if (r1 == 0) goto L4f
            com.alibaba.fastjson2.reader.ObjectReader r12 = r3.getObjectReader(r12, r2)
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r11 = r12.createInstance(r11, r13)
            return r11
        L4f:
            boolean r1 = r12 instanceof java.lang.Class
            if (r1 == 0) goto L5d
            r1 = r12
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isInstance(r11)
            if (r1 == 0) goto L5d
        L5c:
            return r11
        L5d:
            boolean r1 = r11 instanceof java.lang.String
            if (r1 == 0) goto L73
            r1 = r11
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L72
            java.lang.String r4 = "null"
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L73
        L72:
            return r0
        L73:
            java.lang.String r11 = com.alibaba.fastjson2.JSON.toJSONString(r11)
            com.alibaba.fastjson2.JSONReader r5 = com.alibaba.fastjson2.JSONReader.of(r11)
            com.alibaba.fastjson2.JSONReader$Context r11 = r5.context
            r11.config(r13)
            com.alibaba.fastjson2.reader.ObjectReader r4 = r3.getObjectReader(r12, r2)
            r7 = 0
            r8 = 0
            r6 = 0
            java.lang.Object r11 = r4.readObject(r5, r6, r7, r8)
            return r11
    }

    public <T> T getObject(java.lang.String r1, java.util.function.Function<com.alibaba.fastjson2.JSONObject, T> r2) {
            r0 = this;
            com.alibaba.fastjson2.JSONObject r1 = r0.getJSONObject(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Object r1 = r2.apply(r1)
            return r1
    }

    public java.time.OffsetDateTime getOffsetDateTime(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.time.OffsetDateTime r2 = r1.getOffsetDateTime(r2, r0)
            return r2
    }

    public java.time.OffsetDateTime getOffsetDateTime(java.lang.String r1, java.time.OffsetDateTime r2) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            boolean r2 = r1 instanceof java.time.OffsetDateTime
            if (r2 == 0) goto Le
            java.time.OffsetDateTime r1 = (java.time.OffsetDateTime) r1
            return r1
        Le:
            java.lang.Class<java.time.OffsetDateTime> r2 = java.time.OffsetDateTime.class
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.cast(r1, r2)
            java.time.OffsetDateTime r1 = (java.time.OffsetDateTime) r1
            return r1
    }

    public java.time.OffsetTime getOffsetTime(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.time.OffsetTime r2 = r1.getOffsetTime(r2, r0)
            return r2
    }

    public java.time.OffsetTime getOffsetTime(java.lang.String r1, java.time.OffsetTime r2) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            boolean r2 = r1 instanceof java.time.OffsetTime
            if (r2 == 0) goto Le
            java.time.OffsetTime r1 = (java.time.OffsetTime) r1
            return r1
        Le:
            java.lang.Class<java.time.OffsetTime> r2 = java.time.OffsetTime.class
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.cast(r1, r2)
            java.time.OffsetTime r1 = (java.time.OffsetTime) r1
            return r1
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public java.lang.Object getOrDefault(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 != 0) goto L19
            boolean r0 = r2 instanceof java.lang.Character
            if (r0 != 0) goto L19
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 != 0) goto L19
            boolean r0 = r2 instanceof java.util.UUID
            if (r0 == 0) goto L11
            goto L19
        L11:
            java.lang.Object r2 = super.get(r2)
            if (r2 != 0) goto L18
            return r3
        L18:
            return r2
        L19:
            java.lang.String r2 = r2.toString()
            java.lang.Object r2 = r1.getOrDefault(r2, r3)
            return r2
    }

    public java.lang.Object getOrDefault(java.lang.String r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            return r1
    }

    public java.lang.Short getShort(java.lang.String r3) {
            r2 = this;
            java.lang.Object r3 = super.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Short
            if (r1 == 0) goto Lf
            java.lang.Short r3 = (java.lang.Short) r3
            return r3
        Lf:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L1e
            java.lang.Number r3 = (java.lang.Number) r3
            short r3 = r3.shortValue()
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            return r3
        L1e:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L3d
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L3c
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L33
            goto L3c
        L33:
            short r3 = java.lang.Short.parseShort(r3)
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            return r3
        L3c:
            return r0
        L3d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to Short"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public short getShortValue(java.lang.String r3) {
            r2 = this;
            java.lang.Object r3 = super.get(r3)
            r0 = 0
            if (r3 != 0) goto L8
            return r0
        L8:
            boolean r1 = r3 instanceof java.lang.Number
            if (r1 == 0) goto L13
            java.lang.Number r3 = (java.lang.Number) r3
            short r3 = r3.shortValue()
            return r3
        L13:
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L2e
            java.lang.String r3 = (java.lang.String) r3
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L2d
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r3)
            if (r1 == 0) goto L28
            goto L2d
        L28:
            short r3 = java.lang.Short.parseShort(r3)
            return r3
        L2d:
            return r0
        L2e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can not cast '"
            r0.<init>(r1)
            java.lang.String r1 = "' to short value"
            java.lang.String r3 = bc.e.h(r3, r1, r0)
            ah.a.w(r3)
            r3 = 0
            return r3
    }

    public int getSize(java.lang.String r2) {
            r1 = this;
            java.lang.Object r2 = r1.get(r2)
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto Lf
            java.util.Map r2 = (java.util.Map) r2
            int r2 = r2.size()
            return r2
        Lf:
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L1a
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public java.lang.String getString(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.getString(r2, r0)
            return r2
    }

    public java.lang.String getString(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            java.lang.Object r3 = super.get(r3)
            if (r3 != 0) goto L7
            return r4
        L7:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto Le
            java.lang.String r3 = (java.lang.String) r3
            return r3
        Le:
            boolean r4 = r3 instanceof java.util.Date
            if (r4 == 0) goto L20
            java.util.Date r3 = (java.util.Date) r3
            long r3 = r3.getTime()
            r0 = 0
            java.time.ZoneId r1 = com.alibaba.fastjson2.util.DateUtils.DEFAULT_ZONE_ID
            java.lang.String r3 = com.alibaba.fastjson2.util.DateUtils.toString(r3, r0, r1)
            return r3
        L20:
            boolean r4 = r3 instanceof java.lang.Boolean
            if (r4 != 0) goto L3a
            boolean r4 = r3 instanceof java.lang.Character
            if (r4 != 0) goto L3a
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 != 0) goto L3a
            boolean r4 = r3 instanceof java.util.UUID
            if (r4 != 0) goto L3a
            boolean r4 = r3 instanceof java.lang.Enum
            if (r4 == 0) goto L35
            goto L3a
        L35:
            java.lang.String r3 = com.alibaba.fastjson2.JSON.toJSONString(r3)
            return r3
        L3a:
            java.lang.String r3 = r3.toString()
            return r3
    }

    public java.time.ZonedDateTime getZonedDateTime(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.time.ZonedDateTime r2 = r1.getZonedDateTime(r2, r0)
            return r2
    }

    public java.time.ZonedDateTime getZonedDateTime(java.lang.String r1, java.time.ZonedDateTime r2) {
            r0 = this;
            java.lang.Object r1 = super.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            boolean r2 = r1 instanceof java.time.ZonedDateTime
            if (r2 == 0) goto Le
            java.time.ZonedDateTime r1 = (java.time.ZonedDateTime) r1
            return r1
        Le:
            java.lang.Class<java.time.ZonedDateTime> r2 = java.time.ZonedDateTime.class
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.cast(r1, r2)
            java.time.ZonedDateTime r1 = (java.time.ZonedDateTime) r1
            return r1
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object r11, java.lang.reflect.Method r12, java.lang.Object[] r13) {
            r10 = this;
            java.lang.String r0 = r12.getName()
            int r1 = r12.getParameterCount()
            java.lang.Class r2 = r12.getReturnType()
            r3 = 3
            java.lang.Class r4 = java.lang.Void.TYPE
            r5 = 0
            java.lang.String r6 = "This method '"
            r7 = 0
            r8 = 1
            if (r1 != r8) goto L99
            java.lang.String r1 = "equals"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L29
            r11 = r13[r7]
            boolean r11 = r10.equals(r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        L29:
            java.lang.Class r1 = r11.getClass()
            java.lang.Class[] r1 = r1.getInterfaces()
            int r9 = r1.length
            if (r9 != r8) goto L37
            r1 = r1[r7]
            goto L38
        L37:
            r1 = r5
        L38:
            java.lang.String r9 = "' is not a setter"
            if (r2 == r4) goto L48
            if (r2 != r1) goto L3f
            goto L48
        L3f:
            java.lang.String r11 = eh.a.n(r6, r0, r9)
            ah.a.w(r11)
            r11 = 0
            return r11
        L48:
            java.lang.String r12 = r10.getJSONFieldName(r12)
            if (r12 != 0) goto L90
            java.lang.String r12 = "set"
            boolean r12 = r0.startsWith(r12, r7)
            if (r12 == 0) goto L87
            java.lang.String r12 = r0.substring(r3)
            int r1 = r12.length()
            if (r1 == 0) goto L7c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r12.charAt(r7)
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.append(r1)
            java.lang.String r12 = r12.substring(r8)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            goto L90
        L7c:
            java.lang.String r11 = "' is an illegal setter"
            java.lang.String r11 = eh.a.n(r6, r0, r11)
            ah.a.w(r11)
            r11 = 0
            return r11
        L87:
            java.lang.String r11 = eh.a.n(r6, r0, r9)
            ah.a.w(r11)
            r11 = 0
            return r11
        L90:
            r13 = r13[r7]
            r10.put(r12, r13)
            if (r2 == r4) goto L98
            return r11
        L98:
            return r5
        L99:
            if (r1 != 0) goto L1c3
            java.lang.String r11 = "' is not a getter"
            if (r2 == r4) goto L1ba
            java.lang.String r13 = r10.getJSONFieldName(r12)
            if (r13 != 0) goto L198
            java.lang.String r13 = "get"
            boolean r13 = r0.startsWith(r13, r7)
            java.lang.String r1 = "' is an illegal getter"
            if (r13 != 0) goto Lb8
            java.lang.String r13 = "with"
            boolean r13 = r0.startsWith(r13, r7)
            if (r13 == 0) goto Lfa
            goto Lb9
        Lb8:
            r13 = r7
        Lb9:
            int r4 = r0.length()
            if (r13 == 0) goto Lc0
            r3 = 4
        Lc0:
            if (r4 <= r3) goto Lfa
            int r11 = r0.length()
            int r11 = r11 - r3
            char[] r11 = new char[r11]
            int r13 = r0.length()
            r0.getChars(r3, r13, r11, r7)
            char r13 = r11[r7]
            r3 = 65
            if (r13 < r3) goto Ldf
            r3 = 90
            if (r13 > r3) goto Ldf
            int r13 = r13 + 32
            char r13 = (char) r13
            r11[r7] = r13
        Ldf:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r11)
            boolean r11 = r13.isEmpty()
            if (r11 != 0) goto Lf1
            java.lang.Object r11 = r10.get(r13)
            if (r11 != 0) goto L19f
            return r5
        Lf1:
            java.lang.String r11 = eh.a.n(r6, r0, r1)
            ah.a.w(r11)
            r11 = 0
            return r11
        Lfa:
            java.lang.String r13 = "is"
            boolean r13 = r0.startsWith(r13, r7)
            if (r13 == 0) goto L153
            java.lang.String r11 = "isEmpty"
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L11b
            java.lang.String r11 = "empty"
            java.lang.Object r11 = r10.get(r11)
            if (r11 != 0) goto L19f
            boolean r11 = r10.isEmpty()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        L11b:
            r11 = 2
            java.lang.String r11 = r0.substring(r11)
            boolean r13 = r11.isEmpty()
            if (r13 != 0) goto L14a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            char r0 = r11.charAt(r7)
            char r0 = java.lang.Character.toLowerCase(r0)
            r13.append(r0)
            java.lang.String r11 = r11.substring(r8)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            java.lang.Object r11 = r10.get(r11)
            if (r11 != 0) goto L19f
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        L14a:
            java.lang.String r11 = eh.a.n(r6, r0, r1)
            ah.a.w(r11)
            r11 = 0
            return r11
        L153:
            java.lang.String r12 = "hashCode"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L164
            int r11 = r10.hashCode()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            return r11
        L164:
            java.lang.String r12 = "toString"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L171
            java.lang.String r11 = r10.toString()
            return r11
        L171:
            java.lang.String r12 = "entrySet"
            boolean r12 = r0.startsWith(r12, r7)
            if (r12 == 0) goto L17e
            java.util.Set r11 = r10.entrySet()
            return r11
        L17e:
            java.lang.String r12 = "size"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L18f
            int r11 = r10.size()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            return r11
        L18f:
            java.lang.String r11 = eh.a.n(r6, r0, r11)
            ah.a.w(r11)
            r11 = 0
            return r11
        L198:
            java.lang.Object r11 = r10.get(r13)
            if (r11 != 0) goto L19f
            return r5
        L19f:
            boolean r13 = r2.isInstance(r11)
            if (r13 != 0) goto L1b9
            com.alibaba.fastjson2.reader.ObjectReaderProvider r13 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Class r0 = r11.getClass()
            java.lang.reflect.Type r12 = r12.getGenericReturnType()
            java.util.function.Function r12 = r13.getTypeConvert(r0, r12)
            if (r12 == 0) goto L1b9
            java.lang.Object r11 = r12.apply(r11)
        L1b9:
            return r11
        L1ba:
            java.lang.String r11 = eh.a.n(r6, r0, r11)
            ah.a.w(r11)
            r11 = 0
            return r11
        L1c3:
            java.lang.String r11 = r12.toGenericString()
            j8.o.w(r11)
            r11 = 0
            return r11
    }

    public void nameFilter(com.alibaba.fastjson2.filter.NameFilter r1) {
            r0 = this;
            nameFilter(r0, r1)
            return
    }

    public com.alibaba.fastjson2.JSONArray putArray(java.lang.String r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONArray r0 = new com.alibaba.fastjson2.JSONArray
            r0.<init>()
            r1.put(r2, r0)
            return r0
    }

    public com.alibaba.fastjson2.JSONObject putObject(java.lang.String r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONObject r0 = new com.alibaba.fastjson2.JSONObject
            r0.<init>()
            r1.put(r2, r0)
            return r0
    }

    public <T> T to(com.alibaba.fastjson2.TypeReference<T> r1, com.alibaba.fastjson2.JSONReader.Feature... r2) {
            r0 = this;
            java.lang.reflect.Type r1 = r1.getType()
            java.lang.Object r1 = r0.to(r1, r2)
            return r1
    }

    public <T> T to(java.lang.Class<T> r5, com.alibaba.fastjson2.JSONReader.Feature... r6) {
            r4 = this;
            long r0 = com.alibaba.fastjson2.JSONFactory.defaultReaderFeatures
            long r2 = com.alibaba.fastjson2.JSONReader.Feature.of(r6)
            long r0 = r0 | r2
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            boolean r6 = r6.isEnabled(r0)
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r5 != r2) goto L16
            java.lang.String r5 = r4.toString()
            return r5
        L16:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.reader.ObjectReader r5 = r2.getObjectReader(r5, r6)
            java.lang.Object r5 = r5.createInstance(r4, r0)
            return r5
    }

    public <T> T to(java.lang.reflect.Type r8, com.alibaba.fastjson2.JSONReader.Feature... r9) {
            r7 = this;
            int r0 = r9.length
            r1 = 0
            r3 = 0
            r4 = r3
        L5:
            if (r3 >= r0) goto L14
            r5 = r9[r3]
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            if (r5 != r6) goto Le
            r4 = 1
        Le:
            long r5 = r5.mask
            long r1 = r1 | r5
            int r3 = r3 + 1
            goto L5
        L14:
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            if (r8 != r9) goto L1d
            java.lang.String r8 = r7.toString()
            return r8
        L1d:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r9 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.reader.ObjectReader r8 = r9.getObjectReader(r8, r4)
            java.lang.Object r8 = r8.createInstance(r7, r1)
            return r8
    }

    public <T> T to(java.util.function.Function<com.alibaba.fastjson2.JSONObject, T> r1) {
            r0 = this;
            java.lang.Object r1 = r1.apply(r0)
            return r1
    }

    public byte[] toJSONBBytes(com.alibaba.fastjson2.JSONWriter.Feature... r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONWriter r2 = com.alibaba.fastjson2.JSONWriter.ofJSONB(r2)
            r2.setRootObject(r1)     // Catch: java.lang.Throwable -> L12
            r2.write(r1)     // Catch: java.lang.Throwable -> L12
            byte[] r0 = r2.getBytes()     // Catch: java.lang.Throwable -> L12
            r2.close()
            return r0
        L12:
            r0 = move-exception
            if (r2 == 0) goto L1d
            r2.close()     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r2 = move-exception
            r0.addSuppressed(r2)
        L1d:
            throw r0
    }

    public java.lang.String toJSONString(com.alibaba.fastjson2.JSONWriter.Feature... r1) {
            r0 = this;
            java.lang.String r1 = r0.toString(r1)
            return r1
    }

    public <T> T toJavaObject(com.alibaba.fastjson2.TypeReference<T> r1, com.alibaba.fastjson2.JSONReader.Feature... r2) {
            r0 = this;
            java.lang.Object r1 = r0.to(r1, r2)
            return r1
    }

    public <T> T toJavaObject(java.lang.Class<T> r8, com.alibaba.fastjson2.JSONReader.Feature... r9) {
            r7 = this;
            int r0 = r9.length
            r1 = 0
            r3 = 0
            r4 = r3
        L5:
            if (r3 >= r0) goto L14
            r5 = r9[r3]
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            if (r5 != r6) goto Le
            r4 = 1
        Le:
            long r5 = r5.mask
            long r1 = r1 | r5
            int r3 = r3 + 1
            goto L5
        L14:
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            if (r8 != r9) goto L1d
            java.lang.String r8 = r7.toString()
            return r8
        L1d:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r9 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.reader.ObjectReader r8 = r9.getObjectReader(r8, r4)
            java.lang.Object r8 = r8.createInstance(r7, r1)
            return r8
    }

    public <T> T toJavaObject(java.lang.reflect.Type r1, com.alibaba.fastjson2.JSONReader.Feature... r2) {
            r0 = this;
            java.lang.Object r1 = r0.to(r1, r2)
            return r1
    }

    @Override // java.util.AbstractMap
    public java.lang.String toString() {
            r2 = this;
            com.alibaba.fastjson2.JSONWriter r0 = com.alibaba.fastjson2.JSONWriter.of()
            r0.setRootObject(r2)     // Catch: java.lang.Throwable -> L12
            r0.write(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r0.close()
            return r1
        L12:
            r1 = move-exception
            if (r0 == 0) goto L1d
            r0.close()     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r0 = move-exception
            r1.addSuppressed(r0)
        L1d:
            throw r1
    }

    public java.lang.String toString(com.alibaba.fastjson2.JSONWriter.Feature... r2) {
            r1 = this;
            com.alibaba.fastjson2.JSONWriter r2 = com.alibaba.fastjson2.JSONWriter.of(r2)
            r2.setRootObject(r1)     // Catch: java.lang.Throwable -> L12
            r2.write(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L12
            r2.close()
            return r0
        L12:
            r0 = move-exception
            if (r2 == 0) goto L1d
            r2.close()     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r2 = move-exception
            r0.addSuppressed(r2)
        L1d:
            throw r0
    }

    public void valueFilter(com.alibaba.fastjson2.filter.ValueFilter r1) {
            r0 = this;
            valueFilter(r0, r1)
            return
    }
}
