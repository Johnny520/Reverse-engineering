package p000;

/* JADX INFO: renamed from: d5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC0200d5 implements android.view.Window.Callback {

    /* JADX INFO: renamed from: ε */
    public final android.view.Window.Callback f2882;

    /* JADX INFO: renamed from: ζ */
    public boolean f2883;

    /* JADX INFO: renamed from: η */
    public boolean f2884;

    /* JADX INFO: renamed from: θ */
    public boolean f2885;

    /* JADX INFO: renamed from: ι */
    public final /* synthetic */ androidx.appcompat.app.LayoutInflaterFactory2C0026 f2886;

    public WindowCallbackC0200d5(androidx.appcompat.app.LayoutInflaterFactory2C0026 r1, android.view.Window.Callback r2) {
            r0 = this;
            r0.<init>()
            r0.f2886 = r1
            if (r2 == 0) goto La
            r0.f2882 = r2
            return
        La:
            java.lang.String r0 = "Window callback may not be null"
            p000.C1080.m7275(r0)
            r0 = 0
            throw r0
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            boolean r0 = r0.dispatchGenericMotionEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            boolean r0 = r2.f2884
            android.view.Window$Callback r1 = r2.f2882
            if (r0 == 0) goto Lb
            boolean r2 = r1.dispatchKeyEvent(r3)
            return r2
        Lb:
            androidx.appcompat.app.β r2 = r2.f2886
            boolean r2 = r2.m227(r3)
            if (r2 != 0) goto L1c
            boolean r2 = r1.dispatchKeyEvent(r3)
            if (r2 == 0) goto L1a
            goto L1c
        L1a:
            r2 = 0
            return r2
        L1c:
            r2 = 1
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            r5 = this;
            android.view.Window$Callback r0 = r5.f2882
            boolean r0 = r0.dispatchKeyShortcutEvent(r6)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r6.getKeyCode()
            androidx.appcompat.app.β r5 = r5.f2886
            r5.m211()
            tb2 r2 = r5.f402
            r3 = 0
            if (r2 == 0) goto L3d
            sb2 r2 = r2.f10287
            if (r2 != 0) goto L1d
        L1b:
            r0 = r3
            goto L39
        L1d:
            iz0 r2 = r2.f9823
            if (r2 == 0) goto L1b
            int r4 = r6.getDeviceId()
            android.view.KeyCharacterMap r4 = android.view.KeyCharacterMap.load(r4)
            int r4 = r4.getKeyboardType()
            if (r4 == r1) goto L31
            r4 = r1
            goto L32
        L31:
            r4 = r3
        L32:
            r2.setQwertyMode(r4)
            boolean r0 = r2.performShortcut(r0, r6, r3)
        L39:
            if (r0 == 0) goto L3d
        L3b:
            r5 = r1
            goto L6b
        L3d:
            g5 r0 = r5.f391
            if (r0 == 0) goto L52
            int r2 = r6.getKeyCode()
            boolean r0 = r5.m216(r0, r2, r6)
            if (r0 == 0) goto L52
            g5 r5 = r5.f391
            if (r5 == 0) goto L3b
            r5.f4246 = r1
            goto L3b
        L52:
            g5 r0 = r5.f391
            if (r0 != 0) goto L6a
            g5 r0 = r5.m210(r3)
            r5.m217(r0, r6)
            int r2 = r6.getKeyCode()
            boolean r5 = r5.m216(r0, r2, r6)
            r0.f4245 = r3
            if (r5 == 0) goto L6a
            goto L3b
        L6a:
            r5 = r3
        L6b:
            if (r5 == 0) goto L6e
            goto L6f
        L6e:
            return r3
        L6f:
            return r1
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            boolean r0 = r0.dispatchPopulateAccessibilityEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            boolean r0 = r0.dispatchTouchEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(android.view.MotionEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            boolean r0 = r0.dispatchTrackballEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(android.view.ActionMode r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            r0.onActionModeFinished(r1)
            return
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(android.view.ActionMode r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            r0.onActionModeStarted(r1)
            return
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            r0.onAttachedToWindow()
            return
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
            r1 = this;
            boolean r0 = r1.f2883
            if (r0 == 0) goto L9
            android.view.Window$Callback r1 = r1.f2882
            r1.onContentChanged()
        L9:
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
            r1 = this;
            if (r2 != 0) goto L8
            boolean r0 = r3 instanceof p000.iz0
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            android.view.Window$Callback r1 = r1.f2882
            boolean r1 = r1.onCreatePanelMenu(r2, r3)
            return r1
    }

    @Override // android.view.Window.Callback
    public final android.view.View onCreatePanelView(int r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            android.view.View r0 = r0.onCreatePanelView(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            r0.onDetachedFromWindow()
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int r1, android.view.MenuItem r2) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            boolean r0 = r0.onMenuItemSelected(r1, r2)
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int r2, android.view.Menu r3) {
            r1 = this;
            r1.m1650(r2, r3)
            r3 = 108(0x6c, float:1.51E-43)
            r0 = 1
            if (r2 != r3) goto L27
            androidx.appcompat.app.β r1 = r1.f2886
            r1.m211()
            tb2 r1 = r1.f402
            if (r1 == 0) goto L27
            java.util.ArrayList r2 = r1.f10291
            boolean r3 = r1.f10290
            if (r0 != r3) goto L18
            goto L27
        L18:
            r1.f10290 = r0
            int r1 = r2.size()
            if (r1 > 0) goto L21
            goto L27
        L21:
            r1 = 0
            java.lang.ClassCastException r1 = p000.lz1.m3685(r1, r2)
            throw r1
        L27:
            return r0
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            boolean r0 = r1.f2885
            if (r0 == 0) goto La
            android.view.Window$Callback r1 = r1.f2882
            r1.onPanelClosed(r2, r3)
            return
        La:
            r1.m1651(r2, r3)
            r3 = 108(0x6c, float:1.51E-43)
            r0 = 0
            androidx.appcompat.app.β r1 = r1.f2886
            if (r2 != r3) goto L30
            r1.m211()
            tb2 r1 = r1.f402
            if (r1 == 0) goto L3d
            java.util.ArrayList r2 = r1.f10291
            boolean r3 = r1.f10290
            if (r3 != 0) goto L22
            goto L3d
        L22:
            r1.f10290 = r0
            int r1 = r2.size()
            if (r1 > 0) goto L2b
            goto L3d
        L2b:
            java.lang.ClassCastException r1 = p000.lz1.m3685(r0, r2)
            throw r1
        L30:
            if (r2 != 0) goto L3d
            g5 r2 = r1.m210(r2)
            boolean r3 = r2.f4247
            if (r3 == 0) goto L3d
            r1.m226(r2, r0)
        L3d:
            return
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            p000.qb2.m4850(r0, r1)
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int r4, android.view.View r5, android.view.Menu r6) {
            r3 = this;
            boolean r0 = r6 instanceof p000.iz0
            if (r0 == 0) goto L8
            r0 = r6
            iz0 r0 = (p000.iz0) r0
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
            r0.f5274 = r2
        L14:
            android.view.Window$Callback r3 = r3.f2882
            boolean r3 = r3.onPreparePanel(r4, r5, r6)
            if (r0 == 0) goto L1e
            r0.f5274 = r1
        L1e:
            return r3
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(java.util.List r3, android.view.Menu r4, int r5) {
            r2 = this;
            androidx.appcompat.app.β r0 = r2.f2886
            r1 = 0
            g5 r0 = r0.m210(r1)
            iz0 r0 = r0.f4242
            if (r0 == 0) goto Lf
            r2.m1652(r3, r0, r5)
            return
        Lf:
            r2.m1652(r3, r4, r5)
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            boolean r0 = r0.onSearchRequested()
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(android.view.SearchEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            boolean r0 = p000.ob2.m4215(r0, r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(android.view.WindowManager.LayoutParams r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            r0.onWindowAttributesChanged(r1)
            return
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            r0.onWindowFocusChanged(r1)
            return
    }

    @Override // android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r9, int r10) {
            r8 = this;
            androidx.appcompat.app.β r0 = r8.f2886
            android.content.Context r1 = r0.f398
            if (r10 == 0) goto Ld
            android.view.Window$Callback r8 = r8.f2882
            android.view.ActionMode r8 = p000.ob2.m4216(r8, r9, r10)
            return r8
        Ld:
            i0 r8 = new i0
            r8.<init>(r1, r9)
            ｗ r9 = r0.f373
            if (r9 == 0) goto L19
            r9.mo5432()
        L19:
            n5 r9 = new n5
            r10 = 3
            r9.<init>(r0, r10, r8)
            r0.m211()
            tb2 r10 = r0.f402
            r2 = 0
            r3 = 1
            r4 = 0
            if (r10 == 0) goto L70
            sb2 r5 = r10.f10287
            if (r5 == 0) goto L30
            r5.mo5432()
        L30:
            androidx.appcompat.widget.ActionBarOverlayLayout r5 = r10.f10281
            r5.setHideOnContentScrollEnabled(r2)
            androidx.appcompat.widget.ActionBarContextView r5 = r10.f10284
            r5.m246()
            sb2 r5 = new sb2
            androidx.appcompat.widget.ActionBarContextView r6 = r10.f10284
            android.content.Context r6 = r6.getContext()
            r5.<init>(r10, r6, r9)
            iz0 r6 = r5.f9823
            r6.m2843()
            n5 r7 = r5.f9824     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r7 = r7.f7387     // Catch: java.lang.Throwable -> L6b
            i0 r7 = (p000.C0379i0) r7     // Catch: java.lang.Throwable -> L6b
            boolean r7 = r7.m2554(r5, r6)     // Catch: java.lang.Throwable -> L6b
            r6.m2842()
            if (r7 == 0) goto L67
            r10.f10287 = r5
            r5.mo5438()
            androidx.appcompat.widget.ActionBarContextView r6 = r10.f10284
            r6.m244(r5)
            r10.m5623(r3)
            goto L68
        L67:
            r5 = r4
        L68:
            r0.f373 = r5
            goto L70
        L6b:
            r8 = move-exception
            r6.m2842()
            throw r8
        L70:
            ｗ r10 = r0.f373
            if (r10 != 0) goto L1e1
            x92 r10 = r0.f377
            if (r10 == 0) goto L7b
            r10.m6541()
        L7b:
            ｗ r10 = r0.f373
            if (r10 == 0) goto L82
            r10.mo5432()
        L82:
            androidx.appcompat.widget.ActionBarContextView r10 = r0.f374
            if (r10 != 0) goto L134
            boolean r10 = r0.f387
            if (r10 == 0) goto L107
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.content.res.Resources$Theme r5 = r1.getTheme()
            r6 = 2130968585(0x7f040009, float:1.7545828E38)
            r5.resolveAttribute(r6, r10, r3)
            int r6 = r10.resourceId
            if (r6 == 0) goto Lba
            android.content.res.Resources r6 = r1.getResources()
            android.content.res.Resources$Theme r6 = r6.newTheme()
            r6.setTo(r5)
            int r5 = r10.resourceId
            r6.applyStyle(r5, r3)
            np r5 = new np
            r5.<init>(r1, r2)
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r1.setTo(r6)
            r1 = r5
        Lba:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r1)
            r0.f374 = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            r6 = 2130968600(0x7f040018, float:1.7545858E38)
            r5.<init>(r1, r4, r6)
            r0.f375 = r5
            r6 = 2
            r5.setWindowLayoutType(r6)
            android.widget.PopupWindow r5 = r0.f375
            androidx.appcompat.widget.ActionBarContextView r6 = r0.f374
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r0.f375
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r1.getTheme()
            r6 = 2130968579(0x7f040003, float:1.7545816E38)
            r5.resolveAttribute(r6, r10, r3)
            int r10 = r10.data
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r10 = android.util.TypedValue.complexToDimensionPixelSize(r10, r1)
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f374
            r1.setContentHeight(r10)
            android.widget.PopupWindow r10 = r0.f375
            r1 = -2
            r10.setHeight(r1)
            w4 r10 = new w4
            r10.<init>(r0, r3)
            r0.f376 = r10
            goto L134
        L107:
            android.view.ViewGroup r10 = r0.f379
            r5 = 2131296309(0x7f090035, float:1.8210531E38)
            android.view.View r10 = r10.findViewById(r5)
            androidx.appcompat.widget.ViewStubCompat r10 = (androidx.appcompat.widget.ViewStubCompat) r10
            if (r10 == 0) goto L134
            r0.m211()
            tb2 r5 = r0.f402
            if (r5 == 0) goto L120
            android.content.Context r5 = r5.m5624()
            goto L121
        L120:
            r5 = r4
        L121:
            if (r5 != 0) goto L124
            goto L125
        L124:
            r1 = r5
        L125:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r10.setLayoutInflater(r1)
            android.view.View r10 = r10.m316()
            androidx.appcompat.widget.ActionBarContextView r10 = (androidx.appcompat.widget.ActionBarContextView) r10
            r0.f374 = r10
        L134:
            androidx.appcompat.widget.ActionBarContextView r10 = r0.f374
            if (r10 == 0) goto L1da
            x92 r10 = r0.f377
            if (r10 == 0) goto L13f
            r10.m6541()
        L13f:
            androidx.appcompat.widget.ActionBarContextView r10 = r0.f374
            r10.m246()
            wz1 r10 = new wz1
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f374
            android.content.Context r1 = r1.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r0.f374
            r10.<init>()
            r10.f11908 = r1
            r10.f11909 = r5
            r10.f11910 = r9
            iz0 r1 = new iz0
            android.content.Context r5 = r5.getContext()
            r1.<init>(r5)
            r1.f5262 = r3
            r10.f11913 = r1
            r1.f5255 = r10
            java.lang.Object r9 = r9.f7387
            i0 r9 = (p000.C0379i0) r9
            boolean r9 = r9.m2554(r10, r1)
            if (r9 == 0) goto L1d8
            r10.mo5438()
            androidx.appcompat.widget.ActionBarContextView r9 = r0.f374
            r9.m244(r10)
            r0.f373 = r10
            boolean r9 = r0.f378
            if (r9 == 0) goto L18a
            android.view.ViewGroup r9 = r0.f379
            if (r9 == 0) goto L18a
            boolean r9 = r9.isLaidOut()
            if (r9 == 0) goto L18a
            r9 = r3
            goto L18b
        L18a:
            r9 = r2
        L18b:
            androidx.appcompat.widget.ActionBarContextView r10 = r0.f374
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L1a9
            r9 = 0
            r10.setAlpha(r9)
            androidx.appcompat.widget.ActionBarContextView r9 = r0.f374
            x92 r9 = p000.b92.m823(r9)
            r9.m6540(r1)
            r0.f377 = r9
            y4 r10 = new y4
            r10.<init>(r3, r0)
            r9.m6543(r10)
            goto L1c8
        L1a9:
            r10.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r9 = r0.f374
            r9.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r9 = r0.f374
            android.view.ViewParent r9 = r9.getParent()
            boolean r9 = r9 instanceof android.view.View
            if (r9 == 0) goto L1c8
            androidx.appcompat.widget.ActionBarContextView r9 = r0.f374
            android.view.ViewParent r9 = r9.getParent()
            android.view.View r9 = (android.view.View) r9
            java.util.WeakHashMap r10 = p000.b92.f1572
            p000.s82.m5376(r9)
        L1c8:
            android.widget.PopupWindow r9 = r0.f375
            if (r9 == 0) goto L1da
            android.view.Window r9 = r0.f399
            android.view.View r9 = r9.getDecorView()
            w4 r10 = r0.f376
            r9.post(r10)
            goto L1da
        L1d8:
            r0.f373 = r4
        L1da:
            r0.m219()
            ｗ r9 = r0.f373
            r0.f373 = r9
        L1e1:
            r0.m219()
            ｗ r9 = r0.f373
            if (r9 == 0) goto L1ec
            p12 r4 = r8.m2570(r9)
        L1ec:
            return r4
    }

    /* JADX INFO: renamed from: α */
    public final void m1649(android.view.Window.Callback r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.f2883 = r0     // Catch: java.lang.Throwable -> La
            r3.onContentChanged()     // Catch: java.lang.Throwable -> La
            r2.f2883 = r1
            return
        La:
            r3 = move-exception
            r2.f2883 = r1
            throw r3
    }

    /* JADX INFO: renamed from: β */
    public final boolean m1650(int r1, android.view.Menu r2) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            boolean r0 = r0.onMenuOpened(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public final void m1651(int r1, android.view.Menu r2) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            r0.onPanelClosed(r1, r2)
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m1652(java.util.List r1, android.view.Menu r2, int r3) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f2882
            p000.pb2.m4456(r0, r1, r2, r3)
            return
    }
}
