package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3115 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3113 f10287;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendarGridView f10288;

    public C3115(C3113 c3113, MaterialCalendarGridView materialCalendarGridView) {
        this.f10287 = c3113;
        this.f10288 = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.f10288;
        C3117 c3117M7126 = materialCalendarGridView.m7126();
        if (i < c3117M7126.m7137() || i > c3117M7126.m7134()) {
            return;
        }
        C3137 c3137 = this.f10287.f10281;
        long jLongValue = materialCalendarGridView.m7126().getItem(i).longValue();
        MaterialCalendar materialCalendar = c3137.f10354;
        if (materialCalendar.f10258.f10234.mo7104(jLongValue)) {
            materialCalendar.f10255.mo7106(jLongValue);
            Iterator it = materialCalendar.f10276.iterator();
            while (it.hasNext()) {
                ((C3134) it.next()).m7152(materialCalendar.f10255.mo7111());
            }
            materialCalendar.f10252.getAdapter().m4781();
            RecyclerView recyclerView = materialCalendar.f10249;
            if (recyclerView != null) {
                recyclerView.getAdapter().m4781();
            }
        }
    }
}
