package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHIfStatement extends SimpleNode {
    boolean isClosed;

    public BSHIfStatement(int i) {
        super(i);
    }

    public static boolean evaluateCondition(InterfaceC2619 interfaceC2619, CallStack callStack, Interpreter interpreter) throws EvalException {
        Object objEval = interfaceC2619.eval(callStack, interpreter);
        if (objEval != Primitive.VOID) {
            return ((Boolean) Primitive.castWrapper(Boolean.TYPE, objEval)).booleanValue();
        }
        throw new EvalException("Condition evaluates to void type", interfaceC2619, callStack);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object eval(bsh.CallStack r4, bsh.Interpreter r5) {
        /*
            r3 = this;
            r0 = 0
            bsh.飘花落叶言子世兰苏楪哲 r0 = r3.jjtGetChild(r0)
            boolean r0 = evaluateCondition(r0, r4, r5)
            r1 = 1
            if (r0 == 0) goto L19
            boolean r0 = r3.isClosed
            if (r0 != 0) goto L36
            bsh.飘花落叶言子世兰苏楪哲 r3 = r3.jjtGetChild(r1)
            java.lang.Object r3 = r3.eval(r4, r5)
            goto L37
        L19:
            int r0 = r3.jjtGetNumChildren()
            r2 = 2
            if (r0 <= r2) goto L29
            bsh.飘花落叶言子世兰苏楪哲 r3 = r3.jjtGetChild(r2)
            java.lang.Object r3 = r3.eval(r4, r5)
            goto L37
        L29:
            boolean r0 = r3.isClosed
            if (r0 == 0) goto L36
            bsh.飘花落叶言子世兰苏楪哲 r3 = r3.jjtGetChild(r1)
            java.lang.Object r3 = r3.eval(r4, r5)
            goto L37
        L36:
            r3 = 0
        L37:
            boolean r4 = r3 instanceof bsh.C2668
            if (r4 == 0) goto L3c
            return r3
        L3c:
            bsh.Primitive r3 = bsh.Primitive.VOID
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.BSHIfStatement.eval(bsh.CallStack, bsh.Interpreter):java.lang.Object");
    }
}
