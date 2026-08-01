package com.kongzue.dialogx.util;

import android.app.Activity;
import android.view.View;
import p034.AbstractC6344;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3772 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f11747;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ boolean f11748;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Activity f11749;

    public RunnableC3772(Activity activity, View view, boolean z) {
        this.f11749 = activity;
        this.f11747 = view;
        this.f11748 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC6344.m11868(this.f11749, this.f11747, this.f11748);
    }
}
