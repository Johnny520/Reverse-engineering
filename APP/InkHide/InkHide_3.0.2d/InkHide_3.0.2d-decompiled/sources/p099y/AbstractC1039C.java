package p099y;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: y.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1039C {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1075g0 m2252a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        C1075g0 c1075g0M2342c = C1075g0.m2342c(rootWindowInsets, null);
        C1073f0 c1073f0 = c1075g0M2342c.f3705a;
        c1073f0.mo2320l(c1075g0M2342c);
        c1073f0.mo2315d(view.getRootView());
        return c1075g0M2342c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m2253b(View view) {
        return view.getScrollIndicators();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m2254c(View view, int i2) {
        view.setScrollIndicators(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m2255d(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }
}
