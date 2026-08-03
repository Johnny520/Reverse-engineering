package androidx.coordinatorlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends android.view.ViewGroup implements a.Kb, a.Lb {
    public static final java.lang.String t = null;
    public static final java.lang.Class<?>[] u = null;
    public static final java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout.c>>> v = null;
    public static final androidx.coordinatorlayout.widget.CoordinatorLayout.i w = null;
    public static final a.Dc x = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f876a;
    public final a.A2 b;
    public final java.util.ArrayList c;
    public final java.util.ArrayList d;
    public final int[] e;
    public final int[] f;
    public boolean g;
    public boolean h;
    public final int[] i;
    public android.view.View j;
    public android.view.View k;
    public androidx.coordinatorlayout.widget.CoordinatorLayout.g l;
    public boolean m;
    public a.nh n;
    public boolean o;
    public android.graphics.drawable.Drawable p;
    public android.view.ViewGroup.OnHierarchyChangeListener q;
    public androidx.coordinatorlayout.widget.CoordinatorLayout.a r;
    public final a.Mb s;

    public class a implements a.Tb {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f877a;

        public a(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.<init>()
                r0.f877a = r1
                return
        }

        @Override // a.Tb
        public final a.nh a(android.view.View r7, a.nh r8) {
                r6 = this;
                r7 = 1
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r6.f877a
                a.nh r1 = r0.n
                boolean r1 = java.util.Objects.equals(r1, r8)
                if (r1 != 0) goto L58
                r0.n = r8
                int r1 = r8.d()
                r2 = 0
                if (r1 <= 0) goto L16
                r1 = r7
                goto L17
            L16:
                r1 = r2
            L17:
                r0.o = r1
                if (r1 != 0) goto L23
                android.graphics.drawable.Drawable r1 = r0.getBackground()
                if (r1 != 0) goto L23
                r1 = r7
                goto L24
            L23:
                r1 = r2
            L24:
                r0.setWillNotDraw(r1)
                a.nh$k r1 = r8.f603a
                boolean r3 = r1.m()
                if (r3 == 0) goto L30
                goto L55
            L30:
                int r3 = r0.getChildCount()
            L34:
                if (r2 >= r3) goto L55
                android.view.View r4 = r0.getChildAt(r2)
                java.util.WeakHashMap<android.view.View, a.Jg> r5 = a.C0414ug.f721a
                boolean r5 = r4.getFitsSystemWindows()
                if (r5 == 0) goto L53
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.f879a
                if (r4 == 0) goto L53
                boolean r4 = r1.m()
                if (r4 == 0) goto L53
                goto L55
            L53:
                int r2 = r2 + r7
                goto L34
            L55:
                r0.requestLayout()
            L58:
                return r8
        }
    }

    public interface b {
        androidx.coordinatorlayout.widget.CoordinatorLayout.c getBehavior();
    }

    public static abstract class c<V extends android.view.View> {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        public c(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean a(android.view.View r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean b(android.view.View r1, android.view.View r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void c(androidx.coordinatorlayout.widget.CoordinatorLayout.f r1) {
                r0 = this;
                return
        }

        public boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void e(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2) {
                r0 = this;
                return
        }

        public void f() {
                r0 = this;
                return
        }

        public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.MotionEvent r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, int r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean i(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3, int r4, int r5) {
                r0 = this;
                r1 = 0
                return r1
        }

        public boolean j(android.view.View r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void k(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4, int r5, int[] r6, int r7) {
                r0 = this;
                return
        }

        public void l(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3, int r4, int r5, int[] r6) {
                r0 = this;
                r1 = 0
                r2 = r6[r1]
                int r2 = r2 + r4
                r6[r1] = r2
                r1 = 1
                r2 = r6[r1]
                int r2 = r2 + r5
                r6[r1] = r2
                return
        }

        public boolean m(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.graphics.Rect r3, boolean r4) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void n(android.view.View r1, android.os.Parcelable r2) {
                r0 = this;
                return
        }

        public android.os.Parcelable o(android.view.View r1) {
                r0 = this;
                android.view.AbsSavedState r1 = android.view.View.BaseSavedState.EMPTY_STATE
                return r1
        }

        public boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, android.view.View r4, int r5, int r6) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void q(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4) {
                r0 = this;
                return
        }

        public boolean r(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.MotionEvent r3) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    @java.lang.Deprecated
    public @interface d {
        java.lang.Class<? extends androidx.coordinatorlayout.widget.CoordinatorLayout.c> value();
    }

    public class e implements android.view.ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f878a;

        public e(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.<init>()
                r0.f878a = r1
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(android.view.View r2, android.view.View r3) {
                r1 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r1.f878a
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r0.q
                if (r0 == 0) goto L9
                r0.onChildViewAdded(r2, r3)
            L9:
                return
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(android.view.View r3, android.view.View r4) {
                r2 = this;
                r0 = 2
                androidx.coordinatorlayout.widget.CoordinatorLayout r1 = r2.f878a
                r1.p(r0)
                android.view.ViewGroup$OnHierarchyChangeListener r0 = r1.q
                if (r0 == 0) goto Ld
                r0.onChildViewRemoved(r3, r4)
            Ld:
                return
        }
    }

    public static class f extends android.view.ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.coordinatorlayout.widget.CoordinatorLayout.c f879a;
        public boolean b;
        public final int c;
        public int d;
        public final int e;
        public final int f;
        public final int g;
        public int h;
        public int i;
        public int j;
        public android.view.View k;
        public android.view.View l;
        public boolean m;
        public boolean n;
        public boolean o;
        public final android.graphics.Rect p;

        public f() {
                r2 = this;
                r0 = -2
                r2.<init>(r0, r0)
                r0 = 0
                r2.b = r0
                r2.c = r0
                r2.d = r0
                r1 = -1
                r2.e = r1
                r2.f = r1
                r2.g = r0
                r2.h = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r2.p = r0
                return
        }

        public f(android.content.Context r7, android.util.AttributeSet r8) {
                r6 = this;
                r6.<init>(r7, r8)
                r0 = 0
                r6.b = r0
                r6.c = r0
                r6.d = r0
                r1 = -1
                r6.e = r1
                r6.f = r1
                r6.g = r0
                r6.h = r0
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r6.p = r2
                int[] r2 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout
                android.content.res.TypedArray r2 = r7.obtainStyledAttributes(r8, r2)
                int r3 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_android_layout_gravity
                int r3 = r2.getInteger(r3, r0)
                r6.c = r3
                int r3 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_anchor
                int r3 = r2.getResourceId(r3, r1)
                r6.f = r3
                int r3 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_anchorGravity
                int r3 = r2.getInteger(r3, r0)
                r6.d = r3
                int r3 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_keyline
                int r1 = r2.getInteger(r3, r1)
                r6.e = r1
                int r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_insetEdge
                int r1 = r2.getInt(r1, r0)
                r6.g = r1
                int r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges
                int r1 = r2.getInt(r1, r0)
                r6.h = r1
                int r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_behavior
                boolean r1 = r2.hasValue(r1)
                r6.b = r1
                if (r1 == 0) goto Lf5
                int r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_Layout_layout_behavior
                java.lang.String r1 = r2.getString(r1)
                java.lang.String r3 = androidx.coordinatorlayout.widget.CoordinatorLayout.t
                boolean r3 = android.text.TextUtils.isEmpty(r1)
                if (r3 == 0) goto L6b
                r7 = 0
                goto Le6
            L6b:
                java.lang.String r3 = "."
                boolean r3 = r1.startsWith(r3)
                if (r3 == 0) goto L87
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = r7.getPackageName()
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                goto Laa
            L87:
                r3 = 46
                int r4 = r1.indexOf(r3)
                if (r4 < 0) goto L90
                goto Laa
            L90:
                java.lang.String r4 = androidx.coordinatorlayout.widget.CoordinatorLayout.t
                boolean r5 = android.text.TextUtils.isEmpty(r4)
                if (r5 != 0) goto Laa
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r4)
                r5.append(r3)
                r5.append(r1)
                java.lang.String r1 = r5.toString()
            Laa:
                java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.reflect.Constructor<androidx.coordinatorlayout.widget.CoordinatorLayout$c>>> r3 = androidx.coordinatorlayout.widget.CoordinatorLayout.v     // Catch: java.lang.Exception -> Lbd
                java.lang.Object r4 = r3.get()     // Catch: java.lang.Exception -> Lbd
                java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.Exception -> Lbd
                if (r4 != 0) goto Lbf
                java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Exception -> Lbd
                r4.<init>()     // Catch: java.lang.Exception -> Lbd
                r3.set(r4)     // Catch: java.lang.Exception -> Lbd
                goto Lbf
            Lbd:
                r7 = move-exception
                goto Le9
            Lbf:
                java.lang.Object r3 = r4.get(r1)     // Catch: java.lang.Exception -> Lbd
                java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3     // Catch: java.lang.Exception -> Lbd
                if (r3 != 0) goto Ldc
                java.lang.ClassLoader r3 = r7.getClassLoader()     // Catch: java.lang.Exception -> Lbd
                java.lang.Class r0 = java.lang.Class.forName(r1, r0, r3)     // Catch: java.lang.Exception -> Lbd
                java.lang.Class<?>[] r3 = androidx.coordinatorlayout.widget.CoordinatorLayout.u     // Catch: java.lang.Exception -> Lbd
                java.lang.reflect.Constructor r3 = r0.getConstructor(r3)     // Catch: java.lang.Exception -> Lbd
                r0 = 1
                r3.setAccessible(r0)     // Catch: java.lang.Exception -> Lbd
                r4.put(r1, r3)     // Catch: java.lang.Exception -> Lbd
            Ldc:
                java.lang.Object[] r7 = new java.lang.Object[]{r7, r8}     // Catch: java.lang.Exception -> Lbd
                java.lang.Object r7 = r3.newInstance(r7)     // Catch: java.lang.Exception -> Lbd
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.c) r7     // Catch: java.lang.Exception -> Lbd
            Le6:
                r6.f879a = r7
                goto Lf5
            Le9:
                java.lang.RuntimeException r8 = new java.lang.RuntimeException
                java.lang.String r0 = "Could not inflate Behavior subclass "
                java.lang.String r0 = a.C0487z.k(r0, r1)
                r8.<init>(r0, r7)
                throw r8
            Lf5:
                r2.recycle()
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r7 = r6.f879a
                if (r7 == 0) goto Lff
                r7.c(r6)
            Lff:
                return
        }

        public f(android.view.ViewGroup.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.b = r2
                r1.c = r2
                r1.d = r2
                r0 = -1
                r1.e = r0
                r1.f = r0
                r1.g = r2
                r1.h = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.p = r2
                return
        }

        public f(android.view.ViewGroup.MarginLayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.b = r2
                r1.c = r2
                r1.d = r2
                r0 = -1
                r1.e = r0
                r1.f = r0
                r1.g = r2
                r1.h = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.p = r2
                return
        }

        public f(androidx.coordinatorlayout.widget.CoordinatorLayout.f r2) {
                r1 = this;
                r1.<init>(r2)
                r2 = 0
                r1.b = r2
                r1.c = r2
                r1.d = r2
                r0 = -1
                r1.e = r0
                r1.f = r0
                r1.g = r2
                r1.h = r2
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.p = r2
                return
        }

        public final boolean a(int r2) {
                r1 = this;
                if (r2 == 0) goto La
                r0 = 1
                if (r2 == r0) goto L7
                r2 = 0
                return r2
            L7:
                boolean r2 = r1.n
                return r2
            La:
                boolean r2 = r1.m
                return r2
        }
    }

    public class g implements android.view.ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f880a;

        public g(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
                r0 = this;
                r0.<init>()
                r0.f880a = r1
                return
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
                r2 = this;
                androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r2.f880a
                r1 = 0
                r0.p(r1)
                r0 = 1
                return r0
        }
    }

    public static class h extends a.r {
        public static final android.os.Parcelable.Creator<androidx.coordinatorlayout.widget.CoordinatorLayout.h> CREATOR = null;
        public android.util.SparseArray<android.os.Parcelable> c;

        public static class a implements android.os.Parcelable.ClassLoaderCreator<androidx.coordinatorlayout.widget.CoordinatorLayout.h> {
            @Override // android.os.Parcelable.Creator
            public final java.lang.Object createFromParcel(android.os.Parcel r3) {
                    r2 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$h r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$h
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final androidx.coordinatorlayout.widget.CoordinatorLayout.h createFromParcel(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$h r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$h
                    r0.<init>(r2, r3)
                    return r0
            }

            @Override // android.os.Parcelable.Creator
            public final java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    androidx.coordinatorlayout.widget.CoordinatorLayout$h[] r1 = new androidx.coordinatorlayout.widget.CoordinatorLayout.h[r1]
                    return r1
            }
        }

        static {
                androidx.coordinatorlayout.widget.CoordinatorLayout$h$a r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$h$a
                r0.<init>()
                androidx.coordinatorlayout.widget.CoordinatorLayout.h.CREATOR = r0
                return
        }

        public h(android.os.Parcel r6, java.lang.ClassLoader r7) {
                r5 = this;
                r5.<init>(r6, r7)
                int r0 = r6.readInt()
                int[] r1 = new int[r0]
                r6.readIntArray(r1)
                android.os.Parcelable[] r6 = r6.readParcelableArray(r7)
                android.util.SparseArray r7 = new android.util.SparseArray
                r7.<init>(r0)
                r5.c = r7
                r7 = 0
            L18:
                if (r7 >= r0) goto L26
                android.util.SparseArray<android.os.Parcelable> r2 = r5.c
                r3 = r1[r7]
                r4 = r6[r7]
                r2.append(r3, r4)
                int r7 = r7 + 1
                goto L18
            L26:
                return
        }

        @Override // a.r, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel r6, int r7) {
                r5 = this;
                super.writeToParcel(r6, r7)
                android.util.SparseArray<android.os.Parcelable> r0 = r5.c
                r1 = 0
                if (r0 == 0) goto Ld
                int r0 = r0.size()
                goto Le
            Ld:
                r0 = r1
            Le:
                r6.writeInt(r0)
                int[] r2 = new int[r0]
                android.os.Parcelable[] r3 = new android.os.Parcelable[r0]
            L15:
                if (r1 >= r0) goto L2c
                android.util.SparseArray<android.os.Parcelable> r4 = r5.c
                int r4 = r4.keyAt(r1)
                r2[r1] = r4
                android.util.SparseArray<android.os.Parcelable> r4 = r5.c
                java.lang.Object r4 = r4.valueAt(r1)
                android.os.Parcelable r4 = (android.os.Parcelable) r4
                r3[r1] = r4
                int r1 = r1 + 1
                goto L15
            L2c:
                r6.writeIntArray(r2)
                r6.writeParcelableArray(r3, r7)
                return
        }
    }

    public static class i implements java.util.Comparator<android.view.View> {
        @Override // java.util.Comparator
        public final int compare(android.view.View r2, android.view.View r3) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                android.view.View r3 = (android.view.View) r3
                java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
                float r2 = a.C0414ug.d.m(r2)
                float r3 = a.C0414ug.d.m(r3)
                int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r0 <= 0) goto L14
                r2 = -1
                return r2
            L14:
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 >= 0) goto L1a
                r2 = 1
                return r2
            L1a:
                r2 = 0
                return r2
        }
    }

    static {
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto Ld
            java.lang.String r0 = r0.getName()
            goto Le
        Ld:
            r0 = 0
        Le:
            androidx.coordinatorlayout.widget.CoordinatorLayout.t = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.w = r0
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class<android.util.AttributeSet> r1 = android.util.AttributeSet.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1}
            androidx.coordinatorlayout.widget.CoordinatorLayout.u = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.v = r0
            a.Dc r0 = new a.Dc
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.x = r0
            return
    }

    public CoordinatorLayout(android.content.Context r10, android.util.AttributeSet r11) {
            r9 = this;
            r6 = 1
            int r5 = androidx.coordinatorlayout.R.attr.coordinatorLayoutStyle
            r9.<init>(r10, r11, r5)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r9.f876a = r2
            a.A2 r2 = new a.A2
            r2.<init>(r6)
            r9.b = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r9.c = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r9.d = r2
            r2 = 2
            int[] r4 = new int[r2]
            r9.e = r4
            int[] r2 = new int[r2]
            r9.f = r2
            a.Mb r2 = new a.Mb
            r2.<init>()
            r9.s = r2
            r7 = 0
            if (r5 != 0) goto L3f
            int[] r2 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            int r4 = androidx.coordinatorlayout.R.style.Widget_Support_CoordinatorLayout
            android.content.res.TypedArray r2 = r10.obtainStyledAttributes(r11, r2, r7, r4)
        L3d:
            r4 = r2
            goto L46
        L3f:
            int[] r2 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            android.content.res.TypedArray r2 = r10.obtainStyledAttributes(r11, r2, r5, r7)
            goto L3d
        L46:
            int r2 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r2 < r8) goto L61
            if (r5 != 0) goto L59
            int[] r2 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            int r5 = androidx.coordinatorlayout.R.style.Widget_Support_CoordinatorLayout
            r0 = r9
            r1 = r10
            r3 = r11
            a.E.o(r0, r1, r2, r3, r4, r5)
            goto L61
        L59:
            int[] r2 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout
            r0 = r9
            r1 = r10
            r3 = r11
            a.E.v(r0, r1, r2, r3, r4, r5)
        L61:
            int r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_keylines
            int r1 = r4.getResourceId(r1, r7)
            if (r1 == 0) goto L87
            android.content.res.Resources r2 = r10.getResources()
            int[] r1 = r2.getIntArray(r1)
            r9.i = r1
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            int r1 = r1.length
        L7a:
            if (r7 >= r1) goto L87
            int[] r3 = r9.i
            r5 = r3[r7]
            float r5 = (float) r5
            float r5 = r5 * r2
            int r5 = (int) r5
            r3[r7] = r5
            int r7 = r7 + r6
            goto L7a
        L87:
            int r1 = androidx.coordinatorlayout.R.styleable.CoordinatorLayout_statusBarBackground
            android.graphics.drawable.Drawable r1 = r4.getDrawable(r1)
            r9.p = r1
            r4.recycle()
            r9.x()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r1 = new androidx.coordinatorlayout.widget.CoordinatorLayout$e
            r1.<init>(r9)
            super.setOnHierarchyChangeListener(r1)
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            int r1 = r9.getImportantForAccessibility()
            if (r1 != 0) goto La8
            r9.setImportantForAccessibility(r6)
        La8:
            return
    }

    public static android.graphics.Rect a() {
            a.Dc r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.x
            java.lang.Object r0 = r0.a()
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r0 != 0) goto Lf
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
        Lf:
            return r0
    }

    public static void g(int r6, android.graphics.Rect r7, android.graphics.Rect r8, androidx.coordinatorlayout.widget.CoordinatorLayout.f r9, int r10, int r11) {
            int r0 = r9.c
            if (r0 != 0) goto L6
            r0 = 17
        L6:
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r6)
            int r9 = r9.d
            r1 = r9 & 7
            if (r1 != 0) goto L14
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r9 = r9 | r1
        L14:
            r1 = r9 & 112(0x70, float:1.57E-43)
            if (r1 != 0) goto L1a
            r9 = r9 | 48
        L1a:
            int r6 = android.view.Gravity.getAbsoluteGravity(r9, r6)
            r9 = r0 & 7
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = r6 & 7
            r6 = r6 & 112(0x70, float:1.57E-43)
            r2 = 5
            r3 = 1
            if (r1 == r3) goto L32
            if (r1 == r2) goto L2f
            int r1 = r7.left
            goto L3b
        L2f:
            int r1 = r7.right
            goto L3b
        L32:
            int r1 = r7.left
            int r4 = r7.width()
            int r4 = r4 / 2
            int r1 = r1 + r4
        L3b:
            r4 = 80
            r5 = 16
            if (r6 == r5) goto L49
            if (r6 == r4) goto L46
            int r6 = r7.top
            goto L52
        L46:
            int r6 = r7.bottom
            goto L52
        L49:
            int r6 = r7.top
            int r7 = r7.height()
            int r7 = r7 / 2
            int r6 = r6 + r7
        L52:
            if (r9 == r3) goto L58
            if (r9 == r2) goto L5b
            int r1 = r1 - r10
            goto L5b
        L58:
            int r7 = r10 / 2
            int r1 = r1 - r7
        L5b:
            if (r0 == r5) goto L61
            if (r0 == r4) goto L64
            int r6 = r6 - r11
            goto L64
        L61:
            int r7 = r11 / 2
            int r6 = r6 - r7
        L64:
            int r10 = r10 + r1
            int r11 = r11 + r6
            r8.set(r1, r6, r10, r11)
            return
    }

    public static androidx.coordinatorlayout.widget.CoordinatorLayout.f k(android.view.View r6) {
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r0
            boolean r1 = r0.b
            if (r1 != 0) goto L8e
            boolean r1 = r6 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.b
            r2 = 1
            java.lang.String r3 = "CoordinatorLayout"
            if (r1 == 0) goto L33
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.b) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.getBehavior()
            if (r6 != 0) goto L1e
            java.lang.String r1 = "Attached behavior class is null"
            android.util.Log.e(r3, r1)
        L1e:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r0.f879a
            if (r1 == r6) goto L30
            if (r1 == 0) goto L27
            r1.f()
        L27:
            r0.f879a = r6
            r0.b = r2
            if (r6 == 0) goto L30
            r6.c(r0)
        L30:
            r0.b = r2
            return r0
        L33:
            java.lang.Class r6 = r6.getClass()
            r1 = 0
            r4 = r1
        L39:
            if (r6 == 0) goto L4a
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout$d> r4 = androidx.coordinatorlayout.widget.CoordinatorLayout.d.class
            java.lang.annotation.Annotation r4 = r6.getAnnotation(r4)
            androidx.coordinatorlayout.widget.CoordinatorLayout$d r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.d) r4
            if (r4 != 0) goto L4a
            java.lang.Class r6 = r6.getSuperclass()
            goto L39
        L4a:
            if (r4 == 0) goto L8c
            java.lang.Class r6 = r4.value()     // Catch: java.lang.Exception -> L6d
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r1)     // Catch: java.lang.Exception -> L6d
            java.lang.Object r6 = r6.newInstance(r1)     // Catch: java.lang.Exception -> L6d
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.c) r6     // Catch: java.lang.Exception -> L6d
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r1 = r0.f879a     // Catch: java.lang.Exception -> L6d
            if (r1 == r6) goto L8c
            if (r1 == 0) goto L63
            r1.f()     // Catch: java.lang.Exception -> L6d
        L63:
            r0.f879a = r6     // Catch: java.lang.Exception -> L6d
            r0.b = r2     // Catch: java.lang.Exception -> L6d
            if (r6 == 0) goto L8c
            r6.c(r0)     // Catch: java.lang.Exception -> L6d
            goto L8c
        L6d:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "Default behavior class "
            r1.<init>(r5)
            java.lang.Class r4 = r4.value()
            java.lang.String r4 = r4.getName()
            r1.append(r4)
            java.lang.String r4 = " could not be instantiated. Did you forget a default constructor?"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r3, r1, r6)
        L8c:
            r0.b = r2
        L8e:
            return r0
    }

    public static void v(android.view.View r3, int r4) {
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r0
            int r1 = r0.i
            if (r1 == r4) goto L13
            int r1 = r4 - r1
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            r3.offsetLeftAndRight(r1)
            r0.i = r4
        L13:
            return
    }

    public static void w(android.view.View r3, int r4) {
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r0
            int r1 = r0.j
            if (r1 == r4) goto L13
            int r1 = r4 - r1
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            r3.offsetTopAndBottom(r1)
            r0.j = r4
        L13:
            return
    }

    public final void b(androidx.coordinatorlayout.widget.CoordinatorLayout.f r6, android.graphics.Rect r7, int r8, int r9) {
            r5 = this;
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            int r2 = r5.getPaddingLeft()
            int r3 = r6.leftMargin
            int r2 = r2 + r3
            int r3 = r7.left
            int r4 = r5.getPaddingRight()
            int r0 = r0 - r4
            int r0 = r0 - r8
            int r4 = r6.rightMargin
            int r0 = r0 - r4
            int r0 = java.lang.Math.min(r3, r0)
            int r0 = java.lang.Math.max(r2, r0)
            int r2 = r5.getPaddingTop()
            int r3 = r6.topMargin
            int r2 = r2 + r3
            int r3 = r7.top
            int r4 = r5.getPaddingBottom()
            int r1 = r1 - r4
            int r1 = r1 - r9
            int r6 = r6.bottomMargin
            int r1 = r1 - r6
            int r6 = java.lang.Math.min(r3, r1)
            int r6 = java.lang.Math.max(r2, r6)
            int r8 = r8 + r0
            int r9 = r9 + r6
            r7.set(r0, r6, r8, r9)
            return
    }

    @Override // a.Kb
    public final void c(android.view.View r2, android.view.View r3, int r4, int r5) {
            r1 = this;
            r2 = 1
            a.Mb r0 = r1.s
            if (r5 != r2) goto L8
            r0.b = r4
            goto La
        L8:
            r0.f175a = r4
        La:
            r1.k = r3
            int r2 = r1.getChildCount()
            r3 = 0
        L11:
            if (r3 >= r2) goto L23
            android.view.View r4 = r1.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            r4.getClass()
            int r3 = r3 + 1
            goto L11
        L23:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.f
            if (r0 == 0) goto Lc
            boolean r2 = super.checkLayoutParams(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            r2 = 0
            return r2
    }

    public final void d(android.view.View r3, android.graphics.Rect r4, boolean r5) {
            r2 = this;
            boolean r0 = r3.isLayoutRequested()
            if (r0 != 0) goto L29
            int r0 = r3.getVisibility()
            r1 = 8
            if (r0 != r1) goto Lf
            goto L29
        Lf:
            if (r5 == 0) goto L15
            r2.f(r3, r4)
            return
        L15:
            int r5 = r3.getLeft()
            int r0 = r3.getTop()
            int r1 = r3.getRight()
            int r3 = r3.getBottom()
            r4.set(r5, r0, r1, r3)
            return
        L29:
            r4.setEmpty()
            return
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(android.graphics.Canvas r2, android.view.View r3, long r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r0.f879a
            if (r0 == 0) goto Ld
            r0.getClass()
        Ld:
            boolean r2 = super.drawChild(r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
            r3 = this;
            super.drawableStateChanged()
            int[] r0 = r3.getDrawableState()
            android.graphics.drawable.Drawable r1 = r3.p
            if (r1 == 0) goto L16
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L16
            boolean r0 = r1.setState(r0)
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L1c
            r3.invalidate()
        L1c:
            return
    }

    public final java.util.ArrayList e(android.view.View r6) {
            r5 = this;
            a.A2 r0 = r5.b
            java.lang.Object r0 = r0.b
            a.ge r0 = (a.C0162ge) r0
            int r1 = r0.c
            r2 = 0
            r3 = 0
        La:
            if (r3 >= r1) goto L2b
            java.lang.Object r4 = r0.j(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L28
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L28
            if (r2 != 0) goto L21
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L21:
            java.lang.Object r4 = r0.h(r3)
            r2.add(r4)
        L28:
            int r3 = r3 + 1
            goto La
        L2b:
            java.util.ArrayList r6 = r5.d
            r6.clear()
            if (r2 == 0) goto L35
            r6.addAll(r2)
        L35:
            return r6
    }

    public final void f(android.view.View r5, android.graphics.Rect r6) {
            r4 = this;
            java.lang.ThreadLocal<android.graphics.Matrix> r0 = a.Bg.f35a
            int r0 = r5.getWidth()
            int r1 = r5.getHeight()
            r2 = 0
            r6.set(r2, r2, r0, r1)
            java.lang.ThreadLocal<android.graphics.Matrix> r0 = a.Bg.f35a
            java.lang.Object r1 = r0.get()
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            if (r1 != 0) goto L21
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.set(r1)
            goto L24
        L21:
            r1.reset()
        L24:
            a.Bg.a(r4, r5, r1)
            java.lang.ThreadLocal<android.graphics.RectF> r5 = a.Bg.b
            java.lang.Object r0 = r5.get()
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            if (r0 != 0) goto L39
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r5.set(r0)
        L39:
            r0.set(r6)
            r1.mapRect(r0)
            float r5 = r0.left
            r1 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 + r1
            int r5 = (int) r5
            float r2 = r0.top
            float r2 = r2 + r1
            int r2 = (int) r2
            float r3 = r0.right
            float r3 = r3 + r1
            int r3 = (int) r3
            float r0 = r0.bottom
            float r0 = r0 + r1
            int r0 = (int) r0
            r6.set(r5, r2, r3, r0)
            return
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            r0.<init>()
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.f
            if (r0 == 0) goto Lc
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r2
            r0.<init>(r2)
            return r0
        Lc:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        L18:
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$f
            r0.<init>(r2)
            return r0
    }

    public final java.util.List<android.view.View> getDependencySortedChildren() {
            r1 = this;
            r1.t()
            java.util.ArrayList r0 = r1.f876a
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public final a.nh getLastWindowInsets() {
            r1 = this;
            a.nh r0 = r1.n
            return r0
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
            r2 = this;
            a.Mb r0 = r2.s
            int r1 = r0.f175a
            int r0 = r0.b
            r0 = r0 | r1
            return r0
    }

    public android.graphics.drawable.Drawable getStatusBarBackground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.p
            return r0
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
            r3 = this;
            int r0 = super.getSuggestedMinimumHeight()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingBottom()
            int r2 = r2 + r1
            int r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
            r3 = this;
            int r0 = super.getSuggestedMinimumWidth()
            int r1 = r3.getPaddingLeft()
            int r2 = r3.getPaddingRight()
            int r2 = r2 + r1
            int r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    public final int h(int r5) {
            r4 = this;
            r0 = 0
            java.lang.String r1 = "CoordinatorLayout"
            int[] r2 = r4.i
            if (r2 != 0) goto L21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "No keylines defined for "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = " - attempted index lookup "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            android.util.Log.e(r1, r5)
            return r0
        L21:
            if (r5 < 0) goto L2a
            int r3 = r2.length
            if (r5 < r3) goto L27
            goto L2a
        L27:
            r5 = r2[r5]
            return r5
        L2a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Keyline index "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r5 = " out of range for "
            r2.append(r5)
            r2.append(r4)
            java.lang.String r5 = r2.toString()
            android.util.Log.e(r1, r5)
            return r0
    }

    @Override // a.Kb
    public final void i(android.view.View r8, int r9) {
            r7 = this;
            r0 = 0
            r1 = 1
            a.Mb r2 = r7.s
            if (r9 != r1) goto L9
            r2.b = r0
            goto Lb
        L9:
            r2.f175a = r0
        Lb:
            int r2 = r7.getChildCount()
            r3 = r0
        L10:
            if (r3 >= r2) goto L39
            android.view.View r4 = r7.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r5
            boolean r6 = r5.a(r9)
            if (r6 != 0) goto L23
            goto L36
        L23:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r5.f879a
            if (r6 == 0) goto L2a
            r6.q(r7, r4, r8, r9)
        L2a:
            if (r9 == 0) goto L32
            if (r9 == r1) goto L2f
            goto L34
        L2f:
            r5.n = r0
            goto L34
        L32:
            r5.m = r0
        L34:
            r5.o = r0
        L36:
            int r3 = r3 + 1
            goto L10
        L39:
            r8 = 0
            r7.k = r8
            return
    }

    @Override // a.Kb
    public final void j(android.view.View r15, int r16, int r17, int[] r18, int r19) {
            r14 = this;
            int r8 = r14.getChildCount()
            r9 = 0
            r0 = r9
            r10 = r0
            r11 = r10
            r12 = r11
        L9:
            r13 = 1
            if (r10 >= r8) goto L62
            android.view.View r2 = r14.getChildAt(r10)
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L19
            goto L5f
        L19:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r3
            r7 = r19
            boolean r4 = r3.a(r7)
            if (r4 != 0) goto L28
            goto L5f
        L28:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r3 = r3.f879a
            if (r3 == 0) goto L5f
            int[] r6 = r14.e
            r6[r9] = r9
            r6[r13] = r9
            r1 = r14
            r4 = r16
            r5 = r17
            r0 = r3
            r3 = r15
            r0.k(r1, r2, r3, r4, r5, r6, r7)
            if (r16 <= 0) goto L46
            r0 = r6[r9]
            int r0 = java.lang.Math.max(r11, r0)
        L44:
            r11 = r0
            goto L4d
        L46:
            r0 = r6[r9]
            int r0 = java.lang.Math.min(r11, r0)
            goto L44
        L4d:
            if (r17 <= 0) goto L57
            r0 = r6[r13]
            int r0 = java.lang.Math.max(r12, r0)
        L55:
            r12 = r0
            goto L5e
        L57:
            r0 = r6[r13]
            int r0 = java.lang.Math.min(r12, r0)
            goto L55
        L5e:
            r0 = r13
        L5f:
            int r10 = r10 + 1
            goto L9
        L62:
            r18[r9] = r11
            r18[r13] = r12
            if (r0 == 0) goto L6b
            r14.p(r13)
        L6b:
            return
    }

    public final boolean l(android.view.View r3, int r4, int r5) {
            r2 = this;
            a.Dc r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.x
            android.graphics.Rect r1 = a()
            r2.f(r3, r1)
            boolean r3 = r1.contains(r4, r5)     // Catch: java.lang.Throwable -> L14
            r1.setEmpty()
            r0.c(r1)
            return r3
        L14:
            r3 = move-exception
            r1.setEmpty()
            r0.c(r1)
            throw r3
    }

    @Override // a.Lb
    public final void m(android.view.View r15, int r16, int r17, int r18, int r19, int r20, int[] r21) {
            r14 = this;
            int r15 = r14.getChildCount()
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
        L9:
            r5 = 1
            if (r1 >= r15) goto L60
            android.view.View r8 = r14.getChildAt(r1)
            int r6 = r8.getVisibility()
            r7 = 8
            if (r6 != r7) goto L1b
            r13 = r20
            goto L5d
        L1b:
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            r13 = r20
            boolean r7 = r6.a(r13)
            if (r7 != 0) goto L2a
            goto L5d
        L2a:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f879a
            if (r6 == 0) goto L5d
            int[] r12 = r14.e
            r12[r0] = r0
            r12[r5] = r0
            r7 = r14
            r9 = r17
            r10 = r18
            r11 = r19
            r6.l(r7, r8, r9, r10, r11, r12)
            if (r18 <= 0) goto L47
            r4 = r12[r0]
            int r2 = java.lang.Math.max(r2, r4)
            goto L4d
        L47:
            r4 = r12[r0]
            int r2 = java.lang.Math.min(r2, r4)
        L4d:
            if (r19 <= 0) goto L56
            r4 = r12[r5]
            int r3 = java.lang.Math.max(r3, r4)
            goto L5c
        L56:
            r4 = r12[r5]
            int r3 = java.lang.Math.min(r3, r4)
        L5c:
            r4 = r5
        L5d:
            int r1 = r1 + 1
            goto L9
        L60:
            r15 = r21[r0]
            int r15 = r15 + r2
            r21[r0] = r15
            r15 = r21[r5]
            int r15 = r15 + r3
            r21[r5] = r15
            if (r4 == 0) goto L6f
            r14.p(r5)
        L6f:
            return
    }

    @Override // a.Kb
    public final void n(android.view.View r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            r6 = 0
            int[] r7 = r8.f
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.m(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // a.Kb
    public final boolean o(android.view.View r14, android.view.View r15, int r16, int r17) {
            r13 = this;
            int r7 = r13.getChildCount()
            r8 = 0
            r9 = r8
            r10 = r9
        L7:
            if (r9 >= r7) goto L4a
            android.view.View r2 = r13.getChildAt(r9)
            int r0 = r2.getVisibility()
            r1 = 8
            if (r0 != r1) goto L18
            r6 = r17
            goto L47
        L18:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r11 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r11.f879a
            r12 = 1
            if (r0 == 0) goto L3b
            r1 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            boolean r0 = r0.p(r1, r2, r3, r4, r5, r6)
            r10 = r10 | r0
            if (r6 == 0) goto L38
            if (r6 == r12) goto L35
            goto L47
        L35:
            r11.n = r0
            goto L47
        L38:
            r11.m = r0
            goto L47
        L3b:
            r6 = r17
            if (r6 == 0) goto L45
            if (r6 == r12) goto L42
            goto L47
        L42:
            r11.n = r8
            goto L47
        L45:
            r11.m = r8
        L47:
            int r9 = r9 + 1
            goto L7
        L4a:
            return r10
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            r0 = 0
            r2.u(r0)
            boolean r0 = r2.m
            if (r0 == 0) goto L1f
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r2.l
            if (r0 != 0) goto L16
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>(r2)
            r2.l = r0
        L16:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r2.l
            r0.addOnPreDrawListener(r1)
        L1f:
            a.nh r0 = r2.n
            if (r0 != 0) goto L2e
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            boolean r0 = r2.getFitsSystemWindows()
            if (r0 == 0) goto L2e
            a.C0414ug.c.c(r2)
        L2e:
            r0 = 1
            r2.h = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r3 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r3.u(r0)
            boolean r1 = r3.m
            if (r1 == 0) goto L18
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r3.l
            if (r1 == 0) goto L18
            android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r2 = r3.l
            r1.removeOnPreDrawListener(r2)
        L18:
            android.view.View r1 = r3.k
            if (r1 == 0) goto L1f
            r3.i(r1, r0)
        L1f:
            r3.h = r0
            return
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.o
            if (r0 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r4.p
            if (r0 == 0) goto L26
            a.nh r0 = r4.n
            r1 = 0
            if (r0 == 0) goto L15
            int r0 = r0.d()
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 <= 0) goto L26
            android.graphics.drawable.Drawable r2 = r4.p
            int r3 = r4.getWidth()
            r2.setBounds(r1, r1, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.p
            r0.draw(r5)
        L26:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionMasked()
            r1 = 1
            if (r0 != 0) goto La
            r3.u(r1)
        La:
            r2 = 0
            boolean r4 = r3.s(r4, r2)
            if (r0 == r1) goto L16
            r2 = 3
            if (r0 != r2) goto L15
            goto L16
        L15:
            return r4
        L16:
            r3.u(r1)
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
            r2 = this;
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            int r3 = r2.getLayoutDirection()
            java.util.ArrayList r4 = r2.f876a
            int r5 = r4.size()
            r6 = 0
        Ld:
            if (r6 >= r5) goto L34
            java.lang.Object r7 = r4.get(r6)
            android.view.View r7 = (android.view.View) r7
            int r0 = r7.getVisibility()
            r1 = 8
            if (r0 != r1) goto L1e
            goto L31
        L1e:
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r0.f879a
            if (r0 == 0) goto L2e
            boolean r0 = r0.h(r2, r7, r3)
            if (r0 != 0) goto L31
        L2e:
            r2.q(r7, r3)
        L31:
            int r6 = r6 + 1
            goto Ld
        L34:
            return
    }

    @Override // android.view.View
    public final void onMeasure(int r28, int r29) {
            r27 = this;
            r0 = r27
            r6 = 1
            r0.t()
            int r1 = r0.getChildCount()
            r7 = 0
            r2 = r7
        Lc:
            if (r2 >= r1) goto L31
            android.view.View r3 = r0.getChildAt(r2)
            a.A2 r4 = r0.b
            java.lang.Object r4 = r4.b
            a.ge r4 = (a.C0162ge) r4
            int r5 = r4.c
            r8 = r7
        L1b:
            if (r8 >= r5) goto L2f
            java.lang.Object r9 = r4.j(r8)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L2d
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L2d
            r1 = r6
            goto L32
        L2d:
            int r8 = r8 + r6
            goto L1b
        L2f:
            int r2 = r2 + r6
            goto Lc
        L31:
            r1 = r7
        L32:
            boolean r2 = r0.m
            if (r1 == r2) goto L66
            if (r1 == 0) goto L53
            boolean r1 = r0.h
            if (r1 == 0) goto L50
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r0.l
            if (r1 != 0) goto L47
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r1.<init>(r0)
            r0.l = r1
        L47:
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r2 = r0.l
            r1.addOnPreDrawListener(r2)
        L50:
            r0.m = r6
            goto L66
        L53:
            boolean r1 = r0.h
            if (r1 == 0) goto L64
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r0.l
            if (r1 == 0) goto L64
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r2 = r0.l
            r1.removeOnPreDrawListener(r2)
        L64:
            r0.m = r7
        L66:
            int r8 = r0.getPaddingLeft()
            int r1 = r0.getPaddingTop()
            int r9 = r0.getPaddingRight()
            int r2 = r0.getPaddingBottom()
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            int r10 = r0.getLayoutDirection()
            if (r10 != r6) goto L80
            r11 = r6
            goto L81
        L80:
            r11 = r7
        L81:
            int r12 = android.view.View.MeasureSpec.getMode(r28)
            int r13 = android.view.View.MeasureSpec.getSize(r28)
            int r14 = android.view.View.MeasureSpec.getMode(r29)
            int r15 = android.view.View.MeasureSpec.getSize(r29)
            int r16 = r8 + r9
            int r17 = r1 + r2
            int r1 = r0.getSuggestedMinimumWidth()
            int r2 = r0.getSuggestedMinimumHeight()
            a.nh r3 = r0.n
            if (r3 == 0) goto Laa
            boolean r3 = r0.getFitsSystemWindows()
            if (r3 == 0) goto Laa
            r18 = r6
            goto Lac
        Laa:
            r18 = r7
        Lac:
            java.util.ArrayList r3 = r0.f876a
            int r4 = r3.size()
            r19 = r6
            r5 = r7
            r6 = r5
        Lb6:
            if (r5 >= r4) goto L1df
            java.lang.Object r20 = r3.get(r5)
            android.view.View r20 = (android.view.View) r20
            int r7 = r20.getVisibility()
            r22 = r1
            r1 = 8
            if (r7 != r1) goto Ld8
            r20 = r3
            r23 = r4
            r24 = r8
            r25 = r9
            r1 = r22
            r21 = 0
            r22 = r5
            goto L1d1
        Ld8:
            android.view.ViewGroup$LayoutParams r1 = r20.getLayoutParams()
            r7 = r1
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r7
            int r1 = r7.e
            if (r1 < 0) goto L126
            if (r12 == 0) goto L126
            int r1 = r0.h(r1)
            r23 = r1
            int r1 = r7.c
            if (r1 != 0) goto Lf2
            r1 = 8388661(0x800035, float:1.1755018E-38)
        Lf2:
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r10)
            r1 = r1 & 7
            r24 = r2
            r2 = 3
            if (r1 != r2) goto Lff
            if (r11 == 0) goto L104
        Lff:
            r2 = 5
            if (r1 != r2) goto L113
            if (r11 == 0) goto L113
        L104:
            int r1 = r13 - r9
            int r1 = r1 - r23
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
        L10d:
            r26 = r4
            r4 = r1
            r1 = r26
            goto L12b
        L113:
            if (r1 != r2) goto L117
            if (r11 == 0) goto L11c
        L117:
            r2 = 3
            if (r1 != r2) goto L124
            if (r11 == 0) goto L124
        L11c:
            int r1 = r23 - r8
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            goto L10d
        L124:
            r2 = 0
            goto L129
        L126:
            r24 = r2
            goto L124
        L129:
            r1 = r4
            r4 = r2
        L12b:
            if (r18 == 0) goto L15e
            boolean r21 = r20.getFitsSystemWindows()
            if (r21 != 0) goto L15e
            a.nh r2 = r0.n
            int r2 = r2.b()
            r23 = r1
            a.nh r1 = r0.n
            int r1 = r1.c()
            int r1 = r1 + r2
            a.nh r2 = r0.n
            int r2 = r2.d()
            r25 = r1
            a.nh r1 = r0.n
            int r1 = r1.a()
            int r1 = r1 + r2
            int r2 = r13 - r25
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r12)
            int r1 = r15 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r14)
            goto L164
        L15e:
            r23 = r1
            r2 = r28
            r1 = r29
        L164:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r7.f879a
            if (r0 == 0) goto L18c
            r21 = r3
            r3 = r2
            r2 = r20
            r20 = r21
            r21 = 0
            r25 = r9
            r9 = r24
            r24 = r8
            r8 = r22
            r22 = r5
            r5 = r1
            r1 = r27
            boolean r0 = r0.i(r1, r2, r3, r4, r5)
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            if (r0 != 0) goto L189
            goto L1a1
        L189:
            r0 = r27
            goto L1a7
        L18c:
            r21 = r4
            r4 = r1
            r1 = r20
            r20 = r3
            r3 = r21
            r25 = r9
            r9 = r24
            r21 = 0
            r24 = r8
            r8 = r22
            r22 = r5
        L1a1:
            r5 = 0
            r0 = r27
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L1a7:
            int r2 = r1.getMeasuredWidth()
            int r2 = r2 + r16
            int r3 = r7.leftMargin
            int r2 = r2 + r3
            int r3 = r7.rightMargin
            int r2 = r2 + r3
            int r2 = java.lang.Math.max(r8, r2)
            int r3 = r1.getMeasuredHeight()
            int r3 = r3 + r17
            int r4 = r7.topMargin
            int r3 = r3 + r4
            int r4 = r7.bottomMargin
            int r3 = r3 + r4
            int r3 = java.lang.Math.max(r9, r3)
            int r1 = r1.getMeasuredState()
            int r6 = android.view.View.combineMeasuredStates(r6, r1)
            r1 = r2
            r2 = r3
        L1d1:
            int r5 = r22 + 1
            r3 = r20
            r7 = r21
            r4 = r23
            r8 = r24
            r9 = r25
            goto Lb6
        L1df:
            r8 = r1
            r9 = r2
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r6
            r2 = r28
            int r1 = android.view.View.resolveSizeAndState(r8, r2, r1)
            int r2 = r6 << 16
            r3 = r29
            int r2 = android.view.View.resolveSizeAndState(r9, r3, r2)
            r0.setMeasuredDimension(r1, r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View r3, float r4, float r5, boolean r6) {
            r2 = this;
            int r3 = r2.getChildCount()
            r4 = 0
            r5 = r4
        L6:
            if (r5 >= r3) goto L27
            android.view.View r6 = r2.getChildAt(r5)
            int r0 = r6.getVisibility()
            r1 = 8
            if (r0 != r1) goto L15
            goto L24
        L15:
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            boolean r0 = r6.a(r4)
            if (r0 != 0) goto L22
            goto L24
        L22:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f879a
        L24:
            int r5 = r5 + 1
            goto L6
        L27:
            return r4
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View r6, float r7, float r8) {
            r5 = this;
            int r7 = r5.getChildCount()
            r8 = 0
            r0 = r8
            r1 = r0
        L7:
            if (r0 >= r7) goto L2f
            android.view.View r2 = r5.getChildAt(r0)
            int r3 = r2.getVisibility()
            r4 = 8
            if (r3 != r4) goto L16
            goto L2c
        L16:
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r2
            boolean r3 = r2.a(r8)
            if (r3 != 0) goto L23
            goto L2c
        L23:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r2 = r2.f879a
            if (r2 == 0) goto L2c
            boolean r2 = r2.j(r6)
            r1 = r1 | r2
        L2c:
            int r0 = r0 + 1
            goto L7
        L2f:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.j(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View r8, int r9, int r10, int r11, int r12) {
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.n(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            r1.c(r2, r3, r4, r0)
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r7) {
            r6 = this;
            boolean r0 = r7 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.h
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r7)
            return
        L8:
            androidx.coordinatorlayout.widget.CoordinatorLayout$h r7 = (androidx.coordinatorlayout.widget.CoordinatorLayout.h) r7
            android.os.Parcelable r0 = r7.f661a
            super.onRestoreInstanceState(r0)
            android.util.SparseArray<android.os.Parcelable> r7 = r7.c
            int r0 = r6.getChildCount()
            r1 = 0
        L16:
            if (r1 >= r0) goto L39
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r2.getId()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = k(r2)
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.f879a
            r5 = -1
            if (r3 == r5) goto L36
            if (r4 == 0) goto L36
            java.lang.Object r3 = r7.get(r3)
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            if (r3 == 0) goto L36
            r4.n(r2, r3)
        L36:
            int r1 = r1 + 1
            goto L16
        L39:
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r8 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$h r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$h
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            int r2 = r8.getChildCount()
            r3 = 0
        L13:
            if (r3 >= r2) goto L36
            android.view.View r4 = r8.getChildAt(r3)
            int r5 = r4.getId()
            android.view.ViewGroup$LayoutParams r6 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f879a
            r7 = -1
            if (r5 == r7) goto L33
            if (r6 == 0) goto L33
            android.os.Parcelable r4 = r6.o(r4)
            if (r4 == 0) goto L33
            r1.append(r5, r4)
        L33:
            int r3 = r3 + 1
            goto L13
        L36:
            r0.c = r1
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.o(r2, r3, r4, r0)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.i(r2, r0)
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.s(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f879a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.j
            boolean r6 = r6.r(r0, r7, r1)
        L2a:
            android.view.View r7 = r0.j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.u(r5)
            return r6
    }

    public final void p(int r26) {
            r25 = this;
            r0 = r25
            r1 = r26
            java.util.WeakHashMap<android.view.View, a.Jg> r7 = a.C0414ug.f721a
            int r8 = r0.getLayoutDirection()
            java.util.ArrayList r7 = r0.f876a
            int r14 = r7.size()
            android.graphics.Rect r15 = a()
            android.graphics.Rect r9 = a()
            android.graphics.Rect r10 = a()
            r12 = 0
        L1d:
            a.Dc r13 = androidx.coordinatorlayout.widget.CoordinatorLayout.x
            if (r12 >= r14) goto L2f7
            java.lang.Object r16 = r7.get(r12)
            r2 = r16
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r16 = r2.getLayoutParams()
            r3 = r16
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r3
            if (r1 != 0) goto L47
            int r4 = r2.getVisibility()
            r5 = 8
            if (r4 != r5) goto L47
            r5 = r14
            r14 = r7
            r7 = r5
            r6 = r9
            r5 = r10
            r19 = r12
            r10 = 1
            r11 = 0
            r13 = 5
            goto L2ee
        L47:
            r4 = 0
        L48:
            if (r4 >= r12) goto Lfa
            java.lang.Object r5 = r7.get(r4)
            android.view.View r5 = (android.view.View) r5
            r18 = 1
            android.view.View r6 = r3.l
            if (r6 != r5) goto Ldf
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r5
            android.view.View r6 = r5.k
            if (r6 == 0) goto Ldf
            r6 = r9
            android.graphics.Rect r9 = a()
            android.graphics.Rect r11 = a()
            r20 = r10
            android.graphics.Rect r10 = a()
            r21 = r4
            android.view.View r4 = r5.k
            r0.f(r4, r9)
            r4 = 0
            r0.d(r2, r11, r4)
            r19 = r12
            int r12 = r2.getMeasuredWidth()
            r22 = r13
            int r13 = r2.getMeasuredHeight()
            r4 = r22
            r22 = r7
            r7 = r11
            r11 = r5
            r5 = r20
            g(r8, r9, r10, r11, r12, r13)
            r23 = r14
            int r14 = r10.left
            r24 = r5
            int r5 = r7.left
            if (r14 != r5) goto La4
            int r5 = r10.top
            int r14 = r7.top
            if (r5 == r14) goto La2
            goto La4
        La2:
            r5 = 0
            goto La6
        La4:
            r5 = r18
        La6:
            r0.b(r11, r10, r12, r13)
            int r12 = r10.left
            int r13 = r7.left
            int r12 = r12 - r13
            int r13 = r10.top
            int r14 = r7.top
            int r13 = r13 - r14
            if (r12 == 0) goto Lba
            java.util.WeakHashMap<android.view.View, a.Jg> r14 = a.C0414ug.f721a
            r2.offsetLeftAndRight(r12)
        Lba:
            if (r13 == 0) goto Lc1
            java.util.WeakHashMap<android.view.View, a.Jg> r12 = a.C0414ug.f721a
            r2.offsetTopAndBottom(r13)
        Lc1:
            if (r5 == 0) goto Lcc
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r5 = r11.f879a
            if (r5 == 0) goto Lcc
            android.view.View r11 = r11.k
            r5.d(r0, r2, r11)
        Lcc:
            r9.setEmpty()
            r4.c(r9)
            r7.setEmpty()
            r4.c(r7)
            r10.setEmpty()
            r4.c(r10)
            goto Leb
        Ldf:
            r21 = r4
            r22 = r7
            r6 = r9
            r24 = r10
            r19 = r12
            r4 = r13
            r23 = r14
        Leb:
            int r5 = r21 + 1
            r13 = r4
            r4 = r5
            r9 = r6
            r12 = r19
            r7 = r22
            r14 = r23
            r10 = r24
            goto L48
        Lfa:
            r22 = r7
            r6 = r9
            r24 = r10
            r19 = r12
            r4 = r13
            r23 = r14
            r5 = 1
            r0.d(r2, r6, r5)
            int r5 = r3.g
            if (r5 == 0) goto L160
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L160
            int r5 = r3.g
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r8)
            r7 = r5 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L133
            r9 = 80
            if (r7 == r9) goto L123
            goto L13d
        L123:
            int r7 = r15.bottom
            int r9 = r0.getHeight()
            int r10 = r6.top
            int r9 = r9 - r10
            int r7 = java.lang.Math.max(r7, r9)
            r15.bottom = r7
            goto L13d
        L133:
            int r7 = r15.top
            int r9 = r6.bottom
            int r7 = java.lang.Math.max(r7, r9)
            r15.top = r7
        L13d:
            r5 = r5 & 7
            r7 = 3
            if (r5 == r7) goto L156
            r7 = 5
            if (r5 == r7) goto L146
            goto L160
        L146:
            int r5 = r15.right
            int r7 = r0.getWidth()
            int r9 = r6.left
            int r7 = r7 - r9
            int r5 = java.lang.Math.max(r5, r7)
            r15.right = r5
            goto L160
        L156:
            int r5 = r15.left
            int r7 = r6.right
            int r5 = java.lang.Math.max(r5, r7)
            r15.left = r5
        L160:
            int r3 = r3.h
            if (r3 == 0) goto L271
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L271
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            boolean r3 = r2.isLaidOut()
            if (r3 != 0) goto L174
            goto L271
        L174:
            int r3 = r2.getWidth()
            if (r3 <= 0) goto L271
            int r3 = r2.getHeight()
            if (r3 > 0) goto L182
            goto L271
        L182:
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r3 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r3
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r5 = r3.f879a
            android.graphics.Rect r7 = a()
            android.graphics.Rect r9 = a()
            int r10 = r2.getLeft()
            int r11 = r2.getTop()
            int r12 = r2.getRight()
            int r13 = r2.getBottom()
            r9.set(r10, r11, r12, r13)
            if (r5 == 0) goto L1d8
            boolean r5 = r5.a(r2)
            if (r5 == 0) goto L1d8
            boolean r5 = r9.contains(r7)
            if (r5 == 0) goto L1b4
            goto L1db
        L1b4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Rect should be within the child's bounds. Rect:"
            r2.<init>(r3)
            java.lang.String r3 = r7.toShortString()
            r2.append(r3)
            java.lang.String r3 = " | Bounds:"
            r2.append(r3)
            java.lang.String r3 = r9.toShortString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1d8:
            r7.set(r9)
        L1db:
            r9.setEmpty()
            r4.c(r9)
            boolean r5 = r7.isEmpty()
            if (r5 == 0) goto L1ef
            r7.setEmpty()
            r4.c(r7)
            goto L271
        L1ef:
            int r5 = r3.h
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r8)
            r9 = 48
            r10 = r5 & 48
            if (r10 != r9) goto L20f
            int r10 = r7.top
            int r11 = r3.topMargin
            int r10 = r10 - r11
            int r11 = r3.j
            int r10 = r10 - r11
            int r11 = r15.top
            if (r10 >= r11) goto L20f
            int r11 = r11 - r10
            w(r2, r11)
            r11 = 1
        L20c:
            r10 = 80
            goto L211
        L20f:
            r11 = 0
            goto L20c
        L211:
            r12 = r5 & 80
            if (r12 != r10) goto L22b
            int r12 = r0.getHeight()
            int r13 = r7.bottom
            int r12 = r12 - r13
            int r13 = r3.bottomMargin
            int r12 = r12 - r13
            int r13 = r3.j
            int r12 = r12 + r13
            int r13 = r15.bottom
            if (r12 >= r13) goto L22b
            int r12 = r12 - r13
            w(r2, r12)
            r11 = 1
        L22b:
            if (r11 != 0) goto L231
            r11 = 0
            w(r2, r11)
        L231:
            r11 = 3
            r12 = r5 & 3
            if (r12 != r11) goto L249
            int r12 = r7.left
            int r13 = r3.leftMargin
            int r12 = r12 - r13
            int r13 = r3.i
            int r12 = r12 - r13
            int r13 = r15.left
            if (r12 >= r13) goto L249
            int r13 = r13 - r12
            v(r2, r13)
            r12 = 1
        L247:
            r13 = 5
            goto L24b
        L249:
            r12 = 0
            goto L247
        L24b:
            r5 = r5 & r13
            if (r5 != r13) goto L264
            int r5 = r0.getWidth()
            int r14 = r7.right
            int r5 = r5 - r14
            int r14 = r3.rightMargin
            int r5 = r5 - r14
            int r3 = r3.i
            int r5 = r5 + r3
            int r3 = r15.right
            if (r5 >= r3) goto L264
            int r5 = r5 - r3
            v(r2, r5)
            r12 = 1
        L264:
            if (r12 != 0) goto L26a
            r3 = 0
            v(r2, r3)
        L26a:
            r7.setEmpty()
            r4.c(r7)
            goto L277
        L271:
            r9 = 48
            r10 = 80
            r11 = 3
            r13 = 5
        L277:
            r3 = 2
            if (r1 == r3) goto L2a2
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            android.graphics.Rect r4 = r4.p
            r5 = r24
            r5.set(r4)
            boolean r4 = r5.equals(r6)
            if (r4 == 0) goto L294
            r14 = r22
            r7 = r23
        L291:
            r10 = 1
            r11 = 0
            goto L2ee
        L294:
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            android.graphics.Rect r4 = r4.p
            r4.set(r6)
        L29f:
            r18 = 1
            goto L2a5
        L2a2:
            r5 = r24
            goto L29f
        L2a5:
            int r12 = r19 + 1
            r7 = r23
        L2a9:
            r14 = r22
            if (r12 >= r7) goto L291
            java.lang.Object r4 = r14.get(r12)
            android.view.View r4 = (android.view.View) r4
            android.view.ViewGroup$LayoutParams r16 = r4.getLayoutParams()
            r9 = r16
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r9
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r10 = r9.f879a
            if (r10 == 0) goto L2e3
            boolean r17 = r10.b(r4, r2)
            if (r17 == 0) goto L2e3
            if (r1 != 0) goto L2d0
            boolean r11 = r9.o
            if (r11 == 0) goto L2d0
            r11 = 0
            r9.o = r11
            r10 = 1
            goto L2e5
        L2d0:
            r11 = 0
            if (r1 == r3) goto L2d9
            boolean r4 = r10.d(r0, r4, r2)
        L2d7:
            r10 = 1
            goto L2de
        L2d9:
            r10.e(r0, r2)
            r4 = 1
            goto L2d7
        L2de:
            if (r1 != r10) goto L2e5
            r9.o = r4
            goto L2e5
        L2e3:
            r10 = 1
            r11 = 0
        L2e5:
            int r12 = r12 + r10
            r22 = r14
            r9 = 48
            r10 = 80
            r11 = 3
            goto L2a9
        L2ee:
            int r12 = r19 + 1
            r9 = r14
            r14 = r7
            r7 = r9
            r10 = r5
            r9 = r6
            goto L1d
        L2f7:
            r6 = r9
            r5 = r10
            r4 = r13
            r15.setEmpty()
            r4.c(r15)
            r6.setEmpty()
            r4.c(r6)
            r5.setEmpty()
            r4.c(r5)
            return
    }

    public final void q(android.view.View r13, int r14) {
            r12 = this;
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r0
            android.view.View r1 = r0.k
            if (r1 != 0) goto L18
            int r2 = r0.f
            r3 = -1
            if (r2 != r3) goto L10
            goto L18
        L10:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete."
            r13.<init>(r14)
            throw r13
        L18:
            a.Dc r2 = androidx.coordinatorlayout.widget.CoordinatorLayout.x
            if (r1 == 0) goto L64
            android.graphics.Rect r4 = a()
            android.graphics.Rect r5 = a()
            r12.f(r1, r4)     // Catch: java.lang.Throwable -> L55
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()     // Catch: java.lang.Throwable -> L55
            r6 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6     // Catch: java.lang.Throwable -> L55
            int r7 = r13.getMeasuredWidth()     // Catch: java.lang.Throwable -> L55
            int r8 = r13.getMeasuredHeight()     // Catch: java.lang.Throwable -> L55
            r3 = r14
            g(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L55
            r12.b(r6, r5, r7, r8)     // Catch: java.lang.Throwable -> L55
            int r14 = r5.left     // Catch: java.lang.Throwable -> L55
            int r0 = r5.top     // Catch: java.lang.Throwable -> L55
            int r1 = r5.right     // Catch: java.lang.Throwable -> L55
            int r3 = r5.bottom     // Catch: java.lang.Throwable -> L55
            r13.layout(r14, r0, r1, r3)     // Catch: java.lang.Throwable -> L55
            r4.setEmpty()
            r2.c(r4)
            r5.setEmpty()
            r2.c(r5)
            return
        L55:
            r0 = move-exception
            r13 = r0
            r4.setEmpty()
            r2.c(r4)
            r5.setEmpty()
            r2.c(r5)
            throw r13
        L64:
            r3 = r14
            int r14 = r0.e
            if (r14 < 0) goto Le7
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r0
            int r1 = r0.c
            if (r1 != 0) goto L76
            r1 = 8388661(0x800035, float:1.1755018E-38)
        L76:
            int r1 = android.view.Gravity.getAbsoluteGravity(r1, r3)
            r2 = r1 & 7
            r1 = r1 & 112(0x70, float:1.57E-43)
            int r4 = r12.getWidth()
            int r5 = r12.getHeight()
            int r6 = r13.getMeasuredWidth()
            int r7 = r13.getMeasuredHeight()
            r8 = 1
            if (r3 != r8) goto L93
            int r14 = r4 - r14
        L93:
            int r14 = r12.h(r14)
            int r14 = r14 - r6
            if (r2 == r8) goto La0
            r3 = 5
            if (r2 == r3) goto L9e
            goto La3
        L9e:
            int r14 = r14 + r6
            goto La3
        La0:
            int r2 = r6 / 2
            int r14 = r14 + r2
        La3:
            r2 = 16
            if (r1 == r2) goto Laf
            r2 = 80
            if (r1 == r2) goto Lad
            r1 = 0
            goto Lb1
        Lad:
            r1 = r7
            goto Lb1
        Laf:
            int r1 = r7 / 2
        Lb1:
            int r2 = r12.getPaddingLeft()
            int r3 = r0.leftMargin
            int r2 = r2 + r3
            int r3 = r12.getPaddingRight()
            int r4 = r4 - r3
            int r4 = r4 - r6
            int r3 = r0.rightMargin
            int r4 = r4 - r3
            int r14 = java.lang.Math.min(r14, r4)
            int r14 = java.lang.Math.max(r2, r14)
            int r2 = r12.getPaddingTop()
            int r3 = r0.topMargin
            int r2 = r2 + r3
            int r3 = r12.getPaddingBottom()
            int r5 = r5 - r3
            int r5 = r5 - r7
            int r0 = r0.bottomMargin
            int r5 = r5 - r0
            int r0 = java.lang.Math.min(r1, r5)
            int r0 = java.lang.Math.max(r2, r0)
            int r6 = r6 + r14
            int r7 = r7 + r0
            r13.layout(r14, r0, r6, r7)
            return
        Le7:
            android.view.ViewGroup$LayoutParams r14 = r13.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r14 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r14
            android.graphics.Rect r9 = a()
            int r0 = r12.getPaddingLeft()
            int r1 = r14.leftMargin
            int r0 = r0 + r1
            int r1 = r12.getPaddingTop()
            int r4 = r14.topMargin
            int r1 = r1 + r4
            int r4 = r12.getWidth()
            int r5 = r12.getPaddingRight()
            int r4 = r4 - r5
            int r5 = r14.rightMargin
            int r4 = r4 - r5
            int r5 = r12.getHeight()
            int r6 = r12.getPaddingBottom()
            int r5 = r5 - r6
            int r6 = r14.bottomMargin
            int r5 = r5 - r6
            r9.set(r0, r1, r4, r5)
            a.nh r0 = r12.n
            if (r0 == 0) goto L158
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            boolean r0 = r12.getFitsSystemWindows()
            if (r0 == 0) goto L158
            boolean r0 = r13.getFitsSystemWindows()
            if (r0 != 0) goto L158
            int r0 = r9.left
            a.nh r1 = r12.n
            int r1 = r1.b()
            int r1 = r1 + r0
            r9.left = r1
            int r0 = r9.top
            a.nh r1 = r12.n
            int r1 = r1.d()
            int r1 = r1 + r0
            r9.top = r1
            int r0 = r9.right
            a.nh r1 = r12.n
            int r1 = r1.c()
            int r0 = r0 - r1
            r9.right = r0
            int r0 = r9.bottom
            a.nh r1 = r12.n
            int r1 = r1.a()
            int r0 = r0 - r1
            r9.bottom = r0
        L158:
            android.graphics.Rect r10 = a()
            int r14 = r14.c
            r0 = r14 & 7
            if (r0 != 0) goto L166
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r14 = r14 | r0
        L166:
            r0 = r14 & 112(0x70, float:1.57E-43)
            if (r0 != 0) goto L16c
            r14 = r14 | 48
        L16c:
            r6 = r14
            int r7 = r13.getMeasuredWidth()
            int r8 = r13.getMeasuredHeight()
            r11 = r3
            android.view.Gravity.apply(r6, r7, r8, r9, r10, r11)
            int r14 = r10.left
            int r0 = r10.top
            int r1 = r10.right
            int r3 = r10.bottom
            r13.layout(r14, r0, r1, r3)
            r9.setEmpty()
            r2.c(r9)
            r10.setEmpty()
            r2.c(r10)
            return
    }

    public final void r(android.view.View r7, int r8, int r9, int r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View r2, android.graphics.Rect r3, boolean r4) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r0.f879a
            if (r0 == 0) goto L12
            boolean r0 = r0.m(r1, r2, r3, r4)
            if (r0 == 0) goto L12
            r2 = 1
            return r2
        L12:
            boolean r2 = super.requestChildRectangleOnScreen(r2, r3, r4)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            super.requestDisallowInterceptTouchEvent(r1)
            if (r1 == 0) goto L10
            boolean r1 = r0.g
            if (r1 != 0) goto L10
            r1 = 0
            r0.u(r1)
            r1 = 1
            r0.g = r1
        L10:
            return
    }

    public final boolean s(android.view.MotionEvent r21, int r22) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            int r3 = r1.getActionMasked()
            java.util.ArrayList r4 = r0.c
            r4.clear()
            boolean r5 = r0.isChildrenDrawingOrderEnabled()
            int r6 = r0.getChildCount()
            int r7 = r6 + (-1)
        L19:
            if (r7 < 0) goto L2d
            if (r5 == 0) goto L22
            int r8 = r0.getChildDrawingOrder(r6, r7)
            goto L23
        L22:
            r8 = r7
        L23:
            android.view.View r8 = r0.getChildAt(r8)
            r4.add(r8)
            int r7 = r7 + (-1)
            goto L19
        L2d:
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r5 = androidx.coordinatorlayout.widget.CoordinatorLayout.w
            if (r5 == 0) goto L34
            java.util.Collections.sort(r4, r5)
        L34:
            int r5 = r4.size()
            r6 = 0
            r7 = 0
            r8 = r7
            r7 = r6
        L3c:
            if (r6 >= r5) goto L8d
            java.lang.Object r9 = r4.get(r6)
            android.view.View r9 = (android.view.View) r9
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r10 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r10
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r10 = r10.f879a
            r11 = 1
            if (r7 != 0) goto L50
            goto L74
        L50:
            if (r3 == 0) goto L74
            if (r10 == 0) goto L8a
            if (r8 != 0) goto L67
            long r12 = android.os.SystemClock.uptimeMillis()
            r16 = 3
            r17 = 0
            r18 = 0
            r19 = 0
            r14 = r12
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r12, r14, r16, r17, r18, r19)
        L67:
            if (r2 == 0) goto L70
            if (r2 == r11) goto L6c
            goto L8a
        L6c:
            r10.r(r0, r9, r8)
            goto L8a
        L70:
            r10.g(r0, r9, r8)
            goto L8a
        L74:
            if (r7 != 0) goto L8a
            if (r10 == 0) goto L8a
            if (r2 == 0) goto L82
            if (r2 == r11) goto L7d
            goto L86
        L7d:
            boolean r7 = r10.r(r0, r9, r1)
            goto L86
        L82:
            boolean r7 = r10.g(r0, r9, r1)
        L86:
            if (r7 == 0) goto L8a
            r0.j = r9
        L8a:
            int r6 = r6 + 1
            goto L3c
        L8d:
            r4.clear()
            return r7
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean r1) {
            r0 = this;
            super.setFitsSystemWindows(r1)
            r0.x()
            return
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener r1) {
            r0 = this;
            r0.q = r1
            return
    }

    public void setStatusBarBackground(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.p
            if (r0 == r3) goto L47
            r1 = 0
            if (r0 == 0) goto La
            r0.setCallback(r1)
        La:
            if (r3 == 0) goto L10
            android.graphics.drawable.Drawable r1 = r3.mutate()
        L10:
            r2.p = r1
            if (r1 == 0) goto L42
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L23
            android.graphics.drawable.Drawable r3 = r2.p
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L23:
            android.graphics.drawable.Drawable r3 = r2.p
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            int r0 = r2.getLayoutDirection()
            a.C0439w5.b.b(r3, r0)
            android.graphics.drawable.Drawable r3 = r2.p
            int r0 = r2.getVisibility()
            r1 = 0
            if (r0 != 0) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = r1
        L3a:
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r3 = r2.p
            r3.setCallback(r2)
        L42:
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            r2.postInvalidateOnAnimation()
        L47:
            return
    }

    public void setStatusBarBackgroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setStatusBarBackground(r0)
            return
    }

    public void setStatusBarBackgroundResource(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = a.Y3.a.b(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.setStatusBarBackground(r2)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            super.setVisibility(r3)
            r0 = 0
            if (r3 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = r0
        L9:
            android.graphics.drawable.Drawable r1 = r2.p
            if (r1 == 0) goto L18
            boolean r1 = r1.isVisible()
            if (r1 == r3) goto L18
            android.graphics.drawable.Drawable r1 = r2.p
            r1.setVisible(r3, r0)
        L18:
            return
    }

    public final void t() {
            r15 = this;
            java.util.ArrayList r0 = r15.f876a
            r0.clear()
            a.A2 r1 = r15.b
            java.lang.Object r2 = r1.b
            a.ge r2 = (a.C0162ge) r2
            int r3 = r2.c
            r4 = 0
            r5 = r4
        Lf:
            java.lang.Object r6 = r1.f7a
            a.Cc r6 = (a.Cc) r6
            if (r5 >= r3) goto L26
            java.lang.Object r7 = r2.j(r5)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 == 0) goto L23
            r7.clear()
            r6.c(r7)
        L23:
            int r5 = r5 + 1
            goto Lf
        L26:
            r2.clear()
            int r2 = r15.getChildCount()
            r3 = r4
        L2e:
            java.lang.Object r5 = r1.b
            a.ge r5 = (a.C0162ge) r5
            if (r3 >= r2) goto L16f
            android.view.View r7 = r15.getChildAt(r3)
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r8 = k(r7)
            int r9 = r8.f
            r10 = 0
            r11 = -1
            if (r9 != r11) goto L48
            r8.l = r10
            r8.k = r10
            goto Lc7
        L48:
            android.view.View r11 = r8.k
            if (r11 == 0) goto L74
            int r11 = r11.getId()
            if (r11 == r9) goto L53
            goto L74
        L53:
            android.view.View r11 = r8.k
            android.view.ViewParent r12 = r11.getParent()
        L59:
            if (r12 == r15) goto L71
            if (r12 == 0) goto L6c
            if (r12 != r7) goto L60
            goto L6c
        L60:
            boolean r13 = r12 instanceof android.view.View
            if (r13 == 0) goto L67
            r11 = r12
            android.view.View r11 = (android.view.View) r11
        L67:
            android.view.ViewParent r12 = r12.getParent()
            goto L59
        L6c:
            r8.l = r10
            r8.k = r10
            goto L74
        L71:
            r8.l = r11
            goto Lc7
        L74:
            android.view.View r11 = r15.findViewById(r9)
            r8.k = r11
            if (r11 == 0) goto Lbd
            if (r11 != r15) goto L91
            boolean r9 = r15.isInEditMode()
            if (r9 == 0) goto L89
            r8.l = r10
            r8.k = r10
            goto Lc7
        L89:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L91:
            android.view.ViewParent r9 = r11.getParent()
        L95:
            if (r9 == r15) goto Lba
            if (r9 == 0) goto Lba
            if (r9 != r7) goto Lae
            boolean r9 = r15.isInEditMode()
            if (r9 == 0) goto La6
            r8.l = r10
            r8.k = r10
            goto Lc7
        La6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        Lae:
            boolean r12 = r9 instanceof android.view.View
            if (r12 == 0) goto Lb5
            r11 = r9
            android.view.View r11 = (android.view.View) r11
        Lb5:
            android.view.ViewParent r9 = r9.getParent()
            goto L95
        Lba:
            r8.l = r11
            goto Lc7
        Lbd:
            boolean r11 = r15.isInEditMode()
            if (r11 == 0) goto L14b
            r8.l = r10
            r8.k = r10
        Lc7:
            boolean r9 = r5.containsKey(r7)
            if (r9 != 0) goto Ld0
            r5.put(r7, r10)
        Ld0:
            r9 = r4
        Ld1:
            if (r9 >= r2) goto L147
            if (r9 != r3) goto Ld6
            goto L13c
        Ld6:
            android.view.View r11 = r15.getChildAt(r9)
            android.view.View r12 = r8.l
            if (r11 == r12) goto L106
            java.util.WeakHashMap<android.view.View, a.Jg> r12 = a.C0414ug.f721a
            int r12 = r15.getLayoutDirection()
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r13 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r13
            int r13 = r13.g
            int r13 = android.view.Gravity.getAbsoluteGravity(r13, r12)
            if (r13 == 0) goto Lfc
            int r14 = r8.h
            int r12 = android.view.Gravity.getAbsoluteGravity(r14, r12)
            r12 = r12 & r13
            if (r12 != r13) goto Lfc
            goto L106
        Lfc:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r12 = r8.f879a
            if (r12 == 0) goto L13c
            boolean r12 = r12.b(r7, r11)
            if (r12 == 0) goto L13c
        L106:
            boolean r12 = r5.containsKey(r11)
            if (r12 != 0) goto L115
            boolean r12 = r5.containsKey(r11)
            if (r12 != 0) goto L115
            r5.put(r11, r10)
        L115:
            boolean r12 = r5.containsKey(r11)
            if (r12 == 0) goto L13f
            boolean r12 = r5.containsKey(r7)
            if (r12 == 0) goto L13f
            java.lang.Object r12 = r5.getOrDefault(r11, r10)
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            if (r12 != 0) goto L139
            java.lang.Object r12 = r6.a()
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            if (r12 != 0) goto L136
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L136:
            r5.put(r11, r12)
        L139:
            r12.add(r7)
        L13c:
            int r9 = r9 + 1
            goto Ld1
        L13f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L147:
            int r3 = r3 + 1
            goto L2e
        L14b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not find CoordinatorLayout descendant view with id "
            r1.<init>(r2)
            android.content.res.Resources r2 = r15.getResources()
            java.lang.String r2 = r2.getResourceName(r9)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L16f:
            java.lang.Object r2 = r1.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.clear()
            java.lang.Object r3 = r1.d
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.clear()
            int r6 = r5.c
        L17f:
            if (r4 >= r6) goto L18b
            java.lang.Object r7 = r5.h(r4)
            r1.b(r7, r2, r3)
            int r4 = r4 + 1
            goto L17f
        L18b:
            r0.addAll(r2)
            java.util.Collections.reverse(r0)
            return
    }

    public final void u(boolean r14) {
            r13 = this;
            int r0 = r13.getChildCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L32
            android.view.View r3 = r13.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r4
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r4 = r4.f879a
            if (r4 == 0) goto L2f
            long r5 = android.os.SystemClock.uptimeMillis()
            r9 = 3
            r10 = 0
            r11 = 0
            r12 = 0
            r7 = r5
            android.view.MotionEvent r5 = android.view.MotionEvent.obtain(r5, r7, r9, r10, r11, r12)
            if (r14 == 0) goto L29
            r4.g(r13, r3, r5)
            goto L2c
        L29:
            r4.r(r13, r3, r5)
        L2c:
            r5.recycle()
        L2f:
            int r2 = r2 + 1
            goto L6
        L32:
            r14 = r1
        L33:
            if (r14 >= r0) goto L45
            android.view.View r2 = r13.getChildAt(r14)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r2
            r2.getClass()
            int r14 = r14 + 1
            goto L33
        L45:
            r14 = 0
            r13.j = r14
            r13.g = r1
            return
    }

    @Override // android.view.View
    public final boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.p
            if (r2 != r0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            return r2
        Ld:
            r2 = 1
            return r2
    }

    public final void x() {
            r1 = this;
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            boolean r0 = r1.getFitsSystemWindows()
            if (r0 == 0) goto L1e
            androidx.coordinatorlayout.widget.CoordinatorLayout$a r0 = r1.r
            if (r0 != 0) goto L13
            androidx.coordinatorlayout.widget.CoordinatorLayout$a r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$a
            r0.<init>(r1)
            r1.r = r0
        L13:
            androidx.coordinatorlayout.widget.CoordinatorLayout$a r0 = r1.r
            a.C0414ug.d.u(r1, r0)
            r0 = 1280(0x500, float:1.794E-42)
            r1.setSystemUiVisibility(r0)
            return
        L1e:
            r0 = 0
            a.C0414ug.d.u(r1, r0)
            return
    }
}
