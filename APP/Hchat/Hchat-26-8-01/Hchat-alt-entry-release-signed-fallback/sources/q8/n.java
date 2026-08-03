package q8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q8.o f10728b;

    public /* synthetic */ n(q8.o r1, int r2) {
            r0 = this;
            r0.f10727a = r2
            r0.f10728b = r1
            r0.<init>()
            return
    }

    public final void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) {
            r2 = this;
            int r0 = r2.f10727a
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            q8.o r0 = r2.f10728b
            android.app.Activity r0 = r0.a()
            if (r0 == 0) goto L1b
            java.lang.Object r3 = r3.thisObject
            if (r0 != r3) goto L1b
            q8.o r3 = r2.f10728b
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            r3.f10730b = r0
        L1b:
            return
        L1c:
            java.lang.Object r0 = r3.thisObject
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L2f
            q8.o r0 = r2.f10728b
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            java.lang.Object r3 = r3.thisObject
            android.app.Activity r3 = (android.app.Activity) r3
            r1.<init>(r3)
            r0.f10730b = r1
        L2f:
            return
    }
}
