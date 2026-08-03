package q8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f10694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f10695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f10696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q8.h f10697d;

    public g(q8.h r1, boolean r2, java.lang.Class r3, java.lang.Class r4) {
            r0 = this;
            r0.f10697d = r1
            r0.f10694a = r2
            r0.f10695b = r3
            r0.f10696c = r4
            r0.<init>()
            return
    }

    public final void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) {
            r3 = this;
            java.lang.Class r0 = r3.f10696c
            q8.h r1 = r3.f10697d
            boolean r2 = r3.f10694a     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L19
            e8.c r1 = r1.f10700c     // Catch: java.lang.Throwable -> L17
            java.lang.Class r1 = r1.f2378t     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L19
            java.lang.Object r2 = r4.thisObject     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isInstance(r2)     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            return
        L17:
            r4 = move-exception
            goto L29
        L19:
            java.lang.Object[] r4 = r4.args     // Catch: java.lang.Throwable -> L17
            r1 = 0
            r4 = r4[r1]     // Catch: java.lang.Throwable -> L17
            java.util.HashSet r4 = (java.util.HashSet) r4     // Catch: java.lang.Throwable -> L17
            java.lang.Class r1 = r3.f10695b     // Catch: java.lang.Throwable -> L17
            r4.add(r1)     // Catch: java.lang.Throwable -> L17
            r0.getClass()     // Catch: java.lang.Throwable -> L17
            return
        L29:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:SettingsInjector] [Modern] superImportUIComponents 失败: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            java.lang.String r0 = r4.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            fb.v0.n(r0, r4)
            return
    }
}
