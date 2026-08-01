package com.lxj.xpopup.core;

import com.lxj.xpopup.widget.InterfaceC3789;
import p275.C8354;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3775 implements InterfaceC3789 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3776 f11805;

    public /* synthetic */ C3775(AbstractC3776 abstractC3776) {
        this.f11805 = abstractC3776;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m8098(float f) {
        AbstractC3781 abstractC3781 = (AbstractC3781) this.f11805;
        C3784 c3784 = abstractC3781.popupInfo;
        if (c3784 == null) {
            return;
        }
        c3784.getClass();
        abstractC3781.popupInfo.getClass();
        C8354 c8354 = abstractC3781.shadowBgAnimator;
        abstractC3781.setBackgroundColor(((Integer) c8354.f23033.evaluate(f, 0, Integer.valueOf(c8354.f23032))).intValue());
    }
}
