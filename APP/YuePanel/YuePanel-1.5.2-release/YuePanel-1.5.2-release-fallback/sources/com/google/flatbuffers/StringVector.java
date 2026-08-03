package com.google.flatbuffers;

/* JADX INFO: loaded from: classes.dex */
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

    public java.lang.String get(int r3) {
            r2 = this;
            int r3 = r2.__element(r3)
            java.nio.ByteBuffer r0 = r2.bb
            com.google.flatbuffers.Utf8 r1 = r2.utf8
            java.lang.String r3 = com.google.flatbuffers.Table.__string(r3, r0, r1)
            return r3
    }
}
