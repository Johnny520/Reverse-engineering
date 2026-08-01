package bsh;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHSwitchStatement extends SimpleNode implements InterfaceC2615 {
    public BSHSwitchStatement(int i) {
        super(i);
    }

    private boolean primitiveEquals(Object obj, Object obj2, CallStack callStack, InterfaceC2619 interfaceC2619) throws EvalError {
        if (obj2 == Primitive.VOID) {
            return false;
        }
        if (!(obj instanceof Primitive) && !(obj2 instanceof Primitive)) {
            return obj.equals(obj2);
        }
        try {
            return Primitive.unwrap(AbstractC2618.m5288(obj, 92, obj2)).equals(Boolean.TRUE);
        } catch (UtilEvalError e) {
            throw e.toEvalError("Switch value: " + interfaceC2619.getText() + ": ", this, callStack);
        }
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalException {
        int i;
        int iJjtGetNumChildren = jjtGetNumChildren();
        InterfaceC2619 interfaceC2619JjtGetChild = jjtGetChild(0);
        Object objEval = interfaceC2619JjtGetChild.eval(callStack, interpreter);
        if (Primitive.unwrap(objEval) != null && objEval.getClass().isEnum()) {
            callStack.top().importStatic(objEval.getClass());
        }
        if (1 >= iJjtGetNumChildren) {
            throw new EvalException("Empty switch statement.", this, callStack);
        }
        BSHSwitchLabel bSHSwitchLabel = (BSHSwitchLabel) jjtGetChild(1);
        C2668 c2668 = null;
        int i2 = 2;
        while (i2 < iJjtGetNumChildren && c2668 == null) {
            if (bSHSwitchLabel.isDefault || primitiveEquals(objEval, bSHSwitchLabel.eval(callStack, interpreter), callStack, interfaceC2619JjtGetChild)) {
                while (i2 < iJjtGetNumChildren) {
                    i = i2 + 1;
                    InterfaceC2619 interfaceC2619JjtGetChild2 = jjtGetChild(i2);
                    if (!(interfaceC2619JjtGetChild2 instanceof BSHSwitchLabel)) {
                        Object objEval2 = interfaceC2619JjtGetChild2.eval(callStack, interpreter);
                        if (objEval2 instanceof C2668) {
                            c2668 = (C2668) objEval2;
                            i2 = i;
                            break;
                        }
                    }
                    i2 = i;
                }
            } else {
                while (i2 < iJjtGetNumChildren) {
                    i = i2 + 1;
                    InterfaceC2619 interfaceC2619JjtGetChild3 = jjtGetChild(i2);
                    if (interfaceC2619JjtGetChild3 instanceof BSHSwitchLabel) {
                        bSHSwitchLabel = (BSHSwitchLabel) interfaceC2619JjtGetChild3;
                        i2 = i;
                        break;
                        break;
                    }
                    i2 = i;
                }
            }
        }
        return (c2668 == null || c2668.f8006 != 47) ? Primitive.VOID : c2668;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return AbstractC0053.m151(new StringBuilder(), super.toString(), ": switch");
    }
}
