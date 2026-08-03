package p000;

/* JADX INFO: loaded from: classes.dex */
public final class c9 implements p000.db, p000.cb {

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public static final java.util.TreeMap<java.lang.Integer, p000.c9> f265 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public volatile java.lang.String f266;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final long[] f267;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final double[] f268;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final java.lang.String[] f269;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final byte[][] f270;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final int[] f271;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final int f272;

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public int f273;

    static {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            p000.c9.f265 = r0
            return
    }

    public c9() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f272 = r0
            r0 = 1
            int[] r1 = new int[r0]
            r2.f271 = r1
            long[] r1 = new long[r0]
            r2.f267 = r1
            double[] r1 = new double[r0]
            r2.f268 = r1
            java.lang.String[] r1 = new java.lang.String[r0]
            r2.f269 = r1
            byte[][] r0 = new byte[r0][]
            r2.f270 = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }

    @Override // p000.db
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void mo112(p000.f8 r6) {
            r5 = this;
            r0 = 1
            r1 = r0
        L2:
            int r2 = r5.f273
            if (r1 > r2) goto L3f
            int[] r2 = r5.f271
            r2 = r2[r1]
            if (r2 == r0) goto L39
            r3 = 2
            if (r2 == r3) goto L31
            r3 = 3
            if (r2 == r3) goto L29
            r3 = 4
            if (r2 == r3) goto L21
            r3 = 5
            if (r2 == r3) goto L19
            goto L3c
        L19:
            byte[][] r2 = r5.f270
            r2 = r2[r1]
            r6.m159(r1, r2)
            goto L3c
        L21:
            java.lang.String[] r2 = r5.f269
            r2 = r2[r1]
            r6.mo113(r1, r2)
            goto L3c
        L29:
            double[] r2 = r5.f268
            r3 = r2[r1]
            r6.m160(r1, r3)
            goto L3c
        L31:
            long[] r2 = r5.f267
            r3 = r2[r1]
            r6.mo116(r1, r3)
            goto L3c
        L39:
            r6.mo114(r1)
        L3c:
            int r1 = r1 + 1
            goto L2
        L3f:
            return
    }

    @Override // p000.cb
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final void mo113(int r3, java.lang.String r4) {
            r2 = this;
            int[] r0 = r2.f271
            r1 = 4
            r0[r3] = r1
            java.lang.String[] r0 = r2.f269
            r0[r3] = r4
            return
    }

    @Override // p000.cb
    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final void mo114(int r3) {
            r2 = this;
            int[] r0 = r2.f271
            r1 = 1
            r0[r3] = r1
            return
    }

    @Override // p000.db
    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final java.lang.String mo115() {
            r1 = this;
            java.lang.String r0 = r1.f266
            return r0
    }

    @Override // p000.cb
    /* JADX INFO: renamed from: ۥ۠, reason: contains not printable characters */
    public final void mo116(int r3, long r4) {
            r2 = this;
            int[] r0 = r2.f271
            r1 = 2
            r0[r3] = r1
            long[] r0 = r2.f267
            r0[r3] = r4
            return
    }

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public final void m117() {
            r4 = this;
            java.util.TreeMap<java.lang.Integer, ۟.c9> r0 = p000.c9.f265
            monitor-enter(r0)
            int r1 = r4.f272     // Catch: java.lang.Throwable -> L30
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L30
            r0.put(r1, r4)     // Catch: java.lang.Throwable -> L30
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L30
            r2 = 15
            if (r1 <= r2) goto L2e
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L30
            int r1 = r1 + (-10)
            java.util.NavigableSet r2 = r0.descendingKeySet()     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L30
        L22:
            int r3 = r1 + (-1)
            if (r1 <= 0) goto L2e
            r2.next()     // Catch: java.lang.Throwable -> L30
            r2.remove()     // Catch: java.lang.Throwable -> L30
            r1 = r3
            goto L22
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L30
            throw r1
    }
}
