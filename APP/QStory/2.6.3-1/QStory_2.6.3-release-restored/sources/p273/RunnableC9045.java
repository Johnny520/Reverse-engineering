package p273;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.textfield.C4009;
import com.kongzue.dialogx.interfaces.DialogXStyle$PopTipSettings$ALIGN;
import kotlin.reflect.jvm.internal.types.AbstractC5754;

/* JADX INFO: renamed from: 飘花落叶言楪哲世兰子苏.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9045 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f23013;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ C9041 f23014;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23015;

    public /* synthetic */ RunnableC9045(C9041 c9041, View view, int i) {
        this.f23015 = i;
        this.f23014 = c9041;
        this.f23013 = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f0, code lost:
    
        if (r1 != 5) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        float y;
        float height;
        int i = this.f23015;
        float height2 = 0.0f;
        C9041 c9041 = this.f23014;
        View view = this.f23013;
        switch (i) {
            case 0:
                AbstractC5754 abstractC5754 = c9041.f11928;
                if (c9041.f22998 != null) {
                    if (c9041.f22999 == null) {
                        abstractC5754.mo10453();
                        c9041.f22999 = abstractC5754.mo10453().mo8882();
                    }
                    if (c9041.f22999 == null) {
                        c9041.f22999 = DialogXStyle$PopTipSettings$ALIGN.TOP;
                    }
                    int i2 = AbstractC9043.f23010[c9041.f22999.ordinal()];
                    if (i2 == 1) {
                        height2 = (view.getHeight() * 1.3f) + view.getY();
                    } else if (i2 == 2 || i2 == 3) {
                        y = view.getY();
                        height = view.getHeight() * 1.3f;
                        height2 = y - height;
                    } else if (i2 == 4) {
                        y = view.getY() + view.getHeight();
                        height = view.getPaddingTop();
                        height2 = y - height;
                    }
                    if (view.getTag() instanceof ValueAnimator) {
                        ((ValueAnimator) view.getTag()).end();
                    }
                    float y2 = view.getY();
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(y2, height2);
                    view.setTag(valueAnimatorOfFloat);
                    valueAnimatorOfFloat.addUpdateListener(new C4009(this, height2, y2, 5));
                    long j = c9041.f11925;
                    if (j == -1) {
                        j = 300;
                    }
                    valueAnimatorOfFloat.setDuration(j).setInterpolator(new DecelerateInterpolator(2.0f));
                    valueAnimatorOfFloat.start();
                    break;
                }
                break;
            default:
                AbstractC5754 abstractC57542 = c9041.f11928;
                if (c9041.f22998 != null) {
                    if (c9041.f22999 == null) {
                        abstractC57542.mo10453();
                        c9041.f22999 = abstractC57542.mo10453().mo8882();
                    }
                    if (c9041.f22999 == null) {
                        c9041.f22999 = DialogXStyle$PopTipSettings$ALIGN.TOP;
                    }
                    int i3 = AbstractC9043.f23010[c9041.f22999.ordinal()];
                    if (i3 == 1) {
                        height2 = view.getY() - (view.getHeight() * 1.3f);
                    } else if (i3 == 2 || i3 == 3) {
                        height2 = (view.getHeight() * 1.3f) + view.getY();
                    } else if (i3 == 4) {
                        height2 = (view.getY() - view.getHeight()) + view.getPaddingTop();
                    } else if (i3 == 5) {
                    }
                    if (view.getTag() instanceof ValueAnimator) {
                        ((ValueAnimator) view.getTag()).end();
                    }
                    float y3 = view.getY();
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(y3, height2);
                    view.setTag(valueAnimatorOfFloat2);
                    valueAnimatorOfFloat2.addUpdateListener(new C4009(this, height2, y3, 6));
                    long j2 = c9041.f11936;
                    if (j2 == -1) {
                        j2 = 300;
                    }
                    valueAnimatorOfFloat2.setDuration(j2).setInterpolator(new AccelerateInterpolator(2.0f));
                    valueAnimatorOfFloat2.start();
                    break;
                }
                break;
        }
    }
}
