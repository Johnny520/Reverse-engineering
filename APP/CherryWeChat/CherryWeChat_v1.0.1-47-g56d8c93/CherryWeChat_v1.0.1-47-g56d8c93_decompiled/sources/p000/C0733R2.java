package p000;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: renamed from: R2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0733R2 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2346b;

    public /* synthetic */ C0733R2(int i, Object obj) {
        this.f2345a = i;
        this.f2346b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2345a) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) this.f2346b;
                AbstractC0295Gu.m625r(-780889478920245L);
                Object animatedValue = valueAnimator.getAnimatedValue();
                AbstractC0295Gu.m625r(-780928133625909L);
                linearLayout.setElevation(((Float) animatedValue).floatValue() * 20.0f);
                break;
            case 1:
                C0494Le c0494Le = (C0494Le) this.f2346b;
                c0494Le.getClass();
                c0494Le.f4176d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((View) ((C2229mF) ((C1017Xm) this.f2346b).f3226b).f7775d.getParent()).invalidate();
                break;
        }
    }

    public /* synthetic */ C0733R2(C1017Xm c1017Xm, View view) {
        this.f2345a = 2;
        this.f2346b = c1017Xm;
    }
}
