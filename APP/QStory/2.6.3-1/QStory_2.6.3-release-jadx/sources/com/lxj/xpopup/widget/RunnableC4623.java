package com.lxj.xpopup.widget;

import com.lxj.xpopup.enums.LayoutStatus;

/* JADX INFO: renamed from: com.lxj.xpopup.widget.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4623 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ SmartDragLayout f12293;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12294;

    public /* synthetic */ RunnableC4623(SmartDragLayout smartDragLayout, int i) {
        this.f12294 = i;
        this.f12293 = smartDragLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f12294;
        SmartDragLayout smartDragLayout = this.f12293;
        switch (i) {
            case 0:
                smartDragLayout.post(new RunnableC4622(smartDragLayout, smartDragLayout.f12283 - smartDragLayout.getScrollY(), true));
                smartDragLayout.f12285 = LayoutStatus.Opening;
                break;
            default:
                smartDragLayout.f12289.abortAnimation();
                smartDragLayout.post(new RunnableC4622(smartDragLayout, 0 - smartDragLayout.getScrollY(), false));
                smartDragLayout.f12285 = LayoutStatus.Closing;
                break;
        }
    }
}
