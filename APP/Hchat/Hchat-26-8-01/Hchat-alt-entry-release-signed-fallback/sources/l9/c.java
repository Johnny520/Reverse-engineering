package l9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg.l f7938b;

    public /* synthetic */ c(fg.l r1, int r2) {
            r0 = this;
            r0.f7937a = r2
            r0.f7938b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) {
            r2 = this;
            int r0 = r2.f7937a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r3)
            return
        L9:
            r3.getClass()
            fg.l r0 = r2.f7938b
            r0.invoke(r3)     // Catch: java.lang.Throwable -> L14
            sf.n r3 = sf.n.f12433a     // Catch: java.lang.Throwable -> L14
            goto L1b
        L14:
            r3 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        L1b:
            java.lang.Throwable r3 = sf.g.b(r3)
            if (r3 == 0) goto L2a
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = "[Hchat:ProfileId] 注入资料页 ID 失败: "
            eh.a.x(r1, r0, r3)
        L2a:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) {
            r1 = this;
            int r0 = r1.f7937a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r2)
            return
        L9:
            r2.getClass()
            fg.l r0 = r1.f7938b
            r0.invoke(r2)
            return
    }
}
