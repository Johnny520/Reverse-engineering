package com.lxj.xpopup.core;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC3777 implements View.OnKeyListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3775 f11802;

    public ViewOnKeyListenerC3777(AbstractC3775 abstractC3775) {
        this.f11802 = abstractC3775;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        return this.f11802.processKeyEvent(i, keyEvent);
    }
}
