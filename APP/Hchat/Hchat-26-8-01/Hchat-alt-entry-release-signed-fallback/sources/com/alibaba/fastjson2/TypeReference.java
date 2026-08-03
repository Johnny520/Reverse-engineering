package com.alibaba.fastjson2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TypeReference<T> {
    protected final java.lang.Class<? super T> rawType;
    protected final java.lang.reflect.Type type;


    public TypeReference() {
            r2 = this;
            r2.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            r2.type = r0
            java.lang.Class r0 = com.alibaba.fastjson2.util.BeanUtils.getRawType(r0)
            r2.rawType = r0
            return
    }

    private TypeReference(java.lang.reflect.Type r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r1.getClass()
            java.lang.reflect.Type r2 = com.alibaba.fastjson2.util.BeanUtils.canonicalize(r1)
            r0.type = r2
            java.lang.Class r1 = com.alibaba.fastjson2.util.BeanUtils.getRawType(r1)
            r0.rawType = r1
            return
    }

    public /* synthetic */ TypeReference(java.lang.reflect.Type r1, boolean r2, com.alibaba.fastjson2.TypeReference.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public TypeReference(java.lang.reflect.Type... r4) {
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L36
            int r0 = r4.length
            if (r0 == 0) goto L36
            int r0 = r4.length
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L17
            r0 = r4[r2]
            if (r0 != 0) goto L17
            java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r1]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r4[r2] = r0
        L17:
            java.lang.Class r0 = r3.getClass()
            java.lang.reflect.Type r1 = r0.getGenericSuperclass()
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            r1 = r1[r2]
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type r4 = canonicalize(r0, r1, r4, r2)
            r3.type = r4
            java.lang.Class r4 = com.alibaba.fastjson2.util.BeanUtils.getRawType(r4)
            r3.rawType = r4
            return
        L36:
            r4 = 0
            throw r4
    }

    public static java.lang.reflect.Type arrayType(java.lang.Class<?> r1) {
            com.alibaba.fastjson2.util.BeanUtils$GenericArrayTypeImpl r0 = new com.alibaba.fastjson2.util.BeanUtils$GenericArrayTypeImpl
            r0.<init>(r1)
            return r0
    }

    private static java.lang.reflect.Type canonicalize(java.lang.Class<?> r8, java.lang.reflect.ParameterizedType r9, java.lang.reflect.Type[] r10, int r11) {
            java.lang.reflect.Type r0 = r9.getRawType()
            java.lang.reflect.Type[] r9 = r9.getActualTypeArguments()
            r1 = 0
            r2 = r1
        La:
            int r3 = r9.length
            if (r2 >= r3) goto La1
            r3 = r9[r2]
            boolean r3 = r3 instanceof java.lang.reflect.TypeVariable
            if (r3 == 0) goto L1d
            int r3 = r10.length
            if (r11 >= r3) goto L1d
            int r3 = r11 + 1
            r11 = r10[r11]
            r9[r2] = r11
            r11 = r3
        L1d:
            r3 = r9[r2]
            boolean r4 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r4 == 0) goto L8f
            r4 = r1
        L24:
            boolean r5 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r5 == 0) goto L31
            int r4 = r4 + 1
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            goto L24
        L31:
            boolean r5 = r3 instanceof java.lang.Class
            if (r5 == 0) goto L8f
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r5 = r3.isPrimitive()
            if (r5 == 0) goto L8f
            java.lang.Class r5 = java.lang.Integer.TYPE
            if (r3 != r5) goto L44
            r3 = 73
            goto L74
        L44:
            java.lang.Class r5 = java.lang.Long.TYPE
            if (r3 != r5) goto L4b
            r3 = 74
            goto L74
        L4b:
            java.lang.Class r5 = java.lang.Float.TYPE
            if (r3 != r5) goto L52
            r3 = 70
            goto L74
        L52:
            java.lang.Class r5 = java.lang.Double.TYPE
            if (r3 != r5) goto L59
            r3 = 68
            goto L74
        L59:
            java.lang.Class r5 = java.lang.Boolean.TYPE
            if (r3 != r5) goto L60
            r3 = 90
            goto L74
        L60:
            java.lang.Class r5 = java.lang.Character.TYPE
            if (r3 != r5) goto L67
            r3 = 67
            goto L74
        L67:
            java.lang.Class r5 = java.lang.Byte.TYPE
            if (r3 != r5) goto L6e
            r3 = 66
            goto L74
        L6e:
            java.lang.Class r5 = java.lang.Short.TYPE
            if (r3 != r5) goto L8f
            r3 = 83
        L74:
            int r5 = r4 + 1
            char[] r5 = new char[r5]
            r6 = r1
        L79:
            if (r6 >= r4) goto L82
            r7 = 91
            r5[r6] = r7
            int r6 = r6 + 1
            goto L79
        L82:
            r5[r4] = r3
            java.lang.String r3 = new java.lang.String
            r3.<init>(r5)
            java.lang.Class r3 = com.alibaba.fastjson2.util.TypeUtils.loadClass(r3)
            r9[r2] = r3
        L8f:
            r3 = r9[r2]
            boolean r4 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L9d
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = canonicalize(r8, r3, r10, r11)
            r9[r2] = r3
        L9d:
            int r2 = r2 + 1
            goto La
        La1:
            com.alibaba.fastjson2.util.ParameterizedTypeImpl r10 = new com.alibaba.fastjson2.util.ParameterizedTypeImpl
            r10.<init>(r9, r8, r0)
            return r10
    }

    public static java.lang.reflect.Type collectionType(java.lang.Class<? extends java.util.Collection> r3, java.lang.Class<?> r4) {
            com.alibaba.fastjson2.util.ParameterizedTypeImpl r0 = new com.alibaba.fastjson2.util.ParameterizedTypeImpl
            r1 = 1
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
            r2 = 0
            r1[r2] = r4
            r0.<init>(r3, r1)
            return r0
    }

    public static com.alibaba.fastjson2.TypeReference<?> get(java.lang.reflect.Type r2) {
            com.alibaba.fastjson2.TypeReference$1 r0 = new com.alibaba.fastjson2.TypeReference$1
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    public static java.lang.reflect.Type mapType(java.lang.Class<? extends java.util.Map> r3, java.lang.Class<?> r4, java.lang.Class<?> r5) {
            com.alibaba.fastjson2.util.ParameterizedTypeImpl r0 = new com.alibaba.fastjson2.util.ParameterizedTypeImpl
            r1 = 2
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
            r2 = 0
            r1[r2] = r4
            r4 = 1
            r1[r4] = r5
            r0.<init>(r3, r1)
            return r0
    }

    public static java.lang.reflect.Type of(java.lang.reflect.Type... r1) {
            com.alibaba.fastjson2.util.MultiType r0 = new com.alibaba.fastjson2.util.MultiType
            r0.<init>(r1)
            return r0
    }

    public static java.lang.reflect.Type parametricType(java.lang.Class<?> r1, java.lang.Class<?>... r2) {
            com.alibaba.fastjson2.util.ParameterizedTypeImpl r0 = new com.alibaba.fastjson2.util.ParameterizedTypeImpl
            r0.<init>(r1, r2)
            return r0
    }

    public static java.lang.reflect.Type parametricType(java.lang.Class<?> r1, java.lang.reflect.Type... r2) {
            com.alibaba.fastjson2.util.ParameterizedTypeImpl r0 = new com.alibaba.fastjson2.util.ParameterizedTypeImpl
            r0.<init>(r1, r2)
            return r0
    }

    public final java.lang.Class<? super T> getRawType() {
            r1 = this;
            java.lang.Class<? super T> r0 = r1.rawType
            return r0
    }

    public final java.lang.reflect.Type getType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            return r0
    }

    public java.util.List<T> parseArray(java.lang.String r2, com.alibaba.fastjson2.JSONReader.Feature... r3) {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            java.util.List r2 = com.alibaba.fastjson2.JSON.parseArray(r2, r0, r3)
            return r2
    }

    public java.util.List<T> parseArray(byte[] r2, com.alibaba.fastjson2.JSONReader.Feature... r3) {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            java.util.List r2 = com.alibaba.fastjson2.JSON.parseArray(r2, r0, r3)
            return r2
    }

    public T parseObject(java.lang.String r2) {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            java.lang.Object r2 = com.alibaba.fastjson2.JSON.parseObject(r2, r0)
            return r2
    }

    public T parseObject(byte[] r2) {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            java.lang.Object r2 = com.alibaba.fastjson2.JSON.parseObject(r2, r0)
            return r2
    }

    public T to(com.alibaba.fastjson2.JSONArray r2) {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            java.lang.Object r2 = r2.to(r0)
            return r2
    }

    public T to(com.alibaba.fastjson2.JSONObject r2, com.alibaba.fastjson2.JSONReader.Feature... r3) {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            java.lang.Object r2 = r2.to(r0, r3)
            return r2
    }

    @java.lang.Deprecated
    public T toJavaObject(com.alibaba.fastjson2.JSONArray r2) {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            java.lang.Object r2 = r2.to(r0)
            return r2
    }

    @java.lang.Deprecated
    public T toJavaObject(com.alibaba.fastjson2.JSONObject r2, com.alibaba.fastjson2.JSONReader.Feature... r3) {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            java.lang.Object r2 = r2.to(r0, r3)
            return r2
    }
}
