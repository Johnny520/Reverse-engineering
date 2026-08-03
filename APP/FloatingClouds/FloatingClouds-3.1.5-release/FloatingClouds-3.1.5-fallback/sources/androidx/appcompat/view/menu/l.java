package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class l extends a.AbstractC0123eb implements android.widget.PopupWindow.OnDismissListener, android.view.View.OnKeyListener {
    public static final int u = 0;
    public final android.content.Context b;
    public final androidx.appcompat.view.menu.f c;
    public final androidx.appcompat.view.menu.e d;
    public final boolean e;
    public final int f;
    public final int g;
    public final a.C0141fb h;
    public final androidx.appcompat.view.menu.l.a i;
    public final androidx.appcompat.view.menu.l.b j;
    public androidx.appcompat.view.menu.i.a k;
    public android.view.View l;
    public android.view.View m;
    public androidx.appcompat.view.menu.j.a n;
    public android.view.ViewTreeObserver o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public boolean t;

    public class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.view.menu.l f828a;

        public a(androidx.appcompat.view.menu.l r1) {
                r0 = this;
                r0.<init>()
                r0.f828a = r1
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
                r3 = this;
                androidx.appcompat.view.menu.l r0 = r3.f828a
                boolean r1 = r0.b()
                if (r1 == 0) goto L20
                a.fb r1 = r0.h
                boolean r2 = r1.y
                if (r2 != 0) goto L20
                android.view.View r2 = r0.m
                if (r2 == 0) goto L1d
                boolean r2 = r2.isShown()
                if (r2 != 0) goto L19
                goto L1d
            L19:
                r1.f()
                return
            L1d:
                r0.dismiss()
            L20:
                return
        }
    }

    public class b implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.view.menu.l f829a;

        public b(androidx.appcompat.view.menu.l r1) {
                r0 = this;
                r0.<init>()
                r0.f829a = r1
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(android.view.View r3) {
                r2 = this;
                androidx.appcompat.view.menu.l r0 = r2.f829a
                android.view.ViewTreeObserver r1 = r0.o
                if (r1 == 0) goto L19
                boolean r1 = r1.isAlive()
                if (r1 != 0) goto L12
                android.view.ViewTreeObserver r1 = r3.getViewTreeObserver()
                r0.o = r1
            L12:
                android.view.ViewTreeObserver r1 = r0.o
                androidx.appcompat.view.menu.l$a r0 = r0.i
                r1.removeGlobalOnLayoutListener(r0)
            L19:
                r3.removeOnAttachStateChangeListener(r2)
                return
        }
    }

    static {
            int r0 = androidx.appcompat.R.layout.abc_popup_menu_item_layout
            androidx.appcompat.view.menu.l.u = r0
            return
    }

    public l(int r4, android.content.Context r5, android.view.View r6, androidx.appcompat.view.menu.f r7, boolean r8) {
            r3 = this;
            r3.<init>()
            androidx.appcompat.view.menu.l$a r0 = new androidx.appcompat.view.menu.l$a
            r0.<init>(r3)
            r3.i = r0
            androidx.appcompat.view.menu.l$b r0 = new androidx.appcompat.view.menu.l$b
            r0.<init>(r3)
            r3.j = r0
            r0 = 0
            r3.s = r0
            r3.b = r5
            r3.c = r7
            r3.e = r8
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r5)
            androidx.appcompat.view.menu.e r1 = new androidx.appcompat.view.menu.e
            int r2 = androidx.appcompat.view.menu.l.u
            r1.<init>(r7, r0, r8, r2)
            r3.d = r1
            r3.g = r4
            android.content.res.Resources r8 = r5.getResources()
            android.util.DisplayMetrics r0 = r8.getDisplayMetrics()
            int r0 = r0.widthPixels
            int r0 = r0 / 2
            int r1 = androidx.appcompat.R.dimen.abc_config_prefDialogWidth
            int r8 = r8.getDimensionPixelSize(r1)
            int r8 = java.lang.Math.max(r0, r8)
            r3.f = r8
            r3.l = r6
            a.fb r6 = new a.fb
            r8 = 0
            r6.<init>(r5, r8, r4)
            r3.h = r6
            r7.b(r3, r5)
            return
    }

    @Override // androidx.appcompat.view.menu.j
    public final void a(androidx.appcompat.view.menu.f r2, boolean r3) {
            r1 = this;
            androidx.appcompat.view.menu.f r0 = r1.c
            if (r2 == r0) goto L5
            goto Lf
        L5:
            r1.dismiss()
            androidx.appcompat.view.menu.j$a r0 = r1.n
            if (r0 == 0) goto Lf
            r0.a(r2, r3)
        Lf:
            return
    }

    @Override // a.InterfaceC0108de
    public final boolean b() {
            r1 = this;
            boolean r0 = r1.p
            if (r0 != 0) goto L10
            a.fb r0 = r1.h
            a.g1 r0 = r0.z
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean d() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // a.InterfaceC0108de
    public final void dismiss() {
            r1 = this;
            boolean r0 = r1.b()
            if (r0 == 0) goto Lb
            a.fb r0 = r1.h
            r0.dismiss()
        Lb:
            return
    }

    @Override // a.InterfaceC0108de
    public final void f() {
            r8 = this;
            boolean r0 = r8.b()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r8.p
            if (r0 != 0) goto Laa
            android.view.View r0 = r8.l
            if (r0 == 0) goto Laa
            r8.m = r0
            a.fb r0 = r8.h
            a.g1 r1 = r0.z
            r1.setOnDismissListener(r8)
            r0.p = r8
            r1 = 1
            r0.y = r1
            a.g1 r2 = r0.z
            r2.setFocusable(r1)
            android.view.View r2 = r8.m
            android.view.ViewTreeObserver r3 = r8.o
            r4 = 0
            if (r3 != 0) goto L2b
            r3 = r1
            goto L2c
        L2b:
            r3 = r4
        L2c:
            android.view.ViewTreeObserver r5 = r2.getViewTreeObserver()
            r8.o = r5
            if (r3 == 0) goto L39
            androidx.appcompat.view.menu.l$a r3 = r8.i
            r5.addOnGlobalLayoutListener(r3)
        L39:
            androidx.appcompat.view.menu.l$b r3 = r8.j
            r2.addOnAttachStateChangeListener(r3)
            r0.o = r2
            int r2 = r8.s
            r0.l = r2
            boolean r2 = r8.q
            android.content.Context r3 = r8.b
            androidx.appcompat.view.menu.e r5 = r8.d
            if (r2 != 0) goto L56
            int r2 = r8.f
            int r2 = a.AbstractC0123eb.m(r5, r3, r2)
            r8.r = r2
            r8.q = r1
        L56:
            int r1 = r8.r
            r0.r(r1)
            r1 = 2
            a.g1 r2 = r0.z
            r2.setInputMethodMode(r1)
            android.graphics.Rect r1 = r8.f460a
            r2 = 0
            if (r1 == 0) goto L6c
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r1)
            goto L6d
        L6c:
            r6 = r2
        L6d:
            r0.x = r6
            r0.f()
            a.A5 r1 = r0.c
            r1.setOnKeyListener(r8)
            boolean r6 = r8.t
            if (r6 == 0) goto La3
            androidx.appcompat.view.menu.f r6 = r8.c
            java.lang.CharSequence r7 = r6.m
            if (r7 == 0) goto La3
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            int r7 = androidx.appcompat.R.layout.abc_popup_menu_header_item_layout
            android.view.View r3 = r3.inflate(r7, r1, r4)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r7 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r7 = r3.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L9d
            java.lang.CharSequence r6 = r6.m
            r7.setText(r6)
        L9d:
            r3.setEnabled(r4)
            r1.addHeaderView(r3, r2, r4)
        La3:
            r0.o(r5)
            r0.f()
            return
        Laa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.appcompat.view.menu.j
    public final void g() {
            r1 = this;
            r0 = 0
            r1.q = r0
            androidx.appcompat.view.menu.e r0 = r1.d
            if (r0 == 0) goto La
            r0.notifyDataSetChanged()
        La:
            return
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(androidx.appcompat.view.menu.j.a r1) {
            r0 = this;
            r0.n = r1
            return
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean j(androidx.appcompat.view.menu.m r9) {
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L71
            androidx.appcompat.view.menu.i r2 = new androidx.appcompat.view.menu.i
            android.view.View r5 = r8.m
            android.content.Context r4 = r8.b
            boolean r7 = r8.e
            int r3 = r8.g
            r6 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            androidx.appcompat.view.menu.j$a r9 = r8.n
            r2.h = r9
            a.eb r0 = r2.i
            if (r0 == 0) goto L20
            r0.h(r9)
        L20:
            boolean r9 = a.AbstractC0123eb.u(r6)
            r2.g = r9
            a.eb r0 = r2.i
            if (r0 == 0) goto L2d
            r0.o(r9)
        L2d:
            androidx.appcompat.view.menu.i$a r9 = r8.k
            r2.j = r9
            r9 = 0
            r8.k = r9
            androidx.appcompat.view.menu.f r9 = r8.c
            r9.c(r1)
            a.fb r9 = r8.h
            int r0 = r9.f
            int r9 = r9.g()
            int r3 = r8.s
            android.view.View r4 = r8.l
            int r4 = r4.getLayoutDirection()
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r4)
            r3 = r3 & 7
            r4 = 5
            if (r3 != r4) goto L59
            android.view.View r3 = r8.l
            int r3 = r3.getWidth()
            int r0 = r0 + r3
        L59:
            boolean r3 = r2.b()
            r4 = 1
            if (r3 == 0) goto L61
            goto L69
        L61:
            android.view.View r3 = r2.e
            if (r3 != 0) goto L66
            goto L71
        L66:
            r2.d(r0, r9, r4, r4)
        L69:
            androidx.appcompat.view.menu.j$a r9 = r8.n
            if (r9 == 0) goto L70
            r9.b(r6)
        L70:
            return r4
        L71:
            return r1
    }

    @Override // a.InterfaceC0108de
    public final a.A5 k() {
            r1 = this;
            a.fb r0 = r1.h
            a.A5 r0 = r0.c
            return r0
    }

    @Override // a.AbstractC0123eb
    public final void l(androidx.appcompat.view.menu.f r1) {
            r0 = this;
            return
    }

    @Override // a.AbstractC0123eb
    public final void n(android.view.View r1) {
            r0 = this;
            r0.l = r1
            return
    }

    @Override // a.AbstractC0123eb
    public final void o(boolean r2) {
            r1 = this;
            androidx.appcompat.view.menu.e r0 = r1.d
            r0.c = r2
            return
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
            r2 = this;
            r0 = 1
            r2.p = r0
            androidx.appcompat.view.menu.f r1 = r2.c
            r1.c(r0)
            android.view.ViewTreeObserver r0 = r2.o
            if (r0 == 0) goto L24
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L1a
            android.view.View r0 = r2.m
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            r2.o = r0
        L1a:
            android.view.ViewTreeObserver r0 = r2.o
            androidx.appcompat.view.menu.l$a r1 = r2.i
            r0.removeGlobalOnLayoutListener(r1)
            r0 = 0
            r2.o = r0
        L24:
            android.view.View r0 = r2.m
            androidx.appcompat.view.menu.l$b r1 = r2.j
            r0.removeOnAttachStateChangeListener(r1)
            androidx.appcompat.view.menu.i$a r0 = r2.k
            if (r0 == 0) goto L32
            r0.onDismiss()
        L32:
            return
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(android.view.View r1, int r2, android.view.KeyEvent r3) {
            r0 = this;
            int r1 = r3.getAction()
            r3 = 1
            if (r1 != r3) goto Lf
            r1 = 82
            if (r2 != r1) goto Lf
            r0.dismiss()
            return r3
        Lf:
            r1 = 0
            return r1
    }

    @Override // a.AbstractC0123eb
    public final void p(int r1) {
            r0 = this;
            r0.s = r1
            return
    }

    @Override // a.AbstractC0123eb
    public final void q(int r2) {
            r1 = this;
            a.fb r0 = r1.h
            r0.f = r2
            return
    }

    @Override // a.AbstractC0123eb
    public final void r(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            androidx.appcompat.view.menu.i$a r1 = (androidx.appcompat.view.menu.i.a) r1
            r0.k = r1
            return
    }

    @Override // a.AbstractC0123eb
    public final void s(boolean r1) {
            r0 = this;
            r0.t = r1
            return
    }

    @Override // a.AbstractC0123eb
    public final void t(int r2) {
            r1 = this;
            a.fb r0 = r1.h
            r0.n(r2)
            return
    }
}
