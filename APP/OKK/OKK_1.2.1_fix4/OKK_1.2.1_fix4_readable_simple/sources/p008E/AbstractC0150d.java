package p008E;

import android.app.Dialog;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: E.d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0150d {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ PackageInfo m470a(PackageManager r02, String r1, PackageManager.PackageInfoFlags r2) {
        return r02.getPackageInfo(r1, r2);
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ PackageManager.PackageInfoFlags m471b() {
        return PackageManager.PackageInfoFlags.of(0);
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m472c() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ OnBackInvokedCallback m473d(Object r02) {
        return (OnBackInvokedCallback) r02;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m474e(Dialog r02) {
        return r02.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ void m475f(OnBackInvokedDispatcher r1, OnBackInvokedCallback r2) {
        r1.registerOnBackInvokedCallback(0, r2);
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m476g(OnBackInvokedDispatcher r02, OnBackInvokedCallback r1) {
        r02.unregisterOnBackInvokedCallback(r1);
    }
}
