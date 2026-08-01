package p129;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import com.google.android.material.checkbox.C3106;
import com.google.android.material.checkbox.C3110;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7489 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C3110 f20294;

    public C7489(C3110 c3110) {
        this.f20294 = c3110;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f20294.f10205.f10188;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C3106 c3106 = this.f20294.f10205;
        ColorStateList colorStateList = c3106.f10188;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(c3106.f10196, colorStateList.getDefaultColor()));
        }
    }
}
