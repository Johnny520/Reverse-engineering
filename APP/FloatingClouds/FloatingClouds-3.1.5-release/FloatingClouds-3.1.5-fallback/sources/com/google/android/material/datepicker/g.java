package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.recyclerview.widget.RecyclerView.d<com.google.android.material.datepicker.g.a> {
    public final com.google.android.material.datepicker.a d;
    public final a.I4<?> e;
    public final a.J4 f;
    public final com.google.android.material.datepicker.c.C0032c g;
    public final int h;

    public static class a extends androidx.recyclerview.widget.RecyclerView.A {
        public final android.widget.TextView u;
        public final com.google.android.material.datepicker.MaterialCalendarGridView v;

        public a(android.widget.LinearLayout r7, boolean r8) {
                r6 = this;
                r6.<init>(r7)
                int r0 = com.google.android.material.R.id.month_title
                android.view.View r0 = r7.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r6.u = r0
                java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
                a.tg r1 = new a.tg
                int r2 = androidx.core.R.id.tag_accessibility_heading
                r3 = 0
                java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
                r5 = 28
                r1.<init>(r2, r4, r3, r5)
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r1.c(r0, r2)
                int r1 = com.google.android.material.R.id.month_grid
                android.view.View r7 = r7.findViewById(r1)
                com.google.android.material.datepicker.MaterialCalendarGridView r7 = (com.google.android.material.datepicker.MaterialCalendarGridView) r7
                r6.v = r7
                if (r8 != 0) goto L31
                r7 = 8
                r0.setVisibility(r7)
            L31:
                return
        }
    }

    public g(android.view.ContextThemeWrapper r4, a.I4 r5, com.google.android.material.datepicker.a r6, a.J4 r7, com.google.android.material.datepicker.c.C0032c r8) {
            r3 = this;
            r3.<init>()
            a.tb r0 = r6.f1067a
            a.tb r1 = r6.d
            java.util.Calendar r0 = r0.f697a
            java.util.Calendar r2 = r1.f697a
            int r0 = r0.compareTo(r2)
            if (r0 > 0) goto L66
            java.util.Calendar r0 = r1.f697a
            a.tb r1 = r6.b
            java.util.Calendar r1 = r1.f697a
            int r0 = r0.compareTo(r1)
            if (r0 > 0) goto L5e
            int r0 = com.google.android.material.datepicker.e.g
            android.content.res.Resources r1 = r4.getResources()
            int r2 = com.google.android.material.R.dimen.mtrl_calendar_day_height
            int r1 = r1.getDimensionPixelSize(r2)
            int r1 = r1 * r0
            r0 = 16843277(0x101020d, float:2.369503E-38)
            boolean r0 = com.google.android.material.datepicker.d.J(r4, r0)
            if (r0 == 0) goto L3e
            android.content.res.Resources r4 = r4.getResources()
            int r0 = com.google.android.material.R.dimen.mtrl_calendar_day_height
            int r4 = r4.getDimensionPixelSize(r0)
            goto L3f
        L3e:
            r4 = 0
        L3f:
            int r1 = r1 + r4
            r3.h = r1
            r3.d = r6
            r3.e = r5
            r3.f = r7
            r3.g = r8
            androidx.recyclerview.widget.RecyclerView$e r4 = r3.f966a
            boolean r4 = r4.a()
            if (r4 != 0) goto L56
            r4 = 1
            r3.b = r4
            return
        L56:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Cannot change whether this adapter has stable IDs while the adapter has registered observers."
            r4.<init>(r5)
            throw r4
        L5e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "currentPage cannot be after lastPage"
            r4.<init>(r5)
            throw r4
        L66:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "firstPage cannot be after currentPage"
            r4.<init>(r5)
            throw r4
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final int a() {
            r1 = this;
            com.google.android.material.datepicker.a r0 = r1.d
            int r0 = r0.g
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final long b(int r4) {
            r3 = this;
            com.google.android.material.datepicker.a r0 = r3.d
            a.tb r0 = r0.f1067a
            java.util.Calendar r0 = r0.f697a
            java.util.Calendar r0 = a.Zf.c(r0)
            r1 = 2
            r0.add(r1, r4)
            r4 = 5
            r2 = 1
            r0.set(r4, r2)
            java.util.Calendar r0 = a.Zf.c(r0)
            r0.get(r1)
            r0.get(r2)
            r1 = 7
            r0.getMaximum(r1)
            r0.getActualMaximum(r4)
            r0.getTimeInMillis()
            long r0 = r0.getTimeInMillis()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void d(androidx.recyclerview.widget.RecyclerView.A r5, int r6) {
            r4 = this;
            com.google.android.material.datepicker.g$a r5 = (com.google.android.material.datepicker.g.a) r5
            com.google.android.material.datepicker.a r0 = r4.d
            a.tb r1 = r0.f1067a
            java.util.Calendar r1 = r1.f697a
            java.util.Calendar r1 = a.Zf.c(r1)
            r2 = 2
            r1.add(r2, r6)
            a.tb r6 = new a.tb
            r6.<init>(r1)
            android.widget.TextView r1 = r5.u
            java.lang.String r2 = r6.m()
            r1.setText(r2)
            com.google.android.material.datepicker.MaterialCalendarGridView r5 = r5.v
            int r1 = com.google.android.material.R.id.month_grid
            android.view.View r5 = r5.findViewById(r1)
            com.google.android.material.datepicker.MaterialCalendarGridView r5 = (com.google.android.material.datepicker.MaterialCalendarGridView) r5
            com.google.android.material.datepicker.e r1 = r5.a()
            if (r1 == 0) goto L82
            com.google.android.material.datepicker.e r1 = r5.a()
            a.tb r1 = r1.f1075a
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L82
            r5.invalidate()
            com.google.android.material.datepicker.e r6 = r5.a()
            java.util.Collection<java.lang.Long> r0 = r6.c
            java.util.Iterator r0 = r0.iterator()
        L47:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5b
            java.lang.Object r1 = r0.next()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r6.f(r5, r1)
            goto L47
        L5b:
            a.I4<?> r0 = r6.b
            if (r0 == 0) goto L93
            java.util.Collection r1 = r0.j()
            java.util.Iterator r1 = r1.iterator()
        L67:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            r6.f(r5, r2)
            goto L67
        L7b:
            java.util.Collection r0 = r0.j()
            r6.c = r0
            goto L93
        L82:
            com.google.android.material.datepicker.e r1 = new com.google.android.material.datepicker.e
            a.I4<?> r2 = r4.e
            a.J4 r3 = r4.f
            r1.<init>(r6, r2, r0, r3)
            int r6 = r6.d
            r5.setNumColumns(r6)
            r5.setAdapter(r1)
        L93:
            com.google.android.material.datepicker.f r6 = new com.google.android.material.datepicker.f
            r6.<init>(r4, r5)
            r5.setOnItemClickListener(r6)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final androidx.recyclerview.widget.RecyclerView.A e(android.view.ViewGroup r3, int r4) {
            r2 = this;
            android.content.Context r4 = r3.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_month_labeled
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r3, r1)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            android.content.Context r3 = r3.getContext()
            r0 = 16843277(0x101020d, float:2.369503E-38)
            boolean r3 = com.google.android.material.datepicker.d.J(r3, r0)
            if (r3 == 0) goto L30
            androidx.recyclerview.widget.RecyclerView$m r3 = new androidx.recyclerview.widget.RecyclerView$m
            r0 = -1
            int r1 = r2.h
            r3.<init>(r0, r1)
            r4.setLayoutParams(r3)
            com.google.android.material.datepicker.g$a r3 = new com.google.android.material.datepicker.g$a
            r0 = 1
            r3.<init>(r4, r0)
            return r3
        L30:
            com.google.android.material.datepicker.g$a r3 = new com.google.android.material.datepicker.g$a
            r3.<init>(r4, r1)
            return r3
    }
}
