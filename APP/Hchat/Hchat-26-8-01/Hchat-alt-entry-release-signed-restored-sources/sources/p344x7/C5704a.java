package p344x7;

import java.io.InputStream;

/* JADX INFO: renamed from: x7.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5704a extends InputStream {

    /* JADX INFO: renamed from: g */
    public final byte[] f23176g;

    /* JADX INFO: renamed from: h */
    public final int f23177h;

    /* JADX INFO: renamed from: i */
    public final int f23178i;

    /* JADX INFO: renamed from: j */
    public int f23179j;

    /* JADX INFO: renamed from: k */
    public int f23180k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5704a(byte[] bArr, int i9, int i10) {
        i9 = i9 >= bArr.length ? bArr.length - 1 : i9;
        i9 = i9 < 0 ? 0 : i9;
        int length = bArr.length - i9;
        i10 = i10 > length ? length : i10;
        this.f23176g = bArr;
        this.f23177h = i9;
        this.f23178i = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int available() {
        return this.f23178i - this.f23179j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23179j = this.f23178i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final synchronized void mark(int i9) {
        this.f23180k = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        int iAvailable = available();
        if (iAvailable <= 0) {
            return -1;
        }
        if (i10 > iAvailable) {
            i10 = iAvailable;
        }
        System.arraycopy(this.f23176g, this.f23177h + this.f23179j, bArr, i9, i10);
        this.f23179j += i10;
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final void reset() {
        this.f23179j = this.f23180k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.InputStream
    public final long skip(long j3) {
        if (j3 <= 0) {
            return j3;
        }
        int i9 = (int) j3;
        int iAvailable = available();
        if (i9 > iAvailable) {
            i9 = iAvailable;
        }
        this.f23179j += i9;
        return i9;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        int i9 = this.f23179j;
        byte b10 = this.f23176g[this.f23177h + i9];
        this.f23179j = i9 + 1;
        return b10 & 255;
    }
}
