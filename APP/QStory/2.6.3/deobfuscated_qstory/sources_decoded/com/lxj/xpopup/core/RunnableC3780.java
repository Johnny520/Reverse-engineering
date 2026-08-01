package com.lxj.xpopup.core;

import androidx.appcompat.app.RunnableC0062;
import androidx.lifecycle.Lifecycle$Event;
import com.lxj.xpopup.enums.PopupStatus;
import com.lxj.xpopup.util.AbstractC3788;
import p276.AbstractC8357;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3780 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3781 f11810;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f11811;

    public /* synthetic */ RunnableC3780(AbstractC3781 abstractC3781, int i) {
        this.f11811 = i;
        this.f11810 = abstractC3781;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f11811;
        AbstractC3781 abstractC3781 = this.f11810;
        switch (i) {
            case 0:
                abstractC3781.popupStatus = PopupStatus.Dismiss;
                abstractC3781.lifecycleRegistry.m4499(Lifecycle$Event.ON_STOP);
                if (abstractC3781.popupInfo != null) {
                    abstractC3781.onDismiss();
                    int i2 = AbstractC8357.f23038;
                    abstractC3781.popupInfo.getClass();
                    Runnable runnable = abstractC3781.dismissWithRunnable;
                    if (runnable != null) {
                        runnable.run();
                        abstractC3781.dismissWithRunnable = null;
                    }
                    abstractC3781.popupInfo.getClass();
                    abstractC3781.popupInfo.getClass();
                    DialogC3783 dialogC3783 = abstractC3781.dialog;
                    if (dialogC3783 != null) {
                        dialogC3783.dismiss();
                    }
                    break;
                }
                break;
            case 1:
                abstractC3781.popupStatus = PopupStatus.Show;
                abstractC3781.lifecycleRegistry.m4499(Lifecycle$Event.ON_RESUME);
                abstractC3781.onShow();
                if (abstractC3781.getHostWindow() != null && AbstractC3788.m8104(abstractC3781.getHostWindow()) > 0 && !abstractC3781.hasMoveUp) {
                    AbstractC3788.f11834 = AbstractC3788.m8104(abstractC3781.getHostWindow());
                    abstractC3781.post(new RunnableC0062(abstractC3781, 11));
                    break;
                }
                break;
            default:
                if (abstractC3781.getHostWindow() != null) {
                    abstractC3781.beforeShow();
                    abstractC3781.lifecycleRegistry.m4499(Lifecycle$Event.ON_START);
                    abstractC3781.focusAndProcessBackPress();
                    abstractC3781.initAnimator();
                    abstractC3781.doShowAnimation();
                    abstractC3781.doAfterShow();
                    break;
                }
                break;
        }
    }
}
