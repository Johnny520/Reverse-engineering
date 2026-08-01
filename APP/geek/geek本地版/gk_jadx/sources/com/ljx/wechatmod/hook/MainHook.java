package com.ljx.wechatmod.hook;

import android.app.Application;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import p000.AbstractC0346ip;
import p000.C0496ms;
import p000.C0741td;
import p000.u40;

/* JADX INFO: loaded from: classes.dex */
public final class MainHook implements IXposedHookLoadPackage {
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        AbstractC0346ip.m1503o(u40.m2419a("XQggMO9Rpg==\n", "MXhQUZ0wy9o=\n"), loadPackageParam);
        if (AbstractC0346ip.m1497i(loadPackageParam.packageName, u40.m2419a("SMiwOT3Kjydcwr5/MNSaZk8=\n", "K6fdF1Gg9wk=\n"))) {
            XposedHelpers.findAndHookMethod(u40.m2419a("tBHCqG+mY1igG8zuYrh2GbNQ2u8tgXofuT/M8mq6cgKu\n", "136vhgPMG3Y=\n"), loadPackageParam.classLoader, u40.m2419a("wpeYqzvzLTHqh6GtKeM=\n", "q+TVxF+GQVQ=\n"), new Object[]{new C0496ms()});
        } else if (AbstractC0346ip.m1497i(loadPackageParam.packageName, u40.m2419a("CmOVEsc0M74MYowS3jw=\n", "aQz4PLNRXd0=\n"))) {
            XposedHelpers.findAndHookMethod(Application.class, u40.m2419a("Pp/K5rqR8RM=\n", "UfGJlN/whXY=\n"), new Object[]{new C0741td(1, loadPackageParam)});
        }
    }
}
