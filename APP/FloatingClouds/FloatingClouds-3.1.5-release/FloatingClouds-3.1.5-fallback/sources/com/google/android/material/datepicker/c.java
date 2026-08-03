package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
public final class c<S> extends a.AbstractC0392tc<S> {
    public int W;
    public a.I4<S> X;
    public com.google.android.material.datepicker.a Y;
    public a.J4 Z;
    public a.C0391tb a0;
    public com.google.android.material.datepicker.c.d b0;
    public a.D2 c0;
    public androidx.recyclerview.widget.RecyclerView d0;
    public androidx.recyclerview.widget.RecyclerView e0;
    public android.view.View f0;
    public android.view.View g0;
    public android.view.View h0;
    public android.view.View i0;

    public class a extends a.C {
        @Override // a.C
        public final void d(android.view.View r2, a.I r3) {
                r1 = this;
                android.view.View$AccessibilityDelegate r0 = r1.f36a
                android.view.accessibility.AccessibilityNodeInfo r3 = r3.f118a
                r0.onInitializeAccessibilityNodeInfo(r2, r3)
                r2 = 0
                r3.setCollectionInfo(r2)
                return
        }
    }

    public class b extends a.C0198ie {
        public final /* synthetic */ int E;
        public final /* synthetic */ com.google.android.material.datepicker.c F;

        public b(com.google.android.material.datepicker.c r1, int r2, int r3) {
                r0 = this;
                r0.F = r1
                r0.E = r3
                r0.<init>(r2)
                return
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void C0(androidx.recyclerview.widget.RecyclerView.w r4, int[] r5) {
                r3 = this;
                int r4 = r3.E
                r0 = 1
                r1 = 0
                com.google.android.material.datepicker.c r2 = r3.F
                if (r4 != 0) goto L19
                androidx.recyclerview.widget.RecyclerView r4 = r2.e0
                int r4 = r4.getWidth()
                r5[r1] = r4
                androidx.recyclerview.widget.RecyclerView r4 = r2.e0
                int r4 = r4.getWidth()
                r5[r0] = r4
                return
            L19:
                androidx.recyclerview.widget.RecyclerView r4 = r2.e0
                int r4 = r4.getHeight()
                r5[r1] = r4
                androidx.recyclerview.widget.RecyclerView r4 = r2.e0
                int r4 = r4.getHeight()
                r5[r0] = r4
                return
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.c$c, reason: collision with other inner class name */
    public class C0032c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.datepicker.c f1070a;

        public C0032c(com.google.android.material.datepicker.c r1) {
                r0 = this;
                r0.<init>()
                r0.f1070a = r1
                return
        }
    }

    public enum d extends java.lang.Enum<com.google.android.material.datepicker.c.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.google.android.material.datepicker.c.d f1071a = null;
        public static final com.google.android.material.datepicker.c.d b = null;
        public static final /* synthetic */ com.google.android.material.datepicker.c.d[] c = null;

        static {
                com.google.android.material.datepicker.c$d r0 = new com.google.android.material.datepicker.c$d
                java.lang.String r1 = "DAY"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.android.material.datepicker.c.d.f1071a = r0
                com.google.android.material.datepicker.c$d r1 = new com.google.android.material.datepicker.c$d
                java.lang.String r2 = "YEAR"
                r3 = 1
                r1.<init>(r2, r3)
                com.google.android.material.datepicker.c.d.b = r1
                com.google.android.material.datepicker.c$d[] r0 = new com.google.android.material.datepicker.c.d[]{r0, r1}
                com.google.android.material.datepicker.c.d.c = r0
                return
        }

        d() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public static com.google.android.material.datepicker.c.d valueOf(java.lang.String r1) {
                java.lang.Class<com.google.android.material.datepicker.c$d> r0 = com.google.android.material.datepicker.c.d.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.android.material.datepicker.c$d r1 = (com.google.android.material.datepicker.c.d) r1
                return r1
        }

        public static com.google.android.material.datepicker.c.d[] values() {
                com.google.android.material.datepicker.c$d[] r0 = com.google.android.material.datepicker.c.d.c
                java.lang.Object r0 = r0.clone()
                com.google.android.material.datepicker.c$d[] r0 = (com.google.android.material.datepicker.c.d[]) r0
                return r0
        }
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // a.AbstractC0392tc
    public final void F(com.google.android.material.datepicker.d.c r2) {
            r1 = this;
            java.util.LinkedHashSet<a.fc<S>> r0 = r1.V
            r0.add(r2)
            return
    }

    public final void G(a.C0391tb r7) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r6.e0
            androidx.recyclerview.widget.RecyclerView$d r0 = r0.getAdapter()
            com.google.android.material.datepicker.g r0 = (com.google.android.material.datepicker.g) r0
            com.google.android.material.datepicker.a r1 = r0.d
            a.tb r1 = r1.f1067a
            int r1 = r1.n(r7)
            a.tb r2 = r6.a0
            com.google.android.material.datepicker.a r0 = r0.d
            a.tb r0 = r0.f1067a
            int r0 = r0.n(r2)
            int r0 = r1 - r0
            int r2 = java.lang.Math.abs(r0)
            r3 = 3
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L27
            r2 = r5
            goto L28
        L27:
            r2 = r4
        L28:
            if (r0 <= 0) goto L2b
            r4 = r5
        L2b:
            r6.a0 = r7
            if (r2 == 0) goto L44
            if (r4 == 0) goto L44
            androidx.recyclerview.widget.RecyclerView r7 = r6.e0
            int r0 = r1 + (-3)
            r7.e0(r0)
            androidx.recyclerview.widget.RecyclerView r7 = r6.e0
            a.G2 r0 = new a.G2
            r2 = 1
            r0.<init>(r6, r1, r2)
            r7.post(r0)
            return
        L44:
            if (r2 == 0) goto L59
            androidx.recyclerview.widget.RecyclerView r7 = r6.e0
            int r0 = r1 + 3
            r7.e0(r0)
            androidx.recyclerview.widget.RecyclerView r7 = r6.e0
            a.G2 r0 = new a.G2
            r2 = 1
            r0.<init>(r6, r1, r2)
            r7.post(r0)
            return
        L59:
            androidx.recyclerview.widget.RecyclerView r7 = r6.e0
            a.G2 r0 = new a.G2
            r2 = 1
            r0.<init>(r6, r1, r2)
            r7.post(r0)
            return
    }

