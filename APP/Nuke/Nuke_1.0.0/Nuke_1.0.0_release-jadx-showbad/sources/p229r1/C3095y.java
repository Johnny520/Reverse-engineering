package p229r1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p205n1.C2688b;

/* JADX INFO: renamed from: r1.y */
/* JADX INFO: loaded from: classes.dex */
public final class C3095y implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3046G f9815a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3070c0 f9816b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3070c0 f9817c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f9818d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f9819e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3095y(C3046G c3046g, C3070c0 c3070c0, C3070c0 c3070c02, int i5, View view) {
        this.f9815a = c3046g;
        this.f9816b = c3070c0;
        this.f9817c = c3070c02;
        this.f9818d = i5;
        this.f9819e = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C3046G c3046g = this.f9815a;
        AbstractC3045F abstractC3045F = c3046g.f9741a;
        abstractC3045F.mo5320e(animatedFraction);
        C3070c0 c3070c0 = this.f9816b;
        C3064Z c3064z = c3070c0.f9782a;
        float fMo5318c = abstractC3045F.mo5318c();
        PathInterpolator pathInterpolator = C3042C.f9728e;
        int i5 = Build.VERSION.SDK_INT;
        AbstractC3055P c3054o = i5 >= 36 ? new C3054O(c3070c0) : i5 >= 35 ? new C3053N(c3070c0) : i5 >= 34 ? new C3052M(c3070c0) : i5 >= 31 ? new C3051L(c3070c0) : i5 >= 30 ? new C3050K(c3070c0) : i5 >= 29 ? new C3048I(c3070c0) : new C3047H(c3070c0);
        for (int i6 = 1; i6 <= 512; i6 <<= 1) {
            if ((this.f9818d & i6) == 0) {
                c3054o.mo5347d(i6, c3064z.mo5367i(i6));
            } else {
                C2688b c2688bMo5367i = c3064z.mo5367i(i6);
                C2688b c2688bMo5367i2 = this.f9817c.f9782a.mo5367i(i6);
                float f2 = 1.0f - fMo5318c;
                c3054o.mo5347d(i6, C3070c0.m5392a(c2688bMo5367i, (int) (((double) ((c2688bMo5367i.f8572a - c2688bMo5367i2.f8572a) * f2)) + 0.5d), (int) (((double) ((c2688bMo5367i.f8573b - c2688bMo5367i2.f8573b) * f2)) + 0.5d), (int) (((double) ((c2688bMo5367i.f8574c - c2688bMo5367i2.f8574c) * f2)) + 0.5d), (int) (((double) ((c2688bMo5367i.f8575d - c2688bMo5367i2.f8575d) * f2)) + 0.5d)));
            }
        }
        C3042C.m5311h(this.f9819e, c3054o.mo5322b(), Collections.singletonList(c3046g));
    }
}
