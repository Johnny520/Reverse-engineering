package p000a;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.C1247R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: a.K4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0187K4 extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final Calendar f651a;

    /* JADX INFO: renamed from: b */
    public final int f652b;

    /* JADX INFO: renamed from: c */
    public final int f653c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0187K4() {
        Calendar calendarM1139e = C0467Zf.m1139e(null);
        this.f651a = calendarM1139e;
        this.f652b = calendarM1139e.getMaximum(7);
        this.f653c = calendarM1139e.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f652b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f652b;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f653c;
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
    @SuppressLint({"WrongConstant"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C1247R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.f653c;
        int i3 = this.f652b;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f651a;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C1247R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C0187K4(int i) {
        Calendar calendarM1139e = C0467Zf.m1139e(null);
        this.f651a = calendarM1139e;
        this.f652b = calendarM1139e.getMaximum(7);
        this.f653c = i;
    }
}
