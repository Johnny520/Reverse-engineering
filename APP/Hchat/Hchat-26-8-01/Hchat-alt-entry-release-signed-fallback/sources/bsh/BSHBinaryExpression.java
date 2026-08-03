package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHBinaryExpression extends bsh.SimpleNode implements bsh.ParserConstants {
    private static final long serialVersionUID = 1;
    public int kind;

    public BSHBinaryExpression(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private java.lang.Object checkNullValues(java.lang.Object r7, java.lang.Object r8, int r9, bsh.CallStack r10) {
            r6 = this;
            java.lang.String r0 = "bad operand types for binary operator "
            java.lang.String r1 = "null value with binary operator "
            bsh.Primitive r2 = bsh.Primitive.NULL
            if (r2 == r7) goto L9
            goto L57
        L9:
            bsh.Primitive r3 = bsh.Primitive.VOID
            if (r3 != r8) goto Le
            goto L57
        Le:
            boolean r3 = r8 instanceof java.lang.String     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r2 != r8) goto L34
            r8 = r9 ^ 1
            bsh.Variable r8 = r6.getVariableAtNode(r8, r10)     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            if (r8 == 0) goto L32
            java.lang.Class r2 = r8.getType()     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            if (r2 != r4) goto L25
            r2 = 1
        L23:
            r3 = r2
            goto L27
        L25:
            r2 = 0
            goto L23
        L27:
            java.lang.Class r8 = r8.getType()     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            goto L3c
        L2c:
            r8 = move-exception
            goto La3
        L2f:
            r7 = move-exception
            goto La7
        L32:
            r8 = 0
            goto L3c
        L34:
            java.lang.Object r8 = bsh.Primitive.unwrap(r8)     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            java.lang.Class r8 = r8.getClass()     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
        L3c:
            bsh.Variable r9 = r6.getVariableAtNode(r9, r10)     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            if (r9 != 0) goto L43
            goto L57
        L43:
            int r2 = r6.kind     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            r5 = 92
            if (r2 == r5) goto L4d
            r5 = 97
            if (r2 != r5) goto L58
        L4d:
            java.lang.Class r2 = r9.getType()     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            boolean r8 = r6.isComparableTypes(r2, r8, r10)     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            if (r8 == 0) goto L58
        L57:
            return r7
        L58:
            int r8 = r6.kind     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            r2 = 104(0x68, float:1.46E-43)
            if (r8 != r2) goto L69
            if (r3 != 0) goto L66
            java.lang.Class r8 = r9.getType()     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            if (r8 != r4) goto L69
        L66:
            java.lang.String r7 = "null"
            return r7
        L69:
            java.lang.Class r8 = r9.getType()     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            boolean r8 = r6.isWrapper(r8)     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            if (r8 == 0) goto L8b
            java.lang.NullPointerException r8 = new java.lang.NullPointerException     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            r9.<init>(r1)     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            java.lang.String[] r0 = bsh.ParserConstants.tokenImage     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            int r1 = r6.kind     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            r0 = r0[r1]     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            r9.append(r0)     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            java.lang.String r9 = r9.toString()     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            r8.<init>(r9)     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            throw r8     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
        L8b:
            bsh.EvalException r8 = new bsh.EvalException     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            r9.<init>(r0)     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            java.lang.String[] r0 = bsh.ParserConstants.tokenImage     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            int r1 = r6.kind     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            r0 = r0[r1]     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            r9.append(r0)     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            java.lang.String r9 = r9.toString()     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            r8.<init>(r9, r6, r10)     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
            throw r8     // Catch: bsh.UtilEvalError -> L2c java.lang.NullPointerException -> L2f
        La3:
            r8.toEvalError(r6, r10)
            return r7
        La7:
            bsh.TargetError r8 = new bsh.TargetError
            r8.<init>(r7, r6, r10)
            throw r8
    }

    private bsh.Variable getVariableAtNode(int r2, bsh.CallStack r3) {
            r1 = this;
            bsh.Node r0 = r1.jjtGetChild(r2)
            int r0 = r0.jjtGetNumChildren()
            if (r0 <= 0) goto L25
            bsh.Node r2 = r1.jjtGetChild(r2)
            r0 = 0
            bsh.Node r2 = r2.jjtGetChild(r0)
            boolean r0 = r2 instanceof bsh.BSHAmbiguousName
            if (r0 == 0) goto L25
            bsh.NameSpace r3 = r3.top()
            bsh.BSHAmbiguousName r2 = (bsh.BSHAmbiguousName) r2
            java.lang.String r2 = r2.text
            r0 = 1
            bsh.Variable r2 = r3.getVariableImpl(r2, r0)
            return r2
        L25:
            r2 = 0
            return r2
    }

    private boolean isComparableTypes(java.lang.Class<?> r4, java.lang.Class<?> r5, bsh.CallStack r6) {
            r3 = this;
            if (r5 == r4) goto L2d
            boolean r0 = r3.isSimilarTypes(r4, r5)
            if (r0 == 0) goto L9
            goto L2d
        L9:
            bsh.EvalException r0 = new bsh.EvalException
            java.lang.String r4 = bsh.StringUtil.typeString(r4)
            java.lang.String r5 = bsh.StringUtil.typeString(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "incomparable types: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " and "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4, r3, r6)
            throw r0
        L2d:
            r4 = 1
            return r4
    }

    private boolean isPrimitiveValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof bsh.Primitive
            if (r0 == 0) goto Le
            bsh.Primitive r0 = bsh.Primitive.NULL
            if (r2 == r0) goto Le
            bsh.Primitive r0 = bsh.Primitive.VOID
            if (r2 == r0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    private boolean isSimilarTypes(java.lang.Class<?> r2, java.lang.Class<?> r3) {
            r1 = this;
            if (r3 == 0) goto L11
            boolean r0 = r2.isAssignableFrom(r3)
            if (r0 != 0) goto L11
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    private boolean isWrapper(java.lang.Class<?> r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            boolean r1 = r1.isAssignableFrom(r4)
            r2 = 1
            if (r1 != 0) goto L2d
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            boolean r1 = r1.isAssignableFrom(r4)
            if (r1 == 0) goto L16
            goto L2d
        L16:
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            boolean r4 = r1.isAssignableFrom(r4)
            if (r4 == 0) goto L2c
            int r4 = r3.kind
            r1 = 92
            if (r4 == r1) goto L2b
            switch(r4) {
                case 97: goto L2b;
                case 98: goto L2b;
                case 99: goto L2b;
                case 100: goto L2b;
                case 101: goto L2b;
                default: goto L27;
            }
        L27:
            switch(r4) {
                case 108: goto L2b;
                case 109: goto L2b;
                case 110: goto L2b;
                case 111: goto L2b;
                case 112: goto L2b;
                case 113: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L2c
        L2b:
            return r2
        L2c:
            return r0
        L2d:
            int r4 = r3.kind
            switch(r4) {
                case 98: goto L33;
                case 99: goto L33;
                case 100: goto L33;
                case 101: goto L33;
                default: goto L32;
            }
        L32:
            return r2
        L33:
            return r0
    }

    private boolean isWrapper(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 != 0) goto Lf
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 != 0) goto Lf
            boolean r2 = r2 instanceof java.lang.Character
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r9, bsh.Interpreter r10) {
            r8 = this;
            r0 = 0
            bsh.Node r1 = r8.jjtGetChild(r0)
            java.lang.Object r1 = r1.eval(r9, r10)
            int r2 = r8.kind
            r3 = 36
            r4 = 1
            if (r2 != r3) goto L40
            bsh.Primitive r0 = bsh.Primitive.NULL
            if (r1 != r0) goto L17
            bsh.Primitive r9 = bsh.Primitive.FALSE
            return r9
        L17:
            bsh.Node r0 = r8.jjtGetChild(r4)
            bsh.BSHType r0 = (bsh.BSHType) r0
            java.lang.Class r9 = r0.getType(r9, r10)
            boolean r10 = r1 instanceof bsh.Primitive
            if (r10 == 0) goto L30
            java.lang.Class<bsh.Primitive> r10 = bsh.Primitive.class
            if (r9 != r10) goto L2c
            bsh.Primitive r9 = bsh.Primitive.TRUE
            return r9
        L2c:
            java.lang.Object r1 = bsh.Primitive.unwrap(r1)
        L30:
            java.lang.Class r10 = r1.getClass()
            boolean r9 = bsh.Types.isJavaBaseAssignable(r9, r10)
            if (r9 == 0) goto L3d
            bsh.Primitive r9 = bsh.Primitive.TRUE
            return r9
        L3d:
            bsh.Primitive r9 = bsh.Primitive.FALSE
            return r9
        L40:
            r3 = 100
            java.lang.Class r5 = java.lang.Boolean.TYPE
            if (r2 == r3) goto L4a
            r3 = 101(0x65, float:1.42E-43)
            if (r2 != r3) goto L66
        L4a:
            boolean r2 = r10.getStrictJava()
            if (r2 == 0) goto L59
            bsh.Primitive r2 = bsh.Primitive.FALSE
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L66
            return r2
        L59:
            bsh.Primitive r2 = bsh.Primitive.FALSE
            java.lang.Object r3 = bsh.Primitive.castWrapper(r5, r1)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L66
            goto L9a
        L66:
            int r2 = r8.kind
            r3 = 98
            r6 = 148(0x94, float:2.07E-43)
            if (r2 == r3) goto L74
            r3 = 99
            if (r2 == r3) goto L74
            if (r2 != r6) goto L90
        L74:
            boolean r2 = r10.getStrictJava()
            if (r2 == 0) goto L83
            bsh.Primitive r2 = bsh.Primitive.TRUE
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L90
            return r2
        L83:
            bsh.Primitive r2 = bsh.Primitive.TRUE
            java.lang.Object r3 = bsh.Primitive.castWrapper(r5, r1)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L90
            goto L9a
        L90:
            int r2 = r8.kind
            r3 = 147(0x93, float:2.06E-43)
            if (r2 != r3) goto L9b
            bsh.Primitive r2 = bsh.Primitive.NULL
            if (r2 == r1) goto L9b
        L9a:
            return r1
        L9b:
            bsh.Node r2 = r8.jjtGetChild(r4)
            java.lang.Object r2 = r2.eval(r9, r10)
            int r7 = r8.kind
            if (r7 == r3) goto L17f
            if (r7 != r6) goto Lab
            goto L17f
        Lab:
            boolean r3 = r10.getStrictJava()
            if (r3 != 0) goto Lc1
            int r3 = r8.kind
            switch(r3) {
                case 98: goto Lb7;
                case 99: goto Lb7;
                case 100: goto Lb7;
                case 101: goto Lb7;
                default: goto Lb6;
            }
        Lb6:
            goto Lc1
        Lb7:
            java.lang.Object r3 = bsh.Primitive.castWrapper(r5, r2)
            boolean r3 = r3 instanceof java.lang.Boolean
            if (r3 == 0) goto Lc1
            goto L17f
        Lc1:
            java.lang.Object r0 = r8.checkNullValues(r1, r2, r0, r9)
            java.lang.Object r1 = r8.checkNullValues(r2, r0, r4, r9)
            int r2 = r8.kind
            r3 = 92
            if (r2 == r3) goto Ld3
            r3 = 97
            if (r2 != r3) goto Ldf
        Ld3:
            boolean r2 = r8.isWrapper(r0)
            if (r2 == 0) goto Ldf
            boolean r2 = r8.isWrapper(r1)
            if (r2 != 0) goto Lf8
        Ldf:
            boolean r2 = r8.isWrapper(r0)
            if (r2 != 0) goto Leb
            boolean r2 = r8.isPrimitiveValue(r0)
            if (r2 == 0) goto Lf8
        Leb:
            boolean r2 = r8.isWrapper(r1)
            if (r2 != 0) goto L150
            boolean r2 = r8.isPrimitiveValue(r1)
            if (r2 == 0) goto Lf8
            goto L150
        Lf8:
            boolean r10 = r10.getStrictJava()
            if (r10 == 0) goto L143
            int r10 = r8.kind
            r2 = 104(0x68, float:1.46E-43)
            if (r10 == r2) goto L108
            r2 = 106(0x6a, float:1.49E-43)
            if (r10 != r2) goto L143
        L108:
            boolean r10 = r0 instanceof java.lang.String
            if (r10 != 0) goto L143
            boolean r10 = r1 instanceof java.lang.String
            if (r10 == 0) goto L111
            goto L143
        L111:
            bsh.EvalException r10 = new bsh.EvalException
            java.lang.String[] r2 = bsh.ParserConstants.tokenImage
            int r3 = r8.kind
            r2 = r2[r3]
            java.lang.String r0 = bsh.StringUtil.typeString(r0)
            java.lang.String r1 = bsh.StringUtil.typeString(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Bad operand types for binary operator "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = " first type: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = " second type: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r10.<init>(r0, r8, r9)
            throw r10
        L143:
            int r10 = r8.kind     // Catch: bsh.UtilEvalError -> L14a
            java.lang.Object r9 = bsh.Operators.arbitraryObjectsBinaryOperation(r0, r1, r10)     // Catch: bsh.UtilEvalError -> L14a
            return r9
        L14a:
            r10 = move-exception
            bsh.EvalError r9 = r10.toEvalError(r8, r9)
            throw r9
        L150:
            int r10 = r8.kind     // Catch: bsh.UtilEvalError -> L157
            java.lang.Object r9 = bsh.Operators.binaryOperation(r0, r1, r10)     // Catch: bsh.UtilEvalError -> L157
            return r9
        L157:
            r10 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed operation: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            java.lang.String[] r3 = bsh.ParserConstants.tokenImage
            int r4 = r8.kind
            r3 = r3[r4]
            r2.append(r3)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            bsh.EvalError r9 = r10.toEvalError(r0, r8, r9)
            throw r9
        L17f:
            return r2
    }

    @Override // bsh.SimpleNode
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String[] r1 = bsh.ParserConstants.tokenImage
            int r2 = r3.kind
            r1 = r1[r2]
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
