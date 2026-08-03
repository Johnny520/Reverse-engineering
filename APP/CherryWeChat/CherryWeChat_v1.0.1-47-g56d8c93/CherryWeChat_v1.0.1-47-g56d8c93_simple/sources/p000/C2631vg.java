package p000;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: vg */
/* JADX INFO: loaded from: classes.dex */
public final class C2631vg extends InputStream {

    /* JADX INFO: renamed from: c */
    public static final ArrayDeque f9139c = null;

    /* JADX INFO: renamed from: a */
    public C1340dv f9140a;

    /* JADX INFO: renamed from: b */
    public IOException f9141b;

    static {
        char[] r0 = AbstractC2622vD.f9104a;
        f9139c = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f9140a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9140a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int r2) {
        this.f9140a.mark(r2);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f9140a.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f9140a.read();
    L4:
        e = move-exception;
        this.f9141b = e;
        throw e;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        monitor-enter(this);
        this.f9140a.reset();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.InputStream
    public final long skip(long r2) {
        return this.f9140a.skip(r2);
    L4:
        e = move-exception;
        this.f9141b = e;
        throw e;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2) {
        return this.f9140a.read(r2);
    L4:
        e = move-exception;
        this.f9141b = e;
        throw e;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
        return this.f9140a.read(r2, r3, r4);
    L4:
        e = move-exception;
        this.f9141b = e;
        throw e;
    }
}
