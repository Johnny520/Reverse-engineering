package bsh;

import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHReturnStatement extends SimpleNode implements ParserConstants {
    private static final long serialVersionUID = 1;
    public int kind;
    public String label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHReturnStatement(int i9) {
        super(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public Object eval(CallStack callStack, Interpreter interpreter) {
        String str = this.label;
        if (str != null) {
            return new ReturnControl(this.kind, str, (Node) this);
        }
        return new ReturnControl(this.kind, jjtGetNumChildren() > 0 ? jjtGetChild(0).eval(callStack, interpreter) : Primitive.VOID, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(": ");
        sb2.append(ParserConstants.tokenImage[this.kind]);
        sb2.append(" ");
        return AbstractC0921a.m2255r(sb2, this.label, ":");
    }
}
