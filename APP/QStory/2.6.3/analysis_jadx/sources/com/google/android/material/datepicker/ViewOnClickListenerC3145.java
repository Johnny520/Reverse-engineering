package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3145 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3114 f10377;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendar f10378;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10379;

    public /* synthetic */ ViewOnClickListenerC3145(MaterialCalendar materialCalendar, C3114 c3114, int i) {
        this.f10379 = i;
        this.f10378 = materialCalendar;
        this.f10377 = c3114;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f10379;
        C3114 c3114 = this.f10377;
        MaterialCalendar materialCalendar = this.f10378;
        switch (i) {
            case 0:
                int iM4646 = ((LinearLayoutManager) materialCalendar.f10257.getLayoutManager()).m4646();
                c3114.f10287 = 2;
                materialCalendar.m7107(c3114.m7120(iM4646 + 1));
                break;
            default:
                int iM4647 = ((LinearLayoutManager) materialCalendar.f10257.getLayoutManager()).m4647();
                c3114.f10287 = 1;
                materialCalendar.m7107(c3114.m7120(iM4647 - 1));
                break;
        }
    }
}
