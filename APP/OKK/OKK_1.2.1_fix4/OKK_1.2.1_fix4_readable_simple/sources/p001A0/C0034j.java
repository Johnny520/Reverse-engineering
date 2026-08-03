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

    public /* synthetic */ C0034j(int r1, Object r2) {
        this.f87a = r1;
        this.f88b = r2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator r4) {
        switch(this.f87a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        FloatingBottomTabView r1 = (FloatingBottomTabView) this.f88b;
        AbstractC0307g.m703e(r1, "this$0");
        AbstractC0307g.m703e(r4, "it");
        Object r42 = r4.getAnimatedValue();
        AbstractC0307g.m701c(r42, "null cannot be cast to non-null type kotlin.Float");
        float r43 = ((Float) r42).floatValue();
        r1.f2665x = r43;
        float r02 = r1.f2666y;
        r1.f2664w = ((r1.f2667z - r02) * r43) + r02;
        r1.m1939b(false);
        r1.invalidate();
        return;
    L6:
        C0039o r03 = (C0039o) this.f88b;
        r03.getClass();
        float r44 = ((Float) r4.getAnimatedValue()).floatValue();
        r03.f141d.setAlpha(r44);
    }
}
