package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: Ab */
/* JADX INFO: loaded from: classes.dex */
public final class C0018Ab extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public final long f34a;

    /* JADX INFO: renamed from: b */
    public int f35b;

    public C0018Ab(InputStream r1, long r2) {
        super(r1);
        this.f34a = r2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        monitor-enter(this);
        int r0 = (int) Math.max(this.f34a - ((long) this.f35b), ((FilterInputStream) this).in.available());
        monitor-exit(this);
        return r0;
    L7:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public final void m27d(int r7) {
        if (r7 < 0) goto L5;
        this.f35b += r7;
        return;
    L5:
        long r0 = this.f35b;
        long r2 = this.f34a;
        if ((r2 - r0) > 0) goto L9;
        return;
    L9:
        throw new IOException("Failed to read all expected data, expected: " + r2 + ", but read: " + this.f35b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        monitor-enter(this);
        int r0 = super.read();     // Catch: Throwable -> L10
        if (r0 < 0) goto L6;
        int r1 = 1;
    L7:
        m27d(r1);     // Catch: Throwable -> L10
        monitor-exit(this);
        return r0;
    L6:
        r1 = -1;
    L10:
        th = move-exception;
        throw th;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r3) {
        return read(r3, 0, r3.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] r1, int r2, int r3) {
        monitor-enter(this);
        int r12 = super.read(r1, r2, r3);     // Catch: Throwable -> L6
        m27d(r12);     // Catch: Throwable -> L6
        monitor-exit(this);
        return r12;
    L6:
        th = move-exception;
        throw th;
    }
}
