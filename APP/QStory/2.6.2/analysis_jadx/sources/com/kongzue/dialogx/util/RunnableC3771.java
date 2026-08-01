package com.kongzue.dialogx.util;

import android.app.Activity;
import android.view.View;
import p175.AbstractC7738;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3771 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f11742;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ boolean f11743;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Activity f11744;

    public RunnableC3771(Activity activity, View view, boolean z) {
        this.f11744 = activity;
        this.f11742 = view;
        this.f11743 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC7738.m13020(this.f11744, this.f11742, this.f11743);
    }
}
