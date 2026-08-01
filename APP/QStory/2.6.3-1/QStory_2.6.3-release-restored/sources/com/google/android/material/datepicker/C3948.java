package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3948 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3946 f10637;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendarGridView f10638;

    public C3948(C3946 c3946, MaterialCalendarGridView materialCalendarGridView) {
        this.f10637 = c3946;
        this.f10638 = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f10638;
        C3950 c3950M7672 = materialCalendarGridView.m7672();
        if (i < c3950M7672.m7683() || i > c3950M7672.m7680()) {
            return;
        }
        C3970 c3970 = this.f10637.f10631;
        long jLongValue = materialCalendarGridView.m7672().getItem(i).longValue();
        MaterialCalendar materialCalendar = c3970.f10704;
        if (materialCalendar.f10608.f10584.mo7650(jLongValue)) {
            materialCalendar.f10605.mo7652(jLongValue);
            Iterator it = materialCalendar.f10626.iterator();
            while (it.hasNext()) {
                ((C3967) it.next()).m7698(materialCalendar.f10605.mo7656());
            }
            materialCalendar.f10602.getAdapter().m5351();
            RecyclerView recyclerView = materialCalendar.f10599;
            if (recyclerView != null) {
                recyclerView.getAdapter().m5351();
            }
        }
    }
}
