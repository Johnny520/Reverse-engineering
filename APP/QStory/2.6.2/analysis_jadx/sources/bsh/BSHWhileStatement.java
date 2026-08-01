package bsh;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHWhileStatement extends SimpleNode implements InterfaceC2614 {
    boolean isDoStatement;
    String label;

    public BSHWhileStatement(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) {
        InterfaceC2618 interfaceC2618JjtGetChild;
        InterfaceC2618 interfaceC2618JjtGetChild2;
        int i;
        String str;
        int iJjtGetNumChildren = jjtGetNumChildren();
        if (this.isDoStatement) {
            interfaceC2618JjtGetChild2 = jjtGetChild(1);
            interfaceC2618JjtGetChild = jjtGetChild(0);
        } else {
            InterfaceC2618 interfaceC2618JjtGetChild3 = jjtGetChild(0);
            interfaceC2618JjtGetChild = iJjtGetNumChildren > 1 ? jjtGetChild(1) : null;
            interfaceC2618JjtGetChild2 = interfaceC2618JjtGetChild3;
        }
        for (boolean z = this.isDoStatement; !Thread.interrupted() && (z || BSHIfStatement.evaluateCondition(interfaceC2618JjtGetChild2, callStack, interpreter)); z = false) {
            if (interfaceC2618JjtGetChild != null) {
                Object objEval = interfaceC2618JjtGetChild instanceof BSHBlock ? ((BSHBlock) interfaceC2618JjtGetChild).eval(callStack, interpreter, null) : interfaceC2618JjtGetChild.eval(callStack, interpreter);
                if (objEval instanceof C2667) {
                    C2667 c2667 = (C2667) objEval;
                    String str2 = c2667.f8002;
                    if ((str2 != null && ((str = this.label) == null || !str.equals(str2))) || (i = c2667.f8004) == 47) {
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
