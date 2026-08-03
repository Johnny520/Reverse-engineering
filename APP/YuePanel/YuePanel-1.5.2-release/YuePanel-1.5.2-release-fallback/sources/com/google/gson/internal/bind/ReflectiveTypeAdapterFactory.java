package com.google.gson.internal.bind;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;
    private final com.google.gson.internal.Excluder excluder;
    private final com.google.gson.FieldNamingStrategy fieldNamingPolicy;
    private final com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    private final java.util.List<com.google.gson.ReflectionAccessFilter> reflectionFilters;



    public static abstract class Adapter<T, A> extends com.google.gson.TypeAdapter<T> {
        private final com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData fieldsData;

        public Adapter(com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData r1) {
                r0 = this;
                r0.<init>()
                r0.fieldsData = r1
                return
        }

        public abstract A createAccumulator();

        public abstract T finalize(A r1);

        @Override // com.google.gson.TypeAdapter
        public T read(com.google.gson.stream.JsonReader r4) throws java.io.IOException {
                r3 = this;
                com.google.gson.stream.JsonToken r0 = r4.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r4.nextNull()
                r4 = 0
                return r4
            Ld:
                java.lang.Object r0 = r3.createAccumulator()
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$FieldsData r1 = r3.fieldsData
                java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField> r1 = r1.deserializedFields
                r4.beginObject()     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L30
            L18:
                boolean r2 = r4.hasNext()     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L30
                if (r2 == 0) goto L36
                java.lang.String r2 = r4.nextName()     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L30
                java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L30
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r2 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r2     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L30
                if (r2 != 0) goto L32
                r4.skipValue()     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L30
                goto L18
            L2e:
                r4 = move-exception
                goto L3e
            L30:
                r4 = move-exception
                goto L43
            L32:
                r3.readField(r0, r4, r2)     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L30
                goto L18
            L36:
                r4.endObject()
                java.lang.Object r4 = r3.finalize(r0)
                return r4
            L3e:
                java.lang.RuntimeException r4 = com.google.gson.internal.reflect.ReflectionHelper.createExceptionForUnexpectedIllegalAccess(r4)
                throw r4
            L43:
                com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
                r0.<init>(r4)
                throw r0
        }

        public abstract void readField(A r1, com.google.gson.stream.JsonReader r2, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField r3) throws java.lang.IllegalAccessException, java.io.IOException;

        @Override // com.google.gson.TypeAdapter
        public void write(com.google.gson.stream.JsonWriter r3, T r4) throws java.io.IOException {
                r2 = this;
                if (r4 != 0) goto L6
                r3.nullValue()
                return
            L6:
                r3.beginObject()
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$FieldsData r0 = r2.fieldsData     // Catch: java.lang.IllegalAccessException -> L21
                java.util.List<com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField> r0 = r0.serializedFields     // Catch: java.lang.IllegalAccessException -> L21
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.IllegalAccessException -> L21
            L11:
                boolean r1 = r0.hasNext()     // Catch: java.lang.IllegalAccessException -> L21
                if (r1 == 0) goto L23
                java.lang.Object r1 = r0.next()     // Catch: java.lang.IllegalAccessException -> L21
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r1 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r1     // Catch: java.lang.IllegalAccessException -> L21
                r1.write(r3, r4)     // Catch: java.lang.IllegalAccessException -> L21
                goto L11
            L21:
                r3 = move-exception
                goto L27
            L23:
                r3.endObject()
                return
            L27:
                java.lang.RuntimeException r3 = com.google.gson.internal.reflect.ReflectionHelper.createExceptionForUnexpectedIllegalAccess(r3)
                throw r3
        }
    }

    public static abstract class BoundField {
        final java.lang.reflect.Field field;
        final java.lang.String fieldName;
        final java.lang.String serializedName;

        public BoundField(java.lang.String r1, java.lang.reflect.Field r2) {
                r0 = this;
                r0.<init>()
                r0.serializedName = r1
                r0.field = r2
                java.lang.String r1 = r2.getName()
                r0.fieldName = r1
                return
        }

        public abstract void readIntoArray(com.google.gson.stream.JsonReader r1, int r2, java.lang.Object[] r3) throws java.io.IOException, com.google.gson.JsonParseException;

        public abstract void readIntoField(com.google.gson.stream.JsonReader r1, java.lang.Object r2) throws java.io.IOException, java.lang.IllegalAccessException;

        public abstract void write(com.google.gson.stream.JsonWriter r1, java.lang.Object r2) throws java.io.IOException, java.lang.IllegalAccessException;
    }

    public static final class FieldReflectionAdapter<T> extends com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<T, T> {
        private final com.google.gson.internal.ObjectConstructor<T> constructor;

        public FieldReflectionAdapter(com.google.gson.internal.ObjectConstructor<T> r1, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData r2) {
                r0 = this;
                r0.<init>(r2)
                r0.constructor = r1
                return
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T createAccumulator() {
                r1 = this;
                com.google.gson.internal.ObjectConstructor<T> r0 = r1.constructor
                java.lang.Object r0 = r0.construct()
                return r0
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public T finalize(T r1) {
                r0 = this;
                return r1
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public void readField(T r1, com.google.gson.stream.JsonReader r2, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField r3) throws java.lang.IllegalAccessException, java.io.IOException {
                r0 = this;
                r3.readIntoField(r2, r1)
                return
        }
    }

    public static class FieldsData {
        static final com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData EMPTY = null;
        final java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> deserializedFields;
        final java.util.List<com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> serializedFields;

        static {
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$FieldsData r0 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$FieldsData
                java.util.Map r1 = java.util.Collections.emptyMap()
                java.util.List r2 = java.util.Collections.emptyList()
                r0.<init>(r1, r2)
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData.EMPTY = r0
                return
        }

        public FieldsData(java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> r1, java.util.List<com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> r2) {
                r0 = this;
                r0.<init>()
                r0.deserializedFields = r1
                r0.serializedFields = r2
                return
        }
    }

    public static final class RecordAdapter<T> extends com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter<T, java.lang.Object[]> {
        static final java.util.Map<java.lang.Class<?>, java.lang.Object> PRIMITIVE_DEFAULTS = null;
        private final java.util.Map<java.lang.String, java.lang.Integer> componentIndices;
        private final java.lang.reflect.Constructor<T> constructor;
        private final java.lang.Object[] constructorArgsDefaults;

        static {
                java.util.Map r0 = primitiveDefaults()
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.RecordAdapter.PRIMITIVE_DEFAULTS = r0
                return
        }

        public RecordAdapter(java.lang.Class<T> r4, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData r5, boolean r6) {
                r3 = this;
                r3.<init>(r5)
                java.util.HashMap r5 = new java.util.HashMap
                r5.<init>()
                r3.componentIndices = r5
                java.lang.reflect.Constructor r5 = com.google.gson.internal.reflect.ReflectionHelper.getCanonicalRecordConstructor(r4)
                r3.constructor = r5
                if (r6 == 0) goto L17
                r6 = 0
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.access$000(r6, r5)
                goto L1a
            L17:
                com.google.gson.internal.reflect.ReflectionHelper.makeAccessible(r5)
            L1a:
                java.lang.String[] r4 = com.google.gson.internal.reflect.ReflectionHelper.getRecordComponentNames(r4)
                r5 = 0
                r6 = r5
            L20:
                int r0 = r4.length
                if (r6 >= r0) goto L31
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r3.componentIndices
                r1 = r4[r6]
                java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
                r0.put(r1, r2)
                int r6 = r6 + 1
                goto L20
            L31:
                java.lang.reflect.Constructor<T> r4 = r3.constructor
                java.lang.Class[] r4 = r4.getParameterTypes()
                int r6 = r4.length
                java.lang.Object[] r6 = new java.lang.Object[r6]
                r3.constructorArgsDefaults = r6
            L3c:
                int r6 = r4.length
                if (r5 >= r6) goto L4e
                java.lang.Object[] r6 = r3.constructorArgsDefaults
                java.util.Map<java.lang.Class<?>, java.lang.Object> r0 = com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.RecordAdapter.PRIMITIVE_DEFAULTS
                r1 = r4[r5]
                java.lang.Object r0 = r0.get(r1)
                r6[r5] = r0
                int r5 = r5 + 1
                goto L3c
            L4e:
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
                java.lang.Character r2 = java.lang.Character.valueOf(r2)
                r0.put(r1, r2)
                java.lang.Class r1 = java.lang.Boolean.TYPE
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                r0.put(r1, r2)
                return r0
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public /* bridge */ /* synthetic */ java.lang.Object[] createAccumulator() {
                r1 = this;
                java.lang.Object[] r0 = r1.createAccumulator2()
                return r0
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        /* JADX INFO: renamed from: createAccumulator, reason: avoid collision after fix types in other method */
        public java.lang.Object[] createAccumulator2() {
                r1 = this;
                java.lang.Object[] r0 = r1.constructorArgsDefaults
                java.lang.Object r0 = r0.clone()
                java.lang.Object[] r0 = (java.lang.Object[]) r0
                return r0
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public /* bridge */ /* synthetic */ java.lang.Object finalize(java.lang.Object[] r1) {
                r0 = this;
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                java.lang.Object r1 = r0.finalize2(r1)
                return r1
        }

        /* JADX INFO: renamed from: finalize, reason: avoid collision after fix types in other method */
        public T finalize2(java.lang.Object[] r6) {
                r5 = this;
                java.lang.String r0 = "' with args "
                java.lang.String r1 = "Failed to invoke constructor '"
                java.lang.reflect.Constructor<T> r2 = r5.constructor     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.IllegalArgumentException -> Ld java.lang.InstantiationException -> Lf java.lang.IllegalAccessException -> L11
                java.lang.Object r6 = r2.newInstance(r6)     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.IllegalArgumentException -> Ld java.lang.InstantiationException -> Lf java.lang.IllegalAccessException -> L11
                return r6
            Lb:
                r2 = move-exception
                goto L13
            Ld:
                r2 = move-exception
                goto L3c
            Lf:
                r2 = move-exception
                goto L3c
            L11:
                r6 = move-exception
                goto L61
            L13:
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r1)
                java.lang.reflect.Constructor<T> r1 = r5.constructor
                java.lang.String r1 = com.google.gson.internal.reflect.ReflectionHelper.constructorToString(r1)
                r4.append(r1)
                r4.append(r0)
                java.lang.String r6 = java.util.Arrays.toString(r6)
                r4.append(r6)
                java.lang.String r6 = r4.toString()
                java.lang.Throwable r0 = r2.getCause()
                r3.<init>(r6, r0)
                throw r3
            L3c:
                java.lang.RuntimeException r3 = new java.lang.RuntimeException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r1)
                java.lang.reflect.Constructor<T> r1 = r5.constructor
                java.lang.String r1 = com.google.gson.internal.reflect.ReflectionHelper.constructorToString(r1)
                r4.append(r1)
                r4.append(r0)
                java.lang.String r6 = java.util.Arrays.toString(r6)
                r4.append(r6)
                java.lang.String r6 = r4.toString()
                r3.<init>(r6, r2)
                throw r3
            L61:
                java.lang.RuntimeException r6 = com.google.gson.internal.reflect.ReflectionHelper.createExceptionForUnexpectedIllegalAccess(r6)
                throw r6
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public /* bridge */ /* synthetic */ void readField(java.lang.Object[] r1, com.google.gson.stream.JsonReader r2, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField r3) throws java.lang.IllegalAccessException, java.io.IOException {
                r0 = this;
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                r0.readField2(r1, r2, r3)
                return
        }

        /* JADX INFO: renamed from: readField, reason: avoid collision after fix types in other method */
        public void readField2(java.lang.Object[] r3, com.google.gson.stream.JsonReader r4, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField r5) throws java.io.IOException {
                r2 = this;
                java.util.Map<java.lang.String, java.lang.Integer> r0 = r2.componentIndices
                java.lang.String r1 = r5.fieldName
                java.lang.Object r0 = r0.get(r1)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L14
                int r0 = r0.intValue()
                r5.readIntoArray(r4, r0, r3)
                return
            L14:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "Could not find the index in the constructor '"
                r4.append(r0)
                java.lang.reflect.Constructor<T> r0 = r2.constructor
                java.lang.String r0 = com.google.gson.internal.reflect.ReflectionHelper.constructorToString(r0)
                r4.append(r0)
                java.lang.String r0 = "' for field with name '"
                r4.append(r0)
                java.lang.String r5 = r5.fieldName
                r4.append(r5)
                java.lang.String r5 = "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters."
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
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

    public static /* synthetic */ void access$000(java.lang.Object r0, java.lang.reflect.AccessibleObject r1) {
            checkAccessible(r0, r1)
            return
    }

    private static <M extends java.lang.reflect.AccessibleObject & java.lang.reflect.Member> void checkAccessible(java.lang.Object r1, M r2) {
            r0 = r2
            java.lang.reflect.Member r0 = (java.lang.reflect.Member) r0
            int r0 = r0.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto Le
            r1 = 0
        Le:
            boolean r1 = com.google.gson.internal.ReflectionAccessFilterHelper.canAccess(r2, r1)
            if (r1 == 0) goto L15
            return
        L15:
            r1 = 1
            java.lang.String r1 = com.google.gson.internal.reflect.ReflectionHelper.getAccessibleObjectDescription(r2, r1)
            com.google.gson.JsonIOException r2 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r2.<init>(r1)
            throw r2
    }

    private com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField createBoundField(com.google.gson.Gson r15, java.lang.reflect.Field r16, java.lang.reflect.Method r17, java.lang.String r18, com.google.gson.reflect.TypeToken<?> r19, boolean r20, boolean r21) {
            r14 = this;
            r10 = r14
            r6 = r15
            java.lang.Class r0 = r19.getRawType()
            boolean r8 = com.google.gson.internal.Primitives.isPrimitive(r0)
            int r0 = r16.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r0)
            r7 = 0
            r9 = 1
            if (r1 == 0) goto L1e
            boolean r0 = java.lang.reflect.Modifier.isFinal(r0)
            if (r0 == 0) goto L1e
            r11 = r9
            goto L1f
        L1e:
            r11 = r7
        L1f:
            java.lang.Class<com.google.gson.annotations.JsonAdapter> r0 = com.google.gson.annotations.JsonAdapter.class
            r12 = r16
            java.lang.annotation.Annotation r0 = r12.getAnnotation(r0)
            r4 = r0
            com.google.gson.annotations.JsonAdapter r4 = (com.google.gson.annotations.JsonAdapter) r4
            if (r4 == 0) goto L39
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r0 = r10.jsonAdapterFactory
            com.google.gson.internal.ConstructorConstructor r1 = r10.constructorConstructor
            r5 = 0
            r2 = r15
            r3 = r19
            com.google.gson.TypeAdapter r0 = r0.getTypeAdapter(r1, r2, r3, r4, r5)
            goto L3a
        L39:
            r0 = 0
        L3a:
            if (r0 == 0) goto L3d
            r7 = r9
        L3d:
            r1 = r19
            if (r0 != 0) goto L45
            com.google.gson.TypeAdapter r0 = r15.getAdapter(r1)
        L45:
            r9 = r0
            if (r20 == 0) goto L57
            if (r7 == 0) goto L4c
            r0 = r9
            goto L55
        L4c:
            com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper r0 = new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper
            java.lang.reflect.Type r1 = r19.getType()
            r0.<init>(r15, r9, r1)
        L55:
            r6 = r0
            goto L58
        L57:
            r6 = r9
        L58:
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$2 r13 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$2
            r0 = r13
            r1 = r14
            r2 = r18
            r3 = r16
            r4 = r21
            r5 = r17
            r7 = r9
            r9 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r13
    }

    private static java.lang.IllegalArgumentException createDuplicateFieldException(java.lang.Class<?> r3, java.lang.String r4, java.lang.reflect.Field r5, java.lang.reflect.Field r6) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Class "
            r1.append(r2)
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = " declares multiple JSON fields named '"
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = "'; conflict is caused by fields "
            r1.append(r3)
            java.lang.String r3 = com.google.gson.internal.reflect.ReflectionHelper.fieldToString(r5)
            r1.append(r3)
            java.lang.String r3 = " and "
            r1.append(r3)
            java.lang.String r3 = com.google.gson.internal.reflect.ReflectionHelper.fieldToString(r6)
            r1.append(r3)
            java.lang.String r3 = "\nSee "
            r1.append(r3)
            java.lang.String r3 = "duplicate-fields"
            java.lang.String r3 = com.google.gson.internal.TroubleshootingGuide.createUrl(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData getBoundFields(com.google.gson.Gson r24, com.google.gson.reflect.TypeToken<?> r25, java.lang.Class<?> r26, boolean r27, boolean r28) {
            r23 = this;
            r8 = r23
            r9 = r26
            boolean r0 = r26.isInterface()
            if (r0 == 0) goto Ld
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$FieldsData r0 = com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.FieldsData.EMPTY
            return r0
        Ld:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            r12 = r25
            r0 = r27
            r13 = r9
        L1c:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r13 == r1) goto L15d
            java.lang.reflect.Field[] r14 = r13.getDeclaredFields()
            r15 = 1
            r7 = 0
            if (r13 == r9) goto L3c
            int r1 = r14.length
            if (r1 <= 0) goto L3c
            java.util.List<com.google.gson.ReflectionAccessFilter> r0 = r8.reflectionFilters
            com.google.gson.ReflectionAccessFilter$FilterResult r0 = com.google.gson.internal.ReflectionAccessFilterHelper.getFilterResult(r0, r13)
            com.google.gson.ReflectionAccessFilter$FilterResult r1 = com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL
            if (r0 == r1) goto L3f
            com.google.gson.ReflectionAccessFilter$FilterResult r1 = com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE
            if (r0 != r1) goto L3b
            r0 = r15
            goto L3c
        L3b:
            r0 = r7
        L3c:
            r16 = r0
            goto L63
        L3f:
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ReflectionAccessFilter does not permit using reflection for "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = " (supertype of "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "). Register a TypeAdapter for this type or adjust the access filter."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L63:
            int r6 = r14.length
            r5 = r7
        L65:
            if (r5 >= r6) goto L145
            r4 = r14[r5]
            boolean r17 = r8.includeField(r4, r15)
            boolean r0 = r8.includeField(r4, r7)
            if (r17 != 0) goto L7d
            if (r0 != 0) goto L7d
            r21 = r5
            r19 = r6
            r22 = r7
            goto L13c
        L7d:
            r1 = 0
            if (r28 == 0) goto Lc6
            int r2 = r4.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
            if (r2 == 0) goto L8e
            r3 = r1
            r18 = r7
            goto Lc9
        L8e:
            java.lang.reflect.Method r1 = com.google.gson.internal.reflect.ReflectionHelper.getAccessor(r13, r4)
            if (r16 != 0) goto L97
            com.google.gson.internal.reflect.ReflectionHelper.makeAccessible(r1)
        L97:
            java.lang.Class<com.google.gson.annotations.SerializedName> r2 = com.google.gson.annotations.SerializedName.class
            java.lang.annotation.Annotation r3 = r1.getAnnotation(r2)
            if (r3 == 0) goto Lc6
            java.lang.annotation.Annotation r2 = r4.getAnnotation(r2)
            if (r2 == 0) goto La6
            goto Lc6
        La6:
            java.lang.String r0 = com.google.gson.internal.reflect.ReflectionHelper.getAccessibleObjectDescription(r1, r7)
            com.google.gson.JsonIOException r1 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "@SerializedName on "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " is not supported"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        Lc6:
            r18 = r0
            r3 = r1
        Lc9:
            if (r16 != 0) goto Ld0
            if (r3 != 0) goto Ld0
            com.google.gson.internal.reflect.ReflectionHelper.makeAccessible(r4)
        Ld0:
            java.lang.reflect.Type r0 = r12.getType()
            java.lang.reflect.Type r1 = r4.getGenericType()
            java.lang.reflect.Type r0 = com.google.gson.internal.GsonTypes.resolve(r0, r13, r1)
            java.util.List r2 = r8.getFieldNames(r4)
            java.lang.Object r1 = r2.get(r7)
            java.lang.String r1 = (java.lang.String) r1
            com.google.gson.reflect.TypeToken r19 = com.google.gson.reflect.TypeToken.get(r0)
            r0 = r23
            r25 = r1
            r1 = r24
            r20 = r2
            r2 = r4
            r15 = r4
            r4 = r25
            r21 = r5
            r5 = r19
            r19 = r6
            r6 = r17
            r22 = r7
            r7 = r16
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r0 = r0.createBoundField(r1, r2, r3, r4, r5, r6, r7)
            if (r18 == 0) goto L128
            java.util.Iterator r1 = r20.iterator()
        L10c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L128
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.put(r2, r0)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r3 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r3
            if (r3 != 0) goto L121
            goto L10c
        L121:
            java.lang.reflect.Field r0 = r3.field
            java.lang.IllegalArgumentException r0 = createDuplicateFieldException(r9, r2, r0, r15)
            throw r0
        L128:
            if (r17 == 0) goto L13c
            r1 = r25
            java.lang.Object r0 = r11.put(r1, r0)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r0 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r0
            if (r0 != 0) goto L135
            goto L13c
        L135:
            java.lang.reflect.Field r0 = r0.field
            java.lang.IllegalArgumentException r0 = createDuplicateFieldException(r9, r1, r0, r15)
            throw r0
        L13c:
            int r5 = r21 + 1
            r6 = r19
            r7 = r22
            r15 = 1
            goto L65
        L145:
            java.lang.reflect.Type r0 = r12.getType()
            java.lang.reflect.Type r1 = r13.getGenericSuperclass()
            java.lang.reflect.Type r0 = com.google.gson.internal.GsonTypes.resolve(r0, r13, r1)
            com.google.gson.reflect.TypeToken r12 = com.google.gson.reflect.TypeToken.get(r0)
            java.lang.Class r13 = r12.getRawType()
            r0 = r16
            goto L1c
        L15d:
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$FieldsData r0 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$FieldsData
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Collection r2 = r11.values()
            r1.<init>(r2)
            r0.<init>(r10, r1)
            return r0
    }

    private java.util.List<java.lang.String> getFieldNames(java.lang.reflect.Field r5) {
            r4 = this;
            java.lang.Class<com.google.gson.annotations.SerializedName> r0 = com.google.gson.annotations.SerializedName.class
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r0)
            com.google.gson.annotations.SerializedName r0 = (com.google.gson.annotations.SerializedName) r0
            if (r0 != 0) goto L17
            com.google.gson.FieldNamingStrategy r0 = r4.fieldNamingPolicy
            java.lang.String r0 = r0.translateName(r5)
            com.google.gson.FieldNamingStrategy r1 = r4.fieldNamingPolicy
            java.util.List r5 = r1.alternateNames(r5)
            goto L26
        L17:
            java.lang.String r5 = r0.value()
            java.lang.String[] r0 = r0.alternate()
            java.util.List r0 = java.util.Arrays.asList(r0)
            r3 = r0
            r0 = r5
            r5 = r3
        L26:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L31
            java.util.List r5 = java.util.Collections.singletonList(r0)
            return r5
        L31:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r5.size()
            int r2 = r2 + 1
            r1.<init>(r2)
            r1.add(r0)
            r1.addAll(r5)
            return r1
    }

    private boolean includeField(java.lang.reflect.Field r2, boolean r3) {
            r1 = this;
            com.google.gson.internal.Excluder r0 = r1.excluder
            boolean r2 = r0.excludeField(r2, r3)
            r2 = r2 ^ 1
            return r2
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r11, com.google.gson.reflect.TypeToken<T> r12) {
            r10 = this;
            java.lang.Class r6 = r12.getRawType()
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r0.isAssignableFrom(r6)
            if (r0 != 0) goto Le
            r11 = 0
            return r11
        Le:
            boolean r0 = com.google.gson.internal.reflect.ReflectionHelper.isAnonymousOrNonStaticLocal(r6)
            if (r0 == 0) goto L1a
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1 r11 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1
            r11.<init>(r10)
            return r11
        L1a:
            java.util.List<com.google.gson.ReflectionAccessFilter> r0 = r10.reflectionFilters
            com.google.gson.ReflectionAccessFilter$FilterResult r0 = com.google.gson.internal.ReflectionAccessFilterHelper.getFilterResult(r0, r6)
            com.google.gson.ReflectionAccessFilter$FilterResult r1 = com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL
            if (r0 == r1) goto L59
            com.google.gson.ReflectionAccessFilter$FilterResult r1 = com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE
            r2 = 1
            if (r0 != r1) goto L2b
            r7 = r2
            goto L2d
        L2b:
            r0 = 0
            r7 = r0
        L2d:
            boolean r0 = com.google.gson.internal.reflect.ReflectionHelper.isRecord(r6)
            if (r0 == 0) goto L43
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$RecordAdapter r8 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$RecordAdapter
            r5 = 1
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r6
            r4 = r7
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$FieldsData r11 = r0.getBoundFields(r1, r2, r3, r4, r5)
            r8.<init>(r6, r11, r7)
            return r8
        L43:
            com.google.gson.internal.ConstructorConstructor r0 = r10.constructorConstructor
            com.google.gson.internal.ObjectConstructor r8 = r0.get(r12, r2)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$FieldReflectionAdapter r9 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$FieldReflectionAdapter
            r5 = 0
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r6
            r4 = r7
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$FieldsData r11 = r0.getBoundFields(r1, r2, r3, r4, r5)
            r9.<init>(r8, r11)
            return r9
        L59:
            com.google.gson.JsonIOException r11 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "ReflectionAccessFilter does not permit using reflection for "
            r12.append(r0)
            r12.append(r6)
            java.lang.String r0 = ". Register a TypeAdapter for this type or adjust the access filter."
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }
}
