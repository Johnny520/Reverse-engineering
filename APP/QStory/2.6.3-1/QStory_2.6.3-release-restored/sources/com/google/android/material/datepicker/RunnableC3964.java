package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.RunnableC3043;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3964 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f10665;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10666;

    public /* synthetic */ RunnableC3964(View view, int i) {
        this.f10666 = i;
        this.f10665 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10666;
        View view = this.f10665;
        switch (i) {
            case 0:
                MaterialCalendarGridView.m7668((MaterialCalendarGridView) view);
                break;
            default:
                view.requestFocus();
                view.post(new RunnableC3043(view, 1));
                break;
        }
    }
}
