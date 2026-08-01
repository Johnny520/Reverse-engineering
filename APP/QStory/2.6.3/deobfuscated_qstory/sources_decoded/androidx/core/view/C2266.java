package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.app.C0111;
import androidx.appcompat.app.C0113;
import com.google.android.material.textfield.C3199;
import p287.AbstractC8405;
import p302.C8609;
import top.suzhelan.qstory.ui.views.CustomMaterialCheckBox;
import top.suzhelan.qstory.ui.views.CustomMaterialSwitch;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2266 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6579;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6580;

    public /* synthetic */ C2266(C0113 c0113, View view) {
        this.f6580 = 0;
        this.f6579 = c0113;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f6580;
        Object obj = this.f6579;
        switch (i) {
            case 0:
                ((View) ((C0111) ((C0113) obj).f357).f333.getParent()).invalidate();
                break;
            case 1:
                ((C3199) obj).f10749.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                C8609 c8609 = (C8609) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c8609.f24172.setAlpha((int) (255.0f * fFloatValue));
                c8609.f24151 = fFloatValue;
                break;
            case 3:
                CustomMaterialCheckBox customMaterialCheckBox = (CustomMaterialCheckBox) obj;
                int i2 = CustomMaterialCheckBox.f16259;
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜喵呜"); /* decoded-inline: anim */
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                AbstractC8405.m13972(3253); /* decoded: m13972(3253)=null cannot be cast to non-null type kotlin.Float */
                animatedValue.getClass();
                customMaterialCheckBox.f16273 = ((Float) animatedValue).floatValue();
                customMaterialCheckBox.invalidate();
                break;
            default:
                CustomMaterialSwitch customMaterialSwitch = (CustomMaterialSwitch) obj;
                int i3 = CustomMaterialSwitch.f16277;
                AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜喵呜"); /* decoded-inline: anim */
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                AbstractC8405.m13972(3253); /* decoded: m13972(3253)=null cannot be cast to non-null type kotlin.Float */
                animatedValue2.getClass();
                customMaterialSwitch.f16288 = ((Float) animatedValue2).floatValue();
                customMaterialSwitch.invalidate();
                break;
        }
    }

    public /* synthetic */ C2266(Object obj, int i) {
        this.f6580 = i;
        this.f6579 = obj;
    }
}
