package x7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends java.io.InputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.nio.channels.FileChannel f21214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f21215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f21216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f21217j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f21218k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21219l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21220m;

    public c(java.nio.channels.FileChannel r4, long r5) {
            r3 = this;
            r3.<init>()
            r3.f21214g = r4
            r3.f21215h = r5
            r0 = 102400(0x19000, float:1.43493E-40)
            long r1 = (long) r0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 >= 0) goto L10
            int r0 = (int) r5
        L10:
            byte[] r5 = new byte[r0]
            r3.f21218k = r5
            r3.f21220m = r0
            r3.f21219l = r0
            long r4 = r4.position()
            r3.f21216i = r4
            return
    }

    public final void a() {
            r6 = this;
            int r0 = r6.f21219l
            int r1 = r6.f21220m
            if (r0 >= r1) goto L7
            return
        L7:
            byte[] r0 = r6.f21218k
            int r1 = r0.length
            long r2 = r6.f21215h
            long r4 = r6.f21217j
            long r2 = r2 - r4
            long r4 = (long) r1
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L15
            int r1 = (int) r2
        L15:
            r2 = 0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0, r2, r1)
            java.nio.channels.FileChannel r1 = r6.f21214g
            int r0 = r1.read(r0)
            r6.f21220m = r0
            r6.f21219l = r2
            return
    }

    @Override // java.io.InputStream
    public final int available() {
            r4 = this;
            long r0 = r4.f21215h
            long r2 = r4.f21217j
            long r0 = r0 - r2
            int r0 = (int) r0
            return r0
    }

    public final int b(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.f21220m
            int r1 = r2.f21219l
            int r0 = r0 - r1
            if (r0 != 0) goto L9
            r3 = 0
            return r3
        L9:
            if (r5 <= r0) goto Lc
            r5 = r0
        Lc:
            byte[] r0 = r2.f21218k
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            int r3 = r2.f21219l
            int r3 = r3 + r5
            r2.f21219l = r3
            long r3 = r2.f21217j
            long r0 = (long) r5
            long r3 = r3 + r0
            r2.f21217j = r3
            return r5
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int r3) {
            r2 = this;
            monitor-enter(r2)
            if (r3 >= 0) goto L4
            r3 = 0
        L4:
            long r0 = (long) r3
            r2.f21216i = r0     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return
        L9:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r3
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
            r0 = 1
            byte[] r1 = new byte[r0]
            r2 = 0
            int r0 = r3.read(r1, r2, r0)
            if (r0 >= 0) goto Lb
            return r0
        Lb:
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
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
    public final int read(byte[] r7, int r8, int r9) {
            r6 = this;
            long r0 = r6.f21217j
            long r2 = r6.f21215h
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto La
            r7 = -1
            return r7
        La:
            if (r9 != 0) goto Le
            r7 = 0
            return r7
        Le:
            r6.a()
            int r0 = r6.b(r7, r8, r9)
            int r9 = r9 - r0
            int r8 = r8 + r0
        L17:
            if (r9 <= 0) goto L2b
            long r4 = r6.f21217j
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 < 0) goto L20
            return r0
        L20:
            r6.a()
            int r1 = r6.b(r7, r8, r9)
            int r0 = r0 + r1
            int r9 = r9 - r1
            int r8 = r8 + r1
            goto L17
        L2b:
            return r0
    }

    @Override // java.io.InputStream
    public final void reset() {
            r3 = this;
            r0 = 0
            r3.f21217j = r0
            int r0 = r3.f21220m
            r3.f21219l = r0
            java.nio.channels.FileChannel r0 = r3.f21214g
            long r1 = r3.f21216i
            r0.position(r1)
            return
    }

    @Override // java.io.InputStream
    public final long skip(long r8) {
            r7 = this;
            r0 = 0
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            goto L21
        L7:
            int r2 = r7.f21220m
            int r3 = r7.f21219l
            int r2 = r2 - r3
            long r4 = (long) r2
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 <= 0) goto L12
            int r2 = (int) r8
        L12:
            int r3 = r3 + r2
            r7.f21219l = r3
            long r3 = r7.f21217j
            long r5 = (long) r2
            long r3 = r3 + r5
            r7.f21217j = r3
            long r5 = r8 - r5
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L22
        L21:
            return r8
        L22:
            long r0 = r7.f21215h
            long r0 = r0 - r3
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L2a
            r0 = r5
        L2a:
            long r3 = r3 + r0
            r7.f21217j = r3
            long r5 = r5 - r0
            long r8 = r8 - r5
            java.nio.channels.FileChannel r2 = r7.f21214g
            long r3 = r2.position()
            long r3 = r3 + r0
            r2.position(r3)
            return r8
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.f21217j
            r0.append(r1)
            java.lang.String r1 = " / "
            r0.append(r1)
            long r1 = r3.f21215h
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.io.InputStream
    public final long transferTo(java.io.OutputStream r9) {
            r8 = this;
            long r0 = r8.f21217j
            long r2 = r8.f21215h
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = 0
            if (r0 < 0) goto Lb
            return r4
        Lb:
            long r0 = r8.f21217j
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L12
            return r4
        L12:
            r8.a()
            int r0 = r8.f21219l
            int r1 = r8.f21220m
            int r1 = r1 - r0
            if (r1 > 0) goto L1d
            return r4
        L1d:
            byte[] r6 = r8.f21218k
            r9.write(r6, r0, r1)
            int r0 = r8.f21219l
            int r0 = r0 + r1
            r8.f21219l = r0
            long r6 = r8.f21217j
            long r0 = (long) r1
            long r6 = r6 + r0
            r8.f21217j = r6
            long r4 = r4 + r0
            goto Lb
    }
}
