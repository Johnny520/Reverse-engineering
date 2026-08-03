package fd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.e f3887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fd.a f3888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b.e f3889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.HashSet f3894h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f3895i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3896j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public fd.h f3897k;

    public a(ud.e r8, bc.g r9) {
            r7 = this;
            boolean r3 = r9.f721p
            bc.b r0 = r9.E
            bc.b r1 = bc.b.f705i
            if (r0 != r1) goto Lb
            r0 = 1
        L9:
            r4 = r0
            goto Ld
        Lb:
            r0 = 0
            goto L9
        Ld:
            boolean r5 = r9.f720o
            int r6 = r9.V
            r2 = 0
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public a(ud.e r8, fd.a r9) {
            r7 = this;
            boolean r3 = r9.f3891e
            boolean r4 = r9.f3890d
            boolean r5 = r9.f3892f
            int r6 = r9.f3893g
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public a(ud.e r2, fd.a r3, boolean r4, boolean r5, boolean r6, int r7) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.f3894h = r0
            r1.f3887a = r2
            r1.f3888b = r3
            r1.f3890d = r5
            r1.f3891e = r4
            r1.f3892f = r6
            r1.f3893g = r7
            b.e r3 = new b.e
            r4 = 5
            r3.<init>(r2, r4, r1)
            r1.f3889c = r3
            return
    }

    public static boolean k(ud.u r5, od.a r6, od.a r7) {
            if (r6 != 0) goto L4
            r5 = 0
            return r5
        L4:
            java.lang.String r0 = r7.k()
            java.lang.String r1 = r6.k()
            boolean r1 = r1.equals(r0)
            r2 = 1
            if (r1 == 0) goto L14
            return r2
        L14:
            ud.e r1 = r5.f(r6)
            if (r1 == 0) goto L49
            java.util.List r1 = r1.f13699v
            java.util.Iterator r1 = r1.iterator()
        L20:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L49
            java.lang.Object r3 = r1.next()
            ud.e r3 = (ud.e) r3
            od.a r4 = r3.f13690m
            java.lang.String r4 = r4.k()
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L20
            od.a r3 = r3.f13690m
            java.lang.String r3 = r3.f()
            java.lang.String r4 = r7.f()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L20
            return r2
        L49:
            od.a r6 = r6.f9769k
            boolean r5 = k(r5, r6, r7)
            return r5
    }

    public static boolean m(od.a r2, od.a r3) {
            boolean r0 = r2.o()
            r1 = 0
            if (r0 == 0) goto L19
            od.a r2 = r2.f9769k
            boolean r0 = java.util.Objects.equals(r2, r3)
            if (r0 != 0) goto L17
            boolean r2 = m(r2, r3)
            if (r2 == 0) goto L16
            goto L17
        L16:
            return r1
        L17:
            r2 = 1
            return r2
        L19:
            return r1
    }

    public final void a(fc.f r12, boolean r13) {
            r11 = this;
            r0 = 123(0x7b, float:1.72E-43)
            r12.d(r0)
            ud.e r0 = r11.f3887a
            if (r13 == 0) goto L26
            bc.a r13 = bc.a.f700k
            boolean r13 = r0.N(r13)
            if (r13 == 0) goto L26
            od.a r13 = r0.f13690m
            java.lang.String r13 = r13.f9768j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " // from class: "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r12.e(r13)
        L26:
            r13 = 1
            r11.f3896j = r13
            java.lang.StringBuilder r1 = r12.f3882a
            int r1 = r1.length()
            r11.f3895i = r1
            r12.o()
            md.b r1 = md.b.f8850e
            md.f r2 = r0.f8877g
            oc.b r1 = r2.c(r1)
            nd.h r1 = (nd.h) r1
            r2 = 0
            if (r1 != 0) goto L43
            goto L112
        L43:
            java.util.List r3 = r1.f9370g
            java.util.Iterator r4 = r3.iterator()
            r5 = 0
        L4a:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Lbc
            java.lang.Object r6 = r4.next()
            nd.g r6 = (nd.g) r6
            ud.g r7 = r6.f9366a
            jd.c.b(r12, r7)
            ud.g r7 = r6.f9366a
            od.c r7 = r7.f13707l
            java.lang.String r7 = r7.f9776j
            r12.r(r7)
            td.a r7 = r6.f9367b
            ud.u r8 = r0.f13688k
            od.d r9 = r7.f13119o
            ud.r r8 = r8.i(r9)
            if (r8 == 0) goto L83
            md.b r9 = md.b.f8862q
            md.f r10 = r8.f8877g
            oc.b r9 = r10.c(r9)
            nd.g0 r9 = (nd.g0) r9
            if (r9 == 0) goto L83
            java.util.BitSet r9 = r9.f9369g
            int r9 = r9.cardinality()
            goto L84
        L83:
            r9 = r2
        L84:
            java.util.List r10 = r7.f13715m
            int r10 = r10.size()
            if (r10 <= r9) goto L9d
            if (r5 != 0) goto L9a
            ud.r r5 = r1.f9371h
            fd.g r9 = new fd.g
            r9.<init>(r11, r5)
            fd.e r5 = new fd.e
            r5.<init>(r9, r2)
        L9a:
            r5.f(r12, r7, r2, r8)
        L9d:
            ud.e r7 = r6.f9368c
            if (r7 == 0) goto Lb0
            r7 = 32
            r12.d(r7)
            fd.a r7 = new fd.a
            ud.e r6 = r6.f9368c
            r7.<init>(r6, r11)
            r7.a(r12, r13)
        Lb0:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L4a
            r6 = 44
            r12.d(r6)
            goto L4a
        Lbc:
            java.util.List r1 = r0.f13697t
            java.util.Iterator r1 = r1.iterator()
        Lc2:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Ld9
            java.lang.Object r4 = r1.next()
            ud.r r4 = (ud.r) r4
            md.a r5 = md.a.f8838s
            md.f r4 = r4.f8877g
            boolean r4 = r4.a(r5)
            if (r4 != 0) goto Lc2
            goto Lfb
        Ld9:
            boolean r1 = r11.n()
            if (r1 != 0) goto Lfb
            java.util.List r1 = r0.f13699v
            java.util.Iterator r1 = r1.iterator()
        Le5:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L112
            java.lang.Object r4 = r1.next()
            ud.e r4 = (ud.e) r4
            md.b r5 = md.b.f8853h
            md.f r4 = r4.f8877g
            boolean r4 = r4.b(r5)
            if (r4 != 0) goto Le5
        Lfb:
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L104
            r12.p()
        L104:
            r1 = 59
            r12.d(r1)
            boolean r1 = r11.n()
            if (r1 == 0) goto L112
            r12.f()
        L112:
            java.util.List r1 = r0.f13698u
            java.util.Iterator r1 = r1.iterator()
        L118:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L128
            java.lang.Object r3 = r1.next()
            ud.g r3 = (ud.g) r3
            r11.c(r12, r3)
            goto L118
        L128:
            java.util.List r1 = r0.f13699v
            java.util.List r0 = r0.f13697t
            r3 = 2
            java.util.List[] r3 = new java.util.List[r3]
            r3[r2] = r1
            r3[r13] = r0
            java.util.stream.Stream r13 = java.util.stream.Stream.of(r3)
            ae.d r0 = new ae.d
            r1 = 4
            r0.<init>(r1)
            java.util.stream.Stream r13 = r13.flatMap(r0)
            be.i r0 = new be.i
            r1 = 13
            r0.<init>(r11, r1)
            java.util.stream.Stream r13 = r13.filter(r0)
            ae.a r0 = new ae.a
            r1 = 9
            r0.<init>(r1)
            java.util.Comparator r0 = java.util.Comparator.comparingInt(r0)
            java.util.stream.Stream r13 = r13.sorted(r0)
            be.w r0 = new be.w
            r0.<init>(r11, r1, r12)
            r13.forEach(r0)
            r12.n()
            r12.q()
            ic.c r13 = ic.c.f6653g
            r12.j(r13)
            return
    }

    public final void b(fc.f r8) {
            r7 = this;
            ud.e r0 = r7.f3887a
            b5.k r1 = r0.f13692o
            od.a r2 = r0.f13690m
            boolean r3 = r1.d()
            r4 = 1024(0x400, float:1.435E-42)
            r5 = 8
            if (r3 == 0) goto L19
            b5.k r1 = r1.m(r4)
            b5.k r1 = r1.m(r5)
            goto L2d
        L19:
            boolean r3 = r1.b()
            if (r3 == 0) goto L2d
            r3 = 16
            b5.k r1 = r1.m(r3)
            b5.k r1 = r1.m(r4)
            b5.k r1 = r1.m(r5)
        L2d:
            boolean r3 = r2.o()
            if (r3 != 0) goto L3c
            b5.k r1 = r1.m(r5)
            r3 = 2
            b5.k r1 = r1.m(r3)
        L3c:
            int r3 = r1.f488b
            jd.c.b(r8, r0)
            boolean r4 = r2.n()
            if (r4 == 0) goto L50
            qd.j r4 = r2.f9765g
            java.lang.String r4 = r4.l()
            jd.c.f(r8, r0, r4)
        L50:
            jd.c.d(r8, r0)
            bc.a r4 = bc.a.f700k
            boolean r5 = r0.N(r4)
            if (r5 != 0) goto L5c
            goto L82
        L5c:
            oc.c r5 = oc.c.f9757c
            md.f r6 = r0.f8877g
            oc.b r5 = r6.c(r5)
            pc.k r5 = (pc.k) r5
            if (r5 == 0) goto L82
            java.lang.String r5 = r5.f10473g
            ud.e r6 = r0.a0()
            od.a r6 = r6.f13690m
            java.lang.String r6 = r6.f9766h
            boolean r6 = r6.contains(r5)
            if (r6 == 0) goto L79
            goto L82
        L79:
            java.lang.String r6 = "compiled from: "
            java.lang.String r5 = r6.concat(r5)
            jd.c.e(r8, r5)
        L82:
            boolean r5 = r0.N(r4)
            if (r5 == 0) goto Lb8
            jf.b r5 = r0.f13689l
            if (r5 == 0) goto Lb8
            ac.k r5 = r5.f6866a
            java.lang.Object r5 = r5.f179j
            ff.e r5 = (ff.e) r5
            java.lang.String r5 = r5.f3932b
            if (r5 == 0) goto Lb8
            ud.e r6 = r0.P()
            if (r6 == 0) goto Laf
            jf.b r6 = r6.f13689l
            if (r6 == 0) goto Laf
            ac.k r6 = r6.f6866a
            java.lang.Object r6 = r6.f179j
            ff.e r6 = (ff.e) r6
            java.lang.String r6 = r6.f3932b
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto Laf
            goto Lb8
        Laf:
            java.lang.String r6 = "loaded from: "
            java.lang.String r5 = r6.concat(r5)
            jd.c.e(r8, r5)
        Lb8:
            b.e r5 = r7.f3889c
            java.lang.Object r6 = r5.f332h
            ud.e r6 = (ud.e) r6
            r5.i(r6, r8)
            int r5 = r0.f9389i
            r8.s(r5)
            boolean r4 = r0.N(r4)
            java.lang.String r4 = r1.j(r4)
            r8.e(r4)
            boolean r4 = r1.d()
            if (r4 == 0) goto Le6
            r1 = r3 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto Le0
            r1 = 64
            r8.d(r1)
        Le0:
            java.lang.String r1 = "interface "
            r8.e(r1)
            goto Lf7
        Le6:
            boolean r1 = r1.b()
            if (r1 == 0) goto Lf2
            java.lang.String r1 = "enum "
            r8.e(r1)
            goto Lf7
        Lf2:
            java.lang.String r1 = "class "
            r8.e(r1)
        Lf7:
            r8.k(r0)
            java.lang.String r1 = r2.k()
            r8.e(r1)
            java.util.List r1 = r0.f13695r
            r2 = 1
            r7.d(r8, r1, r2)
            r1 = 32
            r8.d(r1)
            qd.j r2 = r0.f13693p
            java.lang.String r4 = "extends "
            if (r2 == 0) goto L12d
            qd.e r5 = qd.j.f10877k
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L12d
            md.a r5 = md.a.f8841v
            md.f r6 = r0.f8877g
            boolean r5 = r6.a(r5)
            if (r5 != 0) goto L12d
            r8.e(r4)
            r7.p(r8, r2)
            r8.d(r1)
        L12d:
            java.util.List r2 = r0.f13694q
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L177
            r2 = r3 & 8192(0x2000, float:1.148E-41)
            if (r2 == 0) goto L13a
            return
        L13a:
            b5.k r2 = r0.f13692o
            boolean r2 = r2.d()
            if (r2 == 0) goto L146
            r8.e(r4)
            goto L14b
        L146:
            java.lang.String r2 = "implements "
            r8.e(r2)
        L14b:
            java.util.List r2 = r0.f13694q
            java.util.Iterator r2 = r2.iterator()
        L151:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L16c
            java.lang.Object r3 = r2.next()
            qd.j r3 = (qd.j) r3
            r7.p(r8, r3)
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L151
            java.lang.String r3 = ", "
            r8.e(r3)
            goto L151
        L16c:
            java.util.List r0 = r0.f13694q
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L177
            r8.d(r1)
        L177:
            return
    }

    public final void c(fc.f r12, ud.g r13) {
            r11 = this;
            md.f r0 = r13.f8877g
            od.c r1 = r13.f13707l
            md.a r2 = md.a.f8838s
            boolean r0 = r0.a(r2)
            if (r0 == 0) goto Ld
            return
        Ld:
            oc.c r0 = oc.c.f9755a
            md.f r2 = r13.f8877g
            boolean r0 = r2.b(r0)
            if (r0 != 0) goto L31
            md.b r0 = md.b.f8849d
            md.f r2 = r13.f8877g
            boolean r0 = r2.b(r0)
            if (r0 != 0) goto L31
            md.b r0 = md.b.f8846a
            md.f r2 = r13.f8877g
            boolean r0 = r2.b(r0)
            if (r0 != 0) goto L31
            boolean r0 = r1.b()
            if (r0 == 0) goto L34
        L31:
            r12.f()
        L34:
            jd.c.b(r12, r13)
            boolean r0 = r1.b()
            if (r0 == 0) goto L42
            java.lang.String r0 = r1.f9774h
            jd.c.f(r12, r13, r0)
        L42:
            b.e r0 = r11.f3889c
            r0.i(r13, r12)
            b5.k r2 = r13.f13708m
            bc.a r3 = bc.a.f700k
            boolean r3 = r13.N(r3)
            java.lang.String r2 = r2.j(r3)
            r12.r(r2)
            qd.j r2 = r13.f13709n
            r11.s(r12, r2)
            r2 = 32
            r12.d(r2)
            r12.k(r13)
            java.lang.String r1 = r1.f9776j
            r12.e(r1)
            md.b r1 = md.b.f8856k
            md.f r2 = r13.f8877g
            oc.b r1 = r2.c(r1)
            md.h r1 = (md.h) r1
            java.lang.String r2 = " = "
            ud.e r3 = r11.f3887a
            if (r1 == 0) goto L9d
            ud.r r13 = r1.f8882g
            fd.g r0 = new fd.g
            r0.<init>(r11, r13)
            fd.e r13 = new fd.e
            r4 = 0
            r13.<init>(r0, r4)
            r12.e(r2)
            ud.p r0 = r1.f8883h
            fd.d r1 = fd.d.f3901h     // Catch: java.lang.Exception -> L91
            r13.j(r0, r12, r1)     // Catch: java.lang.Exception -> L91
            goto L11c
        L91:
            r0 = move-exception
            r13 = r0
            r3.getClass()
            java.lang.String r0 = "Failed to generate init code"
            xe.h.a(r3, r0, r13)
            goto L11c
        L9d:
            oc.c r1 = oc.c.f9760f
            md.f r4 = r13.f8877g
            oc.b r1 = r4.c(r1)
            nc.a r1 = (nc.a) r1
            if (r1 == 0) goto L11c
            r12.e(r2)
            int r2 = r1.f9341g
            r4 = 1
            boolean r9 = r11.f3890d
            if (r2 != r4) goto Lc8
            qd.j r7 = r13.f13709n
            mh.b r13 = fd.j.f3921a
            ud.u r13 = r3.n()
            xe.q r8 = r13.f13744c
            r10 = 0
            r5 = 0
            java.lang.String r13 = fd.j.a(r5, r7, r8, r9, r10)
            r12.e(r13)
            goto L11c
        Lc8:
            java.lang.Object r2 = a7.a.n(r1)
            boolean r4 = r2 instanceof qd.n
            if (r4 == 0) goto L117
            qd.n r2 = (qd.n) r2
            long r5 = r2.f10905l
            qd.j r7 = r13.f13709n
            int r13 = r11.f3893g
            r0 = 2
            if (r13 == r0) goto L106
            mh.b r13 = ye.f.f22435a
            qd.g r13 = qd.j.f10868b
            boolean r13 = r7.equals(r13)
            if (r13 == 0) goto L106
            ud.e r13 = r3.f13701x
            if (r13 == 0) goto L106
            od.a r13 = r13.f13690m
            java.lang.String r13 = r13.k()
            java.lang.String r0 = "R"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L106
            java.lang.Long r13 = java.lang.Long.valueOf(r5)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r0 = "0x%08x"
            java.lang.String r13 = java.lang.String.format(r0, r13)
            goto L113
        L106:
            mh.b r13 = fd.j.f3921a
            ud.u r13 = r3.n()
            xe.q r8 = r13.f13744c
            r10 = 0
            java.lang.String r13 = fd.j.a(r5, r7, r8, r9, r10)
        L113:
            r12.e(r13)
            goto L11c
        L117:
            ud.u r13 = r3.f13688k
            r0.q(r13, r12, r1)
        L11c:
            r13 = 59
            r12.d(r13)
            return
    }

    public final boolean d(fc.f r6, java.util.List r7, boolean r8) {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L9e
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto Lb
            goto L9e
        Lb:
            r1 = 60
            r6.d(r1)
            java.util.Iterator r7 = r7.iterator()
        L14:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L97
            java.lang.Object r1 = r7.next()
            qd.j r1 = (qd.j) r1
            if (r0 == 0) goto L27
            java.lang.String r2 = ", "
            r6.e(r2)
        L27:
            r1.getClass()
            boolean r2 = r1 instanceof qd.c
            if (r2 == 0) goto L36
            java.lang.String r2 = r1.l()
            r6.e(r2)
            goto L39
        L36:
            r5.p(r6, r1)
        L39:
            java.util.List r1 = r1.i()
            if (r1 == 0) goto L93
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L93
            java.lang.String r2 = " extends "
            r6.e(r2)
            java.util.Iterator r1 = r1.iterator()
        L4e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L93
            java.lang.Object r2 = r1.next()
            qd.j r2 = (qd.j) r2
            r2.getClass()
            boolean r3 = r2 instanceof qd.c
            if (r3 == 0) goto L69
            java.lang.String r2 = r2.l()
            r6.e(r2)
            goto L87
        L69:
            r5.p(r6, r2)
            if (r8 == 0) goto L87
            ud.e r3 = r5.f3887a
            od.a r4 = r3.f13690m
            boolean r4 = r4.o()
            if (r4 != 0) goto L87
            ud.u r3 = r3.f13688k
            bc.g r4 = r3.f13742a
            boolean r4 = r4.f721p
            if (r4 == 0) goto L87
            od.a r2 = od.a.e(r3, r2)
            r5.f(r2)
        L87:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4e
            java.lang.String r2 = " & "
            r6.e(r2)
            goto L4e
        L93:
            int r0 = r0 + 1
            goto L14
        L97:
            r7 = 62
            r6.d(r7)
            r6 = 1
            return r6
        L9e:
            return r0
    }

    public final void e(fc.f r6, qd.j r7) {
            r5 = this;
            java.util.List r7 = r7.j()
            if (r7 == 0) goto L42
            r0 = 60
            r6.d(r0)
            int r0 = r7.size()
            r1 = 0
        L10:
            if (r1 >= r0) goto L3d
            if (r1 == 0) goto L19
            java.lang.String r2 = ", "
            r6.e(r2)
        L19:
            java.lang.Object r2 = r7.get(r1)
            qd.j r2 = (qd.j) r2
            qd.j r3 = r2.r()
            if (r3 == 0) goto L37
            int r2 = r2.q()
            java.lang.String r4 = p.a.d(r2)
            r6.e(r4)
            r4 = 2
            if (r2 == r4) goto L3a
            r5.s(r6, r3)
            goto L3a
        L37:
            r5.s(r6, r2)
        L3a:
            int r1 = r1 + 1
            goto L10
        L3d:
            r7 = 62
            r6.d(r7)
        L42:
            return
    }

    public final void f(od.a r2) {
            r1 = this;
            fd.a r0 = r1.f3888b
            if (r0 == 0) goto L8
            r0.f(r2)
            return
        L8:
            java.util.HashSet r0 = r1.f3894h
            r0.add(r2)
            return
    }

    public final void g(fc.b r5) {
            r4 = this;
            java.util.HashSet r0 = r4.f3894h
            int r1 = r0.size()
            if (r1 == 0) goto L2b
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            com.alibaba.fastjson2.writer.b r2 = new com.alibaba.fastjson2.writer.b
            r3 = 19
            r2.<init>(r3)
            java.util.Comparator r2 = java.util.Comparator.comparing(r2)
            r1.sort(r2)
            be.w r2 = new be.w
            r3 = 8
            r2.<init>(r4, r3, r5)
            r1.forEach(r2)
            r5.f()
            r0.clear()
        L2b:
            return
    }

    public final void h(fc.f r3, qd.j r4) {
            r2 = this;
            qd.j r0 = r4.k()
            qd.j r1 = r0.m()
            if (r1 == 0) goto L16
            r2.r(r3, r4, r1)
            r4 = 46
            r3.d(r4)
            r2.h(r3, r0)
            return
        L16:
            r2.r(r3, r4, r0)
            return
    }

    public final void i(fc.f r3, ud.r r4) {
            r2 = this;
            jd.c.b(r3, r4)
            jd.c.d(r3, r4)
            boolean r0 = r4.f13722p
            if (r0 == 0) goto L18
            fd.g r0 = new fd.g
            r0.<init>(r2, r4)
            r0.b(r3)
            r4 = 59
            r3.d(r4)
            return
        L18:
            md.a r0 = md.a.Z
            md.f r1 = r4.f8877g
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto L27
            boolean r1 = r2.f3892f
            if (r1 == 0) goto L27
            r0 = 0
        L27:
            if (r0 != 0) goto L3e
            boolean r0 = r2.f3890d
            if (r0 != 0) goto L3e
            md.b r0 = md.b.f8848c
            md.f r1 = r4.f8877g
            boolean r0 = r1.b(r0)
            if (r0 == 0) goto L38
            goto L3e
        L38:
            fd.g r0 = new fd.g
            r0.<init>(r2, r4)
            goto L42
        L3e:
            fd.g r0 = fd.g.h(r4)
        L42:
            boolean r4 = r0.b(r3)
            if (r4 == 0) goto L4d
            r4 = 32
            r3.d(r4)
        L4d:
            r4 = 123(0x7b, float:1.72E-43)
            r3.d(r4)
            r3.o()
            r0.d(r3)
            r3.n()
            r3.q()
            ic.c r4 = ic.c.f6653g
            r3.j(r4)
            return
    }

    public final void j(fc.b r3) {
            r2 = this;
            ud.e r0 = r2.f3887a
            od.a r1 = r0.f13690m
            java.lang.String r1 = r1.j()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L14
            java.lang.String r0 = "// default package"
            r3.e(r0)
            return
        L14:
            java.lang.String r1 = "package "
            r3.e(r1)
            od.a r0 = r0.f13690m
            java.lang.String r0 = r0.j()
            r3.e(r0)
            r0 = 59
            r3.d(r0)
            return
    }

    public final java.util.Set l() {
            r1 = this;
            fd.a r0 = r1.f3888b
            if (r0 == 0) goto L9
            java.util.Set r0 = r0.l()
            return r0
        L9:
            java.util.HashSet r0 = r1.f3894h
            return r0
    }

    public final boolean n() {
            r3 = this;
            ud.e r0 = r3.f3887a
            java.util.List r0 = r0.f13698u
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            ud.g r1 = (ud.g) r1
            md.a r2 = md.a.f8838s
            md.f r1 = r1.f8877g
            boolean r1 = r1.a(r2)
            if (r1 != 0) goto L8
            r0 = 1
            return r0
        L20:
            r0 = 0
            return r0
    }

    public final void o(fc.f r3, od.a r4) {
            r2 = this;
            ud.e r0 = r2.f3887a
            ud.u r1 = r0.f13688k
            ud.e r1 = r1.f(r4)
            if (r1 == 0) goto L19
            r3.j(r1)
            od.a r4 = r1.f13690m
            od.a r0 = r0.f13690m
            java.lang.String r4 = r2.q(r0, r4)
            r3.e(r4)
            return
        L19:
            od.a r0 = r0.f13690m
            java.lang.String r4 = r2.q(r0, r4)
            r3.e(r4)
            return
    }

    public final void p(fc.f r2, qd.j r3) {
            r1 = this;
            qd.j r0 = r3.m()
            if (r0 == 0) goto L12
            r1.p(r2, r0)
            r0 = 46
            r2.d(r0)
            r1.h(r2, r3)
            return
        L12:
            ud.e r0 = r1.f3887a
            ud.u r0 = r0.f13688k
            od.a r0 = od.a.e(r0, r3)
            r1.o(r2, r0)
            r1.e(r2, r3)
            return
    }

    public final java.lang.String q(od.a r8, od.a r9) {
            r7 = this;
            java.lang.String r0 = r9.f()
            boolean r1 = r7.f3890d
            if (r1 != 0) goto L126
            boolean r1 = r7.f3891e
            if (r1 != 0) goto Le
            goto L126
        Le:
            java.lang.String r1 = r9.k()
            boolean r2 = r8.equals(r9)
            if (r2 == 0) goto L1a
            goto Ld9
        L1a:
            java.lang.String r2 = r9.j()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L26
            goto Ld9
        L26:
            boolean r2 = m(r8, r9)
            if (r2 == 0) goto L2e
            goto Ld9
        L2e:
            boolean r2 = r9.o()
            r3 = 0
            java.lang.String r4 = "."
            if (r2 == 0) goto L6f
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r9)
            od.a r9 = r9.f9769k
        L41:
            if (r9 == 0) goto L54
            if (r9 == r8) goto L52
            boolean r1 = m(r8, r9)
            if (r1 == 0) goto L4c
            goto L52
        L4c:
            r0.add(r9)
            od.a r9 = r9.f9769k
            goto L41
        L52:
            r8 = r3
            goto L55
        L54:
            r8 = 1
        L55:
            java.util.Collections.reverse(r0)
            if (r8 == 0) goto L63
            java.lang.Object r8 = r0.get(r3)
            od.a r8 = (od.a) r8
            r7.f(r8)
        L63:
            com.alibaba.fastjson2.writer.b r8 = new com.alibaba.fastjson2.writer.b
            r9 = 20
            r8.<init>(r9)
            java.lang.String r8 = xe.s.k(r0, r4, r8)
            return r8
        L6f:
            ud.e r2 = r7.f3887a
            ud.u r5 = r2.f13688k
            boolean r5 = k(r5, r8, r9)
            if (r5 != 0) goto L126
            ud.u r2 = r2.f13688k
            java.lang.String r5 = r8.j()
            java.lang.String r6 = r9.j()
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L8a
            goto L9a
        L8a:
            java.lang.String r3 = r9.k()
            ed.c r2 = r2.f13760s
            java.lang.String r3 = wb.en.h(r5, r4, r3)
            java.util.HashMap r2 = r2.f2714b
            boolean r3 = r2.containsKey(r3)
        L9a:
            if (r3 == 0) goto L9e
            goto L126
        L9e:
            od.a r2 = r8.m()
            od.a r3 = r9.m()
            if (r2 == 0) goto Lad
            boolean r2 = r2.equals(r3)
            goto Lb1
        Lad:
            boolean r2 = r8.equals(r3)
        Lb1:
            if (r2 == 0) goto Lb4
            goto Ld9
        Lb4:
            java.lang.String r2 = r9.l()
            java.lang.String r3 = "java.lang"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lc5
            od.a r2 = r9.f9769k
            if (r2 != 0) goto Lc5
            goto Ld9
        Lc5:
            java.lang.String r2 = r9.l()
            java.lang.String r3 = r8.l()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lda
            boolean r2 = r9.o()
            if (r2 != 0) goto Lda
        Ld9:
            return r1
        Lda:
            java.lang.String r2 = r9.j()
            java.lang.String r3 = r8.j()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lec
            java.lang.String r0 = r9.i()
        Lec:
            java.util.Set r2 = r7.l()
            java.util.Iterator r2 = r2.iterator()
        Lf4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L122
            java.lang.Object r3 = r2.next()
            od.a r3 = (od.a) r3
            boolean r5 = r3.equals(r9)
            if (r5 != 0) goto Lf4
            java.lang.String r3 = r3.k()
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto Lf4
            boolean r2 = r9.o()
            if (r2 == 0) goto L121
            od.a r9 = r9.f9769k
            java.lang.String r8 = r7.q(r8, r9)
            java.lang.String r8 = wb.en.h(r8, r4, r1)
            return r8
        L121:
            return r0
        L122:
            r7.f(r9)
            return r1
        L126:
            return r0
    }

    public final void r(fc.f r3, qd.j r4, qd.j r5) {
            r2 = this;
            java.lang.String r0 = r5.l()
            java.lang.String r1 = "."
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L11
            java.lang.String r4 = r5.l()
            goto L15
        L11:
            java.lang.String r4 = r4.l()
        L15:
            ud.e r0 = r2.f3887a
            ud.u r1 = r0.f13688k
            od.a r4 = od.a.d(r1, r4)
            ud.u r0 = r0.f13688k
            ud.e r0 = r0.f(r4)
            if (r0 == 0) goto L28
            r3.j(r0)
        L28:
            java.lang.String r4 = r4.k()
            r3.e(r4)
            r2.e(r3, r5)
            return
    }

    public final void s(fc.f r3, qd.j r4) {
            r2 = this;
            qd.q r0 = r4.o()
            if (r0 != 0) goto Le
            java.lang.String r4 = r4.toString()
            r3.e(r4)
            return
        Le:
            qd.q r1 = qd.q.f10915r
            if (r0 != r1) goto L22
            boolean r0 = r4 instanceof qd.c
            if (r0 == 0) goto L1e
            java.lang.String r4 = r4.l()
            r3.e(r4)
            return
        L1e:
            r2.p(r3, r4)
            return
        L22:
            qd.q r1 = qd.q.f10916s
            if (r0 != r1) goto L33
            qd.j r4 = r4.g()
            r2.s(r3, r4)
            java.lang.String r4 = "[]"
            r3.e(r4)
            return
        L33:
            java.lang.String r4 = r0.f10920h
            r3.e(r4)
            return
    }
}
