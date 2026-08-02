package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class oh0 extends FilterInputStream {

    /* JADX INFO: renamed from: j */
    public static final byte[] f7679j = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: k */
    public static final int f7680k = 31;

    /* JADX INFO: renamed from: h */
    public final byte f7681h;

    /* JADX INFO: renamed from: i */
    public int f7682i;

    public oh0(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            C0676s.m4651j(vi0.m5688g("Cannot add invalid orientation: ", i));
            throw null;
        }
        this.f7681h = (byte) i;
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
        int i4 = this.f7682i;
        int i5 = f7680k;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f7681h;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f7679j, this.f7682i - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f7682i += i3;
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
            this.f7682i = (int) (((long) this.f7682i) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f7682i;
        if (i3 < 2 || i3 > (i2 = f7680k)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.f7681h;
        } else {
            i = f7679j[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f7682i++;
        }
        return i;
    }
}
