package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHSwitchLabel extends SimpleNode {
    boolean isDefault;

    public BSHSwitchLabel(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public Object eval(CallStack callStack, Interpreter interpreter) {
        return jjtGetChild(0).eval(callStack, interpreter);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(": ");
        sb.append(this.isDefault ? "default" : "case");
        return sb.toString();
    }
}
