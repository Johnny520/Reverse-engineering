package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends android.widget.GridView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Calendar f1066a;
    public final boolean b;

    public MaterialCalendarGridView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            r2 = 0
            java.util.Calendar r2 = a.Zf.e(r2)
            r1.f1066a = r2
            android.content.Context r2 = r1.getContext()
            r3 = 16843277(0x101020d, float:2.369503E-38)
            boolean r2 = com.google.android.material.datepicker.d.J(r2, r3)
            if (r2 == 0) goto L22
            int r2 = com.google.android.material.R.id.cancel_button
            r1.setNextFocusLeftId(r2)
            int r2 = com.google.android.material.R.id.confirm_button
            r1.setNextFocusRightId(r2)
        L22:
            android.content.Context r2 = r1.getContext()
            int r3 = com.google.android.material.R.attr.nestedScrollable
            boolean r2 = com.google.android.material.datepicker.d.J(r2, r3)
            r1.b = r2
            a.Fa r2 = new a.Fa
            r3 = 1
            r2.<init>(r3)
            a.C0414ug.j(r1, r2)
            return
    }

    public final com.google.android.material.datepicker.e a() {
            r1 = this;
            android.widget.ListAdapter r0 = super.getAdapter()
            com.google.android.material.datepicker.e r0 = (com.google.android.material.datepicker.e) r0
            return r0
    }

    public final android.view.View b(int r2) {
            r1 = this;
            int r0 = r1.getFirstVisiblePosition()
            int r2 = r2 - r0
            android.view.View r2 = r1.getChildAt(r2)
            return r2
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final android.widget.Adapter getAdapter() {
            r1 = this;
            android.widget.ListAdapter r0 = super.getAdapter()
            com.google.android.material.datepicker.e r0 = (com.google.android.material.datepicker.e) r0
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final android.widget.ListAdapter getAdapter() {
            r1 = this;
            android.widget.ListAdapter r0 = super.getAdapter()
            com.google.android.material.datepicker.e r0 = (com.google.android.material.datepicker.e) r0
            return r0
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            android.widget.ListAdapter r0 = super.getAdapter()
            com.google.android.material.datepicker.e r0 = (com.google.android.material.datepicker.e) r0
            r0.notifyDataSetChanged()
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            android.widget.ListAdapter r5 = super.getAdapter()
            com.google.android.material.datepicker.e r5 = (com.google.android.material.datepicker.e) r5
            a.I4<?> r0 = r5.b
            int r1 = r5.b()
            int r2 = r4.getFirstVisiblePosition()
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r5.d()
            int r3 = r4.getLastVisiblePosition()
            int r2 = java.lang.Math.min(r2, r3)
            r5.c(r1)
            r5.c(r2)
            java.util.Collection r5 = r0.e()
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L38
            return
        L38:
            java.lang.Object r5 = r5.next()
            a.nc r5 = (a.C0285nc) r5
            r5.getClass()
            r5 = 0
            throw r5
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
            r0 = this;
            if (r1 == 0) goto L2b
            r1 = 33
            if (r2 != r1) goto L14
            android.widget.ListAdapter r1 = super.getAdapter()
            com.google.android.material.datepicker.e r1 = (com.google.android.material.datepicker.e) r1
            int r1 = r1.d()
            r0.setSelection(r1)
            return
        L14:
            r1 = 130(0x82, float:1.82E-43)
            if (r2 != r1) goto L26
            android.widget.ListAdapter r1 = super.getAdapter()
            com.google.android.material.datepicker.e r1 = (com.google.android.material.datepicker.e) r1
            int r1 = r1.b()
            r0.setSelection(r1)
            return
        L26:
            r1 = 1
            super.onFocusChanged(r1, r2, r3)
            return
        L2b:
            r1 = 0
            super.onFocusChanged(r1, r2, r3)
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r4, android.view.KeyEvent r5) {
            r3 = this;
            boolean r5 = super.onKeyDown(r4, r5)
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            int r5 = r3.getSelectedItemPosition()
            r1 = -1
            r2 = 1
            if (r5 == r1) goto L34
            int r5 = r3.getSelectedItemPosition()
            android.widget.ListAdapter r1 = super.getAdapter()
            com.google.android.material.datepicker.e r1 = (com.google.android.material.datepicker.e) r1
            int r1 = r1.b()
            if (r5 < r1) goto L21
            goto L34
        L21:
            r5 = 19
            if (r5 != r4) goto L33
            android.widget.ListAdapter r4 = super.getAdapter()
            com.google.android.material.datepicker.e r4 = (com.google.android.material.datepicker.e) r4
            int r4 = r4.b()
            r3.setSelection(r4)
            return r2
        L33:
            return r0
        L34:
            return r2
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.b
            if (r0 == 0) goto L1b
            r3 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            super.onMeasure(r2, r3)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            int r3 = r1.getMeasuredHeight()
            r2.height = r3
            return
        L1b:
            super.onMeasure(r2, r3)
            return
    }

    @Override // android.widget.AdapterView
    public final /* bridge */ /* synthetic */ void setAdapter(android.widget.Adapter r1) {
            r0 = this;
            android.widget.ListAdapter r1 = (android.widget.ListAdapter) r1
            r0.setAdapter(r1)
            return
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(android.widget.ListAdapter r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.material.datepicker.e
            if (r0 == 0) goto L8
            super.setAdapter(r3)
            return
        L8:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.Class<com.google.android.material.datepicker.MaterialCalendarGridView> r0 = com.google.android.material.datepicker.MaterialCalendarGridView.class
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.Class<com.google.android.material.datepicker.e> r1 = com.google.android.material.datepicker.e.class
            java.lang.String r1 = r1.getCanonicalName()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "%1$s must have its Adapter set to a %2$s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.<init>(r0)
            throw r3
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int r2) {
            r1 = this;
            android.widget.ListAdapter r0 = super.getAdapter()
            com.google.android.material.datepicker.e r0 = (com.google.android.material.datepicker.e) r0
            int r0 = r0.b()
            if (r2 >= r0) goto L1a
            android.widget.ListAdapter r2 = super.getAdapter()
            com.google.android.material.datepicker.e r2 = (com.google.android.material.datepicker.e) r2
            int r2 = r2.b()
            super.setSelection(r2)
            return
        L1a:
            super.setSelection(r2)
            return
    }
}
