package com.lxj.xpopup.core;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: com.lxj.xpopup.core.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC4610 implements View.OnKeyListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4608 f12152;

    public ViewOnKeyListenerC4610(AbstractC4608 abstractC4608) {
        this.f12152 = abstractC4608;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        return this.f12152.processKeyEvent(i, keyEvent);
    }
}
