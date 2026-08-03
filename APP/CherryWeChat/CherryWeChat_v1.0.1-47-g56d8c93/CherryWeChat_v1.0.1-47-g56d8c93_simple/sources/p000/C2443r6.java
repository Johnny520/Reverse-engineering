package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: r6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2443r6 extends InputStream {

    /* JADX INFO: renamed from: a */
    public final ByteBuffer f8559a;

    /* JADX INFO: renamed from: b */
    public int f8560b;

    public C2443r6(ByteBuffer r2) {
        this.f8560b = -1;
        this.f8559a = r2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f8559a.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int r1) {
        monitor-enter(this);
        this.f8560b = this.f8559a.position();     // Catch: Throwable -> L6
        monitor-exit(this);
        return;
    L6:
        th = move-exception;
        throw th;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer r0 = this.f8559a;
        if (r0.hasRemaining() == true) goto L7;
        return -1;
    L7:
        return r0.get() & 255;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        monitor-enter(this);
        int r0 = this.f8560b;     // Catch: Throwable -> L8
        if (r0 == (-1)) goto L11;
        this.f8559a.position(r0);     // Catch: Throwable -> L8
        monitor-exit(this);
        return;
    L11:
        throw new IOException("Cannot reset to unset mark position");     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        throw th;
    }

    @Override // java.io.InputStream
    public final long skip(long r4) {
        ByteBuffer r0 = this.f8559a;
        if (r0.hasRemaining() == true) goto L6;
        return -1;
    L6:
        long r42 = Math.min(r4, r0.remaining());
        r0.position((int) (((long) r0.position()) + r42));
        return r42;
    }

    @Override // java.io.InputStream
    public final int read(byte[] r3, int r4, int r5) {
        ByteBuffer r0 = this.f8559a;
        if (r0.hasRemaining() == true) goto L6;
        return -1;
    L6:
        int r52 = Math.min(r5, r0.remaining());
        r0.get(r3, r4, r52);
        return r52;
    }
}
