package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: j2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0359j2 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0831vt f2541a;

    public C0359j2(C0831vt c0831vt) {
        this.f2541a = c0831vt;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f2541a.f4887b.f5202o;
        if (colorStateList != null) {
            AbstractC0104ch.m688h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C0905xt c0905xt = this.f2541a.f4887b;
        ColorStateList colorStateList = c0905xt.f5202o;
        if (colorStateList != null) {
            AbstractC0104ch.m687g(drawable, colorStateList.getColorForState(c0905xt.f5206s, colorStateList.getDefaultColor()));
        }
    }
}
