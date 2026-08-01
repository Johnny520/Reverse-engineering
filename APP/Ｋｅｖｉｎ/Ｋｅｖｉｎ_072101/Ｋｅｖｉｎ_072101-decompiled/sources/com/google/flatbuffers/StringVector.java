package com.google.flatbuffers;

/* JADX INFO: loaded from: classes2.dex */
public final class StringVector extends com.google.flatbuffers.BaseVector {
    private com.google.flatbuffers.Utf8 utf8;

    public StringVector() {
            r1 = this;
            r1.<init>()
            com.google.flatbuffers.Utf8 r0 = com.google.flatbuffers.Utf8.getDefault()
            r1.utf8 = r0
            return
    }

    public com.google.flatbuffers.StringVector __assign(int r1, int r2, java.nio.ByteBuffer r3) {
            r0 = this;
            r0.__reset(r1, r2, r3)
            return r0
    }

    public java.lang.String get(int r4) {
            r3 = this;
            int r0 = r3.__element(r4)
            java.nio.ByteBuffer r1 = r3.f44bb
            com.google.flatbuffers.Utf8 r2 = r3.utf8
            java.lang.String r0 = com.google.flatbuffers.Table.__string(r0, r1, r2)
            return r0
    }
}
