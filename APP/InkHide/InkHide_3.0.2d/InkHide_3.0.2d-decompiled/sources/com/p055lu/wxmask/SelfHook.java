package com.p055lu.wxmask;

import android.content.Context;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import p053c.InterfaceC0508a;
import p062e0.InterfaceC0551a;
import p077m0.AbstractC0771i;
import p077m0.C0769g;
import p077m0.InterfaceC0765c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0508a
public class SelfHook implements InterfaceC0551a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static SelfHook getInstance() {
        return AbstractC0771i.f2590a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void handleDebugHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        XposedHelpers.findAndHookMethod(InterfaceC0765c.m1428a("android.app.Activity"), "onResume", new Object[]{new C0769g(1)});
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p062e0.InterfaceC0551a
    public void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        XposedHelpers.findAndHookMethod(SelfHook.class.getName(), loadPackageParam.classLoader, "isModuleEnable", new Object[]{new C0769g(0)});
    }

    public boolean isModuleEnable() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p062e0.InterfaceC0551a
    public /* bridge */ /* synthetic */ void onCreate() {
    }
}
