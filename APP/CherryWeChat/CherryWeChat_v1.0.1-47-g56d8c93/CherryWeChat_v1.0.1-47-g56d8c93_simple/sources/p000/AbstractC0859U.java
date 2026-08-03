package p000;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: U */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0859U {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ float m1691a() {
        return ValueAnimator.getDurationScale();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ AccessibilityNodeInfo.AccessibilityAction m1692b() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ OnBackInvokedCallback m1693c(Object r0) {
        return (OnBackInvokedCallback) r0;
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m1694d(DialogC0876Ua r0) {
        return r0.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m1695e(Activity r0) {
        return r0.getOnBackInvokedDispatcher();
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m1696f(Object r0) {
        return (OnBackInvokedDispatcher) r0;
    }

    /* JADX INFO: renamed from: g */
    public static /* bridge */ /* synthetic */ void m1697g(OnBackInvokedDispatcher r1, C2655w3 r2) {
        r1.registerOnBackInvokedCallback(1000000, r2);
    }

    /* JADX INFO: renamed from: h */
    public static /* bridge */ /* synthetic */ void m1698h(OnBackInvokedDispatcher r0, OnBackInvokedCallback r1) {
        r0.unregisterOnBackInvokedCallback(r1);
    }

    /* JADX INFO: renamed from: i */
    public static /* bridge */ /* synthetic */ boolean m1699i(C0605O2 r0) {
        return ValueAnimator.unregisterDurationScaleChangeListener(r0);
    }

    /* JADX INFO: renamed from: j */
    public static /* bridge */ /* synthetic */ boolean m1700j(C0605O2 r0) {
        return ValueAnimator.registerDurationScaleChangeListener(r0);
    }
}
