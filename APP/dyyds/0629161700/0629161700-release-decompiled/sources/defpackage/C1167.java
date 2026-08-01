package defpackage;

/* JADX INFO: renamed from: ᛶᲇᛳᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1167 extends java.io.FilterInputStream {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f5284;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final long f5285;

    public C1167(java.io.InputStream r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f5285 = r2
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.f5285     // Catch: java.lang.Throwable -> L15
            int r2 = r4.f5284     // Catch: java.lang.Throwable -> L15
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L15
            long r0 = r0 - r2
            java.io.InputStream r2 = r4.in     // Catch: java.lang.Throwable -> L15
            int r2 = r2.available()     // Catch: java.lang.Throwable -> L15
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L15
            long r0 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> L15
            int r0 = (int) r0
            monitor-exit(r4)
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
            r2 = this;
            monitor-enter(r2)
            int r0 = super.read()     // Catch: java.lang.Throwable -> Lf
            if (r0 < 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = -1
        La:
            r2.m2248(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r2 = r2.read(r3, r0, r1)
            return r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] r1, int r2, int r3) {
            r0 = this;
            monitor-enter(r0)
            int r1 = super.read(r1, r2, r3)     // Catch: java.lang.Throwable -> La
            r0.m2248(r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return r1
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2248(int r7) {
            r6 = this;
            int r0 = r6.f5284
            if (r7 < 0) goto L8
            int r0 = r0 + r7
            r6.f5284 = r0
            return
        L8:
            long r0 = (long) r0
            long r2 = r6.f5285
            long r0 = r2 - r0
            r4 = 0
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 > 0) goto L14
            return
        L14:
            java.io.IOException r7 = new java.io.IOException
            int r6 = r6.f5284
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to read all expected data, expected: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ", but read: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
    }
}
