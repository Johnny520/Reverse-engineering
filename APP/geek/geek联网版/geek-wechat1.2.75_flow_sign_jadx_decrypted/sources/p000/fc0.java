package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class fc0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lc0 f1789a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bd0 f1790b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bd0 f1791c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1792d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f1793e;

    public fc0(lc0 lc0Var, bd0 bd0Var, bd0 bd0Var2, int i, View view) {
        this.f1789a = lc0Var;
        this.f1790b = bd0Var;
        this.f1791c = bd0Var2;
        this.f1792d = i;
        this.f1793e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        lc0 lc0Var = this.f1789a;
        kc0 kc0Var = lc0Var.f2997a;
        kc0Var.mo1601d(animatedFraction);
        bd0 bd0Var = this.f1790b;
        yc0 yc0Var = bd0Var.f724a;
        float fMo1599b = kc0Var.mo1599b();
        int i = Build.VERSION.SDK_INT;
        rc0 qc0Var = i >= 30 ? new qc0(bd0Var) : i >= 29 ? new pc0(bd0Var) : new nc0(bd0Var);
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((this.f1792d & i2) == 0) {
                qc0Var.mo2146c(i2, yc0Var.mo2368f(i2));
            } else {
                C0346ip c0346ipMo2368f = yc0Var.mo2368f(i2);
                C0346ip c0346ipMo2368f2 = this.f1791c.f724a.mo2368f(i2);
                float f = 1.0f - fMo1599b;
                qc0Var.mo2146c(i2, bd0.m514e(c0346ipMo2368f, (int) (((double) ((c0346ipMo2368f.f2571a - c0346ipMo2368f2.f2571a) * f)) + 0.5d), (int) (((double) ((c0346ipMo2368f.f2572b - c0346ipMo2368f2.f2572b) * f)) + 0.5d), (int) (((double) ((c0346ipMo2368f.f2573c - c0346ipMo2368f2.f2573c) * f)) + 0.5d), (int) (((double) ((c0346ipMo2368f.f2574d - c0346ipMo2368f2.f2574d) * f)) + 0.5d)));
            }
        }
        hc0.m1388g(this.f1793e, qc0Var.mo1944b(), Collections.singletonList(lc0Var));
    }
}
