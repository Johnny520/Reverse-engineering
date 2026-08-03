package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import p000.AbstractC1293cr;
import p000.AbstractC2730xt;
import p000.C0038Av;
import p000.C0116Cn;
import p000.C0161Dp;
import p000.C0299Gy;
import p000.C0729Qy;
import p000.C0771Ry;
import p000.C0814Sy;
import p000.C0857Ty;
import p000.C2201lo;
import p000.C2388pv;
import p000.C2431qv;
import p000.InterfaceC2337ov;
import p000.InterfaceC2818zv;
import p000.RunnableC0431K0;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC1160i implements InterfaceC2818zv {

    /* JADX INFO: renamed from: a */
    public final int f3989a;

    /* JADX INFO: renamed from: b */
    public final C0161Dp[] f3990b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2730xt f3991c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2730xt f3992d;

    /* JADX INFO: renamed from: e */
    public final int f3993e;

    /* JADX INFO: renamed from: f */
    public int f3994f;

    /* JADX INFO: renamed from: g */
    public final C0116Cn f3995g;

    /* JADX INFO: renamed from: h */
    public boolean f3996h;

    /* JADX INFO: renamed from: i */
    public boolean f3997i;

    /* JADX INFO: renamed from: j */
    public final BitSet f3998j;

    /* JADX INFO: renamed from: k */
    public int f3999k;

    /* JADX INFO: renamed from: l */
    public int f4000l;

    /* JADX INFO: renamed from: m */
    public final C0299Gy f4001m;

    /* JADX INFO: renamed from: n */
    public final int f4002n;

    /* JADX INFO: renamed from: o */
    public boolean f4003o;

    /* JADX INFO: renamed from: p */
    public boolean f4004p;

    /* JADX INFO: renamed from: q */
    public C0857Ty f4005q;

    /* JADX INFO: renamed from: r */
    public final Rect f4006r;

    /* JADX INFO: renamed from: s */
    public final C0729Qy f4007s;

    /* JADX INFO: renamed from: t */
    public final boolean f4008t;

    /* JADX INFO: renamed from: u */
    public int[] f4009u;

    /* JADX INFO: renamed from: v */
    public final RunnableC0431K0 f4010v;

    public StaggeredGridLayoutManager(Context r6, AttributeSet r7, int r8, int r9) {
        this.f3989a = -1;
        this.f3996h = false;
        this.f3997i = false;
        this.f3999k = -1;
        this.f4000l = Integer.MIN_VALUE;
        C0299Gy r0 = new C0299Gy();
        this.f4001m = r0;
        this.f4002n = 2;
        this.f4006r = new Rect();
        this.f4007s = new C0729Qy(this);
        this.f4008t = true;
        this.f4010v = new RunnableC0431K0(14, this);
        C2388pv r62 = AbstractC1160i.getProperties(r6, r7, r8, r9);
        int r72 = r62.f8388a;
        if (r72 == 0) goto L8;
        if (r72 == 1) goto L8;
        throw new IllegalArgumentException("invalid orientation.");
    L8:
        assertNotInLayoutOrScroll(null);
        if (r72 == this.f3993e) goto L12;
        this.f3993e = r72;
        AbstractC2730xt r73 = this.f3991c;
        this.f3991c = this.f3992d;
        this.f3992d = r73;
        requestLayout();
    L12:
        int r74 = r62.f8389b;
        assertNotInLayoutOrScroll(null);
        if (r74 == this.f3989a) goto L19;
        r0.m634a();
        requestLayout();
        this.f3989a = r74;
        this.f3998j = new BitSet(this.f3989a);
        this.f3990b = new C0161Dp[this.f3989a];
        int r75 = 0;
    L16:
        if (r75 >= this.f3989a) goto L18;
        this.f3990b[r75] = new C0161Dp(this, r75);
        r75 = r75 + 1;
        goto L16
    L18:
        requestLayout();
    L19:
        boolean r63 = r62.f8390c;
        assertNotInLayoutOrScroll(null);
        C0857Ty r76 = this.f4005q;
        if (r76 != null) goto L22;
    L24:
        this.f3996h = r63;
        requestLayout();
        C0116Cn r64 = new C0116Cn();
        r64.f276a = true;
        r64.f281f = 0;
        r64.f282g = 0;
        this.f3995g = r64;
        this.f3991c = AbstractC2730xt.m5296a(this, this.f3993e);
        this.f3992d = AbstractC2730xt.m5296a(this, 1 - this.f3993e);
        return;
    L22:
        if (r76.f2717h == r63) goto L24;
        r76.f2717h = r63;
        goto L24
    }

    /* JADX INFO: renamed from: B */
    public static int m2191B(int r2, int r3, int r4) {
        if (r3 != 0) goto L5;
        if (r4 != 0) goto L5;
    L10:
        return r2;
    L5:
        int r0 = View.MeasureSpec.getMode(r2);
        if (r0 == Integer.MIN_VALUE) goto L12;
        if (r0 != 1073741824) goto L10;
    L12:
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(r2) - r3) - r4), r0);
    }

    /* JADX INFO: renamed from: A */
    public final void m2192A(C0161Dp r6, int r7, int r8) {
        int r0 = r6.f440d;
        int r1 = r6.f441e;
        if (r7 != (-1)) goto L12;
        int r72 = r6.f438b;
        if (r72 != Integer.MIN_VALUE) goto L9;
        View r73 = (View) ((ArrayList) r6.f442f).get(0);
        C0771Ry r2 = (C0771Ry) r73.getLayoutParams();
        r6.f438b = ((StaggeredGridLayoutManager) r6.f443g).f3991c.mo5254e(r73);
        r2.getClass();
        r72 = r6.f438b;
    L9:
        if ((r72 + r0) > r8) goto L20;
        this.f3998j.set(r1, false);
        return;
    L20:
        return;
    L12:
        int r74 = r6.f439c;
        if (r74 != Integer.MIN_VALUE) goto L17;
        r6.m302a();
        r74 = r6.f439c;
    L17:
        if ((r74 - r0) < r8) goto L21;
        this.f3998j.set(r1, false);
        return;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void assertNotInLayoutOrScroll(String r2) {
        if (this.f4005q != null) goto L6;
        super.assertNotInLayoutOrScroll(r2);
        return;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean canScrollHorizontally() {
        if (this.f3993e != 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean canScrollVertically() {
        if (this.f3993e != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean checkLayoutParams(C2431qv r1) {
        return r1 instanceof C0771Ry;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void collectAdjacentPrefetchPositions(int r5, int r6, C0038Av r7, InterfaceC2337ov r8) {
        if (this.f3993e == 0) goto L7;
        r5 = r6;
    L7:
        if (getChildCount() == 0) goto L33;
        if (r5 == 0) goto L40;
        m2209t(r5, r7);
        int[] r52 = this.f4009u;
        if (r52 != null) goto L13;
    L14:
        this.f4009u = new int[this.f3989a];
    L15:
        int r53 = 0;
        int r62 = 0;
        int r0 = 0;
    L16:
        int r1 = this.f3989a;
        C0116Cn r2 = this.f3995g;
        if (r62 >= r1) goto L26;
        if (r2.f279d != (-1)) goto L22;
        int r12 = r2.f281f;
        int r22 = this.f3990b[r62].m310i(r12);
    L21:
        int r13 = r12 - r22;
        if (r13 < 0) goto L25;
        this.f4009u[r0] = r13;
        r0 = r0 + 1;
    L25:
        r62 = r62 + 1;
        goto L16
    L22:
        r12 = this.f3990b[r62].m308g(r2.f282g);
        r22 = r2.f282g;
        goto L21
    L26:
        Arrays.sort(this.f4009u, 0, r0);
    L27:
        if (r53 >= r0) goto L41;
        int r63 = r2.f278c;
        if (r63 < 0) goto L42;
        if (r63 >= r7.m58b()) goto L43;
        ((C1154c) r8).m2239a(r2.f278c, this.f4009u[r53]);
        r2.f278c += r2.f279d;
        r53 = r53 + 1;
        goto L27
    L43:
        return;
    L42:
        return;
    L41:
        return;
    L13:
        if (r52.length >= this.f3989a) goto L15;
    L40:
        return;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeHorizontalScrollExtent(C0038Av r8) {
        if (getChildCount() != 0) goto L6;
        return 0;
    L6:
        boolean r0 = !this.f4008t;
        return AbstractC1293cr.m2552m(r8, this.f3991c, m2197h(r0), m2196g(r0), this, this.f4008t);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeHorizontalScrollOffset(C0038Av r1) {
        return m2194e(r1);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeHorizontalScrollRange(C0038Av r8) {
        if (getChildCount() != 0) goto L6;
        return 0;
    L6:
        boolean r0 = !this.f4008t;
        return AbstractC1293cr.m2554o(r8, this.f3991c, m2197h(r0), m2196g(r0), this, this.f4008t);
    }

    @Override // p000.InterfaceC2818zv
    public final PointF computeScrollVectorForPosition(int r4) {
        int r1 = -1;
        if (getChildCount() != 0) goto L8;
        if (this.f3997i == false) goto L13;
    L6:
        r1 = 1;
    L13:
        PointF r42 = new PointF();
        if (r1 != 0) goto L18;
        return null;
    L18:
        if (this.f3993e != 0) goto L21;
        r42.x = r1;
        r42.y = 0.0f;
        return r42;
    L21:
        r42.x = 0.0f;
        r42.y = r1;
        return r42;
    L8:
        if (r4 >= m2200k()) goto L10;
        boolean r43 = true;
    L12:
        if (r43 == this.f3997i) goto L6;
    L10:
        r43 = false;
        goto L12
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeVerticalScrollExtent(C0038Av r8) {
        if (getChildCount() != 0) goto L6;
        return 0;
    L6:
        boolean r0 = !this.f4008t;
        return AbstractC1293cr.m2552m(r8, this.f3991c, m2197h(r0), m2196g(r0), this, this.f4008t);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeVerticalScrollOffset(C0038Av r1) {
        return m2194e(r1);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeVerticalScrollRange(C0038Av r8) {
        if (getChildCount() != 0) goto L6;
        return 0;
    L6:
        boolean r0 = !this.f4008t;
        return AbstractC1293cr.m2554o(r8, this.f3991c, m2197h(r0), m2196g(r0), this, this.f4008t);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2193d() {
        if (getChildCount() != 0) goto L5;
    L18:
        return false;
    L5:
        if (this.f4002n == 0) goto L18;
        if (isAttachedToWindow() == false) goto L18;
        if (this.f3997i == false) goto L12;
        int r0 = m2201l();
        m2200k();
    L13:
        if (r0 != 0) goto L18;
        if (m2205p() == null) goto L18;
        this.f4001m.m634a();
        requestSimpleAnimationsInNextLayout();
        requestLayout();
        return true;
    L12:
        r0 = m2200k();
        m2201l();
        goto L13
    }

    /* JADX INFO: renamed from: e */
    public final int m2194e(C0038Av r9) {
        if (getChildCount() != 0) goto L6;
        return 0;
    L6:
        boolean r0 = !this.f4008t;
        return AbstractC1293cr.m2553n(r9, this.f3991c, m2197h(r0), m2196g(r0), this, this.f4008t, this.f3997i);
    }

    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    /* JADX INFO: renamed from: f */
    public final int m2195f(C1161j r21, C0116Cn r22, C0038Av r23) {
        StaggeredGridLayoutManager r0 = this;
        int r8 = 0;
        int r9 = 1;
        r0.f3998j.set(0, r0.f3989a, true);
        C0116Cn r10 = r0.f3995g;
        if (r10.f284i == false) goto L9;
        if (r22.f280e != 1) goto L7;
        int r13 = Integer.MAX_VALUE;
    L13:
        int r1 = r22.f280e;
        int r2 = 0;
    L15:
        if (r2 >= r0.f3989a) goto L22;
        if (((ArrayList) r0.f3990b[r2].f442f).isEmpty() == true) goto L20;
        r0.m2192A(r0.f3990b[r2], r1, r13);
    L20:
        r2 = r2 + 1;
        goto L15
    L22:
        if (r0.f3997i == false) goto L25;
        int r12 = r0.f3991c.mo5256g();
    L24:
        int r14 = r12;
        boolean r15 = false;
    L27:
        int r24 = r22.f278c;
        int r3 = -1;
        if (r24 < 0) goto L113;
        if (r24 >= r23.m58b()) goto L113;
        if (r10.f284i == false) goto L34;
    L35:
        View r16 = r21.m2258d(r22.f278c);
        r22.f278c += r22.f279d;
        C0771Ry r25 = (C0771Ry) r16.getLayoutParams();
        int r4 = r25.f8526a.getLayoutPosition();
        C0299Gy r5 = r0.f4001m;
        int[] r152 = (int[]) r5.f1012b;
        if (r152 != null) goto L38;
    L41:
        int r122 = -1;
    L42:
        if (r122 == (-1)) goto L44;
        C0161Dp r32 = r0.f3990b[r122];
    L63:
        C0161Dp r82 = r32;
        r25.f2444e = r82;
        if (r22.f280e != 1) goto L68;
        r0.addView(r16);
        ?? r33 = 0;
    L70:
        if (r0.f3993e != 1) goto L72;
        r0.m2206q(r16, AbstractC1160i.getChildMeasureSpec(r0.f3994f, r0.getWidthMode(), r33, ((ViewGroup.MarginLayoutParams) r25).width, r33), AbstractC1160i.getChildMeasureSpec(r0.getHeight(), r0.getHeightMode(), r0.getPaddingBottom() + r0.getPaddingTop(), ((ViewGroup.MarginLayoutParams) r25).height, true));
    L74:
        if (r22.f280e != 1) goto L76;
        int r34 = r82.m308g(r14);
        int r42 = r0.f3991c.mo5252c(r16) + r34;
    L78:
        if (r22.f280e != 1) goto L88;
        C0161Dp r26 = r25.f2444e;
        r26.getClass();
        C0771Ry r52 = (C0771Ry) r16.getLayoutParams();
        r52.f2444e = r26;
        ArrayList r11 = (ArrayList) r26.f442f;
        r11.add(r16);
        r26.f439c = Integer.MIN_VALUE;
        if (r11.size() != 1) goto L83;
        r26.f438b = Integer.MIN_VALUE;
    L83:
        if (r52.f8526a.isRemoved() == false) goto L85;
    L86:
        r26.f440d = ((StaggeredGridLayoutManager) r26.f443g).f3991c.mo5252c(r16) + r26.f440d;
    L97:
        if (r0.isLayoutRTL() == true) goto L99;
    L102:
        int r53 = r0.f3992d.mo5260k() + (r82.f441e * r0.f3994f);
        int r27 = r0.f3992d.mo5252c(r16) + r53;
    L101:
        int r19 = r53;
        int r54 = r27;
        if (r0.f3993e != 1) goto L106;
        r0.layoutDecoratedWithMargins(r16, r19, r34, r54, r42);
        r0 = this;
    L107:
        r0.m2192A(r82, r10.f280e, r13);
        r0.m2210u(r21, r10);
        if (r10.f283h == false) goto L112;
        if (r16.hasFocusable() == false) goto L112;
        r0.f3998j.set(r82.f441e, false);
    L112:
        r15 = true;
        r9 = 1;
        r8 = 0;
        goto L27
    L106:
        r0.layoutDecoratedWithMargins(r16, r34, r19, r42, r54);
        goto L107
    L99:
        if (r0.f3993e != 1) goto L102;
        r27 = r0.f3992d.mo5256g() - (((r0.f3989a - 1) - r82.f441e) * r0.f3994f);
        r53 = r27 - r0.f3992d.mo5252c(r16);
        goto L101
    L85:
        if (r52.f8526a.isUpdated() == false) goto L97;
    L88:
        C0161Dp r28 = r25.f2444e;
        r28.getClass();
        C0771Ry r55 = (C0771Ry) r16.getLayoutParams();
        r55.f2444e = r28;
        ArrayList r92 = (ArrayList) r28.f442f;
        r92.add(0, r16);
        r28.f438b = Integer.MIN_VALUE;
        if (r92.size() != 1) goto L92;
        r28.f439c = Integer.MIN_VALUE;
    L92:
        if (r55.f8526a.isRemoved() == false) goto L94;
    L95:
        r28.f440d = ((StaggeredGridLayoutManager) r28.f443g).f3991c.mo5252c(r16) + r28.f440d;
        goto L97
    L94:
        if (r55.f8526a.isUpdated() == false) goto L97;
    L76:
        r42 = r82.m310i(r14);
        r34 = r42 - r0.f3991c.mo5252c(r16);
        goto L78
    L72:
        r0.m2206q(r16, AbstractC1160i.getChildMeasureSpec(r0.getWidth(), r0.getWidthMode(), r0.getPaddingRight() + r0.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) r25).width, true), AbstractC1160i.getChildMeasureSpec(r0.f3994f, r0.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) r25).height, false));
        goto L74
    L68:
        r33 = 0;
        r0.addView(r16, 0);
        goto L70
    L44:
        if (r0.m2208s(r22.f280e) == false) goto L46;
        int r153 = r0.f3989a - r9;
        int r123 = -1;
    L47:
        C0161Dp r162 = null;
        if (r22.f280e != r9) goto L56;
        int r112 = r0.f3991c.mo5260k();
        int r83 = Integer.MAX_VALUE;
    L50:
        if (r153 == r3) goto L55;
        C0161Dp r93 = r0.f3990b[r153];
        int r18 = r123;
        int r124 = r93.m308g(r112);
        if (r124 >= r83) goto L54;
        r162 = r93;
        r83 = r124;
    L54:
        r153 = r153 + r18;
        r123 = r18;
    L55:
        r32 = r162;
        r5.m637d(r4);
        ((int[]) r5.f1012b)[r4] = r32.f441e;
        goto L63
    L56:
        int r182 = r123;
        int r84 = r0.f3991c.mo5256g();
        int r94 = Integer.MIN_VALUE;
    L57:
        if (r153 == r3) goto L55;
        C0161Dp r113 = r0.f3990b[r153];
        int r125 = r113.m310i(r84);
        if (r125 <= r94) goto L61;
        r162 = r113;
        r94 = r125;
    L61:
        r153 = r153 + r182;
        goto L57
    L46:
        r3 = r0.f3989a;
        r153 = r8;
        r123 = r9;
        goto L47
    L38:
        if (r4 >= r152.length) goto L41;
        r122 = r152[r4];
        goto L42
    L34:
        if (r0.f3998j.isEmpty() == false) goto L35;
    L113:
        if (r15 == true) goto L116;
        r0.m2210u(r21, r10);
    L116:
        if (r10.f280e != (-1)) goto L118;
        int r29 = r0.f3991c.mo5260k() - r0.m2203n(r0.f3991c.mo5260k());
    L119:
        if (r29 > 0) goto L121;
        return 0;
    L121:
        return Math.min(r22.f277b, r29);
    L118:
        r29 = r0.m2202m(r0.f3991c.mo5256g()) - r0.f3991c.mo5256g();
        goto L119
    L25:
        r12 = r0.f3991c.mo5260k();
        goto L24
    L7:
        r13 = Integer.MIN_VALUE;
        goto L13
    L9:
        if (r22.f280e != 1) goto L12;
        int r17 = r22.f282g + r22.f277b;
    L11:
        r13 = r17;
        goto L13
    L12:
        r17 = r22.f281f - r22.f277b;
        goto L11
    }

    /* JADX INFO: renamed from: g */
    public final View m2196g(boolean r8) {
        int r0 = this.f3991c.mo5260k();
        int r1 = this.f3991c.mo5256g();
        int r2 = getChildCount() - 1;
        View r3 = null;
    L3:
        if (r2 < 0) goto L15;
        View r4 = getChildAt(r2);
        int r5 = this.f3991c.mo5254e(r4);
        int r6 = this.f3991c.mo5251b(r4);
        if (r6 <= r0) goto L14;
        if (r5 >= r1) goto L14;
        if (r6 <= r1) goto L13;
        if (r8 == false) goto L13;
        if (r3 != null) goto L14;
        r3 = r4;
    L13:
        return r4;
    L14:
        r2 = r2 - 1;
        goto L3
    L15:
        return r3;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final C2431qv generateDefaultLayoutParams() {
        if (this.f3993e != 0) goto L7;
        return new C0771Ry(-2, -1);
    L7:
        return new C0771Ry(-1, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final C2431qv generateLayoutParams(Context r2, AttributeSet r3) {
        return new C0771Ry(r2, r3);
    }

    /* JADX INFO: renamed from: h */
    public final View m2197h(boolean r9) {
        int r0 = this.f3991c.mo5260k();
        int r1 = this.f3991c.mo5256g();
        int r2 = getChildCount();
        View r3 = null;
        int r4 = 0;
    L3:
        if (r4 >= r2) goto L15;
        View r5 = getChildAt(r4);
        int r6 = this.f3991c.mo5254e(r5);
        if (this.f3991c.mo5251b(r5) <= r0) goto L14;
        if (r6 >= r1) goto L14;
        if (r6 >= r0) goto L13;
        if (r9 == false) goto L13;
        if (r3 != null) goto L14;
        r3 = r5;
    L13:
        return r5;
    L14:
        r4 = r4 + 1;
        goto L3
    L15:
        return r3;
    }

    /* JADX INFO: renamed from: i */
    public final void m2198i(C1161j r3, C0038Av r4, boolean r5) {
        int r1 = m2202m(Integer.MIN_VALUE);
        if (r1 == Integer.MIN_VALUE) goto L15;
        int r0 = this.f3991c.mo5256g() - r1;
        if (r0 <= 0) goto L12;
        int r02 = r0 - (-scrollBy(-r0, r3, r4));
        if (r5 == false) goto L13;
        if (r02 <= 0) goto L14;
        this.f3991c.mo5264o(r02);
        return;
    L14:
        return;
    L13:
        return;
    L12:
        return;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean isAutoMeasureEnabled() {
        if (this.f4002n == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean isLayoutRTL() {
        if (getLayoutDirection() != 1) goto L5;
        return true;
    L5:
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final void m2199j(C1161j r3, C0038Av r4, boolean r5) {
        int r1 = m2203n(Integer.MAX_VALUE);
        if (r1 == Integer.MAX_VALUE) goto L15;
        int r12 = r1 - this.f3991c.mo5260k();
        if (r12 <= 0) goto L12;
        int r13 = r12 - scrollBy(r12, r3, r4);
        if (r5 == false) goto L13;
        if (r13 <= 0) goto L14;
        this.f3991c.mo5264o(-r13);
        return;
    L14:
        return;
    L13:
        return;
    L12:
        return;
    }

    /* JADX INFO: renamed from: k */
    public final int m2200k() {
        if (getChildCount() != 0) goto L6;
        return 0;
    L6:
        return getPosition(getChildAt(0));
    }

    /* JADX INFO: renamed from: l */
    public final int m2201l() {
        int r0 = getChildCount();
        if (r0 != 0) goto L7;
        return 0;
    L7:
        return getPosition(getChildAt(r0 - 1));
    }

    /* JADX INFO: renamed from: m */
    public final int m2202m(int r4) {
        int r0 = this.f3990b[0].m308g(r4);
        int r1 = 1;
    L4:
        if (r1 >= this.f3989a) goto L9;
        int r2 = this.f3990b[r1].m308g(r4);
        if (r2 <= r0) goto L8;
        r0 = r2;
    L8:
        r1 = r1 + 1;
        goto L4
    L9:
        return r0;
    }

    /* JADX INFO: renamed from: n */
    public final int m2203n(int r4) {
        int r0 = this.f3990b[0].m310i(r4);
        int r1 = 1;
    L4:
        if (r1 >= this.f3989a) goto L9;
        int r2 = this.f3990b[r1].m310i(r4);
        if (r2 >= r0) goto L8;
        r0 = r2;
    L8:
        r1 = r1 + 1;
        goto L4
    L9:
        return r0;
    }

    /* JADX INFO: renamed from: o */
    public final void m2204o(int r10, int r11, int r12) {
        if (this.f3997i == false) goto L5;
        int r0 = m2201l();
    L7:
        if (r12 != 8) goto L12;
        if (r10 >= r11) goto L11;
        int r2 = r11 + 1;
    L10:
        int r3 = r10;
    L13:
        C0299Gy r4 = this.f4001m;
        int[] r5 = (int[]) r4.f1012b;
        if (r5 == null) goto L46;
        if (r3 >= r5.length) goto L46;
        ArrayList r52 = (ArrayList) r4.f1013c;
        if (r52 != null) goto L22;
    L21:
        int r53 = -1;
    L42:
        if (r53 != (-1)) goto L44;
        int[] r54 = (int[]) r4.f1012b;
        Arrays.fill(r54, r3, r54.length, -1);
        int r55 = ((int[]) r4.f1012b).length;
        goto L46
    L44:
        Arrays.fill((int[]) r4.f1012b, r3, Math.min(r53 + 1, ((int[]) r4.f1012b).length), -1);
        goto L46
    L22:
        if (r52 == null) goto L30;
        int r56 = r52.size() - 1;
    L25:
        if (r56 < 0) goto L30;
        C0814Sy r7 = (C0814Sy) ((ArrayList) r4.f1013c).get(r56);
        if (r7.f2579a == r3) goto L31;
        r56 = r56 - 1;
    L31:
        if (r7 == null) goto L33;
        ((ArrayList) r4.f1013c).remove(r7);
    L33:
        int r57 = ((ArrayList) r4.f1013c).size();
        int r72 = 0;
    L34:
        if (r72 >= r57) goto L39;
        if (((C0814Sy) ((ArrayList) r4.f1013c).get(r72)).f2579a >= r3) goto L40;
        r72 = r72 + 1;
    L40:
        if (r72 == (-1)) goto L21;
        C0814Sy r58 = (C0814Sy) ((ArrayList) r4.f1013c).get(r72);
        ((ArrayList) r4.f1013c).remove(r72);
        r53 = r58.f2579a;
        goto L42
    L39:
        r72 = -1;
    L30:
        r7 = null;
    L46:
        if (r12 != 1) goto L48;
        r4.m640g(r10, r11);
    L54:
        if (r2 > r0) goto L57;
        return;
    L57:
        if (this.f3997i == false) goto L59;
        int r102 = m2200k();
    L60:
        if (r3 > r102) goto L67;
        requestLayout();
        return;
    L67:
        return;
    L59:
        r102 = m2201l();
        goto L60
    L48:
        if (r12 == 2) goto L52;
        if (r12 != 8) goto L54;
        r4.m641h(r10, 1);
        r4.m640g(r11, 1);
        goto L54
    L52:
        r4.m641h(r10, r11);
        goto L54
    L11:
        r2 = r10 + 1;
        r3 = r11;
        goto L13
    L12:
        r2 = r10 + r11;
        goto L10
    L5:
        r0 = m2200k();
        goto L7
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void offsetChildrenHorizontal(int r5) {
        super.offsetChildrenHorizontal(r5);
        int r0 = 0;
    L4:
        if (r0 >= this.f3989a) goto L12;
        C0161Dp r1 = this.f3990b[r0];
        int r2 = r1.f438b;
        if (r2 == Integer.MIN_VALUE) goto L8;
        r1.f438b = r2 + r5;
    L8:
        int r22 = r1.f439c;
        if (r22 == Integer.MIN_VALUE) goto L11;
        r1.f439c = r22 + r5;
    L11:
        r0 = r0 + 1;
        goto L4
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void offsetChildrenVertical(int r5) {
        super.offsetChildrenVertical(r5);
        int r0 = 0;
    L4:
        if (r0 >= this.f3989a) goto L12;
        C0161Dp r1 = this.f3990b[r0];
        int r2 = r1.f438b;
        if (r2 == Integer.MIN_VALUE) goto L8;
        r1.f438b = r2 + r5;
    L8:
        int r22 = r1.f439c;
        if (r22 == Integer.MIN_VALUE) goto L11;
        r1.f439c = r22 + r5;
    L11:
        r0 = r0 + 1;
        goto L4
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onAdapterChanged(AbstractC1158g r1, AbstractC1158g r2) {
        this.f4001m.m634a();
        int r12 = 0;
    L4:
        if (r12 >= this.f3989a) goto L6;
        this.f3990b[r12].m303b();
        r12 = r12 + 1;
        goto L4
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onDetachedFromWindow(RecyclerView r2, C1161j r3) {
        onDetachedFromWindow(r2);
        removeCallbacks(this.f4010v);
        int r32 = 0;
    L4:
        if (r32 >= this.f3989a) goto L6;
        this.f3990b[r32].m303b();
        r32 = r32 + 1;
        goto L4
    L6:
        r2.requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final View onFocusSearchFailed(View r9, int r10, C1161j r11, C0038Av r12) {
        if (getChildCount() != 0) goto L5;
        return null;
    L5:
        View r92 = findContainingItemView(r9);
        if (r92 != null) goto L8;
        return null;
    L8:
        m2213x();
        if (r10 == 1) goto L40;
        if (r10 == 2) goto L34;
        if (r10 == 17) goto L31;
        if (r10 == 33) goto L28;
        if (r10 == 66) goto L25;
        if (r10 == 130) goto L22;
    L20:
        int r102 = Integer.MIN_VALUE;
    L45:
        if (r102 != Integer.MIN_VALUE) goto L47;
        return null;
    L47:
        C0771Ry r0 = (C0771Ry) r92.getLayoutParams();
        r0.getClass();
        C0161Dp r02 = r0.f2444e;
        if (r102 != 1) goto L50;
        int r4 = m2201l();
    L51:
        m2215z(r4, r12);
        m2214y(r102);
        C0116Cn r5 = this.f3995g;
        r5.f278c = r5.f279d + r4;
        r5.f277b = (int) (this.f3991c.mo5261l() * 0.33333334f);
        r5.f283h = true;
        int r6 = 0;
        r5.f276a = false;
        m2195f(r11, r5, r12);
        this.f4003o = this.f3997i;
        View r112 = r02.m309h(r4, r102);
        if (r112 == null) goto L56;
        if (r112 == r92) goto L56;
        return r112;
    L56:
        if (m2208s(r102) == false) goto L64;
        int r113 = this.f3989a - 1;
    L58:
        if (r113 < 0) goto L72;
        View r122 = this.f3990b[r113].m309h(r4, r102);
        if (r122 == null) goto L63;
        if (r122 == r92) goto L63;
        return r122;
    L63:
        r113 = r113 - 1;
    L72:
        boolean r114 = !this.f3996h;
        if (r102 != (-1)) goto L75;
        boolean r123 = true;
    L76:
        if (r114 != r123) goto L78;
        boolean r115 = true;
    L79:
        if (r115 == false) goto L81;
        int r124 = r02.m304c();
    L82:
        View r125 = findViewByPosition(r124);
        if (r125 == null) goto L87;
        if (r125 == r92) goto L87;
        return r125;
    L87:
        if (m2208s(r102) == false) goto L102;
        int r103 = this.f3989a - 1;
    L89:
        if (r103 < 0) goto L111;
        if (r103 == r02.f441e) goto L100;
        if (r115 == false) goto L95;
        int r126 = this.f3990b[r103].m304c();
    L96:
        View r127 = findViewByPosition(r126);
        if (r127 == null) goto L100;
        if (r127 == r92) goto L100;
        return r127;
    L95:
        r126 = this.f3990b[r103].m305d();
    L100:
        r103 = r103 - 1;
    L111:
        return null;
    L102:
        if (r6 >= this.f3989a) goto L111;
        if (r115 == false) goto L105;
        int r104 = this.f3990b[r6].m304c();
    L106:
        View r105 = findViewByPosition(r104);
        if (r105 == null) goto L110;
        if (r105 == r92) goto L110;
        return r105;
    L110:
        r6 = r6 + 1;
        goto L102
    L105:
        r104 = this.f3990b[r6].m305d();
        goto L106
    L81:
        r124 = r02.m305d();
        goto L82
    L78:
        r115 = false;
        goto L79
    L75:
        r123 = false;
        goto L76
    L64:
        int r116 = 0;
    L66:
        if (r116 >= this.f3989a) goto L72;
        View r128 = this.f3990b[r116].m309h(r4, r102);
        if (r128 == null) goto L71;
        if (r128 == r92) goto L71;
        return r128;
    L71:
        r116 = r116 + 1;
        goto L66
    L50:
        r4 = m2200k();
        goto L51
    L22:
        if (this.f3993e != 1) goto L20;
    L23:
        r102 = 1;
        goto L45
    L25:
        if (this.f3993e != 0) goto L20;
    L28:
        if (this.f3993e != 1) goto L20;
    L29:
        r102 = -1;
        goto L45
    L31:
        if (this.f3993e != 0) goto L20;
    L34:
        if (this.f3993e == 1) goto L23;
        if (isLayoutRTL() == false) goto L23;
    L40:
        if (this.f3993e == 1) goto L29;
        if (isLayoutRTL() == false) goto L29;
        goto L29
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onInitializeAccessibilityEvent(AccessibilityEvent r3) {
        super.onInitializeAccessibilityEvent(r3);
        if (getChildCount() <= 0) goto L14;
        View r1 = m2197h(false);
        View r0 = m2196g(false);
        if (r1 == null) goto L15;
        if (r0 == null) goto L16;
        int r12 = getPosition(r1);
        int r02 = getPosition(r0);
        if (r12 >= r02) goto L12;
        r3.setFromIndex(r12);
        r3.setToIndex(r02);
        return;
    L12:
        r3.setFromIndex(r02);
        r3.setToIndex(r12);
        return;
    L16:
        return;
    L15:
        return;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsAdded(RecyclerView r1, int r2, int r3) {
        m2204o(r2, r3, 1);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsChanged(RecyclerView r1) {
        this.f4001m.m634a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsMoved(RecyclerView r1, int r2, int r3, int r4) {
        m2204o(r2, r3, 8);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsRemoved(RecyclerView r1, int r2, int r3) {
        m2204o(r2, r3, 2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsUpdated(RecyclerView r1, int r2, int r3, Object r4) {
        m2204o(r2, r3, 4);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onLayoutChildren(C1161j r2, C0038Av r3) {
        m2207r(r2, r3, true);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onLayoutCompleted(C0038Av r1) {
        this.f3999k = -1;
        this.f4000l = Integer.MIN_VALUE;
        this.f4005q = null;
        this.f4007s.m1517a();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onRestoreInstanceState(Parcelable r3) {
        if ((r3 instanceof C0857Ty) == false) goto L9;
        C0857Ty r32 = (C0857Ty) r3;
        this.f4005q = r32;
        if (this.f3999k == (-1)) goto L7;
        r32.f2710a = -1;
        r32.f2711b = -1;
        r32.f2713d = null;
        r32.f2712c = 0;
        r32.f2714e = 0;
        r32.f2715f = null;
        r32.f2716g = null;
    L7:
        requestLayout();
        return;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final Parcelable onSaveInstanceState() {
        C0857Ty r0 = this.f4005q;
        if (r0 == null) goto L6;
        C0857Ty r1 = new C0857Ty();
        r1.f2712c = r0.f2712c;
        r1.f2710a = r0.f2710a;
        r1.f2711b = r0.f2711b;
        r1.f2713d = r0.f2713d;
        r1.f2714e = r0.f2714e;
        r1.f2715f = r0.f2715f;
        r1.f2717h = r0.f2717h;
        r1.f2718i = r0.f2718i;
        r1.f2719j = r0.f2719j;
        r1.f2716g = r0.f2716g;
        return r1;
    L6:
        C0857Ty r02 = new C0857Ty();
        r02.f2717h = this.f3996h;
        r02.f2718i = this.f4003o;
        r02.f2719j = this.f4004p;
        int r12 = 0;
        C0299Gy r2 = this.f4001m;
        if (r2 == null) goto L11;
        int[] r3 = (int[]) r2.f1012b;
        if (r3 == null) goto L11;
        r02.f2715f = r3;
        r02.f2714e = r3.length;
        r02.f2716g = (ArrayList) r2.f1013c;
    L12:
        int r32 = -1;
        if (getChildCount() > 0) goto L15;
        r02.f2710a = -1;
        r02.f2711b = -1;
        r02.f2712c = 0;
        return r02;
    L15:
        if (this.f4003o == false) goto L17;
        int r22 = m2201l();
    L18:
        r02.f2710a = r22;
        if (this.f3997i == false) goto L21;
        View r23 = m2196g(true);
    L22:
        if (r23 == null) goto L25;
        r32 = getPosition(r23);
    L25:
        r02.f2711b = r32;
        int r24 = this.f3989a;
        r02.f2712c = r24;
        r02.f2713d = new int[r24];
    L27:
        if (r12 >= this.f3989a) goto L38;
        if (this.f4003o == false) goto L34;
        int r25 = this.f3990b[r12].m308g(Integer.MIN_VALUE);
        if (r25 == Integer.MIN_VALUE) goto L37;
        int r33 = this.f3991c.mo5256g();
    L33:
        r25 = r25 - r33;
    L37:
        r02.f2713d[r12] = r25;
        r12 = r12 + 1;
        goto L27
    L34:
        r25 = this.f3990b[r12].m310i(Integer.MIN_VALUE);
        if (r25 == Integer.MIN_VALUE) goto L37;
        r33 = this.f3991c.mo5260k();
        goto L33
    L38:
        return r02;
    L21:
        r23 = m2197h(true);
        goto L22
    L17:
        r22 = m2200k();
    L11:
        r02.f2714e = 0;
        goto L12
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onScrollStateChanged(int r1) {
        if (r1 != 0) goto L5;
        m2193d();
        return;
    }

    /* JADX INFO: renamed from: p */
    public final View m2205p() {
        int r0 = getChildCount();
        int r1 = r0 - 1;
        BitSet r2 = new BitSet(this.f3989a);
        r2.set(0, this.f3989a, true);
        int r6 = -1;
        if (this.f3993e == 1) goto L5;
    L7:
        byte r3 = -1;
    L9:
        if (this.f3997i == false) goto L11;
        r0 = -1;
    L12:
        if (r1 >= r0) goto L14;
        r6 = 1;
    L14:
        if (r1 == r0) goto L58;
        View r7 = getChildAt(r1);
        C0771Ry r8 = (C0771Ry) r7.getLayoutParams();
        if (r2.get(r8.f2444e.f441e) == false) goto L36;
        C0161Dp r9 = r8.f2444e;
        if (this.f3997i == false) goto L27;
        int r10 = r9.f439c;
        if (r10 != Integer.MIN_VALUE) goto L24;
        r9.m302a();
        r10 = r9.f439c;
    L24:
        if (r10 < this.f3991c.mo5256g()) goto L25;
    L35:
        r2.clear(r8.f2444e.f441e);
        goto L36
    L25:
        ArrayList r02 = (ArrayList) r9.f442f;
        ((C0771Ry) ((View) r02.get(r02.size() - 1)).getLayoutParams()).getClass();
        return r7;
    L27:
        int r102 = r9.f438b;
        ArrayList r12 = (ArrayList) r9.f442f;
        if (r102 != Integer.MIN_VALUE) goto L32;
        View r103 = (View) r12.get(0);
        C0771Ry r11 = (C0771Ry) r103.getLayoutParams();
        r9.f438b = ((StaggeredGridLayoutManager) r9.f443g).f3991c.mo5254e(r103);
        r11.getClass();
        r102 = r9.f438b;
    L32:
        if (r102 <= this.f3991c.mo5260k()) goto L35;
        ((C0771Ry) ((View) r12.get(0)).getLayoutParams()).getClass();
        return r7;
    L36:
        r1 = r1 + r6;
        if (r1 == r0) goto L14;
        View r92 = getChildAt(r1);
        if (this.f3997i == true) goto L40;
        int r104 = this.f3991c.mo5254e(r7);
        int r112 = this.f3991c.mo5254e(r92);
        if (r104 > r112) goto L57;
        if (r104 != r112) goto L14;
    L50:
        if ((r8.f2444e.f441e - ((C0771Ry) r92.getLayoutParams()).f2444e.f441e) >= 0) goto L52;
        boolean r82 = true;
    L53:
        if (r3 >= 0) goto L55;
        boolean r93 = true;
    L56:
        if (r82 == r93) goto L14;
    L55:
        r93 = false;
        goto L56
    L52:
        r82 = false;
    L57:
        return r7;
    L40:
        int r105 = this.f3991c.mo5251b(r7);
        int r113 = this.f3991c.mo5251b(r92);
        if (r105 < r113) goto L57;
        if (r105 != r113) goto L14;
    L58:
        return null;
    L11:
        r1 = 0;
        goto L12
    L5:
        if (isLayoutRTL() == false) goto L7;
        r3 = 1;
        goto L9
    }

    /* JADX INFO: renamed from: q */
    public final void m2206q(View r6, int r7, int r8) {
        Rect r0 = this.f4006r;
        calculateItemDecorationsForChild(r6, r0);
        C0771Ry r1 = (C0771Ry) r6.getLayoutParams();
        int r72 = m2191B(r7, ((ViewGroup.MarginLayoutParams) r1).leftMargin + r0.left, ((ViewGroup.MarginLayoutParams) r1).rightMargin + r0.right);
        int r82 = m2191B(r8, ((ViewGroup.MarginLayoutParams) r1).topMargin + r0.top, ((ViewGroup.MarginLayoutParams) r1).bottomMargin + r0.bottom);
        if (shouldMeasureChild(r6, r72, r82, r1) == false) goto L6;
        r6.measure(r72, r82);
        return;
    }

    /* JADX INFO: renamed from: r */
    public final void m2207r(C1161j r17, C0038Av r18, boolean r19) {
        C0857Ty r3 = this.f4005q;
        C0729Qy r5 = this.f4007s;
        if (r3 != null) goto L7;
        if (this.f3999k != (-1)) goto L7;
    L10:
        boolean r32 = r5.f2340e;
        StaggeredGridLayoutManager r6 = r5.f2342g;
        boolean r8 = true;
        if (r32 == true) goto L13;
    L18:
        boolean r33 = true;
    L19:
        C0299Gy r9 = this.f4001m;
        if (r33 == false) goto L141;
        r5.m1517a();
        C0857Ty r11 = this.f4005q;
        if (r11 == null) goto L51;
        int r12 = r11.f2712c;
        if (r12 > 0) goto L26;
    L39:
        C0857Ty r112 = this.f4005q;
        this.f4004p = r112.f2719j;
        boolean r113 = r112.f2717h;
        assertNotInLayoutOrScroll(null);
        C0857Ty r122 = this.f4005q;
        if (r122 != null) goto L42;
    L44:
        this.f3996h = r113;
        requestLayout();
        m2213x();
        C0857Ty r114 = this.f4005q;
        int r123 = r114.f2710a;
        if (r123 == (-1)) goto L47;
        this.f3999k = r123;
        r5.f2338c = r114.f2718i;
    L49:
        if (r114.f2714e <= 1) goto L53;
        r9.f1012b = r114.f2715f;
        r9.f1013c = r114.f2716g;
    L53:
        if (r18.f82g == true) goto L122;
        int r115 = this.f3999k;
        if (r115 == (-1)) goto L122;
        if (r115 >= 0) goto L59;
    L120:
        this.f3999k = -1;
        this.f4000l = Integer.MIN_VALUE;
        goto L122
    L59:
        if (r115 >= r18.m58b()) goto L120;
        C0857Ty r116 = this.f4005q;
        if (r116 != null) goto L64;
    L69:
        View r117 = findViewByPosition(this.f3999k);
        if (r117 != null) goto L72;
        int r118 = this.f3999k;
        r5.f2336a = r118;
        int r124 = this.f4000l;
        if (r124 != Integer.MIN_VALUE) goto L116;
        if (getChildCount() != 0) goto L103;
        if (this.f3997i == true) goto L109;
    L108:
        boolean r119 = false;
    L110:
        r5.f2338c = r119;
        if (r119 == false) goto L113;
        int r1110 = r6.f3991c.mo5256g();
    L114:
        r5.f2337b = r1110;
    L119:
        r5.f2339d = true;
    L139:
        r5.f2340e = true;
        goto L141
    L113:
        r1110 = r6.f3991c.mo5260k();
    L109:
        r119 = true;
        goto L110
    L103:
        if (r118 >= m2200k()) goto L105;
        boolean r1111 = true;
    L107:
        if (r1111 == this.f3997i) goto L109;
    L105:
        r1111 = false;
        goto L107
    L116:
        if (r5.f2338c == false) goto L118;
        r5.f2337b = r6.f3991c.mo5256g() - r124;
        goto L119
    L118:
        r5.f2337b = r6.f3991c.mo5260k() + r124;
        goto L119
    L72:
        if (this.f3997i == false) goto L74;
        int r125 = m2201l();
    L75:
        r5.f2336a = r125;
        if (this.f4000l == Integer.MIN_VALUE) goto L82;
        if (r5.f2338c == false) goto L80;
        r5.f2337b = (this.f3991c.mo5256g() - this.f4000l) - this.f3991c.mo5251b(r117);
        goto L139
    L80:
        r5.f2337b = (this.f3991c.mo5260k() + this.f4000l) - this.f3991c.mo5254e(r117);
        goto L139
    L82:
        if (this.f3991c.mo5252c(r117) > this.f3991c.mo5261l()) goto L84;
        int r126 = this.f3991c.mo5254e(r117) - this.f3991c.mo5260k();
        if (r126 >= 0) goto L91;
        r5.f2337b = -r126;
        goto L139
    L91:
        int r127 = this.f3991c.mo5256g() - this.f3991c.mo5251b(r117);
        if (r127 >= 0) goto L94;
        r5.f2337b = r127;
        goto L139
    L94:
        r5.f2337b = Integer.MIN_VALUE;
        goto L139
    L84:
        if (r5.f2338c == false) goto L86;
        int r1112 = this.f3991c.mo5256g();
    L87:
        r5.f2337b = r1112;
        goto L139
    L86:
        r1112 = this.f3991c.mo5260k();
        goto L87
    L74:
        r125 = m2200k();
        goto L75
    L64:
        if (r116.f2710a == (-1)) goto L69;
        if (r116.f2712c < 1) goto L69;
        r5.f2337b = Integer.MIN_VALUE;
        r5.f2336a = this.f3999k;
    L122:
        if (this.f4003o == false) goto L131;
        int r1113 = r18.m58b();
        int r128 = getChildCount() - 1;
    L124:
        if (r128 < 0) goto L130;
        int r13 = getPosition(getChildAt(r128));
        if (r13 < 0) goto L129;
        if (r13 >= r1113) goto L129;
    L138:
        r5.f2336a = r13;
        r5.f2337b = Integer.MIN_VALUE;
    L129:
        r128 = r128 - 1;
    L130:
        r13 = 0;
        goto L138
    L131:
        int r1114 = r18.m58b();
        int r129 = getChildCount();
        int r132 = 0;
    L132:
        if (r132 >= r129) goto L130;
        int r14 = getPosition(getChildAt(r132));
        if (r14 < 0) goto L137;
        if (r14 >= r1114) goto L137;
        r13 = r14;
    L137:
        r132 = r132 + 1;
        goto L132
    L47:
        r5.f2338c = this.f3997i;
        goto L49
    L42:
        if (r122.f2717h == r113) goto L44;
        r122.f2717h = r113;
        goto L44
    L26:
        if (r12 != this.f3989a) goto L38;
        int r1115 = 0;
    L29:
        if (r1115 >= this.f3989a) goto L39;
        this.f3990b[r1115].m303b();
        C0857Ty r1210 = this.f4005q;
        int r142 = r1210.f2713d[r1115];
        if (r142 == Integer.MIN_VALUE) goto L37;
        if (r1210.f2718i == false) goto L36;
        int r1211 = this.f3991c.mo5256g();
    L35:
        r142 = r142 + r1211;
        goto L37
    L36:
        r1211 = this.f3991c.mo5260k();
    L37:
        C0161Dp r1212 = this.f3990b[r1115];
        r1212.f438b = r142;
        r1212.f439c = r142;
        r1115 = r1115 + 1;
        goto L29
    L38:
        r11.f2713d = null;
        r11.f2712c = 0;
        r11.f2714e = 0;
        r11.f2715f = null;
        r11.f2716g = null;
        r11.f2710a = r11.f2711b;
        goto L39
    L51:
        m2213x();
        r5.f2338c = this.f3997i;
    L141:
        if (this.f4005q != null) goto L150;
        if (this.f3999k != (-1)) goto L150;
        if (r5.f2338c == this.f4003o) goto L147;
    L148:
        r9.m634a();
        r5.f2339d = true;
        goto L150
    L147:
        if (isLayoutRTL() != this.f4004p) goto L148;
    L150:
        if (getChildCount() <= 0) goto L201;
        C0857Ty r92 = this.f4005q;
        if (r92 == null) goto L156;
        if (r92.f2712c >= 1) goto L201;
    L156:
        if (r5.f2339d == false) goto L164;
        int r34 = 0;
    L159:
        if (r34 >= this.f3989a) goto L201;
        this.f3990b[r34].m303b();
        int r62 = r5.f2337b;
        if (r62 == Integer.MIN_VALUE) goto L163;
        C0161Dp r93 = this.f3990b[r34];
        r93.f438b = r62;
        r93.f439c = r62;
    L163:
        r34 = r34 + 1;
        goto L159
    L164:
        if (r33 == false) goto L166;
    L172:
        int r35 = 0;
    L174:
        if (r35 >= this.f3989a) goto L193;
        C0161Dp r94 = this.f3990b[r35];
        boolean r1116 = this.f3997i;
        int r1213 = r5.f2337b;
        StaggeredGridLayoutManager r133 = (StaggeredGridLayoutManager) r94.f443g;
        if (r1116 == false) goto L178;
        int r143 = r94.m308g(Integer.MIN_VALUE);
    L179:
        r94.m303b();
        if (r143 == Integer.MIN_VALUE) goto L192;
        if (r1116 == true) goto L184;
    L185:
        if (r1116 == false) goto L187;
    L189:
        if (r1213 == Integer.MIN_VALUE) goto L191;
        r143 = r143 + r1213;
    L191:
        r94.f439c = r143;
        r94.f438b = r143;
        goto L192
    L187:
        if (r143 <= r133.f3991c.mo5260k()) goto L189;
    L184:
        if (r143 >= r133.f3991c.mo5256g()) goto L185;
    L192:
        r35 = r35 + 1;
        goto L174
    L178:
        r143 = r94.m310i(Integer.MIN_VALUE);
        goto L179
    L193:
        C0161Dp[] r36 = this.f3990b;
        int r95 = r36.length;
        int[] r1117 = r5.f2341f;
        if (r1117 != null) goto L196;
    L197:
        r5.f2341f = new int[r6.f3990b.length];
    L198:
        int r63 = 0;
    L199:
        if (r63 >= r95) goto L201;
        r5.f2341f[r63] = r36[r63].m310i(Integer.MIN_VALUE);
        r63 = r63 + 1;
        goto L199
    L196:
        if (r1117.length >= r95) goto L198;
    L166:
        if (r5.f2341f == null) goto L172;
        int r37 = 0;
    L170:
        if (r37 >= this.f3989a) goto L201;
        C0161Dp r64 = this.f3990b[r37];
        r64.m303b();
        int r96 = r5.f2341f[r37];
        r64.f438b = r96;
        r64.f439c = r96;
        r37 = r37 + 1;
    L201:
        detachAndScrapAttachedViews(r17);
        C0116Cn r38 = this.f3995g;
        r38.f276a = false;
        int r65 = this.f3992d.mo5261l();
        this.f3994f = r65 / this.f3989a;
        View.MeasureSpec.makeMeasureSpec(r65, this.f3992d.mo5258i());
        m2215z(r5.f2336a, r18);
        if (r5.f2338c == false) goto L204;
        m2214y(-1);
        m2195f(r17, r38, r18);
        m2214y(1);
        r38.f278c = r5.f2336a + r38.f279d;
        m2195f(r17, r38, r18);
    L206:
        if (this.f3992d.mo5258i() == 1073741824) goto L234;
        int r39 = getChildCount();
        float r4 = 0.0f;
        int r66 = 0;
    L209:
        if (r66 >= r39) goto L215;
        View r97 = getChildAt(r66);
        float r1118 = this.f3992d.mo5252c(r97);
        if (r1118 < r4) goto L214;
        ((C0771Ry) r97.getLayoutParams()).getClass();
        r4 = Math.max(r4, r1118);
    L214:
        r66 = r66 + 1;
        goto L209
    L215:
        int r67 = this.f3994f;
        int r42 = Math.round(r4 * this.f3989a);
        if (this.f3992d.mo5258i() != Integer.MIN_VALUE) goto L218;
        r42 = Math.min(r42, this.f3992d.mo5261l());
    L218:
        this.f3994f = r42 / this.f3989a;
        View.MeasureSpec.makeMeasureSpec(r42, this.f3992d.mo5258i());
        if (this.f3994f == r67) goto L234;
        int r43 = 0;
    L222:
        if (r43 >= r39) goto L234;
        View r98 = getChildAt(r43);
        C0771Ry r10 = (C0771Ry) r98.getLayoutParams();
        r10.getClass();
        if (isLayoutRTL() == true) goto L226;
    L228:
        int r102 = r10.f2444e.f441e;
        int r1119 = this.f3994f * r102;
        int r103 = r102 * r67;
        if (this.f3993e != 1) goto L231;
        r98.offsetLeftAndRight(r1119 - r103);
    L232:
        r43 = r43 + 1;
        goto L222
    L231:
        r98.offsetTopAndBottom(r1119 - r103);
        goto L232
    L226:
        if (this.f3993e != 1) goto L228;
        int r104 = -((this.f3989a - 1) - r10.f2444e.f441e);
        r98.offsetLeftAndRight((this.f3994f * r104) - (r104 * r67));
    L234:
        if (getChildCount() > 0) goto L236;
    L239:
        if (r19 == true) goto L241;
    L251:
        r8 = false;
    L253:
        if (r18.f82g == false) goto L255;
        r5.m1517a();
    L255:
        this.f4003o = r5.f2338c;
        this.f4004p = isLayoutRTL();
        if (r8 == false) goto L287;
        r5.m1517a();
        m2207r(r17, r18, false);
        return;
    L287:
        return;
    L241:
        if (r18.f82g == true) goto L251;
        if (this.f4002n == 0) goto L251;
        if (getChildCount() <= 0) goto L251;
        if (m2205p() == null) goto L251;
        removeCallbacks(this.f4010v);
        if (m2193d() == false) goto L251;
    L236:
        if (this.f3997i == false) goto L238;
        m2198i(r17, r18, true);
        m2199j(r17, r18, false);
        goto L239
    L238:
        m2199j(r17, r18, true);
        m2198i(r17, r18, false);
        goto L239
    L204:
        m2214y(1);
        m2195f(r17, r38, r18);
        m2214y(-1);
        r38.f278c = r5.f2336a + r38.f279d;
        m2195f(r17, r38, r18);
        goto L206
    L13:
        if (this.f3999k != (-1)) goto L18;
        if (this.f4005q != null) goto L18;
        r33 = false;
    L7:
        if (r18.m58b() != 0) goto L10;
        removeAndRecycleAllViews(r17);
        r5.m1517a();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2208s(int r5) {
        if (this.f3993e != 0) goto L11;
        if (r5 != (-1)) goto L6;
        boolean r52 = true;
    L8:
        if (r52 == this.f3997i) goto L10;
        return true;
    L10:
        return false;
    L6:
        r52 = false;
        goto L8
    L11:
        if (r5 != (-1)) goto L13;
        boolean r53 = true;
    L15:
        if (r53 != this.f3997i) goto L17;
        boolean r54 = true;
    L19:
        if (r54 != isLayoutRTL()) goto L21;
        return true;
    L21:
        return false;
    L17:
        r54 = false;
        goto L19
    L13:
        r53 = false;
        goto L15
    }

    public final int scrollBy(int r4, C1161j r5, C0038Av r6) {
        if (getChildCount() == 0) goto L14;
        if (r4 == 0) goto L14;
        m2209t(r4, r6);
        C0116Cn r0 = this.f3995g;
        int r62 = m2195f(r5, r0, r6);
        if (r0.f277b < r62) goto L12;
        if (r4 >= 0) goto L11;
        r4 = -r62;
        goto L12
    L11:
        r4 = r62;
    L12:
        this.f3991c.mo5264o(-r4);
        this.f4003o = this.f3997i;
        r0.f277b = 0;
        m2210u(r5, r0);
        return r4;
    L14:
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int scrollHorizontallyBy(int r1, C1161j r2, C0038Av r3) {
        return scrollBy(r1, r2, r3);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void scrollToPosition(int r3) {
        C0857Ty r0 = this.f4005q;
        if (r0 != null) goto L5;
    L7:
        this.f3999k = r3;
        this.f4000l = Integer.MIN_VALUE;
        requestLayout();
        return;
    L5:
        if (r0.f2710a == r3) goto L7;
        r0.f2713d = null;
        r0.f2712c = 0;
        r0.f2710a = -1;
        r0.f2711b = -1;
        goto L7
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int scrollVerticallyBy(int r1, C1161j r2, C0038Av r3) {
        return scrollBy(r1, r2, r3);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void setMeasuredDimension(Rect r5, int r6, int r7) {
        int r0 = getPaddingLeft();
        int r1 = getPaddingRight() + r0;
        int r02 = getPaddingTop();
        int r2 = getPaddingBottom() + r02;
        if (this.f3993e != 1) goto L5;
        int r52 = AbstractC1160i.chooseSize(r7, r5.height() + r2, getMinimumHeight());
        int r62 = AbstractC1160i.chooseSize(r6, (this.f3994f * this.f3989a) + r1, getMinimumWidth());
    L6:
        setMeasuredDimension(r62, r52);
        return;
    L5:
        r62 = AbstractC1160i.chooseSize(r6, r5.width() + r1, getMinimumWidth());
        r52 = AbstractC1160i.chooseSize(r7, (this.f3994f * this.f3989a) + r2, getMinimumHeight());
        goto L6
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void smoothScrollToPosition(RecyclerView r1, C0038Av r2, int r3) {
        C2201lo r22 = new C2201lo(r1.getContext());
        r22.setTargetPosition(r3);
        startSmoothScroll(r22);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean supportsPredictiveItemAnimations() {
        if (this.f4005q != null) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final void m2209t(int r5, C0038Av r6) {
        if (r5 <= 0) goto L5;
        int r1 = m2201l();
        int r2 = 1;
    L6:
        C0116Cn r3 = this.f3995g;
        r3.f276a = true;
        m2215z(r1, r6);
        m2214y(r2);
        r3.f278c = r1 + r3.f279d;
        r3.f277b = Math.abs(r5);
        return;
    L5:
        r1 = m2200k();
        r2 = -1;
        goto L6
    }

    /* JADX INFO: renamed from: u */
    public final void m2210u(C1161j r5, C0116Cn r6) {
        if (r6.f276a == true) goto L5;
        return;
    L5:
        if (r6.f284i == false) goto L8;
        return;
    L8:
        if (r6.f277b == 0) goto L10;
        int r2 = 1;
        if (r6.f280e != (-1)) goto L30;
        int r0 = r6.f281f;
        int r1 = this.f3990b[0].m310i(r0);
    L19:
        if (r2 >= this.f3989a) goto L24;
        int r3 = this.f3990b[r2].m310i(r0);
        if (r3 <= r1) goto L23;
        r1 = r3;
    L23:
        r2 = r2 + 1;
        goto L19
    L24:
        int r02 = r0 - r1;
        if (r02 >= 0) goto L27;
        int r62 = r6.f282g;
    L28:
        m2211v(r62, r5);
        return;
    L27:
        r62 = r6.f282g - Math.min(r02, r6.f277b);
        goto L28
    L30:
        int r03 = r6.f282g;
        int r12 = this.f3990b[0].m308g(r03);
    L32:
        if (r2 >= this.f3989a) goto L37;
        int r32 = this.f3990b[r2].m308g(r03);
        if (r32 >= r12) goto L36;
        r12 = r32;
    L36:
        r2 = r2 + 1;
        goto L32
    L37:
        int r13 = r12 - r6.f282g;
        if (r13 >= 0) goto L40;
        int r63 = r6.f281f;
    L41:
        m2212w(r63, r5);
        return;
    L40:
        int r04 = r6.f281f;
        r63 = Math.min(r13, r6.f277b) + r04;
        goto L41
    L10:
        if (r6.f280e != (-1)) goto L13;
        m2211v(r6.f282g, r5);
        return;
    L13:
        m2212w(r6.f281f, r5);
    }

    /* JADX INFO: renamed from: v */
    public final void m2211v(int r9, C1161j r10) {
        int r0 = getChildCount() - 1;
    L3:
        if (r0 < 0) goto L20;
        View r2 = getChildAt(r0);
        if (this.f3991c.mo5254e(r2) < r9) goto L27;
        if (this.f3991c.mo5263n(r2) < r9) goto L28;
        C0771Ry r3 = (C0771Ry) r2.getLayoutParams();
        r3.getClass();
        if (((ArrayList) r3.f2444e.f442f).size() == 1) goto L29;
        C0161Dp r32 = r3.f2444e;
        ArrayList r4 = (ArrayList) r32.f442f;
        int r5 = r4.size();
        View r42 = (View) r4.remove(r5 - 1);
        C0771Ry r6 = (C0771Ry) r42.getLayoutParams();
        r6.f2444e = null;
        if (r6.f8526a.isRemoved() == false) goto L14;
    L15:
        r32.f440d -= ((StaggeredGridLayoutManager) r32.f443g).f3991c.mo5252c(r42);
    L17:
        if (r5 != 1) goto L19;
        r32.f438b = Integer.MIN_VALUE;
    L19:
        r32.f439c = Integer.MIN_VALUE;
        removeAndRecycleView(r2, r10);
        r0 = r0 - 1;
        goto L3
    L14:
        if (r6.f8526a.isUpdated() == false) goto L17;
    L29:
        return;
    L28:
        return;
    L27:
        return;
    }

    /* JADX INFO: renamed from: w */
    public final void m2212w(int r7, C1161j r8) {
    L3:
        if (getChildCount() <= 0) goto L20;
        View r1 = getChildAt(0);
        if (this.f3991c.mo5251b(r1) > r7) goto L27;
        if (this.f3991c.mo5262m(r1) > r7) goto L28;
        C0771Ry r2 = (C0771Ry) r1.getLayoutParams();
        r2.getClass();
        if (((ArrayList) r2.f2444e.f442f).size() == 1) goto L29;
        C0161Dp r22 = r2.f2444e;
        ArrayList r3 = (ArrayList) r22.f442f;
        View r0 = (View) r3.remove(0);
        C0771Ry r4 = (C0771Ry) r0.getLayoutParams();
        r4.f2444e = null;
        if (r3.size() != 0) goto L15;
        r22.f439c = Integer.MIN_VALUE;
    L15:
        if (r4.f8526a.isRemoved() == false) goto L17;
    L18:
        r22.f440d -= ((StaggeredGridLayoutManager) r22.f443g).f3991c.mo5252c(r0);
    L19:
        r22.f438b = Integer.MIN_VALUE;
        removeAndRecycleView(r1, r8);
        goto L3
    L17:
        if (r4.f8526a.isUpdated() == false) goto L19;
    L29:
        return;
    L28:
        return;
    L27:
        return;
    }

    /* JADX INFO: renamed from: x */
    public final void m2213x() {
        if (this.f3993e != 1) goto L5;
    L9:
        this.f3997i = this.f3996h;
        return;
    L5:
        if (isLayoutRTL() == false) goto L9;
        this.f3997i = !this.f3996h;
    }

    /* JADX INFO: renamed from: y */
    public final void m2214y(int r5) {
        C0116Cn r0 = this.f3995g;
        r0.f280e = r5;
        boolean r1 = this.f3997i;
        int r2 = 1;
        if (r5 != (-1)) goto L5;
        boolean r52 = true;
    L6:
        if (r1 == r52) goto L9;
        r2 = -1;
    L9:
        r0.f279d = r2;
        return;
    L5:
        r52 = false;
        goto L6
    }

    /* JADX INFO: renamed from: z */
    public final void m2215z(int r5, C0038Av r6) {
        C0116Cn r0 = this.f3995g;
        boolean r1 = false;
        r0.f277b = 0;
        r0.f278c = r5;
        if (isSmoothScrolling() == false) goto L13;
        int r62 = r6.f76a;
        if (r62 == (-1)) goto L13;
        boolean r2 = this.f3997i;
        if (r62 >= r5) goto L9;
        boolean r52 = true;
    L10:
        if (r2 != r52) goto L12;
        int r53 = this.f3991c.mo5261l();
        int r63 = 0;
    L15:
        if (getClipToPadding() == false) goto L17;
        r0.f281f = this.f3991c.mo5260k() - r63;
        r0.f282g = this.f3991c.mo5256g() + r53;
    L18:
        r0.f283h = false;
        r0.f276a = true;
        if (this.f3991c.mo5258i() == 0) goto L21;
    L23:
        r0.f284i = r1;
        return;
    L21:
        if (this.f3991c.mo5255f() != 0) goto L23;
        r1 = true;
        goto L23
    L17:
        r0.f282g = this.f3991c.mo5255f() + r53;
        r0.f281f = -r63;
        goto L18
    L12:
        r63 = this.f3991c.mo5261l();
        r53 = 0;
        goto L15
    L9:
        r52 = false;
    L13:
        r53 = 0;
        r63 = 0;
        goto L15
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final C2431qv generateLayoutParams(ViewGroup.LayoutParams r2) {
        if ((r2 instanceof ViewGroup.MarginLayoutParams) == false) goto L7;
        return new C0771Ry((ViewGroup.MarginLayoutParams) r2);
    L7:
        return new C0771Ry(r2);
    }
}
