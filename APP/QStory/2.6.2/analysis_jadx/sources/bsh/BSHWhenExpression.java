package bsh;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHWhenExpression extends SimpleNode implements InterfaceC2614 {
    public BSHWhenExpression(int i) {
        super(i);
    }

    private boolean primitiveEquals(Object obj, Object obj2, CallStack callStack, InterfaceC2618 interfaceC2618) throws EvalError {
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
                    return Primitive.unwrap(AbstractC2617.m5243(obj, 92, obj2)).equals(Boolean.TRUE);
                } catch (UtilEvalError e) {
                    throw e.toEvalError("When value: " + interfaceC2618.getText() + ": ", this, callStack);
                }
            }
            if (obj == obj2) {
                return true;
            }
        }
        return false;
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
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
        InterfaceC2618 interfaceC2618JjtGetChild = jjtGetChild(0);
        Object objEval = interfaceC2618JjtGetChild.eval(callStack, interpreter);
        for (int i2 = 1; i2 < iJjtGetNumChildren; i2++) {
            BSHWhenEntry bSHWhenEntry = (BSHWhenEntry) jjtGetChild(i2);
            if (bSHWhenEntry.isElse) {
                return bSHWhenEntry.evalResult(callStack, interpreter);
            }
            for (int i3 = 0; i3 < bSHWhenEntry.numConditions; i3++) {
                if (primitiveEquals(objEval, bSHWhenEntry.jjtGetChild(i3).eval(callStack, interpreter), callStack, interfaceC2618JjtGetChild)) {
                    return bSHWhenEntry.evalResult(callStack, interpreter);
                }
            }
        }
        throw new EvalException("No matching when branch.", this, callStack);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return AbstractC0053.m146(new StringBuilder(), super.toString(), ": when");
    }
}
