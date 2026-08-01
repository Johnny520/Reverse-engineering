package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ljx.wechatmod.R;
import defpackage.aw;
import defpackage.b00;
import defpackage.bu;
import defpackage.c8;
import defpackage.fz;
import defpackage.l0;
import defpackage.oz;
import defpackage.u80;
import defpackage.zv;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class c extends fz {
    public final c8 c;
    public final l0 d;
    public final int e;

    public c(ContextThemeWrapper r5, c8 r6, l0 r7) {
        zv r0 = r6.a;
        zv r1 = r6.b;
        zv r2 = r6.d;
        if (r0.a.compareTo(r2.a) > 0) goto L19;
        if (r2.a.compareTo(r1.a) > 0) goto L17;
        int r02 = aw.d;
        int r12 = r5.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * r02;
        if (bu.G(r5, android.R.attr.windowFullscreen) == false) goto L9;
        int r52 = r5.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    L10:
        this.e = r12 + r52;
        this.c = r6;
        this.d = r7;
        if (this.a.a() == true) goto L15;
        this.b = true;
        return;
    L15:
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    L9:
        r52 = 0;
        goto L10
    L17:
        throw new IllegalArgumentException("currentPage cannot be after lastPage");
    L19:
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // defpackage.fz
    public final int a() {
        return this.c.g;
    }

    @Override // defpackage.fz
    public final long b(int r4) {
        Calendar r0 = u80.a(this.c.a.a);
        r0.add(2, r4);
        r0.set(5, 1);
        Calendar r02 = u80.a(r0);
        r02.get(2);
        r02.get(1);
        r02.getMaximum(7);
        r02.getActualMaximum(5);
        r02.getTimeInMillis();
        return r02.getTimeInMillis();
    }

    @Override // defpackage.fz
    public final void c(b00 r4, int r5) {
        b r42 = (b) r4;
        c8 r0 = this.c;
        Calendar r1 = u80.a(r0.a.a);
        r1.add(2, r5);
        zv r52 = new zv(r1);
        r42.t.setText(r52.c());
        MaterialCalendarGridView r43 = (MaterialCalendarGridView) r42.u.findViewById(R.id.month_grid);
        if (r43.a() != null) goto L5;
    L8:
        new aw(r52, r0);
        throw null;
    L5:
        if (r52.equals(r43.a().a) == false) goto L8;
        r43.invalidate();
        r43.a().getClass();
        throw null;
    }

    @Override // defpackage.fz
    public final b00 d(ViewGroup r4) {
        LinearLayout r0 = (LinearLayout) LayoutInflater.from(r4.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, r4, false);
        if (bu.G(r4.getContext(), android.R.attr.windowFullscreen) == false) goto L7;
        r0.setLayoutParams(new oz(-1, this.e));
        return new b(r0, true);
    L7:
        return new b(r0, false);
    }
}
