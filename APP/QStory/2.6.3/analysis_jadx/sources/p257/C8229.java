package p257;

import android.animation.ValueAnimator;
import androidx.compose.animation.core.C0325;
import com.kongzue.dialogx.util.views.DialogXBaseRelativeLayout;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8229 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C8217 f22709;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f22710;

    public /* synthetic */ C8229(C8217 c8217, int i) {
        this.f22710 = i;
        this.f22709 = c8217;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f22710;
        C8217 c8217 = this.f22709;
        switch (i) {
            case 0:
                ((DialogXBaseRelativeLayout) ((C0325) c8217.f22671).f1095).m8074(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((DialogXBaseRelativeLayout) ((C0325) c8217.f22671).f1095).m8074(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
