package com.ljx.wechatmod.hook;

/* JADX INFO: loaded from: classes.dex */
public final class MainHook implements de.robv.android.xposed.IXposedHookLoadPackage {
    public MainHook() {
            r0 = this;
            r0.<init>()
            return
    }

    public void handleLoadPackage(de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam r4) {
            r3 = this;
            java.lang.String r0 = "XQggMO9Rpg==\n"
            java.lang.String r1 = "MXhQUZ0wy9o=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            defpackage.ip.o(r0, r4)
            java.lang.String r0 = r4.packageName
            java.lang.String r1 = "SMiwOT3Kjydcwr5/MNSaZk8=\n"
            java.lang.String r2 = "K6fdF1Gg9wk=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)
            boolean r0 = defpackage.ip.i(r0, r1)
            if (r0 == 0) goto L3a
            java.lang.String r0 = "tBHCqG+mY1igG8zuYrh2GbNQ2u8tgXofuT/M8mq6cgKu\n"
            java.lang.String r1 = "136vhgPMG3Y=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            java.lang.ClassLoader r4 = r4.classLoader
            java.lang.String r1 = "wpeYqzvzLTHqh6GtKeM=\n"
            java.lang.String r2 = "q+TVxF+GQVQ=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)
            ms r2 = new ms
            r2.<init>()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            de.robv.android.xposed.XposedHelpers.findAndHookMethod(r0, r4, r1, r2)
            return
        L3a:
            java.lang.String r0 = r4.packageName
            java.lang.String r1 = "CmOVEsc0M74MYowS3jw=\n"
            java.lang.String r2 = "aQz4PLNRXd0=\n"
            java.lang.String r1 = defpackage.u40.a(r1, r2)
            boolean r0 = defpackage.ip.i(r0, r1)
            if (r0 != 0) goto L4b
            return
        L4b:
            java.lang.String r0 = "Pp/K5rqR8RM=\n"
            java.lang.String r1 = "UfGJlN/whXY=\n"
            java.lang.String r0 = defpackage.u40.a(r0, r1)
            td r1 = new td
            r2 = 1
            r1.<init>(r2, r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r1}
            java.lang.Class<android.app.Application> r1 = android.app.Application.class
            de.robv.android.xposed.XposedHelpers.findAndHookMethod(r1, r0, r4)
            return
    }
}
