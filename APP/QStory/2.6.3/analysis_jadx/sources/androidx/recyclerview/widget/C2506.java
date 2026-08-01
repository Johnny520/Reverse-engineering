package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2506 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f7511;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7512;

    public /* synthetic */ C2506(Object obj, int i) {
        this.f7512 = i;
        this.f7511 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f7512;
        Object obj = this.f7511;
        switch (i) {
            case 0:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C2507 c2507 = (C2507) obj;
                c2507.f7522.setAlpha(iFloatValue);
                c2507.f7521.setAlpha(iFloatValue);
                c2507.f7526.invalidate();
                break;
            default:
                ((C2466) obj).f7348 = valueAnimator.getAnimatedFraction();
                break;
        }
    }
}
