package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3980 extends BaseAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f10728;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f10729;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Calendar f10730;

    public C3980() {
        Calendar calendarM7694 = AbstractC3953.m7694(null);
        this.f10730 = calendarM7694;
        this.f10729 = calendarM7694.getMaximum(7);
        this.f10728 = calendarM7694.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f10729;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f10729;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f10728;
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
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C0328R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.f10728;
        int i3 = this.f10729;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f10730;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C0328R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C3980(int i) {
        Calendar calendarM7694 = AbstractC3953.m7694(null);
        this.f10730 = calendarM7694;
        this.f10729 = calendarM7694.getMaximum(7);
        this.f10728 = i;
    }
}
