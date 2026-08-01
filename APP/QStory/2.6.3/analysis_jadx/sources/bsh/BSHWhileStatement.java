package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHWhileStatement extends SimpleNode implements InterfaceC2615 {
    boolean isDoStatement;
    String label;

    public BSHWhileStatement(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public Object eval(CallStack callStack, Interpreter interpreter) {
        InterfaceC2619 interfaceC2619JjtGetChild;
        InterfaceC2619 interfaceC2619JjtGetChild2;
        int i;
        String str;
        int iJjtGetNumChildren = jjtGetNumChildren();
        if (this.isDoStatement) {
            interfaceC2619JjtGetChild2 = jjtGetChild(1);
            interfaceC2619JjtGetChild = jjtGetChild(0);
        } else {
            InterfaceC2619 interfaceC2619JjtGetChild3 = jjtGetChild(0);
            interfaceC2619JjtGetChild = iJjtGetNumChildren > 1 ? jjtGetChild(1) : null;
            interfaceC2619JjtGetChild2 = interfaceC2619JjtGetChild3;
        }
        for (boolean z = this.isDoStatement; !Thread.interrupted() && (z || BSHIfStatement.evaluateCondition(interfaceC2619JjtGetChild2, callStack, interpreter)); z = false) {
            if (interfaceC2619JjtGetChild != null) {
                Object objEval = interfaceC2619JjtGetChild instanceof BSHBlock ? ((BSHBlock) interfaceC2619JjtGetChild).eval(callStack, interpreter, null) : interfaceC2619JjtGetChild.eval(callStack, interpreter);
                if (objEval instanceof C2668) {
                    C2668 c2668 = (C2668) objEval;
                    String str2 = c2668.f8004;
                    if ((str2 != null && ((str = this.label) == null || !str.equals(str2))) || (i = c2668.f8006) == 47) {
                        return objEval;
                    }
                    if (i == 13) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return Primitive.VOID;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.label + ": do=" + this.isDoStatement;
    }
}
