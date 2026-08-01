package com.lxj.xpopup.core;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4611 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4608 f12153;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12154;

    public /* synthetic */ RunnableC4611(AbstractC4608 abstractC4608, int i) {
        this.f12154 = i;
        this.f12153 = abstractC4608;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f12154;
        AbstractC4608 abstractC4608 = this.f12153;
        switch (i) {
            case 0:
                abstractC4608.delayDismiss(abstractC4608.getAnimationDuration() + 50);
                break;
            default:
                abstractC4608.dismiss();
                break;
        }
    }
}
