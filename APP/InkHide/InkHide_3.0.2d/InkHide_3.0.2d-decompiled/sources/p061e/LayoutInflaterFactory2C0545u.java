package p061e;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractC0429g;
import androidx.lifecycle.EnumC0479n;
import androidx.lifecycle.InterfaceC0484s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p001A0.RunnableC0049v;
import p004C.C0064h;
import p052b1.AbstractC0503h;
import p058d.AbstractC0515a;
import p066g.AbstractC0561a;
import p066g.C0564d;
import p066g.C0569i;
import p068h.C0589h;
import p068h.C0590i;
import p068h.C0596o;
import p068h.InterfaceC0592k;
import p068h.MenuC0594m;
import p069i.AbstractC0712r1;
import p069i.AbstractC0718t1;
import p069i.C0608A;
import p069i.C0614D;
import p069i.C0616E;
import p069i.C0620G;
import p069i.C0647U;
import p069i.C0669d0;
import p069i.C0677g;
import p069i.C0682h1;
import p069i.C0689k;
import p069i.C0693l0;
import p069i.C0697m1;
import p069i.C0701o;
import p069i.C0707q;
import p069i.C0710r;
import p069i.C0713s;
import p069i.C0719u;
import p069i.C0721v;
import p069i.C0725x;
import p069i.C0729z;
import p069i.InterfaceC0699n0;
import p069i.InterfaceC0702o0;
import p075l.C0753k;
import p099y.AbstractC1038B;
import p099y.AbstractC1048L;
import p099y.C1054S;
import p099y.C1092x;
import p099y.InterfaceC1078j;

