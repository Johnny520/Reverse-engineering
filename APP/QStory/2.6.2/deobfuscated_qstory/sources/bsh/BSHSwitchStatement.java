package bsh;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHSwitchStatement extends SimpleNode implements InterfaceC2614 {
    public BSHSwitchStatement(int i) {
        super(i);
    }

    private boolean primitiveEquals(Object obj, Object obj2, CallStack callStack, InterfaceC2618 interfaceC2618) throws EvalError {
        if (obj2 == Primitive.VOID) {
            return false;
        }
        if (!(obj instanceof Primitive) && !(obj2 instanceof Primitive)) {
            return obj.equals(obj2);
        }
        try {
            return Primitive.unwrap(AbstractC2617.m5243(obj, 92, obj2)).equals(Boolean.TRUE);
        } catch (UtilEvalError e) {
            throw e.toEvalError("Switch value: " + interfaceC2618.getText() + ": ", this, callStack);
        }
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalException {
        int i;
        int iJjtGetNumChildren = jjtGetNumChildren();
        InterfaceC2618 interfaceC2618JjtGetChild = jjtGetChild(0);
        Object objEval = interfaceC2618JjtGetChild.eval(callStack, interpreter);
        if (Primitive.unwrap(objEval) != null && objEval.getClass().isEnum()) {
            callStack.top().importStatic(objEval.getClass());
        }
        if (1 >= iJjtGetNumChildren) {
            throw new EvalException("Empty switch statement.", this, callStack);
        }
        BSHSwitchLabel bSHSwitchLabel = (BSHSwitchLabel) jjtGetChild(1);
        C2667 c2667 = null;
        int i2 = 2;
        while (i2 < iJjtGetNumChildren && c2667 == null) {
            if (bSHSwitchLabel.isDefault || primitiveEquals(objEval, bSHSwitchLabel.eval(callStack, interpreter), callStack, interfaceC2618JjtGetChild)) {
                while (i2 < iJjtGetNumChildren) {
                    i = i2 + 1;
                    InterfaceC2618 interfaceC2618JjtGetChild2 = jjtGetChild(i2);
                    if (!(interfaceC2618JjtGetChild2 instanceof BSHSwitchLabel)) {
                        Object objEval2 = interfaceC2618JjtGetChild2.eval(callStack, interpreter);
                        if (objEval2 instanceof C2667) {
                            c2667 = (C2667) objEval2;
                            i2 = i;
                            break;
                        }
                    }
                    i2 = i;
                }
            } else {
                while (i2 < iJjtGetNumChildren) {
                    i = i2 + 1;
                    InterfaceC2618 interfaceC2618JjtGetChild3 = jjtGetChild(i2);
                    if (interfaceC2618JjtGetChild3 instanceof BSHSwitchLabel) {
                        bSHSwitchLabel = (BSHSwitchLabel) interfaceC2618JjtGetChild3;
                        i2 = i;
                        break;
                        break;
                    }
                    i2 = i;
                }
            }
        }
        return (c2667 == null || c2667.f8004 != 47) ? Primitive.VOID : c2667;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return AbstractC0053.m146(new StringBuilder(), super.toString(), ": switch");
    }
}
