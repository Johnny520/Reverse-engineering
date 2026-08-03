package bsh;

import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHArrayDimensions extends SimpleNode {
    private static final long serialVersionUID = 1;
    public Class<?> baseType;
    public int[] definedDimensions;
    public int numDefinedDims;
    public int numUndefinedDims;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHArrayDimensions(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addDefinedDimension() {
        this.numDefinedDims++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addUndefinedDimension() {
        this.numUndefinedDims++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalException {
        Node nodeJjtGetChild = jjtGetChild(0);
        if (!(nodeJjtGetChild instanceof BSHArrayInitializer)) {
            this.definedDimensions = new int[this.numDefinedDims];
            for (int i9 = 0; i9 < this.numDefinedDims; i9++) {
                try {
                    this.definedDimensions[i9] = ((Integer) Primitive.castWrapper(Integer.TYPE, jjtGetChild(i9).eval(callStack, interpreter))).intValue();
                } catch (Exception e6) {
                    throw new EvalException(AbstractC0921a.m2250m(i9, "Array index: ", " length does not evaluate to an integer"), this, callStack, e6);
                }
            }
            return Primitive.VOID;
        }
        Object objEval = ((BSHArrayInitializer) nodeJjtGetChild).eval(this.baseType, this.numUndefinedDims, callStack, interpreter);
        if (objEval.getClass().isArray()) {
            int[] iArrDimensions = BshArray.dimensions(objEval);
            this.definedDimensions = iArrDimensions;
            if (-1 == this.numUndefinedDims) {
                this.numUndefinedDims = iArrDimensions.length;
            }
            if (iArrDimensions.length != this.numUndefinedDims) {
                StringBuilder sb2 = new StringBuilder("Incompatible initializer. Allocation calls for a ");
                sb2.append(this.numUndefinedDims);
                sb2.append(" dimensional array, but initializer is a ");
                throw new EvalException(AbstractC2091b.m5163j(sb2, this.definedDimensions.length, " dimensional array"), this, callStack);
            }
        }
        return objEval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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
