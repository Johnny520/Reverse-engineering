package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class Types {
    static final int ASSIGNMENT = 1;
    static final int BSH_ASSIGNABLE = 4;
    static final int CAST = 0;
    static final int FIRST_ROUND_ASSIGNABLE = 1;
    static bsh.Primitive INVALID_CAST = null;
    static final int JAVA_BASE_ASSIGNABLE = 1;
    static final int JAVA_BOX_TYPES_ASSIGABLE = 2;
    static final int JAVA_VARARGS_ASSIGNABLE = 3;
    static final int LAST_ROUND_ASSIGNABLE = 4;
    private static final java.util.Map<java.lang.Class<?>, java.lang.Integer> NUMBER_ORDER = null;
    static bsh.Primitive VALID_CAST;



    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class MapEntry extends java.util.AbstractMap.SimpleEntry<java.lang.Object, java.lang.Object> {
        private static final long serialVersionUID = 1;

        public MapEntry(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class Suffix {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final java.util.Map<java.lang.String, java.lang.Class<?>> f925m = null;


        static {
                bsh.Types$Suffix$1 r0 = new bsh.Types$Suffix$1
                r0.<init>()
                java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
                bsh.Types.Suffix.f925m = r0
                return
        }

        public Suffix() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.Class<?> getFloatingPointType(java.lang.Character r1) {
                java.util.Map<java.lang.String, java.lang.Class<?>> r0 = bsh.Types.Suffix.f925m
                java.lang.String r1 = toLowerKey(r1)
                java.lang.Object r1 = r0.get(r1)
                java.lang.Class r1 = (java.lang.Class) r1
                return r1
        }

        public static java.lang.Class<?> getIntegralType(java.lang.Character r1) {
                java.util.Map<java.lang.String, java.lang.Class<?>> r0 = bsh.Types.Suffix.f925m
                java.lang.String r1 = toUpperKey(r1)
                java.lang.Object r1 = r0.get(r1)
                java.lang.Class r1 = (java.lang.Class) r1
                return r1
        }

        public static boolean isFloatingPoint(java.lang.Character r1) {
                java.util.Map<java.lang.String, java.lang.Class<?>> r0 = bsh.Types.Suffix.f925m
                java.lang.String r1 = toLowerKey(r1)
                boolean r1 = r0.containsKey(r1)
                return r1
        }

        public static boolean isIntegral(java.lang.Character r1) {
                java.util.Map<java.lang.String, java.lang.Class<?>> r0 = bsh.Types.Suffix.f925m
                java.lang.String r1 = toUpperKey(r1)
                boolean r1 = r0.containsKey(r1)
                return r1
        }

        private static java.lang.String toLowerKey(java.lang.Character r0) {
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r0.toLowerCase()
                return r0
        }

        private static java.lang.String toUpperKey(java.lang.Character r0) {
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r0.toUpperCase()
                return r0
        }
    }

    static {
            bsh.Types$1 r0 = new bsh.Types$1
            r0.<init>()
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            bsh.Types.NUMBER_ORDER = r0
            bsh.Primitive r0 = new bsh.Primitive
            r1 = 1
            r0.<init>(r1)
            bsh.Types.VALID_CAST = r0
            bsh.Primitive r0 = new bsh.Primitive
            r1 = -1
            r0.<init>(r1)
            bsh.Types.INVALID_CAST = r0
            return
    }

    public Types() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean areSignaturesEqual(java.lang.Class<?>[] r4, java.lang.Class<?>[] r5) {
            int r0 = r4.length
            int r1 = r5.length
            r2 = 0
            if (r0 == r1) goto L6
            return r2
        L6:
            r0 = r2
        L7:
            int r1 = r4.length
            if (r0 >= r1) goto L14
            r1 = r4[r0]
            r3 = r5[r0]
            if (r1 == r3) goto L11
            return r2
        L11:
            int r0 = r0 + 1
            goto L7
        L14:
            r4 = 1
            return r4
    }

    public static int arrayDimensions(java.lang.Class<?> r1) {
            if (r1 == 0) goto L16
            boolean r0 = r1.isArray()
            if (r0 != 0) goto L9
            goto L16
        L9:
            java.lang.String r1 = r1.getName()
            r0 = 91
            int r1 = r1.lastIndexOf(r0)
            int r1 = r1 + 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public static java.lang.Class<?> arrayElementType(java.lang.Class<?> r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r0 = r1.isArray()
            if (r0 == 0) goto Lf
            java.lang.Class r1 = r1.getComponentType()
            goto L4
        Lf:
            return r1
    }

    public static bsh.UtilEvalError castError(java.lang.Class<?> r0, java.lang.Class<?> r1, java.lang.Object r2, int r3) {
            java.lang.String r0 = bsh.StringUtil.typeString(r0)
            java.lang.String r1 = bsh.StringUtil.typeString(r1)
            bsh.UtilEvalError r0 = castError(r0, r1, r2, r3)
            return r0
    }

    public static bsh.UtilEvalError castError(java.lang.String r1, java.lang.String r2, int r3) {
            r0 = 0
            bsh.UtilEvalError r1 = castError(r1, r2, r0, r3)
            return r1
    }

    public static bsh.UtilEvalError castError(java.lang.String r6, java.lang.String r7, java.lang.Object r8, int r9) {
            r0 = 1
            java.lang.String r1 = " to "
            java.lang.String r2 = "\""
            java.lang.String r3 = " with value \""
            java.lang.String r4 = ""
            if (r9 != r0) goto L3a
            bsh.UtilEvalError r9 = new bsh.UtilEvalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "Cannot assign "
            r0.<init>(r5)
            r0.append(r7)
            if (r8 != 0) goto L1a
            goto L29
        L1a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r3)
            r7.append(r8)
            r7.append(r2)
            java.lang.String r4 = r7.toString()
        L29:
            r0.append(r4)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r9.<init>(r6)
            return r9
        L3a:
            java.lang.ClassCastException r9 = new java.lang.ClassCastException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "Cannot cast "
            r0.<init>(r5)
            r0.append(r7)
            if (r8 != 0) goto L49
            goto L58
        L49:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r3)
            r7.append(r8)
            r7.append(r2)
            java.lang.String r4 = r7.toString()
        L58:
            r0.append(r4)
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r9.<init>(r6)
            bsh.UtilTargetError r6 = new bsh.UtilTargetError
            r6.<init>(r9)
            return r6
    }

    public static java.lang.Object castObject(java.lang.Class<?> r3, java.lang.Class<?> r4, java.lang.Object r5, int r6, boolean r7) {
            if (r3 == 0) goto L167
            if (r3 != r4) goto L6
            goto L167
        L6:
            if (r4 == 0) goto L22
            boolean r0 = r4.isArray()
            if (r0 == 0) goto L22
            if (r6 == 0) goto L18
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto L22
        L18:
            if (r7 == 0) goto L1d
            bsh.Primitive r3 = bsh.Types.VALID_CAST
            return r3
        L1d:
            java.lang.Object r3 = bsh.BshArray.castArray(r3, r4, r5)
            return r3
        L22:
            boolean r0 = r3.isPrimitive()
            java.lang.String r1 = "[-+0-9.]*"
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r0 == 0) goto L7d
            if (r4 == r2) goto L6a
            if (r4 == 0) goto L6a
            boolean r0 = r4.isPrimitive()
            if (r0 == 0) goto L37
            goto L6a
        L37:
            boolean r0 = isNumeric(r4)
            if (r0 != 0) goto L47
            java.lang.String r0 = java.lang.String.valueOf(r5)
            boolean r0 = r0.matches(r1)
            if (r0 == 0) goto L4d
        L47:
            boolean r0 = isNumeric(r3)
            if (r0 != 0) goto L5c
        L4d:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r3 != r0) goto L52
            goto L5c
        L52:
            if (r7 == 0) goto L57
            bsh.Primitive r3 = bsh.Types.INVALID_CAST
            return r3
        L57:
            bsh.UtilEvalError r3 = castError(r3, r4, r5, r6)
            throw r3
        L5c:
            if (r7 == 0) goto L61
            bsh.Primitive r3 = bsh.Types.VALID_CAST
            return r3
        L61:
            java.lang.Object r4 = bsh.Primitive.castWrapper(r3, r5)
            java.lang.Object r3 = bsh.Primitive.wrap(r4, r3)
            return r3
        L6a:
            java.lang.Class<bsh.Primitive> r0 = bsh.Primitive.class
            boolean r0 = r0.isInstance(r5)
            if (r0 != 0) goto L76
            java.lang.Object r5 = bsh.Primitive.wrap(r5, r4)
        L76:
            bsh.Primitive r5 = (bsh.Primitive) r5
            bsh.Primitive r3 = bsh.Primitive.castPrimitive(r3, r4, r5, r7, r6)
            return r3
        L7d:
            if (r4 == r2) goto L123
            if (r4 == 0) goto L123
            boolean r0 = r4.isPrimitive()
            if (r0 != 0) goto L123
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r3 == r0) goto L123
            java.lang.String r0 = java.lang.String.valueOf(r5)
            boolean r0 = r0.matches(r1)
            if (r0 == 0) goto L9d
            boolean r0 = isNumeric(r3)
            if (r0 == 0) goto L9d
            goto L123
        L9d:
            boolean r0 = isFunctionalInterface(r3)
            if (r0 == 0) goto Lb3
            boolean r0 = r5 instanceof bsh.BshLambda
            if (r0 == 0) goto Lb3
            if (r7 == 0) goto Lac
            bsh.Primitive r3 = bsh.Types.VALID_CAST
            return r3
        Lac:
            bsh.BshLambda r5 = (bsh.BshLambda) r5
            java.lang.Object r3 = r5.convertTo(r3)
            return r3
        Lb3:
            boolean r0 = r3.isAssignableFrom(r4)
            if (r0 == 0) goto Ld3
            if (r7 == 0) goto Lbe
            bsh.Primitive r3 = bsh.Types.VALID_CAST
            return r3
        Lbe:
            boolean r6 = bsh.Reflect.isGeneratedClass(r3)
            if (r6 == 0) goto L16c
            boolean r4 = java.lang.reflect.Proxy.isProxyClass(r4)
            if (r4 != 0) goto L16c
            java.lang.String r3 = r3.getSimpleName()
            bsh.This r3 = bsh.Reflect.getClassInstanceThis(r5, r3)
            return r3
        Ld3:
            java.lang.Class<bsh.This> r0 = bsh.This.class
            boolean r1 = r0.isInstance(r5)
            if (r1 == 0) goto Leb
            r1 = r5
            bsh.This r1 = (bsh.This) r1
            bsh.NameSpace r1 = r1.getNameSpace()
            java.lang.Class<?> r1 = r1.classStatic
            if (r1 != r3) goto Leb
            if (r7 == 0) goto L16c
            bsh.Primitive r3 = bsh.Types.VALID_CAST
            return r3
        Leb:
            boolean r1 = r3.isInterface()
            if (r1 == 0) goto L103
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto L103
            if (r7 == 0) goto Lfc
            bsh.Primitive r3 = bsh.Types.VALID_CAST
            return r3
        Lfc:
            bsh.This r5 = (bsh.This) r5
            java.lang.Object r3 = r5.getInterface(r3)
            return r3
        L103:
            boolean r0 = bsh.Primitive.isWrapperType(r3)
            if (r0 == 0) goto L119
            boolean r0 = bsh.Primitive.isWrapperType(r4)
            if (r0 == 0) goto L119
            if (r7 == 0) goto L114
            bsh.Primitive r3 = bsh.Types.VALID_CAST
            return r3
        L114:
            java.lang.Object r3 = bsh.Primitive.castWrapper(r3, r5)
            return r3
        L119:
            if (r7 == 0) goto L11e
            bsh.Primitive r3 = bsh.Types.INVALID_CAST
            return r3
        L11e:
            bsh.UtilEvalError r3 = castError(r3, r4, r5, r6)
            throw r3
        L123:
            boolean r0 = bsh.Primitive.isWrapperType(r3)
            if (r0 == 0) goto L13b
            if (r4 == r2) goto L13b
            if (r4 == 0) goto L13b
            if (r7 == 0) goto L132
            bsh.Primitive r3 = bsh.Types.VALID_CAST
            return r3
        L132:
            java.lang.Class r3 = bsh.Primitive.unboxType(r3)
            java.lang.Object r3 = bsh.Primitive.castWrapper(r3, r5)
            return r3
        L13b:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r3 != r0) goto L14d
            if (r4 == r2) goto L14d
            if (r4 == 0) goto L14d
            if (r7 == 0) goto L148
            bsh.Primitive r3 = bsh.Types.VALID_CAST
            return r3
        L148:
            java.lang.Object r3 = bsh.Primitive.unwrap(r5)
            return r3
        L14d:
            if (r4 == 0) goto L160
            boolean r0 = r4.isPrimitive()
            if (r0 != 0) goto L160
            boolean r0 = r3.isAssignableFrom(r4)
            if (r0 == 0) goto L160
            if (r7 == 0) goto L16c
            bsh.Primitive r3 = bsh.Types.VALID_CAST
            return r3
        L160:
            bsh.Primitive r5 = (bsh.Primitive) r5
            bsh.Primitive r3 = bsh.Primitive.castPrimitive(r3, r4, r5, r7, r6)
            return r3
        L167:
            if (r7 == 0) goto L16c
            bsh.Primitive r3 = bsh.Types.VALID_CAST
            return r3
        L16c:
            return r5
    }

    public static java.lang.Object castObject(java.lang.Object r2, java.lang.Class<?> r3, int r4) {
            if (r2 != 0) goto L27
            if (r4 != 0) goto L18
            boolean r2 = isPrimitive(r3)
            if (r2 != 0) goto L13
            boolean r2 = bsh.Primitive.isWrapperType(r3)
            if (r2 != 0) goto L13
            bsh.Primitive r2 = bsh.Primitive.NULL
            return r2
        L13:
            bsh.Primitive r2 = bsh.Primitive.getDefaultValue(r3)
            return r2
        L18:
            java.lang.String r2 = r3.getSimpleName()
            java.lang.String r3 = "Cast error: null fromValue for toType: "
            java.lang.String r2 = r3.concat(r2)
            bsh.j.f(r2)
            r2 = 0
            return r2
        L27:
            java.lang.Class r0 = getType(r2)
            r1 = 0
            java.lang.Object r2 = castObject(r3, r0, r2, r4, r1)
            return r2
    }

    public static java.lang.reflect.ParameterizedType createParameterizedType(java.lang.reflect.Type r1, java.lang.reflect.Type[] r2) {
            bsh.Types$2 r0 = new bsh.Types$2
            r0.<init>(r2, r1)
            return r0
    }

    public static java.lang.String getASMClassSignature(java.lang.reflect.TypeVariable<?>[] r9, java.lang.reflect.Type r10, java.lang.reflect.Type... r11) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r9.length
            r2 = 0
            if (r1 == 0) goto L3c
            java.lang.String r1 = "<"
            r0.append(r1)
            int r1 = r9.length
            r3 = r2
        L10:
            if (r3 >= r1) goto L37
            r4 = r9[r3]
            java.lang.String r5 = r4.getName()
            r0.append(r5)
            java.lang.reflect.Type[] r4 = r4.getBounds()
            int r5 = r4.length
            r6 = r2
        L21:
            if (r6 >= r5) goto L34
            r7 = r4[r6]
            java.lang.String r8 = ":"
            r0.append(r8)
            java.lang.String r7 = getASMSignature(r7)
            r0.append(r7)
            int r6 = r6 + 1
            goto L21
        L34:
            int r3 = r3 + 1
            goto L10
        L37:
            java.lang.String r9 = ">"
            r0.append(r9)
        L3c:
            java.lang.String r9 = getASMSignature(r10)
            r0.append(r9)
            int r9 = r11.length
        L44:
            if (r2 >= r9) goto L52
            r10 = r11[r2]
            java.lang.String r10 = getASMSignature(r10)
            r0.append(r10)
            int r2 = r2 + 1
            goto L44
        L52:
            java.lang.String r9 = r0.toString()
            return r9
    }

    public static java.lang.String getASMMethodSignature(java.lang.reflect.Method r3) {
            java.lang.reflect.TypeVariable[] r0 = r3.getTypeParameters()
            java.lang.reflect.Type[] r1 = r3.getGenericParameterTypes()
            java.lang.reflect.Type r2 = r3.getGenericReturnType()
            java.lang.reflect.Type[] r3 = r3.getGenericExceptionTypes()
            java.lang.String r3 = getASMMethodSignature(r0, r1, r2, r3)
            return r3
    }

    public static java.lang.String getASMMethodSignature(java.lang.reflect.TypeVariable<?>[] r9, java.lang.reflect.Type[] r10, java.lang.reflect.Type r11, java.lang.reflect.Type[] r12) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r9.length
            r2 = 0
            if (r1 <= 0) goto L3c
            java.lang.String r1 = "<"
            r0.append(r1)
            int r1 = r9.length
            r3 = r2
        L10:
            if (r3 >= r1) goto L37
            r4 = r9[r3]
            java.lang.String r5 = r4.getName()
            r0.append(r5)
            java.lang.reflect.Type[] r4 = r4.getBounds()
            int r5 = r4.length
            r6 = r2
        L21:
            if (r6 >= r5) goto L34
            r7 = r4[r6]
            java.lang.String r8 = ":"
            r0.append(r8)
            java.lang.String r7 = getASMSignature(r7)
            r0.append(r7)
            int r6 = r6 + 1
            goto L21
        L34:
            int r3 = r3 + 1
            goto L10
        L37:
            java.lang.String r9 = ">"
            r0.append(r9)
        L3c:
            java.lang.String r9 = "("
            r0.append(r9)
            int r9 = r10.length
            r1 = r2
        L43:
            if (r1 >= r9) goto L51
            r3 = r10[r1]
            java.lang.String r3 = getASMSignature(r3)
            r0.append(r3)
            int r1 = r1 + 1
            goto L43
        L51:
            java.lang.String r9 = ")"
            r0.append(r9)
            java.lang.String r9 = getASMSignature(r11)
            r0.append(r9)
            int r9 = r12.length
        L5e:
            if (r2 >= r9) goto L71
            r10 = r12[r2]
            java.lang.String r11 = "^"
            r0.append(r11)
            java.lang.String r10 = getASMSignature(r10)
            r0.append(r10)
            int r2 = r2 + 1
            goto L5e
        L71:
            java.lang.String r9 = r0.toString()
            return r9
    }

    public static java.lang.String getASMSignature(java.lang.reflect.Type r4) {
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r4 = bsh.org.objectweb.asm.Type.getDescriptor(r4)
            return r4
        Lb:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            r1 = 0
            if (r0 == 0) goto L54
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "L"
            r2.<init>(r3)
            java.lang.reflect.Type r3 = r4.getRawType()
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.String r3 = bsh.org.objectweb.asm.Type.getInternalName(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r2 = "<"
            r0.append(r2)
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            int r2 = r4.length
        L3c:
            if (r1 >= r2) goto L4a
            r3 = r4[r1]
            java.lang.String r3 = getASMSignature(r3)
            r0.append(r3)
            int r1 = r1 + 1
            goto L3c
        L4a:
            java.lang.String r4 = ">;"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L54:
            boolean r0 = r4 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L72
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "T"
            r0.<init>(r1)
            java.lang.reflect.TypeVariable r4 = (java.lang.reflect.TypeVariable) r4
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            java.lang.String r4 = ";"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        L72:
            boolean r0 = r4 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto Lb1
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r0 = r4.getLowerBounds()
            int r2 = r0.length
            if (r2 <= 0) goto L96
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "-"
            r4.<init>(r2)
            r0 = r0[r1]
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.String r0 = bsh.org.objectweb.asm.Type.getDescriptor(r0)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L96:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "+"
            r0.<init>(r2)
            java.lang.reflect.Type[] r4 = r4.getUpperBounds()
            r4 = r4[r1]
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r4 = bsh.org.objectweb.asm.Type.getDescriptor(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
        Lb1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Can't get the signature of this type because its Class is unknown: "
            r1.<init>(r2)
            if (r4 == 0) goto Lc1
            java.lang.Class r4 = r4.getClass()
            goto Lc2
        Lc1:
            r4 = 0
        Lc2:
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public static bsh.org.objectweb.asm.Type getASMType(java.lang.Class<?> r0) {
            bsh.org.objectweb.asm.Type r0 = bsh.org.objectweb.asm.Type.getType(r0)
            return r0
    }

    public static java.lang.String getBaseName(java.lang.String r2) {
            java.lang.String r0 = "$"
            int r0 = r2.lastIndexOf(r0)
            r1 = -1
            if (r0 != r1) goto La
            return r2
        La:
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)
            return r2
    }

    public static java.lang.Class<?> getCommonType(java.lang.Class<?> r2, java.lang.Class<?> r3) {
            if (r2 != 0) goto L3
            goto L31
        L3:
            if (r3 == 0) goto L44
            boolean r0 = r2.isAssignableFrom(r3)
            if (r0 == 0) goto Lc
            goto L44
        Lc:
            java.util.Map<java.lang.Class<?>, java.lang.Integer> r0 = bsh.Types.NUMBER_ORDER
            boolean r1 = r0.containsKey(r2)
            if (r1 == 0) goto L32
            boolean r1 = r0.containsKey(r3)
            if (r1 == 0) goto L32
            java.lang.Object r1 = r0.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r1 < r0) goto L31
            return r2
        L31:
            return r3
        L32:
            java.lang.Class r2 = r2.getSuperclass()
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r2 == 0) goto L43
            if (r0 == r2) goto L43
            boolean r0 = r2.isAssignableFrom(r3)
            if (r0 == 0) goto L32
            return r2
        L43:
            return r0
        L44:
            return r2
    }

    public static java.lang.String getDescriptor(java.lang.Class<?> r0) {
            java.lang.String r0 = bsh.org.objectweb.asm.Type.getDescriptor(r0)
            return r0
    }

    public static java.lang.String getInternalName(java.lang.Class<?> r0) {
            java.lang.String r0 = bsh.org.objectweb.asm.Type.getInternalName(r0)
            return r0
    }

    public static java.lang.String[] getInternalNames(java.lang.Class<?>[] r3) {
            int r0 = r3.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            java.lang.String r2 = bsh.org.objectweb.asm.Type.getInternalName(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }

    public static java.lang.String getMethodDescriptor(java.lang.Class<?> r3, java.lang.Class<?>... r4) {
            int r0 = r4.length
            bsh.org.objectweb.asm.Type[] r0 = new bsh.org.objectweb.asm.Type[r0]
            r1 = 0
        L4:
            int r2 = r4.length
            if (r1 >= r2) goto L12
            r2 = r4[r1]
            bsh.org.objectweb.asm.Type r2 = bsh.org.objectweb.asm.Type.getType(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            bsh.org.objectweb.asm.Type r3 = bsh.org.objectweb.asm.Type.getType(r3)
            java.lang.String r3 = bsh.org.objectweb.asm.Type.getMethodDescriptor(r3, r0)
            return r3
    }

    public static java.lang.String getMethodDescriptor(java.lang.reflect.Method r0) {
            java.lang.String r0 = bsh.org.objectweb.asm.Type.getMethodDescriptor(r0)
            return r0
    }

    public static java.lang.Class<?> getType(byte r0) {
            java.lang.Class r0 = java.lang.Byte.TYPE
            return r0
    }

    public static java.lang.Class<?> getType(char r0) {
            java.lang.Class r0 = java.lang.Character.TYPE
            return r0
    }

    public static java.lang.Class<?> getType(double r0) {
            java.lang.Class r0 = java.lang.Double.TYPE
            return r0
    }

    public static java.lang.Class<?> getType(float r0) {
            java.lang.Class r0 = java.lang.Float.TYPE
            return r0
    }

    public static java.lang.Class<?> getType(int r0) {
            java.lang.Class r0 = java.lang.Integer.TYPE
            return r0
    }

    public static java.lang.Class<?> getType(long r0) {
            java.lang.Class r0 = java.lang.Long.TYPE
            return r0
    }

    public static java.lang.Class<?> getType(java.lang.Object r1) {
            r0 = 0
            java.lang.Class r1 = getType(r1, r0)
            return r1
    }

    public static java.lang.Class<?> getType(java.lang.Object r1, boolean r2) {
            if (r1 == 0) goto L26
            bsh.Primitive r0 = bsh.Primitive.NULL
            if (r0 != r1) goto L7
            goto L26
        L7:
            boolean r0 = r1 instanceof bsh.Primitive
            if (r0 == 0) goto L14
            if (r2 != 0) goto L14
            bsh.Primitive r1 = (bsh.Primitive) r1
            java.lang.Class r1 = r1.getType()
            return r1
        L14:
            boolean r2 = r1 instanceof bsh.BshLambda
            if (r2 == 0) goto L1d
            bsh.BshLambda r1 = (bsh.BshLambda) r1
            java.lang.Class<?> r1 = r1.dummyType
            return r1
        L1d:
            java.lang.Object r1 = bsh.Primitive.unwrap(r1)
            java.lang.Class r1 = r1.getClass()
            return r1
        L26:
            r1 = 0
            return r1
    }

    public static java.lang.Class<?> getType(short r0) {
            java.lang.Class r0 = java.lang.Short.TYPE
            return r0
    }

    public static java.lang.Class<?> getType(boolean r0) {
            java.lang.Class r0 = java.lang.Boolean.TYPE
            return r0
    }

    public static java.lang.Class<?>[] getTypes(java.lang.Object[] r3) {
            if (r3 != 0) goto L5
            java.lang.Class<?>[] r3 = bsh.Reflect.ZERO_TYPES
            return r3
        L5:
            int r0 = r3.length
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
        L9:
            int r2 = r3.length
            if (r1 >= r2) goto L17
            r2 = r3[r1]
            java.lang.Class r2 = getType(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L9
        L17:
            return r0
    }

    public static boolean isAssignable(java.lang.Class<?> r2, java.lang.Class<?> r3, int r4) {
            boolean r0 = isFunctionalInterface(r3)
            r1 = 1
            if (r0 == 0) goto Le
            boolean r0 = bsh.BshLambda.isAssignable(r2, r3, r4)
            if (r0 == 0) goto Le
            return r1
        Le:
            if (r4 == r1) goto L2c
            r0 = 2
            if (r4 == r0) goto L27
            r0 = 3
            if (r4 == r0) goto L25
            r0 = 4
            if (r4 != r0) goto L1e
            boolean r2 = isBshAssignable(r3, r2)
            return r2
        L1e:
            java.lang.String r2 = "bad case"
            bsh.j.f(r2)
            r2 = 0
            return r2
        L25:
            r2 = 0
            return r2
        L27:
            boolean r2 = isJavaBoxTypesAssignable(r3, r2)
            return r2
        L2c:
            boolean r2 = isJavaBaseAssignable(r3, r2)
            return r2
    }

    public static boolean isAssignable(java.lang.Class<?> r6, java.lang.reflect.Type r7, int r8) {
            boolean r0 = r7 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r7 = (java.lang.Class) r7
            boolean r6 = isAssignable(r6, r7, r8)
            return r6
        Lb:
            boolean r0 = r7 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L1a
            java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7
            java.lang.reflect.Type r7 = r7.getRawType()
            boolean r6 = isAssignable(r6, r7, r8)
            return r6
        L1a:
            boolean r0 = r7 instanceof java.lang.reflect.TypeVariable
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L37
            java.lang.reflect.TypeVariable r7 = (java.lang.reflect.TypeVariable) r7
            java.lang.reflect.Type[] r7 = r7.getBounds()
            int r0 = r7.length
            r3 = r2
        L28:
            if (r3 >= r0) goto L36
            r4 = r7[r3]
            boolean r4 = isAssignable(r6, r4, r8)
            if (r4 != 0) goto L33
            return r2
        L33:
            int r3 = r3 + 1
            goto L28
        L36:
            return r1
        L37:
            boolean r0 = r7 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L66
            java.lang.reflect.WildcardType r7 = (java.lang.reflect.WildcardType) r7
            java.lang.reflect.Type[] r0 = r7.getUpperBounds()
            int r3 = r0.length
            r4 = r2
        L43:
            if (r4 >= r3) goto L51
            r5 = r0[r4]
            boolean r5 = isAssignable(r6, r5, r8)
            if (r5 != 0) goto L4e
            return r2
        L4e:
            int r4 = r4 + 1
            goto L43
        L51:
            java.lang.reflect.Type[] r7 = r7.getLowerBounds()
            int r0 = r7.length
            r3 = r2
        L57:
            if (r3 >= r0) goto L65
            r4 = r7[r3]
            boolean r4 = isAssignable(r4, r6, r8)
            if (r4 != 0) goto L62
            return r2
        L62:
            int r3 = r3 + 1
            goto L57
        L65:
            return r1
        L66:
            if (r7 != 0) goto L69
            return r1
        L69:
            return r2
    }

    public static boolean isAssignable(java.lang.reflect.Type r6, java.lang.Class<?> r7, int r8) {
            boolean r0 = r6 instanceof java.lang.Class
            if (r0 == 0) goto L9
            boolean r6 = isAssignable(r6, r7, r8)
            return r6
        L9:
            boolean r0 = r6 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L18
            java.lang.reflect.ParameterizedType r6 = (java.lang.reflect.ParameterizedType) r6
            java.lang.reflect.Type r6 = r6.getRawType()
            boolean r6 = isAssignable(r6, r7, r8)
            return r6
        L18:
            boolean r0 = r6 instanceof java.lang.reflect.TypeVariable
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L35
            java.lang.reflect.TypeVariable r6 = (java.lang.reflect.TypeVariable) r6
            java.lang.reflect.Type[] r6 = r6.getBounds()
            int r0 = r6.length
            r3 = r2
        L26:
            if (r3 >= r0) goto L34
            r4 = r6[r3]
            boolean r4 = isAssignable(r4, r7, r8)
            if (r4 != 0) goto L31
            return r2
        L31:
            int r3 = r3 + 1
            goto L26
        L34:
            return r1
        L35:
            boolean r0 = r6 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L64
            java.lang.reflect.WildcardType r6 = (java.lang.reflect.WildcardType) r6
            java.lang.reflect.Type[] r0 = r6.getUpperBounds()
            int r3 = r0.length
            r4 = r2
        L41:
            if (r4 >= r3) goto L4f
            r5 = r0[r4]
            boolean r5 = isAssignable(r5, r7, r8)
            if (r5 != 0) goto L4c
            return r2
        L4c:
            int r4 = r4 + 1
            goto L41
        L4f:
            java.lang.reflect.Type[] r6 = r6.getLowerBounds()
            int r0 = r6.length
            r3 = r2
        L55:
            if (r3 >= r0) goto L63
            r4 = r6[r3]
            boolean r4 = isAssignable(r7, r4, r8)
            if (r4 != 0) goto L60
            return r2
        L60:
            int r3 = r3 + 1
            goto L55
        L63:
            return r1
        L64:
            if (r7 != 0) goto L67
            return r1
        L67:
            return r2
    }

    public static boolean isBshAssignable(java.lang.Class<?> r2, java.lang.Class<?> r3) {
            r0 = 0
            r1 = 1
            java.lang.Object r2 = castObject(r2, r3, r0, r1, r1)     // Catch: bsh.UtilEvalError -> Ld
            bsh.Primitive r3 = bsh.Types.VALID_CAST     // Catch: bsh.UtilEvalError -> Ld
            if (r2 != r3) goto Lb
            return r1
        Lb:
            r2 = 0
            return r2
        Ld:
            r2 = move-exception
            java.lang.String r3 = "err in cast check: "
            bsh.j.d(r3, r2)
            r2 = 0
            return r2
    }

    public static boolean isCollectionType(java.lang.Class<?> r1) {
            java.lang.Class<java.util.Collection> r0 = java.util.Collection.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L1b
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L1b
            java.lang.Class<java.util.Map$Entry> r0 = java.util.Map.Entry.class
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r1 = 0
            return r1
        L1b:
            r1 = 1
            return r1
    }

    public static boolean isFloatingpoint(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 != 0) goto Lf
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 != 0) goto Lf
            boolean r1 = r1 instanceof java.math.BigDecimal
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public static boolean isFunctionalInterface(java.lang.Class<?> r7) {
            r0 = 0
            if (r7 == 0) goto L47
            boolean r1 = r7.isInterface()
            if (r1 != 0) goto La
            goto L47
        La:
            java.lang.Class<java.lang.FunctionalInterface> r1 = java.lang.FunctionalInterface.class
            java.lang.annotation.Annotation r1 = r7.getAnnotation(r1)
            r2 = 1
            if (r1 == 0) goto L14
            return r2
        L14:
            java.lang.reflect.Method[] r7 = r7.getMethods()
            int r1 = r7.length
            r3 = r0
            r4 = r3
        L1b:
            if (r3 >= r1) goto L44
            r5 = r7[r3]
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isAbstract(r6)
            if (r6 == 0) goto L41
            boolean r6 = r5.isBridge()
            if (r6 != 0) goto L41
            boolean r6 = r5.isSynthetic()
            if (r6 != 0) goto L41
            boolean r5 = isObjectClassMethod(r5)
            if (r5 != 0) goto L41
            int r5 = r4 + 1
            if (r4 <= r2) goto L40
            return r0
        L40:
            r4 = r5
        L41:
            int r3 = r3 + 1
            goto L1b
        L44:
            if (r4 != r2) goto L47
            return r2
        L47:
            return r0
    }

    public static boolean isJavaAssignable(java.lang.Class<?> r1, java.lang.Class<?> r2) {
            boolean r0 = isJavaBaseAssignable(r1, r2)
            if (r0 != 0) goto Lf
            boolean r1 = isJavaBoxTypesAssignable(r1, r2)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public static boolean isJavaBaseAssignable(java.lang.Class<?> r4, java.lang.Class<?> r5) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r5 != 0) goto Ld
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r4 != r5) goto Lc
            return r1
        Lc:
            return r0
        Ld:
            boolean r2 = r4.isPrimitive()
            if (r2 == 0) goto L42
            boolean r2 = r5.isPrimitive()
            if (r2 == 0) goto L42
            if (r4 != r5) goto L1c
            return r1
        L1c:
            java.util.Map<java.lang.Class<?>, java.lang.Integer> r2 = bsh.Types.NUMBER_ORDER
            boolean r3 = r2.containsKey(r5)
            if (r3 == 0) goto L58
            boolean r3 = r2.containsKey(r4)
            if (r3 == 0) goto L58
            java.lang.Object r5 = r2.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r4 = r2.get(r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r5 >= r4) goto L41
            return r1
        L41:
            return r0
        L42:
            java.lang.Class<java.math.BigInteger> r2 = java.math.BigInteger.class
            if (r4 == r2) goto L4a
            java.lang.Class<java.math.BigDecimal> r2 = java.math.BigDecimal.class
            if (r4 != r2) goto L51
        L4a:
            boolean r2 = isNumeric(r5)
            if (r2 == 0) goto L51
            return r1
        L51:
            boolean r4 = r4.isAssignableFrom(r5)
            if (r4 == 0) goto L58
            return r1
        L58:
            return r0
    }

    public static boolean isJavaBoxTypesAssignable(java.lang.Class<?> r3, java.lang.Class<?> r4) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = 1
            if (r3 != r1) goto La
            return r2
        La:
            if (r4 != 0) goto L1a
            boolean r4 = r3.isPrimitive()
            if (r4 != 0) goto L19
            boolean r3 = r3.isArray()
            if (r3 != 0) goto L19
            return r2
        L19:
            return r0
        L1a:
            java.lang.Class<java.lang.Number> r0 = java.lang.Number.class
            if (r3 != r0) goto L27
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r4 == r0) goto L27
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r4 == r0) goto L27
            return r2
        L27:
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = bsh.Primitive.wrapperMap
            java.lang.Object r0 = r0.get(r3)
            if (r0 != r4) goto L30
            return r2
        L30:
            boolean r3 = isJavaBaseAssignable(r3, r4)
            return r3
    }

    public static boolean isNumeric(java.lang.Class<?> r2) {
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto Lb
            java.lang.Class r0 = bsh.Primitive.boxType(r2)
            goto Lc
        Lb:
            r0 = r2
        Lc:
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 != 0) goto L29
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L1e
            java.lang.Class r2 = bsh.Primitive.boxType(r2)
        L1e:
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            boolean r2 = r0.isAssignableFrom(r2)
            if (r2 == 0) goto L27
            goto L29
        L27:
            r2 = 0
            return r2
        L29:
            r2 = 1
            return r2
    }

    public static boolean isNumeric(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 != 0) goto Lb
            boolean r1 = r1 instanceof java.lang.Character
            if (r1 == 0) goto L9
            goto Lb
        L9:
            r1 = 0
            return r1
        Lb:
            r1 = 1
            return r1
    }

    public static boolean isObjectClassMethod(java.lang.reflect.Method r2) {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = r2.getName()     // Catch: java.lang.NoSuchMethodException -> Lf
            java.lang.Class[] r2 = r2.getParameterTypes()     // Catch: java.lang.NoSuchMethodException -> Lf
            r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> Lf
            r2 = 1
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public static boolean isPrimitive(java.lang.Class<?> r1) {
            boolean r0 = r1.isPrimitive()
            if (r0 != 0) goto L11
            java.lang.Class<java.math.BigInteger> r0 = java.math.BigInteger.class
            if (r1 == r0) goto L11
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            if (r1 != r0) goto Lf
            goto L11
        Lf:
            r1 = 0
            return r1
        L11:
            r1 = 1
            return r1
    }

    public static boolean isPropertyType(java.lang.Class<?> r1) {
            boolean r0 = isPropertyTypeMap(r1)
            if (r0 != 0) goto L15
            boolean r0 = isPropertyTypeEntry(r1)
            if (r0 != 0) goto L15
            boolean r1 = isPropertyTypeEntryList(r1)
            if (r1 == 0) goto L13
            goto L15
        L13:
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    public static boolean isPropertyTypeEntry(java.lang.Class<?> r1) {
            java.lang.Class<java.util.Map$Entry> r0 = java.util.Map.Entry.class
            boolean r1 = r0.isAssignableFrom(r1)
            return r1
    }

    public static boolean isPropertyTypeEntry(java.lang.Object r0) {
            boolean r0 = r0 instanceof java.util.Map.Entry
            return r0
    }

    public static boolean isPropertyTypeEntryList(java.lang.Class<?> r1) {
            boolean r0 = r1.isArray()
            if (r0 == 0) goto L12
            java.lang.Class r1 = r1.getComponentType()
            boolean r1 = isPropertyTypeEntry(r1)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public static boolean isPropertyTypeMap(java.lang.Class<?> r1) {
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r1 = r0.isAssignableFrom(r1)
            return r1
    }

    public static boolean isPropertyTypeMap(java.lang.Object r0) {
            boolean r0 = r0 instanceof java.util.Map
            return r0
    }

    public static boolean isSignatureAssignable(java.lang.Class<?>[] r4, java.lang.Class<?>[] r5, int r6) {
            r0 = 3
            r1 = 0
            if (r6 == r0) goto L9
            int r0 = r4.length
            int r2 = r5.length
            if (r0 == r2) goto L9
            return r1
        L9:
            r0 = r1
        La:
            int r2 = r4.length
            if (r0 >= r2) goto L1b
            r2 = r4[r0]
            r3 = r5[r0]
            boolean r2 = isAssignable(r2, r3, r6)
            if (r2 != 0) goto L18
            return r1
        L18:
            int r0 = r0 + 1
            goto La
        L1b:
            r4 = 1
            return r4
    }

    public static boolean isSignatureAssignable(java.lang.Class<?>[] r4, java.lang.reflect.Type[] r5, int r6) {
            r0 = 3
            r1 = 0
            if (r6 == r0) goto L9
            int r0 = r4.length
            int r2 = r5.length
            if (r0 == r2) goto L9
            return r1
        L9:
            r0 = r1
        La:
            int r2 = r4.length
            if (r0 >= r2) goto L1b
            r2 = r4[r0]
            r3 = r5[r0]
            boolean r2 = isAssignable(r2, r3, r6)
            if (r2 != 0) goto L18
            return r1
        L18:
            int r0 = r0 + 1
            goto La
        L1b:
            r4 = 1
            return r4
    }

    public static java.lang.String prettyName(java.lang.Class<?> r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = "null"
            return r2
        L5:
            boolean r0 = r2.isArray()
            if (r0 != 0) goto L10
            java.lang.String r2 = r2.getName()
            return r2
        L10:
            java.lang.Class r2 = r2.getComponentType()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = prettyName(r2)
            java.lang.String r1 = "[]"
            java.lang.String r2 = eh.a.r(r0, r2, r1)
            return r2
    }

    public static java.lang.String prettyName(java.lang.reflect.Type r1) {
            r0 = 1
            java.lang.String r1 = prettyName(r1, r0)
            return r1
    }

    private static java.lang.String prettyName(java.lang.reflect.Type r5, boolean r6) {
            boolean r0 = r5 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r5 = (java.lang.Class) r5
            java.lang.String r5 = prettyName(r5)
            return r5
        Lb:
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            r1 = 0
            if (r0 == 0) goto L3f
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type[] r6 = r5.getActualTypeArguments()
            int r0 = r6.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r2 = r1
        L1a:
            int r3 = r6.length
            if (r2 >= r3) goto L28
            r3 = r6[r2]
            java.lang.String r3 = prettyName(r3, r1)
            r0[r2] = r3
            int r2 = r2 + 1
            goto L1a
        L28:
            java.lang.reflect.Type r5 = r5.getRawType()
            java.lang.String r5 = prettyName(r5)
            java.lang.String r6 = ", "
            java.lang.String r6 = java.lang.String.join(r6, r0)
            java.lang.String r0 = "<"
            java.lang.String r1 = ">"
            java.lang.String r5 = wb.en.i(r5, r0, r6, r1)
            return r5
        L3f:
            boolean r0 = r5 instanceof java.lang.reflect.TypeVariable
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r3 = " & "
            if (r0 == 0) goto L7d
            java.lang.reflect.TypeVariable r5 = (java.lang.reflect.TypeVariable) r5
            java.lang.reflect.Type[] r0 = r5.getBounds()
            if (r6 == 0) goto L78
            int r6 = r0.length
            r4 = 1
            if (r6 != r4) goto L58
            r6 = r0[r1]
            if (r6 != r2) goto L58
            goto L78
        L58:
            int r6 = r0.length
            java.lang.String[] r6 = new java.lang.String[r6]
        L5b:
            int r2 = r0.length
            if (r1 >= r2) goto L69
            r2 = r0[r1]
            java.lang.String r2 = prettyName(r2)
            r6[r1] = r2
            int r1 = r1 + 1
            goto L5b
        L69:
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = java.lang.String.join(r3, r6)
            java.lang.String r0 = " extends "
            java.lang.String r5 = wb.en.h(r5, r0, r6)
            return r5
        L78:
            java.lang.String r5 = r5.getName()
            return r5
        L7d:
            boolean r6 = r5 instanceof java.lang.reflect.WildcardType
            if (r6 == 0) goto Lcd
            java.lang.reflect.WildcardType r5 = (java.lang.reflect.WildcardType) r5
            java.lang.reflect.Type[] r6 = r5.getUpperBounds()
            r0 = r6[r1]
            if (r0 == r2) goto La7
            int r5 = r6.length
            java.lang.String[] r5 = new java.lang.String[r5]
        L8e:
            int r0 = r6.length
            if (r1 >= r0) goto L9c
            r0 = r6[r1]
            java.lang.String r0 = prettyName(r0)
            r5[r1] = r0
            int r1 = r1 + 1
            goto L8e
        L9c:
            java.lang.String r5 = java.lang.String.join(r3, r5)
            java.lang.String r6 = "? extends "
            java.lang.String r5 = wb.en.g(r6, r5)
            return r5
        La7:
            java.lang.reflect.Type[] r5 = r5.getLowerBounds()
            int r6 = r5.length
            if (r6 == 0) goto Lca
            int r6 = r5.length
            java.lang.String[] r6 = new java.lang.String[r6]
        Lb1:
            int r0 = r5.length
            if (r1 >= r0) goto Lbf
            r0 = r5[r1]
            java.lang.String r0 = prettyName(r0)
            r6[r1] = r0
            int r1 = r1 + 1
            goto Lb1
        Lbf:
            java.lang.String r5 = java.lang.String.join(r3, r6)
            java.lang.String r6 = "? super "
            java.lang.String r5 = wb.en.g(r6, r5)
            return r5
        Lca:
            java.lang.String r5 = "?"
            return r5
        Lcd:
            if (r5 != 0) goto Ld2
            java.lang.String r5 = "null"
            return r5
        Ld2:
            java.lang.String r5 = "Can't return a pretty name because the type is unknown!"
            bsh.j.g(r5)
            r5 = 0
            return r5
    }

    public static java.lang.String[] prettyNames(java.lang.reflect.Type[] r3) {
            int r0 = r3.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        L4:
            int r2 = r3.length
            if (r1 >= r2) goto L12
            r2 = r3[r1]
            java.lang.String r2 = prettyName(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L12:
            return r0
    }
}
