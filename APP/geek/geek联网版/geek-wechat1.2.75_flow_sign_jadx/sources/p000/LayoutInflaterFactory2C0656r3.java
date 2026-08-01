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
public final class LayoutInflaterFactory2C0656r3 extends AbstractC0173e3 implements InterfaceC0572ou, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: h0 */
    public static final b40 f4000h0 = new b40();

    /* JADX INFO: renamed from: i0 */
    public static final int[] f4001i0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: j0 */
    public static final boolean f4002j0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: k0 */
    public static final boolean f4003k0 = true;

    /* JADX INFO: renamed from: A */
    public ViewGroup f4004A;

    /* JADX INFO: renamed from: B */
    public TextView f4005B;

    /* JADX INFO: renamed from: C */
    public View f4006C;

    /* JADX INFO: renamed from: D */
    public boolean f4007D;

    /* JADX INFO: renamed from: E */
    public boolean f4008E;

    /* JADX INFO: renamed from: F */
    public boolean f4009F;

    /* JADX INFO: renamed from: G */
    public boolean f4010G;

    /* JADX INFO: renamed from: H */
    public boolean f4011H;

    /* JADX INFO: renamed from: I */
    public boolean f4012I;

    /* JADX INFO: renamed from: J */
    public boolean f4013J;

    /* JADX INFO: renamed from: K */
    public boolean f4014K;

    /* JADX INFO: renamed from: L */
    public C0619q3[] f4015L;

    /* JADX INFO: renamed from: M */
    public C0619q3 f4016M;

    /* JADX INFO: renamed from: N */
    public boolean f4017N;

    /* JADX INFO: renamed from: O */
    public boolean f4018O;

    /* JADX INFO: renamed from: P */
    public boolean f4019P;

    /* JADX INFO: renamed from: Q */
    public boolean f4020Q;

    /* JADX INFO: renamed from: R */
    public Configuration f4021R;

    /* JADX INFO: renamed from: S */
    public final int f4022S;

    /* JADX INFO: renamed from: T */
    public int f4023T;

    /* JADX INFO: renamed from: U */
    public int f4024U;

    /* JADX INFO: renamed from: V */
    public boolean f4025V;

    /* JADX INFO: renamed from: W */
    public C0471m3 f4026W;

    /* JADX INFO: renamed from: X */
    public C0471m3 f4027X;

    /* JADX INFO: renamed from: Y */
    public boolean f4028Y;

    /* JADX INFO: renamed from: Z */
    public int f4029Z;

    /* JADX INFO: renamed from: b0 */
    public boolean f4031b0;

    /* JADX INFO: renamed from: c0 */
    public Rect f4032c0;

    /* JADX INFO: renamed from: d0 */
    public Rect f4033d0;

    /* JADX INFO: renamed from: e0 */
    public C0621q5 f4034e0;

    /* JADX INFO: renamed from: f0 */
    public OnBackInvokedDispatcher f4035f0;

    /* JADX INFO: renamed from: g0 */
    public OnBackInvokedCallback f4036g0;

    /* JADX INFO: renamed from: j */
    public final Object f4037j;

    /* JADX INFO: renamed from: k */
    public final Context f4038k;

    /* JADX INFO: renamed from: l */
    public Window f4039l;

    /* JADX INFO: renamed from: m */
    public WindowCallbackC0434l3 f4040m;

    /* JADX INFO: renamed from: n */
    public final Object f4041n;

    /* JADX INFO: renamed from: o */
    public dc0 f4042o;

    /* JADX INFO: renamed from: p */
    public r50 f4043p;

    /* JADX INFO: renamed from: q */
    public CharSequence f4044q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0296hf f4045r;

    /* JADX INFO: renamed from: s */
    public C0247g3 f4046s;

    /* JADX INFO: renamed from: t */
    public C0247g3 f4047t;

    /* JADX INFO: renamed from: u */
    public AbstractC0506n1 f4048u;

    /* JADX INFO: renamed from: v */
    public ActionBarContextView f4049v;

    /* JADX INFO: renamed from: w */
    public PopupWindow f4050w;

    /* JADX INFO: renamed from: x */
    public RunnableC0210f3 f4051x;

    /* JADX INFO: renamed from: z */
    public boolean f4053z;

    /* JADX INFO: renamed from: y */
    public bb0 f4052y = null;

    /* JADX INFO: renamed from: a0 */
    public final RunnableC0210f3 f4030a0 = new RunnableC0210f3(this, 0);

    public LayoutInflaterFactory2C0656r3(Context context, Window window, InterfaceC0878x2 interfaceC0878x2, Object obj) {
        AppCompatActivity appCompatActivity;
        this.f4022S = -100;
        this.f4038k = context;
        this.f4041n = interfaceC0878x2;
        this.f4037j = obj;
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
                this.f4022S = ((LayoutInflaterFactory2C0656r3) appCompatActivity.m115l()).f4022S;
            }
        }
        if (this.f4022S == -100) {
            String name = this.f4037j.getClass().getName();
            b40 b40Var = f4000h0;
            Integer num = (Integer) b40Var.getOrDefault(name, null);
            if (num != null) {
                this.f4022S = num.intValue();
                b40Var.remove(this.f4037j.getClass().getName());
            }
        }
        if (window != null) {
            m2214o(window);
        }
        C0767u3.m2427d();
    }

    /* JADX INFO: renamed from: p */
    public static C0866wr m2202p(Context context) {
        C0866wr c0866wr;
        C0866wr c0866wr2;
        if (Build.VERSION.SDK_INT >= 33 || (c0866wr = AbstractC0173e3.f1491c) == null) {
            return null;
        }
        C0903xr c0903xr = c0866wr.f5104a;
        C0866wr c0866wrM1438b = AbstractC0321i3.m1438b(context.getApplicationContext().getResources().getConfiguration());
        if (c0903xr.f5304a.isEmpty()) {
            c0866wr2 = C0866wr.f5103b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < c0866wrM1438b.f5104a.f5304a.size() + c0903xr.f5304a.size()) {
                Locale locale = i < c0903xr.f5304a.size() ? c0903xr.f5304a.get(i) : c0866wrM1438b.f5104a.f5304a.get(i - c0903xr.f5304a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            c0866wr2 = new C0866wr(new C0903xr(AbstractC0828vr.m2575a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return c0866wr2.f5104a.f5304a.isEmpty() ? c0866wrM1438b : c0866wr2;
    }

    /* JADX INFO: renamed from: t */
    public static Configuration m2203t(Context context, int i, C0866wr c0866wr, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c0866wr != null) {
            AbstractC0321i3.m1440d(configuration2, c0866wr);
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: A */
    public final void m2204A() {
        m2220w();
        if (this.f4009F && this.f4042o == null) {
            Object obj = this.f4037j;
            if (obj instanceof Activity) {
                this.f4042o = new dc0((Activity) obj, this.f4010G);
            } else if (obj instanceof Dialog) {
                this.f4042o = new dc0((Dialog) obj);
            }
            dc0 dc0Var = this.f4042o;
            if (dc0Var != null) {
                dc0Var.m912T(this.f4031b0);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m2205B(int i) {
        this.f4029Z = (1 << i) | this.f4029Z;
        if (this.f4028Y) {
            return;
        }
        View decorView = this.f4039l.getDecorView();
        WeakHashMap weakHashMap = oa0.f3426a;
        x90.m2665m(decorView, this.f4030a0);
        this.f4028Y = true;
    }

    /* JADX INFO: renamed from: C */
    public final int m2206C(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f4027X == null) {
                            this.f4027X = new C0471m3(this, context);
                        }
                        return this.f4027X.mo1796f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m2222y(context).mo1796f();
                }
            }
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m2207D() {
        InterfaceC0372jf interfaceC0372jf;
        l70 l70Var;
        boolean z = this.f4017N;
        this.f4017N = false;
        C0619q3 c0619q3M2223z = m2223z(0);
        if (!c0619q3M2223z.f3786m) {
            AbstractC0506n1 abstractC0506n1 = this.f4048u;
            if (abstractC0506n1 != null) {
                abstractC0506n1.mo613a();
                return true;
            }
            m2204A();
            dc0 dc0Var = this.f4042o;
            if (dc0Var == null || (interfaceC0372jf = dc0Var.f1384z) == null || (l70Var = ((q70) interfaceC0372jf).f3849a.f323L) == null || l70Var.f2966b == null) {
                return false;
            }
            l70 l70Var2 = ((q70) interfaceC0372jf).f3849a.f323L;
            C0869wu c0869wu = l70Var2 == null ? null : l70Var2.f2966b;
            if (c0869wu != null) {
                c0869wu.collapseActionView();
            }
        } else if (!z) {
            m2217s(c0619q3M2223z, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (r2.f2257f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2208E(p000.C0619q3 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0656r3.m2208E(q3, android.view.KeyEvent):void");
    }

    /* JADX INFO: renamed from: F */
    public final boolean m2209F(C0619q3 c0619q3, int i, KeyEvent keyEvent) {
        MenuC0646qu menuC0646qu;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0619q3.f3784k || m2210G(c0619q3, keyEvent)) && (menuC0646qu = c0619q3.f3781h) != null) {
            return menuC0646qu.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /* JADX INFO: renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2210G(p000.C0619q3 r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0656r3.m2210G(q3, android.view.KeyEvent):boolean");
    }

    /* JADX INFO: renamed from: H */
    public final void m2211H() {
        if (this.f4053z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m2212I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f4035f0 != null && (m2223z(0).f3786m || this.f4048u != null)) {
                z = true;
            }
            if (z && this.f4036g0 == null) {
                this.f4036g0 = AbstractC0397k3.m1642b(this.f4035f0, this);
            } else {
                if (z || (onBackInvokedCallback = this.f4036g0) == null) {
                    return;
                }
                AbstractC0397k3.m1643c(this.f4035f0, onBackInvokedCallback);
            }
        }
    }

    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: a */
    public final void mo957a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f4038k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C0656r3) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: b */
    public final void mo958b() {
        if (this.f4042o != null) {
            m2204A();
            this.f4042o.getClass();
            m2205B(0);
        }
    }

    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: d */
    public final void mo959d() {
        String strM1896o;
        this.f4018O = true;
        m2213m(false, true);
        m2221x();
        Object obj = this.f4037j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM1896o = AbstractC0498mu.m1896o(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strM1896o = null;
            }
            if (strM1896o != null) {
                dc0 dc0Var = this.f4042o;
                if (dc0Var == null) {
                    this.f4031b0 = true;
                } else {
                    dc0Var.m912T(true);
                }
            }
            synchronized (AbstractC0173e3.f1496h) {
                AbstractC0173e3.m956f(this);
                AbstractC0173e3.f1495g.add(new WeakReference(this));
            }
        }
        this.f4021R = new Configuration(this.f4038k.getResources().getConfiguration());
        this.f4019P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo960e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f4037j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = p000.AbstractC0173e3.f1496h
            monitor-enter(r0)
            p000.AbstractC0173e3.m956f(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f4028Y
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f4039l
            android.view.View r0 = r0.getDecorView()
            f3 r1 = r3.f4030a0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f4020Q = r0
            int r0 = r3.f4022S
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f4037j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            b40 r0 = p000.LayoutInflaterFactory2C0656r3.f4000h0
            java.lang.Object r1 = r3.f4037j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f4022S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            b40 r0 = p000.LayoutInflaterFactory2C0656r3.f4000h0
            java.lang.Object r1 = r3.f4037j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            m3 r0 = r3.f4026W
            if (r0 == 0) goto L63
            r0.m1966c()
        L63:
            m3 r0 = r3.f4027X
            if (r0 == 0) goto L6a
            r0.m1966c()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0656r3.mo960e():void");
    }

    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: g */
    public final boolean mo961g(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f4013J && i == 108) {
            return false;
        }
        if (this.f4009F && i == 1) {
            this.f4009F = false;
        }
        if (i == 1) {
            m2211H();
            this.f4013J = true;
            return true;
        }
        if (i == 2) {
            m2211H();
            this.f4007D = true;
            return true;
        }
        if (i == 5) {
            m2211H();
            this.f4008E = true;
            return true;
        }
        if (i == 10) {
            m2211H();
            this.f4011H = true;
            return true;
        }
        if (i == 108) {
            m2211H();
            this.f4009F = true;
            return true;
        }
        if (i != 109) {
            return this.f4039l.requestFeature(i);
        }
        m2211H();
        this.f4010G = true;
        return true;
    }

    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: h */
    public final void mo962h(int i) {
        m2220w();
        ViewGroup viewGroup = (ViewGroup) this.f4004A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f4038k).inflate(i, viewGroup);
        this.f4040m.m1727a(this.f4039l.getCallback());
    }

    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: i */
    public final void mo963i(View view) {
        m2220w();
        ViewGroup viewGroup = (ViewGroup) this.f4004A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f4040m.m1727a(this.f4039l.getCallback());
    }

    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: j */
    public final void mo964j(View view, ViewGroup.LayoutParams layoutParams) {
        m2220w();
        ViewGroup viewGroup = (ViewGroup) this.f4004A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f4040m.m1727a(this.f4039l.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.m1561j() != false) goto L20;
     */
    @Override // p000.InterfaceC0572ou
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo623k(p000.MenuC0646qu r6) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0656r3.mo623k(qu):void");
    }

    @Override // p000.AbstractC0173e3
    /* JADX INFO: renamed from: l */
    public final void mo965l(CharSequence charSequence) {
        this.f4044q = charSequence;
        InterfaceC0296hf interfaceC0296hf = this.f4045r;
        if (interfaceC0296hf != null) {
            interfaceC0296hf.setWindowTitle(charSequence);
            return;
        }
        dc0 dc0Var = this.f4042o;
        if (dc0Var == null) {
            TextView textView = this.f4005B;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        q70 q70Var = (q70) dc0Var.f1384z;
        if (q70Var.f3855g) {
            return;
        }
        Toolbar toolbar = q70Var.f3849a;
        q70Var.f3856h = charSequence;
        if ((q70Var.f3850b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (q70Var.f3855g) {
                oa0.m2013m(toolbar.getRootView(), charSequence);
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
    public final boolean m2213m(boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0656r3.m2213m(boolean, boolean):boolean");
    }

    @Override // p000.InterfaceC0572ou
    /* JADX INFO: renamed from: n */
    public final boolean mo626n(MenuC0646qu menuC0646qu, MenuItem menuItem) {
        C0619q3 c0619q3;
        Window.Callback callback = this.f4039l.getCallback();
        if (callback != null && !this.f4020Q) {
            MenuC0646qu menuC0646quMo1570k = menuC0646qu.mo1570k();
            C0619q3[] c0619q3Arr = this.f4015L;
            int length = c0619q3Arr != null ? c0619q3Arr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c0619q3 = c0619q3Arr[i];
                    if (c0619q3 != null && c0619q3.f3781h == menuC0646quMo1570k) {
                        break;
                    }
                    i++;
                } else {
                    c0619q3 = null;
                    break;
                }
            }
            if (c0619q3 != null) {
                return callback.onMenuItemSelected(c0619q3.f3774a, menuItem);
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
    public final void m2214o(android.view.Window r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AppCompat has already installed itself into the Window"
            android.view.Window r1 = r7.f4039l
            if (r1 != 0) goto L80
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof p000.WindowCallbackC0434l3
            if (r2 != 0) goto L7a
            l3 r0 = new l3
            r0.<init>(r7, r1)
            r7.f4040m = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.f4038k
            int[] r1 = p000.LayoutInflaterFactory2C0656r3.f4001i0
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            u3 r4 = p000.C0767u3.m2425a()
            monitor-enter(r4)
            d10 r5 = r4.f4623a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r0 = r5.m821d(r0, r3, r6)     // Catch: java.lang.Throwable -> L3c
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
            r7.f4039l = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.f4035f0
            if (r8 != 0) goto L79
            java.lang.Object r0 = r7.f4037j
            if (r8 == 0) goto L61
            android.window.OnBackInvokedCallback r1 = r7.f4036g0
            if (r1 == 0) goto L61
            p000.AbstractC0397k3.m1643c(r8, r1)
            r7.f4036g0 = r2
        L61:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L74
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = p000.AbstractC0397k3.m1641a(r0)
            r7.f4035f0 = r8
            goto L76
        L74:
            r7.f4035f0 = r2
        L76:
            r7.m2212I()
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
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0656r3.m2214o(android.view.Window):void");
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
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0656r3.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX INFO: renamed from: q */
    public final void m2215q(int i, C0619q3 c0619q3, MenuC0646qu menuC0646qu) {
        if (menuC0646qu == null) {
            if (c0619q3 == null && i >= 0) {
                C0619q3[] c0619q3Arr = this.f4015L;
                if (i < c0619q3Arr.length) {
                    c0619q3 = c0619q3Arr[i];
                }
            }
            if (c0619q3 != null) {
                menuC0646qu = c0619q3.f3781h;
            }
        }
        if ((c0619q3 == null || c0619q3.f3786m) && !this.f4020Q) {
            WindowCallbackC0434l3 windowCallbackC0434l3 = this.f4040m;
            Window.Callback callback = this.f4039l.getCallback();
            windowCallbackC0434l3.getClass();
            try {
                windowCallbackC0434l3.f2902d = true;
                callback.onPanelClosed(i, menuC0646qu);
            } finally {
                windowCallbackC0434l3.f2902d = false;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2216r(MenuC0646qu menuC0646qu) {
        C0358j1 c0358j1;
        if (this.f4014K) {
            return;
        }
        this.f4014K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f4045r;
        actionBarOverlayLayout.m143k();
        ActionMenuView actionMenuView = ((q70) actionBarOverlayLayout.f222e).f3849a.f329a;
        if (actionMenuView != null && (c0358j1 = actionMenuView.f248t) != null) {
            c0358j1.m1560f();
            C0208f1 c0208f1 = c0358j1.f2642t;
            if (c0208f1 != null && c0208f1.m1029b()) {
                c0208f1.f1669i.dismiss();
            }
        }
        Window.Callback callback = this.f4039l.getCallback();
        if (callback != null && !this.f4020Q) {
            callback.onPanelClosed(108, menuC0646qu);
        }
        this.f4014K = false;
    }

    /* JADX INFO: renamed from: s */
    public final void m2217s(C0619q3 c0619q3, boolean z) {
        C0582p3 c0582p3;
        InterfaceC0296hf interfaceC0296hf;
        C0358j1 c0358j1;
        if (z && c0619q3.f3774a == 0 && (interfaceC0296hf = this.f4045r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0296hf;
            actionBarOverlayLayout.m143k();
            ActionMenuView actionMenuView = ((q70) actionBarOverlayLayout.f222e).f3849a.f329a;
            if (actionMenuView != null && (c0358j1 = actionMenuView.f248t) != null && c0358j1.m1561j()) {
                m2216r(c0619q3.f3781h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f4038k.getSystemService("window");
        if (windowManager != null && c0619q3.f3786m && (c0582p3 = c0619q3.f3778e) != null) {
            windowManager.removeView(c0582p3);
            if (z) {
                m2215q(c0619q3.f3774a, c0619q3, null);
            }
        }
        c0619q3.f3784k = false;
        c0619q3.f3785l = false;
        c0619q3.f3786m = false;
        c0619q3.f3779f = null;
        c0619q3.f3787n = true;
        if (this.f4016M == c0619q3) {
            this.f4016M = null;
        }
        if (c0619q3.f3774a == 0) {
            m2212I();
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
    public final boolean m2218u(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.LayoutInflaterFactory2C0656r3.m2218u(android.view.KeyEvent):boolean");
    }

    /* JADX INFO: renamed from: v */
    public final void m2219v(int i) {
        C0619q3 c0619q3M2223z = m2223z(i);
        if (c0619q3M2223z.f3781h != null) {
            Bundle bundle = new Bundle();
            c0619q3M2223z.f3781h.m2176t(bundle);
            if (bundle.size() > 0) {
                c0619q3M2223z.f3789p = bundle;
            }
            c0619q3M2223z.f3781h.m2179w();
            c0619q3M2223z.f3781h.clear();
        }
        c0619q3M2223z.f3788o = true;
        c0619q3M2223z.f3787n = true;
        if ((i == 108 || i == 0) && this.f4045r != null) {
            C0619q3 c0619q3M2223z2 = m2223z(0);
            c0619q3M2223z2.f3784k = false;
            m2210G(c0619q3M2223z2, null);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2220w() {
        ViewGroup viewGroup;
        if (this.f4053z) {
            return;
        }
        Context context = this.f4038k;
        int[] iArr = AbstractC0205ez.f1686j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        int i = 0;
        int i2 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo961g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo961g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo961g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo961g(10);
        }
        this.f4012I = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m2221x();
        this.f4039l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f4013J) {
            viewGroup = this.f4011H ? (ViewGroup) layoutInflaterFrom.inflate(com.ljx.wechatmod.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.ljx.wechatmod.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f4012I) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.ljx.wechatmod.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f4010G = false;
            this.f4009F = false;
        } else if (this.f4009F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.ljx.wechatmod.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0777ud(context, typedValue.resourceId) : context).inflate(com.ljx.wechatmod.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0296hf interfaceC0296hf = (InterfaceC0296hf) viewGroup.findViewById(com.ljx.wechatmod.R.id.decor_content_parent);
            this.f4045r = interfaceC0296hf;
            interfaceC0296hf.setWindowCallback(this.f4039l.getCallback());
            if (this.f4010G) {
                ((ActionBarOverlayLayout) this.f4045r).m142j(109);
            }
            if (this.f4007D) {
                ((ActionBarOverlayLayout) this.f4045r).m142j(2);
            }
            if (this.f4008E) {
                ((ActionBarOverlayLayout) this.f4045r).m142j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f4009F + ", windowActionBarOverlay: " + this.f4010G + ", android:windowIsFloating: " + this.f4012I + ", windowActionModeOverlay: " + this.f4011H + ", windowNoTitle: " + this.f4013J + " }");
        }
        C0247g3 c0247g3 = new C0247g3(this, i);
        WeakHashMap weakHashMap = oa0.f3426a;
        da0.m903u(viewGroup, c0247g3);
        if (this.f4045r == null) {
            this.f4005B = (TextView) viewGroup.findViewById(com.ljx.wechatmod.R.id.title);
        }
        Method method = hb0.f2214a;
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
        ViewGroup viewGroup2 = (ViewGroup) this.f4039l.findViewById(R.id.content);
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
        this.f4039l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C0247g3(this, i2));
        this.f4004A = viewGroup;
        Object obj = this.f4037j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f4044q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0296hf interfaceC0296hf2 = this.f4045r;
            if (interfaceC0296hf2 != null) {
                interfaceC0296hf2.setWindowTitle(title);
            } else {
                dc0 dc0Var = this.f4042o;
                if (dc0Var != null) {
                    q70 q70Var = (q70) dc0Var.f1384z;
                    if (!q70Var.f3855g) {
                        Toolbar toolbar = q70Var.f3849a;
                        q70Var.f3856h = title;
                        if ((q70Var.f3850b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (q70Var.f3855g) {
                                oa0.m2013m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f4005B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f4004A.findViewById(R.id.content);
        View decorView = this.f4039l.getDecorView();
        contentFrameLayout2.f265g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap weakHashMap2 = oa0.f3426a;
        if (aa0.m40c(contentFrameLayout2)) {
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
        this.f4053z = true;
        C0619q3 c0619q3M2223z = m2223z(0);
        if (this.f4020Q || c0619q3M2223z.f3781h != null) {
            return;
        }
        m2205B(108);
    }

    /* JADX INFO: renamed from: x */
    public final void m2221x() {
        if (this.f4039l == null) {
            Object obj = this.f4037j;
            if (obj instanceof Activity) {
                m2214o(((Activity) obj).getWindow());
            }
        }
        if (this.f4039l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC0545o3 m2222y(Context context) {
        if (this.f4026W == null) {
            if (C0658r5.f4062g == null) {
                Context applicationContext = context.getApplicationContext();
                C0658r5.f4062g = new C0658r5(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f4026W = new C0471m3(this, C0658r5.f4062g);
        }
        return this.f4026W;
    }

    /* JADX INFO: renamed from: z */
    public final C0619q3 m2223z(int i) {
        C0619q3[] c0619q3Arr = this.f4015L;
        if (c0619q3Arr == null || c0619q3Arr.length <= i) {
            C0619q3[] c0619q3Arr2 = new C0619q3[i + 1];
            if (c0619q3Arr != null) {
                System.arraycopy(c0619q3Arr, 0, c0619q3Arr2, 0, c0619q3Arr.length);
            }
            this.f4015L = c0619q3Arr2;
            c0619q3Arr = c0619q3Arr2;
        }
        C0619q3 c0619q3 = c0619q3Arr[i];
        if (c0619q3 != null) {
            return c0619q3;
        }
        C0619q3 c0619q32 = new C0619q3();
        c0619q32.f3774a = i;
        c0619q32.f3787n = false;
        c0619q3Arr[i] = c0619q32;
        return c0619q32;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
