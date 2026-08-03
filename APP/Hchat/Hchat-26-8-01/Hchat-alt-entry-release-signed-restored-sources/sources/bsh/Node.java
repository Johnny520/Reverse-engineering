package bsh;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface Node extends ListIterator<Node> {
    public static final Node JAVACODE = new SimpleNode(-1) { // from class: bsh.Node.1
        private static final long serialVersionUID = 1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.SimpleNode, bsh.Node
        public int getLineNumber() {
            return -1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.SimpleNode, bsh.Node
        public String getSourceFile() {
            return "<Called from Java Code>";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.SimpleNode, bsh.Node
        public String getText() {
            return "<Compiled Java Code>";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.SimpleNode
        public String toString() {
            return "JavaCode";
        }
    };

    void dump(String str);

    Object eval(CallStack callStack, Interpreter interpreter);

    int getId();

    int getLineNumber();

    String getSourceFile();

    String getText();

    void jjtAddChild(Node node, int i9);

    void jjtClose();

    Node jjtGetChild(int i9);

    Node[] jjtGetChildren();

    int jjtGetNumChildren();

    Node jjtGetParent();

    void jjtOpen();

    void jjtSetParent(Node node);

    void setSourceFile(String str);

    String toString(String str);
}
