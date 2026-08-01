package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHPrimaryExpression extends SimpleNode {
    private static final long serialVersionUID = 1;
    private Object cached;
    boolean isArrayExpression;
    boolean isMapExpression;

    public BSHPrimaryExpression(int i) {
        super(i);
        this.cached = null;
        this.isArrayExpression = false;
        this.isMapExpression = false;
    }

    private Object eval(boolean z, CallStack callStack, Interpreter interpreter) throws EvalError {
        Object obj;
        if (this.isArrayExpression && (obj = this.cached) != null) {
            return obj;
        }
        Object[] objArrJjtGetChildren = jjtGetChildren();
        Object lhs = objArrJjtGetChildren[0];
        for (int i = 1; i < objArrJjtGetChildren.length; i++) {
            BSHPrimarySuffix bSHPrimarySuffix = (BSHPrimarySuffix) jjtGetChild(i);
            if (bSHPrimarySuffix.operation == 5 && i != objArrJjtGetChildren.length - 1) {
                throw new EvalError("Method Reference must be the last suffix!", bSHPrimarySuffix, callStack);
            }
            lhs = bSHPrimarySuffix.doSuffix(lhs, z, callStack, interpreter);
        }
        if (lhs instanceof InterfaceC2619) {
            if (lhs instanceof BSHAmbiguousName) {
                lhs = z ? ((BSHAmbiguousName) lhs).toLHS(callStack, interpreter) : ((BSHAmbiguousName) lhs).toObject(callStack, interpreter);
            } else {
                if (z) {
                    throw new EvalException("Can't assign to prefix.", this, callStack);
                }
                lhs = ((InterfaceC2619) lhs).eval(callStack, interpreter);
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

    public void clearCache() {
        this.cached = null;
    }

    public void setArrayExpression(BSHArrayInitializer bSHArrayInitializer) {
        this.isArrayExpression = true;
        InterfaceC2619 interfaceC2619 = this.parent;
        if (!(interfaceC2619 instanceof BSHAssignment) || ((BSHAssignment) interfaceC2619).operator == null) {
            return;
        }
        boolean z = ((BSHAssignment) interfaceC2619).operator.intValue() == 85;
        this.isMapExpression = z;
        if (z && (bSHArrayInitializer.jjtGetParent() instanceof BSHArrayInitializer)) {
            bSHArrayInitializer.setMapInArray(true);
        }
    }

    public LHS toLHS(CallStack callStack, Interpreter interpreter) {
        return (LHS) eval(interpreter.getStrictJava() || !this.isMapExpression, callStack, interpreter);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public Object eval(CallStack callStack, Interpreter interpreter) {
        return eval(false, callStack, interpreter);
    }
}
