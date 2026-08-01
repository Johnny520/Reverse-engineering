package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import androidx.core.view.AbstractC3103;
import java.util.WeakHashMap;
import p346.C9607;
import top.suzhelan.qstory.p015ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3337 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f7841;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7842;

    public /* synthetic */ RunnableC3337(Object obj, int i) {
        this.f7842 = i;
        this.f7841 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int iM5428;
        int height;
        int i = this.f7842;
        int iM54282 = 0;
        Object obj = this.f7841;
        switch (i) {
            case 0:
                C3340 c3340 = (C3340) obj;
                ValueAnimator valueAnimator = c3340.f7862;
                int i2 = c3340.f7861;
                if (i2 == 1) {
                    valueAnimator.cancel();
                } else if (i2 != 2) {
                }
                c3340.f7861 = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                break;
            case 1:
                C3306 c3306 = (C3306) obj;
                if (c3306.f7740 != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = c3306.f7733;
                    long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
                    AbstractC3352 layoutManager = c3306.f7752.getLayoutManager();
                    if (c3306.f7734 == null) {
                        c3306.f7734 = new Rect();
                    }
                    layoutManager.m5574(c3306.f7734, c3306.f7740.itemView);
                    if (layoutManager.mo5236()) {
                        int i3 = (int) (c3306.f7760 + c3306.f7755);
                        int paddingLeft = (i3 - c3306.f7734.left) - c3306.f7752.getPaddingLeft();
                        float f = c3306.f7755;
                        iM5428 = ((f >= 0.0f || paddingLeft >= 0) && (f <= 0.0f || (paddingLeft = ((c3306.f7740.itemView.getWidth() + i3) + c3306.f7734.right) - (c3306.f7752.getWidth() - c3306.f7752.getPaddingRight())) <= 0)) ? 0 : paddingLeft;
                    }
                    if (layoutManager.mo5235()) {
                        int i4 = (int) (c3306.f7757 + c3306.f7759);
                        int paddingTop = (i4 - c3306.f7734.top) - c3306.f7752.getPaddingTop();
                        float f2 = c3306.f7759;
                        if (f2 < 0.0f && paddingTop < 0) {
                            iM54282 = paddingTop;
                        } else if (f2 > 0.0f && (height = ((c3306.f7740.itemView.getHeight() + i4) + c3306.f7734.bottom) - (c3306.f7752.getHeight() - c3306.f7752.getPaddingBottom())) > 0) {
                            iM54282 = height;
                        }
                    }
                    if (iM5428 != 0) {
                        C9607 c9607 = c3306.f7750;
                        DialogXRecycleView dialogXRecycleView = c3306.f7752;
                        int width = c3306.f7740.itemView.getWidth();
                        c3306.f7752.getWidth();
                        iM5428 = c9607.m5428(dialogXRecycleView, width, iM5428, j2);
                    }
                    int i5 = iM5428;
                    if (iM54282 != 0) {
                        C9607 c96072 = c3306.f7750;
                        DialogXRecycleView dialogXRecycleView2 = c3306.f7752;
                        int height2 = c3306.f7740.itemView.getHeight();
                        c3306.f7752.getHeight();
                        iM54282 = c96072.m5428(dialogXRecycleView2, height2, iM54282, j2);
                    }
                    if (i5 == 0 && iM54282 == 0) {
                        c3306.f7733 = Long.MIN_VALUE;
                    } else {
                        if (c3306.f7733 == Long.MIN_VALUE) {
                            c3306.f7733 = jCurrentTimeMillis;
                        }
                        c3306.f7752.scrollBy(i5, iM54282);
                        AbstractC3317 abstractC3317 = c3306.f7740;
                        if (abstractC3317 != null) {
                            c3306.m5446(abstractC3317);
                        }
                        c3306.f7752.removeCallbacks(c3306.f7744);
                        DialogXRecycleView dialogXRecycleView3 = c3306.f7752;
                        WeakHashMap weakHashMap = AbstractC3103.f6939;
                        dialogXRecycleView3.postOnAnimation(this);
                    }
                }
                break;
            default:
                ((StaggeredGridLayoutManager) obj).m5332();
                break;
        }
    }
}
