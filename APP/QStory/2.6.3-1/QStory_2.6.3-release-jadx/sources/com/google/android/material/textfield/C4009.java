package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.C3325;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.kongzue.dialogx.util.views.C4594;
import com.kongzue.dialogx.util.views.MaxRelativeLayout;
import p273.C9041;
import p273.C9046;
import p273.C9052;
import p273.C9061;
import p273.RunnableC9045;
import p321.C9472;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4009 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f11015;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f11016;

    public /* synthetic */ C4009(Object obj, int i) {
        this.f11016 = i;
        this.f11015 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f11016;
        Object obj = this.f11015;
        switch (i) {
            case 0:
                ((TextInputLayout) obj).f10974.m7724(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i2 = MaxRelativeLayout.f11991;
                long j = (long) ((fFloatValue * 0.0f) + 0.0f);
                C9061 c9061 = ((MaxRelativeLayout) obj).f11996;
                if (c9061 != null) {
                    c9061.m14310(j);
                }
                break;
            case 2:
                C4594 c4594 = (C4594) obj;
                c4594.f12033 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c4594.invalidate();
                break;
            case 3:
                ((C9052) obj).f23030.m8633(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C9052 c9052 = (C9052) ((C9046) obj).f23016;
                c9052.f23030.m8633(fFloatValue2);
                c9052.f23035 = fFloatValue2 != 1.0f;
                break;
            case 5:
                C9041 c9041 = ((RunnableC9045) obj).f23014;
                C3325 c3325 = c9041.f22998;
                if (c3325 == null || !c9041.f11929) {
                    valueAnimator.cancel();
                    break;
                } else {
                    LinearLayout linearLayout = (LinearLayout) c3325.f7806;
                    float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (linearLayout != null && linearLayout.isAttachedToWindow()) {
                        linearLayout.setY(fFloatValue3);
                        break;
                    }
                }
                break;
            case 6:
                C9041 c90412 = ((RunnableC9045) obj).f23014;
                C3325 c33252 = c90412.f22998;
                if (c33252 == null || !c90412.f11929) {
                    valueAnimator.cancel();
                    break;
                } else {
                    LinearLayout linearLayout2 = (LinearLayout) c33252.f7806;
                    float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (linearLayout2 != null && linearLayout2.isAttachedToWindow()) {
                        linearLayout2.setY(fFloatValue4);
                        break;
                    }
                }
                break;
            default:
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C9472 c9472 = ((BottomSheetBehavior) obj).f10412;
                if (c9472 != null) {
                    c9472.m14892(fFloatValue5);
                }
                break;
        }
    }

    public /* synthetic */ C4009(Runnable runnable, float f, float f2, int i) {
        this.f11016 = i;
        this.f11015 = runnable;
    }
}
