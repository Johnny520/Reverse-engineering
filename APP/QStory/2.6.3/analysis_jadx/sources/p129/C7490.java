package p129;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import com.google.android.material.checkbox.C3107;
import com.google.android.material.checkbox.C3111;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7490 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C3111 f20289;

    public C7490(C3111 c3111) {
        this.f20289 = c3111;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f20289.f10210.f10193;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C3107 c3107 = this.f20289.f10210;
        ColorStateList colorStateList = c3107.f10193;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(c3107.f10201, colorStateList.getDefaultColor()));
        }
    }
}
