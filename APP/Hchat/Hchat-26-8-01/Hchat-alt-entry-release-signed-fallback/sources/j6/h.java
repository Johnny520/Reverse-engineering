package j6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Type[] f6733a = null;

    static {
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            j6.h.f6733a = r0
            return
    }

    public static java.lang.reflect.Type a(java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L1b
            java.lang.Class r3 = (java.lang.Class) r3
            boolean r0 = r3.isArray()
            if (r0 == 0) goto L1a
            j6.e r0 = new j6.e
            java.lang.Class r3 = r3.getComponentType()
            java.lang.reflect.Type r3 = a(r3)
            r0.<init>(r3)
            return r0
        L1a:
            return r3
        L1b:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L35
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            j6.f r0 = new j6.f
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
            j6.e r0 = new j6.e
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            r0.<init>(r3)
            return r0
        L45:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L59
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            j6.g r0 = new j6.g
            java.lang.reflect.Type[] r1 = r3.getUpperBounds()
            java.lang.reflect.Type[] r3 = r3.getLowerBounds()
            r0.<init>(r1, r3)
            return r0
        L59:
            return r3
    }

    public static void b(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L12
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto Ld
            goto L12
        Ld:
            java.lang.String r1 = "Primitive type is not allowed"
            j8.o.t(r1)
        L12:
            return
    }

    public static boolean c(java.lang.reflect.Type r4, java.lang.reflect.Type r5) {
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
            boolean r1 = java.util.Objects.equals(r1, r3)
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
            boolean r4 = c(r4, r5)
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
            if (r1 == 0) goto Lb6
            boolean r1 = r5 instanceof java.lang.reflect.TypeVariable
            if (r1 != 0) goto L95
            return r2
        L95:
            java.lang.reflect.TypeVariable r4 = (java.lang.reflect.TypeVariable) r4
            java.lang.reflect.TypeVariable r5 = (java.lang.reflect.TypeVariable) r5
            java.lang.reflect.GenericDeclaration r1 = r4.getGenericDeclaration()
            java.lang.reflect.GenericDeclaration r3 = r5.getGenericDeclaration()
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto Lb6
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = r5.getName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto Lb6
            return r0
        Lb6:
            return r2
    }

    public static void d(java.util.ArrayList r1) {
            java.util.Iterator r1 = r1.iterator()
            boolean r0 = r1.hasNext()
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Object r1 = r1.next()
            r1.getClass()
            ah.a.d()
            return
    }

    public static java.lang.reflect.Type e(java.lang.reflect.Type r3, java.lang.Class r4, java.lang.Class r5) {
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
            java.lang.reflect.Type r3 = e(r4, r3, r5)
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
            java.lang.reflect.Type r3 = e(r4, r3, r5)
            return r3
        L56:
            r4 = r3
            goto L38
        L58:
            return r5
    }

    public static java.lang.Class f(java.lang.reflect.Type r3) {
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto L7
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        L7:
            boolean r0 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L14
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = r3.getRawType()
            java.lang.Class r3 = (java.lang.Class) r3
            return r3
        L14:
            boolean r0 = r3 instanceof java.lang.reflect.GenericArrayType
            r1 = 0
            if (r0 == 0) goto L2c
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            java.lang.reflect.Type r3 = r3.getGenericComponentType()
            java.lang.Class r3 = f(r3)
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r1)
            java.lang.Class r3 = r3.getClass()
            return r3
        L2c:
            boolean r0 = r3 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L33
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            return r3
        L33:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L44
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            java.lang.reflect.Type[] r3 = r3.getUpperBounds()
            r3 = r3[r1]
            java.lang.Class r3 = f(r3)
            return r3
        L44:
            if (r3 != 0) goto L49
            java.lang.String r0 = "null"
            goto L51
        L49:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
        L51:
            java.lang.String r1 = "Expected a Class, ParameterizedType, or GenericArrayType, but <"
            java.lang.String r2 = "> is of type "
            j8.o.m(r1, r3, r2, r0)
            r3 = 0
            return r3
    }

    public static java.lang.reflect.Type g(java.lang.reflect.Type r1, java.lang.Class r2, java.lang.Class r3) {
            boolean r0 = r1 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Ld
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            java.lang.reflect.Type[] r1 = r1.getUpperBounds()
            r0 = 0
            r1 = r1[r0]
        Ld:
            boolean r0 = r3.isAssignableFrom(r2)
            if (r0 == 0) goto L21
            java.lang.reflect.Type r3 = e(r1, r2, r3)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.reflect.Type r1 = h(r1, r2, r3, r0)
            return r1
        L21:
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

    public static java.lang.reflect.Type h(java.lang.reflect.Type r10, java.lang.Class r11, java.lang.reflect.Type r12, java.util.HashMap r13) {
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r12 instanceof java.lang.reflect.TypeVariable
            r3 = 0
            if (r2 == 0) goto L59
            r2 = r12
            java.lang.reflect.TypeVariable r2 = (java.lang.reflect.TypeVariable) r2
            java.lang.Object r4 = r13.get(r2)
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            java.lang.Class r5 = java.lang.Void.TYPE
            if (r4 == 0) goto L18
            if (r4 != r5) goto L17
            return r12
        L17:
            return r4
        L18:
            r13.put(r2, r5)
            if (r1 != 0) goto L1e
            r1 = r2
        L1e:
            java.lang.reflect.GenericDeclaration r12 = r2.getGenericDeclaration()
            boolean r4 = r12 instanceof java.lang.Class
            if (r4 == 0) goto L29
            java.lang.Class r12 = (java.lang.Class) r12
            goto L2a
        L29:
            r12 = r0
        L2a:
            if (r12 != 0) goto L2d
            goto L54
        L2d:
            java.lang.reflect.Type r4 = e(r10, r11, r12)
            boolean r5 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L54
            java.lang.reflect.TypeVariable[] r12 = r12.getTypeParameters()
            int r5 = r12.length
        L3a:
            if (r3 >= r5) goto L50
            r6 = r12[r3]
            boolean r6 = r2.equals(r6)
            if (r6 == 0) goto L4d
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r12 = r4.getActualTypeArguments()
            r12 = r12[r3]
            goto L55
        L4d:
            int r3 = r3 + 1
            goto L3a
        L50:
            bsh.j.e()
            return r0
        L54:
            r12 = r2
        L55:
            if (r12 != r2) goto L2
            goto L13f
        L59:
            boolean r0 = r12 instanceof java.lang.Class
            if (r0 == 0) goto L7f
            r0 = r12
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L7f
            java.lang.Class r12 = r0.getComponentType()
            java.lang.reflect.Type r10 = h(r10, r11, r12, r13)
            boolean r11 = java.util.Objects.equals(r12, r10)
            if (r11 == 0) goto L77
            r12 = r0
            goto L13f
        L77:
            j6.e r11 = new j6.e
            r11.<init>(r10)
        L7c:
            r12 = r11
            goto L13f
        L7f:
            boolean r0 = r12 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L9b
            java.lang.reflect.GenericArrayType r12 = (java.lang.reflect.GenericArrayType) r12
            java.lang.reflect.Type r0 = r12.getGenericComponentType()
            java.lang.reflect.Type r10 = h(r10, r11, r0, r13)
            boolean r11 = java.util.Objects.equals(r0, r10)
            if (r11 == 0) goto L95
            goto L13f
        L95:
            j6.e r11 = new j6.e
            r11.<init>(r10)
            goto L7c
        L9b:
            boolean r0 = r12 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto Le4
            java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
            java.lang.reflect.Type r0 = r12.getOwnerType()
            java.lang.reflect.Type r4 = h(r10, r11, r0, r13)
            boolean r0 = java.util.Objects.equals(r4, r0)
            java.lang.reflect.Type[] r5 = r12.getActualTypeArguments()
            int r6 = r5.length
            r7 = r5
            r5 = r3
        Lb5:
            if (r3 >= r6) goto Ld4
            r8 = r7[r3]
            java.lang.reflect.Type r8 = h(r10, r11, r8, r13)
            r9 = r7[r3]
            boolean r9 = java.util.Objects.equals(r8, r9)
            if (r9 != 0) goto Ld1
            if (r5 != 0) goto Lcf
            java.lang.Object r5 = r7.clone()
            r7 = r5
            java.lang.reflect.Type[] r7 = (java.lang.reflect.Type[]) r7
            r5 = r2
        Lcf:
            r7[r3] = r8
        Ld1:
            int r3 = r3 + 1
            goto Lb5
        Ld4:
            if (r0 == 0) goto Ld8
            if (r5 == 0) goto L13f
        Ld8:
            java.lang.reflect.Type r10 = r12.getRawType()
            java.lang.Class r10 = (java.lang.Class) r10
            j6.f r11 = new j6.f
            r11.<init>(r4, r10, r7)
            goto L7c
        Le4:
            boolean r0 = r12 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L13f
            java.lang.reflect.WildcardType r12 = (java.lang.reflect.WildcardType) r12
            java.lang.reflect.Type[] r0 = r12.getLowerBounds()
            java.lang.reflect.Type[] r4 = r12.getUpperBounds()
            int r5 = r0.length
            if (r5 != r2) goto L11b
            r4 = r0[r3]
            java.lang.reflect.Type r10 = h(r10, r11, r4, r13)
            r11 = r0[r3]
            if (r10 == r11) goto L13f
            boolean r11 = r10 instanceof java.lang.reflect.WildcardType
            if (r11 == 0) goto L10a
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r10 = r10.getLowerBounds()
            goto L10f
        L10a:
            java.lang.reflect.Type[] r11 = new java.lang.reflect.Type[r2]
            r11[r3] = r10
            r10 = r11
        L10f:
            j6.g r12 = new j6.g
            java.lang.reflect.Type[] r11 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r11[r3] = r0
            r12.<init>(r11, r10)
            goto L13f
        L11b:
            int r0 = r4.length
            if (r0 != r2) goto L13f
            r0 = r4[r3]
            java.lang.reflect.Type r10 = h(r10, r11, r0, r13)
            r11 = r4[r3]
            if (r10 == r11) goto L13f
            boolean r11 = r10 instanceof java.lang.reflect.WildcardType
            if (r11 == 0) goto L133
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r10 = r10.getUpperBounds()
            goto L138
        L133:
            java.lang.reflect.Type[] r11 = new java.lang.reflect.Type[r2]
            r11[r3] = r10
            r10 = r11
        L138:
            j6.g r12 = new j6.g
            java.lang.reflect.Type[] r11 = j6.h.f6733a
            r12.<init>(r10, r11)
        L13f:
            if (r1 == 0) goto L144
            r13.put(r1, r12)
        L144:
            return r12
    }

    public static java.lang.String i(java.lang.reflect.Type r1) {
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r1 = r1.getName()
            return r1
        Lb:
            java.lang.String r1 = r1.toString()
            return r1
    }
}
