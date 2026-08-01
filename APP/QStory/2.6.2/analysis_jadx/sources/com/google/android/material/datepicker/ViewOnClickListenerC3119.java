package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3119 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3111 f10300;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10301;

    public ViewOnClickListenerC3119(C3111 c3111, int i) {
        this.f10300 = c3111;
        this.f10301 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f10300.f10275;
        Month monthM7128 = Month.m7128(this.f10301, materialCalendar.f10253.f10266);
        CalendarConstraints calendarConstraints = materialCalendar.f10258;
        Month month = calendarConstraints.f10233;
        Month month2 = calendarConstraints.f10235;
        Calendar calendar = monthM7128.f10268;
        if (calendar.compareTo(month2.f10268) < 0) {
            monthM7128 = month2;
        } else if (calendar.compareTo(month.f10268) > 0) {
            monthM7128 = month;
        }
        materialCalendar.m7120(monthM7128);
        materialCalendar.m7119(MaterialCalendar.CalendarSelector.DAY);
        MaterialButton materialButton = materialCalendar.f10248;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }
}
