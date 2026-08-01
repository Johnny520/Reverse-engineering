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
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3147 extends BaseAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f10378;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f10379;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Calendar f10380;

    public C3147() {
        Calendar calendarM7148 = AbstractC3120.m7148(null);
        this.f10380 = calendarM7148;
        this.f10379 = calendarM7148.getMaximum(7);
        this.f10378 = calendarM7148.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f10379;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f10379;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f10378;
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
        int i2 = i + this.f10378;
        int i3 = this.f10379;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f10380;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C3147(int i) {
        Calendar calendarM7148 = AbstractC3120.m7148(null);
        this.f10380 = calendarM7148;
        this.f10379 = calendarM7148.getMaximum(7);
        this.f10378 = i;
    }
}
