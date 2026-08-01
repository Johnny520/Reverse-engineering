package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.RunnableC2210;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3131 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ View f10315;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10316;

    public /* synthetic */ RunnableC3131(View view, int i) {
        this.f10316 = i;
        this.f10315 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f10316;
        View view = this.f10315;
        switch (i) {
            case 0:
                MaterialCalendarGridView.m7122((MaterialCalendarGridView) view);
                break;
            default:
                view.requestFocus();
                view.post(new RunnableC2210(view, 1));
                break;
        }
    }
}
