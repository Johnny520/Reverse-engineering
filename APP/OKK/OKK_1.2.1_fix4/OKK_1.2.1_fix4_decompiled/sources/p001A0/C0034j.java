package p001A0;

import android.animation.ValueAnimator;
import p031Q0.AbstractC0307g;
import p052d0.C0758s;

/* JADX INFO: renamed from: A0.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0034j implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f87a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f88b;

    public /* synthetic */ C0034j(int i2, Object obj) {
        this.f87a = i2;
        this.f88b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f87a) {
            case 0:
                C0039o c0039o = (C0039o) this.f88b;
                c0039o.getClass();
                c0039o.f141d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                C0758s c0758s = (C0758s) this.f88b;
                AbstractC0307g.m703e(c0758s, "this$0");
                AbstractC0307g.m703e(valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                AbstractC0307g.m701c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                c0758s.f2665x = fFloatValue;
                float f2 = c0758s.f2666y;
                c0758s.f2664w = ((c0758s.f2667z - f2) * fFloatValue) + f2;
                c0758s.m1939b(false);
                c0758s.invalidate();
                break;
        }
    }
}
