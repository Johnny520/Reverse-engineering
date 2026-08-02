package p000;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ye1 extends FilterInputStream {

    /* JADX INFO: renamed from: h */
    public int f13429h;

    public ye1(rg0 rg0Var) {
        super(rg0Var);
        this.f13429h = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.f13429h;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    /* JADX INFO: renamed from: b */
    public final long m6264b(long j) {
        int i = this.f13429h;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    /* JADX INFO: renamed from: c */
    public final void m6265c(long j) {
        int i = this.f13429h;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f13429h = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f13429h = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (m6264b(1L) == -1) {
            return -1;
        }
        int i = super.read();
        m6265c(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f13429h = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jM6264b = m6264b(j);
        if (jM6264b == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM6264b);
        m6265c(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iM6264b = (int) m6264b(i2);
        if (iM6264b == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iM6264b);
        m6265c(i3);
        return i3;
    }
}
