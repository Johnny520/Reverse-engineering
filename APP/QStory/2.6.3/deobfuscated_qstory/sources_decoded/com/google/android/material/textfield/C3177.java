package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.C2492;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kongzue.dialogx.util.views.C3762;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import p257.C8212;
import p257.C8217;
import p257.C8223;
import p257.C8232;
import p257.RunnableC8216;
import p305.C8643;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3177 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f10670;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f10671;

    public /* synthetic */ C3177(Object obj, int i) {
        this.f10671 = i;
        this.f10670 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f10671;
        Object obj = this.f10670;
        switch (i) {
            case 0:
                ((TextInputLayout) obj).f10629.m7165(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i2 = MaxRelativeLayout.f11646;
                long j = (long) ((fFloatValue * 0.0f) + 0.0f);
                C8232 c8232 = ((MaxRelativeLayout) obj).f11651;
                if (c8232 != null) {
                    c8232.m13751(j);
                }
                break;
            case 2:
                C3762 c3762 = (C3762) obj;
                c3762.f11688 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c3762.invalidate();
                break;
            case 3:
                ((C8223) obj).f22685.m8074(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C8223 c8223 = (C8223) ((C8217) obj).f22671;
                c8223.f22685.m8074(fFloatValue2);
                c8223.f22690 = fFloatValue2 != 1.0f;
                break;
            case 5:
                C8212 c8212 = ((RunnableC8216) obj).f22669;
                C2492 c2492 = c8212.f22653;
                if (c2492 == null || !c8212.f11584) {
                    valueAnimator.cancel();
                    break;
                } else {
                    LinearLayout linearLayout = (LinearLayout) c2492.f7461;
                    float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (linearLayout != null && linearLayout.isAttachedToWindow()) {
                        linearLayout.setY(fFloatValue3);
                        break;
                    }
                }
                break;
            case 6:
                C8212 c82122 = ((RunnableC8216) obj).f22669;
                C2492 c24922 = c82122.f22653;
                if (c24922 == null || !c82122.f11584) {
                    valueAnimator.cancel();
                    break;
                } else {
                    LinearLayout linearLayout2 = (LinearLayout) c24922.f7461;
                    float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (linearLayout2 != null && linearLayout2.isAttachedToWindow()) {
                        linearLayout2.setY(fFloatValue4);
                        break;
                    }
                }
                break;
            default:
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C8643 c8643 = ((BottomSheetBehavior) obj).f10067;
                if (c8643 != null) {
                    c8643.m14333(fFloatValue5);
                }
                break;
        }
    }

    public /* synthetic */ C3177(Runnable runnable, float f, float f2, int i) {
        this.f10671 = i;
        this.f10670 = runnable;
    }
}
