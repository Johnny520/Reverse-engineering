package ae;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231a;

    public /* synthetic */ e(int r1) {
            r0 = this;
            r0.f231a = r1
            r0.<init>()
            return
    }

    public /* synthetic */ e(qe.n r1) {
            r0 = this;
            r1 = 25
            r0.f231a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.f231a
            r1 = 3
            md.a r2 = md.a.H
            r3 = 25
            r4 = 0
            r5 = 1
            r6 = 0
            md.a r7 = md.a.f8840u
            md.a r8 = md.a.f8838s
            switch(r0) {
                case 0: goto L4c3;
                case 1: goto L2b9;
                case 2: goto L240;
                case 3: goto L22b;
                case 4: goto L215;
                case 5: goto L1d3;
                case 6: goto L1c1;
                case 7: goto L177;
                case 8: goto L164;
                case 9: goto L15e;
                case 10: goto L158;
                case 11: goto L14b;
                case 12: goto L12e;
                case 13: goto L121;
                case 14: goto L11b;
                case 15: goto L10b;
                case 16: goto L103;
                case 17: goto Lff;
                case 18: goto Lf7;
                case 19: goto Lf1;
                case 20: goto Le7;
                case 21: goto Ldf;
                case 22: goto Ld7;
                case 23: goto Lc6;
                case 24: goto Lc0;
                case 25: goto L74;
                case 26: goto L6a;
                case 27: goto L1d;
                case 28: goto L17;
                default: goto L11;
            }
        L11:
            ud.r r15 = (ud.r) r15
            r15.e0()
            return
        L17:
            ud.e r15 = (ud.e) r15
            r15.W()
            return
        L1d:
            wc.a r15 = (wc.a) r15
            java.lang.String r0 = r15.f20773a
            if (r0 == 0) goto L60
            java.lang.String r1 = "dex-input."
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L60
            java.lang.String r1 = r15.f20774b
            if (r1 == 0) goto L5a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L5a
            java.util.List r1 = r15.f20775c
            java.util.stream.Stream r1 = r1.stream()
            me.a r15 = r15.f20777e
            java.util.stream.Stream r15 = r1.map(r15)
            java.util.stream.Collector r1 = java.util.stream.Collectors.toList()
            java.lang.Object r15 = r15.collect(r1)
            java.util.List r15 = (java.util.List) r15
            if (r15 == 0) goto L4e
            goto L69
        L4e:
            java.lang.String r15 = "Plugin option values is null, option: "
            java.lang.String r1 = ", plugin: dex-input"
            java.lang.String r15 = eh.a.n(r15, r0, r1)
            j8.o.t(r15)
            goto L69
        L5a:
            java.lang.String r15 = "Plugin option description not set, plugin: dex-input"
            j8.o.t(r15)
            goto L69
        L60:
            java.lang.String r15 = "Plugin option name should start with plugin id: 'dex-input.', option: "
            java.lang.String r15 = wb.en.g(r15, r0)
            j8.o.t(r15)
        L69:
            return
        L6a:
            qe.y r15 = (qe.y) r15
            qd.l r0 = r15.f11005h
            qd.j r15 = r15.f11006i
            r0.W(r15)
            return
        L74:
            qd.s r15 = (qd.s) r15
            java.util.ArrayList r0 = r15.f10929k
            if (r0 != 0) goto L7c
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        L7c:
            java.util.Iterator r0 = r0.iterator()
        L80:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lbf
            java.lang.Object r1 = r0.next()
            pd.q r1 = (pd.q) r1
            p4.t r2 = r15.f10930l
            java.lang.Object r2 = r2.f10225i
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2
            qd.r r3 = r1.f13714l
            qd.s r3 = r3.f10923m
            p4.t r3 = r3.f10930l
            java.lang.Object r3 = r3.f10225i
            java.util.LinkedHashSet r3 = (java.util.LinkedHashSet) r3
            r2.addAll(r3)
            java.util.List r1 = r1.f13715m
            java.util.Iterator r1 = r1.iterator()
        La5:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L80
            java.lang.Object r3 = r1.next()
            qd.l r3 = (qd.l) r3
            qd.r r3 = (qd.r) r3
            qd.s r3 = r3.f10923m
            p4.t r3 = r3.f10930l
            java.lang.Object r3 = r3.f10225i
            java.util.LinkedHashSet r3 = (java.util.LinkedHashSet) r3
            r2.addAll(r3)
            goto La5
        Lbf:
            return
        Lc0:
            qd.r r15 = (qd.r) r15
            be.b.M(r15)
            return
        Lc6:
            java.util.Map r15 = (java.util.Map) r15
            java.util.Set r15 = r15.entrySet()
            ce.n r0 = new ce.n
            r1 = 19
            r0.<init>(r1)
            r15.removeIf(r0)
            return
        Ld7:
            ud.a r15 = (ud.a) r15
            md.a r0 = md.a.f8845z
            r15.w(r0)
            return
        Ldf:
            md.i r15 = (md.i) r15
            md.e r15 = (md.e) r15
            r15.w(r7)
            return
        Le7:
            ff.e r15 = (ff.e) r15
            mh.b r0 = ff.a.f3923c
            java.lang.String r1 = "Loading dex: {}"
            r0.x(r15, r1)
            return
        Lf1:
            ud.r r15 = (ud.r) r15
            r15.D(r8)
            return
        Lf7:
            ud.r r15 = (ud.r) r15
            md.a r0 = md.a.f8817e0
            r15.w(r0)
            return
        Lff:
            com.alibaba.fastjson2.JSONObject.f(r15)
            return
        L103:
            ud.a r15 = (ud.a) r15
            java.util.ArrayList r15 = r15.f13674l
            be.h.U(r15)
            return
        L10b:
            ud.a r15 = (ud.a) r15
            ud.p r0 = a.a.c0(r15)
            boolean r1 = r0 instanceof pd.t
            if (r1 == 0) goto L11a
            pd.t r0 = (pd.t) r0
            r0.i0(r15)
        L11a:
            return
        L11b:
            ud.a r15 = (ud.a) r15
            ce.m.l(r15)
            return
        L121:
            ud.a r15 = (ud.a) r15
            java.util.List r0 = r15.f13676n
            ce.k r1 = new ce.k
            r1.<init>(r15, r6)
            r0.forEach(r1)
            return
        L12e:
            ud.a r15 = (ud.a) r15
            md.b r0 = md.b.f8871z
            r15.E(r0)
            md.a r0 = md.a.f8827k
            r15.D(r0)
            md.a r0 = md.a.f8829l
            r15.D(r0)
            r15.f13678p = r4
            r15.f13681s = r4
            r15.f13680r = r4
            java.util.List r15 = r15.f13683u
            r15.clear()
            return
        L14b:
            ae.h r15 = (ae.h) r15
            java.util.List r15 = r15.f245i
            a7.b r0 = new a7.b
            r0.<init>(r3)
            r15.removeIf(r0)
            return
        L158:
            ud.a r15 = (ud.a) r15
            r15.H()
            return
        L15e:
            bsh.classpath.BshClassPath r15 = (bsh.classpath.BshClassPath) r15
            bsh.classpath.BshClassPath.b(r15)
            return
        L164:
            java.nio.file.Path r15 = (java.nio.file.Path) r15
            java.nio.file.Files.delete(r15)     // Catch: java.lang.Exception -> L16a
            goto L176
        L16a:
            r0 = move-exception
            mh.b r1 = bf.b.f857a
            java.lang.String r2 = "Failed to delete file {}"
            java.nio.file.Path r15 = r15.toAbsolutePath()
            r1.s(r15, r2, r0)
        L176:
            return
        L177:
            ud.e r15 = (ud.e) r15
            md.f r0 = r15.f8877g
            md.b r1 = md.b.f8853h
            oc.b r0 = r0.c(r1)
            nd.a r0 = (nd.a) r0
            ud.e r0 = r0.f9346g
            java.util.List r3 = r15.f13703z
            ud.e r4 = r0.a0()
            java.util.List r3 = be.h.Y(r3, r4)
            r15.f13703z = r3
            java.util.List r3 = r0.B
            java.util.List r3 = be.h.Y(r3, r15)
            r0.B = r3
            r15.E(r1)
            r15.D(r8)
            java.util.List r0 = r15.f13697t
            java.util.Iterator r0 = r0.iterator()
        L1a5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1bb
            java.lang.Object r1 = r0.next()
            ud.r r1 = (ud.r) r1
            boolean r3 = r1.W()
            if (r3 == 0) goto L1a5
            r1.D(r2)
            goto L1a5
        L1bb:
            java.lang.String r0 = "Anonymous mark cleared"
            r15.I(r0)
            return
        L1c1:
            ud.e r15 = (ud.e) r15
            be.h0.k(r15)     // Catch: java.lang.Exception -> L1c7 java.lang.StackOverflowError -> L1c9
            goto L1d2
        L1c7:
            r0 = move-exception
            goto L1ca
        L1c9:
            r0 = move-exception
        L1ca:
            r15.getClass()
            java.lang.String r1 = "Anonymous visitor error"
            xe.h.a(r15, r1, r0)
        L1d2:
            return
        L1d3:
            ud.p r15 = (ud.p) r15
            pd.k r0 = r15.f13713k
            int r0 = r0.ordinal()
            if (r0 == 0) goto L214
            if (r0 == r1) goto L214
            r1 = 8
            if (r0 == r1) goto L214
            r1 = 15
            if (r0 == r1) goto L214
            if (r0 == r3) goto L214
            r1 = 27
            if (r0 == r1) goto L214
            java.util.List r15 = r15.f13715m
            java.util.Iterator r15 = r15.iterator()
        L1f3:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L214
            java.lang.Object r0 = r15.next()
            qd.l r0 = (qd.l) r0
            r0.getClass()
            boolean r1 = r0 instanceof qd.n
            if (r1 == 0) goto L1f3
            qd.j r1 = r0.I()
            qd.g r2 = qd.j.f10868b
            if (r1 == r2) goto L1f3
            md.a r1 = md.a.W
            r0.w(r1)
            goto L1f3
        L214:
            return
        L215:
            qd.l r15 = (qd.l) r15
            md.a r0 = md.a.f8836q
            r15.w(r0)
            boolean r0 = r15 instanceof qd.r
            if (r0 == 0) goto L22a
            qd.r r15 = (qd.r) r15
            qd.s r15 = r15.f10923m
            qd.k r15 = r15.b()
            r15.f10897d = r5
        L22a:
            return
        L22b:
            qd.l r15 = (qd.l) r15
            r15.getClass()
            boolean r0 = r15 instanceof qd.r
            if (r0 == 0) goto L23f
            qd.r r15 = (qd.r) r15
            qd.s r0 = r15.f10923m
            if (r0 == 0) goto L23f
            r0.k(r15)
            r15.f10923m = r4
        L23f:
            return
        L240:
            ud.r r15 = (ud.r) r15
            java.util.List r0 = r15.S()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L24e
            goto L2b8
        L24e:
            b5.k r0 = r15.f13719m
            boolean r1 = r15.W()
            if (r1 == 0) goto L25e
            boolean r1 = r0.g()
            if (r1 == 0) goto L25e
            r1 = r5
            goto L25f
        L25e:
            r1 = r6
        L25f:
            od.d r2 = r15.f13717k
            boolean r2 = r2.e()
            if (r2 == 0) goto L26e
            boolean r0 = r0.h()
            if (r0 == 0) goto L26e
            goto L26f
        L26e:
            r5 = r6
        L26f:
            if (r1 != 0) goto L273
            if (r5 == 0) goto L2b8
        L273:
            java.util.List r0 = r15.f13732z
            boolean r0 = a.a.l0(r0)
            if (r0 != 0) goto L27c
            goto L2b8
        L27c:
            if (r5 == 0) goto L282
            r15.w(r8)
            goto L2b8
        L282:
            boolean r0 = r15.X()
            if (r0 == 0) goto L2b8
            ud.e r0 = r15.f13718l
            java.util.List r0 = r0.f13697t
            java.util.Iterator r0 = r0.iterator()
        L290:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2ab
            java.lang.Object r1 = r0.next()
            ud.r r1 = (ud.r) r1
            if (r1 == r15) goto L290
            boolean r2 = r1.W()
            if (r2 == 0) goto L290
            boolean r1 = r1.X()
            if (r1 != 0) goto L290
            goto L2b8
        L2ab:
            oc.c r0 = oc.c.f9755a
            md.f r1 = r15.f8877g
            boolean r0 = r1.b(r0)
            if (r0 != 0) goto L2b8
            r15.w(r8)
        L2b8:
            return
        L2b9:
            ud.r r15 = (ud.r) r15
            boolean r0 = r15.f13722p
            ud.e r3 = r15.f13718l
            if (r0 != 0) goto L4c2
            md.f r0 = r15.f8877g
            boolean r0 = r0.a(r8)
            if (r0 == 0) goto L2cb
            goto L4c2
        L2cb:
            b5.k r0 = r15.f13719m
            boolean r0 = r0.i()
            if (r0 != 0) goto L2d5
            goto L4c2
        L2d5:
            ud.u r0 = r3.f13688k
            bc.g r4 = r0.f13742a
            boolean r4 = r4.f725t
            if (r4 == 0) goto L3c9
            java.util.List r4 = r15.f13732z
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            be.m0 r10 = new be.m0
            r11 = 6
            r10.<init>(r11, r9)
            r4.forEach(r10)
            int r4 = r9.size()
            if (r4 != r5) goto L3c9
            java.lang.Object r4 = r9.get(r6)
            ud.p r4 = (ud.p) r4
            pd.k r9 = r4.f13713k
            pd.k r10 = pd.k.f10507p
            if (r9 != r10) goto L30e
            qd.l r9 = r4.S(r6)
            r9.getClass()
            boolean r10 = r9 instanceof qd.m
            if (r10 == 0) goto L30e
            qd.m r9 = (qd.m) r9
            ud.p r4 = r9.f10904l
        L30e:
            pd.k r9 = r4.f13713k
            pd.k r10 = pd.k.O
            if (r9 == r10) goto L316
            goto L3c9
        L316:
            r9 = r4
            pd.n r9 = (pd.n) r9
            int r10 = r9.f10525o
            r11 = 5
            if (r10 != r11) goto L320
            goto L3c9
        L320:
            od.d r9 = r9.f10526p
            od.d r10 = r15.f13717k
            ud.r r11 = r0.i(r9)
            if (r11 != 0) goto L32c
            goto L3c9
        L32c:
            b5.k r12 = r11.f13719m
            boolean r13 = r12.h()
            if (r13 == 0) goto L336
            goto L3c9
        L336:
            java.util.List r9 = r9.f9779i
            int r9 = r9.size()
            java.util.List r13 = r10.f9779i
            int r13 = r13.size()
            if (r9 == r13) goto L346
            goto L3c9
        L346:
            ud.e r9 = r11.f13718l
            boolean r9 = r3.equals(r9)
            if (r9 != 0) goto L350
            goto L3c9
        L350:
            java.util.List r4 = r4.f13715m
            java.util.Iterator r4 = r4.iterator()
        L356:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto L369
            java.lang.Object r9 = r4.next()
            qd.l r9 = (qd.l) r9
            boolean r9 = be.b.T(r9)
            if (r9 != 0) goto L356
            goto L3c9
        L369:
            boolean r1 = r12.g()
            if (r1 != 0) goto L377
            bc.g r0 = r0.f13742a
            r0.getClass()
            be.e.i(r11, r5)
        L377:
            java.lang.String r0 = r10.f9784n
            od.d r1 = r11.f13717k
            java.lang.String r1 = r1.f9784n
            boolean r1 = java.util.Objects.equals(r1, r0)
            if (r1 != 0) goto L3a4
            r11.d0(r0)
            md.b r0 = md.b.f8847b
            md.f r1 = r11.f8877g
            oc.b r0 = r1.c(r0)
            nd.f0 r0 = (nd.f0) r0
            if (r0 == 0) goto L393
            goto L39f
        L393:
            nd.f0 r0 = new nd.f0
            r0.<init>()
            java.lang.String r1 = ""
            r0.f9365g = r1
            r11.y(r0)
        L39f:
            java.lang.String r1 = "merged with bridge method [inline-methods]"
            r0.b(r1)
        L3a4:
            nd.y r0 = new nd.y
            r0.<init>(r15)
            r11.y(r0)
            md.b r0 = md.b.f8863r
            r11.A(r15, r0)
            java.lang.String r0 = r10.f9781k
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Method merged with bridge method: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r11.I(r0)
            r15.w(r8)
            goto L4c2
        L3c9:
            boolean r4 = r15.W()
            if (r4 == 0) goto L4c2
            md.a r4 = md.a.f8815c0
            md.f r9 = r15.f8877g
            boolean r4 = r9.a(r4)
            if (r4 != 0) goto L3e1
            md.f r4 = r15.f8877g
            boolean r2 = r4.a(r2)
            if (r2 == 0) goto L4c2
        L3e1:
            ud.p r2 = a.a.f0(r15)
            if (r2 == 0) goto L4c2
            java.util.List r4 = r15.S()
            java.util.Iterator r9 = r4.iterator()
            r10 = r6
        L3f0:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L439
            java.lang.Object r11 = r9.next()
            qd.r r11 = (qd.r) r11
            qd.j r12 = r11.I()
            boolean r13 = r12.v()
            if (r13 != 0) goto L407
            goto L3f0
        L407:
            ud.e r13 = r0.g(r12)
            if (r13 != 0) goto L426
            od.a r12 = od.a.e(r0, r12)
            od.a r13 = r12.f9769k
            if (r13 == 0) goto L3f0
            od.a r13 = r3.f13690m
            java.lang.String r13 = r13.f()
            od.a r12 = r12.f9769k
            java.lang.String r12 = r12.f9768j
            boolean r12 = r13.startsWith(r12)
            if (r12 == 0) goto L3f0
            goto L434
        L426:
            md.f r12 = r13.f8877g
            boolean r12 = r12.a(r8)
            if (r12 != 0) goto L434
            boolean r12 = be.b.L(r13)
            if (r12 == 0) goto L3f0
        L434:
            r11.w(r7)
            r10 = r5
            goto L3f0
        L439:
            if (r10 == 0) goto L4c2
            pd.k r5 = r2.f13713k
            pd.k r7 = pd.k.S
            if (r5 != r7) goto L4c2
            td.a r2 = (td.a) r2
            int r5 = r2.f13120p
            if (r5 != r1) goto L4c2
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L4c2
            java.lang.Object r1 = r4.get(r6)
            qd.r r1 = (qd.r) r1
            qd.j r1 = r1.I()
            ud.e r3 = r3.f13701x
            od.a r3 = r3.f13690m
            qd.j r3 = r3.f9765g
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L466
            nd.g0.b(r15, r6)
        L466:
            int r1 = r4.size()
        L46a:
            if (r6 >= r1) goto L484
            java.lang.Object r3 = r4.get(r6)
            qd.r r3 = (qd.r) r3
            qd.s r3 = r3.f10923m
            if (r3 == 0) goto L481
            java.util.ArrayList r3 = r3.f10928j
            int r3 = r3.size()
            if (r3 != 0) goto L481
            nd.g0.b(r15, r6)
        L481:
            int r6 = r6 + 1
            goto L46a
        L484:
            od.d r1 = r2.f13119o
            ud.r r0 = r0.i(r1)
            if (r0 == 0) goto L4c2
            nd.y r1 = new nd.y
            r1.<init>(r0)
            r15.y(r1)
            r15.w(r8)
            mh.b r1 = re.c.f11948g
            java.util.List r1 = r0.H
            java.util.List r2 = r15.H
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L4a5
            r1 = r2
            goto L4b9
        L4a5:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L4ac
            goto L4b9
        L4ac:
            java.util.TreeSet r3 = new java.util.TreeSet
            r3.<init>(r1)
            r3.addAll(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
        L4b9:
            r1.remove(r15)
            r0.H = r1
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r15.H = r0
        L4c2:
            return
        L4c3:
            ud.a r15 = (ud.a) r15
            r15.w(r7)
            return
    }
}
