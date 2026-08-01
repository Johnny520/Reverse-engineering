package com.lxj.xpopup.core;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3778 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3775 f11803;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11804;

    public /* synthetic */ RunnableC3778(AbstractC3775 abstractC3775, int i) {
        this.f11804 = i;
        this.f11803 = abstractC3775;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11804;
        AbstractC3775 abstractC3775 = this.f11803;
        switch (i) {
            case 0:
                abstractC3775.delayDismiss(abstractC3775.getAnimationDuration() + 50);
                break;
            default:
                abstractC3775.dismiss();
                break;
        }
    }
}
