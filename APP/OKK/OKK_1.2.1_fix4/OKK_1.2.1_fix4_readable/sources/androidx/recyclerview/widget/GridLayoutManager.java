package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import p006D.C0095d;
import p008E.C0156j;
import p034S.AbstractC0324d;
import p037U.AbstractC0343C;
import p037U.C0344D;
import p037U.C0349I;
import p037U.C0352L;
import p037U.C0379o;
import p037U.C0382r;
import p037U.C0383s;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: A */
    public final Rect f1519A;

    /* JADX INFO: renamed from: v */
    public int f1520v;

    /* JADX INFO: renamed from: w */
    public int[] f1521w;

    /* JADX INFO: renamed from: x */
    public final SparseIntArray f1522x;

    /* JADX INFO: renamed from: y */
    public final SparseIntArray f1523y;

    /* JADX INFO: renamed from: z */
    public final C0095d f1524z;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f1520v = -1;
        this.f1522x = new SparseIntArray();
        this.f1523y = new SparseIntArray();
        this.f1524z = new C0095d(11);
        this.f1519A = new Rect();
        m1271E0(AbstractC0343C.m766E(context, attributeSet, i2, i3).f851c);
    }

    /* JADX INFO: renamed from: A0 */
    public final int m1267A0(C0349I c0349i, C0352L c0352l, int i2) {
        boolean z2 = c0352l.f698f;
        C0095d c0095d = this.f1524z;
        if (!z2) {
            int i3 = this.f1520v;
            c0095d.getClass();
            return C0095d.m337x(i2, i3);
        }
        int iM822b = c0349i.m822b(i2);
        if (iM822b == -1) {
            return 0;
        }
        int i4 = this.f1520v;
        c0095d.getClass();
        return C0095d.m337x(iM822b, i4);
    }

    /* JADX INFO: renamed from: B0 */
    public final int m1268B0(C0349I c0349i, C0352L c0352l, int i2) {
        boolean z2 = c0352l.f698f;
        C0095d c0095d = this.f1524z;
        if (!z2) {
            int i3 = this.f1520v;
            c0095d.getClass();
            return i2 % i3;
        }
        int i4 = this.f1523y.get(i2, -1);
        if (i4 != -1) {
            return i4;
        }
        int iM822b = c0349i.m822b(i2);
        if (iM822b == -1) {
            return 0;
        }
        int i5 = this.f1520v;
        c0095d.getClass();
        return iM822b % i5;
    }

    /* JADX INFO: renamed from: C0 */
    public final int m1269C0(C0349I c0349i, C0352L c0352l, int i2) {
        boolean z2 = c0352l.f698f;
        C0095d c0095d = this.f1524z;
        if (!z2) {
            c0095d.getClass();
            return 1;
        }
        int i3 = this.f1522x.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        if (c0349i.m822b(i2) == -1) {
            return 1;
        }
        c0095d.getClass();
        return 1;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m1270D0(View view, int i2, boolean z2) {
        int iM769s;
        int iM769s2;
        C0379o c0379o = (C0379o) view.getLayoutParams();
        Rect rect = c0379o.f677a;
        int i3 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0379o).topMargin + ((ViewGroup.MarginLayoutParams) c0379o).bottomMargin;
        int i4 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0379o).leftMargin + ((ViewGroup.MarginLayoutParams) c0379o).rightMargin;
        int iM1276z0 = m1276z0(c0379o.f838d, c0379o.f839e);
        if (this.f1525k == 1) {
            iM769s2 = AbstractC0343C.m769s(false, iM1276z0, i2, i4, ((ViewGroup.MarginLayoutParams) c0379o).width);
            iM769s = AbstractC0343C.m769s(true, this.f1527m.m974l(), this.f674h, i3, ((ViewGroup.MarginLayoutParams) c0379o).height);
        } else {
            int iM769s3 = AbstractC0343C.m769s(false, iM1276z0, i2, i3, ((ViewGroup.MarginLayoutParams) c0379o).height);
            int iM769s4 = AbstractC0343C.m769s(true, this.f1527m.m974l(), this.f673g, i4, ((ViewGroup.MarginLayoutParams) c0379o).width);
            iM769s = iM769s3;
            iM769s2 = iM769s4;
        }
        C0344D c0344d = (C0344D) view.getLayoutParams();
        if (z2 ? m798b0(view, iM769s2, iM769s, c0344d) : m796a0(view, iM769s2, iM769s, c0344d)) {
            view.measure(iM769s2, iM769s);
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m1271E0(int i2) {
        if (i2 == this.f1520v) {
            return;
        }
        if (i2 < 1) {
            throw new IllegalArgumentException(AbstractC0324d.m720c("Span count should be at least 1. Provided ", i2));
        }
        this.f1520v = i2;
        this.f1524z.m358y();
        m793Y();
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: F */
    public final int mo775F(C0349I c0349i, C0352L c0352l) {
        if (this.f1525k == 0) {
            return this.f1520v;
        }
        if (c0352l.m832a() < 1) {
            return 0;
        }
        return m1267A0(c0349i, c0352l, c0352l.m832a() - 1) + 1;
    }

    /* JADX INFO: renamed from: F0 */
    public final void m1272F0() {
        int iM818z;
        int iM774C;
        if (this.f1525k == 1) {
            iM818z = this.f675i - m773B();
            iM774C = m772A();
        } else {
            iM818z = this.f676j - m818z();
            iM774C = m774C();
        }
        m1275y0(iM818z - iM774C);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00df, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0126  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, p037U.AbstractC0343C
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo780L(View view, int i2, C0349I c0349i, C0352L c0352l) {
        View viewM1325q;
        int iM813r;
        int i3;
        int iM813r2;
        View view2;
        View view3;
        int iMin;
        boolean z2;
        boolean z3;
        C0349I c0349i2 = c0349i;
        C0352L c0352l2 = c0352l;
        RecyclerView recyclerView = this.f668b;
        View view4 = null;
        if (recyclerView == null || (viewM1325q = recyclerView.m1325q(view)) == null || this.f667a.m654q(viewM1325q)) {
            viewM1325q = null;
        }
        if (viewM1325q == null) {
            return null;
        }
        C0379o c0379o = (C0379o) viewM1325q.getLayoutParams();
        int i4 = c0379o.f838d;
        int i5 = c0379o.f839e + i4;
        if (super.mo780L(view, i2, c0349i, c0352l) == null) {
            return null;
        }
        if ((m1281g0(i2) == 1) != this.f1529o) {
            iM813r2 = m813r() - 1;
            iM813r = -1;
            i3 = -1;
        } else {
            iM813r = m813r();
            i3 = 1;
            iM813r2 = 0;
        }
        boolean z4 = this.f1525k == 1 && m1291q0();
        int iM1267A0 = m1267A0(c0349i2, c0352l2, iM813r2);
        int i6 = -1;
        int i7 = -1;
        int i8 = i3;
        int i9 = 0;
        int iMin2 = 0;
        int i10 = iM813r2;
        View view5 = null;
        while (i10 != iM813r) {
            int i11 = iM813r;
            int iM1267A02 = m1267A0(c0349i2, c0352l2, i10);
            View viewM812q = m812q(i10);
            if (viewM812q == viewM1325q) {
                break;
            }
            if (!viewM812q.hasFocusable() || iM1267A02 == iM1267A0) {
                C0379o c0379o2 = (C0379o) viewM812q.getLayoutParams();
                int i12 = c0379o2.f838d;
                view2 = viewM1325q;
                int i13 = c0379o2.f839e + i12;
                if (viewM812q.hasFocusable() && i12 == i4 && i13 == i5) {
                    return viewM812q;
                }
                if (!(viewM812q.hasFocusable() && view4 == null) && (viewM812q.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i13, i5) - Math.max(i12, i4);
                    if (!viewM812q.hasFocusable()) {
                        if (view4 == null) {
                            iMin = i9;
                            if (this.f669c.m4e(viewM812q) && this.f670d.m4e(viewM812q)) {
                                z2 = true;
                                z3 = true;
                            } else {
                                z2 = true;
                                z3 = false;
                            }
                            if (!z3) {
                                if (iMin3 <= iMin2) {
                                    if (iMin3 == iMin2) {
                                        if (z4 == (i12 > i6 ? z2 : false)) {
                                        }
                                        i10 += i8;
                                        c0349i2 = c0349i;
                                        c0352l2 = c0352l;
                                        iM813r = i11;
                                        viewM1325q = view2;
                                        i9 = iMin;
                                    }
                                }
                                if (viewM812q.hasFocusable()) {
                                    int i14 = c0379o2.f838d;
                                    iMin2 = Math.min(i13, i5) - Math.max(i12, i4);
                                    i6 = i14;
                                    view5 = viewM812q;
                                } else {
                                    int i15 = c0379o2.f838d;
                                    iMin = Math.min(i13, i5) - Math.max(i12, i4);
                                    i7 = i15;
                                    view5 = view3;
                                    view4 = viewM812q;
                                }
                                i10 += i8;
                                c0349i2 = c0349i;
                                c0352l2 = c0352l;
                                iM813r = i11;
                                viewM1325q = view2;
                                i9 = iMin;
                            }
                        }
                        view5 = view3;
                        i10 += i8;
                        c0349i2 = c0349i;
                        c0352l2 = c0352l;
                        iM813r = i11;
                        viewM1325q = view2;
                        i9 = iMin;
                    } else if (iMin3 <= i9) {
                        if (iMin3 == i9) {
                        }
                    }
                } else {
                    view3 = view5;
                }
                iMin = i9;
                if (viewM812q.hasFocusable()) {
                }
                i10 += i8;
                c0349i2 = c0349i;
                c0352l2 = c0352l;
                iM813r = i11;
                viewM1325q = view2;
                i9 = iMin;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = viewM1325q;
                view3 = view5;
            }
            iMin = i9;
            view5 = view3;
            i10 += i8;
            c0349i2 = c0349i;
            c0352l2 = c0352l;
            iM813r = i11;
            viewM1325q = view2;
            i9 = iMin;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: N */
    public final void mo782N(C0349I c0349i, C0352L c0352l, View view, C0156j c0156j) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C0379o) {
            ((C0379o) layoutParams).getClass();
            throw null;
        }
        m783O(view, c0156j);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: e */
    public final boolean mo801e(C0344D c0344d) {
        return c0344d instanceof C0379o;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p037U.AbstractC0343C
    /* JADX INFO: renamed from: h */
    public final int mo803h(C0352L c0352l) {
        return m1279e0(c0352l);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p037U.AbstractC0343C
    /* JADX INFO: renamed from: i */
    public final int mo804i(C0352L c0352l) {
        return m1280f0(c0352l);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p037U.AbstractC0343C
    /* JADX INFO: renamed from: k */
    public final int mo806k(C0352L c0352l) {
        return m1279e0(c0352l);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p037U.AbstractC0343C
    /* JADX INFO: renamed from: l */
    public final int mo807l(C0352L c0352l) {
        return m1280f0(c0352l);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p037U.AbstractC0343C
    /* JADX INFO: renamed from: n */
    public final C0344D mo809n() {
        return this.f1525k == 0 ? new C0379o(-2, -1) : new C0379o(-1, -2);
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: o */
    public final C0344D mo810o(Context context, AttributeSet attributeSet) {
        C0379o c0379o = new C0379o(context, attributeSet);
        c0379o.f838d = -1;
        c0379o.f839e = 0;
        return c0379o;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: p */
    public final C0344D mo811p(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C0379o c0379o = new C0379o((ViewGroup.MarginLayoutParams) layoutParams);
            c0379o.f838d = -1;
            c0379o.f839e = 0;
            return c0379o;
        }
        C0379o c0379o2 = new C0379o(layoutParams);
        c0379o2.f838d = -1;
        c0379o2.f839e = 0;
        return c0379o2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: r0 */
    public final void mo1273r0(C0349I c0349i, C0352L c0352l, C0383s c0383s, C0382r c0382r) {
        int i2;
        boolean z2 = this.f1527m.m972j() != 1073741824;
        if (m813r() > 0) {
            int i3 = this.f1521w[this.f1520v];
        }
        if (z2) {
            m1272F0();
        }
        boolean z3 = c0383s.f862e == 1;
        int iM1268B0 = this.f1520v;
        if (!z3) {
            iM1268B0 = m1268B0(c0349i, c0352l, c0383s.f861d) + m1269C0(c0349i, c0352l, c0383s.f861d);
        }
        if (this.f1520v > 0 && (i2 = c0383s.f861d) >= 0 && i2 < c0352l.m832a() && iM1268B0 > 0) {
            int i4 = c0383s.f861d;
            int iM1269C0 = m1269C0(c0349i, c0352l, i4);
            if (iM1269C0 > this.f1520v) {
                throw new IllegalArgumentException("Item at position " + i4 + " requires " + iM1269C0 + " spans but GridLayoutManager has only " + this.f1520v + " spans.");
            }
            if (iM1268B0 - iM1269C0 >= 0 && c0383s.m962b(c0349i) != null) {
                throw null;
            }
        }
        c0382r.f855b = true;
    }

    @Override // p037U.AbstractC0343C
    /* JADX INFO: renamed from: t */
    public final int mo814t(C0349I c0349i, C0352L c0352l) {
        if (this.f1525k == 1) {
            return this.f1520v;
        }
        if (c0352l.m832a() < 1) {
            return 0;
        }
        return m1267A0(c0349i, c0352l, c0352l.m832a() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: w0 */
    public final void mo1274w0(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo1274w0(false);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m1275y0(int i2) {
        int i3;
        int[] iArr = this.f1521w;
        int i4 = this.f1520v;
        if (iArr == null || iArr.length != i4 + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i4 + 1];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i2 / i4;
        int i7 = i2 % i4;
        int i8 = 0;
        for (int i9 = 1; i9 <= i4; i9++) {
            i5 += i7;
            if (i5 <= 0 || i4 - i5 >= i7) {
                i3 = i6;
            } else {
                i3 = i6 + 1;
                i5 -= i4;
            }
            i8 += i3;
            iArr[i9] = i8;
        }
        this.f1521w = iArr;
    }

    /* JADX INFO: renamed from: z0 */
    public final int m1276z0(int i2, int i3) {
        if (this.f1525k != 1 || !m1291q0()) {
            int[] iArr = this.f1521w;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.f1521w;
        int i4 = this.f1520v;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }
}
