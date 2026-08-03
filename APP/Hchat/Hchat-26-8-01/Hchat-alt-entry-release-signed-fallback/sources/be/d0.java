package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends be.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mh.b f783g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f784h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f785i = 0;

    static {
            java.lang.Class<be.d0> r0 = be.d0.class
            mh.b r0 = mh.d.b(r0)
            be.d0.f783g = r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r0 = java.lang.Double.doubleToLongBits(r0)
            be.d0.f784h = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = java.lang.Float.floatToIntBits(r0)
            long r0 = (long) r0
            be.d0.f785i = r0
            return
    }

    public static void i(ud.l r1, ud.r r2) {
            boolean r0 = r1 instanceof ud.g
            if (r0 == 0) goto L14
            ud.g r1 = (ud.g) r1
            monitor-enter(r1)
            java.util.List r0 = r1.f13710o     // Catch: java.lang.Throwable -> L11
            java.util.List r2 = be.h.Y(r0, r2)     // Catch: java.lang.Throwable -> L11
            r1.f13710o = r2     // Catch: java.lang.Throwable -> L11
            monitor-exit(r1)
            return
        L11:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r2
        L14:
            return
    }

    public static ud.p j(qd.r r2) {
            qd.s r2 = r2.f10923m
            java.util.ArrayList r0 = r2.f10928j
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            goto L18
        Lb:
            java.util.ArrayList r2 = r2.f10928j
            r1 = 0
            java.lang.Object r2 = r2.get(r1)
            qd.r r2 = (qd.r) r2
            ud.p r2 = r2.f10903j
            if (r2 != 0) goto L1a
        L18:
            r2 = 0
            return r2
        L1a:
            r1 = 1
            if (r0 != r1) goto L29
            pd.k r0 = r2.f13713k
            pd.k r1 = pd.k.f10504m
            if (r0 != r1) goto L29
            qd.r r2 = r2.f13714l
            ud.p r2 = j(r2)
        L29:
            return r2
    }

    public static td.b k(qd.r r6, qd.l r7, qd.j r8) {
            qd.n r0 = new qd.n
            r1 = 0
            r0.<init>(r1, r8)
            qd.g r1 = qd.j.f10874h
            r2 = 1
            if (r8 != r1) goto L10
            long r4 = be.d0.f784h
            goto L18
        L10:
            qd.g r1 = qd.j.f10873g
            if (r8 != r1) goto L17
            long r4 = be.d0.f785i
            goto L18
        L17:
            r4 = r2
        L18:
            qd.n r1 = new qd.n
            r1.<init>(r4, r8)
            pd.i r8 = new pd.i
            qd.n r4 = new qd.n
            qd.g r5 = qd.j.f10869c
            r4.<init>(r2, r5)
            r2 = 1
            r8.<init>(r2, r7, r4)
            yd.b r7 = new yd.b
            xe.e r2 = new xe.e
            r2.<init>(r8)
            r7.<init>(r2)
            td.b r8 = new td.b
            r8.<init>(r7, r6, r1, r0)
            return r8
    }

    @Override // be.a
    public final void g(ud.r r23) {
            r22 = this;
            r0 = r23
            boolean r1 = r0.f13722p
            if (r1 == 0) goto L8
            goto L606
        L8:
            xe.l r1 = new xe.l
            r2 = 0
            r1.<init>(r0, r2)
            ud.e r3 = r0.f13718l
            java.util.List r4 = r0.f13732z
            java.util.Iterator r4 = r4.iterator()
        L16:
            boolean r5 = r4.hasNext()
            r6 = 1
            pd.k r7 = pd.k.f10504m
            if (r5 == 0) goto L56d
            java.lang.Object r5 = r4.next()
            ud.a r5 = (ud.a) r5
            java.util.ArrayList r8 = r5.f13674l
            r1.f21568a = r8
            int r9 = r8.size()
            r10 = r2
        L2e:
            if (r10 >= r9) goto L565
            java.lang.Object r11 = r8.get(r10)
            ud.p r11 = (ud.p) r11
            pd.k r12 = r11.f13713k
            int r12 = r12.ordinal()
            pd.k r13 = pd.k.M
            if (r12 == 0) goto L510
            if (r12 == r6) goto L510
            r14 = 2
            if (r12 == r14) goto L510
            r15 = 3
            if (r12 == r15) goto L4c3
            r14 = 8
            if (r12 == r14) goto L497
            r14 = 16
            if (r12 == r14) goto L46e
            r14 = 20
            md.a r15 = md.a.X
            if (r12 == r14) goto L3bb
            r14 = 28
            if (r12 == r14) goto L2b3
            r13 = 38
            if (r12 == r13) goto L239
            r13 = 30
            if (r12 == r13) goto L13f
            r13 = 31
            if (r12 == r13) goto L13f
            switch(r12) {
                case 12: goto Ld3;
                case 13: goto L73;
                case 14: goto L73;
                default: goto L69;
            }
        L69:
            r12 = r2
            r17 = r4
            r18 = r8
            r19 = r9
        L70:
            r8 = r7
            goto L559
        L73:
            qd.r r12 = r11.f13714l
            qd.s r12 = r12.f10923m
            java.util.ArrayList r12 = r12.f10928j
            a7.b r13 = new a7.b
            r14 = 15
            r13.<init>(r14)
            boolean r13 = be.h.g(r12, r13)
            if (r13 == 0) goto L69
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r12)
            java.util.Iterator r12 = r13.iterator()
        L8f:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto Lcf
            java.lang.Object r13 = r12.next()
            qd.r r13 = (qd.r) r13
            ud.p r14 = r13.f10903j
            if (r14 == 0) goto L8f
            ud.p r15 = r11.O()
            qd.l r15 = qd.l.a0(r15)
            boolean r13 = r14.b0(r13, r15)
            if (r13 != 0) goto L8f
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r12 = java.lang.String.valueOf(r14)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Failed to inline CMP insn: "
            r13.<init>(r14)
            r13.append(r11)
            java.lang.String r11 = " into "
            r13.append(r11)
            r13.append(r12)
            java.lang.String r11 = r13.toString()
            r0.L(r11)
            goto L69
        Lcf:
            r1.a(r11)
            goto L69
        Ld3:
            md.b r12 = md.b.E
            md.f r13 = r5.f8877g
            oc.b r12 = r13.c(r12)
            ae.c r12 = (ae.c) r12
            if (r12 != 0) goto Le0
            goto L136
        Le0:
            ae.f r12 = r12.f229g
            qd.r r13 = r11.f13714l
            qd.j r14 = r12.b()
            boolean r15 = r12.c()
            if (r15 == 0) goto Lf1
            java.lang.String r15 = "th"
            goto Lf3
        Lf1:
            java.lang.String r15 = "e"
        Lf3:
            java.lang.String r16 = r13.getName()
            if (r16 != 0) goto Lfc
            r13.p(r15)
        Lfc:
            qd.r r13 = r11.f13714l
            qd.s r13 = r13.f10923m
            java.util.ArrayList r2 = r13.f10928j
            int r2 = r2.size()
            if (r2 != 0) goto L113
            qd.p r2 = new qd.p
            r2.<init>(r15, r14)
            r12.f237f = r2
            r1.a(r11)
            goto L131
        L113:
            boolean r2 = r13.j()
            if (r2 == 0) goto L131
            ud.p r2 = new ud.p
            r2.<init>(r7, r6)
            qd.r r13 = r11.f13714l
            r2.d0(r13)
            qd.p r13 = new qd.p
            r13.<init>(r15, r14)
            r2.I(r13)
            r12.f237f = r13
            r12 = 0
            a.a.J0(r0, r5, r12, r2)
        L131:
            md.b r2 = md.b.f8846a
            r5.A(r11, r2)
        L136:
            r17 = r4
            r18 = r8
            r19 = r9
            r12 = 0
            goto L70
        L13f:
            pd.j r11 = (pd.j) r11
            pd.k r2 = r11.f13713k
            pd.k r12 = pd.k.K
            if (r2 != r12) goto L149
            r2 = 0
            goto L14a
        L149:
            r2 = r6
        L14a:
            qd.l r2 = r11.S(r2)
            md.a r12 = md.a.K
            md.f r13 = r2.f8877g
            boolean r12 = r13.a(r12)
            if (r12 == 0) goto L160
        L158:
            r17 = r4
        L15a:
            r18 = r8
        L15c:
            r19 = r9
            goto L234
        L160:
            boolean r12 = r2 instanceof qd.m
            pd.k r13 = pd.k.f10506o
            if (r12 == 0) goto L170
            r12 = r2
            qd.m r12 = (qd.m) r12
            ud.p r12 = r12.f10904l
            pd.k r12 = r12.f13713k
            if (r12 != r13) goto L170
            goto L158
        L170:
            java.lang.Object r12 = r11.f10495o
            od.c r12 = (od.c) r12
            od.a r14 = r12.f9773g
            qd.j r14 = r14.f9765g
            qd.j r6 = r2.I()
            boolean r17 = java.util.Objects.equals(r14, r6)
            if (r17 == 0) goto L183
            goto L158
        L183:
            r17 = r4
            ud.u r4 = r3.f13688k
            ud.g r12 = r4.h(r12)
            if (r12 != 0) goto L1ad
            qe.x r4 = r4.f13748g
            qe.k r4 = r4.f11002c
            qe.l r4 = r4.d(r6, r14)
            boolean r12 = r4.b()
            if (r12 != 0) goto L15a
            qe.l r12 = qe.l.f10966i
            if (r4 != r12) goto L1a7
            r6.getClass()
            boolean r4 = r6 instanceof qd.c
            if (r4 != 0) goto L1a7
        L1a6:
            goto L15a
        L1a7:
            r18 = r8
        L1a9:
            r19 = r9
            goto L212
        L1ad:
            b5.k r6 = r12.f13708m
            boolean r18 = r6.g()
            if (r18 == 0) goto L1b6
            goto L1a6
        L1b6:
            ud.e r12 = r12.f13706k
            boolean r18 = r3.equals(r12)
            if (r18 == 0) goto L1c9
            r18 = r8
            b5.k r8 = r0.f13719m
            boolean r8 = r8.h()
            if (r8 != 0) goto L1cb
            goto L15c
        L1c9:
            r18 = r8
        L1cb:
            boolean r8 = r6.e()
            if (r8 == 0) goto L1d2
            goto L1a9
        L1d2:
            od.a r8 = r3.f13690m
            java.lang.String r8 = r8.l()
            r19 = r9
            od.a r9 = r12.f13690m
            java.lang.String r9 = r9.l()
            boolean r8 = java.util.Objects.equals(r8, r9)
            if (r8 == 0) goto L1e7
            goto L234
        L1e7:
            int r6 = r6.f488b
            r6 = r6 & 7
            if (r6 != 0) goto L1ee
            goto L212
        L1ee:
            qe.x r4 = r4.f13748g
            qe.k r4 = r4.f11002c
            r4.getClass()
            qd.j r6 = r3.b0()
            qd.j r8 = r12.b0()
            if (r6 == r8) goto L20b
            boolean r9 = java.util.Objects.equals(r6, r8)
            if (r9 == 0) goto L206
            goto L20b
        L206:
            qe.l r4 = r4.c(r6, r8)
            goto L20d
        L20b:
            qe.l r4 = qe.l.f10964g
        L20d:
            qe.l r6 = qe.l.f10965h
            if (r4 != r6) goto L212
            goto L234
        L212:
            pd.j r4 = new pd.j
            r6 = 1
            r4.<init>(r13, r14, r6)
            qd.l r6 = r2.H()
            r4.I(r6)
            md.a r6 = md.a.f8831m
            r4.w(r6)
            r4.w(r15)
            qd.l r4 = qd.l.a0(r4)
            r4.W(r14)
            r11.b0(r2, r4)
            xe.l.i(r0, r2)
        L234:
            r8 = r7
        L235:
            r6 = 1
            r12 = 0
            goto L559
        L239:
            r17 = r4
            r18 = r8
            r19 = r9
            td.a r11 = (td.a) r11
            ud.u r2 = r3.f13688k
            fe.a r2 = r2.f13749h
            ud.m r2 = r2.g(r11)
            java.util.List r4 = r11.f13715m
            boolean r6 = r2 instanceof ud.r
            if (r6 != 0) goto L250
            goto L234
        L250:
            ud.r r2 = (ud.r) r2
            md.a r6 = md.a.H
            md.f r8 = r2.f8877g
            boolean r6 = r8.a(r6)
            if (r6 == 0) goto L234
            md.a r6 = md.a.G
            md.f r8 = r2.f8877g
            boolean r6 = r8.a(r6)
            if (r6 == 0) goto L267
            goto L234
        L267:
            md.b r6 = md.b.f8862q
            md.f r8 = r2.f8877g
            oc.b r6 = r8.c(r6)
            nd.g0 r6 = (nd.g0) r6
            if (r6 == 0) goto L2a9
            od.d r2 = r2.f13717k
            java.util.List r2 = r2.f9779i
            int r2 = r2.size()
            int r4 = r4.size()
            int r2 = java.lang.Math.min(r2, r4)
            r4 = 0
        L284:
            if (r4 >= r2) goto L234
            java.util.BitSet r8 = r6.f9369g
            boolean r8 = r8.get(r4)
            if (r8 == 0) goto L2a6
            qd.l r8 = r11.S(r4)
            md.a r9 = md.a.f8836q
            r8.w(r9)
            boolean r9 = r8 instanceof qd.r
            if (r9 == 0) goto L2a6
            qd.r r8 = (qd.r) r8
            qd.s r8 = r8.f10923m
            qd.k r8 = r8.b()
            r9 = 1
            r8.f10897d = r9
        L2a6:
            int r4 = r4 + 1
            goto L284
        L2a9:
            ae.e r2 = new ae.e
            r6 = 4
            r2.<init>(r6)
            r4.forEach(r2)
            goto L234
        L2b3:
            r17 = r4
            r18 = r8
            r19 = r9
            r2 = r11
            pd.p r2 = (pd.p) r2
            qd.r r4 = r11.f13714l
            ud.p r4 = j(r4)
            if (r4 == 0) goto L234
            pd.k r6 = r4.f13713k
            pd.k r8 = pd.k.D
            if (r6 != r8) goto L234
            r6 = r4
            pd.f r6 = (pd.f) r6
            pd.e r8 = r6.f10487p
            int r8 = r8.f10483p
            r12 = 0
            qd.l r9 = r2.S(r12)
            ud.u r11 = r3.f13688k
            java.lang.Object r9 = xe.m.e(r11, r9)
            boolean r11 = r9 instanceof qd.n
            if (r11 == 0) goto L3b5
            qd.n r9 = (qd.n) r9
            long r11 = r9.f10905l
            int r9 = (int) r11
            if (r8 != r9) goto L3b5
            qd.j r8 = r2.f10529o
            qd.j r9 = r8.g()
            pd.e r11 = r6.f10487p
            qd.h r11 = r11.f10485r
            r11.getClass()
            r9.getClass()
            boolean r12 = r9 instanceof qd.g
            if (r12 == 0) goto L306
            qd.q r12 = r9.o()
            boolean r12 = r11.a(r12)
            if (r12 == 0) goto L306
            r11 = r9
        L306:
            boolean r12 = r11.equals(r9)
            if (r12 != 0) goto L33b
            qd.e r12 = qd.j.f10877k
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L33b
            int r8 = r6.f13716n
            java.lang.String r8 = xe.m.d(r8)
            java.lang.String r12 = java.lang.String.valueOf(r11)
            java.lang.String r14 = java.lang.String.valueOf(r9)
            java.lang.String r15 = ", element type: "
            r20 = r9
            java.lang.String r9 = ", insn element type: "
            r21 = r7
            java.lang.String r7 = "Incorrect type for fill-array insn "
            java.lang.StringBuilder r7 = bc.e.p(r7, r8, r15, r12, r9)
            r7.append(r14)
            java.lang.String r7 = r7.toString()
            r0.K(r7)
            goto L33f
        L33b:
            r21 = r7
            r20 = r9
        L33f:
            boolean r7 = r11.w()
            if (r7 != 0) goto L363
            mh.b r7 = be.d0.f783g
            java.lang.String r8 = "Unknown array element type: {} in mth: {}"
            r7.s(r11, r8, r0)
            boolean r7 = r20.w()
            if (r7 == 0) goto L355
            r9 = r20
            goto L359
        L355:
            qd.j r9 = r11.A()
        L359:
            if (r9 == 0) goto L35d
            r11 = r9
            goto L363
        L35d:
            java.lang.String r0 = "Null array element type"
            ah.a.k(r0)
            return
        L363:
            java.util.List r6 = r6.i0(r11)
            pd.g r7 = new pd.g
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r8 = r6.size()
            r7.<init>(r8, r11)
            qd.r r2 = r2.f13714l
            qd.r r2 = r2.c0()
            r7.d0(r2)
            java.util.Iterator r2 = r6.iterator()
        L37f:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L3ae
            java.lang.Object r6 = r2.next()
            qd.n r6 = (qd.n) r6
            ud.l r8 = r3.Y(r6)
            if (r8 == 0) goto L3a6
            pd.j r6 = new pd.j
            od.c r9 = r8.f()
            r12 = 0
            r6.<init>(r13, r9, r12)
            qd.m r6 = qd.l.Z(r6)
            r7.I(r6)
            i(r8, r0)
            goto L37f
        L3a6:
            qd.l r6 = r6.H()
            r7.I(r6)
            goto L37f
        L3ae:
            a.a.J0(r0, r5, r10, r7)
            r1.a(r4)
            goto L3b7
        L3b5:
            r21 = r7
        L3b7:
            r8 = r21
            goto L235
        L3bb:
            r17 = r4
            r21 = r7
            r18 = r8
            r19 = r9
            pd.j r11 = (pd.j) r11
            r12 = 0
            qd.l r2 = r11.S(r12)
            boolean r4 = r2.R()
            if (r4 == 0) goto L3d4
            r11.w(r15)
            goto L3b7
        L3d4:
            java.lang.Object r4 = r11.f10495o
            qd.j r4 = (qd.j) r4
            ud.u r6 = r3.f13688k
            qd.j r7 = r2.I()
            qd.g r8 = qd.j.f10868b
            boolean r8 = r7.equals(r4)
            if (r8 == 0) goto L3e9
            r4 = 0
            r6 = 1
            goto L3f7
        L3e9:
            qe.x r6 = r6.f13748g
            qe.k r6 = r6.f11002c
            qe.l r4 = r6.d(r7, r4)
            boolean r4 = r4.c()
            r6 = 1
            r4 = r4 ^ r6
        L3f7:
            if (r4 != 0) goto L414
            qd.r r4 = r11.f13714l
            qd.j r7 = r2.I()
            r4.W(r7)
            ud.p r7 = new ud.p
            r8 = r21
            r7.<init>(r8, r6)
            r7.d0(r4)
            r7.I(r2)
            a.a.J0(r0, r5, r10, r7)
            goto L235
        L414:
            r8 = r21
            r12 = 0
            qd.l r2 = r11.S(r12)
            r2.getClass()
            boolean r4 = r2 instanceof qd.r
            if (r4 == 0) goto L453
            qd.r r2 = (qd.r) r2
            qd.s r2 = r2.f10923m
            if (r2 == 0) goto L453
            java.util.ArrayList r4 = r2.f10928j
            int r4 = r4.size()
            r6 = 1
            if (r4 != r6) goto L453
            boolean r4 = r2.j()
            if (r4 != 0) goto L453
            qd.r r2 = r2.f10927i
            ud.p r2 = r2.f10903j
            if (r2 == 0) goto L453
            pd.k r4 = r2.f13713k
            pd.k r6 = pd.k.A
            if (r4 != r6) goto L453
            r4 = r2
            pd.j r4 = (pd.j) r4
            java.lang.Object r4 = r4.f10495o
            qd.j r4 = (qd.j) r4
            java.lang.Object r6 = r11.f10495o
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L453
            goto L454
        L453:
            r2 = 0
        L454:
            if (r2 == 0) goto L235
            ud.p r4 = new ud.p
            r6 = 1
            r4.<init>(r8, r6)
            qd.r r6 = r2.f13714l
            r4.d0(r6)
            r12 = 0
            qd.l r6 = r2.S(r12)
            r4.I(r6)
            a.a.K0(r0, r5, r2, r4)
            goto L235
        L46e:
            r17 = r4
            r18 = r8
            r19 = r9
            r8 = r7
            pd.s r11 = (pd.s) r11
            pd.r r2 = r11.l0()
            int[] r2 = r2.f10532p
            int r4 = r2.length
            r6 = 0
        L47f:
            if (r6 >= r4) goto L235
            r7 = r2[r6]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 1
            ud.l r7 = r3.X(r7, r9)
            if (r7 == 0) goto L494
            r11.m0(r6, r7)
            i(r7, r0)
        L494:
            int r6 = r6 + 1
            goto L47f
        L497:
            r12 = r2
            r17 = r4
            r18 = r8
            r19 = r9
            r8 = r7
            qd.l r2 = r11.S(r12)
            qd.j r4 = r2.I()
            qd.g r6 = qd.j.f10869c
            if (r4 != r6) goto L235
            qd.r r4 = r11.f13714l
            qd.j r4 = r4.I()
            r4.getClass()
            boolean r6 = r4 instanceof qd.g
            if (r6 == 0) goto L235
            qd.r r6 = r11.f13714l
            td.b r2 = k(r6, r2, r4)
            a.a.J0(r0, r5, r10, r2)
            goto L235
        L4c3:
            r17 = r4
            r18 = r8
            r19 = r9
            r8 = r7
            pd.a r11 = (pd.a) r11
            java.util.List r2 = r11.f13715m
            int r2 = r2.size()
            if (r2 != r14) goto L502
            r6 = 1
            qd.l r2 = r11.S(r6)
            r2.getClass()
            boolean r4 = r2 instanceof qd.n
            if (r4 == 0) goto L235
            r4 = r2
            qd.n r4 = (qd.n) r4
            ud.l r4 = r3.Y(r4)
            if (r4 == 0) goto L235
            pd.j r6 = new pd.j
            od.c r7 = r4.f()
            r12 = 0
            r6.<init>(r13, r7, r12)
            qd.m r6 = qd.l.Z(r6)
            boolean r2 = r11.b0(r2, r6)
            if (r2 == 0) goto L235
            i(r4, r0)
            goto L235
        L502:
            java.lang.String r0 = java.lang.String.valueOf(r11)
            java.lang.String r1 = "Invalid args count in insn: "
            java.lang.String r0 = r1.concat(r0)
            ah.a.k(r0)
            return
        L510:
            r17 = r4
            r18 = r8
            r19 = r9
            r8 = r7
            pd.k r2 = r11.f13713k
            pd.k r4 = pd.k.f10499h
            if (r2 != r4) goto L529
            r2 = r11
            pd.d r2 = (pd.d) r2
            java.lang.String r2 = r2.f10477o
            r6 = 1
            ud.l r2 = r3.X(r2, r6)
        L527:
            r12 = 0
            goto L543
        L529:
            r6 = 1
            pd.k r4 = pd.k.f10500i
            if (r2 != r4) goto L538
            r2 = r11
            pd.c r2 = (pd.c) r2
            qd.j r2 = r2.f10476o
            ud.l r2 = r3.X(r2, r6)
            goto L527
        L538:
            r12 = 0
            qd.l r2 = r11.S(r12)
            qd.n r2 = (qd.n) r2
            ud.l r2 = r3.Y(r2)
        L543:
            if (r2 == 0) goto L559
            pd.j r4 = new pd.j
            od.c r7 = r2.f()
            r4.<init>(r13, r7, r12)
            qd.r r7 = r11.f13714l
            r4.d0(r7)
            a.a.J0(r0, r5, r10, r4)
            i(r2, r0)
        L559:
            int r10 = r10 + 1
            r7 = r8
            r2 = r12
            r4 = r17
            r8 = r18
            r9 = r19
            goto L2e
        L565:
            r12 = r2
            r17 = r4
            r1.c()
            goto L16
        L56d:
            r12 = r2
            r8 = r7
            java.util.List r2 = r0.f13732z
            java.util.Iterator r2 = r2.iterator()
        L575:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5bd
            java.lang.Object r3 = r2.next()
            ud.a r3 = (ud.a) r3
            java.util.ArrayList r3 = r3.f13674l
            r1.f21568a = r3
            java.util.Iterator r3 = r3.iterator()
        L589:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5b9
            java.lang.Object r4 = r3.next()
            ud.p r4 = (ud.p) r4
            pd.k r5 = r4.f13713k
            int r5 = r5.ordinal()
            r7 = 10
            if (r5 == r7) goto L5b5
            r7 = 29
            if (r5 == r7) goto L5b5
            r7 = 36
            if (r5 == r7) goto L5b5
            md.a r5 = md.a.f8840u
            md.f r7 = r4.f8877g
            boolean r5 = r7.a(r5)
            if (r5 == 0) goto L589
            r1.a(r4)
            goto L589
        L5b5:
            r1.a(r4)
            goto L589
        L5b9:
            r1.c()
            goto L575
        L5bd:
            java.util.List r1 = r0.f13732z
            java.util.Iterator r1 = r1.iterator()
            r2 = r12
        L5c4:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L604
            java.lang.Object r3 = r1.next()
            ud.a r3 = (ud.a) r3
            java.util.ArrayList r4 = r3.f13674l
            java.util.Iterator r4 = r4.iterator()
        L5d6:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5c4
            java.lang.Object r5 = r4.next()
            ud.p r5 = (ud.p) r5
            pd.k r7 = r5.f13713k
            if (r7 != r8) goto L5d6
            md.f r7 = r5.f8877g
            boolean r7 = r7.f()
            if (r7 == 0) goto L5d6
            qd.r r7 = r5.f13714l
            if (r7 == 0) goto L5d6
            qd.s r7 = r7.f10923m
            java.util.ArrayList r7 = r7.f10928j
            int r7 = r7.size()
            if (r7 != 0) goto L5d6
            xe.l.j(r0, r5)
            xe.l.g(r0, r3, r5)
            r2 = r6
            goto L5c4
        L604:
            if (r2 != 0) goto L5bd
        L606:
            return
    }

    @Override // be.a
    public final boolean h(ud.e r4) {
            r3 = this;
            ud.u r0 = r4.f13688k
            bc.g r0 = r0.f13742a
            boolean r0 = r0.B
            if (r0 == 0) goto L2b
            oc.c r0 = oc.c.f9755a
            md.f r1 = r4.f8877g
            oc.b r0 = r1.c(r0)
            pc.d r0 = (pc.d) r0
            r3.m(r4, r0)
            java.util.List r0 = r4.f13698u
            be.b0 r1 = new be.b0
            r2 = 0
            r1.<init>(r3, r4, r2)
            r0.forEach(r1)
            java.util.List r0 = r4.f13697t
            be.b0 r1 = new be.b0
            r2 = 1
            r1.<init>(r3, r4, r2)
            r0.forEach(r1)
        L2b:
            r4 = 1
            return r4
    }

    public final nc.a l(ud.e r4, nc.a r5) {
            r3 = this;
            int r0 = r5.f9341g
            java.lang.Object r1 = r5.f9342h
            r2 = 18
            if (r0 != r2) goto L2e
            nc.b r1 = (nc.b) r1
            java.util.LinkedHashMap r0 = r1.f9345c
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            nc.a r2 = (nc.a) r2
            nc.a r2 = r3.l(r4, r2)
            r1.setValue(r2)
            goto L14
        L2e:
            r2 = 17
            if (r0 != r2) goto L48
            java.util.List r1 = (java.util.List) r1
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L42
            be.c0 r5 = new be.c0
            r5.<init>(r3, r4)
            r1.replaceAll(r5)
        L42:
            nc.a r4 = new nc.a
            r4.<init>(r2, r1)
            return r4
        L48:
            r0 = 1
            ud.l r4 = r4.X(r1, r0)
            if (r4 == 0) goto L5a
            nc.a r5 = new nc.a
            r0 = 13
            od.c r4 = r4.f()
            r5.<init>(r0, r4)
        L5a:
            return r5
    }

    public final void m(ud.e r4, pc.d r5) {
            r3 = this;
            if (r5 != 0) goto L3
            goto L43
        L3:
            java.util.HashMap r5 = r5.f10463g
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L43
            java.lang.Object r0 = r5.next()
            nc.b r0 = (nc.b) r0
            int r1 = r0.f9343a
            r2 = 3
            if (r1 != r2) goto L1f
            goto Ld
        L1f:
            java.util.LinkedHashMap r0 = r0.f9345c
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L29:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Ld
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            nc.a r2 = (nc.a) r2
            nc.a r2 = r3.l(r4, r2)
            r1.setValue(r2)
            goto L29
        L43:
            return
    }
}
