package r8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r8.i f11631b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f11632a;

    static {
            r8.i r0 = new r8.i
            r0.<init>()
            r8.i.f11631b = r0
            return
    }

    public i() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r1.f11632a = r0
            return
    }

    public final void a(de.robv.android.xposed.XC_MethodHook.Unhook r2) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.concurrent.CopyOnWriteArrayList r0 = r1.f11632a
            r0.add(r2)
        L7:
            return
    }

    public final de.robv.android.xposed.XC_MethodHook.Unhook b(java.lang.reflect.Member r1, de.robv.android.xposed.XC_MethodHook r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            de.robv.android.xposed.XC_MethodHook$Unhook r1 = de.robv.android.xposed.XposedBridge.hookMethod(r1, r2)
            if (r1 == 0) goto L11
            java.util.concurrent.CopyOnWriteArrayList r2 = r0.f11632a
            r2.add(r1)
        L11:
            r1.getClass()
            return r1
    }
}
