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
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: E3 */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0176E3 extends AbstractC2397q3 implements InterfaceC2113jr, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: h0 */
    public static final C2520sy f457h0 = null;

    /* JADX INFO: renamed from: i0 */
    public static final int[] f458i0 = null;

    /* JADX INFO: renamed from: j0 */
    public static final boolean f459j0 = false;

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

    /* JADX INFO: renamed from: a0 */
    public final RunnableC2440r3 f486a0;

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

    /* JADX INFO: renamed from: y */
    public C0273GE f508y;

    /* JADX INFO: renamed from: z */
    public boolean f509z;

    static {
        f457h0 = new C2520sy(0);
        f458i0 = new int[]{R.attr.windowBackground};
        f459j0 = !"robolectric".equals(Build.FINGERPRINT);
    }

    public LayoutInflaterFactory2C0176E3(Context r5, Window r6, InterfaceC1437g3 r7, Object r8) {
        AbstractActivityC1244c3 r0 = null;
        this.f508y = null;
        this.f478S = -100;
        this.f486a0 = new RunnableC2440r3(this, 0);
        this.f494k = r5;
        this.f497n = r7;
        this.f493j = r8;
        if ((r8 instanceof Dialog) == false) goto L14;
    L4:
        if (r5 == null) goto L11;
        if ((r5 instanceof AbstractActivityC1244c3) == true) goto L7;
        if ((r5 instanceof ContextWrapper) == false) goto L11;
        r5 = ((ContextWrapper) r5).getBaseContext();
        goto L4
    L7:
        r0 = (AbstractActivityC1244c3) r5;
    L11:
        if (r0 == null) goto L14;
        this.f478S = ((LayoutInflaterFactory2C0176E3) r0.getDelegate()).f478S;
    L14:
        if (this.f478S != (-100)) goto L18;
        String r52 = this.f493j.getClass().getName();
        C2520sy r72 = f457h0;
        Integer r53 = (Integer) r72.get(r52);
        if (r53 == null) goto L18;
        this.f478S = r53.intValue();
        r72.remove(this.f493j.getClass().getName());
    L18:
        if (r6 == null) goto L20;
        m351o(r6);
    L20:
        C0262G3.m541d();
    }

    /* JADX INFO: renamed from: p */
    public static C1105Zo m330p(Context r5) {
        if (Build.VERSION.SDK_INT >= 33) goto L30;
        C1105Zo r0 = AbstractC2397q3.f8400c;
        if (r0 != null) goto L9;
        return null;
    L9:
        C1186ap r02 = r0.f3499a;
        C1105Zo r52 = AbstractC2612v3.m5123b(r5.getApplicationContext().getResources().getConfiguration());
        if (r02.f4071a.isEmpty() == false) goto L12;
        C1105Zo r03 = C1105Zo.f3498b;
    L24:
        if (r03.f3499a.f4071a.isEmpty() == false) goto L26;
        return r52;
    L26:
        return r03;
    L12:
        LinkedHashSet r1 = new LinkedHashSet();
        int r2 = 0;
    L13:
        int r3 = r02.f4071a.size();
        if (r2 >= (r52.f3499a.f4071a.size() + r3)) goto L22;
        if (r2 >= r02.f4071a.size()) goto L18;
        Locale r32 = r02.f4071a.get(r2);
    L19:
        if (r32 == null) goto L21;
        r1.add(r32);
    L21:
        r2 = r2 + 1;
        goto L13
    L18:
        int r33 = r2 - r02.f4071a.size();
        r32 = r52.f3499a.f4071a.get(r33);
        goto L19
    L22:
        r03 = new C1105Zo(new C1186ap(new LocaleList((Locale[]) r1.toArray(new Locale[r1.size()]))));
        goto L24
    L30:
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static Configuration m331t(Context r1, int r2, C1105Zo r3, Configuration r4, boolean r5) {
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
        AbstractC2612v3.m5125d(r22, r3);
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

    /* JADX INFO: renamed from: A */
    public final void m332A() {
        m357w();
        if (this.f465F == true) goto L5;
        return;
    L5:
        if (this.f498o != null) goto L19;
        Object r0 = this.f493j;
        if ((r0 instanceof Activity) == false) goto L11;
        this.f498o = new C2229mF((Activity) r0, this.f466G);
    L13:
        AbstractC2257n0 r02 = this.f498o;
        if (r02 == null) goto L18;
        r02.mo4509m(this.f487b0);
        return;
    L18:
        return;
    L11:
        if ((r0 instanceof Dialog) == false) goto L13;
        this.f498o = new C2229mF((Dialog) r0);
        goto L13
    }

    /* JADX INFO: renamed from: B */
    public final void m333B(int r3) {
        int r32 = 1 << r3;
        this.f485Z = r32 | this.f485Z;
        if (this.f484Y == true) goto L6;
        View r33 = this.f495l.getDecorView();
        WeakHashMap r0 = AbstractC2185lE.f7617a;
        r33.postOnAnimation(this.f486a0);
        this.f484Y = true;
        return;
    }

    /* JADX INFO: renamed from: C */
    public final int m334C(Context r3, int r4) {
        if (r4 == (-100)) goto L25;
        if (r4 == (-1)) goto L24;
        if (r4 == 0) goto L20;
        if (r4 == 1) goto L24;
        if (r4 == 2) goto L24;
        if (r4 != 3) goto L18;
        if (this.f483X != null) goto L16;
        this.f483X = new C2784z3(this, r3);
    L16:
        return this.f483X.mo82h();
    L18:
        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
    L20:
        if (((UiModeManager) r3.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) goto L25;
        return m359y(r3).mo82h();
    L24:
        return r4;
    L25:
        return -1;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m335D() {
        boolean r0 = this.f473N;
        this.f473N = false;
        C0133D3 r2 = m360z(0);
        if (r2.f341m == false) goto L7;
        if (r0 == true) goto L15;
        m354s(r2, true);
        return true;
    L15:
        return true;
    L7:
        AbstractC0345I0 r02 = this.f504u;
        if (r02 == null) goto L11;
        r02.mo735a();
        return true;
    L11:
        m332A();
        AbstractC2257n0 r03 = this.f498o;
        if (r03 != null) goto L14;
    L16:
        return false;
    L14:
        if (r03.mo4502b() == false) goto L16;
        goto L15
    }

    /* JADX INFO: renamed from: E */
    public final void m336E(C0133D3 r18, KeyEvent r19) {
        boolean r2 = r18.f341m;
        int r3 = r18.f329a;
        if (r2 == false) goto L5;
        return;
    L5:
        if (this.f476Q == true) goto L106;
        Context r22 = this.f494k;
        if (r3 == 0) goto L10;
    L12:
        Window.Callback r4 = this.f495l.getCallback();
        if (r4 != null) goto L15;
    L18:
        WindowManager r42 = (WindowManager) r22.getSystemService("window");
        if (r42 != null) goto L22;
        return;
    L22:
        if (m338G(r18, r19) == false) goto L109;
        C0090C3 r6 = r18.f333e;
        if (r6 != null) goto L27;
    L36:
        if (r6 != null) goto L53;
        m332A();
        AbstractC2257n0 r62 = this.f498o;
        if (r62 == null) goto L40;
        Context r63 = r62.mo4505e();
    L41:
        if (r63 == null) goto L44;
        r22 = r63;
    L44:
        TypedValue r64 = new TypedValue();
        Resources.Theme r9 = r22.getResources().newTheme();
        r9.setTo(r22.getTheme());
        r9.resolveAttribute(io.github.cherrywechat.R.attr.actionBarPopupTheme, r64, true);
        int r10 = r64.resourceId;
        if (r10 == 0) goto L47;
        r9.applyStyle(r10, true);
    L47:
        r9.resolveAttribute(io.github.cherrywechat.R.attr.panelMenuListTheme, r64, true);
        int r65 = r64.resourceId;
        if (r65 == 0) goto L50;
        r9.applyStyle(r65, true);
    L51:
        C0147Db r66 = new C0147Db(r22, 0);
        r66.getTheme().setTo(r9);
        r18.f338j = r66;
        TypedArray r23 = r66.obtainStyledAttributes(AbstractC0982Wu.f3075j);
        r18.f330b = r23.getResourceId(86, 0);
        r18.f332d = r23.getResourceId(1, 0);
        r23.recycle();
        r18.f333e = new C0090C3(this, r18.f338j);
        r18.f331c = 81;
    L57:
        View r24 = r18.f335g;
        if (r24 == null) goto L61;
        r18.f334f = r24;
    L78:
        if (r18.f334f != null) goto L81;
    L102:
        r18.f342n = true;
        return;
    L81:
        if (r18.f335g != null) goto L88;
        C2768yo r25 = r18.f337i;
        if (r25.f9414f != null) goto L87;
        r25.f9414f = new C2725xo(r25);
    L87:
        if (r25.f9414f.getCount() <= 0) goto L102;
    L88:
        ViewGroup.LayoutParams r26 = r18.f334f.getLayoutParams();
        if (r26 != null) goto L91;
        r26 = new ViewGroup.LayoutParams(-2, -2);
    L91:
        r18.f333e.setBackgroundResource(r18.f330b);
        ViewParent r67 = r18.f334f.getParent();
        if ((r67 instanceof ViewGroup) == false) goto L94;
        ((ViewGroup) r67).removeView(r18.f334f);
    L94:
        r18.f333e.addView(r18.f334f, r26);
        if (r18.f334f.hasFocus() == true) goto L97;
        r18.f334f.requestFocus();
    L97:
        int r102 = -2;
    L98:
        r18.f340l = false;
        WindowManager.LayoutParams r92 = new WindowManager.LayoutParams(r102, -2, 0, 0, 1002, 8519680, -3);
        r92.gravity = r18.f331c;
        r92.windowAnimations = r18.f332d;
        r42.addView(r18.f333e, r92);
        r18.f341m = true;
        if (r3 != 0) goto L105;
        m340I();
        return;
    L105:
        return;
    L61:
        if (r18.f336h == null) goto L102;
        if (this.f503t != null) goto L66;
        this.f503t = new C2483s3(this, 3);
    L66:
        C2483s3 r27 = this.f503t;
        if (r18.f337i != null) goto L69;
        C2768yo r68 = new C2768yo(r18.f338j);
        r18.f337i = r68;
        r68.f9413e = r27;
        MenuC2204lr r28 = r18.f336h;
        r28.m4429b(r68, r28.f7660a);
    L69:
        C2768yo r29 = r18.f337i;
        C0090C3 r69 = r18.f333e;
        if (r29.f9412d != null) goto L75;
        r29.f9412d = (ExpandedMenuView) r29.f9410b.inflate(io.github.cherrywechat.R.layout.abc_expanded_menu_layout, r69, false);
        if (r29.f9414f != null) goto L74;
        r29.f9414f = new C2725xo(r29);
    L74:
        r29.f9412d.setAdapter(r29.f9414f);
        r29.f9412d.setOnItemClickListener(r29);
    L75:
        ExpandedMenuView r210 = r29.f9412d;
        r18.f334f = r210;
        if (r210 == null) goto L102;
    L50:
        r9.applyStyle(io.github.cherrywechat.R.style.Theme_AppCompat_CompactMenu, true);
        goto L51
    L40:
        r63 = null;
        goto L41
    L53:
        if (r18.f342n == false) goto L57;
        if (r6.getChildCount() <= 0) goto L57;
        r18.f333e.removeAllViews();
        goto L57
    L27:
        if (r18.f342n == true) goto L36;
        View r211 = r18.f335g;
        if (r211 == null) goto L97;
        ViewGroup.LayoutParams r212 = r211.getLayoutParams();
        if (r212 == null) goto L97;
        if (r212.width != (-1)) goto L97;
        r102 = -1;
        goto L98
    L109:
        return;
    L15:
        if (r4.onMenuOpened(r3, r18.f336h) == true) goto L18;
        m354s(r18, true);
        return;
    L10:
        if ((r22.getResources().getConfiguration().screenLayout & 15) != 4) goto L12;
        return;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m337F(C0133D3 r3, int r4, KeyEvent r5) {
        if (r5.isSystem() == false) goto L6;
        return false;
    L6:
        if (r3.f339k == false) goto L8;
    L9:
        MenuC2204lr r32 = r3.f336h;
        if (r32 != null) goto L12;
        return false;
    L12:
        return r32.performShortcut(r4, r5, 1);
    L8:
        if (m338G(r3, r5) == true) goto L9;
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m338G(C0133D3 r13, KeyEvent r14) {
        if (this.f476Q == true) goto L81;
        boolean r0 = r13.f339k;
        int r2 = r13.f329a;
        if (r0 == false) goto L8;
        return true;
    L8:
        C0133D3 r02 = this.f472M;
        if (r02 == null) goto L12;
        if (r02 == r13) goto L12;
        m354s(r02, false);
    L12:
        Window.Callback r03 = this.f495l.getCallback();
        if (r03 == null) goto L16;
        r13.f335g = r03.onCreatePanelView(r2);
    L16:
        if (r2 == 0) goto L20;
        if (r2 == 108) goto L20;
        boolean r5 = false;
    L21:
        if (r5 == false) goto L26;
        InterfaceC0449Kc r6 = this.f501r;
        if (r6 == null) goto L26;
        ActionBarOverlayLayout r62 = (ActionBarOverlayLayout) r6;
        r62.m2088k();
        ((C2663wB) r62.f3754e).f9224l = true;
    L26:
        if (r13.f335g != null) goto L102;
        if (r5 == true) goto L29;
    L30:
        MenuC2204lr r63 = r13.f336h;
        if (r63 != null) goto L33;
    L34:
        if (r63 != null) goto L62;
        Context r64 = this.f494k;
        if (r2 == 0) goto L39;
        if (r2 == 108) goto L39;
    L51:
        MenuC2204lr r4 = new MenuC2204lr(r64);
        r4.f7664e = this;
        MenuC2204lr r65 = r13.f336h;
        if (r4 == r65) goto L60;
        if (r65 == null) goto L56;
        r65.m4437r(r13.f337i);
    L56:
        r13.f336h = r4;
        C2768yo r66 = r13.f337i;
        if (r66 == null) goto L60;
        r4.m4429b(r66, r4.f7660a);
    L60:
        if (r13.f336h != null) goto L62;
    L39:
        if (this.f501r == null) goto L51;
        TypedValue r42 = new TypedValue();
        Resources.Theme r8 = r64.getTheme();
        r8.resolveAttribute(io.github.cherrywechat.R.attr.actionBarTheme, r42, true);
        if (r42.resourceId == 0) goto L43;
        Resources.Theme r9 = r64.getResources().newTheme();
        r9.setTo(r8);
        r9.applyStyle(r42.resourceId, true);
        r9.resolveAttribute(io.github.cherrywechat.R.attr.actionBarWidgetTheme, r42, true);
    L45:
        if (r42.resourceId == 0) goto L49;
        if (r9 != null) goto L48;
        r9 = r64.getResources().newTheme();
        r9.setTo(r8);
    L48:
        r9.applyStyle(r42.resourceId, true);
    L49:
        if (r9 == null) goto L51;
        C0147Db r43 = new C0147Db(r64, 0);
        r43.getTheme().setTo(r9);
        r64 = r43;
        goto L51
    L43:
        r8.resolveAttribute(io.github.cherrywechat.R.attr.actionBarWidgetTheme, r42, true);
        r9 = null;
    L62:
        if (r5 == false) goto L69;
        InterfaceC0449Kc r44 = this.f501r;
        if (r44 == null) goto L69;
        if (this.f502s != null) goto L68;
        this.f502s = new C2483s3(this, 2);
    L68:
        ((ActionBarOverlayLayout) r44).m2089l(r13.f336h, this.f502s);
    L69:
        r13.f336h.m4442w();
        if (r03.onCreatePanelMenu(r2, r13.f336h) == true) goto L82;
        MenuC2204lr r142 = r13.f336h;
        if (r142 == null) goto L77;
        if (r142 == null) goto L76;
        r142.m4437r(r13.f337i);
    L76:
        r13.f336h = null;
    L77:
        if (r5 == false) goto L81;
        InterfaceC0449Kc r132 = this.f501r;
        if (r132 == null) goto L81;
        ((ActionBarOverlayLayout) r132).m2089l(null, this.f502s);
        goto L81
    L82:
        r13.f343o = false;
    L83:
        r13.f336h.m4442w();
        Bundle r22 = r13.f344p;
        if (r22 == null) goto L87;
        r13.f336h.m4438s(r22);
        r13.f344p = null;
    L87:
        if (r03.onPreparePanel(0, r13.f335g, r13.f336h) == true) goto L94;
        if (r5 == false) goto L92;
        InterfaceC0449Kc r143 = this.f501r;
        if (r143 == null) goto L92;
        ((ActionBarOverlayLayout) r143).m2089l(null, this.f502s);
    L92:
        r13.f336h.m4441v();
        return false;
    L94:
        if (r14 == null) goto L96;
        int r144 = r14.getDeviceId();
    L98:
        if (KeyCharacterMap.load(r144).getKeyboardType() == 1) goto L100;
        boolean r145 = true;
    L101:
        r13.f336h.setQwertyMode(r145);
        r13.f336h.m4441v();
        goto L102
    L100:
        r145 = false;
        goto L101
    L96:
        r144 = -1;
        goto L98
    L33:
        if (r13.f343o == false) goto L83;
    L29:
        if ((this.f498o instanceof C2577uB) == false) goto L30;
    L102:
        r13.f339k = true;
        r13.f340l = false;
        this.f472M = r13;
        return true;
    L20:
        r5 = true;
    L81:
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final void m339H() {
        if (this.f509z == true) goto L6;
        return;
    L6:
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    /* JADX INFO: renamed from: I */
    public final void m340I() {
        if (Build.VERSION.SDK_INT < 33) goto L23;
        boolean r1 = false;
        if (this.f491f0 != null) goto L8;
    L13:
        if (r1 == true) goto L15;
    L18:
        if (r1 == true) goto L24;
        OnBackInvokedCallback r0 = this.f492g0;
        if (r0 == null) goto L25;
        AbstractC2698x3.m5278c(this.f491f0, r0);
        this.f492g0 = null;
        return;
    L25:
        return;
    L24:
        return;
    L15:
        if (this.f492g0 != null) goto L18;
        this.f492g0 = AbstractC2698x3.m5277b(this.f491f0, this);
        return;
    L8:
        if (m360z(0).f341m == false) goto L11;
    L9:
        r1 = true;
        goto L13
    L11:
        if (this.f504u == null) goto L13;
    }

    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: a */
    public final void mo341a() {
        if (this.f498o == null) goto L9;
        m332A();
        if (this.f498o.mo4587g() == true) goto L10;
        m333B(0);
        return;
    L10:
        return;
    }

    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: c */
    public final void mo342c() {
        this.f474O = true;
        m350m(false, true);
        m358x();
        Object r1 = this.f493j;
        if ((r1 instanceof Activity) == true) goto L26;
    L24:
        this.f477R = new Configuration(this.f494k.getResources().getConfiguration());
        this.f475P = true;
        return;
    L26:
        Activity r12 = (Activity) r1;     // Catch: IllegalArgumentException -> L10
        String r13 = AbstractC1293cr.m2530A(r12, r12.getComponentName());     // Catch: PackageManager.NameNotFoundException -> L7 IllegalArgumentException -> L10
    L11:
        if (r13 == null) goto L16;
        AbstractC2257n0 r14 = this.f498o;
        if (r14 != null) goto L15;
        this.f487b0 = true;
        goto L16
    L15:
        r14.mo4509m(true);
    L16:
        Object r15 = AbstractC2397q3.f8405h;
        monitor-enter(r15);
        AbstractC2397q3.m4834f(this);     // Catch: Throwable -> L21
        AbstractC2397q3.f8404g.add(new WeakReference(this));     // Catch: Throwable -> L21
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

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: d */
    public final boolean mo233d(MenuC2204lr r8, MenuItem r9) {
        Window.Callback r0 = this.f495l.getCallback();
        if (r0 != null) goto L5;
    L22:
        return false;
    L5:
        if (this.f476Q == true) goto L22;
        MenuC2204lr r82 = r8.mo430k();
        C0133D3[] r2 = this.f471L;
        if (r2 == null) goto L9;
        int r3 = r2.length;
    L10:
        int r4 = 0;
    L11:
        if (r4 >= r3) goto L18;
        C0133D3 r5 = r2[r4];
        if (r5 == null) goto L17;
        if (r5.f336h != r82) goto L17;
    L19:
        if (r5 == null) goto L22;
        return r0.onMenuItemSelected(r5.f329a, r9);
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

    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: e */
    public final void mo343e() {
        if ((this.f493j instanceof Activity) == false) goto L13;
        Object r0 = AbstractC2397q3.f8405h;
        monitor-enter(r0);
        AbstractC2397q3.m4834f(this);     // Catch: Throwable -> L9
        monitor-exit(r0);     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        throw th;
    L13:
        if (this.f484Y == false) goto L15;
        this.f495l.getDecorView().removeCallbacks(this.f486a0);
    L15:
        this.f476Q = true;
        if (this.f478S == (-100)) goto L22;
        Object r02 = this.f493j;
        if ((r02 instanceof Activity) == false) goto L22;
        if (((Activity) r02).isChangingConfigurations() == false) goto L22;
        f457h0.put(this.f493j.getClass().getName(), Integer.valueOf(this.f478S));
    L23:
        AbstractC2257n0 r03 = this.f498o;
        if (r03 == null) goto L26;
        r03.mo4588i();
    L26:
        C2784z3 r04 = this.f482W;
        if (r04 == null) goto L29;
        r04.m77c();
    L29:
        C2784z3 r05 = this.f483X;
        if (r05 == null) goto L35;
        r05.m77c();
        return;
    L35:
        return;
    L22:
        f457h0.remove(this.f493j.getClass().getName());
        goto L23
    }

    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: g */
    public final boolean mo344g(int r6) {
        if (r6 != 8) goto L6;
        r6 = 108;
    L9:
        if (this.f469J == false) goto L13;
        if (r6 != 108) goto L13;
        return false;
    L13:
        if (this.f465F == false) goto L16;
        if (r6 != 1) goto L16;
        this.f465F = false;
    L16:
        if (r6 != 1) goto L18;
        m339H();
        this.f469J = true;
        return true;
    L18:
        if (r6 != 2) goto L20;
        m339H();
        this.f463D = true;
        return true;
    L20:
        if (r6 != 5) goto L22;
        m339H();
        this.f464E = true;
        return true;
    L22:
        if (r6 == 10) goto L31;
        if (r6 == 108) goto L29;
        if (r6 != 109) goto L26;
        m339H();
        this.f466G = true;
        return true;
    L26:
        return this.f495l.requestFeature(r6);
    L29:
        m339H();
        this.f465F = true;
        return true;
    L31:
        m339H();
        this.f467H = true;
        return true;
    L6:
        if (r6 != 9) goto L9;
        r6 = 109;
        goto L9
    }

    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: h */
    public final void mo345h(int r3) {
        m357w();
        ViewGroup r0 = (ViewGroup) this.f460A.findViewById(R.id.content);
        r0.removeAllViews();
        LayoutInflater.from(this.f494k).inflate(r3, r0);
        this.f496m.m5304a(this.f495l.getCallback());
    }

    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: i */
    public final void mo346i(View r3) {
        m357w();
        ViewGroup r0 = (ViewGroup) this.f460A.findViewById(R.id.content);
        r0.removeAllViews();
        r0.addView(r3);
        this.f496m.m5304a(this.f495l.getCallback());
    }

    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: j */
    public final void mo347j(View r3, ViewGroup.LayoutParams r4) {
        m357w();
        ViewGroup r0 = (ViewGroup) this.f460A.findViewById(R.id.content);
        r0.removeAllViews();
        r0.addView(r3, r4);
        this.f496m.m5304a(this.f495l.getCallback());
    }

    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: k */
    public final void mo348k(CharSequence r2) {
        this.f500q = r2;
        InterfaceC0449Kc r0 = this.f501r;
        if (r0 == null) goto L6;
        r0.setWindowTitle(r2);
        return;
    L6:
        AbstractC2257n0 r02 = this.f498o;
        if (r02 == null) goto L10;
        r02.mo4511o(r2);
        return;
    L10:
        TextView r03 = this.f461B;
        if (r03 == null) goto L14;
        r03.setText(r2);
        return;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [g3, java.lang.Object] */
    @Override // p000.AbstractC2397q3
    /* JADX INFO: renamed from: l */
    public final AbstractC0345I0 mo349l(InterfaceC0302H0 r9) {
        if (r9 == null) goto L72;
        AbstractC0345I0 r0 = this.f504u;
        if (r0 == null) goto L6;
        r0.mo735a();
    L6:
        C0649P3 r02 = new C0649P3(this, r9);
        m332A();
        AbstractC2257n0 r92 = this.f498o;
        ?? r1 = this.f497n;
        if (r92 == null) goto L12;
        AbstractC0345I0 r93 = r92.mo4512p(r02);
        this.f504u = r93;
        if (r93 == null) goto L12;
        r1.onSupportActionModeStarted(r93);
    L12:
        if (this.f504u != null) goto L69;
        C0273GE r94 = this.f508y;
        if (r94 == null) goto L16;
        r94.m554b();
    L16:
        AbstractC0345I0 r95 = this.f504u;
        if (r95 == null) goto L20;
        r95.mo735a();
    L20:
        if (this.f476Q == false) goto L74;
    L23:
        AbstractC0345I0 r96 = null;
    L24:
        if (r96 == null) goto L26;
        this.f504u = r96;
    L65:
        AbstractC0345I0 r97 = this.f504u;
        if (r97 == null) goto L68;
        r1.onSupportActionModeStarted(r97);
    L68:
        m340I();
        this.f504u = this.f504u;
        goto L69
    L26:
        int r3 = 1;
        if (this.f505v != null) goto L45;
        boolean r98 = this.f468I;
        Context r5 = this.f494k;
        if (r98 == false) goto L34;
        TypedValue r99 = new TypedValue();
        Resources.Theme r6 = r5.getTheme();
        r6.resolveAttribute(io.github.cherrywechat.R.attr.actionBarTheme, r99, true);
        if (r99.resourceId == 0) goto L33;
        Resources.Theme r7 = r5.getResources().newTheme();
        r7.setTo(r6);
        r7.applyStyle(r99.resourceId, true);
        C0147Db r62 = new C0147Db(r5, 0);
        r62.getTheme().setTo(r7);
        r5 = r62;
    L33:
        this.f505v = new ActionBarContextView(r5, null);
        PopupWindow r63 = new PopupWindow(r5, null, io.github.cherrywechat.R.attr.actionModePopupWindowStyle);
        this.f506w = r63;
        r63.setWindowLayoutType(2);
        this.f506w.setContentView(this.f505v);
        this.f506w.setWidth(-1);
        r5.getTheme().resolveAttribute(io.github.cherrywechat.R.attr.actionBarSize, r99, true);
        this.f505v.setContentHeight(TypedValue.complexToDimensionPixelSize(r99.data, r5.getResources().getDisplayMetrics()));
        this.f506w.setHeight(-2);
        this.f507x = new RunnableC2440r3(this, r3);
        goto L45
    L34:
        ViewStubCompat r910 = (ViewStubCompat) this.f460A.findViewById(io.github.cherrywechat.R.id.action_mode_bar_stub);
        if (r910 == null) goto L45;
        m332A();
        AbstractC2257n0 r64 = this.f498o;
        if (r64 == null) goto L39;
        Context r65 = r64.mo4505e();
    L40:
        if (r65 == null) goto L43;
        r5 = r65;
    L43:
        r910.setLayoutInflater(LayoutInflater.from(r5));
        this.f505v = (ActionBarContextView) r910.m2119a();
        goto L45
    L39:
        r65 = null;
    L45:
        if (this.f505v == null) goto L65;
        C0273GE r911 = this.f508y;
        if (r911 == null) goto L49;
        r911.m554b();
    L49:
        this.f505v.m2081e();
        Context r52 = this.f505v.getContext();
        ActionBarContextView r66 = this.f505v;
        C0900Uy r912 = new C0900Uy();
        r912.f2796c = r52;
        r912.f2797d = r66;
        r912.f2798e = r02;
        MenuC2204lr r53 = new MenuC2204lr(r66.getContext());
        r53.f7671l = 1;
        r912.f2801h = r53;
        r53.f7664e = r912;
        if (((InterfaceC0302H0) r02.f2089b).mo642b(r912, r53) == false) goto L64;
        r912.mo741h();
        this.f505v.m2079c(r912);
        this.f504u = r912;
        if (this.f509z == false) goto L58;
        ViewGroup r913 = this.f460A;
        if (r913 == null) goto L58;
        if (r913.isLaidOut() == false) goto L58;
        this.f505v.setAlpha(0.0f);
        C0273GE r914 = AbstractC2185lE.m4388a(this.f505v);
        r914.m553a(1.0f);
        this.f508y = r914;
        r914.m556d(new C2526t3(r3, this));
    L62:
        if (this.f506w == null) goto L65;
        this.f495l.getDecorView().post(this.f507x);
    L58:
        this.f505v.setAlpha(1.0f);
        this.f505v.setVisibility(0);
        if ((this.f505v.getParent() instanceof View) == false) goto L62;
        View r915 = (View) this.f505v.getParent();
        WeakHashMap r03 = AbstractC2185lE.f7617a;
        AbstractC1255cE.m2370c(r915);
        goto L62
    L64:
        this.f504u = null;
        goto L65
    L74:
        r96 = r1.onWindowStartingSupportActionMode(r02);     // Catch: AbstractMethodError -> L73
    L69:
        m340I();
        return this.f504u;
    L72:
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final boolean m350m(boolean r17, boolean r18) {
        if (this.f476Q == false) goto L5;
        return false;
    L5:
        int r3 = this.f478S;
        if (r3 != (-100)) goto L9;
        r3 = AbstractC2397q3.f8399b;
    L9:
        Context r1 = this.f494k;
        int r4 = m334C(r1, r3);
        int r5 = Build.VERSION.SDK_INT;
        if (r5 >= 33) goto L12;
        C1105Zo r6 = m330p(r1);
    L13:
        if (r18 == true) goto L16;
        if (r6 == null) goto L16;
        r6 = AbstractC2612v3.m5123b(r1.getResources().getConfiguration());
    L16:
        Configuration r8 = m331t(r1, r4, r6, null, false);
        boolean r9 = this.f481V;
        boolean r10 = true;
        Object r11 = this.f493j;
        if (r9 == false) goto L19;
    L32:
        this.f481V = true;
        int r52 = this.f480U;
    L33:
        Configuration r92 = this.f477R;
        if (r92 != null) goto L36;
        r92 = r1.getResources().getConfiguration();
    L36:
        int r12 = r92.uiMode & 48;
        int r13 = r8.uiMode & 48;
        C1105Zo r93 = AbstractC2612v3.m5123b(r92);
        if (r6 != null) goto L39;
        C1105Zo r14 = null;
    L40:
        if (r12 == r13) goto L42;
        int r122 = 512;
    L43:
        if (r14 == null) goto L48;
        if (r93.equals(r14) == true) goto L48;
        r122 = r122 | 8196;
    L48:
        if (((~r52) & r122) == 0) goto L66;
        if (r17 == false) goto L66;
        if (this.f474O == false) goto L66;
        if (f459j0 == true) goto L57;
        if (this.f475P == false) goto L66;
    L57:
        if ((r11 instanceof Activity) == false) goto L66;
        Activity r94 = (Activity) r11;
        if (r94.isChild() == true) goto L66;
        if (Build.VERSION.SDK_INT >= 31) goto L63;
    L65:
        r94.recreate();
        boolean r2 = true;
    L67:
        if (r2 == true) goto L92;
        if (r122 == 0) goto L92;
        if ((r122 & r52) != r122) goto L72;
        boolean r22 = true;
    L73:
        Resources r53 = r1.getResources();
        Configuration r82 = new Configuration(r53.getConfiguration());
        r82.uiMode = (r53.getConfiguration().uiMode & (-49)) | r13;
        if (r14 == null) goto L76;
        AbstractC2612v3.m5125d(r82, r14);
    L76:
        r53.updateConfiguration(r82, null);
        int r54 = this.f479T;
        if (r54 == 0) goto L79;
        r1.setTheme(r54);
        r1.getTheme().applyStyle(this.f479T, true);
    L79:
        if (r22 == true) goto L81;
    L93:
        if (r10 == true) goto L95;
    L102:
        if (r14 == null) goto L104;
        AbstractC2612v3.m5124c(AbstractC2612v3.m5123b(r1.getResources().getConfiguration()));
    L104:
        if (r3 != 0) goto L106;
        m359y(r1).m87n();
    L110:
        if (r3 == 3) goto L112;
        C2784z3 r15 = this.f483X;
        if (r15 == null) goto L118;
        r15.m77c();
    L118:
        return r10;
    L112:
        if (this.f483X != null) goto L114;
        this.f483X = new C2784z3(this, r1);
    L114:
        this.f483X.m87n();
        goto L118
    L106:
        C2784z3 r23 = this.f482W;
        if (r23 == null) goto L110;
        r23.m77c();
        goto L110
    L95:
        if ((r11 instanceof AbstractActivityC1244c3) == false) goto L102;
        if ((r122 & 512) == 0) goto L100;
        ((AbstractActivityC1244c3) r11).onNightModeChanged(r4);
    L100:
        if ((r122 & 4) == 0) goto L102;
        ((AbstractActivityC1244c3) r11).onLocalesChanged(r6);
        goto L102
    L81:
        if ((r11 instanceof Activity) == false) goto L93;
        Activity r24 = (Activity) r11;
        if ((r24 instanceof InterfaceC1061Yn) == false) goto L88;
        if (((C1185ao) ((InterfaceC1061Yn) r24).getLifecycle()).f4064c.m1371a(EnumC0675Pn.f2149c) == false) goto L93;
        r24.onConfigurationChanged(r82);
        goto L93
    L88:
        if (this.f475P == false) goto L93;
        if (this.f476Q == true) goto L93;
        r24.onConfigurationChanged(r82);
        goto L93
    L72:
        r22 = false;
    L92:
        r10 = r2;
        goto L93
    L63:
        if ((r122 & 8192) == 0) goto L65;
        r94.getWindow().getDecorView().setLayoutDirection(r8.getLayoutDirection());
    L66:
        r2 = false;
        goto L67
    L42:
        r122 = 0;
        goto L43
    L39:
        r14 = AbstractC2612v3.m5123b(r8);
        goto L40
    L19:
        if ((r11 instanceof Activity) == false) goto L32;
        PackageManager r95 = r1.getPackageManager();
        if (r95 != null) goto L24;
        r52 = 0;
        goto L33
    L24:
        if (r5 < 29) goto L26;
        int r55 = 269221888;
    L119:
        ActivityInfo r56 = r95.getActivityInfo(new ComponentName(r1, r11.getClass()), r55);     // Catch: PackageManager.NameNotFoundException -> L31
        if (r56 == null) goto L32;
        this.f480U = r56.configChanges;     // Catch: PackageManager.NameNotFoundException -> L31
    L31:
        this.f480U = 0;
        goto L32
    L26:
        r55 = 786432;
        goto L119
    L12:
        r6 = null;
        goto L13
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: n */
    public final void mo241n(MenuC2204lr r6) {
        InterfaceC0449Kc r62 = this.f501r;
        if (r62 == null) goto L47;
        ActionBarOverlayLayout r63 = (ActionBarOverlayLayout) r62;
        r63.m2088k();
        Toolbar r64 = ((C2663wB) r63.f3754e).f9213a;
        if (r64.getVisibility() != 0) goto L47;
        ActionMenuView r65 = r64.f3823a;
        if (r65 == null) goto L47;
        if (r65.f3780s == false) goto L47;
        if (ViewConfiguration.get(this.f494k).hasPermanentMenuKey() == false) goto L20;
        ActionBarOverlayLayout r66 = (ActionBarOverlayLayout) this.f501r;
        r66.m2088k();
        ActionMenuView r67 = ((C2663wB) r66.f3754e).f9213a.f3823a;
        if (r67 == null) goto L47;
        C0130D0 r68 = r67.f3781t;
        if (r68 == null) goto L47;
        if (r68.f322u != null) goto L20;
        if (r68.m219h() == false) goto L47;
    L20:
        Window.Callback r69 = this.f495l.getCallback();
        ActionBarOverlayLayout r2 = (ActionBarOverlayLayout) this.f501r;
        r2.m2088k();
        if (((C2663wB) r2.f3754e).f9213a.m2111o() == false) goto L31;
        ActionBarOverlayLayout r0 = (ActionBarOverlayLayout) this.f501r;
        r0.m2088k();
        ActionMenuView r02 = ((C2663wB) r0.f3754e).f9213a.f3823a;
        if (r02 == null) goto L28;
        C0130D0 r03 = r02.f3781t;
        if (r03 == null) goto L28;
        r03.m214c();
    L28:
        if (this.f476Q == true) goto L49;
        r69.onPanelClosed(108, m360z(0).f336h);
        return;
    L49:
        return;
    L31:
        if (r69 != null) goto L33;
        return;
    L33:
        if (this.f476Q == false) goto L35;
        return;
    L35:
        if (this.f484Y == true) goto L37;
    L39:
        C0133D3 r04 = m360z(0);
        MenuC2204lr r22 = r04.f336h;
        if (r22 != null) goto L42;
        return;
    L42:
        if (r04.f343o == false) goto L44;
        return;
    L44:
        if (r69.onPreparePanel(0, r04.f335g, r22) == false) goto L54;
        r69.onMenuOpened(108, r04.f336h);
        ActionBarOverlayLayout r610 = (ActionBarOverlayLayout) this.f501r;
        r610.m2088k();
        ((C2663wB) r610.f3754e).f9213a.m2117u();
        return;
    L54:
        return;
    L37:
        if ((1 & this.f485Z) == 0) goto L39;
        View r05 = this.f495l.getDecorView();
        RunnableC2440r3 r23 = this.f486a0;
        r05.removeCallbacks(r23);
        r23.run();
    L47:
        C0133D3 r611 = m360z(0);
        r611.f342n = true;
        m354s(r611, false);
        m336E(r611, null);
    }

    /* JADX INFO: renamed from: o */
    public final void m351o(Window r8) {
        if (this.f495l != null) goto L41;
        Window.Callback r1 = r8.getCallback();
        if ((r1 instanceof WindowCallbackC2741y3) == true) goto L39;
        WindowCallbackC2741y3 r0 = new WindowCallbackC2741y3(this, r1);
        this.f496m = r0;
        r8.setCallback(r0);
        Context r02 = this.f494k;
        TypedArray r12 = r02.obtainStyledAttributes(null, f458i0);
        if (r12.hasValue(0) == false) goto L18;
        int r3 = r12.getResourceId(0, 0);
        if (r3 == 0) goto L18;
        C0262G3 r4 = C0262G3.m539a();
        monitor-enter(r4);
        Drawable r03 = r4.f844a.m5351d(r02, r3, true);     // Catch: Throwable -> L15
        monitor-exit(r4);
    L19:
        if (r03 == null) goto L21;
        r8.setBackgroundDrawable(r03);
    L21:
        r12.recycle();
        this.f495l = r8;
        if (Build.VERSION.SDK_INT < 33) goto L44;
        OnBackInvokedDispatcher r82 = this.f491f0;
        if (r82 != null) goto L45;
        Object r04 = this.f493j;
        if (r82 == null) goto L31;
        OnBackInvokedCallback r13 = this.f492g0;
        if (r13 == null) goto L31;
        AbstractC2698x3.m5278c(r82, r13);
        this.f492g0 = null;
    L31:
        if ((r04 instanceof Activity) == false) goto L35;
        Activity r05 = (Activity) r04;
        if (r05.getWindow() == null) goto L35;
        this.f491f0 = AbstractC2698x3.m5276a(r05);
    L36:
        m340I();
        return;
    L35:
        this.f491f0 = null;
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
        if (this.f490e0 != null) goto L10;
        int[] r92 = AbstractC0982Wu.f3075j;
        Context r0 = this.f494k;
        TypedArray r93 = r0.obtainStyledAttributes(r92);
        String r2 = r93.getString(116);
        r93.recycle();
        if (r2 != null) goto L139;
        this.f490e0 = new C2613v4();
        goto L10
    L139:
        this.f490e0 = (C2613v4) r0.getClassLoader().loadClass(r2).getDeclaredConstructor(null).newInstance(null);     // Catch: Throwable -> L9
    L9:
        this.f490e0 = new C2613v4();
    L10:
        C2613v4 r94 = this.f490e0;
        int r02 = AbstractC0573ND.f1867a;
        r94.getClass();
        TypedArray r03 = r11.obtainStyledAttributes(r12, AbstractC0982Wu.f3090y, 0, 0);
        byte r22 = 4;
        int r3 = r03.getResourceId(4, 0);
        r03.recycle();
        if (r3 != 0) goto L13;
    L17:
        Context r04 = r11;
    L18:
        r10.getClass();
        switch(r10.hashCode()) {
            case -1946472170: goto L73;
            case -1455429095: goto L69;
            case -1346021293: goto L65;
            case -938935918: goto L61;
            case -937446323: goto L58;
            case -658531749: goto L54;
            case -339785223: goto L50;
            case 776382189: goto L46;
            case 799298502: goto L42;
            case 1125864064: goto L38;
            case 1413872058: goto L34;
            case 1601505219: goto L30;
            case 1666676343: goto L26;
            case 2001146706: goto L22;
            default: goto L20;
        };
    L20:
        r22 = -1;
    L76:
        switch(r22) {
            case 0: goto L91;
            case 1: goto L90;
            case 2: goto L89;
            case 3: goto L88;
            case 4: goto L87;
            case 5: goto L86;
            case 6: goto L85;
            case 7: goto L84;
            case 8: goto L83;
            case 9: goto L82;
            case 10: goto L81;
            case 11: goto L80;
            case 12: goto L79;
            case 13: goto L78;
            default: goto L77;
        };
    L77:
        View r23 = null;
    L92:
        if (r23 != null) goto L114;
        if (r11 == r04) goto L114;
        Object[] r112 = r94.f9066a;
        if (r10.equals("view") == false) goto L142;
        r10 = r12.getAttributeValue(null, "class");
    L142:
        r112[0] = r04;     // Catch: Throwable -> L106 Exception -> L113
        r112[1] = r12;     // Catch: Throwable -> L106 Exception -> L113
        if ((-1) != r10.indexOf(46)) goto L109;
        int r24 = 0;
    L100:
        String[] r32 = C2613v4.f9064g;     // Catch: Throwable -> L106 Exception -> L113
        if (r24 >= 3) goto L108;
        View r33 = r94.m5126f(r04, r10, r32[r24]);     // Catch: Throwable -> L106 Exception -> L113
        if (r33 != null) goto L104;
        r24 = r24 + 1;
        goto L100
    L104:
        r112[0] = null;
        r112[1] = null;
        r1 = r33;
    L141:
    L115:
        if (r1 == null) goto L138;
        Context r95 = r1.getContext();
        if ((r95 instanceof ContextWrapper) == false) goto L126;
        if (r1.hasOnClickListeners() == false) goto L126;
        TypedArray r96 = r95.obtainStyledAttributes(r12, C2613v4.f9060c);
        String r102 = r96.getString(0);
        if (r102 == null) goto L124;
        r1.setOnClickListener(new ViewOnClickListenerC2570u4(r1, r102));
    L124:
        r96.recycle();
    L126:
        if (Build.VERSION.SDK_INT > 28) goto L138;
        TypedArray r97 = r04.obtainStyledAttributes(r12, C2613v4.f9061d);
        if (r97.hasValue(0) == false) goto L131;
        boolean r103 = r97.getBoolean(0, false);
        WeakHashMap r113 = AbstractC2185lE.f7617a;
        new C1132aE(io.github.cherrywechat.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).m4627f(r1, Boolean.valueOf(r103));
    L131:
        r97.recycle();
        TypedArray r98 = r04.obtainStyledAttributes(r12, C2613v4.f9062e);
        if (r98.hasValue(0) == false) goto L134;
        AbstractC2185lE.m4400m(r1, r98.getString(0));
    L134:
        r98.recycle();
        TypedArray r99 = r04.obtainStyledAttributes(r12, C2613v4.f9063f);
        if (r99.hasValue(0) == false) goto L137;
        boolean r104 = r99.getBoolean(0, false);
        WeakHashMap r114 = AbstractC2185lE.f7617a;
        new C1132aE(io.github.cherrywechat.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).m4627f(r1, Boolean.valueOf(r104));
    L137:
        r99.recycle();
    L138:
        return r1;
    L113:
        r112[0] = r1;
        r112[1] = r1;
        goto L141
    L108:
        r112[0] = null;
        r112[1] = null;
        goto L141
    L109:
        View r910 = r94.m5126f(r04, r10, null);     // Catch: Throwable -> L106 Exception -> L113
        r112[0] = null;
        r112[1] = null;
        r1 = r910;
    L106:
        th = move-exception;
        r112[0] = r1;
        r112[1] = r1;
        throw th;
    L144:
        r112[0] = null;
        r112[1] = null;
    L114:
        r1 = r23;
        goto L115
    L78:
        r23 = r94.mo2500b(r04, r12);
        goto L92
    L79:
        r23 = new C0348I3(r04, r12);
        goto L92
    L80:
        r23 = r94.mo2501c(r04, r12);
        goto L92
    L81:
        r23 = r94.mo2499a(r04, r12);
        goto L92
    L82:
        r23 = new C0520M3(r04, r12, 0);
        goto L92
    L83:
        r23 = new C2527t4(r04, r12);
        goto L92
    L84:
        r23 = r94.mo2502d(r04, r12);
        goto L92
    L85:
        r23 = new C1394f4(r04, r12);
        goto L92
    L86:
        r23 = new C0820T3(r04, r12);
        goto L92
    L87:
        r23 = new C0434K3(r04, r12, io.github.cherrywechat.R.attr.imageButtonStyle);
        goto L92
    L88:
        r23 = r94.mo2503e(r04, r12);
        goto L92
    L89:
        r23 = new C0563N3(r04, r12);
        goto L92
    L90:
        r23 = new C1525i3(r04, r12);
        goto L92
    L91:
        r23 = new C0734R3(r04, r12);
        goto L92
    L22:
        if (r10.equals("Button") == false) goto L148;
        r22 = 13;
        goto L76
    L148:
        r22 = -1;
        goto L76
    L26:
        if (r10.equals("EditText") == false) goto L149;
        r22 = 12;
        goto L76
    L149:
        r22 = -1;
        goto L76
    L30:
        if (r10.equals("CheckBox") == false) goto L150;
        r22 = 11;
        goto L76
    L150:
        r22 = -1;
        goto L76
    L34:
        if (r10.equals("AutoCompleteTextView") == false) goto L151;
        r22 = 10;
        goto L76
    L151:
        r22 = -1;
        goto L76
    L38:
        if (r10.equals("ImageView") == false) goto L152;
        r22 = 9;
        goto L76
    L152:
        r22 = -1;
        goto L76
    L42:
        if (r10.equals("ToggleButton") == false) goto L153;
        r22 = 8;
        goto L76
    L153:
        r22 = -1;
        goto L76
    L46:
        if (r10.equals("RadioButton") == false) goto L154;
        r22 = 7;
        goto L76
    L154:
        r22 = -1;
        goto L76
    L50:
        if (r10.equals("Spinner") == false) goto L155;
        r22 = 6;
        goto L76
    L155:
        r22 = -1;
        goto L76
    L54:
        if (r10.equals("SeekBar") == false) goto L156;
        r22 = 5;
        goto L76
    L156:
        r22 = -1;
        goto L76
    L58:
        if (r10.equals("ImageButton") == true) goto L76;
        r22 = -1;
        goto L76
    L61:
        if (r10.equals("TextView") == false) goto L158;
        r22 = 3;
        goto L76
    L158:
        r22 = -1;
        goto L76
    L65:
        if (r10.equals("MultiAutoCompleteTextView") == false) goto L159;
        r22 = 2;
        goto L76
    L159:
        r22 = -1;
        goto L76
    L69:
        if (r10.equals("CheckedTextView") == false) goto L160;
        r22 = 1;
        goto L76
    L160:
        r22 = -1;
        goto L76
    L73:
        if (r10.equals("RatingBar") == false) goto L161;
        r22 = 0;
        goto L76
    L161:
        r22 = -1;
        goto L76
    L13:
        if ((r11 instanceof C0147Db) == true) goto L15;
    L16:
        r04 = new C0147Db(r11, r3);
        goto L18
    L15:
        if (((C0147Db) r11).f379a == r3) goto L17;
        goto L16
    }

    /* JADX INFO: renamed from: q */
    public final void m352q(int r4, C0133D3 r5, MenuC2204lr r6) {
        if (r6 != null) goto L10;
        if (r5 != null) goto L8;
        if (r4 < 0) goto L8;
        C0133D3[] r0 = this.f471L;
        if (r4 >= r0.length) goto L8;
        r5 = r0[r4];
    L8:
        if (r5 == null) goto L10;
        r6 = r5.f336h;
    L10:
        if (r5 == null) goto L15;
        if (r5.f341m == true) goto L15;
        return;
    L15:
        if (this.f476Q == true) goto L23;
        WindowCallbackC2741y3 r52 = this.f496m;
        Window.Callback r02 = this.f495l.getCallback();
        r52.getClass();
        r52.f9349e = true;     // Catch: Throwable -> L20
        r02.onPanelClosed(r4, r6);     // Catch: Throwable -> L20
        r52.f9349e = false;
        return;
    L20:
        th = move-exception;
        r52.f9349e = false;
        throw th;
    }

    /* JADX INFO: renamed from: r */
    public final void m353r(MenuC2204lr r3) {
        if (this.f470K == false) goto L5;
        return;
    L5:
        this.f470K = true;
        ActionBarOverlayLayout r0 = (ActionBarOverlayLayout) this.f501r;
        r0.m2088k();
        ActionMenuView r02 = ((C2663wB) r0.f3754e).f9213a.f3823a;
        if (r02 == null) goto L14;
        C0130D0 r03 = r02.f3781t;
        if (r03 == null) goto L14;
        r03.m214c();
        C2781z0 r04 = r03.f321t;
        if (r04 == null) goto L14;
        if (r04.m5291b() == false) goto L14;
        r04.f9323i.dismiss();
    L14:
        Window.Callback r05 = this.f495l.getCallback();
        if (r05 != null) goto L17;
    L19:
        this.f470K = false;
        return;
    L17:
        if (this.f476Q == true) goto L19;
        r05.onPanelClosed(108, r3);
        goto L19
    }

    /* JADX INFO: renamed from: s */
    public final void m354s(C0133D3 r4, boolean r5) {
        if (r5 == true) goto L4;
    L11:
        WindowManager r0 = (WindowManager) this.f494k.getSystemService("window");
        if (r0 != null) goto L14;
    L20:
        r4.f339k = false;
        r4.f340l = false;
        r4.f341m = false;
        r4.f334f = null;
        r4.f342n = true;
        if (this.f472M != r4) goto L24;
        this.f472M = null;
    L24:
        if (r4.f329a != 0) goto L27;
        m340I();
        return;
    L27:
        return;
    L14:
        if (r4.f341m == false) goto L20;
        C0090C3 r2 = r4.f333e;
        if (r2 == null) goto L20;
        r0.removeView(r2);
        if (r5 == false) goto L20;
        m352q(r4.f329a, r4, null);
        goto L20
    L4:
        if (r4.f329a != 0) goto L11;
        InterfaceC0449Kc r02 = this.f501r;
        if (r02 == null) goto L11;
        ActionBarOverlayLayout r03 = (ActionBarOverlayLayout) r02;
        r03.m2088k();
        if (((C2663wB) r03.f3754e).f9213a.m2111o() == false) goto L11;
        m353r(r4.f336h);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m355u(KeyEvent r7) {
        Object r0 = this.f493j;
        if ((r0 instanceof InterfaceC0974Wm) == true) goto L7;
        if ((r0 instanceof DialogInterfaceC2697x2) == true) goto L7;
    L9:
        boolean r3 = true;
        if (r7.getKeyCode() != 82) goto L19;
        WindowCallbackC2741y3 r02 = this.f496m;
        Window.Callback r4 = this.f495l.getCallback();
        r02.getClass();
        r02.f9348d = true;     // Catch: Throwable -> L16
        boolean r42 = r4.dispatchKeyEvent(r7);     // Catch: Throwable -> L16
        r02.f9348d = false;
        if (r42 == false) goto L19;
    L89:
        return true;
    L16:
        th = move-exception;
        r02.f9348d = false;
        throw th;
    L19:
        int r03 = r7.getKeyCode();
        if (r7.getAction() != 0) goto L36;
        if (r03 == 4) goto L31;
        if (r03 == 82) goto L25;
    L90:
        return false;
    L25:
        if (r7.getRepeatCount() != 0) goto L89;
        C0133D3 r04 = m360z(0);
        if (r04.f341m == true) goto L89;
        m338G(r04, r7);
        return true;
    L31:
        if ((r7.getFlags() & 128) != 0) goto L34;
        r3 = false;
    L34:
        this.f473N = r3;
        return false;
    L36:
        if (r03 == 4) goto L88;
        if (r03 != 82) goto L90;
        if (this.f504u != null) goto L89;
        C0133D3 r05 = m360z(0);
        InterfaceC0449Kc r2 = this.f501r;
        Context r43 = this.f494k;
        if (r2 == null) goto L66;
        ActionBarOverlayLayout r22 = (ActionBarOverlayLayout) r2;
        r22.m2088k();
        Toolbar r23 = ((C2663wB) r22.f3754e).f9213a;
        if (r23.getVisibility() != 0) goto L66;
        ActionMenuView r24 = r23.f3823a;
        if (r24 == null) goto L66;
        if (r24.f3780s == false) goto L66;
        if (ViewConfiguration.get(r43).hasPermanentMenuKey() == true) goto L66;
        ActionBarOverlayLayout r25 = (ActionBarOverlayLayout) this.f501r;
        r25.m2088k();
        if (((C2663wB) r25.f3754e).f9213a.m2111o() == false) goto L55;
        ActionBarOverlayLayout r72 = (ActionBarOverlayLayout) this.f501r;
        r72.m2088k();
        ActionMenuView r73 = ((C2663wB) r72.f3754e).f9213a.f3823a;
        if (r73 == null) goto L80;
        C0130D0 r74 = r73.f3781t;
        if (r74 == null) goto L80;
        if (r74.m214c() == false) goto L80;
    L79:
        boolean r75 = true;
    L82:
        if (r75 == false) goto L89;
        AudioManager r76 = (AudioManager) r43.getApplicationContext().getSystemService("audio");
        if (r76 == null) goto L89;
        r76.playSoundEffect(0);
        return true;
    L80:
        r75 = false;
        goto L82
    L55:
        if (this.f476Q == true) goto L80;
        if (m338G(r05, r7) == false) goto L80;
        ActionBarOverlayLayout r77 = (ActionBarOverlayLayout) this.f501r;
        r77.m2088k();
        r75 = ((C2663wB) r77.f3754e).f9213a.m2117u();
    L66:
        boolean r26 = r05.f341m;
        if (r26 == false) goto L69;
    L81:
        m354s(r05, true);
        r75 = r26;
        goto L82
    L69:
        if (r05.f340l == true) goto L81;
        if (r05.f339k == false) goto L80;
        if (r05.f343o == false) goto L76;
        r05.f339k = false;
        boolean r27 = m338G(r05, r7);
    L77:
        if (r27 == false) goto L80;
        m336E(r05, r7);
        goto L79
    L76:
        r27 = true;
        goto L77
    L88:
        if (m335D() == false) goto L90;
    L7:
        if (this.f495l.getDecorView() == null) goto L9;
        WeakHashMap r06 = AbstractC2185lE.f7617a;
        goto L9
    }

    /* JADX INFO: renamed from: v */
    public final void m356v(int r4) {
        C0133D3 r0 = m360z(r4);
        if (r0.f336h == null) goto L8;
        Bundle r1 = new Bundle();
        r0.f336h.m4439t(r1);
        if (r1.size() <= 0) goto L7;
        r0.f344p = r1;
    L7:
        r0.f336h.m4442w();
        r0.f336h.clear();
    L8:
        r0.f343o = true;
        r0.f342n = true;
        if (r4 == 108) goto L12;
        if (r4 == 0) goto L12;
        return;
    L12:
        if (this.f501r == null) goto L16;
        C0133D3 r02 = m360z(0);
        r02.f339k = false;
        m338G(r02, null);
        return;
    }

    /* JADX INFO: renamed from: w */
    public final void m357w() {
        if (this.f509z == true) goto L98;
        Context r0 = this.f494k;
        int[] r1 = AbstractC0982Wu.f3075j;
        TypedArray r2 = r0.obtainStyledAttributes(r1);
        if (r2.hasValue(117) == false) goto L96;
        int r5 = 0;
        int r7 = 1;
        if (r2.getBoolean(126, false) == false) goto L10;
        mo344g(1);
    L13:
        if (r2.getBoolean(118, false) == false) goto L16;
        mo344g(109);
    L16:
        if (r2.getBoolean(119, false) == false) goto L18;
        mo344g(10);
    L18:
        this.f468I = r2.getBoolean(0, false);
        r2.recycle();
        m358x();
        this.f495l.getDecorView();
        LayoutInflater r22 = LayoutInflater.from(r0);
        if (this.f469J == true) goto L40;
        if (this.f468I == false) goto L24;
        ViewGroup r23 = (ViewGroup) r22.inflate(io.github.cherrywechat.R.layout.abc_dialog_title_material, null);
        this.f466G = false;
        this.f465F = false;
    L43:
        if (r23 == null) goto L95;
        C2483s3 r3 = new C2483s3(this, r5);
        WeakHashMap r4 = AbstractC2185lE.f7617a;
        AbstractC1360eE.m2640l(r23, r3);
        if (this.f501r != null) goto L100;
        this.f461B = (TextView) r23.findViewById(io.github.cherrywechat.R.id.title);
    L100:
        Method r32 = r23.getClass().getMethod("makeOptionalFitsSystemWindows", null);     // Catch: Throwable -> L99
        if (r32.isAccessible() == true) goto L50;
        r32.setAccessible(true);     // Catch: Throwable -> L99
    L50:
        r32.invoke(r23, null);     // Catch: Throwable -> L99
    L51:
        ContentFrameLayout r33 = (ContentFrameLayout) r23.findViewById(io.github.cherrywechat.R.id.action_bar_activity_content);
        ViewGroup r42 = (ViewGroup) this.f495l.findViewById(R.id.content);
        if (r42 != null) goto L54;
    L59:
        this.f495l.setContentView(r23);
        r33.setAttachListener(new C2483s3(this, r7));
        this.f460A = r23;
        Object r24 = this.f493j;
        if ((r24 instanceof Activity) == false) goto L62;
        CharSequence r25 = ((Activity) r24).getTitle();
    L64:
        if (TextUtils.isEmpty(r25) == true) goto L74;
        InterfaceC0449Kc r34 = this.f501r;
        if (r34 == null) goto L68;
        r34.setWindowTitle(r25);
        goto L74
    L68:
        AbstractC2257n0 r35 = this.f498o;
        if (r35 == null) goto L71;
        r35.mo4511o(r25);
        goto L74
    L71:
        TextView r36 = this.f461B;
        if (r36 == null) goto L74;
        r36.setText(r25);
    L74:
        ContentFrameLayout r26 = (ContentFrameLayout) this.f460A.findViewById(R.id.content);
        View r37 = this.f495l.getDecorView();
        r26.f3798g.set(r37.getPaddingLeft(), r37.getPaddingTop(), r37.getPaddingRight(), r37.getPaddingBottom());
        if (r26.isLaidOut() == false) goto L77;
        r26.requestLayout();
    L77:
        TypedArray r02 = r0.obtainStyledAttributes(r1);
        r02.getValue(124, r26.getMinWidthMajor());
        r02.getValue(125, r26.getMinWidthMinor());
        if (r02.hasValue(122) == false) goto L81;
        r02.getValue(122, r26.getFixedWidthMajor());
    L81:
        if (r02.hasValue(123) == false) goto L84;
        r02.getValue(123, r26.getFixedWidthMinor());
    L84:
        if (r02.hasValue(120) == false) goto L87;
        r02.getValue(120, r26.getFixedHeightMajor());
    L87:
        if (r02.hasValue(121) == false) goto L89;
        r02.getValue(121, r26.getFixedHeightMinor());
    L89:
        r02.recycle();
        r26.requestLayout();
        this.f509z = true;
        C0133D3 r03 = m360z(0);
        if (this.f476Q == false) goto L92;
        return;
    L92:
        if (r03.f336h != null) goto L104;
        m333B(108);
        return;
    L104:
        return;
    L62:
        r25 = this.f500q;
    L54:
        if (r42.getChildCount() <= 0) goto L56;
        View r10 = r42.getChildAt(0);
        r42.removeViewAt(0);
        r33.addView(r10);
        goto L54
    L56:
        r42.setId(-1);
        r33.setId(R.id.content);
        if ((r42 instanceof FrameLayout) == false) goto L59;
        ((FrameLayout) r42).setForeground(null);
        goto L59
    L95:
        throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f465F + ", windowActionBarOverlay: " + this.f466G + ", android:windowIsFloating: " + this.f468I + ", windowActionModeOverlay: " + this.f467H + ", windowNoTitle: " + this.f469J + " }");
    L24:
        if (this.f465F == false) goto L38;
        TypedValue r27 = new TypedValue();
        r0.getTheme().resolveAttribute(io.github.cherrywechat.R.attr.actionBarTheme, r27, true);
        if (r27.resourceId == 0) goto L28;
        Context r38 = new C0147Db(r0, r27.resourceId);
    L29:
        r23 = (ViewGroup) LayoutInflater.from(r38).inflate(io.github.cherrywechat.R.layout.abc_screen_toolbar, null);
        InterfaceC0449Kc r39 = (InterfaceC0449Kc) r23.findViewById(io.github.cherrywechat.R.id.decor_content_parent);
        this.f501r = r39;
        r39.setWindowCallback(this.f495l.getCallback());
        if (this.f466G == false) goto L33;
        ((ActionBarOverlayLayout) this.f501r).m2087j(109);
    L33:
        if (this.f463D == false) goto L36;
        ((ActionBarOverlayLayout) this.f501r).m2087j(2);
    L36:
        if (this.f464E == false) goto L43;
        ((ActionBarOverlayLayout) this.f501r).m2087j(5);
        goto L43
    L28:
        r38 = r0;
        goto L29
    L38:
        r23 = null;
        goto L43
    L40:
        if (this.f467H == false) goto L42;
        r23 = (ViewGroup) r22.inflate(io.github.cherrywechat.R.layout.abc_screen_simple_overlay_action_mode, null);
        goto L43
    L42:
        r23 = (ViewGroup) r22.inflate(io.github.cherrywechat.R.layout.abc_screen_simple, null);
        goto L43
    L10:
        if (r2.getBoolean(117, false) == false) goto L13;
        mo344g(108);
        goto L13
    L96:
        r2.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* JADX INFO: renamed from: x */
    public final void m358x() {
        if (this.f495l != null) goto L8;
        Object r0 = this.f493j;
        if ((r0 instanceof Activity) == false) goto L8;
        m351o(((Activity) r0).getWindow());
    L8:
        if (this.f495l == null) goto L11;
        return;
    L11:
        throw new IllegalStateException("We have not been given a Window");
    }

    /* JADX INFO: renamed from: y */
    public final AbstractC0047B3 m359y(Context r4) {
        if (this.f482W != null) goto L9;
        if (C2656w4.f9194g != null) goto L7;
        Context r42 = r4.getApplicationContext();
        C2656w4.f9194g = new C2656w4(r42, (LocationManager) r42.getSystemService("location"));
    L7:
        this.f482W = new C2784z3(this, C2656w4.f9194g);
    L9:
        return this.f482W;
    }

    /* JADX INFO: renamed from: z */
    public final C0133D3 m360z(int r5) {
        C0133D3[] r0 = this.f471L;
        if (r0 != null) goto L5;
    L6:
        C0133D3[] r2 = new C0133D3[r5 + 1];
        if (r0 == null) goto L9;
        System.arraycopy(r0, 0, r2, 0, r0.length);
    L9:
        this.f471L = r2;
        r0 = r2;
    L10:
        C0133D3 r22 = r0[r5];
        if (r22 != null) goto L14;
        C0133D3 r23 = new C0133D3();
        r23.f329a = r5;
        r23.f342n = false;
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
