package p021L;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.lang.reflect.Field;
import java.util.Arrays;
import p001A0.AbstractC0040p;
import p001A0.RunnableC0019E;
import p006D.AbstractC0080Q;

/* JADX INFO: renamed from: L.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0245e {

    /* JADX INFO: renamed from: v */
    public static final InterpolatorC0244d f502v = null;

    /* JADX INFO: renamed from: a */
    public int f503a;

    /* JADX INFO: renamed from: b */
    public final int f504b;

    /* JADX INFO: renamed from: c */
    public int f505c;

    /* JADX INFO: renamed from: d */
    public float[] f506d;

    /* JADX INFO: renamed from: e */
    public float[] f507e;

    /* JADX INFO: renamed from: f */
    public float[] f508f;

    /* JADX INFO: renamed from: g */
    public float[] f509g;

    /* JADX INFO: renamed from: h */
    public int[] f510h;

    /* JADX INFO: renamed from: i */
    public int[] f511i;

    /* JADX INFO: renamed from: j */
    public int[] f512j;

    /* JADX INFO: renamed from: k */
    public int f513k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f514l;

    /* JADX INFO: renamed from: m */
    public final float f515m;

    /* JADX INFO: renamed from: n */
    public final float f516n;

    /* JADX INFO: renamed from: o */
    public final int f517o;

    /* JADX INFO: renamed from: p */
    public final OverScroller f518p;

    /* JADX INFO: renamed from: q */
    public final AbstractC0040p f519q;

    /* JADX INFO: renamed from: r */
    public View f520r;

    /* JADX INFO: renamed from: s */
    public boolean f521s;

    /* JADX INFO: renamed from: t */
    public final ViewGroup f522t;

    /* JADX INFO: renamed from: u */
    public final RunnableC0019E f523u;

    static {
        f502v = new InterpolatorC0244d(0);
    }

    public C0245e(Context r3, ViewGroup r4, AbstractC0040p r5) {
        this.f505c = -1;
        this.f523u = new RunnableC0019E(2, this);
        if (r4 == null) goto L10;
        if (r5 == null) goto L8;
        this.f522t = r4;
        this.f519q = r5;
        ViewConfiguration r42 = ViewConfiguration.get(r3);
        this.f517o = (int) ((r3.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f504b = r42.getScaledTouchSlop();
        this.f515m = r42.getScaledMaximumFlingVelocity();
        this.f516n = r42.getScaledMinimumFlingVelocity();
        this.f518p = new OverScroller(r3, f502v);
        return;
    L8:
        throw new IllegalArgumentException("Callback may not be null");
    L10:
        throw new IllegalArgumentException("Parent view may not be null");
    }

    /* JADX INFO: renamed from: a */
    public final void m669a() {
        this.f505c = -1;
        float[] r02 = this.f506d;
        if (r02 == null) goto L6;
        Arrays.fill(r02, 0.0f);
        Arrays.fill(this.f507e, 0.0f);
        Arrays.fill(this.f508f, 0.0f);
        Arrays.fill(this.f509g, 0.0f);
        Arrays.fill(this.f510h, 0);
        Arrays.fill(this.f511i, 0);
        Arrays.fill(this.f512j, 0);
        this.f513k = 0;
    L6:
        VelocityTracker r03 = this.f514l;
        if (r03 == null) goto L10;
        r03.recycle();
        this.f514l = null;
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m670b(View r3, int r4) {
        ViewParent r02 = r3.getParent();
        ViewGroup r1 = this.f522t;
        if (r02 != r1) goto L7;
        this.f520r = r3;
        this.f505c = r4;
        this.f519q.mo123K(r3, r4);
        m681m(1);
        return;
    L7:
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + r1 + ")");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m671c(View r4, float r5, float r6) {
        if (r4 != null) goto L5;
        return false;
    L5:
        AbstractC0040p r1 = this.f519q;
        if (r1.mo136z(r4) <= 0) goto L8;
        boolean r42 = true;
    L10:
        if (r1.mo120A() <= 0) goto L12;
        boolean r12 = true;
    L13:
        if (r42 == false) goto L19;
        if (r12 == false) goto L19;
        float r62 = (r6 * r6) + (r5 * r5);
        int r43 = this.f504b;
        if (r62 > (r43 * r43)) goto L18;
        return false;
    L18:
        return true;
    L19:
        if (r42 == true) goto L21;
        if (r12 == true) goto L26;
        return false;
    L26:
        if (Math.abs(r6) > this.f504b) goto L28;
        return false;
    L28:
        return true;
    L21:
        if (Math.abs(r5) > this.f504b) goto L23;
        return false;
    L23:
        return true;
    L12:
        r12 = false;
        goto L13
    L8:
        r42 = false;
        goto L10
    }

    /* JADX INFO: renamed from: d */
    public final void m672d(int r5) {
        float[] r02 = this.f506d;
        if (r02 == null) goto L8;
        int r1 = this.f513k;
        int r2 = 1 << r5;
        if ((r1 & r2) == 0) goto L9;
        r02[r5] = 0.0f;
        this.f507e[r5] = 0.0f;
        this.f508f[r5] = 0.0f;
        this.f509g[r5] = 0.0f;
        this.f510h[r5] = 0;
        this.f511i[r5] = 0;
        this.f512j[r5] = 0;
        this.f513k = (~r2) & r1;
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: e */
    public final int m673e(int r5, int r6, int r7) {
        if (r5 != 0) goto L5;
        return 0;
    L5:
        float r1 = this.f522t.getWidth() / 2;
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

    /* JADX INFO: renamed from: f */
    public final boolean m674f() {
        if (this.f503a != 2) goto L21;
        OverScroller r02 = this.f518p;
        boolean r3 = r02.computeScrollOffset();
        int r4 = r02.getCurrX();
        int r5 = r02.getCurrY();
        int r6 = r4 - this.f520r.getLeft();
        int r7 = r5 - this.f520r.getTop();
        if (r6 == 0) goto L7;
        View r8 = this.f520r;
        Field r9 = AbstractC0080Q.f219a;
        r8.offsetLeftAndRight(r6);
    L7:
        if (r7 == 0) goto L9;
        View r82 = this.f520r;
        Field r92 = AbstractC0080Q.f219a;
        r82.offsetTopAndBottom(r7);
    L9:
        if (r6 != 0) goto L11;
        if (r7 != 0) goto L11;
    L12:
        if (r3 == true) goto L14;
    L18:
        if (r3 == true) goto L21;
        this.f522t.post(this.f523u);
        goto L21
    L14:
        if (r4 != r02.getFinalX()) goto L18;
        if (r5 != r02.getFinalY()) goto L18;
        r02.abortAnimation();
        r3 = false;
    L11:
        this.f519q.mo125M(this.f520r, r4, r5);
    L21:
        if (this.f503a != 2) goto L24;
        return true;
    L24:
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final View m675g(int r5, int r6) {
        ViewGroup r02 = this.f522t;
        int r1 = r02.getChildCount() - 1;
    L3:
        if (r1 < 0) goto L14;
        this.f519q.getClass();
        View r2 = r02.getChildAt(r1);
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

    /* JADX INFO: renamed from: h */
    public final boolean m676h(int r11, int r12, int r13, int r14) {
        int r2 = this.f520r.getLeft();
        int r3 = this.f520r.getTop();
        int r4 = r11 - r2;
        int r5 = r12 - r3;
        OverScroller r1 = this.f518p;
        int r112 = 0;
        if (r4 != 0) goto L7;
        if (r5 != 0) goto L7;
        r1.abortAnimation();
        m681m(0);
        return false;
    L7:
        View r122 = this.f520r;
        int r02 = (int) this.f516n;
        int r6 = (int) this.f515m;
        int r7 = Math.abs(r13);
        if (r7 >= r02) goto L10;
        r13 = 0;
    L14:
        int r72 = Math.abs(r14);
        if (r72 >= r02) goto L17;
    L16:
        r14 = r112;
    L21:
        int r113 = Math.abs(r4);
        int r03 = Math.abs(r5);
        int r62 = Math.abs(r13);
        int r73 = Math.abs(r14);
        int r8 = r62 + r73;
        int r9 = r113 + r03;
        if (r13 == 0) goto L25;
        float r114 = r62;
        float r63 = r8;
    L24:
        float r115 = r114 / r63;
        if (r14 == 0) goto L29;
        float r04 = r73;
        float r64 = r8;
    L28:
        float r05 = r04 / r64;
        r1.startScroll(r2, r3, r4, r5, (int) ((m673e(r5, r14, r6.mo120A()) * r05) + (m673e(r4, r13, this.f519q.mo136z(r122)) * r115)));
        m681m(2);
        return true;
    L29:
        r04 = r03;
        r64 = r9;
        goto L28
    L25:
        r114 = r113;
        r63 = r9;
        goto L24
    L17:
        if (r72 <= r6) goto L21;
        if (r14 <= 0) goto L20;
        r14 = r6;
        goto L21
    L20:
        r112 = -r6;
        goto L16
    L10:
        if (r7 <= r6) goto L14;
        if (r13 <= 0) goto L13;
        r13 = r6;
        goto L14
    L13:
        r13 = -r6;
        goto L14
    }

    /* JADX INFO: renamed from: i */
    public final void m677i(MotionEvent r11) {
        int r02 = 1;
        int r1 = r11.getActionMasked();
        int r2 = r11.getActionIndex();
        if (r1 != 0) goto L6;
        m669a();
    L6:
        if (this.f514l != null) goto L8;
        this.f514l = VelocityTracker.obtain();
    L8:
        this.f514l.addMovement(r11);
        int r3 = 0;
        if (r1 == 0) goto L104;
        if (r1 == 1) goto L101;
        AbstractC0040p r5 = this.f519q;
        if (r1 == 2) goto L66;
        if (r1 == 3) goto L60;
        if (r1 != 5) goto L18;
        int r12 = r11.getPointerId(r2);
        float r4 = r11.getX(r2);
        float r112 = r11.getY(r2);
        m679k(r4, r112, r12);
        if (this.f503a != 0) goto L43;
        m684p(m675g((int) r4, (int) r112), r12);
        int r113 = this.f510h[r12];
        return;
    L43:
        int r22 = (int) r4;
        int r114 = (int) r112;
        View r42 = this.f520r;
        if (r42 != null) goto L47;
    L57:
        if (r3 == 0) goto L119;
        m684p(this.f520r, r12);
        return;
    L119:
        return;
    L47:
        if (r22 >= r42.getLeft()) goto L49;
    L55:
        r02 = 0;
    L56:
        r3 = r02;
        goto L57
    L49:
        if (r22 >= r42.getRight()) goto L55;
        if (r114 < r42.getTop()) goto L55;
        if (r114 >= r42.getBottom()) goto L55;
    L18:
        if (r1 != 6) goto L125;
        int r13 = r11.getPointerId(r2);
        if (this.f503a == 1) goto L23;
    L39:
        m672d(r13);
        return;
    L23:
        if (r13 != this.f505c) goto L39;
        int r23 = r11.getPointerCount();
    L26:
        if (r3 >= r23) goto L36;
        int r52 = r11.getPointerId(r3);
        if (r52 == this.f505c) goto L35;
        View r6 = m675g((int) r11.getX(r3), (int) r11.getY(r3));
        View r7 = this.f520r;
        if (r6 != r7) goto L35;
        if (m684p(r7, r52) == false) goto L35;
        int r115 = this.f505c;
    L37:
        if (r115 != (-1)) goto L39;
        m678j();
    L35:
        r3 = r3 + 1;
        goto L26
    L36:
        r115 = -1;
        goto L37
    L125:
        return;
    L60:
        if (this.f503a != 1) goto L64;
        this.f521s = true;
        r5.mo126N(this.f520r, 0.0f, 0.0f);
        this.f521s = false;
        if (this.f503a != 1) goto L64;
        m681m(0);
    L64:
        m669a();
        return;
    L66:
        if (this.f503a != 1) goto L82;
        int r14 = this.f505c;
        if ((this.f513k & (1 << r14)) != 0) goto L71;
        r02 = 0;
    L71:
        if (r02 == 0) goto L126;
        int r03 = r11.findPointerIndex(r14);
        float r15 = r11.getX(r03);
        float r04 = r11.getY(r03);
        float[] r24 = this.f508f;
        int r32 = this.f505c;
        int r16 = (int) (r15 - r24[r32]);
        int r05 = (int) (r04 - this.f509g[r32]);
        int r25 = this.f520r.getLeft() + r16;
        int r33 = this.f520r.getTop() + r05;
        int r43 = this.f520r.getLeft();
        int r62 = this.f520r.getTop();
        if (r16 == 0) goto L76;
        r25 = r5.mo133k(this.f520r, r25);
        Field r8 = AbstractC0080Q.f219a;
        this.f520r.offsetLeftAndRight(r25 - r43);
    L76:
        if (r05 == 0) goto L78;
        r33 = r5.mo134l(this.f520r, r33);
        Field r72 = AbstractC0080Q.f219a;
        this.f520r.offsetTopAndBottom(r33 - r62);
    L78:
        if (r16 != 0) goto L80;
        if (r05 != 0) goto L80;
    L81:
        m680l(r11);
        return;
    L80:
        r5.mo125M(this.f520r, r25, r33);
        goto L81
    L126:
        return;
    L82:
        int r17 = r11.getPointerCount();
        int r26 = 0;
    L83:
        if (r26 >= r17) goto L99;
        int r44 = r11.getPointerId(r26);
        if ((this.f513k & (1 << r44)) == 0) goto L87;
        boolean r53 = true;
    L88:
        if (r53 == false) goto L98;
        float r54 = r11.getX(r26);
        float r63 = r11.getY(r26);
        float r73 = r54 - this.f506d[r44];
        float r82 = r63 - this.f507e[r44];
        Math.abs(r73);
        Math.abs(r82);
        int r9 = this.f510h[r44];
        Math.abs(r82);
        Math.abs(r73);
        int r92 = this.f510h[r44];
        Math.abs(r73);
        Math.abs(r82);
        int r93 = this.f510h[r44];
        Math.abs(r82);
        Math.abs(r73);
        int r94 = this.f510h[r44];
        if (this.f503a == 1) goto L99;
        View r55 = m675g((int) r54, (int) r63);
        if (m671c(r55, r73, r82) == false) goto L98;
        if (m684p(r55, r44) == true) goto L99;
    L98:
        r26 = r26 + 1;
        goto L83
    L87:
        r53 = false;
    L99:
        m680l(r11);
        return;
    L101:
        if (this.f503a != 1) goto L103;
        m678j();
    L103:
        m669a();
        return;
    L104:
        float r06 = r11.getX();
        float r18 = r11.getY();
        int r116 = r11.getPointerId(0);
        View r27 = m675g((int) r06, (int) r18);
        m679k(r06, r18, r116);
        m684p(r27, r116);
        int r117 = this.f510h[r116];
    }

    /* JADX INFO: renamed from: j */
    public final void m678j() {
        VelocityTracker r02 = this.f514l;
        float r1 = this.f515m;
        r02.computeCurrentVelocity(1000, r1);
        float r03 = this.f514l.getXVelocity(this.f505c);
        float r2 = this.f516n;
        float r3 = Math.abs(r03);
        float r5 = 0.0f;
        if (r3 >= r2) goto L6;
        r03 = 0.0f;
    L11:
        float r32 = this.f514l.getYVelocity(this.f505c);
        float r4 = Math.abs(r32);
        if (r4 >= r2) goto L15;
    L22:
        this.f521s = true;
        this.f519q.mo126N(this.f520r, r03, r5);
        this.f521s = false;
        if (this.f503a != 1) goto L26;
        m681m(0);
        return;
    L26:
        return;
    L15:
        if (r4 > r1) goto L17;
        r5 = r32;
        goto L22
    L17:
        if (r32 > 0.0f) goto L20;
        r1 = -r1;
    L20:
        r5 = r1;
        goto L22
    L6:
        if (r3 <= r1) goto L11;
        if (r03 <= 0.0f) goto L10;
        r03 = r1;
        goto L11
    L10:
        r03 = -r1;
        goto L11
    }

    /* JADX INFO: renamed from: k */
    public final void m679k(float r11, float r12, int r13) {
        float[] r02 = this.f506d;
        int r1 = 0;
        if (r02 != null) goto L5;
    L6:
        int r2 = r13 + 1;
        float[] r3 = new float[r2];
        float[] r4 = new float[r2];
        float[] r5 = new float[r2];
        float[] r6 = new float[r2];
        int[] r7 = new int[r2];
        int[] r8 = new int[r2];
        int[] r22 = new int[r2];
        if (r02 == null) goto L9;
        System.arraycopy(r02, 0, r3, 0, r02.length);
        float[] r03 = this.f507e;
        System.arraycopy(r03, 0, r4, 0, r03.length);
        float[] r04 = this.f508f;
        System.arraycopy(r04, 0, r5, 0, r04.length);
        float[] r05 = this.f509g;
        System.arraycopy(r05, 0, r6, 0, r05.length);
        int[] r06 = this.f510h;
        System.arraycopy(r06, 0, r7, 0, r06.length);
        int[] r07 = this.f511i;
        System.arraycopy(r07, 0, r8, 0, r07.length);
        int[] r08 = this.f512j;
        System.arraycopy(r08, 0, r22, 0, r08.length);
    L9:
        this.f506d = r3;
        this.f507e = r4;
        this.f508f = r5;
        this.f509g = r6;
        this.f510h = r7;
        this.f511i = r8;
        this.f512j = r22;
    L10:
        float[] r09 = this.f506d;
        this.f508f[r13] = r11;
        r09[r13] = r11;
        float[] r010 = this.f507e;
        this.f509g[r13] = r12;
        r010[r13] = r12;
        int[] r011 = this.f510h;
        int r112 = (int) r11;
        int r122 = (int) r12;
        ViewGroup r23 = this.f522t;
        int r32 = r23.getLeft();
        int r42 = this.f517o;
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
        r011[r13] = r1;
        this.f513k |= 1 << r13;
        return;
    L5:
        if (r02.length > r13) goto L10;
        goto L6
    }

    /* JADX INFO: renamed from: l */
    public final void m680l(MotionEvent r7) {
        int r02 = r7.getPointerCount();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L8;
        int r2 = r7.getPointerId(r1);
        if ((this.f513k & (1 << r2)) == 0) goto L7;
        float r3 = r7.getX(r1);
        float r4 = r7.getY(r1);
        this.f508f[r2] = r3;
        this.f509g[r2] = r4;
    L7:
        r1 = r1 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: m */
    public final void m681m(int r3) {
        RunnableC0019E r02 = this.f523u;
        this.f522t.removeCallbacks(r02);
        if (this.f503a == r3) goto L8;
        this.f503a = r3;
        this.f519q.mo124L(r3);
        if (this.f503a != 0) goto L9;
        this.f520r = null;
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m682n(int r4, int r5) {
        if (this.f521s == false) goto L7;
        return m676h(r4, r5, (int) this.f514l.getXVelocity(this.f505c), (int) this.f514l.getYVelocity(this.f505c));
    L7:
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX INFO: renamed from: o */
    public final boolean m683o(MotionEvent r18) {
        int r2 = r18.getActionMasked();
        int r3 = r18.getActionIndex();
        if (r2 != 0) goto L6;
        m669a();
    L6:
        if (this.f514l != null) goto L8;
        this.f514l = VelocityTracker.obtain();
    L8:
        this.f514l.addMovement(r18);
        if (r2 == 0) goto L61;
        if (r2 == 1) goto L60;
        if (r2 == 2) goto L28;
        if (r2 == 3) goto L60;
        if (r2 != 5) goto L17;
        int r22 = r18.getPointerId(r3);
        float r7 = r18.getX(r3);
        float r1 = r18.getY(r3);
        m679k(r7, r1, r22);
        int r32 = this.f503a;
        if (r32 != 0) goto L23;
        int r12 = this.f510h[r22];
    L68:
        if (this.f503a != 1) goto L71;
        return true;
    L71:
        return false;
    L23:
        if (r32 != 2) goto L68;
        View r13 = m675g((int) r7, (int) r1);
        if (r13 != this.f520r) goto L68;
        m684p(r13, r22);
        goto L68
    L17:
        if (r2 != 6) goto L68;
        m672d(r18.getPointerId(r3));
        goto L68
    L28:
        if (this.f506d == null) goto L68;
        if (this.f507e == null) goto L68;
        int r23 = r18.getPointerCount();
        int r33 = 0;
    L33:
        if (r33 >= r23) goto L59;
        int r5 = r18.getPointerId(r33);
        if ((this.f513k & (1 << r5)) == 0) goto L58;
        float r72 = r18.getX(r33);
        float r8 = r18.getY(r33);
        float r9 = r72 - this.f506d[r5];
        float r10 = r8 - this.f507e[r5];
        View r73 = m675g((int) r72, (int) r8);
        if (r73 != null) goto L39;
    L41:
        boolean r82 = false;
    L42:
        if (r82 == false) goto L51;
        int r11 = r73.getLeft();
        AbstractC0040p r132 = this.f519q;
        int r122 = r132.mo133k(r73, ((int) r9) + r11);
        int r14 = r73.getTop();
        int r15 = r132.mo134l(r73, ((int) r10) + r14);
        int r16 = r132.mo136z(r73);
        int r133 = r132.mo120A();
        if (r16 == 0) goto L47;
        if (r16 <= 0) goto L51;
        if (r122 != r11) goto L51;
    L47:
        if (r133 == 0) goto L59;
        if (r133 <= 0) goto L51;
        if (r15 == r14) goto L59;
    L51:
        Math.abs(r9);
        Math.abs(r10);
        int r112 = this.f510h[r5];
        Math.abs(r10);
        Math.abs(r9);
        int r113 = this.f510h[r5];
        Math.abs(r9);
        Math.abs(r10);
        int r114 = this.f510h[r5];
        Math.abs(r10);
        Math.abs(r9);
        int r92 = this.f510h[r5];
        if (this.f503a == 1) goto L59;
        if (r82 == false) goto L58;
        if (m684p(r73, r5) == false) goto L58;
    L39:
        if (m671c(r73, r9, r10) == false) goto L41;
        r82 = true;
    L58:
        r33 = r33 + 1;
    L59:
        m680l(r18);
    L60:
        m669a();
        goto L68
    L61:
        float r24 = r18.getX();
        float r34 = r18.getY();
        int r17 = r18.getPointerId(0);
        m679k(r24, r34, r17);
        View r25 = m675g((int) r24, (int) r34);
        if (r25 == this.f520r) goto L64;
    L66:
        int r19 = this.f510h[r17];
        goto L68
    L64:
        if (this.f503a != 2) goto L66;
        m684p(r25, r17);
        goto L66
    }

    /* JADX INFO: renamed from: p */
    public final boolean m684p(View r3, int r4) {
        if (r3 == this.f520r) goto L5;
    L7:
        if (r3 != null) goto L9;
        return false;
    L9:
        if (this.f519q.mo131d0(r3, r4) == false) goto L14;
        this.f505c = r4;
        m670b(r3, r4);
        return true;
    L14:
        return false;
    L5:
        if (this.f505c != r4) goto L7;
        return true;
    }
}
