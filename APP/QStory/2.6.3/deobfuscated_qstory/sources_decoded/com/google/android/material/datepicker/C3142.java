package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.AbstractC2533;
import androidx.recyclerview.widget.C2452;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3142 extends AbstractC2533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendar f10364;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C3114 f10365;

    public C3142(MaterialCalendar materialCalendar, C3114 c3114) {
        this.f10364 = materialCalendar;
        this.f10365 = c3114;
    }

    @Override // androidx.recyclerview.widget.AbstractC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo4898(RecyclerView recyclerView, int i, int i2) {
        MaterialCalendar materialCalendar = this.f10364;
        RecyclerView recyclerView2 = materialCalendar.f10257;
        int iM4646 = i < 0 ? ((LinearLayoutManager) recyclerView2.getLayoutManager()).m4646() : ((LinearLayoutManager) recyclerView2.getLayoutManager()).m4647();
        C2452 c2452 = materialCalendar.f10251;
        C3114 c3114 = this.f10365;
        if (c2452 == null) {
            materialCalendar.f10258 = c3114.m7120(iM4646);
        }
        materialCalendar.f10253.setText(c3114.m7120(iM4646).m7117());
        materialCalendar.m7103(iM4646);
    }

    @Override // androidx.recyclerview.widget.AbstractC2533
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo4899(RecyclerView recyclerView, int i) {
        MaterialCalendar materialCalendar;
        C2452 c2452;
        if (i != 0 || (c2452 = (materialCalendar = this.f10364).f10251) == null) {
            return;
        }
        View viewMo4819 = c2452.mo4819((LinearLayoutManager) materialCalendar.f10257.getLayoutManager());
        if (viewMo4819 != null) {
            AbstractC2484 abstractC2484M4689 = RecyclerView.m4689(viewMo4819);
            int absoluteAdapterPosition = abstractC2484M4689 != null ? abstractC2484M4689.getAbsoluteAdapterPosition() : -1;
            if (absoluteAdapterPosition != -1) {
                C3114 c3114 = this.f10365;
                materialCalendar.f10258 = c3114.m7120(absoluteAdapterPosition);
                materialCalendar.f10253.setText(c3114.m7120(absoluteAdapterPosition).m7117());
                materialCalendar.m7103(absoluteAdapterPosition);
            }
        }
        materialCalendar.m7104();
    }
}
