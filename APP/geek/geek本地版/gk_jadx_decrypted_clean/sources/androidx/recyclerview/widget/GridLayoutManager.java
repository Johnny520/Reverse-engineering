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
import p000.AbstractC0540nz;
import p000.C0074bn;
import p000.C0138d4;
import p000.C0194eo;
import p000.C0318i0;
import p000.C0357j0;
import p000.C0577oz;
import p000.C0763tz;
import p000.C0791uq;
import p000.C0828vq;
import p000.C0865wq;
import p000.C0948yz;
import p000.ja0;
import p000.s90;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: E */
    public boolean f534E;

    /* JADX INFO: renamed from: F */
    public int f535F;

    /* JADX INFO: renamed from: G */
    public int[] f536G;

    /* JADX INFO: renamed from: H */
    public View[] f537H;

    /* JADX INFO: renamed from: I */
    public final SparseIntArray f538I;

    /* JADX INFO: renamed from: J */
    public final SparseIntArray f539J;

    /* JADX INFO: renamed from: K */
    public final C0138d4 f540K;

    /* JADX INFO: renamed from: L */
    public final Rect f541L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f534E = false;
        this.f535F = -1;
        this.f538I = new SparseIntArray();
        this.f539J = new SparseIntArray();
        this.f540K = new C0138d4(13);
        this.f541L = new Rect();
        m309j1(AbstractC0540nz.m1954G(context, attributeSet, i, i2).f3298b);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: H */
    public final int mo287H(C0763tz c0763tz, C0948yz c0948yz) {
        if (this.f546p == 0) {
            return this.f535F;
        }
        if (c0948yz.m2745b() < 1) {
            return 0;
        }
        return m305f1(c0948yz.m2745b() - 1, c0763tz, c0948yz) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: L0 */
    public final View mo288L0(C0763tz c0763tz, C0948yz c0948yz, int i, int i2, int i3) {
        m328E0();
        int iMo107k = this.f548r.mo107k();
        int iMo103g = this.f548r.mo103g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewM1978u = m1978u(i);
            int iM1953F = AbstractC0540nz.m1953F(viewM1978u);
            if (iM1953F >= 0 && iM1953F < i3 && m306g1(iM1953F, c0763tz, c0948yz) == 0) {
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
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0540nz
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mo289Q(android.view.View r23, int r24, p000.C0763tz r25, p000.C0948yz r26) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo289Q(android.view.View, int, tz, yz):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v35 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: R0 */
    public final void mo290R0(C0763tz c0763tz, C0948yz c0948yz, C0865wq c0865wq, C0828vq c0828vq) {
        int i;
        int i2;
        int i3;
        int iMo100d;
        int iMo100d2;
        int iM1961C;
        int i4;
        int iM1958w;
        int iM1958w2;
        ?? r12;
        int i5;
        View viewM2594b;
        int iMo106j = this.f548r.mo106j();
        boolean z = iMo106j != 1073741824;
        int i6 = m1980v() > 0 ? this.f536G[this.f535F] : 0;
        if (z) {
            m312k1();
        }
        boolean z2 = c0865wq.f5006e == 1;
        int iM306g1 = this.f535F;
        if (!z2) {
            iM306g1 = m306g1(c0865wq.f5005d, c0763tz, c0948yz) + m307h1(c0865wq.f5005d, c0763tz, c0948yz);
        }
        int i7 = 0;
        while (i7 < this.f535F && (i5 = c0865wq.f5005d) >= 0 && i5 < c0948yz.m2745b() && iM306g1 > 0) {
            int i8 = c0865wq.f5005d;
            int iM307h1 = m307h1(i8, c0763tz, c0948yz);
            if (iM307h1 > this.f535F) {
                throw new IllegalArgumentException("Item at position " + i8 + " requires " + iM307h1 + " spans but GridLayoutManager has only " + this.f535F + " spans.");
            }
            iM306g1 -= iM307h1;
            if (iM306g1 < 0 || (viewM2594b = c0865wq.m2594b(c0763tz)) == null) {
                break;
            }
            this.f537H[i7] = viewM2594b;
            i7++;
        }
        if (i7 == 0) {
            c0828vq.f4879b = true;
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
            View view = this.f537H[i];
            C0194eo c0194eo = (C0194eo) view.getLayoutParams();
            int iM307h12 = m307h1(AbstractC0540nz.m1953F(view), c0763tz, c0948yz);
            c0194eo.f1826f = iM307h12;
            c0194eo.f1825e = i9;
            i9 += iM307h12;
            i += i3;
        }
        float f = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < i7; i11++) {
            View view2 = this.f537H[i11];
            if (c0865wq.f5012k != null) {
                r12 = 0;
                r12 = 0;
                if (z2) {
                    m1966b(view2, -1, true);
                } else {
                    m1966b(view2, 0, true);
                }
            } else if (z2) {
                r12 = 0;
                m1966b(view2, -1, false);
            } else {
                r12 = 0;
                m1966b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f3456b;
            Rect rect = this.f541L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.m380J(view2));
            }
            m308i1(view2, iMo106j, r12);
            int iMo99c = this.f548r.mo99c(view2);
            if (iMo99c > i10) {
                i10 = iMo99c;
            }
            float fMo100d = (this.f548r.mo100d(view2) * 1.0f) / ((C0194eo) view2.getLayoutParams()).f1826f;
            if (fMo100d > f) {
                f = fMo100d;
            }
        }
        if (z) {
            m301c1(Math.max(Math.round(f * this.f535F), i6));
            i10 = 0;
            for (int i12 = 0; i12 < i7; i12++) {
                View view3 = this.f537H[i12];
                m308i1(view3, 1073741824, true);
                int iMo99c2 = this.f548r.mo99c(view3);
                if (iMo99c2 > i10) {
                    i10 = iMo99c2;
                }
            }
        }
        for (int i13 = 0; i13 < i7; i13++) {
            View view4 = this.f537H[i13];
            if (this.f548r.mo99c(view4) != i10) {
                C0194eo c0194eo2 = (C0194eo) view4.getLayoutParams();
                Rect rect2 = c0194eo2.f3622b;
                int i14 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0194eo2).topMargin + ((ViewGroup.MarginLayoutParams) c0194eo2).bottomMargin;
                int i15 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0194eo2).leftMargin + ((ViewGroup.MarginLayoutParams) c0194eo2).rightMargin;
                int iM303e1 = m303e1(c0194eo2.f1825e, c0194eo2.f1826f);
                if (this.f546p == 1) {
                    iM1958w2 = AbstractC0540nz.m1958w(false, iM303e1, 1073741824, i15, ((ViewGroup.MarginLayoutParams) c0194eo2).width);
                    iM1958w = View.MeasureSpec.makeMeasureSpec(i10 - i14, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i15, 1073741824);
                    iM1958w = AbstractC0540nz.m1958w(false, iM303e1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c0194eo2).height);
                    iM1958w2 = iMakeMeasureSpec;
                }
                if (m1979u0(view4, iM1958w2, iM1958w, (C0577oz) view4.getLayoutParams())) {
                    view4.measure(iM1958w2, iM1958w);
                }
            }
        }
        c0828vq.f4878a = i10;
        if (this.f546p == 1) {
            if (c0865wq.f5007f == -1) {
                int i16 = c0865wq.f5003b;
                i4 = i16 - i10;
                iMo100d2 = i16;
            } else {
                i4 = c0865wq.f5003b;
                iMo100d2 = i4 + i10;
            }
            iM1961C = 0;
            iMo100d = 0;
        } else {
            if (c0865wq.f5007f == -1) {
                int i17 = c0865wq.f5003b;
                iM1961C = i17 - i10;
                iMo100d2 = 0;
                iMo100d = i17;
            } else {
                int i18 = c0865wq.f5003b;
                iMo100d = i18 + i10;
                iMo100d2 = 0;
                iM1961C = i18;
            }
            i4 = iMo100d2;
        }
        for (int i19 = 0; i19 < i7; i19++) {
            View view5 = this.f537H[i19];
            C0194eo c0194eo3 = (C0194eo) view5.getLayoutParams();
            if (this.f546p != 1) {
                int iM1963E = m1963E() + this.f536G[c0194eo3.f1825e];
                i4 = iM1963E;
                iMo100d2 = this.f548r.mo100d(view5) + iM1963E;
            } else if (m341Q0()) {
                int iM1961C2 = m1961C() + this.f536G[this.f535F - c0194eo3.f1825e];
                iMo100d = iM1961C2;
                iM1961C = iM1961C2 - this.f548r.mo100d(view5);
            } else {
                iM1961C = m1961C() + this.f536G[c0194eo3.f1825e];
                iMo100d = this.f548r.mo100d(view5) + iM1961C;
            }
            AbstractC0540nz.m1956L(view5, iM1961C, i4, iMo100d, iMo100d2);
            if (c0194eo3.f3621a.m488h() || c0194eo3.f3621a.m491k()) {
                c0828vq.f4880c = true;
            }
            c0828vq.f4881d = view5.hasFocusable() | c0828vq.f4881d;
        }
        Arrays.fill(this.f537H, (Object) null);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: S */
    public final void mo291S(C0763tz c0763tz, C0948yz c0948yz, View view, C0357j0 c0357j0) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0194eo)) {
            m1965T(view, c0357j0);
            return;
        }
        C0194eo c0194eo = (C0194eo) layoutParams;
        int iM305f1 = m305f1(c0194eo.f3621a.m482b(), c0763tz, c0948yz);
        if (this.f546p == 0) {
            c0357j0.m1538f(C0318i0.m1382a(false, c0194eo.f1825e, c0194eo.f1826f, iM305f1, 1));
        } else {
            c0357j0.m1538f(C0318i0.m1382a(false, iM305f1, 1, c0194eo.f1825e, c0194eo.f1826f));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: S0 */
    public final void mo292S0(C0763tz c0763tz, C0948yz c0948yz, C0791uq c0791uq, int i) {
        m312k1();
        if (c0948yz.m2745b() > 0 && !c0948yz.f5421g) {
            boolean z = i == 1;
            int iM306g1 = m306g1(c0791uq.f4751b, c0763tz, c0948yz);
            if (z) {
                while (iM306g1 > 0) {
                    int i2 = c0791uq.f4751b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c0791uq.f4751b = i3;
                    iM306g1 = m306g1(i3, c0763tz, c0948yz);
                }
            } else {
                int iM2745b = c0948yz.m2745b() - 1;
                int i4 = c0791uq.f4751b;
                while (i4 < iM2745b) {
                    int i5 = i4 + 1;
                    int iM306g12 = m306g1(i5, c0763tz, c0948yz);
                    if (iM306g12 <= iM306g1) {
                        break;
                    }
                    i4 = i5;
                    iM306g1 = iM306g12;
                }
                c0791uq.f4751b = i4;
            }
        }
        m302d1();
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: U */
    public final void mo293U(int i, int i2) {
        C0138d4 c0138d4 = this.f540K;
        c0138d4.m902x();
        ((SparseIntArray) c0138d4.f1364c).clear();
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: V */
    public final void mo294V() {
        C0138d4 c0138d4 = this.f540K;
        c0138d4.m902x();
        ((SparseIntArray) c0138d4.f1364c).clear();
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: W */
    public final void mo295W(int i, int i2) {
        C0138d4 c0138d4 = this.f540K;
        c0138d4.m902x();
        ((SparseIntArray) c0138d4.f1364c).clear();
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: X */
    public final void mo296X(int i, int i2) {
        C0138d4 c0138d4 = this.f540K;
        c0138d4.m902x();
        ((SparseIntArray) c0138d4.f1364c).clear();
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: Y */
    public final void mo297Y(int i, int i2) {
        C0138d4 c0138d4 = this.f540K;
        c0138d4.m902x();
        ((SparseIntArray) c0138d4.f1364c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: Y0 */
    public final void mo298Y0(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo298Y0(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0540nz
    /* JADX INFO: renamed from: Z */
    public final void mo299Z(C0763tz c0763tz, C0948yz c0948yz) {
        boolean z = c0948yz.f5421g;
        SparseIntArray sparseIntArray = this.f539J;
        SparseIntArray sparseIntArray2 = this.f538I;
        if (z) {
            int iM1980v = m1980v();
            for (int i = 0; i < iM1980v; i++) {
                C0194eo c0194eo = (C0194eo) m1978u(i).getLayoutParams();
                int iM482b = c0194eo.f3621a.m482b();
                sparseIntArray2.put(iM482b, c0194eo.f1826f);
                sparseIntArray.put(iM482b, c0194eo.f1825e);
            }
        }
        super.mo299Z(c0763tz, c0948yz);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0540nz
    /* JADX INFO: renamed from: a0 */
    public final void mo300a0(C0948yz c0948yz) {
        super.mo300a0(c0948yz);
        this.f534E = false;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m301c1(int i) {
        int i2;
        int[] iArr = this.f536G;
        int i3 = this.f535F;
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
        this.f536G = iArr;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m302d1() {
        View[] viewArr = this.f537H;
        if (viewArr == null || viewArr.length != this.f535F) {
            this.f537H = new View[this.f535F];
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final int m303e1(int i, int i2) {
        if (this.f546p != 1 || !m341Q0()) {
            int[] iArr = this.f536G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f536G;
        int i3 = this.f535F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: f */
    public final boolean mo304f(C0577oz c0577oz) {
        return c0577oz instanceof C0194eo;
    }

    /* JADX INFO: renamed from: f1 */
    public final int m305f1(int i, C0763tz c0763tz, C0948yz c0948yz) {
        boolean z = c0948yz.f5421g;
        C0138d4 c0138d4 = this.f540K;
        if (!z) {
            int i2 = this.f535F;
            c0138d4.getClass();
            return C0138d4.m869v(i, i2);
        }
        int iM2394b = c0763tz.m2394b(i);
        if (iM2394b != -1) {
            int i3 = this.f535F;
            c0138d4.getClass();
            return C0138d4.m869v(iM2394b, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* JADX INFO: renamed from: g1 */
    public final int m306g1(int i, C0763tz c0763tz, C0948yz c0948yz) {
        boolean z = c0948yz.f5421g;
        C0138d4 c0138d4 = this.f540K;
        if (!z) {
            int i2 = this.f535F;
            c0138d4.getClass();
            return i % i2;
        }
        int i3 = this.f539J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iM2394b = c0763tz.m2394b(i);
        if (iM2394b != -1) {
            int i4 = this.f535F;
            c0138d4.getClass();
            return iM2394b % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* JADX INFO: renamed from: h1 */
    public final int m307h1(int i, C0763tz c0763tz, C0948yz c0948yz) {
        boolean z = c0948yz.f5421g;
        C0138d4 c0138d4 = this.f540K;
        if (!z) {
            c0138d4.getClass();
            return 1;
        }
        int i2 = this.f538I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c0763tz.m2394b(i) != -1) {
            c0138d4.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m308i1(View view, int i, boolean z) {
        int iM1958w;
        int iM1958w2;
        C0194eo c0194eo = (C0194eo) view.getLayoutParams();
        Rect rect = c0194eo.f3622b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0194eo).topMargin + ((ViewGroup.MarginLayoutParams) c0194eo).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0194eo).leftMargin + ((ViewGroup.MarginLayoutParams) c0194eo).rightMargin;
        int iM303e1 = m303e1(c0194eo.f1825e, c0194eo.f1826f);
        if (this.f546p == 1) {
            iM1958w2 = AbstractC0540nz.m1958w(false, iM303e1, i, i3, ((ViewGroup.MarginLayoutParams) c0194eo).width);
            iM1958w = AbstractC0540nz.m1958w(true, this.f548r.mo108l(), this.f3467m, i2, ((ViewGroup.MarginLayoutParams) c0194eo).height);
        } else {
            int iM1958w3 = AbstractC0540nz.m1958w(false, iM303e1, i, i2, ((ViewGroup.MarginLayoutParams) c0194eo).height);
            int iM1958w4 = AbstractC0540nz.m1958w(true, this.f548r.mo108l(), this.f3466l, i3, ((ViewGroup.MarginLayoutParams) c0194eo).width);
            iM1958w = iM1958w3;
            iM1958w2 = iM1958w4;
        }
        C0577oz c0577oz = (C0577oz) view.getLayoutParams();
        if (z ? m1979u0(view, iM1958w2, iM1958w, c0577oz) : m1977s0(view, iM1958w2, iM1958w, c0577oz)) {
            view.measure(iM1958w2, iM1958w);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final void m309j1(int i) {
        if (i == this.f535F) {
            return;
        }
        this.f534E = true;
        if (i < 1) {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
        this.f535F = i;
        this.f540K.m902x();
        m1971j0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0540nz
    /* JADX INFO: renamed from: k */
    public final int mo310k(C0948yz c0948yz) {
        return m325B0(c0948yz);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0540nz
    /* JADX INFO: renamed from: k0 */
    public final int mo311k0(int i, C0763tz c0763tz, C0948yz c0948yz) {
        m312k1();
        m302d1();
        return super.mo311k0(i, c0763tz, c0948yz);
    }

    /* JADX INFO: renamed from: k1 */
    public final void m312k1() {
        int iM1960B;
        int iM1963E;
        if (this.f546p == 1) {
            iM1960B = this.f3468n - m1962D();
            iM1963E = m1961C();
        } else {
            iM1960B = this.f3469o - m1960B();
            iM1963E = m1963E();
        }
        m301c1(iM1960B - iM1963E);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0540nz
    /* JADX INFO: renamed from: l */
    public final int mo313l(C0948yz c0948yz) {
        return m326C0(c0948yz);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0540nz
    /* JADX INFO: renamed from: m0 */
    public final int mo314m0(int i, C0763tz c0763tz, C0948yz c0948yz) {
        m312k1();
        m302d1();
        return super.mo314m0(i, c0763tz, c0948yz);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0540nz
    /* JADX INFO: renamed from: n */
    public final int mo315n(C0948yz c0948yz) {
        return m325B0(c0948yz);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0540nz
    /* JADX INFO: renamed from: o */
    public final int mo316o(C0948yz c0948yz) {
        return m326C0(c0948yz);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: p0 */
    public final void mo317p0(Rect rect, int i, int i2) {
        int iM1957g;
        int iM1957g2;
        if (this.f536G == null) {
            super.mo317p0(rect, i, i2);
        }
        int iM1962D = m1962D() + m1961C();
        int iM1960B = m1960B() + m1963E();
        if (this.f546p == 1) {
            int iHeight = rect.height() + iM1960B;
            RecyclerView recyclerView = this.f3456b;
            WeakHashMap weakHashMap = ja0.f2600a;
            iM1957g2 = AbstractC0540nz.m1957g(i2, iHeight, s90.m2312d(recyclerView));
            int[] iArr = this.f536G;
            iM1957g = AbstractC0540nz.m1957g(i, iArr[iArr.length - 1] + iM1962D, s90.m2313e(this.f3456b));
        } else {
            int iWidth = rect.width() + iM1962D;
            RecyclerView recyclerView2 = this.f3456b;
            WeakHashMap weakHashMap2 = ja0.f2600a;
            iM1957g = AbstractC0540nz.m1957g(i, iWidth, s90.m2313e(recyclerView2));
            int[] iArr2 = this.f536G;
            iM1957g2 = AbstractC0540nz.m1957g(i2, iArr2[iArr2.length - 1] + iM1960B, s90.m2312d(this.f3456b));
        }
        this.f3456b.setMeasuredDimension(iM1957g, iM1957g2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0540nz
    /* JADX INFO: renamed from: r */
    public final C0577oz mo318r() {
        return this.f546p == 0 ? new C0194eo(-2, -1) : new C0194eo(-1, -2);
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: s */
    public final C0577oz mo319s(Context context, AttributeSet attributeSet) {
        C0194eo c0194eo = new C0194eo(context, attributeSet);
        c0194eo.f1825e = -1;
        c0194eo.f1826f = 0;
        return c0194eo;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: t */
    public final C0577oz mo320t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0194eo c0194eo = new C0194eo((ViewGroup.MarginLayoutParams) layoutParams);
            c0194eo.f1825e = -1;
            c0194eo.f1826f = 0;
            return c0194eo;
        }
        C0194eo c0194eo2 = new C0194eo(layoutParams);
        c0194eo2.f1825e = -1;
        c0194eo2.f1826f = 0;
        return c0194eo2;
    }

    @Override // p000.AbstractC0540nz
    /* JADX INFO: renamed from: x */
    public final int mo321x(C0763tz c0763tz, C0948yz c0948yz) {
        if (this.f546p == 1) {
            return this.f535F;
        }
        if (c0948yz.m2745b() < 1) {
            return 0;
        }
        return m305f1(c0948yz.m2745b() - 1, c0763tz, c0948yz) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.AbstractC0540nz
    /* JADX INFO: renamed from: x0 */
    public final boolean mo322x0() {
        return this.f556z == null && !this.f534E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: z0 */
    public final void mo323z0(C0948yz c0948yz, C0865wq c0865wq, C0074bn c0074bn) {
        int i;
        int i2 = this.f535F;
        for (int i3 = 0; i3 < this.f535F && (i = c0865wq.f5005d) >= 0 && i < c0948yz.m2745b() && i2 > 0; i3++) {
            c0074bn.m562a(c0865wq.f5005d, Math.max(0, c0865wq.f5008g));
            this.f540K.getClass();
            i2--;
            c0865wq.f5005d += c0865wq.f5006e;
        }
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f534E = false;
        this.f535F = -1;
        this.f538I = new SparseIntArray();
        this.f539J = new SparseIntArray();
        this.f540K = new C0138d4(13);
        this.f541L = new Rect();
        m309j1(i);
    }
}
