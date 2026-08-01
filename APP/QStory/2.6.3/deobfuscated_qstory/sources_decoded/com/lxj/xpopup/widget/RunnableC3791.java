package com.lxj.xpopup.widget;

import com.lxj.xpopup.enums.LayoutStatus;

/* JADX INFO: renamed from: com.lxj.xpopup.widget.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3791 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ SmartDragLayout f11948;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11949;

    public /* synthetic */ RunnableC3791(SmartDragLayout smartDragLayout, int i) {
        this.f11949 = i;
        this.f11948 = smartDragLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11949;
        SmartDragLayout smartDragLayout = this.f11948;
        switch (i) {
            case 0:
                smartDragLayout.post(new RunnableC3790(smartDragLayout, smartDragLayout.f11938 - smartDragLayout.getScrollY(), true));
                smartDragLayout.f11940 = LayoutStatus.Opening;
                break;
            default:
                smartDragLayout.f11944.abortAnimation();
                smartDragLayout.post(new RunnableC3790(smartDragLayout, 0 - smartDragLayout.getScrollY(), false));
                smartDragLayout.f11940 = LayoutStatus.Closing;
                break;
        }
    }
}
