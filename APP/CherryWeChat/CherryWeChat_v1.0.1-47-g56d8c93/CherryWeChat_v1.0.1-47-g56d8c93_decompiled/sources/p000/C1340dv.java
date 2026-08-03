package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: dv */
/* JADX INFO: loaded from: classes.dex */
public final class C1340dv extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public volatile byte[] f4825a;

    /* JADX INFO: renamed from: b */
    public int f4826b;

    /* JADX INFO: renamed from: c */
    public int f4827c;

    /* JADX INFO: renamed from: d */
    public int f4828d;

    /* JADX INFO: renamed from: e */
    public int f4829e;

    /* JADX INFO: renamed from: f */
    public final C2812zp f4830f;

    public C1340dv(InputStream inputStream, C2812zp c2812zp) {
        super(inputStream);
        this.f4828d = -1;
        this.f4830f = c2812zp;
        this.f4825a = (byte[]) c2812zp.m5441c(65536, byte[].class);
    }

    /* JADX INFO: renamed from: i */
    public static void m2595i() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f4825a == null || inputStream == null) {
            m2595i();
            throw null;
        }
        return (this.f4826b - this.f4829e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f4825a != null) {
            this.f4830f.m5445g(this.f4825a);
            this.f4825a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m2596d(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f4828d;
        if (i != -1) {
            int i2 = this.f4829e - i;
            int i3 = this.f4827c;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f4826b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f4830f.m5441c(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f4825a = bArr2;
                    this.f4830f.m5445g(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f4829e - this.f4828d;
                this.f4829e = i4;
                this.f4828d = 0;
                this.f4826b = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f4829e;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f4826b = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f4828d = -1;
            this.f4829e = 0;
            this.f4826b = i7;
        }
        return i7;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m2597f() {
        if (this.f4825a != null) {
            this.f4830f.m5445g(this.f4825a);
            this.f4825a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f4827c = Math.max(this.f4827c, i);
        this.f4828d = this.f4829e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f4825a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            m2595i();
            throw null;
        }
        if (this.f4829e >= this.f4826b && m2596d(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f4825a && (bArr = this.f4825a) == null) {
            m2595i();
            throw null;
        }
        int i = this.f4826b;
        int i2 = this.f4829e;
        if (i - i2 <= 0) {
            return -1;
        }
        this.f4829e = i2 + 1;
        return bArr[i2] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f4825a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f4828d;
        if (-1 == i) {
            throw new C2273na("Mark has been invalidated, pos: " + this.f4829e + " markLimit: " + this.f4827c);
        }
        this.f4829e = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f4825a;
        if (bArr == null) {
            m2595i();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m2595i();
            throw null;
        }
        int i = this.f4826b;
        int i2 = this.f4829e;
        if (i - i2 >= j) {
            this.f4829e = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.f4829e = i;
        if (this.f4828d == -1 || j > this.f4827c) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f4828d = -1;
            }
            return j2 + jSkip;
        }
        if (m2596d(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f4826b;
        int i4 = this.f4829e;
        if (i3 - i4 >= j - j2) {
            this.f4829e = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.f4829e = i3;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f4825a;
        if (bArr2 == null) {
            m2595i();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i5 = this.f4829e;
            int i6 = this.f4826b;
            if (i5 < i6) {
                int i7 = i6 - i5;
                if (i7 >= i2) {
                    i7 = i2;
                }
                System.arraycopy(bArr2, i5, bArr, i, i7);
                this.f4829e += i7;
                if (i7 == i2 || inputStream.available() == 0) {
                    return i7;
                }
                i += i7;
                i3 = i2 - i7;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.f4828d == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                } else {
                    if (m2596d(inputStream, bArr2) == -1) {
                        return i3 != i2 ? i2 - i3 : -1;
                    }
                    if (bArr2 != this.f4825a && (bArr2 = this.f4825a) == null) {
                        m2595i();
                        throw null;
                    }
                    int i8 = this.f4826b;
                    int i9 = this.f4829e;
                    i4 = i8 - i9;
                    if (i4 >= i3) {
                        i4 = i3;
                    }
                    System.arraycopy(bArr2, i9, bArr, i, i4);
                    this.f4829e += i4;
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
        } else {
            m2595i();
            throw null;
        }
    }
}
