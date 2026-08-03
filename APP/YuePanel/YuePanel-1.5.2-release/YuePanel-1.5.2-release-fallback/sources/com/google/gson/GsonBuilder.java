package com.google.gson;

/* JADX INFO: loaded from: classes.dex */
public final class GsonBuilder {
    static final com.google.gson.GsonBuilder DEFAULT = null;
    private static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    static final com.google.gson.internal.ConstructorConstructor DEFAULT_CONSTRUCTOR_CONSTRUCTOR = null;
    private static final java.lang.String DEFAULT_DATE_PATTERN = null;
    private static final boolean DEFAULT_ESCAPE_HTML = true;
    private static final com.google.gson.FieldNamingStrategy DEFAULT_FIELD_NAMING_STRATEGY = null;
    private static final com.google.gson.FormattingStyle DEFAULT_FORMATTING_STYLE = null;
    static final com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY = null;
    private static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    private static final com.google.gson.ToNumberStrategy DEFAULT_NUMBER_TO_NUMBER_STRATEGY = null;
    private static final com.google.gson.ToNumberStrategy DEFAULT_OBJECT_TO_NUMBER_STRATEGY = null;
    private static final boolean DEFAULT_SERIALIZE_NULLS = false;
    private static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    private static final com.google.gson.Strictness DEFAULT_STRICTNESS = null;
    static final java.util.List<com.google.gson.TypeAdapterFactory> DEFAULT_TYPE_ADAPTER_FACTORIES = null;
    private static final boolean DEFAULT_USE_JDK_UNSAFE = true;
    boolean complexMapKeySerialization;
    java.lang.String datePattern;
    int dateStyle;
    boolean escapeHtmlChars;
    com.google.gson.internal.Excluder excluder;
    final java.util.List<com.google.gson.TypeAdapterFactory> factories;
    com.google.gson.FieldNamingStrategy fieldNamingPolicy;
    com.google.gson.FormattingStyle formattingStyle;
    boolean generateNonExecutableJson;
    final java.util.List<com.google.gson.TypeAdapterFactory> hierarchyFactories;
    final java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> instanceCreators;
    com.google.gson.LongSerializationPolicy longSerializationPolicy;
    com.google.gson.ToNumberStrategy numberToNumberStrategy;
    com.google.gson.ToNumberStrategy objectToNumberStrategy;
    final java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> reflectionFilters;
    boolean serializeNulls;
    boolean serializeSpecialFloatingPointValues;
    com.google.gson.Strictness strictness;
    int timeStyle;
    boolean useJdkUnsafe;

    static {
            com.google.gson.FormattingStyle r0 = com.google.gson.FormattingStyle.COMPACT
            com.google.gson.GsonBuilder.DEFAULT_FORMATTING_STYLE = r0
            r0 = 0
            com.google.gson.GsonBuilder.DEFAULT_DATE_PATTERN = r0
            com.google.gson.FieldNamingPolicy r0 = com.google.gson.FieldNamingPolicy.IDENTITY
            com.google.gson.GsonBuilder.DEFAULT_FIELD_NAMING_STRATEGY = r0
            com.google.gson.ToNumberPolicy r0 = com.google.gson.ToNumberPolicy.DOUBLE
            com.google.gson.GsonBuilder.DEFAULT_OBJECT_TO_NUMBER_STRATEGY = r0
            com.google.gson.ToNumberPolicy r0 = com.google.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER
            com.google.gson.GsonBuilder.DEFAULT_NUMBER_TO_NUMBER_STRATEGY = r0
            com.google.gson.internal.ConstructorConstructor r0 = new com.google.gson.internal.ConstructorConstructor
            java.util.Map r1 = java.util.Collections.emptyMap()
            r2 = 1
            java.util.List r3 = java.util.Collections.emptyList()
            r0.<init>(r1, r2, r3)
            com.google.gson.GsonBuilder.DEFAULT_CONSTRUCTOR_CONSTRUCTOR = r0
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r1 = new com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory
            r1.<init>(r0)
            com.google.gson.GsonBuilder.DEFAULT_JSON_ADAPTER_ANNOTATION_TYPE_ADAPTER_FACTORY = r1
            com.google.gson.GsonBuilder r2 = new com.google.gson.GsonBuilder
            r2.<init>()
            com.google.gson.GsonBuilder.DEFAULT = r2
            java.util.List r0 = r2.createFactories(r0, r1)
            com.google.gson.GsonBuilder.DEFAULT_TYPE_ADAPTER_FACTORIES = r0
            return
    }

