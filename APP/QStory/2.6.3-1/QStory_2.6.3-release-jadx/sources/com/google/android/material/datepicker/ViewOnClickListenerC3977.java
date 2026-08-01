package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3977 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3946 f10722;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendar f10723;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10724;

    public /* synthetic */ ViewOnClickListenerC3977(MaterialCalendar materialCalendar, C3946 c3946, int i) {
        this.f10724 = i;
        this.f10723 = materialCalendar;
        this.f10722 = c3946;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f10724;
        C3946 c3946 = this.f10722;
        MaterialCalendar materialCalendar = this.f10723;
        switch (i) {
            case 0:
                int iM5206 = ((LinearLayoutManager) materialCalendar.f10602.getLayoutManager()).m5206();
                c3946.f10632 = 2;
                materialCalendar.m7666(c3946.m7679(iM5206 + 1));
                break;
            default:
                int iM5207 = ((LinearLayoutManager) materialCalendar.f10602.getLayoutManager()).m5207();
                c3946.f10632 = 1;
                materialCalendar.m7666(c3946.m7679(iM5207 - 1));
                break;
        }
    }
}
