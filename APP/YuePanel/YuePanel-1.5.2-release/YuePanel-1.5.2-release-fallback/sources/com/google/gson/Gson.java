package com.google.gson;

/* JADX INFO: loaded from: classes.dex */
public final class Gson {
    private static final java.lang.String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    final java.util.List<com.google.gson.TypeAdapterFactory> builderFactories;
    final java.util.List<com.google.gson.TypeAdapterFactory> builderHierarchyFactories;
    final boolean complexMapKeySerialization;
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;
    final java.lang.String datePattern;
    final int dateStyle;
    final com.google.gson.internal.Excluder excluder;
    final java.util.List<com.google.gson.TypeAdapterFactory> factories;
    final com.google.gson.FieldNamingStrategy fieldNamingStrategy;
    final com.google.gson.FormattingStyle formattingStyle;
    final boolean generateNonExecutableJson;
    final boolean htmlSafe;
    final java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> instanceCreators;
    private final com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    final com.google.gson.LongSerializationPolicy longSerializationPolicy;
    final com.google.gson.ToNumberStrategy numberToNumberStrategy;
    final com.google.gson.ToNumberStrategy objectToNumberStrategy;
    final java.util.List<com.google.gson.ReflectionAccessFilter> reflectionFilters;
    final boolean serializeNulls;
    final boolean serializeSpecialFloatingPointValues;
    final com.google.gson.Strictness strictness;
    private final java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>>> threadLocalAdapterResults;
    final int timeStyle;
    private final java.util.concurrent.ConcurrentMap<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>> typeTokenCache;
    final boolean useJdkUnsafe;

    public static class FutureTypeAdapter<T> extends com.google.gson.internal.bind.SerializationDelegatingTypeAdapter<T> {
        private com.google.gson.TypeAdapter<T> delegate;

        public FutureTypeAdapter() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.delegate = r0
                return
        }

        private com.google.gson.TypeAdapter<T> delegate() {
                r2 = this;
                com.google.gson.TypeAdapter<T> r0 = r2.delegate
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Adapter for type with cyclic dependency has been used before dependency has been resolved"
                r0.<init>(r1)
                throw r0
        }

        @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
        public com.google.gson.TypeAdapter<T> getSerializationDelegate() {
                r1 = this;
                com.google.gson.TypeAdapter r0 = r1.delegate()
                return r0
        }

        @Override // com.google.gson.TypeAdapter
        public T read(com.google.gson.stream.JsonReader r2) throws java.io.IOException {
                r1 = this;
                com.google.gson.TypeAdapter r0 = r1.delegate()
                java.lang.Object r2 = r0.read(r2)
                return r2
        }

        public void setDelegate(com.google.gson.TypeAdapter<T> r2) {
                r1 = this;
                com.google.gson.TypeAdapter<T> r0 = r1.delegate
                if (r0 != 0) goto L7
                r1.delegate = r2
                return
            L7:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                java.lang.String r0 = "Delegate is already set"
                r2.<init>(r0)
                throw r2
        }

