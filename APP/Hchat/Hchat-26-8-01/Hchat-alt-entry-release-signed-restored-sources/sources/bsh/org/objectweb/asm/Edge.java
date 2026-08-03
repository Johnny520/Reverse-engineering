package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class Edge {
    static final int EXCEPTION = Integer.MAX_VALUE;
    static final int JUMP = 0;
    final int info;
    Edge nextEdge;
    final Label successor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Edge(int i9, Label label, Edge edge) {
        this.info = i9;
        this.successor = label;
        this.nextEdge = edge;
    }
}
