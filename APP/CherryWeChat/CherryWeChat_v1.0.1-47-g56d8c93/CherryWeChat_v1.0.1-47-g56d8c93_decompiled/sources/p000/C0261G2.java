package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: G2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0261G2 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0592Nq f841a;

    public C0261G2(C0592Nq c0592Nq) {
        this.f841a = c0592Nq;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f841a.f1921b.f2168o;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C0678Pq c0678Pq = this.f841a.f1921b;
        ColorStateList colorStateList = c0678Pq.f2168o;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(c0678Pq.f2172s, colorStateList.getDefaultColor()));
        }
    }
}
