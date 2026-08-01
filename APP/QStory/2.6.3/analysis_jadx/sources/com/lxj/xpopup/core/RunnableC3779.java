package com.lxj.xpopup.core;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3779 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3776 f11808;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11809;

    public /* synthetic */ RunnableC3779(AbstractC3776 abstractC3776, int i) {
        this.f11809 = i;
        this.f11808 = abstractC3776;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11809;
        AbstractC3776 abstractC3776 = this.f11808;
        switch (i) {
            case 0:
                abstractC3776.delayDismiss(abstractC3776.getAnimationDuration() + 50);
                break;
            default:
                abstractC3776.dismiss();
                break;
        }
    }
}
