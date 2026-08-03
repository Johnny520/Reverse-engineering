package ra;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ra.h f11847b;

    public /* synthetic */ e(ra.h r1, int r2) {
            r0 = this;
            r0.f11846a = r2
            r0.f11847b = r1
            r0.<init>()
            return
    }

    public final void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) {
            r3 = this;
            int r0 = r3.f11846a
            switch(r0) {
                case 0: goto L52;
                case 1: goto L47;
                case 2: goto L3c;
                case 3: goto L31;
                case 4: goto L21;
                case 5: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Object r4 = r4.thisObject
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L12
            ra.h r0 = r3.f11847b
            android.app.Activity r4 = (android.app.Activity) r4
            ra.h.b(r0, r4)
        L12:
            return
        L13:
            java.lang.Object r4 = r4.thisObject
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L20
            ra.h r0 = r3.f11847b
            android.app.Activity r4 = (android.app.Activity) r4
            ra.h.b(r0, r4)
        L20:
            return
        L21:
            java.lang.Object r4 = r4.thisObject
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L30
            ra.h r0 = r3.f11847b
            java.util.WeakHashMap r0 = r0.f11867g
            android.app.Activity r4 = (android.app.Activity) r4
            r0.remove(r4)
        L30:
            return
        L31:
            java.lang.Object r4 = r4.thisObject
            java.lang.String r0 = "onSceneEnd"
            r1 = 1
            ra.h r2 = r3.f11847b
            ra.h.a(r2, r4, r0, r1)
            return
        L3c:
            java.lang.Object r4 = r4.thisObject
            java.lang.String r0 = "onResume"
            r1 = 1
            ra.h r2 = r3.f11847b
            ra.h.a(r2, r4, r0, r1)
            return
        L47:
            java.lang.Object r4 = r4.thisObject
            java.lang.String r0 = "onCreate"
            r1 = 0
            ra.h r2 = r3.f11847b
            ra.h.a(r2, r4, r0, r1)
            return
        L52:
            java.lang.Object r4 = r4.thisObject
            java.lang.String r0 = "initView"
            r1 = 1
            ra.h r2 = r3.f11847b
            ra.h.a(r2, r4, r0, r1)
            return
    }
}
