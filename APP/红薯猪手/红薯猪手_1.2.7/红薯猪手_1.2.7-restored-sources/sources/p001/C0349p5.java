package p001;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: ۟.p5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0349p5 extends InputStream {

    /* JADX INFO: renamed from: ۥ */
    public final InputStream f1025;

    /* JADX INFO: renamed from: ۥ۟ */
    public long f1026;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public long f1751;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public long f1752;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public long f1753 = -1;

    public C0349p5(InputStream inputStream) {
        this.f1025 = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, 4096);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f1025.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f1025.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f1753 = m1185(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f1025.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f1025.read();
        if (i != -1) {
            this.f1026++;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.f1025.read(bArr);
        if (i != -1) {
            this.f1026 += (long) i;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f1025.read(bArr, i, i2);
        if (i3 != -1) {
            this.f1026 += (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        m1184(this.f1753);
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = this.f1025.skip(j);
        this.f1026 += jSkip;
        return jSkip;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m1184(long j) throws IOException {
        if (this.f1026 > this.f1752 || j < this.f1751) {
            throw new IOException("Cannot reset");
        }
        this.f1025.reset();
        m1186(this.f1751, j);
        this.f1026 = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final long m1185(int i) {
        long j = this.f1026;
        long j2 = ((long) i) + j;
        long j3 = this.f1752;
        if (j3 < j2) {
            try {
                if (this.f1751 >= j || j > j3) {
                    this.f1751 = j;
                    this.f1025.mark((int) (j2 - j));
                } else {
                    this.f1025.reset();
                    this.f1025.mark((int) (j2 - this.f1751));
                    m1186(this.f1751, this.f1026);
                }
                this.f1752 = j2;
            } catch (IOException e) {
                throw new IllegalStateException("Unable to mark: " + e);
            }
        }
        return this.f1026;
    }

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public final void m1186(long j, long j2) throws IOException {
        while (j < j2) {
            long jSkip = this.f1025.skip(j2 - j);
            if (jSkip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j += jSkip;
        }
    }
}
