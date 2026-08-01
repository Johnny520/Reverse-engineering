package defpackage;

/* JADX INFO: renamed from: ᛱᛴᛶᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC0076 implements android.view.Window.Callback {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f789;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f790;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final android.view.Window.Callback f791;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public boolean f792;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.LayoutInflaterFactory2C1411 f793;

    public WindowCallbackC0076(defpackage.LayoutInflaterFactory2C1411 r1, android.view.Window.Callback r2) {
            r0 = this;
            r0.<init>()
            r0.f793 = r1
            if (r2 == 0) goto La
            r0.f791 = r2
            return
        La:
            java.lang.String r0 = "Window callback may not be null"
            defpackage.C2264.m3684(r0)
            r0 = 0
            throw r0
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
            boolean r0 = r0.dispatchGenericMotionEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent r3) {
            r2 = this;
            boolean r0 = r2.f789
            android.view.Window$Callback r1 = r2.f791
            if (r0 == 0) goto Lb
            boolean r2 = r1.dispatchKeyEvent(r3)
            return r2
        Lb:
            ᛸᛱᛱᛲ r2 = r2.f793
            boolean r2 = r2.m2578(r3)
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
            android.view.Window$Callback r0 = r5.f791
            boolean r0 = r0.dispatchKeyShortcutEvent(r6)
            r1 = 1
            if (r0 != 0) goto L6a
            int r0 = r6.getKeyCode()
            ᛸᛱᛱᛲ r5 = r5.f793
            r5.m2584()
            ᲇᛲᲇᲁ r2 = r5.f6179
            r3 = 0
            if (r2 == 0) goto L3c
            ᛶᛸᛴᲇ r2 = r2.f8673
            if (r2 != 0) goto L1d
        L1b:
            r0 = r3
            goto L39
        L1d:
            ᲀᛷᛱᲇ r2 = r2.f5011
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
            if (r0 == 0) goto L3c
            goto L6a
        L3c:
            ᛱᛳᲈᛵ r0 = r5.f6164
            if (r0 == 0) goto L51
            int r2 = r6.getKeyCode()
            boolean r0 = r5.m2591(r0, r2, r6)
            if (r0 == 0) goto L51
            ᛱᛳᲈᛵ r5 = r5.f6164
            if (r5 == 0) goto L6a
            r5.f725 = r1
            return r1
        L51:
            ᛱᛳᲈᛵ r0 = r5.f6164
            if (r0 != 0) goto L69
            ᛱᛳᲈᛵ r0 = r5.m2576(r3)
            r5.m2589(r0, r6)
            int r2 = r6.getKeyCode()
            boolean r5 = r5.m2591(r0, r2, r6)
            r0.f724 = r3
            if (r5 == 0) goto L69
            goto L6a
        L69:
            return r3
        L6a:
            return r1
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
            boolean r0 = r0.dispatchPopulateAccessibilityEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
            boolean r0 = r0.dispatchTouchEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(android.view.MotionEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
            boolean r0 = r0.dispatchTrackballEvent(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(android.view.ActionMode r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
            r0.onActionModeFinished(r1)
            return
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(android.view.ActionMode r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
            r0.onActionModeStarted(r1)
            return
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
            r0.onAttachedToWindow()
            return
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
            r1 = this;
            boolean r0 = r1.f790
            if (r0 == 0) goto L9
            android.view.Window$Callback r1 = r1.f791
            r1.onContentChanged()
        L9:
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
            r1 = this;
            if (r2 != 0) goto L8
            boolean r0 = r3 instanceof defpackage.MenuC1701
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            android.view.Window$Callback r1 = r1.f791
            boolean r1 = r1.onCreatePanelMenu(r2, r3)
            return r1
    }

    @Override // android.view.Window.Callback
    public final android.view.View onCreatePanelView(int r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
            android.view.View r0 = r0.onCreatePanelView(r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
            r0.onDetachedFromWindow()
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int r1, android.view.MenuItem r2) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
            boolean r0 = r0.onMenuItemSelected(r1, r2)
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int r2, android.view.Menu r3) {
            r1 = this;
            r1.m534(r2, r3)
            r3 = 108(0x6c, float:1.51E-43)
            r0 = 1
            if (r2 != r3) goto L2d
            ᛸᛱᛱᛲ r1 = r1.f793
            r1.m2584()
            ᲇᛲᲇᲁ r1 = r1.f6179
            if (r1 == 0) goto L2d
            java.util.ArrayList r2 = r1.f8679
            boolean r3 = r1.f8672
            if (r0 != r3) goto L18
            goto L2d
        L18:
            r1.f8672 = r0
            int r1 = r2.size()
            if (r1 > 0) goto L21
            goto L2d
        L21:
            r1 = 0
            java.lang.Object r2 = r2.get(r1)
            r2.getClass()
            defpackage.C2264.m3679()
            return r1
        L2d:
            return r0
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            boolean r0 = r1.f792
            if (r0 == 0) goto La
            android.view.Window$Callback r1 = r1.f791
            r1.onPanelClosed(r2, r3)
            return
        La:
            r1.m532(r2, r3)
            r3 = 108(0x6c, float:1.51E-43)
            r0 = 0
            ᛸᛱᛱᛲ r1 = r1.f793
            if (r2 != r3) goto L36
            r1.m2584()
            ᲇᛲᲇᲁ r1 = r1.f6179
            if (r1 == 0) goto L43
            java.util.ArrayList r2 = r1.f8679
            boolean r3 = r1.f8672
            if (r3 != 0) goto L22
            goto L43
        L22:
            r1.f8672 = r0
            int r1 = r2.size()
            if (r1 > 0) goto L2b
            goto L43
        L2b:
            java.lang.Object r1 = r2.get(r0)
            r1.getClass()
            defpackage.C2264.m3679()
            return
        L36:
            if (r2 != 0) goto L43
            ᛱᛳᲈᛵ r2 = r1.m2576(r2)
            boolean r3 = r2.f729
            if (r3 == 0) goto L43
            r1.m2586(r2, r0)
        L43:
            return
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
            defpackage.AbstractC1546.m2823(r0, r1)
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int r4, android.view.View r5, android.view.Menu r6) {
            r3 = this;
            boolean r0 = r6 instanceof defpackage.MenuC1701
            if (r0 == 0) goto L8
            r0 = r6
            ᲀᛷᛱᲇ r0 = (defpackage.MenuC1701) r0
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
            r0.f7579 = r2
        L14:
            android.view.Window$Callback r3 = r3.f791
            boolean r3 = r3.onPreparePanel(r4, r5, r6)
            if (r0 == 0) goto L1e
            r0.f7579 = r1
        L1e:
            return r3
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(java.util.List r3, android.view.Menu r4, int r5) {
            r2 = this;
            ᛸᛱᛱᛲ r0 = r2.f793
            r1 = 0
            ᛱᛳᲈᛵ r0 = r0.m2576(r1)
            ᲀᛷᛱᲇ r0 = r0.f723
            if (r0 == 0) goto Lf
            r2.m531(r3, r0, r5)
            return
        Lf:
            r2.m531(r3, r4, r5)
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
            boolean r0 = r0.onSearchRequested()
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(android.view.SearchEvent r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
            boolean r0 = defpackage.AbstractC1433.m2640(r0, r1)
            return r0
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(android.view.WindowManager.LayoutParams r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
            r0.onWindowAttributesChanged(r1)
            return
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean r1) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
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
            ᛸᛱᛱᛲ r0 = r8.f793
            android.content.Context r1 = r0.f6153
            boolean r2 = r0.f6174
            if (r2 == 0) goto L1ee
            if (r10 == 0) goto Lc
            goto L1ee
        Lc:
            ᛲᛶᛲᲁ r8 = new ᛲᛶᛲᲁ
            r8.<init>(r1, r9)
            ᛶᛷᛸᲈ r9 = r0.f6162
            if (r9 == 0) goto L18
            r9.mo2071()
        L18:
            ᛴᛵᲇᲇ r9 = new ᛴᛵᲇᲇ
            r10 = 4
            r2 = 0
            r9.<init>(r0, r8, r10, r2)
            r0.m2584()
            ᲇᛲᲇᲁ r10 = r0.f6179
            r3 = 1
            r4 = 0
            if (r10 == 0) goto L6f
            ᛶᛸᛴᲇ r5 = r10.f8673
            if (r5 == 0) goto L2f
            r5.mo2071()
        L2f:
            androidx.appcompat.widget.ActionBarOverlayLayout r5 = r10.f8682
            r5.setHideOnContentScrollEnabled(r2)
            androidx.appcompat.widget.ActionBarContextView r5 = r10.f8691
            r5.m24()
            ᛶᛸᛴᲇ r5 = new ᛶᛸᛴᲇ
            androidx.appcompat.widget.ActionBarContextView r6 = r10.f8691
            android.content.Context r6 = r6.getContext()
            r5.<init>(r10, r6, r9)
            ᲀᛷᛱᲇ r6 = r5.f5011
            r6.m3084()
            ᛴᛵᲇᲇ r7 = r5.f5012     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r7 = r7.f3286     // Catch: java.lang.Throwable -> L6a
            ᛲᛶᛲᲁ r7 = (defpackage.C0302) r7     // Catch: java.lang.Throwable -> L6a
            boolean r7 = r7.m961(r5, r6)     // Catch: java.lang.Throwable -> L6a
            r6.m3081()
            if (r7 == 0) goto L66
            r10.f8673 = r5
            r5.mo2063()
            androidx.appcompat.widget.ActionBarContextView r6 = r10.f8691
            r6.m26(r5)
            r10.m3401(r3)
            goto L67
        L66:
            r5 = r4
        L67:
            r0.f6162 = r5
            goto L6f
        L6a:
            r8 = move-exception
            r6.m3081()
            throw r8
        L6f:
            ᛶᛷᛸᲈ r10 = r0.f6162
            if (r10 != 0) goto L1e2
            ᲇᲇᛱᛳ r10 = r0.f6177
            if (r10 == 0) goto L7a
            r10.m3556()
        L7a:
            ᛶᛷᛸᲈ r10 = r0.f6162
            if (r10 == 0) goto L81
            r10.mo2071()
        L81:
            androidx.appcompat.widget.ActionBarContextView r10 = r0.f6168
            if (r10 != 0) goto L133
            boolean r10 = r0.f6158
            if (r10 == 0) goto L106
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.content.res.Resources$Theme r5 = r1.getTheme()
            r6 = 1711538187(0x6604000b, float:1.558383E23)
            r5.resolveAttribute(r6, r10, r3)
            int r6 = r10.resourceId
            if (r6 == 0) goto Lb9
            android.content.res.Resources r6 = r1.getResources()
            android.content.res.Resources$Theme r6 = r6.newTheme()
            r6.setTo(r5)
            int r5 = r10.resourceId
            r6.applyStyle(r5, r3)
            ᛴᛱᲈᛳ r5 = new ᛴᛱᲈᛳ
            r5.<init>(r1, r2)
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r1.setTo(r6)
            r1 = r5
        Lb9:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r1)
            r0.f6168 = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            r6 = 1711538202(0x6604001a, float:1.5583856E23)
            r5.<init>(r1, r4, r6)
            r0.f6172 = r5
            r6 = 2
            r5.setWindowLayoutType(r6)
            android.widget.PopupWindow r5 = r0.f6172
            androidx.appcompat.widget.ActionBarContextView r6 = r0.f6168
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r0.f6172
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r1.getTheme()
            r6 = 1711538181(0x66040005, float:1.5583818E23)
            r5.resolveAttribute(r6, r10, r3)
            int r10 = r10.data
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            int r10 = android.util.TypedValue.complexToDimensionPixelSize(r10, r1)
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f6168
            r1.setContentHeight(r10)
            android.widget.PopupWindow r10 = r0.f6172
            r1 = -2
            r10.setHeight(r1)
            ᛴᛷᛸᲀ r10 = new ᛴᛷᛸᲀ
            r10.<init>(r0, r3)
            r0.f6180 = r10
            goto L133
        L106:
            android.view.ViewGroup r10 = r0.f6152
            r5 = 1711865919(0x6609003f, float:1.6174219E23)
            android.view.View r10 = r10.findViewById(r5)
            androidx.appcompat.widget.ViewStubCompat r10 = (androidx.appcompat.widget.ViewStubCompat) r10
            if (r10 == 0) goto L133
            r0.m2584()
            ᲇᛲᲇᲁ r5 = r0.f6179
            if (r5 == 0) goto L11f
            android.content.Context r5 = r5.m3402()
            goto L120
        L11f:
            r5 = r4
        L120:
            if (r5 != 0) goto L123
            goto L124
        L123:
            r1 = r5
        L124:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r10.setLayoutInflater(r1)
            android.view.View r10 = r10.m79()
            androidx.appcompat.widget.ActionBarContextView r10 = (androidx.appcompat.widget.ActionBarContextView) r10
            r0.f6168 = r10
        L133:
            androidx.appcompat.widget.ActionBarContextView r10 = r0.f6168
            if (r10 == 0) goto L1db
            ᲇᲇᛱᛳ r10 = r0.f6177
            if (r10 == 0) goto L13e
            r10.m3556()
        L13e:
            androidx.appcompat.widget.ActionBarContextView r10 = r0.f6168
            r10.m24()
            ᛶᛶᛷᛳ r10 = new ᛶᛶᛷᛳ
            androidx.appcompat.widget.ActionBarContextView r1 = r0.f6168
            android.content.Context r1 = r1.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r0.f6168
            r10.<init>()
            r10.f4893 = r1
            r10.f4895 = r5
            r10.f4896 = r9
            ᲀᛷᛱᲇ r1 = new ᲀᛷᛱᲇ
            android.content.Context r5 = r5.getContext()
            r1.<init>(r5)
            r1.f7574 = r3
            r10.f4894 = r1
            r1.f7583 = r10
            java.lang.Object r9 = r9.f3286
            ᛲᛶᛲᲁ r9 = (defpackage.C0302) r9
            boolean r9 = r9.m961(r10, r1)
            if (r9 == 0) goto L1d9
            r10.mo2063()
            androidx.appcompat.widget.ActionBarContextView r9 = r0.f6168
            r9.m26(r10)
            r0.f6162 = r10
            boolean r9 = r0.f6149
            if (r9 == 0) goto L18b
            android.view.ViewGroup r9 = r0.f6152
            if (r9 == 0) goto L18b
            java.util.WeakHashMap r10 = defpackage.AbstractC0858.f3911
            boolean r9 = r9.isLaidOut()
            if (r9 == 0) goto L18b
            r9 = r3
            goto L18c
        L18b:
            r9 = r2
        L18c:
            androidx.appcompat.widget.ActionBarContextView r10 = r0.f6168
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L1aa
            r9 = 0
            r10.setAlpha(r9)
            androidx.appcompat.widget.ActionBarContextView r9 = r0.f6168
            ᲇᲇᛱᛳ r9 = defpackage.AbstractC0858.m1815(r9)
            r9.m3555(r1)
            r0.f6177 = r9
            ᲀᛱᛴᛱ r10 = new ᲀᛱᛴᛱ
            r10.<init>(r3, r0)
            r9.m3553(r10)
            goto L1c9
        L1aa:
            r10.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r9 = r0.f6168
            r9.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r9 = r0.f6168
            android.view.ViewParent r9 = r9.getParent()
            boolean r9 = r9 instanceof android.view.View
            if (r9 == 0) goto L1c9
            androidx.appcompat.widget.ActionBarContextView r9 = r0.f6168
            android.view.ViewParent r9 = r9.getParent()
            android.view.View r9 = (android.view.View) r9
            java.util.WeakHashMap r10 = defpackage.AbstractC0858.f3911
            r9.requestApplyInsets()
        L1c9:
            android.widget.PopupWindow r9 = r0.f6172
            if (r9 == 0) goto L1db
            android.view.Window r9 = r0.f6165
            android.view.View r9 = r9.getDecorView()
            ᛴᛷᛸᲀ r10 = r0.f6180
            r9.post(r10)
            goto L1db
        L1d9:
            r0.f6162 = r4
        L1db:
            r0.m2581()
            ᛶᛷᛸᲈ r9 = r0.f6162
            r0.f6162 = r9
        L1e2:
            r0.m2581()
            ᛶᛷᛸᲈ r9 = r0.f6162
            if (r9 == 0) goto L1ed
            ᛲᛱᛷᲈ r4 = r8.m963(r9)
        L1ed:
            return r4
        L1ee:
            android.view.Window$Callback r8 = r8.f791
            android.view.ActionMode r8 = defpackage.AbstractC1433.m2641(r8, r9, r10)
            return r8
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final void m531(java.util.List r1, android.view.Menu r2, int r3) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
            defpackage.AbstractC1348.m2526(r0, r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m532(int r1, android.view.Menu r2) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
            r0.onPanelClosed(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m533(android.view.Window.Callback r3) {
            r2 = this;
            r0 = 1
            r1 = 0
            r2.f790 = r0     // Catch: java.lang.Throwable -> La
            r3.onContentChanged()     // Catch: java.lang.Throwable -> La
            r2.f790 = r1
            return
        La:
            r3 = move-exception
            r2.f790 = r1
            throw r3
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean m534(int r1, android.view.Menu r2) {
            r0 = this;
            android.view.Window$Callback r0 = r0.f791
            boolean r0 = r0.onMenuOpened(r1, r2)
            return r0
    }
}
