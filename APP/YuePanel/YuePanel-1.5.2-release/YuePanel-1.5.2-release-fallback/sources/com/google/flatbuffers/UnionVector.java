package com.google.flatbuffers;

/* JADX INFO: loaded from: classes.dex */
public final class UnionVector extends com.google.flatbuffers.BaseVector {
    public UnionVector() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.google.flatbuffers.UnionVector __assign(int r1, int r2, java.nio.ByteBuffer r3) {
            r0 = this;
            r0.__reset(r1, r2, r3)
            return r0
    }

    public com.google.flatbuffers.Table get(com.google.flatbuffers.Table r2, int r3) {
            r1 = this;
            int r3 = r1.__element(r3)
            java.nio.ByteBuffer r0 = r1.bb
            com.google.flatbuffers.Table r2 = com.google.flatbuffers.Table.__union(r2, r3, r0)
            return r2
    }
}
