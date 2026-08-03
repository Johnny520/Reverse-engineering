package a;

/* JADX INFO: loaded from: classes.dex */
public class F9 implements a.InterfaceC0108de {
    public static final java.lang.reflect.Method A = null;
    public static final java.lang.reflect.Method B = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f82a;
    public android.widget.ListAdapter b;
    public a.A5 c;
    public final int d;
    public int e;
    public int f;
    public int g;
    public final int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public final int m;
    public a.F9.d n;
    public android.view.View o;
    public android.widget.AdapterView.OnItemClickListener p;
    public android.widget.AdapterView.OnItemSelectedListener q;
    public final a.F9.g r;
    public final a.F9.f s;
    public final a.F9.e t;
    public final a.F9.c u;
    public final android.os.Handler v;
    public final android.graphics.Rect w;
    public android.graphics.Rect x;
    public boolean y;
    public final a.C0149g1 z;

    public static class a {
        public static int a(android.widget.PopupWindow r0, android.view.View r1, int r2, boolean r3) {
                int r0 = r0.getMaxAvailableHeight(r1, r2, r3)
                return r0
        }
    }

    public static class b {
        public static void a(android.widget.PopupWindow r0, android.graphics.Rect r1) {
                r0.setEpicenterBounds(r1)
                return
        }

        public static void b(android.widget.PopupWindow r0, boolean r1) {
                r0.setIsClippedToScreen(r1)
                return
        }
    }

    public class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.F9 f83a;

