package bsh;

import java.util.ListIterator;

/* JADX INFO: renamed from: bsh.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2619 extends ListIterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC2619 f7851;

    static {
        final int i = -1;
        f7851 = new SimpleNode(i) { // from class: bsh.Node$1
            private static final long serialVersionUID = 1;

            @Override // bsh.SimpleNode, bsh.InterfaceC2619
            public int getLineNumber() {
                return -1;
            }

            @Override // bsh.SimpleNode, bsh.InterfaceC2619
            public String getSourceFile() {
                return "<Called from Java Code>";
            }

            @Override // bsh.SimpleNode, bsh.InterfaceC2619
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

    void jjtAddChild(InterfaceC2619 interfaceC2619, int i);

    void jjtClose();

    InterfaceC2619 jjtGetChild(int i);

    InterfaceC2619[] jjtGetChildren();

    int jjtGetNumChildren();

    InterfaceC2619 jjtGetParent();

    void jjtOpen();

    void jjtSetParent(InterfaceC2619 interfaceC2619);

    void setSourceFile(String str);
}
