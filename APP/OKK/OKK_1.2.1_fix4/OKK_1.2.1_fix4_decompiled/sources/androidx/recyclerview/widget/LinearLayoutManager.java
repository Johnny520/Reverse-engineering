package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import p034S.AbstractC0324d;
import p037U.AbstractC0343C;
import p037U.AbstractC0358S;
import p037U.C0344D;
import p037U.C0349I;
import p037U.C0352L;
import p037U.C0381q;
import p037U.C0382r;
import p037U.C0383s;
import p037U.C0384t;
import p037U.C0385u;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0343C {

    /* JADX INFO: renamed from: k */
    public int f1525k;

    /* JADX INFO: renamed from: l */
    public C0383s f1526l;

    /* JADX INFO: renamed from: m */
    public C0385u f1527m;

    /* JADX INFO: renamed from: n */
    public final boolean f1528n;

    /* JADX INFO: renamed from: o */
    public boolean f1529o;

    /* JADX INFO: renamed from: p */
    public boolean f1530p;

    /* JADX INFO: renamed from: q */
    public final boolean f1531q;

    /* JADX INFO: renamed from: r */
    public C0384t f1532r;

    /* JADX INFO: renamed from: s */
    public final C0381q f1533s;

    /* JADX INFO: renamed from: t */
    public final C0382r f1534t;

    /* JADX INFO: renamed from: u */
    public final int[] f1535u;

    public LinearLayoutManager() {
        this.f1525k = 1;
        this.f1528n = false;
        this.f1529o = false;
        this.f1530p = false;
        this.f1531q = true;
        this.f1532r = null;
        this.f1533s = new C0381q(0);
        this.f1534t = new C0382r();
        this.f1535u = new int[2];
        m1295v0(1);
        mo797b(null);
        if (this.f1528n) {
            this.f1528n = false;
            m793Y();
        }
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: H */
    public final boolean mo777H() {
        return true;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: K */
    public final void mo779K(RecyclerView recyclerView) {
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: L */
    public View mo780L(View view, int i2, C0349I c0349i, C0352L c0352l) {
        int iM1281g0;
        m1294u0();
        if (m813r() == 0 || (iM1281g0 = m1281g0(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        m1282h0();
        m1296x0(iM1281g0, (int) (this.f1527m.m974l() * 0.33333334f), false, c0352l);
        C0383s c0383s = this.f1526l;
        c0383s.f864g = Integer.MIN_VALUE;
        c0383s.f858a = false;
        m1283i0(c0349i, c0383s, c0352l, true);
        View viewM1287m0 = iM1281g0 == -1 ? this.f1529o ? m1287m0(m813r() - 1, -1) : m1287m0(0, m813r()) : this.f1529o ? m1287m0(0, m813r()) : m1287m0(m813r() - 1, -1);
        View viewM1290p0 = iM1281g0 == -1 ? m1290p0() : m1289o0();
        if (!viewM1290p0.hasFocusable()) {
            return viewM1287m0;
        }
        if (viewM1287m0 == null) {
            return null;
        }
        return viewM1290p0;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: M */
    public final void mo781M(AccessibilityEvent accessibilityEvent) {
        super.mo781M(accessibilityEvent);
        if (m813r() > 0) {
            View viewM1288n0 = m1288n0(0, m813r(), false);
            accessibilityEvent.setFromIndex(viewM1288n0 == null ? -1 : AbstractC0343C.m765D(viewM1288n0));
            accessibilityEvent.setToIndex(m1286l0());
        }
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: P */
    public final void mo784P(Parcelable parcelable) {
        if (parcelable instanceof C0384t) {
            this.f1532r = (C0384t) parcelable;
            m793Y();
        }
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: Q */
    public final Parcelable mo785Q() {
        C0384t c0384t = this.f1532r;
        if (c0384t != null) {
            C0384t c0384t2 = new C0384t();
            c0384t2.f869a = c0384t.f869a;
            c0384t2.f870b = c0384t.f870b;
            c0384t2.f871c = c0384t.f871c;
            return c0384t2;
        }
        C0384t c0384t3 = new C0384t();
        if (m813r() > 0) {
            m1282h0();
            boolean z2 = false ^ this.f1529o;
            c0384t3.f871c = z2;
            if (z2) {
                View viewM1289o0 = m1289o0();
                c0384t3.f870b = this.f1527m.m969g() - this.f1527m.m964b(viewM1289o0);
                c0384t3.f869a = AbstractC0343C.m765D(viewM1289o0);
            } else {
                View viewM1290p0 = m1290p0();
                c0384t3.f869a = AbstractC0343C.m765D(viewM1290p0);
                c0384t3.f870b = this.f1527m.m967e(viewM1290p0) - this.f1527m.m973k();
            }
        } else {
            c0384t3.f869a = -1;
        }
        return c0384t3;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: b */
    public final void mo797b(String str) {
        if (this.f1532r == null) {
            super.mo797b(str);
        }
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: c */
    public final boolean mo799c() {
        return this.f1525k == 0;
    }

    /* JADX INFO: renamed from: c0 */
    public void m1277c0(C0352L c0352l, int[] iArr) {
        int i2;
        int iM974l = c0352l.f693a != -1 ? this.f1527m.m974l() : 0;
        if (this.f1526l.f863f == -1) {
            i2 = 0;
        } else {
            i2 = iM974l;
            iM974l = 0;
        }
        iArr[0] = iM974l;
        iArr[1] = i2;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: d */
    public final boolean mo800d() {
        return this.f1525k == 1;
    }

    /* JADX INFO: renamed from: d0 */
    public final int m1278d0(C0352L c0352l) {
        if (m813r() == 0) {
            return 0;
        }
        m1282h0();
        C0385u c0385u = this.f1527m;
        boolean z2 = !this.f1531q;
        return AbstractC0358S.m892j(c0352l, c0385u, m1285k0(z2), m1284j0(z2), this, this.f1531q);
    }

    /* JADX INFO: renamed from: e0 */
    public final int m1279e0(C0352L c0352l) {
        if (m813r() == 0) {
            return 0;
        }
        m1282h0();
        C0385u c0385u = this.f1527m;
        boolean z2 = !this.f1531q;
        return AbstractC0358S.m894k(c0352l, c0385u, m1285k0(z2), m1284j0(z2), this, this.f1531q, this.f1529o);
    }

    /* JADX INFO: renamed from: f0 */
    public final int m1280f0(C0352L c0352l) {
        if (m813r() == 0) {
            return 0;
        }
        m1282h0();
        C0385u c0385u = this.f1527m;
        boolean z2 = !this.f1531q;
        return AbstractC0358S.m895l(c0352l, c0385u, m1285k0(z2), m1284j0(z2), this, this.f1531q);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: g */
    public final int mo802g(C0352L c0352l) {
        return m1278d0(c0352l);
    }

    /* JADX INFO: renamed from: g0 */
    public final int m1281g0(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.f1525k == 1) ? 1 : Integer.MIN_VALUE : this.f1525k == 0 ? 1 : Integer.MIN_VALUE : this.f1525k == 1 ? -1 : Integer.MIN_VALUE : this.f1525k == 0 ? -1 : Integer.MIN_VALUE : (this.f1525k != 1 && m1291q0()) ? -1 : 1 : (this.f1525k != 1 && m1291q0()) ? 1 : -1;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: h */
    public int mo803h(C0352L c0352l) {
        return m1279e0(c0352l);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m1282h0() {
        if (this.f1526l == null) {
            C0383s c0383s = new C0383s();
            c0383s.f858a = true;
            c0383s.f865h = 0;
            c0383s.f866i = 0;
            c0383s.f867j = null;
            this.f1526l = c0383s;
        }
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: i */
    public int mo804i(C0352L c0352l) {
        return m1280f0(c0352l);
    }

    /* JADX INFO: renamed from: i0 */
    public final int m1283i0(C0349I c0349i, C0383s c0383s, C0352L c0352l, boolean z2) {
        int i2;
        int i3 = c0383s.f860c;
        int i4 = c0383s.f864g;
        if (i4 != Integer.MIN_VALUE) {
            if (i3 < 0) {
                c0383s.f864g = i4 + i3;
            }
            m1292s0(c0349i, c0383s);
        }
        int i5 = c0383s.f860c + c0383s.f865h;
        while (true) {
            if ((!c0383s.f868k && i5 <= 0) || (i2 = c0383s.f861d) < 0 || i2 >= c0352l.m832a()) {
                break;
            }
            C0382r c0382r = this.f1534t;
            c0382r.f854a = 0;
            c0382r.f855b = false;
            c0382r.f856c = false;
            c0382r.f857d = false;
            mo1273r0(c0349i, c0352l, c0383s, c0382r);
            if (!c0382r.f855b) {
                int i6 = c0383s.f859b;
                int i7 = c0382r.f854a;
                c0383s.f859b = (c0383s.f863f * i7) + i6;
                if (!c0382r.f856c || c0383s.f867j != null || !c0352l.f698f) {
                    c0383s.f860c -= i7;
                    i5 -= i7;
                }
                int i8 = c0383s.f864g;
                if (i8 != Integer.MIN_VALUE) {
                    int i9 = i8 + i7;
                    c0383s.f864g = i9;
                    int i10 = c0383s.f860c;
                    if (i10 < 0) {
                        c0383s.f864g = i9 + i10;
                    }
                    m1292s0(c0349i, c0383s);
                }
                if (z2 && c0382r.f857d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i3 - c0383s.f860c;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: j */
    public final int mo805j(C0352L c0352l) {
        return m1278d0(c0352l);
    }

    /* JADX INFO: renamed from: j0 */
    public final View m1284j0(boolean z2) {
        return this.f1529o ? m1288n0(0, m813r(), z2) : m1288n0(m813r() - 1, -1, z2);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: k */
    public int mo806k(C0352L c0352l) {
        return m1279e0(c0352l);
    }

    /* JADX INFO: renamed from: k0 */
    public final View m1285k0(boolean z2) {
        return this.f1529o ? m1288n0(m813r() - 1, -1, z2) : m1288n0(0, m813r(), z2);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: l */
    public int mo807l(C0352L c0352l) {
        return m1280f0(c0352l);
    }

    /* JADX INFO: renamed from: l0 */
    public final int m1286l0() {
        View viewM1288n0 = m1288n0(m813r() - 1, -1, false);
        if (viewM1288n0 == null) {
            return -1;
        }
        return AbstractC0343C.m765D(viewM1288n0);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: m */
    public final View mo808m(int i2) {
        int iM813r = m813r();
        if (iM813r == 0) {
            return null;
        }
        int iM765D = i2 - AbstractC0343C.m765D(m812q(0));
        if (iM765D >= 0 && iM765D < iM813r) {
            View viewM812q = m812q(iM765D);
            if (AbstractC0343C.m765D(viewM812q) == i2) {
                return viewM812q;
            }
        }
        return super.mo808m(i2);
    }

    /* JADX INFO: renamed from: m0 */
    public final View m1287m0(int i2, int i3) {
        int i4;
        int i5;
        m1282h0();
        if (i3 <= i2 && i3 >= i2) {
            return m812q(i2);
        }
        if (this.f1527m.m967e(m812q(i2)) < this.f1527m.m973k()) {
            i4 = 16644;
            i5 = 16388;
        } else {
            i4 = 4161;
            i5 = 4097;
        }
        return this.f1525k == 0 ? this.f669c.m1b(i2, i3, i4, i5) : this.f670d.m1b(i2, i3, i4, i5);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: n */
    public C0344D mo809n() {
        return new C0344D(-2, -2);
    }

    /* JADX INFO: renamed from: n0 */
    public final View m1288n0(int i2, int i3, boolean z2) {
        m1282h0();
        int i4 = z2 ? 24579 : 320;
        return this.f1525k == 0 ? this.f669c.m1b(i2, i3, i4, 320) : this.f670d.m1b(i2, i3, i4, 320);
    }

    /* JADX INFO: renamed from: o0 */
    public final View m1289o0() {
        return m812q(this.f1529o ? 0 : m813r() - 1);
    }

    /* JADX INFO: renamed from: p0 */
    public final View m1290p0() {
        return m812q(this.f1529o ? m813r() - 1 : 0);
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m1291q0() {
        return m817y() == 1;
    }

    /* JADX INFO: renamed from: r0 */
    public void mo1273r0(C0349I c0349i, C0352L c0352l, C0383s c0383s, C0382r c0382r) {
        int i2;
        int iM966d;
        int iM772A;
        int i3;
        View viewM962b = c0383s.m962b(c0349i);
        if (viewM962b == null) {
            c0382r.f855b = true;
            return;
        }
        C0344D c0344d = (C0344D) viewM962b.getLayoutParams();
        if (c0383s.f867j == null) {
            if (this.f1529o == (c0383s.f863f == -1)) {
                m795a(viewM962b, -1, false);
            } else {
                m795a(viewM962b, 0, false);
            }
        } else {
            if (this.f1529o == (c0383s.f863f == -1)) {
                m795a(viewM962b, -1, true);
            } else {
                m795a(viewM962b, 0, true);
            }
        }
        C0344D c0344d2 = (C0344D) viewM962b.getLayoutParams();
        Rect rectM1329v = this.f668b.m1329v(viewM962b);
        int i4 = rectM1329v.left + rectM1329v.right;
        int i5 = rectM1329v.top + rectM1329v.bottom;
        int iM769s = AbstractC0343C.m769s(mo799c(), this.f675i, this.f673g, m773B() + m772A() + ((ViewGroup.MarginLayoutParams) c0344d2).leftMargin + ((ViewGroup.MarginLayoutParams) c0344d2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) c0344d2).width);
        int iM769s2 = AbstractC0343C.m769s(mo800d(), this.f676j, this.f674h, m818z() + m774C() + ((ViewGroup.MarginLayoutParams) c0344d2).topMargin + ((ViewGroup.MarginLayoutParams) c0344d2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) c0344d2).height);
        if (m796a0(viewM962b, iM769s, iM769s2, c0344d2)) {
            viewM962b.measure(iM769s, iM769s2);
        }
        c0382r.f854a = this.f1527m.m965c(viewM962b);
        if (this.f1525k == 1) {
            if (m1291q0()) {
                iM966d = this.f675i - m773B();
                iM772A = iM966d - this.f1527m.m966d(viewM962b);
            } else {
                iM772A = m772A();
                iM966d = this.f1527m.m966d(viewM962b) + iM772A;
            }
            if (c0383s.f863f == -1) {
                i3 = c0383s.f859b;
                i2 = i3 - c0382r.f854a;
            } else {
                int i6 = c0383s.f859b;
                int i7 = c0382r.f854a + i6;
                i2 = i6;
                i3 = i7;
            }
        } else {
            int iM774C = m774C();
            int iM966d2 = this.f1527m.m966d(viewM962b) + iM774C;
            if (c0383s.f863f == -1) {
                int i8 = c0383s.f859b;
                int i9 = i8 - c0382r.f854a;
                i2 = iM774C;
                iM966d = i8;
                i3 = iM966d2;
                iM772A = i9;
            } else {
                int i10 = c0383s.f859b;
                int i11 = c0382r.f854a + i10;
                i2 = iM774C;
                iM966d = i11;
                iM772A = i10;
                i3 = iM966d2;
            }
        }
        C0344D c0344d3 = (C0344D) viewM962b.getLayoutParams();
        Rect rect = c0344d3.f677a;
        viewM962b.layout(iM772A + rect.left + ((ViewGroup.MarginLayoutParams) c0344d3).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) c0344d3).topMargin, (iM966d - rect.right) - ((ViewGroup.MarginLayoutParams) c0344d3).rightMargin, (i3 - rect.bottom) - ((ViewGroup.MarginLayoutParams) c0344d3).bottomMargin);
        c0344d.getClass();
        throw null;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m1292s0(C0349I c0349i, C0383s c0383s) {
        if (!c0383s.f858a || c0383s.f868k) {
            return;
        }
        int i2 = c0383s.f864g;
        int i3 = c0383s.f866i;
        if (c0383s.f863f == -1) {
            int iM813r = m813r();
            if (i2 < 0) {
                return;
            }
            int iM968f = (this.f1527m.m968f() - i2) + i3;
            if (this.f1529o) {
                for (int i4 = 0; i4 < iM813r; i4++) {
                    View viewM812q = m812q(i4);
                    if (this.f1527m.m967e(viewM812q) < iM968f || this.f1527m.m976n(viewM812q) < iM968f) {
                        m1293t0(c0349i, 0, i4);
                        return;
                    }
                }
                return;
            }
            int i5 = iM813r - 1;
            for (int i6 = i5; i6 >= 0; i6--) {
                View viewM812q2 = m812q(i6);
                if (this.f1527m.m967e(viewM812q2) < iM968f || this.f1527m.m976n(viewM812q2) < iM968f) {
                    m1293t0(c0349i, i5, i6);
                    return;
                }
            }
            return;
        }
        if (i2 < 0) {
            return;
        }
        int i7 = i2 - i3;
        int iM813r2 = m813r();
        if (!this.f1529o) {
            for (int i8 = 0; i8 < iM813r2; i8++) {
                View viewM812q3 = m812q(i8);
                if (this.f1527m.m964b(viewM812q3) > i7 || this.f1527m.m975m(viewM812q3) > i7) {
                    m1293t0(c0349i, 0, i8);
                    return;
                }
            }
            return;
        }
        int i9 = iM813r2 - 1;
        for (int i10 = i9; i10 >= 0; i10--) {
            View viewM812q4 = m812q(i10);
            if (this.f1527m.m964b(viewM812q4) > i7 || this.f1527m.m975m(viewM812q4) > i7) {
                m1293t0(c0349i, i9, i10);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m1293t0(C0349I c0349i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        if (i3 <= i2) {
            while (i2 > i3) {
                View viewM812q = m812q(i2);
                m791W(i2);
                c0349i.m826f(viewM812q);
                i2--;
            }
            return;
        }
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            View viewM812q2 = m812q(i4);
            m791W(i4);
            c0349i.m826f(viewM812q2);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m1294u0() {
        if (this.f1525k == 1 || !m1291q0()) {
            this.f1529o = this.f1528n;
        } else {
            this.f1529o = !this.f1528n;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m1295v0(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException(AbstractC0324d.m720c("invalid orientation:", i2));
        }
        mo797b(null);
        if (i2 != this.f1525k || this.f1527m == null) {
            this.f1527m = C0385u.m963a(this, i2);
            this.f1533s.getClass();
            this.f1525k = i2;
            m793Y();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void mo1274w0(boolean z2) {
        mo797b(null);
        if (this.f1530p == z2) {
            return;
        }
        this.f1530p = z2;
        m793Y();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m1296x0(int i2, int i3, boolean z2, C0352L c0352l) {
        int iM973k;
        this.f1526l.f868k = this.f1527m.m971i() == 0 && this.f1527m.m968f() == 0;
        this.f1526l.f863f = i2;
        int[] iArr = this.f1535u;
        iArr[0] = 0;
        iArr[1] = 0;
        m1277c0(c0352l, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z3 = i2 == 1;
        C0383s c0383s = this.f1526l;
        int i4 = z3 ? iMax2 : iMax;
        c0383s.f865h = i4;
        if (!z3) {
            iMax = iMax2;
        }
        c0383s.f866i = iMax;
        if (z3) {
            c0383s.f865h = this.f1527m.m970h() + i4;
            View viewM1289o0 = m1289o0();
            C0383s c0383s2 = this.f1526l;
            c0383s2.f862e = this.f1529o ? -1 : 1;
            int iM765D = AbstractC0343C.m765D(viewM1289o0);
            C0383s c0383s3 = this.f1526l;
            c0383s2.f861d = iM765D + c0383s3.f862e;
            c0383s3.f859b = this.f1527m.m964b(viewM1289o0);
            iM973k = this.f1527m.m964b(viewM1289o0) - this.f1527m.m969g();
        } else {
            View viewM1290p0 = m1290p0();
            C0383s c0383s4 = this.f1526l;
            c0383s4.f865h = this.f1527m.m973k() + c0383s4.f865h;
            C0383s c0383s5 = this.f1526l;
            c0383s5.f862e = this.f1529o ? 1 : -1;
            int iM765D2 = AbstractC0343C.m765D(viewM1290p0);
            C0383s c0383s6 = this.f1526l;
            c0383s5.f861d = iM765D2 + c0383s6.f862e;
            c0383s6.f859b = this.f1527m.m967e(viewM1290p0);
            iM973k = (-this.f1527m.m967e(viewM1290p0)) + this.f1527m.m973k();
        }
        C0383s c0383s7 = this.f1526l;
        c0383s7.f860c = i3;
        if (z2) {
            c0383s7.f860c = i3 - iM973k;
        }
        c0383s7.f864g = iM973k;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1525k = 1;
        this.f1528n = false;
        this.f1529o = false;
        this.f1530p = false;
        this.f1531q = true;
        this.f1532r = null;
        this.f1533s = new C0381q(0);
        this.f1534t = new C0382r();
        this.f1535u = new int[2];
        C0381q c0381qM766E = AbstractC0343C.m766E(context, attributeSet, i2, i3);
        m1295v0(c0381qM766E.f850b);
        boolean z2 = c0381qM766E.f852d;
        mo797b(null);
        if (z2 != this.f1528n) {
            this.f1528n = z2;
            m793Y();
        }
        mo1274w0(c0381qM766E.f853e);
    }
}
