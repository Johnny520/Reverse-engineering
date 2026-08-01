package bsh;

import androidx.activity.AbstractC0900;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHWhenExpression extends SimpleNode implements InterfaceC3448 {
    public BSHWhenExpression(int i) {
        super(i);
    }

    private boolean primitiveEquals(Object obj, Object obj2, CallStack callStack, InterfaceC3452 interfaceC3452) throws EvalError {
        Primitive primitive = Primitive.VOID;
        if (obj != primitive && obj2 != primitive) {
            Primitive primitive2 = Primitive.NULL;
            if (obj == primitive2) {
                obj = null;
            }
            if (obj2 == primitive2) {
                obj2 = null;
            }
            if (obj != null && obj2 != null) {
                if (!(obj instanceof Primitive) && !(obj2 instanceof Primitive)) {
                    return obj.equals(obj2);
                }
                try {
                    return Primitive.unwrap(AbstractC3451.m5848(obj, 92, obj2)).equals(Boolean.TRUE);
                } catch (UtilEvalError e) {
                    throw e.toEvalError("When value: " + interfaceC3452.getText() + ": ", this, callStack);
                }
            }
            if (obj == obj2) {
                return true;
            }
        }
        return false;
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalException {
        int iJjtGetNumChildren = jjtGetNumChildren();
        if (iJjtGetNumChildren < 2) {
            throw new EvalException("Empty when expression.", this, callStack);
        }
        for (int i = 1; i < iJjtGetNumChildren; i++) {
            if (((BSHWhenEntry) jjtGetChild(i)).isElse && i != iJjtGetNumChildren - 1) {
                throw new EvalException("Else branch must be the last one in when expression.", this, callStack);
            }
        }
        InterfaceC3452 interfaceC3452JjtGetChild = jjtGetChild(0);
        Object objEval = interfaceC3452JjtGetChild.eval(callStack, interpreter);
        for (int i2 = 1; i2 < iJjtGetNumChildren; i2++) {
            BSHWhenEntry bSHWhenEntry = (BSHWhenEntry) jjtGetChild(i2);
            if (bSHWhenEntry.isElse) {
                return bSHWhenEntry.evalResult(callStack, interpreter);
            }
            for (int i3 = 0; i3 < bSHWhenEntry.numConditions; i3++) {
                if (primitiveEquals(objEval, bSHWhenEntry.jjtGetChild(i3).eval(callStack, interpreter), callStack, interfaceC3452JjtGetChild)) {
                    return bSHWhenEntry.evalResult(callStack, interpreter);
                }
            }
        }
        throw new EvalException("No matching when branch.", this, callStack);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return AbstractC0900.m711(new StringBuilder(), super.toString(), ": when");
    }
}
