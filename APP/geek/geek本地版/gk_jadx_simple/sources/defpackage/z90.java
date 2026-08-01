package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class z90 {
    public static wc0 a(View r2) {
        WindowInsets r0 = r2.getRootWindowInsets();
        if (r0 != null) goto L5;
        return null;
    L5:
        wc0 r02 = wc0.g(null, r0);
        tc0 r1 = r02.a;
        r1.p(r02);
        r1.d(r2.getRootView());
        return r02;
    }

    public static int b(View r0) {
        return r0.getScrollIndicators();
    }

    public static void c(View r0, int r1) {
        r0.setScrollIndicators(r1);
    }

    public static void d(View r0, int r1, int r2) {
        r0.setScrollIndicators(r1, r2);
    }
}
