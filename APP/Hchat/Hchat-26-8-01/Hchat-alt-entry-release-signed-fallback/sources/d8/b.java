package d8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam f2078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.Hchat.ModuleEntry f2079c;

    public /* synthetic */ b(h.Hchat.ModuleEntry r1, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r2, int r3) {
            r0 = this;
            r0.f2077a = r3
            r0.f2079c = r1
            r0.f2078b = r2
            r0.<init>()
            return
    }

    public final void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) {
            r4 = this;
            int r0 = r4.f2077a
            switch(r0) {
                case 0: goto L60;
                case 1: goto L45;
                case 2: goto L34;
                case 3: goto L2a;
                case 4: goto L20;
                default: goto L5;
            }
        L5:
            java.lang.Object[] r0 = r5.args
            r1 = 0
            r0 = r0[r1]
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r5 = r5.thisObject
            h.Hchat.ModuleEntry r1 = r4.f2079c
            java.lang.ClassLoader r5 = h.Hchat.ModuleEntry.l(r1, r5)
            if (r5 != 0) goto L1c
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r5 = r4.f2078b
            java.lang.ClassLoader r5 = h.Hchat.ModuleEntry.k(r1, r0, r5)
        L1c:
            h.Hchat.ModuleEntry.h(r1, r0, r5)
            return
        L20:
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r0 = r4.f2078b
            java.lang.String r1 = "after"
            h.Hchat.ModuleEntry r2 = r4.f2079c
            h.Hchat.ModuleEntry.j(r2, r0, r5, r1)
            return
        L2a:
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r0 = r4.f2078b
            java.lang.String r1 = "after"
            h.Hchat.ModuleEntry r2 = r4.f2079c
            h.Hchat.ModuleEntry.i(r2, r0, r5, r1)
            return
        L34:
            java.lang.Object r5 = r5.thisObject
            android.app.Application r5 = (android.app.Application) r5
            h.Hchat.ModuleEntry r0 = r4.f2079c
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r1 = r4.f2078b
            java.lang.ClassLoader r2 = h.Hchat.ModuleEntry.k(r0, r5, r1)
            r3 = 1
            h.Hchat.ModuleEntry.g(r0, r5, r2, r1, r3)
            return
        L45:
            java.lang.Object[] r0 = r5.args
            r1 = 0
            r0 = r0[r1]
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r5 = r5.thisObject
            h.Hchat.ModuleEntry r2 = r4.f2079c
            java.lang.ClassLoader r5 = h.Hchat.ModuleEntry.l(r2, r5)
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r3 = r4.f2078b
            if (r5 != 0) goto L5c
            java.lang.ClassLoader r5 = h.Hchat.ModuleEntry.k(r2, r0, r3)
        L5c:
            h.Hchat.ModuleEntry.g(r2, r0, r5, r3, r1)
            return
        L60:
            java.lang.Object r5 = r5.thisObject
            android.app.Application r5 = (android.app.Application) r5
            java.lang.String r0 = "Hchat_global_config"
            r5.getClass()
            java.lang.String r1 = "terms_accepted"
            r2 = 0
            android.content.SharedPreferences r3 = ub.b.c(r5, r0)     // Catch: java.lang.Throwable -> L75
            boolean r1 = r3.getBoolean(r1, r2)     // Catch: java.lang.Throwable -> L75
            goto L76
        L75:
            r1 = r2
        L76:
            if (r1 == 0) goto L88
            java.lang.String r1 = "terms_version"
            android.content.SharedPreferences r0 = ub.b.c(r5, r0)     // Catch: java.lang.Throwable -> L83
            int r0 = r0.getInt(r1, r2)     // Catch: java.lang.Throwable -> L83
            goto L84
        L83:
            r0 = r2
        L84:
            r1 = 1
            if (r0 != r1) goto L88
            r2 = r1
        L88:
            h.Hchat.ModuleEntry r0 = r4.f2079c
            if (r2 == 0) goto L97
            java.lang.Class r1 = r0.getClass()
            java.lang.ClassLoader r1 = r1.getClassLoader()
            h.Hchat.crash.g.g(r5, r1)
        L97:
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r1 = r4.f2078b
            java.lang.ClassLoader r2 = h.Hchat.ModuleEntry.k(r0, r5, r1)
            h.Hchat.ModuleEntry.h(r0, r5, r2)
            java.lang.Thread r0 = new java.lang.Thread
            ac.l r2 = new ac.l
            r3 = 9
            r2.<init>(r4, r5, r1, r3)
            java.lang.String r5 = "Hchat-Init"
            r0.<init>(r2, r5)
            r0.start()
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) {
            r4 = this;
            int r0 = r4.f2077a
            switch(r0) {
                case 0: goto L1d;
                case 1: goto L5;
                case 2: goto L5;
                case 3: goto L13;
                case 4: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r5)
            return
        L9:
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r0 = r4.f2078b
            java.lang.String r1 = "before"
            h.Hchat.ModuleEntry r2 = r4.f2079c
            h.Hchat.ModuleEntry.j(r2, r0, r5, r1)
            return
        L13:
            de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r0 = r4.f2078b
            java.lang.String r1 = "before"
            h.Hchat.ModuleEntry r2 = r4.f2079c
            h.Hchat.ModuleEntry.i(r2, r0, r5, r1)
            return
        L1d:
            java.lang.Object r5 = r5.thisObject
            android.app.Application r5 = (android.app.Application) r5
            java.lang.String r0 = "Hchat_global_config"
            r5.getClass()
            java.lang.String r1 = "terms_accepted"
            r2 = 0
            android.content.SharedPreferences r3 = ub.b.c(r5, r0)     // Catch: java.lang.Throwable -> L32
            boolean r1 = r3.getBoolean(r1, r2)     // Catch: java.lang.Throwable -> L32
            goto L33
        L32:
            r1 = r2
        L33:
            if (r1 == 0) goto L45
            java.lang.String r1 = "terms_version"
            android.content.SharedPreferences r0 = ub.b.c(r5, r0)     // Catch: java.lang.Throwable -> L40
            int r0 = r0.getInt(r1, r2)     // Catch: java.lang.Throwable -> L40
            goto L41
        L40:
            r0 = r2
        L41:
            r1 = 1
            if (r0 != r1) goto L45
            r2 = r1
        L45:
            if (r2 == 0) goto L4a
            h.Hchat.crash.g.h(r5)
        L4a:
            return
    }
}
