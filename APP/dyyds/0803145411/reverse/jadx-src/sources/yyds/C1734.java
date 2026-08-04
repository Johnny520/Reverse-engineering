package yyds;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: yyds.ᛸᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1734 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f8770;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ C2207 f8771;

    public /* synthetic */ C1734(C2207 c2207, int i) {
        this.f8770 = i;
        this.f8771 = c2207;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f8770;
        C2207 c2207 = this.f8771;
        switch (i) {
            case 0:
                ((C2457) c2207.f10909).f12135.m299(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((C2457) c2207.f10909).f12135.m299(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
