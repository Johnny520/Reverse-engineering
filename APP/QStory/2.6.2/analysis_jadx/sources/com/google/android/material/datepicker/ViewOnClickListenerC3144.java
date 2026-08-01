package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3144 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3113 f10372;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendar f10373;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10374;

    public /* synthetic */ ViewOnClickListenerC3144(MaterialCalendar materialCalendar, C3113 c3113, int i) {
        this.f10374 = i;
        this.f10373 = materialCalendar;
        this.f10372 = c3113;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f10374;
        C3113 c3113 = this.f10372;
        MaterialCalendar materialCalendar = this.f10373;
        switch (i) {
            case 0:
                int iM4636 = ((LinearLayoutManager) materialCalendar.f10252.getLayoutManager()).m4636();
                c3113.f10282 = 2;
                materialCalendar.m7120(c3113.m7133(iM4636 + 1));
                break;
            default:
                int iM4637 = ((LinearLayoutManager) materialCalendar.f10252.getLayoutManager()).m4637();
                c3113.f10282 = 1;
                materialCalendar.m7120(c3113.m7133(iM4637 - 1));
                break;
        }
    }
}
