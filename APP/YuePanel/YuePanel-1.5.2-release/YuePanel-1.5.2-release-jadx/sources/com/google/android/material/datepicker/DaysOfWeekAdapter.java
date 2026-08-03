package com.google.android.material.datepicker;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.C1980R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class DaysOfWeekAdapter extends BaseAdapter {
    private static final int CALENDAR_DAY_STYLE = 4;
    private static final int NARROW_FORMAT = 4;

    @InterfaceC6391
    private final Calendar calendar;
    private final int daysInWeek;
    private final int firstDayOfWeek;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DaysOfWeekAdapter() {
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        this.calendar = utcCalendar;
        this.daysInWeek = utcCalendar.getMaximum(7);
        this.firstDayOfWeek = utcCalendar.getFirstDayOfWeek();
    }

    private int positionToDayOfWeek(int i) {
        int i2 = i + this.firstDayOfWeek;
        int i3 = this.daysInWeek;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.daysInWeek;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @InterfaceC6490
    @SuppressLint({"WrongConstant"})
    public View getView(int i, @InterfaceC6490 View view, @InterfaceC6391 ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C1980R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.calendar.set(7, positionToDayOfWeek(i));
        textView.setText(this.calendar.getDisplayName(7, CALENDAR_DAY_STYLE, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C1980R.string.mtrl_picker_day_of_week_column_header), this.calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getItem(I)Ljava/lang/Object; */
    @Override // android.widget.Adapter
    @InterfaceC6490
    public Integer getItem(int i) {
        if (i >= this.daysInWeek) {
            return null;
        }
        return Integer.valueOf(positionToDayOfWeek(i));
    }

    public DaysOfWeekAdapter(int i) {
        Calendar utcCalendar = UtcDates.getUtcCalendar();
        this.calendar = utcCalendar;
        this.daysInWeek = utcCalendar.getMaximum(7);
        this.firstDayOfWeek = i;
    }
}
