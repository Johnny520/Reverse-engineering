package d4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.util.function.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.ClassLoader f1977c;

    public /* synthetic */ a(java.lang.String r1, java.lang.ClassLoader r2, int r3) {
            r0 = this;
            r0.f1975a = r3
            r0.f1976b = r1
            r0.f1977c = r2
            r0.<init>()
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f1975a
            switch(r0) {
                case 0: goto L1b;
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            java.lang.ClassLoader r0 = r2.f1977c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = r2.f1976b
            java.lang.ClassLoader r3 = bsh.loader.BshLoaderHelper.d(r1, r0, r3)
            return r3
        L10:
            java.lang.ClassLoader r0 = r2.f1977c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = r2.f1976b
            java.lang.ClassLoader r3 = bsh.loader.BshLoaderHelper.c(r1, r0, r3)
            return r3
        L1b:
            java.lang.ClassLoader r0 = r2.f1977c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r1 = r2.f1976b
            java.lang.ClassLoader r3 = bsh.loader.BshLoaderHelper.b(r1, r0, r3)
            return r3
    }
}
