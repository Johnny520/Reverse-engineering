package p195l2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2500d extends FilterInputStream {

    /* JADX INFO: renamed from: d */
    public final long f8009d;

    /* JADX INFO: renamed from: e */
    public int f8010e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2500d(InputStream inputStream, long j5) {
        super(inputStream);
        this.f8009d = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f8009d - ((long) this.f8010e), ((FilterInputStream) this).in.available());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4442b(int i5) throws IOException {
        if (i5 >= 0) {
            this.f8010e += i5;
            return;
        }
        long j5 = this.f8010e;
        long j6 = this.f8009d;
        if (j6 - j5 <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j6 + ", but read: " + this.f8010e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i5;
        i5 = super.read();
        m4442b(i5 >= 0 ? 1 : -1);
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i5, int i6) {
        int i7;
        i7 = super.read(bArr, i5, i6);
        m4442b(i7);
        return i7;
    }
}