    public GsonBuilder() {
            r3 = this;
            r3.<init>()
            com.google.gson.internal.Excluder r0 = com.google.gson.internal.Excluder.DEFAULT
            r3.excluder = r0
            com.google.gson.LongSerializationPolicy r0 = com.google.gson.LongSerializationPolicy.DEFAULT
            r3.longSerializationPolicy = r0
            com.google.gson.FieldNamingStrategy r0 = com.google.gson.GsonBuilder.DEFAULT_FIELD_NAMING_STRATEGY
            r3.fieldNamingPolicy = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.instanceCreators = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.factories = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.hierarchyFactories = r0
            r0 = 0
            r3.serializeNulls = r0
            java.lang.String r1 = com.google.gson.GsonBuilder.DEFAULT_DATE_PATTERN
            r3.datePattern = r1
            r1 = 2
            r3.dateStyle = r1
            r3.timeStyle = r1
            r3.complexMapKeySerialization = r0
            r3.serializeSpecialFloatingPointValues = r0
            r1 = 1
            r3.escapeHtmlChars = r1
            com.google.gson.FormattingStyle r2 = com.google.gson.GsonBuilder.DEFAULT_FORMATTING_STYLE
            r3.formattingStyle = r2
            r3.generateNonExecutableJson = r0
            com.google.gson.Strictness r0 = com.google.gson.GsonBuilder.DEFAULT_STRICTNESS
            r3.strictness = r0
            r3.useJdkUnsafe = r1
            com.google.gson.ToNumberStrategy r0 = com.google.gson.GsonBuilder.DEFAULT_OBJECT_TO_NUMBER_STRATEGY
            r3.objectToNumberStrategy = r0
            com.google.gson.ToNumberStrategy r0 = com.google.gson.GsonBuilder.DEFAULT_NUMBER_TO_NUMBER_STRATEGY
            r3.numberToNumberStrategy = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.reflectionFilters = r0
            return
    }

