package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class bc0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final C0014ad f807a;

    /* JADX INFO: renamed from: b */
    public wc0 f808b;

    public bc0(View view, C0014ad c0014ad) {
        wc0 wc0VarMo1433b;
        this.f807a = c0014ad;
        WeakHashMap weakHashMap = ja0.f2600a;
        wc0 wc0VarM2782a = z90.m2782a(view);
        if (wc0VarM2782a != null) {
            int i = Build.VERSION.SDK_INT;
            wc0VarMo1433b = (i >= 30 ? new lc0(wc0VarM2782a) : i >= 29 ? new kc0(wc0VarM2782a) : new ic0(wc0VarM2782a)).mo1433b();
        } else {
            wc0VarMo1433b = null;
        }
        this.f808b = wc0VarMo1433b;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.f808b = wc0.m2563g(view, windowInsets);
            return cc0.m672i(view, windowInsets);
        }
        wc0 wc0VarM2563g = wc0.m2563g(view, windowInsets);
        tc0 tc0Var = wc0VarM2563g.f4955a;
        if (this.f808b == null) {
            WeakHashMap weakHashMap = ja0.f2600a;
            this.f808b = z90.m2782a(view);
        }
        if (this.f808b == null) {
            this.f808b = wc0VarM2563g;
            return cc0.m672i(view, windowInsets);
        }
        C0014ad c0014adM673j = cc0.m673j(view);
        if (c0014adM673j != null && Objects.equals((WindowInsets) c0014adM673j.f131b, windowInsets)) {
            return cc0.m672i(view, windowInsets);
        }
        wc0 wc0Var = this.f808b;
        int i = 0;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if (!tc0Var.mo1932f(i2).equals(wc0Var.f4955a.mo1932f(i2))) {
                i |= i2;
            }
        }
        if (i == 0) {
            return cc0.m672i(view, windowInsets);
        }
        wc0 wc0Var2 = this.f808b;
        gc0 gc0Var = new gc0(i, new DecelerateInterpolator(), 160L);
        gc0Var.f2123a.mo1018d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(gc0Var.f2123a.mo1015a());
        C0195ep c0195epMo1932f = tc0Var.mo1932f(i);
        C0195ep c0195epMo1932f2 = wc0Var2.f4955a.mo1932f(i);
        int iMin = Math.min(c0195epMo1932f.f1828a, c0195epMo1932f2.f1828a);
        int i3 = c0195epMo1932f.f1829b;
        int i4 = c0195epMo1932f2.f1829b;
        int iMin2 = Math.min(i3, i4);
        int i5 = c0195epMo1932f.f1830c;
        int i6 = c0195epMo1932f2.f1830c;
        int iMin3 = Math.min(i5, i6);
        int i7 = c0195epMo1932f.f1831d;
        int i8 = c0195epMo1932f2.f1831d;
        int i9 = i;
        C0138d4 c0138d4 = new C0138d4(C0195ep.m1050b(iMin, iMin2, iMin3, Math.min(i7, i8)), C0195ep.m1050b(Math.max(c0195epMo1932f.f1828a, c0195epMo1932f2.f1828a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i8)), 21, false);
        cc0.m669f(view, windowInsets, false);
        duration.addUpdateListener(new ac0(gc0Var, wc0VarM2563g, wc0Var2, i9, view));
        duration.addListener(new o70(gc0Var, view, 2));
        ViewTreeObserverOnPreDrawListenerC0130cx.m832a(view, new s00(view, gc0Var, c0138d4, duration));
        this.f808b = wc0VarM2563g;
        return cc0.m672i(view, windowInsets);
    }
}
