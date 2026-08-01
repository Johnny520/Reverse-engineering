package p000;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: lh */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0448lh implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3056a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3057b;

    public /* synthetic */ C0448lh(int i, Object obj) {
        this.f3056a = i;
        this.f3057b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3056a) {
            case Base64.DEFAULT /* 0 */:
                C0597ph c0597ph = (C0597ph) this.f3057b;
                c0597ph.getClass();
                c0597ph.f1972d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case Base64.NO_PADDING /* 1 */:
                GradientDrawable gradientDrawable = (GradientDrawable) this.f3057b;
                AbstractC0346ip.m1503o("it", valueAnimator);
                Object animatedValue = valueAnimator.getAnimatedValue();
                AbstractC0346ip.m1501m("null cannot be cast to non-null type kotlin.Int", animatedValue);
                gradientDrawable.setColor(((Integer) animatedValue).intValue());
                break;
            case Base64.NO_WRAP /* 2 */:
                FrameLayout frameLayout = (FrameLayout) this.f3057b;
                AbstractC0346ip.m1503o("it", valueAnimator);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                AbstractC0346ip.m1501m("null cannot be cast to non-null type kotlin.Float", animatedValue2);
                frameLayout.setAlpha(((Float) animatedValue2).floatValue());
                break;
            default:
                ((View) ((yb0) ((C0431l0) this.f3057b).f2980b).f5330z.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ C0448lh(C0431l0 c0431l0, View view) {
        this.f3056a = 3;
        this.f3057b = c0431l0;
    }
}
