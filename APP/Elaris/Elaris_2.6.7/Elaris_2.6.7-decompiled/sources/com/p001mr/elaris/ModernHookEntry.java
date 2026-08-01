package com.p001mr.elaris;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;
import io.github.libxposed.api.XposedModuleInterface;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC0000a;
import p000.AbstractC0009a8;
import p000.AbstractC0233ga;
import p000.RunnableC0239h0;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ModernHookEntry extends XposedModule {
    private static final Set<String> DISPATCHED = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: QQ */
    private static final String f117QQ = "com.tencent.mobileqq";
    private volatile String processName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ModernHookEntry(XposedInterface xposedInterface, XposedModuleInterface.ModuleLoadedParam moduleLoadedParam) {
        this.processName = "";
        attachFrameworkCompat(xposedInterface);
        attachCompatBridge(xposedInterface);
        if (moduleLoadedParam != null) {
            this.processName = safeString(moduleLoadedParam.getProcessName());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void attachCompatBridge(XposedInterface xposedInterface) {
        if (xposedInterface == null) {
            return;
        }
        try {
            Class.forName("com.mr.elaris.xposedcompat.XposedBridge", false, ModernHookEntry.class.getClassLoader()).getDeclaredMethod("attachModernFramework", XposedInterface.class).invoke(null, xposedInterface);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void attachFrameworkCompat(XposedInterface xposedInterface) {
        if (xposedInterface == null) {
            return;
        }
        if (invokeAttachFramework(findAttachFrameworkMethod(XposedInterface.class, Runnable.class), xposedInterface, new RunnableC0239h0(6, xposedInterface))) {
            return;
        }
        invokeAttachFramework(findAttachFrameworkMethod(XposedInterface.class), xposedInterface);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void detachCompatBridge(XposedInterface xposedInterface) {
        if (xposedInterface == null) {
            return;
        }
        try {
            Class.forName("com.mr.elaris.xposedcompat.XposedBridge", false, ModernHookEntry.class.getClassLoader()).getDeclaredMethod("detachModernFramework", XposedInterface.class).invoke(null, xposedInterface);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void dispatch(String str, ApplicationInfo applicationInfo, ClassLoader classLoader, boolean z) {
        if (f117QQ.equals(str)) {
            StringBuilder sbM1b = AbstractC0000a.m1b("package callback package=", str, ", process=");
            sbM1b.append(resolveProcessName(str, applicationInfo));
            sbM1b.append(", firstPackage=");
            sbM1b.append(z);
            sbM1b.append(", classLoader=");
            sbM1b.append(classLoader != null);
            HookEntry.log(sbM1b.toString());
            if (classLoader == null) {
                return;
            }
            String strResolveProcessName = resolveProcessName(str, applicationInfo);
            if (DISPATCHED.add(str + "@" + strResolveProcessName)) {
                try {
                    if (f117QQ.equals(str)) {
                        rememberHostSourceDir(applicationInfo);
                        HookEntry.handleHostPackage(str, strResolveProcessName, classLoader);
                    }
                } catch (Throwable th) {
                    HookEntry.log("modern dispatch failed: " + th);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findAttachFrameworkMethod(Class<?>... clsArr) {
        Class<ModernHookEntry> superclass = ModernHookEntry.class;
        try {
            Method method = superclass.getMethod("attachFramework", clsArr);
            method.setAccessible(true);
            return method;
        } catch (Throwable unused) {
            while (superclass != null) {
                try {
                    Method declaredMethod = superclass.getDeclaredMethod("attachFramework", clsArr);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused2) {
                    superclass = superclass.getSuperclass();
                }
            }
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean invokeAttachFramework(Method method, Object... objArr) {
        if (method == null) {
            return false;
        }
        try {
            method.invoke(this, objArr);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String processNameFromActivityThread() {
        try {
            Object objInvoke = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null).invoke(null, null);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
        } catch (Throwable unused) {
        }
        try {
            Object objInvoke2 = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", null).invoke(null, null);
            if (objInvoke2 == null) {
                return "";
            }
            Object objInvoke3 = objInvoke2.getClass().getDeclaredMethod("getProcessName", null).invoke(objInvoke2, null);
            return objInvoke3 instanceof String ? (String) objInvoke3 : "";
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean reinstallCurrentHostForHotReload(XposedModuleInterface.HotReloadedParam hotReloadedParam) {
        String strSafeString = "";
        try {
            Application applicationM70a = AbstractC0009a8.m70a();
            if (applicationM70a != null) {
                strSafeString = safeString(applicationM70a.getPackageName());
            }
        } catch (Throwable unused) {
        }
        if (strSafeString.length() == 0 && hotReloadedParam != null) {
            String strSafeString2 = safeString(hotReloadedParam.getProcessName());
            if (strSafeString2.equals(f117QQ) || strSafeString2.startsWith("com.tencent.mobileqq:")) {
                strSafeString = f117QQ;
            }
        }
        if (f117QQ.equals(strSafeString)) {
            return HookEntry.reinstallForHotReload();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void rememberHostSourceDir(ApplicationInfo applicationInfo) {
        String str;
        if (applicationInfo == null) {
            str = null;
        } else {
            try {
                str = applicationInfo.sourceDir;
            } catch (Throwable unused) {
                return;
            }
        }
        Set set = AbstractC0233ga.f312a;
        if (str == null || str.length() <= 0) {
            return;
        }
        AbstractC0233ga.f322k = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String resolveProcessName(String str, ApplicationInfo applicationInfo) {
        String strProcessNameFromActivityThread = processNameFromActivityThread();
        if (strProcessNameFromActivityThread.length() == 0) {
            strProcessNameFromActivityThread = this.processName;
        }
        if (strProcessNameFromActivityThread.length() == 0 && applicationInfo != null) {
            strProcessNameFromActivityThread = safeString(applicationInfo.processName);
        }
        return strProcessNameFromActivityThread.length() == 0 ? str : strProcessNameFromActivityThread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String safeString(String str) {
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void unhookOldHooks(XposedModuleInterface.HotReloadedParam hotReloadedParam) {
        if (hotReloadedParam == null) {
            return;
        }
        try {
            List<XposedInterface.HookHandle> oldHookHandles = hotReloadedParam.getOldHookHandles();
            if (oldHookHandles == null) {
                return;
            }
            int i = 0;
            for (XposedInterface.HookHandle hookHandle : oldHookHandles) {
                if (hookHandle != null) {
                    try {
                        hookHandle.unhook();
                        i++;
                    } catch (Throwable unused) {
                    }
                }
            }
            HookEntry.logAlways("hot reload old hooks removed=" + i);
        } catch (Throwable th) {
            HookEntry.log("hot reload old hook cleanup failed: " + th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onHotReloaded(XposedModuleInterface.HotReloadedParam hotReloadedParam) {
        attachFrameworkCompat(this);
        attachCompatBridge(this);
        if (hotReloadedParam != null) {
            Object savedInstanceState = hotReloadedParam.getSavedInstanceState();
            if (savedInstanceState instanceof String) {
                this.processName = safeString((String) savedInstanceState);
            }
            if (this.processName.length() == 0) {
                this.processName = safeString(hotReloadedParam.getProcessName());
            }
        }
        DISPATCHED.clear();
        unhookOldHooks(hotReloadedParam);
        if (reinstallCurrentHostForHotReload(hotReloadedParam)) {
            HookEntry.logAlways("hot reload applied: hooks reinstalled");
        } else {
            HookEntry.logAlways("hot reload skipped: host context not ready");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean onHotReloading(XposedModuleInterface.HotReloadingParam hotReloadingParam) {
        if (hotReloadingParam == null) {
            return true;
        }
        hotReloadingParam.setSavedInstanceState(this.processName);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onModuleLoaded(XposedModuleInterface.ModuleLoadedParam moduleLoadedParam) {
        attachCompatBridge(this);
        if (moduleLoadedParam != null) {
            this.processName = safeString(moduleLoadedParam.getProcessName());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onPackageLoaded(XposedModuleInterface.PackageLoadedParam packageLoadedParam) {
        attachCompatBridge(this);
        if (packageLoadedParam == null || (packageLoadedParam instanceof XposedModuleInterface.PackageReadyParam)) {
            return;
        }
        dispatch(packageLoadedParam.getPackageName(), packageLoadedParam.getApplicationInfo(), packageLoadedParam.getDefaultClassLoader(), packageLoadedParam.isFirstPackage());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onPackageReady(XposedModuleInterface.PackageReadyParam packageReadyParam) {
        attachCompatBridge(this);
        if (packageReadyParam == null) {
            return;
        }
        dispatch(packageReadyParam.getPackageName(), packageReadyParam.getApplicationInfo(), packageReadyParam.getClassLoader(), packageReadyParam.isFirstPackage());
    }

    public ModernHookEntry() {
        this.processName = "";
    }
}
