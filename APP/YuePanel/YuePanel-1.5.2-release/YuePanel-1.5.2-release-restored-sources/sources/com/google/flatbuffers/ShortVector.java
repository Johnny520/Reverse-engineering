package com.google.flatbuffers;

import Yue.C8080;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ShortVector extends BaseVector {
    public ShortVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 2, byteBuffer);
        return this;
    }

    public short get(int i) {
        return this.f4151bb.getShort(__element(i));
    }

    public int getAsUnsigned(int i) {
        return get(i) & C8080.f23970;
    }
}
