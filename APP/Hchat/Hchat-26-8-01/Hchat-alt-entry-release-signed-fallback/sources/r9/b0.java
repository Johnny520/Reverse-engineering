package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg.l f11639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r9.d0 f11640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.reflect.Method f11641d;

    public /* synthetic */ b0(fg.l r1, r9.d0 r2, java.lang.reflect.Method r3, int r4) {
            r0 = this;
            r0.f11638a = r4
            r0.f11639b = r1
            r0.f11640c = r2
            r0.f11641d = r3
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) {
            r4 = this;
            int r0 = r4.f11638a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r5)
            return
        L9:
            r5.getClass()
            fg.l r0 = r4.f11639b
            r0.invoke(r5)     // Catch: java.lang.Throwable -> L14
            sf.n r5 = sf.n.f12433a     // Catch: java.lang.Throwable -> L14
            goto L1b
        L14:
            r5 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r5)
            r5 = r0
        L1b:
            java.lang.Throwable r5 = sf.g.b(r5)
            if (r5 == 0) goto L3c
            r9.d0 r0 = r4.f11640c
            ia.t r0 = r0.f11654b
            java.lang.reflect.Method r1 = r4.f11641d
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Hchat扩展Hook执行失败: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.invoke(r1, r5)
        L3c:
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) {
            r4 = this;
            int r0 = r4.f11638a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r5)
            return
        L9:
            r5.getClass()
            fg.l r0 = r4.f11639b
            r0.invoke(r5)     // Catch: java.lang.Throwable -> L14
            sf.n r5 = sf.n.f12433a     // Catch: java.lang.Throwable -> L14
            goto L1b
        L14:
            r5 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r5)
            r5 = r0
        L1b:
            java.lang.Throwable r5 = sf.g.b(r5)
            if (r5 == 0) goto L3c
            r9.d0 r0 = r4.f11640c
            ia.t r0 = r0.f11654b
            java.lang.reflect.Method r1 = r4.f11641d
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Hchat扩展Hook执行失败: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.invoke(r1, r5)
        L3c:
            return
    }
}
