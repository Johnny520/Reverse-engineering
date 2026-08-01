package com.lxj.xpopup.core;

import android.view.View;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3782 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3781 f11812;

    public ViewOnClickListenerC3782(AbstractC3781 abstractC3781) {
        this.f11812 = abstractC3781;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC3781 abstractC3781 = this.f11812;
        C3784 c3784 = abstractC3781.popupInfo;
        if (c3784 != null) {
            c3784.getClass();
            abstractC3781.dismiss();
        }
    }
}
