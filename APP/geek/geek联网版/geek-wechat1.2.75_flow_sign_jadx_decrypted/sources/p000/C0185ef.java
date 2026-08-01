package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: ef */
/* JADX INFO: loaded from: classes.dex */
public final class C0185ef extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final Calendar f1583a;

    /* JADX INFO: renamed from: b */
    public final int f1584b;

    /* JADX INFO: renamed from: c */
    public final int f1585c;

    public C0185ef() {
        Calendar calendarM2821c = z80.m2821c(null);
        this.f1583a = calendarM2821c;
        this.f1584b = calendarM2821c.getMaximum(7);
        this.f1585c = calendarM2821c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f1584b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f1584b;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f1585c;
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
        int i2 = i + this.f1585c;
        int i3 = this.f1584b;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f1583a;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C0185ef(int i) {
        Calendar calendarM2821c = z80.m2821c(null);
        this.f1583a = calendarM2821c;
        this.f1584b = calendarM2821c.getMaximum(7);
        this.f1585c = i;
    }
}
