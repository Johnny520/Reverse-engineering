package bsh;

import java.util.ListIterator;

/* JADX INFO: renamed from: bsh.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2618 extends ListIterator {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC2618 f7849;

    static {
        final int i = -1;
        f7849 = new SimpleNode(i) { // from class: bsh.Node$1
            private static final long serialVersionUID = 1;

            @Override // bsh.SimpleNode, bsh.InterfaceC2618
            public int getLineNumber() {
                return -1;
            }

            @Override // bsh.SimpleNode, bsh.InterfaceC2618
            public String getSourceFile() {
                return "<Called from Java Code>";
            }

            @Override // bsh.SimpleNode, bsh.InterfaceC2618
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

    void jjtAddChild(InterfaceC2618 interfaceC2618, int i);

    void jjtClose();

    InterfaceC2618 jjtGetChild(int i);

    InterfaceC2618[] jjtGetChildren();

    int jjtGetNumChildren();

    InterfaceC2618 jjtGetParent();

    void jjtOpen();

    void jjtSetParent(InterfaceC2618 interfaceC2618);

    void setSourceFile(String str);
}