    public GsonBuilder(com.google.gson.Gson r7) {
            r6 = this;
            r6.<init>()
            com.google.gson.internal.Excluder r0 = com.google.gson.internal.Excluder.DEFAULT
            r6.excluder = r0
            com.google.gson.LongSerializationPolicy r0 = com.google.gson.LongSerializationPolicy.DEFAULT
            r6.longSerializationPolicy = r0
            com.google.gson.FieldNamingStrategy r0 = com.google.gson.GsonBuilder.DEFAULT_FIELD_NAMING_STRATEGY
            r6.fieldNamingPolicy = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.instanceCreators = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.factories = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r6.hierarchyFactories = r2
            r3 = 0
            r6.serializeNulls = r3
            java.lang.String r4 = com.google.gson.GsonBuilder.DEFAULT_DATE_PATTERN
            r6.datePattern = r4
            r4 = 2
            r6.dateStyle = r4
            r6.timeStyle = r4
            r6.complexMapKeySerialization = r3
            r6.serializeSpecialFloatingPointValues = r3
            r4 = 1
            r6.escapeHtmlChars = r4
            com.google.gson.FormattingStyle r5 = com.google.gson.GsonBuilder.DEFAULT_FORMATTING_STYLE
            r6.formattingStyle = r5
            r6.generateNonExecutableJson = r3
            com.google.gson.Strictness r3 = com.google.gson.GsonBuilder.DEFAULT_STRICTNESS
            r6.strictness = r3
            r6.useJdkUnsafe = r4
            com.google.gson.ToNumberStrategy r3 = com.google.gson.GsonBuilder.DEFAULT_OBJECT_TO_NUMBER_STRATEGY
            r6.objectToNumberStrategy = r3
            com.google.gson.ToNumberStrategy r3 = com.google.gson.GsonBuilder.DEFAULT_NUMBER_TO_NUMBER_STRATEGY
            r6.numberToNumberStrategy = r3
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            r6.reflectionFilters = r3
            com.google.gson.internal.Excluder r4 = r7.excluder
            r6.excluder = r4
            com.google.gson.FieldNamingStrategy r4 = r7.fieldNamingStrategy
            r6.fieldNamingPolicy = r4
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r4 = r7.instanceCreators
            r0.putAll(r4)
            boolean r0 = r7.serializeNulls
            r6.serializeNulls = r0
            boolean r0 = r7.complexMapKeySerialization
            r6.complexMapKeySerialization = r0
            boolean r0 = r7.generateNonExecutableJson
            r6.generateNonExecutableJson = r0
            boolean r0 = r7.htmlSafe
            r6.escapeHtmlChars = r0
            com.google.gson.FormattingStyle r0 = r7.formattingStyle
            r6.formattingStyle = r0
            com.google.gson.Strictness r0 = r7.strictness
            r6.strictness = r0
            boolean r0 = r7.serializeSpecialFloatingPointValues
            r6.serializeSpecialFloatingPointValues = r0
            com.google.gson.LongSerializationPolicy r0 = r7.longSerializationPolicy
            r6.longSerializationPolicy = r0
            java.lang.String r0 = r7.datePattern
            r6.datePattern = r0
            int r0 = r7.dateStyle
            r6.dateStyle = r0
            int r0 = r7.timeStyle
            r6.timeStyle = r0
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r7.builderFactories
            r1.addAll(r0)
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r7.builderHierarchyFactories
            r2.addAll(r0)
            boolean r0 = r7.useJdkUnsafe
            r6.useJdkUnsafe = r0
            com.google.gson.ToNumberStrategy r0 = r7.objectToNumberStrategy
            r6.objectToNumberStrategy = r0
            com.google.gson.ToNumberStrategy r0 = r7.numberToNumberStrategy
            r6.numberToNumberStrategy = r0
            java.util.List<com.google.gson.ReflectionAccessFilter> r7 = r7.reflectionFilters
            r3.addAll(r7)
            return
    }

    private void addDateTypeAdapters(java.util.List<com.google.gson.TypeAdapterFactory> r7) {
            r6 = this;
            boolean r0 = com.google.gson.internal.sql.SqlTypesSupport.SUPPORTS_SQL_TYPES
            java.lang.String r1 = r6.datePattern
            r2 = 0
            if (r1 == 0) goto L2e
            java.lang.String r1 = r1.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L2e
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<java.util.Date> r1 = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE
            java.lang.String r3 = r6.datePattern
            com.google.gson.TypeAdapterFactory r1 = r1.createAdapterFactory(r3)
            if (r0 == 0) goto L2c
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r2 = com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE
            java.lang.String r3 = r6.datePattern
            com.google.gson.TypeAdapterFactory r2 = r2.createAdapterFactory(r3)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r3 = com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE
            java.lang.String r4 = r6.datePattern
            com.google.gson.TypeAdapterFactory r3 = r3.createAdapterFactory(r4)
            goto L57
        L2c:
            r3 = r2
            goto L57
        L2e:
            int r1 = r6.dateStyle
            r3 = 2
            if (r1 != r3) goto L39
            int r4 = r6.timeStyle
            if (r4 == r3) goto L38
            goto L39
        L38:
            return
        L39:
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<java.util.Date> r3 = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE
            int r4 = r6.timeStyle
            com.google.gson.TypeAdapterFactory r1 = r3.createAdapterFactory(r1, r4)
            if (r0 == 0) goto L2c
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r2 = com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE
            int r3 = r6.dateStyle
            int r4 = r6.timeStyle
            com.google.gson.TypeAdapterFactory r2 = r2.createAdapterFactory(r3, r4)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r3 = com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE
            int r4 = r6.dateStyle
            int r5 = r6.timeStyle
            com.google.gson.TypeAdapterFactory r3 = r3.createAdapterFactory(r4, r5)
        L57:
            r7.add(r1)
            if (r0 == 0) goto L62
            r7.add(r2)
            r7.add(r3)
        L62:
            return
    }

