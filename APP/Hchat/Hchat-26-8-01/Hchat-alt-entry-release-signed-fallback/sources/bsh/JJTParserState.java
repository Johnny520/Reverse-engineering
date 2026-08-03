package bsh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class JJTParserState implements java.io.Serializable {
    private java.util.List<java.lang.Integer> marks;
    private int mk;
    private boolean node_created;
    private java.util.List<bsh.Node> nodes;
    private int sp;

    public JJTParserState() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.nodes = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.marks = r0
            r0 = 0
            r1.sp = r0
            r1.mk = r0
            return
    }

    public void clearNodeScope(bsh.Node r2) {
            r1 = this;
        L0:
            int r2 = r1.sp
            int r0 = r1.mk
            if (r2 <= r0) goto La
            r1.popNode()
            goto L0
        La:
            java.util.List<java.lang.Integer> r2 = r1.marks
            int r0 = r2.size()
            int r0 = r0 + (-1)
            java.lang.Object r2 = r2.remove(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.mk = r2
            return
    }

    public void closeNodeScope(bsh.Node r4, int r5) {
            r3 = this;
            java.util.List<java.lang.Integer> r0 = r3.marks
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.remove(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r3.mk = r0
        L14:
            int r0 = r5 + (-1)
            if (r5 <= 0) goto L24
            bsh.Node r5 = r3.popNode()
            r5.jjtSetParent(r4)
            r4.jjtAddChild(r5, r0)
            r5 = r0
            goto L14
        L24:
            r4.jjtClose()
            r3.pushNode(r4)
            r3.node_created = r2
            return
    }

    public void closeNodeScope(bsh.Node r4, boolean r5) {
            r3 = this;
            r0 = 1
            if (r5 == 0) goto L33
            int r5 = r3.nodeArity()
            java.util.List<java.lang.Integer> r1 = r3.marks
            int r2 = r1.size()
            int r2 = r2 - r0
            java.lang.Object r1 = r1.remove(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.mk = r1
        L1a:
            int r1 = r5 + (-1)
            if (r5 <= 0) goto L2a
            bsh.Node r5 = r3.popNode()
            r5.jjtSetParent(r4)
            r4.jjtAddChild(r5, r1)
            r5 = r1
            goto L1a
        L2a:
            r4.jjtClose()
            r3.pushNode(r4)
            r3.node_created = r0
            return
        L33:
            java.util.List<java.lang.Integer> r4 = r3.marks
            int r5 = r4.size()
            int r5 = r5 - r0
            java.lang.Object r4 = r4.remove(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.mk = r4
            r4 = 0
            r3.node_created = r4
            return
    }

    public int nodeArity() {
            r2 = this;
            int r0 = r2.sp
            int r1 = r2.mk
            int r0 = r0 - r1
            return r0
    }

    public boolean nodeCreated() {
            r1 = this;
            boolean r0 = r1.node_created
            return r0
    }

    public void openNodeScope(bsh.Node r3) {
            r2 = this;
            java.util.List<java.lang.Integer> r0 = r2.marks
            int r1 = r2.mk
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            int r0 = r2.sp
            r2.mk = r0
            r3.jjtOpen()
            return
    }

    public bsh.Node peekNode() {
            r2 = this;
            java.util.List<bsh.Node> r0 = r2.nodes
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            bsh.Node r0 = (bsh.Node) r0
            return r0
    }

    public bsh.Node popNode() {
            r2 = this;
            int r0 = r2.sp
            int r0 = r0 + (-1)
            r2.sp = r0
            int r1 = r2.mk
            if (r0 >= r1) goto L1e
            java.util.List<java.lang.Integer> r0 = r2.marks
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.remove(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r2.mk = r0
        L1e:
            java.util.List<bsh.Node> r0 = r2.nodes
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.remove(r1)
            bsh.Node r0 = (bsh.Node) r0
            return r0
    }

    public void pushNode(bsh.Node r2) {
            r1 = this;
            java.util.List<bsh.Node> r0 = r1.nodes
            r0.add(r2)
            int r2 = r1.sp
            int r2 = r2 + 1
            r1.sp = r2
            return
    }

    public void reset() {
            r1 = this;
            java.util.List<bsh.Node> r0 = r1.nodes
            r0.clear()
            java.util.List<java.lang.Integer> r0 = r1.marks
            r0.clear()
            r0 = 0
            r1.sp = r0
            r1.mk = r0
            return
    }

    public bsh.Node rootNode() {
            r2 = this;
            java.util.List<bsh.Node> r0 = r2.nodes
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            bsh.Node r0 = (bsh.Node) r0
            return r0
    }
}
