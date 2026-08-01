package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import defpackage.a00;
import defpackage.aa0;
import defpackage.ai;
import defpackage.b00;
import defpackage.bn;
import defpackage.bs;
import defpackage.d00;
import defpackage.d4;
import defpackage.dn;
import defpackage.dz;
import defpackage.ez;
import defpackage.f0;
import defpackage.fa;
import defpackage.fz;
import defpackage.gx;
import defpackage.hx;
import defpackage.hz;
import defpackage.iw;
import defpackage.iy;
import defpackage.iz;
import defpackage.ja0;
import defpackage.jz;
import defpackage.ka0;
import defpackage.kz;
import defpackage.l0;
import defpackage.lw;
import defpackage.m70;
import defpackage.n70;
import defpackage.nz;
import defpackage.oa0;
import defpackage.oz;
import defpackage.pz;
import defpackage.qz;
import defpackage.r5;
import defpackage.rz;
import defpackage.s90;
import defpackage.sx;
import defpackage.sz;
import defpackage.t90;
import defpackage.th;
import defpackage.tz;
import defpackage.u30;
import defpackage.uf;
import defpackage.uz;
import defpackage.vy;
import defpackage.vz;
import defpackage.wj;
import defpackage.x1;
import defpackage.xz;
import defpackage.y;
import defpackage.y1;
import defpackage.y6;
import defpackage.y90;
import defpackage.yq;
import defpackage.yz;
import defpackage.zt;
import defpackage.zz;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static final int[] s0 = null;
    public static final Class[] t0 = null;
    public static final dz u0 = null;
    public int A;
    public int B;
    public iz C;
    public EdgeEffect D;
    public EdgeEffect E;
    public EdgeEffect F;
    public EdgeEffect G;
    public jz H;
    public int I;
    public int J;
    public VelocityTracker K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public pz Q;
    public final int R;
    public final int S;
    public final float T;
    public final float U;
    public boolean V;
    public final a00 W;
    public final iy a;
    public dn a0;
    public final tz b;
    public final bn b0;
    public vz c;
    public final yz c0;
    public final y1 d;
    public qz d0;
    public final r5 e;
    public ArrayList e0;
    public final d4 f;
    public boolean f0;
    public boolean g;
    public boolean g0;
    public final Rect h;
    public final ez h0;
    public final Rect i;
    public boolean i0;
    public final RectF j;
    public d00 j0;
    public fz k;
    public final int[] k0;
    public nz l;
    public iw l0;
    public final ArrayList m;
    public final int[] m0;
    public final ArrayList n;
    public final int[] n0;
    public wj o;
    public final int[] o0;
    public boolean p;
    public final ArrayList p0;
    public boolean q;
    public final y6 q0;
    public boolean r;
    public final ez r0;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public final AccessibilityManager x;
    public boolean y;
    public boolean z;

    static {
        s0 = new int[]{R.attr.nestedScrollingEnabled};
        Class r1 = Integer.TYPE;
        t0 = new Class[]{Context.class, AttributeSet.class, r1, r1};
        u0 = new dz(0);
    }

    public RecyclerView(Context r2, AttributeSet r3) {
        this(r2, r3, com.ljx.wechatmod.R.attr.recyclerViewStyle);
    }

    public static RecyclerView D(View r4) {
        if ((r4 instanceof ViewGroup) == true) goto L6;
        return null;
    L6:
        if ((r4 instanceof RecyclerView) == true) goto L8;
        ViewGroup r42 = (ViewGroup) r4;
        int r0 = r42.getChildCount();
        int r2 = 0;
    L10:
        if (r2 >= r0) goto L15;
        RecyclerView r3 = D(r42.getChildAt(r2));
        if (r3 != null) goto L13;
        r2 = r2 + 1;
        goto L10
    L13:
        return r3;
    L15:
        return null;
    L8:
        return (RecyclerView) r4;
    }

    public static b00 I(View r0) {
        if (r0 != null) goto L6;
        return null;
    L6:
        return ((oz) r0.getLayoutParams()).a;
    }

    public static /* synthetic */ void a(RecyclerView r0, View r1, int r2, ViewGroup.LayoutParams r3) {
        r0.attachViewToParent(r1, r2, r3);
    }

    public static /* synthetic */ void c(RecyclerView r0, int r1) {
        r0.detachViewFromParent(r1);
    }

    public static /* synthetic */ boolean d(RecyclerView r0) {
        return r0.awakenScrollBars();
    }

    public static /* synthetic */ void e(RecyclerView r0, int r1, int r2) {
        r0.setMeasuredDimension(r1, r2);
    }

    private iw getScrollingChildHelper() {
        if (this.l0 != null) goto L6;
        this.l0 = new iw(this);
    L6:
        return this.l0;
    }

    public static void j(b00 r3) {
        WeakReference r0 = r3.b;
        if (r0 == null) goto L23;
        View r02 = (View) r0.get();
    L6:
        if (r02 == null) goto L14;
        if (r02 == r3.a) goto L24;
        Object r03 = r02.getParent();
        if ((r03 instanceof View) == true) goto L12;
        r02 = null;
        goto L6
    L12:
        r02 = (View) r03;
        goto L6
    L24:
        return;
    L14:
        r3.b = null;
        return;
    }

    public final View A(View r3) {
        ViewParent r0 = r3.getParent();
    L3:
        if (r0 == null) goto L8;
        if (r0 == this) goto L8;
        if ((r0 instanceof View) == false) goto L8;
        r3 = r0;
        r0 = r3.getParent();
    L8:
        if (r0 != this) goto L10;
        return r3;
    L10:
        return null;
    }

    public final boolean B(MotionEvent r12) {
        int r0 = r12.getAction();
        ArrayList r1 = this.n;
        int r2 = r1.size();
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L21;
        wj r5 = (wj) r1.get(r4);
        int r6 = r5.v;
        if (r6 != 1) goto L15;
        boolean r62 = r5.d(r12.getX(), r12.getY());
        boolean r9 = r5.c(r12.getX(), r12.getY());
        if (r12.getAction() != 0) goto L20;
        if (r62 == true) goto L10;
        if (r9 == false) goto L20;
    L10:
        if (r9 == false) goto L12;
        r5.w = 1;
        r5.p = (int) r12.getX();
    L14:
        r5.f(2);
    L17:
        if (r0 == 3) goto L20;
        this.o = r5;
        return true;
    L12:
        if (r62 == false) goto L14;
        r5.w = 2;
        r5.m = (int) r12.getY();
    L20:
        r4 = r4 + 1;
        goto L3
    L15:
        if (r6 != 2) goto L20;
    L21:
        return false;
    }

    public final void C(int[] r9) {
        int r0 = this.e.k();
        if (r0 != 0) goto L6;
        r9[0] = -1;
        r9[1] = -1;
        return;
    L6:
        int r3 = Integer.MAX_VALUE;
        int r4 = Integer.MIN_VALUE;
        int r5 = 0;
    L7:
        if (r5 >= r0) goto L17;
        b00 r6 = I(this.e.j(r5));
        if (r6.o() == true) goto L16;
        int r62 = r6.b();
        if (r62 >= r3) goto L14;
        r3 = r62;
    L14:
        if (r62 <= r4) goto L16;
        r4 = r62;
    L16:
        r5 = r5 + 1;
        goto L7
    L17:
        r9[0] = r3;
        r9[1] = r4;
    }

    public final b00 E(int r6) {
        b00 r1 = null;
        if (this.y == false) goto L5;
        return null;
    L5:
        int r0 = this.e.t();
        int r2 = 0;
    L6:
        if (r2 >= r0) goto L18;
        b00 r3 = I(this.e.s(r2));
        if (r3 == null) goto L17;
        if (r3.h() == true) goto L17;
        if (F(r3) != r6) goto L17;
        View r12 = r3.a;
        if (((ArrayList) this.e.d).contains(r12) == false) goto L16;
        r1 = r3;
        goto L17
    L16:
        return r3;
    L17:
        r2 = r2 + 1;
        goto L6
    L18:
        return r1;
    }

    public final int F(b00 r8) {
        if ((r8.j & 524) == 0) goto L6;
        return -1;
    L6:
        if (r8.e() == false) goto L29;
        int r82 = r8.c;
        ArrayList r0 = (ArrayList) this.d.c;
        int r2 = r0.size();
        int r3 = 0;
    L9:
        if (r3 >= r2) goto L35;
        x1 r4 = (x1) r0.get(r3);
        int r5 = r4.a;
        if (r5 == 1) goto L32;
        if (r5 != 2) goto L15;
        int r52 = r4.b;
        if (r52 > r82) goto L34;
        int r42 = r4.c;
        if ((r52 + r42) > r82) goto L29;
        r82 = r82 - r42;
    L34:
        r3 = r3 + 1;
        goto L9
    L15:
        if (r5 != 8) goto L34;
        int r53 = r4.b;
        if (r53 != r82) goto L20;
        r82 = r4.c;
        goto L34
    L20:
        if (r53 >= r82) goto L23;
        r82 = r82 - 1;
    L23:
        if (r4.c > r82) goto L34;
        r82 = r82 + 1;
        goto L34
    L32:
        if (r4.b > r82) goto L34;
        r82 = r82 + r4.c;
        goto L34
    L35:
        return r82;
    L29:
        return -1;
    }

    public final long G(b00 r3) {
        if (this.k.b == false) goto L7;
        return r3.e;
    L7:
        return r3.c;
    }

    public final b00 H(View r4) {
        ViewParent r0 = r4.getParent();
        if (r0 == null) goto L9;
        if (r0 == this) goto L9;
        throw new IllegalArgumentException("View " + r4 + " is not a direct child of " + this);
    L9:
        return I(r4);
    }

    public final Rect J(View r10) {
        oz r0 = (oz) r10.getLayoutParams();
        boolean r1 = r0.c;
        Rect r2 = r0.b;
        if (r1 == true) goto L6;
    L11:
        return r2;
    L6:
        if (this.c0.g == true) goto L8;
    L12:
        r2.set(0, 0, 0, 0);
        ArrayList r3 = this.m;
        int r4 = r3.size();
        int r5 = 0;
    L13:
        if (r5 >= r4) goto L15;
        Rect r6 = this.h;
        r6.set(0, 0, 0, 0);
        ((kz) r3.get(r5)).getClass();
        ((oz) r10.getLayoutParams()).a.getClass();
        r6.set(0, 0, 0, 0);
        r2.left += r6.left;
        r2.top += r6.top;
        r2.right += r6.right;
        r2.bottom += r6.bottom;
        r5 = r5 + 1;
        goto L13
    L15:
        r0.c = false;
        return r2;
    L8:
        if (r0.a.k() == true) goto L11;
        if (r0.a.f() == false) goto L12;
        goto L11
    }

    public final boolean K() {
        if (this.r == true) goto L5;
        return true;
    L5:
        if (this.y == false) goto L7;
        return true;
    L7:
        if (this.d.f() == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final boolean L() {
        if (this.A <= 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final void M(int r2) {
        if (this.l != null) goto L5;
        return;
    L5:
        setScrollState(2);
        this.l.l0(r2);
        awakenScrollBars();
    }

    public final void N() {
        int r0 = this.e.t();
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r2 >= r0) goto L6;
        ((oz) this.e.s(r2).getLayoutParams()).c = true;
        r2 = r2 + 1;
        goto L4
    L6:
        ArrayList r02 = this.b.c;
        int r22 = r02.size();
    L7:
        if (r1 >= r22) goto L12;
        oz r4 = (oz) ((b00) r02.get(r1)).a.getLayoutParams();
        if (r4 == null) goto L11;
        r4.c = true;
    L11:
        r1 = r1 + 1;
        goto L7
    }

    public final void O(int r10, int r11, boolean r12) {
        int r0 = r10 + r11;
        int r1 = this.e.t();
        int r2 = 0;
    L4:
        if (r2 >= r1) goto L15;
        b00 r5 = I(this.e.s(r2));
        if (r5 == null) goto L14;
        if (r5.o() == true) goto L14;
        int r6 = r5.c;
        yz r7 = this.c0;
        if (r6 < r0) goto L12;
        r5.l(-r11, r12);
        r7.f = true;
        goto L14
    L12:
        if (r6 < r10) goto L14;
        r5.a(8);
        r5.l(-r11, r12);
        r5.c = r10 - 1;
        r7.f = true;
    L14:
        r2 = r2 + 1;
        goto L4
    L15:
        tz r13 = this.b;
        ArrayList r22 = r13.c;
        int r52 = r22.size() - 1;
    L16:
        if (r52 < 0) goto L25;
        b00 r4 = (b00) r22.get(r52);
        if (r4 == null) goto L24;
        int r62 = r4.c;
        if (r62 < r0) goto L22;
        r4.l(-r11, r12);
        goto L24
    L22:
        if (r62 < r10) goto L24;
        r4.a(8);
        r13.e(r52);
    L24:
        r52 = r52 - 1;
        goto L16
    L25:
        requestLayout();
    }

    public final void P() {
        this.A++;
    }

    public final void Q(boolean r7) {
        int r0 = this.A - 1;
        this.A = r0;
        if (r0 >= 1) goto L31;
        this.A = 0;
        if (r7 == false) goto L32;
        int r72 = this.w;
        this.w = 0;
        if (r72 == 0) goto L13;
        AccessibilityManager r02 = this.x;
        if (r02 == null) goto L13;
        if (r02.isEnabled() == false) goto L13;
        AccessibilityEvent r03 = AccessibilityEvent.obtain();
        r03.setEventType(2048);
        y.b(r03, r72);
        sendAccessibilityEventUnchecked(r03);
    L13:
        ArrayList r73 = this.p0;
        int r04 = r73.size() - 1;
    L14:
        if (r04 < 0) goto L24;
        b00 r1 = (b00) r73.get(r04);
        if (r1.a.getParent() != this) goto L23;
        if (r1.o() == true) goto L23;
        int r2 = r1.q;
        if (r2 == (-1)) goto L23;
        View r4 = r1.a;
        WeakHashMap r5 = ja0.a;
        s90.s(r4, r2);
        r1.q = -1;
    L23:
        r04 = r04 - 1;
        goto L14
    L24:
        r73.clear();
        return;
    L32:
        return;
    }

    public final void R(MotionEvent r4) {
        int r0 = r4.getActionIndex();
        if (r4.getPointerId(r0) != this.J) goto L9;
        if (r0 != 0) goto L6;
        int r02 = 1;
    L7:
        this.J = r4.getPointerId(r02);
        int r1 = (int) (r4.getX(r02) + 0.5f);
        this.N = r1;
        this.L = r1;
        int r42 = (int) (r4.getY(r02) + 0.5f);
        this.O = r42;
        this.M = r42;
        return;
    L6:
        r02 = 0;
        goto L7
    }

    public final void S() {
        if (this.i0 == false) goto L5;
        return;
    L5:
        if (this.p == false) goto L9;
        WeakHashMap r0 = ja0.a;
        s90.m(this, this.q0);
        this.i0 = true;
        return;
    }

    public final void T(b00 r5, lw r6) {
        r5.j &= -8193;
        boolean r0 = this.c0.h;
        d4 r1 = this.f;
        if (r0 == true) goto L5;
    L11:
        u30 r02 = (u30) r1.b;
        oa0 r12 = (oa0) r02.getOrDefault(r5, null);
        if (r12 != null) goto L14;
        r12 = oa0.a();
        r02.put(r5, r12);
    L14:
        r12.b = r6;
        r12.a |= 4;
        return;
    L5:
        if (r5.k() == false) goto L11;
        if (r5.h() == true) goto L11;
        if (r5.o() == true) goto L11;
        ((bs) r1.c).d(G(r5), r5);
        goto L11
    }

    public final void U(View r12, View r13) {
        if (r13 == null) goto L4;
        View r0 = r13;
    L5:
        int r1 = r0.getWidth();
        int r2 = r0.getHeight();
        Rect r3 = this.h;
        r3.set(0, 0, r1, r2);
        ViewGroup.LayoutParams r02 = r0.getLayoutParams();
        if ((r02 instanceof oz) == false) goto L10;
        oz r03 = (oz) r02;
        if (r03.c == true) goto L10;
        Rect r04 = r03.b;
        r3.left -= r04.left;
        r3.right += r04.right;
        r3.top -= r04.top;
        r3.bottom += r04.bottom;
    L10:
        if (r13 == null) goto L12;
        offsetDescendantRectToMyCoords(r13, r3);
        offsetRectIntoDescendantCoords(r12, r3);
    L12:
        nz r5 = this.l;
        boolean r9 = !this.r;
        if (r13 != null) goto L15;
        boolean r10 = true;
    L16:
        r5.i0(this, r12, this.h, r9, r10);
        return;
    L15:
        r10 = false;
        goto L16
    L4:
        r0 = r12;
        goto L5
    }

    public final void V() {
        VelocityTracker r0 = this.K;
        if (r0 == null) goto L5;
        r0.clear();
    L5:
        boolean r02 = false;
        c0(0);
        EdgeEffect r1 = this.D;
        if (r1 == null) goto L8;
        r1.onRelease();
        r02 = this.D.isFinished();
    L8:
        EdgeEffect r12 = this.E;
        if (r12 == null) goto L11;
        r12.onRelease();
        r02 = r02 | this.E.isFinished();
    L11:
        EdgeEffect r13 = this.F;
        if (r13 == null) goto L14;
        r13.onRelease();
        r02 = r02 | this.F.isFinished();
    L14:
        EdgeEffect r14 = this.G;
        if (r14 == null) goto L17;
        r14.onRelease();
        r02 = r02 | this.G.isFinished();
    L17:
        if (r02 == false) goto L20;
        WeakHashMap r03 = ja0.a;
        s90.k(this);
        return;
    }

    public final boolean W(int r17, int r18, MotionEvent r19) {
        m();
        fz r1 = this.k;
        int[] r11 = this.o0;
        if (r1 == null) goto L5;
        r11[0] = 0;
        r11[1] = 0;
        X(r17, r18, r11);
        int r12 = r11[0];
        int r2 = r11[1];
        int r3 = r17 - r12;
        int r4 = r18 - r2;
    L7:
        if (this.m.isEmpty() == true) goto L9;
        invalidate();
    L9:
        int[] r7 = this.o0;
        r7[0] = 0;
        r7[1] = 0;
        s(r12, r2, r3, r4, this.m0, 0, r7);
        int r5 = r11[0];
        int r32 = r3 - r5;
        int r6 = r11[1];
        int r42 = r4 - r6;
        if (r5 != 0) goto L14;
        if (r6 != 0) goto L14;
        boolean r52 = false;
    L15:
        int r62 = this.N;
        int[] r72 = this.m0;
        int r112 = r72[0];
        this.N = r62 - r112;
        int r63 = this.O;
        int r73 = r72[1];
        this.O = r63 - r73;
        int[] r64 = this.n0;
        r64[0] = r64[0] + r112;
        r64[1] = r64[1] + r73;
        if (getOverScrollMode() == 2) goto L42;
        if (r19 != null) goto L19;
    L41:
        l(r17, r18);
        goto L42
    L19:
        if (zt.B(r19, 8194) == true) goto L41;
        float r65 = r19.getX();
        float r33 = r32;
        float r74 = r19.getY();
        float r43 = r42;
        if (r33 >= 0.0f) goto L24;
        v();
        float r192 = 0.0f;
        th.a(this.D, (-r33) / getWidth(), 1.0f - (r74 / getHeight()));
    L23:
        boolean r75 = true;
    L29:
        if (r43 >= r192) goto L33;
        x();
        th.a(this.E, (-r43) / getHeight(), r65 / getWidth());
    L31:
        r75 = true;
    L35:
        if (r75 == false) goto L37;
    L40:
        WeakHashMap r34 = ja0.a;
        s90.k(this);
        goto L41
    L37:
        if (r33 != r192) goto L40;
        if (r43 == r192) goto L41;
    L33:
        if (r43 <= r192) goto L35;
        u();
        th.a(this.G, r43 / getHeight(), 1.0f - (r65 / getWidth()));
        goto L31
    L24:
        r192 = 0.0f;
        if (r33 <= 0.0f) goto L27;
        w();
        th.a(this.F, r33 / getWidth(), r74 / getHeight());
        goto L23
    L27:
        r75 = false;
    L42:
        if (r12 != 0) goto L44;
        if (r2 != 0) goto L44;
    L46:
        if (awakenScrollBars() == true) goto L48;
        invalidate();
    L48:
        if (r52 == true) goto L53;
        if (r12 != 0) goto L53;
        if (r2 != 0) goto L53;
        return false;
    L53:
        return true;
    L44:
        t(r12, r2);
    L14:
        r52 = true;
        goto L15
    L5:
        r12 = 0;
        r2 = 0;
        r3 = 0;
        r4 = 0;
        goto L7
    }

    public final void X(int r10, int r11, int[] r12) {
        a0();
        P();
        int r0 = n70.a;
        m70.a("RV Scroll");
        yz r02 = this.c0;
        z(r02);
        tz r1 = this.b;
        if (r10 == 0) goto L5;
        int r102 = this.l.k0(r10, r1, r02);
    L6:
        if (r11 == 0) goto L8;
        int r112 = this.l.m0(r11, r1, r02);
    L9:
        m70.b();
        r5 r03 = this.e;
        int r13 = r03.k();
        int r3 = 0;
    L10:
        if (r3 >= r13) goto L21;
        View r4 = r03.j(r3);
        b00 r5 = H(r4);
        if (r5 == null) goto L20;
        b00 r52 = r5.i;
        if (r52 == null) goto L20;
        View r53 = r52.a;
        int r6 = r4.getLeft();
        int r42 = r4.getTop();
        if (r6 == r53.getLeft()) goto L18;
    L19:
        r53.layout(r6, r42, r53.getWidth() + r6, r53.getHeight() + r42);
        goto L20
    L18:
        if (r42 != r53.getTop()) goto L19;
    L20:
        r3 = r3 + 1;
        goto L10
    L21:
        Q(true);
        b0(false);
        if (r12 == null) goto L30;
        r12[0] = r102;
        r12[1] = r112;
        return;
    L30:
        return;
    L8:
        r112 = 0;
        goto L9
    L5:
        r102 = 0;
        goto L6
    }

    public final void Y(int r3) {
        if (this.u == false) goto L5;
        return;
    L5:
        setScrollState(0);
        a00 r0 = this.W;
        r0.g.removeCallbacks(r0);
        r0.c.abortAnimation();
        nz r02 = this.l;
        if (r02 == null) goto L10;
        yq r03 = r02.e;
        if (r03 == null) goto L10;
        r03.i();
    L10:
        nz r04 = this.l;
        if (r04 != null) goto L14;
        Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        return;
    L14:
        r04.l0(r3);
        awakenScrollBars();
    }

    public final void Z(int r3, int r4, boolean r5) {
        nz r0 = this.l;
        if (r0 != null) goto L7;
        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        return;
    L7:
        if (this.u == true) goto L28;
        int r1 = 0;
        if (r0.d() == true) goto L13;
        r3 = 0;
    L13:
        if (this.l.e() == true) goto L15;
        r4 = 0;
    L15:
        if (r3 != 0) goto L19;
        if (r4 != 0) goto L19;
        return;
    L19:
        if (r5 == true) goto L21;
    L26:
        this.W.b(r3, r4, Integer.MIN_VALUE, null);
        return;
    L21:
        if (r3 == 0) goto L23;
        r1 = 1;
    L23:
        if (r4 == 0) goto L25;
        r1 = r1 | 2;
    L25:
        getScrollingChildHelper().g(r1, 1);
        goto L26
    }

    public final void a0() {
        int r0 = this.s + 1;
        this.s = r0;
        if (r0 == 1) goto L5;
        return;
    L5:
        if (this.u == true) goto L9;
        this.t = false;
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList r2, int r3, int r4) {
        nz r0 = this.l;
        if (r0 == null) goto L5;
        r0.getClass();
    L5:
        super.addFocusables(r2, r3, r4);
    }

    public final void b0(boolean r4) {
        if (this.s >= 1) goto L6;
        this.s = 1;
    L6:
        if (r4 == true) goto L11;
        if (this.u == true) goto L11;
        this.t = false;
    L11:
        if (this.s != 1) goto L25;
        if (r4 == false) goto L23;
        if (this.t == false) goto L23;
        if (this.u == true) goto L23;
        if (this.l == null) goto L23;
        if (this.k == null) goto L23;
        o();
    L23:
        if (this.u == true) goto L25;
        this.t = false;
    L25:
        this.s--;
    }

    public final void c0(int r2) {
        getScrollingChildHelper().h(r2);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof oz) == true) goto L5;
        return false;
    L5:
        if (this.l.f((oz) r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        nz r0 = this.l;
        if (r0 != null) goto L6;
        return 0;
    L6:
        if (r0.d() == true) goto L8;
        return 0;
    L8:
        return this.l.j(this.c0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        nz r0 = this.l;
        if (r0 != null) goto L6;
        return 0;
    L6:
        if (r0.d() == true) goto L8;
        return 0;
    L8:
        return this.l.k(this.c0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        nz r0 = this.l;
        if (r0 != null) goto L6;
        return 0;
    L6:
        if (r0.d() == true) goto L8;
        return 0;
    L8:
        return this.l.l(this.c0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        nz r0 = this.l;
        if (r0 != null) goto L6;
        return 0;
    L6:
        if (r0.e() == true) goto L8;
        return 0;
    L8:
        return this.l.m(this.c0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        nz r0 = this.l;
        if (r0 != null) goto L6;
        return 0;
    L6:
        if (r0.e() == true) goto L8;
        return 0;
    L8:
        return this.l.n(this.c0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        nz r0 = this.l;
        if (r0 != null) goto L6;
        return 0;
    L6:
        if (r0.e() == true) goto L8;
        return 0;
    L8:
        return this.l.o(this.c0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float r2, float r3, boolean r4) {
        return getScrollingChildHelper().a(r2, r3, r4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float r2, float r3) {
        return getScrollingChildHelper().b(r2, r3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
        return getScrollingChildHelper().c(r7, r8, r9, r10, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
        return getScrollingChildHelper().d(r9, r10, r11, r12, r13, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent r1) {
        onPopulateAccessibilityEvent(r1);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray r1) {
        dispatchThawSelfOnly(r1);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray r1) {
        dispatchFreezeSelfOnly(r1);
    }

    @Override // android.view.View
    public final void draw(Canvas r9) {
        super.draw(r9);
        ArrayList r0 = this.m;
        int r1 = r0.size();
        boolean r2 = false;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        ((kz) r0.get(r3)).b(r9, this);
        r3 = r3 + 1;
        goto L3
    L5:
        EdgeEffect r12 = this.D;
        boolean r32 = true;
        if (r12 != null) goto L8;
    L20:
        boolean r4 = false;
    L21:
        EdgeEffect r13 = this.E;
        if (r13 != null) goto L24;
    L35:
        EdgeEffect r14 = this.F;
        if (r14 != null) goto L38;
    L50:
        EdgeEffect r15 = this.G;
        if (r15 != null) goto L53;
    L64:
        if (r4 == false) goto L66;
    L72:
        r32 = r4;
    L73:
        if (r32 == false) goto L77;
        WeakHashMap r92 = ja0.a;
        s90.k(this);
        return;
    L77:
        return;
    L66:
        if (this.H == null) goto L72;
        if (r0.size() <= 0) goto L72;
        if (this.H.f() == false) goto L72;
    L53:
        if (r15.isFinished() == true) goto L64;
        int r16 = r9.save();
        r9.rotate(180.0f);
        if (this.g == false) goto L57;
        float r5 = getPaddingRight() + (-getWidth());
        int r6 = -getHeight();
        r9.translate(r5, getPaddingBottom() + r6);
    L58:
        EdgeEffect r52 = this.G;
        if (r52 != null) goto L61;
    L63:
        r4 = r4 | r2;
        r9.restoreToCount(r16);
        goto L64
    L61:
        if (r52.draw(r9) == false) goto L63;
        r2 = true;
        goto L63
    L57:
        r9.translate(-getWidth(), -getHeight());
        goto L58
    L38:
        if (r14.isFinished() == true) goto L50;
        int r17 = r9.save();
        int r53 = getWidth();
        if (this.g == false) goto L42;
        int r62 = getPaddingTop();
    L43:
        r9.rotate(90.0f);
        r9.translate(-r62, -r53);
        EdgeEffect r54 = this.F;
        if (r54 != null) goto L46;
    L48:
        boolean r55 = false;
    L49:
        r4 = r4 | r55;
        r9.restoreToCount(r17);
        goto L50
    L46:
        if (r54.draw(r9) == false) goto L48;
        r55 = true;
        goto L49
    L42:
        r62 = 0;
        goto L43
    L24:
        if (r13.isFinished() == true) goto L35;
        int r18 = r9.save();
        if (this.g == false) goto L28;
        r9.translate(getPaddingLeft(), getPaddingTop());
    L28:
        EdgeEffect r56 = this.E;
        if (r56 != null) goto L31;
    L33:
        boolean r57 = false;
    L34:
        r4 = r4 | r57;
        r9.restoreToCount(r18);
        goto L35
    L31:
        if (r56.draw(r9) == false) goto L33;
        r57 = true;
        goto L34
    L8:
        if (r12.isFinished() == true) goto L20;
        int r19 = r9.save();
        if (this.g == false) goto L12;
        int r42 = getPaddingBottom();
    L13:
        r9.rotate(270.0f);
        r9.translate((-getHeight()) + r42, 0.0f);
        EdgeEffect r43 = this.D;
        if (r43 != null) goto L16;
    L18:
        r4 = false;
    L19:
        r9.restoreToCount(r19);
        goto L21
    L16:
        if (r43.draw(r9) == false) goto L18;
        r4 = true;
        goto L19
    L12:
        r42 = 0;
        goto L13
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas r1, View r2, long r3) {
        return super.drawChild(r1, r2, r3);
    }

    public final void f(b00 r6) {
        View r0 = r6.a;
        if (r0.getParent() != this) goto L5;
        boolean r1 = true;
    L6:
        this.b.j(H(r0));
        if (r6.j() == false) goto L10;
        this.e.c(r0, -1, r0.getLayoutParams(), true);
        return;
    L10:
        if (r1 == true) goto L13;
        this.e.b(r0, -1, true);
        return;
    L13:
        r5 r62 = this.e;
        int r12 = ((ez) r62.b).a.indexOfChild(r0);
        if (r12 < 0) goto L18;
        ((fa) r62.c).h(r12);
        r62.u(r0);
        return;
    L18:
        throw new IllegalArgumentException("view is not a child, cannot hide " + r0);
    L5:
        r1 = false;
        goto L6
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View r17, int r18) {
        this.l.getClass();
        boolean r4 = true;
        if (this.k != null) goto L5;
    L11:
        boolean r3 = false;
    L12:
        FocusFinder r6 = FocusFinder.getInstance();
        yz r7 = this.c0;
        tz r8 = this.b;
        if (r3 == false) goto L49;
        if (r18 == 2) goto L17;
        if (r18 != 1) goto L49;
    L17:
        if (this.l.e() == false) goto L24;
        if (r18 != 2) goto L20;
        int r32 = 130;
    L22:
        if (r6.findNextFocus(this, r17, r32) != null) goto L24;
        boolean r33 = true;
    L25:
        if (r33 == false) goto L27;
    L43:
        if (r33 == false) goto L48;
        m();
        if (A(r17) == null) goto L54;
        a0();
        this.l.Q(r17, r18, r8, r7);
        b0(false);
    L54:
        return null;
    L48:
        View r34 = r6.findNextFocus(this, r17, r18);
    L57:
        if (r34 != null) goto L59;
    L66:
        if (r34 == null) goto L117;
        if (r34 == this) goto L117;
        if (A(r34) != null) goto L72;
        r4 = false;
    L135:
        if (r4 == false) goto L138;
        return r34;
    L138:
        return super.focusSearch(r17, r18);
    L72:
        if (r17 == null) goto L135;
        if (A(r17) == null) goto L135;
        int r62 = r17.getWidth();
        int r72 = r17.getHeight();
        Rect r82 = this.h;
        r82.set(0, 0, r62, r72);
        int r63 = r34.getWidth();
        int r73 = r34.getHeight();
        Rect r13 = this.i;
        r13.set(0, 0, r63, r73);
        offsetDescendantRectToMyCoords(r17, r82);
        offsetDescendantRectToMyCoords(r34, r13);
        if (this.l.A() != 1) goto L80;
        int r64 = -1;
    L81:
        int r15 = r82.left;
        int r5 = r13.left;
        if (r15 < r5) goto L86;
        if (r82.right <= r5) goto L86;
    L88:
        int r74 = r82.right;
        int r12 = r13.right;
        if (r74 > r12) goto L91;
        if (r15 >= r12) goto L91;
    L93:
        int r52 = 0;
    L94:
        int r75 = r82.top;
        int r122 = r13.top;
        if (r75 < r122) goto L99;
        if (r82.bottom <= r122) goto L99;
    L101:
        int r83 = r82.bottom;
        int r10 = r13.bottom;
        if (r83 > r10) goto L104;
        if (r75 >= r10) goto L104;
    L106:
        byte r76 = 0;
    L107:
        if (r18 == 1) goto L131;
        if (r18 == 2) goto L126;
        if (r18 == 17) goto L124;
        if (r18 != 33) goto L112;
        if (r76 >= 0) goto L117;
    L112:
        if (r18 != 66) goto L114;
        if (r52 <= 0) goto L117;
    L114:
        if (r18 != 130) goto L119;
        if (r76 <= 0) goto L117;
    L119:
        throw new IllegalArgumentException("Invalid direction: " + r18 + y());
    L124:
        if (r52 >= 0) goto L117;
    L126:
        if (r76 > 0) goto L135;
        if (r76 != 0) goto L117;
        if ((r52 * r64) < 0) goto L117;
    L131:
        if (r76 < 0) goto L135;
        if (r76 != 0) goto L117;
        if ((r52 * r64) > 0) goto L117;
    L104:
        if (r75 <= r122) goto L106;
        r76 = -1;
    L99:
        if (r82.bottom >= r13.bottom) goto L101;
        r76 = 1;
    L91:
        if (r15 <= r5) goto L93;
        r52 = -1;
    L86:
        if (r82.right >= r13.right) goto L88;
        r52 = 1;
        goto L94
    L80:
        r64 = 1;
    L117:
        r4 = false;
        goto L135
    L59:
        if (r34.hasFocusable() == true) goto L66;
        if (getFocusedChild() == null) goto L63;
        U(r34, null);
        return r17;
    L63:
        return super.focusSearch(r17, r18);
    L27:
        if (this.l.d() == false) goto L43;
        if (this.l.A() != 1) goto L31;
        boolean r35 = true;
    L32:
        if (r18 != 2) goto L34;
        boolean r152 = true;
    L36:
        if ((r35 ^ r152) == false) goto L38;
        int r36 = 66;
    L40:
        if (r6.findNextFocus(this, r17, r36) != null) goto L42;
        r33 = true;
        goto L43
    L42:
        r33 = false;
        goto L43
    L38:
        r36 = 17;
        goto L40
    L34:
        r152 = false;
        goto L36
    L31:
        r35 = false;
        goto L32
    L20:
        r32 = 33;
    L24:
        r33 = false;
    L49:
        View r65 = r6.findNextFocus(this, r17, r18);
        if (r65 != null) goto L56;
        if (r3 == false) goto L56;
        m();
        if (A(r17) == null) goto L54;
        a0();
        r34 = this.l.Q(r17, r18, r8, r7);
        b0(false);
    L56:
        r34 = r65;
        goto L57
    L5:
        if (this.l == null) goto L11;
        if (L() == true) goto L11;
        if (this.u == true) goto L11;
        r3 = true;
        goto L12
    }

    public final void g(kz r3) {
        nz r0 = this.l;
        if (r0 == null) goto L5;
        r0.c("Cannot add item decoration during a scroll  or layout");
    L5:
        ArrayList r02 = this.m;
        if (r02.isEmpty() == false) goto L8;
        setWillNotDraw(false);
    L8:
        r02.add(r3);
        N();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        nz r0 = this.l;
        if (r0 == null) goto L7;
        return r0.r();
    L7:
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet r3) {
        nz r0 = this.l;
        if (r0 == null) goto L7;
        return r0.s(getContext(), r3);
    L7:
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public fz getAdapter() {
        return this.k;
    }

    @Override // android.view.View
    public int getBaseline() {
        nz r0 = this.l;
        if (r0 == null) goto L7;
        r0.getClass();
        return -1;
    L7:
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int r1, int r2) {
        return super.getChildDrawingOrder(r1, r2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.g;
    }

    public d00 getCompatAccessibilityDelegate() {
        return this.j0;
    }

    public iz getEdgeEffectFactory() {
        return this.C;
    }

    public jz getItemAnimator() {
        return this.H;
    }

    public int getItemDecorationCount() {
        return this.m.size();
    }

    public nz getLayoutManager() {
        return this.l;
    }

    public int getMaxFlingVelocity() {
        return this.S;
    }

    public int getMinFlingVelocity() {
        return this.R;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public pz getOnFlingListener() {
        return this.Q;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.V;
    }

    public sz getRecycledViewPool() {
        return this.b.c();
    }

    public int getScrollState() {
        return this.I;
    }

    public final void h(qz r2) {
        if (this.e0 != null) goto L5;
        this.e0 = new ArrayList();
    L5:
        this.e0.add(r2);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(String r3) {
        if (L() == false) goto L10;
        if (r3 != null) goto L8;
        throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + y());
    L8:
        throw new IllegalStateException(r3);
    L10:
        if (this.B <= 0) goto L13;
        Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + y()));
        return;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.p;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.u;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void k() {
        int r0 = this.e.t();
        int r1 = 0;
        int r2 = 0;
    L4:
        if (r2 >= r0) goto L9;
        b00 r4 = I(this.e.s(r2));
        if (r4.o() == true) goto L8;
        r4.d = -1;
        r4.g = -1;
    L8:
        r2 = r2 + 1;
        goto L4
    L9:
        tz r02 = this.b;
        ArrayList r22 = r02.a;
        ArrayList r42 = r02.c;
        int r5 = r42.size();
        int r6 = 0;
    L10:
        if (r6 >= r5) goto L12;
        b00 r7 = (b00) r42.get(r6);
        r7.d = -1;
        r7.g = -1;
        r6 = r6 + 1;
        goto L10
    L12:
        int r43 = r22.size();
        int r52 = 0;
    L13:
        if (r52 >= r43) goto L15;
        b00 r62 = (b00) r22.get(r52);
        r62.d = -1;
        r62.g = -1;
        r52 = r52 + 1;
        goto L13
    L15:
        ArrayList r23 = r02.b;
        if (r23 == null) goto L20;
        int r24 = r23.size();
    L18:
        if (r1 >= r24) goto L27;
        b00 r44 = (b00) r02.b.get(r1);
        r44.d = -1;
        r44.g = -1;
        r1 = r1 + 1;
        goto L18
    L27:
        return;
    }

    public final void l(int r3, int r4) {
        EdgeEffect r0 = this.D;
        if (r0 != null) goto L5;
    L8:
        boolean r02 = false;
    L9:
        EdgeEffect r1 = this.F;
        if (r1 != null) goto L12;
    L15:
        EdgeEffect r32 = this.E;
        if (r32 != null) goto L18;
    L21:
        EdgeEffect r33 = this.G;
        if (r33 != null) goto L24;
    L27:
        if (r02 == false) goto L30;
        WeakHashMap r34 = ja0.a;
        s90.k(this);
        return;
    L30:
        return;
    L24:
        if (r33.isFinished() == true) goto L27;
        if (r4 >= 0) goto L27;
        this.G.onRelease();
        r02 = r02 | this.G.isFinished();
        goto L27
    L18:
        if (r32.isFinished() == true) goto L21;
        if (r4 <= 0) goto L21;
        this.E.onRelease();
        r02 = r02 | this.E.isFinished();
        goto L21
    L12:
        if (r1.isFinished() == true) goto L15;
        if (r3 >= 0) goto L15;
        this.F.onRelease();
        r02 = r02 | this.F.isFinished();
        goto L15
    L5:
        if (r0.isFinished() == true) goto L8;
        if (r3 <= 0) goto L8;
        this.D.onRelease();
        r02 = this.D.isFinished();
        goto L9
    }

    public final void m() {
        if (this.r == true) goto L5;
    L14:
        int r0 = n70.a;
        m70.a("RV FullInvalidate");
        o();
        m70.b();
        return;
    L5:
        if (this.y == true) goto L14;
        y1 r02 = this.d;
        if (r02.f() == false) goto L17;
        r02.getClass();
        if (r02.f() == false) goto L16;
        int r03 = n70.a;
        m70.a("RV FullInvalidate");
        o();
        m70.b();
        return;
    L16:
        return;
    }

    public final void n(int r3, int r4) {
        int r0 = getPaddingLeft();
        int r1 = getPaddingRight() + r0;
        WeakHashMap r02 = ja0.a;
        int r32 = nz.g(r3, r1, s90.e(this));
        int r03 = getPaddingTop();
        setMeasuredDimension(r32, nz.g(r4, getPaddingBottom() + r03, s90.d(this)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [b00] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void o() {
        if (this.k != null) goto L7;
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        return;
    L7:
        if (this.l != null) goto L10;
        Log.e("RecyclerView", "No layout manager attached; skipping layout");
        return;
    L10:
        yz r1 = this.c0;
        boolean r3 = false;
        r1.i = false;
        boolean r5 = true;
        if (r1.d != 1) goto L13;
        p();
        this.l.n0(this);
        q();
    L25:
        r1.a(4);
        a0();
        P();
        r1.d = 1;
        boolean r6 = r1.j;
        View r7 = null;
        Long r72 = null;
        tz r8 = this.b;
        d4 r9 = this.f;
        if (r6 == false) goto L123;
        int r62 = this.e.k() - 1;
    L28:
        if (r62 < 0) goto L82;
        b00 r10 = I(this.e.j(r62));
        if (r10.o() == false) goto L32;
        boolean r17 = r5;
    L81:
        r62 = r62 - 1;
        r5 = r17;
        r72 = null;
        goto L28
    L32:
        long r11 = G(r10);
        this.H.getClass();
        lw r13 = new lw();
        r13.a(r10);
        bs r14 = (bs) r9.c;
        u30 r15 = (u30) r9.b;
        b00 r142 = (b00) r14.c(r11, r72);
        if (r142 != null) goto L35;
    L80:
        r17 = r5;
        r9.a(r10, r13);
        goto L81
    L35:
        if (r142.o() == true) goto L80;
        r17 = r5;
        oa0 r52 = (oa0) r15.getOrDefault(r142, r72);
        if (r52 != null) goto L39;
    L41:
        boolean r53 = false;
    L42:
        oa0 r152 = (oa0) r15.getOrDefault(r10, r72);
        if (r152 != null) goto L45;
    L47:
        boolean r153 = false;
    L48:
        if (r53 == false) goto L51;
        if (r142 != r10) goto L51;
        r9.a(r10, r13);
    L51:
        lw r73 = r9.H(r142, 4);
        r9.a(r10, r13);
        lw r132 = r9.H(r10, 8);
        if (r73 != null) goto L70;
        int r54 = this.e.k();
        int r74 = 0;
    L54:
        if (r74 >= r54) goto L69;
        b00 r133 = I(this.e.j(r74));
        if (r133 == r10) goto L68;
        if (G(r133) != r11) goto L68;
        fz r12 = this.k;
        if (r12 == null) goto L67;
        if (r12.b == false) goto L67;
        throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + r133 + " \n View Holder 2:" + r10 + y());
    L67:
        throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + r133 + " \n View Holder 2:" + r10 + y());
    L68:
        r74 = r74 + 1;
        goto L54
    L69:
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + r142 + " cannot be found but it is necessary for " + r10 + y());
        goto L81
    L70:
        r142.n(false);
        if (r53 == false) goto L73;
        f(r142);
    L73:
        if (r142 == r10) goto L78;
        if (r153 == false) goto L76;
        f(r10);
    L76:
        r142.h = r10;
        f(r142);
        r8.j(r142);
        r10.n(false);
        r10.i = r142;
    L78:
        if (this.H.a(r142, r10, r73, r132) == false) goto L81;
        S();
        goto L81
    L45:
        if ((r152.a & 1) == 0) goto L47;
        r153 = r17;
        goto L48
    L39:
        if ((r52.a & 1) == 0) goto L41;
        r53 = r17;
        goto L42
    L82:
        boolean r172 = r5;
        u30 r2 = (u30) r9.b;
        int r4 = r2.c - 1;
    L83:
        if (r4 < 0) goto L122;
        b00 r112 = (b00) r2.h(r4);
        oa0 r55 = (oa0) r2.i(r4);
        int r63 = r55.a;
        int r75 = r63 & 3;
        ez r102 = this.r0;
        if (r75 != 3) goto L89;
        RecyclerView r64 = r102.a;
        r64.l.g0(r112.a, r64.b);
        ?? r32 = r3;
    L87:
        lw r76 = null;
    L121:
        r55.a = r32;
        r55.b = r76;
        r55.c = r76;
        oa0.d.c(r55);
        r4 = r4 - 1;
        r3 = false;
        goto L83
    L89:
        if ((r63 & 1) == 0) goto L95;
        lw r65 = r55.b;
        if (r65 != null) goto L93;
        RecyclerView r66 = r102.a;
        r66.l.g0(r112.a, r66.b);
        r32 = r3;
        goto L87
    L93:
        r102.g(r112, r65, r55.c);
        r32 = r3;
        goto L87
    L95:
        if ((r63 & 14) != 14) goto L98;
        r102.f(r112, r55.b, r55.c);
        r32 = r3;
        goto L87
    L98:
        if ((r63 & 12) != 12) goto L115;
        lw r67 = r55.b;
        lw r77 = r55.c;
        r102.getClass();
        r112.n(r3);
        RecyclerView r103 = r102.a;
        if (r103.y == true) goto L102;
        uf r122 = (uf) r103.H;
        r122.getClass();
        int r134 = r67.a;
        int r143 = r77.a;
        if (r134 == r143) goto L107;
    L110:
        RecyclerView r33 = r103;
        boolean r68 = r122.g(r112, r134, r67.b, r143, r77.b);
    L111:
        if (r68 == false) goto L113;
        r33.S();
    L113:
        r32 = 0;
        goto L87
    L107:
        if (r67.b != r77.b) goto L110;
        r122.c(r112);
        r33 = r103;
        r68 = false;
        goto L111
    L102:
        if (r103.H.a(r112, r112, r67, r77) == false) goto L113;
        r103.S();
        goto L113
    L115:
        if ((r63 & 4) == 0) goto L118;
        r76 = null;
        r102.g(r112, r55.b, null);
    L117:
        r32 = 0;
        goto L121
    L118:
        r76 = null;
        if ((r63 & 8) == 0) goto L117;
        r102.f(r112, r55.b, r55.c);
        goto L117
    L122:
        r7 = null;
    L124:
        this.l.f0(r8);
        r1.b = r1.e;
        int r34 = 0;
        this.y = false;
        this.z = false;
        r1.j = false;
        r1.k = false;
        this.l.f = false;
        ArrayList r22 = r8.b;
        if (r22 == null) goto L127;
        r22.clear();
    L127:
        nz r23 = this.l;
        if (r23.k == false) goto L130;
        r23.j = 0;
        r23.k = false;
        r8.k();
    L130:
        this.l.a0(r1);
        boolean r24 = r172;
        Q(r24);
        b0(false);
        ((u30) r9.b).clear();
        ((bs) r9.c).a();
        int[] r42 = this.k0;
        int r56 = r42[0];
        int r69 = r42[r24 ? 1 : 0];
        C(r42);
        if (r42[0] == r56) goto L133;
    L136:
        boolean r25 = true;
    L137:
        if (r25 == false) goto L140;
        t(0, 0);
    L140:
        if (this.V == true) goto L142;
    L216:
        r1.m = -1;
        r1.l = -1;
        r1.n = -1;
        return;
    L142:
        if (this.k == null) goto L216;
        if (hasFocus() == false) goto L216;
        if (getDescendantFocusability() == 393216) goto L216;
        if (getDescendantFocusability() != 131072) goto L153;
        if (isFocused() == true) goto L216;
    L153:
        if (isFocused() == false) goto L155;
    L157:
        long r82 = r1.m;
        if (r82 == (-1)) goto L176;
        boolean r26 = this.k.b;
        if (r26 == false) goto L176;
        if (r26 == false) goto L176;
        int r27 = this.e.t();
        int r104 = 0;
        ?? r113 = r7;
    L164:
        if (r104 >= r27) goto L177;
        b00 r123 = I(this.e.s(r104));
        if (r123 == null) goto L175;
        if (r123.h() == true) goto L175;
        if (r123.e != r82) goto L175;
        if (((ArrayList) this.e.d).contains(r123.a) == false) goto L174;
        r113 = r123;
        goto L175
    L174:
        r113 = r123;
    L175:
        r104 = r104 + 1;
        r113 = r113;
    L177:
        if (r113 == 0) goto L185;
        View r28 = r113.a;
        if (((ArrayList) this.e.d).contains(r28) == true) goto L185;
        if (r28.hasFocusable() == false) goto L185;
        r7 = r28;
    L207:
        if (r7 == null) goto L216;
        int r29 = r1.n;
        if (r29 == (-1)) goto L215;
        View r210 = r7.findViewById(r29);
        if (r210 == null) goto L215;
        if (r210.isFocusable() == false) goto L215;
        r7 = r210;
    L215:
        r7.requestFocus();
    L185:
        if (this.e.k() <= 0) goto L207;
        int r211 = r1.l;
        if (r211 == (-1)) goto L189;
        r34 = r211;
    L189:
        int r212 = r1.b();
        int r83 = r34;
    L190:
        if (r83 >= r212) goto L198;
        b00 r92 = E(r83);
        if (r92 == null) goto L198;
        View r93 = r92.a;
        if (r93.hasFocusable() == true) goto L196;
        r83 = r83 + 1;
        goto L190
    L196:
        r7 = r93;
    L198:
        int r213 = Math.min(r212, r34) - 1;
    L199:
        if (r213 < 0) goto L207;
        b00 r35 = E(r213);
        if (r35 == null) goto L207;
        View r36 = r35.a;
        if (r36.hasFocusable() == true) goto L205;
        r213 = r213 - 1;
        goto L199
    L205:
        r7 = r36;
    L176:
        r113 = r7;
        goto L177
    L155:
        if (((ArrayList) this.e.d).contains(getFocusedChild()) == true) goto L157;
    L133:
        if (r42[r24 ? 1 : 0] != r69) goto L136;
        r25 = false;
        goto L137
    L123:
        r172 = true;
        goto L124
    L13:
        y1 r43 = this.d;
        if (((ArrayList) r43.d).isEmpty() == true) goto L19;
        if (((ArrayList) r43.c).isEmpty() == true) goto L19;
    L24:
        this.l.n0(this);
        q();
    L19:
        if (this.l.n != getWidth()) goto L24;
        if (this.l.o != getHeight()) goto L24;
        this.l.n0(this);
        goto L25
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = 0;
        this.p = true;
        if (this.r == true) goto L5;
    L7:
        boolean r2 = false;
    L8:
        this.r = r2;
        nz r22 = this.l;
        if (r22 == null) goto L11;
        r22.g = true;
        r22.O(this);
    L11:
        this.i0 = false;
        ThreadLocal r0 = dn.e;
        dn r1 = (dn) r0.get();
        this.a0 = r1;
        if (r1 != null) goto L21;
        dn r12 = new dn();
        r12.a = new ArrayList();
        r12.d = new ArrayList();
        this.a0 = r12;
        WeakHashMap r13 = ja0.a;
        Display r14 = t90.b(this);
        if (isInEditMode() == true) goto L19;
        if (r14 == null) goto L19;
        float r15 = r14.getRefreshRate();
        if (r15 < 30.0f) goto L19;
    L20:
        dn r23 = this.a0;
        r23.c = (long) (1.0E9f / r15);
        r0.set(r23);
    L19:
        r15 = 60.0f;
    L21:
        this.a0.a.add(this);
        return;
    L5:
        if (isLayoutRequested() == true) goto L7;
        r2 = true;
        goto L8
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jz r0 = this.H;
        if (r0 == null) goto L5;
        r0.e();
    L5:
        setScrollState(0);
        a00 r1 = this.W;
        r1.g.removeCallbacks(r1);
        r1.c.abortAnimation();
        nz r12 = this.l;
        if (r12 == null) goto L10;
        yq r13 = r12.e;
        if (r13 == null) goto L10;
        r13.i();
    L10:
        this.p = false;
        nz r14 = this.l;
        if (r14 == null) goto L13;
        r14.g = false;
        r14.P(this);
    L13:
        this.p0.clear();
        removeCallbacks(this.q0);
        this.f.getClass();
    L15:
        if (oa0.d.a() != null) goto L15;
        dn r02 = this.a0;
        if (r02 == null) goto L23;
        r02.a.remove(this);
        this.a0 = null;
        return;
    }

    @Override // android.view.View
    public final void onDraw(Canvas r4) {
        super.onDraw(r4);
        ArrayList r42 = this.m;
        int r0 = r42.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((kz) r42.get(r1)).a(this);
        r1 = r1 + 1;
        goto L3
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent r6) {
        if (this.l != null) goto L6;
    L34:
        return false;
    L6:
        if (this.u == true) goto L34;
        if (r6.getAction() != 8) goto L34;
        if ((r6.getSource() & 2) == 0) goto L21;
        if (this.l.e() == false) goto L15;
        float r0 = -r6.getAxisValue(9);
    L17:
        if (this.l.d() == false) goto L19;
        float r3 = r6.getAxisValue(10);
    L30:
        if (r0 == 0.0f) goto L32;
    L33:
        W((int) (r3 * this.T), (int) (r0 * this.U), r6);
        goto L34
    L32:
        if (r3 == 0.0f) goto L34;
    L19:
        r3 = 0.0f;
        goto L30
    L15:
        r0 = 0.0f;
        goto L17
    L21:
        if ((r6.getSource() & 4194304) == 0) goto L28;
        float r02 = r6.getAxisValue(26);
        if (this.l.e() == false) goto L26;
        r0 = -r02;
        goto L19
    L26:
        if (this.l.d() == false) goto L28;
        r3 = r02;
        r0 = 0.0f;
    L28:
        r0 = 0.0f;
        r3 = 0.0f;
        goto L30
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent r9) {
        if (this.u == true) goto L61;
        this.o = null;
        if (B(r9) == false) goto L9;
        V();
        setScrollState(0);
        return true;
    L9:
        nz r0 = this.l;
        if (r0 == null) goto L61;
        boolean r02 = r0.d();
        boolean r3 = this.l.e();
        if (this.K != null) goto L15;
        this.K = VelocityTracker.obtain();
    L15:
        this.K.addMovement(r9);
        int r4 = r9.getActionMasked();
        int r5 = r9.getActionIndex();
        if (r4 == 0) goto L49;
        if (r4 == 1) goto L47;
        if (r4 != 2) goto L20;
        int r42 = r9.findPointerIndex(this.J);
        if (r42 >= 0) goto L33;
        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.J + " not found. Did any MotionEvents get skipped?");
        return false;
    L33:
        int r52 = (int) (r9.getX(r42) + 0.5f);
        int r92 = (int) (r9.getY(r42) + 0.5f);
        if (this.I == 1) goto L59;
        int r43 = r52 - this.L;
        int r6 = r92 - this.M;
        if (r02 == true) goto L38;
    L40:
        boolean r03 = false;
    L41:
        if (r3 == true) goto L43;
    L45:
        if (r03 == false) goto L59;
        setScrollState(1);
        goto L59
    L43:
        if (Math.abs(r6) <= this.P) goto L45;
        this.O = r92;
        r03 = true;
        goto L45
    L38:
        if (Math.abs(r43) <= this.P) goto L40;
        this.N = r52;
        r03 = true;
    L59:
        if (this.I != 1) goto L61;
        return true;
    L20:
        if (r4 != 3) goto L22;
        V();
        setScrollState(0);
        goto L59
    L22:
        if (r4 != 5) goto L24;
        this.J = r9.getPointerId(r5);
        int r04 = (int) (r9.getX(r5) + 0.5f);
        this.N = r04;
        this.L = r04;
        int r93 = (int) (r9.getY(r5) + 0.5f);
        this.O = r93;
        this.M = r93;
        goto L59
    L24:
        if (r4 != 6) goto L59;
        R(r9);
        goto L59
    L47:
        this.K.clear();
        c0(0);
        goto L59
    L49:
        if (this.v == false) goto L51;
        this.v = false;
    L51:
        this.J = r9.getPointerId(0);
        int r44 = (int) (r9.getX() + 0.5f);
        this.N = r44;
        this.L = r44;
        int r94 = (int) (r9.getY() + 0.5f);
        this.O = r94;
        this.M = r94;
        if (this.I != 2) goto L54;
        getParent().requestDisallowInterceptTouchEvent(true);
        setScrollState(1);
        c0(1);
    L54:
        int[] r95 = this.n0;
        r95[1] = 0;
        r95[0] = 0;
        int r05 = r02;
        if (r3 == false) goto L57;
        r05 = (r02 ? 1 : 0) | 2;
    L57:
        getScrollingChildHelper().g(r05, 0);
    L61:
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        int r12 = n70.a;
        m70.a("RV OnLayout");
        o();
        m70.b();
        this.r = true;
    }

    @Override // android.view.View
    public final void onMeasure(int r7, int r8) {
        nz r0 = this.l;
        if (r0 != null) goto L6;
        n(r7, r8);
        return;
    L6:
        boolean r02 = r0.J();
        yz r1 = this.c0;
        if (r02 == false) goto L23;
        int r03 = View.MeasureSpec.getMode(r7);
        int r2 = View.MeasureSpec.getMode(r8);
        this.l.b.n(r7, r8);
        if (r03 != 1073741824) goto L13;
        if (r2 != 1073741824) goto L13;
        return;
    L13:
        if (this.k != null) goto L16;
        return;
    L16:
        if (r1.d != 1) goto L18;
        p();
    L18:
        this.l.o0(r7, r8);
        r1.i = true;
        q();
        this.l.q0(r7, r8);
        if (this.l.t0() == false) goto L36;
        this.l.o0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        r1.i = true;
        q();
        this.l.q0(r7, r8);
        return;
    L36:
        return;
    L23:
        if (this.q == false) goto L27;
        this.l.b.n(r7, r8);
        return;
    L27:
        if (r1.k == false) goto L30;
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        return;
    L30:
        fz r04 = this.k;
        if (r04 == null) goto L33;
        r1.e = r04.a();
    L34:
        a0();
        this.l.b.n(r7, r8);
        b0(false);
        r1.g = false;
        return;
    L33:
        r1.e = 0;
        goto L34
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r2, Rect r3) {
        if (L() == false) goto L7;
        return false;
    L7:
        return super.onRequestFocusInDescendants(r2, r3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable r2) {
        if ((r2 instanceof vz) == true) goto L6;
        super.onRestoreInstanceState(r2);
        return;
    L6:
        vz r22 = (vz) r2;
        this.c = r22;
        super.onRestoreInstanceState(r22.a);
        nz r23 = this.l;
        if (r23 == null) goto L12;
        Parcelable r0 = this.c.c;
        if (r0 == null) goto L13;
        r23.b0(r0);
        return;
    L13:
        return;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        vz r0 = new vz(super.onSaveInstanceState());
        vz r1 = this.c;
        if (r1 == null) goto L6;
        r0.c = r1.c;
        return r0;
    L6:
        nz r12 = this.l;
        if (r12 == null) goto L10;
        r0.c = r12.c0();
        return r0;
    L10:
        r0.c = null;
        return r0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        if (r1 != r3) goto L7;
        if (r2 != r4) goto L7;
        return;
    L7:
        this.G = null;
        this.E = null;
        this.F = null;
        this.D = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v26 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent r31) {
        int r7 = 0;
        if (this.u == true) goto L272;
        if (this.v == true) goto L272;
        wj r1 = this.o;
        if (r1 == null) goto L10;
        int r9 = r1.b;
        if (r1.v != 0) goto L17;
    L53:
        int r12 = r31.getAction();
        if (r12 == 3) goto L56;
        if (r12 == 1) goto L56;
    L57:
        boolean r13 = true;
    L58:
        if (r13 == false) goto L61;
        V();
        setScrollState(0);
        return true;
    L61:
        nz r14 = this.l;
        if (r14 == null) goto L272;
        boolean r92 = r14.d();
        boolean r10 = this.l.e();
        if (this.K != null) goto L67;
        this.K = VelocityTracker.obtain();
    L67:
        int r15 = r31.getActionMasked();
        int r11 = r31.getActionIndex();
        int[] r122 = this.n0;
        if (r15 != 0) goto L70;
        r122[1] = 0;
        r122[0] = 0;
    L70:
        MotionEvent r132 = MotionEvent.obtain(r31);
        r132.offsetLocation(r122[0], r122[1]);
        if (r15 != 0) goto L73;
        this.J = r31.getPointerId(0);
        int r16 = (int) (r31.getX() + 0.5f);
        this.N = r16;
        this.L = r16;
        int r17 = (int) (r31.getY() + 0.5f);
        this.O = r17;
        this.M = r17;
        int r93 = r92;
        if (r10 == false) goto L268;
        r93 = (r92 ? 1 : 0) | 2;
    L268:
        getScrollingChildHelper().g(r93, 0);
    L269:
        this.K.addMovement(r132);
    L270:
        r132.recycle();
        return true;
    L73:
        if (r15 == 1) goto L131;
        if (r15 == 2) goto L84;
        if (r15 != 3) goto L77;
        V();
        setScrollState(0);
        goto L269
    L77:
        if (r15 != 5) goto L79;
        this.J = r31.getPointerId(r11);
        int r18 = (int) (r31.getX(r11) + 0.5f);
        this.N = r18;
        this.L = r18;
        int r19 = (int) (r31.getY(r11) + 0.5f);
        this.O = r19;
        this.M = r19;
        goto L269
    L79:
        if (r15 != 6) goto L269;
        R(r31);
        goto L269
    L84:
        int r110 = r31.findPointerIndex(this.J);
        if (r110 >= 0) goto L88;
        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.J + " not found. Did any MotionEvents get skipped?");
        return false;
    L88:
        int r112 = (int) (r31.getX(r110) + 0.5f);
        int r142 = (int) (r31.getY(r110) + 0.5f);
        int r111 = this.N - r112;
        int r2 = this.O - r142;
        if (this.I == 1) goto L105;
        if (r92 == false) goto L96;
        if (r111 <= 0) goto L93;
        r111 = Math.max(0, r111 - this.P);
    L94:
        if (r111 == 0) goto L96;
        boolean r3 = true;
    L97:
        if (r10 == false) goto L103;
        if (r2 <= 0) goto L100;
        r2 = Math.max(0, r2 - this.P);
    L101:
        if (r2 == 0) goto L103;
        r3 = true;
        goto L103
    L100:
        r2 = Math.min(0, r2 + this.P);
    L103:
        if (r3 == false) goto L105;
        setScrollState(1);
        goto L105
    L93:
        r111 = Math.min(0, r111 + this.P);
    L96:
        r3 = false;
    L105:
        int r152 = r111;
        int r162 = r2;
        if (this.I != 1) goto L269;
        int[] r32 = this.o0;
        r32[0] = 0;
        r32[1] = 0;
        if (r92 == false) goto L110;
        int r113 = r152;
    L111:
        if (r10 == false) goto L113;
        int r22 = r162;
    L114:
        boolean r114 = r(r113, r22, r32, this.m0, 0);
        int[] r23 = this.m0;
        if (r114 == false) goto L117;
        r152 = r152 - r32[0];
        r162 = r162 - r32[1];
        r122[0] = r122[0] + r23[0];
        r122[1] = r122[1] + r23[1];
        getParent().requestDisallowInterceptTouchEvent(true);
    L117:
        int r115 = r162;
        this.N = r112 - r23[0];
        this.O = r142 - r23[1];
        if (r92 == false) goto L120;
        int r24 = r152;
    L121:
        if (r10 == false) goto L124;
        r7 = r115;
    L124:
        if (W(r24, r7, r31) == false) goto L126;
        getParent().requestDisallowInterceptTouchEvent(true);
    L126:
        dn r25 = this.a0;
        if (r25 == null) goto L269;
        if (r152 != 0) goto L130;
        if (r115 == 0) goto L269;
    L130:
        r25.a(this, r152, r115);
        goto L269
    L120:
        r24 = 0;
        goto L121
    L113:
        r22 = 0;
        goto L114
    L110:
        r113 = 0;
        goto L111
    L131:
        this.K.addMovement(r132);
        VelocityTracker r116 = this.K;
        int r6 = this.S;
        r116.computeCurrentVelocity(1000, r6);
        if (r92 == false) goto L134;
        float r117 = -this.K.getXVelocity(this.J);
    L135:
        if (r10 == false) goto L137;
        float r33 = -this.K.getYVelocity(this.J);
    L139:
        if (r117 == 0.0f) goto L141;
    L144:
        int r118 = (int) r117;
        int r34 = (int) r33;
        nz r94 = this.l;
        if (r94 != null) goto L148;
        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
    L262:
        int r35 = 0;
    L263:
        setScrollState(r35);
    L264:
        V();
        goto L270
    L148:
        if (this.u == true) goto L262;
        int r95 = r94.d();
        boolean r102 = this.l.e();
        int r119 = this.R;
        if (r95 != 0) goto L153;
    L154:
        r118 = 0;
    L155:
        if (r102 == true) goto L157;
    L158:
        r34 = 0;
    L159:
        if (r118 != 0) goto L162;
        if (r34 == 0) goto L262;
    L162:
        float r1110 = r118;
        float r123 = r34;
        if (dispatchNestedPreFling(r1110, r123) == true) goto L262;
        if (r95 != 0) goto L168;
        if (r102 == true) goto L168;
        boolean r143 = false;
    L169:
        dispatchNestedFling(r1110, r123, r143);
        pz r1111 = this.Q;
        if (r1111 == null) goto L254;
        hx r1112 = (hx) r1111;
        nz r124 = r1112.a.getLayoutManager();
        if (r124 == 0) goto L254;
        if (r1112.a.getAdapter() == null) goto L254;
        int r153 = r1112.a.getMinFlingVelocity();
        if (Math.abs(r34) <= r153) goto L180;
    L181:
        boolean r26 = r124 instanceof xz;
        if (r26 == false) goto L254;
        if (r26 == true) goto L186;
        float r172 = 0.0f;
        gx r154 = null;
    L187:
        if (r154 == null) goto L254;
        int r5 = r124.z();
        if (r5 != 0) goto L195;
    L191:
        int r20 = 1;
    L192:
        int r27 = -1;
    L251:
        if (r27 == (-1)) goto L255;
        r154.a = r27;
        r124.w0(r154);
    L255:
        if (r143 == false) goto L262;
        if (r102 == false) goto L258;
        r95 = (r95 == true ? 1 : 0) | 2;
    L258:
        getScrollingChildHelper().g(r95, r20);
        int r28 = -r6;
        int r242 = Math.max(r28, Math.min(r118, r6));
        int r252 = Math.max(r28, Math.min(r34, r6));
        a00 r120 = this.W;
        RecyclerView r29 = r120.g;
        r29.setScrollState(2);
        r120.b = 0;
        r120.a = 0;
        Interpolator r36 = r120.d;
        dz r4 = u0;
        if (r36 == r4) goto L261;
        r120.d = r4;
        r120.c = new OverScroller(r29.getContext(), r4);
    L261:
        r120.c.fling(0, 0, r242, r252, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        r120.a();
        goto L264
    L195:
        if (r124.e() == false) goto L198;
        ai r1113 = r1112.e(r124);
    L201:
        if (r1113 == null) goto L191;
        int r42 = r124.v();
        int r72 = Integer.MIN_VALUE;
        int r210 = Integer.MAX_VALUE;
        View r163 = null;
        View r192 = null;
        r20 = 1;
        int r8 = 0;
    L204:
        if (r8 >= r42) goto L217;
        int r222 = r42;
        View r43 = r124.u(r8);
        if (r43 != null) goto L208;
        int r232 = r8;
    L215:
        r8 = r232 + 1;
        r42 = r222;
        goto L204
    L208:
        r232 = r8;
        int r82 = hx.b(r43, r1113);
        if (r82 > 0) goto L212;
        if (r82 <= r72) goto L212;
        r192 = r43;
        r72 = r82;
    L212:
        if (r82 < 0) goto L215;
        if (r82 >= r210) goto L215;
        r163 = r43;
        r210 = r82;
        goto L215
    L217:
        if (r124.d() == false) goto L221;
        if (r118 <= 0) goto L220;
    L219:
        boolean r211 = true;
    L223:
        if (r211 == false) goto L226;
        if (r163 == null) goto L226;
        r27 = nz.F(r163);
    L226:
        if (r211 == true) goto L229;
        if (r192 == null) goto L229;
        r27 = nz.F(r192);
    L229:
        if (r211 == false) goto L231;
        r163 = r192;
    L231:
        if (r163 == null) goto L192;
        int r44 = nz.F(r163);
        int r73 = r124.z();
        if (r26 == false) goto L242;
        PointF r74 = ((xz) r124).a(r73 - 1);
        if (r74 == null) goto L242;
        if (r74.x >= r172) goto L240;
    L243:
        boolean r75 = true;
    L244:
        if (r75 != r211) goto L246;
        int r212 = -1;
    L247:
        r27 = r212 + r44;
        if (r27 < 0) goto L192;
        if (r27 < r5) goto L251;
    L246:
        r212 = 1;
        goto L247
    L240:
        if (r74.y < r172) goto L243;
    L242:
        r75 = false;
    L220:
        r211 = false;
        goto L223
    L221:
        if (r34 <= 0) goto L220;
    L198:
        if (r124.d() == false) goto L200;
        r1113 = r1112.d(r124);
        goto L201
    L200:
        r1113 = null;
        goto L201
    L186:
        r172 = 0.0f;
        r154 = new gx(r1112, r1112.a.getContext());
        goto L187
    L180:
        if (Math.abs(r118) > r153) goto L181;
    L254:
        r20 = 1;
    L168:
        r143 = true;
        goto L169
    L157:
        if (Math.abs(r34) >= r119) goto L159;
    L153:
        if (Math.abs(r118) >= r119) goto L155;
    L141:
        if (r33 != 0.0f) goto L144;
        r35 = 0;
        goto L263
    L137:
        r33 = 0.0f;
        goto L139
    L134:
        r117 = 0.0f;
    L56:
        this.o = null;
        goto L57
    L17:
        if (r31.getAction() != 0) goto L27;
        boolean r96 = r1.d(r31.getX(), r31.getY());
        boolean r103 = r1.c(r31.getX(), r31.getY());
        if (r96 == true) goto L21;
        if (r103 == false) goto L53;
    L21:
        if (r103 == false) goto L23;
        r1.w = 1;
        r1.p = (int) r31.getX();
    L25:
        r1.f(2);
        goto L53
    L23:
        if (r96 == false) goto L25;
        r1.w = 2;
        r1.m = (int) r31.getY();
        goto L25
    L27:
        if (r31.getAction() != 1) goto L32;
        if (r1.v != 2) goto L32;
        r1.m = 0.0f;
        r1.p = 0.0f;
        r1.f(1);
        r1.w = 0;
    L32:
        if (r31.getAction() != 2) goto L53;
        if (r1.v != 2) goto L53;
        r1.g();
        if (r1.w != 1) goto L45;
        float r104 = r31.getX();
        int[] r144 = r1.y;
        r144[0] = r9;
        int r125 = r1.q - r9;
        r144[1] = r125;
        float r133 = Math.max(r9, Math.min(r125, r104));
        if (Math.abs(r1.o - r133) < 2.0f) goto L45;
        int r105 = wj.e(r1.p, r133, r144, r1.s.computeHorizontalScrollRange(), r1.s.computeHorizontalScrollOffset(), r1.q);
        if (r105 == 0) goto L43;
        r1.s.scrollBy(r105, 0);
    L43:
        r1.p = r133;
    L45:
        if (r1.w != 2) goto L53;
        float r106 = r31.getY();
        int[] r145 = r1.x;
        r145[0] = r9;
        int r126 = r1.r - r9;
        r145[1] = r126;
        float r134 = Math.max(r9, Math.min(r126, r106));
        if (Math.abs(r1.l - r134) < 2.0f) goto L53;
        int r97 = wj.e(r1.m, r134, r145, r1.s.computeVerticalScrollRange(), r1.s.computeVerticalScrollOffset(), r1.r);
        if (r97 == 0) goto L52;
        r1.s.scrollBy(0, r97);
    L52:
        r1.m = r134;
        goto L53
    L10:
        if (r31.getAction() != 0) goto L12;
        r13 = false;
        goto L58
    L12:
        r13 = B(r31);
    L272:
        return false;
    }

    public final void p() {
        yz r1 = this.c0;
        r1.a(1);
        z(r1);
        r1.i = false;
        a0();
        d4 r4 = this.f;
        u30 r5 = (u30) r4.b;
        u30 r6 = (u30) r4.b;
        r5.clear();
        bs r42 = (bs) r4.c;
        r42.a();
        P();
        if (this.y == false) goto L8;
        y1 r52 = this.d;
        r52.i((ArrayList) r52.c);
        r52.i((ArrayList) r52.d);
        if (this.z == false) goto L8;
        this.l.V();
    L8:
        if (this.H != null) goto L10;
    L199:
        bs r21 = r42;
        u30 r22 = r6;
        this.d.b();
    L200:
        boolean r3 = true;
        if (this.f0 == false) goto L203;
    L206:
        boolean r2 = true;
    L208:
        if (this.r == true) goto L210;
    L220:
        boolean r53 = false;
    L221:
        yz r62 = this.c0;
        r62.j = r53;
        if (r53 == false) goto L231;
        if (r2 == false) goto L231;
        if (this.y == true) goto L231;
        if (this.H == null) goto L231;
        if (this.l.x0() == false) goto L231;
    L232:
        r62.k = r3;
        if (this.V == true) goto L235;
    L239:
        View r23 = null;
    L240:
        if (r23 != null) goto L242;
    L241:
        b00 r24 = null;
    L246:
        long r43 = -1;
        if (r24 != null) goto L250;
        r1.m = -1;
        r1.l = -1;
        r1.n = -1;
    L274:
        if (r1.j == true) goto L276;
    L278:
        boolean r25 = false;
    L279:
        r1.h = r25;
        this.g0 = false;
        this.f0 = false;
        r1.g = r1.k;
        r1.e = this.k.a();
        C(this.k0);
        if (r1.j == false) goto L306;
        int r26 = this.e.k();
        int r44 = 0;
    L282:
        if (r44 >= r26) goto L306;
        b00 r54 = I(this.e.j(r44));
        if (r54.o() == false) goto L286;
    L289:
        bs r7 = r21;
        u30 r8 = r22;
    L305:
        r44 = r44 + 1;
        r21 = r7;
        r22 = r8;
        goto L282
    L286:
        if (r54.f() == true) goto L288;
    L290:
        jz r72 = this.H;
        jz.b(r54);
        r54.c();
        r72.getClass();
        lw r73 = new lw();
        r73.a(r54);
        r8 = r22;
        oa0 r9 = (oa0) r8.getOrDefault(r54, null);
        if (r9 != null) goto L293;
        r9 = oa0.a();
        r8.put(r54, r9);
    L293:
        r9.b = r73;
        r9.a |= 4;
        if (r1.h == true) goto L296;
    L304:
        r7 = r21;
        goto L305
    L296:
        if (r54.k() == false) goto L304;
        if (r54.h() == true) goto L304;
        if (r54.o() == true) goto L304;
        if (r54.f() == true) goto L304;
        r7 = r21;
        r7.d(G(r54), r54);
        goto L305
    L288:
        if (this.k.b == true) goto L290;
    L306:
        u30 r82 = r22;
        if (r1.k == false) goto L341;
        int r27 = this.e.t();
        int r55 = 0;
    L309:
        if (r55 >= r27) goto L316;
        b00 r74 = I(this.e.s(r55));
        if (r74.o() == true) goto L315;
        if (r74.d != (-1)) goto L315;
        r74.d = r74.c;
    L315:
        r55 = r55 + 1;
        goto L309
    L316:
        boolean r28 = r1.f;
        r1.f = false;
        this.l.Z(this.b, r1);
        r1.f = r28;
        int r29 = 0;
    L318:
        if (r29 >= this.e.k()) goto L339;
        b00 r56 = I(this.e.j(r29));
        if (r56.o() == true) goto L338;
        oa0 r63 = (oa0) r82.getOrDefault(r56, null);
        if (r63 != null) goto L325;
    L327:
        jz.b(r56);
        if ((r56.j & 8192) == 0) goto L330;
        boolean r64 = true;
    L331:
        jz r75 = this.H;
        r56.c();
        r75.getClass();
        lw r76 = new lw();
        r76.a(r56);
        if (r64 == false) goto L334;
        T(r56, r76);
        goto L338
    L334:
        oa0 r65 = (oa0) r82.getOrDefault(r56, null);
        if (r65 != null) goto L337;
        r65 = oa0.a();
        r82.put(r56, r65);
    L337:
        r65.a |= 2;
        r65.b = r76;
        goto L338
    L330:
        r64 = false;
        goto L331
    L325:
        if ((r63.a & 4) == 0) goto L327;
    L338:
        r29 = r29 + 1;
        goto L318
    L339:
        k();
    L342:
        Q(true);
        b0(false);
        r1.d = 2;
        return;
    L341:
        k();
        goto L342
    L276:
        if (this.g0 == false) goto L278;
        r25 = true;
        goto L279
    L250:
        if (this.k.b == false) goto L252;
        r43 = r24.e;
    L252:
        r1.m = r43;
        if (this.y == false) goto L256;
    L254:
        int r45 = -1;
    L262:
        r1.l = r45;
        View r210 = r24.a;
        int r46 = r210.getId();
    L264:
        if (r210.isFocused() == true) goto L272;
        if ((r210 instanceof ViewGroup) == false) goto L272;
        if (r210.hasFocus() == false) goto L272;
        r210 = ((ViewGroup) r210).getFocusedChild();
        if (r210.getId() == (-1)) goto L264;
        r46 = r210.getId();
    L272:
        r1.n = r46;
        goto L274
    L256:
        if (r24.h() == false) goto L258;
        r45 = r24.d;
        goto L262
    L258:
        RecyclerView r47 = r24.r;
        if (r47 == null) goto L254;
        r45 = r47.F(r24);
        goto L262
    L242:
        View r211 = A(r23);
        if (r211 == null) goto L241;
        r24 = H(r211);
        goto L246
    L235:
        if (hasFocus() == false) goto L239;
        if (this.k == null) goto L239;
        r23 = getFocusedChild();
    L231:
        r3 = false;
        goto L232
    L210:
        if (this.H == null) goto L220;
        boolean r57 = this.y;
        if (r57 == true) goto L216;
        if (r2 == true) goto L216;
        if (this.l.f == false) goto L220;
    L216:
        if (r57 == true) goto L218;
    L219:
        r53 = true;
        goto L221
    L218:
        if (this.k.b == false) goto L220;
    L203:
        if (this.g0 == true) goto L206;
        r2 = false;
        goto L208
    L10:
        if (this.l.x0() == false) goto L199;
        y1 r58 = this.d;
        sx r77 = (sx) r58.b;
        ez r83 = (ez) r58.e;
        l0 r92 = (l0) r58.f;
        ArrayList r10 = (ArrayList) r58.c;
        r92.getClass();
    L12:
        int r11 = r10.size() - 1;
        boolean r14 = false;
    L14:
        if (r11 < 0) goto L21;
        if (((x1) r10.get(r11)).a != 8) goto L19;
        if (r14 == false) goto L20;
    L22:
        if (r11 == (-1)) goto L133;
        int r15 = r11 + 1;
        y1 r13 = (y1) r92.b;
        sx r32 = (sx) r13.b;
        x1 r142 = (x1) r10.get(r11);
        x1 r212 = (x1) r10.get(r15);
        l0 r18 = r92;
        int r93 = r212.a;
        if (r93 == 1) goto L119;
        x1 r17 = null;
        if (r93 != 2) goto L28;
        bs r213 = r42;
        u30 r222 = r6;
        int r48 = r142.b;
        int r66 = r142.c;
        if (r48 >= r66) goto L64;
        if (r212.b == r48) goto L58;
    L61:
        boolean r49 = false;
    L62:
        boolean r16 = false;
    L69:
        int r94 = r212.b;
        if (r66 >= r94) goto L72;
        r212.b = r94 - 1;
    L77:
        int r67 = r142.b;
        int r95 = r212.b;
        if (r67 > r95) goto L80;
        r212.b = r95 + 1;
    L83:
        x1 r68 = r17;
        if (r16 == false) goto L86;
        r10.set(r11, r212);
        r10.remove(r15);
        r32.c(r142);
    L132:
        r92 = r18;
        r42 = r213;
        r6 = r222;
        goto L12
    L86:
        if (r49 == false) goto L100;
        if (r68 == null) goto L94;
        int r33 = r142.b;
        if (r33 <= r68.b) goto L91;
        r142.b = r33 - r68.c;
    L91:
        int r34 = r142.c;
        if (r34 <= r68.b) goto L94;
        r142.c = r34 - r68.c;
    L94:
        int r35 = r142.b;
        if (r35 <= r212.b) goto L97;
        r142.b = r35 - r212.c;
    L97:
        int r36 = r142.c;
        if (r36 <= r212.b) goto L113;
        r142.c = r36 - r212.c;
    L113:
        r10.set(r11, r212);
        if (r142.b == r142.c) goto L116;
        r10.set(r15, r142);
    L117:
        if (r68 == null) goto L132;
        r10.add(r11, r68);
        goto L132
    L116:
        r10.remove(r15);
        goto L117
    L100:
        if (r68 == null) goto L107;
        int r37 = r142.b;
        if (r37 < r68.b) goto L104;
        r142.b = r37 - r68.c;
    L104:
        int r38 = r142.c;
        if (r38 < r68.b) goto L107;
        r142.c = r38 - r68.c;
    L107:
        int r39 = r142.b;
        if (r39 < r212.b) goto L110;
        r142.b = r39 - r212.c;
    L110:
        int r310 = r142.c;
        if (r310 < r212.b) goto L113;
        r142.c = r310 - r212.c;
        goto L113
    L80:
        int r96 = r95 + r212.c;
        if (r67 >= r96) goto L83;
        r17 = r13.g(2, r67 + 1, r96 - r67);
        r212.c = r142.b - r212.b;
        goto L83
    L72:
        int r12 = r212.c;
        if (r66 >= (r94 + r12)) goto L77;
        r212.c = r12 - 1;
        r142.a = 2;
        r142.c = 1;
        if (r212.c != 0) goto L132;
        r10.remove(r15);
        r32.c(r212);
        goto L132
    L58:
        if (r212.c != (r66 - r48)) goto L61;
        r49 = false;
    L60:
        r16 = true;
        goto L69
    L64:
        if (r212.b == (r66 + 1)) goto L66;
    L68:
        r49 = true;
        goto L62
    L66:
        if (r212.c != (r48 - r66)) goto L68;
        r49 = true;
        goto L60
    L28:
        if (r93 == 4) goto L30;
        r213 = r42;
        r222 = r6;
        goto L132
    L30:
        int r97 = r142.c;
        int r122 = r212.b;
        if (r97 >= r122) goto L34;
        r212.b = r122 - 1;
    L33:
        r213 = r42;
        x1 r410 = null;
    L38:
        int r98 = r142.b;
        int r123 = r212.b;
        if (r98 > r123) goto L42;
        r212.b = r123 + 1;
    L41:
        r222 = r6;
    L45:
        x1 r69 = r17;
        r10.set(r15, r142);
        if (r212.c <= 0) goto L48;
        r10.set(r11, r212);
    L49:
        if (r410 == null) goto L51;
        r10.add(r11, r410);
    L51:
        if (r69 == null) goto L132;
        r10.add(r11, r69);
        goto L132
    L48:
        r10.remove(r11);
        r32.c(r212);
        goto L49
    L42:
        int r124 = r123 + r212.c;
        if (r98 >= r124) goto L41;
        int r125 = r124 - r98;
        r222 = r6;
        r17 = r13.g(4, r98 + 1, r125);
        r212.c -= r125;
        goto L45
    L34:
        int r126 = r212.c;
        if (r97 >= (r122 + r126)) goto L33;
        r212.c = r126 - 1;
        r213 = r42;
        r410 = r13.g(4, r142.b, 1);
        goto L38
    L119:
        r213 = r42;
        r222 = r6;
        int r311 = r142.c;
        int r411 = r212.b;
        if (r311 >= r411) goto L122;
        int r132 = -1;
    L123:
        int r610 = r142.b;
        if (r610 >= r411) goto L126;
        r132 = r132 + 1;
    L126:
        if (r411 > r610) goto L128;
        r142.b = r610 + r212.c;
    L128:
        int r412 = r212.b;
        if (r412 > r311) goto L131;
        r142.c = r311 + r212.c;
    L131:
        r212.b = r412 + r132;
        r10.set(r11, r212);
        r10.set(r15, r142);
        goto L132
    L122:
        r132 = 0;
        goto L123
    L133:
        r21 = r42;
        r22 = r6;
        int r214 = r10.size();
        int r312 = 0;
    L134:
        if (r312 >= r214) goto L198;
        x1 r413 = (x1) r10.get(r312);
        int r611 = r413.a;
        if (r611 != 1) goto L138;
        r58.h(r413);
    L197:
        r312 = r312 + 1;
        goto L134
    L138:
        if (r611 != 2) goto L140;
        int r99 = r413.b;
        int r112 = r413.c + r99;
        int r127 = r99;
        int r133 = 0;
        byte r143 = -1;
    L169:
        if (r127 >= r112) goto L190;
        if (r83.b(r127) != null) goto L180;
        if (r58.a(r127) == true) goto L180;
        if (r143 != 1) goto L178;
        r58.h(r58.g(2, r99, r133));
        boolean r144 = true;
    L179:
        byte r612 = 0;
    L184:
        if (r144 == false) goto L187;
        r127 = r127 - r133;
        r112 = r112 - r133;
        r133 = 1;
    L188:
        r127 = r127 + 1;
        r143 = r612;
        goto L169
    L187:
        r133 = r133 + 1;
        goto L188
    L178:
        r144 = false;
    L180:
        if (r143 != 0) goto L182;
        r58.c(r58.g(2, r99, r133));
        boolean r613 = true;
    L183:
        r144 = r613;
        r612 = 1;
        goto L184
    L182:
        r613 = false;
        goto L183
    L190:
        if (r133 == r413.c) goto L193;
        r77.c(r413);
        r413 = r58.g(2, r99, r133);
    L193:
        if (r143 != 0) goto L195;
        r58.c(r413);
        goto L197
    L195:
        r58.h(r413);
        goto L197
    L140:
        if (r611 == 4) goto L144;
        if (r611 != 8) goto L197;
        r58.h(r413);
        goto L197
    L144:
        int r614 = r413.b;
        int r910 = r413.c + r614;
        int r113 = r614;
        int r128 = 0;
        byte r134 = -1;
    L145:
        if (r614 >= r910) goto L162;
        if (r83.b(r614) != null) goto L157;
        if (r58.a(r614) == true) goto L157;
        if (r134 != 1) goto L155;
        r58.h(r58.g(4, r113, r128));
        r113 = r614;
        r128 = 0;
    L155:
        r134 = 0;
    L160:
        r128 = r128 + 1;
        r614 = r614 + 1;
    L157:
        if (r134 != 0) goto L159;
        r58.c(r58.g(4, r113, r128));
        r113 = r614;
        r128 = 0;
    L159:
        r134 = 1;
        goto L160
    L162:
        if (r128 == r413.c) goto L165;
        r77.c(r413);
        r413 = r58.g(4, r113, r128);
    L165:
        if (r134 != 0) goto L167;
        r58.c(r413);
        goto L197
    L167:
        r58.h(r413);
        goto L197
    L198:
        r10.clear();
    L20:
        r11 = r11 - 1;
        goto L14
    L19:
        r14 = true;
        goto L20
    L21:
        r11 = -1;
        goto L22
    }

    public final void q() {
        a0();
        P();
        yz r1 = this.c0;
        r1.a(6);
        this.d.b();
        r1.e = this.k.a();
        r1.c = 0;
        r1.g = false;
        this.l.Z(this.b, r1);
        r1.f = false;
        this.c = null;
        if (r1.j == true) goto L5;
    L7:
        boolean r2 = false;
    L8:
        r1.j = r2;
        r1.d = 4;
        Q(true);
        b0(false);
        return;
    L5:
        if (this.H == null) goto L7;
        r2 = true;
        goto L8
    }

    public final boolean r(int r7, int r8, int[] r9, int[] r10, int r11) {
        return getScrollingChildHelper().c(r7, r8, r9, r10, r11);
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View r3, boolean r4) {
        b00 r0 = I(r3);
        if (r0 != null) goto L5;
    L12:
        r3.clearAnimation();
        I(r3);
        super.removeDetachedView(r3, r4);
        return;
    L5:
        if (r0.j() == false) goto L8;
        r0.j &= -257;
        goto L12
    L8:
        if (r0.o() == true) goto L12;
        throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + r0 + y());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View r2, View r3) {
        yq r0 = this.l.e;
        if (r0 == null) goto L8;
        if (r0.e == false) goto L8;
    L12:
        super.requestChildFocus(r2, r3);
        return;
    L8:
        if (L() == true) goto L12;
        if (r3 == null) goto L12;
        U(r2, r3);
        goto L12
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View r7, Rect r8, boolean r9) {
        return this.l.i0(this, r7, r8, r9, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean r5) {
        ArrayList r0 = this.n;
        int r1 = r0.size();
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L5;
        ((wj) r0.get(r2)).getClass();
        r2 = r2 + 1;
        goto L3
    L5:
        super.requestDisallowInterceptTouchEvent(r5);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s == 0) goto L5;
    L8:
        this.t = true;
        return;
    L5:
        if (this.u == true) goto L8;
        super.requestLayout();
    }

    public final void s(int r9, int r10, int r11, int r12, int[] r13, int r14, int[] r15) {
        getScrollingChildHelper().d(r9, r10, r11, r12, r13, r14, r15);
    }

    @Override // android.view.View
    public final void scrollBy(int r4, int r5) {
        nz r0 = this.l;
        if (r0 != null) goto L7;
        Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        return;
    L7:
        if (this.u == true) goto L23;
        boolean r02 = r0.d();
        boolean r1 = this.l.e();
        if (r02 == true) goto L15;
        if (r1 == true) goto L15;
        return;
    L15:
        if (r02 == true) goto L18;
        r4 = 0;
    L18:
        if (r1 == true) goto L21;
        r5 = 0;
    L21:
        W(r4, r5, null);
        return;
    }

    @Override // android.view.View
    public final void scrollTo(int r1, int r2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent r2) {
        if (L() == false) goto L13;
        int r0 = 0;
        if (r2 == null) goto L7;
        int r22 = y.a(r2);
    L8:
        if (r22 == 0) goto L11;
        r0 = r22;
    L11:
        this.w |= r0;
        return;
    L7:
        r22 = 0;
        goto L8
    L13:
        super.sendAccessibilityEventUnchecked(r2);
    }

    public void setAccessibilityDelegateCompat(d00 r1) {
        this.j0 = r1;
        ja0.l(this, r1);
    }

    public void setAdapter(fz r7) {
        setLayoutFrozen(false);
        fz r1 = this.k;
        iy r2 = this.a;
        if (r1 == null) goto L5;
        r1.a.unregisterObserver(r2);
        this.k.getClass();
    L5:
        jz r12 = this.H;
        if (r12 == null) goto L8;
        r12.e();
    L8:
        nz r13 = this.l;
        tz r3 = this.b;
        if (r13 == null) goto L11;
        r13.e0(r3);
        this.l.f0(r3);
    L11:
        r3.a.clear();
        r3.d();
        y1 r14 = this.d;
        r14.i((ArrayList) r14.c);
        r14.i((ArrayList) r14.d);
        fz r15 = this.k;
        this.k = r7;
        if (r7 == null) goto L14;
        r7.a.registerObserver(r2);
    L14:
        fz r72 = this.k;
        r3.a.clear();
        r3.d();
        sz r22 = r3.c();
        if (r15 == null) goto L18;
        r22.b--;
    L18:
        if (r22.b != 0) goto L23;
        SparseArray r16 = r22.a;
        int r4 = 0;
    L21:
        if (r4 >= r16.size()) goto L23;
        ((rz) r16.valueAt(r4)).a.clear();
        r4 = r4 + 1;
    L23:
        if (r72 == null) goto L25;
        r22.b++;
    L25:
        this.c0.f = true;
        this.z |= false;
        this.y = true;
        int r73 = this.e.t();
        int r0 = 0;
        int r17 = 0;
    L27:
        if (r17 >= r73) goto L34;
        b00 r32 = I(this.e.s(r17));
        if (r32 == null) goto L33;
        if (r32.o() == true) goto L33;
        r32.a(6);
    L33:
        r17 = r17 + 1;
        goto L27
    L34:
        N();
        tz r74 = this.b;
        ArrayList r18 = r74.c;
        int r33 = r18.size();
    L35:
        if (r0 >= r33) goto L40;
        b00 r42 = (b00) r18.get(r0);
        if (r42 == null) goto L39;
        r42.a(6);
        r42.a(1024);
    L39:
        r0 = r0 + 1;
        goto L35
    L40:
        fz r02 = r74.h.k;
        if (r02 != null) goto L43;
    L44:
        r74.d();
    L45:
        requestLayout();
        return;
    L43:
        if (r02.b == true) goto L45;
        goto L44
    }

    public void setChildDrawingOrderCallback(hz r1) {
        if (r1 != null) goto L4;
        return;
    L4:
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean r2) {
        if (r2 == this.g) goto L5;
        this.G = null;
        this.E = null;
        this.F = null;
        this.D = null;
    L5:
        this.g = r2;
        super.setClipToPadding(r2);
        if (this.r == false) goto L9;
        requestLayout();
        return;
    }

    public void setEdgeEffectFactory(iz r1) {
        r1.getClass();
        this.C = r1;
        this.G = null;
        this.E = null;
        this.F = null;
        this.D = null;
    }

    public void setHasFixedSize(boolean r1) {
        this.q = r1;
    }

    public void setItemAnimator(jz r3) {
        jz r0 = this.H;
        if (r0 == null) goto L5;
        r0.e();
        this.H.a = null;
    L5:
        this.H = r3;
        if (r3 == null) goto L9;
        r3.a = this.h0;
        return;
    }

    public void setItemViewCacheSize(int r2) {
        tz r0 = this.b;
        r0.e = r2;
        r0.k();
    }

    @Deprecated
    public void setLayoutFrozen(boolean r1) {
        suppressLayout(r1);
    }

    public void setLayoutManager(nz r11) {
        if (r11 != this.l) goto L5;
        return;
    L5:
        int r0 = 0;
        setScrollState(0);
        a00 r1 = this.W;
        r1.g.removeCallbacks(r1);
        r1.c.abortAnimation();
        nz r12 = this.l;
        if (r12 == null) goto L10;
        yq r13 = r12.e;
        if (r13 == null) goto L10;
        r13.i();
    L10:
        nz r14 = this.l;
        tz r2 = this.b;
        if (r14 == null) goto L19;
        jz r15 = this.H;
        if (r15 == null) goto L15;
        r15.e();
    L15:
        this.l.e0(r2);
        this.l.f0(r2);
        r2.a.clear();
        r2.d();
        if (this.p == false) goto L18;
        nz r16 = this.l;
        r16.g = false;
        r16.P(this);
    L18:
        this.l.r0(null);
        this.l = null;
    L20:
        r5 r17 = this.e;
        RecyclerView r3 = ((ez) r17.b).a;
        ((fa) r17.c).g();
        ArrayList r18 = (ArrayList) r17.d;
        int r4 = r18.size() - 1;
    L21:
        if (r4 < 0) goto L30;
        b00 r6 = I((View) r18.get(r4));
        if (r6 == null) goto L29;
        int r7 = r6.p;
        if (r3.L() == false) goto L27;
        r6.q = r7;
        r3.p0.add(r6);
    L28:
        r6.p = 0;
        goto L29
    L27:
        View r8 = r6.a;
        WeakHashMap r9 = ja0.a;
        s90.s(r8, r7);
    L29:
        r18.remove(r4);
        r4 = r4 - 1;
        goto L21
    L30:
        int r19 = r3.getChildCount();
    L31:
        if (r0 >= r19) goto L33;
        View r42 = r3.getChildAt(r0);
        I(r42);
        r42.clearAnimation();
        r0 = r0 + 1;
        goto L31
    L33:
        r3.removeAllViews();
        this.l = r11;
        if (r11 != null) goto L36;
    L42:
        r2.k();
        requestLayout();
        return;
    L36:
        if (r11.b != null) goto L41;
        r11.r0(this);
        if (this.p == false) goto L42;
        nz r112 = this.l;
        r112.g = true;
        r112.O(this);
        goto L42
    L41:
        throw new IllegalArgumentException("LayoutManager " + r11 + " is already attached to a RecyclerView:" + r11.b.y());
    L19:
        r2.a.clear();
        r2.d();
        goto L20
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition r2) {
        if (r2 != null) goto L6;
        super.setLayoutTransition(null);
        return;
    L6:
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean r4) {
        iw r0 = getScrollingChildHelper();
        if (r0.d == false) goto L5;
        ViewGroup r1 = r0.c;
        WeakHashMap r2 = ja0.a;
        y90.z(r1);
    L5:
        r0.d = r4;
    }

    public void setOnFlingListener(pz r1) {
        this.Q = r1;
    }

    @Deprecated
    public void setOnScrollListener(qz r1) {
        this.d0 = r1;
    }

    public void setPreserveFocusAfterLayout(boolean r1) {
        this.V = r1;
    }

    public void setRecycledViewPool(sz r4) {
        tz r0 = this.b;
        if (r0.g == null) goto L5;
        r1.b--;
    L5:
        r0.g = r4;
        if (r4 != null) goto L8;
        return;
    L8:
        if (r0.h.getAdapter() == null) goto L12;
        r0.g.b++;
        return;
    }

    public void setScrollState(int r3) {
        if (r3 == this.I) goto L25;
        this.I = r3;
        if (r3 == 2) goto L12;
        a00 r0 = this.W;
        r0.g.removeCallbacks(r0);
        r0.c.abortAnimation();
        nz r02 = this.l;
        if (r02 == null) goto L12;
        yq r03 = r02.e;
        if (r03 == null) goto L12;
        r03.i();
    L12:
        nz r04 = this.l;
        if (r04 == null) goto L15;
        r04.d0(r3);
    L15:
        qz r05 = this.d0;
        if (r05 == null) goto L18;
        r05.a(this, r3);
    L18:
        ArrayList r06 = this.e0;
        if (r06 == null) goto L23;
        int r07 = r06.size() - 1;
    L21:
        if (r07 < 0) goto L26;
        ((qz) this.e0.get(r07)).a(this, r3);
        r07 = r07 - 1;
        goto L21
    L26:
        return;
    L23:
        return;
    }

    public void setScrollingTouchSlop(int r4) {
        ViewConfiguration r0 = ViewConfiguration.get(getContext());
        if (r4 != 0) goto L5;
    L9:
        this.P = r0.getScaledTouchSlop();
        return;
    L5:
        if (r4 == 1) goto L7;
        Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + r4 + "; using default value");
        goto L9
    L7:
        this.P = r0.getScaledPagingTouchSlop();
    }

    public void setViewCacheExtension(zz r1) {
        this.b.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r3) {
        return getScrollingChildHelper().g(r3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean r10) {
        if (r10 == this.u) goto L21;
        i("Do not suppressLayout in layout or scroll");
        if (r10 == true) goto L15;
        this.u = false;
        if (this.t == true) goto L9;
    L13:
        this.t = false;
        return;
    L9:
        if (this.l == null) goto L13;
        if (this.k == null) goto L13;
        requestLayout();
        goto L13
    L15:
        long r1 = SystemClock.uptimeMillis();
        onTouchEvent(MotionEvent.obtain(r1, r1, 3, 0.0f, 0.0f, 0));
        this.u = true;
        this.v = true;
        setScrollState(0);
        a00 r102 = this.W;
        r102.g.removeCallbacks(r102);
        r102.c.abortAnimation();
        nz r103 = this.l;
        if (r103 == null) goto L22;
        yq r104 = r103.e;
        if (r104 == null) goto L23;
        r104.i();
        return;
    L23:
        return;
    L22:
        return;
    }

    public final void t(int r5, int r6) {
        this.B++;
        int r0 = getScrollX();
        int r1 = getScrollY();
        onScrollChanged(r0, r1, r0 - r5, r1 - r6);
        qz r02 = this.d0;
        if (r02 == null) goto L5;
        r02.b(this, r5, r6);
    L5:
        ArrayList r03 = this.e0;
        if (r03 == null) goto L10;
        int r04 = r03.size() - 1;
    L8:
        if (r04 < 0) goto L10;
        ((qz) this.e0.get(r04)).b(this, r5, r6);
        r04 = r04 - 1;
    L10:
        this.B--;
    }

    public final void u() {
        if (this.G == null) goto L5;
        return;
    L5:
        this.C.getClass();
        EdgeEffect r0 = new EdgeEffect(getContext());
        this.G = r0;
        if (this.g == false) goto L9;
        r0.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        return;
    L9:
        r0.setSize(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void v() {
        if (this.D == null) goto L5;
        return;
    L5:
        this.C.getClass();
        EdgeEffect r0 = new EdgeEffect(getContext());
        this.D = r0;
        if (this.g == false) goto L9;
        r0.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        return;
    L9:
        r0.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    public final void w() {
        if (this.F == null) goto L5;
        return;
    L5:
        this.C.getClass();
        EdgeEffect r0 = new EdgeEffect(getContext());
        this.F = r0;
        if (this.g == false) goto L9;
        r0.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        return;
    L9:
        r0.setSize(getMeasuredHeight(), getMeasuredWidth());
    }

    public final void x() {
        if (this.E == null) goto L5;
        return;
    L5:
        this.C.getClass();
        EdgeEffect r0 = new EdgeEffect(getContext());
        this.E = r0;
        if (this.g == false) goto L9;
        r0.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        return;
    L9:
        r0.setSize(getMeasuredWidth(), getMeasuredHeight());
    }

    public final String y() {
        return " " + super.toString() + ", adapter:" + this.k + ", layout:" + this.l + ", context:" + getContext();
    }

    public final void z(yz r3) {
        if (getScrollState() != 2) goto L6;
        OverScroller r0 = this.W.c;
        r0.getFinalX();
        r0.getCurrX();
        r3.getClass();
        r0.getFinalY();
        r0.getCurrY();
        return;
    L6:
        r3.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecyclerView(Context r21, AttributeSet r22, int r23) {
        super(r21, r22, r23);
        this.a = new iy(this);
        this.b = new tz(this);
        this.f = new d4(19);
        this.h = new Rect();
        this.i = new Rect();
        this.j = new RectF();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.s = 0;
        this.y = false;
        this.z = false;
        this.A = 0;
        this.B = 0;
        this.C = new iz();
        uf r0 = new uf();
        Object[] r10 = null;
        r0.a = null;
        r0.b = new ArrayList();
        r0.c = 120;
        r0.d = 120;
        r0.e = 250;
        r0.f = 250;
        r0.g = true;
        r0.h = new ArrayList();
        r0.i = new ArrayList();
        r0.j = new ArrayList();
        r0.k = new ArrayList();
        r0.l = new ArrayList();
        r0.m = new ArrayList();
        r0.n = new ArrayList();
        r0.o = new ArrayList();
        r0.p = new ArrayList();
        r0.q = new ArrayList();
        r0.r = new ArrayList();
        this.H = r0;
        this.I = 0;
        this.J = -1;
        this.T = Float.MIN_VALUE;
        this.U = Float.MIN_VALUE;
        this.V = true;
        this.W = new a00(this);
        this.b0 = new bn();
        yz r3 = new yz();
        r3.a = -1;
        r3.b = 0;
        r3.c = 0;
        r3.d = 1;
        r3.e = 0;
        r3.f = false;
        r3.g = false;
        r3.h = false;
        r3.i = false;
        r3.j = false;
        r3.k = false;
        this.c0 = r3;
        this.f0 = false;
        this.g0 = false;
        ez r32 = new ez(this);
        this.h0 = r32;
        this.i0 = false;
        this.k0 = new int[2];
        this.m0 = new int[2];
        this.n0 = new int[2];
        this.o0 = new int[2];
        this.p0 = new ArrayList();
        this.q0 = new y6(8, this);
        this.r0 = new ez(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration r5 = ViewConfiguration.get(r21);
        this.P = r5.getScaledTouchSlop();
        this.T = ka0.a(r5);
        this.U = ka0.b(r5);
        this.R = r5.getScaledMinimumFlingVelocity();
        this.S = r5.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() != 2) goto L5;
        boolean r52 = true;
    L6:
        setWillNotDraw(r52);
        this.H.a = r32;
        this.d = new y1(new ez(this));
        this.e = new r5(new ez(this));
        WeakHashMap r33 = ja0.a;
        if (aa0.b(this) != 0) goto L10;
        aa0.l(this, 8);
    L10:
        if (s90.c(this) != 0) goto L12;
        s90.s(this, 1);
    L12:
        this.x = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new d00(this));
        int[] r34 = vy.a;
        TypedArray r53 = r21.obtainStyledAttributes(r22, r34, r23, 0);
        if (Build.VERSION.SDK_INT < 29) goto L15;
        f0.r(this, r21, r34, r22, r53, r23);
    L15:
        String r16 = r53.getString(8);
        if (r53.getInt(2, -1) != (-1)) goto L18;
        setDescendantFocusability(262144);
    L18:
        this.g = r53.getBoolean(1, true);
        if (r53.getBoolean(3, false) == false) goto L28;
        StateListDrawable r35 = (StateListDrawable) r53.getDrawable(6);
        Drawable r54 = r53.getDrawable(7);
        StateListDrawable r6 = (StateListDrawable) r53.getDrawable(4);
        Drawable r7 = r53.getDrawable(5);
        if (r35 == null) goto L27;
        if (r54 == null) goto L27;
        if (r6 == null) goto L27;
        if (r7 == null) goto L27;
        Resources r8 = getContext().getResources();
        char r19 = 2;
        TypedArray r13 = r53;
        char r18 = 3;
        int r12 = r23;
        char r17 = 1;
        int r11 = 4;
        new wj(this, r35, r54, r6, r7, r8.getDimensionPixelSize(com.ljx.wechatmod.R.dimen.fastscroll_default_thickness), r8.getDimensionPixelSize(com.ljx.wechatmod.R.dimen.fastscroll_minimum_range), r8.getDimensionPixelOffset(com.ljx.wechatmod.R.dimen.fastscroll_margin));
    L29:
        r13.recycle();
        if (r16 == null) goto L77;
        String r02 = r16.trim();
        if (r02.isEmpty() == true) goto L77;
        if (r02.charAt(0) != '.') goto L38;
        r02 = r21.getPackageName() + r02;
    L36:
        String r36 = r02;
    L44:
        e = move-exception;
        throw new IllegalStateException(r22.getPositionDescription() + ": Class is not a LayoutManager " + r36, e);
    L52:
        e = move-exception;
        throw new IllegalStateException(r22.getPositionDescription() + ": Unable to find LayoutManager " + r36, e);
    L46:
        e = move-exception;
        throw new IllegalStateException(r22.getPositionDescription() + ": Cannot access non-public constructor " + r36, e);
    L48:
        e = move-exception;
        throw new IllegalStateException(r22.getPositionDescription() + ": Could not instantiate the LayoutManager: " + r36, e);
    L50:
        e = move-exception;
        throw new IllegalStateException(r22.getPositionDescription() + ": Could not instantiate the LayoutManager: " + r36, e);
    L42:
        if (isInEditMode() == false) goto L54;
        ClassLoader r03 = getClass().getClassLoader();     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52
    L55:
        Class<? extends U> r4 = Class.forName(r36, false, r03).asSubclass(nz.class);     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52
        Constructor r04 = r4.getConstructor(t0);     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52 NoSuchMethodException -> L59
        Object[] r55 = new Object[r11];     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52 NoSuchMethodException -> L59
        r55[0] = r21;     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52 NoSuchMethodException -> L59
        r55[r17] = r22;     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52 NoSuchMethodException -> L59
        r55[r19] = Integer.valueOf(r12);     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52 NoSuchMethodException -> L59
        r55[r18] = 0;     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52 NoSuchMethodException -> L59
        r10 = r55;
        Constructor r05 = r04;
    L63:
        r05.setAccessible(r17);     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52
        setLayoutManager((nz) r05.newInstance(r10));     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52
    L59:
        e = move-exception;
        r05 = r4.getConstructor(null);     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52 NoSuchMethodException -> L64
    L64:
        e = move-exception;
        e.initCause(e);     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52
        throw new IllegalStateException(r22.getPositionDescription() + ": Error creating LayoutManager " + r36, e);     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52
    L54:
        r03 = r21.getClassLoader();     // Catch: ClassCastException -> L44 IllegalAccessException -> L46 InstantiationException -> L48 InvocationTargetException -> L50 ClassNotFoundException -> L52
        goto L55
    L38:
        if (r02.contains(".") == true) goto L36;
        r02 = RecyclerView.class.getPackage().getName() + '.' + r02;
    L77:
        int r06 = Build.VERSION.SDK_INT;
        int[] r37 = s0;
        TypedArray r56 = r21.obtainStyledAttributes(r22, r37, r12, 0);
        if (r06 < 29) goto L80;
        f0.r(this, r21, r37, r22, r56, r12);
    L80:
        boolean r07 = r56.getBoolean(0, true);
        r56.recycle();
        setNestedScrollingEnabled(r07);
        return;
    L27:
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + y());
    L28:
        r18 = 3;
        r13 = r53;
        r17 = 1;
        r19 = 2;
        r12 = r23;
        r11 = 4;
        goto L29
    L5:
        r52 = false;
        goto L6
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams r3) {
        nz r0 = this.l;
        if (r0 == null) goto L7;
        return r0.t(r3);
    L7:
        throw new IllegalStateException("RecyclerView has no LayoutManager" + y());
    }

    public void setRecyclerListener(uz r1) {
    }
}
