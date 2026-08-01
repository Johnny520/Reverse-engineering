package p047I0;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import com.bumptech.glide.AbstractC1922d;
import com.bumptech.glide.AbstractC1923e;
import com.bumptech.glide.AbstractC1924f;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import me.dartcv.nuke.R;
import p000A.C0038T0;
import p000A.C0066i0;
import p000A.C0072l0;
import p001A0.C0102b;
import p001A0.C0111k;
import p002A1.AbstractC0116E;
import p002A1.AbstractC0142o;
import p002A1.C0115D;
import p002A1.C0125N;
import p002A1.C0126O;
import p002A1.InterfaceC0127P;
import p002A1.InterfaceC0132e;
import p002A1.InterfaceC0145r;
import p007B0.C0172E;
import p007B0.C0173F;
import p007B0.C0176I;
import p007B0.C0186T;
import p007B0.C0187a;
import p007B0.C0190d;
import p007B0.C0191e;
import p007B0.C0197k;
import p007B0.C0211y;
import p007B0.C0212z;
import p007B0.InterfaceC0195i;
import p007B0.InterfaceC0206t;
import p007B0.InterfaceC0207u;
import p011B4.AbstractC0231b;
import p019D1.C0260a;
import p021D3.RunnableC0270g;
import p023E0.AbstractC0277a;
import p027E4.C0330q;
import p028F.C0354o;
import p028F.RunnableC0342c;
import p029F0.AbstractC0389a0;
import p029F0.AbstractC0395d0;
import p029F0.AbstractC0435z;
import p029F0.C0374L;
import p029F0.C0401g0;
import p029F0.RunnableC0418p;
import p035G0.C0470b;
import p041H0.AbstractC0596h0;
import p041H0.AbstractC0599j;
import p041H0.AbstractC0601k;
import p041H0.C0562G0;
import p041H0.C0564I;
import p041H0.C0566K;
import p041H0.C0568M;
import p041H0.C0577W;
import p041H0.C0578X;
import p041H0.C0580Z;
import p041H0.C0583b;
import p041H0.C0590e0;
import p041H0.C0613q;
import p041H0.C0618s0;
import p041H0.EnumC0561G;
import p041H0.EnumC0621u;
import p041H0.InterfaceC0610o0;
import p041H0.InterfaceC0612p0;
import p041H0.InterfaceC0614q0;
import p041H0.InterfaceC0624v0;
import p041H0.InterfaceC0626w0;
import p041H0.InterfaceC0628x0;
import p048I1.InterfaceC0782g;
import p049I2.AbstractC0797o;
import p051J.InputConnectionC0830v;
import p056K2.C0881g;
import p056K2.C0891q;
import p056K2.InterfaceC0875a;
import p061L2.AbstractC0972l;
import p061L2.C0971k;
import p069N2.C1019a;
import p072O0.C1031b;
import p072O0.C1037h;
import p072O0.C1038i;
import p072O0.ScrollCaptureCallbackC1033d;
import p074O2.InterfaceC1051i;
import p077P0.AbstractC1124k;
import p077P0.AbstractC1132s;
import p077P0.C1114a;
import p077P0.C1118e;
import p077P0.C1125l;
import p077P0.C1128o;
import p077P0.C1129p;
import p077P0.C1130q;
import p082Q0.C1168b;
import p092S0.C1259L;
import p092S0.C1269g;
import p095T.AbstractC1385s;
import p095T.C1311F;
import p095T.C1357e;
import p095T.C1366i0;
import p095T.InterfaceC1359f;
import p105V.C1483e;
import p110W0.InterfaceC1579d;
import p110W0.InterfaceC1580e;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p115X0.C1636k;
import p115X0.C1640o;
import p115X0.C1646u;
import p115X0.C1647v;
import p115X0.C1649x;
import p115X0.InputConnectionC1639n;
import p115X0.InputConnectionC1642q;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1676u;
import p117X2.C1660e;
import p117X2.C1675t;
import p121Y1.C1753n;
import p127Z2.AbstractC1784a;
import p135b.C1836x;
import p140c0.C1884a;
import p140c0.C1886c;
import p140c0.InterfaceC1887d;
import p146d0.AbstractC1950a;
import p153e1.C2005a;
import p153e1.C2009e;
import p153e1.C2015k;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p158f0.AbstractC2082n;
import p158f0.C2087s;
import p158f0.C2088t;
import p160f3.AbstractC2162v;
import p164g1.AbstractC2179a;
import p169h0.AbstractC2193b;
import p169h0.AbstractC2206o;
import p169h0.C2209r;
import p170h1.C2233x;
import p175i0.AbstractC2274i;
import p175i0.C2268c;
import p175i0.C2273h;
import p175i0.C2275j;
import p175i0.InterfaceC2272g;
import p179i4.AbstractC2352g;
import p181j0.ViewOnAttachStateChangeListenerC2369d;
import p186k.AbstractC2429k;
import p186k.C2404A;
import p186k.C2408E;
import p186k.C2433o;
import p186k.C2439u;
import p186k.C2440v;
import p187k0.ViewOnDragListenerC2446b;
import p198m0.AbstractC2573d;
import p198m0.AbstractC2577h;
import p198m0.C2567A;
import p198m0.C2575f;
import p198m0.C2580k;
import p198m0.C2584o;
import p198m0.C2588s;
import p198m0.EnumC2594y;
import p198m0.InterfaceC2579j;
import p198m0.InterfaceC2581l;
import p204n0.C2684c;
import p211o0.AbstractC2767z;
import p211o0.C2730E;
import p211o0.C2743b;
import p211o0.C2746e;
import p211o0.C2761t;
import p211o0.InterfaceC2765x;
import p229r1.AbstractC3092v;
import p256w0.InterfaceC3388a;
import p261x0.C3444a;
import p261x0.C3446c;
import p261x0.InterfaceC3445b;
import p267y0.C3479a;
import p267y0.InterfaceC3481c;

