package defpackage;

/* JADX INFO: renamed from: ᛵᛴᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0868 {
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static void m1844(java.lang.Object r0, java.lang.Object r1) {
            android.window.OnBackInvokedDispatcher r0 = (android.window.OnBackInvokedDispatcher) r0
            android.window.OnBackInvokedCallback r1 = (android.window.OnBackInvokedCallback) r1
            r0.unregisterOnBackInvokedCallback(r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static void m1845(java.lang.Object r1, java.lang.Object r2) {
            android.window.OnBackInvokedDispatcher r1 = (android.window.OnBackInvokedDispatcher) r1
            r0 = 1000000(0xf4240, float:1.401298E-39)
            android.window.OnBackInvokedCallback r2 = (android.window.OnBackInvokedCallback) r2
            r1.registerOnBackInvokedCallback(r0, r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static android.window.OnBackInvokedDispatcher m1846(android.view.View r0) {
            android.window.OnBackInvokedDispatcher r0 = r0.findOnBackInvokedDispatcher()
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static android.window.OnBackInvokedCallback m1847(java.lang.Runnable r2) {
            ᲀᲈᛸᛳ r0 = new ᲀᲈᛸᛳ
            r1 = 2
            r0.<init>(r1, r2)
            return r0
    }
}
