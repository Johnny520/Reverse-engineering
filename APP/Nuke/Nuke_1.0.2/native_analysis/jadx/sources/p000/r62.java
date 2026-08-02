package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r62 extends FilterInputStream {

    /* JADX INFO: renamed from: h */
    public volatile byte[] f9403h;

    /* JADX INFO: renamed from: i */
    public int f9404i;

    /* JADX INFO: renamed from: j */
    public int f9405j;

    /* JADX INFO: renamed from: k */
    public int f9406k;

    /* JADX INFO: renamed from: l */
    public int f9407l;

    /* JADX INFO: renamed from: m */
    public final td1 f9408m;

    public r62(InputStream inputStream, td1 td1Var) {
        super(inputStream);
        this.f9406k = -1;
        this.f9408m = td1Var;
        this.f9403h = (byte[]) td1Var.m5167c(65536, byte[].class);
    }

    /* JADX INFO: renamed from: e */
    public static void m4395e() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f9403h == null || inputStream == null) {
            m4395e();
            throw null;
        }
        return (this.f9404i - this.f9407l) + inputStream.available();
    }

    /* JADX INFO: renamed from: b */
    public final int m4396b(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f9406k;
        if (i != -1) {
            int i2 = this.f9407l - i;
            int i3 = this.f9405j;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f9404i == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f9408m.m5167c(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f9403h = bArr2;
                    this.f9408m.m5171g(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f9407l - this.f9406k;
                this.f9407l = i4;
                this.f9406k = 0;
                this.f9404i = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f9407l;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f9404i = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f9406k = -1;
            this.f9407l = 0;
            this.f9404i = i7;
        }
        return i7;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m4397c() {
        if (this.f9403h != null) {
            this.f9408m.m5171g(this.f9403h);
            this.f9403h = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f9403h != null) {
            this.f9408m.m5171g(this.f9403h);
            this.f9403h = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f9405j = Math.max(this.f9405j, i);
        this.f9406k = this.f9407l;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f9403h;
        if (bArr2 == null) {
            m4395e();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m4395e();
            throw null;
        }
        int i5 = this.f9407l;
        int i6 = this.f9404i;
        if (i5 < i6) {
            int i7 = i6 - i5;
            if (i7 >= i2) {
                i7 = i2;
            }
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.f9407l += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.f9406k == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else {
                if (m4396b(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
                if (bArr2 != this.f9403h && (bArr2 = this.f9403h) == null) {
                    m4395e();
                    throw null;
                }
                int i8 = this.f9404i;
                int i9 = this.f9407l;
                i4 = i8 - i9;
                if (i4 >= i3) {
                    i4 = i3;
                }
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.f9407l += i4;
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
        if (this.f9403h == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f9406k;
        if (-1 == i) {
            throw new qw0("Mark has been invalidated, pos: " + this.f9407l + " markLimit: " + this.f9405j);
        }
        this.f9407l = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f9403h;
        if (bArr == null) {
            m4395e();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m4395e();
            throw null;
        }
        int i = this.f9404i;
        int i2 = this.f9407l;
        if (i - i2 >= j) {
            this.f9407l = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.f9407l = i;
        if (this.f9406k == -1 || j > this.f9405j) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f9406k = -1;
            }
            return j2 + jSkip;
        }
        if (m4396b(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f9404i;
        int i4 = this.f9407l;
        if (i3 - i4 >= j - j2) {
            this.f9407l = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.f9407l = i3;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f9403h;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f9407l >= this.f9404i && m4396b(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f9403h && (bArr = this.f9403h) == null) {
                m4395e();
                throw null;
            }
            int i = this.f9404i;
            int i2 = this.f9407l;
            if (i - i2 <= 0) {
                return -1;
            }
            this.f9407l = i2 + 1;
            return bArr[i2] & 255;
        }
        m4395e();
        throw null;
    }
}
