package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class kh extends android.widget.ListView {
    public final android.graphics.Rect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public defpackage.ih g;
    public boolean h;
    public final boolean i;
    public boolean j;
    public defpackage.lr k;
    public defpackage.y6 l;

    public kh(android.content.Context r3, boolean r4) {
            r2 = this;
            r0 = 0
            r1 = 2130968955(0x7f04017b, float:1.7546578E38)
            r2.<init>(r3, r0, r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r2.a = r3
            r3 = 0
            r2.b = r3
            r2.c = r3
            r2.d = r3
            r2.e = r3
            r2.i = r4
            r2.setCacheColorHint(r3)
            return
    }

    public final int a(int r12, int r13) {
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

    public final boolean b(android.view.MotionEvent r18, int r19) {
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
            r1.j = r4
            defpackage.fh.a(r1, r7, r6)
            boolean r0 = r1.isPressed()
            if (r0 != 0) goto L51
            r1.setPressed(r4)
        L51:
            r1.layoutChildren()
            int r0 = r1.f
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
            r1.f = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            defpackage.fh.a(r10, r0, r11)
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
            android.graphics.Rect r4 = r1.a
            r4.set(r0, r13, r14, r15)
            int r0 = r4.left
            int r13 = r1.b
            int r0 = r0 - r13
            r4.left = r0
            int r0 = r4.top
            int r13 = r1.c
            int r0 = r0 - r13
            r4.top = r0
            int r0 = r4.right
            int r13 = r1.d
            int r0 = r0 + r13
            r4.right = r0
            int r0 = r4.bottom
            int r13 = r1.e
            int r0 = r0 + r13
            r4.bottom = r0
            boolean r0 = defpackage.ip.A()
            if (r0 == 0) goto Ld8
            boolean r0 = defpackage.hh.a(r1)
            goto Le6
        Ld8:
            java.lang.reflect.Field r0 = defpackage.jh.a
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
            boolean r13 = defpackage.ip.A()
            if (r13 == 0) goto Lf8
            defpackage.hh.b(r1, r0)
            goto L108
        Lf8:
            java.lang.reflect.Field r13 = defpackage.jh.a
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
            defpackage.ch.e(r11, r0, r4)
        L127:
            android.graphics.drawable.Drawable r0 = r1.getSelector()
            if (r0 == 0) goto L132
            if (r8 == r9) goto L132
            defpackage.ch.e(r0, r7, r6)
        L132:
            ih r0 = r1.g
            if (r0 == 0) goto L138
            r0.b = r5
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
            r1.j = r5
            r1.setPressed(r5)
            r1.drawableStateChanged()
            int r3 = r1.f
            int r4 = r1.getFirstVisiblePosition()
            int r3 = r3 - r4
            android.view.View r3 = r1.getChildAt(r3)
            if (r3 == 0) goto L164
            r3.setPressed(r5)
        L164:
            if (r0 == 0) goto L17c
            lr r3 = r1.k
            if (r3 != 0) goto L171
            lr r3 = new lr
            r3.<init>(r1)
            r1.k = r3
        L171:
            lr r3 = r1.k
            boolean r4 = r3.p
            r4 = 1
            r3.p = r4
            r3.onTouch(r1, r2)
            goto L189
        L17c:
            lr r2 = r1.k
            if (r2 == 0) goto L189
            boolean r3 = r2.p
            if (r3 == 0) goto L187
            r2.d()
        L187:
            r2.p = r5
        L189:
            return r0
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.Rect r0 = r2.a
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
            y6 r0 = r2.l
            if (r0 == 0) goto L5
            goto L26
        L5:
            super.drawableStateChanged()
            ih r0 = r2.g
            if (r0 == 0) goto Lf
            r1 = 1
            r0.b = r1
        Lf:
            android.graphics.drawable.Drawable r0 = r2.getSelector()
            if (r0 == 0) goto L26
            boolean r1 = r2.j
            if (r1 == 0) goto L26
            boolean r1 = r2.isPressed()
            if (r1 == 0) goto L26
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L26:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
            r1 = this;
            boolean r0 = r1.i
            if (r0 != 0) goto Ld
            boolean r0 = super.hasFocus()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
            r1 = this;
            boolean r0 = r1.i
            if (r0 != 0) goto Ld
            boolean r0 = super.hasWindowFocus()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    @Override // android.view.View
    public final boolean isFocused() {
            r1 = this;
            boolean r0 = r1.i
            if (r0 != 0) goto Ld
            boolean r0 = super.isFocused()
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
            r1 = this;
            boolean r0 = r1.i
            if (r0 == 0) goto L8
            boolean r0 = r1.h
            if (r0 != 0) goto Le
        L8:
            boolean r0 = super.isInTouchMode()
            if (r0 == 0) goto L10
        Le:
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            r0 = 0
            r1.l = r0
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    public boolean onHoverEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            int r1 = r7.getActionMasked()
            r2 = 10
            if (r1 != r2) goto L19
            y6 r2 = r6.l
            if (r2 != 0) goto L19
            y6 r2 = new y6
            r3 = 5
            r2.<init>(r3, r6)
            r6.l = r2
            r6.post(r2)
        L19:
            boolean r2 = super.onHoverEvent(r7)
            r3 = 9
            r4 = -1
            if (r1 == r3) goto L2a
            r3 = 7
            if (r1 != r3) goto L26
            goto L2a
        L26:
            r6.setSelection(r4)
            return r2
        L2a:
            float r1 = r7.getX()
            int r1 = (int) r1
            float r7 = r7.getY()
            int r7 = (int) r7
            int r7 = r6.pointToPosition(r1, r7)
            if (r7 == r4) goto Lb8
            int r1 = r6.getSelectedItemPosition()
            if (r7 == r1) goto Lb8
            int r1 = r6.getFirstVisiblePosition()
            int r1 = r7 - r1
            android.view.View r1 = r6.getChildAt(r1)
            boolean r3 = r1.isEnabled()
            if (r3 == 0) goto La1
            r6.requestFocus()
            r3 = 30
            if (r0 < r3) goto L95
            boolean r0 = defpackage.gh.d
            if (r0 == 0) goto L95
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.reflect.Method r3 = defpackage.gh.a     // Catch: java.lang.reflect.InvocationTargetException -> L89 java.lang.IllegalAccessException -> L8b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L89 java.lang.IllegalAccessException -> L8b
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.reflect.InvocationTargetException -> L89 java.lang.IllegalAccessException -> L8b
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r1, r5, r0, r0}     // Catch: java.lang.reflect.InvocationTargetException -> L89 java.lang.IllegalAccessException -> L8b
            r3.invoke(r6, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L89 java.lang.IllegalAccessException -> L8b
            java.lang.reflect.Method r0 = defpackage.gh.b     // Catch: java.lang.reflect.InvocationTargetException -> L89 java.lang.IllegalAccessException -> L8b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L89 java.lang.IllegalAccessException -> L8b
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L89 java.lang.IllegalAccessException -> L8b
            r0.invoke(r6, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L89 java.lang.IllegalAccessException -> L8b
            java.lang.reflect.Method r0 = defpackage.gh.c     // Catch: java.lang.reflect.InvocationTargetException -> L89 java.lang.IllegalAccessException -> L8b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L89 java.lang.IllegalAccessException -> L8b
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.reflect.InvocationTargetException -> L89 java.lang.IllegalAccessException -> L8b
            r0.invoke(r6, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L89 java.lang.IllegalAccessException -> L8b
            goto La1
        L89:
            r7 = move-exception
            goto L8d
        L8b:
            r7 = move-exception
            goto L91
        L8d:
            r7.printStackTrace()
            goto La1
        L91:
            r7.printStackTrace()
            goto La1
        L95:
            int r0 = r1.getTop()
            int r1 = r6.getTop()
            int r0 = r0 - r1
            r6.setSelectionFromTop(r7, r0)
        La1:
            android.graphics.drawable.Drawable r7 = r6.getSelector()
            if (r7 == 0) goto Lb8
            boolean r0 = r6.j
            if (r0 == 0) goto Lb8
            boolean r0 = r6.isPressed()
            if (r0 == 0) goto Lb8
            int[] r0 = r6.getDrawableState()
            r7.setState(r0)
        Lb8:
            return r2
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
            r3.f = r0
        L17:
            y6 r0 = r3.l
            if (r0 == 0) goto L25
            java.lang.Object r1 = r0.b
            kh r1 = (defpackage.kh) r1
            r2 = 0
            r1.l = r2
            r1.removeCallbacks(r0)
        L25:
            boolean r4 = super.onTouchEvent(r4)
            return r4
    }

    public void setListSelectionHidden(boolean r1) {
            r0 = this;
            r0.h = r1
            return
    }

    @Override // android.widget.AbsListView
    public void setSelector(android.graphics.drawable.Drawable r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L18
            ih r1 = new ih
            r1.<init>()
            android.graphics.drawable.Drawable r2 = r1.a
            if (r2 == 0) goto Lf
            r2.setCallback(r0)
        Lf:
            r1.a = r4
            r4.setCallback(r1)
            r0 = 1
            r1.b = r0
            r0 = r1
        L18:
            r3.g = r0
            super.setSelector(r0)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            if (r4 == 0) goto L27
            r4.getPadding(r0)
        L27:
            int r4 = r0.left
            r3.b = r4
            int r4 = r0.top
            r3.c = r4
            int r4 = r0.right
            r3.d = r4
            int r4 = r0.bottom
            r3.e = r4
            return
    }
}
