package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3139 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendar f10360;

    public ViewOnClickListenerC3139(MaterialCalendar materialCalendar) {
        this.f10360 = materialCalendar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f10360;
        MaterialCalendar.CalendarSelector calendarSelector = materialCalendar.f10259;
        MaterialCalendar.CalendarSelector calendarSelector2 = MaterialCalendar.CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            materialCalendar.m7106(MaterialCalendar.CalendarSelector.DAY);
        } else if (calendarSelector == MaterialCalendar.CalendarSelector.DAY) {
            materialCalendar.m7106(calendarSelector2);
        }
        materialCalendar.m7105(materialCalendar.f6881);
    }
}