        public c(a.F9 r1) {
                r0 = this;
                r0.<init>()
                r0.f83a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                a.F9 r0 = r2.f83a
                a.A5 r0 = r0.c
                if (r0 == 0) goto Ld
                r1 = 1
                r0.setListSelectionHidden(r1)
                r0.requestLayout()
            Ld:
                return
        }
    }

    public class d extends android.database.DataSetObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.F9 f84a;

        public d(a.F9 r1) {
                r0 = this;
                r0.f84a = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
                r2 = this;
                a.F9 r0 = r2.f84a
                a.g1 r1 = r0.z
                boolean r1 = r1.isShowing()
                if (r1 == 0) goto Ld
                r0.f()
            Ld:
                return
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
                r1 = this;
                a.F9 r0 = r1.f84a
                r0.dismiss()
                return
        }
    }

    public class e implements android.widget.AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.F9 f85a;

        public e(a.F9 r1) {
                r0 = this;
                r0.<init>()
                r0.f85a = r1
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(android.widget.AbsListView r1, int r2, int r3, int r4) {
                r0 = this;
                return
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(android.widget.AbsListView r2, int r3) {
                r1 = this;
                r2 = 1
                if (r3 != r2) goto L21
                a.F9 r2 = r1.f85a
                a.g1 r3 = r2.z
                int r3 = r3.getInputMethodMode()
                r0 = 2
                if (r3 != r0) goto Lf
                return
            Lf:
                a.g1 r3 = r2.z
                android.view.View r3 = r3.getContentView()
                if (r3 == 0) goto L21
                android.os.Handler r3 = r2.v
                a.F9$g r2 = r2.r
                r3.removeCallbacks(r2)
                r2.run()
            L21:
                return
        }
    }

    public class f implements android.view.View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.F9 f86a;

        public f(a.F9 r1) {
                r0 = this;
                r0.<init>()
                r0.f86a = r1
                return
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(android.view.View r4, android.view.MotionEvent r5) {
                r3 = this;
                int r4 = r5.getAction()
                float r0 = r5.getX()
                int r0 = (int) r0
                float r5 = r5.getY()
                int r5 = (int) r5
                a.F9 r1 = r3.f86a
                if (r4 != 0) goto L3a
                a.g1 r2 = r1.z
                if (r2 == 0) goto L3a
                boolean r2 = r2.isShowing()
                if (r2 == 0) goto L3a
                if (r0 < 0) goto L3a
                a.g1 r2 = r1.z
                int r2 = r2.getWidth()
                if (r0 >= r2) goto L3a
                if (r5 < 0) goto L3a
                a.g1 r0 = r1.z
                int r0 = r0.getHeight()
                if (r5 >= r0) goto L3a
                android.os.Handler r4 = r1.v
                a.F9$g r5 = r1.r
                r0 = 250(0xfa, double:1.235E-321)
                r4.postDelayed(r5, r0)
                goto L44
            L3a:
                r5 = 1
                if (r4 != r5) goto L44
                android.os.Handler r4 = r1.v
                a.F9$g r5 = r1.r
                r4.removeCallbacks(r5)
            L44:
                r4 = 0
                return r4
        }
    }

    public class g implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.F9 f87a;

        public g(a.F9 r1) {
                r0 = this;
                r0.<init>()
                r0.f87a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                a.F9 r0 = r3.f87a
                a.A5 r1 = r0.c
                if (r1 == 0) goto L2d
                boolean r1 = r1.isAttachedToWindow()
                if (r1 == 0) goto L2d
                a.A5 r1 = r0.c
                int r1 = r1.getCount()
                a.A5 r2 = r0.c
                int r2 = r2.getChildCount()
                if (r1 <= r2) goto L2d
                a.A5 r1 = r0.c
                int r1 = r1.getChildCount()
                int r2 = r0.m
                if (r1 > r2) goto L2d
                a.g1 r1 = r0.z
                r2 = 2
                r1.setInputMethodMode(r2)
                r0.f()
            L2d:
                return
        }
    }

    static {
            java.lang.String r0 = "ListPopupWindow"
            java.lang.Class<android.widget.PopupWindow> r1 = android.widget.PopupWindow.class
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 > r3) goto L32
            java.lang.String r2 = "setClipToScreenEnabled"
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L19
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.NoSuchMethodException -> L19
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L19
            a.F9.A = r2     // Catch: java.lang.NoSuchMethodException -> L19
            goto L1e
        L19:
            java.lang.String r2 = "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r0, r2)
        L1e:
            java.lang.String r2 = "setEpicenterBounds"
            java.lang.Class<android.graphics.Rect> r3 = android.graphics.Rect.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.NoSuchMethodException -> L2d
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L2d
            a.F9.B = r1     // Catch: java.lang.NoSuchMethodException -> L2d
            goto L32
        L2d:
            java.lang.String r1 = "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."
            android.util.Log.i(r0, r1)
        L32:
            return
    }

    public F9(android.content.Context r5, android.util.AttributeSet r6, int r7) {
            r4 = this;
            r4.<init>()
            r0 = -2
            r4.d = r0
            r4.e = r0
            r0 = 1002(0x3ea, float:1.404E-42)
            r4.h = r0
            r0 = 0
            r4.l = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r4.m = r1
            a.F9$g r1 = new a.F9$g
            r1.<init>(r4)
            r4.r = r1
            a.F9$f r1 = new a.F9$f
            r1.<init>(r4)
            r4.s = r1
            a.F9$e r1 = new a.F9$e
            r1.<init>(r4)
            r4.t = r1
            a.F9$c r1 = new a.F9$c
            r1.<init>(r4)
            r4.u = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r4.w = r1
            r4.f82a = r5
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = r5.getMainLooper()
            r1.<init>(r2)
            r4.v = r1
            int[] r1 = androidx.appcompat.R.styleable.ListPopupWindow
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1, r7, r0)
            int r2 = androidx.appcompat.R.styleable.ListPopupWindow_android_dropDownHorizontalOffset
            int r2 = r1.getDimensionPixelOffset(r2, r0)
            r4.f = r2
            int r2 = androidx.appcompat.R.styleable.ListPopupWindow_android_dropDownVerticalOffset
            int r2 = r1.getDimensionPixelOffset(r2, r0)
            r4.g = r2
            r3 = 1
            if (r2 == 0) goto L5f
            r4.i = r3
        L5f:
            r1.recycle()
            a.g1 r1 = new a.g1
            r1.<init>(r5, r6, r7, r0)
            int[] r2 = androidx.appcompat.R.styleable.PopupWindow
            android.content.res.TypedArray r6 = r5.obtainStyledAttributes(r6, r2, r7, r0)
            int r7 = androidx.appcompat.R.styleable.PopupWindow_overlapAnchor
            boolean r7 = r6.hasValue(r7)
            if (r7 == 0) goto L7e
            int r7 = androidx.appcompat.R.styleable.PopupWindow_overlapAnchor
            boolean r7 = r6.getBoolean(r7, r0)
            a.Ec.c(r1, r7)
        L7e:
            int r7 = androidx.appcompat.R.styleable.PopupWindow_android_popupBackground
            boolean r2 = r6.hasValue(r7)
            if (r2 == 0) goto L91
            int r0 = r6.getResourceId(r7, r0)
            if (r0 == 0) goto L91
            android.graphics.drawable.Drawable r5 = a.C0435w1.A(r5, r0)
            goto L95
        L91:
            android.graphics.drawable.Drawable r5 = r6.getDrawable(r7)
        L95:
            r1.setBackgroundDrawable(r5)
            r6.recycle()
            r4.z = r1
            r1.setInputMethodMode(r3)
            return
    }

    @Override // a.InterfaceC0108de
    public final boolean b() {
            r1 = this;
            a.g1 r0 = r1.z
            boolean r0 = r0.isShowing()
            return r0
    }

    public final void c(int r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public final int d() {
            r1 = this;
            int r0 = r1.f
            return r0
    }

    @Override // a.InterfaceC0108de
    public final void dismiss() {
            r2 = this;
            a.g1 r0 = r2.z
            r0.dismiss()
            r1 = 0
            r0.setContentView(r1)
            r2.c = r1
            android.os.Handler r0 = r2.v
            a.F9$g r1 = r2.r
            r0.removeCallbacks(r1)
            return
    }

    @Override // a.InterfaceC0108de
    public final void f() {
            r13 = this;
            a.A5 r0 = r13.c
            a.g1 r1 = r13.z
            android.content.Context r2 = r13.f82a
            r3 = 1
            if (r0 != 0) goto L48
            boolean r0 = r13.y
            r0 = r0 ^ r3
            a.A5 r0 = r13.q(r2, r0)
            r13.c = r0
            android.widget.ListAdapter r4 = r13.b
            r0.setAdapter(r4)
            a.A5 r0 = r13.c
            android.widget.AdapterView$OnItemClickListener r4 = r13.p
            r0.setOnItemClickListener(r4)
            a.A5 r0 = r13.c
            r0.setFocusable(r3)
            a.A5 r0 = r13.c
            r0.setFocusableInTouchMode(r3)
            a.A5 r0 = r13.c
            a.E9 r4 = new a.E9
            r4.<init>(r13)
            r0.setOnItemSelectedListener(r4)
            a.A5 r0 = r13.c
            a.F9$e r4 = r13.t
            r0.setOnScrollListener(r4)
            android.widget.AdapterView$OnItemSelectedListener r0 = r13.q
            if (r0 == 0) goto L42
            a.A5 r4 = r13.c
            r4.setOnItemSelectedListener(r0)
        L42:
            a.A5 r0 = r13.c
            r1.setContentView(r0)
            goto L4e
        L48:
            android.view.View r0 = r1.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L4e:
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            r4 = 0
            android.graphics.Rect r5 = r13.w
            if (r0 == 0) goto L67
            r0.getPadding(r5)
            int r0 = r5.top
            int r6 = r5.bottom
            int r6 = r6 + r0
            boolean r7 = r13.i
            if (r7 != 0) goto L6b
            int r0 = -r0
            r13.g = r0
            goto L6b
        L67:
            r5.setEmpty()
            r6 = r4
        L6b:
            int r0 = r1.getInputMethodMode()
            r7 = 2
            if (r0 != r7) goto L74
            r0 = r3
            goto L75
        L74:
            r0 = r4
        L75:
            android.view.View r8 = r13.o
            int r9 = r13.g
            int r0 = a.F9.a.a(r1, r8, r9, r0)
            int r8 = r13.d
            r9 = -2
            r10 = -1
            if (r8 != r10) goto L85
            int r0 = r0 + r6
            goto Ld6
        L85:
            int r11 = r13.e
            if (r11 == r9) goto La7
            r12 = 1073741824(0x40000000, float:2.0)
            if (r11 == r10) goto L92
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r12)
            goto Lbd
        L92:
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            int r11 = r5.left
            int r5 = r5.right
            int r11 = r11 + r5
            int r2 = r2 - r11
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r12)
            goto Lbd
        La7:
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            int r11 = r5.left
            int r5 = r5.right
            int r11 = r11 + r5
            int r2 = r2 - r11
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
        Lbd:
            a.A5 r5 = r13.c
            int r0 = r5.a(r2, r0)
            if (r0 <= 0) goto Ld4
            a.A5 r2 = r13.c
            int r2 = r2.getPaddingTop()
            a.A5 r5 = r13.c
            int r5 = r5.getPaddingBottom()
            int r5 = r5 + r2
            int r5 = r5 + r6
            goto Ld5
        Ld4:
            r5 = r4
        Ld5:
            int r0 = r0 + r5
        Ld6:
            a.g1 r2 = r13.z
            int r2 = r2.getInputMethodMode()
            if (r2 != r7) goto Le0
            r2 = r3
            goto Le1
        Le0:
            r2 = r4
        Le1:
            int r5 = r13.h
            a.Ec.d(r1, r5)
            boolean r5 = r1.isShowing()
            if (r5 == 0) goto L13f
            android.view.View r5 = r13.o
            boolean r5 = r5.isAttachedToWindow()
            if (r5 != 0) goto Lf6
            goto L1d9
        Lf6:
            int r5 = r13.e
            if (r5 != r10) goto Lfc
            r5 = r10
            goto L104
        Lfc:
            if (r5 != r9) goto L104
            android.view.View r5 = r13.o
            int r5 = r5.getWidth()
        L104:
            if (r8 != r10) goto L127
            if (r2 == 0) goto L10a
            r8 = r0
            goto L10b
        L10a:
            r8 = r10
        L10b:
            if (r2 == 0) goto L11b
            int r0 = r13.e
            if (r0 != r10) goto L113
            r0 = r10
            goto L114
        L113:
            r0 = r4
        L114:
            r1.setWidth(r0)
            r1.setHeight(r4)
            goto L12a
        L11b:
            int r0 = r13.e
            if (r0 != r10) goto L120
            r4 = r10
        L120:
            r1.setWidth(r4)
            r1.setHeight(r10)
            goto L12a
        L127:
            if (r8 != r9) goto L12a
            r8 = r0
        L12a:
            r1.setOutsideTouchable(r3)
            android.view.View r2 = r13.o
            int r3 = r13.f
            int r4 = r13.g
            if (r5 >= 0) goto L136
            r5 = r10
        L136:
            if (r8 >= 0) goto L13a
            r6 = r10
            goto L13b
        L13a:
            r6 = r8
        L13b:
            r1.update(r2, r3, r4, r5, r6)
            return
        L13f:
            int r2 = r13.e
            if (r2 != r10) goto L145
            r2 = r10
            goto L14d
        L145:
            if (r2 != r9) goto L14d
            android.view.View r2 = r13.o
            int r2 = r2.getWidth()
        L14d:
            if (r8 != r10) goto L151
            r8 = r10
            goto L154
        L151:
            if (r8 != r9) goto L154
            r8 = r0
        L154:
            r1.setWidth(r2)
            r1.setHeight(r8)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "ListPopupWindow"
            r4 = 28
            if (r0 > r4) goto L176
            java.lang.reflect.Method r0 = a.F9.A
            if (r0 == 0) goto L179
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L170
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Exception -> L170
            r0.invoke(r1, r5)     // Catch: java.lang.Exception -> L170
            goto L179
        L170:
            java.lang.String r0 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r2, r0)
            goto L179
        L176:
            a.F9.b.b(r1, r3)
        L179:
            r1.setOutsideTouchable(r3)
            a.F9$f r0 = r13.s
            r1.setTouchInterceptor(r0)
            boolean r0 = r13.k
            if (r0 == 0) goto L18a
            boolean r0 = r13.j
            a.Ec.c(r1, r0)
        L18a:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 > r4) goto L1a3
            java.lang.reflect.Method r0 = a.F9.B
            if (r0 == 0) goto L1a8
            android.graphics.Rect r4 = r13.x     // Catch: java.lang.Exception -> L19c
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L19c
            r0.invoke(r1, r4)     // Catch: java.lang.Exception -> L19c
            goto L1a8
        L19c:
            r0 = move-exception
            java.lang.String r4 = "Could not invoke setEpicenterBounds on PopupWindow"
            android.util.Log.e(r2, r4, r0)
            goto L1a8
        L1a3:
            android.graphics.Rect r0 = r13.x
            a.F9.b.a(r1, r0)
        L1a8:
            android.view.View r0 = r13.o
            int r2 = r13.f
            int r4 = r13.g
            int r5 = r13.l
            r1.showAsDropDown(r0, r2, r4, r5)
            a.A5 r0 = r13.c
            r0.setSelection(r10)
            boolean r0 = r13.y
            if (r0 == 0) goto L1c4
            a.A5 r0 = r13.c
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L1ce
        L1c4:
            a.A5 r0 = r13.c
            if (r0 == 0) goto L1ce
            r0.setListSelectionHidden(r3)
            r0.requestLayout()
        L1ce:
            boolean r0 = r13.y
            if (r0 != 0) goto L1d9
            android.os.Handler r0 = r13.v
            a.F9$c r1 = r13.u
            r0.post(r1)
        L1d9:
            return
    }

    public final int g() {
            r1 = this;
            boolean r0 = r1.i
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r1.g
            return r0
    }

    public final android.graphics.drawable.Drawable i() {
            r1 = this;
            a.g1 r0 = r1.z
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
    }

    @Override // a.InterfaceC0108de
    public final a.A5 k() {
            r1 = this;
            a.A5 r0 = r1.c
            return r0
    }

    public final void m(android.graphics.drawable.Drawable r2) {
            r1 = this;
            a.g1 r0 = r1.z
            r0.setBackgroundDrawable(r2)
            return
    }

    public final void n(int r1) {
            r0 = this;
            r0.g = r1
            r1 = 1
            r0.i = r1
            return
    }

    public void o(android.widget.ListAdapter r3) {
            r2 = this;
            a.F9$d r0 = r2.n
            if (r0 != 0) goto Lc
            a.F9$d r0 = new a.F9$d
            r0.<init>(r2)
            r2.n = r0
            goto L13
        Lc:
            android.widget.ListAdapter r1 = r2.b
            if (r1 == 0) goto L13
            r1.unregisterDataSetObserver(r0)
        L13:
            r2.b = r3
            if (r3 == 0) goto L1c
            a.F9$d r0 = r2.n
            r3.registerDataSetObserver(r0)
        L1c:
            a.A5 r3 = r2.c
            if (r3 == 0) goto L25
            android.widget.ListAdapter r0 = r2.b
            r3.setAdapter(r0)
        L25:
            return
    }

    public a.A5 q(android.content.Context r2, boolean r3) {
            r1 = this;
            a.A5 r0 = new a.A5
            r0.<init>(r2, r3)
            return r0
    }

    public final void r(int r3) {
            r2 = this;
            a.g1 r0 = r2.z
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L16
            android.graphics.Rect r1 = r2.w
            r0.getPadding(r1)
            int r0 = r1.left
            int r1 = r1.right
            int r0 = r0 + r1
            int r0 = r0 + r3
            r2.e = r0
            return
        L16:
            r2.e = r3
            return
    }
}
