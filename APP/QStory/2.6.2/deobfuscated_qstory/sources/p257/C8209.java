package p257;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8209 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C8216 f22648;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22649;

    public /* synthetic */ C8209(C8216 c8216, int i) {
        this.f22649 = i;
        this.f22648 = c8216;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f22649;
        C8216 c8216 = this.f22648;
        switch (i) {
            case 0:
                ((C8208) c8216.f22673).f22636.m8087(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((C8208) c8216.f22673).f22636.m8087(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
