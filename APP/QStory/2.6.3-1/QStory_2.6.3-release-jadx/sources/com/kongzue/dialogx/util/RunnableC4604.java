package com.kongzue.dialogx.util;

import android.app.Activity;
import android.view.View;
import p050.AbstractC7173;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4604 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f12092;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ boolean f12093;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Activity f12094;

    public RunnableC4604(Activity activity, View view, boolean z) {
        this.f12094 = activity;
        this.f12092 = view;
        this.f12093 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC7173.m12427(this.f12094, this.f12092, this.f12093);
    }
}
