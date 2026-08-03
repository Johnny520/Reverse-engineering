package be;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements java.util.function.IntFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.io.Serializable f844b;

    public /* synthetic */ s(int r1, java.io.Serializable r2) {
            r0 = this;
            r0.f843a = r1
            r0.f844b = r2
            r0.<init>()
            return
    }

    @Override // java.util.function.IntFunction
    public final java.lang.Object apply(int r2) {
            r1 = this;
            int r0 = r1.f843a
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            java.io.Serializable r0 = r1.f844b
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Object[] r2 = bsh.Reflect.c(r0, r2)
            return r2
        Le:
            java.io.Serializable r0 = r1.f844b
            ud.g[] r0 = (ud.g[]) r0
            r2 = r0[r2]
            return r2
    }
}
