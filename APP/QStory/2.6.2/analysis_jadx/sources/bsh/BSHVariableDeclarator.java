package bsh;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
            InterfaceC2618 interfaceC2618JjtGetChild = jjtGetChild(0);
            objEval = interfaceC2618JjtGetChild instanceof BSHArrayInitializer ? ((BSHArrayInitializer) interfaceC2618JjtGetChild).eval(bSHType.getBaseType(), getArrayDims(bSHType), callStack, interpreter) : interfaceC2618JjtGetChild.eval(callStack, interpreter);
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
