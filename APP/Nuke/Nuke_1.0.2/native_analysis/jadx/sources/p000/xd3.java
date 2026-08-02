package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xd3 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ge3 f12980a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cf3 f12981b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cf3 f12982c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f12983d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f12984e;

    public xd3(ge3 ge3Var, cf3 cf3Var, cf3 cf3Var2, int i, View view) {
        this.f12980a = ge3Var;
        this.f12981b = cf3Var;
        this.f12982c = cf3Var2;
        this.f12983d = i;
        this.f12984e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ge3 ge3Var = this.f12980a;
        fe3 fe3Var = ge3Var.f3471a;
        fe3Var.mo1348e(animatedFraction);
        float fMo1346c = fe3Var.mo1346c();
        PathInterpolator pathInterpolator = be3.f824e;
        int i = Build.VERSION.SDK_INT;
        cf3 cf3Var = this.f12981b;
        pe3 oe3Var = i >= 36 ? new oe3(cf3Var) : i >= 35 ? new ne3(cf3Var) : i >= 34 ? new me3(cf3Var) : i >= 31 ? new le3(cf3Var) : i >= 30 ? new ke3(cf3Var) : i >= 29 ? new je3(cf3Var) : new he3(cf3Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.f12983d & i2;
            ye3 ye3Var = cf3Var.f1518a;
            if (i3 == 0) {
                oe3Var.mo2646d(i2, ye3Var.mo4165i(i2));
            } else {
                zz0 zz0VarMo4165i = ye3Var.mo4165i(i2);
                zz0 zz0VarMo4165i2 = this.f12982c.f1518a.mo4165i(i2);
                float f = 1.0f - fMo1346c;
                oe3Var.mo2646d(i2, cf3.m768a(zz0VarMo4165i, (int) (((double) ((zz0VarMo4165i.f14157a - zz0VarMo4165i2.f14157a) * f)) + 0.5d), (int) (((double) ((zz0VarMo4165i.f14158b - zz0VarMo4165i2.f14158b) * f)) + 0.5d), (int) (((double) ((zz0VarMo4165i.f14159c - zz0VarMo4165i2.f14159c) * f)) + 0.5d), (int) (((double) ((zz0VarMo4165i.f14160d - zz0VarMo4165i2.f14160d) * f)) + 0.5d)));
            }
        }
        be3.m517h(this.f12984e, oe3Var.mo2150b(), Collections.singletonList(ge3Var));
    }
}
