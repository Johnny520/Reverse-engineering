package bsh;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHReturnType extends SimpleNode {
    public boolean isVoid;

    public BSHReturnType(int i) {
        super(i);
    }

    public Class<?> evalReturnType(CallStack callStack, Interpreter interpreter) {
        return this.isVoid ? Void.TYPE : getTypeNode().getType(callStack, interpreter);
    }

    public String getTypeDescriptor(CallStack callStack, Interpreter interpreter, String str) {
        return this.isVoid ? "V" : getTypeNode().getTypeDescriptor(callStack, interpreter, str);
    }

    public BSHType getTypeNode() {
        return (BSHType) jjtGetChild(0);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": void=" + this.isVoid;
    }
}
