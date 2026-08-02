package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yd3 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ge3 f13425a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f13426b;

    public yd3(ge3 ge3Var, View view) {
        this.f13425a = ge3Var;
        this.f13426b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ge3 ge3Var = this.f13425a;
        ge3Var.f3471a.mo1348e(1.0f);
        be3.m515f(ge3Var, this.f13426b);
    }
}
