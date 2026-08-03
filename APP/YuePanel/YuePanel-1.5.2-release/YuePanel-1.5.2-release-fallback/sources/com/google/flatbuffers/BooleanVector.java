package com.google.flatbuffers;

/* JADX INFO: loaded from: classes.dex */
public final class BooleanVector extends com.google.flatbuffers.BaseVector {
    public BooleanVector() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.google.flatbuffers.BooleanVector __assign(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r0 = 1
            r1.__reset(r2, r0, r3)
            return r1
    }

    public boolean get(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.bb
            int r2 = r1.__element(r2)
            byte r2 = r0.get(r2)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }
}
