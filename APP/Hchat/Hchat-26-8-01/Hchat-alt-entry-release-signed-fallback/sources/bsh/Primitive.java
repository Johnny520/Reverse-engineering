package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Primitive implements java.io.Serializable {
    public static final bsh.Primitive FALSE = null;
    private static final java.math.BigInteger INTEGER_MAX = null;
    private static final java.math.BigInteger INTEGER_MIN = null;
    static final java.math.BigInteger LONG_MAX = null;
    static final java.math.BigInteger LONG_MIN = null;
    public static final bsh.Primitive NULL = null;
    public static final bsh.Primitive TRUE = null;
    public static final bsh.Primitive VOID = null;
    public static final bsh.Primitive ZERO_BIG_DECIMAL = null;
    public static final bsh.Primitive ZERO_BIG_INTEGER = null;
    public static final bsh.Primitive ZERO_BYTE = null;
    public static final bsh.Primitive ZERO_CHAR = null;
    public static final bsh.Primitive ZERO_DOUBLE = null;
    public static final bsh.Primitive ZERO_FLOAT = null;
    public static final bsh.Primitive ZERO_INT = null;
    public static final bsh.Primitive ZERO_LONG = null;
    public static final bsh.Primitive ZERO_SHORT = null;
    private static final long serialVersionUID = 1;
    static final java.util.Map<java.lang.Class<?>, java.lang.Class<?>> wrapperMap = null;
    private java.lang.Object value;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public enum Special extends java.lang.Enum<bsh.Primitive.Special> {
        private static final /* synthetic */ bsh.Primitive.Special[] $VALUES = null;
        public static final bsh.Primitive.Special NULL_VALUE = null;
        public static final bsh.Primitive.Special VOID_TYPE = null;

        private static /* synthetic */ bsh.Primitive.Special[] $values() {
                bsh.Primitive$Special r0 = bsh.Primitive.Special.NULL_VALUE
                bsh.Primitive$Special r1 = bsh.Primitive.Special.VOID_TYPE
                bsh.Primitive$Special[] r0 = new bsh.Primitive.Special[]{r0, r1}
                return r0
        }

        static {
                bsh.Primitive$Special r0 = new bsh.Primitive$Special
                java.lang.String r1 = "NULL_VALUE"
                r2 = 0
                r0.<init>(r1, r2)
                bsh.Primitive.Special.NULL_VALUE = r0
                bsh.Primitive$Special r0 = new bsh.Primitive$Special
                java.lang.String r1 = "VOID_TYPE"
                r2 = 1
                r0.<init>(r1, r2)
                bsh.Primitive.Special.VOID_TYPE = r0
                bsh.Primitive$Special[] r0 = $values()
                bsh.Primitive.Special.$VALUES = r0
                return
        }

        Special(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static bsh.Primitive.Special valueOf(java.lang.String r1) {
                java.lang.Class<bsh.Primitive$Special> r0 = bsh.Primitive.Special.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                bsh.Primitive$Special r1 = (bsh.Primitive.Special) r1
                return r1
        }

        public static bsh.Primitive.Special[] values() {
                bsh.Primitive$Special[] r0 = bsh.Primitive.Special.$VALUES
                java.lang.Object r0 = r0.clone()
                bsh.Primitive$Special[] r0 = (bsh.Primitive.Special[]) r0
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            bsh.Primitive.wrapperMap = r0
            java.lang.Class r1 = java.lang.Void.TYPE
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            r0.put(r1, r2)
            java.lang.Class r3 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            r0.put(r3, r4)
            java.lang.Class r5 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r6 = java.lang.Byte.class
            r0.put(r5, r6)
            java.lang.Class r7 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r8 = java.lang.Short.class
            r0.put(r7, r8)
            java.lang.Class r9 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Character> r10 = java.lang.Character.class
            r0.put(r9, r10)
            java.lang.Class r11 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r12 = java.lang.Integer.class
            r0.put(r11, r12)
            java.lang.Class r13 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r14 = java.lang.Long.class
            r0.put(r13, r14)
            java.lang.Class r15 = java.lang.Float.TYPE
            r16 = r13
            java.lang.Class<java.lang.Float> r13 = java.lang.Float.class
            r0.put(r15, r13)
            r17 = r13
            java.lang.Class r13 = java.lang.Double.TYPE
            r18 = r15
            java.lang.Class<java.lang.Double> r15 = java.lang.Double.class
            r0.put(r13, r15)
            r0.put(r2, r1)
            r0.put(r4, r3)
            r0.put(r6, r5)
            r0.put(r8, r7)
            r0.put(r10, r9)
            r0.put(r12, r11)
            r1 = r16
            r0.put(r14, r1)
            r2 = r17
            r1 = r18
            r0.put(r2, r1)
            r0.put(r15, r13)
            java.lang.Class<java.math.BigInteger> r1 = java.math.BigInteger.class
            r0.put(r1, r1)
            java.lang.Class<java.math.BigDecimal> r1 = java.math.BigDecimal.class
            r0.put(r1, r1)
            bsh.Primitive r0 = new bsh.Primitive
            r1 = 1
            r0.<init>(r1)
            bsh.Primitive.TRUE = r0
            bsh.Primitive r0 = new bsh.Primitive
            r1 = 0
            r0.<init>(r1)
            bsh.Primitive.FALSE = r0
            bsh.Primitive r0 = new bsh.Primitive
            r0.<init>(r1)
            bsh.Primitive.ZERO_CHAR = r0
            bsh.Primitive r0 = new bsh.Primitive
            r0.<init>(r1)
            bsh.Primitive.ZERO_BYTE = r0
            bsh.Primitive r0 = new bsh.Primitive
            r0.<init>(r1)
            bsh.Primitive.ZERO_SHORT = r0
            bsh.Primitive r0 = new bsh.Primitive
            r0.<init>(r1)
            bsh.Primitive.ZERO_INT = r0
            bsh.Primitive r0 = new bsh.Primitive
            r1 = 0
            r0.<init>(r1)
            bsh.Primitive.ZERO_LONG = r0
            bsh.Primitive r0 = new bsh.Primitive
            r1 = 0
            r0.<init>(r1)
            bsh.Primitive.ZERO_FLOAT = r0
            bsh.Primitive r0 = new bsh.Primitive
            r1 = 0
            r0.<init>(r1)
            bsh.Primitive.ZERO_DOUBLE = r0
            bsh.Primitive r0 = new bsh.Primitive
            java.math.BigInteger r1 = java.math.BigInteger.ZERO
            r0.<init>(r1)
            bsh.Primitive.ZERO_BIG_INTEGER = r0
            bsh.Primitive r0 = new bsh.Primitive
            java.math.BigDecimal r1 = java.math.BigDecimal.ZERO
            r0.<init>(r1)
            bsh.Primitive.ZERO_BIG_DECIMAL = r0
            bsh.Primitive r0 = new bsh.Primitive
            bsh.Primitive$Special r1 = bsh.Primitive.Special.NULL_VALUE
            r0.<init>(r1)
            bsh.Primitive.NULL = r0
            bsh.Primitive r0 = new bsh.Primitive
            bsh.Primitive$Special r1 = bsh.Primitive.Special.VOID_TYPE
            r0.<init>(r1)
            bsh.Primitive.VOID = r0
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            bsh.Primitive.INTEGER_MAX = r0
            r0 = -2147483648(0xffffffff80000000, double:NaN)
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            bsh.Primitive.INTEGER_MIN = r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            bsh.Primitive.LONG_MAX = r0
            r0 = -9223372036854775808
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            bsh.Primitive.LONG_MIN = r0
            return
    }

    public Primitive(byte r1) {
            r0 = this;
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r0.<init>(r1)
            return
    }

    public Primitive(char r1) {
            r0 = this;
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r0.<init>(r1)
            return
    }

    public Primitive(double r1) {
            r0 = this;
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.<init>(r1)
            return
    }

    public Primitive(float r1) {
            r0 = this;
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0.<init>(r1)
            return
    }

    public Primitive(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1)
            return
    }

    public Primitive(long r1) {
            r0 = this;
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.<init>(r1)
            return
    }

    private Primitive(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L8
            r0.value = r1
            return
        L8:
            java.lang.String r1 = "Use Primitve.NULL instead of Primitive(null)"
            bsh.j.f(r1)
            r1 = 0
            throw r1
    }

    public Primitive(java.math.BigDecimal r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            int r0 = r2.scale()
            if (r0 != 0) goto Ld
            r0 = 1
            java.math.BigDecimal r2 = r2.setScale(r0)
        Ld:
            r1.<init>(r2)
            return
    }

    public Primitive(java.math.BigInteger r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public Primitive(short r1) {
            r0 = this;
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            r0.<init>(r1)
            return
    }

    public Primitive(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto L7
        L5:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L7:
            r0.<init>(r1)
            return
    }

    public static java.lang.Class<?> boxType(java.lang.Class<?> r2) {
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = bsh.Primitive.wrapperMap
            java.lang.Object r0 = r0.get(r2)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L11
            boolean r1 = r0.isPrimitive()
            if (r1 != 0) goto L11
            return r0
        L11:
            java.lang.String r0 = "Not a primitive type: "
            java.lang.String r2 = p.a.k(r2, r0)
            bsh.j.f(r2)
            r2 = 0
            return r2
    }

    public static java.lang.Object castNumber(java.lang.Class<?> r10, java.lang.Number r11) {
            boolean r0 = r10.isInstance(r11)
            if (r0 != 0) goto L1d2
            java.lang.Class r0 = r11.getClass()
            java.lang.Class r0 = unboxType(r0)
            if (r10 != r0) goto L12
            goto L1d2
        L12:
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r10 == r0) goto L1a
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r10 != r0) goto L33
        L1a:
            short r0 = r11.shortValue()
            r1 = 255(0xff, float:3.57E-43)
            if (r0 > r1) goto L33
            short r0 = r11.shortValue()
            r1 = -128(0xffffffffffffff80, float:NaN)
            if (r0 < r1) goto L33
            byte r10 = r11.byteValue()
            java.lang.Byte r10 = java.lang.Byte.valueOf(r10)
            return r10
        L33:
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r10 == r0) goto L3b
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r10 != r0) goto L54
        L3b:
            int r0 = r11.intValue()
            r1 = 32767(0x7fff, float:4.5916E-41)
            if (r0 > r1) goto L54
            int r0 = r11.intValue()
            r1 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 < r1) goto L54
            short r10 = r11.shortValue()
            java.lang.Short r10 = java.lang.Short.valueOf(r10)
            return r10
        L54:
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            if (r10 == r0) goto L5c
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r10 != r0) goto L75
        L5c:
            int r0 = r11.intValue()
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 > r1) goto L75
            int r0 = r11.intValue()
            if (r0 < 0) goto L75
            int r10 = r11.intValue()
            char r10 = (char) r10
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            return r10
        L75:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r10 == r0) goto L7d
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r10 != r0) goto Lad
        L7d:
            long r0 = r11.longValue()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto Lad
            long r0 = r11.longValue()
            r2 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto Lad
            boolean r10 = r11 instanceof java.lang.Byte
            if (r10 == 0) goto La4
            byte r10 = r11.byteValue()
            int r10 = java.lang.Byte.toUnsignedInt(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            return r10
        La4:
            int r10 = r11.intValue()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            return r10
        Lad:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r10 == r0) goto Lb5
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r10 != r0) goto Lc8
        Lb5:
            float r0 = r11.floatValue()
            boolean r0 = java.lang.Float.isInfinite(r0)
            if (r0 != 0) goto Lc8
            float r10 = r11.floatValue()
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            return r10
        Lc8:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r10 == r0) goto Ld0
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r10 != r0) goto Le3
        Ld0:
            double r0 = r11.doubleValue()
            boolean r0 = java.lang.Double.isInfinite(r0)
            if (r0 != 0) goto Le3
            double r10 = r11.doubleValue()
            java.lang.Double r10 = java.lang.Double.valueOf(r10)
            return r10
        Le3:
            double r0 = r11.doubleValue()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.lang.Class<java.math.BigDecimal> r1 = java.math.BigDecimal.class
            java.lang.Class<java.math.BigInteger> r2 = java.math.BigInteger.class
            java.lang.Class r3 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            r5 = 1
            if (r0 != 0) goto L110
            if (r10 == r4) goto L109
            if (r10 != r3) goto Lfb
            goto L109
        Lfb:
            if (r10 != r2) goto L100
            java.math.BigInteger r10 = java.math.BigInteger.ZERO
            return r10
        L100:
            if (r10 != r1) goto L1b2
            java.math.BigDecimal r10 = java.math.BigDecimal.ZERO
            java.math.BigDecimal r10 = r10.setScale(r5)
            return r10
        L109:
            r10 = 0
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            return r10
        L110:
            double r6 = r11.doubleValue()
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L134
            if (r10 == r4) goto L12d
            if (r10 != r3) goto L11f
            goto L12d
        L11f:
            if (r10 != r2) goto L124
            java.math.BigInteger r10 = java.math.BigInteger.ONE
            return r10
        L124:
            if (r10 != r1) goto L1b2
            java.math.BigDecimal r10 = java.math.BigDecimal.ONE
            java.math.BigDecimal r10 = r10.setScale(r5)
            return r10
        L12d:
            r10 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            return r10
        L134:
            if (r10 != r1) goto L163
            boolean r10 = r11 instanceof java.math.BigInteger
            if (r10 == 0) goto L146
            java.math.BigDecimal r10 = new java.math.BigDecimal
            java.math.BigInteger r11 = (java.math.BigInteger) r11
            r10.<init>(r11)
            java.math.BigDecimal r10 = r10.setScale(r5)
            return r10
        L146:
            boolean r10 = bsh.Types.isFloatingpoint(r11)
            if (r10 == 0) goto L155
            double r10 = r11.doubleValue()
            java.math.BigDecimal r10 = java.math.BigDecimal.valueOf(r10)
            return r10
        L155:
            java.math.BigDecimal r10 = new java.math.BigDecimal
            long r0 = r11.longValue()
            r10.<init>(r0)
            java.math.BigDecimal r10 = r10.setScale(r5)
            return r10
        L163:
            boolean r0 = r11 instanceof java.math.BigInteger
            if (r0 == 0) goto L16b
            r0 = r11
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            goto L192
        L16b:
            boolean r0 = r11 instanceof java.math.BigDecimal
            if (r0 == 0) goto L177
            r0 = r11
            java.math.BigDecimal r0 = (java.math.BigDecimal) r0
            java.math.BigInteger r0 = r0.toBigInteger()
            goto L192
        L177:
            boolean r0 = bsh.Types.isFloatingpoint(r11)
            if (r0 == 0) goto L18a
            double r0 = r11.doubleValue()
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.math.BigInteger r0 = r0.toBigInteger()
            goto L192
        L18a:
            long r0 = r11.longValue()
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
        L192:
            if (r10 == r4) goto L196
            if (r10 != r3) goto L1af
        L196:
            java.math.BigInteger r1 = bsh.Primitive.LONG_MIN
            int r1 = r0.compareTo(r1)
            if (r1 < 0) goto L1af
            java.math.BigInteger r1 = bsh.Primitive.LONG_MAX
            int r1 = r0.compareTo(r1)
            if (r1 > 0) goto L1af
            long r10 = r11.longValue()
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            return r10
        L1af:
            if (r10 != r2) goto L1b2
            return r0
        L1b2:
            bsh.InterpreterError r0 = new bsh.InterpreterError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "cannot assign number "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r10 = r10.getSimpleName()
            java.lang.String r11 = " to type "
            r1.append(r11)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        L1d2:
            return r11
    }

    public static java.lang.Object castNumberStrictJava(java.lang.Class<?> r1, java.lang.Number r2) {
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r1 == r0) goto L7c
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r1 != r0) goto La
            goto L7c
        La:
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r1 == r0) goto L73
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r1 != r0) goto L13
            goto L73
        L13:
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            if (r1 == r0) goto L69
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r1 != r0) goto L1c
            goto L69
        L1c:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 == r0) goto L60
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 != r0) goto L25
            goto L60
        L25:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 == r0) goto L57
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 != r0) goto L2e
            goto L57
        L2e:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r1 == r0) goto L4e
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r1 != r0) goto L37
            goto L4e
        L37:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r1 == r0) goto L45
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r1 != r0) goto L40
            goto L45
        L40:
            java.lang.Object r1 = castNumber(r1, r2)
            return r1
        L45:
            double r1 = r2.doubleValue()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            return r1
        L4e:
            float r1 = r2.floatValue()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
        L57:
            long r1 = r2.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L60:
            int r1 = r2.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L69:
            int r1 = r2.intValue()
            char r1 = (char) r1
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            return r1
        L73:
            short r1 = r2.shortValue()
            java.lang.Short r1 = java.lang.Short.valueOf(r1)
            return r1
        L7c:
            byte r1 = r2.byteValue()
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            return r1
    }

    public static bsh.Primitive castPrimitive(java.lang.Class<?> r1, java.lang.Class<?> r2, bsh.Primitive r3, boolean r4, int r5) {
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r2 != r0) goto L14
            if (r4 == 0) goto L9
            bsh.Primitive r1 = bsh.Types.INVALID_CAST
            return r1
        L9:
            java.lang.String r1 = bsh.StringUtil.typeString(r1)
            java.lang.String r2 = "void value"
            bsh.UtilEvalError r1 = bsh.Types.castError(r1, r2, r5)
            throw r1
        L14:
            if (r4 != 0) goto L30
            boolean r0 = r3.isNumber()
            if (r0 == 0) goto L30
            boolean r0 = bsh.Types.isNumeric(r1)
            if (r0 == 0) goto L30
            bsh.Primitive r2 = new bsh.Primitive
            java.lang.Number r3 = r3.numberValue()
            java.lang.Object r1 = castNumber(r1, r3)
            r2.<init>(r1)
            return r2
        L30:
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L86
            if (r2 != 0) goto L4a
            bsh.Primitive r0 = bsh.Primitive.VOID
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L4a
            if (r4 == 0) goto L45
            bsh.Primitive r1 = bsh.Types.VALID_CAST
            return r1
        L45:
            bsh.Primitive r1 = getDefaultValue(r1)
            return r1
        L4a:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r1 != r0) goto L5d
            if (r4 == 0) goto L53
            bsh.Primitive r1 = bsh.Types.VALID_CAST
            return r1
        L53:
            bsh.Primitive r2 = new bsh.Primitive
            java.lang.Object r1 = castWrapper(r1, r3)
            r2.<init>(r1)
            return r2
        L5d:
            if (r4 == 0) goto L69
            if (r2 != r0) goto L69
            if (r1 == r0) goto L66
            bsh.Primitive r1 = bsh.Types.INVALID_CAST
            return r1
        L66:
            bsh.Primitive r1 = bsh.Types.VALID_CAST
            return r1
        L69:
            r0 = 1
            if (r5 != r0) goto L77
            boolean r2 = bsh.Types.isJavaAssignable(r1, r2)
            if (r2 != 0) goto L77
            if (r4 == 0) goto L77
            bsh.Primitive r1 = bsh.Types.INVALID_CAST
            return r1
        L77:
            if (r4 == 0) goto L7c
            bsh.Primitive r1 = bsh.Types.VALID_CAST
            return r1
        L7c:
            bsh.Primitive r2 = new bsh.Primitive
            java.lang.Object r1 = castWrapper(r1, r3)
            r2.<init>(r1)
            return r2
        L86:
            if (r2 != 0) goto L90
            if (r4 == 0) goto L8d
            bsh.Primitive r1 = bsh.Types.VALID_CAST
            return r1
        L8d:
            bsh.Primitive r1 = bsh.Primitive.NULL
            return r1
        L90:
            if (r4 == 0) goto L95
            bsh.Primitive r1 = bsh.Types.INVALID_CAST
            return r1
        L95:
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "object type "
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "primitive value"
            bsh.UtilEvalError r1 = bsh.Types.castError(r1, r2, r5)
            throw r1
    }

    public static java.lang.Object castWrapper(java.lang.Class<?> r3, java.lang.Object r4) {
            bsh.Primitive r0 = bsh.Primitive.VOID
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L9
            return r4
        L9:
            java.lang.Object r4 = unwrap(r4)
            boolean r0 = isWrapperType(r3)
            if (r0 != 0) goto L25
            boolean r0 = r3.isPrimitive()
            if (r0 == 0) goto L1a
            goto L25
        L1a:
            java.lang.String r4 = "invalid type in castWrapper: "
            java.lang.String r3 = p.a.k(r3, r4)
            bsh.j.f(r3)
            r3 = 0
            return r3
        L25:
            boolean r0 = r4 instanceof java.lang.Character
            if (r0 == 0) goto L33
            java.lang.Character r4 = (java.lang.Character) r4
            char r4 = r4.charValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L33:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r3 != r0) goto L6e
            boolean r3 = r4 instanceof java.lang.Boolean
            if (r3 == 0) goto L3c
            return r4
        L3c:
            boolean r3 = r4 instanceof java.lang.String
            r0 = 1
            if (r3 == 0) goto L51
            java.lang.String r3 = ""
            java.lang.String r4 = java.lang.String.valueOf(r4)
            boolean r3 = r3.equals(r4)
            r3 = r3 ^ r0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L51:
            boolean r3 = r4 instanceof java.lang.Number
            r1 = 0
            if (r3 == 0) goto L65
            java.lang.Number r4 = (java.lang.Number) r4
            int r3 = r4.intValue()
            if (r3 == 0) goto L5f
            goto L60
        L5f:
            r0 = r1
        L60:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L65:
            if (r4 == 0) goto L68
            goto L69
        L68:
            r0 = r1
        L69:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L6e:
            if (r4 != 0) goto L7e
            boolean r0 = r3.isPrimitive()
            if (r0 == 0) goto L7e
            bsh.Primitive r4 = getDefaultValue(r3)
            java.lang.Object r4 = unwrap(r4)
        L7e:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto La9
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch: java.lang.NumberFormatException -> L8f
            double r0 = java.lang.Double.parseDouble(r0)     // Catch: java.lang.NumberFormatException -> L8f
            java.lang.Double r4 = java.lang.Double.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L8f
            goto La9
        L8f:
            r3 = move-exception
            bsh.InterpreterError r0 = new bsh.InterpreterError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "cannot cast string \""
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = "\" to number"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4, r3)
            throw r0
        La9:
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 == 0) goto Lb7
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        Lb7:
            boolean r0 = r4 instanceof java.lang.Number
            if (r0 == 0) goto Lc2
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.Object r3 = castNumber(r3, r4)
            return r3
        Lc2:
            bsh.InterpreterError r3 = new bsh.InterpreterError
            java.lang.String r4 = bsh.StringUtil.typeValueString(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "bad type in cast "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    public static bsh.Primitive getDefaultValue(java.lang.Class<?> r1) {
            if (r1 != 0) goto L5
            bsh.Primitive r1 = bsh.Primitive.NULL
            return r1
        L5:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r0 == r1) goto L74
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r0 != r1) goto Lf
            goto L74
        Lf:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r0 == r1) goto L71
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            if (r0 != r1) goto L18
            goto L71
        L18:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r0 == r1) goto L6e
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r0 != r1) goto L21
            goto L6e
        L21:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r0 == r1) goto L6b
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r0 != r1) goto L2a
            goto L6b
        L2a:
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r0 == r1) goto L68
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r0 != r1) goto L33
            goto L68
        L33:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r0 == r1) goto L65
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r0 != r1) goto L3c
            goto L65
        L3c:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r0 == r1) goto L62
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r0 != r1) goto L45
            goto L62
        L45:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r0 == r1) goto L5f
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r0 != r1) goto L4e
            goto L5f
        L4e:
            java.lang.Class<java.math.BigInteger> r0 = java.math.BigInteger.class
            if (r0 != r1) goto L55
            bsh.Primitive r1 = bsh.Primitive.ZERO_BIG_INTEGER
            return r1
        L55:
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            if (r0 != r1) goto L5c
            bsh.Primitive r1 = bsh.Primitive.ZERO_BIG_DECIMAL
            return r1
        L5c:
            bsh.Primitive r1 = bsh.Primitive.NULL
            return r1
        L5f:
            bsh.Primitive r1 = bsh.Primitive.ZERO_DOUBLE
            return r1
        L62:
            bsh.Primitive r1 = bsh.Primitive.ZERO_FLOAT
            return r1
        L65:
            bsh.Primitive r1 = bsh.Primitive.ZERO_LONG
            return r1
        L68:
            bsh.Primitive r1 = bsh.Primitive.ZERO_INT
            return r1
        L6b:
            bsh.Primitive r1 = bsh.Primitive.ZERO_SHORT
            return r1
        L6e:
            bsh.Primitive r1 = bsh.Primitive.ZERO_BYTE
            return r1
        L71:
            bsh.Primitive r1 = bsh.Primitive.ZERO_CHAR
            return r1
        L74:
            bsh.Primitive r1 = bsh.Primitive.FALSE
            return r1
    }

    public static boolean isWrapperType(java.lang.Class<?> r1) {
            if (r1 == 0) goto L12
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = bsh.Primitive.wrapperMap
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L12
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    private java.lang.Object readResolve() {
            r2 = this;
            java.lang.Object r0 = r2.value
            bsh.Primitive$Special r1 = bsh.Primitive.Special.NULL_VALUE
            if (r0 != r1) goto L9
            bsh.Primitive r0 = bsh.Primitive.NULL
            return r0
        L9:
            return r2
    }

    public static bsh.Primitive shrinkWrap(java.lang.Object r3) {
            boolean r0 = r3 instanceof java.lang.Number
            if (r0 == 0) goto L80
            r0 = r3
            java.lang.Number r0 = (java.lang.Number) r0
            boolean r1 = bsh.Types.isFloatingpoint(r3)
            if (r1 == 0) goto L37
            boolean r1 = r3 instanceof java.lang.Float
            if (r1 == 0) goto L1b
            bsh.Primitive r3 = new bsh.Primitive
            float r0 = r0.floatValue()
            r3.<init>(r0)
            return r3
        L1b:
            double r1 = r0.doubleValue()
            boolean r1 = java.lang.Double.isInfinite(r1)
            if (r1 != 0) goto L2f
            bsh.Primitive r3 = new bsh.Primitive
            double r0 = r0.doubleValue()
            r3.<init>(r0)
            return r3
        L2f:
            bsh.Primitive r0 = new bsh.Primitive
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            r0.<init>(r3)
            return r0
        L37:
            boolean r1 = r3 instanceof java.math.BigInteger
            if (r1 == 0) goto L3e
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            goto L46
        L3e:
            long r0 = r0.longValue()
            java.math.BigInteger r3 = java.math.BigInteger.valueOf(r0)
        L46:
            java.math.BigInteger r0 = bsh.Primitive.INTEGER_MIN
            int r0 = r3.compareTo(r0)
            if (r0 < 0) goto L60
            java.math.BigInteger r0 = bsh.Primitive.INTEGER_MAX
            int r0 = r3.compareTo(r0)
            if (r0 > 0) goto L60
            bsh.Primitive r0 = new bsh.Primitive
            int r3 = r3.intValue()
            r0.<init>(r3)
            return r0
        L60:
            java.math.BigInteger r0 = bsh.Primitive.LONG_MIN
            int r0 = r3.compareTo(r0)
            if (r0 < 0) goto L7a
            java.math.BigInteger r0 = bsh.Primitive.LONG_MAX
            int r0 = r3.compareTo(r0)
            if (r0 > 0) goto L7a
            bsh.Primitive r0 = new bsh.Primitive
            long r1 = r3.longValue()
            r0.<init>(r1)
            return r0
        L7a:
            bsh.Primitive r0 = new bsh.Primitive
            r0.<init>(r3)
            return r0
        L80:
            java.lang.String r3 = "Can only shrink wrap Number types"
            bsh.j.f(r3)
            r3 = 0
            return r3
    }

    public static java.lang.Class<?> unboxType(java.lang.Class<?> r2) {
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = bsh.Primitive.wrapperMap
            java.lang.Object r0 = r0.get(r2)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L13
            boolean r1 = r0.isPrimitive()
            if (r1 != 0) goto L12
            if (r0 != r2) goto L13
        L12:
            return r0
        L13:
            java.lang.String r0 = "Not a primitive wrapper type: "
            java.lang.String r2 = p.a.k(r2, r0)
            bsh.j.f(r2)
            r2 = 0
            return r2
    }

    public static java.lang.Object unwrap(java.lang.Object r1) {
            bsh.Primitive r0 = bsh.Primitive.VOID
            if (r1 != r0) goto L6
            r1 = 0
            return r1
        L6:
            boolean r0 = r1 instanceof bsh.Primitive
            if (r0 == 0) goto L10
            bsh.Primitive r1 = (bsh.Primitive) r1
            java.lang.Object r1 = r1.getValue()
        L10:
            return r1
    }

    public static java.lang.Object[] unwrap(java.lang.Object[] r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r3.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
        L8:
            int r2 = r3.length
            if (r1 >= r2) goto L16
            r2 = r3[r1]
            java.lang.Object r2 = unwrap(r2)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L16:
            return r0
    }

    public static java.lang.Object wrap(java.lang.Object r1, java.lang.Class<?> r2) {
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r2 != r0) goto L7
            bsh.Primitive r1 = bsh.Primitive.VOID
            return r1
        L7:
            if (r1 != 0) goto Lc
            bsh.Primitive r1 = bsh.Primitive.NULL
            return r1
        Lc:
            boolean r2 = bsh.Types.isPrimitive(r2)
            if (r2 == 0) goto L34
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 == 0) goto L24
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L21
            bsh.Primitive r1 = bsh.Primitive.TRUE
            return r1
        L21:
            bsh.Primitive r1 = bsh.Primitive.FALSE
            return r1
        L24:
            java.lang.Class r2 = r1.getClass()
            boolean r2 = isWrapperType(r2)
            if (r2 == 0) goto L34
            bsh.Primitive r2 = new bsh.Primitive
            r2.<init>(r1)
            return r2
        L34:
            return r1
    }

    public static java.lang.Object[] wrap(java.lang.Object[] r4, java.lang.Class<?>[] r5) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r4.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
        L8:
            int r2 = r4.length
            if (r1 >= r2) goto L18
            r2 = r4[r1]
            r3 = r5[r1]
            java.lang.Object r2 = wrap(r2, r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L18:
            return r0
    }

    public bsh.Primitive castToType(java.lang.Class<?> r3, int r4) {
            r2 = this;
            java.lang.Class r0 = r2.getType()
            r1 = 0
            bsh.Primitive r3 = castPrimitive(r3, r0, r2, r1, r4)
            return r3
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            boolean r0 = r8 instanceof bsh.Primitive
            r1 = 0
            if (r0 != 0) goto L19
            java.util.Map<java.lang.Class<?>, java.lang.Class<?>> r0 = bsh.Primitive.wrapperMap
            java.lang.Class r2 = r8.getClass()
            boolean r0 = r0.containsKey(r2)
            if (r0 == 0) goto L18
            bsh.Primitive r0 = new bsh.Primitive
            r0.<init>(r8)
            r8 = r0
            goto L19
        L18:
            return r1
        L19:
            bsh.Primitive r8 = (bsh.Primitive) r8
            boolean r0 = r8.isNumber()
            if (r0 == 0) goto Lbd
            boolean r0 = r7.isNumber()
            if (r0 == 0) goto Lbd
            java.lang.Class r0 = r7.getType()
            java.lang.Class<java.math.BigDecimal> r2 = java.math.BigDecimal.class
            if (r0 != r2) goto L3e
            java.lang.Object r0 = r7.value
            java.lang.Number r8 = r8.numberValue()
            java.lang.Object r8 = castNumber(r2, r8)
            boolean r8 = r0.equals(r8)
            return r8
        L3e:
            java.lang.Class r0 = r8.getType()
            if (r0 != r2) goto L53
            java.lang.Object r8 = r8.value
            java.lang.Number r0 = r7.numberValue()
            java.lang.Object r0 = castNumber(r2, r0)
            boolean r8 = r8.equals(r0)
            return r8
        L53:
            java.lang.Object r0 = r7.value
            boolean r0 = bsh.Types.isFloatingpoint(r0)
            r2 = 1
            if (r0 != 0) goto La7
            java.lang.Object r0 = r8.value
            boolean r0 = bsh.Types.isFloatingpoint(r0)
            if (r0 == 0) goto L65
            goto La7
        L65:
            java.lang.Class r0 = r7.getType()
            java.lang.Class<java.math.BigInteger> r3 = java.math.BigInteger.class
            if (r0 != r3) goto L7c
            java.lang.Object r0 = r7.value
            java.lang.Number r8 = r8.numberValue()
            java.lang.Object r8 = castNumber(r3, r8)
            boolean r8 = r0.equals(r8)
            return r8
        L7c:
            java.lang.Class r0 = r8.getType()
            if (r0 != r3) goto L91
            java.lang.Object r8 = r8.value
            java.lang.Number r0 = r7.numberValue()
            java.lang.Object r0 = castNumber(r3, r0)
            boolean r8 = r8.equals(r0)
            return r8
        L91:
            java.lang.Number r0 = r7.numberValue()
            long r3 = r0.longValue()
            java.lang.Number r8 = r8.numberValue()
            long r5 = r8.longValue()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto La6
            return r2
        La6:
            return r1
        La7:
            java.lang.Number r0 = r7.numberValue()
            double r3 = r0.doubleValue()
            java.lang.Number r8 = r8.numberValue()
            double r5 = r8.doubleValue()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto Lbc
            return r2
        Lbc:
            return r1
        Lbd:
            java.lang.Object r0 = r7.value
            java.lang.Object r8 = r8.value
            boolean r8 = r0.equals(r8)
            return r8
    }

    public java.lang.Class<?> getType() {
            r1 = this;
            bsh.Primitive r0 = bsh.Primitive.VOID
            if (r1 != r0) goto L7
            java.lang.Class r0 = java.lang.Void.TYPE
            return r0
        L7:
            bsh.Primitive r0 = bsh.Primitive.NULL
            if (r1 != r0) goto Ld
            r0 = 0
            return r0
        Ld:
            java.lang.Object r0 = r1.value
            java.lang.Class r0 = r0.getClass()
            java.lang.Class r0 = unboxType(r0)
            return r0
    }

    public java.lang.Object getValue() {
            r2 = this;
            java.lang.Object r0 = r2.value
            bsh.Primitive$Special r1 = bsh.Primitive.Special.NULL_VALUE
            if (r0 != r1) goto L8
            r0 = 0
            return r0
        L8:
            bsh.Primitive$Special r1 = bsh.Primitive.Special.VOID_TYPE
            if (r0 == r1) goto Ld
            return r0
        Ld:
            java.lang.String r0 = "attempt to unwrap void type"
            bsh.j.f(r0)
            r0 = 0
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.value
            int r0 = r0.hashCode()
            int r0 = r0 * 21
            return r0
    }

    public boolean isNumber() {
            r2 = this;
            java.lang.Object r0 = r2.value
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 != 0) goto L16
            bsh.Primitive r1 = bsh.Primitive.NULL
            if (r2 == r1) goto L16
            bsh.Primitive r1 = bsh.Primitive.VOID
            if (r2 == r1) goto L16
            boolean r0 = bsh.Types.isNumeric(r0)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public java.lang.Number numberValue() {
            r2 = this;
            java.lang.Object r0 = r2.value
            boolean r1 = r0 instanceof java.lang.Character
            if (r1 == 0) goto L10
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L10:
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L17
            java.lang.Number r0 = (java.lang.Number) r0
            return r0
        L17:
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L26
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L26:
            java.lang.String r0 = "Primitive not a number"
            bsh.j.f(r0)
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.Object r0 = r2.value
            bsh.Primitive$Special r1 = bsh.Primitive.Special.NULL_VALUE
            if (r0 != r1) goto L9
            java.lang.String r0 = "null"
            return r0
        L9:
            bsh.Primitive$Special r1 = bsh.Primitive.Special.VOID_TYPE
            if (r0 != r1) goto L10
            java.lang.String r0 = "void"
            return r0
        L10:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
