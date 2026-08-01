package com.lxj.xpopup.widget;

import android.widget.OverScroller;
import androidx.core.view.AbstractC3103;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.lxj.xpopup.widget.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4622 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f12290;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ SmartDragLayout f12291;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12292;

    public RunnableC4622(SmartDragLayout smartDragLayout, int i, boolean z) {
        this.f12291 = smartDragLayout;
        this.f12292 = i;
        this.f12290 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SmartDragLayout smartDragLayout = this.f12291;
        OverScroller overScroller = smartDragLayout.f12289;
        int scrollX = smartDragLayout.getScrollX();
        int scrollY = smartDragLayout.getScrollY();
        float f = smartDragLayout.f12286;
        if (!this.f12290) {
            f *= 0.8f;
        }
        overScroller.startScroll(scrollX, scrollY, 0, this.f12292, (int) f);
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        smartDragLayout.postInvalidateOnAnimation();
    }
}