        @Override // com.google.gson.TypeAdapter
        public void write(com.google.gson.stream.JsonWriter r2, T r3) throws java.io.IOException {
                r1 = this;
                com.google.gson.TypeAdapter r0 = r1.delegate()
                r0.write(r2, r3)
                return
        }
    }

    public Gson() {
            r1 = this;
            com.google.gson.GsonBuilder r0 = com.google.gson.GsonBuilder.DEFAULT
            r1.<init>(r0)
            return
    }

    public Gson(com.google.gson.GsonBuilder r5) {
            r4 = this;
            r4.<init>()
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r4.threadLocalAdapterResults = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r4.typeTokenCache = r0
            com.google.gson.internal.Excluder r0 = r5.excluder
            r4.excluder = r0
            com.google.gson.FieldNamingStrategy r0 = r5.fieldNamingPolicy
            r4.fieldNamingStrategy = r0
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r1 = r5.instanceCreators
            r0.<init>(r1)
            r4.instanceCreators = r0
            boolean r1 = r5.serializeNulls
            r4.serializeNulls = r1
            boolean r1 = r5.complexMapKeySerialization
            r4.complexMapKeySerialization = r1
            boolean r1 = r5.generateNonExecutableJson
            r4.generateNonExecutableJson = r1
            boolean r1 = r5.escapeHtmlChars
            r4.htmlSafe = r1
            com.google.gson.FormattingStyle r1 = r5.formattingStyle
            r4.formattingStyle = r1
            com.google.gson.Strictness r1 = r5.strictness
            r4.strictness = r1
            boolean r1 = r5.serializeSpecialFloatingPointValues
            r4.serializeSpecialFloatingPointValues = r1
            boolean r1 = r5.useJdkUnsafe
            r4.useJdkUnsafe = r1
            com.google.gson.LongSerializationPolicy r2 = r5.longSerializationPolicy
            r4.longSerializationPolicy = r2
            java.lang.String r2 = r5.datePattern
            r4.datePattern = r2
            int r2 = r5.dateStyle
            r4.dateStyle = r2
            int r2 = r5.timeStyle
            r4.timeStyle = r2
            java.util.List<com.google.gson.TypeAdapterFactory> r2 = r5.factories
            java.util.List r2 = com.google.gson.GsonBuilder.newImmutableList(r2)
            r4.builderFactories = r2
            java.util.List<com.google.gson.TypeAdapterFactory> r2 = r5.hierarchyFactories
            java.util.List r2 = com.google.gson.GsonBuilder.newImmutableList(r2)
            r4.builderHierarchyFactories = r2
            com.google.gson.ToNumberStrategy r2 = r5.objectToNumberStrategy
            r4.objectToNumberStrategy = r2
            com.google.gson.ToNumberStrategy r2 = r5.numberToNumberStrategy
            r4.numberToNumberStrategy = r2
            java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> r2 = r5.reflectionFilters
            java.util.List r2 = com.google.gson.GsonBuilder.newImmutableList(r2)
            r4.reflectionFilters = r2
            com.google.gson.GsonBuilder r3 = com.google.gson.GsonBuilder.DEFAULT
            if (r5 != r3) goto L83
            com.google.gson.internal.ConstructorConstructor r5 = com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR
            r4.constructorConstructor = r5
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r5 = com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY
            r4.jsonAdapterFactory = r5
            java.util.List<com.google.gson.TypeAdapterFactory> r5 = com.google.gson.GsonBuilder.DEFAULT_TYPE_ADAPTER_FACTORIES
            r4.factories = r5
            goto L97
        L83:
            com.google.gson.internal.ConstructorConstructor r3 = new com.google.gson.internal.ConstructorConstructor
            r3.<init>(r0, r1, r2)
            r4.constructorConstructor = r3
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r0 = new com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory
            r0.<init>(r3)
            r4.jsonAdapterFactory = r0
            java.util.List r5 = r5.createFactories(r3, r0)
            r4.factories = r5
        L97:
            return
    }

    private static void assertFullConsumption(java.lang.Object r0, com.google.gson.stream.JsonReader r1) {
            if (r0 == 0) goto L23
            com.google.gson.stream.JsonToken r0 = r1.peek()     // Catch: java.io.IOException -> L13 com.google.gson.stream.MalformedJsonException -> L15
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch: java.io.IOException -> L13 com.google.gson.stream.MalformedJsonException -> L15
            if (r0 != r1) goto Lb
            goto L23
        Lb:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException     // Catch: java.io.IOException -> L13 com.google.gson.stream.MalformedJsonException -> L15
            java.lang.String r1 = "JSON document was not fully consumed."
            r0.<init>(r1)     // Catch: java.io.IOException -> L13 com.google.gson.stream.MalformedJsonException -> L15
            throw r0     // Catch: java.io.IOException -> L13 com.google.gson.stream.MalformedJsonException -> L15
        L13:
            r0 = move-exception
            goto L17
        L15:
            r0 = move-exception
            goto L1d
        L17:
            com.google.gson.JsonIOException r1 = new com.google.gson.JsonIOException
            r1.<init>(r0)
            throw r1
        L1d:
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException
            r1.<init>(r0)
            throw r1
        L23:
            return
    }

    @java.lang.Deprecated
    public com.google.gson.internal.Excluder excluder() {
            r1 = this;
            com.google.gson.internal.Excluder r0 = r1.excluder
            return r0
    }

    public com.google.gson.FieldNamingStrategy fieldNamingStrategy() {
            r1 = this;
            com.google.gson.FieldNamingStrategy r0 = r1.fieldNamingStrategy
            return r0
    }

    public <T> T fromJson(com.google.gson.JsonElement r2, com.google.gson.reflect.TypeToken<T> r3) throws com.google.gson.JsonSyntaxException {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.google.gson.internal.bind.JsonTreeReader r0 = new com.google.gson.internal.bind.JsonTreeReader
            r0.<init>(r2)
            java.lang.Object r2 = r1.fromJson(r0, r3)
            return r2
    }

    public <T> T fromJson(com.google.gson.JsonElement r1, java.lang.Class<T> r2) throws com.google.gson.JsonSyntaxException {
            r0 = this;
            com.google.gson.reflect.TypeToken r2 = com.google.gson.reflect.TypeToken.get(r2)
            java.lang.Object r1 = r0.fromJson(r1, r2)
            return r1
    }

    public <T> T fromJson(com.google.gson.JsonElement r1, java.lang.reflect.Type r2) throws com.google.gson.JsonSyntaxException {
            r0 = this;
            com.google.gson.reflect.TypeToken r2 = com.google.gson.reflect.TypeToken.get(r2)
            java.lang.Object r1 = r0.fromJson(r1, r2)
            return r1
    }

    public <T> T fromJson(com.google.gson.stream.JsonReader r8, com.google.gson.reflect.TypeToken<T> r9) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            r7 = this;
            com.google.gson.Strictness r0 = r8.getStrictness()
            com.google.gson.Strictness r1 = r7.strictness
            if (r1 == 0) goto Lc
            r8.setStrictness(r1)
            goto L19
        Lc:
            com.google.gson.Strictness r1 = r8.getStrictness()
            com.google.gson.Strictness r2 = com.google.gson.Strictness.LEGACY_STRICT
            if (r1 != r2) goto L19
            com.google.gson.Strictness r1 = com.google.gson.Strictness.LENIENT
            r8.setStrictness(r1)
        L19:
            r8.peek()     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L9f
            r1 = 0
            com.google.gson.TypeAdapter r2 = r7.getAdapter(r9)     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            java.lang.Object r3 = r2.read(r8)     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            java.lang.Class r4 = r9.getRawType()     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            java.lang.Class r4 = com.google.gson.internal.Primitives.wrap(r4)     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            if (r3 == 0) goto L74
            boolean r4 = r4.isInstance(r3)     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            if (r4 == 0) goto L36
            goto L74
        L36:
            java.lang.ClassCastException r4 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            r5.<init>()     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            java.lang.String r6 = "Type adapter '"
            r5.append(r6)     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            r5.append(r2)     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            java.lang.String r2 = "' returned wrong type; requested "
            r5.append(r2)     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            java.lang.Class r9 = r9.getRawType()     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            r5.append(r9)     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            java.lang.String r9 = " but got instance of "
            r5.append(r9)     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            java.lang.Class r9 = r3.getClass()     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            r5.append(r9)     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            java.lang.String r9 = "\nVerify that the adapter was registered for the correct type."
            r5.append(r9)     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            java.lang.String r9 = r5.toString()     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            r4.<init>(r9)     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
            throw r4     // Catch: java.lang.Throwable -> L6a java.lang.AssertionError -> L6c java.io.IOException -> L6e java.lang.IllegalStateException -> L70 java.io.EOFException -> L72
        L6a:
            r9 = move-exception
            goto Lae
        L6c:
            r9 = move-exception
            goto L78
        L6e:
            r9 = move-exception
            goto L93
        L70:
            r9 = move-exception
            goto L99
        L72:
            r9 = move-exception
            goto La1
        L74:
            r8.setStrictness(r0)
            return r3
        L78:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L6a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a
            r2.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r3 = "AssertionError (GSON 2.14.0): "
            r2.append(r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r3 = r9.getMessage()     // Catch: java.lang.Throwable -> L6a
            r2.append(r3)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r2, r9)     // Catch: java.lang.Throwable -> L6a
            throw r1     // Catch: java.lang.Throwable -> L6a
        L93:
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L6a
            throw r1     // Catch: java.lang.Throwable -> L6a
        L99:
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L6a
            throw r1     // Catch: java.lang.Throwable -> L6a
        L9f:
            r9 = move-exception
            r1 = 1
        La1:
            if (r1 == 0) goto La8
            r8.setStrictness(r0)
            r8 = 0
            return r8
        La8:
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L6a
            throw r1     // Catch: java.lang.Throwable -> L6a
        Lae:
            r8.setStrictness(r0)
            throw r9
    }

    public <T> T fromJson(com.google.gson.stream.JsonReader r1, java.lang.reflect.Type r2) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            r0 = this;
            com.google.gson.reflect.TypeToken r2 = com.google.gson.reflect.TypeToken.get(r2)
            java.lang.Object r1 = r0.fromJson(r1, r2)
            return r1
    }

    public <T> T fromJson(java.io.Reader r1, com.google.gson.reflect.TypeToken<T> r2) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            r0 = this;
            com.google.gson.stream.JsonReader r1 = r0.newJsonReader(r1)
            java.lang.Object r2 = r0.fromJson(r1, r2)
            assertFullConsumption(r2, r1)
            return r2
    }

    public <T> T fromJson(java.io.Reader r1, java.lang.Class<T> r2) throws com.google.gson.JsonSyntaxException, com.google.gson.JsonIOException {
            r0 = this;
            com.google.gson.reflect.TypeToken r2 = com.google.gson.reflect.TypeToken.get(r2)
            java.lang.Object r1 = r0.fromJson(r1, r2)
            return r1
    }

    public <T> T fromJson(java.io.Reader r1, java.lang.reflect.Type r2) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            r0 = this;
            com.google.gson.reflect.TypeToken r2 = com.google.gson.reflect.TypeToken.get(r2)
            java.lang.Object r1 = r0.fromJson(r1, r2)
            return r1
    }

    public <T> T fromJson(java.lang.String r2, com.google.gson.reflect.TypeToken<T> r3) throws com.google.gson.JsonSyntaxException {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r2)
            java.lang.Object r2 = r1.fromJson(r0, r3)
            return r2
    }

    public <T> T fromJson(java.lang.String r1, java.lang.Class<T> r2) throws com.google.gson.JsonSyntaxException {
            r0 = this;
            com.google.gson.reflect.TypeToken r2 = com.google.gson.reflect.TypeToken.get(r2)
            java.lang.Object r1 = r0.fromJson(r1, r2)
            return r1
    }

    public <T> T fromJson(java.lang.String r1, java.lang.reflect.Type r2) throws com.google.gson.JsonSyntaxException {
            r0 = this;
            com.google.gson.reflect.TypeToken r2 = com.google.gson.reflect.TypeToken.get(r2)
            java.lang.Object r1 = r0.fromJson(r1, r2)
            return r1
    }

    public <T> com.google.gson.TypeAdapter<T> getAdapter(com.google.gson.reflect.TypeToken<T> r7) {
            r6 = this;
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>> r0 = r6.typeTokenCache
            java.lang.Object r0 = r0.get(r7)
            com.google.gson.TypeAdapter r0 = (com.google.gson.TypeAdapter) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>>> r0 = r6.threadLocalAdapterResults
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L26
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>>> r1 = r6.threadLocalAdapterResults
            r1.set(r0)
            r1 = 1
            goto L30
        L26:
            java.lang.Object r1 = r0.get(r7)
            com.google.gson.TypeAdapter r1 = (com.google.gson.TypeAdapter) r1
            if (r1 == 0) goto L2f
            return r1
        L2f:
            r1 = 0
        L30:
            com.google.gson.Gson$FutureTypeAdapter r2 = new com.google.gson.Gson$FutureTypeAdapter     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L58
            java.util.List<com.google.gson.TypeAdapterFactory> r3 = r6.factories     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L58
            r4 = 0
        L3f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L5a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L58
            com.google.gson.TypeAdapterFactory r4 = (com.google.gson.TypeAdapterFactory) r4     // Catch: java.lang.Throwable -> L58
            com.google.gson.TypeAdapter r4 = r4.create(r6, r7)     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L3f
            r2.setDelegate(r4)     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r7 = move-exception
            goto L82
        L5a:
            if (r1 == 0) goto L61
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>>> r2 = r6.threadLocalAdapterResults
            r2.remove()
        L61:
            if (r4 == 0) goto L6b
            if (r1 == 0) goto L6a
            java.util.concurrent.ConcurrentMap<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>> r7 = r6.typeTokenCache
            r7.putAll(r0)
        L6a:
            return r4
        L6b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "GSON (2.14.0) cannot handle "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L82:
            if (r1 == 0) goto L89
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>>> r0 = r6.threadLocalAdapterResults
            r0.remove()
        L89:
            throw r7
    }

    public <T> com.google.gson.TypeAdapter<T> getAdapter(java.lang.Class<T> r1) {
            r0 = this;
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            com.google.gson.TypeAdapter r1 = r0.getAdapter(r1)
            return r1
    }

    public <T> com.google.gson.TypeAdapter<T> getDelegateAdapter(com.google.gson.TypeAdapterFactory r4, com.google.gson.reflect.TypeToken<T> r5) {
            r3 = this;
            java.lang.String r0 = "skipPast must not be null"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r5, r0)
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r0 = r3.jsonAdapterFactory
            boolean r0 = r0.isClassJsonAdapterFactory(r5, r4)
            if (r0 == 0) goto L14
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r4 = r3.jsonAdapterFactory
        L14:
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r3.factories
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L1b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r0.next()
            com.google.gson.TypeAdapterFactory r2 = (com.google.gson.TypeAdapterFactory) r2
            if (r1 != 0) goto L2d
            if (r2 != r4) goto L1b
            r1 = 1
            goto L1b
        L2d:
            com.google.gson.TypeAdapter r2 = r2.create(r3, r5)
            if (r2 == 0) goto L1b
            return r2
        L34:
            if (r1 != 0) goto L3b
            com.google.gson.TypeAdapter r4 = r3.getAdapter(r5)
            return r4
        L3b:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "GSON cannot serialize or deserialize "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
    }

    public boolean htmlSafe() {
            r1 = this;
            boolean r0 = r1.htmlSafe
            return r0
    }

    public com.google.gson.GsonBuilder newBuilder() {
            r1 = this;
            com.google.gson.GsonBuilder r0 = new com.google.gson.GsonBuilder
            r0.<init>(r1)
            return r0
    }

    public com.google.gson.stream.JsonReader newJsonReader(java.io.Reader r2) {
            r1 = this;
            com.google.gson.stream.JsonReader r0 = new com.google.gson.stream.JsonReader
            r0.<init>(r2)
            com.google.gson.Strictness r2 = r1.strictness
            if (r2 != 0) goto Lb
            com.google.gson.Strictness r2 = com.google.gson.Strictness.LEGACY_STRICT
        Lb:
            r0.setStrictness(r2)
            return r0
    }

    public com.google.gson.stream.JsonWriter newJsonWriter(java.io.Writer r2) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.generateNonExecutableJson
            if (r0 == 0) goto L9
            java.lang.String r0 = ")]}'\n"
            r2.write(r0)
        L9:
            com.google.gson.stream.JsonWriter r0 = new com.google.gson.stream.JsonWriter
            r0.<init>(r2)
            com.google.gson.FormattingStyle r2 = r1.formattingStyle
            r0.setFormattingStyle(r2)
            boolean r2 = r1.htmlSafe
            r0.setHtmlSafe(r2)
            com.google.gson.Strictness r2 = r1.strictness
            if (r2 != 0) goto L1e
            com.google.gson.Strictness r2 = com.google.gson.Strictness.LEGACY_STRICT
        L1e:
            r0.setStrictness(r2)
            boolean r2 = r1.serializeNulls
            r0.setSerializeNulls(r2)
            return r0
    }

    public boolean serializeNulls() {
            r1 = this;
            boolean r0 = r1.serializeNulls
            return r0
    }

    public java.lang.String toJson(com.google.gson.JsonElement r2) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.toJson(r2, r0)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public java.lang.String toJson(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L9
            com.google.gson.JsonNull r2 = com.google.gson.JsonNull.INSTANCE
            java.lang.String r2 = r1.toJson(r2)
            return r2
        L9:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r2 = r1.toJson(r2, r0)
            return r2
    }

    public java.lang.String toJson(java.lang.Object r2, java.lang.reflect.Type r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.toJson(r2, r3, r0)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public void toJson(com.google.gson.JsonElement r7, com.google.gson.stream.JsonWriter r8) throws com.google.gson.JsonIOException {
            r6 = this;
            com.google.gson.Strictness r0 = r8.getStrictness()
            boolean r1 = r8.isHtmlSafe()
            boolean r2 = r8.getSerializeNulls()
            boolean r3 = r6.htmlSafe
            r8.setHtmlSafe(r3)
            boolean r3 = r6.serializeNulls
            r8.setSerializeNulls(r3)
            com.google.gson.Strictness r3 = r6.strictness
            if (r3 == 0) goto L1e
            r8.setStrictness(r3)
            goto L2b
        L1e:
            com.google.gson.Strictness r3 = r8.getStrictness()
            com.google.gson.Strictness r4 = com.google.gson.Strictness.LEGACY_STRICT
            if (r3 != r4) goto L2b
            com.google.gson.Strictness r3 = com.google.gson.Strictness.LENIENT
            r8.setStrictness(r3)
        L2b:
            com.google.gson.internal.Streams.write(r7, r8)     // Catch: java.lang.Throwable -> L38 java.lang.AssertionError -> L3a java.io.IOException -> L56
            r8.setStrictness(r0)
            r8.setHtmlSafe(r1)
            r8.setSerializeNulls(r2)
            return
        L38:
            r7 = move-exception
            goto L5d
        L3a:
            r7 = move-exception
            java.lang.AssertionError r3 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r4.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = "AssertionError (GSON 2.14.0): "
            r4.append(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.String r5 = r7.getMessage()     // Catch: java.lang.Throwable -> L38
            r4.append(r5)     // Catch: java.lang.Throwable -> L38
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L38
            r3.<init>(r4, r7)     // Catch: java.lang.Throwable -> L38
            throw r3     // Catch: java.lang.Throwable -> L38
        L56:
            r7 = move-exception
            com.google.gson.JsonIOException r3 = new com.google.gson.JsonIOException     // Catch: java.lang.Throwable -> L38
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L38
            throw r3     // Catch: java.lang.Throwable -> L38
        L5d:
            r8.setStrictness(r0)
            r8.setHtmlSafe(r1)
            r8.setSerializeNulls(r2)
            throw r7
    }

    public void toJson(com.google.gson.JsonElement r1, java.lang.Appendable r2) throws com.google.gson.JsonIOException {
            r0 = this;
            java.io.Writer r2 = com.google.gson.internal.Streams.writerForAppendable(r2)     // Catch: java.io.IOException -> Lc
            com.google.gson.stream.JsonWriter r2 = r0.newJsonWriter(r2)     // Catch: java.io.IOException -> Lc
            r0.toJson(r1, r2)     // Catch: java.io.IOException -> Lc
            return
        Lc:
            r1 = move-exception
            com.google.gson.JsonIOException r2 = new com.google.gson.JsonIOException
            r2.<init>(r1)
            throw r2
    }

    public void toJson(java.lang.Object r2, java.lang.Appendable r3) throws com.google.gson.JsonIOException {
            r1 = this;
            if (r2 == 0) goto La
            java.lang.Class r0 = r2.getClass()
            r1.toJson(r2, r0, r3)
            goto Lf
        La:
            com.google.gson.JsonNull r2 = com.google.gson.JsonNull.INSTANCE
            r1.toJson(r2, r3)
        Lf:
            return
    }

    public void toJson(java.lang.Object r6, java.lang.reflect.Type r7, com.google.gson.stream.JsonWriter r8) throws com.google.gson.JsonIOException {
            r5 = this;
            com.google.gson.reflect.TypeToken r7 = com.google.gson.reflect.TypeToken.get(r7)
            com.google.gson.TypeAdapter r7 = r5.getAdapter(r7)
            com.google.gson.Strictness r0 = r8.getStrictness()
            com.google.gson.Strictness r1 = r5.strictness
            if (r1 == 0) goto L14
            r8.setStrictness(r1)
            goto L21
        L14:
            com.google.gson.Strictness r1 = r8.getStrictness()
            com.google.gson.Strictness r2 = com.google.gson.Strictness.LEGACY_STRICT
            if (r1 != r2) goto L21
            com.google.gson.Strictness r1 = com.google.gson.Strictness.LENIENT
            r8.setStrictness(r1)
        L21:
            boolean r1 = r8.isHtmlSafe()
            boolean r2 = r8.getSerializeNulls()
            boolean r3 = r5.htmlSafe
            r8.setHtmlSafe(r3)
            boolean r3 = r5.serializeNulls
            r8.setSerializeNulls(r3)
            r7.write(r8, r6)     // Catch: java.lang.Throwable -> L40 java.lang.AssertionError -> L42 java.io.IOException -> L5e
            r8.setStrictness(r0)
            r8.setHtmlSafe(r1)
            r8.setSerializeNulls(r2)
            return
        L40:
            r6 = move-exception
            goto L65
        L42:
            r6 = move-exception
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r3.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = "AssertionError (GSON 2.14.0): "
            r3.append(r4)     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = r6.getMessage()     // Catch: java.lang.Throwable -> L40
            r3.append(r4)     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L40
            r7.<init>(r3, r6)     // Catch: java.lang.Throwable -> L40
            throw r7     // Catch: java.lang.Throwable -> L40
        L5e:
            r6 = move-exception
            com.google.gson.JsonIOException r7 = new com.google.gson.JsonIOException     // Catch: java.lang.Throwable -> L40
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L40
            throw r7     // Catch: java.lang.Throwable -> L40
        L65:
            r8.setStrictness(r0)
            r8.setHtmlSafe(r1)
            r8.setSerializeNulls(r2)
            throw r6
    }

    public void toJson(java.lang.Object r1, java.lang.reflect.Type r2, java.lang.Appendable r3) throws com.google.gson.JsonIOException {
            r0 = this;
            java.io.Writer r3 = com.google.gson.internal.Streams.writerForAppendable(r3)     // Catch: java.io.IOException -> Lc
            com.google.gson.stream.JsonWriter r3 = r0.newJsonWriter(r3)     // Catch: java.io.IOException -> Lc
            r0.toJson(r1, r2, r3)     // Catch: java.io.IOException -> Lc
            return
        Lc:
            r1 = move-exception
            com.google.gson.JsonIOException r2 = new com.google.gson.JsonIOException
            r2.<init>(r1)
            throw r2
    }

    public com.google.gson.JsonElement toJsonTree(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L5
            com.google.gson.JsonNull r2 = com.google.gson.JsonNull.INSTANCE
            return r2
        L5:
            java.lang.Class r0 = r2.getClass()
            com.google.gson.JsonElement r2 = r1.toJsonTree(r2, r0)
            return r2
    }

    public com.google.gson.JsonElement toJsonTree(java.lang.Object r2, java.lang.reflect.Type r3) {
            r1 = this;
            com.google.gson.internal.bind.JsonTreeWriter r0 = new com.google.gson.internal.bind.JsonTreeWriter
            r0.<init>()
            r1.toJson(r2, r3, r0)
            com.google.gson.JsonElement r2 = r0.get()
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{serializeNulls:"
            r0.append(r1)
            boolean r1 = r2.serializeNulls
            r0.append(r1)
            java.lang.String r1 = ",factories:"
            r0.append(r1)
            java.util.List<com.google.gson.TypeAdapterFactory> r1 = r2.factories
            r0.append(r1)
            java.lang.String r1 = ",instanceCreators:"
            r0.append(r1)
            com.google.gson.internal.ConstructorConstructor r1 = r2.constructorConstructor
            r0.append(r1)
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
