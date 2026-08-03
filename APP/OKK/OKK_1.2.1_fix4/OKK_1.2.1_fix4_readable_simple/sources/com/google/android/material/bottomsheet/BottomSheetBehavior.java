package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.C0501a;
import com.abc.core.runtime.AbstractC0805P;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import org.luckypray.dexkit.C1031R;
import p000A.C0002c;
import p000A.C0010k;
import p001A0.C0020F;
import p002B.C0057g;
import p006D.AbstractC0068E;
import p006D.AbstractC0070G;
import p006D.AbstractC0080Q;
import p006D.AbstractC0093c;
import p006D.AbstractC0130v;
import p006D.C0088Z;
import p006D.C0089a;
import p006D.C0090a0;
import p006D.C0091b;
import p006D.C0099f;
import p006D.ViewOnApplyWindowInsetsListenerC0087Y;
import p008E.C0151e;
import p010F.AbstractC0196a;
import p021L.C0245e;
import p034S.AbstractC0324d;
import p037U.C0376l;
import p057g.RunnableC0852C;
import p058g0.AbstractC0942a;
import p068l0.C0979a;
import p068l0.C0980b;
import p078r.AbstractC1058a;
import p078r.C1061d;
import p081s0.ViewOnAttachStateChangeListenerC1079m;
import p089x0.C1122f;
import p089x0.C1123g;
import p089x0.C1127k;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC1058a {

    /* JADX INFO: renamed from: A */
    public final C0501a f2281A;

    /* JADX INFO: renamed from: B */
    public final ValueAnimator f2282B;

    /* JADX INFO: renamed from: C */
    public final int f2283C;

    /* JADX INFO: renamed from: D */
    public int f2284D;

    /* JADX INFO: renamed from: E */
    public int f2285E;

    /* JADX INFO: renamed from: F */
    public final float f2286F;

    /* JADX INFO: renamed from: G */
    public int f2287G;

    /* JADX INFO: renamed from: H */
    public final float f2288H;

    /* JADX INFO: renamed from: I */
    public boolean f2289I;

    /* JADX INFO: renamed from: J */
    public boolean f2290J;

    /* JADX INFO: renamed from: K */
    public final boolean f2291K;

    /* JADX INFO: renamed from: L */
    public int f2292L;

    /* JADX INFO: renamed from: M */
    public C0245e f2293M;

    /* JADX INFO: renamed from: N */
    public boolean f2294N;

    /* JADX INFO: renamed from: O */
    public int f2295O;

    /* JADX INFO: renamed from: P */
    public boolean f2296P;

    /* JADX INFO: renamed from: Q */
    public final float f2297Q;

    /* JADX INFO: renamed from: R */
    public int f2298R;

    /* JADX INFO: renamed from: S */
    public int f2299S;

    /* JADX INFO: renamed from: T */
    public int f2300T;

    /* JADX INFO: renamed from: U */
    public WeakReference f2301U;

    /* JADX INFO: renamed from: V */
    public WeakReference f2302V;

    /* JADX INFO: renamed from: W */
    public final ArrayList f2303W;

    /* JADX INFO: renamed from: X */
    public VelocityTracker f2304X;

    /* JADX INFO: renamed from: Y */
    public int f2305Y;

    /* JADX INFO: renamed from: Z */
    public int f2306Z;

    /* JADX INFO: renamed from: a */
    public final int f2307a;

    /* JADX INFO: renamed from: a0 */
    public boolean f2308a0;

    /* JADX INFO: renamed from: b */
    public boolean f2309b;

    /* JADX INFO: renamed from: b0 */
    public HashMap f2310b0;

    /* JADX INFO: renamed from: c */
    public final float f2311c;

    /* JADX INFO: renamed from: c0 */
    public final SparseIntArray f2312c0;

    /* JADX INFO: renamed from: d */
    public final int f2313d;

    /* JADX INFO: renamed from: d0 */
    public final C0979a f2314d0;

    /* JADX INFO: renamed from: e */
    public int f2315e;

    /* JADX INFO: renamed from: f */
    public boolean f2316f;

    /* JADX INFO: renamed from: g */
    public int f2317g;

    /* JADX INFO: renamed from: h */
    public final int f2318h;

    /* JADX INFO: renamed from: i */
    public final C1123g f2319i;

    /* JADX INFO: renamed from: j */
    public final ColorStateList f2320j;

    /* JADX INFO: renamed from: k */
    public final int f2321k;

    /* JADX INFO: renamed from: l */
    public final int f2322l;

    /* JADX INFO: renamed from: m */
    public int f2323m;

    /* JADX INFO: renamed from: n */
    public final boolean f2324n;

    /* JADX INFO: renamed from: o */
    public final boolean f2325o;

    /* JADX INFO: renamed from: p */
    public final boolean f2326p;

    /* JADX INFO: renamed from: q */
    public final boolean f2327q;

    /* JADX INFO: renamed from: r */
    public final boolean f2328r;

    /* JADX INFO: renamed from: s */
    public final boolean f2329s;

    /* JADX INFO: renamed from: t */
    public final boolean f2330t;

    /* JADX INFO: renamed from: u */
    public final boolean f2331u;

    /* JADX INFO: renamed from: v */
    public int f2332v;

    /* JADX INFO: renamed from: w */
    public int f2333w;

    /* JADX INFO: renamed from: x */
    public final boolean f2334x;

    /* JADX INFO: renamed from: y */
    public final C1127k f2335y;

    /* JADX INFO: renamed from: z */
    public boolean f2336z;

    public BottomSheetBehavior() {
        this.f2307a = 0;
        this.f2309b = true;
        this.f2321k = -1;
        this.f2322l = -1;
        this.f2281A = new C0501a(this);
        this.f2286F = 0.5f;
        this.f2288H = -1.0f;
        this.f2291K = true;
        this.f2292L = 4;
        this.f2297Q = 0.1f;
        this.f2303W = new ArrayList();
        this.f2306Z = -1;
        this.f2312c0 = new SparseIntArray();
        this.f2314d0 = new C0979a(this, 0);
    }

    /* JADX INFO: renamed from: v */
    public static View m1832v(View r4) {
        if (r4.getVisibility() == 0) goto L5;
        return null;
    L5:
        Field r02 = AbstractC0080Q.f219a;
        if (AbstractC0070G.m226p(r4) == false) goto L9;
        return r4;
    L9:
        if ((r4 instanceof ViewGroup) == false) goto L16;
        ViewGroup r42 = (ViewGroup) r4;
        int r03 = r42.getChildCount();
        int r2 = 0;
    L11:
        if (r2 >= r03) goto L16;
        View r3 = m1832v(r42.getChildAt(r2));
        if (r3 != null) goto L14;
        r2 = r2 + 1;
        goto L11
    L14:
        return r3;
    L16:
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static int m1833w(int r02, int r1, int r2, int r3) {
        int r03 = ViewGroup.getChildMeasureSpec(r02, r1, r3);
        if (r2 != (-1)) goto L5;
        return r03;
    L5:
        int r12 = View.MeasureSpec.getMode(r03);
        int r04 = View.MeasureSpec.getSize(r03);
        if (r12 == 1073741824) goto L13;
        if (r04 == 0) goto L11;
        r2 = Math.min(r04, r2);
    L11:
        return View.MeasureSpec.makeMeasureSpec(r2, Integer.MIN_VALUE);
    L13:
        return View.MeasureSpec.makeMeasureSpec(Math.min(r04, r2), 1073741824);
    }

    /* JADX INFO: renamed from: A */
    public final void m1834A(int r2) {
        if (r2 != (-1)) goto L8;
        if (this.f2316f == true) goto L14;
        this.f2316f = true;
    L12:
        m1842I();
        return;
    L14:
        return;
    L8:
        if (this.f2316f == false) goto L10;
    L11:
        this.f2316f = false;
        this.f2315e = Math.max(0, r2);
        goto L12
    L10:
        if (this.f2315e != r2) goto L11;
    }

    /* JADX INFO: renamed from: B */
    public final void m1835B(int r5) {
        if (r5 != 1) goto L5;
    L35:
        StringBuilder r2 = new StringBuilder("STATE_");
        if (r5 != 1) goto L38;
        String r52 = "DRAGGING";
    L39:
        r2.append(r52);
        r2.append(" should not be set externally.");
        throw new IllegalArgumentException(r2.toString());
    L38:
        r52 = "SETTLING";
        goto L39
    L5:
        if (r5 == 2) goto L35;
        if (this.f2289I == true) goto L13;
        if (r5 != 5) goto L13;
        return;
    L13:
        if (r5 == 6) goto L15;
    L19:
        int r02 = r5;
    L20:
        WeakReference r1 = this.f2301U;
        if (r1 != null) goto L23;
    L33:
        m1836C(r5);
        return;
    L23:
        if (r1.get() == null) goto L33;
        View r53 = (View) this.f2301U.get();
        RunnableC0852C r12 = new RunnableC0852C(this, r53, r02);
        ViewParent r03 = r53.getParent();
        if (r03 != null) goto L28;
    L32:
        r12.run();
        return;
    L28:
        if (r03.isLayoutRequested() == false) goto L32;
        Field r04 = AbstractC0080Q.f219a;
        if (r53.isAttachedToWindow() == false) goto L32;
        r53.post(r12);
        return;
    L15:
        if (this.f2309b == false) goto L19;
        if (m1851y(r5) > this.f2284D) goto L19;
        r02 = 3;
        goto L20
    }

    /* JADX INFO: renamed from: C */
    public final void m1836C(int r7) {
        if (this.f2292L != r7) goto L5;
        return;
    L5:
        this.f2292L = r7;
        if (r7 == 4) goto L10;
        if (r7 == 3) goto L10;
        if (r7 == 6) goto L10;
        boolean r4 = this.f2289I;
    L10:
        WeakReference r42 = this.f2301U;
        if (r42 != null) goto L14;
        return;
    L14:
        if (((View) r42.get()) != null) goto L17;
        return;
    L17:
        if (r7 != 3) goto L19;
        m1841H(true);
    L23:
        m1840G(r7, true);
        ArrayList r72 = this.f2303W;
        if (r72.size() > 0) goto L27;
        m1839F();
        return;
    L27:
        AbstractC0324d.m726i(r72.get(0));
        throw null;
    L19:
        if (r7 == 6) goto L22;
        if (r7 == 5) goto L22;
        if (r7 != 4) goto L23;
    L22:
        m1841H(false);
        goto L23
    }

    /* JADX INFO: renamed from: D */
    public final boolean m1837D(View r5, float r6) {
        if (this.f2290J == false) goto L6;
        return true;
    L6:
        if (r5.getTop() >= this.f2287G) goto L9;
        return false;
    L9:
        if ((Math.abs(((r6 * this.f2297Q) + r5.getTop()) - this.f2287G) / m1848t()) <= 0.5f) goto L12;
        return true;
    L12:
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final void m1838E(View r3, int r4, boolean r5) {
        int r02 = m1851y(r4);
        C0245e r1 = this.f2293M;
        if (r1 == null) goto L17;
        if (r5 == true) goto L6;
        int r52 = r3.getLeft();
        r1.f520r = r3;
        r1.f505c = -1;
        boolean r32 = r1.m676h(r52, r02, 0, 0);
        if (r32 == false) goto L11;
    L15:
        if (r32 == false) goto L17;
    L16:
        m1836C(2);
        m1840G(r4, true);
        this.f2281A.m1226c(r4);
        return;
    L11:
        if (r1.f503a != 0) goto L15;
        if (r1.f520r == null) goto L15;
        r1.f520r = null;
        goto L15
    L6:
        if (r1.m682n(r3.getLeft(), r02) == true) goto L16;
    L17:
        m1836C(r4);
    }

    /* JADX INFO: renamed from: F */
    public final void m1839F() {
        WeakReference r02 = this.f2301U;
        if (r02 == null) goto L78;
        View r03 = (View) r02.get();
        if (r03 == null) goto L81;
        AbstractC0080Q.m288g(r03, 524288);
        AbstractC0080Q.m286e(r03, 0);
        AbstractC0080Q.m288g(r03, 262144);
        AbstractC0080Q.m286e(r03, 0);
        AbstractC0080Q.m288g(r03, 1048576);
        AbstractC0080Q.m286e(r03, 0);
        SparseIntArray r2 = this.f2312c0;
        int r4 = r2.get(0, -1);
        if (r4 == (-1)) goto L10;
        AbstractC0080Q.m288g(r03, r4);
        AbstractC0080Q.m286e(r03, 0);
        r2.delete(0);
    L10:
        int r5 = 6;
        if (this.f2309b == true) goto L50;
        if (this.f2292L == 6) goto L50;
        String r10 = r03.getResources().getString(C1031R.string.bottomsheet_action_expand_halfway);
        C0010k r11 = new C0010k(this, 6);
        ArrayList r42 = AbstractC0080Q.m284c(r03);
        int r6 = 0;
    L16:
        if (r6 >= r42.size()) goto L21;
        if (TextUtils.equals(r10, ((AccessibilityNodeInfo.AccessibilityAction) ((C0151e) r42.get(r6)).f352a).getLabel()) == true) goto L19;
        r6 = r6 + 1;
        goto L16
    L19:
        int r43 = ((C0151e) r42.get(r6)).m477a();
    L37:
        if (r43 == (-1)) goto L48;
        C0151e r3 = new C0151e(null, r43, r10, r11, null);
        View.AccessibilityDelegate r62 = AbstractC0080Q.m282a(r03);
        if (r62 != null) goto L42;
        C0091b r63 = null;
    L45:
        if (r63 != null) goto L47;
        r63 = new C0091b();
    L47:
        AbstractC0080Q.m291j(r03, r63);
        AbstractC0080Q.m288g(r03, r3.m477a());
        AbstractC0080Q.m284c(r03).add(r3);
        AbstractC0080Q.m286e(r03, 0);
        goto L48
    L42:
        if ((r62 instanceof C0089a) == false) goto L44;
        r63 = ((C0089a) r62).f237a;
        goto L45
    L44:
        r63 = new C0091b(r62);
    L48:
        r2.put(0, r43);
        goto L50
    L21:
        int r7 = 0;
        int r64 = -1;
    L23:
        if (r7 >= 32) goto L36;
        if (r64 != (-1)) goto L36;
        int r8 = AbstractC0080Q.f221c[r7];
        int r12 = 0;
        boolean r13 = true;
    L27:
        if (r12 >= r42.size()) goto L33;
        if (((C0151e) r42.get(r12)).m477a() == r8) goto L31;
        boolean r14 = true;
    L32:
        r13 = r13 & r14;
        r12 = r12 + 1;
        goto L27
    L31:
        r14 = false;
        goto L32
    L33:
        if (r13 == false) goto L35;
        r64 = r8;
    L35:
        r7 = r7 + 1;
    L36:
        r43 = r64;
    L50:
        if (this.f2289I == true) goto L52;
    L54:
        int r1 = this.f2292L;
        if (r1 == 3) goto L65;
        if (r1 == 4) goto L61;
        if (r1 != 6) goto L82;
        AbstractC0080Q.m289h(r03, C0151e.f348i, new C0010k(this, 4));
        AbstractC0080Q.m289h(r03, C0151e.f347h, new C0010k(this, 3));
        return;
    L82:
        return;
    L61:
        if (this.f2309b == false) goto L63;
        r5 = 3;
    L63:
        AbstractC0080Q.m289h(r03, C0151e.f347h, new C0010k(this, r5));
        return;
    L65:
        if (this.f2309b == false) goto L67;
        r5 = 4;
    L67:
        AbstractC0080Q.m289h(r03, C0151e.f348i, new C0010k(this, r5));
        return;
    L52:
        if (this.f2292L == 5) goto L54;
        AbstractC0080Q.m289h(r03, C0151e.f349j, new C0010k(this, 5));
        goto L54
    L81:
        return;
    }

    /* JADX INFO: renamed from: G */
    public final void m1840G(int r7, boolean r8) {
        C1123g r2 = this.f2319i;
        ValueAnimator r3 = this.f2282B;
        if (r7 != 2) goto L6;
        return;
    L6:
        if (this.f2292L == 3) goto L8;
    L12:
        boolean r72 = false;
    L14:
        if (this.f2336z == r72) goto L38;
        if (r2 == null) goto L42;
        this.f2336z = r72;
        float r5 = 1.0f;
        if (r8 == false) goto L27;
        if (r3 == null) goto L27;
        if (r3.isRunning() == false) goto L23;
        r3.reverse();
        return;
    L23:
        float r82 = r2.f4312a.f4299j;
        if (r72 == false) goto L26;
        r5 = m1847s();
    L26:
        r3.setFloatValues(new float[]{r82, r5});
        r3.start();
        return;
    L27:
        if (r3 == null) goto L32;
        if (r3.isRunning() == false) goto L32;
        r3.cancel();
    L32:
        if (this.f2336z == false) goto L34;
        r5 = m1847s();
    L34:
        C1122f r73 = r2.f4312a;
        if (r73.f4299j == r5) goto L41;
        r73.f4299j = r5;
        r2.f4316e = true;
        r2.invalidateSelf();
        return;
    L41:
        return;
    L42:
        return;
    L38:
        return;
    L8:
        if (this.f2334x == false) goto L10;
    L11:
        r72 = true;
        goto L14
    L10:
        if (m1852z() == false) goto L12;
        goto L11
    }

    /* JADX INFO: renamed from: H */
    public final void m1841H(boolean r7) {
        WeakReference r02 = this.f2301U;
        if (r02 != null) goto L5;
        return;
    L5:
        ViewParent r03 = ((View) r02.get()).getParent();
        if ((r03 instanceof CoordinatorLayout) == true) goto L8;
        return;
    L8:
        CoordinatorLayout r04 = (CoordinatorLayout) r03;
        int r1 = r04.getChildCount();
        if (r7 == true) goto L11;
    L14:
        int r2 = 0;
    L15:
        if (r2 >= r1) goto L22;
        View r3 = r04.getChildAt(r2);
        if (r3 == this.f2301U.get()) goto L21;
        if (r7 == false) goto L21;
        this.f2310b0.put(r3, Integer.valueOf(r3.getImportantForAccessibility()));
    L21:
        r2 = r2 + 1;
        goto L15
    L22:
        if (r7 == true) goto L29;
        this.f2310b0 = null;
        return;
    L29:
        return;
    L11:
        if (this.f2310b0 != null) goto L13;
        this.f2310b0 = new HashMap(r1);
        goto L14
    }

    /* JADX INFO: renamed from: I */
    public final void m1842I() {
        if (this.f2301U == null) goto L10;
        m1846r();
        if (this.f2292L != 4) goto L11;
        View r02 = (View) this.f2301U.get();
        if (r02 == null) goto L12;
        r02.requestLayout();
        return;
    L12:
        return;
    L11:
        return;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: c */
    public final void mo1843c(C1061d r1) {
        this.f2301U = null;
        this.f2293M = null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: e */
    public final void mo1844e() {
        this.f2301U = null;
        this.f2293M = null;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: f */
    public final boolean mo1815f(CoordinatorLayout r10, View r11, MotionEvent r12) {
        if (r11.isShown() == true) goto L5;
    L68:
        this.f2294N = true;
        return false;
    L5:
        if (this.f2291K == false) goto L68;
        int r02 = r12.getActionMasked();
        View r3 = null;
        if (r02 != 0) goto L13;
        this.f2305Y = -1;
        this.f2306Z = -1;
        VelocityTracker r5 = this.f2304X;
        if (r5 == null) goto L13;
        r5.recycle();
        this.f2304X = null;
    L13:
        if (this.f2304X != null) goto L15;
        this.f2304X = VelocityTracker.obtain();
    L15:
        this.f2304X.addMovement(r12);
        if (r02 == 0) goto L25;
        if (r02 != 1) goto L19;
    L21:
        this.f2308a0 = false;
        this.f2305Y = -1;
        if (this.f2294N == false) goto L43;
        this.f2294N = false;
        return false;
    L43:
        if (this.f2294N == true) goto L49;
        C0245e r112 = this.f2293M;
        if (r112 == null) goto L49;
        if (r112.m683o(r12) == false) goto L49;
        return true;
    L49:
        WeakReference r113 = this.f2302V;
        if (r113 == null) goto L52;
        r3 = (View) r113.get();
    L52:
        if (r02 != 2) goto L70;
        if (r3 != null) goto L55;
        return false;
    L55:
        if (this.f2294N == false) goto L57;
        return false;
    L57:
        if (this.f2292L != 1) goto L59;
        return false;
    L59:
        if (r10.m1172n(r3, (int) r12.getX(), (int) r12.getY()) == false) goto L61;
        return false;
    L61:
        if (this.f2293M == null) goto L75;
        int r102 = this.f2306Z;
        if (r102 != (-1)) goto L65;
        return false;
    L65:
        if (Math.abs(r102 - r12.getY()) > this.f2293M.f504b) goto L67;
        return false;
    L67:
        return true;
    L75:
        return false;
    L70:
        return false;
    L19:
        if (r02 == 3) goto L21;
    L25:
        int r6 = (int) r12.getX();
        this.f2306Z = (int) r12.getY();
        if (this.f2292L == 2) goto L36;
        WeakReference r7 = this.f2302V;
        if (r7 == null) goto L30;
        View r72 = (View) r7.get();
    L31:
        if (r72 == null) goto L36;
        if (r10.m1172n(r72, r6, this.f2306Z) == false) goto L36;
        this.f2305Y = r12.getPointerId(r12.getActionIndex());
        this.f2308a0 = true;
        goto L36
    L30:
        r72 = null;
    L36:
        if (this.f2305Y == (-1)) goto L38;
    L40:
        boolean r114 = false;
    L41:
        this.f2294N = r114;
        goto L43
    L38:
        if (r10.m1172n(r11, r6, this.f2306Z) == true) goto L40;
        r114 = true;
        goto L41
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: g */
    public final boolean mo1816g(CoordinatorLayout r12, View r13, int r14) {
        int r02 = this.f2322l;
        C1123g r1 = this.f2319i;
        Field r2 = AbstractC0080Q.f219a;
        if (r12.getFitsSystemWindows() == false) goto L8;
        if (r13.getFitsSystemWindows() == true) goto L8;
        r13.setFitsSystemWindows(true);
    L8:
        if (this.f2301U != null) goto L54;
        this.f2317g = r12.getResources().getDimensionPixelSize(C1031R.dimen.design_bottom_sheet_peek_height_min);
        int r22 = Build.VERSION.SDK_INT;
        if (r22 >= 29) goto L12;
    L16:
        boolean r6 = false;
    L18:
        if (this.f2325o == false) goto L20;
    L31:
        C0057g r7 = new C0057g(this, r6);
        int r8 = r13.getPaddingStart();
        r13.getPaddingTop();
        int r9 = r13.getPaddingEnd();
        int r10 = r13.getPaddingBottom();
        C0376l r62 = new C0376l();
        r62.f824a = r8;
        r62.f825b = r9;
        r62.f826c = r10;
        AbstractC0070G.m231u(r13, new C0002c(r7, r62, 11));
        if (r13.isAttachedToWindow() == false) goto L34;
        AbstractC0068E.m210c(r13);
    L35:
        C0099f r63 = new C0099f(r13);
        if (r22 < 30) goto L38;
        AbstractC0130v.m451p(r13, new C0090a0(r63));
    L41:
        this.f2301U = new WeakReference(r13);
        Context r23 = r13.getContext();
        AbstractC0805P.m2039S(r23, C1031R.attr.motionEasingStandardDecelerateInterpolator, AbstractC0196a.m567b(0.0f, 0.0f, 0.0f, 1.0f));
        AbstractC0805P.m2038R(r23, C1031R.attr.motionDurationMedium2, 300);
        AbstractC0805P.m2038R(r23, C1031R.attr.motionDurationShort3, 150);
        AbstractC0805P.m2038R(r23, C1031R.attr.motionDurationShort2, 100);
        Resources r24 = r13.getResources();
        r24.getDimension(C1031R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        r24.getDimension(C1031R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
        if (r1 == null) goto L47;
        r13.setBackground(r1);
        float r25 = this.f2288H;
        if (r25 != (-1.0f)) goto L46;
        r25 = AbstractC0070G.m219i(r13);
    L46:
        r1.m2650j(r25);
    L50:
        m1839F();
        if (r13.getImportantForAccessibility() != 0) goto L54;
        r13.setImportantForAccessibility(1);
        goto L54
    L47:
        ColorStateList r15 = this.f2320j;
        if (r15 == null) goto L50;
        AbstractC0070G.m227q(r13, r15);
        goto L50
    L38:
        PathInterpolator r26 = C0088Z.f234e;
        Object r27 = r13.getTag(C1031R.id.tag_on_apply_window_listener);
        View.OnApplyWindowInsetsListener r72 = new ViewOnApplyWindowInsetsListenerC0087Y(r13, r63);
        r13.setTag(C1031R.id.tag_window_insets_animation_callback, r72);
        if (r27 != null) goto L41;
        r13.setOnApplyWindowInsetsListener(r72);
        goto L41
    L34:
        r13.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1079m());
        goto L35
    L20:
        if (this.f2326p == true) goto L31;
        if (this.f2327q == true) goto L31;
        if (this.f2329s == true) goto L31;
        if (this.f2330t == true) goto L31;
        if (this.f2331u == true) goto L31;
        if (r6 == true) goto L31;
    L12:
        if (this.f2324n == true) goto L16;
        if (this.f2316f == true) goto L16;
        r6 = true;
    L54:
        if (this.f2293M != null) goto L56;
        this.f2293M = new C0245e(r12.getContext(), r12, this.f2314d0);
    L56:
        int r16 = r13.getTop();
        r12.m1174p(r13, r14);
        this.f2299S = r12.getWidth();
        this.f2300T = r12.getHeight();
        int r122 = r13.getHeight();
        this.f2298R = r122;
        int r142 = this.f2300T;
        int r123 = r142 - r122;
        int r28 = this.f2333w;
        if (r123 < r28) goto L59;
    L69:
        this.f2284D = Math.max(0, this.f2300T - this.f2298R);
        this.f2285E = (int) ((1.0f - this.f2286F) * this.f2300T);
        m1846r();
        int r124 = this.f2292L;
        if (r124 != 3) goto L73;
        r13.offsetTopAndBottom(m1850x());
    L87:
        m1840G(this.f2292L, false);
        this.f2302V = new WeakReference(m1832v(r13));
        ArrayList r125 = this.f2303W;
        if (r125.size() > 0) goto L90;
        return true;
    L90:
        AbstractC0324d.m726i(r125.get(0));
        throw null;
    L73:
        if (r124 != 6) goto L76;
        r13.offsetTopAndBottom(this.f2285E);
        goto L87
    L76:
        if (this.f2289I == false) goto L81;
        if (r124 != 5) goto L81;
        r13.offsetTopAndBottom(this.f2300T);
    L81:
        if (r124 != 4) goto L83;
        r13.offsetTopAndBottom(this.f2287G);
        goto L87
    L83:
        if (r124 != 1) goto L85;
    L86:
        r13.offsetTopAndBottom(r16 - r13.getTop());
        goto L87
    L85:
        if (r124 != 2) goto L87;
    L59:
        if (this.f2328r == false) goto L64;
        if (r02 == (-1)) goto L63;
        r142 = Math.min(r142, r02);
    L63:
        this.f2298R = r142;
        goto L69
    L64:
        int r143 = r142 - r28;
        if (r02 == (-1)) goto L68;
        r143 = Math.min(r143, r02);
    L68:
        this.f2298R = r143;
        goto L69
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: h */
    public final boolean mo1817h(CoordinatorLayout r4, View r5, int r6, int r7, int r8) {
        ViewGroup.MarginLayoutParams r02 = (ViewGroup.MarginLayoutParams) r5.getLayoutParams();
        int r1 = r4.getPaddingLeft();
        int r62 = m1833w(r6, (((r4.getPaddingRight() + r1) + r02.leftMargin) + r02.rightMargin) + r7, this.f2321k, r02.width);
        int r72 = r4.getPaddingTop();
        r5.measure(r62, m1833w(r8, ((r4.getPaddingBottom() + r72) + r02.topMargin) + r02.bottomMargin, this.f2322l, r02.height));
        return true;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: i */
    public final boolean mo1845i(View r3) {
        WeakReference r02 = this.f2302V;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r3 == r02.get()) goto L7;
        return false;
    L7:
        if (this.f2292L == 3) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: j */
    public final void mo1818j(CoordinatorLayout r3, View r4, View r5, int r6, int r7, int[] r8, int r9) {
        boolean r32 = this.f2291K;
        if (r9 != 1) goto L5;
        return;
    L5:
        WeakReference r92 = this.f2302V;
        if (r92 == null) goto L8;
        View r93 = (View) r92.get();
    L9:
        if (r5 == r93) goto L11;
        return;
    L11:
        int r94 = r4.getTop();
        int r02 = r94 - r7;
        if (r7 > 0) goto L14;
        if (r7 < 0) goto L21;
    L31:
        m1849u(r4.getTop());
        this.f2295O = r7;
        this.f2296P = true;
        return;
    L21:
        if (r5.canScrollVertically(-1) == true) goto L31;
        int r52 = this.f2287G;
        if (r02 > r52) goto L25;
    L28:
        if (r32 == true) goto L30;
        return;
    L30:
        r8[1] = r7;
        Field r53 = AbstractC0080Q.f219a;
        r4.offsetTopAndBottom(-r7);
        m1836C(1);
        goto L31
    L25:
        if (this.f2289I == true) goto L28;
        int r95 = r94 - r52;
        r8[1] = r95;
        Field r54 = AbstractC0080Q.f219a;
        r4.offsetTopAndBottom(-r95);
        m1836C(4);
        goto L31
    L14:
        if (r02 >= m1850x()) goto L16;
        int r96 = r94 - m1850x();
        r8[1] = r96;
        Field r55 = AbstractC0080Q.f219a;
        r4.offsetTopAndBottom(-r96);
        m1836C(3);
        goto L31
    L16:
        if (r32 == true) goto L18;
        return;
    L18:
        r8[1] = r7;
        Field r56 = AbstractC0080Q.f219a;
        r4.offsetTopAndBottom(-r7);
        m1836C(1);
        goto L31
    L8:
        r93 = null;
        goto L9
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: k */
    public final void mo1819k(CoordinatorLayout r1, View r2, int r3, int r4, int r5, int[] r6) {
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: m */
    public final void mo1820m(View r6, Parcelable r7) {
        C0980b r72 = (C0980b) r7;
        int r62 = this.f2307a;
        if (r62 != 0) goto L6;
    L22:
        int r63 = r72.f3464c;
        if (r63 == 1) goto L27;
        if (r63 == 2) goto L27;
        this.f2292L = r63;
        return;
    L27:
        this.f2292L = 4;
        return;
    L6:
        if (r62 != (-1)) goto L8;
    L9:
        this.f2315e = r72.f3465d;
    L10:
        if (r62 != (-1)) goto L12;
    L13:
        this.f2309b = r72.f3466e;
    L14:
        if (r62 != (-1)) goto L16;
    L17:
        this.f2289I = r72.f3467f;
    L18:
        if (r62 != (-1)) goto L20;
    L21:
        this.f2290J = r72.f3468g;
        goto L22
    L20:
        if ((r62 & 8) != 8) goto L22;
    L16:
        if ((r62 & 4) != 4) goto L18;
    L12:
        if ((r62 & 2) != 2) goto L14;
    L8:
        if ((r62 & 1) != 1) goto L10;
        goto L9
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: n */
    public final Parcelable mo1821n(View r2) {
        return new C0980b(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: o */
    public final boolean mo1822o(View r1, int r2, int r3) {
        this.f2295O = 0;
        this.f2296P = false;
        if ((r2 & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: p */
    public final void mo1823p(View r4, View r5, int r6) {
        int r1 = 3;
        if (r4.getTop() != m1850x()) goto L6;
        m1836C(3);
        return;
    L6:
        WeakReference r62 = this.f2302V;
        if (r62 != null) goto L9;
        return;
    L9:
        if (r5 == r62.get()) goto L11;
        return;
    L11:
        if (this.f2296P == true) goto L14;
        return;
    L14:
        if (this.f2295O <= 0) goto L22;
        if (this.f2309b == false) goto L19;
    L51:
        m1838E(r4, r1, false);
        this.f2296P = false;
        return;
    L19:
        if (r4.getTop() <= this.f2285E) goto L51;
    L50:
        r1 = 6;
        goto L51
    L22:
        if (this.f2289I == false) goto L31;
        VelocityTracker r52 = this.f2304X;
        if (r52 != null) goto L26;
        float r53 = 0.0f;
    L28:
        if (m1837D(r4, r53) == false) goto L31;
        r1 = 5;
        goto L51
    L26:
        r52.computeCurrentVelocity(1000, this.f2311c);
        r53 = this.f2304X.getYVelocity(this.f2305Y);
    L31:
        if (this.f2295O != 0) goto L46;
        int r54 = r4.getTop();
        if (this.f2309b == true) goto L35;
        int r2 = this.f2285E;
        if (r54 >= r2) goto L43;
        if (r54 >= Math.abs(r54 - this.f2287G)) goto L50;
    L43:
        if (Math.abs(r54 - r2) < Math.abs(r54 - this.f2287G)) goto L50;
    L47:
        r1 = 4;
        goto L51
    L35:
        if (Math.abs(r54 - this.f2284D) >= Math.abs(r54 - this.f2287G)) goto L47;
    L46:
        if (this.f2309b == true) goto L47;
        int r55 = r4.getTop();
        if (Math.abs(r55 - this.f2285E) >= Math.abs(r55 - this.f2287G)) goto L47;
        goto L47
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: q */
    public final boolean mo1824q(View r6, MotionEvent r7) {
        if (r6.isShown() == true) goto L6;
        return false;
    L6:
        int r02 = r7.getActionMasked();
        int r1 = this.f2292L;
        if (r1 != 1) goto L10;
        if (r02 != 0) goto L10;
        return true;
    L10:
        C0245e r3 = this.f2293M;
        if (r3 != null) goto L13;
    L16:
        if (r02 != 0) goto L21;
        this.f2305Y = -1;
        this.f2306Z = -1;
        VelocityTracker r12 = this.f2304X;
        if (r12 == null) goto L21;
        r12.recycle();
        this.f2304X = null;
    L21:
        if (this.f2304X != null) goto L23;
        this.f2304X = VelocityTracker.obtain();
    L23:
        this.f2304X.addMovement(r7);
        if (this.f2293M == null) goto L37;
        if (this.f2291K == true) goto L30;
        if (this.f2292L != 1) goto L37;
    L30:
        if (r02 != 2) goto L37;
        if (this.f2294N == true) goto L37;
        float r03 = Math.abs(this.f2306Z - r7.getY());
        C0245e r13 = this.f2293M;
        if (r03 <= r13.f504b) goto L37;
        r13.m670b(r6, r7.getPointerId(r7.getActionIndex()));
    L37:
        return !this.f2294N;
    L13:
        if (this.f2291K == true) goto L15;
        if (r1 != 1) goto L16;
    L15:
        r3.m677i(r7);
        goto L16
    }

    /* JADX INFO: renamed from: r */
    public final void m1846r() {
        int r02 = m1848t();
        if (this.f2309b == false) goto L5;
        this.f2287G = Math.max(this.f2300T - r02, this.f2284D);
        return;
    L5:
        this.f2287G = this.f2300T - r02;
    }

    /* JADX INFO: renamed from: s */
    public final float m1847s() {
        float r1 = 0.0f;
        if (this.f2319i == null) goto L31;
        WeakReference r02 = this.f2301U;
        if (r02 == null) goto L31;
        if (r02.get() == null) goto L31;
        if (Build.VERSION.SDK_INT < 31) goto L31;
        View r03 = (View) this.f2301U.get();
        if (m1852z() == false) goto L31;
        WindowInsets r04 = r03.getRootWindowInsets();
        if (r04 == null) goto L31;
        C1123g r2 = this.f2319i;
        float r22 = r2.f4312a.f4290a.f4351e.mo2634a(r2.m2647g());
        RoundedCorner r3 = AbstractC0093c.m331h(r04);
        if (r3 == null) goto L21;
        float r32 = AbstractC0093c.m326c(r3);
        if (r32 <= 0.0f) goto L21;
        if (r22 <= 0.0f) goto L21;
        float r33 = r32 / r22;
    L22:
        C1123g r23 = this.f2319i;
        float r24 = r23.f4312a.f4290a.f4352f.mo2634a(r23.m2647g());
        RoundedCorner r05 = AbstractC0093c.m336m(r04);
        if (r05 == null) goto L30;
        float r06 = AbstractC0093c.m326c(r05);
        if (r06 <= 0.0f) goto L30;
        if (r24 <= 0.0f) goto L30;
        r1 = r06 / r24;
    L30:
        return Math.max(r33, r1);
    L21:
        r33 = 0.0f;
    L31:
        return 0.0f;
    }

    /* JADX INFO: renamed from: t */
    public final int m1848t() {
        if (this.f2316f == false) goto L7;
        return Math.min(Math.max(this.f2317g, this.f2300T - ((this.f2299S * 9) / 16)), this.f2298R) + this.f2332v;
    L7:
        if (this.f2324n == true) goto L15;
        if (this.f2325o == true) goto L15;
        int r02 = this.f2323m;
        if (r02 <= 0) goto L15;
        return Math.max(this.f2315e, r02 + this.f2318h);
    L15:
        return this.f2315e + this.f2332v;
    }

    /* JADX INFO: renamed from: u */
    public final void m1849u(int r3) {
        if (((View) this.f2301U.get()) == null) goto L17;
        ArrayList r02 = this.f2303W;
        if (r02.isEmpty() == true) goto L18;
        int r1 = this.f2287G;
        if (r3 > r1) goto L13;
        if (r1 == m1850x()) goto L13;
        m1850x();
    L13:
        if (r02.size() <= 0) goto L19;
        AbstractC0324d.m726i(r02.get(0));
        throw null;
    L19:
        return;
    L18:
        return;
    }

    /* JADX INFO: renamed from: x */
    public final int m1850x() {
        if (this.f2309b == true) goto L11;
        int r02 = this.f2283C;
        if (this.f2328r == false) goto L8;
        int r1 = 0;
    L10:
        return Math.max(r02, r1);
    L8:
        r1 = this.f2333w;
        goto L10
    L11:
        return this.f2284D;
    }

    /* JADX INFO: renamed from: y */
    public final int m1851y(int r3) {
        if (r3 == 3) goto L19;
        if (r3 == 4) goto L17;
        if (r3 == 5) goto L15;
        if (r3 != 6) goto L13;
        return this.f2285E;
    L13:
        throw new IllegalArgumentException(AbstractC0324d.m720c("Invalid state to get top offset: ", r3));
    L15:
        return this.f2300T;
    L17:
        return this.f2287G;
    L19:
        return m1850x();
    }

    /* JADX INFO: renamed from: z */
    public final boolean m1852z() {
        WeakReference r02 = this.f2301U;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.get() == null) goto L13;
        int[] r03 = new int[2];
        ((View) this.f2301U.get()).getLocationOnScreen(r03);
        if (r03[1] == 0) goto L10;
        return false;
    L10:
        return true;
    L13:
        return false;
    }

    public BottomSheetBehavior(Context r13, AttributeSet r14) {
        int r1 = 2;
        this.f2307a = 0;
        this.f2309b = true;
        this.f2321k = -1;
        this.f2322l = -1;
        this.f2281A = new C0501a(this);
        this.f2286F = 0.5f;
        this.f2288H = -1.0f;
        this.f2291K = true;
        this.f2292L = 4;
        this.f2297Q = 0.1f;
        this.f2303W = new ArrayList();
        this.f2306Z = -1;
        this.f2312c0 = new SparseIntArray();
        this.f2314d0 = new C0979a(this, 0);
        this.f2318h = r13.getResources().getDimensionPixelSize(C1031R.dimen.mtrl_min_touch_target_size);
        TypedArray r7 = r13.obtainStyledAttributes(r14, AbstractC0942a.f3329a);
        int r8 = 3;
        if (r7.hasValue(3) == false) goto L6;
        this.f2320j = AbstractC0805P.m2051r(r13, r7, 3);
    L6:
        if (r7.hasValue(21) == false) goto L8;
        this.f2335y = C1127k.m2657a(r13, r14, C1031R.attr.bottomSheetStyle, C1031R.style.Widget_Design_BottomSheet_Modal).m2656a();
    L8:
        C1127k r142 = this.f2335y;
        if (r142 == null) goto L15;
        C1123g r9 = new C1123g(r142);
        this.f2319i = r9;
        r9.m2649i(r13);
        ColorStateList r143 = this.f2320j;
        if (r143 == null) goto L14;
        this.f2319i.m2651k(r143);
        goto L15
    L14:
        TypedValue r144 = new TypedValue();
        r13.getTheme().resolveAttribute(R.attr.colorBackground, r144, true);
        this.f2319i.setTint(r144.data);
    L15:
        ValueAnimator r145 = ValueAnimator.ofFloat(new float[]{m1847s(), 1.0f});
        this.f2282B = r145;
        r145.setDuration(500);
        this.f2282B.addUpdateListener(new C0020F(r1, this));
        this.f2288H = r7.getDimension(2, -1.0f);
        if (r7.hasValue(0) == false) goto L19;
        this.f2321k = r7.getDimensionPixelSize(0, -1);
    L19:
        if (r7.hasValue(1) == false) goto L21;
        this.f2322l = r7.getDimensionPixelSize(1, -1);
    L21:
        TypedValue r12 = r7.peekValue(9);
        if (r12 == null) goto L26;
        int r15 = r12.data;
        if (r15 != (-1)) goto L26;
        m1834A(r15);
    L27:
        boolean r146 = r7.getBoolean(8, false);
        if (this.f2289I == r146) goto L35;
        this.f2289I = r146;
        if (r146 == false) goto L32;
    L34:
        m1839F();
        goto L35
    L32:
        if (this.f2292L != 5) goto L34;
        m1835B(4);
    L35:
        this.f2324n = r7.getBoolean(13, false);
        boolean r16 = r7.getBoolean(6, true);
        if (this.f2309b == r16) goto L48;
        this.f2309b = r16;
        if (this.f2301U == null) goto L42;
        m1846r();
    L42:
        if (this.f2309b == true) goto L44;
    L46:
        r8 = this.f2292L;
    L47:
        m1836C(r8);
        m1840G(this.f2292L, true);
        m1839F();
        goto L48
    L44:
        if (this.f2292L != 6) goto L46;
    L48:
        this.f2290J = r7.getBoolean(12, false);
        this.f2291K = r7.getBoolean(4, true);
        this.f2307a = r7.getInt(10, 0);
        float r147 = r7.getFloat(7, 0.5f);
        if (r147 <= 0.0f) goto L72;
        if (r147 >= 1.0f) goto L72;
        this.f2286F = r147;
        if (this.f2301U == null) goto L55;
        this.f2285E = (int) ((1.0f - r147) * this.f2300T);
    L55:
        TypedValue r148 = r7.peekValue(5);
        if (r148 != null) goto L58;
    L64:
        int r149 = r7.getDimensionPixelOffset(5, 0);
        if (r149 < 0) goto L70;
        this.f2283C = r149;
        m1840G(this.f2292L, true);
    L67:
        this.f2313d = r7.getInt(11, 500);
        this.f2325o = r7.getBoolean(17, false);
        this.f2326p = r7.getBoolean(18, false);
        this.f2327q = r7.getBoolean(19, false);
        this.f2328r = r7.getBoolean(20, true);
        this.f2329s = r7.getBoolean(14, false);
        this.f2330t = r7.getBoolean(15, false);
        this.f2331u = r7.getBoolean(16, false);
        this.f2334x = r7.getBoolean(23, true);
        r7.recycle();
        this.f2311c = ViewConfiguration.get(r13).getScaledMaximumFlingVelocity();
        return;
    L70:
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    L58:
        if (r148.type != 16) goto L64;
        int r1410 = r148.data;
        if (r1410 < 0) goto L63;
        this.f2283C = r1410;
        m1840G(this.f2292L, true);
        goto L67
    L63:
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    L72:
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    L26:
        m1834A(r7.getDimensionPixelSize(9, -1));
        goto L27
    }
}
