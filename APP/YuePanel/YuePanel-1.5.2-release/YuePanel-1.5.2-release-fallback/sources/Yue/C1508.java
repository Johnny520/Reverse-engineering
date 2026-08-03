package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class C1508 extends java.io.BufferedInputStream {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean f4723;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f4724;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public long f4725;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public long f4726;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f4727;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f4728;

    public C1508(java.io.InputStream r2, int r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 0
            r1.f4726 = r2
            r2 = 0
            r3 = 1
            if (r4 < 0) goto Ld
            r0 = r3
            goto Le
        Ld:
            r0 = r2
        Le:
            Yue.C6657.m25628(r0)
            r1.f4724 = r4
            r1.f4727 = r4
            if (r4 == 0) goto L18
            r2 = r3
        L18:
            r1.f4723 = r2
            long r2 = java.lang.System.nanoTime()
            r1.f4725 = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.C1508 m7402(java.io.InputStream r1, int r2, int r3) {
            boolean r0 = r1 instanceof Yue.C1508
            if (r0 == 0) goto L7
            Yue.ۥ۟ۧ۟ r1 = (Yue.C1508) r1
            goto Ld
        L7:
            Yue.ۥ۟ۧ۟ r0 = new Yue.ۥ۟ۧ۟
            r0.<init>(r1, r2, r3)
            r1 = r0
        Ld:
            return r1
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.f4728
            r1 = -1
            if (r0 != 0) goto L3f
            boolean r0 = r2.f4723
            if (r0 == 0) goto Le
            int r0 = r2.f4727
            if (r0 > 0) goto Le
            goto L3f
        Le:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 == 0) goto L1c
            r3 = 1
            r2.f4728 = r3
            return r1
        L1c:
            boolean r0 = r2.m7403()
            if (r0 != 0) goto L37
            boolean r0 = r2.f4723
            if (r0 == 0) goto L2b
            int r0 = r2.f4727
            if (r5 <= r0) goto L2b
            r5 = r0
        L2b:
            int r3 = super.read(r3, r4, r5)     // Catch: java.net.SocketTimeoutException -> L35
            int r4 = r2.f4727     // Catch: java.net.SocketTimeoutException -> L35
            int r4 = r4 - r3
            r2.f4727 = r4     // Catch: java.net.SocketTimeoutException -> L35
            return r3
        L35:
            r3 = 0
            return r3
        L37:
            java.net.SocketTimeoutException r3 = new java.net.SocketTimeoutException
            java.lang.String r4 = "Read timeout"
            r3.<init>(r4)
            throw r3
        L3f:
            return r1
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws java.io.IOException {
            r2 = this;
            super.reset()
            int r0 = r2.f4724
            int r1 = r2.markpos
            int r0 = r0 - r1
            r2.f4727 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m7403() {
            r6 = this;
            long r0 = r6.f4726
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            long r2 = java.lang.System.nanoTime()
            long r4 = r6.f4725
            long r2 = r2 - r4
            long r4 = r6.f4726
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L18
            r1 = 1
        L18:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.nio.ByteBuffer m7404(int r1) throws java.io.IOException {
            r0 = this;
            java.nio.ByteBuffer r1 = Yue.C1726.m8238(r0, r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Yue.C1508 m7405(long r1, long r3) {
            r0 = this;
            r0.f4725 = r1
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r1
            r0.f4726 = r3
            return r0
    }
}