/* JADX INFO: renamed from: e.u */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0545u extends AbstractC0535k implements InterfaceC0592k, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: Z */
    public static final C0753k f1790Z = new C0753k();

    /* JADX INFO: renamed from: a0 */
    public static final int[] f1791a0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: b0 */
    public static final boolean f1792b0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: c0 */
    public static final boolean f1793c0 = true;

    /* JADX INFO: renamed from: A */
    public boolean f1794A;

    /* JADX INFO: renamed from: B */
    public boolean f1795B;

    /* JADX INFO: renamed from: C */
    public boolean f1796C;

    /* JADX INFO: renamed from: D */
    public boolean f1797D;

    /* JADX INFO: renamed from: E */
    public boolean f1798E;

    /* JADX INFO: renamed from: F */
    public C0544t[] f1799F;

    /* JADX INFO: renamed from: G */
    public C0544t f1800G;

    /* JADX INFO: renamed from: H */
    public boolean f1801H;

    /* JADX INFO: renamed from: I */
    public boolean f1802I;

    /* JADX INFO: renamed from: J */
    public boolean f1803J;

    /* JADX INFO: renamed from: K */
    public boolean f1804K;

    /* JADX INFO: renamed from: L */
    public Configuration f1805L;

    /* JADX INFO: renamed from: M */
    public final int f1806M;

    /* JADX INFO: renamed from: N */
    public int f1807N;

    /* JADX INFO: renamed from: O */
    public boolean f1808O;

    /* JADX INFO: renamed from: P */
    public boolean f1809P;

    /* JADX INFO: renamed from: Q */
    public C0541q f1810Q;

    /* JADX INFO: renamed from: R */
    public C0541q f1811R;

    /* JADX INFO: renamed from: S */
    public boolean f1812S;

    /* JADX INFO: renamed from: T */
    public int f1813T;

    /* JADX INFO: renamed from: V */
    public boolean f1815V;

    /* JADX INFO: renamed from: W */
    public Rect f1816W;

    /* JADX INFO: renamed from: X */
    public Rect f1817X;

    /* JADX INFO: renamed from: Y */
    public C0549y f1818Y;

    /* JADX INFO: renamed from: d */
    public final Object f1819d;

    /* JADX INFO: renamed from: e */
    public final Context f1820e;

    /* JADX INFO: renamed from: f */
    public Window f1821f;

    /* JADX INFO: renamed from: g */
    public WindowCallbackC0540p f1822g;

    /* JADX INFO: renamed from: h */
    public final Object f1823h;

    /* JADX INFO: renamed from: i */
    public C0524E f1824i;

    /* JADX INFO: renamed from: j */
    public C0569i f1825j;

    /* JADX INFO: renamed from: k */
    public CharSequence f1826k;

    /* JADX INFO: renamed from: l */
    public InterfaceC0699n0 f1827l;

    /* JADX INFO: renamed from: m */
    public C0537m f1828m;

    /* JADX INFO: renamed from: n */
    public C0537m f1829n;

    /* JADX INFO: renamed from: o */
    public AbstractC0561a f1830o;

    /* JADX INFO: renamed from: p */
    public ActionBarContextView f1831p;

    /* JADX INFO: renamed from: q */
    public PopupWindow f1832q;

    /* JADX INFO: renamed from: r */
    public RunnableC0536l f1833r;

    /* JADX INFO: renamed from: t */
    public boolean f1835t;

    /* JADX INFO: renamed from: u */
    public ViewGroup f1836u;

    /* JADX INFO: renamed from: v */
    public TextView f1837v;

    /* JADX INFO: renamed from: w */
    public View f1838w;

    /* JADX INFO: renamed from: x */
    public boolean f1839x;

    /* JADX INFO: renamed from: y */
    public boolean f1840y;

    /* JADX INFO: renamed from: z */
    public boolean f1841z;

    /* JADX INFO: renamed from: s */
    public C1054S f1834s = null;

    /* JADX INFO: renamed from: U */
    public final RunnableC0536l f1814U = new RunnableC0536l(this, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LayoutInflaterFactory2C0545u(Context context, Window window, InterfaceC0534j interfaceC0534j, Object obj) {
        AbstractActivityC0533i abstractActivityC0533i;
        this.f1806M = -100;
        this.f1820e = context;
        this.f1823h = interfaceC0534j;
        this.f1819d = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0533i)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0533i = (AbstractActivityC0533i) context;
                    break;
                }
            }
            abstractActivityC0533i = null;
            if (abstractActivityC0533i != null) {
                this.f1806M = ((LayoutInflaterFactory2C0545u) abstractActivityC0533i.m1072i()).f1806M;
            }
        }
        if (this.f1806M == -100) {
            C0753k c0753k = f1790Z;
            Integer num = (Integer) c0753k.getOrDefault(this.f1819d.getClass().getName(), null);
            if (num != null) {
                this.f1806M = num.intValue();
                c0753k.remove(this.f1819d.getClass().getName());
            }
        }
        if (window != null) {
            m1108n(window);
        }
        C0719u.m1368c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static Configuration m1101r(Context context, int i2, Configuration configuration, boolean z2) {
        int i3 = i2 != 1 ? i2 != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final int m1102A(Context context, int i2) {
        if (i2 != -100) {
            if (i2 != -1) {
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        if (i2 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f1811R == null) {
                            this.f1811R = new C0541q(this, context);
                        }
                        return this.f1811R.mo828f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m1116w(context).mo828f();
                }
            }
            return i2;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0172, code lost:
    
        if (r15.f2022g.getCount() > 0) goto L88;
     */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1103B(C0544t c0544t, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (c0544t.f1786m || this.f1804K) {
            return;
        }
        int i3 = c0544t.f1774a;
        Context context = this.f1820e;
        if (i3 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f1821f.getCallback();
        if (callback != null && !callback.onMenuOpened(i3, c0544t.f1781h)) {
            m1111q(c0544t, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && m1105D(c0544t, keyEvent)) {
            C0543s c0543s = c0544t.f1778e;
            if (c0543s != null && !c0544t.f1787n) {
                View view = c0544t.f1780g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                }
                c0544t.f1785l = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = c0544t.f1776c;
                layoutParams2.windowAnimations = c0544t.f1777d;
                windowManager.addView(c0544t.f1778e, layoutParams2);
                c0544t.f1786m = true;
            }
            if (c0543s == null) {
                m1118y();
                C0524E c0524e = this.f1824i;
                Context contextM1063R = c0524e != null ? c0524e.m1063R() : null;
                if (contextM1063R != null) {
                    context = contextM1063R;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(context.getTheme());
                themeNewTheme.resolveAttribute(com.p055lu.wxmask272.R.attr.actionBarPopupTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    themeNewTheme.applyStyle(i4, true);
                }
                themeNewTheme.resolveAttribute(com.p055lu.wxmask272.R.attr.panelMenuListTheme, typedValue, true);
                int i5 = typedValue.resourceId;
                if (i5 != 0) {
                    themeNewTheme.applyStyle(i5, true);
                } else {
                    themeNewTheme.applyStyle(com.p055lu.wxmask272.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0564d c0564d = new C0564d(context, 0);
                c0564d.getTheme().setTo(themeNewTheme);
                c0544t.f1783j = c0564d;
                TypedArray typedArrayObtainStyledAttributes = c0564d.obtainStyledAttributes(AbstractC0515a.f1646j);
                c0544t.f1775b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                c0544t.f1777d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                c0544t.f1778e = new C0543s(this, c0544t.f1783j);
                c0544t.f1776c = 81;
            } else if (c0544t.f1787n && c0543s.getChildCount() > 0) {
                c0544t.f1778e.removeAllViews();
            }
            View view2 = c0544t.f1780g;
            if (view2 == null) {
                if (c0544t.f1781h != null) {
                    if (this.f1829n == null) {
                        this.f1829n = new C0537m(this, 3);
                    }
                    C0537m c0537m = this.f1829n;
                    if (c0544t.f1782i == null) {
                        C0590i c0590i = new C0590i(c0544t.f1783j);
                        c0544t.f1782i = c0590i;
                        c0590i.f2021f = c0537m;
                        MenuC0594m menuC0594m = c0544t.f1781h;
                        menuC0594m.m1183b(c0590i, menuC0594m.f2030a);
                    }
                    C0590i c0590i2 = c0544t.f1782i;
                    C0543s c0543s2 = c0544t.f1778e;
                    if (c0590i2.f2020e == null) {
                        c0590i2.f2020e = (ExpandedMenuView) c0590i2.f2018c.inflate(com.p055lu.wxmask272.R.layout.abc_expanded_menu_layout, (ViewGroup) c0543s2, false);
                        if (c0590i2.f2022g == null) {
                            c0590i2.f2022g = new C0589h(c0590i2);
                        }
                        c0590i2.f2020e.setAdapter((ListAdapter) c0590i2.f2022g);
                        c0590i2.f2020e.setOnItemClickListener(c0590i2);
                    }
                    ExpandedMenuView expandedMenuView = c0590i2.f2020e;
                    c0544t.f1779f = expandedMenuView;
                    if (expandedMenuView != null) {
                    }
                }
                c0544t.f1787n = true;
                return;
            }
            c0544t.f1779f = view2;
            if (c0544t.f1779f != null) {
                if (c0544t.f1780g == null) {
                    C0590i c0590i3 = c0544t.f1782i;
                    if (c0590i3.f2022g == null) {
                        c0590i3.f2022g = new C0589h(c0590i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams3 = c0544t.f1779f.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                c0544t.f1778e.setBackgroundResource(c0544t.f1775b);
                ViewParent parent = c0544t.f1779f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c0544t.f1779f);
                }
                c0544t.f1778e.addView(c0544t.f1779f, layoutParams3);
                if (!c0544t.f1779f.hasFocus()) {
                    c0544t.f1779f.requestFocus();
                }
            }
            c0544t.f1787n = true;
            return;
            i2 = -2;
            c0544t.f1785l = false;
            WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i2, -2, 0, 0, 1002, 8519680, -3);
            layoutParams22.gravity = c0544t.f1776c;
            layoutParams22.windowAnimations = c0544t.f1777d;
            windowManager.addView(c0544t.f1778e, layoutParams22);
            c0544t.f1786m = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final boolean m1104C(C0544t c0544t, int i2, KeyEvent keyEvent) {
        MenuC0594m menuC0594m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0544t.f1784k || m1105D(c0544t, keyEvent)) && (menuC0594m = c0544t.f1781h) != null) {
            return menuC0594m.performShortcut(i2, keyEvent, 1);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /* JADX INFO: renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1105D(C0544t c0544t, KeyEvent keyEvent) {
        InterfaceC0699n0 interfaceC0699n0;
        InterfaceC0699n0 interfaceC0699n02;
        Resources.Theme themeNewTheme;
        InterfaceC0699n0 interfaceC0699n03;
        InterfaceC0699n0 interfaceC0699n04;
        if (!this.f1804K) {
            if (c0544t.f1784k) {
                return true;
            }
            C0544t c0544t2 = this.f1800G;
            if (c0544t2 != null && c0544t2 != c0544t) {
                m1111q(c0544t2, false);
            }
            Window.Callback callback = this.f1821f.getCallback();
            int i2 = c0544t.f1774a;
            if (callback != null) {
                c0544t.f1780g = callback.onCreatePanelView(i2);
            }
            boolean z2 = i2 == 0 || i2 == 108;
            if (z2 && (interfaceC0699n04 = this.f1827l) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0699n04;
                actionBarOverlayLayout.m669k();
                ((C0697m1) actionBarOverlayLayout.f981f).f2362l = true;
            }
            if (c0544t.f1780g == null) {
                MenuC0594m menuC0594m = c0544t.f1781h;
                if (menuC0594m == null || c0544t.f1788o) {
                    if (menuC0594m == null) {
                        Context context = this.f1820e;
                        if ((i2 == 0 || i2 == 108) && this.f1827l != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.p055lu.wxmask272.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.p055lu.wxmask272.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.p055lu.wxmask272.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                C0564d c0564d = new C0564d(context, 0);
                                c0564d.getTheme().setTo(themeNewTheme);
                                context = c0564d;
                            }
                        }
                        MenuC0594m menuC0594m2 = new MenuC0594m(context);
                        menuC0594m2.f2034e = this;
                        MenuC0594m menuC0594m3 = c0544t.f1781h;
                        if (menuC0594m2 != menuC0594m3) {
                            if (menuC0594m3 != null) {
                                menuC0594m3.m1191r(c0544t.f1782i);
                            }
                            c0544t.f1781h = menuC0594m2;
                            C0590i c0590i = c0544t.f1782i;
                            if (c0590i != null) {
                                menuC0594m2.m1183b(c0590i, menuC0594m2.f2030a);
                            }
                        }
                        if (c0544t.f1781h != null) {
                            if (z2 && (interfaceC0699n02 = this.f1827l) != null) {
                                if (this.f1828m == null) {
                                    this.f1828m = new C0537m(this, 2);
                                }
                                ((ActionBarOverlayLayout) interfaceC0699n02).m670l(c0544t.f1781h, this.f1828m);
                            }
                            c0544t.f1781h.m1196w();
                            if (callback.onCreatePanelMenu(i2, c0544t.f1781h)) {
                                c0544t.f1788o = false;
                            } else {
                                MenuC0594m menuC0594m4 = c0544t.f1781h;
                                if (menuC0594m4 != null) {
                                    if (menuC0594m4 != null) {
                                        menuC0594m4.m1191r(c0544t.f1782i);
                                    }
                                    c0544t.f1781h = null;
                                }
                                if (z2 && (interfaceC0699n0 = this.f1827l) != null) {
                                    ((ActionBarOverlayLayout) interfaceC0699n0).m670l(null, this.f1828m);
                                }
                            }
                        }
                    }
                }
                c0544t.f1781h.m1196w();
                Bundle bundle = c0544t.f1789p;
                if (bundle != null) {
                    c0544t.f1781h.m1192s(bundle);
                    c0544t.f1789p = null;
                }
                if (!callback.onPreparePanel(0, c0544t.f1780g, c0544t.f1781h)) {
                    if (z2 && (interfaceC0699n03 = this.f1827l) != null) {
                        ((ActionBarOverlayLayout) interfaceC0699n03).m670l(null, this.f1828m);
                    }
                    c0544t.f1781h.m1195v();
                    return false;
                }
                c0544t.f1781h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c0544t.f1781h.m1195v();
            }
            c0544t.f1784k = true;
            c0544t.f1785l = false;
            this.f1800G = c0544t;
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final void m1106E() {
        if (this.f1835t) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061e.AbstractC0535k
    /* JADX INFO: renamed from: a */
    public final void mo1083a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1820e);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0545u) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061e.AbstractC0535k
    /* JADX INFO: renamed from: b */
    public final void mo1084b() {
        if (this.f1824i != null) {
            m1118y();
            this.f1824i.getClass();
            m1119z(0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061e.AbstractC0535k
    /* JADX INFO: renamed from: c */
    public final void mo1085c() {
        String strM966B;
        this.f1802I = true;
        m1107m(false);
        m1115v();
        Object obj = this.f1819d;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM966B = AbstractC0503h.m966B(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
                strM966B = null;
            }
            if (strM966B != null) {
                C0524E c0524e = this.f1824i;
                if (c0524e == null) {
                    this.f1815V = true;
                } else {
                    c0524e.m1065T(true);
                }
            }
            synchronized (AbstractC0535k.f1756c) {
                AbstractC0535k.m1082e(this);
                AbstractC0535k.f1755b.add(new WeakReference(this));
            }
        }
        this.f1805L = new Configuration(this.f1820e.getResources().getConfiguration());
        this.f1803J = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // p061e.AbstractC0535k
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1086d() {
        if (this.f1819d instanceof Activity) {
            synchronized (AbstractC0535k.f1756c) {
                AbstractC0535k.m1082e(this);
            }
        }
        if (this.f1812S) {
            this.f1821f.getDecorView().removeCallbacks(this.f1814U);
        }
        this.f1804K = true;
        if (this.f1806M != -100) {
            Object obj = this.f1819d;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f1790Z.put(this.f1819d.getClass().getName(), Integer.valueOf(this.f1806M));
            } else {
                f1790Z.remove(this.f1819d.getClass().getName());
            }
        }
        C0541q c0541q = this.f1810Q;
        if (c0541q != null) {
            c0541q.m825c();
        }
        C0541q c0541q2 = this.f1811R;
        if (c0541q2 != null) {
            c0541q2.m825c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.m1310h() != false) goto L20;
     */
    @Override // p068h.InterfaceC0592k
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo135f(MenuC0594m menuC0594m) {
        ActionMenuView actionMenuView;
        C0689k c0689k;
        C0689k c0689k2;
        C0689k c0689k3;
        InterfaceC0699n0 interfaceC0699n0 = this.f1827l;
        if (interfaceC0699n0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0699n0;
            actionBarOverlayLayout.m669k();
            Toolbar toolbar = ((C0697m1) actionBarOverlayLayout.f981f).f2351a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1084b) != null && actionMenuView.f1005t) {
                if (ViewConfiguration.get(this.f1820e).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f1827l;
                    actionBarOverlayLayout2.m669k();
                    ActionMenuView actionMenuView2 = ((C0697m1) actionBarOverlayLayout2.f981f).f2351a.f1084b;
                    if (actionMenuView2 != null) {
                        C0689k c0689k4 = actionMenuView2.f1006u;
                        if (c0689k4 != null) {
                            if (c0689k4.f2322v == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f1821f.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f1827l;
                actionBarOverlayLayout3.m669k();
                ActionMenuView actionMenuView3 = ((C0697m1) actionBarOverlayLayout3.f981f).f2351a.f1084b;
                if ((actionMenuView3 == null || (c0689k3 = actionMenuView3.f1006u) == null || !c0689k3.m1310h()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f1827l;
                    actionBarOverlayLayout4.m669k();
                    ActionMenuView actionMenuView4 = ((C0697m1) actionBarOverlayLayout4.f981f).f2351a.f1084b;
                    if (actionMenuView4 != null && (c0689k2 = actionMenuView4.f1006u) != null) {
                        c0689k2.m1309f();
                    }
                    if (this.f1804K) {
                        return;
                    }
                    callback.onPanelClosed(108, m1117x(0).f1781h);
                    return;
                }
                if (callback == null || this.f1804K) {
                    return;
                }
                if (this.f1812S && (1 & this.f1813T) != 0) {
                    View decorView = this.f1821f.getDecorView();
                    RunnableC0536l runnableC0536l = this.f1814U;
                    decorView.removeCallbacks(runnableC0536l);
                    runnableC0536l.run();
                }
                C0544t c0544tM1117x = m1117x(0);
                MenuC0594m menuC0594m2 = c0544tM1117x.f1781h;
                if (menuC0594m2 == null || c0544tM1117x.f1788o || !callback.onPreparePanel(0, c0544tM1117x.f1780g, menuC0594m2)) {
                    return;
                }
                callback.onMenuOpened(108, c0544tM1117x.f1781h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f1827l;
                actionBarOverlayLayout5.m669k();
                ActionMenuView actionMenuView5 = ((C0697m1) actionBarOverlayLayout5.f981f).f2351a.f1084b;
                if (actionMenuView5 == null || (c0689k = actionMenuView5.f1006u) == null) {
                    return;
                }
                c0689k.m1311l();
                return;
            }
        }
        C0544t c0544tM1117x2 = m1117x(0);
        c0544tM1117x2.f1787n = true;
        m1111q(c0544tM1117x2, false);
        m1103B(c0544tM1117x2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p068h.InterfaceC0592k
    /* JADX INFO: renamed from: g */
    public final boolean mo136g(MenuC0594m menuC0594m, MenuItem menuItem) {
        C0544t c0544t;
        Window.Callback callback = this.f1821f.getCallback();
        if (callback != null && !this.f1804K) {
            MenuC0594m menuC0594mMo1164k = menuC0594m.mo1164k();
            C0544t[] c0544tArr = this.f1799F;
            int length = c0544tArr != null ? c0544tArr.length : 0;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    c0544t = c0544tArr[i2];
                    if (c0544t != null && c0544t.f1781h == menuC0594mMo1164k) {
                        break;
                    }
                    i2++;
                } else {
                    c0544t = null;
                    break;
                }
            }
            if (c0544t != null) {
                return callback.onMenuItemSelected(c0544t.f1774a, menuItem);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061e.AbstractC0535k
    /* JADX INFO: renamed from: h */
    public final boolean mo1087h(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.f1797D && i2 == 108) {
            return false;
        }
        if (this.f1841z && i2 == 1) {
            this.f1841z = false;
        }
        if (i2 == 1) {
            m1106E();
            this.f1797D = true;
            return true;
        }
        if (i2 == 2) {
            m1106E();
            this.f1839x = true;
            return true;
        }
        if (i2 == 5) {
            m1106E();
            this.f1840y = true;
            return true;
        }
        if (i2 == 10) {
            m1106E();
            this.f1795B = true;
            return true;
        }
        if (i2 == 108) {
            m1106E();
            this.f1841z = true;
            return true;
        }
        if (i2 != 109) {
            return this.f1821f.requestFeature(i2);
        }
        m1106E();
        this.f1794A = true;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061e.AbstractC0535k
    /* JADX INFO: renamed from: i */
    public final void mo1088i(int i2) {
        m1114u();
        ViewGroup viewGroup = (ViewGroup) this.f1836u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1820e).inflate(i2, viewGroup);
        this.f1822g.m1097a(this.f1821f.getCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061e.AbstractC0535k
    /* JADX INFO: renamed from: j */
    public final void mo1089j(View view) {
        m1114u();
        ViewGroup viewGroup = (ViewGroup) this.f1836u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1822g.m1097a(this.f1821f.getCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061e.AbstractC0535k
    /* JADX INFO: renamed from: k */
    public final void mo1090k(View view, ViewGroup.LayoutParams layoutParams) {
        m1114u();
        ViewGroup viewGroup = (ViewGroup) this.f1836u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1822g.m1097a(this.f1821f.getCallback());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p061e.AbstractC0535k
    /* JADX INFO: renamed from: l */
    public final void mo1091l(CharSequence charSequence) {
        this.f1826k = charSequence;
        InterfaceC0699n0 interfaceC0699n0 = this.f1827l;
        if (interfaceC0699n0 != null) {
            interfaceC0699n0.setWindowTitle(charSequence);
            return;
        }
        C0524E c0524e = this.f1824i;
        if (c0524e == null) {
            TextView textView = this.f1837v;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        C0697m1 c0697m1 = (C0697m1) c0524e.f1701t;
        if (c0697m1.f2357g) {
            return;
        }
        c0697m1.f2358h = charSequence;
        if ((c0697m1.f2352b & 8) != 0) {
            Toolbar toolbar = c0697m1.f2351a;
            toolbar.setTitle(charSequence);
            if (c0697m1.f2357g) {
                AbstractC1048L.m2291j(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r12v13, resolved type: android.app.Activity */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0139  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1107m(boolean z2) {
        boolean z3;
        Object obj;
        Object obj2;
        boolean z4 = true;
        z4 = true;
        z4 = true;
        z4 = true;
        z4 = true;
        z4 = true;
        z4 = true;
        boolean z5 = false;
        if (this.f1804K) {
            return false;
        }
        int i2 = this.f1806M;
        if (i2 == -100) {
            i2 = -100;
        }
        Context context = this.f1820e;
        LongSparseArray longSparseArray = null;
        Configuration configurationM1101r = m1101r(context, m1102A(context, i2), null, false);
        boolean z6 = this.f1809P;
        Object obj3 = this.f1819d;
        if (z6 || !(obj3 instanceof Activity)) {
            this.f1809P = true;
            z3 = this.f1808O;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                z3 = false;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                    this.f1808O = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                    this.f1808O = false;
                }
                this.f1809P = true;
                z3 = this.f1808O;
            }
        }
        Configuration configuration = this.f1805L;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i3 = configuration.uiMode & 48;
        int i4 = configurationM1101r.uiMode & 48;
        if (i3 != i4 && z2 && !z3 && this.f1802I && ((f1792b0 || this.f1803J) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (!activity.isChild()) {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new RunnableC0049v(activity, z4 ? 1 : 0));
                }
                z5 = true;
            }
        }
        if (z5 || i3 == i4) {
            z4 = z5;
        } else {
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = i4 | (resources.getConfiguration().uiMode & (-49));
            resources.updateConfiguration(configuration2, null);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 26 && i5 < 28) {
                if (!AbstractC0503h.f1599h) {
                    try {
                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                        AbstractC0503h.f1598g = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e3);
                    }
                    AbstractC0503h.f1599h = true;
                }
                Field field = AbstractC0503h.f1598g;
                if (field != null) {
                    try {
                        obj = field.get(resources);
                    } catch (IllegalAccessException e4) {
                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e4);
                        obj = null;
                    }
                    if (obj != null) {
                        if (!AbstractC0503h.f1593b) {
                            try {
                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                AbstractC0503h.f1592a = declaredField2;
                                declaredField2.setAccessible(true);
                            } catch (NoSuchFieldException e5) {
                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e5);
                            }
                            AbstractC0503h.f1593b = true;
                        }
                        Field field2 = AbstractC0503h.f1592a;
                        if (field2 != null) {
                            try {
                                obj2 = field2.get(obj);
                            } catch (IllegalAccessException e6) {
                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e6);
                                obj2 = null;
                            }
                            if (obj2 != null) {
                                if (!AbstractC0503h.f1595d) {
                                    try {
                                        AbstractC0503h.f1594c = Class.forName("android.content.res.ThemedResourceCache");
                                    } catch (ClassNotFoundException e7) {
                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e7);
                                    }
                                    AbstractC0503h.f1595d = true;
                                }
                                Class cls = AbstractC0503h.f1594c;
                                if (cls != null) {
                                    if (!AbstractC0503h.f1597f) {
                                        try {
                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                            AbstractC0503h.f1596e = declaredField3;
                                            declaredField3.setAccessible(true);
                                        } catch (NoSuchFieldException e8) {
                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e8);
                                        }
                                        AbstractC0503h.f1597f = true;
                                    }
                                    Field field3 = AbstractC0503h.f1596e;
                                    if (field3 != null) {
                                        try {
                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                        } catch (IllegalAccessException e9) {
                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e9);
                                        }
                                        if (longSparseArray != null) {
                                            AbstractC0550z.m1126a(longSparseArray);
                                        }
                                    }
                                }
                            }
                        } else {
                            obj2 = null;
                            if (obj2 != null) {
                            }
                        }
                    }
                }
            }
            int i6 = this.f1807N;
            if (i6 != 0) {
                context.setTheme(i6);
                context.getTheme().applyStyle(this.f1807N, true);
            }
            if (z3 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof InterfaceC0484s) {
                    if (((InterfaceC0484s) activity2).mo636c().f1528c.compareTo(EnumC0479n.f1519c) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f1803J && !this.f1804K) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z4 && (obj3 instanceof AbstractActivityC0533i)) {
        }
        if (i2 == 0) {
            m1116w(context).m831i();
        } else {
            C0541q c0541q = this.f1810Q;
            if (c0541q != null) {
                c0541q.m825c();
            }
        }
        if (i2 == 3) {
            if (this.f1811R == null) {
                this.f1811R = new C0541q(this, context);
            }
            this.f1811R.m831i();
        } else {
            C0541q c0541q2 = this.f1811R;
            if (c0541q2 != null) {
                c0541q2.m825c();
            }
        }
        return z4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m1108n(Window window) {
        int resourceId;
        if (this.f1821f != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC0540p) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        WindowCallbackC0540p windowCallbackC0540p = new WindowCallbackC0540p(this, callback);
        this.f1822g = windowCallbackC0540p;
        window.setCallback(windowCallbackC0540p);
        int[] iArr = f1791a0;
        Context context = this.f1820e;
        Drawable drawableM1255d = null;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (typedArrayObtainStyledAttributes.hasValue(0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) != 0) {
            C0719u c0719uM1367a = C0719u.m1367a();
            synchronized (c0719uM1367a) {
                drawableM1255d = c0719uM1367a.f2439a.m1255d(context, resourceId, true);
            }
        }
        if (drawableM1255d != null) {
            window.setBackgroundDrawable(drawableM1255d);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f1821f = window;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m1109o(int i2, C0544t c0544t, MenuC0594m menuC0594m) {
        if (menuC0594m == null) {
            if (c0544t == null && i2 >= 0) {
                C0544t[] c0544tArr = this.f1799F;
                if (i2 < c0544tArr.length) {
                    c0544t = c0544tArr[i2];
                }
            }
            if (c0544t != null) {
                menuC0594m = c0544t.f1781h;
            }
        }
        if ((c0544t == null || c0544t.f1786m) && !this.f1804K) {
            WindowCallbackC0540p windowCallbackC0540p = this.f1822g;
            Window.Callback callback = this.f1821f.getCallback();
            windowCallbackC0540p.getClass();
            try {
                windowCallbackC0540p.f1766e = true;
                callback.onPanelClosed(i2, menuC0594m);
            } finally {
                windowCallbackC0540p.f1766e = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Context c0564d;
        View c0616e;
        String attributeValue = str;
        View view2 = null;
        if (this.f1818Y == null) {
            int[] iArr = AbstractC0515a.f1646j;
            Context context2 = this.f1820e;
            String string = context2.obtainStyledAttributes(iArr).getString(116);
            if (string == null) {
                this.f1818Y = new C0549y();
            } else {
                try {
                    this.f1818Y = (C0549y) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f1818Y = new C0549y();
                }
            }
        }
        C0549y c0549y = this.f1818Y;
        int i2 = AbstractC0712r1.f2410a;
        c0549y.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0515a.f1661y, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        c0564d = (resourceId == 0 || ((context instanceof C0564d) && ((C0564d) context).f1877a == resourceId)) ? context : new C0564d(context, resourceId);
        attributeValue.getClass();
        switch (attributeValue) {
            case "RatingBar":
                c0616e = new C0616E(c0564d, attributeSet);
                break;
            case "CheckedTextView":
                c0616e = new C0713s(c0564d, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                c0616e = new C0608A(c0564d, attributeSet);
                break;
            case "TextView":
                c0616e = new C0669d0(c0564d, attributeSet);
                break;
            case "ImageButton":
                c0616e = new C0725x(c0564d, attributeSet, com.p055lu.wxmask272.R.attr.imageButtonStyle);
                break;
            case "SeekBar":
                c0616e = new C0620G(c0564d, attributeSet);
                break;
            case "Spinner":
                c0616e = new C0647U(c0564d, attributeSet);
                break;
            case "RadioButton":
                c0616e = new C0614D(c0564d, attributeSet);
                break;
            case "ToggleButton":
                c0616e = new C0693l0(c0564d, attributeSet);
                break;
            case "ImageView":
                c0616e = new C0729z(c0564d, attributeSet, 0);
                break;
            case "AutoCompleteTextView":
                c0616e = new C0701o(c0564d, attributeSet);
                break;
            case "CheckBox":
                c0616e = new C0710r(c0564d, attributeSet);
                break;
            case "EditText":
                c0616e = new C0721v(c0564d, attributeSet);
                break;
            case "Button":
                c0616e = new C0707q(c0564d, attributeSet);
                break;
            default:
                c0616e = null;
                break;
        }
        if (c0616e == null && context != c0564d) {
            Object[] objArr = c0549y.f1858a;
            if (attributeValue.equals("view")) {
                attributeValue = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0564d;
                objArr[1] = attributeSet;
                if (-1 == attributeValue.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = C0549y.f1856g;
                        if (i3 < 3) {
                            View viewM1125a = c0549y.m1125a(c0564d, attributeValue, strArr[i3]);
                            if (viewM1125a != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewM1125a;
                            } else {
                                i3++;
                            }
                        }
                    }
                } else {
                    View viewM1125a2 = c0549y.m1125a(c0564d, attributeValue, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewM1125a2;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0616e = view2;
        }
        if (c0616e != null) {
            Context context3 = c0616e.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap weakHashMap = AbstractC1048L.f3662a;
                if (c0616e.hasOnClickListeners()) {
                    TypedArray typedArrayObtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, C0549y.f1852c);
                    String string2 = typedArrayObtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        c0616e.setOnClickListener(new ViewOnClickListenerC0548x(c0616e, string2));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes3 = c0564d.obtainStyledAttributes(attributeSet, C0549y.f1853d);
                if (typedArrayObtainStyledAttributes3.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = AbstractC1048L.f3662a;
                    new C1092x(com.p055lu.wxmask272.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).m306d(c0616e, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes3.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = c0564d.obtainStyledAttributes(attributeSet, C0549y.f1854e);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    AbstractC1048L.m2291j(c0616e, typedArrayObtainStyledAttributes4.getString(0));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = c0564d.obtainStyledAttributes(attributeSet, C0549y.f1855f);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    boolean z3 = typedArrayObtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap weakHashMap3 = AbstractC1048L.f3662a;
                    new C1092x(com.p055lu.wxmask272.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).m306d(c0616e, Boolean.valueOf(z3));
                }
                typedArrayObtainStyledAttributes5.recycle();
            }
        }
        return c0616e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m1110p(MenuC0594m menuC0594m) {
        C0689k c0689k;
        if (this.f1798E) {
            return;
        }
        this.f1798E = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f1827l;
        actionBarOverlayLayout.m669k();
        ActionMenuView actionMenuView = ((C0697m1) actionBarOverlayLayout.f981f).f2351a.f1084b;
        if (actionMenuView != null && (c0689k = actionMenuView.f1006u) != null) {
            c0689k.m1309f();
            C0677g c0677g = c0689k.f2321u;
            if (c0677g != null && c0677g.m1206b()) {
                c0677g.f2106i.dismiss();
            }
        }
        Window.Callback callback = this.f1821f.getCallback();
        if (callback != null && !this.f1804K) {
            callback.onPanelClosed(108, menuC0594m);
        }
        this.f1798E = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m1111q(C0544t c0544t, boolean z2) {
        C0543s c0543s;
        InterfaceC0699n0 interfaceC0699n0;
        C0689k c0689k;
        if (z2 && c0544t.f1774a == 0 && (interfaceC0699n0 = this.f1827l) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0699n0;
            actionBarOverlayLayout.m669k();
            ActionMenuView actionMenuView = ((C0697m1) actionBarOverlayLayout.f981f).f2351a.f1084b;
            if (actionMenuView != null && (c0689k = actionMenuView.f1006u) != null && c0689k.m1310h()) {
                m1110p(c0544t.f1781h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f1820e.getSystemService("window");
        if (windowManager != null && c0544t.f1786m && (c0543s = c0544t.f1778e) != null) {
            windowManager.removeView(c0543s);
            if (z2) {
                m1109o(c0544t.f1774a, c0544t, null);
            }
        }
        c0544t.f1784k = false;
        c0544t.f1785l = false;
        c0544t.f1786m = false;
        c0544t.f1779f = null;
        c0544t.f1787n = true;
        if (this.f1800G == c0544t) {
            this.f1800G = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0123  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1112s(KeyEvent keyEvent) {
        View decorView;
        boolean z2;
        InterfaceC0702o0 interfaceC0702o0;
        C0682h1 c0682h1;
        C0596o c0596o;
        boolean z3;
        boolean zM1105D;
        ActionMenuView actionMenuView;
        C0689k c0689k;
        C0689k c0689k2;
        C0689k c0689k3;
        Object obj = this.f1819d;
        if ((!(obj instanceof InterfaceC1078j) && !(obj instanceof AbstractDialogC0547w)) || (decorView = this.f1821f.getDecorView()) == null || !AbstractC0503h.m985q(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                WindowCallbackC0540p windowCallbackC0540p = this.f1822g;
                Window.Callback callback = this.f1821f.getCallback();
                windowCallbackC0540p.getClass();
                try {
                    windowCallbackC0540p.f1765d = true;
                    if (!callback.dispatchKeyEvent(keyEvent)) {
                        int keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode == 4) {
                                this.f1801H = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    C0544t c0544tM1117x = m1117x(0);
                                    if (!c0544tM1117x.f1786m) {
                                        m1105D(c0544tM1117x, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.f1830o == null) {
                                    C0544t c0544tM1117x2 = m1117x(0);
                                    InterfaceC0699n0 interfaceC0699n0 = this.f1827l;
                                    Context context = this.f1820e;
                                    if (interfaceC0699n0 != null) {
                                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0699n0;
                                        actionBarOverlayLayout.m669k();
                                        Toolbar toolbar = ((C0697m1) actionBarOverlayLayout.f981f).f2351a;
                                        if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.f1084b) == null || !actionMenuView.f1005t || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            boolean z4 = c0544tM1117x2.f1786m;
                                            if (z4 || c0544tM1117x2.f1785l) {
                                                m1111q(c0544tM1117x2, true);
                                                z3 = z4;
                                            } else {
                                                if (c0544tM1117x2.f1784k) {
                                                    if (c0544tM1117x2.f1788o) {
                                                        c0544tM1117x2.f1784k = false;
                                                        zM1105D = m1105D(c0544tM1117x2, keyEvent);
                                                    } else {
                                                        zM1105D = true;
                                                    }
                                                    if (zM1105D) {
                                                        m1103B(c0544tM1117x2, keyEvent);
                                                        z3 = true;
                                                    }
                                                }
                                                z3 = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f1827l;
                                            actionBarOverlayLayout2.m669k();
                                            ActionMenuView actionMenuView2 = ((C0697m1) actionBarOverlayLayout2.f981f).f2351a.f1084b;
                                            if (actionMenuView2 == null || (c0689k2 = actionMenuView2.f1006u) == null || !c0689k2.m1310h()) {
                                                if (!this.f1804K && m1105D(c0544tM1117x2, keyEvent)) {
                                                    ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f1827l;
                                                    actionBarOverlayLayout3.m669k();
                                                    ActionMenuView actionMenuView3 = ((C0697m1) actionBarOverlayLayout3.f981f).f2351a.f1084b;
                                                    if (actionMenuView3 != null && (c0689k = actionMenuView3.f1006u) != null && c0689k.m1311l()) {
                                                        z3 = true;
                                                    }
                                                }
                                                z3 = false;
                                            } else {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f1827l;
                                                actionBarOverlayLayout4.m669k();
                                                ActionMenuView actionMenuView4 = ((C0697m1) actionBarOverlayLayout4.f981f).f2351a.f1084b;
                                                if (actionMenuView4 == null || (c0689k3 = actionMenuView4.f1006u) == null || !c0689k3.m1309f()) {
                                                    z3 = false;
                                                }
                                            }
                                        }
                                        if (z3) {
                                            AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                            if (audioManager != null) {
                                                audioManager.playSoundEffect(0);
                                                return true;
                                            }
                                            Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                            return true;
                                        }
                                    }
                                }
                            }
                            return false;
                        }
                        boolean z5 = this.f1801H;
                        this.f1801H = false;
                        C0544t c0544tM1117x3 = m1117x(0);
                        if (!c0544tM1117x3.f1786m) {
                            AbstractC0561a abstractC0561a = this.f1830o;
                            if (abstractC0561a != null) {
                                abstractC0561a.mo1048a();
                            } else {
                                m1118y();
                                C0524E c0524e = this.f1824i;
                                if (c0524e == null || (interfaceC0702o0 = c0524e.f1701t) == null || (c0682h1 = ((C0697m1) interfaceC0702o0).f2351a.f1081M) == null || (c0596o = c0682h1.f2295c) == null) {
                                    z2 = false;
                                    if (z2) {
                                        return false;
                                    }
                                } else {
                                    if (c0682h1 == null) {
                                        c0596o = null;
                                    }
                                    if (c0596o != null) {
                                        c0596o.collapseActionView();
                                    }
                                }
                            }
                            z2 = true;
                            if (z2) {
                            }
                        } else if (!z5) {
                            m1111q(c0544tM1117x3, true);
                            return true;
                        }
                    }
                } finally {
                    windowCallbackC0540p.f1765d = false;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m1113t(int i2) {
        C0544t c0544tM1117x = m1117x(i2);
        if (c0544tM1117x.f1781h != null) {
            Bundle bundle = new Bundle();
            c0544tM1117x.f1781h.m1193t(bundle);
            if (bundle.size() > 0) {
                c0544tM1117x.f1789p = bundle;
            }
            c0544tM1117x.f1781h.m1196w();
            c0544tM1117x.f1781h.clear();
        }
        c0544tM1117x.f1788o = true;
        c0544tM1117x.f1787n = true;
        if ((i2 == 108 || i2 == 0) && this.f1827l != null) {
            C0544t c0544tM1117x2 = m1117x(0);
            c0544tM1117x2.f1784k = false;
            m1105D(c0544tM1117x2, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m1114u() {
        ViewGroup viewGroup;
        int i2 = 1;
        int i3 = 0;
        if (this.f1835t) {
            return;
        }
        int[] iArr = AbstractC0515a.f1646j;
        Context context = this.f1820e;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo1087h(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo1087h(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo1087h(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo1087h(10);
        }
        this.f1796C = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m1115v();
        this.f1821f.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f1797D) {
            viewGroup = this.f1795B ? (ViewGroup) layoutInflaterFrom.inflate(com.p055lu.wxmask272.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.p055lu.wxmask272.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f1796C) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.p055lu.wxmask272.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f1794A = false;
            this.f1841z = false;
        } else if (this.f1841z) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.p055lu.wxmask272.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0564d(context, typedValue.resourceId) : context).inflate(com.p055lu.wxmask272.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0699n0 interfaceC0699n0 = (InterfaceC0699n0) viewGroup.findViewById(com.p055lu.wxmask272.R.id.decor_content_parent);
            this.f1827l = interfaceC0699n0;
            interfaceC0699n0.setWindowCallback(this.f1821f.getCallback());
            if (this.f1794A) {
                ((ActionBarOverlayLayout) this.f1827l).m668j(109);
            }
            if (this.f1839x) {
                ((ActionBarOverlayLayout) this.f1827l).m668j(2);
            }
            if (this.f1840y) {
                ((ActionBarOverlayLayout) this.f1827l).m668j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f1841z + ", windowActionBarOverlay: " + this.f1794A + ", android:windowIsFloating: " + this.f1796C + ", windowActionModeOverlay: " + this.f1795B + ", windowNoTitle: " + this.f1797D + " }");
        }
        C0537m c0537m = new C0537m(this, i3);
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        AbstractC1038B.m2246u(viewGroup, c0537m);
        if (this.f1827l == null) {
            this.f1837v = (TextView) viewGroup.findViewById(com.p055lu.wxmask272.R.id.title);
        }
        Method method = AbstractC0718t1.f2436a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.p055lu.wxmask272.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f1821f.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f1821f.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0537m(this, i2));
        this.f1836u = viewGroup;
        Object obj = this.f1819d;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f1826k;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0699n0 interfaceC0699n02 = this.f1827l;
            if (interfaceC0699n02 != null) {
                interfaceC0699n02.setWindowTitle(title);
            } else {
                C0524E c0524e = this.f1824i;
                if (c0524e != null) {
                    C0697m1 c0697m1 = (C0697m1) c0524e.f1701t;
                    if (!c0697m1.f2357g) {
                        c0697m1.f2358h = title;
                        if ((c0697m1.f2352b & 8) != 0) {
                            Toolbar toolbar = c0697m1.f2351a;
                            toolbar.setTitle(title);
                            if (c0697m1.f2357g) {
                                AbstractC1048L.m2291j(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f1837v;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f1836u.findViewById(R.id.content);
        View decorView = this.f1821f.getDecorView();
        contentFrameLayout2.f1022h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = AbstractC1048L.f3662a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f1835t = true;
        C0544t c0544tM1117x = m1117x(0);
        if (this.f1804K || c0544tM1117x.f1781h != null) {
            return;
        }
        m1119z(108);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m1115v() {
        if (this.f1821f == null) {
            Object obj = this.f1819d;
            if (obj instanceof Activity) {
                m1108n(((Activity) obj).getWindow());
            }
        }
        if (this.f1821f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final AbstractC0429g m1116w(Context context) {
        if (this.f1810Q == null) {
            if (C0064h.f307e == null) {
                Context applicationContext = context.getApplicationContext();
                LocationManager locationManager = (LocationManager) applicationContext.getSystemService("location");
                C0064h c0064h = new C0064h();
                c0064h.f310d = new C0521B();
                c0064h.f308b = applicationContext;
                c0064h.f309c = locationManager;
                C0064h.f307e = c0064h;
            }
            this.f1810Q = new C0541q(this, C0064h.f307e);
        }
        return this.f1810Q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final C0544t m1117x(int i2) {
        C0544t[] c0544tArr = this.f1799F;
        if (c0544tArr == null || c0544tArr.length <= i2) {
            C0544t[] c0544tArr2 = new C0544t[i2 + 1];
            if (c0544tArr != null) {
                System.arraycopy(c0544tArr, 0, c0544tArr2, 0, c0544tArr.length);
            }
            this.f1799F = c0544tArr2;
            c0544tArr = c0544tArr2;
        }
        C0544t c0544t = c0544tArr[i2];
        if (c0544t != null) {
            return c0544t;
        }
        C0544t c0544t2 = new C0544t();
        c0544t2.f1774a = i2;
        c0544t2.f1787n = false;
        c0544tArr[i2] = c0544t2;
        return c0544t2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m1118y() {
        m1114u();
        if (this.f1841z && this.f1824i == null) {
            Object obj = this.f1819d;
            if (obj instanceof Activity) {
                this.f1824i = new C0524E((Activity) obj, this.f1794A);
            } else if (obj instanceof Dialog) {
                this.f1824i = new C0524E((Dialog) obj);
            }
            C0524E c0524e = this.f1824i;
            if (c0524e != null) {
                c0524e.m1065T(this.f1815V);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final void m1119z(int i2) {
        this.f1813T = (1 << i2) | this.f1813T;
        if (this.f1812S) {
            return;
        }
        View decorView = this.f1821f.getDecorView();
        RunnableC0536l runnableC0536l = this.f1814U;
        WeakHashMap weakHashMap = AbstractC1048L.f3662a;
        decorView.postOnAnimation(runnableC0536l);
        this.f1812S = true;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
