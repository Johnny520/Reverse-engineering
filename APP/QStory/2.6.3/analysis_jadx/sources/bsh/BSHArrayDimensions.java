package bsh;

import androidx.activity.AbstractC0053;

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

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalException {
        InterfaceC2619 interfaceC2619JjtGetChild = jjtGetChild(0);
        if (!(interfaceC2619JjtGetChild instanceof BSHArrayInitializer)) {
            this.definedDimensions = new int[this.numDefinedDims];
            for (int i = 0; i < this.numDefinedDims; i++) {
                try {
                    this.definedDimensions[i] = ((Integer) Primitive.castWrapper(Integer.TYPE, jjtGetChild(i).eval(callStack, interpreter))).intValue();
                } catch (Exception e) {
                    throw new EvalException(AbstractC0053.m162(i, "Array index: ", " length does not evaluate to an integer"), this, callStack, e);
                }
            }
            return Primitive.VOID;
        }
        Object objEval = ((BSHArrayInitializer) interfaceC2619JjtGetChild).eval(this.baseType, this.numUndefinedDims, callStack, interpreter);
        if (objEval.getClass().isArray()) {
            int[] iArrM5322 = AbstractC2629.m5322(objEval);
            this.definedDimensions = iArrM5322;
            if (-1 == this.numUndefinedDims) {
                this.numUndefinedDims = iArrM5322.length;
            }
            if (iArrM5322.length != this.numUndefinedDims) {
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
