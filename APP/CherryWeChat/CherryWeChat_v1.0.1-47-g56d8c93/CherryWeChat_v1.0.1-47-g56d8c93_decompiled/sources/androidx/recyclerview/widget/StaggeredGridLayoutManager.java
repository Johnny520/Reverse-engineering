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

    /* JADX INFO: renamed from: j */
    public final BitSet f3998j;

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

    /* JADX INFO: renamed from: i */
    public boolean f3997i = false;

    /* JADX INFO: renamed from: k */
    public int f3999k = -1;

    /* JADX INFO: renamed from: l */
    public int f4000l = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3989a = -1;
        this.f3996h = false;
        C0299Gy c0299Gy = new C0299Gy();
        this.f4001m = c0299Gy;
        this.f4002n = 2;
        this.f4006r = new Rect();
        this.f4007s = new C0729Qy(this);
        this.f4008t = true;
        this.f4010v = new RunnableC0431K0(14, this);
        C2388pv properties = AbstractC1160i.getProperties(context, attributeSet, i, i2);
        int i3 = properties.f8388a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i3 != this.f3993e) {
            this.f3993e = i3;
            AbstractC2730xt abstractC2730xt = this.f3991c;
            this.f3991c = this.f3992d;
            this.f3992d = abstractC2730xt;
            requestLayout();
        }
        int i4 = properties.f8389b;
        assertNotInLayoutOrScroll(null);
        if (i4 != this.f3989a) {
            c0299Gy.m634a();
            requestLayout();
            this.f3989a = i4;
            this.f3998j = new BitSet(this.f3989a);
            this.f3990b = new C0161Dp[this.f3989a];
            for (int i5 = 0; i5 < this.f3989a; i5++) {
                this.f3990b[i5] = new C0161Dp(this, i5);
            }
            requestLayout();
        }
        boolean z = properties.f8390c;
        assertNotInLayoutOrScroll(null);
        C0857Ty c0857Ty = this.f4005q;
        if (c0857Ty != null && c0857Ty.f2717h != z) {
            c0857Ty.f2717h = z;
        }
        this.f3996h = z;
        requestLayout();
        C0116Cn c0116Cn = new C0116Cn();
        c0116Cn.f276a = true;
        c0116Cn.f281f = 0;
        c0116Cn.f282g = 0;
        this.f3995g = c0116Cn;
        this.f3991c = AbstractC2730xt.m5296a(this, this.f3993e);
        this.f3992d = AbstractC2730xt.m5296a(this, 1 - this.f3993e);
    }

    /* JADX INFO: renamed from: B */
    public static int m2191B(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX INFO: renamed from: A */
    public final void m2192A(C0161Dp c0161Dp, int i, int i2) {
        int i3 = c0161Dp.f440d;
        int i4 = c0161Dp.f441e;
        if (i != -1) {
            int i5 = c0161Dp.f439c;
            if (i5 == Integer.MIN_VALUE) {
                c0161Dp.m302a();
                i5 = c0161Dp.f439c;
            }
            if (i5 - i3 >= i2) {
                this.f3998j.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c0161Dp.f438b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) c0161Dp.f442f).get(0);
            C0771Ry c0771Ry = (C0771Ry) view.getLayoutParams();
            c0161Dp.f438b = ((StaggeredGridLayoutManager) c0161Dp.f443g).f3991c.mo5254e(view);
            c0771Ry.getClass();
            i6 = c0161Dp.f438b;
        }
        if (i6 + i3 <= i2) {
            this.f3998j.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f4005q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean canScrollHorizontally() {
        return this.f3993e == 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean canScrollVertically() {
        return this.f3993e == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean checkLayoutParams(C2431qv c2431qv) {
        return c2431qv instanceof C0771Ry;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void collectAdjacentPrefetchPositions(int i, int i2, C0038Av c0038Av, InterfaceC2337ov interfaceC2337ov) {
        C0116Cn c0116Cn;
        int iM308g;
        int iM310i;
        if (this.f3993e != 0) {
            i = i2;
        }
        if (getChildCount() == 0 || i == 0) {
            return;
        }
        m2209t(i, c0038Av);
        int[] iArr = this.f4009u;
        if (iArr == null || iArr.length < this.f3989a) {
            this.f4009u = new int[this.f3989a];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f3989a;
            c0116Cn = this.f3995g;
            if (i3 >= i5) {
                break;
            }
            if (c0116Cn.f279d == -1) {
                iM308g = c0116Cn.f281f;
                iM310i = this.f3990b[i3].m310i(iM308g);
            } else {
                iM308g = this.f3990b[i3].m308g(c0116Cn.f282g);
                iM310i = c0116Cn.f282g;
            }
            int i6 = iM308g - iM310i;
            if (i6 >= 0) {
                this.f4009u[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f4009u, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c0116Cn.f278c;
            if (i8 < 0 || i8 >= c0038Av.m58b()) {
                return;
            }
            ((C1154c) interfaceC2337ov).m2239a(c0116Cn.f278c, this.f4009u[i7]);
            c0116Cn.f278c += c0116Cn.f279d;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeHorizontalScrollExtent(C0038Av c0038Av) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f4008t;
        return AbstractC1293cr.m2552m(c0038Av, this.f3991c, m2197h(z), m2196g(z), this, this.f4008t);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeHorizontalScrollOffset(C0038Av c0038Av) {
        return m2194e(c0038Av);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeHorizontalScrollRange(C0038Av c0038Av) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f4008t;
        return AbstractC1293cr.m2554o(c0038Av, this.f3991c, m2197h(z), m2196g(z), this, this.f4008t);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // p000.InterfaceC2818zv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF computeScrollVectorForPosition(int i) {
        int i2 = -1;
        if (getChildCount() != 0) {
            if ((i < m2200k()) == this.f3997i) {
            }
        } else if (this.f3997i) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.f3993e == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeVerticalScrollExtent(C0038Av c0038Av) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f4008t;
        return AbstractC1293cr.m2552m(c0038Av, this.f3991c, m2197h(z), m2196g(z), this, this.f4008t);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeVerticalScrollOffset(C0038Av c0038Av) {
        return m2194e(c0038Av);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int computeVerticalScrollRange(C0038Av c0038Av) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f4008t;
        return AbstractC1293cr.m2554o(c0038Av, this.f3991c, m2197h(z), m2196g(z), this, this.f4008t);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2193d() {
        int iM2200k;
        if (getChildCount() != 0 && this.f4002n != 0 && isAttachedToWindow()) {
            if (this.f3997i) {
                iM2200k = m2201l();
                m2200k();
            } else {
                iM2200k = m2200k();
                m2201l();
            }
            if (iM2200k == 0 && m2205p() != null) {
                this.f4001m.m634a();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final int m2194e(C0038Av c0038Av) {
        if (getChildCount() == 0) {
            return 0;
        }
        boolean z = !this.f4008t;
        return AbstractC1293cr.m2553n(c0038Av, this.f3991c, m2197h(z), m2196g(z), this, this.f4008t, this.f3997i);
    }

    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    /* JADX INFO: renamed from: f */
    public final int m2195f(C1161j c1161j, C0116Cn c0116Cn, C0038Av c0038Av) {
        C0161Dp c0161Dp;
        ?? r3;
        int iM310i;
        int iMo5252c;
        int iMo5260k;
        int iMo5252c2;
        int i;
        int i2;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this;
        int i3 = 0;
        int i4 = 1;
        staggeredGridLayoutManager.f3998j.set(0, staggeredGridLayoutManager.f3989a, true);
        C0116Cn c0116Cn2 = staggeredGridLayoutManager.f3995g;
        int i5 = c0116Cn2.f284i ? c0116Cn.f280e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0116Cn.f280e == 1 ? c0116Cn.f282g + c0116Cn.f277b : c0116Cn.f281f - c0116Cn.f277b;
        int i6 = c0116Cn.f280e;
        for (int i7 = 0; i7 < staggeredGridLayoutManager.f3989a; i7++) {
            if (!((ArrayList) staggeredGridLayoutManager.f3990b[i7].f442f).isEmpty()) {
                staggeredGridLayoutManager.m2192A(staggeredGridLayoutManager.f3990b[i7], i6, i5);
            }
        }
        int iMo5256g = staggeredGridLayoutManager.f3997i ? staggeredGridLayoutManager.f3991c.mo5256g() : staggeredGridLayoutManager.f3991c.mo5260k();
        boolean z = false;
        while (true) {
            int i8 = c0116Cn.f278c;
            int i9 = -1;
            if (i8 < 0 || i8 >= c0038Av.m58b() || (!c0116Cn2.f284i && staggeredGridLayoutManager.f3998j.isEmpty())) {
                break;
            }
            View viewM2258d = c1161j.m2258d(c0116Cn.f278c);
            c0116Cn.f278c += c0116Cn.f279d;
            C0771Ry c0771Ry = (C0771Ry) viewM2258d.getLayoutParams();
            int layoutPosition = c0771Ry.f8526a.getLayoutPosition();
            C0299Gy c0299Gy = staggeredGridLayoutManager.f4001m;
            int[] iArr = (int[]) c0299Gy.f1012b;
            int i10 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i10 == -1) {
                if (staggeredGridLayoutManager.m2208s(c0116Cn.f280e)) {
                    i = staggeredGridLayoutManager.f3989a - i4;
                    i2 = -1;
                } else {
                    i9 = staggeredGridLayoutManager.f3989a;
                    i = i3;
                    i2 = i4;
                }
                C0161Dp c0161Dp2 = null;
                if (c0116Cn.f280e == i4) {
                    int iMo5260k2 = staggeredGridLayoutManager.f3991c.mo5260k();
                    int i11 = Integer.MAX_VALUE;
                    while (i != i9) {
                        C0161Dp c0161Dp3 = staggeredGridLayoutManager.f3990b[i];
                        int i12 = i2;
                        int iM308g = c0161Dp3.m308g(iMo5260k2);
                        if (iM308g < i11) {
                            c0161Dp2 = c0161Dp3;
                            i11 = iM308g;
                        }
                        i += i12;
                        i2 = i12;
                    }
                } else {
                    int i13 = i2;
                    int iMo5256g2 = staggeredGridLayoutManager.f3991c.mo5256g();
                    int i14 = Integer.MIN_VALUE;
                    while (i != i9) {
                        C0161Dp c0161Dp4 = staggeredGridLayoutManager.f3990b[i];
                        int iM310i2 = c0161Dp4.m310i(iMo5256g2);
                        if (iM310i2 > i14) {
                            c0161Dp2 = c0161Dp4;
                            i14 = iM310i2;
                        }
                        i += i13;
                    }
                }
                c0161Dp = c0161Dp2;
                c0299Gy.m637d(layoutPosition);
                ((int[]) c0299Gy.f1012b)[layoutPosition] = c0161Dp.f441e;
            } else {
                c0161Dp = staggeredGridLayoutManager.f3990b[i10];
            }
            C0161Dp c0161Dp5 = c0161Dp;
            c0771Ry.f2444e = c0161Dp5;
            if (c0116Cn.f280e == 1) {
                staggeredGridLayoutManager.addView(viewM2258d);
                r3 = 0;
            } else {
                r3 = 0;
                staggeredGridLayoutManager.addView(viewM2258d, 0);
            }
            if (staggeredGridLayoutManager.f3993e == 1) {
                staggeredGridLayoutManager.m2206q(viewM2258d, AbstractC1160i.getChildMeasureSpec(staggeredGridLayoutManager.f3994f, staggeredGridLayoutManager.getWidthMode(), r3, ((ViewGroup.MarginLayoutParams) c0771Ry).width, r3), AbstractC1160i.getChildMeasureSpec(staggeredGridLayoutManager.getHeight(), staggeredGridLayoutManager.getHeightMode(), staggeredGridLayoutManager.getPaddingBottom() + staggeredGridLayoutManager.getPaddingTop(), ((ViewGroup.MarginLayoutParams) c0771Ry).height, true));
            } else {
                staggeredGridLayoutManager.m2206q(viewM2258d, AbstractC1160i.getChildMeasureSpec(staggeredGridLayoutManager.getWidth(), staggeredGridLayoutManager.getWidthMode(), staggeredGridLayoutManager.getPaddingRight() + staggeredGridLayoutManager.getPaddingLeft(), ((ViewGroup.MarginLayoutParams) c0771Ry).width, true), AbstractC1160i.getChildMeasureSpec(staggeredGridLayoutManager.f3994f, staggeredGridLayoutManager.getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) c0771Ry).height, false));
            }
            if (c0116Cn.f280e == 1) {
                iMo5252c = c0161Dp5.m308g(iMo5256g);
                iM310i = staggeredGridLayoutManager.f3991c.mo5252c(viewM2258d) + iMo5252c;
            } else {
                iM310i = c0161Dp5.m310i(iMo5256g);
                iMo5252c = iM310i - staggeredGridLayoutManager.f3991c.mo5252c(viewM2258d);
            }
            if (c0116Cn.f280e == 1) {
                C0161Dp c0161Dp6 = c0771Ry.f2444e;
                c0161Dp6.getClass();
                C0771Ry c0771Ry2 = (C0771Ry) viewM2258d.getLayoutParams();
                c0771Ry2.f2444e = c0161Dp6;
                ArrayList arrayList = (ArrayList) c0161Dp6.f442f;
                arrayList.add(viewM2258d);
                c0161Dp6.f439c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c0161Dp6.f438b = Integer.MIN_VALUE;
                }
                if (c0771Ry2.f8526a.isRemoved() || c0771Ry2.f8526a.isUpdated()) {
                    c0161Dp6.f440d = ((StaggeredGridLayoutManager) c0161Dp6.f443g).f3991c.mo5252c(viewM2258d) + c0161Dp6.f440d;
                }
            } else {
                C0161Dp c0161Dp7 = c0771Ry.f2444e;
                c0161Dp7.getClass();
                C0771Ry c0771Ry3 = (C0771Ry) viewM2258d.getLayoutParams();
                c0771Ry3.f2444e = c0161Dp7;
                ArrayList arrayList2 = (ArrayList) c0161Dp7.f442f;
                arrayList2.add(0, viewM2258d);
                c0161Dp7.f438b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c0161Dp7.f439c = Integer.MIN_VALUE;
                }
                if (c0771Ry3.f8526a.isRemoved() || c0771Ry3.f8526a.isUpdated()) {
                    c0161Dp7.f440d = ((StaggeredGridLayoutManager) c0161Dp7.f443g).f3991c.mo5252c(viewM2258d) + c0161Dp7.f440d;
                }
            }
            if (staggeredGridLayoutManager.isLayoutRTL() && staggeredGridLayoutManager.f3993e == 1) {
                iMo5252c2 = staggeredGridLayoutManager.f3992d.mo5256g() - (((staggeredGridLayoutManager.f3989a - 1) - c0161Dp5.f441e) * staggeredGridLayoutManager.f3994f);
                iMo5260k = iMo5252c2 - staggeredGridLayoutManager.f3992d.mo5252c(viewM2258d);
            } else {
                iMo5260k = staggeredGridLayoutManager.f3992d.mo5260k() + (c0161Dp5.f441e * staggeredGridLayoutManager.f3994f);
                iMo5252c2 = staggeredGridLayoutManager.f3992d.mo5252c(viewM2258d) + iMo5260k;
            }
            int i15 = iMo5260k;
            int i16 = iMo5252c2;
            if (staggeredGridLayoutManager.f3993e == 1) {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(viewM2258d, i15, iMo5252c, i16, iM310i);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager.layoutDecoratedWithMargins(viewM2258d, iMo5252c, i15, iM310i, i16);
            }
            staggeredGridLayoutManager.m2192A(c0161Dp5, c0116Cn2.f280e, i5);
            staggeredGridLayoutManager.m2210u(c1161j, c0116Cn2);
            if (c0116Cn2.f283h && viewM2258d.hasFocusable()) {
                staggeredGridLayoutManager.f3998j.set(c0161Dp5.f441e, false);
            }
            z = true;
            i4 = 1;
            i3 = 0;
        }
        if (!z) {
            staggeredGridLayoutManager.m2210u(c1161j, c0116Cn2);
        }
        int iMo5260k3 = c0116Cn2.f280e == -1 ? staggeredGridLayoutManager.f3991c.mo5260k() - staggeredGridLayoutManager.m2203n(staggeredGridLayoutManager.f3991c.mo5260k()) : staggeredGridLayoutManager.m2202m(staggeredGridLayoutManager.f3991c.mo5256g()) - staggeredGridLayoutManager.f3991c.mo5256g();
        if (iMo5260k3 > 0) {
            return Math.min(c0116Cn.f277b, iMo5260k3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public final View m2196g(boolean z) {
        int iMo5260k = this.f3991c.mo5260k();
        int iMo5256g = this.f3991c.mo5256g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int iMo5254e = this.f3991c.mo5254e(childAt);
            int iMo5251b = this.f3991c.mo5251b(childAt);
            if (iMo5251b > iMo5260k && iMo5254e < iMo5256g) {
                if (iMo5251b <= iMo5256g || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final C2431qv generateDefaultLayoutParams() {
        return this.f3993e == 0 ? new C0771Ry(-2, -1) : new C0771Ry(-1, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final C2431qv generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C0771Ry(context, attributeSet);
    }

    /* JADX INFO: renamed from: h */
    public final View m2197h(boolean z) {
        int iMo5260k = this.f3991c.mo5260k();
        int iMo5256g = this.f3991c.mo5256g();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int iMo5254e = this.f3991c.mo5254e(childAt);
            if (this.f3991c.mo5251b(childAt) > iMo5260k && iMo5254e < iMo5256g) {
                if (iMo5254e >= iMo5260k || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: i */
    public final void m2198i(C1161j c1161j, C0038Av c0038Av, boolean z) {
        int iMo5256g;
        int iM2202m = m2202m(Integer.MIN_VALUE);
        if (iM2202m != Integer.MIN_VALUE && (iMo5256g = this.f3991c.mo5256g() - iM2202m) > 0) {
            int i = iMo5256g - (-scrollBy(-iMo5256g, c1161j, c0038Av));
            if (!z || i <= 0) {
                return;
            }
            this.f3991c.mo5264o(i);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean isAutoMeasureEnabled() {
        return this.f4002n != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: j */
    public final void m2199j(C1161j c1161j, C0038Av c0038Av, boolean z) {
        int iMo5260k;
        int iM2203n = m2203n(Integer.MAX_VALUE);
        if (iM2203n != Integer.MAX_VALUE && (iMo5260k = iM2203n - this.f3991c.mo5260k()) > 0) {
            int iScrollBy = iMo5260k - scrollBy(iMo5260k, c1161j, c0038Av);
            if (!z || iScrollBy <= 0) {
                return;
            }
            this.f3991c.mo5264o(-iScrollBy);
        }
    }

    /* JADX INFO: renamed from: k */
    public final int m2200k() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    /* JADX INFO: renamed from: l */
    public final int m2201l() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    /* JADX INFO: renamed from: m */
    public final int m2202m(int i) {
        int iM308g = this.f3990b[0].m308g(i);
        for (int i2 = 1; i2 < this.f3989a; i2++) {
            int iM308g2 = this.f3990b[i2].m308g(i);
            if (iM308g2 > iM308g) {
                iM308g = iM308g2;
            }
        }
        return iM308g;
    }

    /* JADX INFO: renamed from: n */
    public final int m2203n(int i) {
        int iM310i = this.f3990b[0].m310i(i);
        for (int i2 = 1; i2 < this.f3989a; i2++) {
            int iM310i2 = this.f3990b[i2].m310i(i);
            if (iM310i2 < iM310i) {
                iM310i = iM310i2;
            }
        }
        return iM310i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2204o(int i, int i2, int i3) {
        int i4;
        int i5;
        C0299Gy c0299Gy;
        int[] iArr;
        ArrayList arrayList;
        C0814Sy c0814Sy;
        int size;
        int i6;
        int i7;
        int iM2201l = this.f3997i ? m2201l() : m2200k();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                c0299Gy = this.f4001m;
                iArr = (int[]) c0299Gy.f1012b;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = (ArrayList) c0299Gy.f1013c;
                    if (arrayList != null) {
                        if (arrayList == null) {
                            c0814Sy = null;
                            if (c0814Sy != null) {
                                ((ArrayList) c0299Gy.f1013c).remove(c0814Sy);
                            }
                            size = ((ArrayList) c0299Gy.f1013c).size();
                            i6 = 0;
                            while (true) {
                                if (i6 < size) {
                                    i6 = -1;
                                    break;
                                } else if (((C0814Sy) ((ArrayList) c0299Gy.f1013c).get(i6)).f2579a >= i5) {
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                            if (i6 == -1) {
                                C0814Sy c0814Sy2 = (C0814Sy) ((ArrayList) c0299Gy.f1013c).get(i6);
                                ((ArrayList) c0299Gy.f1013c).remove(i6);
                                i7 = c0814Sy2.f2579a;
                            } else {
                                i7 = -1;
                            }
                            if (i7 != -1) {
                                int[] iArr2 = (int[]) c0299Gy.f1012b;
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = ((int[]) c0299Gy.f1012b).length;
                            } else {
                                Arrays.fill((int[]) c0299Gy.f1012b, i5, Math.min(i7 + 1, ((int[]) c0299Gy.f1012b).length), -1);
                            }
                        } else {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c0814Sy = (C0814Sy) ((ArrayList) c0299Gy.f1013c).get(size2);
                                if (c0814Sy.f2579a == i5) {
                                    break;
                                }
                            }
                            c0814Sy = null;
                            if (c0814Sy != null) {
                            }
                            size = ((ArrayList) c0299Gy.f1013c).size();
                            i6 = 0;
                            while (true) {
                                if (i6 < size) {
                                }
                                i6++;
                            }
                            if (i6 == -1) {
                            }
                            if (i7 != -1) {
                            }
                        }
                    }
                }
                if (i3 != 1) {
                    c0299Gy.m640g(i, i2);
                } else if (i3 == 2) {
                    c0299Gy.m641h(i, i2);
                } else if (i3 == 8) {
                    c0299Gy.m641h(i, 1);
                    c0299Gy.m640g(i2, 1);
                }
                if (i4 > iM2201l) {
                    return;
                }
                if (i5 <= (this.f3997i ? m2200k() : m2201l())) {
                    requestLayout();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        c0299Gy = this.f4001m;
        iArr = (int[]) c0299Gy.f1012b;
        if (iArr != null) {
            arrayList = (ArrayList) c0299Gy.f1013c;
            if (arrayList != null) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > iM2201l) {
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f3989a; i2++) {
            C0161Dp c0161Dp = this.f3990b[i2];
            int i3 = c0161Dp.f438b;
            if (i3 != Integer.MIN_VALUE) {
                c0161Dp.f438b = i3 + i;
            }
            int i4 = c0161Dp.f439c;
            if (i4 != Integer.MIN_VALUE) {
                c0161Dp.f439c = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f3989a; i2++) {
            C0161Dp c0161Dp = this.f3990b[i2];
            int i3 = c0161Dp.f438b;
            if (i3 != Integer.MIN_VALUE) {
                c0161Dp.f438b = i3 + i;
            }
            int i4 = c0161Dp.f439c;
            if (i4 != Integer.MIN_VALUE) {
                c0161Dp.f439c = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onAdapterChanged(AbstractC1158g abstractC1158g, AbstractC1158g abstractC1158g2) {
        this.f4001m.m634a();
        for (int i = 0; i < this.f3989a; i++) {
            this.f3990b[i].m303b();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onDetachedFromWindow(RecyclerView recyclerView, C1161j c1161j) {
        onDetachedFromWindow(recyclerView);
        removeCallbacks(this.f4010v);
        for (int i = 0; i < this.f3989a; i++) {
            this.f3990b[i].m303b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    @Override // androidx.recyclerview.widget.AbstractC1160i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onFocusSearchFailed(View view, int i, C1161j c1161j, C0038Av c0038Av) {
        View viewFindContainingItemView;
        int i2;
        if (getChildCount() == 0 || (viewFindContainingItemView = findContainingItemView(view)) == null) {
            return null;
        }
        m2213x();
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i == 66 ? this.f3993e == 0 : !(i != 130 || this.f3993e != 1)) {
                            i2 = 1;
                        }
                    } else if (this.f3993e == 1) {
                        i2 = -1;
                    }
                    i2 = Integer.MIN_VALUE;
                } else if (this.f3993e != 0) {
                    i2 = Integer.MIN_VALUE;
                }
            } else if (this.f3993e != 1 && isLayoutRTL()) {
            }
        } else if (this.f3993e != 1 && isLayoutRTL()) {
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        C0771Ry c0771Ry = (C0771Ry) viewFindContainingItemView.getLayoutParams();
        c0771Ry.getClass();
        C0161Dp c0161Dp = c0771Ry.f2444e;
        int iM2201l = i2 == 1 ? m2201l() : m2200k();
        m2215z(iM2201l, c0038Av);
        m2214y(i2);
        C0116Cn c0116Cn = this.f3995g;
        c0116Cn.f278c = c0116Cn.f279d + iM2201l;
        c0116Cn.f277b = (int) (this.f3991c.mo5261l() * 0.33333334f);
        c0116Cn.f283h = true;
        c0116Cn.f276a = false;
        m2195f(c1161j, c0116Cn, c0038Av);
        this.f4003o = this.f3997i;
        View viewM309h = c0161Dp.m309h(iM2201l, i2);
        if (viewM309h != null && viewM309h != viewFindContainingItemView) {
            return viewM309h;
        }
        if (m2208s(i2)) {
            for (int i3 = this.f3989a - 1; i3 >= 0; i3--) {
                View viewM309h2 = this.f3990b[i3].m309h(iM2201l, i2);
                if (viewM309h2 != null && viewM309h2 != viewFindContainingItemView) {
                    return viewM309h2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f3989a; i4++) {
                View viewM309h3 = this.f3990b[i4].m309h(iM2201l, i2);
                if (viewM309h3 != null && viewM309h3 != viewFindContainingItemView) {
                    return viewM309h3;
                }
            }
        }
        boolean z = (this.f3996h ^ true) == (i2 == -1);
        View viewFindViewByPosition = findViewByPosition(z ? c0161Dp.m304c() : c0161Dp.m305d());
        if (viewFindViewByPosition != null && viewFindViewByPosition != viewFindContainingItemView) {
            return viewFindViewByPosition;
        }
        if (m2208s(i2)) {
            for (int i5 = this.f3989a - 1; i5 >= 0; i5--) {
                if (i5 != c0161Dp.f441e) {
                    View viewFindViewByPosition2 = findViewByPosition(z ? this.f3990b[i5].m304c() : this.f3990b[i5].m305d());
                    if (viewFindViewByPosition2 != null && viewFindViewByPosition2 != viewFindContainingItemView) {
                        return viewFindViewByPosition2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f3989a; i6++) {
                View viewFindViewByPosition3 = findViewByPosition(z ? this.f3990b[i6].m304c() : this.f3990b[i6].m305d());
                if (viewFindViewByPosition3 != null && viewFindViewByPosition3 != viewFindContainingItemView) {
                    return viewFindViewByPosition3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View viewM2197h = m2197h(false);
            View viewM2196g = m2196g(false);
            if (viewM2197h == null || viewM2196g == null) {
                return;
            }
            int position = getPosition(viewM2197h);
            int position2 = getPosition(viewM2196g);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        m2204o(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f4001m.m634a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        m2204o(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        m2204o(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        m2204o(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onLayoutChildren(C1161j c1161j, C0038Av c0038Av) {
        m2207r(c1161j, c0038Av, true);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onLayoutCompleted(C0038Av c0038Av) {
        this.f3999k = -1;
        this.f4000l = Integer.MIN_VALUE;
        this.f4005q = null;
        this.f4007s.m1517a();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C0857Ty) {
            C0857Ty c0857Ty = (C0857Ty) parcelable;
            this.f4005q = c0857Ty;
            if (this.f3999k != -1) {
                c0857Ty.f2710a = -1;
                c0857Ty.f2711b = -1;
                c0857Ty.f2713d = null;
                c0857Ty.f2712c = 0;
                c0857Ty.f2714e = 0;
                c0857Ty.f2715f = null;
                c0857Ty.f2716g = null;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final Parcelable onSaveInstanceState() {
        int iM310i;
        int iMo5260k;
        int[] iArr;
        C0857Ty c0857Ty = this.f4005q;
        if (c0857Ty != null) {
            C0857Ty c0857Ty2 = new C0857Ty();
            c0857Ty2.f2712c = c0857Ty.f2712c;
            c0857Ty2.f2710a = c0857Ty.f2710a;
            c0857Ty2.f2711b = c0857Ty.f2711b;
            c0857Ty2.f2713d = c0857Ty.f2713d;
            c0857Ty2.f2714e = c0857Ty.f2714e;
            c0857Ty2.f2715f = c0857Ty.f2715f;
            c0857Ty2.f2717h = c0857Ty.f2717h;
            c0857Ty2.f2718i = c0857Ty.f2718i;
            c0857Ty2.f2719j = c0857Ty.f2719j;
            c0857Ty2.f2716g = c0857Ty.f2716g;
            return c0857Ty2;
        }
        C0857Ty c0857Ty3 = new C0857Ty();
        c0857Ty3.f2717h = this.f3996h;
        c0857Ty3.f2718i = this.f4003o;
        c0857Ty3.f2719j = this.f4004p;
        C0299Gy c0299Gy = this.f4001m;
        if (c0299Gy == null || (iArr = (int[]) c0299Gy.f1012b) == null) {
            c0857Ty3.f2714e = 0;
        } else {
            c0857Ty3.f2715f = iArr;
            c0857Ty3.f2714e = iArr.length;
            c0857Ty3.f2716g = (ArrayList) c0299Gy.f1013c;
        }
        if (getChildCount() <= 0) {
            c0857Ty3.f2710a = -1;
            c0857Ty3.f2711b = -1;
            c0857Ty3.f2712c = 0;
            return c0857Ty3;
        }
        c0857Ty3.f2710a = this.f4003o ? m2201l() : m2200k();
        View viewM2196g = this.f3997i ? m2196g(true) : m2197h(true);
        c0857Ty3.f2711b = viewM2196g != null ? getPosition(viewM2196g) : -1;
        int i = this.f3989a;
        c0857Ty3.f2712c = i;
        c0857Ty3.f2713d = new int[i];
        for (int i2 = 0; i2 < this.f3989a; i2++) {
            if (this.f4003o) {
                iM310i = this.f3990b[i2].m308g(Integer.MIN_VALUE);
                if (iM310i != Integer.MIN_VALUE) {
                    iMo5260k = this.f3991c.mo5256g();
                    iM310i -= iMo5260k;
                }
            } else {
                iM310i = this.f3990b[i2].m310i(Integer.MIN_VALUE);
                if (iM310i != Integer.MIN_VALUE) {
                    iMo5260k = this.f3991c.mo5260k();
                    iM310i -= iMo5260k;
                }
            }
            c0857Ty3.f2713d[i2] = iM310i;
        }
        return c0857Ty3;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void onScrollStateChanged(int i) {
        if (i == 0) {
            m2193d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m2205p() {
        int childCount = getChildCount();
        int i = childCount - 1;
        BitSet bitSet = new BitSet(this.f3989a);
        bitSet.set(0, this.f3989a, true);
        byte b = (this.f3993e == 1 && isLayoutRTL()) ? (byte) 1 : (byte) -1;
        if (this.f3997i) {
            childCount = -1;
        } else {
            i = 0;
        }
        int i2 = i < childCount ? 1 : -1;
        while (i != childCount) {
            View childAt = getChildAt(i);
            C0771Ry c0771Ry = (C0771Ry) childAt.getLayoutParams();
            if (bitSet.get(c0771Ry.f2444e.f441e)) {
                C0161Dp c0161Dp = c0771Ry.f2444e;
                if (this.f3997i) {
                    int i3 = c0161Dp.f439c;
                    if (i3 == Integer.MIN_VALUE) {
                        c0161Dp.m302a();
                        i3 = c0161Dp.f439c;
                    }
                    if (i3 < this.f3991c.mo5256g()) {
                        ArrayList arrayList = (ArrayList) c0161Dp.f442f;
                        ((C0771Ry) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return childAt;
                    }
                } else {
                    int i4 = c0161Dp.f438b;
                    ArrayList arrayList2 = (ArrayList) c0161Dp.f442f;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) arrayList2.get(0);
                        C0771Ry c0771Ry2 = (C0771Ry) view.getLayoutParams();
                        c0161Dp.f438b = ((StaggeredGridLayoutManager) c0161Dp.f443g).f3991c.mo5254e(view);
                        c0771Ry2.getClass();
                        i4 = c0161Dp.f438b;
                    }
                    if (i4 > this.f3991c.mo5260k()) {
                        ((C0771Ry) ((View) arrayList2.get(0)).getLayoutParams()).getClass();
                        return childAt;
                    }
                }
                bitSet.clear(c0771Ry.f2444e.f441e);
            }
            i += i2;
            if (i != childCount) {
                View childAt2 = getChildAt(i);
                if (this.f3997i) {
                    int iMo5251b = this.f3991c.mo5251b(childAt);
                    int iMo5251b2 = this.f3991c.mo5251b(childAt2);
                    if (iMo5251b < iMo5251b2) {
                        return childAt;
                    }
                    if (iMo5251b == iMo5251b2) {
                        if ((c0771Ry.f2444e.f441e - ((C0771Ry) childAt2.getLayoutParams()).f2444e.f441e >= 0) == (b >= 0)) {
                            return childAt;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iMo5254e = this.f3991c.mo5254e(childAt);
                    int iMo5254e2 = this.f3991c.mo5254e(childAt2);
                    if (iMo5254e > iMo5254e2) {
                        return childAt;
                    }
                    if (iMo5254e == iMo5254e2) {
                        if ((c0771Ry.f2444e.f441e - ((C0771Ry) childAt2.getLayoutParams()).f2444e.f441e >= 0) == (b >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m2206q(View view, int i, int i2) {
        Rect rect = this.f4006r;
        calculateItemDecorationsForChild(view, rect);
        C0771Ry c0771Ry = (C0771Ry) view.getLayoutParams();
        int iM2191B = m2191B(i, ((ViewGroup.MarginLayoutParams) c0771Ry).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c0771Ry).rightMargin + rect.right);
        int iM2191B2 = m2191B(i2, ((ViewGroup.MarginLayoutParams) c0771Ry).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c0771Ry).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, iM2191B, iM2191B2, c0771Ry)) {
            view.measure(iM2191B, iM2191B2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0415  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2207r(C1161j c1161j, C0038Av c0038Av, boolean z) {
        C0857Ty c0857Ty;
        int position;
        int i;
        boolean z2;
        C0857Ty c0857Ty2 = this.f4005q;
        C0729Qy c0729Qy = this.f4007s;
        if (!(c0857Ty2 == null && this.f3999k == -1) && c0038Av.m58b() == 0) {
            removeAndRecycleAllViews(c1161j);
            c0729Qy.m1517a();
            return;
        }
        boolean z3 = c0729Qy.f2340e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = c0729Qy.f2342g;
        boolean z4 = true;
        boolean z5 = (z3 && this.f3999k == -1 && this.f4005q == null) ? false : true;
        C0299Gy c0299Gy = this.f4001m;
        if (z5) {
            c0729Qy.m1517a();
            C0857Ty c0857Ty3 = this.f4005q;
            if (c0857Ty3 != null) {
                int i2 = c0857Ty3.f2712c;
                if (i2 > 0) {
                    if (i2 == this.f3989a) {
                        for (int i3 = 0; i3 < this.f3989a; i3++) {
                            this.f3990b[i3].m303b();
                            C0857Ty c0857Ty4 = this.f4005q;
                            int iMo5256g = c0857Ty4.f2713d[i3];
                            if (iMo5256g != Integer.MIN_VALUE) {
                                iMo5256g += c0857Ty4.f2718i ? this.f3991c.mo5256g() : this.f3991c.mo5260k();
                            }
                            C0161Dp c0161Dp = this.f3990b[i3];
                            c0161Dp.f438b = iMo5256g;
                            c0161Dp.f439c = iMo5256g;
                        }
                    } else {
                        c0857Ty3.f2713d = null;
                        c0857Ty3.f2712c = 0;
                        c0857Ty3.f2714e = 0;
                        c0857Ty3.f2715f = null;
                        c0857Ty3.f2716g = null;
                        c0857Ty3.f2710a = c0857Ty3.f2711b;
                    }
                }
                C0857Ty c0857Ty5 = this.f4005q;
                this.f4004p = c0857Ty5.f2719j;
                boolean z6 = c0857Ty5.f2717h;
                assertNotInLayoutOrScroll(null);
                C0857Ty c0857Ty6 = this.f4005q;
                if (c0857Ty6 != null && c0857Ty6.f2717h != z6) {
                    c0857Ty6.f2717h = z6;
                }
                this.f3996h = z6;
                requestLayout();
                m2213x();
                C0857Ty c0857Ty7 = this.f4005q;
                int i4 = c0857Ty7.f2710a;
                if (i4 != -1) {
                    this.f3999k = i4;
                    c0729Qy.f2338c = c0857Ty7.f2718i;
                } else {
                    c0729Qy.f2338c = this.f3997i;
                }
                if (c0857Ty7.f2714e > 1) {
                    c0299Gy.f1012b = c0857Ty7.f2715f;
                    c0299Gy.f1013c = c0857Ty7.f2716g;
                }
            } else {
                m2213x();
                c0729Qy.f2338c = this.f3997i;
            }
            if (c0038Av.f82g || (i = this.f3999k) == -1) {
                if (this.f4003o) {
                    int iM58b = c0038Av.m58b();
                    int childCount = getChildCount();
                    for (int i5 = 0; i5 < childCount; i5++) {
                        int position2 = getPosition(getChildAt(i5));
                        if (position2 >= 0 && position2 < iM58b) {
                            position = position2;
                            break;
                        }
                    }
                    position = 0;
                    c0729Qy.f2336a = position;
                    c0729Qy.f2337b = Integer.MIN_VALUE;
                    c0729Qy.f2340e = true;
                } else {
                    int iM58b2 = c0038Av.m58b();
                    for (int childCount2 = getChildCount() - 1; childCount2 >= 0; childCount2--) {
                        position = getPosition(getChildAt(childCount2));
                        if (position >= 0 && position < iM58b2) {
                            break;
                        }
                    }
                    position = 0;
                    c0729Qy.f2336a = position;
                    c0729Qy.f2337b = Integer.MIN_VALUE;
                    c0729Qy.f2340e = true;
                }
            } else if (i < 0 || i >= c0038Av.m58b()) {
                this.f3999k = -1;
                this.f4000l = Integer.MIN_VALUE;
                if (this.f4003o) {
                }
            } else {
                C0857Ty c0857Ty8 = this.f4005q;
                if (c0857Ty8 == null || c0857Ty8.f2710a == -1 || c0857Ty8.f2712c < 1) {
                    View viewFindViewByPosition = findViewByPosition(this.f3999k);
                    if (viewFindViewByPosition != null) {
                        c0729Qy.f2336a = this.f3997i ? m2201l() : m2200k();
                        if (this.f4000l != Integer.MIN_VALUE) {
                            if (c0729Qy.f2338c) {
                                c0729Qy.f2337b = (this.f3991c.mo5256g() - this.f4000l) - this.f3991c.mo5251b(viewFindViewByPosition);
                            } else {
                                c0729Qy.f2337b = (this.f3991c.mo5260k() + this.f4000l) - this.f3991c.mo5254e(viewFindViewByPosition);
                            }
                        } else if (this.f3991c.mo5252c(viewFindViewByPosition) > this.f3991c.mo5261l()) {
                            c0729Qy.f2337b = c0729Qy.f2338c ? this.f3991c.mo5256g() : this.f3991c.mo5260k();
                        } else {
                            int iMo5254e = this.f3991c.mo5254e(viewFindViewByPosition) - this.f3991c.mo5260k();
                            if (iMo5254e < 0) {
                                c0729Qy.f2337b = -iMo5254e;
                            } else {
                                int iMo5256g2 = this.f3991c.mo5256g() - this.f3991c.mo5251b(viewFindViewByPosition);
                                if (iMo5256g2 < 0) {
                                    c0729Qy.f2337b = iMo5256g2;
                                } else {
                                    c0729Qy.f2337b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.f3999k;
                        c0729Qy.f2336a = i6;
                        int i7 = this.f4000l;
                        if (i7 == Integer.MIN_VALUE) {
                            if (getChildCount() == 0) {
                                z2 = this.f3997i;
                            } else if ((i6 < m2200k()) != this.f3997i) {
                            }
                            c0729Qy.f2338c = z2;
                            c0729Qy.f2337b = z2 ? staggeredGridLayoutManager.f3991c.mo5256g() : staggeredGridLayoutManager.f3991c.mo5260k();
                        } else if (c0729Qy.f2338c) {
                            c0729Qy.f2337b = staggeredGridLayoutManager.f3991c.mo5256g() - i7;
                        } else {
                            c0729Qy.f2337b = staggeredGridLayoutManager.f3991c.mo5260k() + i7;
                        }
                        c0729Qy.f2339d = true;
                    }
                } else {
                    c0729Qy.f2337b = Integer.MIN_VALUE;
                    c0729Qy.f2336a = this.f3999k;
                }
                c0729Qy.f2340e = true;
            }
        }
        if (this.f4005q == null && this.f3999k == -1 && (c0729Qy.f2338c != this.f4003o || isLayoutRTL() != this.f4004p)) {
            c0299Gy.m634a();
            c0729Qy.f2339d = true;
        }
        if (getChildCount() > 0 && ((c0857Ty = this.f4005q) == null || c0857Ty.f2712c < 1)) {
            if (c0729Qy.f2339d) {
                for (int i8 = 0; i8 < this.f3989a; i8++) {
                    this.f3990b[i8].m303b();
                    int i9 = c0729Qy.f2337b;
                    if (i9 != Integer.MIN_VALUE) {
                        C0161Dp c0161Dp2 = this.f3990b[i8];
                        c0161Dp2.f438b = i9;
                        c0161Dp2.f439c = i9;
                    }
                }
            } else if (z5 || c0729Qy.f2341f == null) {
                for (int i10 = 0; i10 < this.f3989a; i10++) {
                    C0161Dp c0161Dp3 = this.f3990b[i10];
                    boolean z7 = this.f3997i;
                    int i11 = c0729Qy.f2337b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) c0161Dp3.f443g;
                    int iM308g = z7 ? c0161Dp3.m308g(Integer.MIN_VALUE) : c0161Dp3.m310i(Integer.MIN_VALUE);
                    c0161Dp3.m303b();
                    if (iM308g != Integer.MIN_VALUE && ((!z7 || iM308g >= staggeredGridLayoutManager2.f3991c.mo5256g()) && (z7 || iM308g <= staggeredGridLayoutManager2.f3991c.mo5260k()))) {
                        if (i11 != Integer.MIN_VALUE) {
                            iM308g += i11;
                        }
                        c0161Dp3.f439c = iM308g;
                        c0161Dp3.f438b = iM308g;
                    }
                }
                C0161Dp[] c0161DpArr = this.f3990b;
                int length = c0161DpArr.length;
                int[] iArr = c0729Qy.f2341f;
                if (iArr == null || iArr.length < length) {
                    c0729Qy.f2341f = new int[staggeredGridLayoutManager.f3990b.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    c0729Qy.f2341f[i12] = c0161DpArr[i12].m310i(Integer.MIN_VALUE);
                }
            } else {
                for (int i13 = 0; i13 < this.f3989a; i13++) {
                    C0161Dp c0161Dp4 = this.f3990b[i13];
                    c0161Dp4.m303b();
                    int i14 = c0729Qy.f2341f[i13];
                    c0161Dp4.f438b = i14;
                    c0161Dp4.f439c = i14;
                }
            }
        }
        detachAndScrapAttachedViews(c1161j);
        C0116Cn c0116Cn = this.f3995g;
        c0116Cn.f276a = false;
        int iMo5261l = this.f3992d.mo5261l();
        this.f3994f = iMo5261l / this.f3989a;
        View.MeasureSpec.makeMeasureSpec(iMo5261l, this.f3992d.mo5258i());
        m2215z(c0729Qy.f2336a, c0038Av);
        if (c0729Qy.f2338c) {
            m2214y(-1);
            m2195f(c1161j, c0116Cn, c0038Av);
            m2214y(1);
            c0116Cn.f278c = c0729Qy.f2336a + c0116Cn.f279d;
            m2195f(c1161j, c0116Cn, c0038Av);
        } else {
            m2214y(1);
            m2195f(c1161j, c0116Cn, c0038Av);
            m2214y(-1);
            c0116Cn.f278c = c0729Qy.f2336a + c0116Cn.f279d;
            m2195f(c1161j, c0116Cn, c0038Av);
        }
        if (this.f3992d.mo5258i() != 1073741824) {
            int childCount3 = getChildCount();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < childCount3; i15++) {
                View childAt = getChildAt(i15);
                float fMo5252c = this.f3992d.mo5252c(childAt);
                if (fMo5252c >= fMax) {
                    ((C0771Ry) childAt.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fMo5252c);
                }
            }
            int i16 = this.f3994f;
            int iRound = Math.round(fMax * this.f3989a);
            if (this.f3992d.mo5258i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f3992d.mo5261l());
            }
            this.f3994f = iRound / this.f3989a;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f3992d.mo5258i());
            if (this.f3994f != i16) {
                for (int i17 = 0; i17 < childCount3; i17++) {
                    View childAt2 = getChildAt(i17);
                    C0771Ry c0771Ry = (C0771Ry) childAt2.getLayoutParams();
                    c0771Ry.getClass();
                    if (isLayoutRTL() && this.f3993e == 1) {
                        int i18 = -((this.f3989a - 1) - c0771Ry.f2444e.f441e);
                        childAt2.offsetLeftAndRight((this.f3994f * i18) - (i18 * i16));
                    } else {
                        int i19 = c0771Ry.f2444e.f441e;
                        int i20 = this.f3994f * i19;
                        int i21 = i19 * i16;
                        if (this.f3993e == 1) {
                            childAt2.offsetLeftAndRight(i20 - i21);
                        } else {
                            childAt2.offsetTopAndBottom(i20 - i21);
                        }
                    }
                }
            }
        }
        if (getChildCount() > 0) {
            if (this.f3997i) {
                m2198i(c1161j, c0038Av, true);
                m2199j(c1161j, c0038Av, false);
            } else {
                m2199j(c1161j, c0038Av, true);
                m2198i(c1161j, c0038Av, false);
            }
        }
        if (!z || c0038Av.f82g || this.f4002n == 0 || getChildCount() <= 0 || m2205p() == null) {
            z4 = false;
        } else {
            removeCallbacks(this.f4010v);
            if (!m2193d()) {
            }
        }
        if (c0038Av.f82g) {
            c0729Qy.m1517a();
        }
        this.f4003o = c0729Qy.f2338c;
        this.f4004p = isLayoutRTL();
        if (z4) {
            c0729Qy.m1517a();
            m2207r(c1161j, c0038Av, false);
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2208s(int i) {
        if (this.f3993e == 0) {
            return (i == -1) != this.f3997i;
        }
        return ((i == -1) == this.f3997i) == isLayoutRTL();
    }

    public final int scrollBy(int i, C1161j c1161j, C0038Av c0038Av) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        m2209t(i, c0038Av);
        C0116Cn c0116Cn = this.f3995g;
        int iM2195f = m2195f(c1161j, c0116Cn, c0038Av);
        if (c0116Cn.f277b >= iM2195f) {
            i = i < 0 ? -iM2195f : iM2195f;
        }
        this.f3991c.mo5264o(-i);
        this.f4003o = this.f3997i;
        c0116Cn.f277b = 0;
        m2210u(c1161j, c0116Cn);
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int scrollHorizontallyBy(int i, C1161j c1161j, C0038Av c0038Av) {
        return scrollBy(i, c1161j, c0038Av);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void scrollToPosition(int i) {
        C0857Ty c0857Ty = this.f4005q;
        if (c0857Ty != null && c0857Ty.f2710a != i) {
            c0857Ty.f2713d = null;
            c0857Ty.f2712c = 0;
            c0857Ty.f2710a = -1;
            c0857Ty.f2711b = -1;
        }
        this.f3999k = i;
        this.f4000l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final int scrollVerticallyBy(int i, C1161j c1161j, C0038Av c0038Av) {
        return scrollBy(i, c1161j, c0038Av);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f3993e == 1) {
            iChooseSize2 = AbstractC1160i.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            iChooseSize = AbstractC1160i.chooseSize(i, (this.f3994f * this.f3989a) + paddingRight, getMinimumWidth());
        } else {
            iChooseSize = AbstractC1160i.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            iChooseSize2 = AbstractC1160i.chooseSize(i2, (this.f3994f * this.f3989a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final void smoothScrollToPosition(RecyclerView recyclerView, C0038Av c0038Av, int i) {
        C2201lo c2201lo = new C2201lo(recyclerView.getContext());
        c2201lo.setTargetPosition(i);
        startSmoothScroll(c2201lo);
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final boolean supportsPredictiveItemAnimations() {
        return this.f4005q == null;
    }

    /* JADX INFO: renamed from: t */
    public final void m2209t(int i, C0038Av c0038Av) {
        int iM2200k;
        int i2;
        if (i > 0) {
            iM2200k = m2201l();
            i2 = 1;
        } else {
            iM2200k = m2200k();
            i2 = -1;
        }
        C0116Cn c0116Cn = this.f3995g;
        c0116Cn.f276a = true;
        m2215z(iM2200k, c0038Av);
        m2214y(i2);
        c0116Cn.f278c = iM2200k + c0116Cn.f279d;
        c0116Cn.f277b = Math.abs(i);
    }

    /* JADX INFO: renamed from: u */
    public final void m2210u(C1161j c1161j, C0116Cn c0116Cn) {
        if (!c0116Cn.f276a || c0116Cn.f284i) {
            return;
        }
        if (c0116Cn.f277b == 0) {
            if (c0116Cn.f280e == -1) {
                m2211v(c0116Cn.f282g, c1161j);
                return;
            } else {
                m2212w(c0116Cn.f281f, c1161j);
                return;
            }
        }
        int i = 1;
        if (c0116Cn.f280e == -1) {
            int i2 = c0116Cn.f281f;
            int iM310i = this.f3990b[0].m310i(i2);
            while (i < this.f3989a) {
                int iM310i2 = this.f3990b[i].m310i(i2);
                if (iM310i2 > iM310i) {
                    iM310i = iM310i2;
                }
                i++;
            }
            int i3 = i2 - iM310i;
            m2211v(i3 < 0 ? c0116Cn.f282g : c0116Cn.f282g - Math.min(i3, c0116Cn.f277b), c1161j);
            return;
        }
        int i4 = c0116Cn.f282g;
        int iM308g = this.f3990b[0].m308g(i4);
        while (i < this.f3989a) {
            int iM308g2 = this.f3990b[i].m308g(i4);
            if (iM308g2 < iM308g) {
                iM308g = iM308g2;
            }
            i++;
        }
        int i5 = iM308g - c0116Cn.f282g;
        m2212w(i5 < 0 ? c0116Cn.f281f : Math.min(i5, c0116Cn.f277b) + c0116Cn.f281f, c1161j);
    }

    /* JADX INFO: renamed from: v */
    public final void m2211v(int i, C1161j c1161j) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f3991c.mo5254e(childAt) < i || this.f3991c.mo5263n(childAt) < i) {
                return;
            }
            C0771Ry c0771Ry = (C0771Ry) childAt.getLayoutParams();
            c0771Ry.getClass();
            if (((ArrayList) c0771Ry.f2444e.f442f).size() == 1) {
                return;
            }
            C0161Dp c0161Dp = c0771Ry.f2444e;
            ArrayList arrayList = (ArrayList) c0161Dp.f442f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            C0771Ry c0771Ry2 = (C0771Ry) view.getLayoutParams();
            c0771Ry2.f2444e = null;
            if (c0771Ry2.f8526a.isRemoved() || c0771Ry2.f8526a.isUpdated()) {
                c0161Dp.f440d -= ((StaggeredGridLayoutManager) c0161Dp.f443g).f3991c.mo5252c(view);
            }
            if (size == 1) {
                c0161Dp.f438b = Integer.MIN_VALUE;
            }
            c0161Dp.f439c = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c1161j);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2212w(int i, C1161j c1161j) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f3991c.mo5251b(childAt) > i || this.f3991c.mo5262m(childAt) > i) {
                return;
            }
            C0771Ry c0771Ry = (C0771Ry) childAt.getLayoutParams();
            c0771Ry.getClass();
            if (((ArrayList) c0771Ry.f2444e.f442f).size() == 1) {
                return;
            }
            C0161Dp c0161Dp = c0771Ry.f2444e;
            ArrayList arrayList = (ArrayList) c0161Dp.f442f;
            View view = (View) arrayList.remove(0);
            C0771Ry c0771Ry2 = (C0771Ry) view.getLayoutParams();
            c0771Ry2.f2444e = null;
            if (arrayList.size() == 0) {
                c0161Dp.f439c = Integer.MIN_VALUE;
            }
            if (c0771Ry2.f8526a.isRemoved() || c0771Ry2.f8526a.isUpdated()) {
                c0161Dp.f440d -= ((StaggeredGridLayoutManager) c0161Dp.f443g).f3991c.mo5252c(view);
            }
            c0161Dp.f438b = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, c1161j);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m2213x() {
        if (this.f3993e == 1 || !isLayoutRTL()) {
            this.f3997i = this.f3996h;
        } else {
            this.f3997i = !this.f3996h;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m2214y(int i) {
        C0116Cn c0116Cn = this.f3995g;
        c0116Cn.f280e = i;
        c0116Cn.f279d = this.f3997i != (i == -1) ? -1 : 1;
    }

    /* JADX INFO: renamed from: z */
    public final void m2215z(int i, C0038Av c0038Av) {
        int iMo5261l;
        int iMo5261l2;
        int i2;
        C0116Cn c0116Cn = this.f3995g;
        boolean z = false;
        c0116Cn.f277b = 0;
        c0116Cn.f278c = i;
        if (!isSmoothScrolling() || (i2 = c0038Av.f76a) == -1) {
            iMo5261l = 0;
            iMo5261l2 = 0;
        } else {
            if (this.f3997i == (i2 < i)) {
                iMo5261l = this.f3991c.mo5261l();
                iMo5261l2 = 0;
            } else {
                iMo5261l2 = this.f3991c.mo5261l();
                iMo5261l = 0;
            }
        }
        if (getClipToPadding()) {
            c0116Cn.f281f = this.f3991c.mo5260k() - iMo5261l2;
            c0116Cn.f282g = this.f3991c.mo5256g() + iMo5261l;
        } else {
            c0116Cn.f282g = this.f3991c.mo5255f() + iMo5261l;
            c0116Cn.f281f = -iMo5261l2;
        }
        c0116Cn.f283h = false;
        c0116Cn.f276a = true;
        if (this.f3991c.mo5258i() == 0 && this.f3991c.mo5255f() == 0) {
            z = true;
        }
        c0116Cn.f284i = z;
    }

    @Override // androidx.recyclerview.widget.AbstractC1160i
    public final C2431qv generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0771Ry((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0771Ry(layoutParams);
    }
}
