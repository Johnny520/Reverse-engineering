package k7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k7.a f7389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7390i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k7.a f7391j;

    public a() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f7388g = r0
            return
    }

    public static void D(byte[] r2, int r3, int r4) {
            int r0 = r3 + 4
            int r1 = r2.length
            if (r0 <= r1) goto L6
            return
        L6:
            int r0 = r3 + 3
            int r1 = r4 >>> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r3 + 2
            int r1 = r4 >>> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r3 + 1
            int r1 = r4 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2[r0] = r1
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    public static void E(byte[] r2, int r3, int r4) {
            int r0 = r3 + 1
            int r1 = r4 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2[r0] = r1
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    public static void F(byte[] r2, int r3, short r4) {
            int r0 = r3 + 1
            int r1 = r4 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r2[r0] = r1
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2[r3] = r4
            return
    }

    public static byte[] o(byte[] r4, byte[] r5) {
            r0 = 1
            r1 = 0
            if (r4 == 0) goto La
            int r2 = r4.length
            if (r2 != 0) goto L8
            goto La
        L8:
            r2 = r1
            goto Lb
        La:
            r2 = r0
        Lb:
            if (r5 == 0) goto L12
            int r3 = r5.length
            if (r3 != 0) goto L11
            goto L12
        L11:
            r0 = r1
        L12:
            if (r2 == 0) goto L18
            if (r0 == 0) goto L18
            r4 = 0
            return r4
        L18:
            if (r2 == 0) goto L1b
            return r5
        L1b:
            if (r0 == 0) goto L1e
            return r4
        L1e:
            int r0 = r4.length
            int r2 = r5.length
            int r0 = r0 + r2
            byte[] r0 = new byte[r0]
            int r2 = r4.length
            java.lang.System.arraycopy(r4, r1, r0, r1, r2)
            int r4 = r5.length
            java.lang.System.arraycopy(r5, r1, r0, r2, r4)
            return r0
    }

    public static boolean q(byte[] r0, int r1, int r2) {
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 >> r2
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto La
            return r1
        La:
            r0 = 0
            return r0
    }

    public static int s(byte[] r2, int r3) {
            int r0 = r3 + 4
            int r1 = r2.length
            if (r0 <= r1) goto L7
            r2 = 0
            return r2
        L7:
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    public static long t(byte[] r5, int r6) {
            int r0 = r6 + 8
            int r1 = r5.length
            r2 = 0
            if (r0 <= r1) goto L8
            return r2
        L8:
            int r0 = r6 + 7
        La:
            if (r0 < r6) goto L1a
            r1 = 8
            long r1 = r2 << r1
            r3 = r5[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            long r2 = r1 | r3
            int r0 = r0 + (-1)
            goto La
        L1a:
            return r2
    }

    public static short w(byte[] r2, int r3) {
            int r0 = r3 + 2
            int r1 = r2.length
            if (r0 <= r1) goto L7
            r2 = 0
            return r2
        L7:
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + 1
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r0
            short r2 = (short) r2
            return r2
    }

    public static int x(byte[] r2, int r3) {
            int r0 = r3 + 2
            int r1 = r2.length
            if (r0 <= r1) goto L7
            r2 = 0
            return r2
        L7:
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r3 + 1
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r0
            return r2
    }

    public void A(int r1) {
            r0 = this;
            return
    }

    public void B(q7.b r1) {
            r0 = this;
            return
    }

    public abstract int C(java.io.ByteArrayOutputStream r1);

    public final void G(q7.b r1) {
            r0 = this;
            r0.B(r1)
            k7.a r1 = r0.f7391j
            if (r1 == 0) goto La
            r1.m(r0)
        La:
            return
    }

    public final void H(int r3) {
            r2 = this;
            int r0 = r2.f7388g
            if (r3 != r0) goto L5
            goto Lf
        L5:
            r2.f7388g = r3
            r1 = -1
            if (r0 == r1) goto Lf
            if (r3 == r1) goto Lf
            r2.A(r3)
        Lf:
            return
    }

    public void I(boolean r1) {
            r0 = this;
            r0.f7390i = r1
            return
    }

    public final void J(k7.a r1) {
            r0 = this;
            if (r1 != r0) goto L3
            return
        L3:
            r0.f7389h = r1
            return
    }

    public final int K(java.io.ByteArrayOutputStream r2) {
            r1 = this;
            boolean r0 = r1.y()
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            int r2 = r1.C(r2)
            return r2
    }

    public k7.a d(java.lang.Class r1) {
            r0 = this;
            k7.a r1 = r0.v(r1)
            return r1
    }

    public abstract int p();

    public abstract byte[] r();

    public final k7.a u(java.lang.Class r3) {
            r2 = this;
            k7.a r0 = r2.f7389h
        L2:
            if (r0 == 0) goto Le
            java.lang.Class r1 = r0.getClass()
            if (r1 != r3) goto Lb
            return r0
        Lb:
            k7.a r0 = r0.f7389h
            goto L2
        Le:
            r3 = 0
            return r3
    }

    public final k7.a v(java.lang.Class r3) {
            r2 = this;
            k7.a r0 = r2.f7389h
        L2:
            if (r0 == 0) goto Le
            boolean r1 = r3.isInstance(r0)
            if (r1 == 0) goto Lb
            return r0
        Lb:
            k7.a r0 = r0.f7389h
            goto L2
        Le:
            r3 = 0
            return r3
    }

    public boolean y() {
            r1 = this;
            boolean r0 = r1.f7390i
            return r0
    }

    public abstract void z(f6.b r1);
}
