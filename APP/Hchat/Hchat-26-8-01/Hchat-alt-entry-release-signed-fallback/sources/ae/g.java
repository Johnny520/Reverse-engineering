package ae;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f242b;

    public /* synthetic */ g(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f241a = r2
            r0.f242b = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f241a
            switch(r0) {
                case 0: goto L354;
                case 1: goto L34a;
                case 2: goto L325;
                case 3: goto L30d;
                case 4: goto L2ec;
                case 5: goto L2e2;
                case 6: goto L2d8;
                case 7: goto L2cc;
                case 8: goto L2bf;
                case 9: goto L2b1;
                case 10: goto L2a7;
                case 11: goto L29d;
                case 12: goto L28f;
                case 13: goto L281;
                case 14: goto L277;
                case 15: goto L26d;
                case 16: goto L53;
                case 17: goto L49;
                case 18: goto L3f;
                case 19: goto L35;
                case 20: goto L2b;
                case 21: goto L19;
                case 22: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r12.f242b
            java.util.function.Consumer r0 = (java.util.function.Consumer) r0
            yd.b r13 = (yd.b) r13
            r13.P(r0)
            return
        Lf:
            java.lang.Object r0 = r12.f242b
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            java.lang.String r13 = (java.lang.String) r13
            r0.append(r13)
            return
        L19:
            java.lang.Object r0 = r12.f242b
            xe.l r0 = (xe.l) r0
            be.a r13 = (be.a) r13
            java.lang.Object r0 = r0.f21570c
            java.util.IdentityHashMap r0 = (java.util.IdentityHashMap) r0
            java.lang.String r1 = r13.e()
            r0.put(r13, r1)
            return
        L2b:
            java.lang.Object r0 = r12.f242b
            te.b r0 = (te.b) r0
            java.util.function.Consumer r13 = (java.util.function.Consumer) r13
            r13.accept(r0)
            return
        L35:
            java.lang.Object r0 = r12.f242b
            td.b r0 = (td.b) r0
            ud.p r13 = (ud.p) r13
            r0.V(r13)
            return
        L3f:
            java.lang.Object r0 = r12.f242b
            pd.n r0 = (pd.n) r0
            qd.l r13 = (qd.l) r13
            r0.I(r13)
            return
        L49:
            java.lang.Object r0 = r12.f242b
            f5.g r0 = (f5.g) r0
            qd.r r13 = (qd.r) r13
            r0.c(r13)
            return
        L53:
            java.lang.Object r0 = r12.f242b
            qe.n r0 = (qe.n) r0
            qd.s r13 = (qd.s) r13
            p4.t r1 = r13.f10930l
            java.lang.Object r2 = r1.f10225i
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2
            r2.clear()
            qd.r r2 = r13.f10927i
            qd.s r3 = r2.f10923m
            r4 = 0
            if (r3 == 0) goto L6e
            qd.j r3 = r3.d()
            goto L7c
        L6e:
            md.a r3 = md.a.N
            md.f r5 = r2.f8877g
            boolean r3 = r5.a(r3)
            if (r3 == 0) goto L7b
            qd.j r3 = r2.f10902i
            goto L7c
        L7b:
            r3 = r4
        L7c:
            r5 = 0
            md.a r6 = md.a.Y
            r7 = 1
            if (r3 == 0) goto L8c
            qe.g r2 = new qe.g
            r2.<init>(r7, r5, r3)
            qe.n.i(r1, r2)
            goto L1e6
        L8c:
            ud.p r3 = r2.f10903j
            if (r3 == 0) goto L1dc
            qd.r r8 = r3.f13714l
            if (r8 != 0) goto L96
            goto L1dc
        L96:
            pd.k r2 = r3.f13713k
            int r2 = r2.ordinal()
            if (r2 == 0) goto L1cb
            r8 = 12
            if (r2 == r8) goto L193
            r8 = 20
            if (r2 == r8) goto L17d
            r8 = 34
            if (r2 == r8) goto L135
            r8 = 38
            if (r2 == r8) goto Lf3
            r8 = 29
            if (r2 == r8) goto Le3
            r8 = 30
            if (r2 == r8) goto Lc4
            qd.r r2 = r3.f13714l
            qd.j r2 = r2.f10902i
            qe.g r3 = new qe.g
            r3.<init>(r7, r5, r2)
            qe.n.i(r1, r3)
            goto L1e6
        Lc4:
            pd.j r3 = (pd.j) r3
            qd.r r2 = r3.f13714l
            qd.j r2 = r2.f10902i
            boolean r8 = r2.c()
            if (r8 == 0) goto Ld8
            qe.h r7 = new qe.h
            ud.u r8 = r0.f10976g
            r7.<init>(r8, r3, r2)
            goto Lde
        Ld8:
            qe.g r3 = new qe.g
            r3.<init>(r7, r5, r2)
            r7 = r3
        Lde:
            qe.n.i(r1, r7)
            goto L1e6
        Le3:
            pd.j r3 = (pd.j) r3
            java.lang.Object r2 = r3.f10495o
            qd.j r2 = (qd.j) r2
            qe.g r3 = new qe.g
            r3.<init>(r7, r5, r2)
            qe.n.i(r1, r3)
            goto L1e6
        Lf3:
            td.a r3 = (td.a) r3
            int r2 = r3.f13120p
            if (r2 != r7) goto Lfb
            r2 = r7
            goto Lfc
        Lfb:
            r2 = r5
        Lfc:
            od.d r3 = r3.f13119o
            if (r2 == 0) goto L127
            ud.u r2 = r0.f10976g
            od.a r8 = r3.f9780j
            ud.e r2 = r2.f(r8)
            if (r2 == 0) goto L127
            md.a r8 = md.a.f8838s
            md.f r9 = r2.f8877g
            boolean r8 = r9.a(r8)
            if (r8 == 0) goto L127
            md.b r8 = md.b.f8853h
            md.f r2 = r2.f8877g
            oc.b r2 = r2.c(r8)
            nd.a r2 = (nd.a) r2
            if (r2 == 0) goto L127
            int r8 = r2.f9348i
            if (r8 != r7) goto L127
            qd.j r2 = r2.f9347h
            goto L12b
        L127:
            od.a r2 = r3.f9780j
            qd.j r2 = r2.f9765g
        L12b:
            qe.g r3 = new qe.g
            r3.<init>(r7, r5, r2)
            qe.n.i(r1, r3)
            goto L1e6
        L135:
            pd.n r3 = (pd.n) r3
            od.d r2 = r3.f10526p
            qd.j r2 = r2.f9778h
            ud.u r8 = r0.f10976g
            fe.a r8 = r8.f13749h
            ud.m r8 = r8.g(r3)
            if (r8 == 0) goto L152
            qd.j r8 = r8.e()
            if (r8 == 0) goto L152
            boolean r9 = r8.b()
            if (r9 == 0) goto L152
            goto L153
        L152:
            r8 = r4
        L153:
            if (r8 == 0) goto L173
            boolean r9 = r8.c()
            if (r9 == 0) goto L172
            int r9 = r3.f10525o
            java.util.List r10 = r3.f13715m
            int r10 = r10.size()
            if (r10 == 0) goto L173
            if (r9 == r7) goto L173
            r10 = 5
            if (r9 == r10) goto L173
            qe.i r2 = new qe.i
            ud.u r7 = r0.f10976g
            r2.<init>(r7, r3, r8)
            goto L179
        L172:
            r2 = r8
        L173:
            qe.g r3 = new qe.g
            r3.<init>(r7, r5, r2)
            r2 = r3
        L179:
            qe.n.i(r1, r2)
            goto L1e6
        L17d:
            md.f r2 = r3.f8877g
            boolean r2 = r2.a(r6)
            if (r2 == 0) goto L186
            goto L1e6
        L186:
            qe.f r2 = new qe.f
            ud.u r7 = r0.f10976g
            pd.j r3 = (pd.j) r3
            r2.<init>(r7, r3)
            qe.n.i(r1, r2)
            goto L1e6
        L193:
            md.b r2 = md.b.E
            md.f r8 = r3.f8877g
            oc.b r2 = r8.c(r2)
            ae.c r2 = (ae.c) r2
            if (r2 == 0) goto L1be
            ae.f r2 = r2.f229g
            java.util.ArrayList r2 = r2.f232a
            java.util.Iterator r2 = r2.iterator()
        L1a7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1e6
            java.lang.Object r3 = r2.next()
            od.a r3 = (od.a) r3
            qe.g r8 = new qe.g
            qd.j r3 = r3.f9765g
            r8.<init>(r7, r5, r3)
            qe.n.i(r1, r8)
            goto L1a7
        L1be:
            qe.g r2 = new qe.g
            qd.r r3 = r3.f13714l
            qd.j r3 = r3.f10902i
            r2.<init>(r7, r5, r3)
            qe.n.i(r1, r2)
            goto L1e6
        L1cb:
            qd.l r2 = r3.S(r5)
            qd.n r2 = (qd.n) r2
            qe.g r3 = new qe.g
            qd.j r2 = r2.f10902i
            r3.<init>(r7, r5, r2)
            qe.n.i(r1, r3)
            goto L1e6
        L1dc:
            qe.g r3 = new qe.g
            qd.j r2 = r2.f10902i
            r3.<init>(r7, r5, r2)
            qe.n.i(r1, r3)
        L1e6:
            java.util.ArrayList r13 = r13.f10928j
            java.util.Iterator r13 = r13.iterator()
        L1ec:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L26c
            java.lang.Object r2 = r13.next()
            qd.r r2 = (qd.r) r2
            ud.p r3 = r2.f10903j
            if (r3 != 0) goto L1ff
        L1fc:
            r10 = r4
            goto L268
        L1ff:
            boolean r7 = r3 instanceof pd.b
            r8 = 2
            if (r7 == 0) goto L252
            r7 = r3
            pd.b r7 = (pd.b) r7
            qd.l r9 = r7.k0()
            if (r9 != 0) goto L20f
        L20d:
            r10 = r4
            goto L24f
        L20f:
            ud.u r10 = r0.f10976g
            fe.a r10 = r10.f13749h
            ud.m r10 = r10.g(r7)
            if (r10 != 0) goto L21a
            goto L20d
        L21a:
            if (r9 == r2) goto L23e
            int r9 = r7.T(r2)
            int r11 = r7.j0()
            int r9 = r9 - r11
            java.util.List r10 = r10.c()
            java.lang.Object r9 = r10.get(r9)
            qd.j r9 = (qd.j) r9
            boolean r10 = r9.c()
            if (r10 != 0) goto L236
            goto L20d
        L236:
            qe.j r10 = new qe.j
            ud.u r11 = r0.f10976g
            r10.<init>(r11, r7, r2, r9)
            goto L24f
        L23e:
            boolean r7 = r10 instanceof ud.r
            if (r7 == 0) goto L20d
            ud.r r10 = (ud.r) r10
            od.a r7 = fe.a.h(r10)
            qe.g r10 = new qe.g
            qd.j r7 = r7.f9765g
            r10.<init>(r8, r5, r7)
        L24f:
            if (r10 == 0) goto L252
            goto L268
        L252:
            pd.k r7 = r3.f13713k
            pd.k r9 = pd.k.A
            if (r7 != r9) goto L261
            md.f r3 = r3.f8877g
            boolean r3 = r3.a(r6)
            if (r3 == 0) goto L261
            goto L1fc
        L261:
            qe.g r10 = new qe.g
            qd.j r2 = r2.f10902i
            r10.<init>(r8, r5, r2)
        L268:
            qe.n.i(r1, r10)
            goto L1ec
        L26c:
            return
        L26d:
            java.lang.Object r0 = r12.f242b
            ne.a r0 = (ne.a) r0
            ud.e r13 = (ud.e) r13
            r0.h(r13)
            return
        L277:
            java.lang.Object r0 = r12.f242b
            na.e r0 = (na.e) r0
            java.lang.String r13 = (java.lang.String) r13
            r0.d(r13)
            return
        L281:
            java.lang.Object r0 = r12.f242b
            java.util.Map r0 = (java.util.Map) r0
            oc.b r13 = (oc.b) r13
            oc.a r1 = r13.a()
            r0.put(r1, r13)
            return
        L28f:
            java.lang.Object r0 = r12.f242b
            oc.b r0 = (oc.b) r0
            java.util.Map r13 = (java.util.Map) r13
            oc.a r1 = r0.a()
            r13.put(r1, r0)
            return
        L29d:
            java.lang.Object r0 = r12.f242b
            oc.a r0 = (oc.a) r0
            java.util.Map r13 = (java.util.Map) r13
            r13.remove(r0)
            return
        L2a7:
            java.lang.Object r0 = r12.f242b
            java.util.Set r0 = (java.util.Set) r0
            ud.a r13 = (ud.a) r13
            r0.add(r13)
            return
        L2b1:
            java.lang.Object r0 = r12.f242b
            hb.r r0 = (hb.r) r0
            ud.h r13 = (ud.h) r13
            java.lang.Object r0 = r0.f5457d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r13)
            return
        L2bf:
            java.lang.Object r0 = r12.f242b
            fd.h r0 = (fd.h) r0
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r0.f3918g = r13
            return
        L2cc:
            java.lang.Object r0 = r12.f242b
            ae.f r0 = (ae.f) r0
            ud.a r13 = (ud.a) r13
            java.util.ArrayList r0 = r0.f235d
            r0.add(r13)
            return
        L2d8:
            java.lang.Object r0 = r12.f242b
            ze.c r0 = (ze.c) r0
            ud.a r13 = (ud.a) r13
            r0.a(r13)
            return
        L2e2:
            java.lang.Object r0 = r12.f242b
            bsh.GeneratedClass r0 = (bsh.GeneratedClass) r0
            java.lang.String r13 = (java.lang.String) r13
            bsh.This.a(r0, r13)
            return
        L2ec:
            java.lang.Object r0 = r12.f242b
            be.h0 r0 = (be.h0) r0
            ud.e r13 = (ud.e) r13
            be.h0.k(r13)     // Catch: java.lang.Exception -> L2f6 java.lang.StackOverflowError -> L2f8
            goto L301
        L2f6:
            r1 = move-exception
            goto L2f9
        L2f8:
            r1 = move-exception
        L2f9:
            r13.getClass()
            java.lang.String r2 = "Anonymous visitor error"
            xe.h.a(r13, r2, r1)
        L301:
            java.util.List r13 = r13.f13699v
            ae.g r1 = new ae.g
            r2 = 4
            r1.<init>(r0, r2)
            r13.forEach(r1)
            return
        L30d:
            java.lang.Object r0 = r12.f242b
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            qd.l r13 = (qd.l) r13
            qd.r r13 = (qd.r) r13
            qd.s r13 = r13.f10923m
            boolean r1 = r0.add(r13)
            if (r1 == 0) goto L324
            java.util.List r13 = r13.g()
            be.b.v(r13, r0)
        L324:
            return
        L325:
            java.lang.Object r0 = r12.f242b
            qd.k r0 = (qd.k) r0
            qd.s r13 = (qd.s) r13
            qd.k r1 = r13.f10931m
            if (r1 == 0) goto L346
            qd.k r1 = r13.b()
            boolean r2 = r1.f10899f
            r3 = 1
            if (r2 == 0) goto L33a
            r0.f10899f = r3
        L33a:
            boolean r2 = r1.f10898e
            if (r2 == 0) goto L340
            r0.f10898e = r3
        L340:
            boolean r1 = r1.f10897d
            if (r1 == 0) goto L346
            r0.f10897d = r3
        L346:
            r13.m(r0)
            return
        L34a:
            java.lang.Object r0 = r12.f242b
            be.d r0 = (be.d) r0
            ud.e r13 = (ud.e) r13
            r0.h(r13)
            return
        L354:
            java.lang.Object r0 = r12.f242b
            ae.h r0 = (ae.h) r0
            ae.f r13 = (ae.f) r13
            r13.f238g = r0
            return
    }
}
