package a;

/* JADX INFO: renamed from: a.yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC0485yf implements android.view.Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.Window.Callback f773a;
    public final a.Ue b;
    public final android.app.Activity c;

    public WindowCallbackC0485yf(android.view.Window.Callback r2, a.Ue r3, android.app.Activity r4) {
            r1 = this;
            java.lang.String r0 = "part"
            a.C0193i9.e(r3, r0)
            r1.<init>()
            r1.f773a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f773a
            boolean r2 = r0.dispatchGenericMotionEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f773a
            boolean r2 = r0.dispatchKeyEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f773a
            boolean r2 = r0.dispatchKeyShortcutEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f773a
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(android.view.MotionEvent r3) {
            r2 = this;
            if (r3 == 0) goto L25
            a.Ue r0 = r2.b     // Catch: java.lang.Throwable -> Lc
            android.app.Activity r1 = r2.c     // Catch: java.lang.Throwable -> Lc
            r0.b(r3, r1)     // Catch: java.lang.Throwable -> Lc
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lc
            goto L11
        Lc:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L11:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L25
            java.lang.String r1 = "TempUnhideTrigger: dispatchTouch error"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            r1 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.a(r0)
        L25:
            android.view.Window$Callback r0 = r2.f773a
            boolean r3 = r0.dispatchTouchEvent(r3)
            return r3
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f773a
            boolean r2 = r0.dispatchTrackballEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(android.view.ActionMode r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f773a
            r0.onActionModeFinished(r2)
            return
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(android.view.ActionMode r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f773a
            r0.onActionModeStarted(r2)
            return
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f773a
            r0.onAttachedToWindow()
            return
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f773a
            r0.onContentChanged()
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
            r1 = this;
            java.lang.String r0 = "menu"
            a.C0193i9.e(r3, r0)
            android.view.Window$Callback r0 = r1.f773a
            boolean r2 = r0.onCreatePanelMenu(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public final android.view.View onCreatePanelView(int r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f773a
            android.view.View r2 = r0.onCreatePanelView(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f773a
            r0.onDetachedFromWindow()
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            java.lang.String r0 = "item"
            a.C0193i9.e(r3, r0)
            android.view.Window$Callback r0 = r1.f773a
            boolean r2 = r0.onMenuItemSelected(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int r2, android.view.Menu r3) {
            r1 = this;
            java.lang.String r0 = "menu"
            a.C0193i9.e(r3, r0)
            android.view.Window$Callback r0 = r1.f773a
            boolean r2 = r0.onMenuOpened(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            java.lang.String r0 = "menu"
            a.C0193i9.e(r3, r0)
            android.view.Window$Callback r0 = r1.f773a
            r0.onPanelClosed(r2, r3)
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int r2, android.view.View r3, android.view.Menu r4) {
            r1 = this;
            java.lang.String r0 = "menu"
            a.C0193i9.e(r4, r0)
            android.view.Window$Callback r0 = r1.f773a
            boolean r2 = r0.onPreparePanel(r2, r3, r4)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f773a
            boolean r0 = r0.onSearchRequested()
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(android.view.SearchEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f773a
            boolean r2 = r0.onSearchRequested(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(android.view.WindowManager.LayoutParams r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f773a
            r0.onWindowAttributesChanged(r2)
            return
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f773a
            r0.onWindowFocusChanged(r2)
            return
    }

    @Override // android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f773a
            android.view.ActionMode r2 = r0.onWindowStartingActionMode(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2, int r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f773a
            android.view.ActionMode r2 = r0.onWindowStartingActionMode(r2, r3)
            return r2
    }
}
