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

    public WindowCallbackC2741y3(LayoutInflaterFactory2C0176E3 r1, Window.Callback r2) {
        this.f9350f = r1;
        if (r2 == null) goto L7;
        this.f9345a = r2;
        return;
    L7:
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* JADX INFO: renamed from: a */
    public final void m5304a(Window.Callback r3) {
        this.f9347c = true;     // Catch: Throwable -> L6
        r3.onContentChanged();     // Catch: Throwable -> L6
        this.f9347c = false;
        return;
    L6:
        th = move-exception;
        this.f9347c = false;
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5305b(int r2, Menu r3) {
        return this.f9345a.onMenuOpened(r2, r3);
    }

    /* JADX INFO: renamed from: c */
    public final void m5306c(int r2, Menu r3) {
        this.f9345a.onPanelClosed(r2, r3);
    }

    /* JADX INFO: renamed from: d */
    public final void m5307d(List r2, Menu r3, int r4) {
        AbstractC1537iF.m2915a(this.f9345a, r2, r3, r4);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent r2) {
        return this.f9345a.dispatchGenericMotionEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent r3) {
        boolean r0 = this.f9348d;
        Window.Callback r1 = this.f9345a;
        if (r0 == false) goto L7;
        return r1.dispatchKeyEvent(r3);
    L7:
        if (this.f9350f.m355u(r3) == false) goto L9;
        return true;
    L9:
        if (r1.dispatchKeyEvent(r3) == true) goto L15;
        return false;
    L15:
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent r6) {
        if (this.f9345a.dispatchKeyShortcutEvent(r6) == true) goto L23;
        int r0 = r6.getKeyCode();
        LayoutInflaterFactory2C0176E3 r2 = this.f9350f;
        r2.m332A();
        AbstractC2257n0 r3 = r2.f498o;
        if (r3 != null) goto L7;
    L9:
        C0133D3 r02 = r2.f472M;
        if (r02 == null) goto L18;
        if (r2.m337F(r02, r6.getKeyCode(), r6) == false) goto L18;
        C0133D3 r62 = r2.f472M;
        if (r62 == null) goto L23;
        r62.f340l = true;
        return true;
    L18:
        if (r2.f472M != null) goto L22;
        C0133D3 r03 = r2.m360z(0);
        r2.m338G(r03, r6);
        boolean r63 = r2.m337F(r03, r6.getKeyCode(), r6);
        r03.f339k = false;
        if (r63 == true) goto L23;
    L22:
        return false;
    L7:
        if (r3.mo4508j(r0, r6) == false) goto L9;
    L23:
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r2) {
        return this.f9345a.dispatchPopulateAccessibilityEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent r2) {
        return this.f9345a.dispatchTouchEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent r2) {
        return this.f9345a.dispatchTrackballEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode r2) {
        this.f9345a.onActionModeFinished(r2);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode r2) {
        this.f9345a.onActionModeStarted(r2);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f9345a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f9347c == false) goto L6;
        this.f9345a.onContentChanged();
        return;
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r2, Menu r3) {
        if (r2 != 0) goto L8;
        if ((r3 instanceof MenuC2204lr) == true) goto L8;
        return false;
    L8:
        return this.f9345a.onCreatePanelMenu(r2, r3);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int r3) {
        C2534tB r0 = this.f9346b;
        if (r0 == null) goto L10;
        if (r3 != 0) goto L6;
        View r1 = new View(r0.f8839a.f8929a.f9213a.getContext());
    L7:
        if (r1 == null) goto L10;
        return r1;
    L6:
        r1 = null;
    L10:
        return this.f9345a.onCreatePanelView(r3);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f9345a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int r2, MenuItem r3) {
        return this.f9345a.onMenuItemSelected(r2, r3);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int r3, Menu r4) {
        m5305b(r3, r4);
        LayoutInflaterFactory2C0176E3 r1 = this.f9350f;
        if (r3 != 108) goto L7;
        r1.m332A();
        AbstractC2257n0 r32 = r1.f498o;
        if (r32 == null) goto L8;
        r32.mo4503c(true);
    L8:
        return true;
    L7:
        r1.getClass();
        goto L8
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int r3, Menu r4) {
        if (this.f9349e == false) goto L6;
        this.f9345a.onPanelClosed(r3, r4);
        return;
    L6:
        m5306c(r3, r4);
        LayoutInflaterFactory2C0176E3 r0 = this.f9350f;
        if (r3 != 108) goto L12;
        r0.m332A();
        AbstractC2257n0 r32 = r0.f498o;
        if (r32 == null) goto L17;
        r32.mo4503c(false);
        return;
    L17:
        return;
    L12:
        if (r3 != 0) goto L18;
        C0133D3 r33 = r0.m360z(r3);
        if (r33.f341m == false) goto L19;
        r0.m354s(r33, false);
        return;
    L19:
        return;
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean r2) {
        AbstractC2094jF.m4280a(this.f9345a, r2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int r6, View r7, Menu r8) {
        if ((r8 instanceof MenuC2204lr) == false) goto L5;
        MenuC2204lr r0 = (MenuC2204lr) r8;
    L7:
        if (r6 != 0) goto L11;
        if (r0 != null) goto L11;
        return false;
    L11:
        if (r0 == null) goto L13;
        r0.f7683x = true;
    L13:
        C2534tB r3 = this.f9346b;
        if (r3 == null) goto L19;
        if (r6 != 0) goto L19;
        C2577uB r32 = r3.f8839a;
        if (r32.f8932d == true) goto L19;
        r32.f8929a.f9224l = true;
        r32.f8932d = true;
    L19:
        boolean r62 = this.f9345a.onPreparePanel(r6, r7, r8);
        if (r0 == null) goto L22;
        r0.f7683x = false;
    L22:
        return r62;
    L5:
        r0 = null;
        goto L7
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List r3, Menu r4, int r5) {
        MenuC2204lr r0 = this.f9350f.m360z(0).f336h;
        if (r0 == null) goto L6;
        m5307d(r3, r0, r5);
        return;
    L6:
        m5307d(r3, r4, r5);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent r2) {
        return AbstractC1493hF.m2856a(this.f9345a, r2);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams r2) {
        this.f9345a.onWindowAttributesChanged(r2);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean r2) {
        this.f9345a.onWindowFocusChanged(r2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback r3, int r4) {
        if (r4 != 0) goto L4;
        LayoutInflaterFactory2C0176E3 r0 = this.f9350f;
        Context r1 = r0.f494k;
        C2428qs r42 = new C2428qs();
        r42.f8522c = r1;
        r42.f8521b = r3;
        r42.f8520a = new ArrayList();
        r42.f8523d = new C2520sy(0);
        AbstractC0345I0 r32 = r0.mo349l(r42);
        if (r32 != null) goto L8;
        return null;
    L8:
        return r42.m4878p(r32);
    L4:
        return AbstractC1493hF.m2857b(this.f9345a, r3, r4);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f9345a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback r1) {
        return null;
    }
}
