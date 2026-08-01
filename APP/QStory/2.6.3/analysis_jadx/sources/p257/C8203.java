package p257;

import android.animation.ValueAnimator;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8203 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C8217 f22596;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22597;

    public /* synthetic */ C8203(C8217 c8217, int i) {
        this.f22597 = i;
        this.f22596 = c8217;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f22597;
        C8217 c8217 = this.f22596;
        switch (i) {
            case 0:
                ((C8200) c8217.f22671).f22587.m8074(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                DialogXBaseRelativeLayout dialogXBaseRelativeLayout = ((C8200) c8217.f22671).f22587;
                if (dialogXBaseRelativeLayout != null) {
                    dialogXBaseRelativeLayout.m8074(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                break;
        }
    }
}
