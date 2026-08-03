package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import io.github.cherrywechat.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: Bc */
/* JADX INFO: loaded from: classes.dex */
public final class C0062Bc extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final Calendar f143a;

    /* JADX INFO: renamed from: b */
    public final int f144b;

    /* JADX INFO: renamed from: c */
    public final int f145c;

    public C0062Bc() {
        Calendar calendarM4845c = AbstractC2407qD.m4845c(null);
        this.f143a = calendarM4845c;
        this.f144b = calendarM4845c.getMaximum(7);
        this.f145c = calendarM4845c.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f144b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f144b;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f145c;
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
        int i2 = i + this.f145c;
        int i3 = this.f144b;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f143a;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public C0062Bc(int i) {
        Calendar calendarM4845c = AbstractC2407qD.m4845c(null);
        this.f143a = calendarM4845c;
        this.f144b = calendarM4845c.getMaximum(7);
        this.f145c = i;
    }
}
