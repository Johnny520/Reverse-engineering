package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class ac0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gc0 f125a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wc0 f126b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wc0 f127c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f128d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f129e;

    public ac0(gc0 gc0Var, wc0 wc0Var, wc0 wc0Var2, int i, View view) {
        this.f125a = gc0Var;
        this.f126b = wc0Var;
        this.f127c = wc0Var2;
        this.f128d = i;
        this.f129e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        gc0 gc0Var = this.f125a;
        fc0 fc0Var = gc0Var.f2123a;
        fc0Var.mo1018d(animatedFraction);
        wc0 wc0Var = this.f126b;
        tc0 tc0Var = wc0Var.f4955a;
        float fMo1016b = fc0Var.mo1016b();
        int i = Build.VERSION.SDK_INT;
        mc0 lc0Var = i >= 30 ? new lc0(wc0Var) : i >= 29 ? new kc0(wc0Var) : new ic0(wc0Var);
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((this.f128d & i2) == 0) {
                lc0Var.mo1758c(i2, tc0Var.mo1932f(i2));
            } else {
                C0195ep c0195epMo1932f = tc0Var.mo1932f(i2);
                C0195ep c0195epMo1932f2 = this.f127c.f4955a.mo1932f(i2);
                float f = 1.0f - fMo1016b;
                lc0Var.mo1758c(i2, wc0.m2562e(c0195epMo1932f, (int) (((double) ((c0195epMo1932f.f1828a - c0195epMo1932f2.f1828a) * f)) + 0.5d), (int) (((double) ((c0195epMo1932f.f1829b - c0195epMo1932f2.f1829b) * f)) + 0.5d), (int) (((double) ((c0195epMo1932f.f1830c - c0195epMo1932f2.f1830c) * f)) + 0.5d), (int) (((double) ((c0195epMo1932f.f1831d - c0195epMo1932f2.f1831d) * f)) + 0.5d)));
            }
        }
        cc0.m670g(this.f129e, lc0Var.mo1433b(), Collections.singletonList(gc0Var));
    }
}
