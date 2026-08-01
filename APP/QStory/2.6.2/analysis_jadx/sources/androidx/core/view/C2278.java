package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p164.C7664;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2278 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ View f6614;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f6615;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C2225 f6616;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2225 f6617;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2274 f6618;

    public C2278(C2274 c2274, C2225 c2225, C2225 c22252, int i, View view) {
        this.f6618 = c2274;
        this.f6617 = c2225;
        this.f6616 = c22252;
        this.f6615 = i;
        this.f6614 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C2274 c2274 = this.f6618;
        AbstractC2275 abstractC2275 = c2274.f6603;
        abstractC2275.mo4243(animatedFraction);
        float fMo4245 = abstractC2275.mo4245();
        PathInterpolator pathInterpolator = C2277.f6611;
        int i = Build.VERSION.SDK_INT;
        C2225 c2225 = this.f6617;
        AbstractC2223 c2220 = i >= 36 ? new C2220(c2225) : i >= 35 ? new C2221(c2225) : i >= 34 ? new C2233(c2225) : i >= 31 ? new C2232(c2225) : i >= 30 ? new C2235(c2225) : i >= 29 ? new C2234(c2225) : new C2231(c2225);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.f6615 & i2;
            C2238 c2238 = c2225.f6520;
            if (i3 == 0) {
                c2220.mo4013(i2, c2238.mo4042(i2));
            } else {
                C7664 c7664Mo4042 = c2238.mo4042(i2);
                C7664 c7664Mo40422 = this.f6616.f6520.mo4042(i2);
                float f = 1.0f - fMo4245;
                c2220.mo4013(i2, C2225.m4052(c7664Mo4042, (int) (((double) ((c7664Mo4042.f20815 - c7664Mo40422.f20815) * f)) + 0.5d), (int) (((double) ((c7664Mo4042.f20814 - c7664Mo40422.f20814) * f)) + 0.5d), (int) (((double) ((c7664Mo4042.f20813 - c7664Mo40422.f20813) * f)) + 0.5d), (int) (((double) ((c7664Mo4042.f20812 - c7664Mo40422.f20812) * f)) + 0.5d)));
            }
        }
        C2277.m4250(this.f6614, c2220.mo4046(), Collections.singletonList(c2274));
    }
}
