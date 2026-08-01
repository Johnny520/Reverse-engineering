package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ljx.wechatmod.R;
import java.util.Calendar;
import p000.AbstractC0242fz;
import p000.C0046aw;
import p000.C0081bu;
import p000.C0095c8;
import p000.C0431l0;
import p000.C0577oz;
import p000.C0981zv;
import p000.b00;
import p000.u80;

/* JADX INFO: renamed from: com.google.android.material.datepicker.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0114c extends AbstractC0242fz {

    /* JADX INFO: renamed from: c */
    public final C0095c8 f1124c;

    /* JADX INFO: renamed from: d */
    public final C0431l0 f1125d;

    /* JADX INFO: renamed from: e */
    public final int f1126e;

    public C0114c(ContextThemeWrapper contextThemeWrapper, C0095c8 c0095c8, C0431l0 c0431l0) {
        C0981zv c0981zv = c0095c8.f909a;
        C0981zv c0981zv2 = c0095c8.f910b;
        C0981zv c0981zv3 = c0095c8.f912d;
        if (c0981zv.f5619a.compareTo(c0981zv3.f5619a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c0981zv3.f5619a.compareTo(c0981zv2.f5619a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f1126e = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * C0046aw.f688d) + (C0081bu.m571G(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f1124c = c0095c8;
        this.f1125d = c0431l0;
        if (this.f1997a.m1334a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f1998b = true;
    }

    @Override // p000.AbstractC0242fz
    /* JADX INFO: renamed from: a */
    public final int mo757a() {
        return this.f1124c.f915g;
    }

    @Override // p000.AbstractC0242fz
    /* JADX INFO: renamed from: b */
    public final long mo758b(int i) {
        Calendar calendarM2426a = u80.m2426a(this.f1124c.f909a.f5619a);
        calendarM2426a.add(2, i);
        calendarM2426a.set(5, 1);
        Calendar calendarM2426a2 = u80.m2426a(calendarM2426a);
        calendarM2426a2.get(2);
        calendarM2426a2.get(1);
        calendarM2426a2.getMaximum(7);
        calendarM2426a2.getActualMaximum(5);
        calendarM2426a2.getTimeInMillis();
        return calendarM2426a2.getTimeInMillis();
    }

    @Override // p000.AbstractC0242fz
    /* JADX INFO: renamed from: c */
    public final void mo759c(b00 b00Var, int i) {
        C0113b c0113b = (C0113b) b00Var;
        C0095c8 c0095c8 = this.f1124c;
        Calendar calendarM2426a = u80.m2426a(c0095c8.f909a.f5619a);
        calendarM2426a.add(2, i);
        C0981zv c0981zv = new C0981zv(calendarM2426a);
        c0113b.f1122t.setText(c0981zv.m2842c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c0113b.f1123u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.m756a() == null || !c0981zv.equals(materialCalendarGridView.m756a().f690a)) {
            new C0046aw(c0981zv, c0095c8);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.m756a().getClass();
        throw null;
    }

    @Override // p000.AbstractC0242fz
    /* JADX INFO: renamed from: d */
    public final b00 mo760d(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C0081bu.m571G(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C0113b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C0577oz(-1, this.f1126e));
        return new C0113b(linearLayout, true);
    }
}
