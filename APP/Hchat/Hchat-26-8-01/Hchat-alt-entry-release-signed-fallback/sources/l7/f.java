package l7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class f extends l7.a implements l7.g, java.lang.Comparable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u7.d f7876o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final u7.b f7877p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o7.f f7878q;

    public f() {
            r5 = this;
            p7.f r0 = new p7.f
            r0.<init>()
            r1 = 3
            r5.<init>(r0, r1)
            u7.d r1 = new u7.d
            r7.f r0 = r0.f10285y
            r1.<init>(r0)
            r5.f7876o = r1
            u7.b r0 = new u7.b
            okio.a r2 = new okio.a
            r3 = 17
            r2.<init>(r3)
            r3 = 0
            r4 = 1
            r0.<init>(r4, r4, r2, r3)
            r5.f7877p = r0
            o7.f r2 = new o7.f
            r2.<init>()
            r5.f7878q = r2
            r5.P(r1)
            r5.P(r0)
            r5.P(r2)
            return
    }

    @Override // k7.c
    public final void M() {
            r6 = this;
            o7.f r0 = r6.f7878q
            j7.d r0 = r0.f9571m
            z7.c r1 = r0.f9563k
            java.util.Iterator r1 = r1.b()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            o7.j r2 = (o7.j) r2
            j7.e r3 = r2.f9586m
            ce.n r4 = new ce.n
            r5 = 8
            r4.<init>(r5)
            r3.removeIf(r4)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto La
            r0.a0(r2)
            goto La
        L2c:
            return
    }

    @Override // l7.a
    public final void R() {
            r0 = this;
            return
    }

    @Override // l7.a
    public final void S() {
            r4 = this;
            f6.b r0 = new f6.b
            u7.d r1 = r4.f7876o
            r0.<init>(r1)
            r4.z(r0)
            int r0 = r0.f3307c
            p7.a r2 = r4.f7869m
            p7.f r2 = (p7.f) r2
            r7.f r3 = r2.f10280t
            r3.k(r0)
            r7.f r0 = r2.f10281u
            int r1 = r1.size()
            r0.k(r1)
            f6.b r0 = new f6.b
            u7.b r1 = r4.f7877p
            r0.<init>(r1)
            r4.z(r0)
            int r0 = r0.f3307c
            r7.f r3 = r2.f10282v
            r3.k(r0)
            r7.f r0 = r2.f10283w
            int r1 = r1.size()
            r0.k(r1)
            return
    }

    public int U() {
            r1 = this;
            p7.a r0 = r1.f7869m
            p7.f r0 = (p7.f) r0
            r7.f r0 = r0.f10278r
            int r0 = r0.f11560n
            return r0
    }

    public java.lang.String V() {
            r1 = this;
            p7.a r0 = r1.f7869m
            p7.f r0 = (p7.f) r0
            r7.d r0 = r0.f10279s
            java.lang.String r0 = r0.f11578m
            return r0
    }

    public final t7.b W(int r5) {
            r4 = this;
            int r0 = r5 >> 24
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r4.U()
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r2) goto L1e
            int r0 = r5 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r5 & r3
            t7.b r0 = r4.X(r0, r2)
            if (r0 == 0) goto L1e
            return r0
        L1e:
            v7.f0 r0 = r4.a0(r5)
            if (r0 != 0) goto L25
            return r1
        L25:
            r2 = 4
            int r0 = r0.O(r2)
            if (r0 == 0) goto L44
            if (r0 != r5) goto L2f
            goto L44
        L2f:
            int r5 = r0 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r4.U()
            if (r5 == r2) goto L3a
            return r1
        L3a:
            int r5 = r0 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            r0 = r0 & r3
            t7.b r5 = r4.X(r5, r0)
            return r5
        L44:
            return r1
    }

    public final t7.b X(int r5, int r6) {
            r4 = this;
            o7.f r0 = r4.f7878q
            j7.d r0 = r0.f9571m
            byte r5 = (byte) r5
            o7.j r5 = r0.k0(r5)
            r0 = 0
            if (r5 != 0) goto Ld
            goto L3a
        Ld:
            short r6 = (short) r6
            j7.e r5 = r5.f9586m
            z7.c r5 = r5.f9563k
            java.util.Iterator r5 = r5.iterator()
            r1 = r0
        L17:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r5.next()
            l7.m r2 = (l7.m) r2
            s7.b r2 = r2.f7890o
            v7.d r2 = r2.m0(r6)
            if (r2 != 0) goto L2c
            goto L17
        L2c:
            boolean r3 = r2.y()
            if (r3 != 0) goto L34
            r1 = r2
            goto L38
        L34:
            if (r1 != 0) goto L17
            r1 = r2
            goto L17
        L38:
            if (r1 != 0) goto L3b
        L3a:
            return r0
        L3b:
            t7.b r5 = new t7.b
            int r6 = r1.M()
            r5.<init>(r4, r6)
            return r5
    }

    public l7.l Y() {
            r2 = this;
            k7.a r0 = r2.f7389h
        L2:
            if (r0 == 0) goto Le
            boolean r1 = r0 instanceof l7.l
            if (r1 == 0) goto Lb
            l7.l r0 = (l7.l) r0
            return r0
        Lb:
            k7.a r0 = r0.f7389h
            goto L2
        Le:
            r0 = 0
            return r0
    }

    public final void Z(u7.b r8) {
            r7 = this;
            o7.f r0 = r7.f7878q
            j7.d r0 = r0.f9571m
            z7.c r0 = r0.f9563k
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L60
            java.lang.Object r1 = r0.next()
            o7.j r1 = (o7.j) r1
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto La
            java.lang.Object r2 = r1.next()
            l7.m r2 = (l7.m) r2
            s7.b r2 = r2.f7890o
            r3 = 1
            java.util.Iterator r2 = r2.n0(r3)
        L2d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1a
            java.lang.Object r3 = r2.next()
            v7.d r3 = (v7.d) r3
            v7.g0 r3 = r3.f14150k
            v7.i0 r3 = r3.f14153k
            int r4 = r3.N()
            r7.s r4 = r8.V(r4)
            r7.q r4 = (r7.q) r4
            if (r4 != 0) goto L4d
            r4 = 0
            r3.f14159m = r4
            goto L2d
        L4d:
            v7.h0 r5 = r3.f14159m
            if (r5 == 0) goto L54
            r4.a0(r5)
        L54:
            v7.h0 r5 = new v7.h0
            r6 = 0
            r5.<init>(r3, r6)
            r3.f14159m = r5
            r4.P(r5)
            goto L2d
        L60:
            return
    }

    public u7.c a() {
            r1 = this;
            u7.b r0 = r1.f7877p
            return r0
    }

    public final v7.f0 a0(int r6) {
            r5 = this;
            o7.f r0 = r5.f7878q
            d7.b r0 = r0.f9573o
            z7.c r0 = r0.f9563k
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L35
            java.lang.Object r1 = r0.next()
            l7.k r1 = (l7.k) r1
            j7.a r1 = r1.f7884o
            z7.c r1 = r1.f9563k
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r1.next()
            v7.f0 r3 = (v7.f0) r3
            r4 = 0
            int r4 = r3.O(r4)
            if (r6 != r4) goto L1f
            r2 = r3
        L33:
            if (r2 == 0) goto La
        L35:
            return r2
    }

    public int compareTo(java.lang.Object r2) {
            r1 = this;
            l7.f r2 = (l7.f) r2
            int r0 = r1.U()
            int r2 = r2.U()
            int r2 = java.lang.Integer.compare(r0, r2)
            return r2
    }

    @Override // l7.g
    public final l7.f i() {
            r0 = this;
            return r0
    }

    public boolean isEmpty() {
            r4 = this;
            int r0 = r4.U()
            if (r0 != 0) goto L4d
            o7.f r0 = r4.f7878q
            j7.d r1 = r0.f9571m
            r2 = 1
            java.util.Iterator r1 = r1.j0(r2)
        Lf:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L22
            java.lang.Object r3 = r1.next()
            o7.j r3 = (o7.j) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto Lf
            goto L4d
        L22:
            l7.c r1 = r0.f9572n
            java.util.Iterator r1 = r1.iterator()
            boolean r1 = r1.hasNext()
            if (r1 != 0) goto L4d
            d7.b r1 = r0.f9573o
            z7.c r1 = r1.f9563k
            int r1 = r1.size()
            if (r1 != 0) goto L4d
            s7.e r1 = r0.f9574p
            z7.c r1 = r1.f9563k
            int r1 = r1.size()
            if (r1 != 0) goto L4d
            o7.b r0 = r0.f9576r
            z7.c r0 = r0.f9563k
            int r0 = r0.size()
            if (r0 != 0) goto L4d
            return r2
        L4d:
            r0 = 0
            return r0
    }

    @Override // l7.a
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = ", id="
            r0.append(r1)
            int r1 = r3.U()
            byte r1 = (byte) r1
            java.lang.String r1 = y7.a.n(r1)
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.V()
            r0.append(r1)
            o7.f r1 = r3.f7878q
            l7.c r1 = r1.f9572n
            o7.b r1 = r1.f7873p
            j7.a r1 = (j7.a) r1
            z7.c r1 = r1.f9563k
            int r1 = r1.size()
            if (r1 <= 0) goto L41
            java.lang.String r2 = ", libraries="
            r0.append(r2)
            r0.append(r1)
        L41:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
