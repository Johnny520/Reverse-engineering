package com.google.android.material.button;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButtonToggleGroup extends android.widget.LinearLayout {
    public static final /* synthetic */ int k = 0;
    public final java.util.ArrayList a;
    public final defpackage.l0 b;
    public final java.util.LinkedHashSet c;
    public final defpackage.nt d;
    public java.lang.Integer[] e;
    public boolean f;
    public boolean g;
    public boolean h;
    public final int i;
    public java.util.HashSet j;

    public MaterialButtonToggleGroup(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            r0 = 2131821586(0x7f110412, float:1.927592E38)
            r4 = 2130969265(0x7f0402b1, float:1.7547207E38)
            android.content.Context r8 = defpackage.ff.W(r8, r9, r4, r0)
            r7.<init>(r8, r9, r4)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r7.a = r8
            l0 r8 = new l0
            r0 = 18
            r8.<init>(r0, r7)
            r7.b = r8
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.c = r8
            nt r8 = new nt
            r8.<init>(r7)
            r7.d = r8
            r8 = 0
            r7.f = r8
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r7.j = r0
            android.content.Context r1 = r7.getContext()
            r5 = 2131821586(0x7f110412, float:1.927592E38)
            int[] r6 = new int[r8]
            int[] r3 = defpackage.wy.k
            r2 = r9
            android.content.res.TypedArray r9 = defpackage.a80.u(r1, r2, r3, r4, r5, r6)
            r0 = 3
            boolean r0 = r9.getBoolean(r0, r8)
            r7.setSingleSelection(r0)
            r0 = -1
            r1 = 1
            int r0 = r9.getResourceId(r1, r0)
            r7.i = r0
            r0 = 2
            boolean r0 = r9.getBoolean(r0, r8)
            r7.h = r0
            r7.setChildrenDrawingOrderEnabled(r1)
            boolean r8 = r9.getBoolean(r8, r1)
            r7.setEnabled(r8)
            r9.recycle()
            java.util.WeakHashMap r8 = defpackage.ja0.a
            defpackage.s90.s(r7, r1)
            return
    }

    private int getFirstVisibleChildIndex() {
            r3 = this;
            int r0 = r3.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            boolean r2 = r3.c(r1)
            if (r2 == 0) goto Le
            return r1
        Le:
            int r1 = r1 + 1
            goto L5
        L11:
            r0 = -1
            return r0
    }

    private int getLastVisibleChildIndex() {
            r2 = this;
            int r0 = r2.getChildCount()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L12
            boolean r1 = r2.c(r0)
            if (r1 == 0) goto Lf
            return r0
        Lf:
            int r0 = r0 + (-1)
            goto L6
        L12:
            r0 = -1
            return r0
    }

    private int getVisibleButtonCount() {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r3.getChildCount()
            if (r0 >= r2) goto L1b
            android.view.View r2 = r3.getChildAt(r0)
            boolean r2 = r2 instanceof com.google.android.material.button.MaterialButton
            if (r2 == 0) goto L18
            boolean r2 = r3.c(r0)
            if (r2 == 0) goto L18
            int r1 = r1 + 1
        L18:
            int r0 = r0 + 1
            goto L2
        L1b:
            return r1
    }

    private void setGeneratedIdIfNeeded(com.google.android.material.button.MaterialButton r3) {
            r2 = this;
            int r0 = r3.getId()
            r1 = -1
            if (r0 != r1) goto L10
            java.util.WeakHashMap r0 = defpackage.ja0.a
            int r0 = defpackage.t90.a()
            r3.setId(r0)
        L10:
            return
    }

    private void setupButtonChild(com.google.android.material.button.MaterialButton r3) {
            r2 = this;
            r0 = 1
            r3.setMaxLines(r0)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r3.setEllipsize(r1)
            r3.setCheckable(r0)
            l0 r1 = r2.b
            r3.setOnPressedChangeListenerInternal(r1)
            r3.setShouldDrawSurfaceColorStroke(r0)
            return
    }

    public final void a() {
            r9 = this;
            int r0 = r9.getFirstVisibleChildIndex()
            r1 = -1
            if (r0 != r1) goto L9
            goto L8a
        L9:
            int r2 = r0 + 1
        Lb:
            int r3 = r9.getChildCount()
            r4 = 0
            if (r2 >= r3) goto L5f
            android.view.View r3 = r9.getChildAt(r2)
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            int r5 = r2 + (-1)
            android.view.View r5 = r9.getChildAt(r5)
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            int r6 = r3.getStrokeWidth()
            int r5 = r5.getStrokeWidth()
            int r5 = java.lang.Math.min(r6, r5)
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            boolean r7 = r6 instanceof android.widget.LinearLayout.LayoutParams
            if (r7 == 0) goto L37
            android.widget.LinearLayout$LayoutParams r6 = (android.widget.LinearLayout.LayoutParams) r6
            goto L41
        L37:
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            int r8 = r6.width
            int r6 = r6.height
            r7.<init>(r8, r6)
            r6 = r7
        L41:
            int r7 = r9.getOrientation()
            if (r7 != 0) goto L51
            defpackage.et.g(r6, r4)
            int r5 = -r5
            defpackage.et.h(r6, r5)
            r6.topMargin = r4
            goto L59
        L51:
            r6.bottomMargin = r4
            int r5 = -r5
            r6.topMargin = r5
            defpackage.et.h(r6, r4)
        L59:
            r3.setLayoutParams(r6)
            int r2 = r2 + 1
            goto Lb
        L5f:
            int r2 = r9.getChildCount()
            if (r2 == 0) goto L8a
            if (r0 != r1) goto L68
            goto L8a
        L68:
            android.view.View r0 = r9.getChildAt(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            int r1 = r9.getOrientation()
            r2 = 1
            if (r1 != r2) goto L80
            r0.topMargin = r4
            r0.bottomMargin = r4
            return
        L80:
            defpackage.et.g(r0, r4)
            defpackage.et.h(r0, r4)
            r0.leftMargin = r4
            r0.rightMargin = r4
        L8a:
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r4, int r5, android.view.ViewGroup.LayoutParams r6) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.material.button.MaterialButton
            if (r0 != 0) goto Lc
            java.lang.String r4 = "MButtonToggleGroup"
            java.lang.String r5 = "Child views must be of type MaterialButton."
            android.util.Log.e(r4, r5)
            return
        Lc:
            super.addView(r4, r5, r6)
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            r3.setGeneratedIdIfNeeded(r4)
            r3.setupButtonChild(r4)
            int r5 = r4.getId()
            boolean r6 = r4.o
            r3.b(r5, r6)
            f30 r5 = r4.getShapeAppearanceModel()
            ot r6 = new ot
            de r0 = r5.e
            de r1 = r5.h
            de r2 = r5.f
            de r5 = r5.g
            r6.<init>(r0, r1, r2, r5)
            java.util.ArrayList r5 = r3.a
            r5.add(r6)
            boolean r5 = r3.isEnabled()
            r4.setEnabled(r5)
            aa r5 = new aa
            r6 = 1
            r5.<init>(r6, r3)
            defpackage.ja0.l(r4, r5)
            return
    }

    public final void b(int r3, boolean r4) {
            r2 = this;
            r0 = -1
            if (r3 != r0) goto L17
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Button ID is not valid: "
            r4.<init>(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "MButtonToggleGroup"
            android.util.Log.e(r4, r3)
            return
        L17:
            java.util.HashSet r0 = new java.util.HashSet
            java.util.HashSet r1 = r2.j
            r0.<init>(r1)
            if (r4 == 0) goto L3f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L3f
            boolean r4 = r2.g
            if (r4 == 0) goto L37
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L37
            r0.clear()
        L37:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            goto L5d
        L3f:
            if (r4 != 0) goto L60
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L60
            boolean r4 = r2.h
            if (r4 == 0) goto L56
            int r4 = r0.size()
            r1 = 1
            if (r4 <= r1) goto L5d
        L56:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.remove(r3)
        L5d:
            r2.d(r0)
        L60:
            return
    }

    public final boolean c(int r2) {
            r1 = this;
            android.view.View r2 = r1.getChildAt(r2)
            int r2 = r2.getVisibility()
            r0 = 8
            if (r2 == r0) goto Le
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    public final void d(java.util.Set r8) {
            r7 = this;
            java.util.HashSet r0 = r7.j
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r8)
            r7.j = r1
            r1 = 0
            r2 = r1
        Lb:
            int r3 = r7.getChildCount()
            if (r2 >= r3) goto L67
            android.view.View r3 = r7.getChildAt(r2)
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            int r3 = r3.getId()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r4 = r8.contains(r4)
            android.view.View r5 = r7.findViewById(r3)
            boolean r6 = r5 instanceof com.google.android.material.button.MaterialButton
            if (r6 == 0) goto L35
            r6 = 1
            r7.f = r6
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            r5.setChecked(r4)
            r7.f = r1
        L35:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            boolean r4 = r0.contains(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r5 = r8.contains(r5)
            if (r4 == r5) goto L64
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r8.contains(r3)
            java.util.LinkedHashSet r3 = r7.c
            java.util.Iterator r3 = r3.iterator()
        L54:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L64
            java.lang.Object r4 = r3.next()
            com.google.android.material.timepicker.d r4 = (com.google.android.material.timepicker.d) r4
            r4.a()
            goto L54
        L64:
            int r2 = r2 + 1
            goto Lb
        L67:
            r7.invalidate()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r7) {
            r6 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            nt r1 = r6.d
            r0.<init>(r1)
            int r1 = r6.getChildCount()
            r2 = 0
            r3 = r2
        Ld:
            if (r3 >= r1) goto L1f
            android.view.View r4 = r6.getChildAt(r3)
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r0.put(r4, r5)
            int r3 = r3 + 1
            goto Ld
        L1f:
            java.util.Collection r0 = r0.values()
            java.lang.Integer[] r1 = new java.lang.Integer[r2]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0
            r6.e = r0
            super.dispatchDraw(r7)
            return
    }

    public final void e() {
            r11 = this;
            int r0 = r11.getChildCount()
            int r1 = r11.getFirstVisibleChildIndex()
            int r2 = r11.getLastVisibleChildIndex()
            r3 = 0
            r4 = r3
        Le:
            if (r4 >= r0) goto Lcb
            android.view.View r5 = r11.getChildAt(r4)
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            int r6 = r5.getVisibility()
            r7 = 8
            if (r6 != r7) goto L20
            goto Lc7
        L20:
            f30 r6 = r5.getShapeAppearanceModel()
            e30 r6 = r6.e()
            java.util.ArrayList r7 = r11.a
            java.lang.Object r7 = r7.get(r4)
            ot r7 = (defpackage.ot) r7
            if (r1 != r2) goto L33
            goto L90
        L33:
            int r8 = r11.getOrientation()
            if (r8 != 0) goto L3b
            r8 = 1
            goto L3c
        L3b:
            r8 = r3
        L3c:
            e r9 = defpackage.ot.e
            if (r4 != r1) goto L67
            if (r8 == 0) goto L5d
            boolean r8 = defpackage.gt.n(r11)
            if (r8 == 0) goto L53
            ot r8 = new ot
            de r10 = r7.b
            de r7 = r7.c
            r8.<init>(r9, r9, r10, r7)
        L51:
            r7 = r8
            goto L90
        L53:
            ot r8 = new ot
            de r10 = r7.a
            de r7 = r7.d
            r8.<init>(r10, r7, r9, r9)
            goto L51
        L5d:
            ot r8 = new ot
            de r10 = r7.a
            de r7 = r7.b
            r8.<init>(r10, r9, r7, r9)
            goto L51
        L67:
            if (r4 != r2) goto L8f
            if (r8 == 0) goto L85
            boolean r8 = defpackage.gt.n(r11)
            if (r8 == 0) goto L7b
            ot r8 = new ot
            de r10 = r7.a
            de r7 = r7.d
            r8.<init>(r10, r7, r9, r9)
            goto L51
        L7b:
            ot r8 = new ot
            de r10 = r7.b
            de r7 = r7.c
            r8.<init>(r9, r9, r10, r7)
            goto L51
        L85:
            ot r8 = new ot
            de r10 = r7.d
            de r7 = r7.c
            r8.<init>(r9, r10, r9, r7)
            goto L51
        L8f:
            r7 = 0
        L90:
            if (r7 != 0) goto Lb0
            e r7 = new e
            r8 = 0
            r7.<init>(r8)
            r6.e = r7
            e r7 = new e
            r7.<init>(r8)
            r6.f = r7
            e r7 = new e
            r7.<init>(r8)
            r6.g = r7
            e r7 = new e
            r7.<init>(r8)
            r6.h = r7
            goto Lc0
        Lb0:
            de r8 = r7.a
            r6.e = r8
            de r8 = r7.d
            r6.h = r8
            de r8 = r7.b
            r6.f = r8
            de r7 = r7.c
            r6.g = r7
        Lc0:
            f30 r6 = r6.a()
            r5.setShapeAppearanceModel(r6)
        Lc7:
            int r4 = r4 + 1
            goto Le
        Lcb:
            return
    }

    public int getCheckedButtonId() {
            r1 = this;
            boolean r0 = r1.g
            if (r0 == 0) goto L1d
            java.util.HashSet r0 = r1.j
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            java.util.HashSet r0 = r1.j
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L1d:
            r0 = -1
            return r0
    }

    public java.util.List<java.lang.Integer> getCheckedButtonIds() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.getChildCount()
            if (r1 >= r2) goto L2c
            android.view.View r2 = r5.getChildAt(r1)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            int r2 = r2.getId()
            java.util.HashSet r3 = r5.j
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L29
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
        L29:
            int r1 = r1 + 1
            goto L6
        L2c:
            return r0
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int r2, int r3) {
            r1 = this;
            java.lang.Integer[] r2 = r1.e
            if (r2 == 0) goto Lf
            int r0 = r2.length
            if (r3 < r0) goto L8
            goto Lf
        L8:
            r2 = r2[r3]
            int r2 = r2.intValue()
            return r2
        Lf:
            java.lang.String r2 = "MButtonToggleGroup"
            java.lang.String r0 = "Child order wasn't updated"
            android.util.Log.w(r2, r0)
            return r3
    }

    @Override // android.view.View
    public final void onFinishInflate() {
            r2 = this;
            super.onFinishInflate()
            r0 = -1
            int r1 = r2.i
            if (r1 == r0) goto L13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r2.d(r0)
        L13:
            return
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r5) {
            r4 = this;
            super.onInitializeAccessibilityNodeInfo(r5)
            int r0 = r4.getVisibleButtonCount()
            boolean r1 = r4.g
            r2 = 1
            if (r1 == 0) goto Le
            r1 = r2
            goto Lf
        Le:
            r1 = 2
        Lf:
            r3 = 0
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r0 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r2, r0, r3, r1)
            r5.setCollectionInfo(r0)
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            r0.e()
            r0.a()
            super.onMeasure(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(android.view.View r3) {
            r2 = this;
            super.onViewRemoved(r3)
            boolean r0 = r3 instanceof com.google.android.material.button.MaterialButton
            if (r0 == 0) goto Le
            r0 = r3
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            r1 = 0
            r0.setOnPressedChangeListenerInternal(r1)
        Le:
            int r3 = r2.indexOfChild(r3)
            if (r3 < 0) goto L19
            java.util.ArrayList r0 = r2.a
            r0.remove(r3)
        L19:
            r2.e()
            r2.a()
            return
    }

    @Override // android.view.View
    public void setEnabled(boolean r3) {
            r2 = this;
            super.setEnabled(r3)
            r0 = 0
        L4:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L16
            android.view.View r1 = r2.getChildAt(r0)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r1.setEnabled(r3)
            int r0 = r0 + 1
            goto L4
        L16:
            return
    }

    public void setSelectionRequired(boolean r1) {
            r0 = this;
            r0.h = r1
            return
    }

    public void setSingleSelection(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            boolean r2 = r0.getBoolean(r2)
            r1.setSingleSelection(r2)
            return
    }

    public void setSingleSelection(boolean r3) {
            r2 = this;
            boolean r0 = r2.g
            if (r0 == r3) goto Le
            r2.g = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2.d(r3)
        Le:
            r3 = 0
        Lf:
            int r0 = r2.getChildCount()
            if (r3 >= r0) goto L2f
            boolean r0 = r2.g
            if (r0 == 0) goto L20
            java.lang.Class<android.widget.RadioButton> r0 = android.widget.RadioButton.class
        L1b:
            java.lang.String r0 = r0.getName()
            goto L23
        L20:
            java.lang.Class<android.widget.ToggleButton> r0 = android.widget.ToggleButton.class
            goto L1b
        L23:
            android.view.View r1 = r2.getChildAt(r3)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            r1.setA11yClassName(r0)
            int r3 = r3 + 1
            goto Lf
        L2f:
            return
    }
}
