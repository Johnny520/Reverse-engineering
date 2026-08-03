package xe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements java.util.function.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21572a;

    public /* synthetic */ n(int r1) {
            r0 = this;
            r0.f21572a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f21572a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = java.util.Objects.toString(r2)
            return r2
        La:
            be.a r2 = (be.a) r2
            java.lang.String r2 = r2.e()
            return r2
    }
}
