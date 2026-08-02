package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r62 extends FilterInputStream {
    public volatile byte[] h;
    public int i;
    public int j;
    public int k;
    public int l;
    public final td1 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r62(InputStream inputStream, td1 td1Var) {
        super(inputStream);
        this.k = -1;
        this.m = td1Var;
        this.h = (byte[]) td1Var.c(65536, byte[].class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.h == null || inputStream == null) {
            e();
            throw null;
        }
        return (this.i - this.l) + inputStream.available();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.k;
        if (i != -1) {
            int i2 = this.l - i;
            int i3 = this.j;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.i == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.m.c(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.h = bArr2;
                    this.m.g(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.l - this.k;
                this.l = i4;
                this.k = 0;
                this.i = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.l;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.i = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.k = -1;
            this.l = 0;
            this.i = i7;
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized void c() {
        if (this.h != null) {
            this.m.g(this.h);
            this.h = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.h != null) {
            this.m.g(this.h);
            this.h = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.j = Math.max(this.j, i);
        this.k = this.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.h;
        if (bArr2 == null) {
            e();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            e();
            throw null;
        }
        int i5 = this.l;
        int i6 = this.i;
        if (i5 < i6) {
            int i7 = i6 - i5;
            if (i7 >= i2) {
                i7 = i2;
            }
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.l += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.k == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else {
                if (b(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
                if (bArr2 != this.h && (bArr2 = this.h) == null) {
                    e();
                    throw null;
                }
                int i8 = this.i;
                int i9 = this.l;
                i4 = i8 - i9;
                if (i4 >= i3) {
                    i4 = i3;
                }
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.l += i4;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.h == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.k;
        if (-1 == i) {
            throw new qw0("Mark has been invalidated, pos: " + this.l + " markLimit: " + this.j);
        }
        this.l = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.h;
        if (bArr == null) {
            e();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            e();
            throw null;
        }
        int i = this.i;
        int i2 = this.l;
        if (i - i2 >= j) {
            this.l = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.l = i;
        if (this.k == -1 || j > this.j) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.k = -1;
            }
            return j2 + jSkip;
        }
        if (b(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.i;
        int i4 = this.l;
        if (i3 - i4 >= j - j2) {
            this.l = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.l = i3;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.h;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.l >= this.i && b(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.h && (bArr = this.h) == null) {
                e();
                throw null;
            }
            int i = this.i;
            int i2 = this.l;
            if (i - i2 <= 0) {
                return -1;
            }
            this.l = i2 + 1;
            return bArr[i2] & 255;
        }
        e();
        throw null;
    }
}
