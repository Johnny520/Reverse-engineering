package com.p001mr.elaris;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.github.libxposed.service.XposedService;
import io.github.libxposed.service.XposedServiceHelper;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class FrameworkActivationStatus {
    static final String QQ_PACKAGE = "com.tencent.mobileqq";
    private static volatile boolean sInitialized;
    private static volatile Runnable sListener;
    private static volatile XposedService sService;
    private static final Handler MAIN = new Handler(Looper.getMainLooper());
    private static final XposedServiceHelper.OnServiceListener SERVICE_LISTENER = new C0147a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private FrameworkActivationStatus() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int apiVersion() {
        XposedService xposedService = sService;
        if (xposedService == null) {
            return 0;
        }
        try {
            return xposedService.getApiVersion();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String frameworkName() {
        XposedService xposedService = sService;
        if (xposedService == null) {
            return "";
        }
        try {
            return safe(xposedService.getFrameworkName());
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String frameworkVersion() {
        XposedService xposedService = sService;
        if (xposedService == null) {
            return "";
        }
        try {
            return safe(xposedService.getFrameworkVersion());
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void init(Context context) {
        if (context == null || sInitialized) {
            return;
        }
        try {
            if (Prefs.PACKAGE_NAME.equals(context.getPackageName())) {
                XposedServiceHelper.registerListener(SERVICE_LISTENER);
                sInitialized = true;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isActiveForQq() {
        XposedService xposedService = sService;
        if (xposedService == null) {
            return false;
        }
        try {
            List<String> scope = xposedService.getScope();
            if (scope != null) {
                if (scope.contains(QQ_PACKAGE)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void notifyChanged() {
        if (sListener == null) {
            return;
        }
        try {
            MAIN.post(new RunnableC0148b());
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String safe(String str) {
        return str == null ? "" : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setListener(Runnable runnable) {
        sListener = runnable;
    }
}
