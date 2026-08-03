package ce;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.util.function.Predicate {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1630i;

    public /* synthetic */ a(ae.f r2, ud.r r3) {
            r1 = this;
            r0 = 0
            r1.f1628g = r0
            r1.<init>()
            r1.f1630i = r2
            r1.f1629h = r3
            return
    }

    public /* synthetic */ a(ke.c r1, java.util.concurrent.atomic.AtomicBoolean r2, hb.r r3) {
            r0 = this;
            r1 = 2
            r0.f1628g = r1
            r0.<init>()
            r0.f1630i = r2
            r0.f1629h = r3
            return
    }

    public /* synthetic */ a(ud.r r2, ud.a r3) {
            r1 = this;
            r0 = 1
            r1.f1628g = r0
            r1.<init>()
            r1.f1629h = r2
            r1.f1630i = r3
            return
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            int r1 = r0.f1628g
            switch(r1) {
                case 0: goto L207;
                case 1: goto Lbb;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f1630i
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            java.lang.Object r2 = r0.f1629h
            hb.r r2 = (hb.r) r2
            java.lang.Object r3 = r2.f5457d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r4 = r19
            ud.n r4 = (ud.n) r4
            boolean r5 = r1.get()
            r6 = 0
            if (r5 == 0) goto L20
            goto Lba
        L20:
            boolean r5 = r4 instanceof yd.c
            r7 = 1
            if (r5 == 0) goto Lb9
            yd.c r4 = (yd.c) r4
            yd.b r5 = r4.f22417k
            java.util.Objects.requireNonNull(r5)
            int r8 = r5.f22419i
            r9 = 3
            if (r8 != r9) goto L3b
            java.util.List r5 = r5.f22420j
            java.lang.Object r5 = r5.get(r6)
            yd.b r5 = (yd.b) r5
            r8 = r7
            goto L3c
        L3b:
            r8 = r6
        L3c:
            xe.e r5 = r5.f22421k
            r9 = 0
            if (r5 != 0) goto L43
            goto Lac
        L43:
            java.lang.Object r5 = r5.f21559b
            pd.i r5 = (pd.i) r5
            qd.l r10 = r5.S(r6)
            r10.getClass()
            boolean r11 = r10 instanceof qd.m
            if (r11 == 0) goto L61
            java.lang.Object r11 = r2.f5458e
            java.util.IdentityHashMap r11 = (java.util.IdentityHashMap) r11
            qd.m r10 = (qd.m) r10
            ud.p r10 = r10.f10904l
            java.lang.Object r10 = r11.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            goto L62
        L61:
            r10 = r9
        L62:
            if (r10 != 0) goto L65
            goto Lac
        L65:
            int r9 = r5.f10492p
            r11 = 2
            if (r9 != r11) goto L75
            qd.l r9 = r5.S(r7)
            boolean r9 = r9.O()
            if (r9 == 0) goto L75
            r8 = r7
        L75:
            int r9 = r5.f10492p
            if (r9 != r7) goto L84
            qd.l r9 = r5.S(r7)
            boolean r9 = r9.L()
            if (r9 == 0) goto L84
            r8 = r7
        L84:
            r3.add(r5)
            java.util.List r5 = r4.f22418l
            r3.addAll(r5)
            ke.l r9 = new ke.l
            r9.<init>()
            java.util.ArrayList r3 = r9.f7605a
            r3.add(r10)
            if (r8 == 0) goto L9b
            ud.j r3 = r4.f22423n
            goto L9d
        L9b:
            ud.j r3 = r4.f22422m
        L9d:
            if (r3 != 0) goto Laa
            java.util.List r3 = r4.f22418l
            java.lang.Object r3 = xe.s.i(r3)
            ud.a r3 = (ud.a) r3
            r9.f7607c = r3
            goto Lac
        Laa:
            r9.f7606b = r3
        Lac:
            if (r9 != 0) goto Lb2
            r1.set(r7)
            goto Lba
        Lb2:
            java.lang.Object r1 = r2.f5459f
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r9)
        Lb9:
            r6 = r7
        Lba:
            return r6
        Lbb:
            java.lang.Object r1 = r0.f1629h
            ud.r r1 = (ud.r) r1
            java.lang.Object r2 = r0.f1630i
            ud.a r2 = (ud.a) r2
            r3 = r19
            ud.a r3 = (ud.a) r3
            java.util.List r4 = r3.f13675m
            int r5 = r4.size()
            r6 = 0
            r7 = 1
            if (r5 <= r7) goto L206
            java.util.stream.Stream r5 = r4.stream()
            ce.n r8 = new ce.n
            r9 = 2
            r8.<init>(r9)
            boolean r5 = r5.allMatch(r8)
            if (r5 == 0) goto L206
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            java.util.ArrayList r4 = a.a.y(r1, r3, r6)
            java.util.ArrayList r8 = r2.f13674l
            java.lang.Object r8 = be.h.U(r8)
            ud.p r8 = (ud.p) r8
            if (r8 == 0) goto L120
            pd.k r9 = r8.f13713k
            pd.k r10 = pd.k.f10496a0
            if (r9 != r10) goto L120
            qd.l r8 = r8.S(r6)
            r8.getClass()
            boolean r9 = r8 instanceof qd.r
            if (r9 == 0) goto L120
            qd.r r8 = (qd.r) r8
            int r8 = r8.f10922l
            ud.p r9 = a.a.W(r3)
            if (r9 == 0) goto L120
            pd.k r10 = r9.f13713k
            pd.k r11 = pd.k.f10504m
            if (r10 != r11) goto L120
            qd.r r9 = r9.f13714l
            int r9 = r9.f10922l
            if (r9 != r8) goto L120
            java.util.ArrayList r8 = r3.f13674l
            r8.remove(r6)
        L120:
            ae.e r6 = new ae.e
            r8 = 16
            r6.<init>(r8)
            r5.forEach(r6)
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L12f:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L1f7
            java.lang.Object r8 = r5.next()
            ud.a r8 = (ud.a) r8
            if (r6 != 0) goto L142
            r17 = r1
            r6 = r8
            goto L1f2
        L142:
            java.util.List r9 = r8.f13676n
            ud.a r9 = a.a.N0(r9, r3)
            ce.m.p(r8, r3)
            ce.m.p(r8, r9)
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r4.size()
            r10.<init>(r11)
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.Iterator r12 = r4.iterator()
        L160:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L17c
            java.lang.Object r13 = r12.next()
            ud.a r13 = (ud.a) r13
            int r14 = r13.f13673k
            ud.a r14 = ce.m.s(r1, r14)
            ce.m.k(r13, r14)
            r10.add(r14)
            r11.put(r13, r14)
            goto L160
        L17c:
            java.util.Iterator r12 = r4.iterator()
        L180:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L1d6
            java.lang.Object r13 = r12.next()
            ud.a r13 = (ud.a) r13
            java.lang.Object r14 = r11.get(r13)
            ud.a r14 = (ud.a) r14
            java.lang.String r15 = "Copy blocks tree failed. Missing block for connection: "
            if (r14 == 0) goto L1ca
            java.util.List r13 = r13.f13676n
            java.util.Iterator r13 = r13.iterator()
        L19c:
            boolean r16 = r13.hasNext()
            if (r16 == 0) goto L180
            java.lang.Object r16 = r13.next()
            r7 = r16
            ud.a r7 = (ud.a) r7
            java.lang.Object r16 = r11.get(r7)
            r17 = r1
            r1 = r16
            ud.a r1 = (ud.a) r1
            if (r1 == 0) goto L1bd
            ce.m.j(r14, r1)
            r1 = r17
            r7 = 1
            goto L19c
        L1bd:
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r1 = r15.concat(r1)
            ah.a.k(r1)
        L1c8:
            r6 = 0
            goto L206
        L1ca:
            java.lang.String r1 = java.lang.String.valueOf(r13)
            java.lang.String r1 = r15.concat(r1)
            ah.a.k(r1)
            goto L1c8
        L1d6:
            r17 = r1
            int r1 = r4.indexOf(r3)
            java.lang.Object r1 = r10.get(r1)
            ud.a r1 = (ud.a) r1
            int r7 = r4.indexOf(r2)
            java.lang.Object r7 = r10.get(r7)
            ud.a r7 = (ud.a) r7
            ce.m.j(r8, r1)
            ce.m.j(r7, r9)
        L1f2:
            r1 = r17
            r7 = 1
            goto L12f
        L1f7:
            if (r6 == 0) goto L205
            java.util.List r1 = r6.f13676n
            ud.a r1 = a.a.N0(r1, r3)
            ce.m.p(r6, r1)
            ce.m.j(r2, r1)
        L205:
            r6 = 1
        L206:
            return r6
        L207:
            java.lang.Object r1 = r0.f1630i
            ae.f r1 = (ae.f) r1
            java.lang.Object r2 = r0.f1629h
            ud.r r2 = (ud.r) r2
            r3 = r19
            ae.f r3 = (ae.f) r3
            if (r3 != r1) goto L217
            r1 = 0
            goto L23e
        L217:
            java.util.ArrayList r4 = r3.f232a
            r1.getClass()
            java.util.Iterator r4 = r4.iterator()
        L220:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L230
            java.lang.Object r5 = r4.next()
            od.a r5 = (od.a) r5
            r1.a(r2, r5)
            goto L220
        L230:
            r1 = 1
            r3.f240i = r1
            java.util.ArrayList r2 = r3.f235d
            ae.e r3 = new ae.e
            r4 = 0
            r3.<init>(r4)
            r2.forEach(r3)
        L23e:
            return r1
    }
}
