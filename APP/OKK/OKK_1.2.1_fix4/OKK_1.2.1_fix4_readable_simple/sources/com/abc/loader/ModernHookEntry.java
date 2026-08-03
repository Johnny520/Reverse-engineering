package com.abc.loader;

import com.abc.core.runtime.AbstractC0805P;
import com.abc.core.runtime.C0822d0;
import com.abc.core.runtime.ModuleBootstrap;
import de.robv.android.xposed.AbstractC0762d;
import io.github.libxposed.api.XposedModule;
import io.github.libxposed.api.XposedModuleInterface;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p002B.AbstractC0053c;
import p031Q0.AbstractC0307g;
import p042W0.AbstractC0425j;
import p046a.InterfaceC0470a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0470a
public final class ModernHookEntry extends XposedModule {
    private static final C0822d0 Companion = null;

    @Deprecated
    public static final String TAG = "OKK-Modern";

    @Deprecated
    public static final String WECHAT_PACKAGE = "com.tencent.mm";

    static {
        Companion = new C0822d0();
    }

    public ModernHookEntry() {
    }

    public void onModuleLoaded(XposedModuleInterface.ModuleLoadedParam r2) {
        AbstractC0307g.m703e(r2, "param");
        AbstractC0762d.m1953c(this);
        AbstractC0805P.m2041U(getModuleApplicationInfo().sourceDir);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        AbstractC0040p.m116u(th);
    }

    public void onPackageReady(XposedModuleInterface.PackageReadyParam r5) {
        AbstractC0307g.m703e(r5, "param");
        if (AbstractC0307g.m699a(r5.getPackageName(), WECHAT_PACKAGE) == true) goto L5;
        return;
    L5:
        String r02 = AbstractC0053c.m185p();
        String r2 = null;
        if (r02 != null) goto L8;
    L12:
        String r03 = r5.getApplicationInfo().processName;
        if (r03 != null) goto L15;
    L17:
        if (r2 != null) goto L19;
        r02 = r5.getPackageName();
        AbstractC0307g.m702d(r02, "getPackageName(...)");
    L20:
        r5.getPackageName();
        r5.isFirstPackage();
        AtomicBoolean r22 = ModuleBootstrap.f2976a;
        String r23 = r5.getPackageName();
        AbstractC0307g.m702d(r23, "getPackageName(...)");
        boolean r1 = r5.isFirstPackage();
        ClassLoader r52 = r5.getClassLoader();
        AbstractC0307g.m702d(r52, "getClassLoader(...)");
        ModuleBootstrap.m2128b(r23, r02, r1, r52, getModuleApplicationInfo().sourceDir);
        return;
    L19:
        r02 = r2;
        goto L20
    L15:
        if ((!AbstractC0425j.m1013R0(r03)) == false) goto L17;
        r2 = r03;
        goto L17
    L8:
        if ((!AbstractC0425j.m1013R0(r02)) == true) goto L11;
        r02 = null;
    L11:
        if (r02 != null) goto L20;
        goto L12
    }
}
