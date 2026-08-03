package x7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends java.io.InputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f21208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f21209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f21210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21212k;

    public a(byte[] r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            int r0 = r2.length
            if (r3 < r0) goto L9
            int r3 = r2.length
            int r3 = r3 + (-1)
        L9:
            if (r3 >= 0) goto Lc
            r3 = 0
        Lc:
            int r0 = r2.length
            int r0 = r0 - r3
            if (r4 <= r0) goto L11
            r4 = r0
        L11:
            r1.f21208g = r2
            r1.f21209h = r3
            r1.f21210i = r4
            return
    }

    @Override // java.io.InputStream
    public final int available() {
            r2 = this;
            int r0 = r2.f21210i
            int r1 = r2.f21211j
            int r0 = r0 - r1
            return r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            int r0 = r1.f21210i
            r1.f21211j = r0
            return
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int r1) {
            r0 = this;
            monitor-enter(r0)
            r0.f21212k = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return
        L5:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
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
            r3 = this;
            int r0 = r3.available()
            if (r0 > 0) goto L8
            r0 = -1
            return r0
        L8:
            int r0 = r3.f21211j
            int r1 = r3.f21209h
            int r1 = r1 + r0
            byte[] r2 = r3.f21208g
            r1 = r2[r1]
            int r0 = r0 + 1
            r3.f21211j = r0
            r0 = r1 & 255(0xff, float:3.57E-43)
            return r0
    }

    @Override // java.io.InputStream
    public final int read(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r3 = r2.read(r3, r0, r1)
            return r3
    }

    @Override // java.io.InputStream
    public final int read(byte[] r3, int r4, int r5) {
            r2 = this;
            if (r5 != 0) goto L4
            r3 = 0
            return r3
        L4:
            int r0 = r2.available()
            if (r0 > 0) goto Lc
            r3 = -1
            return r3
        Lc:
            if (r5 <= r0) goto Lf
            r5 = r0
        Lf:
            int r0 = r2.f21209h
            int r1 = r2.f21211j
            int r0 = r0 + r1
            byte[] r1 = r2.f21208g
            java.lang.System.arraycopy(r1, r0, r3, r4, r5)
            int r3 = r2.f21211j
            int r3 = r3 + r5
            r2.f21211j = r3
            return r5
    }

    @Override // java.io.InputStream
    public final void reset() {
            r1 = this;
            int r0 = r1.f21212k
            r1.f21211j = r0
            return
    }

    @Override // java.io.InputStream
    public final long skip(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L7
            return r3
        L7:
            int r3 = (int) r3
            int r4 = r2.available()
            if (r3 <= r4) goto Lf
            r3 = r4
        Lf:
            int r4 = r2.f21211j
            int r4 = r4 + r3
            r2.f21211j = r4
            long r3 = (long) r3
            return r3
    }
}
