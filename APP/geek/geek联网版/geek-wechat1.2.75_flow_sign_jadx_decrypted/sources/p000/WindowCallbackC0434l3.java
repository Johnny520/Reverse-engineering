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
    public final Window.Callback f2899a;

    /* JADX INFO: renamed from: b */
    public boolean f2900b;

    /* JADX INFO: renamed from: c */
    public boolean f2901c;

    /* JADX INFO: renamed from: d */
    public boolean f2902d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LayoutInflaterFactory2C0656r3 f2903e;

    public WindowCallbackC0434l3(LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3, Window.Callback callback) {
        this.f2903e = layoutInflaterFactory2C0656r3;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f2899a = callback;
    }

    /* JADX INFO: renamed from: a */
    public final void m1727a(Window.Callback callback) {
        try {
            this.f2900b = true;
            callback.onContentChanged();
        } finally {
            this.f2900b = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1728b(int i, Menu menu) {
        return this.f2899a.onMenuOpened(i, menu);
    }

    /* JADX INFO: renamed from: c */
    public final void m1729c(int i, Menu menu) {
        this.f2899a.onPanelClosed(i, menu);
    }

    /* JADX INFO: renamed from: d */
    public final void m1730d(List list, Menu menu, int i) {
        xb0.m2674a(this.f2899a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f2899a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f2901c;
        Window.Callback callback = this.f2899a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.f2903e.m2218u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
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
            android.view.Window$Callback r0 = r6.f2899a
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 1
            if (r0 != 0) goto L6f
            int r0 = r7.getKeyCode()
            r3 r2 = r6.f2903e
            r2.m2204A()
            dc0 r3 = r2.f4042o
            r4 = 0
            if (r3 == 0) goto L3d
            cc0 r3 = r3.f1364D
            if (r3 != 0) goto L1d
        L1b:
            r0 = r4
            goto L39
        L1d:
            qu r3 = r3.f877d
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
            q3 r0 = r2.f4016M
            if (r0 == 0) goto L52
            int r3 = r7.getKeyCode()
            boolean r0 = r2.m2209F(r0, r3, r7)
            if (r0 == 0) goto L52
            q3 r7 = r2.f4016M
            if (r7 == 0) goto L3b
            r7.f3785l = r1
            goto L3b
        L52:
            q3 r0 = r2.f4016M
            if (r0 != 0) goto L6a
            q3 r0 = r2.m2223z(r4)
            r2.m2210G(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.m2209F(r0, r3, r7)
            r0.f3784k = r4
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
        return this.f2899a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f2899a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f2899a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f2899a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f2899a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f2899a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f2900b) {
            this.f2899a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0646qu)) {
            return this.f2899a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f2899a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2899a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f2899a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        m1728b(i, menu);
        if (i == 108) {
            LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = this.f2903e;
            layoutInflaterFactory2C0656r3.m2204A();
            dc0 dc0Var = layoutInflaterFactory2C0656r3.f4042o;
            if (dc0Var != null) {
                ArrayList arrayList = dc0Var.f1368H;
                if (true != dc0Var.f1367G) {
                    dc0Var.f1367G = true;
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
        if (this.f2902d) {
            this.f2899a.onPanelClosed(i, menu);
            return;
        }
        m1729c(i, menu);
        LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3 = this.f2903e;
        if (i != 108) {
            if (i == 0) {
                C0619q3 c0619q3M2223z = layoutInflaterFactory2C0656r3.m2223z(i);
                if (c0619q3M2223z.f3786m) {
                    layoutInflaterFactory2C0656r3.m2217s(c0619q3M2223z, false);
                    return;
                }
                return;
            }
            return;
        }
        layoutInflaterFactory2C0656r3.m2204A();
        dc0 dc0Var = layoutInflaterFactory2C0656r3.f4042o;
        if (dc0Var != null) {
            ArrayList arrayList = dc0Var.f1368H;
            if (dc0Var.f1367G) {
                dc0Var.f1367G = false;
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
        yb0.m2740a(this.f2899a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0646qu menuC0646qu = menu instanceof MenuC0646qu ? (MenuC0646qu) menu : null;
        if (i == 0 && menuC0646qu == null) {
            return false;
        }
        if (menuC0646qu != null) {
            menuC0646qu.f3974x = true;
        }
        boolean zOnPreparePanel = this.f2899a.onPreparePanel(i, view, menu);
        if (menuC0646qu != null) {
            menuC0646qu.f3974x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0646qu menuC0646qu = this.f2903e.m2223z(0).f3781h;
        if (menuC0646qu != null) {
            m1730d(list, menuC0646qu, i);
        } else {
            m1730d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return wb0.m2604a(this.f2899a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f2899a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f2899a.onWindowFocusChanged(z);
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
        return this.f2899a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
