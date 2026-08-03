package p000;

/* JADX INFO: loaded from: classes.dex */
public final class p5 extends java.io.InputStream {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.io.InputStream f890;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public long f891;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public long f892;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public long f893;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public long f894;

    public p5(java.io.InputStream r3) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f894 = r0
            boolean r0 = r3.markSupported()
            if (r0 != 0) goto L15
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            r1 = 4096(0x1000, float:5.74E-42)
            r0.<init>(r3, r1)
            r3 = r0
        L15:
            r2.f890 = r3
            return
    }

    @Override // java.io.InputStream
    public final int available() {
            r1 = this;
            java.io.InputStream r0 = r1.f890
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            java.io.InputStream r0 = r1.f890
            r0.close()
            return
    }

    @Override // java.io.InputStream
    public final void mark(int r3) {
            r2 = this;
            long r0 = r2.m335(r3)
            r2.f894 = r0
            return
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
            r1 = this;
            java.io.InputStream r0 = r1.f890
            boolean r0 = r0.markSupported()
            return r0
    }

    @Override // java.io.InputStream
    public final int read() {
            r5 = this;
            java.io.InputStream r0 = r5.f890
            int r0 = r0.read()
            r1 = -1
            if (r0 == r1) goto L10
            long r1 = r5.f891
            r3 = 1
            long r1 = r1 + r3
            r5.f891 = r1
        L10:
            return r0
    }

    @Override // java.io.InputStream
    public final int read(byte[] r5) {
            r4 = this;
            java.io.InputStream r0 = r4.f890
            int r5 = r0.read(r5)
            r0 = -1
            if (r5 == r0) goto Lf
            long r0 = r4.f891
            long r2 = (long) r5
            long r0 = r0 + r2
            r4.f891 = r0
        Lf:
            return r5
    }

    @Override // java.io.InputStream
    public final int read(byte[] r3, int r4, int r5) {
            r2 = this;
            java.io.InputStream r0 = r2.f890
            int r3 = r0.read(r3, r4, r5)
            r4 = -1
            if (r3 == r4) goto Lf
            long r4 = r2.f891
            long r0 = (long) r3
            long r4 = r4 + r0
            r2.f891 = r4
        Lf:
            return r3
    }

    @Override // java.io.InputStream
    public final void reset() {
            r2 = this;
            long r0 = r2.f894
            r2.m334(r0)
            return
    }

    @Override // java.io.InputStream
    public final long skip(long r3) {
            r2 = this;
            java.io.InputStream r0 = r2.f890
            long r3 = r0.skip(r3)
            long r0 = r2.f891
            long r0 = r0 + r3
            r2.f891 = r0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m334(long r5) {
            r4 = this;
            long r0 = r4.f891
            long r2 = r4.f893
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L1b
            long r0 = r4.f892
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L1b
            java.io.InputStream r0 = r4.f890
            r0.reset()
            long r0 = r4.f892
            r4.m336(r0, r5)
            r4.f891 = r5
            return
        L1b:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "Cannot reset"
            r5.<init>(r6)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final long m335(int r9) {
            r8 = this;
            long r0 = r8.f891
            long r2 = (long) r9
            long r2 = r2 + r0
            long r4 = r8.f893
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 >= 0) goto L50
            long r6 = r8.f892     // Catch: java.io.IOException -> L38
            int r9 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r9 >= 0) goto L2b
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 > 0) goto L2b
            java.io.InputStream r9 = r8.f890     // Catch: java.io.IOException -> L38
            r9.reset()     // Catch: java.io.IOException -> L38
            java.io.InputStream r9 = r8.f890     // Catch: java.io.IOException -> L38
            long r0 = r8.f892     // Catch: java.io.IOException -> L38
            long r0 = r2 - r0
            int r0 = (int) r0     // Catch: java.io.IOException -> L38
            r9.mark(r0)     // Catch: java.io.IOException -> L38
            long r0 = r8.f892     // Catch: java.io.IOException -> L38
            long r4 = r8.f891     // Catch: java.io.IOException -> L38
            r8.m336(r0, r4)     // Catch: java.io.IOException -> L38
            goto L35
        L2b:
            r8.f892 = r0     // Catch: java.io.IOException -> L38
            java.io.InputStream r9 = r8.f890     // Catch: java.io.IOException -> L38
            long r0 = r2 - r0
            int r0 = (int) r0     // Catch: java.io.IOException -> L38
            r9.mark(r0)     // Catch: java.io.IOException -> L38
        L35:
            r8.f893 = r2     // Catch: java.io.IOException -> L38
            goto L50
        L38:
            r9 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to mark: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L50:
            long r0 = r8.f891
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public final void m336(long r5, long r7) {
            r4 = this;
        L0:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L1e
            java.io.InputStream r0 = r4.f890
            long r1 = r7 - r5
            long r0 = r0.skip(r1)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L1c
            int r0 = r4.read()
            r1 = -1
            if (r0 != r1) goto L1a
            goto L1e
        L1a:
            r0 = 1
        L1c:
            long r5 = r5 + r0
            goto L0
        L1e:
            return
    }
}
