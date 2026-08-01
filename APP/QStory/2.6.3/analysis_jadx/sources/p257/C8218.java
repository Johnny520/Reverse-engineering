package p257;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8218 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C8217 f22673;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22674;

    public /* synthetic */ C8218(C8217 c8217, int i) {
        this.f22674 = i;
        this.f22673 = c8217;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f22674;
        C8217 c8217 = this.f22673;
        switch (i) {
            case 0:
                ((C8239) c8217.f22671).f22741.m8074(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((C8239) c8217.f22671).f22741.m8074(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
