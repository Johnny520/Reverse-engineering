package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RunnableC1208m;
import java.util.Arrays;
import java.util.WeakHashMap;
import p000a.C0146I;
import p000a.C0181Jg;
import p000a.C0866ug;
import p000a.C0944z;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: E */
    public boolean f4757E;

    /* JADX INFO: renamed from: F */
    public int f4758F;

    /* JADX INFO: renamed from: G */
    public int[] f4759G;

    /* JADX INFO: renamed from: H */
    public View[] f4760H;

    /* JADX INFO: renamed from: I */
    public final SparseIntArray f4761I;

    /* JADX INFO: renamed from: J */
    public final SparseIntArray f4762J;

    /* JADX INFO: renamed from: K */
    public final C1156a f4763K;

    /* JADX INFO: renamed from: L */
    public final Rect f4764L;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C1156a extends AbstractC1158c {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C1157b extends RecyclerView.C1176m {

        /* JADX INFO: renamed from: e */
        public int f4765e;

        /* JADX INFO: renamed from: f */
        public int f4766f;

        public C1157b(int i, int i2) {
            super(i, i2);
            this.f4765e = -1;
            this.f4766f = 0;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class AbstractC1158c {

        /* JADX INFO: renamed from: a */
        public final SparseIntArray f4767a = new SparseIntArray();

        /* JADX INFO: renamed from: b */
        public final SparseIntArray f4768b = new SparseIntArray();

        /* JADX INFO: renamed from: a */
        public static int m2685a(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i3++;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = 1;
                }
            }
            return i3 + 1 > i2 ? i4 + 1 : i4;
        }

        /* JADX INFO: renamed from: b */
        public final void m2686b() {
            this.f4767a.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4757E = false;
        this.f4758F = -1;
        this.f4761I = new SparseIntArray();
        this.f4762J = new SparseIntArray();
        this.f4763K = new C1156a();
        this.f4764L = new Rect();
        m2675n1(RecyclerView.AbstractC1175l.m2828I(context, attributeSet, i, i2).f4944b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: B0 */
    public final boolean mo2647B0() {
        return this.f4783z == null && !this.f4757E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: D0 */
    public final void mo2648D0(RecyclerView.C1186w c1186w, LinearLayoutManager.C1161c c1161c, RunnableC1208m.b bVar) {
        int i;
        int i2 = this.f4758F;
        for (int i3 = 0; i3 < this.f4758F && (i = c1161c.f4796d) >= 0 && i < c1186w.m2887b() && i2 > 0; i3++) {
            bVar.m2975a(c1161c.f4796d, Math.max(0, c1161c.f4799g));
            this.f4763K.getClass();
            i2--;
            c1161c.f4796d += c1161c.f4797e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: J */
    public final int mo2649J(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        if (this.f4773p == 0) {
            return this.f4758F;
        }
        if (c1186w.m2887b() < 1) {
            return 0;
        }
        return m2668j1(c1186w.m2887b() - 1, c1181r, c1186w) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: P0 */
    public final View mo2650P0(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w, boolean z, boolean z2) {
        int i;
        int iM2860v;
        int iM2860v2 = m2860v();
        int i2 = 1;
        if (z2) {
            iM2860v = m2860v() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM2860v2;
            iM2860v = 0;
        }
        int iM2887b = c1186w.m2887b();
        m2692I0();
        int iMo2988k = this.f4775r.mo2988k();
        int iMo2984g = this.f4775r.mo2984g();
        View view = null;
        View view2 = null;
        while (iM2860v != i) {
            View viewM2858u = m2858u(iM2860v);
            int iM2827H = RecyclerView.AbstractC1175l.m2827H(viewM2858u);
            if (iM2827H >= 0 && iM2827H < iM2887b && m2670k1(iM2827H, c1181r, c1186w) == 0) {
                if (((RecyclerView.C1176m) viewM2858u.getLayoutParams()).f4947a.m2802h()) {
                    if (view2 == null) {
                        view2 = viewM2858u;
                    }
                } else {
                    if (this.f4775r.mo2982e(viewM2858u) < iMo2984g && this.f4775r.mo2979b(viewM2858u) >= iMo2988k) {
                        return viewM2858u;
                    }
                    if (view == null) {
                        view = viewM2858u;
                    }
                }
            }
            iM2860v += i2;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0140, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0142, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0143, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo2651T(View view, int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        View viewM2747D;
        int iM2860v;
        int i2;
        int iM2860v2;
        View view2;
        int i3;
        int i4;
        RecyclerView.C1181r c1181r2 = c1181r;
        RecyclerView.C1186w c1186w2 = c1186w;
        RecyclerView recyclerView = this.f4927b;
        if (recyclerView == null || (viewM2747D = recyclerView.m2747D(view)) == null || this.f4926a.f5067c.contains(viewM2747D)) {
            viewM2747D = null;
        }
        if (viewM2747D != null) {
            C1157b c1157b = (C1157b) viewM2747D.getLayoutParams();
            int i5 = c1157b.f4765e;
            int i6 = c1157b.f4766f + i5;
            if (super.mo2651T(view, i, c1181r, c1186w) != null) {
                if ((m2691H0(i) == 1) != this.f4778u) {
                    iM2860v2 = m2860v() - 1;
                    iM2860v = -1;
                    i2 = -1;
                } else {
                    iM2860v = m2860v();
                    i2 = 1;
                    iM2860v2 = 0;
                }
                boolean z = this.f4773p == 1 && m2706U0();
                int iM2668j1 = m2668j1(iM2860v2, c1181r2, c1186w2);
                View view3 = null;
                int i7 = -1;
                int i8 = -1;
                int iMin = 0;
                int i9 = iM2860v2;
                int iMin2 = 0;
                View view4 = null;
                while (true) {
                    View view5 = view4;
                    if (i9 == iM2860v) {
                        break;
                    }
                    int iM2668j12 = m2668j1(i9, c1181r2, c1186w2);
                    View viewM2858u = m2858u(i9);
                    if (viewM2858u == viewM2747D) {
                        break;
                    }
                    if (!viewM2858u.hasFocusable() || iM2668j12 == iM2668j1) {
                        C1157b c1157b2 = (C1157b) viewM2858u.getLayoutParams();
                        int i10 = c1157b2.f4765e;
                        view2 = viewM2747D;
                        int i11 = c1157b2.f4766f + i10;
                        if (viewM2858u.hasFocusable() && i10 == i5 && i11 == i6) {
                            return viewM2858u;
                        }
                        if (!(viewM2858u.hasFocusable() && view3 == null) && (viewM2858u.hasFocusable() || view5 != null)) {
                            i3 = iM2860v;
                            int iMin3 = Math.min(i11, i6) - Math.max(i10, i5);
                            if (viewM2858u.hasFocusable()) {
                                if (iMin3 <= iMin) {
                                    if (iMin3 == iMin) {
                                    }
                                    i4 = iMin;
                                }
                                i4 = iMin;
                            } else if (view3 == null) {
                                i4 = iMin;
                                if (!this.f4928c.m2635b(viewM2858u) || !this.f4929d.m2635b(viewM2858u)) {
                                    if (iMin3 <= iMin2) {
                                        if (iMin3 == iMin2) {
                                            if (z == (i10 > i7)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                i4 = iMin;
                            }
                            i9 += i2;
                            c1181r2 = c1181r;
                            c1186w2 = c1186w;
                            viewM2747D = view2;
                            iM2860v = i3;
                        } else {
                            i4 = iMin;
                            i3 = iM2860v;
                        }
                        if (viewM2858u.hasFocusable()) {
                            int i12 = c1157b2.f4765e;
                            iMin = Math.min(i11, i6) - Math.max(i10, i5);
                            view3 = viewM2858u;
                            i8 = i12;
                            view4 = view5;
                        } else {
                            int i13 = c1157b2.f4765e;
                            view4 = viewM2858u;
                            i7 = i13;
                            iMin = i4;
                            iMin2 = Math.min(i11, i6) - Math.max(i10, i5);
                        }
                        i9 += i2;
                        c1181r2 = c1181r;
                        c1186w2 = c1186w;
                        viewM2747D = view2;
                        iM2860v = i3;
                    } else {
                        if (view3 != null) {
                            break;
                        }
                        view2 = viewM2747D;
                        i4 = iMin;
                        i3 = iM2860v;
                    }
                    view4 = view5;
                    iMin = i4;
                    i9 += i2;
                    c1181r2 = c1181r;
                    c1186w2 = c1186w;
                    viewM2747D = view2;
                    iM2860v = i3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: V */
    public final void mo2652V(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w, C0146I c0146i) {
        super.mo2652V(c1181r, c1186w, c0146i);
        c0146i.m382h(GridView.class.getName());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v11, resolved type: android.graphics.Rect */
    /* JADX DEBUG: Multi-variable search result rejected for r18v0, resolved type: androidx.recyclerview.widget.GridLayoutManager */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v37 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: V0 */
    public final void mo2653V0(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w, LinearLayoutManager.C1161c c1161c, LinearLayoutManager.C1160b c1160b) {
        int i;
        int i2;
        int i3;
        int iMo2981d;
        int iM2838E;
        int iM2840G;
        int iMo2981d2;
        int iM2832w;
        int iM2832w2;
        ?? r8;
        int i4;
        View viewM2733b;
        int iMo2987j = this.f4775r.mo2987j();
        boolean z = iMo2987j != 1073741824;
        int i5 = m2860v() > 0 ? this.f4759G[this.f4758F] : 0;
        if (z) {
            m2678o1();
        }
        boolean z2 = c1161c.f4797e == 1;
        int iM2670k1 = this.f4758F;
        if (!z2) {
            iM2670k1 = m2670k1(c1161c.f4796d, c1181r, c1186w) + m2672l1(c1161c.f4796d, c1181r, c1186w);
        }
        int i6 = 0;
        while (i6 < this.f4758F && (i4 = c1161c.f4796d) >= 0 && i4 < c1186w.m2887b() && iM2670k1 > 0) {
            int i7 = c1161c.f4796d;
            int iM2672l1 = m2672l1(i7, c1181r, c1186w);
            if (iM2672l1 > this.f4758F) {
                throw new IllegalArgumentException("Item at position " + i7 + " requires " + iM2672l1 + " spans but GridLayoutManager has only " + this.f4758F + " spans.");
            }
            iM2670k1 -= iM2672l1;
            if (iM2670k1 < 0 || (viewM2733b = c1161c.m2733b(c1181r)) == null) {
                break;
            }
            this.f4760H[i6] = viewM2733b;
            i6++;
        }
        if (i6 == 0) {
            c1160b.f4790b = true;
            return;
        }
        if (z2) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.f4760H[i];
            C1157b c1157b = (C1157b) view.getLayoutParams();
            int iM2672l12 = m2672l1(RecyclerView.AbstractC1175l.m2827H(view), c1181r, c1186w);
            c1157b.f4766f = iM2672l12;
            c1157b.f4765e = i8;
            i8 += iM2672l12;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.f4760H[i10];
            if (c1161c.f4803k != null) {
                r8 = 0;
                r8 = 0;
                if (z2) {
                    m2847b(view2, -1, true);
                } else {
                    m2847b(view2, 0, true);
                }
            } else if (z2) {
                r8 = 0;
                m2847b(view2, -1, false);
            } else {
                r8 = 0;
                m2847b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f4927b;
            Rect rect = this.f4764L;
            if (recyclerView == null) {
                rect.set(r8, r8, r8, r8);
            } else {
                rect.set(recyclerView.m2754M(view2));
            }
            m2673m1(view2, iMo2987j, r8);
            int iMo2980c = this.f4775r.mo2980c(view2);
            if (iMo2980c > i9) {
                i9 = iMo2980c;
            }
            float fMo2981d = (this.f4775r.mo2981d(view2) * 1.0f) / ((C1157b) view2.getLayoutParams()).f4766f;
            if (fMo2981d > f) {
                f = fMo2981d;
            }
        }
        if (z) {
            m2665g1(Math.max(Math.round(f * this.f4758F), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.f4760H[i11];
                m2673m1(view3, 1073741824, true);
                int iMo2980c2 = this.f4775r.mo2980c(view3);
                if (iMo2980c2 > i9) {
                    i9 = iMo2980c2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.f4760H[i12];
            if (this.f4775r.mo2980c(view4) != i9) {
                C1157b c1157b2 = (C1157b) view4.getLayoutParams();
                Rect rect2 = c1157b2.f4948b;
                int i13 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1157b2).topMargin + ((ViewGroup.MarginLayoutParams) c1157b2).bottomMargin;
                int i14 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c1157b2).leftMargin + ((ViewGroup.MarginLayoutParams) c1157b2).rightMargin;
                int iM2667i1 = m2667i1(c1157b2.f4765e, c1157b2.f4766f);
                if (this.f4773p == 1) {
                    iM2832w2 = RecyclerView.AbstractC1175l.m2832w(false, iM2667i1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) c1157b2).width);
                    iM2832w = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iM2832w = RecyclerView.AbstractC1175l.m2832w(false, iM2667i1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) c1157b2).height);
                    iM2832w2 = iMakeMeasureSpec;
                }
                if (m2864y0(view4, iM2832w2, iM2832w, (RecyclerView.C1176m) view4.getLayoutParams())) {
                    view4.measure(iM2832w2, iM2832w);
                }
            }
        }
        c1160b.f4789a = i9;
        if (this.f4773p != 1) {
            if (c1161c.f4798f == -1) {
                int i15 = c1161c.f4794b;
                iM2838E = i15 - i9;
                iMo2981d = i15;
            } else {
                int i16 = c1161c.f4794b;
                iMo2981d = i16 + i9;
                iM2838E = i16;
            }
            iM2840G = 0;
            iMo2981d2 = 0;
        } else if (c1161c.f4798f == -1) {
            iMo2981d2 = c1161c.f4794b;
            iM2840G = iMo2981d2 - i9;
            iM2838E = 0;
            iMo2981d = 0;
        } else {
            int i17 = c1161c.f4794b;
            iM2840G = i17;
            iMo2981d = 0;
            iMo2981d2 = i17 + i9;
            iM2838E = 0;
        }
        for (int i18 = 0; i18 < i6; i18++) {
            View view5 = this.f4760H[i18];
            C1157b c1157b3 = (C1157b) view5.getLayoutParams();
            if (this.f4773p != 1) {
                iM2840G = m2840G() + this.f4759G[c1157b3.f4765e];
                iMo2981d2 = this.f4775r.mo2981d(view5) + iM2840G;
            } else if (m2706U0()) {
                int iM2838E2 = m2838E() + this.f4759G[this.f4758F - c1157b3.f4765e];
                iMo2981d = iM2838E2;
                iM2838E = iM2838E2 - this.f4775r.mo2981d(view5);
            } else {
                iM2838E = m2838E() + this.f4759G[c1157b3.f4765e];
                iMo2981d = this.f4775r.mo2981d(view5) + iM2838E;
            }
            RecyclerView.AbstractC1175l.m2830N(view5, iM2838E, iM2840G, iMo2981d, iMo2981d2);
            if (c1157b3.f4947a.m2802h() || c1157b3.f4947a.m2805k()) {
                c1160b.f4791c = true;
            }
            c1160b.f4792d = view5.hasFocusable() | c1160b.f4792d;
        }
        Arrays.fill(this.f4760H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: W0 */
    public final void mo2654W0(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w, LinearLayoutManager.C1159a c1159a, int i) {
        m2678o1();
        if (c1186w.m2887b() > 0 && !c1186w.f4989g) {
            boolean z = i == 1;
            int iM2670k1 = m2670k1(c1159a.f4785b, c1181r, c1186w);
            if (z) {
                while (iM2670k1 > 0) {
                    int i2 = c1159a.f4785b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c1159a.f4785b = i3;
                    iM2670k1 = m2670k1(i3, c1181r, c1186w);
                }
            } else {
                int iM2887b = c1186w.m2887b() - 1;
                int i4 = c1159a.f4785b;
                while (i4 < iM2887b) {
                    int i5 = i4 + 1;
                    int iM2670k12 = m2670k1(i5, c1181r, c1186w);
                    if (iM2670k12 <= iM2670k1) {
                        break;
                    }
                    i4 = i5;
                    iM2670k1 = iM2670k12;
                }
                c1159a.f4785b = i4;
            }
        }
        m2666h1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: X */
    public final void mo2655X(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w, View view, C0146I c0146i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1157b)) {
            m2846W(view, c0146i);
            return;
        }
        C1157b c1157b = (C1157b) layoutParams;
        int iM2668j1 = m2668j1(c1157b.f4947a.m2796b(), c1181r, c1186w);
        int i = this.f4773p;
        AccessibilityNodeInfo accessibilityNodeInfo = c0146i.f505a;
        if (i == 0) {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(c1157b.f4765e, c1157b.f4766f, iM2668j1, 1, false, false));
        } else {
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iM2668j1, 1, c1157b.f4765e, c1157b.f4766f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: Y */
    public final void mo2656Y(int i, int i2) {
        C1156a c1156a = this.f4763K;
        c1156a.m2686b();
        c1156a.f4768b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: Z */
    public final void mo2657Z() {
        C1156a c1156a = this.f4763K;
        c1156a.m2686b();
        c1156a.f4768b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: a0 */
    public final void mo2658a0(int i, int i2) {
        C1156a c1156a = this.f4763K;
        c1156a.m2686b();
        c1156a.f4768b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: b0 */
    public final void mo2659b0(int i, int i2) {
        C1156a c1156a = this.f4763K;
        c1156a.m2686b();
        c1156a.f4768b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: c0 */
    public final void mo2660c0(int i, int i2) {
        C1156a c1156a = this.f4763K;
        c1156a.m2686b();
        c1156a.f4768b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: c1 */
    public final void mo2661c1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo2661c1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: d0 */
    public final void mo2662d0(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        boolean z = c1186w.f4989g;
        SparseIntArray sparseIntArray = this.f4762J;
        SparseIntArray sparseIntArray2 = this.f4761I;
        if (z) {
            int iM2860v = m2860v();
            for (int i = 0; i < iM2860v; i++) {
                C1157b c1157b = (C1157b) m2858u(i).getLayoutParams();
                int iM2796b = c1157b.f4947a.m2796b();
                sparseIntArray2.put(iM2796b, c1157b.f4766f);
                sparseIntArray.put(iM2796b, c1157b.f4765e);
            }
        }
        super.mo2662d0(c1181r, c1186w);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: e0 */
    public final void mo2663e0(RecyclerView.C1186w c1186w) {
        super.mo2663e0(c1186w);
        this.f4757E = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: f */
    public final boolean mo2664f(RecyclerView.C1176m c1176m) {
        return c1176m instanceof C1157b;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m2665g1(int i) {
        int i2;
        int[] iArr = this.f4759G;
        int i3 = this.f4758F;
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
        this.f4759G = iArr;
    }

    /* JADX INFO: renamed from: h1 */
    public final void m2666h1() {
        View[] viewArr = this.f4760H;
        if (viewArr == null || viewArr.length != this.f4758F) {
            this.f4760H = new View[this.f4758F];
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final int m2667i1(int i, int i2) {
        if (this.f4773p != 1 || !m2706U0()) {
            int[] iArr = this.f4759G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f4759G;
        int i3 = this.f4758F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* JADX INFO: renamed from: j1 */
    public final int m2668j1(int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        boolean z = c1186w.f4989g;
        C1156a c1156a = this.f4763K;
        if (!z) {
            int i2 = this.f4758F;
            c1156a.getClass();
            return AbstractC1158c.m2685a(i, i2);
        }
        int iM2869b = c1181r.m2869b(i);
        if (iM2869b != -1) {
            int i3 = this.f4758F;
            c1156a.getClass();
            return AbstractC1158c.m2685a(iM2869b, i3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: k */
    public final int mo2669k(RecyclerView.C1186w c1186w) {
        return m2689F0(c1186w);
    }

    /* JADX INFO: renamed from: k1 */
    public final int m2670k1(int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        boolean z = c1186w.f4989g;
        C1156a c1156a = this.f4763K;
        if (!z) {
            int i2 = this.f4758F;
            c1156a.getClass();
            return i % i2;
        }
        int i3 = this.f4762J.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iM2869b = c1181r.m2869b(i);
        if (iM2869b != -1) {
            int i4 = this.f4758F;
            c1156a.getClass();
            return iM2869b % i4;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: l */
    public final int mo2671l(RecyclerView.C1186w c1186w) {
        return m2690G0(c1186w);
    }

    /* JADX INFO: renamed from: l1 */
    public final int m2672l1(int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        boolean z = c1186w.f4989g;
        C1156a c1156a = this.f4763K;
        if (!z) {
            c1156a.getClass();
            return 1;
        }
        int i2 = this.f4761I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (c1181r.m2869b(i) != -1) {
            c1156a.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* JADX INFO: renamed from: m1 */
    public final void m2673m1(View view, int i, boolean z) {
        int iM2832w;
        int iM2832w2;
        C1157b c1157b = (C1157b) view.getLayoutParams();
        Rect rect = c1157b.f4948b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1157b).topMargin + ((ViewGroup.MarginLayoutParams) c1157b).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1157b).leftMargin + ((ViewGroup.MarginLayoutParams) c1157b).rightMargin;
        int iM2667i1 = m2667i1(c1157b.f4765e, c1157b.f4766f);
        if (this.f4773p == 1) {
            iM2832w2 = RecyclerView.AbstractC1175l.m2832w(false, iM2667i1, i, i3, ((ViewGroup.MarginLayoutParams) c1157b).width);
            iM2832w = RecyclerView.AbstractC1175l.m2832w(true, this.f4775r.mo2989l(), this.f4938m, i2, ((ViewGroup.MarginLayoutParams) c1157b).height);
        } else {
            int iM2832w3 = RecyclerView.AbstractC1175l.m2832w(false, iM2667i1, i, i2, ((ViewGroup.MarginLayoutParams) c1157b).height);
            int iM2832w4 = RecyclerView.AbstractC1175l.m2832w(true, this.f4775r.mo2989l(), this.f4937l, i3, ((ViewGroup.MarginLayoutParams) c1157b).width);
            iM2832w = iM2832w3;
            iM2832w2 = iM2832w4;
        }
        RecyclerView.C1176m c1176m = (RecyclerView.C1176m) view.getLayoutParams();
        if (z ? m2864y0(view, iM2832w2, iM2832w, c1176m) : m2862w0(view, iM2832w2, iM2832w, c1176m)) {
            view.measure(iM2832w2, iM2832w);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: n */
    public final int mo2674n(RecyclerView.C1186w c1186w) {
        return m2689F0(c1186w);
    }

    /* JADX INFO: renamed from: n1 */
    public final void m2675n1(int i) {
        if (i == this.f4758F) {
            return;
        }
        this.f4757E = true;
        if (i < 1) {
            throw new IllegalArgumentException(C0944z.m2225e("Span count should be at least 1. Provided ", i));
        }
        this.f4758F = i;
        this.f4763K.m2686b();
        m2854n0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: o */
    public final int mo2676o(RecyclerView.C1186w c1186w) {
        return m2690G0(c1186w);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: o0 */
    public final int mo2677o0(int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        m2678o1();
        m2666h1();
        return super.mo2677o0(i, c1181r, c1186w);
    }

    /* JADX INFO: renamed from: o1 */
    public final void m2678o1() {
        int iM2837D;
        int iM2840G;
        if (this.f4773p == 1) {
            iM2837D = this.f4939n - m2839F();
            iM2840G = m2838E();
        } else {
            iM2837D = this.f4940o - m2837D();
            iM2840G = m2840G();
        }
        m2665g1(iM2837D - iM2840G);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: q0 */
    public final int mo2679q0(int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        m2678o1();
        m2666h1();
        return super.mo2679q0(i, c1181r, c1186w);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: r */
    public final RecyclerView.C1176m mo2680r() {
        return this.f4773p == 0 ? new C1157b(-2, -1) : new C1157b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: s */
    public final RecyclerView.C1176m mo2681s(Context context, AttributeSet attributeSet) {
        C1157b c1157b = new C1157b(context, attributeSet);
        c1157b.f4765e = -1;
        c1157b.f4766f = 0;
        return c1157b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: t */
    public final RecyclerView.C1176m mo2682t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C1157b c1157b = new C1157b((ViewGroup.MarginLayoutParams) layoutParams);
            c1157b.f4765e = -1;
            c1157b.f4766f = 0;
            return c1157b;
        }
        C1157b c1157b2 = new C1157b(layoutParams);
        c1157b2.f4765e = -1;
        c1157b2.f4766f = 0;
        return c1157b2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: t0 */
    public final void mo2683t0(Rect rect, int i, int i2) {
        int iM2831g;
        int iM2831g2;
        if (this.f4759G == null) {
            super.mo2683t0(rect, i, i2);
        }
        int iM2839F = m2839F() + m2838E();
        int iM2837D = m2837D() + m2840G();
        if (this.f4773p == 1) {
            int iHeight = rect.height() + iM2837D;
            RecyclerView recyclerView = this.f4927b;
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            iM2831g2 = RecyclerView.AbstractC1175l.m2831g(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f4759G;
            iM2831g = RecyclerView.AbstractC1175l.m2831g(i, iArr[iArr.length - 1] + iM2839F, this.f4927b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM2839F;
            RecyclerView recyclerView2 = this.f4927b;
            WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
            iM2831g = RecyclerView.AbstractC1175l.m2831g(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f4759G;
            iM2831g2 = RecyclerView.AbstractC1175l.m2831g(i2, iArr2[iArr2.length - 1] + iM2837D, this.f4927b.getMinimumHeight());
        }
        this.f4927b.setMeasuredDimension(iM2831g, iM2831g2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: x */
    public final int mo2684x(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        if (this.f4773p == 1) {
            return this.f4758F;
        }
        if (c1186w.m2887b() < 1) {
            return 0;
        }
        return m2668j1(c1186w.m2887b() - 1, c1181r, c1186w) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f4757E = false;
        this.f4758F = -1;
        this.f4761I = new SparseIntArray();
        this.f4762J = new SparseIntArray();
        this.f4763K = new C1156a();
        this.f4764L = new Rect();
        m2675n1(i);
    }
}
