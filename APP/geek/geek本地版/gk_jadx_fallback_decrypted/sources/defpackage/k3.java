package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class k3 {
    public static android.window.OnBackInvokedDispatcher a(android.app.Activity r0) {
            android.window.OnBackInvokedDispatcher r0 = defpackage.e0.d(r0)
            return r0
    }

    public static android.window.OnBackInvokedCallback b(java.lang.Object r2, defpackage.r3 r3) {
            java.util.Objects.requireNonNull(r3)
            j3 r0 = new j3
            r1 = 0
            r0.<init>(r1, r3)
            android.window.OnBackInvokedDispatcher r2 = defpackage.e0.e(r2)
            defpackage.e0.g(r2, r0)
            return r0
    }

    public static void c(java.lang.Object r0, java.lang.Object r1) {
            android.window.OnBackInvokedCallback r1 = defpackage.e0.b(r1)
            android.window.OnBackInvokedDispatcher r0 = defpackage.e0.e(r0)
            defpackage.e0.h(r0, r1)
            return
    }
}
