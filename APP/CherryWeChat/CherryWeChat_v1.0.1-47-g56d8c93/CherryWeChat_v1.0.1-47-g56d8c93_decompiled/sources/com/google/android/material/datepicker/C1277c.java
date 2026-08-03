package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.AbstractC1158g;
import androidx.recyclerview.widget.AbstractC1166o;
import io.github.cherrywechat.R;
import java.util.Calendar;
import p000.AbstractC2407qD;
import p000.C0136D6;
import p000.C0806Sq;
import p000.C1017Xm;
import p000.C1469gs;
import p000.C1513hs;
import p000.C2431qv;

/* JADX INFO: renamed from: com.google.android.material.datepicker.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1277c extends AbstractC1158g {

    /* JADX INFO: renamed from: a */
    public final C0136D6 f4534a;

    /* JADX INFO: renamed from: b */
    public final C1017Xm f4535b;

    /* JADX INFO: renamed from: c */
    public final int f4536c;

    public C1277c(ContextThemeWrapper contextThemeWrapper, C0136D6 c0136d6, C1017Xm c1017Xm) {
        C1469gs c1469gs = c0136d6.f349a;
        C1469gs c1469gs2 = c0136d6.f350b;
        C1469gs c1469gs3 = c0136d6.f352d;
        if (c1469gs.f5207a.compareTo(c1469gs3.f5207a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (c1469gs3.f5207a.compareTo(c1469gs2.f5207a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f4536c = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * C1513hs.f5357d) + (C0806Sq.m1612F(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f4534a = c0136d6;
        this.f4535b = c1017Xm;
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final int getItemCount() {
        return this.f4534a.f355g;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final long getItemId(int i) {
        Calendar calendarM4843a = AbstractC2407qD.m4843a(this.f4534a.f349a.f5207a);
        calendarM4843a.add(2, i);
        calendarM4843a.set(5, 1);
        Calendar calendarM4843a2 = AbstractC2407qD.m4843a(calendarM4843a);
        calendarM4843a2.get(2);
        calendarM4843a2.get(1);
        calendarM4843a2.getMaximum(7);
        calendarM4843a2.getActualMaximum(5);
        calendarM4843a2.getTimeInMillis();
        return calendarM4843a2.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void onBindViewHolder(AbstractC1166o abstractC1166o, int i) {
        C1276b c1276b = (C1276b) abstractC1166o;
        C0136D6 c0136d6 = this.f4534a;
        Calendar calendarM4843a = AbstractC2407qD.m4843a(c0136d6.f349a.f5207a);
        calendarM4843a.add(2, i);
        C1469gs c1469gs = new C1469gs(calendarM4843a);
        c1276b.f4532a.setText(c1469gs.m2822c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c1276b.f4533b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.m2467a() == null || !c1469gs.equals(materialCalendarGridView.m2467a().f5359a)) {
            new C1513hs(c1469gs, c0136d6);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.m2467a().getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final AbstractC1166o onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C0806Sq.m1612F(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C1276b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C2431qv(-1, this.f4536c));
        return new C1276b(linearLayout, true);
    }
}
