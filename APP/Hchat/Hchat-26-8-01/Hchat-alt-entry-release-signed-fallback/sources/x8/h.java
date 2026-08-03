package x8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements java.util.function.Predicate {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f21282h;

    public /* synthetic */ h(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f21281g = r2
            r0.f21282h = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f21281g
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f21282h
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            ud.a r2 = (ud.a) r2
            r0.add(r2)
            r2 = 0
            return r2
        L10:
            java.lang.Object r0 = r1.f21282h
            ca.c r0 = (ca.c) r0
            java.lang.Object r2 = r0.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }
}
