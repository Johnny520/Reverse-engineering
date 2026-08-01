package p145;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import com.google.android.material.checkbox.C3939;
import com.google.android.material.checkbox.C3943;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8319 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C3943 f20634;

    public C8319(C3943 c3943) {
        this.f20634 = c3943;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f20634.f10555.f10538;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C3939 c3939 = this.f20634.f10555;
        ColorStateList colorStateList = c3939.f10538;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(c3939.f10546, colorStateList.getDefaultColor()));
        }
    }
}
