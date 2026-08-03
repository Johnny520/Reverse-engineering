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

    public /* synthetic */ C0994X5(int r1, Object r2) {
        this.f3166a = r1;
        this.f3167b = r2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r4) {
        switch(this.f3166a) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        ((TextInputLayout) this.f3167b).f4662w0.m4792m(((Float) r4.getAnimatedValue()).floatValue());
        return;
    L6:
        C0801Sl r0 = (C0801Sl) this.f3167b;
        r0.f2520m = r4.getAnimatedFraction();
        return;
    L8:
        int r42 = (int) (((Float) r4.getAnimatedValue()).floatValue() * 255.0f);
        C1545ih r02 = (C1545ih) this.f3167b;
        r02.f5472c.setAlpha(r42);
        r02.f5473d.setAlpha(r42);
        r02.f5488s.invalidate();
        return;
    L10:
        float r43 = ((Float) r4.getAnimatedValue()).floatValue();
        C1021Xq r03 = ((BottomSheetBehavior) this.f3167b).f4449i;
        if (r03 == null) goto L16;
        C0935Vq r1 = r03.f3241b;
        if (r1.f2911j == r43) goto L17;
        r1.f2911j = r43;
        r03.f3245f = true;
        r03.f3246g = true;
        r03.invalidateSelf();
        return;
    L17:
        return;
    }
}
