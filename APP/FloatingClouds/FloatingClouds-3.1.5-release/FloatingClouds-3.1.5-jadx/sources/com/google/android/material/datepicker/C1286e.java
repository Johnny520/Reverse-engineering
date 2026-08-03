package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.C1247R;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p000a.AbstractC0169J4;
import p000a.C0041C2;
import p000a.C0059D2;
import p000a.C0467Zf;
import p000a.C0729nc;
import p000a.C0842tb;
import p000a.InterfaceC0151I4;

/* JADX INFO: renamed from: com.google.android.material.datepicker.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1286e extends BaseAdapter {

    /* JADX INFO: renamed from: g */
    public static final int f5743g = C0467Zf.m1139e(null).getMaximum(4);

    /* JADX INFO: renamed from: h */
    public static final int f5744h = (C0467Zf.m1139e(null).getMaximum(7) + C0467Zf.m1139e(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: a */
    public final C0842tb f5745a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0151I4<?> f5746b;

    /* JADX INFO: renamed from: c */
    public Collection<Long> f5747c;

    /* JADX INFO: renamed from: d */
    public C0059D2 f5748d;

    /* JADX INFO: renamed from: e */
    public final C1282a f5749e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0169J4 f5750f;

    public C1286e(C0842tb c0842tb, InterfaceC0151I4<?> interfaceC0151I4, C1282a c1282a, AbstractC0169J4 abstractC0169J4) {
        this.f5745a = c0842tb;
        this.f5746b = interfaceC0151I4;
        this.f5749e = c1282a;
        this.f5750f = abstractC0169J4;
        this.f5747c = interfaceC0151I4.m431j();
    }

    /* JADX INFO: renamed from: b */
    public final int m3222b() {
        int firstDayOfWeek = this.f5749e.f5684e;
        C0842tb c0842tb = this.f5745a;
        Calendar calendar = c0842tb.f3312a;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + c0842tb.f3315d : i2;
    }

    /* JADX DEBUG: Method merged with bridge method: getItem(I)Ljava/lang/Object; */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < m3222b() || i > m3224d()) {
            return null;
        }
        int iM3222b = (i - m3222b()) + 1;
        Calendar calendarM1137c = C0467Zf.m1137c(this.f5745a.f3312a);
        calendarM1137c.set(5, iM3222b);
        return Long.valueOf(calendarM1137c.getTimeInMillis());
    }

    /* JADX INFO: renamed from: d */
    public final int m3224d() {
        return (m3222b() + this.f5745a.f3316e) - 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m3225e(TextView textView, long j, int i) {
        C0041C2 c0041c2;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z = false;
        boolean z2 = C0467Zf.m1138d().getTimeInMillis() == j;
        InterfaceC0151I4<?> interfaceC0151I4 = this.f5746b;
        Iterator<C0729nc<Long, Long>> it = interfaceC0151I4.m427e().iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw null;
        }
        Iterator<C0729nc<Long, Long>> it2 = interfaceC0151I4.m427e().iterator();
        if (it2.hasNext()) {
            it2.next().getClass();
            throw null;
        }
        Calendar calendarM1138d = C0467Zf.m1138d();
        Calendar calendarM1139e = C0467Zf.m1139e(null);
        calendarM1139e.setTimeInMillis(j);
        String str = calendarM1138d.get(1) == calendarM1139e.get(1) ? C0467Zf.m1136b("MMMMEEEEd", Locale.getDefault()).format(new Date(j)) : C0467Zf.m1136b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j));
        if (z2) {
            str = String.format(context.getString(C1247R.string.mtrl_picker_today_description), str);
        }
        textView.setContentDescription(str);
        if (this.f5749e.f5682c.mo3214f(j)) {
            textView.setEnabled(true);
            Iterator<Long> it3 = interfaceC0151I4.m431j().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (C0467Zf.m1135a(j) == C0467Zf.m1135a(it3.next().longValue())) {
                    z = true;
                    break;
                }
            }
            textView.setSelected(z);
            c0041c2 = z ? this.f5748d.f203b : C0467Zf.m1138d().getTimeInMillis() == j ? this.f5748d.f204c : this.f5748d.f202a;
        } else {
            textView.setEnabled(false);
            c0041c2 = this.f5748d.f208g;
        }
        if (this.f5750f == null || i == -1) {
            c0041c2.m124b(textView);
            return;
        }
        int i2 = this.f5745a.f3314c;
        c0041c2.m124b(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(str);
    }

    /* JADX INFO: renamed from: f */
    public final void m3226f(MaterialCalendarGridView materialCalendarGridView, long j) {
        C0842tb c0842tbM1965l = C0842tb.m1965l(j);
        C0842tb c0842tb = this.f5745a;
        if (c0842tbM1965l.equals(c0842tb)) {
            Calendar calendarM1137c = C0467Zf.m1137c(c0842tb.f3312a);
            calendarM1137c.setTimeInMillis(j);
            int i = calendarM1137c.get(5);
            m3225e((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.m3212a().m3222b() + (i - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j, i);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f5744h;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f5745a.f3315d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        Context context = viewGroup.getContext();
        if (this.f5748d == null) {
            this.f5748d = new C0059D2(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C1247R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iM3222b = i - m3222b();
        if (iM3222b >= 0) {
            C0842tb c0842tb = this.f5745a;
            if (iM3222b >= c0842tb.f3316e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i2 = -1;
            } else {
                i2 = iM3222b + 1;
                textView.setTag(c0842tb);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        }
        Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        m3225e(textView, item.longValue(), i2);
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
