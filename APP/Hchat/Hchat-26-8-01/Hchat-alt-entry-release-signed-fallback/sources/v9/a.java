package v9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uf.d f14285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f14286c;

    public /* synthetic */ a(uf.d r1, java.lang.reflect.Method r2, int r3) {
            r0 = this;
            r0.f14284a = r3
            r0.f14285b = r1
            r0.f14286c = r2
            r0.<init>()
            return
    }

    public final void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) {
            r2 = this;
            int r0 = r2.f14284a
            r3.getClass()
            switch(r0) {
                case 0: goto L2c;
                case 1: goto L20;
                case 2: goto L14;
                default: goto L8;
            }
        L8:
            uf.d r0 = r2.f14285b
            java.lang.reflect.Method r1 = r2.f14286c
            java.lang.Object r0 = uf.d.a(r0, r1)
            r3.setResult(r0)
            return
        L14:
            uf.d r0 = r2.f14285b
            java.lang.reflect.Method r1 = r2.f14286c
            java.lang.Object r0 = uf.d.a(r0, r1)
            r3.setResult(r0)
            return
        L20:
            uf.d r0 = r2.f14285b
            java.lang.reflect.Method r1 = r2.f14286c
            java.lang.Object r0 = uf.d.a(r0, r1)
            r3.setResult(r0)
            return
        L2c:
            uf.d r0 = r2.f14285b
            java.lang.reflect.Method r1 = r2.f14286c
            java.lang.Object r0 = uf.d.a(r0, r1)
            r3.setResult(r0)
            return
    }
}
