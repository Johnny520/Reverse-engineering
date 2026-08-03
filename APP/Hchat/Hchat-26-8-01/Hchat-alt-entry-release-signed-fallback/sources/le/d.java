package le;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements java.util.function.Predicate {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f8019h;

    public /* synthetic */ d(java.util.HashSet r1, int r2) {
            r0 = this;
            r0.f8018g = r2
            r0.f8019h = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f8018g
            switch(r0) {
                case 0: goto L22;
                default: goto L5;
            }
        L5:
            be.a r3 = (be.a) r3
            java.lang.String r0 = r3.e()
            java.util.HashSet r1 = r2.f8019h
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L20
            mh.b r0 = ud.u.f13741v
            java.lang.String r1 = "Disable pass: {}"
            java.lang.String r3 = r3.e()
            r0.x(r3, r1)
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            return r3
        L22:
            java.util.HashSet r0 = r2.f8019h
            ud.a r3 = (ud.a) r3
            boolean r3 = r0.contains(r3)
            return r3
    }
}