    public final void H(com.google.android.material.datepicker.c.d r5) {
            r4 = this;
            r4.b0 = r5
            com.google.android.material.datepicker.c$d r0 = com.google.android.material.datepicker.c.d.b
            r1 = 8
            r2 = 0
            if (r5 != r0) goto L3c
            androidx.recyclerview.widget.RecyclerView r5 = r4.d0
            androidx.recyclerview.widget.RecyclerView$l r5 = r5.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.d0
            androidx.recyclerview.widget.RecyclerView$d r0 = r0.getAdapter()
            a.Bh r0 = (a.Bh) r0
            a.tb r3 = r4.a0
            int r3 = r3.c
            com.google.android.material.datepicker.c<?> r0 = r0.d
            com.google.android.material.datepicker.a r0 = r0.Y
            a.tb r0 = r0.f1067a
            int r0 = r0.c
            int r3 = r3 - r0
            r5.p0(r3)
            android.view.View r5 = r4.h0
            r5.setVisibility(r2)
            android.view.View r5 = r4.i0
            r5.setVisibility(r1)
            android.view.View r5 = r4.f0
            r5.setVisibility(r1)
            android.view.View r5 = r4.g0
            r5.setVisibility(r1)
            return
        L3c:
            com.google.android.material.datepicker.c$d r0 = com.google.android.material.datepicker.c.d.f1071a
            if (r5 != r0) goto L59
            android.view.View r5 = r4.h0
            r5.setVisibility(r1)
            android.view.View r5 = r4.i0
            r5.setVisibility(r2)
            android.view.View r5 = r4.f0
            r5.setVisibility(r2)
            android.view.View r5 = r4.g0
            r5.setVisibility(r2)
            a.tb r5 = r4.a0
            r4.G(r5)
        L59:
            return
    }

