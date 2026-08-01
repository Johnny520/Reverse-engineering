package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C1038;
import androidx.core.util.C3020;
import androidx.recyclerview.widget.C3325;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3950 extends BaseAdapter {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final DayViewDecorator f10643;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final CalendarConstraints f10644;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C3325 f10645;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Collection f10646;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DateSelector f10647;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Month f10648;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final int f10642 = AbstractC3953.m7694(null).getMaximum(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final int f10641 = (AbstractC3953.m7694(null).getMaximum(7) + AbstractC3953.m7694(null).getMaximum(5)) - 1;

    public C3950(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f10648 = month;
        this.f10647 = dateSelector;
        this.f10644 = calendarConstraints;
        this.f10643 = dayViewDecorator;
        this.f10646 = dateSelector.mo7657();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f10641;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f10648.f10613;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        Context context = viewGroup.getContext();
        if (this.f10645 == null) {
            this.f10645 = new C3325(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C0328R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iM7683 = i - m7683();
        if (iM7683 >= 0) {
            Month month = this.f10648;
            if (iM7683 >= month.f10612) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i2 = -1;
            } else {
                i2 = iM7683 + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        }
        Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        m7687(textView, item.longValue(), i2);
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int m7680() {
        return (m7683() + this.f10648.f10612) - 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m7681(int i) {
        Long item = getItem(i);
        return item != null && this.f10644.f10584.mo7650(item.longValue());
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < m7683() || i > m7680()) {
            return null;
        }
        int iM7683 = (i - m7683()) + 1;
        Calendar calendarM7691 = AbstractC3953.m7691(this.f10648.f10618);
        calendarM7691.set(5, iM7683);
        return Long.valueOf(calendarM7691.getTimeInMillis());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m7683() {
        int firstDayOfWeek = this.f10644.f10579;
        Month month = this.f10648;
        Calendar calendar = month.f10618;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + month.f10613 : i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m7684(int i) {
        do {
            i--;
            if (i < m7683()) {
                return -1;
            }
        } while (!m7681(i));
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m7685(int i) {
        do {
            i++;
            if (i > m7680()) {
                return -1;
            }
        } while (!m7681(i));
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m7686(MaterialCalendarGridView materialCalendarGridView, long j) {
        Month monthM7673 = Month.m7673(j);
        Month month = this.f10648;
        if (monthM7673.equals(month)) {
            Calendar calendarM7691 = AbstractC3953.m7691(month.f10618);
            calendarM7691.setTimeInMillis(j);
            int i = calendarM7691.get(5);
            m7687((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.m7672().m7683() + (i - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m7687(TextView textView, long j, int i) {
        boolean z;
        boolean z2;
        C1038 c1038;
        boolean z3;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z4 = AbstractC3953.m7688().getTimeInMillis() == j;
        DateSelector dateSelector = this.f10647;
        Iterator it = dateSelector.mo7660().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Object obj = ((C3020) it.next()).f6805;
            if (obj != null && ((Long) obj).longValue() == j) {
                z = true;
                break;
            }
        }
        Iterator it2 = dateSelector.mo7660().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            Object obj2 = ((C3020) it2.next()).f6804;
            if (obj2 != null && ((Long) obj2).longValue() == j) {
                z2 = true;
                break;
            }
        }
        Calendar calendarM7688 = AbstractC3953.m7688();
        Calendar calendarM7694 = AbstractC3953.m7694(null);
        calendarM7694.setTimeInMillis(j);
        String str = calendarM7688.get(1) == calendarM7694.get(1) ? AbstractC3953.m7692("MMMMEEEEd", Locale.getDefault()).format(new Date(j)) : AbstractC3953.m7692("yMMMMEEEEd", Locale.getDefault()).format(new Date(j));
        if (z4) {
            str = String.format(context.getString(C0328R.string.mtrl_picker_today_description), str);
        }
        if (z) {
            str = String.format(context.getString(C0328R.string.mtrl_picker_start_date_description), str);
        } else if (z2) {
            str = String.format(context.getString(C0328R.string.mtrl_picker_end_date_description), str);
        }
        textView.setContentDescription(str);
        if (this.f10644.f10584.mo7650(j)) {
            textView.setEnabled(true);
            Iterator it3 = dateSelector.mo7657().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                } else {
                    if (AbstractC3953.m7693(j) == AbstractC3953.m7693(((Long) it3.next()).longValue())) {
                        z3 = true;
                        break;
                    }
                }
            }
            textView.setSelected(z3);
            if (z3) {
                c1038 = (C1038) this.f10645.f7806;
            } else {
                boolean z5 = AbstractC3953.m7688().getTimeInMillis() == j;
                C3325 c3325 = this.f10645;
                c1038 = z5 ? (C1038) c3325.f7805 : (C1038) c3325.f7807;
            }
        } else {
            textView.setEnabled(false);
            c1038 = (C1038) this.f10645.f7809;
        }
        if (this.f10643 == null || i == -1) {
            c1038.m1216(textView);
            return;
        }
        int i2 = this.f10648.f10617;
        c1038.m1216(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(str);
    }
}
