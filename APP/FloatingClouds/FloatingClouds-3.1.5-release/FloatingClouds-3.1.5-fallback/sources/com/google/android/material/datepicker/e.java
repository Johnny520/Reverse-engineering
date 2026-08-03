package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
public final class e extends android.widget.BaseAdapter {
    public static final int g = 0;
    public static final int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.C0391tb f1075a;
    public final a.I4<?> b;
    public java.util.Collection<java.lang.Long> c;
    public a.D2 d;
    public final com.google.android.material.datepicker.a e;
    public final a.J4 f;

    static {
            r0 = 0
            java.util.Calendar r1 = a.Zf.e(r0)
            r2 = 4
            int r1 = r1.getMaximum(r2)
            com.google.android.material.datepicker.e.g = r1
            java.util.Calendar r1 = a.Zf.e(r0)
            r2 = 5
            int r1 = r1.getMaximum(r2)
            java.util.Calendar r0 = a.Zf.e(r0)
            r2 = 7
            int r0 = r0.getMaximum(r2)
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            com.google.android.material.datepicker.e.h = r0
            return
    }

    public e(a.C0391tb r1, a.I4<?> r2, com.google.android.material.datepicker.a r3, a.J4 r4) {
            r0 = this;
            r0.<init>()
            r0.f1075a = r1
            r0.b = r2
            r0.e = r3
            r0.f = r4
            java.util.Collection r1 = r2.j()
            r0.c = r1
            return
    }

    public final int b() {
            r4 = this;
            com.google.android.material.datepicker.a r0 = r4.e
            int r0 = r0.e
            a.tb r1 = r4.f1075a
            java.util.Calendar r2 = r1.f697a
            r3 = 7
            int r3 = r2.get(r3)
            if (r0 <= 0) goto L10
            goto L14
        L10:
            int r0 = r2.getFirstDayOfWeek()
        L14:
            int r3 = r3 - r0
            if (r3 >= 0) goto L1a
            int r0 = r1.d
            int r3 = r3 + r0
        L1a:
            return r3
    }

    public final java.lang.Long c(int r3) {
            r2 = this;
            int r0 = r2.b()
            if (r3 < r0) goto L29
            int r0 = r2.d()
            if (r3 <= r0) goto Ld
            goto L29
        Ld:
            int r0 = r2.b()
            int r3 = r3 - r0
            int r3 = r3 + 1
            a.tb r0 = r2.f1075a
            java.util.Calendar r0 = r0.f697a
            java.util.Calendar r0 = a.Zf.c(r0)
            r1 = 5
            r0.set(r1, r3)
            long r0 = r0.getTimeInMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            return r3
        L29:
            r3 = 0
            return r3
    }

    public final int d() {
            r2 = this;
            int r0 = r2.b()
            a.tb r1 = r2.f1075a
            int r1 = r1.e
            int r0 = r0 + r1
            int r0 = r0 + (-1)
            return r0
    }

