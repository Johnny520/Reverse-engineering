package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gc0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public final C0407kd f1951a;

    /* JADX INFO: renamed from: b */
    public bd0 f1952b;

    public gc0(View view, C0407kd c0407kd) {
        bd0 bd0VarMo1944b;
        this.f1951a = c0407kd;
        WeakHashMap weakHashMap = oa0.f3426a;
        bd0 bd0VarM981a = ea0.m981a(view);
        if (bd0VarM981a != null) {
            int i = Build.VERSION.SDK_INT;
            bd0VarMo1944b = (i >= 30 ? new qc0(bd0VarM981a) : i >= 29 ? new pc0(bd0VarM981a) : new nc0(bd0VarM981a)).mo1944b();
        } else {
            bd0VarMo1944b = null;
        }
        this.f1952b = bd0VarMo1944b;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.f1952b = bd0.m515g(view, windowInsets);
            return hc0.m1390i(view, windowInsets);
        }
        bd0 bd0VarM515g = bd0.m515g(view, windowInsets);
        yc0 yc0Var = bd0VarM515g.f724a;
        if (this.f1952b == null) {
            WeakHashMap weakHashMap = oa0.f3426a;
            this.f1952b = ea0.m981a(view);
        }
        if (this.f1952b == null) {
            this.f1952b = bd0VarM515g;
            return hc0.m1390i(view, windowInsets);
        }
        C0407kd c0407kdM1391j = hc0.m1391j(view);
        if (c0407kdM1391j != null && Objects.equals((WindowInsets) c0407kdM1391j.f2819b, windowInsets)) {
            return hc0.m1390i(view, windowInsets);
        }
        bd0 bd0Var = this.f1952b;
        int i = 0;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if (!yc0Var.mo2368f(i2).equals(bd0Var.f724a.mo2368f(i2))) {
                i |= i2;
            }
        }
        if (i == 0) {
            return hc0.m1390i(view, windowInsets);
        }
        bd0 bd0Var2 = this.f1952b;
        lc0 lc0Var = new lc0(i, new DecelerateInterpolator(), 160L);
        lc0Var.f2997a.mo1601d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(lc0Var.f2997a.mo1598a());
        C0346ip c0346ipMo2368f = yc0Var.mo2368f(i);
        C0346ip c0346ipMo2368f2 = bd0Var2.f724a.mo2368f(i);
        int iMin = Math.min(c0346ipMo2368f.f2571a, c0346ipMo2368f2.f2571a);
        int i3 = c0346ipMo2368f.f2572b;
        int i4 = c0346ipMo2368f2.f2572b;
        int iMin2 = Math.min(i3, i4);
        int i5 = c0346ipMo2368f.f2573c;
        int i6 = c0346ipMo2368f2.f2573c;
        int iMin3 = Math.min(i5, i6);
        int i7 = c0346ipMo2368f.f2574d;
        int i8 = c0346ipMo2368f2.f2574d;
        int i9 = i;
        C0138d4 c0138d4 = new C0138d4(C0346ip.m1524b(iMin, iMin2, iMin3, Math.min(i7, i8)), C0346ip.m1524b(Math.max(c0346ipMo2368f.f2571a, c0346ipMo2368f2.f2571a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i8)), 21, false);
        hc0.m1387f(view, windowInsets, false);
        duration.addUpdateListener(new fc0(lc0Var, bd0VarM515g, bd0Var2, i9, view));
        duration.addListener(new u70(lc0Var, view, 2));
        ViewTreeObserverOnPreDrawListenerC0427kx.m1722a(view, new z00(view, lc0Var, c0138d4, duration));
        this.f1952b = bd0VarM515g;
        return hc0.m1390i(view, windowInsets);
    }
}
