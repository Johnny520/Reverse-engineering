package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class q7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q7(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r4) {
        switch(this.a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((TextInputLayout) this.b).u0.k(((Float) r4.getAnimatedValue()).floatValue());
        return;
    L6:
        int r42 = (int) (((Float) r4.getAnimatedValue()).floatValue() * 255.0f);
        wj r0 = (wj) this.b;
        r0.c.setAlpha(r42);
        r0.d.setAlpha(r42);
        r0.s.invalidate();
        return;
    L8:
        float r43 = ((Float) r4.getAnimatedValue()).floatValue();
        eu r02 = ((BottomSheetBehavior) this.b).i;
        if (r02 == null) goto L14;
        du r1 = r02.a;
        if (r1.i == r43) goto L15;
        r1.i = r43;
        r02.e = true;
        r02.invalidateSelf();
        return;
    L15:
        return;
    }
}
