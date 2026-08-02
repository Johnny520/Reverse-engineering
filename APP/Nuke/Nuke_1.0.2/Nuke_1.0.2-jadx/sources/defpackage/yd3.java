package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yd3 extends AnimatorListenerAdapter {
    public final /* synthetic */ ge3 a;
    public final /* synthetic */ View b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yd3(ge3 ge3Var, View view) {
        this.a = ge3Var;
        this.b = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ge3 ge3Var = this.a;
        ge3Var.a.e(1.0f);
        be3.f(ge3Var, this.b);
    }
}
