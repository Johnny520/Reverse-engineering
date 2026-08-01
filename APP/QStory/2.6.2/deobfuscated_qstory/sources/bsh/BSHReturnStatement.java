package bsh;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class BSHReturnStatement extends SimpleNode implements InterfaceC2614 {
    public int kind;
    public String label;

    public BSHReturnStatement(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
    public Object eval(CallStack callStack, Interpreter interpreter) {
        String str = this.label;
        if (str != null) {
            int i = this.kind;
            C2667 c2667 = new C2667();
            c2667.f8002 = null;
            c2667.f8003 = Primitive.VOID;
            c2667.f8004 = i;
            c2667.f8002 = str;
            c2667.f8001 = this;
            return c2667;
        }
        Object objEval = jjtGetNumChildren() > 0 ? jjtGetChild(0).eval(callStack, interpreter) : Primitive.VOID;
        int i2 = this.kind;
        C2667 c26672 = new C2667();
        c26672.f8002 = null;
        Primitive primitive = Primitive.TRUE;
        c26672.f8004 = i2;
        c26672.f8003 = objEval;
        c26672.f8001 = this;
        return c26672;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(": ");
        sb.append(InterfaceC2614.f7846[this.kind]);
        sb.append(" ");
        return AbstractC0053.m146(sb, this.label, ":");
    }
}
