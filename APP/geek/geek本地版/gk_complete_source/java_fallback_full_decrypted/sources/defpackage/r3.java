package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r3 extends defpackage.e3 implements defpackage.iu, android.view.LayoutInflater.Factory2 {
    public static final defpackage.u30 h0 = null;
    public static final int[] i0 = null;
    public static final boolean j0 = false;
    public static final boolean k0 = false;
    public android.view.ViewGroup A;
    public android.widget.TextView B;
    public android.view.View C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public defpackage.q3[] L;
    public defpackage.q3 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public android.content.res.Configuration R;
    public final int S;
    public int T;
    public int U;
    public boolean V;
    public defpackage.m3 W;
    public defpackage.m3 X;
    public boolean Y;
    public int Z;
    public final defpackage.f3 a0;
    public boolean b0;
    public android.graphics.Rect c0;
    public android.graphics.Rect d0;
    public defpackage.q5 e0;
    public android.window.OnBackInvokedDispatcher f0;
    public android.window.OnBackInvokedCallback g0;
    public final java.lang.Object j;
    public final android.content.Context k;
    public android.view.Window l;
    public defpackage.l3 m;
    public final java.lang.Object n;
    public defpackage.yb0 o;
    public defpackage.k50 p;
    public java.lang.CharSequence q;
    public defpackage.gf r;
    public defpackage.g3 s;
    public defpackage.g3 t;
    public defpackage.n1 u;
    public androidx.appcompat.widget.ActionBarContextView v;
    public android.widget.PopupWindow w;
    public defpackage.f3 x;
    public defpackage.wa0 y;
    public boolean z;

    static {
            u30 r0 = new u30
            r0.<init>()
            defpackage.r3.h0 = r0
            r0 = 16842836(0x1010054, float:2.3693793E-38)
            int[] r0 = new int[]{r0}
            defpackage.r3.i0 = r0
            java.lang.String r0 = "robolectric"
            java.lang.String r1 = android.os.Build.FINGERPRINT
            boolean r0 = r0.equals(r1)
            r1 = 1
            r0 = r0 ^ r1
            defpackage.r3.j0 = r0
            defpackage.r3.k0 = r1
            return
    }

    public r3(android.content.Context r5, android.view.Window r6, defpackage.x2 r7, java.lang.Object r8) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.y = r0
            r1 = -100
            r4.S = r1
            f3 r2 = new f3
            r3 = 0
            r2.<init>(r4, r3)
            r4.a0 = r2
            r4.k = r5
            r4.n = r7
            r4.j = r8
            boolean r7 = r8 instanceof android.app.Dialog
            if (r7 == 0) goto L3d
        L1c:
            if (r5 == 0) goto L30
            boolean r7 = r5 instanceof androidx.appcompat.app.AppCompatActivity
            if (r7 == 0) goto L25
            androidx.appcompat.app.AppCompatActivity r5 = (androidx.appcompat.app.AppCompatActivity) r5
            goto L31
        L25:
            boolean r7 = r5 instanceof android.content.ContextWrapper
            if (r7 == 0) goto L30
            android.content.ContextWrapper r5 = (android.content.ContextWrapper) r5
            android.content.Context r5 = r5.getBaseContext()
            goto L1c
        L30:
            r5 = r0
        L31:
            if (r5 == 0) goto L3d
            e3 r5 = r5.l()
            r3 r5 = (defpackage.r3) r5
            int r5 = r5.S
            r4.S = r5
        L3d:
            int r5 = r4.S
            if (r5 != r1) goto L68
            java.lang.Object r5 = r4.j
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            u30 r7 = defpackage.r3.h0
            java.lang.Object r5 = r7.getOrDefault(r5, r0)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L68
            int r5 = r5.intValue()
            r4.S = r5
            java.lang.Object r5 = r4.j
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            r7.remove(r5)
        L68:
            if (r6 == 0) goto L6d
            r4.o(r6)
        L6d:
            defpackage.u3.d()
            return
    }

    public static defpackage.sr p(android.content.Context r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L7
            goto Lb
        L7:
            sr r0 = defpackage.e3.c
            if (r0 != 0) goto Ld
        Lb:
            r5 = 0
            return r5
        Ld:
            tr r0 = r0.a
            android.content.Context r5 = r5.getApplicationContext()
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            sr r5 = defpackage.i3.b(r5)
            android.os.LocaleList r1 = r0.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L2a
            sr r0 = defpackage.sr.b
            goto L83
        L2a:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r2 = 0
        L30:
            android.os.LocaleList r3 = r0.a
            int r3 = r3.size()
            tr r4 = r5.a
            android.os.LocaleList r4 = r4.a
            int r4 = r4.size()
            int r4 = r4 + r3
            if (r2 >= r4) goto L68
            android.os.LocaleList r3 = r0.a
            int r3 = r3.size()
            if (r2 >= r3) goto L50
            android.os.LocaleList r3 = r0.a
            java.util.Locale r3 = r3.get(r2)
            goto L60
        L50:
            android.os.LocaleList r3 = r0.a
            int r3 = r3.size()
            int r3 = r2 - r3
            tr r4 = r5.a
            android.os.LocaleList r4 = r4.a
            java.util.Locale r3 = r4.get(r3)
        L60:
            if (r3 == 0) goto L65
            r1.add(r3)
        L65:
            int r2 = r2 + 1
            goto L30
        L68:
            int r0 = r1.size()
            java.util.Locale[] r0 = new java.util.Locale[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.util.Locale[] r0 = (java.util.Locale[]) r0
            android.os.LocaleList r0 = defpackage.rr.a(r0)
            sr r1 = new sr
            tr r2 = new tr
            r2.<init>(r0)
            r1.<init>(r2)
            r0 = r1
        L83:
            tr r1 = r0.a
            android.os.LocaleList r1 = r1.a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L8e
            return r5
        L8e:
            return r0
    }

    public static android.content.res.Configuration t(android.content.Context r1, int r2, defpackage.sr r3, android.content.res.Configuration r4, boolean r5) {
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
            defpackage.i3.d(r2, r3)
        L39:
            return r2
    }

    public final void A() {
            r3 = this;
            r3.w()
            boolean r0 = r3.F
            if (r0 == 0) goto L34
            yb0 r0 = r3.o
            if (r0 == 0) goto Lc
            goto L34
        Lc:
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1e
            yb0 r1 = new yb0
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.G
            r1.<init>(r0, r2)
            r3.o = r1
            goto L2b
        L1e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L2b
            yb0 r1 = new yb0
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            r3.o = r1
        L2b:
            yb0 r0 = r3.o
            if (r0 == 0) goto L34
            boolean r1 = r3.b0
            r0.N(r1)
        L34:
            return
    }

    public final void B(int r3) {
            r2 = this;
            int r0 = r2.Z
            r1 = 1
            int r3 = r1 << r3
            r3 = r3 | r0
            r2.Z = r3
            boolean r3 = r2.Y
            if (r3 != 0) goto L1b
            android.view.Window r3 = r2.l
            android.view.View r3 = r3.getDecorView()
            java.util.WeakHashMap r0 = defpackage.ja0.a
            f3 r0 = r2.a0
            defpackage.s90.m(r3, r0)
            r2.Y = r1
        L1b:
            return
    }

    public final int C(android.content.Context r3, int r4) {
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
            m3 r4 = r2.X
            if (r4 != 0) goto L1d
            m3 r4 = new m3
            r4.<init>(r2, r3)
            r2.X = r4
        L1d:
            m3 r3 = r2.X
            int r3 = r3.f()
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
            o3 r3 = r2.y(r3)
            int r3 = r3.f()
            return r3
        L48:
            return r4
        L49:
            return r1
    }

    public final boolean D() {
            r5 = this;
            boolean r0 = r5.N
            r1 = 0
            r5.N = r1
            q3 r2 = r5.z(r1)
            boolean r3 = r2.m
            r4 = 1
            if (r3 == 0) goto L14
            if (r0 != 0) goto L45
            r5.s(r2, r4)
            return r4
        L14:
            n1 r0 = r5.u
            if (r0 == 0) goto L1c
            r0.a()
            return r4
        L1c:
            r5.A()
            yb0 r0 = r5.o
            if (r0 == 0) goto L46
            hf r0 = r0.A
            if (r0 == 0) goto L46
            r2 = r0
            k70 r2 = (defpackage.k70) r2
            androidx.appcompat.widget.Toolbar r2 = r2.a
            f70 r2 = r2.L
            if (r2 == 0) goto L46
            ou r2 = r2.b
            if (r2 == 0) goto L46
            k70 r0 = (defpackage.k70) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            f70 r0 = r0.L
            if (r0 != 0) goto L3e
            r0 = 0
            goto L40
        L3e:
            ou r0 = r0.b
        L40:
            if (r0 == 0) goto L45
            r0.collapseActionView()
        L45:
            return r4
        L46:
            return r1
    }

    public final void E(defpackage.q3 r18, android.view.KeyEvent r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1.m
            int r3 = r1.a
            if (r2 != 0) goto L1d9
            boolean r2 = r0.Q
            if (r2 == 0) goto L10
            goto L1d9
        L10:
            android.content.Context r2 = r0.k
            if (r3 != 0) goto L25
            android.content.res.Resources r4 = r2.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.screenLayout
            r4 = r4 & 15
            r5 = 4
            if (r4 != r5) goto L25
            goto L1d9
        L25:
            android.view.Window r4 = r0.l
            android.view.Window$Callback r4 = r4.getCallback()
            r5 = 1
            if (r4 == 0) goto L3a
            ku r6 = r1.h
            boolean r4 = r4.onMenuOpened(r3, r6)
            if (r4 != 0) goto L3a
            r0.s(r1, r5)
            return
        L3a:
            java.lang.String r4 = "window"
            java.lang.Object r4 = r2.getSystemService(r4)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 != 0) goto L46
            goto L1d9
        L46:
            boolean r6 = r17.G(r18, r19)
            if (r6 != 0) goto L4e
            goto L1d9
        L4e:
            p3 r6 = r1.e
            r7 = 0
            r8 = -2
            if (r6 == 0) goto L6b
            boolean r9 = r1.n
            if (r9 == 0) goto L59
            goto L6b
        L59:
            android.view.View r2 = r1.g
            if (r2 == 0) goto L1b1
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 == 0) goto L1b1
            int r2 = r2.width
            r6 = -1
            if (r2 != r6) goto L1b1
            r10 = r6
            goto L1b2
        L6b:
            if (r6 != 0) goto Le6
            r0.A()
            yb0 r6 = r0.o
            if (r6 == 0) goto L79
            android.content.Context r6 = r6.L()
            goto L7a
        L79:
            r6 = 0
        L7a:
            if (r6 != 0) goto L7d
            goto L7e
        L7d:
            r2 = r6
        L7e:
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources r9 = r2.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            android.content.res.Resources$Theme r10 = r2.getTheme()
            r9.setTo(r10)
            r10 = 2130968578(0x7f040002, float:1.7545814E38)
            r9.resolveAttribute(r10, r6, r5)
            int r10 = r6.resourceId
            if (r10 == 0) goto L9f
            r9.applyStyle(r10, r5)
        L9f:
            r10 = 2130969398(0x7f040336, float:1.7547477E38)
            r9.resolveAttribute(r10, r6, r5)
            int r6 = r6.resourceId
            if (r6 == 0) goto Lad
            r9.applyStyle(r6, r5)
            goto Lb3
        Lad:
            r6 = 2131821068(0x7f11020c, float:1.9274869E38)
            r9.applyStyle(r6, r5)
        Lb3:
            kd r6 = new kd
            r6.<init>(r2, r7)
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r2.setTo(r9)
            r1.j = r6
            int[] r2 = defpackage.xy.j
            android.content.res.TypedArray r2 = r6.obtainStyledAttributes(r2)
            r6 = 86
            int r6 = r2.getResourceId(r6, r7)
            r1.b = r6
            int r6 = r2.getResourceId(r5, r7)
            r1.d = r6
            r2.recycle()
            p3 r2 = new p3
            kd r6 = r1.j
            r2.<init>(r0, r6)
            r1.e = r2
            r2 = 81
            r1.c = r2
            goto Lf5
        Le6:
            boolean r2 = r1.n
            if (r2 == 0) goto Lf5
            int r2 = r6.getChildCount()
            if (r2 <= 0) goto Lf5
            p3 r2 = r1.e
            r2.removeAllViews()
        Lf5:
            android.view.View r2 = r1.g
            if (r2 == 0) goto Lfc
            r1.f = r2
            goto L158
        Lfc:
            ku r2 = r1.h
            if (r2 != 0) goto L102
            goto L1d7
        L102:
            g3 r2 = r0.t
            if (r2 != 0) goto L10e
            g3 r2 = new g3
            r6 = 3
            r2.<init>(r0, r6)
            r0.t = r2
        L10e:
            g3 r2 = r0.t
            dr r6 = r1.i
            if (r6 != 0) goto L126
            dr r6 = new dr
            kd r9 = r1.j
            r6.<init>(r9)
            r1.i = r6
            r6.e = r2
            ku r2 = r1.h
            android.content.Context r9 = r2.a
            r2.b(r6, r9)
        L126:
            dr r2 = r1.i
            p3 r6 = r1.e
            androidx.appcompat.view.menu.ExpandedMenuView r9 = r2.d
            if (r9 != 0) goto L152
            android.view.LayoutInflater r9 = r2.b
            r10 = 2131492877(0x7f0c000d, float:1.8609218E38)
            android.view.View r6 = r9.inflate(r10, r6, r7)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = (androidx.appcompat.view.menu.ExpandedMenuView) r6
            r2.d = r6
            cr r6 = r2.f
            if (r6 != 0) goto L146
            cr r6 = new cr
            r6.<init>(r2)
            r2.f = r6
        L146:
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r2.d
            cr r9 = r2.f
            r6.setAdapter(r9)
            androidx.appcompat.view.menu.ExpandedMenuView r6 = r2.d
            r6.setOnItemClickListener(r2)
        L152:
            androidx.appcompat.view.menu.ExpandedMenuView r2 = r2.d
            r1.f = r2
            if (r2 == 0) goto L1d7
        L158:
            android.view.View r2 = r1.f
            if (r2 != 0) goto L15e
            goto L1d7
        L15e:
            android.view.View r2 = r1.g
            if (r2 == 0) goto L163
            goto L178
        L163:
            dr r2 = r1.i
            cr r6 = r2.f
            if (r6 != 0) goto L170
            cr r6 = new cr
            r6.<init>(r2)
            r2.f = r6
        L170:
            cr r2 = r2.f
            int r2 = r2.getCount()
            if (r2 <= 0) goto L1d7
        L178:
            android.view.View r2 = r1.f
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            if (r2 != 0) goto L185
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r8, r8)
        L185:
            int r6 = r1.b
            p3 r9 = r1.e
            r9.setBackgroundResource(r6)
            android.view.View r6 = r1.f
            android.view.ViewParent r6 = r6.getParent()
            boolean r9 = r6 instanceof android.view.ViewGroup
            if (r9 == 0) goto L19d
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r9 = r1.f
            r6.removeView(r9)
        L19d:
            p3 r6 = r1.e
            android.view.View r9 = r1.f
            r6.addView(r9, r2)
            android.view.View r2 = r1.f
            boolean r2 = r2.hasFocus()
            if (r2 != 0) goto L1b1
            android.view.View r2 = r1.f
            r2.requestFocus()
        L1b1:
            r10 = r8
        L1b2:
            r1.l = r7
            android.view.WindowManager$LayoutParams r9 = new android.view.WindowManager$LayoutParams
            r15 = 8519680(0x820000, float:1.1938615E-38)
            r16 = -3
            r11 = -2
            r12 = 0
            r13 = 0
            r14 = 1002(0x3ea, float:1.404E-42)
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            int r2 = r1.c
            r9.gravity = r2
            int r2 = r1.d
            r9.windowAnimations = r2
            p3 r2 = r1.e
            r4.addView(r2, r9)
            r1.m = r5
            if (r3 != 0) goto L1d9
            r0.I()
            return
        L1d7:
            r1.n = r5
        L1d9:
            return
    }

    public final boolean F(defpackage.q3 r3, int r4, android.view.KeyEvent r5) {
            r2 = this;
            boolean r0 = r5.isSystem()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r3.k
            if (r0 != 0) goto L12
            boolean r0 = r2.G(r3, r5)
            if (r0 == 0) goto L1b
        L12:
            ku r3 = r3.h
            if (r3 == 0) goto L1b
            r0 = 1
            boolean r1 = r3.performShortcut(r4, r5, r0)
        L1b:
            return r1
    }

    public final boolean G(defpackage.q3 r13, android.view.KeyEvent r14) {
            r12 = this;
            boolean r0 = r12.Q
            r1 = 0
            if (r0 == 0) goto L7
            goto L113
        L7:
            boolean r0 = r13.k
            int r2 = r13.a
            r3 = 1
            if (r0 == 0) goto Lf
            return r3
        Lf:
            q3 r0 = r12.M
            if (r0 == 0) goto L18
            if (r0 == r13) goto L18
            r12.s(r0, r1)
        L18:
            android.view.Window r0 = r12.l
            android.view.Window$Callback r0 = r0.getCallback()
            if (r0 == 0) goto L26
            android.view.View r4 = r0.onCreatePanelView(r2)
            r13.g = r4
        L26:
            r4 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L2f
            if (r2 != r4) goto L2d
            goto L2f
        L2d:
            r5 = r1
            goto L30
        L2f:
            r5 = r3
        L30:
            if (r5 == 0) goto L41
            gf r6 = r12.r
            if (r6 == 0) goto L41
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            hf r6 = r6.e
            k70 r6 = (defpackage.k70) r6
            r6.l = r3
        L41:
            android.view.View r6 = r13.g
            if (r6 != 0) goto L162
            ku r6 = r13.h
            r7 = 0
            if (r6 == 0) goto L4e
            boolean r8 = r13.o
            if (r8 == 0) goto L116
        L4e:
            if (r6 != 0) goto Ld0
            android.content.Context r6 = r12.k
            if (r2 == 0) goto L56
            if (r2 != r4) goto Lad
        L56:
            gf r4 = r12.r
            if (r4 == 0) goto Lad
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r8 = r6.getTheme()
            r9 = 2130968585(0x7f040009, float:1.7545828E38)
            r8.resolveAttribute(r9, r4, r3)
            int r9 = r4.resourceId
            r10 = 2130968586(0x7f04000a, float:1.754583E38)
            if (r9 == 0) goto L84
            android.content.res.Resources r9 = r6.getResources()
            android.content.res.Resources$Theme r9 = r9.newTheme()
            r9.setTo(r8)
            int r11 = r4.resourceId
            r9.applyStyle(r11, r3)
            r9.resolveAttribute(r10, r4, r3)
            goto L88
        L84:
            r8.resolveAttribute(r10, r4, r3)
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
            r9.applyStyle(r4, r3)
        L9e:
            if (r9 == 0) goto Lad
            kd r4 = new kd
            r4.<init>(r6, r1)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r9)
            r6 = r4
        Lad:
            ku r4 = new ku
            r4.<init>(r6)
            r4.e = r12
            ku r6 = r13.h
            if (r4 != r6) goto Lb9
            goto Lcb
        Lb9:
            if (r6 == 0) goto Lc0
            dr r8 = r13.i
            r6.r(r8)
        Lc0:
            r13.h = r4
            dr r6 = r13.i
            if (r6 == 0) goto Lcb
            android.content.Context r8 = r4.a
            r4.b(r6, r8)
        Lcb:
            ku r4 = r13.h
            if (r4 != 0) goto Ld0
            goto L113
        Ld0:
            if (r5 == 0) goto Leb
            gf r4 = r12.r
            if (r4 == 0) goto Leb
            g3 r6 = r12.s
            if (r6 != 0) goto Le2
            g3 r6 = new g3
            r8 = 2
            r6.<init>(r12, r8)
            r12.s = r6
        Le2:
            ku r6 = r13.h
            g3 r8 = r12.s
            androidx.appcompat.widget.ActionBarOverlayLayout r4 = (androidx.appcompat.widget.ActionBarOverlayLayout) r4
            r4.l(r6, r8)
        Leb:
            ku r4 = r13.h
            r4.w()
            ku r4 = r13.h
            boolean r2 = r0.onCreatePanelMenu(r2, r4)
            if (r2 != 0) goto L114
            ku r14 = r13.h
            if (r14 != 0) goto Lfd
            goto L106
        Lfd:
            if (r14 == 0) goto L104
            dr r0 = r13.i
            r14.r(r0)
        L104:
            r13.h = r7
        L106:
            if (r5 == 0) goto L113
            gf r13 = r12.r
            if (r13 == 0) goto L113
            g3 r14 = r12.s
            androidx.appcompat.widget.ActionBarOverlayLayout r13 = (androidx.appcompat.widget.ActionBarOverlayLayout) r13
            r13.l(r7, r14)
        L113:
            return r1
        L114:
            r13.o = r1
        L116:
            ku r2 = r13.h
            r2.w()
            android.os.Bundle r2 = r13.p
            if (r2 == 0) goto L126
            ku r4 = r13.h
            r4.s(r2)
            r13.p = r7
        L126:
            android.view.View r2 = r13.g
            ku r4 = r13.h
            boolean r0 = r0.onPreparePanel(r1, r2, r4)
            if (r0 != 0) goto L143
            if (r5 == 0) goto L13d
            gf r14 = r12.r
            if (r14 == 0) goto L13d
            g3 r0 = r12.s
            androidx.appcompat.widget.ActionBarOverlayLayout r14 = (androidx.appcompat.widget.ActionBarOverlayLayout) r14
            r14.l(r7, r0)
        L13d:
            ku r13 = r13.h
            r13.v()
            return r1
        L143:
            if (r14 == 0) goto L14a
            int r14 = r14.getDeviceId()
            goto L14b
        L14a:
            r14 = -1
        L14b:
            android.view.KeyCharacterMap r14 = android.view.KeyCharacterMap.load(r14)
            int r14 = r14.getKeyboardType()
            if (r14 == r3) goto L157
            r14 = r3
            goto L158
        L157:
            r14 = r1
        L158:
            ku r0 = r13.h
            r0.setQwertyMode(r14)
            ku r14 = r13.h
            r14.v()
        L162:
            r13.k = r3
            r13.l = r1
            r12.M = r13
            return r3
    }

    public final void H() {
            r2 = this;
            boolean r0 = r2.z
            if (r0 != 0) goto L5
            return
        L5:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.String r1 = "Window feature must be requested before adding content"
            r0.<init>(r1)
            throw r0
    }

    public final void I() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L36
            android.window.OnBackInvokedDispatcher r0 = r3.f0
            r1 = 0
            if (r0 != 0) goto Lc
            goto L1c
        Lc:
            q3 r0 = r3.z(r1)
            boolean r0 = r0.m
            r2 = 1
            if (r0 == 0) goto L17
        L15:
            r1 = r2
            goto L1c
        L17:
            n1 r0 = r3.u
            if (r0 == 0) goto L1c
            goto L15
        L1c:
            if (r1 == 0) goto L2b
            android.window.OnBackInvokedCallback r0 = r3.g0
            if (r0 != 0) goto L2b
            android.window.OnBackInvokedDispatcher r0 = r3.f0
            android.window.OnBackInvokedCallback r0 = defpackage.k3.b(r0, r3)
            r3.g0 = r0
            return
        L2b:
            if (r1 != 0) goto L36
            android.window.OnBackInvokedCallback r0 = r3.g0
            if (r0 == 0) goto L36
            android.window.OnBackInvokedDispatcher r1 = r3.f0
            defpackage.k3.c(r1, r0)
        L36:
            return
    }

    @Override // defpackage.e3
    public final void a() {
            r2 = this;
            android.content.Context r0 = r2.k
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.LayoutInflater$Factory r1 = r0.getFactory()
            if (r1 != 0) goto L10
            r0.setFactory2(r2)
            return
        L10:
            android.view.LayoutInflater$Factory2 r0 = r0.getFactory2()
            boolean r0 = r0 instanceof defpackage.r3
            if (r0 != 0) goto L1f
            java.lang.String r0 = "AppCompatDelegate"
            java.lang.String r1 = "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's"
            android.util.Log.i(r0, r1)
        L1f:
            return
    }

    @Override // defpackage.e3
    public final void b() {
            r1 = this;
            yb0 r0 = r1.o
            if (r0 == 0) goto L10
            r1.A()
            yb0 r0 = r1.o
            r0.getClass()
            r0 = 0
            r1.B(r0)
        L10:
            return
    }

    @Override // defpackage.e3
    public final void d() {
            r4 = this;
            r0 = 1
            r4.O = r0
            r1 = 0
            r4.m(r1, r0)
            r4.x()
            java.lang.Object r1 = r4.j
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L44
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.IllegalArgumentException -> L22
            android.content.ComponentName r2 = r1.getComponentName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b java.lang.IllegalArgumentException -> L22
            java.lang.String r1 = defpackage.zt.t(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b java.lang.IllegalArgumentException -> L22
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
            yb0 r1 = r4.o
            if (r1 != 0) goto L2c
            r4.b0 = r0
            goto L2f
        L2c:
            r1.N(r0)
        L2f:
            java.lang.Object r1 = defpackage.e3.h
            monitor-enter(r1)
            defpackage.e3.f(r4)     // Catch: java.lang.Throwable -> L41
            q6 r2 = defpackage.e3.g     // Catch: java.lang.Throwable -> L41
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
            r4.R = r1
            r4.P = r0
            return
    }

    @Override // defpackage.e3
    public final void e() {
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.e3.h
            monitor-enter(r0)
            defpackage.e3.f(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.Y
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            f3 r1 = r3.a0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.Q = r0
            int r0 = r3.S
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            u30 r0 = defpackage.r3.h0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            u30 r0 = defpackage.r3.h0
            java.lang.Object r1 = r3.j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            m3 r0 = r3.W
            if (r0 == 0) goto L63
            r0.c()
        L63:
            m3 r0 = r3.X
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            return
    }

    @Override // defpackage.e3
    public final boolean g(int r6) {
            r5 = this;
            r0 = 8
            r1 = 109(0x6d, float:1.53E-43)
            r2 = 108(0x6c, float:1.51E-43)
            java.lang.String r3 = "AppCompatDelegate"
            if (r6 != r0) goto L11
            java.lang.String r6 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature."
            android.util.Log.i(r3, r6)
            r6 = r2
            goto L1b
        L11:
            r0 = 9
            if (r6 != r0) goto L1b
            java.lang.String r6 = "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature."
            android.util.Log.i(r3, r6)
            r6 = r1
        L1b:
            boolean r0 = r5.J
            r3 = 0
            if (r0 == 0) goto L23
            if (r6 != r2) goto L23
            return r3
        L23:
            boolean r0 = r5.F
            r4 = 1
            if (r0 == 0) goto L2c
            if (r6 != r4) goto L2c
            r5.F = r3
        L2c:
            if (r6 == r4) goto L61
            r0 = 2
            if (r6 == r0) goto L5b
            r0 = 5
            if (r6 == r0) goto L55
            r0 = 10
            if (r6 == r0) goto L4f
            if (r6 == r2) goto L49
            if (r6 == r1) goto L43
            android.view.Window r0 = r5.l
            boolean r6 = r0.requestFeature(r6)
            return r6
        L43:
            r5.H()
            r5.G = r4
            return r4
        L49:
            r5.H()
            r5.F = r4
            return r4
        L4f:
            r5.H()
            r5.H = r4
            return r4
        L55:
            r5.H()
            r5.E = r4
            return r4
        L5b:
            r5.H()
            r5.D = r4
            return r4
        L61:
            r5.H()
            r5.J = r4
            return r4
    }

    @Override // defpackage.e3
    public final void h(int r3) {
            r2 = this;
            r2.w()
            android.view.ViewGroup r0 = r2.A
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            android.content.Context r1 = r2.k
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r1.inflate(r3, r0)
            l3 r3 = r2.m
            android.view.Window r0 = r2.l
            android.view.Window$Callback r0 = r0.getCallback()
            r3.a(r0)
            return
    }

    @Override // defpackage.e3
    public final void i(android.view.View r3) {
            r2 = this;
            r2.w()
            android.view.ViewGroup r0 = r2.A
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r0.addView(r3)
            l3 r3 = r2.m
            android.view.Window r0 = r2.l
            android.view.Window$Callback r0 = r0.getCallback()
            r3.a(r0)
            return
    }

    @Override // defpackage.e3
    public final void j(android.view.View r3, android.view.ViewGroup.LayoutParams r4) {
            r2 = this;
            r2.w()
            android.view.ViewGroup r0 = r2.A
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeAllViews()
            r0.addView(r3, r4)
            l3 r3 = r2.m
            android.view.Window r4 = r2.l
            android.view.Window$Callback r4 = r4.getCallback()
            r3.a(r4)
            return
    }

    @Override // defpackage.iu
    public final void k(defpackage.ku r6) {
            r5 = this;
            gf r6 = r5.r
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Le3
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            hf r6 = r6.e
            k70 r6 = (defpackage.k70) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Le3
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto Le3
            boolean r6 = r6.s
            if (r6 == 0) goto Le3
            android.content.Context r6 = r5.k
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L4a
            gf r6 = r5.r
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            hf r6 = r6.e
            k70 r6 = (defpackage.k70) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto Le3
            j1 r6 = r6.t
            if (r6 == 0) goto Le3
            h1 r2 = r6.u
            if (r2 != 0) goto L4a
            boolean r6 = r6.j()
            if (r6 == 0) goto Le3
        L4a:
            android.view.Window r6 = r5.l
            android.view.Window$Callback r6 = r6.getCallback()
            gf r2 = r5.r
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.k()
            hf r2 = r2.e
            k70 r2 = (defpackage.k70) r2
            androidx.appcompat.widget.Toolbar r2 = r2.a
            androidx.appcompat.widget.ActionMenuView r2 = r2.a
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L94
            j1 r2 = r2.t
            if (r2 == 0) goto L94
            boolean r2 = r2.j()
            if (r2 == 0) goto L94
            gf r0 = r5.r
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.k()
            hf r0 = r0.e
            k70 r0 = (defpackage.k70) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.a
            if (r0 == 0) goto L86
            j1 r0 = r0.t
            if (r0 == 0) goto L86
            boolean r0 = r0.f()
        L86:
            boolean r0 = r5.Q
            if (r0 != 0) goto Le2
            q3 r0 = r5.z(r1)
            ku r0 = r0.h
            r6.onPanelClosed(r3, r0)
            return
        L94:
            if (r6 == 0) goto Le2
            boolean r2 = r5.Q
            if (r2 != 0) goto Le2
            boolean r2 = r5.Y
            if (r2 == 0) goto Lb1
            int r2 = r5.Z
            r0 = r0 & r2
            if (r0 == 0) goto Lb1
            android.view.Window r0 = r5.l
            android.view.View r0 = r0.getDecorView()
            f3 r2 = r5.a0
            r0.removeCallbacks(r2)
            r2.run()
        Lb1:
            q3 r0 = r5.z(r1)
            ku r2 = r0.h
            if (r2 == 0) goto Le2
            boolean r4 = r0.o
            if (r4 != 0) goto Le2
            android.view.View r4 = r0.g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Le2
            ku r0 = r0.h
            r6.onMenuOpened(r3, r0)
            gf r6 = r5.r
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.k()
            hf r6 = r6.e
            k70 r6 = (defpackage.k70) r6
            androidx.appcompat.widget.Toolbar r6 = r6.a
            androidx.appcompat.widget.ActionMenuView r6 = r6.a
            if (r6 == 0) goto Le2
            j1 r6 = r6.t
            if (r6 == 0) goto Le2
            r6.l()
        Le2:
            return
        Le3:
            q3 r6 = r5.z(r1)
            r6.n = r0
            r5.s(r6, r1)
            r0 = 0
            r5.E(r6, r0)
            return
    }

    @Override // defpackage.e3
    public final void l(java.lang.CharSequence r4) {
            r3 = this;
            r3.q = r4
            gf r0 = r3.r
            if (r0 == 0) goto La
            r0.setWindowTitle(r4)
            return
        La:
            yb0 r0 = r3.o
            if (r0 == 0) goto L2f
            hf r0 = r0.A
            k70 r0 = (defpackage.k70) r0
            boolean r1 = r0.g
            if (r1 != 0) goto L36
            androidx.appcompat.widget.Toolbar r1 = r0.a
            r0.h = r4
            int r2 = r0.b
            r2 = r2 & 8
            if (r2 == 0) goto L36
            r1.setTitle(r4)
            boolean r0 = r0.g
            if (r0 == 0) goto L36
            android.view.View r0 = r1.getRootView()
            defpackage.ja0.m(r0, r4)
            return
        L2f:
            android.widget.TextView r0 = r3.B
            if (r0 == 0) goto L36
            r0.setText(r4)
        L36:
            return
    }

    public final boolean m(boolean r13, boolean r14) {
            r12 = this;
            boolean r0 = r12.Q
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = -100
            int r2 = r12.S
            if (r2 == r0) goto Ld
            goto Lf
        Ld:
            int r2 = defpackage.e3.b
        Lf:
            android.content.Context r0 = r12.k
            int r3 = r12.C(r0, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            r6 = 0
            if (r4 >= r5) goto L21
            sr r5 = p(r0)
            goto L22
        L21:
            r5 = r6
        L22:
            if (r14 != 0) goto L32
            if (r5 == 0) goto L32
            android.content.res.Resources r14 = r0.getResources()
            android.content.res.Configuration r14 = r14.getConfiguration()
            sr r5 = defpackage.i3.b(r14)
        L32:
            android.content.res.Configuration r14 = t(r0, r3, r5, r6, r1)
            boolean r3 = r12.V
            r7 = 1
            java.lang.Object r8 = r12.j
            if (r3 != 0) goto L70
            boolean r3 = r8 instanceof android.app.Activity
            if (r3 == 0) goto L70
            android.content.pm.PackageManager r3 = r0.getPackageManager()
            if (r3 != 0) goto L49
            r3 = r1
            goto L74
        L49:
            r9 = 29
            if (r4 < r9) goto L50
            r4 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L52
        L50:
            r4 = 786432(0xc0000, float:1.102026E-39)
        L52:
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            java.lang.Class r10 = r8.getClass()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            r9.<init>(r0, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            android.content.pm.ActivityInfo r3 = r3.getActivityInfo(r9, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            if (r3 == 0) goto L70
            int r3 = r3.configChanges     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            r12.U = r3     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            goto L70
        L66:
            r3 = move-exception
            java.lang.String r4 = "AppCompatDelegate"
            java.lang.String r9 = "Exception while getting ActivityInfo"
            android.util.Log.d(r4, r9, r3)
            r12.U = r1
        L70:
            r12.V = r7
            int r3 = r12.U
        L74:
            android.content.res.Configuration r4 = r12.R
            if (r4 != 0) goto L80
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
        L80:
            int r9 = r4.uiMode
            r9 = r9 & 48
            int r10 = r14.uiMode
            r10 = r10 & 48
            sr r4 = defpackage.i3.b(r4)
            if (r5 != 0) goto L90
            r14 = r6
            goto L94
        L90:
            sr r14 = defpackage.i3.b(r14)
        L94:
            if (r9 == r10) goto L99
            r5 = 512(0x200, float:7.17E-43)
            goto L9a
        L99:
            r5 = r1
        L9a:
            if (r14 == 0) goto La4
            boolean r4 = r4.equals(r14)
            if (r4 != 0) goto La4
            r5 = r5 | 8196(0x2004, float:1.1485E-41)
        La4:
            int r4 = ~r3
            r4 = r4 & r5
            if (r4 == 0) goto Le1
            if (r13 == 0) goto Le1
            boolean r13 = r12.O
            if (r13 == 0) goto Le1
            boolean r13 = defpackage.r3.j0
            if (r13 != 0) goto Lb6
            boolean r13 = r12.P
            if (r13 == 0) goto Le1
        Lb6:
            boolean r13 = r8 instanceof android.app.Activity
            if (r13 == 0) goto Le1
            r13 = r8
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r4 = r13.isChild()
            if (r4 != 0) goto Le1
            int r4 = android.os.Build.VERSION.SDK_INT
            r9 = 28
            if (r4 < r9) goto Lcd
            r13.recreate()
            goto Ldf
        Lcd:
            android.os.Handler r4 = new android.os.Handler
            android.os.Looper r9 = r13.getMainLooper()
            r4.<init>(r9)
            p1 r9 = new p1
            r11 = 0
            r9.<init>(r11, r13)
            r4.post(r9)
        Ldf:
            r13 = r7
            goto Le2
        Le1:
            r13 = r1
        Le2:
            if (r13 != 0) goto L148
            if (r5 == 0) goto L148
            r13 = r5 & r3
            if (r13 != r5) goto Leb
            r1 = r7
        Leb:
            android.content.res.Resources r13 = r0.getResources()
            android.content.res.Configuration r3 = new android.content.res.Configuration
            android.content.res.Configuration r4 = r13.getConfiguration()
            r3.<init>(r4)
            android.content.res.Configuration r4 = r13.getConfiguration()
            int r4 = r4.uiMode
            r4 = r4 & (-49)
            r4 = r4 | r10
            r3.uiMode = r4
            if (r14 == 0) goto L108
            defpackage.i3.d(r3, r14)
        L108:
            r13.updateConfiguration(r3, r6)
            int r13 = r12.T
            if (r13 == 0) goto L11b
            r0.setTheme(r13)
            android.content.res.Resources$Theme r13 = r0.getTheme()
            int r4 = r12.T
            r13.applyStyle(r4, r7)
        L11b:
            if (r1 == 0) goto L149
            boolean r13 = r8 instanceof android.app.Activity
            if (r13 == 0) goto L149
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r13 = r8 instanceof defpackage.oq
            if (r13 == 0) goto L13c
            r13 = r8
            oq r13 = (defpackage.oq) r13
            androidx.lifecycle.a r13 = r13.e()
            jq r13 = r13.c
            jq r1 = defpackage.jq.c
            int r13 = r13.compareTo(r1)
            if (r13 < 0) goto L149
            r8.onConfigurationChanged(r3)
            goto L149
        L13c:
            boolean r13 = r12.P
            if (r13 == 0) goto L149
            boolean r13 = r12.Q
            if (r13 != 0) goto L149
            r8.onConfigurationChanged(r3)
            goto L149
        L148:
            r7 = r13
        L149:
            if (r7 == 0) goto L15c
            if (r14 == 0) goto L15c
            android.content.res.Resources r13 = r0.getResources()
            android.content.res.Configuration r13 = r13.getConfiguration()
            sr r13 = defpackage.i3.b(r13)
            defpackage.i3.c(r13)
        L15c:
            if (r2 != 0) goto L166
            o3 r13 = r12.y(r0)
            r13.i()
            goto L16d
        L166:
            m3 r13 = r12.W
            if (r13 == 0) goto L16d
            r13.c()
        L16d:
            r13 = 3
            if (r2 != r13) goto L181
            m3 r13 = r12.X
            if (r13 != 0) goto L17b
            m3 r13 = new m3
            r13.<init>(r12, r0)
            r12.X = r13
        L17b:
            m3 r13 = r12.X
            r13.i()
            goto L188
        L181:
            m3 r13 = r12.X
            if (r13 == 0) goto L188
            r13.c()
        L188:
            return r7
    }

    @Override // defpackage.iu
    public final boolean n(defpackage.ku r8, android.view.MenuItem r9) {
            r7 = this;
            android.view.Window r0 = r7.l
            android.view.Window$Callback r0 = r0.getCallback()
            r1 = 0
            if (r0 == 0) goto L31
            boolean r2 = r7.Q
            if (r2 != 0) goto L31
            ku r8 = r8.k()
            q3[] r2 = r7.L
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
            ku r6 = r5.h
            if (r6 != r8) goto L24
            goto L28
        L24:
            int r4 = r4 + 1
            goto L19
        L27:
            r5 = 0
        L28:
            if (r5 == 0) goto L31
            int r8 = r5.a
            boolean r8 = r0.onMenuItemSelected(r8, r9)
            return r8
        L31:
            return r1
    }

    public final void o(android.view.Window r8) {
            r7 = this;
            java.lang.String r0 = "AppCompat has already installed itself into the Window"
            android.view.Window r1 = r7.l
            if (r1 != 0) goto L80
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof defpackage.l3
            if (r2 != 0) goto L7a
            l3 r0 = new l3
            r0.<init>(r7, r1)
            r7.m = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.k
            int[] r1 = defpackage.r3.i0
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            u3 r4 = defpackage.u3.a()
            monitor-enter(r4)
            w00 r5 = r4.a     // Catch: java.lang.Throwable -> L3c
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
            android.window.OnBackInvokedDispatcher r8 = r7.f0
            if (r8 != 0) goto L79
            java.lang.Object r0 = r7.j
            if (r8 == 0) goto L61
            android.window.OnBackInvokedCallback r1 = r7.g0
            if (r1 == 0) goto L61
            defpackage.k3.c(r8, r1)
            r7.g0 = r2
        L61:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L74
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = defpackage.k3.a(r0)
            r7.f0 = r8
            goto L76
        L74:
            r7.f0 = r2
        L76:
            r7.I()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r0)
            throw r8
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r0)
            throw r8
    }

    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
            r8 = this;
            q5 r9 = r8.e0
            r1 = 0
            if (r9 != 0) goto L52
            int[] r9 = defpackage.xy.j
            android.content.Context r0 = r8.k
            android.content.res.TypedArray r9 = r0.obtainStyledAttributes(r9)
            r2 = 116(0x74, float:1.63E-43)
            java.lang.String r9 = r9.getString(r2)
            if (r9 != 0) goto L1d
            q5 r9 = new q5
            r9.<init>()
            r8.e0 = r9
            goto L52
        L1d:
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L32
            java.lang.Class r0 = r0.loadClass(r9)     // Catch: java.lang.Throwable -> L32
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L32
            q5 r0 = (defpackage.q5) r0     // Catch: java.lang.Throwable -> L32
            r8.e0 = r0     // Catch: java.lang.Throwable -> L32
            goto L52
        L32:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to instantiate custom view inflater "
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r9 = ". Falling back to default."
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            java.lang.String r2 = "AppCompatDelegate"
            android.util.Log.i(r2, r9, r0)
            q5 r9 = new q5
            r9.<init>()
            r8.e0 = r9
        L52:
            q5 r9 = r8.e0
            int r0 = defpackage.f90.a
            r9.getClass()
            int[] r0 = defpackage.xy.y
            r5 = 0
            android.content.res.TypedArray r0 = r11.obtainStyledAttributes(r12, r0, r5, r5)
            r2 = 4
            int r3 = r0.getResourceId(r2, r5)
            if (r3 == 0) goto L6e
            java.lang.String r4 = "AppCompatViewInflater"
            java.lang.String r6 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r4, r6)
        L6e:
            r0.recycle()
            if (r3 == 0) goto L84
            boolean r0 = r11 instanceof defpackage.kd
            if (r0 == 0) goto L7e
            r0 = r11
            kd r0 = (defpackage.kd) r0
            int r0 = r0.a
            if (r0 == r3) goto L84
        L7e:
            kd r0 = new kd
            r0.<init>(r11, r3)
            goto L85
        L84:
            r0 = r11
        L85:
            r10.getClass()
            int r3 = r10.hashCode()
            r4 = 3
            r6 = 1
            r7 = -1
            switch(r3) {
                case -1946472170: goto L131;
                case -1455429095: goto L125;
                case -1346021293: goto L119;
                case -938935918: goto L10d;
                case -937446323: goto L104;
                case -658531749: goto Lf9;
                case -339785223: goto Lee;
                case 776382189: goto Le3;
                case 799298502: goto Ld6;
                case 1125864064: goto Lc9;
                case 1413872058: goto Lbc;
                case 1601505219: goto Laf;
                case 1666676343: goto La2;
                case 2001146706: goto L95;
                default: goto L92;
            }
        L92:
            r2 = r7
            goto L13c
        L95:
            java.lang.String r2 = "Button"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L9e
            goto L92
        L9e:
            r2 = 13
            goto L13c
        La2:
            java.lang.String r2 = "EditText"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto Lab
            goto L92
        Lab:
            r2 = 12
            goto L13c
        Laf:
            java.lang.String r2 = "CheckBox"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto Lb8
            goto L92
        Lb8:
            r2 = 11
            goto L13c
        Lbc:
            java.lang.String r2 = "AutoCompleteTextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto Lc5
            goto L92
        Lc5:
            r2 = 10
            goto L13c
        Lc9:
            java.lang.String r2 = "ImageView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto Ld2
            goto L92
        Ld2:
            r2 = 9
            goto L13c
        Ld6:
            java.lang.String r2 = "ToggleButton"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto Ldf
            goto L92
        Ldf:
            r2 = 8
            goto L13c
        Le3:
            java.lang.String r2 = "RadioButton"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto Lec
            goto L92
        Lec:
            r2 = 7
            goto L13c
        Lee:
            java.lang.String r2 = "Spinner"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto Lf7
            goto L92
        Lf7:
            r2 = 6
            goto L13c
        Lf9:
            java.lang.String r2 = "SeekBar"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L102
            goto L92
        L102:
            r2 = 5
            goto L13c
        L104:
            java.lang.String r3 = "ImageButton"
            boolean r3 = r10.equals(r3)
            if (r3 != 0) goto L13c
            goto L92
        L10d:
            java.lang.String r2 = "TextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L117
            goto L92
        L117:
            r2 = r4
            goto L13c
        L119:
            java.lang.String r2 = "MultiAutoCompleteTextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L123
            goto L92
        L123:
            r2 = 2
            goto L13c
        L125:
            java.lang.String r2 = "CheckedTextView"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L12f
            goto L92
        L12f:
            r2 = r6
            goto L13c
        L131:
            java.lang.String r2 = "RatingBar"
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L13b
            goto L92
        L13b:
            r2 = 0
        L13c:
            switch(r2) {
                case 0: goto L18d;
                case 1: goto L187;
                case 2: goto L181;
                case 3: goto L17c;
                case 4: goto L173;
                case 5: goto L16d;
                case 6: goto L167;
                case 7: goto L162;
                case 8: goto L15c;
                case 9: goto L156;
                case 10: goto L151;
                case 11: goto L14c;
                case 12: goto L146;
                case 13: goto L141;
                default: goto L13f;
            }
        L13f:
            r2 = r1
            goto L192
        L141:
            w2 r2 = r9.b(r0, r12)
            goto L192
        L146:
            w3 r2 = new w3
            r2.<init>(r0, r12)
            goto L192
        L14c:
            y2 r2 = r9.c(r0, r12)
            goto L192
        L151:
            u2 r2 = r9.a(r0, r12)
            goto L192
        L156:
            a4 r2 = new a4
            r2.<init>(r0, r12, r5)
            goto L192
        L15c:
            o5 r2 = new o5
            r2.<init>(r0, r12)
            goto L192
        L162:
            e4 r2 = r9.d(r0, r12)
            goto L192
        L167:
            v4 r2 = new v4
            r2.<init>(r0, r12)
            goto L192
        L16d:
            h4 r2 = new h4
            r2.<init>(r0, r12)
            goto L192
        L173:
            y3 r2 = new y3
            r3 = 2130969107(0x7f040213, float:1.7546887E38)
            r2.<init>(r0, r12, r3)
            goto L192
        L17c:
            g5 r2 = r9.e(r0, r12)
            goto L192
        L181:
            b4 r2 = new b4
            r2.<init>(r0, r12)
            goto L192
        L187:
            z2 r2 = new z2
            r2.<init>(r0, r12)
            goto L192
        L18d:
            f4 r2 = new f4
            r2.<init>(r0, r12)
        L192:
            if (r2 != 0) goto L1e4
            if (r11 == r0) goto L1e4
            java.lang.Object[] r11 = r9.a
            java.lang.String r2 = "view"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L1a6
            java.lang.String r10 = "class"
            java.lang.String r10 = r12.getAttributeValue(r1, r10)
        L1a6:
            r11[r5] = r0     // Catch: java.lang.Throwable -> L1c8 java.lang.Exception -> L1df
            r11[r6] = r12     // Catch: java.lang.Throwable -> L1c8 java.lang.Exception -> L1df
            r2 = 46
            int r2 = r10.indexOf(r2)     // Catch: java.lang.Throwable -> L1c8 java.lang.Exception -> L1df
            if (r7 != r2) goto L1d0
            r2 = r5
        L1b3:
            java.lang.String[] r3 = defpackage.q5.g     // Catch: java.lang.Throwable -> L1c8 java.lang.Exception -> L1df
            if (r2 >= r4) goto L1cb
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L1c8 java.lang.Exception -> L1df
            android.view.View r3 = r9.f(r0, r10, r3)     // Catch: java.lang.Throwable -> L1c8 java.lang.Exception -> L1df
            if (r3 == 0) goto L1c5
            r11[r5] = r1
            r11[r6] = r1
            r1 = r3
            goto L1e5
        L1c5:
            int r2 = r2 + 1
            goto L1b3
        L1c8:
            r0 = move-exception
            r9 = r0
            goto L1da
        L1cb:
            r11[r5] = r1
            r11[r6] = r1
            goto L1e5
        L1d0:
            android.view.View r9 = r9.f(r0, r10, r1)     // Catch: java.lang.Throwable -> L1c8 java.lang.Exception -> L1df
            r11[r5] = r1
            r11[r6] = r1
            r1 = r9
            goto L1e5
        L1da:
            r11[r5] = r1
            r11[r6] = r1
            throw r9
        L1df:
            r11[r5] = r1
            r11[r6] = r1
            goto L1e5
        L1e4:
            r1 = r2
        L1e5:
            if (r1 == 0) goto L278
            android.content.Context r9 = r1.getContext()
            boolean r10 = r9 instanceof android.content.ContextWrapper
            if (r10 == 0) goto L20f
            java.util.WeakHashMap r10 = defpackage.ja0.a
            boolean r10 = defpackage.r90.a(r1)
            if (r10 != 0) goto L1f8
            goto L20f
        L1f8:
            int[] r10 = defpackage.q5.c
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r12, r10)
            java.lang.String r10 = r9.getString(r5)
            if (r10 == 0) goto L20c
            p5 r11 = new p5
            r11.<init>(r1, r10)
            r1.setOnClickListener(r11)
        L20c:
            r9.recycle()
        L20f:
            int r9 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r9 <= r6) goto L216
            goto L278
        L216:
            int[] r9 = defpackage.q5.d
            android.content.res.TypedArray r9 = r0.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r5)
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            if (r10 == 0) goto L23a
            boolean r10 = r9.getBoolean(r5, r5)
            java.util.WeakHashMap r11 = defpackage.ja0.a
            p90 r2 = new p90
            r3 = 2131296643(0x7f090183, float:1.8211208E38)
            r7 = 2
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r2.d(r1, r10)
        L23a:
            r9.recycle()
            int[] r9 = defpackage.q5.e
            android.content.res.TypedArray r9 = r0.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r5)
            if (r10 == 0) goto L250
            java.lang.String r10 = r9.getString(r5)
            defpackage.ja0.m(r1, r10)
        L250:
            r9.recycle()
            int[] r9 = defpackage.q5.f
            android.content.res.TypedArray r9 = r0.obtainStyledAttributes(r12, r9)
            boolean r10 = r9.hasValue(r5)
            if (r10 == 0) goto L275
            boolean r10 = r9.getBoolean(r5, r5)
            java.util.WeakHashMap r11 = defpackage.ja0.a
            p90 r2 = new p90
            r3 = 2131296648(0x7f090188, float:1.8211219E38)
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r2.d(r1, r10)
        L275:
            r9.recycle()
        L278:
            return r1
    }

    @Override // android.view.LayoutInflater.Factory
    public final android.view.View onCreateView(java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.onCreateView(r0, r2, r3, r4)
            return r2
    }

    public final void q(int r4, defpackage.q3 r5, defpackage.ku r6) {
            r3 = this;
            if (r6 != 0) goto L11
            if (r5 != 0) goto Ld
            if (r4 < 0) goto Ld
            q3[] r0 = r3.L
            int r1 = r0.length
            if (r4 >= r1) goto Ld
            r5 = r0[r4]
        Ld:
            if (r5 == 0) goto L11
            ku r6 = r5.h
        L11:
            if (r5 == 0) goto L18
            boolean r5 = r5.m
            if (r5 != 0) goto L18
            goto L35
        L18:
            boolean r5 = r3.Q
            if (r5 != 0) goto L35
            l3 r5 = r3.m
            android.view.Window r0 = r3.l
            android.view.Window$Callback r0 = r0.getCallback()
            r5.getClass()
            r1 = 1
            r2 = 0
            r5.d = r1     // Catch: java.lang.Throwable -> L31
            r0.onPanelClosed(r4, r6)     // Catch: java.lang.Throwable -> L31
            r5.d = r2
            return
        L31:
            r4 = move-exception
            r5.d = r2
            throw r4
        L35:
            return
    }

    public final void r(defpackage.ku r3) {
            r2 = this;
            boolean r0 = r2.K
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r2.K = r0
            gf r0 = r2.r
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.k()
            hf r0 = r0.e
            k70 r0 = (defpackage.k70) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.a
            if (r0 == 0) goto L2f
            j1 r0 = r0.t
            if (r0 == 0) goto L2f
            r0.f()
            f1 r0 = r0.t
            if (r0 == 0) goto L2f
            boolean r1 = r0.b()
            if (r1 == 0) goto L2f
            tu r0 = r0.i
            r0.dismiss()
        L2f:
            android.view.Window r0 = r2.l
            android.view.Window$Callback r0 = r0.getCallback()
            if (r0 == 0) goto L40
            boolean r1 = r2.Q
            if (r1 != 0) goto L40
            r1 = 108(0x6c, float:1.51E-43)
            r0.onPanelClosed(r1, r3)
        L40:
            r3 = 0
            r2.K = r3
            return
    }

    public final void s(defpackage.q3 r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L29
            int r0 = r4.a
            if (r0 != 0) goto L29
            gf r0 = r3.r
            if (r0 == 0) goto L29
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.k()
            hf r0 = r0.e
            k70 r0 = (defpackage.k70) r0
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.a
            if (r0 == 0) goto L29
            j1 r0 = r0.t
            if (r0 == 0) goto L29
            boolean r0 = r0.j()
            if (r0 == 0) goto L29
            ku r4 = r4.h
            r3.r(r4)
            return
        L29:
            android.content.Context r0 = r3.k
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            r1 = 0
            if (r0 == 0) goto L48
            boolean r2 = r4.m
            if (r2 == 0) goto L48
            p3 r2 = r4.e
            if (r2 == 0) goto L48
            r0.removeView(r2)
            if (r5 == 0) goto L48
            int r5 = r4.a
            r3.q(r5, r4, r1)
        L48:
            r5 = 0
            r4.k = r5
            r4.l = r5
            r4.m = r5
            r4.f = r1
            r5 = 1
            r4.n = r5
            q3 r5 = r3.M
            if (r5 != r4) goto L5a
            r3.M = r1
        L5a:
            int r4 = r4.a
            if (r4 != 0) goto L61
            r3.I()
        L61:
            return
    }

    public final boolean u(android.view.KeyEvent r7) {
            r6 = this;
            java.lang.Object r0 = r6.j
            boolean r1 = r0 instanceof defpackage.aq
            r2 = 1
            if (r1 != 0) goto Lb
            boolean r0 = r0 instanceof defpackage.g2
            if (r0 == 0) goto L1b
        Lb:
            android.view.Window r0 = r6.l
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L1b
            boolean r0 = defpackage.ip.r(r0, r7)
            if (r0 == 0) goto L1b
            goto L14d
        L1b:
            int r0 = r7.getKeyCode()
            r1 = 0
            r3 = 82
            if (r0 != r3) goto L3f
            l3 r0 = r6.m
            android.view.Window r4 = r6.l
            android.view.Window$Callback r4 = r4.getCallback()
            r0.getClass()
            r0.c = r2     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r4.dispatchKeyEvent(r7)     // Catch: java.lang.Throwable -> L3b
            r0.c = r1
            if (r4 == 0) goto L3f
            goto L14d
        L3b:
            r7 = move-exception
            r0.c = r1
            throw r7
        L3f:
            int r0 = r7.getKeyCode()
            int r4 = r7.getAction()
            r5 = 4
            if (r4 != 0) goto L6f
            if (r0 == r5) goto L62
            if (r0 == r3) goto L50
            goto L14e
        L50:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L14d
            q3 r0 = r6.z(r1)
            boolean r1 = r0.m
            if (r1 != 0) goto L14d
            r6.G(r0, r7)
            return r2
        L62:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L6b
            goto L6c
        L6b:
            r2 = r1
        L6c:
            r6.N = r2
            return r1
        L6f:
            if (r0 == r5) goto L147
            if (r0 == r3) goto L75
            goto L14e
        L75:
            n1 r0 = r6.u
            if (r0 == 0) goto L7b
            goto L14d
        L7b:
            q3 r0 = r6.z(r1)
            gf r3 = r6.r
            android.content.Context r4 = r6.k
            if (r3 == 0) goto L105
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.k()
            hf r3 = r3.e
            k70 r3 = (defpackage.k70) r3
            androidx.appcompat.widget.Toolbar r3 = r3.a
            int r5 = r3.getVisibility()
            if (r5 != 0) goto L105
            androidx.appcompat.widget.ActionMenuView r3 = r3.a
            if (r3 == 0) goto L105
            boolean r3 = r3.s
            if (r3 == 0) goto L105
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r4)
            boolean r3 = r3.hasPermanentMenuKey()
            if (r3 != 0) goto L105
            gf r3 = r6.r
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.k()
            hf r3 = r3.e
            k70 r3 = (defpackage.k70) r3
            androidx.appcompat.widget.Toolbar r3 = r3.a
            androidx.appcompat.widget.ActionMenuView r3 = r3.a
            if (r3 == 0) goto Ldf
            j1 r3 = r3.t
            if (r3 == 0) goto Ldf
            boolean r3 = r3.j()
            if (r3 == 0) goto Ldf
            gf r7 = r6.r
            androidx.appcompat.widget.ActionBarOverlayLayout r7 = (androidx.appcompat.widget.ActionBarOverlayLayout) r7
            r7.k()
            hf r7 = r7.e
            k70 r7 = (defpackage.k70) r7
            androidx.appcompat.widget.Toolbar r7 = r7.a
            androidx.appcompat.widget.ActionMenuView r7 = r7.a
            if (r7 == 0) goto L125
            j1 r7 = r7.t
            if (r7 == 0) goto L125
            boolean r7 = r7.f()
            if (r7 == 0) goto L125
        Lde:
            goto L123
        Ldf:
            boolean r3 = r6.Q
            if (r3 != 0) goto L125
            boolean r7 = r6.G(r0, r7)
            if (r7 == 0) goto L125
            gf r7 = r6.r
            androidx.appcompat.widget.ActionBarOverlayLayout r7 = (androidx.appcompat.widget.ActionBarOverlayLayout) r7
            r7.k()
            hf r7 = r7.e
            k70 r7 = (defpackage.k70) r7
            androidx.appcompat.widget.Toolbar r7 = r7.a
            androidx.appcompat.widget.ActionMenuView r7 = r7.a
            if (r7 == 0) goto L125
            j1 r7 = r7.t
            if (r7 == 0) goto L125
            boolean r7 = r7.l()
            if (r7 == 0) goto L125
            goto Lde
        L105:
            boolean r3 = r0.m
            if (r3 != 0) goto L127
            boolean r5 = r0.l
            if (r5 == 0) goto L10e
            goto L127
        L10e:
            boolean r3 = r0.k
            if (r3 == 0) goto L125
            boolean r3 = r0.o
            if (r3 == 0) goto L11d
            r0.k = r1
            boolean r3 = r6.G(r0, r7)
            goto L11e
        L11d:
            r3 = r2
        L11e:
            if (r3 == 0) goto L125
            r6.E(r0, r7)
        L123:
            r7 = r2
            goto L12b
        L125:
            r7 = r1
            goto L12b
        L127:
            r6.s(r0, r2)
            r7 = r3
        L12b:
            if (r7 == 0) goto L14d
            android.content.Context r7 = r4.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L13f
            r7.playSoundEffect(r1)
            return r2
        L13f:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            return r2
        L147:
            boolean r7 = r6.D()
            if (r7 == 0) goto L14e
        L14d:
            return r2
        L14e:
            return r1
    }

    public final void v(int r4) {
            r3 = this;
            q3 r0 = r3.z(r4)
            ku r1 = r0.h
            if (r1 == 0) goto L24
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            ku r2 = r0.h
            r2.t(r1)
            int r2 = r1.size()
            if (r2 <= 0) goto L1a
            r0.p = r1
        L1a:
            ku r1 = r0.h
            r1.w()
            ku r1 = r0.h
            r1.clear()
        L24:
            r1 = 1
            r0.o = r1
            r0.n = r1
            r0 = 108(0x6c, float:1.51E-43)
            if (r4 == r0) goto L2f
            if (r4 != 0) goto L3e
        L2f:
            gf r4 = r3.r
            if (r4 == 0) goto L3e
            r4 = 0
            q3 r0 = r3.z(r4)
            r0.k = r4
            r4 = 0
            r3.G(r0, r4)
        L3e:
            return
    }

    public final void w() {
            r11 = this;
            boolean r0 = r11.z
            if (r0 != 0) goto L2b1
            android.content.Context r0 = r11.k
            int[] r1 = defpackage.xy.j
            android.content.res.TypedArray r2 = r0.obtainStyledAttributes(r1)
            r3 = 117(0x75, float:1.64E-43)
            boolean r4 = r2.hasValue(r3)
            if (r4 == 0) goto L2a6
            r4 = 126(0x7e, float:1.77E-43)
            r5 = 0
            boolean r4 = r2.getBoolean(r4, r5)
            r6 = 108(0x6c, float:1.51E-43)
            r7 = 1
            if (r4 == 0) goto L24
            r11.g(r7)
            goto L2d
        L24:
            boolean r3 = r2.getBoolean(r3, r5)
            if (r3 == 0) goto L2d
            r11.g(r6)
        L2d:
            r3 = 118(0x76, float:1.65E-43)
            boolean r3 = r2.getBoolean(r3, r5)
            r4 = 109(0x6d, float:1.53E-43)
            if (r3 == 0) goto L3a
            r11.g(r4)
        L3a:
            r3 = 119(0x77, float:1.67E-43)
            boolean r3 = r2.getBoolean(r3, r5)
            if (r3 == 0) goto L47
            r3 = 10
            r11.g(r3)
        L47:
            boolean r3 = r2.getBoolean(r5, r5)
            r11.I = r3
            r2.recycle()
            r11.x()
            android.view.Window r2 = r11.l
            r2.getDecorView()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            boolean r3 = r11.J
            r8 = 0
            if (r3 != 0) goto Ldb
            boolean r3 = r11.I
            if (r3 == 0) goto L74
            r3 = 2131492876(0x7f0c000c, float:1.8609216E38)
            android.view.View r2 = r2.inflate(r3, r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r11.G = r5
            r11.F = r5
            goto Lf2
        L74:
            boolean r2 = r11.F
            if (r2 == 0) goto Ld9
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r0.getTheme()
            r9 = 2130968585(0x7f040009, float:1.7545828E38)
            r3.resolveAttribute(r9, r2, r7)
            int r3 = r2.resourceId
            if (r3 == 0) goto L93
            kd r3 = new kd
            int r2 = r2.resourceId
            r3.<init>(r0, r2)
            goto L94
        L93:
            r3 = r0
        L94:
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r3)
            r3 = 2131492887(0x7f0c0017, float:1.8609239E38)
            android.view.View r2 = r2.inflate(r3, r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 2131296378(0x7f09007a, float:1.821067E38)
            android.view.View r3 = r2.findViewById(r3)
            gf r3 = (defpackage.gf) r3
            r11.r = r3
            android.view.Window r9 = r11.l
            android.view.Window$Callback r9 = r9.getCallback()
            r3.setWindowCallback(r9)
            boolean r3 = r11.G
            if (r3 == 0) goto Lc0
            gf r3 = r11.r
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.j(r4)
        Lc0:
            boolean r3 = r11.D
            if (r3 == 0) goto Lcc
            gf r3 = r11.r
            r4 = 2
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.j(r4)
        Lcc:
            boolean r3 = r11.E
            if (r3 == 0) goto Lf2
            gf r3 = r11.r
            r4 = 5
            androidx.appcompat.widget.ActionBarOverlayLayout r3 = (androidx.appcompat.widget.ActionBarOverlayLayout) r3
            r3.j(r4)
            goto Lf2
        Ld9:
            r2 = r8
            goto Lf2
        Ldb:
            boolean r3 = r11.H
            if (r3 == 0) goto Le9
            r3 = 2131492886(0x7f0c0016, float:1.8609237E38)
            android.view.View r2 = r2.inflate(r3, r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto Lf2
        Le9:
            r3 = 2131492885(0x7f0c0015, float:1.8609235E38)
            android.view.View r2 = r2.inflate(r3, r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        Lf2:
            if (r2 == 0) goto L263
            g3 r3 = new g3
            r3.<init>(r11, r5)
            java.util.WeakHashMap r4 = defpackage.ja0.a
            defpackage.y90.u(r2, r3)
            gf r3 = r11.r
            if (r3 != 0) goto L10d
            r3 = 2131296671(0x7f09019f, float:1.8211265E38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r11.B = r3
        L10d:
            java.lang.reflect.Method r3 = defpackage.cb0.a
            java.lang.String r3 = "Could not invoke makeOptionalFitsSystemWindows"
            java.lang.String r4 = "ViewUtils"
            java.lang.Class r9 = r2.getClass()     // Catch: java.lang.IllegalAccessException -> L127 java.lang.reflect.InvocationTargetException -> L129 java.lang.NoSuchMethodException -> L137
            java.lang.String r10 = "makeOptionalFitsSystemWindows"
            java.lang.reflect.Method r9 = r9.getMethod(r10, r8)     // Catch: java.lang.IllegalAccessException -> L127 java.lang.reflect.InvocationTargetException -> L129 java.lang.NoSuchMethodException -> L137
            boolean r10 = r9.isAccessible()     // Catch: java.lang.IllegalAccessException -> L127 java.lang.reflect.InvocationTargetException -> L129 java.lang.NoSuchMethodException -> L137
            if (r10 != 0) goto L12b
            r9.setAccessible(r7)     // Catch: java.lang.IllegalAccessException -> L127 java.lang.reflect.InvocationTargetException -> L129 java.lang.NoSuchMethodException -> L137
            goto L12b
        L127:
            r9 = move-exception
            goto L12f
        L129:
            r9 = move-exception
            goto L133
        L12b:
            r9.invoke(r2, r8)     // Catch: java.lang.IllegalAccessException -> L127 java.lang.reflect.InvocationTargetException -> L129 java.lang.NoSuchMethodException -> L137
            goto L13c
        L12f:
            android.util.Log.d(r4, r3, r9)
            goto L13c
        L133:
            android.util.Log.d(r4, r3, r9)
            goto L13c
        L137:
            java.lang.String r3 = "Could not find method makeOptionalFitsSystemWindows. Oh well..."
            android.util.Log.d(r4, r3)
        L13c:
            r3 = 2131296305(0x7f090031, float:1.8210523E38)
            android.view.View r3 = r2.findViewById(r3)
            androidx.appcompat.widget.ContentFrameLayout r3 = (androidx.appcompat.widget.ContentFrameLayout) r3
            android.view.Window r4 = r11.l
            r9 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r9)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 == 0) goto L173
        L152:
            int r10 = r4.getChildCount()
            if (r10 <= 0) goto L163
            android.view.View r10 = r4.getChildAt(r5)
            r4.removeViewAt(r5)
            r3.addView(r10)
            goto L152
        L163:
            r10 = -1
            r4.setId(r10)
            r3.setId(r9)
            boolean r10 = r4 instanceof android.widget.FrameLayout
            if (r10 == 0) goto L173
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r4.setForeground(r8)
        L173:
            android.view.Window r4 = r11.l
            r4.setContentView(r2)
            g3 r4 = new g3
            r4.<init>(r11, r7)
            r3.setAttachListener(r4)
            r11.A = r2
            java.lang.Object r2 = r11.j
            boolean r3 = r2 instanceof android.app.Activity
            if (r3 == 0) goto L18f
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.CharSequence r2 = r2.getTitle()
            goto L191
        L18f:
            java.lang.CharSequence r2 = r11.q
        L191:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L1cb
            gf r3 = r11.r
            if (r3 == 0) goto L19f
            r3.setWindowTitle(r2)
            goto L1cb
        L19f:
            yb0 r3 = r11.o
            if (r3 == 0) goto L1c4
            hf r3 = r3.A
            k70 r3 = (defpackage.k70) r3
            boolean r4 = r3.g
            if (r4 != 0) goto L1cb
            androidx.appcompat.widget.Toolbar r4 = r3.a
            r3.h = r2
            int r8 = r3.b
            r8 = r8 & 8
            if (r8 == 0) goto L1cb
            r4.setTitle(r2)
            boolean r3 = r3.g
            if (r3 == 0) goto L1cb
            android.view.View r3 = r4.getRootView()
            defpackage.ja0.m(r3, r2)
            goto L1cb
        L1c4:
            android.widget.TextView r3 = r11.B
            if (r3 == 0) goto L1cb
            r3.setText(r2)
        L1cb:
            android.view.ViewGroup r2 = r11.A
            android.view.View r2 = r2.findViewById(r9)
            androidx.appcompat.widget.ContentFrameLayout r2 = (androidx.appcompat.widget.ContentFrameLayout) r2
            android.view.Window r3 = r11.l
            android.view.View r3 = r3.getDecorView()
            int r4 = r3.getPaddingLeft()
            int r8 = r3.getPaddingTop()
            int r9 = r3.getPaddingRight()
            int r3 = r3.getPaddingBottom()
            android.graphics.Rect r10 = r2.g
            r10.set(r4, r8, r9, r3)
            java.util.WeakHashMap r3 = defpackage.ja0.a
            boolean r3 = defpackage.v90.c(r2)
            if (r3 == 0) goto L1f9
            r2.requestLayout()
        L1f9:
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 124(0x7c, float:1.74E-43)
            android.util.TypedValue r3 = r2.getMinWidthMajor()
            r0.getValue(r1, r3)
            r1 = 125(0x7d, float:1.75E-43)
            android.util.TypedValue r3 = r2.getMinWidthMinor()
            r0.getValue(r1, r3)
            r1 = 122(0x7a, float:1.71E-43)
            boolean r3 = r0.hasValue(r1)
            if (r3 == 0) goto L21e
            android.util.TypedValue r3 = r2.getFixedWidthMajor()
            r0.getValue(r1, r3)
        L21e:
            r1 = 123(0x7b, float:1.72E-43)
            boolean r3 = r0.hasValue(r1)
            if (r3 == 0) goto L22d
            android.util.TypedValue r3 = r2.getFixedWidthMinor()
            r0.getValue(r1, r3)
        L22d:
            r1 = 120(0x78, float:1.68E-43)
            boolean r3 = r0.hasValue(r1)
            if (r3 == 0) goto L23c
            android.util.TypedValue r3 = r2.getFixedHeightMajor()
            r0.getValue(r1, r3)
        L23c:
            r1 = 121(0x79, float:1.7E-43)
            boolean r3 = r0.hasValue(r1)
            if (r3 == 0) goto L24b
            android.util.TypedValue r3 = r2.getFixedHeightMinor()
            r0.getValue(r1, r3)
        L24b:
            r0.recycle()
            r2.requestLayout()
            r11.z = r7
            q3 r0 = r11.z(r5)
            boolean r1 = r11.Q
            if (r1 != 0) goto L2b1
            ku r0 = r0.h
            if (r0 != 0) goto L2b1
            r11.B(r6)
            goto L2b1
        L263:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "AppCompat does not support the current theme features: { windowActionBar: "
            r1.<init>(r2)
            boolean r2 = r11.F
            r1.append(r2)
            java.lang.String r2 = ", windowActionBarOverlay: "
            r1.append(r2)
            boolean r2 = r11.G
            r1.append(r2)
            java.lang.String r2 = ", android:windowIsFloating: "
            r1.append(r2)
            boolean r2 = r11.I
            r1.append(r2)
            java.lang.String r2 = ", windowActionModeOverlay: "
            r1.append(r2)
            boolean r2 = r11.H
            r1.append(r2)
            java.lang.String r2 = ", windowNoTitle: "
            r1.append(r2)
            boolean r2 = r11.J
            r1.append(r2)
            java.lang.String r2 = " }"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2a6:
            r2.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You need to use a Theme.AppCompat theme (or descendant) with this activity."
            r0.<init>(r1)
            throw r0
        L2b1:
            return
    }

    public final void x() {
            r2 = this;
            android.view.Window r0 = r2.l
            if (r0 != 0) goto L13
            java.lang.Object r0 = r2.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L13
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            r2.o(r0)
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

    public final defpackage.o3 y(android.content.Context r4) {
            r3 = this;
            m3 r0 = r3.W
            if (r0 != 0) goto L24
            m3 r0 = new m3
            r5 r1 = defpackage.r5.g
            if (r1 != 0) goto L1d
            android.content.Context r4 = r4.getApplicationContext()
            r5 r1 = new r5
            java.lang.String r2 = "location"
            java.lang.Object r2 = r4.getSystemService(r2)
            android.location.LocationManager r2 = (android.location.LocationManager) r2
            r1.<init>(r4, r2)
            defpackage.r5.g = r1
        L1d:
            r5 r4 = defpackage.r5.g
            r0.<init>(r3, r4)
            r3.W = r0
        L24:
            m3 r4 = r3.W
            return r4
    }

    public final defpackage.q3 z(int r5) {
            r4 = this;
            q3[] r0 = r4.L
            r1 = 0
            if (r0 == 0) goto L8
            int r2 = r0.length
            if (r2 > r5) goto L15
        L8:
            int r2 = r5 + 1
            q3[] r2 = new defpackage.q3[r2]
            if (r0 == 0) goto L12
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r1, r2, r1, r3)
        L12:
            r4.L = r2
            r0 = r2
        L15:
            r2 = r0[r5]
            if (r2 != 0) goto L24
            q3 r2 = new q3
            r2.<init>()
            r2.a = r5
            r2.n = r1
            r0[r5] = r2
        L24:
            return r2
    }
}
