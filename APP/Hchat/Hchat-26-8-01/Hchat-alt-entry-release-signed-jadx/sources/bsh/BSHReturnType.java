package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHReturnType extends SimpleNode {
    private static final long serialVersionUID = 1;
    public boolean isVoid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHReturnType(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> evalReturnType(CallStack callStack, Interpreter interpreter) {
        return this.isVoid ? Void.TYPE : getTypeNode().getType(callStack, interpreter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getTypeDescriptor(CallStack callStack, Interpreter interpreter, String str) {
        return this.isVoid ? "V" : getTypeNode().getTypeDescriptor(callStack, interpreter, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHType getTypeNode() {
        return (BSHType) jjtGetChild(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": void=" + this.isVoid;
    }
}
