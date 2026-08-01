package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p164.C7665;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2278 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ View f6615;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f6616;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C2225 f6617;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C2225 f6618;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C2274 f6619;

    public C2278(C2274 c2274, C2225 c2225, C2225 c22252, int i, View view) {
        this.f6619 = c2274;
        this.f6618 = c2225;
        this.f6617 = c22252;
        this.f6616 = i;
        this.f6615 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C2274 c2274 = this.f6619;
        AbstractC2275 abstractC2275 = c2274.f6604;
        abstractC2275.mo4253(animatedFraction);
        float fMo4255 = abstractC2275.mo4255();
        PathInterpolator pathInterpolator = C2277.f6612;
        int i = Build.VERSION.SDK_INT;
        C2225 c2225 = this.f6618;
        AbstractC2223 c2220 = i >= 36 ? new C2220(c2225) : i >= 35 ? new C2221(c2225) : i >= 34 ? new C2233(c2225) : i >= 31 ? new C2232(c2225) : i >= 30 ? new C2235(c2225) : i >= 29 ? new C2234(c2225) : new C2231(c2225);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.f6616 & i2;
            C2238 c2238 = c2225.f6521;
            if (i3 == 0) {
                c2220.mo4023(i2, c2238.mo4052(i2));
            } else {
                C7665 c7665Mo4052 = c2238.mo4052(i2);
                C7665 c7665Mo40522 = this.f6617.f6521.mo4052(i2);
                float f = 1.0f - fMo4255;
                c2220.mo4023(i2, C2225.m4062(c7665Mo4052, (int) (((double) ((c7665Mo4052.f20810 - c7665Mo40522.f20810) * f)) + 0.5d), (int) (((double) ((c7665Mo4052.f20809 - c7665Mo40522.f20809) * f)) + 0.5d), (int) (((double) ((c7665Mo4052.f20808 - c7665Mo40522.f20808) * f)) + 0.5d), (int) (((double) ((c7665Mo4052.f20807 - c7665Mo40522.f20807) * f)) + 0.5d)));
            }
        }
        C2277.m4260(this.f6615, c2220.mo4056(), Collections.singletonList(c2274));
    }
}
