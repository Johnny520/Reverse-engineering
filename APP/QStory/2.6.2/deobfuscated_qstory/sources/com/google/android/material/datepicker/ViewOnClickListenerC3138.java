package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3138 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendar f10355;

    public ViewOnClickListenerC3138(MaterialCalendar materialCalendar) {
        this.f10355 = materialCalendar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f10355;
        MaterialCalendar.CalendarSelector calendarSelector = materialCalendar.f10254;
        MaterialCalendar.CalendarSelector calendarSelector2 = MaterialCalendar.CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            materialCalendar.m7119(MaterialCalendar.CalendarSelector.DAY);
        } else if (calendarSelector == MaterialCalendar.CalendarSelector.DAY) {
            materialCalendar.m7119(calendarSelector2);
        }
        materialCalendar.m7118(materialCalendar.f6880);
    }
}
