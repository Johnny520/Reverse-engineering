package defpackage;

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
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ExpandedMenuView;
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

/* JADX INFO: loaded from: classes.dex */
public final class r3 extends e3 implements iu, LayoutInflater.Factory2 {
    public static final u30 h0 = null;
    public static final int[] i0 = null;
    public static final boolean j0 = false;
    public static final boolean k0 = false;
    public ViewGroup A;
    public TextView B;
    public View C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public q3[] L;
    public q3 M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Configuration R;
    public final int S;
    public int T;
    public int U;
    public boolean V;
    public m3 W;
    public m3 X;
    public boolean Y;
    public int Z;
    public final f3 a0;
    public boolean b0;
    public Rect c0;
    public Rect d0;
    public q5 e0;
    public OnBackInvokedDispatcher f0;
    public OnBackInvokedCallback g0;
    public final Object j;
    public final Context k;
    public Window l;
    public l3 m;
    public final Object n;
    public yb0 o;
    public k50 p;
    public CharSequence q;
    public gf r;
    public g3 s;
    public g3 t;
    public n1 u;
    public ActionBarContextView v;
    public PopupWindow w;
    public f3 x;
    public wa0 y;
    public boolean z;

    static {
        h0 = new u30();
        i0 = new int[]{R.attr.windowBackground};
        j0 = !"robolectric".equals(Build.FINGERPRINT);
        k0 = true;
    }

    public r3(Context r5, Window r6, x2 r7, Object r8) {
        this.y = null;
        this.S = -100;
        this.a0 = new f3(this, 0);
        this.k = r5;
        this.n = r7;
        this.j = r8;
        if ((r8 instanceof Dialog) == false) goto L15;
    L4:
        if (r5 == null) goto L11;
        if ((r5 instanceof AppCompatActivity) == true) goto L7;
        if ((r5 instanceof ContextWrapper) == false) goto L11;
        r5 = ((ContextWrapper) r5).getBaseContext();
        goto L4
    L7:
        AppCompatActivity r52 = (AppCompatActivity) r5;
    L12:
        if (r52 == null) goto L15;
        this.S = ((r3) r52.l()).S;
    L11:
        r52 = null;
    L15:
        if (this.S != (-100)) goto L19;
        String r53 = this.j.getClass().getName();
        u30 r72 = h0;
        Integer r54 = (Integer) r72.getOrDefault(r53, null);
        if (r54 == null) goto L19;
        this.S = r54.intValue();
        r72.remove(this.j.getClass().getName());
    L19:
        if (r6 == null) goto L21;
        o(r6);
    L21:
        u3.d();
    }

    public static sr p(Context r5) {
        if (Build.VERSION.SDK_INT >= 33) goto L30;
        sr r0 = e3.c;
        if (r0 != null) goto L9;
        return null;
    L9:
        tr r02 = r0.a;
        sr r52 = i3.b(r5.getApplicationContext().getResources().getConfiguration());
        if (r02.a.isEmpty() == false) goto L12;
        sr r03 = sr.b;
    L24:
        if (r03.a.a.isEmpty() == false) goto L26;
        return r52;
    L26:
        return r03;
    L12:
        LinkedHashSet r1 = new LinkedHashSet();
        int r2 = 0;
    L13:
        int r3 = r02.a.size();
        if (r2 >= (r52.a.a.size() + r3)) goto L22;
        if (r2 >= r02.a.size()) goto L18;
        Locale r32 = r02.a.get(r2);
    L19:
        if (r32 == null) goto L21;
        r1.add(r32);
    L21:
        r2 = r2 + 1;
        goto L13
    L18:
        int r33 = r2 - r02.a.size();
        r32 = r52.a.a.get(r33);
        goto L19
    L22:
        r03 = new sr(new tr(rr.a((Locale[]) r1.toArray(new Locale[r1.size()]))));
        goto L24
    L30:
        return null;
    }

    public static Configuration t(Context r1, int r2, sr r3, Configuration r4, boolean r5) {
        if (r2 != 1) goto L5;
        int r12 = 16;
    L11:
        Configuration r22 = new Configuration();
        r22.fontScale = 0.0f;
        if (r4 == null) goto L14;
        r22.setTo(r4);
    L14:
        r22.uiMode = r12 | (r22.uiMode & (-49));
        if (r3 == null) goto L17;
        i3.d(r22, r3);
    L17:
        return r22;
    L5:
        if (r2 == 2) goto L9;
        if (r5 == false) goto L8;
        r12 = 0;
        goto L11
    L8:
        r12 = r1.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        goto L11
    L9:
        r12 = 32;
        goto L11
    }

    public final void A() {
        w();
        if (this.F == true) goto L5;
        return;
    L5:
        if (this.o != null) goto L19;
        Object r0 = this.j;
        if ((r0 instanceof Activity) == false) goto L11;
        this.o = new yb0((Activity) r0, this.G);
    L13:
        yb0 r02 = this.o;
        if (r02 == null) goto L18;
        r02.N(this.b0);
        return;
    L18:
        return;
    L11:
        if ((r0 instanceof Dialog) == false) goto L13;
        this.o = new yb0((Dialog) r0);
        goto L13
    }

    public final void B(int r3) {
        int r32 = 1 << r3;
        this.Z = r32 | this.Z;
        if (this.Y == true) goto L6;
        View r33 = this.l.getDecorView();
        WeakHashMap r0 = ja0.a;
        s90.m(r33, this.a0);
        this.Y = true;
        return;
    }

