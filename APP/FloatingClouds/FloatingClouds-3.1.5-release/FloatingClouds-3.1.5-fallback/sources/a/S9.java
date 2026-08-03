package a;

/* JADX INFO: loaded from: classes.dex */
public final class S9 implements android.view.Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.Window.Callback f262a;
    public final /* synthetic */ android.view.Window.Callback b;
    public final /* synthetic */ a.T9 c;

    public S9(android.view.Window.Callback r1, a.T9 r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            r0.f262a = r1
            return
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f262a
            boolean r2 = r0.dispatchGenericMotionEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f262a
            boolean r2 = r0.dispatchKeyEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f262a
            boolean r2 = r0.dispatchKeyShortcutEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f262a
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
            r10 = this;
            if (r11 == 0) goto L102
            a.T9 r0 = r10.c
            android.widget.ListView r1 = r0.f277a
            if (r1 != 0) goto La
            goto L102
        La:
            a.K3$a r2 = a.K3.f148a
            r2.getClass()
            boolean r2 = a.K3.a.l()
            if (r2 == 0) goto L102
            a.jc r2 = a.K3.a.i()
            boolean r2 = r2.j
            if (r2 != 0) goto L1f
            goto L102
        L1f:
            a.jc r2 = a.K3.a.i()
            boolean r2 = r2.k
            if (r2 != 0) goto L29
            goto L102
        L29:
            r2 = 2
            int[] r3 = new int[r2]
            r1.getLocationOnScreen(r3)     // Catch: java.lang.Throwable -> L32
            a.Wf r4 = a.Wf.f330a     // Catch: java.lang.Throwable -> L32
            goto L37
        L32:
            r4 = move-exception
            a.wd$a r4 = a.C0465xd.a(r4)
        L37:
            boolean r4 = r4 instanceof a.C0447wd.a
            if (r4 == 0) goto L3d
            goto L102
        L3d:
            float r4 = r11.getRawX()
            int r4 = (int) r4
            float r5 = r11.getRawY()
            int r5 = (int) r5
            r6 = 0
            r7 = r3[r6]
            int r8 = r1.getWidth()
            int r8 = r8 + r7
            r9 = 1
            if (r4 > r8) goto L61
            if (r7 > r4) goto L61
            r3 = r3[r9]
            int r4 = r1.getHeight()
            int r4 = r4 + r3
            if (r5 > r4) goto L61
            if (r3 > r5) goto L61
            r3 = r9
            goto L62
        L61:
            r3 = r6
        L62:
            int r4 = r11.getActionMasked()
            if (r4 == 0) goto Ld5
            if (r4 == r9) goto Lb8
            if (r4 == r2) goto L85
            r1 = 3
            if (r4 == r1) goto L71
            goto L102
        L71:
            r0.p = r9
            android.os.Handler r1 = r0.t
            a.Q9 r2 = r0.v
            r1.removeCallbacks(r2)
            android.os.Handler r1 = r0.t
            a.Q9 r2 = r0.v
            long r3 = r0.k
            r1.postDelayed(r2, r3)
            goto L102
        L85:
            boolean r2 = r0.o
            if (r2 != 0) goto L8b
            goto L102
        L8b:
            float r2 = r11.getRawX()
            float r3 = r0.r
            float r2 = r2 - r3
            float r3 = r11.getRawY()
            float r4 = r0.s
            float r3 = r3 - r4
            android.content.Context r1 = r1.getContext()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            int r1 = r1.getScaledTouchSlop()
            float r2 = r2 * r2
            float r3 = r3 * r3
            float r3 = r3 + r2
            int r1 = r1 * r1
            float r1 = (float) r1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L102
            r0.o = r6
            android.os.Handler r1 = r0.t
            a.Q9 r0 = r0.u
            r1.removeCallbacks(r0)
            goto L102
        Lb8:
            boolean r1 = r0.p
            if (r1 == 0) goto Lc5
            r0.p = r6
            android.os.Handler r1 = r0.t
            a.Q9 r2 = r0.v
            r1.removeCallbacks(r2)
        Lc5:
            r0.o = r6
            android.os.Handler r1 = r0.t
            a.Q9 r2 = r0.u
            r1.removeCallbacks(r2)
            boolean r1 = r0.q
            if (r1 == 0) goto L102
            r0.q = r6
            goto L102
        Ld5:
            if (r3 != 0) goto Ld8
            goto L102
        Ld8:
            r0.q = r6
            r0.p = r6
            android.os.Handler r1 = r0.t
            a.Q9 r2 = r0.v
            r1.removeCallbacks(r2)
            r0.o = r9
            float r1 = r11.getRawX()
            r0.r = r1
            float r1 = r11.getRawY()
            r0.s = r1
            android.os.Handler r1 = r0.t
            a.Q9 r2 = r0.u
            r1.removeCallbacks(r2)
            android.os.Handler r1 = r0.t
            a.Q9 r2 = r0.u
            int r0 = r0.h
            long r3 = (long) r0
            r1.postDelayed(r2, r3)
        L102:
            android.view.Window$Callback r0 = r10.b
            boolean r11 = r0.dispatchTouchEvent(r11)
            return r11
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f262a
            boolean r2 = r0.dispatchTrackballEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(android.view.ActionMode r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f262a
            r0.onActionModeFinished(r2)
            return
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(android.view.ActionMode r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f262a
            r0.onActionModeStarted(r2)
            return
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f262a
            r0.onAttachedToWindow()
            return
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f262a
            r0.onContentChanged()
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r2, @android.annotation.NonNull android.view.Menu r3) {
            r1 = this;
            java.lang.String r0 = "p1"
            a.C0193i9.e(r3, r0)
            android.view.Window$Callback r0 = r1.f262a
            boolean r2 = r0.onCreatePanelMenu(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    @android.annotation.Nullable
    public final android.view.View onCreatePanelView(int r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f262a
            android.view.View r2 = r0.onCreatePanelView(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f262a
            r0.onDetachedFromWindow()
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int r2, @android.annotation.NonNull android.view.MenuItem r3) {
            r1 = this;
            java.lang.String r0 = "p1"
            a.C0193i9.e(r3, r0)
            android.view.Window$Callback r0 = r1.f262a
            boolean r2 = r0.onMenuItemSelected(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int r2, @android.annotation.NonNull android.view.Menu r3) {
            r1 = this;
            java.lang.String r0 = "p1"
            a.C0193i9.e(r3, r0)
            android.view.Window$Callback r0 = r1.f262a
            boolean r2 = r0.onMenuOpened(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int r2, @android.annotation.NonNull android.view.Menu r3) {
            r1 = this;
            java.lang.String r0 = "p1"
            a.C0193i9.e(r3, r0)
            android.view.Window$Callback r0 = r1.f262a
            r0.onPanelClosed(r2, r3)
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int r2, @android.annotation.Nullable android.view.View r3, @android.annotation.NonNull android.view.Menu r4) {
            r1 = this;
            java.lang.String r0 = "p2"
            a.C0193i9.e(r4, r0)
            android.view.Window$Callback r0 = r1.f262a
            boolean r2 = r0.onPreparePanel(r2, r3, r4)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f262a
            boolean r0 = r0.onSearchRequested()
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(android.view.SearchEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f262a
            boolean r2 = r0.onSearchRequested(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(android.view.WindowManager.LayoutParams r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f262a
            r0.onWindowAttributesChanged(r2)
            return
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f262a
            r0.onWindowFocusChanged(r2)
            return
    }

    @Override // android.view.Window.Callback
    @android.annotation.Nullable
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f262a
            android.view.ActionMode r2 = r0.onWindowStartingActionMode(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    @android.annotation.Nullable
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2, int r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f262a
            android.view.ActionMode r2 = r0.onWindowStartingActionMode(r2, r3)
            return r2
    }
}
