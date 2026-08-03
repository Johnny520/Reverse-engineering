package p000;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: renamed from: nF */
/* JADX INFO: loaded from: classes.dex */
public final class C2272nF implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2538tF f7994a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0489LF f7995b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0489LF f7996c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7997d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f7998e;

    public C2272nF(C2538tF c2538tF, C0489LF c0489lf, C0489LF c0489lf2, int i, View view) {
        this.f7994a = c2538tF;
        this.f7995b = c0489lf;
        this.f7996c = c0489lf2;
        this.f7997d = i;
        this.f7998e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C2538tF c2538tF = this.f7994a;
        AbstractC2495sF abstractC2495sF = c2538tF.f8846a;
        abstractC2495sF.mo4896d(animatedFraction);
        C0489LF c0489lf = this.f7995b;
        C0317HF c0317hf = c0489lf.f1602a;
        float fMo4894b = abstractC2495sF.mo4894b();
        PathInterpolator pathInterpolator = C2358pF.f8245e;
        int i = Build.VERSION.SDK_INT;
        AbstractC2796zF c2753yF = i >= 34 ? new C2753yF(c0489lf) : i >= 31 ? new C2710xF(c0489lf) : i >= 30 ? new C2667wF(c0489lf) : i >= 29 ? new C2624vF(c0489lf) : new C2581uF(c0489lf);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((this.f7997d & i2) == 0) {
                c2753yF.mo5234c(i2, c0317hf.mo14g(i2));
            } else {
                C2765yl c2765ylMo14g = c0317hf.mo14g(i2);
                C2765yl c2765ylMo14g2 = this.f7996c.f1602a.mo14g(i2);
                float f = 1.0f - fMo4894b;
                c2753yF.mo5234c(i2, C0489LF.m938e(c2765ylMo14g, (int) (((double) ((c2765ylMo14g.f9405a - c2765ylMo14g2.f9405a) * f)) + 0.5d), (int) (((double) ((c2765ylMo14g.f9406b - c2765ylMo14g2.f9406b) * f)) + 0.5d), (int) (((double) ((c2765ylMo14g.f9407c - c2765ylMo14g2.f9407c) * f)) + 0.5d), (int) (((double) ((c2765ylMo14g.f9408d - c2765ylMo14g2.f9408d) * f)) + 0.5d)));
            }
        }
        C2358pF.m4776g(this.f7998e, c2753yF.mo5084b(), Collections.singletonList(c2538tF));
    }
}
