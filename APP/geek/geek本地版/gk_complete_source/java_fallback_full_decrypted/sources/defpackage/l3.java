package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l3 implements android.view.Window.Callback {
    public final android.view.Window.Callback a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ defpackage.r3 e;

    public l3(defpackage.r3 r1, android.view.Window.Callback r2) {
            r0 = this;
            r0.<init>()
            r0.e = r1
            if (r2 == 0) goto La
            r0.a = r2
            return
        La:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Window callback may not be null"
            r1.<init>(r2)
            throw r1
    }

    public final void a(android.view.Window.Callback r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.b = r0     // Catch: java.lang.Throwable -> La
            r3.onContentChanged()     // Catch: java.lang.Throwable -> La
            r2.b = r1
            return
        La:
            r3 = move-exception
            r2.b = r1
            throw r3
    }

    public final boolean b(int r2, android.view.Menu r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            boolean r2 = r0.onMenuOpened(r2, r3)
            return r2
    }

    public final void c(int r2, android.view.Menu r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            r0.onPanelClosed(r2, r3)
            return
    }

    public final void d(java.util.List r2, android.view.Menu r3, int r4) {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            defpackage.sb0.a(r0, r2, r3, r4)
            return
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            boolean r2 = r0.dispatchGenericMotionEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            boolean r0 = r2.c
            android.view.Window$Callback r1 = r2.a
            if (r0 == 0) goto Lb
            boolean r3 = r1.dispatchKeyEvent(r3)
            return r3
        Lb:
            r3 r0 = r2.e
            boolean r0 = r0.u(r3)
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
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
            r6 = this;
            android.view.Window$Callback r0 = r6.a
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            r3 r2 = r6.e
            r2.A()
            yb0 r3 = r2.o
            r4 = 0
            if (r3 == 0) goto L3d
            xb0 r3 = r3.E
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            ku r3 = r3.d
            if (r3 == 0) goto L1b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L31
            r5 = r1
            goto L32
        L31:
            r5 = r4
        L32:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r7 = r1
            goto L6b
        L3d:
            q3 r0 = r2.M
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.F(r0, r3, r7)
            if (r0 == 0) goto L52
            q3 r7 = r2.M
            if (r7 == 0) goto L3b
            r7.l = r1
            goto L3b
        L52:
            q3 r0 = r2.M
            if (r0 != 0) goto L6a
            q3 r0 = r2.z(r4)
            r2.G(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.F(r0, r3, r7)
            r0.k = r4
            if (r7 == 0) goto L6a
            goto L3b
        L6a:
            r7 = r4
        L6b:
            if (r7 == 0) goto L6e
            goto L6f
        L6e:
            return r4
        L6f:
            return r1
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            boolean r2 = r0.dispatchTouchEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            boolean r2 = r0.dispatchTrackballEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(android.view.ActionMode r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            r0.onActionModeFinished(r2)
            return
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(android.view.ActionMode r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            r0.onActionModeStarted(r2)
            return
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            r0.onAttachedToWindow()
            return
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
            r1 = this;
            boolean r0 = r1.b
            if (r0 == 0) goto L9
            android.view.Window$Callback r0 = r1.a
            r0.onContentChanged()
        L9:
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
            r1 = this;
            if (r2 != 0) goto L8
            boolean r0 = r3 instanceof defpackage.ku
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            android.view.Window$Callback r0 = r1.a
            boolean r2 = r0.onCreatePanelMenu(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public final android.view.View onCreatePanelView(int r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            android.view.View r2 = r0.onCreatePanelView(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            r0.onDetachedFromWindow()
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            boolean r2 = r0.onMenuItemSelected(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int r3, android.view.Menu r4) {
            r2 = this;
            r2.b(r3, r4)
            r4 = 108(0x6c, float:1.51E-43)
            r0 = 1
            if (r3 != r4) goto L2f
            r3 r3 = r2.e
            r3.A()
            yb0 r3 = r3.o
            if (r3 == 0) goto L2f
            java.util.ArrayList r4 = r3.I
            boolean r1 = r3.H
            if (r0 != r1) goto L18
            goto L2f
        L18:
            r3.H = r0
            int r3 = r4.size()
            if (r3 > 0) goto L21
            goto L2f
        L21:
            r3 = 0
            java.lang.Object r3 = r4.get(r3)
            r3.getClass()
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L2f:
            return r0
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int r3, android.view.Menu r4) {
            r2 = this;
            boolean r0 = r2.d
            if (r0 == 0) goto La
            android.view.Window$Callback r0 = r2.a
            r0.onPanelClosed(r3, r4)
            return
        La:
            r2.c(r3, r4)
            r4 = 108(0x6c, float:1.51E-43)
            r0 = 0
            r3 r1 = r2.e
            if (r3 != r4) goto L38
            r1.A()
            yb0 r3 = r1.o
            if (r3 == 0) goto L45
            java.util.ArrayList r4 = r3.I
            boolean r1 = r3.H
            if (r1 != 0) goto L22
            goto L45
        L22:
            r3.H = r0
            int r3 = r4.size()
            if (r3 > 0) goto L2b
            goto L45
        L2b:
            java.lang.Object r3 = r4.get(r0)
            r3.getClass()
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            r3.<init>()
            throw r3
        L38:
            if (r3 != 0) goto L45
            q3 r3 = r1.z(r3)
            boolean r4 = r3.m
            if (r4 == 0) goto L45
            r1.s(r3, r0)
        L45:
            return
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            defpackage.tb0.a(r0, r2)
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int r4, android.view.View r5, android.view.Menu r6) {
            r3 = this;
            boolean r0 = r6 instanceof defpackage.ku
            if (r0 == 0) goto L8
            r0 = r6
            ku r0 = (defpackage.ku) r0
            goto L9
        L8:
            r0 = 0
        L9:
            r1 = 0
            if (r4 != 0) goto Lf
            if (r0 != 0) goto Lf
            return r1
        Lf:
            if (r0 == 0) goto L14
            r2 = 1
            r0.x = r2
        L14:
            android.view.Window$Callback r2 = r3.a
            boolean r4 = r2.onPreparePanel(r4, r5, r6)
            if (r0 == 0) goto L1e
            r0.x = r1
        L1e:
            return r4
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(java.util.List r3, android.view.Menu r4, int r5) {
            r2 = this;
            r3 r0 = r2.e
            r1 = 0
            q3 r0 = r0.z(r1)
            ku r0 = r0.h
            if (r0 == 0) goto Lf
            r2.d(r3, r0, r5)
            return
        Lf:
            r2.d(r3, r4, r5)
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            boolean r0 = r0.onSearchRequested()
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(android.view.SearchEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            boolean r2 = defpackage.rb0.a(r0, r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(android.view.WindowManager.LayoutParams r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            r0.onWindowAttributesChanged(r2)
            return
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.a
            r0.onWindowFocusChanged(r2)
            return
    }

    @Override // android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r11, int r12) {
            r10 = this;
            if (r12 == 0) goto L9
            android.view.Window$Callback r0 = r10.a
            android.view.ActionMode r11 = defpackage.rb0.b(r0, r11, r12)
            return r11
        L9:
            a8 r12 = new a8
            r3 r0 = r10.e
            android.content.Context r1 = r0.k
            r12.<init>()
            r12.b = r1
            r12.a = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r12.c = r11
            u30 r11 = new u30
            r11.<init>()
            r12.d = r11
            n1 r11 = r0.u
            if (r11 == 0) goto L2b
            r11.a()
        L2b:
            d4 r11 = new d4
            r2 = 2
            r11.<init>(r0, r2, r12)
            r0.A()
            yb0 r3 = r0.o
            r4 = 1
            r5 = 0
            r6 = 0
            if (r3 == 0) goto L82
            xb0 r7 = r3.E
            if (r7 == 0) goto L42
            r7.a()
        L42:
            androidx.appcompat.widget.ActionBarOverlayLayout r7 = r3.y
            r7.setHideOnContentScrollEnabled(r6)
            androidx.appcompat.widget.ActionBarContextView r7 = r3.B
            r7.e()
            xb0 r7 = new xb0
            androidx.appcompat.widget.ActionBarContextView r8 = r3.B
            android.content.Context r8 = r8.getContext()
            r7.<init>(r3, r8, r11)
            ku r8 = r7.d
            r8.w()
            d4 r9 = r7.e     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r9 = r9.b     // Catch: java.lang.Throwable -> L7d
            a8 r9 = (defpackage.a8) r9     // Catch: java.lang.Throwable -> L7d
            boolean r9 = r9.d(r7, r8)     // Catch: java.lang.Throwable -> L7d
            r8.v()
            if (r9 == 0) goto L79
            r3.E = r7
            r7.g()
            androidx.appcompat.widget.ActionBarContextView r8 = r3.B
            r8.c(r7)
            r3.K(r4)
            goto L7a
        L79:
            r7 = r5
        L7a:
            r0.u = r7
            goto L82
        L7d:
            r11 = move-exception
            r8.v()
            throw r11
        L82:
            n1 r3 = r0.u
            if (r3 != 0) goto L1ed
            wa0 r3 = r0.y
            if (r3 == 0) goto L8d
            r3.b()
        L8d:
            n1 r3 = r0.u
            if (r3 == 0) goto L94
            r3.a()
        L94:
            androidx.appcompat.widget.ActionBarContextView r3 = r0.v
            if (r3 != 0) goto L145
            boolean r3 = r0.I
            if (r3 == 0) goto L118
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r7 = r1.getTheme()
            r8 = 2130968585(0x7f040009, float:1.7545828E38)
            r7.resolveAttribute(r8, r3, r4)
            int r8 = r3.resourceId
            if (r8 == 0) goto Lcc
            android.content.res.Resources r8 = r1.getResources()
            android.content.res.Resources$Theme r8 = r8.newTheme()
            r8.setTo(r7)
            int r7 = r3.resourceId
            r8.applyStyle(r7, r4)
            kd r7 = new kd
            r7.<init>(r1, r6)
            android.content.res.Resources$Theme r1 = r7.getTheme()
            r1.setTo(r8)
            r1 = r7
        Lcc:
            androidx.appcompat.widget.ActionBarContextView r7 = new androidx.appcompat.widget.ActionBarContextView
            r7.<init>(r1, r5)
            r0.v = r7
            android.widget.PopupWindow r7 = new android.widget.PopupWindow
            r8 = 2130968600(0x7f040018, float:1.7545858E38)
            r7.<init>(r1, r5, r8)
            r0.w = r7
            defpackage.vx.d(r7, r2)
            android.widget.PopupWindow r2 = r0.w
            androidx.appcompat.widget.ActionBarContextView r7 = r0.v
            r2.setContentView(r7)
            android.widget.PopupWindow r2 = r0.w
            r7 = -1
            r2.setWidth(r7)
            android.content.res.Resources$Theme r2 = r1.getTheme()
            r7 = 2130968579(0x7f040003, float:1.7545816E38)
            r2.resolveAttribute(r7, r3, r4)
            int r2 = r3.data
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r1 = android.util.TypedValue.complexToDimensionPixelSize(r2, r1)
            androidx.appcompat.widget.ActionBarContextView r2 = r0.v
            r2.setContentHeight(r1)
            android.widget.PopupWindow r1 = r0.w
            r2 = -2
            r1.setHeight(r2)
            f3 r1 = new f3
            r1.<init>(r0, r4)
            r0.x = r1
            goto L145
        L118:
            android.view.ViewGroup r2 = r0.A
            r3 = 2131296318(0x7f09003e, float:1.821055E38)
            android.view.View r2 = r2.findViewById(r3)
            androidx.appcompat.widget.ViewStubCompat r2 = (androidx.appcompat.widget.ViewStubCompat) r2
            if (r2 == 0) goto L145
            r0.A()
            yb0 r3 = r0.o
            if (r3 == 0) goto L131
            android.content.Context r3 = r3.L()
            goto L132
        L131:
            r3 = r5
        L132:
            if (r3 != 0) goto L135
            goto L136
        L135:
            r1 = r3
        L136:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2.setLayoutInflater(r1)
            android.view.View r1 = r2.a()
            androidx.appcompat.widget.ActionBarContextView r1 = (androidx.appcompat.widget.ActionBarContextView) r1
            r0.v = r1
        L145:
            androidx.appcompat.widget.ActionBarContextView r1 = r0.v
            if (r1 == 0) goto L1e6
            wa0 r1 = r0.y
            if (r1 == 0) goto L150
            r1.b()
        L150:
            androidx.appcompat.widget.ActionBarContextView r1 = r0.v
            r1.e()
            o40 r1 = new o40
            androidx.appcompat.widget.ActionBarContextView r2 = r0.v
            android.content.Context r2 = r2.getContext()
            androidx.appcompat.widget.ActionBarContextView r3 = r0.v
            r1.<init>()
            r1.c = r2
            r1.d = r3
            r1.e = r11
            ku r11 = new ku
            android.content.Context r2 = r3.getContext()
            r11.<init>(r2)
            r11.l = r4
            r1.h = r11
            r11.e = r1
            boolean r11 = r12.d(r1, r11)
            if (r11 == 0) goto L1e4
            r1.g()
            androidx.appcompat.widget.ActionBarContextView r11 = r0.v
            r11.c(r1)
            r0.u = r1
            boolean r11 = r0.z
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L1b3
            android.view.ViewGroup r11 = r0.A
            if (r11 == 0) goto L1b3
            java.util.WeakHashMap r2 = defpackage.ja0.a
            boolean r11 = defpackage.v90.c(r11)
            if (r11 == 0) goto L1b3
            androidx.appcompat.widget.ActionBarContextView r11 = r0.v
            r2 = 0
            r11.setAlpha(r2)
            androidx.appcompat.widget.ActionBarContextView r11 = r0.v
            wa0 r11 = defpackage.ja0.a(r11)
            r11.a(r1)
            r0.y = r11
            h3 r1 = new h3
            r1.<init>(r4, r0)
            r11.d(r1)
            goto L1d4
        L1b3:
            androidx.appcompat.widget.ActionBarContextView r11 = r0.v
            r11.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r11 = r0.v
            r11.setVisibility(r6)
            androidx.appcompat.widget.ActionBarContextView r11 = r0.v
            android.view.ViewParent r11 = r11.getParent()
            boolean r11 = r11 instanceof android.view.View
            if (r11 == 0) goto L1d4
            androidx.appcompat.widget.ActionBarContextView r11 = r0.v
            android.view.ViewParent r11 = r11.getParent()
            android.view.View r11 = (android.view.View) r11
            java.util.WeakHashMap r1 = defpackage.ja0.a
            defpackage.w90.c(r11)
        L1d4:
            android.widget.PopupWindow r11 = r0.w
            if (r11 == 0) goto L1e6
            android.view.Window r11 = r0.l
            android.view.View r11 = r11.getDecorView()
            f3 r1 = r0.x
            r11.post(r1)
            goto L1e6
        L1e4:
            r0.u = r5
        L1e6:
            r0.I()
            n1 r11 = r0.u
            r0.u = r11
        L1ed:
            r0.I()
            n1 r11 = r0.u
            if (r11 == 0) goto L1f9
            h50 r11 = r12.b(r11)
            return r11
        L1f9:
            return r5
    }
}
