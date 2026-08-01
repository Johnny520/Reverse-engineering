package com.alibaba.fastjson2.internal.asm;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class Edge {
    final Edge nextEdge;
    final Label successor;

    public Edge(Label label, Edge edge) {
        this.successor = label;
        this.nextEdge = edge;
    }
}
