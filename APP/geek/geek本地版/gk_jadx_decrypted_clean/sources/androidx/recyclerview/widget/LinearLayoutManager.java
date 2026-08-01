package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import p000.AbstractC0019ai;
import p000.AbstractC0540nz;
import p000.AbstractC0979zt;
import p000.C0074bn;
import p000.C0503mz;
import p000.C0577oz;
import p000.C0763tz;
import p000.C0791uq;
import p000.C0828vq;
import p000.C0865wq;
import p000.C0902xq;
import p000.C0939yq;
import p000.C0948yz;
import p000.InterfaceC0911xz;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0540nz implements InterfaceC0911xz {

    /* JADX INFO: renamed from: A */
    public final C0791uq f542A;

    /* JADX INFO: renamed from: B */
    public final C0828vq f543B;

    /* JADX INFO: renamed from: C */
    public final int f544C;

    /* JADX INFO: renamed from: D */
    public final int[] f545D;

    /* JADX INFO: renamed from: p */
    public int f546p;

    /* JADX INFO: renamed from: q */
    public C0865wq f547q;

    /* JADX INFO: renamed from: r */
    public AbstractC0019ai f548r;

    /* JADX INFO: renamed from: s */
    public boolean f549s;

    /* JADX INFO: renamed from: t */
    public final boolean f550t;

    /* JADX INFO: renamed from: u */
    public boolean f551u;

    /* JADX INFO: renamed from: v */
    public boolean f552v;

    /* JADX INFO: renamed from: w */
    public final boolean f553w;

    /* JADX INFO: renamed from: x */
    public int f554x;

    /* JADX INFO: renamed from: y */
    public int f555y;

    /* JADX INFO: renamed from: z */
    public C0902xq f556z;

    public LinearLayoutManager(int i) {
        this.f546p = 1;
        this.f550t = false;
        this.f551u = false;
        this.f552v = false;
        this.f553w = true;
        this.f554x = -1;
        this.f555y = Integer.MIN_VALUE;
        this.f556z = null;
        this.f542A = new C0791uq();
        this.f543B = new C0828vq();
        this.f544C = 2;
        this.f545D = new int[2];
        m347X0(i);
        mo353c(null);
        if (this.f550t) {
            this.f550t = false;
            m1971j0();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final int m324A0(C0948yz c0948yz) {
        if (m1980v() == 0) {
            return 0;
        }
        m328E0();
        AbstractC0019ai abstractC0019ai = this.f548r;
        boolean z = !this.f553w;
        return AbstractC0979zt.m2826g(c0948yz, abstractC0019ai, m331H0(z), m330G0(z), this, this.f553w);
    }

    /* JADX INFO: renamed from: B0 */
    public final int m325B0(C0948yz c0948yz) {
        if (m1980v() == 0) {
            return 0;
        }
        m328E0();
        AbstractC0019ai abstractC0019ai = this.f548r;
        boolean z = !this.f553w;
        return AbstractC0979zt.m2827h(c0948yz, abstractC0019ai, m331H0(z), m330G0(z), this, this.f553w, this.f551u);
    }

    /* JADX INFO: renamed from: C0 */
    public final int m326C0(C0948yz c0948yz) {
        if (m1980v() == 0) {
            return 0;
        }
        m328E0();
        AbstractC0019ai abstractC0019ai = this.f548r;
        boolean z = !this.f553w;
        return AbstractC0979zt.m2828i(c0948yz, abstractC0019ai, m331H0(z), m330G0(z), this, this.f553w);
    }

    /* JADX INFO: renamed from: D0 */
    public final int m327D0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f546p == 1) ? 1 : Integer.MIN_VALUE : this.f546p == 0 ? 1 : Integer.MIN_VALUE : this.f546p == 1 ? -1 : Integer.MIN_VALUE : this.f546p == 0 ? -1 : Integer.MIN_VALUE : (this.f546p != 1 && m341Q0()) ? -1 : 1 : (this.f546p != 1 && m341Q0()) ? 1 : -1;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m328E0() {
        if (this.f547q == null) {
            C0865wq c0865wq = new C0865wq();
            c0865wq.f5002a = true;
            c0865wq.f5009h = 0;
            c0865wq.f5010i = 0;
            c0865wq.f5012k = null;
            this.f547q = c0865wq;
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final int m329F0(C0763tz c0763tz, C0865wq c0865wq, C0948yz c0948yz, boolean z) {
        int i;
        int i2 = c0865wq.f5004c;
        int i3 = c0865wq.f5008g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0865wq.f5008g = i3 + i2;
            }
            m343T0(c0763tz, c0865wq);
        }
        int i4 = c0865wq.f5004c + c0865wq.f5009h;
        while (true) {
            if ((!c0865wq.f5013l && i4 <= 0) || (i = c0865wq.f5005d) < 0 || i >= c0948yz.m2745b()) {
                break;
            }
            C0828vq c0828vq = this.f543B;
            c0828vq.f4878a = 0;
            c0828vq.f4879b = false;
            c0828vq.f4880c = false;
            c0828vq.f4881d = false;
            mo290R0(c0763tz, c0948yz, c0865wq, c0828vq);
            if (!c0828vq.f4879b) {
                int i5 = c0865wq.f5003b;
                int i6 = c0828vq.f4878a;
                c0865wq.f5003b = (c0865wq.f5007f * i6) + i5;
                if (!c0828vq.f4880c || c0865wq.f5012k != null || !c0948yz.f5421g) {
                    c0865wq.f5004c -= i6;
                    i4 -= i6;
                }
                int i7 = c0865wq.f5008g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0865wq.f5008g = i8;
                    int i9 = c0865wq.f5004c;
                    if (i9 < 0) {
                        c0865wq.f5008g = i8 + i9;
                    }
                    m343T0(c0763tz, c0865wq);
                }
                if (z && c0828vq.f4881d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0865wq.f5004c;
    }

    /* JADX INFO: renamed from: G0 */
    public final View m330G0(boolean z) {
        return this.f551u ? m335K0(0, m1980v(), z) : m335K0(m1980v() - 1, -1, z);
    }

    /* JADX INFO: renamed from: H0 */
    public final View m331H0(boolean z) {
        return this.f551u ? m335K0(m1980v() - 1, -1, z) : m335K0(0, m1980v(), z);
    }

    /* JADX INFO: renamed from: I0 */
    public final int m332I0() {
        View viewM335K0 = m335K0(m1980v() - 1, -1, false);
        if (viewM335K0 == null) {
            return -1;
        }
        return AbstractC0540nz.m1953F(viewM335K0);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: J */
    public final boolean mo333J() {
        return true;
    }

    /* JADX INFO: renamed from: J0 */
    public final View m334J0(int i, int i2) {
        int i3;
        int i4;
        m328E0();
        if (i2 <= i && i2 >= i) {
            return m1978u(i);
        }
        if (this.f548r.mo101e(m1978u(i)) < this.f548r.mo107k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f546p == 0 ? this.f3457c.m898s(i, i2, i3, i4) : this.f3458d.m898s(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: K0 */
    public final View m335K0(int i, int i2, boolean z) {
        m328E0();
        int i3 = z ? 24579 : 320;
        return this.f546p == 0 ? this.f3457c.m898s(i, i2, i3, 320) : this.f3458d.m898s(i, i2, i3, 320);
    }

    /* JADX INFO: renamed from: L0 */
    public View mo288L0(C0763tz c0763tz, C0948yz c0948yz, int i, int i2, int i3) {
        m328E0();
        int iMo107k = this.f548r.mo107k();
        int iMo103g = this.f548r.mo103g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewM1978u = m1978u(i);
            int iM1953F = AbstractC0540nz.m1953F(viewM1978u);
            if (iM1953F >= 0 && iM1953F < i3) {
                if (((C0577oz) viewM1978u.getLayoutParams()).f3621a.m488h()) {
                    if (view2 == null) {
                        view2 = viewM1978u;
                    }
                } else {
                    if (this.f548r.mo101e(viewM1978u) < iMo103g && this.f548r.mo98b(viewM1978u) >= iMo107k) {
                        return viewM1978u;
                    }
                    if (view == null) {
                        view = viewM1978u;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX INFO: renamed from: M0 */
    public final int m336M0(int i, C0763tz c0763tz, C0948yz c0948yz, boolean z) {
        int iMo103g;
        int iMo103g2 = this.f548r.mo103g() - i;
        if (iMo103g2 <= 0) {
            return 0;
        }
        int i2 = -m346W0(-iMo103g2, c0763tz, c0948yz);
        int i3 = i + i2;
        if (!z || (iMo103g = this.f548r.mo103g() - i3) <= 0) {
            return i2;
        }
        this.f548r.mo111o(iMo103g);
        return iMo103g + i2;
    }

    /* JADX INFO: renamed from: N0 */
    public final int m337N0(int i, C0763tz c0763tz, C0948yz c0948yz, boolean z) {
        int iMo107k;
        int iMo107k2 = i - this.f548r.mo107k();
        if (iMo107k2 <= 0) {
            return 0;
        }
        int i2 = -m346W0(iMo107k2, c0763tz, c0948yz);
        int i3 = i + i2;
        if (!z || (iMo107k = i3 - this.f548r.mo107k()) <= 0) {
            return i2;
        }
        this.f548r.mo111o(-iMo107k);
        return i2 - iMo107k;
    }

    /* JADX INFO: renamed from: O0 */
    public final View m338O0() {
        return m1978u(this.f551u ? 0 : m1980v() - 1);
    }

    /* JADX INFO: renamed from: P0 */
    public final View m340P0() {
        return m1978u(this.f551u ? m1980v() - 1 : 0);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: Q */
    public View mo289Q(View view, int i, C0763tz c0763tz, C0948yz c0948yz) {
        int iM327D0;
        m345V0();
        if (m1980v() != 0 && (iM327D0 = m327D0(i)) != Integer.MIN_VALUE) {
            m328E0();
            m348Z0(iM327D0, (int) (this.f548r.mo108l() * 0.33333334f), false, c0948yz);
            C0865wq c0865wq = this.f547q;
            c0865wq.f5008g = Integer.MIN_VALUE;
            c0865wq.f5002a = false;
            m329F0(c0763tz, c0865wq, c0948yz, true);
            View viewM334J0 = iM327D0 == -1 ? this.f551u ? m334J0(m1980v() - 1, -1) : m334J0(0, m1980v()) : this.f551u ? m334J0(0, m1980v()) : m334J0(m1980v() - 1, -1);
            View viewM340P0 = iM327D0 == -1 ? m340P0() : m338O0();
            if (!viewM340P0.hasFocusable()) {
                return viewM334J0;
            }
            if (viewM334J0 != null) {
                return viewM340P0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m341Q0() {
        return m1959A() == 1;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: R */
    public final void mo342R(AccessibilityEvent accessibilityEvent) {
        super.mo342R(accessibilityEvent);
        if (m1980v() > 0) {
            View viewM335K0 = m335K0(0, m1980v(), false);
            accessibilityEvent.setFromIndex(viewM335K0 == null ? -1 : AbstractC0540nz.m1953F(viewM335K0));
            accessibilityEvent.setToIndex(m332I0());
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void mo290R0(C0763tz c0763tz, C0948yz c0948yz, C0865wq c0865wq, C0828vq c0828vq) {
        int iM1961C;
        int i;
        int i2;
        int iMo100d;
        View viewM2594b = c0865wq.m2594b(c0763tz);
        if (viewM2594b == null) {
            c0828vq.f4879b = true;
            return;
        }
        C0577oz c0577oz = (C0577oz) viewM2594b.getLayoutParams();
        if (c0865wq.f5012k == null) {
            if (this.f551u == (c0865wq.f5007f == -1)) {
                m1966b(viewM2594b, -1, false);
            } else {
                m1966b(viewM2594b, 0, false);
            }
        } else {
            if (this.f551u == (c0865wq.f5007f == -1)) {
                m1966b(viewM2594b, -1, true);
            } else {
                m1966b(viewM2594b, 0, true);
            }
        }
        C0577oz c0577oz2 = (C0577oz) viewM2594b.getLayoutParams();
        Rect rectM380J = this.f3456b.m380J(viewM2594b);
        int i3 = rectM380J.left + rectM380J.right;
        int i4 = rectM380J.top + rectM380J.bottom;
        int iM1958w = AbstractC0540nz.m1958w(mo355d(), this.f3468n, this.f3466l, m1962D() + m1961C() + ((ViewGroup.MarginLayoutParams) c0577oz2).leftMargin + ((ViewGroup.MarginLayoutParams) c0577oz2).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c0577oz2).width);
        int iM1958w2 = AbstractC0540nz.m1958w(mo356e(), this.f3469o, this.f3467m, m1960B() + m1963E() + ((ViewGroup.MarginLayoutParams) c0577oz2).topMargin + ((ViewGroup.MarginLayoutParams) c0577oz2).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c0577oz2).height);
        if (m1977s0(viewM2594b, iM1958w, iM1958w2, c0577oz2)) {
            viewM2594b.measure(iM1958w, iM1958w2);
        }
        c0828vq.f4878a = this.f548r.mo99c(viewM2594b);
        if (this.f546p == 1) {
            if (m341Q0()) {
                iMo100d = this.f3468n - m1962D();
                iM1961C = iMo100d - this.f548r.mo100d(viewM2594b);
            } else {
                iM1961C = m1961C();
                iMo100d = this.f548r.mo100d(viewM2594b) + iM1961C;
            }
            if (c0865wq.f5007f == -1) {
                i = c0865wq.f5003b;
                i2 = i - c0828vq.f4878a;
            } else {
                i2 = c0865wq.f5003b;
                i = c0828vq.f4878a + i2;
            }
        } else {
            int iM1963E = m1963E();
            int iMo100d2 = this.f548r.mo100d(viewM2594b) + iM1963E;
            if (c0865wq.f5007f == -1) {
                int i5 = c0865wq.f5003b;
                int i6 = i5 - c0828vq.f4878a;
                iMo100d = i5;
                i = iMo100d2;
                iM1961C = i6;
                i2 = iM1963E;
            } else {
                int i7 = c0865wq.f5003b;
                int i8 = c0828vq.f4878a + i7;
                iM1961C = i7;
                i = iMo100d2;
                i2 = iM1963E;
                iMo100d = i8;
            }
        }
        AbstractC0540nz.m1956L(viewM2594b, iM1961C, i2, iMo100d, i);
        if (c0577oz.f3621a.m488h() || c0577oz.f3621a.m491k()) {
            c0828vq.f4880c = true;
        }
        c0828vq.f4881d = viewM2594b.hasFocusable();
    }

    /* JADX INFO: renamed from: T0 */
    public final void m343T0(C0763tz c0763tz, C0865wq c0865wq) {
        if (!c0865wq.f5002a || c0865wq.f5013l) {
            return;
        }
        int i = c0865wq.f5008g;
        int i2 = c0865wq.f5010i;
        if (c0865wq.f5007f == -1) {
            int iM1980v = m1980v();
            if (i < 0) {
                return;
            }
            int iMo102f = (this.f548r.mo102f() - i) + i2;
            if (this.f551u) {
                for (int i3 = 0; i3 < iM1980v; i3++) {
                    View viewM1978u = m1978u(i3);
                    if (this.f548r.mo101e(viewM1978u) < iMo102f || this.f548r.mo110n(viewM1978u) < iMo102f) {
                        m344U0(c0763tz, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM1980v - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM1978u2 = m1978u(i5);
                if (this.f548r.mo101e(viewM1978u2) < iMo102f || this.f548r.mo110n(viewM1978u2) < iMo102f) {
                    m344U0(c0763tz, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM1980v2 = m1980v();
        if (!this.f551u) {
            for (int i7 = 0; i7 < iM1980v2; i7++) {
                View viewM1978u3 = m1978u(i7);
                if (this.f548r.mo98b(viewM1978u3) > i6 || this.f548r.mo109m(viewM1978u3) > i6) {
                    m344U0(c0763tz, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM1980v2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM1978u4 = m1978u(i9);
            if (this.f548r.mo98b(viewM1978u4) > i6 || this.f548r.mo109m(viewM1978u4) > i6) {
                m344U0(c0763tz, i8, i9);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m344U0(C0763tz c0763tz, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewM1978u = m1978u(i);
                m1970h0(i);
                c0763tz.m2398f(viewM1978u);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewM1978u2 = m1978u(i3);
            m1970h0(i3);
            c0763tz.m2398f(viewM1978u2);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m345V0() {
        if (this.f546p == 1 || !m341Q0()) {
            this.f551u = this.f550t;
        } else {
            this.f551u = !this.f550t;
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final int m346W0(int i, C0763tz c0763tz, C0948yz c0948yz) {
        if (m1980v() != 0 && i != 0) {
            m328E0();
            this.f547q.f5002a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            m348Z0(i2, iAbs, true, c0948yz);
            C0865wq c0865wq = this.f547q;
            int iM329F0 = m329F0(c0763tz, c0865wq, c0948yz, false) + c0865wq.f5008g;
            if (iM329F0 >= 0) {
                if (iAbs > iM329F0) {
                    i = i2 * iM329F0;
                }
                this.f548r.mo111o(-i);
                this.f547q.f5011j = i;
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m347X0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        mo353c(null);
        if (i != this.f546p || this.f548r == null) {
            AbstractC0019ai abstractC0019aiM97a = AbstractC0019ai.m97a(this, i);
            this.f548r = abstractC0019aiM97a;
            this.f542A.f4750a = abstractC0019aiM97a;
            this.f546p = i;
            m1971j0();
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void mo298Y0(boolean z) {
        mo353c(null);
        if (this.f552v == z) {
            return;
        }
        this.f552v = z;
        m1971j0();
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0196  */
    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo299Z(p000.C0763tz r18, p000.C0948yz r19) {
        /*
            Method dump skipped, instruction units count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo299Z(tz, yz):void");
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m348Z0(int i, int i2, boolean z, C0948yz c0948yz) {
        int iMo107k;
        this.f547q.f5013l = this.f548r.mo105i() == 0 && this.f548r.mo102f() == 0;
        this.f547q.f5007f = i;
        int[] iArr = this.f545D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo365y0(c0948yz, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        C0865wq c0865wq = this.f547q;
        int i3 = z2 ? iMax2 : iMax;
        c0865wq.f5009h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c0865wq.f5010i = iMax;
        if (z2) {
            c0865wq.f5009h = this.f548r.mo104h() + i3;
            View viewM338O0 = m338O0();
            C0865wq c0865wq2 = this.f547q;
            c0865wq2.f5006e = this.f551u ? -1 : 1;
            int iM1953F = AbstractC0540nz.m1953F(viewM338O0);
            C0865wq c0865wq3 = this.f547q;
            c0865wq2.f5005d = iM1953F + c0865wq3.f5006e;
            c0865wq3.f5003b = this.f548r.mo98b(viewM338O0);
            iMo107k = this.f548r.mo98b(viewM338O0) - this.f548r.mo103g();
        } else {
            View viewM340P0 = m340P0();
            C0865wq c0865wq4 = this.f547q;
            c0865wq4.f5009h = this.f548r.mo107k() + c0865wq4.f5009h;
            C0865wq c0865wq5 = this.f547q;
            c0865wq5.f5006e = this.f551u ? 1 : -1;
            int iM1953F2 = AbstractC0540nz.m1953F(viewM340P0);
            C0865wq c0865wq6 = this.f547q;
            c0865wq5.f5005d = iM1953F2 + c0865wq6.f5006e;
            c0865wq6.f5003b = this.f548r.mo101e(viewM340P0);
            iMo107k = (-this.f548r.mo101e(viewM340P0)) + this.f548r.mo107k();
        }
        C0865wq c0865wq7 = this.f547q;
        c0865wq7.f5004c = i2;
        if (z) {
            c0865wq7.f5004c = i2 - iMo107k;
        }
        c0865wq7.f5008g = iMo107k;
    }

    @Override // p000.InterfaceC0911xz
    /* JADX INFO: renamed from: a */
    public final PointF mo349a(int i) {
        if (m1980v() == 0) {
            return null;
        }
        int i2 = (i < AbstractC0540nz.m1953F(m1978u(0))) != this.f551u ? -1 : 1;
        return this.f546p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: a0 */
    public void mo300a0(C0948yz c0948yz) {
        this.f556z = null;
        this.f554x = -1;
        this.f555y = Integer.MIN_VALUE;
        this.f542A.m2467d();
    }

    /* JADX INFO: renamed from: a1 */
    public final void m350a1(int i, int i2) {
        this.f547q.f5004c = this.f548r.mo103g() - i2;
        C0865wq c0865wq = this.f547q;
        c0865wq.f5006e = this.f551u ? -1 : 1;
        c0865wq.f5005d = i;
        c0865wq.f5007f = 1;
        c0865wq.f5003b = i2;
        c0865wq.f5008g = Integer.MIN_VALUE;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: b0 */
    public final void mo351b0(Parcelable parcelable) {
        if (parcelable instanceof C0902xq) {
            this.f556z = (C0902xq) parcelable;
            m1971j0();
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final void m352b1(int i, int i2) {
        this.f547q.f5004c = i2 - this.f548r.mo107k();
        C0865wq c0865wq = this.f547q;
        c0865wq.f5005d = i;
        c0865wq.f5006e = this.f551u ? 1 : -1;
        c0865wq.f5007f = -1;
        c0865wq.f5003b = i2;
        c0865wq.f5008g = Integer.MIN_VALUE;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: c */
    public final void mo353c(String str) {
        if (this.f556z == null) {
            super.mo353c(str);
        }
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: c0 */
    public final Parcelable mo354c0() {
        C0902xq c0902xq = this.f556z;
        if (c0902xq != null) {
            C0902xq c0902xq2 = new C0902xq();
            c0902xq2.f5182a = c0902xq.f5182a;
            c0902xq2.f5183b = c0902xq.f5183b;
            c0902xq2.f5184c = c0902xq.f5184c;
            return c0902xq2;
        }
        C0902xq c0902xq3 = new C0902xq();
        if (m1980v() <= 0) {
            c0902xq3.f5182a = -1;
            return c0902xq3;
        }
        m328E0();
        boolean z = this.f549s ^ this.f551u;
        c0902xq3.f5184c = z;
        if (z) {
            View viewM338O0 = m338O0();
            c0902xq3.f5183b = this.f548r.mo103g() - this.f548r.mo98b(viewM338O0);
            c0902xq3.f5182a = AbstractC0540nz.m1953F(viewM338O0);
            return c0902xq3;
        }
        View viewM340P0 = m340P0();
        c0902xq3.f5182a = AbstractC0540nz.m1953F(viewM340P0);
        c0902xq3.f5183b = this.f548r.mo101e(viewM340P0) - this.f548r.mo107k();
        return c0902xq3;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: d */
    public final boolean mo355d() {
        return this.f546p == 0;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: e */
    public final boolean mo356e() {
        return this.f546p == 1;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: h */
    public final void mo357h(int i, int i2, C0948yz c0948yz, C0074bn c0074bn) {
        if (this.f546p != 0) {
            i = i2;
        }
        if (m1980v() == 0 || i == 0) {
            return;
        }
        m328E0();
        m348Z0(i > 0 ? 1 : -1, Math.abs(i), true, c0948yz);
        mo323z0(c0948yz, this.f547q, c0074bn);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: i */
    public final void mo358i(int i, C0074bn c0074bn) {
        boolean z;
        int i2;
        C0902xq c0902xq = this.f556z;
        if (c0902xq == null || (i2 = c0902xq.f5182a) < 0) {
            m345V0();
            z = this.f551u;
            i2 = this.f554x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = c0902xq.f5184c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f544C && i2 >= 0 && i2 < i; i4++) {
            c0074bn.m562a(i2, 0);
            i2 += i3;
        }
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: j */
    public final int mo359j(C0948yz c0948yz) {
        return m324A0(c0948yz);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: k */
    public int mo310k(C0948yz c0948yz) {
        return m325B0(c0948yz);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: k0 */
    public int mo311k0(int i, C0763tz c0763tz, C0948yz c0948yz) {
        if (this.f546p == 1) {
            return 0;
        }
        return m346W0(i, c0763tz, c0948yz);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: l */
    public int mo313l(C0948yz c0948yz) {
        return m326C0(c0948yz);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: l0 */
    public final void mo360l0(int i) {
        this.f554x = i;
        this.f555y = Integer.MIN_VALUE;
        C0902xq c0902xq = this.f556z;
        if (c0902xq != null) {
            c0902xq.f5182a = -1;
        }
        m1971j0();
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: m */
    public final int mo361m(C0948yz c0948yz) {
        return m324A0(c0948yz);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: m0 */
    public int mo314m0(int i, C0763tz c0763tz, C0948yz c0948yz) {
        if (this.f546p == 0) {
            return 0;
        }
        return m346W0(i, c0763tz, c0948yz);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: n */
    public int mo315n(C0948yz c0948yz) {
        return m325B0(c0948yz);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: o */
    public int mo316o(C0948yz c0948yz) {
        return m326C0(c0948yz);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: q */
    public final View mo362q(int i) {
        int iM1980v = m1980v();
        if (iM1980v == 0) {
            return null;
        }
        int iM1953F = i - AbstractC0540nz.m1953F(m1978u(0));
        if (iM1953F >= 0 && iM1953F < iM1980v) {
            View viewM1978u = m1978u(iM1953F);
            if (AbstractC0540nz.m1953F(viewM1978u) == i) {
                return viewM1978u;
            }
        }
        return super.mo362q(i);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: r */
    public C0577oz mo318r() {
        return new C0577oz(-2, -2);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: t0 */
    public final boolean mo363t0() {
        if (this.f3467m != 1073741824 && this.f3466l != 1073741824) {
            int iM1980v = m1980v();
            for (int i = 0; i < iM1980v; i++) {
                ViewGroup.LayoutParams layoutParams = m1978u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: v0 */
    public void mo364v0(RecyclerView recyclerView, int i) {
        C0939yq c0939yq = new C0939yq(recyclerView.getContext());
        c0939yq.f5379a = i;
        m1981w0(c0939yq);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: x0 */
    public boolean mo322x0() {
        return this.f556z == null && this.f549s == this.f552v;
    }

    /* JADX INFO: renamed from: y0 */
    public void mo365y0(C0948yz c0948yz, int[] iArr) {
        int i;
        int iMo108l = c0948yz.f5415a != -1 ? this.f548r.mo108l() : 0;
        if (this.f547q.f5007f == -1) {
            i = 0;
        } else {
            i = iMo108l;
            iMo108l = 0;
        }
        iArr[0] = iMo108l;
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: z0 */
    public void mo323z0(C0948yz c0948yz, C0865wq c0865wq, C0074bn c0074bn) {
        int i = c0865wq.f5005d;
        if (i < 0 || i >= c0948yz.m2745b()) {
            return;
        }
        c0074bn.m562a(i, Math.max(0, c0865wq.f5008g));
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f546p = 1;
        this.f550t = false;
        this.f551u = false;
        this.f552v = false;
        this.f553w = true;
        this.f554x = -1;
        this.f555y = Integer.MIN_VALUE;
        this.f556z = null;
        this.f542A = new C0791uq();
        this.f543B = new C0828vq();
        this.f544C = 2;
        this.f545D = new int[2];
        C0503mz c0503mzM1954G = AbstractC0540nz.m1954G(context, attributeSet, i, i2);
        m347X0(c0503mzM1954G.f3297a);
        boolean z = c0503mzM1954G.f3299c;
        mo353c(null);
        if (z != this.f550t) {
            this.f550t = z;
            m1971j0();
        }
        mo298Y0(c0503mzM1954G.f3300d);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: P */
    public final void mo339P(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: S0 */
    public void mo292S0(C0763tz c0763tz, C0948yz c0948yz, C0791uq c0791uq, int i) {
    }
}
