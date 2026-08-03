package com.alibaba.fastjson2.util;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BeanUtils {
    static final java.lang.reflect.Type[] EMPTY_TYPE_ARRAY = null;
    static final com.alibaba.fastjson2.util.NameCacheEntry[] NAME_CACHE = null;
    static final java.util.concurrent.atomic.AtomicReference<char[]> charsCache = null;
    static final java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Constructor[]> constructorCache = null;
    static final java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> declaredFieldCache = null;
    static final java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> fieldCache = null;
    static final java.util.concurrent.ConcurrentMap<java.lang.Class, java.util.Map<java.lang.String, java.lang.reflect.Field>> fieldMapCache = null;
    private static volatile boolean kotlinClassKlassError;
    private static volatile boolean kotlinError;
    private static volatile java.lang.reflect.Constructor<?> kotlinKClassConstructor;
    private static volatile java.lang.reflect.Method kotlinKClassGetConstructors;
    private static volatile java.lang.reflect.Method kotlinKFunctionGetParameters;
    private static volatile java.lang.reflect.Method kotlinKParameterGetName;
    static final java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Method[]> methodCache = null;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type componentType;

        public GenericArrayTypeImpl(java.lang.reflect.Type r1) {
                r0 = this;
                r0.<init>()
                java.lang.reflect.Type r1 = com.alibaba.fastjson2.util.BeanUtils.canonicalize(r1)
                r0.componentType = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
                if (r0 == 0) goto Le
                java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
                boolean r2 = com.alibaba.fastjson2.util.BeanUtils.equals(r1, r2)
                if (r2 == 0) goto Le
                r2 = 1
                return r2
            Le:
                r2 = 0
                return r2
        }

        @Override // java.lang.reflect.GenericArrayType
        public java.lang.reflect.Type getGenericComponentType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.componentType
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.componentType
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.reflect.Type r1 = r2.componentType
                java.lang.String r1 = com.alibaba.fastjson2.util.BeanUtils.typeToString(r1)
                r0.append(r1)
                java.lang.String r1 = "[]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type ownerType;
        private final java.lang.reflect.Type rawType;
        private final java.lang.reflect.Type[] typeArguments;

        public ParameterizedTypeImpl(java.lang.reflect.Type r5, java.lang.reflect.Type r6, java.lang.reflect.Type... r7) {
                r4 = this;
                r4.<init>()
                boolean r0 = r6 instanceof java.lang.Class
                r1 = 0
                if (r0 == 0) goto L29
                r0 = r6
                java.lang.Class r0 = (java.lang.Class) r0
                int r2 = r0.getModifiers()
                boolean r2 = java.lang.reflect.Modifier.isStatic(r2)
                r3 = 1
                if (r2 != 0) goto L1f
                java.lang.Class r0 = r0.getEnclosingClass()
                if (r0 != 0) goto L1d
                goto L1f
            L1d:
                r0 = r1
                goto L20
            L1f:
                r0 = r3
            L20:
                if (r5 != 0) goto L26
                if (r0 == 0) goto L25
                goto L26
            L25:
                r3 = r1
            L26:
                com.alibaba.fastjson2.util.BeanUtils.checkArgument(r3)
            L29:
                if (r5 != 0) goto L2d
                r5 = 0
                goto L31
            L2d:
                java.lang.reflect.Type r5 = com.alibaba.fastjson2.util.BeanUtils.canonicalize(r5)
            L31:
                r4.ownerType = r5
                java.lang.reflect.Type r5 = com.alibaba.fastjson2.util.BeanUtils.canonicalize(r6)
                r4.rawType = r5
                java.lang.Object r5 = r7.clone()
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r4.typeArguments = r5
                int r5 = r5.length
            L42:
                if (r1 >= r5) goto L5f
                java.lang.reflect.Type[] r6 = r4.typeArguments
                r6 = r6[r1]
                com.alibaba.fastjson2.util.BeanUtils.checkNotNull(r6)
                java.lang.reflect.Type[] r6 = r4.typeArguments
                r6 = r6[r1]
                com.alibaba.fastjson2.util.BeanUtils.checkNotPrimitive(r6)
                java.lang.reflect.Type[] r6 = r4.typeArguments
                r7 = r6[r1]
                java.lang.reflect.Type r7 = com.alibaba.fastjson2.util.BeanUtils.canonicalize(r7)
                r6[r1] = r7
                int r1 = r1 + 1
                goto L42
            L5f:
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto Le
                java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
                boolean r2 = com.alibaba.fastjson2.util.BeanUtils.equals(r1, r2)
                if (r2 == 0) goto Le
                r2 = 1
                return r2
            Le:
                r2 = 0
                return r2
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type[] getActualTypeArguments() {
                r1 = this;
                java.lang.reflect.Type[] r0 = r1.typeArguments
                java.lang.Object r0 = r0.clone()
                java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                return r0
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getOwnerType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.ownerType
                return r0
        }

        @Override // java.lang.reflect.ParameterizedType
        public java.lang.reflect.Type getRawType() {
                r1 = this;
                java.lang.reflect.Type r0 = r1.rawType
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.reflect.Type[] r0 = r2.typeArguments
                int r0 = java.util.Arrays.hashCode(r0)
                java.lang.reflect.Type r1 = r2.rawType
                int r1 = r1.hashCode()
                r0 = r0 ^ r1
                java.lang.reflect.Type r1 = r2.ownerType
                int r1 = com.alibaba.fastjson2.util.BeanUtils.hashCodeOrZero(r1)
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.reflect.Type[] r0 = r4.typeArguments
                int r0 = r0.length
                if (r0 != 0) goto Lc
                java.lang.reflect.Type r0 = r4.rawType
                java.lang.String r0 = com.alibaba.fastjson2.util.BeanUtils.typeToString(r0)
                return r0
            Lc:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                int r2 = r0 + 1
                int r2 = r2 * 30
                r1.<init>(r2)
                java.lang.reflect.Type r2 = r4.rawType
                java.lang.String r2 = com.alibaba.fastjson2.util.BeanUtils.typeToString(r2)
                r1.append(r2)
                java.lang.String r2 = "<"
                r1.append(r2)
                java.lang.reflect.Type[] r2 = r4.typeArguments
                r3 = 0
                r2 = r2[r3]
                java.lang.String r2 = com.alibaba.fastjson2.util.BeanUtils.typeToString(r2)
                r1.append(r2)
                r2 = 1
            L30:
                if (r2 >= r0) goto L45
                java.lang.String r3 = ", "
                r1.append(r3)
                java.lang.reflect.Type[] r3 = r4.typeArguments
                r3 = r3[r2]
                java.lang.String r3 = com.alibaba.fastjson2.util.BeanUtils.typeToString(r3)
                r1.append(r3)
                int r2 = r2 + 1
                goto L30
            L45:
                java.lang.String r0 = ">"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class WildcardTypeImpl implements java.lang.reflect.WildcardType, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.reflect.Type lowerBound;
        private final java.lang.reflect.Type upperBound;

        public WildcardTypeImpl(java.lang.reflect.Type[] r4, java.lang.reflect.Type[] r5) {
                r3 = this;
                r3.<init>()
                int r0 = r5.length
                r1 = 0
                r2 = 1
                if (r0 > r2) goto La
                r0 = r2
                goto Lb
            La:
                r0 = r1
            Lb:
                com.alibaba.fastjson2.util.BeanUtils.checkArgument(r0)
                int r0 = r4.length
                if (r0 != r2) goto L13
                r0 = r2
                goto L14
            L13:
                r0 = r1
            L14:
                com.alibaba.fastjson2.util.BeanUtils.checkArgument(r0)
                int r0 = r5.length
                if (r0 != r2) goto L3a
                r0 = r5[r1]
                com.alibaba.fastjson2.util.BeanUtils.checkNotNull(r0)
                r0 = r5[r1]
                com.alibaba.fastjson2.util.BeanUtils.checkNotPrimitive(r0)
                r4 = r4[r1]
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                if (r4 != r0) goto L2b
                goto L2c
            L2b:
                r2 = r1
            L2c:
                com.alibaba.fastjson2.util.BeanUtils.checkArgument(r2)
                r4 = r5[r1]
                java.lang.reflect.Type r4 = com.alibaba.fastjson2.util.BeanUtils.canonicalize(r4)
                r3.lowerBound = r4
                r3.upperBound = r0
                return
            L3a:
                r5 = r4[r1]
                com.alibaba.fastjson2.util.BeanUtils.checkNotNull(r5)
                r5 = r4[r1]
                com.alibaba.fastjson2.util.BeanUtils.checkNotPrimitive(r5)
                r5 = 0
                r3.lowerBound = r5
                r4 = r4[r1]
                java.lang.reflect.Type r4 = com.alibaba.fastjson2.util.BeanUtils.canonicalize(r4)
                r3.upperBound = r4
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.WildcardType
                if (r0 == 0) goto Le
                java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
                boolean r2 = com.alibaba.fastjson2.util.BeanUtils.equals(r1, r2)
                if (r2 == 0) goto Le
                r2 = 1
                return r2
            Le:
                r2 = 0
                return r2
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getLowerBounds() {
                r3 = this;
                java.lang.reflect.Type r0 = r3.lowerBound
                if (r0 == 0) goto Lb
                r1 = 1
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
                r2 = 0
                r1[r2] = r0
                return r1
            Lb:
                java.lang.reflect.Type[] r0 = com.alibaba.fastjson2.util.BeanUtils.EMPTY_TYPE_ARRAY
                return r0
        }

        @Override // java.lang.reflect.WildcardType
        public java.lang.reflect.Type[] getUpperBounds() {
                r3 = this;
                java.lang.reflect.Type r0 = r3.upperBound
                r1 = 1
                java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
                r2 = 0
                r1[r2] = r0
                return r1
        }

        public int hashCode() {
                r2 = this;
                java.lang.reflect.Type r0 = r2.lowerBound
                if (r0 == 0) goto Lb
                int r0 = r0.hashCode()
                int r0 = r0 + 31
                goto Lc
            Lb:
                r0 = 1
            Lc:
                java.lang.reflect.Type r1 = r2.upperBound
                int r1 = r1.hashCode()
                int r1 = r1 + 31
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.reflect.Type r0 = r2.lowerBound
                if (r0 == 0) goto L19
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "? super "
                r0.<init>(r1)
                java.lang.reflect.Type r1 = r2.lowerBound
                java.lang.String r1 = com.alibaba.fastjson2.util.BeanUtils.typeToString(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            L19:
                java.lang.reflect.Type r0 = r2.upperBound
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                if (r0 != r1) goto L22
                java.lang.String r0 = "?"
                return r0
            L22:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "? extends "
                r0.<init>(r1)
                java.lang.reflect.Type r1 = r2.upperBound
                java.lang.String r1 = com.alibaba.fastjson2.util.BeanUtils.typeToString(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            com.alibaba.fastjson2.util.BeanUtils.charsCache = r0
            r0 = 2048(0x800, float:2.87E-42)
            com.alibaba.fastjson2.util.NameCacheEntry[] r0 = new com.alibaba.fastjson2.util.NameCacheEntry[r0]
            com.alibaba.fastjson2.util.BeanUtils.NAME_CACHE = r0
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            com.alibaba.fastjson2.util.BeanUtils.EMPTY_TYPE_ARRAY = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.alibaba.fastjson2.util.BeanUtils.fieldCache = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.alibaba.fastjson2.util.BeanUtils.fieldMapCache = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.alibaba.fastjson2.util.BeanUtils.declaredFieldCache = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.alibaba.fastjson2.util.BeanUtils.methodCache = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.alibaba.fastjson2.util.BeanUtils.constructorCache = r0
            return
    }

    public BeanUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(java.lang.String r0, java.util.concurrent.atomic.AtomicReference r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3) {
            lambda$getEnumValueField$3(r0, r1, r2, r3)
            return
    }

    public static void annotationMethods(java.lang.Class r7, java.util.function.Consumer<java.lang.reflect.Method> r8) {
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Method[]> r0 = com.alibaba.fastjson2.util.BeanUtils.methodCache
            java.lang.Object r1 = r0.get(r7)
            java.lang.reflect.Method[] r1 = (java.lang.reflect.Method[]) r1
            if (r1 != 0) goto L11
            java.lang.reflect.Method[] r1 = r7.getMethods()
            r0.put(r7, r1)
        L11:
            int r7 = r1.length
            r0 = 0
            r2 = r0
        L14:
            if (r2 >= r7) goto L61
            r3 = r1[r2]
            int r4 = r3.getParameterCount()
            if (r4 == 0) goto L1f
            goto L5e
        L1f:
            java.lang.Class r4 = r3.getDeclaringClass()
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            if (r4 != r5) goto L28
            goto L5e
        L28:
            java.lang.String r4 = r3.getName()
            r4.getClass()
            int r5 = r4.hashCode()
            r6 = -1
            switch(r5) {
                case -1776922004: goto L4e;
                case 147696667: goto L43;
                case 1444986633: goto L38;
                default: goto L37;
            }
        L37:
            goto L58
        L38:
            java.lang.String r5 = "annotationType"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L41
            goto L58
        L41:
            r6 = 2
            goto L58
        L43:
            java.lang.String r5 = "hashCode"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L4c
            goto L58
        L4c:
            r6 = 1
            goto L58
        L4e:
            java.lang.String r5 = "toString"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L57
            goto L58
        L57:
            r6 = r0
        L58:
            switch(r6) {
                case 0: goto L5e;
                case 1: goto L5e;
                case 2: goto L5e;
                default: goto L5b;
            }
        L5b:
            r8.accept(r3)
        L5e:
            int r2 = r2 + 1
            goto L14
        L61:
            return
    }

    public static java.lang.reflect.GenericArrayType arrayOf(java.lang.reflect.Type r1) {
            com.alibaba.fastjson2.util.BeanUtils$GenericArrayTypeImpl r0 = new com.alibaba.fastjson2.util.BeanUtils$GenericArrayTypeImpl
            r0.<init>(r1)
            return r0
    }

    public static /* synthetic */ void b(java.lang.String r0, java.lang.reflect.Method[] r1, java.lang.reflect.Method r2) {
            lambda$getSetter$0(r0, r1, r2)
            return
    }

    public static java.lang.reflect.Method buildMethod(java.lang.Class r4, java.lang.String r5) {
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Method[]> r0 = com.alibaba.fastjson2.util.BeanUtils.methodCache
            java.lang.Object r1 = r0.get(r4)
            java.lang.reflect.Method[] r1 = (java.lang.reflect.Method[]) r1
            if (r1 != 0) goto L11
            java.lang.reflect.Method[] r1 = r4.getMethods()
            r0.put(r4, r1)
        L11:
            int r4 = r1.length
            r0 = 0
        L13:
            if (r0 >= r4) goto L37
            r2 = r1[r0]
            int r3 = r2.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 == 0) goto L22
            goto L34
        L22:
            int r3 = r2.getParameterCount()
            if (r3 == 0) goto L29
            goto L34
        L29:
            java.lang.String r3 = r2.getName()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L34
            return r2
        L34:
            int r0 = r0 + 1
            goto L13
        L37:
            r4 = 0
            return r4
    }

    public static /* synthetic */ void c(int r0, int r1, java.lang.Class r2, char r3, java.lang.String r4, java.lang.reflect.Field[] r5, java.lang.reflect.Field r6) {
            lambda$getField$4(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static java.lang.reflect.Type canonicalize(java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L1b
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L1a
            com.alibaba.fastjson2.util.BeanUtils$GenericArrayTypeImpl r0 = new com.alibaba.fastjson2.util.BeanUtils$GenericArrayTypeImpl
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = canonicalize(r3)
            r0.<init>(r3)
            return r0
        L1a:
            return r3
        L1b:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L33
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            com.alibaba.fastjson2.util.BeanUtils$ParameterizedTypeImpl r0 = new com.alibaba.fastjson2.util.BeanUtils$ParameterizedTypeImpl
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.Type r2 = r3.getRawType()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0.<init>(r1, r2, r3)
            return r0
        L33:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L43
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            com.alibaba.fastjson2.util.BeanUtils$GenericArrayTypeImpl r0 = new com.alibaba.fastjson2.util.BeanUtils$GenericArrayTypeImpl
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L43:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L57
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            com.alibaba.fastjson2.util.BeanUtils$WildcardTypeImpl r0 = new com.alibaba.fastjson2.util.BeanUtils$WildcardTypeImpl
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L57:
            return r3
    }

    public static void checkArgument(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            j8.o.o()
            return
    }

    public static <T> T checkNotNull(T r0) {
            r0.getClass()
            return r0
    }

    public static void checkNotPrimitive(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lf
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            checkArgument(r1)
            return
    }

    public static void cleanupCache(java.lang.Class r1) {
            if (r1 != 0) goto L3
            return
        L3:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> r0 = com.alibaba.fastjson2.util.BeanUtils.fieldCache
            r0.remove(r1)
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.util.Map<java.lang.String, java.lang.reflect.Field>> r0 = com.alibaba.fastjson2.util.BeanUtils.fieldMapCache
            r0.remove(r1)
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> r0 = com.alibaba.fastjson2.util.BeanUtils.declaredFieldCache
            r0.remove(r1)
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Method[]> r0 = com.alibaba.fastjson2.util.BeanUtils.methodCache
            r0.remove(r1)
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Constructor[]> r0 = com.alibaba.fastjson2.util.BeanUtils.constructorCache
            r0.remove(r1)
            return
    }

    public static void cleanupCache(java.lang.ClassLoader r2) {
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> r0 = com.alibaba.fastjson2.util.BeanUtils.fieldCache
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r1 != r2) goto La
            r0.remove()
            goto La
        L26:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.util.Map<java.lang.String, java.lang.reflect.Field>> r0 = com.alibaba.fastjson2.util.BeanUtils.fieldMapCache
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r1 != r2) goto L30
            r0.remove()
            goto L30
        L4c:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> r0 = com.alibaba.fastjson2.util.BeanUtils.declaredFieldCache
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L56:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L72
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r1 != r2) goto L56
            r0.remove()
            goto L56
        L72:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Method[]> r0 = com.alibaba.fastjson2.util.BeanUtils.methodCache
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L7c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L98
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r1 != r2) goto L7c
            r0.remove()
            goto L7c
        L98:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Constructor[]> r0 = com.alibaba.fastjson2.util.BeanUtils.constructorCache
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbe
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r1 != r2) goto La2
            r0.remove()
            goto La2
        Lbe:
            return
    }

    public static void constructor(java.lang.Class r3, java.util.function.Consumer<java.lang.reflect.Constructor> r4) {
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Constructor[]> r0 = com.alibaba.fastjson2.util.BeanUtils.constructorCache
            java.lang.Object r1 = r0.get(r3)
            java.lang.reflect.Constructor[] r1 = (java.lang.reflect.Constructor[]) r1
            if (r1 != 0) goto L11
            java.lang.reflect.Constructor[] r1 = r3.getDeclaredConstructors()
            r0.put(r3, r1)
        L11:
            int r3 = r1.length
            r0 = 0
        L13:
            if (r0 >= r3) goto L1d
            r2 = r1[r0]
            r4.accept(r2)
            int r0 = r0 + 1
            goto L13
        L1d:
            return
    }

    public static /* synthetic */ void d(java.lang.String r0, java.util.concurrent.atomic.AtomicReference r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3) {
            lambda$getEnumValueField$2(r0, r1, r2, r3)
            return
    }

    public static java.lang.String dashes(java.lang.String r9, int r10, boolean r11) {
            int r0 = r9.length()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.util.TypeUtils$Cache, char[]> r1 = com.alibaba.fastjson2.util.TypeUtils.CHARS_UPDATER
            com.alibaba.fastjson2.util.TypeUtils$Cache r2 = com.alibaba.fastjson2.util.TypeUtils.CACHE
            r3 = 0
            java.lang.Object r1 = r1.getAndSet(r2, r3)
            char[] r1 = (char[]) r1
            if (r1 != 0) goto L15
            r1 = 128(0x80, float:1.8E-43)
            char[] r1 = new char[r1]
        L15:
            r2 = 0
            r3 = r10
            r4 = r2
        L18:
            if (r3 >= r0) goto L56
            char r5 = r9.charAt(r3)     // Catch: java.lang.Throwable -> L32
            r6 = 45
            r7 = 90
            r8 = 65
            if (r11 == 0) goto L40
            if (r5 < r8) goto L34
            if (r5 > r7) goto L34
            if (r3 <= r10) goto L4e
            int r7 = r4 + 1
            r1[r4] = r6     // Catch: java.lang.Throwable -> L32
            r4 = r7
            goto L4e
        L32:
            r9 = move-exception
            goto L63
        L34:
            r6 = 97
            if (r5 < r6) goto L4e
            r6 = 122(0x7a, float:1.71E-43)
            if (r5 > r6) goto L4e
            int r5 = r5 + (-32)
        L3e:
            char r5 = (char) r5     // Catch: java.lang.Throwable -> L32
            goto L4e
        L40:
            if (r5 < r8) goto L4e
            if (r5 > r7) goto L4e
            if (r3 <= r10) goto L4b
            int r7 = r4 + 1
            r1[r4] = r6     // Catch: java.lang.Throwable -> L32
            r4 = r7
        L4b:
            int r5 = r5 + 32
            goto L3e
        L4e:
            int r6 = r4 + 1
            r1[r4] = r5     // Catch: java.lang.Throwable -> L32
            int r3 = r3 + 1
            r4 = r6
            goto L18
        L56:
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Throwable -> L32
            r9.<init>(r1, r2, r4)     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.util.TypeUtils$Cache, char[]> r10 = com.alibaba.fastjson2.util.TypeUtils.CHARS_UPDATER
            com.alibaba.fastjson2.util.TypeUtils$Cache r11 = com.alibaba.fastjson2.util.TypeUtils.CACHE
            r10.set(r11, r1)
            return r9
        L63:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.util.TypeUtils$Cache, char[]> r10 = com.alibaba.fastjson2.util.TypeUtils.CHARS_UPDATER
            com.alibaba.fastjson2.util.TypeUtils$Cache r11 = com.alibaba.fastjson2.util.TypeUtils.CACHE
            r10.set(r11, r1)
            throw r9
    }

    public static void declaredFields(java.lang.Class r8, java.util.function.Consumer<java.lang.reflect.Field> r9) {
            if (r8 == 0) goto Lcd
            if (r9 != 0) goto L6
            goto Lcd
        L6:
            java.lang.Class r0 = r8.getSuperclass()
            r1 = 0
            if (r0 == 0) goto L21
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r0 == r2) goto L21
            java.lang.String r2 = r0.getName()
            java.lang.String r3 = "com.google.protobuf.GeneratedMessageV3"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L22
            declaredFields(r0, r9)
            goto L22
        L21:
            r2 = r1
        L22:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> r0 = com.alibaba.fastjson2.util.BeanUtils.declaredFieldCache
            java.lang.Object r3 = r0.get(r8)
            java.lang.reflect.Field[] r3 = (java.lang.reflect.Field[]) r3
            if (r3 != 0) goto L79
            java.lang.reflect.Field[] r3 = r8.getDeclaredFields()     // Catch: java.lang.Throwable -> L34
            r0.put(r8, r3)     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            java.lang.reflect.Field[] r3 = new java.lang.reflect.Field[r1]
        L36:
            int r0 = r3.length
            r4 = r1
        L38:
            if (r4 >= r0) goto L74
            r5 = r3[r4]
            int r5 = r5.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 == 0) goto L71
            java.util.ArrayList r0 = new java.util.ArrayList
            int r4 = r3.length
            r0.<init>(r4)
            int r4 = r3.length
            r5 = r1
        L4e:
            if (r5 >= r4) goto L63
            r6 = r3[r5]
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 == 0) goto L5d
            goto L60
        L5d:
            r0.add(r6)
        L60:
            int r5 = r5 + 1
            goto L4e
        L63:
            int r3 = r0.size()
            java.lang.reflect.Field[] r3 = new java.lang.reflect.Field[r3]
            java.lang.Object[] r0 = r0.toArray(r3)
            java.lang.reflect.Field[] r0 = (java.lang.reflect.Field[]) r0
            r3 = r0
            goto L74
        L71:
            int r4 = r4 + 1
            goto L38
        L74:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> r0 = com.alibaba.fastjson2.util.BeanUtils.fieldCache
            r0.put(r8, r3)
        L79:
            int r8 = r3.length
        L7a:
            if (r1 >= r8) goto Lcd
            r0 = r3[r1]
            int r4 = r0.getModifiers()
            r4 = r4 & 8
            if (r4 != 0) goto Lca
            java.lang.Class r4 = r0.getType()
            java.lang.Class<java.lang.ClassLoader> r5 = java.lang.ClassLoader.class
            if (r4 != r5) goto L8f
            goto Lca
        L8f:
            if (r2 == 0) goto Lae
            java.lang.String r4 = r0.getName()
            java.lang.Class r5 = r0.getType()
            java.lang.String r6 = "cardsmap_"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto Lae
            java.lang.String r4 = r5.getName()
            java.lang.String r5 = "com.google.protobuf.MapField"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lae
            goto Lcd
        Lae:
            java.lang.Class r4 = r0.getDeclaringClass()
            java.lang.Class<java.util.AbstractMap> r5 = java.util.AbstractMap.class
            if (r4 == r5) goto Lca
            java.lang.Class<java.util.HashMap> r5 = java.util.HashMap.class
            if (r4 == r5) goto Lca
            java.lang.Class<java.util.LinkedHashMap> r5 = java.util.LinkedHashMap.class
            if (r4 == r5) goto Lca
            java.lang.Class<java.util.TreeMap> r5 = java.util.TreeMap.class
            if (r4 == r5) goto Lca
            java.lang.Class<java.util.concurrent.ConcurrentHashMap> r5 = java.util.concurrent.ConcurrentHashMap.class
            if (r4 != r5) goto Lc7
            goto Lca
        Lc7:
            r9.accept(r0)
        Lca:
            int r1 = r1 + 1
            goto L7a
        Lcd:
            return
    }

    private static java.lang.Class<?> declaringClassOf(java.lang.reflect.TypeVariable<?> r1) {
            java.lang.reflect.GenericDeclaration r1 = r1.getGenericDeclaration()
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static java.lang.String dots(java.lang.String r9, int r10, boolean r11) {
            int r0 = r9.length()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.util.TypeUtils$Cache, char[]> r1 = com.alibaba.fastjson2.util.TypeUtils.CHARS_UPDATER
            com.alibaba.fastjson2.util.TypeUtils$Cache r2 = com.alibaba.fastjson2.util.TypeUtils.CACHE
            r3 = 0
            java.lang.Object r1 = r1.getAndSet(r2, r3)
            char[] r1 = (char[]) r1
            if (r1 != 0) goto L15
            r1 = 128(0x80, float:1.8E-43)
            char[] r1 = new char[r1]
        L15:
            r2 = 0
            r3 = r10
            r4 = r2
        L18:
            if (r3 >= r0) goto L56
            char r5 = r9.charAt(r3)     // Catch: java.lang.Throwable -> L32
            r6 = 46
            r7 = 90
            r8 = 65
            if (r11 == 0) goto L40
            if (r5 < r8) goto L34
            if (r5 > r7) goto L34
            if (r3 <= r10) goto L4e
            int r7 = r4 + 1
            r1[r4] = r6     // Catch: java.lang.Throwable -> L32
            r4 = r7
            goto L4e
        L32:
            r9 = move-exception
            goto L63
        L34:
            r6 = 97
            if (r5 < r6) goto L4e
            r6 = 122(0x7a, float:1.71E-43)
            if (r5 > r6) goto L4e
            int r5 = r5 + (-32)
        L3e:
            char r5 = (char) r5     // Catch: java.lang.Throwable -> L32
            goto L4e
        L40:
            if (r5 < r8) goto L4e
            if (r5 > r7) goto L4e
            if (r3 <= r10) goto L4b
            int r7 = r4 + 1
            r1[r4] = r6     // Catch: java.lang.Throwable -> L32
            r4 = r7
        L4b:
            int r5 = r5 + 32
            goto L3e
        L4e:
            int r6 = r4 + 1
            r1[r4] = r5     // Catch: java.lang.Throwable -> L32
            int r3 = r3 + 1
            r4 = r6
            goto L18
        L56:
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Throwable -> L32
            r9.<init>(r1, r2, r4)     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.util.TypeUtils$Cache, char[]> r10 = com.alibaba.fastjson2.util.TypeUtils.CHARS_UPDATER
            com.alibaba.fastjson2.util.TypeUtils$Cache r11 = com.alibaba.fastjson2.util.TypeUtils.CACHE
            r10.set(r11, r1)
            return r9
        L63:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.util.TypeUtils$Cache, char[]> r10 = com.alibaba.fastjson2.util.TypeUtils.CHARS_UPDATER
            com.alibaba.fastjson2.util.TypeUtils$Cache r11 = com.alibaba.fastjson2.util.TypeUtils.CACHE
            r10.set(r11, r1)
            throw r9
    }

    public static /* synthetic */ void e(com.alibaba.fastjson2.codec.BeanInfo r0, java.lang.annotation.Annotation r1, java.lang.reflect.Method r2) {
            lambda$isWriteEnumAsJavaBean$1(r0, r1, r2)
            return
    }

    public static boolean equal(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public static boolean equals(java.lang.reflect.Type r4, java.lang.reflect.Type r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof java.lang.Class
            if (r1 == 0) goto Ld
            boolean r4 = r4.equals(r5)
            return r4
        Ld:
            boolean r1 = r4 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            if (r1 == 0) goto L47
            boolean r1 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r1 = r4.getOwnerType()
            java.lang.reflect.Type r3 = r5.getOwnerType()
            boolean r1 = equal(r1, r3)
            if (r1 == 0) goto L46
            java.lang.reflect.Type r1 = r4.getRawType()
            java.lang.reflect.Type r3 = r5.getRawType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L46
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L46
            return r0
        L46:
            return r2
        L47:
            boolean r1 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L61
            boolean r0 = r5 instanceof java.lang.reflect.GenericArrayType
            if (r0 != 0) goto L50
            return r2
        L50:
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            java.lang.reflect.GenericArrayType r5 = (java.lang.reflect.GenericArrayType) r5
            java.lang.reflect.Type r4 = r4.getGenericComponentType()
            java.lang.reflect.Type r5 = r5.getGenericComponentType()
            boolean r4 = equals(r4, r5)
            return r4
        L61:
            boolean r1 = r4 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L8c
            boolean r1 = r5 instanceof java.lang.reflect.WildcardType
            if (r1 != 0) goto L6a
            return r2
        L6a:
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r1 = r4.getUpperBounds()
            java.lang.reflect.Type[] r3 = r5.getUpperBounds()
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L8b
            java.lang.reflect.Type[] r4 = r4.getLowerBounds()
            java.lang.reflect.Type[] r5 = r5.getLowerBounds()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L8b
            return r0
        L8b:
            return r2
        L8c:
            boolean r1 = r4 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto Lb2
            boolean r1 = r5 instanceof java.lang.reflect.TypeVariable
            if (r1 != 0) goto L95
            return r2
        L95:
            java.lang.reflect.TypeVariable r4 = (java.lang.reflect.TypeVariable) r4
            java.lang.reflect.TypeVariable r5 = (java.lang.reflect.TypeVariable) r5
            java.lang.reflect.GenericDeclaration r1 = r4.getGenericDeclaration()
            java.lang.reflect.GenericDeclaration r3 = r5.getGenericDeclaration()
            if (r1 != r3) goto Lb2
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r5.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lb2
            return r0
        Lb2:
            return r2
    }

    public static java.lang.String fieldName(java.lang.String r8, java.lang.String r9) {
            java.lang.String r0 = "CamelCase"
            if (r9 != 0) goto L5
            r9 = r0
        L5:
            if (r8 == 0) goto L219
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto Lf
            goto L219
        Lf:
            int r1 = r9.hashCode()
            r2 = 1
            r3 = 0
            r4 = -1
            switch(r1) {
                case -2068429102: goto L100;
                case -1863045342: goto Lf5;
                case -1112704575: goto Lea;
                case -46641534: goto Ldf;
                case 246111473: goto Ld4;
                case 572594479: goto Lc9;
                case 601822360: goto Lbe;
                case 928600554: goto Lb3;
                case 975280372: goto La5;
                case 1315531521: goto L97;
                case 1336502620: goto L89;
                case 1371349591: goto L7b;
                case 1460726553: goto L6d;
                case 1488507313: goto L5f;
                case 1492440247: goto L51;
                case 1655544038: goto L45;
                case 1839922637: goto L37;
                case 1976554305: goto L29;
                case 2087942256: goto L1b;
                default: goto L19;
            }
        L19:
            goto L10a
        L1b:
            java.lang.String r0 = "SnakeCase"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L25
            goto L10a
        L25:
            r4 = 18
            goto L10a
        L29:
            java.lang.String r0 = "UpperCaseWithUnderScores"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L33
            goto L10a
        L33:
            r4 = 17
            goto L10a
        L37:
            java.lang.String r0 = "CamelCase1x"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L41
            goto L10a
        L41:
            r4 = 16
            goto L10a
        L45:
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L4d
            goto L10a
        L4d:
            r4 = 15
            goto L10a
        L51:
            java.lang.String r0 = "LowerCaseWithDashes"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L5b
            goto L10a
        L5b:
            r4 = 14
            goto L10a
        L5f:
            java.lang.String r0 = "LowerCase"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L69
            goto L10a
        L69:
            r4 = 13
            goto L10a
        L6d:
            java.lang.String r0 = "KebabCase"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L77
            goto L10a
        L77:
            r4 = 12
            goto L10a
        L7b:
            java.lang.String r0 = "UpperCamelCaseWithSpaces"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L85
            goto L10a
        L85:
            r4 = 11
            goto L10a
        L89:
            java.lang.String r0 = "PascalCase"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L93
            goto L10a
        L93:
            r4 = 10
            goto L10a
        L97:
            java.lang.String r0 = "LowerCaseWithDots"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto La1
            goto L10a
        La1:
            r4 = 9
            goto L10a
        La5:
            java.lang.String r0 = "UpperCamelCaseWithDots"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Laf
            goto L10a
        Laf:
            r4 = 8
            goto L10a
        Lb3:
            java.lang.String r0 = "UpperCamelCaseWithDashes"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Lbc
            goto L10a
        Lbc:
            r4 = 7
            goto L10a
        Lbe:
            java.lang.String r0 = "UpperCaseWithDashes"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Lc7
            goto L10a
        Lc7:
            r4 = 6
            goto L10a
        Lc9:
            java.lang.String r0 = "UpperCamelCaseWithUnderScores"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Ld2
            goto L10a
        Ld2:
            r4 = 5
            goto L10a
        Ld4:
            java.lang.String r0 = "NoChange"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Ldd
            goto L10a
        Ldd:
            r4 = 4
            goto L10a
        Ldf:
            java.lang.String r0 = "LowerCaseWithUnderScores"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Le8
            goto L10a
        Le8:
            r4 = 3
            goto L10a
        Lea:
            java.lang.String r0 = "NeverUseThisValueExceptDefaultValue"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Lf3
            goto L10a
        Lf3:
            r4 = 2
            goto L10a
        Lf5:
            java.lang.String r0 = "UpperCaseWithDots"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Lfe
            goto L10a
        Lfe:
            r4 = r2
            goto L10a
        L100:
            java.lang.String r0 = "UpperCase"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L109
            goto L10a
        L109:
            r4 = r3
        L10a:
            r0 = 95
            r1 = 45
            r5 = 90
            r6 = 65
            r7 = 32
            switch(r4) {
                case 0: goto L215;
                case 1: goto L210;
                case 2: goto L1e3;
                case 3: goto L1de;
                case 4: goto L1e3;
                case 5: goto L1d9;
                case 6: goto L1d4;
                case 7: goto L1cf;
                case 8: goto L1c8;
                case 9: goto L1c3;
                case 10: goto L17d;
                case 11: goto L178;
                case 12: goto L152;
                case 13: goto L14d;
                case 14: goto L148;
                case 15: goto L1e3;
                case 16: goto L12c;
                case 17: goto L127;
                case 18: goto L122;
                default: goto L117;
            }
        L117:
            java.lang.String r8 = "TODO : "
            java.lang.String r8 = r8.concat(r9)
            ah.a.w(r8)
            r8 = 0
            return r8
        L122:
            java.lang.String r8 = snakeCase(r8, r3)
            return r8
        L127:
            java.lang.String r8 = underScores(r8, r3, r2)
            return r8
        L12c:
            char r9 = r8.charAt(r3)
            if (r9 < r6) goto L20f
            if (r9 > r5) goto L20f
            int r0 = r8.length()
            if (r0 <= r2) goto L20f
            char[] r8 = r8.toCharArray()
            int r9 = r9 + r7
            char r9 = (char) r9
            r8[r3] = r9
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            return r9
        L148:
            java.lang.String r8 = dashes(r8, r3, r3)
            return r8
        L14d:
            java.lang.String r8 = r8.toLowerCase()
            return r8
        L152:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
        L157:
            int r0 = r8.length()
            if (r3 >= r0) goto L173
            char r0 = r8.charAt(r3)
            if (r0 < r6) goto L16d
            if (r0 > r5) goto L16d
            int r0 = r0 + 32
            char r0 = (char) r0
            if (r3 <= 0) goto L16d
            r9.append(r1)
        L16d:
            r9.append(r0)
            int r3 = r3 + 1
            goto L157
        L173:
            java.lang.String r8 = r9.toString()
            return r8
        L178:
            java.lang.String r8 = upperCamelWith(r8, r3, r7)
            return r8
        L17d:
            char r9 = r8.charAt(r3)
            r1 = 122(0x7a, float:1.71E-43)
            r4 = 97
            if (r9 < r4) goto L1a5
            if (r9 > r1) goto L1a5
            int r5 = r8.length()
            if (r5 <= r2) goto L1a5
            char r5 = r8.charAt(r2)
            if (r5 < r4) goto L1a5
            if (r5 > r1) goto L1a5
            char[] r8 = r8.toCharArray()
            int r9 = r9 - r7
            char r9 = (char) r9
            r8[r3] = r9
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            return r9
        L1a5:
            if (r9 != r0) goto L20f
            int r9 = r8.length()
            if (r9 <= r2) goto L20f
            char r9 = r8.charAt(r2)
            if (r9 < r4) goto L20f
            if (r9 > r1) goto L20f
            char[] r8 = r8.toCharArray()
            int r9 = r9 - r7
            char r9 = (char) r9
            r8[r2] = r9
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            return r9
        L1c3:
            java.lang.String r8 = dots(r8, r3, r3)
            return r8
        L1c8:
            r9 = 46
            java.lang.String r8 = upperCamelWith(r8, r3, r9)
            return r8
        L1cf:
            java.lang.String r8 = upperCamelWith(r8, r3, r1)
            return r8
        L1d4:
            java.lang.String r8 = dashes(r8, r3, r2)
            return r8
        L1d9:
            java.lang.String r8 = upperCamelWith(r8, r3, r0)
            return r8
        L1de:
            java.lang.String r8 = underScores(r8, r3, r3)
            return r8
        L1e3:
            char r9 = r8.charAt(r3)
            int r0 = r8.length()
            if (r0 <= r2) goto L1f2
            char r0 = r8.charAt(r2)
            goto L1f3
        L1f2:
            r0 = r3
        L1f3:
            if (r9 < r6) goto L20f
            if (r9 > r5) goto L20f
            int r1 = r8.length()
            if (r1 <= r2) goto L20f
            if (r0 < r6) goto L201
            if (r0 <= r5) goto L20f
        L201:
            char[] r8 = r8.toCharArray()
            int r9 = r9 + r7
            char r9 = (char) r9
            r8[r3] = r9
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            return r9
        L20f:
            return r8
        L210:
            java.lang.String r8 = dots(r8, r3, r2)
            return r8
        L215:
            java.lang.String r8 = r8.toUpperCase()
        L219:
            return r8
    }

    public static void fields(java.lang.Class r7, java.util.function.Consumer<java.lang.reflect.Field> r8) {
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> r0 = com.alibaba.fastjson2.util.BeanUtils.fieldCache
            java.lang.Object r1 = r0.get(r7)
            java.lang.reflect.Field[] r1 = (java.lang.reflect.Field[]) r1
            if (r1 != 0) goto L11
            java.lang.reflect.Field[] r1 = r7.getFields()
            r0.put(r7, r1)
        L11:
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r7 = r0.isAssignableFrom(r7)
            int r0 = r1.length
            r2 = 0
        L19:
            if (r2 >= r0) goto L38
            r3 = r1[r2]
            int r4 = r3.getModifiers()
            java.lang.Class r5 = r3.getType()
            java.lang.Class<java.lang.ClassLoader> r6 = java.lang.ClassLoader.class
            if (r5 == r6) goto L35
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 == 0) goto L32
            if (r7 != 0) goto L32
            goto L35
        L32:
            r8.accept(r3)
        L35:
            int r2 = r2 + 1
            goto L19
        L38:
            return
    }

    public static <A extends java.lang.annotation.Annotation> A findAnnotation(java.lang.annotation.Annotation r1, java.lang.Class<A> r2) {
            if (r1 == 0) goto L14
            if (r2 == 0) goto Ld
            java.lang.Class r0 = r1.annotationType()
            if (r0 != r2) goto Lb
            return r1
        Lb:
            r1 = 0
            return r1
        Ld:
            java.lang.String r1 = "annotationType must not be null"
            bsh.j.c(r1)
        L12:
            r1 = 0
            return r1
        L14:
            java.lang.String r1 = "annotation must not be null"
            bsh.j.c(r1)
            goto L12
    }

    public static <A extends java.lang.annotation.Annotation> A findAnnotation(java.lang.reflect.AnnotatedElement r0, java.lang.Class<A> r1) {
            if (r1 == 0) goto L7
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            return r0
        L7:
            java.lang.String r0 = "annotationType must not be null"
            bsh.j.c(r0)
            r0 = 0
            return r0
    }

    public static java.lang.reflect.Constructor[] getConstructor(java.lang.Class r2) {
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Constructor[]> r0 = com.alibaba.fastjson2.util.BeanUtils.constructorCache
            java.lang.Object r1 = r0.get(r2)
            java.lang.reflect.Constructor[] r1 = (java.lang.reflect.Constructor[]) r1
            if (r1 != 0) goto L11
            java.lang.reflect.Constructor[] r1 = r2.getDeclaredConstructors()
            r0.put(r2, r1)
        L11:
            return r1
    }

    public static java.lang.reflect.Field getDeclaredField(java.lang.Class r8, java.lang.String r9) {
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.util.Map<java.lang.String, java.lang.reflect.Field>> r0 = com.alibaba.fastjson2.util.BeanUtils.fieldMapCache
            java.lang.Object r0 = r0.get(r8)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L82
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> r1 = com.alibaba.fastjson2.util.BeanUtils.declaredFieldCache
            java.lang.Object r2 = r1.get(r8)
            java.lang.reflect.Field[] r2 = (java.lang.reflect.Field[]) r2
            r3 = 0
            if (r2 != 0) goto L67
            java.lang.reflect.Field[] r2 = r8.getDeclaredFields()     // Catch: java.lang.Throwable -> L22
            r1.put(r8, r2)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            java.lang.reflect.Field[] r2 = new java.lang.reflect.Field[r3]
        L24:
            int r1 = r2.length
            r4 = r3
        L26:
            if (r4 >= r1) goto L62
            r5 = r2[r4]
            int r5 = r5.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 == 0) goto L5f
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = r2.length
            r1.<init>(r4)
            int r4 = r2.length
            r5 = r3
        L3c:
            if (r5 >= r4) goto L51
            r6 = r2[r5]
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 == 0) goto L4b
            goto L4e
        L4b:
            r1.add(r6)
        L4e:
            int r5 = r5 + 1
            goto L3c
        L51:
            int r2 = r1.size()
            java.lang.reflect.Field[] r2 = new java.lang.reflect.Field[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.lang.reflect.Field[] r1 = (java.lang.reflect.Field[]) r1
            r2 = r1
            goto L62
        L5f:
            int r4 = r4 + 1
            goto L26
        L62:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> r1 = com.alibaba.fastjson2.util.BeanUtils.fieldCache
            r1.put(r8, r2)
        L67:
            int r1 = r2.length
        L68:
            if (r3 >= r1) goto L76
            r4 = r2[r3]
            java.lang.String r5 = r4.getName()
            r0.put(r5, r4)
            int r3 = r3 + 1
            goto L68
        L76:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.util.Map<java.lang.String, java.lang.reflect.Field>> r1 = com.alibaba.fastjson2.util.BeanUtils.fieldMapCache
            r1.put(r8, r0)
            java.lang.Object r8 = r1.get(r8)
            r0 = r8
            java.util.Map r0 = (java.util.Map) r0
        L82:
            java.lang.Object r8 = r0.get(r9)
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            return r8
    }

    public static java.lang.reflect.Constructor getDefaultConstructor(java.lang.Class r7, boolean r8) {
            java.lang.Class<java.lang.StackTraceElement> r0 = java.lang.StackTraceElement.class
            r1 = 0
            if (r7 != r0) goto L6
            return r1
        L6:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Constructor[]> r0 = com.alibaba.fastjson2.util.BeanUtils.constructorCache
            java.lang.Object r2 = r0.get(r7)
            java.lang.reflect.Constructor[] r2 = (java.lang.reflect.Constructor[]) r2
            if (r2 != 0) goto L17
            java.lang.reflect.Constructor[] r2 = r7.getDeclaredConstructors()
            r0.put(r7, r2)
        L17:
            int r0 = r2.length
            r3 = 0
            r4 = r3
        L1a:
            if (r4 >= r0) goto L28
            r5 = r2[r4]
            int r6 = r5.getParameterCount()
            if (r6 != 0) goto L25
            return r5
        L25:
            int r4 = r4 + 1
            goto L1a
        L28:
            if (r8 != 0) goto L2b
            return r1
        L2b:
            java.lang.Class r7 = r7.getDeclaringClass()
            if (r7 == 0) goto L4e
            int r8 = r2.length
            r0 = r3
        L33:
            if (r0 >= r8) goto L4e
            r4 = r2[r0]
            int r5 = r4.getParameterCount()
            r6 = 1
            if (r5 != r6) goto L4b
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5 = r5[r3]
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L4b
            return r4
        L4b:
            int r0 = r0 + 1
            goto L33
        L4e:
            return r1
    }

    public static java.lang.String[] getEnumAnnotationNames(java.lang.Class r11) {
            java.lang.Object[] r0 = r11.getEnumConstants()
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            int r1 = r0.length
            java.lang.String[] r2 = new java.lang.String[r1]
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> r3 = com.alibaba.fastjson2.util.BeanUtils.fieldCache
            java.lang.Object r4 = r3.get(r11)
            java.lang.reflect.Field[] r4 = (java.lang.reflect.Field[]) r4
            if (r4 != 0) goto L1a
            java.lang.reflect.Field[] r4 = r11.getFields()
            r3.put(r11, r4)
        L1a:
            int r11 = r4.length
            r3 = 0
            r5 = r3
        L1d:
            if (r5 >= r11) goto L58
            r6 = r4[r5]
            java.lang.String r7 = r6.getName()
            r8 = r3
        L26:
            int r9 = r0.length
            if (r8 >= r9) goto L55
            r9 = r0[r8]
            java.lang.String r9 = r9.name()
            boolean r10 = r7.equals(r9)
            if (r10 == 0) goto L52
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONField> r7 = com.alibaba.fastjson2.annotation.JSONField.class
            java.lang.annotation.Annotation r6 = r6.getAnnotation(r7)
            com.alibaba.fastjson2.annotation.JSONField r6 = (com.alibaba.fastjson2.annotation.JSONField) r6
            if (r6 == 0) goto L55
            java.lang.String r6 = r6.name()
            int r7 = r6.length()
            if (r7 == 0) goto L55
            boolean r7 = r6.equals(r9)
            if (r7 != 0) goto L55
            r2[r8] = r6
            goto L55
        L52:
            int r8 = r8 + 1
            goto L26
        L55:
            int r5 = r5 + 1
            goto L1d
        L58:
            r11 = r3
        L59:
            if (r3 >= r1) goto L64
            r0 = r2[r3]
            if (r0 != 0) goto L61
            int r11 = r11 + 1
        L61:
            int r3 = r3 + 1
            goto L59
        L64:
            if (r11 != r1) goto L68
            r11 = 0
            return r11
        L68:
            return r2
    }

    public static java.lang.reflect.Member getEnumValueField(java.lang.Class r17, java.lang.Object r18) {
            r0 = r17
            r1 = r18
            r2 = 0
            if (r0 != 0) goto Lb
        L7:
            r16 = r2
            goto L151
        Lb:
            java.lang.Class[] r3 = r0.getInterfaces()
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Method[]> r4 = com.alibaba.fastjson2.util.BeanUtils.methodCache
            java.lang.Object r5 = r4.get(r0)
            java.lang.reflect.Method[] r5 = (java.lang.reflect.Method[]) r5
            if (r5 != 0) goto L20
            java.lang.reflect.Method[] r5 = r0.getMethods()
            r4.putIfAbsent(r0, r5)
        L20:
            int r4 = r5.length
            r6 = 0
            r8 = r2
            r7 = r6
        L24:
            if (r7 >= r4) goto L107
            r9 = r5[r7]
            java.lang.Class r10 = r9.getReturnType()
            java.lang.Class<java.lang.Void> r11 = java.lang.Void.class
            if (r10 != r11) goto L32
            goto L9d
        L32:
            int r10 = r9.getParameterCount()
            if (r10 == 0) goto L39
            goto L9d
        L39:
            java.lang.Class r10 = r9.getDeclaringClass()
            java.lang.Class<java.lang.Enum> r11 = java.lang.Enum.class
            if (r10 == r11) goto L9d
            java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
            if (r10 != r11) goto L46
            goto L9d
        L46:
            java.lang.String r10 = r9.getName()
            java.lang.String r11 = "values"
            boolean r11 = r11.equals(r10)
            if (r11 == 0) goto L53
            goto L9d
        L53:
            boolean r11 = isJSONField(r9)
            if (r11 == 0) goto L5a
            return r9
        L5a:
            java.lang.String r11 = "get"
            boolean r11 = r10.startsWith(r11)
            if (r11 == 0) goto La0
            java.lang.String r11 = getterName(r10, r2)
            java.lang.reflect.Field r11 = getDeclaredField(r0, r11)
            if (r11 == 0) goto La0
            boolean r11 = isJSONField(r11)
            if (r11 == 0) goto La0
            if (r8 != 0) goto L79
            r16 = r2
            r8 = r9
            goto L101
        L79:
            java.lang.String r10 = r8.getName()
            java.lang.String r11 = r9.getName()
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L7
            boolean r10 = r8 instanceof java.lang.reflect.Method
            if (r10 == 0) goto L9d
            r10 = r8
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.Class r10 = r10.getReturnType()
            java.lang.Class r11 = r9.getReturnType()
            boolean r10 = r10.isAssignableFrom(r11)
            if (r10 == 0) goto L9d
            r8 = r9
        L9d:
            r16 = r2
            goto L101
        La0:
            java.util.concurrent.atomic.AtomicReference r11 = new java.util.concurrent.atomic.AtomicReference
            r11.<init>()
            int r12 = r3.length
            r13 = r6
        La7:
            if (r13 >= r12) goto Le4
            r14 = r3[r13]
            com.alibaba.fastjson2.util.b r15 = new com.alibaba.fastjson2.util.b
            r16 = r2
            r2 = 0
            r15.<init>(r10, r11, r9, r2)
            getters(r14, r15)
            boolean r2 = r1 instanceof com.alibaba.fastjson2.reader.ObjectReaderProvider
            if (r2 == 0) goto Lc2
            r2 = r1
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = (com.alibaba.fastjson2.reader.ObjectReaderProvider) r2
            java.lang.Class r2 = r2.getMixIn(r14)
            goto Ld4
        Lc2:
            boolean r2 = r1 instanceof com.alibaba.fastjson2.writer.ObjectWriterProvider
            if (r2 == 0) goto Lce
            r2 = r1
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = (com.alibaba.fastjson2.writer.ObjectWriterProvider) r2
            java.lang.Class r2 = r2.getMixIn(r14)
            goto Ld4
        Lce:
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            java.lang.Class r2 = r2.getMixIn(r14)
        Ld4:
            if (r2 == 0) goto Ldf
            com.alibaba.fastjson2.util.b r14 = new com.alibaba.fastjson2.util.b
            r15 = 1
            r14.<init>(r10, r11, r9, r15)
            getters(r2, r14)
        Ldf:
            int r13 = r13 + 1
            r2 = r16
            goto La7
        Le4:
            r16 = r2
            java.lang.Object r2 = r11.get()
            java.lang.reflect.Member r2 = (java.lang.reflect.Member) r2
            if (r2 == 0) goto L101
            if (r8 != 0) goto Lf2
            r8 = r2
            goto L101
        Lf2:
            java.lang.String r9 = r8.getName()
            java.lang.String r2 = r2.getName()
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L101
            goto L151
        L101:
            int r7 = r7 + 1
            r2 = r16
            goto L24
        L107:
            r16 = r2
            if (r8 == 0) goto L10c
            return r8
        L10c:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> r1 = com.alibaba.fastjson2.util.BeanUtils.fieldCache
            java.lang.Object r2 = r1.get(r0)
            java.lang.reflect.Field[] r2 = (java.lang.reflect.Field[]) r2
            if (r2 != 0) goto L11d
            java.lang.reflect.Field[] r2 = r0.getFields()
            r1.putIfAbsent(r0, r2)
        L11d:
            java.lang.Object[] r0 = r0.getEnumConstants()
            java.lang.Enum[] r0 = (java.lang.Enum[]) r0
            int r1 = r2.length
            r3 = r6
        L125:
            if (r3 >= r1) goto L151
            r4 = r2[r3]
            if (r0 == 0) goto L144
            java.lang.String r5 = r4.getName()
            int r7 = r0.length
            r8 = r6
        L131:
            if (r8 >= r7) goto L144
            r9 = r0[r8]
            java.lang.String r9 = r9.name()
            boolean r9 = r5.equals(r9)
            if (r9 == 0) goto L141
            r5 = 1
            goto L145
        L141:
            int r8 = r8 + 1
            goto L131
        L144:
            r5 = r6
        L145:
            boolean r7 = isJSONField(r4)
            if (r7 == 0) goto L14e
            if (r5 != 0) goto L14e
            return r4
        L14e:
            int r3 = r3 + 1
            goto L125
        L151:
            return r16
    }

    public static java.lang.reflect.Field getField(java.lang.Class r4, java.lang.String r5) {
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> r0 = com.alibaba.fastjson2.util.BeanUtils.fieldCache
            java.lang.Object r1 = r0.get(r4)
            java.lang.reflect.Field[] r1 = (java.lang.reflect.Field[]) r1
            if (r1 != 0) goto L11
            java.lang.reflect.Field[] r1 = r4.getFields()
            r0.put(r4, r1)
        L11:
            int r4 = r1.length
            r0 = 0
        L13:
            if (r0 >= r4) goto L25
            r2 = r1[r0]
            java.lang.String r3 = r2.getName()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L22
            return r2
        L22:
            int r0 = r0 + 1
            goto L13
        L25:
            r4 = 0
            return r4
    }

    public static java.lang.reflect.Field getField(java.lang.Class r14, java.lang.reflect.Method r15) {
            java.lang.String r5 = r15.getName()
            int r1 = r5.length()
            java.lang.Class r0 = r15.getReturnType()
            r2 = 3
            r7 = 1
            r8 = 0
            r3 = 2
            if (r1 <= r3) goto L5f
            char r4 = r5.charAt(r8)
            char r6 = r5.charAt(r7)
            char r9 = r5.charAt(r3)
            r10 = 105(0x69, float:1.47E-43)
            r11 = 115(0x73, float:1.61E-43)
            if (r4 != r10) goto L35
            if (r6 != r11) goto L35
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            if (r0 == r4) goto L31
            java.lang.Class r4 = java.lang.Boolean.TYPE
            if (r0 != r4) goto L2f
            goto L31
        L2f:
            r4 = r8
            goto L32
        L31:
            r4 = r7
        L32:
            r6 = r8
        L33:
            r9 = r6
            goto L62
        L35:
            r10 = 103(0x67, float:1.44E-43)
            r12 = 116(0x74, float:1.63E-43)
            r13 = 101(0x65, float:1.42E-43)
            if (r4 != r10) goto L4a
            if (r6 != r13) goto L4a
            if (r9 != r12) goto L4a
            if (r1 <= r2) goto L45
            r4 = r7
            goto L46
        L45:
            r4 = r8
        L46:
            r6 = r4
            r4 = r8
            r9 = r4
            goto L62
        L4a:
            if (r4 != r11) goto L5f
            if (r6 != r13) goto L5f
            if (r9 != r12) goto L5f
            if (r1 <= r2) goto L5a
            int r4 = r15.getParameterCount()
            if (r4 != r7) goto L5a
            r4 = r7
            goto L5b
        L5a:
            r4 = r8
        L5b:
            r9 = r4
            r4 = r8
            r6 = r4
            goto L62
        L5f:
            r4 = r8
            r6 = r4
            goto L33
        L62:
            java.lang.reflect.Field[] r10 = new java.lang.reflect.Field[r3]
            if (r4 != 0) goto L6d
            if (r6 != 0) goto L6d
            if (r9 == 0) goto L6b
            goto L6d
        L6b:
            r6 = r10
            goto L8e
        L6d:
            if (r4 != 0) goto L78
            if (r6 == 0) goto L72
            goto L78
        L72:
            java.lang.Class[] r15 = r15.getParameterTypes()
            r0 = r15[r8]
        L78:
            if (r4 == 0) goto L7b
            r2 = r3
        L7b:
            int r15 = r1 - r2
            char[] r15 = new char[r15]
            r5.getChars(r2, r1, r15, r8)
            char r4 = r15[r8]
            r3 = r0
            com.alibaba.fastjson2.util.a r0 = new com.alibaba.fastjson2.util.a
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            declaredFields(r14, r0)
        L8e:
            r14 = r6[r8]
            if (r14 == 0) goto L93
            return r14
        L93:
            r14 = r6[r7]
            return r14
    }

    public static void getFieldInfo(java.lang.Class r7, com.alibaba.fastjson2.codec.FieldInfo r8, com.alibaba.fastjson2.reader.ObjectReaderProvider r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> r0 = com.alibaba.fastjson2.util.BeanUtils.declaredFieldCache
            java.lang.Object r1 = r0.get(r7)
            java.lang.reflect.Field[] r1 = (java.lang.reflect.Field[]) r1
            if (r1 != 0) goto L11
            java.lang.reflect.Field[] r1 = r7.getDeclaredFields()
            r0.put(r7, r1)
        L11:
            r0 = 0
        L12:
            int r2 = r1.length
            if (r0 >= r2) goto L55
            r2 = r1[r0]
            int r3 = r2.getModifiers()
            r3 = r3 & 8
            if (r3 == 0) goto L20
            goto L52
        L20:
            java.lang.String r3 = r2.getName()
            boolean r4 = r3.equals(r10)
            r5 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
            if (r4 == 0) goto L35
            r9.getFieldInfo(r8, r7, r2)
            long r2 = r8.features
            long r2 = r2 | r5
            r8.features = r2
            goto L52
        L35:
            boolean r4 = r3.equals(r11)
            if (r4 == 0) goto L44
            r9.getFieldInfo(r8, r7, r2)
            long r2 = r8.features
            long r2 = r2 | r5
            r8.features = r2
            goto L52
        L44:
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L52
            r9.getFieldInfo(r8, r7, r2)
            long r2 = r8.features
            long r2 = r2 | r5
            r8.features = r2
        L52:
            int r0 = r0 + 1
            goto L12
        L55:
            return
    }

    public static java.lang.reflect.Type getFieldType(com.alibaba.fastjson2.TypeReference r3, java.lang.Class<?> r4, java.lang.reflect.Member r5, java.lang.reflect.Type r6) {
            r0 = 0
            if (r5 != 0) goto L5
            r5 = r0
            goto L9
        L5:
            java.lang.Class r5 = r5.getDeclaringClass()
        L9:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r4 == r1) goto L3a
            if (r3 != 0) goto L11
            r3 = r0
            goto L15
        L11:
            java.lang.reflect.Type r3 = r3.getType()
        L15:
            if (r5 != r4) goto L21
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.reflect.Type r3 = resolve(r3, r5, r6, r4)
            return r3
        L21:
            java.lang.reflect.Type r1 = r4.getGenericSuperclass()
            if (r1 != 0) goto L28
            goto L3a
        L28:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.reflect.Type r3 = resolve(r3, r4, r1, r2)
            com.alibaba.fastjson2.TypeReference r3 = com.alibaba.fastjson2.TypeReference.get(r3)
            java.lang.Class r4 = r3.getRawType()
            goto L9
        L3a:
            return r0
    }

    public static java.lang.reflect.Type getGenericSupertype(java.lang.reflect.Type r3, java.lang.Class<?> r4, java.lang.Class<?> r5) {
            if (r5 != r4) goto L3
            return r3
        L3:
            boolean r3 = r5.isInterface()
            if (r3 == 0) goto L32
            java.lang.Class[] r3 = r4.getInterfaces()
            int r0 = r3.length
            r1 = 0
        Lf:
            if (r1 >= r0) goto L32
            r2 = r3[r1]
            if (r2 != r5) goto L1c
            java.lang.reflect.Type[] r3 = r4.getGenericInterfaces()
            r3 = r3[r1]
            return r3
        L1c:
            boolean r2 = r5.isAssignableFrom(r2)
            if (r2 == 0) goto L2f
            java.lang.reflect.Type[] r4 = r4.getGenericInterfaces()
            r4 = r4[r1]
            r3 = r3[r1]
            java.lang.reflect.Type r3 = getGenericSupertype(r4, r3, r5)
            return r3
        L2f:
            int r1 = r1 + 1
            goto Lf
        L32:
            if (r4 == 0) goto L5a
            boolean r3 = r4.isInterface()
            if (r3 != 0) goto L5a
        L3a:
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r4 == r3) goto L5a
            java.lang.Class r3 = r4.getSuperclass()
            if (r3 != r5) goto L49
            java.lang.reflect.Type r3 = r4.getGenericSuperclass()
            return r3
        L49:
            boolean r0 = r5.isAssignableFrom(r3)
            if (r0 == 0) goto L58
            java.lang.reflect.Type r4 = r4.getGenericSuperclass()
            java.lang.reflect.Type r3 = getGenericSupertype(r4, r3, r5)
            return r3
        L58:
            r4 = r3
            goto L3a
        L5a:
            return r5
    }

    public static void getKotlinConstructor(java.lang.Class<?> r9, com.alibaba.fastjson2.codec.BeanInfo r10) {
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Constructor[]> r0 = com.alibaba.fastjson2.util.BeanUtils.constructorCache
            java.lang.Object r1 = r0.get(r9)
            java.lang.reflect.Constructor[] r1 = (java.lang.reflect.Constructor[]) r1
            if (r1 != 0) goto L11
            java.lang.reflect.Constructor[] r1 = r9.getDeclaredConstructors()
            r0.put(r9, r1)
        L11:
            java.lang.String[] r9 = r10.createParameterNames
            int r0 = r1.length
            r2 = 0
            r3 = 0
        L16:
            if (r3 >= r0) goto L53
            r4 = r1[r3]
            int r5 = r4.getParameterCount()
            if (r9 == 0) goto L24
            int r6 = r9.length
            if (r5 == r6) goto L24
            goto L50
        L24:
            r6 = 2
            if (r5 <= r6) goto L46
            java.lang.Class[] r6 = r4.getParameterTypes()
            int r7 = r5 + (-2)
            r7 = r6[r7]
            java.lang.Class r8 = java.lang.Integer.TYPE
            if (r7 != r8) goto L46
            int r7 = r5 + (-1)
            r6 = r6[r7]
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "gg.g"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L46
            r10.markerConstructor = r4
            goto L50
        L46:
            if (r2 == 0) goto L4f
            int r6 = r2.getParameterCount()
            if (r6 < r5) goto L4f
            goto L50
        L4f:
            r2 = r4
        L50:
            int r3 = r3 + 1
            goto L16
        L53:
            r10.creatorConstructor = r2
            return
    }

    public static java.lang.String[] getKotlinConstructorParameters(java.lang.Class<?> r6) {
            java.lang.reflect.Constructor<?> r0 = com.alibaba.fastjson2.util.BeanUtils.kotlinKClassConstructor
            java.lang.String r1 = "kotlin.reflect.jvm.internal.KClassImpl"
            r2 = 1
            if (r0 != 0) goto L1e
            boolean r0 = com.alibaba.fastjson2.util.BeanUtils.kotlinClassKlassError
            if (r0 != 0) goto L1e
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L1c
            java.lang.reflect.Constructor r0 = r0.getConstructor(r3)     // Catch: java.lang.Throwable -> L1c
            com.alibaba.fastjson2.util.BeanUtils.kotlinKClassConstructor = r0     // Catch: java.lang.Throwable -> L1c
            goto L1e
        L1c:
            com.alibaba.fastjson2.util.BeanUtils.kotlinClassKlassError = r2
        L1e:
            java.lang.reflect.Constructor<?> r0 = com.alibaba.fastjson2.util.BeanUtils.kotlinKClassConstructor
            r3 = 0
            if (r0 != 0) goto L24
            return r3
        L24:
            java.lang.reflect.Method r0 = com.alibaba.fastjson2.util.BeanUtils.kotlinKClassGetConstructors
            if (r0 != 0) goto L3b
            boolean r0 = com.alibaba.fastjson2.util.BeanUtils.kotlinClassKlassError
            if (r0 != 0) goto L3b
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.String r1 = "getConstructors"
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L39
            com.alibaba.fastjson2.util.BeanUtils.kotlinKClassGetConstructors = r0     // Catch: java.lang.Throwable -> L39
            goto L3b
        L39:
            com.alibaba.fastjson2.util.BeanUtils.kotlinClassKlassError = r2
        L3b:
            java.lang.reflect.Method r0 = com.alibaba.fastjson2.util.BeanUtils.kotlinKFunctionGetParameters
            if (r0 != 0) goto L50
            boolean r0 = com.alibaba.fastjson2.util.BeanUtils.kotlinClassKlassError
            if (r0 != 0) goto L50
            java.lang.Class<gg.j> r0 = gg.j.class
            java.lang.String r1 = "getParameters"
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L4e
            com.alibaba.fastjson2.util.BeanUtils.kotlinKFunctionGetParameters = r0     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            com.alibaba.fastjson2.util.BeanUtils.kotlinClassKlassError = r2
        L50:
            java.lang.reflect.Method r0 = com.alibaba.fastjson2.util.BeanUtils.kotlinKParameterGetName
            if (r0 != 0) goto L65
            boolean r0 = com.alibaba.fastjson2.util.BeanUtils.kotlinClassKlassError
            if (r0 != 0) goto L65
            java.lang.Class<mg.c> r0 = mg.c.class
            java.lang.String r1 = "getName"
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch: java.lang.Throwable -> L63
            com.alibaba.fastjson2.util.BeanUtils.kotlinKParameterGetName = r0     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            com.alibaba.fastjson2.util.BeanUtils.kotlinClassKlassError = r2
        L65:
            boolean r0 = com.alibaba.fastjson2.util.BeanUtils.kotlinError
            if (r0 == 0) goto L6a
            return r3
        L6a:
            java.lang.reflect.Constructor<?> r0 = com.alibaba.fastjson2.util.BeanUtils.kotlinKClassConstructor     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r6 = r0.newInstance(r6)     // Catch: java.lang.Throwable -> Lcb
            java.lang.reflect.Method r0 = com.alibaba.fastjson2.util.BeanUtils.kotlinKClassGetConstructors     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r6 = r0.invoke(r6, r3)     // Catch: java.lang.Throwable -> Lcb
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Throwable -> Lcb
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> Lcb
            r0 = r3
        L81:
            boolean r1 = r6.hasNext()     // Catch: java.lang.Throwable -> Lcb
            if (r1 == 0) goto La1
            java.lang.Object r1 = r6.next()     // Catch: java.lang.Throwable -> Lcb
            java.lang.reflect.Method r4 = com.alibaba.fastjson2.util.BeanUtils.kotlinKFunctionGetParameters     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r4 = r4.invoke(r1, r3)     // Catch: java.lang.Throwable -> Lcb
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> Lcb
            if (r0 == 0) goto L9c
            int r4 = r4.size()     // Catch: java.lang.Throwable -> Lcb
            if (r4 != 0) goto L9c
            goto L9d
        L9c:
            r0 = r1
        L9d:
            r6.hasNext()     // Catch: java.lang.Throwable -> Lcb
            goto L81
        La1:
            if (r0 != 0) goto La4
            return r3
        La4:
            java.lang.reflect.Method r6 = com.alibaba.fastjson2.util.BeanUtils.kotlinKFunctionGetParameters     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r6 = r6.invoke(r0, r3)     // Catch: java.lang.Throwable -> Lcb
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> Lcb
            int r0 = r6.size()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> Lcb
            r1 = 0
        Lb3:
            int r4 = r6.size()     // Catch: java.lang.Throwable -> Lcb
            if (r1 >= r4) goto Lca
            java.lang.Object r4 = r6.get(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.reflect.Method r5 = com.alibaba.fastjson2.util.BeanUtils.kotlinKParameterGetName     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r4 = r5.invoke(r4, r3)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lcb
            r0[r1] = r4     // Catch: java.lang.Throwable -> Lcb
            int r1 = r1 + 1
            goto Lb3
        Lca:
            return r0
        Lcb:
            com.alibaba.fastjson2.util.BeanUtils.kotlinError = r2
            return r3
    }

    public static java.lang.reflect.Method getMethod(java.lang.Class r4, java.lang.String r5) {
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Method[]> r0 = com.alibaba.fastjson2.util.BeanUtils.methodCache
            java.lang.Object r1 = r0.get(r4)
            java.lang.reflect.Method[] r1 = (java.lang.reflect.Method[]) r1
            if (r1 != 0) goto L11
            java.lang.reflect.Method[] r1 = r4.getMethods()
            r0.put(r4, r1)
        L11:
            int r4 = r1.length
            r0 = 0
        L13:
            if (r0 >= r4) goto L25
            r2 = r1[r0]
            java.lang.String r3 = r2.getName()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L22
            return r2
        L22:
            int r0 = r0 + 1
            goto L13
        L25:
            r4 = 0
            return r4
    }

    public static java.lang.reflect.Method getMethod(java.lang.Class r10, java.lang.reflect.Method r11) {
            r0 = 0
            if (r10 == 0) goto L5b
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r10 == r1) goto L5b
            java.lang.Class<java.io.Serializable> r1 = java.io.Serializable.class
            if (r10 != r1) goto Lc
            goto L5b
        Lc:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Method[]> r1 = com.alibaba.fastjson2.util.BeanUtils.methodCache
            java.lang.Object r2 = r1.get(r10)
            java.lang.reflect.Method[] r2 = (java.lang.reflect.Method[]) r2
            if (r2 != 0) goto L1d
            java.lang.reflect.Method[] r2 = r10.getMethods()
            r1.put(r10, r2)
        L1d:
            int r10 = r2.length
            r1 = 0
            r3 = r1
        L20:
            if (r3 >= r10) goto L5b
            r4 = r2[r3]
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = r11.getName()
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L33
            goto L54
        L33:
            int r5 = r4.getParameterCount()
            int r6 = r11.getParameterCount()
            if (r5 == r6) goto L3e
            goto L54
        L3e:
            java.lang.Class[] r5 = r4.getParameterTypes()
            java.lang.Class[] r6 = r11.getParameterTypes()
            r7 = r1
        L47:
            int r8 = r5.length
            if (r7 >= r8) goto L5a
            r8 = r5[r7]
            r9 = r6[r7]
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L57
        L54:
            int r3 = r3 + 1
            goto L20
        L57:
            int r7 = r7 + 1
            goto L47
        L5a:
            return r4
        L5b:
            return r0
    }

    public static java.lang.reflect.Type getParamType(com.alibaba.fastjson2.TypeReference r2, java.lang.Class<?> r3, java.lang.Class r4, java.lang.reflect.Type r5) {
        L0:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r3 == r0) goto L2e
            if (r4 != r3) goto L14
            java.lang.reflect.Type r2 = r2.getType()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.reflect.Type r2 = resolve(r2, r4, r5, r3)
            return r2
        L14:
            java.lang.reflect.Type r2 = r2.getType()
            java.lang.reflect.Type r0 = r3.getGenericSuperclass()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.reflect.Type r2 = resolve(r2, r3, r0, r1)
            com.alibaba.fastjson2.TypeReference r2 = com.alibaba.fastjson2.TypeReference.get(r2)
            java.lang.Class r3 = r2.getRawType()
            goto L0
        L2e:
            r2 = 0
            return r2
    }

    public static java.lang.Class<?> getRawType(java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L7
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        L7:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L19
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = r3.getRawType()
            boolean r0 = r3 instanceof java.lang.Class
            checkArgument(r0)
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        L19:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            r1 = 0
            if (r0 == 0) goto L31
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            java.lang.Class r3 = getRawType(r3)
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r1)
            java.lang.Class r3 = r3.getClass()
            return r3
        L31:
            boolean r0 = r3 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L38
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            return r3
        L38:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L49
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            java.lang.reflect.Type[] r3 = r3.getUpperBounds()
            r3 = r3[r1]
            java.lang.Class r3 = getRawType(r3)
            return r3
        L49:
            if (r3 != 0) goto L4e
            java.lang.String r0 = "null"
            goto L56
        L4e:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
        L56:
            java.lang.String r1 = "Expected a Class, ParameterizedType, or GenericArrayType, but <"
            java.lang.String r2 = "> is of type "
            j8.o.m(r1, r3, r2, r0)
            r3 = 0
            return r3
    }

    public static java.lang.reflect.Method getSetter(java.lang.Class r3, java.lang.String r4) {
            r0 = 1
            java.lang.reflect.Method[] r0 = new java.lang.reflect.Method[r0]
            be.w r1 = new be.w
            r2 = 7
            r1.<init>(r4, r2, r0)
            setters(r3, r1)
            r3 = 0
            r3 = r0[r3]
            return r3
    }

    public static java.lang.String getterName(java.lang.String r14, java.lang.String r15) {
            java.lang.String r0 = "CamelCase"
            if (r15 != 0) goto L5
            r15 = r0
        L5:
            int r1 = r14.length()
            java.lang.String r2 = "is"
            r3 = 0
            boolean r2 = r14.startsWith(r2, r3)
            java.lang.String r4 = "get"
            boolean r4 = r14.startsWith(r4, r3)
            r5 = 3
            r6 = 2
            if (r2 == 0) goto L1c
            r7 = r6
            goto L21
        L1c:
            if (r4 == 0) goto L20
            r7 = r5
            goto L21
        L20:
            r7 = r3
        L21:
            if (r1 != r7) goto L24
            return r14
        L24:
            int r8 = r15.hashCode()
            r9 = 8
            r10 = 1
            r11 = -1
            switch(r8) {
                case -2068429102: goto La5;
                case -1863045342: goto L9a;
                case -1112704575: goto L8f;
                case 601822360: goto L84;
                case 1336502620: goto L79;
                case 1371349591: goto L6e;
                case 1460726553: goto L63;
                case 1655544038: goto L5a;
                case 1839922637: goto L4d;
                case 1976554305: goto L3f;
                case 2087942256: goto L31;
                default: goto L2f;
            }
        L2f:
            goto Laf
        L31:
            java.lang.String r0 = "SnakeCase"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L3b
            goto Laf
        L3b:
            r11 = 10
            goto Laf
        L3f:
            java.lang.String r0 = "UpperCaseWithUnderScores"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L49
            goto Laf
        L49:
            r11 = 9
            goto Laf
        L4d:
            java.lang.String r0 = "CamelCase1x"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L57
            goto Laf
        L57:
            r11 = r9
            goto Laf
        L5a:
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L61
            goto Laf
        L61:
            r11 = 7
            goto Laf
        L63:
            java.lang.String r0 = "KebabCase"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L6c
            goto Laf
        L6c:
            r11 = 6
            goto Laf
        L6e:
            java.lang.String r0 = "UpperCamelCaseWithSpaces"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L77
            goto Laf
        L77:
            r11 = 5
            goto Laf
        L79:
            java.lang.String r0 = "PascalCase"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L82
            goto Laf
        L82:
            r11 = 4
            goto Laf
        L84:
            java.lang.String r0 = "UpperCaseWithDashes"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L8d
            goto Laf
        L8d:
            r11 = r5
            goto Laf
        L8f:
            java.lang.String r0 = "NeverUseThisValueExceptDefaultValue"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L98
            goto Laf
        L98:
            r11 = r6
            goto Laf
        L9a:
            java.lang.String r0 = "UpperCaseWithDots"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto La3
            goto Laf
        La3:
            r11 = r10
            goto Laf
        La5:
            java.lang.String r0 = "UpperCase"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto Lae
            goto Laf
        Lae:
            r11 = r3
        Laf:
            r0 = 0
            r8 = 90
            r12 = 65
            r13 = 32
            switch(r11) {
                case 0: goto L1af;
                case 1: goto L1aa;
                case 2: goto L123;
                case 3: goto L11e;
                case 4: goto L119;
                case 5: goto L114;
                case 6: goto Le4;
                case 7: goto L123;
                case 8: goto Lcd;
                case 9: goto Lc8;
                case 10: goto Lc3;
                default: goto Lb9;
            }
        Lb9:
            java.lang.String r14 = "TODO : "
            java.lang.String r14 = r14.concat(r15)
            ah.a.w(r14)
            return r0
        Lc3:
            java.lang.String r14 = snakeCase(r14, r7)
            return r14
        Lc8:
            java.lang.String r14 = underScores(r14, r7, r10)
            return r14
        Lcd:
            int r15 = r1 - r7
            char[] r15 = new char[r15]
            r14.getChars(r7, r1, r15, r3)
            char r14 = r15[r3]
            if (r14 < r12) goto Lde
            if (r14 > r8) goto Lde
            int r14 = r14 + r13
            char r14 = (char) r14
            r15[r3] = r14
        Lde:
            java.lang.String r14 = new java.lang.String
            r14.<init>(r15)
            return r14
        Le4:
            if (r2 == 0) goto Le8
            r3 = r6
            goto Leb
        Le8:
            if (r4 == 0) goto Leb
            r3 = r5
        Leb:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r0 = r3
        Lf1:
            int r1 = r14.length()
            if (r0 >= r1) goto L10f
            char r1 = r14.charAt(r0)
            if (r1 < r12) goto L109
            if (r1 > r8) goto L109
            int r1 = r1 + 32
            char r1 = (char) r1
            if (r0 <= r3) goto L109
            r2 = 45
            r15.append(r2)
        L109:
            r15.append(r1)
            int r0 = r0 + 1
            goto Lf1
        L10f:
            java.lang.String r14 = r15.toString()
            return r14
        L114:
            java.lang.String r14 = upperCamelWith(r14, r7, r13)
            return r14
        L119:
            java.lang.String r14 = pascal(r14, r1, r7)
            return r14
        L11e:
            java.lang.String r14 = dashes(r14, r7, r10)
            return r14
        L123:
            int r15 = r1 - r7
            java.util.concurrent.atomic.AtomicReference<char[]> r2 = com.alibaba.fastjson2.util.BeanUtils.charsCache
            java.lang.Object r0 = r2.getAndSet(r0)
            char[] r0 = (char[]) r0
            if (r0 == 0) goto L132
            int r2 = r0.length
            if (r2 >= r15) goto L138
        L132:
            int r0 = java.lang.Math.max(r13, r15)
            char[] r0 = new char[r0]
        L138:
            r14.getChars(r7, r1, r0, r3)     // Catch: java.lang.Throwable -> L148
            char r14 = r0[r3]     // Catch: java.lang.Throwable -> L148
            int r1 = r0.length     // Catch: java.lang.Throwable -> L148
            if (r1 <= r10) goto L14a
            char r1 = r0[r10]     // Catch: java.lang.Throwable -> L148
            if (r1 < r12) goto L14a
            if (r1 > r8) goto L14a
            r1 = r10
            goto L14b
        L148:
            r14 = move-exception
            goto L1a4
        L14a:
            r1 = r3
        L14b:
            if (r14 < r12) goto L155
            if (r14 > r8) goto L155
            if (r1 != 0) goto L155
            int r14 = r14 + r13
            char r14 = (char) r14     // Catch: java.lang.Throwable -> L148
            r0[r3] = r14     // Catch: java.lang.Throwable -> L148
        L155:
            if (r15 > r9) goto L199
            r1 = 0
            r4 = r1
            r14 = r3
        L15b:
            if (r14 >= r15) goto L16b
            char r6 = r0[r14]     // Catch: java.lang.Throwable -> L148
            r7 = 128(0x80, float:1.8E-43)
            if (r6 <= r7) goto L165
            r4 = r1
            goto L16b
        L165:
            long r4 = r4 << r9
            long r6 = (long) r6     // Catch: java.lang.Throwable -> L148
            long r4 = r4 + r6
            int r14 = r14 + 1
            goto L15b
        L16b:
            int r14 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r14 == 0) goto L199
            int r14 = (int) r4     // Catch: java.lang.Throwable -> L148
            com.alibaba.fastjson2.util.NameCacheEntry[] r1 = com.alibaba.fastjson2.util.BeanUtils.NAME_CACHE     // Catch: java.lang.Throwable -> L148
            int r2 = r1.length     // Catch: java.lang.Throwable -> L148
            int r2 = r2 - r10
            r14 = r14 & r2
            r2 = r1[r14]     // Catch: java.lang.Throwable -> L148
            if (r2 != 0) goto L18b
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L148
            r2.<init>(r0, r3, r15)     // Catch: java.lang.Throwable -> L148
            com.alibaba.fastjson2.util.NameCacheEntry r15 = new com.alibaba.fastjson2.util.NameCacheEntry     // Catch: java.lang.Throwable -> L148
            r15.<init>(r2, r4)     // Catch: java.lang.Throwable -> L148
            r1[r14] = r15     // Catch: java.lang.Throwable -> L148
            java.util.concurrent.atomic.AtomicReference<char[]> r14 = com.alibaba.fastjson2.util.BeanUtils.charsCache
            r14.set(r0)
            return r2
        L18b:
            long r6 = r2.value     // Catch: java.lang.Throwable -> L148
            int r14 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r14 != 0) goto L199
            java.lang.String r14 = r2.name     // Catch: java.lang.Throwable -> L148
            java.util.concurrent.atomic.AtomicReference<char[]> r15 = com.alibaba.fastjson2.util.BeanUtils.charsCache
            r15.set(r0)
            return r14
        L199:
            java.lang.String r14 = new java.lang.String     // Catch: java.lang.Throwable -> L148
            r14.<init>(r0, r3, r15)     // Catch: java.lang.Throwable -> L148
            java.util.concurrent.atomic.AtomicReference<char[]> r15 = com.alibaba.fastjson2.util.BeanUtils.charsCache
            r15.set(r0)
            return r14
        L1a4:
            java.util.concurrent.atomic.AtomicReference<char[]> r15 = com.alibaba.fastjson2.util.BeanUtils.charsCache
            r15.set(r0)
            throw r14
        L1aa:
            java.lang.String r14 = dots(r14, r7, r10)
            return r14
        L1af:
            java.lang.String r14 = r14.substring(r7)
            java.lang.String r14 = r14.toUpperCase()
            return r14
    }

    public static java.lang.String getterName(java.lang.reflect.Method r4, boolean r5, java.lang.String r6) {
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = "is"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L1b
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            if (r1 == r2) goto L18
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r1 != r2) goto L1a
        L18:
            if (r5 == 0) goto L1b
        L1a:
            return r0
        L1b:
            java.lang.String r6 = getterName(r0, r6)
            r0 = 0
            if (r5 == 0) goto L2f
            r5 = 45
            int r5 = r6.indexOf(r5)
            r1 = -1
            if (r5 == r1) goto L2f
            java.lang.String r6 = r6.substring(r0, r5)
        L2f:
            int r5 = r6.length()
            r1 = 2
            if (r5 <= r1) goto L7c
            char r5 = r6.charAt(r0)
            r1 = 65
            if (r5 < r1) goto L7c
            char r5 = r6.charAt(r0)
            r2 = 90
            if (r5 > r2) goto L7c
            r5 = 1
            char r3 = r6.charAt(r5)
            if (r3 < r1) goto L7c
            char r5 = r6.charAt(r5)
            if (r5 > r2) goto L7c
            char[] r5 = r6.toCharArray()
            char r1 = r5[r0]
            int r1 = r1 + 32
            char r1 = (char) r1
            r5[r0] = r1
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            java.lang.Class r4 = r4.getDeclaringClass()
            java.lang.reflect.Field r4 = getDeclaredField(r4, r0)
            if (r4 == 0) goto L7c
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isPublic(r5)
            if (r5 == 0) goto L7c
            java.lang.String r4 = r4.getName()
            return r4
        L7c:
            return r6
    }

    public static void getters(java.lang.Class r1, java.lang.Class r2, java.util.function.Consumer<java.lang.reflect.Method> r3) {
            r0 = 0
            getters(r1, r2, r0, r3)
            return
    }

    public static void getters(java.lang.Class r25, java.lang.Class r26, boolean r27, java.util.function.Consumer<java.lang.reflect.Method> r28) {
            r0 = r25
            r1 = r26
            if (r0 != 0) goto L8
            goto L271
        L8:
            java.lang.Class r2 = r0.getSuperclass()
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Method[]> r3 = com.alibaba.fastjson2.util.BeanUtils.methodCache
            java.lang.Object r4 = r3.get(r0)
            java.lang.reflect.Method[] r4 = (java.lang.reflect.Method[]) r4
            if (r4 != 0) goto L1d
            java.lang.reflect.Method[] r4 = r0.getMethods()
            r3.put(r0, r4)
        L1d:
            r3 = 1
            r5 = 0
            if (r2 == 0) goto L2f
            java.lang.String r6 = r2.getName()
            java.lang.String r7 = "com.google.protobuf.GeneratedMessageV3"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L2f
            r6 = r3
            goto L30
        L2f:
            r6 = r5
        L30:
            int r7 = r4.length
            r8 = r5
        L32:
            if (r8 >= r7) goto L271
            r9 = r4[r8]
            int r10 = r9.getModifiers()
            r10 = r10 & 8
            if (r10 == 0) goto L48
        L3e:
            r17 = r4
            r12 = r5
            r24 = r6
            r6 = r3
            r3 = r28
            goto L267
        L48:
            java.lang.Class r10 = r9.getReturnType()
            java.lang.Class<java.lang.Void> r11 = java.lang.Void.class
            if (r10 == r11) goto L3e
            java.lang.Class<java.lang.ClassLoader> r11 = java.lang.ClassLoader.class
            if (r10 != r11) goto L55
            goto L3e
        L55:
            java.lang.Class r11 = r9.getDeclaringClass()
            java.lang.Class<java.lang.Enum> r12 = java.lang.Enum.class
            if (r11 == r12) goto L3e
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            if (r11 != r12) goto L62
            goto L3e
        L62:
            int r11 = r9.getParameterCount()
            if (r11 == 0) goto L69
            goto L3e
        L69:
            java.lang.String r11 = r9.getName()
            r11.getClass()
            int r12 = r11.hashCode()
            java.lang.String r13 = "getSerializedSize"
            switch(r12) {
                case -1776922004: goto Lb0;
                case -1650707301: goto La7;
                case -1295482945: goto L9c;
                case -176012470: goto L91;
                case 147696667: goto L86;
                case 598581443: goto L7b;
                default: goto L79;
            }
        L79:
            r12 = -1
            goto Lba
        L7b:
            java.lang.String r12 = "getInitializationErrorString"
            boolean r12 = r11.equals(r12)
            if (r12 != 0) goto L84
            goto L79
        L84:
            r12 = 5
            goto Lba
        L86:
            java.lang.String r12 = "hashCode"
            boolean r12 = r11.equals(r12)
            if (r12 != 0) goto L8f
            goto L79
        L8f:
            r12 = 4
            goto Lba
        L91:
            java.lang.String r12 = "isInitialized"
            boolean r12 = r11.equals(r12)
            if (r12 != 0) goto L9a
            goto L79
        L9a:
            r12 = 3
            goto Lba
        L9c:
            java.lang.String r12 = "equals"
            boolean r12 = r11.equals(r12)
            if (r12 != 0) goto La5
            goto L79
        La5:
            r12 = 2
            goto Lba
        La7:
            boolean r12 = r11.equals(r13)
            if (r12 != 0) goto Lae
            goto L79
        Lae:
            r12 = r3
            goto Lba
        Lb0:
            java.lang.String r12 = "toString"
            boolean r12 = r11.equals(r12)
            if (r12 != 0) goto Lb9
            goto L79
        Lb9:
            r12 = r5
        Lba:
            switch(r12) {
                case 0: goto L3e;
                case 1: goto Lbe;
                case 2: goto L3e;
                case 3: goto Lbe;
                case 4: goto L3e;
                case 5: goto Lbe;
                default: goto Lbd;
            }
        Lbd:
            goto Lc2
        Lbe:
            if (r6 == 0) goto Lc2
            goto L3e
        Lc2:
            if (r6 == 0) goto Le2
            java.lang.String r12 = "Type"
            boolean r12 = r11.endsWith(r12)
            if (r12 != 0) goto Ld4
            java.lang.String r12 = "Bytes"
            boolean r12 = r11.endsWith(r12)
            if (r12 == 0) goto Le2
        Ld4:
            java.lang.String r12 = r10.getName()
            java.lang.String r15 = "com.google.protobuf.ByteString"
            boolean r12 = r12.equals(r15)
            if (r12 == 0) goto Le2
            goto L3e
        Le2:
            java.lang.String r12 = "isSet"
            boolean r12 = r11.startsWith(r12, r5)
            java.lang.Class r15 = java.lang.Boolean.TYPE
            if (r12 == 0) goto L182
            if (r10 != r15) goto L182
            r12 = 0
            java.lang.String r12 = getterName(r11, r12)
            java.lang.String r5 = r12.substring(r3)
            java.lang.String r14 = "g"
            java.lang.String r5 = r14.concat(r5)
            java.lang.String r14 = "un"
            java.lang.String r14 = r14.concat(r12)
            int r3 = r4.length
            r17 = r4
            r4 = 0
            r18 = 0
            r19 = 0
            r20 = 0
        L10d:
            if (r4 >= r3) goto L16c
            r21 = r17[r4]
            r22 = r3
            java.lang.String r3 = r21.getName()
            boolean r3 = r3.equals(r12)
            r23 = r3
            java.lang.Class r3 = java.lang.Void.TYPE
            if (r23 == 0) goto L135
            r23 = r4
            int r4 = r21.getParameterCount()
            r24 = r6
            r6 = 1
            if (r4 != r6) goto L13a
            java.lang.Class r4 = r21.getReturnType()
            if (r4 != r3) goto L13a
            r18 = r6
            goto L165
        L135:
            r23 = r4
            r24 = r6
            r6 = 1
        L13a:
            java.lang.String r4 = r21.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L14d
            int r4 = r21.getParameterCount()
            if (r4 != 0) goto L14d
            r20 = r6
            goto L165
        L14d:
            java.lang.String r4 = r21.getName()
            boolean r4 = r4.equals(r14)
            if (r4 == 0) goto L165
            int r4 = r21.getParameterCount()
            if (r4 != 0) goto L165
            java.lang.Class r4 = r21.getReturnType()
            if (r4 != r3) goto L165
            r19 = r6
        L165:
            int r4 = r23 + 1
            r3 = r22
            r6 = r24
            goto L10d
        L16c:
            r24 = r6
            r6 = 1
            if (r18 == 0) goto L187
            if (r19 == 0) goto L187
            if (r20 == 0) goto L187
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONField> r3 = com.alibaba.fastjson2.annotation.JSONField.class
            java.lang.annotation.Annotation r3 = findAnnotation(r9, r3)
            if (r3 != 0) goto L187
        L17d:
            r3 = r28
            r12 = 0
            goto L267
        L182:
            r17 = r4
            r24 = r6
            r6 = r3
        L187:
            int r3 = r11.length()
            r4 = 3
            if (r3 <= r4) goto L199
            java.lang.String r5 = "get"
            r12 = 0
            boolean r5 = r11.startsWith(r5, r12)
            if (r5 == 0) goto L199
            r5 = r6
            goto L19a
        L199:
            r5 = 0
        L19a:
            r12 = 122(0x7a, float:1.71E-43)
            r14 = 97
            if (r5 == 0) goto L1b2
            char r10 = r11.charAt(r4)
            if (r10 < r14) goto L1ad
            if (r10 > r12) goto L1ad
            r4 = 4
            if (r3 != r4) goto L1ae
            r5 = 0
            goto L1ae
        L1ad:
            r4 = 4
        L1ae:
            r10 = r5
            r5 = 2
        L1b0:
            r12 = 3
            goto L1d8
        L1b2:
            r4 = 4
            if (r10 == r15) goto L1bb
            java.lang.Class<java.lang.Boolean> r15 = java.lang.Boolean.class
            if (r10 == r15) goto L1bb
            if (r27 == 0) goto L1ae
        L1bb:
            r5 = 2
            if (r3 <= r5) goto L1c9
            java.lang.String r10 = "is"
            r15 = 0
            boolean r10 = r11.startsWith(r10, r15)
            if (r10 == 0) goto L1c9
            r10 = r6
            goto L1ca
        L1c9:
            r10 = 0
        L1ca:
            if (r10 == 0) goto L1b0
            char r15 = r11.charAt(r5)
            if (r15 < r14) goto L1b0
            if (r15 > r12) goto L1b0
            r12 = 3
            if (r3 != r12) goto L1d8
            r10 = 0
        L1d8:
            if (r10 != 0) goto L1e1
            boolean r3 = isJSONField(r9)
            if (r3 == 0) goto L1e1
            r10 = r6
        L1e1:
            if (r10 != 0) goto L1f2
            if (r1 == 0) goto L1f2
            java.lang.reflect.Method r3 = getMethod(r1, r9)
            if (r3 == 0) goto L1f2
            boolean r3 = isJSONField(r3)
            if (r3 == 0) goto L1f2
            r10 = r6
        L1f2:
            if (r10 != 0) goto L1f5
            goto L17d
        L1f5:
            if (r24 == 0) goto L261
            java.lang.Class r3 = r9.getDeclaringClass()
            if (r3 != r2) goto L1ff
            goto L17d
        L1ff:
            java.lang.Class r3 = r9.getReturnType()
            int r10 = r11.hashCode()
            switch(r10) {
                case -1650707301: goto L238;
                case 132778702: goto L22d;
                case 208401389: goto L222;
                case 313806618: goto L217;
                case 2019988419: goto L20c;
                default: goto L20a;
            }
        L20a:
            r14 = -1
            goto L240
        L20c:
            java.lang.String r5 = "getDefaultInstanceForType"
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L215
            goto L20a
        L215:
            r14 = r4
            goto L240
        L217:
            java.lang.String r4 = "getMessageBytes"
            boolean r4 = r11.equals(r4)
            if (r4 != 0) goto L220
            goto L20a
        L220:
            r14 = r12
            goto L240
        L222:
            java.lang.String r4 = "getUnknownFields"
            boolean r4 = r11.equals(r4)
            if (r4 != 0) goto L22b
            goto L20a
        L22b:
            r14 = r5
            goto L240
        L22d:
            java.lang.String r4 = "getParserForType"
            boolean r4 = r11.equals(r4)
            if (r4 != 0) goto L236
            goto L20a
        L236:
            r14 = r6
            goto L240
        L238:
            boolean r4 = r11.equals(r13)
            if (r4 != 0) goto L23f
            goto L20a
        L23f:
            r14 = 0
        L240:
            switch(r14) {
                case 0: goto L247;
                case 1: goto L247;
                case 2: goto L247;
                case 3: goto L247;
                case 4: goto L247;
                default: goto L243;
            }
        L243:
            r12 = 0
            r16 = 0
            goto L25c
        L247:
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "com.google.protobuf."
            r12 = 0
            boolean r4 = r4.startsWith(r5, r12)
            if (r4 != 0) goto L259
            if (r3 != r0) goto L257
            goto L259
        L257:
            r3 = r12
            goto L25a
        L259:
            r3 = r6
        L25a:
            r16 = r3
        L25c:
            r3 = r28
            if (r16 == 0) goto L264
            goto L267
        L261:
            r12 = 0
            r3 = r28
        L264:
            r3.accept(r9)
        L267:
            int r8 = r8 + 1
            r3 = r6
            r5 = r12
            r4 = r17
            r6 = r24
            goto L32
        L271:
            return
    }

    public static void getters(java.lang.Class r1, java.util.function.Consumer<java.lang.reflect.Method> r2) {
            r0 = 0
            getters(r1, r0, r2)
            return
    }

    public static int hashCodeOrZero(java.lang.Object r0) {
            if (r0 == 0) goto L7
            int r0 = r0.hashCode()
            return r0
        L7:
            r0 = 0
            return r0
    }

    private static int indexOf(java.lang.Object[] r3, java.lang.Object r4) {
            int r0 = r3.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r3[r1]
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Ld
            return r1
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            bsh.j.e()
            r3 = 0
            return r3
    }

    private static boolean isJSONField(java.lang.reflect.AnnotatedElement r5) {
            java.lang.annotation.Annotation[] r5 = r5.getAnnotations()
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L7:
            if (r2 >= r0) goto L28
            r3 = r5[r2]
            java.lang.Class r3 = r3.annotationType()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "com.alibaba.fastjson.annotation.JSONField"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L26
            java.lang.String r4 = "com.alibaba.fastjson2.annotation.JSONField"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L26
            int r2 = r2 + 1
            goto L7
        L26:
            r5 = 1
            return r5
        L28:
            return r1
    }

    public static boolean isNoneStaticMemberClass(java.lang.Class r3, java.lang.Class r4) {
            java.lang.Class r0 = r4.getEnclosingClass()
            r1 = 0
            if (r0 == 0) goto L36
            if (r3 == 0) goto L10
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L10
            goto L36
        L10:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Constructor[]> r3 = com.alibaba.fastjson2.util.BeanUtils.constructorCache
            java.lang.Object r2 = r3.get(r4)
            java.lang.reflect.Constructor[] r2 = (java.lang.reflect.Constructor[]) r2
            if (r2 != 0) goto L21
            java.lang.reflect.Constructor[] r2 = r4.getDeclaredConstructors()
            r3.put(r4, r2)
        L21:
            int r3 = r2.length
            if (r3 != 0) goto L25
            return r1
        L25:
            r3 = r2[r1]
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r4 = r3.length
            if (r4 != 0) goto L2f
            return r1
        L2f:
            r3 = r3[r1]
            boolean r3 = r0.equals(r3)
            return r3
        L36:
            return r1
    }

    public static boolean isWriteEnumAsJavaBean(java.lang.Class r8) {
            java.lang.annotation.Annotation[] r8 = r8.getDeclaredAnnotations()
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L7:
            if (r2 >= r0) goto L41
            r3 = r8[r2]
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONType> r4 = com.alibaba.fastjson2.annotation.JSONType.class
            java.lang.annotation.Annotation r4 = findAnnotation(r3, r4)
            com.alibaba.fastjson2.annotation.JSONType r4 = (com.alibaba.fastjson2.annotation.JSONType) r4
            if (r4 == 0) goto L1a
            boolean r8 = r4.writeEnumAsJavaBean()
            return r8
        L1a:
            java.lang.Class r4 = r3.annotationType()
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "com.alibaba.fastjson.annotation.JSONType"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L3e
            com.alibaba.fastjson2.codec.BeanInfo r5 = new com.alibaba.fastjson2.codec.BeanInfo
            r5.<init>()
            com.alibaba.fastjson2.reader.g r6 = new com.alibaba.fastjson2.reader.g
            r7 = 3
            r6.<init>(r5, r3, r7)
            annotationMethods(r4, r6)
            boolean r3 = r5.writeEnumAsJavaBean
            if (r3 == 0) goto L3e
            r8 = 1
            return r8
        L3e:
            int r2 = r2 + 1
            goto L7
        L41:
            return r1
    }

    private static /* synthetic */ void lambda$getEnumValueField$2(java.lang.String r1, java.util.concurrent.atomic.AtomicReference r2, java.lang.reflect.Method r3, java.lang.reflect.Method r4) {
            java.lang.String r0 = r4.getName()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L13
            boolean r1 = isJSONField(r4)
            if (r1 == 0) goto L13
            r2.set(r3)
        L13:
            return
    }

    private static /* synthetic */ void lambda$getEnumValueField$3(java.lang.String r1, java.util.concurrent.atomic.AtomicReference r2, java.lang.reflect.Method r3, java.lang.reflect.Method r4) {
            java.lang.String r0 = r4.getName()
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L13
            boolean r1 = isJSONField(r4)
            if (r1 == 0) goto L13
            r2.set(r3)
        L13:
            return
    }

    private static /* synthetic */ void lambda$getField$4(int r3, int r4, java.lang.Class r5, char r6, java.lang.String r7, java.lang.reflect.Field[] r8, java.lang.reflect.Field r9) {
            java.lang.String r0 = r9.getName()
            int r1 = r0.length()
            int r3 = r3 - r4
            r2 = 0
            if (r1 != r3) goto L43
            java.lang.Class r3 = r9.getType()
            if (r3 == r5) goto L1c
            java.lang.Class r3 = r9.getType()
            boolean r3 = r5.isAssignableFrom(r3)
            if (r3 == 0) goto L43
        L1c:
            r3 = 65
            r5 = 1
            if (r6 < r3) goto L3a
            r3 = 90
            if (r6 > r3) goto L3a
            int r6 = r6 + 32
            char r3 = r0.charAt(r2)
            if (r6 != r3) goto L3a
            int r3 = r4 + 1
            int r6 = r1 + (-1)
            boolean r3 = r0.regionMatches(r5, r7, r3, r6)
            if (r3 == 0) goto L3a
            r8[r2] = r9
            return
        L3a:
            boolean r3 = r0.regionMatches(r2, r7, r4, r1)
            if (r3 == 0) goto L53
            r8[r5] = r9
            return
        L43:
            java.lang.Class r3 = java.lang.Boolean.TYPE
            java.lang.Class r4 = r9.getType()
            if (r3 != r4) goto L53
            boolean r3 = r7.equals(r0)
            if (r3 == 0) goto L53
            r8[r2] = r9
        L53:
            return
    }

    private static /* synthetic */ void lambda$getSetter$0(java.lang.String r1, java.lang.reflect.Method[] r2, java.lang.reflect.Method r3) {
            java.lang.String r0 = r3.getName()
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto Lb
            return
        Lb:
            r1 = 0
            r2[r1] = r3
            return
    }

    private static /* synthetic */ void lambda$isWriteEnumAsJavaBean$1(com.alibaba.fastjson2.codec.BeanInfo r0, java.lang.annotation.Annotation r1, java.lang.reflect.Method r2) {
            processJSONType1x(r0, r1, r2)
            return
    }

    public static java.lang.String[] lookupParameterNames(java.lang.reflect.Constructor r9) {
            java.lang.Class r0 = r9.getDeclaringClass()
            java.lang.Class[] r9 = r9.getParameterTypes()
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            boolean r2 = r1.isAssignableFrom(r0)
            r3 = 0
            if (r2 == 0) goto L44
            int r2 = r9.length
            java.lang.String r4 = "cause"
            java.lang.String r5 = "message"
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 1
            if (r2 == r7) goto L30
            r8 = 2
            if (r2 == r8) goto L1f
            goto L44
        L1f:
            r2 = r9[r3]
            if (r2 != r6) goto L44
            r2 = r9[r7]
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L44
            java.lang.String[] r9 = new java.lang.String[]{r5, r4}
            return r9
        L30:
            r2 = r9[r3]
            if (r2 != r6) goto L39
            java.lang.String[] r9 = new java.lang.String[]{r5}
            return r9
        L39:
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L44
            java.lang.String[] r9 = new java.lang.String[]{r4}
            return r9
        L44:
            int r1 = r9.length
            java.lang.String[] r2 = new java.lang.String[r1]
            if (r1 <= 0) goto L5f
            r9 = r9[r3]
            java.lang.Class r1 = r0.getDeclaringClass()
            if (r9 != r1) goto L5f
            int r9 = r0.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 != 0) goto L5f
            java.lang.String r9 = "this.$0"
            r2[r3] = r9
        L5f:
            return r2
    }

    public static java.lang.reflect.ParameterizedType newParameterizedTypeWithOwner(java.lang.reflect.Type r1, java.lang.reflect.Type r2, java.lang.reflect.Type... r3) {
            com.alibaba.fastjson2.util.BeanUtils$ParameterizedTypeImpl r0 = new com.alibaba.fastjson2.util.BeanUtils$ParameterizedTypeImpl
            r0.<init>(r1, r2, r3)
            return r0
    }

    private static java.lang.String pascal(java.lang.String r4, int r5, int r6) {
            int r0 = r5 - r6
            char[] r1 = new char[r0]
            r2 = 0
            r4.getChars(r6, r5, r1, r2)
            char r4 = r1[r2]
            r5 = 1
            r6 = 122(0x7a, float:1.71E-43)
            r3 = 97
            if (r4 < r3) goto L1b
            if (r4 > r6) goto L1b
            if (r0 <= r5) goto L1b
            int r4 = r4 + (-32)
            char r4 = (char) r4
            r1[r2] = r4
            goto L33
        L1b:
            r2 = 95
            if (r4 != r2) goto L33
            r4 = 2
            if (r0 <= r4) goto L33
            char r0 = r1[r5]
            if (r0 < r3) goto L33
            if (r0 > r6) goto L33
            char r4 = r1[r4]
            if (r4 < r3) goto L33
            if (r4 > r6) goto L33
            int r0 = r0 + (-32)
            char r4 = (char) r0
            r1[r5] = r4
        L33:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
            return r4
    }

    public static void processJSONType1x(com.alibaba.fastjson2.codec.BeanInfo r6, java.lang.annotation.Annotation r7, java.lang.reflect.Method r8) {
            r0 = 0
            java.lang.Object r7 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L20a
            java.lang.String r8 = r8.getName()     // Catch: java.lang.Throwable -> L20a
            int r0 = r8.hashCode()     // Catch: java.lang.Throwable -> L20a
            r1 = 0
            r2 = 1
            switch(r0) {
                case -1678076717: goto L1f6;
                case -1315832283: goto L1e3;
                case -1210506547: goto L1d0;
                case -1052827512: goto L1bf;
                case -1008770331: goto L1af;
                case -940893828: goto Lc6;
                case -853109563: goto Lb3;
                case -676507419: goto La0;
                case -597985902: goto L89;
                case -167039347: goto L76;
                case 90259659: goto L66;
                case 1752415457: goto L2e;
                case 1869860669: goto L24;
                case 1970571962: goto L14;
                default: goto L12;
            }     // Catch: java.lang.Throwable -> L20a
        L12:
            goto L20a
        L14:
            java.lang.String r0 = "seeAlso"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            java.lang.Class[] r7 = (java.lang.Class[]) r7     // Catch: java.lang.Throwable -> L20a
            int r8 = r7.length     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            r6.seeAlso = r7     // Catch: java.lang.Throwable -> L20a
            return
        L24:
            java.lang.String r0 = "serializeFeatures"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            goto Lce
        L2e:
            java.lang.String r0 = "ignores"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch: java.lang.Throwable -> L20a
            int r8 = r7.length     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            java.lang.String[] r8 = r6.ignores     // Catch: java.lang.Throwable -> L20a
            if (r8 != 0) goto L42
            r6.ignores = r7     // Catch: java.lang.Throwable -> L20a
            return
        L42:
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L20a
            r8.<init>()     // Catch: java.lang.Throwable -> L20a
            java.lang.String[] r0 = r6.ignores     // Catch: java.lang.Throwable -> L20a
            int r2 = r0.length     // Catch: java.lang.Throwable -> L20a
        L4a:
            if (r1 >= r2) goto L54
            r3 = r0[r1]     // Catch: java.lang.Throwable -> L20a
            r8.add(r3)     // Catch: java.lang.Throwable -> L20a
            int r1 = r1 + 1
            goto L4a
        L54:
            java.util.Collections.addAll(r8, r7)     // Catch: java.lang.Throwable -> L20a
            int r7 = r8.size()     // Catch: java.lang.Throwable -> L20a
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L20a
            java.lang.Object[] r7 = r8.toArray(r7)     // Catch: java.lang.Throwable -> L20a
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch: java.lang.Throwable -> L20a
            r6.ignores = r7     // Catch: java.lang.Throwable -> L20a
            return
        L66:
            java.lang.String r0 = "includes"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch: java.lang.Throwable -> L20a
            int r8 = r7.length     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            r6.includes = r7     // Catch: java.lang.Throwable -> L20a
            return
        L76:
            java.lang.String r0 = "rootName"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L20a
            boolean r8 = r7.isEmpty()     // Catch: java.lang.Throwable -> L20a
            if (r8 != 0) goto L20a
            r6.rootName = r7     // Catch: java.lang.Throwable -> L20a
            return
        L89:
            java.lang.String r0 = "serializer"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            java.lang.Class r7 = (java.lang.Class) r7     // Catch: java.lang.Throwable -> L20a
            java.lang.Class<com.alibaba.fastjson2.writer.ObjectWriter> r8 = com.alibaba.fastjson2.writer.ObjectWriter.class
            boolean r8 = r8.isAssignableFrom(r7)     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            r6.writeEnumAsJavaBean = r2     // Catch: java.lang.Throwable -> L20a
            r6.serializer = r7     // Catch: java.lang.Throwable -> L20a
            return
        La0:
            java.lang.String r0 = "typeName"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L20a
            boolean r8 = r7.isEmpty()     // Catch: java.lang.Throwable -> L20a
            if (r8 != 0) goto L20a
            r6.typeName = r7     // Catch: java.lang.Throwable -> L20a
            return
        Lb3:
            java.lang.String r0 = "typeKey"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L20a
            boolean r8 = r7.isEmpty()     // Catch: java.lang.Throwable -> L20a
            if (r8 != 0) goto L20a
            r6.typeKey = r7     // Catch: java.lang.Throwable -> L20a
            return
        Lc6:
            java.lang.String r0 = "serialzeFeatures"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
        Lce:
            java.lang.Enum[] r7 = (java.lang.Enum[]) r7     // Catch: java.lang.Throwable -> L20a
            int r8 = r7.length     // Catch: java.lang.Throwable -> L20a
        Ld1:
            if (r1 >= r8) goto L20a
            r0 = r7[r1]     // Catch: java.lang.Throwable -> L20a
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L20a
            int r2 = r0.hashCode()     // Catch: java.lang.Throwable -> L20a
            switch(r2) {
                case -1937516631: goto L19a;
                case -1779797023: goto L188;
                case -335314544: goto L176;
                case -211922948: goto L164;
                case -102443356: goto L152;
                case -62964779: goto L140;
                case 1009181687: goto L12e;
                case 1519175029: goto L11b;
                case 1808123471: goto L108;
                case 1879776036: goto Lf5;
                case 2049970061: goto Le2;
                default: goto Le0;
            }     // Catch: java.lang.Throwable -> L20a
        Le0:
            goto L1ab
        Le2:
            java.lang.String r2 = "WriteMapNullValue"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L20a
            if (r0 == 0) goto L1ab
            long r2 = r6.writerFeatures     // Catch: java.lang.Throwable -> L20a
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNulls     // Catch: java.lang.Throwable -> L20a
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L20a
            long r2 = r2 | r4
            r6.writerFeatures = r2     // Catch: java.lang.Throwable -> L20a
            goto L1ab
        Lf5:
            java.lang.String r2 = "WriteClassName"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L20a
            if (r0 == 0) goto L1ab
            long r2 = r6.writerFeatures     // Catch: java.lang.Throwable -> L20a
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName     // Catch: java.lang.Throwable -> L20a
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L20a
            long r2 = r2 | r4
            r6.writerFeatures = r2     // Catch: java.lang.Throwable -> L20a
            goto L1ab
        L108:
            java.lang.String r2 = "WriteNullBooleanAsFalse"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L20a
            if (r0 == 0) goto L1ab
            long r2 = r6.writerFeatures     // Catch: java.lang.Throwable -> L20a
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullBooleanAsFalse     // Catch: java.lang.Throwable -> L20a
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L20a
            long r2 = r2 | r4
            r6.writerFeatures = r2     // Catch: java.lang.Throwable -> L20a
            goto L1ab
        L11b:
            java.lang.String r2 = "WriteNonStringValueAsString"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L20a
            if (r0 == 0) goto L1ab
            long r2 = r6.writerFeatures     // Catch: java.lang.Throwable -> L20a
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNonStringValueAsString     // Catch: java.lang.Throwable -> L20a
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L20a
            long r2 = r2 | r4
            r6.writerFeatures = r2     // Catch: java.lang.Throwable -> L20a
            goto L1ab
        L12e:
            java.lang.String r2 = "WriteNullListAsEmpty"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L20a
            if (r0 == 0) goto L1ab
            long r2 = r6.writerFeatures     // Catch: java.lang.Throwable -> L20a
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullListAsEmpty     // Catch: java.lang.Throwable -> L20a
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L20a
            long r2 = r2 | r4
            r6.writerFeatures = r2     // Catch: java.lang.Throwable -> L20a
            goto L1ab
        L140:
            java.lang.String r2 = "NotWriteRootClassName"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L20a
            if (r0 == 0) goto L1ab
            long r2 = r6.writerFeatures     // Catch: java.lang.Throwable -> L20a
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.NotWriteRootClassName     // Catch: java.lang.Throwable -> L20a
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L20a
            long r2 = r2 | r4
            r6.writerFeatures = r2     // Catch: java.lang.Throwable -> L20a
            goto L1ab
        L152:
            java.lang.String r2 = "WriteNullStringAsEmpty"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L20a
            if (r0 == 0) goto L1ab
            long r2 = r6.writerFeatures     // Catch: java.lang.Throwable -> L20a
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullStringAsEmpty     // Catch: java.lang.Throwable -> L20a
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L20a
            long r2 = r2 | r4
            r6.writerFeatures = r2     // Catch: java.lang.Throwable -> L20a
            goto L1ab
        L164:
            java.lang.String r2 = "BrowserCompatible"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L20a
            if (r0 == 0) goto L1ab
            long r2 = r6.writerFeatures     // Catch: java.lang.Throwable -> L20a
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.BrowserCompatible     // Catch: java.lang.Throwable -> L20a
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L20a
            long r2 = r2 | r4
            r6.writerFeatures = r2     // Catch: java.lang.Throwable -> L20a
            goto L1ab
        L176:
            java.lang.String r2 = "WriteEnumUsingToString"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L20a
            if (r0 == 0) goto L1ab
            long r2 = r6.writerFeatures     // Catch: java.lang.Throwable -> L20a
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumUsingToString     // Catch: java.lang.Throwable -> L20a
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L20a
            long r2 = r2 | r4
            r6.writerFeatures = r2     // Catch: java.lang.Throwable -> L20a
            goto L1ab
        L188:
            java.lang.String r2 = "IgnoreErrorGetter"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L20a
            if (r0 == 0) goto L1ab
            long r2 = r6.writerFeatures     // Catch: java.lang.Throwable -> L20a
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.IgnoreErrorGetter     // Catch: java.lang.Throwable -> L20a
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L20a
            long r2 = r2 | r4
            r6.writerFeatures = r2     // Catch: java.lang.Throwable -> L20a
            goto L1ab
        L19a:
            java.lang.String r2 = "WriteNullNumberAsZero"
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L20a
            if (r0 == 0) goto L1ab
            long r2 = r6.writerFeatures     // Catch: java.lang.Throwable -> L20a
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteNullNumberAsZero     // Catch: java.lang.Throwable -> L20a
            long r4 = r0.mask     // Catch: java.lang.Throwable -> L20a
            long r2 = r2 | r4
            r6.writerFeatures = r2     // Catch: java.lang.Throwable -> L20a
        L1ab:
            int r1 = r1 + 1
            goto Ld1
        L1af:
            java.lang.String r0 = "orders"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch: java.lang.Throwable -> L20a
            int r8 = r7.length     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            r6.orders = r7     // Catch: java.lang.Throwable -> L20a
            return
        L1bf:
            java.lang.String r0 = "naming"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            java.lang.Enum r7 = (java.lang.Enum) r7     // Catch: java.lang.Throwable -> L20a
            java.lang.String r7 = r7.name()     // Catch: java.lang.Throwable -> L20a
            r6.namingStrategy = r7     // Catch: java.lang.Throwable -> L20a
            return
        L1d0:
            java.lang.String r0 = "alphabetic"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L20a
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L20a
            if (r7 != 0) goto L20a
            r6.alphabetic = r1     // Catch: java.lang.Throwable -> L20a
            return
        L1e3:
            java.lang.String r0 = "serializeEnumAsJavaBean"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L20a
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L20a
            if (r7 == 0) goto L20a
            r6.writeEnumAsJavaBean = r2     // Catch: java.lang.Throwable -> L20a
            return
        L1f6:
            java.lang.String r0 = "deserializer"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            java.lang.Class r7 = (java.lang.Class) r7     // Catch: java.lang.Throwable -> L20a
            java.lang.Class<com.alibaba.fastjson2.reader.ObjectReader> r8 = com.alibaba.fastjson2.reader.ObjectReader.class
            boolean r8 = r8.isAssignableFrom(r7)     // Catch: java.lang.Throwable -> L20a
            if (r8 == 0) goto L20a
            r6.deserializer = r7     // Catch: java.lang.Throwable -> L20a
        L20a:
            return
    }

    public static java.lang.reflect.Type resolve(java.lang.reflect.Type r1, java.lang.Class<?> r2, java.lang.reflect.Type r3) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.reflect.Type r1 = resolve(r1, r2, r3, r0)
            return r1
    }

    private static java.lang.reflect.Type resolve(java.lang.reflect.Type r9, java.lang.Class<?> r10, java.lang.reflect.Type r11, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r12) {
            r0 = 0
        L1:
            boolean r1 = r11 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L24
            r1 = r11
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.Object r2 = r12.get(r1)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.Class r3 = java.lang.Void.TYPE
            if (r2 == 0) goto L16
            if (r2 != r3) goto L15
            return r11
        L15:
            return r2
        L16:
            r12.put(r1, r3)
            if (r0 != 0) goto L1c
            r0 = r1
        L1c:
            java.lang.reflect.Type r11 = resolveTypeVariable(r9, r10, r1)
            if (r11 != r1) goto L1
            goto Ldd
        L24:
            boolean r1 = r11 instanceof java.lang.Class
            if (r1 == 0) goto L49
            r1 = r11
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r2 = r1.isArray()
            if (r2 == 0) goto L49
            java.lang.Class r11 = r1.getComponentType()
            java.lang.reflect.Type r9 = resolve(r9, r10, r11, r12)
            boolean r10 = equal(r11, r9)
            if (r10 == 0) goto L42
            r11 = r1
            goto Ldd
        L42:
            java.lang.reflect.GenericArrayType r9 = arrayOf(r9)
        L46:
            r11 = r9
            goto Ldd
        L49:
            boolean r1 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L64
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            java.lang.reflect.Type r1 = r11.getGenericComponentType()
            java.lang.reflect.Type r9 = resolve(r9, r10, r1, r12)
            boolean r10 = equal(r1, r9)
            if (r10 == 0) goto L5f
            goto Ldd
        L5f:
            java.lang.reflect.GenericArrayType r9 = arrayOf(r9)
            goto L46
        L64:
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Lab
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r1 = r11.getOwnerType()
            java.lang.reflect.Type r4 = resolve(r9, r10, r1, r12)
            boolean r1 = equal(r4, r1)
            r1 = r1 ^ r3
            java.lang.reflect.Type[] r5 = r11.getActualTypeArguments()
            int r6 = r5.length
        L7e:
            if (r2 >= r6) goto La0
            r7 = r5[r2]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            if (r7 != r8) goto L87
            goto L9d
        L87:
            java.lang.reflect.Type r8 = resolve(r9, r10, r7, r12)
            boolean r7 = equal(r8, r7)
            if (r7 != 0) goto L9d
            if (r1 != 0) goto L9b
            java.lang.Object r1 = r5.clone()
            r5 = r1
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r1 = r3
        L9b:
            r5[r2] = r8
        L9d:
            int r2 = r2 + 1
            goto L7e
        La0:
            if (r1 == 0) goto Ldd
            java.lang.reflect.Type r9 = r11.getRawType()
            java.lang.reflect.ParameterizedType r9 = newParameterizedTypeWithOwner(r4, r9, r5)
            goto L46
        Lab:
            boolean r1 = r11 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto Ldd
            r1 = r11
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            java.lang.reflect.Type[] r4 = r1.getLowerBounds()
            java.lang.reflect.Type[] r1 = r1.getUpperBounds()
            int r5 = r4.length
            if (r5 != r3) goto Lcc
            r1 = r4[r2]
            java.lang.reflect.Type r9 = resolve(r9, r10, r1, r12)
            r10 = r4[r2]
            if (r9 == r10) goto Ldd
            java.lang.reflect.WildcardType r11 = supertypeOf(r9)
            goto Ldd
        Lcc:
            int r4 = r1.length
            if (r4 != r3) goto Ldd
            r3 = r1[r2]
            java.lang.reflect.Type r9 = resolve(r9, r10, r3, r12)
            r10 = r1[r2]
            if (r9 == r10) goto Ldd
            java.lang.reflect.WildcardType r11 = subtypeOf(r9)
        Ldd:
            if (r0 == 0) goto Le2
            r12.put(r0, r11)
        Le2:
            return r11
    }

    public static java.lang.reflect.Type resolveTypeVariable(java.lang.reflect.Type r1, java.lang.Class<?> r2, java.lang.reflect.TypeVariable<?> r3) {
            java.lang.Class r0 = declaringClassOf(r3)
            if (r0 != 0) goto L7
            goto L20
        L7:
            java.lang.reflect.Type r1 = getGenericSupertype(r1, r2, r0)
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L20
            java.lang.reflect.TypeVariable[] r2 = r0.getTypeParameters()
            int r2 = indexOf(r2, r3)
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            r1 = r1[r2]
            return r1
        L20:
            return r3
    }

    public static void setNoneStaticMemberClassParent(java.lang.Object r8, java.lang.Object r9) {
            if (r8 != 0) goto L4
            goto L82
        L4:
            java.lang.Class r0 = r8.getClass()
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> r1 = com.alibaba.fastjson2.util.BeanUtils.declaredFieldCache
            java.lang.Object r1 = r1.get(r0)
            java.lang.reflect.Field[] r1 = (java.lang.reflect.Field[]) r1
            r2 = 0
            if (r1 != 0) goto L59
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()
            int r3 = r1.length
            r4 = r2
        L19:
            if (r4 >= r3) goto L54
            r5 = r1[r4]
            int r5 = r5.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 == 0) goto L51
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r1.length
            r3.<init>(r4)
            int r4 = r1.length
            r5 = r2
        L2f:
            if (r5 >= r4) goto L44
            r6 = r1[r5]
            int r7 = r6.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 == 0) goto L3e
            goto L41
        L3e:
            r3.add(r6)
        L41:
            int r5 = r5 + 1
            goto L2f
        L44:
            int r1 = r3.size()
            java.lang.reflect.Field[] r1 = new java.lang.reflect.Field[r1]
            java.lang.Object[] r1 = r3.toArray(r1)
            java.lang.reflect.Field[] r1 = (java.lang.reflect.Field[]) r1
            goto L54
        L51:
            int r4 = r4 + 1
            goto L19
        L54:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Field[]> r3 = com.alibaba.fastjson2.util.BeanUtils.fieldCache
            r3.put(r0, r1)
        L59:
            int r3 = r1.length
            r4 = 0
        L5b:
            if (r2 >= r3) goto L6f
            r5 = r1[r2]
            java.lang.String r6 = "this$0"
            java.lang.String r7 = r5.getName()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L6c
            r4 = r5
        L6c:
            int r2 = r2 + 1
            goto L5b
        L6f:
            if (r4 == 0) goto L82
            r1 = 1
            r4.setAccessible(r1)
            r4.set(r8, r9)     // Catch: java.lang.IllegalAccessException -> L79
            return
        L79:
            java.lang.String r8 = "setNoneStaticMemberClassParent error, class "
            java.lang.String r8 = p.a.k(r0, r8)
            ah.a.w(r8)
        L82:
            return
    }

    public static java.lang.String setterName(java.lang.String r5, int r6) {
            int r0 = r5.length()
            int r1 = r0 - r6
            char[] r2 = new char[r1]
            r3 = 0
            r5.getChars(r6, r0, r2, r3)
            char r5 = r2[r3]
            r6 = 90
            r0 = 65
            r4 = 1
            if (r1 <= r4) goto L1c
            char r1 = r2[r4]
            if (r1 < r0) goto L1c
            if (r1 > r6) goto L1c
            goto L1d
        L1c:
            r4 = r3
        L1d:
            if (r5 < r0) goto L28
            if (r5 > r6) goto L28
            if (r4 != 0) goto L28
            int r5 = r5 + 32
            char r5 = (char) r5
            r2[r3] = r5
        L28:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
            return r5
    }

    public static java.lang.String setterName(java.lang.String r8, java.lang.String r9) {
            java.lang.String r0 = "CamelCase"
            if (r9 != 0) goto L5
            r9 = r0
        L5:
            int r1 = r8.length()
            r2 = 3
            if (r1 > r2) goto Ld
            return r8
        Ld:
            java.lang.String r3 = "set"
            r4 = 0
            boolean r3 = r8.startsWith(r3, r4)
            if (r3 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r4
        L19:
            int r5 = r9.hashCode()
            r6 = 1
            r7 = -1
            switch(r5) {
                case -2068429102: goto L57;
                case -1112704575: goto L4c;
                case 1336502620: goto L41;
                case 1655544038: goto L3a;
                case 1976554305: goto L2f;
                case 2087942256: goto L24;
                default: goto L22;
            }
        L22:
            r2 = r7
            goto L61
        L24:
            java.lang.String r0 = "SnakeCase"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L2d
            goto L22
        L2d:
            r2 = 5
            goto L61
        L2f:
            java.lang.String r0 = "UpperCaseWithUnderScores"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L38
            goto L22
        L38:
            r2 = 4
            goto L61
        L3a:
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L61
            goto L22
        L41:
            java.lang.String r0 = "PascalCase"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L4a
            goto L22
        L4a:
            r2 = 2
            goto L61
        L4c:
            java.lang.String r0 = "NeverUseThisValueExceptDefaultValue"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L55
            goto L22
        L55:
            r2 = r6
            goto L61
        L57:
            java.lang.String r0 = "UpperCase"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L60
            goto L22
        L60:
            r2 = r4
        L61:
            switch(r2) {
                case 0: goto La6;
                case 1: goto L7e;
                case 2: goto L79;
                case 3: goto L7e;
                case 4: goto L74;
                case 5: goto L6f;
                default: goto L64;
            }
        L64:
            java.lang.String r8 = "TODO : "
            java.lang.String r8 = r8.concat(r9)
            ah.a.w(r8)
            r8 = 0
            return r8
        L6f:
            java.lang.String r8 = snakeCase(r8, r3)
            return r8
        L74:
            java.lang.String r8 = underScores(r8, r3, r6)
            return r8
        L79:
            java.lang.String r8 = pascal(r8, r1, r3)
            return r8
        L7e:
            int r9 = r1 - r3
            char[] r0 = new char[r9]
            r8.getChars(r3, r1, r0, r4)
            char r8 = r0[r4]
            r1 = 90
            r2 = 65
            if (r9 <= r6) goto L94
            char r9 = r0[r6]
            if (r9 < r2) goto L94
            if (r9 > r1) goto L94
            goto L95
        L94:
            r6 = r4
        L95:
            if (r8 < r2) goto La0
            if (r8 > r1) goto La0
            if (r6 != 0) goto La0
            int r8 = r8 + 32
            char r8 = (char) r8
            r0[r4] = r8
        La0:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0)
            return r8
        La6:
            int r9 = r1 - r3
            char[] r0 = new char[r9]
            r8.getChars(r3, r1, r0, r4)
            char r8 = r0[r4]
        Laf:
            if (r4 >= r9) goto Lc3
            char r1 = r0[r4]
            r2 = 97
            if (r1 < r2) goto Lc0
            r2 = 122(0x7a, float:1.71E-43)
            if (r8 > r2) goto Lc0
            int r1 = r1 + (-32)
            char r1 = (char) r1
            r0[r4] = r1
        Lc0:
            int r4 = r4 + 1
            goto Laf
        Lc3:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0)
            return r8
    }

    public static void setters(java.lang.Class r12, com.alibaba.fastjson2.codec.BeanInfo r13, java.lang.Class r14, java.util.function.Consumer<java.lang.reflect.Method> r15) {
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Method[]> r0 = com.alibaba.fastjson2.util.BeanUtils.methodCache
            java.lang.Object r1 = r0.get(r12)
            java.lang.reflect.Method[] r1 = (java.lang.reflect.Method[]) r1
            if (r1 != 0) goto L11
            java.lang.reflect.Method[] r1 = r12.getMethods()
            r0.put(r12, r1)
        L11:
            int r12 = r1.length
            r0 = 0
            r2 = r0
        L14:
            if (r2 >= r12) goto L157
            r3 = r1[r2]
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 == 0) goto L24
            goto L153
        L24:
            java.lang.Class r4 = r3.getDeclaringClass()
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            if (r4 != r5) goto L2e
            goto L153
        L2e:
            java.lang.String r4 = r3.getName()
            r4.getClass()
            int r5 = r4.hashCode()
            r6 = 2
            r7 = 3
            r8 = 1
            r9 = -1
            switch(r5) {
                case -1776922004: goto L62;
                case -1295482945: goto L57;
                case 3059573: goto L4c;
                case 147696667: goto L41;
                default: goto L40;
            }
        L40:
            goto L6c
        L41:
            java.lang.String r5 = "hashCode"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L4a
            goto L6c
        L4a:
            r9 = r7
            goto L6c
        L4c:
            java.lang.String r5 = "copy"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L55
            goto L6c
        L55:
            r9 = r6
            goto L6c
        L57:
            java.lang.String r5 = "equals"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L60
            goto L6c
        L60:
            r9 = r8
            goto L6c
        L62:
            java.lang.String r5 = "toString"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L6b
            goto L6c
        L6b:
            r9 = r0
        L6c:
            switch(r9) {
                case 0: goto L153;
                case 1: goto L153;
                case 2: goto L70;
                case 3: goto L153;
                default: goto L6f;
            }
        L6f:
            goto L78
        L70:
            if (r13 == 0) goto L78
            boolean r5 = r13.kotlin
            if (r5 == 0) goto L78
            goto L153
        L78:
            java.lang.Class[] r5 = r3.getParameterTypes()
            int r9 = r5.length
            if (r9 != 0) goto Lc0
            int r10 = r4.length()
            if (r10 <= r7) goto L153
            java.lang.String r10 = "get"
            boolean r10 = r4.startsWith(r10, r0)
            if (r10 != 0) goto L8f
            goto L153
        L8f:
            java.lang.Class r10 = r3.getReturnType()
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r11 = java.util.concurrent.atomic.AtomicInteger.class
            if (r10 == r11) goto Lbb
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r11 = java.util.concurrent.atomic.AtomicLong.class
            if (r10 == r11) goto Lbb
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r11 = java.util.concurrent.atomic.AtomicBoolean.class
            if (r10 == r11) goto Lbb
            java.lang.Class<java.util.concurrent.atomic.AtomicIntegerArray> r11 = java.util.concurrent.atomic.AtomicIntegerArray.class
            if (r10 == r11) goto Lbb
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r11 = java.util.concurrent.atomic.AtomicLongArray.class
            if (r10 == r11) goto Lbb
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r11 = java.util.concurrent.atomic.AtomicReference.class
            if (r10 == r11) goto Lbb
            java.lang.Class<java.util.Collection> r11 = java.util.Collection.class
            boolean r11 = r11.isAssignableFrom(r10)
            if (r11 != 0) goto Lbb
            java.lang.Class<java.util.Map> r11 = java.util.Map.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto Lc0
        Lbb:
            r15.accept(r3)
            goto L153
        Lc0:
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONField> r10 = com.alibaba.fastjson2.annotation.JSONField.class
            if (r9 != r6) goto Lf2
            java.lang.Class r6 = r3.getReturnType()
            java.lang.Class r11 = java.lang.Void.TYPE
            if (r6 != r11) goto Lf2
            r5 = r5[r0]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            if (r5 != r6) goto Lf2
            java.lang.annotation.Annotation[] r4 = r3.getDeclaredAnnotations()
            int r5 = r4.length
            r6 = r0
        Ld8:
            if (r6 >= r5) goto L153
            r7 = r4[r6]
            java.lang.annotation.Annotation r7 = findAnnotation(r7, r10)
            com.alibaba.fastjson2.annotation.JSONField r7 = (com.alibaba.fastjson2.annotation.JSONField) r7
            if (r7 == 0) goto Lef
            boolean r7 = r7.unwrapped()
            if (r7 == 0) goto Lef
            r15.accept(r3)
            goto L153
        Lef:
            int r6 = r6 + 1
            goto Ld8
        Lf2:
            if (r9 == r8) goto Lf6
            goto L153
        Lf6:
            int r5 = r4.length()
            if (r5 <= r7) goto L106
            java.lang.String r5 = "set"
            boolean r4 = r4.startsWith(r5, r0)
            if (r4 == 0) goto L106
            r4 = r8
            goto L107
        L106:
            r4 = r0
        L107:
            if (r4 != 0) goto L12e
            if (r14 == 0) goto L12e
            java.lang.reflect.Method r5 = getMethod(r14, r3)
            if (r5 == 0) goto L12e
            java.lang.annotation.Annotation[] r5 = r5.getDeclaredAnnotations()
            int r6 = r5.length
            r7 = r0
        L117:
            if (r7 >= r6) goto L12e
            r9 = r5[r7]
            java.lang.Class r11 = r9.annotationType()
            if (r11 != r10) goto L12b
            com.alibaba.fastjson2.annotation.JSONField r9 = (com.alibaba.fastjson2.annotation.JSONField) r9
            boolean r5 = r9.unwrapped()
            if (r5 != 0) goto L12e
            r4 = r8
            goto L12e
        L12b:
            int r7 = r7 + 1
            goto L117
        L12e:
            if (r4 != 0) goto L14c
            java.lang.annotation.Annotation[] r5 = r3.getDeclaredAnnotations()
            int r6 = r5.length
            r7 = r0
        L136:
            if (r7 >= r6) goto L14c
            r9 = r5[r7]
            java.lang.Class r11 = r9.annotationType()
            if (r11 != r10) goto L149
            com.alibaba.fastjson2.annotation.JSONField r9 = (com.alibaba.fastjson2.annotation.JSONField) r9
            boolean r5 = r9.unwrapped()
            if (r5 != 0) goto L14c
            goto L14d
        L149:
            int r7 = r7 + 1
            goto L136
        L14c:
            r8 = r4
        L14d:
            if (r8 != 0) goto L150
            goto L153
        L150:
            r15.accept(r3)
        L153:
            int r2 = r2 + 1
            goto L14
        L157:
            return
    }

    public static void setters(java.lang.Class r1, java.util.function.Consumer<java.lang.reflect.Method> r2) {
            r0 = 0
            setters(r1, r0, r0, r2)
            return
    }

    public static void setters(java.lang.Class r8, boolean r9, java.util.function.Consumer<java.lang.reflect.Method> r10) {
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Method[]> r0 = com.alibaba.fastjson2.util.BeanUtils.methodCache
            java.lang.Object r1 = r0.get(r8)
            java.lang.reflect.Method[] r1 = (java.lang.reflect.Method[]) r1
            if (r1 != 0) goto L11
            java.lang.reflect.Method[] r1 = r8.getMethods()
            r0.put(r8, r1)
        L11:
            int r8 = r1.length
            r0 = 0
            r2 = r0
        L14:
            if (r2 >= r8) goto L82
            r3 = r1[r2]
            int r4 = r3.getParameterCount()
            r5 = 3
            if (r4 != 0) goto L58
            java.lang.String r6 = r3.getName()
            if (r9 == 0) goto L34
            int r7 = r6.length()
            if (r7 <= r5) goto L7f
            java.lang.String r7 = "get"
            boolean r6 = r6.startsWith(r7, r0)
            if (r6 != 0) goto L34
            goto L7f
        L34:
            java.lang.Class r6 = r3.getReturnType()
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r7 = java.util.concurrent.atomic.AtomicInteger.class
            if (r6 == r7) goto L54
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r7 = java.util.concurrent.atomic.AtomicLong.class
            if (r6 == r7) goto L54
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r7 = java.util.concurrent.atomic.AtomicBoolean.class
            if (r6 == r7) goto L54
            java.lang.Class<java.util.concurrent.atomic.AtomicIntegerArray> r7 = java.util.concurrent.atomic.AtomicIntegerArray.class
            if (r6 == r7) goto L54
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r7 = java.util.concurrent.atomic.AtomicLongArray.class
            if (r6 == r7) goto L54
            java.lang.Class<java.util.Collection> r7 = java.util.Collection.class
            boolean r6 = r7.isAssignableFrom(r6)
            if (r6 == 0) goto L58
        L54:
            r10.accept(r3)
            goto L7f
        L58:
            r6 = 1
            if (r4 == r6) goto L5c
            goto L7f
        L5c:
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 == 0) goto L67
            goto L7f
        L67:
            java.lang.String r4 = r3.getName()
            int r6 = r4.length()
            if (r9 == 0) goto L7c
            if (r6 <= r5) goto L7f
            java.lang.String r5 = "set"
            boolean r4 = r4.startsWith(r5, r0)
            if (r4 != 0) goto L7c
            goto L7f
        L7c:
            r10.accept(r3)
        L7f:
            int r2 = r2 + 1
            goto L14
        L82:
            return
    }

    public static java.lang.String snakeCase(java.lang.String r8, int r9) {
            int r0 = r8.length()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.util.TypeUtils$Cache, char[]> r1 = com.alibaba.fastjson2.util.TypeUtils.CHARS_UPDATER
            com.alibaba.fastjson2.util.TypeUtils$Cache r2 = com.alibaba.fastjson2.util.TypeUtils.CACHE
            r3 = 0
            java.lang.Object r1 = r1.getAndSet(r2, r3)
            char[] r1 = (char[]) r1
            if (r1 != 0) goto L15
            r1 = 128(0x80, float:1.8E-43)
            char[] r1 = new char[r1]
        L15:
            r2 = 0
            r3 = r9
            r4 = r2
        L18:
            if (r3 >= r0) goto L3d
            char r5 = r8.charAt(r3)     // Catch: java.lang.Throwable -> L33
            r6 = 65
            if (r5 < r6) goto L35
            r6 = 90
            if (r5 > r6) goto L35
            int r5 = r5 + 32
            char r5 = (char) r5     // Catch: java.lang.Throwable -> L33
            if (r3 <= r9) goto L35
            int r6 = r4 + 1
            r7 = 95
            r1[r4] = r7     // Catch: java.lang.Throwable -> L33
            r4 = r6
            goto L35
        L33:
            r8 = move-exception
            goto L4a
        L35:
            int r6 = r4 + 1
            r1[r4] = r5     // Catch: java.lang.Throwable -> L33
            int r3 = r3 + 1
            r4 = r6
            goto L18
        L3d:
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L33
            r8.<init>(r1, r2, r4)     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.util.TypeUtils$Cache, char[]> r9 = com.alibaba.fastjson2.util.TypeUtils.CHARS_UPDATER
            com.alibaba.fastjson2.util.TypeUtils$Cache r0 = com.alibaba.fastjson2.util.TypeUtils.CACHE
            r9.set(r0, r1)
            return r8
        L4a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.util.TypeUtils$Cache, char[]> r9 = com.alibaba.fastjson2.util.TypeUtils.CHARS_UPDATER
            com.alibaba.fastjson2.util.TypeUtils$Cache r0 = com.alibaba.fastjson2.util.TypeUtils.CACHE
            r9.set(r0, r1)
            throw r8
    }

    public static void staticMethod(java.lang.Class r4, java.util.function.Consumer<java.lang.reflect.Method> r5) {
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.reflect.Method[]> r0 = com.alibaba.fastjson2.util.BeanUtils.methodCache
            java.lang.Object r1 = r0.get(r4)
            java.lang.reflect.Method[] r1 = (java.lang.reflect.Method[]) r1
            if (r1 != 0) goto L11
            java.lang.reflect.Method[] r1 = r4.getMethods()
            r0.put(r4, r1)
        L11:
            int r4 = r1.length
            r0 = 0
        L13:
            if (r0 >= r4) goto L28
            r2 = r1[r0]
            int r3 = r2.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 != 0) goto L22
            goto L25
        L22:
            r5.accept(r2)
        L25:
            int r0 = r0 + 1
            goto L13
        L28:
            return
    }

    public static java.lang.reflect.WildcardType subtypeOf(java.lang.reflect.Type r3) {
            com.alibaba.fastjson2.util.BeanUtils$WildcardTypeImpl r0 = new com.alibaba.fastjson2.util.BeanUtils$WildcardTypeImpl
            boolean r1 = r3 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto Ld
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            java.lang.reflect.Type[] r3 = r3.getUpperBounds()
            goto L14
        Ld:
            r1 = 1
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
            r2 = 0
            r1[r2] = r3
            r3 = r1
        L14:
            java.lang.reflect.Type[] r1 = com.alibaba.fastjson2.util.BeanUtils.EMPTY_TYPE_ARRAY
            r0.<init>(r3, r1)
            return r0
    }

    public static java.lang.reflect.WildcardType supertypeOf(java.lang.reflect.Type r5) {
            com.alibaba.fastjson2.util.BeanUtils$WildcardTypeImpl r0 = new com.alibaba.fastjson2.util.BeanUtils$WildcardTypeImpl
            r1 = 1
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r1]
            r3 = 0
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r2[r3] = r4
            boolean r4 = r5 instanceof java.lang.reflect.WildcardType
            if (r4 == 0) goto L15
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r5 = r5.getLowerBounds()
            goto L1a
        L15:
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
            r1[r3] = r5
            r5 = r1
        L1a:
            r0.<init>(r2, r5)
            return r0
    }

    public static java.lang.String typeToString(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            return r1
        Lb:
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static java.lang.String underScores(java.lang.String r9, int r10, boolean r11) {
            int r0 = r9.length()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.util.TypeUtils$Cache, char[]> r1 = com.alibaba.fastjson2.util.TypeUtils.CHARS_UPDATER
            com.alibaba.fastjson2.util.TypeUtils$Cache r2 = com.alibaba.fastjson2.util.TypeUtils.CACHE
            r3 = 0
            java.lang.Object r1 = r1.getAndSet(r2, r3)
            char[] r1 = (char[]) r1
            if (r1 != 0) goto L15
            r1 = 128(0x80, float:1.8E-43)
            char[] r1 = new char[r1]
        L15:
            r2 = 0
            r3 = r10
            r4 = r2
        L18:
            if (r3 >= r0) goto L57
            char r5 = r9.charAt(r3)     // Catch: java.lang.Throwable -> L33
            r6 = 95
            r7 = 90
            r8 = 65
            if (r11 == 0) goto L41
            if (r5 < r8) goto L35
            if (r5 <= r7) goto L2b
            goto L35
        L2b:
            if (r3 <= r10) goto L4f
            int r7 = r4 + 1
            r1[r4] = r6     // Catch: java.lang.Throwable -> L33
            r4 = r7
            goto L4f
        L33:
            r9 = move-exception
            goto L64
        L35:
            r6 = 97
            if (r5 < r6) goto L4f
            r6 = 122(0x7a, float:1.71E-43)
            if (r5 > r6) goto L4f
            int r5 = r5 + (-32)
        L3f:
            char r5 = (char) r5     // Catch: java.lang.Throwable -> L33
            goto L4f
        L41:
            if (r5 < r8) goto L4f
            if (r5 > r7) goto L4f
            if (r3 <= r10) goto L4c
            int r7 = r4 + 1
            r1[r4] = r6     // Catch: java.lang.Throwable -> L33
            r4 = r7
        L4c:
            int r5 = r5 + 32
            goto L3f
        L4f:
            int r6 = r4 + 1
            r1[r4] = r5     // Catch: java.lang.Throwable -> L33
            int r3 = r3 + 1
            r4 = r6
            goto L18
        L57:
            java.lang.String r9 = new java.lang.String     // Catch: java.lang.Throwable -> L33
            r9.<init>(r1, r2, r4)     // Catch: java.lang.Throwable -> L33
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.util.TypeUtils$Cache, char[]> r10 = com.alibaba.fastjson2.util.TypeUtils.CHARS_UPDATER
            com.alibaba.fastjson2.util.TypeUtils$Cache r11 = com.alibaba.fastjson2.util.TypeUtils.CACHE
            r10.set(r11, r1)
            return r9
        L64:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.util.TypeUtils$Cache, char[]> r10 = com.alibaba.fastjson2.util.TypeUtils.CHARS_UPDATER
            com.alibaba.fastjson2.util.TypeUtils$Cache r11 = com.alibaba.fastjson2.util.TypeUtils.CACHE
            r10.set(r11, r1)
            throw r9
    }

    public static java.lang.String upperCamelWith(java.lang.String r11, int r12, char r13) {
            int r0 = r11.length()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.util.TypeUtils$Cache, char[]> r1 = com.alibaba.fastjson2.util.TypeUtils.CHARS_UPDATER
            com.alibaba.fastjson2.util.TypeUtils$Cache r2 = com.alibaba.fastjson2.util.TypeUtils.CACHE
            r3 = 0
            java.lang.Object r1 = r1.getAndSet(r2, r3)
            char[] r1 = (char[]) r1
            if (r1 != 0) goto L15
            r1 = 128(0x80, float:1.8E-43)
            char[] r1 = new char[r1]
        L15:
            r2 = 0
            r3 = r12
            r4 = r2
        L18:
            if (r3 >= r0) goto L9b
            char r5 = r11.charAt(r3)     // Catch: java.lang.Throwable -> L38
            r6 = 122(0x7a, float:1.71E-43)
            r7 = 97
            if (r3 != r12) goto L55
            if (r5 < r7) goto L3b
            if (r5 > r6) goto L3b
            int r8 = r3 + 1
            if (r8 >= r0) goto L3b
            char r8 = r11.charAt(r8)     // Catch: java.lang.Throwable -> L38
            if (r8 < r7) goto L3b
            if (r8 > r6) goto L3b
            int r5 = r5 + (-32)
            char r5 = (char) r5     // Catch: java.lang.Throwable -> L38
            goto L92
        L38:
            r11 = move-exception
            goto La8
        L3b:
            r8 = 95
            if (r5 != r8) goto L92
            int r8 = r3 + 1
            if (r8 >= r0) goto L92
            char r9 = r11.charAt(r8)     // Catch: java.lang.Throwable -> L38
            if (r9 < r7) goto L92
            if (r9 > r6) goto L92
            int r3 = r4 + 1
            r1[r4] = r5     // Catch: java.lang.Throwable -> L38
            int r9 = r9 + (-32)
            char r5 = (char) r9     // Catch: java.lang.Throwable -> L38
            r4 = r3
            r3 = r8
            goto L92
        L55:
            r8 = 90
            r9 = 65
            if (r5 < r9) goto L71
            if (r5 > r8) goto L71
            int r10 = r3 + 1
            if (r10 >= r0) goto L71
            char r10 = r11.charAt(r10)     // Catch: java.lang.Throwable -> L38
            if (r10 < r9) goto L69
            if (r10 <= r8) goto L71
        L69:
            if (r3 <= r12) goto L92
            int r6 = r4 + 1
            r1[r4] = r13     // Catch: java.lang.Throwable -> L38
        L6f:
            r4 = r6
            goto L92
        L71:
            if (r5 < r9) goto L92
            if (r5 > r8) goto L92
            if (r3 <= r12) goto L92
            int r10 = r3 + 1
            if (r10 >= r0) goto L92
            char r10 = r11.charAt(r10)     // Catch: java.lang.Throwable -> L38
            if (r10 < r9) goto L92
            if (r10 > r8) goto L92
            int r8 = r3 + (-1)
            char r8 = r11.charAt(r8)     // Catch: java.lang.Throwable -> L38
            if (r8 < r7) goto L92
            if (r8 > r6) goto L92
            int r6 = r4 + 1
            r1[r4] = r13     // Catch: java.lang.Throwable -> L38
            goto L6f
        L92:
            int r6 = r4 + 1
            r1[r4] = r5     // Catch: java.lang.Throwable -> L38
            int r3 = r3 + 1
            r4 = r6
            goto L18
        L9b:
            java.lang.String r11 = new java.lang.String     // Catch: java.lang.Throwable -> L38
            r11.<init>(r1, r2, r4)     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.util.TypeUtils$Cache, char[]> r12 = com.alibaba.fastjson2.util.TypeUtils.CHARS_UPDATER
            com.alibaba.fastjson2.util.TypeUtils$Cache r13 = com.alibaba.fastjson2.util.TypeUtils.CACHE
            r12.set(r13, r1)
            return r11
        La8:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<com.alibaba.fastjson2.util.TypeUtils$Cache, char[]> r12 = com.alibaba.fastjson2.util.TypeUtils.CHARS_UPDATER
            com.alibaba.fastjson2.util.TypeUtils$Cache r13 = com.alibaba.fastjson2.util.TypeUtils.CACHE
            r12.set(r13, r1)
            throw r11
    }
}
