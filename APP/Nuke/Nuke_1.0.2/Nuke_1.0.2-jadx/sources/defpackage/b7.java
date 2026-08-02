package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b7 extends ViewGroup implements zv1, xa2, w50, rv1, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, xk0 {
    public static Class U0;
    public static Method V0;
    public static Method W0;
    public static final lk1 X0 = new lk1();
    public static m6 Y0;
    public static Method Z0;
    public final zb A;
    public final wz0 A0;
    public final b01 B;
    public final vh1 B0;
    public final r61 C;
    public final rb C0;
    public final zj1 D;
    public MotionEvent D0;
    public final q62 E;
    public long E0;
    public final tn2 F;
    public final dq1 F0;
    public final h7 G;
    public final lk1 G0;
    public w7 H;
    public float H0;
    public final a6 I;
    public float I0;
    public final c9 J;
    public final y4 J0;
    public final ti K;
    public final k6 K0;
    public final lk1 L;
    public boolean L0;
    public lk1 M;
    public final yy0 M0;
    public boolean N;
    public final s6 N0;
    public boolean O;
    public final to O0;
    public final ii1 P;
    public boolean P0;
    public final os Q;
    public boolean Q0;
    public final nx1 R;
    public final hh1 R0;
    public final n70 S;
    public View S0;
    public final kj1 T;
    public final x6 T0;
    public final d6 U;
    public boolean V;
    public final j6 W;
    public final i6 a0;
    public final bw1 b0;
    public boolean c0;
    public nc d0;
    public fz e0;
    public boolean f0;
    public final kf1 g0;
    public final nx1 h;
    public long h0;
    public long i;
    public final int[] i0;
    public final boolean j;
    public final float[] j0;
    public ny0 k;
    public final float[] k0;
    public final t61 l;
    public final float[] l0;
    public ma1 m;
    public long m0;
    public na1 n;
    public boolean n0;
    public z92 o;
    public long o0;
    public final ag p;
    public final nx1 p0;
    public final k6 q;
    public final n70 q0;
    public final nx1 r;
    public in0 r0;
    public final View s;
    public q03 s0;
    public final bl0 t;
    public o03 t0;
    public a20 u;
    public final AtomicReference u0;
    public final o8 v;
    public v60 v0;
    public final k91 w;
    public final wl0 w0;
    public final nx1 x;
    public final xk1 x0;
    public final n70 y;
    public final nx1 y0;
    public final tp z;
    public final bs0 z0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public b7(Context context, lx lxVar) {
        super(context);
        this.h = op0.u(lxVar);
        this.i = 9205357640488583168L;
        int i = 1;
        this.j = true;
        this.l = lxVar.r;
        this.o = sn.I;
        this.p = new ag();
        int i2 = 0;
        this.q = new k6(this, i2);
        this.r = new nx1(se.m(context), sn.P);
        this.t = new bl0(this, this);
        this.u = lxVar.b.j();
        this.v = new o8();
        this.w = new k91();
        this.x = op0.u(Boolean.FALSE);
        this.y = op0.m(new s6(this, i2));
        this.z = lxVar.t;
        this.A = lxVar.q;
        this.B = new b01();
        int i3 = 3;
        r61 r61Var = new r61(3);
        r61Var.c0(ya2.c);
        r61Var.Z(getDensity());
        r61Var.e0(getViewConfiguration());
        r61Var.d0(new z6(this).c(((bl0) getFocusOwner()).e).c(getDragAndDropManager().c));
        this.C = r61Var;
        zj1 zj1Var = y01.a;
        this.D = new zj1();
        getLayoutNodes();
        this.E = new q62(this);
        this.F = new tn2(getRoot(), new de0(), getLayoutNodes());
        h7 h7Var = new h7(this);
        this.G = h7Var;
        this.H = new w7(this, new r6(0, this, p7.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0, 0));
        this.I = lxVar.j;
        this.J = new c9(this);
        this.K = new ti();
        this.L = new lk1();
        this.P = new ii1();
        r61 root = getRoot();
        os osVar = new os();
        osVar.b = root;
        osVar.c = new us0((qz0) root.M.d);
        osVar.d = new hh1(5);
        osVar.e = new xs0();
        this.Q = osVar;
        this.R = op0.u(new Configuration(context.getResources().getConfiguration()));
        this.S = op0.m(new s6(this, i));
        this.T = new kj1(this, getAutofillTree());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw vi0.e("Autofill service could not be located.");
        }
        this.U = new d6(new hh1(i3, autofillManager), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.W = lxVar.l;
        this.a0 = lxVar.m;
        this.b0 = new bw1(new w6(this, i));
        this.g0 = new kf1(getRoot());
        this.h0 = 9223372034707292159L;
        this.i0 = new int[]{0, 0};
        float[] fArrA = hf1.a();
        this.j0 = fArrA;
        this.k0 = hf1.a();
        this.l0 = hf1.a();
        this.m0 = -1L;
        this.o0 = 9187343241974906880L;
        this.p0 = op0.u(null);
        this.q0 = op0.m(new s6(this, i3));
        this.u0 = new AtomicReference(null);
        this.w0 = lxVar.n;
        this.x0 = lxVar.o;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = vk0.a;
        d61 d61Var = d61.h;
        d61 d61Var2 = layoutDirection != 0 ? layoutDirection != 1 ? null : d61.i : d61Var;
        this.y0 = op0.u(d61Var2 != null ? d61Var2 : d61Var);
        this.z0 = lxVar.p;
        int i4 = 2;
        this.A0 = new wz0(isInTouchMode() ? 1 : 2);
        vh1 vh1Var = new vh1();
        new zk1(new oj[16]);
        new zk1(new op0[16]);
        new zk1(new r61[16]);
        new zk1(new op0[16]);
        this.B0 = vh1Var;
        rb rbVar = new rb();
        new jx2(new ea(i, rbVar));
        this.C0 = rbVar;
        this.F0 = new dq1(20);
        this.G0 = new lk1();
        this.J0 = new y4(i4, this);
        this.K0 = new k6(this, i);
        this.M0 = new yy0(context, new w6(this, i2));
        this.N0 = new s6(this, i4);
        int i5 = Build.VERSION.SDK_INT;
        this.O0 = i5 < 29 ? new uo(fArrA) : new vo();
        addOnAttachStateChangeListener(this.H);
        setWillNotDraw(false);
        setFocusable(true);
        o7.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        wa3.a(this, h7Var);
        setOnDragListener(getDragAndDropManager());
        getRoot().d(this);
        if (i5 >= 29) {
            j7.a.a(this);
        }
        if (p()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.s = view;
            addView(view, -1);
        }
        this.R0 = i5 >= 31 ? new hh1(10) : null;
        this.T0 = new x6(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d(b7 b7Var, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        h7 h7Var = b7Var.G;
        if (t11.l(str, h7Var.K)) {
            int iD2 = h7Var.I.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!t11.l(str, h7Var.L) || (iD = h7Var.J.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.y.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final q03 getLegacyTextInputServiceAndroid() {
        q03 q03Var = this.s0;
        if (q03Var != null) {
            return q03Var;
        }
        q03 q03Var2 = new q03(getView(), this);
        this.s0 = q03Var2;
        return q03Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final lx get_composeViewContext() {
        return (lx) this.h.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final p6 get_viewTreeOwners() {
        vi0.t(this.p0.getValue());
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void i(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof b7) {
                ((b7) childAt).y();
            } else if (childAt instanceof ViewGroup) {
                i((ViewGroup) childAt);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long j(int i) {
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
    public static View k(View view, int i) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (t11.l(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View viewK = k(viewGroup.getChildAt(i2), i);
                    if (viewK != null) {
                        return viewK;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void n(r61 r61Var) {
        r61Var.D();
        zk1 zk1VarY = r61Var.y();
        Object[] objArr = zk1VarY.h;
        int i = zk1VarY.j;
        for (int i2 = 0; i2 < i; i2++) {
            n((r61) objArr[i2]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean p() {
        return Build.VERSION.SDK_INT >= 35;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean q(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !ji1.a.a(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setAttached(boolean z) {
        this.x.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setDensity(e70 e70Var) {
        this.r.setValue(e70Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setFontFamilyResolver(xl0 xl0Var) {
        this.x0.setValue(xl0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void setLayoutDirection(d61 d61Var) {
        this.y0.setValue(d61Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void set_composeViewContext(lx lxVar) {
        this.h.setValue(lxVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void set_viewTreeOwners(p6 p6Var) {
        this.p0.setValue(p6Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void A(r61 r61Var, boolean z, boolean z2, boolean z3) {
        r61 r61VarU;
        r61 r61VarU2;
        kf1 kf1Var = this.g0;
        if (!z) {
            if (kf1Var.r(r61Var, z2) && z3) {
                G(r61Var);
                return;
            }
            return;
        }
        b5 b5Var = kf1Var.b;
        r61 r61Var2 = r61Var.o;
        v61 v61Var = r61Var.N;
        if (r61Var2 == null) {
            kz0.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iOrdinal = v61Var.d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    c80.s();
                    return;
                }
                if (!v61Var.e || z2) {
                    v61Var.e = true;
                    v61Var.p.A = true;
                    if (r61Var.X) {
                        return;
                    }
                    if ((t11.l(r61Var.J(), Boolean.TRUE) || kf1.i(r61Var)) && ((r61VarU = r61Var.u()) == null || !r61VarU.N.e)) {
                        b5Var.j(r61Var, a21.h);
                    } else if ((r61Var.I() || kf1.j(r61Var)) && ((r61VarU2 = r61Var.u()) == null || !r61VarU2.q())) {
                        b5Var.j(r61Var, a21.j);
                    }
                    if (kf1Var.d || !z3) {
                        return;
                    }
                    G(r61Var);
                    return;
                }
                return;
            }
        }
        kf1Var.h.b(new jf1(r61Var, true, z2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void B(r61 r61Var, boolean z, boolean z2) {
        v61 v61Var = r61Var.N;
        a21 a21Var = a21.k;
        kf1 kf1Var = this.g0;
        if (!z) {
            kf1Var.getClass();
            int iOrdinal = v61Var.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                c80.s();
                return;
            }
            r61 r61VarU = r61Var.u();
            boolean z3 = r61VarU == null || r61VarU.I();
            if (!z2) {
                if (r61Var.q()) {
                    return;
                }
                if (r61Var.p() && r61Var.I() == z3 && r61Var.I() == v61Var.p.z) {
                    return;
                }
            }
            mf1 mf1Var = v61Var.p;
            mf1Var.B = true;
            mf1Var.C = true;
            if (!r61Var.X && mf1Var.z && z3) {
                if ((r61VarU == null || !r61VarU.p()) && (r61VarU == null || !r61VarU.q())) {
                    kf1Var.b.j(r61Var, a21Var);
                }
                if (kf1Var.d) {
                    return;
                }
                G(null);
                return;
            }
            return;
        }
        b5 b5Var = kf1Var.b;
        int iOrdinal2 = v61Var.d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    c80.s();
                    return;
                }
            }
        }
        if ((v61Var.e || v61Var.f) && !z2) {
            return;
        }
        v61Var.f = true;
        v61Var.g = true;
        mf1 mf1Var2 = v61Var.p;
        mf1Var2.B = true;
        mf1Var2.C = true;
        if (r61Var.X) {
            return;
        }
        r61 r61VarU2 = r61Var.u();
        if (t11.l(r61Var.J(), Boolean.TRUE) && ((r61VarU2 == null || !r61VarU2.N.e) && (r61VarU2 == null || !r61VarU2.N.f))) {
            b5Var.j(r61Var, a21.i);
        } else if (r61Var.I() && ((r61VarU2 == null || !r61VarU2.p()) && (r61VarU2 == null || !r61VarU2.q()))) {
            b5Var.j(r61Var, a21Var);
        }
        if (kf1Var.d) {
            return;
        }
        G(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void C() {
        h7 h7Var = this.G;
        h7Var.E = true;
        Handler handler = h7Var.k.getHandler();
        if (h7Var.o() && !h7Var.P && handler != null) {
            h7Var.P = true;
            handler.post(h7Var.R);
        }
        w7 w7Var = this.H;
        w7Var.n = true;
        Handler handler2 = w7Var.h.getHandler();
        if (!w7Var.h() || w7Var.t || handler2 == null) {
            return;
        }
        w7Var.t = true;
        handler2.post(w7Var.u);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void D() {
        if (this.n0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.m0) {
            this.m0 = jCurrentAnimationTimeMillis;
            to toVar = this.O0;
            float[] fArr = this.k0;
            toVar.a(this, fArr);
            fg1.y(fArr, this.l0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.i0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.o0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void E(MotionEvent motionEvent) {
        this.m0 = AnimationUtils.currentAnimationTimeMillis();
        to toVar = this.O0;
        float[] fArr = this.k0;
        toVar.a(this, fArr);
        fg1.y(fArr, this.l0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jB = hf1.b((((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.o0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean F() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void G(r61 r61Var) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (r61Var != null) {
            while (r61Var != null && r61Var.r() == p61.h) {
                if (!this.f0) {
                    r61 r61VarU = r61Var.u();
                    if (r61VarU == null) {
                        break;
                    }
                    long j = ((qz0) r61VarU.M.d).k;
                    if (fz.f(j) && fz.e(j)) {
                        break;
                    }
                }
                r61Var = r61Var.u();
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long H(long j) {
        D();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.o0 >> 32));
        return hf1.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.o0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.l0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int I(MotionEvent motionEvent) {
        Object obj;
        if (this.P0) {
            this.P0 = false;
            k91 k91Var = getComposeViewContext().s;
            int metaState = motionEvent.getMetaState();
            k91Var.getClass();
            ud3.a.setValue(new v12(metaState));
        }
        ii1 ii1Var = this.P;
        dq1 dq1VarC = ii1Var.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        os osVar = this.Q;
        if (dq1VarC == null) {
            if (!osVar.a) {
                gd1 gd1Var = (gd1) ((hh1) osVar.d).i;
                int i = gd1Var.k;
                Object[] objArr = gd1Var.j;
                for (int i2 = 0; i2 < i; i2++) {
                    objArr[i2] = null;
                }
                gd1Var.k = 0;
                gd1Var.h = false;
                ((us0) osVar.c).c();
            }
            return 0;
        }
        List list = (List) dq1VarC.i;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i3 = size - 1;
                obj = list.get(size);
                if (((q12) obj).e && (actionMasked == 0 || actionMasked == 5)) {
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
            this.i = q12Var.d;
        }
        int iA = osVar.a(dq1VarC, this, r(motionEvent));
        dq1VarC.j = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iA & 1) != 0) {
            return iA;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        ii1Var.c.delete(pointerId);
        ii1Var.b.delete(pointerId);
        return iA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void J(MotionEvent motionEvent, int i, long j, boolean z) {
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
            long jU = u((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jU >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jU & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        dq1 dq1VarC = this.P.c(motionEventObtain, this);
        dq1VarC.getClass();
        this.Q.a(dq1VarC, this, true);
        motionEventObtain.recycle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(mn0 mn0Var, u00 u00Var) {
        a7 a7Var;
        if (u00Var instanceof a7) {
            a7Var = (a7) u00Var;
            int i = a7Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                a7Var.m = i - Integer.MIN_VALUE;
            } else {
                a7Var = new a7(this, u00Var);
            }
        }
        Object obj = a7Var.k;
        int i2 = a7Var.m;
        if (i2 == 0) {
            fg1.T(obj);
            w6 w6Var = new w6(this, 2);
            a7Var.m = 1;
            if (te.u(new k9(w6Var, this.u0, mn0Var, null, 8), a7Var) == k20.h) {
                return;
            }
        } else {
            if (i2 != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            fg1.T(obj);
        }
        s.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void L(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (t11.l(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(se.m(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) != 0) {
            this.w.getClass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M() {
        boolean z;
        int i;
        int[] iArr = this.i0;
        getLocationOnScreen(iArr);
        long j = this.h0;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 != i4 || i3 != iArr[1] || this.m0 < 0) {
            this.h0 = (4294967295L & ((long) iArr[1])) | (((long) i4) << 32);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                zk1 zk1VarY = getRoot().y();
                Object[] objArr = zk1VarY.h;
                int i5 = zk1VarY.j;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((r61) objArr[i6]).N.p.v0();
                }
                z = true;
            }
        }
        D();
        View rootView = this.S0;
        if (rootView == null) {
            rootView = getRootView();
            this.S0 = rootView;
        }
        q62 rectManager = getRectManager();
        long j2 = this.h0;
        long J = tp0.J(this.o0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.k0;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = (((fArr[0] == 1.0f && fArr[1] == 0.0f && fArr[2] == 0.0f && fArr[4] == 0.0f && fArr[5] == 1.0f && fArr[6] == 0.0f && fArr[8] == 0.0f && fArr[9] == 0.0f && fArr[10] == 1.0f) ? 1 : 0) << 1) | ((fArr[12] == 0.0f && fArr[13] == 0.0f && fArr[14] == 0.0f && fArr[15] == 1.0f) ? 1 : 0);
        }
        h23 h23Var = rectManager.c;
        if ((i & 2) != 0) {
            fArr = null;
        }
        rectManager.f = h23Var.b(j2, J, fArr, width, height) || rectManager.f;
        this.g0.b(z);
        getRectManager().a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void N(float f) {
        if (p()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.H0) || f > this.H0) {
                    this.H0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.I0) || f < this.I0) {
                    this.I0 = f;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xk0
    public final void a(pl0 pl0Var, pl0 pl0Var2) {
        vn1 vn1Var;
        boolean z;
        vn1 vn1Var2;
        boolean z2;
        if (pl0Var != null) {
            pl0 pl0Var3 = pl0Var;
            if (!pl0Var3.h.u) {
                kz0.b("visitAncestors called on an unattached node");
            }
            th1 th1Var = pl0Var3.h;
            r61 r61VarC0 = sp0.c0(pl0Var);
            sk1 sk1Var = null;
            ArrayList arrayList = null;
            while (r61VarC0 != null) {
                if ((((th1) r61VarC0.M.g).k & 2097152) != 0) {
                    while (th1Var != null) {
                        if ((th1Var.j & 2097152) != 0) {
                            th1 th1VarM = th1Var;
                            zk1 zk1Var = null;
                            while (th1VarM != null) {
                                if (th1VarM instanceof wy0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(th1VarM);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (th1VarM.j & 2097152) != 0 && (th1VarM instanceof u60)) {
                                    int i = 0;
                                    for (th1 th1Var2 = ((u60) th1VarM).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                                        if ((th1Var2.j & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                th1VarM = th1Var2;
                                            } else {
                                                if (zk1Var == null) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (th1VarM != null) {
                                                    zk1Var.b(th1VarM);
                                                    th1VarM = null;
                                                }
                                                zk1Var.b(th1Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                th1VarM = sp0.m(zk1Var);
                            }
                        }
                        th1Var = th1Var.l;
                    }
                }
                r61VarC0 = r61VarC0.u();
                th1Var = (r61VarC0 == null || (vn1Var2 = r61VarC0.M) == null) ? null : (qx2) vn1Var2.f;
            }
            if (arrayList == null) {
                return;
            }
            if (pl0Var2 != null) {
                if (!pl0Var2.h.u) {
                    kz0.b("visitAncestors called on an unattached node");
                }
                th1 th1Var3 = pl0Var2.h;
                r61 r61VarC02 = sp0.c0(pl0Var2);
                sk1 sk1Var2 = null;
                while (r61VarC02 != null) {
                    if ((((th1) r61VarC02.M.g).k & 2097152) != 0) {
                        while (th1Var3 != null) {
                            if ((th1Var3.j & 2097152) != 0) {
                                th1 th1VarM2 = th1Var3;
                                zk1 zk1Var2 = null;
                                while (th1VarM2 != null) {
                                    if (th1VarM2 instanceof wy0) {
                                        if (sk1Var2 == null) {
                                            sk1 sk1Var3 = fd2.a;
                                            sk1Var2 = new sk1();
                                        }
                                        sk1Var2.a(th1VarM2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (th1VarM2.j & 2097152) != 0 && (th1VarM2 instanceof u60)) {
                                        int i2 = 0;
                                        for (th1 th1Var4 = ((u60) th1VarM2).w; th1Var4 != null; th1Var4 = th1Var4.m) {
                                            if ((th1Var4.j & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    th1VarM2 = th1Var4;
                                                } else {
                                                    if (zk1Var2 == null) {
                                                        zk1Var2 = new zk1(new th1[16]);
                                                    }
                                                    if (th1VarM2 != null) {
                                                        zk1Var2.b(th1VarM2);
                                                        th1VarM2 = null;
                                                    }
                                                    zk1Var2.b(th1Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    th1VarM2 = sp0.m(zk1Var2);
                                }
                            }
                            th1Var3 = th1Var3.l;
                        }
                    }
                    r61VarC02 = r61VarC02.u();
                    th1Var3 = (r61VarC02 == null || (vn1Var = r61VarC02.M) == null) ? null : (qx2) vn1Var.f;
                }
                sk1Var = sk1Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                wy0 wy0Var = (wy0) arrayList.get(i3);
                if (!(sk1Var != null ? sk1Var.c(wy0Var) : false)) {
                    wy0Var.C();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        pl0 pl0Var = ((bl0) getFocusOwner()).c;
        if (!pl0Var.u) {
            return;
        }
        if (!pl0Var.h.u) {
            kz0.b("visitSubtreeIf called on an unattached node");
        }
        zk1 zk1Var = new zk1(new th1[16]);
        th1 th1Var = pl0Var.h;
        th1 th1Var2 = th1Var.m;
        if (th1Var2 == null) {
            sp0.k(zk1Var, th1Var);
        } else {
            zk1Var.b(th1Var2);
        }
        while (true) {
            int i3 = zk1Var.j;
            if (i3 == 0) {
                return;
            }
            th1 th1Var3 = (th1) zk1Var.k(i3 - 1);
            if ((th1Var3.k & 1024) != 0) {
                for (th1 th1Var4 = th1Var3; th1Var4 != null && th1Var4.u; th1Var4 = th1Var4.m) {
                    if ((th1Var4.j & 1024) != 0) {
                        th1 th1VarM = th1Var4;
                        zk1 zk1Var2 = null;
                        while (th1VarM != null) {
                            int i4 = 0;
                            if (th1VarM instanceof pl0) {
                                pl0 pl0Var2 = (pl0) th1VarM;
                                if (pl0Var2.u && pl0Var2.O0().a) {
                                    super.addFocusables(arrayList, i, i2);
                                    pl0 pl0Var3 = ((bl0) getFocusOwner()).c;
                                    if (pl0Var3.u) {
                                        if (!pl0Var3.h.u) {
                                            kz0.b("visitSubtreeIf called on an unattached node");
                                        }
                                        zk1 zk1Var3 = new zk1(new th1[16]);
                                        th1 th1Var5 = pl0Var3.h;
                                        th1 th1Var6 = th1Var5.m;
                                        if (th1Var6 == null) {
                                            sp0.k(zk1Var3, th1Var5);
                                        } else {
                                            zk1Var3.b(th1Var6);
                                        }
                                        while (true) {
                                            int i5 = zk1Var3.j;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            th1 th1Var7 = (th1) zk1Var3.k(i5 - 1);
                                            if ((th1Var7.k & 1024) != 0) {
                                                for (th1 th1Var8 = th1Var7; th1Var8 != null && th1Var8.u; th1Var8 = th1Var8.m) {
                                                    if ((th1Var8.j & 1024) != 0) {
                                                        th1 th1VarM2 = th1Var8;
                                                        zk1 zk1Var4 = null;
                                                        while (th1VarM2 != null) {
                                                            if (th1VarM2 instanceof pl0) {
                                                                pl0 pl0Var4 = (pl0) th1VarM2;
                                                                if (pl0Var4.u) {
                                                                    el0 el0VarO0 = pl0Var4.O0();
                                                                    if (pl0Var4.u && !pl0Var4.v && el0VarO0.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((th1VarM2.j & 1024) != 0 && (th1VarM2 instanceof u60)) {
                                                                int i6 = 0;
                                                                for (th1 th1Var9 = ((u60) th1VarM2).w; th1Var9 != null; th1Var9 = th1Var9.m) {
                                                                    if ((th1Var9.j & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            th1VarM2 = th1Var9;
                                                                        } else {
                                                                            if (zk1Var4 == null) {
                                                                                zk1Var4 = new zk1(new th1[16]);
                                                                            }
                                                                            if (th1VarM2 != null) {
                                                                                zk1Var4.b(th1VarM2);
                                                                                th1VarM2 = null;
                                                                            }
                                                                            zk1Var4.b(th1Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            th1VarM2 = sp0.m(zk1Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            sp0.k(zk1Var3, th1Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((th1VarM.j & 1024) != 0 && (th1VarM instanceof u60)) {
                                for (th1 th1Var10 = ((u60) th1VarM).w; th1Var10 != null; th1Var10 = th1Var10.m) {
                                    if ((th1Var10.j & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            th1VarM = th1Var10;
                                        } else {
                                            if (zk1Var2 == null) {
                                                zk1Var2 = new zk1(new th1[16]);
                                            }
                                            if (th1VarM != null) {
                                                zk1Var2.b(th1VarM);
                                                th1VarM = null;
                                            }
                                            zk1Var2.b(th1Var10);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            th1VarM = sp0.m(zk1Var2);
                        }
                    }
                }
            }
            sp0.k(zk1Var, th1Var3);
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
        ln2 ln2VarW;
        in0 in0Var;
        in0 in0Var2;
        d6 d6Var = this.U;
        if (d6Var != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                r61 r61Var = (r61) d6Var.i.c.b(iKeyAt);
                if (r61Var != null && (ln2VarW = r61Var.w()) != null) {
                    rk1 rk1Var = ln2VarW.h;
                    Object objG = rk1Var.g(kn2.g);
                    if (objG == null) {
                        objG = null;
                    }
                    q3 q3Var = (q3) objG;
                    if (q3Var != null && (in0Var2 = (in0) q3Var.b) != null) {
                    }
                    Object objG2 = rk1Var.g(kn2.h);
                    q3 q3Var2 = (q3) (objG2 != null ? objG2 : null);
                    if (q3Var2 != null && (in0Var = (in0) q3Var2.b) != null) {
                    }
                }
            }
        }
        kj1 kj1Var = this.T;
        if (kj1Var != null) {
            ti tiVar = (ti) kj1Var.j;
            if (tiVar.a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (tiVar.a.get(Integer.valueOf(iKeyAt2)) != null) {
                        c80.g();
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w50
    public final void b(ia1 ia1Var) {
        na1 na1Var = this.n;
        if (na1Var != null) {
            le1 le1Var = (le1) na1Var.a.i;
            if (le1Var.h && !le1Var.j) {
                np npVar = na1Var.d;
                if (npVar != null) {
                    npVar.cancel();
                }
                na1Var.d = null;
                return;
            }
            if (le1Var.i) {
                return;
            }
            if (!le1Var.j) {
                k22.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!le1Var.k.i()) {
                k22.a("Attempted to start retaining exited values with pending exited values");
            }
            le1Var.j = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.G.f(false, i, this.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.G.f(true, i, this.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        lk1 lk1Var = this.L;
        if (!isAttachedToWindow()) {
            n(getRoot());
        }
        v(true);
        ds2.j().m();
        this.N = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            tp tpVar = this.z;
            f6 f6Var = tpVar.a;
            Canvas canvas2 = f6Var.a;
            f6Var.a = canvas;
            getRoot().i(f6Var, null);
            tpVar.a.a = canvas2;
            if (lk1Var.i()) {
                int i = lk1Var.b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((sq0) ((yv1) lk1Var.f(i2))).g();
                }
            }
            int i3 = cb3.h;
            lk1Var.d();
            this.N = false;
            Trace.endSection();
            lk1 lk1Var2 = this.M;
            if (lk1Var2 != null) {
                lk1Var.b(lk1Var2);
                lk1Var2.d();
            }
            if (p()) {
                re.a(this, this.H0);
                View view = this.s;
                if (view != null) {
                    re.a(view, this.I0);
                    if (!Float.isNaN(this.I0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.H0 = Float.NaN;
                this.I0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:319:0x04d5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:456:0x06b5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:608:0x050e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:615:0x04e8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:618:0x04de */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:649:0x06e5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:658:0x06c6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:661:0x06be */
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
        e9 e9Var;
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
        ?? M;
        wy0 wy0Var2;
        boolean z2;
        int size;
        int size2;
        vn1 vn1Var3;
        boolean z3;
        ?? r4;
        vn1 vn1Var4;
        ?? M2;
        boolean z4;
        o6 o6Var;
        int size3;
        vn1 vn1Var5;
        boolean z5;
        th1 th1VarM;
        vn1 vn1Var6;
        if (this.L0) {
            k6 k6Var = this.K0;
            removeCallbacks(k6Var);
            if (motionEvent.getActionMasked() == 8) {
                this.L0 = false;
            } else {
                k6Var.run();
            }
        }
        if (q(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        String str3 = "visitAncestors called on an unattached node";
        int actionIndex = -1;
        int i5 = 1;
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (m(motionEvent) & 4) != 0;
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
            if (bl0Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            pl0 pl0VarA0 = rp0.a0(bl0Var.c);
            if (pl0VarA0 != null) {
                if (!pl0VarA0.h.u) {
                    kz0.b("visitAncestors called on an unattached node");
                }
                th1 th1Var = pl0VarA0.h;
                r61 r61VarC0 = sp0.c0(pl0VarA0);
                loop0: while (true) {
                    if (r61VarC0 == null) {
                        th1VarM = null;
                        break;
                    }
                    if ((((th1) r61VarC0.M.g).k & 16384) != 0) {
                        while (th1Var != null) {
                            if ((th1Var.j & 16384) != 0) {
                                th1VarM = th1Var;
                                zk1 zk1Var = null;
                                while (th1VarM != null) {
                                    if (th1VarM instanceof o6) {
                                        break loop0;
                                    }
                                    if ((th1VarM.j & 16384) != 0 && (th1VarM instanceof u60)) {
                                        int i6 = 0;
                                        for (th1 th1Var2 = ((u60) th1VarM).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                                            if ((th1Var2.j & 16384) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    th1VarM = th1Var2;
                                                } else {
                                                    if (zk1Var == null) {
                                                        zk1Var = new zk1(new th1[16]);
                                                    }
                                                    if (th1VarM != null) {
                                                        zk1Var.b(th1VarM);
                                                        th1VarM = null;
                                                    }
                                                    zk1Var.b(th1Var2);
                                                }
                                            }
                                        }
                                        if (i6 == 1) {
                                        }
                                    }
                                    th1VarM = sp0.m(zk1Var);
                                }
                            }
                            th1Var = th1Var.l;
                        }
                    }
                    r61VarC0 = r61VarC0.u();
                    th1Var = (r61VarC0 == null || (vn1Var6 = r61VarC0.M) == null) ? null : (qx2) vn1Var6.f;
                }
                o6Var = (o6) th1VarM;
            } else {
                o6Var = null;
            }
            if (o6Var != null) {
                if (!o6Var.h.u) {
                    kz0.b("visitAncestors called on an unattached node");
                }
                th1 th1Var3 = o6Var.h.l;
                r61 r61VarC02 = sp0.c0(o6Var);
                ArrayList arrayList = null;
                while (r61VarC02 != null) {
                    if ((((th1) r61VarC02.M.g).k & 16384) != 0) {
                        while (th1Var3 != null) {
                            if ((th1Var3.j & 16384) != 0) {
                                th1 th1VarM2 = th1Var3;
                                zk1 zk1Var2 = null;
                                while (th1VarM2 != null) {
                                    if (th1VarM2 instanceof o6) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(th1VarM2);
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z5 && (th1VarM2.j & 16384) != 0 && (th1VarM2 instanceof u60)) {
                                        int i7 = 0;
                                        for (th1 th1Var4 = ((u60) th1VarM2).w; th1Var4 != null; th1Var4 = th1Var4.m) {
                                            if ((th1Var4.j & 16384) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    th1VarM2 = th1Var4;
                                                } else {
                                                    if (zk1Var2 == null) {
                                                        zk1Var2 = new zk1(new th1[16]);
                                                    }
                                                    if (th1VarM2 != null) {
                                                        zk1Var2.b(th1VarM2);
                                                        th1VarM2 = null;
                                                    }
                                                    zk1Var2.b(th1Var4);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    th1VarM2 = sp0.m(zk1Var2);
                                }
                            }
                            th1Var3 = th1Var3.l;
                        }
                    }
                    r61VarC02 = r61VarC02.u();
                    th1Var3 = (r61VarC02 == null || (vn1Var5 = r61VarC02.M) == null) ? null : (qx2) vn1Var5.f;
                }
                if (arrayList != null && arrayList.size() - 1 >= 0) {
                    while (true) {
                        int i8 = size3 - 1;
                        ((o6) arrayList.get(size3)).getClass();
                        if (i8 < 0) {
                            break;
                        }
                        size3 = i8;
                    }
                }
                th1 th1VarM3 = o6Var.h;
                zk1 zk1Var3 = null;
                while (th1VarM3 != null) {
                    if (!(th1VarM3 instanceof o6) && (th1VarM3.j & 16384) != 0 && (th1VarM3 instanceof u60)) {
                        int i9 = 0;
                        for (th1 th1Var5 = ((u60) th1VarM3).w; th1Var5 != null; th1Var5 = th1Var5.m) {
                            if ((th1Var5.j & 16384) != 0) {
                                i9++;
                                if (i9 == 1) {
                                    th1VarM3 = th1Var5;
                                } else {
                                    if (zk1Var3 == null) {
                                        zk1Var3 = new zk1(new th1[16]);
                                    }
                                    if (th1VarM3 != null) {
                                        zk1Var3.b(th1VarM3);
                                        th1VarM3 = null;
                                    }
                                    zk1Var3.b(th1Var5);
                                }
                            }
                        }
                        if (i9 == 1) {
                        }
                    }
                    th1VarM3 = sp0.m(zk1Var3);
                }
                if (!super.dispatchGenericMotionEvent(motionEvent)) {
                    th1 th1VarM4 = o6Var.h;
                    zk1 zk1Var4 = null;
                    while (th1VarM4 != null) {
                        if (!(th1VarM4 instanceof o6) && (th1VarM4.j & 16384) != 0 && (th1VarM4 instanceof u60)) {
                            int i10 = 0;
                            for (th1 th1Var6 = ((u60) th1VarM4).w; th1Var6 != null; th1Var6 = th1Var6.m) {
                                if ((th1Var6.j & 16384) != 0) {
                                    i10++;
                                    if (i10 == 1) {
                                        th1VarM4 = th1Var6;
                                    } else {
                                        if (zk1Var4 == null) {
                                            zk1Var4 = new zk1(new th1[16]);
                                        }
                                        if (th1VarM4 != null) {
                                            zk1Var4.b(th1VarM4);
                                            th1VarM4 = null;
                                        }
                                        zk1Var4.b(th1Var6);
                                    }
                                }
                            }
                            if (i10 == 1) {
                            }
                        }
                        th1VarM4 = sp0.m(zk1Var4);
                    }
                    if (arrayList != null) {
                        int size4 = arrayList.size();
                        for (int i11 = 0; i11 < size4; i11++) {
                            ((o6) arrayList.get(i11)).getClass();
                        }
                    }
                }
            }
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        ny0 ny0Var2 = this.k;
        ii1 ii1Var = this.P;
        gd1 gd1Var = ii1Var.e;
        SparseLongArray sparseLongArray = ii1Var.b;
        int actionMasked = motionEvent.getActionMasked();
        ii1Var.b(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            ii1Var.c.clear();
            str = "visitAncestors called on an unattached node";
            i = 16;
            e9Var = null;
        } else {
            ii1Var.a(motionEvent);
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
                    jValueAt = ii1Var.a;
                    ny0Var = ny0Var2;
                    ii1Var.a = jValueAt + 1;
                    sparseLongArray.put(pointerId, jValueAt);
                }
                ii1 ii1Var2 = ii1Var;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getX(i12))) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY(i12))) & 4294967295L);
                ?? r32 = i12 != actionIndex ? i13 : 0;
                int iQ = rg3.q(gd1Var.i, gd1Var.k, jValueAt);
                if (iQ < 0 || (obj = gd1Var.j[iQ]) == te.c) {
                    obj = null;
                }
                hi1 hi1Var = (hi1) obj;
                if (i12 == actionIndex) {
                    gd1Var.f(jValueAt);
                    j = jValueAt;
                    j2 = 2147483647L;
                    c = ' ';
                    i3 = 65535;
                } else {
                    if (z6) {
                        j2 = 2147483647L;
                        i3 = 65535;
                        j = jValueAt;
                        gd1Var.d(j, new hi1(1 | ((motionEvent.getEventTime() & 2147483647L) << i13) | (((long) ((((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))) & 65535) | (((short) Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))) << 16))) << 32)));
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
                long eventTime2 = hi1Var != null ? (hi1Var.a >> i13) & j3 : motionEvent.getEventTime();
                if (hi1Var != null) {
                    i4 = i15;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits((short) (r5 & i14))) & 4294967295L) | (((long) Float.floatToRawIntBits((short) (((int) (hi1Var.a >>> c)) >>> 16))) << c);
                } else {
                    i4 = i15;
                    jFloatToRawIntBits = jFloatToRawIntBits2;
                }
                arrayList2.add(new oy0(j, eventTime, jFloatToRawIntBits2, r32, pressure, eventTime2, jFloatToRawIntBits, hi1Var != null ? (hi1Var.a & 1) != 0 ? i13 : 0 : 0));
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
            ii1Var.e(motionEvent);
            if (ny0Var3 != null) {
                i2 = ny0Var3.a;
            } else {
                if (!motionEvent.isFromSource(2097152)) {
                    s.j("MotionEvent must be a touch navigation source");
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
            e9Var = new e9(arrayList2, i2, motionEvent);
        }
        yy0 yy0Var = this.M0;
        if (e9Var == null) {
            pl0 pl0VarF = ((bl0) getFocusOwner()).f();
            if (pl0VarF != null) {
                if (!pl0VarF.h.u) {
                    kz0.b(str);
                }
                th1 th1Var7 = pl0VarF.h;
                r61 r61VarC03 = sp0.c0(pl0VarF);
                loop26: while (true) {
                    if (r61VarC03 == null) {
                        r3 = 0;
                        break;
                    }
                    int i17 = 2097152;
                    if ((((th1) r61VarC03.M.g).k & 2097152) != 0) {
                        while (th1Var7 != null) {
                            if ((th1Var7.j & i17) != 0) {
                                r3 = th1Var7;
                                ?? r42 = 0;
                                while (r3 != 0) {
                                    if (r3 instanceof wy0) {
                                        break loop26;
                                    }
                                    ?? zk1Var5 = r42;
                                    if ((r3.j & i17) != 0) {
                                        zk1Var5 = r42;
                                        if (r3 instanceof u60) {
                                            th1 th1Var8 = ((u60) r3).w;
                                            int i18 = 0;
                                            M = r3;
                                            zk1Var5 = r42;
                                            while (th1Var8 != null) {
                                                if ((th1Var8.j & i17) != 0) {
                                                    i18++;
                                                    zk1Var5 = zk1Var5;
                                                    if (i18 == 1) {
                                                        M = th1Var8;
                                                    } else {
                                                        if (zk1Var5 == 0) {
                                                            zk1Var5 = new zk1(new th1[16]);
                                                        }
                                                        if (M != 0) {
                                                            zk1Var5.b(M);
                                                            M = 0;
                                                        }
                                                        zk1Var5.b(th1Var8);
                                                    }
                                                }
                                                th1Var8 = th1Var8.m;
                                                i17 = 2097152;
                                                M = M;
                                                zk1Var5 = zk1Var5;
                                            }
                                            zk1Var5 = zk1Var5;
                                            if (i18 != 1) {
                                                M = sp0.m(zk1Var5);
                                            }
                                        }
                                    }
                                    i17 = 2097152;
                                    r3 = M;
                                    r42 = zk1Var5;
                                }
                            }
                            th1Var7 = th1Var7.l;
                            i17 = 2097152;
                        }
                    }
                    r61VarC03 = r61VarC03.u();
                    th1Var7 = (r61VarC03 == null || (vn1Var2 = r61VarC03.M) == null) ? null : (qx2) vn1Var2.f;
                }
                wy0Var = (wy0) r3;
            } else {
                wy0Var = null;
            }
            if (wy0Var != null) {
                th1 th1Var9 = (th1) wy0Var;
                if (!th1Var9.h.u) {
                    kz0.b(str);
                }
                th1 th1Var10 = th1Var9.h.l;
                r61 r61VarC04 = sp0.c0(wy0Var);
                ArrayList arrayList3 = null;
                while (r61VarC04 != null) {
                    int i19 = 2097152;
                    if ((((th1) r61VarC04.M.g).k & 2097152) != 0) {
                        while (th1Var10 != null) {
                            if ((th1Var10.j & i19) != 0) {
                                th1 th1VarM5 = th1Var10;
                                zk1 zk1Var6 = null;
                                while (th1VarM5 != null) {
                                    if (th1VarM5 instanceof wy0) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        arrayList3.add(th1VarM5);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        if ((th1VarM5.j & 2097152) != 0 && (th1VarM5 instanceof u60)) {
                                            int i20 = 0;
                                            for (th1 th1Var11 = ((u60) th1VarM5).w; th1Var11 != null; th1Var11 = th1Var11.m) {
                                                if ((th1Var11.j & 2097152) != 0) {
                                                    i20++;
                                                    if (i20 == 1) {
                                                        th1VarM5 = th1Var11;
                                                    } else {
                                                        if (zk1Var6 == null) {
                                                            zk1Var6 = new zk1(new th1[16]);
                                                        }
                                                        if (th1VarM5 != null) {
                                                            zk1Var6.b(th1VarM5);
                                                            th1VarM5 = null;
                                                        }
                                                        zk1Var6.b(th1Var11);
                                                    }
                                                }
                                            }
                                            if (i20 == 1) {
                                            }
                                        }
                                    }
                                    th1VarM5 = sp0.m(zk1Var6);
                                }
                            }
                            i19 = 2097152;
                            th1Var10 = th1Var10.l;
                        }
                    }
                    r61VarC04 = r61VarC04.u();
                    th1Var10 = (r61VarC04 == null || (vn1Var = r61VarC04.M) == null) ? null : (qx2) vn1Var.f;
                }
                wy0Var.C();
                if (arrayList3 != null) {
                    int size5 = arrayList3.size();
                    for (int i21 = 0; i21 < size5; i21++) {
                        ((wy0) arrayList3.get(i21)).C();
                    }
                }
            }
            yy0Var.b = 0;
            yy0Var.c = true;
            return true;
        }
        bl0 bl0Var2 = (bl0) getFocusOwner();
        if (bl0Var2.d.e) {
            System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        } else {
            pl0 pl0VarF2 = bl0Var2.f();
            if (pl0VarF2 != null) {
                if (!pl0VarF2.h.u) {
                    kz0.b(str);
                }
                th1 th1Var12 = pl0VarF2.h;
                r61 r61VarC05 = sp0.c0(pl0VarF2);
                loop14: while (true) {
                    if (r61VarC05 == null) {
                        r4 = 0;
                        break;
                    }
                    int i22 = 2097152;
                    if ((((th1) r61VarC05.M.g).k & 2097152) != 0) {
                        while (th1Var12 != null) {
                            if ((th1Var12.j & i22) != 0) {
                                r4 = th1Var12;
                                ?? r5 = 0;
                                while (r4 != 0) {
                                    if (r4 instanceof wy0) {
                                        break loop14;
                                    }
                                    ?? zk1Var7 = r5;
                                    if ((r4.j & i22) != 0) {
                                        zk1Var7 = r5;
                                        if (r4 instanceof u60) {
                                            th1 th1Var13 = ((u60) r4).w;
                                            int i23 = 0;
                                            M2 = r4;
                                            zk1Var7 = r5;
                                            while (th1Var13 != null) {
                                                if ((th1Var13.j & i22) != 0) {
                                                    i23++;
                                                    zk1Var7 = zk1Var7;
                                                    if (i23 == 1) {
                                                        M2 = th1Var13;
                                                    } else {
                                                        if (zk1Var7 == 0) {
                                                            zk1Var7 = new zk1(new th1[i]);
                                                        }
                                                        if (M2 != 0) {
                                                            zk1Var7.b(M2);
                                                            M2 = 0;
                                                        }
                                                        zk1Var7.b(th1Var13);
                                                    }
                                                }
                                                th1Var13 = th1Var13.m;
                                                i = 16;
                                                i22 = 2097152;
                                                M2 = M2;
                                                zk1Var7 = zk1Var7;
                                            }
                                            zk1Var7 = zk1Var7;
                                            if (i23 != 1) {
                                                M2 = sp0.m(zk1Var7);
                                            }
                                        }
                                    }
                                    i = 16;
                                    i22 = 2097152;
                                    r4 = M2;
                                    r5 = zk1Var7;
                                }
                            }
                            th1Var12 = th1Var12.l;
                            i = 16;
                            i22 = 2097152;
                        }
                    }
                    r61VarC05 = r61VarC05.u();
                    th1Var12 = (r61VarC05 == null || (vn1Var4 = r61VarC05.M) == null) ? null : (qx2) vn1Var4.f;
                    i = 16;
                }
                wy0Var2 = (wy0) r4;
            } else {
                wy0Var2 = null;
            }
            if (wy0Var2 != null) {
                th1 th1Var14 = (th1) wy0Var2;
                if (!th1Var14.h.u) {
                    kz0.b(str);
                }
                th1 th1Var15 = th1Var14.h.l;
                r61 r61VarC06 = sp0.c0(wy0Var2);
                ArrayList arrayList4 = null;
                while (r61VarC06 != null) {
                    int i24 = 2097152;
                    if ((((th1) r61VarC06.M.g).k & 2097152) != 0) {
                        while (th1Var15 != null) {
                            if ((th1Var15.j & i24) != 0) {
                                th1 th1VarM6 = th1Var15;
                                zk1 zk1Var8 = null;
                                while (th1VarM6 != null) {
                                    if (th1VarM6 instanceof wy0) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new ArrayList();
                                        }
                                        arrayList4.add(th1VarM6);
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        int i25 = 2097152;
                                        if ((th1VarM6.j & 2097152) != 0 && (th1VarM6 instanceof u60)) {
                                            th1 th1Var16 = ((u60) th1VarM6).w;
                                            int i26 = 0;
                                            while (th1Var16 != null) {
                                                if ((th1Var16.j & i25) != 0) {
                                                    i26++;
                                                    if (i26 == 1) {
                                                        th1VarM6 = th1Var16;
                                                    } else {
                                                        if (zk1Var8 == null) {
                                                            zk1Var8 = new zk1(new th1[16]);
                                                        }
                                                        if (th1VarM6 != null) {
                                                            zk1Var8.b(th1VarM6);
                                                            th1VarM6 = null;
                                                        }
                                                        zk1Var8.b(th1Var16);
                                                    }
                                                }
                                                th1Var16 = th1Var16.m;
                                                i25 = 2097152;
                                            }
                                            if (i26 == 1) {
                                            }
                                        }
                                    }
                                    th1VarM6 = sp0.m(zk1Var8);
                                }
                            }
                            th1Var15 = th1Var15.l;
                            i24 = 2097152;
                        }
                    }
                    r61VarC06 = r61VarC06.u();
                    th1Var15 = (r61VarC06 == null || (vn1Var3 = r61VarC06.M) == null) ? null : (qx2) vn1Var3.f;
                }
                i12 i12Var = i12.h;
                if (arrayList4 != null && arrayList4.size() - 1 >= 0) {
                    while (true) {
                        int i27 = size2 - 1;
                        ((wy0) arrayList4.get(size2)).H(e9Var, i12Var);
                        if (i27 < 0) {
                            break;
                        }
                        size2 = i27;
                    }
                }
                wy0Var2.H(e9Var, i12Var);
                i12 i12Var2 = i12.i;
                wy0Var2.H(e9Var, i12Var2);
                if (arrayList4 != null) {
                    int size6 = arrayList4.size();
                    for (int i28 = 0; i28 < size6; i28++) {
                        ((wy0) arrayList4.get(i28)).H(e9Var, i12Var2);
                    }
                }
                i12 i12Var3 = i12.j;
                if (arrayList4 != null && arrayList4.size() - 1 >= 0) {
                    while (true) {
                        int i29 = size - 1;
                        ((wy0) arrayList4.get(size)).H(e9Var, i12Var3);
                        if (i29 < 0) {
                            break;
                        }
                        size = i29;
                    }
                }
                wy0Var2.H(e9Var, i12Var3);
            }
            ArrayList arrayList5 = (ArrayList) e9Var.j;
            int size7 = arrayList5.size();
            for (int i30 = 0; i30 < size7; i30++) {
                if (((oy0) arrayList5.get(i30)).i) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        yy0Var.getClass();
        MotionEvent motionEvent2 = (MotionEvent) e9Var.k;
        int action = motionEvent2.getAction();
        if (action != 0) {
            z4 = true;
            if ((action == 1 || action == 2) && z2) {
                yy0Var.b = 0;
                yy0Var.c = true;
            }
        } else {
            z4 = true;
            yy0Var.b = e9Var.i;
            yy0Var.c = false;
        }
        yy0Var.d.onTouchEvent(motionEvent2);
        return z4;
    }

    /* JADX DEBUG: Class process forced to load method for inline: h7.x(h7, int, int, java.lang.Integer, int):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0159  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean z = this.L0;
        k6 k6Var = this.K0;
        if (z) {
            removeCallbacks(k6Var);
            k6Var.run();
        }
        if (!q(motionEvent) && isAttachedToWindow()) {
            h7 h7Var = this.G;
            b7 b7Var = h7Var.k;
            AccessibilityManager accessibilityManager = h7Var.n;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    b7Var.v(true);
                    xs0 xs0Var = new xs0();
                    r61 root = b7Var.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
                    vn1 vn1Var = root.M;
                    zn1 zn1Var = (zn1) vn1Var.e;
                    ca2 ca2Var = zn1.T;
                    ((zn1) vn1Var.e).X0(zn1.X, zn1Var.P0(jFloatToRawIntBits), xs0Var, 1, true);
                    lk1 lk1Var = xs0Var.h;
                    for (int i2 = lk1Var.b - 1; -1 < i2; i2--) {
                        Object objF = lk1Var.f(i2);
                        objF.getClass();
                        r61 r61VarC0 = sp0.c0((th1) objF);
                        if (b7Var.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(r61VarC0) != null) {
                            break;
                        }
                        if (r61VarC0.M.m(8)) {
                            int iT = h7Var.t(r61VarC0.i);
                            qn2 qn2VarN = rp0.N(r61VarC0, false);
                            if (xe1.M(qn2VarN)) {
                                if (!qn2VarN.k().h.c(vn2.B)) {
                                    i = iT;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i = Integer.MIN_VALUE;
                    b7Var.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i3 = h7Var.l;
                    if (i3 != i) {
                        h7Var.l = i;
                        h7.x(h7Var, i, 128, null, 12);
                        h7.x(h7Var, i3, 256, null, 12);
                    }
                } else if (action == 10) {
                    int i4 = h7Var.l;
                    if (i4 == Integer.MIN_VALUE) {
                        b7Var.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    } else if (i4 != Integer.MIN_VALUE) {
                        h7Var.l = Integer.MIN_VALUE;
                        h7.x(h7Var, Integer.MIN_VALUE, 128, null, 12);
                        h7.x(h7Var, i4, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && r(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.D0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.D0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.L0 = true;
                        postDelayed(k6Var, 8L);
                        return false;
                    }
                } else if ((m(motionEvent) & 1) != 0) {
                    return true;
                }
            } else if (s(motionEvent)) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i = 0;
        if (!isFocused()) {
            return ((bl0) getFocusOwner()).d(keyEvent, new t6(i, this, keyEvent));
        }
        k91 k91Var = getComposeViewContext().s;
        int metaState = keyEvent.getMetaState();
        k91Var.getClass();
        ud3.a.setValue(new v12(metaState));
        return ((bl0) getFocusOwner()).d(keyEvent, jy.r) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        vn1 vn1Var;
        if (isFocused()) {
            bl0 bl0Var = (bl0) getFocusOwner();
            if (bl0Var.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                pl0 pl0VarA0 = rp0.a0(bl0Var.c);
                if (pl0VarA0 != null) {
                    if (!pl0VarA0.h.u) {
                        kz0.b("visitAncestors called on an unattached node");
                    }
                    th1 th1Var = pl0VarA0.h;
                    r61 r61VarC0 = sp0.c0(pl0VarA0);
                    while (r61VarC0 != null) {
                        if ((((th1) r61VarC0.M.g).k & 131072) != 0) {
                            while (th1Var != null) {
                                if ((th1Var.j & 131072) != 0) {
                                    th1 th1VarM = th1Var;
                                    zk1 zk1Var = null;
                                    while (th1VarM != null) {
                                        if ((th1VarM.j & 131072) != 0 && (th1VarM instanceof u60)) {
                                            int i = 0;
                                            for (th1 th1Var2 = ((u60) th1VarM).w; th1Var2 != null; th1Var2 = th1Var2.m) {
                                                if ((th1Var2.j & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        th1VarM = th1Var2;
                                                    } else {
                                                        if (zk1Var == null) {
                                                            zk1Var = new zk1(new th1[16]);
                                                        }
                                                        if (th1VarM != null) {
                                                            zk1Var.b(th1VarM);
                                                            th1VarM = null;
                                                        }
                                                        zk1Var.b(th1Var2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        th1VarM = sp0.m(zk1Var);
                                    }
                                }
                                th1Var = th1Var.l;
                            }
                        }
                        r61VarC0 = r61VarC0.u();
                        th1Var = (r61VarC0 == null || (vn1Var = r61VarC0.M) == null) ? null : (qx2) vn1Var.f;
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
            i7.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object ygVar;
        pl0 pl0VarF;
        if (this.L0) {
            k6 k6Var = this.K0;
            removeCallbacks(k6Var);
            MotionEvent motionEvent2 = this.D0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.L0 = false;
            } else {
                k6Var.run();
            }
        }
        if (!q(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || s(motionEvent))) {
            int iM = m(motionEvent);
            if ((iM & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (ygVar = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    ygVar = new yg(1);
                }
                if (ygVar.equals(new yg(1)) && (pl0VarF = ((bl0) getFocusOwner()).f()) != null) {
                    zn1 zn1VarB0 = sp0.b0(pl0VarF);
                    if (!s11.J(zn1VarB0).J(zn1VarB0, true).a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        ((bl0) getFocusOwner()).b(8, false, true);
                    }
                }
            }
            if ((iM & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w50
    public final void e(ia1 ia1Var) {
        np npVarS;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(gf1.w());
        }
        na1 na1Var = this.n;
        if (na1Var != null) {
            ma1 ma1Var = this.m;
            ma1Var.getClass();
            n4 n4Var = na1Var.a;
            le1 le1Var = (le1) n4Var.i;
            if (!le1Var.h || le1Var.j) {
                return;
            }
            try {
                npVarS = ((cg3) ma1Var).a.s(new ea(14, na1Var));
            } catch (CancellationException unused) {
                le1 le1Var2 = (le1) n4Var.i;
                if (!le1Var2.i) {
                    if (le1Var2.j) {
                        k22.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    le1Var2.a();
                    le1Var2.j = true;
                }
                npVarS = null;
            }
            np npVar = na1Var.d;
            if (npVar != null) {
                npVar.cancel();
            }
            na1Var.d = npVarS;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return k(this, i);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        o62 o62VarA;
        if (view == null || this.g0.c) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !p7.g(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            pl0 pl0VarA0 = rp0.a0(((bl0) getFocusOwner()).c);
            o62VarA = pl0VarA0 != null ? rp0.e0(pl0VarA0) : null;
            if (o62VarA == null) {
                o62VarA = vk0.a(view, this);
            }
        } else {
            o62VarA = vk0.a(view, this);
        }
        ok0 ok0VarD = vk0.d(i);
        int i2 = ok0VarD != null ? ok0VarD.a : 6;
        o72 o72Var = new o72();
        if (((bl0) getFocusOwner()).e(i2, o62VarA, new u6(o72Var, 0)) == null) {
            return view;
        }
        Object obj = o72Var.i;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || dd3.j(rp0.e0((pl0) obj), vk0.a(viewFindNextFocus, this), o62VarA, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final nc getAndroidViewsHandler$ui() {
        if (this.d0 == null) {
            nc ncVar = new nc(getContext());
            this.d0 = ncVar;
            addView(ncVar, -1);
            requestLayout();
        }
        nc ncVar2 = this.d0;
        ncVar2.getClass();
        return ncVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public oi getAutofill() {
        return this.T;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public si getAutofillManager() {
        return this.U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ti getAutofillTree() {
        return this.K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final lx getComposeViewContext() {
        return get_composeViewContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.Q0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Configuration getConfiguration() {
        return (Configuration) this.R.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final w7 getContentCaptureManager$ui() {
        return this.H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a20 getCoroutineContext() {
        return this.u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e70 getDensity() {
        return (e70) this.r.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o62 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            pl0 pl0VarA0 = rp0.a0(((bl0) getFocusOwner()).c);
            if (pl0VarA0 != null) {
                return rp0.e0(pl0VarA0);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return vk0.a(viewFindFocus, this);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yk0 getFocusOwner() {
        return this.t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        o62 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.b);
            rect.right = Math.round(embeddedViewFocusRect.c);
            rect.bottom = Math.round(embeddedViewFocusRect.d);
            return;
        }
        if (t11.l(((bl0) getFocusOwner()).e(6, null, v6.j), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xl0 getFontFamilyResolver() {
        return (xl0) this.x0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public wl0 getFontLoader() {
        return this.w0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ma1 getFrameEndScheduler$ui() {
        return this.m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public nq0 getGraphicsContext() {
        return this.J;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bs0 getHapticFeedBack() {
        return this.z0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getHasPendingMeasureOrLayout() {
        return this.g0.b.w() || !this.p.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vz0 getInputModeManager() {
        return this.A0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final b01 getInsetsListener() {
        return this.B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.m0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View, android.view.ViewParent
    public d61 getLayoutDirection() {
        return (d61) this.y0.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kc1 getLocaleList() {
        return (kc1) this.S.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getMeasureIteration() {
        kf1 kf1Var = this.g0;
        if (!kf1Var.c) {
            kz0.a("measureIteration should be only used during the measure/layout pass");
        }
        return kf1Var.g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vh1 getModifierLocalManager() {
        return this.B0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: getOutOfFrameExecutor()Lrv1; */
    /* JADX INFO: renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public b7 m9getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public rz1 getPlacementScope() {
        int i = tz1.b;
        return new ld1(1, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n12 getPointerIconService() {
        return this.T0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final ny0 m2getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public q62 getRectManager() {
        return this.E;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z92 getRetainedValuesStore() {
        return this.o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r61 getRoot() {
        return this.C;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getScrollCaptureInProgress$ui() {
        hh1 hh1Var;
        if (Build.VERSION.SDK_INT < 31 || (hh1Var = this.R0) == null) {
            return false;
        }
        return ((Boolean) ((nx1) hh1Var.i).getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tn2 getSemanticsOwner() {
        return this.F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t61 getSharedDrawScope() {
        return this.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? me.a.a(this) : this.c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bw1 getSnapshotObserver() {
        return this.b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public bt2 getSoftwareKeyboardController() {
        v60 v60Var = this.v0;
        if (v60Var != null) {
            return v60Var;
        }
        v60 v60Var2 = new v60(getTextInputService());
        this.v0 = v60Var2;
        return v60Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public o03 getTextInputService() {
        o03 o03Var = this.t0;
        if (o03Var != null) {
            return o03Var;
        }
        o03 o03Var2 = new o03(getLegacyTextInputServiceAndroid());
        this.t0 = o03Var2;
        return o03Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n13 getTextToolbar() {
        return this.C0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final wa2 getUncaughtExceptionHandler$ui() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public za3 getViewConfiguration() {
        return this.A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final p6 getViewTreeOwners() {
        vi0.t(this.q0.getValue());
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public td3 getWindowInfo() {
        return getComposeViewContext().s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final d6 get_autofillManager$ui() {
        return this.U;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(r61 r61Var, boolean z) {
        this.g0.g(r61Var, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m(MotionEvent motionEvent) {
        int actionMasked;
        MotionEvent motionEvent2;
        b7 b7Var;
        removeCallbacks(this.J0);
        try {
            E(motionEvent);
            this.n0 = true;
            v(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent3 = this.D0;
                boolean z = motionEvent3 != null && motionEvent3.getToolType(0) == 3;
                os osVar = this.Q;
                if (motionEvent3 != null) {
                    try {
                        if (!((motionEvent3.getSource() == motionEvent.getSource() && motionEvent3.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                            motionEvent2 = motionEvent3;
                        } else if (motionEvent3.getButtonState() != 0 || (actionMasked = motionEvent3.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                            motionEvent2 = motionEvent3;
                            if (!osVar.a) {
                                gd1 gd1Var = (gd1) ((hh1) osVar.d).i;
                                int i = gd1Var.k;
                                Object[] objArr = gd1Var.j;
                                for (int i2 = 0; i2 < i; i2++) {
                                    objArr[i2] = null;
                                }
                                gd1Var.k = 0;
                                gd1Var.h = false;
                                ((us0) osVar.c).c();
                            }
                        } else if (motionEvent3.getActionMasked() != 10 && z) {
                            J(motionEvent3, 10, motionEvent3.getEventTime(), true);
                            motionEvent2 = motionEvent3;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                boolean z2 = motionEvent.getToolType(0) == 3;
                if (z || !z2 || actionMasked2 == 3 || actionMasked2 == 9 || !r(motionEvent)) {
                    b7Var = this;
                } else {
                    b7Var = this;
                    b7Var.J(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent4 = b7Var.D0;
                if (motionEvent4 != null && motionEvent4.getAction() == 10) {
                    MotionEvent motionEvent5 = b7Var.D0;
                    int pointerId = motionEvent5 != null ? motionEvent5.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    ii1 ii1Var = b7Var.P;
                    if (action == 9 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            ii1Var.c.delete(pointerId);
                            ii1Var.b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent6 = b7Var.D0;
                        float x = motionEvent6 != null ? motionEvent6.getX() : Float.NaN;
                        MotionEvent motionEvent7 = b7Var.D0;
                        boolean z3 = (x == motionEvent.getX() && (motionEvent7 != null ? motionEvent7.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent8 = b7Var.D0;
                        boolean z4 = (motionEvent8 != null ? motionEvent8.getEventTime() : -1L) != motionEvent.getEventTime();
                        if (z3 || z4) {
                            if (pointerId >= 0) {
                                ii1Var.c.delete(pointerId);
                                ii1Var.b.delete(pointerId);
                            }
                            us0 us0Var = (us0) osVar.c;
                            if (us0Var.d) {
                                us0Var.d = true;
                            } else {
                                us0Var.g.a.g();
                            }
                        }
                    }
                }
                b7Var.D0 = MotionEvent.obtainNoHistory(motionEvent);
                int I = I(motionEvent);
                Trace.endSection();
                b7Var.n0 = false;
                return I;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.n0 = false;
            throw th3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void o(r61 r61Var) {
        this.g0.r(r61Var, false);
        zk1 zk1VarY = r61Var.y();
        Object[] objArr = zk1VarY.h;
        int i = zk1VarY.j;
        for (int i2 = 0; i2 < i; i2++) {
            o((r61) objArr[i2]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        z92 z92Var;
        Object obj;
        super.onAttachedToWindow();
        setAttached(true);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(gf1.w());
        }
        this.B.onViewAttachedToWindow(this);
        int i2 = 0;
        if (i > 28) {
            if (Y0 == null) {
                m6 m6Var = new m6();
                Y0 = m6Var;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (U0 == null) {
                        U0 = Class.forName("android.os.SystemProperties");
                    }
                    if (W0 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = U0;
                        W0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = W0;
                    if (method != null) {
                        method.invoke(null, m6Var);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            lk1 lk1Var = X0;
            synchronized (lk1Var) {
                lk1Var.a(this);
            }
        }
        if (!this.Q0) {
            getComposeViewContext().c();
        }
        this.Q0 = false;
        o(getRoot());
        n(getRoot());
        getSnapshotObserver().a.d();
        kj1 kj1Var = this.T;
        if (kj1Var != null) {
            pi piVar = pi.a;
            piVar.getClass();
            ((AutofillManager) kj1Var.k).registerCallback(piVar);
        }
        ia1 ia1Var = getComposeViewContext().c;
        lb3 lb3Var = getComposeViewContext().e;
        ma1 ma1Var = this.m;
        if (ia1Var == null || lb3Var == null || ma1Var == null) {
            z92Var = null;
        } else {
            kb3 viewModelStore = lb3Var.getViewModelStore();
            jb3 jb3Var = new jb3();
            r20 r20Var = r20.b;
            viewModelStore.getClass();
            r20Var.getClass();
            kj1 kj1Var2 = new kj1(viewModelStore, jb3Var, r20Var);
            bt btVarA = d72.a(oa1.class);
            String strB = btVarA.b();
            if (strB == null) {
                s.j("Local and anonymous classes can not be ViewModels");
                return;
            }
            oa1 oa1Var = (oa1) kj1Var2.B(btVarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            zj1 zj1Var = oa1Var.b;
            Object objB = zj1Var.b(id);
            if (objB == null) {
                objB = new lk1(1);
                zj1Var.h(id, objB);
            }
            lk1 lk1Var2 = (lk1) objB;
            Object[] objArr = lk1Var2.a;
            int i3 = lk1Var2.b;
            while (true) {
                if (i2 >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((na1) obj).c) {
                    break;
                } else {
                    i2++;
                }
            }
            na1 na1Var = (na1) obj;
            if (na1Var == null) {
                na1Var = new na1();
                lk1Var2.a(na1Var);
            }
            na1Var.c = true;
            this.n = na1Var;
            z92Var = na1Var.b;
        }
        if (z92Var == null) {
            z92Var = sn.I;
        }
        this.o = z92Var;
        in0 in0Var = this.r0;
        if (in0Var != null) {
            in0Var.j(getComposeViewContext());
            this.r0 = null;
        }
        ba1 lifecycle = getComposeViewContext().c.getLifecycle();
        lifecycle.a(this);
        lifecycle.a(this.H);
        this.A0.a.setValue(new uz0(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            m7.a.b(this);
        }
        d6 d6Var = this.U;
        if (d6Var != null) {
            ((bl0) getFocusOwner()).g.a(d6Var);
            getSemanticsOwner().d.a(d6Var);
        }
        ((bl0) getFocusOwner()).g.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        ip2 ip2Var = (ip2) this.u0.get();
        ga gaVar = (ga) (ip2Var != null ? ip2Var.b : null);
        if (gaVar == null) {
            return getLegacyTextInputServiceAndroid().d;
        }
        ip2 ip2Var2 = (ip2) gaVar.k.get();
        tz0 tz0Var = (tz0) (ip2Var2 != null ? ip2Var2.b : null);
        return tz0Var != null && (tz0Var.e ^ true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        L(configuration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        ip2 ip2Var = (ip2) this.u0.get();
        ga gaVar = (ga) (ip2Var != null ? ip2Var.b : null);
        if (gaVar == null) {
            q03 legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
            if (legacyTextInputServiceAndroid.d) {
                xx0 xx0Var = legacyTextInputServiceAndroid.h;
                k03 k03Var = legacyTextInputServiceAndroid.g;
                int i2 = xx0Var.e;
                boolean z = xx0Var.a;
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
                        s.l("invalid ImeAction");
                        return null;
                    }
                }
                editorInfo.imeOptions = i;
                int i3 = xx0Var.d;
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
                        s.l("Invalid Keyboard Type");
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
                    int i6 = xx0Var.b;
                    if (i6 == 1) {
                        editorInfo.inputType = i5 | 4096;
                    } else if (i6 == 2) {
                        editorInfo.inputType = i5 | 8192;
                    } else if (i6 == 3) {
                        editorInfo.inputType = i5 | 16384;
                    }
                    if (xx0Var.c) {
                        editorInfo.inputType |= AIChatConfig.MaxOutputTokens;
                    }
                }
                long j = k03Var.b;
                int i7 = f13.c;
                editorInfo.initialSelStart = (int) (j >> 32);
                editorInfo.initialSelEnd = (int) (j & 4294967295L);
                tp0.L(editorInfo, k03Var.a.i);
                editorInfo.imeOptions |= 33554432;
                k62 k62Var = new k62(legacyTextInputServiceAndroid.g, new hh1(22, legacyTextInputServiceAndroid), legacyTextInputServiceAndroid.h.c);
                legacyTextInputServiceAndroid.i.add(new WeakReference(k62Var));
                return k62Var;
            }
        } else {
            ip2 ip2Var2 = (ip2) gaVar.k.get();
            tz0 tz0Var = (tz0) (ip2Var2 != null ? ip2Var2.b : null);
            if (tz0Var != null) {
                synchronized (tz0Var.c) {
                    if (tz0Var.e) {
                        return null;
                    }
                    l62 l62VarA = tz0Var.a.a(editorInfo);
                    v5 v5Var = new v5(15, tz0Var);
                    InputConnection yr1Var = Build.VERSION.SDK_INT >= 34 ? new yr1(l62VarA, v5Var) : new xr1(l62VarA, v5Var);
                    tz0Var.d.b(new od3(yr1Var));
                    return yr1Var;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        qn2 qn2Var;
        w7 w7Var = this.H;
        w7Var.getClass();
        for (long j : jArr) {
            sn2 sn2Var = (sn2) w7Var.f().b((int) j);
            if (sn2Var != null && (qn2Var = sn2Var.a) != null) {
                l7.o();
                ViewTranslationRequest.Builder builderK = l7.k(w7Var.h.getAutofillId(), qn2Var.f);
                Object objG = qn2Var.d.h.g(vn2.C);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builderK.setValue("android:text", TranslationRequestValue.forText(new sd(sb1.a(list, "\n", null, 62))));
                    consumer.accept(builderK.build());
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.B.onViewDetachedFromWindow(this);
        View view = this.s;
        if (p() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            lk1 lk1Var = X0;
            synchronized (lk1Var) {
                lk1Var.j(this);
            }
        }
        getComposeViewContext().b();
        ts2 ts2Var = getSnapshotObserver().a;
        rl1 rl1Var = ts2Var.h;
        if (rl1Var != null) {
            rl1Var.a();
        }
        ts2Var.a();
        ba1 lifecycle = getComposeViewContext().c.getLifecycle();
        lifecycle.b(this.H);
        lifecycle.b(this);
        kj1 kj1Var = this.T;
        if (kj1Var != null) {
            pi piVar = pi.a;
            piVar.getClass();
            ((AutofillManager) kj1Var.k).unregisterCallback(piVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        na1 na1Var = this.n;
        if (na1Var != null) {
            na1Var.c = false;
        }
        this.n = null;
        if (i >= 31) {
            m7.a.a(this);
        }
        d6 d6Var = this.U;
        if (d6Var != null) {
            getSemanticsOwner().d.j(d6Var);
            ((bl0) getFocusOwner()).g.j(d6Var);
        }
        q62 rectManager = getRectManager();
        rectManager.f = rectManager.c.b(0L, 0L, null, 0, 0);
        getRectManager().a();
        q62 rectManager2 = getRectManager();
        l6 l6Var = rectManager2.h;
        if (l6Var != null) {
            rectManager2.a.removeCallbacks(l6Var);
            rectManager2.h = null;
        }
        ((bl0) getFocusOwner()).g.j(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        bl0 bl0Var = (bl0) getFocusOwner();
        qp0.n(bl0Var.c, true);
        if (bl0Var.f() != null) {
            pl0 pl0VarF = bl0Var.f();
            bl0Var.i(null);
            if (pl0VarF != null) {
                pl0VarF.N0(kl0.h, kl0.j);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.m0 = 0L;
        M();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        L(getResources().getConfiguration());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.m0 = 0L;
            this.g0.l(this.N0);
            this.e0 = null;
            M();
            if (this.d0 != null) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        kf1 kf1Var = this.g0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                o(getRoot());
            }
            long j = j(i);
            long j2 = j(i2);
            long jC0 = rp0.c0((int) (j >>> 32), (int) (j & 4294967295L), (int) (j2 >>> 32), (int) (4294967295L & j2));
            fz fzVar = this.e0;
            if (fzVar == null) {
                this.e0 = new fz(jC0);
                this.f0 = false;
            } else if (!fz.b(fzVar.a, jC0)) {
                this.f0 = true;
            }
            kf1Var.s(jC0);
            kf1Var.n();
            setMeasuredDimension(getRoot().N.p.h, getRoot().N.p.i);
            if (this.d0 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().N.p.h, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().N.p.i, 1073741824));
                Trace.endSection();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure != null) {
            d6 d6Var = this.U;
            if (d6Var != null) {
                r61 r61Var = d6Var.i.a;
                AutofillId autofillId = d6Var.n;
                String str = d6Var.l;
                q62 q62Var = d6Var.k;
                gf1.L(viewStructure, r61Var, autofillId, str, q62Var);
                Object[] objArr = js1.a;
                lk1 lk1Var = new lk1(2);
                lk1Var.a(r61Var);
                lk1Var.a(viewStructure);
                while (lk1Var.i()) {
                    Object objK = lk1Var.k(lk1Var.b - 1);
                    objK.getClass();
                    ViewStructure viewStructure2 = (ViewStructure) objK;
                    Object objK2 = lk1Var.k(lk1Var.b - 1);
                    objK2.getClass();
                    jk1 jk1Var = (jk1) ((r61) objK2).n();
                    int i2 = ((zk1) jk1Var.i).j;
                    for (int i3 = 0; i3 < i2; i3++) {
                        r61 r61Var2 = (r61) jk1Var.get(i3);
                        if (!r61Var2.X && r61Var2.H() && r61Var2.I()) {
                            ln2 ln2VarW = r61Var2.w();
                            if (ln2VarW != null) {
                                rk1 rk1Var = ln2VarW.h;
                                if (rk1Var.b(kn2.g) || rk1Var.b(kn2.h) || rk1Var.b(vn2.r) || rk1Var.b(vn2.s)) {
                                    ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    gf1.L(viewStructureNewChild, r61Var2, autofillId, str, q62Var);
                                    lk1Var.a(r61Var2);
                                    lk1Var.a(viewStructureNewChild);
                                } else {
                                    lk1Var.a(r61Var2);
                                    lk1Var.a(viewStructure2);
                                }
                            }
                        }
                    }
                }
            }
            kj1 kj1Var = this.T;
            if (kj1Var != null) {
                ti tiVar = (ti) kj1Var.j;
                LinkedHashMap linkedHashMap = tiVar.a;
                LinkedHashMap linkedHashMap2 = tiVar.a;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    if (entry.getValue() != null) {
                        c80.g();
                        return;
                    }
                    ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                    viewStructureNewChild2.setAutofillId((AutofillId) kj1Var.l, iIntValue);
                    viewStructureNewChild2.setId(iIntValue, ((b7) kj1Var.i).getContext().getPackageName(), null, null);
                    viewStructureNewChild2.setAutofillType(1);
                    throw null;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        m12 m12Var;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (m12Var = ((x6) getPointerIconService()).a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return m12Var instanceof ha ? PointerIcon.getSystemIcon(context, ((ha) m12Var).b) : PointerIcon.getSystemIcon(context, 1000);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.j) {
            int[] iArr = vk0.a;
            d61 d61Var = d61.h;
            d61 d61Var2 = i != 0 ? i != 1 ? null : d61.i : d61Var;
            if (d61Var2 != null) {
                d61Var = d61Var2;
            }
            setLayoutDirection(d61Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        hh1 hh1Var;
        if (Build.VERSION.SDK_INT < 31 || (hh1Var = this.R0) == null) {
            return;
        }
        tn2 semanticsOwner = getSemanticsOwner();
        a20 coroutineContext = getCoroutineContext();
        zk1 zk1Var = new zk1(new gl2[16]);
        p7.Q(semanticsOwner.a(), 0, new fl2(1, 8, zk1.class, zk1Var, "add", "add(Ljava/lang/Object;)Z"));
        Arrays.sort(zk1Var.h, 0, zk1Var.j, new gv(0, new in0[]{oq0.z, oq0.A}));
        int i = zk1Var.j;
        gl2 gl2Var = (gl2) (i == 0 ? null : zk1Var.h[i - 1]);
        if (gl2Var == null) {
            return;
        }
        d11 d11Var = gl2Var.c;
        cx cxVar = new cx(gl2Var.a, d11Var, te.e(coroutineContext), hh1Var, this);
        zn1 zn1Var = gl2Var.d;
        o62 o62VarJ = s11.J(zn1Var).J(zn1Var, true);
        long j = (((long) d11Var.a) << 32) | (((long) d11Var.b) & 4294967295L);
        ScrollCaptureTarget scrollCaptureTargetF = l7.f(this, rp0.n0(up0.F(o62VarJ)), new Point((int) (j >> 32), (int) (j & 4294967295L)), cxVar);
        scrollCaptureTargetF.setScrollBounds(rp0.n0(d11Var));
        consumer.accept(scrollCaptureTargetF);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        M();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this.A0.a.setValue(new uz0(z ? 1 : 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        w7 w7Var = this.H;
        w7Var.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (t11.l(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            p7.n(w7Var, longSparseArray);
        } else {
            w7Var.h.post(new t7(0, w7Var, longSparseArray));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zW;
        this.P0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zW = gf1.w())) {
            return;
        }
        setShowLayoutBounds(zW);
        n(getRoot());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean r(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        int i2 = 1;
        if (!isFocused()) {
            ok0 ok0VarD = vk0.d(i);
            int i3 = ok0VarD != null ? ok0VarD.a : 7;
            Boolean boolE = ((bl0) getFocusOwner()).e(i3, rect != null ? new o62(rect.left, rect.top, rect.right, rect.bottom) : null, new y6(i3, 0));
            Boolean bool = Boolean.TRUE;
            if (!t11.l(boolE, bool)) {
                if (!t11.l(((bl0) getFocusOwner()).e(i3, null, new y6(i3, i2)), bool)) {
                    if (hasFocus() && (i3 == 1 || i3 == 2)) {
                        return ((bl0) getFocusOwner()).h(i3);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean s(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.D0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.G.o = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setComposeViewContext(lx lxVar) {
        if (getCoroutineContext() != lxVar.b.j() && !((jk1) getRoot().n()).isEmpty()) {
            kz0.a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        vr2 vr2VarB = tl.B();
        in0 in0VarE = vr2VarB != null ? vr2VarB.e() : null;
        vr2 vr2VarK = tl.K(vr2VarB);
        try {
            lx lxVar2 = get_composeViewContext();
            if (lxVar != lxVar2) {
                if (isAttachedToWindow()) {
                    lxVar2.b();
                    lxVar.c();
                }
                set_composeViewContext(lxVar);
                setCoroutineContext(lxVar.b.j());
            }
        } finally {
            tl.U(vr2VarB, vr2VarK, in0VarE);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.Q0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setConfiguration(Configuration configuration) {
        this.R.setValue(configuration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setContentCaptureManager$ui(w7 w7Var) {
        this.H = w7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setCoroutineContext(a20 a20Var) {
        this.u = a20Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setFrameEndScheduler$ui(ma1 ma1Var) {
        this.m = ma1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.m0 = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setOnReadyForComposition(in0 in0Var) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.Q0) {
            in0Var.j(getComposeViewContext());
        } else {
            this.r0 = in0Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m3setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(ny0 ny0Var) {
        this.k = ny0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setShowLayoutBounds(boolean z) {
        this.c0 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setUncaughtExceptionHandler(wa2 wa2Var) {
        this.g0.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void t(float[] fArr) {
        D();
        hf1.e(fArr, this.k0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.o0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.o0 & 4294967295L));
        float[] fArr2 = this.j0;
        hf1.d(fArr2);
        hf1.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        p7.J(fArr, fArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long u(long j) {
        D();
        long jB = hf1.b(j, this.k0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.o0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.o0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void v(boolean z) {
        s6 s6Var;
        kf1 kf1Var = this.g0;
        if (kf1Var.b.w() || ((zk1) kf1Var.e.i).j != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    s6Var = this.N0;
                } finally {
                    Trace.endSection();
                }
            } else {
                s6Var = null;
            }
            if (kf1Var.l(s6Var)) {
                requestLayout();
            }
            kf1Var.b(false);
            getRectManager().a();
            if (this.O) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.O = false;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void w(r61 r61Var, long j) {
        kf1 kf1Var = this.g0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            kf1Var.m(r61Var, j);
            if (!kf1Var.b.w()) {
                kf1Var.b(false);
                getRectManager().a();
                if (this.O) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.O = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean x(int i) {
        if (i != 7 && i != 8) {
            Integer numC = vk0.c(i);
            if (numC == null) {
                throw vi0.e("Invalid focus direction");
            }
            int iIntValue = numC.intValue();
            pl0 pl0VarF = ((bl0) getFocusOwner()).f();
            if (pl0VarF == null) {
                s.l("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numC2 = vk0.c(i);
            if (numC2 == null) {
                throw vi0.e("Invalid focus direction");
            }
            int iIntValue2 = numC2.intValue();
            ab3 ab3Var = sp0.c0(pl0VarF).v;
            View interopView = ab3Var != null ? ab3Var.getInteropView() : null;
            View viewFindFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
            if (viewFindNextFocus == null || interopView == null || !p7.g(interopView, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return vk0.b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void y() {
        lk1 lk1Var;
        Object[] objArr;
        if (this.V) {
            ts2 ts2Var = getSnapshotObserver().a;
            synchronized (ts2Var.g) {
                try {
                    zk1 zk1Var = ts2Var.f;
                    int i = zk1Var.j;
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        objArr = zk1Var.h;
                        if (i2 >= i) {
                            break;
                        }
                        ss2 ss2Var = (ss2) objArr[i2];
                        ss2Var.d();
                        if (!ss2Var.f.j()) {
                            i3++;
                        } else if (i3 > 0) {
                            Object[] objArr2 = zk1Var.h;
                            objArr2[i2 - i3] = objArr2[i2];
                        }
                        i2++;
                    }
                    int i4 = i - i3;
                    Arrays.fill(objArr, i4, i, (Object) null);
                    zk1Var.j = i4;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.V = false;
        }
        nc ncVar = this.d0;
        if (ncVar != null) {
            i(ncVar);
        }
        d6 d6Var = this.U;
        if (d6Var != null) {
            ak1 ak1Var = d6Var.o;
            if (ak1Var.d == 0 && d6Var.p) {
                ((AutofillManager) d6Var.h.i).commit();
                d6Var.p = false;
            }
            if (ak1Var.d != 0) {
                d6Var.p = true;
            }
        }
        while (this.G0.i() && this.G0.f(0) != null) {
            int i5 = this.G0.b;
            int i6 = 0;
            while (true) {
                lk1Var = this.G0;
                if (i6 < i5) {
                    xm0 xm0Var = (xm0) lk1Var.f(i6);
                    this.G0.n(i6, null);
                    if (xm0Var != null) {
                        xm0Var.a();
                    }
                    i6++;
                }
            }
            lk1Var.l(0, i5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void z(r61 r61Var) {
        h7 h7Var = this.G;
        h7Var.E = true;
        if (h7Var.o()) {
            h7Var.p(r61Var);
        }
        w7 w7Var = this.H;
        w7Var.n = true;
        if (w7Var.h()) {
            w7Var.o.s(a83.a);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: getAccessibilityManager()Lz3; */
    /* JADX INFO: renamed from: getAccessibilityManager, reason: merged with bridge method [inline-methods] */
    public a6 m4getAccessibilityManager() {
        return this.I;
    }

    /* JADX DEBUG: Method merged with bridge method: getClipboard()Lrt; */
    /* JADX INFO: renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public i6 m5getClipboard() {
        return this.a0;
    }

    /* JADX DEBUG: Method merged with bridge method: getClipboardManager()Lst; */
    /* JADX INFO: renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public j6 m6getClipboardManager() {
        return this.W;
    }

    /* JADX DEBUG: Method merged with bridge method: getDragAndDropManager()Leb0; */
    public o8 getDragAndDropManager() {
        return this.v;
    }

    /* JADX DEBUG: Method merged with bridge method: getLayoutNodes()Lx01; */
    public zj1 getLayoutNodes() {
        return this.D;
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
    public static /* synthetic */ void m1getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
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
