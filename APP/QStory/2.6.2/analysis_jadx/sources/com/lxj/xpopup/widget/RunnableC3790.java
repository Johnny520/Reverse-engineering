package com.lxj.xpopup.widget;

import com.lxj.xpopup.enums.LayoutStatus;

/* JADX INFO: renamed from: com.lxj.xpopup.widget.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3790 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ SmartDragLayout f11943;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11944;

    public /* synthetic */ RunnableC3790(SmartDragLayout smartDragLayout, int i) {
        this.f11944 = i;
        this.f11943 = smartDragLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11944;
        SmartDragLayout smartDragLayout = this.f11943;
        switch (i) {
            case 0:
                smartDragLayout.post(new RunnableC3789(smartDragLayout, smartDragLayout.f11933 - smartDragLayout.getScrollY(), true));
                smartDragLayout.f11935 = LayoutStatus.Opening;
                break;
            default:
                smartDragLayout.f11939.abortAnimation();
                smartDragLayout.post(new RunnableC3789(smartDragLayout, 0 - smartDragLayout.getScrollY(), false));
                smartDragLayout.f11935 = LayoutStatus.Closing;
                break;
        }
    }
}
