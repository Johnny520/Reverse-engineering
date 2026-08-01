package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2506 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f7510;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7511;

    public /* synthetic */ C2506(Object obj, int i) {
        this.f7511 = i;
        this.f7510 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f7511;
        Object obj = this.f7510;
        switch (i) {
            case 0:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C2507 c2507 = (C2507) obj;
                c2507.f7521.setAlpha(iFloatValue);
                c2507.f7520.setAlpha(iFloatValue);
                c2507.f7525.invalidate();
                break;
            default:
                ((C2466) obj).f7347 = valueAnimator.getAnimatedFraction();
                break;
        }
    }
}
