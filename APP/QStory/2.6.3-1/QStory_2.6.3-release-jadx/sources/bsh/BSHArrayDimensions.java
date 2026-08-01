package bsh;

import androidx.activity.AbstractC0900;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalException {
        InterfaceC3452 interfaceC3452JjtGetChild = jjtGetChild(0);
        if (!(interfaceC3452JjtGetChild instanceof BSHArrayInitializer)) {
            this.definedDimensions = new int[this.numDefinedDims];
            for (int i = 0; i < this.numDefinedDims; i++) {
                try {
                    this.definedDimensions[i] = ((Integer) Primitive.castWrapper(Integer.TYPE, jjtGetChild(i).eval(callStack, interpreter))).intValue();
                } catch (Exception e) {
                    throw new EvalException(AbstractC0900.m722(i, "Array index: ", " length does not evaluate to an integer"), this, callStack, e);
                }
            }
            return Primitive.VOID;
        }
        Object objEval = ((BSHArrayInitializer) interfaceC3452JjtGetChild).eval(this.baseType, this.numUndefinedDims, callStack, interpreter);
        if (objEval.getClass().isArray()) {
            int[] iArrM5882 = AbstractC3462.m5882(objEval);
            this.definedDimensions = iArrM5882;
            if (-1 == this.numUndefinedDims) {
                this.numUndefinedDims = iArrM5882.length;
            }
            if (iArrM5882.length != this.numUndefinedDims) {
                StringBuilder sb = new StringBuilder("Incompatible initializer. Allocation calls for a ");
                sb.append(this.numUndefinedDims);
                sb.append(" dimensional array, but initializer is a ");
                throw new EvalException(AbstractC0900.m707(sb, " dimensional array", this.definedDimensions.length), this, callStack);
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
