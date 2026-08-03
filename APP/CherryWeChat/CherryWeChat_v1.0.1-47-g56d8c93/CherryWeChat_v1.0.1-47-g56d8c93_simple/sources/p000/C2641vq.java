package p000;

import java.io.FilterInputStream;

/* JADX INFO: renamed from: vq */
/* JADX INFO: loaded from: classes.dex */
public final class C2641vq extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public int f9154a;

    public C2641vq(C2631vg r1) {
        super(r1);
        this.f9154a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int r0 = this.f9154a;
        if (r0 != Integer.MIN_VALUE) goto L7;
        return super.available();
    L7:
        return Math.min(r0, super.available());
    }

    /* JADX INFO: renamed from: d */
    public final long m5174d(long r4) {
        int r0 = this.f9154a;
        if (r0 != 0) goto L7;
        return -1;
    L7:
        if (r0 != Integer.MIN_VALUE) goto L9;
        return r4;
    L9:
        if (r4 > r0) goto L11;
        return r4;
    L11:
        return r0;
    }

    /* JADX INFO: renamed from: f */
    public final void m5175f(long r4) {
        int r0 = this.f9154a;
        if (r0 != Integer.MIN_VALUE) goto L5;
        return;
    L5:
        if (r4 == (-1)) goto L9;
        this.f9154a = (int) (((long) r0) - r4);
        return;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int r1) {
        monitor-enter(this);
        super.mark(r1);     // Catch: Throwable -> L6
        this.f9154a = r1;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (m5174d(1) != (-1)) goto L6;
        return -1;
    L6:
        int r2 = super.read();
        m5175f(1);
        return r2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        monitor-enter(this);
        super.reset();     // Catch: Throwable -> L6
        this.f9154a = Integer.MIN_VALUE;     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long r3) {
        long r32 = m5174d(r3);
        if (r32 != (-1)) goto L6;
        return 0;
    L6:
        long r33 = super.skip(r32);
        m5175f(r33);
        return r33;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r3, int r4, int r5) {
        int r52 = (int) m5174d(r5);
        if (r52 != (-1)) goto L5;
        return -1;
    L5:
        int r32 = super.read(r3, r4, r52);
        m5175f(r32);
        return r32;
    }
}
