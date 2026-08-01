package p195l2;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2497a extends InputStream {

    /* JADX INFO: renamed from: d */
    public final ByteBuffer f8005d;

    /* JADX INFO: renamed from: e */
    public int f8006e = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2497a(ByteBuffer byteBuffer) {
        this.f8005d = byteBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int available() {
        return this.f8005d.remaining();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final synchronized void mark(int i5) {
        this.f8006e = this.f8005d.position();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f8005d;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i5 = this.f8006e;
        if (i5 == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f8005d.position(i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final long skip(long j5) {
        ByteBuffer byteBuffer = this.f8005d;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j5, byteBuffer.remaining());
        byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i5, int i6) {
        ByteBuffer byteBuffer = this.f8005d;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i6, byteBuffer.remaining());
        byteBuffer.get(bArr, i5, iMin);
        return iMin;
    }
}
