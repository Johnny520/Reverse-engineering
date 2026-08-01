package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.app.C0111;
import androidx.appcompat.app.C0113;
import com.bumptech.glide.AbstractC3056;
import com.google.android.material.textfield.C3198;
import p302.C8617;
import top.suzhelan.qstory.ui.views.CustomMaterialCheckBox;
import top.suzhelan.qstory.ui.views.CustomMaterialSwitch;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2266 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6578;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6579;

    public /* synthetic */ C2266(C0113 c0113, View view) {
        this.f6579 = 0;
        this.f6578 = c0113;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f6579;
        Object obj = this.f6578;
        switch (i) {
            case 0:
                ((View) ((C0111) ((C0113) obj).f357).f333.getParent()).invalidate();
                break;
            case 1:
                ((C3198) obj).f10744.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                C8617 c8617 = (C8617) obj;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c8617.f24181.setAlpha((int) (255.0f * fFloatValue));
                c8617.f24160 = fFloatValue;
                break;
            case 3:
                CustomMaterialCheckBox customMaterialCheckBox = (CustomMaterialCheckBox) obj;
                int i2 = CustomMaterialCheckBox.f16250;
                "anim";
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                "null cannot be cast to non-null type kotlin.Float";
                animatedValue.getClass();
                customMaterialCheckBox.f16264 = ((Float) animatedValue).floatValue();
                customMaterialCheckBox.invalidate();
                break;
            default:
                CustomMaterialSwitch customMaterialSwitch = (CustomMaterialSwitch) obj;
                int i3 = CustomMaterialSwitch.f16268;
                "anim";
                valueAnimator.getClass();
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                "null cannot be cast to non-null type kotlin.Float";
                animatedValue2.getClass();
                customMaterialSwitch.f16279 = ((Float) animatedValue2).floatValue();
                customMaterialSwitch.invalidate();
                break;
        }
    }

    public /* synthetic */ C2266(Object obj, int i) {
        this.f6579 = i;
        this.f6578 = obj;
    }
}
