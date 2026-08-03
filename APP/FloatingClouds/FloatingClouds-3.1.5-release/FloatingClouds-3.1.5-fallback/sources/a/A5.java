package a;

/* JADX INFO: loaded from: classes.dex */
public class A5 extends android.widget.ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Rect f10a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public a.A5.d g;
    public boolean h;
    public final boolean i;
    public boolean j;
    public a.G9 k;
    public a.A5.f l;

    public static class a {
        public static void a(android.view.View r0, float r1, float r2) {
                r0.drawableHotspotChanged(r1, r2)
                return
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final java.lang.reflect.Method f11a = null;
        public static final java.lang.reflect.Method b = null;
        public static final java.lang.reflect.Method c = null;
        public static final boolean d = false;

        static {
                java.lang.Class<android.widget.AdapterView> r0 = android.widget.AdapterView.class
                java.lang.Class<android.widget.AbsListView> r1 = android.widget.AbsListView.class
                java.lang.String r2 = "positionSelector"
                java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L3d
                java.lang.Class<android.view.View> r4 = android.view.View.class
                java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L3d
                java.lang.Class r6 = java.lang.Float.TYPE     // Catch: java.lang.NoSuchMethodException -> L3d
                java.lang.Class[] r4 = new java.lang.Class[]{r3, r4, r5, r6, r6}     // Catch: java.lang.NoSuchMethodException -> L3d
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L3d
                a.A5.b.f11a = r1     // Catch: java.lang.NoSuchMethodException -> L3d
                r2 = 1
                r1.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L3d
                java.lang.String r1 = "setSelectedPositionInt"
                java.lang.Class[] r4 = new java.lang.Class[]{r3}     // Catch: java.lang.NoSuchMethodException -> L3d
                java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r4)     // Catch: java.lang.NoSuchMethodException -> L3d
                a.A5.b.b = r1     // Catch: java.lang.NoSuchMethodException -> L3d
                r1.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L3d
                java.lang.String r1 = "setNextSelectedPositionInt"
                java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.NoSuchMethodException -> L3d
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.NoSuchMethodException -> L3d
                a.A5.b.c = r0     // Catch: java.lang.NoSuchMethodException -> L3d
                r0.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L3d
                a.A5.b.d = r2     // Catch: java.lang.NoSuchMethodException -> L3d
                return
            L3d:
                r0 = move-exception
                r0.printStackTrace()
                return
        }
    }

    public static class c {
        public static boolean a(android.widget.AbsListView r0) {
                boolean r0 = r0.isSelectedChildViewEnabled()
                return r0
        }

        public static void b(android.widget.AbsListView r0, boolean r1) {
                r0.setSelectedChildViewEnabled(r1)
                return
        }
    }

    public static class d extends a.C0493z5 {
        public boolean b;

        @Override // a.C0493z5, android.graphics.drawable.Drawable
        public final void draw(android.graphics.Canvas r2) {
                r1 = this;
                boolean r0 = r1.b
                if (r0 == 0) goto L7
                super.draw(r2)
            L7:
                return
        }

        @Override // a.C0493z5, android.graphics.drawable.Drawable
        public final void setHotspot(float r2, float r3) {
                r1 = this;
                boolean r0 = r1.b
                if (r0 == 0) goto L7
                super.setHotspot(r2, r3)
            L7:
                return
        }

        @Override // a.C0493z5, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int r2, int r3, int r4, int r5) {
                r1 = this;
                boolean r0 = r1.b
                if (r0 == 0) goto L7
                super.setHotspotBounds(r2, r3, r4, r5)
            L7:
                return
        }

        @Override // android.graphics.drawable.Drawable
        public final boolean setState(int[] r2) {
                r1 = this;
                boolean r0 = r1.b
                if (r0 == 0) goto Lb
                android.graphics.drawable.Drawable r0 = r1.f776a
                boolean r2 = r0.setState(r2)
                return r2
            Lb:
                r2 = 0
                return r2
        }

        @Override // a.C0493z5, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean r2, boolean r3) {
                r1 = this;
                boolean r0 = r1.b
                if (r0 == 0) goto L9
                boolean r2 = super.setVisible(r2, r3)
                return r2
            L9:
                r2 = 0
                return r2
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final java.lang.reflect.Field f12a = null;

        static {
                r0 = 0
                java.lang.Class<android.widget.AbsListView> r1 = android.widget.AbsListView.class
                java.lang.String r2 = "mIsChildViewEnabled"
                java.lang.reflect.Field r0 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> Le
                r1 = 1
                r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> Le
                goto L12
            Le:
                r1 = move-exception
                r1.printStackTrace()
            L12:
                a.A5.e.f12a = r0
                return
        }
    }

    public class f implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.A5 f13a;

        public f(a.A5 r1) {
                r0 = this;
                r0.<init>()
                r0.f13a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                r0 = 0
                a.A5 r1 = r2.f13a
                r1.l = r0
                r1.drawableStateChanged()
                return
        }
    }

    public A5(android.content.Context r3, boolean r4) {
            r2 = this;
            r0 = 0
            int r1 = androidx.appcompat.R.attr.dropDownListViewStyle
            r2.<init>(r3, r0, r1)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r2.f10a = r3
            r3 = 0
            r2.b = r3
            r2.c = r3
            r2.d = r3
            r2.e = r3
            r2.i = r4
            r2.setCacheColorHint(r3)
            return
    }

    private void setSelectorEnabled(boolean r2) {
            r1 = this;
            a.A5$d r0 = r1.g
            if (r0 == 0) goto L6
            r0.b = r2
        L6:
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
            if (r3 == r4) goto L1a
            r0 = 2
            if (r3 == r0) goto L18
            r0 = 3
            if (r3 == r0) goto L15
            r0 = r4
            goto L145
        L15:
            r0 = r5
            goto L145
        L18:
            r0 = r4
            goto L1b
        L1a:
            r0 = r5
        L1b:
            int r6 = r18.findPointerIndex(r19)
            if (r6 >= 0) goto L22
            goto L15
        L22:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L36
            r5 = r4
            goto L145
        L36:
            int r0 = r1.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.j = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            a.A5.a.a(r1, r7, r6)
            boolean r11 = r1.isPressed()
            if (r11 != 0) goto L52
            r1.setPressed(r4)
        L52:
            r1.layoutChildren()
            int r11 = r1.f
            if (r11 == r9) goto L6f
            int r12 = r1.getFirstVisiblePosition()
            int r11 = r11 - r12
            android.view.View r11 = r1.getChildAt(r11)
            if (r11 == 0) goto L6f
            if (r11 == r10) goto L6f
            boolean r12 = r11.isPressed()
            if (r12 == 0) goto L6f
            r11.setPressed(r5)
        L6f:
            r1.f = r8
            int r11 = r10.getLeft()
            float r11 = (float) r11
            float r11 = r7 - r11
            int r12 = r10.getTop()
            float r12 = (float) r12
            float r12 = r6 - r12
            a.A5.a.a(r10, r11, r12)
            boolean r11 = r10.isPressed()
            if (r11 != 0) goto L8b
            r10.setPressed(r4)
        L8b:
            android.graphics.drawable.Drawable r11 = r1.getSelector()
            if (r11 == 0) goto L95
            if (r8 == r9) goto L95
            r12 = r4
            goto L96
        L95:
            r12 = r5
        L96:
            if (r12 == 0) goto L9b
            r11.setVisible(r5, r5)
        L9b:
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            r16 = r4
            int r4 = r10.getBottom()
            android.graphics.Rect r5 = r1.f10a
            r5.set(r13, r14, r15, r4)
            int r4 = r5.left
            int r13 = r1.b
            int r4 = r4 - r13
            r5.left = r4
            int r4 = r5.top
            int r13 = r1.c
            int r4 = r4 - r13
            r5.top = r4
            int r4 = r5.right
            int r13 = r1.d
            int r4 = r4 + r13
            r5.right = r4
            int r4 = r5.bottom
            int r13 = r1.e
            int r4 = r4 + r13
            r5.bottom = r4
            r4 = 33
            if (r0 < r4) goto Ld7
            boolean r0 = a.A5.c.a(r1)
            goto Le5
        Ld7:
            java.lang.reflect.Field r0 = a.A5.e.f12a
            if (r0 == 0) goto Le4
            boolean r0 = r0.getBoolean(r1)     // Catch: java.lang.IllegalAccessException -> Le0
            goto Le5
        Le0:
            r0 = move-exception
            r0.printStackTrace()
        Le4:
            r0 = 0
        Le5:
            boolean r13 = r10.isEnabled()
            if (r13 == r0) goto L10a
            r0 = r0 ^ 1
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r4) goto Lf5
            a.A5.c.b(r1, r0)
            goto L105
        Lf5:
            java.lang.reflect.Field r4 = a.A5.e.f12a
            if (r4 == 0) goto L105
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.IllegalAccessException -> L101
            r4.set(r1, r0)     // Catch: java.lang.IllegalAccessException -> L101
            goto L105
        L101:
            r0 = move-exception
            r0.printStackTrace()
        L105:
            if (r8 == r9) goto L10a
            r1.refreshDrawableState()
        L10a:
            if (r12 == 0) goto L126
            float r0 = r5.exactCenterX()
            float r4 = r5.exactCenterY()
            int r5 = r1.getVisibility()
            if (r5 != 0) goto L11e
            r5 = r16
        L11c:
            r12 = 0
            goto L120
        L11e:
            r5 = 0
            goto L11c
        L120:
            r11.setVisible(r5, r12)
            a.C0439w5.a.e(r11, r0, r4)
        L126:
            android.graphics.drawable.Drawable r0 = r1.getSelector()
            if (r0 == 0) goto L131
            if (r8 == r9) goto L131
            a.C0439w5.a.e(r0, r7, r6)
        L131:
            r12 = 0
            r1.setSelectorEnabled(r12)
            r1.refreshDrawableState()
            r4 = r16
            if (r3 != r4) goto L143
            long r3 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r3)
        L143:
            r0 = 1
            r5 = 0
        L145:
            if (r0 == 0) goto L149
            if (r5 == 0) goto L162
        L149:
            r12 = 0
            r1.j = r12
            r1.setPressed(r12)
            r1.drawableStateChanged()
            int r3 = r1.f
            int r4 = r1.getFirstVisiblePosition()
            int r3 = r3 - r4
            android.view.View r3 = r1.getChildAt(r3)
            if (r3 == 0) goto L162
            r3.setPressed(r12)
        L162:
            if (r0 == 0) goto L17a
            a.G9 r3 = r1.k
            if (r3 != 0) goto L16f
            a.G9 r3 = new a.G9
            r3.<init>(r1)
            r1.k = r3
        L16f:
            a.G9 r3 = r1.k
            boolean r4 = r3.p
            r4 = 1
            r3.p = r4
            r3.onTouch(r1, r2)
            goto L188
        L17a:
            a.G9 r2 = r1.k
            if (r2 == 0) goto L188
            boolean r3 = r2.p
            if (r3 == 0) goto L185
            r2.d()
        L185:
            r12 = 0
            r2.p = r12
        L188:
            return r0
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.Rect r0 = r2.f10a
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
            a.A5$f r0 = r2.l
            if (r0 == 0) goto L5
            goto L23
        L5:
            super.drawableStateChanged()
            r0 = 1
            r2.setSelectorEnabled(r0)
            android.graphics.drawable.Drawable r0 = r2.getSelector()
            if (r0 == 0) goto L23
            boolean r1 = r2.j
            if (r1 == 0) goto L23
            boolean r1 = r2.isPressed()
            if (r1 == 0) goto L23
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L23:
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
    public boolean onHoverEvent(android.view.MotionEvent r8) {
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            int r1 = r8.getActionMasked()
            r2 = 10
            if (r1 != r2) goto L18
            a.A5$f r2 = r7.l
            if (r2 != 0) goto L18
            a.A5$f r2 = new a.A5$f
            r2.<init>(r7)
            r7.l = r2
            r7.post(r2)
        L18:
            boolean r2 = super.onHoverEvent(r8)
            r3 = 9
            r4 = -1
            if (r1 == r3) goto L29
            r3 = 7
            if (r1 != r3) goto L25
            goto L29
        L25:
            r7.setSelection(r4)
            return r2
        L29:
            float r1 = r8.getX()
            int r1 = (int) r1
            float r8 = r8.getY()
            int r8 = (int) r8
            int r8 = r7.pointToPosition(r1, r8)
            if (r8 == r4) goto Lbb
            int r1 = r7.getSelectedItemPosition()
            if (r8 == r1) goto Lbb
            int r1 = r7.getFirstVisiblePosition()
            int r1 = r8 - r1
            android.view.View r1 = r7.getChildAt(r1)
            boolean r3 = r1.isEnabled()
            if (r3 == 0) goto La4
            r7.requestFocus()
            r3 = 30
            if (r0 < r3) goto L98
            boolean r0 = a.A5.b.d
            if (r0 == 0) goto L98
            java.lang.reflect.Method r0 = a.A5.b.f11a     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8e
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8e
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1, r5, r6, r4}     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8e
            r0.invoke(r7, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8e
            java.lang.reflect.Method r0 = a.A5.b.b     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8e
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8e
            r0.invoke(r7, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8e
            java.lang.reflect.Method r0 = a.A5.b.c     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8e
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8e
            r0.invoke(r7, r8)     // Catch: java.lang.reflect.InvocationTargetException -> L8c java.lang.IllegalAccessException -> L8e
            goto La4
        L8c:
            r8 = move-exception
            goto L90
        L8e:
            r8 = move-exception
            goto L94
        L90:
            r8.printStackTrace()
            goto La4
        L94:
            r8.printStackTrace()
            goto La4
        L98:
            int r0 = r1.getTop()
            int r1 = r7.getTop()
            int r0 = r0 - r1
            r7.setSelectionFromTop(r8, r0)
        La4:
            android.graphics.drawable.Drawable r8 = r7.getSelector()
            if (r8 == 0) goto Lbb
            boolean r0 = r7.j
            if (r0 == 0) goto Lbb
            boolean r0 = r7.isPressed()
            if (r0 == 0) goto Lbb
            int[] r0 = r7.getDrawableState()
            r8.setState(r0)
        Lbb:
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
            a.A5$f r0 = r3.l
            if (r0 == 0) goto L23
            a.A5 r1 = r0.f13a
            r2 = 0
            r1.l = r2
            r1.removeCallbacks(r0)
        L23:
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
            a.A5$d r1 = new a.A5$d
            r1.<init>()
            android.graphics.drawable.Drawable r2 = r1.f776a
            if (r2 == 0) goto Lf
            r2.setCallback(r0)
        Lf:
            r1.f776a = r4
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
