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
import p000.AbstractC0105ci;
import p000.AbstractC0498mu;
import p000.AbstractC0799uz;
import p000.C0124cr;
import p000.C0138d4;
import p000.C0157dn;
import p000.C0307hq;
import p000.C0318i0;
import p000.C0357j0;
import p000.C0762tz;
import p000.C0836vz;
import p000.RunnableC0325i7;
import p000.a00;
import p000.e00;
import p000.f00;
import p000.oa0;
import p000.q40;
import p000.r40;
import p000.t40;
import p000.u40;
import p000.x90;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends AbstractC0799uz implements e00 {

    /* JADX INFO: renamed from: B */
    public final C0138d4 f591B;

    /* JADX INFO: renamed from: C */
    public final int f592C;

    /* JADX INFO: renamed from: D */
    public boolean f593D;

    /* JADX INFO: renamed from: E */
    public boolean f594E;

    /* JADX INFO: renamed from: F */
    public t40 f595F;

    /* JADX INFO: renamed from: G */
    public final Rect f596G;

    /* JADX INFO: renamed from: H */
    public final q40 f597H;

    /* JADX INFO: renamed from: I */
    public final boolean f598I;

    /* JADX INFO: renamed from: J */
    public int[] f599J;

    /* JADX INFO: renamed from: K */
    public final RunnableC0325i7 f600K;

    /* JADX INFO: renamed from: p */
    public final int f601p;

    /* JADX INFO: renamed from: q */
    public final u40[] f602q;

    /* JADX INFO: renamed from: r */
    public final AbstractC0105ci f603r;

    /* JADX INFO: renamed from: s */
    public final AbstractC0105ci f604s;

    /* JADX INFO: renamed from: t */
    public final int f605t;

    /* JADX INFO: renamed from: u */
    public int f606u;

    /* JADX INFO: renamed from: v */
    public final C0307hq f607v;

    /* JADX INFO: renamed from: w */
    public boolean f608w;

    /* JADX INFO: renamed from: y */
    public final BitSet f610y;

    /* JADX INFO: renamed from: x */
    public boolean f609x = false;

    /* JADX INFO: renamed from: z */
    public int f611z = -1;

    /* JADX INFO: renamed from: A */
    public int f590A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f601p = -1;
        this.f608w = false;
        C0138d4 c0138d4 = new C0138d4(17, false);
        this.f591B = c0138d4;
        this.f592C = 2;
        this.f596G = new Rect();
        this.f597H = new q40(this);
        this.f598I = true;
        this.f600K = new RunnableC0325i7(9, this);
        C0762tz c0762tzM2502G = AbstractC0799uz.m2502G(context, attributeSet, i, i2);
        int i3 = c0762tzM2502G.f4595a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo338c(null);
        if (i3 != this.f605t) {
            this.f605t = i3;
            AbstractC0105ci abstractC0105ci = this.f603r;
            this.f603r = this.f604s;
            this.f604s = abstractC0105ci;
            m2519j0();
        }
        int i4 = c0762tzM2502G.f4596b;
        mo338c(null);
        if (i4 != this.f601p) {
            int[] iArr = (int[]) c0138d4.f1297b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0138d4.f1298c = null;
            m2519j0();
            this.f601p = i4;
            this.f610y = new BitSet(this.f601p);
            this.f602q = new u40[this.f601p];
            for (int i5 = 0; i5 < this.f601p; i5++) {
                this.f602q[i5] = new u40(this, i5);
            }
            m2519j0();
        }
        boolean z = c0762tzM2502G.f4597c;
        mo338c(null);
        t40 t40Var = this.f595F;
        if (t40Var != null && t40Var.f4408h != z) {
            t40Var.f4408h = z;
        }
        this.f608w = z;
        m2519j0();
        C0307hq c0307hq = new C0307hq();
        c0307hq.f2243a = true;
        c0307hq.f2248f = 0;
        c0307hq.f2249g = 0;
        this.f607v = c0307hq;
        this.f603r = AbstractC0105ci.m635a(this, this.f605t);
        this.f604s = AbstractC0105ci.m635a(this, 1 - this.f605t);
    }

    /* JADX INFO: renamed from: Y0 */
    public static int m405Y0(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    /* JADX INFO: renamed from: A0 */
    public final int m406A0(a00 a00Var, C0307hq c0307hq, f00 f00Var) {
        u40 u40Var;
        ?? r8;
        int iM2437h;
        int iMo637c;
        int iMo645k;
        int iMo637c2;
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 1;
        this.f610y.set(0, this.f601p, true);
        C0307hq c0307hq2 = this.f607v;
        int i6 = c0307hq2.f2251i ? c0307hq.f2247e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c0307hq.f2247e == 1 ? c0307hq.f2249g + c0307hq.f2244b : c0307hq.f2248f - c0307hq.f2244b;
        int i7 = c0307hq.f2247e;
        for (int i8 = 0; i8 < this.f601p; i8++) {
            if (!this.f602q[i8].f4625a.isEmpty()) {
                m431X0(this.f602q[i8], i7, i6);
            }
        }
        int iMo641g = this.f609x ? this.f603r.mo641g() : this.f603r.mo645k();
        boolean z = false;
        while (true) {
            int i9 = c0307hq.f2245c;
            if (i9 < 0 || i9 >= f00Var.m1068b() || (!c0307hq2.f2251i && this.f610y.isEmpty())) {
                break;
            }
            View view = a00Var.m11i(c0307hq.f2245c, Long.MAX_VALUE).f2296a;
            c0307hq.f2245c += c0307hq.f2246d;
            r40 r40Var = (r40) view.getLayoutParams();
            int iM1420b = r40Var.f5017a.m1420b();
            C0138d4 c0138d4 = this.f591B;
            int[] iArr = (int[]) c0138d4.f1297b;
            int i10 = (iArr == null || iM1420b >= iArr.length) ? -1 : iArr[iM1420b];
            if (i10 == -1) {
                if (m422O0(c0307hq.f2247e)) {
                    i3 = this.f601p - i5;
                    i2 = -1;
                    i = -1;
                } else {
                    i = i5;
                    i2 = this.f601p;
                    i3 = i4;
                }
                u40 u40Var2 = null;
                if (c0307hq.f2247e == i5) {
                    int iMo645k2 = this.f603r.mo645k();
                    int i11 = Integer.MAX_VALUE;
                    while (i3 != i2) {
                        u40 u40Var3 = this.f602q[i3];
                        int iM2435f = u40Var3.m2435f(iMo645k2);
                        if (iM2435f < i11) {
                            i11 = iM2435f;
                            u40Var2 = u40Var3;
                        }
                        i3 += i;
                    }
                } else {
                    int iMo641g2 = this.f603r.mo641g();
                    int i12 = Integer.MIN_VALUE;
                    while (i3 != i2) {
                        u40 u40Var4 = this.f602q[i3];
                        int iM2437h2 = u40Var4.m2437h(iMo641g2);
                        if (iM2437h2 > i12) {
                            u40Var2 = u40Var4;
                            i12 = iM2437h2;
                        }
                        i3 += i;
                    }
                }
                u40Var = u40Var2;
                c0138d4.m857r(iM1420b);
                ((int[]) c0138d4.f1297b)[iM1420b] = u40Var.f4629e;
            } else {
                u40Var = this.f602q[i10];
            }
            r40Var.f4059e = u40Var;
            if (c0307hq.f2247e == 1) {
                r8 = 0;
                m2514b(view, -1, false);
            } else {
                r8 = 0;
                m2514b(view, 0, false);
            }
            if (this.f605t == 1) {
                m419M0(view, AbstractC0799uz.m2506w(r8, this.f606u, this.f4866l, r8, ((ViewGroup.MarginLayoutParams) r40Var).width), AbstractC0799uz.m2506w(true, this.f4869o, this.f4867m, m2508B() + m2511E(), ((ViewGroup.MarginLayoutParams) r40Var).height));
            } else {
                m419M0(view, AbstractC0799uz.m2506w(true, this.f4868n, this.f4866l, m2510D() + m2509C(), ((ViewGroup.MarginLayoutParams) r40Var).width), AbstractC0799uz.m2506w(false, this.f606u, this.f4867m, 0, ((ViewGroup.MarginLayoutParams) r40Var).height));
            }
            if (c0307hq.f2247e == 1) {
                iMo637c = u40Var.m2435f(iMo641g);
                iM2437h = this.f603r.mo637c(view) + iMo637c;
            } else {
                iM2437h = u40Var.m2437h(iMo641g);
                iMo637c = iM2437h - this.f603r.mo637c(view);
            }
            if (c0307hq.f2247e == 1) {
                u40 u40Var5 = r40Var.f4059e;
                u40Var5.getClass();
                r40 r40Var2 = (r40) view.getLayoutParams();
                r40Var2.f4059e = u40Var5;
                ArrayList arrayList = u40Var5.f4625a;
                arrayList.add(view);
                u40Var5.f4627c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    u40Var5.f4626b = Integer.MIN_VALUE;
                }
                if (r40Var2.f5017a.m1426h() || r40Var2.f5017a.m1429k()) {
                    u40Var5.f4628d = u40Var5.f4630f.f603r.mo637c(view) + u40Var5.f4628d;
                }
            } else {
                u40 u40Var6 = r40Var.f4059e;
                u40Var6.getClass();
                r40 r40Var3 = (r40) view.getLayoutParams();
                r40Var3.f4059e = u40Var6;
                ArrayList arrayList2 = u40Var6.f4625a;
                arrayList2.add(0, view);
                u40Var6.f4626b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    u40Var6.f4627c = Integer.MIN_VALUE;
                }
                if (r40Var3.f5017a.m1426h() || r40Var3.f5017a.m1429k()) {
                    u40Var6.f4628d = u40Var6.f4630f.f603r.mo637c(view) + u40Var6.f4628d;
                }
            }
            if (m417L0() && this.f605t == 1) {
                iMo637c2 = this.f604s.mo641g() - (((this.f601p - 1) - u40Var.f4629e) * this.f606u);
                iMo645k = iMo637c2 - this.f604s.mo637c(view);
            } else {
                iMo645k = this.f604s.mo645k() + (u40Var.f4629e * this.f606u);
                iMo637c2 = this.f604s.mo637c(view) + iMo645k;
            }
            if (this.f605t == 1) {
                AbstractC0799uz.m2504L(view, iMo645k, iMo637c, iMo637c2, iM2437h);
            } else {
                AbstractC0799uz.m2504L(view, iMo637c, iMo645k, iM2437h, iMo637c2);
            }
            m431X0(u40Var, c0307hq2.f2247e, i6);
            m424Q0(a00Var, c0307hq2);
            if (c0307hq2.f2250h && view.hasFocusable()) {
                this.f610y.set(u40Var.f4629e, false);
            }
            i5 = 1;
            z = true;
            i4 = 0;
        }
        if (!z) {
            m424Q0(a00Var, c0307hq2);
        }
        int iMo645k3 = c0307hq2.f2247e == -1 ? this.f603r.mo645k() - m414I0(this.f603r.mo645k()) : m413H0(this.f603r.mo641g()) - this.f603r.mo641g();
        if (iMo645k3 > 0) {
            return Math.min(c0307hq.f2244b, iMo645k3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: B0 */
    public final View m407B0(boolean z) {
        int iMo645k = this.f603r.mo645k();
        int iMo641g = this.f603r.mo641g();
        View view = null;
        for (int iM2528v = m2528v() - 1; iM2528v >= 0; iM2528v--) {
            View viewM2526u = m2526u(iM2528v);
            int iMo639e = this.f603r.mo639e(viewM2526u);
            int iMo636b = this.f603r.mo636b(viewM2526u);
            if (iMo636b > iMo645k && iMo639e < iMo641g) {
                if (iMo636b <= iMo641g || !z) {
                    return viewM2526u;
                }
                if (view == null) {
                    view = viewM2526u;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: C0 */
    public final View m408C0(boolean z) {
        int iMo645k = this.f603r.mo645k();
        int iMo641g = this.f603r.mo641g();
        int iM2528v = m2528v();
        View view = null;
        for (int i = 0; i < iM2528v; i++) {
            View viewM2526u = m2526u(i);
            int iMo639e = this.f603r.mo639e(viewM2526u);
            if (this.f603r.mo636b(viewM2526u) > iMo645k && iMo639e < iMo641g) {
                if (iMo639e >= iMo645k || !z) {
                    return viewM2526u;
                }
                if (view == null) {
                    view = viewM2526u;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m409D0(a00 a00Var, f00 f00Var, boolean z) {
        int iMo641g;
        int iM413H0 = m413H0(Integer.MIN_VALUE);
        if (iM413H0 != Integer.MIN_VALUE && (iMo641g = this.f603r.mo641g() - iM413H0) > 0) {
            int i = iMo641g - (-m428U0(-iMo641g, a00Var, f00Var));
            if (!z || i <= 0) {
                return;
            }
            this.f603r.mo649o(i);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m410E0(a00 a00Var, f00 f00Var, boolean z) {
        int iMo645k;
        int iM414I0 = m414I0(Integer.MAX_VALUE);
        if (iM414I0 != Integer.MAX_VALUE && (iMo645k = iM414I0 - this.f603r.mo645k()) > 0) {
            int iM428U0 = iMo645k - m428U0(iMo645k, a00Var, f00Var);
            if (!z || iM428U0 <= 0) {
                return;
            }
            this.f603r.mo649o(-iM428U0);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final int m411F0() {
        if (m2528v() == 0) {
            return 0;
        }
        return AbstractC0799uz.m2501F(m2526u(0));
    }

    /* JADX INFO: renamed from: G0 */
    public final int m412G0() {
        int iM2528v = m2528v();
        if (iM2528v == 0) {
            return 0;
        }
        return AbstractC0799uz.m2501F(m2526u(iM2528v - 1));
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: H */
    public final int mo272H(a00 a00Var, f00 f00Var) {
        return this.f605t == 0 ? this.f601p : super.mo272H(a00Var, f00Var);
    }

    /* JADX INFO: renamed from: H0 */
    public final int m413H0(int i) {
        int iM2435f = this.f602q[0].m2435f(i);
        for (int i2 = 1; i2 < this.f601p; i2++) {
            int iM2435f2 = this.f602q[i2].m2435f(i);
            if (iM2435f2 > iM2435f) {
                iM2435f = iM2435f2;
            }
        }
        return iM2435f;
    }

    /* JADX INFO: renamed from: I0 */
    public final int m414I0(int i) {
        int iM2437h = this.f602q[0].m2437h(i);
        for (int i2 = 1; i2 < this.f601p; i2++) {
            int iM2437h2 = this.f602q[i2].m2437h(i);
            if (iM2437h2 < iM2437h) {
                iM2437h = iM2437h2;
            }
        }
        return iM2437h;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: J */
    public final boolean mo318J() {
        return this.f592C != 0;
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
    public final void m415J0(int r10, int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m415J0(int, int, int):void");
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
    public final android.view.View m416K0() {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m416K0():android.view.View");
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m417L0() {
        return m2507A() == 1;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: M */
    public final void mo418M(int i) {
        super.mo418M(i);
        for (int i2 = 0; i2 < this.f601p; i2++) {
            u40 u40Var = this.f602q[i2];
            int i3 = u40Var.f4626b;
            if (i3 != Integer.MIN_VALUE) {
                u40Var.f4626b = i3 + i;
            }
            int i4 = u40Var.f4627c;
            if (i4 != Integer.MIN_VALUE) {
                u40Var.f4627c = i4 + i;
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m419M0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f4856b;
        Rect rect = this.f596G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m365J(view));
        }
        r40 r40Var = (r40) view.getLayoutParams();
        int iM405Y0 = m405Y0(i, ((ViewGroup.MarginLayoutParams) r40Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) r40Var).rightMargin + rect.right);
        int iM405Y02 = m405Y0(i2, ((ViewGroup.MarginLayoutParams) r40Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) r40Var).bottomMargin + rect.bottom);
        if (m2525s0(view, iM405Y0, iM405Y02, r40Var)) {
            view.measure(iM405Y0, iM405Y02);
        }
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: N */
    public final void mo420N(int i) {
        super.mo420N(i);
        for (int i2 = 0; i2 < this.f601p; i2++) {
            u40 u40Var = this.f602q[i2];
            int i3 = u40Var.f4626b;
            if (i3 != Integer.MIN_VALUE) {
                u40Var.f4626b = i3 + i;
            }
            int i4 = u40Var.f4627c;
            if (i4 != Integer.MIN_VALUE) {
                u40Var.f4627c = i4 + i;
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
    public final void m421N0(p000.a00 r17, p000.f00 r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m421N0(a00, f00, boolean):void");
    }

    /* JADX INFO: renamed from: O0 */
    public final boolean m422O0(int i) {
        if (this.f605t == 0) {
            return (i == -1) != this.f609x;
        }
        return ((i == -1) == this.f609x) == m417L0();
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: P */
    public final void mo324P(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4856b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f600K);
        }
        for (int i = 0; i < this.f601p; i++) {
            this.f602q[i].m2431b();
        }
        recyclerView.requestLayout();
    }

    /* JADX INFO: renamed from: P0 */
    public final void m423P0(int i, f00 f00Var) {
        int iM411F0;
        int i2;
        if (i > 0) {
            iM411F0 = m412G0();
            i2 = 1;
        } else {
            iM411F0 = m411F0();
            i2 = -1;
        }
        C0307hq c0307hq = this.f607v;
        c0307hq.f2243a = true;
        m430W0(iM411F0, f00Var);
        m429V0(i2);
        c0307hq.f2245c = iM411F0 + c0307hq.f2246d;
        c0307hq.f2244b = Math.abs(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mo274Q(android.view.View r9, int r10, p000.a00 r11, p000.f00 r12) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo274Q(android.view.View, int, a00, f00):android.view.View");
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m424Q0(a00 a00Var, C0307hq c0307hq) {
        if (!c0307hq.f2243a || c0307hq.f2251i) {
            return;
        }
        if (c0307hq.f2244b == 0) {
            if (c0307hq.f2247e == -1) {
                m425R0(a00Var, c0307hq.f2249g);
                return;
            } else {
                m426S0(a00Var, c0307hq.f2248f);
                return;
            }
        }
        int i = 1;
        if (c0307hq.f2247e == -1) {
            int i2 = c0307hq.f2248f;
            int iM2437h = this.f602q[0].m2437h(i2);
            while (i < this.f601p) {
                int iM2437h2 = this.f602q[i].m2437h(i2);
                if (iM2437h2 > iM2437h) {
                    iM2437h = iM2437h2;
                }
                i++;
            }
            int i3 = i2 - iM2437h;
            m425R0(a00Var, i3 < 0 ? c0307hq.f2249g : c0307hq.f2249g - Math.min(i3, c0307hq.f2244b));
            return;
        }
        int i4 = c0307hq.f2249g;
        int iM2435f = this.f602q[0].m2435f(i4);
        while (i < this.f601p) {
            int iM2435f2 = this.f602q[i].m2435f(i4);
            if (iM2435f2 < iM2435f) {
                iM2435f = iM2435f2;
            }
            i++;
        }
        int i5 = iM2435f - c0307hq.f2249g;
        m426S0(a00Var, i5 < 0 ? c0307hq.f2248f : Math.min(i5, c0307hq.f2244b) + c0307hq.f2248f);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: R */
    public final void mo327R(AccessibilityEvent accessibilityEvent) {
        super.mo327R(accessibilityEvent);
        if (m2528v() > 0) {
            View viewM408C0 = m408C0(false);
            View viewM407B0 = m407B0(false);
            if (viewM408C0 == null || viewM407B0 == null) {
                return;
            }
            int iM2501F = AbstractC0799uz.m2501F(viewM408C0);
            int iM2501F2 = AbstractC0799uz.m2501F(viewM407B0);
            if (iM2501F < iM2501F2) {
                accessibilityEvent.setFromIndex(iM2501F);
                accessibilityEvent.setToIndex(iM2501F2);
            } else {
                accessibilityEvent.setFromIndex(iM2501F2);
                accessibilityEvent.setToIndex(iM2501F);
            }
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final void m425R0(a00 a00Var, int i) {
        for (int iM2528v = m2528v() - 1; iM2528v >= 0; iM2528v--) {
            View viewM2526u = m2526u(iM2528v);
            if (this.f603r.mo639e(viewM2526u) < i || this.f603r.mo648n(viewM2526u) < i) {
                return;
            }
            r40 r40Var = (r40) viewM2526u.getLayoutParams();
            r40Var.getClass();
            if (r40Var.f4059e.f4625a.size() == 1) {
                return;
            }
            u40 u40Var = r40Var.f4059e;
            ArrayList arrayList = u40Var.f4625a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            r40 r40Var2 = (r40) view.getLayoutParams();
            r40Var2.f4059e = null;
            if (r40Var2.f5017a.m1426h() || r40Var2.f5017a.m1429k()) {
                u40Var.f4628d -= u40Var.f4630f.f603r.mo637c(view);
            }
            if (size == 1) {
                u40Var.f4626b = Integer.MIN_VALUE;
            }
            u40Var.f4627c = Integer.MIN_VALUE;
            m2517g0(viewM2526u, a00Var);
        }
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: S */
    public final void mo276S(a00 a00Var, f00 f00Var, View view, C0357j0 c0357j0) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof r40)) {
            m2513T(view, c0357j0);
            return;
        }
        r40 r40Var = (r40) layoutParams;
        if (this.f605t == 0) {
            u40 u40Var = r40Var.f4059e;
            c0357j0.m1552f(C0318i0.m1418a(false, u40Var == null ? -1 : u40Var.f4629e, 1, -1, -1));
        } else {
            u40 u40Var2 = r40Var.f4059e;
            c0357j0.m1552f(C0318i0.m1418a(false, -1, -1, u40Var2 == null ? -1 : u40Var2.f4629e, 1));
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final void m426S0(a00 a00Var, int i) {
        while (m2528v() > 0) {
            View viewM2526u = m2526u(0);
            if (this.f603r.mo636b(viewM2526u) > i || this.f603r.mo647m(viewM2526u) > i) {
                return;
            }
            r40 r40Var = (r40) viewM2526u.getLayoutParams();
            r40Var.getClass();
            if (r40Var.f4059e.f4625a.size() == 1) {
                return;
            }
            u40 u40Var = r40Var.f4059e;
            ArrayList arrayList = u40Var.f4625a;
            View view = (View) arrayList.remove(0);
            r40 r40Var2 = (r40) view.getLayoutParams();
            r40Var2.f4059e = null;
            if (arrayList.size() == 0) {
                u40Var.f4627c = Integer.MIN_VALUE;
            }
            if (r40Var2.f5017a.m1426h() || r40Var2.f5017a.m1429k()) {
                u40Var.f4628d -= u40Var.f4630f.f603r.mo637c(view);
            }
            u40Var.f4626b = Integer.MIN_VALUE;
            m2517g0(viewM2526u, a00Var);
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m427T0() {
        if (this.f605t == 1 || !m417L0()) {
            this.f609x = this.f608w;
        } else {
            this.f609x = !this.f608w;
        }
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: U */
    public final void mo278U(int i, int i2) {
        m415J0(i, i2, 1);
    }

    /* JADX INFO: renamed from: U0 */
    public final int m428U0(int i, a00 a00Var, f00 f00Var) {
        if (m2528v() == 0 || i == 0) {
            return 0;
        }
        m423P0(i, f00Var);
        C0307hq c0307hq = this.f607v;
        int iM406A0 = m406A0(a00Var, c0307hq, f00Var);
        if (c0307hq.f2244b >= iM406A0) {
            i = i < 0 ? -iM406A0 : iM406A0;
        }
        this.f603r.mo649o(-i);
        this.f593D = this.f609x;
        c0307hq.f2244b = 0;
        m424Q0(a00Var, c0307hq);
        return i;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: V */
    public final void mo279V() {
        C0138d4 c0138d4 = this.f591B;
        int[] iArr = (int[]) c0138d4.f1297b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        c0138d4.f1298c = null;
        m2519j0();
    }

    /* JADX INFO: renamed from: V0 */
    public final void m429V0(int i) {
        C0307hq c0307hq = this.f607v;
        c0307hq.f2247e = i;
        c0307hq.f2246d = this.f609x != (i == -1) ? -1 : 1;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: W */
    public final void mo280W(int i, int i2) {
        m415J0(i, i2, 8);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m430W0(int i, f00 f00Var) {
        int iMo646l;
        int iMo646l2;
        int i2;
        C0307hq c0307hq = this.f607v;
        boolean z = false;
        c0307hq.f2244b = 0;
        c0307hq.f2245c = i;
        C0124cr c0124cr = this.f4859e;
        if (c0124cr == null || !c0124cr.f1240e || (i2 = f00Var.f1705a) == -1) {
            iMo646l = 0;
            iMo646l2 = 0;
        } else {
            if (this.f609x == (i2 < i)) {
                iMo646l = this.f603r.mo646l();
                iMo646l2 = 0;
            } else {
                iMo646l2 = this.f603r.mo646l();
                iMo646l = 0;
            }
        }
        RecyclerView recyclerView = this.f4856b;
        if (recyclerView == null || !recyclerView.f558g) {
            c0307hq.f2249g = this.f603r.mo640f() + iMo646l;
            c0307hq.f2248f = -iMo646l2;
        } else {
            c0307hq.f2248f = this.f603r.mo645k() - iMo646l2;
            c0307hq.f2249g = this.f603r.mo641g() + iMo646l;
        }
        c0307hq.f2250h = false;
        c0307hq.f2243a = true;
        if (this.f603r.mo643i() == 0 && this.f603r.mo640f() == 0) {
            z = true;
        }
        c0307hq.f2251i = z;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: X */
    public final void mo281X(int i, int i2) {
        m415J0(i, i2, 2);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m431X0(u40 u40Var, int i, int i2) {
        int i3 = u40Var.f4628d;
        int i4 = u40Var.f4629e;
        if (i != -1) {
            int i5 = u40Var.f4627c;
            if (i5 == Integer.MIN_VALUE) {
                u40Var.m2430a();
                i5 = u40Var.f4627c;
            }
            if (i5 - i3 >= i2) {
                this.f610y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = u40Var.f4626b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) u40Var.f4625a.get(0);
            r40 r40Var = (r40) view.getLayoutParams();
            u40Var.f4626b = u40Var.f4630f.f603r.mo639e(view);
            r40Var.getClass();
            i6 = u40Var.f4626b;
        }
        if (i6 + i3 <= i2) {
            this.f610y.set(i4, false);
        }
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: Y */
    public final void mo282Y(int i, int i2) {
        m415J0(i, i2, 4);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: Z */
    public final void mo284Z(a00 a00Var, f00 f00Var) {
        m421N0(a00Var, f00Var, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // p000.e00
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF mo334a(int r4) {
        /*
            r3 = this;
            int r0 = r3.m2528v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f609x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.m411F0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f609x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f605t
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo334a(int):android.graphics.PointF");
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: a0 */
    public final void mo285a0(f00 f00Var) {
        this.f611z = -1;
        this.f590A = Integer.MIN_VALUE;
        this.f595F = null;
        this.f597H.m2112a();
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: b0 */
    public final void mo336b0(Parcelable parcelable) {
        if (parcelable instanceof t40) {
            this.f595F = (t40) parcelable;
            m2519j0();
        }
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: c */
    public final void mo338c(String str) {
        if (this.f595F == null) {
            super.mo338c(str);
        }
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: c0 */
    public final Parcelable mo339c0() {
        int iM2437h;
        int iMo645k;
        int[] iArr;
        t40 t40Var = this.f595F;
        if (t40Var != null) {
            t40 t40Var2 = new t40();
            t40Var2.f4403c = t40Var.f4403c;
            t40Var2.f4401a = t40Var.f4401a;
            t40Var2.f4402b = t40Var.f4402b;
            t40Var2.f4404d = t40Var.f4404d;
            t40Var2.f4405e = t40Var.f4405e;
            t40Var2.f4406f = t40Var.f4406f;
            t40Var2.f4408h = t40Var.f4408h;
            t40Var2.f4409i = t40Var.f4409i;
            t40Var2.f4410j = t40Var.f4410j;
            t40Var2.f4407g = t40Var.f4407g;
            return t40Var2;
        }
        t40 t40Var3 = new t40();
        t40Var3.f4408h = this.f608w;
        t40Var3.f4409i = this.f593D;
        t40Var3.f4410j = this.f594E;
        C0138d4 c0138d4 = this.f591B;
        if (c0138d4 == null || (iArr = (int[]) c0138d4.f1297b) == null) {
            t40Var3.f4405e = 0;
        } else {
            t40Var3.f4406f = iArr;
            t40Var3.f4405e = iArr.length;
            t40Var3.f4407g = (ArrayList) c0138d4.f1298c;
        }
        if (m2528v() <= 0) {
            t40Var3.f4401a = -1;
            t40Var3.f4402b = -1;
            t40Var3.f4403c = 0;
            return t40Var3;
        }
        t40Var3.f4401a = this.f593D ? m412G0() : m411F0();
        View viewM407B0 = this.f609x ? m407B0(true) : m408C0(true);
        t40Var3.f4402b = viewM407B0 != null ? AbstractC0799uz.m2501F(viewM407B0) : -1;
        int i = this.f601p;
        t40Var3.f4403c = i;
        t40Var3.f4404d = new int[i];
        for (int i2 = 0; i2 < this.f601p; i2++) {
            if (this.f593D) {
                iM2437h = this.f602q[i2].m2435f(Integer.MIN_VALUE);
                if (iM2437h != Integer.MIN_VALUE) {
                    iMo645k = this.f603r.mo641g();
                    iM2437h -= iMo645k;
                }
            } else {
                iM2437h = this.f602q[i2].m2437h(Integer.MIN_VALUE);
                if (iM2437h != Integer.MIN_VALUE) {
                    iMo645k = this.f603r.mo645k();
                    iM2437h -= iMo645k;
                }
            }
            t40Var3.f4404d[i2] = iM2437h;
        }
        return t40Var3;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: d */
    public final boolean mo340d() {
        return this.f605t == 0;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: d0 */
    public final void mo432d0(int i) {
        if (i == 0) {
            m433y0();
        }
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: e */
    public final boolean mo341e() {
        return this.f605t == 1;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: f */
    public final boolean mo289f(C0836vz c0836vz) {
        return c0836vz instanceof r40;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: h */
    public final void mo342h(int i, int i2, f00 f00Var, C0157dn c0157dn) {
        C0307hq c0307hq;
        int iM2435f;
        int iM2437h;
        if (this.f605t != 0) {
            i = i2;
        }
        if (m2528v() == 0 || i == 0) {
            return;
        }
        m423P0(i, f00Var);
        int[] iArr = this.f599J;
        if (iArr == null || iArr.length < this.f601p) {
            this.f599J = new int[this.f601p];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f601p;
            c0307hq = this.f607v;
            if (i3 >= i5) {
                break;
            }
            if (c0307hq.f2246d == -1) {
                iM2435f = c0307hq.f2248f;
                iM2437h = this.f602q[i3].m2437h(iM2435f);
            } else {
                iM2435f = this.f602q[i3].m2435f(c0307hq.f2249g);
                iM2437h = c0307hq.f2249g;
            }
            int i6 = iM2435f - iM2437h;
            if (i6 >= 0) {
                this.f599J[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f599J, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c0307hq.f2245c;
            if (i8 < 0 || i8 >= f00Var.m1068b()) {
                return;
            }
            c0157dn.m929a(c0307hq.f2245c, this.f599J[i7]);
            c0307hq.f2245c += c0307hq.f2246d;
        }
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: j */
    public final int mo344j(f00 f00Var) {
        if (m2528v() == 0) {
            return 0;
        }
        boolean z = !this.f598I;
        return AbstractC0498mu.m1889h(f00Var, this.f603r, m408C0(z), m407B0(z), this, this.f598I);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: k */
    public final int mo295k(f00 f00Var) {
        return m434z0(f00Var);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: k0 */
    public final int mo296k0(int i, a00 a00Var, f00 f00Var) {
        return m428U0(i, a00Var, f00Var);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: l */
    public final int mo298l(f00 f00Var) {
        if (m2528v() == 0) {
            return 0;
        }
        boolean z = !this.f598I;
        return AbstractC0498mu.m1891j(f00Var, this.f603r, m408C0(z), m407B0(z), this, this.f598I);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: l0 */
    public final void mo345l0(int i) {
        t40 t40Var = this.f595F;
        if (t40Var != null && t40Var.f4401a != i) {
            t40Var.f4404d = null;
            t40Var.f4403c = 0;
            t40Var.f4401a = -1;
            t40Var.f4402b = -1;
        }
        this.f611z = i;
        this.f590A = Integer.MIN_VALUE;
        m2519j0();
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: m */
    public final int mo346m(f00 f00Var) {
        if (m2528v() == 0) {
            return 0;
        }
        boolean z = !this.f598I;
        return AbstractC0498mu.m1889h(f00Var, this.f603r, m408C0(z), m407B0(z), this, this.f598I);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: m0 */
    public final int mo299m0(int i, a00 a00Var, f00 f00Var) {
        return m428U0(i, a00Var, f00Var);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: n */
    public final int mo300n(f00 f00Var) {
        return m434z0(f00Var);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: o */
    public final int mo301o(f00 f00Var) {
        if (m2528v() == 0) {
            return 0;
        }
        boolean z = !this.f598I;
        return AbstractC0498mu.m1891j(f00Var, this.f603r, m408C0(z), m407B0(z), this, this.f598I);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: p0 */
    public final void mo302p0(Rect rect, int i, int i2) {
        int iM2505g;
        int iM2505g2;
        int iM2510D = m2510D() + m2509C();
        int iM2508B = m2508B() + m2511E();
        int i3 = this.f605t;
        int i4 = this.f601p;
        if (i3 == 1) {
            int iHeight = rect.height() + iM2508B;
            RecyclerView recyclerView = this.f4856b;
            WeakHashMap weakHashMap = oa0.f3426a;
            iM2505g2 = AbstractC0799uz.m2505g(i2, iHeight, x90.m2656d(recyclerView));
            iM2505g = AbstractC0799uz.m2505g(i, (this.f606u * i4) + iM2510D, x90.m2657e(this.f4856b));
        } else {
            int iWidth = rect.width() + iM2510D;
            RecyclerView recyclerView2 = this.f4856b;
            WeakHashMap weakHashMap2 = oa0.f3426a;
            iM2505g = AbstractC0799uz.m2505g(i, iWidth, x90.m2657e(recyclerView2));
            iM2505g2 = AbstractC0799uz.m2505g(i2, (this.f606u * i4) + iM2508B, x90.m2656d(this.f4856b));
        }
        this.f4856b.setMeasuredDimension(iM2505g, iM2505g2);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: r */
    public final C0836vz mo303r() {
        return this.f605t == 0 ? new r40(-2, -1) : new r40(-1, -2);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: s */
    public final C0836vz mo304s(Context context, AttributeSet attributeSet) {
        return new r40(context, attributeSet);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: t */
    public final C0836vz mo305t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new r40((ViewGroup.MarginLayoutParams) layoutParams) : new r40(layoutParams);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: v0 */
    public final void mo349v0(RecyclerView recyclerView, int i) {
        C0124cr c0124cr = new C0124cr(recyclerView.getContext());
        c0124cr.f1236a = i;
        m2529w0(c0124cr);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: x */
    public final int mo306x(a00 a00Var, f00 f00Var) {
        return this.f605t == 1 ? this.f601p : super.mo306x(a00Var, f00Var);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: x0 */
    public final boolean mo307x0() {
        return this.f595F == null;
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m433y0() {
        int iM411F0;
        if (m2528v() != 0 && this.f592C != 0 && this.f4861g) {
            if (this.f609x) {
                iM411F0 = m412G0();
                m411F0();
            } else {
                iM411F0 = m411F0();
                m412G0();
            }
            if (iM411F0 == 0 && m416K0() != null) {
                C0138d4 c0138d4 = this.f591B;
                int[] iArr = (int[]) c0138d4.f1297b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                c0138d4.f1298c = null;
                this.f4860f = true;
                m2519j0();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z0 */
    public final int m434z0(f00 f00Var) {
        if (m2528v() == 0) {
            return 0;
        }
        boolean z = !this.f598I;
        return AbstractC0498mu.m1890i(f00Var, this.f603r, m408C0(z), m407B0(z), this, this.f598I, this.f609x);
    }
}
