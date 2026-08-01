package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3120 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3112 f10305;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10306;

    public ViewOnClickListenerC3120(C3112 c3112, int i) {
        this.f10305 = c3112;
        this.f10306 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f10305.f10280;
        Month monthM7115 = Month.m7115(this.f10306, materialCalendar.f10258.f10271);
        CalendarConstraints calendarConstraints = materialCalendar.f10263;
        Month month = calendarConstraints.f10238;
        Month month2 = calendarConstraints.f10240;
        Calendar calendar = monthM7115.f10273;
        if (calendar.compareTo(month2.f10273) < 0) {
            monthM7115 = month2;
        } else if (calendar.compareTo(month.f10273) > 0) {
            monthM7115 = month;
        }
        materialCalendar.m7107(monthM7115);
        materialCalendar.m7106(MaterialCalendar.CalendarSelector.DAY);
        MaterialButton materialButton = materialCalendar.f10253;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }
}
