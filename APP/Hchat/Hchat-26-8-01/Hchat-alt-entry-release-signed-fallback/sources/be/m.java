package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements java.util.function.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f827c;

    public /* synthetic */ m(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f825a = r2
            r0.f826b = r1
            r0.f827c = r3
            r0.<init>()
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f825a
            switch(r0) {
                case 0: goto L43;
                case 1: goto L32;
                case 2: goto L18;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f826b
            fe.a r0 = (fe.a) r0
            java.lang.Object r1 = r3.f827c
            java.util.Map r1 = (java.util.Map) r1
            qd.j r4 = (qd.j) r4
            qd.j r0 = r0.m(r4, r1)
            if (r0 != 0) goto L16
            goto L17
        L16:
            r4 = r0
        L17:
            return r4
        L18:
            java.lang.Object r0 = r3.f826b
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Object r1 = r3.f827c
            java.util.function.Predicate r1 = (java.util.function.Predicate) r1
            r7.m r4 = (r7.m) r4
            k7.a r4 = r4.d(r0)
            if (r4 == 0) goto L30
            if (r1 == 0) goto L31
            boolean r0 = r1.test(r4)
            if (r0 != 0) goto L31
        L30:
            r4 = 0
        L31:
            return r4
        L32:
            java.lang.Object r0 = r3.f826b
            fe.a r0 = (fe.a) r0
            java.lang.Object r1 = r3.f827c
            ud.r r1 = (ud.r) r1
            qd.j r4 = (qd.j) r4
            r0.getClass()
            fe.a.c(r1, r4)
            return r4
        L43:
            java.lang.Object r0 = r3.f826b
            pd.k r0 = (pd.k) r0
            java.lang.Object r1 = r3.f827c
            java.util.Set r1 = (java.util.Set) r1
            ud.p r4 = (ud.p) r4
            pd.k r2 = r4.f13713k
            if (r2 != r0) goto L60
            pd.j r4 = (pd.j) r4
            java.lang.Object r4 = r4.f10495o
            od.c r4 = (od.c) r4
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L60
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            goto L61
        L60:
            r4 = 0
        L61:
            return r4
    }
}
