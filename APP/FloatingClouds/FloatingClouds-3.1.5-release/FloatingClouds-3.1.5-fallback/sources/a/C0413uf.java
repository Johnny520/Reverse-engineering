package a;

/* JADX INFO: renamed from: a.uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0413uf extends a.L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.widget.d f715a;
    public final android.view.Window.Callback b;
    public final a.C0413uf.e c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final java.util.ArrayList<a.L.b> g;
    public final a.C0413uf.a h;

    /* JADX INFO: renamed from: a.uf$a */
    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.C0413uf f716a;

        public a(a.C0413uf r1) {
                r0 = this;
                r0.<init>()
                r0.f716a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r6 = this;
                a.uf r0 = r6.f716a
                android.view.Window$Callback r1 = r0.b
                android.view.Menu r0 = r0.p()
                boolean r2 = r0 instanceof androidx.appcompat.view.menu.f
                r3 = 0
                if (r2 == 0) goto L11
                r2 = r0
                androidx.appcompat.view.menu.f r2 = (androidx.appcompat.view.menu.f) r2
                goto L12
            L11:
                r2 = r3
            L12:
                if (r2 == 0) goto L17
                r2.w()
            L17:
                r0.clear()     // Catch: java.lang.Throwable -> L28
                r4 = 0
                boolean r5 = r1.onCreatePanelMenu(r4, r0)     // Catch: java.lang.Throwable -> L28
                if (r5 == 0) goto L2a
                boolean r1 = r1.onPreparePanel(r4, r3, r0)     // Catch: java.lang.Throwable -> L28
                if (r1 != 0) goto L2d
                goto L2a
            L28:
                r0 = move-exception
                goto L33
            L2a:
                r0.clear()     // Catch: java.lang.Throwable -> L28
            L2d:
                if (r2 == 0) goto L32
                r2.v()
            L32:
                return
            L33:
                if (r2 == 0) goto L38
                r2.v()
            L38:
                throw r0
        }
    }

    /* JADX INFO: renamed from: a.uf$b */
    public class b implements androidx.appcompat.widget.Toolbar.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.C0413uf f717a;

        public b(a.C0413uf r1) {
                r0 = this;
                r0.<init>()
                r0.f717a = r1
                return
        }
    }

    /* JADX INFO: renamed from: a.uf$c */
    public final class c implements androidx.appcompat.view.menu.j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f718a;
        public final /* synthetic */ a.C0413uf b;

        public c(a.C0413uf r1) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                return
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void a(androidx.appcompat.view.menu.f r2, boolean r3) {
                r1 = this;
                boolean r3 = r1.f718a
                if (r3 == 0) goto L5
                return
            L5:
                r3 = 1
                r1.f718a = r3
                a.uf r3 = r1.b
                androidx.appcompat.widget.d r0 = r3.f715a
                r0.i()
                android.view.Window$Callback r3 = r3.b
                r0 = 108(0x6c, float:1.51E-43)
                r3.onPanelClosed(r0, r2)
                r2 = 0
                r1.f718a = r2
                return
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean b(androidx.appcompat.view.menu.f r3) {
                r2 = this;
                a.uf r0 = r2.b
                android.view.Window$Callback r0 = r0.b
                r1 = 108(0x6c, float:1.51E-43)
                r0.onMenuOpened(r1, r3)
                r3 = 1
                return r3
        }
    }

    /* JADX INFO: renamed from: a.uf$d */
    public final class d implements androidx.appcompat.view.menu.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.C0413uf f719a;

        public d(a.C0413uf r1) {
                r0 = this;
                r0.<init>()
                r0.f719a = r1
                return
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(androidx.appcompat.view.menu.f r1, android.view.MenuItem r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(androidx.appcompat.view.menu.f r5) {
                r4 = this;
                a.uf r0 = r4.f719a
                androidx.appcompat.widget.d r1 = r0.f715a
                androidx.appcompat.widget.Toolbar r1 = r1.f856a
                androidx.appcompat.widget.ActionMenuView r1 = r1.f845a
                r2 = 0
                if (r1 == 0) goto L17
                androidx.appcompat.widget.a r1 = r1.t
                if (r1 == 0) goto L17
                boolean r1 = r1.k()
                if (r1 == 0) goto L17
                r1 = 1
                goto L18
            L17:
                r1 = r2
            L18:
                android.view.Window$Callback r0 = r0.b
                r3 = 108(0x6c, float:1.51E-43)
                if (r1 == 0) goto L22
                r0.onPanelClosed(r3, r5)
                return
            L22:
                r1 = 0
                boolean r1 = r0.onPreparePanel(r2, r1, r5)
                if (r1 == 0) goto L2c
                r0.onMenuOpened(r3, r5)
            L2c:
                return
        }
    }

    /* JADX INFO: renamed from: a.uf$e */
    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.C0413uf f720a;

        public e(a.C0413uf r1) {
                r0 = this;
                r0.<init>()
                r0.f720a = r1
                return
        }
    }

    public C0413uf(androidx.appcompat.widget.Toolbar r4, java.lang.CharSequence r5, android.view.Window.Callback r6) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.g = r0
            a.uf$a r0 = new a.uf$a
            r0.<init>(r3)
            r3.h = r0
            a.uf$b r0 = new a.uf$b
            r0.<init>(r3)
            r4.getClass()
            androidx.appcompat.widget.d r1 = new androidx.appcompat.widget.d
            r2 = 0
            r1.<init>(r4, r2)
            r3.f715a = r1
            r6.getClass()
            r3.b = r6
            r1.k = r6
            r4.setOnMenuItemClickListener(r0)
            r1.setWindowTitle(r5)
            a.uf$e r4 = new a.uf$e
            r4.<init>(r3)
            r3.c = r4
            return
    }

    @Override // a.L
    public final boolean a() {
            r1 = this;
            androidx.appcompat.widget.d r0 = r1.f715a
            boolean r0 = r0.d()
            return r0
    }

    @Override // a.L
    public final boolean b() {
            r2 = this;
            androidx.appcompat.widget.d r0 = r2.f715a
            androidx.appcompat.widget.Toolbar r1 = r0.f856a
            androidx.appcompat.widget.Toolbar$f r1 = r1.M
            if (r1 == 0) goto L11
            androidx.appcompat.view.menu.h r1 = r1.b
            if (r1 == 0) goto L11
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
            boolean r0 = r3.f
            if (r4 != r0) goto L5
            goto L1c
        L5:
            r3.f = r4
            java.util.ArrayList<a.L$b> r4 = r3.g
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
            androidx.appcompat.widget.d r0 = r1.f715a
            int r0 = r0.b
            return r0
    }

    @Override // a.L
    public final android.content.Context e() {
            r1 = this;
            androidx.appcompat.widget.d r0 = r1.f715a
            androidx.appcompat.widget.Toolbar r0 = r0.f856a
            android.content.Context r0 = r0.getContext()
            return r0
    }

    @Override // a.L
    public final boolean f() {
            r3 = this;
            androidx.appcompat.widget.d r0 = r3.f715a
            androidx.appcompat.widget.Toolbar r1 = r0.f856a
            a.uf$a r2 = r3.h
            r1.removeCallbacks(r2)
            androidx.appcompat.widget.Toolbar r0 = r0.f856a
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            r0.postOnAnimation(r2)
            r0 = 1
            return r0
    }

    @Override // a.L
    public final void g() {
            r0 = this;
            return
    }

    @Override // a.L
    public final void h() {
            r2 = this;
            androidx.appcompat.widget.d r0 = r2.f715a
            androidx.appcompat.widget.Toolbar r0 = r0.f856a
            a.uf$a r1 = r2.h
            r0.removeCallbacks(r1)
            return
    }

    @Override // a.L
    public final boolean i(int r5, android.view.KeyEvent r6) {
            r4 = this;
            android.view.Menu r0 = r4.p()
            r1 = 0
            if (r0 == 0) goto L20
            int r2 = r6.getDeviceId()
            android.view.KeyCharacterMap r2 = android.view.KeyCharacterMap.load(r2)
            int r2 = r2.getKeyboardType()
            r3 = 1
            if (r2 == r3) goto L17
            goto L18
        L17:
            r3 = r1
        L18:
            r0.setQwertyMode(r3)
            boolean r5 = r0.performShortcut(r5, r6, r1)
            return r5
        L20:
            return r1
    }

    @Override // a.L
    public final boolean j(android.view.KeyEvent r2) {
            r1 = this;
            int r2 = r2.getAction()
            r0 = 1
            if (r2 != r0) goto La
            r1.k()
        La:
            return r0
    }

    @Override // a.L
    public final boolean k() {
            r1 = this;
            androidx.appcompat.widget.d r0 = r1.f715a
            androidx.appcompat.widget.Toolbar r0 = r0.f856a
            boolean r0 = r0.u()
            return r0
    }

    @Override // a.L
    public final void l(boolean r1) {
            r0 = this;
            return
    }

    @Override // a.L
    public final void m(boolean r1) {
            r0 = this;
            return
    }

    @Override // a.L
    public final void n(java.lang.CharSequence r2) {
            r1 = this;
            androidx.appcompat.widget.d r0 = r1.f715a
            r0.setWindowTitle(r2)
            return
    }

    public final android.view.Menu p() {
            r4 = this;
            boolean r0 = r4.e
            androidx.appcompat.widget.d r1 = r4.f715a
            if (r0 != 0) goto L21
            a.uf$c r0 = new a.uf$c
            r0.<init>(r4)
            a.uf$d r2 = new a.uf$d
            r2.<init>(r4)
            androidx.appcompat.widget.Toolbar r3 = r1.f856a
            r3.N = r0
            r3.O = r2
            androidx.appcompat.widget.ActionMenuView r3 = r3.f845a
            if (r3 == 0) goto L1e
            r3.u = r0
            r3.v = r2
        L1e:
            r0 = 1
            r4.e = r0
        L21:
            androidx.appcompat.widget.Toolbar r0 = r1.f856a
            android.view.Menu r0 = r0.getMenu()
            return r0
    }
}
