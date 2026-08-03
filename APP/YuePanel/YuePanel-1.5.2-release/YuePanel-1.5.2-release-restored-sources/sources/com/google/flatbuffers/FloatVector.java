package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class FloatVector extends BaseVector {
    public FloatVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 4, byteBuffer);
        return this;
    }

    public float get(int i) {
        return this.f4151bb.getFloat(__element(i));
    }
}
