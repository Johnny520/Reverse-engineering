package com.esotericsoftware.kryo.io;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ByteBufferOutputStream extends OutputStream {
    private ByteBuffer byteBuffer;

    public ByteBufferOutputStream(int i) {
        this(ByteBuffer.allocate(i));
    }

    public ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }

    public void setByteBuffer(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (!this.byteBuffer.hasRemaining()) {
            flush();
        }
        this.byteBuffer.put((byte) i);
    }

    public ByteBufferOutputStream() {
    }

    public ByteBufferOutputStream(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.byteBuffer.remaining() < i2) {
            flush();
        }
        this.byteBuffer.put(bArr, i, i2);
    }
}
