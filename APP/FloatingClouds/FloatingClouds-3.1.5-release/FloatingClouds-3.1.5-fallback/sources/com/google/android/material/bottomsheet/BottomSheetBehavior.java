package com.google.android.material.bottomsheet;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.c<V> {
    public static final int e0 = 0;
    public final com.google.android.material.bottomsheet.BottomSheetBehavior<V>.e A;
    public final android.animation.ValueAnimator B;
    public final int C;
    public int D;
    public int E;
    public final float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public final boolean K;
    public int L;
    public a.C0504zg M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public java.lang.ref.WeakReference<V> U;
    public java.lang.ref.WeakReference<android.view.View> V;
    public final java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior.c> W;
    public android.view.VelocityTracker X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1049a;
    public boolean a0;
    public boolean b;
    public java.util.HashMap b0;
    public final float c;
    public final android.util.SparseIntArray c0;
    public final int d;
    public final com.google.android.material.bottomsheet.BottomSheetBehavior.b d0;
    public int e;
    public boolean f;
    public int g;
    public final int h;
    public final a.Ta i;
    public final android.content.res.ColorStateList j;
    public final int k;
    public final int l;
    public int m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final a.Vd y;
    public boolean z;

    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ android.view.View f1050a;
        public final /* synthetic */ int b;
        public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior c;

        public a(com.google.android.material.bottomsheet.BottomSheetBehavior r1, android.view.View r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                r0.f1050a = r2
                r0.b = r3
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r4 = this;
                int r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.e0
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r4.c
                android.view.View r1 = r4.f1050a
                int r2 = r4.b
                r3 = 0
                r0.F(r1, r2, r3)
                return
        }
    }

    public class b extends a.C0504zg.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior f1051a;

        public b(com.google.android.material.bottomsheet.BottomSheetBehavior r1) {
                r0 = this;
                r0.<init>()
                r0.f1051a = r1
                return
        }

        @Override // a.C0504zg.c
        public final int a(android.view.View r1, int r2) {
                r0 = this;
                int r1 = r1.getLeft()
                return r1
        }

        @Override // a.C0504zg.c
        public final int b(android.view.View r2, int r3) {
                r1 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r1.f1051a
                int r2 = r2.y()
                int r0 = r1.d()
                int r2 = a.C0282n9.j(r3, r2, r0)
                return r2
        }

        @Override // a.C0504zg.c
        public final int d() {
                r2 = this;
                int r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.e0
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.f1051a
                boolean r1 = r0.I
                if (r1 == 0) goto Lb
                int r0 = r0.T
                return r0
            Lb:
                int r0 = r0.G
                return r0
        }

        @Override // a.C0504zg.c
        public final void f(int r3) {
                r2 = this;
                r0 = 1
                if (r3 != r0) goto Lc
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r2.f1051a
                boolean r1 = r3.K
                if (r1 == 0) goto Lc
                r3.D(r0)
            Lc:
                return
        }

        @Override // a.C0504zg.c
        public final void g(android.view.View r1, int r2, int r3) {
                r0 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.f1051a
                r1.v(r3)
                return
        }

        @Override // a.C0504zg.c
        public final void h(android.view.View r6, float r7, float r8) {
                r5 = this;
                r0 = 0
                int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                r2 = 6
                r3 = 3
                com.google.android.material.bottomsheet.BottomSheetBehavior r4 = r5.f1051a
                if (r1 >= 0) goto L20
                boolean r7 = r4.b
                if (r7 == 0) goto L10
            Ld:
                r2 = r3
                goto Le1
            L10:
                int r7 = r6.getTop()
                java.lang.System.currentTimeMillis()
                r4.getClass()
                int r8 = r4.E
                if (r7 <= r8) goto Ld
                goto Le1
            L20:
                boolean r1 = r4.I
                if (r1 == 0) goto L6f
                boolean r1 = r4.E(r6, r8)
                if (r1 == 0) goto L6f
                float r7 = java.lang.Math.abs(r7)
                float r0 = java.lang.Math.abs(r8)
                int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r7 >= 0) goto L3d
                int r7 = r4.d
                float r7 = (float) r7
                int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
                if (r7 > 0) goto L4c
            L3d:
                int r7 = r6.getTop()
                int r8 = r4.T
                int r0 = r4.y()
                int r0 = r0 + r8
                int r0 = r0 / 2
                if (r7 <= r0) goto L4f
            L4c:
                r2 = 5
                goto Le1
            L4f:
                boolean r7 = r4.b
                if (r7 == 0) goto L54
                goto Ld
            L54:
                int r7 = r6.getTop()
                int r8 = r4.y()
                int r7 = r7 - r8
                int r7 = java.lang.Math.abs(r7)
                int r8 = r6.getTop()
                int r0 = r4.E
                int r8 = r8 - r0
                int r8 = java.lang.Math.abs(r8)
                if (r7 >= r8) goto Le1
                goto Ld
            L6f:
                int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                r1 = 4
                if (r0 == 0) goto La0
                float r7 = java.lang.Math.abs(r7)
                float r8 = java.lang.Math.abs(r8)
                int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                if (r7 <= 0) goto L81
                goto La0
            L81:
                boolean r7 = r4.b
                if (r7 == 0) goto L87
            L85:
                r2 = r1
                goto Le1
            L87:
                int r7 = r6.getTop()
                int r8 = r4.E
                int r8 = r7 - r8
                int r8 = java.lang.Math.abs(r8)
                int r0 = r4.G
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r8 >= r7) goto L85
                r4.getClass()
                goto Le1
            La0:
                int r7 = r6.getTop()
                boolean r8 = r4.b
                if (r8 == 0) goto Lbb
                int r8 = r4.D
                int r8 = r7 - r8
                int r8 = java.lang.Math.abs(r8)
                int r0 = r4.G
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r8 >= r7) goto L85
                goto Ld
            Lbb:
                int r8 = r4.E
                if (r7 >= r8) goto Lcf
                int r8 = r4.G
                int r8 = r7 - r8
                int r8 = java.lang.Math.abs(r8)
                if (r7 >= r8) goto Lcb
                goto Ld
            Lcb:
                r4.getClass()
                goto Le1
            Lcf:
                int r8 = r7 - r8
                int r8 = java.lang.Math.abs(r8)
                int r0 = r4.G
                int r7 = r7 - r0
                int r7 = java.lang.Math.abs(r7)
                if (r8 >= r7) goto L85
                r4.getClass()
            Le1:
                r4.getClass()
                r7 = 1
                r4.F(r6, r2, r7)
                return
        }

        @Override // a.C0504zg.c
        public final boolean i(android.view.View r5, int r6) {
                r4 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r4.f1051a
                int r1 = r0.L
                r2 = 1
                if (r1 != r2) goto L8
                goto L38
            L8:
                boolean r3 = r0.a0
                if (r3 == 0) goto Ld
                goto L38
            Ld:
                r3 = 3
                if (r1 != r3) goto L2a
                int r1 = r0.Y
                if (r1 != r6) goto L2a
                java.lang.ref.WeakReference<android.view.View> r6 = r0.V
                if (r6 == 0) goto L1f
                java.lang.Object r6 = r6.get()
                android.view.View r6 = (android.view.View) r6
                goto L20
            L1f:
                r6 = 0
            L20:
                if (r6 == 0) goto L2a
                r1 = -1
                boolean r6 = r6.canScrollVertically(r1)
                if (r6 == 0) goto L2a
                goto L38
            L2a:
                java.lang.System.currentTimeMillis()
                java.lang.ref.WeakReference<V extends android.view.View> r6 = r0.U
                if (r6 == 0) goto L38
                java.lang.Object r6 = r6.get()
                if (r6 != r5) goto L38
                return r2
            L38:
                r5 = 0
                return r5
        }
    }

    public static abstract class c {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void a();

        public abstract void b();
    }

    public static class d extends a.r {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomsheet.BottomSheetBehavior.d> CREATOR = null;
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public class a implements android.os.Parcelable.ClassLoaderCreator<com.google.android.material.bottomsheet.BottomSheetBehavior.d> {
            @Override // android.os.Parcelable.Creator
            public final java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    com.google.android.material.bottomsheet.BottomSheetBehavior$d r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$d
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final com.google.android.material.bottomsheet.BottomSheetBehavior.d createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    com.google.android.material.bottomsheet.BottomSheetBehavior$d r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$d
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    com.google.android.material.bottomsheet.BottomSheetBehavior$d[] r1 = new com.google.android.material.bottomsheet.BottomSheetBehavior.d[r1]
                    return r1
            }
        }

        static {
                com.google.android.material.bottomsheet.BottomSheetBehavior$d$a r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$d$a
                r0.<init>()
                com.google.android.material.bottomsheet.BottomSheetBehavior.d.CREATOR = r0
                return
        }

        public d(android.os.Parcel r3, java.lang.ClassLoader r4) {
                r2 = this;
                r2.<init>(r3, r4)
                int r4 = r3.readInt()
                r2.c = r4
                int r4 = r3.readInt()
                r2.d = r4
                int r4 = r3.readInt()
                r0 = 0
                r1 = 1
                if (r4 != r1) goto L19
                r4 = r1
                goto L1a
            L19:
                r4 = r0
            L1a:
                r2.e = r4
                int r4 = r3.readInt()
                if (r4 != r1) goto L24
                r4 = r1
                goto L25
            L24:
                r4 = r0
            L25:
                r2.f = r4
                int r3 = r3.readInt()
                if (r3 != r1) goto L2e
                r0 = r1
            L2e:
                r2.g = r0
                return
        }

        public d(com.google.android.material.bottomsheet.BottomSheetBehavior r2) {
                r1 = this;
                android.view.AbsSavedState r0 = android.view.AbsSavedState.EMPTY_STATE
                r1.<init>(r0)
                int r0 = r2.L
                r1.c = r0
                int r0 = r2.e
                r1.d = r0
                boolean r0 = r2.b
                r1.e = r0
                boolean r0 = r2.I
                r1.f = r0
                boolean r2 = r2.J
                r1.g = r2
                return
        }

        @Override // a.r, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.c
                r1.writeInt(r2)
                int r2 = r0.d
                r1.writeInt(r2)
                boolean r2 = r0.e
                r1.writeInt(r2)
                boolean r2 = r0.f
                r1.writeInt(r2)
                boolean r2 = r0.g
                r1.writeInt(r2)
                return
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1052a;
        public boolean b;
        public final com.google.android.material.bottomsheet.BottomSheetBehavior.e.a c;
        public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior d;

        public class a implements java.lang.Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior.e f1053a;

            public a(com.google.android.material.bottomsheet.BottomSheetBehavior.e r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f1053a = r1
                    return
            }

            @Override // java.lang.Runnable
            public final void run() {
                    r4 = this;
                    r0 = 0
                    com.google.android.material.bottomsheet.BottomSheetBehavior$e r1 = r4.f1053a
                    r1.b = r0
                    com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r1.d
                    a.zg r2 = r0.M
                    if (r2 == 0) goto L17
                    boolean r2 = r2.f()
                    if (r2 == 0) goto L17
                    int r0 = r1.f1052a
                    r1.a(r0)
                    return
                L17:
                    int r2 = r0.L
                    r3 = 2
                    if (r2 != r3) goto L21
                    int r1 = r1.f1052a
                    r0.D(r1)
                L21:
                    return
            }
        }

        public e(com.google.android.material.bottomsheet.BottomSheetBehavior r1) {
                r0 = this;
                r0.<init>()
                r0.d = r1
                com.google.android.material.bottomsheet.BottomSheetBehavior$e$a r1 = new com.google.android.material.bottomsheet.BottomSheetBehavior$e$a
                r1.<init>(r0)
                r0.c = r1
                return
        }

        public final void a(int r3) {
                r2 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.d
                java.lang.ref.WeakReference<V extends android.view.View> r1 = r0.U
                if (r1 == 0) goto L25
                java.lang.Object r1 = r1.get()
                if (r1 != 0) goto Ld
                goto L25
            Ld:
                r2.f1052a = r3
                boolean r3 = r2.b
                if (r3 != 0) goto L25
                java.lang.ref.WeakReference<V extends android.view.View> r3 = r0.U
                java.lang.Object r3 = r3.get()
                android.view.View r3 = (android.view.View) r3
                com.google.android.material.bottomsheet.BottomSheetBehavior$e$a r0 = r2.c
                java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
                r3.postOnAnimation(r0)
                r3 = 1
                r2.b = r3
            L25:
                return
        }
    }

    static {
            int r0 = com.google.android.material.R.style.Widget_Design_BottomSheet_Modal
            com.google.android.material.bottomsheet.BottomSheetBehavior.e0 = r0
            return
    }

    public BottomSheetBehavior() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f1049a = r0
            r0 = 1
            r3.b = r0
            r1 = -1
            r3.k = r1
            r3.l = r1
            com.google.android.material.bottomsheet.BottomSheetBehavior$e r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior$e
            r2.<init>(r3)
            r3.A = r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r3.F = r2
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.H = r2
            r3.K = r0
            r0 = 4
            r3.L = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            r3.Q = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.W = r0
            r3.Z = r1
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r0.<init>()
            r3.c0 = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior$b r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$b
            r0.<init>(r3)
            r3.d0 = r0
            return
    }

    public BottomSheetBehavior(android.content.Context r11, android.util.AttributeSet r12) {
            r10 = this;
            r10.<init>(r11, r12)
            r0 = 0
            r10.f1049a = r0
            r1 = 1
            r10.b = r1
            r2 = -1
            r10.k = r2
            r10.l = r2
            com.google.android.material.bottomsheet.BottomSheetBehavior$e r3 = new com.google.android.material.bottomsheet.BottomSheetBehavior$e
            r3.<init>(r10)
            r10.A = r3
            r3 = 1056964608(0x3f000000, float:0.5)
            r10.F = r3
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10.H = r4
            r10.K = r1
            r5 = 4
            r10.L = r5
            r6 = 1036831949(0x3dcccccd, float:0.1)
            r10.Q = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r10.W = r6
            r10.Z = r2
            android.util.SparseIntArray r6 = new android.util.SparseIntArray
            r6.<init>()
            r10.c0 = r6
            com.google.android.material.bottomsheet.BottomSheetBehavior$b r6 = new com.google.android.material.bottomsheet.BottomSheetBehavior$b
            r6.<init>(r10)
            r10.d0 = r6
            android.content.res.Resources r6 = r11.getResources()
            int r7 = com.google.android.material.R.dimen.mtrl_min_touch_target_size
            int r6 = r6.getDimensionPixelSize(r7)
            r10.h = r6
            int[] r6 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout
            android.content.res.TypedArray r6 = r11.obtainStyledAttributes(r12, r6)
            int r7 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_backgroundTint
            boolean r7 = r6.hasValue(r7)
            if (r7 == 0) goto L60
            int r7 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_backgroundTint
            android.content.res.ColorStateList r7 = a.Sa.b(r11, r6, r7)
            r10.j = r7
        L60:
            int r7 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_shapeAppearance
            boolean r7 = r6.hasValue(r7)
            if (r7 == 0) goto L76
            int r7 = com.google.android.material.R.attr.bottomSheetStyle
            int r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.e0
            a.Vd$a r12 = a.Vd.b(r11, r12, r7, r8)
            a.Vd r12 = r12.a()
            r10.y = r12
        L76:
            a.Vd r12 = r10.y
            if (r12 != 0) goto L7b
            goto La5
        L7b:
            a.Ta r7 = new a.Ta
            r7.<init>(r12)
            r10.i = r7
            r7.i(r11)
            android.content.res.ColorStateList r12 = r10.j
            if (r12 == 0) goto L8f
            a.Ta r7 = r10.i
            r7.k(r12)
            goto La5
        L8f:
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            android.content.res.Resources$Theme r7 = r11.getTheme()
            r8 = 16842801(0x1010031, float:2.3693695E-38)
            r7.resolveAttribute(r8, r12, r1)
            a.Ta r7 = r10.i
            int r12 = r12.data
            r7.setTint(r12)
        La5:
            float r12 = r10.t()
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 2
            float[] r8 = new float[r8]
            r8[r0] = r12
            r8[r1] = r7
            android.animation.ValueAnimator r12 = android.animation.ValueAnimator.ofFloat(r8)
            r10.B = r12
            r8 = 500(0x1f4, double:2.47E-321)
            r12.setDuration(r8)
            android.animation.ValueAnimator r12 = r10.B
            a.u2 r8 = new a.u2
            r8.<init>(r10)
            r12.addUpdateListener(r8)
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_android_elevation
            float r12 = r6.getDimension(r12, r4)
            r10.H = r12
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_android_maxWidth
            boolean r12 = r6.hasValue(r12)
            if (r12 == 0) goto Ldf
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_android_maxWidth
            int r12 = r6.getDimensionPixelSize(r12, r2)
            r10.k = r12
        Ldf:
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_android_maxHeight
            boolean r12 = r6.hasValue(r12)
            if (r12 == 0) goto Lef
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_android_maxHeight
            int r12 = r6.getDimensionPixelSize(r12, r2)
            r10.l = r12
        Lef:
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight
            android.util.TypedValue r12 = r6.peekValue(r12)
            if (r12 == 0) goto Lff
            int r12 = r12.data
            if (r12 != r2) goto Lff
            r10.B(r12)
            goto L108
        Lff:
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight
            int r12 = r6.getDimensionPixelSize(r12, r2)
            r10.B(r12)
        L108:
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_hideable
            boolean r12 = r6.getBoolean(r12, r0)
            boolean r2 = r10.I
            if (r2 == r12) goto L121
            r10.I = r12
            if (r12 != 0) goto L11e
            int r12 = r10.L
            r2 = 5
            if (r12 != r2) goto L11e
            r10.C(r5)
        L11e:
            r10.G()
        L121:
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored
            boolean r12 = r6.getBoolean(r12, r0)
            r10.n = r12
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents
            boolean r12 = r6.getBoolean(r12, r1)
            boolean r2 = r10.b
            if (r2 != r12) goto L134
            goto L155
        L134:
            r10.b = r12
            java.lang.ref.WeakReference<V extends android.view.View> r12 = r10.U
            if (r12 == 0) goto L13d
            r10.s()
        L13d:
            boolean r12 = r10.b
            if (r12 == 0) goto L148
            int r12 = r10.L
            r2 = 6
            if (r12 != r2) goto L148
            r12 = 3
            goto L14a
        L148:
            int r12 = r10.L
        L14a:
            r10.D(r12)
            int r12 = r10.L
            r10.H(r12, r1)
            r10.G()
        L155:
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed
            boolean r12 = r6.getBoolean(r12, r0)
            r10.J = r12
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_draggable
            boolean r12 = r6.getBoolean(r12, r1)
            r10.K = r12
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags
            int r12 = r6.getInt(r12, r0)
            r10.f1049a = r12
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio
            float r12 = r6.getFloat(r12, r3)
            r2 = 0
            int r2 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r2 <= 0) goto L21a
            int r2 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r2 >= 0) goto L21a
            r10.F = r12
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r10.U
            if (r2 == 0) goto L18a
            int r2 = r10.T
            float r2 = (float) r2
            float r7 = r7 - r12
            float r7 = r7 * r2
            int r12 = (int) r7
            r10.E = r12
        L18a:
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset
            android.util.TypedValue r12 = r6.peekValue(r12)
            java.lang.String r2 = "offset must be greater than or equal to 0"
            if (r12 == 0) goto L1ac
            int r3 = r12.type
            r4 = 16
            if (r3 != r4) goto L1ac
            int r12 = r12.data
            if (r12 < 0) goto L1a6
            r10.C = r12
            int r12 = r10.L
            r10.H(r12, r1)
            goto L1bb
        L1a6:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r2)
            throw r11
        L1ac:
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset
            int r12 = r6.getDimensionPixelOffset(r12, r0)
            if (r12 < 0) goto L214
            r10.C = r12
            int r12 = r10.L
            r10.H(r12, r1)
        L1bb:
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold
            r2 = 500(0x1f4, float:7.0E-43)
            int r12 = r6.getInt(r12, r2)
            r10.d = r12
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets
            boolean r12 = r6.getBoolean(r12, r0)
            r10.o = r12
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets
            boolean r12 = r6.getBoolean(r12, r0)
            r10.p = r12
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets
            boolean r12 = r6.getBoolean(r12, r0)
            r10.q = r12
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets
            boolean r12 = r6.getBoolean(r12, r1)
            r10.r = r12
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets
            boolean r12 = r6.getBoolean(r12, r0)
            r10.s = r12
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_marginRightSystemWindowInsets
            boolean r12 = r6.getBoolean(r12, r0)
            r10.t = r12
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_marginTopSystemWindowInsets
            boolean r12 = r6.getBoolean(r12, r0)
            r10.u = r12
            int r12 = com.google.android.material.R.styleable.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners
            boolean r12 = r6.getBoolean(r12, r1)
            r10.x = r12
            r6.recycle()
            android.view.ViewConfiguration r11 = android.view.ViewConfiguration.get(r11)
            int r11 = r11.getScaledMaximumFlingVelocity()
            float r11 = (float) r11
            r10.c = r11
            return
        L214:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r11.<init>(r2)
            throw r11
        L21a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "ratio must be a float value between 0 and 1"
            r11.<init>(r12)
            throw r11
    }

    public static android.view.View w(android.view.View r3) {
            int r0 = r3.getVisibility()
            if (r0 == 0) goto L7
            goto L2b
        L7:
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            boolean r0 = a.C0414ug.d.p(r3)
            if (r0 == 0) goto L10
            return r3
        L10:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2b
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        L1b:
            if (r1 >= r0) goto L2b
            android.view.View r2 = r3.getChildAt(r1)
            android.view.View r2 = w(r2)
            if (r2 == 0) goto L28
            return r2
        L28:
            int r1 = r1 + 1
            goto L1b
        L2b:
            r3 = 0
            return r3
    }

    public static int x(int r0, int r1, int r2, int r3) {
            int r0 = android.view.ViewGroup.getChildMeasureSpec(r0, r1, r3)
            r1 = -1
            if (r2 != r1) goto L8
            return r0
        L8:
            int r1 = android.view.View.MeasureSpec.getMode(r0)
            int r0 = android.view.View.MeasureSpec.getSize(r0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L22
            if (r0 != 0) goto L17
            goto L1b
        L17:
            int r2 = java.lang.Math.min(r0, r2)
        L1b:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            return r0
        L22:
            int r0 = java.lang.Math.min(r0, r2)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            return r0
    }

    public final boolean A() {
            r3 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r3.U
            r1 = 0
            if (r0 == 0) goto L20
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lc
            goto L20
        Lc:
            r0 = 2
            int[] r0 = new int[r0]
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r3.U
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            r2.getLocationOnScreen(r0)
            r2 = 1
            r0 = r0[r2]
            if (r0 != 0) goto L20
            return r2
        L20:
            return r1
    }

    public final void B(int r2) {
            r1 = this;
            r0 = -1
            if (r2 != r0) goto Lb
            boolean r2 = r1.f
            if (r2 != 0) goto L14
            r2 = 1
            r1.f = r2
            goto L1e
        Lb:
            boolean r0 = r1.f
            if (r0 != 0) goto L15
            int r0 = r1.e
            if (r0 == r2) goto L14
            goto L15
        L14:
            return
        L15:
            r0 = 0
            r1.f = r0
            int r2 = java.lang.Math.max(r0, r2)
            r1.e = r2
        L1e:
            r1.J()
            return
    }

    public final void C(int r5) {
            r4 = this;
            r0 = 1
            if (r5 == r0) goto L6c
            r1 = 2
            if (r5 != r1) goto L7
            goto L6c
        L7:
            boolean r0 = r4.I
            if (r0 != 0) goto L22
            r0 = 5
            if (r5 != r0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot set state: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r5)
            return
        L22:
            r0 = 6
            if (r5 != r0) goto L33
            boolean r0 = r4.b
            if (r0 == 0) goto L33
            int r0 = r4.z(r5)
            int r1 = r4.D
            if (r0 > r1) goto L33
            r0 = 3
            goto L34
        L33:
            r0 = r5
        L34:
            java.lang.ref.WeakReference<V extends android.view.View> r1 = r4.U
            if (r1 == 0) goto L68
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L3f
            goto L68
        L3f:
            java.lang.ref.WeakReference<V extends android.view.View> r5 = r4.U
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r1 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r1.<init>(r4, r5, r0)
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L64
            boolean r0 = r0.isLayoutRequested()
            if (r0 == 0) goto L64
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            boolean r0 = r5.isAttachedToWindow()
            if (r0 == 0) goto L64
            r5.post(r1)
            return
        L64:
            r1.run()
            return
        L68:
            r4.D(r5)
            return
        L6c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r5 != r0) goto L7a
            java.lang.String r5 = "DRAGGING"
            goto L7c
        L7a:
            java.lang.String r5 = "SETTLING"
        L7c:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r5 = a.C0487z.h(r2, r5, r0)
            r1.<init>(r5)
            throw r1
    }

    public final void D(int r7) {
            r6 = this;
            int r0 = r6.L
            if (r0 != r7) goto L5
            goto L20
        L5:
            r6.L = r7
            r0 = 5
            r1 = 6
            r2 = 3
            r3 = 4
            if (r7 == r3) goto L13
            if (r7 == r2) goto L13
            if (r7 == r1) goto L13
            boolean r4 = r6.I
        L13:
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r6.U
            if (r4 != 0) goto L18
            goto L20
        L18:
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L21
        L20:
            return
        L21:
            r4 = 1
            r5 = 0
            if (r7 != r2) goto L29
            r6.I(r4)
            goto L32
        L29:
            if (r7 == r1) goto L2f
            if (r7 == r0) goto L2f
            if (r7 != r3) goto L32
        L2f:
            r6.I(r5)
        L32:
            r6.H(r7, r4)
        L35:
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$c> r7 = r6.W
            int r0 = r7.size()
            if (r5 >= r0) goto L49
            java.lang.Object r7 = r7.get(r5)
            com.google.android.material.bottomsheet.BottomSheetBehavior$c r7 = (com.google.android.material.bottomsheet.BottomSheetBehavior.c) r7
            r7.b()
            int r5 = r5 + 1
            goto L35
        L49:
            r6.G()
            return
    }

    public final boolean E(android.view.View r5, float r6) {
            r4 = this;
            boolean r0 = r4.J
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r5.getTop()
            int r2 = r4.G
            r3 = 0
            if (r0 >= r2) goto L10
            return r3
        L10:
            int r0 = r4.u()
            int r5 = r5.getTop()
            float r5 = (float) r5
            float r2 = r4.Q
            float r6 = r6 * r2
            float r6 = r6 + r5
            int r5 = r4.G
            float r5 = (float) r5
            float r6 = r6 - r5
            float r5 = java.lang.Math.abs(r6)
            float r6 = (float) r0
            float r5 = r5 / r6
            r6 = 1056964608(0x3f000000, float:0.5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L2e
            return r1
        L2e:
            return r3
    }

    public final void F(android.view.View r3, int r4, boolean r5) {
            r2 = this;
            int r0 = r2.z(r4)
            a.zg r1 = r2.M
            if (r1 == 0) goto L40
            if (r5 == 0) goto L15
            int r3 = r3.getLeft()
            boolean r3 = r1.o(r3, r0)
            if (r3 == 0) goto L40
            goto L32
        L15:
            int r5 = r3.getLeft()
            r1.r = r3
            r3 = -1
            r1.c = r3
            r3 = 0
            boolean r3 = r1.h(r5, r0, r3, r3)
            if (r3 != 0) goto L30
            int r5 = r1.f781a
            if (r5 != 0) goto L30
            android.view.View r5 = r1.r
            if (r5 == 0) goto L30
            r5 = 0
            r1.r = r5
        L30:
            if (r3 == 0) goto L40
        L32:
            r3 = 2
            r2.D(r3)
            r3 = 1
            r2.H(r4, r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$e r3 = r2.A
            r3.a(r4)
            return
        L40:
            r2.D(r4)
            return
    }

    public final void G() {
            r15 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r15.U
            if (r0 == 0) goto L13e
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Le
            goto L13e
        Le:
            r1 = 524288(0x80000, float:7.34684E-40)
            a.C0414ug.g(r0, r1)
            r1 = 0
            a.C0414ug.e(r0, r1)
            r2 = 262144(0x40000, float:3.67342E-40)
            a.C0414ug.g(r0, r2)
            a.C0414ug.e(r0, r1)
            r2 = 1048576(0x100000, float:1.469368E-39)
            a.C0414ug.g(r0, r2)
            a.C0414ug.e(r0, r1)
            android.util.SparseIntArray r2 = r15.c0
            r3 = -1
            int r4 = r2.get(r1, r3)
            if (r4 == r3) goto L39
            a.C0414ug.g(r0, r4)
            a.C0414ug.e(r0, r1)
            r2.delete(r1)
        L39:
            boolean r4 = r15.b
            r5 = 6
            if (r4 != 0) goto Lec
            int r4 = r15.L
            if (r4 == r5) goto Lec
            int r4 = com.google.android.material.R.string.bottomsheet_action_expand_halfway
            android.content.res.Resources r6 = r0.getResources()
            java.lang.String r10 = r6.getString(r4)
            a.w2 r11 = new a.w2
            r11.<init>(r15, r5)
            java.util.ArrayList r4 = a.C0414ug.c(r0)
            r6 = r1
        L56:
            int r7 = r4.size()
            if (r6 >= r7) goto L7f
            java.lang.Object r7 = r4.get(r6)
            a.I$a r7 = (a.I.a) r7
            java.lang.Object r7 = r7.f119a
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r7 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r7
            java.lang.CharSequence r7 = r7.getLabel()
            boolean r7 = android.text.TextUtils.equals(r10, r7)
            if (r7 == 0) goto L7c
            java.lang.Object r4 = r4.get(r6)
            a.I$a r4 = (a.I.a) r4
            int r4 = r4.a()
            r9 = r4
            goto Lae
        L7c:
            int r6 = r6 + 1
            goto L56
        L7f:
            r7 = r1
            r6 = r3
        L81:
            r8 = 32
            if (r7 >= r8) goto Lad
            if (r6 != r3) goto Lad
            int[] r8 = a.C0414ug.d
            r8 = r8[r7]
            r9 = 1
            r12 = r1
            r13 = r9
        L8e:
            int r14 = r4.size()
            if (r12 >= r14) goto La7
            java.lang.Object r14 = r4.get(r12)
            a.I$a r14 = (a.I.a) r14
            int r14 = r14.a()
            if (r14 == r8) goto La2
            r14 = r9
            goto La3
        La2:
            r14 = r1
        La3:
            r13 = r13 & r14
            int r12 = r12 + 1
            goto L8e
        La7:
            if (r13 == 0) goto Laa
            r6 = r8
        Laa:
            int r7 = r7 + 1
            goto L81
        Lad:
            r9 = r6
        Lae:
            if (r9 == r3) goto Le9
            a.I$a r7 = new a.I$a
            r8 = 0
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            android.view.View$AccessibilityDelegate r3 = a.C0414ug.b(r0)
            if (r3 != 0) goto Lbf
            r3 = 0
            goto Lce
        Lbf:
            boolean r4 = r3 instanceof a.C.a
            if (r4 == 0) goto Lc8
            a.C$a r3 = (a.C.a) r3
            a.C r3 = r3.f37a
            goto Lce
        Lc8:
            a.C r4 = new a.C
            r4.<init>(r3)
            r3 = r4
        Lce:
            if (r3 != 0) goto Ld5
            a.C r3 = new a.C
            r3.<init>()
        Ld5:
            a.C0414ug.j(r0, r3)
            int r3 = r7.a()
            a.C0414ug.g(r0, r3)
            java.util.ArrayList r3 = a.C0414ug.c(r0)
            r3.add(r7)
            a.C0414ug.e(r0, r1)
        Le9:
            r2.put(r1, r9)
        Lec:
            boolean r1 = r15.I
            if (r1 == 0) goto Lff
            int r1 = r15.L
            r2 = 5
            if (r1 == r2) goto Lff
            a.I$a r1 = a.I.a.j
            a.w2 r3 = new a.w2
            r3.<init>(r15, r2)
            a.C0414ug.h(r0, r1, r3)
        Lff:
            int r1 = r15.L
            r2 = 4
            r3 = 3
            if (r1 == r3) goto L12f
            if (r1 == r2) goto L11f
            if (r1 == r5) goto L10a
            goto L13e
        L10a:
            a.I$a r1 = a.I.a.i
            a.w2 r4 = new a.w2
            r4.<init>(r15, r2)
            a.C0414ug.h(r0, r1, r4)
            a.I$a r1 = a.I.a.h
            a.w2 r2 = new a.w2
            r2.<init>(r15, r3)
            a.C0414ug.h(r0, r1, r2)
            return
        L11f:
            boolean r1 = r15.b
            if (r1 == 0) goto L124
            r5 = r3
        L124:
            a.I$a r1 = a.I.a.h
            a.w2 r2 = new a.w2
            r2.<init>(r15, r5)
            a.C0414ug.h(r0, r1, r2)
            return
        L12f:
            boolean r1 = r15.b
            if (r1 == 0) goto L134
            r5 = r2
        L134:
            a.I$a r1 = a.I.a.i
            a.w2 r2 = new a.w2
            r2.<init>(r15, r5)
            a.C0414ug.h(r0, r1, r2)
        L13e:
            return
    }

    public final void H(int r7, boolean r8) {
            r6 = this;
            r0 = 0
            r1 = 1
            a.Ta r2 = r6.i
            android.animation.ValueAnimator r3 = r6.B
            r4 = 2
            if (r7 != r4) goto La
            goto L6e
        La:
            int r7 = r6.L
            r5 = 3
            if (r7 != r5) goto L1b
            boolean r7 = r6.x
            if (r7 != 0) goto L19
            boolean r7 = r6.A()
            if (r7 == 0) goto L1b
        L19:
            r7 = r1
            goto L1c
        L1b:
            r7 = r0
        L1c:
            boolean r5 = r6.z
            if (r5 == r7) goto L6e
            if (r2 != 0) goto L23
            goto L6e
        L23:
            r6.z = r7
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L4c
            if (r3 == 0) goto L4c
            boolean r8 = r3.isRunning()
            if (r8 == 0) goto L35
            r3.reverse()
            return
        L35:
            a.Ta$b r8 = r2.f278a
            float r8 = r8.i
            if (r7 == 0) goto L3f
            float r5 = r6.t()
        L3f:
            float[] r7 = new float[r4]
            r7[r0] = r8
            r7[r1] = r5
            r3.setFloatValues(r7)
            r3.start()
            return
        L4c:
            if (r3 == 0) goto L57
            boolean r7 = r3.isRunning()
            if (r7 == 0) goto L57
            r3.cancel()
        L57:
            boolean r7 = r6.z
            if (r7 == 0) goto L5f
            float r5 = r6.t()
        L5f:
            a.Ta$b r7 = r2.f278a
            float r8 = r7.i
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L6e
            r7.i = r5
            r2.e = r1
            r2.invalidateSelf()
        L6e:
            return
    }

    public final void I(boolean r7) {
            r6 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r6.U
            if (r0 != 0) goto L5
            goto L4e
        L5:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r1 != 0) goto L14
            goto L4e
        L14:
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            int r1 = r0.getChildCount()
            if (r7 == 0) goto L27
            java.util.HashMap r2 = r6.b0
            if (r2 != 0) goto L4e
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r1)
            r6.b0 = r2
        L27:
            r2 = 0
        L28:
            if (r2 >= r1) goto L49
            android.view.View r3 = r0.getChildAt(r2)
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r6.U
            java.lang.Object r4 = r4.get()
            if (r3 != r4) goto L37
            goto L46
        L37:
            if (r7 == 0) goto L46
            java.util.HashMap r4 = r6.b0
            int r5 = r3.getImportantForAccessibility()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.put(r3, r5)
        L46:
            int r2 = r2 + 1
            goto L28
        L49:
            if (r7 != 0) goto L4e
            r7 = 0
            r6.b0 = r7
        L4e:
            return
    }

    public final void J() {
            r2 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.U
            if (r0 == 0) goto L19
            r2.s()
            int r0 = r2.L
            r1 = 4
            if (r0 != r1) goto L19
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L19
            r0.requestLayout()
        L19:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(androidx.coordinatorlayout.widget.CoordinatorLayout.f r1) {
            r0 = this;
            r1 = 0
            r0.U = r1
            r0.M = r1
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
            r1 = this;
            r0 = 0
            r1.U = r0
            r1.M = r0
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Ldc
            boolean r0 = r9.K
            if (r0 != 0) goto Le
            goto Ldc
        Le:
            int r0 = r12.getActionMasked()
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L23
            r9.Y = r4
            r9.Z = r4
            android.view.VelocityTracker r5 = r9.X
            if (r5 == 0) goto L23
            r5.recycle()
            r9.X = r3
        L23:
            android.view.VelocityTracker r5 = r9.X
            if (r5 != 0) goto L2d
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r9.X = r5
        L2d:
            android.view.VelocityTracker r5 = r9.X
            r5.addMovement(r12)
            r5 = 2
            if (r0 == 0) goto L46
            if (r0 == r2) goto L3b
            r11 = 3
            if (r0 == r11) goto L3b
            goto L89
        L3b:
            r9.a0 = r1
            r9.Y = r4
            boolean r11 = r9.N
            if (r11 == 0) goto L89
            r9.N = r1
            return r1
        L46:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.Z = r7
            int r7 = r9.L
            if (r7 == r5) goto L78
            java.lang.ref.WeakReference<android.view.View> r7 = r9.V
            if (r7 == 0) goto L61
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L62
        L61:
            r7 = r3
        L62:
            if (r7 == 0) goto L78
            int r8 = r9.Z
            boolean r7 = r10.l(r7, r6, r8)
            if (r7 == 0) goto L78
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.Y = r7
            r9.a0 = r2
        L78:
            int r7 = r9.Y
            if (r7 != r4) goto L86
            int r7 = r9.Z
            boolean r11 = r10.l(r11, r6, r7)
            if (r11 != 0) goto L86
            r11 = r2
            goto L87
        L86:
            r11 = r1
        L87:
            r9.N = r11
        L89:
            boolean r11 = r9.N
            if (r11 != 0) goto L98
            a.zg r11 = r9.M
            if (r11 == 0) goto L98
            boolean r11 = r11.p(r12)
            if (r11 == 0) goto L98
            goto Lda
        L98:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.V
            if (r11 == 0) goto La3
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        La3:
            if (r0 != r5) goto Ldb
            if (r3 == 0) goto Ldb
            boolean r11 = r9.N
            if (r11 != 0) goto Ldb
            int r11 = r9.L
            if (r11 == r2) goto Ldb
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.l(r3, r11, r0)
            if (r10 != 0) goto Ldb
            a.zg r10 = r9.M
            if (r10 == 0) goto Ldb
            int r10 = r9.Z
            if (r10 == r4) goto Ldb
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            a.zg r11 = r9.M
            int r11 = r11.b
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto Ldb
        Lda:
            return r2
        Ldb:
            return r1
        Ldc:
            r9.N = r2
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, int r14) {
            r11 = this;
            int r0 = r11.l
            a.Ta r1 = r11.i
            r2 = 1
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            boolean r3 = r12.getFitsSystemWindows()
            if (r3 == 0) goto L16
            boolean r3 = r13.getFitsSystemWindows()
            if (r3 != 0) goto L16
            r13.setFitsSystemWindows(r2)
        L16:
            java.lang.ref.WeakReference<V extends android.view.View> r3 = r11.U
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            if (r3 != 0) goto L117
            android.content.res.Resources r3 = r12.getResources()
            int r6 = com.google.android.material.R.dimen.design_bottom_sheet_peek_height_min
            int r3 = r3.getDimensionPixelSize(r6)
            r11.g = r3
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 29
            if (r3 < r6) goto L39
            boolean r6 = r11.n
            if (r6 != 0) goto L39
            boolean r6 = r11.f
            if (r6 != 0) goto L39
            r6 = r2
            goto L3a
        L39:
            r6 = r5
        L3a:
            boolean r7 = r11.o
            if (r7 != 0) goto L55
            boolean r7 = r11.p
            if (r7 != 0) goto L55
            boolean r7 = r11.q
            if (r7 != 0) goto L55
            boolean r7 = r11.s
            if (r7 != 0) goto L55
            boolean r7 = r11.t
            if (r7 != 0) goto L55
            boolean r7 = r11.u
            if (r7 != 0) goto L55
            if (r6 != 0) goto L55
            goto L8e
        L55:
            a.v2 r7 = new a.v2
            r7.<init>(r11, r6)
            a.Rg$a r6 = new a.Rg$a
            int r8 = r13.getPaddingStart()
            r13.getPaddingTop()
            int r9 = r13.getPaddingEnd()
            int r10 = r13.getPaddingBottom()
            r6.<init>()
            r6.f250a = r8
            r6.b = r9
            r6.c = r10
            a.Ng r8 = new a.Ng
            r8.<init>(r7, r6)
            a.C0414ug.d.u(r13, r8)
            boolean r6 = r13.isAttachedToWindow()
            if (r6 == 0) goto L86
            a.C0414ug.c.c(r13)
            goto L8e
        L86:
            a.Og r6 = new a.Og
            r6.<init>()
            r13.addOnAttachStateChangeListener(r6)
        L8e:
            a.b9 r6 = new a.b9
            r6.<init>(r13)
            r7 = 30
            if (r3 < r7) goto La0
            a.mh$d$a r3 = new a.mh$d$a
            r3.<init>(r6)
            a.F.o(r13, r3)
            goto Lb7
        La0:
            android.view.animation.PathInterpolator r3 = a.mh.c.e
            int r3 = androidx.core.R.id.tag_on_apply_window_listener
            java.lang.Object r3 = r13.getTag(r3)
            a.mh$c$a r7 = new a.mh$c$a
            r7.<init>(r13, r6)
            int r6 = androidx.core.R.id.tag_window_insets_animation_callback
            r13.setTag(r6, r7)
            if (r3 != 0) goto Lb7
            r13.setOnApplyWindowInsetsListener(r7)
        Lb7:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r13)
            r11.U = r3
            android.content.Context r3 = r13.getContext()
            int r6 = com.google.android.material.R.attr.motionEasingStandardDecelerateInterpolator
            r7 = 0
            android.view.animation.Interpolator r7 = a.C0356rc.b(r7, r7, r7, r4)
            a.C0445wb.d(r3, r6, r7)
            int r6 = com.google.android.material.R.attr.motionDurationMedium2
            r7 = 300(0x12c, float:4.2E-43)
            a.C0445wb.c(r3, r6, r7)
            int r6 = com.google.android.material.R.attr.motionDurationShort3
            r7 = 150(0x96, float:2.1E-43)
            a.C0445wb.c(r3, r6, r7)
            int r6 = com.google.android.material.R.attr.motionDurationShort2
            r7 = 100
            a.C0445wb.c(r3, r6, r7)
            android.content.res.Resources r3 = r13.getResources()
            int r6 = com.google.android.material.R.dimen.m3_back_progress_bottom_container_max_scale_x_distance
            r3.getDimension(r6)
            int r6 = com.google.android.material.R.dimen.m3_back_progress_bottom_container_max_scale_y_distance
            r3.getDimension(r6)
            if (r1 == 0) goto L104
            r13.setBackground(r1)
            float r3 = r11.H
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L100
            float r3 = a.C0414ug.d.i(r13)
        L100:
            r1.j(r3)
            goto L10b
        L104:
            android.content.res.ColorStateList r1 = r11.j
            if (r1 == 0) goto L10b
            a.C0414ug.d.q(r13, r1)
        L10b:
            r11.G()
            int r1 = r13.getImportantForAccessibility()
            if (r1 != 0) goto L117
            r13.setImportantForAccessibility(r2)
        L117:
            a.zg r1 = r11.M
            if (r1 != 0) goto L128
            a.zg r1 = new a.zg
            android.content.Context r3 = r12.getContext()
            com.google.android.material.bottomsheet.BottomSheetBehavior$b r6 = r11.d0
            r1.<init>(r3, r12, r6)
            r11.M = r1
        L128:
            int r1 = r13.getTop()
            r12.q(r13, r14)
            int r14 = r12.getWidth()
            r11.S = r14
            int r12 = r12.getHeight()
            r11.T = r12
            int r12 = r13.getHeight()
            r11.R = r12
            int r14 = r11.T
            int r12 = r14 - r12
            int r3 = r11.w
            if (r12 >= r3) goto L162
            boolean r12 = r11.r
            r6 = -1
            if (r12 == 0) goto L158
            if (r0 != r6) goto L151
            goto L155
        L151:
            int r14 = java.lang.Math.min(r14, r0)
        L155:
            r11.R = r14
            goto L162
        L158:
            int r14 = r14 - r3
            if (r0 != r6) goto L15c
            goto L160
        L15c:
            int r14 = java.lang.Math.min(r14, r0)
        L160:
            r11.R = r14
        L162:
            int r12 = r11.T
            int r14 = r11.R
            int r12 = r12 - r14
            int r12 = java.lang.Math.max(r5, r12)
            r11.D = r12
            int r12 = r11.T
            float r12 = (float) r12
            float r14 = r11.F
            float r4 = r4 - r14
            float r4 = r4 * r12
            int r12 = (int) r4
            r11.E = r12
            r11.s()
            int r12 = r11.L
            r14 = 3
            if (r12 != r14) goto L187
            int r12 = r11.y()
            r13.offsetTopAndBottom(r12)
            goto L1b3
        L187:
            r14 = 6
            if (r12 != r14) goto L190
            int r12 = r11.E
            r13.offsetTopAndBottom(r12)
            goto L1b3
        L190:
            boolean r14 = r11.I
            if (r14 == 0) goto L19d
            r14 = 5
            if (r12 != r14) goto L19d
            int r12 = r11.T
            r13.offsetTopAndBottom(r12)
            goto L1b3
        L19d:
            r14 = 4
            if (r12 != r14) goto L1a6
            int r12 = r11.G
            r13.offsetTopAndBottom(r12)
            goto L1b3
        L1a6:
            if (r12 == r2) goto L1ab
            r14 = 2
            if (r12 != r14) goto L1b3
        L1ab:
            int r12 = r13.getTop()
            int r1 = r1 - r12
            r13.offsetTopAndBottom(r1)
        L1b3:
            int r12 = r11.L
            r11.H(r12, r5)
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            android.view.View r13 = w(r13)
            r12.<init>(r13)
            r11.V = r12
        L1c3:
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$c> r12 = r11.W
            int r13 = r12.size()
            if (r5 >= r13) goto L1d6
            java.lang.Object r12 = r12.get(r5)
            com.google.android.material.bottomsheet.BottomSheetBehavior$c r12 = (com.google.android.material.bottomsheet.BottomSheetBehavior.c) r12
            r12.getClass()
            int r5 = r5 + r2
            goto L1c3
        L1d6:
            return r2
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
            int r7 = r3.k
            int r1 = r0.width
            int r6 = x(r6, r2, r7, r1)
            int r7 = r4.getPaddingTop()
            int r4 = r4.getPaddingBottom()
            int r4 = r4 + r7
            int r7 = r0.topMargin
            int r4 = r4 + r7
            int r7 = r0.bottomMargin
            int r4 = r4 + r7
            int r7 = r3.l
            int r0 = r0.height
            int r4 = x(r8, r4, r7, r0)
            r5.measure(r6, r4)
            r4 = 1
            return r4
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(android.view.View r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.V
            if (r0 == 0) goto L12
            java.lang.Object r0 = r0.get()
            if (r2 != r0) goto L12
            int r2 = r1.L
            r0 = 3
            if (r2 != r0) goto L10
            goto L12
        L10:
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void k(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6, int r7, int[] r8, int r9) {
            r2 = this;
            boolean r3 = r2.K
            r6 = 1
            if (r9 != r6) goto L6
            goto L66
        L6:
            java.lang.ref.WeakReference<android.view.View> r9 = r2.V
            if (r9 == 0) goto L11
            java.lang.Object r9 = r9.get()
            android.view.View r9 = (android.view.View) r9
            goto L12
        L11:
            r9 = 0
        L12:
            if (r5 == r9) goto L15
            goto L66
        L15:
            int r9 = r4.getTop()
            int r0 = r9 - r7
            if (r7 <= 0) goto L44
            int r5 = r2.y()
            if (r0 >= r5) goto L35
            int r3 = r2.y()
            int r9 = r9 - r3
            r8[r6] = r9
            int r3 = -r9
            java.util.WeakHashMap<android.view.View, a.Jg> r5 = a.C0414ug.f721a
            r4.offsetTopAndBottom(r3)
            r3 = 3
            r2.D(r3)
            goto L72
        L35:
            if (r3 != 0) goto L38
            goto L66
        L38:
            r8[r6] = r7
            int r3 = -r7
            java.util.WeakHashMap<android.view.View, a.Jg> r5 = a.C0414ug.f721a
            r4.offsetTopAndBottom(r3)
            r2.D(r6)
            goto L72
        L44:
            if (r7 >= 0) goto L72
            r1 = -1
            boolean r5 = r5.canScrollVertically(r1)
            if (r5 != 0) goto L72
            int r5 = r2.G
            if (r0 <= r5) goto L64
            boolean r0 = r2.I
            if (r0 == 0) goto L56
            goto L64
        L56:
            int r9 = r9 - r5
            r8[r6] = r9
            int r3 = -r9
            java.util.WeakHashMap<android.view.View, a.Jg> r5 = a.C0414ug.f721a
            r4.offsetTopAndBottom(r3)
            r3 = 4
            r2.D(r3)
            goto L72
        L64:
            if (r3 != 0) goto L67
        L66:
            return
        L67:
            r8[r6] = r7
            int r3 = -r7
            java.util.WeakHashMap<android.view.View, a.Jg> r5 = a.C0414ug.f721a
            r4.offsetTopAndBottom(r3)
            r2.D(r6)
        L72:
            int r3 = r4.getTop()
            r2.v(r3)
            r2.O = r7
            r2.P = r6
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3, int r4, int r5, int[] r6) {
            r0 = this;
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(android.view.View r6, android.os.Parcelable r7) {
            r5 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior$d r7 = (com.google.android.material.bottomsheet.BottomSheetBehavior.d) r7
            int r6 = r5.f1049a
            r0 = 1
            r1 = 2
            r2 = 4
            if (r6 != 0) goto La
            goto L34
        La:
            r3 = -1
            if (r6 == r3) goto L11
            r4 = r6 & 1
            if (r4 != r0) goto L15
        L11:
            int r4 = r7.d
            r5.e = r4
        L15:
            if (r6 == r3) goto L1b
            r4 = r6 & 2
            if (r4 != r1) goto L1f
        L1b:
            boolean r4 = r7.e
            r5.b = r4
        L1f:
            if (r6 == r3) goto L25
            r4 = r6 & 4
            if (r4 != r2) goto L29
        L25:
            boolean r4 = r7.f
            r5.I = r4
        L29:
            if (r6 == r3) goto L30
            r3 = 8
            r6 = r6 & r3
            if (r6 != r3) goto L34
        L30:
            boolean r6 = r7.g
            r5.J = r6
        L34:
            int r6 = r7.c
            if (r6 == r0) goto L3e
            if (r6 != r1) goto L3b
            goto L3e
        L3b:
            r5.L = r6
            return
        L3e:
            r5.L = r2
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final android.os.Parcelable o(android.view.View r2) {
            r1 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior$d r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior$d
            android.view.AbsSavedState r0 = android.view.View.BaseSavedState.EMPTY_STATE
            r2.<init>(r1)
            return r2
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, android.view.View r4, int r5, int r6) {
            r0 = this;
            r1 = 0
            r0.O = r1
            r0.P = r1
            r2 = r5 & 2
            if (r2 == 0) goto La
            r1 = 1
        La:
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.y()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.D(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.V
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lb5
            boolean r3 = r2.P
            if (r3 != 0) goto L1f
            goto Lb5
        L1f:
            int r3 = r2.O
            r5 = 6
            if (r3 <= 0) goto L34
            boolean r3 = r2.b
            if (r3 == 0) goto L2a
            goto Laf
        L2a:
            int r3 = r4.getTop()
            int r6 = r2.E
            if (r3 <= r6) goto Laf
            goto Lae
        L34:
            boolean r3 = r2.I
            if (r3 == 0) goto L55
            android.view.VelocityTracker r3 = r2.X
            if (r3 != 0) goto L3e
            r3 = 0
            goto L4d
        L3e:
            r6 = 1000(0x3e8, float:1.401E-42)
            float r1 = r2.c
            r3.computeCurrentVelocity(r6, r1)
            android.view.VelocityTracker r3 = r2.X
            int r6 = r2.Y
            float r3 = r3.getYVelocity(r6)
        L4d:
            boolean r3 = r2.E(r4, r3)
            if (r3 == 0) goto L55
            r0 = 5
            goto Laf
        L55:
            int r3 = r2.O
            r6 = 4
            if (r3 != 0) goto L93
            int r3 = r4.getTop()
            boolean r1 = r2.b
            if (r1 == 0) goto L74
            int r5 = r2.D
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L97
            goto Laf
        L74:
            int r1 = r2.E
            if (r3 >= r1) goto L83
            int r6 = r2.G
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto Lae
            goto Laf
        L83:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
            goto Lae
        L93:
            boolean r3 = r2.b
            if (r3 == 0) goto L99
        L97:
            r0 = r6
            goto Laf
        L99:
            int r3 = r4.getTop()
            int r0 = r2.E
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.G
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L97
        Lae:
            r0 = r5
        Laf:
            r3 = 0
            r2.F(r4, r0, r3)
            r2.P = r3
        Lb5:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r5, V r6, android.view.MotionEvent r7) {
            r4 = this;
            boolean r5 = r6.isShown()
            if (r5 != 0) goto L8
            r5 = 0
            return r5
        L8:
            int r5 = r7.getActionMasked()
            int r0 = r4.L
            r1 = 1
            if (r0 != r1) goto L14
            if (r5 != 0) goto L14
            return r1
        L14:
            a.zg r2 = r4.M
            if (r2 == 0) goto L21
            boolean r3 = r4.K
            if (r3 != 0) goto L1e
            if (r0 != r1) goto L21
        L1e:
            r2.j(r7)
        L21:
            if (r5 != 0) goto L32
            r0 = -1
            r4.Y = r0
            r4.Z = r0
            android.view.VelocityTracker r0 = r4.X
            if (r0 == 0) goto L32
            r0.recycle()
            r0 = 0
            r4.X = r0
        L32:
            android.view.VelocityTracker r0 = r4.X
            if (r0 != 0) goto L3c
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.X = r0
        L3c:
            android.view.VelocityTracker r0 = r4.X
            r0.addMovement(r7)
            a.zg r0 = r4.M
            if (r0 == 0) goto L74
            boolean r0 = r4.K
            if (r0 != 0) goto L4d
            int r0 = r4.L
            if (r0 != r1) goto L74
        L4d:
            r0 = 2
            if (r5 != r0) goto L74
            boolean r5 = r4.N
            if (r5 != 0) goto L74
            int r5 = r4.Z
            float r5 = (float) r5
            float r0 = r7.getY()
            float r5 = r5 - r0
            float r5 = java.lang.Math.abs(r5)
            a.zg r0 = r4.M
            int r2 = r0.b
            float r2 = (float) r2
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 <= 0) goto L74
            int r5 = r7.getActionIndex()
            int r5 = r7.getPointerId(r5)
            r0.b(r6, r5)
        L74:
            boolean r5 = r4.N
            r5 = r5 ^ r1
            return r5
    }

    public final void s() {
            r2 = this;
            int r0 = r2.u()
            boolean r1 = r2.b
            if (r1 == 0) goto L14
            int r1 = r2.T
            int r1 = r1 - r0
            int r0 = r2.D
            int r0 = java.lang.Math.max(r1, r0)
            r2.G = r0
            return
        L14:
            int r1 = r2.T
            int r1 = r1 - r0
            r2.G = r1
            return
    }

    public final float t() {
            r5 = this;
            a.Ta r0 = r5.i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r5.U
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r5.U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.A()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = r0.getRootWindowInsets()
            if (r0 == 0) goto L79
            a.Ta r2 = r5.i
            a.Ta$b r3 = r2.f278a
            a.Vd r3 = r3.f280a
            a.w4 r3 = r3.e
            android.graphics.RectF r2 = r2.g()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = a.C0382t2.h(r0)
            if (r3 == 0) goto L4e
            int r3 = a.C0382t2.c(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = r1
        L4f:
            a.Ta r2 = r5.i
            a.Ta$b r4 = r2.f278a
            a.Vd r4 = r4.f280a
            a.w4 r4 = r4.f
            android.graphics.RectF r2 = r2.g()
            float r2 = r4.a(r2)
            android.view.RoundedCorner r0 = a.C0382t2.m(r0)
            if (r0 == 0) goto L74
            int r0 = a.C0382t2.c(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            float r1 = r0 / r2
        L74:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L79:
            return r1
    }

    public final int u() {
            r3 = this;
            boolean r0 = r3.f
            if (r0 == 0) goto L1d
            int r0 = r3.g
            int r1 = r3.T
            int r2 = r3.S
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.R
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r3.v
            int r0 = r0 + r1
            return r0
        L1d:
            boolean r0 = r3.n
            if (r0 != 0) goto L33
            boolean r0 = r3.o
            if (r0 != 0) goto L33
            int r0 = r3.m
            if (r0 <= 0) goto L33
            int r1 = r3.e
            int r2 = r3.h
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L33:
            int r0 = r3.e
            int r1 = r3.v
            int r0 = r0 + r1
            return r0
    }

    public final void v(int r3) {
            r2 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L33
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$c> r0 = r2.W
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L33
            int r1 = r2.G
            if (r3 > r1) goto L20
            int r3 = r2.y()
            if (r1 != r3) goto L1d
            goto L20
        L1d:
            r2.y()
        L20:
            r3 = 0
        L21:
            int r1 = r0.size()
            if (r3 >= r1) goto L33
            java.lang.Object r1 = r0.get(r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior$c r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior.c) r1
            r1.a()
            int r3 = r3 + 1
            goto L21
        L33:
            return
    }

    public final int y() {
            r2 = this;
            boolean r0 = r2.b
            if (r0 == 0) goto L7
            int r0 = r2.D
            return r0
        L7:
            int r0 = r2.C
            boolean r1 = r2.r
            if (r1 == 0) goto Lf
            r1 = 0
            goto L11
        Lf:
            int r1 = r2.w
        L11:
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    public final int z(int r3) {
            r2 = this;
            r0 = 3
            if (r3 == r0) goto L21
            r0 = 4
            if (r3 == r0) goto L1e
            r0 = 5
            if (r3 == r0) goto L1b
            r0 = 6
            if (r3 != r0) goto Lf
            int r3 = r2.E
            return r3
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid state to get top offset: "
            java.lang.String r3 = a.C0487z.e(r1, r3)
            r0.<init>(r3)
            throw r0
        L1b:
            int r3 = r2.T
            return r3
        L1e:
            int r3 = r2.G
            return r3
        L21:
            int r3 = r2.y()
            return r3
    }
}
