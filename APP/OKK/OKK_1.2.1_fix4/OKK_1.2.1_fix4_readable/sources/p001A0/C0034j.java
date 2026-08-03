package p001A0;

import android.animation.ValueAnimator;
import com.abc.ui.FloatingBottomTabView;
import p031Q0.AbstractC0307g;

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
                FloatingBottomTabView floatingBottomTabView = (FloatingBottomTabView) this.f88b;
                AbstractC0307g.m703e(floatingBottomTabView, "this$0");
                AbstractC0307g.m703e(valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                AbstractC0307g.m701c(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                floatingBottomTabView.f2665x = fFloatValue;
                float f2 = floatingBottomTabView.f2666y;
                floatingBottomTabView.f2664w = ((floatingBottomTabView.f2667z - f2) * fFloatValue) + f2;
                floatingBottomTabView.m1939b(false);
                floatingBottomTabView.invalidate();
                break;
        }
    }
}
