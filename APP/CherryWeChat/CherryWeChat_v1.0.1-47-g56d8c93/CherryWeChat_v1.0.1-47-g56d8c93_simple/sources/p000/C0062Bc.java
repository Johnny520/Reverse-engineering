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
        Calendar r0 = AbstractC2407qD.m4845c(null);
        this.f143a = r0;
        this.f144b = r0.getMaximum(7);
        this.f145c = r0.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f144b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int r3) {
        int r0 = this.f144b;
        if (r3 < r0) goto L6;
        return null;
    L6:
        int r32 = r3 + this.f145c;
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
        int r42 = r4 + this.f145c;
        int r52 = this.f144b;
        if (r42 <= r52) goto L8;
        r42 = r42 - r52;
    L8:
        Calendar r53 = this.f143a;
        r53.set(7, r42);
        r0.setText(r53.getDisplayName(7, 4, r0.getResources().getConfiguration().locale));
        r0.setContentDescription(String.format(r6.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), new Object[]{r53.getDisplayName(7, 2, Locale.getDefault())}));
        return r0;
    }

    public C0062Bc(int r3) {
        Calendar r0 = AbstractC2407qD.m4845c(null);
        this.f143a = r0;
        this.f144b = r0.getMaximum(7);
        this.f145c = r3;
    }
}
