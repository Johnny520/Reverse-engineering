package com.google.android.material.snackbar;

import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1089a = 0;

    public static class Behavior extends com.google.android.material.behavior.SwipeDismissBehavior<android.view.View> {
        public final com.google.android.material.snackbar.BaseTransientBottomBar.b i;

        public Behavior() {
                r4 = this;
                r4.<init>()
                com.google.android.material.snackbar.BaseTransientBottomBar$b r0 = new com.google.android.material.snackbar.BaseTransientBottomBar$b
                r0.<init>()
                r1 = 0
                r2 = 1036831949(0x3dcccccd, float:0.1)
                float r2 = java.lang.Math.max(r1, r2)
                r3 = 1065353216(0x3f800000, float:1.0)
                float r2 = java.lang.Math.min(r2, r3)
                r4.f = r2
                r2 = 1058642330(0x3f19999a, float:0.6)
                float r1 = java.lang.Math.max(r1, r2)
                float r1 = java.lang.Math.min(r1, r3)
                r4.g = r1
                r1 = 0
                r4.d = r1
                r4.i = r0
                return
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.MotionEvent r5) {
                r2 = this;
                com.google.android.material.snackbar.BaseTransientBottomBar$b r0 = r2.i
                r0.getClass()
                int r0 = r5.getActionMasked()
                if (r0 == 0) goto L1e
                r1 = 1
                if (r0 == r1) goto L12
                r1 = 3
                if (r0 == r1) goto L12
                goto L3a
            L12:
                a.je r0 = a.C0215je.a()
                java.lang.Object r0 = r0.f534a
                monitor-enter(r0)
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
                goto L3a
            L1b:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
                throw r3
            L1e:
                float r0 = r5.getX()
                int r0 = (int) r0
                float r1 = r5.getY()
                int r1 = (int) r1
                boolean r0 = r3.l(r4, r0, r1)
                if (r0 == 0) goto L3a
                a.je r0 = a.C0215je.a()
                java.lang.Object r0 = r0.f534a
                monitor-enter(r0)
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
                goto L3a
            L37:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
                throw r3
            L3a:
                boolean r3 = super.g(r3, r4, r5)
                return r3
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public final boolean s(android.view.View r2) {
                r1 = this;
                com.google.android.material.snackbar.BaseTransientBottomBar$b r0 = r1.i
                r0.getClass()
                boolean r2 = r2 instanceof com.google.android.material.snackbar.BaseTransientBottomBar.c
                return r2
        }
    }

    public class a implements android.os.Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(android.os.Message r4) {
                r3 = this;
                int r0 = r4.what
                r1 = 0
                if (r0 == 0) goto L12
                r2 = 1
                if (r0 == r2) goto La
                r4 = 0
                return r4
            La:
                java.lang.Object r4 = r4.obj
                com.google.android.material.snackbar.BaseTransientBottomBar r4 = (com.google.android.material.snackbar.BaseTransientBottomBar) r4
                r4.getClass()
                throw r1
            L12:
                java.lang.Object r4 = r4.obj
                com.google.android.material.snackbar.BaseTransientBottomBar r4 = (com.google.android.material.snackbar.BaseTransientBottomBar) r4
                r4.getClass()
                throw r1
        }
    }

    public static class b {
    }

    public static class c extends android.widget.FrameLayout {
        public static final com.google.android.material.snackbar.BaseTransientBottomBar.c.a j = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.google.android.material.snackbar.BaseTransientBottomBar<?> f1090a;
        public final a.Vd b;
        public int c;
        public final float d;
        public final float e;
        public final int f;
        public final int g;
        public android.content.res.ColorStateList h;
        public android.graphics.PorterDuff.Mode i;

        public class a implements android.view.View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @android.annotation.SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(android.view.View r1, android.view.MotionEvent r2) {
                    r0 = this;
                    r1 = 1
                    return r1
            }
        }

        static {
                com.google.android.material.snackbar.BaseTransientBottomBar$c$a r0 = new com.google.android.material.snackbar.BaseTransientBottomBar$c$a
                r0.<init>()
                com.google.android.material.snackbar.BaseTransientBottomBar.c.j = r0
                return
        }

        public c(android.content.Context r5, android.util.AttributeSet r6) {
                r4 = this;
                r0 = 0
                android.content.Context r5 = a.Wa.a(r5, r6, r0, r0)
                r4.<init>(r5, r6)
                android.content.Context r5 = r4.getContext()
                int[] r1 = com.google.android.material.R.styleable.SnackbarLayout
                android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1)
                int r2 = com.google.android.material.R.styleable.SnackbarLayout_elevation
                boolean r2 = r1.hasValue(r2)
                if (r2 == 0) goto L26
                int r2 = com.google.android.material.R.styleable.SnackbarLayout_elevation
                int r2 = r1.getDimensionPixelSize(r2, r0)
                float r2 = (float) r2
                java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
                a.C0414ug.d.s(r4, r2)
            L26:
                int r2 = com.google.android.material.R.styleable.SnackbarLayout_animationMode
                int r2 = r1.getInt(r2, r0)
                r4.c = r2
                int r2 = com.google.android.material.R.styleable.SnackbarLayout_shapeAppearance
                boolean r2 = r1.hasValue(r2)
                if (r2 != 0) goto L3e
                int r2 = com.google.android.material.R.styleable.SnackbarLayout_shapeAppearanceOverlay
                boolean r2 = r1.hasValue(r2)
                if (r2 == 0) goto L48
            L3e:
                a.Vd$a r6 = a.Vd.b(r5, r6, r0, r0)
                a.Vd r6 = r6.a()
                r4.b = r6
            L48:
                int r6 = com.google.android.material.R.styleable.SnackbarLayout_backgroundOverlayColorAlpha
                r2 = 1065353216(0x3f800000, float:1.0)
                float r6 = r1.getFloat(r6, r2)
                r4.d = r6
                int r6 = com.google.android.material.R.styleable.SnackbarLayout_backgroundTint
                android.content.res.ColorStateList r5 = a.Sa.b(r5, r1, r6)
                r4.setBackgroundTintList(r5)
                int r5 = com.google.android.material.R.styleable.SnackbarLayout_backgroundTintMode
                r6 = -1
                int r5 = r1.getInt(r5, r6)
                android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
                android.graphics.PorterDuff$Mode r5 = a.Rg.b(r5, r3)
                r4.setBackgroundTintMode(r5)
                int r5 = com.google.android.material.R.styleable.SnackbarLayout_actionTextColorAlpha
                float r5 = r1.getFloat(r5, r2)
                r4.e = r5
                int r5 = com.google.android.material.R.styleable.SnackbarLayout_android_maxWidth
                int r5 = r1.getDimensionPixelSize(r5, r6)
                r4.f = r5
                int r5 = com.google.android.material.R.styleable.SnackbarLayout_maxActionInlineWidth
                int r5 = r1.getDimensionPixelSize(r5, r6)
                r4.g = r5
                r1.recycle()
                com.google.android.material.snackbar.BaseTransientBottomBar$c$a r5 = com.google.android.material.snackbar.BaseTransientBottomBar.c.j
                r4.setOnTouchListener(r5)
                r5 = 1
                r4.setFocusable(r5)
                android.graphics.drawable.Drawable r5 = r4.getBackground()
                if (r5 != 0) goto Le3
                int r5 = com.google.android.material.R.attr.colorSurface
                int r6 = com.google.android.material.R.attr.colorOnSurface
                float r1 = r4.getBackgroundOverlayColorAlpha()
                int r5 = a.Na.b(r4, r5)
                int r6 = a.Na.b(r4, r6)
                int r5 = a.Na.d(r5, r6, r1)
                a.Vd r6 = r4.b
                if (r6 == 0) goto Lbc
                int r0 = com.google.android.material.snackbar.BaseTransientBottomBar.f1089a
                a.Ta r0 = new a.Ta
                r0.<init>(r6)
                android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
                r0.k(r5)
                goto Ld7
            Lbc:
                android.content.res.Resources r6 = r4.getResources()
                int r1 = com.google.android.material.snackbar.BaseTransientBottomBar.f1089a
                int r1 = com.google.android.material.R.dimen.mtrl_snackbar_background_corner_radius
                float r6 = r6.getDimension(r1)
                android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
                r1.<init>()
                r1.setShape(r0)
                r1.setCornerRadius(r6)
                r1.setColor(r5)
                r0 = r1
            Ld7:
                android.content.res.ColorStateList r5 = r4.h
                if (r5 == 0) goto Lde
                a.C0439w5.a.h(r0, r5)
            Lde:
                java.util.WeakHashMap<android.view.View, a.Jg> r5 = a.C0414ug.f721a
                r4.setBackground(r0)
            Le3:
                return
        }

        private void setBaseTransientBottomBar(com.google.android.material.snackbar.BaseTransientBottomBar<?> r1) {
                r0 = this;
                r0.f1090a = r1
                return
        }

        public float getActionTextColorAlpha() {
                r1 = this;
                float r0 = r1.e
                return r0
        }

        public int getAnimationMode() {
                r1 = this;
                int r0 = r1.c
                return r0
        }

        public float getBackgroundOverlayColorAlpha() {
                r1 = this;
                float r0 = r1.d
                return r0
        }

        public int getMaxInlineActionWidth() {
                r1 = this;
                int r0 = r1.g
                return r0
        }

        public int getMaxWidth() {
                r1 = this;
                int r0 = r1.f
                return r0
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
                r2 = this;
                super.onAttachedToWindow()
                com.google.android.material.snackbar.BaseTransientBottomBar<?> r0 = r2.f1090a
                if (r0 == 0) goto L13
                r0.getClass()
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 29
                if (r0 >= r1) goto L11
                goto L13
            L11:
                r0 = 0
                throw r0
            L13:
                java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
                a.C0414ug.c.c(r2)
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
                r2 = this;
                super.onDetachedFromWindow()
                com.google.android.material.snackbar.BaseTransientBottomBar<?> r0 = r2.f1090a
                if (r0 == 0) goto L13
                a.je r0 = a.C0215je.a()
                java.lang.Object r0 = r0.f534a
                monitor-enter(r0)
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
                return
            L10:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
                throw r1
            L13:
                return
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                super.onLayout(r1, r2, r3, r4, r5)
                r1 = r0
                com.google.android.material.snackbar.BaseTransientBottomBar<?> r2 = r1.f1090a
                if (r2 != 0) goto L9
                return
            L9:
                r2 = 0
                throw r2
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int r2, int r3) {
                r1 = this;
                super.onMeasure(r2, r3)
                int r2 = r1.f
                if (r2 <= 0) goto L16
                int r0 = r1.getMeasuredWidth()
                if (r0 <= r2) goto L16
                r0 = 1073741824(0x40000000, float:2.0)
                int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
                super.onMeasure(r2, r3)
            L16:
                return
        }

        public void setAnimationMode(int r1) {
                r0 = this;
                r0.c = r1
                return
        }

        @Override // android.view.View
        public void setBackground(android.graphics.drawable.Drawable r1) {
                r0 = this;
                r0.setBackgroundDrawable(r1)
                return
        }

        @Override // android.view.View
        public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
                r1 = this;
                if (r2 == 0) goto L14
                android.content.res.ColorStateList r0 = r1.h
                if (r0 == 0) goto L14
                android.graphics.drawable.Drawable r2 = r2.mutate()
                android.content.res.ColorStateList r0 = r1.h
                a.C0439w5.a.h(r2, r0)
                android.graphics.PorterDuff$Mode r0 = r1.i
                a.C0439w5.a.i(r2, r0)
            L14:
                super.setBackgroundDrawable(r2)
                return
        }

        @Override // android.view.View
        public void setBackgroundTintList(android.content.res.ColorStateList r2) {
                r1 = this;
                r1.h = r2
                android.graphics.drawable.Drawable r0 = r1.getBackground()
                if (r0 == 0) goto L21
                android.graphics.drawable.Drawable r0 = r1.getBackground()
                android.graphics.drawable.Drawable r0 = r0.mutate()
                a.C0439w5.a.h(r0, r2)
                android.graphics.PorterDuff$Mode r2 = r1.i
                a.C0439w5.a.i(r0, r2)
                android.graphics.drawable.Drawable r2 = r1.getBackground()
                if (r0 == r2) goto L21
                super.setBackgroundDrawable(r0)
            L21:
                return
        }

        @Override // android.view.View
        public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
                r1 = this;
                r1.i = r2
                android.graphics.drawable.Drawable r0 = r1.getBackground()
                if (r0 == 0) goto L1c
                android.graphics.drawable.Drawable r0 = r1.getBackground()
                android.graphics.drawable.Drawable r0 = r0.mutate()
                a.C0439w5.a.i(r0, r2)
                android.graphics.drawable.Drawable r2 = r1.getBackground()
                if (r0 == r2) goto L1c
                super.setBackgroundDrawable(r0)
            L1c:
                return
        }

        @Override // android.view.View
        public void setLayoutParams(android.view.ViewGroup.LayoutParams r5) {
                r4 = this;
                super.setLayoutParams(r5)
                boolean r0 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r0 == 0) goto L1f
                android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
                android.graphics.Rect r0 = new android.graphics.Rect
                int r1 = r5.leftMargin
                int r2 = r5.topMargin
                int r3 = r5.rightMargin
                int r5 = r5.bottomMargin
                r0.<init>(r1, r2, r3, r5)
                com.google.android.material.snackbar.BaseTransientBottomBar<?> r5 = r4.f1090a
                if (r5 != 0) goto L1b
                goto L1f
            L1b:
                int r5 = com.google.android.material.snackbar.BaseTransientBottomBar.f1089a
                r5 = 0
                throw r5
            L1f:
                return
        }

        @Override // android.view.View
        public void setOnClickListener(android.view.View.OnClickListener r2) {
                r1 = this;
                if (r2 == 0) goto L4
                r0 = 0
                goto L6
            L4:
                com.google.android.material.snackbar.BaseTransientBottomBar$c$a r0 = com.google.android.material.snackbar.BaseTransientBottomBar.c.j
            L6:
                r1.setOnTouchListener(r0)
                super.setOnClickListener(r2)
                return
        }
    }

    static {
            android.view.animation.LinearInterpolator r0 = a.C0434w0.f744a
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            com.google.android.material.snackbar.BaseTransientBottomBar$a r2 = new com.google.android.material.snackbar.BaseTransientBottomBar$a
            r2.<init>()
            r0.<init>(r1, r2)
            return
    }
}
