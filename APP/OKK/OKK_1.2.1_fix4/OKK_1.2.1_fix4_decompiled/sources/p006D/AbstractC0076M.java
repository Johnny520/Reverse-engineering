package p006D;

import android.view.View;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: D.M */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0076M {
    /* JADX INFO: renamed from: a */
    public static int m273a(View view) {
        return view.getImportantForContentCapture();
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m274b(View view) {
        return view.getStateDescription();
    }

    /* JADX INFO: renamed from: c */
    public static C0128t0 m275c(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new C0128t0(windowInsetsController);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m276d(View view) {
        return view.isImportantForContentCapture();
    }

    /* JADX INFO: renamed from: e */
    public static void m277e(View view, int i2) {
        view.setImportantForContentCapture(i2);
    }

    /* JADX INFO: renamed from: f */
    public static void m278f(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
