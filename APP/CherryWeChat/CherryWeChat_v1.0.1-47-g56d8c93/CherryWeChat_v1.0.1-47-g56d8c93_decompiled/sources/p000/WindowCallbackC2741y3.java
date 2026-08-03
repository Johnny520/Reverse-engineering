package p000;

import android.content.Context;
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

/* JADX INFO: renamed from: y3 */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC2741y3 implements Window.Callback {

    /* JADX INFO: renamed from: a */
    public final Window.Callback f9345a;

    /* JADX INFO: renamed from: b */
    public C2534tB f9346b;

    /* JADX INFO: renamed from: c */
    public boolean f9347c;

    /* JADX INFO: renamed from: d */
    public boolean f9348d;

    /* JADX INFO: renamed from: e */
    public boolean f9349e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LayoutInflaterFactory2C0176E3 f9350f;

    public WindowCallbackC2741y3(LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3, Window.Callback callback) {
        this.f9350f = layoutInflaterFactory2C0176E3;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f9345a = callback;
    }

    /* JADX INFO: renamed from: a */
    public final void m5304a(Window.Callback callback) {
        try {
            this.f9347c = true;
            callback.onContentChanged();
        } finally {
            this.f9347c = false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5305b(int i, Menu menu) {
        return this.f9345a.onMenuOpened(i, menu);
    }

    /* JADX INFO: renamed from: c */
    public final void m5306c(int i, Menu menu) {
        this.f9345a.onPanelClosed(i, menu);
    }

    /* JADX INFO: renamed from: d */
    public final void m5307d(List list, Menu menu, int i) {
        AbstractC1537iF.m2915a(this.f9345a, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f9345a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f9348d;
        Window.Callback callback = this.f9345a;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.f9350f.m355u(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f9345a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = this.f9350f;
            layoutInflaterFactory2C0176E3.m332A();
            AbstractC2257n0 abstractC2257n0 = layoutInflaterFactory2C0176E3.f498o;
            if (abstractC2257n0 == null || !abstractC2257n0.mo4508j(keyCode, keyEvent)) {
                C0133D3 c0133d3 = layoutInflaterFactory2C0176E3.f472M;
                if (c0133d3 == null || !layoutInflaterFactory2C0176E3.m337F(c0133d3, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C0176E3.f472M == null) {
                        C0133D3 c0133d3M360z = layoutInflaterFactory2C0176E3.m360z(0);
                        layoutInflaterFactory2C0176E3.m338G(c0133d3M360z, keyEvent);
                        boolean zM337F = layoutInflaterFactory2C0176E3.m337F(c0133d3M360z, keyEvent.getKeyCode(), keyEvent);
                        c0133d3M360z.f339k = false;
                        if (zM337F) {
                        }
                    }
                    return false;
                }
                C0133D3 c0133d32 = layoutInflaterFactory2C0176E3.f472M;
                if (c0133d32 != null) {
                    c0133d32.f340l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f9345a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f9345a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f9345a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f9345a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f9345a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f9345a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f9347c) {
            this.f9345a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC2204lr)) {
            return this.f9345a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        C2534tB c2534tB = this.f9346b;
        if (c2534tB != null) {
            View view = i == 0 ? new View(c2534tB.f8839a.f8929a.f9213a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f9345a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f9345a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f9345a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        m5305b(i, menu);
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = this.f9350f;
        if (i == 108) {
            layoutInflaterFactory2C0176E3.m332A();
            AbstractC2257n0 abstractC2257n0 = layoutInflaterFactory2C0176E3.f498o;
            if (abstractC2257n0 != null) {
                abstractC2257n0.mo4503c(true);
            }
        } else {
            layoutInflaterFactory2C0176E3.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f9349e) {
            this.f9345a.onPanelClosed(i, menu);
            return;
        }
        m5306c(i, menu);
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = this.f9350f;
        if (i == 108) {
            layoutInflaterFactory2C0176E3.m332A();
            AbstractC2257n0 abstractC2257n0 = layoutInflaterFactory2C0176E3.f498o;
            if (abstractC2257n0 != null) {
                abstractC2257n0.mo4503c(false);
                return;
            }
            return;
        }
        if (i == 0) {
            C0133D3 c0133d3M360z = layoutInflaterFactory2C0176E3.m360z(i);
            if (c0133d3M360z.f341m) {
                layoutInflaterFactory2C0176E3.m354s(c0133d3M360z, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        AbstractC2094jF.m4280a(this.f9345a, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC2204lr menuC2204lr = menu instanceof MenuC2204lr ? (MenuC2204lr) menu : null;
        if (i == 0 && menuC2204lr == null) {
            return false;
        }
        if (menuC2204lr != null) {
            menuC2204lr.f7683x = true;
        }
        C2534tB c2534tB = this.f9346b;
        if (c2534tB != null && i == 0) {
            C2577uB c2577uB = c2534tB.f8839a;
            if (!c2577uB.f8932d) {
                c2577uB.f8929a.f9224l = true;
                c2577uB.f8932d = true;
            }
        }
        boolean zOnPreparePanel = this.f9345a.onPreparePanel(i, view, menu);
        if (menuC2204lr != null) {
            menuC2204lr.f7683x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC2204lr menuC2204lr = this.f9350f.m360z(0).f336h;
        if (menuC2204lr != null) {
            m5307d(list, menuC2204lr, i);
        } else {
            m5307d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC1493hF.m2856a(this.f9345a, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f9345a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f9345a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (i != 0) {
            return AbstractC1493hF.m2857b(this.f9345a, callback, i);
        }
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = this.f9350f;
        Context context = layoutInflaterFactory2C0176E3.f494k;
        C2428qs c2428qs = new C2428qs();
        c2428qs.f8522c = context;
        c2428qs.f8521b = callback;
        c2428qs.f8520a = new ArrayList();
        c2428qs.f8523d = new C2520sy(0);
        AbstractC0345I0 abstractC0345I0Mo349l = layoutInflaterFactory2C0176E3.mo349l(c2428qs);
        if (abstractC0345I0Mo349l != null) {
            return c2428qs.m4878p(abstractC0345I0Mo349l);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f9345a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
