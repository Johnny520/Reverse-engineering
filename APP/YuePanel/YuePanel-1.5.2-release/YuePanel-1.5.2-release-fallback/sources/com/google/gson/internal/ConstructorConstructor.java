package com.google.gson.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class ConstructorConstructor {
    private final java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> instanceCreators;
    private final java.util.List<com.google.gson.ReflectionAccessFilter> reflectionFilters;
    private final boolean useJdkUnsafe;

    public static final class InstanceCreatorConstructor<T> implements com.google.gson.internal.ObjectConstructor<T> {
        private final com.google.gson.InstanceCreator<T> instanceCreator;
        private final java.lang.reflect.Type type;

        public InstanceCreatorConstructor(com.google.gson.InstanceCreator<T> r1, java.lang.reflect.Type r2) {
                r0 = this;
                r0.<init>()
                r0.instanceCreator = r1
                r0.type = r2
                return
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public T construct() {
                r2 = this;
                com.google.gson.InstanceCreator<T> r0 = r2.instanceCreator
                java.lang.reflect.Type r1 = r2.type
                java.lang.Object r0 = r0.createInstance(r1)
                return r0
        }
    }

    public static final class ThrowingObjectConstructor<T> implements com.google.gson.internal.ObjectConstructor<T> {
        private final java.lang.String exceptionMessage;

        public ThrowingObjectConstructor(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.exceptionMessage = r1
                return
        }

        @Override // com.google.gson.internal.ObjectConstructor
        public T construct() {
                r2 = this;
                com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
                java.lang.String r1 = r2.exceptionMessage
                r0.<init>(r1)
                throw r0
        }
    }

    public ConstructorConstructor(java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r1, boolean r2, java.util.List<com.google.gson.ReflectionAccessFilter> r3) {
            r0 = this;
            r0.<init>()
            r0.instanceCreators = r1
            r0.useJdkUnsafe = r2
            r0.reflectionFilters = r3
            return
    }

    public static java.lang.String checkInstantiable(java.lang.Class<?> r2) {
            int r0 = r2.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isInterface(r0)
            if (r1 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: "
            r0.append(r1)
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L20:
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 == 0) goto L4a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: "
            r0.append(r1)
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            java.lang.String r2 = "\nSee "
            r0.append(r2)
            java.lang.String r2 = "r8-abstract-class"
            java.lang.String r2 = com.google.gson.internal.TroubleshootingGuide.createUrl(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L4a:
            r2 = 0
            return r2
    }

    private static boolean hasStringKeyType(java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            int r0 = r3.length
            r2 = 0
            if (r0 != 0) goto L11
            return r2
        L11:
            r3 = r3[r2]
            java.lang.Class r3 = com.google.gson.internal.GsonTypes.getRawType(r3)
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r3 != r0) goto L1c
            goto L1d
        L1c:
            r1 = r2
        L1d:
            return r1
    }

    private static /* synthetic */ java.lang.Object lambda$newDefaultConstructor$2(java.lang.reflect.Constructor r5) {
            java.lang.String r0 = "' with no args"
            java.lang.String r1 = "Failed to invoke constructor '"
            r2 = 0
            java.lang.Object r5 = r5.newInstance(r2)     // Catch: java.lang.IllegalAccessException -> La java.lang.reflect.InvocationTargetException -> L10 java.lang.InstantiationException -> L31
            return r5
        La:
            r5 = move-exception
            java.lang.RuntimeException r5 = com.google.gson.internal.reflect.ReflectionHelper.createExceptionForUnexpectedIllegalAccess(r5)
            throw r5
        L10:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = com.google.gson.internal.reflect.ReflectionHelper.constructorToString(r5)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = r4.toString()
            java.lang.Throwable r0 = r2.getCause()
            r3.<init>(r5, r0)
            throw r3
        L31:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r5 = com.google.gson.internal.reflect.ReflectionHelper.constructorToString(r5)
            r4.append(r5)
            r4.append(r0)
            java.lang.String r5 = r4.toString()
            r3.<init>(r5, r2)
            throw r3
    }

    private static /* synthetic */ java.util.Map lambda$newMapConstructor$3() {
            com.google.gson.internal.LinkedTreeMap r0 = new com.google.gson.internal.LinkedTreeMap
            r0.<init>()
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$newSpecialCollectionConstructor$0(java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            java.lang.String r1 = "Invalid EnumSet type: "
            if (r0 == 0) goto L30
            r0 = r3
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r2 = 0
            r0 = r0[r2]
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto L1b
            java.lang.Class r0 = (java.lang.Class) r0
            java.util.EnumSet r3 = java.util.EnumSet.noneOf(r0)
            return r3
        L1b:
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r0.<init>(r3)
            throw r0
        L30:
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r0.<init>(r3)
            throw r0
    }

    private static /* synthetic */ java.lang.Object lambda$newSpecialCollectionConstructor$1(java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            java.lang.String r1 = "Invalid EnumMap type: "
            if (r0 == 0) goto L31
            r0 = r3
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r2 = 0
            r0 = r0[r2]
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto L1c
            java.util.EnumMap r3 = new java.util.EnumMap
            java.lang.Class r0 = (java.lang.Class) r0
            r3.<init>(r0)
            return r3
        L1c:
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r0.<init>(r3)
            throw r0
        L31:
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r0.<init>(r3)
            throw r0
    }

    private static /* synthetic */ java.lang.Object lambda$newUnsafeAllocator$4(java.lang.Class r4) {
            com.google.gson.internal.UnsafeAllocator r0 = com.google.gson.internal.UnsafeAllocator.INSTANCE     // Catch: java.lang.Exception -> L7
            java.lang.Object r4 = r0.newInstance(r4)     // Catch: java.lang.Exception -> L7
            return r4
        L7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unable to create instance of "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
    }

    private static com.google.gson.internal.ObjectConstructor<? extends java.util.Collection<?>> newCollectionConstructor(java.lang.Class<?> r1) {
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto Le
            Yue.ۥ۟ۧ۟ۥ r1 = new Yue.ۥ۟ۧ۟ۥ
            r1.<init>()
            return r1
        Le:
            java.lang.Class<java.util.LinkedHashSet> r0 = java.util.LinkedHashSet.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L1c
            Yue.ۥ۟ۧ۠ r1 = new Yue.ۥ۟ۧ۠
            r1.<init>()
            return r1
        L1c:
            java.lang.Class<java.util.TreeSet> r0 = java.util.TreeSet.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L2a
            Yue.ۥ۟ۧ۠۟ r1 = new Yue.ۥ۟ۧ۠۟
            r1.<init>()
            return r1
        L2a:
            java.lang.Class<java.util.ArrayDeque> r0 = java.util.ArrayDeque.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 == 0) goto L38
            Yue.ۥ۟ۧ۠۠ r1 = new Yue.ۥ۟ۧ۠۠
            r1.<init>()
            return r1
        L38:
            r1 = 0
            return r1
    }

    private static <T> com.google.gson.internal.ObjectConstructor<T> newDefaultConstructor(java.lang.Class<? super T> r3, com.google.gson.ReflectionAccessFilter.FilterResult r4) {
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            java.lang.reflect.Constructor r0 = r3.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L59
            com.google.gson.ReflectionAccessFilter$FilterResult r2 = com.google.gson.ReflectionAccessFilter.FilterResult.ALLOW
            if (r4 == r2) goto L45
            boolean r1 = com.google.gson.internal.ReflectionAccessFilterHelper.canAccess(r0, r1)
            if (r1 == 0) goto L29
            com.google.gson.ReflectionAccessFilter$FilterResult r1 = com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL
            if (r4 != r1) goto L45
            int r1 = r0.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L29
            goto L45
        L29:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Unable to invoke no-args constructor of "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.google.gson.internal.ConstructorConstructor$ThrowingObjectConstructor r4 = new com.google.gson.internal.ConstructorConstructor$ThrowingObjectConstructor
            r4.<init>(r3)
            return r4
        L45:
            if (r4 != r2) goto L53
            java.lang.String r3 = com.google.gson.internal.reflect.ReflectionHelper.tryMakeAccessible(r0)
            if (r3 == 0) goto L53
            com.google.gson.internal.ConstructorConstructor$ThrowingObjectConstructor r4 = new com.google.gson.internal.ConstructorConstructor$ThrowingObjectConstructor
            r4.<init>(r3)
            return r4
        L53:
            Yue.ۥ۟ۧ۟ۨ r3 = new Yue.ۥ۟ۧ۟ۨ
            r3.<init>(r0)
            return r3
        L59:
            return r1
    }

    private static <T> com.google.gson.internal.ObjectConstructor<T> newDefaultImplementationConstructor(java.lang.reflect.Type r1, java.lang.Class<? super T> r2) {
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto Ld
            com.google.gson.internal.ObjectConstructor r1 = newCollectionConstructor(r2)
            return r1
        Ld:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L1a
            com.google.gson.internal.ObjectConstructor r1 = newMapConstructor(r1, r2)
            return r1
        L1a:
            r1 = 0
            return r1
    }

    private static com.google.gson.internal.ObjectConstructor<? extends java.util.Map<?, java.lang.Object>> newMapConstructor(java.lang.reflect.Type r1, java.lang.Class<?> r2) {
            java.lang.Class<com.google.gson.internal.LinkedTreeMap> r0 = com.google.gson.internal.LinkedTreeMap.class
            boolean r0 = r2.isAssignableFrom(r0)
            if (r0 == 0) goto L14
            boolean r1 = hasStringKeyType(r1)
            if (r1 == 0) goto L14
            Yue.ۥ۟ۧ۠ۤ r1 = new Yue.ۥ۟ۧ۠ۤ
            r1.<init>()
            return r1
        L14:
            java.lang.Class<java.util.LinkedHashMap> r1 = java.util.LinkedHashMap.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L22
            Yue.ۥ۟ۧ۠ۥ r1 = new Yue.ۥ۟ۧ۠ۥ
            r1.<init>()
            return r1
        L22:
            java.lang.Class<java.util.TreeMap> r1 = java.util.TreeMap.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L30
            Yue.ۥ۟ۧ۠ۦ r1 = new Yue.ۥ۟ۧ۠ۦ
            r1.<init>()
            return r1
        L30:
            java.lang.Class<java.util.concurrent.ConcurrentHashMap> r1 = java.util.concurrent.ConcurrentHashMap.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L3e
            Yue.ۥ۟ۧ۟ۦ r1 = new Yue.ۥ۟ۧ۟ۦ
            r1.<init>()
            return r1
        L3e:
            java.lang.Class<java.util.concurrent.ConcurrentSkipListMap> r1 = java.util.concurrent.ConcurrentSkipListMap.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L4c
            Yue.ۥ۟ۧ۟ۧ r1 = new Yue.ۥ۟ۧ۟ۧ
            r1.<init>()
            return r1
        L4c:
            r1 = 0
            return r1
    }

    private static <T> com.google.gson.internal.ObjectConstructor<T> newSpecialCollectionConstructor(java.lang.reflect.Type r1, java.lang.Class<? super T> r2) {
            java.lang.Class<java.util.EnumSet> r0 = java.util.EnumSet.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto Le
            Yue.ۥ۟ۧ۠ۢ r2 = new Yue.ۥ۟ۧ۠ۢ
            r2.<init>(r1)
            return r2
        Le:
            java.lang.Class<java.util.EnumMap> r0 = java.util.EnumMap.class
            if (r2 != r0) goto L18
            Yue.ۥۣ۟ۧ۠ r2 = new Yue.ۥۣ۟ۧ۠
            r2.<init>(r1)
            return r2
        L18:
            r1 = 0
            return r1
    }

    private <T> com.google.gson.internal.ObjectConstructor<T> newUnsafeAllocator(java.lang.Class<? super T> r3) {
            r2 = this;
            boolean r0 = r2.useJdkUnsafe
            if (r0 == 0) goto La
            Yue.ۥ۟ۧ۠ۡ r0 = new Yue.ۥ۟ۧ۠ۡ
            r0.<init>(r3)
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to create instance of "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.reflect.Constructor[] r3 = r3.getDeclaredConstructors()
            int r3 = r3.length
            if (r3 != 0) goto L38
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = " Or adjust your R8 configuration to keep the no-args constructor of the class."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L38:
            com.google.gson.internal.ConstructorConstructor$ThrowingObjectConstructor r3 = new com.google.gson.internal.ConstructorConstructor$ThrowingObjectConstructor
            r3.<init>(r0)
            return r3
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m30639(java.lang.Class r0) {
            java.lang.Object r0 = lambda$newUnsafeAllocator$4(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m30640(java.lang.reflect.Type r0) {
            java.lang.Object r0 = lambda$newSpecialCollectionConstructor$1(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.util.Map m30641() {
            java.util.Map r0 = lambda$newMapConstructor$3()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m30642(java.lang.reflect.Type r0) {
            java.lang.Object r0 = lambda$newSpecialCollectionConstructor$0(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m30643(java.lang.reflect.Constructor r0) {
            java.lang.Object r0 = lambda$newDefaultConstructor$2(r0)
            return r0
    }

    public <T> com.google.gson.internal.ObjectConstructor<T> get(com.google.gson.reflect.TypeToken<T> r2) {
            r1 = this;
            r0 = 1
            com.google.gson.internal.ObjectConstructor r2 = r1.get(r2, r0)
            return r2
    }

    public <T> com.google.gson.internal.ObjectConstructor<T> get(com.google.gson.reflect.TypeToken<T> r4, boolean r5) {
            r3 = this;
            java.lang.reflect.Type r0 = r4.getType()
            java.lang.Class r4 = r4.getRawType()
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r1 = r3.instanceCreators
            java.lang.Object r1 = r1.get(r0)
            com.google.gson.InstanceCreator r1 = (com.google.gson.InstanceCreator) r1
            if (r1 == 0) goto L18
            com.google.gson.internal.ConstructorConstructor$InstanceCreatorConstructor r4 = new com.google.gson.internal.ConstructorConstructor$InstanceCreatorConstructor
            r4.<init>(r1, r0)
            return r4
        L18:
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r1 = r3.instanceCreators
            java.lang.Object r1 = r1.get(r4)
            com.google.gson.InstanceCreator r1 = (com.google.gson.InstanceCreator) r1
            if (r1 == 0) goto L28
            com.google.gson.internal.ConstructorConstructor$InstanceCreatorConstructor r4 = new com.google.gson.internal.ConstructorConstructor$InstanceCreatorConstructor
            r4.<init>(r1, r0)
            return r4
        L28:
            com.google.gson.internal.ObjectConstructor r1 = newSpecialCollectionConstructor(r0, r4)
            if (r1 == 0) goto L2f
            return r1
        L2f:
            java.util.List<com.google.gson.ReflectionAccessFilter> r1 = r3.reflectionFilters
            com.google.gson.ReflectionAccessFilter$FilterResult r1 = com.google.gson.internal.ReflectionAccessFilterHelper.getFilterResult(r1, r4)
            com.google.gson.internal.ObjectConstructor r2 = newDefaultConstructor(r4, r1)
            if (r2 == 0) goto L3c
            return r2
        L3c:
            com.google.gson.internal.ObjectConstructor r0 = newDefaultImplementationConstructor(r0, r4)
            if (r0 == 0) goto L43
            return r0
        L43:
            java.lang.String r0 = checkInstantiable(r4)
            if (r0 == 0) goto L4f
            com.google.gson.internal.ConstructorConstructor$ThrowingObjectConstructor r4 = new com.google.gson.internal.ConstructorConstructor$ThrowingObjectConstructor
            r4.<init>(r0)
            return r4
        L4f:
            java.lang.String r0 = "Unable to create instance of "
            if (r5 != 0) goto L6d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = "; Register an InstanceCreator or a TypeAdapter for this type."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.google.gson.internal.ConstructorConstructor$ThrowingObjectConstructor r5 = new com.google.gson.internal.ConstructorConstructor$ThrowingObjectConstructor
            r5.<init>(r4)
            return r5
        L6d:
            com.google.gson.ReflectionAccessFilter$FilterResult r5 = com.google.gson.ReflectionAccessFilter.FilterResult.ALLOW
            if (r1 == r5) goto L8b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            com.google.gson.internal.ConstructorConstructor$ThrowingObjectConstructor r5 = new com.google.gson.internal.ConstructorConstructor$ThrowingObjectConstructor
            r5.<init>(r4)
            return r5
        L8b:
            com.google.gson.internal.ObjectConstructor r4 = r3.newUnsafeAllocator(r4)
            return r4
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r0 = r1.instanceCreators
            java.lang.String r0 = r0.toString()
            return r0
    }
}
