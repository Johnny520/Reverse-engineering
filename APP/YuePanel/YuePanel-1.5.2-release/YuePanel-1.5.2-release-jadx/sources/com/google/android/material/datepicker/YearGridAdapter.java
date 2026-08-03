package com.google.android.material.datepicker;

import Yue.InterfaceC6391;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C1980R;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.timepicker.TimeModel;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class YearGridAdapter extends RecyclerView.AbstractC8909<ViewHolder> {
    private final MaterialCalendar<?> materialCalendar;

    public static class ViewHolder extends RecyclerView.AbstractC8938 {
        final TextView textView;

        public ViewHolder(TextView textView) {
            super(textView);
            this.textView = textView;
        }
    }

    public YearGridAdapter(MaterialCalendar<?> materialCalendar) {
        this.materialCalendar = materialCalendar;
    }

    @InterfaceC6391
    private View.OnClickListener createYearClickListener(final int i) {
        return new View.OnClickListener() { // from class: com.google.android.material.datepicker.YearGridAdapter.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                YearGridAdapter.this.materialCalendar.setCurrentMonth(YearGridAdapter.this.materialCalendar.getCalendarConstraints().clamp(Month.create(i, YearGridAdapter.this.materialCalendar.getCurrentMonth().month)));
                YearGridAdapter.this.materialCalendar.setSelector(MaterialCalendar.CalendarSelector.DAY);
            }
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    public int getItemCount() {
        return this.materialCalendar.getCalendarConstraints().getYearSpan();
    }

    public int getPositionForYear(int i) {
        return i - this.materialCalendar.getCalendarConstraints().getStart().year;
    }

    public int getYearForPosition(int i) {
        return this.materialCalendar.getCalendarConstraints().getStart().year + i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    public void onBindViewHolder(@InterfaceC6391 ViewHolder viewHolder, int i) {
        int yearForPosition = getYearForPosition(i);
        viewHolder.textView.setText(String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(yearForPosition)));
        TextView textView = viewHolder.textView;
        textView.setContentDescription(DateStrings.getYearContentDescription(textView.getContext(), yearForPosition));
        CalendarStyle calendarStyle = this.materialCalendar.getCalendarStyle();
        Calendar todayCalendar = UtcDates.getTodayCalendar();
        CalendarItemStyle calendarItemStyle = todayCalendar.get(1) == yearForPosition ? calendarStyle.todayYear : calendarStyle.year;
        Iterator<Long> it = this.materialCalendar.getDateSelector().getSelectedDays().iterator();
        while (it.hasNext()) {
            todayCalendar.setTimeInMillis(it.next().longValue());
            if (todayCalendar.get(1) == yearForPosition) {
                calendarItemStyle = calendarStyle.selectedYear;
            }
        }
        calendarItemStyle.styleItem(viewHolder.textView);
        viewHolder.textView.setOnClickListener(createYearClickListener(yearForPosition));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ; */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    @InterfaceC6391
    public ViewHolder onCreateViewHolder(@InterfaceC6391 ViewGroup viewGroup, int i) {
        return new ViewHolder((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C1980R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
