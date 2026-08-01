package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3033 extends FilterInputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f9658;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f9659;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C2974 f9660;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f9661;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f9662;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile byte[] f9663;

    public C3033(InputStream inputStream, C2974 c2974) {
        super(inputStream);
        this.f9659 = -1;
        this.f9660 = c2974;
        this.f9663 = (byte[]) c2974.m6446(65536, byte[].class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m6547() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f9663 == null || inputStream == null) {
            m6547();
            throw null;
        }
        return (this.f9661 - this.f9658) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f9663 != null) {
            this.f9660.m6449(this.f9663);
            this.f9663 = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f9662 = Math.max(this.f9662, i);
        this.f9659 = this.f9658;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f9663;
        if (bArr2 == null) {
            m6547();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m6547();
            throw null;
        }
        int i5 = this.f9658;
        int i6 = this.f9661;
        if (i5 < i6) {
            int i7 = i6 - i5;
            if (i7 >= i2) {
                i7 = i2;
            }
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.f9658 += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.f9659 == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else {
                if (m6549(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
                if (bArr2 != this.f9663 && (bArr2 = this.f9663) == null) {
                    m6547();
                    throw null;
                }
                int i8 = this.f9661;
                int i9 = this.f9658;
                i4 = i8 - i9;
                if (i4 >= i3) {
                    i4 = i3;
                }
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.f9658 += i4;
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
        if (this.f9663 == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f9659;
        if (-1 == i) {
            final String str = "Mark has been invalidated, pos: " + this.f9658 + " markLimit: " + this.f9662;
            throw new IOException(str) { // from class: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream$InvalidMarkException
                private static final long serialVersionUID = -4338378848813561757L;
            };
        }
        this.f9658 = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f9663;
        if (bArr == null) {
            m6547();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m6547();
            throw null;
        }
        int i = this.f9661;
        int i2 = this.f9658;
        if (i - i2 >= j) {
            this.f9658 = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.f9658 = i;
        if (this.f9659 == -1 || j > this.f9662) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f9659 = -1;
            }
            return j2 + jSkip;
        }
        if (m6549(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f9661;
        int i4 = this.f9658;
        if (i3 - i4 >= j - j2) {
            this.f9658 = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.f9658 = i3;
        return j3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final synchronized void m6548() {
        if (this.f9663 != null) {
            this.f9660.m6449(this.f9663);
            this.f9663 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m6549(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f9659;
        if (i != -1) {
            int i2 = this.f9658 - i;
            int i3 = this.f9662;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f9661 == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f9660.m6446(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f9663 = bArr2;
                    this.f9660.m6449(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f9658 - this.f9659;
                this.f9658 = i4;
                this.f9659 = 0;
                this.f9661 = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f9658;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f9661 = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f9659 = -1;
            this.f9658 = 0;
            this.f9661 = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f9663;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f9658 >= this.f9661 && m6549(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f9663 && (bArr = this.f9663) == null) {
                m6547();
                throw null;
            }
            int i = this.f9661;
            int i2 = this.f9658;
            if (i - i2 <= 0) {
                return -1;
            }
            this.f9658 = i2 + 1;
            return bArr[i2] & DefaultClassResolver.NAME;
        }
        m6547();
        throw null;
    }
}
