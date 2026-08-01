package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3032 extends FilterInputStream {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f9656;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f9657;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C2973 f9658;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f9659;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f9660;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public volatile byte[] f9661;

    public C3032(InputStream inputStream, C2973 c2973) {
        super(inputStream);
        this.f9657 = -1;
        this.f9658 = c2973;
        this.f9661 = (byte[]) c2973.m6388(65536, byte[].class);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m6487() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f9661 == null || inputStream == null) {
            m6487();
            throw null;
        }
        return (this.f9659 - this.f9656) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f9661 != null) {
            this.f9658.m6391(this.f9661);
            this.f9661 = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f9660 = Math.max(this.f9660, i);
        this.f9657 = this.f9656;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.f9661;
        if (bArr2 == null) {
            m6487();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m6487();
            throw null;
        }
        int i5 = this.f9656;
        int i6 = this.f9659;
        if (i5 < i6) {
            int i7 = i6 - i5;
            if (i7 >= i2) {
                i7 = i2;
            }
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.f9656 += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.f9657 == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else {
                if (m6489(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
                if (bArr2 != this.f9661 && (bArr2 = this.f9661) == null) {
                    m6487();
                    throw null;
                }
                int i8 = this.f9659;
                int i9 = this.f9656;
                i4 = i8 - i9;
                if (i4 >= i3) {
                    i4 = i3;
                }
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.f9656 += i4;
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
        if (this.f9661 == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f9657;
        if (-1 == i) {
            final String str = "Mark has been invalidated, pos: " + this.f9656 + " markLimit: " + this.f9660;
            throw new IOException(str) { // from class: com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream$InvalidMarkException
                private static final long serialVersionUID = -4338378848813561757L;
            };
        }
        this.f9656 = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.f9661;
        if (bArr == null) {
            m6487();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            m6487();
            throw null;
        }
        int i = this.f9659;
        int i2 = this.f9656;
        if (i - i2 >= j) {
            this.f9656 = (int) (((long) i2) + j);
            return j;
        }
        long j2 = ((long) i) - ((long) i2);
        this.f9656 = i;
        if (this.f9657 == -1 || j > this.f9660) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.f9657 = -1;
            }
            return j2 + jSkip;
        }
        if (m6489(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.f9659;
        int i4 = this.f9656;
        if (i3 - i4 >= j - j2) {
            this.f9656 = (int) ((((long) i4) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i3)) - ((long) i4);
        this.f9656 = i3;
        return j3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final synchronized void m6488() {
        if (this.f9661 != null) {
            this.f9658.m6391(this.f9661);
            this.f9661 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m6489(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f9657;
        if (i != -1) {
            int i2 = this.f9656 - i;
            int i3 = this.f9660;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f9659 == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f9658.m6388(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f9661 = bArr2;
                    this.f9658.m6391(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.f9656 - this.f9657;
                this.f9656 = i4;
                this.f9657 = 0;
                this.f9659 = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.f9656;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.f9659 = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.f9657 = -1;
            this.f9656 = 0;
            this.f9659 = i7;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f9661;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.f9656 >= this.f9659 && m6489(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.f9661 && (bArr = this.f9661) == null) {
                m6487();
                throw null;
            }
            int i = this.f9659;
            int i2 = this.f9656;
            if (i - i2 <= 0) {
                return -1;
            }
            this.f9656 = i2 + 1;
            return bArr[i2] & DefaultClassResolver.NAME;
        }
        m6487();
        throw null;
    }
}
