package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;
    private final com.google.gson.internal.Excluder excluder;
    private final com.google.gson.FieldNamingStrategy fieldNamingPolicy;
    private final com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    private final java.util.List<com.google.gson.ReflectionAccessFilter> reflectionFilters;


    public static abstract class Adapter<T, A> extends com.google.gson.TypeAdapter<T> {
        final java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> boundFields;

        Adapter(java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> r1) {
                r0 = this;
                r0.<init>()
                r0.boundFields = r1
                return
        }

        abstract A createAccumulator();

        abstract T finalize(A r1);

        @Override // com.google.gson.TypeAdapter
        public T read(com.google.gson.stream.JsonReader r5) throws java.io.IOException {
                r4 = this;
                com.google.gson.stream.JsonToken r0 = r5.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r5.nextNull()
                r0 = 0
                return r0
            Ld:
                java.lang.Object r0 = r4.createAccumulator()
                r5.beginObject()     // Catch: java.lang.IllegalAccessException -> L3e java.lang.IllegalStateException -> L44
            L14:
                boolean r1 = r5.hasNext()     // Catch: java.lang.IllegalAccessException -> L3e java.lang.IllegalStateException -> L44
                if (r1 == 0) goto L35
                java.lang.String r1 = r5.nextName()     // Catch: java.lang.IllegalAccessException -> L3e java.lang.IllegalStateException -> L44
                java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField> r2 = r4.boundFields     // Catch: java.lang.IllegalAccessException -> L3e java.lang.IllegalStateException -> L44
                java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.IllegalAccessException -> L3e java.lang.IllegalStateException -> L44
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r2 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r2     // Catch: java.lang.IllegalAccessException -> L3e java.lang.IllegalStateException -> L44
                if (r2 == 0) goto L31
                boolean r3 = r2.deserialized     // Catch: java.lang.IllegalAccessException -> L3e java.lang.IllegalStateException -> L44
                if (r3 != 0) goto L2d
                goto L31
            L2d:
                r4.readField(r0, r5, r2)     // Catch: java.lang.IllegalAccessException -> L3e java.lang.IllegalStateException -> L44
                goto L34
            L31:
                r5.skipValue()     // Catch: java.lang.IllegalAccessException -> L3e java.lang.IllegalStateException -> L44
            L34:
                goto L14
            L35:
                r5.endObject()
                java.lang.Object r1 = r4.finalize(r0)
                return r1
            L3e:
                r1 = move-exception
                java.lang.RuntimeException r2 = com.google.gson.internal.reflect.ReflectionHelper.createExceptionForUnexpectedIllegalAccess(r1)
                throw r2
            L44:
                r1 = move-exception
                com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException
                r2.<init>(r1)
                throw r2
        }

        abstract void readField(A r1, com.google.gson.stream.JsonReader r2, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField r3) throws java.lang.IllegalAccessException, java.io.IOException;

        @Override // com.google.gson.TypeAdapter
        public void write(com.google.gson.stream.JsonWriter r3, T r4) throws java.io.IOException {
                r2 = this;
                if (r4 != 0) goto L6
                r3.nullValue()
                return
            L6:
                r3.beginObject()
                java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField> r0 = r2.boundFields     // Catch: java.lang.IllegalAccessException -> L28
                java.util.Collection r0 = r0.values()     // Catch: java.lang.IllegalAccessException -> L28
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.IllegalAccessException -> L28
            L13:
                boolean r1 = r0.hasNext()     // Catch: java.lang.IllegalAccessException -> L28
                if (r1 == 0) goto L23
                java.lang.Object r1 = r0.next()     // Catch: java.lang.IllegalAccessException -> L28
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r1 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r1     // Catch: java.lang.IllegalAccessException -> L28
                r1.write(r3, r4)     // Catch: java.lang.IllegalAccessException -> L28
                goto L13
            L23:
                r3.endObject()
                return
            L28:
                r0 = move-exception
                java.lang.RuntimeException r1 = com.google.gson.internal.reflect.ReflectionHelper.createExceptionForUnexpectedIllegalAccess(r0)
                throw r1
        }
    }

    static abstract class BoundField {
        final boolean deserialized;
        final java.lang.reflect.Field field;
        final java.lang.String fieldName;
        final java.lang.String name;
        final boolean serialized;

        protected BoundField(java.lang.String r2, java.lang.reflect.Field r3, boolean r4, boolean r5) {
                r1 = this;
                r1.<init>()
                r1.name = r2
                r1.field = r3
                java.lang.String r0 = r3.getName()
                r1.fieldName = r0
                r1.serialized = r4
                r1.deserialized = r5
                return
        }

        abstract void readIntoArray(com.google.gson.stream.JsonReader r1, int r2, java.lang.Object[] r3) throws java.io.IOException, com.google.gson.JsonParseException;

        abstract void readIntoField(com.google.gson.stream.JsonReader r1, java.lang.Object r2) throws java.io.IOException, java.lang.IllegalAccessException;

        abstract void write(com.google.gson.stream.JsonWriter r1, java.lang.Object r2) throws java.io.IOException, java.lang.IllegalAccessException;
    }

    private static final class FieldReflectionAdapter<T> extends com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<T, T> {
        private final com.google.gson.internal.ObjectConstructor<T> constructor;

        FieldReflectionAdapter(com.google.gson.internal.ObjectConstructor<T> r1, java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> r2) {
                r0 = this;
                r0.<init>(r2)
                r0.constructor = r1
                return
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        T createAccumulator() {
                r1 = this;
                com.google.gson.internal.ObjectConstructor<T> r0 = r1.constructor
                java.lang.Object r0 = r0.construct()
                return r0
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        T finalize(T r1) {
                r0 = this;
                return r1
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        void readField(T r1, com.google.gson.stream.JsonReader r2, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField r3) throws java.lang.IllegalAccessException, java.io.IOException {
                r0 = this;
                r3.readIntoField(r2, r1)
                return
        }
    }

    private static final class RecordAdapter<T> extends com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<T, java.lang.Object[]> {
        static final java.util.Map<java.lang.Class<?>, java.lang.Object> PRIMITIVE_DEFAULTS = null;
        private final java.util.Map<java.lang.String, java.lang.Integer> componentIndices;
        private final java.lang.reflect.Constructor<T> constructor;
        private final java.lang.Object[] constructorArgsDefaults;

        static {
                java.util.Map r0 = primitiveDefaults()
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.RecordAdapter.PRIMITIVE_DEFAULTS = r0
                return
        }

        RecordAdapter(java.lang.Class<T> r7, java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> r8, boolean r9) {
                r6 = this;
                r6.<init>(r8)
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r6.componentIndices = r0
                java.lang.reflect.Constructor r0 = com.google.gson.internal.reflect.ReflectionHelper.getCanonicalRecordConstructor(r7)
                r6.constructor = r0
                if (r9 == 0) goto L19
                r0 = 0
                java.lang.reflect.Constructor<T> r1 = r6.constructor
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.access$000(r0, r1)
                goto L1e
            L19:
                java.lang.reflect.Constructor<T> r0 = r6.constructor
                com.google.gson.internal.reflect.ReflectionHelper.makeAccessible(r0)
            L1e:
                java.lang.String[] r0 = com.google.gson.internal.reflect.ReflectionHelper.getRecordComponentNames(r7)
                r1 = 0
            L23:
                int r2 = r0.length
                if (r1 >= r2) goto L34
                java.util.Map<java.lang.String, java.lang.Integer> r2 = r6.componentIndices
                r3 = r0[r1]
                java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
                r2.put(r3, r4)
                int r1 = r1 + 1
                goto L23
            L34:
                java.lang.reflect.Constructor<T> r1 = r6.constructor
                java.lang.Class[] r1 = r1.getParameterTypes()
                int r2 = r1.length
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r6.constructorArgsDefaults = r2
                r2 = 0
            L40:
                int r3 = r1.length
                if (r2 >= r3) goto L52
                java.lang.Object[] r3 = r6.constructorArgsDefaults
                java.util.Map<java.lang.Class<?>, java.lang.Object> r4 = com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.RecordAdapter.PRIMITIVE_DEFAULTS
                r5 = r1[r2]
                java.lang.Object r4 = r4.get(r5)
                r3[r2] = r4
                int r2 = r2 + 1
                goto L40
            L52:
                return
        }

        private static java.util.Map<java.lang.Class<?>, java.lang.Object> primitiveDefaults() {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.lang.Class r1 = java.lang.Byte.TYPE
                r2 = 0
                java.lang.Byte r3 = java.lang.Byte.valueOf(r2)
                r0.put(r1, r3)
                java.lang.Class r1 = java.lang.Short.TYPE
                java.lang.Short r3 = java.lang.Short.valueOf(r2)
                r0.put(r1, r3)
                java.lang.Class r1 = java.lang.Integer.TYPE
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                r0.put(r1, r3)
                java.lang.Class r1 = java.lang.Long.TYPE
                r3 = 0
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r0.put(r1, r3)
                java.lang.Class r1 = java.lang.Float.TYPE
                r3 = 0
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.put(r1, r3)
                java.lang.Class r1 = java.lang.Double.TYPE
                r3 = 0
                java.lang.Double r3 = java.lang.Double.valueOf(r3)
                r0.put(r1, r3)
                java.lang.Class r1 = java.lang.Character.TYPE
                java.lang.Character r3 = java.lang.Character.valueOf(r2)
                r0.put(r1, r3)
                java.lang.Class r1 = java.lang.Boolean.TYPE
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r0.put(r1, r2)
                return r0
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* bridge */ /* synthetic */ java.lang.Object[] createAccumulator() {
                r1 = this;
                java.lang.Object[] r0 = r1.createAccumulator2()
                return r0
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* JADX INFO: renamed from: createAccumulator, reason: avoid collision after fix types in other method */
        java.lang.Object[] createAccumulator2() {
                r1 = this;
                java.lang.Object[] r0 = r1.constructorArgsDefaults
                java.lang.Object r0 = r0.clone()
                java.lang.Object[] r0 = (java.lang.Object[]) r0
                return r0
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* bridge */ /* synthetic */ java.lang.Object finalize(java.lang.Object[] r1) {
                r0 = this;
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                java.lang.Object r1 = r0.finalize2(r1)
                return r1
        }

        /* JADX INFO: renamed from: finalize, reason: avoid collision after fix types in other method */
        T finalize2(java.lang.Object[] r6) {
                r5 = this;
                java.lang.String r0 = "' with args "
                java.lang.String r1 = "Failed to invoke constructor '"
                java.lang.reflect.Constructor<T> r2 = r5.constructor     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.IllegalArgumentException -> L39 java.lang.InstantiationException -> L3b java.lang.IllegalAccessException -> L65
                java.lang.Object r0 = r2.newInstance(r6)     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.IllegalArgumentException -> L39 java.lang.InstantiationException -> L3b java.lang.IllegalAccessException -> L65
                return r0
            Lb:
                r2 = move-exception
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.StringBuilder r1 = r4.append(r1)
                java.lang.reflect.Constructor<T> r4 = r5.constructor
                java.lang.String r4 = com.google.gson.internal.reflect.ReflectionHelper.constructorToString(r4)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r1 = java.util.Arrays.toString(r6)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.Throwable r1 = r2.getCause()
                r3.<init>(r0, r1)
                throw r3
            L39:
                r2 = move-exception
                goto L3c
            L3b:
                r2 = move-exception
            L3c:
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.StringBuilder r1 = r4.append(r1)
                java.lang.reflect.Constructor<T> r4 = r5.constructor
                java.lang.String r4 = com.google.gson.internal.reflect.ReflectionHelper.constructorToString(r4)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r1 = java.util.Arrays.toString(r6)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0, r2)
                throw r3
            L65:
                r0 = move-exception
                java.lang.RuntimeException r1 = com.google.gson.internal.reflect.ReflectionHelper.createExceptionForUnexpectedIllegalAccess(r0)
                throw r1
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* bridge */ /* synthetic */ void readField(java.lang.Object[] r1, com.google.gson.stream.JsonReader r2, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField r3) throws java.lang.IllegalAccessException, java.io.IOException {
                r0 = this;
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                r0.readField2(r1, r2, r3)
                return
        }

        /* JADX INFO: renamed from: readField, reason: avoid collision after fix types in other method */
        void readField2(java.lang.Object[] r5, com.google.gson.stream.JsonReader r6, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField r7) throws java.io.IOException {
                r4 = this;
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r4.componentIndices
                java.lang.String r1 = r7.fieldName
                java.lang.Object r0 = r0.get(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L14
                int r1 = r0.intValue()
                r7.readIntoArray(r6, r1, r5)
                return
            L14:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Could not find the index in the constructor '"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.reflect.Constructor<T> r3 = r4.constructor
                java.lang.String r3 = com.google.gson.internal.reflect.ReflectionHelper.constructorToString(r3)
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = "' for field with name '"
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = r7.fieldName
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }
    }

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor r1, com.google.gson.FieldNamingStrategy r2, com.google.gson.internal.Excluder r3, com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r4, java.util.List<com.google.gson.ReflectionAccessFilter> r5) {
            r0 = this;
            r0.<init>()
            r0.constructorConstructor = r1
            r0.fieldNamingPolicy = r2
            r0.excluder = r3
            r0.jsonAdapterFactory = r4
            r0.reflectionFilters = r5
            return
    }

    static /* synthetic */ void access$000(java.lang.Object r0, java.lang.reflect.AccessibleObject r1) {
            checkAccessible(r0, r1)
            return
    }

    private static <M extends java.lang.reflect.AccessibleObject & java.lang.reflect.Member> void checkAccessible(java.lang.Object r4, M r5) {
            r0 = r5
            java.lang.reflect.Member r0 = (java.lang.reflect.Member) r0
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto Lf
            r0 = 0
            goto L10
        Lf:
            r0 = r4
        L10:
            boolean r0 = com.google.gson.internal.ReflectionAccessFilterHelper.canAccess(r5, r0)
            if (r0 == 0) goto L17
            return
        L17:
            r0 = 1
            java.lang.String r0 = com.google.gson.internal.reflect.ReflectionHelper.getAccessibleObjectDescription(r5, r0)
            com.google.gson.JsonIOException r1 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r3 = " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    private com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField createBoundField(com.google.gson.Gson r22, java.lang.reflect.Field r23, java.lang.reflect.Method r24, java.lang.String r25, com.google.gson.reflect.TypeToken<?> r26, boolean r27, boolean r28, boolean r29) {
            r21 = this;
            r14 = r21
            r15 = r22
            r12 = r26
            java.lang.Class r0 = r26.getRawType()
            boolean r16 = com.google.gson.internal.Primitives.isPrimitive(r0)
            int r17 = r23.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r17)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L22
            boolean r0 = java.lang.reflect.Modifier.isFinal(r17)
            if (r0 == 0) goto L22
            r13 = r1
            goto L23
        L22:
            r13 = r2
        L23:
            java.lang.Class<com.google.gson.annotations.JsonAdapter> r0 = com.google.gson.annotations.JsonAdapter.class
            r11 = r23
            java.lang.annotation.Annotation r0 = r11.getAnnotation(r0)
            r10 = r0
            com.google.gson.annotations.JsonAdapter r10 = (com.google.gson.annotations.JsonAdapter) r10
            r0 = 0
            if (r10 == 0) goto L39
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r3 = r14.jsonAdapterFactory
            com.google.gson.internal.ConstructorConstructor r4 = r14.constructorConstructor
            com.google.gson.TypeAdapter r0 = r3.getTypeAdapter(r4, r15, r12, r10)
        L39:
            if (r0 == 0) goto L3d
            r8 = r1
            goto L3e
        L3d:
            r8 = r2
        L3e:
            if (r0 != 0) goto L44
            com.google.gson.TypeAdapter r0 = r15.getAdapter(r12)
        L44:
            r18 = r0
            r9 = r18
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1 r19 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1
            r0 = r19
            r1 = r21
            r2 = r25
            r3 = r23
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r24
            r20 = r10
            r10 = r22
            r11 = r26
            r12 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r19
    }

    private java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> getBoundFields(com.google.gson.Gson r30, com.google.gson.reflect.TypeToken<?> r31, java.lang.Class<?> r32, boolean r33, boolean r34) {
            r29 = this;
            r9 = r29
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r10 = r0
            boolean r0 = r32.isInterface()
            if (r0 == 0) goto Lf
            return r10
        Lf:
            r11 = r32
            r12 = r31
            r13 = r32
            r0 = r33
        L17:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r13 == r1) goto L1ce
            java.lang.reflect.Field[] r14 = r13.getDeclaredFields()
            r15 = 1
            r8 = 0
            if (r13 == r11) goto L64
            int r1 = r14.length
            if (r1 <= 0) goto L64
            java.util.List<com.google.gson.ReflectionAccessFilter> r1 = r9.reflectionFilters
            com.google.gson.ReflectionAccessFilter$FilterResult r1 = com.google.gson.internal.ReflectionAccessFilterHelper.getFilterResult(r1, r13)
            com.google.gson.ReflectionAccessFilter$FilterResult r2 = com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL
            if (r1 == r2) goto L3b
            com.google.gson.ReflectionAccessFilter$FilterResult r2 = com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE
            if (r1 != r2) goto L36
            r2 = r15
            goto L37
        L36:
            r2 = r8
        L37:
            r0 = r2
            r16 = r0
            goto L66
        L3b:
            com.google.gson.JsonIOException r2 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "ReflectionAccessFilter does not permit using reflection for "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r13)
            java.lang.String r4 = " (supertype of "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r11)
            java.lang.String r4 = "). Register a TypeAdapter for this type or adjust the access filter."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L64:
            r16 = r0
        L66:
            int r7 = r14.length
            r6 = r8
        L68:
            if (r6 >= r7) goto L1b4
            r5 = r14[r6]
            boolean r0 = r9.includeField(r5, r15)
            boolean r1 = r9.includeField(r5, r8)
            if (r0 != 0) goto L80
            if (r1 != 0) goto L80
            r21 = r6
            r26 = r7
            r27 = r8
            goto L162
        L80:
            r2 = 0
            if (r34 == 0) goto Ld5
            int r3 = r5.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 == 0) goto L93
            r1 = 0
            r17 = r1
            r18 = r2
            goto Ld9
        L93:
            java.lang.reflect.Method r2 = com.google.gson.internal.reflect.ReflectionHelper.getAccessor(r13, r5)
            if (r16 != 0) goto L9c
            com.google.gson.internal.reflect.ReflectionHelper.makeAccessible(r2)
        L9c:
            java.lang.Class<com.google.gson.annotations.SerializedName> r3 = com.google.gson.annotations.SerializedName.class
            java.lang.annotation.Annotation r3 = r2.getAnnotation(r3)
            if (r3 == 0) goto Ld0
            java.lang.Class<com.google.gson.annotations.SerializedName> r3 = com.google.gson.annotations.SerializedName.class
            java.lang.annotation.Annotation r3 = r5.getAnnotation(r3)
            if (r3 == 0) goto Lad
            goto Ld0
        Lad:
            java.lang.String r3 = com.google.gson.internal.reflect.ReflectionHelper.getAccessibleObjectDescription(r2, r8)
            com.google.gson.JsonIOException r4 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "@SerializedName on "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r7 = " is not supported"
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r4.<init>(r6)
            throw r4
        Ld0:
            r17 = r1
            r18 = r2
            goto Ld9
        Ld5:
            r17 = r1
            r18 = r2
        Ld9:
            if (r16 != 0) goto Le0
            if (r18 != 0) goto Le0
            com.google.gson.internal.reflect.ReflectionHelper.makeAccessible(r5)
        Le0:
            java.lang.reflect.Type r1 = r12.getType()
            java.lang.reflect.Type r2 = r5.getGenericType()
            java.lang.reflect.Type r19 = com.google.gson.internal.C$Gson$Types.resolve(r1, r13, r2)
            java.util.List r4 = r9.getFieldNames(r5)
            r1 = 0
            r2 = 0
            int r3 = r4.size()
            r28 = r2
            r2 = r1
            r1 = r28
        Lfb:
            if (r1 >= r3) goto L151
            java.lang.Object r20 = r4.get(r1)
            r15 = r20
            java.lang.String r15 = (java.lang.String) r15
            if (r1 == 0) goto L108
            r0 = 0
        L108:
            r20 = r0
            com.google.gson.reflect.TypeToken r21 = com.google.gson.reflect.TypeToken.get(r19)
            r0 = r29
            r22 = r1
            r1 = r30
            r9 = r2
            r2 = r5
            r23 = r3
            r3 = r18
            r24 = r4
            r4 = r15
            r25 = r5
            r5 = r21
            r21 = r6
            r6 = r20
            r26 = r7
            r7 = r17
            r27 = r8
            r8 = r16
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r0 = r0.createBoundField(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r10.put(r15, r0)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r1 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r1
            if (r9 != 0) goto L13c
            r2 = r1
            goto L13d
        L13c:
            r2 = r9
        L13d:
            int r1 = r22 + 1
            r9 = r29
            r0 = r20
            r6 = r21
            r3 = r23
            r4 = r24
            r5 = r25
            r7 = r26
            r8 = r27
            r15 = 1
            goto Lfb
        L151:
            r22 = r1
            r9 = r2
            r23 = r3
            r24 = r4
            r25 = r5
            r21 = r6
            r26 = r7
            r27 = r8
            if (r9 != 0) goto L16d
        L162:
            int r6 = r21 + 1
            r15 = 1
            r9 = r29
            r7 = r26
            r8 = r27
            goto L68
        L16d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Class "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r11.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " declares multiple JSON fields named '"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r9.name
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "'; conflict is caused by fields "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.reflect.Field r3 = r9.field
            java.lang.String r3 = com.google.gson.internal.reflect.ReflectionHelper.fieldToString(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " and "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = com.google.gson.internal.reflect.ReflectionHelper.fieldToString(r25)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1b4:
            java.lang.reflect.Type r0 = r12.getType()
            java.lang.reflect.Type r1 = r13.getGenericSuperclass()
            java.lang.reflect.Type r0 = com.google.gson.internal.C$Gson$Types.resolve(r0, r13, r1)
            com.google.gson.reflect.TypeToken r12 = com.google.gson.reflect.TypeToken.get(r0)
            java.lang.Class r13 = r12.getRawType()
            r9 = r29
            r0 = r16
            goto L17
        L1ce:
            return r10
    }

    private java.util.List<java.lang.String> getFieldNames(java.lang.reflect.Field r6) {
            r5 = this;
            java.lang.Class<com.google.gson.annotations.SerializedName> r0 = com.google.gson.annotations.SerializedName.class
            java.lang.annotation.Annotation r0 = r6.getAnnotation(r0)
            com.google.gson.annotations.SerializedName r0 = (com.google.gson.annotations.SerializedName) r0
            if (r0 != 0) goto L15
            com.google.gson.FieldNamingStrategy r1 = r5.fieldNamingPolicy
            java.lang.String r1 = r1.translateName(r6)
            java.util.List r2 = java.util.Collections.singletonList(r1)
            return r2
        L15:
            java.lang.String r1 = r0.value()
            java.lang.String[] r2 = r0.alternate()
            int r3 = r2.length
            if (r3 != 0) goto L25
            java.util.List r3 = java.util.Collections.singletonList(r1)
            return r3
        L25:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.length
            int r4 = r4 + 1
            r3.<init>(r4)
            r3.add(r1)
            java.util.Collections.addAll(r3, r2)
            return r3
    }

    private boolean includeField(java.lang.reflect.Field r3, boolean r4) {
            r2 = this;
            com.google.gson.internal.Excluder r0 = r2.excluder
            java.lang.Class r1 = r3.getType()
            boolean r0 = r0.excludeClass(r1, r4)
            if (r0 != 0) goto L16
            com.google.gson.internal.Excluder r0 = r2.excluder
            boolean r0 = r0.excludeField(r3, r4)
            if (r0 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r12, com.google.gson.reflect.TypeToken<T> r13) {
            r11 = this;
            java.lang.Class r6 = r13.getRawType()
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r0.isAssignableFrom(r6)
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            java.util.List<com.google.gson.ReflectionAccessFilter> r0 = r11.reflectionFilters
            com.google.gson.ReflectionAccessFilter$FilterResult r7 = com.google.gson.internal.ReflectionAccessFilterHelper.getFilterResult(r0, r6)
            com.google.gson.ReflectionAccessFilter$FilterResult r0 = com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL
            if (r7 == r0) goto L4d
            com.google.gson.ReflectionAccessFilter$FilterResult r0 = com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE
            if (r7 != r0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r8 = r0
            boolean r0 = com.google.gson.internal.reflect.ReflectionHelper.isRecord(r6)
            if (r0 == 0) goto L37
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$RecordAdapter r9 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$RecordAdapter
            r5 = 1
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r6
            r4 = r8
            java.util.Map r0 = r0.getBoundFields(r1, r2, r3, r4, r5)
            r9.<init>(r6, r0, r8)
            r0 = r9
            return r0
        L37:
            com.google.gson.internal.ConstructorConstructor r0 = r11.constructorConstructor
            com.google.gson.internal.ObjectConstructor r9 = r0.get(r13)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$FieldReflectionAdapter r10 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$FieldReflectionAdapter
            r5 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r6
            r4 = r8
            java.util.Map r0 = r0.getBoundFields(r1, r2, r3, r4, r5)
            r10.<init>(r9, r0)
            return r10
        L4d:
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ReflectionAccessFilter does not permit using reflection for "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = ". Register a TypeAdapter for this type or adjust the access filter."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
