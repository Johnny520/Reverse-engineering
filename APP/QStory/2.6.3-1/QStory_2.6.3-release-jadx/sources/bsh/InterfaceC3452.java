package bsh;

import java.util.ListIterator;

/* JADX INFO: renamed from: bsh.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3452 extends ListIterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC3452 f8196;

    static {
        final int i = -1;
        f8196 = new SimpleNode(i) { // from class: bsh.Node$1
            private static final long serialVersionUID = 1;

            @Override // bsh.SimpleNode, bsh.InterfaceC3452
            public int getLineNumber() {
                return -1;
            }

            @Override // bsh.SimpleNode, bsh.InterfaceC3452
            public String getSourceFile() {
                return "<Called from Java Code>";
            }

            @Override // bsh.SimpleNode, bsh.InterfaceC3452
            public String getText() {
                return "<Compiled Java Code>";
            }

            @Override // bsh.SimpleNode
            public String toString() {
                return "JavaCode";
            }
        };
    }

    void dump(String str);

    Object eval(CallStack callStack, Interpreter interpreter);

    int getLineNumber();

    String getSourceFile();

    String getText();

    void jjtAddChild(InterfaceC3452 interfaceC3452, int i);

    void jjtClose();

    InterfaceC3452 jjtGetChild(int i);

    InterfaceC3452[] jjtGetChildren();

    int jjtGetNumChildren();

    InterfaceC3452 jjtGetParent();

    void jjtOpen();

    void jjtSetParent(InterfaceC3452 interfaceC3452);

    void setSourceFile(String str);
}
