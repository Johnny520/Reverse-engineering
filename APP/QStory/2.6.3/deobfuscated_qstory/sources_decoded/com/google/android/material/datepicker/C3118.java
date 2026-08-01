package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0191;
import androidx.core.util.C2187;
import androidx.recyclerview.widget.C2492;
import com.davemorrissey.labs.subscaleview.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3118 extends BaseAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final DayViewDecorator f10298;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final CalendarConstraints f10299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C2492 f10300;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Collection f10301;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DateSelector f10302;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Month f10303;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int f10297 = AbstractC3121.m7135(null).getMaximum(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int f10296 = (AbstractC3121.m7135(null).getMaximum(7) + AbstractC3121.m7135(null).getMaximum(5)) - 1;

    public C3118(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f10303 = month;
        this.f10302 = dateSelector;
        this.f10299 = calendarConstraints;
        this.f10298 = dayViewDecorator;
        this.f10301 = dateSelector.mo7098();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f10296;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f10303.f10268;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            androidx.recyclerview.widget.飘花落叶言子楪世兰哲苏 r1 = r5.f10300
            if (r1 != 0) goto Lf
            androidx.recyclerview.widget.飘花落叶言子楪世兰哲苏 r1 = new androidx.recyclerview.widget.飘花落叶言子楪世兰哲苏
            r1.<init>(r0)
            r5.f10300 = r1
        Lf:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L27
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 604766401(0x240c00c1, float:3.03583E-17)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r7 = r5.m7124()
            int r7 = r6 - r7
            if (r7 < 0) goto L5d
            com.google.android.material.datepicker.Month r8 = r5.f10303
            int r2 = r8.f10267
            if (r7 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L66
        L5d:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L66:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L6d
            return r0
        L6d:
            long r1 = r6.longValue()
            r5.m7128(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C3118.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m7121() {
        return (m7124() + this.f10303.f10267) - 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m7122(int i) {
        Long item = getItem(i);
        return item != null && this.f10299.f10239.mo7091(item.longValue());
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < m7124() || i > m7121()) {
            return null;
        }
        int iM7124 = (i - m7124()) + 1;
        Calendar calendarM7132 = AbstractC3121.m7132(this.f10303.f10273);
        calendarM7132.set(5, iM7124);
        return Long.valueOf(calendarM7132.getTimeInMillis());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m7124() {
        int firstDayOfWeek = this.f10299.f10234;
        Month month = this.f10303;
        Calendar calendar = month.f10273;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + month.f10268 : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m7125(int i) {
        do {
            i--;
            if (i < m7124()) {
                return -1;
            }
        } while (!m7122(i));
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m7126(int i) {
        do {
            i++;
            if (i > m7121()) {
                return -1;
            }
        } while (!m7122(i));
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m7127(MaterialCalendarGridView materialCalendarGridView, long j) {
        Month monthM7114 = Month.m7114(j);
        Month month = this.f10303;
        if (monthM7114.equals(month)) {
            Calendar calendarM7132 = AbstractC3121.m7132(month.f10273);
            calendarM7132.setTimeInMillis(j);
            int i = calendarM7132.get(5);
            m7128((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.m7113().m7124() + (i - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7128(TextView textView, long j, int i) {
        boolean z;
        boolean z2;
        C0191 c0191;
        boolean z3;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z4 = AbstractC3121.m7129().getTimeInMillis() == j;
        DateSelector dateSelector = this.f10302;
        Iterator it = dateSelector.mo7101().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Object obj = ((C2187) it.next()).f6460;
            if (obj != null && ((Long) obj).longValue() == j) {
                z = true;
                break;
            }
        }
        Iterator it2 = dateSelector.mo7101().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            Object obj2 = ((C2187) it2.next()).f6459;
            if (obj2 != null && ((Long) obj2).longValue() == j) {
                z2 = true;
                break;
            }
        }
        Calendar calendarM7129 = AbstractC3121.m7129();
        Calendar calendarM7135 = AbstractC3121.m7135(null);
        calendarM7135.setTimeInMillis(j);
        String str = calendarM7129.get(1) == calendarM7135.get(1) ? AbstractC3121.m7133("MMMMEEEEd", Locale.getDefault()).format(new Date(j)) : AbstractC3121.m7133("yMMMMEEEEd", Locale.getDefault()).format(new Date(j));
        if (z4) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        if (z) {
            str = String.format(context.getString(R.string.mtrl_picker_start_date_description), str);
        } else if (z2) {
            str = String.format(context.getString(R.string.mtrl_picker_end_date_description), str);
        }
        textView.setContentDescription(str);
        if (this.f10299.f10239.mo7091(j)) {
            textView.setEnabled(true);
            Iterator it3 = dateSelector.mo7098().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                } else {
                    if (AbstractC3121.m7134(j) == AbstractC3121.m7134(((Long) it3.next()).longValue())) {
                        z3 = true;
                        break;
                    }
                }
            }
            textView.setSelected(z3);
            if (z3) {
                c0191 = (C0191) this.f10300.f7461;
            } else {
                boolean z5 = AbstractC3121.m7129().getTimeInMillis() == j;
                C2492 c2492 = this.f10300;
                c0191 = z5 ? (C0191) c2492.f7460 : (C0191) c2492.f7462;
            }
        } else {
            textView.setEnabled(false);
            c0191 = (C0191) this.f10300.f7464;
        }
        if (this.f10298 == null || i == -1) {
            c0191.m656(textView);
            return;
        }
        int i2 = this.f10303.f10272;
        c0191.m656(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(str);
    }
}
