package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class z90 {
    /* JADX INFO: renamed from: a */
    public static wc0 m2782a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        wc0 wc0VarM2563g = wc0.m2563g(null, rootWindowInsets);
        tc0 tc0Var = wc0VarM2563g.f4955a;
        tc0Var.mo1937p(wc0VarM2563g);
        tc0Var.mo1931d(view.getRootView());
        return wc0VarM2563g;
    }

    /* JADX INFO: renamed from: b */
    public static int m2783b(View view) {
        return view.getScrollIndicators();
    }

    /* JADX INFO: renamed from: c */
    public static void m2784c(View view, int i) {
        view.setScrollIndicators(i);
    }

    /* JADX INFO: renamed from: d */
    public static void m2785d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
