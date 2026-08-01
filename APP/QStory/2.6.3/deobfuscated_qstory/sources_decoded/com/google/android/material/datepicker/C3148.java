package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.davemorrissey.labs.subscaleview.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3148 extends BaseAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f10383;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f10384;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Calendar f10385;

    public C3148() {
        Calendar calendarM7135 = AbstractC3121.m7135(null);
        this.f10385 = calendarM7135;
        this.f10384 = calendarM7135.getMaximum(7);
        this.f10383 = calendarM7135.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f10384;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f10384;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f10383;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.f10383;
        int i3 = this.f10384;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f10385;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C3148(int i) {
        Calendar calendarM7135 = AbstractC3121.m7135(null);
        this.f10385 = calendarM7135;
        this.f10384 = calendarM7135.getMaximum(7);
        this.f10383 = i;
    }
}
