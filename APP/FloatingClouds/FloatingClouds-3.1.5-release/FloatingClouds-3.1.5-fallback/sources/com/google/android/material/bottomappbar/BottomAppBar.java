package com.google.android.material.bottomappbar;

/* JADX INFO: loaded from: classes.dex */
public final class BottomAppBar extends androidx.appcompat.widget.Toolbar implements androidx.coordinatorlayout.widget.CoordinatorLayout.b {
    public static final int i0 = 0;
    public static final int j0 = 0;
    public java.lang.Integer U;
    public android.animation.AnimatorSet V;
    public android.animation.AnimatorSet W;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public boolean f0;
    public boolean g0;
    public com.google.android.material.bottomappbar.BottomAppBar.Behavior h0;

    public static class Behavior extends com.google.android.material.behavior.HideBottomViewOnScrollBehavior<com.google.android.material.bottomappbar.BottomAppBar> {
        public final android.graphics.Rect l;
        public java.lang.ref.WeakReference<com.google.android.material.bottomappbar.BottomAppBar> m;
        public int n;
        public final com.google.android.material.bottomappbar.BottomAppBar.Behavior.a o;

        public class a implements android.view.View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar.Behavior f1047a;

            public a(com.google.android.material.bottomappbar.BottomAppBar.Behavior r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f1047a = r1
                    return
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
                    r0 = this;
                    com.google.android.material.bottomappbar.BottomAppBar$Behavior r2 = r0.f1047a
                    java.lang.ref.WeakReference<com.google.android.material.bottomappbar.BottomAppBar> r3 = r2.m
                    java.lang.Object r3 = r3.get()
                    com.google.android.material.bottomappbar.BottomAppBar r3 = (com.google.android.material.bottomappbar.BottomAppBar) r3
                    if (r3 == 0) goto L78
                    boolean r4 = r1 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
                    if (r4 != 0) goto L15
                    boolean r4 = r1 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
                    if (r4 != 0) goto L15
                    goto L78
                L15:
                    int r4 = r1.getHeight()
                    boolean r5 = r1 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
                    r6 = 0
                    if (r5 != 0) goto L67
                    android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
                    androidx.coordinatorlayout.widget.CoordinatorLayout$f r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r5
                    int r2 = r2.n
                    if (r2 != 0) goto L61
                    int r2 = r3.c0
                    r7 = 1
                    if (r2 != r7) goto L46
                    int r2 = r1.getMeasuredHeight()
                    int r2 = r2 - r4
                    int r2 = r2 / 2
                    android.content.res.Resources r4 = r3.getResources()
                    int r7 = com.google.android.material.R.dimen.mtrl_bottomappbar_fab_bottom_margin
                    int r4 = r4.getDimensionPixelOffset(r7)
                    int r4 = r4 - r2
                    int r2 = com.google.android.material.bottomappbar.BottomAppBar.w(r3)
                    int r2 = r2 + r4
                    r5.bottomMargin = r2
                L46:
                    int r2 = com.google.android.material.bottomappbar.BottomAppBar.x(r3)
                    r5.leftMargin = r2
                    int r2 = com.google.android.material.bottomappbar.BottomAppBar.y(r3)
                    r5.rightMargin = r2
                    boolean r1 = a.Rg.a(r1)
                    if (r1 == 0) goto L5d
                    int r1 = r5.leftMargin
                    r5.leftMargin = r1
                    goto L61
                L5d:
                    int r1 = r5.rightMargin
                    r5.rightMargin = r1
                L61:
                    int r1 = com.google.android.material.bottomappbar.BottomAppBar.i0
                    r3.D()
                    throw r6
                L67:
                    com.google.android.material.floatingactionbutton.FloatingActionButton r1 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r1
                    int r3 = r1.getMeasuredWidth()
                    int r1 = r1.getMeasuredHeight()
                    r4 = 0
                    android.graphics.Rect r2 = r2.l
                    r2.set(r4, r4, r3, r1)
                    throw r6
                L78:
                    r1.removeOnLayoutChangeListener(r0)
                    return
            }
        }

        public Behavior() {
                r1 = this;
                r1.<init>()
                com.google.android.material.bottomappbar.BottomAppBar$Behavior$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$Behavior$a
                r0.<init>(r1)
                r1.o = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.l = r0
                return
        }

