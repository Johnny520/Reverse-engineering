package net.bytebuddy.jar.asm;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final class Edge {
    static final int EXCEPTION = Integer.MAX_VALUE;
    static final int JUMP = 0;
    final int info;
    Edge nextEdge;
    final Label successor;

    public Edge(int i, Label label, Edge edge) {
        this.info = i;
        this.successor = label;
        this.nextEdge = edge;
    }
}
