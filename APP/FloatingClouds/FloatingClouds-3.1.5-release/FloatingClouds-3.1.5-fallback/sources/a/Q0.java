package a;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends a.O0 implements androidx.appcompat.view.menu.f.a, android.view.LayoutInflater.Factory2 {
    public static final a.C0162ge<java.lang.String, java.lang.Integer> i0 = null;
    public static final int[] j0 = null;
    public static final boolean k0 = false;
    public boolean A;
    public android.view.ViewGroup B;
    public android.widget.TextView C;
    public android.view.View D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public a.Q0.m[] M;
    public a.Q0.m N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public android.content.res.Configuration S;
    public final int T;
    public int U;
    public int V;
    public boolean W;
    public a.Q0.k X;
    public a.Q0.i Y;
    public boolean Z;
    public int a0;
    public final a.Q0.a b0;
    public boolean c0;
    public android.graphics.Rect d0;
    public android.graphics.Rect e0;
    public a.C0399u1 f0;
    public android.window.OnBackInvokedDispatcher g0;
    public android.window.OnBackInvokedCallback h0;
    public final java.lang.Object j;
    public final android.content.Context k;
    public android.view.Window l;
    public a.Q0.h m;
    public final java.lang.Object n;
    public a.L o;
    public a.Ie p;
    public java.lang.CharSequence q;
    public a.M4 r;
    public a.Q0.c s;
    public a.Q0.n t;
    public a.P u;
    public androidx.appcompat.widget.ActionBarContextView v;
    public android.widget.PopupWindow w;
    public a.T0 x;
    public a.Jg y;
    public final boolean z;

    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.Q0 f215a;

        public a(a.Q0 r1) {
                r0 = this;
                r0.<init>()
                r0.f215a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r3 = this;
                a.Q0 r0 = r3.f215a
                int r1 = r0.a0
                r1 = r1 & 1
                r2 = 0
                if (r1 == 0) goto Lc
                r0.L(r2)
            Lc:
                int r1 = r0.a0
                r1 = r1 & 4096(0x1000, float:5.74E-42)
                if (r1 == 0) goto L17
                r1 = 108(0x6c, float:1.51E-43)
                r0.L(r1)
            L17:
                r0.Z = r2
                r0.a0 = r2
                return
        }
    }

    public class b implements a.N {
    }

    public final class c implements androidx.appcompat.view.menu.j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.Q0 f216a;

        public c(a.Q0 r1) {
                r0 = this;
                r0.<init>()
                r0.f216a = r1
                return
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void a(androidx.appcompat.view.menu.f r1, boolean r2) {
                r0 = this;
                a.Q0 r2 = r0.f216a
                r2.H(r1)
                return
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean b(androidx.appcompat.view.menu.f r3) {
                r2 = this;
                a.Q0 r0 = r2.f216a
                android.view.Window r0 = r0.l
                android.view.Window$Callback r0 = r0.getCallback()
                if (r0 == 0) goto Lf
                r1 = 108(0x6c, float:1.51E-43)
                r0.onMenuOpened(r1, r3)
            Lf:
                r3 = 1
                return r3
        }
    }

    public class d implements a.P.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.P.a f217a;
        public final /* synthetic */ a.Q0 b;

        public class a extends a.C0282n9 {
            public final /* synthetic */ a.Q0.d b;

            public a(a.Q0.d r1) {
                    r0 = this;
                    r0.<init>()
                    r0.b = r1
                    return
            }

            @Override // a.Lg
            public final void a() {
                    r3 = this;
                    a.Q0$d r0 = r3.b
                    a.Q0 r1 = r0.b
                    androidx.appcompat.widget.ActionBarContextView r1 = r1.v
                    r2 = 8
                    r1.setVisibility(r2)
                    a.Q0 r0 = r0.b
                    android.widget.PopupWindow r1 = r0.w
                    if (r1 == 0) goto L15
                    r1.dismiss()
                    goto L2c
                L15:
                    androidx.appcompat.widget.ActionBarContextView r1 = r0.v
                    android.view.ViewParent r1 = r1.getParent()
                    boolean r1 = r1 instanceof android.view.View
                    if (r1 == 0) goto L2c
                    androidx.appcompat.widget.ActionBarContextView r1 = r0.v
                    android.view.ViewParent r1 = r1.getParent()
                    android.view.View r1 = (android.view.View) r1
                    java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
                    a.C0414ug.c.c(r1)
                L2c:
                    androidx.appcompat.widget.ActionBarContextView r1 = r0.v
                    r1.h()
                    a.Jg r1 = r0.y
                    r2 = 0
                    r1.d(r2)
                    r0.y = r2
                    android.view.ViewGroup r0 = r0.B
                    java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
                    a.C0414ug.c.c(r0)
                    return
            }
        }

        public d(a.Q0 r1, a.P.a r2) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.f217a = r2
                return
        }

        @Override // a.P.a
        public final boolean a(a.P r2, androidx.appcompat.view.menu.f r3) {
                r1 = this;
                a.P$a r0 = r1.f217a
                boolean r2 = r0.a(r2, r3)
                return r2
        }

        @Override // a.P.a
        public final void b(a.P r3) {
                r2 = this;
                a.P$a r0 = r2.f217a
                r0.b(r3)
                a.Q0 r3 = r2.b
                android.widget.PopupWindow r0 = r3.w
                if (r0 == 0) goto L16
                android.view.Window r0 = r3.l
                android.view.View r0 = r0.getDecorView()
                a.T0 r1 = r3.x
                r0.removeCallbacks(r1)
            L16:
                androidx.appcompat.widget.ActionBarContextView r0 = r3.v
                if (r0 == 0) goto L35
                a.Jg r0 = r3.y
                if (r0 == 0) goto L21
                r0.b()
            L21:
                androidx.appcompat.widget.ActionBarContextView r0 = r3.v
                a.Jg r0 = a.C0414ug.a(r0)
                r1 = 0
                r0.a(r1)
                r3.y = r0
                a.Q0$d$a r1 = new a.Q0$d$a
                r1.<init>(r2)
                r0.d(r1)
            L35:
                java.lang.Object r0 = r3.n
                if (r0 == 0) goto L3e
                a.P r1 = r3.u
                r0.onSupportActionModeFinished(r1)
            L3e:
                r0 = 0
                r3.u = r0
                android.view.ViewGroup r0 = r3.B
                java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
                a.C0414ug.c.c(r0)
                r3.Y()
                return
        }

        @Override // a.P.a
        public final boolean c(a.P r3, androidx.appcompat.view.menu.f r4) {
                r2 = this;
                a.Q0 r0 = r2.b
                android.view.ViewGroup r0 = r0.B
                java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
                a.C0414ug.c.c(r0)
                a.P$a r0 = r2.f217a
                boolean r3 = r0.c(r3, r4)
                return r3
        }

        @Override // a.P.a
        public final boolean d(a.P r2, android.view.MenuItem r3) {
                r1 = this;
                a.P$a r0 = r1.f217a
                boolean r2 = r0.d(r2, r3)
                return r2
        }
    }

    public static class e {
        public static boolean a(android.os.PowerManager r0) {
                boolean r0 = r0.isPowerSaveMode()
                return r0
        }

        public static java.lang.String b(java.util.Locale r0) {
                java.lang.String r0 = r0.toLanguageTag()
                return r0
        }
    }

    public static class f {
        public static void a(android.content.res.Configuration r1, android.content.res.Configuration r2, android.content.res.Configuration r3) {
                android.os.LocaleList r1 = r1.getLocales()
                android.os.LocaleList r0 = r2.getLocales()
                boolean r1 = r1.equals(r0)
                if (r1 != 0) goto L15
                r3.setLocales(r0)
                java.util.Locale r1 = r2.locale
                r3.locale = r1
            L15:
                return
        }

        public static a.J9 b(android.content.res.Configuration r0) {
                android.os.LocaleList r0 = r0.getLocales()
                java.lang.String r0 = r0.toLanguageTags()
                a.J9 r0 = a.J9.a(r0)
                return r0
        }

        public static void c(a.J9 r0) {
                a.L9 r0 = r0.f137a
                android.os.LocaleList r0 = r0.f163a
                java.lang.String r0 = r0.toLanguageTags()
                android.os.LocaleList r0 = android.os.LocaleList.forLanguageTags(r0)
                android.os.LocaleList.setDefault(r0)
                return
        }

        public static void d(android.content.res.Configuration r0, a.J9 r1) {
                a.L9 r1 = r1.f137a
                android.os.LocaleList r1 = r1.f163a
                java.lang.String r1 = r1.toLanguageTags()
                android.os.LocaleList r1 = android.os.LocaleList.forLanguageTags(r1)
                r0.setLocales(r1)
                return
        }
    }

    public static class g {
        public static android.window.OnBackInvokedDispatcher a(android.app.Activity r0) {
                android.window.OnBackInvokedDispatcher r0 = a.H.d(r0)
                return r0
        }

        public static android.window.OnBackInvokedCallback b(java.lang.Object r2, a.Q0 r3) {
                java.util.Objects.requireNonNull(r3)
                a.V0 r0 = new a.V0
                r1 = 0
                r0.<init>(r1, r3)
                android.window.OnBackInvokedDispatcher r2 = a.H.e(r2)
                a.H.f(r2, r0)
                return r0
        }

        public static void c(java.lang.Object r0, java.lang.Object r1) {
                android.window.OnBackInvokedCallback r1 = a.H.b(r1)
                android.window.OnBackInvokedDispatcher r0 = a.H.e(r0)
                a.H.g(r0, r1)
                return
        }
    }

    public class h extends a.jh {
        public a.C0413uf.e b;
        public boolean c;
        public boolean d;
        public boolean e;
        public final /* synthetic */ a.Q0 f;

        public h(a.Q0 r1, android.view.Window.Callback r2) {
                r0 = this;
                r0.f = r1
                r0.<init>(r2)
                return
        }

        public final void a(android.view.Window.Callback r3) {
                r2 = this;
                r0 = 1
                r1 = 0
                r2.c = r0     // Catch: java.lang.Throwable -> La
                r3.onContentChanged()     // Catch: java.lang.Throwable -> La
                r2.c = r1
                return
            La:
                r3 = move-exception
                r2.c = r1
                throw r3
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyEvent(android.view.KeyEvent r3) {
                r2 = this;
                boolean r0 = r2.d
                android.view.Window$Callback r1 = r2.f538a
                if (r0 == 0) goto Lb
                boolean r3 = r1.dispatchKeyEvent(r3)
                return r3
            Lb:
                a.Q0 r0 = r2.f
                boolean r0 = r0.K(r3)
                if (r0 != 0) goto L1c
                boolean r3 = r1.dispatchKeyEvent(r3)
                if (r3 == 0) goto L1a
                goto L1c
            L1a:
                r3 = 0
                return r3
            L1c:
                r3 = 1
                return r3
        }

        @Override // android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
                r5 = this;
                android.view.Window$Callback r0 = r5.f538a
                boolean r0 = r0.dispatchKeyShortcutEvent(r6)
                r1 = 1
                if (r0 != 0) goto L4c
                int r0 = r6.getKeyCode()
                a.Q0 r2 = r5.f
                r2.Q()
                a.L r3 = r2.o
                if (r3 == 0) goto L1d
                boolean r0 = r3.i(r0, r6)
                if (r0 == 0) goto L1d
                goto L4c
            L1d:
                a.Q0$m r0 = r2.N
                if (r0 == 0) goto L32
                int r3 = r6.getKeyCode()
                boolean r0 = r2.V(r0, r3, r6)
                if (r0 == 0) goto L32
                a.Q0$m r6 = r2.N
                if (r6 == 0) goto L4c
                r6.l = r1
                return r1
            L32:
                a.Q0$m r0 = r2.N
                r3 = 0
                if (r0 != 0) goto L4b
                a.Q0$m r0 = r2.P(r3)
                r2.W(r0, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r2.V(r0, r4, r6)
                r0.k = r3
                if (r6 == 0) goto L4b
                goto L4c
            L4b:
                return r3
            L4c:
                return r1
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
                r1 = this;
                boolean r0 = r1.c
                if (r0 == 0) goto L9
                android.view.Window$Callback r0 = r1.f538a
                r0.onContentChanged()
            L9:
                return
        }

        @Override // android.view.Window.Callback
        public final boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
                r1 = this;
                if (r2 != 0) goto L8
                boolean r0 = r3 instanceof androidx.appcompat.view.menu.f
                if (r0 != 0) goto L8
                r2 = 0
                return r2
            L8:
                android.view.Window$Callback r0 = r1.f538a
                boolean r2 = r0.onCreatePanelMenu(r2, r3)
                return r2
        }

        @Override // android.view.Window.Callback
        public final android.view.View onCreatePanelView(int r3) {
                r2 = this;
                a.uf$e r0 = r2.b
                if (r0 == 0) goto L1a
                if (r3 != 0) goto L16
                android.view.View r1 = new android.view.View
                a.uf r0 = r0.f720a
                androidx.appcompat.widget.d r0 = r0.f715a
                androidx.appcompat.widget.Toolbar r0 = r0.f856a
                android.content.Context r0 = r0.getContext()
                r1.<init>(r0)
                goto L17
            L16:
                r1 = 0
            L17:
                if (r1 == 0) goto L1a
                return r1
            L1a:
                android.view.Window$Callback r0 = r2.f538a
                android.view.View r3 = r0.onCreatePanelView(r3)
                return r3
        }

        @Override // a.jh, android.view.Window.Callback
        public final boolean onMenuOpened(int r3, android.view.Menu r4) {
                r2 = this;
                super.onMenuOpened(r3, r4)
                r4 = 108(0x6c, float:1.51E-43)
                r0 = 1
                a.Q0 r1 = r2.f
                if (r3 != r4) goto L15
                r1.Q()
                a.L r3 = r1.o
                if (r3 == 0) goto L18
                r3.c(r0)
                goto L18
            L15:
                r1.getClass()
            L18:
                return r0
        }

        @Override // a.jh, android.view.Window.Callback
        public final void onPanelClosed(int r3, android.view.Menu r4) {
                r2 = this;
                boolean r0 = r2.e
                if (r0 == 0) goto La
                android.view.Window$Callback r0 = r2.f538a
                r0.onPanelClosed(r3, r4)
                return
            La:
                super.onPanelClosed(r3, r4)
                a.Q0 r4 = r2.f
                r0 = 108(0x6c, float:1.51E-43)
                r1 = 0
                if (r3 != r0) goto L1f
                r4.Q()
                a.L r3 = r4.o
                if (r3 == 0) goto L2c
                r3.c(r1)
                return
            L1f:
                if (r3 != 0) goto L2d
                a.Q0$m r3 = r4.P(r3)
                boolean r0 = r3.m
                if (r0 == 0) goto L2c
                r4.I(r3, r1)
            L2c:
                return
            L2d:
                r4.getClass()
                return
        }

        @Override // android.view.Window.Callback
        public final boolean onPreparePanel(int r6, android.view.View r7, android.view.Menu r8) {
                r5 = this;
                boolean r0 = r8 instanceof androidx.appcompat.view.menu.f
                if (r0 == 0) goto L8
                r0 = r8
                androidx.appcompat.view.menu.f r0 = (androidx.appcompat.view.menu.f) r0
                goto L9
            L8:
                r0 = 0
            L9:
                r1 = 0
                if (r6 != 0) goto Lf
                if (r0 != 0) goto Lf
                return r1
            Lf:
                r2 = 1
                if (r0 == 0) goto L14
                r0.x = r2
            L14:
                a.uf$e r3 = r5.b
                if (r3 == 0) goto L26
                if (r6 != 0) goto L26
                a.uf r3 = r3.f720a
                boolean r4 = r3.d
                if (r4 != 0) goto L26
                androidx.appcompat.widget.d r4 = r3.f715a
                r4.l = r2
                r3.d = r2
            L26:
                android.view.Window$Callback r2 = r5.f538a
                boolean r6 = r2.onPreparePanel(r6, r7, r8)
                if (r0 == 0) goto L30
                r0.x = r1
            L30:
                return r6
        }

        @Override // a.jh, android.view.Window.Callback
        public final void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> r3, android.view.Menu r4, int r5) {
                r2 = this;
                r0 = 0
                a.Q0 r1 = r2.f
                a.Q0$m r0 = r1.P(r0)
                androidx.appcompat.view.menu.f r0 = r0.h
                if (r0 == 0) goto Lf
                super.onProvideKeyboardShortcuts(r3, r0, r5)
                return
            Lf:
                super.onProvideKeyboardShortcuts(r3, r4, r5)
                return
        }

        @Override // android.view.Window.Callback
        public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.view.Window.Callback
        public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r3, int r4) {
                r2 = this;
                a.Q0 r0 = r2.f
                boolean r1 = r0.z
                if (r1 == 0) goto L1d
                if (r4 == 0) goto L9
                goto L1d
            L9:
                a.Ge$a r4 = new a.Ge$a
                android.content.Context r1 = r0.k
                r4.<init>(r1, r3)
                a.P r3 = r0.C(r4)
                if (r3 == 0) goto L1b
                a.Ge r3 = r4.e(r3)
                return r3
            L1b:
                r3 = 0
                return r3
            L1d:
                android.view.Window$Callback r0 = r2.f538a
                android.view.ActionMode r3 = a.jh.a.b(r0, r3, r4)
                return r3
        }
    }

    public class i extends a.Q0.j {
        public final android.os.PowerManager c;
        public final /* synthetic */ a.Q0 d;

        public i(a.Q0 r1, android.content.Context r2) {
                r0 = this;
                r0.d = r1
                r0.<init>(r1)
                android.content.Context r1 = r2.getApplicationContext()
                java.lang.String r2 = "power"
                java.lang.Object r1 = r1.getSystemService(r2)
                android.os.PowerManager r1 = (android.os.PowerManager) r1
                r0.c = r1
                return
        }

        @Override // a.Q0.j
        public final android.content.IntentFilter b() {
                r2 = this;
                android.content.IntentFilter r0 = new android.content.IntentFilter
                r0.<init>()
                java.lang.String r1 = "android.os.action.POWER_SAVE_MODE_CHANGED"
                r0.addAction(r1)
                return r0
        }

        @Override // a.Q0.j
        public final int c() {
                r1 = this;
                android.os.PowerManager r0 = r1.c
                boolean r0 = a.Q0.e.a(r0)
                if (r0 == 0) goto La
                r0 = 2
                return r0
            La:
                r0 = 1
                return r0
        }

        @Override // a.Q0.j
        public final void d() {
                r2 = this;
                r0 = 1
                a.Q0 r1 = r2.d
                r1.D(r0, r0)
                return
        }
    }

    public abstract class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a.Q0.j.a f218a;
        public final /* synthetic */ a.Q0 b;

        public class a extends android.content.BroadcastReceiver {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a.Q0.j f219a;

            public a(a.Q0.j r1) {
                    r0 = this;
                    r0.f219a = r1
                    r0.<init>()
                    return
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(android.content.Context r1, android.content.Intent r2) {
                    r0 = this;
                    a.Q0$j r1 = r0.f219a
                    r1.d()
                    return
            }
        }

        public j(a.Q0 r1) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                return
        }

        public final void a() {
                r2 = this;
                a.Q0$j$a r0 = r2.f218a
                if (r0 == 0) goto Le
                a.Q0 r1 = r2.b     // Catch: java.lang.IllegalArgumentException -> Lb
                android.content.Context r1 = r1.k     // Catch: java.lang.IllegalArgumentException -> Lb
                r1.unregisterReceiver(r0)     // Catch: java.lang.IllegalArgumentException -> Lb
            Lb:
                r0 = 0
                r2.f218a = r0
            Le:
                return
        }

        public abstract android.content.IntentFilter b();

        public abstract int c();

        public abstract void d();

        public final void e() {
                r3 = this;
                r3.a()
                android.content.IntentFilter r0 = r3.b()
                int r1 = r0.countActions()
                if (r1 != 0) goto Le
                return
            Le:
                a.Q0$j$a r1 = r3.f218a
                if (r1 != 0) goto L19
                a.Q0$j$a r1 = new a.Q0$j$a
                r1.<init>(r3)
                r3.f218a = r1
            L19:
                a.Q0 r1 = r3.b
                android.content.Context r1 = r1.k
                a.Q0$j$a r2 = r3.f218a
                r1.registerReceiver(r2, r0)
                return
        }
    }

    public class k extends a.Q0.j {
        public final a.Jf c;
        public final /* synthetic */ a.Q0 d;

        public k(a.Q0 r1, a.Jf r2) {
                r0 = this;
                r0.d = r1
                r0.<init>(r1)
                r0.c = r2
                return
        }

        @Override // a.Q0.j
        public final android.content.IntentFilter b() {
                r2 = this;
                android.content.IntentFilter r0 = new android.content.IntentFilter
                r0.<init>()
                java.lang.String r1 = "android.intent.action.TIME_SET"
                r0.addAction(r1)
                java.lang.String r1 = "android.intent.action.TIMEZONE_CHANGED"
                r0.addAction(r1)
                java.lang.String r1 = "android.intent.action.TIME_TICK"
                r0.addAction(r1)
                return r0
        }

        @Override // a.Q0.j
        public final int c() {
                r22 = this;
                r1 = r22
                a.Jf r0 = r1.c
                a.Jf$a r2 = r0.c
                long r3 = r2.b
                long r5 = java.lang.System.currentTimeMillis()
                int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                r4 = 1
                if (r3 <= 0) goto L15
                boolean r0 = r2.f144a
                goto Lfa
            L15:
                android.content.Context r3 = r0.f143a
                java.lang.String r5 = "android.permission.ACCESS_COARSE_LOCATION"
                int r5 = a.C0282n9.i(r3, r5)
                java.lang.String r6 = "Failed to get last known location"
                java.lang.String r7 = "TwilightManager"
                r8 = 0
                android.location.LocationManager r9 = r0.b
                if (r5 != 0) goto L3a
                java.lang.String r0 = "network"
                boolean r5 = r9.isProviderEnabled(r0)     // Catch: java.lang.Exception -> L33
                if (r5 == 0) goto L37
                android.location.Location r0 = r9.getLastKnownLocation(r0)     // Catch: java.lang.Exception -> L33
                goto L38
            L33:
                r0 = move-exception
                android.util.Log.d(r7, r6, r0)
            L37:
                r0 = r8
            L38:
                r5 = r0
                goto L3b
            L3a:
                r5 = r8
            L3b:
                java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
                int r0 = a.C0282n9.i(r3, r0)
                if (r0 != 0) goto L54
                java.lang.String r0 = "gps"
                boolean r3 = r9.isProviderEnabled(r0)     // Catch: java.lang.Exception -> L50
                if (r3 == 0) goto L54
                android.location.Location r8 = r9.getLastKnownLocation(r0)     // Catch: java.lang.Exception -> L50
                goto L54
            L50:
                r0 = move-exception
                android.util.Log.d(r7, r6, r0)
            L54:
                if (r8 == 0) goto L66
                if (r5 == 0) goto L66
                long r9 = r8.getTime()
                long r11 = r5.getTime()
                int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r0 <= 0) goto L69
            L64:
                r5 = r8
                goto L69
            L66:
                if (r8 == 0) goto L69
                goto L64
            L69:
                r0 = 0
                if (r5 == 0) goto Le3
                long r9 = java.lang.System.currentTimeMillis()
                a.If r3 = a.If.d
                if (r3 != 0) goto L7b
                a.If r3 = new a.If
                r3.<init>()
                a.If.d = r3
            L7b:
                a.If r11 = a.If.d
                r6 = 86400000(0x5265c00, double:4.2687272E-316)
                long r12 = r9 - r6
                double r14 = r5.getLatitude()
                double r16 = r5.getLongitude()
                r11.a(r12, r14, r16)
                double r12 = r5.getLatitude()
                r8 = r11
                r11 = r12
                double r13 = r5.getLongitude()
                r8.a(r9, r11, r13)
                r11 = r8
                int r3 = r11.c
                if (r3 != r4) goto La0
                r0 = r4
            La0:
                long r12 = r11.b
                long r14 = r11.f128a
                long r6 = r6 + r9
                r16 = r14
                double r14 = r5.getLatitude()
                double r18 = r5.getLongitude()
                r20 = r12
                r12 = r6
                r5 = r20
                r7 = r16
                r16 = r18
                r11.a(r12, r14, r16)
                long r12 = r11.b
                r14 = -1
                int r3 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
                if (r3 == 0) goto Ld9
                int r3 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
                if (r3 != 0) goto Lc8
                goto Ld9
            Lc8:
                int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
                if (r3 <= 0) goto Lcd
                goto Ld4
            Lcd:
                int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r3 <= 0) goto Ld3
                r12 = r7
                goto Ld4
            Ld3:
                r12 = r5
            Ld4:
                r5 = 60000(0xea60, double:2.9644E-319)
                long r12 = r12 + r5
                goto Lde
            Ld9:
                r5 = 43200000(0x2932e00, double:2.1343636E-316)
                long r12 = r9 + r5
            Lde:
                r2.f144a = r0
                r2.b = r12
                goto Lfa
            Le3:
                java.lang.String r2 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
                android.util.Log.i(r7, r2)
                java.util.Calendar r2 = java.util.Calendar.getInstance()
                r3 = 11
                int r2 = r2.get(r3)
                r3 = 6
                if (r2 < r3) goto Lf9
                r3 = 22
                if (r2 < r3) goto Lfa
            Lf9:
                r0 = r4
            Lfa:
                if (r0 == 0) goto Lfe
                r0 = 2
                return r0
            Lfe:
                return r4
        }

        @Override // a.Q0.j
        public final void d() {
                r2 = this;
                r0 = 1
                a.Q0 r1 = r2.d
                r1.D(r0, r0)
                return
        }
    }

    public class l extends androidx.appcompat.widget.ContentFrameLayout {
        public final /* synthetic */ a.Q0 i;

        public l(a.Q0 r1, a.Z3 r2) {
                r0 = this;
                r0.i = r1
                r1 = 0
                r0.<init>(r2, r1)
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(android.view.KeyEvent r2) {
                r1 = this;
                a.Q0 r0 = r1.i
                boolean r0 = r0.K(r2)
                if (r0 != 0) goto L11
                boolean r2 = super.dispatchKeyEvent(r2)
                if (r2 == 0) goto Lf
                goto L11
            Lf:
                r2 = 0
                return r2
            L11:
                r2 = 1
                return r2
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
                r3 = this;
                int r0 = r4.getAction()
                if (r0 != 0) goto L31
                float r0 = r4.getX()
                int r0 = (int) r0
                float r1 = r4.getY()
                int r1 = (int) r1
                r2 = -5
                if (r0 < r2) goto L25
                if (r1 < r2) goto L25
                int r2 = r3.getWidth()
                int r2 = r2 + 5
                if (r0 > r2) goto L25
                int r0 = r3.getHeight()
                int r0 = r0 + 5
                if (r1 <= r0) goto L31
            L25:
                a.Q0 r4 = r3.i
                r0 = 0
                a.Q0$m r0 = r4.P(r0)
                r1 = 1
                r4.I(r0, r1)
                return r1
            L31:
                boolean r4 = super.onInterceptTouchEvent(r4)
                return r4
        }

        @Override // android.view.View
        public final void setBackgroundResource(int r2) {
                r1 = this;
                android.content.Context r0 = r1.getContext()
                android.graphics.drawable.Drawable r2 = a.C0435w1.A(r0, r2)
                r1.setBackgroundDrawable(r2)
                return
        }
    }

    public static final class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f220a;
        public int b;
        public int c;
        public int d;
        public a.Q0.l e;
        public android.view.View f;
        public android.view.View g;
        public androidx.appcompat.view.menu.f h;
        public androidx.appcompat.view.menu.d i;
        public a.Z3 j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public android.os.Bundle p;
    }

    public final class n implements androidx.appcompat.view.menu.j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.Q0 f221a;

        public n(a.Q0 r1) {
                r0 = this;
                r0.<init>()
                r0.f221a = r1
                return
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void a(androidx.appcompat.view.menu.f r10, boolean r11) {
                r9 = this;
                androidx.appcompat.view.menu.f r0 = r10.k()
                r1 = 0
                r2 = 1
                if (r0 == r10) goto La
                r3 = r2
                goto Lb
            La:
                r3 = r1
            Lb:
                if (r3 == 0) goto Le
                r10 = r0
            Le:
                a.Q0 r4 = r9.f221a
                a.Q0$m[] r5 = r4.M
                if (r5 == 0) goto L16
                int r6 = r5.length
                goto L17
            L16:
                r6 = r1
            L17:
                if (r1 >= r6) goto L25
                r7 = r5[r1]
                if (r7 == 0) goto L22
                androidx.appcompat.view.menu.f r8 = r7.h
                if (r8 != r10) goto L22
                goto L26
            L22:
                int r1 = r1 + 1
                goto L17
            L25:
                r7 = 0
            L26:
                if (r7 == 0) goto L36
                if (r3 == 0) goto L33
                int r10 = r7.f220a
                r4.G(r10, r7, r0)
                r4.I(r7, r2)
                return
            L33:
                r4.I(r7, r11)
            L36:
                return
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean b(androidx.appcompat.view.menu.f r3) {
                r2 = this;
                androidx.appcompat.view.menu.f r0 = r3.k()
                if (r3 != r0) goto L1d
                a.Q0 r0 = r2.f221a
                boolean r1 = r0.G
                if (r1 == 0) goto L1d
                android.view.Window r1 = r0.l
                android.view.Window$Callback r1 = r1.getCallback()
                if (r1 == 0) goto L1d
                boolean r0 = r0.R
                if (r0 != 0) goto L1d
                r0 = 108(0x6c, float:1.51E-43)
                r1.onMenuOpened(r0, r3)
            L1d:
                r3 = 1
                return r3
        }
    }

    static {
            a.ge r0 = new a.ge
            r0.<init>()
            a.Q0.i0 = r0
            r0 = 16842836(0x1010054, float:2.3693793E-38)
            int[] r0 = new int[]{r0}
            a.Q0.j0 = r0
            java.lang.String r0 = "robolectric"
            java.lang.String r1 = android.os.Build.FINGERPRINT
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            a.Q0.k0 = r0
            return
    }

    public Q0(android.content.Context r4, android.view.Window r5, a.I0 r6, java.lang.Object r7) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.y = r0
            r1 = 1
            r3.z = r1
            r1 = -100
            r3.T = r1
            a.Q0$a r2 = new a.Q0$a
            r2.<init>(r3)
            r3.b0 = r2
            r3.k = r4
            r3.n = r6
            r3.j = r7
            boolean r6 = r7 instanceof android.app.Dialog
            if (r6 == 0) goto L3f
        L1e:
            if (r4 == 0) goto L32
            boolean r6 = r4 instanceof a.E0
            if (r6 == 0) goto L27
            a.E0 r4 = (a.E0) r4
            goto L33
        L27:
            boolean r6 = r4 instanceof android.content.ContextWrapper
            if (r6 == 0) goto L32
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            android.content.Context r4 = r4.getBaseContext()
            goto L1e
        L32:
            r4 = r0
        L33:
            if (r4 == 0) goto L3f
            a.O0 r4 = r4.getDelegate()
            int r4 = r4.h()
            r3.T = r4
        L3f:
            int r4 = r3.T
            if (r4 != r1) goto L6a
            a.ge<java.lang.String, java.lang.Integer> r4 = a.Q0.i0
            java.lang.Object r6 = r3.j
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.Object r6 = r4.getOrDefault(r6, r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L6a
            int r6 = r6.intValue()
            r3.T = r6
            java.lang.Object r6 = r3.j
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4.remove(r6)
        L6a:
            if (r5 == 0) goto L6f
            r3.E(r5)
        L6f:
            a.Y0.d()
            return
    }

    public static a.J9 F(android.content.Context r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L7
            goto Lb
        L7:
            a.J9 r0 = a.O0.c
            if (r0 != 0) goto Ld
        Lb:
            r5 = 0
            return r5
        Ld:
            android.content.Context r5 = r5.getApplicationContext()
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            a.J9 r5 = a.Q0.f.b(r5)
            a.L9 r0 = r0.f137a
            android.os.LocaleList r0 = r0.f163a
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2a
            a.J9 r0 = a.J9.b
            goto L7b
        L2a:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r2 = 0
        L30:
            int r3 = r0.size()
            a.L9 r4 = r5.f137a
            android.os.LocaleList r4 = r4.f163a
            int r4 = r4.size()
            int r4 = r4 + r3
            if (r2 >= r4) goto L60
            int r3 = r0.size()
            if (r2 >= r3) goto L4a
            java.util.Locale r3 = r0.get(r2)
            goto L58
        L4a:
            int r3 = r0.size()
            int r3 = r2 - r3
            a.L9 r4 = r5.f137a
            android.os.LocaleList r4 = r4.f163a
            java.util.Locale r3 = r4.get(r3)
        L58:
            if (r3 == 0) goto L5d
            r1.add(r3)
        L5d:
            int r2 = r2 + 1
            goto L30
        L60:
            int r0 = r1.size()
            java.util.Locale[] r0 = new java.util.Locale[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.util.Locale[] r0 = (java.util.Locale[]) r0
            android.os.LocaleList r0 = a.J9.b.a(r0)
            a.J9 r1 = new a.J9
            a.L9 r2 = new a.L9
            r2.<init>(r0)
            r1.<init>(r2)
            r0 = r1
        L7b:
            a.L9 r1 = r0.f137a
            android.os.LocaleList r1 = r1.f163a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L86
            return r5
        L86:
            return r0
    }

    public static android.content.res.Configuration J(android.content.Context r1, int r2, a.J9 r3, android.content.res.Configuration r4, boolean r5) {
            r0 = 1
            if (r2 == r0) goto L1e
            r0 = 2
            if (r2 == r0) goto L1b
            if (r5 == 0) goto La
            r1 = 0
            goto L20
        La:
            android.content.Context r1 = r1.getApplicationContext()
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 48
            goto L20
        L1b:
            r1 = 32
            goto L20
        L1e:
            r1 = 16
        L20:
            android.content.res.Configuration r2 = new android.content.res.Configuration
            r2.<init>()
            r5 = 0
            r2.fontScale = r5
            if (r4 == 0) goto L2d
            r2.setTo(r4)
        L2d:
            int r4 = r2.uiMode
            r4 = r4 & (-49)
            r1 = r1 | r4
            r2.uiMode = r1
            if (r3 == 0) goto L39
            a.Q0.f.d(r2, r3)
        L39:
            return r2
    }

    @Override // a.O0
    public final void A(int r1) {
            r0 = this;
            r0.U = r1
            return
    }

    @Override // a.O0
    public final void B(java.lang.CharSequence r2) {
            r1 = this;
            r1.q = r2
            a.M4 r0 = r1.r
            if (r0 == 0) goto La
            r0.setWindowTitle(r2)
            return
        La:
            a.L r0 = r1.o
            if (r0 == 0) goto L12
            r0.n(r2)
            return
        L12:
            android.widget.TextView r0 = r1.C
            if (r0 == 0) goto L19
            r0.setText(r2)
        L19:
            return
    }

    @Override // a.O0
    public final a.P C(a.P.a r9) {
            r8 = this;
            if (r9 == 0) goto L1b6
            a.P r0 = r8.u
            if (r0 == 0) goto L9
            r0.c()
        L9:
            a.Q0$d r0 = new a.Q0$d
            r0.<init>(r8, r9)
            r8.Q()
            a.L r9 = r8.o
            java.lang.Object r1 = r8.n
            if (r9 == 0) goto L24
            a.P r9 = r9.o(r0)
            r8.u = r9
            if (r9 == 0) goto L24
            if (r1 == 0) goto L24
            r1.onSupportActionModeStarted(r9)
        L24:
            a.P r9 = r8.u
            if (r9 != 0) goto L1b0
            a.Jg r9 = r8.y
            if (r9 == 0) goto L2f
            r9.b()
        L2f:
            a.P r9 = r8.u
            if (r9 == 0) goto L36
            r9.c()
        L36:
            r9 = 0
            if (r1 == 0) goto L42
            boolean r2 = r8.R
            if (r2 != 0) goto L42
            a.P r2 = r1.onWindowStartingSupportActionMode(r0)     // Catch: java.lang.AbstractMethodError -> L42
            goto L43
        L42:
            r2 = r9
        L43:
            if (r2 == 0) goto L49
            r8.u = r2
            goto L1a0
        L49:
            androidx.appcompat.widget.ActionBarContextView r2 = r8.v
            r3 = 1
            r4 = 0
            if (r2 != 0) goto Lfb
            boolean r2 = r8.J
            android.content.Context r5 = r8.k
            if (r2 == 0) goto Lcf
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r6 = r5.getTheme()
            int r7 = androidx.appcompat.R.attr.actionBarTheme
            r6.resolveAttribute(r7, r2, r3)
            int r7 = r2.resourceId
            if (r7 == 0) goto L84
            android.content.res.Resources r7 = r5.getResources()
            android.content.res.Resources$Theme r7 = r7.newTheme()
            r7.setTo(r6)
            int r6 = r2.resourceId
            r7.applyStyle(r6, r3)
            a.Z3 r6 = new a.Z3
            r6.<init>(r5, r4)
            android.content.res.Resources$Theme r5 = r6.getTheme()
            r5.setTo(r7)
            r5 = r6
        L84:
            androidx.appcompat.widget.ActionBarContextView r6 = new androidx.appcompat.widget.ActionBarContextView
            r6.<init>(r5, r9)
            r8.v = r6
            android.widget.PopupWindow r6 = new android.widget.PopupWindow
            int r7 = androidx.appcompat.R.attr.actionModePopupWindowStyle
            r6.<init>(r5, r9, r7)
            r8.w = r6
            r7 = 2
            a.Ec.d(r6, r7)
            android.widget.PopupWindow r6 = r8.w
            androidx.appcompat.widget.ActionBarContextView r7 = r8.v
            r6.setContentView(r7)
            android.widget.PopupWindow r6 = r8.w
            r7 = -1
            r6.setWidth(r7)
            android.content.res.Resources$Theme r6 = r5.getTheme()
            int r7 = androidx.appcompat.R.attr.actionBarSize
            r6.resolveAttribute(r7, r2, r3)
            int r2 = r2.data
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r2 = android.util.TypedValue.complexToDimensionPixelSize(r2, r5)
            androidx.appcompat.widget.ActionBarContextView r5 = r8.v
            r5.setContentHeight(r2)
            android.widget.PopupWindow r2 = r8.w
            r5 = -2
            r2.setHeight(r5)
            a.T0 r2 = new a.T0
            r2.<init>(r8)
            r8.x = r2
            goto Lfb
        Lcf:
            android.view.ViewGroup r2 = r8.B
            int r6 = androidx.appcompat.R.id.action_mode_bar_stub
            android.view.View r2 = r2.findViewById(r6)
            androidx.appcompat.widget.ViewStubCompat r2 = (androidx.appcompat.widget.ViewStubCompat) r2
            if (r2 == 0) goto Lfb
            r8.Q()
            a.L r6 = r8.o
            if (r6 == 0) goto Le7
            android.content.Context r6 = r6.e()
            goto Le8
        Le7:
            r6 = r9
        Le8:
            if (r6 != 0) goto Leb
            goto Lec
        Leb:
            r5 = r6
        Lec:
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r2.setLayoutInflater(r5)
            android.view.View r2 = r2.a()
            androidx.appcompat.widget.ActionBarContextView r2 = (androidx.appcompat.widget.ActionBarContextView) r2
            r8.v = r2
        Lfb:
            androidx.appcompat.widget.ActionBarContextView r2 = r8.v
            if (r2 == 0) goto L1a0
            a.Jg r2 = r8.y
            if (r2 == 0) goto L106
            r2.b()
        L106:
            androidx.appcompat.widget.ActionBarContextView r2 = r8.v
            r2.h()
            a.re r2 = new a.re
            androidx.appcompat.widget.ActionBarContextView r5 = r8.v
            android.content.Context r5 = r5.getContext()
            androidx.appcompat.widget.ActionBarContextView r6 = r8.v
            r2.<init>()
            r2.c = r5
            r2.d = r6
            r2.e = r0
            androidx.appcompat.view.menu.f r5 = new androidx.appcompat.view.menu.f
            android.content.Context r6 = r6.getContext()
            r5.<init>(r6)
            r5.l = r3
            r2.h = r5
            r5.e = r2
            a.P$a r0 = r0.f217a
            boolean r0 = r0.a(r2, r5)
            if (r0 == 0) goto L19e
            r2.i()
            androidx.appcompat.widget.ActionBarContextView r9 = r8.v
            r9.f(r2)
            r8.u = r2
            boolean r9 = r8.A
            if (r9 == 0) goto L14e
            android.view.ViewGroup r9 = r8.B
            if (r9 == 0) goto L14e
            boolean r9 = r9.isLaidOut()
            if (r9 == 0) goto L14e
            goto L14f
        L14e:
            r3 = r4
        L14f:
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L16d
            androidx.appcompat.widget.ActionBarContextView r0 = r8.v
            r2 = 0
            r0.setAlpha(r2)
            androidx.appcompat.widget.ActionBarContextView r0 = r8.v
            a.Jg r0 = a.C0414ug.a(r0)
            r0.a(r9)
            r8.y = r0
            a.U0 r9 = new a.U0
            r9.<init>(r8)
            r0.d(r9)
            goto L18e
        L16d:
            androidx.appcompat.widget.ActionBarContextView r0 = r8.v
            r0.setAlpha(r9)
            androidx.appcompat.widget.ActionBarContextView r9 = r8.v
            r9.setVisibility(r4)
            androidx.appcompat.widget.ActionBarContextView r9 = r8.v
            android.view.ViewParent r9 = r9.getParent()
            boolean r9 = r9 instanceof android.view.View
            if (r9 == 0) goto L18e
            androidx.appcompat.widget.ActionBarContextView r9 = r8.v
            android.view.ViewParent r9 = r9.getParent()
            android.view.View r9 = (android.view.View) r9
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            a.C0414ug.c.c(r9)
        L18e:
            android.widget.PopupWindow r9 = r8.w
            if (r9 == 0) goto L1a0
            android.view.Window r9 = r8.l
            android.view.View r9 = r9.getDecorView()
            a.T0 r0 = r8.x
            r9.post(r0)
            goto L1a0
        L19e:
            r8.u = r9
        L1a0:
            a.P r9 = r8.u
            if (r9 == 0) goto L1a9
            if (r1 == 0) goto L1a9
            r1.onSupportActionModeStarted(r9)
        L1a9:
            r8.Y()
            a.P r9 = r8.u
            r8.u = r9
        L1b0:
            r8.Y()
            a.P r9 = r8.u
            return r9
        L1b6:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ActionMode callback can not be null."
            r9.<init>(r0)
            throw r9
    }

    public final boolean D(boolean r17, boolean r18) {
            r16 = this;
            r1 = r16
            boolean r0 = r1.R
            r2 = 0
            if (r0 == 0) goto L8
            return r2
        L8:
            int r0 = r1.T
            r3 = -100
            if (r0 == r3) goto L10
        Le:
            r3 = r0
            goto L13
        L10:
            int r0 = a.O0.b
            goto Le
        L13:
            android.content.Context r4 = r1.k
            int r5 = r1.S(r4, r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 33
            r7 = 0
            if (r0 >= r6) goto L25
            a.J9 r6 = F(r4)
            goto L26
        L25:
            r6 = r7
        L26:
            if (r18 != 0) goto L36
            if (r6 == 0) goto L36
            android.content.res.Resources r6 = r4.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            a.J9 r6 = a.Q0.f.b(r6)
        L36:
            android.content.res.Configuration r8 = J(r4, r5, r6, r7, r2)
            boolean r9 = r1.W
            java.lang.Object r10 = r1.j
            r11 = 1
            if (r9 != 0) goto L74
            boolean r9 = r10 instanceof android.app.Activity
            if (r9 == 0) goto L74
            android.content.pm.PackageManager r9 = r4.getPackageManager()
            if (r9 != 0) goto L4d
            r0 = r2
            goto L78
        L4d:
            r12 = 29
            if (r0 < r12) goto L54
            r0 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L56
        L54:
            r0 = 786432(0xc0000, float:1.102026E-39)
        L56:
            android.content.ComponentName r12 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6a
            java.lang.Class r13 = r10.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6a
            r12.<init>(r4, r13)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6a
            android.content.pm.ActivityInfo r0 = r9.getActivityInfo(r12, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6a
            if (r0 == 0) goto L74
            int r0 = r0.configChanges     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6a
            r1.V = r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L6a
            goto L74
        L6a:
            r0 = move-exception
            java.lang.String r9 = "AppCompatDelegate"
            java.lang.String r12 = "Exception while getting ActivityInfo"
            android.util.Log.d(r9, r12, r0)
            r1.V = r2
        L74:
            r1.W = r11
            int r0 = r1.V
        L78:
            android.content.res.Configuration r9 = r1.S
            if (r9 != 0) goto L84
            android.content.res.Resources r9 = r4.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
        L84:
            int r12 = r9.uiMode
            r12 = r12 & 48
            int r13 = r8.uiMode
            r13 = r13 & 48
            a.J9 r9 = a.Q0.f.b(r9)
            if (r6 != 0) goto L94
            r14 = r7
            goto L98
        L94:
            a.J9 r14 = a.Q0.f.b(r8)
        L98:
            if (r12 == r13) goto L9d
            r12 = 512(0x200, float:7.17E-43)
            goto L9e
        L9d:
            r12 = r2
        L9e:
            if (r14 == 0) goto La8
            boolean r9 = r9.equals(r14)
            if (r9 != 0) goto La8
            r12 = r12 | 8196(0x2004, float:1.1485E-41)
        La8:
            int r9 = ~r0
            r9 = r9 & r12
            if (r9 == 0) goto Le5
            if (r17 == 0) goto Le5
            boolean r9 = r1.P
            if (r9 == 0) goto Le5
            boolean r9 = a.Q0.k0
            if (r9 != 0) goto Lba
            boolean r9 = r1.Q
            if (r9 == 0) goto Le5
        Lba:
            boolean r9 = r10 instanceof android.app.Activity
            if (r9 == 0) goto Le5
            r9 = r10
            android.app.Activity r9 = (android.app.Activity) r9
            boolean r15 = r9.isChild()
            if (r15 != 0) goto Le5
            int r15 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r15 < r2) goto Le0
            r2 = r12 & 8192(0x2000, float:1.148E-41)
            if (r2 == 0) goto Le0
            android.view.Window r2 = r9.getWindow()
            android.view.View r2 = r2.getDecorView()
            int r8 = r8.getLayoutDirection()
            r2.setLayoutDirection(r8)
        Le0:
            r9.recreate()
            r2 = r11
            goto Le6
        Le5:
            r2 = 0
        Le6:
            if (r2 != 0) goto L150
            if (r12 == 0) goto L150
            r0 = r0 & r12
            if (r0 != r12) goto Lef
            r2 = r11
            goto Lf0
        Lef:
            r2 = 0
        Lf0:
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Configuration r8 = new android.content.res.Configuration
            android.content.res.Configuration r9 = r0.getConfiguration()
            r8.<init>(r9)
            android.content.res.Configuration r9 = r0.getConfiguration()
            int r9 = r9.uiMode
            r9 = r9 & (-49)
            r9 = r9 | r13
            r8.uiMode = r9
            if (r14 == 0) goto L10d
            a.Q0.f.d(r8, r14)
        L10d:
            r0.updateConfiguration(r8, r7)
            int r0 = r1.U
            if (r0 == 0) goto L120
            r4.setTheme(r0)
            android.content.res.Resources$Theme r0 = r4.getTheme()
            int r7 = r1.U
            r0.applyStyle(r7, r11)
        L120:
            if (r2 == 0) goto L151
            boolean r0 = r10 instanceof android.app.Activity
            if (r0 == 0) goto L151
            r0 = r10
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r0 instanceof a.InterfaceC0479y9
            if (r2 == 0) goto L144
            r2 = r0
            a.y9 r2 = (a.InterfaceC0479y9) r2
            androidx.lifecycle.e r2 = r2.getLifecycle()
            androidx.lifecycle.e$b r2 = r2.b()
            androidx.lifecycle.e$b r7 = androidx.lifecycle.e.b.c
            int r2 = r2.compareTo(r7)
            if (r2 < 0) goto L151
            r0.onConfigurationChanged(r8)
            goto L151
        L144:
            boolean r2 = r1.Q
            if (r2 == 0) goto L151
            boolean r2 = r1.R
            if (r2 != 0) goto L151
            r0.onConfigurationChanged(r8)
            goto L151
        L150:
            r11 = r2
        L151:
            if (r11 == 0) goto L16a
            boolean r0 = r10 instanceof a.E0
            if (r0 == 0) goto L16a
            r0 = r12 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L161
            r0 = r10
            a.E0 r0 = (a.E0) r0
            r0.onNightModeChanged(r5)
        L161:
            r0 = r12 & 4
            if (r0 == 0) goto L16a
            a.E0 r10 = (a.E0) r10
            r10.onLocalesChanged(r6)
        L16a:
            if (r14 == 0) goto L17b
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            a.J9 r0 = a.Q0.f.b(r0)
            a.Q0.f.c(r0)
        L17b:
            if (r3 != 0) goto L185
            a.Q0$j r0 = r1.O(r4)
            r0.e()
            goto L18c
        L185:
            a.Q0$k r0 = r1.X
            if (r0 == 0) goto L18c
            r0.a()
        L18c:
            r0 = 3
            if (r3 != r0) goto L1a0
            a.Q0$i r0 = r1.Y
            if (r0 != 0) goto L19a
            a.Q0$i r0 = new a.Q0$i
            r0.<init>(r1, r4)
            r1.Y = r0
        L19a:
            a.Q0$i r0 = r1.Y
            r0.e()
            goto L1a7
        L1a0:
            a.Q0$i r0 = r1.Y
            if (r0 == 0) goto L1a7
            r0.a()
        L1a7:
            return r11
    }

    public final void E(android.view.Window r8) {
            r7 = this;
            android.view.Window r0 = r7.l
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L80
            android.view.Window$Callback r0 = r8.getCallback()
            boolean r2 = r0 instanceof a.Q0.h
            if (r2 != 0) goto L7a
            a.Q0$h r1 = new a.Q0$h
            r1.<init>(r7, r0)
            r7.m = r1
            r8.setCallback(r1)
            android.content.Context r0 = r7.k
            int[] r1 = a.Q0.j0
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            a.Y0 r4 = a.Y0.a()
            monitor-enter(r4)
            a.pd r5 = r4.f347a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r0 = r5.d(r0, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r8
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L45
            r8.setBackgroundDrawable(r0)
        L45:
            r1.recycle()
            r7.l = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.g0
            if (r8 != 0) goto L79
            if (r8 == 0) goto L5f
            android.window.OnBackInvokedCallback r0 = r7.h0
            if (r0 == 0) goto L5f
            a.Q0.g.c(r8, r0)
            r7.h0 = r2
        L5f:
            java.lang.Object r8 = r7.j
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L74
            android.app.Activity r8 = (android.app.Activity) r8
            android.view.Window r0 = r8.getWindow()
            if (r0 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = a.Q0.g.a(r8)
            r7.g0 = r8
            goto L76
        L74:
            r7.g0 = r2
        L76:
            r7.Y()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
    }

    public final void G(int r4, a.Q0.m r5, androidx.appcompat.view.menu.f r6) {
            r3 = this;
            if (r6 != 0) goto L11
            if (r5 != 0) goto Ld
            if (r4 < 0) goto Ld
            a.Q0$m[] r0 = r3.M
            int r1 = r0.length
            if (r4 >= r1) goto Ld
            r5 = r0[r4]
        Ld:
            if (r5 == 0) goto L11
            androidx.appcompat.view.menu.f r6 = r5.h
        L11:
            if (r5 == 0) goto L18
            boolean r5 = r5.m
            if (r5 != 0) goto L18
            goto L35
        L18:
            boolean r5 = r3.R
            if (r5 != 0) goto L35
            a.Q0$h r5 = r3.m
            android.view.Window r0 = r3.l
            android.view.Window$Callback r0 = r0.getCallback()
            r5.getClass()
            r1 = 1
            r2 = 0
            r5.e = r1     // Catch: java.lang.Throwable -> L31
            r0.onPanelClosed(r4, r6)     // Catch: java.lang.Throwable -> L31
            r5.e = r2
            return
        L31:
            r4 = move-exception
            r5.e = r2
            throw r4
        L35:
            return
    }

    public final void H(androidx.appcompat.view.menu.f r3) {
            r2 = this;
            boolean r0 = r2.L
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.L = r0
            a.M4 r0 = r2.r
            r0.l()
            android.view.Window r0 = r2.l
            android.view.Window$Callback r0 = r0.getCallback()
            if (r0 == 0) goto L1e
            boolean r1 = r2.R
            if (r1 != 0) goto L1e
            r1 = 108(0x6c, float:1.51E-43)
            r0.onPanelClosed(r1, r3)
        L1e:
            r3 = 0
            r2.L = r3
            return
    }

    public final void I(a.Q0.m r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L16
            int r0 = r4.f220a
            if (r0 != 0) goto L16
            a.M4 r0 = r3.r
            if (r0 == 0) goto L16
            boolean r0 = r0.b()
            if (r0 == 0) goto L16
            androidx.appcompat.view.menu.f r4 = r4.h
            r3.H(r4)
            return
        L16:
            android.content.Context r0 = r3.k
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r1 = 0
            if (r0 == 0) goto L35
            boolean r2 = r4.m
            if (r2 == 0) goto L35
            a.Q0$l r2 = r4.e
            if (r2 == 0) goto L35
            r0.removeView(r2)
            if (r5 == 0) goto L35
            int r5 = r4.f220a
            r3.G(r5, r4, r1)
        L35:
            r5 = 0
            r4.k = r5
            r4.l = r5
            r4.m = r5
            r4.f = r1
            r5 = 1
            r4.n = r5
            a.Q0$m r5 = r3.N
            if (r5 != r4) goto L47
            r3.N = r1
        L47:
            int r4 = r4.f220a
            if (r4 != 0) goto L4e
            r3.Y()
        L4e:
            return
    }

    public final boolean K(android.view.KeyEvent r7) {
            r6 = this;
            java.lang.Object r0 = r6.j
            boolean r1 = r0 instanceof a.InterfaceC0389t9
            if (r1 != 0) goto La
            boolean r0 = r0 instanceof a.X0
            if (r0 == 0) goto L14
        La:
            android.view.Window r0 = r6.l
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L14
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
        L14:
            int r0 = r7.getKeyCode()
            r1 = 0
            r2 = 82
            r3 = 1
            if (r0 != r2) goto L39
            a.Q0$h r0 = r6.m
            android.view.Window r4 = r6.l
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.d = r3     // Catch: java.lang.Throwable -> L35
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch: java.lang.Throwable -> L35
            r0.d = r1
            if (r4 == 0) goto L39
            goto Lf7
        L35:
            r7 = move-exception
            r0.d = r1
            throw r7
        L39:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            r5 = 4
            if (r4 != 0) goto L69
            if (r0 == r5) goto L5c
            if (r0 == r2) goto L4a
            goto Lf8
        L4a:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto Lf7
            a.Q0$m r0 = r6.P(r1)
            boolean r1 = r0.m
            if (r1 != 0) goto Lf7
            r6.W(r0, r7)
            return r3
        L5c:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L65
            goto L66
        L65:
            r3 = r1
        L66:
            r6.O = r3
            return r1
        L69:
            if (r0 == r5) goto Lf1
            if (r0 == r2) goto L6f
            goto Lf8
        L6f:
            a.P r0 = r6.u
            if (r0 == 0) goto L75
            goto Lf7
        L75:
            a.Q0$m r0 = r6.P(r1)
            a.M4 r2 = r6.r
            android.content.Context r4 = r6.k
            if (r2 == 0) goto Laf
            boolean r2 = r2.h()
            if (r2 == 0) goto Laf
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r4)
            boolean r2 = r2.hasPermanentMenuKey()
            if (r2 != 0) goto Laf
            a.M4 r2 = r6.r
            boolean r2 = r2.b()
            if (r2 != 0) goto La8
            boolean r2 = r6.R
            if (r2 != 0) goto Lcf
            boolean r7 = r6.W(r0, r7)
            if (r7 == 0) goto Lcf
            a.M4 r7 = r6.r
            boolean r7 = r7.f()
            goto Ld5
        La8:
            a.M4 r7 = r6.r
            boolean r7 = r7.d()
            goto Ld5
        Laf:
            boolean r2 = r0.m
            if (r2 != 0) goto Ld1
            boolean r5 = r0.l
            if (r5 == 0) goto Lb8
            goto Ld1
        Lb8:
            boolean r2 = r0.k
            if (r2 == 0) goto Lcf
            boolean r2 = r0.o
            if (r2 == 0) goto Lc7
            r0.k = r1
            boolean r2 = r6.W(r0, r7)
            goto Lc8
        Lc7:
            r2 = r3
        Lc8:
            if (r2 == 0) goto Lcf
            r6.U(r0, r7)
            r7 = r3
            goto Ld5
        Lcf:
            r7 = r1
            goto Ld5
        Ld1:
            r6.I(r0, r3)
            r7 = r2
        Ld5:
            if (r7 == 0) goto Lf7
            android.content.Context r7 = r4.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto Le9
            r7.playSoundEffect(r1)
            return r3
        Le9:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            return r3
        Lf1:
            boolean r7 = r6.T()
            if (r7 == 0) goto Lf8
        Lf7:
            return r3
        Lf8:
            return r1
    }

    public final void L(int r4) {
            r3 = this;
            a.Q0$m r0 = r3.P(r4)
            androidx.appcompat.view.menu.f r1 = r0.h
            if (r1 == 0) goto L24
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            androidx.appcompat.view.menu.f r2 = r0.h
            r2.t(r1)
            int r2 = r1.size()
            if (r2 <= 0) goto L1a
            r0.p = r1
        L1a:
            androidx.appcompat.view.menu.f r1 = r0.h
            r1.w()
            androidx.appcompat.view.menu.f r1 = r0.h
            r1.clear()
        L24:
            r1 = 1
            r0.o = r1
            r0.n = r1
            r0 = 108(0x6c, float:1.51E-43)
            if (r4 == r0) goto L2f
            if (r4 != 0) goto L3e
        L2f:
            a.M4 r4 = r3.r
            if (r4 == 0) goto L3e
            r4 = 0
            a.Q0$m r0 = r3.P(r4)
            r0.k = r4
            r4 = 0
            r3.W(r0, r4)
        L3e:
            return
    }

    public final void M() {
            r10 = this;
            boolean r0 = r10.A
            if (r0 != 0) goto L290
            int[] r0 = androidx.appcompat.R.styleable.AppCompatTheme
            android.content.Context r1 = r10.k
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r0)
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar
            boolean r2 = r0.hasValue(r2)
            if (r2 == 0) goto L285
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowNoTitle
            r3 = 0
            boolean r2 = r0.getBoolean(r2, r3)
            r4 = 108(0x6c, float:1.51E-43)
            r5 = 1
            if (r2 == 0) goto L24
            r10.v(r5)
            goto L2f
        L24:
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar
            boolean r2 = r0.getBoolean(r2, r3)
            if (r2 == 0) goto L2f
            r10.v(r4)
        L2f:
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay
            boolean r2 = r0.getBoolean(r2, r3)
            r6 = 109(0x6d, float:1.53E-43)
            if (r2 == 0) goto L3c
            r10.v(r6)
        L3c:
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay
            boolean r2 = r0.getBoolean(r2, r3)
            if (r2 == 0) goto L49
            r2 = 10
            r10.v(r2)
        L49:
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_android_windowIsFloating
            boolean r2 = r0.getBoolean(r2, r3)
            r10.J = r2
            r0.recycle()
            r10.N()
            android.view.Window r0 = r10.l
            r0.getDecorView()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r1)
            boolean r2 = r10.K
            r7 = 0
            if (r2 != 0) goto Ld5
            boolean r2 = r10.J
            if (r2 == 0) goto L77
            int r2 = androidx.appcompat.R.layout.abc_dialog_title_material
            android.view.View r0 = r0.inflate(r2, r7)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r10.H = r3
            r10.G = r3
            goto Lea
        L77:
            boolean r0 = r10.G
            if (r0 == 0) goto Ld3
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r2 = r1.getTheme()
            int r8 = androidx.appcompat.R.attr.actionBarTheme
            r2.resolveAttribute(r8, r0, r5)
            int r2 = r0.resourceId
            if (r2 == 0) goto L95
            a.Z3 r2 = new a.Z3
            int r0 = r0.resourceId
            r2.<init>(r1, r0)
            goto L96
        L95:
            r2 = r1
        L96:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r2)
            int r2 = androidx.appcompat.R.layout.abc_screen_toolbar
            android.view.View r0 = r0.inflate(r2, r7)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = androidx.appcompat.R.id.decor_content_parent
            android.view.View r2 = r0.findViewById(r2)
            a.M4 r2 = (a.M4) r2
            r10.r = r2
            android.view.Window r8 = r10.l
            android.view.Window$Callback r8 = r8.getCallback()
            r2.setWindowCallback(r8)
            boolean r2 = r10.H
            if (r2 == 0) goto Lbe
            a.M4 r2 = r10.r
            r2.k(r6)
        Lbe:
            boolean r2 = r10.E
            if (r2 == 0) goto Lc8
            a.M4 r2 = r10.r
            r6 = 2
            r2.k(r6)
        Lc8:
            boolean r2 = r10.F
            if (r2 == 0) goto Lea
            a.M4 r2 = r10.r
            r6 = 5
            r2.k(r6)
            goto Lea
        Ld3:
            r0 = r7
            goto Lea
        Ld5:
            boolean r2 = r10.I
            if (r2 == 0) goto Le2
            int r2 = androidx.appcompat.R.layout.abc_screen_simple_overlay_action_mode
            android.view.View r0 = r0.inflate(r2, r7)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto Lea
        Le2:
            int r2 = androidx.appcompat.R.layout.abc_screen_simple
            android.view.View r0 = r0.inflate(r2, r7)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        Lea:
            if (r0 == 0) goto L242
            a.R0 r2 = new a.R0
            r2.<init>(r10)
            java.util.WeakHashMap<android.view.View, a.Jg> r6 = a.C0414ug.f721a
            a.C0414ug.d.u(r0, r2)
            a.M4 r2 = r10.r
            if (r2 != 0) goto L104
            int r2 = androidx.appcompat.R.id.title
            android.view.View r2 = r0.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r10.C = r2
        L104:
            java.lang.String r2 = "Could not invoke makeOptionalFitsSystemWindows"
            java.lang.String r6 = "ViewUtils"
            java.lang.Class r8 = r0.getClass()     // Catch: java.lang.IllegalAccessException -> L11c java.lang.reflect.InvocationTargetException -> L11e java.lang.NoSuchMethodException -> L12c
            java.lang.String r9 = "makeOptionalFitsSystemWindows"
            java.lang.reflect.Method r8 = r8.getMethod(r9, r7)     // Catch: java.lang.IllegalAccessException -> L11c java.lang.reflect.InvocationTargetException -> L11e java.lang.NoSuchMethodException -> L12c
            boolean r9 = r8.isAccessible()     // Catch: java.lang.IllegalAccessException -> L11c java.lang.reflect.InvocationTargetException -> L11e java.lang.NoSuchMethodException -> L12c
            if (r9 != 0) goto L120
            r8.setAccessible(r5)     // Catch: java.lang.IllegalAccessException -> L11c java.lang.reflect.InvocationTargetException -> L11e java.lang.NoSuchMethodException -> L12c
            goto L120
        L11c:
            r8 = move-exception
            goto L124
        L11e:
            r8 = move-exception
            goto L128
        L120:
            r8.invoke(r0, r7)     // Catch: java.lang.IllegalAccessException -> L11c java.lang.reflect.InvocationTargetException -> L11e java.lang.NoSuchMethodException -> L12c
            goto L131
        L124:
            android.util.Log.d(r6, r2, r8)
            goto L131
        L128:
            android.util.Log.d(r6, r2, r8)
            goto L131
        L12c:
            java.lang.String r2 = "Could not find method makeOptionalFitsSystemWindows. Oh well..."
            android.util.Log.d(r6, r2)
        L131:
            int r2 = androidx.appcompat.R.id.action_bar_activity_content
            android.view.View r2 = r0.findViewById(r2)
            androidx.appcompat.widget.ContentFrameLayout r2 = (androidx.appcompat.widget.ContentFrameLayout) r2
            android.view.Window r6 = r10.l
            r8 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r6 = r6.findViewById(r8)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            if (r6 == 0) goto L167
        L146:
            int r9 = r6.getChildCount()
            if (r9 <= 0) goto L157
            android.view.View r9 = r6.getChildAt(r3)
            r6.removeViewAt(r3)
            r2.addView(r9)
            goto L146
        L157:
            r9 = -1
            r6.setId(r9)
            r2.setId(r8)
            boolean r9 = r6 instanceof android.widget.FrameLayout
            if (r9 == 0) goto L167
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r6.setForeground(r7)
        L167:
            android.view.Window r6 = r10.l
            r6.setContentView(r0)
            a.S0 r6 = new a.S0
            r6.<init>(r10)
            r2.setAttachListener(r6)
            r10.B = r0
            java.lang.Object r0 = r10.j
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L183
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.CharSequence r0 = r0.getTitle()
            goto L185
        L183:
            java.lang.CharSequence r0 = r10.q
        L185:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L1a2
            a.M4 r2 = r10.r
            if (r2 == 0) goto L193
            r2.setWindowTitle(r0)
            goto L1a2
        L193:
            a.L r2 = r10.o
            if (r2 == 0) goto L19b
            r2.n(r0)
            goto L1a2
        L19b:
            android.widget.TextView r2 = r10.C
            if (r2 == 0) goto L1a2
            r2.setText(r0)
        L1a2:
            android.view.ViewGroup r0 = r10.B
            android.view.View r0 = r0.findViewById(r8)
            androidx.appcompat.widget.ContentFrameLayout r0 = (androidx.appcompat.widget.ContentFrameLayout) r0
            android.view.Window r2 = r10.l
            android.view.View r2 = r2.getDecorView()
            int r6 = r2.getPaddingLeft()
            int r7 = r2.getPaddingTop()
            int r8 = r2.getPaddingRight()
            int r2 = r2.getPaddingBottom()
            android.graphics.Rect r9 = r0.g
            r9.set(r6, r7, r8, r2)
            boolean r2 = r0.isLaidOut()
            if (r2 == 0) goto L1ce
            r0.requestLayout()
        L1ce:
            int[] r2 = androidx.appcompat.R.styleable.AppCompatTheme
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2)
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMajor
            android.util.TypedValue r6 = r0.getMinWidthMajor()
            r1.getValue(r2, r6)
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowMinWidthMinor
            android.util.TypedValue r6 = r0.getMinWidthMinor()
            r1.getValue(r2, r6)
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L1f7
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMajor
            android.util.TypedValue r6 = r0.getFixedWidthMajor()
            r1.getValue(r2, r6)
        L1f7:
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L208
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedWidthMinor
            android.util.TypedValue r6 = r0.getFixedWidthMinor()
            r1.getValue(r2, r6)
        L208:
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L219
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMajor
            android.util.TypedValue r6 = r0.getFixedHeightMajor()
            r1.getValue(r2, r6)
        L219:
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L22a
            int r2 = androidx.appcompat.R.styleable.AppCompatTheme_windowFixedHeightMinor
            android.util.TypedValue r6 = r0.getFixedHeightMinor()
            r1.getValue(r2, r6)
        L22a:
            r1.recycle()
            r0.requestLayout()
            r10.A = r5
            a.Q0$m r0 = r10.P(r3)
            boolean r1 = r10.R
            if (r1 != 0) goto L290
            androidx.appcompat.view.menu.f r0 = r0.h
            if (r0 != 0) goto L290
            r10.R(r4)
            goto L290
        L242:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "AppCompat does not support the current theme features: { windowActionBar: "
            r1.<init>(r2)
            boolean r2 = r10.G
            r1.append(r2)
            java.lang.String r2 = ", windowActionBarOverlay: "
            r1.append(r2)
            boolean r2 = r10.H
            r1.append(r2)
            java.lang.String r2 = ", android:windowIsFloating: "
            r1.append(r2)
            boolean r2 = r10.J
            r1.append(r2)
            java.lang.String r2 = ", windowActionModeOverlay: "
            r1.append(r2)
            boolean r2 = r10.I
            r1.append(r2)
            java.lang.String r2 = ", windowNoTitle: "
            r1.append(r2)
            boolean r2 = r10.K
            r1.append(r2)
            java.lang.String r2 = " }"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L285:
            r0.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You need to use a Theme.AppCompat theme (or descendant) with this activity."
            r0.<init>(r1)
            throw r0
        L290:
            return
    }

    public final void N() {
            r2 = this;
            android.view.Window r0 = r2.l
            if (r0 != 0) goto L13
            java.lang.Object r0 = r2.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L13
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            r2.E(r0)
        L13:
            android.view.Window r0 = r2.l
            if (r0 == 0) goto L18
            return
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "We have not been given a Window"
            r0.<init>(r1)
            throw r0
    }

    public final a.Q0.j O(android.content.Context r4) {
            r3 = this;
            a.Q0$k r0 = r3.X
            if (r0 != 0) goto L24
            a.Q0$k r0 = new a.Q0$k
            a.Jf r1 = a.Jf.d
            if (r1 != 0) goto L1d
            android.content.Context r4 = r4.getApplicationContext()
            a.Jf r1 = new a.Jf
            java.lang.String r2 = "location"
            java.lang.Object r2 = r4.getSystemService(r2)
            android.location.LocationManager r2 = (android.location.LocationManager) r2
            r1.<init>(r4, r2)
            a.Jf.d = r1
        L1d:
            a.Jf r4 = a.Jf.d
            r0.<init>(r3, r4)
            r3.X = r0
        L24:
            a.Q0$k r4 = r3.X
            return r4
    }

    public final a.Q0.m P(int r5) {
            r4 = this;
            a.Q0$m[] r0 = r4.M
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r5) goto L15
        L8:
            int r2 = r5 + 1
            a.Q0$m[] r2 = new a.Q0.m[r2]
            if (r0 == 0) goto L12
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L12:
            r4.M = r2
            r0 = r2
        L15:
            r2 = r0[r5]
            if (r2 != 0) goto L24
            a.Q0$m r2 = new a.Q0$m
            r2.<init>()
            r2.f220a = r5
            r2.n = r1
            r0[r5] = r2
        L24:
            return r2
    }

    public final void Q() {
            r3 = this;
            r3.M()
            boolean r0 = r3.G
            if (r0 == 0) goto L34
            a.L r0 = r3.o
            if (r0 == 0) goto Lc
            goto L34
        Lc:
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1e
            a.lh r1 = new a.lh
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.H
            r1.<init>(r0, r2)
            r3.o = r1
            goto L2b
        L1e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L2b
            a.lh r1 = new a.lh
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            r3.o = r1
        L2b:
            a.L r0 = r3.o
            if (r0 == 0) goto L34
            boolean r1 = r3.c0
            r0.l(r1)
        L34:
            return
    }

    public final void R(int r3) {
            r2 = this;
            int r0 = r2.a0
            r1 = 1
            int r3 = r1 << r3
            r3 = r3 | r0
            r2.a0 = r3
            boolean r3 = r2.Z
            if (r3 != 0) goto L1b
            android.view.Window r3 = r2.l
            android.view.View r3 = r3.getDecorView()
            java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
            a.Q0$a r0 = r2.b0
            r3.postOnAnimation(r0)
            r2.Z = r1
        L1b:
            return
    }

    public final int S(android.content.Context r3, int r4) {
            r2 = this;
            r0 = -100
            r1 = -1
            if (r4 == r0) goto L49
            if (r4 == r1) goto L48
            if (r4 == 0) goto L2c
            r0 = 1
            if (r4 == r0) goto L48
            r0 = 2
            if (r4 == r0) goto L48
            r0 = 3
            if (r4 != r0) goto L24
            a.Q0$i r4 = r2.Y
            if (r4 != 0) goto L1d
            a.Q0$i r4 = new a.Q0$i
            r4.<init>(r2, r3)
            r2.Y = r4
        L1d:
            a.Q0$i r3 = r2.Y
            int r3 = r3.c()
            return r3
        L24:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."
            r3.<init>(r4)
            throw r3
        L2c:
            android.content.Context r4 = r3.getApplicationContext()
            java.lang.String r0 = "uimode"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.app.UiModeManager r4 = (android.app.UiModeManager) r4
            int r4 = r4.getNightMode()
            if (r4 != 0) goto L3f
            goto L49
        L3f:
            a.Q0$j r3 = r2.O(r3)
            int r3 = r3.c()
            return r3
        L48:
            return r4
        L49:
            return r1
    }

    public final boolean T() {
            r5 = this;
            boolean r0 = r5.O
            r1 = 0
            r5.O = r1
            a.Q0$m r2 = r5.P(r1)
            boolean r3 = r2.m
            r4 = 1
            if (r3 == 0) goto L14
            if (r0 != 0) goto L29
            r5.I(r2, r4)
            return r4
        L14:
            a.P r0 = r5.u
            if (r0 == 0) goto L1c
            r0.c()
            return r4
        L1c:
            r5.Q()
            a.L r0 = r5.o
            if (r0 == 0) goto L2a
            boolean r0 = r0.b()
            if (r0 == 0) goto L2a
        L29:
            return r4
        L2a:
            return r1
    }

    public final void U(a.Q0.m r18, android.view.KeyEvent r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1.m
            if (r2 != 0) goto L1d8
            boolean r2 = r0.R
            if (r2 == 0) goto Le
            goto L1d8
        Le:
            int r2 = r1.f220a
            android.content.Context r3 = r0.k
            if (r2 != 0) goto L25
            android.content.res.Resources r4 = r3.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.screenLayout
            r4 = r4 & 15
            r5 = 4
            if (r4 != r5) goto L25
            goto L1d8
        L25:
            android.view.Window r4 = r0.l
            android.view.Window$Callback r4 = r4.getCallback()
            r5 = 1
            if (r4 == 0) goto L3a
            androidx.appcompat.view.menu.f r6 = r1.h
            boolean r4 = r4.onMenuOpened(r2, r6)
            if (r4 != 0) goto L3a
            r0.I(r1, r5)
            return
        L3a:
            java.lang.String r4 = "window"
            java.lang.Object r4 = r3.getSystemService(r4)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 != 0) goto L46
            goto L1d8
        L46:
            boolean r6 = r17.W(r18, r19)
            if (r6 != 0) goto L4e
            goto L1d8
        L4e:
            a.Q0$l r6 = r1.e
            r7 = 0
            r8 = -2
            if (r6 == 0) goto L6b
            boolean r9 = r1.n
            if (r9 == 0) goto L59
            goto L6b
        L59:
            android.view.View r3 = r1.g
            if (r3 == 0) goto L1b0
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 == 0) goto L1b0
            int r3 = r3.width
            r6 = -1
            if (r3 != r6) goto L1b0
            r10 = r6
            goto L1b1
        L6b:
            if (r6 != 0) goto Le5
            r0.Q()
            a.L r6 = r0.o
            if (r6 == 0) goto L79
            android.content.Context r6 = r6.e()
            goto L7a
        L79:
            r6 = 0
        L7a:
            if (r6 != 0) goto L7d
            goto L7e
        L7d:
            r3 = r6
        L7e:
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources r9 = r3.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            android.content.res.Resources$Theme r10 = r3.getTheme()
            r9.setTo(r10)
            int r10 = androidx.appcompat.R.attr.actionBarPopupTheme
            r9.resolveAttribute(r10, r6, r5)
            int r10 = r6.resourceId
            if (r10 == 0) goto L9e
            r9.applyStyle(r10, r5)
        L9e:
            int r10 = androidx.appcompat.R.attr.panelMenuListTheme
            r9.resolveAttribute(r10, r6, r5)
            int r6 = r6.resourceId
            if (r6 == 0) goto Lab
            r9.applyStyle(r6, r5)
            goto Lb0
        Lab:
            int r6 = androidx.appcompat.R.style.Theme_AppCompat_CompactMenu
            r9.applyStyle(r6, r5)
        Lb0:
            a.Z3 r6 = new a.Z3
            r6.<init>(r3, r7)
            android.content.res.Resources$Theme r3 = r6.getTheme()
            r3.setTo(r9)
            r1.j = r6
            int[] r3 = androidx.appcompat.R.styleable.AppCompatTheme
            android.content.res.TypedArray r3 = r6.obtainStyledAttributes(r3)
            int r6 = androidx.appcompat.R.styleable.AppCompatTheme_panelBackground
            int r6 = r3.getResourceId(r6, r7)
            r1.b = r6
            int r6 = androidx.appcompat.R.styleable.AppCompatTheme_android_windowAnimationStyle
            int r6 = r3.getResourceId(r6, r7)
            r1.d = r6
            r3.recycle()
            a.Q0$l r3 = new a.Q0$l
            a.Z3 r6 = r1.j
            r3.<init>(r0, r6)
            r1.e = r3
            r3 = 81
            r1.c = r3
            goto Lf4
        Le5:
            boolean r3 = r1.n
            if (r3 == 0) goto Lf4
            int r3 = r6.getChildCount()
            if (r3 <= 0) goto Lf4
            a.Q0$l r3 = r1.e
            r3.removeAllViews()
        Lf4:
            android.view.View r3 = r1.g
            if (r3 == 0) goto Lfb
            r1.f = r3
            goto L157
        Lfb:
            androidx.appcompat.view.menu.f r3 = r1.h
            if (r3 != 0) goto L101
            goto L1d6
        L101:
            a.Q0$n r3 = r0.t
            if (r3 != 0) goto L10c
            a.Q0$n r3 = new a.Q0$n
            r3.<init>(r0)
            r0.t = r3
        L10c:
            a.Q0$n r3 = r0.t
            androidx.appcompat.view.menu.d r6 = r1.i
            if (r6 != 0) goto L126
            androidx.appcompat.view.menu.d r6 = new androidx.appcompat.view.menu.d
            a.Z3 r9 = r1.j
            int r10 = androidx.appcompat.R.layout.abc_list_menu_item_layout
            r6.<init>(r9, r10)
            r1.i = r6
            r6.f = r3
            androidx.appcompat.view.menu.f r3 = r1.h
            android.content.Context r9 = r3.f822a
            r3.b(r6, r9)
        L126:
            androidx.appcompat.view.menu.d r3 = r1.i
            a.Q0$l r6 = r1.e
            androidx.appcompat.view.menu.ExpandedMenuView r9 = r3.d
            if (r9 != 0) goto L151
            android.view.LayoutInflater r9 = r3.b
            int r10 = androidx.appcompat.R.layout.abc_expanded_menu_layout
            android.view.View r6 = r9.inflate(r10, r6, r7)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = (androidx.appcompat.view.menu.ExpandedMenuView) r6
            r3.d = r6
            androidx.appcompat.view.menu.d$a r6 = r3.g
            if (r6 != 0) goto L145
            androidx.appcompat.view.menu.d$a r6 = new androidx.appcompat.view.menu.d$a
            r6.<init>(r3)
            r3.g = r6
        L145:
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r3.d
            androidx.appcompat.view.menu.d$a r9 = r3.g
            r6.setAdapter(r9)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r3.d
            r6.setOnItemClickListener(r3)
        L151:
            androidx.appcompat.view.menu.ExpandedMenuView r3 = r3.d
            r1.f = r3
            if (r3 == 0) goto L1d6
        L157:
            android.view.View r3 = r1.f
            if (r3 != 0) goto L15d
            goto L1d6
        L15d:
            android.view.View r3 = r1.g
            if (r3 == 0) goto L162
            goto L177
        L162:
            androidx.appcompat.view.menu.d r3 = r1.i
            androidx.appcompat.view.menu.d$a r6 = r3.g
            if (r6 != 0) goto L16f
            androidx.appcompat.view.menu.d$a r6 = new androidx.appcompat.view.menu.d$a
            r6.<init>(r3)
            r3.g = r6
        L16f:
            androidx.appcompat.view.menu.d$a r3 = r3.g
            int r3 = r3.getCount()
            if (r3 <= 0) goto L1d6
        L177:
            android.view.View r3 = r1.f
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 != 0) goto L184
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r3.<init>(r8, r8)
        L184:
            int r6 = r1.b
            a.Q0$l r9 = r1.e
            r9.setBackgroundResource(r6)
            android.view.View r6 = r1.f
            android.view.ViewParent r6 = r6.getParent()
            boolean r9 = r6 instanceof android.view.ViewGroup
            if (r9 == 0) goto L19c
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r9 = r1.f
            r6.removeView(r9)
        L19c:
            a.Q0$l r6 = r1.e
            android.view.View r9 = r1.f
            r6.addView(r9, r3)
            android.view.View r3 = r1.f
            boolean r3 = r3.hasFocus()
            if (r3 != 0) goto L1b0
            android.view.View r3 = r1.f
            r3.requestFocus()
        L1b0:
            r10 = r8
        L1b1:
            r1.l = r7
            android.view.WindowManager$LayoutParams r9 = new android.view.WindowManager$LayoutParams
            r13 = 0
            r14 = 1002(0x3ea, float:1.404E-42)
            r11 = -2
            r12 = 0
            r15 = 8519680(0x820000, float:1.1938615E-38)
            r16 = -3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            int r3 = r1.c
            r9.gravity = r3
            int r3 = r1.d
            r9.windowAnimations = r3
            a.Q0$l r3 = r1.e
            r4.addView(r3, r9)
            r1.m = r5
            if (r2 != 0) goto L1d8
            r0.Y()
            return
        L1d6:
            r1.n = r5
        L1d8:
            return
    }

    public final boolean V(a.Q0.m r3, int r4, android.view.KeyEvent r5) {
            r2 = this;
            boolean r0 = r5.isSystem()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r3.k
            if (r0 != 0) goto L12
            boolean r0 = r2.W(r3, r5)
            if (r0 == 0) goto L1b
        L12:
            androidx.appcompat.view.menu.f r3 = r3.h
            if (r3 == 0) goto L1b
            r0 = 1
            boolean r1 = r3.performShortcut(r4, r5, r0)
        L1b:
            return r1
    }

    public final boolean W(a.Q0.m r12, android.view.KeyEvent r13) {
            r11 = this;
            boolean r0 = r11.R
            r1 = 0
            if (r0 == 0) goto L7
            goto L10e
        L7:
            boolean r0 = r12.k
            r2 = 1
            if (r0 == 0) goto Ld
            return r2
        Ld:
            a.Q0$m r0 = r11.N
            if (r0 == 0) goto L16
            if (r0 == r12) goto L16
            r11.I(r0, r1)
        L16:
            android.view.Window r0 = r11.l
            android.view.Window$Callback r0 = r0.getCallback()
            int r3 = r12.f220a
            if (r0 == 0) goto L26
            android.view.View r4 = r0.onCreatePanelView(r3)
            r12.g = r4
        L26:
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == 0) goto L2f
            if (r3 != r4) goto L2d
            goto L2f
        L2d:
            r5 = r1
            goto L30
        L2f:
            r5 = r2
        L30:
            if (r5 == 0) goto L39
            a.M4 r6 = r11.r
            if (r6 == 0) goto L39
            r6.g()
        L39:
            android.view.View r6 = r12.g
            if (r6 != 0) goto L15b
            if (r5 == 0) goto L45
            a.L r6 = r11.o
            boolean r6 = r6 instanceof a.C0413uf
            if (r6 != 0) goto L15b
        L45:
            androidx.appcompat.view.menu.f r6 = r12.h
            r7 = 0
            if (r6 == 0) goto L4e
            boolean r8 = r12.o
            if (r8 == 0) goto L111
        L4e:
            if (r6 != 0) goto Ld0
            android.content.Context r6 = r11.k
            if (r3 == 0) goto L56
            if (r3 != r4) goto Lad
        L56:
            a.M4 r4 = r11.r
            if (r4 == 0) goto Lad
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r8 = r6.getTheme()
            int r9 = androidx.appcompat.R.attr.actionBarTheme
            r8.resolveAttribute(r9, r4, r2)
            int r9 = r4.resourceId
            if (r9 == 0) goto L82
            android.content.res.Resources r9 = r6.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            r9.setTo(r8)
            int r10 = r4.resourceId
            r9.applyStyle(r10, r2)
            int r10 = androidx.appcompat.R.attr.actionBarWidgetTheme
            r9.resolveAttribute(r10, r4, r2)
            goto L88
        L82:
            int r9 = androidx.appcompat.R.attr.actionBarWidgetTheme
            r8.resolveAttribute(r9, r4, r2)
            r9 = r7
        L88:
            int r10 = r4.resourceId
            if (r10 == 0) goto L9e
            if (r9 != 0) goto L99
            android.content.res.Resources r9 = r6.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            r9.setTo(r8)
        L99:
            int r4 = r4.resourceId
            r9.applyStyle(r4, r2)
        L9e:
            if (r9 == 0) goto Lad
            a.Z3 r4 = new a.Z3
            r4.<init>(r6, r1)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r9)
            r6 = r4
        Lad:
            androidx.appcompat.view.menu.f r4 = new androidx.appcompat.view.menu.f
            r4.<init>(r6)
            r4.e = r11
            androidx.appcompat.view.menu.f r6 = r12.h
            if (r4 != r6) goto Lb9
            goto Lcb
        Lb9:
            if (r6 == 0) goto Lc0
            androidx.appcompat.view.menu.d r8 = r12.i
            r6.r(r8)
        Lc0:
            r12.h = r4
            androidx.appcompat.view.menu.d r6 = r12.i
            if (r6 == 0) goto Lcb
            android.content.Context r8 = r4.f822a
            r4.b(r6, r8)
        Lcb:
            androidx.appcompat.view.menu.f r4 = r12.h
            if (r4 != 0) goto Ld0
            goto L10e
        Ld0:
            if (r5 == 0) goto Le8
            a.M4 r4 = r11.r
            if (r4 == 0) goto Le8
            a.Q0$c r6 = r11.s
            if (r6 != 0) goto Le1
            a.Q0$c r6 = new a.Q0$c
            r6.<init>(r11)
            r11.s = r6
        Le1:
            androidx.appcompat.view.menu.f r6 = r12.h
            a.Q0$c r8 = r11.s
            r4.e(r6, r8)
        Le8:
            androidx.appcompat.view.menu.f r4 = r12.h
            r4.w()
            androidx.appcompat.view.menu.f r4 = r12.h
            boolean r3 = r0.onCreatePanelMenu(r3, r4)
            if (r3 != 0) goto L10f
            androidx.appcompat.view.menu.f r13 = r12.h
            if (r13 != 0) goto Lfa
            goto L103
        Lfa:
            if (r13 == 0) goto L101
            androidx.appcompat.view.menu.d r0 = r12.i
            r13.r(r0)
        L101:
            r12.h = r7
        L103:
            if (r5 == 0) goto L10e
            a.M4 r12 = r11.r
            if (r12 == 0) goto L10e
            a.Q0$c r13 = r11.s
            r12.e(r7, r13)
        L10e:
            return r1
        L10f:
            r12.o = r1
        L111:
            androidx.appcompat.view.menu.f r3 = r12.h
            r3.w()
            android.os.Bundle r3 = r12.p
            if (r3 == 0) goto L121
            androidx.appcompat.view.menu.f r4 = r12.h
            r4.s(r3)
            r12.p = r7
        L121:
            android.view.View r3 = r12.g
            androidx.appcompat.view.menu.f r4 = r12.h
            boolean r0 = r0.onPreparePanel(r1, r3, r4)
            if (r0 != 0) goto L13c
            if (r5 == 0) goto L136
            a.M4 r13 = r11.r
            if (r13 == 0) goto L136
            a.Q0$c r0 = r11.s
            r13.e(r7, r0)
        L136:
            androidx.appcompat.view.menu.f r12 = r12.h
            r12.v()
            return r1
        L13c:
            if (r13 == 0) goto L143
            int r13 = r13.getDeviceId()
            goto L144
        L143:
            r13 = -1
        L144:
            android.view.KeyCharacterMap r13 = android.view.KeyCharacterMap.load(r13)
            int r13 = r13.getKeyboardType()
            if (r13 == r2) goto L150
            r13 = r2
            goto L151
        L150:
            r13 = r1
        L151:
            androidx.appcompat.view.menu.f r0 = r12.h
            r0.setQwertyMode(r13)
            androidx.appcompat.view.menu.f r13 = r12.h
            r13.v()
        L15b:
            r12.k = r2
            r12.l = r1
            r11.N = r12
            return r2
    }

    public final void X() {
            r2 = this;
            boolean r0 = r2.A
            if (r0 != 0) goto L5
            return
        L5:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.String r1 = "Window feature must be requested before adding content"
            r0.<init>(r1)
            throw r0
    }

    public final void Y() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L39
            android.window.OnBackInvokedDispatcher r0 = r3.g0
            r1 = 0
            if (r0 != 0) goto Lc
            goto L1c
        Lc:
            a.Q0$m r0 = r3.P(r1)
            boolean r0 = r0.m
            r2 = 1
            if (r0 == 0) goto L17
        L15:
            r1 = r2
            goto L1c
        L17:
            a.P r0 = r3.u
            if (r0 == 0) goto L1c
            goto L15
        L1c:
            if (r1 == 0) goto L2b
            android.window.OnBackInvokedCallback r0 = r3.h0
            if (r0 != 0) goto L2b
            android.window.OnBackInvokedDispatcher r0 = r3.g0
            android.window.OnBackInvokedCallback r0 = a.Q0.g.b(r0, r3)
            r3.h0 = r0
            return
        L2b:
            if (r1 != 0) goto L39
            android.window.OnBackInvokedCallback r0 = r3.h0
            if (r0 == 0) goto L39
            android.window.OnBackInvokedDispatcher r1 = r3.g0
            a.Q0.g.c(r1, r0)
            r0 = 0
            r3.h0 = r0
        L39:
            return
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final boolean a(androidx.appcompat.view.menu.f r8, android.view.MenuItem r9) {
            r7 = this;
            android.view.Window r0 = r7.l
            android.view.Window$Callback r0 = r0.getCallback()
            r1 = 0
            if (r0 == 0) goto L31
            boolean r2 = r7.R
            if (r2 != 0) goto L31
            androidx.appcompat.view.menu.f r8 = r8.k()
            a.Q0$m[] r2 = r7.M
            if (r2 == 0) goto L17
            int r3 = r2.length
            goto L18
        L17:
            r3 = r1
        L18:
            r4 = r1
        L19:
            if (r4 >= r3) goto L27
            r5 = r2[r4]
            if (r5 == 0) goto L24
            androidx.appcompat.view.menu.f r6 = r5.h
            if (r6 != r8) goto L24
            goto L28
        L24:
            int r4 = r4 + 1
            goto L19
        L27:
            r5 = 0
        L28:
            if (r5 == 0) goto L31
            int r8 = r5.f220a
            boolean r8 = r0.onMenuItemSelected(r8, r9)
            return r8
        L31:
            return r1
    }

    @Override // androidx.appcompat.view.menu.f.a
    public final void b(androidx.appcompat.view.menu.f r6) {
            r5 = this;
            a.M4 r6 = r5.r
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L7f
            boolean r6 = r6.h()
            if (r6 == 0) goto L7f
            android.content.Context r6 = r5.k
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L20
            a.M4 r6 = r5.r
            boolean r6 = r6.a()
            if (r6 == 0) goto L7f
        L20:
            android.view.Window r6 = r5.l
            android.view.Window$Callback r6 = r6.getCallback()
            a.M4 r2 = r5.r
            boolean r2 = r2.b()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L43
            a.M4 r0 = r5.r
            r0.d()
            boolean r0 = r5.R
            if (r0 != 0) goto L7e
            a.Q0$m r0 = r5.P(r1)
            androidx.appcompat.view.menu.f r0 = r0.h
            r6.onPanelClosed(r3, r0)
            return
        L43:
            if (r6 == 0) goto L7e
            boolean r2 = r5.R
            if (r2 != 0) goto L7e
            boolean r2 = r5.Z
            if (r2 == 0) goto L60
            int r2 = r5.a0
            r0 = r0 & r2
            if (r0 == 0) goto L60
            android.view.Window r0 = r5.l
            android.view.View r0 = r0.getDecorView()
            a.Q0$a r2 = r5.b0
            r0.removeCallbacks(r2)
            r2.run()
        L60:
            a.Q0$m r0 = r5.P(r1)
            androidx.appcompat.view.menu.f r2 = r0.h
            if (r2 == 0) goto L7e
            boolean r4 = r0.o
            if (r4 != 0) goto L7e
            android.view.View r4 = r0.g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto L7e
            androidx.appcompat.view.menu.f r0 = r0.h
            r6.onMenuOpened(r3, r0)
            a.M4 r6 = r5.r
            r6.f()
        L7e:
            return
        L7f:
            a.Q0$m r6 = r5.P(r1)
            r6.n = r0
            r5.I(r6, r1)
            r0 = 0
            r5.U(r6, r0)
            return
    }

    @Override // a.O0
    public final void c(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.M()
            android.view.ViewGroup r0 = r2.B
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r3, r4)
            a.Q0$h r3 = r2.m
            android.view.Window r4 = r2.l
            android.view.Window$Callback r4 = r4.getCallback()
            r3.a(r4)
            return
    }

    @Override // a.O0
    public final android.content.Context d(android.content.Context r10) {
            r9 = this;
            r0 = 0
            r1 = 1
            r9.P = r1
            int r2 = r9.T
            r3 = -100
            if (r2 == r3) goto Lb
            goto Ld
        Lb:
            int r2 = a.O0.b
        Ld:
            int r2 = r9.S(r10, r2)
            boolean r3 = a.O0.m(r10)
            if (r3 == 0) goto L79
            boolean r3 = a.O0.m(r10)
            if (r3 != 0) goto L1e
            goto L79
        L1e:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r3 < r4) goto L33
            boolean r3 = a.O0.f
            if (r3 != 0) goto L79
            a.O0$c r3 = a.O0.f192a
            a.N0 r4 = new a.N0
            r4.<init>(r10, r0)
            r3.execute(r4)
            goto L79
        L33:
            java.lang.Object r3 = a.O0.i
            monitor-enter(r3)
            a.J9 r4 = a.O0.c     // Catch: java.lang.Throwable -> L49
            if (r4 != 0) goto L5e
            a.J9 r4 = a.O0.d     // Catch: java.lang.Throwable -> L49
            if (r4 != 0) goto L4b
            java.lang.String r4 = a.C0435w1.S(r10)     // Catch: java.lang.Throwable -> L49
            a.J9 r4 = a.J9.a(r4)     // Catch: java.lang.Throwable -> L49
            a.O0.d = r4     // Catch: java.lang.Throwable -> L49
            goto L4b
        L49:
            r10 = move-exception
            goto L77
        L4b:
            a.J9 r4 = a.O0.d     // Catch: java.lang.Throwable -> L49
            a.L9 r4 = r4.f137a     // Catch: java.lang.Throwable -> L49
            android.os.LocaleList r4 = r4.f163a     // Catch: java.lang.Throwable -> L49
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L49
            if (r4 == 0) goto L59
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
            goto L79
        L59:
            a.J9 r4 = a.O0.d     // Catch: java.lang.Throwable -> L49
            a.O0.c = r4     // Catch: java.lang.Throwable -> L49
            goto L75
        L5e:
            a.J9 r5 = a.O0.d     // Catch: java.lang.Throwable -> L49
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L49
            if (r4 != 0) goto L75
            a.J9 r4 = a.O0.c     // Catch: java.lang.Throwable -> L49
            a.O0.d = r4     // Catch: java.lang.Throwable -> L49
            a.L9 r4 = r4.f137a     // Catch: java.lang.Throwable -> L49
            android.os.LocaleList r4 = r4.f163a     // Catch: java.lang.Throwable -> L49
            java.lang.String r4 = r4.toLanguageTags()     // Catch: java.lang.Throwable -> L49
            a.C0435w1.M(r10, r4)     // Catch: java.lang.Throwable -> L49
        L75:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
            goto L79
        L77:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L49
            throw r10
        L79:
            a.J9 r3 = F(r10)
            boolean r4 = r10 instanceof android.view.ContextThemeWrapper
            r5 = 0
            if (r4 == 0) goto L8d
            android.content.res.Configuration r4 = J(r10, r2, r3, r5, r0)
            r6 = r10
            android.view.ContextThemeWrapper r6 = (android.view.ContextThemeWrapper) r6     // Catch: java.lang.IllegalStateException -> L8d
            r6.applyOverrideConfiguration(r4)     // Catch: java.lang.IllegalStateException -> L8d
            return r10
        L8d:
            boolean r4 = r10 instanceof a.Z3
            if (r4 == 0) goto L9c
            android.content.res.Configuration r0 = J(r10, r2, r3, r5, r0)
            r4 = r10
            a.Z3 r4 = (a.Z3) r4     // Catch: java.lang.IllegalStateException -> L9c
            r4.a(r0)     // Catch: java.lang.IllegalStateException -> L9c
            return r10
        L9c:
            boolean r0 = a.Q0.k0
            if (r0 != 0) goto La1
            return r10
        La1:
            android.content.res.Configuration r0 = new android.content.res.Configuration
            r0.<init>()
            r4 = -1
            r0.uiMode = r4
            r4 = 0
            r0.fontScale = r4
            android.content.Context r0 = r10.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.content.res.Resources r6 = r10.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r7 = r6.uiMode
            r0.uiMode = r7
            boolean r7 = r0.equals(r6)
            if (r7 != 0) goto L1bf
            android.content.res.Configuration r7 = new android.content.res.Configuration
            r7.<init>()
            r7.fontScale = r4
            int r4 = r0.diff(r6)
            if (r4 != 0) goto Ld9
            goto L1c0
        Ld9:
            float r4 = r0.fontScale
            float r8 = r6.fontScale
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 == 0) goto Le3
            r7.fontScale = r8
        Le3:
            int r4 = r0.mcc
            int r8 = r6.mcc
            if (r4 == r8) goto Leb
            r7.mcc = r8
        Leb:
            int r4 = r0.mnc
            int r8 = r6.mnc
            if (r4 == r8) goto Lf3
            r7.mnc = r8
        Lf3:
            a.Q0.f.a(r0, r6, r7)
            int r4 = r0.touchscreen
            int r8 = r6.touchscreen
            if (r4 == r8) goto Lfe
            r7.touchscreen = r8
        Lfe:
            int r4 = r0.keyboard
            int r8 = r6.keyboard
            if (r4 == r8) goto L106
            r7.keyboard = r8
        L106:
            int r4 = r0.keyboardHidden
            int r8 = r6.keyboardHidden
            if (r4 == r8) goto L10e
            r7.keyboardHidden = r8
        L10e:
            int r4 = r0.navigation
            int r8 = r6.navigation
            if (r4 == r8) goto L116
            r7.navigation = r8
        L116:
            int r4 = r0.navigationHidden
            int r8 = r6.navigationHidden
            if (r4 == r8) goto L11e
            r7.navigationHidden = r8
        L11e:
            int r4 = r0.orientation
            int r8 = r6.orientation
            if (r4 == r8) goto L126
            r7.orientation = r8
        L126:
            int r4 = r0.screenLayout
            r4 = r4 & 15
            int r8 = r6.screenLayout
            r8 = r8 & 15
            if (r4 == r8) goto L135
            int r4 = r7.screenLayout
            r4 = r4 | r8
            r7.screenLayout = r4
        L135:
            int r4 = r0.screenLayout
            r4 = r4 & 192(0xc0, float:2.69E-43)
            int r8 = r6.screenLayout
            r8 = r8 & 192(0xc0, float:2.69E-43)
            if (r4 == r8) goto L144
            int r4 = r7.screenLayout
            r4 = r4 | r8
            r7.screenLayout = r4
        L144:
            int r4 = r0.screenLayout
            r4 = r4 & 48
            int r8 = r6.screenLayout
            r8 = r8 & 48
            if (r4 == r8) goto L153
            int r4 = r7.screenLayout
            r4 = r4 | r8
            r7.screenLayout = r4
        L153:
            int r4 = r0.screenLayout
            r4 = r4 & 768(0x300, float:1.076E-42)
            int r8 = r6.screenLayout
            r8 = r8 & 768(0x300, float:1.076E-42)
            if (r4 == r8) goto L162
            int r4 = r7.screenLayout
            r4 = r4 | r8
            r7.screenLayout = r4
        L162:
            int r4 = r0.colorMode
            r4 = r4 & 3
            int r8 = r6.colorMode
            r8 = r8 & 3
            if (r4 == r8) goto L171
            int r4 = r7.colorMode
            r4 = r4 | r8
            r7.colorMode = r4
        L171:
            int r4 = r0.colorMode
            r4 = r4 & 12
            int r8 = r6.colorMode
            r8 = r8 & 12
            if (r4 == r8) goto L180
            int r4 = r7.colorMode
            r4 = r4 | r8
            r7.colorMode = r4
        L180:
            int r4 = r0.uiMode
            r4 = r4 & 15
            int r8 = r6.uiMode
            r8 = r8 & 15
            if (r4 == r8) goto L18f
            int r4 = r7.uiMode
            r4 = r4 | r8
            r7.uiMode = r4
        L18f:
            int r4 = r0.uiMode
            r4 = r4 & 48
            int r8 = r6.uiMode
            r8 = r8 & 48
            if (r4 == r8) goto L19e
            int r4 = r7.uiMode
            r4 = r4 | r8
            r7.uiMode = r4
        L19e:
            int r4 = r0.screenWidthDp
            int r8 = r6.screenWidthDp
            if (r4 == r8) goto L1a6
            r7.screenWidthDp = r8
        L1a6:
            int r4 = r0.screenHeightDp
            int r8 = r6.screenHeightDp
            if (r4 == r8) goto L1ae
            r7.screenHeightDp = r8
        L1ae:
            int r4 = r0.smallestScreenWidthDp
            int r8 = r6.smallestScreenWidthDp
            if (r4 == r8) goto L1b6
            r7.smallestScreenWidthDp = r8
        L1b6:
            int r0 = r0.densityDpi
            int r4 = r6.densityDpi
            if (r0 == r4) goto L1c0
            r7.densityDpi = r4
            goto L1c0
        L1bf:
            r7 = r5
        L1c0:
            android.content.res.Configuration r0 = J(r10, r2, r3, r7, r1)
            a.Z3 r2 = new a.Z3
            int r3 = androidx.appcompat.R.style.Theme_AppCompat_Empty
            r2.<init>(r10, r3)
            r2.a(r0)
            android.content.res.Resources$Theme r10 = r10.getTheme()     // Catch: java.lang.NullPointerException -> L21b
            if (r10 == 0) goto L21b
            android.content.res.Resources$Theme r10 = r2.getTheme()
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r0 < r3) goto L1e2
            a.C0393td.a(r10)
            goto L21b
        L1e2:
            java.lang.Object r0 = a.C0375sd.f688a
            monitor-enter(r0)
            boolean r3 = a.C0375sd.c     // Catch: java.lang.Throwable -> L1f7
            if (r3 != 0) goto L203
            java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
            java.lang.String r4 = "rebase"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Throwable -> L1f7 java.lang.NoSuchMethodException -> L1f9
            a.C0375sd.b = r3     // Catch: java.lang.Throwable -> L1f7 java.lang.NoSuchMethodException -> L1f9
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L1f7 java.lang.NoSuchMethodException -> L1f9
            goto L201
        L1f7:
            r10 = move-exception
            goto L219
        L1f9:
            r3 = move-exception
            java.lang.String r4 = "ResourcesCompat"
            java.lang.String r6 = "Failed to retrieve rebase() method"
            android.util.Log.i(r4, r6, r3)     // Catch: java.lang.Throwable -> L1f7
        L201:
            a.C0375sd.c = r1     // Catch: java.lang.Throwable -> L1f7
        L203:
            java.lang.reflect.Method r1 = a.C0375sd.b     // Catch: java.lang.Throwable -> L1f7
            if (r1 == 0) goto L217
            r1.invoke(r10, r5)     // Catch: java.lang.Throwable -> L1f7 java.lang.reflect.InvocationTargetException -> L20b java.lang.IllegalAccessException -> L20d
            goto L217
        L20b:
            r10 = move-exception
            goto L20e
        L20d:
            r10 = move-exception
        L20e:
            java.lang.String r1 = "ResourcesCompat"
            java.lang.String r3 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r1, r3, r10)     // Catch: java.lang.Throwable -> L1f7
            a.C0375sd.b = r5     // Catch: java.lang.Throwable -> L1f7
        L217:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f7
            goto L21b
        L219:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f7
            throw r10
        L21b:
            return r2
    }

    @Override // a.O0
    public final <T extends android.view.View> T e(int r2) {
            r1 = this;
            r1.M()
            android.view.Window r0 = r1.l
            android.view.View r2 = r0.findViewById(r2)
            return r2
    }

    @Override // a.O0
    public final android.content.Context f() {
            r1 = this;
            android.content.Context r0 = r1.k
            return r0
    }

    @Override // a.O0
    public final a.Q0.b g() {
            r1 = this;
            a.Q0$b r0 = new a.Q0$b
            r0.<init>()
            return r0
    }

    @Override // a.O0
    public final int h() {
            r1 = this;
            int r0 = r1.T
            return r0
    }

    @Override // a.O0
    public final android.view.MenuInflater i() {
            r2 = this;
            a.Ie r0 = r2.p
            if (r0 != 0) goto L19
            r2.Q()
            a.Ie r0 = new a.Ie
            a.L r1 = r2.o
            if (r1 == 0) goto L12
            android.content.Context r1 = r1.e()
            goto L14
        L12:
            android.content.Context r1 = r2.k
        L14:
            r0.<init>(r1)
            r2.p = r0
        L19:
            a.Ie r0 = r2.p
            return r0
    }

    @Override // a.O0
    public final a.L j() {
            r1 = this;
            r1.Q()
            a.L r0 = r1.o
            return r0
    }

    @Override // a.O0
    public final void k() {
            r2 = this;
            android.content.Context r0 = r2.k
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.LayoutInflater$Factory r1 = r0.getFactory()
            if (r1 != 0) goto L10
            r0.setFactory2(r2)
            return
        L10:
            android.view.LayoutInflater$Factory2 r0 = r0.getFactory2()
            boolean r0 = r0 instanceof a.Q0
            if (r0 != 0) goto L1f
            java.lang.String r0 = "AppCompatDelegate"
            java.lang.String r1 = "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's"
            android.util.Log.i(r0, r1)
        L1f:
            return
    }

    @Override // a.O0
    public final void l() {
            r1 = this;
            a.L r0 = r1.o
            if (r0 == 0) goto L14
            r1.Q()
            a.L r0 = r1.o
            boolean r0 = r0.f()
            if (r0 == 0) goto L10
            goto L14
        L10:
            r0 = 0
            r1.R(r0)
        L14:
            return
    }

    @Override // a.O0
    public final void n(android.content.res.Configuration r4) {
            r3 = this;
            boolean r4 = r3.G
            if (r4 == 0) goto L12
            boolean r4 = r3.A
            if (r4 == 0) goto L12
            r3.Q()
            a.L r4 = r3.o
            if (r4 == 0) goto L12
            r4.g()
        L12:
            a.Y0 r4 = a.Y0.a()
            android.content.Context r0 = r3.k
            monitor-enter(r4)
            a.pd r1 = r4.f347a     // Catch: java.lang.Throwable -> L46
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L46
            java.util.WeakHashMap<android.content.Context, a.U9<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r2 = r1.b     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L2a
            a.U9 r0 = (a.U9) r0     // Catch: java.lang.Throwable -> L2a
            if (r0 == 0) goto L2c
            r0.a()     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r0 = move-exception
            goto L44
        L2c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r4)
            android.content.res.Configuration r4 = new android.content.res.Configuration
            android.content.Context r0 = r3.k
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            r4.<init>(r0)
            r3.S = r4
            r4 = 0
            r3.D(r4, r4)
            return
        L44:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            throw r0     // Catch: java.lang.Throwable -> L46
        L46:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L46
            throw r0
    }

    @Override // a.O0
    public final void o() {
            r4 = this;
            r0 = 1
            r4.P = r0
            r1 = 0
            r4.D(r1, r0)
            r4.N()
            java.lang.Object r1 = r4.j
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L44
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.IllegalArgumentException -> L22
            android.content.ComponentName r2 = r1.getComponentName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b java.lang.IllegalArgumentException -> L22
            java.lang.String r1 = a.Hb.c(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b java.lang.IllegalArgumentException -> L22
            goto L23
        L1b:
            r1 = move-exception
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L22
            r2.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L22
            throw r2     // Catch: java.lang.IllegalArgumentException -> L22
        L22:
            r1 = 0
        L23:
            if (r1 == 0) goto L2f
            a.L r1 = r4.o
            if (r1 != 0) goto L2c
            r4.c0 = r0
            goto L2f
        L2c:
            r1.l(r0)
        L2f:
            java.lang.Object r1 = a.O0.h
            monitor-enter(r1)
            a.O0.u(r4)     // Catch: java.lang.Throwable -> L41
            a.L1<java.lang.ref.WeakReference<a.O0>> r2 = a.O0.g     // Catch: java.lang.Throwable -> L41
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L41
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L41
            r2.add(r3)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            goto L44
        L41:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L41
            throw r0
        L44:
            android.content.res.Configuration r1 = new android.content.res.Configuration
            android.content.Context r2 = r4.k
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            r1.<init>(r2)
            r4.S = r1
            r4.Q = r0
            return
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r10, java.lang.String r11, android.content.Context r12, android.util.AttributeSet r13) {
            r9 = this;
            r10 = 3
            r0 = -1
            r1 = 0
            r2 = 1
            a.u1 r3 = r9.f0
            r4 = 0
            if (r3 != 0) goto L59
            int[] r3 = androidx.appcompat.R.styleable.AppCompatTheme
            android.content.Context r5 = r9.k
            android.content.res.TypedArray r3 = r5.obtainStyledAttributes(r3)
            int r6 = androidx.appcompat.R.styleable.AppCompatTheme_viewInflaterClass
            java.lang.String r6 = r3.getString(r6)
            r3.recycle()
            if (r6 != 0) goto L24
            a.u1 r3 = new a.u1
            r3.<init>()
            r9.f0 = r3
            goto L59
        L24:
            java.lang.ClassLoader r3 = r5.getClassLoader()     // Catch: java.lang.Throwable -> L39
            java.lang.Class r3 = r3.loadClass(r6)     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r4)     // Catch: java.lang.Throwable -> L39
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.Throwable -> L39
            a.u1 r3 = (a.C0399u1) r3     // Catch: java.lang.Throwable -> L39
            r9.f0 = r3     // Catch: java.lang.Throwable -> L39
            goto L59
        L39:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to instantiate custom view inflater "
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r6 = ". Falling back to default."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "AppCompatDelegate"
            android.util.Log.i(r6, r5, r3)
            a.u1 r3 = new a.u1
            r3.<init>()
            r9.f0 = r3
        L59:
            a.u1 r3 = r9.f0
            int r5 = a.C0128eg.f462a
            r3.getClass()
            int[] r5 = androidx.appcompat.R.styleable.View
            android.content.res.TypedArray r5 = r12.obtainStyledAttributes(r13, r5, r1, r1)
            int r6 = androidx.appcompat.R.styleable.View_theme
            int r6 = r5.getResourceId(r6, r1)
            if (r6 == 0) goto L75
            java.lang.String r7 = "AppCompatViewInflater"
            java.lang.String r8 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r7, r8)
        L75:
            r5.recycle()
            if (r6 == 0) goto L8b
            boolean r5 = r12 instanceof a.Z3
            if (r5 == 0) goto L85
            r5 = r12
            a.Z3 r5 = (a.Z3) r5
            int r5 = r5.f367a
            if (r5 == r6) goto L8b
        L85:
            a.Z3 r5 = new a.Z3
            r5.<init>(r12, r6)
            goto L8c
        L8b:
            r5 = r12
        L8c:
            r11.getClass()
            int r6 = r11.hashCode()
            switch(r6) {
                case -1946472170: goto L137;
                case -1455429095: goto L12b;
                case -1346021293: goto L11f;
                case -938935918: goto L113;
                case -937446323: goto L108;
                case -658531749: goto Lfd;
                case -339785223: goto Lf2;
                case 776382189: goto Le7;
                case 799298502: goto Lda;
                case 1125864064: goto Lcd;
                case 1413872058: goto Lc0;
                case 1601505219: goto Lb3;
                case 1666676343: goto La6;
                case 2001146706: goto L99;
                default: goto L96;
            }
        L96:
            r6 = r0
            goto L142
        L99:
            java.lang.String r6 = "Button"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto La2
            goto L96
        La2:
            r6 = 13
            goto L142
        La6:
            java.lang.String r6 = "EditText"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto Laf
            goto L96
        Laf:
            r6 = 12
            goto L142
        Lb3:
            java.lang.String r6 = "CheckBox"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto Lbc
            goto L96
        Lbc:
            r6 = 11
            goto L142
        Lc0:
            java.lang.String r6 = "AutoCompleteTextView"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto Lc9
            goto L96
        Lc9:
            r6 = 10
            goto L142
        Lcd:
            java.lang.String r6 = "ImageView"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto Ld6
            goto L96
        Ld6:
            r6 = 9
            goto L142
        Lda:
            java.lang.String r6 = "ToggleButton"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto Le3
            goto L96
        Le3:
            r6 = 8
            goto L142
        Le7:
            java.lang.String r6 = "RadioButton"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto Lf0
            goto L96
        Lf0:
            r6 = 7
            goto L142
        Lf2:
            java.lang.String r6 = "Spinner"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto Lfb
            goto L96
        Lfb:
            r6 = 6
            goto L142
        Lfd:
            java.lang.String r6 = "SeekBar"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto L106
            goto L96
        L106:
            r6 = 5
            goto L142
        L108:
            java.lang.String r6 = "ImageButton"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto L111
            goto L96
        L111:
            r6 = 4
            goto L142
        L113:
            java.lang.String r6 = "TextView"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto L11d
            goto L96
        L11d:
            r6 = r10
            goto L142
        L11f:
            java.lang.String r6 = "MultiAutoCompleteTextView"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto L129
            goto L96
        L129:
            r6 = 2
            goto L142
        L12b:
            java.lang.String r6 = "CheckedTextView"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto L135
            goto L96
        L135:
            r6 = r2
            goto L142
        L137:
            java.lang.String r6 = "RatingBar"
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto L141
            goto L96
        L141:
            r6 = r1
        L142:
            switch(r6) {
                case 0: goto L192;
                case 1: goto L18c;
                case 2: goto L186;
                case 3: goto L181;
                case 4: goto L17b;
                case 5: goto L175;
                case 6: goto L16d;
                case 7: goto L168;
                case 8: goto L162;
                case 9: goto L15c;
                case 10: goto L157;
                case 11: goto L152;
                case 12: goto L14c;
                case 13: goto L147;
                default: goto L145;
            }
        L145:
            r6 = r4
            goto L197
        L147:
            a.H0 r6 = r3.b(r5, r13)
            goto L197
        L14c:
            a.Z0 r6 = new a.Z0
            r6.<init>(r5, r13)
            goto L197
        L152:
            a.J0 r6 = r3.c(r5, r13)
            goto L197
        L157:
            a.F0 r6 = r3.a(r5, r13)
            goto L197
        L15c:
            a.e1 r6 = new a.e1
            r6.<init>(r5, r13, r1)
            goto L197
        L162:
            a.t1 r6 = new a.t1
            r6.<init>(r5, r13)
            goto L197
        L168:
            a.i1 r6 = r3.d(r5, r13)
            goto L197
        L16d:
            a.o1 r6 = new a.o1
            int r7 = androidx.appcompat.R.attr.spinnerStyle
            r6.<init>(r5, r13, r7)
            goto L197
        L175:
            a.l1 r6 = new a.l1
            r6.<init>(r5, r13)
            goto L197
        L17b:
            a.c1 r6 = new a.c1
            r6.<init>(r5, r13)
            goto L197
        L181:
            a.r1 r6 = r3.e(r5, r13)
            goto L197
        L186:
            a.f1 r6 = new a.f1
            r6.<init>(r5, r13)
            goto L197
        L18c:
            a.K0 r6 = new a.K0
            r6.<init>(r5, r13)
            goto L197
        L192:
            a.j1 r6 = new a.j1
            r6.<init>(r5, r13)
        L197:
            if (r6 != 0) goto L1e7
            if (r12 == r5) goto L1e7
            java.lang.Object[] r12 = r3.f703a
            java.lang.String r6 = "view"
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L1ab
            java.lang.String r11 = "class"
            java.lang.String r11 = r13.getAttributeValue(r4, r11)
        L1ab:
            r12[r1] = r5     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e2
            r12[r2] = r13     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e2
            r6 = 46
            int r6 = r11.indexOf(r6)     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e2
            if (r0 != r6) goto L1d3
            r0 = r1
        L1b8:
            java.lang.String[] r6 = a.C0399u1.g     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e2
            if (r0 >= r10) goto L1ce
            r6 = r6[r0]     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e2
            android.view.View r6 = r3.f(r5, r11, r6)     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e2
            if (r6 == 0) goto L1ca
            r12[r1] = r4
            r12[r2] = r4
            r4 = r6
            goto L1e6
        L1ca:
            int r0 = r0 + r2
            goto L1b8
        L1cc:
            r10 = move-exception
            goto L1dd
        L1ce:
            r12[r1] = r4
            r12[r2] = r4
            goto L1e6
        L1d3:
            android.view.View r10 = r3.f(r5, r11, r4)     // Catch: java.lang.Throwable -> L1cc java.lang.Exception -> L1e2
            r12[r1] = r4
            r12[r2] = r4
            r4 = r10
            goto L1e6
        L1dd:
            r12[r1] = r4
            r12[r2] = r4
            throw r10
        L1e2:
            r12[r1] = r4
            r12[r2] = r4
        L1e6:
            r6 = r4
        L1e7:
            if (r6 == 0) goto L274
            android.content.Context r10 = r6.getContext()
            boolean r11 = r10 instanceof android.content.ContextWrapper
            if (r11 == 0) goto L20f
            boolean r11 = r6.hasOnClickListeners()
            if (r11 != 0) goto L1f8
            goto L20f
        L1f8:
            int[] r11 = a.C0399u1.c
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r13, r11)
            java.lang.String r11 = r10.getString(r1)
            if (r11 == 0) goto L20c
            a.u1$a r12 = new a.u1$a
            r12.<init>(r6, r11)
            r6.setOnClickListener(r12)
        L20c:
            r10.recycle()
        L20f:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r10 <= r11) goto L216
            goto L274
        L216:
            int[] r10 = a.C0399u1.d
            android.content.res.TypedArray r10 = r5.obtainStyledAttributes(r13, r10)
            boolean r12 = r10.hasValue(r1)
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r12 == 0) goto L238
            boolean r12 = r10.getBoolean(r1, r1)
            java.util.WeakHashMap<android.view.View, a.Jg> r2 = a.C0414ug.f721a
            a.tg r2 = new a.tg
            int r3 = androidx.core.R.id.tag_accessibility_heading
            r2.<init>(r3, r0, r1, r11)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r2.c(r6, r12)
        L238:
            r10.recycle()
            int[] r10 = a.C0399u1.e
            android.content.res.TypedArray r10 = r5.obtainStyledAttributes(r13, r10)
            boolean r12 = r10.hasValue(r1)
            if (r12 == 0) goto L24e
            java.lang.String r12 = r10.getString(r1)
            a.C0414ug.k(r6, r12)
        L24e:
            r10.recycle()
            int[] r10 = a.C0399u1.f
            android.content.res.TypedArray r10 = r5.obtainStyledAttributes(r13, r10)
            boolean r12 = r10.hasValue(r1)
            if (r12 == 0) goto L271
            boolean r12 = r10.getBoolean(r1, r1)
            java.util.WeakHashMap<android.view.View, a.Jg> r13 = a.C0414ug.f721a
            a.qg r13 = new a.qg
            int r2 = androidx.core.R.id.tag_screen_reader_focusable
            r13.<init>(r2, r0, r1, r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r12)
            r13.c(r6, r11)
        L271:
            r10.recycle()
        L274:
            return r6
    }

    @Override // android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.onCreateView(r0, r2, r3, r4)
            return r2
    }

    @Override // a.O0
    public final void p() {
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = a.O0.h
            monitor-enter(r0)
            a.O0.u(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.Z
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            a.Q0$a r1 = r3.b0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.R = r0
            int r0 = r3.T
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            a.ge<java.lang.String, java.lang.Integer> r0 = a.Q0.i0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            a.ge<java.lang.String, java.lang.Integer> r0 = a.Q0.i0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            a.L r0 = r3.o
            if (r0 == 0) goto L63
            r0.h()
        L63:
            a.Q0$k r0 = r3.X
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            a.Q0$i r0 = r3.Y
            if (r0 == 0) goto L71
            r0.a()
        L71:
            return
    }

    @Override // a.O0
    public final void q() {
            r0 = this;
            r0.M()
            return
    }

    @Override // a.O0
    public final void r() {
            r2 = this;
            r2.Q()
            a.L r0 = r2.o
            if (r0 == 0) goto Lb
            r1 = 1
            r0.m(r1)
        Lb:
            return
    }

    @Override // a.O0
    public final void s() {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.D(r0, r1)
            return
    }

    @Override // a.O0
    public final void t() {
            r2 = this;
            r2.Q()
            a.L r0 = r2.o
            if (r0 == 0) goto Lb
            r1 = 0
            r0.m(r1)
        Lb:
            return
    }

    @Override // a.O0
    public final boolean v(int r6) {
            r5 = this;
            r0 = 109(0x6d, float:1.53E-43)
            r1 = 108(0x6c, float:1.51E-43)
            r2 = 8
            java.lang.String r3 = "AppCompatDelegate"
            if (r6 != r2) goto L11
            java.lang.String r6 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."
            android.util.Log.i(r3, r6)
            r6 = r1
            goto L1b
        L11:
            r2 = 9
            if (r6 != r2) goto L1b
            java.lang.String r6 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."
            android.util.Log.i(r3, r6)
            r6 = r0
        L1b:
            boolean r2 = r5.K
            r3 = 0
            if (r2 == 0) goto L23
            if (r6 != r1) goto L23
            return r3
        L23:
            boolean r2 = r5.G
            r4 = 1
            if (r2 == 0) goto L2c
            if (r6 != r4) goto L2c
            r5.G = r3
        L2c:
            if (r6 == r4) goto L61
            r2 = 2
            if (r6 == r2) goto L5b
            r2 = 5
            if (r6 == r2) goto L55
            r2 = 10
            if (r6 == r2) goto L4f
            if (r6 == r1) goto L49
            if (r6 == r0) goto L43
            android.view.Window r0 = r5.l
            boolean r6 = r0.requestFeature(r6)
            return r6
        L43:
            r5.X()
            r5.H = r4
            return r4
        L49:
            r5.X()
            r5.G = r4
            return r4
        L4f:
            r5.X()
            r5.I = r4
            return r4
        L55:
            r5.X()
            r5.F = r4
            return r4
        L5b:
            r5.X()
            r5.E = r4
            return r4
        L61:
            r5.X()
            r5.K = r4
            return r4
    }

    @Override // a.O0
    public final void w(int r3) {
            r2 = this;
            r2.M()
            android.view.ViewGroup r0 = r2.B
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            android.content.Context r1 = r2.k
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r1.inflate(r3, r0)
            a.Q0$h r3 = r2.m
            android.view.Window r0 = r2.l
            android.view.Window$Callback r0 = r0.getCallback()
            r3.a(r0)
            return
    }

    @Override // a.O0
    public final void x(android.view.View r3) {
            r2 = this;
            r2.M()
            android.view.ViewGroup r0 = r2.B
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r0.addView(r3)
            a.Q0$h r3 = r2.m
            android.view.Window r0 = r2.l
            android.view.Window$Callback r0 = r0.getCallback()
            r3.a(r0)
            return
    }

    @Override // a.O0
    public final void y(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.M()
            android.view.ViewGroup r0 = r2.B
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r0.addView(r3, r4)
            a.Q0$h r3 = r2.m
            android.view.Window r4 = r2.l
            android.view.Window$Callback r4 = r4.getCallback()
            r3.a(r4)
            return
    }

    @Override // a.O0
    public final void z(androidx.appcompat.widget.Toolbar r4) {
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 != 0) goto L7
            return
        L7:
            r3.Q()
            a.L r1 = r3.o
            boolean r2 = r1 instanceof a.lh
            if (r2 != 0) goto L45
            r2 = 0
            r3.p = r2
            if (r1 == 0) goto L18
            r1.h()
        L18:
            r3.o = r2
            if (r4 == 0) goto L3d
            a.uf r1 = new a.uf
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L29
            android.app.Activity r0 = (android.app.Activity) r0
            java.lang.CharSequence r0 = r0.getTitle()
            goto L2b
        L29:
            java.lang.CharSequence r0 = r3.q
        L2b:
            a.Q0$h r2 = r3.m
            r1.<init>(r4, r0, r2)
            r3.o = r1
            a.Q0$h r0 = r3.m
            a.uf$e r1 = r1.c
            r0.b = r1
            r0 = 1
            r4.setBackInvokedCallbackEnabled(r0)
            goto L41
        L3d:
            a.Q0$h r4 = r3.m
            r4.b = r2
        L41:
            r3.l()
            return
        L45:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."
            r4.<init>(r0)
            throw r4
    }
}
