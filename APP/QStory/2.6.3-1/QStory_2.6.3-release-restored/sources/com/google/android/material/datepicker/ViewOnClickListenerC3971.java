package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3971 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ MaterialCalendar f10705;

    public ViewOnClickListenerC3971(MaterialCalendar materialCalendar) {
        this.f10705 = materialCalendar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f10705;
        MaterialCalendar.CalendarSelector calendarSelector = materialCalendar.f10604;
        MaterialCalendar.CalendarSelector calendarSelector2 = MaterialCalendar.CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            materialCalendar.m7665(MaterialCalendar.CalendarSelector.DAY);
        } else if (calendarSelector == MaterialCalendar.CalendarSelector.DAY) {
            materialCalendar.m7665(calendarSelector2);
        }
        materialCalendar.m7664(materialCalendar.f7226);
    }
}
