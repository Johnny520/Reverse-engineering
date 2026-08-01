package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import java.util.WeakHashMap;
import p000.AbstractC0799uz;
import p000.C0041ar;
import p000.C0138d4;
import p000.C0157dn;
import p000.C0318i0;
import p000.C0341io;
import p000.C0357j0;
import p000.C0836vz;
import p000.C0939yq;
import p000.C0976zq;
import p000.a00;
import p000.f00;
import p000.oa0;
import p000.x90;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: E */
    public boolean f497E;

    /* JADX INFO: renamed from: F */
    public int f498F;

    /* JADX INFO: renamed from: G */
    public int[] f499G;

    /* JADX INFO: renamed from: H */
    public View[] f500H;

    /* JADX INFO: renamed from: I */
    public final SparseIntArray f501I;

    /* JADX INFO: renamed from: J */
    public final SparseIntArray f502J;

    /* JADX INFO: renamed from: K */
    public final C0138d4 f503K;

    /* JADX INFO: renamed from: L */
    public final Rect f504L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f497E = false;
        this.f498F = -1;
        this.f501I = new SparseIntArray();
        this.f502J = new SparseIntArray();
        this.f503K = new C0138d4(13);
        this.f504L = new Rect();
        m294j1(AbstractC0799uz.m2502G(context, attributeSet, i, i2).f4596b);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: H */
    public final int mo272H(a00 a00Var, f00 f00Var) {
        if (this.f509p == 0) {
            return this.f498F;
        }
        if (f00Var.m1068b() < 1) {
            return 0;
        }
        return m290f1(f00Var.m1068b() - 1, a00Var, f00Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: L0 */
    public final View mo273L0(a00 a00Var, f00 f00Var, int i, int i2, int i3) {
        m313E0();
        int iMo645k = this.f511r.mo645k();
        int iMo641g = this.f511r.mo641g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewM2526u = m2526u(i);
            int iM2501F = AbstractC0799uz.m2501F(viewM2526u);
            if (iM2501F >= 0 && iM2501F < i3 && m291g1(iM2501F, a00Var, f00Var) == 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0142, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0144, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0799uz
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mo274Q(android.view.View r23, int r24, p000.a00 r25, p000.f00 r26) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo274Q(android.view.View, int, a00, f00):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v35 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: R0 */
    public final void mo275R0(a00 a00Var, f00 f00Var, C0041ar c0041ar, C0976zq c0976zq) {
        int i;
        int i2;
        int i3;
        int iMo638d;
        int iMo638d2;
        int iM2509C;
        int i4;
        int iM2506w;
        int iM2506w2;
        ?? r12;
        int i5;
        View viewM469b;
        int iMo644j = this.f511r.mo644j();
        boolean z = iMo644j != 1073741824;
        int i6 = m2528v() > 0 ? this.f499G[this.f498F] : 0;
        if (z) {
            m297k1();
        }
        boolean z2 = c0041ar.f622e == 1;
        int iM291g1 = this.f498F;
        if (!z2) {
            iM291g1 = m291g1(c0041ar.f621d, a00Var, f00Var) + m292h1(c0041ar.f621d, a00Var, f00Var);
        }
        int i7 = 0;
        while (i7 < this.f498F && (i5 = c0041ar.f621d) >= 0 && i5 < f00Var.m1068b() && iM291g1 > 0) {
            int i8 = c0041ar.f621d;
            int iM292h1 = m292h1(i8, a00Var, f00Var);
            if (iM292h1 > this.f498F) {
                throw new IllegalArgumentException("Item at position " + i8 + " requires " + iM292h1 + " spans but GridLayoutManager has only " + this.f498F + " spans.");
            }
            iM291g1 -= iM292h1;
            if (iM291g1 < 0 || (viewM469b = c0041ar.m469b(a00Var)) == null) {
                break;
            }
            this.f500H[i7] = viewM469b;
            i7++;
        }
        if (i7 == 0) {
            c0976zq.f5610b = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i7;
            i = 0;
        } else {
            i = i7 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i9 = 0;
        while (i != i2) {
            View view = this.f500H[i];
            C0341io c0341io = (C0341io) view.getLayoutParams();
            int iM292h12 = m292h1(AbstractC0799uz.m2501F(view), a00Var, f00Var);
            c0341io.f2560f = iM292h12;
            c0341io.f2559e = i9;
            i9 += iM292h12;
            i += i3;
        }
        float f = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            View view2 = this.f500H[i11];
            if (c0041ar.f628k != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    m2514b(view2, -1, true);
                } else {
                    m2514b(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                m2514b(view2, -1, false);
            } else {
                r12 = 0;
                m2514b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f4856b;
            Rect rect = this.f504L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.m365J(view2));
            }
            m293i1(view2, iMo644j, r12);
            int iMo637c = this.f511r.mo637c(view2);
            if (iMo637c > i10) {
                i10 = iMo637c;
            }
            float fMo638d = (this.f511r.mo638d(view2) * 1.0f) / ((C0341io) view2.getLayoutParams()).f2560f;
            if (fMo638d > f) {
                f = fMo638d;
            }
        }
        if (z) {
            m286c1(Math.max(Math.round(f * this.f498F), i6));
            i10 = 0;
            for (int i12 = 0; i12 < i7; i12++) {
                View view3 = this.f500H[i12];
                m293i1(view3, 1073741824, true);
                int iMo637c2 = this.f511r.mo637c(view3);
                if (iMo637c2 > i10) {
                    i10 = iMo637c2;
                }
            }
        }
        for (int i13 = 0; i13 < i7; i13++) {
            View view4 = this.f500H[i13];
            if (this.f511r.mo637c(view4) != i10) {
                C0341io c0341io2 = (C0341io) view4.getLayoutParams();
                Rect rect2 = c0341io2.f5018b;
                int i14 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0341io2).topMargin + ((ViewGroup.MarginLayoutParams) c0341io2).bottomMargin;
                int i15 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0341io2).leftMargin + ((ViewGroup.MarginLayoutParams) c0341io2).rightMargin;
                int iM288e1 = m288e1(c0341io2.f2559e, c0341io2.f2560f);
                if (this.f509p == 1) {
                    iM2506w2 = AbstractC0799uz.m2506w(false, iM288e1, 1073741824, i15, ((ViewGroup.MarginLayoutParams) c0341io2).width);
                    iM2506w = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    iM2506w = AbstractC0799uz.m2506w(false, iM288e1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c0341io2).height);
                    iM2506w2 = iMakeMeasureSpec;
                }
                if (m2527u0(view4, iM2506w2, iM2506w, (C0836vz) view4.getLayoutParams())) {
                    view4.measure(iM2506w2, iM2506w);
                }
            }
        }
        c0976zq.f5609a = i10;
        if (this.f509p == 1) {
            if (c0041ar.f623f == -1) {
                int i16 = c0041ar.f619b;
                i4 = i16 - i10;
                iMo638d2 = i16;
            } else {
                i4 = c0041ar.f619b;
                iMo638d2 = i4 + i10;
            }
            iM2509C = 0;
            iMo638d = 0;
        } else {
            if (c0041ar.f623f == -1) {
                int i17 = c0041ar.f619b;
                iM2509C = i17 - i10;
                iMo638d2 = 0;
                iMo638d = i17;
            } else {
                int i18 = c0041ar.f619b;
                iMo638d = i18 + i10;
                iMo638d2 = 0;
                iM2509C = i18;
            }
            i4 = iMo638d2;
        }
        for (int i19 = 0; i19 < i7; i19++) {
            View view5 = this.f500H[i19];
            C0341io c0341io3 = (C0341io) view5.getLayoutParams();
            if (this.f509p != 1) {
                int iM2511E = m2511E() + this.f499G[c0341io3.f2559e];
                i4 = iM2511E;
                iMo638d2 = this.f511r.mo638d(view5) + iM2511E;
            } else if (m326Q0()) {
                int iM2509C2 = m2509C() + this.f499G[this.f498F - c0341io3.f2559e];
                iMo638d = iM2509C2;
                iM2509C = iM2509C2 - this.f511r.mo638d(view5);
            } else {
                iM2509C = m2509C() + this.f499G[c0341io3.f2559e];
                iMo638d = this.f511r.mo638d(view5) + iM2509C;
            }
            AbstractC0799uz.m2504L(view5, iM2509C, i4, iMo638d, iMo638d2);
            if (c0341io3.f5017a.m1426h() || c0341io3.f5017a.m1429k()) {
                c0976zq.f5611c = true;
            }
            c0976zq.f5612d = view5.hasFocusable() | c0976zq.f5612d;
        }
        Arrays.fill(this.f500H, (Object) null);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: S */
    public final void mo276S(a00 a00Var, f00 f00Var, View view, C0357j0 c0357j0) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0341io)) {
            m2513T(view, c0357j0);
            return;
        }
        C0341io c0341io = (C0341io) layoutParams;
        int iM290f1 = m290f1(c0341io.f5017a.m1420b(), a00Var, f00Var);
        if (this.f509p == 0) {
            c0357j0.m1552f(C0318i0.m1418a(false, c0341io.f2559e, c0341io.f2560f, iM290f1, 1));
        } else {
            c0357j0.m1552f(C0318i0.m1418a(false, iM290f1, 1, c0341io.f2559e, c0341io.f2560f));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: S0 */
    public final void mo277S0(a00 a00Var, f00 f00Var, C0939yq c0939yq, int i) {
        m297k1();
        if (f00Var.m1068b() > 0 && !f00Var.f1711g) {
            boolean z = i == 1;
            int iM291g1 = m291g1(c0939yq.f5482b, a00Var, f00Var);
            if (z) {
                while (iM291g1 > 0) {
                    int i2 = c0939yq.f5482b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c0939yq.f5482b = i3;
                    iM291g1 = m291g1(i3, a00Var, f00Var);
                }
            } else {
                int iM1068b = f00Var.m1068b() - 1;
                int i4 = c0939yq.f5482b;
                while (i4 < iM1068b) {
                    int i5 = i4 + 1;
                    int iM291g12 = m291g1(i5, a00Var, f00Var);
                    if (iM291g12 <= iM291g1) {
                        break;
                    }
                    i4 = i5;
                    iM291g1 = iM291g12;
                }
                c0939yq.f5482b = i4;
            }
        }
        m287d1();
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: U */
    public final void mo278U(int i, int i2) {
        C0138d4 c0138d4 = this.f503K;
        c0138d4.m862x();
        ((SparseIntArray) c0138d4.f1298c).clear();
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: V */
    public final void mo279V() {
        C0138d4 c0138d4 = this.f503K;
        c0138d4.m862x();
        ((SparseIntArray) c0138d4.f1298c).clear();
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: W */
    public final void mo280W(int i, int i2) {
        C0138d4 c0138d4 = this.f503K;
        c0138d4.m862x();
        ((SparseIntArray) c0138d4.f1298c).clear();
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: X */
    public final void mo281X(int i, int i2) {
        C0138d4 c0138d4 = this.f503K;
        c0138d4.m862x();
        ((SparseIntArray) c0138d4.f1298c).clear();
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: Y */
    public final void mo282Y(int i, int i2) {
        C0138d4 c0138d4 = this.f503K;
        c0138d4.m862x();
        ((SparseIntArray) c0138d4.f1298c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: Y0 */
    public final void mo283Y0(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo283Y0(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0799uz
    /* JADX INFO: renamed from: Z */
    public final void mo284Z(a00 a00Var, f00 f00Var) {
        boolean z = f00Var.f1711g;
        SparseIntArray sparseIntArray = this.f502J;
        SparseIntArray sparseIntArray2 = this.f501I;
        if (z) {
            int iM2528v = m2528v();
            for (int i = 0; i < iM2528v; i++) {
                C0341io c0341io = (C0341io) m2526u(i).getLayoutParams();
                int iM1420b = c0341io.f5017a.m1420b();
                sparseIntArray2.put(iM1420b, c0341io.f2560f);
                sparseIntArray.put(iM1420b, c0341io.f2559e);
            }
        }
        super.mo284Z(a00Var, f00Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0799uz
    /* JADX INFO: renamed from: a0 */
    public final void mo285a0(f00 f00Var) {
        super.mo285a0(f00Var);
        this.f497E = false;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m286c1(int i) {
        int i2;
        int[] iArr = this.f499G;
        int i3 = this.f498F;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f499G = iArr;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m287d1() {
        View[] viewArr = this.f500H;
        if (viewArr == null || viewArr.length != this.f498F) {
            this.f500H = new View[this.f498F];
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final int m288e1(int i, int i2) {
        if (this.f509p != 1 || !m326Q0()) {
            int[] iArr = this.f499G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f499G;
        int i3 = this.f498F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: f */
    public final boolean mo289f(C0836vz c0836vz) {
        return c0836vz instanceof C0341io;
    }

    /* JADX INFO: renamed from: f1 */
    public final int m290f1(int i, a00 a00Var, f00 f00Var) {
        boolean z = f00Var.f1711g;
        C0138d4 c0138d4 = this.f503K;
        if (!z) {
            int i2 = this.f498F;
            c0138d4.getClass();
            return C0138d4.m828v(i, i2);
        }
        int iM4b = a00Var.m4b(i);
        if (iM4b != -1) {
            int i3 = this.f498F;
            c0138d4.getClass();
            return C0138d4.m828v(iM4b, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* JADX INFO: renamed from: g1 */
    public final int m291g1(int i, a00 a00Var, f00 f00Var) {
        boolean z = f00Var.f1711g;
        C0138d4 c0138d4 = this.f503K;
        if (!z) {
            int i2 = this.f498F;
            c0138d4.getClass();
            return i % i2;
        }
        int i3 = this.f502J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iM4b = a00Var.m4b(i);
        if (iM4b != -1) {
            int i4 = this.f498F;
            c0138d4.getClass();
            return iM4b % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* JADX INFO: renamed from: h1 */
    public final int m292h1(int i, a00 a00Var, f00 f00Var) {
        boolean z = f00Var.f1711g;
        C0138d4 c0138d4 = this.f503K;
        if (!z) {
            c0138d4.getClass();
            return 1;
        }
        int i2 = this.f501I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (a00Var.m4b(i) != -1) {
            c0138d4.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m293i1(View view, int i, boolean z) {
        int iM2506w;
        int iM2506w2;
        C0341io c0341io = (C0341io) view.getLayoutParams();
        Rect rect = c0341io.f5018b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0341io).topMargin + ((ViewGroup.MarginLayoutParams) c0341io).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0341io).leftMargin + ((ViewGroup.MarginLayoutParams) c0341io).rightMargin;
        int iM288e1 = m288e1(c0341io.f2559e, c0341io.f2560f);
        if (this.f509p == 1) {
            iM2506w2 = AbstractC0799uz.m2506w(false, iM288e1, i, i3, ((ViewGroup.MarginLayoutParams) c0341io).width);
            iM2506w = AbstractC0799uz.m2506w(true, this.f511r.mo646l(), this.f4867m, i2, ((ViewGroup.MarginLayoutParams) c0341io).height);
        } else {
            int iM2506w3 = AbstractC0799uz.m2506w(false, iM288e1, i, i2, ((ViewGroup.MarginLayoutParams) c0341io).height);
            int iM2506w4 = AbstractC0799uz.m2506w(true, this.f511r.mo646l(), this.f4866l, i3, ((ViewGroup.MarginLayoutParams) c0341io).width);
            iM2506w = iM2506w3;
            iM2506w2 = iM2506w4;
        }
        C0836vz c0836vz = (C0836vz) view.getLayoutParams();
        if (z ? m2527u0(view, iM2506w2, iM2506w, c0836vz) : m2525s0(view, iM2506w2, iM2506w, c0836vz)) {
            view.measure(iM2506w2, iM2506w);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final void m294j1(int i) {
        if (i == this.f498F) {
            return;
        }
        this.f497E = true;
        if (i < 1) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
        this.f498F = i;
        this.f503K.m862x();
        m2519j0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0799uz
    /* JADX INFO: renamed from: k */
    public final int mo295k(f00 f00Var) {
        return m310B0(f00Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0799uz
    /* JADX INFO: renamed from: k0 */
    public final int mo296k0(int i, a00 a00Var, f00 f00Var) {
        m297k1();
        m287d1();
        return super.mo296k0(i, a00Var, f00Var);
    }

    /* JADX INFO: renamed from: k1 */
    public final void m297k1() {
        int iM2508B;
        int iM2511E;
        if (this.f509p == 1) {
            iM2508B = this.f4868n - m2510D();
            iM2511E = m2509C();
        } else {
            iM2508B = this.f4869o - m2508B();
            iM2511E = m2511E();
        }
        m286c1(iM2508B - iM2511E);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0799uz
    /* JADX INFO: renamed from: l */
    public final int mo298l(f00 f00Var) {
        return m311C0(f00Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0799uz
    /* JADX INFO: renamed from: m0 */
    public final int mo299m0(int i, a00 a00Var, f00 f00Var) {
        m297k1();
        m287d1();
        return super.mo299m0(i, a00Var, f00Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0799uz
    /* JADX INFO: renamed from: n */
    public final int mo300n(f00 f00Var) {
        return m310B0(f00Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0799uz
    /* JADX INFO: renamed from: o */
    public final int mo301o(f00 f00Var) {
        return m311C0(f00Var);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: p0 */
    public final void mo302p0(Rect rect, int i, int i2) {
        int iM2505g;
        int iM2505g2;
        if (this.f499G == null) {
            super.mo302p0(rect, i, i2);
        }
        int iM2510D = m2510D() + m2509C();
        int iM2508B = m2508B() + m2511E();
        if (this.f509p == 1) {
            int iHeight = rect.height() + iM2508B;
            RecyclerView recyclerView = this.f4856b;
            WeakHashMap weakHashMap = oa0.f3426a;
            iM2505g2 = AbstractC0799uz.m2505g(i2, iHeight, x90.m2656d(recyclerView));
            int[] iArr = this.f499G;
            iM2505g = AbstractC0799uz.m2505g(i, iArr[iArr.length - 1] + iM2510D, x90.m2657e(this.f4856b));
        } else {
            int iWidth = rect.width() + iM2510D;
            RecyclerView recyclerView2 = this.f4856b;
            WeakHashMap weakHashMap2 = oa0.f3426a;
            iM2505g = AbstractC0799uz.m2505g(i, iWidth, x90.m2657e(recyclerView2));
            int[] iArr2 = this.f499G;
            iM2505g2 = AbstractC0799uz.m2505g(i2, iArr2[iArr2.length - 1] + iM2508B, x90.m2656d(this.f4856b));
        }
        this.f4856b.setMeasuredDimension(iM2505g, iM2505g2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0799uz
    /* JADX INFO: renamed from: r */
    public final C0836vz mo303r() {
        return this.f509p == 0 ? new C0341io(-2, -1) : new C0341io(-1, -2);
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: s */
    public final C0836vz mo304s(Context context, AttributeSet attributeSet) {
        C0341io c0341io = new C0341io(context, attributeSet);
        c0341io.f2559e = -1;
        c0341io.f2560f = 0;
        return c0341io;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: t */
    public final C0836vz mo305t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0341io c0341io = new C0341io((ViewGroup.MarginLayoutParams) layoutParams);
            c0341io.f2559e = -1;
            c0341io.f2560f = 0;
            return c0341io;
        }
        C0341io c0341io2 = new C0341io(layoutParams);
        c0341io2.f2559e = -1;
        c0341io2.f2560f = 0;
        return c0341io2;
    }

    @Override // p000.AbstractC0799uz
    /* JADX INFO: renamed from: x */
    public final int mo306x(a00 a00Var, f00 f00Var) {
        if (this.f509p == 1) {
            return this.f498F;
        }
        if (f00Var.m1068b() < 1) {
            return 0;
        }
        return m290f1(f00Var.m1068b() - 1, a00Var, f00Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0799uz
    /* JADX INFO: renamed from: x0 */
    public final boolean mo307x0() {
        return this.f519z == null && !this.f497E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: z0 */
    public final void mo308z0(f00 f00Var, C0041ar c0041ar, C0157dn c0157dn) {
        int i;
        int i2 = this.f498F;
        for (int i3 = 0; i3 < this.f498F && (i = c0041ar.f621d) >= 0 && i < f00Var.m1068b() && i2 > 0; i3++) {
            c0157dn.m929a(c0041ar.f621d, Math.max(0, c0041ar.f624g));
            this.f503K.getClass();
            i2--;
            c0041ar.f621d += c0041ar.f622e;
        }
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f497E = false;
        this.f498F = -1;
        this.f501I = new SparseIntArray();
        this.f502J = new SparseIntArray();
        this.f503K = new C0138d4(13);
        this.f504L = new Rect();
        m294j1(i);
    }
}