/* JADX INFO: renamed from: I0.y */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0772y extends ViewGroup implements InterfaceC0614q0, InterfaceC0628x0, InterfaceC0195i, InterfaceC0132e, InterfaceC0610o0, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, InterfaceC2579j {

    /* JADX INFO: renamed from: N0 */
    public static Class f2420N0;

    /* JADX INFO: renamed from: O0 */
    public static Method f2421O0;

    /* JADX INFO: renamed from: P0 */
    public static Method f2422P0;

    /* JADX INFO: renamed from: Q0 */
    public static final C2404A f2423Q0 = new C2404A();

    /* JADX INFO: renamed from: R0 */
    public static RunnableC0746m f2424R0;

    /* JADX INFO: renamed from: S0 */
    public static Method f2425S0;

    /* JADX INFO: renamed from: A */
    public final C1130q f2426A;

    /* JADX INFO: renamed from: A0 */
    public final C2404A f2427A0;

    /* JADX INFO: renamed from: B */
    public final ViewOnAttachStateChangeListenerC0667E f2428B;

    /* JADX INFO: renamed from: B0 */
    public float f2429B0;

    /* JADX INFO: renamed from: C */
    public ViewOnAttachStateChangeListenerC2369d f2430C;

    /* JADX INFO: renamed from: C0 */
    public float f2431C0;

    /* JADX INFO: renamed from: D */
    public final C0731h f2432D;

    /* JADX INFO: renamed from: D0 */
    public final RunnableC0766v f2433D0;

    /* JADX INFO: renamed from: E */
    public final C2746e f2434E;

    /* JADX INFO: renamed from: E0 */
    public final RunnableC0743l f2435E0;

    /* JADX INFO: renamed from: F */
    public final C2275j f2436F;

    /* JADX INFO: renamed from: F0 */
    public boolean f2437F0;

    /* JADX INFO: renamed from: G */
    public final C2404A f2438G;

    /* JADX INFO: renamed from: G0 */
    public final C0773y0 f2439G0;

    /* JADX INFO: renamed from: H */
    public C2404A f2440H;

    /* JADX INFO: renamed from: H0 */
    public final C0764u f2441H0;

    /* JADX INFO: renamed from: I */
    public boolean f2442I;

    /* JADX INFO: renamed from: I0 */
    public final InterfaceC0732h0 f2443I0;

    /* JADX INFO: renamed from: J */
    public boolean f2444J;

    /* JADX INFO: renamed from: J0 */
    public boolean f2445J0;

    /* JADX INFO: renamed from: K */
    public final C0197k f2446K;

    /* JADX INFO: renamed from: K0 */
    public final C0066i0 f2447K0;

    /* JADX INFO: renamed from: L */
    public final C0212z f2448L;

    /* JADX INFO: renamed from: L0 */
    public View f2449L0;

    /* JADX INFO: renamed from: M */
    public final C1366i0 f2450M;

    /* JADX INFO: renamed from: M0 */
    public final C0760s f2451M0;

    /* JADX INFO: renamed from: N */
    public final C0173F f2452N;

    /* JADX INFO: renamed from: O */
    public final C2268c f2453O;

    /* JADX INFO: renamed from: P */
    public boolean f2454P;

    /* JADX INFO: renamed from: Q */
    public final C0737j f2455Q;

    /* JADX INFO: renamed from: R */
    public final C0734i f2456R;

    /* JADX INFO: renamed from: S */
    public final C0618s0 f2457S;

    /* JADX INFO: renamed from: T */
    public boolean f2458T;

    /* JADX INFO: renamed from: U */
    public C0720d0 f2459U;

    /* JADX INFO: renamed from: V */
    public C2005a f2460V;

    /* JADX INFO: renamed from: W */
    public boolean f2461W;

    /* JADX INFO: renamed from: a0 */
    public final C0578X f2462a0;

    /* JADX INFO: renamed from: b0 */
    public long f2463b0;

    /* JADX INFO: renamed from: c0 */
    public final int[] f2464c0;

    /* JADX INFO: renamed from: d */
    public long f2465d;

    /* JADX INFO: renamed from: d0 */
    public final float[] f2466d0;

    /* JADX INFO: renamed from: e */
    public final boolean f2467e;

    /* JADX INFO: renamed from: e0 */
    public final float[] f2468e0;

    /* JADX INFO: renamed from: f */
    public C3479a f2469f;

    /* JADX INFO: renamed from: f0 */
    public final float[] f2470f0;

    /* JADX INFO: renamed from: g */
    public final C0566K f2471g;

    /* JADX INFO: renamed from: g0 */
    public long f2472g0;

    /* JADX INFO: renamed from: h */
    public InterfaceC0664C0 f2473h;

    /* JADX INFO: renamed from: h0 */
    public boolean f2474h0;

    /* JADX INFO: renamed from: i */
    public C0666D0 f2475i;

    /* JADX INFO: renamed from: i0 */
    public long f2476i0;

    /* JADX INFO: renamed from: j */
    public InterfaceC1887d f2477j;

    /* JADX INFO: renamed from: j0 */
    public final C1366i0 f2478j0;

    /* JADX INFO: renamed from: k */
    public final C0971k f2479k;

    /* JADX INFO: renamed from: k0 */
    public final C1311F f2480k0;

    /* JADX INFO: renamed from: l */
    public final RunnableC0743l f2481l;

    /* JADX INFO: renamed from: l0 */
    public InterfaceC1601c f2482l0;

    /* JADX INFO: renamed from: m */
    public final C1366i0 f2483m;

    /* JADX INFO: renamed from: m0 */
    public final C1649x f2484m0;

    /* JADX INFO: renamed from: n */
    public final View f2485n;

    /* JADX INFO: renamed from: n0 */
    public final C1647v f2486n0;

    /* JADX INFO: renamed from: o */
    public final boolean f2487o;

    /* JADX INFO: renamed from: o0 */
    public final AtomicReference f2488o0;

    /* JADX INFO: renamed from: p */
    public final C2584o f2489p;

    /* JADX INFO: renamed from: p0 */
    public final C0761s0 f2490p0;

    /* JADX INFO: renamed from: q */
    public InterfaceC1051i f2491q;

    /* JADX INFO: renamed from: q0 */
    public final C0775z0 f2492q0;

    /* JADX INFO: renamed from: r */
    public final ViewOnDragListenerC2446b f2493r;

    /* JADX INFO: renamed from: r0 */
    public final C1366i0 f2494r0;

    /* JADX INFO: renamed from: s */
    public final C0662B0 f2495s;

    /* JADX INFO: renamed from: s0 */
    public final C1366i0 f2496s0;

    /* JADX INFO: renamed from: t */
    public final C2761t f2497t;

    /* JADX INFO: renamed from: t0 */
    public final C0759r0 f2498t0;

    /* JADX INFO: renamed from: u */
    public final C0717c0 f2499u;

    /* JADX INFO: renamed from: u0 */
    public final C3446c f2500u0;

    /* JADX INFO: renamed from: v */
    public final RunnableC0418p f2501v;

    /* JADX INFO: renamed from: v0 */
    public final C0470b f2502v0;

    /* JADX INFO: renamed from: w */
    public final C0564I f2503w;

    /* JADX INFO: renamed from: w0 */
    public final C0698U f2504w0;

    /* JADX INFO: renamed from: x */
    public final C2439u f2505x;

    /* JADX INFO: renamed from: x0 */
    public MotionEvent f2506x0;

    /* JADX INFO: renamed from: y */
    public final C1168b f2507y;

    /* JADX INFO: renamed from: y0 */
    public long f2508y0;

    /* JADX INFO: renamed from: z */
    public final ViewTreeObserverOnGlobalLayoutListenerC0772y f2509z;

    /* JADX INFO: renamed from: z0 */
    public final C0038T0 f2510z0;

    public ViewTreeObserverOnGlobalLayoutListenerC0772y(Context context, InterfaceC1051i interfaceC1051i) {
        super(context);
        this.f2465d = 9205357640488583168L;
        int i5 = 1;
        this.f2467e = true;
        this.f2471g = new C0566K();
        this.f2477j = C1884a.f6406d;
        this.f2479k = new C0971k();
        this.f2481l = new RunnableC0743l(this, 0);
        C2009e c2009eM1377a = AbstractC0797o.m1377a(context);
        C1357e c1357e = C1357e.f4796h;
        this.f2483m = new C1366i0(c2009eM1377a, c1357e);
        int i6 = Build.VERSION.SDK_INT;
        boolean z5 = i6 >= 35;
        this.f2487o = z5;
        C1118e c1118e = new C1118e();
        this.f2489p = new C2584o(this, this);
        this.f2491q = interfaceC1051i;
        this.f2493r = new ViewOnDragListenerC2446b();
        this.f2495s = new C0662B0();
        this.f2497t = new C2761t();
        this.f2499u = new C0717c0(ViewConfiguration.get(context));
        this.f2501v = new RunnableC0418p();
        C0564I c0564i = new C0564I(3);
        c0564i.m819c0(C0401g0.f1225b);
        c0564i.m815Z(getDensity());
        c0564i.m823e0(getViewConfiguration());
        c0564i.m821d0(new C0768w(this).mo4021c(((C2584o) getFocusOwner()).f8226e).mo4021c(m5899getDragAndDropManager().f7907c));
        this.f2503w = c0564i;
        C2439u c2439u = AbstractC2429k.f7850a;
        this.f2505x = new C2439u();
        getLayoutNodes();
        this.f2507y = new C1168b();
        this.f2509z = this;
        this.f2426A = new C1130q(getRoot(), c1118e, getLayoutNodes());
        ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E = new ViewOnAttachStateChangeListenerC0667E(this);
        this.f2428B = viewOnAttachStateChangeListenerC0667E;
        this.f2430C = new ViewOnAttachStateChangeListenerC2369d(this, new C0354o(0, this, AbstractC0681L.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0, 1));
        C0731h c0731h = new C0731h();
        Object systemService = context.getSystemService("accessibility");
        AbstractC1665j.m2983c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f2432D = c0731h;
        this.f2434E = new C2746e(this);
        this.f2436F = new C2275j();
        this.f2438G = new C2404A();
        this.f2446K = new C0197k();
        C0564I root = getRoot();
        C0212z c0212z = new C0212z();
        c0212z.f741b = root;
        c0212z.f742c = new C0191e(root.f1699J.f1893c);
        c0212z.f743d = new C0066i0(1);
        c0212z.f744e = new C0613q();
        this.f2448L = c0212z;
        this.f2450M = AbstractC1385s.m2629s(new Configuration(context.getResources().getConfiguration()));
        this.f2452N = new C0173F(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw AbstractC0231b.m396g("Autofill service could not be located.");
        }
        this.f2453O = new C2268c(new C1753n(7, autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.f2455Q = new C0737j(context);
        this.f2456R = new C0734i(m5898getClipboardManager());
        this.f2457S = new C0618s0(new C0758r(this, i5));
        this.f2462a0 = new C0578X(getRoot());
        long j5 = Integer.MAX_VALUE;
        this.f2463b0 = (j5 & 4294967295L) | (j5 << 32);
        this.f2464c0 = new int[]{0, 0};
        float[] fArrM4782a = C2730E.m4782a();
        this.f2466d0 = fArrM4782a;
        this.f2468e0 = C2730E.m4782a();
        this.f2470f0 = C2730E.m4782a();
        this.f2472g0 = -1L;
        this.f2476i0 = 9187343241974906880L;
        this.f2478j0 = AbstractC1385s.m2629s(null);
        this.f2480k0 = AbstractC1385s.m2624n(new C0764u(this, i5));
        C1649x c1649x = new C1649x(getView(), this);
        this.f2484m0 = c1649x;
        this.f2486n0 = new C1647v(c1649x);
        this.f2488o0 = new AtomicReference(null);
        this.f2490p0 = new C0761s0(getTextInputService());
        this.f2492q0 = new C0775z0();
        this.f2494r0 = new C1366i0(AbstractC1922d.m3428g(context), c1357e);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = AbstractC2577h.f8211a;
        EnumC2017m enumC2017m = EnumC2017m.f6742d;
        EnumC2017m enumC2017m2 = layoutDirection != 0 ? layoutDirection != 1 ? null : EnumC2017m.f6743e : enumC2017m;
        this.f2496s0 = AbstractC1385s.m2629s(enumC2017m2 != null ? enumC2017m2 : enumC2017m);
        this.f2498t0 = new C0759r0(this, 1);
        this.f2500u0 = new C3446c(isInTouchMode() ? 1 : 2);
        C0470b c0470b = new C0470b();
        new C1483e(new C0583b[16]);
        new C1483e(new AbstractC1784a[16]);
        new C1483e(new C0564I[16]);
        new C1483e(new AbstractC1784a[16]);
        this.f2502v0 = c0470b;
        C0698U c0698u = new C0698U();
        new C0115D(new C0102b(6, c0698u));
        this.f2504w0 = c0698u;
        this.f2510z0 = new C0038T0(9);
        this.f2427A0 = new C2404A();
        int i7 = 0;
        this.f2433D0 = new RunnableC0766v(0, this);
        this.f2435E0 = new RunnableC0743l(this, i5);
        this.f2439G0 = new C0773y0(context, new C0758r(this, i7));
        this.f2441H0 = new C0764u(this, i7);
        this.f2443I0 = i6 < 29 ? new C0735i0(fArrM4782a) : new C0738j0();
        addOnAttachStateChangeListener(this.f2430C);
        setWillNotDraw(false);
        setFocusable(true);
        C0679K.f2160a.m1176a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        AbstractC3092v.m5408b(this, viewOnAttachStateChangeListenerC0667E);
        setOnDragListener(m5899getDragAndDropManager());
        getRoot().m820d(this);
        if (i6 >= 29) {
            C0671G.f2151a.m1170a(this);
        }
        if (z5) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.f2485n = view;
            addView(view, -1);
        }
        this.f2447K0 = i6 >= 31 ? new C0066i0(12) : null;
        this.f2451M0 = new C0760s(this);
    }

    /* JADX INFO: renamed from: e */
    public static final void m1285e(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, int i5, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iM4331d;
        ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E = viewTreeObserverOnGlobalLayoutListenerC0772y.f2428B;
        if (AbstractC1665j.m2981a(str, viewOnAttachStateChangeListenerC0667E.f2118H)) {
            int iM4331d2 = viewOnAttachStateChangeListenerC0667E.f2116F.m4331d(i5);
            if (iM4331d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM4331d2);
                return;
            }
            return;
        }
        if (!AbstractC1665j.m2981a(str, viewOnAttachStateChangeListenerC0667E.f2119I) || (iM4331d = viewOnAttachStateChangeListenerC0667E.f2117G.m4331d(i5)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iM4331d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0752o get_viewTreeOwners() {
        return (C0752o) this.f2478j0.getValue();
    }

    /* JADX INFO: renamed from: i */
    public static void m1288i(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = viewGroup.getChildAt(i5);
            if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0772y) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0772y) childAt).m1319y();
            } else if (childAt instanceof ViewGroup) {
                m1288i((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static long m1289j(int i5) {
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        if (mode == Integer.MIN_VALUE) {
            return (((long) 0) << 32) | ((long) size);
        }
        if (mode == 0) {
            return (((long) 0) << 32) | ((long) Integer.MAX_VALUE);
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j5 = size;
        return j5 | (j5 << 32);
    }

    /* JADX INFO: renamed from: k */
    public static View m1290k(View view, int i5) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (AbstractC1665j.m2981a(declaredMethod.invoke(view, null), Integer.valueOf(i5))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View viewM1290k = m1290k(viewGroup.getChildAt(i6), i5);
                    if (viewM1290k != null) {
                        return viewM1290k;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static void m1291n(C0564I c0564i) {
        c0564i.m795C();
        C1483e c1483eM843y = c0564i.m843y();
        Object[] objArr = c1483eM843y.f5181d;
        int i5 = c1483eM843y.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            m1291n((C0564I) objArr[i6]);
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m1292p(MotionEvent motionEvent) {
        boolean z5 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z5) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i5 = 1; i5 < pointerCount; i5++) {
                z5 = (Float.floatToRawIntBits(motionEvent.getX(i5)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i5)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !C0672G0.f2152a.m1171a(motionEvent, i5));
                if (z5) {
                    break;
                }
            }
        }
        return z5;
    }

    private void setDensity(InterfaceC2007c interfaceC2007c) {
        this.f2483m.setValue(interfaceC2007c);
    }

    private void setFontFamilyResolver(InterfaceC1580e interfaceC1580e) {
        this.f2494r0.setValue(interfaceC1580e);
    }

    private void setLayoutDirection(EnumC2017m enumC2017m) {
        this.f2496s0.setValue(enumC2017m);
    }

    private final void set_viewTreeOwners(C0752o c0752o) {
        this.f2478j0.setValue(c0752o);
    }

    /* JADX INFO: renamed from: A */
    public final void m1293A(C0564I c0564i, boolean z5, boolean z6, boolean z7) {
        C0564I c0564iM839u;
        C0564I c0564iM839u2;
        C0578X c0578x = this.f2462a0;
        if (!z5) {
            if (c0578x.m929p(c0564i, z6) && z7) {
                m1299G(c0564i);
                return;
            }
            return;
        }
        C0072l0 c0072l0 = c0578x.f1823b;
        C0564I c0564i2 = c0564i.f1719l;
        C0568M c0568m = c0564i.f1700K;
        if (c0564i2 == null) {
            AbstractC0277a.m483b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = c0568m.f1748d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new C0330q();
                }
                if (!c0568m.f1749e || z6) {
                    c0568m.f1749e = true;
                    c0568m.f1760p.f1860w = true;
                    if (c0564i.f1710U) {
                        return;
                    }
                    if ((AbstractC1665j.m2981a(c0564i.m802J(), Boolean.TRUE) || C0578X.m916h(c0564i)) && ((c0564iM839u = c0564i.m839u()) == null || !c0564iM839u.f1700K.f1749e)) {
                        c0072l0.m101e(c0564i, EnumC0621u.f1982d);
                    } else if ((c0564i.m801I() || C0578X.m917i(c0564i)) && ((c0564iM839u2 = c0564i.m839u()) == null || !c0564iM839u2.m835q())) {
                        c0072l0.m101e(c0564i, EnumC0621u.f1984f);
                    }
                    if (c0578x.f1825d || !z7) {
                        return;
                    }
                    m1299G(c0564i);
                    return;
                }
                return;
            }
        }
        c0578x.f1829h.m2753b(new C0577W(c0564i, true, z6));
    }

    /* JADX INFO: renamed from: B */
    public final void m1294B(C0564I c0564i, boolean z5, boolean z6) {
        C0568M c0568m = c0564i.f1700K;
        EnumC0621u enumC0621u = EnumC0621u.f1985g;
        C0578X c0578x = this.f2462a0;
        if (!z5) {
            c0578x.getClass();
            int iOrdinal = c0568m.f1748d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new C0330q();
            }
            C0564I c0564iM839u = c0564i.m839u();
            boolean z7 = c0564iM839u == null || c0564iM839u.m801I();
            if (!z6) {
                if (c0564i.m835q()) {
                    return;
                }
                if (c0564i.m834p() && c0564i.m801I() == z7 && c0564i.m801I() == c0568m.f1760p.f1859v) {
                    return;
                }
            }
            C0580Z c0580z = c0568m.f1760p;
            c0580z.f1861x = true;
            c0580z.f1862y = true;
            if (!c0564i.f1710U && c0580z.f1859v && z7) {
                if ((c0564iM839u == null || !c0564iM839u.m834p()) && (c0564iM839u == null || !c0564iM839u.m835q())) {
                    c0578x.f1823b.m101e(c0564i, enumC0621u);
                }
                if (c0578x.f1825d) {
                    return;
                }
                m1299G(null);
                return;
            }
            return;
        }
        C0072l0 c0072l0 = c0578x.f1823b;
        int iOrdinal2 = c0568m.f1748d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    throw new C0330q();
                }
            }
        }
        if ((c0568m.f1749e || c0568m.f1750f) && !z6) {
            return;
        }
        c0568m.f1750f = true;
        c0568m.f1751g = true;
        C0580Z c0580z2 = c0568m.f1760p;
        c0580z2.f1861x = true;
        c0580z2.f1862y = true;
        if (c0564i.f1710U) {
            return;
        }
        C0564I c0564iM839u2 = c0564i.m839u();
        if (AbstractC1665j.m2981a(c0564i.m802J(), Boolean.TRUE) && ((c0564iM839u2 == null || !c0564iM839u2.f1700K.f1749e) && (c0564iM839u2 == null || !c0564iM839u2.f1700K.f1750f))) {
            c0072l0.m101e(c0564i, EnumC0621u.f1983e);
        } else if (c0564i.m801I() && ((c0564iM839u2 == null || !c0564iM839u2.m834p()) && (c0564iM839u2 == null || !c0564iM839u2.m835q()))) {
            c0072l0.m101e(c0564i, enumC0621u);
        }
        if (c0578x.f1825d) {
            return;
        }
        m1299G(null);
    }

    /* JADX INFO: renamed from: C */
    public final void m1295C() {
        ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E = this.f2428B;
        viewOnAttachStateChangeListenerC0667E.f2112B = true;
        if (viewOnAttachStateChangeListenerC0667E.m1156o() && !viewOnAttachStateChangeListenerC0667E.f2123M) {
            viewOnAttachStateChangeListenerC0667E.f2123M = true;
            viewOnAttachStateChangeListenerC0667E.f2134m.post(viewOnAttachStateChangeListenerC0667E.f2125O);
        }
        ViewOnAttachStateChangeListenerC2369d viewOnAttachStateChangeListenerC2369d = this.f2430C;
        viewOnAttachStateChangeListenerC2369d.f7687j = true;
        if (!viewOnAttachStateChangeListenerC2369d.m4221h() || viewOnAttachStateChangeListenerC2369d.f7694q) {
            return;
        }
        viewOnAttachStateChangeListenerC2369d.f7694q = true;
        viewOnAttachStateChangeListenerC2369d.f7689l.post(viewOnAttachStateChangeListenerC2369d.f7695r);
    }

    /* JADX INFO: renamed from: D */
    public final void m1296D() {
        if (this.f2474h0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f2472g0) {
            this.f2472g0 = jCurrentAnimationTimeMillis;
            InterfaceC0732h0 interfaceC0732h0 = this.f2443I0;
            float[] fArr = this.f2468e0;
            interfaceC0732h0.mo1229a(this, fArr);
            AbstractC0681L.m1190l(fArr, this.f2470f0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f2464c0;
            view.getLocationOnScreen(iArr);
            float f2 = iArr[0];
            float f5 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f2476i0 = (((long) Float.floatToRawIntBits(f2 - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f5 - iArr[1])) & 4294967295L);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m1297E(MotionEvent motionEvent) {
        this.f2472g0 = AnimationUtils.currentAnimationTimeMillis();
        InterfaceC0732h0 interfaceC0732h0 = this.f2443I0;
        float[] fArr = this.f2468e0;
        interfaceC0732h0.mo1229a(this, fArr);
        AbstractC0681L.m1190l(fArr, this.f2470f0);
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        long jM4783b = C2730E.m4783b((((long) Float.floatToRawIntBits(x5)) << 32) | (((long) Float.floatToRawIntBits(y5)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jM4783b >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jM4783b & 4294967295L));
        this.f2476i0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    /* JADX INFO: renamed from: F */
    public final boolean m1298F() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    /* JADX INFO: renamed from: G */
    public final void m1299G(C0564I c0564i) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c0564i != null) {
            while (c0564i != null && c0564i.m836r() == EnumC0561G.f1682d) {
                if (!this.f2461W) {
                    C0564I c0564iM839u = c0564i.m839u();
                    if (c0564iM839u == null) {
                        break;
                    }
                    long j5 = c0564iM839u.f1699J.f1893c.f1209g;
                    if (C2005a.m3678f(j5) && C2005a.m3677e(j5)) {
                        break;
                    }
                }
                c0564i = c0564i.m839u();
            }
            if (c0564i == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: H */
    public final long m1300H(long j5) {
        m1296D();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) - Float.intBitsToFloat((int) (this.f2476i0 >> 32));
        return C2730E.m4783b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)) - Float.intBitsToFloat((int) (this.f2476i0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.f2470f0);
    }

    /* JADX INFO: renamed from: I */
    public final int m1301I(MotionEvent motionEvent) {
        Object obj;
        if (this.f2445J0) {
            this.f2445J0 = false;
            int metaState = motionEvent.getMetaState();
            this.f2495s.getClass();
            AbstractC0705X0.f2232a.setValue(new C0176I(metaState));
        }
        C0197k c0197k = this.f2446K;
        C0038T0 c0038t0M302c = c0197k.m302c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        C0212z c0212z = this.f2448L;
        if (c0038t0M302c == null) {
            if (!c0212z.f740a) {
                C2433o c2433o = (C2433o) ((C0066i0) c0212z.f743d).f297e;
                int i5 = c2433o.f7857g;
                Object[] objArr = c2433o.f7856f;
                for (int i6 = 0; i6 < i5; i6++) {
                    objArr[i6] = null;
                }
                c2433o.f7857g = 0;
                c2433o.f7854d = false;
                ((C0191e) c0212z.f742c).m294c();
            }
            return 0;
        }
        List list = (List) c0038t0M302c.f169e;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i7 = size - 1;
                obj = list.get(size);
                if (((C0211y) obj).f733e && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i7 < 0) {
                    break;
                }
                size = i7;
            }
            obj = null;
        } else {
            obj = null;
        }
        C0211y c0211y = (C0211y) obj;
        if (c0211y != null) {
            this.f2465d = c0211y.f732d;
        }
        int iM322a = c0212z.m322a(c0038t0M302c, this, m1311q(motionEvent));
        c0038t0M302c.f170f = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iM322a & 1) != 0) {
            return iM322a;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c0197k.f681c.delete(pointerId);
        c0197k.f680b.delete(pointerId);
        return iM322a;
    }

    /* JADX INFO: renamed from: J */
    public final void m1302J(MotionEvent motionEvent, int i5, long j5, boolean z5) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i5 != 9 && i5 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i6 = 0; i6 < pointerCount; i6++) {
            pointerPropertiesArr[i6] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i7 = 0; i7 < pointerCount; i7++) {
            pointerCoordsArr[i7] = new MotionEvent.PointerCoords();
        }
        int i8 = 0;
        while (i8 < pointerCount) {
            int i9 = ((actionIndex < 0 || i8 < actionIndex) ? 0 : 1) + i8;
            motionEvent.getPointerProperties(i9, pointerPropertiesArr[i8]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i8];
            motionEvent.getPointerCoords(i9, pointerCoords);
            float f2 = pointerCoords.x;
            long jM1314t = m1314t((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jM1314t >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jM1314t & 4294967295L));
            i8++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j5 : motionEvent.getDownTime(), j5, i5, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z5 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C0038T0 c0038t0M302c = this.f2446K.m302c(motionEventObtain, this);
        AbstractC1665j.m2982b(c0038t0M302c);
        this.f2448L.m322a(c0038t0M302c, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1303K(p112W2.InterfaceC1603e r5, p084Q2.AbstractC1178c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p047I0.C0770x
            if (r0 == 0) goto L13
            r0 = r6
            I0.x r0 = (p047I0.C0770x) r0
            int r1 = r0.f2418i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2418i = r1
            goto L18
        L13:
            I0.x r0 = new I0.x
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f2416g
            int r1 = r0.f2418i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            p127Z2.AbstractC1784a.m3205S(r6)
            goto L49
        L2d:
            p127Z2.AbstractC1784a.m3205S(r6)
            I0.r r6 = new I0.r
            r1 = 2
            r6.<init>(r4, r1)
            r0.f2418i = r2
            J.b r1 = new J.b
            r2 = 0
            java.util.concurrent.atomic.AtomicReference r3 = r4.f2488o0
            r1.<init>(r6, r3, r5, r2)
            java.lang.Object r5 = p160f3.AbstractC2162v.m3982d(r1, r0)
            P2.a r6 = p079P2.EnumC1152a.f3788d
            if (r5 != r6) goto L49
            return
        L49:
            E4.q r5 = new E4.q
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y.m1303K(W2.e, Q2.c):void");
    }

    /* JADX INFO: renamed from: L */
    public final void m1304L(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (AbstractC1665j.m2981a(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(AbstractC0797o.m1377a(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) != 0) {
            this.f2495s.getClass();
        }
        int i5 = Build.VERSION.SDK_INT;
        if ((i5 >= 31 ? configuration2.fontWeightAdjustment : 0) != (i5 >= 31 ? configuration.fontWeightAdjustment : 0)) {
            setFontFamilyResolver(AbstractC1922d.m3428g(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1305M() {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y.m1305M():void");
    }

    /* JADX INFO: renamed from: N */
    public final void m1306N(float f2) {
        if (this.f2487o) {
            if (f2 > 0.0f) {
                if (Float.isNaN(this.f2429B0) || f2 > this.f2429B0) {
                    this.f2429B0 = f2;
                    return;
                }
                return;
            }
            if (f2 < 0.0f) {
                if (Float.isNaN(this.f2431C0) || f2 < this.f2431C0) {
                    this.f2431C0 = f2;
                }
            }
        }
    }

    @Override // p198m0.InterfaceC2579j
    /* JADX INFO: renamed from: a */
    public final void mo1307a(C2567A c2567a, C2567A c2567a2) {
        C0590e0 c0590e0;
        C0590e0 c0590e02;
        if (c2567a != null) {
            C2567A c2567a3 = c2567a;
            if (!c2567a3.f7186d.f7199q) {
                AbstractC0277a.m483b("visitAncestors called on an unattached node");
            }
            AbstractC2206o abstractC2206o = c2567a3.f7186d;
            C0564I c0564iM1044t = AbstractC0601k.m1044t(c2567a);
            LinkedHashSet linkedHashSet = null;
            ArrayList arrayList = null;
            while (c0564iM1044t != null) {
                if ((c0564iM1044t.f1699J.f1896f.f7189g & 2097152) != 0) {
                    while (abstractC2206o != null) {
                        if ((abstractC2206o.f7188f & 2097152) != 0) {
                            AbstractC2206o abstractC2206oM1029e = abstractC2206o;
                            C1483e c1483e = null;
                            while (abstractC2206oM1029e != null) {
                                if (abstractC2206oM1029e instanceof InterfaceC3481c) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC2206oM1029e);
                                } else if ((abstractC2206oM1029e.f7188f & 2097152) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                    int i5 = 0;
                                    for (AbstractC2206o abstractC2206o2 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o2 != null; abstractC2206o2 = abstractC2206o2.f7191i) {
                                        if ((abstractC2206o2.f7188f & 2097152) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                abstractC2206oM1029e = abstractC2206o2;
                                            } else {
                                                if (c1483e == null) {
                                                    c1483e = new C1483e(new AbstractC2206o[16]);
                                                }
                                                if (abstractC2206oM1029e != null) {
                                                    c1483e.m2753b(abstractC2206oM1029e);
                                                    abstractC2206oM1029e = null;
                                                }
                                                c1483e.m2753b(abstractC2206o2);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e);
                            }
                        }
                        abstractC2206o = abstractC2206o.f7190h;
                    }
                }
                c0564iM1044t = c0564iM1044t.m839u();
                abstractC2206o = (c0564iM1044t == null || (c0590e02 = c0564iM1044t.f1699J) == null) ? null : c0590e02.f1895e;
            }
            if (arrayList == null) {
                return;
            }
            if (c2567a2 != null) {
                if (!c2567a2.f7186d.f7199q) {
                    AbstractC0277a.m483b("visitAncestors called on an unattached node");
                }
                AbstractC2206o abstractC2206o3 = c2567a2.f7186d;
                C0564I c0564iM1044t2 = AbstractC0601k.m1044t(c2567a2);
                LinkedHashSet linkedHashSet2 = null;
                while (c0564iM1044t2 != null) {
                    if ((c0564iM1044t2.f1699J.f1896f.f7189g & 2097152) != 0) {
                        while (abstractC2206o3 != null) {
                            if ((abstractC2206o3.f7188f & 2097152) != 0) {
                                AbstractC2206o abstractC2206oM1029e2 = abstractC2206o3;
                                C1483e c1483e2 = null;
                                while (abstractC2206oM1029e2 != null) {
                                    if (abstractC2206oM1029e2 instanceof InterfaceC3481c) {
                                        if (linkedHashSet2 == null) {
                                            linkedHashSet2 = new LinkedHashSet();
                                        }
                                        linkedHashSet2.add(abstractC2206oM1029e2);
                                    } else if ((abstractC2206oM1029e2.f7188f & 2097152) != 0 && (abstractC2206oM1029e2 instanceof AbstractC0599j)) {
                                        int i6 = 0;
                                        for (AbstractC2206o abstractC2206o4 = ((AbstractC0599j) abstractC2206oM1029e2).f1943s; abstractC2206o4 != null; abstractC2206o4 = abstractC2206o4.f7191i) {
                                            if ((abstractC2206o4.f7188f & 2097152) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    abstractC2206oM1029e2 = abstractC2206o4;
                                                } else {
                                                    if (c1483e2 == null) {
                                                        c1483e2 = new C1483e(new AbstractC2206o[16]);
                                                    }
                                                    if (abstractC2206oM1029e2 != null) {
                                                        c1483e2.m2753b(abstractC2206oM1029e2);
                                                        abstractC2206oM1029e2 = null;
                                                    }
                                                    c1483e2.m2753b(abstractC2206o4);
                                                }
                                            }
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                    abstractC2206oM1029e2 = AbstractC0601k.m1029e(c1483e2);
                                }
                            }
                            abstractC2206o3 = abstractC2206o3.f7190h;
                        }
                    }
                    c0564iM1044t2 = c0564iM1044t2.m839u();
                    abstractC2206o3 = (c0564iM1044t2 == null || (c0590e0 = c0564iM1044t2.f1699J) == null) ? null : c0590e0.f1895e;
                }
                linkedHashSet = linkedHashSet2;
            }
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                InterfaceC3481c interfaceC3481c = (InterfaceC3481c) arrayList.get(i7);
                if (!(linkedHashSet != null ? linkedHashSet.contains(interfaceC3481c) : false)) {
                    interfaceC3481c.mo5061I();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i5, int i6) {
        C2567A c2567a = ((C2584o) getFocusOwner()).f8224c;
        if (!c2567a.f7199q) {
            return;
        }
        if (!c2567a.f7186d.f7199q) {
            AbstractC0277a.m483b("visitSubtreeIf called on an unattached node");
        }
        C1483e c1483e = new C1483e(new AbstractC2206o[16]);
        AbstractC2206o abstractC2206o = c2567a.f7186d;
        AbstractC2206o abstractC2206o2 = abstractC2206o.f7191i;
        if (abstractC2206o2 == null) {
            AbstractC0601k.m1026b(c1483e, abstractC2206o);
        } else {
            c1483e.m2753b(abstractC2206o2);
        }
        while (true) {
            int i7 = c1483e.f5183f;
            if (i7 == 0) {
                return;
            }
            AbstractC2206o abstractC2206o3 = (AbstractC2206o) c1483e.m2762k(i7 - 1);
            if ((abstractC2206o3.f7189g & 1024) != 0) {
                for (AbstractC2206o abstractC2206o4 = abstractC2206o3; abstractC2206o4 != null && abstractC2206o4.f7199q; abstractC2206o4 = abstractC2206o4.f7191i) {
                    if ((abstractC2206o4.f7188f & 1024) != 0) {
                        AbstractC2206o abstractC2206oM1029e = abstractC2206o4;
                        C1483e c1483e2 = null;
                        while (abstractC2206oM1029e != null) {
                            int i8 = 0;
                            if (abstractC2206oM1029e instanceof C2567A) {
                                C2567A c2567a2 = (C2567A) abstractC2206oM1029e;
                                if (c2567a2.f7199q && c2567a2.m4485L0().f8234a) {
                                    super.addFocusables(arrayList, i5, i6);
                                    C2567A c2567a3 = ((C2584o) getFocusOwner()).f8224c;
                                    if (c2567a3.f7199q) {
                                        if (!c2567a3.f7186d.f7199q) {
                                            AbstractC0277a.m483b("visitSubtreeIf called on an unattached node");
                                        }
                                        C1483e c1483e3 = new C1483e(new AbstractC2206o[16]);
                                        AbstractC2206o abstractC2206o5 = c2567a3.f7186d;
                                        AbstractC2206o abstractC2206o6 = abstractC2206o5.f7191i;
                                        if (abstractC2206o6 == null) {
                                            AbstractC0601k.m1026b(c1483e3, abstractC2206o5);
                                        } else {
                                            c1483e3.m2753b(abstractC2206o6);
                                        }
                                        while (true) {
                                            int i9 = c1483e3.f5183f;
                                            if (i9 == 0) {
                                                break;
                                            }
                                            AbstractC2206o abstractC2206o7 = (AbstractC2206o) c1483e3.m2762k(i9 - 1);
                                            if ((abstractC2206o7.f7189g & 1024) != 0) {
                                                for (AbstractC2206o abstractC2206o8 = abstractC2206o7; abstractC2206o8 != null && abstractC2206o8.f7199q; abstractC2206o8 = abstractC2206o8.f7191i) {
                                                    if ((abstractC2206o8.f7188f & 1024) != 0) {
                                                        AbstractC2206o abstractC2206oM1029e2 = abstractC2206o8;
                                                        C1483e c1483e4 = null;
                                                        while (abstractC2206oM1029e2 != null) {
                                                            if (abstractC2206oM1029e2 instanceof C2567A) {
                                                                C2567A c2567a4 = (C2567A) abstractC2206oM1029e2;
                                                                if (c2567a4.f7199q) {
                                                                    C2588s c2588sM4485L0 = c2567a4.m4485L0();
                                                                    if (c2567a4.f7199q && !c2567a4.f8189r && c2588sM4485L0.f8234a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((abstractC2206oM1029e2.f7188f & 1024) != 0 && (abstractC2206oM1029e2 instanceof AbstractC0599j)) {
                                                                int i10 = 0;
                                                                for (AbstractC2206o abstractC2206o9 = ((AbstractC0599j) abstractC2206oM1029e2).f1943s; abstractC2206o9 != null; abstractC2206o9 = abstractC2206o9.f7191i) {
                                                                    if ((abstractC2206o9.f7188f & 1024) != 0) {
                                                                        i10++;
                                                                        if (i10 == 1) {
                                                                            abstractC2206oM1029e2 = abstractC2206o9;
                                                                        } else {
                                                                            if (c1483e4 == null) {
                                                                                c1483e4 = new C1483e(new AbstractC2206o[16]);
                                                                            }
                                                                            if (abstractC2206oM1029e2 != null) {
                                                                                c1483e4.m2753b(abstractC2206oM1029e2);
                                                                                abstractC2206oM1029e2 = null;
                                                                            }
                                                                            c1483e4.m2753b(abstractC2206o9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i10 == 1) {
                                                                }
                                                            }
                                                            abstractC2206oM1029e2 = AbstractC0601k.m1029e(c1483e4);
                                                        }
                                                    }
                                                }
                                            }
                                            AbstractC0601k.m1026b(c1483e3, abstractC2206o7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((abstractC2206oM1029e.f7188f & 1024) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                for (AbstractC2206o abstractC2206o10 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o10 != null; abstractC2206o10 = abstractC2206o10.f7191i) {
                                    if ((abstractC2206o10.f7188f & 1024) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            abstractC2206oM1029e = abstractC2206o10;
                                        } else {
                                            if (c1483e2 == null) {
                                                c1483e2 = new C1483e(new AbstractC2206o[16]);
                                            }
                                            if (abstractC2206oM1029e != null) {
                                                c1483e2.m2753b(abstractC2206oM1029e);
                                                abstractC2206oM1029e = null;
                                            }
                                            c1483e2.m2753b(abstractC2206o10);
                                        }
                                    }
                                }
                                if (i8 == 1) {
                                }
                            }
                            abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e2);
                        }
                    }
                }
            }
            AbstractC0601k.m1026b(c1483e, abstractC2206o3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C1125l c1125lM841w;
        InterfaceC1601c interfaceC1601c;
        InterfaceC1601c interfaceC1601c2;
        C2268c c2268c = this.f2453O;
        if (c2268c != null) {
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int iKeyAt = sparseArray.keyAt(i5);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                C0564I c0564i = (C0564I) c2268c.f7414e.f3719c.m4318b(iKeyAt);
                if (c0564i != null && (c1125lM841w = c0564i.m841w()) != null) {
                    C2408E c2408e = c1125lM841w.f3702d;
                    Object objM4272g = c2408e.m4272g(AbstractC1124k.f3682g);
                    if (objM4272g == null) {
                        objM4272g = null;
                    }
                    C1114a c1114a = (C1114a) objM4272g;
                    if (c1114a != null && (interfaceC1601c2 = (InterfaceC1601c) c1114a.f3634b) != null) {
                    }
                    Object objM4272g2 = c2408e.m4272g(AbstractC1124k.f3683h);
                    C1114a c1114a2 = (C1114a) (objM4272g2 != null ? objM4272g2 : null);
                    if (c1114a2 != null && (interfaceC1601c = (InterfaceC1601c) c1114a2.f3634b) != null) {
                    }
                }
            }
        }
        C0173F c0173f = this.f2452N;
        if (c0173f != null) {
            C2275j c2275j = (C2275j) c0173f.f613f;
            if (c2275j.f7426a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i6 = 0; i6 < size2; i6++) {
                int iKeyAt2 = sparseArray.keyAt(i6);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (c2275j.f7426a.get(Integer.valueOf(iKeyAt2)) != null) {
                        throw new ClassCastException();
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new C0881g("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new C0881g("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new C0881g("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // p002A1.InterfaceC0132e
    /* JADX INFO: renamed from: c */
    public final void mo181c(InterfaceC0145r interfaceC0145r) {
        InterfaceC1359f interfaceC1359fMo2537s;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(AbstractC0681L.m1188j());
        }
        C0666D0 c0666d0 = this.f2475i;
        if (c0666d0 != null) {
            InterfaceC0664C0 interfaceC0664C0 = this.f2473h;
            AbstractC1665j.m2982b(interfaceC0664C0);
            C0066i0 c0066i0 = c0666d0.f2106a;
            C1886c c1886c = (C1886c) c0066i0.f297e;
            if (!c1886c.f6408d || c1886c.f6410f) {
                return;
            }
            try {
                interfaceC1359fMo2537s = ((C0748m1) interfaceC0664C0).f2332a.mo2537s(new C0102b(7, c0666d0));
            } catch (CancellationException unused) {
                C1886c c1886c2 = (C1886c) c0066i0.f297e;
                if (!c1886c2.f6409e) {
                    if (c1886c2.f6410f) {
                        AbstractC1950a.m3618a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c1886c2.m3373a();
                    c1886c2.f6410f = true;
                }
                interfaceC1359fMo2537s = null;
            }
            InterfaceC1359f interfaceC1359f = c0666d0.f2109d;
            if (interfaceC1359f != null) {
                interfaceC1359f.cancel();
            }
            c0666d0.f2109d = interfaceC1359fMo2537s;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i5) {
        return this.f2428B.m1148f(false, i5, this.f2465d);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i5) {
        return this.f2428B.m1148f(true, i5, this.f2465d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            m1291n(getRoot());
        }
        m1315u(true);
        AbstractC2082n.m3834j().mo3795m();
        this.f2442I = true;
        C2761t c2761t = this.f2497t;
        C2743b c2743b = c2761t.f8756a;
        Canvas canvas2 = c2743b.f8723a;
        c2743b.f8723a = canvas;
        getRoot().m828i(c2743b, null);
        c2761t.f8756a.f8723a = canvas2;
        C2404A c2404a = this.f2438G;
        if (c2404a.m4251i()) {
            int i5 = c2404a.f7767b;
            for (int i6 = 0; i6 < i5; i6++) {
                ((C0769w0) ((InterfaceC0612p0) c2404a.m4248f(i6))).m1284f();
            }
        }
        int i7 = AbstractC0701V0.f2229d;
        c2404a.m4246d();
        this.f2442I = false;
        C2404A c2404a2 = this.f2440H;
        if (c2404a2 != null) {
            c2404a.m4245c(c2404a2);
            c2404a2.m4246d();
        }
        if (this.f2487o) {
            AbstractC0726f0.m1228a(this, this.f2429B0);
            View view = this.f2485n;
            if (view == null) {
                AbstractC1665j.m2991k("frameRateCategoryView");
                throw null;
            }
            AbstractC0726f0.m1228a(view, this.f2431C0);
            if (!Float.isNaN(this.f2431C0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.f2429B0 = Float.NaN;
            this.f2431C0 = Float.NaN;
        }
        getRectManager().m2207a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04e4 A[PHI: r6
  0x04e4: PHI (r6v51 ??) = (r6v74 ??), (r6v75 ??), (r6v76 ??) binds: [B:305:0x04a6, B:307:0x04aa, B:322:0x04dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:459:0x06b3 A[PHI: r5
  0x06b3: PHI (r5v38 ??) = (r5v93 ??), (r5v94 ??), (r5v95 ??) binds: [B:440:0x0679, B:442:0x067d, B:457:0x06ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r4v32, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r5v60, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r5v91 */
    /* JADX WARN: Type inference failed for: r5v92 */
    /* JADX WARN: Type inference failed for: r5v93 */
    /* JADX WARN: Type inference failed for: r5v94 */
    /* JADX WARN: Type inference failed for: r5v95 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r6v51, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55, types: [V.e] */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v75 */
    /* JADX WARN: Type inference failed for: r6v76 */
    /* JADX WARN: Type inference failed for: r7v40 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instruction units count: 1962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0158  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((C2584o) getFocusOwner()).m4529d(keyEvent, new C0190d(3, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f2495s.getClass();
        AbstractC0705X0.f2232a.setValue(new C0176I(metaState));
        return ((C2584o) getFocusOwner()).m4529d(keyEvent, C2580k.f8218e) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C0590e0 c0590e0;
        if (isFocused()) {
            C2584o c2584o = (C2584o) getFocusOwner();
            if (c2584o.f8225d.f8217e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                C2567A c2567aM4499f = AbstractC2573d.m4499f(c2584o.f8224c);
                if (c2567aM4499f != null) {
                    if (!c2567aM4499f.f7186d.f7199q) {
                        AbstractC0277a.m483b("visitAncestors called on an unattached node");
                    }
                    AbstractC2206o abstractC2206o = c2567aM4499f.f7186d;
                    C0564I c0564iM1044t = AbstractC0601k.m1044t(c2567aM4499f);
                    while (c0564iM1044t != null) {
                        if ((c0564iM1044t.f1699J.f1896f.f7189g & 131072) != 0) {
                            while (abstractC2206o != null) {
                                if ((abstractC2206o.f7188f & 131072) != 0) {
                                    AbstractC2206o abstractC2206oM1029e = abstractC2206o;
                                    C1483e c1483e = null;
                                    while (abstractC2206oM1029e != null) {
                                        if ((abstractC2206oM1029e.f7188f & 131072) != 0 && (abstractC2206oM1029e instanceof AbstractC0599j)) {
                                            int i5 = 0;
                                            for (AbstractC2206o abstractC2206o2 = ((AbstractC0599j) abstractC2206oM1029e).f1943s; abstractC2206o2 != null; abstractC2206o2 = abstractC2206o2.f7191i) {
                                                if ((abstractC2206o2.f7188f & 131072) != 0) {
                                                    i5++;
                                                    if (i5 == 1) {
                                                        abstractC2206oM1029e = abstractC2206o2;
                                                    } else {
                                                        if (c1483e == null) {
                                                            c1483e = new C1483e(new AbstractC2206o[16]);
                                                        }
                                                        if (abstractC2206oM1029e != null) {
                                                            c1483e.m2753b(abstractC2206oM1029e);
                                                            abstractC2206oM1029e = null;
                                                        }
                                                        c1483e.m2753b(abstractC2206o2);
                                                    }
                                                }
                                            }
                                            if (i5 == 1) {
                                            }
                                        }
                                        abstractC2206oM1029e = AbstractC0601k.m1029e(c1483e);
                                    }
                                }
                                abstractC2206o = abstractC2206o.f7190h;
                            }
                        }
                        c0564iM1044t = c0564iM1044t.m839u();
                        abstractC2206o = (c0564iM1044t == null || (c0590e0 = c0564iM1044t.f1699J) == null) ? null : c0590e0.f1895e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            C0669F.f2149a.m1164a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object c0729g0;
        C2567A c2567aM4531f;
        if (this.f2437F0) {
            RunnableC0743l runnableC0743l = this.f2435E0;
            removeCallbacks(runnableC0743l);
            MotionEvent motionEvent2 = this.f2506x0;
            AbstractC1665j.m2982b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f2437F0 = false;
            } else {
                runnableC0743l.run();
            }
        }
        if (!m1292p(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || m1312r(motionEvent))) {
            int iM1309m = m1309m(motionEvent);
            if ((iM1309m & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z5 = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z6 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z5 && z6) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (c0729g0 = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    c0729g0 = new C0729g0(1);
                }
                if (c0729g0.equals(new C0729g0(1)) && (c2567aM4531f = ((C2584o) getFocusOwner()).m4531f()) != null) {
                    AbstractC0596h0 abstractC0596h0M1043s = AbstractC0601k.m1043s(c2567aM4531f);
                    if (!AbstractC0435z.m693f(abstractC0596h0M1043s).mo634K(abstractC0596h0M1043s, true).m4650a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((C2584o) getFocusOwner()).m4527b(8, false, true);
                    }
                }
            }
            if ((iM1309m & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p002A1.InterfaceC0132e
    /* JADX INFO: renamed from: f */
    public final void mo182f(InterfaceC0145r interfaceC0145r) {
        C0666D0 c0666d0 = this.f2475i;
        if (c0666d0 != null) {
            C1886c c1886c = (C1886c) c0666d0.f2106a.f297e;
            if (c1886c.f6408d && !c1886c.f6410f) {
                InterfaceC1359f interfaceC1359f = c0666d0.f2109d;
                if (interfaceC1359f != null) {
                    interfaceC1359f.cancel();
                }
                c0666d0.f2109d = null;
                return;
            }
            if (c1886c.f6409e) {
                return;
            }
            if (!c1886c.f6410f) {
                AbstractC1950a.m3618a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!c1886c.f6411g.m4274i()) {
                AbstractC1950a.m3618a("Attempted to start retaining exited values with pending exited values");
            }
            c1886c.f6410f = false;
        }
    }

    public final View findViewByAccessibilityIdTraversal(int i5) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return m1290k(this, i5);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i5));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i5) {
        C2684c c2684cM4521a;
        if (view == null || this.f2462a0.f1824c) {
            return super.focusSearch(view, i5);
        }
        View rootView = getRootView();
        AbstractC1665j.m2983c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i5);
        if (viewFindNextFocus == null || !AbstractC0681L.m1179a(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            C2567A c2567aM4499f = AbstractC2573d.m4499f(((C2584o) getFocusOwner()).f8224c);
            c2684cM4521a = c2567aM4499f != null ? AbstractC2573d.m4502i(c2567aM4499f) : null;
            if (c2684cM4521a == null) {
                c2684cM4521a = AbstractC2577h.m4521a(view, this);
            }
        } else {
            c2684cM4521a = AbstractC2577h.m4521a(view, this);
        }
        C2575f c2575fM4524d = AbstractC2577h.m4524d(i5);
        int i6 = c2575fM4524d != null ? c2575fM4524d.f8210a : 6;
        C1675t c1675t = new C1675t();
        if (((C2584o) getFocusOwner()).m4530e(i6, c2684cM4521a, new C0111k(c1675t, 2)) == null) {
            return view;
        }
        Object obj = c1675t.f5710e;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i5);
            }
        } else if (viewFindNextFocus == null || i6 == 1 || i6 == 2 || AbstractC2573d.m4508o(AbstractC2573d.m4502i((C2567A) obj), AbstractC2577h.m4521a(viewFindNextFocus, this), c2684cM4521a, i6)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final C0720d0 getAndroidViewsHandler$ui() {
        if (this.f2459U == null) {
            C0720d0 c0720d0 = new C0720d0(getContext());
            this.f2459U = c0720d0;
            addView(c0720d0, -1);
            requestLayout();
        }
        C0720d0 c0720d02 = this.f2459U;
        AbstractC1665j.m2982b(c0720d02);
        return c0720d02;
    }

    public InterfaceC2272g getAutofill() {
        return this.f2452N;
    }

    public AbstractC2274i getAutofillManager() {
        return this.f2453O;
    }

    public C2275j getAutofillTree() {
        return this.f2436F;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.f2450M.getValue();
    }

    public final ViewOnAttachStateChangeListenerC2369d getContentCaptureManager$ui() {
        return this.f2430C;
    }

    public InterfaceC1051i getCoroutineContext() {
        return this.f2491q;
    }

    public InterfaceC2007c getDensity() {
        return (InterfaceC2007c) this.f2483m.getValue();
    }

    public C2684c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            C2567A c2567aM4499f = AbstractC2573d.m4499f(((C2584o) getFocusOwner()).f8224c);
            if (c2567aM4499f != null) {
                return AbstractC2573d.m4502i(c2567aM4499f);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return AbstractC2577h.m4521a(viewFindFocus, this);
        }
        return null;
    }

    public InterfaceC2581l getFocusOwner() {
        return this.f2489p;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C2684c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f8558a);
            rect.top = Math.round(embeddedViewFocusRect.f8559b);
            rect.right = Math.round(embeddedViewFocusRect.f8560c);
            rect.bottom = Math.round(embeddedViewFocusRect.f8561d);
            return;
        }
        if (AbstractC1665j.m2981a(((C2584o) getFocusOwner()).m4530e(6, null, C0756q.f2346f), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public InterfaceC1580e getFontFamilyResolver() {
        return (InterfaceC1580e) this.f2494r0.getValue();
    }

    public InterfaceC1579d getFontLoader() {
        return this.f2492q0;
    }

    public final InterfaceC0664C0 getFrameEndScheduler$ui() {
        return this.f2473h;
    }

    public InterfaceC2765x getGraphicsContext() {
        return this.f2434E;
    }

    public InterfaceC3388a getHapticFeedBack() {
        return this.f2498t0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f2462a0.f1823b.m112r() || !this.f2479k.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public InterfaceC3445b getInputModeManager() {
        return this.f2500u0;
    }

    public final RunnableC0418p getInsetsListener() {
        return this.f2501v;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f2472g0;
    }

    @Override // android.view.View, android.view.ViewParent
    public EnumC2017m getLayoutDirection() {
        return (EnumC2017m) this.f2496s0.getValue();
    }

    public long getMeasureIteration() {
        C0578X c0578x = this.f2462a0;
        if (!c0578x.f1824c) {
            AbstractC0277a.m482a("measureIteration should be only used during the measure/layout pass");
        }
        return c0578x.f1828g;
    }

    public C0470b getModifierLocalManager() {
        return this.f2502v0;
    }

    public AbstractC0389a0 getPlacementScope() {
        int i5 = AbstractC0395d0.f1218b;
        return new C0374L(1, this);
    }

    public InterfaceC0207u getPointerIconService() {
        return this.f2451M0;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final C3479a m5894getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.f2469f;
    }

    public C1168b getRectManager() {
        return this.f2507y;
    }

    public InterfaceC1887d getRetainedValuesStore() {
        return this.f2477j;
    }

    public C0564I getRoot() {
        return this.f2503w;
    }

    public InterfaceC0628x0 getRootForTest() {
        return this.f2509z;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        C0066i0 c0066i0;
        if (Build.VERSION.SDK_INT < 31 || (c0066i0 = this.f2447K0) == null) {
            return false;
        }
        return ((Boolean) ((C1366i0) c0066i0.f297e).getValue()).booleanValue();
    }

    public C1130q getSemanticsOwner() {
        return this.f2426A;
    }

    public C0566K getSharedDrawScope() {
        return this.f2471g;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? C0723e0.f2285a.m1226a(this) : this.f2458T;
    }

    public C0618s0 getSnapshotObserver() {
        return this.f2457S;
    }

    public InterfaceC0686N0 getSoftwareKeyboardController() {
        return this.f2490p0;
    }

    public C1647v getTextInputService() {
        return this.f2486n0;
    }

    public InterfaceC0688O0 getTextToolbar() {
        return this.f2504w0;
    }

    public final InterfaceC0626w0 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public InterfaceC0697T0 getViewConfiguration() {
        return this.f2499u;
    }

    public final C0752o getViewTreeOwners() {
        return (C0752o) this.f2480k0.getValue();
    }

    public InterfaceC0703W0 getWindowInfo() {
        return this.f2495s;
    }

    public final C2268c get_autofillManager$ui() {
        return this.f2453O;
    }

    /* JADX INFO: renamed from: l */
    public final void m1308l(C0564I c0564i, boolean z5) {
        this.f2462a0.m921f(c0564i, z5);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m1309m(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y.m1309m(android.view.MotionEvent):int");
    }

    /* JADX INFO: renamed from: o */
    public final void m1310o(C0564I c0564i) {
        this.f2462a0.m929p(c0564i, false);
        C1483e c1483eM843y = c0564i.m843y();
        Object[] objArr = c1483eM843y.f5181d;
        int i5 = c1483eM843y.f5183f;
        for (int i6 = 0; i6 < i5; i6++) {
            m1310o((C0564I) objArr[i6]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC1887d interfaceC1887d;
        AbstractC0142o lifecycle;
        String canonicalName;
        Object obj;
        String strM2986f;
        super.onAttachedToWindow();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 30) {
            setShowLayoutBounds(AbstractC0681L.m1188j());
        }
        this.f2501v.onViewAttachedToWindow(this);
        if (i5 > 28) {
            if (f2424R0 == null) {
                RunnableC0746m runnableC0746m = new RunnableC0746m();
                f2424R0 = runnableC0746m;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (f2420N0 == null) {
                        f2420N0 = Class.forName("android.os.SystemProperties");
                    }
                    if (f2422P0 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = f2420N0;
                        f2422P0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = f2422P0;
                    if (method != null) {
                        method.invoke(null, runnableC0746m);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            C2404A c2404a = f2423Q0;
            synchronized (c2404a) {
                c2404a.m4243a(this);
            }
        }
        this.f2495s.f2101a.setValue(Boolean.valueOf(hasWindowFocus()));
        this.f2495s.getClass();
        this.f2495s.getClass();
        m1310o(getRoot());
        m1291n(getRoot());
        getSnapshotObserver().f1972a.m3868d();
        C0173F c0173f = this.f2452N;
        if (c0173f != null) {
            C2273h c2273h = C2273h.f7425a;
            c2273h.getClass();
            ((AutofillManager) c0173f.f614g).registerCallback(c2273h);
        }
        InterfaceC0145r interfaceC0145rM162d = AbstractC0116E.m162d(this);
        InterfaceC0782g interfaceC0782gM4206s = AbstractC2352g.m4206s(this);
        InterfaceC0127P interfaceC0127PM163e = AbstractC0116E.m163e(this);
        InterfaceC0664C0 interfaceC0664C0 = this.f2473h;
        if (interfaceC0145rM162d == null || interfaceC0127PM163e == null || interfaceC0664C0 == null) {
            interfaceC1887d = null;
        } else {
            C0126O viewModelStore = interfaceC0127PM163e.getViewModelStore();
            C0125N c0125n = new C0125N();
            C0260a c0260a = C0260a.f853b;
            AbstractC1665j.m2985e(viewModelStore, "store");
            AbstractC1665j.m2985e(c0260a, "extras");
            C0173F c0173f2 = new C0173F(viewModelStore, c0125n, c0260a);
            C1660e c1660eM2995a = AbstractC1676u.m2995a(C0668E0.class);
            Map map = C1660e.f5698b;
            Class cls2 = c1660eM2995a.f5699a;
            AbstractC1665j.m2985e(cls2, "jClass");
            if (cls2.isAnonymousClass() || cls2.isLocalClass()) {
                canonicalName = null;
            } else if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                canonicalName = (!componentType.isPrimitive() || (strM2986f = AbstractC1665j.m2986f(componentType.getName())) == null) ? null : strM2986f.concat("Array");
                if (canonicalName == null) {
                    canonicalName = "kotlin.Array";
                }
            } else {
                String strM2986f2 = AbstractC1665j.m2986f(cls2.getName());
                canonicalName = strM2986f2 == null ? cls2.getCanonicalName() : strM2986f2;
            }
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            C0668E0 c0668e0 = (C0668E0) c0173f2.m255j(c1660eM2995a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
            Object parent = getParent();
            AbstractC1665j.m2983c(parent, "null cannot be cast to non-null type android.view.View");
            int id = ((View) parent).getId();
            C2439u c2439u = c0668e0.f2148b;
            Object objM4318b = c2439u.m4318b(id);
            if (objM4318b == null) {
                objM4318b = new C2404A(1);
                c2439u.m4344h(id, objM4318b);
            }
            C2404A c2404a2 = (C2404A) objM4318b;
            Object[] objArr = c2404a2.f7766a;
            int i6 = c2404a2.f7767b;
            int i7 = 0;
            while (true) {
                if (i7 >= i6) {
                    obj = null;
                    break;
                }
                obj = objArr[i7];
                if (!((C0666D0) obj).f2108c) {
                    break;
                } else {
                    i7++;
                }
            }
            C0666D0 c0666d0 = (C0666D0) obj;
            if (c0666d0 == null) {
                c0666d0 = new C0666D0();
                c2404a2.m4243a(c0666d0);
            }
            c0666d0.f2108c = true;
            this.f2475i = c0666d0;
            interfaceC1887d = c0666d0.f2107b;
        }
        if (interfaceC1887d == null) {
            interfaceC1887d = C1884a.f6406d;
        }
        this.f2477j = interfaceC1887d;
        C0752o viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (interfaceC0145rM162d != null && interfaceC0782gM4206s != null && (interfaceC0145rM162d != viewTreeOwners.f2337a || interfaceC0782gM4206s != viewTreeOwners.f2338b || interfaceC0127PM163e != viewTreeOwners.f2339c))) {
            if (interfaceC0145rM162d == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (interfaceC0782gM4206s == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.f2337a.getLifecycle()) != null) {
                lifecycle.mo185b(this);
            }
            interfaceC0145rM162d.getLifecycle().mo184a(this);
            C0752o c0752o = new C0752o(interfaceC0145rM162d, interfaceC0782gM4206s, interfaceC0127PM163e);
            set_viewTreeOwners(c0752o);
            InterfaceC1601c interfaceC1601c = this.f2482l0;
            if (interfaceC1601c != null) {
                interfaceC1601c.mo1h(c0752o);
            }
            this.f2482l0 = null;
        }
        this.f2500u0.f10762a.setValue(new C3444a(isInTouchMode() ? 1 : 2));
        C0752o viewTreeOwners2 = getViewTreeOwners();
        AbstractC0142o lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.f2337a.getLifecycle() : null;
        if (lifecycle2 == null) {
            throw AbstractC0231b.m396g("No lifecycle owner exists");
        }
        lifecycle2.mo184a(this);
        lifecycle2.mo184a(this.f2430C);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            C0675I.f2154a.m1174b(this);
        }
        C2268c c2268c = this.f2453O;
        if (c2268c != null) {
            ((C2584o) getFocusOwner()).f8228g.m4243a(c2268c);
            getSemanticsOwner().f3720d.m4243a(c2268c);
        }
        ((C2584o) getFocusOwner()).f8228g.m4243a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        C2209r c2209r = (C2209r) this.f2488o0.get();
        C0696T c0696t = (C0696T) (c2209r != null ? c2209r.f7201b : null);
        if (c0696t == null) {
            return this.f2484m0.f5663d;
        }
        C2209r c2209r2 = (C2209r) c0696t.f2227g.get();
        C0660A0 c0660a0 = (C0660A0) (c2209r2 != null ? c2209r2.f7201b : null);
        return c0660a0 != null && (c0660a0.f2095e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1304L(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i5;
        C2209r c2209r = (C2209r) this.f2488o0.get();
        C0696T c0696t = (C0696T) (c2209r != null ? c2209r.f7201b : null);
        if (c0696t == null) {
            C1649x c1649x = this.f2484m0;
            if (c1649x.f5663d) {
                C1636k c1636k = c1649x.f5667h;
                C1646u c1646u = c1649x.f5666g;
                int i6 = c1636k.f5630e;
                boolean z5 = c1636k.f5626a;
                if (i6 == 1) {
                    i5 = z5 ? 6 : 0;
                } else if (i6 == 0) {
                    i5 = 1;
                } else if (i6 == 2) {
                    i5 = 2;
                } else if (i6 == 6) {
                    i5 = 5;
                } else if (i6 == 5) {
                    i5 = 7;
                } else if (i6 == 3) {
                    i5 = 3;
                } else if (i6 == 4) {
                    i5 = 4;
                } else {
                    if (i6 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                }
                editorInfo.imeOptions = i5;
                int i7 = c1636k.f5629d;
                if (i7 == 1) {
                    editorInfo.inputType = 1;
                } else if (i7 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i5;
                } else if (i7 == 3) {
                    editorInfo.inputType = 2;
                } else if (i7 == 4) {
                    editorInfo.inputType = 3;
                } else if (i7 == 5) {
                    editorInfo.inputType = 17;
                } else if (i7 == 6) {
                    editorInfo.inputType = 33;
                } else if (i7 == 7) {
                    editorInfo.inputType = 129;
                } else if (i7 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i7 != 9) {
                        throw new IllegalStateException("Invalid Keyboard Type");
                    }
                    editorInfo.inputType = 8194;
                }
                if (!z5) {
                    int i8 = editorInfo.inputType;
                    if ((i8 & 1) == 1) {
                        editorInfo.inputType = i8 | 131072;
                        if (i6 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                int i9 = editorInfo.inputType;
                if ((i9 & 1) == 1) {
                    int i10 = c1636k.f5627b;
                    if (i10 == 1) {
                        editorInfo.inputType = i9 | 4096;
                    } else if (i10 == 2) {
                        editorInfo.inputType = i9 | 8192;
                    } else if (i10 == 3) {
                        editorInfo.inputType = i9 | 16384;
                    }
                    if (c1636k.f5628c) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j5 = c1646u.f5651b;
                int i11 = C1259L.f4537c;
                editorInfo.initialSelStart = (int) (j5 >> 32);
                editorInfo.initialSelEnd = (int) (j5 & 4294967295L);
                AbstractC1922d.m3417C(editorInfo, c1646u.f5650a.f4563e);
                editorInfo.imeOptions |= 33554432;
                InputConnectionC1642q inputConnectionC1642q = new InputConnectionC1642q(c1649x.f5666g, new C0066i0(27, c1649x), c1649x.f5667h.f5628c);
                c1649x.f5668i.add(new WeakReference(inputConnectionC1642q));
                return inputConnectionC1642q;
            }
        } else {
            C2209r c2209r2 = (C2209r) c0696t.f2227g.get();
            C0660A0 c0660a0 = (C0660A0) (c2209r2 != null ? c2209r2.f7201b : null);
            if (c0660a0 != null) {
                synchronized (c0660a0.f2093c) {
                    if (c0660a0.f2095e) {
                        return null;
                    }
                    InputConnectionC0830v inputConnectionC0830vM1471a = c0660a0.f2091a.m1471a(editorInfo);
                    C0172E c0172e = new C0172E(11, c0660a0);
                    InputConnection c1640o = Build.VERSION.SDK_INT >= 34 ? new C1640o(inputConnectionC0830vM1471a, c0172e) : new InputConnectionC1639n(inputConnectionC0830vM1471a, c0172e);
                    c0660a0.f2094d.m2753b(new C0562G0(c1640o));
                    return c1640o;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        C1128o c1128o;
        String strM4007a;
        ViewOnAttachStateChangeListenerC2369d viewOnAttachStateChangeListenerC2369d = this.f2430C;
        viewOnAttachStateChangeListenerC2369d.getClass();
        for (long j5 : jArr) {
            C1129p c1129p = (C1129p) viewOnAttachStateChangeListenerC2369d.m4220g().m4318b((int) j5);
            if (c1129p != null && (c1128o = c1129p.f3715a) != null) {
                AbstractC0740k.m1254r();
                ViewTranslationRequest.Builder builderM1250n = AbstractC0740k.m1250n(viewOnAttachStateChangeListenerC2369d.f7681d.getAutofillId(), c1128o.f3714g);
                Object objM4272g = c1128o.f3711d.f3702d.m4272g(AbstractC1132s.f3723B);
                if (objM4272g == null) {
                    objM4272g = null;
                }
                List list = (List) objM4272g;
                if (list != null && (strM4007a = AbstractC2179a.m4007a(list, "\n", null, 62)) != null) {
                    builderM1250n.setValue("android:text", TranslationRequestValue.forText(new C1269g(strM4007a)));
                    consumer.accept(builderM1250n.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2501v.onViewDetachedFromWindow(this);
        if (this.f2487o) {
            View view = this.f2485n;
            if (view == null) {
                AbstractC1665j.m2991k("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 28) {
            C2404A c2404a = f2423Q0;
            synchronized (c2404a) {
                c2404a.m4252j(this);
            }
        }
        C2088t c2088t = getSnapshotObserver().f1972a;
        C1836x c1836x = c2088t.f7003h;
        if (c1836x != null) {
            c1836x.m3299a();
        }
        c2088t.m3865a();
        this.f2495s.getClass();
        C0752o viewTreeOwners = getViewTreeOwners();
        AbstractC0142o lifecycle = viewTreeOwners != null ? viewTreeOwners.f2337a.getLifecycle() : null;
        if (lifecycle == null) {
            throw AbstractC0231b.m396g("No lifecycle owner exists");
        }
        lifecycle.mo185b(this.f2430C);
        lifecycle.mo185b(this);
        C0173F c0173f = this.f2452N;
        if (c0173f != null) {
            C2273h c2273h = C2273h.f7425a;
            c2273h.getClass();
            ((AutofillManager) c0173f.f614g).unregisterCallback(c2273h);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        C0666D0 c0666d0 = this.f2475i;
        if (c0666d0 != null) {
            c0666d0.f2108c = false;
        }
        this.f2475i = null;
        if (i5 >= 31) {
            C0675I.f2154a.m1173a(this);
        }
        C2268c c2268c = this.f2453O;
        if (c2268c != null) {
            getSemanticsOwner().f3720d.m4252j(c2268c);
            ((C2584o) getFocusOwner()).f8228g.m4252j(c2268c);
        }
        C1168b rectManager = getRectManager();
        RunnableC0342c runnableC0342c = rectManager.f3826g;
        if (runnableC0342c != null) {
            AbstractC2193b.f7159a.removeCallbacks(runnableC0342c);
            rectManager.f3826g = null;
        }
        ((C2584o) getFocusOwner()).f8228g.m4252j(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z5, int i5, Rect rect) {
        super.onFocusChanged(z5, i5, rect);
        if (z5 || hasFocus()) {
            return;
        }
        C2584o c2584o = (C2584o) getFocusOwner();
        AbstractC2573d.m4497d(c2584o.f8224c, true);
        if (c2584o.m4531f() != null) {
            C2567A c2567aM4531f = c2584o.m4531f();
            c2584o.m4534i(null);
            if (c2567aM4531f != null) {
                c2567aM4531f.m4484K0(EnumC2594y.f8252d, EnumC2594y.f8254f);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f2472g0 = 0L;
        m1305M();
        int i5 = Build.VERSION.SDK_INT;
        if (32 > i5 || i5 >= 34) {
            return;
        }
        m1304L(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        this.f2472g0 = 0L;
        this.f2462a0.m923j(this.f2441H0);
        this.f2460V = null;
        m1305M();
        if (this.f2459U != null) {
            getAndroidViewsHandler$ui().layout(0, 0, i7 - i5, i8 - i6);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i5, int i6) {
        C0578X c0578x = this.f2462a0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m1310o(getRoot());
            }
            long jM1289j = m1289j(i5);
            long jM1289j2 = m1289j(i6);
            long jM3232r = AbstractC1784a.m3232r((int) (jM1289j >>> 32), (int) (jM1289j & 4294967295L), (int) (jM1289j2 >>> 32), (int) (4294967295L & jM1289j2));
            C2005a c2005a = this.f2460V;
            if (c2005a == null) {
                this.f2460V = new C2005a(jM3232r);
                this.f2461W = false;
            } else if (!C2005a.m3674b(c2005a.f6726a, jM3232r)) {
                this.f2461W = true;
            }
            c0578x.m930q(jM3232r);
            c0578x.m925l();
            setMeasuredDimension(getRoot().f1700K.f1760p.f1206d, getRoot().f1700K.f1760p.f1207e);
            if (this.f2459U != null) {
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f1700K.f1760p.f1206d, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f1700K.f1760p.f1207e, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i5) {
        InterfaceC0206t interfaceC0206t;
        int toolType = motionEvent.getToolType(i5);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (interfaceC0206t = ((C0760s) getPointerIconService()).f2378a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i5);
        }
        Context context = getContext();
        return interfaceC0206t instanceof C0187a ? PointerIcon.getSystemIcon(context, ((C0187a) interfaceC0206t).f657b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i5) {
        if (this.f2467e) {
            int[] iArr = AbstractC2577h.f8211a;
            EnumC2017m enumC2017m = EnumC2017m.f6742d;
            EnumC2017m enumC2017m2 = i5 != 0 ? i5 != 1 ? null : EnumC2017m.f6743e : enumC2017m;
            if (enumC2017m2 != null) {
                enumC2017m = enumC2017m2;
            }
            setLayoutDirection(enumC2017m);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C0066i0 c0066i0;
        if (Build.VERSION.SDK_INT >= 31 && (c0066i0 = this.f2447K0) != null) {
            C1130q semanticsOwner = getSemanticsOwner();
            InterfaceC1051i coroutineContext = getCoroutineContext();
            C1483e c1483e = new C1483e(new C1038i[16]);
            AbstractC1784a.m3212Z(semanticsOwner.m2180a(), 0, new C1037h(1, 8, C1483e.class, c1483e, "add", "add(Ljava/lang/Object;)Z"));
            AbstractC0972l.m2006d0(c1483e.f5181d, new C1019a(0, new InterfaceC1601c[]{C1031b.f3212g, C1031b.f3213h}), 0, c1483e.f5183f);
            int i5 = c1483e.f5183f;
            C1038i c1038i = (C1038i) (i5 == 0 ? null : c1483e.f5181d[i5 - 1]);
            if (c1038i != null) {
                C2015k c2015k = c1038i.f3233c;
                ScrollCaptureCallbackC1033d scrollCaptureCallbackC1033d = new ScrollCaptureCallbackC1033d(c1038i.f3231a, c2015k, AbstractC2162v.m3979a(coroutineContext), c0066i0, this);
                AbstractC0596h0 abstractC0596h0 = c1038i.f3234d;
                C2684c c2684cMo634K = AbstractC0435z.m693f(abstractC0596h0).mo634K(abstractC0596h0, true);
                long j5 = (((long) c2015k.f6737a) << 32) | (((long) c2015k.f6738b) & 4294967295L);
                ScrollCaptureTarget scrollCaptureTargetM1245i = AbstractC0740k.m1245i(this, AbstractC2767z.m4949t(AbstractC1924f.m3508v(c2684cMo634K)), new Point((int) (j5 >> 32), (int) (j5 & 4294967295L)), scrollCaptureCallbackC1033d);
                scrollCaptureTargetM1245i.setScrollBounds(AbstractC2767z.m4949t(c2015k));
                consumer.accept(scrollCaptureTargetM1245i);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m1305M();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z5) {
        this.f2500u0.f10762a.setValue(new C3444a(z5 ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC2369d viewOnAttachStateChangeListenerC2369d = this.f2430C;
        viewOnAttachStateChangeListenerC2369d.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (AbstractC1665j.m2981a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            AbstractC1923e.m3484v(viewOnAttachStateChangeListenerC2369d, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC2369d.f7681d.post(new RunnableC0270g(6, viewOnAttachStateChangeListenerC2369d, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z5) {
        boolean zM1188j;
        this.f2495s.f2101a.setValue(Boolean.valueOf(z5));
        this.f2445J0 = true;
        super.onWindowFocusChanged(z5);
        if (!z5 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zM1188j = AbstractC0681L.m1188j())) {
            return;
        }
        setShowLayoutBounds(zM1188j);
        m1291n(getRoot());
    }

    /* JADX INFO: renamed from: q */
    public final boolean m1311q(MotionEvent motionEvent) {
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        return 0.0f <= x5 && x5 <= ((float) getWidth()) && 0.0f <= y5 && y5 <= ((float) getHeight());
    }

    /* JADX INFO: renamed from: r */
    public final boolean m1312r(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f2506x0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i5, Rect rect) {
        if (!isFocused()) {
            C2575f c2575fM4524d = AbstractC2577h.m4524d(i5);
            int i6 = c2575fM4524d != null ? c2575fM4524d.f8210a : 7;
            Boolean boolM4530e = ((C2584o) getFocusOwner()).m4530e(i6, rect != null ? AbstractC2767z.m4954y(rect) : null, new C0762t(i6, 0));
            Boolean bool = Boolean.TRUE;
            if (!AbstractC1665j.m2981a(boolM4530e, bool)) {
                if (!AbstractC1665j.m2981a(((C2584o) getFocusOwner()).m4530e(i6, null, new C0762t(i6, 1)), bool)) {
                    if (!hasFocus()) {
                        return false;
                    }
                    if (i6 == 1 || i6 == 2) {
                        return ((C2584o) getFocusOwner()).m4533h(i6);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final void m1313s(float[] fArr) {
        m1296D();
        C2730E.m4786e(fArr, this.f2468e0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f2476i0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f2476i0 & 4294967295L));
        float[] fArr2 = this.f2466d0;
        C2730E.m4785d(fArr2);
        C2730E.m4787f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        AbstractC0681L.m1193o(fArr, fArr2);
    }

    public void setAccessibilityEventBatchIntervalMillis(long j5) {
        this.f2428B.f2132k = j5;
    }

    public final void setConfiguration(Configuration configuration) {
        this.f2450M.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(ViewOnAttachStateChangeListenerC2369d viewOnAttachStateChangeListenerC2369d) {
        this.f2430C = viewOnAttachStateChangeListenerC2369d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [h0.o] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public void setCoroutineContext(InterfaceC1051i interfaceC1051i) {
        this.f2491q = interfaceC1051i;
        AbstractC2206o abstractC2206o = getRoot().f1699J.f1896f;
        if (abstractC2206o instanceof C0186T) {
            ((C0186T) abstractC2206o).m288L0();
        }
        if (!abstractC2206o.f7186d.f7199q) {
            AbstractC0277a.m483b("visitSubtreeIf called on an unattached node");
        }
        C1483e c1483e = new C1483e(new AbstractC2206o[16]);
        AbstractC2206o abstractC2206o2 = abstractC2206o.f7186d;
        AbstractC2206o abstractC2206o3 = abstractC2206o2.f7191i;
        if (abstractC2206o3 == null) {
            AbstractC0601k.m1026b(c1483e, abstractC2206o2);
        } else {
            c1483e.m2753b(abstractC2206o3);
        }
        while (true) {
            int i5 = c1483e.f5183f;
            if (i5 == 0) {
                return;
            }
            AbstractC2206o abstractC2206o4 = (AbstractC2206o) c1483e.m2762k(i5 - 1);
            if ((abstractC2206o4.f7189g & 16) != 0) {
                for (AbstractC2206o abstractC2206o5 = abstractC2206o4; abstractC2206o5 != null && abstractC2206o5.f7199q; abstractC2206o5 = abstractC2206o5.f7191i) {
                    if ((abstractC2206o5.f7188f & 16) != 0) {
                        ?? M1029e = abstractC2206o5;
                        ?? c1483e2 = 0;
                        while (M1029e != 0) {
                            if (M1029e instanceof InterfaceC0624v0) {
                                InterfaceC0624v0 interfaceC0624v0 = (InterfaceC0624v0) M1029e;
                                if (interfaceC0624v0 instanceof C0186T) {
                                    ((C0186T) interfaceC0624v0).m288L0();
                                }
                            } else if ((M1029e.f7188f & 16) != 0 && (M1029e instanceof AbstractC0599j)) {
                                AbstractC2206o abstractC2206o6 = ((AbstractC0599j) M1029e).f1943s;
                                int i6 = 0;
                                M1029e = M1029e;
                                c1483e2 = c1483e2;
                                while (abstractC2206o6 != null) {
                                    if ((abstractC2206o6.f7188f & 16) != 0) {
                                        i6++;
                                        c1483e2 = c1483e2;
                                        if (i6 == 1) {
                                            M1029e = abstractC2206o6;
                                        } else {
                                            if (c1483e2 == 0) {
                                                c1483e2 = new C1483e(new AbstractC2206o[16]);
                                            }
                                            if (M1029e != 0) {
                                                c1483e2.m2753b(M1029e);
                                                M1029e = 0;
                                            }
                                            c1483e2.m2753b(abstractC2206o6);
                                        }
                                    }
                                    abstractC2206o6 = abstractC2206o6.f7191i;
                                    M1029e = M1029e;
                                    c1483e2 = c1483e2;
                                }
                                if (i6 == 1) {
                                }
                            }
                            M1029e = AbstractC0601k.m1029e(c1483e2);
                        }
                    }
                }
            }
            AbstractC0601k.m1026b(c1483e, abstractC2206o4);
        }
    }

    public final void setFrameEndScheduler$ui(InterfaceC0664C0 interfaceC0664C0) {
        this.f2473h = interfaceC0664C0;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j5) {
        this.f2472g0 = j5;
    }

    public final void setOnViewTreeOwnersAvailable(InterfaceC1601c interfaceC1601c) {
        C0752o viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            interfaceC1601c.mo1h(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f2482l0 = interfaceC1601c;
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m5895setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(C3479a c3479a) {
        this.f2469f = c3479a;
    }

    public void setShowLayoutBounds(boolean z5) {
        this.f2458T = z5;
    }

    public void setUncaughtExceptionHandler(InterfaceC0626w0 interfaceC0626w0) {
        this.f2462a0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final long m1314t(long j5) {
        m1296D();
        long jM4783b = C2730E.m4783b(j5, this.f2468e0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f2476i0 >> 32)) + Float.intBitsToFloat((int) (jM4783b >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f2476i0 & 4294967295L)) + Float.intBitsToFloat((int) (jM4783b & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: u */
    public final void m1315u(boolean z5) {
        C0764u c0764u;
        C0578X c0578x = this.f2462a0;
        if (c0578x.f1823b.m112r() || ((C1483e) c0578x.f1826e.f169e).f5183f != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z5) {
                try {
                    c0764u = this.f2441H0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                c0764u = null;
            }
            if (c0578x.m923j(c0764u)) {
                requestLayout();
            }
            c0578x.m918a(false);
            if (this.f2444J) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f2444J = false;
            }
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m1316v(C0564I c0564i, long j5) {
        C0578X c0578x = this.f2462a0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            c0578x.m924k(c0564i, j5);
            if (!c0578x.f1823b.m112r()) {
                c0578x.m918a(false);
                if (this.f2444J) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f2444J = false;
                }
            }
            getRectManager().m2207a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m1317w(int i5) {
        if (i5 == 7 || i5 == 8) {
            return false;
        }
        Integer numM4523c = AbstractC2577h.m4523c(i5);
        if (numM4523c == null) {
            throw AbstractC0231b.m396g("Invalid focus direction");
        }
        int iIntValue = numM4523c.intValue();
        C2567A c2567aM4531f = ((C2584o) getFocusOwner()).m4531f();
        if (c2567aM4531f == null) {
            throw new IllegalStateException("findNextViewInEmbeddedView called when owner does not have anything focused.");
        }
        Integer numM4523c2 = AbstractC2577h.m4523c(i5);
        if (numM4523c2 == null) {
            throw AbstractC0231b.m396g("Invalid focus direction");
        }
        int iIntValue2 = numM4523c2.intValue();
        C2233x c2233x = AbstractC0601k.m1044t(c2567aM4531f).f1726s;
        View interopView = c2233x != null ? c2233x.getInteropView() : null;
        View viewFindFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        AbstractC1665j.m2983c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
        if (viewFindNextFocus == null || interopView == null || !AbstractC0681L.m1179a(interopView, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (viewFindNextFocus != null) {
            return AbstractC2577h.m4522b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final void m1318x(InterfaceC0612p0 interfaceC0612p0, boolean z5) {
        C2404A c2404a = this.f2438G;
        if (!z5) {
            if (this.f2442I) {
                return;
            }
            c2404a.m4252j(interfaceC0612p0);
            C2404A c2404a2 = this.f2440H;
            if (c2404a2 != null) {
                c2404a2.m4252j(interfaceC0612p0);
                return;
            }
            return;
        }
        if (!this.f2442I) {
            c2404a.m4243a(interfaceC0612p0);
            return;
        }
        C2404A c2404a3 = this.f2440H;
        if (c2404a3 == null) {
            c2404a3 = new C2404A();
            this.f2440H = c2404a3;
        }
        c2404a3.m4243a(interfaceC0612p0);
    }

    /* JADX INFO: renamed from: y */
    public final void m1319y() {
        if (this.f2454P) {
            C2088t c2088t = getSnapshotObserver().f1972a;
            synchronized (c2088t.f7002g) {
                try {
                    C1483e c1483e = c2088t.f7001f;
                    int i5 = c1483e.f5183f;
                    int i6 = 0;
                    for (int i7 = 0; i7 < i5; i7++) {
                        C2087s c2087s = (C2087s) c1483e.f5181d[i7];
                        c2087s.m3864d();
                        if (!c2087s.f6988f.m4275j()) {
                            i6++;
                        } else if (i6 > 0) {
                            Object[] objArr = c1483e.f5181d;
                            objArr[i7 - i6] = objArr[i7];
                        }
                    }
                    int i8 = i5 - i6;
                    AbstractC0972l.m1998V(c1483e.f5181d, i8, i5);
                    c1483e.f5183f = i8;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f2454P = false;
        }
        C0720d0 c0720d0 = this.f2459U;
        if (c0720d0 != null) {
            m1288i(c0720d0);
        }
        C2268c c2268c = this.f2453O;
        if (c2268c != null) {
            C2440v c2440v = c2268c.f7420k;
            if (c2440v.f7883d == 0 && c2268c.f7421l) {
                ((AutofillManager) c2268c.f7413d.f6028e).commit();
                c2268c.f7421l = false;
            }
            if (c2440v.f7883d != 0) {
                c2268c.f7421l = true;
            }
        }
        while (this.f2427A0.m4251i() && this.f2427A0.m4248f(0) != null) {
            int i9 = this.f2427A0.f7767b;
            for (int i10 = 0; i10 < i9; i10++) {
                InterfaceC1599a interfaceC1599a = (InterfaceC1599a) this.f2427A0.m4248f(i10);
                C2404A c2404a = this.f2427A0;
                if (i10 < 0 || i10 >= c2404a.f7767b) {
                    c2404a.m4256n(i10);
                    throw null;
                }
                Object[] objArr2 = c2404a.f7766a;
                Object obj = objArr2[i10];
                objArr2[i10] = null;
                if (interfaceC1599a != null) {
                    interfaceC1599a.mo6a();
                }
            }
            this.f2427A0.m4254l(0, i9);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m1320z(C0564I c0564i) {
        ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E = this.f2428B;
        viewOnAttachStateChangeListenerC0667E.f2112B = true;
        if (viewOnAttachStateChangeListenerC0667E.m1156o()) {
            viewOnAttachStateChangeListenerC0667E.m1157p(c0564i);
        }
        ViewOnAttachStateChangeListenerC2369d viewOnAttachStateChangeListenerC2369d = this.f2430C;
        viewOnAttachStateChangeListenerC2369d.f7687j = true;
        if (viewOnAttachStateChangeListenerC2369d.m4221h()) {
            viewOnAttachStateChangeListenerC2369d.f7688k.mo4090o(C0891q.f2780a);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5) {
        AbstractC1665j.m2982b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i5, layoutParams, true);
    }

    public C0731h getAccessibilityManager() {
        return this.f2432D;
    }

    /* JADX INFO: renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public C0734i m5897getClipboard() {
        return this.f2456R;
    }

    /* JADX INFO: renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public C0737j m5898getClipboardManager() {
        return this.f2455Q;
    }

    /* JADX INFO: renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public ViewOnDragListenerC2446b m5899getDragAndDropManager() {
        return this.f2493r;
    }

    public C2439u getLayoutNodes() {
        return this.f2505x;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC0772y getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, int i6) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i5;
        layoutParamsGenerateDefaultLayoutParams.height = i6;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i5, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @InterfaceC0875a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m5893getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @InterfaceC0875a
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(InterfaceC0626w0 interfaceC0626w0) {
    }
}
