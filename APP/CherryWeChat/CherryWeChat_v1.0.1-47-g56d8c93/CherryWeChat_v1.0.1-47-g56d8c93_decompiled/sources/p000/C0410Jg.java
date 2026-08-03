package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Jg */
/* JADX INFO: loaded from: classes.dex */
public final class C0410Jg extends FilterInputStream {

    /* JADX INFO: renamed from: c */
    public static final byte[] f1373c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: d */
    public static final int f1374d = 31;

    /* JADX INFO: renamed from: a */
    public final byte f1375a;

    /* JADX INFO: renamed from: b */
    public int f1376b;

    public C0410Jg(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(AbstractC2374ph.m4812i(i, "Cannot add invalid orientation: "));
        }
        this.f1375a = (byte) i;
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
    public final int read() {
        int i;
        int i2 = this.f1376b;
        int i3 = (i2 < 2 || i2 > (i = f1374d)) ? super.read() : i2 == i ? this.f1375a : f1373c[i2 - 2] & 255;
        if (i3 != -1) {
            this.f1376b++;
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
            this.f1376b = (int) (((long) this.f1376b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f1376b;
        int i5 = f1374d;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f1375a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f1373c, this.f1376b - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f1376b += i3;
        }
        return i3;
    }
}
