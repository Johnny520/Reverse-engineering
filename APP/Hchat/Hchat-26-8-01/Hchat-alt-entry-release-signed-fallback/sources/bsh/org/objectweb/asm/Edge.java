package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class Edge {
    static final int EXCEPTION = Integer.MAX_VALUE;
    static final int JUMP = 0;
    final int info;
    bsh.org.objectweb.asm.Edge nextEdge;
    final bsh.org.objectweb.asm.Label successor;

    public Edge(int r1, bsh.org.objectweb.asm.Label r2, bsh.org.objectweb.asm.Edge r3) {
            r0 = this;
            r0.<init>()
            r0.info = r1
            r0.successor = r2
            r0.nextEdge = r3
            return
    }
}
