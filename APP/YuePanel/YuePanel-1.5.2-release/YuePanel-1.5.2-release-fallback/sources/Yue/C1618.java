package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C1618 extends java.io.FilterInputStream {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final java.io.BufferedInputStream f5049;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean f5050;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f5051;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public long f5052;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public long f5053;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f5054;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f5055;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f5056;

    public C1618(java.io.BufferedInputStream r4, int r5) {
            r3 = this;
            r3.<init>(r4)
            r0 = 0
            r3.f5053 = r0
            r0 = 0
            r1 = 1
            if (r5 < 0) goto Ld
            r2 = r1
            goto Le
        Ld:
            r2 = r0
        Le:
            Yue.C6657.m25628(r2)
            r3.f5049 = r4
            if (r5 == 0) goto L16
            r0 = r1
        L16:
            r3.f5050 = r0
            r3.f5051 = r5
            r3.f5054 = r5
            r4 = -1
            r3.f5055 = r4
            long r4 = java.lang.System.nanoTime()
            r3.f5052 = r4
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.nio.ByteBuffer m7837(java.io.InputStream r7, int r8) throws java.io.IOException {
            r0 = 1
            r1 = 0
            if (r8 < 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            java.lang.String r3 = "maxSize must be 0 (unlimited) or larger"
            Yue.C6657.m25629(r2, r3)
            Yue.C6657.m25635(r7)
            if (r8 <= 0) goto L12
            goto L13
        L12:
            r0 = r1
        L13:
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L1b
            if (r8 >= r2) goto L1b
            r2 = r8
        L1b:
            byte[] r3 = new byte[r2]
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>(r2)
        L22:
            if (r0 == 0) goto L29
            int r5 = java.lang.Math.min(r8, r2)
            goto L2a
        L29:
            r5 = r2
        L2a:
            int r5 = r7.read(r3, r1, r5)
            r6 = -1
            if (r5 != r6) goto L32
            goto L39
        L32:
            if (r0 == 0) goto L43
            if (r5 < r8) goto L42
            r4.write(r3, r1, r8)
        L39:
            byte[] r7 = r4.toByteArray()
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7)
            return r7
        L42:
            int r8 = r8 - r5
        L43:
            r4.write(r3, r1, r5)
            goto L22
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static Yue.C1618 m7838(java.io.InputStream r2, int r3, int r4) {
            boolean r0 = r2 instanceof Yue.C1618
            if (r0 == 0) goto L7
            Yue.ۥ۟ۧۥۧ r2 = (Yue.C1618) r2
            return r2
        L7:
            boolean r0 = r2 instanceof java.io.BufferedInputStream
            if (r0 == 0) goto L13
            Yue.ۥ۟ۧۥۧ r3 = new Yue.ۥ۟ۧۥۧ
            java.io.BufferedInputStream r2 = (java.io.BufferedInputStream) r2
            r3.<init>(r2, r4)
            return r3
        L13:
            Yue.ۥ۟ۧۥۧ r0 = new Yue.ۥ۟ۧۥۧ
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r1.<init>(r2, r3)
            r0.<init>(r1, r4)
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int r2) {
            r1 = this;
            super.mark(r2)
            int r2 = r1.f5051
            int r0 = r1.f5054
            int r2 = r2 - r0
            r1.f5055 = r2
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.f5056
            r1 = -1
            if (r0 != 0) goto L3f
            boolean r0 = r2.f5050
            if (r0 == 0) goto Le
            int r0 = r2.f5054
            if (r0 > 0) goto Le
            goto L3f
        Le:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 == 0) goto L1c
            r3 = 1
            r2.f5056 = r3
            return r1
        L1c:
            boolean r0 = r2.m7839()
            if (r0 != 0) goto L37
            boolean r0 = r2.f5050
            if (r0 == 0) goto L2b
            int r0 = r2.f5054
            if (r5 <= r0) goto L2b
            r5 = r0
        L2b:
            int r3 = super.read(r3, r4, r5)     // Catch: java.net.SocketTimeoutException -> L35
            int r4 = r2.f5054     // Catch: java.net.SocketTimeoutException -> L35
            int r4 = r4 - r3
            r2.f5054 = r4     // Catch: java.net.SocketTimeoutException -> L35
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

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws java.io.IOException {
            r2 = this;
            super.reset()
            int r0 = r2.f5051
            int r1 = r2.f5055
            int r0 = r0 - r1
            r2.f5054 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final boolean m7839() {
            r6 = this;
            long r0 = r6.f5053
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            long r2 = java.lang.System.nanoTime()
            long r4 = r6.f5052
            long r2 = r2 - r4
            long r4 = r6.f5053
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L18
            r1 = 1
        L18:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.io.BufferedInputStream m7840() {
            r1 = this;
            java.io.BufferedInputStream r0 = r1.f5049
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.C1618 m7841(long r1, long r3) {
            r0 = this;
            r0.f5052 = r1
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r1
            r0.f5053 = r3
            return r0
    }
}
