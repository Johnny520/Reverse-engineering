package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
