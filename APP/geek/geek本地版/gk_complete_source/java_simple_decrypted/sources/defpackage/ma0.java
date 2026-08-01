package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ma0 {
    public static final dz v = null;
    public int a;
    public final int b;
    public int c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public final float n;
    public final int o;
    public final OverScroller p;
    public final gt q;
    public View r;
    public boolean s;
    public final CoordinatorLayout t;
    public final y6 u;

    static {
        v = new dz(1);
    }

    public ma0(Context r3, CoordinatorLayout r4, gt r5) {
        this.c = -1;
        this.u = new y6(12, this);
        if (r5 == null) goto L7;
        this.t = r4;
        this.q = r5;
        ViewConfiguration r42 = ViewConfiguration.get(r3);
        this.o = (int) ((r3.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.b = r42.getScaledTouchSlop();
        this.m = r42.getScaledMaximumFlingVelocity();
        this.n = r42.getScaledMinimumFlingVelocity();
        this.p = new OverScroller(r3, v);
        return;
    L7:
        throw new IllegalArgumentException("Callback may not be null");
    }

    public final void a() {
        this.c = -1;
        float[] r0 = this.d;
        if (r0 == null) goto L6;
        Arrays.fill(r0, 0.0f);
        Arrays.fill(this.e, 0.0f);
        Arrays.fill(this.f, 0.0f);
        Arrays.fill(this.g, 0.0f);
        Arrays.fill(this.h, 0);
        Arrays.fill(this.i, 0);
        Arrays.fill(this.j, 0);
        this.k = 0;
    L6:
        VelocityTracker r02 = this.l;
        if (r02 == null) goto L10;
        r02.recycle();
        this.l = null;
        return;
    }

    public final void b(View r3, int r4) {
        ViewParent r0 = r3.getParent();
        CoordinatorLayout r1 = this.t;
        if (r0 != r1) goto L7;
        this.r = r3;
        this.c = r4;
        this.q.r(r3, r4);
        n(1);
        return;
    L7:
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + r1 + ")");
    }

    public final boolean c(View r4, float r5, float r6) {
        if (r4 == null) goto L26;
        gt r1 = this.q;
        if (r1.l(r4) <= 0) goto L8;
        boolean r42 = true;
    L10:
        if (r1.m() <= 0) goto L12;
        boolean r12 = true;
    L13:
        if (r42 == false) goto L18;
        if (r12 == false) goto L18;
        float r62 = (r6 * r6) + (r5 * r5);
        int r43 = this.b;
        if (r62 <= (r43 * r43)) goto L26;
    L25:
        return true;
    L18:
        if (r42 == true) goto L20;
        if (r12 == false) goto L26;
        if (Math.abs(r6) <= this.b) goto L26;
    L20:
        if (Math.abs(r5) <= this.b) goto L26;
    L12:
        r12 = false;
        goto L13
    L8:
        r42 = false;
    L26:
        return false;
    }

    public final void d(int r5) {
        float[] r0 = this.d;
        if (r0 == null) goto L8;
        int r1 = this.k;
        int r2 = 1 << r5;
        if ((r1 & r2) == 0) goto L9;
        r0[r5] = 0.0f;
        this.e[r5] = 0.0f;
        this.f[r5] = 0.0f;
        this.g[r5] = 0.0f;
        this.h[r5] = 0;
        this.i[r5] = 0;
        this.j[r5] = 0;
        this.k = (~r2) & r1;
        return;
    L9:
        return;
    }

    public final int e(int r5, int r6, int r7) {
        if (r5 != 0) goto L5;
        return 0;
    L5:
        float r1 = this.t.getWidth() / 2;
        float r2 = (((float) Math.sin((Math.min(1.0f, Math.abs(r5) / r0) - 0.5f) * 0.47123894f)) * r1) + r1;
        int r62 = Math.abs(r6);
        if (r62 <= 0) goto L8;
        int r52 = Math.round(Math.abs(r2 / r62) * 1000.0f) * 4;
    L10:
        return Math.min(r52, 600);
    L8:
        r52 = (int) (((Math.abs(r5) / r7) + 1.0f) * 256.0f);
        goto L10
    }

    public final boolean f() {
        if (this.a != 2) goto L21;
        OverScroller r0 = this.p;
        boolean r3 = r0.computeScrollOffset();
        int r4 = r0.getCurrX();
        int r5 = r0.getCurrY();
        int r6 = r4 - this.r.getLeft();
        int r7 = r5 - this.r.getTop();
        if (r6 == 0) goto L7;
        View r8 = this.r;
        WeakHashMap r9 = ja0.a;
        r8.offsetLeftAndRight(r6);
    L7:
        if (r7 == 0) goto L9;
        View r82 = this.r;
        WeakHashMap r92 = ja0.a;
        r82.offsetTopAndBottom(r7);
    L9:
        if (r6 != 0) goto L11;
        if (r7 != 0) goto L11;
    L12:
        if (r3 == true) goto L14;
    L18:
        if (r3 == true) goto L21;
        this.t.post(this.u);
        goto L21
    L14:
        if (r4 != r0.getFinalX()) goto L18;
        if (r5 != r0.getFinalY()) goto L18;
        r0.abortAnimation();
        r3 = false;
    L11:
        this.q.t(this.r, r4, r5);
    L21:
        if (this.a != 2) goto L24;
        return true;
    L24:
        return false;
    }

    public final View g(int r5, int r6) {
        CoordinatorLayout r0 = this.t;
        int r1 = r0.getChildCount() - 1;
    L3:
        if (r1 < 0) goto L14;
        this.q.getClass();
        View r2 = r0.getChildAt(r1);
        if (r5 < r2.getLeft()) goto L13;
        if (r5 >= r2.getRight()) goto L13;
        if (r6 < r2.getTop()) goto L13;
        if (r6 >= r2.getBottom()) goto L13;
        return r2;
    L13:
        r1 = r1 - 1;
        goto L3
    L14:
        return null;
    }

    public final boolean h(int r11, int r12, int r13, int r14) {
        int r2 = this.r.getLeft();
        int r3 = this.r.getTop();
        int r4 = r11 - r2;
        int r5 = r12 - r3;
        OverScroller r1 = this.p;
        if (r4 != 0) goto L7;
        if (r5 != 0) goto L7;
        r1.abortAnimation();
        n(0);
        return false;
    L7:
        View r122 = this.r;
        int r0 = (int) this.n;
        int r6 = (int) this.m;
        int r7 = Math.abs(r13);
        if (r7 >= r0) goto L10;
        r13 = 0;
    L14:
        int r72 = Math.abs(r14);
        if (r72 >= r0) goto L17;
        r14 = 0;
    L21:
        int r112 = Math.abs(r4);
        int r02 = Math.abs(r5);
        int r62 = Math.abs(r13);
        int r73 = Math.abs(r14);
        int r8 = r62 + r73;
        int r9 = r112 + r02;
        if (r13 == 0) goto L25;
        float r113 = r62;
        float r63 = r8;
    L24:
        float r114 = r113 / r63;
        if (r14 == 0) goto L29;
        float r03 = r73;
        float r64 = r8;
    L28:
        float r04 = r03 / r64;
        r1.startScroll(r2, r3, r4, r5, (int) ((e(r5, r14, r6.m()) * r04) + (e(r4, r13, this.q.l(r122)) * r114)));
        n(2);
        return true;
    L29:
        r03 = r02;
        r64 = r9;
        goto L28
    L25:
        r113 = r112;
        r63 = r9;
        goto L24
    L17:
        if (r72 <= r6) goto L21;
        if (r14 <= 0) goto L20;
        r14 = r6;
        goto L21
    L20:
        r14 = -r6;
        goto L21
    L10:
        if (r7 <= r6) goto L14;
        if (r13 <= 0) goto L13;
        r13 = r6;
        goto L14
    L13:
        r13 = -r6;
        goto L14
    }

    public final boolean i(int r4) {
        if ((this.k & (1 << r4)) == 0) goto L5;
        return true;
    L5:
        Log.e("ViewDragHelper", "Ignoring pointerId=" + r4 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void j(MotionEvent r10) {
        int r0 = r10.getActionMasked();
        int r1 = r10.getActionIndex();
        if (r0 != 0) goto L6;
        a();
    L6:
        if (this.l != null) goto L8;
        this.l = VelocityTracker.obtain();
    L8:
        this.l.addMovement(r10);
        int r2 = 0;
        if (r0 != 0) goto L11;
        float r02 = r10.getX();
        float r12 = r10.getY();
        int r102 = r10.getPointerId(0);
        View r22 = g((int) r02, (int) r12);
        l(r02, r12, r102);
        q(r22, r102);
        int r103 = this.h[r102];
        return;
    L11:
        if (r0 == 1) goto L100;
        gt r5 = this.q;
        if (r0 == 2) goto L69;
        if (r0 == 3) goto L62;
        if (r0 != 5) goto L19;
        int r03 = r10.getPointerId(r1);
        float r4 = r10.getX(r1);
        float r104 = r10.getY(r1);
        l(r4, r104, r03);
        if (this.a != 0) goto L46;
        q(g((int) r4, (int) r104), r03);
        int r105 = this.h[r03];
        return;
    L46:
        int r13 = (int) r4;
        int r106 = (int) r104;
        View r42 = this.r;
        if (r42 != null) goto L50;
    L58:
        if (r2 == 0) goto L72;
        q(this.r, r03);
        return;
    L72:
        return;
    L50:
        if (r13 < r42.getLeft()) goto L58;
        if (r13 >= r42.getRight()) goto L58;
        if (r106 < r42.getTop()) goto L58;
        if (r106 >= r42.getBottom()) goto L58;
        r2 = 1;
        goto L58
    L19:
        if (r0 != 6) goto L118;
        int r04 = r10.getPointerId(r1);
        if (this.a == 1) goto L24;
    L40:
        d(r04);
        return;
    L24:
        if (r04 != this.c) goto L40;
        int r14 = r10.getPointerCount();
    L27:
        if (r2 >= r14) goto L37;
        int r43 = r10.getPointerId(r2);
        if (r43 == this.c) goto L36;
        View r52 = g((int) r10.getX(r2), (int) r10.getY(r2));
        View r6 = this.r;
        if (r52 != r6) goto L36;
        if (q(r6, r43) == false) goto L36;
        int r107 = this.c;
    L38:
        if (r107 != (-1)) goto L40;
        k();
    L36:
        r2 = r2 + 1;
        goto L27
    L37:
        r107 = -1;
        goto L38
    L118:
        return;
    L62:
        if (this.a != 1) goto L66;
        this.s = true;
        r5.u(this.r, 0.0f, 0.0f);
        this.s = false;
        if (this.a != 1) goto L66;
        n(0);
    L66:
        a();
        return;
    L69:
        if (this.a == 1) goto L71;
        int r05 = r10.getPointerCount();
    L84:
        if (r2 >= r05) goto L97;
        int r15 = r10.getPointerId(r2);
        if (i(r15) == false) goto L96;
        float r44 = r10.getX(r2);
        float r53 = r10.getY(r2);
        float r62 = r44 - this.d[r15];
        float r7 = r53 - this.e[r15];
        Math.abs(r62);
        Math.abs(r7);
        int r8 = this.h[r15];
        Math.abs(r7);
        Math.abs(r62);
        int r82 = this.h[r15];
        Math.abs(r62);
        Math.abs(r7);
        int r83 = this.h[r15];
        Math.abs(r7);
        Math.abs(r62);
        int r84 = this.h[r15];
        if (this.a == 1) goto L97;
        View r45 = g((int) r44, (int) r53);
        if (c(r45, r62, r7) == false) goto L96;
        if (q(r45, r15) == true) goto L97;
    L96:
        r2 = r2 + 1;
    L97:
        m(r10);
        return;
    L71:
        if (i(this.c) == false) goto L117;
        int r06 = r10.findPointerIndex(this.c);
        float r16 = r10.getX(r06);
        float r07 = r10.getY(r06);
        float[] r23 = this.f;
        int r3 = this.c;
        int r17 = (int) (r16 - r23[r3]);
        int r08 = (int) (r07 - this.g[r3]);
        int r24 = this.r.getLeft() + r17;
        int r32 = this.r.getTop() + r08;
        int r46 = this.r.getLeft();
        int r63 = this.r.getTop();
        if (r17 == 0) goto L76;
        r24 = r5.b(this.r, r24);
        WeakHashMap r85 = ja0.a;
        this.r.offsetLeftAndRight(r24 - r46);
    L76:
        if (r08 == 0) goto L78;
        r32 = r5.c(this.r, r32);
        WeakHashMap r72 = ja0.a;
        this.r.offsetTopAndBottom(r32 - r63);
    L78:
        if (r17 != 0) goto L80;
        if (r08 != 0) goto L80;
    L81:
        m(r10);
        return;
    L80:
        r5.t(this.r, r24, r32);
        goto L81
    L117:
        return;
    L100:
        if (this.a != 1) goto L102;
        k();
    L102:
        a();
    }

    public final void k() {
        VelocityTracker r0 = this.l;
        float r2 = this.m;
        r0.computeCurrentVelocity(1000, r2);
        float r02 = this.l.getXVelocity(this.c);
        float r1 = Math.abs(r02);
        float r3 = this.n;
        if (r1 >= r3) goto L6;
        r02 = 0.0f;
    L11:
        float r12 = this.l.getYVelocity(this.c);
        float r4 = Math.abs(r12);
        if (r4 >= r3) goto L15;
        r2 = 0.0f;
    L21:
        this.s = true;
        this.q.u(this.r, r02, r2);
        this.s = false;
        if (this.a != 1) goto L25;
        n(0);
        return;
    L25:
        return;
    L15:
        if (r4 > r2) goto L17;
        r2 = r12;
        goto L21
    L17:
        if (r12 > 0.0f) goto L21;
        r2 = -r2;
        goto L21
    L6:
        if (r1 <= r2) goto L11;
        if (r02 <= 0.0f) goto L10;
        r02 = r2;
        goto L11
    L10:
        r02 = -r2;
        goto L11
    }

    public final void l(float r11, float r12, int r13) {
        float[] r0 = this.d;
        int r1 = 0;
        if (r0 != null) goto L5;
    L6:
        int r2 = r13 + 1;
        float[] r3 = new float[r2];
        float[] r4 = new float[r2];
        float[] r5 = new float[r2];
        float[] r6 = new float[r2];
        int[] r7 = new int[r2];
        int[] r8 = new int[r2];
        int[] r22 = new int[r2];
        if (r0 == null) goto L9;
        System.arraycopy(r0, 0, r3, 0, r0.length);
        float[] r02 = this.e;
        System.arraycopy(r02, 0, r4, 0, r02.length);
        float[] r03 = this.f;
        System.arraycopy(r03, 0, r5, 0, r03.length);
        float[] r04 = this.g;
        System.arraycopy(r04, 0, r6, 0, r04.length);
        int[] r05 = this.h;
        System.arraycopy(r05, 0, r7, 0, r05.length);
        int[] r06 = this.i;
        System.arraycopy(r06, 0, r8, 0, r06.length);
        int[] r07 = this.j;
        System.arraycopy(r07, 0, r22, 0, r07.length);
    L9:
        this.d = r3;
        this.e = r4;
        this.f = r5;
        this.g = r6;
        this.h = r7;
        this.i = r8;
        this.j = r22;
    L10:
        float[] r08 = this.d;
        this.f[r13] = r11;
        r08[r13] = r11;
        float[] r09 = this.e;
        this.g[r13] = r12;
        r09[r13] = r12;
        int[] r010 = this.h;
        int r112 = (int) r11;
        int r122 = (int) r12;
        CoordinatorLayout r23 = this.t;
        int r32 = r23.getLeft();
        int r42 = this.o;
        if (r112 >= (r32 + r42)) goto L14;
        r1 = 1;
    L14:
        if (r122 >= (r23.getTop() + r42)) goto L17;
        r1 = r1 | 4;
    L17:
        if (r112 <= (r23.getRight() - r42)) goto L20;
        r1 = r1 | 2;
    L20:
        if (r122 <= (r23.getBottom() - r42)) goto L22;
        r1 = r1 | 8;
    L22:
        r010[r13] = r1;
        this.k |= 1 << r13;
        return;
    L5:
        if (r0.length > r13) goto L10;
        goto L6
    }

    public final void m(MotionEvent r7) {
        int r0 = r7.getPointerCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L9;
        int r2 = r7.getPointerId(r1);
        if (i(r2) == false) goto L8;
        float r3 = r7.getX(r1);
        float r4 = r7.getY(r1);
        this.f[r2] = r3;
        this.g[r2] = r4;
    L8:
        r1 = r1 + 1;
        goto L3
    }

    public final void n(int r3) {
        this.t.removeCallbacks(this.u);
        if (this.a == r3) goto L8;
        this.a = r3;
        this.q.s(r3);
        if (this.a != 0) goto L9;
        this.r = null;
        return;
    L9:
        return;
    }

    public final boolean o(int r4, int r5) {
        if (this.s == false) goto L7;
        return h(r4, r5, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
    L7:
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean p(MotionEvent r18) {
        int r2 = r18.getActionMasked();
        int r3 = r18.getActionIndex();
        if (r2 != 0) goto L6;
        a();
    L6:
        if (this.l != null) goto L8;
        this.l = VelocityTracker.obtain();
    L8:
        this.l.addMovement(r18);
        if (r2 == 0) goto L62;
        if (r2 == 1) goto L61;
        if (r2 == 2) goto L28;
        if (r2 == 3) goto L61;
        if (r2 != 5) goto L17;
        int r22 = r18.getPointerId(r3);
        float r7 = r18.getX(r3);
        float r1 = r18.getY(r3);
        l(r7, r1, r22);
        int r32 = this.a;
        if (r32 != 0) goto L23;
        int r12 = this.h[r22];
    L69:
        if (this.a != 1) goto L71;
        return true;
    L71:
        return false;
    L23:
        if (r32 != 2) goto L69;
        View r13 = g((int) r7, (int) r1);
        if (r13 != this.r) goto L69;
        q(r13, r22);
        goto L69
    L17:
        if (r2 != 6) goto L69;
        d(r18.getPointerId(r3));
        goto L69
    L28:
        if (this.d == null) goto L69;
        if (this.e == null) goto L69;
        int r23 = r18.getPointerCount();
        int r33 = 0;
    L33:
        if (r33 >= r23) goto L60;
        int r4 = r18.getPointerId(r33);
        if (i(r4) == false) goto L59;
        float r72 = r18.getX(r33);
        float r8 = r18.getY(r33);
        float r9 = r72 - this.d[r4];
        float r10 = r8 - this.e[r4];
        View r73 = g((int) r72, (int) r8);
        if (r73 != null) goto L40;
    L42:
        boolean r82 = false;
    L43:
        if (r82 == false) goto L52;
        int r11 = r73.getLeft();
        gt r132 = this.q;
        int r122 = r132.b(r73, ((int) r9) + r11);
        int r14 = r73.getTop();
        int r15 = r132.c(r73, ((int) r10) + r14);
        int r16 = r132.l(r73);
        int r133 = r132.m();
        if (r16 == 0) goto L48;
        if (r16 <= 0) goto L52;
        if (r122 != r11) goto L52;
    L48:
        if (r133 == 0) goto L60;
        if (r133 <= 0) goto L52;
        if (r15 == r14) goto L60;
    L52:
        Math.abs(r9);
        Math.abs(r10);
        int r112 = this.h[r4];
        Math.abs(r10);
        Math.abs(r9);
        int r113 = this.h[r4];
        Math.abs(r9);
        Math.abs(r10);
        int r114 = this.h[r4];
        Math.abs(r10);
        Math.abs(r9);
        int r92 = this.h[r4];
        if (this.a == 1) goto L60;
        if (r82 == false) goto L59;
        if (q(r73, r4) == false) goto L59;
    L40:
        if (c(r73, r9, r10) == false) goto L42;
        r82 = true;
    L59:
        r33 = r33 + 1;
    L60:
        m(r18);
    L61:
        a();
        goto L69
    L62:
        float r24 = r18.getX();
        float r34 = r18.getY();
        int r17 = r18.getPointerId(0);
        l(r24, r34, r17);
        View r25 = g((int) r24, (int) r34);
        if (r25 == this.r) goto L65;
    L67:
        int r19 = this.h[r17];
        goto L69
    L65:
        if (this.a != 2) goto L67;
        q(r25, r17);
        goto L67
    }

    public final boolean q(View r3, int r4) {
        if (r3 == this.r) goto L5;
    L7:
        if (r3 != null) goto L9;
        return false;
    L9:
        if (this.q.H(r3, r4) == false) goto L14;
        this.c = r4;
        b(r3, r4);
        return true;
    L14:
        return false;
    L5:
        if (this.c != r4) goto L7;
        return true;
    }
}
