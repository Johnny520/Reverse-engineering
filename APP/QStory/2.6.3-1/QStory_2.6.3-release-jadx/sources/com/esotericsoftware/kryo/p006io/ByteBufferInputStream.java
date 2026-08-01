package com.esotericsoftware.kryo.p006io;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class ByteBufferInputStream extends InputStream {
    private ByteBuffer byteBuffer;

    public ByteBufferInputStream(int i) {
        this(ByteBuffer.allocate(i));
        flipBuffer(this.byteBuffer);
    }

    private void flipBuffer(Buffer buffer) {
        buffer.flip();
    }

    @Override // java.io.InputStream
    public int available() {
        return this.byteBuffer.remaining();
    }

    public ByteBuffer getByteBuffer() {
        return this.byteBuffer;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int iMin = Math.min(this.byteBuffer.remaining(), i2);
        if (iMin == 0) {
            return -1;
        }
        this.byteBuffer.get(bArr, i, iMin);
        return iMin;
    }

    public void setByteBuffer(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

    public ByteBufferInputStream() {
    }

    public ByteBufferInputStream(ByteBuffer byteBuffer) {
        this.byteBuffer = byteBuffer;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.byteBuffer.hasRemaining()) {
            return this.byteBuffer.get() & DefaultClassResolver.NAME;
        }
        return -1;
    }
}