    public final int C(Context r3, int r4) {
        if (r4 == (-100)) goto L25;
        if (r4 == (-1)) goto L24;
        if (r4 == 0) goto L20;
        if (r4 == 1) goto L24;
        if (r4 == 2) goto L24;
        if (r4 != 3) goto L18;
        if (this.X != null) goto L16;
        this.X = new m3(this, r3);
    L16:
        return this.X.f();
    L18:
        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
    L20:
        if (((UiModeManager) r3.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) goto L25;
        return y(r3).f();
    L24:
        return r4;
    L25:
        return -1;
    }

    public final boolean D() {
        boolean r0 = this.N;
        this.N = false;
        q3 r2 = z(0);
        if (r2.m == false) goto L7;
        if (r0 == true) goto L25;
        s(r2, true);
        return true;
    L25:
        return true;
    L7:
        n1 r02 = this.u;
        if (r02 == null) goto L11;
        r02.a();
        return true;
    L11:
        A();
        yb0 r03 = this.o;
        if (r03 == null) goto L26;
        hf r04 = r03.A;
        if (r04 == null) goto L26;
        f70 r22 = ((k70) r04).a.L;
        if (r22 == null) goto L26;
        if (r22.b == null) goto L26;
        f70 r05 = ((k70) r04).a.L;
        if (r05 != null) goto L22;
        ou r06 = null;
    L23:
        if (r06 == null) goto L25;
        r06.collapseActionView();
        goto L25
    L22:
        r06 = r05.b;
    L26:
        return false;
    }

    public final void E(q3 r18, KeyEvent r19) {
        boolean r2 = r18.m;
        int r3 = r18.a;
        if (r2 == false) goto L5;
        return;
    L5:
        if (this.Q == true) goto L106;
        Context r22 = this.k;
        if (r3 == 0) goto L10;
    L12:
        Window.Callback r4 = this.l.getCallback();
        if (r4 != null) goto L15;
    L18:
        WindowManager r42 = (WindowManager) r22.getSystemService("window");
        if (r42 != null) goto L22;
        return;
    L22:
        if (G(r18, r19) == false) goto L109;
        p3 r6 = r18.e;
        if (r6 != null) goto L27;
    L36:
        if (r6 != null) goto L53;
        A();
        yb0 r62 = this.o;
        if (r62 == null) goto L40;
        Context r63 = r62.L();
    L41:
        if (r63 == null) goto L44;
        r22 = r63;
    L44:
        TypedValue r64 = new TypedValue();
        Resources.Theme r9 = r22.getResources().newTheme();
        r9.setTo(r22.getTheme());
        r9.resolveAttribute(com.ljx.wechatmod.R.attr.actionBarPopupTheme, r64, true);
        int r10 = r64.resourceId;
        if (r10 == 0) goto L47;
        r9.applyStyle(r10, true);
    L47:
        r9.resolveAttribute(com.ljx.wechatmod.R.attr.panelMenuListTheme, r64, true);
        int r65 = r64.resourceId;
        if (r65 == 0) goto L50;
        r9.applyStyle(r65, true);
    L51:
        kd r66 = new kd(r22, 0);
        r66.getTheme().setTo(r9);
        r18.j = r66;
        TypedArray r23 = r66.obtainStyledAttributes(xy.j);
        r18.b = r23.getResourceId(86, 0);
        r18.d = r23.getResourceId(1, 0);
        r23.recycle();
        r18.e = new p3(this, r18.j);
        r18.c = 81;
    L57:
        View r24 = r18.g;
        if (r24 == null) goto L61;
        r18.f = r24;
    L78:
        if (r18.f != null) goto L81;
    L102:
        r18.n = true;
        return;
    L81:
        if (r18.g != null) goto L88;
        dr r25 = r18.i;
        if (r25.f != null) goto L87;
        r25.f = new cr(r25);
    L87:
        if (r25.f.getCount() <= 0) goto L102;
    L88:
        ViewGroup.LayoutParams r26 = r18.f.getLayoutParams();
        if (r26 != null) goto L91;
        r26 = new ViewGroup.LayoutParams(-2, -2);
    L91:
        r18.e.setBackgroundResource(r18.b);
        ViewParent r67 = r18.f.getParent();
        if ((r67 instanceof ViewGroup) == false) goto L94;
        ((ViewGroup) r67).removeView(r18.f);
    L94:
        r18.e.addView(r18.f, r26);
        if (r18.f.hasFocus() == true) goto L97;
        r18.f.requestFocus();
    L97:
        int r102 = -2;
    L98:
        r18.l = false;
        WindowManager.LayoutParams r92 = new WindowManager.LayoutParams(r102, -2, 0, 0, 1002, 8519680, -3);
        r92.gravity = r18.c;
        r92.windowAnimations = r18.d;
        r42.addView(r18.e, r92);
        r18.m = true;
        if (r3 != 0) goto L105;
        I();
        return;
    L105:
        return;
    L61:
        if (r18.h == null) goto L102;
        if (this.t != null) goto L66;
        this.t = new g3(this, 3);
    L66:
        g3 r27 = this.t;
        if (r18.i != null) goto L69;
        dr r68 = new dr(r18.j);
        r18.i = r68;
        r68.e = r27;
        ku r28 = r18.h;
        r28.b(r68, r28.a);
    L69:
        dr r29 = r18.i;
        p3 r69 = r18.e;
        if (r29.d != null) goto L75;
        r29.d = (ExpandedMenuView) r29.b.inflate(com.ljx.wechatmod.R.layout.abc_expanded_menu_layout, r69, false);
        if (r29.f != null) goto L74;
        r29.f = new cr(r29);
    L74:
        r29.d.setAdapter(r29.f);
        r29.d.setOnItemClickListener(r29);
    L75:
        ExpandedMenuView r210 = r29.d;
        r18.f = r210;
        if (r210 == null) goto L102;
    L50:
        r9.applyStyle(com.ljx.wechatmod.R.style.Theme_AppCompat_CompactMenu, true);
        goto L51
    L40:
        r63 = null;
        goto L41
    L53:
        if (r18.n == false) goto L57;
        if (r6.getChildCount() <= 0) goto L57;
        r18.e.removeAllViews();
        goto L57
    L27:
        if (r18.n == true) goto L36;
        View r211 = r18.g;
        if (r211 == null) goto L97;
        ViewGroup.LayoutParams r212 = r211.getLayoutParams();
        if (r212 == null) goto L97;
        if (r212.width != (-1)) goto L97;
        r102 = -1;
        goto L98
    L109:
        return;
    L15:
        if (r4.onMenuOpened(r3, r18.h) == true) goto L18;
        s(r18, true);
        return;
    L10:
        if ((r22.getResources().getConfiguration().screenLayout & 15) != 4) goto L12;
        return;
    }

    public final boolean F(q3 r3, int r4, KeyEvent r5) {
        if (r5.isSystem() == false) goto L6;
        return false;
    L6:
        if (r3.k == false) goto L8;
    L9:
        ku r32 = r3.h;
        if (r32 != null) goto L12;
        return false;
    L12:
        return r32.performShortcut(r4, r5, 1);
    L8:
        if (G(r3, r5) == true) goto L9;
        return false;
    }

    public final boolean G(q3 r13, KeyEvent r14) {
        if (this.Q == true) goto L78;
        boolean r0 = r13.k;
        int r2 = r13.a;
        if (r0 == false) goto L8;
        return true;
    L8:
        q3 r02 = this.M;
        if (r02 == null) goto L12;
        if (r02 == r13) goto L12;
        s(r02, false);
    L12:
        Window.Callback r03 = this.l.getCallback();
        if (r03 == null) goto L16;
        r13.g = r03.onCreatePanelView(r2);
    L16:
        if (r2 == 0) goto L20;
        if (r2 == 108) goto L20;
        boolean r5 = false;
    L21:
        if (r5 == false) goto L26;
        gf r6 = this.r;
        if (r6 == null) goto L26;
        ActionBarOverlayLayout r62 = (ActionBarOverlayLayout) r6;
        r62.k();
        ((k70) r62.e).l = true;
    L26:
        if (r13.g != null) goto L99;
        ku r63 = r13.h;
        if (r63 != null) goto L30;
    L31:
        if (r63 != null) goto L59;
        Context r64 = this.k;
        if (r2 == 0) goto L36;
        if (r2 == 108) goto L36;
    L48:
        ku r4 = new ku(r64);
        r4.e = this;
        ku r65 = r13.h;
        if (r4 == r65) goto L57;
        if (r65 == null) goto L53;
        r65.r(r13.i);
    L53:
        r13.h = r4;
        dr r66 = r13.i;
        if (r66 == null) goto L57;
        r4.b(r66, r4.a);
    L57:
        if (r13.h != null) goto L59;
    L36:
        if (this.r == null) goto L48;
        TypedValue r42 = new TypedValue();
        Resources.Theme r8 = r64.getTheme();
        r8.resolveAttribute(com.ljx.wechatmod.R.attr.actionBarTheme, r42, true);
        if (r42.resourceId == 0) goto L40;
        Resources.Theme r9 = r64.getResources().newTheme();
        r9.setTo(r8);
        r9.applyStyle(r42.resourceId, true);
        r9.resolveAttribute(com.ljx.wechatmod.R.attr.actionBarWidgetTheme, r42, true);
    L42:
        if (r42.resourceId == 0) goto L46;
        if (r9 != null) goto L45;
        r9 = r64.getResources().newTheme();
        r9.setTo(r8);
    L45:
        r9.applyStyle(r42.resourceId, true);
    L46:
        if (r9 == null) goto L48;
        kd r43 = new kd(r64, 0);
        r43.getTheme().setTo(r9);
        r64 = r43;
        goto L48
    L40:
        r8.resolveAttribute(com.ljx.wechatmod.R.attr.actionBarWidgetTheme, r42, true);
        r9 = null;
    L59:
        if (r5 == false) goto L66;
        gf r44 = this.r;
        if (r44 == null) goto L66;
        if (this.s != null) goto L65;
        this.s = new g3(this, 2);
    L65:
        ((ActionBarOverlayLayout) r44).l(r13.h, this.s);
    L66:
        r13.h.w();
        if (r03.onCreatePanelMenu(r2, r13.h) == true) goto L79;
        ku r142 = r13.h;
        if (r142 == null) goto L74;
        if (r142 == null) goto L73;
        r142.r(r13.i);
    L73:
        r13.h = null;
    L74:
        if (r5 == false) goto L78;
        gf r132 = this.r;
        if (r132 == null) goto L78;
        ((ActionBarOverlayLayout) r132).l(null, this.s);
        goto L78
    L79:
        r13.o = false;
    L80:
        r13.h.w();
        Bundle r22 = r13.p;
        if (r22 == null) goto L84;
        r13.h.s(r22);
        r13.p = null;
    L84:
        if (r03.onPreparePanel(0, r13.g, r13.h) == true) goto L91;
        if (r5 == false) goto L89;
        gf r143 = this.r;
        if (r143 == null) goto L89;
        ((ActionBarOverlayLayout) r143).l(null, this.s);
    L89:
        r13.h.v();
        return false;
    L91:
        if (r14 == null) goto L93;
        int r144 = r14.getDeviceId();
    L95:
        if (KeyCharacterMap.load(r144).getKeyboardType() == 1) goto L97;
        boolean r145 = true;
    L98:
        r13.h.setQwertyMode(r145);
        r13.h.v();
        goto L99
    L97:
        r145 = false;
        goto L98
    L93:
        r144 = -1;
        goto L95
    L30:
        if (r13.o == false) goto L80;
    L99:
        r13.k = true;
        r13.l = false;
        this.M = r13;
        return true;
    L20:
        r5 = true;
    L78:
        return false;
    }

    public final void H() {
        if (this.z == true) goto L6;
        return;
    L6:
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final void I() {
        if (Build.VERSION.SDK_INT < 33) goto L23;
        boolean r1 = false;
        if (this.f0 != null) goto L8;
    L13:
        if (r1 == true) goto L15;
    L18:
        if (r1 == true) goto L24;
        OnBackInvokedCallback r0 = this.g0;
        if (r0 == null) goto L25;
        k3.c(this.f0, r0);
        return;
    L25:
        return;
    L24:
        return;
    L15:
        if (this.g0 != null) goto L18;
        this.g0 = k3.b(this.f0, this);
        return;
    L8:
        if (z(0).m == false) goto L11;
    L9:
        r1 = true;
        goto L13
    L11:
        if (this.u == null) goto L13;
    }

    @Override // defpackage.e3
    public final void a() {
        LayoutInflater r0 = LayoutInflater.from(this.k);
        if (r0.getFactory() != null) goto L7;
        r0.setFactory2(this);
        return;
    L7:
        if ((r0.getFactory2() instanceof r3) == true) goto L10;
        Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        return;
    }

    @Override // defpackage.e3
    public final void b() {
        if (this.o == null) goto L6;
        A();
        this.o.getClass();
        B(0);
        return;
    }

    @Override // defpackage.e3
    public final void d() {
        this.O = true;
        m(false, true);
        x();
        Object r1 = this.j;
        if ((r1 instanceof Activity) == true) goto L26;
    L24:
        this.R = new Configuration(this.k.getResources().getConfiguration());
        this.P = true;
        return;
    L26:
        Activity r12 = (Activity) r1;     // Catch: IllegalArgumentException -> L10
        String r13 = zt.t(r12, r12.getComponentName());     // Catch: PackageManager.NameNotFoundException -> L7 IllegalArgumentException -> L10
    L11:
        if (r13 == null) goto L16;
        yb0 r14 = this.o;
        if (r14 != null) goto L15;
        this.b0 = true;
        goto L16
    L15:
        r14.N(true);
    L16:
        Object r15 = e3.h;
        monitor-enter(r15);
        e3.f(this);     // Catch: Throwable -> L21
        e3.g.add(new WeakReference(this));     // Catch: Throwable -> L21
        monitor-exit(r15);     // Catch: Throwable -> L21
    L21:
        th = move-exception;
        throw th;
    L7:
        e = move-exception;
        throw new IllegalArgumentException(e);     // Catch: IllegalArgumentException -> L10
    L10:
        r13 = null;
        goto L11
    }

    @Override // defpackage.e3
    public final void e() {
        if ((this.j instanceof Activity) == false) goto L13;
        Object r0 = e3.h;
        monitor-enter(r0);
        e3.f(this);     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    L13:
        if (this.Y == false) goto L15;
        this.l.getDecorView().removeCallbacks(this.a0);
    L15:
        this.Q = true;
        if (this.S == (-100)) goto L22;
        Object r02 = this.j;
        if ((r02 instanceof Activity) == false) goto L22;
        if (((Activity) r02).isChangingConfigurations() == false) goto L22;
        h0.put(this.j.getClass().getName(), Integer.valueOf(this.S));
    L23:
        m3 r03 = this.W;
        if (r03 == null) goto L26;
        r03.c();
    L26:
        m3 r04 = this.X;
        if (r04 == null) goto L32;
        r04.c();
        return;
    L32:
        return;
    L22:
        h0.remove(this.j.getClass().getName());
        goto L23
    }

    @Override // defpackage.e3
    public final boolean g(int r6) {
        if (r6 != 8) goto L6;
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
        r6 = 108;
    L9:
        if (this.J == false) goto L13;
        if (r6 != 108) goto L13;
        return false;
    L13:
        if (this.F == false) goto L16;
        if (r6 != 1) goto L16;
        this.F = false;
    L16:
        if (r6 != 1) goto L18;
        H();
        this.J = true;
        return true;
    L18:
        if (r6 != 2) goto L20;
        H();
        this.D = true;
        return true;
    L20:
        if (r6 != 5) goto L22;
        H();
        this.E = true;
        return true;
    L22:
        if (r6 == 10) goto L31;
        if (r6 == 108) goto L29;
        if (r6 != 109) goto L26;
        H();
        this.G = true;
        return true;
    L26:
        return this.l.requestFeature(r6);
    L29:
        H();
        this.F = true;
        return true;
    L31:
        H();
        this.H = true;
        return true;
    L6:
        if (r6 != 9) goto L9;
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        r6 = 109;
        goto L9
    }

    @Override // defpackage.e3
    public final void h(int r3) {
        w();
        ViewGroup r0 = (ViewGroup) this.A.findViewById(R.id.content);
        r0.removeAllViews();
        LayoutInflater.from(this.k).inflate(r3, r0);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.e3
    public final void i(View r3) {
        w();
        ViewGroup r0 = (ViewGroup) this.A.findViewById(R.id.content);
        r0.removeAllViews();
        r0.addView(r3);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.e3
    public final void j(View r3, ViewGroup.LayoutParams r4) {
        w();
        ViewGroup r0 = (ViewGroup) this.A.findViewById(R.id.content);
        r0.removeAllViews();
        r0.addView(r3, r4);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.iu
    public final void k(ku r6) {
        gf r62 = this.r;
        if (r62 == null) goto L55;
        ActionBarOverlayLayout r63 = (ActionBarOverlayLayout) r62;
        r63.k();
        Toolbar r64 = ((k70) r63.e).a;
        if (r64.getVisibility() != 0) goto L55;
        ActionMenuView r65 = r64.a;
        if (r65 == null) goto L55;
        if (r65.s == false) goto L55;
        if (ViewConfiguration.get(this.k).hasPermanentMenuKey() == false) goto L20;
        ActionBarOverlayLayout r66 = (ActionBarOverlayLayout) this.r;
        r66.k();
        ActionMenuView r67 = ((k70) r66.e).a.a;
        if (r67 == null) goto L55;
        j1 r68 = r67.t;
        if (r68 == null) goto L55;
        if (r68.u != null) goto L20;
        if (r68.j() == false) goto L55;
    L20:
        Window.Callback r69 = this.l.getCallback();
        ActionBarOverlayLayout r2 = (ActionBarOverlayLayout) this.r;
        r2.k();
        ActionMenuView r22 = ((k70) r2.e).a.a;
        if (r22 == null) goto L35;
        j1 r23 = r22.t;
        if (r23 == null) goto L35;
        if (r23.j() == false) goto L35;
        ActionBarOverlayLayout r0 = (ActionBarOverlayLayout) this.r;
        r0.k();
        ActionMenuView r02 = ((k70) r0.e).a.a;
        if (r02 == null) goto L32;
        j1 r03 = r02.t;
        if (r03 == null) goto L32;
        r03.f();
    L32:
        if (this.Q == true) goto L57;
        r69.onPanelClosed(108, z(0).h);
        return;
    L57:
        return;
    L35:
        if (r69 != null) goto L37;
        return;
    L37:
        if (this.Q == false) goto L39;
        return;
    L39:
        if (this.Y == true) goto L41;
    L43:
        q3 r04 = z(0);
        ku r24 = r04.h;
        if (r24 != null) goto L46;
        return;
    L46:
        if (r04.o == false) goto L48;
        return;
    L48:
        if (r69.onPreparePanel(0, r04.g, r24) == false) goto L62;
        r69.onMenuOpened(108, r04.h);
        ActionBarOverlayLayout r610 = (ActionBarOverlayLayout) this.r;
        r610.k();
        ActionMenuView r611 = ((k70) r610.e).a.a;
        if (r611 == null) goto L63;
        j1 r612 = r611.t;
        if (r612 == null) goto L64;
        r612.l();
        return;
    L64:
        return;
    L63:
        return;
    L62:
        return;
    L41:
        if ((1 & this.Z) == 0) goto L43;
        View r05 = this.l.getDecorView();
        f3 r25 = this.a0;
        r05.removeCallbacks(r25);
        r25.run();
    L55:
        q3 r613 = z(0);
        r613.n = true;
        s(r613, false);
        E(r613, null);
    }

    @Override // defpackage.e3
    public final void l(CharSequence r4) {
        this.q = r4;
        gf r0 = this.r;
        if (r0 == null) goto L6;
        r0.setWindowTitle(r4);
        return;
    L6:
        yb0 r02 = this.o;
        if (r02 == null) goto L16;
        k70 r03 = (k70) r02.A;
        if (r03.g == true) goto L20;
        Toolbar r1 = r03.a;
        r03.h = r4;
        if ((r03.b & 8) == 0) goto L21;
        r1.setTitle(r4);
        if (r03.g == false) goto L22;
        ja0.m(r1.getRootView(), r4);
        return;
    L22:
        return;
    L21:
        return;
    L20:
        return;
    L16:
        TextView r04 = this.B;
        if (r04 == null) goto L23;
        r04.setText(r4);
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m(boolean r13, boolean r14) {
        boolean r1 = false;
        if (this.Q == false) goto L5;
        return false;
    L5:
        int r2 = this.S;
        if (r2 != (-100)) goto L9;
        r2 = e3.b;
    L9:
        Context r0 = this.k;
        int r3 = C(r0, r2);
        int r4 = Build.VERSION.SDK_INT;
        if (r4 >= 33) goto L12;
        sr r5 = p(r0);
    L13:
        if (r14 == true) goto L16;
        if (r5 == null) goto L16;
        r5 = i3.b(r0.getResources().getConfiguration());
    L16:
        Configuration r142 = t(r0, r3, r5, null, false);
        boolean r32 = this.V;
        boolean r7 = true;
        Object r8 = this.j;
        if (r32 == false) goto L19;
    L33:
        this.V = true;
        int r33 = this.U;
    L34:
        Configuration r42 = this.R;
        if (r42 != null) goto L37;
        r42 = r0.getResources().getConfiguration();
    L37:
        int r9 = r42.uiMode & 48;
        int r10 = r142.uiMode & 48;
        sr r43 = i3.b(r42);
        if (r5 != null) goto L40;
        sr r143 = null;
    L41:
        if (r9 == r10) goto L43;
        int r52 = 512;
    L44:
        if (r143 == null) goto L49;
        if (r43.equals(r143) == true) goto L49;
        r52 = r52 | 8196;
    L49:
        if (((~r33) & r52) == 0) goto L66;
        if (r13 == false) goto L66;
        if (this.O == false) goto L66;
        if (j0 == true) goto L58;
        if (this.P == false) goto L66;
    L58:
        if ((r8 instanceof Activity) == false) goto L66;
        Activity r132 = (Activity) r8;
        if (r132.isChild() == true) goto L66;
        if (Build.VERSION.SDK_INT < 28) goto L64;
        r132.recreate();
    L65:
        boolean r133 = true;
    L67:
        if (r133 == true) goto L91;
        if (r52 == 0) goto L91;
        if ((r52 & r33) != r52) goto L72;
        r1 = true;
    L72:
        Resources r134 = r0.getResources();
        Configuration r34 = new Configuration(r134.getConfiguration());
        r34.uiMode = (r134.getConfiguration().uiMode & (-49)) | r10;
        if (r143 == null) goto L75;
        i3.d(r34, r143);
    L75:
        r134.updateConfiguration(r34, null);
        int r135 = this.T;
        if (r135 == 0) goto L78;
        r0.setTheme(r135);
        r0.getTheme().applyStyle(this.T, true);
    L78:
        if (r1 == true) goto L80;
    L92:
        if (r7 == false) goto L95;
        if (r143 == null) goto L95;
        i3.c(i3.b(r0.getResources().getConfiguration()));
    L95:
        if (r2 != 0) goto L97;
        y(r0).i();
    L101:
        if (r2 == 3) goto L103;
        m3 r136 = this.X;
        if (r136 == null) goto L109;
        r136.c();
    L109:
        return r7;
    L103:
        if (this.X != null) goto L105;
        this.X = new m3(this, r0);
    L105:
        this.X.i();
        goto L109
    L97:
        m3 r137 = this.W;
        if (r137 == null) goto L101;
        r137.c();
        goto L101
    L80:
        if ((r8 instanceof Activity) == false) goto L92;
        Activity r82 = (Activity) r8;
        if ((r82 instanceof oq) == false) goto L87;
        if (((oq) r82).e().c.compareTo(jq.c) < 0) goto L92;
        r82.onConfigurationChanged(r34);
        goto L92
    L87:
        if (this.P == false) goto L92;
        if (this.Q == true) goto L92;
        r82.onConfigurationChanged(r34);
    L91:
        r7 = r133;
        goto L92
    L64:
        new Handler(r132.getMainLooper()).post(new p1(0, r132));
    L66:
        r133 = false;
        goto L67
    L43:
        r52 = 0;
        goto L44
    L40:
        r143 = i3.b(r142);
        goto L41
    L19:
        if ((r8 instanceof Activity) == false) goto L33;
        PackageManager r35 = r0.getPackageManager();
        if (r35 != null) goto L24;
        r33 = 0;
        goto L34
    L24:
        if (r4 < 29) goto L26;
        int r44 = 269221888;
    L110:
        ActivityInfo r36 = r35.getActivityInfo(new ComponentName(r0, r8.getClass()), r44);     // Catch: PackageManager.NameNotFoundException -> L31
        if (r36 == null) goto L33;
        this.U = r36.configChanges;     // Catch: PackageManager.NameNotFoundException -> L31
    L31:
        e = move-exception;
        Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
        this.U = 0;
        goto L33
    L26:
        r44 = 786432;
        goto L110
    L12:
        r5 = null;
        goto L13
    }

    @Override // defpackage.iu
    public final boolean n(ku r8, MenuItem r9) {
        Window.Callback r0 = this.l.getCallback();
        if (r0 != null) goto L5;
    L22:
        return false;
    L5:
        if (this.Q == true) goto L22;
        ku r82 = r8.k();
        q3[] r2 = this.L;
        if (r2 == null) goto L9;
        int r3 = r2.length;
    L10:
        int r4 = 0;
    L11:
        if (r4 >= r3) goto L18;
        q3 r5 = r2[r4];
        if (r5 == null) goto L17;
        if (r5.h != r82) goto L17;
    L19:
        if (r5 == null) goto L22;
        return r0.onMenuItemSelected(r5.a, r9);
    L17:
        r4 = r4 + 1;
        goto L11
    L18:
        r5 = null;
        goto L19
    L9:
        r3 = 0;
        goto L10
    }

    public final void o(Window r8) {
        if (this.l != null) goto L41;
        Window.Callback r1 = r8.getCallback();
        if ((r1 instanceof l3) == true) goto L39;
        l3 r0 = new l3(this, r1);
        this.m = r0;
        r8.setCallback(r0);
        Context r02 = this.k;
        TypedArray r12 = r02.obtainStyledAttributes(null, i0);
        if (r12.hasValue(0) == false) goto L18;
        int r3 = r12.getResourceId(0, 0);
        if (r3 == 0) goto L18;
        u3 r4 = u3.a();
        monitor-enter(r4);
        Drawable r03 = r4.a.d(r02, r3, true);     // Catch: Throwable -> L15
        monitor-exit(r4);
    L19:
        if (r03 == null) goto L21;
        r8.setBackgroundDrawable(r03);
    L21:
        r12.recycle();
        this.l = r8;
        if (Build.VERSION.SDK_INT < 33) goto L44;
        OnBackInvokedDispatcher r82 = this.f0;
        if (r82 != null) goto L45;
        Object r04 = this.j;
        if (r82 == null) goto L31;
        OnBackInvokedCallback r13 = this.g0;
        if (r13 == null) goto L31;
        k3.c(r82, r13);
        this.g0 = null;
    L31:
        if ((r04 instanceof Activity) == false) goto L35;
        Activity r05 = (Activity) r04;
        if (r05.getWindow() == null) goto L35;
        this.f0 = k3.a(r05);
    L36:
        I();
        return;
    L35:
        this.f0 = null;
        goto L36
    L45:
        return;
    L44:
        return;
    L15:
        th = move-exception;
        throw th;
    L18:
        r03 = null;
        goto L19
    L39:
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    L41:
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View r9, String r10, Context r11, AttributeSet r12) {
        View r1 = null;
        if (this.e0 != null) goto L11;
        int[] r92 = xy.j;
        Context r0 = this.k;
        String r93 = r0.obtainStyledAttributes(r92).getString(116);
        if (r93 != null) goto L143;
        this.e0 = new q5();
        goto L11
    L143:
        this.e0 = (q5) r0.getClassLoader().loadClass(r93).getDeclaredConstructor(null).newInstance(null);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + r93 + ". Falling back to default.", th);
        this.e0 = new q5();
    L11:
        q5 r94 = this.e0;
        int r02 = f90.a;
        r94.getClass();
        TypedArray r03 = r11.obtainStyledAttributes(r12, xy.y, 0, 0);
        byte r2 = 4;
        int r3 = r03.getResourceId(4, 0);
        if (r3 == 0) goto L14;
        Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
    L14:
        r03.recycle();
        if (r3 != 0) goto L17;
    L21:
        Context r04 = r11;
    L22:
        r10.getClass();
        switch(r10.hashCode()) {
            case -1946472170: goto L77;
            case -1455429095: goto L73;
            case -1346021293: goto L69;
            case -938935918: goto L65;
            case -937446323: goto L62;
            case -658531749: goto L58;
            case -339785223: goto L54;
            case 776382189: goto L50;
            case 799298502: goto L46;
            case 1125864064: goto L42;
            case 1413872058: goto L38;
            case 1601505219: goto L34;
            case 1666676343: goto L30;
            case 2001146706: goto L26;
            default: goto L24;
        };
    L24:
        r2 = -1;
    L80:
        switch(r2) {
            case 0: goto L95;
            case 1: goto L94;
            case 2: goto L93;
            case 3: goto L92;
            case 4: goto L91;
            case 5: goto L90;
            case 6: goto L89;
            case 7: goto L88;
            case 8: goto L87;
            case 9: goto L86;
            case 10: goto L85;
            case 11: goto L84;
            case 12: goto L83;
            case 13: goto L82;
            default: goto L81;
        };
    L81:
        View r22 = null;
    L96:
        if (r22 != null) goto L118;
        if (r11 == r04) goto L118;
        Object[] r112 = r94.a;
        if (r10.equals("view") == false) goto L146;
        r10 = r12.getAttributeValue(null, "class");
    L146:
        r112[0] = r04;     // Catch: Throwable -> L110 Exception -> L117
        r112[1] = r12;     // Catch: Throwable -> L110 Exception -> L117
        if ((-1) != r10.indexOf(46)) goto L113;
        int r23 = 0;
    L104:
        String[] r32 = q5.g;     // Catch: Throwable -> L110 Exception -> L117
        if (r23 >= 3) goto L112;
        View r33 = r94.f(r04, r10, r32[r23]);     // Catch: Throwable -> L110 Exception -> L117
        if (r33 != null) goto L108;
        r23 = r23 + 1;
        goto L104
    L108:
        r112[0] = null;
        r112[1] = null;
        r1 = r33;
    L145:
    L119:
        if (r1 == null) goto L142;
        Context r95 = r1.getContext();
        if ((r95 instanceof ContextWrapper) == false) goto L130;
        WeakHashMap r102 = ja0.a;
        if (r90.a(r1) == false) goto L130;
        TypedArray r96 = r95.obtainStyledAttributes(r12, q5.c);
        String r103 = r96.getString(0);
        if (r103 == null) goto L128;
        r1.setOnClickListener(new p5(r1, r103));
    L128:
        r96.recycle();
    L130:
        if (Build.VERSION.SDK_INT > 28) goto L142;
        TypedArray r97 = r04.obtainStyledAttributes(r12, q5.d);
        if (r97.hasValue(0) == false) goto L135;
        boolean r104 = r97.getBoolean(0, false);
        WeakHashMap r113 = ja0.a;
        new p90(com.ljx.wechatmod.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(r1, Boolean.valueOf(r104));
    L135:
        r97.recycle();
        TypedArray r98 = r04.obtainStyledAttributes(r12, q5.e);
        if (r98.hasValue(0) == false) goto L138;
        ja0.m(r1, r98.getString(0));
    L138:
        r98.recycle();
        TypedArray r99 = r04.obtainStyledAttributes(r12, q5.f);
        if (r99.hasValue(0) == false) goto L141;
        boolean r105 = r99.getBoolean(0, false);
        WeakHashMap r114 = ja0.a;
        new p90(com.ljx.wechatmod.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).d(r1, Boolean.valueOf(r105));
    L141:
        r99.recycle();
    L142:
        return r1;
    L117:
        r112[0] = r1;
        r112[1] = r1;
        goto L145
    L112:
        r112[0] = null;
        r112[1] = null;
        goto L145
    L113:
        View r910 = r94.f(r04, r10, null);     // Catch: Throwable -> L110 Exception -> L117
        r112[0] = null;
        r112[1] = null;
        r1 = r910;
    L110:
        th = move-exception;
        r112[0] = r1;
        r112[1] = r1;
        throw th;
    L148:
        r112[0] = null;
        r112[1] = null;
    L118:
        r1 = r22;
        goto L119
    L82:
        r22 = r94.b(r04, r12);
        goto L96
    L83:
        r22 = new w3(r04, r12);
        goto L96
    L84:
        r22 = r94.c(r04, r12);
        goto L96
    L85:
        r22 = r94.a(r04, r12);
        goto L96
    L86:
        r22 = new a4(r04, r12, 0);
        goto L96
    L87:
        r22 = new o5(r04, r12);
        goto L96
    L88:
        r22 = r94.d(r04, r12);
        goto L96
    L89:
        r22 = new v4(r04, r12);
        goto L96
    L90:
        r22 = new h4(r04, r12);
        goto L96
    L91:
        r22 = new y3(r04, r12, com.ljx.wechatmod.R.attr.imageButtonStyle);
        goto L96
    L92:
        r22 = r94.e(r04, r12);
        goto L96
    L93:
        r22 = new b4(r04, r12);
        goto L96
    L94:
        r22 = new z2(r04, r12);
        goto L96
    L95:
        r22 = new f4(r04, r12);
        goto L96
    L26:
        if (r10.equals("Button") == false) goto L152;
        r2 = 13;
        goto L80
    L152:
        r2 = -1;
        goto L80
    L30:
        if (r10.equals("EditText") == false) goto L153;
        r2 = 12;
        goto L80
    L153:
        r2 = -1;
        goto L80
    L34:
        if (r10.equals("CheckBox") == false) goto L154;
        r2 = 11;
        goto L80
    L154:
        r2 = -1;
        goto L80
    L38:
        if (r10.equals("AutoCompleteTextView") == false) goto L155;
        r2 = 10;
        goto L80
    L155:
        r2 = -1;
        goto L80
    L42:
        if (r10.equals("ImageView") == false) goto L156;
        r2 = 9;
        goto L80
    L156:
        r2 = -1;
        goto L80
    L46:
        if (r10.equals("ToggleButton") == false) goto L157;
        r2 = 8;
        goto L80
    L157:
        r2 = -1;
        goto L80
    L50:
        if (r10.equals("RadioButton") == false) goto L158;
        r2 = 7;
        goto L80
    L158:
        r2 = -1;
        goto L80
    L54:
        if (r10.equals("Spinner") == false) goto L159;
        r2 = 6;
        goto L80
    L159:
        r2 = -1;
        goto L80
    L58:
        if (r10.equals("SeekBar") == false) goto L160;
        r2 = 5;
        goto L80
    L160:
        r2 = -1;
        goto L80
    L62:
        if (r10.equals("ImageButton") == true) goto L80;
        r2 = -1;
        goto L80
    L65:
        if (r10.equals("TextView") == false) goto L162;
        r2 = 3;
        goto L80
    L162:
        r2 = -1;
        goto L80
    L69:
        if (r10.equals("MultiAutoCompleteTextView") == false) goto L163;
        r2 = 2;
        goto L80
    L163:
        r2 = -1;
        goto L80
    L73:
        if (r10.equals("CheckedTextView") == false) goto L164;
        r2 = 1;
        goto L80
    L164:
        r2 = -1;
        goto L80
    L77:
        if (r10.equals("RatingBar") == false) goto L165;
        r2 = 0;
        goto L80
    L165:
        r2 = -1;
        goto L80
    L17:
        if ((r11 instanceof kd) == true) goto L19;
    L20:
        r04 = new kd(r11, r3);
        goto L22
    L19:
        if (((kd) r11).a == r3) goto L21;
        goto L20
    }

    public final void q(int r4, q3 r5, ku r6) {
        if (r6 != null) goto L10;
        if (r5 != null) goto L8;
        if (r4 < 0) goto L8;
        q3[] r0 = this.L;
        if (r4 >= r0.length) goto L8;
        r5 = r0[r4];
    L8:
        if (r5 == null) goto L10;
        r6 = r5.h;
    L10:
        if (r5 == null) goto L15;
        if (r5.m == true) goto L15;
        return;
    L15:
        if (this.Q == true) goto L23;
        l3 r52 = this.m;
        Window.Callback r02 = this.l.getCallback();
        r52.getClass();
        r52.d = true;     // Catch: Throwable -> L20
        r02.onPanelClosed(r4, r6);     // Catch: Throwable -> L20
        r52.d = false;
        return;
    L20:
        th = move-exception;
        r52.d = false;
        throw th;
    }

    public final void r(ku r3) {
        if (this.K == false) goto L5;
        return;
    L5:
        this.K = true;
        ActionBarOverlayLayout r0 = (ActionBarOverlayLayout) this.r;
        r0.k();
        ActionMenuView r02 = ((k70) r0.e).a.a;
        if (r02 == null) goto L14;
        j1 r03 = r02.t;
        if (r03 == null) goto L14;
        r03.f();
        f1 r04 = r03.t;
        if (r04 == null) goto L14;
        if (r04.b() == false) goto L14;
        r04.i.dismiss();
    L14:
        Window.Callback r05 = this.l.getCallback();
        if (r05 != null) goto L17;
    L19:
        this.K = false;
        return;
    L17:
        if (this.Q == true) goto L19;
        r05.onPanelClosed(108, r3);
        goto L19
    }

    public final void s(q3 r4, boolean r5) {
        if (r5 == true) goto L4;
    L15:
        WindowManager r0 = (WindowManager) this.k.getSystemService("window");
        if (r0 != null) goto L18;
    L24:
        r4.k = false;
        r4.l = false;
        r4.m = false;
        r4.f = null;
        r4.n = true;
        if (this.M != r4) goto L28;
        this.M = null;
    L28:
        if (r4.a != 0) goto L31;
        I();
        return;
    L31:
        return;
    L18:
        if (r4.m == false) goto L24;
        p3 r2 = r4.e;
        if (r2 == null) goto L24;
        r0.removeView(r2);
        if (r5 == false) goto L24;
        q(r4.a, r4, null);
        goto L24
    L4:
        if (r4.a != 0) goto L15;
        gf r02 = this.r;
        if (r02 == null) goto L15;
        ActionBarOverlayLayout r03 = (ActionBarOverlayLayout) r02;
        r03.k();
        ActionMenuView r04 = ((k70) r03.e).a.a;
        if (r04 == null) goto L15;
        j1 r05 = r04.t;
        if (r05 == null) goto L15;
        if (r05.j() == false) goto L15;
        r(r4.h);
    }

    public final boolean u(KeyEvent r7) {
        Object r0 = this.j;
        boolean r2 = true;
        if ((r0 instanceof aq) == false) goto L5;
    L6:
        View r02 = this.l.getDecorView();
        if (r02 != null) goto L9;
    L12:
        if (r7.getKeyCode() != 82) goto L21;
        l3 r03 = this.m;
        Window.Callback r4 = this.l.getCallback();
        r03.getClass();
        r03.c = true;     // Catch: Throwable -> L18
        boolean r42 = r4.dispatchKeyEvent(r7);     // Catch: Throwable -> L18
        r03.c = false;
        if (r42 == false) goto L21;
    L103:
        return true;
    L18:
        th = move-exception;
        r03.c = false;
        throw th;
    L21:
        int r04 = r7.getKeyCode();
        if (r7.getAction() != 0) goto L38;
        if (r04 == 4) goto L33;
        if (r04 == 82) goto L27;
    L104:
        return false;
    L27:
        if (r7.getRepeatCount() != 0) goto L103;
        q3 r05 = z(0);
        if (r05.m == true) goto L103;
        G(r05, r7);
        return true;
    L33:
        if ((r7.getFlags() & 128) != 0) goto L36;
        r2 = false;
    L36:
        this.N = r2;
        return false;
    L38:
        if (r04 == 4) goto L102;
        if (r04 != 82) goto L104;
        if (this.u != null) goto L103;
        q3 r06 = z(0);
        gf r3 = this.r;
        Context r43 = this.k;
        if (r3 == null) goto L78;
        ActionBarOverlayLayout r32 = (ActionBarOverlayLayout) r3;
        r32.k();
        Toolbar r33 = ((k70) r32.e).a;
        if (r33.getVisibility() != 0) goto L78;
        ActionMenuView r34 = r33.a;
        if (r34 == null) goto L78;
        if (r34.s == false) goto L78;
        if (ViewConfiguration.get(r43).hasPermanentMenuKey() == true) goto L78;
        ActionBarOverlayLayout r35 = (ActionBarOverlayLayout) this.r;
        r35.k();
        ActionMenuView r36 = ((k70) r35.e).a.a;
        if (r36 == null) goto L68;
        j1 r37 = r36.t;
        if (r37 == null) goto L68;
        if (r37.j() == false) goto L68;
        ActionBarOverlayLayout r72 = (ActionBarOverlayLayout) this.r;
        r72.k();
        ActionMenuView r73 = ((k70) r72.e).a.a;
        if (r73 == null) goto L92;
        j1 r74 = r73.t;
        if (r74 == null) goto L92;
        if (r74.f() == false) goto L92;
    L91:
        boolean r75 = true;
    L94:
        if (r75 == false) goto L103;
        AudioManager r76 = (AudioManager) r43.getApplicationContext().getSystemService("audio");
        if (r76 == null) goto L99;
        r76.playSoundEffect(0);
        return true;
    L99:
        Log.w("AppCompatDelegate", "Couldn't get audio manager");
        return true;
    L92:
        r75 = false;
    L68:
        if (this.Q == true) goto L92;
        if (G(r06, r7) == false) goto L92;
        ActionBarOverlayLayout r77 = (ActionBarOverlayLayout) this.r;
        r77.k();
        ActionMenuView r78 = ((k70) r77.e).a.a;
        if (r78 == null) goto L92;
        j1 r79 = r78.t;
        if (r79 == null) goto L92;
        if (r79.l() == false) goto L92;
    L78:
        boolean r38 = r06.m;
        if (r38 == false) goto L81;
    L93:
        s(r06, true);
        r75 = r38;
        goto L94
    L81:
        if (r06.l == true) goto L93;
        if (r06.k == false) goto L92;
        if (r06.o == false) goto L88;
        r06.k = false;
        boolean r39 = G(r06, r7);
    L89:
        if (r39 == false) goto L92;
        E(r06, r7);
        goto L91
    L88:
        r39 = true;
        goto L89
    L102:
        if (D() == false) goto L104;
    L9:
        if (ip.r(r02, r7) == false) goto L12;
    L5:
        if ((r0 instanceof g2) == false) goto L12;
        goto L6
    }

    public final void v(int r4) {
        q3 r0 = z(r4);
        if (r0.h == null) goto L8;
        Bundle r1 = new Bundle();
        r0.h.t(r1);
        if (r1.size() <= 0) goto L7;
        r0.p = r1;
    L7:
        r0.h.w();
        r0.h.clear();
    L8:
        r0.o = true;
        r0.n = true;
        if (r4 == 108) goto L12;
        if (r4 == 0) goto L12;
        return;
    L12:
        if (this.r == null) goto L16;
        q3 r02 = z(0);
        r02.k = false;
        G(r02, null);
        return;
    }

    public final void w() {
        if (this.z == true) goto L113;
        Context r0 = this.k;
        int[] r1 = xy.j;
        TypedArray r2 = r0.obtainStyledAttributes(r1);
        if (r2.hasValue(117) == false) goto L111;
        int r5 = 0;
        int r7 = 1;
        if (r2.getBoolean(126, false) == false) goto L10;
        g(1);
    L13:
        if (r2.getBoolean(118, false) == false) goto L16;
        g(109);
    L16:
        if (r2.getBoolean(119, false) == false) goto L18;
        g(10);
    L18:
        this.I = r2.getBoolean(0, false);
        r2.recycle();
        x();
        this.l.getDecorView();
        LayoutInflater r22 = LayoutInflater.from(r0);
        if (this.J == true) goto L40;
        if (this.I == false) goto L24;
        ViewGroup r23 = (ViewGroup) r22.inflate(com.ljx.wechatmod.R.layout.abc_dialog_title_material, null);
        this.G = false;
        this.F = false;
    L43:
        if (r23 == null) goto L110;
        g3 r3 = new g3(this, r5);
        WeakHashMap r4 = ja0.a;
        y90.u(r23, r3);
        if (this.r != null) goto L47;
        this.B = (TextView) r23.findViewById(com.ljx.wechatmod.R.id.title);
    L47:
        Method r32 = cb0.a;
        Method r9 = r23.getClass().getMethod("makeOptionalFitsSystemWindows", null);     // Catch: IllegalAccessException -> L51 InvocationTargetException -> L53 NoSuchMethodException -> L59
        if (r9.isAccessible() == true) goto L55;
        r9.setAccessible(true);     // Catch: IllegalAccessException -> L51 InvocationTargetException -> L53 NoSuchMethodException -> L59
    L55:
        r9.invoke(r23, null);     // Catch: IllegalAccessException -> L51 InvocationTargetException -> L53 NoSuchMethodException -> L59
    L60:
        ContentFrameLayout r33 = (ContentFrameLayout) r23.findViewById(com.ljx.wechatmod.R.id.action_bar_activity_content);
        ViewGroup r42 = (ViewGroup) this.l.findViewById(R.id.content);
        if (r42 != null) goto L63;
    L68:
        this.l.setContentView(r23);
        r33.setAttachListener(new g3(this, r7));
        this.A = r23;
        Object r24 = this.j;
        if ((r24 instanceof Activity) == false) goto L71;
        CharSequence r25 = ((Activity) r24).getTitle();
    L73:
        if (TextUtils.isEmpty(r25) == true) goto L89;
        gf r34 = this.r;
        if (r34 == null) goto L77;
        r34.setWindowTitle(r25);
        goto L89
    L77:
        yb0 r35 = this.o;
        if (r35 == null) goto L86;
        k70 r36 = (k70) r35.A;
        if (r36.g == true) goto L89;
        Toolbar r43 = r36.a;
        r36.h = r25;
        if ((r36.b & 8) == 0) goto L89;
        r43.setTitle(r25);
        if (r36.g == false) goto L89;
        ja0.m(r43.getRootView(), r25);
        goto L89
    L86:
        TextView r37 = this.B;
        if (r37 == null) goto L89;
        r37.setText(r25);
    L89:
        ContentFrameLayout r26 = (ContentFrameLayout) this.A.findViewById(R.id.content);
        View r38 = this.l.getDecorView();
        r26.g.set(r38.getPaddingLeft(), r38.getPaddingTop(), r38.getPaddingRight(), r38.getPaddingBottom());
        WeakHashMap r39 = ja0.a;
        if (v90.c(r26) == false) goto L92;
        r26.requestLayout();
    L92:
        TypedArray r02 = r0.obtainStyledAttributes(r1);
        r02.getValue(124, r26.getMinWidthMajor());
        r02.getValue(125, r26.getMinWidthMinor());
        if (r02.hasValue(122) == false) goto L96;
        r02.getValue(122, r26.getFixedWidthMajor());
    L96:
        if (r02.hasValue(123) == false) goto L99;
        r02.getValue(123, r26.getFixedWidthMinor());
    L99:
        if (r02.hasValue(120) == false) goto L102;
        r02.getValue(120, r26.getFixedHeightMajor());
    L102:
        if (r02.hasValue(121) == false) goto L104;
        r02.getValue(121, r26.getFixedHeightMinor());
    L104:
        r02.recycle();
        r26.requestLayout();
        this.z = true;
        q3 r03 = z(0);
        if (this.Q == false) goto L107;
        return;
    L107:
        if (r03.h != null) goto L118;
        B(108);
        return;
    L118:
        return;
    L71:
        r25 = this.q;
    L63:
        if (r42.getChildCount() <= 0) goto L65;
        View r10 = r42.getChildAt(0);
        r42.removeViewAt(0);
        r33.addView(r10);
        goto L63
    L65:
        r42.setId(-1);
        r33.setId(R.id.content);
        if ((r42 instanceof FrameLayout) == false) goto L68;
        ((FrameLayout) r42).setForeground(null);
        goto L68
    L51:
        e = move-exception;
        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
    L59:
        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
    L53:
        e = move-exception;
        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        goto L60
    L110:
        throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.F + ", windowActionBarOverlay: " + this.G + ", android:windowIsFloating: " + this.I + ", windowActionModeOverlay: " + this.H + ", windowNoTitle: " + this.J + " }");
    L24:
        if (this.F == false) goto L38;
        TypedValue r27 = new TypedValue();
        r0.getTheme().resolveAttribute(com.ljx.wechatmod.R.attr.actionBarTheme, r27, true);
        if (r27.resourceId == 0) goto L28;
        Context r310 = new kd(r0, r27.resourceId);
    L29:
        r23 = (ViewGroup) LayoutInflater.from(r310).inflate(com.ljx.wechatmod.R.layout.abc_screen_toolbar, null);
        gf r311 = (gf) r23.findViewById(com.ljx.wechatmod.R.id.decor_content_parent);
        this.r = r311;
        r311.setWindowCallback(this.l.getCallback());
        if (this.G == false) goto L33;
        ((ActionBarOverlayLayout) this.r).j(109);
    L33:
        if (this.D == false) goto L36;
        ((ActionBarOverlayLayout) this.r).j(2);
    L36:
        if (this.E == false) goto L43;
        ((ActionBarOverlayLayout) this.r).j(5);
        goto L43
    L28:
        r310 = r0;
        goto L29
    L38:
        r23 = null;
        goto L43
    L40:
        if (this.H == false) goto L42;
        r23 = (ViewGroup) r22.inflate(com.ljx.wechatmod.R.layout.abc_screen_simple_overlay_action_mode, null);
        goto L43
    L42:
        r23 = (ViewGroup) r22.inflate(com.ljx.wechatmod.R.layout.abc_screen_simple, null);
        goto L43
    L10:
        if (r2.getBoolean(117, false) == false) goto L13;
        g(108);
        goto L13
    L111:
        r2.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    public final void x() {
        if (this.l != null) goto L8;
        Object r0 = this.j;
        if ((r0 instanceof Activity) == false) goto L8;
        o(((Activity) r0).getWindow());
    L8:
        if (this.l == null) goto L11;
        return;
    L11:
        throw new IllegalStateException("We have not been given a Window");
    }

    public final o3 y(Context r4) {
        if (this.W != null) goto L9;
        if (r5.g != null) goto L7;
        Context r42 = r4.getApplicationContext();
        r5.g = new r5(r42, (LocationManager) r42.getSystemService("location"));
    L7:
        this.W = new m3(this, r5.g);
    L9:
        return this.W;
    }

    public final q3 z(int r5) {
        q3[] r0 = this.L;
        if (r0 != null) goto L5;
    L6:
        q3[] r2 = new q3[r5 + 1];
        if (r0 == null) goto L9;
        System.arraycopy(r0, 0, r2, 0, r0.length);
    L9:
        this.L = r2;
        r0 = r2;
    L10:
        q3 r22 = r0[r5];
        if (r22 != null) goto L14;
        q3 r23 = new q3();
        r23.a = r5;
        r23.n = false;
        r0[r5] = r23;
        return r23;
    L14:
        return r22;
    L5:
        if (r0.length > r5) goto L10;
        goto L6
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String r2, Context r3, AttributeSet r4) {
        return onCreateView(null, r2, r3, r4);
    }
}
