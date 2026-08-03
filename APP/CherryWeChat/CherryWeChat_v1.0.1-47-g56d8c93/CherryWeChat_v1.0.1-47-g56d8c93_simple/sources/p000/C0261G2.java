package p000;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: G2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0261G2 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0592Nq f841a;

    public C0261G2(C0592Nq r1) {
        this.f841a = r1;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable r2) {
        ColorStateList r0 = this.f841a.f1921b.f2168o;
        if (r0 == null) goto L6;
        r2.setTintList(r0);
        return;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable r4) {
        C0678Pq r0 = this.f841a.f1921b;
        ColorStateList r1 = r0.f2168o;
        if (r1 == null) goto L6;
        r4.setTint(r1.getColorForState(r0.f2172s, r1.getDefaultColor()));
        return;
    }
}
