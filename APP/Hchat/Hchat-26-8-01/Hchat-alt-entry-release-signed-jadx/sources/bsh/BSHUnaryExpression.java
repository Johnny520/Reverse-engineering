package bsh;

import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHUnaryExpression extends SimpleNode implements ParserConstants {
    private static final long serialVersionUID = 1;
    public int kind;
    public boolean postfix;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHUnaryExpression(int i9) {
        super(i9);
        this.postfix = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object lhsUnaryOperation(LHS lhs, boolean z9) throws UtilEvalError {
        Interpreter.debug("lhsUnaryOperation");
        Object value = lhs.getValue();
        Object objUnaryOperation = unaryOperation(value, this.kind);
        if (!this.postfix) {
            value = objUnaryOperation;
        }
        lhs.assign(objUnaryOperation, z9);
        return value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object unaryOperation(Object obj, int i9) throws UtilEvalError {
        if (obj instanceof Boolean) {
            obj = ((Boolean) obj).booleanValue() ? Primitive.TRUE : Primitive.FALSE;
        }
        if (obj instanceof Primitive) {
            return Operators.unaryOperation((Primitive) obj, i9);
        }
        throw new UtilEvalError(AbstractC0921a.m2255r(new StringBuilder("Unary operation "), ParserConstants.tokenImage[i9], " inappropriate for object"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        Node nodeJjtGetChild = jjtGetChild(0);
        try {
            int i9 = this.kind;
            if (i9 != 102 && i9 != 103) {
                return unaryOperation(nodeJjtGetChild.eval(callStack, interpreter), this.kind);
            }
            return lhsUnaryOperation(((BSHPrimaryExpression) nodeJjtGetChild).toLHS(callStack, interpreter), interpreter.getStrictJava());
        } catch (UtilEvalError e6) {
            throw e6.toEvalError(this, callStack);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + ParserConstants.tokenImage[this.kind];
    }
}
