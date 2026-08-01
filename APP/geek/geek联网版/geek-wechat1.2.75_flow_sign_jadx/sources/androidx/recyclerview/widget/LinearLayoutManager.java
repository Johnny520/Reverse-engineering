package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import p000.AbstractC0105ci;
import p000.AbstractC0498mu;
import p000.AbstractC0799uz;
import p000.C0041ar;
import p000.C0078br;
import p000.C0124cr;
import p000.C0157dn;
import p000.C0762tz;
import p000.C0836vz;
import p000.C0939yq;
import p000.C0976zq;
import p000.a00;
import p000.e00;
import p000.f00;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0799uz implements e00 {

    /* JADX INFO: renamed from: A */
    public final C0939yq f505A;

    /* JADX INFO: renamed from: B */
    public final C0976zq f506B;

    /* JADX INFO: renamed from: C */
    public final int f507C;

    /* JADX INFO: renamed from: D */
    public final int[] f508D;

    /* JADX INFO: renamed from: p */
    public int f509p;

    /* JADX INFO: renamed from: q */
    public C0041ar f510q;

    /* JADX INFO: renamed from: r */
    public AbstractC0105ci f511r;

    /* JADX INFO: renamed from: s */
    public boolean f512s;

    /* JADX INFO: renamed from: t */
    public final boolean f513t;

    /* JADX INFO: renamed from: u */
    public boolean f514u;

    /* JADX INFO: renamed from: v */
    public boolean f515v;

    /* JADX INFO: renamed from: w */
    public final boolean f516w;

    /* JADX INFO: renamed from: x */
    public int f517x;

    /* JADX INFO: renamed from: y */
    public int f518y;

    /* JADX INFO: renamed from: z */
    public C0078br f519z;

    public LinearLayoutManager(int i) {
        this.f509p = 1;
        this.f513t = false;
        this.f514u = false;
        this.f515v = false;
        this.f516w = true;
        this.f517x = -1;
        this.f518y = Integer.MIN_VALUE;
        this.f519z = null;
        this.f505A = new C0939yq();
        this.f506B = new C0976zq();
        this.f507C = 2;
        this.f508D = new int[2];
        m332X0(i);
        mo338c(null);
        if (this.f513t) {
            this.f513t = false;
            m2519j0();
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final int m309A0(f00 f00Var) {
        if (m2528v() == 0) {
            return 0;
        }
        m313E0();
        AbstractC0105ci abstractC0105ci = this.f511r;
        boolean z = !this.f516w;
        return AbstractC0498mu.m1889h(f00Var, abstractC0105ci, m316H0(z), m315G0(z), this, this.f516w);
    }

    /* JADX INFO: renamed from: B0 */
    public final int m310B0(f00 f00Var) {
        if (m2528v() == 0) {
            return 0;
        }
        m313E0();
        AbstractC0105ci abstractC0105ci = this.f511r;
        boolean z = !this.f516w;
        return AbstractC0498mu.m1890i(f00Var, abstractC0105ci, m316H0(z), m315G0(z), this, this.f516w, this.f514u);
    }

    /* JADX INFO: renamed from: C0 */
    public final int m311C0(f00 f00Var) {
        if (m2528v() == 0) {
            return 0;
        }
        m313E0();
        AbstractC0105ci abstractC0105ci = this.f511r;
        boolean z = !this.f516w;
        return AbstractC0498mu.m1891j(f00Var, abstractC0105ci, m316H0(z), m315G0(z), this, this.f516w);
    }

    /* JADX INFO: renamed from: D0 */
    public final int m312D0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f509p == 1) ? 1 : Integer.MIN_VALUE : this.f509p == 0 ? 1 : Integer.MIN_VALUE : this.f509p == 1 ? -1 : Integer.MIN_VALUE : this.f509p == 0 ? -1 : Integer.MIN_VALUE : (this.f509p != 1 && m326Q0()) ? -1 : 1 : (this.f509p != 1 && m326Q0()) ? 1 : -1;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m313E0() {
        if (this.f510q == null) {
            C0041ar c0041ar = new C0041ar();
            c0041ar.f618a = true;
            c0041ar.f625h = 0;
            c0041ar.f626i = 0;
            c0041ar.f628k = null;
            this.f510q = c0041ar;
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final int m314F0(a00 a00Var, C0041ar c0041ar, f00 f00Var, boolean z) {
        int i;
        int i2 = c0041ar.f620c;
        int i3 = c0041ar.f624g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c0041ar.f624g = i3 + i2;
            }
            m328T0(a00Var, c0041ar);
        }
        int i4 = c0041ar.f620c + c0041ar.f625h;
        while (true) {
            if ((!c0041ar.f629l && i4 <= 0) || (i = c0041ar.f621d) < 0 || i >= f00Var.m1068b()) {
                break;
            }
            C0976zq c0976zq = this.f506B;
            c0976zq.f5609a = 0;
            c0976zq.f5610b = false;
            c0976zq.f5611c = false;
            c0976zq.f5612d = false;
            mo275R0(a00Var, f00Var, c0041ar, c0976zq);
            if (!c0976zq.f5610b) {
                int i5 = c0041ar.f619b;
                int i6 = c0976zq.f5609a;
                c0041ar.f619b = (c0041ar.f623f * i6) + i5;
                if (!c0976zq.f5611c || c0041ar.f628k != null || !f00Var.f1711g) {
                    c0041ar.f620c -= i6;
                    i4 -= i6;
                }
                int i7 = c0041ar.f624g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c0041ar.f624g = i8;
                    int i9 = c0041ar.f620c;
                    if (i9 < 0) {
                        c0041ar.f624g = i8 + i9;
                    }
                    m328T0(a00Var, c0041ar);
                }
                if (z && c0976zq.f5612d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c0041ar.f620c;
    }

    /* JADX INFO: renamed from: G0 */
    public final View m315G0(boolean z) {
        return this.f514u ? m320K0(0, m2528v(), z) : m320K0(m2528v() - 1, -1, z);
    }

    /* JADX INFO: renamed from: H0 */
    public final View m316H0(boolean z) {
        return this.f514u ? m320K0(m2528v() - 1, -1, z) : m320K0(0, m2528v(), z);
    }

    /* JADX INFO: renamed from: I0 */
    public final int m317I0() {
        View viewM320K0 = m320K0(m2528v() - 1, -1, false);
        if (viewM320K0 == null) {
            return -1;
        }
        return AbstractC0799uz.m2501F(viewM320K0);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: J */
    public final boolean mo318J() {
        return true;
    }

    /* JADX INFO: renamed from: J0 */
    public final View m319J0(int i, int i2) {
        int i3;
        int i4;
        m313E0();
        if (i2 <= i && i2 >= i) {
            return m2526u(i);
        }
        if (this.f511r.mo639e(m2526u(i)) < this.f511r.mo645k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f509p == 0 ? this.f4857c.m858s(i, i2, i3, i4) : this.f4858d.m858s(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: K0 */
    public final View m320K0(int i, int i2, boolean z) {
        m313E0();
        int i3 = z ? 24579 : 320;
        return this.f509p == 0 ? this.f4857c.m858s(i, i2, i3, 320) : this.f4858d.m858s(i, i2, i3, 320);
    }

    /* JADX INFO: renamed from: L0 */
    public View mo273L0(a00 a00Var, f00 f00Var, int i, int i2, int i3) {
        m313E0();
        int iMo645k = this.f511r.mo645k();
        int iMo641g = this.f511r.mo641g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewM2526u = m2526u(i);
            int iM2501F = AbstractC0799uz.m2501F(viewM2526u);
            if (iM2501F >= 0 && iM2501F < i3) {
                if (((C0836vz) viewM2526u.getLayoutParams()).f5017a.m1426h()) {
                    if (view2 == null) {
                        view2 = viewM2526u;
                    }
                } else {
                    if (this.f511r.mo639e(viewM2526u) < iMo641g && this.f511r.mo636b(viewM2526u) >= iMo645k) {
                        return viewM2526u;
                    }
                    if (view == null) {
                        view = viewM2526u;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    /* JADX INFO: renamed from: M0 */
    public final int m321M0(int i, a00 a00Var, f00 f00Var, boolean z) {
        int iMo641g;
        int iMo641g2 = this.f511r.mo641g() - i;
        if (iMo641g2 <= 0) {
            return 0;
        }
        int i2 = -m331W0(-iMo641g2, a00Var, f00Var);
        int i3 = i + i2;
        if (!z || (iMo641g = this.f511r.mo641g() - i3) <= 0) {
            return i2;
        }
        this.f511r.mo649o(iMo641g);
        return iMo641g + i2;
    }

    /* JADX INFO: renamed from: N0 */
    public final int m322N0(int i, a00 a00Var, f00 f00Var, boolean z) {
        int iMo645k;
        int iMo645k2 = i - this.f511r.mo645k();
        if (iMo645k2 <= 0) {
            return 0;
        }
        int i2 = -m331W0(iMo645k2, a00Var, f00Var);
        int i3 = i + i2;
        if (!z || (iMo645k = i3 - this.f511r.mo645k()) <= 0) {
            return i2;
        }
        this.f511r.mo649o(-iMo645k);
        return i2 - iMo645k;
    }

    /* JADX INFO: renamed from: O0 */
    public final View m323O0() {
        return m2526u(this.f514u ? 0 : m2528v() - 1);
    }

    /* JADX INFO: renamed from: P0 */
    public final View m325P0() {
        return m2526u(this.f514u ? m2528v() - 1 : 0);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: Q */
    public View mo274Q(View view, int i, a00 a00Var, f00 f00Var) {
        int iM312D0;
        m330V0();
        if (m2528v() != 0 && (iM312D0 = m312D0(i)) != Integer.MIN_VALUE) {
            m313E0();
            m333Z0(iM312D0, (int) (this.f511r.mo646l() * 0.33333334f), false, f00Var);
            C0041ar c0041ar = this.f510q;
            c0041ar.f624g = Integer.MIN_VALUE;
            c0041ar.f618a = false;
            m314F0(a00Var, c0041ar, f00Var, true);
            View viewM319J0 = iM312D0 == -1 ? this.f514u ? m319J0(m2528v() - 1, -1) : m319J0(0, m2528v()) : this.f514u ? m319J0(0, m2528v()) : m319J0(m2528v() - 1, -1);
            View viewM325P0 = iM312D0 == -1 ? m325P0() : m323O0();
            if (!viewM325P0.hasFocusable()) {
                return viewM319J0;
            }
            if (viewM319J0 != null) {
                return viewM325P0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Q0 */
    public final boolean m326Q0() {
        return m2507A() == 1;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: R */
    public final void mo327R(AccessibilityEvent accessibilityEvent) {
        super.mo327R(accessibilityEvent);
        if (m2528v() > 0) {
            View viewM320K0 = m320K0(0, m2528v(), false);
            accessibilityEvent.setFromIndex(viewM320K0 == null ? -1 : AbstractC0799uz.m2501F(viewM320K0));
            accessibilityEvent.setToIndex(m317I0());
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void mo275R0(a00 a00Var, f00 f00Var, C0041ar c0041ar, C0976zq c0976zq) {
        int iM2509C;
        int i;
        int i2;
        int iMo638d;
        View viewM469b = c0041ar.m469b(a00Var);
        if (viewM469b == null) {
            c0976zq.f5610b = true;
            return;
        }
        C0836vz c0836vz = (C0836vz) viewM469b.getLayoutParams();
        if (c0041ar.f628k == null) {
            if (this.f514u == (c0041ar.f623f == -1)) {
                m2514b(viewM469b, -1, false);
            } else {
                m2514b(viewM469b, 0, false);
            }
        } else {
            if (this.f514u == (c0041ar.f623f == -1)) {
                m2514b(viewM469b, -1, true);
            } else {
                m2514b(viewM469b, 0, true);
            }
        }
        C0836vz c0836vz2 = (C0836vz) viewM469b.getLayoutParams();
        Rect rectM365J = this.f4856b.m365J(viewM469b);
        int i3 = rectM365J.left + rectM365J.right;
        int i4 = rectM365J.top + rectM365J.bottom;
        int iM2506w = AbstractC0799uz.m2506w(mo340d(), this.f4868n, this.f4866l, m2510D() + m2509C() + ((ViewGroup.MarginLayoutParams) c0836vz2).leftMargin + ((ViewGroup.MarginLayoutParams) c0836vz2).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c0836vz2).width);
        int iM2506w2 = AbstractC0799uz.m2506w(mo341e(), this.f4869o, this.f4867m, m2508B() + m2511E() + ((ViewGroup.MarginLayoutParams) c0836vz2).topMargin + ((ViewGroup.MarginLayoutParams) c0836vz2).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c0836vz2).height);
        if (m2525s0(viewM469b, iM2506w, iM2506w2, c0836vz2)) {
            viewM469b.measure(iM2506w, iM2506w2);
        }
        c0976zq.f5609a = this.f511r.mo637c(viewM469b);
        if (this.f509p == 1) {
            if (m326Q0()) {
                iMo638d = this.f4868n - m2510D();
                iM2509C = iMo638d - this.f511r.mo638d(viewM469b);
            } else {
                iM2509C = m2509C();
                iMo638d = this.f511r.mo638d(viewM469b) + iM2509C;
            }
            if (c0041ar.f623f == -1) {
                i = c0041ar.f619b;
                i2 = i - c0976zq.f5609a;
            } else {
                i2 = c0041ar.f619b;
                i = c0976zq.f5609a + i2;
            }
        } else {
            int iM2511E = m2511E();
            int iMo638d2 = this.f511r.mo638d(viewM469b) + iM2511E;
            if (c0041ar.f623f == -1) {
                int i5 = c0041ar.f619b;
                int i6 = i5 - c0976zq.f5609a;
                iMo638d = i5;
                i = iMo638d2;
                iM2509C = i6;
                i2 = iM2511E;
            } else {
                int i7 = c0041ar.f619b;
                int i8 = c0976zq.f5609a + i7;
                iM2509C = i7;
                i = iMo638d2;
                i2 = iM2511E;
                iMo638d = i8;
            }
        }
        AbstractC0799uz.m2504L(viewM469b, iM2509C, i2, iMo638d, i);
        if (c0836vz.f5017a.m1426h() || c0836vz.f5017a.m1429k()) {
            c0976zq.f5611c = true;
        }
        c0976zq.f5612d = viewM469b.hasFocusable();
    }

    /* JADX INFO: renamed from: T0 */
    public final void m328T0(a00 a00Var, C0041ar c0041ar) {
        if (!c0041ar.f618a || c0041ar.f629l) {
            return;
        }
        int i = c0041ar.f624g;
        int i2 = c0041ar.f626i;
        if (c0041ar.f623f == -1) {
            int iM2528v = m2528v();
            if (i < 0) {
                return;
            }
            int iMo640f = (this.f511r.mo640f() - i) + i2;
            if (this.f514u) {
                for (int i3 = 0; i3 < iM2528v; i3++) {
                    View viewM2526u = m2526u(i3);
                    if (this.f511r.mo639e(viewM2526u) < iMo640f || this.f511r.mo648n(viewM2526u) < iMo640f) {
                        m329U0(a00Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM2528v - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM2526u2 = m2526u(i5);
                if (this.f511r.mo639e(viewM2526u2) < iMo640f || this.f511r.mo648n(viewM2526u2) < iMo640f) {
                    m329U0(a00Var, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM2528v2 = m2528v();
        if (!this.f514u) {
            for (int i7 = 0; i7 < iM2528v2; i7++) {
                View viewM2526u3 = m2526u(i7);
                if (this.f511r.mo636b(viewM2526u3) > i6 || this.f511r.mo647m(viewM2526u3) > i6) {
                    m329U0(a00Var, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM2528v2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM2526u4 = m2526u(i9);
            if (this.f511r.mo636b(viewM2526u4) > i6 || this.f511r.mo647m(viewM2526u4) > i6) {
                m329U0(a00Var, i8, i9);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m329U0(a00 a00Var, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewM2526u = m2526u(i);
                m2518h0(i);
                a00Var.m8f(viewM2526u);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewM2526u2 = m2526u(i3);
            m2518h0(i3);
            a00Var.m8f(viewM2526u2);
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final void m330V0() {
        if (this.f509p == 1 || !m326Q0()) {
            this.f514u = this.f513t;
        } else {
            this.f514u = !this.f513t;
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final int m331W0(int i, a00 a00Var, f00 f00Var) {
        if (m2528v() != 0 && i != 0) {
            m313E0();
            this.f510q.f618a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            m333Z0(i2, iAbs, true, f00Var);
            C0041ar c0041ar = this.f510q;
            int iM314F0 = m314F0(a00Var, c0041ar, f00Var, false) + c0041ar.f624g;
            if (iM314F0 >= 0) {
                if (iAbs > iM314F0) {
                    i = i2 * iM314F0;
                }
                this.f511r.mo649o(-i);
                this.f510q.f627j = i;
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m332X0(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        mo338c(null);
        if (i != this.f509p || this.f511r == null) {
            AbstractC0105ci abstractC0105ciM635a = AbstractC0105ci.m635a(this, i);
            this.f511r = abstractC0105ciM635a;
            this.f505A.f5481a = abstractC0105ciM635a;
            this.f509p = i;
            m2519j0();
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public void mo283Y0(boolean z) {
        mo338c(null);
        if (this.f515v == z) {
            return;
        }
        this.f515v = z;
        m2519j0();
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0196  */
    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo284Z(p000.a00 r18, p000.f00 r19) {
        /*
            Method dump skipped, instruction units count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo284Z(a00, f00):void");
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m333Z0(int i, int i2, boolean z, f00 f00Var) {
        int iMo645k;
        this.f510q.f629l = this.f511r.mo643i() == 0 && this.f511r.mo640f() == 0;
        this.f510q.f623f = i;
        int[] iArr = this.f508D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo350y0(f00Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        C0041ar c0041ar = this.f510q;
        int i3 = z2 ? iMax2 : iMax;
        c0041ar.f625h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c0041ar.f626i = iMax;
        if (z2) {
            c0041ar.f625h = this.f511r.mo642h() + i3;
            View viewM323O0 = m323O0();
            C0041ar c0041ar2 = this.f510q;
            c0041ar2.f622e = this.f514u ? -1 : 1;
            int iM2501F = AbstractC0799uz.m2501F(viewM323O0);
            C0041ar c0041ar3 = this.f510q;
            c0041ar2.f621d = iM2501F + c0041ar3.f622e;
            c0041ar3.f619b = this.f511r.mo636b(viewM323O0);
            iMo645k = this.f511r.mo636b(viewM323O0) - this.f511r.mo641g();
        } else {
            View viewM325P0 = m325P0();
            C0041ar c0041ar4 = this.f510q;
            c0041ar4.f625h = this.f511r.mo645k() + c0041ar4.f625h;
            C0041ar c0041ar5 = this.f510q;
            c0041ar5.f622e = this.f514u ? 1 : -1;
            int iM2501F2 = AbstractC0799uz.m2501F(viewM325P0);
            C0041ar c0041ar6 = this.f510q;
            c0041ar5.f621d = iM2501F2 + c0041ar6.f622e;
            c0041ar6.f619b = this.f511r.mo639e(viewM325P0);
            iMo645k = (-this.f511r.mo639e(viewM325P0)) + this.f511r.mo645k();
        }
        C0041ar c0041ar7 = this.f510q;
        c0041ar7.f620c = i2;
        if (z) {
            c0041ar7.f620c = i2 - iMo645k;
        }
        c0041ar7.f624g = iMo645k;
    }

    @Override // p000.e00
    /* JADX INFO: renamed from: a */
    public final PointF mo334a(int i) {
        if (m2528v() == 0) {
            return null;
        }
        int i2 = (i < AbstractC0799uz.m2501F(m2526u(0))) != this.f514u ? -1 : 1;
        return this.f509p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: a0 */
    public void mo285a0(f00 f00Var) {
        this.f519z = null;
        this.f517x = -1;
        this.f518y = Integer.MIN_VALUE;
        this.f505A.m2778d();
    }

    /* JADX INFO: renamed from: a1 */
    public final void m335a1(int i, int i2) {
        this.f510q.f620c = this.f511r.mo641g() - i2;
        C0041ar c0041ar = this.f510q;
        c0041ar.f622e = this.f514u ? -1 : 1;
        c0041ar.f621d = i;
        c0041ar.f623f = 1;
        c0041ar.f619b = i2;
        c0041ar.f624g = Integer.MIN_VALUE;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: b0 */
    public final void mo336b0(Parcelable parcelable) {
        if (parcelable instanceof C0078br) {
            this.f519z = (C0078br) parcelable;
            m2519j0();
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final void m337b1(int i, int i2) {
        this.f510q.f620c = i2 - this.f511r.mo645k();
        C0041ar c0041ar = this.f510q;
        c0041ar.f621d = i;
        c0041ar.f622e = this.f514u ? 1 : -1;
        c0041ar.f623f = -1;
        c0041ar.f619b = i2;
        c0041ar.f624g = Integer.MIN_VALUE;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: c */
    public final void mo338c(String str) {
        if (this.f519z == null) {
            super.mo338c(str);
        }
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: c0 */
    public final Parcelable mo339c0() {
        C0078br c0078br = this.f519z;
        if (c0078br != null) {
            C0078br c0078br2 = new C0078br();
            c0078br2.f753a = c0078br.f753a;
            c0078br2.f754b = c0078br.f754b;
            c0078br2.f755c = c0078br.f755c;
            return c0078br2;
        }
        C0078br c0078br3 = new C0078br();
        if (m2528v() <= 0) {
            c0078br3.f753a = -1;
            return c0078br3;
        }
        m313E0();
        boolean z = this.f512s ^ this.f514u;
        c0078br3.f755c = z;
        if (z) {
            View viewM323O0 = m323O0();
            c0078br3.f754b = this.f511r.mo641g() - this.f511r.mo636b(viewM323O0);
            c0078br3.f753a = AbstractC0799uz.m2501F(viewM323O0);
            return c0078br3;
        }
        View viewM325P0 = m325P0();
        c0078br3.f753a = AbstractC0799uz.m2501F(viewM325P0);
        c0078br3.f754b = this.f511r.mo639e(viewM325P0) - this.f511r.mo645k();
        return c0078br3;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: d */
    public final boolean mo340d() {
        return this.f509p == 0;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: e */
    public final boolean mo341e() {
        return this.f509p == 1;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: h */
    public final void mo342h(int i, int i2, f00 f00Var, C0157dn c0157dn) {
        if (this.f509p != 0) {
            i = i2;
        }
        if (m2528v() == 0 || i == 0) {
            return;
        }
        m313E0();
        m333Z0(i > 0 ? 1 : -1, Math.abs(i), true, f00Var);
        mo308z0(f00Var, this.f510q, c0157dn);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: i */
    public final void mo343i(int i, C0157dn c0157dn) {
        boolean z;
        int i2;
        C0078br c0078br = this.f519z;
        if (c0078br == null || (i2 = c0078br.f753a) < 0) {
            m330V0();
            z = this.f514u;
            i2 = this.f517x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = c0078br.f755c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f507C && i2 >= 0 && i2 < i; i4++) {
            c0157dn.m929a(i2, 0);
            i2 += i3;
        }
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: j */
    public final int mo344j(f00 f00Var) {
        return m309A0(f00Var);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: k */
    public int mo295k(f00 f00Var) {
        return m310B0(f00Var);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: k0 */
    public int mo296k0(int i, a00 a00Var, f00 f00Var) {
        if (this.f509p == 1) {
            return 0;
        }
        return m331W0(i, a00Var, f00Var);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: l */
    public int mo298l(f00 f00Var) {
        return m311C0(f00Var);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: l0 */
    public final void mo345l0(int i) {
        this.f517x = i;
        this.f518y = Integer.MIN_VALUE;
        C0078br c0078br = this.f519z;
        if (c0078br != null) {
            c0078br.f753a = -1;
        }
        m2519j0();
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: m */
    public final int mo346m(f00 f00Var) {
        return m309A0(f00Var);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: m0 */
    public int mo299m0(int i, a00 a00Var, f00 f00Var) {
        if (this.f509p == 0) {
            return 0;
        }
        return m331W0(i, a00Var, f00Var);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: n */
    public int mo300n(f00 f00Var) {
        return m310B0(f00Var);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: o */
    public int mo301o(f00 f00Var) {
        return m311C0(f00Var);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: q */
    public final View mo347q(int i) {
        int iM2528v = m2528v();
        if (iM2528v == 0) {
            return null;
        }
        int iM2501F = i - AbstractC0799uz.m2501F(m2526u(0));
        if (iM2501F >= 0 && iM2501F < iM2528v) {
            View viewM2526u = m2526u(iM2501F);
            if (AbstractC0799uz.m2501F(viewM2526u) == i) {
                return viewM2526u;
            }
        }
        return super.mo347q(i);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: r */
    public C0836vz mo303r() {
        return new C0836vz(-2, -2);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: t0 */
    public final boolean mo348t0() {
        if (this.f4867m != 1073741824 && this.f4866l != 1073741824) {
            int iM2528v = m2528v();
            for (int i = 0; i < iM2528v; i++) {
                ViewGroup.LayoutParams layoutParams = m2526u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: v0 */
    public void mo349v0(RecyclerView recyclerView, int i) {
        C0124cr c0124cr = new C0124cr(recyclerView.getContext());
        c0124cr.f1236a = i;
        m2529w0(c0124cr);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: x0 */
    public boolean mo307x0() {
        return this.f519z == null && this.f512s == this.f515v;
    }

    /* JADX INFO: renamed from: y0 */
    public void mo350y0(f00 f00Var, int[] iArr) {
        int i;
        int iMo646l = f00Var.f1705a != -1 ? this.f511r.mo646l() : 0;
        if (this.f510q.f623f == -1) {
            i = 0;
        } else {
            i = iMo646l;
            iMo646l = 0;
        }
        iArr[0] = iMo646l;
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: z0 */
    public void mo308z0(f00 f00Var, C0041ar c0041ar, C0157dn c0157dn) {
        int i = c0041ar.f621d;
        if (i < 0 || i >= f00Var.m1068b()) {
            return;
        }
        c0157dn.m929a(i, Math.max(0, c0041ar.f624g));
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f509p = 1;
        this.f513t = false;
        this.f514u = false;
        this.f515v = false;
        this.f516w = true;
        this.f517x = -1;
        this.f518y = Integer.MIN_VALUE;
        this.f519z = null;
        this.f505A = new C0939yq();
        this.f506B = new C0976zq();
        this.f507C = 2;
        this.f508D = new int[2];
        C0762tz c0762tzM2502G = AbstractC0799uz.m2502G(context, attributeSet, i, i2);
        m332X0(c0762tzM2502G.f4595a);
        boolean z = c0762tzM2502G.f4597c;
        mo338c(null);
        if (z != this.f513t) {
            this.f513t = z;
            m2519j0();
        }
        mo283Y0(c0762tzM2502G.f4598d);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: P */
    public final void mo324P(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: S0 */
    public void mo277S0(a00 a00Var, f00 f00Var, C0939yq c0939yq, int i) {
    }
}
