package io.sentry.android.core.internal.gestures;

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

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.b */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC1703b implements Window.Callback {
    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent r1) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent r1) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent r1) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r1) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent r1) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent r1) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode r1) {
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode r1) {
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r1, Menu r2) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int r1) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int r1, MenuItem r2) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int r1, Menu r2) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int r1, Menu r2) {
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int r1, View r2, Menu r3) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams r1) {
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean r1) {
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback r1) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent r1) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback r1, int r2) {
        return null;
    }
}
