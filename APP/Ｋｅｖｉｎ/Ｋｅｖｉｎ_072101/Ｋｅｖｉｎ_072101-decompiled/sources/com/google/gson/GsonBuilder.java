package com.google.gson;

/* JADX INFO: loaded from: classes2.dex */
public final class GsonBuilder {
    private boolean complexMapKeySerialization;
    private java.lang.String datePattern;
    private int dateStyle;
    private boolean escapeHtmlChars;
    private com.google.gson.internal.Excluder excluder;
    private final java.util.List<com.google.gson.TypeAdapterFactory> factories;
    private com.google.gson.FieldNamingStrategy fieldNamingPolicy;
    private boolean generateNonExecutableJson;
    private final java.util.List<com.google.gson.TypeAdapterFactory> hierarchyFactories;
    private final java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> instanceCreators;
    private boolean lenient;
    private com.google.gson.LongSerializationPolicy longSerializationPolicy;
    private com.google.gson.ToNumberStrategy numberToNumberStrategy;
    private com.google.gson.ToNumberStrategy objectToNumberStrategy;
    private boolean prettyPrinting;
    private final java.util.LinkedList<com.google.gson.ReflectionAccessFilter> reflectionFilters;
    private boolean serializeNulls;
    private boolean serializeSpecialFloatingPointValues;
    private int timeStyle;
    private boolean useJdkUnsafe;

    public GsonBuilder() {
            r2 = this;
            r2.<init>()
            com.google.gson.internal.Excluder r0 = com.google.gson.internal.Excluder.DEFAULT
            r2.excluder = r0
            com.google.gson.LongSerializationPolicy r0 = com.google.gson.LongSerializationPolicy.DEFAULT
            r2.longSerializationPolicy = r0
            com.google.gson.FieldNamingPolicy r0 = com.google.gson.FieldNamingPolicy.IDENTITY
            r2.fieldNamingPolicy = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.instanceCreators = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.factories = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.hierarchyFactories = r0
            r0 = 0
            r2.serializeNulls = r0
            java.lang.String r1 = com.google.gson.Gson.DEFAULT_DATE_PATTERN
            r2.datePattern = r1
            r1 = 2
            r2.dateStyle = r1
            r2.timeStyle = r1
            r2.complexMapKeySerialization = r0
            r2.serializeSpecialFloatingPointValues = r0
            r1 = 1
            r2.escapeHtmlChars = r1
            r2.prettyPrinting = r0
            r2.generateNonExecutableJson = r0
            r2.lenient = r0
            r2.useJdkUnsafe = r1
            com.google.gson.ToNumberStrategy r0 = com.google.gson.Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY
            r2.objectToNumberStrategy = r0
            com.google.gson.ToNumberStrategy r0 = com.google.gson.Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY
            r2.numberToNumberStrategy = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r2.reflectionFilters = r0
            return
    }

