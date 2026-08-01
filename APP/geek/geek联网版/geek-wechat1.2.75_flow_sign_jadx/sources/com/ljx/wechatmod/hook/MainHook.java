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
        AbstractC0493mp.m1857g(b50.m492a("xiujhaRTbQ==\n", "qlvT5NYyAMg=\n"), loadPackageParam);
        if (AbstractC0493mp.m1853c(loadPackageParam.packageName, b50.m492a("bFC4DR4+Fpd4WrZLEyAD1ms=\n", "Dz/VI3JUbrk=\n"))) {
            XposedHelpers.findAndHookMethod(b50.m492a("W9coJnX65WtP3SZgeOTwKlyWMGE33fwsVvkmfHDm9DFB\n", "OLhFCBmQnUU=\n"), loadPackageParam.classLoader, b50.m492a("UQ4iZJqbq915HhtiiIs=\n", "OH1vC/7ux7g=\n"), new Object[]{new C0644qs()});
        } else if (AbstractC0493mp.m1853c(loadPackageParam.packageName, b50.m492a("lV7kFvv568aTX/0W4vE=\n", "9jGJOI+chaU=\n"))) {
            XposedHelpers.findAndHookMethod(Application.class, b50.m492a("4yEhBvXUIGA=\n", "jE9idJC1VAU=\n"), new Object[]{new C0385js(4, loadPackageParam)});
        }
    }
}
