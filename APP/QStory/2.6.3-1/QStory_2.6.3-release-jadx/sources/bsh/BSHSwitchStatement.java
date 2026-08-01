package bsh;

import androidx.activity.AbstractC0900;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHSwitchStatement extends SimpleNode implements InterfaceC3448 {
    public BSHSwitchStatement(int i) {
        super(i);
    }

    private boolean primitiveEquals(Object obj, Object obj2, CallStack callStack, InterfaceC3452 interfaceC3452) throws EvalError {
        if (obj2 == Primitive.VOID) {
            return false;
        }
        if (!(obj instanceof Primitive) && !(obj2 instanceof Primitive)) {
            return obj.equals(obj2);
        }
        try {
            return Primitive.unwrap(AbstractC3451.m5848(obj, 92, obj2)).equals(Boolean.TRUE);
        } catch (UtilEvalError e) {
            throw e.toEvalError("Switch value: " + interfaceC3452.getText() + ": ", this, callStack);
        }
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalException {
        int i;
        int iJjtGetNumChildren = jjtGetNumChildren();
        InterfaceC3452 interfaceC3452JjtGetChild = jjtGetChild(0);
        Object objEval = interfaceC3452JjtGetChild.eval(callStack, interpreter);
        if (Primitive.unwrap(objEval) != null && objEval.getClass().isEnum()) {
            callStack.top().importStatic(objEval.getClass());
        }
        if (1 >= iJjtGetNumChildren) {
            throw new EvalException("Empty switch statement.", this, callStack);
        }
        BSHSwitchLabel bSHSwitchLabel = (BSHSwitchLabel) jjtGetChild(1);
        C3501 c3501 = null;
        int i2 = 2;
        while (i2 < iJjtGetNumChildren && c3501 == null) {
            if (bSHSwitchLabel.isDefault || primitiveEquals(objEval, bSHSwitchLabel.eval(callStack, interpreter), callStack, interfaceC3452JjtGetChild)) {
                while (i2 < iJjtGetNumChildren) {
                    i = i2 + 1;
                    InterfaceC3452 interfaceC3452JjtGetChild2 = jjtGetChild(i2);
                    if (!(interfaceC3452JjtGetChild2 instanceof BSHSwitchLabel)) {
                        Object objEval2 = interfaceC3452JjtGetChild2.eval(callStack, interpreter);
                        if (objEval2 instanceof C3501) {
                            c3501 = (C3501) objEval2;
                            i2 = i;
                            break;
                        }
                    }
                    i2 = i;
                }
            } else {
                while (i2 < iJjtGetNumChildren) {
                    i = i2 + 1;
                    InterfaceC3452 interfaceC3452JjtGetChild3 = jjtGetChild(i2);
                    if (interfaceC3452JjtGetChild3 instanceof BSHSwitchLabel) {
                        bSHSwitchLabel = (BSHSwitchLabel) interfaceC3452JjtGetChild3;
                        i2 = i;
                        break;
                        break;
                    }
                    i2 = i;
                }
            }
        }
        return (c3501 == null || c3501.f8351 != 47) ? Primitive.VOID : c3501;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return AbstractC0900.m711(new StringBuilder(), super.toString(), ": switch");
    }
}
