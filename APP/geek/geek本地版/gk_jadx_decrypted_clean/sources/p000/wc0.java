package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wc0 {

    /* JADX INFO: renamed from: b */
    public static final wc0 f4954b;

    /* JADX INFO: renamed from: a */
    public final tc0 f4955a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f4954b = sc0.f4425q;
        } else {
            f4954b = tc0.f4561b;
        }
    }

    public wc0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f4955a = new sc0(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f4955a = new rc0(this, windowInsets);
        } else if (i >= 28) {
            this.f4955a = new qc0(this, windowInsets);
        } else {
            this.f4955a = new oc0(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: e */
    public static C0195ep m2562e(C0195ep c0195ep, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c0195ep.f1828a - i);
        int iMax2 = Math.max(0, c0195ep.f1829b - i2);
        int iMax3 = Math.max(0, c0195ep.f1830c - i3);
        int iMax4 = Math.max(0, c0195ep.f1831d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c0195ep : C0195ep.m1050b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: g */
    public static wc0 m2563g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        wc0 wc0Var = new wc0(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = ja0.f2600a;
            if (v90.m2495b(view)) {
                wc0 wc0VarM2782a = z90.m2782a(view);
                tc0 tc0Var = wc0Var.f4955a;
                tc0Var.mo1937p(wc0VarM2782a);
                tc0Var.mo1931d(view.getRootView());
            }
        }
        return wc0Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m2564a() {
        return this.f4955a.mo1933j().f1831d;
    }

    /* JADX INFO: renamed from: b */
    public final int m2565b() {
        return this.f4955a.mo1933j().f1828a;
    }

    /* JADX INFO: renamed from: c */
    public final int m2566c() {
        return this.f4955a.mo1933j().f1830c;
    }

    /* JADX INFO: renamed from: d */
    public final int m2567d() {
        return this.f4955a.mo1933j().f1829b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wc0) {
            return AbstractC0612pw.m2131a(this.f4955a, ((wc0) obj).f4955a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final WindowInsets m2568f() {
        tc0 tc0Var = this.f4955a;
        if (tc0Var instanceof nc0) {
            return ((nc0) tc0Var).f3390c;
        }
        return null;
    }

    public final int hashCode() {
        tc0 tc0Var = this.f4955a;
        if (tc0Var == null) {
            return 0;
        }
        return tc0Var.hashCode();
    }

    public wc0() {
        this.f4955a = new tc0(this);
    }
}
