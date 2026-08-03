package com.google.flatbuffers;

import Yue.C8578;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class IntVector extends BaseVector {
    public IntVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 4, byteBuffer);
        return this;
    }

    public int get(int i) {
        return this.f4151bb.getInt(__element(i));
    }

    public long getAsUnsigned(int i) {
        return ((long) get(i)) & C8578.f25466;
    }
}
