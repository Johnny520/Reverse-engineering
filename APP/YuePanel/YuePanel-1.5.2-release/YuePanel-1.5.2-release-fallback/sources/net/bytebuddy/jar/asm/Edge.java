package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
final class Edge {
    static final int EXCEPTION = Integer.MAX_VALUE;
    static final int JUMP = 0;
    final int info;
    net.bytebuddy.jar.asm.Edge nextEdge;
    final net.bytebuddy.jar.asm.Label successor;

    public Edge(int r1, net.bytebuddy.jar.asm.Label r2, net.bytebuddy.jar.asm.Edge r3) {
            r0 = this;
            r0.<init>()
            r0.info = r1
            r0.successor = r2
            r0.nextEdge = r3
            return
    }
}
