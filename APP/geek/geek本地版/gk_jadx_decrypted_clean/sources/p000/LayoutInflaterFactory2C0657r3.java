package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: r3 */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0657r3 extends AbstractC0173e3 implements InterfaceC0350iu, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: h0 */
    public static final u30 f4139h0 = new u30();

    /* JADX INFO: renamed from: i0 */
    public static final int[] f4140i0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: j0 */
    public static final boolean f4141j0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: k0 */
    public static final boolean f4142k0 = true;

    /* JADX INFO: renamed from: A */
    public ViewGroup f4143A;

    /* JADX INFO: renamed from: B */
    public TextView f4144B;

    /* JADX INFO: renamed from: C */
    public View f4145C;

    /* JADX INFO: renamed from: D */
    public boolean f4146D;

    /* JADX INFO: renamed from: E */
    public boolean f4147E;

    /* JADX INFO: renamed from: F */
    public boolean f4148F;

    /* JADX INFO: renamed from: G */
    public boolean f4149G;

    /* JADX INFO: renamed from: H */
    public boolean f4150H;

    /* JADX INFO: renamed from: I */
    public boolean f4151I;

    /* JADX INFO: renamed from: J */
    public boolean f4152J;

    /* JADX INFO: renamed from: K */
    public boolean f4153K;

    /* JADX INFO: renamed from: L */
    public C0620q3[] f4154L;

    /* JADX INFO: renamed from: M */
    public C0620q3 f4155M;

    /* JADX INFO: renamed from: N */
    public boolean f4156N;

    /* JADX INFO: renamed from: O */
    public boolean f4157O;

    /* JADX INFO: renamed from: P */
    public boolean f4158P;

    /* JADX INFO: renamed from: Q */
    public boolean f4159Q;

    /* JADX INFO: renamed from: R */
    public Configuration f4160R;

    /* JADX INFO: renamed from: S */
    public final int f4161S;

    /* JADX INFO: renamed from: T */
    public int f4162T;

    /* JADX INFO: renamed from: U */
    public int f4163U;

    /* JADX INFO: renamed from: V */
    public boolean f4164V;

    /* JADX INFO: renamed from: W */
    public C0471m3 f4165W;

    /* JADX INFO: renamed from: X */
    public C0471m3 f4166X;

    /* JADX INFO: renamed from: Y */
    public boolean f4167Y;

    /* JADX INFO: renamed from: Z */
    public int f4168Z;

    /* JADX INFO: renamed from: b0 */
    public boolean f4170b0;

    /* JADX INFO: renamed from: c0 */
    public Rect f4171c0;

    /* JADX INFO: renamed from: d0 */
    public Rect f4172d0;

    /* JADX INFO: renamed from: e0 */
    public C0622q5 f4173e0;

    /* JADX INFO: renamed from: f0 */
    public OnBackInvokedDispatcher f4174f0;

    /* JADX INFO: renamed from: g0 */
    public OnBackInvokedCallback f4175g0;

    /* JADX INFO: renamed from: j */
    public final Object f4176j;

    /* JADX INFO: renamed from: k */
    public final Context f4177k;

    /* JADX INFO: renamed from: l */
    public Window f4178l;

    /* JADX INFO: renamed from: m */
    public WindowCallbackC0434l3 f4179m;

    /* JADX INFO: renamed from: n */
    public final Object f4180n;

    /* JADX INFO: renamed from: o */
    public yb0 f4181o;

    /* JADX INFO: renamed from: p */
    public k50 f4182p;

    /* JADX INFO: renamed from: q */
    public CharSequence f4183q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0259gf f4184r;

    /* JADX INFO: renamed from: s */
    public C0247g3 f4185s;

    /* JADX INFO: renamed from: t */
    public C0247g3 f4186t;

    /* JADX INFO: renamed from: u */
    public AbstractC0506n1 f4187u;

    /* JADX INFO: renamed from: v */
    public ActionBarContextView f4188v;

    /* JADX INFO: renamed from: w */
    public PopupWindow f4189w;

    /* JADX INFO: renamed from: x */
    public RunnableC0210f3 f4190x;

    /* JADX INFO: renamed from: z */
    public boolean f4192z;

    /* JADX INFO: renamed from: y */
    public wa0 f4191y = null;

    /* JADX INFO: renamed from: a0 */
    public final RunnableC0210f3 f4169a0 = new RunnableC0210f3(this, 0);

    public LayoutInflaterFactory2C0657r3(Context context, Window window, InterfaceC0878x2 interfaceC0878x2, Object obj) {
        AppCompatActivity appCompatActivity;
        this.f4161S = -100;
        this.f4177k = context;
        this.f4180n = interfaceC0878x2;
        this.f4176j = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AppCompatActivity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    appCompatActivity = (AppCompatActivity) context;
                    break;
                }
            }
            appCompatActivity = null;
            if (appCompatActivity != null) {
                this.f4161S = ((LayoutInflaterFactory2C0657r3) appCompatActivity.m130l()).f4161S;
            }
        }
        if (this.f4161S == -100) {
            String name = this.f4176j.getClass().getName();
            u30 u30Var = f4139h0;
            Integer num = (Integer) u30Var.getOrDefault(name, null);
            if (num != null) {
                this.f4161S = num.intValue();
                u30Var.remove(this.f4176j.getClass().getName());
            }
        }
        if (window != null) {
            m2203o(window);
        }
        C0768u3.m2406d();
    }

    /* JADX INFO: renamed from: p */
    public static C0718sr m2191p(Context context) {
        C0718sr c0718sr;
        C0718sr c0718sr2;
        if (Build.VERSION.SDK_INT >= 33 || (c0718sr = AbstractC0173e3.f1686c) == null) {
            return null;
        }
        C0755tr c0755tr = c0718sr.f4452a;
        C0718sr c0718srM1387b = AbstractC0321i3.m1387b(context.getApplicationContext().getResources().getConfiguration());
        if (c0755tr.f4613a.isEmpty()) {
            c0718sr2 = C0718sr.f4451b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < c0718srM1387b.f4452a.f4613a.size() + c0755tr.f4613a.size()) {
                Locale locale = i < c0755tr.f4613a.size() ? c0755tr.f4613a.get(i) : c0718srM1387b.f4452a.f4613a.get(i - c0755tr.f4613a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            c0718sr2 = new C0718sr(new C0755tr(AbstractC0681rr.m2297a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return c0718sr2.f4452a.f4613a.isEmpty() ? c0718srM1387b : c0718sr2;
    }

    /* JADX INFO: renamed from: t */
    public static Configuration m2192t(Context context, int i, C0718sr c0718sr, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c0718sr != null) {
            AbstractC0321i3.m1389d(configuration2, c0718sr);
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: A */
    public final void m2193A() {
        m2209w();
        if (this.f4148F && this.f4181o == null) {
            Object obj = this.f4176j;
            if (obj instanceof Activity) {
                this.f4181o = new yb0((Activity) obj, this.f4149G);
            } else if (obj instanceof Dialog) {
                this.f4181o = new yb0((Dialog) obj);
            }
            yb0 yb0Var = this.f4181o;
            if (yb0Var != null) {
                yb0Var.m2684N(this.f4170b0);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m2194B(int i) {
        this.f4168Z = (1 << i) | this.f4168Z;
        if (this.f4167Y) {
            return;
        }
        View decorView = this.f4178l.getDecorView();
        WeakHashMap weakHashMap = ja0.f2600a;
        s90.m2321m(decorView, this.f4169a0);
        this.f4167Y = true;
    }

    /* JADX INFO: renamed from: C */
    public final int m2195C(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f4166X == null) {
                            this.f4166X = new C0471m3(this, context);
                        }
                        return this.f4166X.mo1778f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m2211y(context).mo1778f();
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m2196D() {
        InterfaceC0296hf interfaceC0296hf;
        f70 f70Var;
        boolean z = this.f4156N;
        this.f4156N = false;
        C0620q3 c0620q3M2212z = m2212z(0);
        if (!c0620q3M2212z.f3989m) {
            AbstractC0506n1 abstractC0506n1 = this.f4187u;
            if (abstractC0506n1 != null) {
                abstractC0506n1.mo1882a();
                return true;
            }
            m2193A();
            yb0 yb0Var = this.f4181o;
            if (yb0Var == null || (interfaceC0296hf = yb0Var.f5307A) == null || (f70Var = ((k70) interfaceC0296hf).f2717a.f360L) == null || f70Var.f1901b == null) {
                return false;
            }
            f70 f70Var2 = ((k70) interfaceC0296hf).f2717a.f360L;
            C0572ou c0572ou = f70Var2 == null ? null : f70Var2.f1901b;
            if (c0572ou != null) {
                c0572ou.collapseActionView();
            }
        } else if (!z) {
            m2206s(c0620q3M2212z, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (r2.f1627f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2197E(p000.C0620q3 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0657r3.m2197E(q3, android.view.KeyEvent):void");
    }

    /* JADX INFO: renamed from: F */
    public final boolean m2198F(C0620q3 c0620q3, int i, KeyEvent keyEvent) {
        MenuC0424ku menuC0424ku;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0620q3.f3987k || m2199G(c0620q3, keyEvent)) && (menuC0424ku = c0620q3.f3984h) != null) {
            return menuC0424ku.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2199G(p000.C0620q3 r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0657r3.m2199G(q3, android.view.KeyEvent):boolean");
    }

    /* JADX INFO: renamed from: H */
    public final void m2200H() {
        if (this.f4192z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m2201I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f4174f0 != null && (m2212z(0).f3989m || this.f4187u != null)) {
                z = true;
            }
            if (z && this.f4175g0 == null) {
                this.f4175g0 = AbstractC0397k3.m1619b(this.f4174f0, this);
            } else {
                if (z || (onBackInvokedCallback = this.f4175g0) == null) {
                    return;
                }
                AbstractC0397k3.m1620c(this.f4174f0, onBackInvokedCallback);
            }
        }
    }

    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: a */
    public final void mo973a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f4177k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0657r3) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: b */
    public final void mo974b() {
        if (this.f4181o != null) {
            m2193A();
            this.f4181o.getClass();
            m2194B(0);
        }
    }

    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: d */
    public final void mo975d() {
        String strM2834t;
        this.f4157O = true;
        m2202m(false, true);
        m2210x();
        Object obj = this.f4176j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM2834t = AbstractC0979zt.m2834t(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM2834t = null;
            }
            if (strM2834t != null) {
                yb0 yb0Var = this.f4181o;
                if (yb0Var == null) {
                    this.f4170b0 = true;
                } else {
                    yb0Var.m2684N(true);
                }
            }
            synchronized (AbstractC0173e3.f1691h) {
                AbstractC0173e3.m972f(this);
                AbstractC0173e3.f1690g.add(new WeakReference(this));
            }
        }
        this.f4160R = new Configuration(this.f4177k.getResources().getConfiguration());
        this.f4158P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo976e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4176j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = p000.AbstractC0173e3.f1691h
            monitor-enter(r0)
            p000.AbstractC0173e3.m972f(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f4167Y
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f4178l
            android.view.View r0 = r0.getDecorView()
            f3 r1 = r3.f4169a0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f4159Q = r0
            int r0 = r3.f4161S
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f4176j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            u30 r0 = p000.LayoutInflaterFactory2C0657r3.f4139h0
            java.lang.Object r1 = r3.f4176j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f4161S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            u30 r0 = p000.LayoutInflaterFactory2C0657r3.f4139h0
            java.lang.Object r1 = r3.f4176j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            m3 r0 = r3.f4165W
            if (r0 == 0) goto L63
            r0.m1985c()
        L63:
            m3 r0 = r3.f4166X
            if (r0 == 0) goto L6a
            r0.m1985c()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0657r3.mo976e():void");
    }

    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: g */
    public final boolean mo977g(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f4152J && i == 108) {
            return false;
        }
        if (this.f4148F && i == 1) {
            this.f4148F = false;
        }
        if (i == 1) {
            m2200H();
            this.f4152J = true;
            return true;
        }
        if (i == 2) {
            m2200H();
            this.f4146D = true;
            return true;
        }
        if (i == 5) {
            m2200H();
            this.f4147E = true;
            return true;
        }
        if (i == 10) {
            m2200H();
            this.f4150H = true;
            return true;
        }
        if (i == 108) {
            m2200H();
            this.f4148F = true;
            return true;
        }
        if (i != 109) {
            return this.f4178l.requestFeature(i);
        }
        m2200H();
        this.f4149G = true;
        return true;
    }

    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: h */
    public final void mo978h(int i) {
        m2209w();
        ViewGroup viewGroup = (ViewGroup) this.f4143A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f4177k).inflate(i, viewGroup);
        this.f4179m.m1737a(this.f4178l.getCallback());
    }

    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: i */
    public final void mo979i(View view) {
        m2209w();
        ViewGroup viewGroup = (ViewGroup) this.f4143A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f4179m.m1737a(this.f4178l.getCallback());
    }

    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: j */
    public final void mo980j(View view, ViewGroup.LayoutParams layoutParams) {
        m2209w();
        ViewGroup viewGroup = (ViewGroup) this.f4143A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f4179m.m1737a(this.f4178l.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.m1541j() != false) goto L20;
     */
    @Override // p000.InterfaceC0350iu
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo925k(p000.MenuC0424ku r6) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0657r3.mo925k(ku):void");
    }

    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: l */
    public final void mo981l(CharSequence charSequence) {
        this.f4183q = charSequence;
        InterfaceC0259gf interfaceC0259gf = this.f4184r;
        if (interfaceC0259gf != null) {
            interfaceC0259gf.setWindowTitle(charSequence);
            return;
        }
        yb0 yb0Var = this.f4181o;
        if (yb0Var == null) {
            TextView textView = this.f4144B;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        k70 k70Var = (k70) yb0Var.f5307A;
        if (k70Var.f2723g) {
            return;
        }
        Toolbar toolbar = k70Var.f2717a;
        k70Var.f2724h = charSequence;
        if ((k70Var.f2718b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (k70Var.f2723g) {
                ja0.m1576m(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e1  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2202m(boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0657r3.m2202m(boolean, boolean):boolean");
    }

    @Override // p000.InterfaceC0350iu
    /* JADX INFO: renamed from: n */
    public final boolean mo926n(MenuC0424ku menuC0424ku, MenuItem menuItem) {
        C0620q3 c0620q3;
        Window.Callback callback = this.f4178l.getCallback();
        if (callback != null && !this.f4159Q) {
            MenuC0424ku menuC0424kuMo633k = menuC0424ku.mo633k();
            C0620q3[] c0620q3Arr = this.f4154L;
            int length = c0620q3Arr != null ? c0620q3Arr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c0620q3 = c0620q3Arr[i];
                    if (c0620q3 != null && c0620q3.f3984h == menuC0424kuMo633k) {
                        break;
                    }
                    i++;
                } else {
                    c0620q3 = null;
                    break;
                }
            }
            if (c0620q3 != null) {
                return callback.onMenuItemSelected(c0620q3.f3977a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2203o(android.view.Window r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AppCompat has already installed itself into the Window"
            android.view.Window r1 = r7.f4178l
            if (r1 != 0) goto L80
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof p000.WindowCallbackC0434l3
            if (r2 != 0) goto L7a
            l3 r0 = new l3
            r0.<init>(r7, r1)
            r7.f4179m = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.f4177k
            int[] r1 = p000.LayoutInflaterFactory2C0657r3.f4140i0
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            u3 r4 = p000.C0768u3.m2404a()
            monitor-enter(r4)
            w00 r5 = r4.f4655a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r0 = r5.m2541d(r0, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r8
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L45
            r8.setBackgroundDrawable(r0)
        L45:
            r1.recycle()
            r7.f4178l = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.f4174f0
            if (r8 != 0) goto L79
            java.lang.Object r0 = r7.f4176j
            if (r8 == 0) goto L61
            android.window.OnBackInvokedCallback r1 = r7.f4175g0
            if (r1 == 0) goto L61
            p000.AbstractC0397k3.m1620c(r8, r1)
            r7.f4175g0 = r2
        L61:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L74
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = p000.AbstractC0397k3.m1618a(r0)
            r7.f4174f0 = r8
            goto L76
        L74:
            r7.f4174f0 = r2
        L76:
            r7.m2201I()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r0)
            throw r8
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0657r3.m2203o(android.view.Window):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:117:0x01df
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instruction units count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0657r3.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX INFO: renamed from: q */
    public final void m2204q(int i, C0620q3 c0620q3, MenuC0424ku menuC0424ku) {
        if (menuC0424ku == null) {
            if (c0620q3 == null && i >= 0) {
                C0620q3[] c0620q3Arr = this.f4154L;
                if (i < c0620q3Arr.length) {
                    c0620q3 = c0620q3Arr[i];
                }
            }
            if (c0620q3 != null) {
                menuC0424ku = c0620q3.f3984h;
            }
        }
        if ((c0620q3 == null || c0620q3.f3989m) && !this.f4159Q) {
            WindowCallbackC0434l3 windowCallbackC0434l3 = this.f4179m;
            Window.Callback callback = this.f4178l.getCallback();
            windowCallbackC0434l3.getClass();
            try {
                windowCallbackC0434l3.f3000d = true;
                callback.onPanelClosed(i, menuC0424ku);
            } finally {
                windowCallbackC0434l3.f3000d = false;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2205r(MenuC0424ku menuC0424ku) {
        C0358j1 c0358j1;
        if (this.f4153K) {
            return;
        }
        this.f4153K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f4184r;
        actionBarOverlayLayout.m158k();
        ActionMenuView actionMenuView = ((k70) actionBarOverlayLayout.f259e).f2717a.f366a;
        if (actionMenuView != null && (c0358j1 = actionMenuView.f285t) != null) {
            c0358j1.m1540f();
            C0208f1 c0208f1 = c0358j1.f2535t;
            if (c0208f1 != null && c0208f1.m2600b()) {
                c0208f1.f5031i.dismiss();
            }
        }
        Window.Callback callback = this.f4178l.getCallback();
        if (callback != null && !this.f4159Q) {
            callback.onPanelClosed(108, menuC0424ku);
        }
        this.f4153K = false;
    }

    /* JADX INFO: renamed from: s */
    public final void m2206s(C0620q3 c0620q3, boolean z) {
        C0583p3 c0583p3;
        InterfaceC0259gf interfaceC0259gf;
        C0358j1 c0358j1;
        if (z && c0620q3.f3977a == 0 && (interfaceC0259gf = this.f4184r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0259gf;
            actionBarOverlayLayout.m158k();
            ActionMenuView actionMenuView = ((k70) actionBarOverlayLayout.f259e).f2717a.f366a;
            if (actionMenuView != null && (c0358j1 = actionMenuView.f285t) != null && c0358j1.m1541j()) {
                m2205r(c0620q3.f3984h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f4177k.getSystemService("window");
        if (windowManager != null && c0620q3.f3989m && (c0583p3 = c0620q3.f3981e) != null) {
            windowManager.removeView(c0583p3);
            if (z) {
                m2204q(c0620q3.f3977a, c0620q3, null);
            }
        }
        c0620q3.f3987k = false;
        c0620q3.f3988l = false;
        c0620q3.f3989m = false;
        c0620q3.f3982f = null;
        c0620q3.f3990n = true;
        if (this.f4155M == c0620q3) {
            this.f4155M = null;
        }
        if (c0620q3.f3977a == 0) {
            m2201I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0123  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2207u(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0657r3.m2207u(android.view.KeyEvent):boolean");
    }

    /* JADX INFO: renamed from: v */
    public final void m2208v(int i) {
        C0620q3 c0620q3M2212z = m2212z(i);
        if (c0620q3M2212z.f3984h != null) {
            Bundle bundle = new Bundle();
            c0620q3M2212z.f3984h.m1727t(bundle);
            if (bundle.size() > 0) {
                c0620q3M2212z.f3992p = bundle;
            }
            c0620q3M2212z.f3984h.m1730w();
            c0620q3M2212z.f3984h.clear();
        }
        c0620q3M2212z.f3991o = true;
        c0620q3M2212z.f3990n = true;
        if ((i == 108 || i == 0) && this.f4184r != null) {
            C0620q3 c0620q3M2212z2 = m2212z(0);
            c0620q3M2212z2.f3987k = false;
            m2199G(c0620q3M2212z2, null);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2209w() {
        ViewGroup viewGroup;
        if (this.f4192z) {
            return;
        }
        Context context = this.f4177k;
        int[] iArr = AbstractC0910xy.f5226j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        int i = 0;
        int i2 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo977g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo977g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo977g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo977g(10);
        }
        this.f4151I = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m2210x();
        this.f4178l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f4152J) {
            viewGroup = this.f4150H ? (ViewGroup) layoutInflaterFrom.inflate(com.ljx.wechatmod.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.ljx.wechatmod.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f4151I) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.ljx.wechatmod.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f4149G = false;
            this.f4148F = false;
        } else if (this.f4148F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.ljx.wechatmod.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0407kd(context, typedValue.resourceId) : context).inflate(com.ljx.wechatmod.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0259gf interfaceC0259gf = (InterfaceC0259gf) viewGroup.findViewById(com.ljx.wechatmod.R.id.decor_content_parent);
            this.f4184r = interfaceC0259gf;
            interfaceC0259gf.setWindowCallback(this.f4178l.getCallback());
            if (this.f4149G) {
                ((ActionBarOverlayLayout) this.f4184r).m157j(109);
            }
            if (this.f4146D) {
                ((ActionBarOverlayLayout) this.f4184r).m157j(2);
            }
            if (this.f4147E) {
                ((ActionBarOverlayLayout) this.f4184r).m157j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f4148F + ", windowActionBarOverlay: " + this.f4149G + ", android:windowIsFloating: " + this.f4151I + ", windowActionModeOverlay: " + this.f4150H + ", windowNoTitle: " + this.f4152J + " }");
        }
        C0247g3 c0247g3 = new C0247g3(this, i);
        WeakHashMap weakHashMap = ja0.f2600a;
        y90.m2675u(viewGroup, c0247g3);
        if (this.f4184r == null) {
            this.f4144B = (TextView) viewGroup.findViewById(com.ljx.wechatmod.R.id.title);
        }
        Method method = cb0.f942a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.ljx.wechatmod.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f4178l.findViewById(R.id.content);
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
        this.f4178l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0247g3(this, i2));
        this.f4143A = viewGroup;
        Object obj = this.f4176j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f4183q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0259gf interfaceC0259gf2 = this.f4184r;
            if (interfaceC0259gf2 != null) {
                interfaceC0259gf2.setWindowTitle(title);
            } else {
                yb0 yb0Var = this.f4181o;
                if (yb0Var != null) {
                    k70 k70Var = (k70) yb0Var.f5307A;
                    if (!k70Var.f2723g) {
                        Toolbar toolbar = k70Var.f2717a;
                        k70Var.f2724h = title;
                        if ((k70Var.f2718b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (k70Var.f2723g) {
                                ja0.m1576m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f4144B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f4143A.findViewById(R.id.content);
        View decorView = this.f4178l.getDecorView();
        contentFrameLayout2.f302g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = ja0.f2600a;
        if (v90.m2496c(contentFrameLayout2)) {
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
        this.f4192z = true;
        C0620q3 c0620q3M2212z = m2212z(0);
        if (this.f4159Q || c0620q3M2212z.f3984h != null) {
            return;
        }
        m2194B(108);
    }

    /* JADX INFO: renamed from: x */
    public final void m2210x() {
        if (this.f4178l == null) {
            Object obj = this.f4176j;
            if (obj instanceof Activity) {
                m2203o(((Activity) obj).getWindow());
            }
        }
        if (this.f4178l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC0545o3 m2211y(Context context) {
        if (this.f4165W == null) {
            if (C0659r5.f4207g == null) {
                Context applicationContext = context.getApplicationContext();
                C0659r5.f4207g = new C0659r5(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f4165W = new C0471m3(this, C0659r5.f4207g);
        }
        return this.f4165W;
    }

    /* JADX INFO: renamed from: z */
    public final C0620q3 m2212z(int i) {
        C0620q3[] c0620q3Arr = this.f4154L;
        if (c0620q3Arr == null || c0620q3Arr.length <= i) {
            C0620q3[] c0620q3Arr2 = new C0620q3[i + 1];
            if (c0620q3Arr != null) {
                System.arraycopy(c0620q3Arr, 0, c0620q3Arr2, 0, c0620q3Arr.length);
            }
            this.f4154L = c0620q3Arr2;
            c0620q3Arr = c0620q3Arr2;
        }
        C0620q3 c0620q3 = c0620q3Arr[i];
        if (c0620q3 != null) {
            return c0620q3;
        }
        C0620q3 c0620q32 = new C0620q3();
        c0620q32.f3977a = i;
        c0620q32.f3990n = false;
        c0620q3Arr[i] = c0620q32;
        return c0620q32;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
