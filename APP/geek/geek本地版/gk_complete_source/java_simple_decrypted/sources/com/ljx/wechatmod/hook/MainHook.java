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
        ip.o("lpparam", r4);
        if (ip.i(r4.packageName, "com.ljx.wechatmod") == false) goto L7;
        XposedHelpers.findAndHookMethod("com.ljx.wechatmod.ui.MainActivity", r4.classLoader, "isModuleActive", new Object[]{new ms()});
        return;
    L7:
        if (ip.i(r4.packageName, "com.tencent.mm") == true) goto L9;
        return;
    L9:
        XposedHelpers.findAndHookMethod(Application.class, "onCreate", new Object[]{new td(1, r4)});
    }
}
