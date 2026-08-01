package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class ea0 {
    /* JADX INFO: renamed from: a */
    public static bd0 m981a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        bd0 bd0VarM515g = bd0.m515g(null, rootWindowInsets);
        yc0 yc0Var = bd0VarM515g.f724a;
        yc0Var.mo2373p(bd0VarM515g);
        yc0Var.mo2367d(view.getRootView());
        return bd0VarM515g;
    }

    /* JADX INFO: renamed from: b */
    public static int m982b(View view) {
        return view.getScrollIndicators();
    }

    /* JADX INFO: renamed from: c */
    public static void m983c(View view, int i) {
        view.setScrollIndicators(i);
    }

    /* JADX INFO: renamed from: d */
    public static void m984d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
