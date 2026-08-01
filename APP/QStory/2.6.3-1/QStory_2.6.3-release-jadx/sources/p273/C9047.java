package p273;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9047 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C9046 f23018;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f23019;

    public /* synthetic */ C9047(C9046 c9046, int i) {
        this.f23019 = i;
        this.f23018 = c9046;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f23019;
        C9046 c9046 = this.f23018;
        switch (i) {
            case 0:
                ((C9068) c9046.f23016).f23086.m8633(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((C9068) c9046.f23016).f23086.m8633(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
