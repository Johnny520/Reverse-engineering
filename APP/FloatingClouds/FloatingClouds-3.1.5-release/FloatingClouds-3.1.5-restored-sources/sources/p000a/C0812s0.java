package p000a;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: a.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0812s0 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0831t0 f3204a;

    public C0812s0(AbstractC0831t0 abstractC0831t0) {
        this.f3204a = abstractC0831t0;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f3204a.mo587a(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f3204a.mo588b(drawable);
    }
}
