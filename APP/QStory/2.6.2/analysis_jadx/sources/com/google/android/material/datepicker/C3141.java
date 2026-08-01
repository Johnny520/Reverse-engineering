package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.AbstractC2533;
import androidx.recyclerview.widget.C2452;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3141 extends AbstractC2533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendar f10359;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C3113 f10360;

    public C3141(MaterialCalendar materialCalendar, C3113 c3113) {
        this.f10359 = materialCalendar;
        this.f10360 = c3113;
    }

    @Override // androidx.recyclerview.widget.AbstractC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo4888(RecyclerView recyclerView, int i, int i2) {
        MaterialCalendar materialCalendar = this.f10359;
        RecyclerView recyclerView2 = materialCalendar.f10252;
        int iM4636 = i < 0 ? ((LinearLayoutManager) recyclerView2.getLayoutManager()).m4636() : ((LinearLayoutManager) recyclerView2.getLayoutManager()).m4637();
        C2452 c2452 = materialCalendar.f10246;
        C3113 c3113 = this.f10360;
        if (c2452 == null) {
            materialCalendar.f10253 = c3113.m7133(iM4636);
        }
        materialCalendar.f10248.setText(c3113.m7133(iM4636).m7130());
        materialCalendar.m7116(iM4636);
    }

    @Override // androidx.recyclerview.widget.AbstractC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4889(RecyclerView recyclerView, int i) {
        MaterialCalendar materialCalendar;
        C2452 c2452;
        if (i != 0 || (c2452 = (materialCalendar = this.f10359).f10246) == null) {
            return;
        }
        View viewMo4809 = c2452.mo4809((LinearLayoutManager) materialCalendar.f10252.getLayoutManager());
        if (viewMo4809 != null) {
            AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(viewMo4809);
            int absoluteAdapterPosition = abstractC2484M4679 != null ? abstractC2484M4679.getAbsoluteAdapterPosition() : -1;
            if (absoluteAdapterPosition != -1) {
                C3113 c3113 = this.f10360;
                materialCalendar.f10253 = c3113.m7133(absoluteAdapterPosition);
                materialCalendar.f10248.setText(c3113.m7133(absoluteAdapterPosition).m7130());
                materialCalendar.m7116(absoluteAdapterPosition);
            }
        }
        materialCalendar.m7117();
    }
}
