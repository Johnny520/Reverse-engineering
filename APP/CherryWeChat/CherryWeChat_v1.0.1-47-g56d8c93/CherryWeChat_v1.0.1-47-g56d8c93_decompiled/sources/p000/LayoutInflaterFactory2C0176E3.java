package p000;

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
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
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
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: E3 */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0176E3 extends AbstractC2397q3 implements InterfaceC2113jr, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: h0 */
    public static final C2520sy f457h0 = new C2520sy(0);

    /* JADX INFO: renamed from: i0 */
    public static final int[] f458i0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: j0 */
    public static final boolean f459j0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: A */
    public ViewGroup f460A;

    /* JADX INFO: renamed from: B */
    public TextView f461B;

    /* JADX INFO: renamed from: C */
    public View f462C;

    /* JADX INFO: renamed from: D */
    public boolean f463D;

    /* JADX INFO: renamed from: E */
    public boolean f464E;

    /* JADX INFO: renamed from: F */
    public boolean f465F;

    /* JADX INFO: renamed from: G */
    public boolean f466G;

    /* JADX INFO: renamed from: H */
    public boolean f467H;

    /* JADX INFO: renamed from: I */
    public boolean f468I;

    /* JADX INFO: renamed from: J */
    public boolean f469J;

    /* JADX INFO: renamed from: K */
    public boolean f470K;

    /* JADX INFO: renamed from: L */
    public C0133D3[] f471L;

    /* JADX INFO: renamed from: M */
    public C0133D3 f472M;

    /* JADX INFO: renamed from: N */
    public boolean f473N;

    /* JADX INFO: renamed from: O */
    public boolean f474O;

    /* JADX INFO: renamed from: P */
    public boolean f475P;

    /* JADX INFO: renamed from: Q */
    public boolean f476Q;

    /* JADX INFO: renamed from: R */
    public Configuration f477R;

    /* JADX INFO: renamed from: S */
    public final int f478S;

    /* JADX INFO: renamed from: T */
    public int f479T;

    /* JADX INFO: renamed from: U */
    public int f480U;

    /* JADX INFO: renamed from: V */
    public boolean f481V;

    /* JADX INFO: renamed from: W */
    public C2784z3 f482W;

    /* JADX INFO: renamed from: X */
    public C2784z3 f483X;

    /* JADX INFO: renamed from: Y */
    public boolean f484Y;

    /* JADX INFO: renamed from: Z */
    public int f485Z;

    /* JADX INFO: renamed from: b0 */
    public boolean f487b0;

    /* JADX INFO: renamed from: c0 */
    public Rect f488c0;

    /* JADX INFO: renamed from: d0 */
    public Rect f489d0;

    /* JADX INFO: renamed from: e0 */
    public C2613v4 f490e0;

    /* JADX INFO: renamed from: f0 */
    public OnBackInvokedDispatcher f491f0;

    /* JADX INFO: renamed from: g0 */
    public OnBackInvokedCallback f492g0;

    /* JADX INFO: renamed from: j */
    public final Object f493j;

    /* JADX INFO: renamed from: k */
    public final Context f494k;

    /* JADX INFO: renamed from: l */
    public Window f495l;

    /* JADX INFO: renamed from: m */
    public WindowCallbackC2741y3 f496m;

    /* JADX INFO: renamed from: n */
    public final Object f497n;

    /* JADX INFO: renamed from: o */
    public AbstractC2257n0 f498o;

    /* JADX INFO: renamed from: p */
    public C0515Lz f499p;

    /* JADX INFO: renamed from: q */
    public CharSequence f500q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0449Kc f501r;

    /* JADX INFO: renamed from: s */
    public C2483s3 f502s;

    /* JADX INFO: renamed from: t */
    public C2483s3 f503t;

    /* JADX INFO: renamed from: u */
    public AbstractC0345I0 f504u;

    /* JADX INFO: renamed from: v */
    public ActionBarContextView f505v;

    /* JADX INFO: renamed from: w */
    public PopupWindow f506w;

    /* JADX INFO: renamed from: x */
    public RunnableC2440r3 f507x;

    /* JADX INFO: renamed from: z */
    public boolean f509z;

    /* JADX INFO: renamed from: y */
    public C0273GE f508y = null;

    /* JADX INFO: renamed from: a0 */
    public final RunnableC2440r3 f486a0 = new RunnableC2440r3(this, 0);

    public LayoutInflaterFactory2C0176E3(Context context, Window window, InterfaceC1437g3 interfaceC1437g3, Object obj) {
        AbstractActivityC1244c3 abstractActivityC1244c3 = null;
        this.f478S = -100;
        this.f494k = context;
        this.f497n = interfaceC1437g3;
        this.f493j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AbstractActivityC1244c3)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        abstractActivityC1244c3 = (AbstractActivityC1244c3) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC1244c3 != null) {
                this.f478S = ((LayoutInflaterFactory2C0176E3) abstractActivityC1244c3.getDelegate()).f478S;
            }
        }
        if (this.f478S == -100) {
            String name = this.f493j.getClass().getName();
            C2520sy c2520sy = f457h0;
            Integer num = (Integer) c2520sy.get(name);
            if (num != null) {
                this.f478S = num.intValue();
                c2520sy.remove(this.f493j.getClass().getName());
            }
        }
        if (window != null) {
            m351o(window);
        }
        C0262G3.m541d();
    }

    /* JADX INFO: renamed from: p */
    public static C1105Zo m330p(Context context) {
        C1105Zo c1105Zo;
        C1105Zo c1105Zo2;
        if (Build.VERSION.SDK_INT >= 33 || (c1105Zo = AbstractC2397q3.f8400c) == null) {
            return null;
        }
        C1186ap c1186ap = c1105Zo.f3499a;
        C1105Zo c1105ZoM5123b = AbstractC2612v3.m5123b(context.getApplicationContext().getResources().getConfiguration());
        if (c1186ap.f4071a.isEmpty()) {
            c1105Zo2 = C1105Zo.f3498b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < c1105ZoM5123b.f3499a.f4071a.size() + c1186ap.f4071a.size()) {
                Locale locale = i < c1186ap.f4071a.size() ? c1186ap.f4071a.get(i) : c1105ZoM5123b.f3499a.f4071a.get(i - c1186ap.f4071a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            c1105Zo2 = new C1105Zo(new C1186ap(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return c1105Zo2.f3499a.f4071a.isEmpty() ? c1105ZoM5123b : c1105Zo2;
    }

    /* JADX INFO: renamed from: t */
    public static Configuration m331t(Context context, int i, C1105Zo c1105Zo, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c1105Zo != null) {
            AbstractC2612v3.m5125d(configuration2, c1105Zo);
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: A */
    public final void m332A() {
        m357w();
        if (this.f465F && this.f498o == null) {
            Object obj = this.f493j;
            if (obj instanceof Activity) {
                this.f498o = new C2229mF((Activity) obj, this.f466G);
            } else if (obj instanceof Dialog) {
                this.f498o = new C2229mF((Dialog) obj);
            }
            AbstractC2257n0 abstractC2257n0 = this.f498o;
            if (abstractC2257n0 != null) {
                abstractC2257n0.mo4509m(this.f487b0);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m333B(int i) {
        this.f485Z = (1 << i) | this.f485Z;
        if (this.f484Y) {
            return;
        }
        View decorView = this.f495l.getDecorView();
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        decorView.postOnAnimation(this.f486a0);
        this.f484Y = true;
    }

    /* JADX INFO: renamed from: C */
    public final int m334C(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f483X == null) {
                            this.f483X = new C2784z3(this, context);
                        }
                        return this.f483X.mo82h();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m359y(context).mo82h();
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m335D() {
        boolean z = this.f473N;
        this.f473N = false;
        C0133D3 c0133d3M360z = m360z(0);
        if (!c0133d3M360z.f341m) {
            AbstractC0345I0 abstractC0345I0 = this.f504u;
            if (abstractC0345I0 != null) {
                abstractC0345I0.mo735a();
                return true;
            }
            m332A();
            AbstractC2257n0 abstractC2257n0 = this.f498o;
            if (abstractC2257n0 == null || !abstractC2257n0.mo4502b()) {
                return false;
            }
        } else if (!z) {
            m354s(c0133d3M360z, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (r2.f9414f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m336E(C0133D3 c0133d3, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = c0133d3.f341m;
        int i2 = c0133d3.f329a;
        if (z || this.f476Q) {
            return;
        }
        Context context = this.f494k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f495l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, c0133d3.f336h)) {
            m354s(c0133d3, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !m338G(c0133d3, keyEvent)) {
            return;
        }
        C0090C3 c0090c3 = c0133d3.f333e;
        if (c0090c3 != null && !c0133d3.f342n) {
            View view = c0133d3.f335g;
            if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                i = -1;
            }
            c0133d3.f340l = false;
            WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams2.gravity = c0133d3.f331c;
            layoutParams2.windowAnimations = c0133d3.f332d;
            windowManager.addView(c0133d3.f333e, layoutParams2);
            c0133d3.f341m = true;
            if (i2 != 0) {
                m340I();
                return;
            }
            return;
        }
        if (c0090c3 == null) {
            m332A();
            AbstractC2257n0 abstractC2257n0 = this.f498o;
            Context contextMo4505e = abstractC2257n0 != null ? abstractC2257n0.mo4505e() : null;
            if (contextMo4505e != null) {
                context = contextMo4505e;
            }
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(io.github.cherrywechat.R.attr.actionBarPopupTheme, typedValue, true);
            int i3 = typedValue.resourceId;
            if (i3 != 0) {
                themeNewTheme.applyStyle(i3, true);
            }
            themeNewTheme.resolveAttribute(io.github.cherrywechat.R.attr.panelMenuListTheme, typedValue, true);
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                themeNewTheme.applyStyle(i4, true);
            } else {
                themeNewTheme.applyStyle(io.github.cherrywechat.R.style.Theme_AppCompat_CompactMenu, true);
            }
            C0147Db c0147Db = new C0147Db(context, 0);
            c0147Db.getTheme().setTo(themeNewTheme);
            c0133d3.f338j = c0147Db;
            TypedArray typedArrayObtainStyledAttributes = c0147Db.obtainStyledAttributes(AbstractC0982Wu.f3075j);
            c0133d3.f330b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
            c0133d3.f332d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            typedArrayObtainStyledAttributes.recycle();
            c0133d3.f333e = new C0090C3(this, c0133d3.f338j);
            c0133d3.f331c = 81;
        } else if (c0133d3.f342n && c0090c3.getChildCount() > 0) {
            c0133d3.f333e.removeAllViews();
        }
        View view2 = c0133d3.f335g;
        if (view2 == null) {
            if (c0133d3.f336h != null) {
                if (this.f503t == null) {
                    this.f503t = new C2483s3(this, 3);
                }
                C2483s3 c2483s3 = this.f503t;
                if (c0133d3.f337i == null) {
                    C2768yo c2768yo = new C2768yo(c0133d3.f338j);
                    c0133d3.f337i = c2768yo;
                    c2768yo.f9413e = c2483s3;
                    MenuC2204lr menuC2204lr = c0133d3.f336h;
                    menuC2204lr.m4429b(c2768yo, menuC2204lr.f7660a);
                }
                C2768yo c2768yo2 = c0133d3.f337i;
                C0090C3 c0090c32 = c0133d3.f333e;
                if (c2768yo2.f9412d == null) {
                    c2768yo2.f9412d = (ExpandedMenuView) c2768yo2.f9410b.inflate(io.github.cherrywechat.R.layout.abc_expanded_menu_layout, (ViewGroup) c0090c32, false);
                    if (c2768yo2.f9414f == null) {
                        c2768yo2.f9414f = new C2725xo(c2768yo2);
                    }
                    c2768yo2.f9412d.setAdapter((ListAdapter) c2768yo2.f9414f);
                    c2768yo2.f9412d.setOnItemClickListener(c2768yo2);
                }
                ExpandedMenuView expandedMenuView = c2768yo2.f9412d;
                c0133d3.f334f = expandedMenuView;
                if (expandedMenuView != null) {
                }
            }
            c0133d3.f342n = true;
            return;
        }
        c0133d3.f334f = view2;
        if (c0133d3.f334f != null) {
            if (c0133d3.f335g == null) {
                C2768yo c2768yo3 = c0133d3.f337i;
                if (c2768yo3.f9414f == null) {
                    c2768yo3.f9414f = new C2725xo(c2768yo3);
                }
            }
            ViewGroup.LayoutParams layoutParams3 = c0133d3.f334f.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            c0133d3.f333e.setBackgroundResource(c0133d3.f330b);
            ViewParent parent = c0133d3.f334f.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(c0133d3.f334f);
            }
            c0133d3.f333e.addView(c0133d3.f334f, layoutParams3);
            if (!c0133d3.f334f.hasFocus()) {
                c0133d3.f334f.requestFocus();
            }
        }
        c0133d3.f342n = true;
        return;
        i = -2;
        c0133d3.f340l = false;
        WindowManager.LayoutParams layoutParams22 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams22.gravity = c0133d3.f331c;
        layoutParams22.windowAnimations = c0133d3.f332d;
        windowManager.addView(c0133d3.f333e, layoutParams22);
        c0133d3.f341m = true;
        if (i2 != 0) {
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m337F(C0133D3 c0133d3, int i, KeyEvent keyEvent) {
        MenuC2204lr menuC2204lr;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0133d3.f339k || m338G(c0133d3, keyEvent)) && (menuC2204lr = c0133d3.f336h) != null) {
            return menuC2204lr.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d8  */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m338G(C0133D3 c0133d3, KeyEvent keyEvent) {
        InterfaceC0449Kc interfaceC0449Kc;
        InterfaceC0449Kc interfaceC0449Kc2;
        Resources.Theme themeNewTheme;
        InterfaceC0449Kc interfaceC0449Kc3;
        InterfaceC0449Kc interfaceC0449Kc4;
        if (!this.f476Q) {
            boolean z = c0133d3.f339k;
            int i = c0133d3.f329a;
            if (z) {
                return true;
            }
            C0133D3 c0133d32 = this.f472M;
            if (c0133d32 != null && c0133d32 != c0133d3) {
                m354s(c0133d32, false);
            }
            Window.Callback callback = this.f495l.getCallback();
            if (callback != null) {
                c0133d3.f335g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (interfaceC0449Kc4 = this.f501r) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0449Kc4;
                actionBarOverlayLayout.m2088k();
                ((C2663wB) actionBarOverlayLayout.f3754e).f9224l = true;
            }
            if (c0133d3.f335g == null && (!z2 || !(this.f498o instanceof C2577uB))) {
                MenuC2204lr menuC2204lr = c0133d3.f336h;
                if (menuC2204lr == null || c0133d3.f343o) {
                    if (menuC2204lr == null) {
                        Context context = this.f494k;
                        if ((i == 0 || i == 108) && this.f501r != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(io.github.cherrywechat.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(io.github.cherrywechat.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(io.github.cherrywechat.R.attr.actionBarWidgetTheme, typedValue, true);
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
                                C0147Db c0147Db = new C0147Db(context, 0);
                                c0147Db.getTheme().setTo(themeNewTheme);
                                context = c0147Db;
                            }
                        }
                        MenuC2204lr menuC2204lr2 = new MenuC2204lr(context);
                        menuC2204lr2.f7664e = this;
                        MenuC2204lr menuC2204lr3 = c0133d3.f336h;
                        if (menuC2204lr2 != menuC2204lr3) {
                            if (menuC2204lr3 != null) {
                                menuC2204lr3.m4437r(c0133d3.f337i);
                            }
                            c0133d3.f336h = menuC2204lr2;
                            C2768yo c2768yo = c0133d3.f337i;
                            if (c2768yo != null) {
                                menuC2204lr2.m4429b(c2768yo, menuC2204lr2.f7660a);
                            }
                        }
                        if (c0133d3.f336h != null) {
                            if (z2 && (interfaceC0449Kc2 = this.f501r) != null) {
                                if (this.f502s == null) {
                                    this.f502s = new C2483s3(this, 2);
                                }
                                ((ActionBarOverlayLayout) interfaceC0449Kc2).m2089l(c0133d3.f336h, this.f502s);
                            }
                            c0133d3.f336h.m4442w();
                            if (callback.onCreatePanelMenu(i, c0133d3.f336h)) {
                                c0133d3.f343o = false;
                            } else {
                                MenuC2204lr menuC2204lr4 = c0133d3.f336h;
                                if (menuC2204lr4 != null) {
                                    if (menuC2204lr4 != null) {
                                        menuC2204lr4.m4437r(c0133d3.f337i);
                                    }
                                    c0133d3.f336h = null;
                                }
                                if (z2 && (interfaceC0449Kc = this.f501r) != null) {
                                    ((ActionBarOverlayLayout) interfaceC0449Kc).m2089l(null, this.f502s);
                                }
                            }
                        }
                    }
                }
                c0133d3.f336h.m4442w();
                Bundle bundle = c0133d3.f344p;
                if (bundle != null) {
                    c0133d3.f336h.m4438s(bundle);
                    c0133d3.f344p = null;
                }
                if (!callback.onPreparePanel(0, c0133d3.f335g, c0133d3.f336h)) {
                    if (z2 && (interfaceC0449Kc3 = this.f501r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0449Kc3).m2089l(null, this.f502s);
                    }
                    c0133d3.f336h.m4441v();
                    return false;
                }
                c0133d3.f336h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c0133d3.f336h.m4441v();
            }
            c0133d3.f339k = true;
            c0133d3.f340l = false;
            this.f472M = c0133d3;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final void m339H() {
        if (this.f509z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m340I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f491f0 != null && (m360z(0).f341m || this.f504u != null)) {
                z = true;
            }
            if (z && this.f492g0 == null) {
                this.f492g0 = AbstractC2698x3.m5277b(this.f491f0, this);
            } else {
                if (z || (onBackInvokedCallback = this.f492g0) == null) {
                    return;
                }
                AbstractC2698x3.m5278c(this.f491f0, onBackInvokedCallback);
                this.f492g0 = null;
            }
        }
    }

    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: a */
    public final void mo341a() {
        if (this.f498o != null) {
            m332A();
            if (this.f498o.mo4587g()) {
                return;
            }
            m333B(0);
        }
    }

    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: c */
    public final void mo342c() {
        String strM2530A;
        this.f474O = true;
        m350m(false, true);
        m358x();
        Object obj = this.f493j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM2530A = AbstractC1293cr.m2530A(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM2530A = null;
            }
            if (strM2530A != null) {
                AbstractC2257n0 abstractC2257n0 = this.f498o;
                if (abstractC2257n0 == null) {
                    this.f487b0 = true;
                } else {
                    abstractC2257n0.mo4509m(true);
                }
            }
            synchronized (AbstractC2397q3.f8405h) {
                AbstractC2397q3.m4834f(this);
                AbstractC2397q3.f8404g.add(new WeakReference(this));
            }
        }
        this.f477R = new Configuration(this.f494k.getResources().getConfiguration());
        this.f475P = true;
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: d */
    public final boolean mo233d(MenuC2204lr menuC2204lr, MenuItem menuItem) {
        C0133D3 c0133d3;
        Window.Callback callback = this.f495l.getCallback();
        if (callback != null && !this.f476Q) {
            MenuC2204lr menuC2204lrMo430k = menuC2204lr.mo430k();
            C0133D3[] c0133d3Arr = this.f471L;
            int length = c0133d3Arr != null ? c0133d3Arr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c0133d3 = c0133d3Arr[i];
                    if (c0133d3 != null && c0133d3.f336h == menuC2204lrMo430k) {
                        break;
                    }
                    i++;
                } else {
                    c0133d3 = null;
                    break;
                }
            }
            if (c0133d3 != null) {
                return callback.onMenuItemSelected(c0133d3.f329a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo343e() {
        if (this.f493j instanceof Activity) {
            synchronized (AbstractC2397q3.f8405h) {
                AbstractC2397q3.m4834f(this);
            }
        }
        if (this.f484Y) {
            this.f495l.getDecorView().removeCallbacks(this.f486a0);
        }
        this.f476Q = true;
        if (this.f478S != -100) {
            Object obj = this.f493j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f457h0.put(this.f493j.getClass().getName(), Integer.valueOf(this.f478S));
            } else {
                f457h0.remove(this.f493j.getClass().getName());
            }
        }
        AbstractC2257n0 abstractC2257n0 = this.f498o;
        if (abstractC2257n0 != null) {
            abstractC2257n0.mo4588i();
        }
        C2784z3 c2784z3 = this.f482W;
        if (c2784z3 != null) {
            c2784z3.m77c();
        }
        C2784z3 c2784z32 = this.f483X;
        if (c2784z32 != null) {
            c2784z32.m77c();
        }
    }

    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: g */
    public final boolean mo344g(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f469J && i == 108) {
            return false;
        }
        if (this.f465F && i == 1) {
            this.f465F = false;
        }
        if (i == 1) {
            m339H();
            this.f469J = true;
            return true;
        }
        if (i == 2) {
            m339H();
            this.f463D = true;
            return true;
        }
        if (i == 5) {
            m339H();
            this.f464E = true;
            return true;
        }
        if (i == 10) {
            m339H();
            this.f467H = true;
            return true;
        }
        if (i == 108) {
            m339H();
            this.f465F = true;
            return true;
        }
        if (i != 109) {
            return this.f495l.requestFeature(i);
        }
        m339H();
        this.f466G = true;
        return true;
    }

    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: h */
    public final void mo345h(int i) {
        m357w();
        ViewGroup viewGroup = (ViewGroup) this.f460A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f494k).inflate(i, viewGroup);
        this.f496m.m5304a(this.f495l.getCallback());
    }

    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: i */
    public final void mo346i(View view) {
        m357w();
        ViewGroup viewGroup = (ViewGroup) this.f460A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f496m.m5304a(this.f495l.getCallback());
    }

    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: j */
    public final void mo347j(View view, ViewGroup.LayoutParams layoutParams) {
        m357w();
        ViewGroup viewGroup = (ViewGroup) this.f460A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f496m.m5304a(this.f495l.getCallback());
    }

    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: k */
    public final void mo348k(CharSequence charSequence) {
        this.f500q = charSequence;
        InterfaceC0449Kc interfaceC0449Kc = this.f501r;
        if (interfaceC0449Kc != null) {
            interfaceC0449Kc.setWindowTitle(charSequence);
            return;
        }
        AbstractC2257n0 abstractC2257n0 = this.f498o;
        if (abstractC2257n0 != null) {
            abstractC2257n0.mo4511o(charSequence);
            return;
        }
        TextView textView = this.f461B;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a2  */
    /* JADX WARN: Type inference failed for: r1v0, types: [g3, java.lang.Object] */
    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC0345I0 mo349l(InterfaceC0302H0 interfaceC0302H0) {
        AbstractC0345I0 abstractC0345I0OnWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        AbstractC0345I0 abstractC0345I0;
        if (interfaceC0302H0 == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC0345I0 abstractC0345I02 = this.f504u;
        if (abstractC0345I02 != null) {
            abstractC0345I02.mo735a();
        }
        C0649P3 c0649p3 = new C0649P3(this, interfaceC0302H0);
        m332A();
        AbstractC2257n0 abstractC2257n0 = this.f498o;
        ?? r1 = this.f497n;
        if (abstractC2257n0 != null) {
            AbstractC0345I0 abstractC0345I0Mo4512p = abstractC2257n0.mo4512p(c0649p3);
            this.f504u = abstractC0345I0Mo4512p;
            if (abstractC0345I0Mo4512p != null) {
                r1.onSupportActionModeStarted(abstractC0345I0Mo4512p);
            }
        }
        if (this.f504u == null) {
            C0273GE c0273ge = this.f508y;
            if (c0273ge != null) {
                c0273ge.m554b();
            }
            AbstractC0345I0 abstractC0345I03 = this.f504u;
            if (abstractC0345I03 != null) {
                abstractC0345I03.mo735a();
            }
            if (this.f476Q) {
                abstractC0345I0OnWindowStartingSupportActionMode = null;
                if (abstractC0345I0OnWindowStartingSupportActionMode == null) {
                }
                abstractC0345I0 = this.f504u;
                if (abstractC0345I0 != null) {
                }
                m340I();
                this.f504u = this.f504u;
            } else {
                try {
                    abstractC0345I0OnWindowStartingSupportActionMode = r1.onWindowStartingSupportActionMode(c0649p3);
                } catch (AbstractMethodError unused) {
                    abstractC0345I0OnWindowStartingSupportActionMode = null;
                }
                if (abstractC0345I0OnWindowStartingSupportActionMode == null) {
                    this.f504u = abstractC0345I0OnWindowStartingSupportActionMode;
                } else {
                    int i = 1;
                    if (this.f505v == null) {
                        boolean z = this.f468I;
                        Context context = this.f494k;
                        if (z) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(io.github.cherrywechat.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                C0147Db c0147Db = new C0147Db(context, 0);
                                c0147Db.getTheme().setTo(themeNewTheme);
                                context = c0147Db;
                            }
                            this.f505v = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, io.github.cherrywechat.R.attr.actionModePopupWindowStyle);
                            this.f506w = popupWindow;
                            popupWindow.setWindowLayoutType(2);
                            this.f506w.setContentView(this.f505v);
                            this.f506w.setWidth(-1);
                            context.getTheme().resolveAttribute(io.github.cherrywechat.R.attr.actionBarSize, typedValue, true);
                            this.f505v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.f506w.setHeight(-2);
                            this.f507x = new RunnableC2440r3(this, i);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.f460A.findViewById(io.github.cherrywechat.R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                m332A();
                                AbstractC2257n0 abstractC2257n02 = this.f498o;
                                Context contextMo4505e = abstractC2257n02 != null ? abstractC2257n02.mo4505e() : null;
                                if (contextMo4505e != null) {
                                    context = contextMo4505e;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                                this.f505v = (ActionBarContextView) viewStubCompat.m2119a();
                            }
                        }
                    }
                    if (this.f505v != null) {
                        C0273GE c0273ge2 = this.f508y;
                        if (c0273ge2 != null) {
                            c0273ge2.m554b();
                        }
                        this.f505v.m2081e();
                        Context context2 = this.f505v.getContext();
                        ActionBarContextView actionBarContextView = this.f505v;
                        C0900Uy c0900Uy = new C0900Uy();
                        c0900Uy.f2796c = context2;
                        c0900Uy.f2797d = actionBarContextView;
                        c0900Uy.f2798e = c0649p3;
                        MenuC2204lr menuC2204lr = new MenuC2204lr(actionBarContextView.getContext());
                        menuC2204lr.f7671l = 1;
                        c0900Uy.f2801h = menuC2204lr;
                        menuC2204lr.f7664e = c0900Uy;
                        if (((InterfaceC0302H0) c0649p3.f2089b).mo642b(c0900Uy, menuC2204lr)) {
                            c0900Uy.mo741h();
                            this.f505v.m2079c(c0900Uy);
                            this.f504u = c0900Uy;
                            if (this.f509z && (viewGroup = this.f460A) != null && viewGroup.isLaidOut()) {
                                this.f505v.setAlpha(0.0f);
                                C0273GE c0273geM4388a = AbstractC2185lE.m4388a(this.f505v);
                                c0273geM4388a.m553a(1.0f);
                                this.f508y = c0273geM4388a;
                                c0273geM4388a.m556d(new C2526t3(i, this));
                            } else {
                                this.f505v.setAlpha(1.0f);
                                this.f505v.setVisibility(0);
                                if (this.f505v.getParent() instanceof View) {
                                    View view = (View) this.f505v.getParent();
                                    WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
                                    AbstractC1255cE.m2370c(view);
                                }
                            }
                            if (this.f506w != null) {
                                this.f495l.getDecorView().post(this.f507x);
                            }
                        } else {
                            this.f504u = null;
                        }
                    }
                }
                abstractC0345I0 = this.f504u;
                if (abstractC0345I0 != null) {
                    r1.onSupportActionModeStarted(abstractC0345I0);
                }
                m340I();
                this.f504u = this.f504u;
            }
        }
        m340I();
        return this.f504u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m350m(boolean z, boolean z2) {
        int i;
        boolean z3;
        if (this.f476Q) {
            return false;
        }
        int i2 = this.f478S;
        if (i2 == -100) {
            i2 = AbstractC2397q3.f8399b;
        }
        Context context = this.f494k;
        int iM334C = m334C(context, i2);
        int i3 = Build.VERSION.SDK_INT;
        C1105Zo c1105ZoM330p = i3 < 33 ? m330p(context) : null;
        if (!z2 && c1105ZoM330p != null) {
            c1105ZoM330p = AbstractC2612v3.m5123b(context.getResources().getConfiguration());
        }
        Configuration configurationM331t = m331t(context, iM334C, c1105ZoM330p, null, false);
        boolean z4 = this.f481V;
        boolean z5 = true;
        Object obj = this.f493j;
        if (z4 || !(obj instanceof Activity)) {
            this.f481V = true;
            i = this.f480U;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.f480U = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.f480U = 0;
                }
                this.f481V = true;
                i = this.f480U;
            }
        }
        Configuration configuration = this.f477R;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationM331t.uiMode & 48;
        C1105Zo c1105ZoM5123b = AbstractC2612v3.m5123b(configuration);
        C1105Zo c1105ZoM5123b2 = c1105ZoM330p == null ? null : AbstractC2612v3.m5123b(configurationM331t);
        int i6 = i4 != i5 ? 512 : 0;
        if (c1105ZoM5123b2 != null && !c1105ZoM5123b.equals(c1105ZoM5123b2)) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0 && z && this.f474O && ((f459j0 || this.f475P) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (!activity.isChild()) {
                if (Build.VERSION.SDK_INT >= 31 && (i6 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationM331t.getLayoutDirection());
                }
                activity.recreate();
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (c1105ZoM5123b2 != null) {
                AbstractC2612v3.m5125d(configuration2, c1105ZoM5123b2);
            }
            resources.updateConfiguration(configuration2, null);
            int i7 = this.f479T;
            if (i7 != 0) {
                context.setTheme(i7);
                context.getTheme().applyStyle(this.f479T, true);
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof InterfaceC1061Yn) {
                    if (((C1185ao) ((InterfaceC1061Yn) activity2).getLifecycle()).f4064c.m1371a(EnumC0675Pn.f2149c)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f475P && !this.f476Q) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z5 && (obj instanceof AbstractActivityC1244c3)) {
            if ((i6 & 512) != 0) {
                ((AbstractActivityC1244c3) obj).onNightModeChanged(iM334C);
            }
            if ((i6 & 4) != 0) {
                ((AbstractActivityC1244c3) obj).onLocalesChanged(c1105ZoM330p);
            }
        }
        if (c1105ZoM5123b2 != null) {
            AbstractC2612v3.m5124c(AbstractC2612v3.m5123b(context.getResources().getConfiguration()));
        }
        if (i2 == 0) {
            m359y(context).m87n();
        } else {
            C2784z3 c2784z3 = this.f482W;
            if (c2784z3 != null) {
                c2784z3.m77c();
            }
        }
        if (i2 == 3) {
            if (this.f483X == null) {
                this.f483X = new C2784z3(this, context);
            }
            this.f483X.m87n();
        } else {
            C2784z3 c2784z32 = this.f483X;
            if (c2784z32 != null) {
                c2784z32.m77c();
            }
        }
        return z5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.m219h() != false) goto L20;
     */
    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo241n(MenuC2204lr menuC2204lr) {
        ActionMenuView actionMenuView;
        C0130D0 c0130d0;
        InterfaceC0449Kc interfaceC0449Kc = this.f501r;
        if (interfaceC0449Kc != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0449Kc;
            actionBarOverlayLayout.m2088k();
            Toolbar toolbar = ((C2663wB) actionBarOverlayLayout.f3754e).f9213a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f3823a) != null && actionMenuView.f3780s) {
                if (ViewConfiguration.get(this.f494k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f501r;
                    actionBarOverlayLayout2.m2088k();
                    ActionMenuView actionMenuView2 = ((C2663wB) actionBarOverlayLayout2.f3754e).f9213a.f3823a;
                    if (actionMenuView2 != null) {
                        C0130D0 c0130d02 = actionMenuView2.f3781t;
                        if (c0130d02 != null) {
                            if (c0130d02.f322u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f495l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f501r;
                actionBarOverlayLayout3.m2088k();
                if (((C2663wB) actionBarOverlayLayout3.f3754e).f9213a.m2111o()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f501r;
                    actionBarOverlayLayout4.m2088k();
                    ActionMenuView actionMenuView3 = ((C2663wB) actionBarOverlayLayout4.f3754e).f9213a.f3823a;
                    if (actionMenuView3 != null && (c0130d0 = actionMenuView3.f3781t) != null) {
                        c0130d0.m214c();
                    }
                    if (this.f476Q) {
                        return;
                    }
                    callback.onPanelClosed(108, m360z(0).f336h);
                    return;
                }
                if (callback == null || this.f476Q) {
                    return;
                }
                if (this.f484Y && (1 & this.f485Z) != 0) {
                    View decorView = this.f495l.getDecorView();
                    RunnableC2440r3 runnableC2440r3 = this.f486a0;
                    decorView.removeCallbacks(runnableC2440r3);
                    runnableC2440r3.run();
                }
                C0133D3 c0133d3M360z = m360z(0);
                MenuC2204lr menuC2204lr2 = c0133d3M360z.f336h;
                if (menuC2204lr2 == null || c0133d3M360z.f343o || !callback.onPreparePanel(0, c0133d3M360z.f335g, menuC2204lr2)) {
                    return;
                }
                callback.onMenuOpened(108, c0133d3M360z.f336h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f501r;
                actionBarOverlayLayout5.m2088k();
                ((C2663wB) actionBarOverlayLayout5.f3754e).f9213a.m2117u();
                return;
            }
        }
        C0133D3 c0133d3M360z2 = m360z(0);
        c0133d3M360z2.f342n = true;
        m354s(c0133d3M360z2, false);
        m336E(c0133d3M360z2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m351o(Window window) {
        Drawable drawableM5351d;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f495l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC2741y3) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        WindowCallbackC2741y3 windowCallbackC2741y3 = new WindowCallbackC2741y3(this, callback);
        this.f496m = windowCallbackC2741y3;
        window.setCallback(windowCallbackC2741y3);
        Context context = this.f494k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f458i0);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableM5351d = null;
        } else {
            C0262G3 c0262g3M539a = C0262G3.m539a();
            synchronized (c0262g3M539a) {
                drawableM5351d = c0262g3M539a.f844a.m5351d(context, resourceId, true);
            }
        }
        if (drawableM5351d != null) {
            window.setBackgroundDrawable(drawableM5351d);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f495l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f491f0) != null) {
            return;
        }
        Object obj = this.f493j;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f492g0) != null) {
            AbstractC2698x3.m5278c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f492g0 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f491f0 = AbstractC2698x3.m5276a(activity);
            } else {
                this.f491f0 = null;
            }
        }
        m340I();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:113:0x01c0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0176E3.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX INFO: renamed from: q */
    public final void m352q(int i, C0133D3 c0133d3, MenuC2204lr menuC2204lr) {
        if (menuC2204lr == null) {
            if (c0133d3 == null && i >= 0) {
                C0133D3[] c0133d3Arr = this.f471L;
                if (i < c0133d3Arr.length) {
                    c0133d3 = c0133d3Arr[i];
                }
            }
            if (c0133d3 != null) {
                menuC2204lr = c0133d3.f336h;
            }
        }
        if ((c0133d3 == null || c0133d3.f341m) && !this.f476Q) {
            WindowCallbackC2741y3 windowCallbackC2741y3 = this.f496m;
            Window.Callback callback = this.f495l.getCallback();
            windowCallbackC2741y3.getClass();
            try {
                windowCallbackC2741y3.f9349e = true;
                callback.onPanelClosed(i, menuC2204lr);
            } finally {
                windowCallbackC2741y3.f9349e = false;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m353r(MenuC2204lr menuC2204lr) {
        C0130D0 c0130d0;
        if (this.f470K) {
            return;
        }
        this.f470K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f501r;
        actionBarOverlayLayout.m2088k();
        ActionMenuView actionMenuView = ((C2663wB) actionBarOverlayLayout.f3754e).f9213a.f3823a;
        if (actionMenuView != null && (c0130d0 = actionMenuView.f3781t) != null) {
            c0130d0.m214c();
            C2781z0 c2781z0 = c0130d0.f321t;
            if (c2781z0 != null && c2781z0.m5291b()) {
                c2781z0.f9323i.dismiss();
            }
        }
        Window.Callback callback = this.f495l.getCallback();
        if (callback != null && !this.f476Q) {
            callback.onPanelClosed(108, menuC2204lr);
        }
        this.f470K = false;
    }

    /* JADX INFO: renamed from: s */
    public final void m354s(C0133D3 c0133d3, boolean z) {
        C0090C3 c0090c3;
        InterfaceC0449Kc interfaceC0449Kc;
        if (z && c0133d3.f329a == 0 && (interfaceC0449Kc = this.f501r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0449Kc;
            actionBarOverlayLayout.m2088k();
            if (((C2663wB) actionBarOverlayLayout.f3754e).f9213a.m2111o()) {
                m353r(c0133d3.f336h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f494k.getSystemService("window");
        if (windowManager != null && c0133d3.f341m && (c0090c3 = c0133d3.f333e) != null) {
            windowManager.removeView(c0090c3);
            if (z) {
                m352q(c0133d3.f329a, c0133d3, null);
            }
        }
        c0133d3.f339k = false;
        c0133d3.f340l = false;
        c0133d3.f341m = false;
        c0133d3.f334f = null;
        c0133d3.f342n = true;
        if (this.f472M == c0133d3) {
            this.f472M = null;
        }
        if (c0133d3.f329a == 0) {
            m340I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0115  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m355u(KeyEvent keyEvent) {
        boolean zM2117u;
        boolean zM338G;
        AudioManager audioManager;
        ActionMenuView actionMenuView;
        C0130D0 c0130d0;
        Object obj = this.f493j;
        if (((obj instanceof InterfaceC0974Wm) || (obj instanceof DialogInterfaceC2697x2)) && this.f495l.getDecorView() != null) {
            WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        }
        if (keyEvent.getKeyCode() == 82) {
            WindowCallbackC2741y3 windowCallbackC2741y3 = this.f496m;
            Window.Callback callback = this.f495l.getCallback();
            windowCallbackC2741y3.getClass();
            try {
                windowCallbackC2741y3.f9348d = true;
                if (!callback.dispatchKeyEvent(keyEvent)) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyEvent.getAction() == 0) {
                        if (keyCode == 4) {
                            this.f473N = (keyEvent.getFlags() & 128) != 0;
                            return false;
                        }
                        if (keyCode == 82) {
                            if (keyEvent.getRepeatCount() == 0) {
                                C0133D3 c0133d3M360z = m360z(0);
                                if (!c0133d3M360z.f341m) {
                                    m338G(c0133d3M360z, keyEvent);
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                    if (keyCode != 4) {
                        if (keyCode == 82) {
                            if (this.f504u == null) {
                                C0133D3 c0133d3M360z2 = m360z(0);
                                InterfaceC0449Kc interfaceC0449Kc = this.f501r;
                                Context context = this.f494k;
                                if (interfaceC0449Kc != null) {
                                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0449Kc;
                                    actionBarOverlayLayout.m2088k();
                                    Toolbar toolbar = ((C2663wB) actionBarOverlayLayout.f3754e).f9213a;
                                    if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.f3823a) == null || !actionMenuView.f3780s || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                        boolean z = c0133d3M360z2.f341m;
                                        if (z || c0133d3M360z2.f340l) {
                                            m354s(c0133d3M360z2, true);
                                            zM2117u = z;
                                            if (zM2117u && (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) != null) {
                                                audioManager.playSoundEffect(0);
                                                return true;
                                            }
                                        } else {
                                            if (c0133d3M360z2.f339k) {
                                                if (c0133d3M360z2.f343o) {
                                                    c0133d3M360z2.f339k = false;
                                                    zM338G = m338G(c0133d3M360z2, keyEvent);
                                                } else {
                                                    zM338G = true;
                                                }
                                                if (zM338G) {
                                                    m336E(c0133d3M360z2, keyEvent);
                                                    zM2117u = true;
                                                    if (zM2117u) {
                                                        audioManager.playSoundEffect(0);
                                                        return true;
                                                    }
                                                }
                                            }
                                            zM2117u = false;
                                            if (zM2117u) {
                                            }
                                        }
                                    } else {
                                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f501r;
                                        actionBarOverlayLayout2.m2088k();
                                        if (((C2663wB) actionBarOverlayLayout2.f3754e).f9213a.m2111o()) {
                                            ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f501r;
                                            actionBarOverlayLayout3.m2088k();
                                            ActionMenuView actionMenuView2 = ((C2663wB) actionBarOverlayLayout3.f3754e).f9213a.f3823a;
                                            if (actionMenuView2 != null && (c0130d0 = actionMenuView2.f3781t) != null && c0130d0.m214c()) {
                                                zM2117u = true;
                                            }
                                            if (zM2117u) {
                                            }
                                        } else {
                                            if (!this.f476Q && m338G(c0133d3M360z2, keyEvent)) {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f501r;
                                                actionBarOverlayLayout4.m2088k();
                                                zM2117u = ((C2663wB) actionBarOverlayLayout4.f3754e).f9213a.m2117u();
                                            }
                                            if (zM2117u) {
                                            }
                                        }
                                        zM2117u = false;
                                        if (zM2117u) {
                                        }
                                    }
                                }
                            }
                        }
                        return false;
                    }
                    if (!m335D()) {
                        return false;
                    }
                }
            } finally {
                windowCallbackC2741y3.f9348d = false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final void m356v(int i) {
        C0133D3 c0133d3M360z = m360z(i);
        if (c0133d3M360z.f336h != null) {
            Bundle bundle = new Bundle();
            c0133d3M360z.f336h.m4439t(bundle);
            if (bundle.size() > 0) {
                c0133d3M360z.f344p = bundle;
            }
            c0133d3M360z.f336h.m4442w();
            c0133d3M360z.f336h.clear();
        }
        c0133d3M360z.f343o = true;
        c0133d3M360z.f342n = true;
        if ((i == 108 || i == 0) && this.f501r != null) {
            C0133D3 c0133d3M360z2 = m360z(0);
            c0133d3M360z2.f339k = false;
            m338G(c0133d3M360z2, null);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m357w() {
        ViewGroup viewGroup;
        if (this.f509z) {
            return;
        }
        Context context = this.f494k;
        int[] iArr = AbstractC0982Wu.f3075j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        int i = 0;
        int i2 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo344g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo344g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo344g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo344g(10);
        }
        this.f468I = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m358x();
        this.f495l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f469J) {
            viewGroup = this.f467H ? (ViewGroup) layoutInflaterFrom.inflate(io.github.cherrywechat.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(io.github.cherrywechat.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f468I) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(io.github.cherrywechat.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f466G = false;
            this.f465F = false;
        } else if (this.f465F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(io.github.cherrywechat.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0147Db(context, typedValue.resourceId) : context).inflate(io.github.cherrywechat.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0449Kc interfaceC0449Kc = (InterfaceC0449Kc) viewGroup.findViewById(io.github.cherrywechat.R.id.decor_content_parent);
            this.f501r = interfaceC0449Kc;
            interfaceC0449Kc.setWindowCallback(this.f495l.getCallback());
            if (this.f466G) {
                ((ActionBarOverlayLayout) this.f501r).m2087j(109);
            }
            if (this.f463D) {
                ((ActionBarOverlayLayout) this.f501r).m2087j(2);
            }
            if (this.f464E) {
                ((ActionBarOverlayLayout) this.f501r).m2087j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f465F + ", windowActionBarOverlay: " + this.f466G + ", android:windowIsFloating: " + this.f468I + ", windowActionModeOverlay: " + this.f467H + ", windowNoTitle: " + this.f469J + " }");
        }
        C2483s3 c2483s3 = new C2483s3(this, i);
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        AbstractC1360eE.m2640l(viewGroup, c2483s3);
        if (this.f501r == null) {
            this.f461B = (TextView) viewGroup.findViewById(io.github.cherrywechat.R.id.title);
        }
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(io.github.cherrywechat.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f495l.findViewById(R.id.content);
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
        this.f495l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C2483s3(this, i2));
        this.f460A = viewGroup;
        Object obj = this.f493j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f500q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0449Kc interfaceC0449Kc2 = this.f501r;
            if (interfaceC0449Kc2 != null) {
                interfaceC0449Kc2.setWindowTitle(title);
            } else {
                AbstractC2257n0 abstractC2257n0 = this.f498o;
                if (abstractC2257n0 != null) {
                    abstractC2257n0.mo4511o(title);
                } else {
                    TextView textView = this.f461B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f460A.findViewById(R.id.content);
        View decorView = this.f495l.getDecorView();
        contentFrameLayout2.f3798g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f509z = true;
        C0133D3 c0133d3M360z = m360z(0);
        if (this.f476Q || c0133d3M360z.f336h != null) {
            return;
        }
        m333B(108);
    }

    /* JADX INFO: renamed from: x */
    public final void m358x() {
        if (this.f495l == null) {
            Object obj = this.f493j;
            if (obj instanceof Activity) {
                m351o(((Activity) obj).getWindow());
            }
        }
        if (this.f495l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC0047B3 m359y(Context context) {
        if (this.f482W == null) {
            if (C2656w4.f9194g == null) {
                Context applicationContext = context.getApplicationContext();
                C2656w4.f9194g = new C2656w4(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f482W = new C2784z3(this, C2656w4.f9194g);
        }
        return this.f482W;
    }

    /* JADX INFO: renamed from: z */
    public final C0133D3 m360z(int i) {
        C0133D3[] c0133d3Arr = this.f471L;
        if (c0133d3Arr == null || c0133d3Arr.length <= i) {
            C0133D3[] c0133d3Arr2 = new C0133D3[i + 1];
            if (c0133d3Arr != null) {
                System.arraycopy(c0133d3Arr, 0, c0133d3Arr2, 0, c0133d3Arr.length);
            }
            this.f471L = c0133d3Arr2;
            c0133d3Arr = c0133d3Arr2;
        }
        C0133D3 c0133d3 = c0133d3Arr[i];
        if (c0133d3 != null) {
            return c0133d3;
        }
        C0133D3 c0133d32 = new C0133D3();
        c0133d32.f329a = i;
        c0133d32.f342n = false;
        c0133d3Arr[i] = c0133d32;
        return c0133d32;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
