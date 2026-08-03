package qe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qe.n f10942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qe.x f10943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.List f10944i;

    static {
            java.lang.Class<qe.c> r0 = qe.c.class
            mh.d.b(r0)
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            qe.n r0 = new qe.n
            r0.<init>()
            r1.f10942g = r0
            return
    }

    public static ud.a j(ud.a r2) {
            md.a r0 = md.a.f8831m
            md.f r1 = r2.f8877g
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto Lb
            goto L30
        Lb:
            ud.p r0 = a.a.c0(r2)
            if (r0 == 0) goto L31
            pd.k r0 = r0.f13713k
            java.util.EnumSet r1 = ce.m.f1651g
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L31
            java.util.List r2 = r2.f13675m
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L30
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            ud.a r2 = (ud.a) r2
            ud.a r2 = j(r2)
            return r2
        L30:
            r2 = 0
        L31:
            return r2
    }

    public static boolean k(ud.r r1) {
            java.util.List r1 = r1.D
            java.util.Iterator r1 = r1.iterator()
        L6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r1.next()
            qd.s r0 = (qd.s) r0
            p4.t r0 = r0.f10930l
            java.lang.Object r0 = r0.f10224h
            qd.j r0 = (qd.j) r0
            boolean r0 = r0.w()
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L20:
            r1 = 1
            return r1
    }

    public static int l(ud.r r13, pd.q r14, boolean r15) {
            java.util.List r0 = r14.f13715m
            int r0 = r0.size()
            r1 = 0
            r2 = r1
            r3 = r2
        L9:
            if (r2 >= r0) goto L83
            qd.r r4 = r14.j0(r2)
            java.util.ArrayList r5 = r14.f10530o
            java.lang.Object r5 = r5.get(r2)
            ud.a r5 = (ud.a) r5
            ud.a r6 = j(r5)
            if (r6 != 0) goto L2b
            java.lang.String r14 = java.lang.String.valueOf(r5)
            java.lang.String r15 = "Failed to insert an additional move for type inference into block "
            java.lang.String r14 = r15.concat(r14)
            r13.I(r14)
            return r1
        L2b:
            qd.s r5 = r4.f10923m
            qd.r r7 = r5.f10927i
            ud.p r7 = r7.f0()
            pd.k r8 = pd.k.f10504m
            r9 = 1
            if (r7 == 0) goto L49
            pd.k r7 = r7.f13713k
            pd.k r10 = pd.k.f10498g
            if (r7 == r10) goto L80
            if (r7 != r8) goto L49
            java.util.ArrayList r5 = r5.f10928j
            int r5 = r5.size()
            if (r5 != r9) goto L49
            goto L80
        L49:
            int r3 = r3 + 1
            if (r15 == 0) goto L80
            qd.s r5 = r4.f10923m
            int r7 = r4.f10922l
            r10 = 0
            qd.j r11 = r4.f10902i
            qd.r r10 = r4.d0(r7, r11, r10)
            qd.s r11 = r13.b0(r10)
            qd.j r12 = r4.f10902i
            qd.r r5 = r4.d0(r7, r12, r5)
            ud.p r12 = new ud.p
            r12.<init>(r8, r9)
            r12.d0(r10)
            r12.I(r5)
            md.a r5 = md.a.f8831m
            r12.w(r5)
            java.util.ArrayList r5 = r6.f13674l
            r5.add(r12)
            qd.j r5 = r4.f10902i
            qd.r r5 = r4.d0(r7, r5, r11)
            r14.b0(r4, r5)
        L80:
            int r2 = r2 + 1
            goto L9
        L83:
            return r3
    }

    public static pd.j m(ud.r r6, qd.r r7, qd.j r8) {
            ud.p r0 = r7.f10903j
            if (r0 == 0) goto L55
            pd.k r1 = r0.f13713k
            pd.k r2 = pd.k.X
            if (r1 != r2) goto Lb
            goto L55
        Lb:
            pd.k r2 = pd.k.f10513v
            r3 = 1
            if (r1 != r2) goto L1b
            qd.l r1 = r0.S(r3)
            boolean r1 = r1.Q()
            if (r1 == 0) goto L1b
            goto L55
        L1b:
            java.util.List r1 = r6.f13732z
            ud.a r1 = a.a.S(r6, r0, r1)
            if (r1 != 0) goto L24
            goto L55
        L24:
            qd.r r6 = r7.e0(r6)
            qd.r r2 = r7.c0()
            pd.j r4 = new pd.j
            pd.k r5 = pd.k.A
            r4.<init>(r5, r8, r3)
            r4.d0(r6)
            r4.I(r2)
            md.a r6 = md.a.f8831m
            r4.w(r6)
            qd.r r6 = r4.f13714l
            qd.r r6 = r6.c0()
            r0.b0(r7, r6)
            int r6 = a.a.Y(r1, r0)
            r7 = -1
            if (r6 != r7) goto L4f
            goto L55
        L4f:
            java.util.ArrayList r7 = r1.f13674l
            r7.add(r6, r4)
            return r4
        L55:
            r6 = 0
            return r6
    }

    public static java.util.List n(qd.j r4, qd.s r5) {
            r4.getClass()
            boolean r0 = r4 instanceof qd.a
            if (r0 == 0) goto L2f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            qd.j r4 = r4.g()
            r0 = 0
            java.util.List r4 = n(r4, r0)
            java.util.Iterator r4 = r4.iterator()
        L19:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r4.next()
            qd.j r0 = (qd.j) r0
            qd.a r1 = new qd.a
            r1.<init>(r0)
            r5.add(r1)
            goto L19
        L2e:
            return r5
        L2f:
            if (r5 == 0) goto L58
            p4.t r5 = r5.f10930l
            java.lang.Object r5 = r5.f10225i
            java.util.LinkedHashSet r5 = (java.util.LinkedHashSet) r5
            java.util.Iterator r5 = r5.iterator()
        L3b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r0 = r5.next()
            qe.d r0 = (qe.d) r0
            qd.j r0 = r0.getType()
            boolean r1 = r0.v()
            if (r1 != 0) goto L55
            boolean r0 = r0 instanceof qd.a
            if (r0 == 0) goto L3b
        L55:
            java.util.List r4 = java.util.Collections.EMPTY_LIST
            return r4
        L58:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            qd.q[] r4 = r4.n()
            int r0 = r4.length
            r1 = 0
        L63:
            if (r1 >= r0) goto L76
            r2 = r4[r1]
            qd.q r3 = qd.q.f10917t
            if (r2 != r3) goto L6c
            goto L73
        L6c:
            qd.d r2 = qd.j.d(r2)
            r5.add(r2)
        L73:
            int r1 = r1 + 1
            goto L63
        L76:
            return r5
    }

    public static boolean q(ud.r r13, qd.s r14, boolean r15) {
            p4.t r0 = r14.f10930l
            java.lang.Object r0 = r0.f10224h
            qd.j r0 = (qd.j) r0
            boolean r0 = r0.w()
            r1 = 0
            if (r0 != 0) goto Ld5
            boolean r0 = r14.i()
            if (r0 == 0) goto L15
            goto Ld5
        L15:
            qd.r r0 = r14.f10927i
            ud.p r0 = r0.f10903j
            if (r0 != 0) goto L1d
            goto Ld5
        L1d:
            pd.k r2 = r0.f13713k
            pd.k r3 = pd.k.K
            if (r2 == r3) goto L29
            pd.k r3 = pd.k.M
            if (r2 == r3) goto L29
            goto Ld5
        L29:
            qd.r r0 = r0.f13714l
            qd.j r0 = r0.f10902i
            r2 = 1
            if (r15 == 0) goto Ld1
            java.util.ArrayList r15 = r14.f10928j
            java.util.Iterator r15 = r15.iterator()
            r3 = r1
        L37:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto Ld0
            java.lang.Object r4 = r15.next()
            qd.r r4 = (qd.r) r4
            ud.p r4 = r4.f10903j
            pd.k r5 = pd.k.O
            boolean r5 = xe.m.j(r4, r5)
            if (r5 != 0) goto L50
        L4d:
            r4 = r1
            goto Lcb
        L50:
            pd.n r4 = (pd.n) r4
            qd.l r5 = r4.k0()
            if (r5 == 0) goto L4d
            boolean r6 = r5 instanceof qd.r
            if (r6 == 0) goto L66
            r6 = r5
            qd.r r6 = (qd.r) r6
            qd.s r6 = r6.f10923m
            boolean r6 = java.util.Objects.equals(r6, r14)
            goto L67
        L66:
            r6 = r1
        L67:
            if (r6 != 0) goto L6a
            goto L4d
        L6a:
            ud.e r6 = r13.f13718l
            ud.u r6 = r6.f13688k
            fe.a r6 = r6.f13749h
            ud.m r6 = r6.g(r4)
            if (r6 != 0) goto L77
            goto L4d
        L77:
            java.util.List r4 = r4.f13715m
            java.util.Iterator r4 = r4.iterator()
            r7 = -1
            r8 = r1
        L7f:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto Lc8
            java.lang.Object r9 = r4.next()
            qd.l r9 = (qd.l) r9
            if (r9 != r5) goto L8e
            goto L7f
        L8e:
            int r7 = r7 + 1
            r9.getClass()
            boolean r10 = r9 instanceof qd.r
            if (r10 != 0) goto L98
            goto L7f
        L98:
            java.util.List r10 = r6.c()
            java.lang.Object r10 = r10.get(r7)
            qd.j r10 = (qd.j) r10
            qd.j r11 = r9.I()
            ud.e r12 = r13.f13718l
            ud.u r12 = r12.f13688k
            fe.a r12 = r12.f13750i
            qd.j r10 = r12.l(r0, r11, r10)
            if (r10 == 0) goto L7f
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L7f
            qd.r r9 = (qd.r) r9
            pd.j r9 = m(r13, r9, r10)
            if (r9 == 0) goto L7f
            md.a r10 = md.a.X
            r9.w(r10)
            int r8 = r8 + 1
            goto L7f
        Lc8:
            if (r8 <= 0) goto L4d
            r4 = r2
        Lcb:
            if (r4 == 0) goto L37
            r3 = r2
            goto L37
        Ld0:
            return r3
        Ld1:
            r14.n(r0)
            return r2
        Ld5:
            return r1
    }

    @Override // be.a
    public final java.lang.String e() {
            r1 = this;
            java.lang.String r0 = "FixTypesVisitor"
            return r0
    }

    @Override // be.a
    public final void f(ud.u r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            qe.x r2 = r1.f13748g
            r0.f10943h = r2
            qe.n r2 = r0.f10942g
            r2.f(r1)
            qe.b r1 = new qe.b
            r2 = 0
            r1.<init>(r0, r2)
            qe.b r3 = new qe.b
            r4 = 1
            r3.<init>(r0, r4)
            qe.b r5 = new qe.b
            r6 = 2
            r5.<init>(r0, r6)
            qe.b r7 = new qe.b
            r8 = 3
            r7.<init>(r0, r8)
            qe.b r9 = new qe.b
            r10 = 4
            r9.<init>(r0, r10)
            qe.b r11 = new qe.b
            r12 = 5
            r11.<init>(r0, r12)
            qe.b r13 = new qe.b
            r14 = 6
            r13.<init>(r0, r14)
            qe.b r15 = new qe.b
            r21 = r2
            r2 = 7
            r15.<init>(r0, r2)
            r16 = r2
            me.a r2 = new me.a
            r2.<init>(r0)
            r17 = r4
            qe.b r4 = new qe.b
            r18 = r6
            r6 = 8
            r4.<init>(r0, r6)
            r19 = r6
            r6 = 10
            java.util.function.Function[] r6 = new java.util.function.Function[r6]
            r6[r21] = r1
            r6[r17] = r3
            r6[r18] = r5
            r6[r8] = r7
            r6[r10] = r9
            r6[r12] = r11
            r6[r14] = r13
            r6[r16] = r15
            r6[r19] = r2
            r1 = 9
            r6[r1] = r4
            java.util.List r1 = java.util.Arrays.asList(r6)
            r0.f10944i = r1
            return
    }

    @Override // be.a
    public final void g(ud.r r3) {
            r2 = this;
            boolean r0 = r3.f13722p
            if (r0 != 0) goto L36
            boolean r0 = k(r3)
            if (r0 == 0) goto Lb
            goto L36
        Lb:
            java.util.List r0 = r2.f10944i     // Catch: java.lang.Exception -> L30
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L30
        L11:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Exception -> L30
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Exception -> L30
            java.util.function.Function r1 = (java.util.function.Function) r1     // Catch: java.lang.Exception -> L30
            java.lang.Object r1 = r1.apply(r3)     // Catch: java.lang.Exception -> L30
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L30
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L30
            if (r1 == 0) goto L11
            boolean r1 = k(r3)     // Catch: java.lang.Exception -> L30
            if (r1 == 0) goto L11
            goto L36
        L30:
            r0 = move-exception
            java.lang.String r1 = "Types fix failed"
            xe.h.a(r3, r1, r0)
        L36:
            return
    }

    public final boolean i(ud.r r4, qd.s r5) {
            r3 = this;
            p4.t r0 = r5.f10930l
            java.lang.Object r0 = r0.f10225i
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            java.util.Optional r0 = r3.o(r0)
            boolean r1 = r0.isPresent()
            if (r1 != 0) goto L11
            goto L2a
        L11:
            java.lang.Object r0 = r0.get()
            qd.j r0 = (qd.j) r0
            qe.x r1 = r3.f10943h
            r1.getClass()
            qe.a0 r2 = qe.a0.f10934b
            int r4 = r1.c(r4, r5, r0, r2)
            r5 = 1
            if (r4 != r5) goto L26
            goto L2a
        L26:
            r0 = 3
            if (r4 != r0) goto L2a
            return r5
        L2a:
            r4 = 0
            return r4
    }

    public final java.util.Optional o(java.util.LinkedHashSet r3) {
            r2 = this;
            java.util.stream.Stream r3 = r3.stream()
            me.a r0 = new me.a
            r1 = 9
            r0.<init>(r1)
            java.util.stream.Stream r3 = r3.map(r0)
            a7.b r0 = new a7.b
            r1 = 11
            r0.<init>(r1)
            java.util.stream.Stream r3 = r3.filter(r0)
            qe.x r0 = r2.f10943h
            qe.k r0 = r0.f11002c
            c9.a0 r0 = r0.f10962b
            java.util.Optional r3 = r3.max(r0)
            return r3
    }

    public final boolean p(ud.r r13) {
            r12 = this;
            java.util.List r0 = r13.D
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Lf1
            java.lang.Object r3 = r0.next()
            qd.s r3 = (qd.s) r3
            boolean r4 = r3.i()
            p4.t r5 = r3.f10930l
            r6 = 1
            if (r4 == 0) goto L20
        L1d:
            r3 = r1
            goto Lea
        L20:
            java.lang.Object r4 = r5.f10224h
            qd.j r4 = (qd.j) r4
            boolean r7 = r4.w()
            if (r7 == 0) goto L2b
            goto L1d
        L2b:
            boolean r7 = r12.i(r13, r3)     // Catch: java.lang.Exception -> L30 af.f -> Lef
            goto L3f
        L30:
            r7 = move-exception
            java.lang.String r8 = java.lang.String.valueOf(r3)
            java.lang.String r9 = "Failed to calculate best type for var: "
            java.lang.String r8 = r9.concat(r8)
            r13.M(r8, r7)
            r7 = r1
        L3f:
            if (r7 == 0) goto L44
        L41:
            r3 = r6
            goto Lea
        L44:
            java.util.List r4 = n(r4, r3)
            boolean r7 = r4.isEmpty()
            r8 = 3
            if (r7 == 0) goto L51
        L4f:
            r4 = r1
            goto L6f
        L51:
            java.util.Iterator r4 = r4.iterator()
        L55:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L4f
            java.lang.Object r7 = r4.next()
            qd.j r7 = (qd.j) r7
            qe.x r9 = r12.f10943h
            r9.getClass()
            qe.a0 r10 = qe.a0.f10934b
            int r7 = r9.c(r13, r3, r7, r10)
            if (r7 != r8) goto L55
            r4 = r6
        L6f:
            if (r4 == 0) goto L72
        L71:
            goto L41
        L72:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.lang.Object r5 = r5.f10225i
            java.util.LinkedHashSet r5 = (java.util.LinkedHashSet) r5
            java.util.Iterator r5 = r5.iterator()
        L7f:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L9f
            java.lang.Object r7 = r5.next()
            qe.d r7 = (qe.d) r7
            qd.j r7 = r7.getType()
            boolean r9 = r7.w()
            if (r9 == 0) goto L7f
            boolean r9 = r7.v()
            if (r9 == 0) goto L7f
            r4.add(r7)
            goto L7f
        L9f:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto La7
        La5:
            r3 = r1
            goto Le7
        La7:
            ud.e r5 = r13.f13718l
            ud.u r5 = r5.f13688k
            ed.c r5 = r5.f13760s
            java.util.Iterator r4 = r4.iterator()
        Lb1:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto La5
            java.lang.Object r7 = r4.next()
            qd.j r7 = (qd.j) r7
            java.lang.String r7 = r7.l()
            java.util.Set r7 = r5.d(r7)
            java.util.Iterator r7 = r7.iterator()
        Lc9:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto Lb1
            java.lang.Object r9 = r7.next()
            java.lang.String r9 = (java.lang.String) r9
            qd.j r9 = qd.j.x(r9)
            qe.x r10 = r12.f10943h
            r10.getClass()
            qe.a0 r11 = qe.a0.f10935c
            int r9 = r10.c(r13, r3, r9, r11)
            if (r9 != r8) goto Lc9
            r3 = r6
        Le7:
            if (r3 == 0) goto L1d
            goto L71
        Lea:
            if (r3 == 0) goto L8
            r2 = r6
            goto L8
        Lef:
            r13 = move-exception
            throw r13
        Lf1:
            return r2
    }
}
