package p000;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: t9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2532t9 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2618v9 f8831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2661w9 f8832b;

    public C2532t9(C2661w9 r1, C2618v9 r2) {
        this.f8832b = r1;
        this.f8831a = r2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r4) {
        float r42 = ((Float) r4.getAnimatedValue()).floatValue();
        C2618v9 r0 = this.f8831a;
        C2661w9.m5224d(r42, r0);
        C2661w9 r2 = this.f8832b;
        r2.m5225a(r42, r0, false);
        r2.invalidateSelf();
    }
}
