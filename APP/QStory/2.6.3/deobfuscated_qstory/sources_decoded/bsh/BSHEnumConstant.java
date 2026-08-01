package bsh;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class BSHEnumConstant extends SimpleNode {
    private static final long serialVersionUID = 1;
    Object[] args;
    Modifiers mods;
    String name;

    public BSHEnumConstant(int i) {
        super(i);
        Modifiers modifiers = new Modifiers(3);
        this.mods = modifiers;
        modifiers.setConstant();
        this.mods.addModifier("enum");
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ void add(InterfaceC2619 interfaceC2619) {
        super.add(interfaceC2619);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ void dump(String str) {
        super.dump(str);
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public Object eval(CallStack callStack, Interpreter interpreter) {
        NameSpace pVar = callStack.top();
        if (!getName().equals("" + pVar.classInstance)) {
            return Primitive.VOID;
        }
        if (hasArguments(callStack, interpreter)) {
            This.CONTEXT_ARGS.get().put(pVar.classInstance.toString(), getArguments(callStack, interpreter));
        }
        for (int i = 0; i < jjtGetNumChildren(); i++) {
            if (jjtGetChild(i) instanceof BSHBlock) {
                ((BSHBlock) jjtGetChild(i)).eval(callStack, interpreter, Boolean.TRUE);
            }
        }
        return Primitive.VOID;
    }

    public Object[] getArguments(CallStack callStack, Interpreter interpreter) {
        if (this.args == null && jjtGetNumChildren() > 0 && (jjtGetChild(0) instanceof BSHArguments)) {
            this.args = ((BSHArguments) jjtGetChild(0)).getArguments(callStack, interpreter);
        }
        return this.args;
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ int getId() {
        return super.getId();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ int getLineNumber() {
        return super.getLineNumber();
    }

    public String getName() {
        return this.name;
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ String getSourceFile() {
        return super.getSourceFile();
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public /* bridge */ /* synthetic */ String getText() {
        return super.getText();
    }

    public Class<?> getType() {
        return Enum.class;
    }

    public boolean hasArguments(CallStack callStack, Interpreter interpreter) {
        return getArguments(callStack, interpreter) != null;
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
        return super.toString() + ": " + this.mods + " " + getType() + " " + this.name;
    }

    @Override // bsh.SimpleNode
    public /* bridge */ /* synthetic */ String toString(String str) {
        return super.toString(str);
    }
}
