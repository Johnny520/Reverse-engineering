package defpackage;

/* JADX INFO: renamed from: ᛲᲈᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C0398 extends android.widget.ListView {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f2040;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final boolean f2041;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public boolean f2042;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public defpackage.C1808 f2043;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f2044;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public defpackage.ViewOnTouchListenerC1911 f2045;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f2046;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.graphics.Rect f2047;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public boolean f2048;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public defpackage.RunnableC0439 f2049;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f2050;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f2051;

    public C0398(android.content.Context r3, boolean r4) {
            r2 = this;
            r0 = 0
            r1 = 1711538454(0x66040116, float:1.558431E23)
            r2.<init>(r3, r0, r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r2.f2047 = r3
            r3 = 0
            r2.f2046 = r3
            r2.f2044 = r3
            r2.f2050 = r3
            r2.f2051 = r3
            r2.f2041 = r4
            r2.setCacheColorHint(r3)
            return
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.Rect r0 = r2.f2047
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
            ᛳᛳᛵᛲ r0 = r2.f2049
            if (r0 == 0) goto L5
            goto L26
        L5:
            super.drawableStateChanged()
            ᲁᛲᛳᛵ r0 = r2.f2043
            if (r0 == 0) goto Lf
            r1 = 1
            r0.f7928 = r1
        Lf:
            android.graphics.drawable.Drawable r0 = r2.getSelector()
            if (r0 == 0) goto L26
            boolean r1 = r2.f2042
            if (r1 == 0) goto L26
            boolean r1 = r2.isPressed()
            if (r1 == 0) goto L26
            int[] r2 = r2.getDrawableState()
            r0.setState(r2)
        L26:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
            r1 = this;
            boolean r0 = r1.f2041
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
    public final boolean hasWindowFocus() {
            r1 = this;
            boolean r0 = r1.f2041
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
    public final boolean isFocused() {
            r1 = this;
            boolean r0 = r1.f2041
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
    public final boolean isInTouchMode() {
            r1 = this;
            boolean r0 = r1.f2041
            if (r0 == 0) goto L8
            boolean r0 = r1.f2048
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
            r1.f2049 = r0
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getActionMasked()
            r1 = 10
            if (r0 != r1) goto L17
            ᛳᛳᛵᛲ r1 = r6.f2049
            if (r1 != 0) goto L17
            ᛳᛳᛵᛲ r1 = new ᛳᛳᛵᛲ
            r2 = 6
            r1.<init>(r2, r6)
            r6.f2049 = r1
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
            boolean r2 = defpackage.AbstractC0248.f1458
            if (r2 == 0) goto L8f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.reflect.Method r3 = defpackage.AbstractC0248.f1460     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0, r5, r2, r2}     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            r3.invoke(r6, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            java.lang.reflect.Method r0 = defpackage.AbstractC0248.f1461     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            r0.invoke(r6, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
            java.lang.reflect.Method r0 = defpackage.AbstractC0248.f1459     // Catch: java.lang.reflect.InvocationTargetException -> L83 java.lang.IllegalAccessException -> L85
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
            boolean r0 = r6.f2042
            if (r0 == 0) goto Lb2
            boolean r0 = r6.isPressed()
            if (r0 == 0) goto Lb2
            int[] r6 = r6.getDrawableState()
            r7.setState(r6)
        Lb2:
            return r1
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
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
            r3.f2040 = r0
        L17:
            ᛳᛳᛵᛲ r0 = r3.f2049
            if (r0 == 0) goto L25
            java.lang.Object r1 = r0.f2168
            ᛲᲈᲁᛸ r1 = (defpackage.C0398) r1
            r2 = 0
            r1.f2049 = r2
            r1.removeCallbacks(r0)
        L25:
            boolean r3 = super.onTouchEvent(r4)
            return r3
    }

    public void setListSelectionHidden(boolean r1) {
            r0 = this;
            r0.f2048 = r1
            return
    }

    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable r3) {
            r2 = this;
            if (r3 == 0) goto Lb
            ᲁᛲᛳᛵ r0 = new ᲁᛲᛳᛵ
            r0.<init>(r3)
            r1 = 1
            r0.f7928 = r1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r2.f2043 = r0
            super.setSelector(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            if (r3 == 0) goto L1b
            r3.getPadding(r0)
        L1b:
            int r3 = r0.left
            r2.f2046 = r3
            int r3 = r0.top
            r2.f2044 = r3
            int r3 = r0.right
            r2.f2050 = r3
            int r3 = r0.bottom
            r2.f2051 = r3
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int m1159(int r12, int r13) {
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

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean m1160(android.view.MotionEvent r18, int r19) {
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
            goto L148
        L16:
            r0 = r5
            r4 = r0
            goto L148
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
            goto L148
        L37:
            int r0 = r1.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f2042 = r4
            defpackage.AbstractC2092.m3506(r1, r7, r6)
            boolean r0 = r1.isPressed()
            if (r0 != 0) goto L51
            r1.setPressed(r4)
        L51:
            r1.layoutChildren()
            int r0 = r1.f2040
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
            r1.f2040 = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            defpackage.AbstractC2092.m3506(r10, r0, r11)
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
            android.graphics.Rect r4 = r1.f2047
            r4.set(r0, r13, r14, r15)
            int r0 = r4.left
            int r13 = r1.f2046
            int r0 = r0 - r13
            r4.left = r0
            int r0 = r4.top
            int r13 = r1.f2044
            int r0 = r0 - r13
            r4.top = r0
            int r0 = r4.right
            int r13 = r1.f2050
            int r0 = r0 + r13
            r4.right = r0
            int r0 = r4.bottom
            int r13 = r1.f2051
            int r0 = r0 + r13
            r4.bottom = r0
            boolean r0 = defpackage.AbstractC0649.m1482()
            if (r0 == 0) goto Ld8
            boolean r0 = defpackage.AbstractC0360.m1086(r1)
            goto Le6
        Ld8:
            java.lang.reflect.Field r0 = defpackage.AbstractC1599.f7053
            if (r0 == 0) goto Le5
            boolean r0 = r0.getBoolean(r1)     // Catch: java.lang.IllegalAccessException -> Le1
            goto Le6
        Le1:
            r0 = move-exception
            r0.printStackTrace()
        Le5:
            r0 = r5
        Le6:
            boolean r13 = r10.isEnabled()
            if (r13 == r0) goto L10d
            r0 = r0 ^ 1
            boolean r13 = defpackage.AbstractC0649.m1482()
            if (r13 == 0) goto Lf8
            defpackage.AbstractC0360.m1087(r1, r0)
            goto L108
        Lf8:
            java.lang.reflect.Field r13 = defpackage.AbstractC1599.f7053
            if (r13 == 0) goto L108
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.IllegalAccessException -> L104
            r13.set(r1, r0)     // Catch: java.lang.IllegalAccessException -> L104
            goto L108
        L104:
            r0 = move-exception
            r0.printStackTrace()
        L108:
            if (r8 == r9) goto L10d
            r1.refreshDrawableState()
        L10d:
            if (r12 == 0) goto L127
            float r0 = r4.exactCenterX()
            float r4 = r4.exactCenterY()
            int r12 = r1.getVisibility()
            if (r12 != 0) goto L120
            r12 = r16
            goto L121
        L120:
            r12 = r5
        L121:
            r11.setVisible(r12, r5)
            r11.setHotspot(r0, r4)
        L127:
            android.graphics.drawable.Drawable r0 = r1.getSelector()
            if (r0 == 0) goto L132
            if (r8 == r9) goto L132
            r0.setHotspot(r7, r6)
        L132:
            ᲁᛲᛳᛵ r0 = r1.f2043
            if (r0 == 0) goto L138
            r0.f7928 = r5
        L138:
            r1.refreshDrawableState()
            r4 = r16
            if (r3 != r4) goto L146
            long r3 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r3)
        L146:
            r4 = r5
            r0 = 1
        L148:
            if (r0 == 0) goto L14c
            if (r4 == 0) goto L164
        L14c:
            r1.f2042 = r5
            r1.setPressed(r5)
            r1.drawableStateChanged()
            int r3 = r1.f2040
            int r4 = r1.getFirstVisiblePosition()
            int r3 = r3 - r4
            android.view.View r3 = r1.getChildAt(r3)
            if (r3 == 0) goto L164
            r3.setPressed(r5)
        L164:
            ᲁᲀᛷ r3 = r1.f2045
            if (r0 == 0) goto L179
            if (r3 != 0) goto L171
            ᲁᲀᛷ r3 = new ᲁᲀᛷ
            r3.<init>(r1)
            r1.f2045 = r3
        L171:
            r4 = r3
            r5 = 1
            r3.f8321 = r5
            r4.onTouch(r1, r2)
            goto L184
        L179:
            if (r3 == 0) goto L184
            boolean r1 = r3.f8321
            if (r1 == 0) goto L182
            r3.m3346()
        L182:
            r3.f8321 = r5
        L184:
            return r0
    }
}
