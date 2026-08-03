package l7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class l extends l7.a implements l7.b, java.lang.Iterable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u7.b f7885o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j7.b f7886p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z7.c f7887q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a7.c f7888r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l7.e f7889s;

    public l() {
            r5 = this;
            p7.j r0 = new p7.j
            r0.<init>()
            r1 = 2
            r5.<init>(r0, r1)
            u7.b r1 = new u7.b
            okio.a r2 = new okio.a
            r3 = 18
            r2.<init>(r3)
            r3 = 1
            r4 = 1
            r1.<init>(r4, r4, r2, r3)
            r5.f7885o = r1
            j7.b r2 = new j7.b
            r7.f r0 = r0.f10297r
            r2.<init>(r0)
            r5.f7886p = r2
            z7.c r0 = new z7.c
            r3 = 0
            r0.<init>(r3)
            r5.f7887q = r0
            r5.P(r1)
            r5.P(r2)
            return
    }

    @Override // l7.a, k7.c, k7.a
    public final void B(q7.b r7) {
            r6 = this;
            int r0 = r7.available()
            r1 = 1
            if (r0 != 0) goto La
            r6.f7390i = r1
            return
        La:
            p7.a r0 = r6.f7869m
            p7.j r0 = (p7.j) r0
            r0.G(r7)
            int r2 = r0.Q()
            r3 = 3
            if (r2 != r3) goto L76
            p7.b r0 = p7.b.T(r7)
            j7.b r2 = r6.f7886p
            r2.N()
            r3 = 0
        L22:
            u7.b r4 = r6.f7885o
            if (r0 == 0) goto L59
            boolean r5 = r7.b()
            if (r5 == 0) goto L59
            int r0 = r0.Q()
            r5 = 2
            if (r0 != r5) goto L3a
            if (r3 != 0) goto L54
            r4.G(r7)
            r3 = r1
            goto L54
        L3a:
            r4 = 12
            if (r0 != r4) goto L48
            k7.a r0 = r2.P()
            l7.f r0 = (l7.f) r0
            r0.G(r7)
            goto L54
        L48:
            l7.j r0 = new l7.j
            r4 = 1
            r0.<init>(r4)
            r0.G(r7)
            r6.P(r0)
        L54:
            p7.b r0 = p7.b.T(r7)
            goto L22
        L59:
            r7.close()
            r6.Y(r4)
            java.util.Iterator r7 = r6.iterator()
        L63:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r7.next()
            l7.f r0 = (l7.f) r0
            u7.b r1 = r0.f7877p
            r0.Z(r1)
            goto L63
        L75:
            return
        L76:
            java.lang.String r7 = "Not resource table: "
            j8.o.j(r0, r7)
            return
    }

    @Override // k7.c
    public final void M() {
            r2 = this;
            ce.n r0 = new ce.n
            r1 = 15
            r0.<init>(r1)
            j7.b r1 = r2.f7886p
            r1.removeIf(r0)
            return
    }

    @Override // l7.a
    public final void S() {
            r2 = this;
            j7.b r0 = r2.f7886p
            z7.c r0 = r0.f9563k
            int r0 = r0.size()
            p7.a r1 = r2.f7869m
            p7.j r1 = (p7.j) r1
            r7.f r1 = r1.f10297r
            r1.k(r0)
            return
    }

    public final boolean U(l7.l r10) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L5
            goto L84
        L5:
            j7.b r1 = r10.f7886p
            if (r10 != r9) goto Lb
            goto L85
        Lb:
            j7.b r2 = r9.f7886p
            z7.c r3 = r2.f9563k
            int r3 = r3.size()
            z7.c r4 = r1.f9563k
            int r4 = r4.size()
            if (r3 == r4) goto L1c
            goto L6b
        L1c:
            r4 = r0
        L1d:
            if (r4 >= r3) goto L85
            k7.a r5 = r2.Q(r4)
            l7.f r5 = (l7.f) r5
            k7.a r6 = r1.Q(r4)
            l7.f r6 = (l7.f) r6
            r5.getClass()
            if (r6 != r5) goto L31
            goto L68
        L31:
            if (r6 == 0) goto L6b
            int r7 = r5.U()
            int r8 = r6.U()
            if (r7 != r8) goto L6b
            java.lang.String r7 = r5.V()
            java.lang.String r8 = r6.V()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L4c
            goto L6b
        L4c:
            u7.d r7 = r5.f7876o
            int r7 = r7.size()
            u7.d r8 = r6.f7876o
            int r8 = r8.size()
            if (r7 != r8) goto L6b
            u7.b r5 = r5.f7877p
            int r5 = r5.size()
            u7.b r6 = r6.f7877p
            int r6 = r6.size()
            if (r5 != r6) goto L6b
        L68:
            int r4 = r4 + 1
            goto L1d
        L6b:
            z7.c r1 = r9.f7887q
            java.util.Iterator r1 = r1.iterator()
        L71:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            l7.l r2 = (l7.l) r2
            boolean r2 = r2.U(r10)
            if (r2 == 0) goto L71
            goto L85
        L84:
            return r0
        L85:
            r10 = 1
            return r10
    }

    public final z7.f V(l7.f r5) {
            r4 = this;
            z7.f r0 = new z7.f
            java.util.Iterator r5 = r4.W(r5)
            l7.d r1 = new l7.d
            z7.c r2 = r4.f7887q
            int r3 = r2.f22586i
            if (r3 != 0) goto L11
            z7.h r2 = z7.h.f22606g
            goto L15
        L11:
            java.util.Iterator r2 = r2.iterator()
        L15:
            r3 = 2
            r1.<init>(r2, r3)
            r0.<init>(r5, r1)
            return r0
    }

    public final java.util.Iterator W(l7.f r5) {
            r4 = this;
            if (r5 != 0) goto L3
            r5 = 0
        L3:
            java.util.Iterator r0 = r4.iterator()
            if (r5 != 0) goto La
            return r0
        La:
            z7.f r1 = new z7.f
            java.util.Iterator r2 = z7.q.a(r5)
            z7.j r3 = new z7.j
            r3.<init>(r0, r5)
            r1.<init>(r2, r3)
            return r1
    }

    public final t7.b X(l7.f r3, int r4) {
            r2 = this;
            if (r4 != 0) goto L3
            goto L3a
        L3:
            z7.f r0 = r2.V(r3)
        L7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            l7.f r1 = (l7.f) r1
            t7.b r1 = r1.W(r4)
            if (r1 == 0) goto L7
            return r1
        L1a:
            int r0 = r2.a0(r4)
            if (r0 == 0) goto L3a
            if (r0 != r4) goto L23
            goto L3a
        L23:
            z7.f r3 = r2.V(r3)
        L27:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r3.next()
            l7.f r4 = (l7.f) r4
            t7.b r4 = r4.W(r0)
            if (r4 == 0) goto L27
            return r4
        L3a:
            r3 = 0
            return r3
    }

    public final void Y(u7.b r6) {
            r5 = this;
            java.util.Iterator r0 = r5.iterator()
        L4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            l7.f r1 = (l7.f) r1
            o7.f r1 = r1.f7878q
            j7.d r1 = r1.f9571m
            z7.c r1 = r1.f9563k
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4
            java.lang.Object r2 = r1.next()
            o7.j r2 = (o7.j) r2
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1a
            java.lang.Object r3 = r2.next()
            l7.m r3 = (l7.m) r3
            s7.b r3 = r3.f7890o
            r4 = 1
            java.util.Iterator r3 = r3.n0(r4)
        L3d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2a
            java.lang.Object r4 = r3.next()
            v7.d r4 = (v7.d) r4
            v7.g0 r4 = r4.f14150k
            r4.L(r6)
            goto L3d
        L4f:
            return
    }

    public final l7.f Z() {
            r2 = this;
            j7.b r0 = r2.f7886p
            z7.c r0 = r0.f9563k
            r1 = 0
            l7.f r0 = j7.b.k0(r0, r1)
            return r0
    }

    public final int a0(int r4) {
            r3 = this;
            r0 = 0
            z7.f r1 = r3.V(r0)
        L5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L18
            java.lang.Object r2 = r1.next()
            l7.f r2 = (l7.f) r2
            v7.f0 r2 = r2.a0(r4)
            if (r2 == 0) goto L5
            r0 = r2
        L18:
            if (r0 == 0) goto L20
            r4 = 4
            int r4 = r0.O(r4)
            return r4
        L20:
            r4 = 0
            return r4
    }

    @Override // l7.b
    public final u7.c g() {
            r1 = this;
            u7.b r0 = r1.f7885o
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            j7.b r0 = r1.f7886p
            z7.c r0 = r0.f9563k
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    @Override // k7.c, k7.a
    public final byte[] r() {
            r2 = this;
            x7.b r0 = new x7.b
            p7.a r1 = r2.f7869m
            p7.j r1 = (p7.j) r1
            r7.f r1 = r1.f10270o
            int r1 = r1.f11560n
            r0.<init>(r1)
            r2.K(r0)     // Catch: java.io.IOException -> L13
            r0.close()     // Catch: java.io.IOException -> L13
        L13:
            byte[] r0 = r0.toByteArray()
            return r0
    }

    @Override // l7.a
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = ": packages = "
            r0.append(r1)
            j7.b r1 = r3.f7886p
            z7.c r1 = r1.f9563k
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ", size = "
            r0.append(r1)
            p7.a r1 = r3.f7869m
            p7.j r1 = (p7.j) r1
            r7.f r1 = r1.f10270o
            int r1 = r1.f11560n
            java.lang.String r2 = " bytes"
            java.lang.String r0 = j8.b.j(r0, r1, r2)
            return r0
    }
}
