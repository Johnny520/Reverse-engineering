package p000;

import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: nh */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0522nh implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3296a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3297b;

    public /* synthetic */ C0522nh(int i, Object obj) {
        this.f3296a = i;
        this.f3297b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3296a) {
            case Base64.DEFAULT /* 0 */:
                C0670rh c0670rh = (C0670rh) this.f3297b;
                c0670rh.getClass();
                c0670rh.f2231d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case Base64.NO_PADDING /* 1 */:
                GradientDrawable gradientDrawable = (GradientDrawable) this.f3297b;
                AbstractC0493mp.m1857g("it", valueAnimator);
                Object animatedValue = valueAnimator.getAnimatedValue();
                AbstractC0493mp.m1855e("null cannot be cast to non-null type kotlin.Int", animatedValue);
                gradientDrawable.setColor(((Integer) animatedValue).intValue());
                break;
            case Base64.NO_WRAP /* 2 */:
                FrameLayout frameLayout = (FrameLayout) this.f3297b;
                AbstractC0493mp.m1857g("it", valueAnimator);
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                AbstractC0493mp.m1855e("null cannot be cast to non-null type kotlin.Float", animatedValue2);
                frameLayout.setAlpha(((Float) animatedValue2).floatValue());
                break;
            default:
                ((View) ((dc0) ((C0431l0) this.f3297b).f2886b).f1383y.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ C0522nh(C0431l0 c0431l0, View view) {
        this.f3296a = 3;
        this.f3297b = c0431l0;
    }
}
