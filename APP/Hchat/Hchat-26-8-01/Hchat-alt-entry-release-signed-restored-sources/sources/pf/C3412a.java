package pf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: pf.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3412a extends InputStream {

    /* JADX INFO: renamed from: g */
    public final ByteBuffer f11029g;

    /* JADX INFO: renamed from: h */
    public int f11030h = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3412a(ByteBuffer byteBuffer) {
        this.f11029g = byteBuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final synchronized void mark(int i9) {
        this.f11030h = this.f11029g.position();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        ByteBuffer byteBuffer = this.f11029g;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i10, byteBuffer.remaining());
        byteBuffer.get(bArr, i9, iMin);
        return iMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final synchronized void reset() {
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f11029g;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }
}
