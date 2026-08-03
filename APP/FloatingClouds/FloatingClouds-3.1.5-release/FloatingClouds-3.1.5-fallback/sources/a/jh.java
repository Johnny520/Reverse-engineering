package a;

/* JADX INFO: loaded from: classes.dex */
public class jh implements android.view.Window.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.view.Window.Callback f538a;

    public static class a {
        public static boolean a(android.view.Window.Callback r0, android.view.SearchEvent r1) {
                boolean r0 = r0.onSearchRequested(r1)
                return r0
        }

        public static android.view.ActionMode b(android.view.Window.Callback r0, android.view.ActionMode.Callback r1, int r2) {
                android.view.ActionMode r0 = r0.onWindowStartingActionMode(r1, r2)
                return r0
        }
    }

    public static class b {
        public static void a(android.view.Window.Callback r0, java.util.List<android.view.KeyboardShortcutGroup> r1, android.view.Menu r2, int r3) {
                r0.onProvideKeyboardShortcuts(r1, r2, r3)
                return
        }
    }

    public static class c {
        public static void a(android.view.Window.Callback r0, boolean r1) {
                r0.onPointerCaptureChanged(r1)
                return
        }
    }

    public jh(android.view.Window.Callback r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.f538a = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Window callback may not be null"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f538a
            boolean r2 = r0.dispatchGenericMotionEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f538a
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f538a
            boolean r2 = r0.dispatchTouchEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f538a
            boolean r2 = r0.dispatchTrackballEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(android.view.ActionMode r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f538a
            r0.onActionModeFinished(r2)
            return
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(android.view.ActionMode r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f538a
            r0.onActionModeStarted(r2)
            return
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f538a
            r0.onAttachedToWindow()
            return
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f538a
            r0.onDetachedFromWindow()
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f538a
            boolean r2 = r0.onMenuItemSelected(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int r2, android.view.Menu r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f538a
            boolean r2 = r0.onMenuOpened(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f538a
            r0.onPanelClosed(r2, r3)
            return
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f538a
            a.jh.c.a(r0, r2)
            return
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> r2, android.view.Menu r3, int r4) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f538a
            a.jh.b.a(r0, r2, r3, r4)
            return
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f538a
            boolean r0 = r0.onSearchRequested()
            return r0
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(android.view.SearchEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f538a
            boolean r2 = a.jh.a.a(r0, r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(android.view.WindowManager.LayoutParams r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f538a
            r0.onWindowAttributesChanged(r2)
            return
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f538a
            r0.onWindowFocusChanged(r2)
            return
    }
}
