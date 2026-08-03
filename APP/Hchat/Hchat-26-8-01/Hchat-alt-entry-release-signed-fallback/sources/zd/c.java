package zd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends yd.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nd.t f22666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f22667n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ud.a f22668o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ud.a f22669p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public xd.b f22670q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g4.a f22671r;

    public c(xd.b r1, nd.t r2, ud.a r3, boolean r4) {
            r0 = this;
            r0.<init>(r1)
            r0.f22666m = r2
            r0.f22668o = r3
            r0.f22667n = r4
            if (r3 == 0) goto L28
            ud.p r1 = a.a.c0(r3)
            if (r1 != 0) goto L13
            r1 = 0
            goto L20
        L13:
            pd.i r1 = (pd.i) r1
            yd.b r2 = new yd.b
            xe.e r4 = new xe.e
            r4.<init>(r1)
            r2.<init>(r4)
            r1 = r2
        L20:
            r0.f22417k = r1
            java.util.List r1 = java.util.Collections.singletonList(r3)
            r0.f22418l = r1
        L28:
            return
    }

    @Override // ud.j
    public final void b(fd.i r11, fc.f r12) {
            r10 = this;
            fd.g r0 = r11.f3907a
            ud.r r1 = r11.f3908b
            ud.a r2 = r10.f22668o
            ud.p r3 = a.a.c0(r2)
            r4 = 0
            if (r3 != 0) goto Lf
            r3 = r4
            goto L11
        Lf:
            int r3 = r3.f9389i
        L11:
            if (r3 == 0) goto L14
            goto L18
        L14:
            int r3 = r10.H()
        L18:
            r12.s(r3)
            nd.t r3 = r10.f22666m
            ud.a r3 = r3.f9392a
            md.b r5 = md.b.G
            md.f r3 = r3.f8877g
            oc.b r3 = r3.c(r5)
            nd.u r3 = (nd.u) r3
            if (r3 == 0) goto L4a
            fd.h r5 = r0.f3917d
            r5.getClass()
            nd.t r3 = r3.f9397g
            int r3 = r3.f9395d
            java.lang.String r6 = "loop"
            java.lang.String r3 = eh.a.l(r3, r6)
            java.lang.Object r5 = r5.f3919h
            java.util.HashSet r5 = (java.util.HashSet) r5
            r5.add(r3)
            fc.f r3 = r12.e(r3)
            java.lang.String r5 = ": "
            r3.e(r5)
        L4a:
            yd.b r3 = r10.f22417k
            if (r3 != 0) goto L5c
            java.lang.String r0 = "while (true) {"
            r12.e(r0)
            xd.b r0 = r10.f22670q
            r11.v(r12, r0)
            r12.q()
            return
        L5c:
            ud.p r5 = r3.I()
            ic.a.a(r12, r5)
            fd.c r6 = new fd.c
            boolean r7 = r11.f3910d
            r6.<init>(r0, r7)
            g4.a r0 = r10.f22671r
            java.lang.String r7 = ") {"
            if (r0 == 0) goto L100
            boolean r2 = r0 instanceof zd.b
            java.lang.String r8 = "for ("
            if (r2 == 0) goto La8
            zd.b r0 = (zd.b) r0
            r12.e(r8)
            ud.p r2 = r0.f22664a
            fd.d r4 = fd.d.f3902i
            r11.j(r2, r12, r4)
            java.lang.String r2 = "; "
            r12.e(r2)
            androidx.lifecycle.x r8 = new androidx.lifecycle.x
            r9 = 12
            r8.<init>(r9)
            r6.r(r12, r8, r3)
            r12.e(r2)
            ud.p r0 = r0.f22665b
            r11.j(r0, r12, r4)
            r12.e(r7)
            jd.c.a(r12, r1, r5)
            xd.b r0 = r10.f22670q
            r11.v(r12, r0)
            r12.q()
            return
        La8:
            boolean r2 = r0 instanceof zd.a
            if (r2 == 0) goto Lee
            zd.a r0 = (zd.a) r0
            r12.e(r8)
            ud.p r2 = r0.f22662a
            qd.r r2 = r2.f13714l
            qd.s r2 = r2.f10923m
            qd.k r2 = r2.b()
            boolean r3 = r2.f10897d
            if (r3 == 0) goto Lc4
            java.lang.String r3 = "final "
            r12.e(r3)
        Lc4:
            qd.j r3 = r2.f10895b
            r11.q(r12, r3)
            r3 = 32
            r12.d(r3)
            r11.d(r12, r2)
            java.lang.String r2 = " : "
            r12.e(r2)
            ud.p r0 = r0.f22663b
            qd.l r0 = r0.S(r4)
            r11.b(r12, r0, r4)
            r12.e(r7)
            jd.c.a(r12, r1, r5)
            xd.b r0 = r10.f22670q
            r11.v(r12, r0)
            r12.q()
            return
        Lee:
            java.lang.Class r11 = r0.getClass()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r12 = "Unknown loop type: "
            java.lang.String r11 = r12.concat(r11)
            ah.a.k(r11)
            return
        L100:
            boolean r0 = r10.f22667n
            if (r0 == 0) goto L139
            java.lang.String r0 = "do {"
            r12.e(r0)
            jd.c.a(r12, r1, r5)
            xd.b r0 = r10.f22670q
            r11.v(r12, r0)
            ud.p r11 = a.a.c0(r2)
            if (r11 != 0) goto L118
            goto L11a
        L118:
            int r4 = r11.f9389i
        L11a:
            if (r4 == 0) goto L11d
            goto L121
        L11d:
            int r4 = r10.H()
        L121:
            r12.s(r4)
            java.lang.String r11 = "} while ("
            r12.e(r11)
            androidx.lifecycle.x r11 = new androidx.lifecycle.x
            r0 = 12
            r11.<init>(r0)
            r6.r(r12, r11, r3)
            java.lang.String r11 = ");"
            r12.e(r11)
            return
        L139:
            java.lang.String r0 = "while ("
            r12.e(r0)
            androidx.lifecycle.x r0 = new androidx.lifecycle.x
            r2 = 12
            r0.<init>(r2)
            r6.r(r12, r0, r3)
            r12.e(r7)
            jd.c.a(r12, r1, r5)
            xd.b r0 = r10.f22670q
            r11.v(r12, r0)
            r12.q()
            return
    }

    @Override // ud.j
    public final java.lang.String k() {
            r1 = this;
            xd.b r0 = r1.f22670q
            if (r0 != 0) goto L7
            java.lang.String r0 = "-"
            return r0
        L7:
            java.lang.String r0 = r0.k()
            return r0
    }

    @Override // xd.a, ud.n
    public final boolean l(ud.j r1, ud.j r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            nd.t r0 = r4.f22666m
            int r0 = r0.f9395d
            java.lang.String r1 = r4.k()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "LOOP:"
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ": "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // ud.n
    public final java.util.List u() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r2.f22418l
            int r1 = r1.size()
            int r1 = r1 + 2
            r0.<init>(r1)
            ud.a r1 = r2.f22669p
            if (r1 == 0) goto L14
            r0.add(r1)
        L14:
            java.util.List r1 = r2.f22418l
            r0.addAll(r1)
            xd.b r1 = r2.f22670q
            if (r1 == 0) goto L20
            r0.add(r1)
        L20:
            return r0
    }
}
