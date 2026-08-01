package com.lxj.xpopup.widget;

import android.widget.OverScroller;
import androidx.core.view.AbstractC2270;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.lxj.xpopup.widget.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3790 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f11945;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ SmartDragLayout f11946;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11947;

    public RunnableC3790(SmartDragLayout smartDragLayout, int i, boolean z) {
        this.f11946 = smartDragLayout;
        this.f11947 = i;
        this.f11945 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SmartDragLayout smartDragLayout = this.f11946;
        OverScroller overScroller = smartDragLayout.f11944;
        int scrollX = smartDragLayout.getScrollX();
        int scrollY = smartDragLayout.getScrollY();
        float f = smartDragLayout.f11941;
        if (!this.f11945) {
            f *= 0.8f;
        }
        overScroller.startScroll(scrollX, scrollY, 0, this.f11947, (int) f);
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        smartDragLayout.postInvalidateOnAnimation();
    }
}
