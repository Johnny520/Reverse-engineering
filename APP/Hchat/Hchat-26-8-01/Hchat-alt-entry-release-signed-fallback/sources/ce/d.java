package ce;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.util.function.Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ud.r f1636b;

    public /* synthetic */ d(ud.r r1, int r2) {
            r0 = this;
            r0.f1635a = r2
            r0.f1636b = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f1635a
            switch(r0) {
                case 0: goto L1df;
                case 1: goto L1bd;
                case 2: goto L19a;
                case 3: goto Le1;
                case 4: goto L48;
                case 5: goto L1a;
                case 6: goto L12;
                default: goto L5;
            }
        L5:
            ud.p r12 = (ud.p) r12
            ud.r r0 = r11.f1636b
            xe.l.l(r0, r12)
            md.a r0 = md.a.f8838s
            r12.w(r0)
            return
        L12:
            ud.r r0 = r11.f1636b
            ud.p r12 = (ud.p) r12
            xe.l.h(r0, r12)
            return
        L1a:
            qd.s r12 = (qd.s) r12
            p4.t r0 = r12.f10930l
            java.lang.Object r0 = r0.f10224h
            qd.j r0 = (qd.j) r0
            boolean r0 = r0.w()
            if (r0 != 0) goto L37
            ud.r r0 = r11.f1636b
            java.lang.String r1 = r12.c(r0)
            java.lang.String r2 = "Type inference failed for: "
            java.lang.String r1 = r2.concat(r1)
            r0.L(r1)
        L37:
            qd.k r0 = r12.b()
            qd.j r0 = r0.f10895b
            if (r0 != 0) goto L47
            qd.k r12 = r12.b()
            qd.h r0 = qd.j.f10887u
            r12.f10895b = r0
        L47:
            return
        L48:
            qd.s r12 = (qd.s) r12
            java.util.ArrayList r12 = r12.f10929k
            if (r12 != 0) goto L50
            java.util.List r12 = java.util.Collections.EMPTY_LIST
        L50:
            java.util.Iterator r12 = r12.iterator()
        L54:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto Le0
            java.lang.Object r0 = r12.next()
            pd.q r0 = (pd.q) r0
            java.util.HashSet r1 = new java.util.HashSet
            java.util.List r2 = r0.f13715m
            java.util.List r3 = r0.f13715m
            int r2 = r2.size()
            r4 = 1
            int r2 = r2 + r4
            r1.<init>(r2)
            qd.r r2 = r0.f13714l
            if (r2 == 0) goto L7c
            java.lang.String r2 = r2.getName()
            if (r2 == 0) goto L7c
            r1.add(r2)
        L7c:
            be.z r2 = new be.z
            r5 = 3
            r2.<init>(r1, r5)
            r3.forEach(r2)
            int r2 = r1.size()
            if (r2 != r4) goto La4
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            qd.r r0 = r0.f13714l
            r0.p(r1)
            be.i0 r0 = new be.i0
            r2 = 1
            r0.<init>(r1, r2)
            r3.forEach(r0)
            goto L54
        La4:
            int r2 = r1.size()
            if (r2 <= r4) goto L54
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Different variable names in phi insn: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = ", use first"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            ud.r r4 = r11.f1636b
            r4.I(r2)
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            qd.r r0 = r0.f13714l
            r0.p(r1)
            be.i0 r0 = new be.i0
            r2 = 1
            r0.<init>(r1, r2)
            r3.forEach(r0)
            goto L54
        Le0:
            return
        Le1:
            qd.s r12 = (qd.s) r12
            qd.r r0 = r12.f10927i
            java.util.ArrayList r1 = r12.f10928j
            md.f r0 = r0.f8877g
            md.b r2 = md.b.L
            oc.b r0 = r0.c(r2)
            nd.d0 r0 = (nd.d0) r0
            r3 = 0
            ud.r r4 = r11.f1636b
            if (r0 != 0) goto Lf8
            r0 = r3
            goto L100
        Lf8:
            qd.j r5 = r0.f9358g
            java.lang.String r0 = r0.f9359h
            boolean r0 = de.a.j(r4, r12, r5, r0)
        L100:
            if (r0 == 0) goto L104
            goto L199
        L104:
            java.util.Iterator r0 = r1.iterator()
        L108:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L12c
            java.lang.Object r5 = r0.next()
            qd.r r5 = (qd.r) r5
            md.f r5 = r5.f8877g
            oc.b r5 = r5.c(r2)
            nd.d0 r5 = (nd.d0) r5
            if (r5 != 0) goto L120
            r5 = r3
            goto L128
        L120:
            qd.j r6 = r5.f9358g
            java.lang.String r5 = r5.f9359h
            boolean r5 = de.a.j(r4, r12, r6, r5)
        L128:
            if (r5 == 0) goto L108
            goto L199
        L12c:
            md.b r0 = md.b.f8858m
            md.f r2 = r4.f8877g
            oc.b r0 = r2.c(r0)
            nd.s r0 = (nd.s) r0
            if (r0 != 0) goto L139
            goto L199
        L139:
            java.util.stream.Stream r1 = r1.stream()
            ae.a r2 = new ae.a
            r5 = 5
            r2.<init>(r5)
            java.util.stream.IntStream r1 = r1.mapToInt(r2)
            java.util.OptionalInt r1 = r1.max()
            boolean r2 = r1.isPresent()
            if (r2 != 0) goto L152
            goto L199
        L152:
            qd.r r2 = r12.f10927i
            if (r2 == 0) goto L15d
            ud.p r2 = r2.f10903j
            if (r2 == 0) goto L15d
            int r2 = r2.f13716n
            goto L15e
        L15d:
            r2 = -1
        L15e:
            int r1 = r1.getAsInt()
            int r5 = r12.f10925g
            java.util.List r0 = r0.f9391g
            java.util.Iterator r0 = r0.iterator()
        L16a:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L199
            java.lang.Object r6 = r0.next()
            lf.b r6 = (lf.b) r6
            int r7 = r6.f8033a
            if (r7 != r5) goto L16a
            int r7 = r6.f8038f
            int r8 = r6.f8039g
            r9 = 1
            if (r7 > r2) goto L185
            if (r2 > r8) goto L185
            r10 = r9
            goto L186
        L185:
            r10 = r3
        L186:
            if (r10 != 0) goto L190
            if (r7 > r1) goto L18d
            if (r1 > r8) goto L18d
            goto L18e
        L18d:
            r9 = r3
        L18e:
            if (r9 == 0) goto L16a
        L190:
            qd.j r0 = be.b.G(r4, r6)
            java.lang.String r1 = r6.f8034b
            de.a.j(r4, r12, r0, r1)
        L199:
            return
        L19a:
            ud.a r12 = (ud.a) r12
            md.a r0 = md.a.f8827k
            md.f r1 = r12.f8877g
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto L1bc
            md.b r0 = md.b.f8871z
            md.f r12 = r12.f8877g
            java.util.List r12 = r12.d(r0)
            ud.r r0 = r11.f1636b
            java.util.Objects.requireNonNull(r0)
            ce.d r1 = new ce.d
            r2 = 1
            r1.<init>(r0, r2)
            r12.forEach(r1)
        L1bc:
            return
        L1bd:
            nd.t r12 = (nd.t) r12
            ud.r r0 = r11.f1636b
            java.util.List r1 = r0.F
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1d1
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 5
            r1.<init>(r2)
            r0.F = r1
        L1d1:
            java.util.List r1 = r0.F
            int r1 = r1.size()
            r12.f9395d = r1
            java.util.List r0 = r0.F
            r0.add(r12)
            return
        L1df:
            ae.f r12 = (ae.f) r12
            r0 = 1
            r12.f240i = r0
            java.util.ArrayList r0 = r12.f235d
            ae.e r1 = new ae.e
            r2 = 0
            r1.<init>(r2)
            r0.forEach(r1)
            ud.r r0 = r11.f1636b
            ud.a r0 = r0.B
            ud.a r12 = r12.f234c
            ce.m.p(r0, r12)
            return
    }
}
