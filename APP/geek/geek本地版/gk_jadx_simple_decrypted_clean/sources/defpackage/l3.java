package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.ljx.wechatmod.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l3 implements Window.Callback {
    public final Window.Callback a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ r3 e;

    public l3(r3 r1, Window.Callback r2) {
        this.e = r1;
        if (r2 == null) goto L7;
        this.a = r2;
        return;
    L7:
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback r3) {
        this.b = true;     // Catch: Throwable -> L6
        r3.onContentChanged();     // Catch: Throwable -> L6
        this.b = false;
        return;
    L6:
        th = move-exception;
        this.b = false;
        throw th;
    }

    public final boolean b(int r2, Menu r3) {
        return this.a.onMenuOpened(r2, r3);
    }

    public final void c(int r2, Menu r3) {
        this.a.onPanelClosed(r2, r3);
    }

    public final void d(List r2, Menu r3, int r4) {
        sb0.a(this.a, r2, r3, r4);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent r2) {
        return this.a.dispatchGenericMotionEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent r3) {
        boolean r0 = this.c;
        Window.Callback r1 = this.a;
        if (r0 == false) goto L7;
        return r1.dispatchKeyEvent(r3);
    L7:
        if (this.e.u(r3) == false) goto L9;
        return true;
    L9:
        if (r1.dispatchKeyEvent(r3) == true) goto L15;
        return false;
    L15:
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent r7) {
        if (this.a.dispatchKeyShortcutEvent(r7) == true) goto L34;
        int r0 = r7.getKeyCode();
        r3 r2 = this.e;
        r2.A();
        yb0 r3 = r2.o;
        if (r3 == null) goto L18;
        xb0 r32 = r3.E;
        if (r32 != null) goto L9;
    L8:
        boolean r02 = false;
    L16:
        if (r02 == false) goto L18;
    L17:
        boolean r72 = true;
    L31:
        if (r72 == true) goto L34;
        return false;
    L9:
        ku r33 = r32.d;
        if (r33 == null) goto L8;
        if (KeyCharacterMap.load(r7.getDeviceId()).getKeyboardType() == 1) goto L14;
        boolean r5 = true;
    L15:
        r33.setQwertyMode(r5);
        r02 = r33.performShortcut(r0, r7, 0);
        goto L16
    L14:
        r5 = false;
    L18:
        q3 r03 = r2.M;
        if (r03 == null) goto L26;
        if (r2.F(r03, r7.getKeyCode(), r7) == false) goto L26;
        q3 r73 = r2.M;
        if (r73 == null) goto L17;
        r73.l = true;
    L26:
        if (r2.M != null) goto L30;
        q3 r04 = r2.z(0);
        r2.G(r04, r7);
        boolean r74 = r2.F(r04, r7.getKeyCode(), r7);
        r04.k = false;
        if (r74 == true) goto L17;
    L30:
        r72 = false;
    L34:
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r2) {
        return this.a.dispatchPopulateAccessibilityEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent r2) {
        return this.a.dispatchTouchEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent r2) {
        return this.a.dispatchTrackballEvent(r2);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode r2) {
        this.a.onActionModeFinished(r2);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode r2) {
        this.a.onActionModeStarted(r2);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.b == false) goto L6;
        this.a.onContentChanged();
        return;
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int r2, Menu r3) {
        if (r2 != 0) goto L8;
        if ((r3 instanceof ku) == true) goto L8;
        return false;
    L8:
        return this.a.onCreatePanelMenu(r2, r3);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int r2) {
        return this.a.onCreatePanelView(r2);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int r2, MenuItem r3) {
        return this.a.onMenuItemSelected(r2, r3);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int r3, Menu r4) {
        b(r3, r4);
        if (r3 != 108) goto L14;
        r3 r32 = this.e;
        r32.A();
        yb0 r33 = r32.o;
        if (r33 == null) goto L14;
        ArrayList r42 = r33.I;
        if (true == r33.H) goto L14;
        r33.H = true;
        if (r42.size() <= 0) goto L14;
        r42.get(0).getClass();
        throw new ClassCastException();
    L14:
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int r3, Menu r4) {
        if (this.d == false) goto L6;
        this.a.onPanelClosed(r3, r4);
        return;
    L6:
        c(r3, r4);
        r3 r1 = this.e;
        if (r3 != 108) goto L18;
        r1.A();
        yb0 r32 = r1.o;
        if (r32 == null) goto L23;
        ArrayList r42 = r32.I;
        if (r32.H == false) goto L26;
        r32.H = false;
        if (r42.size() <= 0) goto L27;
        r42.get(0).getClass();
        throw new ClassCastException();
    L27:
        return;
    L26:
        return;
    L23:
        return;
    L18:
        if (r3 != 0) goto L24;
        q3 r33 = r1.z(r3);
        if (r33.m == false) goto L25;
        r1.s(r33, false);
        return;
    L25:
        return;
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean r2) {
        tb0.a(this.a, r2);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int r4, View r5, Menu r6) {
        if ((r6 instanceof ku) == false) goto L5;
        ku r0 = (ku) r6;
    L7:
        if (r4 != 0) goto L10;
        if (r0 != null) goto L10;
        return false;
    L10:
        if (r0 == null) goto L12;
        r0.x = true;
    L12:
        boolean r42 = this.a.onPreparePanel(r4, r5, r6);
        if (r0 == null) goto L15;
        r0.x = false;
    L15:
        return r42;
    L5:
        r0 = null;
        goto L7
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List r3, Menu r4, int r5) {
        ku r0 = this.e.z(0).h;
        if (r0 == null) goto L6;
        d(r3, r0, r5);
        return;
    L6:
        d(r3, r4, r5);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent r2) {
        return rb0.a(this.a, r2);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams r2) {
        this.a.onWindowAttributesChanged(r2);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean r2) {
        this.a.onWindowFocusChanged(r2);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback r11, int r12) {
        if (r12 != 0) goto L4;
        r3 r0 = this.e;
        Context r1 = r0.k;
        a8 r122 = new a8();
        r122.b = r1;
        r122.a = r11;
        r122.c = new ArrayList();
        r122.d = new u30();
        n1 r112 = r0.u;
        if (r112 == null) goto L8;
        r112.a();
    L8:
        d4 r113 = new d4(r0, 2, r122);
        r0.A();
        yb0 r3 = r0.o;
        int r4 = 1;
        if (r3 == null) goto L24;
        xb0 r7 = r3.E;
        if (r7 == null) goto L13;
        r7.a();
    L13:
        r3.y.setHideOnContentScrollEnabled(false);
        r3.B.e();
        xb0 r72 = new xb0(r3, r3.B.getContext(), r113);
        ku r8 = r72.d;
        r8.w();
        boolean r9 = ((a8) r72.e.b).d(r72, r8);     // Catch: Throwable -> L20
        r8.v();
        if (r9 == false) goto L18;
        r3.E = r72;
        r72.g();
        r3.B.c(r72);
        r3.K(true);
    L19:
        r0.u = r72;
        goto L24
    L18:
        r72 = null;
    L20:
        th = move-exception;
        r8.v();
        throw th;
    L24:
        if (r0.u != null) goto L71;
        wa0 r32 = r0.y;
        if (r32 == null) goto L28;
        r32.b();
    L28:
        n1 r33 = r0.u;
        if (r33 == null) goto L32;
        r33.a();
    L32:
        if (r0.v != null) goto L50;
        if (r0.I == false) goto L39;
        TypedValue r34 = new TypedValue();
        Resources.Theme r73 = r1.getTheme();
        r73.resolveAttribute(R.attr.actionBarTheme, r34, true);
        if (r34.resourceId == 0) goto L38;
        Resources.Theme r82 = r1.getResources().newTheme();
        r82.setTo(r73);
        r82.applyStyle(r34.resourceId, true);
        kd r74 = new kd(r1, 0);
        r74.getTheme().setTo(r82);
        r1 = r74;
    L38:
        r0.v = new ActionBarContextView(r1, null);
        PopupWindow r75 = new PopupWindow(r1, null, R.attr.actionModePopupWindowStyle);
        r0.w = r75;
        vx.d(r75, 2);
        r0.w.setContentView(r0.v);
        r0.w.setWidth(-1);
        r1.getTheme().resolveAttribute(R.attr.actionBarSize, r34, true);
        r0.v.setContentHeight(TypedValue.complexToDimensionPixelSize(r34.data, r1.getResources().getDisplayMetrics()));
        r0.w.setHeight(-2);
        r0.x = new f3(r0, r4);
        goto L50
    L39:
        ViewStubCompat r2 = (ViewStubCompat) r0.A.findViewById(R.id.action_mode_bar_stub);
        if (r2 == null) goto L50;
        r0.A();
        yb0 r35 = r0.o;
        if (r35 == null) goto L44;
        Context r36 = r35.L();
    L45:
        if (r36 == null) goto L48;
        r1 = r36;
    L48:
        r2.setLayoutInflater(LayoutInflater.from(r1));
        r0.v = (ActionBarContextView) r2.a();
        goto L50
    L44:
        r36 = null;
    L50:
        if (r0.v == null) goto L70;
        wa0 r13 = r0.y;
        if (r13 == null) goto L54;
        r13.b();
    L54:
        r0.v.e();
        Context r22 = r0.v.getContext();
        ActionBarContextView r37 = r0.v;
        o40 r14 = new o40();
        r14.c = r22;
        r14.d = r37;
        r14.e = r113;
        ku r114 = new ku(r37.getContext());
        r114.l = 1;
        r14.h = r114;
        r114.e = r14;
        if (r122.d(r14, r114) == false) goto L69;
        r14.g();
        r0.v.c(r14);
        r0.u = r14;
        if (r0.z == false) goto L63;
        ViewGroup r115 = r0.A;
        if (r115 == null) goto L63;
        WeakHashMap r23 = ja0.a;
        if (v90.c(r115) == false) goto L63;
        r0.v.setAlpha(0.0f);
        wa0 r116 = ja0.a(r0.v);
        r116.a(1.0f);
        r0.y = r116;
        r116.d(new h3(r4, r0));
    L67:
        if (r0.w == null) goto L70;
        r0.l.getDecorView().post(r0.x);
    L63:
        r0.v.setAlpha(1.0f);
        r0.v.setVisibility(0);
        if ((r0.v.getParent() instanceof View) == false) goto L67;
        View r117 = (View) r0.v.getParent();
        WeakHashMap r15 = ja0.a;
        w90.c(r117);
        goto L67
    L69:
        r0.u = null;
    L70:
        r0.I();
        r0.u = r0.u;
    L71:
        r0.I();
        n1 r118 = r0.u;
        if (r118 != null) goto L74;
        return null;
    L74:
        return r122.b(r118);
    L4:
        return rb0.b(this.a, r11, r12);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback r1) {
        return null;
    }
}
