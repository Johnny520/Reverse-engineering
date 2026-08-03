package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H {
    public static /* bridge */ /* synthetic */ android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction a() {
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r0 = android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS
            return r0
    }

    public static /* bridge */ /* synthetic */ android.window.OnBackInvokedCallback b(java.lang.Object r0) {
            android.window.OnBackInvokedCallback r0 = (android.window.OnBackInvokedCallback) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ android.window.OnBackInvokedDispatcher c(a.E3 r0) {
            android.window.OnBackInvokedDispatcher r0 = r0.getOnBackInvokedDispatcher()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.window.OnBackInvokedDispatcher d(android.app.Activity r0) {
            android.window.OnBackInvokedDispatcher r0 = r0.getOnBackInvokedDispatcher()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.window.OnBackInvokedDispatcher e(java.lang.Object r0) {
            android.window.OnBackInvokedDispatcher r0 = (android.window.OnBackInvokedDispatcher) r0
            return r0
    }

    public static /* bridge */ /* synthetic */ void f(android.window.OnBackInvokedDispatcher r1, a.V0 r2) {
            r0 = 1000000(0xf4240, float:1.401298E-39)
            r1.registerOnBackInvokedCallback(r0, r2)
            return
    }

    public static /* bridge */ /* synthetic */ void g(android.window.OnBackInvokedDispatcher r0, android.window.OnBackInvokedCallback r1) {
            r0.unregisterOnBackInvokedCallback(r1)
            return
    }
}
