package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class Operators implements bsh.ParserConstants {
    private static final java.util.List<java.lang.Integer> COMPARABLE_OPS = null;
    private static final java.util.List<java.lang.Integer> OVERFLOW_OPS = null;

    static {
            r0 = 104(0x68, float:1.46E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 105(0x69, float:1.47E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 106(0x6a, float:1.49E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 116(0x74, float:1.63E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r1, r2, r3}
            java.util.List r0 = java.util.Arrays.asList(r0)
            bsh.Operators.OVERFLOW_OPS = r0
            r0 = 88
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 89
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 86
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r0 = 87
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r0 = 92
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r0 = 93
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r0 = 94
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r0 = 95
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r0 = 96
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r0 = 97
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r0 = java.util.Arrays.asList(r0)
            bsh.Operators.COMPARABLE_OPS = r0
            return
    }

    private Operators() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object arbitraryObjectsBinaryOperation(java.lang.Object r4, java.lang.Object r5, int r6) {
            r0 = 92
            if (r6 != r0) goto Lc
            if (r4 != r5) goto L9
            bsh.Primitive r4 = bsh.Primitive.TRUE
            return r4
        L9:
            bsh.Primitive r4 = bsh.Primitive.FALSE
            return r4
        Lc:
            r0 = 97
            if (r6 != r0) goto L18
            if (r4 == r5) goto L15
            bsh.Primitive r4 = bsh.Primitive.TRUE
            return r4
        L15:
            bsh.Primitive r4 = bsh.Primitive.FALSE
            return r4
        L18:
            bsh.Primitive r0 = bsh.Primitive.VOID
            if (r4 == r0) goto L255
            if (r5 == r0) goto L255
            r0 = 145(0x91, float:2.03E-43)
            r1 = 0
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r6 != r0) goto L72
            boolean r6 = r4 instanceof java.lang.Comparable
            if (r6 != 0) goto L4a
            boolean r6 = r5 instanceof java.lang.Comparable
            if (r6 == 0) goto L2e
            goto L4a
        L2e:
            bsh.b r6 = new bsh.b
            r0 = 13
            r6.<init>(r0)
            java.util.Comparator r6 = java.util.Comparator.comparing(r6)
            java.util.Comparator r6 = java.util.Comparator.nullsFirst(r6)
            java.lang.Object r4 = bsh.Primitive.unwrap(r4)
            java.lang.Object r5 = bsh.Primitive.unwrap(r5)
            int r4 = r6.compare(r4, r5)
            goto L62
        L4a:
            java.util.Comparator r6 = java.util.Comparator.naturalOrder()
            java.util.Comparator r6 = java.util.Comparator.nullsFirst(r6)
            java.lang.Object r4 = bsh.Primitive.unwrap(r4)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            java.lang.Object r5 = bsh.Primitive.unwrap(r5)
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r4 = r6.compare(r4, r5)
        L62:
            if (r4 >= 0) goto L66
            r1 = -1
            goto L69
        L66:
            if (r4 <= 0) goto L69
            r1 = 1
        L69:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.Object r4 = bsh.Primitive.wrap(r4, r2)
            return r4
        L72:
            r0 = 104(0x68, float:1.46E-43)
            if (r6 != r0) goto Lf1
            boolean r0 = r4 instanceof java.lang.String
            if (r0 != 0) goto Lcf
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L7f
            goto Lcf
        L7f:
            java.lang.Class r0 = r4.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L93
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L93
            java.util.List r5 = (java.util.List) r5
            java.lang.Object[] r5 = r5.toArray()
        L93:
            java.lang.Class r0 = r4.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto Lac
            java.lang.Class r0 = r5.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto Lac
            java.lang.Object r4 = bsh.BshArray.concat(r4, r5)
            return r4
        Lac:
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto Lc0
            java.lang.Class r3 = r5.getClass()
            boolean r3 = r3.isArray()
            if (r3 == 0) goto Lc0
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Object r5 = bsh.Types.castObject(r5, r3, r1)
        Lc0:
            if (r0 == 0) goto Lf1
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto Lf1
            java.util.List r4 = (java.util.List) r4
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = bsh.BshArray.concat(r4, r5)
            return r4
        Lcf:
            boolean r6 = bsh.BSHLiteral.internStrings
            if (r6 == 0) goto Le4
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r4 = r4.concat(r5)
            java.lang.String r4 = r4.intern()
            return r4
        Le4:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r4 = r4.concat(r5)
            return r4
        Lf1:
            r0 = 106(0x6a, float:1.49E-43)
            if (r6 != r0) goto L1ec
            java.lang.Class r0 = r4.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L10e
            java.lang.Object r5 = bsh.Primitive.castWrapper(r2, r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r4 = bsh.BshArray.repeat(r4, r5)
            return r4
        L10e:
            java.lang.Class r0 = r5.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L127
            java.lang.Object r4 = bsh.Primitive.castWrapper(r2, r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r4 = bsh.BshArray.repeat(r5, r4)
            return r4
        L127:
            boolean r0 = r4 instanceof java.util.List
            if (r0 == 0) goto L13c
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = bsh.Primitive.castWrapper(r2, r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r4 = bsh.BshArray.repeat(r4, r5)
            return r4
        L13c:
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L151
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = bsh.Primitive.castWrapper(r2, r4)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r4 = bsh.BshArray.repeat(r5, r4)
            return r4
        L151:
            boolean r0 = r4 instanceof java.lang.String     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.String r1 = "\u0000"
            if (r0 == 0) goto L193
            boolean r6 = bsh.BSHLiteral.internStrings     // Catch: java.lang.NegativeArraySizeException -> L1d3
            if (r6 == 0) goto L179
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.Object r5 = bsh.Primitive.castWrapper(r2, r5)     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.NegativeArraySizeException -> L1d3
            int r5 = r5.intValue()     // Catch: java.lang.NegativeArraySizeException -> L1d3
            char[] r5 = new char[r5]     // Catch: java.lang.NegativeArraySizeException -> L1d3
            r6.<init>(r5)     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.String r4 = r6.replace(r1, r4)     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.String r4 = r4.intern()     // Catch: java.lang.NegativeArraySizeException -> L1d3
            return r4
        L179:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.Object r5 = bsh.Primitive.castWrapper(r2, r5)     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.NegativeArraySizeException -> L1d3
            int r5 = r5.intValue()     // Catch: java.lang.NegativeArraySizeException -> L1d3
            char[] r5 = new char[r5]     // Catch: java.lang.NegativeArraySizeException -> L1d3
            r6.<init>(r5)     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.String r4 = r6.replace(r1, r4)     // Catch: java.lang.NegativeArraySizeException -> L1d3
            return r4
        L193:
            boolean r0 = r5 instanceof java.lang.String     // Catch: java.lang.NegativeArraySizeException -> L1d3
            if (r0 == 0) goto L1ec
            boolean r6 = bsh.BSHLiteral.internStrings     // Catch: java.lang.NegativeArraySizeException -> L1d3
            if (r6 == 0) goto L1b9
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.Object r4 = bsh.Primitive.castWrapper(r2, r4)     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.NegativeArraySizeException -> L1d3
            int r4 = r4.intValue()     // Catch: java.lang.NegativeArraySizeException -> L1d3
            char[] r4 = new char[r4]     // Catch: java.lang.NegativeArraySizeException -> L1d3
            r6.<init>(r4)     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.String r4 = java.lang.String.valueOf(r5)     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.String r4 = r6.replace(r1, r4)     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.String r4 = r4.intern()     // Catch: java.lang.NegativeArraySizeException -> L1d3
            return r4
        L1b9:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.Object r4 = bsh.Primitive.castWrapper(r2, r4)     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.NegativeArraySizeException -> L1d3
            int r4 = r4.intValue()     // Catch: java.lang.NegativeArraySizeException -> L1d3
            char[] r4 = new char[r4]     // Catch: java.lang.NegativeArraySizeException -> L1d3
            r6.<init>(r4)     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.String r4 = java.lang.String.valueOf(r5)     // Catch: java.lang.NegativeArraySizeException -> L1d3
            java.lang.String r4 = r6.replace(r1, r4)     // Catch: java.lang.NegativeArraySizeException -> L1d3
            return r4
        L1d3:
            r4 = move-exception
            bsh.UtilEvalError r5 = new bsh.UtilEvalError
            java.lang.String r6 = r4.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Negative repeat operand: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6, r4)
            throw r5
        L1ec:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 != 0) goto L24d
            boolean r0 = r5 instanceof java.lang.String
            if (r0 != 0) goto L24d
            java.lang.Class r0 = r4.getClass()
            boolean r0 = r0.isArray()
            if (r0 != 0) goto L236
            java.lang.Class r0 = r5.getClass()
            boolean r0 = r0.isArray()
            if (r0 != 0) goto L236
            boolean r0 = r4 instanceof java.util.List
            if (r0 != 0) goto L236
            boolean r0 = r5 instanceof java.util.List
            if (r0 != 0) goto L236
            bsh.Primitive r0 = bsh.Primitive.NULL
            if (r4 == r0) goto L22e
            if (r5 != r0) goto L217
            goto L22e
        L217:
            bsh.UtilEvalError r4 = new bsh.UtilEvalError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Operator: "
            r5.<init>(r0)
            java.lang.String[] r0 = bsh.ParserConstants.tokenImage
            r6 = r0[r6]
            java.lang.String r0 = " inappropriate for objects"
            java.lang.String r5 = eh.a.r(r5, r6, r0)
            r4.<init>(r5)
            throw r4
        L22e:
            bsh.UtilEvalError r4 = new bsh.UtilEvalError
            java.lang.String r5 = "illegal use of null value or 'null' literal"
            r4.<init>(r5)
            throw r4
        L236:
            bsh.UtilEvalError r4 = new bsh.UtilEvalError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Use of invalid operator "
            r5.<init>(r0)
            java.lang.String[] r0 = bsh.ParserConstants.tokenImage
            r6 = r0[r6]
            java.lang.String r0 = " with array or List type"
            java.lang.String r5 = eh.a.r(r5, r6, r0)
            r4.<init>(r5)
            throw r4
        L24d:
            bsh.UtilEvalError r4 = new bsh.UtilEvalError
            java.lang.String r5 = "Use of non + operator with String"
            r4.<init>(r5)
            throw r4
        L255:
            bsh.UtilEvalError r4 = new bsh.UtilEvalError
            java.lang.String r5 = "illegal use of undefined variable, class, or 'void' literal"
            r4.<init>(r5)
            throw r4
    }

    public static java.lang.Object bigDecimalBinaryOperation(java.math.BigDecimal r0, java.math.BigDecimal r1, int r2) {
            switch(r2) {
                case 104: goto L32;
                case 105: goto L2d;
                case 106: goto L28;
                case 107: goto L23;
                default: goto L3;
            }
        L3:
            switch(r2) {
                case 114: goto L1e;
                case 115: goto L1e;
                case 116: goto L15;
                case 117: goto L15;
                case 118: goto Ld;
                case 119: goto Ld;
                case 120: goto Ld;
                case 121: goto Ld;
                case 122: goto Ld;
                case 123: goto Ld;
                default: goto L6;
            }
        L6:
            java.lang.String r0 = "Unimplemented binary float operator"
            bsh.j.f(r0)
            r0 = 0
            return r0
        Ld:
            bsh.UtilEvalError r0 = new bsh.UtilEvalError
            java.lang.String r1 = "Can't shift floatingpoint values"
            r0.<init>(r1)
            throw r0
        L15:
            int r1 = r1.intValue()
            java.math.BigDecimal r0 = r0.pow(r1)
            return r0
        L1e:
            java.math.BigDecimal r0 = r0.remainder(r1)
            return r0
        L23:
            java.math.BigDecimal r0 = r0.divide(r1)
            return r0
        L28:
            java.math.BigDecimal r0 = r0.multiply(r1)
            return r0
        L2d:
            java.math.BigDecimal r0 = r0.subtract(r1)
            return r0
        L32:
            java.math.BigDecimal r0 = r0.add(r1)
            return r0
    }

    public static java.math.BigDecimal bigDecimalUnaryOperation(java.math.BigDecimal r1, int r2) {
            r0 = 91
            if (r2 == r0) goto L21
            switch(r2) {
                case 102: goto L1a;
                case 103: goto L13;
                case 104: goto L12;
                case 105: goto Le;
                default: goto L7;
            }
        L7:
            java.lang.String r1 = "bad big decimal unaryOperation"
            bsh.j.f(r1)
            r1 = 0
            return r1
        Le:
            java.math.BigDecimal r1 = r1.negate()
        L12:
            return r1
        L13:
            java.math.BigDecimal r2 = java.math.BigDecimal.ONE
            java.math.BigDecimal r1 = r1.subtract(r2)
            return r1
        L1a:
            java.math.BigDecimal r2 = java.math.BigDecimal.ONE
            java.math.BigDecimal r1 = r1.add(r2)
            return r1
        L21:
            int r2 = r1.signum()
            r0 = 1
            if (r2 != r0) goto L2c
            java.math.BigDecimal r1 = r1.negate()
        L2c:
            return r1
    }

    public static java.lang.Object bigIntegerBinaryOperation(java.math.BigInteger r1, java.math.BigInteger r2, int r3) {
            switch(r3) {
                case 104: goto L87;
                case 105: goto L82;
                case 106: goto L7d;
                case 107: goto L78;
                case 108: goto L73;
                case 109: goto L73;
                case 110: goto L6e;
                case 111: goto L6e;
                case 112: goto L69;
                case 113: goto L69;
                case 114: goto L64;
                case 115: goto L64;
                case 116: goto L5b;
                case 117: goto L5b;
                case 118: goto L52;
                case 119: goto L52;
                case 120: goto L49;
                case 121: goto L49;
                case 122: goto La;
                case 123: goto La;
                default: goto L3;
            }
        L3:
            java.lang.String r1 = "Unimplemented binary integer operator"
            bsh.j.f(r1)
            r1 = 0
            return r1
        La:
            int r3 = r1.signum()
            if (r3 < 0) goto L19
            int r2 = r2.intValue()
            java.math.BigInteger r1 = r1.shiftRight(r2)
            return r1
        L19:
            java.math.BigInteger r3 = java.math.BigInteger.ONE
            r0 = 2
            java.lang.String r0 = r1.toString(r0)
            int r0 = r0.length()
            int r0 = r0 + 1
            java.math.BigInteger r0 = r3.shiftLeft(r0)
            java.math.BigInteger r1 = r1.subtract(r0)
            java.math.BigInteger r3 = r0.subtract(r3)
            int r0 = r2.intValue()
            int r0 = r0 + 1
            java.math.BigInteger r3 = r3.shiftRight(r0)
            int r2 = r2.intValue()
            java.math.BigInteger r1 = r1.shiftRight(r2)
            java.math.BigInteger r1 = r1.and(r3)
            return r1
        L49:
            int r2 = r2.intValue()
            java.math.BigInteger r1 = r1.shiftRight(r2)
            return r1
        L52:
            int r2 = r2.intValue()
            java.math.BigInteger r1 = r1.shiftLeft(r2)
            return r1
        L5b:
            int r2 = r2.intValue()
            java.math.BigInteger r1 = r1.pow(r2)
            return r1
        L64:
            java.math.BigInteger r1 = r1.mod(r2)
            return r1
        L69:
            java.math.BigInteger r1 = r1.xor(r2)
            return r1
        L6e:
            java.math.BigInteger r1 = r1.or(r2)
            return r1
        L73:
            java.math.BigInteger r1 = r1.and(r2)
            return r1
        L78:
            java.math.BigInteger r1 = r1.divide(r2)
            return r1
        L7d:
            java.math.BigInteger r1 = r1.multiply(r2)
            return r1
        L82:
            java.math.BigInteger r1 = r1.subtract(r2)
            return r1
        L87:
            java.math.BigInteger r1 = r1.add(r2)
            return r1
    }

    public static java.math.BigInteger bigIntegerUnaryOperation(java.math.BigInteger r1, int r2) {
            r0 = 91
            if (r2 == r0) goto L21
            switch(r2) {
                case 102: goto L1a;
                case 103: goto L13;
                case 104: goto L12;
                case 105: goto Le;
                default: goto L7;
            }
        L7:
            java.lang.String r1 = "bad big integer unaryOperation"
            bsh.j.f(r1)
            r1 = 0
            return r1
        Le:
            java.math.BigInteger r1 = r1.negate()
        L12:
            return r1
        L13:
            java.math.BigInteger r2 = java.math.BigInteger.ONE
            java.math.BigInteger r1 = r1.subtract(r2)
            return r1
        L1a:
            java.math.BigInteger r2 = java.math.BigInteger.ONE
            java.math.BigInteger r1 = r1.add(r2)
            return r1
        L21:
            java.math.BigInteger r1 = r1.not()
            return r1
    }

    public static java.lang.Object binaryOperation(java.lang.Object r5, java.lang.Object r6, int r7) {
            java.lang.Object r0 = bsh.Primitive.unwrap(r5)
            java.lang.Object r1 = bsh.Primitive.unwrap(r6)
            boolean r2 = bsh.Types.isNumeric(r0)
            if (r2 == 0) goto L21
            boolean r2 = bsh.Types.isNumeric(r1)
            if (r2 == 0) goto L21
            java.lang.Object[] r0 = promotePrimitives(r0, r1)
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            r0 = r0[r2]
            r4 = r1
            r1 = r0
            r0 = r4
        L21:
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r3 = r1.getClass()
            if (r2 != r3) goto L77
            java.lang.Object r7 = binaryOperationImpl(r0, r1, r7)     // Catch: java.lang.ArithmeticException -> L6e
            boolean r1 = r7 instanceof java.lang.Boolean
            if (r1 == 0) goto L41
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            if (r5 == 0) goto L3e
            bsh.Primitive r5 = bsh.Primitive.TRUE
            return r5
        L3e:
            bsh.Primitive r5 = bsh.Primitive.FALSE
            return r5
        L41:
            boolean r5 = r5 instanceof bsh.Primitive
            if (r5 == 0) goto L65
            boolean r5 = r6 instanceof bsh.Primitive
            if (r5 == 0) goto L65
            boolean r5 = bsh.Types.isFloatingpoint(r7)
            if (r5 == 0) goto L60
            java.lang.Class r5 = r0.getClass()
            java.lang.Class<java.math.BigDecimal> r6 = java.math.BigDecimal.class
            if (r5 != r6) goto L60
            java.lang.Class r5 = r7.getClass()
            java.lang.Object r5 = bsh.Primitive.wrap(r7, r5)
            return r5
        L60:
            bsh.Primitive r5 = bsh.Primitive.shrinkWrap(r7)
            return r5
        L65:
            bsh.Primitive r5 = bsh.Primitive.shrinkWrap(r7)
            java.lang.Object r5 = r5.getValue()
            return r5
        L6e:
            r5 = move-exception
            bsh.UtilTargetError r6 = new bsh.UtilTargetError
            java.lang.String r7 = "Arithemetic Exception in binary op"
            r6.<init>(r7, r5)
            throw r6
        L77:
            bsh.UtilEvalError r5 = new bsh.UtilEvalError
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Type mismatch in operator.  "
            r6.<init>(r7)
            java.lang.Class r7 = r0.getClass()
            r6.append(r7)
            java.lang.Class r7 = r1.getClass()
            java.lang.String r0 = " cannot be used with "
            r6.append(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    public static <T> java.lang.Object binaryOperationImpl(T r2, T r3, int r4) {
            r0 = 145(0x91, float:2.03E-43)
            if (r4 != r0) goto Lf
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r2.compareTo(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        Lf:
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L1c
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            java.lang.Boolean r2 = booleanBinaryOperation(r2, r3, r4)
            return r2
        L1c:
            java.util.List<java.lang.Integer> r0 = bsh.Operators.COMPARABLE_OPS
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L2f
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            java.lang.Boolean r2 = comparableBinaryBooleanOperations(r2, r3, r4)
            return r2
        L2f:
            boolean r0 = r2 instanceof java.math.BigInteger
            if (r0 == 0) goto L3c
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.lang.Object r2 = bigIntegerBinaryOperation(r2, r3, r4)
            return r2
        L3c:
            boolean r0 = r2 instanceof java.math.BigDecimal
            if (r0 == 0) goto L49
            java.math.BigDecimal r2 = (java.math.BigDecimal) r2
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.lang.Object r2 = bigDecimalBinaryOperation(r2, r3, r4)
            return r2
        L49:
            boolean r0 = bsh.Types.isFloatingpoint(r2)
            if (r0 == 0) goto L75
            boolean r0 = r2 instanceof java.lang.Float
            if (r0 == 0) goto L64
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            java.lang.Object r2 = floatBinaryOperation(r2, r3, r4)
            return r2
        L64:
            java.lang.Double r2 = (java.lang.Double) r2
            double r0 = r2.doubleValue()
            java.lang.Double r3 = (java.lang.Double) r3
            double r2 = r3.doubleValue()
            java.lang.Object r2 = doubleBinaryOperation(r0, r2, r4)
            return r2
        L75:
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto L8a
            java.lang.Long r2 = (java.lang.Long) r2
            long r0 = r2.longValue()
            java.lang.Long r3 = (java.lang.Long) r3
            long r2 = r3.longValue()
            java.lang.Object r2 = longBinaryOperation(r0, r2, r4)
            return r2
        L8a:
            bsh.UtilEvalError r2 = new bsh.UtilEvalError
            java.lang.String r3 = "Invalid types in binary operator"
            r2.<init>(r3)
            throw r2
    }

    public static java.lang.Boolean booleanBinaryOperation(java.lang.Boolean r4, java.lang.Boolean r5, int r6) {
            boolean r4 = r4.booleanValue()
            boolean r0 = r5.booleanValue()
            r1 = 92
            r2 = 0
            r3 = 1
            if (r6 == r1) goto L36
            switch(r6) {
                case 97: goto L2e;
                case 98: goto L2d;
                case 99: goto L2d;
                case 100: goto L2d;
                case 101: goto L2d;
                default: goto L11;
            }
        L11:
            switch(r6) {
                case 108: goto L27;
                case 109: goto L27;
                case 110: goto L21;
                case 111: goto L21;
                case 112: goto L1b;
                case 113: goto L1b;
                default: goto L14;
            }
        L14:
            java.lang.String r4 = "unimplemented binary operator"
            bsh.j.f(r4)
            r4 = 0
            return r4
        L1b:
            r4 = r4 ^ r0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L21:
            r4 = r4 | r0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L27:
            r4 = r4 & r0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        L2d:
            return r5
        L2e:
            if (r4 == r0) goto L31
            r2 = r3
        L31:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        L36:
            if (r4 != r0) goto L39
            r2 = r3
        L39:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
    }

    public static boolean booleanUnaryOperation(java.lang.Boolean r1, int r2) {
            boolean r1 = r1.booleanValue()
            r0 = 90
            if (r2 != r0) goto Lb
            r1 = r1 ^ 1
            return r1
        Lb:
            bsh.UtilEvalError r1 = new bsh.UtilEvalError
            java.lang.String r2 = "Operator inappropriate for boolean"
            r1.<init>(r2)
            throw r1
    }

    public static <T> java.lang.Boolean comparableBinaryBooleanOperations(java.lang.Comparable<T> r2, T r3, int r4) {
            r0 = 0
            r1 = 1
            switch(r4) {
                case 86: goto L41;
                case 87: goto L41;
                case 88: goto L35;
                case 89: goto L35;
                case 90: goto L5;
                case 91: goto L5;
                case 92: goto L5;
                case 93: goto L29;
                case 94: goto L29;
                case 95: goto L1d;
                case 96: goto L1d;
                case 97: goto L11;
                default: goto L5;
            }
        L5:
            int r2 = r2.compareTo(r3)
            if (r2 != 0) goto Lc
            r0 = r1
        Lc:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L11:
            int r2 = r2.compareTo(r3)
            if (r2 == 0) goto L18
            r0 = r1
        L18:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L1d:
            int r2 = r2.compareTo(r3)
            if (r2 < 0) goto L24
            r0 = r1
        L24:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L29:
            int r2 = r2.compareTo(r3)
            if (r2 > 0) goto L30
            r0 = r1
        L30:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L35:
            int r2 = r2.compareTo(r3)
            if (r2 >= 0) goto L3c
            r0 = r1
        L3c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L41:
            int r2 = r2.compareTo(r3)
            if (r2 <= 0) goto L48
            r0 = r1
        L48:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
    }

    public static java.lang.Object doubleBinaryOperation(double r4, double r6, int r8) {
            r0 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r2 = 0
            switch(r8) {
                case 104: goto L58;
                case 105: goto L42;
                case 106: goto L32;
                case 107: goto L2c;
                default: goto La;
            }
        La:
            switch(r8) {
                case 114: goto L26;
                case 115: goto L26;
                case 116: goto L16;
                case 117: goto L16;
                case 118: goto Le;
                case 119: goto Le;
                case 120: goto Le;
                case 121: goto Le;
                case 122: goto Le;
                case 123: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L61
        Le:
            bsh.UtilEvalError r4 = new bsh.UtilEvalError
            java.lang.String r5 = "Can't shift floatingpoint values"
            r4.<init>(r5)
            throw r4
        L16:
            double r0 = java.lang.Math.pow(r4, r6)
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L21
            goto L61
        L21:
            java.lang.Double r4 = java.lang.Double.valueOf(r0)
            return r4
        L26:
            double r4 = r4 % r6
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            return r4
        L2c:
            double r4 = r4 / r6
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            return r4
        L32:
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L3c
            double r0 = r0 / r4
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L3c
            goto L61
        L3c:
            double r4 = r4 * r6
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            return r4
        L42:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L52
            r0 = -4503599627370497(0xffefffffffffffff, double:-1.7976931348623157E308)
            double r0 = r0 - r4
            double r2 = -r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L52
            goto L61
        L52:
            double r4 = r4 - r6
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            return r4
        L58:
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L81
            double r0 = r0 - r4
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L81
        L61:
            java.util.List<java.lang.Integer> r0 = bsh.Operators.OVERFLOW_OPS
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L7a
            java.math.BigDecimal r4 = java.math.BigDecimal.valueOf(r4)
            java.math.BigDecimal r5 = java.math.BigDecimal.valueOf(r6)
            java.lang.Object r4 = bigDecimalBinaryOperation(r4, r5, r8)
            return r4
        L7a:
            java.lang.String r4 = "Unimplemented binary double operator"
            bsh.j.f(r4)
            r4 = 0
            return r4
        L81:
            double r4 = r4 + r6
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            return r4
    }

    public static double doubleUnaryOperation(java.lang.Double r4, int r5) {
            double r0 = r4.doubleValue()
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            switch(r5) {
                case 102: goto L16;
                case 103: goto L14;
                case 104: goto L13;
                case 105: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.String r4 = "bad double unaryOperation"
            bsh.j.f(r4)
            r4 = 0
            return r4
        L11:
            double r4 = -r0
            return r4
        L13:
            return r0
        L14:
            double r0 = r0 - r2
            return r0
        L16:
            double r0 = r0 + r2
            return r0
    }

    public static java.lang.Object floatBinaryOperation(float r5, float r6, int r7) {
            r0 = 0
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            switch(r7) {
                case 104: goto L58;
                case 105: goto L43;
                case 106: goto L32;
                case 107: goto L2c;
                default: goto L8;
            }
        L8:
            switch(r7) {
                case 114: goto L26;
                case 115: goto L26;
                case 116: goto L14;
                case 117: goto L14;
                case 118: goto Lc;
                case 119: goto Lc;
                case 120: goto Lc;
                case 121: goto Lc;
                case 122: goto Lc;
                case 123: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L62
        Lc:
            bsh.UtilEvalError r5 = new bsh.UtilEvalError
            java.lang.String r6 = "Can't shift floatingpoint values"
            r5.<init>(r6)
            throw r5
        L14:
            double r0 = (double) r5
            double r2 = (double) r6
            double r0 = java.lang.Math.pow(r0, r2)
            boolean r2 = java.lang.Double.isInfinite(r0)
            if (r2 == 0) goto L21
            goto L62
        L21:
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
        L26:
            float r5 = r5 % r6
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            return r5
        L2c:
            float r5 = r5 / r6
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            return r5
        L32:
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L3d
            float r2 = r2 / r5
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L3d
            goto L62
        L3d:
            float r5 = r5 * r6
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            return r5
        L43:
            double r2 = (double) r5
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L52
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            float r0 = r0 - r5
            float r1 = -r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L52
            goto L62
        L52:
            float r5 = r5 - r6
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            return r5
        L58:
            double r3 = (double) r5
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L84
            float r2 = r2 - r5
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L84
        L62:
            java.util.List<java.lang.Integer> r0 = bsh.Operators.OVERFLOW_OPS
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L7d
            double r0 = (double) r5
            java.math.BigDecimal r5 = java.math.BigDecimal.valueOf(r0)
            double r0 = (double) r6
            java.math.BigDecimal r6 = java.math.BigDecimal.valueOf(r0)
            java.lang.Object r5 = bigDecimalBinaryOperation(r5, r6, r7)
            return r5
        L7d:
            java.lang.String r5 = "Unimplemented binary double operator"
            bsh.j.f(r5)
            r5 = 0
            return r5
        L84:
            float r5 = r5 + r6
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            return r5
    }

    public static float floatUnaryOperation(java.lang.Float r1, int r2) {
            float r1 = r1.floatValue()
            r0 = 1065353216(0x3f800000, float:1.0)
            switch(r2) {
                case 102: goto L14;
                case 103: goto L12;
                case 104: goto L11;
                case 105: goto L10;
                default: goto L9;
            }
        L9:
            java.lang.String r1 = "bad float unaryOperation"
            bsh.j.f(r1)
            r1 = 0
            return r1
        L10:
            float r1 = -r1
        L11:
            return r1
        L12:
            float r1 = r1 - r0
            return r1
        L14:
            float r1 = r1 + r0
            return r1
    }

    public static int intUnaryOperation(java.lang.Integer r1, int r2) {
            int r1 = r1.intValue()
            r0 = 91
            if (r2 == r0) goto L1a
            switch(r2) {
                case 102: goto L17;
                case 103: goto L14;
                case 104: goto L13;
                case 105: goto L12;
                default: goto Lb;
            }
        Lb:
            java.lang.String r1 = "bad integer unaryOperation"
            bsh.j.f(r1)
            r1 = 0
            return r1
        L12:
            int r1 = -r1
        L13:
            return r1
        L14:
            int r1 = r1 + (-1)
            return r1
        L17:
            int r1 = r1 + 1
            return r1
        L1a:
            int r1 = ~r1
            return r1
    }

    public static java.lang.Object longBinaryOperation(long r4, long r6, int r8) {
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 0
            switch(r8) {
                case 104: goto L86;
                case 105: goto L73;
                case 106: goto L63;
                case 107: goto L5d;
                case 108: goto L57;
                case 109: goto L57;
                case 110: goto L51;
                case 111: goto L51;
                case 112: goto L4b;
                case 113: goto L4b;
                case 114: goto L45;
                case 115: goto L45;
                case 116: goto L21;
                case 117: goto L21;
                case 118: goto L1a;
                case 119: goto L1a;
                case 120: goto L13;
                case 121: goto L13;
                case 122: goto Lc;
                case 123: goto Lc;
                default: goto La;
            }
        La:
            goto L8f
        Lc:
            int r6 = (int) r6
            long r4 = r4 >>> r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L13:
            int r6 = (int) r6
            long r4 = r4 >> r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L1a:
            int r6 = (int) r6
            long r4 = r4 << r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L21:
            double r0 = (double) r4
            double r2 = (double) r6
            double r0 = java.lang.Math.pow(r0, r2)
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r0)
            java.math.BigInteger r2 = r2.toBigInteger()
            java.math.BigInteger r3 = bsh.Primitive.LONG_MIN
            int r3 = r2.compareTo(r3)
            if (r3 < 0) goto L8f
            java.math.BigInteger r3 = bsh.Primitive.LONG_MAX
            int r2 = r2.compareTo(r3)
            if (r2 > 0) goto L8f
            long r4 = (long) r0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L45:
            long r4 = r4 % r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L4b:
            long r4 = r4 ^ r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L51:
            long r4 = r4 | r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L57:
            long r4 = r4 & r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L5d:
            long r4 = r4 / r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L63:
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L6d
            long r0 = r0 / r4
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L6d
            goto L8f
        L6d:
            long r4 = r4 * r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L73:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L80
            r0 = -9223372036854775808
            long r0 = r0 - r4
            long r2 = -r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L80
            goto L8f
        L80:
            long r4 = r4 - r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L86:
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto Laf
            long r0 = r0 - r4
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto Laf
        L8f:
            java.util.List<java.lang.Integer> r0 = bsh.Operators.OVERFLOW_OPS
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto La8
            java.math.BigInteger r4 = java.math.BigInteger.valueOf(r4)
            java.math.BigInteger r5 = java.math.BigInteger.valueOf(r6)
            java.lang.Object r4 = bigIntegerBinaryOperation(r4, r5, r8)
            return r4
        La8:
            java.lang.String r4 = "Unimplemented binary long operator"
            bsh.j.f(r4)
            r4 = 0
            return r4
        Laf:
            long r4 = r4 + r6
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
    }

    public static long longUnaryOperation(java.lang.Long r4, int r5) {
            long r0 = r4.longValue()
            r4 = 91
            if (r5 == r4) goto L1c
            r2 = 1
            switch(r5) {
                case 102: goto L1a;
                case 103: goto L18;
                case 104: goto L17;
                case 105: goto L15;
                default: goto Ld;
            }
        Ld:
            java.lang.String r4 = "bad long unaryOperation"
            bsh.j.f(r4)
            r4 = 0
            return r4
        L15:
            long r4 = -r0
            return r4
        L17:
            return r0
        L18:
            long r0 = r0 - r2
            return r0
        L1a:
            long r0 = r0 + r2
            return r0
        L1c:
            long r4 = ~r0
            return r4
    }

    public static java.lang.Object[] promotePrimitives(java.lang.Object r4, java.lang.Object r5) {
            java.lang.Number r0 = promoteToInteger(r4)
            java.lang.Number r1 = promoteToInteger(r5)
            boolean r2 = r4 instanceof java.math.BigDecimal
            java.lang.Class<java.math.BigDecimal> r3 = java.math.BigDecimal.class
            if (r2 == 0) goto L18
            boolean r0 = r5 instanceof java.math.BigDecimal
            if (r0 != 0) goto L98
            java.lang.Object r5 = bsh.Primitive.castNumber(r3, r1)
            goto L98
        L18:
            boolean r2 = r5 instanceof java.math.BigDecimal
            if (r2 == 0) goto L22
            java.lang.Object r4 = bsh.Primitive.castNumber(r3, r0)
            goto L98
        L22:
            boolean r2 = bsh.Types.isFloatingpoint(r4)
            if (r2 != 0) goto L60
            boolean r2 = bsh.Types.isFloatingpoint(r5)
            if (r2 == 0) goto L2f
            goto L60
        L2f:
            boolean r2 = r4 instanceof java.math.BigInteger
            java.lang.Class<java.math.BigInteger> r3 = java.math.BigInteger.class
            if (r2 == 0) goto L3e
            boolean r0 = r5 instanceof java.math.BigInteger
            if (r0 != 0) goto L98
            java.lang.Object r5 = bsh.Primitive.castNumber(r3, r1)
            goto L98
        L3e:
            boolean r2 = r5 instanceof java.math.BigInteger
            if (r2 == 0) goto L47
            java.lang.Object r4 = bsh.Primitive.castNumber(r3, r0)
            goto L98
        L47:
            boolean r2 = r4 instanceof java.lang.Long
            if (r2 != 0) goto L53
            long r2 = r0.longValue()
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
        L53:
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 != 0) goto L98
            long r0 = r1.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            goto L98
        L60:
            boolean r2 = r4 instanceof java.lang.Double
            if (r2 != 0) goto L82
            boolean r3 = r5 instanceof java.lang.Double
            if (r3 == 0) goto L69
            goto L82
        L69:
            boolean r2 = r4 instanceof java.lang.Float
            if (r2 != 0) goto L75
            float r4 = r0.floatValue()
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
        L75:
            boolean r0 = r5 instanceof java.lang.Float
            if (r0 != 0) goto L98
            float r5 = r1.floatValue()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            goto L98
        L82:
            if (r2 != 0) goto L8c
            double r2 = r0.doubleValue()
            java.lang.Double r4 = java.lang.Double.valueOf(r2)
        L8c:
            boolean r0 = r5 instanceof java.lang.Double
            if (r0 != 0) goto L98
            double r0 = r1.doubleValue()
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
        L98:
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            return r4
    }

    public static java.lang.Number promoteToInteger(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.Character
            if (r0 == 0) goto Lf
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        Lf:
            boolean r0 = r1 instanceof java.lang.Byte
            if (r0 != 0) goto L1b
            boolean r0 = r1 instanceof java.lang.Short
            if (r0 == 0) goto L18
            goto L1b
        L18:
            java.lang.Number r1 = (java.lang.Number) r1
            return r1
        L1b:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
    }

    public static bsh.Primitive unaryOperation(bsh.Primitive r3, int r4) {
            bsh.Primitive r0 = bsh.Primitive.NULL
            if (r3 == r0) goto Ld4
            bsh.Primitive r0 = bsh.Primitive.VOID
            if (r3 == r0) goto Lcc
            java.lang.Class r0 = r3.getType()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            if (r0 != r1) goto L22
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = booleanUnaryOperation(r3, r4)
            if (r3 == 0) goto L1f
            bsh.Primitive r3 = bsh.Primitive.TRUE
            return r3
        L1f:
            bsh.Primitive r3 = bsh.Primitive.FALSE
            return r3
        L22:
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = promoteToInteger(r3)
            boolean r1 = r3 instanceof java.lang.Integer
            if (r1 == 0) goto L63
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = intUnaryOperation(r3, r4)
            r1 = 102(0x66, float:1.43E-43)
            if (r4 == r1) goto L3c
            r1 = 103(0x67, float:1.44E-43)
            if (r4 != r1) goto L5d
        L3c:
            java.lang.Class r4 = java.lang.Byte.TYPE
            if (r0 != r4) goto L47
            bsh.Primitive r4 = new bsh.Primitive
            byte r3 = (byte) r3
            r4.<init>(r3)
            return r4
        L47:
            java.lang.Class r4 = java.lang.Short.TYPE
            if (r0 != r4) goto L52
            bsh.Primitive r4 = new bsh.Primitive
            short r3 = (short) r3
            r4.<init>(r3)
            return r4
        L52:
            java.lang.Class r4 = java.lang.Character.TYPE
            if (r0 != r4) goto L5d
            bsh.Primitive r4 = new bsh.Primitive
            char r3 = (char) r3
            r4.<init>(r3)
            return r4
        L5d:
            bsh.Primitive r4 = new bsh.Primitive
            r4.<init>(r3)
            return r4
        L63:
            boolean r0 = r3 instanceof java.lang.Long
            if (r0 == 0) goto L79
            bsh.Primitive r0 = new bsh.Primitive
            long r1 = r3.longValue()
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            long r3 = longUnaryOperation(r3, r4)
            r0.<init>(r3)
            return r0
        L79:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L8f
            bsh.Primitive r0 = new bsh.Primitive
            float r3 = r3.floatValue()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            float r3 = floatUnaryOperation(r3, r4)
            r0.<init>(r3)
            return r0
        L8f:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto La5
            bsh.Primitive r0 = new bsh.Primitive
            double r1 = r3.doubleValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r1)
            double r3 = doubleUnaryOperation(r3, r4)
            r0.<init>(r3)
            return r0
        La5:
            boolean r0 = r3 instanceof java.math.BigInteger
            if (r0 == 0) goto Lb5
            bsh.Primitive r0 = new bsh.Primitive
            java.math.BigInteger r3 = (java.math.BigInteger) r3
            java.math.BigInteger r3 = bigIntegerUnaryOperation(r3, r4)
            r0.<init>(r3)
            return r0
        Lb5:
            boolean r0 = r3 instanceof java.math.BigDecimal
            if (r0 == 0) goto Lc5
            bsh.Primitive r0 = new bsh.Primitive
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            java.math.BigDecimal r3 = bigDecimalUnaryOperation(r3, r4)
            r0.<init>(r3)
            return r0
        Lc5:
            java.lang.String r3 = "An error occurred.  Please call technical support."
            bsh.j.f(r3)
            r3 = 0
            return r3
        Lcc:
            bsh.UtilEvalError r3 = new bsh.UtilEvalError
            java.lang.String r4 = "illegal use of undefined object or 'void' literal"
            r3.<init>(r4)
            throw r3
        Ld4:
            bsh.UtilEvalError r3 = new bsh.UtilEvalError
            java.lang.String r4 = "illegal use of null object or 'null' literal"
            r3.<init>(r4)
            throw r3
    }
}
