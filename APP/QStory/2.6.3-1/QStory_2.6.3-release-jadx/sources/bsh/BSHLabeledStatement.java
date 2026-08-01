package bsh;

import androidx.activity.AbstractC0900;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class BSHLabeledStatement extends SimpleNode implements InterfaceC3448 {
    String label;

    public BSHLabeledStatement(int i) {
        super(i);
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void add(InterfaceC3452 interfaceC3452) {
        super.add(interfaceC3452);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ void dump(String str) {
        super.dump(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r3.label.equals(r1) == false) goto L27;
     */
    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object eval(CallStack callStack, Interpreter interpreter) throws EvalError {
        if (jjtGetNumChildren() > 0) {
            if (jjtGetChild(0) instanceof BSHForStatement) {
                ((BSHForStatement) jjtGetChild(0)).label = this.label;
            } else if (jjtGetChild(0) instanceof BSHEnhancedForStatement) {
                ((BSHEnhancedForStatement) jjtGetChild(0)).label = this.label;
            } else if (jjtGetChild(0) instanceof BSHWhileStatement) {
                ((BSHWhileStatement) jjtGetChild(0)).label = this.label;
            }
            Object objEval = jjtGetChild(0).eval(callStack, interpreter);
            if (objEval instanceof C3501) {
                C3501 c3501 = (C3501) objEval;
                String str = c3501.f8349;
                int i = c3501.f8351;
                if (i != 13) {
                    if (i == 20 && this.label.equals(str)) {
                        throw new EvalError("Continue cannot be used outside of a loop", this, callStack);
                    }
                }
                return objEval;
            }
        }
        return Primitive.VOID;
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ int getId() {
        return super.getId();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ int getLineNumber() {
        return super.getLineNumber();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ String getSourceFile() {
        return super.getSourceFile();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
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

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ void jjtAddChild(InterfaceC3452 interfaceC3452, int i) {
        super.jjtAddChild(interfaceC3452, i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ void jjtClose() {
        super.jjtClose();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ InterfaceC3452 jjtGetChild(int i) {
        return super.jjtGetChild(i);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ InterfaceC3452[] jjtGetChildren() {
        return super.jjtGetChildren();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ int jjtGetNumChildren() {
        return super.jjtGetNumChildren();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ InterfaceC3452 jjtGetParent() {
        return super.jjtGetParent();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ void jjtOpen() {
        super.jjtOpen();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ void jjtSetParent(InterfaceC3452 interfaceC3452) {
        super.jjtSetParent(interfaceC3452);
    }

    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ InterfaceC3452 next() {
        return super.next();
    }

    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ int nextIndex() {
        return super.nextIndex();
    }

    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ InterfaceC3452 previous() {
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
    public /* bridge */ /* synthetic */ void set(InterfaceC3452 interfaceC3452) {
        super.set(interfaceC3452);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
    public /* bridge */ /* synthetic */ void setSourceFile(String str) {
        super.setSourceFile(str);
    }

    @Override // bsh.SimpleNode
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(": ");
        return AbstractC0900.m711(sb, this.label, ":");
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ String toString(String str) {
        return super.toString(str);
    }
}
