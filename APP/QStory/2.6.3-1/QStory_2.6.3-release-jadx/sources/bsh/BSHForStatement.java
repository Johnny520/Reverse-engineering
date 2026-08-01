package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHForStatement extends SimpleNode implements InterfaceC3448 {
    final int blockId;
    public boolean hasExpression;
    public boolean hasForInit;
    public boolean hasForUpdate;
    String label;

    public BSHForStatement(int i) {
        super(i);
        this.blockId = BlockNameSpace.blockCount.incrementAndGet();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public Object eval(CallStack callStack, Interpreter interpreter) {
        InterfaceC3452 interfaceC3452JjtGetChild;
        int i;
        InterfaceC3452 interfaceC3452JjtGetChild2;
        int i2;
        InterfaceC3452 interfaceC3452JjtGetChild3;
        String str;
        int i3 = 0;
        if (this.hasForInit) {
            interfaceC3452JjtGetChild = jjtGetChild(0);
            i3 = 1;
        } else {
            interfaceC3452JjtGetChild = null;
        }
        if (this.hasExpression) {
            i = i3 + 1;
            interfaceC3452JjtGetChild2 = jjtGetChild(i3);
        } else {
            i = i3;
            interfaceC3452JjtGetChild2 = null;
        }
        if (this.hasForUpdate) {
            i2 = i + 1;
            interfaceC3452JjtGetChild3 = jjtGetChild(i);
        } else {
            i2 = i;
            interfaceC3452JjtGetChild3 = null;
        }
        InterfaceC3452 interfaceC3452JjtGetChild4 = i2 < jjtGetNumChildren() ? jjtGetChild(i2) : null;
        NameSpace pVar = callStack.top();
        callStack.swap(new BlockNameSpace(pVar, this.blockId));
        try {
            if (this.hasForInit) {
                interfaceC3452JjtGetChild.eval(callStack, interpreter);
            }
            while (!Thread.interrupted() && (!this.hasExpression || BSHIfStatement.evaluateCondition(interfaceC3452JjtGetChild2, callStack, interpreter))) {
                if (interfaceC3452JjtGetChild4 != null) {
                    Object objEval = interfaceC3452JjtGetChild4 instanceof BSHBlock ? ((BSHBlock) interfaceC3452JjtGetChild4).eval(callStack, interpreter, null) : interfaceC3452JjtGetChild4.eval(callStack, interpreter);
                    if (objEval instanceof C3501) {
                        C3501 c3501 = (C3501) objEval;
                        String str2 = c3501.f8349;
                        if (str2 != null && ((str = this.label) == null || !str.equals(str2))) {
                            callStack.swap(pVar);
                            return objEval;
                        }
                        int i4 = c3501.f8351;
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
                    interfaceC3452JjtGetChild3.eval(callStack, interpreter);
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
