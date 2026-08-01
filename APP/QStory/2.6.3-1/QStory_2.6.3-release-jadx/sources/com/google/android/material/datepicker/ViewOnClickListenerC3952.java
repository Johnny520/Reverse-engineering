package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3952 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C3944 f10650;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f10651;

    public ViewOnClickListenerC3952(C3944 c3944, int i) {
        this.f10650 = c3944;
        this.f10651 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f10650.f10625;
        Month monthM7674 = Month.m7674(this.f10651, materialCalendar.f10603.f10616);
        CalendarConstraints calendarConstraints = materialCalendar.f10608;
        Month month = calendarConstraints.f10583;
        Month month2 = calendarConstraints.f10585;
        Calendar calendar = monthM7674.f10618;
        if (calendar.compareTo(month2.f10618) < 0) {
            monthM7674 = month2;
        } else if (calendar.compareTo(month.f10618) > 0) {
            monthM7674 = month;
        }
        materialCalendar.m7666(monthM7674);
        materialCalendar.m7665(MaterialCalendar.CalendarSelector.DAY);
        MaterialButton materialButton = materialCalendar.f10598;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }
}
