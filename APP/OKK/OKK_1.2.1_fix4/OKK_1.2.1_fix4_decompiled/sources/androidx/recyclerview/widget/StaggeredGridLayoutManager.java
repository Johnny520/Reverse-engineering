package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p000A.C0002c;
import p001A0.RunnableC0019E;
import p008E.C0155i;
import p008E.C0156j;
import p037U.AbstractC0343C;
import p037U.AbstractC0355O;
import p037U.AbstractC0358S;
import p037U.C0344D;
import p037U.C0349I;
import p037U.C0352L;
import p037U.C0359T;
import p037U.C0361V;
import p037U.C0362W;
import p037U.C0380p;
import p037U.C0381q;
import p037U.C0385u;
import p089x0.C1121e;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0343C {

    /* JADX INFO: renamed from: k */
    public final int f1598k;

    /* JADX INFO: renamed from: l */
    public final C0362W[] f1599l;

    /* JADX INFO: renamed from: m */
    public final C0385u f1600m;

    /* JADX INFO: renamed from: n */
    public final C0385u f1601n;

    /* JADX INFO: renamed from: o */
    public final int f1602o;

    /* JADX INFO: renamed from: p */
    public final C0380p f1603p;

    /* JADX INFO: renamed from: q */
    public final boolean f1604q;

    /* JADX INFO: renamed from: r */
    public boolean f1605r = false;

    /* JADX INFO: renamed from: s */
    public final BitSet f1606s;

    /* JADX INFO: renamed from: t */
    public final C0002c f1607t;

    /* JADX INFO: renamed from: u */
    public final int f1608u;

    /* JADX INFO: renamed from: v */
    public boolean f1609v;

    /* JADX INFO: renamed from: w */
    public C0361V f1610w;

    /* JADX INFO: renamed from: x */
    public final Rect f1611x;

    /* JADX INFO: renamed from: y */
    public final boolean f1612y;

    /* JADX INFO: renamed from: z */
    public final RunnableC0019E f1613z;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1598k = -1;
        this.f1604q = false;
        C0002c c0002c = new C0002c(3);
        this.f1607t = c0002c;
        this.f1608u = 2;
        this.f1611x = new Rect();
        new C1121e(this);
        this.f1612y = true;
        this.f1613z = new RunnableC0019E(5, this);
        C0381q c0381qM766E = AbstractC0343C.m766E(context, attributeSet, i2, i3);
        int i4 = c0381qM766E.f850b;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo797b(null);
        if (i4 != this.f1602o) {
            this.f1602o = i4;
            C0385u c0385u = this.f1600m;
            this.f1600m = this.f1601n;
            this.f1601n = c0385u;
            m793Y();
        }
        int i5 = c0381qM766E.f851c;
        mo797b(null);
        if (i5 != this.f1598k) {
            int[] iArr = (int[]) c0002c.f7b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0002c.f8c = null;
            m793Y();
            this.f1598k = i5;
            this.f1606s = new BitSet(this.f1598k);
            this.f1599l = new C0362W[this.f1598k];
            for (int i6 = 0; i6 < this.f1598k; i6++) {
                this.f1599l[i6] = new C0362W(this, i6);
            }
            m793Y();
        }
        boolean z2 = c0381qM766E.f852d;
        mo797b(null);
        C0361V c0361v = this.f1610w;
        if (c0361v != null && c0361v.f758h != z2) {
            c0361v.f758h = z2;
        }
        this.f1604q = z2;
        m793Y();
        C0380p c0380p = new C0380p();
        c0380p.f840a = true;
        c0380p.f845f = 0;
        c0380p.f846g = 0;
        this.f1603p = c0380p;
        this.f1600m = C0385u.m963a(this, this.f1602o);
        this.f1601n = C0385u.m963a(this, 1 - this.f1602o);
    }

    /* JADX INFO: renamed from: y0 */
    public static int m1334y0(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: F */
    public final int mo775F(C0349I c0349i, C0352L c0352l) {
        return this.f1602o == 0 ? this.f1598k : super.mo775F(c0349i, c0352l);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: H */
    public final boolean mo777H() {
        return this.f1608u != 0;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: K */
    public final void mo779K(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f668b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1613z);
        }
        for (int i2 = 0; i2 < this.f1598k; i2++) {
            this.f1599l[i2].m928b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005f  */
    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo780L(View view, int i2, C0349I c0349i, C0352L c0352l) {
        View viewM1325q;
        int i3;
        if (m813r() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.f668b;
        if (recyclerView == null || (viewM1325q = recyclerView.m1325q(view)) == null || this.f667a.m654q(viewM1325q)) {
            viewM1325q = null;
        }
        if (viewM1325q == null) {
            return null;
        }
        m1353u0();
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 17) {
                    if (i2 != 33) {
                        if (i2 == 66 ? this.f1602o == 0 : !(i2 != 130 || this.f1602o != 1)) {
                            i3 = 1;
                        }
                    } else if (this.f1602o == 1) {
                        i3 = -1;
                    }
                    i3 = Integer.MIN_VALUE;
                } else if (this.f1602o != 0) {
                    i3 = Integer.MIN_VALUE;
                }
            } else if (this.f1602o != 1 && m1347o0()) {
            }
        } else if (this.f1602o != 1 && m1347o0()) {
        }
        if (i3 == Integer.MIN_VALUE) {
            return null;
        }
        C0359T c0359t = (C0359T) viewM1325q.getLayoutParams();
        c0359t.getClass();
        C0362W c0362w = c0359t.f746d;
        int iM1343k0 = i3 == 1 ? m1343k0() : m1342j0();
        m1355w0(iM1343k0, c0352l);
        m1354v0(i3);
        C0380p c0380p = this.f1603p;
        c0380p.f842c = c0380p.f843d + iM1343k0;
        c0380p.f841b = (int) (this.f1600m.m974l() * 0.33333334f);
        c0380p.f847h = true;
        c0380p.f840a = false;
        m1339g0(c0349i, c0380p, c0352l);
        this.f1609v = this.f1605r;
        View viewM933g = c0362w.m933g(iM1343k0, i3);
        if (viewM933g != null && viewM933g != viewM1325q) {
            return viewM933g;
        }
        if (m1349q0(i3)) {
            for (int i4 = this.f1598k - 1; i4 >= 0; i4--) {
                View viewM933g2 = this.f1599l[i4].m933g(iM1343k0, i3);
                if (viewM933g2 != null && viewM933g2 != viewM1325q) {
                    return viewM933g2;
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f1598k; i5++) {
                View viewM933g3 = this.f1599l[i5].m933g(iM1343k0, i3);
                if (viewM933g3 != null && viewM933g3 != viewM1325q) {
                    return viewM933g3;
                }
            }
        }
        boolean z2 = (this.f1604q ^ true) == (i3 == -1);
        View viewMo808m = mo808m(z2 ? c0362w.m929c() : c0362w.m930d());
        if (viewMo808m != null && viewMo808m != viewM1325q) {
            return viewMo808m;
        }
        if (m1349q0(i3)) {
            for (int i6 = this.f1598k - 1; i6 >= 0; i6--) {
                if (i6 != c0362w.f765e) {
                    View viewMo808m2 = mo808m(z2 ? this.f1599l[i6].m929c() : this.f1599l[i6].m930d());
                    if (viewMo808m2 != null && viewMo808m2 != viewM1325q) {
                        return viewMo808m2;
                    }
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f1598k; i7++) {
                View viewMo808m3 = mo808m(z2 ? this.f1599l[i7].m929c() : this.f1599l[i7].m930d());
                if (viewMo808m3 != null && viewMo808m3 != viewM1325q) {
                    return viewMo808m3;
                }
            }
        }
        return null;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: M */
    public final void mo781M(AccessibilityEvent accessibilityEvent) {
        super.mo781M(accessibilityEvent);
        if (m813r() > 0) {
            View viewM1341i0 = m1341i0(false);
            View viewM1340h0 = m1340h0(false);
            if (viewM1341i0 == null || viewM1340h0 == null) {
                return;
            }
            int iM765D = AbstractC0343C.m765D(viewM1341i0);
            int iM765D2 = AbstractC0343C.m765D(viewM1340h0);
            if (iM765D < iM765D2) {
                accessibilityEvent.setFromIndex(iM765D);
                accessibilityEvent.setToIndex(iM765D2);
            } else {
                accessibilityEvent.setFromIndex(iM765D2);
                accessibilityEvent.setToIndex(iM765D);
            }
        }
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: N */
    public final void mo782N(C0349I c0349i, C0352L c0352l, View view, C0156j c0156j) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0359T)) {
            m783O(view, c0156j);
            return;
        }
        C0359T c0359t = (C0359T) layoutParams;
        if (this.f1602o == 0) {
            C0362W c0362w = c0359t.f746d;
            c0156j.m511h(C0155i.m503a(false, c0362w == null ? -1 : c0362w.f765e, 1, -1, -1));
        } else {
            C0362W c0362w2 = c0359t.f746d;
            c0156j.m511h(C0155i.m503a(false, -1, -1, c0362w2 == null ? -1 : c0362w2.f765e, 1));
        }
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: P */
    public final void mo784P(Parcelable parcelable) {
        if (parcelable instanceof C0361V) {
            this.f1610w = (C0361V) parcelable;
            m793Y();
        }
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: Q */
    public final Parcelable mo785Q() {
        int iM934h;
        int iM973k;
        int[] iArr;
        C0361V c0361v = this.f1610w;
        if (c0361v != null) {
            C0361V c0361v2 = new C0361V();
            c0361v2.f753c = c0361v.f753c;
            c0361v2.f751a = c0361v.f751a;
            c0361v2.f752b = c0361v.f752b;
            c0361v2.f754d = c0361v.f754d;
            c0361v2.f755e = c0361v.f755e;
            c0361v2.f756f = c0361v.f756f;
            c0361v2.f758h = c0361v.f758h;
            c0361v2.f759i = c0361v.f759i;
            c0361v2.f760j = c0361v.f760j;
            c0361v2.f757g = c0361v.f757g;
            return c0361v2;
        }
        C0361V c0361v3 = new C0361V();
        c0361v3.f758h = this.f1604q;
        c0361v3.f759i = this.f1609v;
        c0361v3.f760j = false;
        C0002c c0002c = this.f1607t;
        if (c0002c == null || (iArr = (int[]) c0002c.f7b) == null) {
            c0361v3.f755e = 0;
        } else {
            c0361v3.f756f = iArr;
            c0361v3.f755e = iArr.length;
            c0361v3.f757g = (List) c0002c.f8c;
        }
        if (m813r() > 0) {
            c0361v3.f751a = this.f1609v ? m1343k0() : m1342j0();
            View viewM1340h0 = this.f1605r ? m1340h0(true) : m1341i0(true);
            c0361v3.f752b = viewM1340h0 != null ? AbstractC0343C.m765D(viewM1340h0) : -1;
            int i2 = this.f1598k;
            c0361v3.f753c = i2;
            c0361v3.f754d = new int[i2];
            for (int i3 = 0; i3 < this.f1598k; i3++) {
                if (this.f1609v) {
                    iM934h = this.f1599l[i3].m932f(Integer.MIN_VALUE);
                    if (iM934h != Integer.MIN_VALUE) {
                        iM973k = this.f1600m.m969g();
                        iM934h -= iM973k;
                    }
                } else {
                    iM934h = this.f1599l[i3].m934h(Integer.MIN_VALUE);
                    if (iM934h != Integer.MIN_VALUE) {
                        iM973k = this.f1600m.m973k();
                        iM934h -= iM973k;
                    }
                }
                c0361v3.f754d[i3] = iM934h;
            }
        } else {
            c0361v3.f751a = -1;
            c0361v3.f752b = -1;
            c0361v3.f753c = 0;
        }
        return c0361v3;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: R */
    public final void mo786R(int i2) {
        if (i2 == 0) {
            m1335c0();
        }
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: b */
    public final void mo797b(String str) {
        if (this.f1610w == null) {
            super.mo797b(str);
        }
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: c */
    public final boolean mo799c() {
        return this.f1602o == 0;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m1335c0() {
        int iM1342j0;
        if (m813r() != 0 && this.f1608u != 0 && this.f671e) {
            if (this.f1605r) {
                iM1342j0 = m1343k0();
                m1342j0();
            } else {
                iM1342j0 = m1342j0();
                m1343k0();
            }
            C0002c c0002c = this.f1607t;
            if (iM1342j0 == 0 && m1346n0() != null) {
                int[] iArr = (int[]) c0002c.f7b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                c0002c.f8c = null;
                m793Y();
                return true;
            }
        }
        return false;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: d */
    public final boolean mo800d() {
        return this.f1602o == 1;
    }

    /* JADX INFO: renamed from: d0 */
    public final int m1336d0(C0352L c0352l) {
        if (m813r() == 0) {
            return 0;
        }
        C0385u c0385u = this.f1600m;
        boolean z2 = this.f1612y;
        return AbstractC0358S.m892j(c0352l, c0385u, m1341i0(!z2), m1340h0(!z2), this, this.f1612y);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: e */
    public final boolean mo801e(C0344D c0344d) {
        return c0344d instanceof C0359T;
    }

    /* JADX INFO: renamed from: e0 */
    public final int m1337e0(C0352L c0352l) {
        if (m813r() == 0) {
            return 0;
        }
        C0385u c0385u = this.f1600m;
        boolean z2 = this.f1612y;
        return AbstractC0358S.m894k(c0352l, c0385u, m1341i0(!z2), m1340h0(!z2), this, this.f1612y, this.f1605r);
    }

    /* JADX INFO: renamed from: f0 */
    public final int m1338f0(C0352L c0352l) {
        if (m813r() == 0) {
            return 0;
        }
        C0385u c0385u = this.f1600m;
        boolean z2 = this.f1612y;
        return AbstractC0358S.m895l(c0352l, c0385u, m1341i0(!z2), m1340h0(!z2), this, this.f1612y);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: g */
    public final int mo802g(C0352L c0352l) {
        return m1336d0(c0352l);
    }

    /* JADX INFO: renamed from: g0 */
    public final int m1339g0(C0349I c0349i, C0380p c0380p, C0352L c0352l) {
        this.f1606s.set(0, this.f1598k, true);
        C0380p c0380p2 = this.f1603p;
        int i2 = Integer.MIN_VALUE;
        if (!c0380p2.f848i) {
            i2 = c0380p.f844e == 1 ? c0380p.f841b + c0380p.f846g : c0380p.f845f - c0380p.f841b;
        } else if (c0380p.f844e == 1) {
            i2 = Integer.MAX_VALUE;
        }
        int i3 = c0380p.f844e;
        for (int i4 = 0; i4 < this.f1598k; i4++) {
            if (!this.f1599l[i4].f761a.isEmpty()) {
                m1356x0(this.f1599l[i4], i3, i2);
            }
        }
        if (this.f1605r) {
            this.f1600m.m969g();
        } else {
            this.f1600m.m973k();
        }
        int i5 = c0380p.f842c;
        if ((i5 >= 0 && i5 < c0352l.m832a()) && (c0380p2.f848i || !this.f1606s.isEmpty())) {
            AbstractC0355O abstractC0355OM829i = c0349i.m829i(c0380p.f842c, Long.MAX_VALUE);
            c0380p.f842c += c0380p.f843d;
            abstractC0355OM829i.getClass();
            throw null;
        }
        m1350r0(c0349i, c0380p2);
        int iM973k = c0380p2.f844e == -1 ? this.f1600m.m973k() - m1345m0(this.f1600m.m973k()) : m1344l0(this.f1600m.m969g()) - this.f1600m.m969g();
        if (iM973k > 0) {
            return Math.min(c0380p.f841b, iM973k);
        }
        return 0;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: h */
    public final int mo803h(C0352L c0352l) {
        return m1337e0(c0352l);
    }

    /* JADX INFO: renamed from: h0 */
    public final View m1340h0(boolean z2) {
        int iM973k = this.f1600m.m973k();
        int iM969g = this.f1600m.m969g();
        View view = null;
        for (int iM813r = m813r() - 1; iM813r >= 0; iM813r--) {
            View viewM812q = m812q(iM813r);
            int iM967e = this.f1600m.m967e(viewM812q);
            int iM964b = this.f1600m.m964b(viewM812q);
            if (iM964b > iM973k && iM967e < iM969g) {
                if (iM964b <= iM969g || !z2) {
                    return viewM812q;
                }
                if (view == null) {
                    view = viewM812q;
                }
            }
        }
        return view;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: i */
    public final int mo804i(C0352L c0352l) {
        return m1338f0(c0352l);
    }

    /* JADX INFO: renamed from: i0 */
    public final View m1341i0(boolean z2) {
        int iM973k = this.f1600m.m973k();
        int iM969g = this.f1600m.m969g();
        int iM813r = m813r();
        View view = null;
        for (int i2 = 0; i2 < iM813r; i2++) {
            View viewM812q = m812q(i2);
            int iM967e = this.f1600m.m967e(viewM812q);
            if (this.f1600m.m964b(viewM812q) > iM973k && iM967e < iM969g) {
                if (iM967e >= iM973k || !z2) {
                    return viewM812q;
                }
                if (view == null) {
                    view = viewM812q;
                }
            }
        }
        return view;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: j */
    public final int mo805j(C0352L c0352l) {
        return m1336d0(c0352l);
    }

    /* JADX INFO: renamed from: j0 */
    public final int m1342j0() {
        if (m813r() == 0) {
            return 0;
        }
        return AbstractC0343C.m765D(m812q(0));
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: k */
    public final int mo806k(C0352L c0352l) {
        return m1337e0(c0352l);
    }

    /* JADX INFO: renamed from: k0 */
    public final int m1343k0() {
        int iM813r = m813r();
        if (iM813r == 0) {
            return 0;
        }
        return AbstractC0343C.m765D(m812q(iM813r - 1));
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: l */
    public final int mo807l(C0352L c0352l) {
        return m1338f0(c0352l);
    }

    /* JADX INFO: renamed from: l0 */
    public final int m1344l0(int i2) {
        int iM932f = this.f1599l[0].m932f(i2);
        for (int i3 = 1; i3 < this.f1598k; i3++) {
            int iM932f2 = this.f1599l[i3].m932f(i2);
            if (iM932f2 > iM932f) {
                iM932f = iM932f2;
            }
        }
        return iM932f;
    }

    /* JADX INFO: renamed from: m0 */
    public final int m1345m0(int i2) {
        int iM934h = this.f1599l[0].m934h(i2);
        for (int i3 = 1; i3 < this.f1598k; i3++) {
            int iM934h2 = this.f1599l[i3].m934h(i2);
            if (iM934h2 < iM934h) {
                iM934h = iM934h2;
            }
        }
        return iM934h;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: n */
    public final C0344D mo809n() {
        return this.f1602o == 0 ? new C0359T(-2, -1) : new C0359T(-1, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x002c A[SYNTHETIC] */
    /* JADX INFO: renamed from: n0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m1346n0() {
        int iM813r = m813r();
        int i2 = iM813r - 1;
        BitSet bitSet = new BitSet(this.f1598k);
        bitSet.set(0, this.f1598k, true);
        byte b2 = (this.f1602o == 1 && m1347o0()) ? (byte) 1 : (byte) -1;
        if (this.f1605r) {
            iM813r = -1;
        } else {
            i2 = 0;
        }
        int i3 = i2 < iM813r ? 1 : -1;
        while (i2 != iM813r) {
            View viewM812q = m812q(i2);
            C0359T c0359t = (C0359T) viewM812q.getLayoutParams();
            if (bitSet.get(c0359t.f746d.f765e)) {
                C0362W c0362w = c0359t.f746d;
                if (this.f1605r) {
                    int i4 = c0362w.f763c;
                    if (i4 == Integer.MIN_VALUE) {
                        c0362w.m927a();
                        i4 = c0362w.f763c;
                    }
                    if (i4 < this.f1600m.m969g()) {
                        ArrayList arrayList = c0362w.f761a;
                        ((C0359T) ((View) arrayList.get(arrayList.size() - 1)).getLayoutParams()).getClass();
                        return viewM812q;
                    }
                    bitSet.clear(c0359t.f746d.f765e);
                } else {
                    int i5 = c0362w.f762b;
                    if (i5 == Integer.MIN_VALUE) {
                        View view = (View) c0362w.f761a.get(0);
                        C0359T c0359t2 = (C0359T) view.getLayoutParams();
                        c0362w.f762b = c0362w.f766f.f1600m.m967e(view);
                        c0359t2.getClass();
                        i5 = c0362w.f762b;
                    }
                    if (i5 > this.f1600m.m973k()) {
                        ((C0359T) ((View) c0362w.f761a.get(0)).getLayoutParams()).getClass();
                        return viewM812q;
                    }
                    bitSet.clear(c0359t.f746d.f765e);
                }
            }
            i2 += i3;
            if (i2 != iM813r) {
                View viewM812q2 = m812q(i2);
                if (this.f1605r) {
                    int iM964b = this.f1600m.m964b(viewM812q);
                    int iM964b2 = this.f1600m.m964b(viewM812q2);
                    if (iM964b < iM964b2) {
                        return viewM812q;
                    }
                    if (iM964b == iM964b2) {
                        if ((c0359t.f746d.f765e - ((C0359T) viewM812q2.getLayoutParams()).f746d.f765e >= 0) == (b2 >= 0)) {
                            return viewM812q;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iM967e = this.f1600m.m967e(viewM812q);
                    int iM967e2 = this.f1600m.m967e(viewM812q2);
                    if (iM967e > iM967e2) {
                        return viewM812q;
                    }
                    if (iM967e == iM967e2) {
                        if ((c0359t.f746d.f765e - ((C0359T) viewM812q2.getLayoutParams()).f746d.f765e >= 0) == (b2 >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: o */
    public final C0344D mo810o(Context context, AttributeSet attributeSet) {
        return new C0359T(context, attributeSet);
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m1347o0() {
        return m817y() == 1;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: p */
    public final C0344D mo811p(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0359T((ViewGroup.MarginLayoutParams) layoutParams) : new C0359T(layoutParams);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m1348p0(View view, int i2, int i3) {
        RecyclerView recyclerView = this.f668b;
        Rect rect = this.f1611x;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m1329v(view));
        }
        C0359T c0359t = (C0359T) view.getLayoutParams();
        int iM1334y0 = m1334y0(i2, ((ViewGroup.MarginLayoutParams) c0359t).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c0359t).rightMargin + rect.right);
        int iM1334y02 = m1334y0(i3, ((ViewGroup.MarginLayoutParams) c0359t).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c0359t).bottomMargin + rect.bottom);
        if (m796a0(view, iM1334y0, iM1334y02, c0359t)) {
            view.measure(iM1334y0, iM1334y02);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m1349q0(int i2) {
        if (this.f1602o == 0) {
            return (i2 == -1) != this.f1605r;
        }
        return ((i2 == -1) == this.f1605r) == m1347o0();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m1350r0(C0349I c0349i, C0380p c0380p) {
        if (!c0380p.f840a || c0380p.f848i) {
            return;
        }
        if (c0380p.f841b == 0) {
            if (c0380p.f844e == -1) {
                m1351s0(c0349i, c0380p.f846g);
                return;
            } else {
                m1352t0(c0349i, c0380p.f845f);
                return;
            }
        }
        int i2 = 1;
        if (c0380p.f844e == -1) {
            int i3 = c0380p.f845f;
            int iM934h = this.f1599l[0].m934h(i3);
            while (i2 < this.f1598k) {
                int iM934h2 = this.f1599l[i2].m934h(i3);
                if (iM934h2 > iM934h) {
                    iM934h = iM934h2;
                }
                i2++;
            }
            int i4 = i3 - iM934h;
            m1351s0(c0349i, i4 < 0 ? c0380p.f846g : c0380p.f846g - Math.min(i4, c0380p.f841b));
            return;
        }
        int i5 = c0380p.f846g;
        int iM932f = this.f1599l[0].m932f(i5);
        while (i2 < this.f1598k) {
            int iM932f2 = this.f1599l[i2].m932f(i5);
            if (iM932f2 < iM932f) {
                iM932f = iM932f2;
            }
            i2++;
        }
        int i6 = iM932f - c0380p.f846g;
        m1352t0(c0349i, i6 < 0 ? c0380p.f845f : Math.min(i6, c0380p.f841b) + c0380p.f845f);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m1351s0(C0349I c0349i, int i2) {
        int iM813r = m813r() - 1;
        if (iM813r >= 0) {
            View viewM812q = m812q(iM813r);
            if (this.f1600m.m967e(viewM812q) < i2 || this.f1600m.m976n(viewM812q) < i2) {
                return;
            }
            C0359T c0359t = (C0359T) viewM812q.getLayoutParams();
            c0359t.getClass();
            if (c0359t.f746d.f761a.size() == 1) {
                return;
            }
            C0359T c0359t2 = (C0359T) ((View) c0359t.f746d.f761a.remove(r3.size() - 1)).getLayoutParams();
            c0359t2.f746d = null;
            c0359t2.getClass();
            throw null;
        }
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: t */
    public final int mo814t(C0349I c0349i, C0352L c0352l) {
        return this.f1602o == 1 ? this.f1598k : super.mo814t(c0349i, c0352l);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m1352t0(C0349I c0349i, int i2) {
        if (m813r() > 0) {
            View viewM812q = m812q(0);
            if (this.f1600m.m964b(viewM812q) > i2 || this.f1600m.m975m(viewM812q) > i2) {
                return;
            }
            C0359T c0359t = (C0359T) viewM812q.getLayoutParams();
            c0359t.getClass();
            if (c0359t.f746d.f761a.size() == 1) {
                return;
            }
            C0362W c0362w = c0359t.f746d;
            ArrayList arrayList = c0362w.f761a;
            C0359T c0359t2 = (C0359T) ((View) arrayList.remove(0)).getLayoutParams();
            c0359t2.f746d = null;
            if (arrayList.size() == 0) {
                c0362w.f763c = Integer.MIN_VALUE;
            }
            c0359t2.getClass();
            throw null;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m1353u0() {
        if (this.f1602o == 1 || !m1347o0()) {
            this.f1605r = this.f1604q;
        } else {
            this.f1605r = !this.f1604q;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m1354v0(int i2) {
        C0380p c0380p = this.f1603p;
        c0380p.f844e = i2;
        c0380p.f843d = this.f1605r != (i2 == -1) ? -1 : 1;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m1355w0(int i2, C0352L c0352l) {
        C0380p c0380p = this.f1603p;
        boolean z2 = false;
        c0380p.f841b = 0;
        c0380p.f842c = i2;
        RecyclerView recyclerView = this.f668b;
        if (recyclerView == null || !recyclerView.f1572f) {
            c0380p.f846g = this.f1600m.m968f() + 0;
            c0380p.f845f = -0;
        } else {
            c0380p.f845f = this.f1600m.m973k() - 0;
            c0380p.f846g = this.f1600m.m969g() + 0;
        }
        c0380p.f847h = false;
        c0380p.f840a = true;
        if (this.f1600m.m971i() == 0 && this.f1600m.m968f() == 0) {
            z2 = true;
        }
        c0380p.f848i = z2;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m1356x0(C0362W c0362w, int i2, int i3) {
        int i4 = c0362w.f764d;
        int i5 = c0362w.f765e;
        if (i2 != -1) {
            int i6 = c0362w.f763c;
            if (i6 == Integer.MIN_VALUE) {
                c0362w.m927a();
                i6 = c0362w.f763c;
            }
            if (i6 - i4 >= i3) {
                this.f1606s.set(i5, false);
                return;
            }
            return;
        }
        int i7 = c0362w.f762b;
        if (i7 == Integer.MIN_VALUE) {
            View view = (View) c0362w.f761a.get(0);
            C0359T c0359t = (C0359T) view.getLayoutParams();
            c0362w.f762b = c0362w.f766f.f1600m.m967e(view);
            c0359t.getClass();
            i7 = c0362w.f762b;
        }
        if (i7 + i4 <= i3) {
            this.f1606s.set(i5, false);
        }
    }
}
