package com.lxj.xpopup.core;

import com.lxj.xpopup.widget.InterfaceC3788;
import p275.C8353;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3774 implements InterfaceC3788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3775 f11800;

    public /* synthetic */ C3774(AbstractC3775 abstractC3775) {
        this.f11800 = abstractC3775;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m8111(float f) {
        AbstractC3780 abstractC3780 = (AbstractC3780) this.f11800;
        C3783 c3783 = abstractC3780.popupInfo;
        if (c3783 == null) {
            return;
        }
        c3783.getClass();
        abstractC3780.popupInfo.getClass();
        C8353 c8353 = abstractC3780.shadowBgAnimator;
        abstractC3780.setBackgroundColor(((Integer) c8353.f23034.evaluate(f, 0, Integer.valueOf(c8353.f23033))).intValue());
    }
}
