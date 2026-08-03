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

    public /* synthetic */ C0733R2(int r1, Object r2) {
        this.f2345a = r1;
        this.f2346b = r2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r4) {
        switch(this.f2345a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        ((View) ((C2229mF) ((C1017Xm) this.f2346b).f3226b).f7775d.getParent()).invalidate();
        return;
    L6:
        C0494Le r0 = (C0494Le) this.f2346b;
        r0.getClass();
        float r42 = ((Float) r4.getAnimatedValue()).floatValue();
        r0.f4176d.setAlpha(r42);
        return;
    L8:
        LinearLayout r02 = (LinearLayout) this.f2346b;
        AbstractC0295Gu.m625r(-780889478920245L);
        Object r43 = r4.getAnimatedValue();
        AbstractC0295Gu.m625r(-780928133625909L);
        r02.setElevation(((Float) r43).floatValue() * 20.0f);
    }

    public /* synthetic */ C0733R2(C1017Xm r1, View r2) {
        this.f2345a = 2;
        this.f2346b = r1;
    }
}
