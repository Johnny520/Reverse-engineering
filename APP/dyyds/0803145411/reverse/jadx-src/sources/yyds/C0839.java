package yyds;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: yyds.ᛴᛴᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0839 extends FilterInputStream {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C2267 f3862;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f3863;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f3864;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public volatile byte[] f3865;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f3866;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f3867;

    public C0839(InputStream inputStream, C2267 c2267) {
        super(inputStream);
        this.f3866 = -1;
        this.f3862 = c2267;
        this.f3865 = (byte[]) c2267.m4272(byte[].class, 65536);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static void m1919() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f3865 == null || inputStream == null) {
            m1919();
            throw null;
        }
        return (this.f3867 - this.f3864) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f3865 != null) {
            this.f3862.m4271(this.f3865);
            this.f3865 = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f3863 = Math.max(this.f3863, i);
        this.f3866 = this.f3864;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f3865;
        if (bArr2 == null) {
            m1919();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m1919();
            throw null;
        }
        int i5 = this.f3864;
        int i6 = this.f3867;
        if (i5 < i6) {
            int i7 = i6 - i5;
            if (i7 >= i2) {
                i7 = i2;
            }
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.f3864 += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.f3866 == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else {
                if (m1920(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
                if (bArr2 != this.f3865 && (bArr2 = this.f3865) == null) {
                    m1919();
                    throw null;
                }
                int i8 = this.f3867;
                int i9 = this.f3864;
                i4 = i8 - i9;
                if (i4 >= i3) {
                    i4 = i3;
                }
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.f3864 += i4;
            }
            i3 -= i4;
            if (i3 == 0) {
                return i2;
            }
            if (inputStream.available() == 0) {
                return i2 - i3;
            }
            i += i4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f3865 == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f3866;
        if (-1 == i) {
            throw new C1951("Mark has been invalidated, pos: " + this.f3864 + " markLimit: " + this.f3863);
        }
        this.f3864 = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f3865;
        if (bArr == null) {
            m1919();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m1919();
            throw null;
        }
        int i = this.f3867;
        int i2 = this.f3864;
        if (i - i2 >= j) {
            this.f3864 = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.f3864 = i;
        if (this.f3866 == -1 || j > this.f3863) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f3866 = -1;
            }
            return j2 + jSkip;
        }
        if (m1920(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f3867;
        int i4 = this.f3864;
        if (i3 - i4 >= j - j2) {
            this.f3864 = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.f3864 = i3;
        return j3;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int m1920(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f3866;
        if (i != -1) {
            int i2 = this.f3864 - i;
            int i3 = this.f3863;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f3867 == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f3862.m4272(byte[].class, i3);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f3865 = bArr2;
                    this.f3862.m4271(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f3864 - this.f3866;
                this.f3864 = i4;
                this.f3866 = 0;
                this.f3867 = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f3864;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f3867 = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f3866 = -1;
            this.f3864 = 0;
            this.f3867 = i7;
        }
        return i7;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final synchronized void m1921() {
        if (this.f3865 != null) {
            this.f3862.m4271(this.f3865);
            this.f3865 = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f3865;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f3864 >= this.f3867 && m1920(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f3865 && (bArr = this.f3865) == null) {
                m1919();
                throw null;
            }
            int i = this.f3867;
            int i2 = this.f3864;
            if (i - i2 <= 0) {
                return -1;
            }
            this.f3864 = i2 + 1;
            return bArr[i2] & 255;
        }
        m1919();
        throw null;
    }
}
