package defpackage;

/* JADX INFO: renamed from: ᛵᛱᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0821 extends java.io.InputStream {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f3782;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.nio.ByteBuffer f3783;

    public C0821(java.nio.ByteBuffer r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f3782 = r0
            r1.f3783 = r2
            return
    }

    @Override // java.io.InputStream
    public final int available() {
            r0 = this;
            java.nio.ByteBuffer r0 = r0.f3783
            int r0 = r0.remaining()
            return r0
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int r1) {
            r0 = this;
            monitor-enter(r0)
            java.nio.ByteBuffer r1 = r0.f3783     // Catch: java.lang.Throwable -> Lb
            int r1 = r1.position()     // Catch: java.lang.Throwable -> Lb
            r0.f3782 = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // java.io.InputStream
    public final int read() {
            r1 = this;
            java.nio.ByteBuffer r1 = r1.f3783
            boolean r0 = r1.hasRemaining()
            if (r0 != 0) goto La
            r1 = -1
            return r1
        La:
            byte r1 = r1.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            return r1
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
            r1 = this;
            java.nio.ByteBuffer r1 = r1.f3783
            boolean r0 = r1.hasRemaining()
            if (r0 != 0) goto La
            r1 = -1
            return r1
        La:
            int r0 = r1.remaining()
            int r4 = java.lang.Math.min(r4, r0)
            r1.get(r2, r3, r4)
            return r4
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f3782     // Catch: java.lang.Throwable -> Ld
            r1 = -1
            if (r0 == r1) goto Lf
            java.nio.ByteBuffer r1 = r2.f3783     // Catch: java.lang.Throwable -> Ld
            r1.position(r0)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        Ld:
            r0 = move-exception
            goto L17
        Lf:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Ld
            java.lang.String r1 = "Cannot reset to unset mark position"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0     // Catch: java.lang.Throwable -> Ld
        L17:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    @Override // java.io.InputStream
    public final long skip(long r3) {
            r2 = this;
            java.nio.ByteBuffer r2 = r2.f3783
            boolean r0 = r2.hasRemaining()
            if (r0 != 0) goto Lb
            r2 = -1
            return r2
        Lb:
            int r0 = r2.remaining()
            long r0 = (long) r0
            long r3 = java.lang.Math.min(r3, r0)
            int r0 = r2.position()
            long r0 = (long) r0
            long r0 = r0 + r3
            int r0 = (int) r0
            r2.position(r0)
            return r3
    }
}
