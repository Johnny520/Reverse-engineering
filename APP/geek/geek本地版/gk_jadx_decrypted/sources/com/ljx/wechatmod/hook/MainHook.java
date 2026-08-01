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
        AbstractC0346ip.m1503o("lpparam", loadPackageParam);
        if (AbstractC0346ip.m1497i(loadPackageParam.packageName, "com.ljx.wechatmod")) {
            XposedHelpers.findAndHookMethod("com.ljx.wechatmod.ui.MainActivity", loadPackageParam.classLoader, "isModuleActive", new Object[]{new C0496ms()});
        } else if (AbstractC0346ip.m1497i(loadPackageParam.packageName, "com.tencent.mm")) {
            XposedHelpers.findAndHookMethod(Application.class, "onCreate", new Object[]{new C0741td(1, loadPackageParam)});
        }
    }
}
