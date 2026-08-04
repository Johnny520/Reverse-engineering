package yyds;

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
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yyds.ᛶᛶᛳᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class WindowCallbackC1354 implements Window.Callback {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f6251;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C2181 f6252;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Window.Callback f6253;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f6254;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f6255;

    public WindowCallbackC1354(LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181, Window.Callback callback) {
        this.f6252 = layoutInflaterFactory2C2181;
        if (callback != null) {
            this.f6253 = callback;
        } else {
            C0188.m798("Window callback may not be null");
            throw null;
        }
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f6253.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f6251;
        Window.Callback callback = this.f6253;
        return z ? callback.dispatchKeyEvent(keyEvent) : this.f6252.m4169(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        MenuC0836 menuC0836;
        boolean zPerformShortcut;
        if (!this.f6253.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = this.f6252;
            layoutInflaterFactory2C2181.m4162();
            C0528 c0528 = layoutInflaterFactory2C2181.f10719;
            if (c0528 == null) {
                C0182 c0182 = layoutInflaterFactory2C2181.f10685;
                if (c0182 == null || !layoutInflaterFactory2C2181.m4158(c0182, keyEvent.getKeyCode(), keyEvent)) {
                    if (layoutInflaterFactory2C2181.f10685 == null) {
                        C0182 c0182M4163 = layoutInflaterFactory2C2181.m4163(0);
                        layoutInflaterFactory2C2181.m4150(c0182M4163, keyEvent);
                        boolean zM4158 = layoutInflaterFactory2C2181.m4158(c0182M4163, keyEvent.getKeyCode(), keyEvent);
                        c0182M4163.f1037 = false;
                        if (zM4158) {
                        }
                    }
                    return false;
                }
                C0182 c01822 = layoutInflaterFactory2C2181.f10685;
                if (c01822 != null) {
                    c01822.f1038 = true;
                    return true;
                }
            } else {
                C2319 c2319 = c0528.f2533;
                if (c2319 == null || (menuC0836 = c2319.f11374) == null) {
                    zPerformShortcut = false;
                } else {
                    menuC0836.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    zPerformShortcut = menuC0836.performShortcut(keyCode, keyEvent, 0);
                }
                if (!zPerformShortcut) {
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f6253.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f6253.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f6253.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f6253.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f6253.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f6253.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f6255) {
            this.f6253.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof MenuC0836)) {
            return this.f6253.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.f6253.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f6253.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f6253.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        m2756(i, menu);
        if (i == 108) {
            LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = this.f6252;
            layoutInflaterFactory2C2181.m4162();
            C0528 c0528 = layoutInflaterFactory2C2181.f10719;
            if (c0528 != null) {
                ArrayList arrayList = c0528.f2532;
                if (true != c0528.f2547) {
                    c0528.f2547 = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        C0188.m794();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f6254) {
            this.f6253.onPanelClosed(i, menu);
            return;
        }
        m2757(i, menu);
        LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = this.f6252;
        if (i != 108) {
            if (i == 0) {
                C0182 c0182M4163 = layoutInflaterFactory2C2181.m4163(i);
                if (c0182M4163.f1030) {
                    layoutInflaterFactory2C2181.m4155(c0182M4163, false);
                    return;
                }
                return;
            }
            return;
        }
        layoutInflaterFactory2C2181.m4162();
        C0528 c0528 = layoutInflaterFactory2C2181.f10719;
        if (c0528 != null) {
            ArrayList arrayList = c0528.f2532;
            if (c0528.f2547) {
                c0528.f2547 = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                C0188.m794();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        AbstractC2231.m4233(this.f6253, z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        MenuC0836 menuC0836 = menu instanceof MenuC0836 ? (MenuC0836) menu : null;
        if (i == 0 && menuC0836 == null) {
            return false;
        }
        if (menuC0836 != null) {
            menuC0836.f3831 = true;
        }
        boolean zOnPreparePanel = this.f6253.onPreparePanel(i, view, menu);
        if (menuC0836 != null) {
            menuC0836.f3831 = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        MenuC0836 menuC0836 = this.f6252.m4163(0).f1029;
        if (menuC0836 != null) {
            m2758(list, menuC0836, i);
        } else {
            m2758(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return AbstractC1488.m2989(this.f6253, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f6253.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.f6253.onWindowFocusChanged(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cd  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        boolean z;
        ViewGroup viewGroup;
        LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = this.f6252;
        Context context = layoutInflaterFactory2C2181.f10680;
        if (!layoutInflaterFactory2C2181.f10681 || i != 0) {
            return AbstractC1488.m2990(this.f6253, callback, i);
        }
        C0299 c0299 = new C0299(context, callback);
        AbstractC0451 abstractC0451 = layoutInflaterFactory2C2181.f10700;
        if (abstractC0451 != null) {
            abstractC0451.mo834();
        }
        C2133 c2133 = new C2133(4, layoutInflaterFactory2C2181, c0299, false);
        layoutInflaterFactory2C2181.m4162();
        C0528 c0528 = layoutInflaterFactory2C2181.f10719;
        if (c0528 != null) {
            C2319 c2319 = c0528.f2533;
            if (c2319 != null) {
                c2319.mo834();
            }
            c0528.f2550.setHideOnContentScrollEnabled(false);
            c0528.f2552.m38();
            C2319 c23192 = new C2319(c0528, c0528.f2552.getContext(), c2133);
            MenuC0836 menuC0836 = c23192.f11374;
            menuC0836.m1905();
            try {
                if (((C0299) c23192.f11373.f10555).m951(c23192, menuC0836)) {
                    c0528.f2533 = c23192;
                    c23192.mo832();
                    c0528.f2552.m39(c23192);
                    c0528.m1366(true);
                } else {
                    c23192 = null;
                }
                layoutInflaterFactory2C2181.f10700 = c23192;
            } finally {
                menuC0836.m1908();
            }
        }
        if (layoutInflaterFactory2C2181.f10700 == null) {
            C0140 c0140 = layoutInflaterFactory2C2181.f10694;
            if (c0140 != null) {
                c0140.m627();
            }
            AbstractC0451 abstractC04512 = layoutInflaterFactory2C2181.f10700;
            if (abstractC04512 != null) {
                abstractC04512.mo834();
            }
            if (layoutInflaterFactory2C2181.f10695 == null) {
                if (layoutInflaterFactory2C2181.f10677) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        C0586 c0586 = new C0586(context, 0);
                        c0586.getTheme().setTo(themeNewTheme);
                        context = c0586;
                    }
                    layoutInflaterFactory2C2181.f10695 = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    layoutInflaterFactory2C2181.f10683 = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    layoutInflaterFactory2C2181.f10683.setContentView(layoutInflaterFactory2C2181.f10695);
                    layoutInflaterFactory2C2181.f10683.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    layoutInflaterFactory2C2181.f10695.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    layoutInflaterFactory2C2181.f10683.setHeight(-2);
                    layoutInflaterFactory2C2181.f10723 = new RunnableC1745(layoutInflaterFactory2C2181, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) layoutInflaterFactory2C2181.f10675.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        layoutInflaterFactory2C2181.m4162();
                        C0528 c05282 = layoutInflaterFactory2C2181.f10719;
                        Context contextM1367 = c05282 != null ? c05282.m1367() : null;
                        if (contextM1367 != null) {
                            context = contextM1367;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        layoutInflaterFactory2C2181.f10695 = (ActionBarContextView) viewStubCompat.m93();
                    }
                }
            }
            if (layoutInflaterFactory2C2181.f10695 != null) {
                C0140 c01402 = layoutInflaterFactory2C2181.f10694;
                if (c01402 != null) {
                    c01402.m627();
                }
                layoutInflaterFactory2C2181.f10695.m38();
                Context context2 = layoutInflaterFactory2C2181.f10695.getContext();
                ActionBarContextView actionBarContextView = layoutInflaterFactory2C2181.f10695;
                C0203 c0203 = new C0203();
                c0203.f1180 = context2;
                c0203.f1183 = actionBarContextView;
                c0203.f1181 = c2133;
                MenuC0836 menuC08362 = new MenuC0836(actionBarContextView.getContext());
                menuC08362.f3822 = 1;
                c0203.f1182 = menuC08362;
                menuC08362.f3834 = c0203;
                if (((C0299) c2133.f10555).m951(c0203, menuC08362)) {
                    c0203.mo832();
                    layoutInflaterFactory2C2181.f10695.m39(c0203);
                    layoutInflaterFactory2C2181.f10700 = c0203;
                    if (!layoutInflaterFactory2C2181.f10706 || (viewGroup = layoutInflaterFactory2C2181.f10675) == null) {
                        z = false;
                        ActionBarContextView actionBarContextView2 = layoutInflaterFactory2C2181.f10695;
                        if (z) {
                            actionBarContextView2.setAlpha(1.0f);
                            layoutInflaterFactory2C2181.f10695.setVisibility(0);
                            if (layoutInflaterFactory2C2181.f10695.getParent() instanceof View) {
                                View view = (View) layoutInflaterFactory2C2181.f10695.getParent();
                                WeakHashMap weakHashMap = AbstractC1640.f8352;
                                view.requestApplyInsets();
                            }
                        } else {
                            actionBarContextView2.setAlpha(0.0f);
                            C0140 c0140M3343 = AbstractC1640.m3343(layoutInflaterFactory2C2181.f10695);
                            c0140M3343.m626(1.0f);
                            layoutInflaterFactory2C2181.f10694 = c0140M3343;
                            c0140M3343.m629(new C1469(1, layoutInflaterFactory2C2181));
                        }
                        if (layoutInflaterFactory2C2181.f10683 != null) {
                            layoutInflaterFactory2C2181.f10676.getDecorView().post(layoutInflaterFactory2C2181.f10723);
                        }
                    } else {
                        WeakHashMap weakHashMap2 = AbstractC1640.f8352;
                        if (viewGroup.isLaidOut()) {
                            z = true;
                        }
                        ActionBarContextView actionBarContextView22 = layoutInflaterFactory2C2181.f10695;
                        if (z) {
                        }
                        if (layoutInflaterFactory2C2181.f10683 != null) {
                        }
                    }
                } else {
                    layoutInflaterFactory2C2181.f10700 = null;
                }
            }
            layoutInflaterFactory2C2181.m4147();
            layoutInflaterFactory2C2181.f10700 = layoutInflaterFactory2C2181.f10700;
        }
        layoutInflaterFactory2C2181.m4147();
        AbstractC0451 abstractC04513 = layoutInflaterFactory2C2181.f10700;
        if (abstractC04513 != null) {
            return c0299.m950(abstractC04513);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m2755(Window.Callback callback) {
        try {
            this.f6255 = true;
            callback.onContentChanged();
        } finally {
            this.f6255 = false;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final boolean m2756(int i, Menu menu) {
        return this.f6253.onMenuOpened(i, menu);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m2757(int i, Menu menu) {
        this.f6253.onPanelClosed(i, menu);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final void m2758(List list, Menu menu, int i) {
        AbstractC1832.m3592(this.f6253, list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f6253.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
