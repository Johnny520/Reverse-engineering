package fd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements r1.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f3919h;

    public h() {
            r5 = this;
            r5.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f3919h = r0
            wc.a r1 = new wc.a
            r1.<init>()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.Boolean[] r3 = new java.lang.Boolean[]{r2, r3}
            java.util.List r3 = java.util.Arrays.asList(r3)
            r1.f20775c = r3
            me.a r3 = new me.a
            r4 = 21
            r3.<init>(r4)
            r1.f20777e = r3
            me.a r3 = new me.a
            r4 = 22
            r3.<init>(r4)
            r1.f20776d = r3
            r0.add(r1)
            java.lang.String r3 = "verify dex file checksum before load"
            r1.f20774b = r3
            r1.f20779g = r2
            ae.g r2 = new ae.g
            r3 = 8
            r2.<init>(r5, r3)
            r1.f20778f = r2
            java.util.Iterator r0 = r0.iterator()
        L45:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L96
            java.lang.Object r1 = r0.next()
            wc.a r1 = (wc.a) r1
            java.lang.String r2 = r1.f20773a
            java.lang.String r3 = r1.f20774b
            if (r3 == 0) goto L8b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L8b
            me.a r3 = r1.f20776d
            if (r3 == 0) goto L80
            me.a r3 = r1.f20777e
            if (r3 == 0) goto L75
            ae.g r1 = r1.f20778f
            if (r1 == 0) goto L6a
            goto L45
        L6a:
            java.lang.String r0 = "Setter should be set for option: "
            java.lang.String r0 = wb.en.g(r0, r2)
            j8.o.t(r0)
            r0 = 0
            throw r0
        L75:
            java.lang.String r0 = "Formatter should be set for option: "
            java.lang.String r0 = wb.en.g(r0, r2)
            j8.o.t(r0)
            r0 = 0
            throw r0
        L80:
            java.lang.String r0 = "Parser should be set for option: "
            java.lang.String r0 = wb.en.g(r0, r2)
            j8.o.t(r0)
            r0 = 0
            throw r0
        L8b:
            java.lang.String r0 = "Description should be set for option: "
            java.lang.String r0 = wb.en.g(r0, r2)
            j8.o.t(r0)
            r0 = 0
            throw r0
        L96:
            return
    }

    public h(fd.a r5, ud.r r6) {
            r4 = this;
            r4.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r4.f3919h = r0
            boolean r1 = r5.f3890d
            r4.f3918g = r1
            fd.h r5 = r5.f3897k
            if (r5 == 0) goto L19
            java.lang.Object r5 = r5.f3919h
            java.util.HashSet r5 = (java.util.HashSet) r5
            r0.addAll(r5)
        L19:
            ud.e r5 = r6.f13718l
            java.util.List r1 = r5.f13698u
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()
            ud.g r2 = (ud.g) r2
            b5.k r3 = r2.f13708m
            boolean r3 = r3.h()
            if (r3 == 0) goto L21
            od.c r2 = r2.f13707l
            java.lang.String r2 = r2.f9776j
            r0.add(r2)
            goto L21
        L3d:
            java.util.List r5 = r5.f13699v
            java.util.Iterator r5 = r5.iterator()
        L43:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L59
            java.lang.Object r1 = r5.next()
            ud.e r1 = (ud.e) r1
            od.a r1 = r1.f13690m
            java.lang.String r1 = r1.k()
            r0.add(r1)
            goto L43
        L59:
            ud.e r5 = r6.f13718l
            ud.u r5 = r5.f13688k
            xe.e r5 = r5.f13747f
            java.lang.Object r5 = r5.f21559b
            java.util.Set r5 = (java.util.Set) r5
            r0.addAll(r5)
            return
    }

    public /* synthetic */ h(java.lang.Object r1, boolean r2) {
            r0 = this;
            r0.f3919h = r1
            r0.f3918g = r2
            r0.<init>()
            return
    }

    @Override // r1.a
    public long M0(long r1, long r3, int r5) {
            r0 = this;
            boolean r1 = r0.f3918g
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.f3919h
            m.o2 r1 = (m.o2) r1
            m.i2 r2 = r1.f8305a
            boolean r2 = r2.a()
            if (r2 == 0) goto L11
            goto L28
        L11:
            m.i2 r2 = r1.f8305a
            float r3 = r1.g(r3)
            float r3 = r1.d(r3)
            float r2 = r2.e(r3)
            float r2 = r1.d(r2)
            long r1 = r1.h(r2)
            return r1
        L28:
            r1 = 0
            return r1
    }

    public java.lang.String a(qd.k r6) {
            r5 = this;
            boolean r0 = r5.f3918g
            java.lang.String r1 = "r"
            r2 = 0
            java.lang.String r3 = "v"
            if (r0 == 0) goto L21
            java.util.List r6 = r6.f10896c
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L12
            return r3
        L12:
            java.lang.Object r6 = r6.get(r2)
            qd.s r6 = (qd.s) r6
            qd.r r6 = r6.f10927i
            int r6 = r6.f10922l
            java.lang.String r6 = eh.a.l(r6, r1)
            return r6
        L21:
            boolean r0 = r6.f10898e
            if (r0 == 0) goto L28
            java.lang.String r6 = "this"
            return r6
        L28:
            java.lang.String r0 = r6.f10894a
            boolean r4 = kd.d.c(r0)
            if (r4 == 0) goto L31
            goto L49
        L31:
            java.util.List r0 = r6.f10896c
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L3a
            goto L48
        L3a:
            java.lang.Object r0 = r0.get(r2)
            qd.s r0 = (qd.s) r0
            qd.r r0 = r0.f10927i
            int r0 = r0.f10922l
            java.lang.String r3 = eh.a.l(r0, r1)
        L48:
            r0 = r3
        L49:
            java.lang.String r0 = r5.b(r0)
            r6.f10894a = r0
            return r0
    }

    public java.lang.String b(java.lang.String r5) {
            r4 = this;
            java.lang.Object r0 = r4.f3919h
            java.util.HashSet r0 = (java.util.HashSet) r0
            r1 = 2
            r2 = r5
        L6:
            boolean r3 = r0.contains(r2)
            if (r3 == 0) goto L1e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            int r1 = r1 + 1
            goto L6
        L1e:
            r0.add(r2)
            return r2
    }

    public void c(java.util.HashMap r7) {
            r6 = this;
            java.lang.Object r0 = r6.f3919h
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.next()
            wc.a r1 = (wc.a) r1
            java.lang.String r2 = r1.f20773a
            java.lang.Object r3 = r7.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = ", value: "
            if (r3 != 0) goto L23
            java.lang.Boolean r3 = r1.f20779g
            goto L29
        L23:
            me.a r5 = r1.f20776d     // Catch: java.lang.Exception -> L3e
            java.lang.Object r3 = r5.apply(r3)     // Catch: java.lang.Exception -> L3e
        L29:
            ae.g r1 = r1.f20778f     // Catch: java.lang.Exception -> L2f
            r1.accept(r3)     // Catch: java.lang.Exception -> L2f
            goto L8
        L2f:
            r7 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "Setter invoke failed for option: "
            java.lang.String r0 = bc.e.j(r1, r2, r4, r0)
            ah.a.p(r0, r7)
            return
        L3e:
            r7 = move-exception
            java.lang.String r0 = "Parse failed for option: "
            java.lang.String r0 = bc.e.j(r0, r2, r4, r3)
            ah.a.p(r0, r7)
        L48:
            return
    }

    @Override // r1.a
    public java.lang.Object m0(long r4, long r6, yf.c r8) {
            r3 = this;
            boolean r4 = r8 instanceof m.b2
            if (r4 == 0) goto L13
            r4 = r8
            m.b2 r4 = (m.b2) r4
            int r5 = r4.f8097j
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.f8097j = r5
            goto L18
        L13:
            m.b2 r4 = new m.b2
            r4.<init>(r3, r8)
        L18:
            java.lang.Object r5 = r4.f8095h
            int r8 = r4.f8097j
            r0 = 1
            if (r8 == 0) goto L2e
            if (r8 != r0) goto L27
            long r6 = r4.f8094g
            f8.i.I0(r5)
            goto L4d
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r4)
            r4 = 0
            return r4
        L2e:
            f8.i.I0(r5)
            boolean r5 = r3.f3918g
            r1 = 0
            if (r5 == 0) goto L55
            java.lang.Object r5 = r3.f3919h
            m.o2 r5 = (m.o2) r5
            boolean r8 = r5.f8313i
            if (r8 == 0) goto L40
            goto L51
        L40:
            r4.f8094g = r6
            r4.f8097j = r0
            java.lang.Object r5 = r5.a(r6, r4)
            xf.a r4 = xf.a.f21579g
            if (r5 != r4) goto L4d
            return r4
        L4d:
            u2.q r5 = (u2.q) r5
            long r1 = r5.f13362a
        L51:
            long r1 = u2.q.d(r6, r1)
        L55:
            u2.q r4 = new u2.q
            r4.<init>(r1)
            return r4
    }
}
