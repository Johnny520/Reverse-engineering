package p000;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.youth.banner.config.BannerConfig;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: mE */
/* JADX INFO: loaded from: classes.dex */
public final class C2228mE {

    /* JADX INFO: renamed from: v */
    public static final InterpolatorC0844Tl f7748v = null;

    /* JADX INFO: renamed from: a */
    public int f7749a;

    /* JADX INFO: renamed from: b */
    public final int f7750b;

    /* JADX INFO: renamed from: c */
    public int f7751c;

    /* JADX INFO: renamed from: d */
    public float[] f7752d;

    /* JADX INFO: renamed from: e */
    public float[] f7753e;

    /* JADX INFO: renamed from: f */
    public float[] f7754f;

    /* JADX INFO: renamed from: g */
    public float[] f7755g;

    /* JADX INFO: renamed from: h */
    public int[] f7756h;

    /* JADX INFO: renamed from: i */
    public int[] f7757i;

    /* JADX INFO: renamed from: j */
    public int[] f7758j;

    /* JADX INFO: renamed from: k */
    public int f7759k;

    /* JADX INFO: renamed from: l */
    public VelocityTracker f7760l;

    /* JADX INFO: renamed from: m */
    public final float f7761m;

    /* JADX INFO: renamed from: n */
    public final float f7762n;

    /* JADX INFO: renamed from: o */
    public final int f7763o;

    /* JADX INFO: renamed from: p */
    public final OverScroller f7764p;

    /* JADX INFO: renamed from: q */
    public final AbstractC1293cr f7765q;

    /* JADX INFO: renamed from: r */
    public View f7766r;

    /* JADX INFO: renamed from: s */
    public boolean f7767s;

    /* JADX INFO: renamed from: t */
    public final CoordinatorLayout f7768t;

    /* JADX INFO: renamed from: u */
    public final RunnableC0431K0 f7769u;

    static {
        f7748v = new InterpolatorC0844Tl(3);
    }

