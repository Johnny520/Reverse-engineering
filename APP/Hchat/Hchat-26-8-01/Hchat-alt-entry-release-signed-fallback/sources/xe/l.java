package xe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Object f21568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f21569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f21570c;

    public l(java.lang.reflect.Method r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3) {
            r0 = this;
            r0.<init>()
            r0.f21569b = r1
            r0.f21570c = r2
            r0.f21568a = r3
            return
    }

    public l(java.util.ArrayList r1) {
            r0 = this;
            r0.<init>()
            r0.f21568a = r1
            return
    }

    public l(ud.r r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f21569b = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f21570c = r1
            return
    }

    public static void d(ud.r r2, ud.p r3) {
            if (r3 != 0) goto L3
            return
        L3:
            md.a r0 = md.a.S
            md.f r1 = r3.f8877g
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto L11
            j(r2, r3)
            return
        L11:
            java.util.List r0 = r2.f13732z
            ud.a r0 = a.a.S(r2, r3, r0)
            if (r0 == 0) goto L20
            j(r2, r3)
            g(r2, r0, r3)
            return
        L20:
            md.a r0 = md.a.f8838s
            r3.w(r0)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "Not found block with instruction: "
            java.lang.String r3 = r0.concat(r3)
            r2.L(r3)
            return
    }

    public static void e(java.util.List r4, java.util.List r5) {
            if (r5 == 0) goto L2d
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9
            goto L2d
        L9:
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r5.next()
            ud.p r0 = (ud.p) r0
            int r1 = r4.size()
            r2 = 0
        L1e:
            if (r2 >= r1) goto Ld
            java.lang.Object r3 = r4.get(r2)
            if (r3 != r0) goto L2a
            r4.remove(r2)
            goto Ld
        L2a:
            int r2 = r2 + 1
            goto L1e
        L2d:
            return
    }

    public static void f(ud.r r6) {
            xe.l r0 = new xe.l
            r1 = 0
            r0.<init>(r6, r1)
            java.util.List r6 = r6.f13732z
            java.util.Iterator r6 = r6.iterator()
        Lc:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r6.next()
            ud.a r1 = (ud.a) r1
            java.util.ArrayList r2 = r1.f13674l
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r2.next()
            ud.p r3 = (ud.p) r3
            md.a r4 = md.a.f8840u
            md.f r5 = r3.f8877g
            boolean r4 = r5.a(r4)
            if (r4 == 0) goto L1e
            java.lang.Object r4 = r0.f21570c
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r4.add(r3)
            goto L1e
        L3c:
            java.util.ArrayList r1 = r1.f13674l
            r0.f21568a = r1
            r0.c()
            goto Lc
        L44:
            return
    }

    public static boolean g(ud.r r2, ud.a r3, ud.p r4) {
            java.util.ArrayList r0 = r3.f13674l
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            ud.p r1 = (ud.p) r1
            if (r1 != r4) goto L6
            r0.remove()
            r2 = 1
            return r2
        L19:
            md.a r0 = md.a.S
            md.f r1 = r4.f8877g
            boolean r0 = r1.a(r0)
            if (r0 != 0) goto L44
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to remove instruction: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " from block: "
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.L(r3)
        L44:
            r2 = 0
            return r2
    }

    public static void h(ud.r r2, ud.p r3) {
            java.util.List r0 = r3.f13715m
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            qd.l r1 = (qd.l) r1
            i(r2, r1)
            goto L6
        L16:
            pd.k r2 = r3.f13713k
            pd.k r0 = pd.k.X
            if (r2 != r0) goto L3a
            java.util.List r2 = r3.f13715m
            java.util.Iterator r2 = r2.iterator()
        L22:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r2.next()
            qd.l r0 = (qd.l) r0
            boolean r1 = r0 instanceof qd.r
            if (r1 == 0) goto L22
            qd.r r0 = (qd.r) r0
            qd.s r0 = r0.f10923m
            r0.p()
            goto L22
        L3a:
            md.a r2 = md.a.f8840u
            r3.w(r2)
            md.a r2 = md.a.f8838s
            r3.w(r2)
            return
    }

    public static void i(ud.r r1, qd.l r2) {
            boolean r0 = r2 instanceof qd.r
            if (r0 == 0) goto Le
            qd.r r2 = (qd.r) r2
            qd.s r1 = r2.f10923m
            if (r1 == 0) goto L19
            r1.k(r2)
            return
        Le:
            boolean r0 = r2 instanceof qd.m
            if (r0 == 0) goto L19
            qd.m r2 = (qd.m) r2
            ud.p r2 = r2.f10904l
            j(r1, r2)
        L19:
            return
    }

    public static void j(ud.r r0, ud.p r1) {
            h(r0, r1)
            l(r0, r1)
            md.a r0 = md.a.f8838s
            r1.w(r0)
            return
    }

    public static void k(ud.r r2, java.util.List r3) {
            ce.d r0 = new ce.d
            r1 = 6
            r0.<init>(r2, r1)
            r3.forEach(r0)
            ce.d r0 = new ce.d
            r1 = 7
            r0.<init>(r2, r1)
            r3.forEach(r0)
            return
    }

    public static void l(ud.r r6, ud.p r7) {
            qd.r r0 = r7.f13714l
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            if (r6 == 0) goto Lad
            qd.s r0 = r0.f10923m
            if (r0 == 0) goto Lad
            java.util.ArrayList r2 = r0.f10928j
            qd.r r3 = r0.f10927i
            ud.p r3 = r3.f10903j
            if (r3 != r7) goto Lad
            int r3 = r2.size()
            if (r3 != 0) goto L21
            java.util.List r6 = r6.D
            r6.remove(r0)
            goto Lad
        L21:
            ud.b r4 = new ud.b
            r5 = 4
            r4.<init>(r5)
            boolean r4 = be.h.g(r2, r4)
            if (r4 == 0) goto L52
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            java.util.Iterator r2 = r3.iterator()
        L36:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4c
            java.lang.Object r3 = r2.next()
            qd.r r3 = (qd.r) r3
            ud.p r4 = r3.f10903j
            if (r4 == 0) goto L36
            pd.q r4 = (pd.q) r4
            r4.l0(r3)
            goto L36
        L4c:
            java.util.List r6 = r6.D
            r6.remove(r0)
            goto Lad
        L52:
            ud.b r4 = new ud.b
            r5 = 5
            r4.<init>(r5)
            boolean r4 = be.h.g(r2, r4)
            if (r4 == 0) goto L77
            java.util.Iterator r2 = r2.iterator()
        L62:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L71
            java.lang.Object r3 = r2.next()
            qd.r r3 = (qd.r) r3
            r3.f10923m = r1
            goto L62
        L71:
            java.util.List r6 = r6.D
            r6.remove(r0)
            goto Lad
        L77:
            af.g r6 = new af.g
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.util.stream.Stream r0 = r2.stream()
            me.a r1 = new me.a
            r2 = 27
            r1.<init>(r2)
            java.util.stream.Stream r0 = r0.map(r1)
            java.lang.String r1 = "\n  "
            java.util.stream.Collector r1 = java.util.stream.Collectors.joining(r1)
            java.lang.Object r0 = r0.collect(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = ", still in use, count: "
            java.lang.String r2 = ", list:\n  "
            java.lang.String r4 = "Can't remove SSA var: "
            java.lang.StringBuilder r7 = eh.a.u(r3, r4, r7, r1, r2)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        Lad:
            r7.f13714l = r1
            return
    }

    public void a(ud.p r2) {
            r1 = this;
            java.lang.Object r0 = r1.f21570c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r2)
            java.lang.Object r0 = r1.f21569b
            ud.r r0 = (ud.r) r0
            j(r0, r2)
            return
    }

    public void b(java.util.List r5, java.util.function.Function r6) {
            r4 = this;
            java.lang.Object r0 = r4.f21568a
            java.util.List r0 = (java.util.List) r0
            boolean r1 = xe.s.h(r5)
            if (r1 == 0) goto Lc
            goto L89
        Lc:
            bc.j r1 = new bc.j
            r2 = 14
            r1.<init>(r6, r2)
            java.util.List r5 = be.h.K(r5, r1)
            java.util.stream.Stream r6 = r5.stream()
            me.a r1 = new me.a
            r2 = 28
            r1.<init>(r2)
            me.a r2 = new me.a
            r3 = 29
            r2.<init>(r3)
            java.util.stream.Collector r1 = java.util.stream.Collectors.toMap(r1, r2)
            java.lang.Object r6 = r6.collect(r1)
            java.util.Map r6 = (java.util.Map) r6
            java.util.Iterator r6 = r5.iterator()
            boolean r1 = r6.hasNext()
            if (r1 != 0) goto L95
            wb.kn r6 = new wb.kn
            r6.<init>(r0)
            xe.o r1 = xe.o.f21573g
            java.util.Comparator r6 = r6.thenComparing(r1)
            r5.sort(r6)
            java.util.IdentityHashMap r6 = new java.util.IdentityHashMap
            r6.<init>()
            r4.f21570c = r6
            ae.g r6 = new ae.g
            r1 = 21
            r6.<init>(r4, r1)
            r0.forEach(r6)
            ud.d r6 = new ud.d
            r6.<init>(r4)
            r5.forEach(r6)
            java.util.stream.Stream r6 = r5.stream()
            me.a r0 = new me.a
            r1 = 28
            r0.<init>(r1)
            java.util.stream.Stream r6 = r6.map(r0)
            java.util.stream.Collector r0 = java.util.stream.Collectors.toSet()
            java.lang.Object r6 = r6.collect(r0)
            java.util.Set r6 = (java.util.Set) r6
            r4.f21569b = r6
            java.util.Iterator r5 = r5.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L8a
        L89:
            return
        L8a:
            java.lang.Object r5 = r5.next()
            xe.p r5 = (xe.p) r5
            r5.getClass()
            r5 = 0
            throw r5
        L95:
            java.lang.Object r5 = r6.next()
            xe.p r5 = (xe.p) r5
            r5.getClass()
            r5 = 0
            throw r5
    }

    public void c() {
            r4 = this;
            java.lang.Object r0 = r4.f21569b
            ud.r r0 = (ud.r) r0
            java.lang.Object r1 = r4.f21570c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Lf
            return
        Lf:
            java.lang.Object r2 = r4.f21568a
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L29
            java.util.Iterator r2 = r1.iterator()
        L19:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r2.next()
            ud.p r3 = (ud.p) r3
            d(r0, r3)
            goto L19
        L29:
            k(r0, r1)
            java.lang.Object r0 = r4.f21568a
            java.util.List r0 = (java.util.List) r0
            e(r0, r1)
        L33:
            r1.clear()
            return
    }
}
