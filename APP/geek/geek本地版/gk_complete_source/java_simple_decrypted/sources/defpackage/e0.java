package defpackage;

import android.app.Activity;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e0 {
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback b(Object r0) {
        return (OnBackInvokedCallback) r0;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher c(g2 r0) {
        return r0.getOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher d(Activity r0) {
        return r0.getOnBackInvokedDispatcher();
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher e(Object r0) {
        return (OnBackInvokedDispatcher) r0;
    }

    public static /* bridge */ /* synthetic */ String f(AccessibilityNodeInfo r0) {
        return r0.getUniqueId();
    }

    public static /* bridge */ /* synthetic */ void g(OnBackInvokedDispatcher r1, j3 r2) {
        r1.registerOnBackInvokedCallback(1000000, r2);
    }

    public static /* bridge */ /* synthetic */ void h(OnBackInvokedDispatcher r0, OnBackInvokedCallback r1) {
        r0.unregisterOnBackInvokedCallback(r1);
    }
}
