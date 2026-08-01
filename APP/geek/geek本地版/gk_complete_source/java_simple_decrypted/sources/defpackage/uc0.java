package defpackage;

import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class uc0 {
    public static /* bridge */ /* synthetic */ int a() {
        return WindowInsets.Type.displayCutout();
    }

    public static /* bridge */ /* synthetic */ WindowInsetsController b(Window r0) {
        return r0.getInsetsController();
    }

    public static /* bridge */ /* synthetic */ void c(WindowInsetsController r1) {
        r1.setSystemBarsAppearance(8, 8);
    }

    public static /* bridge */ /* synthetic */ void d(WindowInsetsController r2) {
        r2.setSystemBarsAppearance(0, 8);
    }

    public static /* bridge */ /* synthetic */ void e(WindowInsetsController r1) {
        r1.setSystemBarsAppearance(16, 16);
    }

    public static /* bridge */ /* synthetic */ void f(WindowInsetsController r2) {
        r2.setSystemBarsAppearance(0, 16);
    }
}
