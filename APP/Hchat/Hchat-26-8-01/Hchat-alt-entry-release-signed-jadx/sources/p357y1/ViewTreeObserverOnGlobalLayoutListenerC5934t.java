package p357y1;

import ac.C0058k;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.InputDevice;
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
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.lifecycle.AbstractC0098d0;
import androidx.lifecycle.C0100e0;
import androidx.lifecycle.C0114s;
import androidx.lifecycle.C0119x;
import androidx.lifecycle.InterfaceC0097d;
import androidx.lifecycle.InterfaceC0112q;
import be.AbstractC0283h;
import bsh.org.objectweb.asm.Opcodes;
import ci.C0579e;
import eg.C0920a;
import gg.AbstractC1416l;
import gg.AbstractC1426v;
import gg.C1410f;
import gg.C1425u;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import okhttp3.internal.http2.Settings;
import okio.C3193a;
import p002a1.AbstractC0005c;
import p002a1.RunnableC0006d;
import p002a1.ViewOnAttachStateChangeListenerC0011i;
import p003a2.C0014a;
import p007a7.AbstractC0018a;
import p012ah.C0086a;
import p014b.C0127f;
import p015b0.C0156v;
import p015b0.RunnableC0133c;
import p016b1.C0166f;
import p016b1.ViewOnDragListenerC0162b;
import p020b5.C0184c;
import p028c1.C0372b;
import p036c9.C0416a1;
import p038ce.C0549b;
import p041d1.AbstractC0656d;
import p041d1.AbstractC0662h;
import p041d1.C0653b0;
import p041d1.C0655c0;
import p041d1.C0660f;
import p041d1.C0665k;
import p041d1.C0669o;
import p041d1.C0670p;
import p041d1.C0674t;
import p041d1.EnumC0680z;
import p041d1.InterfaceC0664j;
import p041d1.InterfaceC0666l;
import p057e1.C0808c;
import p058e2.C0812b;
import p058e2.C0818h;
import p058e2.C0819i;
import p058e2.ScrollCaptureCallbackC0813c;
import p069f.AbstractC0944l;
import p069f.AbstractC0953p0;
import p069f.AbstractC0954q;
import p069f.AbstractC0959s0;
import p069f.C0929d0;
import p069f.C0933f0;
import p069f.C0943k0;
import p069f.C0945l0;
import p069f.C0952p;
import p069f.C0965w;
import p069f.C0966x;
import p070f0.InputConnectionC0990v;
import p071f1.AbstractC0996c0;
import p071f1.C0993b;
import p071f1.C1001f;
import p071f1.C1008i0;
import p071f1.C1020o0;
import p071f1.C1032u0;
import p071f1.C1033v;
import p071f1.InterfaceC1037z;
import p072f2.AbstractC1049l;
import p072f2.AbstractC1057t;
import p072f2.AbstractC1058u;
import p072f2.C1038a;
import p072f2.C1043f;
import p072f2.C1050m;
import p072f2.C1054q;
import p072f2.C1055r;
import p072f2.C1056s;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p087g.AbstractC1256a;
import p090g2.C1293b;
import p090g2.C1296e;
import p091g3.AbstractC1329q;
import p099h.Hchat.R;
import p099h.Hchat.crash.RunnableC1436e;
import p109hb.C1671c;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1845j1;
import p117i0.C1892x;
import p117i0.InterfaceC1809a1;
import p117i0.InterfaceC1827f;
import p118i1.C1902b;
import p119i2.C1926g;
import p119i2.C1939m0;
import p129ig.AbstractC2043a;
import p131j0.C2046b;
import p136j8.C2104o;
import p162l3.C2455i;
import p162l3.C2469w;
import p174m.C2571a;
import p177m2.InterfaceC2759c;
import p177m2.InterfaceC2760d;
import p189n1.InterfaceC2862a;
import p190n2.C2875j;
import p190n2.C2878m;
import p190n2.C2884s;
import p190n2.C2885t;
import p190n2.C2887v;
import p190n2.InputConnectionC2877l;
import p190n2.InputConnectionC2880o;
import p203o1.C3039a;
import p203o1.C3041c;
import p203o1.InterfaceC3040b;
import p219oh.AbstractC3165h;
import p224p1.C3286a;
import p224p1.C3287b;
import p224p1.InterfaceC3288c;
import p225p2.C3290b;
import p226p3.C3292a;
import p227p4.C3315t;
import p243q9.C3465a;
import p249qg.AbstractC3603v;
import p253r1.C3653j;
import p259r9.AbstractC3754e0;
import p263rg.RunnableC3809f;
import p267s1.C3883a;
import p267s1.C3888c0;
import p267s1.C3889d;
import p267s1.C3895g;
import p267s1.C3897h;
import p267s1.C3916v;
import p267s1.EnumC3905l;
import p267s1.InterfaceC3911q;
import p267s1.InterfaceC3912r;
import p276sf.C3967n;
import p276sf.InterfaceC3954a;
import p278t0.C4077a;
import p278t0.C4079c;
import p278t0.InterfaceC4080d;
import p291u0.AbstractC4228a;
import p292u1.AbstractC4229a;
import p293u2.C4231a;
import p293u2.C4241k;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4383d1;
import p308v1.AbstractC4434w;
import p308v1.C4386e1;
import p308v1.C4403k0;
import p308v1.RunnableC4411n;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4662m;
import p322w0.AbstractC4666q;
import p322w0.C4667r;
import p322w0.C4668s;
import p323w1.C4677b;
import p324w2.AbstractC4679a;
import p332wb.AbstractC4855en;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.C5585b;
import p339x1.C5587b1;
import p339x1.C5602f0;
import p339x1.C5603f1;
import p339x1.C5608g2;
import p339x1.C5610h0;
import p339x1.C5616j0;
import p339x1.C5633p;
import p339x1.C5643s0;
import p339x1.C5646t0;
import p339x1.C5647t1;
import p339x1.C5652v0;
import p339x1.EnumC5594d0;
import p339x1.EnumC5642s;
import p339x1.InterfaceC5635p1;
import p339x1.InterfaceC5638q1;
import p339x1.InterfaceC5641r1;
import p339x1.InterfaceC5659x1;
import p339x1.InterfaceC5662y1;
import p340x2.C5687v;
import p351xe.C5784e;
import p352xf.EnumC5799a;
import p356y0.AbstractC5852n;
import p356y0.C5855q;
import p370yf.AbstractC6038c;
import p373z0.AbstractC6069i;
import p373z0.C6063c;
import p373z0.C6068h;
import p373z0.C6070j;
import p373z0.InterfaceC6067g;
import tf.C4164k;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: y1.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC5934t extends ViewGroup implements InterfaceC5641r1, InterfaceC5662y1, InterfaceC0097d, InterfaceC5635p1, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, InterfaceC0664j {

    /* JADX INFO: renamed from: T0 */
    public static Class f24056T0;

    /* JADX INFO: renamed from: U0 */
    public static Method f24057U0;

    /* JADX INFO: renamed from: V0 */
    public static Method f24058V0;

    /* JADX INFO: renamed from: W0 */
    public static final C0933f0 f24059W0 = new C0933f0();

    /* JADX INFO: renamed from: X0 */
    public static RunnableC1436e f24060X0;

    /* JADX INFO: renamed from: Y0 */
    public static Method f24061Y0;

    /* JADX INFO: renamed from: A */
    public final RunnableC4411n f24062A;

    /* JADX INFO: renamed from: A0 */
    public final C4677b f24063A0;

    /* JADX INFO: renamed from: B */
    public final C5602f0 f24064B;

    /* JADX INFO: renamed from: B0 */
    public final C5903l0 f24065B0;

    /* JADX INFO: renamed from: C */
    public final C0965w f24066C;

    /* JADX INFO: renamed from: C0 */
    public MotionEvent f24067C0;

    /* JADX INFO: renamed from: D */
    public final C1293b f24068D;

    /* JADX INFO: renamed from: D0 */
    public long f24069D0;

    /* JADX INFO: renamed from: E */
    public final C1056s f24070E;

    /* JADX INFO: renamed from: E0 */
    public final C3315t f24071E0;

    /* JADX INFO: renamed from: F */
    public final ViewOnAttachStateChangeListenerC5958z f24072F;

    /* JADX INFO: renamed from: F0 */
    public final C0933f0 f24073F0;

    /* JADX INFO: renamed from: G */
    public ViewOnAttachStateChangeListenerC0011i f24074G;

    /* JADX INFO: renamed from: G0 */
    public float f24075G0;

    /* JADX INFO: renamed from: H */
    public final C5882g f24076H;

    /* JADX INFO: renamed from: H0 */
    public float f24077H0;

    /* JADX INFO: renamed from: I */
    public final C1001f f24078I;

    /* JADX INFO: renamed from: I0 */
    public final RunnableC3809f f24079I0;

    /* JADX INFO: renamed from: J */
    public final C6070j f24080J;

    /* JADX INFO: renamed from: J0 */
    public final RunnableC5894j f24081J0;

    /* JADX INFO: renamed from: K */
    public final C0933f0 f24082K;

    /* JADX INFO: renamed from: K0 */
    public boolean f24083K0;

    /* JADX INFO: renamed from: L */
    public C0933f0 f24084L;

    /* JADX INFO: renamed from: L0 */
    public final C5924q1 f24085L0;

    /* JADX INFO: renamed from: M */
    public boolean f24086M;

    /* JADX INFO: renamed from: M0 */
    public final C5910n f24087M0;

    /* JADX INFO: renamed from: N */
    public boolean f24088N;

    /* JADX INFO: renamed from: N0 */
    public final InterfaceC5943v0 f24089N0;

    /* JADX INFO: renamed from: O */
    public final C3897h f24090O;

    /* JADX INFO: renamed from: O0 */
    public boolean f24091O0;

    /* JADX INFO: renamed from: P */
    public final C0127f f24092P;

    /* JADX INFO: renamed from: P0 */
    public boolean f24093P0;

    /* JADX INFO: renamed from: Q */
    public final C1845j1 f24094Q;

    /* JADX INFO: renamed from: Q0 */
    public final C0119x f24095Q0;

    /* JADX INFO: renamed from: R */
    public final C1892x f24096R;

    /* JADX INFO: renamed from: R0 */
    public View f24097R0;

    /* JADX INFO: renamed from: S */
    public final C1671c f24098S;

    /* JADX INFO: renamed from: S0 */
    public final C5922q f24099S0;

    /* JADX INFO: renamed from: T */
    public final C6063c f24100T;

    /* JADX INFO: renamed from: U */
    public boolean f24101U;

    /* JADX INFO: renamed from: V */
    public final C5890i f24102V;

    /* JADX INFO: renamed from: W */
    public final C5886h f24103W;

    /* JADX INFO: renamed from: a0 */
    public final C5647t1 f24104a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f24105b0;

    /* JADX INFO: renamed from: c0 */
    public C5927r0 f24106c0;

    /* JADX INFO: renamed from: d0 */
    public C4231a f24107d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f24108e0;

    /* JADX INFO: renamed from: f0 */
    public final C5646t0 f24109f0;

    /* JADX INFO: renamed from: g */
    public final C1845j1 f24110g;

    /* JADX INFO: renamed from: g0 */
    public long f24111g0;

    /* JADX INFO: renamed from: h */
    public long f24112h;

    /* JADX INFO: renamed from: h0 */
    public final int[] f24113h0;

    /* JADX INFO: renamed from: i */
    public final boolean f24114i;

    /* JADX INFO: renamed from: i0 */
    public final float[] f24115i0;

    /* JADX INFO: renamed from: j */
    public C3286a f24116j;

    /* JADX INFO: renamed from: j0 */
    public final float[] f24117j0;

    /* JADX INFO: renamed from: k */
    public final C5610h0 f24118k;

    /* JADX INFO: renamed from: k0 */
    public final float[] f24119k0;

    /* JADX INFO: renamed from: l */
    public InterfaceC5948w1 f24120l;

    /* JADX INFO: renamed from: l0 */
    public long f24121l0;

    /* JADX INFO: renamed from: m */
    public C5952x1 f24122m;

    /* JADX INFO: renamed from: m0 */
    public boolean f24123m0;

    /* JADX INFO: renamed from: n */
    public InterfaceC4080d f24124n;

    /* JADX INFO: renamed from: n0 */
    public long f24125n0;

    /* JADX INFO: renamed from: o */
    public final C4164k f24126o;

    /* JADX INFO: renamed from: o0 */
    public final C1845j1 f24127o0;

    /* JADX INFO: renamed from: p */
    public final RunnableC5894j f24128p;

    /* JADX INFO: renamed from: p0 */
    public final C1892x f24129p0;

    /* JADX INFO: renamed from: q */
    public final C1845j1 f24130q;

    /* JADX INFO: renamed from: q0 */
    public InterfaceC1231l f24131q0;

    /* JADX INFO: renamed from: r */
    public final View f24132r;

    /* JADX INFO: renamed from: r0 */
    public C2887v f24133r0;

    /* JADX INFO: renamed from: s */
    public final C0670p f24134s;

    /* JADX INFO: renamed from: s0 */
    public C2885t f24135s0;

    /* JADX INFO: renamed from: t */
    public InterfaceC5561g f24136t;

    /* JADX INFO: renamed from: t0 */
    public final AtomicReference f24137t0;

    /* JADX INFO: renamed from: u */
    public final ViewOnDragListenerC0162b f24138u;

    /* JADX INFO: renamed from: u0 */
    public C5892i1 f24139u0;

    /* JADX INFO: renamed from: v */
    public final C5944v1 f24140v;

    /* JADX INFO: renamed from: v0 */
    public final InterfaceC2759c f24141v0;

    /* JADX INFO: renamed from: w */
    public final C1845j1 f24142w;

    /* JADX INFO: renamed from: w0 */
    public final InterfaceC1809a1 f24143w0;

    /* JADX INFO: renamed from: x */
    public final C1892x f24144x;

    /* JADX INFO: renamed from: x0 */
    public final C1845j1 f24145x0;

    /* JADX INFO: renamed from: y */
    public final C1033v f24146y;

    /* JADX INFO: renamed from: y0 */
    public final InterfaceC2862a f24147y0;

    /* JADX INFO: renamed from: z */
    public final C5923q0 f24148z;

    /* JADX INFO: renamed from: z0 */
    public final C3041c f24149z0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewTreeObserverOnGlobalLayoutListenerC5934t(Context context, C5880f1 c5880f1) {
        super(context);
        this.f24110g = AbstractC1874r.m4639u(c5880f1);
        this.f24112h = 9205357640488583168L;
        int i9 = 1;
        this.f24114i = true;
        this.f24118k = c5880f1.f23874r;
        this.f24124n = C4077a.f13515a;
        this.f24126o = new C4164k();
        int i10 = 0;
        this.f24128p = new RunnableC5894j(this, i10);
        this.f24130q = new C1845j1(AbstractC0283h.m1147a(context), C1823e.f6050k);
        this.f24134s = new C0670p(this, this);
        this.f24136t = c5880f1.f23858b.mo4470j();
        this.f24138u = new ViewOnDragListenerC0162b();
        this.f24140v = new C5944v1();
        this.f24142w = AbstractC1874r.m4639u(Boolean.FALSE);
        this.f24144x = AbstractC1874r.m4634p(new C5910n(this, i10));
        this.f24146y = c5880f1.f23876t;
        this.f24148z = c5880f1.f23873q;
        this.f24062A = new RunnableC4411n();
        int i11 = 3;
        C5602f0 c5602f0 = new C5602f0(3);
        c5602f0.m10029c0(C4386e1.f14622b);
        c5602f0.m10025Z(getDensity());
        c5602f0.m10033e0(getViewConfiguration());
        c5602f0.m10031d0(new C5926r(this).mo10549d(((C0670p) getFocusOwner()).f2058e).mo10549d(m11093getDragAndDropManager().f431c));
        this.f24064B = c5602f0;
        C0965w c0965w = AbstractC0944l.f2974a;
        this.f24066C = new C0965w();
        getLayoutNodes();
        this.f24068D = new C1293b(this);
        this.f24070E = new C1056s(getRoot(), new C1043f(), getLayoutNodes());
        ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z = new ViewOnAttachStateChangeListenerC5958z(this);
        this.f24072F = viewOnAttachStateChangeListenerC5958z;
        this.f24074G = new ViewOnAttachStateChangeListenerC0011i(this, new C0156v(0, this, AbstractC5883g0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0, 4));
        this.f24076H = c5880f1.f23866j;
        this.f24078I = new C1001f(this);
        this.f24080J = new C6070j();
        this.f24082K = new C0933f0();
        this.f24090O = new C3897h();
        C5602f0 root = getRoot();
        C0127f c0127f = new C0127f();
        c0127f.f335b = root;
        c0127f.f336c = new C3889d(root.f22778L.f22716c);
        c0127f.f337d = new C2571a(15);
        c0127f.f338e = new C5633p();
        this.f24092P = c0127f;
        this.f24094Q = AbstractC1874r.m4639u(new Configuration(context.getResources().getConfiguration()));
        this.f24096R = AbstractC1874r.m4634p(new C5910n(this, i9));
        C6070j autofillTree = getAutofillTree();
        C1671c c1671c = new C1671c();
        c1671c.f5520g = this;
        c1671c.f5521h = autofillTree;
        AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            C2104o.m5276A("Autofill service could not be located.");
            throw null;
        }
        c1671c.f5522i = autofillManager;
        setImportantForAutofill(1);
        AutofillId autofillId = getAutofillId();
        if (autofillId == null) {
            throw AbstractC4855en.m9257a("Required value was null.");
        }
        c1671c.f5523j = autofillId;
        this.f24098S = c1671c;
        AutofillManager autofillManager2 = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager2 == null) {
            throw AbstractC4855en.m9257a("Autofill service could not be located.");
        }
        this.f24100T = new C6063c(new C5784e(autofillManager2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.f24102V = c5880f1.f23868l;
        this.f24103W = c5880f1.f23869m;
        this.f24104a0 = new C5647t1(new C5918p(this, i9));
        this.f24109f0 = new C5646t0(getRoot());
        long j3 = Integer.MAX_VALUE;
        this.f24111g0 = (j3 & 4294967295L) | (j3 << 32);
        this.f24113h0 = new int[]{0, 0};
        float[] fArrM2593a = C1008i0.m2593a();
        this.f24115i0 = fArrM2593a;
        this.f24117j0 = C1008i0.m2593a();
        this.f24119k0 = C1008i0.m2593a();
        this.f24121l0 = -1L;
        this.f24125n0 = 9187343241974906880L;
        this.f24127o0 = AbstractC1874r.m4639u(null);
        this.f24129p0 = AbstractC1874r.m4634p(new C5910n(this, i11));
        this.f24137t0 = new AtomicReference(null);
        this.f24141v0 = c5880f1.f23870n;
        this.f24143w0 = c5880f1.f23871o;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = AbstractC0662h.f2041a;
        EnumC4243m enumC4243m = EnumC4243m.f13919g;
        EnumC4243m enumC4243m2 = layoutDirection != 0 ? layoutDirection != 1 ? null : EnumC4243m.f13920h : enumC4243m;
        this.f24145x0 = AbstractC1874r.m4639u(enumC4243m2 != null ? enumC4243m2 : enumC4243m);
        this.f24147y0 = c5880f1.f23872p;
        int i12 = 2;
        this.f24149z0 = new C3041c(isInTouchMode() ? 1 : 2);
        C4677b c4677b = new C4677b();
        new C2046b(new C5585b[16]);
        new C2046b(new AbstractC0283h[16]);
        new C2046b(new C5602f0[16]);
        new C2046b(new AbstractC0283h[16]);
        this.f24063A0 = c4677b;
        C5903l0 c5903l0 = new C5903l0();
        new C0014a(new C0655c0(c5903l0, 19));
        this.f24065B0 = c5903l0;
        this.f24071E0 = new C3315t(20);
        this.f24073F0 = new C0933f0();
        this.f24079I0 = new RunnableC3809f(this, i12);
        this.f24081J0 = new RunnableC5894j(this, i9);
        this.f24085L0 = new C5924q1(context, new C5918p(this, i10));
        this.f24087M0 = new C5910n(this, i12);
        int i13 = Build.VERSION.SDK_INT;
        this.f24089N0 = i13 < 29 ? new C3315t(fArrM2593a) : new C5947w0();
        addOnAttachStateChangeListener(this.f24074G);
        setWillNotDraw(false);
        setFocusable(true);
        C5879f0.f23856a.m10580a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        AbstractC1329q.m3554a(this, viewOnAttachStateChangeListenerC5958z);
        setOnDragListener(m11093getDragAndDropManager());
        getRoot().m10030d(this);
        if (i13 >= 29) {
            C5863b0.f23820a.m10568a(this);
        }
        if (m10640r()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.f24132r = view;
            addView(view, -1);
        }
        this.f24095Q0 = i13 >= 31 ? new C0119x(8) : null;
        this.f24099S0 = new C5922q(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m10632f(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, int i9, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iM2366d;
        ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z = viewTreeObserverOnGlobalLayoutListenerC5934t.f24072F;
        if (AbstractC1416l.m3825a(str, viewOnAttachStateChangeListenerC5958z.f24205J)) {
            int iM2366d2 = viewOnAttachStateChangeListenerC5958z.f24203H.m2366d(i9);
            if (iM2366d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM2366d2);
                return;
            }
            return;
        }
        if (!AbstractC1416l.m3825a(str, viewOnAttachStateChangeListenerC5958z.f24206K) || (iM2366d = viewOnAttachStateChangeListenerC5958z.f24204I.m2366d(i9)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iM2366d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.f24144x.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C2887v getLegacyTextInputServiceAndroid() {
        C2887v c2887v = this.f24133r0;
        if (c2887v != null) {
            return c2887v;
        }
        C2887v c2887v2 = new C2887v(getView(), this);
        this.f24133r0 = c2887v2;
        return c2887v2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C5880f1 get_composeViewContext() {
        return (C5880f1) this.f24110g.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC5902l get_viewTreeOwners() {
        AbstractC4855en.m9270n(this.f24127o0.getValue());
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m10636j(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC5934t) {
                ((ViewTreeObserverOnGlobalLayoutListenerC5934t) childAt).m10642A();
            } else if (childAt instanceof ViewGroup) {
                m10636j((ViewGroup) childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static long m10637k(int i9) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        if (mode == Integer.MIN_VALUE) {
            return (((long) 0) << 32) | ((long) size);
        }
        if (mode == 0) {
            return (((long) 0) << 32) | ((long) Integer.MAX_VALUE);
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j3 = size;
        return j3 | (j3 << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static View m10638m(View view, int i9) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (AbstractC1416l.m3825a(declaredMethod.invoke(view, null), Integer.valueOf(i9))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View viewM10638m = m10638m(viewGroup.getChildAt(i10), i9);
                    if (viewM10638m != null) {
                        return viewM10638m;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m10639p(C5602f0 c5602f0) {
        c5602f0.m10006C();
        C2046b c2046bM10053y = c5602f0.m10053y();
        Object[] objArr = c2046bM10053y.f6891g;
        int i9 = c2046bM10053y.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            m10639p((C5602f0) objArr[i10]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static boolean m10640r() {
        return Build.VERSION.SDK_INT >= 35;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static boolean m10641s(MotionEvent motionEvent) {
        boolean z9 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z9) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i9 = 1; i9 < pointerCount; i9++) {
                z9 = (Float.floatToRawIntBits(motionEvent.getX(i9)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i9)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !C5861a2.f23817a.m10563a(motionEvent, i9));
                if (z9) {
                    break;
                }
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setAttached(boolean z9) {
        this.f24142w.setValue(Boolean.valueOf(z9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setDensity(InterfaceC4233c interfaceC4233c) {
        this.f24130q.setValue(interfaceC4233c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setFontFamilyResolver(InterfaceC2760d interfaceC2760d) {
        this.f24143w0.setValue(interfaceC2760d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setLayoutDirection(EnumC4243m enumC4243m) {
        this.f24145x0.setValue(enumC4243m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void set_composeViewContext(C5880f1 c5880f1) {
        this.f24110g.setValue(c5880f1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void set_viewTreeOwners(AbstractC5902l abstractC5902l) {
        this.f24127o0.setValue(abstractC5902l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m10642A() {
        C0933f0 c0933f0;
        Object[] objArr;
        if (this.f24101U) {
            C4668s c4668s = getSnapshotObserver().f23001a;
            synchronized (c4668s.f15542g) {
                try {
                    C2046b c2046b = c4668s.f15541f;
                    int i9 = c2046b.f6893i;
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        objArr = c2046b.f6891g;
                        if (i10 >= i9) {
                            break;
                        }
                        C4667r c4667r = (C4667r) objArr[i10];
                        c4667r.m9159d();
                        if (!c4667r.f15528f.m2323j()) {
                            i11++;
                        } else if (i11 > 0) {
                            Object[] objArr2 = c2046b.f6891g;
                            objArr2[i10 - i11] = objArr2[i10];
                        }
                        i10++;
                    }
                    int i12 = i9 - i11;
                    Arrays.fill(objArr, i12, i9, (Object) null);
                    c2046b.f6893i = i12;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f24101U = false;
        }
        C5927r0 c5927r0 = this.f24106c0;
        if (c5927r0 != null) {
            m10636j(c5927r0);
        }
        C6063c c6063c = this.f24100T;
        if (c6063c != null) {
            C0966x c0966x = c6063c.f24543n;
            if (c0966x.f3041d == 0 && c6063c.f24544o) {
                ((AutofillManager) c6063c.f24536g.f23527b).commit();
                c6063c.f24544o = false;
            }
            if (c0966x.f3041d != 0) {
                c6063c.f24544o = true;
            }
        }
        while (this.f24073F0.m2294i() && this.f24073F0.m2291f(0) != null) {
            int i13 = this.f24073F0.f2924b;
            int i14 = 0;
            while (true) {
                c0933f0 = this.f24073F0;
                if (i14 < i13) {
                    InterfaceC1220a interfaceC1220a = (InterfaceC1220a) c0933f0.m2291f(i14);
                    this.f24073F0.m2299n(i14, null);
                    if (interfaceC1220a != null) {
                        interfaceC1220a.invoke();
                    }
                    i14++;
                }
            }
            c0933f0.m2297l(0, i13);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m10643B(C5602f0 c5602f0) {
        ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z = this.f24072F;
        viewOnAttachStateChangeListenerC5958z.f24199D = true;
        if (viewOnAttachStateChangeListenerC5958z.m10701o()) {
            viewOnAttachStateChangeListenerC5958z.m10702p(c5602f0);
        }
        ViewOnAttachStateChangeListenerC0011i viewOnAttachStateChangeListenerC0011i = this.f24074G;
        viewOnAttachStateChangeListenerC0011i.f34m = true;
        if (viewOnAttachStateChangeListenerC0011i.m158i()) {
            viewOnAttachStateChangeListenerC0011i.f35n.mo8208p(C3967n.f12976a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final void m10644C(C5602f0 c5602f0, boolean z9, boolean z10, boolean z11) {
        C5602f0 c5602f0M10049u;
        C5602f0 c5602f0M10049u2;
        C5646t0 c5646t0 = this.f24109f0;
        if (!z9) {
            if (c5646t0.m10212r(c5602f0, z10) && z11) {
                m10650I(c5602f0);
                return;
            }
            return;
        }
        C0184c c0184c = c5646t0.f22993b;
        C5602f0 c5602f02 = c5602f0.f22797n;
        C5616j0 c5616j0 = c5602f0.f22779M;
        if (c5602f02 == null) {
            AbstractC4229a.m8494b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = c5616j0.f22879d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    C3193a.m6822k();
                    return;
                }
                if (!c5616j0.f22880e || z10) {
                    c5616j0.f22880e = true;
                    c5616j0.f22891p.f23011A = true;
                    if (c5602f0.f22789W) {
                        return;
                    }
                    if ((AbstractC1416l.m3825a(c5602f0.m10012I(), Boolean.TRUE) || C5646t0.m10198i(c5602f0)) && ((c5602f0M10049u = c5602f0.m10049u()) == null || !c5602f0M10049u.f22779M.f22880e)) {
                        c0184c.m807b(c5602f0, EnumC5642s.f22975g);
                    } else if ((c5602f0.m10011H() || C5646t0.m10199j(c5602f0)) && ((c5602f0M10049u2 = c5602f0.m10049u()) == null || !c5602f0M10049u2.m10045q())) {
                        c0184c.m807b(c5602f0, EnumC5642s.f22977i);
                    }
                    if (c5646t0.f22995d || !z11) {
                        return;
                    }
                    m10650I(c5602f0);
                    return;
                }
                return;
            }
        }
        c5646t0.f22999h.m5056b(new C5643s0(c5602f0, true, z10));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final void m10645D(C5602f0 c5602f0, boolean z9, boolean z10) {
        C5616j0 c5616j0 = c5602f0.f22779M;
        EnumC5642s enumC5642s = EnumC5642s.f22978j;
        C5646t0 c5646t0 = this.f24109f0;
        if (!z9) {
            c5646t0.getClass();
            int iOrdinal = c5616j0.f22879d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                C3193a.m6822k();
                return;
            }
            C5602f0 c5602f0M10049u = c5602f0.m10049u();
            boolean z11 = c5602f0M10049u == null || c5602f0M10049u.m10011H();
            if (!z10) {
                if (c5602f0.m10045q()) {
                    return;
                }
                if (c5602f0.m10044p() && c5602f0.m10011H() == z11 && c5602f0.m10011H() == c5616j0.f22891p.f23043z) {
                    return;
                }
            }
            C5652v0 c5652v0 = c5616j0.f22891p;
            c5652v0.f23012B = true;
            c5652v0.f23013C = true;
            if (!c5602f0.f22789W && c5652v0.f23043z && z11) {
                if ((c5602f0M10049u == null || !c5602f0M10049u.m10044p()) && (c5602f0M10049u == null || !c5602f0M10049u.m10045q())) {
                    c5646t0.f22993b.m807b(c5602f0, enumC5642s);
                }
                if (c5646t0.f22995d) {
                    return;
                }
                m10650I(null);
                return;
            }
            return;
        }
        C0184c c0184c = c5646t0.f22993b;
        int iOrdinal2 = c5616j0.f22879d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    C3193a.m6822k();
                    return;
                }
            }
        }
        if ((c5616j0.f22880e || c5616j0.f22881f) && !z10) {
            return;
        }
        c5616j0.f22881f = true;
        c5616j0.f22882g = true;
        C5652v0 c5652v02 = c5616j0.f22891p;
        c5652v02.f23012B = true;
        c5652v02.f23013C = true;
        if (c5602f0.f22789W) {
            return;
        }
        C5602f0 c5602f0M10049u2 = c5602f0.m10049u();
        if (AbstractC1416l.m3825a(c5602f0.m10012I(), Boolean.TRUE) && ((c5602f0M10049u2 == null || !c5602f0M10049u2.f22779M.f22880e) && (c5602f0M10049u2 == null || !c5602f0M10049u2.f22779M.f22881f))) {
            c0184c.m807b(c5602f0, EnumC5642s.f22976h);
        } else if (c5602f0.m10011H() && ((c5602f0M10049u2 == null || !c5602f0M10049u2.m10044p()) && (c5602f0M10049u2 == null || !c5602f0M10049u2.m10045q()))) {
            c0184c.m807b(c5602f0, enumC5642s);
        }
        if (c5646t0.f22995d) {
            return;
        }
        m10650I(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final void m10646E() {
        ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z = this.f24072F;
        viewOnAttachStateChangeListenerC5958z.f24199D = true;
        Handler handler = viewOnAttachStateChangeListenerC5958z.f24215j.getHandler();
        if (viewOnAttachStateChangeListenerC5958z.m10701o() && !viewOnAttachStateChangeListenerC5958z.f24210O && handler != null) {
            viewOnAttachStateChangeListenerC5958z.f24210O = true;
            handler.post(viewOnAttachStateChangeListenerC5958z.f24212Q);
        }
        ViewOnAttachStateChangeListenerC0011i viewOnAttachStateChangeListenerC0011i = this.f24074G;
        viewOnAttachStateChangeListenerC0011i.f34m = true;
        Handler handler2 = viewOnAttachStateChangeListenerC0011i.f28g.getHandler();
        if (!viewOnAttachStateChangeListenerC0011i.m158i() || viewOnAttachStateChangeListenerC0011i.f40s || handler2 == null) {
            return;
        }
        viewOnAttachStateChangeListenerC0011i.f40s = true;
        handler2.post(viewOnAttachStateChangeListenerC0011i.f41t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final void m10647F() {
        if (this.f24123m0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f24121l0) {
            this.f24121l0 = jCurrentAnimationTimeMillis;
            InterfaceC5943v0 interfaceC5943v0 = this.f24089N0;
            float[] fArr = this.f24117j0;
            interfaceC5943v0.mo7026h(this, fArr);
            AbstractC5883g0.m10600p(fArr, this.f24119k0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f24113h0;
            view.getLocationOnScreen(iArr);
            float f3 = iArr[0];
            float f10 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f24125n0 = (((long) Float.floatToRawIntBits(f3 - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f10 - iArr[1])) & 4294967295L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final void m10648G(MotionEvent motionEvent) {
        this.f24121l0 = AnimationUtils.currentAnimationTimeMillis();
        InterfaceC5943v0 interfaceC5943v0 = this.f24089N0;
        float[] fArr = this.f24117j0;
        interfaceC5943v0.mo7026h(this, fArr);
        AbstractC5883g0.m10600p(fArr, this.f24119k0);
        float x4 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long jM2594b = C1008i0.m2594b((((long) Float.floatToRawIntBits(x4)) << 32) | (((long) Float.floatToRawIntBits(y10)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jM2594b >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jM2594b & 4294967295L));
        this.f24125n0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final boolean m10649H() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final void m10650I(C5602f0 c5602f0) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c5602f0 != null) {
            while (c5602f0 != null && c5602f0.m10046r() == EnumC5594d0.f22743g) {
                if (!this.f24108e0) {
                    C5602f0 c5602f0M10049u = c5602f0.m10049u();
                    if (c5602f0M10049u == null) {
                        break;
                    }
                    long j3 = c5602f0M10049u.f22778L.f22716c.f14596j;
                    if (C4231a.m8502f(j3) && C4231a.m8501e(j3)) {
                        break;
                    }
                }
                c5602f0 = c5602f0.m10049u();
            }
            if (c5602f0 == getRoot()) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final long m10651J(long j3) {
        m10647F();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (this.f24125n0 >> 32));
        return C1008i0.m2594b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (this.f24125n0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.f24119k0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public final int m10652K(MotionEvent motionEvent) {
        Object obj;
        if (this.f24091O0) {
            this.f24091O0 = false;
            C5944v1 c5944v1 = getComposeViewContext().f23875s;
            int metaState = motionEvent.getMetaState();
            c5944v1.getClass();
            AbstractC5921p2.f24030a.setValue(new C3888c0(metaState));
        }
        C3897h c3897h = this.f24090O;
        C3315t c3315tM8087c = c3897h.m8087c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        C0127f c0127f = this.f24092P;
        if (c3315tM8087c == null) {
            if (!c0127f.f334a) {
                C0952p c0952p = (C0952p) ((C2571a) c0127f.f337d).f8339h;
                int i9 = c0952p.f3001j;
                Object[] objArr = c0952p.f3000i;
                for (int i10 = 0; i10 < i9; i10++) {
                    objArr[i10] = null;
                }
                c0952p.f3001j = 0;
                c0952p.f2998g = false;
                ((C3889d) c0127f.f336c).m8077c();
            }
            return 0;
        }
        List list = (List) c3315tM8087c.f10677h;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i11 = size - 1;
                obj = list.get(size);
                if (((C3916v) obj).f12858e && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i11 < 0) {
                    break;
                }
                size = i11;
            }
            obj = null;
        } else {
            obj = null;
        }
        C3916v c3916v = (C3916v) obj;
        if (c3916v != null) {
            this.f24112h = c3916v.f12857d;
        }
        int iM650b = c0127f.m650b(c3315tM8087c, this, m10662t(motionEvent));
        c3315tM8087c.f10678i = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iM650b & 1) != 0) {
            return iM650b;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c3897h.f12774c.delete(pointerId);
        c3897h.f12773b.delete(pointerId);
        return iM650b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final void m10653L(MotionEvent motionEvent, int i9, long j3, boolean z9) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i9 != 9 && i9 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            pointerPropertiesArr[i10] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerCoordsArr[i11] = new MotionEvent.PointerCoords();
        }
        int i12 = 0;
        while (i12 < pointerCount) {
            int i13 = ((actionIndex < 0 || i12 < actionIndex) ? 0 : 1) + i12;
            motionEvent.getPointerProperties(i13, pointerPropertiesArr[i12]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i12];
            motionEvent.getPointerCoords(i13, pointerCoords);
            float f3 = pointerCoords.x;
            long jM10665w = m10665w((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jM10665w >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jM10665w & 4294967295L));
            i12++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j3 : motionEvent.getDownTime(), j3, i9, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z9 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C3315t c3315tM8087c = this.f24090O.m8087c(motionEventObtain, this);
        c3315tM8087c.getClass();
        this.f24092P.m650b(c3315tM8087c, this, true);
        motionEventObtain.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10654M(InterfaceC1235p interfaceC1235p, AbstractC6038c abstractC6038c) {
        C5930s c5930s;
        if (abstractC6038c instanceof C5930s) {
            c5930s = (C5930s) abstractC6038c;
            int i9 = c5930s.f24047i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c5930s.f24047i = i9 - Integer.MIN_VALUE;
            } else {
                c5930s = new C5930s(this, abstractC6038c);
            }
        }
        Object obj = c5930s.f24045g;
        int i10 = c5930s.f24047i;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            C5918p c5918p = new C5918p(this, 2);
            c5930s.f24047i = 1;
            if (AbstractC3603v.m7551e(new C0579e(c5918p, this.f24137t0, interfaceC1235p, null), c5930s) == EnumC5799a.f23547g) {
                return;
            }
        } else {
            if (i10 != 1) {
                C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            AbstractC1089i.m2732I0(obj);
        }
        C3193a.m6814c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final void m10655N(Configuration configuration) {
        C1845j1 c1845j1;
        Configuration configuration2 = getConfiguration();
        if (AbstractC1416l.m3825a(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(AbstractC0283h.m1147a(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) == 0 || (c1845j1 = this.f24140v.f24165b) == null) {
            return;
        }
        c1845j1.setValue(AbstractC5883g0.m10589e(this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m10656O() {
        boolean z9;
        int i9;
        int[] iArr = this.f24113h0;
        getLocationOnScreen(iArr);
        long j3 = this.f24111g0;
        int i10 = (int) (j3 >> 32);
        int i11 = (int) (j3 & 4294967295L);
        int i12 = iArr[0];
        if (i10 != i12 || i11 != iArr[1] || this.f24121l0 < 0) {
            this.f24111g0 = (4294967295L & ((long) iArr[1])) | (((long) i12) << 32);
            if (i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE) {
                z9 = false;
            } else {
                C2046b c2046bM10053y = getRoot().m10053y();
                Object[] objArr = c2046bM10053y.f6891g;
                int i13 = c2046bM10053y.f6893i;
                for (int i14 = 0; i14 < i13; i14++) {
                    ((C5602f0) objArr[i14]).f22779M.f22891p.m10222Y0();
                }
                z9 = true;
            }
        }
        m10647F();
        View rootView = this.f24097R0;
        if (rootView == null) {
            rootView = getRootView();
            this.f24097R0 = rootView;
        }
        C1293b rectManager = getRectManager();
        long j4 = this.f24111g0;
        long jM5017W = AbstractC2043a.m5017W(this.f24125n0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.f24117j0;
        if (fArr.length < 16) {
            i9 = 0;
        } else {
            i9 = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
        }
        C1296e c1296e = rectManager.f4316c;
        if ((i9 & 2) != 0) {
            fArr = null;
        }
        rectManager.f4319f = c1296e.m3443b(j4, jM5017W, fArr, width, height) || rectManager.f4319f;
        this.f24109f0.m10201b(z9);
        getRectManager().m3434a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final void m10657P(float f3) {
        if (m10640r()) {
            if (f3 > 0.0f) {
                if (Float.isNaN(this.f24075G0) || f3 > this.f24075G0) {
                    this.f24075G0 = f3;
                    return;
                }
                return;
            }
            if (f3 < 0.0f) {
                if (Float.isNaN(this.f24077H0) || f3 < this.f24077H0) {
                    this.f24077H0 = f3;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0097d
    /* JADX INFO: renamed from: a */
    public final void mo542a(InterfaceC0112q interfaceC0112q) {
        InterfaceC1827f interfaceC1827fMo4479s;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(AbstractC5883g0.m10598n());
        }
        C5952x1 c5952x1 = this.f24122m;
        if (c5952x1 != null) {
            InterfaceC5948w1 interfaceC5948w1 = this.f24120l;
            interfaceC5948w1.getClass();
            C5784e c5784e = c5952x1.f24181a;
            C4079c c4079c = (C4079c) c5784e.f23527b;
            if (!c4079c.f13517a || c4079c.f13519c) {
                return;
            }
            try {
                interfaceC1827fMo4479s = ((C5957y2) interfaceC5948w1).f24194a.mo4479s(new C0655c0(c5952x1, 21));
            } catch (CancellationException unused) {
                C4079c c4079c2 = (C4079c) c5784e.f23527b;
                if (!c4079c2.f13518b) {
                    if (c4079c2.f13519c) {
                        AbstractC4228a.m8492a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c4079c2.m8263a();
                    c4079c2.f13519c = true;
                }
                interfaceC1827fMo4479s = null;
            }
            InterfaceC1827f interfaceC1827f = c5952x1.f24184d;
            if (interfaceC1827f != null) {
                interfaceC1827f.cancel();
            }
            c5952x1.f24184d = interfaceC1827fMo4479s;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i9, int i10) {
        C0653b0 c0653b0 = ((C0670p) getFocusOwner()).f2056c;
        if (!c0653b0.f23801t) {
            return;
        }
        if (!c0653b0.f23788g.f23801t) {
            AbstractC4229a.m8494b("visitSubtreeIf called on an unattached node");
        }
        C2046b c2046b = new C2046b(new AbstractC5852n[16]);
        AbstractC5852n abstractC5852n = c0653b0.f23788g;
        AbstractC5852n abstractC5852n2 = abstractC5852n.f23793l;
        if (abstractC5852n2 == null) {
            AbstractC5618k.m10146b(c2046b, abstractC5852n);
        } else {
            c2046b.m5056b(abstractC5852n2);
        }
        while (true) {
            int i11 = c2046b.f6893i;
            if (i11 == 0) {
                return;
            }
            AbstractC5852n abstractC5852n3 = (AbstractC5852n) c2046b.m5065k(i11 - 1);
            if ((abstractC5852n3.f23791j & 1024) != 0) {
                for (AbstractC5852n abstractC5852n4 = abstractC5852n3; abstractC5852n4 != null && abstractC5852n4.f23801t; abstractC5852n4 = abstractC5852n4.f23793l) {
                    if ((abstractC5852n4.f23790i & 1024) != 0) {
                        AbstractC5852n abstractC5852nM10149e = abstractC5852n4;
                        C2046b c2046b2 = null;
                        while (abstractC5852nM10149e != null) {
                            int i12 = 0;
                            if (abstractC5852nM10149e instanceof C0653b0) {
                                C0653b0 c0653b02 = (C0653b0) abstractC5852nM10149e;
                                if (c0653b02.f23801t && c0653b02.m1799m1().f2066a) {
                                    super.addFocusables(arrayList, i9, i10);
                                    C0653b0 c0653b03 = ((C0670p) getFocusOwner()).f2056c;
                                    if (c0653b03.f23801t) {
                                        if (!c0653b03.f23788g.f23801t) {
                                            AbstractC4229a.m8494b("visitSubtreeIf called on an unattached node");
                                        }
                                        C2046b c2046b3 = new C2046b(new AbstractC5852n[16]);
                                        AbstractC5852n abstractC5852n5 = c0653b03.f23788g;
                                        AbstractC5852n abstractC5852n6 = abstractC5852n5.f23793l;
                                        if (abstractC5852n6 == null) {
                                            AbstractC5618k.m10146b(c2046b3, abstractC5852n5);
                                        } else {
                                            c2046b3.m5056b(abstractC5852n6);
                                        }
                                        while (true) {
                                            int i13 = c2046b3.f6893i;
                                            if (i13 == 0) {
                                                break;
                                            }
                                            AbstractC5852n abstractC5852n7 = (AbstractC5852n) c2046b3.m5065k(i13 - 1);
                                            if ((abstractC5852n7.f23791j & 1024) != 0) {
                                                for (AbstractC5852n abstractC5852n8 = abstractC5852n7; abstractC5852n8 != null && abstractC5852n8.f23801t; abstractC5852n8 = abstractC5852n8.f23793l) {
                                                    if ((abstractC5852n8.f23790i & 1024) != 0) {
                                                        AbstractC5852n abstractC5852nM10149e2 = abstractC5852n8;
                                                        C2046b c2046b4 = null;
                                                        while (abstractC5852nM10149e2 != null) {
                                                            if (abstractC5852nM10149e2 instanceof C0653b0) {
                                                                C0653b0 c0653b04 = (C0653b0) abstractC5852nM10149e2;
                                                                if (c0653b04.f23801t) {
                                                                    C0674t c0674tM1799m1 = c0653b04.m1799m1();
                                                                    if (c0653b04.f23801t && !c0653b04.f2023u && c0674tM1799m1.f2066a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((abstractC5852nM10149e2.f23790i & 1024) != 0 && (abstractC5852nM10149e2 instanceof AbstractC5615j)) {
                                                                int i14 = 0;
                                                                for (AbstractC5852n abstractC5852n9 = ((AbstractC5615j) abstractC5852nM10149e2).f22875v; abstractC5852n9 != null; abstractC5852n9 = abstractC5852n9.f23793l) {
                                                                    if ((abstractC5852n9.f23790i & 1024) != 0) {
                                                                        i14++;
                                                                        if (i14 == 1) {
                                                                            abstractC5852nM10149e2 = abstractC5852n9;
                                                                        } else {
                                                                            if (c2046b4 == null) {
                                                                                c2046b4 = new C2046b(new AbstractC5852n[16]);
                                                                            }
                                                                            if (abstractC5852nM10149e2 != null) {
                                                                                c2046b4.m5056b(abstractC5852nM10149e2);
                                                                                abstractC5852nM10149e2 = null;
                                                                            }
                                                                            c2046b4.m5056b(abstractC5852n9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i14 == 1) {
                                                                }
                                                            }
                                                            abstractC5852nM10149e2 = AbstractC5618k.m10149e(c2046b4);
                                                        }
                                                    }
                                                }
                                            }
                                            AbstractC5618k.m10146b(c2046b3, abstractC5852n7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((abstractC5852nM10149e.f23790i & 1024) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                for (AbstractC5852n abstractC5852n10 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n10 != null; abstractC5852n10 = abstractC5852n10.f23793l) {
                                    if ((abstractC5852n10.f23790i & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            abstractC5852nM10149e = abstractC5852n10;
                                        } else {
                                            if (c2046b2 == null) {
                                                c2046b2 = new C2046b(new AbstractC5852n[16]);
                                            }
                                            if (abstractC5852nM10149e != null) {
                                                c2046b2.m5056b(abstractC5852nM10149e);
                                                abstractC5852nM10149e = null;
                                            }
                                            c2046b2.m5056b(abstractC5852n10);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b2);
                        }
                    }
                }
            }
            AbstractC5618k.m10146b(c2046b, abstractC5852n3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i9) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i9, layoutParams, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        C1050m c1050mM10051w;
        InterfaceC1231l interfaceC1231l;
        InterfaceC1231l interfaceC1231l2;
        C6063c c6063c = this.f24100T;
        if (c6063c != null) {
            int size = sparseArray.size();
            for (int i9 = 0; i9 < size; i9++) {
                int iKeyAt = sparseArray.keyAt(i9);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                C5602f0 c5602f0 = (C5602f0) c6063c.f24537h.f3357c.m2313b(iKeyAt);
                if (c5602f0 != null && (c1050mM10051w = c5602f0.m10051w()) != null) {
                    C0943k0 c0943k0 = c1050mM10051w.f3341g;
                    Object objM2320g = c0943k0.m2320g(AbstractC1049l.f3321g);
                    if (objM2320g == null) {
                        objM2320g = null;
                    }
                    C1038a c1038a = (C1038a) objM2320g;
                    if (c1038a != null && (interfaceC1231l2 = (InterfaceC1231l) c1038a.f3270b) != null) {
                    }
                    Object objM2320g2 = c0943k0.m2320g(AbstractC1049l.f3322h);
                    C1038a c1038a2 = (C1038a) (objM2320g2 != null ? objM2320g2 : null);
                    if (c1038a2 != null && (interfaceC1231l = (InterfaceC1231l) c1038a2.f3270b) != null) {
                    }
                }
            }
        }
        C1671c c1671c = this.f24098S;
        if (c1671c != null) {
            C6070j c6070j = (C6070j) c1671c.f5521h;
            if (c6070j.f24549a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i10 = 0; i10 < size2; i10++) {
                int iKeyAt2 = sparseArray.keyAt(i10);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (c6070j.f24549a.get(Integer.valueOf(iKeyAt2)) != null) {
                        C0086a.m445d();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new C0920a("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new C0920a("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new C0920a("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.lifecycle.InterfaceC0097d
    /* JADX INFO: renamed from: c */
    public final void mo152c(InterfaceC0112q interfaceC0112q) {
        C5952x1 c5952x1 = this.f24122m;
        if (c5952x1 != null) {
            C4079c c4079c = (C4079c) c5952x1.f24181a.f23527b;
            if (c4079c.f13517a && !c4079c.f13519c) {
                InterfaceC1827f interfaceC1827f = c5952x1.f24184d;
                if (interfaceC1827f != null) {
                    interfaceC1827f.cancel();
                }
                c5952x1.f24184d = null;
                return;
            }
            if (c4079c.f13518b) {
                return;
            }
            if (!c4079c.f13519c) {
                AbstractC4228a.m8492a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!c4079c.f13520d.m2322i()) {
                AbstractC4228a.m8492a("Attempted to start retaining exited values with pending exited values");
            }
            c4079c.f13519c = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean canScrollHorizontally(int i9) {
        return this.f24072F.m10693f(i9, this.f24112h, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean canScrollVertically(int i9) {
        return this.f24072F.m10693f(i9, this.f24112h, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C0933f0 c0933f0 = this.f24082K;
        if (!isAttachedToWindow()) {
            m10639p(getRoot());
        }
        m10666x(true);
        AbstractC4662m.m9129j().mo9089m();
        this.f24086M = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            C1033v c1033v = this.f24146y;
            C0993b c0993b = c1033v.f3257a;
            Canvas canvas2 = c0993b.f3149a;
            c0993b.f3149a = canvas;
            getRoot().m10038i(c0993b, null);
            c1033v.f3257a.f3149a = canvas2;
            if (c0933f0.m2294i()) {
                int i9 = c0933f0.f2924b;
                for (int i10 = 0; i10 < i9; i10++) {
                    ((C5916o1) ((InterfaceC5638q1) c0933f0.m2291f(i10))).m10629g();
                }
            }
            int i11 = AbstractC5909m2.f23981g;
            c0933f0.m2289d();
            this.f24086M = false;
            Trace.endSection();
            C0933f0 c0933f02 = this.f24084L;
            if (c0933f02 != null) {
                c0933f0.m2287b(c0933f02);
                c0933f02.m2289d();
            }
            if (m10640r()) {
                AbstractC5935t0.m10669a(this, this.f24075G0);
                View view = this.f24132r;
                if (view != null) {
                    AbstractC5935t0.m10669a(view, this.f24077H0);
                    if (!Float.isNaN(this.f24077H0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.f24075G0 = Float.NaN;
                this.f24077H0 = Float.NaN;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:319:0x04db */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:456:0x06b3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:608:0x0511 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:615:0x04ee */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:618:0x04e4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:649:0x06e1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:658:0x06c4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:661:0x06bc */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04f3 A[PHI: r6
  0x04f3: PHI (r6v50 ??) = (r6v74 ??), (r6v75 ??), (r6v76 ??) binds: [B:307:0x04b5, B:309:0x04b9, B:324:0x04ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x06c7 A[PHI: r5
  0x06c7: PHI (r5v37 ??) = (r5v85 ??), (r5v86 ??), (r5v87 ??) binds: [B:444:0x068d, B:446:0x0691, B:461:0x06c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r4v32, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v59, types: [y0.n] */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r5v78 */
    /* JADX WARN: Type inference failed for: r5v79 */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50, types: [j0.b] */
    /* JADX WARN: Type inference failed for: r6v51 */
    /* JADX WARN: Type inference failed for: r6v52 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54, types: [j0.b] */
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
    */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        int i9;
        String str;
        int i10;
        C0058k c0058k;
        String str2;
        long jValueAt;
        C3286a c3286a;
        Object obj;
        long j3;
        long j4;
        int i11;
        char c10;
        int i12;
        long jFloatToRawIntBits;
        InterfaceC3288c interfaceC3288c;
        C5587b1 c5587b1;
        boolean z9;
        ?? r42;
        C5587b1 c5587b12;
        ?? M10149e;
        InterfaceC3288c interfaceC3288c2;
        boolean z10;
        int size;
        int size2;
        C5587b1 c5587b13;
        boolean z11;
        ?? r5;
        C5587b1 c5587b14;
        ?? M10149e2;
        boolean z12;
        C5898k c5898k;
        int size3;
        C5587b1 c5587b15;
        boolean z13;
        AbstractC5852n abstractC5852nM10149e;
        C5587b1 c5587b16;
        if (this.f24083K0) {
            RunnableC5894j runnableC5894j = this.f24081J0;
            removeCallbacks(runnableC5894j);
            if (motionEvent.getActionMasked() == 8) {
                this.f24083K0 = false;
            } else {
                runnableC5894j.run();
            }
        }
        if (m10641s(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        String str3 = "visitAncestors called on an unattached node";
        int actionIndex = -1;
        int i13 = 1;
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (m10660o(motionEvent) & 4) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            getContext();
            viewConfiguration.getScaledVerticalScrollFactor();
            getContext();
            viewConfiguration.getScaledHorizontalScrollFactor();
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            InterfaceC0666l focusOwner = getFocusOwner();
            C0372b c0372b = new C0372b(this, 8, motionEvent);
            C0670p c0670p = (C0670p) focusOwner;
            if (c0670p.f2057d.f2047e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            C0653b0 c0653b0M1814f = AbstractC0656d.m1814f(c0670p.f2056c);
            if (c0653b0M1814f != null) {
                if (!c0653b0M1814f.f23788g.f23801t) {
                    AbstractC4229a.m8494b("visitAncestors called on an unattached node");
                }
                AbstractC5852n abstractC5852n = c0653b0M1814f.f23788g;
                C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(c0653b0M1814f);
                loop0: while (true) {
                    if (c5602f0M10167w == null) {
                        abstractC5852nM10149e = null;
                        break;
                    }
                    if ((c5602f0M10167w.f22778L.f22719f.f23791j & 16384) != 0) {
                        while (abstractC5852n != null) {
                            if ((abstractC5852n.f23790i & 16384) != 0) {
                                abstractC5852nM10149e = abstractC5852n;
                                C2046b c2046b = null;
                                while (abstractC5852nM10149e != null) {
                                    if (abstractC5852nM10149e instanceof C5898k) {
                                        break loop0;
                                    }
                                    if ((abstractC5852nM10149e.f23790i & 16384) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                        int i14 = 0;
                                        for (AbstractC5852n abstractC5852n2 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
                                            if ((abstractC5852n2.f23790i & 16384) != 0) {
                                                i14++;
                                                if (i14 == 1) {
                                                    abstractC5852nM10149e = abstractC5852n2;
                                                } else {
                                                    if (c2046b == null) {
                                                        c2046b = new C2046b(new AbstractC5852n[16]);
                                                    }
                                                    if (abstractC5852nM10149e != null) {
                                                        c2046b.m5056b(abstractC5852nM10149e);
                                                        abstractC5852nM10149e = null;
                                                    }
                                                    c2046b.m5056b(abstractC5852n2);
                                                }
                                            }
                                        }
                                        if (i14 == 1) {
                                        }
                                    }
                                    abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b);
                                }
                            }
                            abstractC5852n = abstractC5852n.f23792k;
                        }
                    }
                    c5602f0M10167w = c5602f0M10167w.m10049u();
                    abstractC5852n = (c5602f0M10167w == null || (c5587b16 = c5602f0M10167w.f22778L) == null) ? null : c5587b16.f22718e;
                }
                c5898k = (C5898k) abstractC5852nM10149e;
            } else {
                c5898k = null;
            }
            if (c5898k != null) {
                if (!c5898k.f23788g.f23801t) {
                    AbstractC4229a.m8494b("visitAncestors called on an unattached node");
                }
                AbstractC5852n abstractC5852n3 = c5898k.f23788g.f23792k;
                C5602f0 c5602f0M10167w2 = AbstractC5618k.m10167w(c5898k);
                ArrayList arrayList = null;
                while (c5602f0M10167w2 != null) {
                    if ((c5602f0M10167w2.f22778L.f22719f.f23791j & 16384) != 0) {
                        while (abstractC5852n3 != null) {
                            if ((abstractC5852n3.f23790i & 16384) != 0) {
                                AbstractC5852n abstractC5852nM10149e2 = abstractC5852n3;
                                C2046b c2046b2 = null;
                                while (abstractC5852nM10149e2 != null) {
                                    if (abstractC5852nM10149e2 instanceof C5898k) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(abstractC5852nM10149e2);
                                        z13 = false;
                                    } else {
                                        z13 = true;
                                    }
                                    if (z13 && (abstractC5852nM10149e2.f23790i & 16384) != 0 && (abstractC5852nM10149e2 instanceof AbstractC5615j)) {
                                        int i15 = 0;
                                        for (AbstractC5852n abstractC5852n4 = ((AbstractC5615j) abstractC5852nM10149e2).f22875v; abstractC5852n4 != null; abstractC5852n4 = abstractC5852n4.f23793l) {
                                            if ((abstractC5852n4.f23790i & 16384) != 0) {
                                                i15++;
                                                if (i15 == 1) {
                                                    abstractC5852nM10149e2 = abstractC5852n4;
                                                } else {
                                                    if (c2046b2 == null) {
                                                        c2046b2 = new C2046b(new AbstractC5852n[16]);
                                                    }
                                                    if (abstractC5852nM10149e2 != null) {
                                                        c2046b2.m5056b(abstractC5852nM10149e2);
                                                        abstractC5852nM10149e2 = null;
                                                    }
                                                    c2046b2.m5056b(abstractC5852n4);
                                                }
                                            }
                                        }
                                        if (i15 == 1) {
                                        }
                                    }
                                    abstractC5852nM10149e2 = AbstractC5618k.m10149e(c2046b2);
                                }
                            }
                            abstractC5852n3 = abstractC5852n3.f23792k;
                        }
                    }
                    c5602f0M10167w2 = c5602f0M10167w2.m10049u();
                    abstractC5852n3 = (c5602f0M10167w2 == null || (c5587b15 = c5602f0M10167w2.f22778L) == null) ? null : c5587b15.f22718e;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i16 = size3 - 1;
                        ((C5898k) arrayList.get(size3)).getClass();
                        if (i16 < 0) {
                            break;
                        }
                        size3 = i16;
                    }
                }
                AbstractC5852n abstractC5852nM10149e3 = c5898k.f23788g;
                C2046b c2046b3 = null;
                while (abstractC5852nM10149e3 != null) {
                    if (abstractC5852nM10149e3 instanceof C5898k) {
                    } else if ((abstractC5852nM10149e3.f23790i & 16384) != 0 && (abstractC5852nM10149e3 instanceof AbstractC5615j)) {
                        int i17 = 0;
                        for (AbstractC5852n abstractC5852n5 = ((AbstractC5615j) abstractC5852nM10149e3).f22875v; abstractC5852n5 != null; abstractC5852n5 = abstractC5852n5.f23793l) {
                            if ((abstractC5852n5.f23790i & 16384) != 0) {
                                i17++;
                                if (i17 == 1) {
                                    abstractC5852nM10149e3 = abstractC5852n5;
                                } else {
                                    if (c2046b3 == null) {
                                        c2046b3 = new C2046b(new AbstractC5852n[16]);
                                    }
                                    if (abstractC5852nM10149e3 != null) {
                                        c2046b3.m5056b(abstractC5852nM10149e3);
                                        abstractC5852nM10149e3 = null;
                                    }
                                    c2046b3.m5056b(abstractC5852n5);
                                }
                            }
                        }
                        if (i17 == 1) {
                        }
                    }
                    abstractC5852nM10149e3 = AbstractC5618k.m10149e(c2046b3);
                }
                if (!((Boolean) c0372b.invoke()).booleanValue()) {
                    AbstractC5852n abstractC5852nM10149e4 = c5898k.f23788g;
                    C2046b c2046b4 = null;
                    while (abstractC5852nM10149e4 != null) {
                        if (abstractC5852nM10149e4 instanceof C5898k) {
                        } else if ((abstractC5852nM10149e4.f23790i & 16384) != 0 && (abstractC5852nM10149e4 instanceof AbstractC5615j)) {
                            int i18 = 0;
                            for (AbstractC5852n abstractC5852n6 = ((AbstractC5615j) abstractC5852nM10149e4).f22875v; abstractC5852n6 != null; abstractC5852n6 = abstractC5852n6.f23793l) {
                                if ((abstractC5852n6.f23790i & 16384) != 0) {
                                    i18++;
                                    if (i18 == 1) {
                                        abstractC5852nM10149e4 = abstractC5852n6;
                                    } else {
                                        if (c2046b4 == null) {
                                            c2046b4 = new C2046b(new AbstractC5852n[16]);
                                        }
                                        if (abstractC5852nM10149e4 != null) {
                                            c2046b4.m5056b(abstractC5852nM10149e4);
                                            abstractC5852nM10149e4 = null;
                                        }
                                        c2046b4.m5056b(abstractC5852n6);
                                    }
                                }
                            }
                            if (i18 == 1) {
                            }
                        }
                        abstractC5852nM10149e4 = AbstractC5618k.m10149e(c2046b4);
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        for (int i19 = 0; i19 < size4; i19++) {
                            ((C5898k) arrayList.get(i19)).getClass();
                        }
                    }
                }
            }
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        C3286a c3286a2 = this.f24116j;
        C3897h c3897h = this.f24090O;
        C0952p c0952p = c3897h.f12776e;
        SparseLongArray sparseLongArray = c3897h.f12773b;
        int actionMasked = motionEvent.getActionMasked();
        c3897h.m8086b(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            c3897h.f12774c.clear();
            str = "visitAncestors called on an unattached node";
            i9 = 16;
            c0058k = null;
        } else {
            c3897h.m8085a(motionEvent);
            if (actionMasked == 1) {
                actionIndex = 0;
            } else if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
            boolean z14 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
            i9 = 16;
            int pointerCount = motionEvent.getPointerCount();
            ArrayList arrayList2 = new ArrayList(pointerCount);
            int i20 = 0;
            while (i20 < pointerCount) {
                int pointerId = motionEvent.getPointerId(i20);
                int i21 = i13;
                int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
                if (iIndexOfKey >= 0) {
                    str2 = str3;
                    jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                    c3286a = c3286a2;
                } else {
                    str2 = str3;
                    jValueAt = c3897h.f12772a;
                    c3286a = c3286a2;
                    c3897h.f12772a = jValueAt + 1;
                    sparseLongArray.put(pointerId, jValueAt);
                }
                C3897h c3897h2 = c3897h;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getX(i20))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY(i20))) & 4294967295L);
                ?? r32 = i20 != actionIndex ? i21 : 0;
                int iM3380b = AbstractC1256a.m3380b(c0952p.f2999h, c0952p.f3001j, jValueAt);
                if (iM3380b < 0 || (obj = c0952p.f3000i[iM3380b]) == AbstractC0954q.f3004a) {
                    obj = null;
                }
                C3895g c3895g = (C3895g) obj;
                if (i20 == actionIndex) {
                    c0952p.m2344c(jValueAt);
                    j3 = jValueAt;
                    j4 = 2147483647L;
                    c10 = ' ';
                    i11 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                } else {
                    if (z14) {
                        j4 = 2147483647L;
                        i11 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                        j3 = jValueAt;
                        c0952p.m2343b(new C3895g(1 | ((motionEvent.getEventTime() & 2147483647L) << i21) | (((long) ((((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))) << 16))) << 32)), j3);
                    } else {
                        j3 = jValueAt;
                        j4 = 2147483647L;
                        i11 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    }
                    c10 = ' ';
                }
                long eventTime = motionEvent.getEventTime();
                long j5 = j4;
                float pressure = motionEvent.getPressure(i20);
                int i22 = i11;
                int i23 = actionIndex;
                long eventTime2 = c3895g != null ? (c3895g.f12767a >> i21) & j5 : motionEvent.getEventTime();
                if (c3895g != null) {
                    i12 = i23;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits((short) (r5 & i22))) & 4294967295L) | (((long) Float.floatToRawIntBits((short) (((int) (c3895g.f12767a >>> c10)) >>> 16))) << c10);
                } else {
                    i12 = i23;
                    jFloatToRawIntBits = jFloatToRawIntBits2;
                }
                arrayList2.add(new C3287b(j3, eventTime, jFloatToRawIntBits2, r32, pressure, eventTime2, jFloatToRawIntBits, c3895g != null ? (c3895g.f12767a & 1) != 0 ? i21 : 0 : 0));
                i20++;
                c3897h = c3897h2;
                i13 = i21;
                str3 = str2;
                c3286a2 = c3286a;
                actionIndex = i12;
            }
            C3286a c3286a3 = c3286a2;
            str = str3;
            int i24 = i13;
            c3897h.m8089e(motionEvent);
            if (c3286a3 != null) {
                i10 = c3286a3.f10449a;
            } else {
                if (!motionEvent.isFromSource(2097152)) {
                    C2104o.m5294t("MotionEvent must be a touch navigation source");
                    return false;
                }
                InputDevice device = motionEvent.getDevice();
                if (device != null) {
                    InputDevice.MotionRange motionRange = device.getMotionRange(0);
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(i24);
                    if (motionRange == null || motionRange2 != null) {
                        if (motionRange2 == null || motionRange != null) {
                            if (motionRange != null && motionRange2 != null) {
                                float range = motionRange.getRange();
                                float range2 = motionRange2.getRange();
                                if (range <= range2 || (range2 != 0.0f && range / range2 < 5.0f)) {
                                    if (range2 <= range || (range != 0.0f && range2 / range < 5.0f)) {
                                    }
                                }
                                i10 = 1;
                            }
                            i10 = 0;
                        }
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                } else {
                    i10 = 0;
                }
            }
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 2 || actionMasked != 5) {
            }
            c0058k = new C0058k(arrayList2, i10, motionEvent);
        }
        C5924q1 c5924q1 = this.f24085L0;
        if (c0058k == null) {
            C0653b0 c0653b0M1848f = ((C0670p) getFocusOwner()).m1848f();
            if (c0653b0M1848f != null) {
                if (!c0653b0M1848f.f23788g.f23801t) {
                    AbstractC4229a.m8494b(str);
                }
                AbstractC5852n abstractC5852n7 = c0653b0M1848f.f23788g;
                C5602f0 c5602f0M10167w3 = AbstractC5618k.m10167w(c0653b0M1848f);
                loop26: while (true) {
                    if (c5602f0M10167w3 == null) {
                        r42 = 0;
                        break;
                    }
                    int i25 = 2097152;
                    if ((c5602f0M10167w3.f22778L.f22719f.f23791j & 2097152) != 0) {
                        while (abstractC5852n7 != null) {
                            if ((abstractC5852n7.f23790i & i25) != 0) {
                                r42 = abstractC5852n7;
                                ?? r52 = 0;
                                while (r42 != 0) {
                                    if (r42 instanceof InterfaceC3288c) {
                                        break loop26;
                                    }
                                    ?? c2046b5 = r52;
                                    if ((r42.f23790i & i25) != 0) {
                                        c2046b5 = r52;
                                        if (r42 instanceof AbstractC5615j) {
                                            AbstractC5852n abstractC5852n8 = ((AbstractC5615j) r42).f22875v;
                                            int i26 = 0;
                                            M10149e = r42;
                                            c2046b5 = r52;
                                            while (abstractC5852n8 != null) {
                                                if ((abstractC5852n8.f23790i & i25) != 0) {
                                                    i26++;
                                                    c2046b5 = c2046b5;
                                                    if (i26 == 1) {
                                                        M10149e = abstractC5852n8;
                                                    } else {
                                                        if (c2046b5 == 0) {
                                                            c2046b5 = new C2046b(new AbstractC5852n[16]);
                                                        }
                                                        if (M10149e != 0) {
                                                            c2046b5.m5056b(M10149e);
                                                            M10149e = 0;
                                                        }
                                                        c2046b5.m5056b(abstractC5852n8);
                                                    }
                                                }
                                                abstractC5852n8 = abstractC5852n8.f23793l;
                                                i25 = 2097152;
                                                M10149e = M10149e;
                                                c2046b5 = c2046b5;
                                            }
                                            c2046b5 = c2046b5;
                                            if (i26 != 1) {
                                                M10149e = AbstractC5618k.m10149e(c2046b5);
                                            }
                                        }
                                    }
                                    i25 = 2097152;
                                    r42 = M10149e;
                                    r52 = c2046b5;
                                }
                            }
                            abstractC5852n7 = abstractC5852n7.f23792k;
                            i25 = 2097152;
                        }
                    }
                    c5602f0M10167w3 = c5602f0M10167w3.m10049u();
                    abstractC5852n7 = (c5602f0M10167w3 == null || (c5587b12 = c5602f0M10167w3.f22778L) == null) ? null : c5587b12.f22718e;
                }
                interfaceC3288c = (InterfaceC3288c) r42;
            } else {
                interfaceC3288c = null;
            }
            if (interfaceC3288c != null) {
                AbstractC5852n abstractC5852n9 = (AbstractC5852n) interfaceC3288c;
                if (!abstractC5852n9.f23788g.f23801t) {
                    AbstractC4229a.m8494b(str);
                }
                AbstractC5852n abstractC5852n10 = abstractC5852n9.f23788g.f23792k;
                C5602f0 c5602f0M10167w4 = AbstractC5618k.m10167w(interfaceC3288c);
                ArrayList arrayList3 = null;
                while (c5602f0M10167w4 != null) {
                    int i27 = 2097152;
                    if ((c5602f0M10167w4.f22778L.f22719f.f23791j & 2097152) != 0) {
                        while (abstractC5852n10 != null) {
                            if ((abstractC5852n10.f23790i & i27) != 0) {
                                AbstractC5852n abstractC5852nM10149e5 = abstractC5852n10;
                                C2046b c2046b6 = null;
                                while (abstractC5852nM10149e5 != null) {
                                    if (abstractC5852nM10149e5 instanceof InterfaceC3288c) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(abstractC5852nM10149e5);
                                        z9 = false;
                                    } else {
                                        z9 = true;
                                    }
                                    if (z9) {
                                        if ((abstractC5852nM10149e5.f23790i & 2097152) != 0 && (abstractC5852nM10149e5 instanceof AbstractC5615j)) {
                                            int i28 = 0;
                                            for (AbstractC5852n abstractC5852n11 = ((AbstractC5615j) abstractC5852nM10149e5).f22875v; abstractC5852n11 != null; abstractC5852n11 = abstractC5852n11.f23793l) {
                                                if ((abstractC5852n11.f23790i & 2097152) != 0) {
                                                    i28++;
                                                    if (i28 == 1) {
                                                        abstractC5852nM10149e5 = abstractC5852n11;
                                                    } else {
                                                        if (c2046b6 == null) {
                                                            c2046b6 = new C2046b(new AbstractC5852n[16]);
                                                        }
                                                        if (abstractC5852nM10149e5 != null) {
                                                            c2046b6.m5056b(abstractC5852nM10149e5);
                                                            abstractC5852nM10149e5 = null;
                                                        }
                                                        c2046b6.m5056b(abstractC5852n11);
                                                    }
                                                }
                                            }
                                            if (i28 == 1) {
                                            }
                                        }
                                    }
                                    abstractC5852nM10149e5 = AbstractC5618k.m10149e(c2046b6);
                                }
                            }
                            i27 = 2097152;
                            abstractC5852n10 = abstractC5852n10.f23792k;
                        }
                    }
                    c5602f0M10167w4 = c5602f0M10167w4.m10049u();
                    abstractC5852n10 = (c5602f0M10167w4 == null || (c5587b1 = c5602f0M10167w4.f22778L) == null) ? null : c5587b1.f22718e;
                }
                interfaceC3288c.mo5382y0();
                if (arrayList3 != null) {
                    int size5 = arrayList3.size();
                    for (int i29 = 0; i29 < size5; i29++) {
                        ((InterfaceC3288c) arrayList3.get(i29)).mo5382y0();
                    }
                }
            }
            c5924q1.f24035b = 0;
            c5924q1.f24036c = true;
            return true;
        }
        C0670p c0670p2 = (C0670p) getFocusOwner();
        if (c0670p2.f2057d.f2047e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        } else {
            C0653b0 c0653b0M1848f2 = c0670p2.m1848f();
            if (c0653b0M1848f2 != null) {
                if (!c0653b0M1848f2.f23788g.f23801t) {
                    AbstractC4229a.m8494b(str);
                }
                AbstractC5852n abstractC5852n12 = c0653b0M1848f2.f23788g;
                C5602f0 c5602f0M10167w5 = AbstractC5618k.m10167w(c0653b0M1848f2);
                loop14: while (true) {
                    if (c5602f0M10167w5 == null) {
                        r5 = 0;
                        break;
                    }
                    int i30 = 2097152;
                    if ((c5602f0M10167w5.f22778L.f22719f.f23791j & 2097152) != 0) {
                        while (abstractC5852n12 != null) {
                            if ((abstractC5852n12.f23790i & i30) != 0) {
                                r5 = abstractC5852n12;
                                ?? r62 = 0;
                                while (r5 != 0) {
                                    if (r5 instanceof InterfaceC3288c) {
                                        break loop14;
                                    }
                                    ?? c2046b7 = r62;
                                    if ((r5.f23790i & i30) != 0) {
                                        c2046b7 = r62;
                                        if (r5 instanceof AbstractC5615j) {
                                            AbstractC5852n abstractC5852n13 = ((AbstractC5615j) r5).f22875v;
                                            int i31 = 0;
                                            M10149e2 = r5;
                                            c2046b7 = r62;
                                            while (abstractC5852n13 != null) {
                                                if ((abstractC5852n13.f23790i & i30) != 0) {
                                                    i31++;
                                                    c2046b7 = c2046b7;
                                                    if (i31 == 1) {
                                                        M10149e2 = abstractC5852n13;
                                                    } else {
                                                        if (c2046b7 == 0) {
                                                            c2046b7 = new C2046b(new AbstractC5852n[i9]);
                                                        }
                                                        if (M10149e2 != 0) {
                                                            c2046b7.m5056b(M10149e2);
                                                            M10149e2 = 0;
                                                        }
                                                        c2046b7.m5056b(abstractC5852n13);
                                                    }
                                                }
                                                abstractC5852n13 = abstractC5852n13.f23793l;
                                                i9 = 16;
                                                i30 = 2097152;
                                                M10149e2 = M10149e2;
                                                c2046b7 = c2046b7;
                                            }
                                            c2046b7 = c2046b7;
                                            if (i31 != 1) {
                                                M10149e2 = AbstractC5618k.m10149e(c2046b7);
                                            }
                                        }
                                    }
                                    i9 = 16;
                                    i30 = 2097152;
                                    r5 = M10149e2;
                                    r62 = c2046b7;
                                }
                            }
                            abstractC5852n12 = abstractC5852n12.f23792k;
                            i9 = 16;
                            i30 = 2097152;
                        }
                    }
                    c5602f0M10167w5 = c5602f0M10167w5.m10049u();
                    abstractC5852n12 = (c5602f0M10167w5 == null || (c5587b14 = c5602f0M10167w5.f22778L) == null) ? null : c5587b14.f22718e;
                    i9 = 16;
                }
                interfaceC3288c2 = (InterfaceC3288c) r5;
            } else {
                interfaceC3288c2 = null;
            }
            if (interfaceC3288c2 != null) {
                AbstractC5852n abstractC5852n14 = (AbstractC5852n) interfaceC3288c2;
                if (!abstractC5852n14.f23788g.f23801t) {
                    AbstractC4229a.m8494b(str);
                }
                AbstractC5852n abstractC5852n15 = abstractC5852n14.f23788g.f23792k;
                C5602f0 c5602f0M10167w6 = AbstractC5618k.m10167w(interfaceC3288c2);
                ArrayList arrayList4 = null;
                while (c5602f0M10167w6 != null) {
                    int i32 = 2097152;
                    if ((c5602f0M10167w6.f22778L.f22719f.f23791j & 2097152) != 0) {
                        while (abstractC5852n15 != null) {
                            if ((abstractC5852n15.f23790i & i32) != 0) {
                                AbstractC5852n abstractC5852nM10149e6 = abstractC5852n15;
                                C2046b c2046b8 = null;
                                while (abstractC5852nM10149e6 != null) {
                                    if (abstractC5852nM10149e6 instanceof InterfaceC3288c) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(abstractC5852nM10149e6);
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    if (z11) {
                                        int i33 = 2097152;
                                        if ((abstractC5852nM10149e6.f23790i & 2097152) != 0 && (abstractC5852nM10149e6 instanceof AbstractC5615j)) {
                                            AbstractC5852n abstractC5852n16 = ((AbstractC5615j) abstractC5852nM10149e6).f22875v;
                                            int i34 = 0;
                                            while (abstractC5852n16 != null) {
                                                if ((abstractC5852n16.f23790i & i33) != 0) {
                                                    i34++;
                                                    if (i34 == 1) {
                                                        abstractC5852nM10149e6 = abstractC5852n16;
                                                    } else {
                                                        if (c2046b8 == null) {
                                                            c2046b8 = new C2046b(new AbstractC5852n[16]);
                                                        }
                                                        if (abstractC5852nM10149e6 != null) {
                                                            c2046b8.m5056b(abstractC5852nM10149e6);
                                                            abstractC5852nM10149e6 = null;
                                                        }
                                                        c2046b8.m5056b(abstractC5852n16);
                                                    }
                                                }
                                                abstractC5852n16 = abstractC5852n16.f23793l;
                                                i33 = 2097152;
                                            }
                                            if (i34 == 1) {
                                            }
                                        }
                                    }
                                    abstractC5852nM10149e6 = AbstractC5618k.m10149e(c2046b8);
                                }
                            }
                            abstractC5852n15 = abstractC5852n15.f23792k;
                            i32 = 2097152;
                        }
                    }
                    c5602f0M10167w6 = c5602f0M10167w6.m10049u();
                    abstractC5852n15 = (c5602f0M10167w6 == null || (c5587b13 = c5602f0M10167w6.f22778L) == null) ? null : c5587b13.f22718e;
                }
                EnumC3905l enumC3905l = EnumC3905l.f12812g;
                if (arrayList4 != null && arrayList4.size() - 1 >= 0) {
                    while (true) {
                        int i35 = size2 - 1;
                        ((InterfaceC3288c) arrayList4.get(size2)).mo5377T0(c0058k, enumC3905l);
                        if (i35 < 0) {
                            break;
                        }
                        size2 = i35;
                    }
                }
                interfaceC3288c2.mo5377T0(c0058k, enumC3905l);
                EnumC3905l enumC3905l2 = EnumC3905l.f12813h;
                interfaceC3288c2.mo5377T0(c0058k, enumC3905l2);
                if (arrayList4 != null) {
                    int size6 = arrayList4.size();
                    for (int i36 = 0; i36 < size6; i36++) {
                        ((InterfaceC3288c) arrayList4.get(i36)).mo5377T0(c0058k, enumC3905l2);
                    }
                }
                EnumC3905l enumC3905l3 = EnumC3905l.f12814i;
                if (arrayList4 != null && arrayList4.size() - 1 >= 0) {
                    while (true) {
                        int i37 = size - 1;
                        ((InterfaceC3288c) arrayList4.get(size)).mo5377T0(c0058k, enumC3905l3);
                        if (i37 < 0) {
                            break;
                        }
                        size = i37;
                    }
                }
                interfaceC3288c2.mo5377T0(c0058k, enumC3905l3);
            }
            ArrayList arrayList5 = (ArrayList) c0058k.f177i;
            int size7 = arrayList5.size();
            for (int i38 = 0; i38 < size7; i38++) {
                if (((C3287b) arrayList5.get(i38)).f10458i) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        c5924q1.getClass();
        MotionEvent motionEvent2 = (MotionEvent) c0058k.f178j;
        int action = motionEvent2.getAction();
        if (action != 0) {
            z12 = true;
            if ((action == 1 || action == 2) && z10) {
                c5924q1.f24035b = 0;
                c5924q1.f24036c = true;
            }
        } else {
            z12 = true;
            c5924q1.f24035b = c0058k.f176h;
            c5924q1.f24036c = false;
        }
        c5924q1.f24037d.onTouchEvent(motionEvent2);
        return z12;
    }

    /* JADX DEBUG: Class process forced to load method for inline: y1.z.x(y1.z, int, int, java.lang.Integer, int):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0155  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i9;
        boolean z9 = this.f24083K0;
        RunnableC5894j runnableC5894j = this.f24081J0;
        if (z9) {
            removeCallbacks(runnableC5894j);
            runnableC5894j.run();
        }
        if (!m10641s(motionEvent) && isAttachedToWindow()) {
            ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z = this.f24072F;
            ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = viewOnAttachStateChangeListenerC5958z.f24215j;
            AccessibilityManager accessibilityManager = viewOnAttachStateChangeListenerC5958z.f24218m;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x4 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    viewTreeObserverOnGlobalLayoutListenerC5934t.m10666x(true);
                    C5633p c5633p = new C5633p();
                    C5602f0 root = viewTreeObserverOnGlobalLayoutListenerC5934t.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x4)) << 32) | (((long) Float.floatToRawIntBits(y10)) & 4294967295L);
                    C5587b1 c5587b1 = root.f22778L;
                    AbstractC5614i1 abstractC5614i1 = c5587b1.f22717d;
                    C1020o0 c1020o0 = AbstractC5614i1.f22844T;
                    c5587b1.f22717d.m10111w1(AbstractC5614i1.f22848X, abstractC5614i1.m10103o1(jFloatToRawIntBits), c5633p, 1, true);
                    C0933f0 c0933f0 = c5633p.f22940g;
                    for (int i10 = c0933f0.f2924b - 1; -1 < i10; i10--) {
                        Object objM2291f = c0933f0.m2291f(i10);
                        objM2291f.getClass();
                        C5602f0 c5602f0M10167w = AbstractC5618k.m10167w((AbstractC5852n) objM2291f);
                        if (viewTreeObserverOnGlobalLayoutListenerC5934t.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(c5602f0M10167w) != null) {
                            break;
                        }
                        if (c5602f0M10167w.f22778L.m9982d(8)) {
                            int iM10703t = viewOnAttachStateChangeListenerC5958z.m10703t(c5602f0M10167w.f22791h);
                            C1054q c1054qM2670a = AbstractC1057t.m2670a(c5602f0M10167w, false);
                            if (AbstractC1057t.m2677h(c1054qM2670a)) {
                                if (!c1054qM2670a.m2659k().f3341g.m2316c(AbstractC1058u.f3360A)) {
                                    i9 = iM10703t;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i9 = Integer.MIN_VALUE;
                    viewTreeObserverOnGlobalLayoutListenerC5934t.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i11 = viewOnAttachStateChangeListenerC5958z.f24216k;
                    if (i11 != i9) {
                        viewOnAttachStateChangeListenerC5958z.f24216k = i9;
                        ViewOnAttachStateChangeListenerC5958z.m10683x(viewOnAttachStateChangeListenerC5958z, i9, 128, null, 12);
                        ViewOnAttachStateChangeListenerC5958z.m10683x(viewOnAttachStateChangeListenerC5958z, i11, Opcodes.ACC_NATIVE, null, 12);
                    }
                } else if (action == 10) {
                    int i12 = viewOnAttachStateChangeListenerC5958z.f24216k;
                    if (i12 == Integer.MIN_VALUE) {
                        viewTreeObserverOnGlobalLayoutListenerC5934t.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i12 != Integer.MIN_VALUE) {
                        viewOnAttachStateChangeListenerC5958z.f24216k = Integer.MIN_VALUE;
                        ViewOnAttachStateChangeListenerC5958z.m10683x(viewOnAttachStateChangeListenerC5958z, Integer.MIN_VALUE, 128, null, 12);
                        ViewOnAttachStateChangeListenerC5958z.m10683x(viewOnAttachStateChangeListenerC5958z, i12, Opcodes.ACC_NATIVE, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && m10662t(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.f24067C0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f24067C0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.f24083K0 = true;
                        postDelayed(runnableC5894j, 8L);
                        return false;
                    }
                } else if ((m10660o(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (m10663u(motionEvent)) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((C0670p) getFocusOwner()).m1846d(keyEvent, new C0372b(this, 7, keyEvent));
        }
        C5944v1 c5944v1 = getComposeViewContext().f23875s;
        int metaState = keyEvent.getMetaState();
        c5944v1.getClass();
        AbstractC5921p2.f24030a.setValue(new C3888c0(metaState));
        return ((C0670p) getFocusOwner()).m1846d(keyEvent, C0665k.f2048g) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C5587b1 c5587b1;
        if (isFocused()) {
            C0670p c0670p = (C0670p) getFocusOwner();
            if (c0670p.f2057d.f2047e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                C0653b0 c0653b0M1814f = AbstractC0656d.m1814f(c0670p.f2056c);
                if (c0653b0M1814f != null) {
                    if (!c0653b0M1814f.f23788g.f23801t) {
                        AbstractC4229a.m8494b("visitAncestors called on an unattached node");
                    }
                    AbstractC5852n abstractC5852n = c0653b0M1814f.f23788g;
                    C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(c0653b0M1814f);
                    while (c5602f0M10167w != null) {
                        if ((c5602f0M10167w.f22778L.f22719f.f23791j & Opcodes.ACC_DEPRECATED) != 0) {
                            while (abstractC5852n != null) {
                                if ((abstractC5852n.f23790i & Opcodes.ACC_DEPRECATED) != 0) {
                                    AbstractC5852n abstractC5852nM10149e = abstractC5852n;
                                    C2046b c2046b = null;
                                    while (abstractC5852nM10149e != null) {
                                        if ((abstractC5852nM10149e.f23790i & Opcodes.ACC_DEPRECATED) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                            int i9 = 0;
                                            for (AbstractC5852n abstractC5852n2 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
                                                if ((abstractC5852n2.f23790i & Opcodes.ACC_DEPRECATED) != 0) {
                                                    i9++;
                                                    if (i9 == 1) {
                                                        abstractC5852nM10149e = abstractC5852n2;
                                                    } else {
                                                        if (c2046b == null) {
                                                            c2046b = new C2046b(new AbstractC5852n[16]);
                                                        }
                                                        if (abstractC5852nM10149e != null) {
                                                            c2046b.m5056b(abstractC5852nM10149e);
                                                            abstractC5852nM10149e = null;
                                                        }
                                                        c2046b.m5056b(abstractC5852n2);
                                                    }
                                                }
                                            }
                                            if (i9 == 1) {
                                            }
                                        }
                                        abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b);
                                    }
                                }
                                abstractC5852n = abstractC5852n.f23792k;
                            }
                        }
                        c5602f0M10167w = c5602f0M10167w.m10049u();
                        abstractC5852n = (c5602f0M10167w == null || (c5587b1 = c5602f0M10167w.f22778L) == null) ? null : c5587b1.f22718e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            C5859a0.f23815a.m10562a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object c5939u0;
        C0653b0 c0653b0M1848f;
        if (this.f24083K0) {
            RunnableC5894j runnableC5894j = this.f24081J0;
            removeCallbacks(runnableC5894j);
            MotionEvent motionEvent2 = this.f24067C0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f24083K0 = false;
            } else {
                runnableC5894j.run();
            }
        }
        if (!m10641s(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || m10663u(motionEvent))) {
            int iM10660o = m10660o(motionEvent);
            if ((iM10660o & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z9 = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z10 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z9 && z10) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (c5939u0 = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    c5939u0 = new C5939u0(1);
                }
                if (c5939u0.equals(new C5939u0(1)) && (c0653b0M1848f = ((C0670p) getFocusOwner()).m1848f()) != null) {
                    AbstractC5614i1 abstractC5614i1M10166v = AbstractC5618k.m10166v(c0653b0M1848f);
                    if (!AbstractC4434w.m8884h(abstractC5614i1M10166v).mo8866k0(abstractC5614i1M10166v, true).m2045a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((C0670p) getFocusOwner()).m1844b(8, false, true);
                    }
                }
            }
            if ((iM10660o & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041d1.InterfaceC0664j
    /* JADX INFO: renamed from: e */
    public final void mo1842e(C0653b0 c0653b0, C0653b0 c0653b02) {
        C5587b1 c5587b1;
        boolean z9;
        C5587b1 c5587b12;
        boolean z10;
        if (c0653b0 != null) {
            C0653b0 c0653b03 = c0653b0;
            if (!c0653b03.f23788g.f23801t) {
                AbstractC4229a.m8494b("visitAncestors called on an unattached node");
            }
            AbstractC5852n abstractC5852n = c0653b03.f23788g;
            C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(c0653b0);
            C0945l0 c0945l0 = null;
            ArrayList arrayList = null;
            while (c5602f0M10167w != null) {
                if ((c5602f0M10167w.f22778L.f22719f.f23791j & 2097152) != 0) {
                    while (abstractC5852n != null) {
                        if ((abstractC5852n.f23790i & 2097152) != 0) {
                            AbstractC5852n abstractC5852nM10149e = abstractC5852n;
                            C2046b c2046b = null;
                            while (abstractC5852nM10149e != null) {
                                if (abstractC5852nM10149e instanceof InterfaceC3288c) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC5852nM10149e);
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (z10 && (abstractC5852nM10149e.f23790i & 2097152) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                    int i9 = 0;
                                    for (AbstractC5852n abstractC5852n2 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n2 != null; abstractC5852n2 = abstractC5852n2.f23793l) {
                                        if ((abstractC5852n2.f23790i & 2097152) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                abstractC5852nM10149e = abstractC5852n2;
                                            } else {
                                                if (c2046b == null) {
                                                    c2046b = new C2046b(new AbstractC5852n[16]);
                                                }
                                                if (abstractC5852nM10149e != null) {
                                                    c2046b.m5056b(abstractC5852nM10149e);
                                                    abstractC5852nM10149e = null;
                                                }
                                                c2046b.m5056b(abstractC5852n2);
                                            }
                                        }
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b);
                            }
                        }
                        abstractC5852n = abstractC5852n.f23792k;
                    }
                }
                c5602f0M10167w = c5602f0M10167w.m10049u();
                abstractC5852n = (c5602f0M10167w == null || (c5587b12 = c5602f0M10167w.f22778L) == null) ? null : c5587b12.f22718e;
            }
            if (arrayList == null) {
                return;
            }
            if (c0653b02 != null) {
                if (!c0653b02.f23788g.f23801t) {
                    AbstractC4229a.m8494b("visitAncestors called on an unattached node");
                }
                AbstractC5852n abstractC5852n3 = c0653b02.f23788g;
                C5602f0 c5602f0M10167w2 = AbstractC5618k.m10167w(c0653b02);
                C0945l0 c0945l02 = null;
                while (c5602f0M10167w2 != null) {
                    if ((c5602f0M10167w2.f22778L.f22719f.f23791j & 2097152) != 0) {
                        while (abstractC5852n3 != null) {
                            if ((abstractC5852n3.f23790i & 2097152) != 0) {
                                AbstractC5852n abstractC5852nM10149e2 = abstractC5852n3;
                                C2046b c2046b2 = null;
                                while (abstractC5852nM10149e2 != null) {
                                    if (abstractC5852nM10149e2 instanceof InterfaceC3288c) {
                                        if (c0945l02 == null) {
                                            C0945l0 c0945l03 = AbstractC0959s0.f3019a;
                                            c0945l02 = new C0945l0();
                                        }
                                        c0945l02.m2328a(abstractC5852nM10149e2);
                                        z9 = false;
                                    } else {
                                        z9 = true;
                                    }
                                    if (z9 && (abstractC5852nM10149e2.f23790i & 2097152) != 0 && (abstractC5852nM10149e2 instanceof AbstractC5615j)) {
                                        int i10 = 0;
                                        for (AbstractC5852n abstractC5852n4 = ((AbstractC5615j) abstractC5852nM10149e2).f22875v; abstractC5852n4 != null; abstractC5852n4 = abstractC5852n4.f23793l) {
                                            if ((abstractC5852n4.f23790i & 2097152) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    abstractC5852nM10149e2 = abstractC5852n4;
                                                } else {
                                                    if (c2046b2 == null) {
                                                        c2046b2 = new C2046b(new AbstractC5852n[16]);
                                                    }
                                                    if (abstractC5852nM10149e2 != null) {
                                                        c2046b2.m5056b(abstractC5852nM10149e2);
                                                        abstractC5852nM10149e2 = null;
                                                    }
                                                    c2046b2.m5056b(abstractC5852n4);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    abstractC5852nM10149e2 = AbstractC5618k.m10149e(c2046b2);
                                }
                            }
                            abstractC5852n3 = abstractC5852n3.f23792k;
                        }
                    }
                    c5602f0M10167w2 = c5602f0M10167w2.m10049u();
                    abstractC5852n3 = (c5602f0M10167w2 == null || (c5587b1 = c5602f0M10167w2.f22778L) == null) ? null : c5587b1.f22718e;
                }
                c0945l0 = c0945l02;
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC3288c interfaceC3288c = (InterfaceC3288c) arrayList.get(i11);
                if (!(c0945l0 != null ? c0945l0.m2330c(interfaceC3288c) : false)) {
                    interfaceC3288c.mo5382y0();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View findViewByAccessibilityIdTraversal(int i9) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return m10638m(this, i9);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i9));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i9) {
        C0808c c0808cM1837a;
        if (view == null || this.f24109f0.f22994c) {
            return super.focusSearch(view, i9);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i9);
        if (viewFindNextFocus == null || !AbstractC5883g0.m10585a(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            C0653b0 c0653b0M1814f = AbstractC0656d.m1814f(((C0670p) getFocusOwner()).f2056c);
            c0808cM1837a = c0653b0M1814f != null ? AbstractC0656d.m1817i(c0653b0M1814f) : null;
            if (c0808cM1837a == null) {
                c0808cM1837a = AbstractC0662h.m1837a(view, this);
            }
        } else {
            c0808cM1837a = AbstractC0662h.m1837a(view, this);
        }
        C0660f c0660fM1840d = AbstractC0662h.m1840d(i9);
        int i10 = c0660fM1840d != null ? c0660fM1840d.f2040a : 6;
        C1425u c1425u = new C1425u();
        if (((C0670p) getFocusOwner()).m1847e(i10, c0808cM1837a, new C3653j(c1425u, 2)) == null) {
            return view;
        }
        Object obj = c1425u.f4738g;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i9);
            }
        } else if (viewFindNextFocus == null || i10 == 1 || i10 == 2 || AbstractC0656d.m1823o(AbstractC0656d.m1817i((C0653b0) obj), AbstractC0662h.m1837a(viewFindNextFocus, this), c0808cM1837a, i10)) {
            return this;
        }
        return viewFindNextFocus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C5927r0 getAndroidViewsHandler$ui() {
        if (this.f24106c0 == null) {
            C5927r0 c5927r0 = new C5927r0(getContext());
            this.f24106c0 = c5927r0;
            addView(c5927r0, -1);
            requestLayout();
        }
        C5927r0 c5927r02 = this.f24106c0;
        c5927r02.getClass();
        return c5927r02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC6067g getAutofill() {
        return this.f24098S;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC6069i getAutofillManager() {
        return this.f24100T;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6070j getAutofillTree() {
        return this.f24080J;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C5880f1 getComposeViewContext() {
        return get_composeViewContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.f24093P0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Configuration getConfiguration() {
        return (Configuration) this.f24094Q.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ViewOnAttachStateChangeListenerC0011i getContentCaptureManager$ui() {
        return this.f24074G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC5561g getCoroutineContext() {
        return this.f24136t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC4233c getDensity() {
        return (InterfaceC4233c) this.f24130q.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0808c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            C0653b0 c0653b0M1814f = AbstractC0656d.m1814f(((C0670p) getFocusOwner()).f2056c);
            if (c0653b0M1814f != null) {
                return AbstractC0656d.m1817i(c0653b0M1814f);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return AbstractC0662h.m1837a(viewFindFocus, this);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0666l getFocusOwner() {
        return this.f24134s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C0808c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f2416a);
            rect.top = Math.round(embeddedViewFocusRect.f2417b);
            rect.right = Math.round(embeddedViewFocusRect.f2418c);
            rect.bottom = Math.round(embeddedViewFocusRect.f2419d);
            return;
        }
        if (AbstractC1416l.m3825a(((C0670p) getFocusOwner()).m1847e(6, null, C5914o.f23998h), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC2760d getFontFamilyResolver() {
        return (InterfaceC2760d) this.f24143w0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC2759c getFontLoader() {
        return this.f24141v0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC5948w1 getFrameEndScheduler$ui() {
        return this.f24120l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC1037z getGraphicsContext() {
        return this.f24078I;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC2862a getHapticFeedBack() {
        return this.f24147y0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getHasPendingMeasureOrLayout() {
        return this.f24109f0.f22993b.m786C() || !this.f24126o.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC3040b getInputModeManager() {
        return this.f24149z0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final RunnableC4411n getInsetsListener() {
        return this.f24062A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f24121l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, android.view.ViewParent
    public EnumC4243m getLayoutDirection() {
        return (EnumC4243m) this.f24145x0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3290b getLocaleList() {
        return (C3290b) this.f24096R.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getMeasureIteration() {
        C5646t0 c5646t0 = this.f24109f0;
        if (!c5646t0.f22994c) {
            AbstractC4229a.m8493a("measureIteration should be only used during the measure/layout pass");
        }
        return c5646t0.f22998g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4677b getModifierLocalManager() {
        return this.f24063A0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: getOutOfFrameExecutor()Lx1/p1; */
    public ViewTreeObserverOnGlobalLayoutListenerC5934t getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4374a1 getPlacementScope() {
        int i9 = AbstractC4383d1.f14615b;
        return new C4403k0(this, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC3912r getPointerIconService() {
        return this.f24099S0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final C3286a m11088getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.f24116j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1293b getRectManager() {
        return this.f24068D;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC4080d getRetainedValuesStore() {
        return this.f24124n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5602f0 getRoot() {
        return this.f24064B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getScrollCaptureInProgress$ui() {
        C0119x c0119x;
        if (Build.VERSION.SDK_INT < 31 || (c0119x = this.f24095Q0) == null) {
            return false;
        }
        return ((Boolean) ((C1845j1) c0119x.f310h).getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1056s getSemanticsOwner() {
        return this.f24070E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5610h0 getSharedDrawScope() {
        return this.f24118k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? C5931s0.f24048a.m10631a(this) : this.f24105b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5647t1 getSnapshotObserver() {
        return this.f24104a0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC5885g2 getSoftwareKeyboardController() {
        C5892i1 c5892i1 = this.f24139u0;
        if (c5892i1 != null) {
            return c5892i1;
        }
        C5892i1 c5892i12 = new C5892i1(getTextInputService());
        this.f24139u0 = c5892i12;
        return c5892i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2885t getTextInputService() {
        C2885t c2885t = this.f24135s0;
        if (c2885t != null) {
            return c2885t;
        }
        C2885t c2885t2 = new C2885t(getLegacyTextInputServiceAndroid());
        this.f24135s0 = c2885t2;
        return c2885t2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC5889h2 getTextToolbar() {
        return this.f24065B0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC5659x1 getUncaughtExceptionHandler$ui() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC5905l2 getViewConfiguration() {
        return this.f24148z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC5902l getViewTreeOwners() {
        AbstractC4855en.m9270n(this.f24129p0.getValue());
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC5917o2 getWindowInfo() {
        return getComposeViewContext().f23875s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C6063c get_autofillManager$ui() {
        return this.f24100T;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final InterfaceC5638q1 m10658l(InterfaceC1235p interfaceC1235p, C5603f1 c5603f1, C1902b c1902b) {
        C2046b c2046b;
        Reference referencePoll;
        Object obj;
        if (c1902b != null) {
            return new C5916o1(c1902b, null, this, interfaceC1235p, c5603f1);
        }
        do {
            C3315t c3315t = this.f24071E0;
            ReferenceQueue referenceQueue = (ReferenceQueue) c3315t.f10678i;
            c2046b = (C2046b) c3315t.f10677h;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                c2046b.m5064j(referencePoll);
            }
        } while (referencePoll != null);
        while (true) {
            int i9 = c2046b.f6893i;
            if (i9 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) c2046b.m5065k(i9 - 1)).get();
            if (obj != null) {
                break;
            }
        }
        InterfaceC5638q1 interfaceC5638q1 = (InterfaceC5638q1) obj;
        if (interfaceC5638q1 == null) {
            return new C5916o1(getGraphicsContext().mo2557c(), getGraphicsContext(), this, interfaceC1235p, c5603f1);
        }
        C5916o1 c5916o1 = (C5916o1) interfaceC5638q1;
        InterfaceC1037z interfaceC1037z = c5916o1.f24007h;
        if (interfaceC1037z == null) {
            throw AbstractC4855en.m9257a("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!c5916o1.f24006g.f6358s) {
            AbstractC4229a.m8493a("layer should have been released before reuse");
        }
        c5916o1.f24006g = interfaceC1037z.mo2557c();
        c5916o1.f24012m = false;
        c5916o1.f24009j = interfaceC1235p;
        c5916o1.f24010k = c5603f1;
        c5916o1.f24022w = false;
        c5916o1.f24023x = false;
        c5916o1.f24024y = true;
        C1008i0.m2596d(c5916o1.f24013n);
        float[] fArr = c5916o1.f24014o;
        if (fArr != null) {
            C1008i0.m2596d(fArr);
        }
        c5916o1.f24020u = C1032u0.f3254b;
        c5916o1.f24025z = false;
        long j3 = Integer.MAX_VALUE;
        c5916o1.f24011l = (j3 & 4294967295L) | (j3 << 32);
        c5916o1.f24021v = null;
        c5916o1.f24019t = 0;
        return interfaceC5638q1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m10659n(C5602f0 c5602f0, boolean z9) {
        this.f24109f0.m10204g(c5602f0, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m10660o(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t;
        removeCallbacks(this.f24079I0);
        try {
            m10648G(motionEvent);
            this.f24123m0 = true;
            m10666x(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.f24067C0;
                boolean z9 = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                C0127f c0127f = this.f24092P;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!c0127f.f334a) {
                                C0952p c0952p = (C0952p) ((C2571a) c0127f.f337d).f8339h;
                                int i9 = c0952p.f3001j;
                                Object[] objArr = c0952p.f3000i;
                                for (int i10 = 0; i10 < i9; i10++) {
                                    objArr[i10] = null;
                                }
                                c0952p.f3001j = 0;
                                c0952p.f2998g = false;
                                ((C3889d) c0127f.f336c).m8077c();
                            }
                        } else if (motionEvent3.getActionMasked() != 10 && z9) {
                            m10653L(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        Trace.endSection();
                        throw th;
                    }
                }
                boolean z10 = motionEvent.getToolType(0) == 3;
                if (z9 || !z10 || actionMasked2 == 3 || actionMasked2 == 9 || !m10662t(motionEvent)) {
                    viewTreeObserverOnGlobalLayoutListenerC5934t = this;
                } else {
                    viewTreeObserverOnGlobalLayoutListenerC5934t = this;
                    viewTreeObserverOnGlobalLayoutListenerC5934t.m10653L(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = viewTreeObserverOnGlobalLayoutListenerC5934t.f24067C0;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = viewTreeObserverOnGlobalLayoutListenerC5934t.f24067C0;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    C3897h c3897h = viewTreeObserverOnGlobalLayoutListenerC5934t.f24090O;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            c3897h.f12774c.delete(pointerId);
                            c3897h.f12773b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = viewTreeObserverOnGlobalLayoutListenerC5934t.f24067C0;
                        float x4 = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = viewTreeObserverOnGlobalLayoutListenerC5934t.f24067C0;
                        boolean z11 = (x4 == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = viewTreeObserverOnGlobalLayoutListenerC5934t.f24067C0;
                        boolean z12 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z11 || z12) {
                            if (pointerId >= 0) {
                                c3897h.f12774c.delete(pointerId);
                                c3897h.f12773b.delete(pointerId);
                            }
                            C3889d c3889d = (C3889d) c0127f.f336c;
                            if (c3889d.f12757d) {
                                c3889d.f12757d = true;
                            } else {
                                c3889d.f12760g.f12795a.m5061g();
                            }
                        }
                    }
                }
                viewTreeObserverOnGlobalLayoutListenerC5934t.f24067C0 = MotionEvent.obtainNoHistory(motionEvent);
                int iM10652K = m10652K(motionEvent);
                Trace.endSection();
                viewTreeObserverOnGlobalLayoutListenerC5934t.f24123m0 = false;
                return iM10652K;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            this.f24123m0 = false;
            throw th4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC4080d interfaceC4080d;
        C0100e0 c0100e0;
        C5956y1 c5956y1;
        C5956y1 c5956y1M7918y;
        Object obj;
        super.onAttachedToWindow();
        setAttached(true);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 30) {
            setShowLayoutBounds(AbstractC5883g0.m10598n());
        }
        this.f24062A.onViewAttachedToWindow(this);
        int i10 = 0;
        if (i9 > 28) {
            if (f24060X0 == null) {
                RunnableC1436e runnableC1436e = new RunnableC1436e(8);
                f24060X0 = runnableC1436e;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (f24056T0 == null) {
                        f24056T0 = Class.forName("android.os.SystemProperties");
                    }
                    if (f24058V0 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = f24056T0;
                        f24058V0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = f24058V0;
                    if (method != null) {
                        method.invoke(null, runnableC1436e);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            C0933f0 c0933f0 = f24059W0;
            synchronized (c0933f0) {
                c0933f0.m2286a(this);
            }
        }
        if (!this.f24093P0) {
            getComposeViewContext().m10583c();
        }
        this.f24093P0 = false;
        m10661q(getRoot());
        m10639p(getRoot());
        getSnapshotObserver().f23001a.m9163d();
        C1671c c1671c = this.f24098S;
        if (c1671c != null) {
            C6068h c6068h = C6068h.f24548a;
            c6068h.getClass();
            ((AutofillManager) c1671c.f5522i).registerCallback(c6068h);
        }
        InterfaceC0112q interfaceC0112q = getComposeViewContext().f23859c;
        C0416a1 c0416a1 = getComposeViewContext().f23861e;
        InterfaceC5948w1 interfaceC5948w1 = this.f24120l;
        if (interfaceC0112q == null || c0416a1 == null || interfaceC5948w1 == null) {
            interfaceC4080d = null;
        } else {
            switch (c0416a1.f1193g) {
                case 0:
                    c0100e0 = c0416a1.f1196j;
                    break;
                case 1:
                    c0100e0 = c0416a1.f1196j;
                    break;
                case 2:
                    c0100e0 = c0416a1.f1196j;
                    break;
                case 3:
                    c0100e0 = c0416a1.f1196j;
                    break;
                case 4:
                    c0100e0 = c0416a1.f1196j;
                    break;
                default:
                    c0100e0 = c0416a1.f1196j;
                    break;
            }
            C3292a c3292a = C3292a.f10464b;
            c0100e0.getClass();
            c3292a.getClass();
            C2469w c2469w = new C2469w(18);
            C1410f c1410fM3834a = AbstractC1426v.m3834a(C5956y1.class);
            String strM3819b = c1410fM3834a.m3819b();
            if (strM3819b == null) {
                C2104o.m5294t("Local and anonymous classes can not be ViewModels");
                return;
            }
            String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM3819b);
            synchronized (c2469w) {
                try {
                    c5956y1 = (C5956y1) c0100e0.f284a.get(strConcat);
                    if (c1410fM3834a.m3821d(c5956y1)) {
                        c5956y1.getClass();
                    } else {
                        LinkedHashMap linkedHashMap = c3292a.f10465a;
                        linkedHashMap.getClass();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.putAll(linkedHashMap);
                        linkedHashMap2.put(AbstractC0098d0.f282a, strConcat);
                        try {
                            try {
                                Class clsMo3818a = c1410fM3834a.mo3818a();
                                clsMo3818a.getClass();
                                c5956y1M7918y = AbstractC3754e0.m7918y(clsMo3818a);
                            } catch (AbstractMethodError unused2) {
                                Class clsMo3818a2 = c1410fM3834a.mo3818a();
                                clsMo3818a2.getClass();
                                c5956y1M7918y = AbstractC3754e0.m7918y(clsMo3818a2);
                            }
                        } catch (AbstractMethodError unused3) {
                            Class clsMo3818a3 = c1410fM3834a.mo3818a();
                            clsMo3818a3.getClass();
                            c5956y1M7918y = AbstractC3754e0.m7918y(clsMo3818a3);
                        }
                        c5956y1 = c5956y1M7918y;
                        C5956y1 c5956y12 = (C5956y1) c0100e0.f284a.put(strConcat, c5956y1);
                        if (c5956y12 != null) {
                            c5956y12.m10674a();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Object parent = getParent();
            parent.getClass();
            int id2 = ((View) parent).getId();
            C0965w c0965w = c5956y1.f24193b;
            Object objM2313b = c0965w.m2313b(id2);
            if (objM2313b == null) {
                objM2313b = new C0933f0(1);
                c0965w.m2379h(id2, objM2313b);
            }
            C0933f0 c0933f02 = (C0933f0) objM2313b;
            Object[] objArr = c0933f02.f2923a;
            int i11 = c0933f02.f2924b;
            while (true) {
                if (i10 < i11) {
                    obj = objArr[i10];
                    if (((C5952x1) obj).f24183c) {
                        i10++;
                    }
                } else {
                    obj = null;
                }
            }
            C5952x1 c5952x1 = (C5952x1) obj;
            if (c5952x1 == null) {
                c5952x1 = new C5952x1();
                c0933f02.m2286a(c5952x1);
            }
            c5952x1.f24183c = true;
            this.f24122m = c5952x1;
            interfaceC4080d = c5952x1.f24182b;
        }
        if (interfaceC4080d == null) {
            interfaceC4080d = C4077a.f13515a;
        }
        this.f24124n = interfaceC4080d;
        InterfaceC1231l interfaceC1231l = this.f24131q0;
        if (interfaceC1231l != null) {
            interfaceC1231l.invoke(getComposeViewContext());
            this.f24131q0 = null;
        }
        C0114s c0114sMo550f = getComposeViewContext().f23859c.mo550f();
        c0114sMo550f.m552a(this);
        c0114sMo550f.m552a(this.f24074G);
        this.f24149z0.f9863a.setValue(new C3039a(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            C5871d0.f23841a.m10575b(this);
        }
        C6063c c6063c = this.f24100T;
        if (c6063c != null) {
            ((C0670p) getFocusOwner()).f2060g.m2286a(c6063c);
            getSemanticsOwner().f3358d.m2286a(c6063c);
        }
        ((C0670p) getFocusOwner()).f2060g.m2286a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        C5855q c5855q = (C5855q) this.f24137t0.get();
        C5899k0 c5899k0 = (C5899k0) (c5855q != null ? c5855q.f23803b : null);
        if (c5899k0 == null) {
            return getLegacyTextInputServiceAndroid().f9329d;
        }
        C5855q c5855q2 = (C5855q) c5899k0.f23970j.get();
        C5932s1 c5932s1 = (C5932s1) (c5855q2 != null ? c5855q2.f23803b : null);
        return c5932s1 != null && (c5932s1.f24053e ^ true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m10655N(configuration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i9;
        C5855q c5855q = (C5855q) this.f24137t0.get();
        C5899k0 c5899k0 = (C5899k0) (c5855q != null ? c5855q.f23803b : null);
        if (c5899k0 != null) {
            C5855q c5855q2 = (C5855q) c5899k0.f23970j.get();
            C5932s1 c5932s1 = (C5932s1) (c5855q2 != null ? c5855q2.f23803b : null);
            if (c5932s1 == null) {
                return null;
            }
            synchronized (c5932s1.f24051c) {
                if (c5932s1.f24053e) {
                    return null;
                }
                InputConnectionC0990v inputConnectionC0990vM2446a = c5932s1.f24049a.m2446a(editorInfo);
                C0166f c0166f = new C0166f(c5932s1, 27);
                InputConnection c2878m = Build.VERSION.SDK_INT >= 34 ? new C2878m(inputConnectionC0990vM2446a, c0166f) : new InputConnectionC2877l(inputConnectionC0990vM2446a, c0166f);
                c5932s1.f24052d.m5056b(new C5608g2(c2878m));
                return c2878m;
            }
        }
        C2887v legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
        if (!legacyTextInputServiceAndroid.f9329d) {
            return null;
        }
        C2875j c2875j = legacyTextInputServiceAndroid.f9333h;
        C2884s c2884s = legacyTextInputServiceAndroid.f9332g;
        int i10 = c2875j.f9297e;
        boolean z9 = c2875j.f9293a;
        int i11 = 4;
        if (i10 == 1) {
            i9 = z9 ? 6 : 0;
        } else if (i10 == 0) {
            i9 = 1;
        } else if (i10 == 2) {
            i9 = 2;
        } else if (i10 == 6) {
            i9 = 5;
        } else if (i10 == 5) {
            i9 = 7;
        } else if (i10 == 3) {
            i9 = 3;
        } else if (i10 == 4) {
            i9 = 4;
        } else {
            if (i10 != 7) {
                C2104o.m5276A("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i9;
        int i12 = c2875j.f9296d;
        if (i12 == 1) {
            editorInfo.inputType = 1;
        } else if (i12 == 2) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions = Integer.MIN_VALUE | i9;
        } else if (i12 == 3) {
            editorInfo.inputType = 2;
        } else if (i12 == 4) {
            editorInfo.inputType = 3;
        } else if (i12 == 5) {
            editorInfo.inputType = 17;
        } else if (i12 == 6) {
            editorInfo.inputType = 33;
        } else if (i12 == 7) {
            editorInfo.inputType = 129;
        } else if (i12 == 8) {
            editorInfo.inputType = 18;
        } else {
            if (i12 != 9) {
                C2104o.m5276A("Invalid Keyboard Type");
                return null;
            }
            editorInfo.inputType = 8194;
        }
        if (!z9) {
            int i13 = editorInfo.inputType;
            if ((i13 & 1) == 1) {
                editorInfo.inputType = i13 | Opcodes.ACC_DEPRECATED;
                if (i10 == 1) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        int i14 = editorInfo.inputType;
        if ((i14 & 1) == 1) {
            int i15 = c2875j.f9294b;
            if (i15 == 1) {
                editorInfo.inputType = i14 | 4096;
            } else if (i15 == 2) {
                editorInfo.inputType = i14 | 8192;
            } else if (i15 == 3) {
                editorInfo.inputType = i14 | 16384;
            }
            if (c2875j.f9295c) {
                editorInfo.inputType |= 32768;
            }
        }
        long j3 = c2884s.f9317b;
        int i16 = C1939m0.f6574c;
        editorInfo.initialSelStart = (int) (j3 >> 32);
        editorInfo.initialSelEnd = (int) (j3 & 4294967295L);
        AbstractC3754e0.m7898k0(editorInfo, c2884s.f9316a.f6529h);
        editorInfo.imeOptions |= 33554432;
        if (C2455i.m5847d()) {
            C2455i.m5846a().m5852g(editorInfo);
        }
        InputConnectionC2880o inputConnectionC2880o = new InputConnectionC2880o(legacyTextInputServiceAndroid.f9332g, new C2571a(legacyTextInputServiceAndroid, i11), legacyTextInputServiceAndroid.f9333h.f9295c);
        legacyTextInputServiceAndroid.f9334i.add(new WeakReference(inputConnectionC2880o));
        return inputConnectionC2880o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        C1054q c1054q;
        ViewOnAttachStateChangeListenerC0011i viewOnAttachStateChangeListenerC0011i = this.f24074G;
        viewOnAttachStateChangeListenerC0011i.getClass();
        for (long j3 : jArr) {
            C1055r c1055r = (C1055r) viewOnAttachStateChangeListenerC0011i.m157h().m2313b((int) j3);
            if (c1055r != null && (c1054q = c1055r.f3353a) != null) {
                AbstractC0005c.m136t();
                ViewTranslationRequest.Builder builderM132p = AbstractC0005c.m132p(viewOnAttachStateChangeListenerC0011i.f28g.getAutofillId(), c1054q.f3352f);
                Object objM2320g = c1054q.f3350d.f3341g.m2320g(AbstractC1058u.f3361B);
                if (objM2320g == null) {
                    objM2320g = null;
                }
                List list = (List) objM2320g;
                if (list != null) {
                    builderM132p.setValue("android:text", TranslationRequestValue.forText(new C1926g(AbstractC4679a.m9170a(list, "\n", null, 62))));
                    consumer.accept(builderM132p.build());
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.f24062A.onViewDetachedFromWindow(this);
        View view = this.f24132r;
        if (m10640r() && view != null) {
            removeView(view);
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 > 28) {
            C0933f0 c0933f0 = f24059W0;
            synchronized (c0933f0) {
                c0933f0.m2295j(this);
            }
        }
        getComposeViewContext().m10582b();
        C4668s c4668s = getSnapshotObserver().f23001a;
        C3465a c3465a = c4668s.f15543h;
        if (c3465a != null) {
            c3465a.m7269e();
        }
        c4668s.m9160a();
        C0114s c0114sMo550f = getComposeViewContext().f23859c.mo550f();
        c0114sMo550f.m557f(this.f24074G);
        c0114sMo550f.m557f(this);
        C1671c c1671c = this.f24098S;
        if (c1671c != null) {
            C6068h c6068h = C6068h.f24548a;
            c6068h.getClass();
            ((AutofillManager) c1671c.f5522i).unregisterCallback(c6068h);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        C5952x1 c5952x1 = this.f24122m;
        if (c5952x1 != null) {
            c5952x1.f24183c = false;
        }
        this.f24122m = null;
        if (i9 >= 31) {
            C5871d0.f23841a.m10574a(this);
        }
        C6063c c6063c = this.f24100T;
        if (c6063c != null) {
            getSemanticsOwner().f3358d.m2295j(c6063c);
            ((C0670p) getFocusOwner()).f2060g.m2295j(c6063c);
        }
        C1293b rectManager = getRectManager();
        rectManager.f4319f = rectManager.f4316c.m3443b(0L, 0L, null, 0, 0);
        getRectManager().m3434a();
        C1293b rectManager2 = getRectManager();
        RunnableC0133c runnableC0133c = rectManager2.f4321h;
        if (runnableC0133c != null) {
            rectManager2.f4314a.removeCallbacks(runnableC0133c);
            rectManager2.f4321h = null;
        }
        ((C0670p) getFocusOwner()).f2060g.m2295j(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onFocusChanged(boolean z9, int i9, Rect rect) {
        super.onFocusChanged(z9, i9, rect);
        if (z9 || hasFocus()) {
            return;
        }
        C0670p c0670p = (C0670p) getFocusOwner();
        AbstractC0656d.m1812d(c0670p.f2056c, true);
        if (c0670p.m1848f() != null) {
            C0653b0 c0653b0M1848f = c0670p.m1848f();
            c0670p.m1851i(null);
            if (c0653b0M1848f != null) {
                c0653b0M1848f.m1798l1(EnumC0680z.f2084g, EnumC0680z.f2086i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f24121l0 = 0L;
        m10656O();
        int i9 = Build.VERSION.SDK_INT;
        if (32 > i9 || i9 >= 34) {
            return;
        }
        m10655N(getResources().getConfiguration());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.f24121l0 = 0L;
            this.f24109f0.m10206l(this.f24087M0);
            this.f24107d0 = null;
            m10656O();
            if (this.f24106c0 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i11 - i9, i12 - i10);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        C5646t0 c5646t0 = this.f24109f0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m10661q(getRoot());
            }
            long jM10637k = m10637k(i9);
            long jM10637k2 = m10637k(i10);
            long jM2791t = AbstractC1089i.m2791t((int) (jM10637k >>> 32), (int) (jM10637k & 4294967295L), (int) (jM10637k2 >>> 32), (int) (4294967295L & jM10637k2));
            C4231a c4231a = this.f24107d0;
            if (c4231a == null) {
                this.f24107d0 = new C4231a(jM2791t);
                this.f24108e0 = false;
            } else if (!C4231a.m8498b(c4231a.f13903a, jM2791t)) {
                this.f24108e0 = true;
            }
            c5646t0.m10213s(jM2791t);
            c5646t0.m10208n();
            setMeasuredDimension(getRoot().f22779M.f22891p.f14593g, getRoot().f22779M.f22891p.f14594h);
            if (this.f24106c0 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f22779M.f22891p.f14593g, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f22779M.f22891p.f14594h, 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i9) {
        if (viewStructure != null) {
            C6063c c6063c = this.f24100T;
            if (c6063c != null) {
                C5602f0 c5602f0 = c6063c.f24537h.f3355a;
                AutofillId autofillId = c6063c.f24542m;
                String str = c6063c.f24540k;
                C1293b c1293b = c6063c.f24539j;
                AbstractC2043a.m5013S(viewStructure, c5602f0, autofillId, str, c1293b);
                Object[] objArr = AbstractC0953p0.f3002a;
                C0933f0 c0933f0 = new C0933f0(2);
                c0933f0.m2286a(c5602f0);
                c0933f0.m2286a(viewStructure);
                while (c0933f0.m2294i()) {
                    Object objM2296k = c0933f0.m2296k(c0933f0.f2924b - 1);
                    objM2296k.getClass();
                    ViewStructure viewStructure2 = (ViewStructure) objM2296k;
                    Object objM2296k2 = c0933f0.m2296k(c0933f0.f2924b - 1);
                    objM2296k2.getClass();
                    C0929d0 c0929d0 = (C0929d0) ((C5602f0) objM2296k2).m10042n();
                    int i10 = ((C2046b) c0929d0.f2909h).f6893i;
                    for (int i11 = 0; i11 < i10; i11++) {
                        C5602f0 c5602f02 = (C5602f0) c0929d0.get(i11);
                        if (!c5602f02.f22789W && c5602f02.m10010G() && c5602f02.m10011H()) {
                            C1050m c1050mM10051w = c5602f02.m10051w();
                            if (c1050mM10051w != null) {
                                C0943k0 c0943k0 = c1050mM10051w.f3341g;
                                if (c0943k0.m2315b(AbstractC1049l.f3321g) || c0943k0.m2315b(AbstractC1049l.f3322h) || c0943k0.m2315b(AbstractC1058u.f3392q) || c0943k0.m2315b(AbstractC1058u.f3393r)) {
                                    ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    AbstractC2043a.m5013S(viewStructureNewChild, c5602f02, autofillId, str, c1293b);
                                    c0933f0.m2286a(c5602f02);
                                    c0933f0.m2286a(viewStructureNewChild);
                                } else {
                                    c0933f0.m2286a(c5602f02);
                                    c0933f0.m2286a(viewStructure2);
                                }
                            }
                        }
                    }
                }
            }
            C1671c c1671c = this.f24098S;
            if (c1671c != null) {
                C6070j c6070j = (C6070j) c1671c.f5521h;
                LinkedHashMap linkedHashMap = c6070j.f24549a;
                LinkedHashMap linkedHashMap2 = c6070j.f24549a;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    if (entry.getValue() != null) {
                        C0086a.m445d();
                        return;
                    }
                    ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                    viewStructureNewChild2.setAutofillId((AutofillId) c1671c.f5523j, iIntValue);
                    viewStructureNewChild2.setId(iIntValue, ((ViewTreeObserverOnGlobalLayoutListenerC5934t) c1671c.f5520g).getContext().getPackageName(), null, null);
                    viewStructureNewChild2.setAutofillType(1);
                    throw null;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i9) {
        InterfaceC3911q interfaceC3911q;
        int toolType = motionEvent.getToolType(i9);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (interfaceC3911q = ((C5922q) getPointerIconService()).f24031a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i9);
        }
        Context context = getContext();
        return interfaceC3911q instanceof C3883a ? PointerIcon.getSystemIcon(context, ((C3883a) interfaceC3911q).f12740b) : PointerIcon.getSystemIcon(context, 1000);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i9) {
        if (this.f24114i) {
            int[] iArr = AbstractC0662h.f2041a;
            EnumC4243m enumC4243m = EnumC4243m.f13919g;
            EnumC4243m enumC4243m2 = i9 != 0 ? i9 != 1 ? null : EnumC4243m.f13920h : enumC4243m;
            if (enumC4243m2 != null) {
                enumC4243m = enumC4243m2;
            }
            setLayoutDirection(enumC4243m);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C0119x c0119x;
        if (Build.VERSION.SDK_INT >= 31 && (c0119x = this.f24095Q0) != null) {
            C1056s semanticsOwner = getSemanticsOwner();
            InterfaceC5561g coroutineContext = getCoroutineContext();
            C2046b c2046b = new C2046b(new C0819i[16]);
            AbstractC1184v0.m3189P(semanticsOwner.m2668a(), 0, new C0818h(1, 8, C2046b.class, c2046b, "add", "add(Ljava/lang/Object;)Z"));
            Arrays.sort(c2046b.f6891g, 0, c2046b.f6893i, new C0549b(new InterfaceC1231l[]{C0812b.f2437i, C0812b.f2438j}, 3));
            int i9 = c2046b.f6893i;
            C0819i c0819i = (C0819i) (i9 == 0 ? null : c2046b.f6891g[i9 - 1]);
            if (c0819i != null) {
                C4241k c4241k = c0819i.f2457c;
                ScrollCaptureCallbackC0813c scrollCaptureCallbackC0813c = new ScrollCaptureCallbackC0813c(c0819i.f2455a, c4241k, AbstractC3603v.m7547a(coroutineContext), c0119x, this);
                AbstractC5614i1 abstractC5614i1 = c0819i.f2458d;
                C0808c c0808cMo8866k0 = AbstractC4434w.m8884h(abstractC5614i1).mo8866k0(abstractC5614i1, true);
                long jM8533b = c4241k.m8533b();
                ScrollCaptureTarget scrollCaptureTargetM127k = AbstractC0005c.m127k(this, AbstractC0996c0.m2523t(AbstractC3165h.m6765Q(c0808cMo8866k0)), new Point((int) (jM8533b >> 32), (int) (jM8533b & 4294967295L)), scrollCaptureCallbackC0813c);
                scrollCaptureTargetM127k.setScrollBounds(AbstractC0996c0.m2523t(c4241k));
                consumer.accept(scrollCaptureTargetM127k);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m10656O();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z9) {
        this.f24149z0.f9863a.setValue(new C3039a(z9 ? 1 : 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC0011i viewOnAttachStateChangeListenerC0011i = this.f24074G;
        viewOnAttachStateChangeListenerC0011i.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (AbstractC1416l.m3825a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            AbstractC0018a.m252p(viewOnAttachStateChangeListenerC0011i, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC0011i.f28g.post(new RunnableC0006d(viewOnAttachStateChangeListenerC0011i, 0, longSparseArray));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z9) {
        boolean zM10598n;
        this.f24091O0 = true;
        super.onWindowFocusChanged(z9);
        if (!z9 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zM10598n = AbstractC5883g0.m10598n())) {
            return;
        }
        setShowLayoutBounds(zM10598n);
        m10639p(getRoot());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m10661q(C5602f0 c5602f0) {
        this.f24109f0.m10212r(c5602f0, false);
        C2046b c2046bM10053y = c5602f0.m10053y();
        Object[] objArr = c2046bM10053y.f6891g;
        int i9 = c2046bM10053y.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            m10661q((C5602f0) objArr[i10]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i9, Rect rect) {
        if (!isFocused()) {
            C0660f c0660fM1840d = AbstractC0662h.m1840d(i9);
            int i10 = c0660fM1840d != null ? c0660fM1840d.f2040a : 7;
            Boolean boolM1847e = ((C0670p) getFocusOwner()).m1847e(i10, rect != null ? new C0808c(rect.left, rect.top, rect.right, rect.bottom) : null, new C0669o(i10, 3));
            Boolean bool = Boolean.TRUE;
            if (!AbstractC1416l.m3825a(boolM1847e, bool)) {
                if (!AbstractC1416l.m3825a(((C0670p) getFocusOwner()).m1847e(i10, null, new C0669o(i10, 4)), bool)) {
                    if (!hasFocus()) {
                        return false;
                    }
                    if (i10 == 1 || i10 == 2) {
                        return ((C0670p) getFocusOwner()).m1850h(i10);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAccessibilityEventBatchIntervalMillis(long j3) {
        this.f24072F.f24219n = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setComposeViewContext(C5880f1 c5880f1) {
        if (getCoroutineContext() != c5880f1.f23858b.mo4470j() && !((C0929d0) getRoot().m10042n()).isEmpty()) {
            AbstractC4229a.m8493a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        AbstractC4655f abstractC4655fM9148e = AbstractC4666q.m9148e();
        InterfaceC1231l interfaceC1231lMo9095e = abstractC4655fM9148e != null ? abstractC4655fM9148e.mo9095e() : null;
        AbstractC4655f abstractC4655fM9151h = AbstractC4666q.m9151h(abstractC4655fM9148e);
        try {
            C5880f1 c5880f12 = get_composeViewContext();
            AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
            if (c5880f1.equals(c5880f12)) {
                return;
            }
            if (isAttachedToWindow()) {
                c5880f12.m10582b();
                c5880f1.m10583c();
            }
            set_composeViewContext(c5880f1);
            setCoroutineContext(c5880f1.f23858b.mo4470j());
        } catch (Throwable th2) {
            AbstractC4666q.m9154k(abstractC4655fM9148e, abstractC4655fM9151h, interfaceC1231lMo9095e);
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z9) {
        this.f24093P0 = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setConfiguration(Configuration configuration) {
        this.f24094Q.setValue(configuration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setContentCaptureManager$ui(ViewOnAttachStateChangeListenerC0011i viewOnAttachStateChangeListenerC0011i) {
        this.f24074G = viewOnAttachStateChangeListenerC0011i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCoroutineContext(InterfaceC5561g interfaceC5561g) {
        this.f24136t = interfaceC5561g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setFrameEndScheduler$ui(InterfaceC5948w1 interfaceC5948w1) {
        this.f24120l = interfaceC5948w1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setLastMatrixRecalculationAnimationTime$ui(long j3) {
        this.f24121l0 = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnReadyForComposition(InterfaceC1231l interfaceC1231l) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.f24093P0) {
            interfaceC1231l.invoke(getComposeViewContext());
        } else {
            this.f24131q0 = interfaceC1231l;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m11089setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(C3286a c3286a) {
        this.f24116j = c3286a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setShowLayoutBounds(boolean z9) {
        this.f24105b0 = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setUncaughtExceptionHandler(InterfaceC5659x1 interfaceC5659x1) {
        this.f24109f0.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final boolean m10662t(MotionEvent motionEvent) {
        float x4 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return 0.0f <= x4 && x4 <= ((float) getWidth()) && 0.0f <= y10 && y10 <= ((float) getHeight());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final boolean m10663u(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f24067C0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m10664v(float[] fArr) {
        m10647F();
        C1008i0.m2597e(fArr, this.f24117j0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f24125n0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f24125n0 & 4294967295L));
        float[] fArr2 = this.f24115i0;
        C1008i0.m2596d(fArr2);
        C1008i0.m2598f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        AbstractC5883g0.m10603s(fArr, fArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final long m10665w(long j3) {
        m10647F();
        long jM2594b = C1008i0.m2594b(j3, this.f24117j0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f24125n0 >> 32)) + Float.intBitsToFloat((int) (jM2594b >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f24125n0 & 4294967295L)) + Float.intBitsToFloat((int) (jM2594b & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m10666x(boolean z9) {
        C5910n c5910n;
        C5646t0 c5646t0 = this.f24109f0;
        if (c5646t0.f22993b.m786C() || ((C2046b) c5646t0.f22996e.f10677h).f6893i != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z9) {
                try {
                    c5910n = this.f24087M0;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } else {
                c5910n = null;
            }
            if (c5646t0.m10206l(c5910n)) {
                requestLayout();
            }
            c5646t0.m10201b(false);
            getRectManager().m3434a();
            if (this.f24088N) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f24088N = false;
            }
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m10667y(C5602f0 c5602f0, long j3) {
        C5646t0 c5646t0 = this.f24109f0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            c5646t0.m10207m(c5602f0, j3);
            if (!c5646t0.f22993b.m786C()) {
                c5646t0.m10201b(false);
                getRectManager().m3434a();
                if (this.f24088N) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f24088N = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final boolean m10668z(int i9) {
        if (i9 == 7 || i9 == 8) {
            return false;
        }
        Integer numM1839c = AbstractC0662h.m1839c(i9);
        if (numM1839c == null) {
            throw AbstractC4855en.m9257a("Invalid focus direction");
        }
        int iIntValue = numM1839c.intValue();
        C0653b0 c0653b0M1848f = ((C0670p) getFocusOwner()).m1848f();
        if (c0653b0M1848f == null) {
            C2104o.m5276A("findNextViewInEmbeddedView called when owner does not have anything focused.");
            return false;
        }
        Integer numM1839c2 = AbstractC0662h.m1839c(i9);
        if (numM1839c2 == null) {
            throw AbstractC4855en.m9257a("Invalid focus direction");
        }
        int iIntValue2 = numM1839c2.intValue();
        C5687v c5687v = AbstractC5618k.m10167w(c0653b0M1848f).f22804u;
        View interopView = c5687v != null ? c5687v.getInteropView() : null;
        View viewFindFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
        if (viewFindNextFocus == null || interopView == null || !AbstractC5883g0.m10585a(interopView, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (viewFindNextFocus != null) {
            return AbstractC0662h.m1838b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: getAccessibilityManager()Ly1/f; */
    public C5882g getAccessibilityManager() {
        return this.f24076H;
    }

    /* JADX DEBUG: Method merged with bridge method: getClipboard()Ly1/y0; */
    /* JADX INFO: renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public C5886h m11091getClipboard() {
        return this.f24103W;
    }

    /* JADX DEBUG: Method merged with bridge method: getClipboardManager()Ly1/z0; */
    /* JADX INFO: renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public C5890i m11092getClipboardManager() {
        return this.f24102V;
    }

    /* JADX DEBUG: Method merged with bridge method: getDragAndDropManager()Lb1/c; */
    /* JADX INFO: renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public ViewOnDragListenerC0162b m11093getDragAndDropManager() {
        return this.f24138u;
    }

    /* JADX DEBUG: Method merged with bridge method: getLayoutNodes()Lf/k; */
    public C0965w getLayoutNodes() {
        return this.f24066C;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, int i10) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i9;
        layoutParamsGenerateDefaultLayoutParams.height = i10;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i9, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @InterfaceC3954a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m11087getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @InterfaceC3954a
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public InterfaceC5662y1 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(InterfaceC5659x1 interfaceC5659x1) {
    }
}
