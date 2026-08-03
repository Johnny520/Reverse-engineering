package com.google.android.material.floatingactionbutton;

/* JADX INFO: loaded from: classes.dex */
public final class ExtendedFloatingActionButton extends com.google.android.material.button.MaterialButton implements androidx.coordinatorlayout.widget.CoordinatorLayout.b {

    public static class ExtendedFloatingActionButtonBehavior<T extends com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> extends androidx.coordinatorlayout.widget.CoordinatorLayout.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public android.graphics.Rect f1078a;
        public final boolean b;
        public final boolean c;

        public ExtendedFloatingActionButtonBehavior() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.b = r0
                r0 = 1
                r1.c = r0
                return
        }

        public ExtendedFloatingActionButtonBehavior(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_Behavior_Layout
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                int r3 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide
                r0 = 0
                boolean r3 = r2.getBoolean(r3, r0)
                r1.b = r3
                int r3 = com.google.android.material.R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink
                r0 = 1
                boolean r3 = r2.getBoolean(r3, r0)
                r1.c = r3
                r2.recycle()
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ boolean a(android.view.View r1) {
                r0 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r1
                r1 = 0
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void c(androidx.coordinatorlayout.widget.CoordinatorLayout.f r2) {
                r1 = this;
                int r0 = r2.h
                if (r0 != 0) goto L8
                r0 = 80
                r2.h = r0
            L8:
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5) {
                r2 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r4 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r4
                boolean r0 = r5 instanceof com.google.android.material.appbar.AppBarLayout
                r1 = 0
                if (r0 == 0) goto Ld
                com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
                r2.s(r3, r5, r4)
                goto L22
            Ld:
                android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
                boolean r0 = r3 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.f
                if (r0 == 0) goto L1c
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r3
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r3 = r3.f879a
                boolean r3 = r3 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
                goto L1d
            L1c:
                r3 = r1
            L1d:
                if (r3 == 0) goto L22
                r2.t(r5, r4)
            L22:
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10) {
                r7 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r9 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r9
                java.util.ArrayList r0 = r8.e(r9)
                int r1 = r0.size()
                r2 = 0
                r3 = r2
            Lc:
                if (r3 >= r1) goto L36
                java.lang.Object r4 = r0.get(r3)
                android.view.View r4 = (android.view.View) r4
                boolean r5 = r4 instanceof com.google.android.material.appbar.AppBarLayout
                if (r5 == 0) goto L1e
                com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
                r7.s(r8, r4, r9)
                goto L33
            L1e:
                android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                boolean r6 = r5 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.f
                if (r6 == 0) goto L2d
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r5
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r5 = r5.f879a
                boolean r5 = r5 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
                goto L2e
            L2d:
                r5 = r2
            L2e:
                if (r5 == 0) goto L33
                r7.t(r4, r9)
            L33:
                int r3 = r3 + 1
                goto Lc
            L36:
                r8.q(r9, r10)
                r8 = 1
                return r8
        }

        public final void s(androidx.coordinatorlayout.widget.CoordinatorLayout r3, com.google.android.material.appbar.AppBarLayout r4, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r5) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r0
                boolean r1 = r2.b
                if (r1 != 0) goto Lf
                boolean r1 = r2.c
                if (r1 != 0) goto Lf
                goto L17
            Lf:
                int r0 = r0.f
                int r1 = r4.getId()
                if (r0 == r1) goto L18
            L17:
                return
            L18:
                android.graphics.Rect r0 = r2.f1078a
                if (r0 != 0) goto L23
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r2.f1078a = r0
            L23:
                android.graphics.Rect r0 = r2.f1078a
                a.W4.a(r3, r4, r0)
                int r3 = r0.bottom
                int r4 = r4.getMinimumHeightForVisibleOverlappingContent()
                r0 = 0
                if (r3 > r4) goto L3c
                boolean r3 = r2.c
                if (r3 == 0) goto L37
                r3 = 2
                goto L38
            L37:
                r3 = 1
            L38:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.e(r5, r3)
                throw r0
            L3c:
                boolean r3 = r2.c
                if (r3 == 0) goto L42
                r3 = 3
                goto L43
            L42:
                r3 = 0
            L43:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.e(r5, r3)
                throw r0
        }

        public final void t(android.view.View r4, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r5) {
                r3 = this;
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r0
                boolean r1 = r3.b
                if (r1 != 0) goto Lf
                boolean r1 = r3.c
                if (r1 != 0) goto Lf
                goto L17
            Lf:
                int r0 = r0.f
                int r1 = r4.getId()
                if (r0 == r1) goto L18
            L17:
                return
            L18:
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r0
                int r4 = r4.getTop()
                int r1 = r5.getHeight()
                r2 = 2
                int r1 = r1 / r2
                int r0 = r0.topMargin
                int r1 = r1 + r0
                r0 = 0
                if (r4 >= r1) goto L38
                boolean r4 = r3.c
                if (r4 == 0) goto L33
                goto L34
            L33:
                r2 = 1
            L34:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.e(r5, r2)
                throw r0
            L38:
                boolean r4 = r3.c
                if (r4 == 0) goto L3e
                r4 = 3
                goto L3f
            L3e:
                r4 = 0
            L3f:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.e(r5, r4)
                throw r0
        }
    }

    public class a extends android.util.Property<android.view.View, java.lang.Float> {
        @Override // android.util.Property
        public final java.lang.Float get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                int r1 = r1.width
                float r1 = (float) r1
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }

        @Override // android.util.Property
        public final void set(android.view.View r2, java.lang.Float r3) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                java.lang.Float r3 = (java.lang.Float) r3
                android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
                int r3 = r3.intValue()
                r0.width = r3
                r2.requestLayout()
                return
        }
    }

    public class b extends android.util.Property<android.view.View, java.lang.Float> {
        @Override // android.util.Property
        public final java.lang.Float get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                int r1 = r1.height
                float r1 = (float) r1
                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                return r1
        }

        @Override // android.util.Property
        public final void set(android.view.View r2, java.lang.Float r3) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                java.lang.Float r3 = (java.lang.Float) r3
                android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
                int r3 = r3.intValue()
                r0.height = r3
                r2.requestLayout()
                return
        }
    }

    public class c extends android.util.Property<android.view.View, java.lang.Float> {
        @Override // android.util.Property
        public final java.lang.Float get(android.view.View r2) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
                int r2 = r2.getPaddingStart()
                float r2 = (float) r2
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                return r2
        }

        @Override // android.util.Property
        public final void set(android.view.View r4, java.lang.Float r5) {
                r3 = this;
                android.view.View r4 = (android.view.View) r4
                java.lang.Float r5 = (java.lang.Float) r5
                int r5 = r5.intValue()
                int r0 = r4.getPaddingTop()
                java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
                int r1 = r4.getPaddingEnd()
                int r2 = r4.getPaddingBottom()
                r4.setPaddingRelative(r5, r0, r1, r2)
                return
        }
    }

    public class d extends android.util.Property<android.view.View, java.lang.Float> {
        @Override // android.util.Property
        public final java.lang.Float get(android.view.View r2) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
                int r2 = r2.getPaddingEnd()
                float r2 = (float) r2
                java.lang.Float r2 = java.lang.Float.valueOf(r2)
                return r2
        }

        @Override // android.util.Property
        public final void set(android.view.View r4, java.lang.Float r5) {
                r3 = this;
                android.view.View r4 = (android.view.View) r4
                java.lang.Float r5 = (java.lang.Float) r5
                java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
                int r0 = r4.getPaddingStart()
                int r1 = r4.getPaddingTop()
                int r5 = r5.intValue()
                int r2 = r4.getPaddingBottom()
                r4.setPaddingRelative(r0, r1, r5, r2)
                return
        }
    }

    static {
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "width"
            r0.<init>(r1, r2)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b
            java.lang.String r2 = "height"
            r0.<init>(r1, r2)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c
            java.lang.String r2 = "paddingStart"
            r0.<init>(r1, r2)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d
            java.lang.String r2 = "paddingEnd"
            r0.<init>(r1, r2)
            return
    }

    public static void e(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1, int r2) {
            if (r2 == 0) goto L17
            r1 = 1
            if (r2 == r1) goto L17
            r1 = 2
            if (r2 == r1) goto L17
            r1 = 3
            if (r2 == r1) goto L17
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unknown strategy type: "
            java.lang.String r2 = a.C0487z.e(r0, r2)
            r1.<init>(r2)
            throw r1
        L17:
            r1 = 0
            throw r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public androidx.coordinatorlayout.widget.CoordinatorLayout.c<com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> getBehavior() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int getCollapsedPadding() {
            r2 = this;
            int r0 = r2.getCollapsedSize()
            int r1 = r2.getIconSize()
            int r0 = r0 - r1
            int r0 = r0 / 2
            return r0
    }

    public int getCollapsedSize() {
            r1 = this;
            r0 = 0
            return r0
    }

    public a.C0409ub getExtendMotionSpec() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public a.C0409ub getHideMotionSpec() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public a.C0409ub getShowMotionSpec() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public a.C0409ub getShrinkMotionSpec() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public void setAnimateShowBeforeLayout(boolean r1) {
            r0 = this;
            return
    }

    public void setExtendMotionSpec(a.C0409ub r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setExtendMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            a.ub r2 = a.C0409ub.a(r0, r2)
            r1.setExtendMotionSpec(r2)
            return
    }

    public void setExtended(boolean r1) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            r1 = 0
            throw r1
    }

    public void setHideMotionSpec(a.C0409ub r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setHideMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            a.ub r2 = a.C0409ub.a(r0, r2)
            r1.setHideMotionSpec(r2)
            return
    }

    public void setShowMotionSpec(a.C0409ub r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setShowMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            a.ub r2 = a.C0409ub.a(r0, r2)
            r1.setShowMotionSpec(r2)
            return
    }

    public void setShrinkMotionSpec(a.C0409ub r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setShrinkMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            a.ub r2 = a.C0409ub.a(r0, r2)
            r1.setShrinkMotionSpec(r2)
            return
    }

    @Override // android.widget.TextView
    public void setTextColor(int r1) {
            r0 = this;
            super.setTextColor(r1)
            r0.getTextColors()
            return
    }

    @Override // android.widget.TextView
    public void setTextColor(android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTextColor(r1)
            r0.getTextColors()
            return
    }
}
