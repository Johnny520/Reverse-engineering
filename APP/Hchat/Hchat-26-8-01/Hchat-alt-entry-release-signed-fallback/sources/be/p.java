package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements java.util.function.Predicate {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f837h;

    public /* synthetic */ p(java.util.Set r1, int r2) {
            r0 = this;
            r0.f836g = r2
            r0.f837h = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f836g
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            java.util.Set r0 = r1.f837h
            ud.a r2 = (ud.a) r2
            boolean r2 = r0.contains(r2)
            r2 = r2 ^ 1
            return r2
        L10:
            be.r r2 = (be.r) r2
            ud.g r2 = r2.f840a
            od.c r2 = r2.f13707l
            java.util.Set r0 = r1.f837h
            boolean r2 = r0.contains(r2)
            return r2
    }
}
