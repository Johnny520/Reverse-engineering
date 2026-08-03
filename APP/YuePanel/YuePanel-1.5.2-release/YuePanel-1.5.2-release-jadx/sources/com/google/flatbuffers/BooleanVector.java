package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class BooleanVector extends BaseVector {
    public BooleanVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 1, byteBuffer);
        return this;
    }

    public boolean get(int i) {
        return this.f4151bb.get(__element(i)) != 0;
    }
}
