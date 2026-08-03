package q8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f10683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f10684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f10685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q8.h f10686d;

    public e(q8.h r1, java.lang.Class r2, java.lang.Class r3, java.lang.Class r4) {
            r0 = this;
            r0.f10686d = r1
            r0.f10683a = r2
            r0.f10684b = r3
            r0.f10685c = r4
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.<init>(r1)
            return
    }

    public final void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r6) {
            r5 = this;
            java.lang.Object r0 = r6.getResult()     // Catch: java.lang.Throwable -> L44
            q8.h r1 = r5.f10686d     // Catch: java.lang.Throwable -> L44
            java.lang.Class r2 = r5.f10683a     // Catch: java.lang.Throwable -> L44
            r3 = 0
            java.lang.Class r1 = q8.h.g(r1, r0, r3, r2)     // Catch: java.lang.Throwable -> L44
            q8.h r2 = r5.f10686d     // Catch: java.lang.Throwable -> L44
            java.lang.Class r3 = r5.f10684b     // Catch: java.lang.Throwable -> L44
            r4 = 1
            java.lang.Class r0 = q8.h.g(r2, r0, r4, r3)     // Catch: java.lang.Throwable -> L44
            java.lang.Class r2 = r5.f10685c     // Catch: java.lang.Throwable -> L44
            if (r0 != r2) goto L1b
            return
        L1b:
            q8.h r2 = r5.f10686d     // Catch: java.lang.Throwable -> L44
            r2.f10705h = r1     // Catch: java.lang.Throwable -> L44
            q8.h r2 = r5.f10686d     // Catch: java.lang.Throwable -> L44
            r2.f10706i = r0     // Catch: java.lang.Throwable -> L44
            r0.getClass()     // Catch: java.lang.Throwable -> L44
            q8.h r0 = r5.f10686d     // Catch: java.lang.Throwable -> L44
            java.lang.Class r2 = r5.f10685c     // Catch: java.lang.Throwable -> L44
            e8.c r0 = r0.f10700c     // Catch: java.lang.Throwable -> L44
            java.lang.Class r0 = r0.f2371m     // Catch: java.lang.Throwable -> L44
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r3}     // Catch: java.lang.Throwable -> L44
            java.lang.reflect.Constructor r0 = h.Hchat.utils.KavaReflector.findConstructor(r0, r3)     // Catch: java.lang.Throwable -> L44
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.newInstance(r0, r1)     // Catch: java.lang.Throwable -> L44
            r6.setResult(r0)     // Catch: java.lang.Throwable -> L44
            return
        L44:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[Hchat:SettingsInjector] [Modern] SettingLocation 构造失败: "
            r0.<init>(r1)
            bc.e.s(r6, r0, r6)
            return
    }
}
