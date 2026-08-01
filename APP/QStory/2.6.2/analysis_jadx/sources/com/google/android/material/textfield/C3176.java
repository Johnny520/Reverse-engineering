package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.C2492;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kongzue.dialogx.util.views.C3761;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import p257.C8211;
import p257.C8216;
import p257.C8222;
import p257.C8231;
import p257.RunnableC8215;
import p305.C8651;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3176 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f10665;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10666;

    public /* synthetic */ C3176(Object obj, int i) {
        this.f10666 = i;
        this.f10665 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f10666;
        Object obj = this.f10665;
        switch (i) {
            case 0:
                ((TextInputLayout) obj).f10624.m7178(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i2 = MaxRelativeLayout.f11641;
                long j = (long) ((fFloatValue * 0.0f) + 0.0f);
                C8231 c8231 = ((MaxRelativeLayout) obj).f11646;
                if (c8231 != null) {
                    c8231.m13735(j);
                }
                break;
            case 2:
                C3761 c3761 = (C3761) obj;
                c3761.f11683 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3761.invalidate();
                break;
            case 3:
                ((C8222) obj).f22686.m8087(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C8222 c8222 = (C8222) ((C8216) obj).f22673;
                c8222.f22686.m8087(fFloatValue2);
                c8222.f22691 = fFloatValue2 != 1.0f;
                break;
            case 5:
                C8211 c8211 = ((RunnableC8215) obj).f22670;
                C2492 c2492 = c8211.f22654;
                if (c2492 == null || !c8211.f11579) {
                    valueAnimator.cancel();
                    break;
                } else {
                    LinearLayout linearLayout = (LinearLayout) c2492.f7460;
                    float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (linearLayout != null && linearLayout.isAttachedToWindow()) {
                        linearLayout.setY(fFloatValue3);
                        break;
                    }
                }
                break;
            case 6:
                C8211 c82112 = ((RunnableC8215) obj).f22670;
                C2492 c24922 = c82112.f22654;
                if (c24922 == null || !c82112.f11579) {
                    valueAnimator.cancel();
                    break;
                } else {
                    LinearLayout linearLayout2 = (LinearLayout) c24922.f7460;
                    float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (linearLayout2 != null && linearLayout2.isAttachedToWindow()) {
                        linearLayout2.setY(fFloatValue4);
                        break;
                    }
                }
                break;
            default:
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C8651 c8651 = ((BottomSheetBehavior) obj).f10062;
                if (c8651 != null) {
                    c8651.m14315(fFloatValue5);
                }
                break;
        }
    }

    public /* synthetic */ C3176(Runnable runnable, float f, float f2, int i) {
        this.f10666 = i;
        this.f10665 = runnable;
    }
}
