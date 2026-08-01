package p273;

import android.animation.ValueAnimator;
import androidx.compose.animation.core.C1171;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9058 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C9046 f23054;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f23055;

    public /* synthetic */ C9058(C9046 c9046, int i) {
        this.f23055 = i;
        this.f23054 = c9046;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f23055;
        C9046 c9046 = this.f23054;
        switch (i) {
            case 0:
                ((DialogXBaseRelativeLayout) ((C1171) c9046.f23016).f1440).m8633(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((DialogXBaseRelativeLayout) ((C1171) c9046.f23016).f1440).m8633(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
