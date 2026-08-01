package com.lxj.xpopup.core;

import androidx.appcompat.app.RunnableC0909;
import androidx.lifecycle.Lifecycle$Event;
import com.lxj.xpopup.enums.PopupStatus;
import com.lxj.xpopup.util.AbstractC4620;
import p292.AbstractC9186;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4612 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4613 f12155;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12156;

    public /* synthetic */ RunnableC4612(AbstractC4613 abstractC4613, int i) {
        this.f12156 = i;
        this.f12155 = abstractC4613;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f12156;
        AbstractC4613 abstractC4613 = this.f12155;
        switch (i) {
            case 0:
                abstractC4613.popupStatus = PopupStatus.Dismiss;
                abstractC4613.lifecycleRegistry.m5059(Lifecycle$Event.ON_STOP);
                if (abstractC4613.popupInfo != null) {
                    abstractC4613.onDismiss();
                    int i2 = AbstractC9186.f23383;
                    abstractC4613.popupInfo.getClass();
                    Runnable runnable = abstractC4613.dismissWithRunnable;
                    if (runnable != null) {
                        runnable.run();
                        abstractC4613.dismissWithRunnable = null;
                    }
                    abstractC4613.popupInfo.getClass();
                    abstractC4613.popupInfo.getClass();
                    DialogC4615 dialogC4615 = abstractC4613.dialog;
                    if (dialogC4615 != null) {
                        dialogC4615.dismiss();
                    }
                    break;
                }
                break;
            case 1:
                abstractC4613.popupStatus = PopupStatus.Show;
                abstractC4613.lifecycleRegistry.m5059(Lifecycle$Event.ON_RESUME);
                abstractC4613.onShow();
                if (abstractC4613.getHostWindow() != null && AbstractC4620.m8663(abstractC4613.getHostWindow()) > 0 && !abstractC4613.hasMoveUp) {
                    AbstractC4620.f12179 = AbstractC4620.m8663(abstractC4613.getHostWindow());
                    abstractC4613.post(new RunnableC0909(abstractC4613, 11));
                    break;
                }
                break;
            default:
                if (abstractC4613.getHostWindow() != null) {
                    abstractC4613.beforeShow();
                    abstractC4613.lifecycleRegistry.m5059(Lifecycle$Event.ON_START);
                    abstractC4613.focusAndProcessBackPress();
                    abstractC4613.initAnimator();
                    abstractC4613.doShowAnimation();
                    abstractC4613.doAfterShow();
                    break;
                }
                break;
        }
    }
}
