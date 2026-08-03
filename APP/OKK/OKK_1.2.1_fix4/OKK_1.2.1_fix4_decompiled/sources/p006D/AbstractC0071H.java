package p006D;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: D.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0071H {
    /* JADX INFO: renamed from: a */
    public static C0122q0 m237a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C0122q0 c0122q0M429d = C0122q0.m429d(null, rootWindowInsets);
        C0118o0 c0118o0 = c0122q0M429d.f309a;
        c0118o0.mo386p(c0122q0M429d);
        c0118o0.mo380d(view.getRootView());
        return c0122q0M429d;
    }

    /* JADX INFO: renamed from: b */
    public static int m238b(View view) {
        return view.getScrollIndicators();
    }

    /* JADX INFO: renamed from: c */
    public static void m239c(View view, int i2) {
        view.setScrollIndicators(i2);
    }

    /* JADX INFO: renamed from: d */
    public static void m240d(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }
}
