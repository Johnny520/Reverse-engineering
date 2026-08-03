package p000;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: X5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0994X5 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3167b;

    public /* synthetic */ C0994X5(int i, Object obj) {
        this.f3166a = i;
        this.f3167b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3166a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C1021Xq c1021Xq = ((BottomSheetBehavior) this.f3167b).f4449i;
                if (c1021Xq != null) {
                    C0935Vq c0935Vq = c1021Xq.f3241b;
                    if (c0935Vq.f2911j != fFloatValue) {
                        c0935Vq.f2911j = fFloatValue;
                        c1021Xq.f3245f = true;
                        c1021Xq.f3246g = true;
                        c1021Xq.invalidateSelf();
                    }
                }
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C1545ih c1545ih = (C1545ih) this.f3167b;
                c1545ih.f5472c.setAlpha(iFloatValue);
                c1545ih.f5473d.setAlpha(iFloatValue);
                c1545ih.f5488s.invalidate();
                break;
            case 2:
                ((C0801Sl) this.f3167b).f2520m = valueAnimator.getAnimatedFraction();
                break;
            default:
                ((TextInputLayout) this.f3167b).f4662w0.m4792m(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
