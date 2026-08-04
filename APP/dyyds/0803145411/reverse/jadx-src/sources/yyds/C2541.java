package yyds;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: yyds.ᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2541 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public boolean f12522 = false;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ C2777 f12523;

    public C2541(C2777 c2777) {
        this.f12523 = c2777;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f12522 = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f12522) {
            this.f12522 = false;
            return;
        }
        C2777 c2777 = this.f12523;
        if (((Float) c2777.f13545.getAnimatedValue()).floatValue() == 0.0f) {
            c2777.f13536 = 0;
            c2777.m4900(0);
        } else {
            c2777.f13536 = 2;
            c2777.f13555.invalidate();
        }
    }
}
