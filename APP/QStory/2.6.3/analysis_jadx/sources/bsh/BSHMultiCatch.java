package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class BSHMultiCatch extends SimpleNode {
    public static final Class<?> UNTYPED = null;
    private static final long serialVersionUID = 1;
    public boolean isFinal;
    public String name;
    public Class<?>[] types;

    public BSHMultiCatch(int i) {
        super(i);
        this.isFinal = false;
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void add(InterfaceC2619 interfaceC2619) {
        super.add(interfaceC2619);
    }

    public int countTypes() {
        if (jjtGetNumChildren() > 0) {
            return jjtGetNumChildren();
        }
        return 1;
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ void dump(String str) {
        super.dump(str);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public Object eval(CallStack callStack, Interpreter interpreter) {
        Class<?>[] clsArr = this.types;
        if (clsArr != null) {
            return clsArr;
        }
        this.types = new Class[countTypes()];
        if (isUntyped()) {
            this.types[0] = UNTYPED;
        } else {
            for (int i = 0; i < countTypes(); i++) {
                this.types[i] = ((BSHType) jjtGetChild(i)).getType(callStack, interpreter);
            }
        }
        return this.types;
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

    public Class<?>[] getTypes() {
        return this.types;
    }

    @Override // bsh.SimpleNode, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ boolean hasNext() {
        return super.hasNext();
    }

    @Override // bsh.SimpleNode, java.util.ListIterator
    public /* bridge */ /* synthetic */ boolean hasPrevious() {
        return super.hasPrevious();
    }

    public boolean isFinal() {
        return this.isFinal || countTypes() > 1;
    }

    public boolean isUntyped() {
        return jjtGetNumChildren() == 0;
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
        return super.toString() + ": " + this.name + ", final=" + this.isFinal;
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ String toString(String str) {
        return super.toString(str);
    }
}
