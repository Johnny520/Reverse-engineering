package com.google.android.material.floatingactionbutton;

/* JADX INFO: loaded from: classes.dex */
public final class FloatingActionButton extends a.Zg implements a.InterfaceC0154g6, a.Zd, androidx.coordinatorlayout.widget.CoordinatorLayout.b {
    public android.content.res.ColorStateList b;
    public android.graphics.PorterDuff.Mode c;
    public android.content.res.ColorStateList d;
    public android.graphics.PorterDuff.Mode e;
    public android.content.res.ColorStateList f;
    public int g;
    public int h;
    public boolean i;

    public static class BaseBehavior<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> extends androidx.coordinatorlayout.widget.CoordinatorLayout.c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public android.graphics.Rect f1079a;
        public final boolean b;

        public BaseBehavior() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.b = r0
                return
        }

        public BaseBehavior(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = com.google.android.material.R.styleable.FloatingActionButton_Behavior_Layout
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                int r3 = com.google.android.material.R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide
                r0 = 1
                boolean r3 = r2.getBoolean(r3, r0)
                r1.b = r3
                r2.recycle()
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean a(android.view.View r1) {
                r0 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton r1 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r1
                r1.getLeft()
                r1 = 0
                throw r1
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
                com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
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
                com.google.android.material.floatingactionbutton.FloatingActionButton r9 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r9
                java.util.ArrayList r0 = r8.e(r9)
                int r1 = r0.size()
                r2 = 0
                r3 = r2
            Lc:
                if (r3 >= r1) goto L3d
                java.lang.Object r4 = r0.get(r3)
                android.view.View r4 = (android.view.View) r4
                boolean r5 = r4 instanceof com.google.android.material.appbar.AppBarLayout
                if (r5 == 0) goto L21
                com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
                boolean r4 = r7.s(r8, r4, r9)
                if (r4 == 0) goto L3a
                goto L3d
            L21:
                android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                boolean r6 = r5 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.f
                if (r6 == 0) goto L30
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r5
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r5 = r5.f879a
                boolean r5 = r5 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
                goto L31
            L30:
                r5 = r2
            L31:
                if (r5 == 0) goto L3a
                boolean r4 = r7.t(r4, r9)
                if (r4 == 0) goto L3a
                goto L3d
            L3a:
                int r3 = r3 + 1
                goto Lc
            L3d:
                r8.q(r9, r10)
                r8 = 1
                return r8
        }

        public final boolean s(androidx.coordinatorlayout.widget.CoordinatorLayout r5, com.google.android.material.appbar.AppBarLayout r6, com.google.android.material.floatingactionbutton.FloatingActionButton r7) {
                r4 = this;
                android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r0
                boolean r1 = r4.b
                r2 = 1
                r3 = 0
                if (r1 != 0) goto Ld
                goto L1c
            Ld:
                int r0 = r0.f
                int r1 = r6.getId()
                if (r0 == r1) goto L16
                goto L1c
            L16:
                int r0 = r7.getUserSetVisibility()
                if (r0 == 0) goto L1e
            L1c:
                r0 = r3
                goto L1f
            L1e:
                r0 = r2
            L1f:
                if (r0 != 0) goto L22
                return r3
            L22:
                android.graphics.Rect r0 = r4.f1079a
                if (r0 != 0) goto L2d
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r4.f1079a = r0
            L2d:
                android.graphics.Rect r0 = r4.f1079a
                a.W4.a(r5, r6, r0)
                int r5 = r0.bottom
                int r6 = r6.getMinimumHeightForVisibleOverlappingContent()
                r0 = 0
                if (r5 > r6) goto L3f
                r7.f(r0, r3)
                goto L42
            L3f:
                r7.j(r0, r3)
            L42:
                return r2
        }

        public final boolean t(android.view.View r5, com.google.android.material.floatingactionbutton.FloatingActionButton r6) {
                r4 = this;
                android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r0
                boolean r1 = r4.b
                r2 = 1
                r3 = 0
                if (r1 != 0) goto Ld
                goto L1c
            Ld:
                int r0 = r0.f
                int r1 = r5.getId()
                if (r0 == r1) goto L16
                goto L1c
            L16:
                int r0 = r6.getUserSetVisibility()
                if (r0 == 0) goto L1e
            L1c:
                r0 = r3
                goto L1f
            L1e:
                r0 = r2
            L1f:
                if (r0 != 0) goto L22
                return r3
            L22:
                android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r0
                int r5 = r5.getTop()
                int r1 = r6.getHeight()
                int r1 = r1 / 2
                int r0 = r0.topMargin
                int r1 = r1 + r0
                r0 = 0
                if (r5 >= r1) goto L3c
                r6.f(r0, r3)
                goto L3f
            L3c:
                r6.j(r0, r3)
            L3f:
                return r2
        }
    }

    public static class Behavior extends com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior<com.google.android.material.floatingactionbutton.FloatingActionButton> {
        public Behavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public Behavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public static abstract class a {
        public void a(com.google.android.material.floatingactionbutton.FloatingActionButton r1) {
                r0 = this;
                return
        }

        public void b() {
                r0 = this;
                return
        }
    }

    public class b<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> implements com.google.android.material.floatingactionbutton.b.a {
        @Override // com.google.android.material.floatingactionbutton.b.a
        public final void a() {
                r1 = this;
                r0 = 0
                throw r0
        }

        public final boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton.b
                if (r0 != 0) goto L6
                r2 = 0
                return r2
            L6:
                com.google.android.material.floatingactionbutton.FloatingActionButton$b r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton.b) r2
                r2.getClass()
                r2 = 0
                throw r2
        }

        public final int hashCode() {
                r1 = this;
                r0 = 0
                throw r0
        }
    }

    private com.google.android.material.floatingactionbutton.b getImpl() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // a.InterfaceC0154g6
    public final boolean a() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public final void b() {
            r2 = this;
            com.google.android.material.floatingactionbutton.b r0 = r2.getImpl()
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r1 = r0.n
            if (r1 != 0) goto Lf
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.n = r1
        Lf:
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r0.n
            r1 = 0
            r0.add(r1)
            return
    }

    public final void c(a.C0311p2 r3) {
            r2 = this;
            com.google.android.material.floatingactionbutton.b r0 = r2.getImpl()
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r1 = r0.m
            if (r1 != 0) goto Lf
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.m = r1
        Lf:
            java.util.ArrayList<android.animation.Animator$AnimatorListener> r0 = r0.m
            r0.add(r3)
            return
    }

    public final void d() {
            r3 = this;
            com.google.android.material.floatingactionbutton.b r0 = r3.getImpl()
            com.google.android.material.floatingactionbutton.FloatingActionButton$b r1 = new com.google.android.material.floatingactionbutton.FloatingActionButton$b
            r1.<init>()
            java.util.ArrayList<com.google.android.material.floatingactionbutton.b$a> r2 = r0.o
            if (r2 != 0) goto L14
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.o = r2
        L14:
            java.util.ArrayList<com.google.android.material.floatingactionbutton.b$a> r0 = r0.o
            r0.add(r1)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            r1.getDrawableState()
            r0.getClass()
            r0 = 0
            throw r0
    }

    public final int e(int r4) {
            r3 = this;
            int r0 = r3.h
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.res.Resources r0 = r3.getResources()
            r1 = -1
            r2 = 1
            if (r4 == r1) goto L1d
            if (r4 == r2) goto L16
            int r4 = com.google.android.material.R.dimen.design_fab_size_normal
            int r4 = r0.getDimensionPixelSize(r4)
            return r4
        L16:
            int r4 = com.google.android.material.R.dimen.design_fab_size_mini
            int r4 = r0.getDimensionPixelSize(r4)
            return r4
        L1d:
            android.content.res.Configuration r4 = r0.getConfiguration()
            int r4 = r4.screenWidthDp
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenHeightDp
            int r4 = java.lang.Math.max(r4, r0)
            r0 = 470(0x1d6, float:6.59E-43)
            if (r4 >= r0) goto L36
            int r4 = r3.e(r2)
            return r4
        L36:
            r4 = 0
            int r4 = r3.e(r4)
            return r4
    }

    public final void f(a.C0329q2 r2, boolean r3) {
            r1 = this;
            com.google.android.material.floatingactionbutton.b r3 = r1.getImpl()
            if (r2 != 0) goto L7
            goto Lc
        L7:
            com.google.android.material.floatingactionbutton.a r0 = new com.google.android.material.floatingactionbutton.a
            r0.<init>(r1, r2)
        Lc:
            r3.getClass()
            r2 = 0
            throw r2
    }

    public final boolean g() {
            r1 = this;
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            r0.getClass()
            r0 = 0
            throw r0
    }

    @Override // android.view.View
    public android.content.res.ColorStateList getBackgroundTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.b
            return r0
    }

    @Override // android.view.View
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.c
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public androidx.coordinatorlayout.widget.CoordinatorLayout.c<com.google.android.material.floatingactionbutton.FloatingActionButton> getBehavior() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior r0 = new com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior
            r0.<init>()
            return r0
    }

    public float getCompatElevation() {
            r1 = this;
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            r0.getClass()
            r0 = 0
            throw r0
    }

    public float getCompatHoveredFocusedTranslationZ() {
            r1 = this;
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            float r0 = r0.d
            return r0
    }

    public float getCompatPressedTranslationZ() {
            r1 = this;
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            float r0 = r0.e
            return r0
    }

    public android.graphics.drawable.Drawable getContentBackground() {
            r1 = this;
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            r0.getClass()
            r0 = 0
            return r0
    }

    public int getCustomSize() {
            r1 = this;
            int r0 = r1.h
            return r0
    }

    public int getExpandedComponentIdHint() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public a.C0409ub getHideMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            a.ub r0 = r0.h
            return r0
    }

    @java.lang.Deprecated
    public int getRippleColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f
            if (r0 == 0) goto L9
            int r0 = r0.getDefaultColor()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.res.ColorStateList getRippleColorStateList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f
            return r0
    }

    public a.Vd getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            a.Vd r0 = r0.f1081a
            r0.getClass()
            return r0
    }

    public a.C0409ub getShowMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            a.ub r0 = r0.g
            return r0
    }

    public int getSize() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    public int getSizeDimension() {
            r1 = this;
            int r0 = r1.g
            int r0 = r1.e(r0)
            return r0
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.getBackgroundTintList()
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.getBackgroundTintMode()
            return r0
    }

    public android.content.res.ColorStateList getSupportImageTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.d
            return r0
    }

    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.e
            return r0
    }

    public boolean getUseCompatPadding() {
            r1 = this;
            boolean r0 = r1.i
            return r0
    }

    public final boolean h() {
            r1 = this;
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            r0.getClass()
            r0 = 0
            throw r0
    }

    public final void i() {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.getDrawable()
            if (r0 != 0) goto L7
            return
        L7:
            android.content.res.ColorStateList r1 = r4.d
            if (r1 != 0) goto Lf
            r0.clearColorFilter()
            return
        Lf:
            int[] r2 = r4.getDrawableState()
            r3 = 0
            int r1 = r1.getColorForState(r2, r3)
            android.graphics.PorterDuff$Mode r2 = r4.e
            if (r2 != 0) goto L1e
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
        L1e:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.PorterDuffColorFilter r1 = a.Y0.c(r1, r2)
            r0.setColorFilter(r1)
            return
    }

    public final void j(a.C0329q2.a r2, boolean r3) {
            r1 = this;
            com.google.android.material.floatingactionbutton.b r3 = r1.getImpl()
            if (r2 != 0) goto L7
            goto Lc
        L7:
            com.google.android.material.floatingactionbutton.a r0 = new com.google.android.material.floatingactionbutton.a
            r0.<init>(r1, r2)
        Lc:
            r3.getClass()
            r2 = 0
            throw r2
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            r0.getClass()
            r0 = 0
            throw r0
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            r0.getClass()
            boolean r0 = r0 instanceof a.G6
            if (r0 == 0) goto Lf
            return
        Lf:
            r0 = 0
            throw r0
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            r0.getClass()
            r0 = 0
            throw r0
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int r1, int r2) {
            r0 = this;
            r0.getSizeDimension()
            com.google.android.material.floatingactionbutton.b r1 = r0.getImpl()
            r1.f()
            r1 = 0
            throw r1
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof a.C0190i6
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r3)
            return
        L8:
            a.i6 r3 = (a.C0190i6) r3
            android.os.Parcelable r0 = r3.f661a
            super.onRestoreInstanceState(r0)
            a.ge<java.lang.String, android.os.Bundle> r3 = r3.c
            java.lang.String r0 = "expandableWidgetHelper"
            r1 = 0
            java.lang.Object r3 = r3.getOrDefault(r0, r1)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r3.getClass()
            throw r1
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r1 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            if (r0 != 0) goto Lb
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        Lb:
            a.ge r0 = new a.ge
            r0.<init>()
            r0 = 0
            throw r0
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            int r0 = r2.getAction()
            if (r0 == 0) goto Lb
            boolean r2 = super.onTouchEvent(r2)
            return r2
        Lb:
            r1.getMeasuredWidth()
            r1.getMeasuredHeight()
            r2 = 0
            throw r2
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            java.lang.String r2 = "FloatingActionButton"
            java.lang.String r0 = "Setting a custom background is not supported."
            android.util.Log.i(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            java.lang.String r2 = "FloatingActionButton"
            java.lang.String r0 = "Setting a custom background is not supported."
            android.util.Log.i(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            java.lang.String r2 = "FloatingActionButton"
            java.lang.String r0 = "Setting a custom background is not supported."
            android.util.Log.i(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.b
            if (r0 == r2) goto Ld
            r1.b = r2
            com.google.android.material.floatingactionbutton.b r2 = r1.getImpl()
            r2.getClass()
        Ld:
            return
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.c
            if (r0 == r2) goto Ld
            r1.c = r2
            com.google.android.material.floatingactionbutton.b r2 = r1.getImpl()
            r2.getClass()
        Ld:
            return
    }

    public void setCompatElevation(float r4) {
            r3 = this;
            com.google.android.material.floatingactionbutton.b r0 = r3.getImpl()
            float r1 = r0.c
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L13
            r0.c = r4
            float r1 = r0.d
            float r2 = r0.e
            r0.d(r4, r1, r2)
        L13:
            return
    }

    public void setCompatElevationResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setCompatElevation(r2)
            return
    }

    public void setCompatHoveredFocusedTranslationZ(float r4) {
            r3 = this;
            com.google.android.material.floatingactionbutton.b r0 = r3.getImpl()
            float r1 = r0.d
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L13
            r0.d = r4
            float r1 = r0.c
            float r2 = r0.e
            r0.d(r1, r4, r2)
        L13:
            return
    }

    public void setCompatHoveredFocusedTranslationZResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setCompatHoveredFocusedTranslationZ(r2)
            return
    }

    public void setCompatPressedTranslationZ(float r4) {
            r3 = this;
            com.google.android.material.floatingactionbutton.b r0 = r3.getImpl()
            float r1 = r0.e
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L13
            r0.e = r4
            float r1 = r0.c
            float r2 = r0.d
            r0.d(r1, r2, r4)
        L13:
            return
    }

    public void setCompatPressedTranslationZResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setCompatPressedTranslationZ(r2)
            return
    }

    public void setCustomSize(int r2) {
            r1 = this;
            if (r2 < 0) goto Lc
            int r0 = r1.h
            if (r2 == r0) goto Lb
            r1.h = r2
            r1.requestLayout()
        Lb:
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Custom size must be non-negative"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            com.google.android.material.floatingactionbutton.b r1 = r0.getImpl()
            r1.getClass()
            return
    }

    public void setEnsureMinTouchTargetSize(boolean r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            boolean r0 = r0.b
            if (r2 == r0) goto L11
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            r0.b = r2
            r1.requestLayout()
        L11:
            return
    }

    public void setExpandedComponentIdHint(int r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setHideMotionSpec(a.C0409ub r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            r0.h = r2
            return
    }

    public void setHideMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            a.ub r2 = a.C0409ub.a(r0, r2)
            r1.setHideMotionSpec(r2)
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            if (r0 != r3) goto L7
            return
        L7:
            super.setImageDrawable(r3)
            com.google.android.material.floatingactionbutton.b r3 = r2.getImpl()
            float r0 = r3.j
            r3.j = r0
            r1 = 0
            r3.a(r0, r1)
            r3 = 0
            throw r3
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setMaxImageSize(int r3) {
            r2 = this;
            com.google.android.material.floatingactionbutton.b r0 = r2.getImpl()
            int r1 = r0.k
            if (r1 != r3) goto L9
            return
        L9:
            r0.k = r3
            float r3 = r0.j
            r0.j = r3
            r1 = 0
            r0.a(r3, r1)
            r3 = 0
            throw r3
    }

    public void setRippleColor(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setRippleColor(r1)
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f
            if (r0 == r2) goto Ld
            r1.f = r2
            com.google.android.material.floatingactionbutton.b r2 = r1.getImpl()
            r2.getClass()
        Ld:
            return
    }

    @Override // android.view.View
    public void setScaleX(float r2) {
            r1 = this;
            super.setScaleX(r2)
            com.google.android.material.floatingactionbutton.b r2 = r1.getImpl()
            java.util.ArrayList<com.google.android.material.floatingactionbutton.b$a> r2 = r2.o
            if (r2 == 0) goto L21
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L16
            goto L21
        L16:
            java.lang.Object r2 = r2.next()
            com.google.android.material.floatingactionbutton.b$a r2 = (com.google.android.material.floatingactionbutton.b.a) r2
            r2.a()
            r2 = 0
            throw r2
        L21:
            return
    }

    @Override // android.view.View
    public void setScaleY(float r2) {
            r1 = this;
            super.setScaleY(r2)
            com.google.android.material.floatingactionbutton.b r2 = r1.getImpl()
            java.util.ArrayList<com.google.android.material.floatingactionbutton.b$a> r2 = r2.o
            if (r2 == 0) goto L21
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L16
            goto L21
        L16:
            java.lang.Object r2 = r2.next()
            com.google.android.material.floatingactionbutton.b$a r2 = (com.google.android.material.floatingactionbutton.b.a) r2
            r2.a()
            r2 = 0
            throw r2
        L21:
            return
    }

    public void setShadowPaddingEnabled(boolean r1) {
            r0 = this;
            com.google.android.material.floatingactionbutton.b r1 = r0.getImpl()
            r1.getClass()
            r1.f()
            r1 = 0
            throw r1
    }

    @Override // a.Zd
    public void setShapeAppearanceModel(a.Vd r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            r0.f1081a = r2
            return
    }

    public void setShowMotionSpec(a.C0409ub r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.b r0 = r1.getImpl()
            r0.g = r2
            return
    }

    public void setShowMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            a.ub r2 = a.C0409ub.a(r0, r2)
            r1.setShowMotionSpec(r2)
            return
    }

    public void setSize(int r2) {
            r1 = this;
            r0 = 0
            r1.h = r0
            int r0 = r1.g
            if (r2 == r0) goto Lc
            r1.g = r2
            r1.requestLayout()
        Lc:
            return
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.setBackgroundTintList(r1)
            return
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.setBackgroundTintMode(r1)
            return
    }

    public void setSupportImageTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.d
            if (r0 == r2) goto L9
            r1.d = r2
            r1.i()
        L9:
            return
    }

    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.e
            if (r0 == r2) goto L9
            r1.e = r2
            r1.i()
        L9:
            return
    }

    @Override // android.view.View
    public void setTranslationX(float r1) {
            r0 = this;
            super.setTranslationX(r1)
            com.google.android.material.floatingactionbutton.b r1 = r0.getImpl()
            r1.e()
            return
    }

    @Override // android.view.View
    public void setTranslationY(float r1) {
            r0 = this;
            super.setTranslationY(r1)
            com.google.android.material.floatingactionbutton.b r1 = r0.getImpl()
            r1.e()
            return
    }

    @Override // android.view.View
    public void setTranslationZ(float r1) {
            r0 = this;
            super.setTranslationZ(r1)
            com.google.android.material.floatingactionbutton.b r1 = r0.getImpl()
            r1.e()
            return
    }

    public void setUseCompatPadding(boolean r2) {
            r1 = this;
            boolean r0 = r1.i
            if (r0 != r2) goto L5
            return
        L5:
            r1.i = r2
            com.google.android.material.floatingactionbutton.b r2 = r1.getImpl()
            r2.getClass()
            r2 = 0
            throw r2
    }

    @Override // a.Zg, android.widget.ImageView, android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            return
    }
}
