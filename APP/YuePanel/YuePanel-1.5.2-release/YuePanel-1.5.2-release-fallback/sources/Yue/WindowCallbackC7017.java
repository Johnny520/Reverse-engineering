package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class WindowCallbackC7017 implements android.view.Window.Callback {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final android.view.Window.Callback f24548;

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۢ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C7018 {
        public C7018() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static boolean m27178(android.view.Window.Callback r0, android.view.SearchEvent r1) {
                boolean r0 = r0.onSearchRequested(r1)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static android.view.ActionMode m27179(android.view.Window.Callback r0, android.view.ActionMode.Callback r1, int r2) {
                android.view.ActionMode r0 = r0.onWindowStartingActionMode(r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۢ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(24)
    public static class C7019 {
        public C7019() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m27180(android.view.Window.Callback r0, java.util.List<android.view.KeyboardShortcutGroup> r1, android.view.Menu r2, int r3) {
                r0.onProvideKeyboardShortcuts(r1, r2, r3)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۢ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C7020 {
        public C7020() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m27181(android.view.Window.Callback r0, boolean r1) {
                r0.onPointerCaptureChanged(r1)
                return
        }
    }

    public WindowCallbackC7017(android.view.Window.Callback r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L8
            r1.f24548 = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Window callback may not be null"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            boolean r2 = r0.dispatchGenericMotionEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            boolean r2 = r0.dispatchKeyEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            boolean r2 = r0.dispatchKeyShortcutEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            boolean r2 = r0.dispatchPopulateAccessibilityEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            boolean r2 = r0.dispatchTouchEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(android.view.MotionEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            boolean r2 = r0.dispatchTrackballEvent(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(android.view.ActionMode r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            r0.onActionModeFinished(r2)
            return
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(android.view.ActionMode r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            r0.onActionModeStarted(r2)
            return
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            r0.onAttachedToWindow()
            return
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            r0.onContentChanged()
            return
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int r2, android.view.Menu r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            boolean r2 = r0.onCreatePanelMenu(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public android.view.View onCreatePanelView(int r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            android.view.View r2 = r0.onCreatePanelView(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            r0.onDetachedFromWindow()
            return
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int r2, android.view.MenuItem r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            boolean r2 = r0.onMenuItemSelected(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int r2, android.view.Menu r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            boolean r2 = r0.onMenuOpened(r2, r3)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int r2, android.view.Menu r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            r0.onPanelClosed(r2, r3)
            return
    }

    @Override // android.view.Window.Callback
    @Yue.InterfaceC5336(26)
    public void onPointerCaptureChanged(boolean r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            Yue.WindowCallbackC7017.C7020.m27181(r0, r2)
            return
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int r2, android.view.View r3, android.view.Menu r4) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            boolean r2 = r0.onPreparePanel(r2, r3, r4)
            return r2
    }

    @Override // android.view.Window.Callback
    @Yue.InterfaceC5336(24)
    public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> r2, android.view.Menu r3, int r4) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            Yue.WindowCallbackC7017.C7019.m27180(r0, r2, r3, r4)
            return
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            boolean r0 = r0.onSearchRequested()
            return r0
    }

    @Override // android.view.Window.Callback
    @Yue.InterfaceC5336(23)
    public boolean onSearchRequested(android.view.SearchEvent r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            boolean r2 = Yue.WindowCallbackC7017.C7018.m27178(r0, r2)
            return r2
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            r0.onWindowAttributesChanged(r2)
            return
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            r0.onWindowFocusChanged(r2)
            return
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            android.view.ActionMode r2 = r0.onWindowStartingActionMode(r2)
            return r2
    }

    @Override // android.view.Window.Callback
    @Yue.InterfaceC5336(23)
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r2, int r3) {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            android.view.ActionMode r2 = Yue.WindowCallbackC7017.C7018.m27179(r0, r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.view.Window.Callback m27177() {
            r1 = this;
            android.view.Window$Callback r0 = r1.f24548
            return r0
    }
}
