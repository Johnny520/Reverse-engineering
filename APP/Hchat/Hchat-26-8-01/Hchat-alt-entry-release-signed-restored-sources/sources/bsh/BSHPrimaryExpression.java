package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHPrimaryExpression extends SimpleNode {
    private static final long serialVersionUID = 1;
    private Object cached;
    boolean isArrayExpression;
    boolean isMapExpression;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHPrimaryExpression(int i9) {
        super(i9);
        this.cached = null;
        this.isArrayExpression = false;
        this.isMapExpression = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object eval(boolean z9, CallStack callStack, Interpreter interpreter) throws EvalError {
        Object obj;
        if (this.isArrayExpression && (obj = this.cached) != null) {
            return obj;
        }
        Object[] objArrJjtGetChildren = jjtGetChildren();
        Object lhs = objArrJjtGetChildren[0];
        for (int i9 = 1; i9 < objArrJjtGetChildren.length; i9++) {
            BSHPrimarySuffix bSHPrimarySuffix = (BSHPrimarySuffix) jjtGetChild(i9);
            if (bSHPrimarySuffix.operation == 5 && i9 != objArrJjtGetChildren.length - 1) {
                throw new EvalError("Method Reference must be the last suffix!", bSHPrimarySuffix, callStack);
            }
            lhs = bSHPrimarySuffix.doSuffix(lhs, z9, callStack, interpreter);
        }
        if (lhs instanceof Node) {
            if (lhs instanceof BSHAmbiguousName) {
                lhs = z9 ? ((BSHAmbiguousName) lhs).toLHS(callStack, interpreter) : ((BSHAmbiguousName) lhs).toObject(callStack, interpreter);
            } else {
                if (z9) {
                    throw new EvalException("Can't assign to prefix.", this, callStack);
                }
                lhs = ((Node) lhs).eval(callStack, interpreter);
            }
        }
        if (this.isMapExpression) {
            if (lhs == Primitive.VOID) {
                throw new EvalException("illegal use of undefined variable or 'void' literal", this, callStack);
            }
            lhs = new LHS(lhs);
        }
        if (this.isArrayExpression) {
            this.cached = lhs;
        }
        return lhs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void clearCache() {
        this.cached = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setArrayExpression(BSHArrayInitializer bSHArrayInitializer) {
        this.isArrayExpression = true;
        Node node = this.parent;
        if (!(node instanceof BSHAssignment) || ((BSHAssignment) node).operator == null) {
            return;
        }
        boolean z9 = ((BSHAssignment) node).operator.intValue() == 85;
        this.isMapExpression = z9;
        if (z9 && (bSHArrayInitializer.jjtGetParent() instanceof BSHArrayInitializer)) {
            bSHArrayInitializer.setMapInArray(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LHS toLHS(CallStack callStack, Interpreter interpreter) {
        return (LHS) eval(interpreter.getStrictJava() || !this.isMapExpression, callStack, interpreter);
    }

    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) {
        return eval(false, callStack, interpreter);
    }
}
