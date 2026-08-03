package p001A0;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import p037U.C0374j;
import p089x0.C1122f;
import p089x0.C1123g;

/* JADX INFO: renamed from: A0.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0020F implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f59b;

    public /* synthetic */ C0020F(int i2, Object obj) {
        this.f58a = i2;
        this.f59b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f58a) {
            case 0:
                ((TextInputLayout) this.f59b).f2506v0.m2547k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0374j c0374j = (C0374j) this.f59b;
                c0374j.f801b.setAlpha(iFloatValue);
                c0374j.f802c.setAlpha(iFloatValue);
                c0374j.f813n.invalidate();
                break;
            default:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C1123g c1123g = ((BottomSheetBehavior) this.f59b).f2319i;
                if (c1123g != null) {
                    C1122f c1122f = c1123g.f4312a;
                    if (c1122f.f4299j != fFloatValue) {
                        c1122f.f4299j = fFloatValue;
                        c1123g.f4316e = true;
                        c1123g.invalidateSelf();
                    }
                }
                break;
        }
    }
}
