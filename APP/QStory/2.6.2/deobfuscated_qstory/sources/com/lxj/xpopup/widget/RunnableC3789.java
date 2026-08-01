package com.lxj.xpopup.widget;

import android.widget.OverScroller;
import androidx.core.view.AbstractC2270;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.lxj.xpopup.widget.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3789 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ boolean f11940;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ SmartDragLayout f11941;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11942;

    public RunnableC3789(SmartDragLayout smartDragLayout, int i, boolean z) {
        this.f11941 = smartDragLayout;
        this.f11942 = i;
        this.f11940 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SmartDragLayout smartDragLayout = this.f11941;
        OverScroller overScroller = smartDragLayout.f11939;
        int scrollX = smartDragLayout.getScrollX();
        int scrollY = smartDragLayout.getScrollY();
        float f = smartDragLayout.f11936;
        if (!this.f11940) {
            f *= 0.8f;
        }
        overScroller.startScroll(scrollX, scrollY, 0, this.f11942, (int) f);
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        smartDragLayout.postInvalidateOnAnimation();
    }
}
