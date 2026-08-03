package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class Struct {

    /* JADX INFO: renamed from: bb */
    protected ByteBuffer f4156bb;
    protected int bb_pos;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void __reset(int i, ByteBuffer byteBuffer) {
        this.f4156bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i;
        } else {
            this.bb_pos = 0;
        }
    }

    public void __reset() {
        __reset(0, null);
    }
}