    private void addUserDefinedAdapters(java.util.List<com.google.gson.TypeAdapterFactory> r3) {
            r2 = this;
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r2.factories
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L15
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<com.google.gson.TypeAdapterFactory> r1 = r2.factories
            r0.<init>(r1)
            java.util.Collections.reverse(r0)
            r3.addAll(r0)
        L15:
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r2.hierarchyFactories
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L2a
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<com.google.gson.TypeAdapterFactory> r1 = r2.hierarchyFactories
            r0.<init>(r1)
            java.util.Collections.reverse(r0)
            r3.addAll(r0)
        L2a:
            return
    }

    private static int checkDateFormatStyle(int r3) {
            if (r3 < 0) goto L6
            r0 = 3
            if (r3 > r0) goto L6
            return r3
        L6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid style: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private com.google.gson.TypeAdapter<java.lang.Number> doubleAdapter() {
            r1 = this;
            boolean r0 = r1.serializeSpecialFloatingPointValues
            if (r0 == 0) goto L7
            com.google.gson.TypeAdapter<java.lang.Number> r0 = com.google.gson.internal.bind.TypeAdapters.DOUBLE
            goto L9
        L7:
            com.google.gson.TypeAdapter<java.lang.Number> r0 = com.google.gson.internal.bind.TypeAdapters.DOUBLE_STRICT
        L9:
            return r0
    }

    private com.google.gson.TypeAdapter<java.lang.Number> floatAdapter() {
            r1 = this;
            boolean r0 = r1.serializeSpecialFloatingPointValues
            if (r0 == 0) goto L7
            com.google.gson.TypeAdapter<java.lang.Number> r0 = com.google.gson.internal.bind.TypeAdapters.FLOAT
            goto L9
        L7:
            com.google.gson.TypeAdapter<java.lang.Number> r0 = com.google.gson.internal.bind.TypeAdapters.FLOAT_STRICT
        L9:
            return r0
    }

    private static boolean hasNonOverridableAdapter(java.lang.reflect.Type r1) {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 != r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    public static <E> java.util.List<E> newImmutableList(java.util.Collection<E> r2) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            java.util.List r2 = java.util.Collections.emptyList()
            return r2
        Lb:
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L2b
            boolean r0 = r2 instanceof java.util.List
            if (r0 == 0) goto L1e
            java.util.List r2 = (java.util.List) r2
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            goto L26
        L1e:
            java.util.Iterator r2 = r2.iterator()
            java.lang.Object r2 = r2.next()
        L26:
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
        L2b:
            java.lang.Object[] r2 = r2.toArray()
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder addDeserializationExclusionStrategy(com.google.gson.ExclusionStrategy r4) {
            r3 = this;
            java.util.Objects.requireNonNull(r4)
            com.google.gson.internal.Excluder r0 = r3.excluder
            r1 = 0
            r2 = 1
            com.google.gson.internal.Excluder r4 = r0.withExclusionStrategy(r4, r1, r2)
            r3.excluder = r4
            return r3
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder addReflectionAccessFilter(com.google.gson.ReflectionAccessFilter r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> r0 = r1.reflectionFilters
            r0.addFirst(r2)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder addSerializationExclusionStrategy(com.google.gson.ExclusionStrategy r4) {
            r3 = this;
            java.util.Objects.requireNonNull(r4)
            com.google.gson.internal.Excluder r0 = r3.excluder
            r1 = 1
            r2 = 0
            com.google.gson.internal.Excluder r4 = r0.withExclusionStrategy(r4, r1, r2)
            r3.excluder = r4
            return r3
    }

    public com.google.gson.Gson create() {
            r1 = this;
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>(r1)
            return r0
    }

    public java.util.List<com.google.gson.TypeAdapterFactory> createFactories(com.google.gson.internal.ConstructorConstructor r9, com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r10) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.JSON_ELEMENT_FACTORY
            r0.add(r1)
            com.google.gson.ToNumberStrategy r1 = r8.objectToNumberStrategy
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.ObjectTypeAdapter.getFactory(r1)
            r0.add(r1)
            com.google.gson.internal.Excluder r1 = r8.excluder
            r0.add(r1)
            r8.addUserDefinedAdapters(r0)
            r8.addDateTypeAdapters(r0)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.STRING_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.INTEGER_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.BOOLEAN_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.BYTE_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY
            r0.add(r1)
            com.google.gson.LongSerializationPolicy r1 = r8.longSerializationPolicy
            com.google.gson.TypeAdapter r1 = r1.typeAdapter()
            java.lang.Class r2 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.newFactory(r2, r3, r1)
            r0.add(r2)
            java.lang.Class r2 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            com.google.gson.TypeAdapter r4 = r8.doubleAdapter()
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.newFactory(r2, r3, r4)
            r0.add(r2)
            java.lang.Class r2 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            com.google.gson.TypeAdapter r4 = r8.floatAdapter()
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.newFactory(r2, r3, r4)
            r0.add(r2)
            com.google.gson.ToNumberStrategy r2 = r8.numberToNumberStrategy
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.NumberTypeAdapter.getFactory(r2)
            r0.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_FACTORY
            r0.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_BOOLEAN_FACTORY
            r0.add(r2)
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r2 = java.util.concurrent.atomic.AtomicLong.class
            com.google.gson.TypeAdapter r3 = com.google.gson.internal.bind.TypeAdapters.atomicLongAdapter(r1)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.newFactory(r2, r3)
            r0.add(r2)
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r2 = java.util.concurrent.atomic.AtomicLongArray.class
            com.google.gson.TypeAdapter r1 = com.google.gson.internal.bind.TypeAdapters.atomicLongArrayAdapter(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.newFactory(r2, r1)
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.CHARACTER_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.STRING_BUILDER_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.STRING_BUFFER_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.BIG_DECIMAL_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.BIG_INTEGER_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.LAZILY_PARSED_NUMBER_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.URL_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.URI_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.UUID_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.CURRENCY_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.LOCALE_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.INET_ADDRESS_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.BIT_SET_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.DefaultDateTypeAdapter.DEFAULT_STYLE_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.CALENDAR_FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.javaTimeTypeAdapterFactory()
            if (r1 == 0) goto Lec
            r0.add(r1)
        Lec:
            java.util.List<com.google.gson.TypeAdapterFactory> r1 = com.google.gson.internal.sql.SqlTypesSupport.SQL_TYPE_FACTORIES
            r0.addAll(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.ArrayTypeAdapter.FACTORY
            r0.add(r1)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.CLASS_FACTORY
            r0.add(r1)
            com.google.gson.internal.bind.CollectionTypeAdapterFactory r1 = new com.google.gson.internal.bind.CollectionTypeAdapterFactory
            r1.<init>(r9)
            r0.add(r1)
            com.google.gson.internal.bind.MapTypeAdapterFactory r1 = new com.google.gson.internal.bind.MapTypeAdapterFactory
            boolean r2 = r8.complexMapKeySerialization
            r1.<init>(r9, r2)
            r0.add(r1)
            r0.add(r10)
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TypeAdapters.ENUM_FACTORY
            r0.add(r1)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory r1 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory
            com.google.gson.FieldNamingStrategy r4 = r8.fieldNamingPolicy
            com.google.gson.internal.Excluder r5 = r8.excluder
            java.util.ArrayDeque<com.google.gson.ReflectionAccessFilter> r2 = r8.reflectionFilters
            java.util.List r7 = newImmutableList(r2)
            r2 = r1
            r3 = r9
            r6 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r1)
            r0.trimToSize()
            java.util.List r9 = java.util.Collections.unmodifiableList(r0)
            return r9
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder disableHtmlEscaping() {
            r1 = this;
            r0 = 0
            r1.escapeHtmlChars = r0
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder disableInnerClassSerialization() {
            r1 = this;
            com.google.gson.internal.Excluder r0 = r1.excluder
            com.google.gson.internal.Excluder r0 = r0.disableInnerClassSerialization()
            r1.excluder = r0
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder disableJdkUnsafe() {
            r1 = this;
            r0 = 0
            r1.useJdkUnsafe = r0
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder enableComplexMapKeySerialization() {
            r1 = this;
            r0 = 1
            r1.complexMapKeySerialization = r0
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder excludeFieldsWithModifiers(int... r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            com.google.gson.internal.Excluder r0 = r1.excluder
            com.google.gson.internal.Excluder r2 = r0.withModifiers(r2)
            r1.excluder = r2
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder excludeFieldsWithoutExposeAnnotation() {
            r1 = this;
            com.google.gson.internal.Excluder r0 = r1.excluder
            com.google.gson.internal.Excluder r0 = r0.excludeFieldsWithoutExposeAnnotation()
            r1.excluder = r0
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder generateNonExecutableJson() {
            r1 = this;
            r0 = 1
            r1.generateNonExecutableJson = r0
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder registerTypeAdapter(java.lang.reflect.Type r4, java.lang.Object r5) {
            r3 = this;
            java.util.Objects.requireNonNull(r4)
            java.util.Objects.requireNonNull(r5)
            boolean r0 = r5 instanceof com.google.gson.JsonSerializer
            if (r0 != 0) goto L3b
            boolean r1 = r5 instanceof com.google.gson.JsonDeserializer
            if (r1 != 0) goto L3b
            boolean r1 = r5 instanceof com.google.gson.InstanceCreator
            if (r1 != 0) goto L3b
            boolean r1 = r5 instanceof com.google.gson.TypeAdapter
            if (r1 == 0) goto L17
            goto L3b
        L17:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Class "
            r0.append(r1)
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            java.lang.String r5 = " does not implement any supported type adapter class or interface"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        L3b:
            boolean r1 = hasNonOverridableAdapter(r4)
            if (r1 != 0) goto L74
            boolean r1 = r5 instanceof com.google.gson.InstanceCreator
            if (r1 == 0) goto L4d
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r1 = r3.instanceCreators
            r2 = r5
            com.google.gson.InstanceCreator r2 = (com.google.gson.InstanceCreator) r2
            r1.put(r4, r2)
        L4d:
            if (r0 != 0) goto L53
            boolean r0 = r5 instanceof com.google.gson.JsonDeserializer
            if (r0 == 0) goto L60
        L53:
            com.google.gson.reflect.TypeToken r0 = com.google.gson.reflect.TypeToken.get(r4)
            java.util.List<com.google.gson.TypeAdapterFactory> r1 = r3.factories
            com.google.gson.TypeAdapterFactory r0 = com.google.gson.internal.bind.TreeTypeAdapter.newFactoryWithMatchRawType(r0, r5)
            r1.add(r0)
        L60:
            boolean r0 = r5 instanceof com.google.gson.TypeAdapter
            if (r0 == 0) goto L73
            com.google.gson.reflect.TypeToken r4 = com.google.gson.reflect.TypeToken.get(r4)
            com.google.gson.TypeAdapter r5 = (com.google.gson.TypeAdapter) r5
            com.google.gson.TypeAdapterFactory r4 = com.google.gson.internal.bind.TypeAdapters.newFactory(r4, r5)
            java.util.List<com.google.gson.TypeAdapterFactory> r5 = r3.factories
            r5.add(r4)
        L73:
            return r3
        L74:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot override built-in adapter for "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder registerTypeAdapterFactory(com.google.gson.TypeAdapterFactory r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r1.factories
            r0.add(r2)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder registerTypeHierarchyAdapter(java.lang.Class<?> r3, java.lang.Object r4) {
            r2 = this;
            java.util.Objects.requireNonNull(r3)
            java.util.Objects.requireNonNull(r4)
            boolean r0 = r4 instanceof com.google.gson.JsonSerializer
            if (r0 != 0) goto L37
            boolean r1 = r4 instanceof com.google.gson.JsonDeserializer
            if (r1 != 0) goto L37
            boolean r1 = r4 instanceof com.google.gson.TypeAdapter
            if (r1 == 0) goto L13
            goto L37
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Class "
            r0.append(r1)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = " does not implement any supported type adapter class or interface"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L37:
            boolean r1 = r4 instanceof com.google.gson.JsonDeserializer
            if (r1 != 0) goto L3d
            if (r0 == 0) goto L46
        L3d:
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r2.hierarchyFactories
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TreeTypeAdapter.newTypeHierarchyFactory(r3, r4)
            r0.add(r1)
        L46:
            boolean r0 = r4 instanceof com.google.gson.TypeAdapter
            if (r0 == 0) goto L55
            com.google.gson.TypeAdapter r4 = (com.google.gson.TypeAdapter) r4
            com.google.gson.TypeAdapterFactory r3 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(r3, r4)
            java.util.List<com.google.gson.TypeAdapterFactory> r4 = r2.factories
            r4.add(r3)
        L55:
            return r2
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder serializeNulls() {
            r1 = this;
            r0 = 1
            r1.serializeNulls = r0
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder serializeSpecialFloatingPointValues() {
            r1 = this;
            r0 = 1
            r1.serializeSpecialFloatingPointValues = r0
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @java.lang.Deprecated
    public com.google.gson.GsonBuilder setDateFormat(int r1) {
            r0 = this;
            int r1 = checkDateFormatStyle(r1)
            r0.dateStyle = r1
            r1 = 0
            r0.datePattern = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder setDateFormat(int r1, int r2) {
            r0 = this;
            int r1 = checkDateFormatStyle(r1)
            r0.dateStyle = r1
            int r1 = checkDateFormatStyle(r2)
            r0.timeStyle = r1
            r1 = 0
            r0.datePattern = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder setDateFormat(java.lang.String r5) {
            r4 = this;
            if (r5 == 0) goto L25
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.IllegalArgumentException -> L8
            r0.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L8
            goto L25
        L8:
            r0 = move-exception
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "The date pattern '"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = "' is not valid"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r0)
            throw r1
        L25:
            r4.datePattern = r5
            return r4
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder setExclusionStrategies(com.google.gson.ExclusionStrategy... r6) {
            r5 = this;
            java.util.Objects.requireNonNull(r6)
            int r0 = r6.length
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            r2 = r6[r1]
            com.google.gson.internal.Excluder r3 = r5.excluder
            r4 = 1
            com.google.gson.internal.Excluder r2 = r3.withExclusionStrategy(r2, r4, r4)
            r5.excluder = r2
            int r1 = r1 + 1
            goto L5
        L15:
            return r5
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder setFieldNamingPolicy(com.google.gson.FieldNamingPolicy r1) {
            r0 = this;
            com.google.gson.GsonBuilder r1 = r0.setFieldNamingStrategy(r1)
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder setFieldNamingStrategy(com.google.gson.FieldNamingStrategy r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            com.google.gson.FieldNamingStrategy r1 = (com.google.gson.FieldNamingStrategy) r1
            r0.fieldNamingPolicy = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder setFormattingStyle(com.google.gson.FormattingStyle r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.formattingStyle = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    @com.google.errorprone.annotations.InlineMe(imports = {"com.google.gson.Strictness"}, replacement = "this.setStrictness(Strictness.LENIENT)")
    @java.lang.Deprecated
    public com.google.gson.GsonBuilder setLenient() {
            r1 = this;
            com.google.gson.Strictness r0 = com.google.gson.Strictness.LENIENT
            com.google.gson.GsonBuilder r0 = r1.setStrictness(r0)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder setLongSerializationPolicy(com.google.gson.LongSerializationPolicy r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.longSerializationPolicy = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder setNumberToNumberStrategy(com.google.gson.ToNumberStrategy r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            com.google.gson.ToNumberStrategy r1 = (com.google.gson.ToNumberStrategy) r1
            r0.numberToNumberStrategy = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder setObjectToNumberStrategy(com.google.gson.ToNumberStrategy r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            com.google.gson.ToNumberStrategy r1 = (com.google.gson.ToNumberStrategy) r1
            r0.objectToNumberStrategy = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder setPrettyPrinting() {
            r1 = this;
            com.google.gson.FormattingStyle r0 = com.google.gson.FormattingStyle.PRETTY
            com.google.gson.GsonBuilder r0 = r1.setFormattingStyle(r0)
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder setStrictness(com.google.gson.Strictness r1) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.strictness = r1
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public com.google.gson.GsonBuilder setVersion(double r4) {
            r3 = this;
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto L15
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L15
            com.google.gson.internal.Excluder r0 = r3.excluder
            com.google.gson.internal.Excluder r4 = r0.withVersion(r4)
            r3.excluder = r4
            return r3
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid version: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }
}
