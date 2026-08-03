package xd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends xd.a implements ud.i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final uf.d f21542m = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ud.a f21543k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f21544l;

    static {
            uf.d r0 = new uf.d
            r1 = 7
            r0.<init>(r1)
            xd.d.f21542m = r0
            return
    }

    public d(ud.n r1, ud.a r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f21543k = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f21544l = r1
            return
    }

    @Override // ud.j
    public final void b(fd.i r13, fc.f r14) {
            r12 = this;
            ud.a r0 = r12.f21543k
            ud.p r0 = a.a.c0(r0)
            pd.s r0 = (pd.s) r0
            java.lang.String r1 = "Switch insn not found in header"
            java.util.Objects.requireNonNull(r0, r1)
            r1 = 0
            qd.l r2 = r0.S(r1)
            java.lang.String r3 = "switch ("
            r14.r(r3)
            r13.b(r14, r2, r1)
            java.lang.String r1 = ") {"
            r14.e(r1)
            ic.a.a(r14, r0)
            ud.r r1 = r13.f3908b
            jd.c.a(r14, r1, r0)
            r14.o()
            java.util.ArrayList r0 = r12.f21544l
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lca
            java.lang.Object r3 = r0.next()
            xd.c r3 = (xd.c) r3
            java.util.List r4 = r3.f21540a
            ud.j r3 = r3.f21541b
            java.util.Iterator r4 = r4.iterator()
        L44:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lc5
            java.lang.Object r5 = r4.next()
            uf.d r6 = xd.d.f21542m
            if (r5 != r6) goto L58
            java.lang.String r5 = "default:"
            r14.r(r5)
            goto L44
        L58:
            java.lang.String r6 = "case "
            r14.r(r6)
            boolean r6 = r5 instanceof ud.g
            if (r6 == 0) goto L69
            ud.g r5 = (ud.g) r5
            od.c r6 = r5.f13707l
            r13.w(r14, r6, r5)
            goto La9
        L69:
            boolean r6 = r5 instanceof od.c
            r7 = 0
            if (r6 == 0) goto L74
            od.c r5 = (od.c) r5
            r13.w(r14, r5, r7)
            goto La9
        L74:
            boolean r6 = r5 instanceof java.lang.Integer
            if (r6 == 0) goto L96
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            long r6 = (long) r5
            qd.j r8 = r2.I()
            boolean r10 = r13.f3910d
            mh.b r5 = fd.j.f3921a
            ud.u r5 = r1.n()
            xe.q r9 = r5.f13744c
            r11 = 0
            java.lang.String r5 = fd.j.a(r6, r8, r9, r10, r11)
            r14.e(r5)
            goto La9
        L96:
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto Laf
            r6 = 34
            fc.f r7 = r14.d(r6)
            java.lang.String r5 = (java.lang.String) r5
            fc.f r5 = r7.e(r5)
            r5.d(r6)
        La9:
            r5 = 58
            r14.d(r5)
            goto L44
        Laf:
            af.g r13 = new af.g
            if (r5 == 0) goto Lb7
            java.lang.Class r7 = r5.getClass()
        Lb7:
            java.lang.String r14 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "Unexpected key in switch: "
            java.lang.String r14 = r0.concat(r14)
            r13.<init>(r14)
            throw r13
        Lc5:
            r13.v(r14, r3)
            goto L30
        Lca:
            r14.n()
            r14.q()
            return
    }

    @Override // xd.a, ud.i
    public final java.util.List i() {
            r2 = this;
            me.a r0 = new me.a
            r1 = 24
            r0.<init>(r1)
            java.util.ArrayList r1 = r2.f21544l
            java.util.List r0 = xe.s.c(r1, r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    @Override // ud.j
    public final java.lang.String k() {
            r2 = this;
            ud.a r0 = r2.f21543k
            int r0 = r0.f13671i
            java.lang.String r0 = java.lang.Integer.toString(r0)
            java.lang.String r1 = "SW:"
            java.lang.String r0 = wb.en.g(r1, r0)
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Switch: "
            r0.<init>(r1)
            ud.a r1 = r6.f21543k
            int r1 = r1.f13671i
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.append(r1)
            java.util.ArrayList r1 = r6.f21544l
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r1.next()
            xd.c r2 = (xd.c) r2
            java.util.List r3 = r2.f21540a
            me.a r4 = new me.a
            r5 = 25
            r4.<init>(r5)
            java.util.List r3 = xe.s.c(r3, r4)
            java.lang.String r4 = "\n case "
            r0.append(r4)
            java.lang.String r4 = ", "
            java.lang.String r3 = xe.s.j(r3, r4)
            r0.append(r3)
            java.lang.String r3 = " -> "
            r0.append(r3)
            ud.j r2 = r2.f21541b
            r0.append(r2)
            goto L18
        L4a:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // ud.n
    public final java.util.List u() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList r1 = r4.f21544l
            int r2 = r1.size()
            int r2 = r2 + 1
            r0.<init>(r2)
            ud.a r2 = r4.f21543k
            r0.add(r2)
            me.a r2 = new me.a
            r3 = 24
            r2.<init>(r3)
            java.util.List r1 = xe.s.c(r1, r2)
            r0.addAll(r1)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }
}
