package com.google.android.material.datepicker;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.C1066R;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C1247R;
import com.google.android.material.datepicker.C1284c;
import java.util.Calendar;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000a.AbstractC0169J4;
import p000a.C0181Jg;
import p000a.C0467Zf;
import p000a.C0842tb;
import p000a.C0847tg;
import p000a.C0866ug;
import p000a.InterfaceC0151I4;

/* JADX INFO: renamed from: com.google.android.material.datepicker.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1288g extends RecyclerView.AbstractC1167d<a> {

    /* JADX INFO: renamed from: d */
    public final C1282a f5753d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0151I4<?> f5754e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0169J4 f5755f;

    /* JADX INFO: renamed from: g */
    public final C1284c.c f5756g;

    /* JADX INFO: renamed from: h */
    public final int f5757h;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.g$a */
    public static class a extends RecyclerView.AbstractC1163A {

        /* JADX INFO: renamed from: u */
        public final TextView f5758u;

        /* JADX INFO: renamed from: v */
        public final MaterialCalendarGridView f5759v;

        public a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C1247R.id.month_title);
            this.f5758u = textView;
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            new C0847tg(C1066R.id.tag_accessibility_heading, Boolean.class, 0, 28).m2005c(textView, Boolean.TRUE);
            this.f5759v = (MaterialCalendarGridView) linearLayout.findViewById(C1247R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public C1288g(ContextThemeWrapper contextThemeWrapper, InterfaceC0151I4 interfaceC0151I4, C1282a c1282a, AbstractC0169J4 abstractC0169J4, C1284c.c cVar) {
        C0842tb c0842tb = c1282a.f5680a;
        C0842tb c0842tb2 = c1282a.f5683d;
        if (c0842tb.f3312a.compareTo(c0842tb2.f3312a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c0842tb2.f3312a.compareTo(c1282a.f5681b.f3312a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f5757h = (contextThemeWrapper.getResources().getDimensionPixelSize(C1247R.dimen.mtrl_calendar_day_height) * C1286e.f5743g) + (C1285d.m3218J(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(C1247R.dimen.mtrl_calendar_day_height) : 0);
        this.f5753d = c1282a;
        this.f5754e = interfaceC0151I4;
        this.f5755f = abstractC0169J4;
        this.f5756g = cVar;
        if (this.f4912a.m2814a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f4913b = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1167d
    /* JADX INFO: renamed from: a */
    public final int mo109a() {
        return this.f5753d.f5686g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1167d
    /* JADX INFO: renamed from: b */
    public final long mo2813b(int i) {
        Calendar calendarM1137c = C0467Zf.m1137c(this.f5753d.f5680a.f3312a);
        calendarM1137c.add(2, i);
        calendarM1137c.set(5, 1);
        Calendar calendarM1137c2 = C0467Zf.m1137c(calendarM1137c);
        calendarM1137c2.get(2);
        calendarM1137c2.get(1);
        calendarM1137c2.getMaximum(7);
        calendarM1137c2.getActualMaximum(5);
        calendarM1137c2.getTimeInMillis();
        return calendarM1137c2.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1167d
    /* JADX INFO: renamed from: d */
    public final void mo110d(RecyclerView.AbstractC1163A abstractC1163A, int i) {
        a aVar = (a) abstractC1163A;
        C1282a c1282a = this.f5753d;
        Calendar calendarM1137c = C0467Zf.m1137c(c1282a.f5680a.f3312a);
        calendarM1137c.add(2, i);
        C0842tb c0842tb = new C0842tb(calendarM1137c);
        aVar.f5758u.setText(c0842tb.m1966m());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f5759v.findViewById(C1247R.id.month_grid);
        if (materialCalendarGridView.m3212a() == null || !c0842tb.equals(materialCalendarGridView.m3212a().f5745a)) {
            C1286e c1286e = new C1286e(c0842tb, this.f5754e, c1282a, this.f5755f);
            materialCalendarGridView.setNumColumns(c0842tb.f3315d);
            materialCalendarGridView.setAdapter((ListAdapter) c1286e);
        } else {
            materialCalendarGridView.invalidate();
            C1286e c1286eM3212a = materialCalendarGridView.m3212a();
            Iterator<Long> it = c1286eM3212a.f5747c.iterator();
            while (it.hasNext()) {
                c1286eM3212a.m3226f(materialCalendarGridView, it.next().longValue());
            }
            InterfaceC0151I4<?> interfaceC0151I4 = c1286eM3212a.f5746b;
            if (interfaceC0151I4 != null) {
                Iterator<Long> it2 = interfaceC0151I4.m431j().iterator();
                while (it2.hasNext()) {
                    c1286eM3212a.m3226f(materialCalendarGridView, it2.next().longValue());
                }
                c1286eM3212a.f5747c = interfaceC0151I4.m431j();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new C1287f(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1167d
    /* JADX INFO: renamed from: e */
    public final RecyclerView.AbstractC1163A mo111e(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C1247R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C1285d.m3218J(viewGroup.getContext(), R.attr.windowFullscreen)) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C1176m(-1, this.f5757h));
        return new a(linearLayout, true);
    }
}
