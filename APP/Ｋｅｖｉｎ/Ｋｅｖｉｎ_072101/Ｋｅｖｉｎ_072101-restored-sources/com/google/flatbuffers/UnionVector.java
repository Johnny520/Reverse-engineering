package com.google.flatbuffers;

/* JADX INFO: loaded from: classes2.dex */
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

    public com.google.flatbuffers.Table get(com.google.flatbuffers.Table r3, int r4) {
            r2 = this;
            int r0 = r2.__element(r4)
            java.nio.ByteBuffer r1 = r2.f44bb
            com.google.flatbuffers.Table r0 = com.google.flatbuffers.Table.__union(r3, r0, r1)
            return r0
    }
}
