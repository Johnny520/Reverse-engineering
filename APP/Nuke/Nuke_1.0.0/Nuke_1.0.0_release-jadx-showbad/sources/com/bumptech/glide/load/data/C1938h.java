package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import p011B4.AbstractC0231b;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1938h extends FilterInputStream {

    /* JADX INFO: renamed from: f */
    public static final byte[] f6572f = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: g */
    public static final int f6573g = 31;

    /* JADX INFO: renamed from: d */
    public final byte f6574d;

    /* JADX INFO: renamed from: e */
    public int f6575e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1938h(InputStream inputStream, int i5) {
        super(inputStream);
        if (i5 < -1 || i5 > 8) {
            throw new IllegalArgumentException(AbstractC0231b.m398i("Cannot add invalid orientation: ", i5));
        }
        this.f6574d = (byte) i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i5) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int i5;
        int i6 = this.f6575e;
        int i7 = (i6 < 2 || i6 > (i5 = f6573g)) ? super.read() : i6 == i5 ? this.f6574d : f6572f[i6 - 2] & 255;
        if (i7 != -1) {
            this.f6575e++;
        }
        return i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j5) throws IOException {
        long jSkip = super.skip(j5);
        if (jSkip > 0) {
            this.f6575e = (int) (((long) this.f6575e) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i5, int i6) throws IOException {
        int i7;
        int i8 = this.f6575e;
        int i9 = f6573g;
        if (i8 > i9) {
            i7 = super.read(bArr, i5, i6);
        } else if (i8 == i9) {
            bArr[i5] = this.f6574d;
            i7 = 1;
        } else if (i8 < 2) {
            i7 = super.read(bArr, i5, 2 - i8);
        } else {
            int iMin = Math.min(i9 - i8, i6);
            System.arraycopy(f6572f, this.f6575e - 2, bArr, i5, iMin);
            i7 = iMin;
        }
        if (i7 > 0) {
            this.f6575e += i7;
        }
        return i7;
    }
}
