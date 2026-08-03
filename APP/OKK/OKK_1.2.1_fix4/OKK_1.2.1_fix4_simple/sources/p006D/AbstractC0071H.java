package p006D;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: D.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0071H {
    /* JADX INFO: renamed from: a */
    public static C0122q0 m237a(View r2) {
        WindowInsets r02 = r2.getRootWindowInsets();
        if (r02 != null) goto L5;
        return null;
    L5:
        C0122q0 r03 = C0122q0.m429d(null, r02);
        C0118o0 r1 = r03.f309a;
        r1.mo386p(r03);
        r1.mo380d(r2.getRootView());
        return r03;
    }

    /* JADX INFO: renamed from: b */
    public static int m238b(View r02) {
        return r02.getScrollIndicators();
    }

    /* JADX INFO: renamed from: c */
    public static void m239c(View r02, int r1) {
        r02.setScrollIndicators(r1);
    }

    /* JADX INFO: renamed from: d */
    public static void m240d(View r02, int r1, int r2) {
        r02.setScrollIndicators(r1, r2);
    }
}
