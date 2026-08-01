package p000;

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
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import org.luckypray.dexkit.C0587R;
import org.luckypray.dexkit.result.MethodData;

/* JADX INFO: renamed from: w3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0875w3 extends ViewGroup implements dn0, zv0, InterfaceC0177em, vm0, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, InterfaceC0865vu {

    /* JADX INFO: renamed from: K0 */
    public static Class f6906K0;

    /* JADX INFO: renamed from: L0 */
    public static Method f6907L0;

    /* JADX INFO: renamed from: M0 */
    public static final dh0 f6908M0 = new dh0();

    /* JADX INFO: renamed from: N0 */
    public static RunnableC0269h3 f6909N0;

    /* JADX INFO: renamed from: O0 */
    public static Method f6910O0;

    /* JADX INFO: renamed from: A */
    public final a01 f6911A;

    /* JADX INFO: renamed from: A0 */
    public final RunnableC0789u3 f6912A0;

    /* JADX INFO: renamed from: B */
    public final ViewOnAttachStateChangeListenerC0078c4 f6913B;

    /* JADX INFO: renamed from: B0 */
    public final RunnableC0232g3 f6914B0;

    /* JADX INFO: renamed from: C */
    public ViewOnAttachStateChangeListenerC0827v4 f6915C;

    /* JADX INFO: renamed from: C0 */
    public boolean f6916C0;

    /* JADX INFO: renamed from: D */
    public final C0874w2 f6917D;

    /* JADX INFO: renamed from: D0 */
    public final s10 f6918D0;

    /* JADX INFO: renamed from: E */
    public final C0714s5 f6919E;

    /* JADX INFO: renamed from: E0 */
    public final C0750t3 f6920E0;

    /* JADX INFO: renamed from: F */
    public final C0423l9 f6921F;

    /* JADX INFO: renamed from: F0 */
    public final C0546oc f6922F0;

    /* JADX INFO: renamed from: G */
    public final dh0 f6923G;

    /* JADX INFO: renamed from: G0 */
    public boolean f6924G0;

    /* JADX INFO: renamed from: H */
    public dh0 f6925H;

    /* JADX INFO: renamed from: H0 */
    public final i90 f6926H0;

    /* JADX INFO: renamed from: I */
    public boolean f6927I;

    /* JADX INFO: renamed from: I0 */
    public View f6928I0;

    /* JADX INFO: renamed from: J */
    public final ag0 f6929J;

    /* JADX INFO: renamed from: J0 */
    public final C0675r3 f6930J0;

    /* JADX INFO: renamed from: K */
    public final C0206fe f6931K;

    /* JADX INFO: renamed from: L */
    public final gp0 f6932L;

    /* JADX INFO: renamed from: M */
    public final C0948y2 f6933M;

    /* JADX INFO: renamed from: N */
    public final C0004a3 f6934N;

    /* JADX INFO: renamed from: O */
    public boolean f6935O;

    /* JADX INFO: renamed from: P */
    public final C0158e3 f6936P;

    /* JADX INFO: renamed from: Q */
    public final C0115d3 f6937Q;

    /* JADX INFO: renamed from: R */
    public final fn0 f6938R;

    /* JADX INFO: renamed from: S */
    public C0878w6 f6939S;

    /* JADX INFO: renamed from: T */
    public C0617pj f6940T;

    /* JADX INFO: renamed from: U */
    public boolean f6941U;

    /* JADX INFO: renamed from: V */
    public final ud0 f6942V;

    /* JADX INFO: renamed from: W */
    public long f6943W;

    /* JADX INFO: renamed from: a0 */
    public final int[] f6944a0;

    /* JADX INFO: renamed from: b0 */
    public final float[] f6945b0;

    /* JADX INFO: renamed from: c0 */
    public final float[] f6946c0;

    /* JADX INFO: renamed from: d */
    public long f6947d;

    /* JADX INFO: renamed from: d0 */
    public long f6948d0;

    /* JADX INFO: renamed from: e */
    public final boolean f6949e;

    /* JADX INFO: renamed from: e0 */
    public boolean f6950e0;

    /* JADX INFO: renamed from: f */
    public g10 f6951f;

    /* JADX INFO: renamed from: f0 */
    public long f6952f0;

    /* JADX INFO: renamed from: g */
    public final d60 f6953g;

    /* JADX INFO: renamed from: g0 */
    public final gp0 f6954g0;

    /* JADX INFO: renamed from: h */
    public aa0 f6955h;

    /* JADX INFO: renamed from: h0 */
    public final C0135dn f6956h0;

    /* JADX INFO: renamed from: i */
    public ba0 f6957i;

    /* JADX INFO: renamed from: i0 */
    public InterfaceC0742sw f6958i0;

    /* JADX INFO: renamed from: j */
    public fv0 f6959j;

    /* JADX INFO: renamed from: j0 */
    public final e20 f6960j0;

    /* JADX INFO: renamed from: k */
    public final C0917x8 f6961k;

    /* JADX INFO: renamed from: k0 */
    public final a71 f6962k0;

    /* JADX INFO: renamed from: l */
    public final RunnableC0232g3 f6963l;

    /* JADX INFO: renamed from: l0 */
    public final AtomicReference f6964l0;

    /* JADX INFO: renamed from: m */
    public final gp0 f6965m;

    /* JADX INFO: renamed from: m0 */
    public final C0675r3 f6966m0;

    /* JADX INFO: renamed from: n */
    public final View f6967n;

    /* JADX INFO: renamed from: n0 */
    public final C0675r3 f6968n0;

    /* JADX INFO: renamed from: o */
    public final boolean f6969o;

    /* JADX INFO: renamed from: o0 */
    public final gp0 f6970o0;

    /* JADX INFO: renamed from: p */
    public final C1017zu f6971p;

    /* JADX INFO: renamed from: p0 */
    public final gp0 f6972p0;

    /* JADX INFO: renamed from: q */
    public InterfaceC0618pk f6973q;

    /* JADX INFO: renamed from: q0 */
    public final C0967yl f6974q0;

    /* JADX INFO: renamed from: r */
    public final ViewOnDragListenerC0197f5 f6975r;

    /* JADX INFO: renamed from: r0 */
    public final h20 f6976r0;

    /* JADX INFO: renamed from: s */
    public final i90 f6977s;

    /* JADX INFO: renamed from: s0 */
    public final qe0 f6978s0;

    /* JADX INFO: renamed from: t */
    public final C0910x1 f6979t;

    /* JADX INFO: renamed from: t0 */
    public final C0675r3 f6980t0;

    /* JADX INFO: renamed from: u */
    public final C0792u6 f6981u;

    /* JADX INFO: renamed from: u0 */
    public MotionEvent f6982u0;

    /* JADX INFO: renamed from: v */
    public final l20 f6983v;

    /* JADX INFO: renamed from: v0 */
    public long f6984v0;

    /* JADX INFO: renamed from: w */
    public final b60 f6985w;

    /* JADX INFO: renamed from: w0 */
    public final C0111d f6986w0;

    /* JADX INFO: renamed from: x */
    public final ug0 f6987x;

    /* JADX INFO: renamed from: x0 */
    public final dh0 f6988x0;

    /* JADX INFO: renamed from: y */
    public final ut0 f6989y;

    /* JADX INFO: renamed from: y0 */
    public float f6990y0;

    /* JADX INFO: renamed from: z */
    public final ViewTreeObserverOnGlobalLayoutListenerC0875w3 f6991z;

    /* JADX INFO: renamed from: z0 */
    public float f6992z0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewTreeObserverOnGlobalLayoutListenerC0875w3(Context context, InterfaceC0618pk interfaceC0618pk) {
        super(context);
        this.f6947d = 9205357640488583168L;
        int i = 1;
        this.f6949e = true;
        this.f6953g = new d60();
        this.f6959j = C0496n2.f4127G;
        this.f6961k = new C0917x8();
        int i2 = 0;
        this.f6963l = new RunnableC0232g3(this, i2);
        C0024an c0024anM3046b = pf1.m3046b(context);
        C0496n2 c0496n2 = C0496n2.f4138R;
        this.f6965m = new gp0(c0024anM3046b, c0496n2);
        int i3 = Build.VERSION.SDK_INT;
        boolean z = i3 >= 35;
        this.f6969o = z;
        C0366js c0366js = new C0366js();
        this.f6971p = new C1017zu(this, this);
        this.f6973q = interfaceC0618pk;
        this.f6975r = new ViewOnDragListenerC0197f5();
        this.f6977s = new i90(0);
        this.f6979t = new C0910x1(3);
        this.f6981u = new C0792u6(ViewConfiguration.get(context));
        this.f6983v = new l20();
        b60 b60Var = new b60(3);
        b60Var.m296e0(aw0.f282c);
        b60Var.m290b0(getDensity());
        b60Var.m300g0(getViewConfiguration());
        b60Var.m298f0(new C0826v3(this).mo2499c(((C1017zu) getFocusOwner()).f8000e).mo2499c(m5745getDragAndDropManager().f1581c));
        this.f6985w = b60Var;
        ug0 ug0Var = v20.f6389a;
        this.f6987x = new ug0();
        getLayoutNodes();
        this.f6989y = new ut0();
        this.f6991z = this;
        this.f6911A = new a01(getRoot(), c0366js, getLayoutNodes());
        ViewOnAttachStateChangeListenerC0078c4 viewOnAttachStateChangeListenerC0078c4 = new ViewOnAttachStateChangeListenerC0078c4(this);
        this.f6913B = viewOnAttachStateChangeListenerC0078c4;
        this.f6915C = new ViewOnAttachStateChangeListenerC0827v4(this, new C0417l3(0, this, AbstractC0307i4.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0));
        C0874w2 c0874w2 = new C0874w2();
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.f6917D = c0874w2;
        this.f6919E = new C0714s5(this);
        this.f6921F = new C0423l9();
        this.f6923G = new dh0();
        this.f6929J = new ag0();
        b60 root = getRoot();
        C0206fe c0206fe = new C0206fe();
        c0206fe.f1697b = root;
        c0206fe.f1698c = new C0491my(root.f395I.f3995c);
        c0206fe.f1699d = new C0910x1(19);
        c0206fe.f1700e = new C0632py();
        this.f6931K = c0206fe;
        this.f6932L = r60.m3419u(new Configuration(context.getResources().getConfiguration()));
        C0423l9 autofillTree = getAutofillTree();
        C0948y2 c0948y2 = new C0948y2();
        c0948y2.f7491d = this;
        c0948y2.f7492e = autofillTree;
        AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            C0921xc.m5134o("Autofill service could not be located.");
            throw null;
        }
        c0948y2.f7493f = autofillManager;
        setImportantForAutofill(1);
        AutofillId autofillId = getAutofillId();
        if (autofillId == null) {
            throw AbstractC0748t1.m4149g("Required value was null.");
        }
        c0948y2.f7494g = autofillId;
        this.f6933M = c0948y2;
        AutofillManager autofillManager2 = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager2 == null) {
            throw AbstractC0748t1.m4149g("Autofill service could not be located.");
        }
        this.f6934N = new C0004a3(new C0910x1(17, autofillManager2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.f6936P = new C0158e3(context);
        m5744getClipboardManager();
        this.f6937Q = new C0115d3();
        this.f6938R = new fn0(new C0638q3(this, i));
        this.f6942V = new ud0(getRoot());
        this.f6943W = 9223372034707292159L;
        this.f6944a0 = new int[]{0, 0};
        this.f6945b0 = r60.m3406h();
        this.f6946c0 = r60.m3406h();
        this.f6948d0 = -1L;
        this.f6952f0 = 9187343241974906880L;
        this.f6954g0 = r60.m3419u(null);
        this.f6956h0 = r60.m3411m(new C0750t3(this, i));
        this.f6960j0 = new e20(getView(), this);
        a71 a71Var = new a71();
        new AtomicReference(null);
        this.f6962k0 = a71Var;
        this.f6964l0 = new AtomicReference(null);
        getTextInputService();
        this.f6966m0 = new C0675r3(15);
        this.f6968n0 = new C0675r3(2);
        this.f6970o0 = new gp0(AbstractC0398kl.m1924j(context), c0496n2);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = AbstractC0779tu.f6044a;
        k50 k50Var = k50.f3015d;
        k50 k50Var2 = layoutDirection != 0 ? layoutDirection != 1 ? null : k50.f3016e : k50Var;
        this.f6972p0 = r60.m3419u(k50Var2 != null ? k50Var2 : k50Var);
        this.f6974q0 = new C0967yl(this, 1);
        this.f6976r0 = new h20(isInTouchMode() ? 1 : 2);
        qe0 qe0Var = new qe0();
        new sh0(new C0795u9[16]);
        new sh0(new u50[16]);
        new sh0(new b60[16]);
        new sh0(new u50[16]);
        this.f6978s0 = qe0Var;
        this.f6980t0 = new C0675r3(3);
        this.f6986w0 = new C0111d(22);
        this.f6988x0 = new dh0();
        this.f6912A0 = new RunnableC0789u3(this);
        this.f6914B0 = new RunnableC0232g3(this, i);
        this.f6918D0 = new s10(context, new C0638q3(this, i2));
        this.f6920E0 = new C0750t3(this, i2);
        this.f6922F0 = new C0546oc();
        addOnAttachStateChangeListener(this.f6915C);
        setWillNotDraw(false);
        setFocusable(true);
        C0270h4.f2137a.m1274a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        int i4 = kc1.f3078a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        setAccessibilityDelegate(viewOnAttachStateChangeListenerC0078c4.f5262e);
        setOnDragListener(m5745getDragAndDropManager());
        getRoot().m293d(this);
        C0116d4.f967a.m633a(this);
        if (z) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(C0587R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.f6967n = view;
            addView(view, -1);
        }
        this.f6926H0 = i3 >= 31 ? new i90(1) : null;
        this.f6930J0 = new C0675r3(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final C0378k3 get_viewTreeOwners() {
        return (C0378k3) this.f6954g0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m4840i(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0875w3) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) childAt).m4861u();
            } else if (childAt instanceof ViewGroup) {
                m4840i((ViewGroup) childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static long m4841j(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static void m4842m(b60 b60Var) {
        b60Var.m268D();
        sh0 sh0VarM319z = b60Var.m319z();
        Object[] objArr = sh0VarM319z.f5768d;
        int i = sh0VarM319z.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            m4842m((b60) objArr[i2]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static boolean m4843o(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || !bg0.f510a.m354a(motionEvent, i);
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setDensity(InterfaceC0968ym interfaceC0968ym) {
        this.f6965m.setValue(interfaceC0968ym);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setFontFamilyResolver(InterfaceC0369jv interfaceC0369jv) {
        this.f6970o0.setValue(interfaceC0369jv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setLayoutDirection(k50 k50Var) {
        this.f6972p0.setValue(k50Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void set_viewTreeOwners(C0378k3 c0378k3) {
        this.f6954g0.setValue(c0378k3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final void m4844A(MotionEvent motionEvent) {
        this.f6948d0 = AnimationUtils.currentAnimationTimeMillis();
        C0546oc c0546oc = this.f6922F0;
        float[] fArr = this.f6945b0;
        c0546oc.m2873a(this, fArr);
        s91.m4017B(fArr, this.f6946c0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jM3417s = r60.m3417s(fArr, (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jM3417s >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jM3417s & 4294967295L));
        this.f6952f0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final boolean m4845B() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final void m4846C(b60 b60Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (b60Var != null) {
            while (b60Var != null && b60Var.m312s() == z50.f7800d) {
                if (!this.f6941U) {
                    b60 b60VarM315v = b60Var.m315v();
                    if (b60VarM315v == null) {
                        break;
                    }
                    long j = b60VarM315v.f395I.f3995c.f7403g;
                    if (C0617pj.m3135f(j) && C0617pj.m3134e(j)) {
                        break;
                    }
                }
                b60Var = b60Var.m315v();
            }
            if (b60Var == getRoot()) {
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
    /* JADX INFO: renamed from: D */
    public final long m4847D(long j) {
        m4866z();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f6952f0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f6952f0 & 4294967295L));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        return r60.m3417s(this.f6946c0, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (jFloatToRawIntBits << 32));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public final int m4848E(MotionEvent motionEvent) {
        Object obj;
        if (this.f6924G0) {
            this.f6924G0 = false;
            int metaState = motionEvent.getMetaState();
            this.f6977s.getClass();
            ed1.f1424a.setValue(new sr0(metaState));
        }
        ag0 ag0Var = this.f6929J;
        C0111d c0111dM170c = ag0Var.m170c(this, motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        C0206fe c0206fe = this.f6931K;
        if (c0111dM170c == null) {
            if (!c0206fe.f1696a) {
                ub0 ub0Var = (ub0) ((C0910x1) c0206fe.f1699d).f7232e;
                int i = ub0Var.f6188g;
                Object[] objArr = ub0Var.f6187f;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                ub0Var.f6188g = 0;
                ub0Var.f6185d = false;
                ((C0491my) c0206fe.f1698c).m2609c();
            }
            return 0;
        }
        List list = (List) c0111dM170c.f919e;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i3 = size - 1;
                obj = list.get(size);
                if (((pr0) obj).f4952e && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i3 < 0) {
                    break;
                }
                size = i3;
            }
            obj = null;
        } else {
            obj = null;
        }
        pr0 pr0Var = (pr0) obj;
        if (pr0Var != null) {
            this.f6947d = pr0Var.f4951d;
        }
        int iM1090a = c0206fe.m1090a(c0111dM170c, this, m4856p(motionEvent));
        c0111dM170c.f920f = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iM1090a & 1) != 0) {
            return iM1090a;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        ag0Var.f159c.delete(pointerId);
        ag0Var.f158b.delete(pointerId);
        return iM1090a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final void m4849F(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jM4858r = m4858r((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jM4858r >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jM4858r & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C0111d c0111dM170c = this.f6929J.m170c(this, motionEventObtain);
        c0111dM170c.getClass();
        this.f6931K.m1090a(c0111dM170c, this, true);
        motionEventObtain.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final void m4850G(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (p30.m3002l(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(pf1.m3046b(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) != 0) {
            this.f6977s.getClass();
        }
        int i = Build.VERSION.SDK_INT;
        if ((i >= 31 ? configuration2.fontWeightAdjustment : 0) != (i >= 31 ? configuration.fontWeightAdjustment : 0)) {
            setFontFamilyResolver(AbstractC0398kl.m1924j(getContext()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4851H() {
        boolean z;
        int i;
        boolean z2;
        int[] iArr = this.f6944a0;
        getLocationOnScreen(iArr);
        long j = this.f6943W;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 != i4 || i3 != iArr[1] || this.f6948d0 < 0) {
            this.f6943W = (((long) i4) << 32) | (((long) iArr[1]) & 4294967295L);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                getRoot().f396J.f1607p.m5006e0();
                z = true;
            }
        }
        m4866z();
        View rootView = this.f6928I0;
        if (rootView == null) {
            rootView = getRootView();
            this.f6928I0 = rootView;
        }
        ut0 rectManager = getRectManager();
        long j2 = this.f6943W;
        long jM1518D = AbstractC0307i4.m1518D(this.f6952f0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.f6945b0;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
        }
        e81 e81Var = rectManager.f6298b;
        if ((i & 2) != 0) {
            fArr = null;
        }
        if (w20.m4833a(jM1518D, e81Var.f1346d)) {
            z2 = false;
        } else {
            e81Var.f1346d = jM1518D;
            z2 = true;
        }
        if (!w20.m4833a(j2, e81Var.f1347e)) {
            e81Var.f1347e = j2;
            z2 = true;
        }
        if (fArr != null) {
            e81Var.f1349g = fArr;
            z2 = true;
        }
        long j3 = (((long) width) << 32) | (((long) height) & 4294967295L);
        if (j3 != e81Var.f1348f) {
            e81Var.f1348f = j3;
            z2 = true;
        }
        rectManager.f6301e = z2 || rectManager.f6301e;
        this.f6942V.m4303a(z);
        getRectManager().m4348a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public final void m4852I(float f) {
        if (this.f6969o) {
            if (f > 0.0f) {
                if (Float.isNaN(this.f6990y0) || f > this.f6990y0) {
                    this.f6990y0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.f6992z0) || f < this.f6992z0) {
                    this.f6992z0 = f;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0177em
    /* JADX INFO: renamed from: a */
    public final void mo938a(x90 x90Var) {
        ba0 ba0Var = this.f6957i;
        if (ba0Var != null) {
            bd0 bd0Var = (bd0) ba0Var.f478a.f7232e;
            if (bd0Var.f495d && !bd0Var.f497f) {
                InterfaceC0958yc interfaceC0958yc = ba0Var.f481d;
                if (interfaceC0958yc != null) {
                    interfaceC0958yc.cancel();
                }
                ba0Var.f481d = null;
                return;
            }
            if (bd0Var.f496e) {
                return;
            }
            if (!bd0Var.f497f) {
                xr0.m5148a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!bd0Var.f498g.m1703i()) {
                xr0.m5148a("Attempted to start retaining exited values with pending exited values");
            }
            bd0Var.f497f = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C0149dv c0149dv = ((C1017zu) getFocusOwner()).f7998c;
        if (!c0149dv.f4542q) {
            return;
        }
        if (!c0149dv.f4529d.f4542q) {
            w10.m4824b("visitSubtreeIf called on an unattached node");
        }
        sh0 sh0Var = new sh0(new oe0[16]);
        oe0 oe0Var = c0149dv.f4529d;
        oe0 oe0Var2 = oe0Var.f4534i;
        if (oe0Var2 == null) {
            pf1.m3049e(sh0Var, oe0Var);
        } else {
            sh0Var.m4072b(oe0Var2);
        }
        while (true) {
            int i3 = sh0Var.f5770f;
            if (i3 == 0) {
                return;
            }
            oe0 oe0Var3 = (oe0) sh0Var.m4081k(i3 - 1);
            if ((oe0Var3.f4532g & 1024) != 0) {
                for (oe0 oe0Var4 = oe0Var3; oe0Var4 != null && oe0Var4.f4542q; oe0Var4 = oe0Var4.f4534i) {
                    if ((oe0Var4.f4531f & 1024) != 0) {
                        oe0 oe0VarM3050f = oe0Var4;
                        sh0 sh0Var2 = null;
                        while (oe0VarM3050f != null) {
                            int i4 = 0;
                            if (oe0VarM3050f instanceof C0149dv) {
                                C0149dv c0149dv2 = (C0149dv) oe0VarM3050f;
                                if (c0149dv2.f4542q && c0149dv2.m733y0().f268a) {
                                    super.addFocusables(arrayList, i, i2);
                                    C0149dv c0149dv3 = ((C1017zu) getFocusOwner()).f7998c;
                                    if (c0149dv3.f4542q) {
                                        if (!c0149dv3.f4529d.f4542q) {
                                            w10.m4824b("visitSubtreeIf called on an unattached node");
                                        }
                                        sh0 sh0Var3 = new sh0(new oe0[16]);
                                        oe0 oe0Var5 = c0149dv3.f4529d;
                                        oe0 oe0Var6 = oe0Var5.f4534i;
                                        if (oe0Var6 == null) {
                                            pf1.m3049e(sh0Var3, oe0Var5);
                                        } else {
                                            sh0Var3.m4072b(oe0Var6);
                                        }
                                        while (true) {
                                            int i5 = sh0Var3.f5770f;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            oe0 oe0Var7 = (oe0) sh0Var3.m4081k(i5 - 1);
                                            if ((oe0Var7.f4532g & 1024) != 0) {
                                                for (oe0 oe0Var8 = oe0Var7; oe0Var8 != null && oe0Var8.f4542q; oe0Var8 = oe0Var8.f4534i) {
                                                    if ((oe0Var8.f4531f & 1024) != 0) {
                                                        oe0 oe0VarM3050f2 = oe0Var8;
                                                        sh0 sh0Var4 = null;
                                                        while (oe0VarM3050f2 != null) {
                                                            if (oe0VarM3050f2 instanceof C0149dv) {
                                                                C0149dv c0149dv4 = (C0149dv) oe0VarM3050f2;
                                                                if (c0149dv4.f4542q) {
                                                                    C0032av c0032avM733y0 = c0149dv4.m733y0();
                                                                    if (c0149dv4.f4542q && c0032avM733y0.f268a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((oe0VarM3050f2.f4531f & 1024) != 0 && (oe0VarM3050f2 instanceof AbstractC0731sm)) {
                                                                int i6 = 0;
                                                                for (oe0 oe0Var9 = ((AbstractC0731sm) oe0VarM3050f2).f5782s; oe0Var9 != null; oe0Var9 = oe0Var9.f4534i) {
                                                                    if ((oe0Var9.f4531f & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            oe0VarM3050f2 = oe0Var9;
                                                                        } else {
                                                                            if (sh0Var4 == null) {
                                                                                sh0Var4 = new sh0(new oe0[16]);
                                                                            }
                                                                            if (oe0VarM3050f2 != null) {
                                                                                sh0Var4.m4072b(oe0VarM3050f2);
                                                                                oe0VarM3050f2 = null;
                                                                            }
                                                                            sh0Var4.m4072b(oe0Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            oe0VarM3050f2 = pf1.m3050f(sh0Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            pf1.m3049e(sh0Var3, oe0Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((oe0VarM3050f.f4531f & 1024) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                for (oe0 oe0Var10 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var10 != null; oe0Var10 = oe0Var10.f4534i) {
                                    if ((oe0Var10.f4531f & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            oe0VarM3050f = oe0Var10;
                                        } else {
                                            if (sh0Var2 == null) {
                                                sh0Var2 = new sh0(new oe0[16]);
                                            }
                                            if (oe0VarM3050f != null) {
                                                sh0Var2.m4072b(oe0VarM3050f);
                                                oe0VarM3050f = null;
                                            }
                                            sh0Var2.m4072b(oe0Var10);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            oe0VarM3050f = pf1.m3050f(sh0Var2);
                        }
                    }
                }
            }
            pf1.m3049e(sh0Var, oe0Var3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        sz0 sz0VarM317x;
        InterfaceC0742sw interfaceC0742sw;
        InterfaceC0742sw interfaceC0742sw2;
        C0004a3 c0004a3 = this.f6934N;
        if (c0004a3 != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                b60 b60Var = (b60) c0004a3.f31e.f4c.m4248b(iKeyAt);
                if (b60Var != null && (sz0VarM317x = b60Var.m317x()) != null) {
                    jh0 jh0Var = sz0VarM317x.f5877d;
                    Object objM1701g = jh0Var.m1701g(rz0.f5594g);
                    if (objM1701g == null) {
                        objM1701g = null;
                    }
                    C0533o0 c0533o0 = (C0533o0) objM1701g;
                    if (c0533o0 != null && (interfaceC0742sw2 = (InterfaceC0742sw) c0533o0.f4378b) != null) {
                    }
                    Object objM1701g2 = jh0Var.m1701g(rz0.f5595h);
                    C0533o0 c0533o02 = (C0533o0) (objM1701g2 != null ? objM1701g2 : null);
                    if (c0533o02 != null && (interfaceC0742sw = (InterfaceC0742sw) c0533o02.f4378b) != null) {
                    }
                }
            }
        }
        C0948y2 c0948y2 = this.f6933M;
        if (c0948y2 != null) {
            C0423l9 c0423l9 = (C0423l9) c0948y2.f7492e;
            if (c0423l9.f3391a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (c0423l9.f3391a.get(Integer.valueOf(iKeyAt2)) != null) {
                        C0921xc.m5123d();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new C0096cl("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new C0096cl("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new C0096cl("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0177em
    /* JADX INFO: renamed from: c */
    public final void mo940c(x90 x90Var) {
        InterfaceC0958yc interfaceC0958ycMo2726s;
        ba0 ba0Var = this.f6957i;
        if (ba0Var != null) {
            aa0 aa0Var = this.f6955h;
            aa0Var.getClass();
            C0910x1 c0910x1 = ba0Var.f478a;
            bd0 bd0Var = (bd0) c0910x1.f7232e;
            if (!bd0Var.f495d || bd0Var.f497f) {
                return;
            }
            try {
                interfaceC0958ycMo2726s = ((xe1) aa0Var).f7340a.mo2726s(new C0310i7(5, ba0Var));
            } catch (CancellationException unused) {
                bd0 bd0Var2 = (bd0) c0910x1.f7232e;
                if (!bd0Var2.f496e) {
                    if (bd0Var2.f497f) {
                        xr0.m5148a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    bd0Var2.m349a();
                    bd0Var2.f497f = true;
                }
                interfaceC0958ycMo2726s = null;
            }
            InterfaceC0958yc interfaceC0958yc = ba0Var.f481d;
            if (interfaceC0958yc != null) {
                interfaceC0958yc.cancel();
            }
            ba0Var.f481d = interfaceC0958ycMo2726s;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f6913B.m461e(false, i, this.f6947d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f6913B.m461e(true, i, this.f6947d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0865vu
    /* JADX INFO: renamed from: d */
    public final void mo14d(C0149dv c0149dv, C0149dv c0149dv2) {
        mj0 mj0Var;
        mj0 mj0Var2;
        if (c0149dv != null) {
            C0149dv c0149dv3 = c0149dv;
            if (!c0149dv3.f4529d.f4542q) {
                w10.m4824b("visitAncestors called on an unattached node");
            }
            oe0 oe0Var = c0149dv3.f4529d;
            b60 b60VarM3039Q = pf1.m3039Q(c0149dv);
            LinkedHashSet linkedHashSet = null;
            ArrayList arrayList = null;
            while (b60VarM3039Q != null) {
                if ((b60VarM3039Q.f395I.f3998f.f4532g & 2097152) != 0) {
                    while (oe0Var != null) {
                        if ((oe0Var.f4531f & 2097152) != 0) {
                            oe0 oe0VarM3050f = oe0Var;
                            sh0 sh0Var = null;
                            while (oe0VarM3050f != null) {
                                if (oe0VarM3050f instanceof q10) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(oe0VarM3050f);
                                } else if ((oe0VarM3050f.f4531f & 2097152) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                    int i = 0;
                                    for (oe0 oe0Var2 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var2 != null; oe0Var2 = oe0Var2.f4534i) {
                                        if ((oe0Var2.f4531f & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                oe0VarM3050f = oe0Var2;
                                            } else {
                                                if (sh0Var == null) {
                                                    sh0Var = new sh0(new oe0[16]);
                                                }
                                                if (oe0VarM3050f != null) {
                                                    sh0Var.m4072b(oe0VarM3050f);
                                                    oe0VarM3050f = null;
                                                }
                                                sh0Var.m4072b(oe0Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                oe0VarM3050f = pf1.m3050f(sh0Var);
                            }
                        }
                        oe0Var = oe0Var.f4533h;
                    }
                }
                b60VarM3039Q = b60VarM3039Q.m315v();
                oe0Var = (b60VarM3039Q == null || (mj0Var2 = b60VarM3039Q.f395I) == null) ? null : mj0Var2.f3997e;
            }
            if (arrayList == null) {
                return;
            }
            if (c0149dv2 != null) {
                if (!c0149dv2.f4529d.f4542q) {
                    w10.m4824b("visitAncestors called on an unattached node");
                }
                oe0 oe0Var3 = c0149dv2.f4529d;
                b60 b60VarM3039Q2 = pf1.m3039Q(c0149dv2);
                LinkedHashSet linkedHashSet2 = null;
                while (b60VarM3039Q2 != null) {
                    if ((b60VarM3039Q2.f395I.f3998f.f4532g & 2097152) != 0) {
                        while (oe0Var3 != null) {
                            if ((oe0Var3.f4531f & 2097152) != 0) {
                                oe0 oe0VarM3050f2 = oe0Var3;
                                sh0 sh0Var2 = null;
                                while (oe0VarM3050f2 != null) {
                                    if (oe0VarM3050f2 instanceof q10) {
                                        if (linkedHashSet2 == null) {
                                            linkedHashSet2 = new LinkedHashSet();
                                        }
                                        linkedHashSet2.add(oe0VarM3050f2);
                                    } else if ((oe0VarM3050f2.f4531f & 2097152) != 0 && (oe0VarM3050f2 instanceof AbstractC0731sm)) {
                                        int i2 = 0;
                                        for (oe0 oe0Var4 = ((AbstractC0731sm) oe0VarM3050f2).f5782s; oe0Var4 != null; oe0Var4 = oe0Var4.f4534i) {
                                            if ((oe0Var4.f4531f & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    oe0VarM3050f2 = oe0Var4;
                                                } else {
                                                    if (sh0Var2 == null) {
                                                        sh0Var2 = new sh0(new oe0[16]);
                                                    }
                                                    if (oe0VarM3050f2 != null) {
                                                        sh0Var2.m4072b(oe0VarM3050f2);
                                                        oe0VarM3050f2 = null;
                                                    }
                                                    sh0Var2.m4072b(oe0Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    oe0VarM3050f2 = pf1.m3050f(sh0Var2);
                                }
                            }
                            oe0Var3 = oe0Var3.f4533h;
                        }
                    }
                    b60VarM3039Q2 = b60VarM3039Q2.m315v();
                    oe0Var3 = (b60VarM3039Q2 == null || (mj0Var = b60VarM3039Q2.f395I) == null) ? null : mj0Var.f3997e;
                }
                linkedHashSet = linkedHashSet2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                q10 q10Var = (q10) arrayList.get(i3);
                if (!(linkedHashSet != null ? linkedHashSet.contains(q10Var) : false)) {
                    q10Var.mo760r();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            m4842m(getRoot());
        }
        m4859s(true);
        t21.m4172j().mo816m();
        this.f6927I = true;
        C0910x1 c0910x1 = this.f6979t;
        C0041b3 c0041b3 = (C0041b3) c0910x1.f7232e;
        Canvas canvas2 = c0041b3.f362a;
        c0041b3.f362a = canvas;
        getRoot().m303i(c0041b3, null);
        ((C0041b3) c0910x1.f7232e).f362a = canvas2;
        dh0 dh0Var = this.f6923G;
        if (dh0Var.m705i()) {
            int i = dh0Var.f1109b;
            for (int i2 = 0; i2 < i; i2++) {
                ((C0942xx) ((cn0) dh0Var.m702f(i2))).m5177g();
            }
        }
        int i3 = pc1.f4806d;
        dh0Var.m700d();
        this.f6927I = false;
        dh0 dh0Var2 = this.f6925H;
        if (dh0Var2 != null) {
            dh0Var.m698b(dh0Var2);
            dh0Var2.m700d();
        }
        if (this.f6969o) {
            AbstractC0502n8.m2636a(this, this.f6990y0);
            View view = this.f6967n;
            if (view == null) {
                p30.m2986V("frameRateCategoryView");
                throw null;
            }
            AbstractC0502n8.m2636a(view, this.f6992z0);
            if (!Float.isNaN(this.f6992z0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.f6990y0 = Float.NaN;
            this.f6992z0 = Float.NaN;
        }
        getRectManager().m4348a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:319:0x04e5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:353:0x055b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:369:0x0592 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:454:0x06c1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:487:0x072e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:505:0x076e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:605:0x051f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:606:0x0519 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:612:0x04f9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:615:0x04ef */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:621:0x053c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:622:0x053c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:624:0x05af */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:625:0x05aa */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:628:0x05a5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:631:0x0555 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:633:0x0555 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:636:0x059c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:646:0x06f2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:648:0x0677 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:649:0x0677 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:655:0x06d3 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:658:0x06cb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:664:0x070f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:665:0x070f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:667:0x078f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:668:0x0788 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:673:0x0783 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:674:0x0728 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:676:0x0728 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:679:0x0778 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04fe A[PHI: r5
  0x04fe: PHI (r5v66 ??) = (r5v88 ??), (r5v89 ??), (r5v90 ??) binds: [B:307:0x04bf, B:309:0x04c3, B:324:0x04f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:461:0x06d6 A[PHI: r4
  0x06d6: PHI (r4v29 ??) = (r4v68 ??), (r4v69 ??), (r4v70 ??) binds: [B:442:0x069b, B:444:0x069f, B:459:0x06d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v18, types: [oe0] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v41, types: [oe0] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r2v127 */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v129 */
    /* JADX WARN: Type inference failed for: r2v130 */
    /* JADX WARN: Type inference failed for: r2v51, types: [oe0] */
    /* JADX WARN: Type inference failed for: r2v82, types: [oe0] */
    /* JADX WARN: Type inference failed for: r33v0 */
    /* JADX WARN: Type inference failed for: r33v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r33v2 */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30, types: [q10, rm] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43, types: [oe0] */
    /* JADX WARN: Type inference failed for: r3v44, types: [oe0] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v61 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [sh0] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33, types: [sh0] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36, types: [q10, rm] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50, types: [oe0] */
    /* JADX WARN: Type inference failed for: r4v51, types: [oe0] */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object, oe0] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35, types: [oe0] */
    /* JADX WARN: Type inference failed for: r5v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66, types: [sh0] */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v70, types: [sh0] */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
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
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [sh0] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [sh0] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.lang.Object, oe0] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38, types: [oe0] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [sh0] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25, types: [sh0] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v15 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) throws Throwable {
        Throwable th;
        int i;
        String str;
        int i2;
        C0791u5 c0791u5;
        String str2;
        long jValueAt;
        g10 g10Var;
        Object obj;
        long j;
        long j2;
        int i3;
        char c;
        int i4;
        long jFloatToRawIntBits;
        ?? r3;
        mj0 mj0Var;
        ?? r32;
        mj0 mj0Var2;
        ?? M3050f;
        ?? r4;
        boolean z;
        int size;
        int size2;
        mj0 mj0Var3;
        ?? r42;
        mj0 mj0Var4;
        ?? M3050f2;
        boolean z2;
        C0341j3 c0341j3;
        int size3;
        mj0 mj0Var5;
        oe0 oe0VarM3050f;
        mj0 mj0Var6;
        if (this.f6916C0) {
            RunnableC0232g3 runnableC0232g3 = this.f6914B0;
            removeCallbacks(runnableC0232g3);
            if (motionEvent.getActionMasked() == 8) {
                this.f6916C0 = false;
            } else {
                runnableC0232g3.run();
            }
        }
        if (m4843o(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        String str3 = "visitAncestors called on an unattached node";
        int actionIndex = -1;
        int i5 = 1;
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (m4854l(motionEvent) & 1) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            getContext();
            viewConfiguration.getScaledVerticalScrollFactor();
            getContext();
            viewConfiguration.getScaledHorizontalScrollFactor();
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            InterfaceC0902wu focusOwner = getFocusOwner();
            C0458m3 c0458m3 = new C0458m3(i5, this, motionEvent);
            C1017zu c1017zu = (C1017zu) focusOwner;
            if (c1017zu.f7999d.f6311e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            C0149dv c0149dvM1538n = AbstractC0307i4.m1538n(c1017zu.f7998c);
            if (c0149dvM1538n != null) {
                if (!c0149dvM1538n.f4529d.f4542q) {
                    w10.m4824b("visitAncestors called on an unattached node");
                }
                oe0 oe0Var = c0149dvM1538n.f4529d;
                b60 b60VarM3039Q = pf1.m3039Q(c0149dvM1538n);
                loop0: while (true) {
                    if (b60VarM3039Q == null) {
                        oe0VarM3050f = null;
                        break;
                    }
                    if ((b60VarM3039Q.f395I.f3998f.f4532g & 16384) != 0) {
                        while (oe0Var != null) {
                            if ((oe0Var.f4531f & 16384) != 0) {
                                oe0VarM3050f = oe0Var;
                                sh0 sh0Var = null;
                                while (oe0VarM3050f != null) {
                                    if (oe0VarM3050f instanceof C0341j3) {
                                        break loop0;
                                    }
                                    if ((oe0VarM3050f.f4531f & 16384) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                        int i6 = 0;
                                        for (oe0 oe0Var2 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var2 != null; oe0Var2 = oe0Var2.f4534i) {
                                            if ((oe0Var2.f4531f & 16384) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    oe0VarM3050f = oe0Var2;
                                                } else {
                                                    if (sh0Var == null) {
                                                        sh0Var = new sh0(new oe0[16]);
                                                    }
                                                    if (oe0VarM3050f != null) {
                                                        sh0Var.m4072b(oe0VarM3050f);
                                                        oe0VarM3050f = null;
                                                    }
                                                    sh0Var.m4072b(oe0Var2);
                                                }
                                            }
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                    oe0VarM3050f = pf1.m3050f(sh0Var);
                                }
                            }
                            oe0Var = oe0Var.f4533h;
                        }
                    }
                    b60VarM3039Q = b60VarM3039Q.m315v();
                    oe0Var = (b60VarM3039Q == null || (mj0Var6 = b60VarM3039Q.f395I) == null) ? null : mj0Var6.f3997e;
                }
                c0341j3 = (C0341j3) oe0VarM3050f;
            } else {
                c0341j3 = null;
            }
            if (c0341j3 != null) {
                if (!c0341j3.f4529d.f4542q) {
                    w10.m4824b("visitAncestors called on an unattached node");
                }
                oe0 oe0Var3 = c0341j3.f4529d.f4533h;
                b60 b60VarM3039Q2 = pf1.m3039Q(c0341j3);
                ArrayList arrayList = null;
                while (b60VarM3039Q2 != null) {
                    if ((b60VarM3039Q2.f395I.f3998f.f4532g & 16384) != 0) {
                        while (oe0Var3 != null) {
                            if ((oe0Var3.f4531f & 16384) != 0) {
                                oe0 oe0VarM3050f2 = oe0Var3;
                                sh0 sh0Var2 = null;
                                while (oe0VarM3050f2 != null) {
                                    if (oe0VarM3050f2 instanceof C0341j3) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(oe0VarM3050f2);
                                    } else if ((oe0VarM3050f2.f4531f & 16384) != 0 && (oe0VarM3050f2 instanceof AbstractC0731sm)) {
                                        int i7 = 0;
                                        for (oe0 oe0Var4 = ((AbstractC0731sm) oe0VarM3050f2).f5782s; oe0Var4 != null; oe0Var4 = oe0Var4.f4534i) {
                                            if ((oe0Var4.f4531f & 16384) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    oe0VarM3050f2 = oe0Var4;
                                                } else {
                                                    if (sh0Var2 == null) {
                                                        sh0Var2 = new sh0(new oe0[16]);
                                                    }
                                                    if (oe0VarM3050f2 != null) {
                                                        sh0Var2.m4072b(oe0VarM3050f2);
                                                        oe0VarM3050f2 = null;
                                                    }
                                                    sh0Var2.m4072b(oe0Var4);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    oe0VarM3050f2 = pf1.m3050f(sh0Var2);
                                }
                            }
                            oe0Var3 = oe0Var3.f4533h;
                        }
                    }
                    b60VarM3039Q2 = b60VarM3039Q2.m315v();
                    oe0Var3 = (b60VarM3039Q2 == null || (mj0Var5 = b60VarM3039Q2.f395I) == null) ? null : mj0Var5.f3997e;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i8 = size3 - 1;
                        ((C0341j3) arrayList.get(size3)).getClass();
                        if (i8 < 0) {
                            break;
                        }
                        size3 = i8;
                    }
                }
                oe0 oe0VarM3050f3 = c0341j3.f4529d;
                sh0 sh0Var3 = null;
                while (oe0VarM3050f3 != null) {
                    if (!(oe0VarM3050f3 instanceof C0341j3) && (oe0VarM3050f3.f4531f & 16384) != 0 && (oe0VarM3050f3 instanceof AbstractC0731sm)) {
                        int i9 = 0;
                        for (oe0 oe0Var5 = ((AbstractC0731sm) oe0VarM3050f3).f5782s; oe0Var5 != null; oe0Var5 = oe0Var5.f4534i) {
                            if ((oe0Var5.f4531f & 16384) != 0) {
                                i9++;
                                if (i9 == 1) {
                                    oe0VarM3050f3 = oe0Var5;
                                } else {
                                    if (sh0Var3 == null) {
                                        sh0Var3 = new sh0(new oe0[16]);
                                    }
                                    if (oe0VarM3050f3 != null) {
                                        sh0Var3.m4072b(oe0VarM3050f3);
                                        oe0VarM3050f3 = null;
                                    }
                                    sh0Var3.m4072b(oe0Var5);
                                }
                            }
                        }
                        if (i9 == 1) {
                        }
                    }
                    oe0VarM3050f3 = pf1.m3050f(sh0Var3);
                }
                if (!((Boolean) c0458m3.invoke()).booleanValue()) {
                    oe0 oe0VarM3050f4 = c0341j3.f4529d;
                    sh0 sh0Var4 = null;
                    while (oe0VarM3050f4 != null) {
                        if (!(oe0VarM3050f4 instanceof C0341j3) && (oe0VarM3050f4.f4531f & 16384) != 0 && (oe0VarM3050f4 instanceof AbstractC0731sm)) {
                            int i10 = 0;
                            for (oe0 oe0Var6 = ((AbstractC0731sm) oe0VarM3050f4).f5782s; oe0Var6 != null; oe0Var6 = oe0Var6.f4534i) {
                                if ((oe0Var6.f4531f & 16384) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        oe0VarM3050f4 = oe0Var6;
                                    } else {
                                        if (sh0Var4 == null) {
                                            sh0Var4 = new sh0(new oe0[16]);
                                        }
                                        if (oe0VarM3050f4 != null) {
                                            sh0Var4.m4072b(oe0VarM3050f4);
                                            oe0VarM3050f4 = null;
                                        }
                                        sh0Var4.m4072b(oe0Var6);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        oe0VarM3050f4 = pf1.m3050f(sh0Var4);
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        for (int i11 = 0; i11 < size4; i11++) {
                            ((C0341j3) arrayList.get(i11)).getClass();
                        }
                    }
                }
            }
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        g10 g10Var2 = this.f6951f;
        ag0 ag0Var = this.f6929J;
        ub0 ub0Var = ag0Var.f161e;
        SparseLongArray sparseLongArray = ag0Var.f158b;
        int actionMasked = motionEvent.getActionMasked();
        ag0Var.m169b(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            ag0Var.f159c.clear();
            str = "visitAncestors called on an unattached node";
            i = 16;
            c0791u5 = null;
            th = null;
        } else {
            ag0Var.m168a(motionEvent);
            if (actionMasked != 1) {
                if (actionMasked == 6) {
                    actionIndex = motionEvent.getActionIndex();
                }
                th = null;
            } else {
                th = null;
                actionIndex = 0;
            }
            boolean z3 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
            i = 16;
            int pointerCount = motionEvent.getPointerCount();
            ArrayList arrayList2 = new ArrayList(pointerCount);
            int i12 = 0;
            while (i12 < pointerCount) {
                int pointerId = motionEvent.getPointerId(i12);
                int i13 = i5;
                int iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
                if (iIndexOfKey >= 0) {
                    str2 = str3;
                    jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                    g10Var = g10Var2;
                } else {
                    str2 = str3;
                    jValueAt = ag0Var.f157a;
                    g10Var = g10Var2;
                    ag0Var.f157a = jValueAt + 1;
                    sparseLongArray.put(pointerId, jValueAt);
                }
                ag0 ag0Var2 = ag0Var;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getX(i12))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY(i12))) & 4294967295L);
                ?? r33 = i12 != actionIndex ? i13 : 0;
                int iM2771k = o30.m2771k(ub0Var.f6186e, ub0Var.f6188g, jValueAt);
                if (iM2771k < 0 || (obj = ub0Var.f6187f[iM2771k]) == rd0.f5372k) {
                    obj = th;
                }
                zf0 zf0Var = (zf0) obj;
                if (i12 == actionIndex) {
                    ub0Var.m4296c(jValueAt);
                    j = jValueAt;
                    j2 = 2147483647L;
                    c = ' ';
                    i3 = 65535;
                } else {
                    if (z3) {
                        j2 = 2147483647L;
                        i3 = 65535;
                        j = jValueAt;
                        ub0Var.m4295b(j, new zf0(1 | ((motionEvent.getEventTime() & 2147483647L) << i13) | (((long) ((((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))) << 16))) << 32)));
                    } else {
                        j = jValueAt;
                        j2 = 2147483647L;
                        i3 = 65535;
                    }
                    c = ' ';
                }
                long eventTime = motionEvent.getEventTime();
                long j3 = j2;
                float pressure = motionEvent.getPressure(i12);
                int i14 = i3;
                int i15 = actionIndex;
                long eventTime2 = zf0Var != null ? (zf0Var.f7886a >> i13) & j3 : motionEvent.getEventTime();
                if (zf0Var != null) {
                    i4 = i15;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits((short) (r5 & i14))) & 4294967295L) | (((long) Float.floatToRawIntBits((short) (((int) (zf0Var.f7886a >>> c)) >>> 16))) << c);
                } else {
                    i4 = i15;
                    jFloatToRawIntBits = jFloatToRawIntBits2;
                }
                arrayList2.add(new h10(j, eventTime, jFloatToRawIntBits2, r33, pressure, eventTime2, jFloatToRawIntBits, zf0Var != null ? (zf0Var.f7886a & 1) != 0 ? i13 : 0 : 0));
                i12++;
                ag0Var = ag0Var2;
                i5 = i13;
                str3 = str2;
                g10Var2 = g10Var;
                actionIndex = i4;
            }
            g10 g10Var3 = g10Var2;
            str = str3;
            int i16 = i5;
            ag0Var.m171d(motionEvent);
            if (g10Var3 != null) {
                i2 = g10Var3.f1840a;
            } else {
                if (!motionEvent.isFromSource(2097152)) {
                    C0921xc.m5131l("MotionEvent must be a touch navigation source");
                    return false;
                }
                InputDevice device = motionEvent.getDevice();
                if (device != null) {
                    InputDevice.MotionRange motionRange = device.getMotionRange(0);
                    InputDevice.MotionRange motionRange2 = device.getMotionRange(i16);
                    if (motionRange == null || motionRange2 != null) {
                        if (motionRange2 == null || motionRange != null) {
                            if (motionRange != null && motionRange2 != null) {
                                float range = motionRange.getRange();
                                float range2 = motionRange2.getRange();
                                if (range <= range2 || (range2 != 0.0f && range / range2 < 5.0f)) {
                                    if (range2 <= range || (range != 0.0f && range2 / range < 5.0f)) {
                                    }
                                }
                                i2 = 1;
                            }
                            i2 = 0;
                        }
                        i2 = 2;
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = 0;
                }
            }
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 2 || actionMasked != 5) {
            }
            c0791u5 = new C0791u5();
            c0791u5.f6135b = arrayList2;
            c0791u5.f6134a = i2;
            c0791u5.f6136c = motionEvent;
            if (arrayList2.isEmpty()) {
                C0921xc.m5131l("changes cannot be empty");
                throw th;
            }
        }
        s10 s10Var = this.f6918D0;
        if (c0791u5 == null) {
            C0149dv c0149dvM5612f = ((C1017zu) getFocusOwner()).m5612f();
            if (c0149dvM5612f != null) {
                if (!c0149dvM5612f.f4529d.f4542q) {
                    w10.m4824b(str);
                }
                Object obj2 = c0149dvM5612f.f4529d;
                b60 b60VarM3039Q3 = pf1.m3039Q(c0149dvM5612f);
                loop26: while (true) {
                    if (b60VarM3039Q3 == null) {
                        r32 = th;
                        break;
                    }
                    int i17 = 2097152;
                    if ((b60VarM3039Q3.f395I.f3998f.f4532g & 2097152) != 0) {
                        for (?? r2 = obj2; r2 != 0; r2 = r2.f4533h) {
                            if ((r2.f4531f & i17) != 0) {
                                r32 = r2;
                                ?? r43 = th;
                                while (r32 != 0) {
                                    if (r32 instanceof q10) {
                                        break loop26;
                                    }
                                    ?? sh0Var5 = r43;
                                    if ((r32.f4531f & i17) != 0) {
                                        sh0Var5 = r43;
                                        if (r32 instanceof AbstractC0731sm) {
                                            oe0 oe0Var7 = ((AbstractC0731sm) r32).f5782s;
                                            int i18 = 0;
                                            M3050f = r32;
                                            sh0Var5 = r43;
                                            while (oe0Var7 != null) {
                                                if ((oe0Var7.f4531f & i17) != 0) {
                                                    i18++;
                                                    sh0Var5 = sh0Var5;
                                                    if (i18 == 1) {
                                                        M3050f = oe0Var7;
                                                    } else {
                                                        if (sh0Var5 == 0) {
                                                            sh0Var5 = new sh0(new oe0[16]);
                                                        }
                                                        if (M3050f != 0) {
                                                            sh0Var5.m4072b(M3050f);
                                                            M3050f = th;
                                                        }
                                                        sh0Var5.m4072b(oe0Var7);
                                                    }
                                                }
                                                oe0Var7 = oe0Var7.f4534i;
                                                i17 = 2097152;
                                                M3050f = M3050f;
                                                sh0Var5 = sh0Var5;
                                            }
                                            sh0Var5 = sh0Var5;
                                            if (i18 != 1) {
                                                M3050f = pf1.m3050f(sh0Var5);
                                            }
                                        }
                                    }
                                    i17 = 2097152;
                                    r32 = M3050f;
                                    r43 = sh0Var5;
                                }
                            }
                            i17 = 2097152;
                        }
                    }
                    b60VarM3039Q3 = b60VarM3039Q3.m315v();
                    obj2 = (b60VarM3039Q3 == null || (mj0Var2 = b60VarM3039Q3.f395I) == null) ? th : mj0Var2.f3997e;
                }
                r3 = (q10) r32;
            } else {
                r3 = th;
            }
            if (r3 != 0) {
                oe0 oe0Var8 = (oe0) r3;
                if (!oe0Var8.f4529d.f4542q) {
                    w10.m4824b(str);
                }
                Object obj3 = oe0Var8.f4529d.f4533h;
                b60 b60VarM3039Q4 = pf1.m3039Q(r3);
                ?? arrayList3 = th;
                while (b60VarM3039Q4 != null) {
                    int i19 = 2097152;
                    ?? r0 = obj3;
                    arrayList3 = arrayList3;
                    if ((b60VarM3039Q4.f395I.f3998f.f4532g & 2097152) != 0) {
                        while (r0 != 0) {
                            if ((r0.f4531f & i19) != 0) {
                                ?? M3050f3 = r0;
                                ?? sh0Var6 = th;
                                while (M3050f3 != 0) {
                                    if (M3050f3 instanceof q10) {
                                        if (arrayList3 == 0) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(M3050f3);
                                    } else if ((M3050f3.f4531f & 2097152) != 0 && (M3050f3 instanceof AbstractC0731sm)) {
                                        oe0 oe0Var9 = ((AbstractC0731sm) M3050f3).f5782s;
                                        int i20 = 0;
                                        M3050f3 = M3050f3;
                                        sh0Var6 = sh0Var6;
                                        while (oe0Var9 != null) {
                                            M3050f3 = M3050f3;
                                            if ((oe0Var9.f4531f & 2097152) != 0) {
                                                i20++;
                                                if (i20 == 1) {
                                                    M3050f3 = oe0Var9;
                                                } else {
                                                    sh0Var6 = sh0Var6 == 0 ? new sh0(new oe0[16]) : sh0Var6;
                                                    if (M3050f3 != 0) {
                                                        sh0Var6.m4072b(M3050f3);
                                                        M3050f3 = th;
                                                    }
                                                    sh0Var6.m4072b(oe0Var9);
                                                }
                                            }
                                            oe0Var9 = oe0Var9.f4534i;
                                            M3050f3 = M3050f3;
                                            sh0Var6 = sh0Var6;
                                        }
                                        if (i20 == 1) {
                                        }
                                    }
                                    M3050f3 = pf1.m3050f(sh0Var6);
                                }
                            }
                            i19 = 2097152;
                            r0 = r0.f4533h;
                            arrayList3 = arrayList3;
                        }
                    }
                    b60VarM3039Q4 = b60VarM3039Q4.m315v();
                    obj3 = (b60VarM3039Q4 == null || (mj0Var = b60VarM3039Q4.f395I) == null) ? th : mj0Var.f3997e;
                }
                r3.mo760r();
                if (arrayList3 != 0) {
                    int size5 = arrayList3.size();
                    for (int i21 = 0; i21 < size5; i21++) {
                        ((q10) arrayList3.get(i21)).mo760r();
                    }
                }
            }
            s10Var.f5617b = 0;
            s10Var.f5618c = true;
            return true;
        }
        C1017zu c1017zu2 = (C1017zu) getFocusOwner();
        if (c1017zu2.f7999d.f6311e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        } else {
            C0149dv c0149dvM5612f2 = c1017zu2.m5612f();
            if (c0149dvM5612f2 != null) {
                if (!c0149dvM5612f2.f4529d.f4542q) {
                    w10.m4824b(str);
                }
                oe0 oe0Var10 = c0149dvM5612f2.f4529d;
                b60 b60VarM3039Q5 = pf1.m3039Q(c0149dvM5612f2);
                Object obj4 = oe0Var10;
                loop14: while (true) {
                    if (b60VarM3039Q5 == null) {
                        r42 = th;
                        break;
                    }
                    int i22 = 2097152;
                    if ((b60VarM3039Q5.f395I.f3998f.f4532g & 2097152) != 0) {
                        for (?? r22 = obj4; r22 != 0; r22 = r22.f4533h) {
                            if ((r22.f4531f & i22) != 0) {
                                r42 = r22;
                                ?? r5 = th;
                                while (r42 != 0) {
                                    if (r42 instanceof q10) {
                                        break loop14;
                                    }
                                    ?? sh0Var7 = r5;
                                    if ((r42.f4531f & i22) != 0) {
                                        sh0Var7 = r5;
                                        if (r42 instanceof AbstractC0731sm) {
                                            oe0 oe0Var11 = ((AbstractC0731sm) r42).f5782s;
                                            int i23 = 0;
                                            M3050f2 = r42;
                                            sh0Var7 = r5;
                                            while (oe0Var11 != null) {
                                                if ((oe0Var11.f4531f & i22) != 0) {
                                                    i23++;
                                                    sh0Var7 = sh0Var7;
                                                    if (i23 == 1) {
                                                        M3050f2 = oe0Var11;
                                                    } else {
                                                        if (sh0Var7 == 0) {
                                                            sh0Var7 = new sh0(new oe0[i]);
                                                        }
                                                        if (M3050f2 != 0) {
                                                            sh0Var7.m4072b(M3050f2);
                                                            M3050f2 = th;
                                                        }
                                                        sh0Var7.m4072b(oe0Var11);
                                                    }
                                                }
                                                oe0Var11 = oe0Var11.f4534i;
                                                i = 16;
                                                i22 = 2097152;
                                                M3050f2 = M3050f2;
                                                sh0Var7 = sh0Var7;
                                            }
                                            sh0Var7 = sh0Var7;
                                            if (i23 != 1) {
                                                M3050f2 = pf1.m3050f(sh0Var7);
                                            }
                                        }
                                    }
                                    i = 16;
                                    i22 = 2097152;
                                    r42 = M3050f2;
                                    r5 = sh0Var7;
                                }
                            }
                            i = 16;
                            i22 = 2097152;
                        }
                    }
                    b60VarM3039Q5 = b60VarM3039Q5.m315v();
                    i = 16;
                    obj4 = (b60VarM3039Q5 == null || (mj0Var4 = b60VarM3039Q5.f395I) == null) ? th : mj0Var4.f3997e;
                }
                r4 = (q10) r42;
            } else {
                r4 = th;
            }
            if (r4 != 0) {
                oe0 oe0Var12 = (oe0) r4;
                if (!oe0Var12.f4529d.f4542q) {
                    w10.m4824b(str);
                }
                Object obj5 = oe0Var12.f4529d.f4533h;
                b60 b60VarM3039Q6 = pf1.m3039Q(r4);
                ?? arrayList4 = th;
                while (b60VarM3039Q6 != null) {
                    int i24 = 2097152;
                    ?? r02 = obj5;
                    arrayList4 = arrayList4;
                    if ((b60VarM3039Q6.f395I.f3998f.f4532g & 2097152) != 0) {
                        while (r02 != 0) {
                            if ((r02.f4531f & i24) != 0) {
                                ?? M3050f4 = r02;
                                ?? sh0Var8 = th;
                                while (M3050f4 != 0) {
                                    if (M3050f4 instanceof q10) {
                                        if (arrayList4 == 0) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(M3050f4);
                                    } else {
                                        int i25 = 2097152;
                                        if ((M3050f4.f4531f & 2097152) != 0 && (M3050f4 instanceof AbstractC0731sm)) {
                                            oe0 oe0Var13 = ((AbstractC0731sm) M3050f4).f5782s;
                                            int i26 = 0;
                                            M3050f4 = M3050f4;
                                            sh0Var8 = sh0Var8;
                                            while (oe0Var13 != null) {
                                                if ((oe0Var13.f4531f & i25) != 0) {
                                                    i26++;
                                                    sh0Var8 = sh0Var8;
                                                    if (i26 == 1) {
                                                        M3050f4 = oe0Var13;
                                                    } else {
                                                        if (sh0Var8 == 0) {
                                                            sh0Var8 = new sh0(new oe0[16]);
                                                        }
                                                        if (M3050f4 != 0) {
                                                            sh0Var8.m4072b(M3050f4);
                                                            M3050f4 = th;
                                                        }
                                                        sh0Var8.m4072b(oe0Var13);
                                                    }
                                                }
                                                oe0Var13 = oe0Var13.f4534i;
                                                i25 = 2097152;
                                                M3050f4 = M3050f4;
                                                sh0Var8 = sh0Var8;
                                            }
                                            if (i26 == 1) {
                                            }
                                        }
                                    }
                                    M3050f4 = pf1.m3050f(sh0Var8);
                                }
                            }
                            i24 = 2097152;
                            r02 = r02.f4533h;
                            arrayList4 = arrayList4;
                        }
                    }
                    b60VarM3039Q6 = b60VarM3039Q6.m315v();
                    obj5 = (b60VarM3039Q6 == null || (mj0Var3 = b60VarM3039Q6.f395I) == null) ? th : mj0Var3.f3997e;
                }
                jr0 jr0Var = jr0.f2933d;
                if (arrayList4 != 0 && arrayList4.size() - 1 >= 0) {
                    while (true) {
                        int i27 = size2 - 1;
                        ((q10) arrayList4.get(size2)).mo761u(c0791u5, jr0Var);
                        if (i27 < 0) {
                            break;
                        }
                        size2 = i27;
                    }
                }
                r4.mo761u(c0791u5, jr0Var);
                jr0 jr0Var2 = jr0.f2934e;
                r4.mo761u(c0791u5, jr0Var2);
                if (arrayList4 != 0) {
                    int size6 = arrayList4.size();
                    for (int i28 = 0; i28 < size6; i28++) {
                        ((q10) arrayList4.get(i28)).mo761u(c0791u5, jr0Var2);
                    }
                }
                jr0 jr0Var3 = jr0.f2935f;
                if (arrayList4 != 0 && arrayList4.size() - 1 >= 0) {
                    while (true) {
                        int i29 = size - 1;
                        ((q10) arrayList4.get(size)).mo761u(c0791u5, jr0Var3);
                        if (i29 < 0) {
                            break;
                        }
                        size = i29;
                    }
                }
                r4.mo761u(c0791u5, jr0Var3);
            }
            ArrayList arrayList5 = (ArrayList) c0791u5.f6135b;
            int size7 = arrayList5.size();
            for (int i30 = 0; i30 < size7; i30++) {
                if (((h10) arrayList5.get(i30)).f2122i) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        s10Var.getClass();
        MotionEvent motionEvent2 = (MotionEvent) c0791u5.f6136c;
        int action = motionEvent2.getAction();
        if (action != 0) {
            z2 = true;
            if ((action == 1 || action == 2) && z) {
                s10Var.f5617b = 0;
                s10Var.f5618c = true;
            }
        } else {
            z2 = true;
            s10Var.f5617b = c0791u5.f6134a;
            s10Var.f5618c = false;
        }
        s10Var.f5619d.onTouchEvent(motionEvent2);
        return z2;
    }

    /* JADX DEBUG: Class process forced to load method for inline: c4.w(c4, int, int, java.lang.Integer, int):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
    
        r5.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(r24);
        r5 = r2.f670h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010e, code lost:
    
        if (r5 != r14) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0111, code lost:
    
        r2.f670h = r14;
        p000.ViewOnAttachStateChangeListenerC0078c4.m451w(r2, r14, 128, null, 12);
        p000.ViewOnAttachStateChangeListenerC0078c4.m451w(r2, r5, 256, null, 12);
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0157  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.f6916C0;
        RunnableC0232g3 runnableC0232g3 = this.f6914B0;
        if (z) {
            removeCallbacks(runnableC0232g3);
            runnableC0232g3.run();
        }
        if (!m4843o(motionEvent) && isAttachedToWindow()) {
            ViewOnAttachStateChangeListenerC0078c4 viewOnAttachStateChangeListenerC0078c4 = this.f6913B;
            ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = viewOnAttachStateChangeListenerC0078c4.f669g;
            AccessibilityManager accessibilityManager = viewOnAttachStateChangeListenerC0078c4.f672j;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    viewTreeObserverOnGlobalLayoutListenerC0875w3.m4859s(true);
                    C0632py c0632py = new C0632py();
                    b60 root = viewTreeObserverOnGlobalLayoutListenerC0875w3.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
                    mj0 mj0Var = root.f395I;
                    qj0 qj0Var = mj0Var.f3996d;
                    gv0 gv0Var = qj0.f5161P;
                    mj0Var.f3996d.m3272L0(qj0.f5164S, qj0Var.m3266D0(jFloatToRawIntBits), c0632py, 1, true);
                    dh0 dh0Var = c0632py.f4984d;
                    int i2 = dh0Var.f1109b - 1;
                    while (true) {
                        if (-1 >= i2) {
                            i = Integer.MIN_VALUE;
                            break;
                        }
                        Object objM702f = dh0Var.m702f(i2);
                        objM702f.getClass();
                        b60 b60VarM3039Q = pf1.m3039Q((oe0) objM702f);
                        if (viewTreeObserverOnGlobalLayoutListenerC0875w3.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(b60VarM3039Q) != null) {
                            C0921xc.m5123d();
                            return false;
                        }
                        if (b60VarM3039Q.f395I.m2600d(8)) {
                            int iM471s = viewOnAttachStateChangeListenerC0078c4.m471s(b60VarM3039Q.f406e);
                            xz0 xz0VarM1653c = j50.m1653c(b60VarM3039Q, false);
                            if (AbstractC0307i4.m1546v(xz0VarM1653c)) {
                                if (!xz0VarM1653c.m5188k().f5877d.m1697c(b01.f347z)) {
                                    i = iM471s;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i2--;
                    }
                } else if (action == 10) {
                    int i3 = viewOnAttachStateChangeListenerC0078c4.f670h;
                    if (i3 == Integer.MIN_VALUE) {
                        viewTreeObserverOnGlobalLayoutListenerC0875w3.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i3 != Integer.MIN_VALUE) {
                        viewOnAttachStateChangeListenerC0078c4.f670h = Integer.MIN_VALUE;
                        ViewOnAttachStateChangeListenerC0078c4.m451w(viewOnAttachStateChangeListenerC0078c4, Integer.MIN_VALUE, 128, null, 12);
                        ViewOnAttachStateChangeListenerC0078c4.m451w(viewOnAttachStateChangeListenerC0078c4, i3, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && m4856p(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.f6982u0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f6982u0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.f6916C0 = true;
                        postDelayed(runnableC0232g3, 8L);
                        return false;
                    }
                } else if ((m4854l(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (m4857q(motionEvent)) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (!isFocused()) {
            return ((C1017zu) getFocusOwner()).m5610d(keyEvent, new C0458m3(i, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f6977s.getClass();
        ed1.f1424a.setValue(new sr0(metaState));
        return ((C1017zu) getFocusOwner()).m5610d(keyEvent, C0094cj.f822h) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        mj0 mj0Var;
        if (isFocused()) {
            C1017zu c1017zu = (C1017zu) getFocusOwner();
            if (c1017zu.f7999d.f6311e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                C0149dv c0149dvM1538n = AbstractC0307i4.m1538n(c1017zu.f7998c);
                if (c0149dvM1538n != null) {
                    if (!c0149dvM1538n.f4529d.f4542q) {
                        w10.m4824b("visitAncestors called on an unattached node");
                    }
                    oe0 oe0Var = c0149dvM1538n.f4529d;
                    b60 b60VarM3039Q = pf1.m3039Q(c0149dvM1538n);
                    while (b60VarM3039Q != null) {
                        if ((b60VarM3039Q.f395I.f3998f.f4532g & MethodData.ACC_DECLARED_SYNCHRONIZED) != 0) {
                            while (oe0Var != null) {
                                if ((oe0Var.f4531f & MethodData.ACC_DECLARED_SYNCHRONIZED) != 0) {
                                    oe0 oe0VarM3050f = oe0Var;
                                    sh0 sh0Var = null;
                                    while (oe0VarM3050f != null) {
                                        if ((oe0VarM3050f.f4531f & MethodData.ACC_DECLARED_SYNCHRONIZED) != 0 && (oe0VarM3050f instanceof AbstractC0731sm)) {
                                            int i = 0;
                                            for (oe0 oe0Var2 = ((AbstractC0731sm) oe0VarM3050f).f5782s; oe0Var2 != null; oe0Var2 = oe0Var2.f4534i) {
                                                if ((oe0Var2.f4531f & MethodData.ACC_DECLARED_SYNCHRONIZED) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        oe0VarM3050f = oe0Var2;
                                                    } else {
                                                        if (sh0Var == null) {
                                                            sh0Var = new sh0(new oe0[16]);
                                                        }
                                                        if (oe0VarM3050f != null) {
                                                            sh0Var.m4072b(oe0VarM3050f);
                                                            oe0VarM3050f = null;
                                                        }
                                                        sh0Var.m4072b(oe0Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        oe0VarM3050f = pf1.m3050f(sh0Var);
                                    }
                                }
                                oe0Var = oe0Var.f4533h;
                            }
                        }
                        b60VarM3039Q = b60VarM3039Q.m315v();
                        oe0Var = (b60VarM3039Q == null || (mj0Var = b60VarM3039Q.f395I) == null) ? null : mj0Var.f3997e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object c0275h9;
        C0149dv c0149dvM5612f;
        if (this.f6916C0) {
            RunnableC0232g3 runnableC0232g3 = this.f6914B0;
            removeCallbacks(runnableC0232g3);
            MotionEvent motionEvent2 = this.f6982u0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f6916C0 = false;
            } else {
                runnableC0232g3.run();
            }
        }
        if (!m4843o(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || m4857q(motionEvent))) {
            int iM4854l = m4854l(motionEvent);
            if ((iM4854l & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (c0275h9 = view.getTag(C0587R.id.auto_clear_focus_behavior_tag)) == null) {
                    c0275h9 = new C0275h9(1);
                }
                if (c0275h9.equals(new C0275h9(1)) && (c0149dvM5612f = ((C1017zu) getFocusOwner()).m5612f()) != null) {
                    qj0 qj0VarM3038P = pf1.m3038P(c0149dvM5612f);
                    st0 st0VarMo341B = j50.m1662l(qj0VarM3038P).mo341B(qj0VarM3038P, true);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    if (!((fIntBitsToFloat < st0VarMo341B.f5834c) & (fIntBitsToFloat >= st0VarMo341B.f5832a) & (fIntBitsToFloat2 >= st0VarMo341B.f5833b) & (fIntBitsToFloat2 < st0VarMo341B.f5835d))) {
                        ((C1017zu) getFocusOwner()).m5608b(8, false, true);
                    }
                }
            }
            if ((iM4854l & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        st0 st0VarM4225a;
        if (view == null || this.f6942V.f6195c) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || viewFindNextFocus.equals(this)) {
            viewFindNextFocus = null;
        } else {
            for (ViewParent parent = viewFindNextFocus.getParent(); parent != null; parent = parent.getParent()) {
                if (parent == this) {
                    break;
                }
            }
            viewFindNextFocus = null;
        }
        if (view == this) {
            C0149dv c0149dvM1538n = AbstractC0307i4.m1538n(((C1017zu) getFocusOwner()).f7998c);
            st0VarM4225a = c0149dvM1538n != null ? AbstractC0307i4.m1539o(c0149dvM1538n) : null;
            if (st0VarM4225a == null) {
                st0VarM4225a = AbstractC0779tu.m4225a(view, this);
            }
        } else {
            st0VarM4225a = AbstractC0779tu.m4225a(view, this);
        }
        C0665qu c0665quM4226b = AbstractC0779tu.m4226b(i);
        int i2 = c0665quM4226b != null ? c0665quM4226b.f5222a : 6;
        zt0 zt0Var = new zt0();
        if (((C1017zu) getFocusOwner()).m5611e(i2, st0VarM4225a, new C0536o3(0, zt0Var)) == null) {
            return view;
        }
        Object obj = zt0Var.f7995d;
        if (obj != null) {
            if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || z60.m5418E(AbstractC0307i4.m1539o((C0149dv) obj), AbstractC0779tu.m4225a(viewFindNextFocus, this), st0VarM4225a, i2)) {
                return this;
            }
        } else if (viewFindNextFocus == null) {
            return super.focusSearch(view, i);
        }
        return viewFindNextFocus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0878w6 getAndroidViewsHandler$ui() {
        if (this.f6939S == null) {
            C0878w6 c0878w6 = new C0878w6(getContext());
            this.f6939S = c0878w6;
            addView(c0878w6, -1);
            requestLayout();
        }
        C0878w6 c0878w62 = this.f6939S;
        c0878w62.getClass();
        return c0878w62;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0312i9 getAutofill() {
        return this.f6933M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0384k9 getAutofillManager() {
        return this.f6934N;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0423l9 getAutofillTree() {
        return this.f6921F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Configuration getConfiguration() {
        return (Configuration) this.f6932L.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ViewOnAttachStateChangeListenerC0827v4 getContentCaptureManager$ui() {
        return this.f6915C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0618pk getCoroutineContext() {
        return this.f6973q;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0968ym getDensity() {
        return (InterfaceC0968ym) this.f6965m.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public st0 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            C0149dv c0149dvM1538n = AbstractC0307i4.m1538n(((C1017zu) getFocusOwner()).f7998c);
            if (c0149dvM1538n != null) {
                return AbstractC0307i4.m1539o(c0149dvM1538n);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return AbstractC0779tu.m4225a(viewFindFocus, this);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0902wu getFocusOwner() {
        return this.f6971p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        st0 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f5832a);
            rect.top = Math.round(embeddedViewFocusRect.f5833b);
            rect.right = Math.round(embeddedViewFocusRect.f5834c);
            rect.bottom = Math.round(embeddedViewFocusRect.f5835d);
            return;
        }
        if (p30.m3002l(((C1017zu) getFocusOwner()).m5611e(6, null, C0601p3.f4711e), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0369jv getFontFamilyResolver() {
        return (InterfaceC0369jv) this.f6970o0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0332iv getFontLoader() {
        return this.f6968n0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final aa0 getFrameEndScheduler$ui() {
        return this.f6955h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0819ux getGraphicsContext() {
        return this.f6919E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InterfaceC0372jy getHapticFeedBack() {
        return this.f6974q0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getHasPendingMeasureOrLayout() {
        return this.f6942V.f6194b.m2805j() || !this.f6961k.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public g20 getInputModeManager() {
        return this.f6976r0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final l20 getInsetsListener() {
        return this.f6983v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f6948d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, android.view.ViewParent
    public k50 getLayoutDirection() {
        return (k50) this.f6972p0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getMeasureIteration() {
        ud0 ud0Var = this.f6942V;
        if (!ud0Var.f6195c) {
            w10.m4823a("measureIteration should be only used during the measure/layout pass");
        }
        return ud0Var.f6199g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qe0 getModifierLocalManager() {
        return this.f6978s0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: getOutOfFrameExecutor()Lvm0; */
    public ViewTreeObserverOnGlobalLayoutListenerC0875w3 getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wq0 getPlacementScope() {
        int i = yq0.f7688b;
        return new zb0(1, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mr0 getPointerIconService() {
        return this.f6930J0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final g10 m5740getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.f6951f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ut0 getRectManager() {
        return this.f6989y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fv0 getRetainedValuesStore() {
        return this.f6959j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b60 getRoot() {
        return this.f6985w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zv0 getRootForTest() {
        return this.f6991z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getScrollCaptureInProgress$ui() {
        i90 i90Var;
        if (Build.VERSION.SDK_INT < 31 || (i90Var = this.f6926H0) == null) {
            return false;
        }
        return ((Boolean) i90Var.f2490a.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a01 getSemanticsOwner() {
        return this.f6911A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public d60 getSharedDrawScope() {
        return this.f6953g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getShowLayoutBounds() {
        return C0422l8.f3383a.m1983a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fn0 getSnapshotObserver() {
        return this.f6938R;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public f31 getSoftwareKeyboardController() {
        return this.f6966m0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a71 getTextInputService() {
        return this.f6962k0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t71 getTextToolbar() {
        return this.f6980t0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final yv0 getUncaughtExceptionHandler$ui() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nc1 getViewConfiguration() {
        return this.f6981u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0378k3 getViewTreeOwners() {
        return (C0378k3) this.f6956h0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dd1 getWindowInfo() {
        return this.f6977s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final C0004a3 get_autofillManager$ui() {
        return this.f6934N;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m4853k(b60 b60Var, boolean z) {
        this.f6942V.m4306f(b60Var, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m4854l(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3;
        removeCallbacks(this.f6912A0);
        try {
            m4844A(motionEvent);
            this.f6950e0 = true;
            m4859s(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.f6982u0;
                boolean z = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                C0206fe c0206fe = this.f6931K;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!c0206fe.f1696a) {
                                ub0 ub0Var = (ub0) ((C0910x1) c0206fe.f1699d).f7232e;
                                int i = ub0Var.f6188g;
                                Object[] objArr = ub0Var.f6187f;
                                for (int i2 = 0; i2 < i; i2++) {
                                    objArr[i2] = null;
                                }
                                ub0Var.f6188g = 0;
                                ub0Var.f6185d = false;
                                ((C0491my) c0206fe.f1698c).m2609c();
                            }
                        } else if (motionEvent3.getActionMasked() != 10 && z) {
                            m4849F(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                boolean z2 = motionEvent.getToolType(0) == 3;
                if (z || !z2 || actionMasked2 == 3 || actionMasked2 == 9 || !m4856p(motionEvent)) {
                    viewTreeObserverOnGlobalLayoutListenerC0875w3 = this;
                } else {
                    viewTreeObserverOnGlobalLayoutListenerC0875w3 = this;
                    viewTreeObserverOnGlobalLayoutListenerC0875w3.m4849F(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6982u0;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6982u0;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    ag0 ag0Var = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6929J;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            ag0Var.f159c.delete(pointerId);
                            ag0Var.f158b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6982u0;
                        float x = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6982u0;
                        boolean z3 = (x == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = viewTreeObserverOnGlobalLayoutListenerC0875w3.f6982u0;
                        boolean z4 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z3 || z4) {
                            if (pointerId >= 0) {
                                ag0Var.f159c.delete(pointerId);
                                ag0Var.f158b.delete(pointerId);
                            }
                            C0491my c0491my = (C0491my) c0206fe.f1698c;
                            if (c0491my.f4071d) {
                                c0491my.f4071d = true;
                            } else {
                                c0491my.f4074g.f6726a.m4077g();
                            }
                        }
                    }
                }
                viewTreeObserverOnGlobalLayoutListenerC0875w3.f6982u0 = MotionEvent.obtainNoHistory(motionEvent);
                int iM4848E = m4848E(motionEvent);
                Trace.endSection();
                viewTreeObserverOnGlobalLayoutListenerC0875w3.f6950e0 = false;
                return iM4848E;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.f6950e0 = false;
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m4855n(b60 b60Var) {
        this.f6942V.m4314p(b60Var, false);
        sh0 sh0VarM319z = b60Var.m319z();
        Object[] objArr = sh0VarM319z.f5768d;
        int i = sh0VarM319z.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            m4855n((b60) objArr[i2]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        fv0 fv0Var;
        s90 lifecycle;
        String canonicalName;
        Object obj;
        String strM3053m;
        super.onAttachedToWindow();
        this.f6983v.onViewAttachedToWindow(this);
        int i = 0;
        if (f6909N0 == null) {
            RunnableC0269h3 runnableC0269h3 = new RunnableC0269h3(i);
            f6909N0 = runnableC0269h3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            try {
                if (f6906K0 == null) {
                    f6906K0 = Class.forName("android.os.SystemProperties");
                }
                if (f6907L0 == null) {
                    StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                    Class cls = f6906K0;
                    f6907L0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                }
                Method method = f6907L0;
                if (method != null) {
                    method.invoke(null, runnableC0269h3);
                }
            } catch (Throwable unused) {
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
        dh0 dh0Var = f6908M0;
        synchronized (dh0Var) {
            dh0Var.m697a(this);
        }
        this.f6977s.f2490a.setValue(Boolean.valueOf(hasWindowFocus()));
        this.f6977s.getClass();
        this.f6977s.getClass();
        m4855n(getRoot());
        m4842m(getRoot());
        getSnapshotObserver().f1778a.m778c();
        C0948y2 c0948y2 = this.f6933M;
        if (c0948y2 != null) {
            C0347j9 c0347j9 = C0347j9.f2773a;
            c0347j9.getClass();
            ((AutofillManager) c0948y2.f7493f).registerCallback(c0347j9);
        }
        x90 x90VarM1663m = j50.m1663m(this);
        nx0 nx0VarM4269j = u50.m4269j(this);
        wc1 wc1VarM4404i = v50.m4404i(this);
        aa0 aa0Var = this.f6955h;
        if (x90VarM1663m == null || wc1VarM4404i == null || aa0Var == null) {
            fv0Var = null;
        } else {
            vc1 viewModelStore = wc1VarM4404i.getViewModelStore();
            uc1 uc1Var = new uc1();
            C0133dl c0133dl = C0133dl.f1150b;
            viewModelStore.getClass();
            c0133dl.getClass();
            C0948y2 c0948y22 = new C0948y2(viewModelStore, uc1Var, c0133dl);
            C0352je c0352jeM211a = au0.m211a(ca0.class);
            Map map = C0352je.f2803e;
            Class cls2 = c0352jeM211a.f2804d;
            cls2.getClass();
            if (cls2.isAnonymousClass() || cls2.isLocalClass()) {
                canonicalName = null;
            } else if (cls2.isArray()) {
                Class<?> componentType = cls2.getComponentType();
                canonicalName = (!componentType.isPrimitive() || (strM3053m = pf1.m3053m(componentType.getName())) == null) ? null : strM3053m.concat("Array");
                if (canonicalName == null) {
                    canonicalName = "kotlin.Array";
                }
            } else {
                String strM3053m2 = pf1.m3053m(cls2.getName());
                canonicalName = strM3053m2 == null ? cls2.getCanonicalName() : strM3053m2;
            }
            if (canonicalName == null) {
                C0921xc.m5131l("Local and anonymous classes can not be ViewModels");
                return;
            }
            ca0 ca0Var = (ca0) c0948y22.m5208l(c0352jeM211a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            ug0 ug0Var = ca0Var.f771b;
            Object objM4248b = ug0Var.m4248b(id);
            if (objM4248b == null) {
                objM4248b = new dh0(1);
                ug0Var.m4330i(id, objM4248b);
            }
            dh0 dh0Var2 = (dh0) objM4248b;
            Object[] objArr = dh0Var2.f1108a;
            int i2 = dh0Var2.f1109b;
            while (true) {
                if (i >= i2) {
                    obj = null;
                    break;
                }
                obj = objArr[i];
                if (!((ba0) obj).f480c) {
                    break;
                } else {
                    i++;
                }
            }
            ba0 ba0Var = (ba0) obj;
            if (ba0Var == null) {
                ba0Var = new ba0();
                dh0Var2.m697a(ba0Var);
            }
            ba0Var.f480c = true;
            this.f6957i = ba0Var;
            fv0Var = ba0Var.f479b;
        }
        if (fv0Var == null) {
            fv0Var = C0496n2.f4127G;
        }
        this.f6959j = fv0Var;
        C0378k3 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (x90VarM1663m != null && nx0VarM4269j != null && (x90VarM1663m != viewTreeOwners.f2997a || nx0VarM4269j != viewTreeOwners.f2998b || wc1VarM4404i != viewTreeOwners.f2999c))) {
            if (x90VarM1663m == null) {
                C0921xc.m5134o("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                return;
            }
            if (nx0VarM4269j == null) {
                C0921xc.m5134o("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                return;
            }
            if (viewTreeOwners != null && (lifecycle = viewTreeOwners.f2997a.getLifecycle()) != null) {
                lifecycle.mo4015b(this);
            }
            x90VarM1663m.getLifecycle().mo4014a(this);
            C0378k3 c0378k3 = new C0378k3(x90VarM1663m, nx0VarM4269j, wc1VarM4404i);
            set_viewTreeOwners(c0378k3);
            InterfaceC0742sw interfaceC0742sw = this.f6958i0;
            if (interfaceC0742sw != null) {
                interfaceC0742sw.invoke(c0378k3);
            }
            this.f6958i0 = null;
        }
        this.f6976r0.f2129a.setValue(new f20(isInTouchMode() ? 1 : 2));
        C0378k3 viewTreeOwners2 = getViewTreeOwners();
        s90 lifecycle2 = viewTreeOwners2 != null ? viewTreeOwners2.f2997a.getLifecycle() : null;
        if (lifecycle2 == null) {
            throw AbstractC0748t1.m4149g("No lifecycle owner exists");
        }
        lifecycle2.mo4014a(this);
        lifecycle2.mo4014a(this.f6915C);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            C0233g4.f1853a.m1199b(this);
        }
        C0004a3 c0004a3 = this.f6934N;
        if (c0004a3 != null) {
            ((C1017zu) getFocusOwner()).f8002g.m697a(c0004a3);
            getSemanticsOwner().f5d.m697a(c0004a3);
        }
        ((C1017zu) getFocusOwner()).f8002g.m697a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        if (this.f6964l0.get() == null) {
            this.f6960j0.getClass();
            return false;
        }
        C0921xc.m5123d();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m4850G(configuration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.f6964l0.get() == null) {
            this.f6960j0.getClass();
            return null;
        }
        C0921xc.m5123d();
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        xz0 xz0Var;
        ViewOnAttachStateChangeListenerC0827v4 viewOnAttachStateChangeListenerC0827v4 = this.f6915C;
        viewOnAttachStateChangeListenerC0827v4.getClass();
        for (long j : jArr) {
            zz0 zz0Var = (zz0) viewOnAttachStateChangeListenerC0827v4.m4390h().m4248b((int) j);
            if (zz0Var != null && (xz0Var = zz0Var.f8062a) != null) {
                AbstractC0195f3.m1021s();
                ViewTranslationRequest.Builder builderM1017o = AbstractC0195f3.m1017o(viewOnAttachStateChangeListenerC0827v4.f6394d.getAutofillId(), xz0Var.f7474g);
                Object objM1701g = xz0Var.f7471d.f5877d.m1701g(b01.f308A);
                if (objM1701g == null) {
                    objM1701g = null;
                }
                List list = (List) objM1701g;
                if (list != null) {
                    builderM1017o.setValue("android:text", TranslationRequestValue.forText(new C0200f8(ya0.m5226a(list, "\n", null, 62))));
                    consumer.accept(builderM1017o.build());
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6983v.onViewDetachedFromWindow(this);
        if (this.f6969o) {
            View view = this.f6967n;
            if (view == null) {
                p30.m2986V("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        dh0 dh0Var = f6908M0;
        synchronized (dh0Var) {
            dh0Var.m706j(this);
        }
        fn0 snapshotObserver = getSnapshotObserver();
        yk0 yk0Var = snapshotObserver.f1778a.f1291h;
        if (yk0Var != null) {
            yk0Var.m5286a();
        }
        e31 e31Var = snapshotObserver.f1778a;
        synchronized (e31Var.f1290g) {
            sh0 sh0Var = e31Var.f1289f;
            Object[] objArr = sh0Var.f5768d;
            int i = sh0Var.f5770f;
            for (int i2 = 0; i2 < i; i2++) {
                d31 d31Var = (d31) objArr[i2];
                d31Var.f958e.m1695a();
                d31Var.f959f.m1695a();
                d31Var.f965l.m1695a();
                d31Var.f966m.clear();
            }
        }
        this.f6977s.getClass();
        C0378k3 viewTreeOwners = getViewTreeOwners();
        s90 lifecycle = viewTreeOwners != null ? viewTreeOwners.f2997a.getLifecycle() : null;
        if (lifecycle == null) {
            throw AbstractC0748t1.m4149g("No lifecycle owner exists");
        }
        lifecycle.mo4015b(this.f6915C);
        lifecycle.mo4015b(this);
        C0948y2 c0948y2 = this.f6933M;
        if (c0948y2 != null) {
            C0347j9 c0347j9 = C0347j9.f2773a;
            c0347j9.getClass();
            ((AutofillManager) c0948y2.f7493f).unregisterCallback(c0347j9);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        ba0 ba0Var = this.f6957i;
        if (ba0Var != null) {
            ba0Var.f480c = false;
        }
        this.f6957i = null;
        if (Build.VERSION.SDK_INT >= 31) {
            C0233g4.f1853a.m1198a(this);
        }
        C0004a3 c0004a3 = this.f6934N;
        if (c0004a3 != null) {
            getSemanticsOwner().f5d.m706j(c0004a3);
            ((C1017zu) getFocusOwner()).f8002g.m706j(c0004a3);
        }
        ut0 rectManager = getRectManager();
        RunnableC0824v1 runnableC0824v1 = rectManager.f6303g;
        if (runnableC0824v1 != null) {
            AbstractC0873w1.f6892a.removeCallbacks(runnableC0824v1);
            rectManager.f6303g = null;
        }
        ((C1017zu) getFocusOwner()).f8002g.m706j(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        C1017zu c1017zu = (C1017zu) getFocusOwner();
        pf1.m3054n(c1017zu.f7998c, true);
        if (c1017zu.m5612f() != null) {
            C0149dv c0149dvM5612f = c1017zu.m5612f();
            c1017zu.m5614h(null);
            if (c0149dvM5612f != null) {
                c0149dvM5612f.m732x0(EnumC0106cv.f893d, EnumC0106cv.f895f);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f6948d0 = 0L;
        m4851H();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        m4850G(getResources().getConfiguration());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f6948d0 = 0L;
        this.f6942V.m4308j(this.f6920E0);
        this.f6940T = null;
        m4851H();
        if (this.f6939S != null) {
            getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ud0 ud0Var = this.f6942V;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m4855n(getRoot());
            }
            long jM4841j = m4841j(i);
            long jM4841j2 = m4841j(i2);
            long jM2774n = o30.m2774n((int) (jM4841j >>> 32), (int) (jM4841j & 4294967295L), (int) (jM4841j2 >>> 32), (int) (4294967295L & jM4841j2));
            C0617pj c0617pj = this.f6940T;
            if (c0617pj == null) {
                this.f6940T = new C0617pj(jM2774n);
                this.f6941U = false;
            } else if (!C0617pj.m3131b(c0617pj.f4912a, jM2774n)) {
                this.f6941U = true;
            }
            ud0Var.m4315q(jM2774n);
            ud0Var.m4310l();
            setMeasuredDimension(getRoot().f396J.f1607p.f7400d, getRoot().f396J.f1607p.f7401e);
            if (this.f6939S != null) {
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f396J.f1607p.f7400d, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f396J.f1607p.f7401e, 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure != null) {
            C0004a3 c0004a3 = this.f6934N;
            if (c0004a3 != null) {
                b60 b60Var = c0004a3.f31e.f2a;
                AutofillId autofillId = c0004a3.f35i;
                String str = c0004a3.f34h;
                ut0 ut0Var = c0004a3.f33g;
                u50.m4279v(viewStructure, b60Var, autofillId, str, ut0Var);
                Object[] objArr = kk0.f3182a;
                dh0 dh0Var = new dh0(2);
                dh0Var.m697a(b60Var);
                dh0Var.m697a(viewStructure);
                while (dh0Var.m705i()) {
                    Object objM707k = dh0Var.m707k(dh0Var.f1109b - 1);
                    objM707k.getClass();
                    ViewStructure viewStructure2 = (ViewStructure) objM707k;
                    Object objM707k2 = dh0Var.m707k(dh0Var.f1109b - 1);
                    objM707k2.getClass();
                    ph0 ph0Var = (ph0) ((b60) objM707k2).m307n();
                    int i2 = ph0Var.f4858d.f5770f;
                    for (int i3 = 0; i3 < i2; i3++) {
                        b60 b60Var2 = (b60) ph0Var.get(i3);
                        if (!b60Var2.f404R && b60Var2.m272H() && b60Var2.m273I()) {
                            sz0 sz0VarM317x = b60Var2.m317x();
                            if (sz0VarM317x != null) {
                                jh0 jh0Var = sz0VarM317x.f5877d;
                                if (jh0Var.m1696b(rz0.f5594g) || jh0Var.m1696b(rz0.f5595h) || jh0Var.m1696b(b01.f338q) || jh0Var.m1696b(b01.f339r)) {
                                    ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    u50.m4279v(viewStructureNewChild, b60Var2, autofillId, str, ut0Var);
                                    dh0Var.m697a(b60Var2);
                                    dh0Var.m697a(viewStructureNewChild);
                                } else {
                                    dh0Var.m697a(b60Var2);
                                    dh0Var.m697a(viewStructure2);
                                }
                            }
                        }
                    }
                }
            }
            C0948y2 c0948y2 = this.f6933M;
            if (c0948y2 != null) {
                C0423l9 c0423l9 = (C0423l9) c0948y2.f7492e;
                LinkedHashMap linkedHashMap = c0423l9.f3391a;
                LinkedHashMap linkedHashMap2 = c0423l9.f3391a;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    if (entry.getValue() != null) {
                        C0921xc.m5123d();
                        return;
                    }
                    ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                    viewStructureNewChild2.setAutofillId((AutofillId) c0948y2.f7494g, iIntValue);
                    viewStructureNewChild2.setId(iIntValue, ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) c0948y2.f7491d).getContext().getPackageName(), null, null);
                    viewStructureNewChild2.setAutofillType(1);
                    throw null;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        int toolType = motionEvent.getToolType(i);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.f6949e) {
            int[] iArr = AbstractC0779tu.f6044a;
            k50 k50Var = k50.f3015d;
            k50 k50Var2 = i != 0 ? i != 1 ? null : k50.f3016e : k50Var;
            if (k50Var2 != null) {
                k50Var = k50Var2;
            }
            setLayoutDirection(k50Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        i90 i90Var;
        if (Build.VERSION.SDK_INT < 31 || (i90Var = this.f6926H0) == null) {
            return;
        }
        a01 semanticsOwner = getSemanticsOwner();
        InterfaceC0618pk coroutineContext = getCoroutineContext();
        sh0 sh0Var = new sh0(new jy0[16]);
        v50.m4416v(semanticsOwner.m2a(), 0, new iy0(1, 8, sh0.class, sh0Var, "add", "add(Ljava/lang/Object;)Z"));
        Arrays.sort(sh0Var.f5768d, 0, sh0Var.f5770f, new C0511ng(0, new InterfaceC0742sw[]{C0601p3.f4708F, C0601p3.f4709G}));
        int i = sh0Var.f5770f;
        jy0 jy0Var = (jy0) (i == 0 ? null : sh0Var.f5768d[i - 1]);
        if (jy0Var == null) {
            return;
        }
        a30 a30Var = jy0Var.f2958c;
        ScrollCaptureCallbackC0019ai scrollCaptureCallbackC0019ai = new ScrollCaptureCallbackC0019ai(jy0Var.f2956a, a30Var, p30.m2995e(coroutineContext), i90Var, this);
        qj0 qj0Var = jy0Var.f2959d;
        st0 st0VarMo341B = j50.m1662l(qj0Var).mo341B(qj0Var, true);
        long j = (((long) a30Var.f39a) << 32) | (((long) a30Var.f40b) & 4294967295L);
        ScrollCaptureTarget scrollCaptureTargetM1013k = AbstractC0195f3.m1013k(this, u50.m4258B(AbstractC0398kl.m1939y(st0VarMo341B)), new Point((int) (j >> 32), (int) (j & 4294967295L)), scrollCaptureCallbackC0019ai);
        scrollCaptureTargetM1013k.setScrollBounds(u50.m4258B(a30Var));
        consumer.accept(scrollCaptureTargetM1013k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m4851H();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this.f6976r0.f2129a.setValue(new f20(z ? 1 : 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC0827v4 viewOnAttachStateChangeListenerC0827v4 = this.f6915C;
        viewOnAttachStateChangeListenerC0827v4.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (p30.m3002l(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            s91.m4057v(viewOnAttachStateChangeListenerC0827v4, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC0827v4.f6394d.post(new RunnableC0751t4(0, viewOnAttachStateChangeListenerC0827v4, longSparseArray));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        this.f6977s.f2490a.setValue(Boolean.valueOf(z));
        this.f6924G0 = true;
        super.onWindowFocusChanged(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final boolean m4856p(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final boolean m4857q(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f6982u0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final long m4858r(long j) {
        m4866z();
        long jM3417s = r60.m3417s(this.f6945b0, j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f6952f0 >> 32)) + Float.intBitsToFloat((int) (jM3417s >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f6952f0 & 4294967295L)) + Float.intBitsToFloat((int) (jM3417s & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2 = 1;
        if (!isFocused()) {
            C0665qu c0665quM4226b = AbstractC0779tu.m4226b(i);
            int i3 = c0665quM4226b != null ? c0665quM4226b.f5222a : 7;
            Boolean boolM5611e = ((C1017zu) getFocusOwner()).m5611e(i3, rect != null ? new st0(rect.left, rect.top, rect.right, rect.bottom) : null, new C0712s3(i3, 0));
            Boolean bool = Boolean.TRUE;
            if (!p30.m3002l(boolM5611e, bool)) {
                if (!p30.m3002l(((C1017zu) getFocusOwner()).m5611e(i3, null, new C0712s3(i3, i2)), bool)) {
                    if (hasFocus() && (i3 == 1 || i3 == 2)) {
                        return ((C1017zu) getFocusOwner()).m5613g(i3);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m4859s(boolean z) {
        C0750t3 c0750t3;
        ud0 ud0Var = this.f6942V;
        if (ud0Var.f6194b.m2805j() || ((sh0) ud0Var.f6197e.f919e).f5770f != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    c0750t3 = this.f6920E0;
                } finally {
                    Trace.endSection();
                }
            } else {
                c0750t3 = null;
            }
            if (ud0Var.m4308j(c0750t3)) {
                requestLayout();
            }
            ud0Var.m4303a(false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.f6913B.f673k = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setConfiguration(Configuration configuration) {
        this.f6932L.setValue(configuration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setContentCaptureManager$ui(ViewOnAttachStateChangeListenerC0827v4 viewOnAttachStateChangeListenerC0827v4) {
        this.f6915C = viewOnAttachStateChangeListenerC0827v4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x008d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x009c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:64:0x0055 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x0055 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:69:0x0096 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [oe0] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [oe0] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [sh0] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public void setCoroutineContext(InterfaceC0618pk interfaceC0618pk) {
        this.f6973q = interfaceC0618pk;
        oe0 oe0Var = getRoot().f395I.f3998f;
        if (oe0Var instanceof s51) {
            ((s51) oe0Var).m4007x0();
        }
        if (!oe0Var.f4529d.f4542q) {
            w10.m4824b("visitSubtreeIf called on an unattached node");
        }
        sh0 sh0Var = new sh0(new oe0[16]);
        oe0 oe0Var2 = oe0Var.f4529d;
        oe0 oe0Var3 = oe0Var2.f4534i;
        if (oe0Var3 == null) {
            pf1.m3049e(sh0Var, oe0Var2);
        } else {
            sh0Var.m4072b(oe0Var3);
        }
        while (true) {
            int i = sh0Var.f5770f;
            if (i == 0) {
                return;
            }
            oe0 oe0Var4 = (oe0) sh0Var.m4081k(i - 1);
            if ((oe0Var4.f4532g & 16) != 0) {
                for (oe0 oe0Var5 = oe0Var4; oe0Var5 != null && oe0Var5.f4542q; oe0Var5 = oe0Var5.f4534i) {
                    if ((oe0Var5.f4531f & 16) != 0) {
                        ?? M3050f = oe0Var5;
                        ?? sh0Var2 = 0;
                        while (M3050f != 0) {
                            if (M3050f instanceof qr0) {
                                qr0 qr0Var = (qr0) M3050f;
                                if (qr0Var instanceof s51) {
                                    ((s51) qr0Var).m4007x0();
                                }
                            } else if ((M3050f.f4531f & 16) != 0 && (M3050f instanceof AbstractC0731sm)) {
                                oe0 oe0Var6 = ((AbstractC0731sm) M3050f).f5782s;
                                int i2 = 0;
                                M3050f = M3050f;
                                sh0Var2 = sh0Var2;
                                while (oe0Var6 != null) {
                                    if ((oe0Var6.f4531f & 16) != 0) {
                                        i2++;
                                        sh0Var2 = sh0Var2;
                                        if (i2 == 1) {
                                            M3050f = oe0Var6;
                                        } else {
                                            if (sh0Var2 == 0) {
                                                sh0Var2 = new sh0(new oe0[16]);
                                            }
                                            if (M3050f != 0) {
                                                sh0Var2.m4072b(M3050f);
                                                M3050f = 0;
                                            }
                                            sh0Var2.m4072b(oe0Var6);
                                        }
                                    }
                                    oe0Var6 = oe0Var6.f4534i;
                                    M3050f = M3050f;
                                    sh0Var2 = sh0Var2;
                                }
                                if (i2 == 1) {
                                }
                            }
                            M3050f = pf1.m3050f(sh0Var2);
                        }
                    }
                }
            }
            pf1.m3049e(sh0Var, oe0Var4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setFrameEndScheduler$ui(aa0 aa0Var) {
        this.f6955h = aa0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.f6948d0 = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnViewTreeOwnersAvailable(InterfaceC0742sw interfaceC0742sw) {
        C0378k3 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            interfaceC0742sw.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f6958i0 = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m5741setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(g10 g10Var) {
        this.f6951f = g10Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setUncaughtExceptionHandler(yv0 yv0Var) {
        this.f6942V.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m4860t(b60 b60Var, long j) {
        ud0 ud0Var = this.f6942V;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            ud0Var.m4309k(b60Var, j);
            if (!ud0Var.f6194b.m2805j()) {
                ud0Var.m4303a(false);
            }
            getRectManager().m4348a();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a8, code lost:
    
        r4.m708l(0, r0);
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4861u() {
        dh0 dh0Var;
        Object[] objArr;
        if (this.f6935O) {
            e31 e31Var = getSnapshotObserver().f1778a;
            synchronized (e31Var.f1290g) {
                try {
                    sh0 sh0Var = e31Var.f1289f;
                    int i = sh0Var.f5770f;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = sh0Var.f5768d;
                        if (i2 >= i) {
                            break;
                        }
                        d31 d31Var = (d31) objArr[i2];
                        d31Var.m632c();
                        if (!d31Var.f959f.m1704j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = sh0Var.f5768d;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    sh0Var.f5770f = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f6935O = false;
        }
        C0878w6 c0878w6 = this.f6939S;
        if (c0878w6 != null) {
            m4840i(c0878w6);
        }
        C0004a3 c0004a3 = this.f6934N;
        if (c0004a3 != null) {
            vg0 vg0Var = c0004a3.f36j;
            if (vg0Var.f6716d == 0 && c0004a3.f37k) {
                ((AutofillManager) c0004a3.f30d.f7232e).commit();
                c0004a3.f37k = false;
            }
            if (vg0Var.f6716d != 0) {
                c0004a3.f37k = true;
            }
        }
        loop1: while (this.f6988x0.m705i() && this.f6988x0.m702f(0) != null) {
            int i5 = this.f6988x0.f1109b;
            int i6 = 0;
            while (true) {
                dh0 dh0Var2 = this.f6988x0;
                if (i6 < i5) {
                    InterfaceC0298hw interfaceC0298hw = (InterfaceC0298hw) dh0Var2.m702f(i6);
                    dh0Var = this.f6988x0;
                    if (i6 < 0 || i6 >= dh0Var.f1109b) {
                        break loop1;
                    }
                    Object[] objArr3 = dh0Var.f1108a;
                    Object obj = objArr3[i6];
                    objArr3[i6] = null;
                    if (interfaceC0298hw != null) {
                        interfaceC0298hw.invoke();
                    }
                    i6++;
                }
            }
            dh0Var.m710n(i6);
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m4862v(b60 b60Var) {
        ViewOnAttachStateChangeListenerC0078c4 viewOnAttachStateChangeListenerC0078c4 = this.f6913B;
        viewOnAttachStateChangeListenerC0078c4.f653B = true;
        if (viewOnAttachStateChangeListenerC0078c4.m469n()) {
            viewOnAttachStateChangeListenerC0078c4.m470o(b60Var);
        }
        ViewOnAttachStateChangeListenerC0827v4 viewOnAttachStateChangeListenerC0827v4 = this.f6915C;
        viewOnAttachStateChangeListenerC0827v4.f6400j = true;
        if (viewOnAttachStateChangeListenerC0827v4.m4391i()) {
            viewOnAttachStateChangeListenerC0827v4.f6401k.mo1710s(na1.f4229a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m4863w(b60 b60Var, boolean z, boolean z2, boolean z3) {
        b60 b60VarM315v;
        b60 b60VarM315v2;
        ud0 ud0Var = this.f6942V;
        if (!z) {
            if (ud0Var.m4314p(b60Var, z2) && z3) {
                m4846C(b60Var);
                return;
            }
            return;
        }
        C0541o8 c0541o8 = ud0Var.f6194b;
        b60 b60Var2 = b60Var.f413l;
        f60 f60Var = b60Var.f396J;
        if (b60Var2 == null) {
            w10.m4824b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = f60Var.f1595d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    C0921xc.m5129j();
                    return;
                }
                if (!f60Var.f1596e || z2) {
                    f60Var.f1596e = true;
                    f60Var.f1607p.f7109w = true;
                    if (b60Var.f404R) {
                        return;
                    }
                    if ((p30.m3002l(b60Var.m274J(), Boolean.TRUE) || ud0.m4301h(b60Var)) && ((b60VarM315v = b60Var.m315v()) == null || !b60VarM315v.f396J.f1596e)) {
                        c0541o8.m2797a(b60Var, w30.f6993d);
                    } else if ((b60Var.m273I() || ud0.m4302i(b60Var)) && ((b60VarM315v2 = b60Var.m315v()) == null || !b60VarM315v2.m311r())) {
                        c0541o8.m2797a(b60Var, w30.f6995f);
                    }
                    if (ud0Var.f6196d || !z3) {
                        return;
                    }
                    m4846C(b60Var);
                    return;
                }
                return;
            }
        }
        ud0Var.f6200h.m4072b(new td0(b60Var, true, z2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m4864x(b60 b60Var, boolean z, boolean z2) {
        f60 f60Var = b60Var.f396J;
        w30 w30Var = w30.f6996g;
        ud0 ud0Var = this.f6942V;
        if (!z) {
            ud0Var.getClass();
            int iOrdinal = f60Var.f1595d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                C0921xc.m5129j();
                return;
            }
            b60 b60VarM315v = b60Var.m315v();
            boolean z3 = b60VarM315v == null || b60VarM315v.m273I();
            if (!z2) {
                if (b60Var.m311r()) {
                    return;
                }
                if (b60Var.m309p() && b60Var.m273I() == z3 && b60Var.m273I() == f60Var.f1607p.f7108v) {
                    return;
                }
            }
            wd0 wd0Var = f60Var.f1607p;
            wd0Var.f7110x = true;
            wd0Var.f7111y = true;
            if (!b60Var.f404R && wd0Var.f7108v && z3) {
                if ((b60VarM315v == null || !b60VarM315v.m309p()) && (b60VarM315v == null || !b60VarM315v.m311r())) {
                    ud0Var.f6194b.m2797a(b60Var, w30Var);
                }
                if (ud0Var.f6196d) {
                    return;
                }
                m4846C(null);
                return;
            }
            return;
        }
        C0541o8 c0541o8 = ud0Var.f6194b;
        int iOrdinal2 = f60Var.f1595d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    C0921xc.m5129j();
                    return;
                }
            }
        }
        if ((f60Var.f1596e || f60Var.f1597f) && !z2) {
            return;
        }
        f60Var.f1597f = true;
        f60Var.f1598g = true;
        wd0 wd0Var2 = f60Var.f1607p;
        wd0Var2.f7110x = true;
        wd0Var2.f7111y = true;
        if (b60Var.f404R) {
            return;
        }
        b60 b60VarM315v2 = b60Var.m315v();
        if (p30.m3002l(b60Var.m274J(), Boolean.TRUE) && ((b60VarM315v2 == null || !b60VarM315v2.f396J.f1596e) && (b60VarM315v2 == null || !b60VarM315v2.f396J.f1597f))) {
            c0541o8.m2797a(b60Var, w30.f6994e);
        } else if (b60Var.m273I() && ((b60VarM315v2 == null || !b60VarM315v2.m309p()) && (b60VarM315v2 == null || !b60VarM315v2.m311r()))) {
            c0541o8.m2797a(b60Var, w30Var);
        }
        if (ud0Var.f6196d) {
            return;
        }
        m4846C(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final void m4865y() {
        ViewOnAttachStateChangeListenerC0078c4 viewOnAttachStateChangeListenerC0078c4 = this.f6913B;
        viewOnAttachStateChangeListenerC0078c4.f653B = true;
        if (viewOnAttachStateChangeListenerC0078c4.m469n() && !viewOnAttachStateChangeListenerC0078c4.f664M) {
            viewOnAttachStateChangeListenerC0078c4.f664M = true;
            viewOnAttachStateChangeListenerC0078c4.f675m.post(viewOnAttachStateChangeListenerC0078c4.f666O);
        }
        ViewOnAttachStateChangeListenerC0827v4 viewOnAttachStateChangeListenerC0827v4 = this.f6915C;
        viewOnAttachStateChangeListenerC0827v4.f6400j = true;
        if (!viewOnAttachStateChangeListenerC0827v4.m4391i() || viewOnAttachStateChangeListenerC0827v4.f6407q) {
            return;
        }
        viewOnAttachStateChangeListenerC0827v4.f6407q = true;
        viewOnAttachStateChangeListenerC0827v4.f6402l.post(viewOnAttachStateChangeListenerC0827v4.f6408r);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final void m4866z() {
        if (this.f6950e0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f6948d0) {
            this.f6948d0 = jCurrentAnimationTimeMillis;
            C0546oc c0546oc = this.f6922F0;
            float[] fArr = this.f6945b0;
            c0546oc.m2873a(this, fArr);
            s91.m4017B(fArr, this.f6946c0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f6944a0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f6952f0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: getAccessibilityManager()Lx0; */
    /* JADX INFO: renamed from: getAccessibilityManager, reason: merged with bridge method [inline-methods] */
    public C0874w2 m5742getAccessibilityManager() {
        return this.f6917D;
    }

    /* JADX DEBUG: Method merged with bridge method: getClipboard()Lse; */
    /* JADX INFO: renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public C0115d3 m5743getClipboard() {
        return this.f6937Q;
    }

    /* JADX DEBUG: Method merged with bridge method: getClipboardManager()Lte; */
    /* JADX INFO: renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public C0158e3 m5744getClipboardManager() {
        return this.f6936P;
    }

    /* JADX DEBUG: Method merged with bridge method: getDragAndDropManager()Lqp; */
    /* JADX INFO: renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public ViewOnDragListenerC0197f5 m5745getDragAndDropManager() {
        return this.f6975r;
    }

    /* JADX DEBUG: Method merged with bridge method: getLayoutNodes()Lu20; */
    public ug0 getLayoutNodes() {
        return this.f6987x;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @InterfaceC0061bn
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m5739getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @InterfaceC0061bn
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void setShowLayoutBounds(boolean z) {
    }

    public final void setUncaughtExceptionHandler$ui(yv0 yv0Var) {
    }
}
