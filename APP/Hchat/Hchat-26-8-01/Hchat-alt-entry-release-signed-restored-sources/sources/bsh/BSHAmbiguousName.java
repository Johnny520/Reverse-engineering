package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHAmbiguousName extends SimpleNode {
    private static final long serialVersionUID = 1;
    public String text;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHAmbiguousName(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) {
        throw new InterpreterError("Don't know how to eval an ambiguous name!  Use toObject() if you want an object.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Name getName(NameSpace nameSpace) {
        return nameSpace.getNameResolver(this.text);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> toClass(CallStack callStack, Interpreter interpreter) {
        try {
            return getName(callStack.top()).toClass();
        } catch (UtilEvalError e6) {
            throw e6.toEvalError(this, callStack);
        } catch (ClassNotFoundException e7) {
            throw new EvalException(e7.getMessage(), this, callStack, e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LHS toLHS(CallStack callStack, Interpreter interpreter) throws EvalError {
        try {
            return getName(callStack.top()).toLHS(callStack, interpreter);
        } catch (UtilEvalError e6) {
            throw e6.toEvalError(this, callStack);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object toObject(CallStack callStack, Interpreter interpreter, boolean z9) throws EvalError {
        try {
            return getName(callStack.top()).toObject(callStack, interpreter, z9);
        } catch (UtilEvalError e6) {
            throw e6.toEvalError(this, callStack);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.text;
    }

    public Object toObject(CallStack callStack, Interpreter interpreter) {
        return toObject(callStack, interpreter, false);
    }
}
