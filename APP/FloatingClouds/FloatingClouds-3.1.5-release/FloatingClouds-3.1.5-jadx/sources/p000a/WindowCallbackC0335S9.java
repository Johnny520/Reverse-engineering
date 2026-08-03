package p000a;

import android.annotation.NonNull;
import android.annotation.Nullable;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ListView;
import p000a.C0186K3;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.S9 */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC0335S9 implements Window.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Window.Callback f1197a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Window.Callback f1198b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0353T9 f1199c;

    public WindowCallbackC0335S9(Window.Callback callback, C0353T9 c0353t9) {
        this.f1198b = callback;
        this.f1199c = c0353t9;
        this.f1197a = callback;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1197a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1197a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f1197a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1197a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C0353T9 c0353t9;
        ListView listView;
        Object objM2206a;
        boolean z;
        int actionMasked;
        if (motionEvent != null && (listView = (c0353t9 = this.f1199c).f1287a) != null) {
            C0186K3.f638a.getClass();
            if (C0186K3.a.m511l() && C0186K3.a.m508i().f2440j && C0186K3.a.m508i().f2441k) {
                int[] iArr = new int[2];
                try {
                    listView.getLocationOnScreen(iArr);
                    objM2206a = C0413Wf.f1577a;
                } catch (Throwable th) {
                    objM2206a = C0920xd.m2206a(th);
                }
                if (!(objM2206a instanceof C0901wd.a)) {
                    int rawX = (int) motionEvent.getRawX();
                    int rawY = (int) motionEvent.getRawY();
                    int i = iArr[0];
                    if (rawX > listView.getWidth() + i || i > rawX) {
                        z = false;
                        actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 0) {
                            if (actionMasked == 1) {
                                if (c0353t9.f1302p) {
                                    c0353t9.f1302p = false;
                                    c0353t9.f1306t.removeCallbacks(c0353t9.f1308v);
                                }
                                c0353t9.f1301o = false;
                                c0353t9.f1306t.removeCallbacks(c0353t9.f1307u);
                                if (c0353t9.f1303q) {
                                    c0353t9.f1303q = false;
                                }
                            } else if (actionMasked != 2) {
                                if (actionMasked == 3) {
                                    c0353t9.f1302p = true;
                                    c0353t9.f1306t.removeCallbacks(c0353t9.f1308v);
                                    c0353t9.f1306t.postDelayed(c0353t9.f1308v, c0353t9.f1297k);
                                }
                            } else if (c0353t9.f1301o) {
                                float rawX2 = motionEvent.getRawX() - c0353t9.f1304r;
                                float rawY2 = motionEvent.getRawY() - c0353t9.f1305s;
                                int scaledTouchSlop = ViewConfiguration.get(listView.getContext()).getScaledTouchSlop();
                                if ((rawY2 * rawY2) + (rawX2 * rawX2) > scaledTouchSlop * scaledTouchSlop) {
                                    c0353t9.f1301o = false;
                                    c0353t9.f1306t.removeCallbacks(c0353t9.f1307u);
                                }
                            }
                        } else if (z) {
                            c0353t9.f1303q = false;
                            c0353t9.f1302p = false;
                            c0353t9.f1306t.removeCallbacks(c0353t9.f1308v);
                            c0353t9.f1301o = true;
                            c0353t9.f1304r = motionEvent.getRawX();
                            c0353t9.f1305s = motionEvent.getRawY();
                            c0353t9.f1306t.removeCallbacks(c0353t9.f1307u);
                            c0353t9.f1306t.postDelayed(c0353t9.f1307u, c0353t9.f1294h);
                        }
                    } else {
                        int i2 = iArr[1];
                        if (rawY <= listView.getHeight() + i2 && i2 <= rawY) {
                            z = true;
                        }
                        actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 0) {
                        }
                    }
                }
            }
        }
        return this.f1198b.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1197a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f1197a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f1197a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f1197a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.f1197a.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, @NonNull Menu menu) {
        C0631i9.m1482e(menu, "p1");
        return this.f1197a.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final View onCreatePanelView(int i) {
        return this.f1197a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f1197a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, @NonNull MenuItem menuItem) {
        C0631i9.m1482e(menuItem, "p1");
        return this.f1197a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, @NonNull Menu menu) {
        C0631i9.m1482e(menu, "p1");
        return this.f1197a.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, @NonNull Menu menu) {
        C0631i9.m1482e(menu, "p1");
        this.f1197a.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, @Nullable View view, @NonNull Menu menu) {
        C0631i9.m1482e(menu, "p2");
        return this.f1197a.onPreparePanel(i, view, menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f1197a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1197a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f1197a.onWindowFocusChanged(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    @Nullable
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f1197a.onWindowStartingActionMode(callback);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f1197a.onSearchRequested(searchEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Window.Callback
    @Nullable
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return this.f1197a.onWindowStartingActionMode(callback, i);
    }
}
