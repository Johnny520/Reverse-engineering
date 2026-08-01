package p273;

import android.animation.ValueAnimator;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9032 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C9046 f22941;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22942;

    public /* synthetic */ C9032(C9046 c9046, int i) {
        this.f22942 = i;
        this.f22941 = c9046;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f22942;
        C9046 c9046 = this.f22941;
        switch (i) {
            case 0:
                ((C9029) c9046.f23016).f22932.m8633(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = ((C9029) c9046.f23016).f22932;
                if (dialogXBaseRelativeLayout != null) {
                    dialogXBaseRelativeLayout.m8633(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                break;
        }
    }
}
