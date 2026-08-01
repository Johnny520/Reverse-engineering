package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: j2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0359j2 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0979zt f2649a;

    public C0359j2(C0979zt c0979zt) {
        this.f2649a = c0979zt;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f2649a.f5619b.f772o;
        if (colorStateList != null) {
            AbstractC0187eh.m995h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C0081bu c0081bu = this.f2649a.f5619b;
        ColorStateList colorStateList = c0081bu.f772o;
        if (colorStateList != null) {
            AbstractC0187eh.m994g(drawable, colorStateList.getColorForState(c0081bu.f776s, colorStateList.getDefaultColor()));
        }
    }
}
