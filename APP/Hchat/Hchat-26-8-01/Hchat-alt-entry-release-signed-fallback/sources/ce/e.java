package ce;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements java.util.function.BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1638b;

    public /* synthetic */ e(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f1637a = r2
            r0.f1638b = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.BiConsumer
    public final void accept(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f1637a
            switch(r0) {
                case 0: goto L55;
                case 1: goto L37;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f1638b
            java.util.HashMap r0 = (java.util.HashMap) r0
            ud.l r5 = (ud.l) r5
            od.c r1 = r5.f()
            qd.j r1 = r1.f9775i
            qd.g r2 = qd.j.f10868b
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L36
            boolean r1 = r5 instanceof ud.g
            if (r1 == 0) goto L36
            boolean r1 = r4 instanceof java.lang.Integer
            if (r1 == 0) goto L36
            ud.g r5 = (ud.g) r5
            b5.k r1 = r5.f13708m
            boolean r2 = r1.h()
            if (r2 == 0) goto L36
            boolean r1 = r1.c()
            if (r1 == 0) goto L36
            java.lang.Integer r4 = (java.lang.Integer) r4
            r0.put(r4, r5)
        L36:
            return
        L37:
            java.lang.Object r0 = r3.f1638b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            ae.f r4 = (ae.f) r4
            java.util.List r5 = (java.util.List) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 1
            r1.<init>(r2)
            r1.add(r4)
            ae.h r4 = new ae.h
            int r2 = r0.size()
            r4.<init>(r2, r1, r5)
            r0.add(r4)
            return
        L55:
            java.lang.Object r0 = r3.f1638b
            ud.r r0 = (ud.r) r0
            ae.f r4 = (ae.f) r4
            java.util.List r5 = (java.util.List) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L78
            r5 = 1
            r4.f240i = r5
            java.util.ArrayList r5 = r4.f235d
            ae.e r1 = new ae.e
            r2 = 0
            r1.<init>(r2)
            r5.forEach(r1)
            ud.a r5 = r0.B
            ud.a r4 = r4.f234c
            ce.m.p(r5, r4)
        L78:
            return
    }
}
