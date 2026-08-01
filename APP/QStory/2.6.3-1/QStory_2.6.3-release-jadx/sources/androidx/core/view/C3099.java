package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.app.C0958;
import androidx.appcompat.app.C0960;
import com.google.android.material.textfield.C4031;
import p303.AbstractC9234;
import p318.C9438;
import top.suzhelan.qstory.p015ui.views.CustomMaterialCheckBox;
import top.suzhelan.qstory.p015ui.views.CustomMaterialSwitch;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3099 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6924;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6925;

    public /* synthetic */ C3099(C0960 c0960, View view) {
        this.f6925 = 0;
        this.f6924 = c0960;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f6925;
        Object obj = this.f6924;
        switch (i) {
            case 0:
                ((View) ((C0958) ((C0960) obj).f702).f678.getParent()).invalidate();
                break;
            case 1:
                ((C4031) obj).f11094.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                C9438 c9438 = (C9438) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c9438.f24517.setAlpha((int) (255.0f * fFloatValue));
                c9438.f24496 = fFloatValue;
                break;
            case 3:
                CustomMaterialCheckBox customMaterialCheckBox = (CustomMaterialCheckBox) obj;
                int i2 = CustomMaterialCheckBox.f16604;
                AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜喵呜");
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                AbstractC9234.m14531(3253);
                animatedValue.getClass();
                customMaterialCheckBox.f16618 = ((Float) animatedValue).floatValue();
                customMaterialCheckBox.invalidate();
                break;
            default:
                CustomMaterialSwitch customMaterialSwitch = (CustomMaterialSwitch) obj;
                int i3 = CustomMaterialSwitch.f16622;
                AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵呜喵呜");
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                AbstractC9234.m14531(3253);
                animatedValue2.getClass();
                customMaterialSwitch.f16633 = ((Float) animatedValue2).floatValue();
                customMaterialSwitch.invalidate();
                break;
        }
    }

    public /* synthetic */ C3099(Object obj, int i) {
        this.f6925 = i;
        this.f6924 = obj;
    }
}
