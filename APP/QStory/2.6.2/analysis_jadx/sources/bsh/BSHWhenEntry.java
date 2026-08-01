package bsh;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHWhenEntry extends SimpleNode {
    boolean isElse;
    int numConditions;

    public BSHWhenEntry(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) {
        return evalResult(callStack, interpreter);
    }

    public Object evalResult(CallStack callStack, Interpreter interpreter) {
        return jjtGetChild(this.numConditions).eval(callStack, interpreter);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(": ");
        sb.append(this.isElse ? "else" : "case");
        return sb.toString();
    }
}
