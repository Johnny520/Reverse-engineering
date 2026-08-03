package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import io.github.cherrywechat.R;
import java.util.Calendar;

/* JADX INFO: renamed from: hs */
/* JADX INFO: loaded from: classes.dex */
public final class C1513hs extends BaseAdapter {

    /* JADX INFO: renamed from: d */
    public static final int f5357d = AbstractC2407qD.m4845c(null).getMaximum(4);

    /* JADX INFO: renamed from: e */
    public static final int f5358e = (AbstractC2407qD.m4845c(null).getMaximum(7) + AbstractC2407qD.m4845c(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: a */
    public final C1469gs f5359a;

    /* JADX INFO: renamed from: b */
    public C0649P3 f5360b;

    /* JADX INFO: renamed from: c */
    public final C0136D6 f5361c;

    public C1513hs(C1469gs c1469gs, C0136D6 c0136d6) {
        this.f5359a = c1469gs;
        this.f5361c = c0136d6;
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m2886a() {
        int firstDayOfWeek = this.f5361c.f353e;
        C1469gs c1469gs = this.f5359a;
        Calendar calendar = c1469gs.f5207a;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + c1469gs.f5210d : i2;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < m2886a() || i > m2888c()) {
            return null;
        }
        int iM2886a = (i - m2886a()) + 1;
        Calendar calendarM4843a = AbstractC2407qD.m4843a(this.f5359a.f5207a);
        calendarM4843a.set(5, iM2886a);
        return Long.valueOf(calendarM4843a.getTimeInMillis());
    }

    /* JADX INFO: renamed from: c */
    public final int m2888c() {
        return (m2886a() + this.f5359a.f5211e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f5358e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f5359a.f5210d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f5360b == null) {
            this.f5360b = new C0649P3(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iM2886a = i - m2886a();
        if (iM2886a >= 0) {
            C1469gs c1469gs = this.f5359a;
            if (iM2886a >= c1469gs.f5211e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(c1469gs);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iM2886a + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        }
        if (getItem(i) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        AbstractC2407qD.m4844b().getTimeInMillis();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