        public Behavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                com.google.android.material.bottomappbar.BottomAppBar$Behavior$a r1 = new com.google.android.material.bottomappbar.BottomAppBar$Behavior$a
                r1.<init>(r0)
                r0.o = r1
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.l = r1
                return
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, int r5) {
                r2 = this;
                com.google.android.material.bottomappbar.BottomAppBar r4 = (com.google.android.material.bottomappbar.BottomAppBar) r4
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r4)
                r2.m = r0
                int r0 = com.google.android.material.bottomappbar.BottomAppBar.i0
                android.view.View r0 = r4.z()
                if (r0 == 0) goto L74
                java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
                boolean r1 = r0.isLaidOut()
                if (r1 != 0) goto L74
                android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r3
                r5 = 17
                r3.d = r5
                int r5 = r4.c0
                r1 = 1
                if (r5 != r1) goto L2c
                r1 = 49
                r3.d = r1
            L2c:
                if (r5 != 0) goto L34
                int r5 = r3.d
                r5 = r5 | 80
                r3.d = r5
            L34:
                android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r3
                int r3 = r3.bottomMargin
                r2.n = r3
                boolean r3 = r0 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
                if (r3 == 0) goto L6a
                r3 = r0
                com.google.android.material.floatingactionbutton.FloatingActionButton r3 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r3
                a.ub r5 = r3.getShowMotionSpec()
                if (r5 != 0) goto L50
                int r5 = com.google.android.material.R.animator.mtrl_fab_show_motion_spec
                r3.setShowMotionSpecResource(r5)
            L50:
                a.ub r5 = r3.getHideMotionSpec()
                if (r5 != 0) goto L5b
                int r5 = com.google.android.material.R.animator.mtrl_fab_hide_motion_spec
                r3.setHideMotionSpecResource(r5)
            L5b:
                r3.b()
                a.p2 r5 = new a.p2
                r1 = 2
                r5.<init>(r4, r1)
                r3.c(r5)
                r3.d()
            L6a:
                com.google.android.material.bottomappbar.BottomAppBar$Behavior$a r3 = r2.o
                r0.addOnLayoutChangeListener(r3)
                r4.D()
                r3 = 0
                throw r3
            L74:
                r3.q(r4, r5)
                super.h(r3, r4, r5)
                r3 = 0
                return r3
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, android.view.View r10, android.view.View r11, int r12, int r13) {
                r7 = this;
                r2 = r9
                com.google.android.material.bottomappbar.BottomAppBar r2 = (com.google.android.material.bottomappbar.BottomAppBar) r2
                boolean r9 = r2.getHideOnScroll()
                if (r9 == 0) goto L17
                r0 = r7
                r1 = r8
                r3 = r10
                r4 = r11
                r5 = r12
                r6 = r13
                boolean r8 = super.p(r1, r2, r3, r4, r5, r6)
                if (r8 == 0) goto L17
                r8 = 1
                return r8
            L17:
                r8 = 0
                return r8
        }
    }

    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.widget.ActionMenuView f1048a;
        public final /* synthetic */ int b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar d;

        public a(com.google.android.material.bottomappbar.BottomAppBar r1, androidx.appcompat.widget.ActionMenuView r2, int r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.d = r1
                r0.f1048a = r2
                r0.b = r3
                r0.c = r4
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                int r0 = r4.b
                boolean r1 = r4.c
                com.google.android.material.bottomappbar.BottomAppBar r2 = r4.d
                androidx.appcompat.widget.ActionMenuView r3 = r4.f1048a
                int r0 = r2.A(r3, r0, r1)
                float r0 = (float) r0
                r3.setTranslationX(r0)
                return
        }
    }

    public static class b extends a.r {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomappbar.BottomAppBar.b> CREATOR = null;
        public int c;
        public boolean d;

        public class a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.bottomappbar.BottomAppBar.b> {
            @Override // android.os.Parcelable.Creator
            public final java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    com.google.android.material.bottomappbar.BottomAppBar$b r0 = new com.google.android.material.bottomappbar.BottomAppBar$b
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final com.google.android.material.bottomappbar.BottomAppBar.b createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    com.google.android.material.bottomappbar.BottomAppBar$b r0 = new com.google.android.material.bottomappbar.BottomAppBar$b
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.bottomappbar.BottomAppBar$b[] r1 = new com.google.android.material.bottomappbar.BottomAppBar.b[r1]
                    return r1
            }
        }

        static {
                com.google.android.material.bottomappbar.BottomAppBar$b$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$b$a
                r0.<init>()
                com.google.android.material.bottomappbar.BottomAppBar.b.CREATOR = r0
                return
        }

        public b(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r2 = r1.readInt()
                r0.c = r2
                int r1 = r1.readInt()
                if (r1 == 0) goto L11
                r1 = 1
                goto L12
            L11:
                r1 = 0
            L12:
                r0.d = r1
                return
        }

        @Override // a.r, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.c
                r1.writeInt(r2)
                boolean r2 = r0.d
                r1.writeInt(r2)
                return
        }
    }

    static {
            int r0 = com.google.android.material.R.attr.motionDurationLong2
            com.google.android.material.bottomappbar.BottomAppBar.i0 = r0
            int r0 = com.google.android.material.R.attr.motionEasingEmphasizedInterpolator
            com.google.android.material.bottomappbar.BottomAppBar.j0 = r0
            return
    }

    private androidx.appcompat.widget.ActionMenuView getActionMenuView() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L15
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof androidx.appcompat.widget.ActionMenuView
            if (r2 == 0) goto L12
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            return r1
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            r0 = 0
            return r0
    }

    private int getBottomInset() {
            r1 = this;
            r0 = 0
            return r0
    }

    private int getFabAlignmentAnimationDuration() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            int r1 = com.google.android.material.bottomappbar.BottomAppBar.i0
            r2 = 300(0x12c, float:4.2E-43)
            int r0 = a.C0445wb.c(r0, r1, r2)
            return r0
    }

    private float getFabTranslationX() {
            r1 = this;
            int r0 = r1.a0
            float r0 = r1.B(r0)
            return r0
    }

    private float getFabTranslationY() {
            r3 = this;
            int r0 = r3.c0
            r1 = 1
            if (r0 != r1) goto Ld
            a.s2 r0 = r3.getTopEdgeTreatment()
            float r0 = r0.c
            float r0 = -r0
            return r0
        Ld:
            android.view.View r0 = r3.z()
            if (r0 == 0) goto L25
            int r1 = r3.getMeasuredHeight()
            int r2 = r3.getBottomInset()
            int r1 = r1 + r2
            int r0 = r0.getMeasuredHeight()
            int r1 = r1 - r0
            int r0 = -r1
            int r0 = r0 / 2
            goto L26
        L25:
            r0 = 0
        L26:
            float r0 = (float) r0
            return r0
    }

    private int getLeftInset() {
            r1 = this;
            r0 = 0
            return r0
    }

    private int getRightInset() {
            r1 = this;
            r0 = 0
            return r0
    }

    private a.C0364s2 getTopEdgeTreatment() {
            r1 = this;
            r0 = 0
            throw r0
    }

    public static /* synthetic */ int w(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.getBottomInset()
            return r0
    }

    public static /* synthetic */ int x(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.getLeftInset()
            return r0
    }

    public static /* synthetic */ int y(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.getRightInset()
            return r0
    }

    public final int A(androidx.appcompat.widget.ActionMenuView r6, int r7, boolean r8) {
            r5 = this;
            int r0 = r5.e0
            r1 = 0
            r2 = 1
            if (r0 == r2) goto Lb
            if (r7 != r2) goto La
            if (r8 != 0) goto Lb
        La:
            return r1
        Lb:
            boolean r7 = a.Rg.a(r5)
            if (r7 == 0) goto L16
            int r8 = r5.getMeasuredWidth()
            goto L17
        L16:
            r8 = r1
        L17:
            r0 = r1
        L18:
            int r2 = r5.getChildCount()
            if (r0 >= r2) goto L51
            android.view.View r2 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            boolean r3 = r3 instanceof androidx.appcompat.widget.Toolbar.g
            if (r3 == 0) goto L4e
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.appcompat.widget.Toolbar$g r3 = (androidx.appcompat.widget.Toolbar.g) r3
            int r3 = r3.f156a
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r4
            r4 = 8388611(0x800003, float:1.1754948E-38)
            if (r3 != r4) goto L4e
            if (r7 == 0) goto L46
            int r2 = r2.getLeft()
            int r8 = java.lang.Math.min(r8, r2)
            goto L4e
        L46:
            int r2 = r2.getRight()
            int r8 = java.lang.Math.max(r8, r2)
        L4e:
            int r0 = r0 + 1
            goto L18
        L51:
            if (r7 == 0) goto L58
            int r6 = r6.getRight()
            goto L5c
        L58:
            int r6 = r6.getLeft()
        L5c:
            android.graphics.drawable.Drawable r0 = r5.getNavigationIcon()
            if (r0 != 0) goto L72
            android.content.res.Resources r0 = r5.getResources()
            int r1 = com.google.android.material.R.dimen.m3_bottomappbar_horizontal_padding
            int r0 = r0.getDimensionPixelOffset(r1)
            if (r7 == 0) goto L70
            r1 = r0
            goto L72
        L70:
            int r7 = -r0
            r1 = r7
        L72:
            int r6 = r6 + r1
            int r8 = r8 - r6
            return r8
    }

    public final float B(int r5) {
            r4 = this;
            boolean r0 = a.Rg.a(r4)
            r1 = 1
            if (r5 != r1) goto L2a
            android.view.View r5 = r4.z()
            int r2 = r4.d0
            r3 = -1
            if (r2 == r3) goto L1c
            if (r5 == 0) goto L1c
            int r5 = r5.getMeasuredWidth()
            int r5 = r5 / 2
            int r2 = r4.d0
            int r5 = r5 + r2
            goto L1d
        L1c:
            r5 = 0
        L1d:
            int r2 = r4.getMeasuredWidth()
            int r2 = r2 / 2
            int r2 = r2 - r5
            if (r0 == 0) goto L27
            r1 = r3
        L27:
            int r2 = r2 * r1
            float r5 = (float) r2
            return r5
        L2a:
            r5 = 0
            return r5
    }

    public final boolean C() {
            r2 = this;
            android.view.View r0 = r2.z()
            boolean r1 = r0 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r1 == 0) goto Lb
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L16
            boolean r0 = r0.h()
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public final void D() {
            r2 = this;
            a.s2 r0 = r2.getTopEdgeTreatment()
            r2.getFabTranslationX()
            r0.getClass()
            boolean r0 = r2.g0
            if (r0 == 0) goto L17
            boolean r0 = r2.C()
            if (r0 == 0) goto L17
            int r0 = r2.c0
            r1 = 1
        L17:
            r0 = 0
            throw r0
    }

    public final void E(androidx.appcompat.widget.ActionMenuView r2, int r3, boolean r4, boolean r5) {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$a
            r0.<init>(r1, r2, r3, r4)
            if (r5 == 0) goto Lb
            r2.post(r0)
            return
        Lb:
            r0.run()
            return
    }

    public android.content.res.ColorStateList getBackgroundTint() {
            r1 = this;
            r0 = 0
            throw r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public /* bridge */ /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout.c getBehavior() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.getBehavior()
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public com.google.android.material.bottomappbar.BottomAppBar.Behavior getBehavior() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.h0
            if (r0 != 0) goto Lb
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = new com.google.android.material.bottomappbar.BottomAppBar$Behavior
            r0.<init>()
            r1.h0 = r0
        Lb:
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.h0
            return r0
    }

    public float getCradleVerticalOffset() {
            r1 = this;
            a.s2 r0 = r1.getTopEdgeTreatment()
            float r0 = r0.c
            return r0
    }

    public int getFabAlignmentMode() {
            r1 = this;
            int r0 = r1.a0
            return r0
    }

    public int getFabAlignmentModeEndMargin() {
            r1 = this;
            int r0 = r1.d0
            return r0
    }

    public int getFabAnchorMode() {
            r1 = this;
            int r0 = r1.c0
            return r0
    }

    public int getFabAnimationMode() {
            r1 = this;
            int r0 = r1.b0
            return r0
    }

    public float getFabCradleMargin() {
            r1 = this;
            a.s2 r0 = r1.getTopEdgeTreatment()
            float r0 = r0.b
            return r0
    }

    public float getFabCradleRoundedCornerRadius() {
            r1 = this;
            a.s2 r0 = r1.getTopEdgeTreatment()
            float r0 = r0.f677a
            return r0
    }

    public boolean getHideOnScroll() {
            r1 = this;
            boolean r0 = r1.f0
            return r0
    }

    public int getMenuAlignmentMode() {
            r1 = this;
            int r0 = r1.e0
            return r0
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 0
            a.C0282n9.A(r1, r0)
            throw r0
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            r2 = r1
            r1 = r0
            if (r2 == 0) goto L1a
            android.animation.AnimatorSet r2 = r1.W
            if (r2 == 0) goto Le
            r2.cancel()
        Le:
            android.animation.AnimatorSet r2 = r1.V
            if (r2 == 0) goto L15
            r2.cancel()
        L15:
            r0.D()
            r2 = 0
            throw r2
        L1a:
            androidx.appcompat.widget.ActionMenuView r2 = r0.getActionMenuView()
            if (r2 == 0) goto L3b
            android.animation.AnimatorSet r3 = r1.W
            if (r3 != 0) goto L3b
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r3)
            boolean r3 = r0.C()
            r4 = 0
            if (r3 != 0) goto L34
            r0.E(r2, r4, r4, r4)
            return
        L34:
            int r3 = r1.a0
            boolean r5 = r1.g0
            r0.E(r2, r3, r5, r4)
        L3b:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.bottomappbar.BottomAppBar.b
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.bottomappbar.BottomAppBar$b r2 = (com.google.android.material.bottomappbar.BottomAppBar.b) r2
            android.os.Parcelable r0 = r2.f661a
            super.onRestoreInstanceState(r0)
            int r0 = r2.c
            r1.a0 = r0
            boolean r2 = r2.d
            r1.g0 = r2
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.bottomappbar.BottomAppBar$b r1 = new com.google.android.material.bottomappbar.BottomAppBar$b
            r1.<init>(r0)
            int r0 = r2.a0
            r1.c = r0
            boolean r0 = r2.g0
            r1.d = r0
            return r1
    }

    public void setBackgroundTint(android.content.res.ColorStateList r2) {
            r1 = this;
            r0 = 0
            a.C0439w5.a.h(r0, r2)
            return
    }

    public void setCradleVerticalOffset(float r3) {
            r2 = this;
            float r0 = r2.getCradleVerticalOffset()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L20
            a.s2 r0 = r2.getTopEdgeTreatment()
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 < 0) goto L15
            r0.c = r3
            r3 = 0
            throw r3
        L15:
            r0.getClass()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "cradleVerticalOffset must be positive."
            r3.<init>(r0)
            throw r3
        L20:
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            r1 = 0
            throw r1
    }

    public void setFabAlignmentMode(int r13) {
            r12 = this;
            r0 = 1
            r1 = 0
            boolean r2 = r12.g0
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            boolean r3 = r12.isLaidOut()
            if (r3 != 0) goto Le
            goto La4
        Le:
            android.animation.AnimatorSet r3 = r12.W
            if (r3 == 0) goto L15
            r3.cancel()
        L15:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r4 = r12.C()
            if (r4 != 0) goto L23
            r2 = r1
            r4 = r2
            goto L24
        L23:
            r4 = r13
        L24:
            androidx.appcompat.widget.ActionMenuView r5 = r12.getActionMenuView()
            if (r5 != 0) goto L2b
            goto L8d
        L2b:
            int r6 = r12.getFabAlignmentAnimationDuration()
            float r6 = (float) r6
            r7 = 1065353216(0x3f800000, float:1.0)
            float[] r8 = new float[r0]
            r8[r1] = r7
            java.lang.String r9 = "alpha"
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r5, r9, r8)
            r10 = 1061997773(0x3f4ccccd, float:0.8)
            float r10 = r10 * r6
            long r10 = (long) r10
            r8.setDuration(r10)
            float r10 = r5.getTranslationX()
            int r11 = r12.A(r5, r4, r2)
            float r11 = (float) r11
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r10 <= 0) goto L82
            float[] r7 = new float[r0]
            r10 = 0
            r7[r1] = r10
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r5, r9, r7)
            r9 = 1045220557(0x3e4ccccd, float:0.2)
            float r6 = r6 * r9
            long r9 = (long) r6
            r7.setDuration(r9)
            a.r2 r6 = new a.r2
            r6.<init>(r12, r5, r4, r2)
            r7.addListener(r6)
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r4 = 2
            android.animation.Animator[] r4 = new android.animation.Animator[r4]
            r4[r1] = r7
            r4[r0] = r8
            r2.playSequentially(r4)
            r3.add(r2)
            goto L8d
        L82:
            float r2 = r5.getAlpha()
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 >= 0) goto L8d
            r3.add(r8)
        L8d:
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r2.playTogether(r3)
            r12.W = r2
            a.p2 r3 = new a.p2
            r3.<init>(r12, r0)
            r2.addListener(r3)
            android.animation.AnimatorSet r2 = r12.W
            r2.start()
        La4:
            int r2 = r12.a0
            if (r2 == r13) goto L128
            boolean r2 = r12.isLaidOut()
            if (r2 != 0) goto Lb0
            goto L128
        Lb0:
            android.animation.AnimatorSet r2 = r12.V
            if (r2 == 0) goto Lb7
            r2.cancel()
        Lb7:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r12.b0
            r4 = 0
            if (r3 != r0) goto Le6
            android.view.View r3 = r12.z()
            boolean r5 = r3 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r5 == 0) goto Lcc
            r4 = r3
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
        Lcc:
            float r3 = r12.B(r13)
            float[] r0 = new float[r0]
            r0[r1] = r3
            java.lang.String r3 = "translationX"
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r4, r3, r0)
            int r3 = r12.getFabAlignmentAnimationDuration()
            long r3 = (long) r3
            r0.setDuration(r3)
            r2.add(r0)
            goto L102
        Le6:
            android.view.View r3 = r12.z()
            boolean r5 = r3 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r5 == 0) goto Lf1
            r4 = r3
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
        Lf1:
            if (r4 == 0) goto L102
            boolean r3 = r4.g()
            if (r3 == 0) goto Lfa
            goto L102
        Lfa:
            a.q2 r3 = new a.q2
            r3.<init>(r12, r13)
            r4.f(r3, r0)
        L102:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r0.playTogether(r2)
            android.content.Context r2 = r12.getContext()
            android.view.animation.LinearInterpolator r3 = a.C0434w0.f744a
            int r4 = com.google.android.material.bottomappbar.BottomAppBar.j0
            android.animation.TimeInterpolator r2 = a.C0445wb.d(r2, r4, r3)
            r0.setInterpolator(r2)
            r12.V = r0
            a.p2 r2 = new a.p2
            r2.<init>(r12, r1)
            r0.addListener(r2)
            android.animation.AnimatorSet r0 = r12.V
            r0.start()
        L128:
            r12.a0 = r13
            return
    }

    public void setFabAlignmentModeEndMargin(int r2) {
            r1 = this;
            int r0 = r1.d0
            if (r0 != r2) goto L5
            return
        L5:
            r1.d0 = r2
            r1.D()
            r2 = 0
            throw r2
    }

    public void setFabAnchorMode(int r1) {
            r0 = this;
            r0.c0 = r1
            r0.D()
            r1 = 0
            throw r1
    }

    public void setFabAnimationMode(int r1) {
            r0 = this;
            r0.b0 = r1
            return
    }

    public void setFabCornerSize(float r2) {
            r1 = this;
            a.s2 r0 = r1.getTopEdgeTreatment()
            float r0 = r0.d
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto Lb
            return
        Lb:
            a.s2 r0 = r1.getTopEdgeTreatment()
            r0.d = r2
            r2 = 0
            throw r2
    }

    public void setFabCradleMargin(float r2) {
            r1 = this;
            float r0 = r1.getFabCradleMargin()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            return
        L9:
            a.s2 r0 = r1.getTopEdgeTreatment()
            r0.b = r2
            r2 = 0
            throw r2
    }

    public void setFabCradleRoundedCornerRadius(float r2) {
            r1 = this;
            float r0 = r1.getFabCradleRoundedCornerRadius()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            return
        L9:
            a.s2 r0 = r1.getTopEdgeTreatment()
            r0.f677a = r2
            r2 = 0
            throw r2
    }

    public void setHideOnScroll(boolean r1) {
            r0 = this;
            r0.f0 = r1
            return
    }

    public void setMenuAlignmentMode(int r4) {
            r3 = this;
            int r0 = r3.e0
            if (r0 == r4) goto L16
            r3.e0 = r4
            androidx.appcompat.widget.ActionMenuView r4 = r3.getActionMenuView()
            if (r4 == 0) goto L16
            int r0 = r3.a0
            boolean r1 = r3.C()
            r2 = 0
            r3.E(r4, r0, r1, r2)
        L16:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L13
            java.lang.Integer r0 = r1.U
            if (r0 == 0) goto L13
            android.graphics.drawable.Drawable r2 = r2.mutate()
            java.lang.Integer r0 = r1.U
            int r0 = r0.intValue()
            a.C0439w5.a.g(r2, r0)
        L13:
            super.setNavigationIcon(r2)
            return
    }

    public void setNavigationIconTint(int r1) {
            r0 = this;
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.U = r1
            android.graphics.drawable.Drawable r1 = r0.getNavigationIcon()
            if (r1 == 0) goto Lf
            r0.setNavigationIcon(r1)
        Lf:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    public final android.view.View z() {
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            goto L3f
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            a.A2 r2 = r0.b
            java.lang.Object r2 = r2.b
            a.ge r2 = (a.C0162ge) r2
            java.lang.Object r2 = r2.getOrDefault(r4, r1)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r0 = r0.d
            r0.clear()
            if (r2 == 0) goto L26
            r0.addAll(r2)
        L26:
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L3e
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L2a
        L3e:
            return r2
        L3f:
            return r1
    }
}
