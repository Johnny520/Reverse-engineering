package com.lxj.xpopup.core;

import android.view.View;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3781 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3780 f11807;

    public ViewOnClickListenerC3781(AbstractC3780 abstractC3780) {
        this.f11807 = abstractC3780;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC3780 abstractC3780 = this.f11807;
        C3783 c3783 = abstractC3780.popupInfo;
        if (c3783 != null) {
            c3783.getClass();
            abstractC3780.dismiss();
        }
    }
}
