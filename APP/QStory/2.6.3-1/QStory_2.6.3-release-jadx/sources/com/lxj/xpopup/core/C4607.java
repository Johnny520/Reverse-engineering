package com.lxj.xpopup.core;

import com.lxj.xpopup.widget.InterfaceC4621;
import p291.C9183;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4607 implements InterfaceC4621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4608 f12150;

    public /* synthetic */ C4607(AbstractC4608 abstractC4608) {
        this.f12150 = abstractC4608;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m8657(float f) {
        AbstractC4613 abstractC4613 = (AbstractC4613) this.f12150;
        C4616 c4616 = abstractC4613.popupInfo;
        if (c4616 == null) {
            return;
        }
        c4616.getClass();
        abstractC4613.popupInfo.getClass();
        C9183 c9183 = abstractC4613.shadowBgAnimator;
        abstractC4613.setBackgroundColor(((Integer) c9183.f23378.evaluate(f, 0, Integer.valueOf(c9183.f23377))).intValue());
    }
}
