package p048d8;

import ac.RunnableC0059l;
import android.app.Application;
import android.content.Context;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import p099h.Hchat.ModuleEntry;
import p099h.Hchat.crash.C1438g;
import p300ub.AbstractC4302b;

/* JADX INFO: renamed from: d8.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0739b extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2197a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ XC_LoadPackage.LoadPackageParam f2198b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ModuleEntry f2199c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0739b(ModuleEntry moduleEntry, XC_LoadPackage.LoadPackageParam loadPackageParam, int i9) {
        this.f2197a = i9;
        this.f2199c = moduleEntry;
        this.f2198b = loadPackageParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        boolean z9;
        int i9;
        switch (this.f2197a) {
            case 0:
                Application application = (Application) methodHookParam.thisObject;
                application.getClass();
                boolean z10 = false;
                try {
                    z9 = AbstractC4302b.m8640c(application, "Hchat_global_config").getBoolean("terms_accepted", false);
                } catch (Throwable unused) {
                    z9 = false;
                }
                if (z9) {
                    try {
                        i9 = AbstractC4302b.m8640c(application, "Hchat_global_config").getInt("terms_version", 0);
                    } catch (Throwable unused2) {
                        i9 = 0;
                    }
                    if (i9 == 1) {
                        z10 = true;
                    }
                }
                ModuleEntry moduleEntry = this.f2199c;
                if (z10) {
                    C1438g.m3865g(application, moduleEntry.getClass().getClassLoader());
                }
                XC_LoadPackage.LoadPackageParam loadPackageParam = this.f2198b;
                moduleEntry.installHideBottomBarEarly(application, moduleEntry.resolveHostClassLoader(application, loadPackageParam));
                new Thread(new RunnableC0059l(this, application, loadPackageParam, 9), "Hchat-Init").start();
                break;
            case 1:
                Context context = (Context) methodHookParam.args[0];
                Object obj = methodHookParam.thisObject;
                ModuleEntry moduleEntry2 = this.f2199c;
                ClassLoader classLoaderResolveTinkerClassLoader = moduleEntry2.resolveTinkerClassLoader(obj);
                XC_LoadPackage.LoadPackageParam loadPackageParam2 = this.f2198b;
                if (classLoaderResolveTinkerClassLoader == null) {
                    classLoaderResolveTinkerClassLoader = moduleEntry2.resolveHostClassLoader(context, loadPackageParam2);
                }
                moduleEntry2.installAppBrandProcessHook(context, classLoaderResolveTinkerClassLoader, loadPackageParam2, false);
                break;
            case 2:
                Application application2 = (Application) methodHookParam.thisObject;
                ModuleEntry moduleEntry3 = this.f2199c;
                XC_LoadPackage.LoadPackageParam loadPackageParam3 = this.f2198b;
                moduleEntry3.installAppBrandProcessHook(application2, moduleEntry3.resolveHostClassLoader(application2, loadPackageParam3), loadPackageParam3, true);
                break;
            case 3:
                this.f2199c.installHotUpdateForAttach(this.f2198b, methodHookParam, "after");
                break;
            case 4:
                this.f2199c.installTabletHookForAttach(this.f2198b, methodHookParam, "after");
                break;
            default:
                Context context2 = (Context) methodHookParam.args[0];
                Object obj2 = methodHookParam.thisObject;
                ModuleEntry moduleEntry4 = this.f2199c;
                ClassLoader classLoaderResolveTinkerClassLoader2 = moduleEntry4.resolveTinkerClassLoader(obj2);
                if (classLoaderResolveTinkerClassLoader2 == null) {
                    classLoaderResolveTinkerClassLoader2 = moduleEntry4.resolveHostClassLoader(context2, this.f2198b);
                }
                moduleEntry4.installHideBottomBarEarly(context2, classLoaderResolveTinkerClassLoader2);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        boolean z9;
        int i9;
        switch (this.f2197a) {
            case 0:
                Application application = (Application) methodHookParam.thisObject;
                application.getClass();
                boolean z10 = false;
                try {
                    z9 = AbstractC4302b.m8640c(application, "Hchat_global_config").getBoolean("terms_accepted", false);
                } catch (Throwable unused) {
                    z9 = false;
                }
                if (z9) {
                    try {
                        i9 = AbstractC4302b.m8640c(application, "Hchat_global_config").getInt("terms_version", 0);
                    } catch (Throwable unused2) {
                        i9 = 0;
                    }
                    if (i9 == 1) {
                        z10 = true;
                    }
                }
                if (z10) {
                    C1438g.m3866h(application);
                }
                break;
            case 1:
            case 2:
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
            case 3:
                this.f2199c.installHotUpdateForAttach(this.f2198b, methodHookParam, "before");
                break;
            case 4:
                this.f2199c.installTabletHookForAttach(this.f2198b, methodHookParam, "before");
                break;
        }
    }
}
