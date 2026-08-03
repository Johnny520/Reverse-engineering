package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0 implements java.util.function.BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f793c;

    public /* synthetic */ f0(be.h0 r1, java.util.HashSet r2, java.util.HashMap r3) {
            r0 = this;
            r1 = 1
            r0.f791a = r1
            r0.<init>()
            r0.f792b = r2
            r0.f793c = r3
            return
    }

    public /* synthetic */ f0(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f791a = r2
            r0.f792b = r1
            r0.f793c = r3
            r0.<init>()
            return
    }

    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.f791a
            switch(r0) {
                case 0: goto L187;
                case 1: goto Lff;
                case 2: goto Lbf;
                case 3: goto L63;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f792b
            fe.a r0 = (fe.a) r0
            java.lang.Object r1 = r9.f793c
            java.util.HashMap r1 = (java.util.HashMap) r1
            qd.j r10 = (qd.j) r10
            qd.j r11 = (qd.j) r11
            java.util.List r2 = r11.j()
            boolean r3 = xe.s.h(r2)
            if (r3 == 0) goto L1c
            goto L62
        L1c:
            int r3 = r2.size()
            java.util.List r0 = r0.d(r11)
            int r4 = r0.size()
            if (r3 != r4) goto L62
            java.lang.String r10 = r10.l()
            java.lang.Object r10 = r1.get(r10)
            java.util.Map r10 = (java.util.Map) r10
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r3)
            r5 = 0
        L3a:
            if (r5 >= r3) goto L5b
            java.lang.Object r6 = r2.get(r5)
            qd.j r6 = (qd.j) r6
            if (r10 == 0) goto L4b
            java.lang.Object r7 = r10.get(r6)
            qd.j r7 = (qd.j) r7
            goto L4c
        L4b:
            r7 = 0
        L4c:
            java.lang.Object r8 = r0.get(r5)
            qd.j r8 = (qd.j) r8
            if (r7 == 0) goto L55
            r6 = r7
        L55:
            r4.put(r8, r6)
            int r5 = r5 + 1
            goto L3a
        L5b:
            java.lang.String r10 = r11.l()
            r1.put(r10, r4)
        L62:
            return
        L63:
            java.lang.Object r0 = r9.f792b
            te.a r0 = (te.a) r0
            java.lang.Object r1 = r9.f793c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.String r10 = (java.lang.String) r10
            java.util.List r11 = (java.util.List) r11
            r0.getClass()
            int r2 = r11.size()
            r3 = 1
            r4 = 0
            if (r2 != r3) goto L84
            java.lang.Object r10 = r11.get(r4)
            te.b r10 = (te.b) r10
            r1.add(r10)
            goto Lbe
        L84:
            java.util.TreeMap r0 = r0.f13127e
            java.lang.Object r0 = r0.get(r10)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Laa
            java.util.stream.Stream r10 = r11.stream()
            bc.i r11 = new bc.i
            r2 = 2
            r11.<init>(r0, r2)
            java.util.stream.Stream r10 = r10.filter(r11)
            java.util.Optional r10 = r10.findFirst()
            be.m0 r11 = new be.m0
            r0 = 5
            r11.<init>(r0, r1)
            r10.ifPresent(r11)
            goto Lbe
        Laa:
            java.lang.Object r0 = r11.get(r4)
            te.b r0 = (te.b) r0
            r1.add(r0)
            mh.b r1 = te.a.f13122g
            java.lang.String r2 = "Select providing '{}' plugin '{}', candidates: {}"
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r0, r11}
            r1.o(r2, r10)
        Lbe:
            return
        Lbf:
            java.lang.Object r0 = r9.f792b
            ud.u r0 = (ud.u) r0
            java.lang.Object r1 = r9.f793c
            j8.f r1 = (j8.f) r1
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.String r11 = (java.lang.String) r11
            r2 = 47
            int r2 = r11.indexOf(r2)
            r3 = 0
            java.lang.String r3 = r11.substring(r3, r2)
            java.lang.String r4 = "android.R$"
            java.lang.String r3 = r4.concat(r3)
            int r2 = r2 + 1
            java.lang.String r11 = r11.substring(r2)
            qd.j r2 = qd.j.x(r3)
            od.a r2 = od.a.e(r0, r2)
            qd.g r3 = qd.j.f10868b
            od.c r4 = new od.c
            r4.<init>(r2, r11, r3)
            be.k r11 = r0.f13746e
            od.c r11 = r11.h(r4)
            java.lang.Object r0 = r1.f6781b
            od.b r0 = (od.b) r0
            r0.a(r10, r11)
            return
        Lff:
            java.lang.Object r0 = r9.f792b
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.lang.Object r1 = r9.f793c
            java.util.HashMap r1 = (java.util.HashMap) r1
            ud.e r10 = (ud.e) r10
            java.util.List r11 = (java.util.List) r11
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L186
            r0.clear()
        L114:
            boolean r11 = r0.add(r10)
            if (r11 != 0) goto L145
            java.lang.String r11 = java.lang.String.valueOf(r10)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Loop in anonymous inline: "
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r11 = ", path: "
            r2.append(r11)
            r2.append(r1)
            java.lang.String r11 = r2.toString()
            r10.L(r11)
            ae.e r10 = new ae.e
            r11 = 7
            r10.<init>(r11)
            r0.forEach(r10)
            goto L186
        L145:
            java.lang.Object r11 = r1.get(r10)
            ud.e r11 = (ud.e) r11
            if (r11 != 0) goto L184
            ud.e r10 = r10.a0()
            int r11 = r0.size()
            r1 = 2
            if (r11 > r1) goto L159
            goto L186
        L159:
            java.util.List r11 = r10.A
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L16c
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = r0.size()
            r11.<init>(r1)
            r10.A = r11
        L16c:
            java.util.Iterator r10 = r0.iterator()
        L170:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L186
            java.lang.Object r0 = r10.next()
            ud.e r0 = (ud.e) r0
            ud.e r0 = r0.a0()
            r11.add(r0)
            goto L170
        L184:
            r10 = r11
            goto L114
        L186:
            return
        L187:
            java.lang.Object r0 = r9.f792b
            be.b r0 = (be.b) r0
            java.lang.Object r1 = r9.f793c
            ud.r r1 = (ud.r) r1
            java.lang.String r10 = (java.lang.String) r10
            nc.a r11 = (nc.a) r11
            r0.s(r1, r11)
            return
    }
}
