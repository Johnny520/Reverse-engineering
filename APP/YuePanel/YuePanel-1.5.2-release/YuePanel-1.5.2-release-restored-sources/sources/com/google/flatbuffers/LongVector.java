package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class LongVector extends BaseVector {
    public LongVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 8, byteBuffer);
        return this;
    }

    public long get(int i) {
        return this.f4151bb.getLong(__element(i));
    }
}
