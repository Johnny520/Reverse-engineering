package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class uc0 {
    public static /* bridge */ /* synthetic */ int a() {
            int r0 = android.view.WindowInsets.Type.displayCutout()
            return r0
    }

    public static /* bridge */ /* synthetic */ android.view.WindowInsetsController b(android.view.Window r0) {
            android.view.WindowInsetsController r0 = r0.getInsetsController()
            return r0
    }

    public static /* bridge */ /* synthetic */ void c(android.view.WindowInsetsController r1) {
            r0 = 8
            r1.setSystemBarsAppearance(r0, r0)
            return
    }

    public static /* bridge */ /* synthetic */ void d(android.view.WindowInsetsController r2) {
            r0 = 0
            r1 = 8
            r2.setSystemBarsAppearance(r0, r1)
            return
    }

    public static /* bridge */ /* synthetic */ void e(android.view.WindowInsetsController r1) {
            r0 = 16
            r1.setSystemBarsAppearance(r0, r0)
            return
    }

    public static /* bridge */ /* synthetic */ void f(android.view.WindowInsetsController r2) {
            r0 = 0
            r1 = 16
            r2.setSystemBarsAppearance(r0, r1)
            return
    }
}
