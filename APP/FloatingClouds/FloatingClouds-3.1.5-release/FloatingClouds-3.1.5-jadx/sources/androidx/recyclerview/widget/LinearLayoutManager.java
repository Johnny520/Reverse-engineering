package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RunnableC1208m;
import java.util.List;
import p000a.C0944z;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC1175l implements RecyclerView.AbstractC1185v.b {

    /* JADX INFO: renamed from: A */
    public final C1159a f4769A;

    /* JADX INFO: renamed from: B */
    public final C1160b f4770B;

    /* JADX INFO: renamed from: C */
    public final int f4771C;

    /* JADX INFO: renamed from: D */
    public final int[] f4772D;

    /* JADX INFO: renamed from: p */
    public int f4773p;

    /* JADX INFO: renamed from: q */
    public C1161c f4774q;

    /* JADX INFO: renamed from: r */
    public AbstractC1214s f4775r;

    /* JADX INFO: renamed from: s */
    public boolean f4776s;

    /* JADX INFO: renamed from: t */
    public final boolean f4777t;

    /* JADX INFO: renamed from: u */
    public boolean f4778u;

    /* JADX INFO: renamed from: v */
    public boolean f4779v;

    /* JADX INFO: renamed from: w */
    public final boolean f4780w;

    /* JADX INFO: renamed from: x */
    public int f4781x;

    /* JADX INFO: renamed from: y */
    public int f4782y;

    /* JADX INFO: renamed from: z */
    public C1162d f4783z;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C1159a {

        /* JADX INFO: renamed from: a */
        public AbstractC1214s f4784a;

        /* JADX INFO: renamed from: b */
        public int f4785b;

        /* JADX INFO: renamed from: c */
        public int f4786c;

        /* JADX INFO: renamed from: d */
        public boolean f4787d;

        /* JADX INFO: renamed from: e */
        public boolean f4788e;

        public C1159a() {
            m2731d();
        }

        /* JADX INFO: renamed from: a */
        public final void m2728a() {
            this.f4786c = this.f4787d ? this.f4784a.mo2984g() : this.f4784a.mo2988k();
        }

        /* JADX INFO: renamed from: b */
        public final void m2729b(View view, int i) {
            if (this.f4787d) {
                int iMo2979b = this.f4784a.mo2979b(view);
                AbstractC1214s abstractC1214s = this.f4784a;
                this.f4786c = (Integer.MIN_VALUE == abstractC1214s.f5192b ? 0 : abstractC1214s.mo2989l() - abstractC1214s.f5192b) + iMo2979b;
            } else {
                this.f4786c = this.f4784a.mo2982e(view);
            }
            this.f4785b = i;
        }

        /* JADX INFO: renamed from: c */
        public final void m2730c(View view, int i) {
            AbstractC1214s abstractC1214s = this.f4784a;
            int iMo2989l = Integer.MIN_VALUE == abstractC1214s.f5192b ? 0 : abstractC1214s.mo2989l() - abstractC1214s.f5192b;
            if (iMo2989l >= 0) {
                m2729b(view, i);
                return;
            }
            this.f4785b = i;
            if (!this.f4787d) {
                int iMo2982e = this.f4784a.mo2982e(view);
                int iMo2988k = iMo2982e - this.f4784a.mo2988k();
                this.f4786c = iMo2982e;
                if (iMo2988k > 0) {
                    int iMo2984g = (this.f4784a.mo2984g() - Math.min(0, (this.f4784a.mo2984g() - iMo2989l) - this.f4784a.mo2979b(view))) - (this.f4784a.mo2980c(view) + iMo2982e);
                    if (iMo2984g < 0) {
                        this.f4786c -= Math.min(iMo2988k, -iMo2984g);
                        return;
                    }
                    return;
                }
                return;
            }
            int iMo2984g2 = (this.f4784a.mo2984g() - iMo2989l) - this.f4784a.mo2979b(view);
            this.f4786c = this.f4784a.mo2984g() - iMo2984g2;
            if (iMo2984g2 > 0) {
                int iMo2980c = this.f4786c - this.f4784a.mo2980c(view);
                int iMo2988k2 = this.f4784a.mo2988k();
                int iMin = iMo2980c - (Math.min(this.f4784a.mo2982e(view) - iMo2988k2, 0) + iMo2988k2);
                if (iMin < 0) {
                    this.f4786c = Math.min(iMo2984g2, -iMin) + this.f4786c;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m2731d() {
            this.f4785b = -1;
            this.f4786c = Integer.MIN_VALUE;
            this.f4787d = false;
            this.f4788e = false;
        }

        public final String toString() {
            return "AnchorInfo{mPosition=" + this.f4785b + ", mCoordinate=" + this.f4786c + ", mLayoutFromEnd=" + this.f4787d + ", mValid=" + this.f4788e + '}';
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C1160b {

        /* JADX INFO: renamed from: a */
        public int f4789a;

        /* JADX INFO: renamed from: b */
        public boolean f4790b;

        /* JADX INFO: renamed from: c */
        public boolean f4791c;

        /* JADX INFO: renamed from: d */
        public boolean f4792d;
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C1161c {

        /* JADX INFO: renamed from: a */
        public boolean f4793a;

        /* JADX INFO: renamed from: b */
        public int f4794b;

        /* JADX INFO: renamed from: c */
        public int f4795c;

        /* JADX INFO: renamed from: d */
        public int f4796d;

        /* JADX INFO: renamed from: e */
        public int f4797e;

        /* JADX INFO: renamed from: f */
        public int f4798f;

        /* JADX INFO: renamed from: g */
        public int f4799g;

        /* JADX INFO: renamed from: h */
        public int f4800h;

        /* JADX INFO: renamed from: i */
        public int f4801i;

        /* JADX INFO: renamed from: j */
        public int f4802j;

        /* JADX INFO: renamed from: k */
        public List<RecyclerView.AbstractC1163A> f4803k;

        /* JADX INFO: renamed from: l */
        public boolean f4804l;

        /* JADX INFO: renamed from: a */
        public final void m2732a(View view) {
            int iM2796b;
            int size = this.f4803k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f4803k.get(i2).f4891a;
                RecyclerView.C1176m c1176m = (RecyclerView.C1176m) view3.getLayoutParams();
                if (view3 != view && !c1176m.f4947a.m2802h() && (iM2796b = (c1176m.f4947a.m2796b() - this.f4796d) * this.f4797e) >= 0 && iM2796b < i) {
                    view2 = view3;
                    if (iM2796b == 0) {
                        break;
                    } else {
                        i = iM2796b;
                    }
                }
            }
            if (view2 == null) {
                this.f4796d = -1;
            } else {
                this.f4796d = ((RecyclerView.C1176m) view2.getLayoutParams()).f4947a.m2796b();
            }
        }

        /* JADX INFO: renamed from: b */
        public final View m2733b(RecyclerView.C1181r c1181r) {
            List<RecyclerView.AbstractC1163A> list = this.f4803k;
            if (list == null) {
                View view = c1181r.m2878k(Long.MAX_VALUE, this.f4796d).f4891a;
                this.f4796d += this.f4797e;
                return view;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view2 = this.f4803k.get(i).f4891a;
                RecyclerView.C1176m c1176m = (RecyclerView.C1176m) view2.getLayoutParams();
                if (!c1176m.f4947a.m2802h() && this.f4796d == c1176m.f4947a.m2796b()) {
                    m2732a(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    @SuppressLint({"BanParcelableUsage"})
    public static class C1162d implements Parcelable {
        public static final Parcelable.Creator<C1162d> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        public int f4805a;

        /* JADX INFO: renamed from: b */
        public int f4806b;

        /* JADX INFO: renamed from: c */
        public boolean f4807c;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        public class a implements Parcelable.Creator<C1162d> {
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final C1162d createFromParcel(Parcel parcel) {
                C1162d c1162d = new C1162d();
                c1162d.f4805a = parcel.readInt();
                c1162d.f4806b = parcel.readInt();
                c1162d.f4807c = parcel.readInt() == 1;
                return c1162d;
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final C1162d[] newArray(int i) {
                return new C1162d[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4805a);
            parcel.writeInt(this.f4806b);
            parcel.writeInt(this.f4807c ? 1 : 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public LinearLayoutManager(int i) {
        this.f4773p = 1;
        this.f4777t = false;
        this.f4778u = false;
        this.f4779v = false;
        this.f4780w = true;
        this.f4781x = -1;
        this.f4782y = Integer.MIN_VALUE;
        this.f4783z = null;
        this.f4769A = new C1159a();
        this.f4770B = new C1160b();
        this.f4771C = 2;
        this.f4772D = new int[2];
        m2712b1(i);
        mo2713c(null);
        if (this.f4777t) {
            this.f4777t = false;
            m2854n0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: B0 */
    public boolean mo2647B0() {
        return this.f4783z == null && this.f4776s == this.f4779v;
    }

    /* JADX INFO: renamed from: C0 */
    public void mo2687C0(RecyclerView.C1186w c1186w, int[] iArr) {
        int i;
        int iMo2989l = c1186w.f4983a != -1 ? this.f4775r.mo2989l() : 0;
        if (this.f4774q.f4798f == -1) {
            i = 0;
        } else {
            i = iMo2989l;
            iMo2989l = 0;
        }
        iArr[0] = iMo2989l;
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: D0 */
    public void mo2648D0(RecyclerView.C1186w c1186w, C1161c c1161c, RunnableC1208m.b bVar) {
        int i = c1161c.f4796d;
        if (i < 0 || i >= c1186w.m2887b()) {
            return;
        }
        bVar.m2975a(i, Math.max(0, c1161c.f4799g));
    }

    /* JADX INFO: renamed from: E0 */
    public final int m2688E0(RecyclerView.C1186w c1186w) {
        if (m2860v() == 0) {
            return 0;
        }
        m2692I0();
        AbstractC1214s abstractC1214s = this.f4775r;
        boolean z = !this.f4780w;
        return C1220y.m3004a(c1186w, abstractC1214s, m2696L0(z), m2694K0(z), this, this.f4780w);
    }

    /* JADX INFO: renamed from: F0 */
    public final int m2689F0(RecyclerView.C1186w c1186w) {
        if (m2860v() == 0) {
            return 0;
        }
        m2692I0();
        AbstractC1214s abstractC1214s = this.f4775r;
        boolean z = !this.f4780w;
        return C1220y.m3005b(c1186w, abstractC1214s, m2696L0(z), m2694K0(z), this, this.f4780w, this.f4778u);
    }

    /* JADX INFO: renamed from: G0 */
    public final int m2690G0(RecyclerView.C1186w c1186w) {
        if (m2860v() == 0) {
            return 0;
        }
        m2692I0();
        AbstractC1214s abstractC1214s = this.f4775r;
        boolean z = !this.f4780w;
        return C1220y.m3006c(c1186w, abstractC1214s, m2696L0(z), m2694K0(z), this, this.f4780w);
    }

    /* JADX INFO: renamed from: H0 */
    public final int m2691H0(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f4773p == 1) ? 1 : Integer.MIN_VALUE : this.f4773p == 0 ? 1 : Integer.MIN_VALUE : this.f4773p == 1 ? -1 : Integer.MIN_VALUE : this.f4773p == 0 ? -1 : Integer.MIN_VALUE : (this.f4773p != 1 && m2706U0()) ? -1 : 1 : (this.f4773p != 1 && m2706U0()) ? 1 : -1;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m2692I0() {
        if (this.f4774q == null) {
            C1161c c1161c = new C1161c();
            c1161c.f4793a = true;
            c1161c.f4800h = 0;
            c1161c.f4801i = 0;
            c1161c.f4803k = null;
            this.f4774q = c1161c;
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final int m2693J0(RecyclerView.C1181r c1181r, C1161c c1161c, RecyclerView.C1186w c1186w, boolean z) {
        int i;
        int i2 = c1161c.f4795c;
        int i3 = c1161c.f4799g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c1161c.f4799g = i3 + i2;
            }
            m2707X0(c1181r, c1161c);
        }
        int i4 = c1161c.f4795c + c1161c.f4800h;
        while (true) {
            if ((!c1161c.f4804l && i4 <= 0) || (i = c1161c.f4796d) < 0 || i >= c1186w.m2887b()) {
                break;
            }
            C1160b c1160b = this.f4770B;
            c1160b.f4789a = 0;
            c1160b.f4790b = false;
            c1160b.f4791c = false;
            c1160b.f4792d = false;
            mo2653V0(c1181r, c1186w, c1161c, c1160b);
            if (!c1160b.f4790b) {
                int i5 = c1161c.f4794b;
                int i6 = c1160b.f4789a;
                c1161c.f4794b = (c1161c.f4798f * i6) + i5;
                if (!c1160b.f4791c || c1161c.f4803k != null || !c1186w.f4989g) {
                    c1161c.f4795c -= i6;
                    i4 -= i6;
                }
                int i7 = c1161c.f4799g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c1161c.f4799g = i8;
                    int i9 = c1161c.f4795c;
                    if (i9 < 0) {
                        c1161c.f4799g = i8 + i9;
                    }
                    m2707X0(c1181r, c1161c);
                }
                if (z && c1160b.f4792d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c1161c.f4795c;
    }

    /* JADX INFO: renamed from: K0 */
    public final View m2694K0(boolean z) {
        return this.f4778u ? m2699O0(0, m2860v(), z) : m2699O0(m2860v() - 1, -1, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: L */
    public final boolean mo2695L() {
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    public final View m2696L0(boolean z) {
        return this.f4778u ? m2699O0(m2860v() - 1, -1, z) : m2699O0(0, m2860v(), z);
    }

    /* JADX INFO: renamed from: M0 */
    public final int m2697M0() {
        View viewM2699O0 = m2699O0(m2860v() - 1, -1, false);
        if (viewM2699O0 == null) {
            return -1;
        }
        return RecyclerView.AbstractC1175l.m2827H(viewM2699O0);
    }

    /* JADX INFO: renamed from: N0 */
    public final View m2698N0(int i, int i2) {
        int i3;
        int i4;
        m2692I0();
        if (i2 <= i && i2 >= i) {
            return m2858u(i);
        }
        if (this.f4775r.mo2982e(m2858u(i)) < this.f4775r.mo2988k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f4773p == 0 ? this.f4928c.m2634a(i, i2, i3, i4) : this.f4929d.m2634a(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: O0 */
    public final View m2699O0(int i, int i2, boolean z) {
        m2692I0();
        int i3 = z ? 24579 : 320;
        return this.f4773p == 0 ? this.f4928c.m2634a(i, i2, i3, 320) : this.f4929d.m2634a(i, i2, i3, 320);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX INFO: renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View mo2650P0(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w, boolean z, boolean z2) {
        int i;
        int iM2860v;
        int i2;
        m2692I0();
        int iM2860v2 = m2860v();
        if (z2) {
            iM2860v = m2860v() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM2860v2;
            iM2860v = 0;
            i2 = 1;
        }
        int iM2887b = c1186w.m2887b();
        int iMo2988k = this.f4775r.mo2988k();
        int iMo2984g = this.f4775r.mo2984g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM2860v != i) {
            View viewM2858u = m2858u(iM2860v);
            int iM2827H = RecyclerView.AbstractC1175l.m2827H(viewM2858u);
            int iMo2982e = this.f4775r.mo2982e(viewM2858u);
            int iMo2979b = this.f4775r.mo2979b(viewM2858u);
            if (iM2827H >= 0 && iM2827H < iM2887b) {
                if (!((RecyclerView.C1176m) viewM2858u.getLayoutParams()).f4947a.m2802h()) {
                    boolean z3 = iMo2979b <= iMo2988k && iMo2982e < iMo2988k;
                    boolean z4 = iMo2982e >= iMo2984g && iMo2979b > iMo2984g;
                    if (!z3 && !z4) {
                        return viewM2858u;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewM2858u;
                        } else if (view == null) {
                            view = viewM2858u;
                        }
                    } else if (!z3) {
                        if (view == null) {
                        }
                    }
                } else if (view3 == null) {
                    view3 = viewM2858u;
                }
            }
            iM2860v += i2;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    /* JADX INFO: renamed from: Q0 */
    public final int m2700Q0(int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w, boolean z) {
        int iMo2984g;
        int iMo2984g2 = this.f4775r.mo2984g() - i;
        if (iMo2984g2 <= 0) {
            return 0;
        }
        int i2 = -m2711a1(-iMo2984g2, c1181r, c1186w);
        int i3 = i + i2;
        if (!z || (iMo2984g = this.f4775r.mo2984g() - i3) <= 0) {
            return i2;
        }
        this.f4775r.mo2992o(iMo2984g);
        return iMo2984g + i2;
    }

    /* JADX INFO: renamed from: R0 */
    public final int m2701R0(int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w, boolean z) {
        int iMo2988k;
        int iMo2988k2 = i - this.f4775r.mo2988k();
        if (iMo2988k2 <= 0) {
            return 0;
        }
        int i2 = -m2711a1(iMo2988k2, c1181r, c1186w);
        int i3 = i + i2;
        if (!z || (iMo2988k = i3 - this.f4775r.mo2988k()) <= 0) {
            return i2;
        }
        this.f4775r.mo2992o(-iMo2988k);
        return i2 - iMo2988k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: S */
    public final void mo2702S(RecyclerView recyclerView) {
    }

    /* JADX INFO: renamed from: S0 */
    public final View m2703S0() {
        return m2858u(this.f4778u ? 0 : m2860v() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: T */
    public View mo2651T(View view, int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        int iM2691H0;
        m2709Z0();
        if (m2860v() != 0 && (iM2691H0 = m2691H0(i)) != Integer.MIN_VALUE) {
            m2692I0();
            m2715d1(iM2691H0, (int) (this.f4775r.mo2989l() * 0.33333334f), false, c1186w);
            C1161c c1161c = this.f4774q;
            c1161c.f4799g = Integer.MIN_VALUE;
            c1161c.f4793a = false;
            m2693J0(c1181r, c1161c, c1186w, true);
            View viewM2698N0 = iM2691H0 == -1 ? this.f4778u ? m2698N0(m2860v() - 1, -1) : m2698N0(0, m2860v()) : this.f4778u ? m2698N0(0, m2860v()) : m2698N0(m2860v() - 1, -1);
            View viewM2704T0 = iM2691H0 == -1 ? m2704T0() : m2703S0();
            if (!viewM2704T0.hasFocusable()) {
                return viewM2698N0;
            }
            if (viewM2698N0 != null) {
                return viewM2704T0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: T0 */
    public final View m2704T0() {
        return m2858u(this.f4778u ? m2860v() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: U */
    public final void mo2705U(AccessibilityEvent accessibilityEvent) {
        super.mo2705U(accessibilityEvent);
        if (m2860v() > 0) {
            View viewM2699O0 = m2699O0(0, m2860v(), false);
            accessibilityEvent.setFromIndex(viewM2699O0 == null ? -1 : RecyclerView.AbstractC1175l.m2827H(viewM2699O0));
            accessibilityEvent.setToIndex(m2697M0());
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final boolean m2706U0() {
        return m2836C() == 1;
    }

    /* JADX INFO: renamed from: V0 */
    public void mo2653V0(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w, C1161c c1161c, C1160b c1160b) {
        int iM2838E;
        int i;
        int i2;
        int iMo2981d;
        View viewM2733b = c1161c.m2733b(c1181r);
        if (viewM2733b == null) {
            c1160b.f4790b = true;
            return;
        }
        RecyclerView.C1176m c1176m = (RecyclerView.C1176m) viewM2733b.getLayoutParams();
        if (c1161c.f4803k == null) {
            if (this.f4778u == (c1161c.f4798f == -1)) {
                m2847b(viewM2733b, -1, false);
            } else {
                m2847b(viewM2733b, 0, false);
            }
        } else {
            if (this.f4778u == (c1161c.f4798f == -1)) {
                m2847b(viewM2733b, -1, true);
            } else {
                m2847b(viewM2733b, 0, true);
            }
        }
        RecyclerView.C1176m c1176m2 = (RecyclerView.C1176m) viewM2733b.getLayoutParams();
        Rect rectM2754M = this.f4927b.m2754M(viewM2733b);
        int i3 = rectM2754M.left + rectM2754M.right;
        int i4 = rectM2754M.top + rectM2754M.bottom;
        int iM2832w = RecyclerView.AbstractC1175l.m2832w(mo2714d(), this.f4939n, this.f4937l, m2839F() + m2838E() + ((ViewGroup.MarginLayoutParams) c1176m2).leftMargin + ((ViewGroup.MarginLayoutParams) c1176m2).rightMargin + i3, ((ViewGroup.MarginLayoutParams) c1176m2).width);
        int iM2832w2 = RecyclerView.AbstractC1175l.m2832w(mo2716e(), this.f4940o, this.f4938m, m2837D() + m2840G() + ((ViewGroup.MarginLayoutParams) c1176m2).topMargin + ((ViewGroup.MarginLayoutParams) c1176m2).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) c1176m2).height);
        if (m2862w0(viewM2733b, iM2832w, iM2832w2, c1176m2)) {
            viewM2733b.measure(iM2832w, iM2832w2);
        }
        c1160b.f4789a = this.f4775r.mo2980c(viewM2733b);
        if (this.f4773p == 1) {
            if (m2706U0()) {
                iMo2981d = this.f4939n - m2839F();
                iM2838E = iMo2981d - this.f4775r.mo2981d(viewM2733b);
            } else {
                iM2838E = m2838E();
                iMo2981d = this.f4775r.mo2981d(viewM2733b) + iM2838E;
            }
            if (c1161c.f4798f == -1) {
                i = c1161c.f4794b;
                i2 = i - c1160b.f4789a;
            } else {
                i2 = c1161c.f4794b;
                i = c1160b.f4789a + i2;
            }
        } else {
            int iM2840G = m2840G();
            int iMo2981d2 = this.f4775r.mo2981d(viewM2733b) + iM2840G;
            if (c1161c.f4798f == -1) {
                int i5 = c1161c.f4794b;
                int i6 = i5 - c1160b.f4789a;
                iMo2981d = i5;
                i = iMo2981d2;
                iM2838E = i6;
                i2 = iM2840G;
            } else {
                int i7 = c1161c.f4794b;
                int i8 = c1160b.f4789a + i7;
                iM2838E = i7;
                i = iMo2981d2;
                i2 = iM2840G;
                iMo2981d = i8;
            }
        }
        RecyclerView.AbstractC1175l.m2830N(viewM2733b, iM2838E, i2, iMo2981d, i);
        if (c1176m.f4947a.m2802h() || c1176m.f4947a.m2805k()) {
            c1160b.f4791c = true;
        }
        c1160b.f4792d = viewM2733b.hasFocusable();
    }

    /* JADX INFO: renamed from: W0 */
    public void mo2654W0(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w, C1159a c1159a, int i) {
    }

    /* JADX INFO: renamed from: X0 */
    public final void m2707X0(RecyclerView.C1181r c1181r, C1161c c1161c) {
        if (!c1161c.f4793a || c1161c.f4804l) {
            return;
        }
        int i = c1161c.f4799g;
        int i2 = c1161c.f4801i;
        if (c1161c.f4798f == -1) {
            int iM2860v = m2860v();
            if (i < 0) {
                return;
            }
            int iMo2983f = (this.f4775r.mo2983f() - i) + i2;
            if (this.f4778u) {
                for (int i3 = 0; i3 < iM2860v; i3++) {
                    View viewM2858u = m2858u(i3);
                    if (this.f4775r.mo2982e(viewM2858u) < iMo2983f || this.f4775r.mo2991n(viewM2858u) < iMo2983f) {
                        m2708Y0(c1181r, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM2860v - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM2858u2 = m2858u(i5);
                if (this.f4775r.mo2982e(viewM2858u2) < iMo2983f || this.f4775r.mo2991n(viewM2858u2) < iMo2983f) {
                    m2708Y0(c1181r, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM2860v2 = m2860v();
        if (!this.f4778u) {
            for (int i7 = 0; i7 < iM2860v2; i7++) {
                View viewM2858u3 = m2858u(i7);
                if (this.f4775r.mo2979b(viewM2858u3) > i6 || this.f4775r.mo2990m(viewM2858u3) > i6) {
                    m2708Y0(c1181r, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM2860v2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM2858u4 = m2858u(i9);
            if (this.f4775r.mo2979b(viewM2858u4) > i6 || this.f4775r.mo2990m(viewM2858u4) > i6) {
                m2708Y0(c1181r, i8, i9);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m2708Y0(RecyclerView.C1181r c1181r, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewM2858u = m2858u(i);
                m2852l0(i);
                c1181r.m2875h(viewM2858u);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewM2858u2 = m2858u(i3);
            m2852l0(i3);
            c1181r.m2875h(viewM2858u2);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m2709Z0() {
        if (this.f4773p == 1 || !m2706U0()) {
            this.f4778u = this.f4777t;
        } else {
            this.f4778u = !this.f4777t;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1185v.b
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: a */
    public final PointF mo2710a(int i) {
        if (m2860v() == 0) {
            return null;
        }
        int i2 = (i < RecyclerView.AbstractC1175l.m2827H(m2858u(0))) != this.f4778u ? -1 : 1;
        return this.f4773p == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    /* JADX INFO: renamed from: a1 */
    public final int m2711a1(int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        if (m2860v() != 0 && i != 0) {
            m2692I0();
            this.f4774q.f4793a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            m2715d1(i2, iAbs, true, c1186w);
            C1161c c1161c = this.f4774q;
            int iM2693J0 = m2693J0(c1181r, c1161c, c1186w, false) + c1161c.f4799g;
            if (iM2693J0 >= 0) {
                if (iAbs > iM2693J0) {
                    i = i2 * iM2693J0;
                }
                this.f4775r.mo2992o(-i);
                this.f4774q.f4802j = i;
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m2712b1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(C0944z.m2225e("invalid orientation:", i));
        }
        mo2713c(null);
        if (i != this.f4773p || this.f4775r == null) {
            AbstractC1214s abstractC1214sM2993a = AbstractC1214s.m2993a(this, i);
            this.f4775r = abstractC1214sM2993a;
            this.f4769A.f4784a = abstractC1214sM2993a;
            this.f4773p = i;
            m2854n0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: c */
    public final void mo2713c(String str) {
        if (this.f4783z == null) {
            super.mo2713c(str);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public void mo2661c1(boolean z) {
        mo2713c(null);
        if (this.f4779v == z) {
            return;
        }
        this.f4779v = z;
        m2854n0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: d */
    public final boolean mo2714d() {
        return this.f4773p == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0192  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2662d0(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        View focusedChild;
        View focusedChild2;
        View viewMo2650P0;
        int i;
        int iMo2982e;
        int i2;
        int i3;
        List<RecyclerView.AbstractC1163A> list;
        int i4;
        int i5;
        int iM2700Q0;
        int i6;
        View viewMo2726q;
        int iMo2982e2;
        int iMo2984g;
        int i7;
        int i8 = -1;
        if (!(this.f4783z == null && this.f4781x == -1) && c1186w.m2887b() == 0) {
            m2849i0(c1181r);
            return;
        }
        C1162d c1162d = this.f4783z;
        if (c1162d != null && (i7 = c1162d.f4805a) >= 0) {
            this.f4781x = i7;
        }
        m2692I0();
        this.f4774q.f4793a = false;
        m2709Z0();
        RecyclerView recyclerView = this.f4927b;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f4926a.f5067c.contains(focusedChild)) {
            focusedChild = null;
        }
        C1159a c1159a = this.f4769A;
        if (!c1159a.f4788e || this.f4781x != -1 || this.f4783z != null) {
            c1159a.m2731d();
            c1159a.f4787d = this.f4778u ^ this.f4779v;
            if (c1186w.f4989g || (i = this.f4781x) == -1) {
                if (m2860v() != 0) {
                    RecyclerView recyclerView2 = this.f4927b;
                    if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || this.f4926a.f5067c.contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        RecyclerView.C1176m c1176m = (RecyclerView.C1176m) focusedChild2.getLayoutParams();
                        if (c1176m.f4947a.m2802h() || c1176m.f4947a.m2796b() < 0 || c1176m.f4947a.m2796b() >= c1186w.m2887b()) {
                            boolean z = this.f4776s;
                            boolean z2 = this.f4779v;
                            if (z == z2 && (viewMo2650P0 = mo2650P0(c1181r, c1186w, c1159a.f4787d, z2)) != null) {
                                c1159a.m2729b(viewMo2650P0, RecyclerView.AbstractC1175l.m2827H(viewMo2650P0));
                                if (!c1186w.f4989g && mo2647B0()) {
                                    int iMo2982e3 = this.f4775r.mo2982e(viewMo2650P0);
                                    int iMo2979b = this.f4775r.mo2979b(viewMo2650P0);
                                    int iMo2988k = this.f4775r.mo2988k();
                                    int iMo2984g2 = this.f4775r.mo2984g();
                                    boolean z3 = iMo2979b <= iMo2988k && iMo2982e3 < iMo2988k;
                                    boolean z4 = iMo2982e3 >= iMo2984g2 && iMo2979b > iMo2984g2;
                                    if (z3 || z4) {
                                        if (c1159a.f4787d) {
                                            iMo2988k = iMo2984g2;
                                        }
                                        c1159a.f4786c = iMo2988k;
                                    }
                                }
                            } else {
                                c1159a.m2728a();
                                c1159a.f4785b = this.f4779v ? c1186w.m2887b() - 1 : 0;
                            }
                        } else {
                            c1159a.m2730c(focusedChild2, RecyclerView.AbstractC1175l.m2827H(focusedChild2));
                        }
                        c1159a.f4788e = true;
                    }
                }
            } else if (i < 0 || i >= c1186w.m2887b()) {
                this.f4781x = -1;
                this.f4782y = Integer.MIN_VALUE;
                if (m2860v() != 0) {
                }
            } else {
                int i9 = this.f4781x;
                c1159a.f4785b = i9;
                C1162d c1162d2 = this.f4783z;
                if (c1162d2 != null && c1162d2.f4805a >= 0) {
                    boolean z5 = c1162d2.f4807c;
                    c1159a.f4787d = z5;
                    if (z5) {
                        c1159a.f4786c = this.f4775r.mo2984g() - this.f4783z.f4806b;
                    } else {
                        c1159a.f4786c = this.f4775r.mo2988k() + this.f4783z.f4806b;
                    }
                } else if (this.f4782y == Integer.MIN_VALUE) {
                    View viewMo2726q2 = mo2726q(i9);
                    if (viewMo2726q2 == null) {
                        if (m2860v() > 0) {
                            c1159a.f4787d = (this.f4781x < RecyclerView.AbstractC1175l.m2827H(m2858u(0))) == this.f4778u;
                        }
                        c1159a.m2728a();
                    } else if (this.f4775r.mo2980c(viewMo2726q2) > this.f4775r.mo2989l()) {
                        c1159a.m2728a();
                    } else if (this.f4775r.mo2982e(viewMo2726q2) - this.f4775r.mo2988k() < 0) {
                        c1159a.f4786c = this.f4775r.mo2988k();
                        c1159a.f4787d = false;
                    } else if (this.f4775r.mo2984g() - this.f4775r.mo2979b(viewMo2726q2) < 0) {
                        c1159a.f4786c = this.f4775r.mo2984g();
                        c1159a.f4787d = true;
                    } else {
                        if (c1159a.f4787d) {
                            int iMo2979b2 = this.f4775r.mo2979b(viewMo2726q2);
                            AbstractC1214s abstractC1214s = this.f4775r;
                            iMo2982e = (Integer.MIN_VALUE == abstractC1214s.f5192b ? 0 : abstractC1214s.mo2989l() - abstractC1214s.f5192b) + iMo2979b2;
                        } else {
                            iMo2982e = this.f4775r.mo2982e(viewMo2726q2);
                        }
                        c1159a.f4786c = iMo2982e;
                    }
                } else {
                    boolean z6 = this.f4778u;
                    c1159a.f4787d = z6;
                    if (z6) {
                        c1159a.f4786c = this.f4775r.mo2984g() - this.f4782y;
                    } else {
                        c1159a.f4786c = this.f4775r.mo2988k() + this.f4782y;
                    }
                }
                c1159a.f4788e = true;
            }
        } else if (focusedChild != null && (this.f4775r.mo2982e(focusedChild) >= this.f4775r.mo2984g() || this.f4775r.mo2979b(focusedChild) <= this.f4775r.mo2988k())) {
            c1159a.m2730c(focusedChild, RecyclerView.AbstractC1175l.m2827H(focusedChild));
        }
        C1161c c1161c = this.f4774q;
        c1161c.f4798f = c1161c.f4802j >= 0 ? 1 : -1;
        int[] iArr = this.f4772D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo2687C0(c1186w, iArr);
        int iMo2988k2 = this.f4775r.mo2988k() + Math.max(0, iArr[0]);
        int iMo2985h = this.f4775r.mo2985h() + Math.max(0, iArr[1]);
        if (c1186w.f4989g && (i6 = this.f4781x) != -1 && this.f4782y != Integer.MIN_VALUE && (viewMo2726q = mo2726q(i6)) != null) {
            if (this.f4778u) {
                iMo2984g = this.f4775r.mo2984g() - this.f4775r.mo2979b(viewMo2726q);
                iMo2982e2 = this.f4782y;
            } else {
                iMo2982e2 = this.f4775r.mo2982e(viewMo2726q) - this.f4775r.mo2988k();
                iMo2984g = this.f4782y;
            }
            int i10 = iMo2984g - iMo2982e2;
            if (i10 > 0) {
                iMo2988k2 += i10;
            } else {
                iMo2985h -= i10;
            }
        }
        if (!c1159a.f4787d ? !this.f4778u : this.f4778u) {
            i8 = 1;
        }
        mo2654W0(c1181r, c1186w, c1159a, i8);
        m2855p(c1181r);
        this.f4774q.f4804l = this.f4775r.mo2986i() == 0 && this.f4775r.mo2983f() == 0;
        this.f4774q.getClass();
        this.f4774q.f4801i = 0;
        if (c1159a.f4787d) {
            m2719f1(c1159a.f4785b, c1159a.f4786c);
            C1161c c1161c2 = this.f4774q;
            c1161c2.f4800h = iMo2988k2;
            m2693J0(c1181r, c1161c2, c1186w, false);
            C1161c c1161c3 = this.f4774q;
            i3 = c1161c3.f4794b;
            int i11 = c1161c3.f4796d;
            int i12 = c1161c3.f4795c;
            if (i12 > 0) {
                iMo2985h += i12;
            }
            m2717e1(c1159a.f4785b, c1159a.f4786c);
            C1161c c1161c4 = this.f4774q;
            c1161c4.f4800h = iMo2985h;
            c1161c4.f4796d += c1161c4.f4797e;
            m2693J0(c1181r, c1161c4, c1186w, false);
            C1161c c1161c5 = this.f4774q;
            i2 = c1161c5.f4794b;
            int i13 = c1161c5.f4795c;
            if (i13 > 0) {
                m2719f1(i11, i3);
                C1161c c1161c6 = this.f4774q;
                c1161c6.f4800h = i13;
                m2693J0(c1181r, c1161c6, c1186w, false);
                i3 = this.f4774q.f4794b;
            }
        } else {
            m2717e1(c1159a.f4785b, c1159a.f4786c);
            C1161c c1161c7 = this.f4774q;
            c1161c7.f4800h = iMo2985h;
            m2693J0(c1181r, c1161c7, c1186w, false);
            C1161c c1161c8 = this.f4774q;
            i2 = c1161c8.f4794b;
            int i14 = c1161c8.f4796d;
            int i15 = c1161c8.f4795c;
            if (i15 > 0) {
                iMo2988k2 += i15;
            }
            m2719f1(c1159a.f4785b, c1159a.f4786c);
            C1161c c1161c9 = this.f4774q;
            c1161c9.f4800h = iMo2988k2;
            c1161c9.f4796d += c1161c9.f4797e;
            m2693J0(c1181r, c1161c9, c1186w, false);
            C1161c c1161c10 = this.f4774q;
            int i16 = c1161c10.f4794b;
            int i17 = c1161c10.f4795c;
            if (i17 > 0) {
                m2717e1(i14, i2);
                C1161c c1161c11 = this.f4774q;
                c1161c11.f4800h = i17;
                m2693J0(c1181r, c1161c11, c1186w, false);
                i2 = this.f4774q.f4794b;
            }
            i3 = i16;
        }
        if (m2860v() > 0) {
            if (this.f4778u ^ this.f4779v) {
                int iM2700Q02 = m2700Q0(i2, c1181r, c1186w, true);
                i4 = i3 + iM2700Q02;
                i5 = i2 + iM2700Q02;
                iM2700Q0 = m2701R0(i4, c1181r, c1186w, false);
            } else {
                int iM2701R0 = m2701R0(i3, c1181r, c1186w, true);
                i4 = i3 + iM2701R0;
                i5 = i2 + iM2701R0;
                iM2700Q0 = m2700Q0(i5, c1181r, c1186w, false);
            }
            i3 = i4 + iM2700Q0;
            i2 = i5 + iM2700Q0;
        }
        if (c1186w.f4993k && m2860v() != 0 && !c1186w.f4989g && mo2647B0()) {
            List<RecyclerView.AbstractC1163A> list2 = c1181r.f4961d;
            int size = list2.size();
            int iM2827H = RecyclerView.AbstractC1175l.m2827H(m2858u(0));
            int iMo2980c = 0;
            int iMo2980c2 = 0;
            for (int i18 = 0; i18 < size; i18++) {
                RecyclerView.AbstractC1163A abstractC1163A = list2.get(i18);
                if (!abstractC1163A.m2802h()) {
                    boolean z7 = abstractC1163A.m2796b() < iM2827H;
                    boolean z8 = this.f4778u;
                    View view = abstractC1163A.f4891a;
                    if (z7 != z8) {
                        iMo2980c += this.f4775r.mo2980c(view);
                    } else {
                        iMo2980c2 += this.f4775r.mo2980c(view);
                    }
                }
            }
            this.f4774q.f4803k = list2;
            if (iMo2980c > 0) {
                m2719f1(RecyclerView.AbstractC1175l.m2827H(m2704T0()), i3);
                C1161c c1161c12 = this.f4774q;
                c1161c12.f4800h = iMo2980c;
                c1161c12.f4795c = 0;
                c1161c12.m2732a(null);
                m2693J0(c1181r, this.f4774q, c1186w, false);
            }
            if (iMo2980c2 > 0) {
                m2717e1(RecyclerView.AbstractC1175l.m2827H(m2703S0()), i2);
                C1161c c1161c13 = this.f4774q;
                c1161c13.f4800h = iMo2980c2;
                c1161c13.f4795c = 0;
                list = null;
                c1161c13.m2732a(null);
                m2693J0(c1181r, this.f4774q, c1186w, false);
            } else {
                list = null;
            }
            this.f4774q.f4803k = list;
        }
        if (c1186w.f4989g) {
            c1159a.m2731d();
        } else {
            AbstractC1214s abstractC1214s2 = this.f4775r;
            abstractC1214s2.f5192b = abstractC1214s2.mo2989l();
        }
        this.f4776s = this.f4779v;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m2715d1(int i, int i2, boolean z, RecyclerView.C1186w c1186w) {
        int iMo2988k;
        this.f4774q.f4804l = this.f4775r.mo2986i() == 0 && this.f4775r.mo2983f() == 0;
        this.f4774q.f4798f = i;
        int[] iArr = this.f4772D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo2687C0(c1186w, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        C1161c c1161c = this.f4774q;
        int i3 = z2 ? iMax2 : iMax;
        c1161c.f4800h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c1161c.f4801i = iMax;
        if (z2) {
            c1161c.f4800h = this.f4775r.mo2985h() + i3;
            View viewM2703S0 = m2703S0();
            C1161c c1161c2 = this.f4774q;
            c1161c2.f4797e = this.f4778u ? -1 : 1;
            int iM2827H = RecyclerView.AbstractC1175l.m2827H(viewM2703S0);
            C1161c c1161c3 = this.f4774q;
            c1161c2.f4796d = iM2827H + c1161c3.f4797e;
            c1161c3.f4794b = this.f4775r.mo2979b(viewM2703S0);
            iMo2988k = this.f4775r.mo2979b(viewM2703S0) - this.f4775r.mo2984g();
        } else {
            View viewM2704T0 = m2704T0();
            C1161c c1161c4 = this.f4774q;
            c1161c4.f4800h = this.f4775r.mo2988k() + c1161c4.f4800h;
            C1161c c1161c5 = this.f4774q;
            c1161c5.f4797e = this.f4778u ? 1 : -1;
            int iM2827H2 = RecyclerView.AbstractC1175l.m2827H(viewM2704T0);
            C1161c c1161c6 = this.f4774q;
            c1161c5.f4796d = iM2827H2 + c1161c6.f4797e;
            c1161c6.f4794b = this.f4775r.mo2982e(viewM2704T0);
            iMo2988k = (-this.f4775r.mo2982e(viewM2704T0)) + this.f4775r.mo2988k();
        }
        C1161c c1161c7 = this.f4774q;
        c1161c7.f4795c = i2;
        if (z) {
            c1161c7.f4795c = i2 - iMo2988k;
        }
        c1161c7.f4799g = iMo2988k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: e */
    public final boolean mo2716e() {
        return this.f4773p == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: e0 */
    public void mo2663e0(RecyclerView.C1186w c1186w) {
        this.f4783z = null;
        this.f4781x = -1;
        this.f4782y = Integer.MIN_VALUE;
        this.f4769A.m2731d();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m2717e1(int i, int i2) {
        this.f4774q.f4795c = this.f4775r.mo2984g() - i2;
        C1161c c1161c = this.f4774q;
        c1161c.f4797e = this.f4778u ? -1 : 1;
        c1161c.f4796d = i;
        c1161c.f4798f = 1;
        c1161c.f4794b = i2;
        c1161c.f4799g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: f0 */
    public final void mo2718f0(Parcelable parcelable) {
        if (parcelable instanceof C1162d) {
            C1162d c1162d = (C1162d) parcelable;
            this.f4783z = c1162d;
            if (this.f4781x != -1) {
                c1162d.f4805a = -1;
            }
            m2854n0();
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m2719f1(int i, int i2) {
        this.f4774q.f4795c = i2 - this.f4775r.mo2988k();
        C1161c c1161c = this.f4774q;
        c1161c.f4796d = i;
        c1161c.f4797e = this.f4778u ? 1 : -1;
        c1161c.f4798f = -1;
        c1161c.f4794b = i2;
        c1161c.f4799g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: g0 */
    public final Parcelable mo2720g0() {
        C1162d c1162d = this.f4783z;
        if (c1162d != null) {
            C1162d c1162d2 = new C1162d();
            c1162d2.f4805a = c1162d.f4805a;
            c1162d2.f4806b = c1162d.f4806b;
            c1162d2.f4807c = c1162d.f4807c;
            return c1162d2;
        }
        C1162d c1162d3 = new C1162d();
        if (m2860v() <= 0) {
            c1162d3.f4805a = -1;
            return c1162d3;
        }
        m2692I0();
        boolean z = this.f4776s ^ this.f4778u;
        c1162d3.f4807c = z;
        if (z) {
            View viewM2703S0 = m2703S0();
            c1162d3.f4806b = this.f4775r.mo2984g() - this.f4775r.mo2979b(viewM2703S0);
            c1162d3.f4805a = RecyclerView.AbstractC1175l.m2827H(viewM2703S0);
            return c1162d3;
        }
        View viewM2704T0 = m2704T0();
        c1162d3.f4805a = RecyclerView.AbstractC1175l.m2827H(viewM2704T0);
        c1162d3.f4806b = this.f4775r.mo2982e(viewM2704T0) - this.f4775r.mo2988k();
        return c1162d3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: h */
    public final void mo2721h(int i, int i2, RecyclerView.C1186w c1186w, RunnableC1208m.b bVar) {
        if (this.f4773p != 0) {
            i = i2;
        }
        if (m2860v() == 0 || i == 0) {
            return;
        }
        m2692I0();
        m2715d1(i > 0 ? 1 : -1, Math.abs(i), true, c1186w);
        mo2648D0(c1186w, this.f4774q, bVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: i */
    public final void mo2722i(int i, RunnableC1208m.b bVar) {
        boolean z;
        int i2;
        C1162d c1162d = this.f4783z;
        if (c1162d == null || (i2 = c1162d.f4805a) < 0) {
            m2709Z0();
            z = this.f4778u;
            i2 = this.f4781x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = c1162d.f4807c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f4771C && i2 >= 0 && i2 < i; i4++) {
            bVar.m2975a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: j */
    public final int mo2723j(RecyclerView.C1186w c1186w) {
        return m2688E0(c1186w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: k */
    public int mo2669k(RecyclerView.C1186w c1186w) {
        return m2689F0(c1186w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: l */
    public int mo2671l(RecyclerView.C1186w c1186w) {
        return m2690G0(c1186w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: m */
    public final int mo2724m(RecyclerView.C1186w c1186w) {
        return m2688E0(c1186w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: n */
    public int mo2674n(RecyclerView.C1186w c1186w) {
        return m2689F0(c1186w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: o */
    public int mo2676o(RecyclerView.C1186w c1186w) {
        return m2690G0(c1186w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: o0 */
    public int mo2677o0(int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        if (this.f4773p == 1) {
            return 0;
        }
        return m2711a1(i, c1181r, c1186w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: p0 */
    public final void mo2725p0(int i) {
        this.f4781x = i;
        this.f4782y = Integer.MIN_VALUE;
        C1162d c1162d = this.f4783z;
        if (c1162d != null) {
            c1162d.f4805a = -1;
        }
        m2854n0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: q */
    public final View mo2726q(int i) {
        int iM2860v = m2860v();
        if (iM2860v == 0) {
            return null;
        }
        int iM2827H = i - RecyclerView.AbstractC1175l.m2827H(m2858u(0));
        if (iM2827H >= 0 && iM2827H < iM2860v) {
            View viewM2858u = m2858u(iM2827H);
            if (RecyclerView.AbstractC1175l.m2827H(viewM2858u) == i) {
                return viewM2858u;
            }
        }
        return super.mo2726q(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: q0 */
    public int mo2679q0(int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        if (this.f4773p == 0) {
            return 0;
        }
        return m2711a1(i, c1181r, c1186w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: r */
    public RecyclerView.C1176m mo2680r() {
        return new RecyclerView.C1176m(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: x0 */
    public final boolean mo2727x0() {
        if (this.f4938m != 1073741824 && this.f4937l != 1073741824) {
            int iM2860v = m2860v();
            for (int i = 0; i < iM2860v; i++) {
                ViewGroup.LayoutParams layoutParams = m2858u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    @SuppressLint({"UnknownNullness"})
    /* JADX INFO: renamed from: z0 */
    public void mo1486z0(RecyclerView recyclerView, int i) {
        C1210o c1210o = new C1210o(recyclerView.getContext());
        c1210o.f4968a = i;
        m2834A0(c1210o);
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f4773p = 1;
        this.f4777t = false;
        this.f4778u = false;
        this.f4779v = false;
        this.f4780w = true;
        this.f4781x = -1;
        this.f4782y = Integer.MIN_VALUE;
        this.f4783z = null;
        this.f4769A = new C1159a();
        this.f4770B = new C1160b();
        this.f4771C = 2;
        this.f4772D = new int[2];
        RecyclerView.AbstractC1175l.c cVarM2828I = RecyclerView.AbstractC1175l.m2828I(context, attributeSet, i, i2);
        m2712b1(cVarM2828I.f4943a);
        boolean z = cVarM2828I.f4945c;
        mo2713c(null);
        if (z != this.f4777t) {
            this.f4777t = z;
            m2854n0();
        }
        mo2661c1(cVarM2828I.f4946d);
    }
}
