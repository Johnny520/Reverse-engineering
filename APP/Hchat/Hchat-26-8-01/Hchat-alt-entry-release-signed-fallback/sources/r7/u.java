package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends o7.e implements java.lang.Comparable, java.lang.Iterable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final okio.a f11586q = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o7.b f11587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r7.f f11588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r7.t f11589o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r7.s f11590p;

    static {
            okio.a r0 = new okio.a
            r1 = 13
            r0.<init>(r1)
            r7.u.f11586q = r0
            return
    }

    public u() {
            r3 = this;
            r0 = 2
            r3.<init>(r0)
            o7.b r0 = new o7.b
            r1 = 0
            r0.<init>(r1)
            r3.f11587m = r0
            r7.f r1 = new r7.f
            r2 = 0
            r1.<init>(r2)
            r3.f11588n = r1
            r3.P(r2, r0)
            r0 = 1
            r3.P(r0, r1)
            r0 = -1
            r1.k(r0)
            return
    }

    @Override // k7.c, k7.a
    public final void B(q7.b r4) {
            r3 = this;
        L0:
            int r0 = r4.f10666k
            r1 = 4
            byte[] r2 = new byte[r1]
            r4.e(r2, r1)
            r4.g(r0)
            r0 = 0
            r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            r1 = 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            r1 = 3
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 24
            r0 = r0 | r1
            r1 = -1
            if (r0 == r1) goto L39
            r7.w r0 = new r7.w
            r0.<init>()
            o7.b r1 = r3.f11587m
            r1.M(r0)
            r0.B(r4)
            goto L0
        L39:
            r7.f r0 = r3.f11588n
            r0.B(r4)
            return
    }

    @Override // k7.a
    public final void I(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            r0.R()
            return
    }

    public final java.lang.String Q(java.lang.String r8, boolean r9) {
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            androidx.lifecycle.x[] r1 = androidx.lifecycle.x.k(r8, r7)     // Catch: java.io.IOException -> L30
            b8.e r2 = new b8.e     // Catch: java.io.IOException -> L30
            r2.<init>()     // Catch: java.io.IOException -> L30
            b5.c r3 = new b5.c     // Catch: java.io.IOException -> L30
            r3.<init>()     // Catch: java.io.IOException -> L30
            r3.f469a = r2     // Catch: java.io.IOException -> L30
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.io.IOException -> L30
            r4.<init>()     // Catch: java.io.IOException -> L30
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.io.IOException -> L30
            r4.<init>()     // Catch: java.io.IOException -> L30
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.io.IOException -> L30
            r4.<init>()     // Catch: java.io.IOException -> L30
            int r4 = r1.length     // Catch: java.io.IOException -> L30
            r5 = 0
        L25:
            if (r5 >= r4) goto L2f
            r6 = r1[r5]     // Catch: java.io.IOException -> L30
            r6.V(r3)     // Catch: java.io.IOException -> L30
            int r5 = r5 + 1
            goto L25
        L2f:
            r0 = r2
        L30:
            if (r0 != 0) goto L33
            return r8
        L33:
            java.lang.String r8 = r0.i(r9)
            return r8
    }

    public final void R() {
            r3 = this;
            r7.s r0 = r3.f11590p
            if (r0 == 0) goto L18
            r7.u r1 = r0.f11583q
            if (r1 != 0) goto L9
            goto L18
        L9:
            if (r3 != r1) goto L12
            r1 = 0
            r0.f11583q = r1
            r3.S(r1)
            goto L18
        L12:
            java.lang.String r0 = "Wrong style item"
            j8.o.A(r0)
            return
        L18:
            k7.a r0 = r3.f7389h
            if (r0 != 0) goto L1d
            return
        L1d:
            java.util.Iterator r0 = r3.iterator()
        L21:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            r7.w r1 = (r7.w) r1
            r7.v r1 = r1.f11591m
            r7.s r2 = r1.a()
            if (r2 == 0) goto L38
            r2.a0(r1)
        L38:
            r2 = -1
            r1.k(r2)
            goto L21
        L3d:
            o7.b r0 = r3.f11587m
            r0.N()
            return
    }

    public final void S(r7.s r3) {
            r2 = this;
            r7.s r0 = r2.f11590p
            if (r3 != 0) goto L15
            r3 = 0
            r2.f11590p = r3
            r7.t r1 = r2.f11589o
            if (r1 != 0) goto Lc
            goto L19
        Lc:
            r2.f11589o = r3
            if (r0 != 0) goto L11
            goto L19
        L11:
            r0.a0(r1)
            return
        L15:
            if (r0 == 0) goto L20
            if (r3 != r0) goto L1a
        L19:
            return
        L1a:
            java.lang.String r3 = "Different string item"
            j8.o.A(r3)
            return
        L20:
            r2.f11590p = r3
            r7.t r0 = new r7.t
            r0.<init>(r2)
            r3.P(r0)
            r2.f11589o = r0
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r5) {
            r4 = this;
            r7.u r5 = (r7.u) r5
            r0 = 0
            if (r5 != r4) goto L6
            return r0
        L6:
            if (r5 != 0) goto La
            r5 = -1
            return r5
        La:
            r7.s r1 = r4.f11590p
            r7.s r5 = r5.f11590p
            r2 = 1
            if (r1 != 0) goto L13
            r3 = r2
            goto L14
        L13:
            r3 = r0
        L14:
            if (r5 != 0) goto L17
            r0 = r2
        L17:
            int r0 = y7.a.d(r3, r0)
            if (r0 != 0) goto L2b
            if (r1 == 0) goto L2b
            if (r5 != 0) goto L22
            goto L2b
        L22:
            int r0 = r1.f7388g
            int r5 = r5.f7388g
            int r5 = y7.a.e(r0, r5)
            return r5
        L2b:
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            o7.b r0 = r1.f11587m
            z7.c r0 = r0.f9563k
            java.util.Iterator r0 = r0.b()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Spans count = "
            r0.<init>(r1)
            o7.b r1 = r2.f11587m
            z7.c r1 = r1.f9563k
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
