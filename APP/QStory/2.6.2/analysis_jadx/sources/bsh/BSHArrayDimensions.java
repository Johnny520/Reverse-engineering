package bsh;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHArrayDimensions extends SimpleNode {
    private static final long serialVersionUID = 1;
    public Class<?> baseType;
    public int[] definedDimensions;
    public int numDefinedDims;
    public int numUndefinedDims;

    public BSHArrayDimensions(int i) {
        super(i);
    }

    public void addDefinedDimension() {
        this.numDefinedDims++;
    }

    public void addUndefinedDimension() {
        this.numUndefinedDims++;
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalException {
        InterfaceC2618 interfaceC2618JjtGetChild = jjtGetChild(0);
        if (!(interfaceC2618JjtGetChild instanceof BSHArrayInitializer)) {
            this.definedDimensions = new int[this.numDefinedDims];
            for (int i = 0; i < this.numDefinedDims; i++) {
                try {
                    this.definedDimensions[i] = ((Integer) Primitive.castWrapper(Integer.TYPE, jjtGetChild(i).eval(callStack, interpreter))).intValue();
                } catch (Exception e) {
                    throw new EvalException(AbstractC0053.m161(i, "Array index: ", " length does not evaluate to an integer"), this, callStack, e);
                }
            }
            return Primitive.VOID;
        }
        Object objEval = ((BSHArrayInitializer) interfaceC2618JjtGetChild).eval(this.baseType, this.numUndefinedDims, callStack, interpreter);
        if (objEval.getClass().isArray()) {
            int[] iArrM5277 = AbstractC2628.m5277(objEval);
            this.definedDimensions = iArrM5277;
            if (-1 == this.numUndefinedDims) {
                this.numUndefinedDims = iArrM5277.length;
            }
            if (iArrM5277.length != this.numUndefinedDims) {
                StringBuilder sb = new StringBuilder("Incompatible initializer. Allocation calls for a ");
                sb.append(this.numUndefinedDims);
                sb.append(" dimensional array, but initializer is a ");
                throw new EvalException(AbstractC0053.m147(sb, " dimensional array", this.definedDimensions.length), this, callStack);
            }
        }
        return objEval;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.numDefinedDims + ", " + this.numUndefinedDims;
    }

    public Object eval(Class<?> cls, CallStack callStack, Interpreter interpreter) {
        Interpreter.debug("array base type = ", cls);
        this.baseType = cls;
        return eval(callStack, interpreter);
    }
}
