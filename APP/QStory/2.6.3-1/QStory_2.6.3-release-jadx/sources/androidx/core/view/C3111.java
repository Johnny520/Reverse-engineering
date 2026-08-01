package androidx.core.view;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;
import p180.C8494;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3111 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ View f6960;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f6961;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C3058 f6962;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C3058 f6963;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C3107 f6964;

    public C3111(C3107 c3107, C3058 c3058, C3058 c30582, int i, View view) {
        this.f6964 = c3107;
        this.f6963 = c3058;
        this.f6962 = c30582;
        this.f6961 = i;
        this.f6960 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C3107 c3107 = this.f6964;
        AbstractC3108 abstractC3108 = c3107.f6949;
        abstractC3108.mo4813(animatedFraction);
        float fMo4815 = abstractC3108.mo4815();
        PathInterpolator pathInterpolator = C3110.f6957;
        int i = Build.VERSION.SDK_INT;
        C3058 c3058 = this.f6963;
        AbstractC3056 c3053 = i >= 36 ? new C3053(c3058) : i >= 35 ? new C3054(c3058) : i >= 34 ? new C3066(c3058) : i >= 31 ? new C3065(c3058) : i >= 30 ? new C3068(c3058) : i >= 29 ? new C3067(c3058) : new C3064(c3058);
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            int i3 = this.f6961 & i2;
            C3071 c3071 = c3058.f6866;
            if (i3 == 0) {
                c3053.mo4583(i2, c3071.mo4612(i2));
            } else {
                C8494 c8494Mo4612 = c3071.mo4612(i2);
                C8494 c8494Mo46122 = this.f6962.f6866.mo4612(i2);
                float f = 1.0f - fMo4815;
                c3053.mo4583(i2, C3058.m4622(c8494Mo4612, (int) (((double) ((c8494Mo4612.f21155 - c8494Mo46122.f21155) * f)) + 0.5d), (int) (((double) ((c8494Mo4612.f21154 - c8494Mo46122.f21154) * f)) + 0.5d), (int) (((double) ((c8494Mo4612.f21153 - c8494Mo46122.f21153) * f)) + 0.5d), (int) (((double) ((c8494Mo4612.f21152 - c8494Mo46122.f21152) * f)) + 0.5d)));
            }
        }
        C3110.m4820(this.f6960, c3053.mo4616(), Collections.singletonList(c3107));
    }
}