    GsonBuilder(com.google.gson.Gson r3) {
            r2 = this;
            r2.<init>()
            com.google.gson.internal.Excluder r0 = com.google.gson.internal.Excluder.DEFAULT
            r2.excluder = r0
            com.google.gson.LongSerializationPolicy r0 = com.google.gson.LongSerializationPolicy.DEFAULT
            r2.longSerializationPolicy = r0
            com.google.gson.FieldNamingPolicy r0 = com.google.gson.FieldNamingPolicy.IDENTITY
            r2.fieldNamingPolicy = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.instanceCreators = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.factories = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.hierarchyFactories = r0
            r0 = 0
            r2.serializeNulls = r0
            java.lang.String r1 = com.google.gson.Gson.DEFAULT_DATE_PATTERN
            r2.datePattern = r1
            r1 = 2
            r2.dateStyle = r1
            r2.timeStyle = r1
            r2.complexMapKeySerialization = r0
            r2.serializeSpecialFloatingPointValues = r0
            r1 = 1
            r2.escapeHtmlChars = r1
            r2.prettyPrinting = r0
            r2.generateNonExecutableJson = r0
            r2.lenient = r0
            r2.useJdkUnsafe = r1
            com.google.gson.ToNumberStrategy r0 = com.google.gson.Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY
            r2.objectToNumberStrategy = r0
            com.google.gson.ToNumberStrategy r0 = com.google.gson.Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY
            r2.numberToNumberStrategy = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r2.reflectionFilters = r0
            com.google.gson.internal.Excluder r0 = r3.excluder
            r2.excluder = r0
            com.google.gson.FieldNamingStrategy r0 = r3.fieldNamingStrategy
            r2.fieldNamingPolicy = r0
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r0 = r2.instanceCreators
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r1 = r3.instanceCreators
            r0.putAll(r1)
            boolean r0 = r3.serializeNulls
            r2.serializeNulls = r0
            boolean r0 = r3.complexMapKeySerialization
            r2.complexMapKeySerialization = r0
            boolean r0 = r3.generateNonExecutableJson
            r2.generateNonExecutableJson = r0
            boolean r0 = r3.htmlSafe
            r2.escapeHtmlChars = r0
            boolean r0 = r3.prettyPrinting
            r2.prettyPrinting = r0
            boolean r0 = r3.lenient
            r2.lenient = r0
            boolean r0 = r3.serializeSpecialFloatingPointValues
            r2.serializeSpecialFloatingPointValues = r0
            com.google.gson.LongSerializationPolicy r0 = r3.longSerializationPolicy
            r2.longSerializationPolicy = r0
            java.lang.String r0 = r3.datePattern
            r2.datePattern = r0
            int r0 = r3.dateStyle
            r2.dateStyle = r0
            int r0 = r3.timeStyle
            r2.timeStyle = r0
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r2.factories
            java.util.List<com.google.gson.TypeAdapterFactory> r1 = r3.builderFactories
            r0.addAll(r1)
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r2.hierarchyFactories
            java.util.List<com.google.gson.TypeAdapterFactory> r1 = r3.builderHierarchyFactories
            r0.addAll(r1)
            boolean r0 = r3.useJdkUnsafe
            r2.useJdkUnsafe = r0
            com.google.gson.ToNumberStrategy r0 = r3.objectToNumberStrategy
            r2.objectToNumberStrategy = r0
            com.google.gson.ToNumberStrategy r0 = r3.numberToNumberStrategy
            r2.numberToNumberStrategy = r0
            java.util.LinkedList<com.google.gson.ReflectionAccessFilter> r0 = r2.reflectionFilters
            java.util.List<com.google.gson.ReflectionAccessFilter> r1 = r3.reflectionFilters
            r0.addAll(r1)
            return
    }

    private void addTypeAdaptersForDate(java.lang.String r6, int r7, int r8, java.util.List<com.google.gson.TypeAdapterFactory> r9) {
            r5 = this;
            boolean r0 = com.google.gson.internal.sql.SqlTypesSupport.SUPPORTS_SQL_TYPES
            r1 = 0
            r2 = 0
            if (r6 == 0) goto L25
            java.lang.String r3 = r6.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L25
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<java.util.Date> r3 = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE
            com.google.gson.TypeAdapterFactory r3 = r3.createAdapterFactory(r6)
            if (r0 == 0) goto L3e
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r4 = com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE
            com.google.gson.TypeAdapterFactory r1 = r4.createAdapterFactory(r6)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r4 = com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE
            com.google.gson.TypeAdapterFactory r2 = r4.createAdapterFactory(r6)
            goto L3e
        L25:
            r3 = 2
            if (r7 == r3) goto L4a
            if (r8 == r3) goto L4a
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<java.util.Date> r3 = com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType.DATE
            com.google.gson.TypeAdapterFactory r3 = r3.createAdapterFactory(r7, r8)
            if (r0 == 0) goto L3e
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r4 = com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE
            com.google.gson.TypeAdapterFactory r1 = r4.createAdapterFactory(r7, r8)
            com.google.gson.internal.bind.DefaultDateTypeAdapter$DateType<? extends java.util.Date> r4 = com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE
            com.google.gson.TypeAdapterFactory r2 = r4.createAdapterFactory(r7, r8)
        L3e:
            r9.add(r3)
            if (r0 == 0) goto L49
            r9.add(r1)
            r9.add(r2)
        L49:
            return
        L4a:
            return
    }

    public com.google.gson.GsonBuilder addDeserializationExclusionStrategy(com.google.gson.ExclusionStrategy r4) {
            r3 = this;
            java.util.Objects.requireNonNull(r4)
            com.google.gson.internal.Excluder r0 = r3.excluder
            r1 = 0
            r2 = 1
            com.google.gson.internal.Excluder r0 = r0.withExclusionStrategy(r4, r1, r2)
            r3.excluder = r0
            return r3
    }

