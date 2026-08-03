package com.google.android.material.datepicker;

import Yue.C8273;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C1980R;
import com.google.android.material.datepicker.MaterialCalendar;

/* JADX INFO: loaded from: classes.dex */
class MonthsPagerAdapter extends RecyclerView.AbstractC8909<ViewHolder> {

    @InterfaceC6391
    private final CalendarConstraints calendarConstraints;
    private final DateSelector<?> dateSelector;

    @InterfaceC6490
    private final DayViewDecorator dayViewDecorator;
    private final int itemHeight;
    private final MaterialCalendar.OnDayClickListener onDayClickListener;

    public static class ViewHolder extends RecyclerView.AbstractC8938 {
        final MaterialCalendarGridView monthGrid;
        final TextView monthTitle;

        public ViewHolder(@InterfaceC6391 LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C1980R.id.month_title);
            this.monthTitle = textView;
            C8273.m27440(textView, true);
            this.monthGrid = (MaterialCalendarGridView) linearLayout.findViewById(C1980R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public MonthsPagerAdapter(@InterfaceC6391 Context context, DateSelector<?> dateSelector, @InterfaceC6391 CalendarConstraints calendarConstraints, @InterfaceC6490 DayViewDecorator dayViewDecorator, MaterialCalendar.OnDayClickListener onDayClickListener) {
        Month start = calendarConstraints.getStart();
        Month end = calendarConstraints.getEnd();
        Month openAt = calendarConstraints.getOpenAt();
        if (start.compareTo(openAt) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (openAt.compareTo(end) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.itemHeight = (MonthAdapter.MAXIMUM_WEEKS * MaterialCalendar.getDayHeight(context)) + (MaterialDatePicker.isFullscreen(context) ? MaterialCalendar.getDayHeight(context) : 0);
        this.calendarConstraints = calendarConstraints;
        this.dateSelector = dateSelector;
        this.dayViewDecorator = dayViewDecorator;
        this.onDayClickListener = onDayClickListener;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    public int getItemCount() {
        return this.calendarConstraints.getMonthSpan();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    public long getItemId(int i) {
        return this.calendarConstraints.getStart().monthsLater(i).getStableId();
    }

    @InterfaceC6391
    public Month getPageMonth(int i) {
        return this.calendarConstraints.getStart().monthsLater(i);
    }

    @InterfaceC6391
    public CharSequence getPageTitle(int i) {
        return getPageMonth(i).getLongName();
    }

    public int getPosition(@InterfaceC6391 Month month) {
        return this.calendarConstraints.getStart().monthsUntil(month);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;I)V */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    public void onBindViewHolder(@InterfaceC6391 ViewHolder viewHolder, int i) {
        Month monthMonthsLater = this.calendarConstraints.getStart().monthsLater(i);
        viewHolder.monthTitle.setText(monthMonthsLater.getLongName());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder.monthGrid.findViewById(C1980R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !monthMonthsLater.equals(materialCalendarGridView.getAdapter().month)) {
            MonthAdapter monthAdapter = new MonthAdapter(monthMonthsLater, this.dateSelector, this.calendarConstraints, this.dayViewDecorator);
            materialCalendarGridView.setNumColumns(monthMonthsLater.daysInWeek);
            materialCalendarGridView.setAdapter((ListAdapter) monthAdapter);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().updateSelectedStates(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.datepicker.MonthsPagerAdapter.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                if (materialCalendarGridView.getAdapter().withinMonth(i2)) {
                    MonthsPagerAdapter.this.onDayClickListener.onDayClick(materialCalendarGridView.getAdapter().getItem(i2).longValue());
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ; */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8909
    @InterfaceC6391
    public ViewHolder onCreateViewHolder(@InterfaceC6391 ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C1980R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.isFullscreen(viewGroup.getContext())) {
            return new ViewHolder(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C8922(-1, this.itemHeight));
        return new ViewHolder(linearLayout, true);
    }
}
