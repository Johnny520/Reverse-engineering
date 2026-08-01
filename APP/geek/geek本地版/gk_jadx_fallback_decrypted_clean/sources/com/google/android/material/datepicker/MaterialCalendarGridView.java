package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends android.widget.GridView {
    public final boolean a;

    public MaterialCalendarGridView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            r2 = 0
            defpackage.u80.c(r2)
            android.content.Context r2 = r1.getContext()
            r3 = 16843277(0x101020d, float:2.369503E-38)
            boolean r2 = defpackage.bu.G(r2, r3)
            if (r2 == 0) goto L21
            r2 = 2131296345(0x7f090059, float:1.8210604E38)
            r1.setNextFocusLeftId(r2)
            r2 = 2131296363(0x7f09006b, float:1.821064E38)
            r1.setNextFocusRightId(r2)
        L21:
            android.content.Context r2 = r1.getContext()
            r3 = 2130969376(0x7f040320, float:1.7547432E38)
            boolean r2 = defpackage.bu.G(r2, r3)
            r1.a = r2
            qt r2 = new qt
            r3 = 2
            r2.<init>(r3)
            defpackage.ja0.l(r1, r2)
            return
    }

    public final defpackage.aw a() {
            r1 = this;
            android.widget.ListAdapter r0 = super.getAdapter()
            aw r0 = (defpackage.aw) r0
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final android.widget.Adapter getAdapter() {
            r1 = this;
            android.widget.ListAdapter r0 = super.getAdapter()
            aw r0 = (defpackage.aw) r0
            return r0
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final android.widget.ListAdapter getAdapter() {
            r1 = this;
            android.widget.ListAdapter r0 = super.getAdapter()
            aw r0 = (defpackage.aw) r0
            return r0
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            android.widget.ListAdapter r0 = super.getAdapter()
            aw r0 = (defpackage.aw) r0
            r0.notifyDataSetChanged()
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r4) {
            r3 = this;
            super.onDraw(r4)
            android.widget.ListAdapter r4 = super.getAdapter()
            aw r4 = (defpackage.aw) r4
            r4.getClass()
            int r0 = r4.a()
            int r1 = r3.getFirstVisiblePosition()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r4.c()
            int r2 = r3.getLastVisiblePosition()
            int r1 = java.lang.Math.min(r1, r2)
            r4.b(r0)
            r4.b(r1)
            r4 = 0
            throw r4
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean r1, int r2, android.graphics.Rect r3) {
            r0 = this;
            if (r1 == 0) goto L2b
            r1 = 33
            if (r2 != r1) goto L14
            android.widget.ListAdapter r1 = super.getAdapter()
            aw r1 = (defpackage.aw) r1
            int r1 = r1.c()
            r0.setSelection(r1)
            return
        L14:
            r1 = 130(0x82, float:1.82E-43)
            if (r2 != r1) goto L26
            android.widget.ListAdapter r1 = super.getAdapter()
            aw r1 = (defpackage.aw) r1
            int r1 = r1.a()
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
            aw r1 = (defpackage.aw) r1
            int r1 = r1.a()
            if (r5 < r1) goto L21
            goto L34
        L21:
            r5 = 19
            if (r5 != r4) goto L33
            android.widget.ListAdapter r4 = super.getAdapter()
            aw r4 = (defpackage.aw) r4
            int r4 = r4.a()
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
            boolean r0 = r1.a
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
            boolean r0 = r3 instanceof defpackage.aw
            if (r0 == 0) goto L8
            super.setAdapter(r3)
            return
        L8:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.Class<com.google.android.material.datepicker.MaterialCalendarGridView> r0 = com.google.android.material.datepicker.MaterialCalendarGridView.class
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.Class<aw> r1 = defpackage.aw.class
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
            aw r0 = (defpackage.aw) r0
            int r0 = r0.a()
            if (r2 >= r0) goto L1a
            android.widget.ListAdapter r2 = super.getAdapter()
            aw r2 = (defpackage.aw) r2
            int r2 = r2.a()
            super.setSelection(r2)
            return
        L1a:
            super.setSelection(r2)
            return
    }
}