    public final void e(android.widget.TextView r12, long r13, int r15) {
            r11 = this;
            if (r12 != 0) goto L3
            return
        L3:
            android.content.Context r0 = r12.getContext()
            java.util.Calendar r1 = a.Zf.d()
            long r1 = r1.getTimeInMillis()
            int r1 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L17
            r1 = r3
            goto L18
        L17:
            r1 = r2
        L18:
            a.I4<?> r4 = r11.b
            java.util.Collection r5 = r4.e()
            java.util.Iterator r5 = r5.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L103
            java.util.Collection r5 = r4.e()
            java.util.Iterator r5 = r5.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto Lf8
            java.util.Calendar r5 = a.Zf.d()
            r6 = 0
            java.util.Calendar r7 = a.Zf.e(r6)
            r7.setTimeInMillis(r13)
            int r5 = r5.get(r3)
            int r7 = r7.get(r3)
            if (r5 != r7) goto L60
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r7 = "MMMMEEEEd"
            android.icu.text.DateFormat r5 = a.Zf.b(r7, r5)
            java.util.Date r7 = new java.util.Date
            r7.<init>(r13)
            java.lang.String r5 = r5.format(r7)
            goto L73
        L60:
            java.util.Locale r5 = java.util.Locale.getDefault()
            java.lang.String r7 = "yMMMMEEEEd"
            android.icu.text.DateFormat r5 = a.Zf.b(r7, r5)
            java.util.Date r7 = new java.util.Date
            r7.<init>(r13)
            java.lang.String r5 = r5.format(r7)
        L73:
            if (r1 == 0) goto L83
            int r1 = com.google.android.material.R.string.mtrl_picker_today_description
            java.lang.String r0 = r0.getString(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r5}
            java.lang.String r5 = java.lang.String.format(r0, r1)
        L83:
            r12.setContentDescription(r5)
            com.google.android.material.datepicker.a r0 = r11.e
            com.google.android.material.datepicker.a$c r0 = r0.c
            boolean r0 = r0.f(r13)
            if (r0 == 0) goto Ld8
            r12.setEnabled(r3)
            java.util.Collection r0 = r4.j()
            java.util.Iterator r0 = r0.iterator()
        L9b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb8
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r7 = r1.longValue()
            long r9 = a.Zf.a(r13)
            long r7 = a.Zf.a(r7)
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 != 0) goto L9b
            r2 = r3
        Lb8:
            r12.setSelected(r2)
            if (r2 == 0) goto Lc2
            a.D2 r13 = r11.d
            a.C2 r13 = r13.b
            goto Ldf
        Lc2:
            java.util.Calendar r0 = a.Zf.d()
            long r0 = r0.getTimeInMillis()
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 != 0) goto Ld3
            a.D2 r13 = r11.d
            a.C2 r13 = r13.c
            goto Ldf
        Ld3:
            a.D2 r13 = r11.d
            a.C2 r13 = r13.f54a
            goto Ldf
        Ld8:
            r12.setEnabled(r2)
            a.D2 r13 = r11.d
            a.C2 r13 = r13.g
        Ldf:
            a.J4 r14 = r11.f
            if (r14 == 0) goto Lf4
            r14 = -1
            if (r15 == r14) goto Lf4
            a.tb r14 = r11.f1075a
            int r14 = r14.c
            r13.b(r12)
            r12.setCompoundDrawables(r6, r6, r6, r6)
            r12.setContentDescription(r5)
            return
        Lf4:
            r13.b(r12)
            return
        Lf8:
            java.lang.Object r12 = r5.next()
            a.nc r12 = (a.C0285nc) r12
            r12.getClass()
            r12 = 0
            throw r12
        L103:
            java.lang.Object r12 = r5.next()
            a.nc r12 = (a.C0285nc) r12
            r12.getClass()
            r12 = 0
            throw r12
    }

    public final void f(com.google.android.material.datepicker.MaterialCalendarGridView r4, long r5) {
            r3 = this;
            a.tb r0 = a.C0391tb.l(r5)
            a.tb r1 = r3.f1075a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L33
            java.util.Calendar r0 = r1.f697a
            java.util.Calendar r0 = a.Zf.c(r0)
            r0.setTimeInMillis(r5)
            r1 = 5
            int r0 = r0.get(r1)
            com.google.android.material.datepicker.e r1 = r4.a()
            int r2 = r0 + (-1)
            int r1 = r1.b()
            int r1 = r1 + r2
            int r2 = r4.getFirstVisiblePosition()
            int r1 = r1 - r2
            android.view.View r4 = r4.getChildAt(r1)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.e(r4, r5, r0)
        L33:
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r1 = this;
            int r0 = com.google.android.material.datepicker.e.h
            return r0
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            java.lang.Long r1 = r0.c(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
            r2 = this;
            a.tb r0 = r2.f1075a
            int r0 = r0.d
            int r3 = r3 / r0
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            android.content.Context r0 = r8.getContext()
            a.D2 r1 = r5.d
            if (r1 != 0) goto Lf
            a.D2 r1 = new a.D2
            r1.<init>(r0)
            r5.d = r1
        Lf:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L26
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L26:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L5c
            a.tb r8 = r5.f1075a
            int r2 = r8.e
            if (r7 < r2) goto L35
            goto L5c
        L35:
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
            goto L65
        L5c:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L65:
            java.lang.Long r6 = r5.c(r6)
            if (r6 != 0) goto L6c
            return r0
        L6c:
            long r1 = r6.longValue()
            r5.e(r0, r1, r7)
            return r0
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
            r1 = this;
            r0 = 1
            return r0
    }
}
