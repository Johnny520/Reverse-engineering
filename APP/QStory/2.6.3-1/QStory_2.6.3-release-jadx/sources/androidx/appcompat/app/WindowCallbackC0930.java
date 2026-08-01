package androidx.appcompat.app;

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
import androidx.compose.animation.core.C1171;
import java.util.List;
import p206.MenuC8631;
import p208.AbstractC8639;
import p208.AbstractC8641;
import p208.AbstractC8644;
import p208.AbstractC8645;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC0930 implements Window.Callback {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f584;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f585;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C0915 f586;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C0912 f587;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f588;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Window.Callback f589;

    public WindowCallbackC0930(LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915, Window.Callback callback) {
        this.f586 = layoutInflaterFactory2C0915;
        if (callback != null) {
            this.f589 = callback;
        } else {
            C6755.m11869("Window callback may not be null");
            throw null;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f589.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f585;
        Window.Callback callback = this.f589;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.f586.m795(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f589.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = this.f586;
            layoutInflaterFactory2C0915.m777();
            AbstractC0935 abstractC0935 = layoutInflaterFactory2C0915.f510;
            if (abstractC0935 == null || !abstractC0935.mo741(keyCode, keyEvent)) {
                C0916 c0916 = layoutInflaterFactory2C0915.f545;
                if (c0916 == null || !layoutInflaterFactory2C0915.m784(c0916, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C0915.f545 == null) {
                        C0916 c0916M778 = layoutInflaterFactory2C0915.m778(0);
                        layoutInflaterFactory2C0915.m783(c0916M778, keyEvent);
                        boolean zM784 = layoutInflaterFactory2C0915.m784(c0916M778, keyEvent.getKeyCode(), keyEvent);
                        c0916M778.f560 = false;
                        if (zM784) {
                        }
                    }
                    return false;
                }
                C0916 c09162 = layoutInflaterFactory2C0915.f545;
                if (c09162 != null) {
                    c09162.f561 = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f589.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f589.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f589.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f589.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f589.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f589.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f588) {
            this.f589.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC8631)) {
            return this.f589.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        C0912 c0912 = this.f587;
        if (c0912 != null) {
            View view = i == 0 ? new View(c0912.f486.f472.f957.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f589.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f589.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f589.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        m880(i, menu);
        if (i == 108) {
            LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = this.f586;
            layoutInflaterFactory2C0915.m777();
            AbstractC0935 abstractC0935 = layoutInflaterFactory2C0915.f510;
            if (abstractC0935 != null) {
                abstractC0935.mo731(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f584) {
            this.f589.onPanelClosed(i, menu);
            return;
        }
        m879(i, menu);
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = this.f586;
        if (i == 108) {
            layoutInflaterFactory2C0915.m777();
            AbstractC0935 abstractC0935 = layoutInflaterFactory2C0915.f510;
            if (abstractC0935 != null) {
                abstractC0935.mo731(false);
                return;
            }
            return;
        }
        if (i == 0) {
            C0916 c0916M778 = layoutInflaterFactory2C0915.m778(i);
            if (c0916M778.f555) {
                layoutInflaterFactory2C0915.m791(c0916M778, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        AbstractC8641.m13731(this.f589, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC8631 menuC8631 = menu instanceof MenuC8631 ? (MenuC8631) menu : null;
        if (i == 0 && menuC8631 == null) {
            return false;
        }
        if (menuC8631 != null) {
            menuC8631.f21593 = true;
        }
        C0912 c0912 = this.f587;
        if (c0912 != null && i == 0) {
            C0907 c0907 = c0912.f486;
            if (!c0907.f469) {
                c0907.f472.f964 = true;
                c0907.f469 = true;
            }
        }
        boolean zOnPreparePanel = this.f589.onPreparePanel(i, view, menu);
        if (menuC8631 != null) {
            menuC8631.f21593 = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC8631 menuC8631 = this.f586.m778(0).f558;
        if (menuC8631 != null) {
            m878(list, menuC8631, i);
        } else {
            m878(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC8644.m13735(this.f589, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f589.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f589.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (i != 0) {
            return AbstractC8644.m13734(this.f589, callback, i);
        }
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = this.f586;
        C1171 c1171 = new C1171(layoutInflaterFactory2C0915.f514, callback);
        AbstractC8639 abstractC8639Mo796 = layoutInflaterFactory2C0915.mo796(c1171);
        if (abstractC8639Mo796 != null) {
            return c1171.m1526(abstractC8639Mo796);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m878(List list, Menu menu, int i) {
        AbstractC8645.m13736(this.f589, list, menu, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m879(int i, Menu menu) {
        this.f589.onPanelClosed(i, menu);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m880(int i, Menu menu) {
        return this.f589.onMenuOpened(i, menu);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m881(Window.Callback callback) {
        try {
            this.f588 = true;
            callback.onContentChanged();
        } finally {
            this.f588 = false;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f589.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
