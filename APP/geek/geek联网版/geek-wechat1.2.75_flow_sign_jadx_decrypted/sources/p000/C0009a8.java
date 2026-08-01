package p000;

import android.animation.ValueAnimator;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: a8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0009a8 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f49b;

    public /* synthetic */ C0009a8(int i, Object obj) {
        this.f48a = i;
        this.f49b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f48a) {
            case Base64.DEFAULT /* 0 */:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C0350iu c0350iu = ((BottomSheetBehavior) this.f49b).f976i;
                if (c0350iu != null) {
                    C0311hu c0311hu = c0350iu.f2585a;
                    if (c0311hu.f2274i != fFloatValue) {
                        c0311hu.f2274i = fFloatValue;
                        c0350iu.f2589e = true;
                        c0350iu.invalidateSelf();
                    }
                }
                break;
            case Base64.NO_PADDING /* 1 */:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0932yj c0932yj = (C0932yj) this.f49b;
                c0932yj.f5439c.setAlpha(iFloatValue);
                c0932yj.f5440d.setAlpha(iFloatValue);
                c0932yj.f5455s.invalidate();
                break;
            default:
                ((TextInputLayout) this.f49b).f1164u0.m1382k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
