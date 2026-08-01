package bsh;

import androidx.activity.AbstractC0900;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHReturnStatement extends SimpleNode implements InterfaceC3448 {
    public int kind;
    public String label;

    public BSHReturnStatement(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public Object eval(CallStack callStack, Interpreter interpreter) {
        String str = this.label;
        if (str != null) {
            int i = this.kind;
            C3501 c3501 = new C3501();
            c3501.f8349 = null;
            c3501.f8350 = Primitive.VOID;
            c3501.f8351 = i;
            c3501.f8349 = str;
            c3501.f8348 = this;
            return c3501;
        }
        Object objEval = jjtGetNumChildren() > 0 ? jjtGetChild(0).eval(callStack, interpreter) : Primitive.VOID;
        int i2 = this.kind;
        C3501 c35012 = new C3501();
        c35012.f8349 = null;
        Primitive primitive = Primitive.TRUE;
        c35012.f8351 = i2;
        c35012.f8350 = objEval;
        c35012.f8348 = this;
        return c35012;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(": ");
        sb.append(InterfaceC3448.f8193[this.kind]);
        sb.append(" ");
        return AbstractC0900.m711(sb, this.label, ":");
    }
}
