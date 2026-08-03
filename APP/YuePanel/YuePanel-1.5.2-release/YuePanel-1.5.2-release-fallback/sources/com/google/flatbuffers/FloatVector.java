package com.google.flatbuffers;

/* JADX INFO: loaded from: classes.dex */
public final class FloatVector extends com.google.flatbuffers.BaseVector {
    public FloatVector() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.google.flatbuffers.FloatVector __assign(int r2, java.nio.ByteBuffer r3) {
            r1 = this;
            r0 = 4
            r1.__reset(r2, r0, r3)
            return r1
    }

    public float get(int r2) {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.bb
            int r2 = r1.__element(r2)
            float r2 = r0.getFloat(r2)
            return r2
    }
}
