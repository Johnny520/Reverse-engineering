package com.google.android.material.bottomsheet;

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
import android.view.AbsSavedState;
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
import io.github.cherrywechat.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import p000.AbstractC0213Ey;
import p000.AbstractC0706Qb;
import p000.AbstractC0714Qj;
import p000.AbstractC0773S;
import p000.AbstractC0828TB;
import p000.AbstractC0939Vu;
import p000.AbstractC0951W5;
import p000.AbstractC1360eE;
import p000.AbstractC2185lE;
import p000.AbstractC2374ph;
import p000.C0299Gy;
import p000.C0307H5;
import p000.C0602O;
import p000.C0645P;
import p000.C0728Qx;
import p000.C0834Tb;
import p000.C0902V;
import p000.C0935Vq;
import p000.C0994X5;
import p000.C1021Xq;
import p000.C1037Y5;
import p000.C1080Z5;
import p000.C1124a6;
import p000.C1204b6;
import p000.C1512hr;
import p000.C2228mE;
import p000.C2358pF;
import p000.C2409qF;
import p000.C2712xb;
import p000.RunnableC1482h4;
import p000.ViewOnApplyWindowInsetsListenerC2315oF;
import p000.ViewOnAttachStateChangeListenerC0488LE;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends AbstractC0706Qb {

    /* JADX INFO: renamed from: A */
    public final C1204b6 f4409A;

    /* JADX INFO: renamed from: B */
    public final ValueAnimator f4410B;

    /* JADX INFO: renamed from: C */
    public final int f4411C;

    /* JADX INFO: renamed from: D */
    public int f4412D;

    /* JADX INFO: renamed from: E */
    public int f4413E;

    /* JADX INFO: renamed from: F */
    public final float f4414F;

    /* JADX INFO: renamed from: G */
    public int f4415G;

    /* JADX INFO: renamed from: H */
    public final float f4416H;

    /* JADX INFO: renamed from: I */
    public boolean f4417I;

    /* JADX INFO: renamed from: J */
    public boolean f4418J;

    /* JADX INFO: renamed from: K */
    public final boolean f4419K;

    /* JADX INFO: renamed from: L */
    public final boolean f4420L;

    /* JADX INFO: renamed from: M */
    public boolean f4421M;

    /* JADX INFO: renamed from: N */
    public int f4422N;

    /* JADX INFO: renamed from: O */
    public C2228mE f4423O;

    /* JADX INFO: renamed from: P */
    public boolean f4424P;

    /* JADX INFO: renamed from: Q */
    public int f4425Q;

    /* JADX INFO: renamed from: R */
    public boolean f4426R;

    /* JADX INFO: renamed from: S */
    public final float f4427S;

    /* JADX INFO: renamed from: T */
    public int f4428T;

    /* JADX INFO: renamed from: U */
    public int f4429U;

    /* JADX INFO: renamed from: V */
    public int f4430V;

    /* JADX INFO: renamed from: W */
    public WeakReference f4431W;

    /* JADX INFO: renamed from: X */
    public WeakReference f4432X;

    /* JADX INFO: renamed from: Y */
    public final ArrayList f4433Y;

    /* JADX INFO: renamed from: Z */
    public VelocityTracker f4434Z;

    /* JADX INFO: renamed from: a */
    public final int f4435a;

    /* JADX INFO: renamed from: a0 */
    public int f4436a0;

    /* JADX INFO: renamed from: b */
    public boolean f4437b;

    /* JADX INFO: renamed from: b0 */
    public int f4438b0;

    /* JADX INFO: renamed from: c */
    public final float f4439c;

    /* JADX INFO: renamed from: c0 */
    public boolean f4440c0;

    /* JADX INFO: renamed from: d */
    public final int f4441d;

    /* JADX INFO: renamed from: d0 */
    public HashMap f4442d0;

    /* JADX INFO: renamed from: e */
    public int f4443e;

    /* JADX INFO: renamed from: e0 */
    public final SparseIntArray f4444e0;

    /* JADX INFO: renamed from: f */
    public boolean f4445f;

    /* JADX INFO: renamed from: f0 */
    public final C1080Z5 f4446f0;

    /* JADX INFO: renamed from: g */
    public int f4447g;

    /* JADX INFO: renamed from: h */
    public final int f4448h;

    /* JADX INFO: renamed from: i */
    public final C1021Xq f4449i;

    /* JADX INFO: renamed from: j */
    public final ColorStateList f4450j;

    /* JADX INFO: renamed from: k */
    public final int f4451k;

    /* JADX INFO: renamed from: l */
    public final int f4452l;

    /* JADX INFO: renamed from: m */
    public int f4453m;

    /* JADX INFO: renamed from: n */
    public final boolean f4454n;

    /* JADX INFO: renamed from: o */
    public final boolean f4455o;

    /* JADX INFO: renamed from: p */
    public final boolean f4456p;

    /* JADX INFO: renamed from: q */
    public final boolean f4457q;

    /* JADX INFO: renamed from: r */
    public final boolean f4458r;

    /* JADX INFO: renamed from: s */
    public final boolean f4459s;

    /* JADX INFO: renamed from: t */
    public final boolean f4460t;

    /* JADX INFO: renamed from: u */
    public final boolean f4461u;

    /* JADX INFO: renamed from: v */
    public int f4462v;

    /* JADX INFO: renamed from: w */
    public int f4463w;

    /* JADX INFO: renamed from: x */
    public final boolean f4464x;

    /* JADX INFO: renamed from: y */
    public final C0728Qx f4465y;

    /* JADX INFO: renamed from: z */
    public boolean f4466z;

    public BottomSheetBehavior() {
        this.f4435a = 0;
        this.f4437b = true;
        this.f4451k = -1;
        this.f4452l = -1;
        this.f4409A = new C1204b6(this);
        this.f4414F = 0.5f;
        this.f4416H = -1.0f;
        this.f4419K = true;
        this.f4420L = true;
        this.f4422N = 4;
        this.f4427S = 0.1f;
        this.f4433Y = new ArrayList();
        this.f4438b0 = -1;
        this.f4444e0 = new SparseIntArray();
        this.f4446f0 = new C1080Z5(this, 0);
    }

    /* JADX INFO: renamed from: v */
    public static View m2427v(View r3) {
        if (r3.getVisibility() == 0) goto L6;
        return null;
    L6:
        if (r3.isNestedScrollingEnabled() == false) goto L9;
        return r3;
    L9:
        if ((r3 instanceof ViewGroup) == false) goto L16;
        ViewGroup r32 = (ViewGroup) r3;
        int r0 = r32.getChildCount();
        int r1 = 0;
    L11:
        if (r1 >= r0) goto L21;
        View r2 = m2427v(r32.getChildAt(r1));
        if (r2 != null) goto L14;
        r1 = r1 + 1;
        goto L11
    L14:
        return r2;
    L21:
        return null;
    L16:
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static int m2428w(int r0, int r1, int r2, int r3) {
        int r02 = ViewGroup.getChildMeasureSpec(r0, r1, r3);
        if (r2 != (-1)) goto L5;
        return r02;
    L5:
        int r12 = View.MeasureSpec.getMode(r02);
        int r03 = View.MeasureSpec.getSize(r02);
        if (r12 == 1073741824) goto L13;
        if (r03 == 0) goto L11;
        r2 = Math.min(r03, r2);
    L11:
        return View.MeasureSpec.makeMeasureSpec(r2, Integer.MIN_VALUE);
    L13:
        return View.MeasureSpec.makeMeasureSpec(Math.min(r03, r2), 1073741824);
    }

    /* JADX INFO: renamed from: A */
    public final void m2429A(int r2) {
        if (r2 != (-1)) goto L8;
        if (this.f4445f == true) goto L12;
        this.f4445f = true;
    L14:
        m2437I();
        return;
    L12:
        return;
    L8:
        if (this.f4445f == false) goto L10;
    L13:
        this.f4445f = false;
        this.f4443e = Math.max(0, r2);
        goto L14
    L10:
        if (this.f4443e != r2) goto L13;
    }

    /* JADX INFO: renamed from: B */
    public final void m2430B(int r5) {
        if (r5 != 1) goto L5;
    L37:
        StringBuilder r2 = new StringBuilder("STATE_");
        if (r5 != 1) goto L40;
        String r52 = "DRAGGING";
    L42:
        throw new IllegalArgumentException(AbstractC0213Ey.m410h(r2, r52, " should not be set externally."));
    L40:
        r52 = "SETTLING";
        goto L42
    L5:
        if (r5 == 2) goto L37;
        if (this.f4417I == true) goto L13;
        if (r5 != 5) goto L13;
        return;
    L13:
        if (r5 == 6) goto L15;
    L19:
        int r0 = r5;
    L20:
        WeakReference r1 = this.f4431W;
        if (r1 != null) goto L23;
    L35:
        m2431C(r5);
        return;
    L23:
        if (r1.get() == null) goto L35;
        View r53 = (View) this.f4431W.get();
        RunnableC1482h4 r12 = new RunnableC1482h4(this, r53, r0);
        ViewParent r02 = r53.getParent();
        if (r02 != null) goto L28;
    L33:
        r12.run();
        return;
    L28:
        if (r02.isLayoutRequested() == false) goto L33;
        if (r53.isAttachedToWindow() == false) goto L33;
        r53.post(r12);
        return;
    L15:
        if (this.f4437b == false) goto L19;
        if (m2443y(r5) > this.f4412D) goto L19;
        r0 = 3;
        goto L20
    }

    /* JADX INFO: renamed from: C */
    public final void m2431C(int r7) {
        if (this.f4422N == r7) goto L29;
        this.f4422N = r7;
        if (r7 == 4) goto L10;
        if (r7 == 3) goto L10;
        if (r7 == 6) goto L10;
        boolean r4 = this.f4417I;
    L10:
        WeakReference r42 = this.f4431W;
        if (r42 != null) goto L14;
        return;
    L14:
        if (((View) r42.get()) != null) goto L17;
        return;
    L17:
        if (r7 != 3) goto L19;
        m2436H(true);
    L23:
        m2435G(r7, true);
        ArrayList r72 = this.f4433Y;
        if (r72.size() > 0) goto L27;
        m2434F();
        return;
    L27:
        r72.get(0).getClass();
        throw new ClassCastException();
    L19:
        if (r7 == 6) goto L22;
        if (r7 == 5) goto L22;
        if (r7 != 4) goto L23;
    L22:
        m2436H(false);
        goto L23
    }

    /* JADX INFO: renamed from: D */
    public final boolean m2432D(View r5, float r6) {
        if (this.f4418J == false) goto L6;
        return true;
    L6:
        if (r5.getTop() >= this.f4415G) goto L9;
        return false;
    L9:
        if ((Math.abs(((r6 * this.f4427S) + r5.getTop()) - this.f4415G) / m2440t()) <= 0.5f) goto L11;
        return true;
    L11:
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final void m2433E(View r3, int r4, boolean r5) {
        int r0 = m2443y(r4);
        C2228mE r1 = this.f4423O;
        if (r1 == null) goto L18;
        if (r5 == true) goto L6;
        int r52 = r3.getLeft();
        r1.f7766r = r3;
        r1.f7751c = -1;
        boolean r32 = r1.m4493h(r52, r0, 0, 0);
        if (r32 == false) goto L11;
    L15:
        if (r32 == false) goto L18;
    L16:
        m2431C(2);
        m2435G(r4, true);
        this.f4409A.m2324a(r4);
        return;
    L11:
        if (r1.f7749a != 0) goto L15;
        if (r1.f7766r == null) goto L15;
        r1.f7766r = null;
        goto L15
    L6:
        if (r1.m4499n(r3.getLeft(), r0) == true) goto L16;
    L18:
        m2431C(r4);
    }

    /* JADX INFO: renamed from: F */
    public final void m2434F() {
        WeakReference r0 = this.f4431W;
        if (r0 == null) goto L80;
        View r02 = (View) r0.get();
        if (r02 == null) goto L81;
        AbstractC2185lE.m4396i(r02, 524288);
        AbstractC2185lE.m4393f(r02, 0);
        AbstractC2185lE.m4396i(r02, 262144);
        AbstractC2185lE.m4393f(r02, 0);
        AbstractC2185lE.m4396i(r02, 1048576);
        AbstractC2185lE.m4393f(r02, 0);
        SparseIntArray r2 = this.f4444e0;
        int r4 = r2.get(0, -1);
        if (r4 == (-1)) goto L10;
        AbstractC2185lE.m4396i(r02, r4);
        AbstractC2185lE.m4393f(r02, 0);
        r2.delete(0);
    L10:
        int r5 = 6;
        if (this.f4437b == true) goto L50;
        if (this.f4422N == 6) goto L50;
        String r10 = r02.getResources().getString(R.string.bottomsheet_action_expand_halfway);
        C0307H5 r11 = new C0307H5(r5, this);
        ArrayList r42 = AbstractC2185lE.m4391d(r02);
        int r6 = 0;
    L16:
        if (r6 >= r42.size()) goto L21;
        if (TextUtils.equals(r10, ((AccessibilityNodeInfo.AccessibilityAction) ((C0902V) r42.get(r6)).f2810a).getLabel()) == true) goto L19;
        r6 = r6 + 1;
        goto L16
    L19:
        int r9 = ((C0902V) r42.get(r6)).m1752a();
    L37:
        if (r9 == (-1)) goto L48;
        C0902V r7 = new C0902V(null, r9, r10, r11, null);
        View.AccessibilityDelegate r3 = AbstractC2185lE.m4390c(r02);
        if (r3 != null) goto L42;
        C0645P r32 = null;
    L45:
        if (r32 != null) goto L47;
        r32 = new C0645P();
    L47:
        AbstractC2185lE.m4399l(r02, r32);
        AbstractC2185lE.m4396i(r02, r7.m1752a());
        AbstractC2185lE.m4391d(r02).add(r7);
        AbstractC2185lE.m4393f(r02, 0);
        goto L48
    L42:
        if ((r3 instanceof C0602O) == false) goto L44;
        r32 = ((C0602O) r3).f1942a;
        goto L45
    L44:
        r32 = new C0645P(r3);
    L48:
        r2.put(0, r9);
        goto L50
    L21:
        int r72 = 0;
        int r62 = -1;
    L22:
        int[] r8 = AbstractC2185lE.f7620d;
        if (r72 >= 32) goto L36;
        if (r62 != (-1)) goto L36;
        int r82 = r8[r72];
        int r12 = 0;
        boolean r13 = true;
    L27:
        if (r12 >= r42.size()) goto L33;
        if (((C0902V) r42.get(r12)).m1752a() == r82) goto L31;
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
        r62 = r82;
    L35:
        r72 = r72 + 1;
    L36:
        r9 = r62;
    L50:
        if (this.f4417I == false) goto L54;
        int r22 = 5;
        if (this.f4422N == 5) goto L54;
        AbstractC2185lE.m4397j(r02, C0902V.f2807j, new C0307H5(r22, this));
    L54:
        int r1 = this.f4422N;
        int r23 = 4;
        int r33 = 3;
        if (r1 == 3) goto L67;
        if (r1 == 4) goto L62;
        if (r1 != 6) goto L82;
        AbstractC2185lE.m4397j(r02, C0902V.f2806i, new C0307H5(r23, this));
        AbstractC2185lE.m4397j(r02, C0902V.f2805h, new C0307H5(r33, this));
        return;
    L82:
        return;
    L62:
        if (this.f4437b == false) goto L64;
        r5 = 3;
    L64:
        AbstractC2185lE.m4397j(r02, C0902V.f2805h, new C0307H5(r5, this));
        return;
    L67:
        if (this.f4437b == false) goto L69;
        r5 = 4;
    L69:
        AbstractC2185lE.m4397j(r02, C0902V.f2806i, new C0307H5(r5, this));
        return;
    L81:
        return;
    }

    /* JADX INFO: renamed from: G */
    public final void m2435G(int r7, boolean r8) {
        if (r7 != 2) goto L6;
        return;
    L6:
        if (this.f4422N == 3) goto L8;
    L12:
        boolean r72 = false;
    L14:
        if (this.f4466z == r72) goto L41;
        C1021Xq r1 = this.f4449i;
        if (r1 == null) goto L44;
        this.f4466z = r72;
        ValueAnimator r4 = this.f4410B;
        float r5 = 1.0f;
        if (r8 == false) goto L30;
        if (r4 == null) goto L30;
        if (r4.isRunning() == false) goto L25;
        r4.reverse();
        return;
    L25:
        float r82 = r1.f3241b.f2911j;
        if (r72 == false) goto L28;
        r5 = m2439s();
    L28:
        r4.setFloatValues(new float[]{r82, r5});
        r4.start();
        return;
    L30:
        if (r4 == null) goto L35;
        if (r4.isRunning() == false) goto L35;
        r4.cancel();
    L35:
        if (this.f4466z == false) goto L37;
        r5 = m2439s();
    L37:
        C0935Vq r73 = r1.f3241b;
        if (r73.f2911j == r5) goto L42;
        r73.f2911j = r5;
        r1.f3245f = true;
        r1.f3246g = true;
        r1.invalidateSelf();
        return;
    L42:
        return;
    L44:
        return;
    L41:
        return;
    L8:
        if (this.f4464x == false) goto L10;
    L11:
        r72 = true;
        goto L14
    L10:
        if (m2444z() == false) goto L12;
        goto L11
    }

    /* JADX INFO: renamed from: H */
    public final void m2436H(boolean r7) {
        WeakReference r0 = this.f4431W;
        if (r0 == null) goto L30;
        ViewParent r02 = ((View) r0.get()).getParent();
        if ((r02 instanceof CoordinatorLayout) == false) goto L31;
        CoordinatorLayout r03 = (CoordinatorLayout) r02;
        int r1 = r03.getChildCount();
        if (r7 == true) goto L11;
    L13:
        int r2 = 0;
    L14:
        if (r2 >= r1) goto L21;
        View r3 = r03.getChildAt(r2);
        if (r3 == this.f4431W.get()) goto L20;
        if (r7 == false) goto L20;
        this.f4442d0.put(r3, Integer.valueOf(r3.getImportantForAccessibility()));
    L20:
        r2 = r2 + 1;
        goto L14
    L21:
        if (r7 == true) goto L29;
        this.f4442d0 = null;
        return;
    L29:
        return;
    L11:
        if (this.f4442d0 != null) goto L28;
        this.f4442d0 = new HashMap(r1);
        goto L13
    L28:
        return;
    L31:
        return;
    }

    /* JADX INFO: renamed from: I */
    public final void m2437I() {
        if (this.f4431W == null) goto L10;
        m2438r();
        if (this.f4422N != 4) goto L11;
        View r0 = (View) this.f4431W.get();
        if (r0 == null) goto L12;
        r0.requestLayout();
        return;
    L12:
        return;
    L11:
        return;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: c */
    public final void mo1455c(C0834Tb r1) {
        this.f4431W = null;
        this.f4423O = null;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: e */
    public final void mo1457e() {
        this.f4431W = null;
        this.f4423O = null;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: f */
    public final boolean mo1458f(CoordinatorLayout r10, View r11, MotionEvent r12) {
        if (r11.isShown() == true) goto L5;
    L68:
        this.f4424P = true;
        return false;
    L5:
        if (this.f4419K == false) goto L68;
        int r0 = r12.getActionMasked();
        View r3 = null;
        if (r0 != 0) goto L13;
        this.f4436a0 = -1;
        this.f4438b0 = -1;
        VelocityTracker r5 = this.f4434Z;
        if (r5 == null) goto L13;
        r5.recycle();
        this.f4434Z = null;
    L13:
        if (this.f4434Z != null) goto L15;
        this.f4434Z = VelocityTracker.obtain();
    L15:
        this.f4434Z.addMovement(r12);
        if (r0 == 0) goto L25;
        if (r0 != 1) goto L19;
    L21:
        this.f4440c0 = false;
        this.f4436a0 = -1;
        if (this.f4424P == false) goto L43;
        this.f4424P = false;
        return false;
    L43:
        if (this.f4424P == true) goto L49;
        C2228mE r112 = this.f4423O;
        if (r112 == null) goto L49;
        if (r112.m4500o(r12) == false) goto L49;
    L66:
        return true;
    L49:
        WeakReference r113 = this.f4432X;
        if (r113 == null) goto L52;
        r3 = (View) r113.get();
    L52:
        if (r0 != 2) goto L67;
        if (r3 == null) goto L67;
        if (this.f4424P == true) goto L67;
        if (this.f4422N == 1) goto L67;
        if (r10.m2138n(r3, (int) r12.getX(), (int) r12.getY()) == true) goto L67;
        if (this.f4423O == null) goto L67;
        int r102 = this.f4438b0;
        if (r102 == (-1)) goto L67;
        if (Math.abs(r102 - r12.getY()) > this.f4423O.f7750b) goto L66;
    L67:
        return false;
    L19:
        if (r0 == 3) goto L21;
    L25:
        int r6 = (int) r12.getX();
        int r7 = (int) r12.getY();
        this.f4438b0 = r7;
        if (this.f4422N == 2) goto L36;
        WeakReference r8 = this.f4432X;
        if (r8 == null) goto L30;
        View r82 = (View) r8.get();
    L31:
        if (r82 == null) goto L36;
        if (r10.m2138n(r82, r6, r7) == false) goto L36;
        this.f4436a0 = r12.getPointerId(r12.getActionIndex());
        this.f4440c0 = true;
        goto L36
    L30:
        r82 = null;
    L36:
        if (this.f4436a0 == (-1)) goto L38;
    L40:
        boolean r114 = false;
    L41:
        this.f4424P = r114;
        goto L43
    L38:
        if (r10.m2138n(r11, r6, this.f4438b0) == true) goto L40;
        r114 = true;
        goto L41
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: g */
    public final boolean mo1459g(CoordinatorLayout r11, View r12, int r13) {
        if (r11.getFitsSystemWindows() == true) goto L5;
    L7:
        int r2 = 5;
        if (this.f4431W != null) goto L56;
        this.f4447g = r11.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 29) goto L12;
    L16:
        boolean r5 = false;
    L18:
        if (this.f4455o == false) goto L20;
    L31:
        C1037Y5 r6 = new C1037Y5(this, r5);
        int r7 = r12.getPaddingStart();
        r12.getPaddingTop();
        int r8 = r12.getPaddingEnd();
        int r9 = r12.getPaddingBottom();
        C1512hr r52 = new C1512hr();
        r52.f5354a = r7;
        r52.f5355b = r8;
        r52.f5356c = r9;
        C0299Gy r72 = new C0299Gy(r2, r6, r52);
        WeakHashMap r53 = AbstractC2185lE.f7617a;
        AbstractC1360eE.m2640l(r12, r72);
        if (r12.isAttachedToWindow() == false) goto L34;
        r12.requestApplyInsets();
    L35:
        C2712xb r54 = new C2712xb(r12);
        WeakHashMap r62 = AbstractC2185lE.f7617a;
        if (r0 < 30) goto L38;
        AbstractC0773S.m1584o(r12, new C2409qF(r54));
    L43:
        this.f4431W = new WeakReference(r12);
        new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
        Context r02 = r12.getContext();
        AbstractC0714Qj.m1473D(r02, R.attr.motionDurationMedium2, 300);
        AbstractC0714Qj.m1473D(r02, R.attr.motionDurationShort3, 150);
        AbstractC0714Qj.m1473D(r02, R.attr.motionDurationShort2, 100);
        Resources r03 = r12.getResources();
        r03.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        r03.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
        C1021Xq r04 = this.f4449i;
        if (r04 == null) goto L49;
        r12.setBackground(r04);
        float r63 = this.f4416H;
        if (r63 != (-1.0f)) goto L48;
        r63 = r12.getElevation();
    L48:
        r04.m1927m(r63);
    L52:
        m2434F();
        if (r12.getImportantForAccessibility() != 0) goto L56;
        r12.setImportantForAccessibility(1);
        goto L56
    L49:
        ColorStateList r05 = this.f4450j;
        if (r05 == null) goto L52;
        AbstractC1360eE.m2637i(r12, r05);
        goto L52
    L38:
        PathInterpolator r06 = C2358pF.f8245e;
        View.OnApplyWindowInsetsListener r07 = new ViewOnApplyWindowInsetsListenerC2315oF(r12, r54);
        r12.setTag(R.id.tag_window_insets_animation_callback, r07);
        if (r12.getTag(R.id.tag_compat_insets_dispatch) != null) goto L43;
        if (r12.getTag(R.id.tag_on_apply_window_listener) != null) goto L43;
        r12.setOnApplyWindowInsetsListener(r07);
        goto L43
    L34:
        r12.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0488LE());
        goto L35
    L20:
        if (this.f4456p == true) goto L31;
        if (this.f4457q == true) goto L31;
        if (this.f4459s == true) goto L31;
        if (this.f4460t == true) goto L31;
        if (this.f4461u == true) goto L31;
        if (r5 == true) goto L31;
    L12:
        if (this.f4454n == true) goto L16;
        if (this.f4445f == true) goto L16;
        r5 = true;
    L56:
        if (this.f4423O != null) goto L58;
        this.f4423O = new C2228mE(r11.getContext(), r11, this.f4446f0);
    L58:
        int r08 = r12.getTop();
        r11.m2140p(r12, r13);
        this.f4429U = r11.getWidth();
        this.f4430V = r11.getHeight();
        int r112 = r12.getHeight();
        this.f4428T = r112;
        int r132 = this.f4430V;
        int r113 = r132 - r112;
        int r55 = this.f4463w;
        if (r113 >= r55) goto L71;
        boolean r114 = this.f4458r;
        int r64 = this.f4452l;
        if (r114 == false) goto L66;
        if (r64 == (-1)) goto L65;
        r132 = Math.min(r132, r64);
    L65:
        this.f4428T = r132;
        goto L71
    L66:
        int r133 = r132 - r55;
        if (r64 == (-1)) goto L70;
        r133 = Math.min(r133, r64);
    L70:
        this.f4428T = r133;
    L71:
        this.f4412D = Math.max(0, this.f4430V - this.f4428T);
        this.f4413E = (int) ((1.0f - this.f4414F) * this.f4430V);
        m2438r();
        int r115 = this.f4422N;
        if (r115 != 3) goto L75;
        int r116 = m2442x();
        WeakHashMap r134 = AbstractC2185lE.f7617a;
        r12.offsetTopAndBottom(r116);
    L88:
        m2435G(this.f4422N, false);
        this.f4432X = new WeakReference(m2427v(r12));
        ArrayList r117 = this.f4433Y;
        if (r117.size() > 0) goto L91;
        return true;
    L91:
        r117.get(0).getClass();
        throw new ClassCastException();
    L75:
        if (r115 != 6) goto L78;
        int r118 = this.f4413E;
        WeakHashMap r135 = AbstractC2185lE.f7617a;
        r12.offsetTopAndBottom(r118);
        goto L88
    L78:
        if (this.f4417I == false) goto L82;
        if (r115 != 5) goto L82;
        int r119 = this.f4430V;
        WeakHashMap r136 = AbstractC2185lE.f7617a;
        r12.offsetTopAndBottom(r119);
    L82:
        if (r115 != 4) goto L84;
        int r1110 = this.f4415G;
        WeakHashMap r137 = AbstractC2185lE.f7617a;
        r12.offsetTopAndBottom(r1110);
        goto L88
    L84:
        if (r115 != 1) goto L86;
    L87:
        int r09 = r08 - r12.getTop();
        WeakHashMap r1111 = AbstractC2185lE.f7617a;
        r12.offsetTopAndBottom(r09);
        goto L88
    L86:
        if (r115 != 2) goto L88;
    L5:
        if (r12.getFitsSystemWindows() == true) goto L7;
        r12.setFitsSystemWindows(true);
        goto L7
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: h */
    public final boolean mo1460h(CoordinatorLayout r4, View r5, int r6, int r7, int r8) {
        ViewGroup.MarginLayoutParams r0 = (ViewGroup.MarginLayoutParams) r5.getLayoutParams();
        int r1 = r4.getPaddingLeft();
        int r62 = m2428w(r6, (((r4.getPaddingRight() + r1) + r0.leftMargin) + r0.rightMargin) + r7, this.f4451k, r0.width);
        int r72 = r4.getPaddingTop();
        r5.measure(r62, m2428w(r8, ((r4.getPaddingBottom() + r72) + r0.topMargin) + r0.bottomMargin, this.f4452l, r0.height));
        return true;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: i */
    public final boolean mo1461i(View r2) {
        WeakReference r0 = this.f4432X;
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r2 == r0.get()) goto L7;
        return false;
    L7:
        if (this.f4422N != 3) goto L9;
        return false;
    L9:
        if (this.f4421M == true) goto L17;
        return true;
    L17:
        return false;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: j */
    public final void mo1462j(CoordinatorLayout r6, View r7, View r8, int r9, int r10, int[] r11, int r12) {
        if (r12 == 1) goto L47;
        WeakReference r92 = this.f4432X;
        if (r92 == null) goto L8;
        View r93 = (View) r92.get();
    L9:
        if (r8 != r93) goto L48;
        int r122 = r7.getTop();
        int r0 = r122 - r10;
        boolean r1 = this.f4419K;
        boolean r2 = this.f4420L;
        if (r10 > 0) goto L14;
        if (r10 >= 0) goto L45;
        boolean r3 = r8.canScrollVertically(-1);
        if (this.f4426R == true) goto L35;
        if (r2 == true) goto L35;
        if (r8 != r93) goto L35;
        if (r3 == false) goto L35;
        this.f4421M = true;
        return;
    L35:
        if (r3 == true) goto L45;
        int r82 = this.f4415G;
        if (r0 > r82) goto L39;
    L42:
        if (r1 == true) goto L44;
        return;
    L44:
        r11[1] = r10;
        WeakHashMap r94 = AbstractC2185lE.f7617a;
        r7.offsetTopAndBottom(-r10);
        m2431C(1);
        goto L45
    L39:
        if (this.f4417I == true) goto L42;
        int r123 = r122 - r82;
        r11[1] = r123;
        WeakHashMap r95 = AbstractC2185lE.f7617a;
        r7.offsetTopAndBottom(-r123);
        m2431C(4);
    L45:
        m2441u(r7.getTop());
        this.f4425Q = r10;
        this.f4426R = true;
        this.f4421M = false;
        return;
    L14:
        if (this.f4426R == true) goto L22;
        if (r2 == true) goto L22;
        if (r8 != r93) goto L22;
        if (r8.canScrollVertically(1) == false) goto L22;
        this.f4421M = true;
        return;
    L22:
        if (r0 >= m2442x()) goto L24;
        int r124 = r122 - m2442x();
        r11[1] = r124;
        WeakHashMap r96 = AbstractC2185lE.f7617a;
        r7.offsetTopAndBottom(-r124);
        m2431C(3);
        goto L45
    L24:
        if (r1 == false) goto L49;
        r11[1] = r10;
        WeakHashMap r97 = AbstractC2185lE.f7617a;
        r7.offsetTopAndBottom(-r10);
        m2431C(1);
        goto L45
    L49:
        return;
    L48:
        return;
    L8:
        r93 = null;
        goto L9
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: k */
    public final void mo1463k(CoordinatorLayout r1, View r2, int r3, int r4, int r5, int[] r6) {
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: m */
    public final void mo1465m(View r6, Parcelable r7) {
        C1124a6 r72 = (C1124a6) r7;
        int r2 = this.f4435a;
        if (r2 != 0) goto L6;
    L22:
        int r73 = r72.f3537c;
        if (r73 == 1) goto L28;
        if (r73 == 2) goto L28;
        this.f4422N = r73;
        return;
    L28:
        this.f4422N = 4;
        return;
    L6:
        if (r2 != (-1)) goto L8;
    L9:
        this.f4443e = r72.f3538d;
    L10:
        if (r2 != (-1)) goto L12;
    L13:
        this.f4437b = r72.f3539e;
    L14:
        if (r2 != (-1)) goto L16;
    L17:
        this.f4417I = r72.f3540f;
    L18:
        if (r2 != (-1)) goto L20;
    L21:
        this.f4418J = r72.f3541g;
        goto L22
    L20:
        if ((r2 & 8) != 8) goto L22;
    L16:
        if ((r2 & 4) != 4) goto L18;
    L12:
        if ((r2 & 2) != 2) goto L14;
    L8:
        if ((r2 & 1) != 1) goto L10;
        goto L9
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: n */
    public final Parcelable mo1466n(View r2) {
        AbsSavedState r0 = View.BaseSavedState.EMPTY_STATE;
        return new C1124a6(this);
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: o */
    public final boolean mo1467o(View r1, int r2, int r3) {
        this.f4425Q = 0;
        this.f4426R = false;
        if ((r2 & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: p */
    public final void mo1468p(View r4, View r5, int r6) {
        int r1 = 3;
        if (r4.getTop() != m2442x()) goto L6;
        m2431C(3);
        return;
    L6:
        WeakReference r62 = this.f4432X;
        if (r62 != null) goto L9;
        return;
    L9:
        if (r5 == r62.get()) goto L11;
        return;
    L11:
        if (this.f4426R == true) goto L14;
        return;
    L14:
        if (this.f4425Q <= 0) goto L22;
        if (this.f4437b == false) goto L19;
    L51:
        m2433E(r4, r1, false);
        this.f4426R = false;
        return;
    L19:
        if (r4.getTop() <= this.f4413E) goto L51;
    L50:
        r1 = 6;
        goto L51
    L22:
        if (this.f4417I == false) goto L31;
        VelocityTracker r52 = this.f4434Z;
        if (r52 != null) goto L26;
        float r53 = 0.0f;
    L28:
        if (m2432D(r4, r53) == false) goto L31;
        r1 = 5;
        goto L51
    L26:
        r52.computeCurrentVelocity(1000, this.f4439c);
        r53 = this.f4434Z.getYVelocity(this.f4436a0);
    L31:
        if (this.f4425Q != 0) goto L46;
        int r54 = r4.getTop();
        if (this.f4437b == true) goto L35;
        int r2 = this.f4413E;
        if (r54 >= r2) goto L43;
        if (r54 >= Math.abs(r54 - this.f4415G)) goto L50;
    L43:
        if (Math.abs(r54 - r2) < Math.abs(r54 - this.f4415G)) goto L50;
    L47:
        r1 = 4;
        goto L51
    L35:
        if (Math.abs(r54 - this.f4412D) >= Math.abs(r54 - this.f4415G)) goto L47;
    L46:
        if (this.f4437b == true) goto L47;
        int r55 = r4.getTop();
        if (Math.abs(r55 - this.f4413E) >= Math.abs(r55 - this.f4415G)) goto L47;
        goto L47
    }

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: q */
    public final boolean mo1469q(View r6, MotionEvent r7) {
        if (r6.isShown() == true) goto L6;
        return false;
    L6:
        int r0 = r7.getActionMasked();
        int r1 = this.f4422N;
        if (r1 != 1) goto L10;
        if (r0 != 0) goto L10;
        return true;
    L10:
        C2228mE r3 = this.f4423O;
        if (r3 != null) goto L13;
    L16:
        if (r0 != 0) goto L21;
        this.f4436a0 = -1;
        this.f4438b0 = -1;
        VelocityTracker r12 = this.f4434Z;
        if (r12 == null) goto L21;
        r12.recycle();
        this.f4434Z = null;
    L21:
        if (this.f4434Z != null) goto L23;
        this.f4434Z = VelocityTracker.obtain();
    L23:
        this.f4434Z.addMovement(r7);
        if (this.f4423O == null) goto L37;
        if (this.f4419K == true) goto L30;
        if (this.f4422N != 1) goto L37;
    L30:
        if (r0 != 2) goto L37;
        if (this.f4424P == true) goto L37;
        float r02 = Math.abs(this.f4438b0 - r7.getY());
        C2228mE r13 = this.f4423O;
        if (r02 <= r13.f7750b) goto L37;
        r13.m4487b(r6, r7.getPointerId(r7.getActionIndex()));
    L37:
        return !this.f4424P;
    L13:
        if (this.f4419K == true) goto L15;
        if (r1 != 1) goto L16;
    L15:
        r3.m4494i(r7);
        goto L16
    }

    /* JADX INFO: renamed from: r */
    public final void m2438r() {
        int r0 = m2440t();
        if (this.f4437b == false) goto L6;
        this.f4415G = Math.max(this.f4430V - r0, this.f4412D);
        return;
    L6:
        this.f4415G = this.f4430V - r0;
    }

    /* JADX INFO: renamed from: s */
    public final float m2439s() {
        float r1 = 0.0f;
        if (this.f4449i == null) goto L39;
        WeakReference r0 = this.f4431W;
        if (r0 == null) goto L39;
        if (r0.get() == null) goto L39;
        if (Build.VERSION.SDK_INT < 31) goto L39;
        View r02 = (View) this.f4431W.get();
        if (m2444z() == false) goto L39;
        WindowInsets r03 = r02.getRootWindowInsets();
        if (r03 == null) goto L39;
        C1021Xq r2 = this.f4449i;
        float[] r3 = r2.f3237B;
        if (r3 == null) goto L17;
        float r22 = r3[3];
    L18:
        RoundedCorner r32 = AbstractC0951W5.m1819l(r03);
        if (r32 == null) goto L25;
        float r33 = AbstractC0951W5.m1811d(r32);
        if (r33 <= 0.0f) goto L25;
        if (r22 <= 0.0f) goto L25;
        float r34 = r33 / r22;
    L26:
        C1021Xq r23 = this.f4449i;
        float[] r4 = r23.f3237B;
        if (r4 == null) goto L29;
        float r24 = r4[0];
    L30:
        RoundedCorner r04 = AbstractC0951W5.m1824q(r03);
        if (r04 == null) goto L38;
        float r05 = AbstractC0951W5.m1811d(r04);
        if (r05 <= 0.0f) goto L38;
        if (r24 <= 0.0f) goto L38;
        r1 = r05 / r24;
    L38:
        return Math.max(r34, r1);
    L29:
        r24 = r23.f3241b.f2902a.f2329f.mo1563a(r23.m1921g());
    L25:
        r34 = 0.0f;
        goto L26
    L17:
        r22 = r2.f3241b.f2902a.f2328e.mo1563a(r2.m1921g());
    L39:
        return 0.0f;
    }

    /* JADX INFO: renamed from: t */
    public final int m2440t() {
        if (this.f4445f == false) goto L7;
        return Math.min(Math.max(this.f4447g, this.f4430V - ((this.f4429U * 9) / 16)), this.f4428T) + this.f4462v;
    L7:
        if (this.f4454n == true) goto L15;
        if (this.f4455o == true) goto L15;
        int r0 = this.f4453m;
        if (r0 <= 0) goto L15;
        return Math.max(this.f4443e, r0 + this.f4448h);
    L15:
        return this.f4443e + this.f4462v;
    }

    /* JADX INFO: renamed from: u */
    public final void m2441u(int r3) {
        if (((View) this.f4431W.get()) == null) goto L17;
        ArrayList r0 = this.f4433Y;
        if (r0.isEmpty() == true) goto L18;
        int r1 = this.f4415G;
        if (r3 > r1) goto L13;
        if (r1 == m2442x()) goto L13;
        m2442x();
    L13:
        if (r0.size() <= 0) goto L19;
        r0.get(0).getClass();
        throw new ClassCastException();
    L19:
        return;
    L18:
        return;
    }

    /* JADX INFO: renamed from: x */
    public final int m2442x() {
        if (this.f4437b == false) goto L7;
        return this.f4412D;
    L7:
        if (this.f4458r == false) goto L9;
        int r0 = 0;
    L11:
        return Math.max(this.f4411C, r0);
    L9:
        r0 = this.f4463w;
        goto L11
    }

    /* JADX INFO: renamed from: y */
    public final int m2443y(int r3) {
        if (r3 == 3) goto L19;
        if (r3 == 4) goto L17;
        if (r3 == 5) goto L15;
        if (r3 != 6) goto L13;
        return this.f4413E;
    L13:
        throw new IllegalArgumentException(AbstractC2374ph.m4812i(r3, "Invalid state to get top offset: "));
    L15:
        return this.f4430V;
    L17:
        return this.f4415G;
    L19:
        return m2442x();
    }

    /* JADX INFO: renamed from: z */
    public final boolean m2444z() {
        WeakReference r0 = this.f4431W;
        if (r0 != null) goto L5;
    L10:
        return false;
    L5:
        if (r0.get() == null) goto L10;
        int[] r02 = new int[2];
        ((View) this.f4431W.get()).getLocationOnScreen(r02);
        if (r02[1] != 0) goto L10;
        return true;
    }

    public BottomSheetBehavior(Context r13, AttributeSet r14) {
        int r0 = 0;
        this.f4435a = 0;
        this.f4437b = true;
        this.f4451k = -1;
        this.f4452l = -1;
        this.f4409A = new C1204b6(this);
        this.f4414F = 0.5f;
        this.f4416H = -1.0f;
        this.f4419K = true;
        this.f4420L = true;
        this.f4422N = 4;
        this.f4427S = 0.1f;
        this.f4433Y = new ArrayList();
        this.f4438b0 = -1;
        this.f4444e0 = new SparseIntArray();
        this.f4446f0 = new C1080Z5(this, r0);
        this.f4448h = r13.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray r6 = r13.obtainStyledAttributes(r14, AbstractC0939Vu.f2932a);
        int r7 = 3;
        if (r6.hasValue(3) == false) goto L6;
        this.f4450j = AbstractC0828TB.m1643j(r13, r6, 3);
    L6:
        if (r6.hasValue(22) == false) goto L8;
        this.f4465y = C0728Qx.m1512b(r13, r14, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal).m1383a();
    L8:
        C0728Qx r142 = this.f4465y;
        if (r142 == null) goto L15;
        C1021Xq r8 = new C1021Xq(r142);
        this.f4449i = r8;
        r8.m1925k(r13);
        ColorStateList r143 = this.f4450j;
        if (r143 == null) goto L14;
        this.f4449i.m1928n(r143);
        goto L15
    L14:
        TypedValue r144 = new TypedValue();
        r13.getTheme().resolveAttribute(android.R.attr.colorBackground, r144, true);
        this.f4449i.setTint(r144.data);
    L15:
        ValueAnimator r9 = ValueAnimator.ofFloat(new float[]{m2439s(), 1.0f});
        this.f4410B = r9;
        r9.setDuration(500);
        this.f4410B.addUpdateListener(new C0994X5(r0, this));
        this.f4416H = r6.getDimension(2, -1.0f);
        if (r6.hasValue(0) == false) goto L19;
        this.f4451k = r6.getDimensionPixelSize(0, -1);
    L19:
        if (r6.hasValue(1) == false) goto L21;
        this.f4452l = r6.getDimensionPixelSize(1, -1);
    L21:
        TypedValue r82 = r6.peekValue(10);
        if (r82 == null) goto L26;
        int r83 = r82.data;
        if (r83 != (-1)) goto L26;
        m2429A(r83);
    L27:
        boolean r2 = r6.getBoolean(9, false);
        if (this.f4417I == r2) goto L35;
        this.f4417I = r2;
        if (r2 == false) goto L32;
    L34:
        m2434F();
        goto L35
    L32:
        if (this.f4422N != 5) goto L34;
        m2430B(4);
    L35:
        this.f4454n = r6.getBoolean(14, false);
        boolean r22 = r6.getBoolean(7, true);
        if (this.f4437b == r22) goto L48;
        this.f4437b = r22;
        if (this.f4431W == null) goto L42;
        m2438r();
    L42:
        if (this.f4437b == true) goto L44;
    L46:
        r7 = this.f4422N;
    L47:
        m2431C(r7);
        m2435G(this.f4422N, true);
        m2434F();
        goto L48
    L44:
        if (this.f4422N != 6) goto L46;
    L48:
        this.f4418J = r6.getBoolean(13, false);
        this.f4419K = r6.getBoolean(4, true);
        this.f4420L = r6.getBoolean(5, true);
        this.f4435a = r6.getInt(11, 0);
        float r23 = r6.getFloat(8, 0.5f);
        if (r23 <= 0.0f) goto L72;
        if (r23 >= 1.0f) goto L72;
        this.f4414F = r23;
        if (this.f4431W == null) goto L55;
        this.f4413E = (int) ((1.0f - r23) * this.f4430V);
    L55:
        TypedValue r145 = r6.peekValue(6);
        if (r145 != null) goto L58;
    L64:
        int r146 = r6.getDimensionPixelOffset(6, 0);
        if (r146 < 0) goto L70;
        this.f4411C = r146;
        m2435G(this.f4422N, true);
    L67:
        this.f4441d = r6.getInt(12, 500);
        this.f4455o = r6.getBoolean(18, false);
        this.f4456p = r6.getBoolean(19, false);
        this.f4457q = r6.getBoolean(20, false);
        this.f4458r = r6.getBoolean(21, true);
        this.f4459s = r6.getBoolean(15, false);
        this.f4460t = r6.getBoolean(16, false);
        this.f4461u = r6.getBoolean(17, false);
        this.f4464x = r6.getBoolean(24, true);
        r6.recycle();
        this.f4439c = ViewConfiguration.get(r13).getScaledMaximumFlingVelocity();
        return;
    L70:
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    L58:
        if (r145.type != 16) goto L64;
        int r147 = r145.data;
        if (r147 < 0) goto L63;
        this.f4411C = r147;
        m2435G(this.f4422N, true);
        goto L67
    L63:
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    L72:
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    L26:
        m2429A(r6.getDimensionPixelSize(10, -1));
        goto L27
    }
}
