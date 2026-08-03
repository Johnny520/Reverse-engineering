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

    public /* synthetic */ C0020F(int r1, Object r2) {
        this.f58a = r1;
        this.f59b = r2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r4) {
        switch(this.f58a) {
            case 0: goto L12;
            case 1: goto L10;
            default: goto L4;
        };
    L4:
        float r42 = ((Float) r4.getAnimatedValue()).floatValue();
        C1123g r02 = ((BottomSheetBehavior) this.f59b).f2319i;
        if (r02 == null) goto L14;
        C1122f r1 = r02.f4312a;
        if (r1.f4299j == r42) goto L15;
        r1.f4299j = r42;
        r02.f4316e = true;
        r02.invalidateSelf();
        return;
    L15:
        return;
    L14:
        return;
    L10:
        int r43 = (int) (((Float) r4.getAnimatedValue()).floatValue() * 255.0f);
        C0374j r03 = (C0374j) this.f59b;
        r03.f801b.setAlpha(r43);
        r03.f802c.setAlpha(r43);
        r03.f813n.invalidate();
        return;
    L12:
        ((TextInputLayout) this.f59b).f2506v0.m2547k(((Float) r4.getAnimatedValue()).floatValue());
    }
}
