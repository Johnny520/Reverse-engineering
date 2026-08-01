package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.RunnableC2210;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3132 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f10320;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10321;

    public /* synthetic */ RunnableC3132(View view, int i) {
        this.f10321 = i;
        this.f10320 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10321;
        View view = this.f10320;
        switch (i) {
            case 0:
                MaterialCalendarGridView.m7109((MaterialCalendarGridView) view);
                break;
            default:
                view.requestFocus();
                view.post(new RunnableC2210(view, 1));
                break;
        }
    }
}
