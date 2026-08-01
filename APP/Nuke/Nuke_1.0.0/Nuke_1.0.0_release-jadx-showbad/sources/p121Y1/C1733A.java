package p121Y1;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p078P1.C1141c;
import p093S1.C1294f;

/* JADX INFO: renamed from: Y1.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1733A extends FilterInputStream {

    /* JADX INFO: renamed from: d */
    public volatile byte[] f5986d;

    /* JADX INFO: renamed from: e */
    public int f5987e;

    /* JADX INFO: renamed from: f */
    public int f5988f;

    /* JADX INFO: renamed from: g */
    public int f5989g;

    /* JADX INFO: renamed from: h */
    public int f5990h;

    /* JADX INFO: renamed from: i */
    public final C1294f f5991i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1733A(InputStream inputStream, C1294f c1294f) {
        super(inputStream);
        this.f5989g = -1;
        this.f5991i = c1294f;
        this.f5986d = (byte[]) c1294f.m2384c(65536, byte[].class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m3089d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f5986d == null || inputStream == null) {
            m3089d();
            throw null;
        }
        return (this.f5987e - this.f5990h) + inputStream.available();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m3090b(InputStream inputStream, byte[] bArr) throws IOException {
        int i5 = this.f5989g;
        if (i5 != -1) {
            int i6 = this.f5990h - i5;
            int i7 = this.f5988f;
            if (i6 < i7) {
                if (i5 == 0 && i7 > bArr.length && this.f5987e == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i7) {
                        i7 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f5991i.m2384c(i7, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f5986d = bArr2;
                    this.f5991i.m2388g(bArr);
                    bArr = bArr2;
                } else if (i5 > 0) {
                    System.arraycopy(bArr, i5, bArr, 0, bArr.length - i5);
                }
                int i8 = this.f5990h - this.f5989g;
                this.f5990h = i8;
                this.f5989g = 0;
                this.f5987e = 0;
                int i9 = inputStream.read(bArr, i8, bArr.length - i8);
                int i10 = this.f5990h;
                if (i9 > 0) {
                    i10 += i9;
                }
                this.f5987e = i10;
                return i9;
            }
        }
        int i11 = inputStream.read(bArr);
        if (i11 > 0) {
            this.f5989g = -1;
            this.f5990h = 0;
            this.f5987e = i11;
        }
        return i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized void m3091c() {
        if (this.f5986d != null) {
            this.f5991i.m2388g(this.f5986d);
            this.f5986d = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f5986d != null) {
            this.f5991i.m2388g(this.f5986d);
            this.f5986d = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i5) {
        this.f5988f = Math.max(this.f5988f, i5);
        this.f5989g = this.f5990h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f5986d;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            m3089d();
            throw null;
        }
        if (this.f5990h >= this.f5987e && m3090b(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f5986d && (bArr = this.f5986d) == null) {
            m3089d();
            throw null;
        }
        int i5 = this.f5987e;
        int i6 = this.f5990h;
        if (i5 - i6 <= 0) {
            return -1;
        }
        this.f5990h = i6 + 1;
        return bArr[i6] & 255;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f5986d == null) {
            throw new IOException("Stream is closed");
        }
        int i5 = this.f5989g;
        if (-1 == i5) {
            throw new C1141c("Mark has been invalidated, pos: " + this.f5990h + " markLimit: " + this.f5988f);
        }
        this.f5990h = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j5) {
        if (j5 < 1) {
            return 0L;
        }
        byte[] bArr = this.f5986d;
        if (bArr == null) {
            m3089d();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m3089d();
            throw null;
        }
        int i5 = this.f5987e;
        int i6 = this.f5990h;
        if (i5 - i6 >= j5) {
            this.f5990h = (int) (((long) i6) + j5);
            return j5;
        }
        long j6 = ((long) i5) - ((long) i6);
        this.f5990h = i5;
        if (this.f5989g == -1 || j5 > this.f5988f) {
            long jSkip = inputStream.skip(j5 - j6);
            if (jSkip > 0) {
                this.f5989g = -1;
            }
            return j6 + jSkip;
        }
        if (m3090b(inputStream, bArr) == -1) {
            return j6;
        }
        int i7 = this.f5987e;
        int i8 = this.f5990h;
        if (i7 - i8 >= j5 - j6) {
            this.f5990h = (int) ((((long) i8) + j5) - j6);
            return j5;
        }
        long j7 = (j6 + ((long) i7)) - ((long) i8);
        this.f5990h = i7;
        return j7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i5, int i6) {
        int i7;
        int i8;
        byte[] bArr2 = this.f5986d;
        if (bArr2 == null) {
            m3089d();
            throw null;
        }
        if (i6 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i9 = this.f5990h;
            int i10 = this.f5987e;
            if (i9 < i10) {
                int i11 = i10 - i9;
                if (i11 >= i6) {
                    i11 = i6;
                }
                System.arraycopy(bArr2, i9, bArr, i5, i11);
                this.f5990h += i11;
                if (i11 == i6 || inputStream.available() == 0) {
                    return i11;
                }
                i5 += i11;
                i7 = i6 - i11;
            } else {
                i7 = i6;
            }
            while (true) {
                if (this.f5989g == -1 && i7 >= bArr2.length) {
                    i8 = inputStream.read(bArr, i5, i7);
                    if (i8 == -1) {
                        return i7 != i6 ? i6 - i7 : -1;
                    }
                } else {
                    if (m3090b(inputStream, bArr2) == -1) {
                        return i7 != i6 ? i6 - i7 : -1;
                    }
                    if (bArr2 != this.f5986d && (bArr2 = this.f5986d) == null) {
                        m3089d();
                        throw null;
                    }
                    int i12 = this.f5987e;
                    int i13 = this.f5990h;
                    i8 = i12 - i13;
                    if (i8 >= i7) {
                        i8 = i7;
                    }
                    System.arraycopy(bArr2, i13, bArr, i5, i8);
                    this.f5990h += i8;
                }
                i7 -= i8;
                if (i7 == 0) {
                    return i6;
                }
                if (inputStream.available() == 0) {
                    return i6 - i7;
                }
                i5 += i8;
            }
        } else {
            m3089d();
            throw null;
        }
    }
}
