package p000;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: t9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2532t9 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2618v9 f8831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2661w9 f8832b;

    public C2532t9(C2661w9 c2661w9, C2618v9 c2618v9) {
        this.f8832b = c2661w9;
        this.f8831a = c2618v9;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C2618v9 c2618v9 = this.f8831a;
        C2661w9.m5224d(fFloatValue, c2618v9);
        C2661w9 c2661w9 = this.f8832b;
        c2661w9.m5225a(fFloatValue, c2618v9, false);
        c2661w9.invalidateSelf();
    }
}
