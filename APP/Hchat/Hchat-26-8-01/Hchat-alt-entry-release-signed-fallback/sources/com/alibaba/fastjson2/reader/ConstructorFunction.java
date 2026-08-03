package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ConstructorFunction<T> implements java.util.function.Function<java.util.Map<java.lang.Long, java.lang.Object>, T> {
    java.util.Map<java.util.Set<java.lang.Long>, java.lang.reflect.Type[]> alternateConstructorArgTypes;
    java.util.Map<java.util.Set<java.lang.Long>, java.lang.reflect.Constructor> alternateConstructorMap;
    java.util.Map<java.util.Set<java.lang.Long>, long[]> alternateConstructorNameHashCodes;
    java.util.Map<java.util.Set<java.lang.Long>, java.lang.String[]> alternateConstructorNames;
    final java.util.function.BiFunction biFunction;
    final java.lang.reflect.Constructor constructor;
    final java.util.function.Function function;
    final long[] hashCodes;
    final boolean kotlinMaker;
    final int parameterCount;
    final java.lang.Class[] parameterTypes;

    public ConstructorFunction(java.util.List<java.lang.reflect.Constructor> r9, java.lang.reflect.Constructor r10, java.util.function.Function r11, java.util.function.BiFunction r12, java.lang.reflect.Constructor r13, java.lang.String... r14) {
            r8 = this;
            r8.<init>()
            r0 = 0
            r1 = 1
            if (r13 == 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            r8.kotlinMaker = r2
            r8.function = r11
            r8.biFunction = r12
            if (r2 == 0) goto L13
            goto L14
        L13:
            r13 = r10
        L14:
            r8.constructor = r13
            int r11 = r13.getParameterCount()
            r8.parameterCount = r11
            java.lang.Class[] r10 = r10.getParameterTypes()
            r8.parameterTypes = r10
            int r10 = r10.length
            long[] r10 = new long[r10]
            r8.hashCodes = r10
            r10 = r0
        L28:
            java.lang.Class[] r11 = r8.parameterTypes
            int r11 = r11.length
            if (r10 >= r11) goto L47
            int r11 = r14.length
            if (r10 >= r11) goto L33
            r11 = r14[r10]
            goto L34
        L33:
            r11 = 0
        L34:
            if (r11 != 0) goto L3c
            java.lang.String r11 = "arg"
            java.lang.String r11 = eh.a.l(r10, r11)
        L3c:
            long[] r12 = r8.hashCodes
            long r2 = com.alibaba.fastjson2.util.Fnv.hashCode64(r11)
            r12[r10] = r2
            int r10 = r10 + 1
            goto L28
        L47:
            if (r9 == 0) goto Lf2
            java.util.HashMap r10 = new java.util.HashMap
            int r11 = r9.size()
            r10.<init>(r11)
            r8.alternateConstructorMap = r10
            java.util.HashMap r10 = new java.util.HashMap
            int r11 = r9.size()
            r10.<init>(r11)
            r8.alternateConstructorNames = r10
            java.util.HashMap r10 = new java.util.HashMap
            int r11 = r9.size()
            r10.<init>(r11)
            r8.alternateConstructorArgTypes = r10
            java.util.HashMap r10 = new java.util.HashMap
            int r11 = r9.size()
            r10.<init>(r11)
            r8.alternateConstructorNameHashCodes = r10
            r10 = r0
        L76:
            int r11 = r9.size()
            if (r10 >= r11) goto Lf2
            java.lang.Object r11 = r9.get(r10)
            r5 = r11
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            r5.setAccessible(r1)
            java.lang.String[] r11 = com.alibaba.fastjson2.util.BeanUtils.lookupParameterNames(r5)
            java.lang.Class[] r12 = r5.getParameterTypes()
            com.alibaba.fastjson2.codec.FieldInfo r3 = new com.alibaba.fastjson2.codec.FieldInfo
            r3.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.annotation.Annotation[][] r7 = r5.getParameterAnnotations()
            r6 = r0
        L9a:
            int r13 = r12.length
            if (r10 >= r13) goto Lb3
            int r13 = r11.length
            if (r6 >= r13) goto Lb3
            r3.init()
            java.lang.Class r4 = r5.getDeclaringClass()
            r2.getFieldInfo(r3, r4, r5, r6, r7)
            java.lang.String r13 = r3.fieldName
            if (r13 == 0) goto Lb0
            r11[r6] = r13
        Lb0:
            int r6 = r6 + 1
            goto L9a
        Lb3:
            int r12 = r11.length
            long[] r12 = new long[r12]
            java.lang.reflect.Type[] r13 = r5.getGenericParameterTypes()
            java.util.HashSet r14 = new java.util.HashSet
            int r2 = r11.length
            r14.<init>(r2)
            r2 = r0
        Lc1:
            int r3 = r11.length
            if (r2 >= r3) goto Ldb
            r3 = r11[r2]
            if (r3 != 0) goto Lcb
            r3 = 0
            goto Lcf
        Lcb:
            long r3 = com.alibaba.fastjson2.util.Fnv.hashCode64(r3)
        Lcf:
            r12[r2] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r14.add(r3)
            int r2 = r2 + 1
            goto Lc1
        Ldb:
            java.util.Map<java.util.Set<java.lang.Long>, java.lang.reflect.Constructor> r2 = r8.alternateConstructorMap
            r2.put(r14, r5)
            java.util.Map<java.util.Set<java.lang.Long>, java.lang.String[]> r2 = r8.alternateConstructorNames
            r2.put(r14, r11)
            java.util.Map<java.util.Set<java.lang.Long>, long[]> r11 = r8.alternateConstructorNameHashCodes
            r11.put(r14, r12)
            java.util.Map<java.util.Set<java.lang.Long>, java.lang.reflect.Type[]> r11 = r8.alternateConstructorArgTypes
            r11.put(r14, r13)
            int r10 = r10 + 1
            goto L76
        Lf2:
            return
    }

    @Override // java.util.function.Function
    public /* bridge */ /* synthetic */ java.lang.Object apply(java.util.Map<java.lang.Long, java.lang.Object> r1) {
            r0 = this;
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r0.apply2(r1)
            return r1
    }

    /* JADX INFO: renamed from: apply, reason: avoid collision after fix types in other method */
    public T apply2(java.util.Map<java.lang.Long, java.lang.Object> r11) {
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            long[] r2 = r10.hashCodes
            int r3 = r2.length
            java.lang.String r4 = "invoke constructor error, "
            if (r1 >= r3) goto L75
            r5 = r2[r1]
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            boolean r2 = r11.containsKey(r2)
            if (r2 != 0) goto L72
            java.util.Map<java.util.Set<java.lang.Long>, java.lang.reflect.Constructor> r1 = r10.alternateConstructorMap
            if (r1 == 0) goto L75
            java.util.Set r1 = r11.keySet()
            java.util.Map<java.util.Set<java.lang.Long>, java.lang.reflect.Constructor> r2 = r10.alternateConstructorMap
            java.lang.Object r2 = r2.get(r1)
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            if (r2 == 0) goto L75
            java.util.Map<java.util.Set<java.lang.Long>, long[]> r3 = r10.alternateConstructorNameHashCodes
            java.lang.Object r3 = r3.get(r1)
            long[] r3 = (long[]) r3
            java.util.Map<java.util.Set<java.lang.Long>, java.lang.reflect.Type[]> r5 = r10.alternateConstructorArgTypes
            java.lang.Object r1 = r5.get(r1)
            java.lang.reflect.Type[] r1 = (java.lang.reflect.Type[]) r1
            int r5 = r3.length
            java.lang.Object[] r5 = new java.lang.Object[r5]
        L3a:
            int r6 = r3.length
            if (r0 >= r6) goto L54
            r6 = r3[r0]
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object r6 = r11.get(r6)
            r7 = r1[r0]
            if (r6 != 0) goto L4f
            java.lang.Object r6 = com.alibaba.fastjson2.util.TypeUtils.getDefaultValue(r7)
        L4f:
            r5[r0] = r6
            int r0 = r0 + 1
            goto L3a
        L54:
            java.lang.Object r11 = r2.newInstance(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L59 java.lang.IllegalArgumentException -> L5b java.lang.IllegalAccessException -> L5d java.lang.InstantiationException -> L5f
            return r11
        L59:
            r11 = move-exception
            goto L60
        L5b:
            r11 = move-exception
            goto L60
        L5d:
            r11 = move-exception
            goto L60
        L5f:
            r11 = move-exception
        L60:
            com.alibaba.fastjson2.JSONException r0 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r11)
            throw r0
        L72:
            int r1 = r1 + 1
            goto L2
        L75:
            java.util.function.Function r1 = r10.function
            r2 = 1
            if (r1 == 0) goto La9
            java.lang.Class[] r1 = r10.parameterTypes
            int r1 = r1.length
            if (r1 != r2) goto La9
            long[] r1 = r10.hashCodes
            r2 = r1[r0]
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.Object r11 = r11.get(r1)
            java.lang.Class[] r1 = r10.parameterTypes
            r0 = r1[r0]
            if (r11 != 0) goto L96
            java.lang.Object r11 = com.alibaba.fastjson2.util.TypeUtils.getDefaultValue(r0)
            goto La2
        L96:
            boolean r1 = r0.isInstance(r11)
            if (r1 != 0) goto La2
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Object r11 = com.alibaba.fastjson2.util.TypeUtils.cast(r11, r0, r1)
        La2:
            java.util.function.Function r0 = r10.function
            java.lang.Object r11 = r0.apply(r11)
            return r11
        La9:
            java.util.function.BiFunction r1 = r10.biFunction
            if (r1 == 0) goto L100
            java.lang.Class[] r1 = r10.parameterTypes
            int r1 = r1.length
            r3 = 2
            if (r1 != r3) goto L100
            long[] r1 = r10.hashCodes
            r3 = r1[r0]
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Object r1 = r11.get(r1)
            java.lang.Class[] r3 = r10.parameterTypes
            r0 = r3[r0]
            if (r1 != 0) goto Lca
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.getDefaultValue(r0)
            goto Ld6
        Lca:
            boolean r3 = r0.isInstance(r1)
            if (r3 != 0) goto Ld6
            com.alibaba.fastjson2.reader.ObjectReaderProvider r3 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Object r1 = com.alibaba.fastjson2.util.TypeUtils.cast(r1, r0, r3)
        Ld6:
            long[] r0 = r10.hashCodes
            r3 = r0[r2]
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            java.lang.Object r11 = r11.get(r0)
            java.lang.Class[] r0 = r10.parameterTypes
            r0 = r0[r2]
            if (r11 != 0) goto Led
            java.lang.Object r11 = com.alibaba.fastjson2.util.TypeUtils.getDefaultValue(r0)
            goto Lf9
        Led:
            boolean r2 = r0.isInstance(r11)
            if (r2 != 0) goto Lf9
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Object r11 = com.alibaba.fastjson2.util.TypeUtils.cast(r11, r0, r2)
        Lf9:
            java.util.function.BiFunction r0 = r10.biFunction
            java.lang.Object r11 = r0.apply(r1, r11)
            return r11
        L100:
            java.lang.Class[] r1 = r10.parameterTypes
            int r1 = r1.length
            int r3 = r10.parameterCount
            java.lang.Object[] r3 = new java.lang.Object[r3]
            boolean r5 = r10.kotlinMaker
            if (r5 == 0) goto L147
            r5 = r0
            r6 = r5
        L10d:
            if (r5 >= r1) goto L194
            long[] r7 = r10.hashCodes
            r8 = r7[r5]
            java.lang.Long r7 = java.lang.Long.valueOf(r8)
            java.lang.Object r7 = r11.get(r7)
            if (r7 == 0) goto L120
            r3[r5] = r7
            goto L133
        L120:
            int r7 = r2 << r5
            r6 = r6 | r7
            java.lang.Class[] r7 = r10.parameterTypes
            r7 = r7[r5]
            boolean r8 = r7.isPrimitive()
            if (r8 == 0) goto L133
            java.lang.Object r7 = com.alibaba.fastjson2.util.TypeUtils.getDefaultValue(r7)
            r3[r5] = r7
        L133:
            int r7 = r5 + 1
            int r8 = r7 % 32
            if (r8 == 0) goto L13b
            if (r7 != r1) goto L145
        L13b:
            int r5 = r5 / 32
            int r5 = r5 + r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r5] = r6
            r6 = r0
        L145:
            r5 = r7
            goto L10d
        L147:
            if (r0 >= r1) goto L194
            java.lang.Class[] r2 = r10.parameterTypes
            r2 = r2[r0]
            long[] r5 = r10.hashCodes
            r6 = r5[r0]
            java.lang.Long r5 = java.lang.Long.valueOf(r6)
            java.lang.Object r5 = r11.get(r5)
            if (r5 != 0) goto L160
            java.lang.Object r5 = com.alibaba.fastjson2.util.TypeUtils.getDefaultValue(r2)
            goto L18f
        L160:
            boolean r6 = r2.isInstance(r5)
            if (r6 != 0) goto L16d
            com.alibaba.fastjson2.reader.ObjectReaderProvider r6 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Object r5 = com.alibaba.fastjson2.util.TypeUtils.cast(r5, r2, r6)
            goto L18f
        L16d:
            java.lang.Class<java.util.Collection> r6 = java.util.Collection.class
            boolean r6 = r6.isAssignableFrom(r2)
            if (r6 != 0) goto L17d
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            boolean r2 = r6.isAssignableFrom(r2)
            if (r2 == 0) goto L18f
        L17d:
            java.lang.reflect.Constructor r2 = r10.constructor
            java.lang.reflect.Type[] r2 = r2.getGenericParameterTypes()
            int r6 = r2.length
            java.lang.Class[] r7 = r10.parameterTypes
            int r7 = r7.length
            if (r6 != r7) goto L18f
            r2 = r2[r0]
            java.lang.Object r5 = com.alibaba.fastjson2.util.TypeUtils.cast(r5, r2)
        L18f:
            r3[r0] = r5
            int r0 = r0 + 1
            goto L147
        L194:
            java.lang.reflect.Constructor r11 = r10.constructor     // Catch: java.lang.reflect.InvocationTargetException -> L19b java.lang.IllegalArgumentException -> L19d java.lang.IllegalAccessException -> L19f java.lang.InstantiationException -> L1a1
            java.lang.Object r11 = r11.newInstance(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L19b java.lang.IllegalArgumentException -> L19d java.lang.IllegalAccessException -> L19f java.lang.InstantiationException -> L1a1
            return r11
        L19b:
            r11 = move-exception
            goto L1a2
        L19d:
            r11 = move-exception
            goto L1a2
        L19f:
            r11 = move-exception
            goto L1a2
        L1a1:
            r11 = move-exception
        L1a2:
            java.lang.reflect.Constructor r0 = r10.constructor
            ah.a.o(r4, r0, r11)
            r11 = 0
            return r11
    }
}
