package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHVariableDeclarator extends SimpleNode {
    public int dimensions;
    public String name;

    public BSHVariableDeclarator(int i) {
        super(i);
        this.dimensions = 0;
    }

    private int getArrayDims(BSHType bSHType) {
        int i = this.dimensions;
        if (i > 0) {
            return i;
        }
        if (bSHType.getArrayDims() > 0) {
            return bSHType.getArrayDims();
        }
        return -1;
    }

    public Object eval(BSHType bSHType, Modifiers modifiers, CallStack callStack, Interpreter interpreter) {
        Object objEval = null;
        if (!modifiers.hasModifier("final") && !Primitive.isWrapperType(bSHType.getBaseType())) {
            objEval = Primitive.getDefaultValue(bSHType.getBaseType());
        }
        if (jjtGetNumChildren() > 0) {
            InterfaceC2619 interfaceC2619JjtGetChild = jjtGetChild(0);
            objEval = interfaceC2619JjtGetChild instanceof BSHArrayInitializer ? ((BSHArrayInitializer) interfaceC2619JjtGetChild).eval(bSHType.getBaseType(), getArrayDims(bSHType), callStack, interpreter) : interfaceC2619JjtGetChild.eval(callStack, interpreter);
        }
        if (objEval != Primitive.VOID) {
            return objEval;
        }
        throw new EvalException("Void initializer.", this, callStack);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.name;
    }
}
