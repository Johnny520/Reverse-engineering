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

    public C1277c(ContextThemeWrapper r5, C0136D6 r6, C1017Xm r7) {
        C1469gs r0 = r6.f349a;
        C1469gs r1 = r6.f350b;
        C1469gs r2 = r6.f352d;
        if (r0.f5207a.compareTo(r2.f5207a) > 0) goto L15;
        if (r2.f5207a.compareTo(r1.f5207a) > 0) goto L13;
        int r02 = C1513hs.f5357d;
        int r12 = r5.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * r02;
        if (C0806Sq.m1612F(r5, android.R.attr.windowFullscreen) == false) goto L9;
        int r52 = r5.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    L10:
        this.f4536c = r12 + r52;
        this.f4534a = r6;
        this.f4535b = r7;
        setHasStableIds(true);
        return;
    L9:
        r52 = 0;
        goto L10
    L13:
        throw new IllegalArgumentException("currentPage cannot be after lastPage");
    L15:
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final int getItemCount() {
        return this.f4534a.f355g;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final long getItemId(int r4) {
        Calendar r0 = AbstractC2407qD.m4843a(this.f4534a.f349a.f5207a);
        r0.add(2, r4);
        r0.set(5, 1);
        Calendar r02 = AbstractC2407qD.m4843a(r0);
        r02.get(2);
        r02.get(1);
        r02.getMaximum(7);
        r02.getActualMaximum(5);
        r02.getTimeInMillis();
        return r02.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void onBindViewHolder(AbstractC1166o r4, int r5) {
        C1276b r42 = (C1276b) r4;
        C0136D6 r0 = this.f4534a;
        Calendar r1 = AbstractC2407qD.m4843a(r0.f349a.f5207a);
        r1.add(2, r5);
        C1469gs r52 = new C1469gs(r1);
        r42.f4532a.setText(r52.m2822c());
        MaterialCalendarGridView r43 = (MaterialCalendarGridView) r42.f4533b.findViewById(R.id.month_grid);
        if (r43.m2467a() != null) goto L5;
    L8:
        new C1513hs(r52, r0);
        throw null;
    L5:
        if (r52.equals(r43.m2467a().f5359a) == false) goto L8;
        r43.invalidate();
        r43.m2467a().getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final AbstractC1166o onCreateViewHolder(ViewGroup r3, int r4) {
        LinearLayout r42 = (LinearLayout) LayoutInflater.from(r3.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, r3, false);
        if (C0806Sq.m1612F(r3.getContext(), android.R.attr.windowFullscreen) == false) goto L7;
        r42.setLayoutParams(new C2431qv(-1, this.f4536c));
        return new C1276b(r42, true);
    L7:
        return new C1276b(r42, false);
    }
}
