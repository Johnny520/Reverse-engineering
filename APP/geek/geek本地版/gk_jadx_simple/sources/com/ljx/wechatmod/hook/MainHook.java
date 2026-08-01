package com.ljx.wechatmod.hook;

import android.app.Application;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import defpackage.ip;
import defpackage.ms;
import defpackage.td;
import defpackage.u40;

/* JADX INFO: loaded from: classes.dex */
public final class MainHook implements IXposedHookLoadPackage {
    public MainHook() {
    }

    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam r4) {
        ip.o(u40.a("XQggMO9Rpg==\n", "MXhQUZ0wy9o=\n"), r4);
        if (ip.i(r4.packageName, u40.a("SMiwOT3Kjydcwr5/MNSaZk8=\n", "K6fdF1Gg9wk=\n")) == false) goto L7;
        XposedHelpers.findAndHookMethod(u40.a("tBHCqG+mY1igG8zuYrh2GbNQ2u8tgXofuT/M8mq6cgKu\n", "136vhgPMG3Y=\n"), r4.classLoader, u40.a("wpeYqzvzLTHqh6GtKeM=\n", "q+TVxF+GQVQ=\n"), new Object[]{new ms()});
        return;
    L7:
        if (ip.i(r4.packageName, u40.a("CmOVEsc0M74MYowS3jw=\n", "aQz4PLNRXd0=\n")) == true) goto L9;
        return;
    L9:
        XposedHelpers.findAndHookMethod(Application.class, u40.a("Pp/K5rqR8RM=\n", "UfGJlN/whXY=\n"), new Object[]{new td(1, r4)});
    }
}
