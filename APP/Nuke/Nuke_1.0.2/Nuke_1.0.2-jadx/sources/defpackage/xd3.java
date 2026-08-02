package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xd3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ge3 a;
    public final /* synthetic */ cf3 b;
    public final /* synthetic */ cf3 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ View e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xd3(ge3 ge3Var, cf3 cf3Var, cf3 cf3Var2, int i, View view) {
        this.a = ge3Var;
        this.b = cf3Var;
        this.c = cf3Var2;
        this.d = i;
        this.e = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        ge3 ge3Var = this.a;
        fe3 fe3Var = ge3Var.a;
        fe3Var.e(animatedFraction);
        float fC = fe3Var.c();
        PathInterpolator pathInterpolator = be3.e;
        int i = Build.VERSION.SDK_INT;
        cf3 cf3Var = this.b;
        pe3 oe3Var = i >= 36 ? new oe3(cf3Var) : i >= 35 ? new ne3(cf3Var) : i >= 34 ? new me3(cf3Var) : i >= 31 ? new le3(cf3Var) : i >= 30 ? new ke3(cf3Var) : i >= 29 ? new je3(cf3Var) : new he3(cf3Var);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.d & i2;
            ye3 ye3Var = cf3Var.a;
            if (i3 == 0) {
                oe3Var.d(i2, ye3Var.i(i2));
            } else {
                zz0 zz0VarI = ye3Var.i(i2);
                zz0 zz0VarI2 = this.c.a.i(i2);
                float f = 1.0f - fC;
                oe3Var.d(i2, cf3.a(zz0VarI, (int) (((double) ((zz0VarI.a - zz0VarI2.a) * f)) + 0.5d), (int) (((double) ((zz0VarI.b - zz0VarI2.b) * f)) + 0.5d), (int) (((double) ((zz0VarI.c - zz0VarI2.c) * f)) + 0.5d), (int) (((double) ((zz0VarI.d - zz0VarI2.d) * f)) + 0.5d)));
            }
        }
        be3.h(this.e, oe3Var.b(), Collections.singletonList(ge3Var));
    }
}
