package com.google.android.material.sidesheet;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class SideSheetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.c<V> {
    public static final int w = 0;
    public static final int x = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.AbstractC0090ce f1086a;
    public final a.Ta b;
    public final android.content.res.ColorStateList c;
    public final a.Vd d;
    public final com.google.android.material.sidesheet.SideSheetBehavior<V>.c e;
    public final float f;
    public final boolean g;
    public int h;
    public a.C0504zg i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public java.lang.ref.WeakReference<V> p;
    public java.lang.ref.WeakReference<android.view.View> q;
    public final int r;
    public android.view.VelocityTracker s;
    public int t;
    public final java.util.LinkedHashSet u;
    public final com.google.android.material.sidesheet.SideSheetBehavior.a v;

    public class a extends a.C0504zg.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.sidesheet.SideSheetBehavior f1087a;

        public a(com.google.android.material.sidesheet.SideSheetBehavior r1) {
                r0 = this;
                r0.<init>()
                r0.f1087a = r1
                return
        }

        @Override // a.C0504zg.c
        public final int a(android.view.View r2, int r3) {
                r1 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r2 = r1.f1087a
                a.ce r0 = r2.f1086a
                int r0 = r0.f()
                a.ce r2 = r2.f1086a
                int r2 = r2.e()
                int r2 = a.C0282n9.j(r3, r0, r2)
                return r2
        }

        @Override // a.C0504zg.c
        public final int b(android.view.View r1, int r2) {
                r0 = this;
                int r1 = r1.getTop()
                return r1
        }

        @Override // a.C0504zg.c
        public final int c(android.view.View r2) {
                r1 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r2 = r1.f1087a
                int r0 = r2.l
                int r2 = r2.o
                int r0 = r0 + r2
                return r0
        }

        @Override // a.C0504zg.c
        public final void f(int r3) {
                r2 = this;
                r0 = 1
                if (r3 != r0) goto Lc
                com.google.android.material.sidesheet.SideSheetBehavior r3 = r2.f1087a
                boolean r1 = r3.g
                if (r1 == 0) goto Lc
                r3.s(r0)
            Lc:
                return
        }

        @Override // a.C0504zg.c
        public final void g(android.view.View r5, int r6, int r7) {
                r4 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r7 = r4.f1087a
                java.lang.ref.WeakReference<android.view.View> r0 = r7.q
                if (r0 == 0) goto Ld
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                goto Le
            Ld:
                r0 = 0
            Le:
                if (r0 == 0) goto L28
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
                if (r1 == 0) goto L28
                a.ce r2 = r7.f1086a
                int r3 = r5.getLeft()
                int r5 = r5.getRight()
                r2.n(r1, r3, r5)
                r0.setLayoutParams(r1)
            L28:
                java.util.LinkedHashSet r5 = r7.u
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L49
                a.ce r7 = r7.f1086a
                r7.b(r6)
                java.util.Iterator r5 = r5.iterator()
            L39:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L49
                java.lang.Object r6 = r5.next()
                a.be r6 = (a.InterfaceC0071be) r6
                r6.b()
                goto L39
            L49:
                return
        }

        @Override // a.C0504zg.c
        public final void h(android.view.View r3, float r4, float r5) {
                r2 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.f1087a
                a.ce r1 = r0.f1086a
                boolean r1 = r1.j(r4)
                if (r1 == 0) goto Lb
                goto L53
            Lb:
                a.ce r1 = r0.f1086a
                boolean r1 = r1.m(r3, r4)
                if (r1 == 0) goto L24
                a.ce r1 = r0.f1086a
                boolean r4 = r1.l(r4, r5)
                if (r4 != 0) goto L55
                a.ce r4 = r0.f1086a
                boolean r4 = r4.k(r3)
                if (r4 == 0) goto L53
                goto L55
            L24:
                r1 = 0
                int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r1 == 0) goto L36
                float r4 = java.lang.Math.abs(r4)
                float r5 = java.lang.Math.abs(r5)
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 <= 0) goto L36
                goto L55
            L36:
                int r4 = r3.getLeft()
                a.ce r5 = r0.f1086a
                int r5 = r5.c()
                int r5 = r4 - r5
                int r5 = java.lang.Math.abs(r5)
                a.ce r1 = r0.f1086a
                int r1 = r1.d()
                int r4 = r4 - r1
                int r4 = java.lang.Math.abs(r4)
                if (r5 >= r4) goto L55
            L53:
                r4 = 3
                goto L56
            L55:
                r4 = 5
            L56:
                r5 = 1
                r0.u(r3, r4, r5)
                return
        }

        @Override // a.C0504zg.c
        public final boolean i(android.view.View r4, int r5) {
                r3 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r5 = r3.f1087a
                int r0 = r5.h
                r1 = 0
                r2 = 1
                if (r0 != r2) goto L9
                return r1
            L9:
                java.lang.ref.WeakReference<V extends android.view.View> r5 = r5.p
                if (r5 == 0) goto L14
                java.lang.Object r5 = r5.get()
                if (r5 != r4) goto L14
                return r2
            L14:
                return r1
        }
    }

    public static class b extends a.r {
        public static final android.os.Parcelable.Creator<com.google.android.material.sidesheet.SideSheetBehavior.b> CREATOR = null;
        public final int c;

        public class a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.sidesheet.SideSheetBehavior.b> {
            @Override // android.os.Parcelable.Creator
            public final java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    com.google.android.material.sidesheet.SideSheetBehavior$b r0 = new com.google.android.material.sidesheet.SideSheetBehavior$b
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final com.google.android.material.sidesheet.SideSheetBehavior.b createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    com.google.android.material.sidesheet.SideSheetBehavior$b r0 = new com.google.android.material.sidesheet.SideSheetBehavior$b
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.sidesheet.SideSheetBehavior$b[] r1 = new com.google.android.material.sidesheet.SideSheetBehavior.b[r1]
                    return r1
            }
        }

        static {
                com.google.android.material.sidesheet.SideSheetBehavior$b$a r0 = new com.google.android.material.sidesheet.SideSheetBehavior$b$a
                r0.<init>()
                com.google.android.material.sidesheet.SideSheetBehavior.b.CREATOR = r0
                return
        }

        public b(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r1 = r1.readInt()
                r0.c = r1
                return
        }

        public b(com.google.android.material.sidesheet.SideSheetBehavior r2) {
                r1 = this;
                android.view.AbsSavedState r0 = android.view.AbsSavedState.EMPTY_STATE
                r1.<init>(r0)
                int r2 = r2.h
                r1.c = r2
                return
        }

        @Override // a.r, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.c
                r1.writeInt(r2)
                return
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1088a;
        public boolean b;
        public final a.M2 c;
        public final /* synthetic */ com.google.android.material.sidesheet.SideSheetBehavior d;

        public c(com.google.android.material.sidesheet.SideSheetBehavior r2) {
                r1 = this;
                r1.<init>()
                r1.d = r2
                a.M2 r2 = new a.M2
                r0 = 15
                r2.<init>(r0, r1)
                r1.c = r2
                return
        }

        public final void a(int r3) {
                r2 = this;
                com.google.android.material.sidesheet.SideSheetBehavior r0 = r2.d
                java.lang.ref.WeakReference<V extends android.view.View> r1 = r0.p
                if (r1 == 0) goto L25
                java.lang.Object r1 = r1.get()
                if (r1 != 0) goto Ld
                goto L25
            Ld:
                r2.f1088a = r3
                boolean r3 = r2.b
                if (r3 != 0) goto L25
                java.lang.ref.WeakReference<V extends android.view.View> r3 = r0.p
                java.lang.Object r3 = r3.get()
                android.view.View r3 = (android.view.View) r3
                a.M2 r0 = r2.c
                java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
                r3.postOnAnimation(r0)
                r3 = 1
                r2.b = r3
            L25:
                return
        }
    }

    static {
            int r0 = com.google.android.material.R.string.side_sheet_accessibility_pane_title
            com.google.android.material.sidesheet.SideSheetBehavior.w = r0
            int r0 = com.google.android.material.R.style.Widget_Material3_SideSheet
            com.google.android.material.sidesheet.SideSheetBehavior.x = r0
            return
    }

    public SideSheetBehavior() {
            r1 = this;
            r1.<init>()
            com.google.android.material.sidesheet.SideSheetBehavior$c r0 = new com.google.android.material.sidesheet.SideSheetBehavior$c
            r0.<init>(r1)
            r1.e = r0
            r0 = 1
            r1.g = r0
            r0 = 5
            r1.h = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r1.k = r0
            r0 = -1
            r1.r = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.u = r0
            com.google.android.material.sidesheet.SideSheetBehavior$a r0 = new com.google.android.material.sidesheet.SideSheetBehavior$a
            r0.<init>(r1)
            r1.v = r0
            return
    }

    public SideSheetBehavior(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            r5.<init>(r6, r7)
            com.google.android.material.sidesheet.SideSheetBehavior$c r0 = new com.google.android.material.sidesheet.SideSheetBehavior$c
            r0.<init>(r5)
            r5.e = r0
            r0 = 1
            r5.g = r0
            r1 = 5
            r5.h = r1
            r1 = 1036831949(0x3dcccccd, float:0.1)
            r5.k = r1
            r1 = -1
            r5.r = r1
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r5.u = r2
            com.google.android.material.sidesheet.SideSheetBehavior$a r2 = new com.google.android.material.sidesheet.SideSheetBehavior$a
            r2.<init>(r5)
            r5.v = r2
            int[] r2 = com.google.android.material.R.styleable.SideSheetBehavior_Layout
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r7, r2)
            int r3 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_backgroundTint
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L3c
            int r3 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_backgroundTint
            android.content.res.ColorStateList r3 = a.Sa.b(r6, r2, r3)
            r5.c = r3
        L3c:
            int r3 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_shapeAppearance
            boolean r3 = r2.hasValue(r3)
            if (r3 == 0) goto L51
            r3 = 0
            int r4 = com.google.android.material.sidesheet.SideSheetBehavior.x
            a.Vd$a r7 = a.Vd.b(r6, r7, r3, r4)
            a.Vd r7 = r7.a()
            r5.d = r7
        L51:
            int r7 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId
            boolean r7 = r2.hasValue(r7)
            if (r7 == 0) goto L82
            int r7 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_coplanarSiblingViewId
            int r7 = r2.getResourceId(r7, r1)
            r5.r = r7
            java.lang.ref.WeakReference<android.view.View> r3 = r5.q
            if (r3 == 0) goto L68
            r3.clear()
        L68:
            r3 = 0
            r5.q = r3
            java.lang.ref.WeakReference<V extends android.view.View> r3 = r5.p
            if (r3 == 0) goto L82
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r7 == r1) goto L82
            java.util.WeakHashMap<android.view.View, a.Jg> r7 = a.C0414ug.f721a
            boolean r7 = r3.isLaidOut()
            if (r7 == 0) goto L82
            r3.requestLayout()
        L82:
            a.Vd r7 = r5.d
            if (r7 != 0) goto L87
            goto Lb1
        L87:
            a.Ta r1 = new a.Ta
            r1.<init>(r7)
            r5.b = r1
            r1.i(r6)
            android.content.res.ColorStateList r7 = r5.c
            if (r7 == 0) goto L9b
            a.Ta r1 = r5.b
            r1.k(r7)
            goto Lb1
        L9b:
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            android.content.res.Resources$Theme r1 = r6.getTheme()
            r3 = 16842801(0x1010031, float:2.3693695E-38)
            r1.resolveAttribute(r3, r7, r0)
            a.Ta r1 = r5.b
            int r7 = r7.data
            r1.setTint(r7)
        Lb1:
            int r7 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_android_elevation
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r2.getDimension(r7, r1)
            r5.f = r7
            int r7 = com.google.android.material.R.styleable.SideSheetBehavior_Layout_behavior_draggable
            boolean r7 = r2.getBoolean(r7, r0)
            r5.g = r7
            r2.recycle()
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            r6.getScaledMaximumFlingVelocity()
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(androidx.coordinatorlayout.widget.CoordinatorLayout.f r1) {
            r0 = this;
            r1 = 0
            r0.p = r1
            r0.i = r1
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
            r1 = this;
            r0 = 0
            r1.p = r0
            r1.i = r0
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.MotionEvent r5) {
            r2 = this;
            boolean r3 = r4.isShown()
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L10
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            java.lang.CharSequence r3 = a.C0414ug.g.b(r4)
            if (r3 == 0) goto L59
        L10:
            boolean r3 = r2.g
            if (r3 == 0) goto L59
            int r3 = r5.getActionMasked()
            if (r3 != 0) goto L24
            android.view.VelocityTracker r4 = r2.s
            if (r4 == 0) goto L24
            r4.recycle()
            r4 = 0
            r2.s = r4
        L24:
            android.view.VelocityTracker r4 = r2.s
            if (r4 != 0) goto L2e
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r2.s = r4
        L2e:
            android.view.VelocityTracker r4 = r2.s
            r4.addMovement(r5)
            if (r3 == 0) goto L42
            if (r3 == r0) goto L3b
            r4 = 3
            if (r3 == r4) goto L3b
            goto L49
        L3b:
            boolean r3 = r2.j
            if (r3 == 0) goto L49
            r2.j = r1
            return r1
        L42:
            float r3 = r5.getX()
            int r3 = (int) r3
            r2.t = r3
        L49:
            boolean r3 = r2.j
            if (r3 != 0) goto L58
            a.zg r3 = r2.i
            if (r3 == 0) goto L58
            boolean r3 = r3.p(r5)
            if (r3 == 0) goto L58
            return r0
        L58:
            return r1
        L59:
            r2.j = r0
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r11, V r12, int r13) {
            r10 = this;
            a.Ta r0 = r10.b
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            boolean r1 = r11.getFitsSystemWindows()
            r2 = 1
            if (r1 == 0) goto L14
            boolean r1 = r12.getFitsSystemWindows()
            if (r1 != 0) goto L14
            r12.setFitsSystemWindows(r2)
        L14:
            java.lang.ref.WeakReference<V extends android.view.View> r1 = r10.p
            r3 = 0
            r4 = 5
            r5 = 0
            if (r1 != 0) goto La4
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r12)
            r10.p = r1
            android.content.Context r1 = r12.getContext()
            int r6 = com.google.android.material.R.attr.motionEasingStandardDecelerateInterpolator
            r7 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.Interpolator r7 = a.C0356rc.b(r5, r5, r5, r7)
            a.C0445wb.d(r1, r6, r7)
            int r6 = com.google.android.material.R.attr.motionDurationMedium2
            r7 = 300(0x12c, float:4.2E-43)
            a.C0445wb.c(r1, r6, r7)
            int r6 = com.google.android.material.R.attr.motionDurationShort3
            r7 = 150(0x96, float:2.1E-43)
            a.C0445wb.c(r1, r6, r7)
            int r6 = com.google.android.material.R.attr.motionDurationShort2
            r7 = 100
            a.C0445wb.c(r1, r6, r7)
            android.content.res.Resources r1 = r12.getResources()
            int r6 = com.google.android.material.R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink
            r1.getDimension(r6)
            int r6 = com.google.android.material.R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow
            r1.getDimension(r6)
            int r6 = com.google.android.material.R.dimen.m3_back_progress_side_container_max_scale_y_distance
            r1.getDimension(r6)
            if (r0 == 0) goto L6e
            r12.setBackground(r0)
            float r1 = r10.f
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 != 0) goto L6a
            float r1 = a.C0414ug.d.i(r12)
        L6a:
            r0.j(r1)
            goto L75
        L6e:
            android.content.res.ColorStateList r1 = r10.c
            if (r1 == 0) goto L75
            a.C0414ug.d.q(r12, r1)
        L75:
            int r1 = r10.h
            if (r1 != r4) goto L7b
            r1 = 4
            goto L7c
        L7b:
            r1 = r3
        L7c:
            int r6 = r12.getVisibility()
            if (r6 == r1) goto L85
            r12.setVisibility(r1)
        L85:
            r10.v()
            int r1 = r12.getImportantForAccessibility()
            if (r1 != 0) goto L91
            r12.setImportantForAccessibility(r2)
        L91:
            java.lang.CharSequence r1 = a.C0414ug.g.b(r12)
            if (r1 != 0) goto La4
            android.content.res.Resources r1 = r12.getResources()
            int r6 = com.google.android.material.sidesheet.SideSheetBehavior.w
            java.lang.String r1 = r1.getString(r6)
            a.C0414ug.k(r12, r1)
        La4:
            android.view.ViewGroup$LayoutParams r1 = r12.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r1
            int r1 = r1.c
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r13)
            r6 = 3
            if (r1 != r6) goto Lb5
            r1 = r2
            goto Lb6
        Lb5:
            r1 = r3
        Lb6:
            a.ce r7 = r10.f1086a
            if (r7 == 0) goto Lc0
            int r7 = r7.i()
            if (r7 == r1) goto L154
        Lc0:
            a.Vd r7 = r10.d
            r8 = 0
            if (r1 != 0) goto L10c
            a.yd r1 = new a.yd
            r1.<init>(r10)
            r10.f1086a = r1
            if (r7 == 0) goto L154
            java.lang.ref.WeakReference<V extends android.view.View> r1 = r10.p
            if (r1 == 0) goto Le9
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto Le9
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            boolean r9 = r9 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.f
            if (r9 == 0) goto Le9
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r8 = r1
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r8 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r8
        Le9:
            if (r8 == 0) goto Lf0
            int r1 = r8.rightMargin
            if (r1 <= 0) goto Lf0
            goto L154
        Lf0:
            a.Vd$a r1 = r7.e()
            a.s r7 = new a.s
            r7.<init>(r5)
            r1.f = r7
            a.s r7 = new a.s
            r7.<init>(r5)
            r1.g = r7
            a.Vd r1 = r1.a()
            if (r0 == 0) goto L154
            r0.setShapeAppearanceModel(r1)
            goto L154
        L10c:
            if (r1 != r2) goto L1fa
            a.v9 r1 = new a.v9
            r1.<init>(r10)
            r10.f1086a = r1
            if (r7 == 0) goto L154
            java.lang.ref.WeakReference<V extends android.view.View> r1 = r10.p
            if (r1 == 0) goto L132
            java.lang.Object r1 = r1.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L132
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            boolean r9 = r9 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.f
            if (r9 == 0) goto L132
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r8 = r1
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r8 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r8
        L132:
            if (r8 == 0) goto L139
            int r1 = r8.leftMargin
            if (r1 <= 0) goto L139
            goto L154
        L139:
            a.Vd$a r1 = r7.e()
            a.s r7 = new a.s
            r7.<init>(r5)
            r1.e = r7
            a.s r7 = new a.s
            r7.<init>(r5)
            r1.h = r7
            a.Vd r1 = r1.a()
            if (r0 == 0) goto L154
            r0.setShapeAppearanceModel(r1)
        L154:
            a.zg r0 = r10.i
            if (r0 != 0) goto L165
            a.zg r0 = new a.zg
            android.content.Context r1 = r11.getContext()
            com.google.android.material.sidesheet.SideSheetBehavior$a r5 = r10.v
            r0.<init>(r1, r11, r5)
            r10.i = r0
        L165:
            a.ce r0 = r10.f1086a
            int r0 = r0.g(r12)
            r11.q(r12, r13)
            int r13 = r11.getWidth()
            r10.m = r13
            a.ce r13 = r10.f1086a
            int r13 = r13.h(r11)
            r10.n = r13
            int r13 = r12.getWidth()
            r10.l = r13
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
            if (r13 == 0) goto L191
            a.ce r1 = r10.f1086a
            int r13 = r1.a(r13)
            goto L192
        L191:
            r13 = r3
        L192:
            r10.o = r13
            int r13 = r10.h
            if (r13 == r2) goto L1bc
            r1 = 2
            if (r13 == r1) goto L1bc
            if (r13 == r6) goto L1c4
            if (r13 != r4) goto L1a6
            a.ce r13 = r10.f1086a
            int r3 = r13.d()
            goto L1c4
        L1a6:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Unexpected value: "
            r12.<init>(r13)
            int r13 = r10.h
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L1bc:
            a.ce r13 = r10.f1086a
            int r13 = r13.g(r12)
            int r3 = r0 - r13
        L1c4:
            r12.offsetLeftAndRight(r3)
            java.lang.ref.WeakReference<android.view.View> r12 = r10.q
            if (r12 != 0) goto L1dd
            int r12 = r10.r
            r13 = -1
            if (r12 == r13) goto L1dd
            android.view.View r11 = r11.findViewById(r12)
            if (r11 == 0) goto L1dd
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            r12.<init>(r11)
            r10.q = r12
        L1dd:
            java.util.LinkedHashSet r11 = r10.u
            java.util.Iterator r11 = r11.iterator()
        L1e3:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L1f9
            java.lang.Object r12 = r11.next()
            a.be r12 = (a.InterfaceC0071be) r12
            boolean r13 = r12 instanceof a.AbstractC0144fe
            if (r13 == 0) goto L1e3
            a.fe r12 = (a.AbstractC0144fe) r12
            r12.getClass()
            goto L1e3
        L1f9:
            return r2
        L1fa:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Invalid sheet edge position value: "
            java.lang.String r13 = ". Must be 0 or 1."
            java.lang.String r12 = a.C0487z.c(r1, r12, r13)
            r11.<init>(r12)
            throw r11
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, int r6, int r7, int r8) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r4.getPaddingLeft()
            int r2 = r4.getPaddingRight()
            int r2 = r2 + r1
            int r1 = r0.leftMargin
            int r2 = r2 + r1
            int r1 = r0.rightMargin
            int r2 = r2 + r1
            int r2 = r2 + r7
            int r7 = r0.width
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r2, r7)
            int r7 = r4.getPaddingTop()
            int r4 = r4.getPaddingBottom()
            int r4 = r4 + r7
            int r7 = r0.topMargin
            int r4 = r4 + r7
            int r7 = r0.bottomMargin
            int r4 = r4 + r7
            int r7 = r0.height
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r8, r4, r7)
            r5.measure(r6, r4)
            r4 = 1
            return r4
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(android.view.View r1, android.os.Parcelable r2) {
            r0 = this;
            com.google.android.material.sidesheet.SideSheetBehavior$b r2 = (com.google.android.material.sidesheet.SideSheetBehavior.b) r2
            r1 = 1
            int r2 = r2.c
            if (r2 == r1) goto La
            r1 = 2
            if (r2 != r1) goto Lb
        La:
            r2 = 5
        Lb:
            r0.h = r2
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final android.os.Parcelable o(android.view.View r2) {
            r1 = this;
            com.google.android.material.sidesheet.SideSheetBehavior$b r2 = new com.google.android.material.sidesheet.SideSheetBehavior$b
            android.view.AbsSavedState r0 = android.view.View.BaseSavedState.EMPTY_STATE
            r2.<init>(r1)
            return r2
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.MotionEvent r6) {
            r3 = this;
            boolean r4 = r5.isShown()
            if (r4 != 0) goto L8
            r4 = 0
            return r4
        L8:
            int r4 = r6.getActionMasked()
            int r0 = r3.h
            r1 = 1
            if (r0 != r1) goto L14
            if (r4 != 0) goto L14
            return r1
        L14:
            boolean r0 = r3.t()
            if (r0 == 0) goto L1f
            a.zg r0 = r3.i
            r0.j(r6)
        L1f:
            if (r4 != 0) goto L2b
            android.view.VelocityTracker r0 = r3.s
            if (r0 == 0) goto L2b
            r0.recycle()
            r0 = 0
            r3.s = r0
        L2b:
            android.view.VelocityTracker r0 = r3.s
            if (r0 != 0) goto L35
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r3.s = r0
        L35:
            android.view.VelocityTracker r0 = r3.s
            r0.addMovement(r6)
            boolean r0 = r3.t()
            if (r0 == 0) goto L6e
            r0 = 2
            if (r4 != r0) goto L6e
            boolean r4 = r3.j
            if (r4 != 0) goto L6e
            boolean r4 = r3.t()
            if (r4 != 0) goto L4e
            goto L6e
        L4e:
            int r4 = r3.t
            float r4 = (float) r4
            float r0 = r6.getX()
            float r4 = r4 - r0
            float r4 = java.lang.Math.abs(r4)
            a.zg r0 = r3.i
            int r2 = r0.b
            float r2 = (float) r2
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L6e
            int r4 = r6.getActionIndex()
            int r4 = r6.getPointerId(r4)
            r0.b(r5, r4)
        L6e:
            boolean r4 = r3.j
            r4 = r4 ^ r1
            return r4
    }

    public final void s(int r3) {
            r2 = this;
            int r0 = r2.h
            if (r0 != r3) goto L5
            goto L16
        L5:
            r2.h = r3
            r0 = 3
            r1 = 5
            java.lang.ref.WeakReference<V extends android.view.View> r3 = r2.p
            if (r3 != 0) goto Le
            goto L16
        Le:
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 != 0) goto L17
        L16:
            return
        L17:
            int r0 = r2.h
            if (r0 != r1) goto L1d
            r0 = 4
            goto L1e
        L1d:
            r0 = 0
        L1e:
            int r1 = r3.getVisibility()
            if (r1 == r0) goto L27
            r3.setVisibility(r0)
        L27:
            java.util.LinkedHashSet r3 = r2.u
            java.util.Iterator r3 = r3.iterator()
        L2d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r3.next()
            a.be r0 = (a.InterfaceC0071be) r0
            r0.a()
            goto L2d
        L3d:
            r2.v()
            return
    }

    public final boolean t() {
            r2 = this;
            a.zg r0 = r2.i
            if (r0 == 0) goto Le
            boolean r0 = r2.g
            r1 = 1
            if (r0 != 0) goto Ld
            int r0 = r2.h
            if (r0 != r1) goto Le
        Ld:
            return r1
        Le:
            r0 = 0
            return r0
    }

    public final void u(android.view.View r3, int r4, boolean r5) {
            r2 = this;
            r0 = 3
            if (r4 == r0) goto L19
            r0 = 5
            if (r4 != r0) goto Ld
            a.ce r0 = r2.f1086a
            int r0 = r0.d()
            goto L1f
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid state to get outer edge offset: "
            java.lang.String r4 = a.C0487z.e(r5, r4)
            r3.<init>(r4)
            throw r3
        L19:
            a.ce r0 = r2.f1086a
            int r0 = r0.c()
        L1f:
            a.zg r1 = r2.i
            if (r1 == 0) goto L57
            if (r5 == 0) goto L30
            int r3 = r3.getTop()
            boolean r3 = r1.o(r0, r3)
            if (r3 == 0) goto L57
            goto L4d
        L30:
            int r5 = r3.getTop()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r0, r5, r3, r3)
            if (r3 != 0) goto L4b
            int r5 = r1.f781a
            if (r5 != 0) goto L4b
            android.view.View r5 = r1.r
            if (r5 == 0) goto L4b
            r5 = 0
            r1.r = r5
        L4b:
            if (r3 == 0) goto L57
        L4d:
            r3 = 2
            r2.s(r3)
            com.google.android.material.sidesheet.SideSheetBehavior<V>$c r3 = r2.e
            r3.a(r4)
            return
        L57:
            r2.s(r4)
            return
    }

    public final void v() {
            r4 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r4.p
            if (r0 != 0) goto L5
            goto L3d
        L5:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Le
            goto L3d
        Le:
            r1 = 262144(0x40000, float:3.67342E-40)
            a.C0414ug.g(r0, r1)
            r1 = 0
            a.C0414ug.e(r0, r1)
            r2 = 1048576(0x100000, float:1.469368E-39)
            a.C0414ug.g(r0, r2)
            a.C0414ug.e(r0, r1)
            int r1 = r4.h
            r2 = 5
            if (r1 == r2) goto L2e
            a.I$a r1 = a.I.a.j
            a.ee r3 = new a.ee
            r3.<init>(r4, r2)
            a.C0414ug.h(r0, r1, r3)
        L2e:
            int r1 = r4.h
            r2 = 3
            if (r1 == r2) goto L3d
            a.I$a r1 = a.I.a.h
            a.ee r3 = new a.ee
            r3.<init>(r4, r2)
            a.C0414ug.h(r0, r1, r3)
        L3d:
            return
    }
}
