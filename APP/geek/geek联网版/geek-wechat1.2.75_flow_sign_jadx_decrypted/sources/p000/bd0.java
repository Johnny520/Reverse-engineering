package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bd0 {

    /* JADX INFO: renamed from: b */
    public static final bd0 f723b;

    /* JADX INFO: renamed from: a */
    public final yc0 f724a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f723b = xc0.f5236q;
        } else {
            f723b = yc0.f5426b;
        }
    }

    public bd0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f724a = new xc0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f724a = new wc0(this, windowInsets);
        } else if (i >= 28) {
            this.f724a = new vc0(this, windowInsets);
        } else {
            this.f724a = new tc0(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: e */
    public static C0346ip m514e(C0346ip c0346ip, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c0346ip.f2571a - i);
        int iMax2 = Math.max(0, c0346ip.f2572b - i2);
        int iMax3 = Math.max(0, c0346ip.f2573c - i3);
        int iMax4 = Math.max(0, c0346ip.f2574d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c0346ip : C0346ip.m1524b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: g */
    public static bd0 m515g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        bd0 bd0Var = new bd0(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = oa0.f3426a;
            if (aa0.m39b(view)) {
                bd0 bd0VarM981a = ea0.m981a(view);
                yc0 yc0Var = bd0Var.f724a;
                yc0Var.mo2373p(bd0VarM981a);
                yc0Var.mo2367d(view.getRootView());
            }
        }
        return bd0Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m516a() {
        return this.f724a.mo2369j().f2574d;
    }

    /* JADX INFO: renamed from: b */
    public final int m517b() {
        return this.f724a.mo2369j().f2571a;
    }

    /* JADX INFO: renamed from: c */
    public final int m518c() {
        return this.f724a.mo2369j().f2573c;
    }

    /* JADX INFO: renamed from: d */
    public final int m519d() {
        return this.f724a.mo2369j().f2572b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bd0) {
            return AbstractC0908xw.m2709a(this.f724a, ((bd0) obj).f724a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final WindowInsets m520f() {
        yc0 yc0Var = this.f724a;
        if (yc0Var instanceof sc0) {
            return ((sc0) yc0Var).f4305c;
        }
        return null;
    }

    public final int hashCode() {
        yc0 yc0Var = this.f724a;
        if (yc0Var == null) {
            return 0;
        }
        return yc0Var.hashCode();
    }

    public bd0() {
        this.f724a = new yc0(this);
    }
}
