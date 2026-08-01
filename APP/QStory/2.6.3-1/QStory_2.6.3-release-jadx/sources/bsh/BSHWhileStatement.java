package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHWhileStatement extends SimpleNode implements InterfaceC3448 {
    boolean isDoStatement;
    String label;

    public BSHWhileStatement(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public Object eval(CallStack callStack, Interpreter interpreter) {
        InterfaceC3452 interfaceC3452JjtGetChild;
        InterfaceC3452 interfaceC3452JjtGetChild2;
        int i;
        String str;
        int iJjtGetNumChildren = jjtGetNumChildren();
        if (this.isDoStatement) {
            interfaceC3452JjtGetChild2 = jjtGetChild(1);
            interfaceC3452JjtGetChild = jjtGetChild(0);
        } else {
            InterfaceC3452 interfaceC3452JjtGetChild3 = jjtGetChild(0);
            interfaceC3452JjtGetChild = iJjtGetNumChildren > 1 ? jjtGetChild(1) : null;
            interfaceC3452JjtGetChild2 = interfaceC3452JjtGetChild3;
        }
        for (boolean z = this.isDoStatement; !Thread.interrupted() && (z || BSHIfStatement.evaluateCondition(interfaceC3452JjtGetChild2, callStack, interpreter)); z = false) {
            if (interfaceC3452JjtGetChild != null) {
                Object objEval = interfaceC3452JjtGetChild instanceof BSHBlock ? ((BSHBlock) interfaceC3452JjtGetChild).eval(callStack, interpreter, null) : interfaceC3452JjtGetChild.eval(callStack, interpreter);
                if (objEval instanceof C3501) {
                    C3501 c3501 = (C3501) objEval;
                    String str2 = c3501.f8349;
                    if ((str2 != null && ((str = this.label) == null || !str.equals(str2))) || (i = c3501.f8351) == 47) {
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
