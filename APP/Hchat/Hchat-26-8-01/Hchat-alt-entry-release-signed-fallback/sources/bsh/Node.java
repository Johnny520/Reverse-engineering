package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface Node extends java.util.ListIterator<bsh.Node> {
    public static final bsh.Node JAVACODE = null;


    static {
            bsh.Node$1 r0 = new bsh.Node$1
            r1 = -1
            r0.<init>(r1)
            bsh.Node.JAVACODE = r0
            return
    }

    void dump(java.lang.String r1);

    java.lang.Object eval(bsh.CallStack r1, bsh.Interpreter r2);

    int getId();

    int getLineNumber();

    java.lang.String getSourceFile();

    java.lang.String getText();

    void jjtAddChild(bsh.Node r1, int r2);

    void jjtClose();

    bsh.Node jjtGetChild(int r1);

    bsh.Node[] jjtGetChildren();

    int jjtGetNumChildren();

    bsh.Node jjtGetParent();

    void jjtOpen();

    void jjtSetParent(bsh.Node r1);

    void setSourceFile(java.lang.String r1);

    java.lang.String toString(java.lang.String r1);
}
