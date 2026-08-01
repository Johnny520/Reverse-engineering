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
import java.util.WeakHashMap;
import p000.AbstractC0019ai;
import p000.AbstractC0540nz;
import p000.AbstractC0979zt;
import p000.C0074bn;
import p000.C0138d4;
import p000.C0159dq;
import p000.C0318i0;
import p000.C0357j0;
import p000.C0503mz;
import p000.C0577oz;
import p000.C0763tz;
import p000.C0939yq;
import p000.C0948yz;
import p000.InterfaceC0911xz;
import p000.RunnableC0919y6;
import p000.j40;
import p000.ja0;
import p000.k40;
import p000.m40;
import p000.n40;
import p000.s90;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0540nz implements InterfaceC0911xz {

    /* JADX INFO: renamed from: B */
    public final C0138d4 f628B;

    /* JADX INFO: renamed from: C */
    public final int f629C;

    /* JADX INFO: renamed from: D */
    public boolean f630D;

    /* JADX INFO: renamed from: E */
    public boolean f631E;

    /* JADX INFO: renamed from: F */
    public m40 f632F;

    /* JADX INFO: renamed from: G */
    public final Rect f633G;

    /* JADX INFO: renamed from: H */
    public final j40 f634H;

    /* JADX INFO: renamed from: I */
    public final boolean f635I;

    /* JADX INFO: renamed from: J */
    public int[] f636J;

    /* JADX INFO: renamed from: K */
    public final RunnableC0919y6 f637K;

    /* JADX INFO: renamed from: p */
    public final int f638p;

    /* JADX INFO: renamed from: q */
    public final n40[] f639q;

    /* JADX INFO: renamed from: r */
    public final AbstractC0019ai f640r;

    /* JADX INFO: renamed from: s */
    public final AbstractC0019ai f641s;

    /* JADX INFO: renamed from: t */
    public final int f642t;

    /* JADX INFO: renamed from: u */
    public int f643u;

    /* JADX INFO: renamed from: v */
    public final C0159dq f644v;

    /* JADX INFO: renamed from: w */
    public boolean f645w;

    /* JADX INFO: renamed from: y */
    public final BitSet f647y;

    /* JADX INFO: renamed from: x */
    public boolean f646x = false;

    /* JADX INFO: renamed from: z */
    public int f648z = -1;

    /* JADX INFO: renamed from: A */
    public int f627A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f638p = -1;
        this.f645w = false;
        C0138d4 c0138d4 = new C0138d4(17, false);
        this.f628B = c0138d4;
        this.f629C = 2;
        this.f633G = new Rect();
        this.f634H = new j40(this);
        this.f635I = true;
        this.f637K = new RunnableC0919y6(9, this);
        C0503mz c0503mzM1954G = AbstractC0540nz.m1954G(context, attributeSet, i, i2);
        int i3 = c0503mzM1954G.f3297a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo353c(null);
        if (i3 != this.f642t) {
            this.f642t = i3;
            AbstractC0019ai abstractC0019ai = this.f640r;
            this.f640r = this.f641s;
            this.f641s = abstractC0019ai;
            m1971j0();
        }
        int i4 = c0503mzM1954G.f3298b;
        mo353c(null);
        if (i4 != this.f638p) {
            int[] iArr = (int[]) c0138d4.f1363b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0138d4.f1364c = null;
            m1971j0();
            this.f638p = i4;
            this.f647y = new BitSet(this.f638p);
            this.f639q = new n40[this.f638p];
            for (int i5 = 0; i5 < this.f638p; i5++) {
                this.f639q[i5] = new n40(this, i5);
            }
            m1971j0();
        }
        boolean z = c0503mzM1954G.f3299c;
        mo353c(null);
        m40 m40Var = this.f632F;
        if (m40Var != null && m40Var.f3139h != z) {
            m40Var.f3139h = z;
        }
        this.f645w = z;
        m1971j0();
        C0159dq c0159dq = new C0159dq();
        c0159dq.f1613a = true;
        c0159dq.f1618f = 0;
        c0159dq.f1619g = 0;
        this.f644v = c0159dq;
        this.f640r = AbstractC0019ai.m97a(this, this.f642t);
        this.f641s = AbstractC0019ai.m97a(this, 1 - this.f642t);
    }

    /* JADX INFO: renamed from: Y0 */
    public static int m420Y0(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX INFO: renamed from: A0 */
    public final int m421A0(C0763tz c0763tz, C0159dq c0159dq, C0948yz c0948yz) {
        n40 n40Var;
        ?? r8;
        int iM1904h;
        int iMo99c;
        int iMo107k;
        int iMo99c2;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1;
        this.f647y.set(0, this.f638p, true);
        C0159dq c0159dq2 = this.f644v;
        int i6 = c0159dq2.f1621i ? c0159dq.f1617e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0159dq.f1617e == 1 ? c0159dq.f1619g + c0159dq.f1614b : c0159dq.f1618f - c0159dq.f1614b;
        int i7 = c0159dq.f1617e;
        for (int i8 = 0; i8 < this.f638p; i8++) {
            if (!this.f639q[i8].f3326a.isEmpty()) {
                m446X0(this.f639q[i8], i7, i6);
            }
        }
        int iMo103g = this.f646x ? this.f640r.mo103g() : this.f640r.mo107k();
        boolean z = false;
        while (true) {
            int i9 = c0159dq.f1615c;
            if (i9 < 0 || i9 >= c0948yz.m2745b() || (!c0159dq2.f1621i && this.f647y.isEmpty())) {
                break;
            }
            View view = c0763tz.m2401i(c0159dq.f1615c, Long.MAX_VALUE).f697a;
            c0159dq.f1615c += c0159dq.f1616d;
            k40 k40Var = (k40) view.getLayoutParams();
            int iM482b = k40Var.f3621a.m482b();
            C0138d4 c0138d4 = this.f628B;
            int[] iArr = (int[]) c0138d4.f1363b;
            int i10 = (iArr == null || iM482b >= iArr.length) ? -1 : iArr[iM482b];
            if (i10 == -1) {
                if (m437O0(c0159dq.f1617e)) {
                    i3 = this.f638p - i5;
                    i2 = -1;
                    i = -1;
                } else {
                    i = i5;
                    i2 = this.f638p;
                    i3 = i4;
                }
                n40 n40Var2 = null;
                if (c0159dq.f1617e == i5) {
                    int iMo107k2 = this.f640r.mo107k();
                    int i11 = Integer.MAX_VALUE;
                    while (i3 != i2) {
                        n40 n40Var3 = this.f639q[i3];
                        int iM1902f = n40Var3.m1902f(iMo107k2);
                        if (iM1902f < i11) {
                            i11 = iM1902f;
                            n40Var2 = n40Var3;
                        }
                        i3 += i;
                    }
                } else {
                    int iMo103g2 = this.f640r.mo103g();
                    int i12 = Integer.MIN_VALUE;
                    while (i3 != i2) {
                        n40 n40Var4 = this.f639q[i3];
                        int iM1904h2 = n40Var4.m1904h(iMo103g2);
                        if (iM1904h2 > i12) {
                            n40Var2 = n40Var4;
                            i12 = iM1904h2;
                        }
                        i3 += i;
                    }
                }
                n40Var = n40Var2;
                c0138d4.m897r(iM482b);
                ((int[]) c0138d4.f1363b)[iM482b] = n40Var.f3330e;
            } else {
                n40Var = this.f639q[i10];
            }
            k40Var.f2696e = n40Var;
            if (c0159dq.f1617e == 1) {
                r8 = 0;
                m1966b(view, -1, false);
            } else {
                r8 = 0;
                m1966b(view, 0, false);
            }
            if (this.f642t == 1) {
                m434M0(view, AbstractC0540nz.m1958w(r8, this.f643u, this.f3466l, r8, ((ViewGroup.MarginLayoutParams) k40Var).width), AbstractC0540nz.m1958w(true, this.f3469o, this.f3467m, m1960B() + m1963E(), ((ViewGroup.MarginLayoutParams) k40Var).height));
            } else {
                m434M0(view, AbstractC0540nz.m1958w(true, this.f3468n, this.f3466l, m1962D() + m1961C(), ((ViewGroup.MarginLayoutParams) k40Var).width), AbstractC0540nz.m1958w(false, this.f643u, this.f3467m, 0, ((ViewGroup.MarginLayoutParams) k40Var).height));
            }
            if (c0159dq.f1617e == 1) {
                iMo99c = n40Var.m1902f(iMo103g);
                iM1904h = this.f640r.mo99c(view) + iMo99c;
            } else {
                iM1904h = n40Var.m1904h(iMo103g);
                iMo99c = iM1904h - this.f640r.mo99c(view);
            }
            if (c0159dq.f1617e == 1) {
                n40 n40Var5 = k40Var.f2696e;
                n40Var5.getClass();
                k40 k40Var2 = (k40) view.getLayoutParams();
                k40Var2.f2696e = n40Var5;
                ArrayList arrayList = n40Var5.f3326a;
                arrayList.add(view);
                n40Var5.f3328c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    n40Var5.f3327b = Integer.MIN_VALUE;
                }
                if (k40Var2.f3621a.m488h() || k40Var2.f3621a.m491k()) {
                    n40Var5.f3329d = n40Var5.f3331f.f640r.mo99c(view) + n40Var5.f3329d;
                }
            } else {
                n40 n40Var6 = k40Var.f2696e;
                n40Var6.getClass();
                k40 k40Var3 = (k40) view.getLayoutParams();
                k40Var3.f2696e = n40Var6;
                ArrayList arrayList2 = n40Var6.f3326a;
                arrayList2.add(0, view);
                n40Var6.f3327b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    n40Var6.f3328c = Integer.MIN_VALUE;
                }
                if (k40Var3.f3621a.m488h() || k40Var3.f3621a.m491k()) {
                    n40Var6.f3329d = n40Var6.f3331f.f640r.mo99c(view) + n40Var6.f3329d;
                }
            }
            if (m432L0() && this.f642t == 1) {
                iMo99c2 = this.f641s.mo103g() - (((this.f638p - 1) - n40Var.f3330e) * this.f643u);
                iMo107k = iMo99c2 - this.f641s.mo99c(view);
            } else {
                iMo107k = this.f641s.mo107k() + (n40Var.f3330e * this.f643u);
                iMo99c2 = this.f641s.mo99c(view) + iMo107k;
            }
            if (this.f642t == 1) {
                AbstractC0540nz.m1956L(view, iMo107k, iMo99c, iMo99c2, iM1904h);
            } else {
                AbstractC0540nz.m1956L(view, iMo99c, iMo107k, iM1904h, iMo99c2);
            }
            m446X0(n40Var, c0159dq2.f1617e, i6);
            m439Q0(c0763tz, c0159dq2);
            if (c0159dq2.f1620h && view.hasFocusable()) {
                this.f647y.set(n40Var.f3330e, false);
            }
            i5 = 1;
            z = true;
            i4 = 0;
        }
        if (!z) {
            m439Q0(c0763tz, c0159dq2);
        }
        int iMo107k3 = c0159dq2.f1617e == -1 ? this.f640r.mo107k() - m429I0(this.f640r.mo107k()) : m428H0(this.f640r.mo103g()) - this.f640r.mo103g();
        if (iMo107k3 > 0) {
            return Math.min(c0159dq.f1614b, iMo107k3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: B0 */
    public final View m422B0(boolean z) {
        int iMo107k = this.f640r.mo107k();
        int iMo103g = this.f640r.mo103g();
        View view = null;
        for (int iM1980v = m1980v() - 1; iM1980v >= 0; iM1980v--) {
            View viewM1978u = m1978u(iM1980v);
            int iMo101e = this.f640r.mo101e(viewM1978u);
            int iMo98b = this.f640r.mo98b(viewM1978u);
            if (iMo98b > iMo107k && iMo101e < iMo103g) {
                if (iMo98b <= iMo103g || !z) {
                    return viewM1978u;
                }
                if (view == null) {
                    view = viewM1978u;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: C0 */
    public final View m423C0(boolean z) {
        int iMo107k = this.f640r.mo107k();
        int iMo103g = this.f640r.mo103g();
        int iM1980v = m1980v();
        View view = null;
        for (int i = 0; i < iM1980v; i++) {
            View viewM1978u = m1978u(i);
            int iMo101e = this.f640r.mo101e(viewM1978u);
            if (this.f640r.mo98b(viewM1978u) > iMo107k && iMo101e < iMo103g) {
                if (iMo101e >= iMo107k || !z) {
                    return viewM1978u;
                }
                if (view == null) {
                    view = viewM1978u;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m424D0(C0763tz c0763tz, C0948yz c0948yz, boolean z) {
        int iMo103g;
        int iM428H0 = m428H0(Integer.MIN_VALUE);
        if (iM428H0 != Integer.MIN_VALUE && (iMo103g = this.f640r.mo103g() - iM428H0) > 0) {
            int i = iMo103g - (-m443U0(-iMo103g, c0763tz, c0948yz));
            if (!z || i <= 0) {
                return;
            }
            this.f640r.mo111o(i);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m425E0(C0763tz c0763tz, C0948yz c0948yz, boolean z) {
        int iMo107k;
        int iM429I0 = m429I0(Integer.MAX_VALUE);
        if (iM429I0 != Integer.MAX_VALUE && (iMo107k = iM429I0 - this.f640r.mo107k()) > 0) {
            int iM443U0 = iMo107k - m443U0(iMo107k, c0763tz, c0948yz);
            if (!z || iM443U0 <= 0) {
                return;
            }
            this.f640r.mo111o(-iM443U0);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final int m426F0() {
        if (m1980v() == 0) {
            return 0;
        }
        return AbstractC0540nz.m1953F(m1978u(0));
    }

    /* JADX INFO: renamed from: G0 */
    public final int m427G0() {
        int iM1980v = m1980v();
        if (iM1980v == 0) {
            return 0;
        }
        return AbstractC0540nz.m1953F(m1978u(iM1980v - 1));
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: H */
    public final int mo287H(C0763tz c0763tz, C0948yz c0948yz) {
        return this.f642t == 0 ? this.f638p : super.mo287H(c0763tz, c0948yz);
    }

    /* JADX INFO: renamed from: H0 */
    public final int m428H0(int i) {
        int iM1902f = this.f639q[0].m1902f(i);
        for (int i2 = 1; i2 < this.f638p; i2++) {
            int iM1902f2 = this.f639q[i2].m1902f(i);
            if (iM1902f2 > iM1902f) {
                iM1902f = iM1902f2;
            }
        }
        return iM1902f;
    }

    /* JADX INFO: renamed from: I0 */
    public final int m429I0(int i) {
        int iM1904h = this.f639q[0].m1904h(i);
        for (int i2 = 1; i2 < this.f638p; i2++) {
            int iM1904h2 = this.f639q[i2].m1904h(i);
            if (iM1904h2 < iM1904h) {
                iM1904h = iM1904h2;
            }
        }
        return iM1904h;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: J */
    public final boolean mo333J() {
        return this.f629C != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: J0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m430J0(int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m430J0(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /* JADX INFO: renamed from: K0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View m431K0() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m431K0():android.view.View");
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m432L0() {
        return m1959A() == 1;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: M */
    public final void mo433M(int i) {
        super.mo433M(i);
        for (int i2 = 0; i2 < this.f638p; i2++) {
            n40 n40Var = this.f639q[i2];
            int i3 = n40Var.f3327b;
            if (i3 != Integer.MIN_VALUE) {
                n40Var.f3327b = i3 + i;
            }
            int i4 = n40Var.f3328c;
            if (i4 != Integer.MIN_VALUE) {
                n40Var.f3328c = i4 + i;
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m434M0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f3456b;
        Rect rect = this.f633G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m380J(view));
        }
        k40 k40Var = (k40) view.getLayoutParams();
        int iM420Y0 = m420Y0(i, ((ViewGroup.MarginLayoutParams) k40Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) k40Var).rightMargin + rect.right);
        int iM420Y02 = m420Y0(i2, ((ViewGroup.MarginLayoutParams) k40Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) k40Var).bottomMargin + rect.bottom);
        if (m1977s0(view, iM420Y0, iM420Y02, k40Var)) {
            view.measure(iM420Y0, iM420Y02);
        }
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: N */
    public final void mo435N(int i) {
        super.mo435N(i);
        for (int i2 = 0; i2 < this.f638p; i2++) {
            n40 n40Var = this.f639q[i2];
            int i3 = n40Var.f3327b;
            if (i3 != Integer.MIN_VALUE) {
                n40Var.f3327b = i3 + i;
            }
            int i4 = n40Var.f3328c;
            if (i4 != Integer.MIN_VALUE) {
                n40Var.f3328c = i4 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x041f  */
    /* JADX INFO: renamed from: N0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m436N0(p000.C0763tz r17, p000.C0948yz r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m436N0(tz, yz, boolean):void");
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m437O0(int i) {
        if (this.f642t == 0) {
            return (i == -1) != this.f646x;
        }
        return ((i == -1) == this.f646x) == m432L0();
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: P */
    public final void mo339P(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3456b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f637K);
        }
        for (int i = 0; i < this.f638p; i++) {
            this.f639q[i].m1898b();
        }
        recyclerView.requestLayout();
    }

    /* JADX INFO: renamed from: P0 */
    public final void m438P0(int i, C0948yz c0948yz) {
        int iM426F0;
        int i2;
        if (i > 0) {
            iM426F0 = m427G0();
            i2 = 1;
        } else {
            iM426F0 = m426F0();
            i2 = -1;
        }
        C0159dq c0159dq = this.f644v;
        c0159dq.f1613a = true;
        m445W0(iM426F0, c0948yz);
        m444V0(i2);
        c0159dq.f1615c = iM426F0 + c0159dq.f1616d;
        c0159dq.f1614b = Math.abs(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mo289Q(android.view.View r9, int r10, p000.C0763tz r11, p000.C0948yz r12) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo289Q(android.view.View, int, tz, yz):android.view.View");
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m439Q0(C0763tz c0763tz, C0159dq c0159dq) {
        if (!c0159dq.f1613a || c0159dq.f1621i) {
            return;
        }
        if (c0159dq.f1614b == 0) {
            if (c0159dq.f1617e == -1) {
                m440R0(c0763tz, c0159dq.f1619g);
                return;
            } else {
                m441S0(c0763tz, c0159dq.f1618f);
                return;
            }
        }
        int i = 1;
        if (c0159dq.f1617e == -1) {
            int i2 = c0159dq.f1618f;
            int iM1904h = this.f639q[0].m1904h(i2);
            while (i < this.f638p) {
                int iM1904h2 = this.f639q[i].m1904h(i2);
                if (iM1904h2 > iM1904h) {
                    iM1904h = iM1904h2;
                }
                i++;
            }
            int i3 = i2 - iM1904h;
            m440R0(c0763tz, i3 < 0 ? c0159dq.f1619g : c0159dq.f1619g - Math.min(i3, c0159dq.f1614b));
            return;
        }
        int i4 = c0159dq.f1619g;
        int iM1902f = this.f639q[0].m1902f(i4);
        while (i < this.f638p) {
            int iM1902f2 = this.f639q[i].m1902f(i4);
            if (iM1902f2 < iM1902f) {
                iM1902f = iM1902f2;
            }
            i++;
        }
        int i5 = iM1902f - c0159dq.f1619g;
        m441S0(c0763tz, i5 < 0 ? c0159dq.f1618f : Math.min(i5, c0159dq.f1614b) + c0159dq.f1618f);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: R */
    public final void mo342R(AccessibilityEvent accessibilityEvent) {
        super.mo342R(accessibilityEvent);
        if (m1980v() > 0) {
            View viewM423C0 = m423C0(false);
            View viewM422B0 = m422B0(false);
            if (viewM423C0 == null || viewM422B0 == null) {
                return;
            }
            int iM1953F = AbstractC0540nz.m1953F(viewM423C0);
            int iM1953F2 = AbstractC0540nz.m1953F(viewM422B0);
            if (iM1953F < iM1953F2) {
                accessibilityEvent.setFromIndex(iM1953F);
                accessibilityEvent.setToIndex(iM1953F2);
            } else {
                accessibilityEvent.setFromIndex(iM1953F2);
                accessibilityEvent.setToIndex(iM1953F);
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m440R0(C0763tz c0763tz, int i) {
        for (int iM1980v = m1980v() - 1; iM1980v >= 0; iM1980v--) {
            View viewM1978u = m1978u(iM1980v);
            if (this.f640r.mo101e(viewM1978u) < i || this.f640r.mo110n(viewM1978u) < i) {
                return;
            }
            k40 k40Var = (k40) viewM1978u.getLayoutParams();
            k40Var.getClass();
            if (k40Var.f2696e.f3326a.size() == 1) {
                return;
            }
            n40 n40Var = k40Var.f2696e;
            ArrayList arrayList = n40Var.f3326a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            k40 k40Var2 = (k40) view.getLayoutParams();
            k40Var2.f2696e = null;
            if (k40Var2.f3621a.m488h() || k40Var2.f3621a.m491k()) {
                n40Var.f3329d -= n40Var.f3331f.f640r.mo99c(view);
            }
            if (size == 1) {
                n40Var.f3327b = Integer.MIN_VALUE;
            }
            n40Var.f3328c = Integer.MIN_VALUE;
            m1969g0(viewM1978u, c0763tz);
        }
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: S */
    public final void mo291S(C0763tz c0763tz, C0948yz c0948yz, View view, C0357j0 c0357j0) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof k40)) {
            m1965T(view, c0357j0);
            return;
        }
        k40 k40Var = (k40) layoutParams;
        if (this.f642t == 0) {
            n40 n40Var = k40Var.f2696e;
            c0357j0.m1538f(C0318i0.m1382a(false, n40Var == null ? -1 : n40Var.f3330e, 1, -1, -1));
        } else {
            n40 n40Var2 = k40Var.f2696e;
            c0357j0.m1538f(C0318i0.m1382a(false, -1, -1, n40Var2 == null ? -1 : n40Var2.f3330e, 1));
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m441S0(C0763tz c0763tz, int i) {
        while (m1980v() > 0) {
            View viewM1978u = m1978u(0);
            if (this.f640r.mo98b(viewM1978u) > i || this.f640r.mo109m(viewM1978u) > i) {
                return;
            }
            k40 k40Var = (k40) viewM1978u.getLayoutParams();
            k40Var.getClass();
            if (k40Var.f2696e.f3326a.size() == 1) {
                return;
            }
            n40 n40Var = k40Var.f2696e;
            ArrayList arrayList = n40Var.f3326a;
            View view = (View) arrayList.remove(0);
            k40 k40Var2 = (k40) view.getLayoutParams();
            k40Var2.f2696e = null;
            if (arrayList.size() == 0) {
                n40Var.f3328c = Integer.MIN_VALUE;
            }
            if (k40Var2.f3621a.m488h() || k40Var2.f3621a.m491k()) {
                n40Var.f3329d -= n40Var.f3331f.f640r.mo99c(view);
            }
            n40Var.f3327b = Integer.MIN_VALUE;
            m1969g0(viewM1978u, c0763tz);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m442T0() {
        if (this.f642t == 1 || !m432L0()) {
            this.f646x = this.f645w;
        } else {
            this.f646x = !this.f645w;
        }
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: U */
    public final void mo293U(int i, int i2) {
        m430J0(i, i2, 1);
    }

    /* JADX INFO: renamed from: U0 */
    public final int m443U0(int i, C0763tz c0763tz, C0948yz c0948yz) {
        if (m1980v() == 0 || i == 0) {
            return 0;
        }
        m438P0(i, c0948yz);
        C0159dq c0159dq = this.f644v;
        int iM421A0 = m421A0(c0763tz, c0159dq, c0948yz);
        if (c0159dq.f1614b >= iM421A0) {
            i = i < 0 ? -iM421A0 : iM421A0;
        }
        this.f640r.mo111o(-i);
        this.f630D = this.f646x;
        c0159dq.f1614b = 0;
        m439Q0(c0763tz, c0159dq);
        return i;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: V */
    public final void mo294V() {
        C0138d4 c0138d4 = this.f628B;
        int[] iArr = (int[]) c0138d4.f1363b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        c0138d4.f1364c = null;
        m1971j0();
    }

    /* JADX INFO: renamed from: V0 */
    public final void m444V0(int i) {
        C0159dq c0159dq = this.f644v;
        c0159dq.f1617e = i;
        c0159dq.f1616d = this.f646x != (i == -1) ? -1 : 1;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: W */
    public final void mo295W(int i, int i2) {
        m430J0(i, i2, 8);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m445W0(int i, C0948yz c0948yz) {
        int iMo108l;
        int iMo108l2;
        int i2;
        C0159dq c0159dq = this.f644v;
        boolean z = false;
        c0159dq.f1614b = 0;
        c0159dq.f1615c = i;
        C0939yq c0939yq = this.f3459e;
        if (c0939yq == null || !c0939yq.f5383e || (i2 = c0948yz.f5415a) == -1) {
            iMo108l = 0;
            iMo108l2 = 0;
        } else {
            if (this.f646x == (i2 < i)) {
                iMo108l = this.f640r.mo108l();
                iMo108l2 = 0;
            } else {
                iMo108l2 = this.f640r.mo108l();
                iMo108l = 0;
            }
        }
        RecyclerView recyclerView = this.f3456b;
        if (recyclerView == null || !recyclerView.f595g) {
            c0159dq.f1619g = this.f640r.mo102f() + iMo108l;
            c0159dq.f1618f = -iMo108l2;
        } else {
            c0159dq.f1618f = this.f640r.mo107k() - iMo108l2;
            c0159dq.f1619g = this.f640r.mo103g() + iMo108l;
        }
        c0159dq.f1620h = false;
        c0159dq.f1613a = true;
        if (this.f640r.mo105i() == 0 && this.f640r.mo102f() == 0) {
            z = true;
        }
        c0159dq.f1621i = z;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: X */
    public final void mo296X(int i, int i2) {
        m430J0(i, i2, 2);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m446X0(n40 n40Var, int i, int i2) {
        int i3 = n40Var.f3329d;
        int i4 = n40Var.f3330e;
        if (i != -1) {
            int i5 = n40Var.f3328c;
            if (i5 == Integer.MIN_VALUE) {
                n40Var.m1897a();
                i5 = n40Var.f3328c;
            }
            if (i5 - i3 >= i2) {
                this.f647y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = n40Var.f3327b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) n40Var.f3326a.get(0);
            k40 k40Var = (k40) view.getLayoutParams();
            n40Var.f3327b = n40Var.f3331f.f640r.mo101e(view);
            k40Var.getClass();
            i6 = n40Var.f3327b;
        }
        if (i6 + i3 <= i2) {
            this.f647y.set(i4, false);
        }
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: Y */
    public final void mo297Y(int i, int i2) {
        m430J0(i, i2, 4);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: Z */
    public final void mo299Z(C0763tz c0763tz, C0948yz c0948yz) {
        m436N0(c0763tz, c0948yz, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // p000.InterfaceC0911xz
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF mo349a(int r4) {
        /*
            r3 = this;
            int r0 = r3.m1980v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f646x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.m426F0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f646x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f642t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo349a(int):android.graphics.PointF");
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: a0 */
    public final void mo300a0(C0948yz c0948yz) {
        this.f648z = -1;
        this.f627A = Integer.MIN_VALUE;
        this.f632F = null;
        this.f634H.m1546a();
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: b0 */
    public final void mo351b0(Parcelable parcelable) {
        if (parcelable instanceof m40) {
            this.f632F = (m40) parcelable;
            m1971j0();
        }
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: c */
    public final void mo353c(String str) {
        if (this.f632F == null) {
            super.mo353c(str);
        }
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: c0 */
    public final Parcelable mo354c0() {
        int iM1904h;
        int iMo107k;
        int[] iArr;
        m40 m40Var = this.f632F;
        if (m40Var != null) {
            m40 m40Var2 = new m40();
            m40Var2.f3134c = m40Var.f3134c;
            m40Var2.f3132a = m40Var.f3132a;
            m40Var2.f3133b = m40Var.f3133b;
            m40Var2.f3135d = m40Var.f3135d;
            m40Var2.f3136e = m40Var.f3136e;
            m40Var2.f3137f = m40Var.f3137f;
            m40Var2.f3139h = m40Var.f3139h;
            m40Var2.f3140i = m40Var.f3140i;
            m40Var2.f3141j = m40Var.f3141j;
            m40Var2.f3138g = m40Var.f3138g;
            return m40Var2;
        }
        m40 m40Var3 = new m40();
        m40Var3.f3139h = this.f645w;
        m40Var3.f3140i = this.f630D;
        m40Var3.f3141j = this.f631E;
        C0138d4 c0138d4 = this.f628B;
        if (c0138d4 == null || (iArr = (int[]) c0138d4.f1363b) == null) {
            m40Var3.f3136e = 0;
        } else {
            m40Var3.f3137f = iArr;
            m40Var3.f3136e = iArr.length;
            m40Var3.f3138g = (ArrayList) c0138d4.f1364c;
        }
        if (m1980v() <= 0) {
            m40Var3.f3132a = -1;
            m40Var3.f3133b = -1;
            m40Var3.f3134c = 0;
            return m40Var3;
        }
        m40Var3.f3132a = this.f630D ? m427G0() : m426F0();
        View viewM422B0 = this.f646x ? m422B0(true) : m423C0(true);
        m40Var3.f3133b = viewM422B0 != null ? AbstractC0540nz.m1953F(viewM422B0) : -1;
        int i = this.f638p;
        m40Var3.f3134c = i;
        m40Var3.f3135d = new int[i];
        for (int i2 = 0; i2 < this.f638p; i2++) {
            if (this.f630D) {
                iM1904h = this.f639q[i2].m1902f(Integer.MIN_VALUE);
                if (iM1904h != Integer.MIN_VALUE) {
                    iMo107k = this.f640r.mo103g();
                    iM1904h -= iMo107k;
                }
            } else {
                iM1904h = this.f639q[i2].m1904h(Integer.MIN_VALUE);
                if (iM1904h != Integer.MIN_VALUE) {
                    iMo107k = this.f640r.mo107k();
                    iM1904h -= iMo107k;
                }
            }
            m40Var3.f3135d[i2] = iM1904h;
        }
        return m40Var3;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: d */
    public final boolean mo355d() {
        return this.f642t == 0;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: d0 */
    public final void mo447d0(int i) {
        if (i == 0) {
            m448y0();
        }
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: e */
    public final boolean mo356e() {
        return this.f642t == 1;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: f */
    public final boolean mo304f(C0577oz c0577oz) {
        return c0577oz instanceof k40;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: h */
    public final void mo357h(int i, int i2, C0948yz c0948yz, C0074bn c0074bn) {
        C0159dq c0159dq;
        int iM1902f;
        int iM1904h;
        if (this.f642t != 0) {
            i = i2;
        }
        if (m1980v() == 0 || i == 0) {
            return;
        }
        m438P0(i, c0948yz);
        int[] iArr = this.f636J;
        if (iArr == null || iArr.length < this.f638p) {
            this.f636J = new int[this.f638p];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f638p;
            c0159dq = this.f644v;
            if (i3 >= i5) {
                break;
            }
            if (c0159dq.f1616d == -1) {
                iM1902f = c0159dq.f1618f;
                iM1904h = this.f639q[i3].m1904h(iM1902f);
            } else {
                iM1902f = this.f639q[i3].m1902f(c0159dq.f1619g);
                iM1904h = c0159dq.f1619g;
            }
            int i6 = iM1902f - iM1904h;
            if (i6 >= 0) {
                this.f636J[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f636J, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c0159dq.f1615c;
            if (i8 < 0 || i8 >= c0948yz.m2745b()) {
                return;
            }
            c0074bn.m562a(c0159dq.f1615c, this.f636J[i7]);
            c0159dq.f1615c += c0159dq.f1616d;
        }
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: j */
    public final int mo359j(C0948yz c0948yz) {
        if (m1980v() == 0) {
            return 0;
        }
        boolean z = !this.f635I;
        return AbstractC0979zt.m2826g(c0948yz, this.f640r, m423C0(z), m422B0(z), this, this.f635I);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: k */
    public final int mo310k(C0948yz c0948yz) {
        return m449z0(c0948yz);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: k0 */
    public final int mo311k0(int i, C0763tz c0763tz, C0948yz c0948yz) {
        return m443U0(i, c0763tz, c0948yz);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: l */
    public final int mo313l(C0948yz c0948yz) {
        if (m1980v() == 0) {
            return 0;
        }
        boolean z = !this.f635I;
        return AbstractC0979zt.m2828i(c0948yz, this.f640r, m423C0(z), m422B0(z), this, this.f635I);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: l0 */
    public final void mo360l0(int i) {
        m40 m40Var = this.f632F;
        if (m40Var != null && m40Var.f3132a != i) {
            m40Var.f3135d = null;
            m40Var.f3134c = 0;
            m40Var.f3132a = -1;
            m40Var.f3133b = -1;
        }
        this.f648z = i;
        this.f627A = Integer.MIN_VALUE;
        m1971j0();
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: m */
    public final int mo361m(C0948yz c0948yz) {
        if (m1980v() == 0) {
            return 0;
        }
        boolean z = !this.f635I;
        return AbstractC0979zt.m2826g(c0948yz, this.f640r, m423C0(z), m422B0(z), this, this.f635I);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: m0 */
    public final int mo314m0(int i, C0763tz c0763tz, C0948yz c0948yz) {
        return m443U0(i, c0763tz, c0948yz);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: n */
    public final int mo315n(C0948yz c0948yz) {
        return m449z0(c0948yz);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: o */
    public final int mo316o(C0948yz c0948yz) {
        if (m1980v() == 0) {
            return 0;
        }
        boolean z = !this.f635I;
        return AbstractC0979zt.m2828i(c0948yz, this.f640r, m423C0(z), m422B0(z), this, this.f635I);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: p0 */
    public final void mo317p0(Rect rect, int i, int i2) {
        int iM1957g;
        int iM1957g2;
        int iM1962D = m1962D() + m1961C();
        int iM1960B = m1960B() + m1963E();
        int i3 = this.f642t;
        int i4 = this.f638p;
        if (i3 == 1) {
            int iHeight = rect.height() + iM1960B;
            RecyclerView recyclerView = this.f3456b;
            WeakHashMap weakHashMap = ja0.f2600a;
            iM1957g2 = AbstractC0540nz.m1957g(i2, iHeight, s90.m2312d(recyclerView));
            iM1957g = AbstractC0540nz.m1957g(i, (this.f643u * i4) + iM1962D, s90.m2313e(this.f3456b));
        } else {
            int iWidth = rect.width() + iM1962D;
            RecyclerView recyclerView2 = this.f3456b;
            WeakHashMap weakHashMap2 = ja0.f2600a;
            iM1957g = AbstractC0540nz.m1957g(i, iWidth, s90.m2313e(recyclerView2));
            iM1957g2 = AbstractC0540nz.m1957g(i2, (this.f643u * i4) + iM1960B, s90.m2312d(this.f3456b));
        }
        this.f3456b.setMeasuredDimension(iM1957g, iM1957g2);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: r */
    public final C0577oz mo318r() {
        return this.f642t == 0 ? new k40(-2, -1) : new k40(-1, -2);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: s */
    public final C0577oz mo319s(Context context, AttributeSet attributeSet) {
        return new k40(context, attributeSet);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: t */
    public final C0577oz mo320t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new k40((ViewGroup.MarginLayoutParams) layoutParams) : new k40(layoutParams);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: v0 */
    public final void mo364v0(RecyclerView recyclerView, int i) {
        C0939yq c0939yq = new C0939yq(recyclerView.getContext());
        c0939yq.f5379a = i;
        m1981w0(c0939yq);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: x */
    public final int mo321x(C0763tz c0763tz, C0948yz c0948yz) {
        return this.f642t == 1 ? this.f638p : super.mo321x(c0763tz, c0948yz);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: x0 */
    public final boolean mo322x0() {
        return this.f632F == null;
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m448y0() {
        int iM426F0;
        if (m1980v() != 0 && this.f629C != 0 && this.f3461g) {
            if (this.f646x) {
                iM426F0 = m427G0();
                m426F0();
            } else {
                iM426F0 = m426F0();
                m427G0();
            }
            if (iM426F0 == 0 && m431K0() != null) {
                C0138d4 c0138d4 = this.f628B;
                int[] iArr = (int[]) c0138d4.f1363b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                c0138d4.f1364c = null;
                this.f3460f = true;
                m1971j0();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z0 */
    public final int m449z0(C0948yz c0948yz) {
        if (m1980v() == 0) {
            return 0;
        }
        boolean z = !this.f635I;
        return AbstractC0979zt.m2827h(c0948yz, this.f640r, m423C0(z), m422B0(z), this, this.f635I, this.f646x);
    }
}
