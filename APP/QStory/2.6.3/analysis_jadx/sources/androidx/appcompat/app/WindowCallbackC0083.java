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
import androidx.compose.animation.core.C0325;
import java.util.List;
import p190.MenuC7802;
import p192.AbstractC7810;
import p192.AbstractC7812;
import p192.AbstractC7815;
import p192.AbstractC7816;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC0083 implements Window.Callback {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f239;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f240;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C0068 f241;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public C0065 f242;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f243;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Window.Callback f244;

    public WindowCallbackC0083(LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068, Window.Callback callback) {
        this.f241 = layoutInflaterFactory2C0068;
        if (callback != null) {
            this.f244 = callback;
        } else {
            C5925.m11310("Window callback may not be null");
            throw null;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f244.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f240;
        Window.Callback callback = this.f244;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.f241.m235(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f244.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = this.f241;
            layoutInflaterFactory2C0068.m217();
            AbstractC0088 abstractC0088 = layoutInflaterFactory2C0068.f165;
            if (abstractC0088 == null || !abstractC0088.mo181(keyCode, keyEvent)) {
                C0069 c0069 = layoutInflaterFactory2C0068.f200;
                if (c0069 == null || !layoutInflaterFactory2C0068.m224(c0069, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C0068.f200 == null) {
                        C0069 c0069M218 = layoutInflaterFactory2C0068.m218(0);
                        layoutInflaterFactory2C0068.m223(c0069M218, keyEvent);
                        boolean zM224 = layoutInflaterFactory2C0068.m224(c0069M218, keyEvent.getKeyCode(), keyEvent);
                        c0069M218.f215 = false;
                        if (zM224) {
                        }
                    }
                    return false;
                }
                C0069 c00692 = layoutInflaterFactory2C0068.f200;
                if (c00692 != null) {
                    c00692.f216 = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f244.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f244.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f244.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f244.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f244.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f244.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f243) {
            this.f244.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC7802)) {
            return this.f244.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        C0065 c0065 = this.f242;
        if (c0065 != null) {
            View view = i == 0 ? new View(c0065.f141.f127.f612.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f244.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f244.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f244.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        m320(i, menu);
        if (i == 108) {
            LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = this.f241;
            layoutInflaterFactory2C0068.m217();
            AbstractC0088 abstractC0088 = layoutInflaterFactory2C0068.f165;
            if (abstractC0088 != null) {
                abstractC0088.mo171(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f239) {
            this.f244.onPanelClosed(i, menu);
            return;
        }
        m319(i, menu);
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = this.f241;
        if (i == 108) {
            layoutInflaterFactory2C0068.m217();
            AbstractC0088 abstractC0088 = layoutInflaterFactory2C0068.f165;
            if (abstractC0088 != null) {
                abstractC0088.mo171(false);
                return;
            }
            return;
        }
        if (i == 0) {
            C0069 c0069M218 = layoutInflaterFactory2C0068.m218(i);
            if (c0069M218.f210) {
                layoutInflaterFactory2C0068.m231(c0069M218, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        AbstractC7812.m13172(this.f244, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC7802 menuC7802 = menu instanceof MenuC7802 ? (MenuC7802) menu : null;
        if (i == 0 && menuC7802 == null) {
            return false;
        }
        if (menuC7802 != null) {
            menuC7802.f21248 = true;
        }
        C0065 c0065 = this.f242;
        if (c0065 != null && i == 0) {
            C0060 c0060 = c0065.f141;
            if (!c0060.f124) {
                c0060.f127.f619 = true;
                c0060.f124 = true;
            }
        }
        boolean zOnPreparePanel = this.f244.onPreparePanel(i, view, menu);
        if (menuC7802 != null) {
            menuC7802.f21248 = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC7802 menuC7802 = this.f241.m218(0).f213;
        if (menuC7802 != null) {
            m318(list, menuC7802, i);
        } else {
            m318(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC7815.m13176(this.f244, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f244.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f244.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (i != 0) {
            return AbstractC7815.m13175(this.f244, callback, i);
        }
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = this.f241;
        C0325 c0325 = new C0325(layoutInflaterFactory2C0068.f169, callback);
        AbstractC7810 abstractC7810Mo236 = layoutInflaterFactory2C0068.mo236(c0325);
        if (abstractC7810Mo236 != null) {
            return c0325.m966(abstractC7810Mo236);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m318(List list, Menu menu, int i) {
        AbstractC7816.m13177(this.f244, list, menu, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m319(int i, Menu menu) {
        this.f244.onPanelClosed(i, menu);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean m320(int i, Menu menu) {
        return this.f244.onMenuOpened(i, menu);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m321(Window.Callback callback) {
        try {
            this.f243 = true;
            callback.onContentChanged();
        } finally {
            this.f243 = false;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f244.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