    public com.google.gson.GsonBuilder addReflectionAccessFilter(com.google.gson.ReflectionAccessFilter r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            java.util.LinkedList<com.google.gson.ReflectionAccessFilter> r0 = r1.reflectionFilters
            r0.addFirst(r2)
            return r1
    }

    public com.google.gson.GsonBuilder addSerializationExclusionStrategy(com.google.gson.ExclusionStrategy r4) {
            r3 = this;
            java.util.Objects.requireNonNull(r4)
            com.google.gson.internal.Excluder r0 = r3.excluder
            r1 = 1
            r2 = 0
            com.google.gson.internal.Excluder r0 = r0.withExclusionStrategy(r4, r1, r2)
            r3.excluder = r0
            return r3
    }

    public com.google.gson.Gson create() {
            r28 = this;
            r0 = r28
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List<com.google.gson.TypeAdapterFactory> r2 = r0.factories
            int r2 = r2.size()
            java.util.List<com.google.gson.TypeAdapterFactory> r3 = r0.hierarchyFactories
            int r3 = r3.size()
            int r2 = r2 + r3
            int r2 = r2 + 3
            r1.<init>(r2)
            r21 = r1
            java.util.List<com.google.gson.TypeAdapterFactory> r2 = r0.factories
            r1.addAll(r2)
            java.util.Collections.reverse(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List<com.google.gson.TypeAdapterFactory> r3 = r0.hierarchyFactories
            r2.<init>(r3)
            java.util.Collections.reverse(r2)
            r1.addAll(r2)
            java.lang.String r3 = r0.datePattern
            int r4 = r0.dateStyle
            int r5 = r0.timeStyle
            r0.addTypeAdaptersForDate(r3, r4, r5, r1)
            com.google.gson.Gson r25 = new com.google.gson.Gson
            r3 = r25
            com.google.gson.internal.Excluder r4 = r0.excluder
            com.google.gson.FieldNamingStrategy r5 = r0.fieldNamingPolicy
            java.util.HashMap r7 = new java.util.HashMap
            r6 = r7
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r8 = r0.instanceCreators
            r7.<init>(r8)
            boolean r7 = r0.serializeNulls
            boolean r8 = r0.complexMapKeySerialization
            boolean r9 = r0.generateNonExecutableJson
            boolean r10 = r0.escapeHtmlChars
            boolean r11 = r0.prettyPrinting
            boolean r12 = r0.lenient
            boolean r13 = r0.serializeSpecialFloatingPointValues
            boolean r14 = r0.useJdkUnsafe
            com.google.gson.LongSerializationPolicy r15 = r0.longSerializationPolicy
            r26 = r1
            java.lang.String r1 = r0.datePattern
            r16 = r1
            int r1 = r0.dateStyle
            r17 = r1
            int r1 = r0.timeStyle
            r18 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r19 = r1
            r27 = r2
            java.util.List<com.google.gson.TypeAdapterFactory> r2 = r0.factories
            r1.<init>(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r20 = r1
            java.util.List<com.google.gson.TypeAdapterFactory> r2 = r0.hierarchyFactories
            r1.<init>(r2)
            com.google.gson.ToNumberStrategy r1 = r0.objectToNumberStrategy
            r22 = r1
            com.google.gson.ToNumberStrategy r1 = r0.numberToNumberStrategy
            r23 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r24 = r1
            java.util.LinkedList<com.google.gson.ReflectionAccessFilter> r2 = r0.reflectionFilters
            r1.<init>(r2)
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r25
    }

    public com.google.gson.GsonBuilder disableHtmlEscaping() {
            r1 = this;
            r0 = 0
            r1.escapeHtmlChars = r0
            return r1
    }

    public com.google.gson.GsonBuilder disableInnerClassSerialization() {
            r1 = this;
            com.google.gson.internal.Excluder r0 = r1.excluder
            com.google.gson.internal.Excluder r0 = r0.disableInnerClassSerialization()
            r1.excluder = r0
            return r1
    }

    public com.google.gson.GsonBuilder disableJdkUnsafe() {
            r1 = this;
            r0 = 0
            r1.useJdkUnsafe = r0
            return r1
    }

    public com.google.gson.GsonBuilder enableComplexMapKeySerialization() {
            r1 = this;
            r0 = 1
            r1.complexMapKeySerialization = r0
            return r1
    }

    public com.google.gson.GsonBuilder excludeFieldsWithModifiers(int... r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            com.google.gson.internal.Excluder r0 = r1.excluder
            com.google.gson.internal.Excluder r0 = r0.withModifiers(r2)
            r1.excluder = r0
            return r1
    }

    public com.google.gson.GsonBuilder excludeFieldsWithoutExposeAnnotation() {
            r1 = this;
            com.google.gson.internal.Excluder r0 = r1.excluder
            com.google.gson.internal.Excluder r0 = r0.excludeFieldsWithoutExposeAnnotation()
            r1.excluder = r0
            return r1
    }

    public com.google.gson.GsonBuilder generateNonExecutableJson() {
            r1 = this;
            r0 = 1
            r1.generateNonExecutableJson = r0
            return r1
    }

    public com.google.gson.GsonBuilder registerTypeAdapter(java.lang.reflect.Type r4, java.lang.Object r5) {
            r3 = this;
            java.util.Objects.requireNonNull(r4)
            boolean r0 = r5 instanceof com.google.gson.JsonSerializer
            if (r0 != 0) goto L16
            boolean r0 = r5 instanceof com.google.gson.JsonDeserializer
            if (r0 != 0) goto L16
            boolean r0 = r5 instanceof com.google.gson.InstanceCreator
            if (r0 != 0) goto L16
            boolean r0 = r5 instanceof com.google.gson.TypeAdapter
            if (r0 == 0) goto L14
            goto L16
        L14:
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            com.google.gson.internal.C$Gson$Preconditions.checkArgument(r0)
            boolean r0 = r5 instanceof com.google.gson.InstanceCreator
            if (r0 == 0) goto L26
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r0 = r3.instanceCreators
            r1 = r5
            com.google.gson.InstanceCreator r1 = (com.google.gson.InstanceCreator) r1
            r0.put(r4, r1)
        L26:
            boolean r0 = r5 instanceof com.google.gson.JsonSerializer
            if (r0 != 0) goto L2e
            boolean r0 = r5 instanceof com.google.gson.JsonDeserializer
            if (r0 == 0) goto L3b
        L2e:
            com.google.gson.reflect.TypeToken r0 = com.google.gson.reflect.TypeToken.get(r4)
            java.util.List<com.google.gson.TypeAdapterFactory> r1 = r3.factories
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TreeTypeAdapter.newFactoryWithMatchRawType(r0, r5)
            r1.add(r2)
        L3b:
            boolean r0 = r5 instanceof com.google.gson.TypeAdapter
            if (r0 == 0) goto L4f
            com.google.gson.reflect.TypeToken r0 = com.google.gson.reflect.TypeToken.get(r4)
            r1 = r5
            com.google.gson.TypeAdapter r1 = (com.google.gson.TypeAdapter) r1
            com.google.gson.TypeAdapterFactory r0 = com.google.gson.internal.bind.TypeAdapters.newFactory(r0, r1)
            java.util.List<com.google.gson.TypeAdapterFactory> r1 = r3.factories
            r1.add(r0)
        L4f:
            return r3
    }

    public com.google.gson.GsonBuilder registerTypeAdapterFactory(com.google.gson.TypeAdapterFactory r2) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r1.factories
            r0.add(r2)
            return r1
    }

    public com.google.gson.GsonBuilder registerTypeHierarchyAdapter(java.lang.Class<?> r3, java.lang.Object r4) {
            r2 = this;
            java.util.Objects.requireNonNull(r3)
            boolean r0 = r4 instanceof com.google.gson.JsonSerializer
            if (r0 != 0) goto L12
            boolean r0 = r4 instanceof com.google.gson.JsonDeserializer
            if (r0 != 0) goto L12
            boolean r0 = r4 instanceof com.google.gson.TypeAdapter
            if (r0 == 0) goto L10
            goto L12
        L10:
            r0 = 0
            goto L13
        L12:
            r0 = 1
        L13:
            com.google.gson.internal.C$Gson$Preconditions.checkArgument(r0)
            boolean r0 = r4 instanceof com.google.gson.JsonDeserializer
            if (r0 != 0) goto L1e
            boolean r0 = r4 instanceof com.google.gson.JsonSerializer
            if (r0 == 0) goto L27
        L1e:
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r2.hierarchyFactories
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.TreeTypeAdapter.newTypeHierarchyFactory(r3, r4)
            r0.add(r1)
        L27:
            boolean r0 = r4 instanceof com.google.gson.TypeAdapter
            if (r0 == 0) goto L37
            r0 = r4
            com.google.gson.TypeAdapter r0 = (com.google.gson.TypeAdapter) r0
            com.google.gson.TypeAdapterFactory r0 = com.google.gson.internal.bind.TypeAdapters.newTypeHierarchyFactory(r3, r0)
            java.util.List<com.google.gson.TypeAdapterFactory> r1 = r2.factories
            r1.add(r0)
        L37:
            return r2
    }

    public com.google.gson.GsonBuilder serializeNulls() {
            r1 = this;
            r0 = 1
            r1.serializeNulls = r0
            return r1
    }

    public com.google.gson.GsonBuilder serializeSpecialFloatingPointValues() {
            r1 = this;
            r0 = 1
            r1.serializeSpecialFloatingPointValues = r0
            return r1
    }

    public com.google.gson.GsonBuilder setDateFormat(int r2) {
            r1 = this;
            r1.dateStyle = r2
            r0 = 0
            r1.datePattern = r0
            return r1
    }

    public com.google.gson.GsonBuilder setDateFormat(int r2, int r3) {
            r1 = this;
            r1.dateStyle = r2
            r1.timeStyle = r3
            r0 = 0
            r1.datePattern = r0
            return r1
    }

    public com.google.gson.GsonBuilder setDateFormat(java.lang.String r1) {
            r0 = this;
            r0.datePattern = r1
            return r0
    }

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
            com.google.gson.internal.Excluder r3 = r3.withExclusionStrategy(r2, r4, r4)
            r5.excluder = r3
            int r1 = r1 + 1
            goto L5
        L15:
            return r5
    }

