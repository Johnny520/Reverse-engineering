package bsh.classpath;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.util.function.IntFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f931a;

    public /* synthetic */ b(int r1) {
            r0 = this;
            r0.f931a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.IntFunction
    public final java.lang.Object apply(int r2) {
            r1 = this;
            int r0 = r1.f931a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String[] r2 = bsh.classpath.BshClassPath.i(r2)
            return r2
        La:
            java.lang.String[] r2 = bsh.classpath.BshClassPath.d(r2)
            return r2
    }
}
