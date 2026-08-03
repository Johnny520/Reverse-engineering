package p000;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: X */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0988X {
    /* JADX INFO: renamed from: a */
    public static OnBackInvokedDispatcher m1875a(Activity r0) {
        return r0.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: b */
    public static PackageInfo m1876b(PackageManager r2, Context r3) {
        return r2.getPackageInfo(r3.getPackageName(), PackageManager.PackageInfoFlags.of(0));
    }

    /* JADX INFO: renamed from: c */
    public static Object m1877c(Bundle r1, String r2) {
        return r1.getParcelable(r2, C0689Q0.class);
    }

    /* JADX INFO: renamed from: d */
    public static String m1878d(AccessibilityNodeInfo r0) {
        return r0.getUniqueId();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1879e(AccessibilityNodeInfo r0) {
        return r0.isTextSelectable();
    }

    /* JADX INFO: renamed from: f */
    public static void m1880f(Object r1, Object r2) {
        ((OnBackInvokedDispatcher) r1).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) r2);
    }

    /* JADX INFO: renamed from: g */
    public static void m1881g(Object r0, Object r1) {
        ((OnBackInvokedDispatcher) r0).unregisterOnBackInvokedCallback((OnBackInvokedCallback) r1);
    }
}
