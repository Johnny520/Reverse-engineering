package yyds;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: yyds.ᛲᛶᲁᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0383 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1964;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f1965;

    public /* synthetic */ C0383(int i, Object obj) {
        this.f1964 = i;
        this.f1965 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f1964;
        Object obj = this.f1965;
        switch (i) {
            case 0:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C2777 c2777 = (C2777) obj;
                c2777.f13556.setAlpha(iFloatValue);
                c2777.f13559.setAlpha(iFloatValue);
                c2777.f13555.invalidate();
                break;
            case 1:
                ((C1472) obj).f6991 = valueAnimator.getAnimatedFraction();
                break;
            default:
                C2312 c2312 = (C2312) obj;
                c2312.f11335 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2312.invalidate();
                break;
        }
    }
}
