package com.esotericsoftware.kryo.io;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
