package com.abc.loader;

import android.app.Application;
import de.robv.android.xposed.AbstractC0762d;
import io.github.libxposed.api.XposedModule;
import io.github.libxposed.api.XposedModuleInterface;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;
import p046a.InterfaceC0470a;
import p056f0.AbstractC0805P;
import p056f0.C0820c0;
import p056f0.C0822d0;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0470a
public final class ModernHookEntry extends XposedModule {
    private static final C0822d0 Companion = new C0822d0();

    @Deprecated
    public static final String TAG = "OKK-Modern";

    @Deprecated
    public static final String WECHAT_PACKAGE = "com.tencent.mm";

    public void onModuleLoaded(XposedModuleInterface.ModuleLoadedParam moduleLoadedParam) {
        AbstractC0307g.m703e(moduleLoadedParam, "param");
        AbstractC0762d.m1953c(this);
        try {
            AbstractC0805P.m2041U(getModuleApplicationInfo().sourceDir);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPackageReady(XposedModuleInterface.PackageReadyParam packageReadyParam) {
        AbstractC0307g.m703e(packageReadyParam, "param");
        if (AbstractC0307g.m699a(packageReadyParam.getPackageName(), WECHAT_PACKAGE)) {
            String processName = Application.getProcessName();
            String str = null;
            if (processName == null) {
                String str2 = packageReadyParam.getApplicationInfo().processName;
                if (str2 != null && (!AbstractC0425j.m1013R0(str2))) {
                    str = str2;
                }
                if (str == null) {
                    processName = packageReadyParam.getPackageName();
                    AbstractC0307g.m702d(processName, "getPackageName(...)");
                } else {
                    processName = str;
                }
            } else {
                if (!(!AbstractC0425j.m1013R0(processName))) {
                    processName = null;
                }
                if (processName == null) {
                }
            }
            packageReadyParam.getPackageName();
            packageReadyParam.isFirstPackage();
            AtomicBoolean atomicBoolean = C0820c0.f2976a;
            String packageName = packageReadyParam.getPackageName();
            AbstractC0307g.m702d(packageName, "getPackageName(...)");
            boolean zIsFirstPackage = packageReadyParam.isFirstPackage();
            ClassLoader classLoader = packageReadyParam.getClassLoader();
            AbstractC0307g.m702d(classLoader, "getClassLoader(...)");
            C0820c0.m2128b(packageName, processName, zIsFirstPackage, classLoader, getModuleApplicationInfo().sourceDir);
        }
    }
}
