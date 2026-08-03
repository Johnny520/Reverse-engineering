package com.yuexin.panel.hook;

import Yue.C3270;
import Yue.C5311;
import Yue.C5433;
import Yue.C6352;
import android.app.Application;
import android.content.Context;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.wrapper.ModuleUtil;
import com.yuexin.panel.security.SignatureGuard;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: loaded from: classes2.dex */
public class MainHook implements IXposedHookLoadPackage, IXposedHookZygoteInit {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final String f30774 = "com.yuexin.panel";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final Object f30775 = new Object();

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static ClassLoader f30776;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static String f30777;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static String f30778;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile boolean f30779;

    /* JADX INFO: renamed from: com.yuexin.panel.hook.MainHook$ۥ */
    public class C2598 extends XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f30780;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ XC_LoadPackage.LoadPackageParam f30781;

        public C2598(XC_LoadPackage.LoadPackageParam loadPackageParam) {
            this.f30781 = loadPackageParam;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (this.f30780) {
                return;
            }
            this.f30780 = true;
            MainHook.m31056();
            MainHook.m31058(this.f30781);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m31056() {
        if (f30779) {
            return;
        }
        synchronized (f30775) {
            try {
                if (f30779) {
                    return;
                }
                m31059("miao");
                SignatureGuard.assertValid(f30777);
                if (C6352.m2815("yuexin") || C6352.m2815("yuexinya")) {
                    m31059("yuexinya");
                    m31059("yuexin");
                }
                m31059("dexkit");
                m31059("url_encode");
                f30779 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static DexKitBridge m31057() {
        m31056();
        SignatureGuard.assertValid(f30777);
        return DexKitBridge.create(f30778);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m31058(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        f30776 = loadPackageParam.classLoader;
        String str = loadPackageParam.packageName;
        f30778 = loadPackageParam.appInfo.sourceDir;
        C3270.m6715(f30777);
        DialogX.implIMPLMode = DialogX.IMPL_MODE.WINDOW;
        DialogX.globalTheme = DialogX.THEME.AUTO;
        DialogX.enableImmersiveMode = true;
        C3270.m6720(MainHook.class.getClassLoader());
        C3270.m6718(f30776);
        C5433.m2205(str);
        C5311.m2094(f30776);
        C5311.m2095(C3270.m6709());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m31059(String str) {
        C6352.m19853(str);
    }

    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        if (!loadPackageParam.isFirstApplication || "com.yuexin.panel".equals(loadPackageParam.packageName)) {
            return;
        }
        XposedHelpers.findAndHookMethod(Application.class, "attach", new Object[]{Context.class, new C2598(loadPackageParam)});
    }

    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) {
        String str = startupParam.modulePath;
        f30777 = str;
        ModuleUtil.modulePath = str;
        C6352.m19856(f30777);
    }
}
