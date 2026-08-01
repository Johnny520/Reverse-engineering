package p000;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l3 */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC0434l3 implements Window.Callback {

    /* JADX INFO: renamed from: a */
    public final Window.Callback f2997a;

    /* JADX INFO: renamed from: b */
    public boolean f2998b;

    /* JADX INFO: renamed from: c */
    public boolean f2999c;

    /* JADX INFO: renamed from: d */
    public boolean f3000d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LayoutInflaterFactory2C0657r3 f3001e;

    public WindowCallbackC0434l3(LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3, Window.Callback callback) {
        this.f3001e = layoutInflaterFactory2C0657r3;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2997a = callback;
    }

    /* JADX INFO: renamed from: a */
    public final void m1737a(Window.Callback callback) {
        try {
            this.f2998b = true;
            callback.onContentChanged();
        } finally {
            this.f2998b = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1738b(int i, Menu menu) {
        return this.f2997a.onMenuOpened(i, menu);
    }

    /* JADX INFO: renamed from: c */
    public final void m1739c(int i, Menu menu) {
        this.f2997a.onPanelClosed(i, menu);
    }

    /* JADX INFO: renamed from: d */
    public final void m1740d(List list, Menu menu, int i) {
        sb0.m2330a(this.f2997a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2997a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f2999c;
        Window.Callback callback = this.f2997a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.f3001e.m2207u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.f2997a
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            r3 r2 = r6.f3001e
            r2.m2193A()
            yb0 r3 = r2.f4181o
            r4 = 0
            if (r3 == 0) goto L3d
            xb0 r3 = r3.f5311E
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            ku r3 = r3.f5152d
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
            q3 r0 = r2.f4155M
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.m2198F(r0, r3, r7)
            if (r0 == 0) goto L52
            q3 r7 = r2.f4155M
            if (r7 == 0) goto L3b
            r7.f3988l = r1
            goto L3b
        L52:
            q3 r0 = r2.f4155M
            if (r0 != 0) goto L6a
            q3 r0 = r2.m2212z(r4)
            r2.m2199G(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.m2198F(r0, r3, r7)
            r0.f3987k = r4
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
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.WindowCallbackC0434l3.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f2997a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2997a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2997a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2997a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2997a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2997a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2998b) {
            this.f2997a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0424ku)) {
            return this.f2997a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2997a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2997a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2997a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        m1738b(i, menu);
        if (i == 108) {
            LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = this.f3001e;
            layoutInflaterFactory2C0657r3.m2193A();
            yb0 yb0Var = layoutInflaterFactory2C0657r3.f4181o;
            if (yb0Var != null) {
                ArrayList arrayList = yb0Var.f5315I;
                if (true != yb0Var.f5314H) {
                    yb0Var.f5314H = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f3000d) {
            this.f2997a.onPanelClosed(i, menu);
            return;
        }
        m1739c(i, menu);
        LayoutInflaterFactory2C0657r3 layoutInflaterFactory2C0657r3 = this.f3001e;
        if (i != 108) {
            if (i == 0) {
                C0620q3 c0620q3M2212z = layoutInflaterFactory2C0657r3.m2212z(i);
                if (c0620q3M2212z.f3989m) {
                    layoutInflaterFactory2C0657r3.m2206s(c0620q3M2212z, false);
                    return;
                }
                return;
            }
            return;
        }
        layoutInflaterFactory2C0657r3.m2193A();
        yb0 yb0Var = layoutInflaterFactory2C0657r3.f4181o;
        if (yb0Var != null) {
            ArrayList arrayList = yb0Var.f5315I;
            if (yb0Var.f5314H) {
                yb0Var.f5314H = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        tb0.m2376a(this.f2997a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0424ku menuC0424ku = menu instanceof MenuC0424ku ? (MenuC0424ku) menu : null;
        if (i == 0 && menuC0424ku == null) {
            return false;
        }
        if (menuC0424ku != null) {
            menuC0424ku.f2973x = true;
        }
        boolean zOnPreparePanel = this.f2997a.onPreparePanel(i, view, menu);
        if (menuC0424ku != null) {
            menuC0424ku.f2973x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0424ku menuC0424ku = this.f3001e.m2212z(0).f3984h;
        if (menuC0424ku != null) {
            m1740d(list, menuC0424ku, i);
        } else {
            m1740d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return rb0.m2287a(this.f2997a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2997a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f2997a.onWindowFocusChanged(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d8  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r11, int r12) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.WindowCallbackC0434l3.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f2997a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
