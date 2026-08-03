package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHAssignment extends bsh.SimpleNode implements bsh.ParserConstants {
    private static final long serialVersionUID = 1;
    public java.lang.Integer operator;

    public BSHAssignment(int r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private java.lang.Object operation(java.lang.Object r4, java.lang.Object r5, int r6) {
            r3 = this;
            boolean r0 = r4 instanceof java.lang.String
            if (r0 != 0) goto L6f
            java.lang.Class r0 = r4.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto Lf
            goto L6f
        Lf:
            bsh.Primitive r0 = bsh.Primitive.NULL
            if (r5 == r0) goto L67
            boolean r0 = r4 instanceof java.lang.Boolean
            if (r0 != 0) goto L23
            boolean r0 = r4 instanceof java.lang.Character
            if (r0 != 0) goto L23
            boolean r0 = r4 instanceof java.lang.Number
            if (r0 != 0) goto L23
            boolean r0 = r4 instanceof bsh.Primitive
            if (r0 == 0) goto L34
        L23:
            boolean r0 = r5 instanceof java.lang.Boolean
            if (r0 != 0) goto L62
            boolean r0 = r5 instanceof java.lang.Character
            if (r0 != 0) goto L62
            boolean r0 = r5 instanceof java.lang.Number
            if (r0 != 0) goto L62
            boolean r0 = r5 instanceof bsh.Primitive
            if (r0 == 0) goto L34
            goto L62
        L34:
            bsh.UtilEvalError r0 = new bsh.UtilEvalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Non primitive value in operator: "
            r1.<init>(r2)
            java.lang.Class r4 = r4.getClass()
            r1.append(r4)
            java.lang.String[] r4 = bsh.ParserConstants.tokenImage
            r4 = r4[r6]
            java.lang.Class r5 = r5.getClass()
            java.lang.String r6 = " "
            r1.append(r6)
            r1.append(r4)
            r1.append(r6)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L62:
            java.lang.Object r4 = bsh.Operators.binaryOperation(r4, r5, r6)
            return r4
        L67:
            bsh.UtilEvalError r4 = new bsh.UtilEvalError
            java.lang.String r5 = "Illegal use of null object or 'null' literal"
            r4.<init>(r5)
            throw r4
        L6f:
            java.lang.Object r4 = bsh.Operators.arbitraryObjectsBinaryOperation(r4, r5, r6)
            return r4
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r8, bsh.Interpreter r9) {
            r7 = this;
            java.lang.Integer r0 = r7.operator
            r1 = 0
            if (r0 != 0) goto L11
            bsh.Node r0 = r7.jjtGetChild(r1)     // Catch: bsh.SafeNavigate -> Le
            java.lang.Object r8 = r0.eval(r8, r9)     // Catch: bsh.SafeNavigate -> Le
            return r8
        Le:
            bsh.Primitive r8 = bsh.Primitive.NULL
            return r8
        L11:
            bsh.Node r0 = r7.jjtGetChild(r1)
            bsh.BSHPrimaryExpression r0 = (bsh.BSHPrimaryExpression) r0
            boolean r1 = r9.getStrictJava()
            bsh.LHS r0 = r0.toLHS(r8, r9)
            java.lang.Integer r2 = r7.operator
            int r2 = r2.intValue()
            r3 = 85
            if (r2 == r3) goto L34
            java.lang.Object r2 = r0.getValue()     // Catch: bsh.UtilEvalError -> L2e
            goto L35
        L2e:
            r9 = move-exception
            bsh.EvalError r8 = r9.toEvalError(r7, r8)
            throw r8
        L34:
            r2 = 0
        L35:
            java.lang.Integer r4 = r7.operator
            int r4 = r4.intValue()
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L44
            bsh.Primitive r4 = bsh.Primitive.NULL
            if (r4 == r2) goto L44
            return r2
        L44:
            r4 = 1
            bsh.Node r6 = r7.jjtGetChild(r4)
            java.lang.Object r9 = r6.eval(r8, r9)
            bsh.Primitive r6 = bsh.Primitive.VOID
            if (r9 == r6) goto L118
            java.lang.Integer r6 = r7.operator     // Catch: bsh.UtilEvalError -> L66
            int r6 = r6.intValue()     // Catch: bsh.UtilEvalError -> L66
            if (r6 == r3) goto L100
            if (r6 == r5) goto Lfb
            switch(r6) {
                case 124: goto Le2;
                case 125: goto Ld7;
                case 126: goto Lcc;
                case 127: goto Lc1;
                case 128: goto Lb6;
                case 129: goto Lb6;
                case 130: goto Lab;
                case 131: goto Lab;
                case 132: goto La0;
                case 133: goto La0;
                case 134: goto L95;
                case 135: goto L95;
                case 136: goto L8a;
                case 137: goto L8a;
                case 138: goto L7f;
                case 139: goto L7f;
                case 140: goto L74;
                case 141: goto L74;
                case 142: goto L69;
                case 143: goto L69;
                default: goto L5e;
            }     // Catch: bsh.UtilEvalError -> L66
        L5e:
            bsh.InterpreterError r9 = new bsh.InterpreterError     // Catch: bsh.UtilEvalError -> L66
            java.lang.String r0 = "unimplemented operator in assignment BSH"
            r9.<init>(r0)     // Catch: bsh.UtilEvalError -> L66
            throw r9     // Catch: bsh.UtilEvalError -> L66
        L66:
            r9 = move-exception
            goto L113
        L69:
            r3 = 122(0x7a, float:1.71E-43)
            java.lang.Object r9 = r7.operation(r2, r9, r3)     // Catch: bsh.UtilEvalError -> L66
            java.lang.Object r8 = r0.assign(r9, r1)     // Catch: bsh.UtilEvalError -> L66
            return r8
        L74:
            r3 = 120(0x78, float:1.68E-43)
            java.lang.Object r9 = r7.operation(r2, r9, r3)     // Catch: bsh.UtilEvalError -> L66
            java.lang.Object r8 = r0.assign(r9, r1)     // Catch: bsh.UtilEvalError -> L66
            return r8
        L7f:
            r3 = 118(0x76, float:1.65E-43)
            java.lang.Object r9 = r7.operation(r2, r9, r3)     // Catch: bsh.UtilEvalError -> L66
            java.lang.Object r8 = r0.assign(r9, r1)     // Catch: bsh.UtilEvalError -> L66
            return r8
        L8a:
            r3 = 116(0x74, float:1.63E-43)
            java.lang.Object r9 = r7.operation(r2, r9, r3)     // Catch: bsh.UtilEvalError -> L66
            java.lang.Object r8 = r0.assign(r9, r1)     // Catch: bsh.UtilEvalError -> L66
            return r8
        L95:
            r3 = 114(0x72, float:1.6E-43)
            java.lang.Object r9 = r7.operation(r2, r9, r3)     // Catch: bsh.UtilEvalError -> L66
            java.lang.Object r8 = r0.assign(r9, r1)     // Catch: bsh.UtilEvalError -> L66
            return r8
        La0:
            r3 = 112(0x70, float:1.57E-43)
            java.lang.Object r9 = r7.operation(r2, r9, r3)     // Catch: bsh.UtilEvalError -> L66
            java.lang.Object r8 = r0.assign(r9, r1)     // Catch: bsh.UtilEvalError -> L66
            return r8
        Lab:
            r3 = 110(0x6e, float:1.54E-43)
            java.lang.Object r9 = r7.operation(r2, r9, r3)     // Catch: bsh.UtilEvalError -> L66
            java.lang.Object r8 = r0.assign(r9, r1)     // Catch: bsh.UtilEvalError -> L66
            return r8
        Lb6:
            r3 = 108(0x6c, float:1.51E-43)
            java.lang.Object r9 = r7.operation(r2, r9, r3)     // Catch: bsh.UtilEvalError -> L66
            java.lang.Object r8 = r0.assign(r9, r1)     // Catch: bsh.UtilEvalError -> L66
            return r8
        Lc1:
            r3 = 107(0x6b, float:1.5E-43)
            java.lang.Object r9 = r7.operation(r2, r9, r3)     // Catch: bsh.UtilEvalError -> L66
            java.lang.Object r8 = r0.assign(r9, r1)     // Catch: bsh.UtilEvalError -> L66
            return r8
        Lcc:
            r3 = 106(0x6a, float:1.49E-43)
            java.lang.Object r9 = r7.operation(r2, r9, r3)     // Catch: bsh.UtilEvalError -> L66
            java.lang.Object r8 = r0.assign(r9, r1)     // Catch: bsh.UtilEvalError -> L66
            return r8
        Ld7:
            r3 = 105(0x69, float:1.47E-43)
            java.lang.Object r9 = r7.operation(r2, r9, r3)     // Catch: bsh.UtilEvalError -> L66
            java.lang.Object r8 = r0.assign(r9, r1)     // Catch: bsh.UtilEvalError -> L66
            return r8
        Le2:
            bsh.Primitive r3 = bsh.Primitive.NULL     // Catch: bsh.UtilEvalError -> L66
            if (r3 != r2) goto Lf0
            java.lang.Class r3 = r0.getType()     // Catch: bsh.UtilEvalError -> L66
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            if (r3 != r4) goto Lf0
            java.lang.String r2 = "null"
        Lf0:
            r3 = 104(0x68, float:1.46E-43)
            java.lang.Object r9 = r7.operation(r2, r9, r3)     // Catch: bsh.UtilEvalError -> L66
            java.lang.Object r8 = r0.assign(r9, r1)     // Catch: bsh.UtilEvalError -> L66
            return r8
        Lfb:
            java.lang.Object r8 = r0.assign(r9, r1)     // Catch: bsh.UtilEvalError -> L66
            return r8
        L100:
            boolean r2 = r0.isFinal()     // Catch: bsh.UtilEvalError -> L66
            if (r2 == 0) goto L10e
            bsh.Variable r0 = r0.getVariable()     // Catch: bsh.UtilEvalError -> L66
            r0.setValue(r9, r4)     // Catch: bsh.UtilEvalError -> L66
            return r9
        L10e:
            java.lang.Object r8 = r0.assign(r9, r1)     // Catch: bsh.UtilEvalError -> L66
            return r8
        L113:
            bsh.EvalError r8 = r9.toEvalError(r7, r8)
            throw r8
        L118:
            bsh.EvalException r9 = new bsh.EvalException
            java.lang.String r0 = "illegal void assignment"
            r9.<init>(r0, r7, r8)
            throw r9
    }

    @Override // bsh.SimpleNode
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.Integer r1 = r4.operator
            if (r1 != 0) goto L13
            java.lang.String r1 = ""
            goto L2b
        L13:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ": "
            r1.<init>(r2)
            java.lang.String[] r2 = bsh.ParserConstants.tokenImage
            java.lang.Integer r3 = r4.operator
            int r3 = r3.intValue()
            r2 = r2[r3]
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L2b:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
