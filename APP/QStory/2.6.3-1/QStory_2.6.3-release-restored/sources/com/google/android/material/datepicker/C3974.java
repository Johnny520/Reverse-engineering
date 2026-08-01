package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.AbstractC3317;
import androidx.recyclerview.widget.AbstractC3366;
import androidx.recyclerview.widget.C3285;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3974 extends AbstractC3366 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendar f10709;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ C3946 f10710;

    public C3974(MaterialCalendar materialCalendar, C3946 c3946) {
        this.f10709 = materialCalendar;
        this.f10710 = c3946;
    }

    @Override // androidx.recyclerview.widget.AbstractC3366
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo5458(RecyclerView recyclerView, int i, int i2) {
        MaterialCalendar materialCalendar = this.f10709;
        RecyclerView recyclerView2 = materialCalendar.f10602;
        int iM5206 = i < 0 ? ((LinearLayoutManager) recyclerView2.getLayoutManager()).m5206() : ((LinearLayoutManager) recyclerView2.getLayoutManager()).m5207();
        C3285 c3285 = materialCalendar.f10596;
        C3946 c3946 = this.f10710;
        if (c3285 == null) {
            materialCalendar.f10603 = c3946.m7679(iM5206);
        }
        materialCalendar.f10598.setText(c3946.m7679(iM5206).m7676());
        materialCalendar.m7662(iM5206);
    }

    @Override // androidx.recyclerview.widget.AbstractC3366
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo5459(RecyclerView recyclerView, int i) {
        MaterialCalendar materialCalendar;
        C3285 c3285;
        if (i != 0 || (c3285 = (materialCalendar = this.f10709).f10596) == null) {
            return;
        }
        View viewMo5379 = c3285.mo5379((LinearLayoutManager) materialCalendar.f10602.getLayoutManager());
        if (viewMo5379 != null) {
            AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(viewMo5379);
            int absoluteAdapterPosition = abstractC3317M5249 != null ? abstractC3317M5249.getAbsoluteAdapterPosition() : -1;
            if (absoluteAdapterPosition != -1) {
                C3946 c3946 = this.f10710;
                materialCalendar.f10603 = c3946.m7679(absoluteAdapterPosition);
                materialCalendar.f10598.setText(c3946.m7679(absoluteAdapterPosition).m7676());
                materialCalendar.m7662(absoluteAdapterPosition);
            }
        }
        materialCalendar.m7663();
    }
}
