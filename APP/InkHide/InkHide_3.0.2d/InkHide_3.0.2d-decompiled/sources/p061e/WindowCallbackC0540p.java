package p061e;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
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
import androidx.emoji2.text.C0404s;
import com.p055lu.wxmask272.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p006D.AbstractC0087p;
import p014H.C0142a;
import p066g.AbstractC0561a;
import p066g.AbstractC0572l;
import p066g.AbstractC0573m;
import p066g.AbstractC0574n;
import p066g.C0564d;
import p066g.C0565e;
import p068h.MenuC0594m;
import p099y.AbstractC1048L;
import p099y.AbstractC1094z;
import p099y.C1054S;

/* JADX INFO: renamed from: e.p */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC0540p implements Window.Callback {

    /* JADX INFO: renamed from: b */
    public final Window.Callback f1763b;

    /* JADX INFO: renamed from: c */
    public boolean f1764c;

    /* JADX INFO: renamed from: d */
    public boolean f1765d;

    /* JADX INFO: renamed from: e */
    public boolean f1766e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LayoutInflaterFactory2C0545u f1767f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WindowCallbackC0540p(LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u, Window.Callback callback) {
        this.f1767f = layoutInflaterFactory2C0545u;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f1763b = callback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1097a(Window.Callback callback) {
        try {
            this.f1764c = true;
            callback.onContentChanged();
        } finally {
            this.f1764c = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m1098b(int i2, Menu menu) {
        return this.f1763b.onMenuOpened(i2, menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1099c(int i2, Menu menu) {
        this.f1763b.onPanelClosed(i2, menu);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m1100d(List list, Menu menu, int i2) {
        AbstractC0573m.m1141a(this.f1763b, list, menu, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f1763b.dispatchGenericMotionEvent(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z2 = this.f1765d;
        Window.Callback callback = this.f1763b;
        return z2 ? callback.dispatchKeyEvent(keyEvent) : this.f1767f.m1112s(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[RETURN] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z2;
        MenuC0594m menuC0594m;
        boolean zPerformShortcut;
        if (!this.f1763b.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = this.f1767f;
            layoutInflaterFactory2C0545u.m1118y();
            C0524E c0524e = layoutInflaterFactory2C0545u.f1824i;
            if (c0524e == null) {
                C0544t c0544t = layoutInflaterFactory2C0545u.f1800G;
                if (c0544t == null || !layoutInflaterFactory2C0545u.m1104C(c0544t, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C0545u.f1800G == null) {
                        C0544t c0544tM1117x = layoutInflaterFactory2C0545u.m1117x(0);
                        layoutInflaterFactory2C0545u.m1105D(c0544tM1117x, keyEvent);
                        boolean zM1104C = layoutInflaterFactory2C0545u.m1104C(c0544tM1117x, keyEvent.getKeyCode(), keyEvent);
                        c0544tM1117x.f1784k = false;
                        if (zM1104C) {
                        }
                        if (z2) {
                            return false;
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                } else {
                    C0544t c0544t2 = layoutInflaterFactory2C0545u.f1800G;
                    if (c0544t2 != null) {
                        c0544t2.f1785l = true;
                    }
                }
                z2 = true;
                if (z2) {
                }
            } else {
                C0523D c0523d = c0524e.f1705x;
                if (c0523d == null || (menuC0594m = c0523d.f1677e) == null) {
                    zPerformShortcut = false;
                } else {
                    menuC0594m.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    zPerformShortcut = menuC0594m.performShortcut(keyCode, keyEvent, 0);
                }
                if (zPerformShortcut) {
                    z2 = true;
                    if (z2) {
                    }
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f1763b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f1763b.dispatchTouchEvent(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f1763b.dispatchTrackballEvent(motionEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f1763b.onActionModeFinished(actionMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f1763b.onActionModeStarted(actionMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f1763b.onAttachedToWindow();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f1764c) {
            this.f1763b.onContentChanged();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0 || (menu instanceof MenuC0594m)) {
            return this.f1763b.onCreatePanelMenu(i2, menu);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i2) {
        return this.f1763b.onCreatePanelView(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f1763b.onDetachedFromWindow();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.f1763b.onMenuItemSelected(i2, menuItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i2, Menu menu) {
        m1098b(i2, menu);
        LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = this.f1767f;
        if (i2 != 108) {
            layoutInflaterFactory2C0545u.getClass();
            return true;
        }
        layoutInflaterFactory2C0545u.m1118y();
        C0524E c0524e = layoutInflaterFactory2C0545u.f1824i;
        if (c0524e != null && true != c0524e.f1683A) {
            c0524e.f1683A = true;
            ArrayList arrayList = c0524e.f1684B;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i2, Menu menu) {
        if (this.f1766e) {
            this.f1763b.onPanelClosed(i2, menu);
            return;
        }
        m1099c(i2, menu);
        LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = this.f1767f;
        if (i2 != 108) {
            if (i2 != 0) {
                layoutInflaterFactory2C0545u.getClass();
                return;
            }
            C0544t c0544tM1117x = layoutInflaterFactory2C0545u.m1117x(i2);
            if (c0544tM1117x.f1786m) {
                layoutInflaterFactory2C0545u.m1111q(c0544tM1117x, false);
                return;
            }
            return;
        }
        layoutInflaterFactory2C0545u.m1118y();
        C0524E c0524e = layoutInflaterFactory2C0545u.f1824i;
        if (c0524e == null || !c0524e.f1683A) {
            return;
        }
        c0524e.f1683A = false;
        ArrayList arrayList = c0524e.f1684B;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z2) {
        AbstractC0574n.m1142a(this.f1763b, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i2, View view, Menu menu) {
        MenuC0594m menuC0594m = menu instanceof MenuC0594m ? (MenuC0594m) menu : null;
        if (i2 == 0 && menuC0594m == null) {
            return false;
        }
        if (menuC0594m != null) {
            menuC0594m.f2053x = true;
        }
        boolean zOnPreparePanel = this.f1763b.onPreparePanel(i2, view, menu);
        if (menuC0594m != null) {
            menuC0594m.f2053x = false;
        }
        return zOnPreparePanel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i2) {
        MenuC0594m menuC0594m = this.f1767f.m1117x(0).f1781h;
        if (menuC0594m != null) {
            m1100d(list, menuC0594m, i2);
        } else {
            m1100d(list, menu, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC0572l.m1139a(this.f1763b, searchEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f1763b.onWindowAttributesChanged(layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z2) {
        this.f1763b.onWindowFocusChanged(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d4  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
        boolean z2;
        ViewGroup viewGroup;
        int i3 = 1;
        LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u = this.f1767f;
        layoutInflaterFactory2C0545u.getClass();
        if (i2 != 0) {
            return AbstractC0572l.m1140b(this.f1763b, callback, i2);
        }
        C0404s c0404s = new C0404s(layoutInflaterFactory2C0545u.f1820e, callback);
        AbstractC0561a abstractC0561a = layoutInflaterFactory2C0545u.f1830o;
        if (abstractC0561a != null) {
            abstractC0561a.mo1048a();
        }
        C0142a c0142a = new C0142a(layoutInflaterFactory2C0545u, c0404s);
        layoutInflaterFactory2C0545u.m1118y();
        C0524E c0524e = layoutInflaterFactory2C0545u.f1824i;
        if (c0524e != null) {
            C0523D c0523d = c0524e.f1705x;
            if (c0523d != null) {
                c0523d.mo1048a();
            }
            c0524e.f1699r.setHideOnContentScrollEnabled(false);
            c0524e.f1702u.m656e();
            C0523D c0523d2 = new C0523D(c0524e, c0524e.f1702u.getContext(), c0142a);
            MenuC0594m menuC0594m = c0523d2.f1677e;
            menuC0594m.m1196w();
            try {
                if (((C0404s) c0523d2.f1678f.f443b).m777c(c0523d2, menuC0594m)) {
                    c0524e.f1705x = c0523d2;
                    c0523d2.mo1054i();
                    c0524e.f1702u.m654c(c0523d2);
                    c0524e.m1062Q(true);
                } else {
                    c0523d2 = null;
                }
                layoutInflaterFactory2C0545u.f1830o = c0523d2;
            } finally {
                menuC0594m.m1195v();
            }
        }
        if (layoutInflaterFactory2C0545u.f1830o == null) {
            C1054S c1054s = layoutInflaterFactory2C0545u.f1834s;
            if (c1054s != null) {
                c1054s.m2304b();
            }
            AbstractC0561a abstractC0561a2 = layoutInflaterFactory2C0545u.f1830o;
            if (abstractC0561a2 != null) {
                abstractC0561a2.mo1048a();
            }
            if (layoutInflaterFactory2C0545u.f1831p == null) {
                boolean z3 = layoutInflaterFactory2C0545u.f1796C;
                Context context = layoutInflaterFactory2C0545u.f1820e;
                if (z3) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        C0564d c0564d = new C0564d(context, 0);
                        c0564d.getTheme().setTo(themeNewTheme);
                        context = c0564d;
                    }
                    layoutInflaterFactory2C0545u.f1831p = new ActionBarContextView(context, null);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C0545u.f1832q = popupWindow;
                    AbstractC0087p.m227d(popupWindow, 2);
                    layoutInflaterFactory2C0545u.f1832q.setContentView(layoutInflaterFactory2C0545u.f1831p);
                    layoutInflaterFactory2C0545u.f1832q.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C0545u.f1831p.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C0545u.f1832q.setHeight(-2);
                    layoutInflaterFactory2C0545u.f1833r = new RunnableC0536l(layoutInflaterFactory2C0545u, i3);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C0545u.f1836u.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C0545u.m1118y();
                        C0524E c0524e2 = layoutInflaterFactory2C0545u.f1824i;
                        Context contextM1063R = c0524e2 != null ? c0524e2.m1063R() : null;
                        if (contextM1063R != null) {
                            context = contextM1063R;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        layoutInflaterFactory2C0545u.f1831p = (ActionBarContextView) viewStubCompat.m714a();
                    }
                }
            }
            if (layoutInflaterFactory2C0545u.f1831p != null) {
                C1054S c1054s2 = layoutInflaterFactory2C0545u.f1834s;
                if (c1054s2 != null) {
                    c1054s2.m2304b();
                }
                layoutInflaterFactory2C0545u.f1831p.m656e();
                Context context2 = layoutInflaterFactory2C0545u.f1831p.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C0545u.f1831p;
                C0565e c0565e = new C0565e();
                c0565e.f1882d = context2;
                c0565e.f1883e = actionBarContextView;
                c0565e.f1884f = c0142a;
                MenuC0594m menuC0594m2 = new MenuC0594m(actionBarContextView.getContext());
                menuC0594m2.f2041l = 1;
                c0565e.f1887i = menuC0594m2;
                menuC0594m2.f2034e = c0565e;
                if (((C0404s) c0142a.f443b).m777c(c0565e, menuC0594m2)) {
                    c0565e.mo1054i();
                    layoutInflaterFactory2C0545u.f1831p.m654c(c0565e);
                    layoutInflaterFactory2C0545u.f1830o = c0565e;
                    if (!layoutInflaterFactory2C0545u.f1835t || (viewGroup = layoutInflaterFactory2C0545u.f1836u) == null) {
                        z2 = false;
                        if (z2) {
                            layoutInflaterFactory2C0545u.f1831p.setAlpha(1.0f);
                            layoutInflaterFactory2C0545u.f1831p.setVisibility(0);
                            if (layoutInflaterFactory2C0545u.f1831p.getParent() instanceof View) {
                                View view = (View) layoutInflaterFactory2C0545u.f1831p.getParent();
                                WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                                AbstractC1094z.m2366c(view);
                            }
                        } else {
                            layoutInflaterFactory2C0545u.f1831p.setAlpha(0.0f);
                            C1054S c1054sM2282a = AbstractC1048L.m2282a(layoutInflaterFactory2C0545u.f1831p);
                            c1054sM2282a.m2303a(1.0f);
                            layoutInflaterFactory2C0545u.f1834s = c1054sM2282a;
                            c1054sM2282a.m2306d(new C0538n(i3, layoutInflaterFactory2C0545u));
                        }
                        if (layoutInflaterFactory2C0545u.f1832q != null) {
                            layoutInflaterFactory2C0545u.f1821f.getDecorView().post(layoutInflaterFactory2C0545u.f1833r);
                        }
                    } else {
                        WeakHashMap weakHashMap2 = AbstractC1048L.f3662a;
                        if (viewGroup.isLaidOut()) {
                            z2 = true;
                        }
                        if (z2) {
                        }
                        if (layoutInflaterFactory2C0545u.f1832q != null) {
                        }
                    }
                } else {
                    layoutInflaterFactory2C0545u.f1830o = null;
                }
            }
            layoutInflaterFactory2C0545u.f1830o = layoutInflaterFactory2C0545u.f1830o;
        }
        AbstractC0561a abstractC0561a3 = layoutInflaterFactory2C0545u.f1830o;
        if (abstractC0561a3 != null) {
            return c0404s.m775a(abstractC0561a3);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f1763b.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