    public C2228mE(Context r3, CoordinatorLayout r4, AbstractC1293cr r5) {
        this.f7751c = -1;
        this.f7769u = new RunnableC0431K0(18, this);
        if (r5 == null) goto L7;
        this.f7768t = r4;
        this.f7765q = r5;
        ViewConfiguration r42 = ViewConfiguration.get(r3);
        this.f7763o = (int) ((r3.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f7750b = r42.getScaledTouchSlop();
        this.f7761m = r42.getScaledMaximumFlingVelocity();
        this.f7762n = r42.getScaledMinimumFlingVelocity();
        this.f7764p = new OverScroller(r3, f7748v);
        return;
    L7:
        throw new IllegalArgumentException("Callback may not be null");
    }

    /* JADX INFO: renamed from: a */
    public final void m4486a() {
        this.f7751c = -1;
        float[] r0 = this.f7752d;
        if (r0 == null) goto L6;
        Arrays.fill(r0, 0.0f);
        Arrays.fill(this.f7753e, 0.0f);
        Arrays.fill(this.f7754f, 0.0f);
        Arrays.fill(this.f7755g, 0.0f);
        Arrays.fill(this.f7756h, 0);
        Arrays.fill(this.f7757i, 0);
        Arrays.fill(this.f7758j, 0);
        this.f7759k = 0;
    L6:
        VelocityTracker r02 = this.f7760l;
        if (r02 == null) goto L10;
        r02.recycle();
        this.f7760l = null;
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m4487b(View r3, int r4) {
        ViewParent r0 = r3.getParent();
        CoordinatorLayout r1 = this.f7768t;
        if (r0 != r1) goto L7;
        this.f7766r = r3;
        this.f7751c = r4;
        this.f7765q.mo1386J(r3, r4);
        m4498m(1);
        return;
    L7:
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + r1 + ")");
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4488c(View r4, float r5, float r6) {
        if (r4 == null) goto L26;
        AbstractC1293cr r1 = this.f7765q;
        if (r1.mo1385B(r4) <= 0) goto L8;
        boolean r42 = true;
    L10:
        if (r1.mo2017C() <= 0) goto L12;
        boolean r12 = true;
    L13:
        if (r42 == false) goto L18;
        if (r12 == false) goto L18;
        float r62 = (r6 * r6) + (r5 * r5);
        int r43 = this.f7750b;
        if (r62 <= (r43 * r43)) goto L26;
    L25:
        return true;
    L18:
        if (r42 == true) goto L20;
        if (r12 == false) goto L26;
        if (Math.abs(r6) <= this.f7750b) goto L26;
    L20:
        if (Math.abs(r5) <= this.f7750b) goto L26;
    L12:
        r12 = false;
        goto L13
    L8:
        r42 = false;
    L26:
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m4489d(int r5) {
        float[] r0 = this.f7752d;
        if (r0 == null) goto L8;
        int r1 = this.f7759k;
        int r2 = 1 << r5;
        if ((r1 & r2) == 0) goto L9;
        r0[r5] = 0.0f;
        this.f7753e[r5] = 0.0f;
        this.f7754f[r5] = 0.0f;
        this.f7755g[r5] = 0.0f;
        this.f7756h[r5] = 0;
        this.f7757i[r5] = 0;
        this.f7758j[r5] = 0;
        this.f7759k = (~r2) & r1;
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: e */
    public final int m4490e(int r5, int r6, int r7) {
        if (r5 != 0) goto L5;
        return 0;
    L5:
        float r1 = this.f7768t.getWidth() / 2;
        float r2 = (((float) Math.sin((Math.min(1.0f, Math.abs(r5) / r0) - 0.5f) * 0.47123894f)) * r1) + r1;
        int r62 = Math.abs(r6);
        if (r62 <= 0) goto L8;
        int r52 = Math.round(Math.abs(r2 / r62) * 1000.0f) * 4;
    L10:
        return Math.min(r52, BannerConfig.SCROLL_TIME);
    L8:
        r52 = (int) (((Math.abs(r5) / r7) + 1.0f) * 256.0f);
        goto L10
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4491f() {
        if (this.f7749a != 2) goto L21;
        OverScroller r0 = this.f7764p;
        boolean r3 = r0.computeScrollOffset();
        int r4 = r0.getCurrX();
        int r5 = r0.getCurrY();
        int r6 = r4 - this.f7766r.getLeft();
        int r7 = r5 - this.f7766r.getTop();
        if (r6 == 0) goto L7;
        View r8 = this.f7766r;
        WeakHashMap r9 = AbstractC2185lE.f7617a;
        r8.offsetLeftAndRight(r6);
    L7:
        if (r7 == 0) goto L9;
        View r82 = this.f7766r;
        WeakHashMap r92 = AbstractC2185lE.f7617a;
        r82.offsetTopAndBottom(r7);
    L9:
        if (r6 != 0) goto L11;
        if (r7 != 0) goto L11;
    L12:
        if (r3 == true) goto L14;
    L18:
        if (r3 == true) goto L21;
        this.f7768t.post(this.f7769u);
        goto L21
    L14:
        if (r4 != r0.getFinalX()) goto L18;
        if (r5 != r0.getFinalY()) goto L18;
        r0.abortAnimation();
        r3 = false;
    L11:
        this.f7765q.mo1388L(this.f7766r, r4, r5);
    L21:
        if (this.f7749a != 2) goto L24;
        return true;
    L24:
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final View m4492g(int r5, int r6) {
        CoordinatorLayout r0 = this.f7768t;
        int r1 = r0.getChildCount() - 1;
    L3:
        if (r1 < 0) goto L14;
        this.f7765q.getClass();
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

    /* JADX INFO: renamed from: h */
    public final boolean m4493h(int r11, int r12, int r13, int r14) {
        int r2 = this.f7766r.getLeft();
        int r3 = this.f7766r.getTop();
        int r4 = r11 - r2;
        int r5 = r12 - r3;
        OverScroller r1 = this.f7764p;
        if (r4 != 0) goto L7;
        if (r5 != 0) goto L7;
        r1.abortAnimation();
        m4498m(0);
        return false;
    L7:
        View r122 = this.f7766r;
        int r0 = (int) this.f7762n;
        int r6 = (int) this.f7761m;
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
        r1.startScroll(r2, r3, r4, r5, (int) ((m4490e(r5, r14, r6.mo2017C()) * r04) + (m4490e(r4, r13, this.f7765q.mo1385B(r122)) * r114)));
        m4498m(2);
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

    /* JADX INFO: renamed from: i */
    public final void m4494i(MotionEvent r11) {
        int r0 = r11.getActionMasked();
        int r1 = r11.getActionIndex();
        if (r0 != 0) goto L6;
        m4486a();
    L6:
        if (this.f7760l != null) goto L8;
        this.f7760l = VelocityTracker.obtain();
    L8:
        this.f7760l.addMovement(r11);
        int r2 = 0;
        if (r0 != 0) goto L11;
        float r02 = r11.getX();
        float r12 = r11.getY();
        int r112 = r11.getPointerId(0);
        View r22 = m4492g((int) r02, (int) r12);
        m4496k(r02, r12, r112);
        m4501p(r22, r112);
        int r113 = this.f7756h[r112];
        return;
    L11:
        if (r0 == 1) goto L105;
        AbstractC1293cr r5 = this.f7765q;
        if (r0 == 2) goto L69;
        if (r0 == 3) goto L62;
        if (r0 != 5) goto L19;
        int r03 = r11.getPointerId(r1);
        float r4 = r11.getX(r1);
        float r114 = r11.getY(r1);
        m4496k(r4, r114, r03);
        if (this.f7749a != 0) goto L46;
        m4501p(m4492g((int) r4, (int) r114), r03);
        int r115 = this.f7756h[r03];
        return;
    L46:
        int r13 = (int) r4;
        int r116 = (int) r114;
        View r42 = this.f7766r;
        if (r42 != null) goto L50;
    L58:
        if (r2 == 0) goto L74;
        m4501p(this.f7766r, r03);
        return;
    L74:
        return;
    L50:
        if (r13 < r42.getLeft()) goto L58;
        if (r13 >= r42.getRight()) goto L58;
        if (r116 < r42.getTop()) goto L58;
        if (r116 >= r42.getBottom()) goto L58;
        r2 = 1;
        goto L58
    L19:
        if (r0 != 6) goto L123;
        int r04 = r11.getPointerId(r1);
        if (this.f7749a == 1) goto L24;
    L40:
        m4489d(r04);
        return;
    L24:
        if (r04 != this.f7751c) goto L40;
        int r14 = r11.getPointerCount();
    L27:
        if (r2 >= r14) goto L37;
        int r43 = r11.getPointerId(r2);
        if (r43 == this.f7751c) goto L36;
        View r52 = m4492g((int) r11.getX(r2), (int) r11.getY(r2));
        View r6 = this.f7766r;
        if (r52 != r6) goto L36;
        if (m4501p(r6, r43) == false) goto L36;
        int r117 = this.f7751c;
    L38:
        if (r117 != (-1)) goto L40;
        m4495j();
    L36:
        r2 = r2 + 1;
        goto L27
    L37:
        r117 = -1;
        goto L38
    L123:
        return;
    L62:
        if (this.f7749a != 1) goto L66;
        this.f7767s = true;
        r5.mo1389M(this.f7766r, 0.0f, 0.0f);
        this.f7767s = false;
        if (this.f7749a != 1) goto L66;
        m4498m(0);
    L66:
        m4486a();
        return;
    L69:
        if (this.f7749a != 1) goto L85;
        int r05 = this.f7751c;
        if ((this.f7759k & (1 << r05)) == 0) goto L73;
        r2 = 1;
    L73:
        if (r2 == 0) goto L122;
        int r06 = r11.findPointerIndex(r05);
        float r15 = r11.getX(r06);
        float r07 = r11.getY(r06);
        float[] r23 = this.f7754f;
        int r3 = this.f7751c;
        int r16 = (int) (r15 - r23[r3]);
        int r08 = (int) (r07 - this.f7755g[r3]);
        int r24 = this.f7766r.getLeft() + r16;
        int r32 = this.f7766r.getTop() + r08;
        int r44 = this.f7766r.getLeft();
        int r62 = this.f7766r.getTop();
        if (r16 == 0) goto L78;
        r24 = r5.mo1391j(this.f7766r, r24);
        WeakHashMap r8 = AbstractC2185lE.f7617a;
        this.f7766r.offsetLeftAndRight(r24 - r44);
    L78:
        if (r08 == 0) goto L80;
        r32 = r5.mo1392k(this.f7766r, r32);
        WeakHashMap r7 = AbstractC2185lE.f7617a;
        this.f7766r.offsetTopAndBottom(r32 - r62);
    L80:
        if (r16 != 0) goto L82;
        if (r08 != 0) goto L82;
    L83:
        m4497l(r11);
        return;
    L82:
        r5.mo1388L(this.f7766r, r24, r32);
        goto L83
    L122:
        return;
    L85:
        int r09 = r11.getPointerCount();
        int r17 = 0;
    L86:
        if (r17 >= r09) goto L102;
        int r45 = r11.getPointerId(r17);
        if ((this.f7759k & (1 << r45)) == 0) goto L90;
        boolean r53 = true;
    L91:
        if (r53 == false) goto L101;
        float r54 = r11.getX(r17);
        float r63 = r11.getY(r17);
        float r72 = r54 - this.f7752d[r45];
        float r82 = r63 - this.f7753e[r45];
        Math.abs(r72);
        Math.abs(r82);
        int r9 = this.f7756h[r45];
        Math.abs(r82);
        Math.abs(r72);
        int r92 = this.f7756h[r45];
        Math.abs(r72);
        Math.abs(r82);
        int r93 = this.f7756h[r45];
        Math.abs(r82);
        Math.abs(r72);
        int r94 = this.f7756h[r45];
        if (this.f7749a == 1) goto L102;
        View r55 = m4492g((int) r54, (int) r63);
        if (m4488c(r55, r72, r82) == false) goto L101;
        if (m4501p(r55, r45) == true) goto L102;
    L101:
        r17 = r17 + 1;
        goto L86
    L90:
        r53 = false;
    L102:
        m4497l(r11);
        return;
    L105:
        if (this.f7749a != 1) goto L107;
        m4495j();
    L107:
        m4486a();
    }

    /* JADX INFO: renamed from: j */
    public final void m4495j() {
        VelocityTracker r0 = this.f7760l;
        float r2 = this.f7761m;
        r0.computeCurrentVelocity(1000, r2);
        float r02 = this.f7760l.getXVelocity(this.f7751c);
        float r1 = Math.abs(r02);
        float r3 = this.f7762n;
        if (r1 >= r3) goto L6;
        r02 = 0.0f;
    L11:
        float r12 = this.f7760l.getYVelocity(this.f7751c);
        float r4 = Math.abs(r12);
        if (r4 >= r3) goto L15;
        r2 = 0.0f;
    L21:
        this.f7767s = true;
        this.f7765q.mo1389M(this.f7766r, r02, r2);
        this.f7767s = false;
        if (this.f7749a != 1) goto L25;
        m4498m(0);
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

    /* JADX INFO: renamed from: k */
    public final void m4496k(float r11, float r12, int r13) {
        float[] r0 = this.f7752d;
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
        float[] r02 = this.f7753e;
        System.arraycopy(r02, 0, r4, 0, r02.length);
        float[] r03 = this.f7754f;
        System.arraycopy(r03, 0, r5, 0, r03.length);
        float[] r04 = this.f7755g;
        System.arraycopy(r04, 0, r6, 0, r04.length);
        int[] r05 = this.f7756h;
        System.arraycopy(r05, 0, r7, 0, r05.length);
        int[] r06 = this.f7757i;
        System.arraycopy(r06, 0, r8, 0, r06.length);
        int[] r07 = this.f7758j;
        System.arraycopy(r07, 0, r22, 0, r07.length);
    L9:
        this.f7752d = r3;
        this.f7753e = r4;
        this.f7754f = r5;
        this.f7755g = r6;
        this.f7756h = r7;
        this.f7757i = r8;
        this.f7758j = r22;
    L10:
        float[] r08 = this.f7752d;
        this.f7754f[r13] = r11;
        r08[r13] = r11;
        float[] r09 = this.f7753e;
        this.f7755g[r13] = r12;
        r09[r13] = r12;
        int[] r010 = this.f7756h;
        int r112 = (int) r11;
        int r122 = (int) r12;
        CoordinatorLayout r23 = this.f7768t;
        int r32 = r23.getLeft();
        int r42 = this.f7763o;
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
        this.f7759k |= 1 << r13;
        return;
    L5:
        if (r0.length > r13) goto L10;
        goto L6
    }

    /* JADX INFO: renamed from: l */
    public final void m4497l(MotionEvent r7) {
        int r0 = r7.getPointerCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L8;
        int r2 = r7.getPointerId(r1);
        if ((this.f7759k & (1 << r2)) == 0) goto L7;
        float r3 = r7.getX(r1);
        float r4 = r7.getY(r1);
        this.f7754f[r2] = r3;
        this.f7755g[r2] = r4;
    L7:
        r1 = r1 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: m */
    public final void m4498m(int r3) {
        this.f7768t.removeCallbacks(this.f7769u);
        if (this.f7749a == r3) goto L8;
        this.f7749a = r3;
        this.f7765q.mo1387K(r3);
        if (this.f7749a != 0) goto L9;
        this.f7766r = null;
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m4499n(int r4, int r5) {
        if (this.f7767s == false) goto L7;
        return m4493h(r4, r5, (int) this.f7760l.getXVelocity(this.f7751c), (int) this.f7760l.getYVelocity(this.f7751c));
    L7:
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX INFO: renamed from: o */
    public final boolean m4500o(MotionEvent r18) {
        int r2 = r18.getActionMasked();
        int r3 = r18.getActionIndex();
        if (r2 != 0) goto L6;
        m4486a();
    L6:
        if (this.f7760l != null) goto L8;
        this.f7760l = VelocityTracker.obtain();
    L8:
        this.f7760l.addMovement(r18);
        if (r2 == 0) goto L61;
        if (r2 == 1) goto L60;
        if (r2 == 2) goto L28;
        if (r2 == 3) goto L60;
        if (r2 != 5) goto L17;
        int r22 = r18.getPointerId(r3);
        float r7 = r18.getX(r3);
        float r1 = r18.getY(r3);
        m4496k(r7, r1, r22);
        int r32 = this.f7749a;
        if (r32 != 0) goto L23;
        int r12 = this.f7756h[r22];
    L68:
        if (this.f7749a != 1) goto L70;
        return true;
    L70:
        return false;
    L23:
        if (r32 != 2) goto L68;
        View r13 = m4492g((int) r7, (int) r1);
        if (r13 != this.f7766r) goto L68;
        m4501p(r13, r22);
        goto L68
    L17:
        if (r2 != 6) goto L68;
        m4489d(r18.getPointerId(r3));
        goto L68
    L28:
        if (this.f7752d == null) goto L68;
        if (this.f7753e == null) goto L68;
        int r23 = r18.getPointerCount();
        int r33 = 0;
    L33:
        if (r33 >= r23) goto L59;
        int r4 = r18.getPointerId(r33);
        if ((this.f7759k & (1 << r4)) == 0) goto L58;
        float r72 = r18.getX(r33);
        float r8 = r18.getY(r33);
        float r9 = r72 - this.f7752d[r4];
        float r10 = r8 - this.f7753e[r4];
        View r73 = m4492g((int) r72, (int) r8);
        if (r73 != null) goto L39;
    L41:
        boolean r82 = false;
    L42:
        if (r82 == false) goto L51;
        int r11 = r73.getLeft();
        AbstractC1293cr r132 = this.f7765q;
        int r122 = r132.mo1391j(r73, ((int) r9) + r11);
        int r14 = r73.getTop();
        int r15 = r132.mo1392k(r73, ((int) r10) + r14);
        int r16 = r132.mo1385B(r73);
        int r133 = r132.mo2017C();
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
        int r112 = this.f7756h[r4];
        Math.abs(r10);
        Math.abs(r9);
        int r113 = this.f7756h[r4];
        Math.abs(r9);
        Math.abs(r10);
        int r114 = this.f7756h[r4];
        Math.abs(r10);
        Math.abs(r9);
        int r92 = this.f7756h[r4];
        if (this.f7749a == 1) goto L59;
        if (r82 == false) goto L58;
        if (m4501p(r73, r4) == false) goto L58;
    L39:
        if (m4488c(r73, r9, r10) == false) goto L41;
        r82 = true;
    L58:
        r33 = r33 + 1;
    L59:
        m4497l(r18);
    L60:
        m4486a();
        goto L68
    L61:
        float r24 = r18.getX();
        float r34 = r18.getY();
        int r17 = r18.getPointerId(0);
        m4496k(r24, r34, r17);
        View r25 = m4492g((int) r24, (int) r34);
        if (r25 == this.f7766r) goto L64;
    L66:
        int r19 = this.f7756h[r17];
        goto L68
    L64:
        if (this.f7749a != 2) goto L66;
        m4501p(r25, r17);
        goto L66
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4501p(View r3, int r4) {
        if (r3 == this.f7766r) goto L5;
    L7:
        if (r3 != null) goto L9;
        return false;
    L9:
        if (this.f7765q.mo1390W(r3, r4) == false) goto L14;
        this.f7751c = r4;
        m4487b(r3, r4);
        return true;
    L14:
        return false;
    L5:
        if (this.f7751c != r4) goto L7;
        return true;
    }
}
