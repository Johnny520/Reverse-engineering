package bsh;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHReturnStatement extends SimpleNode implements InterfaceC2615 {
    public int kind;
    public String label;

    public BSHReturnStatement(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public Object eval(CallStack callStack, Interpreter interpreter) {
        String str = this.label;
        if (str != null) {
            int i = this.kind;
            C2668 c2668 = new C2668();
            c2668.f8004 = null;
            c2668.f8005 = Primitive.VOID;
            c2668.f8006 = i;
            c2668.f8004 = str;
            c2668.f8003 = this;
            return c2668;
        }
        Object objEval = jjtGetNumChildren() > 0 ? jjtGetChild(0).eval(callStack, interpreter) : Primitive.VOID;
        int i2 = this.kind;
        C2668 c26682 = new C2668();
        c26682.f8004 = null;
        Primitive primitive = Primitive.TRUE;
        c26682.f8006 = i2;
        c26682.f8005 = objEval;
        c26682.f8003 = this;
        return c26682;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(": ");
        sb.append(InterfaceC2615.f7848[this.kind]);
        sb.append(" ");
        return AbstractC0053.m151(sb, this.label, ":");
    }
}
