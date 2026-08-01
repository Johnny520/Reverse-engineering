package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class u42 {
    /* JADX INFO: renamed from: α */
    public static android.window.OnBackInvokedDispatcher m5781(android.view.View r0) {
            android.window.OnBackInvokedDispatcher r0 = r0.findOnBackInvokedDispatcher()
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static android.window.OnBackInvokedCallback m5782(java.lang.Runnable r2) {
            java.util.Objects.requireNonNull(r2)
            b5 r0 = new b5
            r1 = 2
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static void m5783(java.lang.Object r1, java.lang.Object r2) {
            android.window.OnBackInvokedDispatcher r1 = (android.window.OnBackInvokedDispatcher) r1
            r0 = 1000000(0xf4240, float:1.401298E-39)
            android.window.OnBackInvokedCallback r2 = (android.window.OnBackInvokedCallback) r2
            r1.registerOnBackInvokedCallback(r0, r2)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static void m5784(java.lang.Object r0, java.lang.Object r1) {
            android.window.OnBackInvokedDispatcher r0 = (android.window.OnBackInvokedDispatcher) r0
            android.window.OnBackInvokedCallback r1 = (android.window.OnBackInvokedCallback) r1
            r0.unregisterOnBackInvokedCallback(r1)
            return
    }
}
