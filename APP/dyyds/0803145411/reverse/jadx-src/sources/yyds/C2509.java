package yyds;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: yyds.ᲇᲀᛲᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2509 extends FilterInputStream {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final byte[] f12370 = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final int f12371 = 31;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final byte f12372;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f12373;

    public C2509(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            C0188.m798(AbstractC0897.m1989(i, "Cannot add invalid orientation: "));
            throw null;
        }
        this.f12372 = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f12373;
        int i5 = f12371;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f12372;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f12370, this.f12373 - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f12373 += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f12373 = (int) (((long) this.f12373) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f12373;
        if (i3 < 2 || i3 > (i2 = f12371)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f12372;
        } else {
            i = f12370[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f12373++;
        }
        return i;
    }
}
