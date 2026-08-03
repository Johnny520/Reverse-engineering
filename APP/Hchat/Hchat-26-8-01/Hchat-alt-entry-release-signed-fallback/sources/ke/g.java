package ke;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends r9.e0 implements ke.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ke.g f7595k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ke.g f7596l = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7597j;

    static {
            ke.g r0 = new ke.g
            r1 = 0
            r0.<init>(r1)
            ke.g.f7595k = r0
            ke.g r0 = new ke.g
            r1 = 1
            r0.<init>(r1)
            ke.g.f7596l = r0
            return
    }

    public /* synthetic */ g(int r1) {
            r0 = this;
            r0.f7597j = r1
            r0.<init>()
            return
    }

    public static boolean t0(ud.j r2) {
            r0 = r2
            md.e r0 = (md.e) r0
            md.f r0 = r0.f8877g
            md.a r1 = md.a.f8838s
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto Le
            goto L48
        Le:
            boolean r0 = r2 instanceof ud.a
            if (r0 == 0) goto L1b
            ud.a r2 = (ud.a) r2
            java.util.ArrayList r2 = r2.f13674l
            boolean r2 = r2.isEmpty()
            return r2
        L1b:
            boolean r0 = r2 instanceof zd.c
            if (r0 == 0) goto L27
            r0 = r2
            zd.c r0 = (zd.c) r0
            ud.a r0 = r0.f22668o
            if (r0 != 0) goto L27
            goto L4a
        L27:
            boolean r0 = r2 instanceof ud.n
            if (r0 == 0) goto L4a
            ud.n r2 = (ud.n) r2
            java.util.List r2 = r2.u()
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r2.next()
            ud.j r0 = (ud.j) r0
            boolean r0 = t0(r0)
            if (r0 != 0) goto L35
            goto L4a
        L48:
            r2 = 1
            return r2
        L4a:
            r2 = 0
            return r2
    }

    public static void u0(java.util.List r2, ud.a r3) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r2.next()
            ud.a r0 = (ud.a) r0
            if (r0 == r3) goto L4
            java.util.ArrayList r1 = r0.f13674l
            r1.clear()
            md.a r1 = md.a.f8840u
            r0.w(r1)
            goto L4
        L1d:
            return
    }

    public static boolean v0(ud.p r5) {
            pd.k r0 = r5.f13713k
            pd.k r1 = pd.k.R
            r2 = 1
            if (r0 != r1) goto L8
            return r2
        L8:
            r0 = 0
            r1 = r0
        La:
            java.util.List r3 = r5.f13715m
            int r3 = r3.size()
            if (r1 >= r3) goto L2b
            qd.l r3 = r5.S(r1)
            r3.getClass()
            boolean r4 = r3 instanceof qd.m
            if (r4 == 0) goto L28
            qd.m r3 = (qd.m) r3
            ud.p r3 = r3.f10904l
            boolean r3 = v0(r3)
            if (r3 == 0) goto L28
            return r2
        L28:
            int r1 = r1 + 1
            goto La
        L2b:
            return r0
    }

    public static ud.a w0(ud.j r2) {
            boolean r0 = r2 instanceof xd.b
            if (r0 == 0) goto L25
            xd.b r2 = (xd.b) r2
            java.util.ArrayList r2 = r2.f21539k
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L25
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            ud.j r2 = (ud.j) r2
            boolean r0 = r2 instanceof ud.a
            if (r0 == 0) goto L25
            ud.a r2 = (ud.a) r2
            java.util.ArrayList r0 = r2.f13674l
            int r0 = r0.size()
            if (r0 != r1) goto L25
            return r2
        L25:
            r2 = 0
            return r2
    }

    public static boolean x0(ud.r r14, ud.n r15) {
            boolean r0 = r15 instanceof yd.c
            r1 = 0
            if (r0 == 0) goto L21f
            yd.c r15 = (yd.c) r15
            md.a r0 = md.a.R
            md.f r2 = r15.f8877g
            boolean r0 = r2.a(r0)
            if (r0 == 0) goto L13
            goto L21f
        L13:
            ud.j r0 = r15.f22422m
            ud.j r2 = r15.f22423n
            if (r0 != 0) goto L1b
            goto L21f
        L1b:
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L10d
            ud.a r0 = w0(r0)
            if (r0 == 0) goto L21f
            java.util.ArrayList r2 = r0.f13674l
            java.lang.Object r2 = r2.get(r1)
            ud.p r2 = (ud.p) r2
            qd.r r6 = r2.f13714l
            if (r6 == 0) goto L21f
            qd.s r7 = r6.f10923m
            java.util.ArrayList r7 = r7.f10928j
            int r7 = r7.size()
            if (r7 == r5) goto L3e
            goto L21f
        L3e:
            qd.s r7 = r6.f10923m
            pd.q r7 = r7.f()
            if (r7 == 0) goto L21f
            java.util.List r8 = r7.f13715m
            int r9 = r8.size()
            if (r9 == r3) goto L50
            goto L21f
        L50:
            java.util.Iterator r3 = r8.iterator()
        L54:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L69
            java.lang.Object r8 = r3.next()
            qd.l r8 = (qd.l) r8
            boolean r9 = r6.h0(r8)
            if (r9 != 0) goto L54
            r4 = r8
            qd.r r4 = (qd.r) r4
        L69:
            if (r4 != 0) goto L6d
            goto L21f
        L6d:
            ud.p r3 = r4.f0()
            boolean r6 = r14.W()
            if (r6 != 0) goto La2
            ud.e r6 = r14.f13718l
            boolean r6 = r6.c0()
            if (r6 == 0) goto L88
            od.d r6 = r14.f13717k
            boolean r6 = r6.e()
            if (r6 == 0) goto L88
            goto La2
        L88:
            if (r3 == 0) goto L98
            boolean r6 = r3.W()
            if (r6 == 0) goto L98
            boolean r6 = y0(r14, r2, r3)
            if (r6 != 0) goto La2
            goto L21f
        L98:
            qd.r r6 = r2.f13714l
            boolean r6 = r6.g0(r4)
            if (r6 == 0) goto La2
            goto L21f
        La2:
            java.util.List r6 = r15.f22418l
            java.lang.Object r6 = r6.get(r1)
            ud.a r6 = (ud.a) r6
            ud.n r8 = r15.f21538i
            boolean r8 = r8.l(r15, r6)
            if (r8 != 0) goto Lb4
            goto L21f
        Lb4:
            if (r3 == 0) goto Ld6
            boolean r8 = r3.W()
            if (r8 == 0) goto Ld6
            qd.r r4 = r3.f13714l
            qd.s r4 = r4.f10923m
            java.util.ArrayList r8 = r4.f10928j
            int r8 = r8.size()
            if (r8 != r5) goto Ld1
            pd.q r4 = r4.f()
            if (r4 != r7) goto Ld1
            xe.l.d(r14, r3)
        Ld1:
            qd.l r3 = qd.l.a0(r3)
            goto Lda
        Ld6:
            qd.r r3 = r4.c0()
        Lda:
            qd.l r4 = qd.l.a0(r2)
            qd.r r5 = r7.f13714l
            qd.r r5 = r5.c0()
            td.b r8 = new td.b
            yd.b r9 = r15.f22417k
            r8.<init>(r9, r5, r4, r3)
            r8.i0()
            xe.l.h(r14, r7)
            xe.l.l(r14, r2)
            xe.k.b(r0, r2)
            java.util.ArrayList r0 = r6.f13674l
            r0.clear()
            r8.Z()
            java.util.ArrayList r0 = r6.f13674l
            r0.add(r8)
            java.util.List r15 = r15.f22418l
            u0(r15, r6)
            be.b.Y(r14)
            return r1
        L10d:
            ud.a r0 = w0(r0)
            ud.a r2 = w0(r2)
            if (r0 == 0) goto L21f
            if (r2 != 0) goto L11b
            goto L21f
        L11b:
            java.util.List r6 = r15.f22418l
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L125
            goto L21f
        L125:
            java.lang.Object r7 = r6.get(r1)
            ud.a r7 = (ud.a) r7
            java.util.ArrayList r8 = r0.f13674l
            java.lang.Object r8 = r8.get(r1)
            ud.p r8 = (ud.p) r8
            java.util.ArrayList r9 = r2.f13674l
            java.lang.Object r9 = r9.get(r1)
            ud.p r9 = (ud.p) r9
            boolean r10 = y0(r14, r8, r9)
            if (r10 != 0) goto L143
            goto L21f
        L143:
            qd.r r10 = r8.f13714l
            qd.r r11 = r9.f13714l
            if (r10 == 0) goto L1b5
            if (r11 == 0) goto L1b5
            qd.s r12 = r10.f10923m
            pd.q r12 = r12.f()
            qd.s r13 = r11.f10923m
            pd.q r13 = r13.f()
            if (r12 == 0) goto L21f
            if (r12 == r13) goto L15d
            goto L21f
        L15d:
            ud.n r13 = r15.f21538i
            boolean r13 = r13.l(r15, r7)
            if (r13 != 0) goto L167
            goto L21f
        L167:
            xe.k.b(r0, r8)
            xe.k.b(r2, r9)
            java.util.List r0 = r12.f13715m
            int r0 = r0.size()
            if (r0 != r3) goto L17b
            qd.r r10 = r12.f13714l
            xe.l.l(r14, r8)
            goto L17e
        L17b:
            r12.l0(r11)
        L17e:
            qd.l r0 = qd.l.a0(r8)
            qd.l r1 = qd.l.a0(r9)
            td.b r2 = new td.b
            yd.b r3 = r15.f22417k
            r2.<init>(r3, r10, r0, r1)
            int r0 = r8.f9389i
            int r1 = r9.f9389i
            int r0 = java.lang.Math.max(r0, r1)
            int r15 = r15.H()
            int r15 = java.lang.Math.max(r15, r0)
            r2.f9389i = r15
            r8.f13714l = r4
            xe.l.l(r14, r9)
            java.util.ArrayList r14 = r7.f13674l
            r14.clear()
            r2.Z()
            java.util.ArrayList r14 = r7.f13674l
            r14.add(r2)
            u0(r6, r7)
            return r5
        L1b5:
            boolean r14 = r14.Z()
            if (r14 != 0) goto L21f
            pd.k r14 = r8.f13713k
            pd.k r3 = pd.k.f10507p
            if (r14 != r3) goto L21f
            pd.k r14 = r9.f13713k
            if (r14 != r3) goto L21f
            qd.l r14 = r8.S(r1)
            qd.l r10 = r9.S(r1)
            r14.getClass()
            boolean r11 = r14 instanceof qd.n
            r10.getClass()
            boolean r12 = r10 instanceof qd.n
            if (r11 == r12) goto L1da
            goto L21f
        L1da:
            ud.n r11 = r15.f21538i
            boolean r11 = r11.l(r15, r7)
            if (r11 != 0) goto L1e3
            goto L21f
        L1e3:
            xe.k.b(r0, r8)
            xe.k.b(r2, r9)
            md.a r1 = md.a.f8833n
            r0.D(r1)
            r2.D(r1)
            td.b r0 = new td.b
            yd.b r15 = r15.f22417k
            r0.<init>(r15, r4, r14, r10)
            ud.p r15 = new ud.p
            r15.<init>(r3, r5)
            qd.l r0 = qd.l.a0(r0)
            qd.j r14 = r14.I()
            r0.W(r14)
            r15.I(r0)
            java.util.ArrayList r14 = r7.f13674l
            r14.clear()
            r15.Z()
            java.util.ArrayList r14 = r7.f13674l
            r14.add(r15)
            r7.w(r1)
            u0(r6, r7)
            return r5
        L21f:
            return r1
    }

    public static boolean y0(ud.r r3, ud.p r4, ud.p r5) {
            md.a r0 = md.a.f8816d0
            md.f r3 = r3.f8877g
            boolean r3 = r3.a(r0)
            r0 = 1
            if (r3 == 0) goto La7
            int r3 = r4.f9389i
            int r1 = r5.f9389i
            if (r3 == r1) goto La7
            if (r3 == 0) goto L98
            if (r1 == 0) goto L98
            qd.r r3 = r4.f13714l
            if (r3 == 0) goto La5
            qd.r r4 = r5.f13714l
            if (r4 != 0) goto L1f
            goto La5
        L1f:
            qd.s r3 = r3.f10923m
            pd.q r3 = r3.f()
            qd.r r4 = r5.f13714l
            qd.s r4 = r4.f10923m
            pd.q r4 = r4.f()
            if (r4 == 0) goto La5
            if (r3 == r4) goto L33
            goto La5
        L33:
            java.util.HashMap r4 = new java.util.HashMap
            java.util.List r5 = r3.f13715m
            int r5 = r5.size()
            r4.<init>(r5)
            java.util.List r3 = r3.f13715m
            java.util.Iterator r3 = r3.iterator()
        L44:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L76
            java.lang.Object r5 = r3.next()
            qd.l r5 = (qd.l) r5
            r5.getClass()
            boolean r1 = r5 instanceof qd.r
            if (r1 != 0) goto L58
            goto L44
        L58:
            qd.r r5 = (qd.r) r5
            ud.p r5 = r5.f0()
            if (r5 != 0) goto L61
            goto L44
        L61:
            int r5 = r5.f9389i
            if (r5 == 0) goto L44
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            ke.m r2 = new ke.m
            r2.<init>()
            r4.merge(r5, r1, r2)
            goto L44
        L76:
            java.util.Set r3 = r4.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L7e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La5
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r5 = 2
            if (r4 < r5) goto L7e
            goto La7
        L98:
            boolean r3 = v0(r4)
            if (r3 != 0) goto La5
            boolean r3 = v0(r5)
            if (r3 != 0) goto La5
            goto La7
        La5:
            r3 = 0
            return r3
        La7:
            return r0
    }

    @Override // r9.e0, ke.e
    public boolean a(ud.r r7, ud.n r8) {
            r6 = this;
            int r0 = r6.f7597j
            switch(r0) {
                case 1: goto L15b;
                case 2: goto L13a;
                case 3: goto L126;
                case 4: goto La;
                default: goto L5;
            }
        L5:
            boolean r7 = super.a(r7, r8)
            return r7
        La:
            boolean r0 = r8 instanceof yd.c
            r1 = 1
            if (r0 == 0) goto L125
            yd.c r8 = (yd.c) r8
            ud.j r0 = r8.f22423n
            boolean r0 = f8.i.n0(r0)
            r2 = 0
            if (r0 != 0) goto L1c
            goto Lf1
        L1c:
            ud.j r0 = r8.f22422m
            boolean r0 = f8.i.n0(r0)
            if (r0 != 0) goto L29
            ke.c.l(r8)
            goto Lf1
        L29:
            md.a r0 = md.a.f8816d0
            md.f r3 = r7.f8877g
            boolean r0 = r3.a(r0)
            if (r0 == 0) goto L4a
            ud.j r0 = r8.f22422m
            int r0 = f8.i.C(r0)
            ud.j r3 = r8.f22423n
            int r3 = f8.i.C(r3)
            if (r0 == 0) goto L4a
            if (r3 == 0) goto L4a
            if (r0 <= r3) goto Lf1
            ke.c.l(r8)
            goto Lf1
        L4a:
            yd.b r0 = r8.f22417k
            if (r0 != 0) goto L4f
            goto L63
        L4f:
            yd.b r0 = yd.b.O(r0)
            yd.b r3 = r8.f22417k
            if (r0 == r3) goto L63
            r8.f22417k = r0
            if (r0 == 0) goto L63
            int r0 = r0.f22419i
            r3 = 3
            if (r0 != r3) goto L63
            ke.c.l(r8)
        L63:
            ud.j r0 = r8.f22422m
            int r0 = f8.i.R(r0)
            ud.j r3 = r8.f22423n
            int r3 = f8.i.R(r3)
            ud.j r4 = r8.f22423n
            boolean r4 = ke.c.n(r7, r4)
            if (r4 == 0) goto Lb2
            ud.j r4 = r8.f22422m
            boolean r4 = ke.c.n(r7, r4)
            if (r4 == 0) goto L86
            if (r3 >= r0) goto L86
            ke.c.l(r8)
            goto Lf1
        L86:
            if (r3 != r1) goto Lb2
            boolean r4 = f8.i.M(r8)
            if (r4 == 0) goto La6
            boolean r5 = r7.Z()
            if (r5 == 0) goto La6
            ud.j r0 = r8.f22423n
            ud.p r0 = f8.i.E(r0)
            pd.k r3 = pd.k.f10509r
            boolean r0 = xe.m.j(r0, r3)
            if (r0 == 0) goto Lf1
            ke.c.l(r8)
            goto Lf1
        La6:
            r5 = 2
            if (r0 <= r5) goto Lb2
            if (r4 == 0) goto Lae
            r4 = 4
            if (r0 < r4) goto Lb2
        Lae:
            ke.c.l(r8)
            goto Lf1
        Lb2:
            ud.j r4 = r8.f22422m
            if (r4 != 0) goto Lb8
            r4 = r2
            goto Lbc
        Lb8:
            boolean r4 = f8.i.L(r4, r4)
        Lbc:
            ud.j r5 = r8.f22423n
            if (r5 != 0) goto Lc2
            r5 = r2
            goto Lc6
        Lc2:
            boolean r5 = f8.i.L(r5, r5)
        Lc6:
            if (r5 == 0) goto Ld0
            if (r4 == 0) goto Lcc
            if (r3 >= r0) goto Ld0
        Lcc:
            ke.c.l(r8)
            goto Lf1
        Ld0:
            ud.j r0 = r8.f22422m
            boolean r0 = ke.c.m(r0)
            if (r0 == 0) goto Le6
            ud.j r0 = r8.f22423n
            boolean r0 = ke.c.m(r0)
            if (r0 != 0) goto Le6
            if (r4 != 0) goto Le6
            ke.c.l(r8)
            goto Lf1
        Le6:
            ud.j r0 = r8.f22423n
            boolean r0 = f8.i.K(r0)
            if (r0 == 0) goto Lf1
            ke.c.l(r8)
        Lf1:
            ud.j r0 = r8.f22422m
            boolean r7 = ke.c.n(r7, r0)
            if (r7 == 0) goto Lfa
            goto L125
        Lfa:
            ud.j r7 = r8.f22423n
            boolean r8 = r7 instanceof xd.b
            if (r8 == 0) goto L125
            r8 = r7
            xd.b r8 = (xd.b) r8
            java.util.ArrayList r8 = r8.f21539k
            int r0 = r8.size()
            if (r0 != r1) goto L125
            java.lang.Object r0 = r8.get(r2)
            boolean r0 = r0 instanceof yd.c
            if (r0 == 0) goto L125
            java.lang.Object r8 = r8.get(r2)
            ud.j r8 = (ud.j) r8
            md.e r8 = (md.e) r8
            md.a r0 = md.a.R
            r8.w(r0)
            md.e r7 = (md.e) r7
            r7.w(r0)
        L125:
            return r1
        L126:
            boolean r7 = r8 instanceof xd.b
            if (r7 == 0) goto L138
            xd.b r8 = (xd.b) r8
            java.util.ArrayList r7 = r8.f21539k
            ce.n r8 = new ce.n
            r0 = 10
            r8.<init>(r0)
            r7.removeIf(r8)
        L138:
            r7 = 1
            return r7
        L13a:
            boolean r0 = r8 instanceof zd.c
            r1 = 1
            if (r0 == 0) goto L15a
            zd.c r8 = (zd.c) r8
            ud.a r8 = r8.f22668o
            if (r8 == 0) goto L15a
            java.util.ArrayList r0 = r8.f13674l
            int r0 = r0.size()
            if (r0 == r1) goto L15a
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r0 = "Incorrect condition in loop: "
            java.lang.String r8 = r0.concat(r8)
            r7.K(r8)
        L15a:
            return r1
        L15b:
            boolean r8 = x0(r7, r8)
            if (r8 == 0) goto L166
            md.a r8 = md.a.f8814b0
            r7.w(r8)
        L166:
            r7 = 1
            return r7
    }

    @Override // r9.e0, ke.e
    public void b(ud.r r7, ud.n r8) {
            r6 = this;
            int r0 = r6.f7597j
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            boolean r0 = r8 instanceof zd.c
            if (r0 == 0) goto L29
            zd.c r8 = (zd.c) r8
            ud.a r7 = r8.f22669p
            if (r7 == 0) goto Lbd
            ud.a r0 = r8.f22668o
            if (r0 == 0) goto Lbd
            java.util.ArrayList r0 = r0.f13674l
            java.util.ArrayList r7 = r7.f13674l
            r7.addAll(r0)
            r0.clear()
            r0.addAll(r7)
            r7.clear()
            r7 = 0
            r8.f22669p = r7
            goto Lbd
        L29:
            boolean r0 = r8 instanceof xd.d
            if (r0 == 0) goto L60
            xd.d r8 = (xd.d) r8
            java.util.ArrayList r0 = r8.f21544l
            java.util.Iterator r0 = r0.iterator()
        L35:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbd
            java.lang.Object r1 = r0.next()
            xd.c r1 = (xd.c) r1
            ud.j r1 = r1.f21541b
            ze.c r2 = new ze.c
            r2.<init>(r7)
            ae.g r3 = new ae.g
            r4 = 6
            r3.<init>(r2, r4)
            ke.a r4 = new ke.a
            r5 = 3
            r4.<init>(r3, r5)
            x6.d.h0(r7, r4, r1)
            le.e r3 = new le.e
            r3.<init>(r1, r2, r8)
            x6.d.h0(r7, r3, r1)
            goto L35
        L60:
            boolean r7 = r8 instanceof xd.b
            if (r7 == 0) goto Lbd
            xd.b r8 = (xd.b) r8
            java.util.ArrayList r7 = r8.f21539k
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L6f
            goto Lbd
        L6f:
            int r0 = r7.size()
            int r0 = r0 + (-1)
            java.lang.Object r7 = r7.get(r0)
            ud.j r7 = (ud.j) r7
            r0 = r7
            md.e r0 = (md.e) r0
            md.f r0 = r0.f8877g
            md.b r1 = md.b.A
            java.util.List r0 = r0.d(r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L8d
            goto Lbd
        L8d:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            nd.f r0 = (nd.f) r0
            ud.a r1 = r0.f9362g
            ud.p r0 = r0.f9364i
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L9f
            goto Lbd
        L9f:
            boolean r1 = r7 instanceof ud.a
            if (r1 == 0) goto Lb1
            ud.a r7 = (ud.a) r7
            java.util.ArrayList r7 = r7.f13674l
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto Lb1
            r7.add(r0)
            goto Lbd
        Lb1:
            java.util.List r7 = java.util.Collections.singletonList(r0)
            ud.o r0 = new ud.o
            r0.<init>(r7)
            r8.H(r0)
        Lbd:
            return
    }

    @Override // ke.d
    public boolean c(ud.r r1, ud.n r2) {
            r0 = this;
            boolean r2 = x0(r1, r2)
            if (r2 == 0) goto Lb
            be.b.Y(r1)
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }
}
