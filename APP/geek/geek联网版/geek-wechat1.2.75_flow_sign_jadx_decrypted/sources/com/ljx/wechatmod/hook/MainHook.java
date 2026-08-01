package com.ljx.wechatmod.hook;

import android.app.Application;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import p000.AbstractC0493mp;
import p000.C0385js;
import p000.C0644qs;
import p000.b50;

/* JADX INFO: loaded from: classes.dex */
public final class MainHook implements IXposedHookLoadPackage {
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        AbstractC0493mp.m1857g("lpparam", loadPackageParam);
        if (AbstractC0493mp.m1853c(loadPackageParam.packageName, "com.ljx.wechatmod")) {
            XposedHelpers.findAndHookMethod("com.ljx.wechatmod.ui.MainActivity", loadPackageParam.classLoader, "isModuleActive", new Object[]{new C0644qs()});
        } else if (AbstractC0493mp.m1853c(loadPackageParam.packageName, "com.tencent.mm")) {
            XposedHelpers.findAndHookMethod(Application.class, "onCreate", new Object[]{new C0385js(4, loadPackageParam)});
        }
    }
}
