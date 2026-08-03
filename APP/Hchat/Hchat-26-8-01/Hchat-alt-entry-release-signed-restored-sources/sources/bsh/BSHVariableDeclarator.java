package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHVariableDeclarator extends SimpleNode {
    private static final long serialVersionUID = 1;
    public int dimensions;
    public String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHVariableDeclarator(int i9) {
        super(i9);
        this.dimensions = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int getArrayDims(BSHType bSHType) {
        int i9 = this.dimensions;
        if (i9 > 0) {
            return i9;
        }
        if (bSHType.getArrayDims() > 0) {
            return bSHType.getArrayDims();
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object eval(BSHType bSHType, Modifiers modifiers, CallStack callStack, Interpreter interpreter) {
        Object objEval = null;
        if (!modifiers.hasModifier("final") && !Primitive.isWrapperType(bSHType.getBaseType())) {
            objEval = Primitive.getDefaultValue(bSHType.getBaseType());
        }
        if (jjtGetNumChildren() > 0) {
            Node nodeJjtGetChild = jjtGetChild(0);
            objEval = nodeJjtGetChild instanceof BSHArrayInitializer ? ((BSHArrayInitializer) nodeJjtGetChild).eval(bSHType.getBaseType(), getArrayDims(bSHType), callStack, interpreter) : nodeJjtGetChild.eval(callStack, interpreter);
        }
        if (objEval != Primitive.VOID) {
            return objEval;
        }
        throw new EvalException("Void initializer.", this, callStack);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.name;
    }
}
