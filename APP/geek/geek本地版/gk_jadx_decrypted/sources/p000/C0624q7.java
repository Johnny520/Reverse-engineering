package p000;

import android.animation.ValueAnimator;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: q7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0624q7 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4037a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f4038b;

    public /* synthetic */ C0624q7(int i, Object obj) {
        this.f4037a = i;
        this.f4038b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4037a) {
            case Base64.DEFAULT /* 0 */:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C0200eu c0200eu = ((BottomSheetBehavior) this.f4038b).f1051i;
                if (c0200eu != null) {
                    C0163du c0163du = c0200eu.f1842a;
                    if (c0163du.f1641i != fFloatValue) {
                        c0163du.f1641i = fFloatValue;
                        c0200eu.f1846e = true;
                        c0200eu.invalidateSelf();
                    }
                }
                break;
            case Base64.NO_PADDING /* 1 */:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0858wj c0858wj = (C0858wj) this.f4038b;
                c0858wj.f4973c.setAlpha(iFloatValue);
                c0858wj.f4974d.setAlpha(iFloatValue);
                c0858wj.f4989s.invalidate();
                break;
            default:
                ((TextInputLayout) this.f4038b).f1239u0.m2796k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
