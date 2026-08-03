package p000;

import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: IF */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0360IF {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m798a() {
        return WindowInsets.Type.displayCutout();
    }

    /* JADX INFO: renamed from: b */
    public static /* bridge */ /* synthetic */ WindowInsetsController m799b(Window r0) {
        return r0.getInsetsController();
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ void m800c(WindowInsetsController r1) {
        r1.setSystemBarsAppearance(8, 8);
    }

    /* JADX INFO: renamed from: d */
    public static /* bridge */ /* synthetic */ void m801d(WindowInsetsController r2) {
        r2.setSystemBarsAppearance(0, 8);
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ void m802e(WindowInsetsController r1) {
        r1.setSystemBarsAppearance(16, 16);
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ void m803f(WindowInsetsController r2) {
        r2.setSystemBarsAppearance(0, 16);
    }
}
