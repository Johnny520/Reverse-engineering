package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3339 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f7856;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f7857;

    public /* synthetic */ C3339(Object obj, int i) {
        this.f7857 = i;
        this.f7856 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f7857;
        Object obj = this.f7856;
        switch (i) {
            case 0:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C3340 c3340 = (C3340) obj;
                c3340.f7867.setAlpha(iFloatValue);
                c3340.f7866.setAlpha(iFloatValue);
                c3340.f7871.invalidate();
                break;
            default:
                ((C3299) obj).f7693 = valueAnimator.getAnimatedFraction();
                break;
        }
    }
}
