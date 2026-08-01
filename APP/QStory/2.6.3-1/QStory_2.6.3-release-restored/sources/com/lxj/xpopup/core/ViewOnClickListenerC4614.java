package com.lxj.xpopup.core;

import android.view.View;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC4614 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4613 f12157;

    public ViewOnClickListenerC4614(AbstractC4613 abstractC4613) {
        this.f12157 = abstractC4613;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC4613 abstractC4613 = this.f12157;
        C4616 c4616 = abstractC4613.popupInfo;
        if (c4616 != null) {
            c4616.getClass();
            abstractC4613.dismiss();
        }
    }
}
