package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class e70 {
    public static android.window.OnBackInvokedDispatcher a(android.view.View r0) {
            android.window.OnBackInvokedDispatcher r0 = r0.findOnBackInvokedDispatcher()
            return r0
    }

    public static android.window.OnBackInvokedCallback b(java.lang.Runnable r2) {
            java.util.Objects.requireNonNull(r2)
            j3 r0 = new j3
            r1 = 2
            r0.<init>(r1, r2)
            return r0
    }

    public static void c(java.lang.Object r1, java.lang.Object r2) {
            android.window.OnBackInvokedDispatcher r1 = (android.window.OnBackInvokedDispatcher) r1
            r0 = 1000000(0xf4240, float:1.401298E-39)
            android.window.OnBackInvokedCallback r2 = (android.window.OnBackInvokedCallback) r2
            r1.registerOnBackInvokedCallback(r0, r2)
            return
    }

    public static void d(java.lang.Object r0, java.lang.Object r1) {
            android.window.OnBackInvokedDispatcher r0 = (android.window.OnBackInvokedDispatcher) r0
            android.window.OnBackInvokedCallback r1 = (android.window.OnBackInvokedCallback) r1
            r0.unregisterOnBackInvokedCallback(r1)
            return
    }
}
