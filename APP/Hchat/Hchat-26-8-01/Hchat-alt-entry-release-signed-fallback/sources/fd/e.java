package fd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.EnumSet f3904e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.EnumSet f3905f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.util.EnumSet f3906g = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd.g f3907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ud.r f3908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ud.u f3909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3910d;

    static {
            java.lang.Class<fd.e> r0 = fd.e.class
            mh.d.b(r0)
            java.lang.Class<fd.d> r0 = fd.d.class
            java.util.EnumSet r0 = java.util.EnumSet.noneOf(r0)
            fd.e.f3904e = r0
            fd.d r0 = fd.d.f3900g
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            fd.e.f3905f = r0
            fd.d r0 = fd.d.f3901h
            java.util.EnumSet r0 = java.util.EnumSet.of(r0)
            fd.e.f3906g = r0
            return
    }

    public e(fd.g r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f3907a = r1
            ud.r r1 = r1.f3914a
            r0.f3908b = r1
            ud.e r1 = r1.f13718l
            ud.u r1 = r1.f13688k
            r0.f3909c = r1
            r0.f3910d = r2
            return
    }

    public static void m(fc.f r5, od.c r6, ud.g r7, fd.a r8) {
            od.a r0 = r6.f9773g
            ud.e r1 = r8.f3887a
            od.a r1 = r1.f13690m
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L10
            boolean r1 = r8.f3896j
            if (r1 != 0) goto L36
        L10:
            mh.b r1 = ye.f.f22435a
            od.a r1 = r0.f9769k
            r2 = 46
            if (r1 == 0) goto L30
            java.lang.String r3 = r1.f9766h
            java.lang.String r4 = "R"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L30
            r8.o(r5, r1)
            r5.d(r2)
            java.lang.String r8 = r0.k()
            r5.e(r8)
            goto L33
        L30:
            r8.o(r5, r0)
        L33:
            r5.d(r2)
        L36:
            if (r7 == 0) goto L3b
            r5.j(r7)
        L3b:
            if (r7 != 0) goto L43
            java.lang.String r6 = r6.f9776j
            r5.e(r6)
            return
        L43:
            od.c r6 = r7.f13707l
            java.lang.String r6 = r6.f9776j
            r5.e(r6)
            return
    }

    public final void a(fc.f r5, qd.l r6, java.util.Set r7) {
            r4 = this;
            r6.getClass()
            boolean r0 = r6 instanceof qd.r
            if (r0 == 0) goto L42
            qd.r r6 = (qd.r) r6
            r5.getClass()
            boolean r7 = r5 instanceof fc.b
            if (r7 == 0) goto L25
            qd.s r7 = r6.f10923m
            r0 = 0
            if (r7 != 0) goto L17
            r7 = r0
            goto L1d
        L17:
            ud.r r1 = r4.f3908b
            ic.d r7 = ic.d.a(r1, r7)
        L1d:
            if (r7 != 0) goto L20
            goto L22
        L20:
            ic.e r0 = r7.f6659l
        L22:
            r5.j(r0)
        L25:
            fd.g r7 = r4.f3907a
            fd.h r7 = r7.f3917d
            r7.getClass()
            java.lang.String r0 = r6.getName()
            if (r0 == 0) goto L36
            boolean r7 = r7.f3918g
            if (r7 == 0) goto L3e
        L36:
            int r6 = r6.f10922l
            java.lang.String r7 = "r"
            java.lang.String r0 = eh.a.l(r6, r7)
        L3e:
            r5.e(r0)
            return
        L42:
            boolean r0 = r6 instanceof qd.n
            r1 = 41
            r2 = 40
            if (r0 == 0) goto L70
            qd.n r6 = (qd.n) r6
            java.lang.String r6 = r4.i(r6)
            fd.d r0 = fd.d.f3901h
            boolean r7 = r7.contains(r0)
            if (r7 != 0) goto L6c
            java.lang.String r7 = "-"
            boolean r7 = r6.startsWith(r7)
            if (r7 == 0) goto L6c
            fc.f r5 = r5.d(r2)
            fc.f r5 = r5.e(r6)
            r5.d(r1)
            return
        L6c:
            r5.e(r6)
            return
        L70:
            boolean r0 = r6 instanceof qd.m
            if (r0 == 0) goto L92
            qd.m r6 = (qd.m) r6
            ud.p r6 = r6.f10904l
            md.a r0 = md.a.O
            md.f r3 = r6.f8877g
            boolean r0 = r3.a(r0)
            if (r0 == 0) goto L8e
            r5.d(r2)
            fd.d r7 = fd.d.f3902i
            r4.j(r6, r5, r7)
            r5.d(r1)
            return
        L8e:
            r4.k(r5, r6, r7)
            return
        L92:
            boolean r7 = r6 instanceof qd.p
            if (r7 == 0) goto La0
            qd.o r6 = (qd.o) r6
            java.lang.String r6 = r6.getName()
            r5.e(r6)
            return
        La0:
            af.a r5 = new af.a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = "Unknown arg type "
            java.lang.String r6 = r7.concat(r6)
            r5.<init>(r6)
            throw r5
    }

    public final void b(fc.f r1, qd.l r2, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L5
            java.util.EnumSet r3 = fd.e.f3905f
            goto L7
        L5:
            java.util.EnumSet r3 = fd.e.f3906g
        L7:
            r0.a(r1, r2, r3)
            return
    }

    public final void c(fc.f r3, qd.l r4) {
            r2 = this;
            java.lang.StringBuilder r0 = r3.f3882a
            int r0 = r0.length()
            r1 = 1
            r2.b(r3, r4, r1)
            java.lang.StringBuilder r4 = r3.f3882a
            int r4 = r4.length()
            if (r0 == r4) goto L17
            r4 = 46
            r3.d(r4)
        L17:
            return
    }

    public final void d(fc.f r3, qd.k r4) {
            r2 = this;
            fd.g r0 = r2.f3907a
            fd.h r0 = r0.f3917d
            java.lang.String r0 = r0.a(r4)
            r3.getClass()
            boolean r1 = r3 instanceof fc.b
            if (r1 == 0) goto L1c
            ud.r r1 = r2.f3908b
            qd.s r4 = r4.a()
            ic.d r4 = ic.d.a(r1, r4)
            r3.k(r4)
        L1c:
            r3.e(r0)
            return
    }

    public final void e(ud.p r3) {
            r2 = this;
            boolean r0 = r2.f3910d
            if (r0 == 0) goto L5
            return
        L5:
            pd.k r3 = r3.f13713k
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = " instruction can be used only in fallback mode"
            java.lang.String r3 = r3.concat(r0)
            af.a r0 = new af.a
            r0.<init>(r3)
            ud.r r1 = r2.f3908b
            r1.getClass()
            xe.h.a(r1, r3, r0)
            ud.e r3 = r1.f13718l
            ud.e r3 = r3.a0()
            md.a r1 = md.a.f8818f0
            r3.w(r1)
            throw r0
    }

    public final void f(fc.f r10, pd.b r11, int r12, ud.r r13) {
            r9 = this;
            if (r13 == 0) goto Lf
            md.a r0 = md.a.E
            md.f r1 = r13.f8877g
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto Lf
            int r0 = r12 + 1
            goto L10
        Lf:
            r0 = r12
        L10:
            java.util.List r1 = r11.f13715m
            int r1 = r1.size()
            r2 = 40
            r10.d(r2)
            if (r13 != 0) goto L1f
            r13 = 0
            goto L29
        L1f:
            md.b r2 = md.b.f8862q
            md.f r13 = r13.f8877g
            oc.b r13 = r13.c(r2)
            nd.g0 r13 = (nd.g0) r13
        L29:
            if (r0 >= r1) goto L9e
            r2 = 1
        L2c:
            if (r0 >= r1) goto L9e
            qd.l r3 = r11.S(r0)
            md.a r4 = md.a.F
            md.f r5 = r3.f8877g
            boolean r4 = r5.a(r4)
            if (r4 != 0) goto L9b
            if (r13 == 0) goto L49
            int r4 = r0 - r12
            java.util.BitSet r5 = r13.f9369g
            boolean r4 = r5.get(r4)
            if (r4 == 0) goto L49
            goto L9b
        L49:
            java.lang.String r4 = ", "
            r5 = 0
            if (r2 == 0) goto L50
            r2 = r5
            goto L53
        L50:
            r10.e(r4)
        L53:
            int r6 = r1 + (-1)
            if (r0 != r6) goto L98
            md.a r6 = md.a.V
            md.f r7 = r11.f8877g
            boolean r6 = r7.a(r6)
            if (r6 != 0) goto L62
            goto L98
        L62:
            qd.j r6 = r3.I()
            r6.getClass()
            boolean r6 = r6 instanceof qd.a
            if (r6 == 0) goto L98
            boolean r6 = r3 instanceof qd.m
            if (r6 != 0) goto L72
            goto L98
        L72:
            r6 = r3
            qd.m r6 = (qd.m) r6
            ud.p r6 = r6.f10904l
            pd.k r7 = r6.f13713k
            pd.k r8 = pd.k.F
            if (r7 == r8) goto L7e
            goto L98
        L7e:
            java.util.List r3 = r6.f13715m
            int r3 = r3.size()
            r7 = r5
        L85:
            if (r7 >= r3) goto L9b
            qd.l r8 = r6.S(r7)
            r9.b(r10, r8, r5)
            int r8 = r3 + (-1)
            if (r7 >= r8) goto L95
            r10.e(r4)
        L95:
            int r7 = r7 + 1
            goto L85
        L98:
            r9.b(r10, r3, r5)
        L9b:
            int r0 = r0 + 1
            goto L2c
        L9e:
            r11 = 41
            r10.d(r11)
            return
    }

    public final void g(fc.f r8, ud.e r9, td.a r10) {
            r7 = this;
            md.a r0 = md.a.f8838s
            md.b r1 = md.b.f8853h
            ud.e r2 = r9.a0()
            int r2 = r2.f13702y
            r3 = 4
            if (r2 == r3) goto L2b
            r3 = 5
            if (r2 != r3) goto L11
            goto L2b
        L11:
            ud.e r8 = r9.a0()
            java.lang.String r9 = java.lang.String.valueOf(r8)
            int r8 = r8.f13702y
            java.lang.String r8 = p.a.A(r8)
            java.lang.String r10 = "Expected class to be processed at this point, class: "
            java.lang.String r0 = ", state: "
            java.lang.String r8 = bc.e.j(r10, r9, r0, r8)
            ah.a.k(r8)
            return
        L2b:
            ud.r r2 = r7.f3908b
            ud.e r2 = r2.f13718l
            if (r2 == r9) goto Le0
            md.f r2 = r9.f8877g
            oc.b r1 = r2.c(r1)
            nd.a r1 = (nd.a) r1
            qd.j r1 = r1.f9347h
            java.util.List r2 = r9.f13697t
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L63
            java.lang.Object r3 = r2.next()
            ud.r r3 = (ud.r) r3
            md.a r4 = md.a.H
            md.f r5 = r3.f8877g
            boolean r4 = r5.a(r4)
            if (r4 == 0) goto L41
            xd.b r4 = r3.G
            boolean r4 = f8.i.n0(r4)
            if (r4 != 0) goto L41
            r3.w(r0)
            goto L41
        L63:
            r8.k(r9)
            java.lang.String r0 = "new "
            r8.e(r0)
            fd.g r0 = r7.f3907a
            fd.a r0 = r0.f3915b
            r0.p(r8, r1)
            ud.r r0 = r7.f3908b
            ud.e r0 = r0.f13718l
            ud.u r0 = r0.f13688k
            od.d r1 = r10.f13119o
            ud.r r0 = r0.i(r1)
            r1 = 0
            if (r0 == 0) goto Lb7
            java.util.List r2 = r0.S()
            java.util.List r3 = r10.f13715m
            int r3 = r3.size()
            int r4 = r2.size()
            int r3 = java.lang.Math.min(r3, r4)
            r4 = r1
        L94:
            if (r4 >= r3) goto Lb7
            qd.l r5 = r10.S(r4)
            r5.getClass()
            boolean r6 = r5 instanceof qd.r
            if (r6 == 0) goto Lb4
            java.lang.Object r6 = r2.get(r4)
            qd.r r6 = (qd.r) r6
            qd.r r5 = (qd.r) r5
            qd.s r6 = r6.f10923m
            qd.s r5 = r5.f10923m
            qd.k r5 = r5.b()
            r6.m(r5)
        Lb4:
            int r4 = r4 + 1
            goto L94
        Lb7:
            r7.f(r8, r10, r1, r0)
            r10 = 32
            r8.d(r10)
            fd.a r10 = new fd.a
            fd.g r0 = r7.f3907a
            fd.a r0 = r0.f3915b
            fd.a r1 = r0.f3888b
            if (r1 != 0) goto Lca
            goto Lcb
        Lca:
            r0 = r1
        Lcb:
            r10.<init>(r9, r0)
            fd.g r0 = r7.f3907a
            fd.h r0 = r0.f3917d
            r10.f3897k = r0
            r0 = 1
            r10.a(r8, r0)
            ud.r r8 = r7.f3908b
            ud.e r8 = r8.f13718l
            r8.S(r9)
            return
        Le0:
            r9.E(r1)
            r9.D(r0)
            ud.r r8 = r7.f3908b
            ud.e r8 = r8.f13718l
            ud.e r8 = r8.a0()
            md.a r10 = md.a.f8818f0
            r8.w(r10)
            af.a r8 = new af.a
            od.a r9 = r9.f13690m
            java.lang.String r9 = r9.f9768j
            java.lang.String r10 = "Anonymous inner class unlimited recursion detected. Convert class to inner: "
            java.lang.String r9 = wb.en.g(r10, r9)
            r8.<init>(r9)
            throw r8
    }

    public final void h(fc.f r4, od.c r5, qd.l r6) {
            r3 = this;
            ud.r r0 = r3.f3908b
            ud.e r0 = r0.f13718l
            ud.u r0 = r0.f13688k
            ud.g r0 = r0.h(r5)
            if (r0 == 0) goto L37
            md.b r1 = md.b.f8857l
            md.f r2 = r0.f8877g
            oc.b r1 = r2.c(r1)
            nd.k r1 = (nd.k) r1
            if (r1 == 0) goto L37
            java.lang.Object r5 = r1.f9379h
            int r6 = r1.f9378g
            int r6 = t3.c.b(r6)
            if (r6 == 0) goto L2c
            r0 = 1
            if (r6 == r0) goto L26
            return
        L26:
            qd.l r5 = (qd.l) r5
            r3.b(r4, r5, r0)
            return
        L2c:
            od.a r5 = (od.a) r5
            r3.p(r4, r5)
            java.lang.String r5 = ".this"
            r4.e(r5)
            return
        L37:
            r3.c(r4, r6)
            if (r0 == 0) goto L3f
            r4.j(r0)
        L3f:
            if (r0 != 0) goto L47
            java.lang.String r5 = r5.f9776j
            r4.e(r5)
            return
        L47:
            od.c r5 = r0.f13707l
            java.lang.String r5 = r5.f9776j
            r4.e(r5)
            return
    }

    public final java.lang.String i(qd.n r8) {
            r7 = this;
            mh.b r0 = fd.j.f3921a
            long r1 = r8.f10905l
            qd.j r3 = r8.f10902i
            ud.r r0 = r7.f3908b
            ud.e r0 = r0.f13718l
            ud.u r0 = r0.f13688k
            xe.q r4 = r0.f13744c
            md.a r0 = md.a.W
            md.f r8 = r8.f8877g
            boolean r6 = r8.a(r0)
            boolean r5 = r7.f3910d
            java.lang.String r8 = fd.j.a(r1, r3, r4, r5, r6)
            return r8
    }

    public final void j(ud.p r6, fc.f r7, fd.d r8) {
            r5 = this;
            ud.r r0 = r5.f3908b
            pd.k r1 = r6.f13713k
            pd.k r2 = pd.k.Y
            if (r1 != r2) goto La
            goto L89
        La:
            fd.d r1 = fd.d.f3900g     // Catch: java.lang.Exception -> L30
            if (r8 == r1) goto L8a
            fd.d r2 = fd.d.f3901h     // Catch: java.lang.Exception -> L30
            if (r8 != r2) goto L14
            goto L8a
        L14:
            fd.d r1 = fd.d.f3902i     // Catch: java.lang.Exception -> L30
            if (r8 == r1) goto L32
            int r2 = r6.f9389i     // Catch: java.lang.Exception -> L30
            r7.s(r2)     // Catch: java.lang.Exception -> L30
            ic.a.a(r7, r6)     // Catch: java.lang.Exception -> L30
            md.a r2 = md.a.f8839t     // Catch: java.lang.Exception -> L30
            md.f r3 = r6.f8877g     // Catch: java.lang.Exception -> L30
            boolean r2 = r3.a(r2)     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L32
            java.lang.String r2 = "// "
            r7.e(r2)     // Catch: java.lang.Exception -> L30
            goto L32
        L30:
            r7 = move-exception
            goto L95
        L32:
            qd.r r2 = r6.f13714l     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L7a
            qd.s r2 = r2.f10923m     // Catch: java.lang.Exception -> L30
            if (r2 == 0) goto L48
            java.util.ArrayList r2 = r2.f10928j     // Catch: java.lang.Exception -> L30
            int r2 = r2.size()     // Catch: java.lang.Exception -> L30
            if (r2 != 0) goto L48
            pd.k r2 = r6.f13713k     // Catch: java.lang.Exception -> L30
            pd.k r3 = pd.k.S     // Catch: java.lang.Exception -> L30
            if (r2 == r3) goto L7a
        L48:
            qd.r r2 = r6.f13714l     // Catch: java.lang.Exception -> L30
            md.a r3 = md.a.Q     // Catch: java.lang.Exception -> L30
            md.f r4 = r6.f8877g     // Catch: java.lang.Exception -> L30
            boolean r3 = r4.a(r3)     // Catch: java.lang.Exception -> L30
            if (r3 == 0) goto L71
            qd.s r2 = r2.f10923m     // Catch: java.lang.Exception -> L30
            qd.k r2 = r2.b()     // Catch: java.lang.Exception -> L30
            boolean r3 = r2.f10897d     // Catch: java.lang.Exception -> L30
            if (r3 == 0) goto L63
            java.lang.String r3 = "final "
            r7.e(r3)     // Catch: java.lang.Exception -> L30
        L63:
            qd.j r3 = r2.f10895b     // Catch: java.lang.Exception -> L30
            r5.q(r7, r3)     // Catch: java.lang.Exception -> L30
            r3 = 32
            r7.d(r3)     // Catch: java.lang.Exception -> L30
            r5.d(r7, r2)     // Catch: java.lang.Exception -> L30
            goto L75
        L71:
            r3 = 0
            r5.b(r7, r2, r3)     // Catch: java.lang.Exception -> L30
        L75:
            java.lang.String r2 = " = "
            r7.e(r2)     // Catch: java.lang.Exception -> L30
        L7a:
            java.util.EnumSet r2 = fd.e.f3904e     // Catch: java.lang.Exception -> L30
            r5.k(r7, r6, r2)     // Catch: java.lang.Exception -> L30
            if (r8 == r1) goto L89
            r8 = 59
            r7.d(r8)     // Catch: java.lang.Exception -> L30
            jd.c.a(r7, r0, r6)     // Catch: java.lang.Exception -> L30
        L89:
            return
        L8a:
            if (r8 != r1) goto L8f
            java.util.EnumSet r8 = fd.e.f3905f     // Catch: java.lang.Exception -> L30
            goto L91
        L8f:
            java.util.EnumSet r8 = fd.e.f3906g     // Catch: java.lang.Exception -> L30
        L91:
            r5.k(r7, r6, r8)     // Catch: java.lang.Exception -> L30
            return
        L95:
            af.a r8 = new af.a
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Error generate insn: "
            java.lang.String r6 = r1.concat(r6)
            r8.<init>(r0, r6, r7)
            throw r8
    }

    public final void k(fc.f r17, ud.p r18, java.util.Set r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            pd.k r4 = r2.f13713k
            java.util.List r5 = r2.f13715m
            int r6 = r4.ordinal()
            java.lang.String r8 = "] = "
            fd.g r10 = r0.f3907a
            java.lang.String r11 = " = "
            java.lang.String r13 = "new "
            ud.r r14 = r0.f3908b
            boolean r15 = r0.f3910d
            fd.d r9 = fd.d.f3900g
            r7 = 0
            r12 = 1
            switch(r6) {
                case 0: goto L72d;
                case 1: goto L71b;
                case 2: goto L70e;
                case 3: goto L673;
                case 4: goto L66d;
                case 5: goto L658;
                case 6: goto L650;
                case 7: goto L62a;
                case 8: goto L5fe;
                case 9: goto L5e5;
                case 10: goto L5ce;
                case 11: goto L5c1;
                case 12: goto L5b8;
                case 13: goto L582;
                case 14: goto L582;
                case 15: goto L53a;
                case 16: goto L495;
                case 17: goto L48a;
                case 18: goto L476;
                case 19: goto L45c;
                case 20: goto L5fe;
                case 21: goto L434;
                case 22: goto L427;
                case 23: goto L392;
                case 24: goto L381;
                case 25: goto L335;
                case 26: goto L31c;
                case 27: goto L2fd;
                case 28: goto L2c5;
                case 29: goto L2b2;
                case 30: goto L2a3;
                case 31: goto L28a;
                case 32: goto L280;
                case 33: goto L26b;
                case 34: goto L265;
                case 35: goto L25c;
                case 36: goto L23;
                case 37: goto L207;
                case 38: goto Lf9;
                case 39: goto Lc8;
                case 40: goto Lc2;
                case 41: goto L90;
                case 42: goto L88;
                case 43: goto L59;
                case 44: goto L23;
                case 45: goto L44;
                case 46: goto L34;
                default: goto L23;
            }
        L23:
            af.a r1 = new af.a
            java.lang.String r2 = java.lang.String.valueOf(r4)
            java.lang.String r3 = "Unknown instruction: "
            java.lang.String r2 = r3.concat(r2)
            r3 = 0
            r1.<init>(r14, r2, r3)
            throw r1
        L34:
            r0.e(r2)
            java.lang.String r3 = "ret "
            r1.e(r3)
            qd.l r2 = r2.S(r7)
            r0.b(r1, r2, r12)
            return
        L44:
            r0.e(r2)
            java.lang.String r3 = "jsr -> "
            fc.f r1 = r1.e(r3)
            sd.a r2 = (sd.a) r2
            int r2 = r2.f12414o
            java.lang.String r2 = fd.g.i(r2)
            r1.e(r2)
            return
        L59:
            r0.e(r2)
            java.lang.String r2 = r4.toString()
            fc.f r2 = r1.e(r2)
            r3 = 40
            r2.d(r3)
            java.util.Iterator r2 = r5.iterator()
        L6d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L82
            java.lang.Object r3 = r2.next()
            qd.l r3 = (qd.l) r3
            r0.b(r1, r3, r12)
            r3 = 32
            r1.d(r3)
            goto L6d
        L82:
            r3 = 41
            r1.d(r3)
            return
        L88:
            qd.l r2 = r2.S(r7)
            r0.a(r1, r2, r3)
            return
        L90:
            boolean r2 = r3.contains(r9)
            if (r2 == 0) goto L9b
            r3 = 40
            r1.d(r3)
        L9b:
            java.util.Iterator r3 = r5.iterator()
        L9f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lba
            java.lang.Object r4 = r3.next()
            qd.l r4 = (qd.l) r4
            r0.b(r1, r4, r12)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L9f
            java.lang.String r4 = " + "
            r1.e(r4)
            goto L9f
        Lba:
            if (r2 == 0) goto L70d
            r3 = 41
            r1.d(r3)
            return
        Lc2:
            java.lang.String r2 = "continue"
            r1.e(r2)
            return
        Lc8:
            java.lang.String r3 = "break"
            r1.e(r3)
            md.b r3 = md.b.G
            md.f r2 = r2.f8877g
            oc.b r2 = r2.c(r3)
            nd.u r2 = (nd.u) r2
            if (r2 == 0) goto L70d
            r3 = 32
            fc.f r1 = r1.d(r3)
            fd.h r3 = r10.f3917d
            r3.getClass()
            nd.t r2 = r2.f9397g
            int r2 = r2.f9395d
            java.lang.String r4 = "loop"
            java.lang.String r2 = eh.a.l(r2, r4)
            java.lang.Object r3 = r3.f3919h
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.add(r2)
            r1.e(r2)
            return
        Lf9:
            td.a r2 = (td.a) r2
            int r3 = r2.f13120p
            ud.e r4 = r14.f13718l
            ud.e r5 = r14.f13718l
            ud.u r4 = r4.f13688k
            od.d r6 = r2.f13119o
            od.a r8 = r6.f9780j
            ud.e r4 = r4.f(r8)
            if (r4 == 0) goto L11d
            md.b r8 = md.b.f8853h
            md.f r9 = r4.f8877g
            boolean r8 = r9.b(r8)
            if (r8 == 0) goto L11d
            if (r15 != 0) goto L11d
            r0.g(r1, r4, r2)
            return
        L11d:
            r4 = 4
            if (r3 == r4) goto L201
            ud.u r4 = r5.f13688k
            ud.r r4 = r4.i(r6)
            od.a r6 = r6.f9780j
            if (r4 == 0) goto L139
            md.b r8 = md.b.f8860o
            md.f r9 = r4.f8877g
            oc.b r8 = r9.c(r8)
            nd.y r8 = (nd.y) r8
            if (r8 == 0) goto L139
            ud.r r8 = r8.f9405g
            goto L13a
        L139:
            r8 = r4
        L13a:
            boolean r9 = r2.l0()
            if (r9 == 0) goto L14a
            r1.j(r8)
            java.lang.String r3 = "super"
            r1.e(r3)
            goto L1fd
        L14a:
            r9 = 3
            if (r3 != r9) goto L157
            r1.j(r8)
            java.lang.String r3 = "this"
            r1.e(r3)
            goto L1fd
        L157:
            if (r4 == 0) goto L17f
            md.a r3 = md.a.E
            md.f r9 = r4.f8877g
            boolean r3 = r9.a(r3)
            if (r3 != 0) goto L164
            goto L17f
        L164:
            ud.e r3 = r4.f13718l
            boolean r9 = r3.d0()
            if (r9 == 0) goto L17f
            java.util.List r9 = r2.f13715m
            int r9 = r9.size()
            if (r9 != 0) goto L175
            goto L17f
        L175:
            qd.l r9 = r2.S(r7)
            boolean r11 = r9.N()
            if (r11 == 0) goto L181
        L17f:
            r12 = r7
            goto L197
        L181:
            qd.j r11 = r9.I()
            ud.e r3 = r3.P()
            qd.j r3 = r3.b0()
            boolean r3 = r11.equals(r3)
            if (r3 != 0) goto L194
            goto L17f
        L194:
            r0.c(r1, r9)
        L197:
            r1.e(r13)
            if (r8 == 0) goto L1ab
            md.a r3 = md.a.f8838s
            md.f r9 = r8.f8877g
            boolean r3 = r9.a(r3)
            if (r3 == 0) goto L1a7
            goto L1ab
        L1a7:
            r1.j(r8)
            goto L1b4
        L1ab:
            ud.u r3 = r5.f13688k
            ud.e r3 = r3.f(r6)
            r1.j(r3)
        L1b4:
            fd.a r3 = r10.f3915b
            if (r12 == 0) goto L1dc
            java.lang.String r5 = r6.k()
            r1.e(r5)
            ud.e r5 = r3.f3887a
            od.a r5 = r5.f13690m
            od.a r8 = r5.m()
            od.a r9 = r6.m()
            if (r8 == 0) goto L1d2
            boolean r5 = r8.equals(r9)
            goto L1d6
        L1d2:
            boolean r5 = r5.equals(r9)
        L1d6:
            if (r5 != 0) goto L1e7
            r3.f(r6)
            goto L1e7
        L1dc:
            ud.e r5 = r3.f3887a
            od.a r5 = r5.f13690m
            java.lang.String r3 = r3.q(r5, r6)
            r1.e(r3)
        L1e7:
            md.b r3 = md.b.J
            md.f r5 = r2.f8877g
            oc.b r3 = r5.c(r3)
            nd.l r3 = (nd.l) r3
            if (r3 == 0) goto L1fd
            r3 = 60
            r1.d(r3)
            r3 = 62
            r1.d(r3)
        L1fd:
            r0.f(r1, r2, r7, r4)
            return
        L201:
            java.lang.String r1 = "Constructor 'self' invoke must be removed!"
            ah.a.k(r1)
            return
        L207:
            td.b r2 = (td.b) r2
            boolean r3 = r3.contains(r9)
            if (r3 == 0) goto L214
            r4 = 40
            r1.d(r4)
        L214:
            qd.l r4 = r2.S(r7)
            qd.l r5 = r2.S(r12)
            fd.c r6 = new fd.c
            r6.<init>(r10, r15)
            boolean r8 = r4.O()
            r9 = 12
            if (r8 == 0) goto L23a
            boolean r8 = r5.L()
            if (r8 == 0) goto L23a
            yd.b r2 = r2.f13121o
            androidx.lifecycle.x r4 = new androidx.lifecycle.x
            r4.<init>(r9)
            r6.r(r1, r4, r2)
            goto L254
        L23a:
            yd.b r2 = r2.f13121o
            androidx.lifecycle.x r8 = new androidx.lifecycle.x
            r8.<init>(r9)
            r6.t(r1, r8, r2)
            java.lang.String r2 = " ? "
            r1.e(r2)
            r0.b(r1, r4, r7)
            java.lang.String r2 = " : "
            r1.e(r2)
            r0.b(r1, r5, r7)
        L254:
            if (r3 == 0) goto L70d
            r3 = 41
            r1.d(r3)
            return
        L25c:
            r0.e(r2)
            java.lang.String r2 = "move-result"
            r1.e(r2)
            return
        L265:
            pd.n r2 = (pd.n) r2
            r0.l(r2, r1)
            return
        L26b:
            r3 = r2
            pd.j r3 = (pd.j) r3
            java.lang.Object r3 = r3.f10495o
            od.c r3 = (od.c) r3
            r0.o(r1, r3)
            r1.e(r11)
            qd.l r2 = r2.S(r7)
            r0.b(r1, r2, r7)
            return
        L280:
            pd.j r2 = (pd.j) r2
            java.lang.Object r2 = r2.f10495o
            od.c r2 = (od.c) r2
            r0.o(r1, r2)
            return
        L28a:
            r3 = r2
            pd.j r3 = (pd.j) r3
            java.lang.Object r3 = r3.f10495o
            od.c r3 = (od.c) r3
            qd.l r4 = r2.S(r12)
            r0.h(r1, r3, r4)
            r1.e(r11)
            qd.l r2 = r2.S(r7)
            r0.b(r1, r2, r7)
            return
        L2a3:
            r3 = r2
            pd.j r3 = (pd.j) r3
            java.lang.Object r3 = r3.f10495o
            od.c r3 = (od.c) r3
            qd.l r2 = r2.S(r7)
            r0.h(r1, r3, r2)
            return
        L2b2:
            r0.e(r2)
            fc.f r1 = r1.e(r13)
            qd.r r2 = r2.f13714l
            qd.j r2 = r2.f10902i
            java.lang.String r2 = r2.toString()
            r1.e(r2)
            return
        L2c5:
            r3 = r2
            pd.p r3 = (pd.p) r3
            qd.j r3 = r3.f10529o
            r1.e(r13)
            qd.j r4 = r3.h()
            r0.q(r1, r4)
            int r4 = r5.size()
            r5 = r7
        L2d9:
            if (r5 >= r4) goto L2ef
            r6 = 91
            r1.d(r6)
            qd.l r6 = r2.S(r5)
            r0.b(r1, r6, r7)
            r6 = 93
            r1.d(r6)
            int r5 = r5 + 1
            goto L2d9
        L2ef:
            int r2 = r3.f()
        L2f3:
            if (r5 >= r2) goto L70d
            java.lang.String r3 = "[]"
            r1.e(r3)
            int r5 = r5 + 1
            goto L2f3
        L2fd:
            qd.l r3 = r2.S(r7)
            r0.b(r1, r3, r12)
            r6 = 91
            r1.d(r6)
            qd.l r3 = r2.S(r12)
            r0.b(r1, r3, r7)
            r1.e(r8)
            r3 = 2
            qd.l r2 = r2.S(r3)
            r0.b(r1, r2, r7)
            return
        L31c:
            r6 = 91
            qd.l r3 = r2.S(r7)
            r0.b(r1, r3, r12)
            r1.d(r6)
            qd.l r2 = r2.S(r12)
            r0.b(r1, r2, r7)
            r6 = 93
            r1.d(r6)
            return
        L335:
            pd.g r2 = (pd.g) r2
            md.a r3 = md.a.Q
            md.f r4 = r2.f8877g
            boolean r3 = r4.a(r3)
            if (r3 != 0) goto L352
            r1.e(r13)
            qd.j r3 = r2.f10488o
            qd.g r4 = qd.j.f10868b
            qd.a r4 = new qd.a
            r4.<init>(r3)
            fd.a r3 = r10.f3915b
            r3.s(r1, r4)
        L352:
            r3 = 123(0x7b, float:1.72E-43)
            r1.d(r3)
            java.util.List r3 = r2.f13715m
            int r3 = r3.size()
            r4 = r7
            r5 = r4
        L35f:
            if (r4 >= r3) goto L37b
            qd.l r6 = r2.S(r4)
            r0.b(r1, r6, r7)
            int r4 = r4 + 1
            if (r4 >= r3) goto L371
            java.lang.String r6 = ", "
            r1.e(r6)
        L371:
            int r5 = r5 + r12
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r5 != r6) goto L35f
            r1.p()
            r5 = r7
            goto L35f
        L37b:
            r2 = 125(0x7d, float:1.75E-43)
            r1.d(r2)
            return
        L381:
            r0.e(r2)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "fill-array "
            java.lang.String r2 = r3.concat(r2)
            r1.e(r2)
            return
        L392:
            r3 = r2
            pd.f r3 = (pd.f) r3
            if (r15 == 0) goto L3bd
            pd.e r3 = r3.f10487p
            java.lang.String r3 = java.util.Objects.toString(r3)
            qd.l r2 = r2.S(r7)
            r0.b(r1, r2, r12)
            java.lang.String r2 = " = {"
            fc.f r1 = r1.e(r2)
            int r2 = r3.length()
            int r2 = r2 - r12
            java.lang.String r2 = r3.substring(r12, r2)
            fc.f r1 = r1.e(r2)
            java.lang.String r2 = "} // fill-array"
            r1.e(r2)
            return
        L3bd:
            bc.a r2 = bc.a.f700k
            boolean r2 = r14.N(r2)
            if (r2 == 0) goto L3ca
            java.lang.String r2 = "// fill-array-data instruction"
            r1.e(r2)
        L3ca:
            r1.p()
            qd.l r2 = r3.S(r7)
            qd.j r4 = r2.I()
            boolean r5 = r4.w()
            if (r5 == 0) goto L3e4
            boolean r5 = r4 instanceof qd.a
            if (r5 == 0) goto L3e4
            qd.j r4 = r4.g()
            goto L3ec
        L3e4:
            pd.e r4 = r3.f10487p
            qd.h r4 = r4.f10485r
            qd.j r4 = r4.A()
        L3ec:
            java.util.List r3 = r3.i0(r4)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
        L3f6:
            if (r7 >= r4) goto L70d
            if (r7 == 0) goto L402
            r5 = 59
            r1.d(r5)
            r1.p()
        L402:
            r0.b(r1, r2, r12)
            r6 = 91
            fc.f r5 = r1.d(r6)
            java.lang.String r9 = java.lang.Integer.toString(r7)
            fc.f r5 = r5.e(r9)
            fc.f r5 = r5.e(r8)
            java.lang.Object r9 = r3.get(r7)
            qd.n r9 = (qd.n) r9
            java.lang.String r9 = r0.i(r9)
            r5.e(r9)
            int r7 = r7 + 1
            goto L3f6
        L427:
            qd.l r2 = r2.S(r7)
            r0.b(r1, r2, r12)
            java.lang.String r2 = ".length"
            r1.e(r2)
            return
        L434:
            boolean r3 = r3.contains(r9)
            if (r3 == 0) goto L43f
            r4 = 40
            r1.d(r4)
        L43f:
            qd.l r4 = r2.S(r7)
            r0.b(r1, r4, r12)
            java.lang.String r4 = " instanceof "
            r1.e(r4)
            pd.j r2 = (pd.j) r2
            java.lang.Object r2 = r2.f10495o
            qd.j r2 = (qd.j) r2
            r0.q(r1, r2)
            if (r3 == 0) goto L70d
            r3 = 41
            r1.d(r3)
            return
        L45c:
            if (r15 == 0) goto L70d
            java.lang.String r3 = "monitor-exit("
            r1.e(r3)
            int r3 = r5.size()
            if (r3 != r12) goto L470
            qd.l r2 = r2.S(r7)
            r0.b(r1, r2, r12)
        L470:
            r3 = 41
            r1.d(r3)
            return
        L476:
            r3 = 41
            if (r15 == 0) goto L70d
            java.lang.String r4 = "monitor-enter("
            r1.e(r4)
            qd.l r2 = r2.S(r7)
            r0.b(r1, r2, r12)
            r1.d(r3)
            return
        L48a:
            r0.e(r2)
            java.lang.String r2 = r2.toString()
            r1.e(r2)
            return
        L495:
            r0.e(r2)
            r3 = r2
            pd.s r3 = (pd.s) r3
            java.lang.String r4 = "switch("
            r1.e(r4)
            qd.l r2 = r2.S(r7)
            r0.b(r1, r2, r12)
            java.lang.String r2 = ") {"
            r1.e(r2)
            r1.o()
            pd.r r2 = r3.l0()
            int[] r2 = r2.f10532p
            int r4 = r2.length
            ud.a[] r5 = r3.f10539t
            java.lang.String r6 = "default: goto "
            java.lang.String r8 = ": goto "
            java.lang.String r9 = "case "
            if (r5 == 0) goto L4f7
        L4c0:
            if (r7 >= r4) goto L4e4
            r1.r(r9)
            r10 = r2[r7]
            java.lang.String r10 = java.lang.Integer.toString(r10)
            fc.f r10 = r1.e(r10)
            r10.e(r8)
            r10 = r5[r7]
            java.lang.String r10 = fd.g.j(r10)
            fc.f r10 = r1.e(r10)
            r11 = 59
            r10.d(r11)
            int r7 = r7 + 1
            goto L4c0
        L4e4:
            r11 = 59
            r1.r(r6)
            ud.a r2 = r3.f10540u
            java.lang.String r2 = fd.g.j(r2)
            fc.f r2 = r1.e(r2)
            r2.d(r11)
            goto L533
        L4f7:
            pd.r r5 = r3.l0()
            int[] r5 = r5.f10533q
        L4fd:
            if (r7 >= r4) goto L521
            r1.r(r9)
            r10 = r2[r7]
            java.lang.String r10 = java.lang.Integer.toString(r10)
            fc.f r10 = r1.e(r10)
            r10.e(r8)
            r10 = r5[r7]
            java.lang.String r10 = fd.g.i(r10)
            fc.f r10 = r1.e(r10)
            r11 = 59
            r10.d(r11)
            int r7 = r7 + 1
            goto L4fd
        L521:
            r11 = 59
            r1.r(r6)
            int r2 = r3.f10537r
            java.lang.String r2 = fd.g.i(r2)
            fc.f r2 = r1.e(r2)
            r2.d(r11)
        L533:
            r1.n()
            r1.q()
            return
        L53a:
            r0.e(r2)
            r3 = r2
            pd.i r3 = (pd.i) r3
            java.lang.String r4 = "if ("
            r1.e(r4)
            qd.l r4 = r2.S(r7)
            r0.b(r1, r4, r12)
            r4 = 32
            r1.d(r4)
            int r5 = r3.f10492p
            java.lang.String r5 = p.a.f(r5)
            fc.f r5 = r1.e(r5)
            r5.d(r4)
            qd.l r2 = r2.S(r12)
            r0.b(r1, r2, r12)
            java.lang.String r2 = ") goto "
            fc.f r1 = r1.e(r2)
            mh.b r2 = fd.g.f3913e
            ud.a r2 = r3.f10493q
            if (r2 == 0) goto L576
            java.lang.String r2 = fd.g.j(r2)
            goto L57e
        L576:
            int r2 = r3.k0()
            java.lang.String r2 = fd.g.i(r2)
        L57e:
            r1.e(r2)
            return
        L582:
            r3 = 40
            r1.d(r3)
            qd.l r3 = r2.S(r7)
            r0.b(r1, r3, r12)
            java.lang.String r3 = " > "
            r1.e(r3)
            qd.l r3 = r2.S(r12)
            r0.b(r1, r3, r12)
            java.lang.String r3 = " ? 1 : ("
            r1.e(r3)
            qd.l r3 = r2.S(r7)
            r0.b(r1, r3, r12)
            java.lang.String r3 = " == "
            r1.e(r3)
            qd.l r2 = r2.S(r12)
            r0.b(r1, r2, r12)
            java.lang.String r2 = " ? 0 : -1))"
            r1.e(r2)
            return
        L5b8:
            r0.e(r2)
            java.lang.String r2 = "move-exception"
            r1.e(r2)
            return
        L5c1:
            java.lang.String r3 = "throw "
            r1.e(r3)
            qd.l r2 = r2.S(r7)
            r0.b(r1, r2, r12)
            return
        L5ce:
            r0.e(r2)
            java.lang.String r3 = "goto "
            fc.f r1 = r1.e(r3)
            pd.h r2 = (pd.h) r2
            int r2 = r2.k0()
            java.lang.String r2 = fd.g.i(r2)
            r1.e(r2)
            return
        L5e5:
            int r3 = r5.size()
            if (r3 == 0) goto L5f8
            java.lang.String r3 = "return "
            r1.e(r3)
            qd.l r2 = r2.S(r7)
            r0.b(r1, r2, r7)
            return
        L5f8:
            java.lang.String r2 = "return"
            r1.e(r2)
            return
        L5fe:
            boolean r3 = r3.contains(r9)
            r4 = 40
            if (r3 == 0) goto L609
            r1.d(r4)
        L609:
            r1.d(r4)
            r4 = r2
            pd.j r4 = (pd.j) r4
            java.lang.Object r4 = r4.f10495o
            qd.j r4 = (qd.j) r4
            r0.q(r1, r4)
            java.lang.String r4 = ") "
            r1.e(r4)
            qd.l r2 = r2.S(r7)
            r0.b(r1, r2, r12)
            if (r3 == 0) goto L70d
            r3 = 41
            r1.d(r3)
            return
        L62a:
            r0.e(r2)
            int r3 = r5.size()
        L631:
            int r4 = r3 + (-1)
            if (r7 >= r4) goto L70d
            qd.l r4 = r2.S(r7)
            r0.b(r1, r4, r12)
            r1.e(r11)
            int r4 = r7 + 1
            qd.l r4 = r2.S(r4)
            r0.b(r1, r4, r12)
            java.lang.String r4 = "; "
            r1.e(r4)
            int r7 = r7 + 2
            goto L631
        L650:
            qd.l r2 = r2.S(r7)
            r0.b(r1, r2, r7)
            return
        L658:
            qd.l r4 = r2.S(r7)
            qd.j r4 = r4.I()
            qd.g r5 = qd.j.f10869c
            if (r4 != r5) goto L667
            r4 = 33
            goto L669
        L667:
            r4 = 126(0x7e, float:1.77E-43)
        L669:
            r0.n(r1, r2, r3, r4)
            return
        L66d:
            r4 = 45
            r0.n(r1, r2, r3, r4)
            return
        L673:
            pd.a r2 = (pd.a) r2
            md.f r4 = r2.f8877g
            int r5 = r2.f10475o
            md.a r6 = md.a.T
            boolean r4 = r4.a(r6)
            if (r4 == 0) goto L6cf
            qd.l r3 = r2.S(r7)
            qd.l r2 = r2.S(r12)
            r2.getClass()
            boolean r4 = r2 instanceof qd.n
            if (r4 == 0) goto L6b5
            if (r5 == r12) goto L695
            r4 = 2
            if (r5 != r4) goto L6b5
        L695:
            r4 = r2
            qd.n r4 = (qd.n) r4
            long r8 = r4.f10905l
            r10 = 1
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L6b5
            boolean r4 = r4.c0()
            if (r4 == 0) goto L6b5
            r0.b(r1, r3, r7)
            java.lang.String r2 = p.a.e(r5)
            fc.f r1 = r1.e(r2)
            r1.e(r2)
            return
        L6b5:
            r0.b(r1, r3, r7)
            r3 = 32
            fc.f r3 = r1.d(r3)
            java.lang.String r4 = p.a.e(r5)
            fc.f r3 = r3.e(r4)
            java.lang.String r4 = "= "
            r3.e(r4)
            r0.b(r1, r2, r7)
            return
        L6cf:
            boolean r3 = r3.contains(r9)
            if (r3 == 0) goto L6e1
            md.a r3 = md.a.f8835p
            md.f r4 = r2.f8877g
            boolean r3 = r4.a(r3)
            if (r3 != 0) goto L6e1
            r3 = r12
            goto L6e2
        L6e1:
            r3 = r7
        L6e2:
            if (r3 == 0) goto L6e9
            r4 = 40
            r1.d(r4)
        L6e9:
            qd.l r4 = r2.S(r7)
            r0.b(r1, r4, r12)
            r4 = 32
            r1.d(r4)
            java.lang.String r5 = p.a.e(r5)
            r1.e(r5)
            r1.d(r4)
            qd.l r2 = r2.S(r12)
            r0.b(r1, r2, r12)
            if (r3 == 0) goto L70d
            r3 = 41
            r1.d(r3)
        L70d:
            return
        L70e:
            pd.c r2 = (pd.c) r2
            qd.j r2 = r2.f10476o
            r0.q(r1, r2)
            java.lang.String r2 = ".class"
            r1.e(r2)
            return
        L71b:
            pd.d r2 = (pd.d) r2
            java.lang.String r2 = r2.f10477o
            ud.e r3 = r14.f13718l
            ud.u r3 = r3.f13688k
            xe.q r3 = r3.f13744c
            java.lang.String r2 = r3.i(r2)
            r1.e(r2)
            return
        L72d:
            qd.l r2 = r2.S(r7)
            qd.n r2 = (qd.n) r2
            java.lang.String r2 = r0.i(r2)
            r1.e(r2)
            return
    }

    public final void l(pd.n r19, fc.f r20) {
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            int r3 = r0.f10525o
            od.d r4 = r0.f10526p
            r5 = 7
            fd.g r6 = r1.f3907a
            r7 = 5
            boolean r8 = r1.f3910d
            r9 = 40
            r10 = 0
            r11 = 1
            if (r3 != r5) goto L1e0
            pd.l r0 = (pd.l) r0
            boolean r3 = r0.f10522u
            java.util.List r4 = r0.f13715m
            if (r3 == 0) goto L58
            pd.b r3 = r0.f10520s
            boolean r4 = r3 instanceof td.a
            if (r4 == 0) goto L33
            td.a r3 = (td.a) r3
            od.d r0 = r3.f13119o
            od.a r0 = r0.f9780j
            r1.p(r2, r0)
            java.lang.String r0 = "::new"
            r2.e(r0)
            return
        L33:
            boolean r4 = r3 instanceof pd.n
            if (r4 == 0) goto L57
            pd.n r3 = (pd.n) r3
            od.d r3 = r3.f10526p
            int r4 = r0.f10519r
            if (r4 != r7) goto L45
            od.a r0 = r3.f9780j
            r1.p(r2, r0)
            goto L4c
        L45:
            qd.l r0 = r0.S(r10)
            r1.b(r2, r0, r11)
        L4c:
            java.lang.String r0 = "::"
            fc.f r0 = r2.e(r0)
            java.lang.String r2 = r3.f9784n
            r0.e(r2)
        L57:
            return
        L58:
            java.lang.String r3 = " -> {"
            r5 = 41
            java.lang.String r12 = ", "
            java.lang.String r13 = "()"
            if (r8 != 0) goto L121
            boolean r14 = r0.f10521t
            if (r14 != 0) goto L68
            goto L121
        L68:
            pd.b r8 = r0.f10520s
            md.b r14 = md.b.I
            md.f r8 = r8.f8877g
            oc.b r8 = r8.c(r14)
            ud.r r8 = (ud.r) r8
            fd.g r14 = new fd.g
            fd.a r15 = r6.f3915b
            r14.<init>(r15, r8)
            fd.h r6 = r6.f3917d
            fd.h r15 = r14.f3917d
            java.lang.Object r15 = r15.f3919h
            java.util.HashSet r15 = (java.util.HashSet) r15
            java.lang.Object r6 = r6.f3919h
            java.util.HashSet r6 = (java.util.HashSet) r6
            r15.addAll(r6)
            od.d r6 = r0.f10518q
            java.util.List r6 = r6.f9779i
            java.util.List r8 = r8.S()
            boolean r15 = r6.isEmpty()
            if (r15 == 0) goto L9c
            r2.e(r13)
            goto Lcf
        L9c:
            int r13 = r8.size()
            int r6 = r6.size()
            int r6 = r13 - r6
            int r15 = r13 - r6
            if (r15 <= r11) goto Lad
            r2.d(r9)
        Lad:
            r9 = r6
        Lae:
            if (r9 >= r13) goto Lca
            if (r9 == r6) goto Lb5
            r2.e(r12)
        Lb5:
            java.lang.Object r16 = r8.get(r9)
            r10 = r16
            qd.r r10 = (qd.r) r10
            qd.s r10 = r10.f10923m
            qd.k r10 = r10.b()
            r1.d(r2, r10)
            int r9 = r9 + 1
            r10 = 0
            goto Lae
        Lca:
            if (r15 <= r11) goto Lcf
            r2.d(r5)
        Lcf:
            int r4 = r4.size()
            int r5 = r0.f10519r
            if (r5 != r7) goto Ld8
            r11 = 0
        Ld8:
            r10 = 0
        Ld9:
            if (r11 >= r4) goto L111
            qd.l r5 = r0.S(r11)
            r5.getClass()
            boolean r6 = r5 instanceof qd.r
            if (r6 == 0) goto Lff
            qd.r r5 = (qd.r) r5
            int r6 = r10 + 1
            java.lang.Object r7 = r8.get(r10)
            qd.r r7 = (qd.r) r7
            qd.s r7 = r7.f10923m
            qd.s r5 = r5.f10923m
            qd.k r5 = r5.b()
            r7.m(r5)
            int r11 = r11 + 1
            r10 = r6
            goto Ld9
        Lff:
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r2 = "Unexpected argument type in lambda call: "
            java.lang.String r0 = r2.concat(r0)
            ah.a.k(r0)
            return
        L111:
            r2.e(r3)
            r2.o()
            r14.d(r2)
            r2.n()
            r2.q()
            return
        L121:
            java.lang.String r6 = "/* ERROR: "
            pd.b r10 = r0.f10520s     // Catch: java.lang.Exception -> L133
            od.d r14 = r0.f10518q     // Catch: java.lang.Exception -> L133
            java.util.List r15 = r14.f9779i     // Catch: java.lang.Exception -> L133
            int r15 = r15.size()     // Catch: java.lang.Exception -> L133
            if (r15 != 0) goto L136
            r2.e(r13)     // Catch: java.lang.Exception -> L133
            goto L18a
        L133:
            r0 = move-exception
            goto L1d0
        L136:
            r2.d(r9)     // Catch: java.lang.Exception -> L133
            java.util.List r9 = r10.f13715m     // Catch: java.lang.Exception -> L133
            int r9 = r9.size()     // Catch: java.lang.Exception -> L133
            int r13 = r9 - r15
            int r15 = r0.f10519r     // Catch: java.lang.Exception -> L133
            if (r15 == r7) goto L15f
            int r4 = r4.size()     // Catch: java.lang.Exception -> L133
            if (r4 <= 0) goto L15f
            r4 = 0
            qd.l r0 = r0.S(r4)     // Catch: java.lang.Exception -> L133
            boolean r0 = r0.N()     // Catch: java.lang.Exception -> L133
            if (r0 == 0) goto L15f
            qd.l r0 = r10.S(r4)     // Catch: java.lang.Exception -> L133
            md.a r4 = md.a.J     // Catch: java.lang.Exception -> L133
            r0.w(r4)     // Catch: java.lang.Exception -> L133
        L15f:
            if (r13 < 0) goto L173
            r0 = r13
        L162:
            if (r0 >= r9) goto L187
            if (r0 == r13) goto L169
            r2.e(r12)     // Catch: java.lang.Exception -> L133
        L169:
            qd.l r4 = r10.S(r0)     // Catch: java.lang.Exception -> L133
            r1.b(r2, r4, r11)     // Catch: java.lang.Exception -> L133
            int r0 = r0 + 1
            goto L162
        L173:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L133
            r0.<init>(r6)     // Catch: java.lang.Exception -> L133
            r0.append(r13)     // Catch: java.lang.Exception -> L133
            java.lang.String r4 = " */"
            r0.append(r4)     // Catch: java.lang.Exception -> L133
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L133
            r2.e(r0)     // Catch: java.lang.Exception -> L133
        L187:
            r2.d(r5)     // Catch: java.lang.Exception -> L133
        L18a:
            r2.e(r3)     // Catch: java.lang.Exception -> L133
            if (r8 == 0) goto L19c
            java.lang.String r0 = " // "
            fc.f r0 = r2.e(r0)     // Catch: java.lang.Exception -> L133
            java.lang.String r3 = r14.toString()     // Catch: java.lang.Exception -> L133
            r0.e(r3)     // Catch: java.lang.Exception -> L133
        L19c:
            r2.o()     // Catch: java.lang.Exception -> L133
            r2.p()     // Catch: java.lang.Exception -> L133
            qd.j r0 = r14.f9778h     // Catch: java.lang.Exception -> L133
            r0.getClass()     // Catch: java.lang.Exception -> L133
            boolean r3 = r0 instanceof qd.g     // Catch: java.lang.Exception -> L133
            if (r3 == 0) goto L1b6
            qd.g r0 = (qd.g) r0     // Catch: java.lang.Exception -> L133
            qd.q r0 = r0.K     // Catch: java.lang.Exception -> L133
            qd.q r3 = qd.q.f10917t     // Catch: java.lang.Exception -> L133
            if (r0 != r3) goto L1b6
            r17 = r11
            goto L1b8
        L1b6:
            r17 = 0
        L1b8:
            if (r17 != 0) goto L1bf
            java.lang.String r0 = "return "
            r2.e(r0)     // Catch: java.lang.Exception -> L133
        L1bf:
            fd.d r0 = fd.d.f3902i     // Catch: java.lang.Exception -> L133
            r1.j(r10, r2, r0)     // Catch: java.lang.Exception -> L133
            java.lang.String r0 = ";"
            r2.e(r0)     // Catch: java.lang.Exception -> L133
            r2.n()     // Catch: java.lang.Exception -> L133
            r2.q()     // Catch: java.lang.Exception -> L133
            return
        L1d0:
            af.g r2 = new af.g
            java.lang.String r3 = r0.getMessage()
            java.lang.String r4 = "Failed to generate 'invoke-custom' instruction: "
            java.lang.String r3 = wb.en.g(r4, r3)
            r2.<init>(r3, r0)
            throw r2
        L1e0:
            ud.r r5 = r1.f3908b
            ud.e r10 = r5.f13718l
            ud.e r5 = r5.f13718l
            ud.u r10 = r10.f13688k
            ud.r r10 = r10.i(r4)
            java.lang.String r12 = r4.f9777g
            od.a r13 = r4.f9780j
            r14 = 8
            java.lang.String r15 = ") "
            if (r3 != r14) goto L25d
            pd.m r0 = (pd.m) r0
            if (r8 == 0) goto L229
            java.lang.String r3 = "call_site("
            r2.e(r3)
            r2.o()
            java.util.ArrayList r3 = r0.f10524r
            java.util.Iterator r3 = r3.iterator()
        L208:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L21c
            java.lang.Object r4 = r3.next()
            nc.a r4 = (nc.a) r4
            java.lang.String r4 = r4.toString()
            r2.r(r4)
            goto L208
        L21c:
            r2.n()
            java.lang.String r3 = ").invoke"
            r2.r(r3)
            r4 = 0
            r1.f(r2, r0, r4, r10)
            return
        L229:
            od.d r3 = r0.f10526p
            qd.j r3 = r3.f9778h
            r3.getClass()
            boolean r4 = r3 instanceof qd.g
            if (r4 == 0) goto L23e
            r4 = r3
            qd.g r4 = (qd.g) r4
            qd.q r4 = r4.K
            qd.q r5 = qd.q.f10917t
            if (r4 != r5) goto L23e
            goto L249
        L23e:
            r2.d(r9)
            fd.a r4 = r6.f3915b
            r4.s(r2, r3)
            r2.e(r15)
        L249:
            pd.n r3 = r0.f10523q
            r1.l(r3, r2)
            java.lang.String r3 = ".dynamicInvoker().invoke"
            r2.e(r3)
            r4 = 0
            r1.f(r2, r0, r4, r10)
            java.lang.String r0 = " /* invoke-custom */"
            r2.e(r0)
            return
        L25d:
            int r6 = r0.f10525o
            r8 = 6
            r14 = 3
            if (r6 != r8) goto L264
            goto L280
        L264:
            if (r6 != r14) goto L28b
            java.lang.String r6 = r13.f9768j
            java.lang.String r8 = "java.lang.invoke.MethodHandle"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L28b
            java.lang.String r6 = "invoke"
            boolean r6 = r12.equals(r6)
            if (r6 != 0) goto L280
            java.lang.String r6 = "invokeExact"
            boolean r6 = r12.equals(r6)
            if (r6 == 0) goto L28b
        L280:
            r2.d(r9)
            qd.j r6 = r4.f9778h
            r1.q(r2, r6)
            r2.e(r15)
        L28b:
            int r3 = t3.c.b(r3)
            r6 = 46
            if (r3 == 0) goto L315
            if (r3 == r11) goto L2a2
            r8 = 2
            if (r3 == r8) goto L2a2
            if (r3 == r14) goto L2a2
            r8 = 4
            if (r3 == r8) goto L2a4
            if (r3 == r7) goto L2a2
            r3 = 0
            goto L324
        L2a2:
            r3 = 0
            goto L2e9
        L2a4:
            qd.j r3 = r13.f9765g
            r7 = r5
        L2a7:
            od.a r8 = r7.f13690m
            ud.u r9 = r1.f3909c
            qd.j r14 = r8.f9765g
            boolean r9 = qd.j.u(r9, r14, r3)
            if (r9 == 0) goto L2b4
            goto L2b9
        L2b4:
            ud.e r8 = r7.f13701x
            if (r8 != r7) goto L2e7
            r8 = 0
        L2b9:
            if (r8 != 0) goto L2cd
            java.lang.String r3 = "super/*"
            fc.f r3 = r2.e(r3)
            java.lang.String r5 = r13.f9768j
            fc.f r3 = r3.e(r5)
            java.lang.String r5 = "*/"
            r3.e(r5)
            goto L2e3
        L2cd:
            od.a r3 = r5.f13690m
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L2db
            java.lang.String r3 = "super"
            r2.e(r3)
            goto L2e3
        L2db:
            r1.p(r2, r8)
            java.lang.String r3 = ".super"
            r2.e(r3)
        L2e3:
            r2.d(r6)
            goto L325
        L2e7:
            r7 = r8
            goto L2a7
        L2e9:
            qd.l r3 = r0.S(r3)
            boolean r6 = r3.J()
            if (r6 == 0) goto L311
            boolean r6 = r3.N()
            if (r6 == 0) goto L2fa
            goto L325
        L2fa:
            ud.u r5 = r5.f13688k
            qd.j r6 = r3.I()
            ud.e r5 = r5.g(r6)
            if (r5 == 0) goto L311
            md.a r6 = md.a.f8838s
            md.f r5 = r5.f8877g
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto L311
            goto L325
        L311:
            r1.c(r2, r3)
            goto L325
        L315:
            r3 = 0
            od.a r5 = r5.f13690m
            boolean r5 = r5.equals(r13)
            if (r5 != 0) goto L324
            r1.p(r2, r13)
            r2.d(r6)
        L324:
            r11 = r3
        L325:
            if (r10 == 0) goto L32a
            r2.j(r10)
        L32a:
            md.a r3 = md.a.f8844y
            md.f r5 = r0.f8877g
            boolean r3 = r5.a(r3)
            if (r3 == 0) goto L338
            r2.e(r12)
            goto L347
        L338:
            if (r10 == 0) goto L342
            od.d r3 = r10.f13717k
            java.lang.String r3 = r3.f9784n
            r2.e(r3)
            goto L347
        L342:
            java.lang.String r3 = r4.f9784n
            r2.e(r3)
        L347:
            r1.f(r2, r0, r11, r10)
            return
    }

    public final void n(fc.f r2, ud.p r3, java.util.Set r4, char r5) {
            r1 = this;
            fd.d r0 = fd.d.f3900g
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto Ld
            r0 = 40
            r2.d(r0)
        Ld:
            r2.d(r5)
            r5 = 0
            qd.l r3 = r3.S(r5)
            r5 = 1
            r1.b(r2, r3, r5)
            if (r4 == 0) goto L20
            r3 = 41
            r2.d(r3)
        L20:
            return
    }

    public final void o(fc.f r5, od.c r6) {
            r4 = this;
            ud.u r0 = r4.f3909c
            ud.g r0 = r0.h(r6)
            if (r0 == 0) goto L3b
            ud.e r1 = r0.f13706k
            md.a r2 = md.a.I
            md.f r3 = r0.f8877g
            boolean r2 = r3.a(r2)
            if (r2 == 0) goto L3b
            md.b r2 = md.b.f8853h
            md.f r3 = r1.f8877g
            boolean r2 = r3.b(r2)
            if (r2 == 0) goto L3b
            md.b r2 = md.b.f8856k
            md.f r3 = r0.f8877g
            oc.b r2 = r3.c(r2)
            md.h r2 = (md.h) r2
            if (r2 == 0) goto L3b
            ud.p r2 = r2.f8883h
            boolean r3 = r2 instanceof td.a
            if (r3 == 0) goto L3b
            md.a r6 = md.a.f8838s
            r0.w(r6)
            td.a r2 = (td.a) r2
            r4.g(r5, r1, r2)
            return
        L3b:
            fd.g r1 = r4.f3907a
            fd.a r1 = r1.f3915b
            m(r5, r6, r0, r1)
            return
    }

    public final void p(fc.f r2, od.a r3) {
            r1 = this;
            fd.g r0 = r1.f3907a
            fd.a r0 = r0.f3915b
            r0.o(r2, r3)
            return
    }

    public final void q(fc.f r2, qd.j r3) {
            r1 = this;
            fd.g r0 = r1.f3907a
            fd.a r0 = r0.f3915b
            r0.s(r2, r3)
            return
    }
}
