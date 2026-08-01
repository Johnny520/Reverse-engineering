package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ljx.wechatmod.R;
import java.util.Calendar;
import p000.AbstractC0503mz;
import p000.C0200eu;
import p000.C0276gw;
import p000.C0313hw;
import p000.C0431l0;
import p000.C0476m8;
import p000.C0836vz;
import p000.i00;
import p000.z80;

/* JADX INFO: renamed from: com.google.android.material.datepicker.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0114c extends AbstractC0503mz {

    /* JADX INFO: renamed from: c */
    public final C0476m8 f1049c;

    /* JADX INFO: renamed from: d */
    public final C0431l0 f1050d;

    /* JADX INFO: renamed from: e */
    public final int f1051e;

    public C0114c(ContextThemeWrapper contextThemeWrapper, C0476m8 c0476m8, C0431l0 c0431l0) {
        C0276gw c0276gw = c0476m8.f3099a;
        C0276gw c0276gw2 = c0476m8.f3100b;
        C0276gw c0276gw3 = c0476m8.f3102d;
        if (c0276gw.f2060a.compareTo(c0276gw3.f2060a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c0276gw3.f2060a.compareTo(c0276gw2.f2060a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f1051e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * C0313hw.f2282d) + (C0200eu.m1020G(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f1049c = c0476m8;
        this.f1050d = c0431l0;
        if (this.f3196a.m1965a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f3197b = true;
    }

    @Override // p000.AbstractC0503mz
    /* JADX INFO: renamed from: a */
    public final int mo715a() {
        return this.f1049c.f3105g;
    }

    @Override // p000.AbstractC0503mz
    /* JADX INFO: renamed from: b */
    public final long mo716b(int i) {
        Calendar calendarM2819a = z80.m2819a(this.f1049c.f3099a.f2060a);
        calendarM2819a.add(2, i);
        calendarM2819a.set(5, 1);
        Calendar calendarM2819a2 = z80.m2819a(calendarM2819a);
        calendarM2819a2.get(2);
        calendarM2819a2.get(1);
        calendarM2819a2.getMaximum(7);
        calendarM2819a2.getActualMaximum(5);
        calendarM2819a2.getTimeInMillis();
        return calendarM2819a2.getTimeInMillis();
    }

    @Override // p000.AbstractC0503mz
    /* JADX INFO: renamed from: c */
    public final void mo717c(i00 i00Var, int i) {
        C0113b c0113b = (C0113b) i00Var;
        C0476m8 c0476m8 = this.f1049c;
        Calendar calendarM2819a = z80.m2819a(c0476m8.f3099a.f2060a);
        calendarM2819a.add(2, i);
        C0276gw c0276gw = new C0276gw(calendarM2819a);
        c0113b.f1047t.setText(c0276gw.m1343c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c0113b.f1048u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.m714a() == null || !c0276gw.equals(materialCalendarGridView.m714a().f2284a)) {
            new C0313hw(c0276gw, c0476m8);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.m714a().getClass();
        throw null;
    }

    @Override // p000.AbstractC0503mz
    /* JADX INFO: renamed from: d */
    public final i00 mo718d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C0200eu.m1020G(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C0113b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0836vz(-1, this.f1051e));
        return new C0113b(linearLayout, true);
    }
}
