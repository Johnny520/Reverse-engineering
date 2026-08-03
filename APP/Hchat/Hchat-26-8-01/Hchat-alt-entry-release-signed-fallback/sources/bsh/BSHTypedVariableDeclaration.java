package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHTypedVariableDeclaration extends bsh.SimpleNode {
    private static final long serialVersionUID = 1;
    private bsh.BSHVariableDeclarator[] bvda;
    public bsh.Modifiers modifiers;

    public BSHTypedVariableDeclaration(int r2) {
            r1 = this;
            r1.<init>(r2)
            bsh.Modifiers r2 = new bsh.Modifiers
            r0 = 3
            r2.<init>(r0)
            r1.modifiers = r2
            return
    }

    private bsh.BSHType getTypeNode() {
            r1 = this;
            r0 = 0
            bsh.Node r0 = r1.jjtGetChild(r0)
            bsh.BSHType r0 = (bsh.BSHType) r0
            return r0
    }

    private boolean isValType(bsh.BSHType r2) {
            r1 = this;
            bsh.Node r2 = r2.getTypeNode()
            boolean r0 = r2 instanceof bsh.BSHAmbiguousName
            if (r0 == 0) goto L16
            bsh.BSHAmbiguousName r2 = (bsh.BSHAmbiguousName) r2
            java.lang.String r2 = r2.text
            java.lang.String r0 = "val"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    @Override // bsh.SimpleNode, bsh.Node
    public java.lang.Object eval(bsh.CallStack r17, bsh.Interpreter r18) {
            r16 = this;
            r1 = r16
            r2 = r17
            r0 = r18
            java.lang.String r3 = "final"
            bsh.Primitive r4 = bsh.Primitive.VOID
            bsh.NameSpace r5 = r2.top()     // Catch: bsh.EvalError -> L2a
            bsh.BSHType r6 = r1.getTypeNode()     // Catch: bsh.EvalError -> L2a
            java.lang.Class r7 = r6.getType(r2, r0)     // Catch: bsh.EvalError -> L2a
            boolean r8 = r1.isValType(r6)     // Catch: bsh.EvalError -> L2a
            if (r8 == 0) goto L2d
            bsh.Modifiers r8 = r1.modifiers     // Catch: bsh.EvalError -> L2a
            boolean r8 = r8.hasModifier(r3)     // Catch: bsh.EvalError -> L2a
            if (r8 != 0) goto L2d
            bsh.Modifiers r8 = r1.modifiers     // Catch: bsh.EvalError -> L2a
            r8.addModifier(r3)     // Catch: bsh.EvalError -> L2a
            goto L2d
        L2a:
            r0 = move-exception
            goto Ld9
        L2d:
            bsh.BSHVariableDeclarator[] r3 = r1.getDeclarators()     // Catch: bsh.EvalError -> L2a
            r9 = 0
        L32:
            int r10 = r3.length     // Catch: bsh.EvalError -> L2a
            if (r9 >= r10) goto Ld8
            r4 = r3[r9]     // Catch: bsh.EvalError -> L2a
            bsh.Modifiers r10 = r1.modifiers     // Catch: bsh.EvalError -> L2a
            java.lang.Object r10 = r4.eval(r6, r10, r2, r0)     // Catch: bsh.EvalError -> L2a
            boolean r11 = r5.isClass     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            if (r11 == 0) goto L72
            java.lang.Object r11 = r5.classInstance     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            java.lang.String r12 = "static"
            if (r11 == 0) goto L5e
            bsh.LHS r13 = new bsh.LHS     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            java.lang.Class<?> r14 = r5.classStatic     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            java.lang.String r15 = r4.name     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            bsh.Modifiers r8 = r1.modifiers     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            boolean r8 = r8.hasModifier(r12)     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            bsh.Invocable r8 = bsh.Reflect.resolveJavaField(r14, r15, r8)     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            r13.<init>(r11, r8)     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            goto L73
        L5b:
            r0 = move-exception
            goto Ld3
        L5e:
            bsh.LHS r13 = new bsh.LHS     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            java.lang.Class<?> r8 = r5.classStatic     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            java.lang.String r11 = r4.name     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            bsh.Modifiers r14 = r1.modifiers     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            boolean r12 = r14.hasModifier(r12)     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            bsh.Invocable r11 = bsh.Reflect.resolveJavaField(r8, r11, r12)     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            r13.<init>(r8, r11)     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            goto L73
        L72:
            r13 = 0
        L73:
            if (r13 == 0) goto L8d
            bsh.Invocable r8 = r13.field     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            if (r8 == 0) goto L8d
            bsh.Variable r8 = new bsh.Variable     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            java.lang.String r11 = r4.name     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            r8.<init>(r11, r7, r13)     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            bsh.Modifiers r11 = r1.modifiers     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            r8.modifiers = r11     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            r11 = 1
            r8.setValue(r10, r11)     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            r5.setVariableImpl(r8)     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
        L8b:
            r12 = 0
            goto Lc3
        L8d:
            boolean r8 = r0.getStrictJava()     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            if (r8 == 0) goto Laa
            boolean r8 = r10 instanceof bsh.Primitive     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            if (r8 == 0) goto Laa
            r8 = r10
            bsh.Primitive r8 = (bsh.Primitive) r8     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            boolean r8 = r8.isNumber()     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            if (r8 == 0) goto Laa
            bsh.Primitive r10 = (bsh.Primitive) r10     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            java.lang.Number r8 = r10.numberValue()     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            java.lang.Object r10 = bsh.Primitive.castNumberStrictJava(r7, r8)     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
        Laa:
            java.lang.String r8 = r4.name     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            bsh.Modifiers r11 = r1.modifiers     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            r5.setTypedVariable(r8, r7, r10, r11)     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            boolean r8 = r5.isMethod     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            if (r8 != 0) goto L8b
            bsh.BshClassManager r8 = r0.getClassManager()     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            java.lang.String r11 = r4.name     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            r12 = 0
            bsh.Variable r11 = r5.getVariableImpl(r11, r12)     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            r8.addListener(r11)     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
        Lc3:
            boolean r8 = r5.isClass     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            if (r8 != 0) goto Lce
            java.lang.String r4 = r4.name     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            java.lang.Object r4 = r5.getVariable(r4)     // Catch: bsh.EvalError -> L2a bsh.UtilEvalError -> L5b
            goto Lcf
        Lce:
            r4 = r10
        Lcf:
            int r9 = r9 + 1
            goto L32
        Ld3:
            bsh.EvalError r0 = r0.toEvalError(r1, r2)     // Catch: bsh.EvalError -> L2a
            throw r0     // Catch: bsh.EvalError -> L2a
        Ld8:
            return r4
        Ld9:
            java.lang.String r2 = "Typed variable declaration"
            bsh.EvalError r0 = r0.reThrow(r2)
            throw r0
    }

    public java.lang.Class<?> evalType(bsh.CallStack r2, bsh.Interpreter r3) {
            r1 = this;
            bsh.BSHType r0 = r1.getTypeNode()
            java.lang.Class r2 = r0.getType(r2, r3)
            return r2
    }

    public bsh.BSHVariableDeclarator[] getDeclarators() {
            r5 = this;
            bsh.BSHVariableDeclarator[] r0 = r5.bvda
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r5.jjtGetNumChildren()
            int r1 = r0 + (-1)
            bsh.BSHVariableDeclarator[] r1 = new bsh.BSHVariableDeclarator[r1]
            r5.bvda = r1
            r1 = 1
        L10:
            bsh.BSHVariableDeclarator[] r2 = r5.bvda
            if (r1 >= r0) goto L21
            int r3 = r1 + (-1)
            bsh.Node r4 = r5.jjtGetChild(r1)
            bsh.BSHVariableDeclarator r4 = (bsh.BSHVariableDeclarator) r4
            r2[r3] = r4
            int r1 = r1 + 1
            goto L10
        L21:
            return r2
    }

    @Override // bsh.SimpleNode
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            bsh.Modifiers r1 = r2.modifiers
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
