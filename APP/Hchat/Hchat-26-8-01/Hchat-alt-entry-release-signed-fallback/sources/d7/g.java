package d7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends d7.t {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2039o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2040p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final a5.a f2041q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public java.lang.String f2042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f2043s;

    public g(int r1, c7.g r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f2039o = r1
            r0.f2040p = r3
            a5.a r1 = new a5.a
            r2 = 1
            r1.<init>(r3, r2, r0)
            r0.f2041q = r1
            a5.a.b(r1)
            int r3 = r3 + 4
            r1 = 35719201(0x2210821, double:1.764763E-316)
            r0.Q(r3, r1)
            return
    }

    public static boolean i0(long r2) {
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L18
            r0 = -4294967296(0xffffffff00000000, double:NaN)
            long r2 = r2 & r0
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L16
            goto L18
        L16:
            r2 = 0
            return r2
        L18:
            r2 = 1
            return r2
    }

    @Override // d7.t
    public final int V(java.io.InputStream r9) {
            r8 = this;
            int r0 = r8.b0()
            int r1 = r8.f2040p
            int r2 = r8.f2039o
            r3 = 0
            r4 = 0
            if (r0 != 0) goto L12
            java.lang.String r0 = ""
            r8.f2042r = r0
            r0 = r4
            goto L30
        L12:
            int r5 = r2 + r0
            int r6 = r8.Z()
            int r6 = r6 + r5
            int r5 = r8.W()
            int r5 = r5 + r6
            r8.M(r5, r4)
            int r5 = r1 + 20
            r8.R(r5, r0)
            byte[] r5 = r8.f11553k
            int r5 = r9.read(r5, r2, r0)
            if (r5 != r0) goto L6e
            r8.f2042r = r3
        L30:
            int r5 = r8.Z()
            if (r5 != 0) goto L37
            goto L58
        L37:
            int r6 = r8.b0()
            int r6 = r6 + r2
            int r6 = r6 + r5
            int r7 = r8.W()
            int r7 = r7 + r6
            r8.M(r7, r4)
            int r1 = r1 + 22
            r8.R(r1, r5)
            byte[] r1 = r8.f11553k
            int r4 = r8.b0()
            int r4 = r4 + r2
            int r1 = r9.read(r1, r4, r5)
            if (r1 != r5) goto L61
            r4 = r5
        L58:
            int r0 = r0 + r4
            int r9 = r8.k0(r9)
            int r9 = r9 + r0
            r8.f2042r = r3
            return r9
        L61:
            java.lang.String r9 = "Stream ended before reading extra bytes: read="
            java.lang.String r0 = ", extra length="
            java.lang.String r9 = p.a.j(r1, r9, r0, r5)
            j8.o.y(r9)
            r9 = 0
            return r9
        L6e:
            java.lang.String r9 = "Stream ended before reading file name: read="
            java.lang.String r1 = ", name length="
            java.lang.String r9 = p.a.j(r5, r9, r1, r0)
            j8.o.y(r9)
            r9 = 0
            return r9
    }

    public int W() {
            r1 = this;
            r0 = 0
            return r0
    }

    public long X() {
            r2 = this;
            int r0 = r2.d0()
            long r0 = r2.N(r0)
            return r0
    }

    public long Y() {
            r2 = this;
            int r0 = r2.f2040p
            int r0 = r0 + 8
            long r0 = r2.N(r0)
            return r0
    }

    public final int Z() {
            r1 = this;
            int r0 = r1.f2040p
            int r0 = r0 + 22
            int r0 = r1.O(r0)
            return r0
    }

    public final java.lang.String a0() {
            r5 = this;
            java.lang.String r0 = r5.f2042r
            if (r0 != 0) goto L20
            int r0 = r5.b0()
            byte[] r1 = r5.f11553k
            int r2 = r1.length
            int r3 = r5.f2039o
            int r2 = r2 - r3
            if (r2 > 0) goto L13
            java.lang.String r0 = ""
            goto L1e
        L13:
            if (r0 <= r2) goto L16
            r0 = r2
        L16:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8
            r2.<init>(r1, r3, r0, r4)
            r0 = r2
        L1e:
            r5.f2042r = r0
        L20:
            java.lang.String r0 = r5.f2042r
            return r0
    }

    public final int b0() {
            r1 = this;
            int r0 = r1.f2040p
            int r0 = r0 + 20
            int r0 = r1.O(r0)
            return r0
    }

    public final int c0() {
            r1 = this;
            int r0 = r1.f2040p
            int r0 = r0 + 2
            int r0 = r1.O(r0)
            return r0
    }

    public final int d0() {
            r1 = this;
            int r0 = r1.f2040p
            int r0 = r0 + 12
            return r0
    }

    public long e0() {
            r2 = this;
            int r0 = r2.f2040p
            int r0 = r0 + 16
            long r0 = r2.N(r0)
            return r0
    }

    public int f0() {
            r1 = this;
            r0 = 20
            return r0
    }

    public final boolean g0() {
            r2 = this;
            boolean r0 = r2.h0()
            if (r0 == 0) goto L12
            int r0 = r2.Z()
            int r1 = r2.f0()
            if (r0 < r1) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public boolean h0() {
            r3 = this;
            int r0 = r3.d0()
            byte[] r1 = r3.f11553k
            int r0 = k7.a.s(r1, r0)
            r1 = -1
            if (r0 != r1) goto Le
            goto L1a
        Le:
            int r0 = r3.d0()
            byte[] r2 = r3.f11553k
            int r0 = k7.a.s(r2, r0)
            if (r0 != r1) goto L1c
        L1a:
            r0 = 1
            return r0
        L1c:
            r0 = 0
            return r0
    }

    public void j0() {
            r1 = this;
            java.lang.String r0 = r1.f2042r
            if (r0 == 0) goto L7
            r1.m0(r0)
        L7:
            return
    }

    public int k0(java.io.InputStream r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void l0(long r2) {
            r1 = this;
            int r0 = r1.f2040p
            int r0 = r0 + 8
            r1.Q(r0, r2)
            return
    }

    public final void m0(java.lang.String r6) {
            r5 = this;
            if (r6 != 0) goto L4
            java.lang.String r6 = ""
        L4:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r6.getBytes(r0)
            a5.a r1 = r5.f2041q
            a5.a.b(r1)
            int r1 = r0.length
            int r2 = r5.f2039o
            int r3 = r2 + r1
            int r4 = r5.Z()
            int r4 = r4 + r3
            int r3 = r5.W()
            int r3 = r3 + r4
            r4 = 0
            r5.M(r3, r4)
            int r3 = r5.f2040p
            int r3 = r3 + 20
            r5.R(r3, r1)
            if (r1 != 0) goto L2e
            r5.f2042r = r6
            return
        L2e:
            byte[] r3 = r5.f11553k
            java.lang.System.arraycopy(r0, r4, r3, r2, r1)
            r5.f2042r = r6
            return
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.p()
            int r1 = r4.f2071n
            if (r0 >= r1) goto Lb
            java.lang.String r0 = "Invalid"
            return r0
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            long r1 = r4.f2043s
            r0.append(r1)
            java.lang.String r1 = "] "
            r0.append(r1)
            java.lang.String r1 = r4.a0()
            int r2 = r1.length()
            if (r2 <= 0) goto L33
            java.lang.String r2 = "name="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
        L33:
            java.lang.String r1 = "SIG="
            r0.append(r1)
            c7.g r1 = r4.T()
            r0.append(r1)
            java.lang.String r1 = ", versionMadeBy="
            r0.append(r1)
            r1 = 4
            int r2 = r4.O(r1)
            short r2 = (short) r2
            java.lang.String r2 = y7.a.o(r2)
            r0.append(r2)
            java.lang.String r2 = ", platform="
            r0.append(r2)
            r2 = 5
            byte[] r3 = r4.f11553k
            r2 = r3[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            java.lang.String r2 = y7.a.n(r2)
            r0.append(r2)
            java.lang.String r2 = ", GP={"
            r0.append(r2)
            a5.a r2 = r4.f2041q
            r0.append(r2)
            java.lang.String r2 = "}, method="
            r0.append(r2)
            int r2 = r4.c0()
            r0.append(r2)
            java.lang.String r2 = ", date="
            r0.append(r2)
            int r2 = r4.f2040p
            int r2 = r2 + r1
            long r1 = r4.N(r2)
            r3 = 1
            java.lang.String r1 = y7.a.l(r3, r1)
            r0.append(r1)
            java.lang.String r1 = ", crc="
            r0.append(r1)
            long r1 = r4.Y()
            r3 = 8
            java.lang.String r1 = y7.a.l(r3, r1)
            r0.append(r1)
            java.lang.String r1 = ", cSize="
            r0.append(r1)
            long r1 = r4.X()
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            long r1 = r4.e0()
            r0.append(r1)
            java.lang.String r1 = ", fileNameLength="
            r0.append(r1)
            int r1 = r4.b0()
            r0.append(r1)
            java.lang.String r1 = ", extraLength="
            r0.append(r1)
            int r1 = r4.Z()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
