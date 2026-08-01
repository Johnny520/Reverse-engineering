package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class kr implements defpackage.r30 {
    public static final java.lang.reflect.Method A = null;
    public static final java.lang.reflect.Method B = null;
    public final android.content.Context a;
    public android.widget.ListAdapter b;
    public defpackage.kh c;
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
    public defpackage.ve n;
    public android.view.View o;
    public android.widget.AdapterView.OnItemClickListener p;
    public android.widget.AdapterView.OnItemSelectedListener q;
    public final defpackage.hr r;
    public final defpackage.jr s;
    public final defpackage.ir t;
    public final defpackage.hr u;
    public final android.os.Handler v;
    public final android.graphics.Rect w;
    public android.graphics.Rect x;
    public boolean y;
    public final defpackage.c4 z;

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
            defpackage.kr.A = r2     // Catch: java.lang.NoSuchMethodException -> L19
            goto L1e
        L19:
            java.lang.String r2 = "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r0, r2)
        L1e:
            java.lang.String r2 = "setEpicenterBounds"
            java.lang.Class<android.graphics.Rect> r3 = android.graphics.Rect.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.NoSuchMethodException -> L2d
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L2d
            defpackage.kr.B = r1     // Catch: java.lang.NoSuchMethodException -> L2d
            goto L32
        L2d:
            java.lang.String r1 = "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well."
            android.util.Log.i(r0, r1)
        L32:
            return
    }

    public kr(android.content.Context r4, android.util.AttributeSet r5, int r6, int r7) {
            r3 = this;
            r3.<init>()
            r7 = -2
            r3.d = r7
            r3.e = r7
            r7 = 1002(0x3ea, float:1.404E-42)
            r3.h = r7
            r7 = 0
            r3.l = r7
            r0 = 2147483647(0x7fffffff, float:NaN)
            r3.m = r0
            hr r0 = new hr
            r1 = 1
            r0.<init>(r3, r1)
            r3.r = r0
            jr r0 = new jr
            r1 = 0
            r0.<init>(r1, r3)
            r3.s = r0
            ir r0 = new ir
            r0.<init>(r3)
            r3.t = r0
            hr r0 = new hr
            r0.<init>(r3, r1)
            r3.u = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.w = r0
            r3.a = r4
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = r4.getMainLooper()
            r0.<init>(r1)
            r3.v = r0
            int[] r0 = defpackage.xy.o
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r6, r7)
            int r1 = r0.getDimensionPixelOffset(r7, r7)
            r3.f = r1
            r1 = 1
            int r2 = r0.getDimensionPixelOffset(r1, r7)
            r3.g = r2
            if (r2 == 0) goto L5d
            r3.i = r1
        L5d:
            r0.recycle()
            c4 r0 = new c4
            r0.<init>(r4, r5, r6, r7)
            int[] r2 = defpackage.xy.s
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r2, r6, r7)
            r6 = 2
            boolean r2 = r5.hasValue(r6)
            if (r2 == 0) goto L79
            boolean r6 = r5.getBoolean(r6, r7)
            defpackage.vx.c(r0, r6)
        L79:
            boolean r6 = r5.hasValue(r7)
            if (r6 == 0) goto L8a
            int r6 = r5.getResourceId(r7, r7)
            if (r6 == 0) goto L8a
            android.graphics.drawable.Drawable r4 = defpackage.ff.r(r4, r6)
            goto L8e
        L8a:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r7)
        L8e:
            r0.setBackgroundDrawable(r4)
            r5.recycle()
            r3.z = r0
            r0.setInputMethodMode(r1)
            return
    }

    public defpackage.kh a(android.content.Context r2, boolean r3) {
            r1 = this;
            kh r0 = new kh
            r0.<init>(r2, r3)
            return r0
    }

    @Override // defpackage.r30
    public final boolean b() {
            r1 = this;
            c4 r0 = r1.z
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

    @Override // defpackage.r30
    public final void dismiss() {
            r2 = this;
            c4 r0 = r2.z
            r0.dismiss()
            r1 = 0
            r0.setContentView(r1)
            r2.c = r1
            android.os.Handler r0 = r2.v
            hr r1 = r2.r
            r0.removeCallbacks(r1)
            return
    }

    @Override // defpackage.r30
    public final void f() {
            r13 = this;
            kh r0 = r13.c
            android.content.Context r1 = r13.a
            r2 = 1
            c4 r3 = r13.z
            r4 = 0
            if (r0 != 0) goto L49
            boolean r0 = r13.y
            r0 = r0 ^ r2
            kh r0 = r13.a(r1, r0)
            r13.c = r0
            android.widget.ListAdapter r5 = r13.b
            r0.setAdapter(r5)
            kh r0 = r13.c
            android.widget.AdapterView$OnItemClickListener r5 = r13.p
            r0.setOnItemClickListener(r5)
            kh r0 = r13.c
            r0.setFocusable(r2)
            kh r0 = r13.c
            r0.setFocusableInTouchMode(r2)
            kh r0 = r13.c
            er r5 = new er
            r5.<init>(r4, r13)
            r0.setOnItemSelectedListener(r5)
            kh r0 = r13.c
            ir r5 = r13.t
            r0.setOnScrollListener(r5)
            android.widget.AdapterView$OnItemSelectedListener r0 = r13.q
            if (r0 == 0) goto L43
            kh r5 = r13.c
            r5.setOnItemSelectedListener(r0)
        L43:
            kh r0 = r13.c
            r3.setContentView(r0)
            goto L4f
        L49:
            android.view.View r0 = r3.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L4f:
            android.graphics.drawable.Drawable r0 = r3.getBackground()
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
            int r0 = r3.getInputMethodMode()
            r7 = 2
            if (r0 != r7) goto L74
            r0 = r2
            goto L75
        L74:
            r0 = r4
        L75:
            android.view.View r8 = r13.o
            int r9 = r13.g
            int r0 = defpackage.fr.a(r3, r8, r9, r0)
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
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r12)
            goto Lbd
        L92:
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            int r11 = r5.left
            int r5 = r5.right
            int r11 = r11 + r5
            int r1 = r1 - r11
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r12)
            goto Lbd
        La7:
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = r1.widthPixels
            int r11 = r5.left
            int r5 = r5.right
            int r11 = r11 + r5
            int r1 = r1 - r11
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
        Lbd:
            kh r5 = r13.c
            int r0 = r5.a(r1, r0)
            if (r0 <= 0) goto Ld4
            kh r1 = r13.c
            int r1 = r1.getPaddingTop()
            kh r5 = r13.c
            int r5 = r5.getPaddingBottom()
            int r5 = r5 + r1
            int r5 = r5 + r6
            goto Ld5
        Ld4:
            r5 = r4
        Ld5:
            int r0 = r0 + r5
        Ld6:
            int r1 = r3.getInputMethodMode()
            if (r1 != r7) goto Lde
            r1 = r2
            goto Ldf
        Lde:
            r1 = r4
        Ldf:
            int r5 = r13.h
            defpackage.vx.d(r3, r5)
            boolean r5 = r3.isShowing()
            if (r5 == 0) goto L140
            android.view.View r5 = r13.o
            java.util.WeakHashMap r6 = defpackage.ja0.a
            boolean r5 = defpackage.v90.b(r5)
            if (r5 != 0) goto Lf6
            goto L1da
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
            if (r1 == 0) goto L10a
            r8 = r0
            goto L10b
        L10a:
            r8 = r10
        L10b:
            if (r1 == 0) goto L11b
            int r0 = r13.e
            if (r0 != r10) goto L113
            r0 = r10
            goto L114
        L113:
            r0 = r4
        L114:
            r3.setWidth(r0)
            r3.setHeight(r4)
            goto L12a
        L11b:
            int r0 = r13.e
            if (r0 != r10) goto L120
            r4 = r10
        L120:
            r3.setWidth(r4)
            r3.setHeight(r10)
            goto L12a
        L127:
            if (r8 != r9) goto L12a
            r8 = r0
        L12a:
            r3.setOutsideTouchable(r2)
            android.view.View r4 = r13.o
            r0 = r5
            int r5 = r13.f
            int r6 = r13.g
            if (r0 >= 0) goto L138
            r7 = r10
            goto L139
        L138:
            r7 = r0
        L139:
            if (r8 >= 0) goto L13c
            r8 = r10
        L13c:
            r3.update(r4, r5, r6, r7, r8)
            return
        L140:
            int r1 = r13.e
            if (r1 != r10) goto L146
            r1 = r10
            goto L14e
        L146:
            if (r1 != r9) goto L14e
            android.view.View r1 = r13.o
            int r1 = r1.getWidth()
        L14e:
            if (r8 != r10) goto L152
            r8 = r10
            goto L155
        L152:
            if (r8 != r9) goto L155
            r8 = r0
        L155:
            r3.setWidth(r1)
            r3.setHeight(r8)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "ListPopupWindow"
            r4 = 28
            if (r0 > r4) goto L177
            java.lang.reflect.Method r0 = defpackage.kr.A
            if (r0 == 0) goto L17a
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L171
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Exception -> L171
            r0.invoke(r3, r5)     // Catch: java.lang.Exception -> L171
            goto L17a
        L171:
            java.lang.String r0 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r1, r0)
            goto L17a
        L177:
            defpackage.gr.b(r3, r2)
        L17a:
            r3.setOutsideTouchable(r2)
            jr r0 = r13.s
            r3.setTouchInterceptor(r0)
            boolean r0 = r13.k
            if (r0 == 0) goto L18b
            boolean r0 = r13.j
            defpackage.vx.c(r3, r0)
        L18b:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 > r4) goto L1a4
            java.lang.reflect.Method r0 = defpackage.kr.B
            if (r0 == 0) goto L1a9
            android.graphics.Rect r4 = r13.x     // Catch: java.lang.Exception -> L19d
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L19d
            r0.invoke(r3, r4)     // Catch: java.lang.Exception -> L19d
            goto L1a9
        L19d:
            r0 = move-exception
            java.lang.String r4 = "Could not invoke setEpicenterBounds on PopupWindow"
            android.util.Log.e(r1, r4, r0)
            goto L1a9
        L1a4:
            android.graphics.Rect r0 = r13.x
            defpackage.gr.a(r3, r0)
        L1a9:
            android.view.View r0 = r13.o
            int r1 = r13.f
            int r4 = r13.g
            int r5 = r13.l
            defpackage.ux.a(r3, r0, r1, r4, r5)
            kh r0 = r13.c
            r0.setSelection(r10)
            boolean r0 = r13.y
            if (r0 == 0) goto L1c5
            kh r0 = r13.c
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L1cf
        L1c5:
            kh r0 = r13.c
            if (r0 == 0) goto L1cf
            r0.setListSelectionHidden(r2)
            r0.requestLayout()
        L1cf:
            boolean r0 = r13.y
            if (r0 != 0) goto L1da
            android.os.Handler r0 = r13.v
            hr r1 = r13.u
            r0.post(r1)
        L1da:
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

    public final android.graphics.drawable.Drawable h() {
            r1 = this;
            c4 r0 = r1.z
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
    }

    @Override // defpackage.r30
    public final defpackage.kh j() {
            r1 = this;
            kh r0 = r1.c
            return r0
    }

    public final void l(android.graphics.drawable.Drawable r2) {
            r1 = this;
            c4 r0 = r1.z
            r0.setBackgroundDrawable(r2)
            return
    }

    public final void m(int r1) {
            r0 = this;
            r0.g = r1
            r1 = 1
            r0.i = r1
            return
    }

    public void n(android.widget.ListAdapter r3) {
            r2 = this;
            ve r0 = r2.n
            if (r0 != 0) goto Ld
            ve r0 = new ve
            r1 = 1
            r0.<init>(r1, r2)
            r2.n = r0
            goto L14
        Ld:
            android.widget.ListAdapter r1 = r2.b
            if (r1 == 0) goto L14
            r1.unregisterDataSetObserver(r0)
        L14:
            r2.b = r3
            if (r3 == 0) goto L1d
            ve r0 = r2.n
            r3.registerDataSetObserver(r0)
        L1d:
            kh r3 = r2.c
            if (r3 == 0) goto L26
            android.widget.ListAdapter r0 = r2.b
            r3.setAdapter(r0)
        L26:
            return
    }

    public final void q(int r3) {
            r2 = this;
            c4 r0 = r2.z
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
