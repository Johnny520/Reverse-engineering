package p195l2;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2508l extends FilterInputStream {

    /* JADX INFO: renamed from: d */
    public int f8024d;

    public C2508l(C2501e c2501e) {
        super(c2501e);
        this.f8024d = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i5 = this.f8024d;
        return i5 == Integer.MIN_VALUE ? super.available() : Math.min(i5, super.available());
    }

    /* JADX INFO: renamed from: b */
    public final long m4450b(long j5) {
        int i5 = this.f8024d;
        if (i5 == 0) {
            return -1L;
        }
        return (i5 == Integer.MIN_VALUE || j5 <= ((long) i5)) ? j5 : i5;
    }

    /* JADX INFO: renamed from: c */
    public final void m4451c(long j5) {
        int i5 = this.f8024d;
        if (i5 == Integer.MIN_VALUE || j5 == -1) {
            return;
        }
        this.f8024d = (int) (((long) i5) - j5);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i5) {
        super.mark(i5);
        this.f8024d = i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (m4450b(1L) == -1) {
            return -1;
        }
        int i5 = super.read();
        m4451c(1L);
        return i5;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f8024d = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j5) throws IOException {
        long jM4450b = m4450b(j5);
        if (jM4450b == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM4450b);
        m4451c(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i5, int i6) throws IOException {
        int iM4450b = (int) m4450b(i6);
        if (iM4450b == -1) {
            return -1;
        }
        int i7 = super.read(bArr, i5, iM4450b);
        m4451c(i7);
        return i7;
    }
}
