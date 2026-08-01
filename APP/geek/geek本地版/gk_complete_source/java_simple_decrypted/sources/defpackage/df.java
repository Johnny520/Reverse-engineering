package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class df extends BaseAdapter {
    public final Calendar a;
    public final int b;
    public final int c;

    public df() {
        Calendar r0 = u80.c(null);
        this.a = r0;
        this.b = r0.getMaximum(7);
        this.c = r0.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int r3) {
        int r0 = this.b;
        if (r3 < r0) goto L6;
        return null;
    L6:
        int r32 = r3 + this.c;
        if (r32 <= r0) goto L10;
        r32 = r32 - r0;
    L10:
        return Integer.valueOf(r32);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int r4, View r5, ViewGroup r6) {
        TextView r0 = (TextView) r5;
        if (r5 != null) goto L5;
        r0 = (TextView) LayoutInflater.from(r6.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, r6, false);
    L5:
        int r42 = r4 + this.c;
        int r52 = this.b;
        if (r42 <= r52) goto L8;
        r42 = r42 - r52;
    L8:
        Calendar r53 = this.a;
        r53.set(7, r42);
        r0.setText(r53.getDisplayName(7, 4, r0.getResources().getConfiguration().locale));
        r0.setContentDescription(String.format(r6.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), new Object[]{r53.getDisplayName(7, 2, Locale.getDefault())}));
        return r0;
    }

    public df(int r3) {
        Calendar r0 = u80.c(null);
        this.a = r0;
        this.b = r0.getMaximum(7);
        this.c = r3;
    }
}