    public com.google.gson.GsonBuilder setFieldNamingPolicy(com.google.gson.FieldNamingPolicy r2) {
            r1 = this;
            com.google.gson.GsonBuilder r0 = r1.setFieldNamingStrategy(r2)
            return r0
    }

    public com.google.gson.GsonBuilder setFieldNamingStrategy(com.google.gson.FieldNamingStrategy r2) {
            r1 = this;
            java.lang.Object r0 = java.util.Objects.requireNonNull(r2)
            com.google.gson.FieldNamingStrategy r0 = (com.google.gson.FieldNamingStrategy) r0
            r1.fieldNamingPolicy = r0
            return r1
    }

    public com.google.gson.GsonBuilder setLenient() {
            r1 = this;
            r0 = 1
            r1.lenient = r0
            return r1
    }

    public com.google.gson.GsonBuilder setLongSerializationPolicy(com.google.gson.LongSerializationPolicy r2) {
            r1 = this;
            java.lang.Object r0 = java.util.Objects.requireNonNull(r2)
            com.google.gson.LongSerializationPolicy r0 = (com.google.gson.LongSerializationPolicy) r0
            r1.longSerializationPolicy = r0
            return r1
    }

    public com.google.gson.GsonBuilder setNumberToNumberStrategy(com.google.gson.ToNumberStrategy r2) {
            r1 = this;
            java.lang.Object r0 = java.util.Objects.requireNonNull(r2)
            com.google.gson.ToNumberStrategy r0 = (com.google.gson.ToNumberStrategy) r0
            r1.numberToNumberStrategy = r0
            return r1
    }

    public com.google.gson.GsonBuilder setObjectToNumberStrategy(com.google.gson.ToNumberStrategy r2) {
            r1 = this;
            java.lang.Object r0 = java.util.Objects.requireNonNull(r2)
            com.google.gson.ToNumberStrategy r0 = (com.google.gson.ToNumberStrategy) r0
            r1.objectToNumberStrategy = r0
            return r1
    }

    public com.google.gson.GsonBuilder setPrettyPrinting() {
            r1 = this;
            r0 = 1
            r1.prettyPrinting = r0
            return r1
    }

    public com.google.gson.GsonBuilder setVersion(double r4) {
            r3 = this;
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto L15
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L15
            com.google.gson.internal.Excluder r0 = r3.excluder
            com.google.gson.internal.Excluder r0 = r0.withVersion(r4)
            r3.excluder = r0
            return r3
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid version: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
