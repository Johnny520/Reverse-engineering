package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f851c;

    public /* synthetic */ w(be.x r1, ud.r r2, ud.r r3) {
            r0 = this;
            r1 = 0
            r0.f849a = r1
            r0.<init>()
            r0.f850b = r2
            r0.f851c = r3
            return
    }

    public /* synthetic */ w(be.y r2, ud.r r3) {
            r1 = this;
            r0 = 1
            r1.f849a = r0
            r1.<init>()
            r1.f851c = r2
            r1.f850b = r3
            return
    }

    public /* synthetic */ w(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f849a = r2
            r0.f850b = r1
            r0.f851c = r3
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.f849a
            switch(r0) {
                case 0: goto L49f;
                case 1: goto L26c;
                case 2: goto L25e;
                case 3: goto L250;
                case 4: goto L242;
                case 5: goto L21f;
                case 6: goto L211;
                case 7: goto L203;
                case 8: goto L1da;
                case 9: goto Ldf;
                case 10: goto Ld1;
                case 11: goto L84;
                case 12: goto L27;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r14.f850b
            ud.r r0 = (ud.r) r0
            java.lang.Object r1 = r14.f851c
            java.util.BitSet r1 = (java.util.BitSet) r1
            ae.f r15 = (ae.f) r15
            ud.a r2 = r15.f234c
            if (r2 != 0) goto L21
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r1 = "Null handler block in: "
            java.lang.String r15 = r1.concat(r15)
            r0.I(r15)
            goto L26
        L21:
            int r15 = r2.f13672j
            r1.set(r15)
        L26:
            return
        L27:
            java.lang.Object r0 = r14.f850b
            p4.t r0 = (p4.t) r0
            java.lang.Object r1 = r14.f851c
            ud.p[] r1 = (ud.p[]) r1
            gf.a r15 = (gf.a) r15
            java.lang.Object r2 = r0.f10224h
            ud.r r2 = (ud.r) r2
            int r3 = r15.f4498h
            r15.a()     // Catch: java.lang.Exception -> L3f
            ud.p r15 = r0.s(r15)     // Catch: java.lang.Exception -> L3f
            goto L71
        L3f:
            r0 = move-exception
            md.f r4 = r2.f8877g
            md.b r5 = md.b.f8848c
            boolean r4 = r4.b(r5)
            java.lang.String r6 = java.lang.String.valueOf(r15)
            java.lang.String r7 = "Failed to decode insn: "
            java.lang.String r6 = r7.concat(r6)
            xe.h.a(r2, r6, r0)
            if (r4 != 0) goto L76
            ud.p r15 = new ud.p
            pd.k r2 = pd.k.Q
            r4 = 0
            r15.<init>(r2, r4)
            nd.p r2 = new nd.p
            java.lang.String r4 = r0.getMessage()
            java.lang.String r6 = "decode failed: "
            java.lang.String r4 = wb.en.g(r6, r4)
            r2.<init>(r4, r0)
            r15.x(r5, r2)
        L71:
            r15.f13716n = r3
            r1[r3] = r15
            return
        L76:
            af.g r1 = new af.g
            java.lang.String r15 = java.lang.String.valueOf(r15)
            java.lang.String r15 = r7.concat(r15)
            r1.<init>(r15, r0)
            throw r1
        L84:
            java.lang.Object r0 = r14.f850b
            ud.r r0 = (ud.r) r0
            java.lang.Object r1 = r14.f851c
            qd.j r1 = (qd.j) r1
            qd.s r15 = (qd.s) r15
            qd.j r2 = r15.d()
            if (r2 == 0) goto Ld0
            boolean r3 = r2.w()
            if (r3 == 0) goto Ld0
            ud.e r3 = r0.f13718l
            ud.u r3 = r3.f13688k
            qe.x r3 = r3.f13748g
            qe.k r3 = r3.f11002c
            qe.l r3 = r3.d(r2, r1)
            qe.l r4 = qe.l.f10969l
            if (r3 == r4) goto Lb0
            boolean r3 = r3.c()
            if (r3 == 0) goto Ld0
        Lb0:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r15 = r15.c(r0)
            java.lang.String r3 = ", code="
            java.lang.String r4 = ", for "
            java.lang.String r5 = "Incorrect type for immutable var: ssa="
            java.lang.StringBuilder r1 = bc.e.p(r5, r2, r3, r1, r4)
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.K(r15)
        Ld0:
            return
        Ld1:
            java.lang.Object r0 = r14.f850b
            ud.r r0 = (ud.r) r0
            java.lang.Object r1 = r14.f851c
            ke.e r1 = (ke.e) r1
            ud.j r15 = (ud.j) r15
            x6.d.h0(r0, r1, r15)
            return
        Ldf:
            java.lang.Object r0 = r14.f850b
            fd.a r0 = (fd.a) r0
            java.lang.Object r1 = r14.f851c
            fc.f r1 = (fc.f) r1
            nd.b0 r15 = (nd.b0) r15
            boolean r2 = r15 instanceof ud.e
            md.a r3 = md.a.f8838s
            if (r2 == 0) goto L123
            ud.e r15 = (ud.e) r15
            fd.a r2 = new fd.a     // Catch: java.lang.Exception -> L11b
            fd.a r4 = r0.f3888b     // Catch: java.lang.Exception -> L11b
            if (r4 != 0) goto Lf8
            r4 = r0
        Lf8:
            r2.<init>(r15, r4)     // Catch: java.lang.Exception -> L11b
            r1.f()     // Catch: java.lang.Exception -> L11b
            ud.e r4 = r2.f3887a     // Catch: java.lang.Exception -> L11b
            md.f r4 = r4.f8877g     // Catch: java.lang.Exception -> L11b
            boolean r3 = r4.a(r3)     // Catch: java.lang.Exception -> L11b
            if (r3 == 0) goto L109
            goto L110
        L109:
            r2.b(r1)     // Catch: java.lang.Exception -> L11b
            r3 = 0
            r2.a(r1, r3)     // Catch: java.lang.Exception -> L11b
        L110:
            java.util.HashSet r0 = r0.f3894h     // Catch: java.lang.Exception -> L11b
            java.util.Set r1 = r2.l()     // Catch: java.lang.Exception -> L11b
            r0.addAll(r1)     // Catch: java.lang.Exception -> L11b
            goto L1d3
        L11b:
            r0 = move-exception
            java.lang.String r1 = "Inner class code generation error"
            xe.h.a(r15, r1, r0)
            goto L1d3
        L123:
            ud.r r15 = (ud.r) r15
            java.lang.String r2 = "Method not inlined, still used in: "
            ud.e r4 = r0.f3887a
            ud.u r4 = r4.f13688k
            bc.g r4 = r4.f13742a
            bc.b r4 = r4.E
            int r5 = r4.ordinal()
            if (r5 == 0) goto L14e
            r6 = 1
            if (r5 == r6) goto L14e
            r2 = 2
            if (r5 == r2) goto L1a2
            r2 = 3
            if (r5 != r2) goto L13f
            goto L1a2
        L13f:
            java.lang.String r15 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Unexpected decompilation mode: "
            java.lang.String r15 = r0.concat(r15)
            bsh.j.g(r15)
            goto L1d3
        L14e:
            md.b r4 = md.b.f8859n
            md.f r5 = r15.f8877g
            oc.b r4 = r5.c(r4)
            nd.w r4 = (nd.w) r4
            if (r4 == 0) goto L1a2
            ud.p r4 = r4.f9400g
            if (r4 != 0) goto L15f
            goto L1a2
        L15f:
            java.util.List r4 = r15.H     // Catch: java.lang.Exception -> L16b
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Exception -> L16b
            if (r4 == 0) goto L16d
            r15.w(r3)     // Catch: java.lang.Exception -> L16b
            goto L1d3
        L16b:
            r2 = move-exception
            goto L19d
        L16d:
            java.util.List r4 = r15.H     // Catch: java.lang.Exception -> L16b
            java.util.stream.Stream r4 = r4.stream()     // Catch: java.lang.Exception -> L16b
            ce.n r5 = new ce.n     // Catch: java.lang.Exception -> L16b
            r6 = 6
            r5.<init>(r6)     // Catch: java.lang.Exception -> L16b
            java.util.stream.Stream r4 = r4.filter(r5)     // Catch: java.lang.Exception -> L16b
            java.util.stream.Collector r5 = java.util.stream.Collectors.toList()     // Catch: java.lang.Exception -> L16b
            java.lang.Object r4 = r4.collect(r5)     // Catch: java.lang.Exception -> L16b
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Exception -> L16b
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Exception -> L16b
            if (r5 == 0) goto L191
            r15.w(r3)     // Catch: java.lang.Exception -> L16b
            goto L1d3
        L191:
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch: java.lang.Exception -> L16b
            java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.Exception -> L16b
            r15.I(r2)     // Catch: java.lang.Exception -> L16b
            goto L1a2
        L19d:
            java.lang.String r3 = "Failed to check method usage"
            r15.M(r3, r2)
        L1a2:
            java.lang.StringBuilder r2 = r1.f3882a
            int r2 = r2.length()
            int r3 = r0.f3895i
            if (r2 == r3) goto L1af
            r1.f()
        L1af:
            int r2 = r1.f3884c
            r0.i(r1, r15)     // Catch: java.lang.Exception -> L1b5
            goto L1d3
        L1b5:
            r0 = move-exception
            ud.e r3 = r15.f13718l
            ud.e r3 = r3.a0()
            md.a r4 = md.a.f8818f0
            md.f r3 = r3.f8877g
            boolean r3 = r3.a(r4)
            java.lang.String r4 = "Method generation error"
            if (r3 != 0) goto L1d4
            xe.h.a(r15, r4, r0)
            jd.c.d(r1, r15)
            r1.f3884c = r2
            r1.t()
        L1d3:
            return
        L1d4:
            af.g r15 = new af.g
            r15.<init>(r4, r0)
            throw r15
        L1da:
            java.lang.Object r0 = r14.f850b
            fd.a r0 = (fd.a) r0
            java.lang.Object r1 = r14.f851c
            fc.b r1 = (fc.b) r1
            od.a r15 = (od.a) r15
            java.lang.String r2 = "import "
            r1.r(r2)
            ud.e r0 = r0.f3887a
            ud.u r0 = r0.f13688k
            ud.e r0 = r0.f(r15)
            if (r0 == 0) goto L1f6
            r1.j(r0)
        L1f6:
            java.lang.String r15 = r15.f()
            r1.e(r15)
            r15 = 59
            r1.d(r15)
            return
        L203:
            java.lang.Object r0 = r14.f850b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r14.f851c
            java.lang.reflect.Method[] r1 = (java.lang.reflect.Method[]) r1
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            com.alibaba.fastjson2.util.BeanUtils.b(r0, r1, r15)
            return
        L211:
            java.lang.Object r0 = r14.f850b
            java.lang.annotation.Annotation r0 = (java.lang.annotation.Annotation) r0
            java.lang.Object r1 = r14.f851c
            com.alibaba.fastjson2.codec.FieldInfo r1 = (com.alibaba.fastjson2.codec.FieldInfo) r1
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            com.alibaba.fastjson2.reader.ObjectReaderProvider.f(r0, r1, r15)
            return
        L21f:
            java.lang.Object r0 = r14.f850b
            ud.a r0 = (ud.a) r0
            java.lang.Object r1 = r14.f851c
            ud.a r1 = (ud.a) r1
            ud.a r15 = (ud.a) r15
            java.util.List r2 = r15.f13676n
            r2.remove(r0)
            ce.m.j(r15, r1)
            ud.p r2 = a.a.c0(r15)
            boolean r3 = r2 instanceof pd.t
            if (r3 == 0) goto L23e
            pd.t r2 = (pd.t) r2
            r2.j0(r0, r1)
        L23e:
            r15.H()
            return
        L242:
            java.lang.Object r0 = r14.f850b
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r14.f851c
            java.util.HashSet r1 = (java.util.HashSet) r1
            bsh.classpath.BshClassPath r15 = (bsh.classpath.BshClassPath) r15
            bsh.classpath.BshClassPath.h(r0, r1, r15)
            return
        L250:
            java.lang.Object r0 = r14.f850b
            bsh.classpath.BshClassPath r0 = (bsh.classpath.BshClassPath) r0
            java.lang.Object r1 = r14.f851c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.String r15 = (java.lang.String) r15
            bsh.classpath.BshClassPath.e(r0, r1, r15)
            return
        L25e:
            java.lang.Object r0 = r14.f850b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r14.f851c
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            bsh.ClassGeneratorUtil.d(r0, r1, r15)
            return
        L26c:
            java.lang.Object r0 = r14.f851c
            be.y r0 = (be.y) r0
            java.lang.Object r1 = r14.f850b
            ud.r r1 = (ud.r) r1
            ud.p r15 = (ud.p) r15
            boolean r2 = r15 instanceof pd.b
            if (r2 == 0) goto L49e
            pd.b r15 = (pd.b) r15
            od.d r2 = r15.i0()
            java.util.List r2 = r2.f9779i
            int r2 = r2.size()
            if (r2 != 0) goto L28a
            goto L49e
        L28a:
            ud.u r2 = r0.f852g
            fe.a r2 = r2.f13749h
            ud.m r2 = r2.g(r15)
            if (r2 != 0) goto L2b2
            int r0 = r15.j0()
            java.util.ArrayList r1 = be.y.j(r15, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            od.d r3 = r15.i0()
            java.util.List r3 = r3.f9779i
            boolean r3 = be.y.m(r2, r3)
            if (r3 == 0) goto L49e
            be.y.i(r15, r0, r1, r2)
            goto L49e
        L2b2:
            boolean r3 = r2.v()
            if (r3 == 0) goto L2cd
            java.util.List r3 = r2.c()
            java.lang.Object r3 = xe.s.i(r3)
            qd.j r3 = (qd.j) r3
            if (r3 == 0) goto L2cd
            boolean r3 = r3 instanceof qd.a
            if (r3 == 0) goto L2cd
            md.a r3 = md.a.V
            r15.w(r3)
        L2cd:
            od.d r3 = r15.i0()
            boolean r4 = r15 instanceof td.a
            if (r4 == 0) goto L2e3
            r4 = r15
            td.a r4 = (td.a) r4
            boolean r4 = r4.l0()
            if (r4 == 0) goto L2e3
            ud.e r4 = r1.f13718l
            qd.j r4 = r4.f13693p
            goto L2f2
        L2e3:
            qd.l r4 = r15.k0()
            if (r4 == 0) goto L2ee
            qd.j r4 = r4.I()
            goto L2f2
        L2ee:
            od.a r4 = r3.f9780j
            qd.j r4 = r4.f9765g
        L2f2:
            ud.u r5 = r0.f852g
            fe.a r5 = r5.f13749h
            r5.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.k(r4, r3, r6)
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L309
            goto L49e
        L309:
            od.d r3 = r15.i0()
            od.a r3 = r3.f9780j
            qd.j r3 = r3.f9765g
            qd.l r4 = r15.k0()
            if (r4 == 0) goto L31c
            qd.j r3 = r4.I()
            goto L32a
        L31c:
            pd.k r4 = r15.f13713k
            pd.k r5 = pd.k.S
            if (r4 != r5) goto L32a
            qd.r r4 = r15.f13714l
            if (r4 == 0) goto L32a
            qd.j r3 = r4.I()
        L32a:
            ud.u r4 = r0.f852g
            fe.a r4 = r4.f13750i
            java.util.Map r3 = r4.i(r3)
            ud.u r4 = r4.f3922a
            fe.a r4 = r4.f13749h
            ud.m r4 = r4.g(r15)
            java.util.List r5 = r15.f13715m
            r7 = 0
            r8 = 1
            if (r4 != 0) goto L344
            java.util.Map r4 = java.util.Collections.EMPTY_MAP
            goto L3af
        L344:
            java.util.HashMap r9 = new java.util.HashMap
            int r10 = r5.size()
            int r10 = r10 + r8
            r9.<init>(r10)
            qd.j r10 = r4.e()
            qd.r r11 = r15.f13714l
            if (r11 == 0) goto L36a
            if (r10 == 0) goto L36a
            boolean r12 = r10.w()
            if (r12 != 0) goto L35f
            goto L36a
        L35f:
            boolean r12 = r10 instanceof qd.c
            if (r12 == 0) goto L36a
            qd.j r11 = r11.I()
            r9.put(r10, r11)
        L36a:
            java.util.List r10 = r4.c()
            int r10 = r10.size()
            int r5 = r5.size()
            int r11 = r15.j0()
            int r5 = r5 - r11
            int r5 = java.lang.Math.min(r10, r5)
            r10 = r7
        L380:
            if (r10 >= r5) goto L3ae
            java.util.List r11 = r4.c()
            java.lang.Object r11 = r11.get(r10)
            qd.j r11 = (qd.j) r11
            int r12 = r15.j0()
            int r12 = r12 + r10
            qd.l r12 = r15.S(r12)
            if (r12 == 0) goto L3ab
            if (r11 == 0) goto L3ab
            boolean r13 = r11.w()
            if (r13 != 0) goto L3a0
            goto L3ab
        L3a0:
            boolean r13 = r11 instanceof qd.c
            if (r13 == 0) goto L3ab
            qd.j r12 = r12.I()
            r9.put(r11, r12)
        L3ab:
            int r10 = r10 + 1
            goto L380
        L3ae:
            r4 = r9
        L3af:
            if (r3 == 0) goto L3d7
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L3b8
            goto L3d7
        L3b8:
            if (r4 == 0) goto L3d8
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L3c1
            goto L3d8
        L3c1:
            java.util.HashMap r5 = new java.util.HashMap
            int r9 = r3.size()
            int r10 = r4.size()
            int r10 = r10 + r9
            r5.<init>(r10)
            r5.putAll(r3)
            r5.putAll(r4)
            r3 = r5
            goto L3d8
        L3d7:
            r3 = r4
        L3d8:
            ud.m r2 = r0.n(r2, r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r6.size()
            int r5 = r5 + r8
            r4.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        L3ea:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L3fe
            java.lang.Object r6 = r5.next()
            ud.m r6 = (ud.m) r6
            ud.m r6 = r0.n(r6, r3)
            r4.add(r6)
            goto L3ea
        L3fe:
            r4.add(r2)
            int r3 = r15.j0()
            java.util.ArrayList r5 = be.y.j(r15, r3)
            boolean r6 = r0.l(r2, r4, r5)
            if (r6 == 0) goto L411
            r9 = r5
            goto L466
        L411:
            int r6 = r5.size()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r5)
            java.util.List r10 = r2.c()
            boolean r10 = be.y.m(r9, r10)
            if (r10 == 0) goto L42b
            boolean r10 = r0.l(r2, r4, r9)
            if (r10 == 0) goto L42b
            goto L466
        L42b:
            r10 = r7
            r11 = r10
        L42d:
            if (r10 >= r6) goto L452
            java.lang.Object r12 = r9.get(r10)
            qd.j r12 = (qd.j) r12
            java.util.List r13 = r2.c()
            java.lang.Object r13 = r13.get(r10)
            qd.j r13 = (qd.j) r13
            boolean r12 = r12.t()
            if (r12 != 0) goto L44f
            boolean r12 = r13.t()
            if (r12 == 0) goto L44f
            r9.set(r10, r13)
            r11 = r8
        L44f:
            int r10 = r10 + 1
            goto L42d
        L452:
            if (r11 == 0) goto L45b
            boolean r0 = r0.l(r2, r4, r9)
            if (r0 == 0) goto L45b
            goto L466
        L45b:
            if (r6 != r8) goto L462
            java.util.List r9 = r2.c()
            goto L466
        L462:
            java.util.List r9 = r2.c()
        L466:
            ud.e r0 = r1.f13718l
            ud.u r0 = r0.f13688k
            qe.x r0 = r0.f13748g
            qe.k r0 = r0.f11002c
            java.util.List r1 = r2.c()
            int r2 = r9.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r2)
        L47b:
            if (r7 >= r2) goto L49b
            java.lang.Object r6 = r1.get(r7)
            qd.j r6 = (qd.j) r6
            java.lang.Object r8 = r9.get(r7)
            qd.j r8 = (qd.j) r8
            qe.l r10 = r0.d(r6, r8)
            qe.l r11 = qe.l.f10966i
            if (r10 != r11) goto L495
            r4.add(r6)
            goto L498
        L495:
            r4.add(r8)
        L498:
            int r7 = r7 + 1
            goto L47b
        L49b:
            be.y.i(r15, r3, r5, r4)
        L49e:
            return
        L49f:
            java.lang.Object r0 = r14.f850b
            ud.r r0 = (ud.r) r0
            java.lang.Object r1 = r14.f851c
            ud.r r1 = (ud.r) r1
            ud.e r2 = r1.f13718l
            ud.p r15 = (ud.p) r15
            pd.k r3 = r15.f13713k
            int r3 = r3.ordinal()
            r4 = 38
            if (r3 == r4) goto L4e6
            switch(r3) {
                case 30: goto L4b9;
                case 31: goto L4b9;
                case 32: goto L4b9;
                case 33: goto L4b9;
                case 34: goto L4e6;
                default: goto L4b8;
            }
        L4b8:
            goto L512
        L4b9:
            pd.j r15 = (pd.j) r15
            java.lang.Object r15 = r15.f10495o
            od.c r15 = (od.c) r15
            ud.e r3 = r0.f13718l
            ud.u r3 = r3.f13688k
            ud.g r15 = r3.h(r15)
            if (r15 == 0) goto L512
            java.util.List r3 = r15.f13710o
            java.util.List r3 = be.h.Z(r3, r1, r0)
            r15.f13710o = r3
            ud.e r15 = r15.f13706k
            java.util.List r3 = r15.C
            java.util.List r1 = be.h.Z(r3, r1, r0)
            r15.C = r1
            java.util.List r1 = r15.B
            ud.e r0 = r0.f13718l
            java.util.List r0 = be.h.Z(r1, r2, r0)
            r15.B = r0
            goto L512
        L4e6:
            pd.b r15 = (pd.b) r15
            od.d r15 = r15.i0()
            ud.e r3 = r0.f13718l
            ud.u r3 = r3.f13688k
            ud.r r15 = r3.i(r15)
            if (r15 == 0) goto L512
            java.util.List r3 = r15.H
            java.util.List r3 = be.h.Z(r3, r1, r0)
            r15.H = r3
            ud.e r15 = r15.f13718l
            java.util.List r3 = r15.C
            java.util.List r1 = be.h.Z(r3, r1, r0)
            r15.C = r1
            java.util.List r1 = r15.B
            ud.e r0 = r0.f13718l
            java.util.List r0 = be.h.Z(r1, r2, r0)
            r15.B = r0
        L512:
            return
    }
}
