package io.sentry.android.replay.gestures;

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
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.android.replay.C1795p;
import io.sentry.android.replay.EnumC1796q;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.InterfaceC1776n;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.android.replay.gestures.a */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC1784a implements Window.Callback {

    /* JADX INFO: renamed from: a */
    public final Window.Callback f6482a;

    /* JADX INFO: renamed from: b */
    public final C2046v2 f6483b;

    /* JADX INFO: renamed from: c */
    public final ReplayIntegration f6484c;

    public WindowCallbackC1784a(C2046v2 r1, ReplayIntegration r2, Window.Callback r3) {
        this.f6482a = r3;
        this.f6483b = r1;
        this.f6484c = r2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3968a(MotionEvent r2) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.dispatchTouchEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent r2) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.dispatchGenericMotionEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent r2) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.dispatchKeyEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent r2) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.dispatchKeyShortcutEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r2) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.dispatchPopulateAccessibilityEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent r6) {
        if (r6 == null) goto L21;
        MotionEvent r0 = MotionEvent.obtainNoHistory(r6);
        ReplayIntegration r1 = this.f6484c;     // Catch: Throwable -> L14
        if (r1.f6391j.get() == false) goto L13;
        C1795p r2 = r1.f6397p;     // Catch: Throwable -> L14
        if (r2.f6517a != EnumC1796q.STARTED) goto L9;
    L10:
        InterfaceC1776n r12 = r1.f6393l;     // Catch: Throwable -> L14
        if (r12 == null) goto L13;
        r12.mo3952a(r0);     // Catch: Throwable -> L14
        goto L13
    L9:
        if (r2.f6517a == EnumC1796q.RESUMED) goto L10;
    L13:
        r0.recycle();
    L14:
        th = move-exception;
        this.f6483b.getLogger().mo3683r(EnumC1657a2.ERROR, "Error dispatching touch event", th);     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        r0.recycle();
        throw th;
    L21:
        return m3968a(r6);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent r2) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.dispatchTrackballEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode r2) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L5;
        return;
    L5:
        r0.onActionModeFinished(r2);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode r2) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L5;
        return;
    L5:
        r0.onActionModeStarted(r2);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L5;
        return;
    L5:
        r0.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L5;
        return;
    L5:
        r0.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r2, Menu r3) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.onCreatePanelMenu(r2, r3);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int r2) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.onCreatePanelView(r2);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L5;
        return;
    L5:
        r0.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int r2, MenuItem r3) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.onMenuItemSelected(r2, r3);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int r2, Menu r3) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.onMenuOpened(r2, r3);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int r2, Menu r3) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L5;
        return;
    L5:
        r0.onPanelClosed(r2, r3);
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean r2) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L5;
        return;
    L5:
        r0.onPointerCaptureChanged(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int r2, View r3, Menu r4) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.onPreparePanel(r2, r3, r4);
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List r2, Menu r3, int r4) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L5;
        return;
    L5:
        r0.onProvideKeyboardShortcuts(r2, r3, r4);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams r2) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L5;
        return;
    L5:
        r0.onWindowAttributesChanged(r2);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean r2) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L5;
        return;
    L5:
        r0.onWindowFocusChanged(r2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback r2) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.onWindowStartingActionMode(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent r2) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.onSearchRequested(r2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback r2, int r3) {
        Window.Callback r0 = this.f6482a;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.onWindowStartingActionMode(r2, r3);
    }
}
