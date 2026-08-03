package Yue;

import Yue.InterfaceC7144;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢۥۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class WindowCallbackC8434 implements Window.Callback {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Window.Callback f25285;

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۢ$ۥ */
    @InterfaceC7113(23)
    public static class C1532 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m4418(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static ActionMode m4419(Window.Callback callback, ActionMode.Callback callback2, int i) {
            return callback.onWindowStartingActionMode(callback2, i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۢ$ۥ۟ */
    @InterfaceC7113(24)
    public static class C1533 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m4420(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
            callback.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۢ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(26)
    public static class C8435 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m4421(Window.Callback callback, boolean z) {
            callback.onPointerCaptureChanged(z);
        }
    }

    public WindowCallbackC8434(Window.Callback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f25285 = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f25285.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f25285.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f25285.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f25285.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f25285.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f25285.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.f25285.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.f25285.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f25285.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f25285.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f25285.onCreatePanelMenu(i, menu);
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i) {
        return this.f25285.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f25285.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f25285.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return this.f25285.onMenuOpened(i, menu);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.f25285.onPanelClosed(i, menu);
    }

    @Override // android.view.Window.Callback
    @InterfaceC7113(26)
    public void onPointerCaptureChanged(boolean z) {
        C8435.m4421(this.f25285, z);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f25285.onPreparePanel(i, view, menu);
    }

    @Override // android.view.Window.Callback
    @InterfaceC7113(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        C1533.m4420(this.f25285, list, menu, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    @InterfaceC7113(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return C1532.m4418(this.f25285, searchEvent);
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f25285.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.f25285.onWindowFocusChanged(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.f25285.onWindowStartingActionMode(callback);
    }

    /* JADX INFO: renamed from: ۥ */
    public final Window.Callback m4417() {
        return this.f25285;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f25285.onSearchRequested();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Window.Callback
    @InterfaceC7113(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return C1532.m4419(this.f25285, callback, i);
    }
}
