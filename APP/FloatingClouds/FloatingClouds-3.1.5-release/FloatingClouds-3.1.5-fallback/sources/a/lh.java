package a;

/* JADX INFO: loaded from: classes.dex */
public final class lh extends a.L implements androidx.appcompat.widget.ActionBarOverlayLayout.d {
    public static final android.view.animation.AccelerateInterpolator y = null;
    public static final android.view.animation.DecelerateInterpolator z = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.content.Context f567a;
    public android.content.Context b;
    public androidx.appcompat.widget.ActionBarOverlayLayout c;
    public androidx.appcompat.widget.ActionBarContainer d;
    public a.N4 e;
    public androidx.appcompat.widget.ActionBarContextView f;
    public final android.view.View g;
    public boolean h;
    public a.lh.d i;
    public a.lh.d j;
    public a.Q0.d k;
    public boolean l;
    public final java.util.ArrayList<a.L.b> m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public a.Kg s;
    public boolean t;
    public boolean u;
    public final a.lh.a v;
    public final a.lh.b w;
    public final a.lh.c x;

    public class a extends a.C0282n9 {
        public final /* synthetic */ a.lh b;

        public a(a.lh r1) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                return
        }

        @Override // a.Lg
        public final void a() {
                r4 = this;
                a.lh r0 = r4.b
                boolean r1 = r0.o
                if (r1 == 0) goto L13
                android.view.View r1 = r0.g
                if (r1 == 0) goto L13
                r2 = 0
                r1.setTranslationY(r2)
                androidx.appcompat.widget.ActionBarContainer r1 = r0.d
                r1.setTranslationY(r2)
            L13:
                androidx.appcompat.widget.ActionBarContainer r1 = r0.d
                r2 = 8
                r1.setVisibility(r2)
                androidx.appcompat.widget.ActionBarContainer r1 = r0.d
                r2 = 0
                r1.setTransitioning(r2)
                r1 = 0
                r0.s = r1
                a.Q0$d r2 = r0.k
                if (r2 == 0) goto L30
                a.lh$d r3 = r0.j
                r2.b(r3)
                r0.j = r1
                r0.k = r1
            L30:
                androidx.appcompat.widget.ActionBarOverlayLayout r0 = r0.c
                if (r0 == 0) goto L39
                java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
                a.C0414ug.c.c(r0)
            L39:
                return
        }
    }

    public class b extends a.C0282n9 {
        public final /* synthetic */ a.lh b;

        public b(a.lh r1) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                return
        }

        @Override // a.Lg
        public final void a() {
                r2 = this;
                a.lh r0 = r2.b
                r1 = 0
                r0.s = r1
                androidx.appcompat.widget.ActionBarContainer r0 = r0.d
                r0.requestLayout()
                return
        }
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.lh f568a;

        public c(a.lh r1) {
                r0 = this;
                r0.<init>()
                r0.f568a = r1
                return
        }
    }

    public class d extends a.P implements androidx.appcompat.view.menu.f.a {
        public final android.content.Context c;
        public final androidx.appcompat.view.menu.f d;
        public a.Q0.d e;
        public java.lang.ref.WeakReference<android.view.View> f;
        public final /* synthetic */ a.lh g;

        public d(a.lh r1, android.content.Context r2, a.Q0.d r3) {
                r0 = this;
                r0.<init>()
                r0.g = r1
                r0.c = r2
                r0.e = r3
                androidx.appcompat.view.menu.f r1 = new androidx.appcompat.view.menu.f
                r1.<init>(r2)
                r2 = 1
                r1.l = r2
                r0.d = r1
                r1.e = r0
                return
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f r1, android.view.MenuItem r2) {
                r0 = this;
                a.Q0$d r1 = r0.e
                if (r1 == 0) goto Lb
                a.P$a r1 = r1.f217a
                boolean r1 = r1.d(r0, r2)
                return r1
            Lb:
                r1 = 0
                return r1
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f r1) {
                r0 = this;
                a.Q0$d r1 = r0.e
                if (r1 != 0) goto L5
                goto L13
            L5:
                r0.i()
                a.lh r1 = r0.g
                androidx.appcompat.widget.ActionBarContextView r1 = r1.f
                androidx.appcompat.widget.a r1 = r1.d
                if (r1 == 0) goto L13
                r1.l()
            L13:
                return
        }

        @Override // a.P
        public final void c() {
                r4 = this;
                a.lh r0 = r4.g
                a.lh$d r1 = r0.i
                if (r1 == r4) goto L7
                return
            L7:
                boolean r1 = r0.p
                if (r1 == 0) goto L12
                r0.j = r4
                a.Q0$d r1 = r4.e
                r0.k = r1
                goto L17
            L12:
                a.Q0$d r1 = r4.e
                r1.b(r4)
            L17:
                r1 = 0
                r4.e = r1
                r2 = 0
                r0.p(r2)
                androidx.appcompat.widget.ActionBarContextView r2 = r0.f
                android.view.View r3 = r2.k
                if (r3 != 0) goto L27
                r2.h()
            L27:
                androidx.appcompat.widget.ActionBarOverlayLayout r2 = r0.c
                boolean r3 = r0.u
                r2.setHideOnContentScrollEnabled(r3)
                r0.i = r1
                return
        }

        @Override // a.P
        public final android.view.View d() {
                r1 = this;
                java.lang.ref.WeakReference<android.view.View> r0 = r1.f
                if (r0 == 0) goto Lb
                java.lang.Object r0 = r0.get()
                android.view.View r0 = (android.view.View) r0
                return r0
            Lb:
                r0 = 0
                return r0
        }

        @Override // a.P
        public final androidx.appcompat.view.menu.f e() {
                r1 = this;
                androidx.appcompat.view.menu.f r0 = r1.d
                return r0
        }

        @Override // a.P
        public final android.view.MenuInflater f() {
                r2 = this;
                a.Ie r0 = new a.Ie
                android.content.Context r1 = r2.c
                r0.<init>(r1)
                return r0
        }

        @Override // a.P
        public final java.lang.CharSequence g() {
                r1 = this;
                a.lh r0 = r1.g
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f
                java.lang.CharSequence r0 = r0.getSubtitle()
                return r0
        }

        @Override // a.P
        public final java.lang.CharSequence h() {
                r1 = this;
                a.lh r0 = r1.g
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f
                java.lang.CharSequence r0 = r0.getTitle()
                return r0
        }

        @Override // a.P
        public final void i() {
                r2 = this;
                a.lh r0 = r2.g
                a.lh$d r0 = r0.i
                if (r0 == r2) goto L7
                return
            L7:
                androidx.appcompat.view.menu.f r0 = r2.d
                r0.w()
                a.Q0$d r1 = r2.e     // Catch: java.lang.Throwable -> L15
                r1.c(r2, r0)     // Catch: java.lang.Throwable -> L15
                r0.v()
                return
            L15:
                r1 = move-exception
                r0.v()
                throw r1
        }

        @Override // a.P
        public final boolean j() {
                r1 = this;
                a.lh r0 = r1.g
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f
                boolean r0 = r0.s
                return r0
        }

        @Override // a.P
        public final void k(android.view.View r2) {
                r1 = this;
                a.lh r0 = r1.g
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f
                r0.setCustomView(r2)
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.f = r0
                return
        }

        @Override // a.P
        public final void l(int r2) {
                r1 = this;
                a.lh r0 = r1.g
                android.content.Context r0 = r0.f567a
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r2 = r0.getString(r2)
                r1.m(r2)
                return
        }

        @Override // a.P
        public final void m(java.lang.CharSequence r2) {
                r1 = this;
                a.lh r0 = r1.g
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f
                r0.setSubtitle(r2)
                return
        }

        @Override // a.P
        public final void n(int r2) {
                r1 = this;
                a.lh r0 = r1.g
                android.content.Context r0 = r0.f567a
                android.content.res.Resources r0 = r0.getResources()
                java.lang.String r2 = r0.getString(r2)
                r1.o(r2)
                return
        }

        @Override // a.P
        public final void o(java.lang.CharSequence r2) {
                r1 = this;
                a.lh r0 = r1.g
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f
                r0.setTitle(r2)
                return
        }

        @Override // a.P
        public final void p(boolean r2) {
                r1 = this;
                r1.b = r2
                a.lh r0 = r1.g
                androidx.appcompat.widget.ActionBarContextView r0 = r0.f
                r0.setTitleOptional(r2)
                return
        }
    }

    static {
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>()
            a.lh.y = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            a.lh.z = r0
            return
    }

    public lh(android.app.Activity r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.m = r0
            r0 = 0
            r1.n = r0
            r0 = 1
            r1.o = r0
            r1.r = r0
            a.lh$a r0 = new a.lh$a
            r0.<init>(r1)
            r1.v = r0
            a.lh$b r0 = new a.lh$b
            r0.<init>(r1)
            r1.w = r0
            a.lh$c r0 = new a.lh$c
            r0.<init>(r1)
            r1.x = r0
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r1.q(r2)
            if (r3 != 0) goto L42
            r3 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = r2.findViewById(r3)
            r1.g = r2
        L42:
            return
    }

    public lh(android.app.Dialog r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.m = r0
            r0 = 0
            r1.n = r0
            r0 = 1
            r1.o = r0
            r1.r = r0
            a.lh$a r0 = new a.lh$a
            r0.<init>(r1)
            r1.v = r0
            a.lh$b r0 = new a.lh$b
            r0.<init>(r1)
            r1.w = r0
            a.lh$c r0 = new a.lh$c
            r0.<init>(r1)
            r1.x = r0
            android.view.Window r2 = r2.getWindow()
            android.view.View r2 = r2.getDecorView()
            r1.q(r2)
            return
    }

    @Override // a.L
    public final boolean b() {
            r1 = this;
            a.N4 r0 = r1.e
            if (r0 == 0) goto L11
            boolean r0 = r0.p()
            if (r0 == 0) goto L11
            a.N4 r0 = r1.e
            r0.collapseActionView()
            r0 = 1
            return r0
        L11:
            r0 = 0
            return r0
    }

    @Override // a.L
    public final void c(boolean r4) {
            r3 = this;
            boolean r0 = r3.l
            if (r4 != r0) goto L5
            goto L1c
        L5:
            r3.l = r4
            java.util.ArrayList<a.L$b> r4 = r3.m
            int r0 = r4.size()
            r1 = 0
        Le:
            if (r1 >= r0) goto L1c
            java.lang.Object r2 = r4.get(r1)
            a.L$b r2 = (a.L.b) r2
            r2.a()
            int r1 = r1 + 1
            goto Le
        L1c:
            return
    }

    @Override // a.L
    public final int d() {
            r1 = this;
            a.N4 r0 = r1.e
            int r0 = r0.l()
            return r0
    }

    @Override // a.L
    public final android.content.Context e() {
            r4 = this;
            android.content.Context r0 = r4.b
            if (r0 != 0) goto L27
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r4.f567a
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r2 = androidx.appcompat.R.attr.actionBarWidgetTheme
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            int r0 = r0.resourceId
            if (r0 == 0) goto L23
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            android.content.Context r2 = r4.f567a
            r1.<init>(r2, r0)
            r4.b = r1
            goto L27
        L23:
            android.content.Context r0 = r4.f567a
            r4.b = r0
        L27:
            android.content.Context r0 = r4.b
            return r0
    }

    @Override // a.L
    public final void g() {
            r2 = this;
            android.content.Context r0 = r2.f567a
            android.content.res.Resources r0 = r0.getResources()
            int r1 = androidx.appcompat.R.bool.abc_action_bar_embed_tabs
            boolean r0 = r0.getBoolean(r1)
            r2.r(r0)
            return
    }

    @Override // a.L
    public final boolean i(int r5, android.view.KeyEvent r6) {
            r4 = this;
            a.lh$d r0 = r4.i
            r1 = 0
            if (r0 != 0) goto L6
            goto L23
        L6:
            androidx.appcompat.view.menu.f r0 = r0.d
            if (r0 == 0) goto L23
            int r2 = r6.getDeviceId()
            android.view.KeyCharacterMap r2 = android.view.KeyCharacterMap.load(r2)
            int r2 = r2.getKeyboardType()
            r3 = 1
            if (r2 == r3) goto L1a
            goto L1b
        L1a:
            r3 = r1
        L1b:
            r0.setQwertyMode(r3)
            boolean r5 = r0.performShortcut(r5, r6, r1)
            return r5
        L23:
            return r1
    }

    @Override // a.L
    public final void l(boolean r4) {
            r3 = this;
            boolean r0 = r3.h
            if (r0 != 0) goto L1c
            r0 = 4
            if (r4 == 0) goto L9
            r4 = r0
            goto La
        L9:
            r4 = 0
        La:
            a.N4 r1 = r3.e
            int r1 = r1.l()
            r2 = 1
            r3.h = r2
            a.N4 r2 = r3.e
            r4 = r4 & r0
            r0 = r1 & (-5)
            r4 = r4 | r0
            r2.s(r4)
        L1c:
            return
    }

    @Override // a.L
    public final void m(boolean r1) {
            r0 = this;
            r0.t = r1
            if (r1 != 0) goto Lb
            a.Kg r1 = r0.s
            if (r1 == 0) goto Lb
            r1.a()
        Lb:
            return
    }

    @Override // a.L
    public final void n(java.lang.CharSequence r2) {
            r1 = this;
            a.N4 r0 = r1.e
            r0.setWindowTitle(r2)
            return
    }

    @Override // a.L
    public final a.P o(a.Q0.d r3) {
            r2 = this;
            a.lh$d r0 = r2.i
            if (r0 == 0) goto L7
            r0.c()
        L7:
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r2.c
            r1 = 0
            r0.setHideOnContentScrollEnabled(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r2.f
            r0.h()
            a.lh$d r0 = new a.lh$d
            androidx.appcompat.widget.ActionBarContextView r1 = r2.f
            android.content.Context r1 = r1.getContext()
            r0.<init>(r2, r1, r3)
            androidx.appcompat.view.menu.f r3 = r0.d
            r3.w()
            a.Q0$d r1 = r0.e     // Catch: java.lang.Throwable -> L40
            a.P$a r1 = r1.f217a     // Catch: java.lang.Throwable -> L40
            boolean r1 = r1.a(r0, r3)     // Catch: java.lang.Throwable -> L40
            r3.v()
            if (r1 == 0) goto L3e
            r2.i = r0
            r0.i()
            androidx.appcompat.widget.ActionBarContextView r3 = r2.f
            r3.f(r0)
            r3 = 1
            r2.p(r3)
            return r0
        L3e:
            r3 = 0
            return r3
        L40:
            r0 = move-exception
            r3.v()
            throw r0
    }

    public final void p(boolean r9) {
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L15
            boolean r1 = r8.q
            if (r1 != 0) goto L25
            r1 = 1
            r8.q = r1
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r8.c
            if (r2 == 0) goto L11
            r2.setShowingForActionMode(r1)
        L11:
            r8.s(r0)
            goto L25
        L15:
            boolean r1 = r8.q
            if (r1 == 0) goto L25
            r8.q = r0
            androidx.appcompat.widget.ActionBarOverlayLayout r1 = r8.c
            if (r1 == 0) goto L22
            r1.setShowingForActionMode(r0)
        L22:
            r8.s(r0)
        L25:
            androidx.appcompat.widget.ActionBarContainer r1 = r8.d
            boolean r1 = r1.isLaidOut()
            r2 = 8
            r3 = 4
            if (r1 == 0) goto L86
            r4 = 200(0xc8, double:9.9E-322)
            r6 = 100
            if (r9 == 0) goto L43
            a.N4 r9 = r8.e
            a.Jg r9 = r9.k(r6, r3)
            androidx.appcompat.widget.ActionBarContextView r1 = r8.f
            a.Jg r0 = r1.e(r4, r0)
            goto L4f
        L43:
            a.N4 r9 = r8.e
            a.Jg r0 = r9.k(r4, r0)
            androidx.appcompat.widget.ActionBarContextView r9 = r8.f
            a.Jg r9 = r9.e(r6, r2)
        L4f:
            a.Kg r1 = new a.Kg
            r1.<init>()
            java.util.ArrayList<a.Jg> r2 = r1.f155a
            r2.add(r9)
            java.lang.ref.WeakReference<android.view.View> r9 = r9.f145a
            java.lang.Object r9 = r9.get()
            android.view.View r9 = (android.view.View) r9
            if (r9 == 0) goto L6c
            android.view.ViewPropertyAnimator r9 = r9.animate()
            long r3 = r9.getDuration()
            goto L6e
        L6c:
            r3 = 0
        L6e:
            java.lang.ref.WeakReference<android.view.View> r9 = r0.f145a
            java.lang.Object r9 = r9.get()
            android.view.View r9 = (android.view.View) r9
            if (r9 == 0) goto L7f
            android.view.ViewPropertyAnimator r9 = r9.animate()
            r9.setStartDelay(r3)
        L7f:
            r2.add(r0)
            r1.b()
            return
        L86:
            if (r9 == 0) goto L93
            a.N4 r9 = r8.e
            r9.m(r3)
            androidx.appcompat.widget.ActionBarContextView r9 = r8.f
            r9.setVisibility(r0)
            return
        L93:
            a.N4 r9 = r8.e
            r9.m(r0)
            androidx.appcompat.widget.ActionBarContextView r9 = r8.f
            r9.setVisibility(r2)
            return
    }

    public final void q(android.view.View r6) {
            r5 = this;
            int r0 = androidx.appcompat.R.id.decor_content_parent
            android.view.View r0 = r6.findViewById(r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r5.c = r0
            if (r0 == 0) goto Lf
            r0.setActionBarVisibilityCallback(r5)
        Lf:
            int r0 = androidx.appcompat.R.id.action_bar
            android.view.View r0 = r6.findViewById(r0)
            boolean r1 = r0 instanceof a.N4
            if (r1 == 0) goto L1c
            a.N4 r0 = (a.N4) r0
            goto L26
        L1c:
            boolean r1 = r0 instanceof androidx.appcompat.widget.Toolbar
            if (r1 == 0) goto Lc8
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            a.N4 r0 = r0.getWrapper()
        L26:
            r5.e = r0
            int r0 = androidx.appcompat.R.id.action_context_bar
            android.view.View r0 = r6.findViewById(r0)
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r5.f = r0
            int r0 = androidx.appcompat.R.id.action_bar_container
            android.view.View r6 = r6.findViewById(r0)
            androidx.appcompat.widget.ActionBarContainer r6 = (androidx.appcompat.widget.ActionBarContainer) r6
            r5.d = r6
            a.N4 r0 = r5.e
            if (r0 == 0) goto Lb6
            androidx.appcompat.widget.ActionBarContextView r1 = r5.f
            if (r1 == 0) goto Lb6
            if (r6 == 0) goto Lb6
            android.content.Context r6 = r0.c()
            r5.f567a = r6
            a.N4 r6 = r5.e
            int r6 = r6.l()
            r6 = r6 & 4
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L5a
            r6 = r0
            goto L5b
        L5a:
            r6 = r1
        L5b:
            if (r6 == 0) goto L5f
            r5.h = r0
        L5f:
            android.content.Context r2 = r5.f567a
            android.content.pm.ApplicationInfo r3 = r2.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            r4 = 14
            a.N4 r6 = r5.e
            r6.getClass()
            android.content.res.Resources r6 = r2.getResources()
            int r2 = androidx.appcompat.R.bool.abc_action_bar_embed_tabs
            boolean r6 = r6.getBoolean(r2)
            r5.r(r6)
            android.content.Context r6 = r5.f567a
            int[] r2 = androidx.appcompat.R.styleable.ActionBar
            int r3 = androidx.appcompat.R.attr.actionBarStyle
            r4 = 0
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r4, r2, r3, r1)
            int r2 = androidx.appcompat.R.styleable.ActionBar_hideOnContentScroll
            boolean r2 = r6.getBoolean(r2, r1)
            if (r2 == 0) goto La2
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r5.c
            boolean r3 = r2.g
            if (r3 == 0) goto L9a
            r5.u = r0
            r2.setHideOnContentScrollEnabled(r0)
            goto La2
        L9a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"
            r6.<init>(r0)
            throw r6
        La2:
            int r0 = androidx.appcompat.R.styleable.ActionBar_elevation
            int r0 = r6.getDimensionPixelSize(r0, r1)
            if (r0 == 0) goto Lb2
            float r0 = (float) r0
            androidx.appcompat.widget.ActionBarContainer r1 = r5.d
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            a.C0414ug.d.s(r1, r0)
        Lb2:
            r6.recycle()
            return
        Lb6:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.Class<a.lh> r0 = a.lh.class
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = " can only be used with a compatible window decor layout"
            java.lang.String r0 = r0.concat(r1)
            r6.<init>(r0)
            throw r6
        Lc8:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            if (r0 == 0) goto Ld5
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            goto Ld7
        Ld5:
            java.lang.String r0 = "null"
        Ld7:
            java.lang.String r1 = "Can't make a decor toolbar out of "
            java.lang.String r0 = r1.concat(r0)
            r6.<init>(r0)
            throw r6
    }

    public final void r(boolean r2) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto Le
            a.N4 r2 = r1.e
            r2.j()
            androidx.appcompat.widget.ActionBarContainer r2 = r1.d
            r2.setTabContainer(r0)
            goto L18
        Le:
            androidx.appcompat.widget.ActionBarContainer r2 = r1.d
            r2.setTabContainer(r0)
            a.N4 r2 = r1.e
            r2.j()
        L18:
            a.N4 r2 = r1.e
            r2.getClass()
            a.N4 r2 = r1.e
            r0 = 0
            r2.r(r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r1.c
            r2.setHasNonEmbeddedTabs(r0)
            return
    }

    public final void s(boolean r12) {
            r11 = this;
            boolean r0 = r11.p
            boolean r1 = r11.q
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L9
            goto Ld
        L9:
            if (r0 == 0) goto Ld
            r0 = r3
            goto Le
        Ld:
            r0 = r2
        Le:
            android.view.View r1 = r11.g
            r4 = 250(0xfa, double:1.235E-321)
            r6 = 0
            r7 = 1065353216(0x3f800000, float:1.0)
            a.lh$c r8 = r11.x
            if (r0 == 0) goto Ld5
            boolean r0 = r11.r
            if (r0 != 0) goto L16b
            r11.r = r2
            a.Kg r0 = r11.s
            if (r0 == 0) goto L26
            r0.a()
        L26:
            androidx.appcompat.widget.ActionBarContainer r0 = r11.d
            r0.setVisibility(r3)
            int r0 = r11.n
            a.lh$b r9 = r11.w
            r10 = 0
            if (r0 != 0) goto Lb5
            boolean r0 = r11.t
            if (r0 != 0) goto L38
            if (r12 == 0) goto Lb5
        L38:
            androidx.appcompat.widget.ActionBarContainer r0 = r11.d
            r0.setTranslationY(r10)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.d
            int r0 = r0.getHeight()
            int r0 = -r0
            float r0 = (float) r0
            if (r12 == 0) goto L54
            int[] r12 = new int[]{r3, r3}
            androidx.appcompat.widget.ActionBarContainer r3 = r11.d
            r3.getLocationInWindow(r12)
            r12 = r12[r2]
            float r12 = (float) r12
            float r0 = r0 - r12
        L54:
            androidx.appcompat.widget.ActionBarContainer r12 = r11.d
            r12.setTranslationY(r0)
            a.Kg r12 = new a.Kg
            r12.<init>()
            androidx.appcompat.widget.ActionBarContainer r2 = r11.d
            a.Jg r2 = a.C0414ug.a(r2)
            r2.e(r10)
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f145a
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L7f
            if (r8 == 0) goto L78
            a.B5 r6 = new a.B5
            r6.<init>(r8, r3)
        L78:
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r3.setUpdateListener(r6)
        L7f:
            boolean r3 = r12.e
            java.util.ArrayList<a.Jg> r6 = r12.f155a
            if (r3 != 0) goto L88
            r6.add(r2)
        L88:
            boolean r2 = r11.o
            if (r2 == 0) goto L9f
            if (r1 == 0) goto L9f
            r1.setTranslationY(r0)
            a.Jg r0 = a.C0414ug.a(r1)
            r0.e(r10)
            boolean r1 = r12.e
            if (r1 != 0) goto L9f
            r6.add(r0)
        L9f:
            android.view.animation.DecelerateInterpolator r0 = a.lh.z
            boolean r1 = r12.e
            if (r1 != 0) goto La7
            r12.c = r0
        La7:
            if (r1 != 0) goto Lab
            r12.b = r4
        Lab:
            if (r1 != 0) goto Laf
            r12.d = r9
        Laf:
            r11.s = r12
            r12.b()
            goto Lcb
        Lb5:
            androidx.appcompat.widget.ActionBarContainer r12 = r11.d
            r12.setAlpha(r7)
            androidx.appcompat.widget.ActionBarContainer r12 = r11.d
            r12.setTranslationY(r10)
            boolean r12 = r11.o
            if (r12 == 0) goto Lc8
            if (r1 == 0) goto Lc8
            r1.setTranslationY(r10)
        Lc8:
            r9.a()
        Lcb:
            androidx.appcompat.widget.ActionBarOverlayLayout r12 = r11.c
            if (r12 == 0) goto L16b
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            a.C0414ug.c.c(r12)
            return
        Ld5:
            boolean r0 = r11.r
            if (r0 == 0) goto L16b
            r11.r = r3
            a.Kg r0 = r11.s
            if (r0 == 0) goto Le2
            r0.a()
        Le2:
            int r0 = r11.n
            a.lh$a r9 = r11.v
            if (r0 != 0) goto L168
            boolean r0 = r11.t
            if (r0 != 0) goto Lee
            if (r12 == 0) goto L168
        Lee:
            androidx.appcompat.widget.ActionBarContainer r0 = r11.d
            r0.setAlpha(r7)
            androidx.appcompat.widget.ActionBarContainer r0 = r11.d
            r0.setTransitioning(r2)
            a.Kg r0 = new a.Kg
            r0.<init>()
            androidx.appcompat.widget.ActionBarContainer r7 = r11.d
            int r7 = r7.getHeight()
            int r7 = -r7
            float r7 = (float) r7
            if (r12 == 0) goto L114
            int[] r12 = new int[]{r3, r3}
            androidx.appcompat.widget.ActionBarContainer r3 = r11.d
            r3.getLocationInWindow(r12)
            r12 = r12[r2]
            float r12 = (float) r12
            float r7 = r7 - r12
        L114:
            androidx.appcompat.widget.ActionBarContainer r12 = r11.d
            a.Jg r12 = a.C0414ug.a(r12)
            r12.e(r7)
            java.lang.ref.WeakReference<android.view.View> r2 = r12.f145a
            java.lang.Object r2 = r2.get()
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L135
            if (r8 == 0) goto L12e
            a.B5 r6 = new a.B5
            r6.<init>(r8, r2)
        L12e:
            android.view.ViewPropertyAnimator r2 = r2.animate()
            r2.setUpdateListener(r6)
        L135:
            boolean r2 = r0.e
            java.util.ArrayList<a.Jg> r3 = r0.f155a
            if (r2 != 0) goto L13e
            r3.add(r12)
        L13e:
            boolean r12 = r11.o
            if (r12 == 0) goto L152
            if (r1 == 0) goto L152
            a.Jg r12 = a.C0414ug.a(r1)
            r12.e(r7)
            boolean r1 = r0.e
            if (r1 != 0) goto L152
            r3.add(r12)
        L152:
            android.view.animation.AccelerateInterpolator r12 = a.lh.y
            boolean r1 = r0.e
            if (r1 != 0) goto L15a
            r0.c = r12
        L15a:
            if (r1 != 0) goto L15e
            r0.b = r4
        L15e:
            if (r1 != 0) goto L162
            r0.d = r9
        L162:
            r11.s = r0
            r0.b()
            return
        L168:
            r9.a()
        L16b:
            return
    }
}
