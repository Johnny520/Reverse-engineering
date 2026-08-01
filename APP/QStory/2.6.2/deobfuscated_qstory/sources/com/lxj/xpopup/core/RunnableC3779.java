package com.lxj.xpopup.core;

import androidx.appcompat.app.RunnableC0062;
import androidx.lifecycle.Lifecycle$Event;
import com.lxj.xpopup.enums.PopupStatus;
import com.lxj.xpopup.util.AbstractC3787;
import p276.AbstractC8356;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3779 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3780 f11805;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11806;

    public /* synthetic */ RunnableC3779(AbstractC3780 abstractC3780, int i) {
        this.f11806 = i;
        this.f11805 = abstractC3780;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11806;
        AbstractC3780 abstractC3780 = this.f11805;
        switch (i) {
            case 0:
                abstractC3780.popupStatus = PopupStatus.Dismiss;
                abstractC3780.lifecycleRegistry.m4489(Lifecycle$Event.ON_STOP);
                if (abstractC3780.popupInfo != null) {
                    abstractC3780.onDismiss();
                    int i2 = AbstractC8356.f23039;
                    abstractC3780.popupInfo.getClass();
                    Runnable runnable = abstractC3780.dismissWithRunnable;
                    if (runnable != null) {
                        runnable.run();
                        abstractC3780.dismissWithRunnable = null;
                    }
                    abstractC3780.popupInfo.getClass();
                    abstractC3780.popupInfo.getClass();
                    DialogC3782 dialogC3782 = abstractC3780.dialog;
                    if (dialogC3782 != null) {
                        dialogC3782.dismiss();
                    }
                    break;
                }
                break;
            case 1:
                abstractC3780.popupStatus = PopupStatus.Show;
                abstractC3780.lifecycleRegistry.m4489(Lifecycle$Event.ON_RESUME);
                abstractC3780.onShow();
                if (abstractC3780.getHostWindow() != null && AbstractC3787.m8117(abstractC3780.getHostWindow()) > 0 && !abstractC3780.hasMoveUp) {
                    AbstractC3787.f11829 = AbstractC3787.m8117(abstractC3780.getHostWindow());
                    abstractC3780.post(new RunnableC0062(abstractC3780, 11));
                    break;
                }
                break;
            default:
                if (abstractC3780.getHostWindow() != null) {
                    abstractC3780.beforeShow();
                    abstractC3780.lifecycleRegistry.m4489(Lifecycle$Event.ON_START);
                    abstractC3780.focusAndProcessBackPress();
                    abstractC3780.initAnimator();
                    abstractC3780.doShowAnimation();
                    abstractC3780.doAfterShow();
                    break;
                }
                break;
        }
    }
}
