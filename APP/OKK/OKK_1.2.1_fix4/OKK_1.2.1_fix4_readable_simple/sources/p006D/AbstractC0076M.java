package p006D;

import android.view.View;
import android.view.WindowInsetsController;

/* JADX INFO: renamed from: D.M */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0076M {
    /* JADX INFO: renamed from: a */
    public static int m273a(View r02) {
        return r02.getImportantForContentCapture();
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m274b(View r02) {
        return r02.getStateDescription();
    }

    /* JADX INFO: renamed from: c */
    public static C0128t0 m275c(View r1) {
        WindowInsetsController r12 = r1.getWindowInsetsController();
        if (r12 != null) goto L7;
        return null;
    L7:
        return new C0128t0(r12);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m276d(View r02) {
        return r02.isImportantForContentCapture();
    }

    /* JADX INFO: renamed from: e */
    public static void m277e(View r02, int r1) {
        r02.setImportantForContentCapture(r1);
    }

    /* JADX INFO: renamed from: f */
    public static void m278f(View r02, CharSequence r1) {
        r02.setStateDescription(r1);
    }
}
