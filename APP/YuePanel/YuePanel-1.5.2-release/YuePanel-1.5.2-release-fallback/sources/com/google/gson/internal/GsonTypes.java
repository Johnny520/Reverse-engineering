package com.google.gson.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class GsonTypes {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final java.lang.reflect.Type[] EMPTY_TYPE_ARRAY = null;

    public static final class GenericArrayTypeImpl implements java.lang.reflect.GenericArrayType {
        private final java.lang.reflect.Type componentType;

        public GenericArrayTypeImpl(java.lang.reflect.Type r1) {
                r0 = this;
                r0.<init>()
                java.util.Objects.requireNonNull(r1)
                java.lang.reflect.Type r1 = com.google.gson.internal.GsonTypes.canonicalize(r1)
                r0.componentType = r1
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
                if (r0 == 0) goto Le
                java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
                boolean r2 = com.google.gson.internal.GsonTypes.equals(r1, r2)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
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
                java.lang.String r1 = com.google.gson.internal.GsonTypes.typeToString(r1)
                r0.append(r1)
                java.lang.String r1 = "[]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static final class ParameterizedTypeImpl implements java.lang.reflect.ParameterizedType {
        private final java.lang.reflect.Type ownerType;
        private final java.lang.reflect.Type rawType;
        private final java.lang.reflect.Type[] typeArguments;

        public ParameterizedTypeImpl(java.lang.reflect.Type r2, java.lang.Class<?> r3, java.lang.reflect.Type... r4) {
                r1 = this;
                r1.<init>()
                java.util.Objects.requireNonNull(r3)
                if (r2 != 0) goto L26
                boolean r0 = com.google.gson.internal.GsonTypes.requiresOwnerType(r3)
                if (r0 != 0) goto Lf
                goto L26
            Lf:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r0 = "Must specify owner type for "
                r4.append(r0)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                r2.<init>(r3)
                throw r2
            L26:
                if (r2 != 0) goto L2a
                r2 = 0
                goto L2e
            L2a:
                java.lang.reflect.Type r2 = com.google.gson.internal.GsonTypes.canonicalize(r2)
            L2e:
                r1.ownerType = r2
                java.lang.reflect.Type r2 = com.google.gson.internal.GsonTypes.canonicalize(r3)
                r1.rawType = r2
                java.lang.Object r2 = r4.clone()
                java.lang.reflect.Type[] r2 = (java.lang.reflect.Type[]) r2
                r1.typeArguments = r2
                int r2 = r2.length
                r3 = 0
            L40:
                if (r3 >= r2) goto L5d
                java.lang.reflect.Type[] r4 = r1.typeArguments
                r4 = r4[r3]
                java.util.Objects.requireNonNull(r4)
                java.lang.reflect.Type[] r4 = r1.typeArguments
                r4 = r4[r3]
                com.google.gson.internal.GsonTypes.checkNotPrimitive(r4)
                java.lang.reflect.Type[] r4 = r1.typeArguments
                r0 = r4[r3]
                java.lang.reflect.Type r0 = com.google.gson.internal.GsonTypes.canonicalize(r0)
                r4[r3] = r0
                int r3 = r3 + 1
                goto L40
            L5d:
                return
        }

        private static int hashCodeOrZero(java.lang.Object r0) {
                if (r0 == 0) goto L7
                int r0 = r0.hashCode()
                goto L8
            L7:
                r0 = 0
            L8:
                return r0
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto Le
                java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
                boolean r2 = com.google.gson.internal.GsonTypes.equals(r1, r2)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
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
                int r1 = hashCodeOrZero(r1)
                r0 = r0 ^ r1
                return r0
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.reflect.Type[] r0 = r4.typeArguments
                int r0 = r0.length
                if (r0 != 0) goto Lc
                java.lang.reflect.Type r0 = r4.rawType
                java.lang.String r0 = com.google.gson.internal.GsonTypes.typeToString(r0)
                return r0
            Lc:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                int r2 = r0 + 1
                int r2 = r2 * 30
                r1.<init>(r2)
                java.lang.reflect.Type r2 = r4.rawType
                java.lang.String r2 = com.google.gson.internal.GsonTypes.typeToString(r2)
                r1.append(r2)
                java.lang.String r2 = "<"
                r1.append(r2)
                java.lang.reflect.Type[] r2 = r4.typeArguments
                r3 = 0
                r2 = r2[r3]
                java.lang.String r2 = com.google.gson.internal.GsonTypes.typeToString(r2)
                r1.append(r2)
                r2 = 1
            L30:
                if (r2 >= r0) goto L45
                java.lang.String r3 = ", "
                r1.append(r3)
                java.lang.reflect.Type[] r3 = r4.typeArguments
                r3 = r3[r2]
                java.lang.String r3 = com.google.gson.internal.GsonTypes.typeToString(r3)
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

    public static final class WildcardTypeImpl implements java.lang.reflect.WildcardType {
        private final java.lang.reflect.Type lowerBound;
        private final java.lang.reflect.Type upperBound;

        public WildcardTypeImpl(java.lang.reflect.Type[] r4, java.lang.reflect.Type[] r5) {
                r3 = this;
                r3.<init>()
                int r0 = r5.length
                r1 = 1
                if (r0 > r1) goto L4f
                int r0 = r4.length
                if (r0 != r1) goto L47
                int r0 = r5.length
                r2 = 0
                if (r0 != r1) goto L31
                r0 = r5[r2]
                java.util.Objects.requireNonNull(r0)
                r0 = r5[r2]
                com.google.gson.internal.GsonTypes.checkNotPrimitive(r0)
                r4 = r4[r2]
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                if (r4 != r0) goto L29
                r4 = r5[r2]
                java.lang.reflect.Type r4 = com.google.gson.internal.GsonTypes.canonicalize(r4)
                r3.lowerBound = r4
                r3.upperBound = r0
                goto L46
            L29:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "When lower bound is specified, upper bound must be Object"
                r4.<init>(r5)
                throw r4
            L31:
                r5 = r4[r2]
                java.util.Objects.requireNonNull(r5)
                r5 = r4[r2]
                com.google.gson.internal.GsonTypes.checkNotPrimitive(r5)
                r5 = 0
                r3.lowerBound = r5
                r4 = r4[r2]
                java.lang.reflect.Type r4 = com.google.gson.internal.GsonTypes.canonicalize(r4)
                r3.upperBound = r4
            L46:
                return
            L47:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Exactly one upper bound must be specified"
                r4.<init>(r5)
                throw r4
            L4f:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "At most one lower bound is supported"
                r4.<init>(r5)
                throw r4
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.reflect.WildcardType
                if (r0 == 0) goto Le
                java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
                boolean r2 = com.google.gson.internal.GsonTypes.equals(r1, r2)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
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
                goto Ld
            Lb:
                java.lang.reflect.Type[] r1 = com.google.gson.internal.GsonTypes.EMPTY_TYPE_ARRAY
            Ld:
                return r1
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
                if (r0 == 0) goto L1c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "? super "
                r0.append(r1)
                java.lang.reflect.Type r1 = r2.lowerBound
                java.lang.String r1 = com.google.gson.internal.GsonTypes.typeToString(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            L1c:
                java.lang.reflect.Type r0 = r2.upperBound
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                if (r0 != r1) goto L25
                java.lang.String r0 = "?"
                return r0
            L25:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "? extends "
                r0.append(r1)
                java.lang.reflect.Type r1 = r2.upperBound
                java.lang.String r1 = com.google.gson.internal.GsonTypes.typeToString(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            com.google.gson.internal.GsonTypes.EMPTY_TYPE_ARRAY = r0
            return
    }

    private GsonTypes() {
            r1 = this;
            r1.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public static java.lang.reflect.GenericArrayType arrayOf(java.lang.reflect.Type r1) {
            com.google.gson.internal.GsonTypes$GenericArrayTypeImpl r0 = new com.google.gson.internal.GsonTypes$GenericArrayTypeImpl
            r0.<init>(r1)
            return r0
    }

    public static java.lang.reflect.Type canonicalize(java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L1b
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L1a
            com.google.gson.internal.GsonTypes$GenericArrayTypeImpl r0 = new com.google.gson.internal.GsonTypes$GenericArrayTypeImpl
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = canonicalize(r3)
            r0.<init>(r3)
            r3 = r0
        L1a:
            return r3
        L1b:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L35
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            com.google.gson.internal.GsonTypes$ParameterizedTypeImpl r0 = new com.google.gson.internal.GsonTypes$ParameterizedTypeImpl
            java.lang.reflect.Type r1 = r3.getOwnerType()
            java.lang.reflect.Type r2 = r3.getRawType()
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            r0.<init>(r1, r2, r3)
            return r0
        L35:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L45
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            com.google.gson.internal.GsonTypes$GenericArrayTypeImpl r0 = new com.google.gson.internal.GsonTypes$GenericArrayTypeImpl
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L45:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L59
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            com.google.gson.internal.GsonTypes$WildcardTypeImpl r0 = new com.google.gson.internal.GsonTypes$WildcardTypeImpl
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L59:
            return r3
    }

    public static void checkNotPrimitive(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L15
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto Ld
            goto L15
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Primitive type is not allowed"
            r1.<init>(r0)
            throw r1
        L15:
            return
    }

    private static java.lang.Class<?> declaringClassOf(java.lang.reflect.TypeVariable<?> r1) {
            java.lang.reflect.GenericDeclaration r1 = r1.getGenericDeclaration()
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r1 = (java.lang.Class) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
    }

    private static boolean equal(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = java.util.Objects.equals(r0, r1)
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
            if (r1 == 0) goto L48
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
            goto L47
        L46:
            r0 = r2
        L47:
            return r0
        L48:
            boolean r1 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L62
            boolean r0 = r5 instanceof java.lang.reflect.GenericArrayType
            if (r0 != 0) goto L51
            return r2
        L51:
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            java.lang.reflect.GenericArrayType r5 = (java.lang.reflect.GenericArrayType) r5
            java.lang.reflect.Type r4 = r4.getGenericComponentType()
            java.lang.reflect.Type r5 = r5.getGenericComponentType()
            boolean r4 = equals(r4, r5)
            return r4
        L62:
            boolean r1 = r4 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L8e
            boolean r1 = r5 instanceof java.lang.reflect.WildcardType
            if (r1 != 0) goto L6b
            return r2
        L6b:
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r1 = r4.getUpperBounds()
            java.lang.reflect.Type[] r3 = r5.getUpperBounds()
            boolean r1 = java.util.Arrays.equals(r1, r3)
            if (r1 == 0) goto L8c
            java.lang.reflect.Type[] r4 = r4.getLowerBounds()
            java.lang.reflect.Type[] r5 = r5.getLowerBounds()
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L8c
            goto L8d
        L8c:
            r0 = r2
        L8d:
            return r0
        L8e:
            boolean r1 = r4 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto Lba
            boolean r1 = r5 instanceof java.lang.reflect.TypeVariable
            if (r1 != 0) goto L97
            return r2
        L97:
            java.lang.reflect.TypeVariable r4 = (java.lang.reflect.TypeVariable) r4
            java.lang.reflect.TypeVariable r5 = (java.lang.reflect.TypeVariable) r5
            java.lang.reflect.GenericDeclaration r1 = r4.getGenericDeclaration()
            java.lang.reflect.GenericDeclaration r3 = r5.getGenericDeclaration()
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto Lb8
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r5.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lb8
            goto Lb9
        Lb8:
            r0 = r2
        Lb9:
            return r0
        Lba:
            return r2
    }

    public static java.lang.reflect.Type getArrayComponentType(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto Lb
            java.lang.reflect.GenericArrayType r1 = (java.lang.reflect.GenericArrayType) r1
            java.lang.reflect.Type r1 = r1.getGenericComponentType()
            goto L11
        Lb:
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Class r1 = r1.getComponentType()
        L11:
            return r1
    }

    public static java.lang.reflect.Type getCollectionElementType(java.lang.reflect.Type r1, java.lang.Class<?> r2) {
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            java.lang.reflect.Type r1 = getSupertype(r1, r2, r0)
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L14
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            r2 = 0
            r1 = r1[r2]
            return r1
        L14:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            return r1
    }

    private static java.lang.reflect.Type getGenericSupertype(java.lang.reflect.Type r3, java.lang.Class<?> r4, java.lang.Class<?> r5) {
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
            boolean r3 = r4.isInterface()
            if (r3 != 0) goto L58
        L38:
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r4 == r3) goto L58
            java.lang.Class r3 = r4.getSuperclass()
            if (r3 != r5) goto L47
            java.lang.reflect.Type r3 = r4.getGenericSuperclass()
            return r3
        L47:
            boolean r0 = r5.isAssignableFrom(r3)
            if (r0 == 0) goto L56
            java.lang.reflect.Type r4 = r4.getGenericSuperclass()
            java.lang.reflect.Type r3 = getGenericSupertype(r4, r3, r5)
            return r3
        L56:
            r4 = r3
            goto L38
        L58:
            return r5
    }

    public static java.lang.reflect.Type[] getMapKeyAndValueTypes(java.lang.reflect.Type r4, java.lang.Class<?> r5) {
            r0 = 1
            r1 = 0
            r2 = 2
            java.lang.Class<java.util.Properties> r3 = java.util.Properties.class
            boolean r3 = r3.isAssignableFrom(r5)
            if (r3 == 0) goto L14
            java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r1] = r5
            r4[r0] = r5
            return r4
        L14:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            java.lang.reflect.Type r4 = getSupertype(r4, r5, r3)
            boolean r5 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L25
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            return r4
        L25:
            java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r4[r1] = r5
            r4[r0] = r5
            return r4
    }

    public static java.lang.Class<?> getRawType(java.lang.reflect.Type r4) {
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L7
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
        L7:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L14
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r4 = r4.getRawType()
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
        L14:
            boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
            r1 = 0
            if (r0 == 0) goto L2c
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            java.lang.reflect.Type r4 = r4.getGenericComponentType()
            java.lang.Class r4 = getRawType(r4)
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r1)
            java.lang.Class r4 = r4.getClass()
            return r4
        L2c:
            boolean r0 = r4 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L33
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            return r4
        L33:
            boolean r0 = r4 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L44
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r4 = r4.getUpperBounds()
            r4 = r4[r1]
            java.lang.Class r4 = getRawType(r4)
            return r4
        L44:
            if (r4 != 0) goto L49
            java.lang.String r0 = "null"
            goto L51
        L49:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
        L51:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected a Class, ParameterizedType, or GenericArrayType, but <"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = "> is of type "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
    }

    private static java.lang.reflect.Type getSupertype(java.lang.reflect.Type r1, java.lang.Class<?> r2, java.lang.Class<?> r3) {
            boolean r0 = r1 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Ld
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            java.lang.reflect.Type[] r1 = r1.getUpperBounds()
            r0 = 0
            r1 = r1[r0]
        Ld:
            boolean r0 = r3.isAssignableFrom(r2)
            if (r0 == 0) goto L1c
            java.lang.reflect.Type r3 = getGenericSupertype(r1, r2, r3)
            java.lang.reflect.Type r1 = resolve(r1, r2, r3)
            return r1
        L1c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " is not the same as or a subtype of "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            throw r1
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
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    public static java.lang.reflect.ParameterizedType newParameterizedTypeWithOwner(java.lang.reflect.Type r1, java.lang.Class<?> r2, java.lang.reflect.Type... r3) {
            com.google.gson.internal.GsonTypes$ParameterizedTypeImpl r0 = new com.google.gson.internal.GsonTypes$ParameterizedTypeImpl
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static boolean requiresOwnerType(java.lang.reflect.Type r2) {
            boolean r0 = r2 instanceof java.lang.Class
            r1 = 0
            if (r0 == 0) goto L18
            java.lang.Class r2 = (java.lang.Class) r2
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L18
            java.lang.Class r2 = r2.getDeclaringClass()
            if (r2 == 0) goto L18
            r1 = 1
        L18:
            return r1
    }

    public static java.lang.reflect.Type resolve(java.lang.reflect.Type r1, java.lang.Class<?> r2, java.lang.reflect.Type r3) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.reflect.Type r1 = resolve(r1, r2, r3, r0)
            return r1
    }

    private static java.lang.reflect.Type resolve(java.lang.reflect.Type r10, java.lang.Class<?> r11, java.lang.reflect.Type r12, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r13) {
            r0 = 0
        L1:
            boolean r1 = r12 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L27
            r1 = r12
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.Object r2 = r13.get(r1)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            if (r2 == 0) goto L17
            java.lang.Class r10 = java.lang.Void.TYPE
            if (r2 != r10) goto L15
            goto L16
        L15:
            r12 = r2
        L16:
            return r12
        L17:
            java.lang.Class r12 = java.lang.Void.TYPE
            r13.put(r1, r12)
            if (r0 != 0) goto L1f
            r0 = r1
        L1f:
            java.lang.reflect.Type r12 = resolveTypeVariable(r10, r11, r1)
            if (r12 != r1) goto L1
            goto Le2
        L27:
            boolean r1 = r12 instanceof java.lang.Class
            if (r1 == 0) goto L4c
            r1 = r12
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r2 = r1.isArray()
            if (r2 == 0) goto L4c
            java.lang.Class r12 = r1.getComponentType()
            java.lang.reflect.Type r10 = resolve(r10, r11, r12, r13)
            boolean r11 = equal(r12, r10)
            if (r11 == 0) goto L45
            r12 = r1
            goto Le2
        L45:
            java.lang.reflect.GenericArrayType r10 = arrayOf(r10)
        L49:
            r12 = r10
            goto Le2
        L4c:
            boolean r1 = r12 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L67
            java.lang.reflect.GenericArrayType r12 = (java.lang.reflect.GenericArrayType) r12
            java.lang.reflect.Type r1 = r12.getGenericComponentType()
            java.lang.reflect.Type r10 = resolve(r10, r11, r1, r13)
            boolean r11 = equal(r1, r10)
            if (r11 == 0) goto L62
            goto Le2
        L62:
            java.lang.reflect.GenericArrayType r10 = arrayOf(r10)
            goto L49
        L67:
            boolean r1 = r12 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Lb1
            java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
            java.lang.reflect.Type r1 = r12.getOwnerType()
            java.lang.reflect.Type r4 = resolve(r10, r11, r1, r13)
            boolean r1 = equal(r4, r1)
            r1 = r1 ^ r2
            java.lang.reflect.Type[] r5 = r12.getActualTypeArguments()
            int r6 = r5.length
            r7 = r5
            r5 = r3
        L83:
            if (r3 >= r6) goto La2
            r8 = r7[r3]
            java.lang.reflect.Type r8 = resolve(r10, r11, r8, r13)
            r9 = r7[r3]
            boolean r9 = equal(r8, r9)
            if (r9 != 0) goto L9f
            if (r5 != 0) goto L9d
            java.lang.Object r5 = r7.clone()
            r7 = r5
            java.lang.reflect.Type[] r7 = (java.lang.reflect.Type[]) r7
            r5 = r2
        L9d:
            r7[r3] = r8
        L9f:
            int r3 = r3 + 1
            goto L83
        La2:
            if (r1 != 0) goto La6
            if (r5 == 0) goto Le2
        La6:
            java.lang.reflect.Type r10 = r12.getRawType()
            java.lang.Class r10 = (java.lang.Class) r10
            java.lang.reflect.ParameterizedType r10 = newParameterizedTypeWithOwner(r4, r10, r7)
            goto L49
        Lb1:
            boolean r1 = r12 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto Le2
            java.lang.reflect.WildcardType r12 = (java.lang.reflect.WildcardType) r12
            java.lang.reflect.Type[] r1 = r12.getLowerBounds()
            java.lang.reflect.Type[] r4 = r12.getUpperBounds()
            int r5 = r1.length
            if (r5 != r2) goto Ld1
            r2 = r1[r3]
            java.lang.reflect.Type r10 = resolve(r10, r11, r2, r13)
            r11 = r1[r3]
            if (r10 == r11) goto Le2
            java.lang.reflect.WildcardType r12 = supertypeOf(r10)
            goto Le2
        Ld1:
            int r1 = r4.length
            if (r1 != r2) goto Le2
            r1 = r4[r3]
            java.lang.reflect.Type r10 = resolve(r10, r11, r1, r13)
            r11 = r4[r3]
            if (r10 == r11) goto Le2
            java.lang.reflect.WildcardType r12 = subtypeOf(r10)
        Le2:
            if (r0 == 0) goto Le7
            r13.put(r0, r12)
        Le7:
            return r12
    }

    private static java.lang.reflect.Type resolveTypeVariable(java.lang.reflect.Type r1, java.lang.Class<?> r2, java.lang.reflect.TypeVariable<?> r3) {
            java.lang.Class r0 = declaringClassOf(r3)
            if (r0 != 0) goto L7
            return r3
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

    public static java.lang.reflect.WildcardType subtypeOf(java.lang.reflect.Type r2) {
            boolean r0 = r2 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Lb
            java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
            java.lang.reflect.Type[] r2 = r2.getUpperBounds()
            goto L12
        Lb:
            r0 = 1
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            r1 = 0
            r0[r1] = r2
            r2 = r0
        L12:
            com.google.gson.internal.GsonTypes$WildcardTypeImpl r0 = new com.google.gson.internal.GsonTypes$WildcardTypeImpl
            java.lang.reflect.Type[] r1 = com.google.gson.internal.GsonTypes.EMPTY_TYPE_ARRAY
            r0.<init>(r2, r1)
            return r0
    }

    public static java.lang.reflect.WildcardType supertypeOf(java.lang.reflect.Type r4) {
            r0 = 0
            r1 = 1
            boolean r2 = r4 instanceof java.lang.reflect.WildcardType
            if (r2 == 0) goto Ld
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r4 = r4.getLowerBounds()
            goto L12
        Ld:
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r1]
            r2[r0] = r4
            r4 = r2
        L12:
            com.google.gson.internal.GsonTypes$WildcardTypeImpl r2 = new com.google.gson.internal.GsonTypes$WildcardTypeImpl
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r1[r0] = r3
            r2.<init>(r1, r4)
            return r2
    }

    public static java.lang.String typeToString(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            goto Lf
        Lb:
            java.lang.String r1 = r1.toString()
        Lf:
            return r1
    }
}
