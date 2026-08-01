package com.google.gson.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class ConstructorConstructor {
    private final java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> instanceCreators;
    private final java.util.List<com.google.gson.ReflectionAccessFilter> reflectionFilters;
    private final boolean useJdkUnsafe;





















    public ConstructorConstructor(java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r1, boolean r2, java.util.List<com.google.gson.ReflectionAccessFilter> r3) {
            r0 = this;
            r0.<init>()
            r0.instanceCreators = r1
            r0.useJdkUnsafe = r2
            r0.reflectionFilters = r3
            return
    }

    static java.lang.String checkInstantiable(java.lang.Class<?> r3) {
            int r0 = r3.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isInterface(r0)
            if (r1 == 0) goto L22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L22:
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r1 == 0) goto L40
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L40:
            r1 = 0
            return r1
    }

    private static <T> com.google.gson.internal.ObjectConstructor<T> newDefaultConstructor(java.lang.Class<? super T> r4, com.google.gson.ReflectionAccessFilter.FilterResult r5) {
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            r0 = 0
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L66
            java.lang.reflect.Constructor r2 = r4.getDeclaredConstructor(r2)     // Catch: java.lang.NoSuchMethodException -> L66
            com.google.gson.ReflectionAccessFilter$FilterResult r3 = com.google.gson.ReflectionAccessFilter.FilterResult.ALLOW
            if (r5 == r3) goto L2e
            boolean r1 = com.google.gson.internal.ReflectionAccessFilterHelper.canAccess(r2, r1)
            if (r1 == 0) goto L2d
            com.google.gson.ReflectionAccessFilter$FilterResult r1 = com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL
            if (r5 != r1) goto L2e
            int r1 = r2.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)
            if (r1 == 0) goto L2d
            goto L2e
        L2d:
            goto L2f
        L2e:
            r0 = 1
        L2f:
            if (r0 != 0) goto L50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Unable to invoke no-args constructor of "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r3 = "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.google.gson.internal.ConstructorConstructor$7 r3 = new com.google.gson.internal.ConstructorConstructor$7
            r3.<init>(r1)
            return r3
        L50:
            com.google.gson.ReflectionAccessFilter$FilterResult r1 = com.google.gson.ReflectionAccessFilter.FilterResult.ALLOW
            if (r5 != r1) goto L60
            java.lang.String r1 = com.google.gson.internal.reflect.ReflectionHelper.tryMakeAccessible(r2)
            if (r1 == 0) goto L60
            com.google.gson.internal.ConstructorConstructor$8 r3 = new com.google.gson.internal.ConstructorConstructor$8
            r3.<init>(r1)
            return r3
        L60:
            com.google.gson.internal.ConstructorConstructor$9 r1 = new com.google.gson.internal.ConstructorConstructor$9
            r1.<init>(r2)
            return r1
        L66:
            r0 = move-exception
            return r1
    }

    private static <T> com.google.gson.internal.ObjectConstructor<T> newDefaultImplementationConstructor(java.lang.reflect.Type r3, java.lang.Class<? super T> r4) {
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L38
            java.lang.Class<java.util.SortedSet> r0 = java.util.SortedSet.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L16
            com.google.gson.internal.ConstructorConstructor$10 r0 = new com.google.gson.internal.ConstructorConstructor$10
            r0.<init>()
            return r0
        L16:
            java.lang.Class<java.util.Set> r0 = java.util.Set.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L24
            com.google.gson.internal.ConstructorConstructor$11 r0 = new com.google.gson.internal.ConstructorConstructor$11
            r0.<init>()
            return r0
        L24:
            java.lang.Class<java.util.Queue> r0 = java.util.Queue.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L32
            com.google.gson.internal.ConstructorConstructor$12 r0 = new com.google.gson.internal.ConstructorConstructor$12
            r0.<init>()
            return r0
        L32:
            com.google.gson.internal.ConstructorConstructor$13 r0 = new com.google.gson.internal.ConstructorConstructor$13
            r0.<init>()
            return r0
        L38:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L94
            java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r0 = java.util.concurrent.ConcurrentNavigableMap.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L4e
            com.google.gson.internal.ConstructorConstructor$14 r0 = new com.google.gson.internal.ConstructorConstructor$14
            r0.<init>()
            return r0
        L4e:
            java.lang.Class<java.util.concurrent.ConcurrentMap> r0 = java.util.concurrent.ConcurrentMap.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L5c
            com.google.gson.internal.ConstructorConstructor$15 r0 = new com.google.gson.internal.ConstructorConstructor$15
            r0.<init>()
            return r0
        L5c:
            java.lang.Class<java.util.SortedMap> r0 = java.util.SortedMap.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L6a
            com.google.gson.internal.ConstructorConstructor$16 r0 = new com.google.gson.internal.ConstructorConstructor$16
            r0.<init>()
            return r0
        L6a:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L8e
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = r3
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            r2 = 0
            r1 = r1[r2]
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            java.lang.Class r1 = r1.getRawType()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L8e
            com.google.gson.internal.ConstructorConstructor$17 r0 = new com.google.gson.internal.ConstructorConstructor$17
            r0.<init>()
            return r0
        L8e:
            com.google.gson.internal.ConstructorConstructor$18 r0 = new com.google.gson.internal.ConstructorConstructor$18
            r0.<init>()
            return r0
        L94:
            r0 = 0
            return r0
    }

    private static <T> com.google.gson.internal.ObjectConstructor<T> newSpecialCollectionConstructor(java.lang.reflect.Type r1, java.lang.Class<? super T> r2) {
            java.lang.Class<java.util.EnumSet> r0 = java.util.EnumSet.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto Le
            com.google.gson.internal.ConstructorConstructor$5 r0 = new com.google.gson.internal.ConstructorConstructor$5
            r0.<init>(r1)
            return r0
        Le:
            java.lang.Class<java.util.EnumMap> r0 = java.util.EnumMap.class
            if (r2 != r0) goto L18
            com.google.gson.internal.ConstructorConstructor$6 r0 = new com.google.gson.internal.ConstructorConstructor$6
            r0.<init>(r1)
            return r0
        L18:
            r0 = 0
            return r0
    }

    private <T> com.google.gson.internal.ObjectConstructor<T> newUnsafeAllocator(java.lang.Class<? super T> r3) {
            r2 = this;
            boolean r0 = r2.useJdkUnsafe
            if (r0 == 0) goto La
            com.google.gson.internal.ConstructorConstructor$19 r0 = new com.google.gson.internal.ConstructorConstructor$19
            r0.<init>(r2, r3)
            return r0
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to create instance of "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.gson.internal.ConstructorConstructor$20 r1 = new com.google.gson.internal.ConstructorConstructor$20
            r1.<init>(r2, r0)
            return r1
    }

    public <T> com.google.gson.internal.ObjectConstructor<T> get(com.google.gson.reflect.TypeToken<T> r12) {
            r11 = this;
            java.lang.reflect.Type r0 = r12.getType()
            java.lang.Class r1 = r12.getRawType()
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r2 = r11.instanceCreators
            java.lang.Object r2 = r2.get(r0)
            com.google.gson.InstanceCreator r2 = (com.google.gson.InstanceCreator) r2
            if (r2 == 0) goto L18
            com.google.gson.internal.ConstructorConstructor$1 r3 = new com.google.gson.internal.ConstructorConstructor$1
            r3.<init>(r11, r2, r0)
            return r3
        L18:
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r3 = r11.instanceCreators
            java.lang.Object r3 = r3.get(r1)
            com.google.gson.InstanceCreator r3 = (com.google.gson.InstanceCreator) r3
            if (r3 == 0) goto L28
            com.google.gson.internal.ConstructorConstructor$2 r4 = new com.google.gson.internal.ConstructorConstructor$2
            r4.<init>(r11, r3, r0)
            return r4
        L28:
            com.google.gson.internal.ObjectConstructor r4 = newSpecialCollectionConstructor(r0, r1)
            if (r4 == 0) goto L2f
            return r4
        L2f:
            java.util.List<com.google.gson.ReflectionAccessFilter> r5 = r11.reflectionFilters
            com.google.gson.ReflectionAccessFilter$FilterResult r5 = com.google.gson.internal.ReflectionAccessFilterHelper.getFilterResult(r5, r1)
            com.google.gson.internal.ObjectConstructor r6 = newDefaultConstructor(r1, r5)
            if (r6 == 0) goto L3c
            return r6
        L3c:
            com.google.gson.internal.ObjectConstructor r7 = newDefaultImplementationConstructor(r0, r1)
            if (r7 == 0) goto L43
            return r7
        L43:
            java.lang.String r8 = checkInstantiable(r1)
            if (r8 == 0) goto L4f
            com.google.gson.internal.ConstructorConstructor$3 r9 = new com.google.gson.internal.ConstructorConstructor$3
            r9.<init>(r11, r8)
            return r9
        L4f:
            com.google.gson.ReflectionAccessFilter$FilterResult r9 = com.google.gson.ReflectionAccessFilter.FilterResult.ALLOW
            if (r5 != r9) goto L58
            com.google.gson.internal.ObjectConstructor r9 = r11.newUnsafeAllocator(r1)
            return r9
        L58:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unable to create instance of "
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r9 = r9.append(r1)
            java.lang.String r10 = "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection."
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.google.gson.internal.ConstructorConstructor$4 r10 = new com.google.gson.internal.ConstructorConstructor$4
            r10.<init>(r11, r9)
            return r10
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r0 = r1.instanceCreators
            java.lang.String r0 = r0.toString()
            return r0
    }
}
