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

/* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractWindowCallbackC1710i implements Window.Callback {

    /* JADX INFO: renamed from: a */
    public final Window.Callback f6184a;

    public AbstractWindowCallbackC1710i(Window.Callback r1) {
        this.f6184a = r1;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent r2) {
        return this.f6184a.dispatchGenericMotionEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent r2) {
        return this.f6184a.dispatchKeyEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent r2) {
        return this.f6184a.dispatchKeyShortcutEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r2) {
        return this.f6184a.dispatchPopulateAccessibilityEvent(r2);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent r2) {
        return this.f6184a.dispatchTouchEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent r2) {
        return this.f6184a.dispatchTrackballEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode r2) {
        this.f6184a.onActionModeFinished(r2);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode r2) {
        this.f6184a.onActionModeStarted(r2);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f6184a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f6184a.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r2, Menu r3) {
        return this.f6184a.onCreatePanelMenu(r2, r3);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int r2) {
        return this.f6184a.onCreatePanelView(r2);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f6184a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int r2, MenuItem r3) {
        return this.f6184a.onMenuItemSelected(r2, r3);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int r2, Menu r3) {
        return this.f6184a.onMenuOpened(r2, r3);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int r2, Menu r3) {
        this.f6184a.onPanelClosed(r2, r3);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int r2, View r3, Menu r4) {
        return this.f6184a.onPreparePanel(r2, r3, r4);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f6184a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams r2) {
        this.f6184a.onWindowAttributesChanged(r2);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean r2) {
        this.f6184a.onWindowFocusChanged(r2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback r2) {
        return this.f6184a.onWindowStartingActionMode(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent r2) {
        return this.f6184a.onSearchRequested(r2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback r2, int r3) {
        return this.f6184a.onWindowStartingActionMode(r2, r3);
    }
}
