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
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3117 extends BaseAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final DayViewDecorator f10293;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final CalendarConstraints f10294;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C2492 f10295;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Collection f10296;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DateSelector f10297;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Month f10298;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int f10292 = AbstractC3120.m7148(null).getMaximum(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int f10291 = (AbstractC3120.m7148(null).getMaximum(7) + AbstractC3120.m7148(null).getMaximum(5)) - 1;

    public C3117(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f10298 = month;
        this.f10297 = dateSelector;
        this.f10294 = calendarConstraints;
        this.f10293 = dayViewDecorator;
        this.f10296 = dateSelector.mo7112();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f10291;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f10298.f10263;
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
            androidx.recyclerview.widget.飘花落叶言子楪世兰哲苏 r1 = r5.f10295
            if (r1 != 0) goto Lf
            androidx.recyclerview.widget.飘花落叶言子楪世兰哲苏 r1 = new androidx.recyclerview.widget.飘花落叶言子楪世兰哲苏
            r1.<init>(r0)
            r5.f10295 = r1
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
            int r7 = r5.m7137()
            int r7 = r6 - r7
            if (r7 < 0) goto L5d
            com.google.android.material.datepicker.Month r8 = r5.f10298
            int r2 = r8.f10262
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
            r5.m7141(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C3117.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m7134() {
        return (m7137() + this.f10298.f10262) - 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m7135(int i) {
        Long item = getItem(i);
        return item != null && this.f10294.f10234.mo7104(item.longValue());
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < m7137() || i > m7134()) {
            return null;
        }
        int iM7137 = (i - m7137()) + 1;
        Calendar calendarM7145 = AbstractC3120.m7145(this.f10298.f10268);
        calendarM7145.set(5, iM7137);
        return Long.valueOf(calendarM7145.getTimeInMillis());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m7137() {
        int firstDayOfWeek = this.f10294.f10229;
        Month month = this.f10298;
        Calendar calendar = month.f10268;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + month.f10263 : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m7138(int i) {
        do {
            i--;
            if (i < m7137()) {
                return -1;
            }
        } while (!m7135(i));
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m7139(int i) {
        do {
            i++;
            if (i > m7134()) {
                return -1;
            }
        } while (!m7135(i));
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m7140(MaterialCalendarGridView materialCalendarGridView, long j) {
        Month monthM7127 = Month.m7127(j);
        Month month = this.f10298;
        if (monthM7127.equals(month)) {
            Calendar calendarM7145 = AbstractC3120.m7145(month.f10268);
            calendarM7145.setTimeInMillis(j);
            int i = calendarM7145.get(5);
            m7141((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.m7126().m7137() + (i - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7141(TextView textView, long j, int i) {
        boolean z;
        boolean z2;
        C0191 c0191;
        boolean z3;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z4 = AbstractC3120.m7142().getTimeInMillis() == j;
        DateSelector dateSelector = this.f10297;
        Iterator it = dateSelector.mo7114().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Object obj = ((C2187) it.next()).f6459;
            if (obj != null && ((Long) obj).longValue() == j) {
                z = true;
                break;
            }
        }
        Iterator it2 = dateSelector.mo7114().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            Object obj2 = ((C2187) it2.next()).f6458;
            if (obj2 != null && ((Long) obj2).longValue() == j) {
                z2 = true;
                break;
            }
        }
        Calendar calendarM7142 = AbstractC3120.m7142();
        Calendar calendarM7148 = AbstractC3120.m7148(null);
        calendarM7148.setTimeInMillis(j);
        String str = calendarM7142.get(1) == calendarM7148.get(1) ? AbstractC3120.m7146("MMMMEEEEd", Locale.getDefault()).format(new Date(j)) : AbstractC3120.m7146("yMMMMEEEEd", Locale.getDefault()).format(new Date(j));
        if (z4) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        if (z) {
            str = String.format(context.getString(R.string.mtrl_picker_start_date_description), str);
        } else if (z2) {
            str = String.format(context.getString(R.string.mtrl_picker_end_date_description), str);
        }
        textView.setContentDescription(str);
        if (this.f10294.f10234.mo7104(j)) {
            textView.setEnabled(true);
            Iterator it3 = dateSelector.mo7112().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                } else {
                    if (AbstractC3120.m7147(j) == AbstractC3120.m7147(((Long) it3.next()).longValue())) {
                        z3 = true;
                        break;
                    }
                }
            }
            textView.setSelected(z3);
            if (z3) {
                c0191 = (C0191) this.f10295.f7460;
            } else {
                boolean z5 = AbstractC3120.m7142().getTimeInMillis() == j;
                C2492 c2492 = this.f10295;
                c0191 = z5 ? (C0191) c2492.f7459 : (C0191) c2492.f7461;
            }
        } else {
            textView.setEnabled(false);
            c0191 = (C0191) this.f10295.f7463;
        }
        if (this.f10293 == null || i == -1) {
            c0191.m655(textView);
            return;
        }
        int i2 = this.f10298.f10267;
        c0191.m655(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(str);
    }
}
