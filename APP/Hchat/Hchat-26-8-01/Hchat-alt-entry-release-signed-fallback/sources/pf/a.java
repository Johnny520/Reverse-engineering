package pf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends java.io.InputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.nio.ByteBuffer f10550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10551h;

    public a(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f10551h = r0
            r1.f10550g = r2
            return
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int r1) {
            r0 = this;
            monitor-enter(r0)
            java.nio.ByteBuffer r1 = r0.f10550g     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.position()     // Catch: java.lang.Throwable -> Lb
            r0.f10551h = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.io.InputStream
    public final int read() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f10550g
            boolean r1 = r0.hasRemaining()
            if (r1 != 0) goto La
            r0 = -1
            return r0
        La:
            byte r0 = r0.get()
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @Override // java.io.InputStream
    public final int read(byte[] r3, int r4, int r5) {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f10550g
            boolean r1 = r0.hasRemaining()
            if (r1 != 0) goto La
            r3 = -1
            return r3
        La:
            int r1 = r0.remaining()
            int r5 = java.lang.Math.min(r5, r1)
            r0.get(r3, r4, r5)
            return r5
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
            r2 = this;
            monitor-enter(r2)
            java.nio.ByteBuffer r0 = r2.f10550g     // Catch: java.lang.Throwable -> Ld
            int r1 = r2.f10551h     // Catch: java.lang.Throwable -> Ld
            java.nio.Buffer r0 = r0.position(r1)     // Catch: java.lang.Throwable -> Ld
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }
}
