package com.android.dex.util;

/* JADX INFO: loaded from: classes.dex */
public final class ByteArrayByteInput implements com.android.dex.util.ByteInput {
    private final byte[] bytes;
    private int position;

    public ByteArrayByteInput(byte... r1) {
            r0 = this;
            r0.<init>()
            r0.bytes = r1
            return
    }

    @Override // com.android.dex.util.ByteInput
    public byte readByte() {
            r3 = this;
            byte[] r0 = r3.bytes
            int r1 = r3.position
            int r2 = r1 + 1
            r3.position = r2
            r0 = r0[r1]
            return r0
    }
}