    @Override // androidx.fragment.app.b
    public final void o(android.os.Bundle r2) {
            r1 = this;
            super.o(r2)
            if (r2 != 0) goto L7
            android.os.Bundle r2 = r1.f
        L7:
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r0 = r2.getInt(r0)
            r1.W = r0
            java.lang.String r0 = "GRID_SELECTOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            a.I4 r0 = (a.I4) r0
            r1.X = r0
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.google.android.material.datepicker.a r0 = (com.google.android.material.datepicker.a) r0
            r1.Y = r0
            java.lang.String r0 = "DAY_VIEW_DECORATOR_KEY"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            a.J4 r0 = (a.J4) r0
            r1.Z = r0
            java.lang.String r0 = "CURRENT_MONTH_KEY"
            android.os.Parcelable r2 = r2.getParcelable(r0)
            a.tb r2 = (a.C0391tb) r2
            r1.a0 = r2
            return
    }

    @Override // androidx.fragment.app.b
    public final android.view.View p(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
            r10 = this;
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            android.content.Context r13 = r10.d()
            int r0 = r10.W
            r1.<init>(r13, r0)
            a.D2 r13 = new a.D2
            r13.<init>(r1)
            r10.c0 = r13
            android.view.LayoutInflater r11 = r11.cloneInContext(r1)
            com.google.android.material.datepicker.a r13 = r10.Y
            a.tb r13 = r13.f1067a
            r6 = 16843277(0x101020d, float:2.369503E-38)
            boolean r0 = com.google.android.material.datepicker.d.J(r1, r6)
            r2 = 0
            r7 = 1
            if (r0 == 0) goto L29
            int r0 = com.google.android.material.R.layout.mtrl_calendar_vertical
            r3 = r7
            goto L2c
        L29:
            int r0 = com.google.android.material.R.layout.mtrl_calendar_horizontal
            r3 = r2
        L2c:
            android.view.View r11 = r11.inflate(r0, r12, r2)
            android.content.Context r12 = r10.A()
            android.content.res.Resources r12 = r12.getResources()
            int r0 = com.google.android.material.R.dimen.mtrl_calendar_navigation_height
            int r0 = r12.getDimensionPixelSize(r0)
            int r4 = com.google.android.material.R.dimen.mtrl_calendar_navigation_top_padding
            int r4 = r12.getDimensionPixelOffset(r4)
            int r4 = r4 + r0
            int r0 = com.google.android.material.R.dimen.mtrl_calendar_navigation_bottom_padding
            int r0 = r12.getDimensionPixelOffset(r0)
            int r0 = r0 + r4
            int r4 = com.google.android.material.R.dimen.mtrl_calendar_days_of_week_height
            int r4 = r12.getDimensionPixelSize(r4)
            int r5 = com.google.android.material.datepicker.e.g
            int r8 = com.google.android.material.R.dimen.mtrl_calendar_day_height
            int r8 = r12.getDimensionPixelSize(r8)
            int r8 = r8 * r5
            int r5 = r5 - r7
            int r9 = com.google.android.material.R.dimen.mtrl_calendar_month_vertical_padding
            int r9 = r12.getDimensionPixelOffset(r9)
            int r9 = r9 * r5
            int r9 = r9 + r8
            int r5 = com.google.android.material.R.dimen.mtrl_calendar_bottom_padding
            int r12 = r12.getDimensionPixelOffset(r5)
            int r0 = r0 + r4
            int r0 = r0 + r9
            int r0 = r0 + r12
            r11.setMinimumHeight(r0)
            int r12 = com.google.android.material.R.id.mtrl_calendar_days_of_week
            android.view.View r12 = r11.findViewById(r12)
            android.widget.GridView r12 = (android.widget.GridView) r12
            com.google.android.material.datepicker.c$a r0 = new com.google.android.material.datepicker.c$a
            r0.<init>()
            a.C0414ug.j(r12, r0)
            com.google.android.material.datepicker.a r0 = r10.Y
            int r0 = r0.e
            a.K4 r4 = new a.K4
            if (r0 <= 0) goto L8c
            r4.<init>(r0)
            goto L8f
        L8c:
            r4.<init>()
        L8f:
            r12.setAdapter(r4)
            int r13 = r13.d
            r12.setNumColumns(r13)
            r12.setEnabled(r2)
            int r12 = com.google.android.material.R.id.mtrl_calendar_months
            android.view.View r12 = r11.findViewById(r12)
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            r10.e0 = r12
            com.google.android.material.datepicker.c$b r12 = new com.google.android.material.datepicker.c$b
            r12.<init>(r10, r3, r3)
            androidx.recyclerview.widget.RecyclerView r13 = r10.e0
            r13.setLayoutManager(r12)
            androidx.recyclerview.widget.RecyclerView r12 = r10.e0
            java.lang.String r13 = "MONTHS_VIEW_GROUP_TAG"
            r12.setTag(r13)
            com.google.android.material.datepicker.g r0 = new com.google.android.material.datepicker.g
            a.I4<S> r2 = r10.X
            com.google.android.material.datepicker.a r3 = r10.Y
            a.J4 r4 = r10.Z
            com.google.android.material.datepicker.c$c r5 = new com.google.android.material.datepicker.c$c
            r5.<init>(r10)
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.recyclerview.widget.RecyclerView r12 = r10.e0
            r12.setAdapter(r0)
            android.content.res.Resources r12 = r1.getResources()
            int r13 = com.google.android.material.R.integer.mtrl_calendar_year_selector_span
            int r12 = r12.getInteger(r13)
            int r13 = com.google.android.material.R.id.mtrl_calendar_year_selector_frame
            android.view.View r13 = r11.findViewById(r13)
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            r10.d0 = r13
            if (r13 == 0) goto L101
            r13.setHasFixedSize(r7)
            androidx.recyclerview.widget.RecyclerView r13 = r10.d0
            androidx.recyclerview.widget.GridLayoutManager r2 = new androidx.recyclerview.widget.GridLayoutManager
            r2.<init>(r12)
            r13.setLayoutManager(r2)
            androidx.recyclerview.widget.RecyclerView r12 = r10.d0
            a.Bh r13 = new a.Bh
            r13.<init>(r10)
            r12.setAdapter(r13)
            androidx.recyclerview.widget.RecyclerView r12 = r10.d0
            a.Ga r13 = new a.Ga
            r13.<init>(r10)
            r12.i(r13)
        L101:
            int r12 = com.google.android.material.R.id.month_navigation_fragment_toggle
            android.view.View r12 = r11.findViewById(r12)
            if (r12 == 0) goto L17c
            int r12 = com.google.android.material.R.id.month_navigation_fragment_toggle
            android.view.View r12 = r11.findViewById(r12)
            com.google.android.material.button.MaterialButton r12 = (com.google.android.material.button.MaterialButton) r12
            java.lang.String r13 = "SELECTOR_TOGGLE_TAG"
            r12.setTag(r13)
            a.Ha r13 = new a.Ha
            r13.<init>(r10)
            a.C0414ug.j(r12, r13)
            int r13 = com.google.android.material.R.id.month_navigation_previous
            android.view.View r13 = r11.findViewById(r13)
            r10.f0 = r13
            java.lang.String r2 = "NAVIGATION_PREV_TAG"
            r13.setTag(r2)
            int r13 = com.google.android.material.R.id.month_navigation_next
            android.view.View r13 = r11.findViewById(r13)
            r10.g0 = r13
            java.lang.String r2 = "NAVIGATION_NEXT_TAG"
            r13.setTag(r2)
            int r13 = com.google.android.material.R.id.mtrl_calendar_year_selector_frame
            android.view.View r13 = r11.findViewById(r13)
            r10.h0 = r13
            int r13 = com.google.android.material.R.id.mtrl_calendar_day_selector_frame
            android.view.View r13 = r11.findViewById(r13)
            r10.i0 = r13
            com.google.android.material.datepicker.c$d r13 = com.google.android.material.datepicker.c.d.f1071a
            r10.H(r13)
            a.tb r13 = r10.a0
            java.lang.String r13 = r13.m()
            r12.setText(r13)
            androidx.recyclerview.widget.RecyclerView r13 = r10.e0
            a.Ia r2 = new a.Ia
            r2.<init>(r10, r0, r12)
            r13.j(r2)
            a.Ja r13 = new a.Ja
            r13.<init>(r10)
            r12.setOnClickListener(r13)
            android.view.View r12 = r10.g0
            a.Ka r13 = new a.Ka
            r13.<init>(r10, r0)
            r12.setOnClickListener(r13)
            android.view.View r12 = r10.f0
            a.Ea r13 = new a.Ea
            r13.<init>(r10, r0)
            r12.setOnClickListener(r13)
        L17c:
            boolean r12 = com.google.android.material.datepicker.d.J(r1, r6)
            if (r12 != 0) goto L1cf
            androidx.recyclerview.widget.u r12 = new androidx.recyclerview.widget.u
            r12.<init>()
            androidx.recyclerview.widget.RecyclerView r13 = r10.e0
            androidx.recyclerview.widget.RecyclerView r1 = r12.f951a
            if (r1 != r13) goto L18e
            goto L1cf
        L18e:
            androidx.recyclerview.widget.A$a r2 = r12.b
            if (r1 == 0) goto L19f
            java.util.ArrayList r1 = r1.h0
            if (r1 == 0) goto L199
            r1.remove(r2)
        L199:
            androidx.recyclerview.widget.RecyclerView r1 = r12.f951a
            r3 = 0
            r1.setOnFlingListener(r3)
        L19f:
            r12.f951a = r13
            if (r13 == 0) goto L1cf
            androidx.recyclerview.widget.RecyclerView$n r13 = r13.getOnFlingListener()
            if (r13 != 0) goto L1c7
            androidx.recyclerview.widget.RecyclerView r13 = r12.f951a
            r13.j(r2)
            androidx.recyclerview.widget.RecyclerView r13 = r12.f951a
            r13.setOnFlingListener(r12)
            android.widget.Scroller r13 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r1 = r12.f951a
            android.content.Context r1 = r1.getContext()
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            r13.<init>(r1, r2)
            r12.b()
            goto L1cf
        L1c7:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "An instance of OnFlingListener already set."
            r11.<init>(r12)
            throw r11
        L1cf:
            androidx.recyclerview.widget.RecyclerView r12 = r10.e0
            a.tb r13 = r10.a0
            com.google.android.material.datepicker.a r0 = r0.d
            a.tb r0 = r0.f1067a
            int r13 = r0.n(r13)
            r12.e0(r13)
            androidx.recyclerview.widget.RecyclerView r12 = r10.e0
            a.Fa r13 = new a.Fa
            r0 = 0
            r13.<init>(r0)
            a.C0414ug.j(r12, r13)
            return r11
    }

    @Override // androidx.fragment.app.b
    public final void t(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "THEME_RES_ID_KEY"
            int r1 = r2.W
            r3.putInt(r0, r1)
            java.lang.String r0 = "GRID_SELECTOR_KEY"
            a.I4<S> r1 = r2.X
            r3.putParcelable(r0, r1)
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            com.google.android.material.datepicker.a r1 = r2.Y
            r3.putParcelable(r0, r1)
            java.lang.String r0 = "DAY_VIEW_DECORATOR_KEY"
            a.J4 r1 = r2.Z
            r3.putParcelable(r0, r1)
            java.lang.String r0 = "CURRENT_MONTH_KEY"
            a.tb r1 = r2.a0
            r3.putParcelable(r0, r1)
            return
    }
}
