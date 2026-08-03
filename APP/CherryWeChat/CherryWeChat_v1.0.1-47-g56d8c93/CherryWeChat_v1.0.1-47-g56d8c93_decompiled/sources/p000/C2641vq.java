package p000;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: vq */
/* JADX INFO: loaded from: classes.dex */
public final class C2641vq extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public int f9154a;

    public C2641vq(C2631vg c2631vg) {
        super(c2631vg);
        this.f9154a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.f9154a;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    /* JADX INFO: renamed from: d */
    public final long m5174d(long j) {
        int i = this.f9154a;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    /* JADX INFO: renamed from: f */
    public final void m5175f(long j) {
        int i = this.f9154a;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f9154a = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f9154a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (m5174d(1L) == -1) {
            return -1;
        }
        int i = super.read();
        m5175f(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f9154a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jM5174d = m5174d(j);
        if (jM5174d == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM5174d);
        m5175f(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iM5174d = (int) m5174d(i2);
        if (iM5174d == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iM5174d);
        m5175f(i3);
        return i3;
    }
}
