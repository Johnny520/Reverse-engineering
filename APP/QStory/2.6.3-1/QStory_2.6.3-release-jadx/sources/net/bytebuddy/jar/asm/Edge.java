package net.bytebuddy.jar.asm;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
