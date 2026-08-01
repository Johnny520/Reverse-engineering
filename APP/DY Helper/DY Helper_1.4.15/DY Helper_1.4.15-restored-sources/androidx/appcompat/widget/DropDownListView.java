package androidx.appcompat.widget;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
class DropDownListView extends android.widget.ListView {

    /* JADX INFO: renamed from: ε */
    public final android.graphics.Rect f606;

    /* JADX INFO: renamed from: ζ */
    public int f607;

    /* JADX INFO: renamed from: η */
    public int f608;

    /* JADX INFO: renamed from: θ */
    public int f609;

    /* JADX INFO: renamed from: ι */
    public int f610;

    /* JADX INFO: renamed from: κ */
    public int f611;

    /* JADX INFO: renamed from: λ */
    public p000.C0702pw f612;

    /* JADX INFO: renamed from: μ */
    public boolean f613;

    /* JADX INFO: renamed from: ν */
    public final boolean f614;

    /* JADX INFO: renamed from: ξ */
    public boolean f615;

    /* JADX INFO: renamed from: ο */
    public p000.iu0 f616;

    /* JADX INFO: renamed from: π */
    public androidx.appcompat.widget.RunnableC0032 f617;

    public DropDownListView(android.content.Context r3, boolean r4) {
            r2 = this;
            r0 = 0
            r1 = 2130968703(0x7f04007f, float:1.7546067E38)
            r2.<init>(r3, r0, r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r2.f606 = r3
            r3 = 0
            r2.f607 = r3
            r2.f608 = r3
            r2.f609 = r3
            r2.f610 = r3
            r2.f614 = r4
            r2.setCacheColorHint(r3)
            return
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.Rect r0 = r2.f606
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L14
            android.graphics.drawable.Drawable r1 = r2.getSelector()
            if (r1 == 0) goto L14
            r1.setBounds(r0)
            r1.draw(r3)
        L14:
            super.dispatchDraw(r3)
            return
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r2 = this;
            androidx.appcompat.widget.ε r0 = r2.f617
            if (r0 == 0) goto L5
            goto L26
        L5:
            super.drawableStateChanged()
            pw r0 = r2.f612
            if (r0 == 0) goto Lf
            r1 = 1
            r0.f8741 = r1
        Lf:
            android.graphics.drawable.Drawable r0 = r2.getSelector()
            if (r0 == 0) goto L26
            boolean r1 = r2.f615
            if (r1 == 0) goto L26
            boolean r1 = r2.isPressed()
            if (r1 == 0) goto L26
            int[] r2 = r2.getDrawableState()
            r0.setState(r2)
        L26:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
            r1 = this;
            boolean r0 = r1.f614
            if (r0 != 0) goto Ld
            boolean r1 = super.hasFocus()
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
            r1 = this;
            boolean r0 = r1.f614
            if (r0 != 0) goto Ld
            boolean r1 = super.hasWindowFocus()
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    @Override // android.view.View
    public boolean isFocused() {
            r1 = this;
            boolean r0 = r1.f614
            if (r0 != 0) goto Ld
            boolean r1 = super.isFocused()
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
            r1 = this;
            boolean r0 = r1.f614
            if (r0 == 0) goto L8
            boolean r0 = r1.f613
            if (r0 != 0) goto Le
        L8:
            boolean r1 = super.isInTouchMode()
            if (r1 == 0) goto L10
        Le:
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            r0 = 0
            r1.f617 = r0
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getActionMasked()
            r1 = 10
            if (r0 != r1) goto L17
            androidx.appcompat.widget.ε r1 = r6.f617
            if (r1 != 0) goto L17
            androidx.appcompat.widget.ε r1 = new androidx.appcompat.widget.ε
            r2 = 0
            r1.<init>(r2, r6)
            r6.f617 = r1
            r6.post(r1)
        L17:
            boolean r1 = super.onHoverEvent(r7)
            r2 = 9
            r3 = -1
            if (r0 == r2) goto L28
            r2 = 7
            if (r0 != r2) goto L24
            goto L28
        L24:
            r6.setSelection(r3)
            return r1
        L28:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r7 = r7.getY()
            int r7 = (int) r7
            int r7 = r6.pointToPosition(r0, r7)
            if (r7 == r3) goto Lb2
            int r0 = r6.getSelectedItemPosition()
            if (r7 == r0) goto Lb2
            int r0 = r6.getFirstVisiblePosition()
            int r0 = r7 - r0
            android.view.View r0 = r6.getChildAt(r0)
            boolean r2 = r0.isEnabled()
            if (r2 == 0) goto L9b
            r6.requestFocus()
            boolean r2 = p000.AbstractC0601nw.f7780
            if (r2 == 0) goto L8f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.reflect.Method r3 = p000.AbstractC0601nw.f7777     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0, r5, r2, r2}     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            r3.invoke(r6, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            java.lang.reflect.Method r0 = p000.AbstractC0601nw.f7778     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            r0.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            java.lang.reflect.Method r0 = p000.AbstractC0601nw.f7779     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            r0.invoke(r6, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            goto L9b
        L83:
            r7 = move-exception
            goto L87
        L85:
            r7 = move-exception
            goto L8b
        L87:
            r7.printStackTrace()
            goto L9b
        L8b:
            r7.printStackTrace()
            goto L9b
        L8f:
            int r0 = r0.getTop()
            int r2 = r6.getTop()
            int r0 = r0 - r2
            r6.setSelectionFromTop(r7, r0)
        L9b:
            android.graphics.drawable.Drawable r7 = r6.getSelector()
            if (r7 == 0) goto Lb2
            boolean r0 = r6.f615
            if (r0 == 0) goto Lb2
            boolean r0 = r6.isPressed()
            if (r0 == 0) goto Lb2
            int[] r6 = r6.getDrawableState()
            r7.setState(r6)
        Lb2:
            return r1
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 == 0) goto L7
            goto L17
        L7:
            float r0 = r4.getX()
            int r0 = (int) r0
            float r1 = r4.getY()
            int r1 = (int) r1
            int r0 = r3.pointToPosition(r0, r1)
            r3.f611 = r0
        L17:
            androidx.appcompat.widget.ε r0 = r3.f617
            if (r0 == 0) goto L25
            java.lang.Object r1 = r0.f816
            androidx.appcompat.widget.DropDownListView r1 = (androidx.appcompat.widget.DropDownListView) r1
            r2 = 0
            r1.f617 = r2
            r1.removeCallbacks(r0)
        L25:
            boolean r3 = super.onTouchEvent(r4)
            return r3
    }

    public void setListSelectionHidden(boolean r1) {
            r0 = this;
            r0.f613 = r1
            return
    }

    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L18
            pw r1 = new pw
            r1.<init>()
            android.graphics.drawable.Drawable r2 = r1.f8740
            if (r2 == 0) goto Lf
            r2.setCallback(r0)
        Lf:
            r1.f8740 = r4
            r4.setCallback(r1)
            r0 = 1
            r1.f8741 = r0
            r0 = r1
        L18:
            r3.f612 = r0
            super.setSelector(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            if (r4 == 0) goto L27
            r4.getPadding(r0)
        L27:
            int r4 = r0.left
            r3.f607 = r4
            int r4 = r0.top
            r3.f608 = r4
            int r4 = r0.right
            r3.f609 = r4
            int r4 = r0.bottom
            r3.f610 = r4
            return
    }

    /* JADX INFO: renamed from: α */
    public int m273(int r12, int r13) {
            r11 = this;
            int r0 = r11.getListPaddingTop()
            int r1 = r11.getListPaddingBottom()
            int r2 = r11.getDividerHeight()
            android.graphics.drawable.Drawable r3 = r11.getDivider()
            android.widget.ListAdapter r4 = r11.getAdapter()
            if (r4 != 0) goto L18
            int r0 = r0 + r1
            return r0
        L18:
            int r0 = r0 + r1
            r1 = 0
            if (r2 <= 0) goto L1f
            if (r3 == 0) goto L1f
            goto L20
        L1f:
            r2 = r1
        L20:
            int r3 = r4.getCount()
            r5 = 0
            r6 = r1
            r7 = r6
            r8 = r5
        L28:
            if (r6 >= r3) goto L66
            int r9 = r4.getItemViewType(r6)
            if (r9 == r7) goto L32
            r8 = r5
            r7 = r9
        L32:
            android.view.View r8 = r4.getView(r6, r8, r11)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            if (r9 != 0) goto L43
            android.view.ViewGroup$LayoutParams r9 = r11.generateDefaultLayoutParams()
            r8.setLayoutParams(r9)
        L43:
            int r9 = r9.height
            if (r9 <= 0) goto L4e
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            goto L52
        L4e:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
        L52:
            r8.measure(r12, r9)
            r8.forceLayout()
            if (r6 <= 0) goto L5b
            int r0 = r0 + r2
        L5b:
            int r9 = r8.getMeasuredHeight()
            int r0 = r0 + r9
            if (r0 < r13) goto L63
            return r13
        L63:
            int r6 = r6 + 1
            goto L28
        L66:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public boolean m274(android.view.MotionEvent r18, int r19) {
            r17 = this;
            r1 = r17
            r2 = r18
            int r3 = r2.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L1c
            r0 = 2
            if (r3 == r0) goto L1a
            r0 = 3
            if (r3 == r0) goto L16
            r0 = r4
            r4 = r5
            goto L146
        L16:
            r0 = r5
            r4 = r0
            goto L146
        L1a:
            r0 = r4
            goto L1d
        L1c:
            r0 = r5
        L1d:
            int r6 = r18.findPointerIndex(r19)
            if (r6 >= 0) goto L24
            goto L16
        L24:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L37
            goto L146
        L37:
            int r0 = r1.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f615 = r4
            p000.AbstractC0564mw.m3893(r1, r7, r6)
            boolean r0 = r1.isPressed()
            if (r0 != 0) goto L51
            r1.setPressed(r4)
        L51:
            r1.layoutChildren()
            int r0 = r1.f611
            if (r0 == r9) goto L6e
            int r11 = r1.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L6e
            if (r0 == r10) goto L6e
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L6e
            r0.setPressed(r5)
        L6e:
            r1.f611 = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            p000.AbstractC0564mw.m3893(r10, r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L8a
            r10.setPressed(r4)
        L8a:
            android.graphics.drawable.Drawable r11 = r1.getSelector()
            if (r11 == 0) goto L94
            if (r8 == r9) goto L94
            r12 = r4
            goto L95
        L94:
            r12 = r5
        L95:
            if (r12 == 0) goto L9a
            r11.setVisible(r5, r5)
        L9a:
            int r0 = r10.getLeft()
            int r13 = r10.getTop()
            int r14 = r10.getRight()
            int r15 = r10.getBottom()
            r16 = r4
            android.graphics.Rect r4 = r1.f606
            r4.set(r0, r13, r14, r15)
            int r0 = r4.left
            int r13 = r1.f607
            int r0 = r0 - r13
            r4.left = r0
            int r0 = r4.top
            int r13 = r1.f608
            int r0 = r0 - r13
            r4.top = r0
            int r0 = r4.right
            int r13 = r1.f609
            int r0 = r0 + r13
            r4.right = r0
            int r0 = r4.bottom
            int r13 = r1.f610
            int r0 = r0 + r13
            r4.bottom = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r13 = 33
            if (r0 < r13) goto Ld8
            boolean r0 = p000.AbstractC0665ow.m4298(r1)
            goto Le6
        Ld8:
            java.lang.reflect.Field r0 = p000.AbstractC0739qw.f9150
            if (r0 == 0) goto Le5
            boolean r0 = r0.getBoolean(r1)     // Catch: java.lang.IllegalAccessException -> Le1
            goto Le6
        Le1:
            r0 = move-exception
            r0.printStackTrace()
        Le5:
            r0 = r5
        Le6:
            boolean r14 = r10.isEnabled()
            if (r14 == r0) goto L10b
            r0 = r0 ^ 1
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r13) goto Lf6
            p000.AbstractC0665ow.m4299(r1, r0)
            goto L106
        Lf6:
            java.lang.reflect.Field r13 = p000.AbstractC0739qw.f9150
            if (r13 == 0) goto L106
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.IllegalAccessException -> L102
            r13.set(r1, r0)     // Catch: java.lang.IllegalAccessException -> L102
            goto L106
        L102:
            r0 = move-exception
            r0.printStackTrace()
        L106:
            if (r8 == r9) goto L10b
            r1.refreshDrawableState()
        L10b:
            if (r12 == 0) goto L125
            float r0 = r4.exactCenterX()
            float r4 = r4.exactCenterY()
            int r12 = r1.getVisibility()
            if (r12 != 0) goto L11e
            r12 = r16
            goto L11f
        L11e:
            r12 = r5
        L11f:
            r11.setVisible(r12, r5)
            r11.setHotspot(r0, r4)
        L125:
            android.graphics.drawable.Drawable r0 = r1.getSelector()
            if (r0 == 0) goto L130
            if (r8 == r9) goto L130
            r0.setHotspot(r7, r6)
        L130:
            pw r0 = r1.f612
            if (r0 == 0) goto L136
            r0.f8741 = r5
        L136:
            r1.refreshDrawableState()
            r4 = r16
            if (r3 != r4) goto L144
            long r3 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r3)
        L144:
            r4 = r5
            r0 = 1
        L146:
            if (r0 == 0) goto L14a
            if (r4 == 0) goto L162
        L14a:
            r1.f615 = r5
            r1.setPressed(r5)
            r1.drawableStateChanged()
            int r3 = r1.f611
            int r4 = r1.getFirstVisiblePosition()
            int r3 = r3 - r4
            android.view.View r3 = r1.getChildAt(r3)
            if (r3 == 0) goto L162
            r3.setPressed(r5)
        L162:
            iu0 r3 = r1.f616
            if (r0 == 0) goto L17a
            if (r3 != 0) goto L16f
            iu0 r3 = new iu0
            r3.<init>(r1)
            r1.f616 = r3
        L16f:
            iu0 r3 = r1.f616
            boolean r4 = r3.f5204
            r4 = 1
            r3.f5204 = r4
            r3.onTouch(r1, r2)
            goto L185
        L17a:
            if (r3 == 0) goto L185
            boolean r1 = r3.f5204
            if (r1 == 0) goto L183
            r3.m2803()
        L183:
            r3.f5204 = r5
        L185:
            return r0
    }
}
