package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHWhenEntry extends SimpleNode {
    boolean isElse;
    int numConditions;

    public BSHWhenEntry(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
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
