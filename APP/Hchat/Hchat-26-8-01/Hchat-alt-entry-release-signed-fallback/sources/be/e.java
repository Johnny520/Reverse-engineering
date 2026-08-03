package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f787h;

    public /* synthetic */ e(int r1) {
            r0 = this;
            r0.f786g = r1
            r0.<init>()
            return
    }

    public static void i(nd.b0 r5, int r6) {
            b5.k r0 = r5.O()
            int r1 = r0.f488b
            int r2 = r0.f488b
            int r3 = r0.f489c
            r4 = r1 & 7
            if (r4 != r6) goto L10
            r4 = r0
            goto L19
        L10:
            r1 = r1 & (-8)
            b5.k r4 = new b5.k
            r6 = r6 | r1
            r1 = 3
            r4.<init>(r6, r3, r1)
        L19:
            if (r4 == r0) goto L5e
            r5.Q(r4)
            r6 = r2 & 7
            if (r6 != 0) goto L25
            java.lang.String r6 = "package-private"
            goto L3f
        L25:
            boolean r6 = r0.g()
            if (r6 == 0) goto L2e
            java.lang.String r6 = "public"
            goto L3f
        L2e:
            boolean r6 = r0.e()
            if (r6 == 0) goto L37
            java.lang.String r6 = "private"
            goto L3f
        L37:
            boolean r6 = r0.f()
            if (r6 == 0) goto L49
            java.lang.String r6 = "protected"
        L3f:
            java.lang.String r0 = "Access modifiers changed from: "
            java.lang.String r6 = r0.concat(r6)
            r5.J(r6)
            return
        L49:
            b5.k r5 = new b5.k
            r6 = r2 & 7
            r0 = 3
            r5.<init>(r6, r3, r0)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = "Unknown visibility flags: "
            java.lang.String r5 = r6.concat(r5)
            ah.a.k(r5)
        L5e:
            return
    }

    public static od.d j(ud.u r2, qd.j r3, java.lang.String r4) {
            qd.j r4 = qd.j.x(r4)
            od.a r0 = od.a.e(r2, r4)
            java.lang.String r1 = "valueOf"
            java.util.List r3 = java.util.Collections.singletonList(r3)
            od.d r2 = od.d.b(r2, r0, r1, r3, r4)
            return r2
    }

    @Override // be.a
    public final void f(ud.u r9) {
            r8 = this;
            int r0 = r8.f786g
            switch(r0) {
                case 0: goto L19a;
                case 1: goto L13c;
                case 2: goto L12;
                default: goto L5;
            }
        L5:
            fe.a r0 = new fe.a
            r0.<init>(r9)
            r8.f787h = r0
            bc.g r9 = r9.f13742a
            r9.getClass()
            return
        L12:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.ArrayList r9 = r9.f13755n
            java.util.Iterator r9 = r9.iterator()
        L1d:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L139
            java.lang.Object r1 = r9.next()
            ud.e r1 = (ud.e) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r4 = r1
        L34:
            if (r4 == 0) goto L7a
            boolean r5 = r3.add(r4)
            if (r5 != 0) goto L50
            java.lang.String r4 = java.lang.String.valueOf(r3)
            java.lang.String r5 = "Found 'super' loop in classes: "
            java.lang.String r4 = r5.concat(r4)
            be.i0 r5 = new be.i0
            r6 = 0
            r5.<init>(r4, r6)
            r3.forEach(r5)
            goto L7a
        L50:
            java.util.List r5 = r4.f13698u
            java.util.Iterator r5 = r5.iterator()
        L56:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6e
            java.lang.Object r6 = r5.next()
            ud.g r6 = (ud.g) r6
            b5.k r7 = r6.f13708m
            boolean r7 = r7.h()
            if (r7 != 0) goto L56
            r2.add(r6)
            goto L56
        L6e:
            qd.j r4 = r4.f13693p
            if (r4 != 0) goto L73
            goto L7a
        L73:
            ud.u r5 = r1.f13688k
            ud.e r4 = r5.g(r4)
            goto L34
        L7a:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L84
            java.util.Map r2 = java.util.Collections.EMPTY_MAP
            goto L123
        L84:
            java.util.HashMap r3 = new java.util.HashMap
            int r4 = r2.size()
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L91:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lb2
            java.lang.Object r4 = r2.next()
            ud.g r4 = (ud.g) r4
            od.c r5 = r4.f13707l
            java.lang.String r5 = r5.f9774h
            ae.d r6 = new ae.d
            r7 = 16
            r6.<init>(r7)
            java.lang.Object r5 = r3.computeIfAbsent(r5, r6)
            java.util.List r5 = (java.util.List) r5
            r5.add(r4)
            goto L91
        Lb2:
            java.util.Set r2 = r3.entrySet()
            a7.b r4 = new a7.b
            r5 = 20
            r4.<init>(r5)
            r2.removeIf(r4)
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto Lc9
            java.util.Map r2 = java.util.Collections.EMPTY_MAP
            goto L123
        Lc9:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        Ld6:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L123
            java.lang.Object r4 = r3.next()
            java.util.List r4 = (java.util.List) r4
            r5 = 0
            java.lang.Object r5 = r4.get(r5)
            ud.g r5 = (ud.g) r5
            ud.e r5 = r5.f13706k
            if (r5 != r1) goto L107
            int r5 = r4.size()
            r6 = 2
            if (r5 != r6) goto L107
            r5 = 1
            java.lang.Object r4 = r4.get(r5)
            ud.g r4 = (ud.g) r4
            ud.e r5 = r4.f13706k
            if (r5 == r1) goto Ld6
            od.c r4 = r4.f13707l
            be.k0 r5 = be.k0.f817g
            r2.put(r4, r5)
            goto Ld6
        L107:
            java.util.Iterator r4 = r4.iterator()
        L10b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Ld6
            java.lang.Object r5 = r4.next()
            ud.g r5 = (ud.g) r5
            ud.e r6 = r5.f13706k
            if (r6 == r1) goto L10b
            od.c r5 = r5.f13707l
            be.k0 r6 = be.k0.f818h
            r2.put(r5, r6)
            goto L10b
        L123:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L1d
            be.j0 r3 = new be.j0
            r3.<init>()
            r3.f811a = r2
            java.lang.String r1 = r1.Z()
            r0.put(r1, r3)
            goto L1d
        L139:
            r8.f787h = r0
            return
        L13c:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r8.f787h = r0
            qd.g r1 = qd.j.f10868b
            java.lang.String r2 = "java.lang.Integer"
            od.d r1 = j(r9, r1, r2)
            r0.add(r1)
            java.lang.Object r0 = r8.f787h
            java.util.HashSet r0 = (java.util.HashSet) r0
            qd.g r1 = qd.j.f10869c
            java.lang.String r2 = "java.lang.Boolean"
            od.d r1 = j(r9, r1, r2)
            r0.add(r1)
            java.lang.Object r0 = r8.f787h
            java.util.HashSet r0 = (java.util.HashSet) r0
            qd.g r1 = qd.j.f10870d
            java.lang.String r2 = "java.lang.Byte"
            od.d r1 = j(r9, r1, r2)
            r0.add(r1)
            java.lang.Object r0 = r8.f787h
            java.util.HashSet r0 = (java.util.HashSet) r0
            qd.g r1 = qd.j.f10871e
            java.lang.String r2 = "java.lang.Short"
            od.d r1 = j(r9, r1, r2)
            r0.add(r1)
            java.lang.Object r0 = r8.f787h
            java.util.HashSet r0 = (java.util.HashSet) r0
            qd.g r1 = qd.j.f10872f
            java.lang.String r2 = "java.lang.Character"
            od.d r1 = j(r9, r1, r2)
            r0.add(r1)
            java.lang.Object r0 = r8.f787h
            java.util.HashSet r0 = (java.util.HashSet) r0
            qd.g r1 = qd.j.f10875i
            java.lang.String r2 = "java.lang.Long"
            od.d r9 = j(r9, r1, r2)
            r0.add(r9)
            return
        L19a:
            fe.a r9 = r9.f13749h
            r8.f787h = r9
            return
    }

    @Override // be.a
    public final void g(ud.r r21) {
            r20 = this;
            r0 = r20
            r1 = r21
            int r2 = r0.f786g
            switch(r2) {
                case 0: goto L2af;
                case 1: goto L11d;
                case 2: goto L6d;
                default: goto L9;
            }
        L9:
            md.a r2 = md.a.f8838s
            md.f r3 = r1.f8877g
            boolean r2 = r3.a(r2)
            if (r2 == 0) goto L14
            goto L6c
        L14:
            b5.k r2 = r1.f13719m
            md.b r3 = md.b.f8863r
            md.f r4 = r1.f8877g
            oc.b r3 = r4.c(r3)
            nd.x r3 = (nd.x) r3
            if (r3 == 0) goto L4b
            java.util.List r3 = r3.f9402g
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L4b
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            ud.m r3 = (ud.m) r3
            int r3 = r3.o()
            int r2 = r2.f488b
            r2 = r2 & 7
            r3 = r3 & 7
            if (r2 != r3) goto L3e
            goto L4b
        L3e:
            int r2 = b5.k.k(r2)
            int r4 = b5.k.k(r3)
            if (r2 >= r4) goto L4b
            i(r1, r3)
        L4b:
            java.util.List r2 = r1.H
            java.util.Iterator r2 = r2.iterator()
        L51:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r2.next()
            ud.r r3 = (ud.r) r3
            java.lang.Object r4 = r0.f787h
            fe.a r4 = (fe.a) r4
            ah.a r5 = new ah.a
            r6 = 27
            r5.<init>(r6)
            r4.a(r1, r3, r5)
            goto L51
        L6c:
            return
        L6d:
            boolean r2 = r1.f13722p
            if (r2 == 0) goto L73
            goto L11c
        L73:
            java.lang.Object r2 = r0.f787h
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.List r3 = r1.f13732z
            java.util.Iterator r3 = r3.iterator()
        L7d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L11c
            java.lang.Object r4 = r3.next()
            ud.a r4 = (ud.a) r4
            java.util.ArrayList r4 = r4.f13674l
            java.util.Iterator r4 = r4.iterator()
        L8f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L7d
            java.lang.Object r5 = r4.next()
            ud.p r5 = (ud.p) r5
            pd.k r6 = r5.f13713k
            int r6 = r6.ordinal()
            r7 = 30
            if (r6 == r7) goto Lab
            r7 = 31
            if (r6 == r7) goto Lab
            r6 = 0
            goto Lb2
        Lab:
            r6 = r5
            pd.j r6 = (pd.j) r6
            java.lang.Object r6 = r6.f10495o
            od.c r6 = (od.c) r6
        Lb2:
            if (r6 != 0) goto Lb5
            goto L8f
        Lb5:
            java.util.List r7 = r5.f13715m
            int r7 = r7.size()
            r8 = 1
            int r7 = r7 - r8
            qd.l r5 = r5.S(r7)
            qd.j r7 = r5.I()
            boolean r9 = r7.w()
            if (r9 == 0) goto L8f
            boolean r9 = r7.v()
            if (r9 != 0) goto Ld2
            goto L8f
        Ld2:
            java.lang.String r7 = r7.l()
            java.lang.Object r7 = r2.get(r7)
            be.j0 r7 = (be.j0) r7
            if (r7 != 0) goto Ldf
            goto L8f
        Ldf:
            java.util.Map r7 = r7.f811a
            java.lang.Object r7 = r7.get(r6)
            be.k0 r7 = (be.k0) r7
            if (r7 != 0) goto Lea
            goto L8f
        Lea:
            be.k0 r9 = be.k0.f817g
            if (r7 != r9) goto Lfa
            boolean r7 = r5.N()
            if (r7 == 0) goto Lfa
            md.a r6 = md.a.K
            r5.w(r6)
            goto L8f
        Lfa:
            pd.j r7 = new pd.j
            od.a r6 = r6.f9773g
            qd.j r6 = r6.f9765g
            pd.k r9 = pd.k.f10506o
            r7.<init>(r9, r6, r8)
            qd.l r6 = r5.H()
            r7.I(r6)
            md.a r6 = md.a.f8831m
            r7.w(r6)
            md.a r6 = md.a.X
            r7.w(r6)
            r6 = 0
            r5.b0(r1, r7, r6)
            goto L8f
        L11c:
            return
        L11d:
            boolean r2 = r1.f13722p
            if (r2 == 0) goto L123
            goto L2ae
        L123:
            java.util.List r2 = r1.f13732z
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = r3
        L12b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L2a9
            java.lang.Object r5 = r2.next()
            ud.a r5 = (ud.a) r5
            java.util.ArrayList r6 = r5.f13674l
            int r7 = r6.size()
            r8 = r3
        L13e:
            if (r8 >= r7) goto L2a5
            java.lang.Object r9 = r6.get(r8)
            ud.p r9 = (ud.p) r9
            pd.k r10 = r9.f13713k
            pd.k r11 = pd.k.O
            if (r10 != r11) goto L298
            pd.n r9 = (pd.n) r9
            int r10 = r9.f10525o
            r12 = 1
            r13 = 0
            if (r10 != r12) goto L28c
            qd.r r10 = r9.f13714l
            if (r10 != 0) goto L15a
            goto L28c
        L15a:
            od.d r10 = r9.f10526p
            java.lang.Object r14 = r0.f787h
            java.util.HashSet r14 = (java.util.HashSet) r14
            boolean r14 = r14.contains(r10)
            if (r14 == 0) goto L28c
            qd.r r14 = r9.f13714l
            qd.l r9 = r9.S(r3)
            r9.getClass()
            boolean r15 = r9 instanceof qd.n
            if (r15 == 0) goto L28c
            java.util.List r13 = r10.f9779i
            java.lang.Object r13 = r13.get(r3)
            qd.j r13 = (qd.j) r13
            qd.j r10 = r10.f9778h
            qd.g r15 = qd.j.f10875i
            if (r13 != r15) goto L187
            r17 = r2
            r2 = r12
            r16 = r2
            goto L1d5
        L187:
            qd.g r15 = qd.j.f10868b
            if (r13 == r15) goto L1d0
            java.util.HashSet r15 = new java.util.HashSet
            r15.<init>()
            r16 = r12
            qd.s r12 = r14.f10923m
            java.util.ArrayList r12 = r12.f10928j
            java.util.Iterator r12 = r12.iterator()
        L19a:
            boolean r17 = r12.hasNext()
            if (r17 == 0) goto L1ba
            java.lang.Object r17 = r12.next()
            r3 = r17
            qd.r r3 = (qd.r) r3
            r17 = r2
            qd.j r2 = r3.I()
            r15.add(r2)
            qd.j r2 = r3.f10902i
            r15.add(r2)
            r2 = r17
            r3 = 0
            goto L19a
        L1ba:
            r17 = r2
            qd.j r2 = r14.I()
            r15.add(r2)
            r15.remove(r10)
            r15.remove(r13)
            boolean r2 = r15.isEmpty()
            r2 = r2 ^ 1
            goto L1d5
        L1d0:
            r17 = r2
            r16 = r12
            r2 = 0
        L1d5:
            if (r2 == 0) goto L1dc
            md.a r2 = md.a.W
            r9.w(r2)
        L1dc:
            r9.W(r13)
            qd.s r2 = r14.f10923m
            qd.k r2 = r2.b()
            java.util.List r2 = r2.f10896c
            java.util.Iterator r2 = r2.iterator()
        L1eb:
            boolean r3 = r2.hasNext()
            pd.k r12 = pd.k.f10498g
            if (r3 == 0) goto L26a
            java.lang.Object r3 = r2.next()
            qd.s r3 = (qd.s) r3
            boolean r15 = r3.i()
            if (r15 == 0) goto L204
        L1ff:
            r19 = r4
        L201:
            r2 = 0
            goto L26e
        L204:
            qd.r r15 = r3.f10927i
            ud.p r15 = r15.f10903j
            if (r15 != 0) goto L20b
            goto L1ff
        L20b:
            r18 = r2
            pd.k r2 = r15.f13713k
            r19 = r4
            if (r2 == r12) goto L217
            pd.k r4 = pd.k.f10504m
            if (r2 != r4) goto L219
        L217:
            r2 = 0
            goto L21b
        L219:
            r2 = 0
            goto L22a
        L21b:
            qd.l r4 = r15.S(r2)
            qd.j r4 = r4.I()
            boolean r4 = r4.v()
            if (r4 == 0) goto L22a
            goto L26e
        L22a:
            qd.r r4 = r15.f13714l
            qd.j r4 = r4.f10902i
            boolean r15 = r4.v()
            if (r15 == 0) goto L23b
            boolean r4 = r4.equals(r10)
            if (r4 != 0) goto L23b
            goto L26e
        L23b:
            java.util.ArrayList r3 = r3.f10928j
            java.util.Iterator r3 = r3.iterator()
        L241:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L265
            java.lang.Object r4 = r3.next()
            qd.r r4 = (qd.r) r4
            ud.p r15 = r4.f10903j
            if (r15 != 0) goto L252
            goto L26e
        L252:
            pd.k r2 = r15.f13713k
            if (r2 != r11) goto L263
            pd.n r15 = (pd.n) r15
            qd.l r2 = r15.k0()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L263
            goto L201
        L263:
            r2 = 0
            goto L241
        L265:
            r2 = r18
            r4 = r19
            goto L1eb
        L26a:
            r19 = r4
            r2 = r16
        L26e:
            if (r2 == 0) goto L275
            r14.W(r13)
            r2 = 0
            goto L277
        L275:
            r2 = r16
        L277:
            ud.p r13 = new ud.p
            r3 = r16
            r13.<init>(r12, r3)
            r13.I(r9)
            r13.d0(r14)
            if (r2 == 0) goto L291
            md.a r2 = md.a.f8836q
            r13.w(r2)
            goto L291
        L28c:
            r17 = r2
            r19 = r4
            r3 = r12
        L291:
            if (r13 == 0) goto L29c
            a.a.J0(r1, r5, r8, r13)
            r4 = r3
            goto L29e
        L298:
            r17 = r2
            r19 = r4
        L29c:
            r4 = r19
        L29e:
            int r8 = r8 + 1
            r2 = r17
            r3 = 0
            goto L13e
        L2a5:
            r19 = r4
            goto L12b
        L2a9:
            if (r4 == 0) goto L2ae
            be.b.R(r1)
        L2ae:
            return
        L2af:
            boolean r2 = r1.f13722p
            if (r2 == 0) goto L2b4
            goto L2d6
        L2b4:
            ud.p[] r1 = r1.f13731y
            int r2 = r1.length
            r3 = 0
        L2b8:
            if (r3 >= r2) goto L2d6
            r4 = r1[r3]
            boolean r5 = r4 instanceof pd.b
            if (r5 == 0) goto L2d3
            pd.b r4 = (pd.b) r4
            java.lang.Object r5 = r0.f787h
            fe.a r5 = (fe.a) r5
            od.d r6 = r4.i0()
            ud.m r5 = r5.f(r6)
            if (r5 == 0) goto L2d3
            r4.y(r5)
        L2d3:
            int r3 = r3 + 1
            goto L2b8
        L2d6:
            return
    }

    @Override // be.a
    public boolean h(ud.e r8) {
            r7 = this;
            int r0 = r7.f786g
            switch(r0) {
                case 3: goto La;
                default: goto L5;
            }
        L5:
            boolean r8 = super.h(r8)
            return r8
        La:
            b5.k r0 = r8.f13692o
            ud.e r1 = r8.f13701x
            r2 = 1
            if (r1 != r8) goto L19
            boolean r1 = r0.g()
            if (r1 == 0) goto L19
            goto Lbb
        L19:
            ud.e r1 = r8.f13701x
            if (r1 != r8) goto L2e
            boolean r1 = r0.e()
            if (r1 != 0) goto L29
            boolean r0 = r0.f()
            if (r0 == 0) goto L2e
        L29:
            i(r8, r2)
            goto Lbb
        L2e:
            java.util.List r0 = r8.B
            java.util.Iterator r0 = r0.iterator()
        L34:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r0.next()
            ud.e r1 = (ud.e) r1
            java.lang.Object r3 = r7.f787h
            fe.a r3 = (fe.a) r3
            ah.a r4 = new ah.a
            r5 = 25
            r4.<init>(r5)
            r3.a(r8, r1, r4)
            goto L34
        L4f:
            java.util.List r0 = r8.C
            java.util.Iterator r0 = r0.iterator()
        L55:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbb
            java.lang.Object r1 = r0.next()
            ud.r r1 = (ud.r) r1
            md.b r3 = md.b.f8859n
            md.f r4 = r1.f8877g
            oc.b r3 = r4.c(r3)
            nd.w r3 = (nd.w) r3
            if (r3 == 0) goto L74
            ud.p r3 = r3.f9400g
            if (r3 != 0) goto L72
            goto L74
        L72:
            r3 = r2
            goto L75
        L74:
            r3 = 0
        L75:
            md.a r4 = md.a.f8815c0
            md.f r5 = r1.f8877g
            boolean r4 = r5.a(r4)
            if (r3 != 0) goto L81
            if (r4 == 0) goto L55
        L81:
            java.util.List r1 = r1.H
            java.util.stream.Stream r1 = r1.stream()
            com.alibaba.fastjson2.writer.b r3 = new com.alibaba.fastjson2.writer.b
            r4 = 22
            r3.<init>(r4)
            java.util.stream.Stream r1 = r1.map(r3)
            java.util.stream.Collector r3 = java.util.stream.Collectors.toSet()
            java.lang.Object r1 = r1.collect(r3)
            java.util.Set r1 = (java.util.Set) r1
            java.util.Iterator r1 = r1.iterator()
        La0:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r1.next()
            ud.e r3 = (ud.e) r3
            java.lang.Object r4 = r7.f787h
            fe.a r4 = (fe.a) r4
            ah.a r5 = new ah.a
            r6 = 26
            r5.<init>(r6)
            r4.a(r8, r3, r5)
            goto La0
        Lbb:
            return r2
    }
}
