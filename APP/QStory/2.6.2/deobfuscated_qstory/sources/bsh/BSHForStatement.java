package bsh;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHForStatement extends SimpleNode implements InterfaceC2614 {
    final int blockId;
    public boolean hasExpression;
    public boolean hasForInit;
    public boolean hasForUpdate;
    String label;

    public BSHForStatement(int i) {
        super(i);
        this.blockId = BlockNameSpace.blockCount.incrementAndGet();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) {
        InterfaceC2618 interfaceC2618JjtGetChild;
        int i;
        InterfaceC2618 interfaceC2618JjtGetChild2;
        int i2;
        InterfaceC2618 interfaceC2618JjtGetChild3;
        String str;
        int i3 = 0;
        if (this.hasForInit) {
            interfaceC2618JjtGetChild = jjtGetChild(0);
            i3 = 1;
        } else {
            interfaceC2618JjtGetChild = null;
        }
        if (this.hasExpression) {
            i = i3 + 1;
            interfaceC2618JjtGetChild2 = jjtGetChild(i3);
        } else {
            i = i3;
            interfaceC2618JjtGetChild2 = null;
        }
        if (this.hasForUpdate) {
            i2 = i + 1;
            interfaceC2618JjtGetChild3 = jjtGetChild(i);
        } else {
            i2 = i;
            interfaceC2618JjtGetChild3 = null;
        }
        InterfaceC2618 interfaceC2618JjtGetChild4 = i2 < jjtGetNumChildren() ? jjtGetChild(i2) : null;
        NameSpace pVar = callStack.top();
        callStack.swap(new BlockNameSpace(pVar, this.blockId));
        try {
            if (this.hasForInit) {
                interfaceC2618JjtGetChild.eval(callStack, interpreter);
            }
            while (!Thread.interrupted() && (!this.hasExpression || BSHIfStatement.evaluateCondition(interfaceC2618JjtGetChild2, callStack, interpreter))) {
                if (interfaceC2618JjtGetChild4 != null) {
                    Object objEval = interfaceC2618JjtGetChild4 instanceof BSHBlock ? ((BSHBlock) interfaceC2618JjtGetChild4).eval(callStack, interpreter, null) : interfaceC2618JjtGetChild4.eval(callStack, interpreter);
                    if (objEval instanceof C2667) {
                        C2667 c2667 = (C2667) objEval;
                        String str2 = c2667.f8002;
                        if (str2 != null && ((str = this.label) == null || !str.equals(str2))) {
                            callStack.swap(pVar);
                            return objEval;
                        }
                        int i4 = c2667.f8004;
                        if (i4 != 47) {
                            if (i4 == 13) {
                                break;
                            }
                        } else {
                            callStack.swap(pVar);
                            return objEval;
                        }
                    }
                }
                if (this.hasForUpdate) {
                    interfaceC2618JjtGetChild3.eval(callStack, interpreter);
                }
            }
            Primitive primitive = Primitive.VOID;
            callStack.swap(pVar);
            return primitive;
        } catch (Throwable th) {
            callStack.swap(pVar);
            throw th;
        }
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.label + ": " + this.hasForInit + " ; " + this.hasExpression + " ; " + this.hasForUpdate;
    }
}
