package p000;

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
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: b7 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0045b7 extends ViewGroup implements zv1, xa2, w50, rv1, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, xk0 {

    /* JADX INFO: renamed from: U0 */
    public static Class f620U0;

    /* JADX INFO: renamed from: V0 */
    public static Method f621V0;

    /* JADX INFO: renamed from: W0 */
    public static Method f622W0;

    /* JADX INFO: renamed from: X0 */
    public static final lk1 f623X0 = new lk1();

    /* JADX INFO: renamed from: Y0 */
    public static RunnableC0450m6 f624Y0;

    /* JADX INFO: renamed from: Z0 */
    public static Method f625Z0;

    /* JADX INFO: renamed from: A */
    public final C0956zb f626A;

    /* JADX INFO: renamed from: A0 */
    public final wz0 f627A0;

    /* JADX INFO: renamed from: B */
    public final b01 f628B;

    /* JADX INFO: renamed from: B0 */
    public final vh1 f629B0;

    /* JADX INFO: renamed from: C */
    public final r61 f630C;

    /* JADX INFO: renamed from: C0 */
    public final C0650rb f631C0;

    /* JADX INFO: renamed from: D */
    public final zj1 f632D;

    /* JADX INFO: renamed from: D0 */
    public MotionEvent f633D0;

    /* JADX INFO: renamed from: E */
    public final q62 f634E;

    /* JADX INFO: renamed from: E0 */
    public long f635E0;

    /* JADX INFO: renamed from: F */
    public final tn2 f636F;

    /* JADX INFO: renamed from: F0 */
    public final dq1 f637F0;

    /* JADX INFO: renamed from: G */
    public final ViewOnAttachStateChangeListenerC0267h7 f638G;

    /* JADX INFO: renamed from: G0 */
    public final lk1 f639G0;

    /* JADX INFO: renamed from: H */
    public ViewOnAttachStateChangeListenerC0837w7 f640H;

    /* JADX INFO: renamed from: H0 */
    public float f641H0;

    /* JADX INFO: renamed from: I */
    public final C0007a6 f642I;

    /* JADX INFO: renamed from: I0 */
    public float f643I0;

    /* JADX INFO: renamed from: J */
    public final C0083c9 f644J;

    /* JADX INFO: renamed from: J0 */
    public final RunnableC0910y4 f645J0;

    /* JADX INFO: renamed from: K */
    public final C0735ti f646K;

    /* JADX INFO: renamed from: K0 */
    public final RunnableC0376k6 f647K0;

    /* JADX INFO: renamed from: L */
    public final lk1 f648L;

    /* JADX INFO: renamed from: L0 */
    public boolean f649L0;

    /* JADX INFO: renamed from: M */
    public lk1 f650M;

    /* JADX INFO: renamed from: M0 */
    public final yy0 f651M0;

    /* JADX INFO: renamed from: N */
    public boolean f652N;

    /* JADX INFO: renamed from: N0 */
    public final C0683s6 f653N0;

    /* JADX INFO: renamed from: O */
    public boolean f654O;

    /* JADX INFO: renamed from: O0 */
    public final InterfaceC0741to f655O0;

    /* JADX INFO: renamed from: P */
    public final ii1 f656P;

    /* JADX INFO: renamed from: P0 */
    public boolean f657P0;

    /* JADX INFO: renamed from: Q */
    public final C0554os f658Q;

    /* JADX INFO: renamed from: Q0 */
    public boolean f659Q0;

    /* JADX INFO: renamed from: R */
    public final nx1 f660R;

    /* JADX INFO: renamed from: R0 */
    public final hh1 f661R0;

    /* JADX INFO: renamed from: S */
    public final n70 f662S;

    /* JADX INFO: renamed from: S0 */
    public View f663S0;

    /* JADX INFO: renamed from: T */
    public final kj1 f664T;

    /* JADX INFO: renamed from: T0 */
    public final C0873x6 f665T0;

    /* JADX INFO: renamed from: U */
    public final C0119d6 f666U;

    /* JADX INFO: renamed from: V */
    public boolean f667V;

    /* JADX INFO: renamed from: W */
    public final C0338j6 f668W;

    /* JADX INFO: renamed from: a0 */
    public final C0303i6 f669a0;

    /* JADX INFO: renamed from: b0 */
    public final bw1 f670b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f671c0;

    /* JADX INFO: renamed from: d0 */
    public C0493nc f672d0;

    /* JADX INFO: renamed from: e0 */
    public C0221fz f673e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f674f0;

    /* JADX INFO: renamed from: g0 */
    public final kf1 f675g0;

    /* JADX INFO: renamed from: h */
    public final nx1 f676h;

    /* JADX INFO: renamed from: h0 */
    public long f677h0;

    /* JADX INFO: renamed from: i */
    public long f678i;

    /* JADX INFO: renamed from: i0 */
    public final int[] f679i0;

    /* JADX INFO: renamed from: j */
    public final boolean f680j;

    /* JADX INFO: renamed from: j0 */
    public final float[] f681j0;

    /* JADX INFO: renamed from: k */
    public ny0 f682k;

    /* JADX INFO: renamed from: k0 */
    public final float[] f683k0;

    /* JADX INFO: renamed from: l */
    public final t61 f684l;

    /* JADX INFO: renamed from: l0 */
    public final float[] f685l0;

    /* JADX INFO: renamed from: m */
    public ma1 f686m;

    /* JADX INFO: renamed from: m0 */
    public long f687m0;

    /* JADX INFO: renamed from: n */
    public na1 f688n;

    /* JADX INFO: renamed from: n0 */
    public boolean f689n0;

    /* JADX INFO: renamed from: o */
    public z92 f690o;

    /* JADX INFO: renamed from: o0 */
    public long f691o0;

    /* JADX INFO: renamed from: p */
    public final C0017ag f692p;

    /* JADX INFO: renamed from: p0 */
    public final nx1 f693p0;

    /* JADX INFO: renamed from: q */
    public final RunnableC0376k6 f694q;

    /* JADX INFO: renamed from: q0 */
    public final n70 f695q0;

    /* JADX INFO: renamed from: r */
    public final nx1 f696r;

    /* JADX INFO: renamed from: r0 */
    public in0 f697r0;

    /* JADX INFO: renamed from: s */
    public final View f698s;

    /* JADX INFO: renamed from: s0 */
    public q03 f699s0;

    /* JADX INFO: renamed from: t */
    public final bl0 f700t;

    /* JADX INFO: renamed from: t0 */
    public o03 f701t0;

    /* JADX INFO: renamed from: u */
    public a20 f702u;

    /* JADX INFO: renamed from: u0 */
    public final AtomicReference f703u0;

    /* JADX INFO: renamed from: v */
    public final ViewOnDragListenerC0534o8 f704v;

    /* JADX INFO: renamed from: v0 */
    public v60 f705v0;

    /* JADX INFO: renamed from: w */
    public final k91 f706w;

    /* JADX INFO: renamed from: w0 */
    public final wl0 f707w0;

    /* JADX INFO: renamed from: x */
    public final nx1 f708x;

    /* JADX INFO: renamed from: x0 */
    public final xk1 f709x0;

    /* JADX INFO: renamed from: y */
    public final n70 f710y;

    /* JADX INFO: renamed from: y0 */
    public final nx1 f711y0;

    /* JADX INFO: renamed from: z */
    public final C0742tp f712z;

    /* JADX INFO: renamed from: z0 */
    public final bs0 f713z0;

    public ViewTreeObserverOnGlobalLayoutListenerC0045b7(Context context, C0440lx c0440lx) {
        super(context);
        this.f676h = op0.m3598u(c0440lx);
        this.f678i = 9205357640488583168L;
        int i = 1;
        this.f680j = true;
        this.f684l = c0440lx.f6365r;
        this.f690o = C0700sn.f10205I;
        this.f692p = new C0017ag();
        int i2 = 0;
        this.f694q = new RunnableC0376k6(this, i2);
        this.f696r = new nx1(AbstractC0691se.m4842m(context), C0700sn.f10212P);
        this.f700t = new bl0(this, this);
        this.f702u = c0440lx.f6349b.mo1384j();
        this.f704v = new ViewOnDragListenerC0534o8();
        this.f706w = new k91();
        this.f708x = op0.m3598u(Boolean.FALSE);
        this.f710y = op0.m3590m(new C0683s6(this, i2));
        this.f712z = c0440lx.f6367t;
        this.f626A = c0440lx.f6364q;
        this.f628B = new b01();
        int i3 = 3;
        r61 r61Var = new r61(3);
        r61Var.m4369c0(ya2.f13384c);
        r61Var.m4365Z(getDensity());
        r61Var.m4373e0(getViewConfiguration());
        r61Var.m4371d0(new C0951z6(this).mo4491c(((bl0) getFocusOwner()).f928e).mo4491c(getDragAndDropManager().f7578c));
        this.f630C = r61Var;
        zj1 zj1Var = y01.f13265a;
        this.f632D = new zj1();
        getLayoutNodes();
        this.f634E = new q62(this);
        this.f636F = new tn2(getRoot(), new de0(), getLayoutNodes());
        ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h7 = new ViewOnAttachStateChangeListenerC0267h7(this);
        this.f638G = viewOnAttachStateChangeListenerC0267h7;
        this.f640H = new ViewOnAttachStateChangeListenerC0837w7(this, new C0645r6(0, this, AbstractC0570p7.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0, 0));
        this.f642I = c0440lx.f6357j;
        this.f644J = new C0083c9(this);
        this.f646K = new C0735ti();
        this.f648L = new lk1();
        this.f656P = new ii1();
        r61 root = getRoot();
        C0554os c0554os = new C0554os();
        c0554os.f7821b = root;
        c0554os.f7822c = new us0((qz0) root.f9372M.f12033d);
        c0554os.f7823d = new hh1(5);
        c0554os.f7824e = new xs0();
        this.f658Q = c0554os;
        this.f660R = op0.m3598u(new Configuration(context.getResources().getConfiguration()));
        this.f662S = op0.m3590m(new C0683s6(this, i));
        this.f664T = new kj1(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw vi0.m5686e("Autofill service could not be located.");
        }
        this.f666U = new C0119d6(new hh1(i3, autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.f668W = c0440lx.f6359l;
        this.f669a0 = c0440lx.f6360m;
        this.f670b0 = new bw1(new C0836w6(this, i));
        this.f675g0 = new kf1(getRoot());
        this.f677h0 = 9223372034707292159L;
        this.f679i0 = new int[]{0, 0};
        float[] fArrM2155a = hf1.m2155a();
        this.f681j0 = fArrM2155a;
        this.f683k0 = hf1.m2155a();
        this.f685l0 = hf1.m2155a();
        this.f687m0 = -1L;
        this.f691o0 = 9187343241974906880L;
        this.f693p0 = op0.m3598u(null);
        this.f695q0 = op0.m3590m(new C0683s6(this, i3));
        this.f703u0 = new AtomicReference(null);
        this.f707w0 = c0440lx.f6361n;
        this.f709x0 = c0440lx.f6362o;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = vk0.f12001a;
        d61 d61Var = d61.f1885h;
        d61 d61Var2 = layoutDirection != 0 ? layoutDirection != 1 ? null : d61.f1886i : d61Var;
        this.f711y0 = op0.m3598u(d61Var2 != null ? d61Var2 : d61Var);
        this.f713z0 = c0440lx.f6363p;
        int i4 = 2;
        this.f627A0 = new wz0(isInTouchMode() ? 1 : 2);
        vh1 vh1Var = new vh1();
        new zk1(new C0545oj[16]);
        new zk1(new op0[16]);
        new zk1(new r61[16]);
        new zk1(new op0[16]);
        this.f629B0 = vh1Var;
        C0650rb c0650rb = new C0650rb();
        new jx2(new C0159ea(i, c0650rb));
        this.f631C0 = c0650rb;
        this.f637F0 = new dq1(20);
        this.f639G0 = new lk1();
        this.f645J0 = new RunnableC0910y4(i4, this);
        this.f647K0 = new RunnableC0376k6(this, i);
        this.f651M0 = new yy0(context, new C0836w6(this, i2));
        this.f653N0 = new C0683s6(this, i4);
        int i5 = Build.VERSION.SDK_INT;
        this.f655O0 = i5 < 29 ? new C0780uo(fArrM2155a) : new C0817vo();
        addOnAttachStateChangeListener(this.f640H);
        setWillNotDraw(false);
        setFocusable(true);
        C0531o7.f7570a.m3522a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        wa3.m5862a(this, viewOnAttachStateChangeListenerC0267h7);
        setOnDragListener(getDragAndDropManager());
        getRoot().m4370d(this);
        if (i5 >= 29) {
            C0339j7.f4907a.m2466a(this);
        }
        if (m452p()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.f698s = view;
            addView(view, -1);
        }
        this.f661R0 = i5 >= 31 ? new hh1(10) : null;
        this.f665T0 = new C0873x6(this);
    }

    /* JADX INFO: renamed from: d */
    public static final void m445d(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iM6155d;
        ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h7 = viewTreeObserverOnGlobalLayoutListenerC0045b7.f638G;
        if (t11.m5086l(str, viewOnAttachStateChangeListenerC0267h7.f3854K)) {
            int iM6155d2 = viewOnAttachStateChangeListenerC0267h7.f3852I.m6155d(i);
            if (iM6155d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM6155d2);
                return;
            }
            return;
        }
        if (!t11.m5086l(str, viewOnAttachStateChangeListenerC0267h7.f3855L) || (iM6155d = viewOnAttachStateChangeListenerC0267h7.f3853J.m6155d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iM6155d);
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.f710y.getValue()).booleanValue();
    }

    private final q03 getLegacyTextInputServiceAndroid() {
        q03 q03Var = this.f699s0;
        if (q03Var != null) {
            return q03Var;
        }
        q03 q03Var2 = new q03(getView(), this);
        this.f699s0 = q03Var2;
        return q03Var2;
    }

    private final C0440lx get_composeViewContext() {
        return (C0440lx) this.f676h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC0569p6 get_viewTreeOwners() {
        vi0.m5701t(this.f693p0.getValue());
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static void m448i(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0045b7) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) childAt).m481y();
            } else if (childAt instanceof ViewGroup) {
                m448i((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static long m449j(int i) {
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

    /* JADX INFO: renamed from: k */
    public static View m450k(View view, int i) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (t11.m5086l(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewM450k = m450k(viewGroup.getChildAt(i2), i);
                    if (viewM450k != null) {
                        return viewM450k;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static void m451n(r61 r61Var) {
        r61Var.m4346D();
        zk1 zk1VarM4393y = r61Var.m4393y();
        Object[] objArr = zk1VarM4393y.f13934h;
        int i = zk1VarM4393y.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            m451n((r61) objArr[i2]);
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m452p() {
        return Build.VERSION.SDK_INT >= 35;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m453q(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !ji1.f5051a.m2502a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        this.f708x.setValue(Boolean.valueOf(z));
    }

    private void setDensity(e70 e70Var) {
        this.f696r.setValue(e70Var);
    }

    private void setFontFamilyResolver(xl0 xl0Var) {
        this.f709x0.setValue(xl0Var);
    }

    private void setLayoutDirection(d61 d61Var) {
        this.f711y0.setValue(d61Var);
    }

    private final void set_composeViewContext(C0440lx c0440lx) {
        this.f676h.setValue(c0440lx);
    }

    private final void set_viewTreeOwners(AbstractC0569p6 abstractC0569p6) {
        this.f693p0.setValue(abstractC0569p6);
    }

    /* JADX INFO: renamed from: A */
    public final void m454A(r61 r61Var, boolean z, boolean z2, boolean z3) {
        r61 r61VarM4389u;
        r61 r61VarM4389u2;
        kf1 kf1Var = this.f675g0;
        if (!z) {
            if (kf1Var.m2664r(r61Var, z2) && z3) {
                m460G(r61Var);
                return;
            }
            return;
        }
        C0043b5 c0043b5 = kf1Var.f5491b;
        r61 r61Var2 = r61Var.f9391o;
        v61 v61Var = r61Var.f9373N;
        if (r61Var2 == null) {
            kz0.m2764b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = v61Var.f11783d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    c80.m675s();
                    return;
                }
                if (!v61Var.f11784e || z2) {
                    v61Var.f11784e = true;
                    v61Var.f11795p.f6601A = true;
                    if (r61Var.f9383X) {
                        return;
                    }
                    if ((t11.m5086l(r61Var.m4352J(), Boolean.TRUE) || kf1.m2650i(r61Var)) && ((r61VarM4389u = r61Var.m4389u()) == null || !r61VarM4389u.f9373N.f11784e)) {
                        c0043b5.m423j(r61Var, a21.f36h);
                    } else if ((r61Var.m4351I() || kf1.m2651j(r61Var)) && ((r61VarM4389u2 = r61Var.m4389u()) == null || !r61VarM4389u2.m4385q())) {
                        c0043b5.m423j(r61Var, a21.f38j);
                    }
                    if (kf1Var.f5493d || !z3) {
                        return;
                    }
                    m460G(r61Var);
                    return;
                }
                return;
            }
        }
        kf1Var.f5497h.m6423b(new jf1(r61Var, true, z2));
    }

    /* JADX INFO: renamed from: B */
    public final void m455B(r61 r61Var, boolean z, boolean z2) {
        v61 v61Var = r61Var.f9373N;
        a21 a21Var = a21.f39k;
        kf1 kf1Var = this.f675g0;
        if (!z) {
            kf1Var.getClass();
            int iOrdinal = v61Var.f11783d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                c80.m675s();
                return;
            }
            r61 r61VarM4389u = r61Var.m4389u();
            boolean z3 = r61VarM4389u == null || r61VarM4389u.m4351I();
            if (!z2) {
                if (r61Var.m4385q()) {
                    return;
                }
                if (r61Var.m4384p() && r61Var.m4351I() == z3 && r61Var.m4351I() == v61Var.f11795p.f6631z) {
                    return;
                }
            }
            mf1 mf1Var = v61Var.f11795p;
            mf1Var.f6602B = true;
            mf1Var.f6603C = true;
            if (!r61Var.f9383X && mf1Var.f6631z && z3) {
                if ((r61VarM4389u == null || !r61VarM4389u.m4384p()) && (r61VarM4389u == null || !r61VarM4389u.m4385q())) {
                    kf1Var.f5491b.m423j(r61Var, a21Var);
                }
                if (kf1Var.f5493d) {
                    return;
                }
                m460G(null);
                return;
            }
            return;
        }
        C0043b5 c0043b5 = kf1Var.f5491b;
        int iOrdinal2 = v61Var.f11783d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    c80.m675s();
                    return;
                }
            }
        }
        if ((v61Var.f11784e || v61Var.f11785f) && !z2) {
            return;
        }
        v61Var.f11785f = true;
        v61Var.f11786g = true;
        mf1 mf1Var2 = v61Var.f11795p;
        mf1Var2.f6602B = true;
        mf1Var2.f6603C = true;
        if (r61Var.f9383X) {
            return;
        }
        r61 r61VarM4389u2 = r61Var.m4389u();
        if (t11.m5086l(r61Var.m4352J(), Boolean.TRUE) && ((r61VarM4389u2 == null || !r61VarM4389u2.f9373N.f11784e) && (r61VarM4389u2 == null || !r61VarM4389u2.f9373N.f11785f))) {
            c0043b5.m423j(r61Var, a21.f37i);
        } else if (r61Var.m4351I() && ((r61VarM4389u2 == null || !r61VarM4389u2.m4384p()) && (r61VarM4389u2 == null || !r61VarM4389u2.m4385q()))) {
            c0043b5.m423j(r61Var, a21Var);
        }
        if (kf1Var.f5493d) {
            return;
        }
        m460G(null);
    }

    /* JADX INFO: renamed from: C */
    public final void m456C() {
        ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h7 = this.f638G;
        viewOnAttachStateChangeListenerC0267h7.f3848E = true;
        Handler handler = viewOnAttachStateChangeListenerC0267h7.f3864k.getHandler();
        if (viewOnAttachStateChangeListenerC0267h7.m2108o() && !viewOnAttachStateChangeListenerC0267h7.f3859P && handler != null) {
            viewOnAttachStateChangeListenerC0267h7.f3859P = true;
            handler.post(viewOnAttachStateChangeListenerC0267h7.f3861R);
        }
        ViewOnAttachStateChangeListenerC0837w7 viewOnAttachStateChangeListenerC0837w7 = this.f640H;
        viewOnAttachStateChangeListenerC0837w7.f12374n = true;
        Handler handler2 = viewOnAttachStateChangeListenerC0837w7.f12368h.getHandler();
        if (!viewOnAttachStateChangeListenerC0837w7.m5853h() || viewOnAttachStateChangeListenerC0837w7.f12380t || handler2 == null) {
            return;
        }
        viewOnAttachStateChangeListenerC0837w7.f12380t = true;
        handler2.post(viewOnAttachStateChangeListenerC0837w7.f12381u);
    }

    /* JADX INFO: renamed from: D */
    public final void m457D() {
        if (this.f689n0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f687m0) {
            this.f687m0 = jCurrentAnimationTimeMillis;
            InterfaceC0741to interfaceC0741to = this.f655O0;
            float[] fArr = this.f683k0;
            interfaceC0741to.mo5336a(this, fArr);
            fg1.m1650y(fArr, this.f685l0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f679i0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f691o0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m458E(MotionEvent motionEvent) {
        this.f687m0 = AnimationUtils.currentAnimationTimeMillis();
        InterfaceC0741to interfaceC0741to = this.f655O0;
        float[] fArr = this.f683k0;
        interfaceC0741to.mo5336a(this, fArr);
        fg1.m1650y(fArr, this.f685l0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jM2156b = hf1.m2156b((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jM2156b >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jM2156b & 4294967295L));
        this.f691o0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    /* JADX INFO: renamed from: F */
    public final boolean m459F() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    /* JADX INFO: renamed from: G */
    public final void m460G(r61 r61Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (r61Var != null) {
            while (r61Var != null && r61Var.m4386r() == p61.f7985h) {
                if (!this.f674f0) {
                    r61 r61VarM4389u = r61Var.m4389u();
                    if (r61VarM4389u == null) {
                        break;
                    }
                    long j = ((qz0) r61VarM4389u.f9372M.f12033d).f10441k;
                    if (C0221fz.m1761f(j) && C0221fz.m1760e(j)) {
                        break;
                    }
                }
                r61Var = r61Var.m4389u();
            }
            if (r61Var == getRoot()) {
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
    public final long m461H(long j) {
        m457D();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f691o0 >> 32));
        return hf1.m2156b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f691o0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.f685l0);
    }

    /* JADX INFO: renamed from: I */
    public final int m462I(MotionEvent motionEvent) {
        Object obj;
        if (this.f657P0) {
            this.f657P0 = false;
            k91 k91Var = getComposeViewContext().f6366s;
            int metaState = motionEvent.getMetaState();
            k91Var.getClass();
            ud3.f11252a.setValue(new v12(metaState));
        }
        ii1 ii1Var = this.f656P;
        dq1 dq1VarM2355c = ii1Var.m2355c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        C0554os c0554os = this.f658Q;
        if (dq1VarM2355c == null) {
            if (!c0554os.f7820a) {
                gd1 gd1Var = (gd1) ((hh1) c0554os.f7823d).f4019i;
                int i = gd1Var.f3412k;
                Object[] objArr = gd1Var.f3411j;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                gd1Var.f3412k = 0;
                gd1Var.f3409h = false;
                ((us0) c0554os.f7822c).m5576c();
            }
            return 0;
        }
        List list = (List) dq1VarM2355c.f2147i;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i3 = size - 1;
                obj = list.get(size);
                if (((q12) obj).f8694e && (actionMasked == 0 || actionMasked == 5)) {
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
        q12 q12Var = (q12) obj;
        if (q12Var != null) {
            this.f678i = q12Var.f8693d;
        }
        int iM3630a = c0554os.m3630a(dq1VarM2355c, this, m474r(motionEvent));
        dq1VarM2355c.f2148j = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iM3630a & 1) != 0) {
            return iM3630a;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        ii1Var.f4637c.delete(pointerId);
        ii1Var.f4636b.delete(pointerId);
        return iM3630a;
    }

    /* JADX INFO: renamed from: J */
    public final void m463J(MotionEvent motionEvent, int i, long j, boolean z) {
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
            long jM477u = m477u((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jM477u >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jM477u & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        dq1 dq1VarM2355c = this.f656P.m2355c(motionEventObtain, this);
        dq1VarM2355c.getClass();
        this.f658Q.m3630a(dq1VarM2355c, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m464K(mn0 mn0Var, u00 u00Var) {
        C0008a7 c0008a7;
        if (u00Var instanceof C0008a7) {
            c0008a7 = (C0008a7) u00Var;
            int i = c0008a7.f100m;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0008a7.f100m = i - Integer.MIN_VALUE;
            } else {
                c0008a7 = new C0008a7(this, u00Var);
            }
        }
        Object obj = c0008a7.f98k;
        int i2 = c0008a7.f100m;
        if (i2 == 0) {
            fg1.m1627T(obj);
            C0836w6 c0836w6 = new C0836w6(this, 2);
            c0008a7.f100m = 1;
            if (AbstractC0731te.m5238u(new C0379k9(c0836w6, this.f703u0, mn0Var, null, 8), c0008a7) == k20.f5323h) {
                return;
            }
        } else {
            if (i2 != 1) {
                C0676s.m4653l("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            fg1.m1627T(obj);
        }
        C0676s.m4644b();
    }

    /* JADX INFO: renamed from: L */
    public final void m465L(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (t11.m5086l(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(AbstractC0691se.m4842m(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) != 0) {
            this.f706w.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX INFO: renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m466M() {
        boolean z;
        int i;
        int[] iArr = this.f679i0;
        getLocationOnScreen(iArr);
        long j = this.f677h0;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 != i4 || i3 != iArr[1] || this.f687m0 < 0) {
            this.f677h0 = (4294967295L & ((long) iArr[1])) | (((long) i4) << 32);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                zk1 zk1VarM4393y = getRoot().m4393y();
                Object[] objArr = zk1VarM4393y.f13934h;
                int i5 = zk1VarM4393y.f13936j;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((r61) objArr[i6]).f9373N.f11795p.m3083v0();
                }
                z = true;
            }
        }
        m457D();
        View rootView = this.f663S0;
        if (rootView == null) {
            rootView = getRootView();
            this.f663S0 = rootView;
        }
        q62 rectManager = getRectManager();
        long j2 = this.f677h0;
        long jM5346J = tp0.m5346J(this.f691o0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.f683k0;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
        }
        h23 h23Var = rectManager.f8752c;
        if ((i & 2) != 0) {
            fArr = null;
        }
        rectManager.f8755f = h23Var.m2045b(j2, jM5346J, fArr, width, height) || rectManager.f8755f;
        this.f675g0.m2653b(z);
        getRectManager().m4061a();
    }

    /* JADX INFO: renamed from: N */
    public final void m467N(float f) {
        if (m452p()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.f641H0) || f > this.f641H0) {
                    this.f641H0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.f643I0) || f < this.f643I0) {
                    this.f643I0 = f;
                }
            }
        }
    }

    @Override // p000.xk0
    /* JADX INFO: renamed from: a */
    public final void mo468a(pl0 pl0Var, pl0 pl0Var2) {
        vn1 vn1Var;
        boolean z;
        vn1 vn1Var2;
        boolean z2;
        if (pl0Var != null) {
            pl0 pl0Var3 = pl0Var;
            if (!pl0Var3.f10757h.f10770u) {
                kz0.m2764b("visitAncestors called on an unattached node");
            }
            th1 th1Var = pl0Var3.f10757h;
            r61 r61VarM4933c0 = sp0.m4933c0(pl0Var);
            sk1 sk1Var = null;
            ArrayList arrayList = null;
            while (r61VarM4933c0 != null) {
                if ((((th1) r61VarM4933c0.f9372M.f12036g).f10760k & 2097152) != 0) {
                    while (th1Var != null) {
                        if ((th1Var.f10759j & 2097152) != 0) {
                            th1 th1VarM4952m = th1Var;
                            zk1 zk1Var = null;
                            while (th1VarM4952m != null) {
                                if (th1VarM4952m instanceof wy0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(th1VarM4952m);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (th1VarM4952m.f10759j & 2097152) != 0 && (th1VarM4952m instanceof u60)) {
                                    int i = 0;
                                    for (th1 th1Var2 = ((u60) th1VarM4952m).f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
                                        if ((th1Var2.f10759j & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                th1VarM4952m = th1Var2;
                                            } else {
                                                if (zk1Var == null) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (th1VarM4952m != null) {
                                                    zk1Var.m6423b(th1VarM4952m);
                                                    th1VarM4952m = null;
                                                }
                                                zk1Var.m6423b(th1Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                th1VarM4952m = sp0.m4952m(zk1Var);
                            }
                        }
                        th1Var = th1Var.f10761l;
                    }
                }
                r61VarM4933c0 = r61VarM4933c0.m4389u();
                th1Var = (r61VarM4933c0 == null || (vn1Var2 = r61VarM4933c0.f9372M) == null) ? null : (qx2) vn1Var2.f12035f;
            }
            if (arrayList == null) {
                return;
            }
            if (pl0Var2 != null) {
                if (!pl0Var2.f10757h.f10770u) {
                    kz0.m2764b("visitAncestors called on an unattached node");
                }
                th1 th1Var3 = pl0Var2.f10757h;
                r61 r61VarM4933c02 = sp0.m4933c0(pl0Var2);
                sk1 sk1Var2 = null;
                while (r61VarM4933c02 != null) {
                    if ((((th1) r61VarM4933c02.f9372M.f12036g).f10760k & 2097152) != 0) {
                        while (th1Var3 != null) {
                            if ((th1Var3.f10759j & 2097152) != 0) {
                                th1 th1VarM4952m2 = th1Var3;
                                zk1 zk1Var2 = null;
                                while (th1VarM4952m2 != null) {
                                    if (th1VarM4952m2 instanceof wy0) {
                                        if (sk1Var2 == null) {
                                            sk1 sk1Var3 = fd2.f2911a;
                                            sk1Var2 = new sk1();
                                        }
                                        sk1Var2.m4882a(th1VarM4952m2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (th1VarM4952m2.f10759j & 2097152) != 0 && (th1VarM4952m2 instanceof u60)) {
                                        int i2 = 0;
                                        for (th1 th1Var4 = ((u60) th1VarM4952m2).f11116w; th1Var4 != null; th1Var4 = th1Var4.f10762m) {
                                            if ((th1Var4.f10759j & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    th1VarM4952m2 = th1Var4;
                                                } else {
                                                    if (zk1Var2 == null) {
                                                        zk1Var2 = new zk1(new th1[16]);
                                                    }
                                                    if (th1VarM4952m2 != null) {
                                                        zk1Var2.m6423b(th1VarM4952m2);
                                                        th1VarM4952m2 = null;
                                                    }
                                                    zk1Var2.m6423b(th1Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    th1VarM4952m2 = sp0.m4952m(zk1Var2);
                                }
                            }
                            th1Var3 = th1Var3.f10761l;
                        }
                    }
                    r61VarM4933c02 = r61VarM4933c02.m4389u();
                    th1Var3 = (r61VarM4933c02 == null || (vn1Var = r61VarM4933c02.f9372M) == null) ? null : (qx2) vn1Var.f12035f;
                }
                sk1Var = sk1Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                wy0 wy0Var = (wy0) arrayList.get(i3);
                if (!(sk1Var != null ? sk1Var.m4884c(wy0Var) : false)) {
                    wy0Var.mo211C();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        pl0 pl0Var = ((bl0) getFocusOwner()).f926c;
        if (!pl0Var.f10770u) {
            return;
        }
        if (!pl0Var.f10757h.f10770u) {
            kz0.m2764b("visitSubtreeIf called on an unattached node");
        }
        zk1 zk1Var = new zk1(new th1[16]);
        th1 th1Var = pl0Var.f10757h;
        th1 th1Var2 = th1Var.f10762m;
        if (th1Var2 == null) {
            sp0.m4948k(zk1Var, th1Var);
        } else {
            zk1Var.m6423b(th1Var2);
        }
        while (true) {
            int i3 = zk1Var.f13936j;
            if (i3 == 0) {
                return;
            }
            th1 th1Var3 = (th1) zk1Var.m6432k(i3 - 1);
            if ((th1Var3.f10760k & 1024) != 0) {
                for (th1 th1Var4 = th1Var3; th1Var4 != null && th1Var4.f10770u; th1Var4 = th1Var4.f10762m) {
                    if ((th1Var4.f10759j & 1024) != 0) {
                        th1 th1VarM4952m = th1Var4;
                        zk1 zk1Var2 = null;
                        while (th1VarM4952m != null) {
                            int i4 = 0;
                            if (th1VarM4952m instanceof pl0) {
                                pl0 pl0Var2 = (pl0) th1VarM4952m;
                                if (pl0Var2.f10770u && pl0Var2.m3873O0().f2484a) {
                                    super.addFocusables(arrayList, i, i2);
                                    pl0 pl0Var3 = ((bl0) getFocusOwner()).f926c;
                                    if (pl0Var3.f10770u) {
                                        if (!pl0Var3.f10757h.f10770u) {
                                            kz0.m2764b("visitSubtreeIf called on an unattached node");
                                        }
                                        zk1 zk1Var3 = new zk1(new th1[16]);
                                        th1 th1Var5 = pl0Var3.f10757h;
                                        th1 th1Var6 = th1Var5.f10762m;
                                        if (th1Var6 == null) {
                                            sp0.m4948k(zk1Var3, th1Var5);
                                        } else {
                                            zk1Var3.m6423b(th1Var6);
                                        }
                                        while (true) {
                                            int i5 = zk1Var3.f13936j;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            th1 th1Var7 = (th1) zk1Var3.m6432k(i5 - 1);
                                            if ((th1Var7.f10760k & 1024) != 0) {
                                                for (th1 th1Var8 = th1Var7; th1Var8 != null && th1Var8.f10770u; th1Var8 = th1Var8.f10762m) {
                                                    if ((th1Var8.f10759j & 1024) != 0) {
                                                        th1 th1VarM4952m2 = th1Var8;
                                                        zk1 zk1Var4 = null;
                                                        while (th1VarM4952m2 != null) {
                                                            if (th1VarM4952m2 instanceof pl0) {
                                                                pl0 pl0Var4 = (pl0) th1VarM4952m2;
                                                                if (pl0Var4.f10770u) {
                                                                    el0 el0VarM3873O0 = pl0Var4.m3873O0();
                                                                    if (pl0Var4.f10770u && !pl0Var4.f8385v && el0VarM3873O0.f2484a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((th1VarM4952m2.f10759j & 1024) != 0 && (th1VarM4952m2 instanceof u60)) {
                                                                int i6 = 0;
                                                                for (th1 th1Var9 = ((u60) th1VarM4952m2).f11116w; th1Var9 != null; th1Var9 = th1Var9.f10762m) {
                                                                    if ((th1Var9.f10759j & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            th1VarM4952m2 = th1Var9;
                                                                        } else {
                                                                            if (zk1Var4 == null) {
                                                                                zk1Var4 = new zk1(new th1[16]);
                                                                            }
                                                                            if (th1VarM4952m2 != null) {
                                                                                zk1Var4.m6423b(th1VarM4952m2);
                                                                                th1VarM4952m2 = null;
                                                                            }
                                                                            zk1Var4.m6423b(th1Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            th1VarM4952m2 = sp0.m4952m(zk1Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            sp0.m4948k(zk1Var3, th1Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((th1VarM4952m.f10759j & 1024) != 0 && (th1VarM4952m instanceof u60)) {
                                for (th1 th1Var10 = ((u60) th1VarM4952m).f11116w; th1Var10 != null; th1Var10 = th1Var10.f10762m) {
                                    if ((th1Var10.f10759j & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            th1VarM4952m = th1Var10;
                                        } else {
                                            if (zk1Var2 == null) {
                                                zk1Var2 = new zk1(new th1[16]);
                                            }
                                            if (th1VarM4952m != null) {
                                                zk1Var2.m6423b(th1VarM4952m);
                                                th1VarM4952m = null;
                                            }
                                            zk1Var2.m6423b(th1Var10);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            th1VarM4952m = sp0.m4952m(zk1Var2);
                        }
                    }
                }
            }
            sp0.m4948k(zk1Var, th1Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        ln2 ln2VarM4391w;
        in0 in0Var;
        in0 in0Var2;
        C0119d6 c0119d6 = this.f666U;
        if (c0119d6 != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                r61 r61Var = (r61) c0119d6.f1876i.f10861c.m6022b(iKeyAt);
                if (r61Var != null && (ln2VarM4391w = r61Var.m4391w()) != null) {
                    rk1 rk1Var = ln2VarM4391w.f6221h;
                    Object objM4505g = rk1Var.m4505g(kn2.f5665g);
                    if (objM4505g == null) {
                        objM4505g = null;
                    }
                    C0603q3 c0603q3 = (C0603q3) objM4505g;
                    if (c0603q3 != null && (in0Var2 = (in0) c0603q3.f8713b) != null) {
                    }
                    Object objM4505g2 = rk1Var.m4505g(kn2.f5666h);
                    C0603q3 c0603q32 = (C0603q3) (objM4505g2 != null ? objM4505g2 : null);
                    if (c0603q32 != null && (in0Var = (in0) c0603q32.f8713b) != null) {
                    }
                }
            }
        }
        kj1 kj1Var = this.f664T;
        if (kj1Var != null) {
            C0735ti c0735ti = (C0735ti) kj1Var.f5595j;
            if (c0735ti.f10783a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (c0735ti.f10783a.get(Integer.valueOf(iKeyAt2)) != null) {
                        c80.m664g();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new n20("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new n20("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new n20("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // p000.w50
    /* JADX INFO: renamed from: b */
    public final void mo469b(ia1 ia1Var) {
        na1 na1Var = this.f688n;
        if (na1Var != null) {
            le1 le1Var = (le1) na1Var.f7082a.f6983i;
            if (le1Var.f6077h && !le1Var.f6079j) {
                InterfaceC0508np interfaceC0508np = na1Var.f7085d;
                if (interfaceC0508np != null) {
                    interfaceC0508np.cancel();
                }
                na1Var.f7085d = null;
                return;
            }
            if (le1Var.f6078i) {
                return;
            }
            if (!le1Var.f6079j) {
                k22.m2599a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!le1Var.f6080k.m4507i()) {
                k22.m2599a("Attempted to start retaining exited values with pending exited values");
            }
            le1Var.f6079j = false;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f638G.m2100f(false, i, this.f678i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f638G.m2100f(true, i, this.f678i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        lk1 lk1Var = this.f648L;
        if (!isAttachedToWindow()) {
            m451n(getRoot());
        }
        m478v(true);
        ds2.m1126j().mo84m();
        this.f652N = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            C0742tp c0742tp = this.f712z;
            C0192f6 c0192f6 = c0742tp.f10873a;
            Canvas canvas2 = c0192f6.f2807a;
            c0192f6.f2807a = canvas;
            getRoot().m4378i(c0192f6, null);
            c0742tp.f10873a.f2807a = canvas2;
            if (lk1Var.m2933i()) {
                int i = lk1Var.f6164b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((sq0) ((yv1) lk1Var.m2930f(i2))).m4973g();
                }
            }
            int i3 = cb3.f1471h;
            lk1Var.m2928d();
            this.f652N = false;
            Trace.endSection();
            lk1 lk1Var2 = this.f650M;
            if (lk1Var2 != null) {
                lk1Var.m2926b(lk1Var2);
                lk1Var2.m2928d();
            }
            if (m452p()) {
                AbstractC0653re.m4437a(this, this.f641H0);
                View view = this.f698s;
                if (view != null) {
                    AbstractC0653re.m4437a(view, this.f643I0);
                    if (!Float.isNaN(this.f643I0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.f641H0 = Float.NaN;
                this.f643I0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04ed A[PHI: r5
  0x04ed: PHI (r5v66 ??) = (r5v87 ??), (r5v88 ??), (r5v89 ??) binds: [B:307:0x04af, B:309:0x04b3, B:324:0x04e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x06c9 A[PHI: r4
  0x06c9: PHI (r4v28 ??) = (r4v67 ??), (r4v68 ??), (r4v69 ??) binds: [B:444:0x068f, B:446:0x0693, B:461:0x06c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44, types: [th1] */
    /* JADX WARN: Type inference failed for: r3v45, types: [th1] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v85 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [zk1] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [zk1] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50, types: [th1] */
    /* JADX WARN: Type inference failed for: r4v51, types: [th1] */
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
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66, types: [zk1] */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v70, types: [zk1] */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Type inference failed for: r5v87 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r6v48 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        String str;
        int i2;
        C0158e9 c0158e9;
        String str2;
        long jValueAt;
        ny0 ny0Var;
        Object obj;
        long j;
        long j2;
        int i3;
        char c;
        int i4;
        long jFloatToRawIntBits;
        wy0 wy0Var;
        vn1 vn1Var;
        boolean z;
        ?? r3;
        vn1 vn1Var2;
        ?? M4952m;
        wy0 wy0Var2;
        boolean z2;
        int size;
        int size2;
        vn1 vn1Var3;
        boolean z3;
        ?? r4;
        vn1 vn1Var4;
        ?? M4952m2;
        boolean z4;
        C0530o6 c0530o6;
        int size3;
        vn1 vn1Var5;
        boolean z5;
        th1 th1VarM4952m;
        vn1 vn1Var6;
        if (this.f649L0) {
            RunnableC0376k6 runnableC0376k6 = this.f647K0;
            removeCallbacks(runnableC0376k6);
            if (motionEvent.getActionMasked() == 8) {
                this.f649L0 = false;
            } else {
                runnableC0376k6.run();
            }
        }
        if (m453q(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        String str3 = "visitAncestors called on an unattached node";
        int actionIndex = -1;
        int i5 = 1;
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (m472m(motionEvent) & 4) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            getContext();
            viewConfiguration.getScaledVerticalScrollFactor();
            getContext();
            viewConfiguration.getScaledHorizontalScrollFactor();
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            bl0 bl0Var = (bl0) getFocusOwner();
            if (bl0Var.f927d.f12555e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            pl0 pl0VarM4540a0 = rp0.m4540a0(bl0Var.f926c);
            if (pl0VarM4540a0 != null) {
                if (!pl0VarM4540a0.f10757h.f10770u) {
                    kz0.m2764b("visitAncestors called on an unattached node");
                }
                th1 th1Var = pl0VarM4540a0.f10757h;
                r61 r61VarM4933c0 = sp0.m4933c0(pl0VarM4540a0);
                loop0: while (true) {
                    if (r61VarM4933c0 == null) {
                        th1VarM4952m = null;
                        break;
                    }
                    if ((((th1) r61VarM4933c0.f9372M.f12036g).f10760k & 16384) != 0) {
                        while (th1Var != null) {
                            if ((th1Var.f10759j & 16384) != 0) {
                                th1VarM4952m = th1Var;
                                zk1 zk1Var = null;
                                while (th1VarM4952m != null) {
                                    if (th1VarM4952m instanceof C0530o6) {
                                        break loop0;
                                    }
                                    if ((th1VarM4952m.f10759j & 16384) != 0 && (th1VarM4952m instanceof u60)) {
                                        int i6 = 0;
                                        for (th1 th1Var2 = ((u60) th1VarM4952m).f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
                                            if ((th1Var2.f10759j & 16384) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    th1VarM4952m = th1Var2;
                                                } else {
                                                    if (zk1Var == null) {
                                                        zk1Var = new zk1(new th1[16]);
                                                    }
                                                    if (th1VarM4952m != null) {
                                                        zk1Var.m6423b(th1VarM4952m);
                                                        th1VarM4952m = null;
                                                    }
                                                    zk1Var.m6423b(th1Var2);
                                                }
                                            }
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                    th1VarM4952m = sp0.m4952m(zk1Var);
                                }
                            }
                            th1Var = th1Var.f10761l;
                        }
                    }
                    r61VarM4933c0 = r61VarM4933c0.m4389u();
                    th1Var = (r61VarM4933c0 == null || (vn1Var6 = r61VarM4933c0.f9372M) == null) ? null : (qx2) vn1Var6.f12035f;
                }
                c0530o6 = (C0530o6) th1VarM4952m;
            } else {
                c0530o6 = null;
            }
            if (c0530o6 != null) {
                if (!c0530o6.f10757h.f10770u) {
                    kz0.m2764b("visitAncestors called on an unattached node");
                }
                th1 th1Var3 = c0530o6.f10757h.f10761l;
                r61 r61VarM4933c02 = sp0.m4933c0(c0530o6);
                ArrayList arrayList = null;
                while (r61VarM4933c02 != null) {
                    if ((((th1) r61VarM4933c02.f9372M.f12036g).f10760k & 16384) != 0) {
                        while (th1Var3 != null) {
                            if ((th1Var3.f10759j & 16384) != 0) {
                                th1 th1VarM4952m2 = th1Var3;
                                zk1 zk1Var2 = null;
                                while (th1VarM4952m2 != null) {
                                    if (th1VarM4952m2 instanceof C0530o6) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(th1VarM4952m2);
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z5 && (th1VarM4952m2.f10759j & 16384) != 0 && (th1VarM4952m2 instanceof u60)) {
                                        int i7 = 0;
                                        for (th1 th1Var4 = ((u60) th1VarM4952m2).f11116w; th1Var4 != null; th1Var4 = th1Var4.f10762m) {
                                            if ((th1Var4.f10759j & 16384) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    th1VarM4952m2 = th1Var4;
                                                } else {
                                                    if (zk1Var2 == null) {
                                                        zk1Var2 = new zk1(new th1[16]);
                                                    }
                                                    if (th1VarM4952m2 != null) {
                                                        zk1Var2.m6423b(th1VarM4952m2);
                                                        th1VarM4952m2 = null;
                                                    }
                                                    zk1Var2.m6423b(th1Var4);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    th1VarM4952m2 = sp0.m4952m(zk1Var2);
                                }
                            }
                            th1Var3 = th1Var3.f10761l;
                        }
                    }
                    r61VarM4933c02 = r61VarM4933c02.m4389u();
                    th1Var3 = (r61VarM4933c02 == null || (vn1Var5 = r61VarM4933c02.f9372M) == null) ? null : (qx2) vn1Var5.f12035f;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i8 = size3 - 1;
                        ((C0530o6) arrayList.get(size3)).getClass();
                        if (i8 < 0) {
                            break;
                        }
                        size3 = i8;
                    }
                }
                th1 th1VarM4952m3 = c0530o6.f10757h;
                zk1 zk1Var3 = null;
                while (th1VarM4952m3 != null) {
                    if (!(th1VarM4952m3 instanceof C0530o6) && (th1VarM4952m3.f10759j & 16384) != 0 && (th1VarM4952m3 instanceof u60)) {
                        int i9 = 0;
                        for (th1 th1Var5 = ((u60) th1VarM4952m3).f11116w; th1Var5 != null; th1Var5 = th1Var5.f10762m) {
                            if ((th1Var5.f10759j & 16384) != 0) {
                                i9++;
                                if (i9 == 1) {
                                    th1VarM4952m3 = th1Var5;
                                } else {
                                    if (zk1Var3 == null) {
                                        zk1Var3 = new zk1(new th1[16]);
                                    }
                                    if (th1VarM4952m3 != null) {
                                        zk1Var3.m6423b(th1VarM4952m3);
                                        th1VarM4952m3 = null;
                                    }
                                    zk1Var3.m6423b(th1Var5);
                                }
                            }
                        }
                        if (i9 == 1) {
                        }
                    }
                    th1VarM4952m3 = sp0.m4952m(zk1Var3);
                }
                if (!super.dispatchGenericMotionEvent(motionEvent)) {
                    th1 th1VarM4952m4 = c0530o6.f10757h;
                    zk1 zk1Var4 = null;
                    while (th1VarM4952m4 != null) {
                        if (!(th1VarM4952m4 instanceof C0530o6) && (th1VarM4952m4.f10759j & 16384) != 0 && (th1VarM4952m4 instanceof u60)) {
                            int i10 = 0;
                            for (th1 th1Var6 = ((u60) th1VarM4952m4).f11116w; th1Var6 != null; th1Var6 = th1Var6.f10762m) {
                                if ((th1Var6.f10759j & 16384) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        th1VarM4952m4 = th1Var6;
                                    } else {
                                        if (zk1Var4 == null) {
                                            zk1Var4 = new zk1(new th1[16]);
                                        }
                                        if (th1VarM4952m4 != null) {
                                            zk1Var4.m6423b(th1VarM4952m4);
                                            th1VarM4952m4 = null;
                                        }
                                        zk1Var4.m6423b(th1Var6);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        th1VarM4952m4 = sp0.m4952m(zk1Var4);
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        for (int i11 = 0; i11 < size4; i11++) {
                            ((C0530o6) arrayList.get(i11)).getClass();
                        }
                    }
                }
            }
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        ny0 ny0Var2 = this.f682k;
        ii1 ii1Var = this.f656P;
        gd1 gd1Var = ii1Var.f4639e;
        SparseLongArray sparseLongArray = ii1Var.f4636b;
        int actionMasked = motionEvent.getActionMasked();
        ii1Var.m2354b(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            ii1Var.f4637c.clear();
            str = "visitAncestors called on an unattached node";
            i = 16;
            c0158e9 = null;
        } else {
            ii1Var.m2353a(motionEvent);
            if (actionMasked == 1) {
                actionIndex = 0;
            } else if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
            boolean z6 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
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
                    ny0Var = ny0Var2;
                } else {
                    str2 = str3;
                    jValueAt = ii1Var.f4635a;
                    ny0Var = ny0Var2;
                    ii1Var.f4635a = jValueAt + 1;
                    sparseLongArray.put(pointerId, jValueAt);
                }
                ii1 ii1Var2 = ii1Var;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getX(i12))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY(i12))) & 4294967295L);
                ?? r32 = i12 != actionIndex ? i13 : 0;
                int iM4481q = rg3.m4481q(gd1Var.f3410i, gd1Var.f3412k, jValueAt);
                if (iM4481q < 0 || (obj = gd1Var.f3411j[iM4481q]) == AbstractC0731te.f10691c) {
                    obj = null;
                }
                hi1 hi1Var = (hi1) obj;
                if (i12 == actionIndex) {
                    gd1Var.m1832f(jValueAt);
                    j = jValueAt;
                    j2 = 2147483647L;
                    c = ' ';
                    i3 = 65535;
                } else {
                    if (z6) {
                        j2 = 2147483647L;
                        i3 = 65535;
                        j = jValueAt;
                        gd1Var.m1831d(j, new hi1(1 | ((motionEvent.getEventTime() & 2147483647L) << i13) | (((long) ((((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))) << 16))) << 32)));
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
                long eventTime2 = hi1Var != null ? (hi1Var.f4032a >> i13) & j3 : motionEvent.getEventTime();
                if (hi1Var != null) {
                    i4 = i15;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits((short) (r5 & i14))) & 4294967295L) | (((long) Float.floatToRawIntBits((short) (((int) (hi1Var.f4032a >>> c)) >>> 16))) << c);
                } else {
                    i4 = i15;
                    jFloatToRawIntBits = jFloatToRawIntBits2;
                }
                arrayList2.add(new oy0(j, eventTime, jFloatToRawIntBits2, r32, pressure, eventTime2, jFloatToRawIntBits, hi1Var != null ? (hi1Var.f4032a & 1) != 0 ? i13 : 0 : 0));
                i12++;
                ii1Var = ii1Var2;
                i5 = i13;
                str3 = str2;
                ny0Var2 = ny0Var;
                actionIndex = i4;
            }
            ny0 ny0Var3 = ny0Var2;
            str = str3;
            int i16 = i5;
            ii1Var.m2357e(motionEvent);
            if (ny0Var3 != null) {
                i2 = ny0Var3.f7366a;
            } else {
                if (!motionEvent.isFromSource(2097152)) {
                    C0676s.m4651j("MotionEvent must be a touch navigation source");
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
            c0158e9 = new C0158e9(arrayList2, i2, motionEvent);
        }
        yy0 yy0Var = this.f651M0;
        if (c0158e9 == null) {
            pl0 pl0VarM561f = ((bl0) getFocusOwner()).m561f();
            if (pl0VarM561f != null) {
                if (!pl0VarM561f.f10757h.f10770u) {
                    kz0.m2764b(str);
                }
                th1 th1Var7 = pl0VarM561f.f10757h;
                r61 r61VarM4933c03 = sp0.m4933c0(pl0VarM561f);
                loop26: while (true) {
                    if (r61VarM4933c03 == null) {
                        r3 = 0;
                        break;
                    }
                    int i17 = 2097152;
                    if ((((th1) r61VarM4933c03.f9372M.f12036g).f10760k & 2097152) != 0) {
                        while (th1Var7 != null) {
                            if ((th1Var7.f10759j & i17) != 0) {
                                r3 = th1Var7;
                                ?? r42 = 0;
                                while (r3 != 0) {
                                    if (r3 instanceof wy0) {
                                        break loop26;
                                    }
                                    ?? zk1Var5 = r42;
                                    if ((r3.f10759j & i17) != 0) {
                                        zk1Var5 = r42;
                                        if (r3 instanceof u60) {
                                            th1 th1Var8 = ((u60) r3).f11116w;
                                            int i18 = 0;
                                            M4952m = r3;
                                            zk1Var5 = r42;
                                            while (th1Var8 != null) {
                                                if ((th1Var8.f10759j & i17) != 0) {
                                                    i18++;
                                                    zk1Var5 = zk1Var5;
                                                    if (i18 == 1) {
                                                        M4952m = th1Var8;
                                                    } else {
                                                        if (zk1Var5 == 0) {
                                                            zk1Var5 = new zk1(new th1[16]);
                                                        }
                                                        if (M4952m != 0) {
                                                            zk1Var5.m6423b(M4952m);
                                                            M4952m = 0;
                                                        }
                                                        zk1Var5.m6423b(th1Var8);
                                                    }
                                                }
                                                th1Var8 = th1Var8.f10762m;
                                                i17 = 2097152;
                                                M4952m = M4952m;
                                                zk1Var5 = zk1Var5;
                                            }
                                            zk1Var5 = zk1Var5;
                                            if (i18 != 1) {
                                                M4952m = sp0.m4952m(zk1Var5);
                                            }
                                        }
                                    }
                                    i17 = 2097152;
                                    r3 = M4952m;
                                    r42 = zk1Var5;
                                }
                            }
                            th1Var7 = th1Var7.f10761l;
                            i17 = 2097152;
                        }
                    }
                    r61VarM4933c03 = r61VarM4933c03.m4389u();
                    th1Var7 = (r61VarM4933c03 == null || (vn1Var2 = r61VarM4933c03.f9372M) == null) ? null : (qx2) vn1Var2.f12035f;
                }
                wy0Var = (wy0) r3;
            } else {
                wy0Var = null;
            }
            if (wy0Var != null) {
                th1 th1Var9 = (th1) wy0Var;
                if (!th1Var9.f10757h.f10770u) {
                    kz0.m2764b(str);
                }
                th1 th1Var10 = th1Var9.f10757h.f10761l;
                r61 r61VarM4933c04 = sp0.m4933c0(wy0Var);
                ArrayList arrayList3 = null;
                while (r61VarM4933c04 != null) {
                    int i19 = 2097152;
                    if ((((th1) r61VarM4933c04.f9372M.f12036g).f10760k & 2097152) != 0) {
                        while (th1Var10 != null) {
                            if ((th1Var10.f10759j & i19) != 0) {
                                th1 th1VarM4952m5 = th1Var10;
                                zk1 zk1Var6 = null;
                                while (th1VarM4952m5 != null) {
                                    if (th1VarM4952m5 instanceof wy0) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(th1VarM4952m5);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        if ((th1VarM4952m5.f10759j & 2097152) != 0 && (th1VarM4952m5 instanceof u60)) {
                                            int i20 = 0;
                                            for (th1 th1Var11 = ((u60) th1VarM4952m5).f11116w; th1Var11 != null; th1Var11 = th1Var11.f10762m) {
                                                if ((th1Var11.f10759j & 2097152) != 0) {
                                                    i20++;
                                                    if (i20 == 1) {
                                                        th1VarM4952m5 = th1Var11;
                                                    } else {
                                                        if (zk1Var6 == null) {
                                                            zk1Var6 = new zk1(new th1[16]);
                                                        }
                                                        if (th1VarM4952m5 != null) {
                                                            zk1Var6.m6423b(th1VarM4952m5);
                                                            th1VarM4952m5 = null;
                                                        }
                                                        zk1Var6.m6423b(th1Var11);
                                                    }
                                                }
                                            }
                                            if (i20 == 1) {
                                            }
                                        }
                                    }
                                    th1VarM4952m5 = sp0.m4952m(zk1Var6);
                                }
                            }
                            i19 = 2097152;
                            th1Var10 = th1Var10.f10761l;
                        }
                    }
                    r61VarM4933c04 = r61VarM4933c04.m4389u();
                    th1Var10 = (r61VarM4933c04 == null || (vn1Var = r61VarM4933c04.f9372M) == null) ? null : (qx2) vn1Var.f12035f;
                }
                wy0Var.mo211C();
                if (arrayList3 != null) {
                    int size5 = arrayList3.size();
                    for (int i21 = 0; i21 < size5; i21++) {
                        ((wy0) arrayList3.get(i21)).mo211C();
                    }
                }
            }
            yy0Var.f13671b = 0;
            yy0Var.f13672c = true;
            return true;
        }
        bl0 bl0Var2 = (bl0) getFocusOwner();
        if (bl0Var2.f927d.f12555e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        } else {
            pl0 pl0VarM561f2 = bl0Var2.m561f();
            if (pl0VarM561f2 != null) {
                if (!pl0VarM561f2.f10757h.f10770u) {
                    kz0.m2764b(str);
                }
                th1 th1Var12 = pl0VarM561f2.f10757h;
                r61 r61VarM4933c05 = sp0.m4933c0(pl0VarM561f2);
                loop14: while (true) {
                    if (r61VarM4933c05 == null) {
                        r4 = 0;
                        break;
                    }
                    int i22 = 2097152;
                    if ((((th1) r61VarM4933c05.f9372M.f12036g).f10760k & 2097152) != 0) {
                        while (th1Var12 != null) {
                            if ((th1Var12.f10759j & i22) != 0) {
                                r4 = th1Var12;
                                ?? r5 = 0;
                                while (r4 != 0) {
                                    if (r4 instanceof wy0) {
                                        break loop14;
                                    }
                                    ?? zk1Var7 = r5;
                                    if ((r4.f10759j & i22) != 0) {
                                        zk1Var7 = r5;
                                        if (r4 instanceof u60) {
                                            th1 th1Var13 = ((u60) r4).f11116w;
                                            int i23 = 0;
                                            M4952m2 = r4;
                                            zk1Var7 = r5;
                                            while (th1Var13 != null) {
                                                if ((th1Var13.f10759j & i22) != 0) {
                                                    i23++;
                                                    zk1Var7 = zk1Var7;
                                                    if (i23 == 1) {
                                                        M4952m2 = th1Var13;
                                                    } else {
                                                        if (zk1Var7 == 0) {
                                                            zk1Var7 = new zk1(new th1[i]);
                                                        }
                                                        if (M4952m2 != 0) {
                                                            zk1Var7.m6423b(M4952m2);
                                                            M4952m2 = 0;
                                                        }
                                                        zk1Var7.m6423b(th1Var13);
                                                    }
                                                }
                                                th1Var13 = th1Var13.f10762m;
                                                i = 16;
                                                i22 = 2097152;
                                                M4952m2 = M4952m2;
                                                zk1Var7 = zk1Var7;
                                            }
                                            zk1Var7 = zk1Var7;
                                            if (i23 != 1) {
                                                M4952m2 = sp0.m4952m(zk1Var7);
                                            }
                                        }
                                    }
                                    i = 16;
                                    i22 = 2097152;
                                    r4 = M4952m2;
                                    r5 = zk1Var7;
                                }
                            }
                            th1Var12 = th1Var12.f10761l;
                            i = 16;
                            i22 = 2097152;
                        }
                    }
                    r61VarM4933c05 = r61VarM4933c05.m4389u();
                    th1Var12 = (r61VarM4933c05 == null || (vn1Var4 = r61VarM4933c05.f9372M) == null) ? null : (qx2) vn1Var4.f12035f;
                    i = 16;
                }
                wy0Var2 = (wy0) r4;
            } else {
                wy0Var2 = null;
            }
            if (wy0Var2 != null) {
                th1 th1Var14 = (th1) wy0Var2;
                if (!th1Var14.f10757h.f10770u) {
                    kz0.m2764b(str);
                }
                th1 th1Var15 = th1Var14.f10757h.f10761l;
                r61 r61VarM4933c06 = sp0.m4933c0(wy0Var2);
                ArrayList arrayList4 = null;
                while (r61VarM4933c06 != null) {
                    int i24 = 2097152;
                    if ((((th1) r61VarM4933c06.f9372M.f12036g).f10760k & 2097152) != 0) {
                        while (th1Var15 != null) {
                            if ((th1Var15.f10759j & i24) != 0) {
                                th1 th1VarM4952m6 = th1Var15;
                                zk1 zk1Var8 = null;
                                while (th1VarM4952m6 != null) {
                                    if (th1VarM4952m6 instanceof wy0) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(th1VarM4952m6);
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        int i25 = 2097152;
                                        if ((th1VarM4952m6.f10759j & 2097152) != 0 && (th1VarM4952m6 instanceof u60)) {
                                            th1 th1Var16 = ((u60) th1VarM4952m6).f11116w;
                                            int i26 = 0;
                                            while (th1Var16 != null) {
                                                if ((th1Var16.f10759j & i25) != 0) {
                                                    i26++;
                                                    if (i26 == 1) {
                                                        th1VarM4952m6 = th1Var16;
                                                    } else {
                                                        if (zk1Var8 == null) {
                                                            zk1Var8 = new zk1(new th1[16]);
                                                        }
                                                        if (th1VarM4952m6 != null) {
                                                            zk1Var8.m6423b(th1VarM4952m6);
                                                            th1VarM4952m6 = null;
                                                        }
                                                        zk1Var8.m6423b(th1Var16);
                                                    }
                                                }
                                                th1Var16 = th1Var16.f10762m;
                                                i25 = 2097152;
                                            }
                                            if (i26 == 1) {
                                            }
                                        }
                                    }
                                    th1VarM4952m6 = sp0.m4952m(zk1Var8);
                                }
                            }
                            th1Var15 = th1Var15.f10761l;
                            i24 = 2097152;
                        }
                    }
                    r61VarM4933c06 = r61VarM4933c06.m4389u();
                    th1Var15 = (r61VarM4933c06 == null || (vn1Var3 = r61VarM4933c06.f9372M) == null) ? null : (qx2) vn1Var3.f12035f;
                }
                i12 i12Var = i12.f4216h;
                if (arrayList4 != null && arrayList4.size() - 1 >= 0) {
                    while (true) {
                        int i27 = size2 - 1;
                        ((wy0) arrayList4.get(size2)).mo214H(c0158e9, i12Var);
                        if (i27 < 0) {
                            break;
                        }
                        size2 = i27;
                    }
                }
                wy0Var2.mo214H(c0158e9, i12Var);
                i12 i12Var2 = i12.f4217i;
                wy0Var2.mo214H(c0158e9, i12Var2);
                if (arrayList4 != null) {
                    int size6 = arrayList4.size();
                    for (int i28 = 0; i28 < size6; i28++) {
                        ((wy0) arrayList4.get(i28)).mo214H(c0158e9, i12Var2);
                    }
                }
                i12 i12Var3 = i12.f4218j;
                if (arrayList4 != null && arrayList4.size() - 1 >= 0) {
                    while (true) {
                        int i29 = size - 1;
                        ((wy0) arrayList4.get(size)).mo214H(c0158e9, i12Var3);
                        if (i29 < 0) {
                            break;
                        }
                        size = i29;
                    }
                }
                wy0Var2.mo214H(c0158e9, i12Var3);
            }
            ArrayList arrayList5 = (ArrayList) c0158e9.f2353j;
            int size7 = arrayList5.size();
            for (int i30 = 0; i30 < size7; i30++) {
                if (((oy0) arrayList5.get(i30)).f7883i) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        yy0Var.getClass();
        MotionEvent motionEvent2 = (MotionEvent) c0158e9.f2354k;
        int action = motionEvent2.getAction();
        if (action != 0) {
            z4 = true;
            if ((action == 1 || action == 2) && z2) {
                yy0Var.f13671b = 0;
                yy0Var.f13672c = true;
            }
        } else {
            z4 = true;
            yy0Var.f13671b = c0158e9.f2352i;
            yy0Var.f13672c = false;
        }
        yy0Var.f13673d.onTouchEvent(motionEvent2);
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0159  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.f649L0;
        RunnableC0376k6 runnableC0376k6 = this.f647K0;
        if (z) {
            removeCallbacks(runnableC0376k6);
            runnableC0376k6.run();
        }
        if (!m453q(motionEvent) && isAttachedToWindow()) {
            ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h7 = this.f638G;
            ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = viewOnAttachStateChangeListenerC0267h7.f3864k;
            AccessibilityManager accessibilityManager = viewOnAttachStateChangeListenerC0267h7.f3867n;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    viewTreeObserverOnGlobalLayoutListenerC0045b7.m478v(true);
                    xs0 xs0Var = new xs0();
                    r61 root = viewTreeObserverOnGlobalLayoutListenerC0045b7.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
                    vn1 vn1Var = root.f9372M;
                    zn1 zn1Var = (zn1) vn1Var.f12034e;
                    ca2 ca2Var = zn1.f13961T;
                    ((zn1) vn1Var.f12034e).m6456X0(zn1.f13965X, zn1Var.m6450P0(jFloatToRawIntBits), xs0Var, 1, true);
                    lk1 lk1Var = xs0Var.f13155h;
                    for (int i2 = lk1Var.f6164b - 1; -1 < i2; i2--) {
                        Object objM2930f = lk1Var.m2930f(i2);
                        objM2930f.getClass();
                        r61 r61VarM4933c0 = sp0.m4933c0((th1) objM2930f);
                        if (viewTreeObserverOnGlobalLayoutListenerC0045b7.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(r61VarM4933c0) != null) {
                            break;
                        }
                        if (r61VarM4933c0.f9372M.m5731m(8)) {
                            int iM2110t = viewOnAttachStateChangeListenerC0267h7.m2110t(r61VarM4933c0.f9385i);
                            qn2 qn2VarM4528N = rp0.m4528N(r61VarM4933c0, false);
                            if (xe1.m6095M(qn2VarM4528N)) {
                                if (!qn2VarM4528N.m4209k().f6221h.m4501c(vn2.f12042B)) {
                                    i = iM2110t;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i = Integer.MIN_VALUE;
                    viewTreeObserverOnGlobalLayoutListenerC0045b7.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i3 = viewOnAttachStateChangeListenerC0267h7.f3865l;
                    if (i3 != i) {
                        viewOnAttachStateChangeListenerC0267h7.f3865l = i;
                        ViewOnAttachStateChangeListenerC0267h7.m2089x(viewOnAttachStateChangeListenerC0267h7, i, 128, null, 12);
                        ViewOnAttachStateChangeListenerC0267h7.m2089x(viewOnAttachStateChangeListenerC0267h7, i3, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i4 = viewOnAttachStateChangeListenerC0267h7.f3865l;
                    if (i4 == Integer.MIN_VALUE) {
                        viewTreeObserverOnGlobalLayoutListenerC0045b7.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i4 != Integer.MIN_VALUE) {
                        viewOnAttachStateChangeListenerC0267h7.f3865l = Integer.MIN_VALUE;
                        ViewOnAttachStateChangeListenerC0267h7.m2089x(viewOnAttachStateChangeListenerC0267h7, Integer.MIN_VALUE, 128, null, 12);
                        ViewOnAttachStateChangeListenerC0267h7.m2089x(viewOnAttachStateChangeListenerC0267h7, i4, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && m474r(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.f633D0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f633D0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.f649L0 = true;
                        postDelayed(runnableC0376k6, 8L);
                        return false;
                    }
                } else if ((m472m(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (m475s(motionEvent)) {
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (!isFocused()) {
            return ((bl0) getFocusOwner()).m559d(keyEvent, new C0723t6(i, this, keyEvent));
        }
        k91 k91Var = getComposeViewContext().f6366s;
        int metaState = keyEvent.getMetaState();
        k91Var.getClass();
        ud3.f11252a.setValue(new v12(metaState));
        return ((bl0) getFocusOwner()).m559d(keyEvent, C0367jy.f5266r) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        vn1 vn1Var;
        if (isFocused()) {
            bl0 bl0Var = (bl0) getFocusOwner();
            if (bl0Var.f927d.f12555e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                pl0 pl0VarM4540a0 = rp0.m4540a0(bl0Var.f926c);
                if (pl0VarM4540a0 != null) {
                    if (!pl0VarM4540a0.f10757h.f10770u) {
                        kz0.m2764b("visitAncestors called on an unattached node");
                    }
                    th1 th1Var = pl0VarM4540a0.f10757h;
                    r61 r61VarM4933c0 = sp0.m4933c0(pl0VarM4540a0);
                    while (r61VarM4933c0 != null) {
                        if ((((th1) r61VarM4933c0.f9372M.f12036g).f10760k & 131072) != 0) {
                            while (th1Var != null) {
                                if ((th1Var.f10759j & 131072) != 0) {
                                    th1 th1VarM4952m = th1Var;
                                    zk1 zk1Var = null;
                                    while (th1VarM4952m != null) {
                                        if ((th1VarM4952m.f10759j & 131072) != 0 && (th1VarM4952m instanceof u60)) {
                                            int i = 0;
                                            for (th1 th1Var2 = ((u60) th1VarM4952m).f11116w; th1Var2 != null; th1Var2 = th1Var2.f10762m) {
                                                if ((th1Var2.f10759j & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        th1VarM4952m = th1Var2;
                                                    } else {
                                                        if (zk1Var == null) {
                                                            zk1Var = new zk1(new th1[16]);
                                                        }
                                                        if (th1VarM4952m != null) {
                                                            zk1Var.m6423b(th1VarM4952m);
                                                            th1VarM4952m = null;
                                                        }
                                                        zk1Var.m6423b(th1Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        th1VarM4952m = sp0.m4952m(zk1Var);
                                    }
                                }
                                th1Var = th1Var.f10761l;
                            }
                        }
                        r61VarM4933c0 = r61VarM4933c0.m4389u();
                        th1Var = (r61VarM4933c0 == null || (vn1Var = r61VarM4933c0.f9372M) == null) ? null : (qx2) vn1Var.f12035f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            C0304i7.f4466a.m2296a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object c0922yg;
        pl0 pl0VarM561f;
        if (this.f649L0) {
            RunnableC0376k6 runnableC0376k6 = this.f647K0;
            removeCallbacks(runnableC0376k6);
            MotionEvent motionEvent2 = this.f633D0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f649L0 = false;
            } else {
                runnableC0376k6.run();
            }
        }
        if (!m453q(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || m475s(motionEvent))) {
            int iM472m = m472m(motionEvent);
            if ((iM472m & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (c0922yg = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    c0922yg = new C0922yg(1);
                }
                if (c0922yg.equals(new C0922yg(1)) && (pl0VarM561f = ((bl0) getFocusOwner()).m561f()) != null) {
                    zn1 zn1VarM4931b0 = sp0.m4931b0(pl0VarM561f);
                    if (!s11.m4665J(zn1VarM4931b0).mo644J(zn1VarM4931b0, true).m3513a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((bl0) getFocusOwner()).m557b(8, false, true);
                    }
                }
            }
            if ((iM472m & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.w50
    /* JADX INFO: renamed from: e */
    public final void mo470e(ia1 ia1Var) {
        InterfaceC0508np interfaceC0508npMo1393s;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(gf1.m1905w());
        }
        na1 na1Var = this.f688n;
        if (na1Var != null) {
            ma1 ma1Var = this.f686m;
            ma1Var.getClass();
            C0485n4 c0485n4 = na1Var.f7082a;
            le1 le1Var = (le1) c0485n4.f6983i;
            if (!le1Var.f6077h || le1Var.f6079j) {
                return;
            }
            try {
                interfaceC0508npMo1393s = ((cg3) ma1Var).f1532a.mo1393s(new C0159ea(14, na1Var));
            } catch (CancellationException unused) {
                le1 le1Var2 = (le1) c0485n4.f6983i;
                if (!le1Var2.f6078i) {
                    if (le1Var2.f6079j) {
                        k22.m2599a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    le1Var2.m2902a();
                    le1Var2.f6079j = true;
                }
                interfaceC0508npMo1393s = null;
            }
            InterfaceC0508np interfaceC0508np = na1Var.f7085d;
            if (interfaceC0508np != null) {
                interfaceC0508np.cancel();
            }
            na1Var.f7085d = interfaceC0508npMo1393s;
        }
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return m450k(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        o62 o62VarM5708a;
        if (view == null || this.f675g0.f5492c) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !AbstractC0570p7.m3771g(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            pl0 pl0VarM4540a0 = rp0.m4540a0(((bl0) getFocusOwner()).f926c);
            o62VarM5708a = pl0VarM4540a0 != null ? rp0.m4544e0(pl0VarM4540a0) : null;
            if (o62VarM5708a == null) {
                o62VarM5708a = vk0.m5708a(view, this);
            }
        } else {
            o62VarM5708a = vk0.m5708a(view, this);
        }
        ok0 ok0VarM5711d = vk0.m5711d(i);
        int i2 = ok0VarM5711d != null ? ok0VarM5711d.f7701a : 6;
        o72 o72Var = new o72();
        if (((bl0) getFocusOwner()).m560e(i2, o62VarM5708a, new C0762u6(o72Var, 0)) == null) {
            return view;
        }
        Object obj = o72Var.f7574i;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || dd3.m1002j(rp0.m4544e0((pl0) obj), vk0.m5708a(viewFindNextFocus, this), o62VarM5708a, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public final C0493nc getAndroidViewsHandler$ui() {
        if (this.f672d0 == null) {
            C0493nc c0493nc = new C0493nc(getContext());
            this.f672d0 = c0493nc;
            addView(c0493nc, -1);
            requestLayout();
        }
        C0493nc c0493nc2 = this.f672d0;
        c0493nc2.getClass();
        return c0493nc2;
    }

    public InterfaceC0544oi getAutofill() {
        return this.f664T;
    }

    public AbstractC0695si getAutofillManager() {
        return this.f666U;
    }

    public C0735ti getAutofillTree() {
        return this.f646K;
    }

    public final C0440lx getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.f659Q0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.f660R.getValue();
    }

    public final ViewOnAttachStateChangeListenerC0837w7 getContentCaptureManager$ui() {
        return this.f640H;
    }

    public a20 getCoroutineContext() {
        return this.f702u;
    }

    public e70 getDensity() {
        return (e70) this.f696r.getValue();
    }

    public o62 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            pl0 pl0VarM4540a0 = rp0.m4540a0(((bl0) getFocusOwner()).f926c);
            if (pl0VarM4540a0 != null) {
                return rp0.m4544e0(pl0VarM4540a0);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return vk0.m5708a(viewFindFocus, this);
        }
        return null;
    }

    public yk0 getFocusOwner() {
        return this.f700t;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        o62 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f7536a);
            rect.top = Math.round(embeddedViewFocusRect.f7537b);
            rect.right = Math.round(embeddedViewFocusRect.f7538c);
            rect.bottom = Math.round(embeddedViewFocusRect.f7539d);
            return;
        }
        if (t11.m5086l(((bl0) getFocusOwner()).m560e(6, null, C0799v6.f11761j), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public xl0 getFontFamilyResolver() {
        return (xl0) this.f709x0.getValue();
    }

    public wl0 getFontLoader() {
        return this.f707w0;
    }

    public final ma1 getFrameEndScheduler$ui() {
        return this.f686m;
    }

    public nq0 getGraphicsContext() {
        return this.f644J;
    }

    public bs0 getHapticFeedBack() {
        return this.f713z0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f675g0.f5491b.m436w() || !this.f692p.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public vz0 getInputModeManager() {
        return this.f627A0;
    }

    public final b01 getInsetsListener() {
        return this.f628B;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f687m0;
    }

    @Override // android.view.View, android.view.ViewParent
    public d61 getLayoutDirection() {
        return (d61) this.f711y0.getValue();
    }

    public kc1 getLocaleList() {
        return (kc1) this.f662S.getValue();
    }

    public long getMeasureIteration() {
        kf1 kf1Var = this.f675g0;
        if (!kf1Var.f5492c) {
            kz0.m2763a("measureIteration should be only used during the measure/layout pass");
        }
        return kf1Var.f5496g;
    }

    public vh1 getModifierLocalManager() {
        return this.f629B0;
    }

    /* JADX INFO: renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public ViewTreeObserverOnGlobalLayoutListenerC0045b7 m6531getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public rz1 getPlacementScope() {
        int i = tz1.f11011b;
        return new ld1(1, this);
    }

    public n12 getPointerIconService() {
        return this.f665T0;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final ny0 m6524getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.f682k;
    }

    public q62 getRectManager() {
        return this.f634E;
    }

    public z92 getRetainedValuesStore() {
        return this.f690o;
    }

    public r61 getRoot() {
        return this.f630C;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        hh1 hh1Var;
        if (Build.VERSION.SDK_INT < 31 || (hh1Var = this.f661R0) == null) {
            return false;
        }
        return ((Boolean) ((nx1) hh1Var.f4019i).getValue()).booleanValue();
    }

    public tn2 getSemanticsOwner() {
        return this.f636F;
    }

    public t61 getSharedDrawScope() {
        return this.f684l;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? C0458me.f6582a.m3065a(this) : this.f671c0;
    }

    public bw1 getSnapshotObserver() {
        return this.f670b0;
    }

    public bt2 getSoftwareKeyboardController() {
        v60 v60Var = this.f705v0;
        if (v60Var != null) {
            return v60Var;
        }
        v60 v60Var2 = new v60(getTextInputService());
        this.f705v0 = v60Var2;
        return v60Var2;
    }

    public o03 getTextInputService() {
        o03 o03Var = this.f701t0;
        if (o03Var != null) {
            return o03Var;
        }
        o03 o03Var2 = new o03(getLegacyTextInputServiceAndroid());
        this.f701t0 = o03Var2;
        return o03Var2;
    }

    public n13 getTextToolbar() {
        return this.f631C0;
    }

    public final wa2 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public za3 getViewConfiguration() {
        return this.f626A;
    }

    public final AbstractC0569p6 getViewTreeOwners() {
        vi0.m5701t(this.f695q0.getValue());
        return null;
    }

    public td3 getWindowInfo() {
        return getComposeViewContext().f6366s;
    }

    public final C0119d6 get_autofillManager$ui() {
        return this.f666U;
    }

    /* JADX INFO: renamed from: l */
    public final void m471l(r61 r61Var, boolean z) {
        this.f675g0.m2656g(r61Var, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m472m(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7;
        removeCallbacks(this.f645J0);
        try {
            m458E(motionEvent);
            this.f689n0 = true;
            m478v(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.f633D0;
                boolean z = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                C0554os c0554os = this.f658Q;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!c0554os.f7820a) {
                                gd1 gd1Var = (gd1) ((hh1) c0554os.f7823d).f4019i;
                                int i = gd1Var.f3412k;
                                Object[] objArr = gd1Var.f3411j;
                                for (int i2 = 0; i2 < i; i2++) {
                                    objArr[i2] = null;
                                }
                                gd1Var.f3412k = 0;
                                gd1Var.f3409h = false;
                                ((us0) c0554os.f7822c).m5576c();
                            }
                        } else if (motionEvent3.getActionMasked() != 10 && z) {
                            m463J(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                boolean z2 = motionEvent.getToolType(0) == 3;
                if (z || !z2 || actionMasked2 == 3 || actionMasked2 == 9 || !m474r(motionEvent)) {
                    viewTreeObserverOnGlobalLayoutListenerC0045b7 = this;
                } else {
                    viewTreeObserverOnGlobalLayoutListenerC0045b7 = this;
                    viewTreeObserverOnGlobalLayoutListenerC0045b7.m463J(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = viewTreeObserverOnGlobalLayoutListenerC0045b7.f633D0;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = viewTreeObserverOnGlobalLayoutListenerC0045b7.f633D0;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    ii1 ii1Var = viewTreeObserverOnGlobalLayoutListenerC0045b7.f656P;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            ii1Var.f4637c.delete(pointerId);
                            ii1Var.f4636b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = viewTreeObserverOnGlobalLayoutListenerC0045b7.f633D0;
                        float x = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = viewTreeObserverOnGlobalLayoutListenerC0045b7.f633D0;
                        boolean z3 = (x == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = viewTreeObserverOnGlobalLayoutListenerC0045b7.f633D0;
                        boolean z4 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z3 || z4) {
                            if (pointerId >= 0) {
                                ii1Var.f4637c.delete(pointerId);
                                ii1Var.f4636b.delete(pointerId);
                            }
                            us0 us0Var = (us0) c0554os.f7822c;
                            if (us0Var.f11468d) {
                                us0Var.f11468d = true;
                            } else {
                                us0Var.f11471g.f2530a.m6428g();
                            }
                        }
                    }
                }
                viewTreeObserverOnGlobalLayoutListenerC0045b7.f633D0 = MotionEvent.obtainNoHistory(motionEvent);
                int iM462I = m462I(motionEvent);
                Trace.endSection();
                viewTreeObserverOnGlobalLayoutListenerC0045b7.f689n0 = false;
                return iM462I;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.f689n0 = false;
            throw th3;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m473o(r61 r61Var) {
        this.f675g0.m2664r(r61Var, false);
        zk1 zk1VarM4393y = r61Var.m4393y();
        Object[] objArr = zk1VarM4393y.f13934h;
        int i = zk1VarM4393y.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            m473o((r61) objArr[i2]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        z92 z92Var;
        Object obj;
        super.onAttachedToWindow();
        setAttached(true);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(gf1.m1905w());
        }
        this.f628B.onViewAttachedToWindow(this);
        int i2 = 0;
        if (i > 28) {
            if (f624Y0 == null) {
                RunnableC0450m6 runnableC0450m6 = new RunnableC0450m6();
                f624Y0 = runnableC0450m6;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (f620U0 == null) {
                        f620U0 = Class.forName("android.os.SystemProperties");
                    }
                    if (f622W0 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = f620U0;
                        f622W0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = f622W0;
                    if (method != null) {
                        method.invoke(null, runnableC0450m6);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            lk1 lk1Var = f623X0;
            synchronized (lk1Var) {
                lk1Var.m2925a(this);
            }
        }
        if (!this.f659Q0) {
            getComposeViewContext().m2982c();
        }
        this.f659Q0 = false;
        m473o(getRoot());
        m451n(getRoot());
        getSnapshotObserver().f1051a.m5437d();
        kj1 kj1Var = this.f664T;
        if (kj1Var != null) {
            C0581pi c0581pi = C0581pi.f8356a;
            c0581pi.getClass();
            ((AutofillManager) kj1Var.f5596k).registerCallback(c0581pi);
        }
        ia1 ia1Var = getComposeViewContext().f6350c;
        lb3 lb3Var = getComposeViewContext().f6352e;
        ma1 ma1Var = this.f686m;
        if (ia1Var == null || lb3Var == null || ma1Var == null) {
            z92Var = null;
        } else {
            kb3 viewModelStore = lb3Var.getViewModelStore();
            jb3 jb3Var = new jb3();
            r20 r20Var = r20.f9329b;
            viewModelStore.getClass();
            r20Var.getClass();
            kj1 kj1Var2 = new kj1(viewModelStore, jb3Var, r20Var);
            C0067bt c0067btM967a = d72.m967a(oa1.class);
            String strM590b = c0067btM967a.m590b();
            if (strM590b == null) {
                C0676s.m4651j("Local and anonymous classes can not be ViewModels");
                return;
            }
            oa1 oa1Var = (oa1) kj1Var2.m2698B(c0067btM967a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM590b));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            zj1 zj1Var = oa1Var.f7603b;
            Object objM6022b = zj1Var.m6022b(id);
            if (objM6022b == null) {
                objM6022b = new lk1(1);
                zj1Var.m6421h(id, objM6022b);
            }
            lk1 lk1Var2 = (lk1) objM6022b;
            Object[] objArr = lk1Var2.f6163a;
            int i3 = lk1Var2.f6164b;
            while (true) {
                if (i2 >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((na1) obj).f7084c) {
                    break;
                } else {
                    i2++;
                }
            }
            na1 na1Var = (na1) obj;
            if (na1Var == null) {
                na1Var = new na1();
                lk1Var2.m2925a(na1Var);
            }
            na1Var.f7084c = true;
            this.f688n = na1Var;
            z92Var = na1Var.f7083b;
        }
        if (z92Var == null) {
            z92Var = C0700sn.f10205I;
        }
        this.f690o = z92Var;
        in0 in0Var = this.f697r0;
        if (in0Var != null) {
            in0Var.mo5j(getComposeViewContext());
            this.f697r0 = null;
        }
        ba1 lifecycle = getComposeViewContext().f6350c.getLifecycle();
        lifecycle.mo505a(this);
        lifecycle.mo505a(this.f640H);
        this.f627A0.f12740a.setValue(new uz0(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            C0451m7.f6491a.m3039b(this);
        }
        C0119d6 c0119d6 = this.f666U;
        if (c0119d6 != null) {
            ((bl0) getFocusOwner()).f930g.m2925a(c0119d6);
            getSemanticsOwner().f10862d.m2925a(c0119d6);
        }
        ((bl0) getFocusOwner()).f930g.m2925a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        ip2 ip2Var = (ip2) this.f703u0.get();
        C0233ga c0233ga = (C0233ga) (ip2Var != null ? ip2Var.f4736b : null);
        if (c0233ga == null) {
            return getLegacyTextInputServiceAndroid().f8670d;
        }
        ip2 ip2Var2 = (ip2) c0233ga.f3374k.get();
        tz0 tz0Var = (tz0) (ip2Var2 != null ? ip2Var2.f4736b : null);
        return tz0Var != null && (tz0Var.f11009e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m465L(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        ip2 ip2Var = (ip2) this.f703u0.get();
        C0233ga c0233ga = (C0233ga) (ip2Var != null ? ip2Var.f4736b : null);
        if (c0233ga == null) {
            q03 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
            if (legacyTextInputServiceAndroid.f8670d) {
                xx0 xx0Var = legacyTextInputServiceAndroid.f8674h;
                k03 k03Var = legacyTextInputServiceAndroid.f8673g;
                int i2 = xx0Var.f13218e;
                boolean z = xx0Var.f13214a;
                if (i2 == 1) {
                    i = z ? 6 : 0;
                } else if (i2 == 0) {
                    i = 1;
                } else if (i2 == 2) {
                    i = 2;
                } else if (i2 == 6) {
                    i = 5;
                } else if (i2 == 5) {
                    i = 7;
                } else if (i2 == 3) {
                    i = 3;
                } else if (i2 == 4) {
                    i = 4;
                } else {
                    if (i2 != 7) {
                        C0676s.m4653l("invalid ImeAction");
                        return null;
                    }
                }
                editorInfo.imeOptions = i;
                int i3 = xx0Var.f13217d;
                if (i3 == 1) {
                    editorInfo.inputType = 1;
                } else if (i3 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i;
                } else if (i3 == 3) {
                    editorInfo.inputType = 2;
                } else if (i3 == 4) {
                    editorInfo.inputType = 3;
                } else if (i3 == 5) {
                    editorInfo.inputType = 17;
                } else if (i3 == 6) {
                    editorInfo.inputType = 33;
                } else if (i3 == 7) {
                    editorInfo.inputType = 129;
                } else if (i3 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i3 != 9) {
                        C0676s.m4653l("Invalid Keyboard Type");
                        return null;
                    }
                    editorInfo.inputType = 8194;
                }
                if (!z) {
                    int i4 = editorInfo.inputType;
                    if ((i4 & 1) == 1) {
                        editorInfo.inputType = i4 | 131072;
                        if (i2 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                int i5 = editorInfo.inputType;
                if ((i5 & 1) == 1) {
                    int i6 = xx0Var.f13215b;
                    if (i6 == 1) {
                        editorInfo.inputType = i5 | 4096;
                    } else if (i6 == 2) {
                        editorInfo.inputType = i5 | 8192;
                    } else if (i6 == 3) {
                        editorInfo.inputType = i5 | 16384;
                    }
                    if (xx0Var.f13216c) {
                        editorInfo.inputType |= AIChatConfig.MaxOutputTokens;
                    }
                }
                long j = k03Var.f5297b;
                int i7 = f13.f2738c;
                editorInfo.initialSelStart = (int) (j >> 32);
                editorInfo.initialSelEnd = (int) (j & 4294967295L);
                tp0.m5348L(editorInfo, k03Var.f5296a.f10051i);
                editorInfo.imeOptions |= 33554432;
                k62 k62Var = new k62(legacyTextInputServiceAndroid.f8673g, new hh1(22, legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.f8674h.f13216c);
                legacyTextInputServiceAndroid.f8675i.add(new WeakReference(k62Var));
                return k62Var;
            }
        } else {
            ip2 ip2Var2 = (ip2) c0233ga.f3374k.get();
            tz0 tz0Var = (tz0) (ip2Var2 != null ? ip2Var2.f4736b : null);
            if (tz0Var != null) {
                synchronized (tz0Var.f11007c) {
                    if (tz0Var.f11009e) {
                        return null;
                    }
                    l62 l62VarM5475a = tz0Var.f11005a.m5475a(editorInfo);
                    C0798v5 c0798v5 = new C0798v5(15, tz0Var);
                    InputConnection yr1Var = Build.VERSION.SDK_INT >= 34 ? new yr1(l62VarM5475a, c0798v5) : new xr1(l62VarM5475a, c0798v5);
                    tz0Var.f11008d.m6423b(new od3(yr1Var));
                    return yr1Var;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        qn2 qn2Var;
        ViewOnAttachStateChangeListenerC0837w7 viewOnAttachStateChangeListenerC0837w7 = this.f640H;
        viewOnAttachStateChangeListenerC0837w7.getClass();
        for (long j : jArr) {
            sn2 sn2Var = (sn2) viewOnAttachStateChangeListenerC0837w7.m5852f().m6022b((int) j);
            if (sn2Var != null && (qn2Var = sn2Var.f10248a) != null) {
                AbstractC0414l7.m2863o();
                ViewTranslationRequest.Builder builderM2859k = AbstractC0414l7.m2859k(viewOnAttachStateChangeListenerC0837w7.f12368h.getAutofillId(), qn2Var.f9052f);
                Object objM4505g = qn2Var.f9050d.f6221h.m4505g(vn2.f12043C);
                if (objM4505g == null) {
                    objM4505g = null;
                }
                List list = (List) objM4505g;
                if (list != null) {
                    builderM2859k.setValue("android:text", TranslationRequestValue.forText(new C0690sd(sb1.m4781a(list, "\n", null, 62))));
                    consumer.accept(builderM2859k.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.f628B.onViewDetachedFromWindow(this);
        View view = this.f698s;
        if (m452p() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            lk1 lk1Var = f623X0;
            synchronized (lk1Var) {
                lk1Var.m2934j(this);
            }
        }
        getComposeViewContext().m2981b();
        ts2 ts2Var = getSnapshotObserver().f1051a;
        rl1 rl1Var = ts2Var.f10954h;
        if (rl1Var != null) {
            rl1Var.m4512a();
        }
        ts2Var.m5434a();
        ba1 lifecycle = getComposeViewContext().f6350c.getLifecycle();
        lifecycle.mo506b(this.f640H);
        lifecycle.mo506b(this);
        kj1 kj1Var = this.f664T;
        if (kj1Var != null) {
            C0581pi c0581pi = C0581pi.f8356a;
            c0581pi.getClass();
            ((AutofillManager) kj1Var.f5596k).unregisterCallback(c0581pi);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        na1 na1Var = this.f688n;
        if (na1Var != null) {
            na1Var.f7084c = false;
        }
        this.f688n = null;
        if (i >= 31) {
            C0451m7.f6491a.m3038a(this);
        }
        C0119d6 c0119d6 = this.f666U;
        if (c0119d6 != null) {
            getSemanticsOwner().f10862d.m2934j(c0119d6);
            ((bl0) getFocusOwner()).f930g.m2934j(c0119d6);
        }
        q62 rectManager = getRectManager();
        rectManager.f8755f = rectManager.f8752c.m2045b(0L, 0L, null, 0, 0);
        getRectManager().m4061a();
        q62 rectManager2 = getRectManager();
        RunnableC0413l6 runnableC0413l6 = rectManager2.f8757h;
        if (runnableC0413l6 != null) {
            rectManager2.f8750a.removeCallbacks(runnableC0413l6);
            rectManager2.f8757h = null;
        }
        ((bl0) getFocusOwner()).f930g.m2934j(this);
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        bl0 bl0Var = (bl0) getFocusOwner();
        qp0.m4259n(bl0Var.f926c, true);
        if (bl0Var.m561f() != null) {
            pl0 pl0VarM561f = bl0Var.m561f();
            bl0Var.m564i(null);
            if (pl0VarM561f != null) {
                pl0VarM561f.m3872N0(kl0.f5626h, kl0.f5628j);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f687m0 = 0L;
        m466M();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        m465L(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.f687m0 = 0L;
            this.f675g0.m2658l(this.f653N0);
            this.f673e0 = null;
            m466M();
            if (this.f672d0 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        kf1 kf1Var = this.f675g0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m473o(getRoot());
            }
            long jM449j = m449j(i);
            long jM449j2 = m449j(i2);
            long jM4542c0 = rp0.m4542c0((int) (jM449j >>> 32), (int) (jM449j & 4294967295L), (int) (jM449j2 >>> 32), (int) (4294967295L & jM449j2));
            C0221fz c0221fz = this.f673e0;
            if (c0221fz == null) {
                this.f673e0 = new C0221fz(jM4542c0);
                this.f674f0 = false;
            } else if (!C0221fz.m1757b(c0221fz.f3199a, jM4542c0)) {
                this.f674f0 = true;
            }
            kf1Var.m2665s(jM4542c0);
            kf1Var.m2660n();
            setMeasuredDimension(getRoot().f9373N.f11795p.f10438h, getRoot().f9373N.f11795p.f10439i);
            if (this.f672d0 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f9373N.f11795p.f10438h, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f9373N.f11795p.f10439i, 1073741824));
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure != null) {
            C0119d6 c0119d6 = this.f666U;
            if (c0119d6 != null) {
                r61 r61Var = c0119d6.f1876i.f10859a;
                AutofillId autofillId = c0119d6.f1881n;
                String str = c0119d6.f1879l;
                q62 q62Var = c0119d6.f1878k;
                gf1.m1864L(viewStructure, r61Var, autofillId, str, q62Var);
                Object[] objArr = js1.f5195a;
                lk1 lk1Var = new lk1(2);
                lk1Var.m2925a(r61Var);
                lk1Var.m2925a(viewStructure);
                while (lk1Var.m2933i()) {
                    Object objM2935k = lk1Var.m2935k(lk1Var.f6164b - 1);
                    objM2935k.getClass();
                    ViewStructure viewStructure2 = (ViewStructure) objM2935k;
                    Object objM2935k2 = lk1Var.m2935k(lk1Var.f6164b - 1);
                    objM2935k2.getClass();
                    jk1 jk1Var = (jk1) ((r61) objM2935k2).m4382n();
                    int i2 = ((zk1) jk1Var.f5084i).f13936j;
                    for (int i3 = 0; i3 < i2; i3++) {
                        r61 r61Var2 = (r61) jk1Var.get(i3);
                        if (!r61Var2.f9383X && r61Var2.m4350H() && r61Var2.m4351I()) {
                            ln2 ln2VarM4391w = r61Var2.m4391w();
                            if (ln2VarM4391w != null) {
                                rk1 rk1Var = ln2VarM4391w.f6221h;
                                if (rk1Var.m4500b(kn2.f5665g) || rk1Var.m4500b(kn2.f5666h) || rk1Var.m4500b(vn2.f12075r) || rk1Var.m4500b(vn2.f12076s)) {
                                    ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    gf1.m1864L(viewStructureNewChild, r61Var2, autofillId, str, q62Var);
                                    lk1Var.m2925a(r61Var2);
                                    lk1Var.m2925a(viewStructureNewChild);
                                } else {
                                    lk1Var.m2925a(r61Var2);
                                    lk1Var.m2925a(viewStructure2);
                                }
                            }
                        }
                    }
                }
            }
            kj1 kj1Var = this.f664T;
            if (kj1Var != null) {
                C0735ti c0735ti = (C0735ti) kj1Var.f5595j;
                LinkedHashMap linkedHashMap = c0735ti.f10783a;
                LinkedHashMap linkedHashMap2 = c0735ti.f10783a;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    if (entry.getValue() != null) {
                        c80.m664g();
                        return;
                    }
                    ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                    viewStructureNewChild2.setAutofillId((AutofillId) kj1Var.f5597l, iIntValue);
                    viewStructureNewChild2.setId(iIntValue, ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) kj1Var.f5594i).getContext().getPackageName(), null, null);
                    viewStructureNewChild2.setAutofillType(1);
                    throw null;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        m12 m12Var;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (m12Var = ((C0873x6) getPointerIconService()).f12835a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return m12Var instanceof C0270ha ? PointerIcon.getSystemIcon(context, ((C0270ha) m12Var).f3929b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.f680j) {
            int[] iArr = vk0.f12001a;
            d61 d61Var = d61.f1885h;
            d61 d61Var2 = i != 0 ? i != 1 ? null : d61.f1886i : d61Var;
            if (d61Var2 != null) {
                d61Var = d61Var2;
            }
            setLayoutDirection(d61Var);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        hh1 hh1Var;
        if (Build.VERSION.SDK_INT < 31 || (hh1Var = this.f661R0) == null) {
            return;
        }
        tn2 semanticsOwner = getSemanticsOwner();
        a20 coroutineContext = getCoroutineContext();
        zk1 zk1Var = new zk1(new gl2[16]);
        AbstractC0570p7.m3761Q(semanticsOwner.m5334a(), 0, new fl2(1, 8, zk1.class, zk1Var, "add", "add(Ljava/lang/Object;)Z"));
        Arrays.sort(zk1Var.f13934h, 0, zk1Var.f13936j, new C0254gv(0, new in0[]{oq0.f7788z, oq0.f7767A}));
        int i = zk1Var.f13936j;
        gl2 gl2Var = (gl2) (i == 0 ? null : zk1Var.f13934h[i - 1]);
        if (gl2Var == null) {
            return;
        }
        d11 d11Var = gl2Var.f3577c;
        ScrollCaptureCallbackC0109cx scrollCaptureCallbackC0109cx = new ScrollCaptureCallbackC0109cx(gl2Var.f3575a, d11Var, AbstractC0731te.m5206e(coroutineContext), hh1Var, this);
        zn1 zn1Var = gl2Var.f3578d;
        o62 o62VarMo644J = s11.m4665J(zn1Var).mo644J(zn1Var, true);
        long j = (((long) d11Var.f1807a) << 32) | (((long) d11Var.f1808b) & 4294967295L);
        ScrollCaptureTarget scrollCaptureTargetM2854f = AbstractC0414l7.m2854f(this, rp0.m4553n0(up0.m5527F(o62VarMo644J)), new Point((int) (j >> 32), (int) (j & 4294967295L)), scrollCaptureCallbackC0109cx);
        scrollCaptureTargetM2854f.setScrollBounds(rp0.m4553n0(d11Var));
        consumer.accept(scrollCaptureTargetM2854f);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m466M();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this.f627A0.f12740a.setValue(new uz0(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC0837w7 viewOnAttachStateChangeListenerC0837w7 = this.f640H;
        viewOnAttachStateChangeListenerC0837w7.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (t11.m5086l(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            AbstractC0570p7.m3778n(viewOnAttachStateChangeListenerC0837w7, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC0837w7.f12368h.post(new RunnableC0724t7(0, viewOnAttachStateChangeListenerC0837w7, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zM1905w;
        this.f657P0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zM1905w = gf1.m1905w())) {
            return;
        }
        setShowLayoutBounds(zM1905w);
        m451n(getRoot());
    }

    /* JADX INFO: renamed from: r */
    public final boolean m474r(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2 = 1;
        if (!isFocused()) {
            ok0 ok0VarM5711d = vk0.m5711d(i);
            int i3 = ok0VarM5711d != null ? ok0VarM5711d.f7701a : 7;
            Boolean boolM560e = ((bl0) getFocusOwner()).m560e(i3, rect != null ? new o62(rect.left, rect.top, rect.right, rect.bottom) : null, new C0912y6(i3, 0));
            Boolean bool = Boolean.TRUE;
            if (!t11.m5086l(boolM560e, bool)) {
                if (!t11.m5086l(((bl0) getFocusOwner()).m560e(i3, null, new C0912y6(i3, i2)), bool)) {
                    if (hasFocus() && (i3 == 1 || i3 == 2)) {
                        return ((bl0) getFocusOwner()).m563h(i3);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m475s(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f633D0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.f638G.f3868o = j;
    }

    public final void setComposeViewContext(C0440lx c0440lx) {
        if (getCoroutineContext() != c0440lx.f6349b.mo1384j() && !((jk1) getRoot().m4382n()).isEmpty()) {
            kz0.m2763a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        vr2 vr2VarM5275B = AbstractC0738tl.m5275B();
        in0 in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
        vr2 vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
        try {
            C0440lx c0440lx2 = get_composeViewContext();
            if (c0440lx != c0440lx2) {
                if (isAttachedToWindow()) {
                    c0440lx2.m2981b();
                    c0440lx.m2982c();
                }
                set_composeViewContext(c0440lx);
                setCoroutineContext(c0440lx.f6349b.mo1384j());
            }
        } finally {
            AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.f659Q0 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.f660R.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(ViewOnAttachStateChangeListenerC0837w7 viewOnAttachStateChangeListenerC0837w7) {
        this.f640H = viewOnAttachStateChangeListenerC0837w7;
    }

    public void setCoroutineContext(a20 a20Var) {
        this.f702u = a20Var;
    }

    public final void setFrameEndScheduler$ui(ma1 ma1Var) {
        this.f686m = ma1Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.f687m0 = j;
    }

    public final void setOnReadyForComposition(in0 in0Var) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.f659Q0) {
            in0Var.mo5j(getComposeViewContext());
        } else {
            this.f697r0 = in0Var;
        }
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m6525setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(ny0 ny0Var) {
        this.f682k = ny0Var;
    }

    public void setShowLayoutBounds(boolean z) {
        this.f671c0 = z;
    }

    public void setUncaughtExceptionHandler(wa2 wa2Var) {
        this.f675g0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final void m476t(float[] fArr) {
        m457D();
        hf1.m2159e(fArr, this.f683k0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f691o0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f691o0 & 4294967295L));
        float[] fArr2 = this.f681j0;
        hf1.m2158d(fArr2);
        hf1.m2160f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        AbstractC0570p7.m3754J(fArr, fArr2);
    }

    /* JADX INFO: renamed from: u */
    public final long m477u(long j) {
        m457D();
        long jM2156b = hf1.m2156b(j, this.f683k0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f691o0 >> 32)) + Float.intBitsToFloat((int) (jM2156b >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f691o0 & 4294967295L)) + Float.intBitsToFloat((int) (jM2156b & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: v */
    public final void m478v(boolean z) {
        C0683s6 c0683s6;
        kf1 kf1Var = this.f675g0;
        if (kf1Var.f5491b.m436w() || ((zk1) kf1Var.f5494e.f2147i).f13936j != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    c0683s6 = this.f653N0;
                } finally {
                    Trace.endSection();
                }
            } else {
                c0683s6 = null;
            }
            if (kf1Var.m2658l(c0683s6)) {
                requestLayout();
            }
            kf1Var.m2653b(false);
            getRectManager().m4061a();
            if (this.f654O) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f654O = false;
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m479w(r61 r61Var, long j) {
        kf1 kf1Var = this.f675g0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            kf1Var.m2659m(r61Var, j);
            if (!kf1Var.f5491b.m436w()) {
                kf1Var.m2653b(false);
                getRectManager().m4061a();
                if (this.f654O) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f654O = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m480x(int i) {
        if (i != 7 && i != 8) {
            Integer numM5710c = vk0.m5710c(i);
            if (numM5710c == null) {
                throw vi0.m5686e("Invalid focus direction");
            }
            int iIntValue = numM5710c.intValue();
            pl0 pl0VarM561f = ((bl0) getFocusOwner()).m561f();
            if (pl0VarM561f == null) {
                C0676s.m4653l("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numM5710c2 = vk0.m5710c(i);
            if (numM5710c2 == null) {
                throw vi0.m5686e("Invalid focus direction");
            }
            int iIntValue2 = numM5710c2.intValue();
            ab3 ab3Var = sp0.m4933c0(pl0VarM561f).f9398v;
            View interopView = ab3Var != null ? ab3Var.getInteropView() : null;
            View viewFindFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
            if (viewFindNextFocus == null || interopView == null || !AbstractC0570p7.m3771g(interopView, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return vk0.m5709b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final void m481y() {
        lk1 lk1Var;
        Object[] objArr;
        if (this.f667V) {
            ts2 ts2Var = getSnapshotObserver().f1051a;
            synchronized (ts2Var.f10953g) {
                try {
                    zk1 zk1Var = ts2Var.f10952f;
                    int i = zk1Var.f13936j;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = zk1Var.f13934h;
                        if (i2 >= i) {
                            break;
                        }
                        ss2 ss2Var = (ss2) objArr[i2];
                        ss2Var.m4999d();
                        if (!ss2Var.f10354f.m4508j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = zk1Var.f13934h;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    zk1Var.f13936j = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f667V = false;
        }
        C0493nc c0493nc = this.f672d0;
        if (c0493nc != null) {
            m448i(c0493nc);
        }
        C0119d6 c0119d6 = this.f666U;
        if (c0119d6 != null) {
            ak1 ak1Var = c0119d6.f1882o;
            if (ak1Var.f236d == 0 && c0119d6.f1883p) {
                ((AutofillManager) c0119d6.f1875h.f4019i).commit();
                c0119d6.f1883p = false;
            }
            if (ak1Var.f236d != 0) {
                c0119d6.f1883p = true;
            }
        }
        while (this.f639G0.m2933i() && this.f639G0.m2930f(0) != null) {
            int i5 = this.f639G0.f6164b;
            int i6 = 0;
            while (true) {
                lk1Var = this.f639G0;
                if (i6 < i5) {
                    xm0 xm0Var = (xm0) lk1Var.m2930f(i6);
                    this.f639G0.m2938n(i6, null);
                    if (xm0Var != null) {
                        xm0Var.mo6a();
                    }
                    i6++;
                }
            }
            lk1Var.m2936l(0, i5);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m482z(r61 r61Var) {
        ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h7 = this.f638G;
        viewOnAttachStateChangeListenerC0267h7.f3848E = true;
        if (viewOnAttachStateChangeListenerC0267h7.m2108o()) {
            viewOnAttachStateChangeListenerC0267h7.m2109p(r61Var);
        }
        ViewOnAttachStateChangeListenerC0837w7 viewOnAttachStateChangeListenerC0837w7 = this.f640H;
        viewOnAttachStateChangeListenerC0837w7.f12374n = true;
        if (viewOnAttachStateChangeListenerC0837w7.m5853h()) {
            viewOnAttachStateChangeListenerC0837w7.f12375o.mo2225s(a83.f116a);
        }
    }

    /* JADX INFO: renamed from: getAccessibilityManager, reason: merged with bridge method [inline-methods] */
    public C0007a6 m6526getAccessibilityManager() {
        return this.f642I;
    }

    /* JADX INFO: renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public C0303i6 m6527getClipboard() {
        return this.f669a0;
    }

    /* JADX INFO: renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public C0338j6 m6528getClipboardManager() {
        return this.f668W;
    }

    public ViewOnDragListenerC0534o8 getDragAndDropManager() {
        return this.f704v;
    }

    public zj1 getLayoutNodes() {
        return this.f632D;
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

    @j70
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m6523getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @j70
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    public xa2 getRootForTest() {
        return this;
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui(wa2 wa2Var) {
    }
}
