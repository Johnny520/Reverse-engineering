package bsh;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class BSHLabeledStatement extends SimpleNode implements InterfaceC2615 {
    String label;

    public BSHLabeledStatement(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void add(InterfaceC2619 interfaceC2619) {
        super.add(interfaceC2619);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ void dump(String str) {
        super.dump(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r3.label.equals(r1) == false) goto L27;
     */
    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object eval(bsh.CallStack r4, bsh.Interpreter r5) throws bsh.EvalError {
        /*
            r3 = this;
            int r0 = r3.jjtGetNumChildren()
            if (r0 <= 0) goto L75
            r0 = 0
            bsh.飘花落叶言子世兰苏楪哲 r1 = r3.jjtGetChild(r0)
            boolean r1 = r1 instanceof bsh.BSHForStatement
            if (r1 == 0) goto L1a
            bsh.飘花落叶言子世兰苏楪哲 r1 = r3.jjtGetChild(r0)
            bsh.BSHForStatement r1 = (bsh.BSHForStatement) r1
            java.lang.String r2 = r3.label
            r1.label = r2
            goto L3f
        L1a:
            bsh.飘花落叶言子世兰苏楪哲 r1 = r3.jjtGetChild(r0)
            boolean r1 = r1 instanceof bsh.BSHEnhancedForStatement
            if (r1 == 0) goto L2d
            bsh.飘花落叶言子世兰苏楪哲 r1 = r3.jjtGetChild(r0)
            bsh.BSHEnhancedForStatement r1 = (bsh.BSHEnhancedForStatement) r1
            java.lang.String r2 = r3.label
            r1.label = r2
            goto L3f
        L2d:
            bsh.飘花落叶言子世兰苏楪哲 r1 = r3.jjtGetChild(r0)
            boolean r1 = r1 instanceof bsh.BSHWhileStatement
            if (r1 == 0) goto L3f
            bsh.飘花落叶言子世兰苏楪哲 r1 = r3.jjtGetChild(r0)
            bsh.BSHWhileStatement r1 = (bsh.BSHWhileStatement) r1
            java.lang.String r2 = r3.label
            r1.label = r2
        L3f:
            bsh.飘花落叶言子世兰苏楪哲 r0 = r3.jjtGetChild(r0)
            java.lang.Object r5 = r0.eval(r4, r5)
            boolean r0 = r5 instanceof bsh.C2668
            if (r0 == 0) goto L75
            r0 = r5
            bsh.飘花落叶言子苏楪兰哲世 r0 = (bsh.C2668) r0
            java.lang.String r1 = r0.f8004
            int r0 = r0.f8006
            r2 = 13
            if (r0 == r2) goto L6c
            r2 = 20
            if (r0 == r2) goto L5b
            goto L74
        L5b:
            java.lang.String r0 = r3.label
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L64
            goto L74
        L64:
            bsh.EvalError r5 = new bsh.EvalError
            java.lang.String r0 = "Continue cannot be used outside of a loop"
            r5.<init>(r0, r3, r4)
            throw r5
        L6c:
            java.lang.String r3 = r3.label
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L75
        L74:
            return r5
        L75:
            bsh.Primitive r3 = bsh.Primitive.VOID
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bsh.BSHLabeledStatement.eval(bsh.CallStack, bsh.Interpreter):java.lang.Object");
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ int getId() {
        return super.getId();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ int getLineNumber() {
        return super.getLineNumber();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ String getSourceFile() {
        return super.getSourceFile();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ String getText() {
        return super.getText();
    }

    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ boolean hasNext() {
        return super.hasNext();
    }

    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ boolean hasPrevious() {
        return super.hasPrevious();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ void jjtAddChild(InterfaceC2619 interfaceC2619, int i) {
        super.jjtAddChild(interfaceC2619, i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ void jjtClose() {
        super.jjtClose();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ InterfaceC2619 jjtGetChild(int i) {
        return super.jjtGetChild(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ InterfaceC2619[] jjtGetChildren() {
        return super.jjtGetChildren();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ int jjtGetNumChildren() {
        return super.jjtGetNumChildren();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ InterfaceC2619 jjtGetParent() {
        return super.jjtGetParent();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ void jjtOpen() {
        super.jjtOpen();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ void jjtSetParent(InterfaceC2619 interfaceC2619) {
        super.jjtSetParent(interfaceC2619);
    }

    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ InterfaceC2619 next() {
        return super.next();
    }

    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ int nextIndex() {
        return super.nextIndex();
    }

    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ InterfaceC2619 previous() {
        return super.previous();
    }

    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ int previousIndex() {
        return super.previousIndex();
    }

    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ void remove() {
        super.remove();
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void set(InterfaceC2619 interfaceC2619) {
        super.set(interfaceC2619);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ void setSourceFile(String str) {
        super.setSourceFile(str);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(": ");
        return AbstractC0053.m151(sb, this.label, ":");
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ String toString(String str) {
        return super.toString(str);
    }
}
