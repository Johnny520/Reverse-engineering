package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.function.Consumer f2641b;

    public /* synthetic */ r(java.util.function.Consumer r1, int r2) {
            r0 = this;
            r0.f2640a = r2
            r0.f2641b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) {
            r1 = this;
            int r0 = r1.f2640a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r2)
            return
        L9:
            r2.getClass()
            java.util.function.Consumer r0 = r1.f2641b
            r0.accept(r2)
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) {
            r1 = this;
            int r0 = r1.f2640a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r2)
            return
        L9:
            r2.getClass()
            java.util.function.Consumer r0 = r1.f2641b
            r0.accept(r2)
            return
    }
}
