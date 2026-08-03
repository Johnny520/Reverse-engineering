package com.yuexin.panel.hook;

/* JADX INFO: loaded from: classes2.dex */
public class MainHook implements de.robv.android.xposed.IXposedHookLoadPackage, de.robv.android.xposed.IXposedHookZygoteInit {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f30587 = "com.yuexin.panel";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final java.lang.Object f30588 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static java.lang.ClassLoader f30589;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static java.lang.String f30590;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static java.lang.String f30591;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile boolean f30592;

    /* JADX INFO: renamed from: com.yuexin.panel.hook.MainHook$ۥ, reason: contains not printable characters */
    public class C7883 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f30593;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam f30594;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ com.yuexin.panel.hook.MainHook f30595;

        public C7883(com.yuexin.panel.hook.MainHook r1, de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r2) {
                r0 = this;
                r0.f30595 = r1
                r0.f30594 = r2
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) {
                r1 = this;
                boolean r0 = r1.f30593
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.f30593 = r0
                java.lang.Object[] r2 = r2.args
                r0 = 0
                r2 = r2[r0]
                android.content.Context r2 = (android.content.Context) r2
                com.yuexin.panel.hook.MainHook.m30672()
                de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam r2 = r1.f30594
                com.yuexin.panel.hook.MainHook.m30673(r2)
                return
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.yuexin.panel.hook.MainHook.f30588 = r0
            return
    }

    public MainHook() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m30672() {
            m30674()
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ void m30673(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r0) {
            m30676(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m30674() {
            boolean r0 = com.yuexin.panel.hook.MainHook.f30592
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.Object r0 = com.yuexin.panel.hook.MainHook.f30588
            monitor-enter(r0)
            boolean r1 = com.yuexin.panel.hook.MainHook.f30592     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        Le:
            r1 = move-exception
            goto L43
        L10:
            java.lang.String r1 = "miao"
            m30677(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = com.yuexin.panel.hook.MainHook.f30590     // Catch: java.lang.Throwable -> Le
            com.yuexin.panel.security.SignatureGuard.assertValid(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "yuexin"
            boolean r1 = Yue.C4369.m17206(r1)     // Catch: java.lang.Throwable -> Le
            if (r1 != 0) goto L2a
            java.lang.String r1 = "yuexinya"
            boolean r1 = Yue.C4369.m17206(r1)     // Catch: java.lang.Throwable -> Le
            if (r1 == 0) goto L34
        L2a:
            java.lang.String r1 = "yuexinya"
            m30677(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "yuexin"
            m30677(r1)     // Catch: java.lang.Throwable -> Le
        L34:
            java.lang.String r1 = "dexkit"
            m30677(r1)     // Catch: java.lang.Throwable -> Le
            java.lang.String r1 = "url_encode"
            m30677(r1)     // Catch: java.lang.Throwable -> Le
            r1 = 1
            com.yuexin.panel.hook.MainHook.f30592 = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            return
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static org.luckypray.dexkit.DexKitBridge m30675() {
            m30674()
            java.lang.String r0 = com.yuexin.panel.hook.MainHook.f30590
            com.yuexin.panel.security.SignatureGuard.assertValid(r0)
            java.lang.String r0 = com.yuexin.panel.hook.MainHook.f30591
            org.luckypray.dexkit.DexKitBridge r0 = org.luckypray.dexkit.DexKitBridge.create(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m30676(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r1) {
            java.lang.ClassLoader r0 = r1.classLoader
            com.yuexin.panel.hook.MainHook.f30589 = r0
            java.lang.String r0 = r1.packageName
            android.content.pm.ApplicationInfo r1 = r1.appInfo
            java.lang.String r1 = r1.sourceDir
            com.yuexin.panel.hook.MainHook.f30591 = r1
            java.lang.String r1 = com.yuexin.panel.hook.MainHook.f30590
            Yue.C0421.m1615(r1)
            com.kongzue.dialogx.DialogX$IMPL_MODE r1 = com.kongzue.dialogx.DialogX.IMPL_MODE.WINDOW
            com.kongzue.dialogx.DialogX.implIMPLMode = r1
            com.kongzue.dialogx.DialogX$THEME r1 = com.kongzue.dialogx.DialogX.THEME.AUTO
            com.kongzue.dialogx.DialogX.globalTheme = r1
            r1 = 1
            com.kongzue.dialogx.DialogX.enableImmersiveMode = r1
            java.lang.Class<com.yuexin.panel.hook.MainHook> r1 = com.yuexin.panel.hook.MainHook.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            Yue.C0421.m1620(r1)
            java.lang.ClassLoader r1 = com.yuexin.panel.hook.MainHook.f30589
            Yue.C0421.m1618(r1)
            Yue.C3245.m13673(r0)
            java.lang.ClassLoader r1 = com.yuexin.panel.hook.MainHook.f30589
            Yue.C3069.m12953(r1)
            java.lang.ClassLoader r1 = Yue.C0421.m1609()
            Yue.C3069.m12954(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m30677(java.lang.String r0) {
            Yue.C4369.m17207(r0)
            return
    }

    public void handleLoadPackage(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r3) {
            r2 = this;
            boolean r0 = r3.isFirstApplication
            if (r0 == 0) goto L21
            java.lang.String r0 = "com.yuexin.panel"
            java.lang.String r1 = r3.packageName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            goto L21
        Lf:
            com.yuexin.panel.hook.MainHook$ۥ r0 = new com.yuexin.panel.hook.MainHook$ۥ
            r0.<init>(r2, r3)
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            java.lang.Class<android.app.Application> r0 = android.app.Application.class
            java.lang.String r1 = "attach"
            de.robv.android.xposed.XposedHelpers.findAndHookMethod(r0, r1, r3)
        L21:
            return
    }

    public void initZygote(de.robv.android.xposed.IXposedHookZygoteInit.StartupParam r1) {
            r0 = this;
            java.lang.String r1 = r1.modulePath
            com.yuexin.panel.hook.MainHook.f30590 = r1
            com.kongzue.dialogx.wrapper.ModuleUtil.modulePath = r1
            java.lang.String r1 = com.yuexin.panel.hook.MainHook.f30590
            Yue.C4369.m17210(r1)
            return
    }
}
