package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ud.u f771h;

    public /* synthetic */ a0(int r1) {
            r0 = this;
            r0.f770g = r1
            r0.<init>()
            return
    }

    public static java.util.List k(ud.e r4, java.util.List r5, qd.j r6, java.util.List r7) {
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto Lf
            qd.e r0 = qd.j.f10877k
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lf
            goto L67
        Lf:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            be.l0 r1 = new be.l0
            r2 = 0
            r1.<init>(r0, r2)
            r6.C(r1)
            be.z r6 = new be.z
            r1 = 2
            r6.<init>(r0, r1)
            r7.forEach(r6)
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L2d
            goto L67
        L2d:
            boolean r6 = r4.d0()
            if (r6 == 0) goto L48
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r5)
            ud.e r7 = r4.f13701x
            r1 = r4
        L3b:
            if (r7 == r1) goto L49
            java.util.List r1 = r7.f13695r
            r6.addAll(r1)
            ud.e r1 = r7.f13701x
            r3 = r1
            r1 = r7
            r7 = r3
            goto L3b
        L48:
            r6 = r5
        L49:
            java.util.Iterator r6 = r6.iterator()
        L4d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L61
            java.lang.Object r7 = r6.next()
            qd.j r7 = (qd.j) r7
            java.lang.String r7 = r7.l()
            r0.remove(r7)
            goto L4d
        L61:
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L68
        L67:
            return r5
        L68:
            java.lang.String r6 = java.lang.String.valueOf(r0)
            java.lang.String r7 = "Add missing generic type declarations: "
            java.lang.String r6 = r7.concat(r6)
            r4.J(r6)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = r5.size()
            int r7 = r0.size()
            int r7 = r7 + r6
            r4.<init>(r7)
            r4.addAll(r5)
            java.util.stream.Stream r5 = r0.stream()
            java.util.stream.Stream r5 = r5.sorted()
            ae.d r6 = new ae.d
            r7 = 17
            r6.<init>(r7)
            java.util.stream.Stream r5 = r5.map(r6)
            be.m0 r6 = new be.m0
            r7 = 0
            r6.<init>(r7, r4)
            r5.forEach(r6)
            return r4
    }

    public static java.util.List m(ud.e r9, java.util.List r10) {
            java.util.List r0 = r9.f13694q
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L9
            return r0
        L9:
            int r1 = r10.size()
            int r2 = r0.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            int r4 = java.lang.Math.min(r2, r1)
            r5 = 0
        L1b:
            if (r5 >= r2) goto L53
            if (r5 >= r4) goto L47
            java.lang.Object r6 = r10.get(r5)
            qd.j r6 = (qd.j) r6
            java.lang.Object r7 = r0.get(r5)
            qd.j r7 = (qd.j) r7
            if (r6 != 0) goto L2f
        L2d:
            r6 = r7
            goto L43
        L2f:
            boolean r8 = r6.v()
            if (r8 != 0) goto L43
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r8 = "Incorrect class signature, class is not an object: "
            java.lang.String r6 = r8.concat(r6)
            r9.L(r6)
            goto L2d
        L43:
            r3.add(r6)
            goto L50
        L47:
            java.lang.Object r6 = r0.get(r5)
            qd.j r6 = (qd.j) r6
            r3.add(r6)
        L50:
            int r5 = r5 + 1
            goto L1b
        L53:
            if (r2 >= r1) goto L66
            java.util.List r10 = r10.subList(r2, r1)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r0 = "Unexpected interfaces in signature: "
            java.lang.String r10 = r0.concat(r10)
            r9.L(r10)
        L66:
            return r3
    }

    @Override // be.a
    public java.lang.String e() {
            r1 = this;
            int r0 = r1.f770g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.e()
            return r0
        La:
            java.lang.String r0 = "SignatureProcessor"
            return r0
    }

    @Override // be.a
    public final void f(ud.u r2) {
            r1 = this;
            int r0 = r1.f770g
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            r1.f771h = r2
            return
        L8:
            r1.f771h = r2
            return
    }

    @Override // be.a
    public void g(ud.r r10) {
            r9 = this;
            int r0 = r9.f770g
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            md.b r0 = md.b.f8867v
            md.f r1 = r10.f8877g
            oc.b r0 = r1.c(r0)
            nd.z r0 = (nd.z) r0
            if (r0 != 0) goto L1f
            nd.z r0 = new nd.z
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.<init>(r1)
            r10.y(r0)
        L1f:
            java.util.HashSet r1 = r0.f9406g
            boolean r2 = r0.f9407h
            r3 = 1
            if (r2 != 0) goto Lad
            r0.f9407h = r3
            boolean r0 = r10.f13722p
            if (r0 != 0) goto Lad
            java.util.List r0 = r10.f13732z
            if (r0 != 0) goto L32
            goto Lad
        L32:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L59
        L36:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> L59
            if (r2 == 0) goto Lad
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> L59
            ud.a r2 = (ud.a) r2     // Catch: java.lang.Exception -> L59
            md.a r4 = md.a.f8840u     // Catch: java.lang.Exception -> L59
            md.f r5 = r2.f8877g     // Catch: java.lang.Exception -> L59
            boolean r4 = r5.a(r4)     // Catch: java.lang.Exception -> L59
            if (r4 != 0) goto L5b
            md.a r4 = md.a.f8838s     // Catch: java.lang.Exception -> L59
            md.f r5 = r2.f8877g     // Catch: java.lang.Exception -> L59
            boolean r4 = r5.a(r4)     // Catch: java.lang.Exception -> L59
            if (r4 == 0) goto L57
            goto L5b
        L57:
            r4 = 0
            goto L5c
        L59:
            r0 = move-exception
            goto La8
        L5b:
            r4 = r3
        L5c:
            java.util.HashSet r5 = new java.util.HashSet     // Catch: java.lang.Exception -> L59
            r5.<init>()     // Catch: java.lang.Exception -> L59
            md.b r6 = md.b.F     // Catch: java.lang.Exception -> L59
            md.f r7 = r2.f8877g     // Catch: java.lang.Exception -> L59
            oc.b r6 = r7.c(r6)     // Catch: java.lang.Exception -> L59
            ae.b r6 = (ae.b) r6     // Catch: java.lang.Exception -> L59
            if (r6 == 0) goto L92
            java.util.List r6 = r6.f228g     // Catch: java.lang.Exception -> L59
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L59
        L73:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Exception -> L59
            if (r7 == 0) goto L92
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Exception -> L59
            ae.f r7 = (ae.f) r7     // Catch: java.lang.Exception -> L59
            boolean r8 = r7.c()     // Catch: java.lang.Exception -> L59
            if (r8 == 0) goto L86
            goto L36
        L86:
            qd.j r7 = r7.b()     // Catch: java.lang.Exception -> L59
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L59
            r5.add(r7)     // Catch: java.lang.Exception -> L59
            goto L73
        L92:
            java.util.ArrayList r2 = r2.f13674l     // Catch: java.lang.Exception -> L59
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L59
        L98:
            boolean r6 = r2.hasNext()     // Catch: java.lang.Exception -> L59
            if (r6 == 0) goto L36
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Exception -> L59
            ud.p r6 = (ud.p) r6     // Catch: java.lang.Exception -> L59
            r9.j(r10, r6, r5, r4)     // Catch: java.lang.Exception -> L59
            goto L98
        La8:
            java.lang.String r2 = "Failed to analyze thrown exceptions"
            r10.M(r2, r0)
        Lad:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            oc.c r2 = oc.c.f9763i
            md.f r4 = r10.f8877g
            oc.b r2 = r4.c(r2)
            pc.e r2 = (pc.e) r2
            if (r2 == 0) goto Led
            java.util.List r2 = r2.f10464g
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto Led
            java.util.Iterator r2 = r2.iterator()
        Lca:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Led
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            qd.j r4 = qd.j.x(r4)
            int r5 = r9.o(r4)
            r6 = 4
            if (r5 != r6) goto Le5
            r0.add(r4)
            goto Lca
        Le5:
            qd.e r4 = (qd.e) r4
            java.lang.String r4 = r4.K
            r1.add(r4)
            goto Lca
        Led:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Byte code manipulation detected: skipped illegal throws declarations: "
            java.lang.String r0 = r2.concat(r0)
            r10.L(r0)
        L100:
            java.lang.String r10 = "java.lang.Exception"
            boolean r10 = r1.contains(r10)
            if (r10 == 0) goto L113
            a7.b r10 = new a7.b
            r0 = 13
            r10.<init>(r0)
            r1.removeIf(r10)
            goto L175
        L113:
            java.lang.String r10 = "java.lang.Throwable"
            boolean r10 = r1.contains(r10)
            if (r10 == 0) goto L126
            a7.b r10 = new a7.b
            r0 = 14
            r10.<init>(r0)
            r1.removeIf(r10)
            goto L175
        L126:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r0 = r1.iterator()
        L12f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L16c
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Iterator r4 = r1.iterator()
        L13f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L12f
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            boolean r6 = r2.equals(r5)
            if (r6 == 0) goto L152
            goto L13f
        L152:
            boolean r6 = r2.equals(r5)
            if (r6 == 0) goto L15a
            r5 = r3
            goto L166
        L15a:
            ud.u r6 = r9.f771h
            ed.c r6 = r6.f13760s
            java.util.Set r6 = r6.d(r2)
            boolean r5 = r6.contains(r5)
        L166:
            if (r5 == 0) goto L13f
            r10.add(r2)
            goto L13f
        L16c:
            be.z r0 = new be.z
            r2 = 0
            r0.<init>(r1, r2)
            r10.forEach(r0)
        L175:
            return
    }

    @Override // be.a
    public boolean h(ud.e r11) {
            r10 = this;
            int r0 = r10.f770g
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            boolean r11 = super.h(r11)
            return r11
        La:
            vd.a r0 = vd.a.g(r11)
            if (r0 != 0) goto L12
            goto L83
        L12:
            java.util.List r1 = r0.b()     // Catch: java.lang.Exception -> L63
            qd.j r2 = r0.e()     // Catch: java.lang.Exception -> L63
            qd.j r3 = r11.f13693p     // Catch: java.lang.Exception -> L63
            java.lang.String r4 = r2.l()     // Catch: java.lang.Exception -> L63
            od.a r5 = r11.f13690m     // Catch: java.lang.Exception -> L63
            qd.j r5 = r5.f9765g     // Catch: java.lang.Exception -> L63
            java.lang.String r5 = r5.l()     // Catch: java.lang.Exception -> L63
            boolean r4 = java.util.Objects.equals(r4, r5)     // Catch: java.lang.Exception -> L63
            if (r4 == 0) goto L34
            java.lang.String r2 = "Incorrect class signature: super class is equals to this class"
            r11.L(r2)     // Catch: java.lang.Exception -> L63
            goto L49
        L34:
            boolean r4 = r2.v()     // Catch: java.lang.Exception -> L63
            if (r4 != 0) goto L48
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L63
            java.lang.String r4 = "Incorrect class signature, class is not an object: "
            java.lang.String r2 = r4.concat(r2)     // Catch: java.lang.Exception -> L63
            r11.L(r2)     // Catch: java.lang.Exception -> L63
            r2 = r3
        L48:
            r3 = r2
        L49:
            r2 = 0
        L4a:
            qd.j r4 = r0.e()     // Catch: java.lang.Exception -> L63
            if (r4 != 0) goto L65
            if (r2 != 0) goto L54
            java.util.List r2 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Exception -> L63
        L54:
            java.util.List r2 = m(r11, r2)     // Catch: java.lang.Exception -> L63
            java.util.List r1 = k(r11, r1, r3, r2)     // Catch: java.lang.Exception -> L63
            r11.f13695r = r1     // Catch: java.lang.Exception -> L63
            r11.f13693p = r3     // Catch: java.lang.Exception -> L63
            r11.f13694q = r2     // Catch: java.lang.Exception -> L63
            goto L83
        L63:
            r1 = move-exception
            goto L70
        L65:
            if (r2 != 0) goto L6c
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L63
            r2.<init>()     // Catch: java.lang.Exception -> L63
        L6c:
            r2.add(r4)     // Catch: java.lang.Exception -> L63
            goto L4a
        L70:
            java.lang.String r0 = r0.f14308a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to parse class signature: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r11.M(r0, r1)
        L83:
            java.util.List r0 = r11.f13698u
            java.util.Iterator r0 = r0.iterator()
        L89:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L126
            java.lang.Object r1 = r0.next()
            ud.g r1 = (ud.g) r1
            java.lang.String r2 = "Incorrect field signature: "
            java.lang.String r3 = "Incorrect inner types in field signature: "
            vd.a r4 = vd.a.g(r1)
            if (r4 != 0) goto La0
            goto L89
        La0:
            java.lang.String r5 = r4.f14308a
            ud.e r6 = r1.f13706k
            qd.j r4 = r4.e()     // Catch: java.lang.Exception -> Lc1
            if (r4 != 0) goto Lab
            goto L89
        Lab:
            boolean r7 = r10.p(r4)     // Catch: java.lang.Exception -> Lc1
            if (r7 != 0) goto Lc3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc1
            r2.<init>(r3)     // Catch: java.lang.Exception -> Lc1
            r2.append(r5)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lc1
            r1.L(r2)     // Catch: java.lang.Exception -> Lc1
            goto L89
        Lc1:
            r2 = move-exception
            goto L10f
        Lc3:
            ud.u r3 = r10.f771h     // Catch: java.lang.Exception -> Lc1
            fe.a r3 = r3.f13750i     // Catch: java.lang.Exception -> Lc1
            r3.getClass()     // Catch: java.lang.Exception -> Lc1
            boolean r3 = r4.c()     // Catch: java.lang.Exception -> Lc1
            if (r3 == 0) goto Lf2
            boolean r3 = r6.d0()     // Catch: java.lang.Exception -> Lc1
            if (r3 == 0) goto Led
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Exception -> Lc1
            java.util.List r7 = r6.f13695r     // Catch: java.lang.Exception -> Lc1
            r3.<init>(r7)     // Catch: java.lang.Exception -> Lc1
            ud.e r7 = r6.f13701x     // Catch: java.lang.Exception -> Lc1
            r8 = r6
        Le0:
            if (r7 == r8) goto Lef
            java.util.List r8 = r7.f13695r     // Catch: java.lang.Exception -> Lc1
            r3.addAll(r8)     // Catch: java.lang.Exception -> Lc1
            ud.e r8 = r7.f13701x     // Catch: java.lang.Exception -> Lc1
            r9 = r8
            r8 = r7
            r7 = r9
            goto Le0
        Led:
            java.util.List r3 = r6.f13695r     // Catch: java.lang.Exception -> Lc1
        Lef:
            fe.a.b(r6, r4, r3)     // Catch: java.lang.Exception -> Lc1
        Lf2:
            qd.j r3 = r1.f13709n     // Catch: java.lang.Exception -> Lc1
            boolean r3 = r10.q(r4, r3)     // Catch: java.lang.Exception -> Lc1
            if (r3 != 0) goto L10b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc1
            r3.<init>(r2)     // Catch: java.lang.Exception -> Lc1
            r3.append(r5)     // Catch: java.lang.Exception -> Lc1
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> Lc1
            r1.J(r2)     // Catch: java.lang.Exception -> Lc1
            goto L89
        L10b:
            r1.f13709n = r4     // Catch: java.lang.Exception -> Lc1
            goto L89
        L10f:
            od.c r1 = r1.f13707l
            java.lang.String r1 = r1.f9774h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Field signature parse error: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r6.M(r1, r2)
            goto L89
        L126:
            java.util.List r11 = r11.f13697t
            java.util.Iterator r11 = r11.iterator()
        L12c:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L1bf
            java.lang.Object r0 = r11.next()
            ud.r r0 = (ud.r) r0
            vd.a r1 = vd.a.g(r0)
            if (r1 != 0) goto L13f
            goto L12c
        L13f:
            java.util.List r2 = r1.b()     // Catch: java.lang.Exception -> L191
            od.d r3 = r0.f13717k     // Catch: java.lang.Exception -> L191
            java.util.List r3 = r3.f9779i     // Catch: java.lang.Exception -> L191
            int r3 = r3.size()     // Catch: java.lang.Exception -> L191
            java.util.List r3 = r1.c(r3)     // Catch: java.lang.Exception -> L191
            qd.j r4 = r1.e()     // Catch: java.lang.Exception -> L191
            boolean r5 = r10.p(r4)     // Catch: java.lang.Exception -> L191
            if (r5 == 0) goto L193
            java.util.Iterator r5 = r3.iterator()     // Catch: java.lang.Exception -> L191
        L15d:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Exception -> L191
            if (r6 == 0) goto L170
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Exception -> L191
            qd.j r6 = (qd.j) r6     // Catch: java.lang.Exception -> L191
            boolean r6 = r10.p(r6)     // Catch: java.lang.Exception -> L191
            if (r6 != 0) goto L15d
            goto L193
        L170:
            r0.f13728v = r2     // Catch: java.lang.Exception -> L191
            ud.u r2 = r10.f771h     // Catch: java.lang.Exception -> L191
            fe.a r2 = r2.f13750i     // Catch: java.lang.Exception -> L191
            r2.getClass()     // Catch: java.lang.Exception -> L191
            fe.a.c(r0, r4)     // Catch: java.lang.Exception -> L191
            be.m r5 = new be.m     // Catch: java.lang.Exception -> L191
            r6 = 1
            r5.<init>(r2, r6, r0)     // Catch: java.lang.Exception -> L191
            java.util.List r2 = xe.s.c(r3, r5)     // Catch: java.lang.Exception -> L191
            boolean r2 = r10.n(r0, r1, r4, r2)     // Catch: java.lang.Exception -> L191
            if (r2 != 0) goto L12c
            java.util.List r2 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Exception -> L191
            r0.f13728v = r2     // Catch: java.lang.Exception -> L191
            goto L12c
        L191:
            r2 = move-exception
            goto L1aa
        L193:
            java.lang.String r2 = r1.f14308a     // Catch: java.lang.Exception -> L191
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L191
            r3.<init>()     // Catch: java.lang.Exception -> L191
            java.lang.String r4 = "Incorrect inner types in method signature: "
            r3.append(r4)     // Catch: java.lang.Exception -> L191
            r3.append(r2)     // Catch: java.lang.Exception -> L191
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Exception -> L191
            r0.L(r2)     // Catch: java.lang.Exception -> L191
            goto L12c
        L1aa:
            java.lang.String r1 = r1.f14308a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to parse method signature: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.M(r1, r2)
            goto L12c
        L1bf:
            r11 = 1
            return r11
    }

    public java.util.List i(ud.r r7, vd.a r8, java.util.List r9) {
            r6 = this;
            java.lang.String r8 = r8.f14308a
            od.d r0 = r7.f13717k
            java.util.List r1 = r0.f9779i
            int r2 = r9.size()
            int r3 = r1.size()
            r4 = 0
            r5 = 0
            if (r2 == r3) goto L5a
            ud.e r2 = r7.f13718l
            b5.k r2 = r2.f13692o
            boolean r2 = r2.b()
            if (r2 == 0) goto L1d
            return r5
        L1d:
            boolean r0 = r0.f()
            if (r0 == 0) goto L48
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L48
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L48
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r9)
            java.lang.Object r9 = r1.get(r4)
            qd.j r9 = (qd.j) r9
            r0.add(r4, r9)
            int r9 = r0.size()
            int r1 = r1.size()
            if (r9 != r1) goto L48
            return r0
        L48:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Incorrect args count in method signature: "
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.I(r8)
            return r5
        L5a:
            if (r4 >= r2) goto L83
            java.lang.Object r0 = r9.get(r4)
            qd.j r0 = (qd.j) r0
            java.lang.Object r3 = r1.get(r4)
            qd.j r3 = (qd.j) r3
            boolean r0 = r6.q(r0, r3)
            if (r0 != 0) goto L80
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Incorrect types in method signature: "
            r9.<init>(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.L(r8)
            return r5
        L80:
            int r4 = r4 + 1
            goto L5a
        L83:
            return r9
    }

    public void j(ud.r r9, ud.p r10, java.util.HashSet r11, boolean r12) {
            r8 = this;
            r0 = 0
            if (r12 != 0) goto L53
            pd.k r12 = r10.f13713k
            pd.k r1 = pd.k.f10509r
            if (r12 != r1) goto L53
            md.a r12 = md.a.f8838s
            md.f r1 = r10.f8877g
            boolean r12 = r1.a(r12)
            if (r12 != 0) goto L53
            qd.l r10 = r10.S(r0)
            boolean r12 = r10 instanceof qd.r
            if (r12 == 0) goto L47
            qd.r r10 = (qd.r) r10
            qd.j r12 = r10.I()
            qd.e r0 = qd.j.f10881o
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L43
            ud.p r10 = r10.f0()
            if (r10 == 0) goto L43
            pd.k r0 = r10.f13713k
            pd.k r1 = pd.k.f10510s
            if (r0 != r1) goto L43
            qd.r r10 = r10.f13714l
            md.a r0 = md.a.P
            md.f r10 = r10.f8877g
            boolean r10 = r10.a(r0)
            if (r10 == 0) goto L43
            goto L164
        L43:
            r8.r(r9, r12, r11)
            return
        L47:
            boolean r12 = r10 instanceof qd.m
            if (r12 == 0) goto L164
            qd.m r10 = (qd.m) r10
            qd.j r10 = r10.f10902i
            r8.r(r9, r10, r11)
            return
        L53:
            pd.k r12 = r10.f13713k
            pd.k r1 = pd.k.O
            if (r12 != r1) goto L164
            pd.n r10 = (pd.n) r10
            od.d r10 = r10.f10526p
            r12 = 1
            java.lang.String r12 = r10.j(r0, r12)
            od.a r0 = r10.f9780j
            ud.u r1 = r8.f771h
            ud.e r1 = r1.f(r0)
            md.b r2 = md.b.f8867v
            r3 = 0
            if (r1 == 0) goto L105
            java.lang.String r0 = r10.f9781k
            java.util.List r4 = r1.f13697t
            java.util.Iterator r4 = r4.iterator()
        L77:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8f
            java.lang.Object r5 = r4.next()
            ud.r r5 = (ud.r) r5
            od.d r6 = r5.f13717k
            java.lang.String r6 = r6.f9781k
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L77
            r3 = r5
            goto Lca
        L8f:
            java.util.List r0 = r1.f13697t
            java.util.Iterator r0 = r0.iterator()
        L95:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lca
            java.lang.Object r4 = r0.next()
            ud.r r4 = (ud.r) r4
            od.d r5 = r4.f13717k
            java.lang.String r5 = r5.f9781k
            boolean r5 = r5.startsWith(r12)
            if (r5 == 0) goto L95
            b5.k r5 = r4.f13719m
            boolean r5 = r5.h()
            if (r5 != 0) goto L95
            ud.u r5 = r1.f13688k
            qe.x r5 = r5.f13748g
            qe.k r5 = r5.f11002c
            od.d r6 = r4.f13717k
            qd.j r6 = r6.f9778h
            qd.j r7 = r10.f9778h
            qe.l r5 = r5.d(r6, r7)
            boolean r5 = r5.d()
            if (r5 == 0) goto L95
            r3 = r4
        Lca:
            if (r3 != 0) goto Lce
            goto L164
        Lce:
            r8.g(r3)
            md.f r10 = r3.f8877g
            oc.b r10 = r10.c(r2)
            nd.z r10 = (nd.z) r10
            md.f r12 = r9.f8877g
            oc.b r12 = r12.c(r2)
            nd.z r12 = (nd.z) r12
            if (r12 == 0) goto L164
            if (r10 == 0) goto L164
            java.util.HashSet r10 = r10.f9406g
            boolean r12 = r10.isEmpty()
            if (r12 != 0) goto L164
            java.util.Iterator r10 = r10.iterator()
        Lf1:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L164
            java.lang.Object r12 = r10.next()
            java.lang.String r12 = (java.lang.String) r12
            qd.j r12 = qd.j.x(r12)
            r8.r(r9, r12, r11)
            goto Lf1
        L105:
            ud.u r10 = r8.f771h
            ed.c r10 = r10.f13760s
            qd.j r0 = r0.f9765g
            ed.b r10 = r10.c(r0)
            if (r10 == 0) goto L164
            java.util.Map r10 = r10.f2709d
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L11b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L13a
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.startsWith(r12)
            if (r1 == 0) goto L11b
            java.lang.Object r10 = r0.getValue()
            r3 = r10
            ed.d r3 = (ed.d) r3
        L13a:
            if (r3 == 0) goto L164
            java.util.List r10 = r3.f2722k
            if (r10 == 0) goto L164
            boolean r12 = r10.isEmpty()
            if (r12 != 0) goto L164
            md.f r12 = r9.f8877g
            oc.b r12 = r12.c(r2)
            nd.z r12 = (nd.z) r12
            if (r12 == 0) goto L164
            java.util.Iterator r10 = r10.iterator()
        L154:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L164
            java.lang.Object r12 = r10.next()
            qd.j r12 = (qd.j) r12
            r8.r(r9, r12, r11)
            goto L154
        L164:
            return
    }

    public boolean l(qd.j r2, qd.j r3) {
            r1 = this;
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L8
            r2 = 1
            return r2
        L8:
            ud.u r0 = r1.f771h
            ed.c r0 = r0.f13760s
            java.lang.String r2 = r2.l()
            java.lang.String r3 = r3.l()
            java.util.Set r2 = r0.d(r2)
            boolean r2 = r2.contains(r3)
            return r2
    }

    public boolean n(ud.r r5, vd.a r6, qd.j r7, java.util.List r8) {
            r4 = this;
            java.lang.String r0 = r6.f14308a
            java.lang.String r1 = "Incorrect return type in method signature: "
            r2 = 0
            od.d r3 = r5.f13717k     // Catch: java.lang.Exception -> L1f
            qd.j r3 = r3.f9778h     // Catch: java.lang.Exception -> L1f
            boolean r3 = r4.q(r7, r3)     // Catch: java.lang.Exception -> L1f
            if (r3 != 0) goto L21
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1f
            r6.<init>(r1)     // Catch: java.lang.Exception -> L1f
            r6.append(r0)     // Catch: java.lang.Exception -> L1f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> L1f
            r5.L(r6)     // Catch: java.lang.Exception -> L1f
            return r2
        L1f:
            r6 = move-exception
            goto L32
        L21:
            java.util.List r6 = r4.i(r5, r6, r8)     // Catch: java.lang.Exception -> L1f
            if (r6 != 0) goto L28
            return r2
        L28:
            java.util.List r6 = java.util.Collections.unmodifiableList(r6)     // Catch: java.lang.Exception -> L1f
            r5.f13727u = r6     // Catch: java.lang.Exception -> L1f
            r5.f13726t = r7     // Catch: java.lang.Exception -> L1f
            r5 = 1
            return r5
        L32:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Type validation failed for signature: "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r5.M(r7, r6)
            return r2
    }

    public int o(qd.j r3) {
            r2 = this;
            if (r3 == 0) goto L49
            qd.e r0 = qd.j.f10877k
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lb
            goto L49
        Lb:
            boolean r0 = r3.w()
            if (r0 == 0) goto L47
            ud.u r0 = r2.f771h
            ed.c r0 = r0.f13760s
            java.lang.String r1 = r3.l()
            java.util.HashMap r0 = r0.f2714b
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L22
            goto L47
        L22:
            qd.e r0 = qd.j.f10884r
            boolean r0 = r2.l(r3, r0)
            if (r0 != 0) goto L45
            qd.e r0 = qd.j.f10882p
            boolean r0 = r2.l(r3, r0)
            if (r0 == 0) goto L33
            goto L45
        L33:
            qd.e r0 = qd.j.f10881o
            boolean r0 = r2.l(r3, r0)
            if (r0 != 0) goto L43
            qd.e r0 = qd.j.f10883q
            boolean r3 = r2.l(r3, r0)
            if (r3 == 0) goto L49
        L43:
            r3 = 1
            return r3
        L45:
            r3 = 2
            return r3
        L47:
            r3 = 3
            return r3
        L49:
            r3 = 4
            return r3
    }

    public boolean p(qd.j r6) {
            r5 = this;
            qd.j r0 = r6.k()
            r1 = 1
            if (r0 != 0) goto L8
            goto L4f
        L8:
            qd.j r6 = r6.m()
            ud.u r2 = r5.f771h
            ud.e r6 = r2.g(r6)
            if (r6 != 0) goto L15
            goto L4f
        L15:
            qd.j r2 = r0.m()
            if (r2 == 0) goto L24
            qd.j r2 = r0.m()
            qd.e r2 = (qd.e) r2
            java.lang.String r2 = r2.K
            goto L29
        L24:
            r2 = r0
            qd.e r2 = (qd.e) r2
            java.lang.String r2 = r2.K
        L29:
            java.lang.String r3 = "."
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L50
            java.util.List r6 = r6.f13699v
            java.util.Iterator r6 = r6.iterator()
        L37:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r6.next()
            ud.e r0 = (ud.e) r0
            od.a r0 = r0.f13690m
            java.lang.String r0 = r0.k()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L37
        L4f:
            return r1
        L50:
            ud.u r3 = r5.f771h
            r3.getClass()
            qd.j r2 = qd.j.x(r2)
            od.a r2 = od.a.e(r3, r2)
            ud.e r2 = r3.f(r2)
            if (r2 != 0) goto L65
        L63:
            r6 = 0
            return r6
        L65:
            ud.e r3 = r2.f13701x
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L94
            java.util.List r3 = r6.f13699v
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L7d
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 5
            r3.<init>(r4)
            r6.f13699v = r3
        L7d:
            java.util.List r3 = r6.f13699v
            r3.add(r2)
            r2.f13701x = r6
            od.a r2 = r2.f13690m
            r2.getClass()
            ud.u r3 = r6.f13688k
            qd.j r4 = r2.f9765g
            r2.r(r3, r4, r1)
            od.a r6 = r6.f13690m
            r2.f9769k = r6
        L94:
            boolean r6 = r5.p(r0)
            return r6
    }

    public boolean q(qd.j r5, qd.j r6) {
            r4 = this;
            ud.u r0 = r4.f771h
            qe.x r0 = r0.f13748g
            qe.k r0 = r0.f11002c
            qe.l r6 = r0.d(r5, r6)
            qe.l r0 = qe.l.f10971n
            r1 = 0
            if (r6 != r0) goto L58
            boolean r0 = r5.v()
            if (r0 == 0) goto L58
            java.lang.String r5 = r5.l()
            java.util.regex.Pattern r0 = kd.d.f7584a
            xe.q r0 = xe.q.f21574b
            if (r5 == 0) goto L57
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L57
            java.util.HashSet r0 = kd.d.f7586c
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L57
            java.util.regex.Pattern r0 = kd.d.f7585b
            java.util.regex.Matcher r0 = r0.matcher(r5)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L57
            r0 = 46
            int r0 = r5.indexOf(r0)
            if (r0 <= 0) goto L58
            java.lang.String r0 = "\\."
            java.lang.String[] r5 = r5.split(r0)
            int r0 = r5.length
            r2 = r1
        L49:
            if (r2 >= r0) goto L58
            r3 = r5[r2]
            boolean r3 = kd.d.d(r3)
            if (r3 != 0) goto L54
            goto L5e
        L54:
            int r2 = r2 + 1
            goto L49
        L57:
            return r1
        L58:
            qe.l r5 = qe.l.f10969l
            if (r6 == r5) goto L5e
            r5 = 1
            return r5
        L5e:
            return r1
    }

    public void r(ud.r r5, qd.j r6, java.util.HashSet r7) {
            r4 = this;
            boolean r0 = r6.w()
            if (r0 == 0) goto L5c
            int r0 = r4.o(r6)
            r1 = 3
            r2 = 1
            if (r0 != r1) goto L1c
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Thrown type has an unknown type hierarchy: "
            java.lang.String r0 = r1.concat(r0)
            r5.J(r0)
            goto L1e
        L1c:
            if (r0 != r2) goto L5c
        L1e:
            java.util.Iterator r7 = r7.iterator()
        L22:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r0 = r7.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = r6.l()
            boolean r3 = r1.equals(r0)
            if (r3 == 0) goto L3a
            r0 = r2
            goto L46
        L3a:
            ud.u r3 = r4.f771h
            ed.c r3 = r3.f13760s
            java.util.Set r1 = r3.d(r1)
            boolean r0 = r1.contains(r0)
        L46:
            if (r0 == 0) goto L22
            goto L5c
        L49:
            md.b r7 = md.b.f8867v
            md.f r5 = r5.f8877g
            oc.b r5 = r5.c(r7)
            nd.z r5 = (nd.z) r5
            java.util.HashSet r5 = r5.f9406g
            java.lang.String r6 = r6.l()
            r5.add(r6)
        L5c:
            return
    }
}
