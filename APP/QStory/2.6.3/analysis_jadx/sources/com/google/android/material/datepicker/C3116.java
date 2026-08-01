package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3116 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3114 f10292;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendarGridView f10293;

    public C3116(C3114 c3114, MaterialCalendarGridView materialCalendarGridView) {
        this.f10292 = c3114;
        this.f10293 = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f10293;
        C3118 c3118M7113 = materialCalendarGridView.m7113();
        if (i < c3118M7113.m7124() || i > c3118M7113.m7121()) {
            return;
        }
        C3138 c3138 = this.f10292.f10286;
        long jLongValue = materialCalendarGridView.m7113().getItem(i).longValue();
        MaterialCalendar materialCalendar = c3138.f10359;
        if (materialCalendar.f10263.f10239.mo7091(jLongValue)) {
            materialCalendar.f10260.mo7093(jLongValue);
            Iterator it = materialCalendar.f10281.iterator();
            while (it.hasNext()) {
                ((C3135) it.next()).m7139(materialCalendar.f10260.mo7097());
            }
            materialCalendar.f10257.getAdapter().m4791();
            RecyclerView recyclerView = materialCalendar.f10254;
            if (recyclerView != null) {
                recyclerView.getAdapter().m4791();
            }
        }
    }
}
