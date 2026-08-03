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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;
import p000a.C0181Jg;
import p000a.C0866ug;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC1175l implements RecyclerView.AbstractC1185v.b {

    /* JADX INFO: renamed from: B */
    public final C1193d f5005B;

    /* JADX INFO: renamed from: C */
    public final int f5006C;

    /* JADX INFO: renamed from: D */
    public boolean f5007D;

    /* JADX INFO: renamed from: E */
    public boolean f5008E;

    /* JADX INFO: renamed from: F */
    public C1194e f5009F;

    /* JADX INFO: renamed from: G */
    public final Rect f5010G;

    /* JADX INFO: renamed from: H */
    public final C1191b f5011H;

    /* JADX INFO: renamed from: I */
    public final boolean f5012I;

    /* JADX INFO: renamed from: J */
    public int[] f5013J;

    /* JADX INFO: renamed from: K */
    public final RunnableC1190a f5014K;

    /* JADX INFO: renamed from: p */
    public final int f5015p;

    /* JADX INFO: renamed from: q */
    public final C1195f[] f5016q;

    /* JADX INFO: renamed from: r */
    public final AbstractC1214s f5017r;

    /* JADX INFO: renamed from: s */
    public final AbstractC1214s f5018s;

    /* JADX INFO: renamed from: t */
    public final int f5019t;

    /* JADX INFO: renamed from: u */
    public int f5020u;

    /* JADX INFO: renamed from: v */
    public final C1209n f5021v;

    /* JADX INFO: renamed from: w */
    public boolean f5022w;

    /* JADX INFO: renamed from: y */
    public final BitSet f5024y;

    /* JADX INFO: renamed from: x */
    public boolean f5023x = false;

    /* JADX INFO: renamed from: z */
    public int f5025z = -1;

    /* JADX INFO: renamed from: A */
    public int f5004A = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class RunnableC1190a implements Runnable {
        public RunnableC1190a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.m2892C0();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C1191b {

        /* JADX INFO: renamed from: a */
        public int f5027a;

        /* JADX INFO: renamed from: b */
        public int f5028b;

        /* JADX INFO: renamed from: c */
        public boolean f5029c;

        /* JADX INFO: renamed from: d */
        public boolean f5030d;

        /* JADX INFO: renamed from: e */
        public boolean f5031e;

        /* JADX INFO: renamed from: f */
        public int[] f5032f;

        public C1191b() {
            m2920a();
        }

        /* JADX INFO: renamed from: a */
        public final void m2920a() {
            this.f5027a = -1;
            this.f5028b = Integer.MIN_VALUE;
            this.f5029c = false;
            this.f5030d = false;
            this.f5031e = false;
            int[] iArr = this.f5032f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C1192c extends RecyclerView.C1176m {

        /* JADX INFO: renamed from: e */
        public C1195f f5034e;
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public static class C1193d {

        /* JADX INFO: renamed from: a */
        public int[] f5035a;

        /* JADX INFO: renamed from: b */
        public ArrayList f5036b;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C1343a();

            /* JADX INFO: renamed from: a */
            public int f5037a;

            /* JADX INFO: renamed from: b */
            public int f5038b;

            /* JADX INFO: renamed from: c */
            public int[] f5039c;

            /* JADX INFO: renamed from: d */
            public boolean f5040d;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public class C1343a implements Parcelable.Creator<a> {
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    a aVar = new a();
                    aVar.f5037a = parcel.readInt();
                    aVar.f5038b = parcel.readInt();
                    aVar.f5040d = parcel.readInt() == 1;
                    int i = parcel.readInt();
                    if (i > 0) {
                        int[] iArr = new int[i];
                        aVar.f5039c = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return aVar;
                }

                /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i) {
                    return new a[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f5037a + ", mGapDir=" + this.f5038b + ", mHasUnwantedGapAfter=" + this.f5040d + ", mGapPerSpan=" + Arrays.toString(this.f5039c) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f5037a);
                parcel.writeInt(this.f5038b);
                parcel.writeInt(this.f5040d ? 1 : 0);
                int[] iArr = this.f5039c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f5039c);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m2921a() {
            int[] iArr = this.f5035a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f5036b = null;
        }

        /* JADX INFO: renamed from: b */
        public final void m2922b(int i) {
            int[] iArr = this.f5035a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f5035a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f5035a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f5035a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m2923c(int i, int i2) {
            int[] iArr = this.f5035a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m2922b(i3);
            int[] iArr2 = this.f5035a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f5035a, i, i3, -1);
            ArrayList arrayList = this.f5036b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f5036b.get(size);
                int i4 = aVar.f5037a;
                if (i4 >= i) {
                    aVar.f5037a = i4 + i2;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m2924d(int i, int i2) {
            int[] iArr = this.f5035a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m2922b(i3);
            int[] iArr2 = this.f5035a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f5035a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            ArrayList arrayList = this.f5036b;
            if (arrayList == null) {
                return;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f5036b.get(size);
                int i4 = aVar.f5037a;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f5036b.remove(size);
                    } else {
                        aVar.f5037a = i4 - i2;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    @SuppressLint({"BanParcelableUsage"})
    public static class C1194e implements Parcelable {
        public static final Parcelable.Creator<C1194e> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        public int f5041a;

        /* JADX INFO: renamed from: b */
        public int f5042b;

        /* JADX INFO: renamed from: c */
        public int f5043c;

        /* JADX INFO: renamed from: d */
        public int[] f5044d;

        /* JADX INFO: renamed from: e */
        public int f5045e;

        /* JADX INFO: renamed from: f */
        public int[] f5046f;

        /* JADX INFO: renamed from: g */
        public ArrayList f5047g;

        /* JADX INFO: renamed from: h */
        public boolean f5048h;

        /* JADX INFO: renamed from: i */
        public boolean f5049i;

        /* JADX INFO: renamed from: j */
        public boolean f5050j;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        public class a implements Parcelable.Creator<C1194e> {
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final C1194e createFromParcel(Parcel parcel) {
                C1194e c1194e = new C1194e();
                c1194e.f5041a = parcel.readInt();
                c1194e.f5042b = parcel.readInt();
                int i = parcel.readInt();
                c1194e.f5043c = i;
                if (i > 0) {
                    int[] iArr = new int[i];
                    c1194e.f5044d = iArr;
                    parcel.readIntArray(iArr);
                }
                int i2 = parcel.readInt();
                c1194e.f5045e = i2;
                if (i2 > 0) {
                    int[] iArr2 = new int[i2];
                    c1194e.f5046f = iArr2;
                    parcel.readIntArray(iArr2);
                }
                c1194e.f5048h = parcel.readInt() == 1;
                c1194e.f5049i = parcel.readInt() == 1;
                c1194e.f5050j = parcel.readInt() == 1;
                c1194e.f5047g = parcel.readArrayList(C1193d.a.class.getClassLoader());
                return c1194e;
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final C1194e[] newArray(int i) {
                return new C1194e[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5041a);
            parcel.writeInt(this.f5042b);
            parcel.writeInt(this.f5043c);
            if (this.f5043c > 0) {
                parcel.writeIntArray(this.f5044d);
            }
            parcel.writeInt(this.f5045e);
            if (this.f5045e > 0) {
                parcel.writeIntArray(this.f5046f);
            }
            parcel.writeInt(this.f5048h ? 1 : 0);
            parcel.writeInt(this.f5049i ? 1 : 0);
            parcel.writeInt(this.f5050j ? 1 : 0);
            parcel.writeList(this.f5047g);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    public class C1195f {

        /* JADX INFO: renamed from: a */
        public final ArrayList<View> f5051a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public int f5052b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c */
        public int f5053c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d */
        public int f5054d = 0;

        /* JADX INFO: renamed from: e */
        public final int f5055e;

        public C1195f(int i) {
            this.f5055e = i;
        }

        /* JADX INFO: renamed from: a */
        public final void m2925a() {
            View view = this.f5051a.get(r0.size() - 1);
            C1192c c1192c = (C1192c) view.getLayoutParams();
            this.f5053c = StaggeredGridLayoutManager.this.f5017r.mo2979b(view);
            c1192c.getClass();
        }

        /* JADX INFO: renamed from: b */
        public final void m2926b() {
            this.f5051a.clear();
            this.f5052b = Integer.MIN_VALUE;
            this.f5053c = Integer.MIN_VALUE;
            this.f5054d = 0;
        }

        /* JADX INFO: renamed from: c */
        public final int m2927c() {
            return StaggeredGridLayoutManager.this.f5022w ? m2929e(r1.size() - 1, -1) : m2929e(0, this.f5051a.size());
        }

        /* JADX INFO: renamed from: d */
        public final int m2928d() {
            return StaggeredGridLayoutManager.this.f5022w ? m2929e(0, this.f5051a.size()) : m2929e(r1.size() - 1, -1);
        }

        /* JADX INFO: renamed from: e */
        public final int m2929e(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int iMo2988k = staggeredGridLayoutManager.f5017r.mo2988k();
            int iMo2984g = staggeredGridLayoutManager.f5017r.mo2984g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f5051a.get(i);
                int iMo2982e = staggeredGridLayoutManager.f5017r.mo2982e(view);
                int iMo2979b = staggeredGridLayoutManager.f5017r.mo2979b(view);
                boolean z = iMo2982e <= iMo2984g;
                boolean z2 = iMo2979b >= iMo2988k;
                if (z && z2 && (iMo2982e < iMo2988k || iMo2979b > iMo2984g)) {
                    return RecyclerView.AbstractC1175l.m2827H(view);
                }
                i += i3;
            }
            return -1;
        }

        /* JADX INFO: renamed from: f */
        public final int m2930f(int i) {
            int i2 = this.f5053c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f5051a.size() == 0) {
                return i;
            }
            m2925a();
            return this.f5053c;
        }

        /* JADX INFO: renamed from: g */
        public final View m2931g(int i, int i2) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            ArrayList<View> arrayList = this.f5051a;
            View view = null;
            if (i2 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = arrayList.get(size);
                    if ((staggeredGridLayoutManager.f5022w && RecyclerView.AbstractC1175l.m2827H(view2) >= i) || ((!staggeredGridLayoutManager.f5022w && RecyclerView.AbstractC1175l.m2827H(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = arrayList.get(i3);
                if ((staggeredGridLayoutManager.f5022w && RecyclerView.AbstractC1175l.m2827H(view3) <= i) || ((!staggeredGridLayoutManager.f5022w && RecyclerView.AbstractC1175l.m2827H(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
            return view;
        }

        /* JADX INFO: renamed from: h */
        public final int m2932h(int i) {
            int i2 = this.f5052b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f5051a.size() == 0) {
                return i;
            }
            View view = this.f5051a.get(0);
            C1192c c1192c = (C1192c) view.getLayoutParams();
            this.f5052b = StaggeredGridLayoutManager.this.f5017r.mo2982e(view);
            c1192c.getClass();
            return this.f5052b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f5015p = -1;
        this.f5022w = false;
        C1193d c1193d = new C1193d();
        this.f5005B = c1193d;
        this.f5006C = 2;
        this.f5010G = new Rect();
        this.f5011H = new C1191b();
        this.f5012I = true;
        this.f5014K = new RunnableC1190a();
        RecyclerView.AbstractC1175l.c cVarM2828I = RecyclerView.AbstractC1175l.m2828I(context, attributeSet, i, i2);
        int i3 = cVarM2828I.f4943a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo2713c(null);
        if (i3 != this.f5019t) {
            this.f5019t = i3;
            AbstractC1214s abstractC1214s = this.f5017r;
            this.f5017r = this.f5018s;
            this.f5018s = abstractC1214s;
            m2854n0();
        }
        int i4 = cVarM2828I.f4944b;
        mo2713c(null);
        if (i4 != this.f5015p) {
            c1193d.m2921a();
            m2854n0();
            this.f5015p = i4;
            this.f5024y = new BitSet(this.f5015p);
            this.f5016q = new C1195f[this.f5015p];
            for (int i5 = 0; i5 < this.f5015p; i5++) {
                this.f5016q[i5] = new C1195f(i5);
            }
            m2854n0();
        }
        boolean z = cVarM2828I.f4945c;
        mo2713c(null);
        C1194e c1194e = this.f5009F;
        if (c1194e != null && c1194e.f5048h != z) {
            c1194e.f5048h = z;
        }
        this.f5022w = z;
        m2854n0();
        C1209n c1209n = new C1209n();
        c1209n.f5173a = true;
        c1209n.f5178f = 0;
        c1209n.f5179g = 0;
        this.f5021v = c1209n;
        this.f5017r = AbstractC1214s.m2993a(this, this.f5019t);
        this.f5018s = AbstractC1214s.m2993a(this, 1 - this.f5019t);
    }

    /* JADX INFO: renamed from: e1 */
    public static int m2891e1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: B0 */
    public final boolean mo2647B0() {
        return this.f5009F == null;
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m2892C0() {
        int iM2901L0;
        if (m2860v() != 0 && this.f5006C != 0 && this.f4932g) {
            if (this.f5023x) {
                iM2901L0 = m2902M0();
                m2901L0();
            } else {
                iM2901L0 = m2901L0();
                m2902M0();
            }
            C1193d c1193d = this.f5005B;
            if (iM2901L0 == 0 && m2906Q0() != null) {
                c1193d.m2921a();
                this.f4931f = true;
                m2854n0();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: D0 */
    public final int m2893D0(RecyclerView.C1186w c1186w) {
        if (m2860v() == 0) {
            return 0;
        }
        AbstractC1214s abstractC1214s = this.f5017r;
        boolean z = !this.f5012I;
        return C1220y.m3004a(c1186w, abstractC1214s, m2898I0(z), m2897H0(z), this, this.f5012I);
    }

    /* JADX INFO: renamed from: E0 */
    public final int m2894E0(RecyclerView.C1186w c1186w) {
        if (m2860v() == 0) {
            return 0;
        }
        AbstractC1214s abstractC1214s = this.f5017r;
        boolean z = !this.f5012I;
        return C1220y.m3005b(c1186w, abstractC1214s, m2898I0(z), m2897H0(z), this, this.f5012I, this.f5023x);
    }

    /* JADX INFO: renamed from: F0 */
    public final int m2895F0(RecyclerView.C1186w c1186w) {
        if (m2860v() == 0) {
            return 0;
        }
        AbstractC1214s abstractC1214s = this.f5017r;
        boolean z = !this.f5012I;
        return C1220y.m3006c(c1186w, abstractC1214s, m2898I0(z), m2897H0(z), this, this.f5012I);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX INFO: renamed from: G0 */
    public final int m2896G0(RecyclerView.C1181r c1181r, C1209n c1209n, RecyclerView.C1186w c1186w) {
        C1195f c1195f;
        ?? r6;
        int i;
        int iM2932h;
        int iMo2980c;
        int iMo2988k;
        int iMo2980c2;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 1;
        this.f5024y.set(0, this.f5015p, true);
        C1209n c1209n2 = this.f5021v;
        int i7 = c1209n2.f5181i ? c1209n.f5177e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c1209n.f5177e == 1 ? c1209n.f5179g + c1209n.f5174b : c1209n.f5178f - c1209n.f5174b;
        int i8 = c1209n.f5177e;
        for (int i9 = 0; i9 < this.f5015p; i9++) {
            if (!this.f5016q[i9].f5051a.isEmpty()) {
                m2919d1(this.f5016q[i9], i8, i7);
            }
        }
        int iMo2984g = this.f5023x ? this.f5017r.mo2984g() : this.f5017r.mo2988k();
        boolean z = false;
        while (true) {
            int i10 = c1209n.f5175c;
            if (((i10 < 0 || i10 >= c1186w.m2887b()) ? i5 : i6) == 0 || (!c1209n2.f5181i && this.f5024y.isEmpty())) {
                break;
            }
            View view = c1181r.m2878k(Long.MAX_VALUE, c1209n.f5175c).f4891a;
            c1209n.f5175c += c1209n.f5176d;
            C1192c c1192c = (C1192c) view.getLayoutParams();
            int iM2796b = c1192c.f4947a.m2796b();
            C1193d c1193d = this.f5005B;
            int[] iArr = c1193d.f5035a;
            int i11 = (iArr == null || iM2796b >= iArr.length) ? -1 : iArr[iM2796b];
            if (i11 == -1) {
                if (m2910U0(c1209n.f5177e)) {
                    i4 = this.f5015p - i6;
                    i3 = -1;
                    i2 = -1;
                } else {
                    i2 = i6;
                    i3 = this.f5015p;
                    i4 = i5;
                }
                C1195f c1195f2 = null;
                if (c1209n.f5177e == i6) {
                    int iMo2988k2 = this.f5017r.mo2988k();
                    int i12 = Integer.MAX_VALUE;
                    while (i4 != i3) {
                        C1195f c1195f3 = this.f5016q[i4];
                        int iM2930f = c1195f3.m2930f(iMo2988k2);
                        if (iM2930f < i12) {
                            i12 = iM2930f;
                            c1195f2 = c1195f3;
                        }
                        i4 += i2;
                    }
                } else {
                    int iMo2984g2 = this.f5017r.mo2984g();
                    int i13 = Integer.MIN_VALUE;
                    while (i4 != i3) {
                        C1195f c1195f4 = this.f5016q[i4];
                        int iM2932h2 = c1195f4.m2932h(iMo2984g2);
                        if (iM2932h2 > i13) {
                            c1195f2 = c1195f4;
                            i13 = iM2932h2;
                        }
                        i4 += i2;
                    }
                }
                c1195f = c1195f2;
                c1193d.m2922b(iM2796b);
                c1193d.f5035a[iM2796b] = c1195f.f5055e;
            } else {
                c1195f = this.f5016q[i11];
            }
            c1192c.f5034e = c1195f;
            if (c1209n.f5177e == 1) {
                r6 = 0;
                m2847b(view, -1, false);
            } else {
                r6 = 0;
                m2847b(view, 0, false);
            }
            if (this.f5019t == 1) {
                i = 1;
                m2908S0(view, RecyclerView.AbstractC1175l.m2832w(r6, this.f5020u, this.f4937l, r6, ((ViewGroup.MarginLayoutParams) c1192c).width), RecyclerView.AbstractC1175l.m2832w(true, this.f4940o, this.f4938m, m2837D() + m2840G(), ((ViewGroup.MarginLayoutParams) c1192c).height));
            } else {
                i = 1;
                m2908S0(view, RecyclerView.AbstractC1175l.m2832w(true, this.f4939n, this.f4937l, m2839F() + m2838E(), ((ViewGroup.MarginLayoutParams) c1192c).width), RecyclerView.AbstractC1175l.m2832w(false, this.f5020u, this.f4938m, 0, ((ViewGroup.MarginLayoutParams) c1192c).height));
            }
            if (c1209n.f5177e == i) {
                iMo2980c = c1195f.m2930f(iMo2984g);
                iM2932h = this.f5017r.mo2980c(view) + iMo2980c;
            } else {
                iM2932h = c1195f.m2932h(iMo2984g);
                iMo2980c = iM2932h - this.f5017r.mo2980c(view);
            }
            if (c1209n.f5177e == 1) {
                C1195f c1195f5 = c1192c.f5034e;
                c1195f5.getClass();
                C1192c c1192c2 = (C1192c) view.getLayoutParams();
                c1192c2.f5034e = c1195f5;
                ArrayList<View> arrayList = c1195f5.f5051a;
                arrayList.add(view);
                c1195f5.f5053c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c1195f5.f5052b = Integer.MIN_VALUE;
                }
                if (c1192c2.f4947a.m2802h() || c1192c2.f4947a.m2805k()) {
                    c1195f5.f5054d = StaggeredGridLayoutManager.this.f5017r.mo2980c(view) + c1195f5.f5054d;
                }
            } else {
                C1195f c1195f6 = c1192c.f5034e;
                c1195f6.getClass();
                C1192c c1192c3 = (C1192c) view.getLayoutParams();
                c1192c3.f5034e = c1195f6;
                ArrayList<View> arrayList2 = c1195f6.f5051a;
                arrayList2.add(0, view);
                c1195f6.f5052b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c1195f6.f5053c = Integer.MIN_VALUE;
                }
                if (c1192c3.f4947a.m2802h() || c1192c3.f4947a.m2805k()) {
                    c1195f6.f5054d = StaggeredGridLayoutManager.this.f5017r.mo2980c(view) + c1195f6.f5054d;
                }
            }
            if (m2907R0() && this.f5019t == 1) {
                iMo2980c2 = this.f5018s.mo2984g() - (((this.f5015p - 1) - c1195f.f5055e) * this.f5020u);
                iMo2988k = iMo2980c2 - this.f5018s.mo2980c(view);
            } else {
                iMo2988k = this.f5018s.mo2988k() + (c1195f.f5055e * this.f5020u);
                iMo2980c2 = this.f5018s.mo2980c(view) + iMo2988k;
            }
            if (this.f5019t == 1) {
                RecyclerView.AbstractC1175l.m2830N(view, iMo2988k, iMo2980c, iMo2980c2, iM2932h);
            } else {
                RecyclerView.AbstractC1175l.m2830N(view, iMo2980c, iMo2988k, iM2932h, iMo2980c2);
            }
            m2919d1(c1195f, c1209n2.f5177e, i7);
            m2912W0(c1181r, c1209n2);
            if (c1209n2.f5180h && view.hasFocusable()) {
                this.f5024y.set(c1195f.f5055e, false);
            }
            i6 = 1;
            z = true;
            i5 = 0;
        }
        if (!z) {
            m2912W0(c1181r, c1209n2);
        }
        int iMo2988k3 = c1209n2.f5177e == -1 ? this.f5017r.mo2988k() - m2904O0(this.f5017r.mo2988k()) : m2903N0(this.f5017r.mo2984g()) - this.f5017r.mo2984g();
        if (iMo2988k3 > 0) {
            return Math.min(c1209n.f5174b, iMo2988k3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: H0 */
    public final View m2897H0(boolean z) {
        int iMo2988k = this.f5017r.mo2988k();
        int iMo2984g = this.f5017r.mo2984g();
        View view = null;
        for (int iM2860v = m2860v() - 1; iM2860v >= 0; iM2860v--) {
            View viewM2858u = m2858u(iM2860v);
            int iMo2982e = this.f5017r.mo2982e(viewM2858u);
            int iMo2979b = this.f5017r.mo2979b(viewM2858u);
            if (iMo2979b > iMo2988k && iMo2982e < iMo2984g) {
                if (iMo2979b <= iMo2984g || !z) {
                    return viewM2858u;
                }
                if (view == null) {
                    view = viewM2858u;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: I0 */
    public final View m2898I0(boolean z) {
        int iMo2988k = this.f5017r.mo2988k();
        int iMo2984g = this.f5017r.mo2984g();
        int iM2860v = m2860v();
        View view = null;
        for (int i = 0; i < iM2860v; i++) {
            View viewM2858u = m2858u(i);
            int iMo2982e = this.f5017r.mo2982e(viewM2858u);
            if (this.f5017r.mo2979b(viewM2858u) > iMo2988k && iMo2982e < iMo2984g) {
                if (iMo2982e >= iMo2988k || !z) {
                    return viewM2858u;
                }
                if (view == null) {
                    view = viewM2858u;
                }
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m2899J0(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w, boolean z) {
        int iMo2984g;
        int iM2903N0 = m2903N0(Integer.MIN_VALUE);
        if (iM2903N0 != Integer.MIN_VALUE && (iMo2984g = this.f5017r.mo2984g() - iM2903N0) > 0) {
            int i = iMo2984g - (-m2916a1(-iMo2984g, c1181r, c1186w));
            if (!z || i <= 0) {
                return;
            }
            this.f5017r.mo2992o(i);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m2900K0(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w, boolean z) {
        int iMo2988k;
        int iM2904O0 = m2904O0(Integer.MAX_VALUE);
        if (iM2904O0 != Integer.MAX_VALUE && (iMo2988k = iM2904O0 - this.f5017r.mo2988k()) > 0) {
            int iM2916a1 = iMo2988k - m2916a1(iMo2988k, c1181r, c1186w);
            if (!z || iM2916a1 <= 0) {
                return;
            }
            this.f5017r.mo2992o(-iM2916a1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: L */
    public final boolean mo2695L() {
        return this.f5006C != 0;
    }

    /* JADX INFO: renamed from: L0 */
    public final int m2901L0() {
        if (m2860v() == 0) {
            return 0;
        }
        return RecyclerView.AbstractC1175l.m2827H(m2858u(0));
    }

    /* JADX INFO: renamed from: M0 */
    public final int m2902M0() {
        int iM2860v = m2860v();
        if (iM2860v == 0) {
            return 0;
        }
        return RecyclerView.AbstractC1175l.m2827H(m2858u(iM2860v - 1));
    }

    /* JADX INFO: renamed from: N0 */
    public final int m2903N0(int i) {
        int iM2930f = this.f5016q[0].m2930f(i);
        for (int i2 = 1; i2 < this.f5015p; i2++) {
            int iM2930f2 = this.f5016q[i2].m2930f(i);
            if (iM2930f2 > iM2930f) {
                iM2930f = iM2930f2;
            }
        }
        return iM2930f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: O */
    public final void mo2842O(int i) {
        super.mo2842O(i);
        for (int i2 = 0; i2 < this.f5015p; i2++) {
            C1195f c1195f = this.f5016q[i2];
            int i3 = c1195f.f5052b;
            if (i3 != Integer.MIN_VALUE) {
                c1195f.f5052b = i3 + i;
            }
            int i4 = c1195f.f5053c;
            if (i4 != Integer.MIN_VALUE) {
                c1195f.f5053c = i4 + i;
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final int m2904O0(int i) {
        int iM2932h = this.f5016q[0].m2932h(i);
        for (int i2 = 1; i2 < this.f5015p; i2++) {
            int iM2932h2 = this.f5016q[i2].m2932h(i);
            if (iM2932h2 < iM2932h) {
                iM2932h = iM2932h2;
            }
        }
        return iM2932h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: P */
    public final void mo2843P(int i) {
        super.mo2843P(i);
        for (int i2 = 0; i2 < this.f5015p; i2++) {
            C1195f c1195f = this.f5016q[i2];
            int i3 = c1195f.f5052b;
            if (i3 != Integer.MIN_VALUE) {
                c1195f.f5052b = i3 + i;
            }
            int i4 = c1195f.f5053c;
            if (i4 != Integer.MIN_VALUE) {
                c1195f.f5053c = i4 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2905P0(int i, int i2, int i3) {
        int i4;
        int i5;
        C1193d c1193d;
        int[] iArr;
        ArrayList arrayList;
        C1193d.a aVar;
        int size;
        int i6;
        int i7;
        int iM2902M0 = this.f5023x ? m2902M0() : m2901L0();
        if (i3 != 8) {
            i4 = i + i2;
        } else {
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
                c1193d = this.f5005B;
                iArr = c1193d.f5035a;
                if (iArr != null && i5 < iArr.length) {
                    arrayList = c1193d.f5036b;
                    if (arrayList != null) {
                        if (arrayList == null) {
                            aVar = null;
                            if (aVar != null) {
                                c1193d.f5036b.remove(aVar);
                            }
                            size = c1193d.f5036b.size();
                            i6 = 0;
                            while (true) {
                                if (i6 < size) {
                                    i6 = -1;
                                    break;
                                } else if (((C1193d.a) c1193d.f5036b.get(i6)).f5037a >= i5) {
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                            if (i6 == -1) {
                                C1193d.a aVar2 = (C1193d.a) c1193d.f5036b.get(i6);
                                c1193d.f5036b.remove(i6);
                                i7 = aVar2.f5037a;
                            } else {
                                i7 = -1;
                            }
                            if (i7 != -1) {
                                int[] iArr2 = c1193d.f5035a;
                                Arrays.fill(iArr2, i5, iArr2.length, -1);
                                int length = c1193d.f5035a.length;
                            } else {
                                Arrays.fill(c1193d.f5035a, i5, Math.min(i7 + 1, c1193d.f5035a.length), -1);
                            }
                        } else {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                aVar = (C1193d.a) c1193d.f5036b.get(size2);
                                if (aVar.f5037a == i5) {
                                    break;
                                }
                            }
                            aVar = null;
                            if (aVar != null) {
                            }
                            size = c1193d.f5036b.size();
                            i6 = 0;
                            while (true) {
                                if (i6 < size) {
                                }
                                i6++;
                            }
                            if (i6 == -1) {
                            }
                            if (i7 != -1) {
                            }
                        }
                    }
                }
                if (i3 != 1) {
                    c1193d.m2923c(i, i2);
                } else if (i3 == 2) {
                    c1193d.m2924d(i, i2);
                } else if (i3 == 8) {
                    c1193d.m2924d(i, 1);
                    c1193d.m2923c(i2, 1);
                }
                if (i4 > iM2902M0) {
                    return;
                }
                if (i5 <= (this.f5023x ? m2901L0() : m2902M0())) {
                    m2854n0();
                    return;
                }
                return;
            }
            i4 = i2 + 1;
        }
        i5 = i;
        c1193d = this.f5005B;
        iArr = c1193d.f5035a;
        if (iArr != null) {
            arrayList = c1193d.f5036b;
            if (arrayList != null) {
            }
        }
        if (i3 != 1) {
        }
        if (i4 > iM2902M0) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: Q */
    public final void mo2844Q() {
        this.f5005B.m2921a();
        for (int i = 0; i < this.f5015p; i++) {
            this.f5016q[i].m2926b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /* JADX INFO: renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View m2906Q0() {
        int iM2860v = m2860v();
        int i = iM2860v - 1;
        BitSet bitSet = new BitSet(this.f5015p);
        bitSet.set(0, this.f5015p, true);
        byte b = (this.f5019t == 1 && m2907R0()) ? (byte) 1 : (byte) -1;
        if (this.f5023x) {
            iM2860v = -1;
        } else {
            i = 0;
        }
        int i2 = i < iM2860v ? 1 : -1;
        while (i != iM2860v) {
            View viewM2858u = m2858u(i);
            C1192c c1192c = (C1192c) viewM2858u.getLayoutParams();
            if (bitSet.get(c1192c.f5034e.f5055e)) {
                C1195f c1195f = c1192c.f5034e;
                if (this.f5023x) {
                    int i3 = c1195f.f5053c;
                    if (i3 == Integer.MIN_VALUE) {
                        c1195f.m2925a();
                        i3 = c1195f.f5053c;
                    }
                    if (i3 < this.f5017r.mo2984g()) {
                        ArrayList<View> arrayList = c1195f.f5051a;
                        ((C1192c) arrayList.get(arrayList.size() - 1).getLayoutParams()).getClass();
                        return viewM2858u;
                    }
                } else {
                    int i4 = c1195f.f5052b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = c1195f.f5051a.get(0);
                        C1192c c1192c2 = (C1192c) view.getLayoutParams();
                        c1195f.f5052b = StaggeredGridLayoutManager.this.f5017r.mo2982e(view);
                        c1192c2.getClass();
                        i4 = c1195f.f5052b;
                    }
                    if (i4 > this.f5017r.mo2988k()) {
                        ((C1192c) c1195f.f5051a.get(0).getLayoutParams()).getClass();
                        return viewM2858u;
                    }
                }
                bitSet.clear(c1192c.f5034e.f5055e);
            }
            i += i2;
            if (i != iM2860v) {
                View viewM2858u2 = m2858u(i);
                if (this.f5023x) {
                    int iMo2979b = this.f5017r.mo2979b(viewM2858u);
                    int iMo2979b2 = this.f5017r.mo2979b(viewM2858u2);
                    if (iMo2979b < iMo2979b2) {
                        return viewM2858u;
                    }
                    if (iMo2979b == iMo2979b2) {
                        if ((c1192c.f5034e.f5055e - ((C1192c) viewM2858u2.getLayoutParams()).f5034e.f5055e >= 0) == (b >= 0)) {
                            return viewM2858u;
                        }
                    } else {
                        continue;
                    }
                } else {
                    int iMo2982e = this.f5017r.mo2982e(viewM2858u);
                    int iMo2982e2 = this.f5017r.mo2982e(viewM2858u2);
                    if (iMo2982e > iMo2982e2) {
                        return viewM2858u;
                    }
                    if (iMo2982e == iMo2982e2) {
                        if ((c1192c.f5034e.f5055e - ((C1192c) viewM2858u2.getLayoutParams()).f5034e.f5055e >= 0) == (b >= 0)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: R0 */
    public final boolean m2907R0() {
        return m2836C() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: S */
    public final void mo2702S(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4927b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f5014K);
        }
        for (int i = 0; i < this.f5015p; i++) {
            this.f5016q[i].m2926b();
        }
        recyclerView.requestLayout();
    }

    /* JADX INFO: renamed from: S0 */
    public final void m2908S0(View view, int i, int i2) {
        RecyclerView recyclerView = this.f4927b;
        Rect rect = this.f5010G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m2754M(view));
        }
        C1192c c1192c = (C1192c) view.getLayoutParams();
        int iM2891e1 = m2891e1(i, ((ViewGroup.MarginLayoutParams) c1192c).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) c1192c).rightMargin + rect.right);
        int iM2891e12 = m2891e1(i2, ((ViewGroup.MarginLayoutParams) c1192c).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) c1192c).bottomMargin + rect.bottom);
        if (m2862w0(view, iM2891e1, iM2891e12, c1192c)) {
            view.measure(iM2891e1, iM2891e12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0051  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo2651T(View view, int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        View viewM2747D;
        int i2;
        if (m2860v() != 0) {
            RecyclerView recyclerView = this.f4927b;
            if (recyclerView == null || (viewM2747D = recyclerView.m2747D(view)) == null || this.f4926a.f5067c.contains(viewM2747D)) {
                viewM2747D = null;
            }
            if (viewM2747D != null) {
                m2915Z0();
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? this.f5019t == 0 : !(i != 130 || this.f5019t != 1)) {
                                    i2 = 1;
                                }
                            } else if (this.f5019t == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (this.f5019t != 0) {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (this.f5019t != 1 && m2907R0()) {
                    }
                } else if (this.f5019t != 1 && m2907R0()) {
                }
                if (i2 != Integer.MIN_VALUE) {
                    C1192c c1192c = (C1192c) viewM2747D.getLayoutParams();
                    c1192c.getClass();
                    C1195f c1195f = c1192c.f5034e;
                    int iM2902M0 = i2 == 1 ? m2902M0() : m2901L0();
                    m2918c1(iM2902M0, c1186w);
                    m2917b1(i2);
                    C1209n c1209n = this.f5021v;
                    c1209n.f5175c = c1209n.f5176d + iM2902M0;
                    c1209n.f5174b = (int) (this.f5017r.mo2989l() * 0.33333334f);
                    c1209n.f5180h = true;
                    c1209n.f5173a = false;
                    m2896G0(c1181r, c1209n, c1186w);
                    this.f5007D = this.f5023x;
                    View viewM2931g = c1195f.m2931g(iM2902M0, i2);
                    if (viewM2931g != null && viewM2931g != viewM2747D) {
                        return viewM2931g;
                    }
                    if (m2910U0(i2)) {
                        for (int i3 = this.f5015p - 1; i3 >= 0; i3--) {
                            View viewM2931g2 = this.f5016q[i3].m2931g(iM2902M0, i2);
                            if (viewM2931g2 != null && viewM2931g2 != viewM2747D) {
                                return viewM2931g2;
                            }
                        }
                    } else {
                        for (int i4 = 0; i4 < this.f5015p; i4++) {
                            View viewM2931g3 = this.f5016q[i4].m2931g(iM2902M0, i2);
                            if (viewM2931g3 != null && viewM2931g3 != viewM2747D) {
                                return viewM2931g3;
                            }
                        }
                    }
                    boolean z = (this.f5022w ^ true) == (i2 == -1);
                    View viewMo2726q = mo2726q(z ? c1195f.m2927c() : c1195f.m2928d());
                    if (viewMo2726q != null && viewMo2726q != viewM2747D) {
                        return viewMo2726q;
                    }
                    if (m2910U0(i2)) {
                        for (int i5 = this.f5015p - 1; i5 >= 0; i5--) {
                            if (i5 != c1195f.f5055e) {
                                View viewMo2726q2 = mo2726q(z ? this.f5016q[i5].m2927c() : this.f5016q[i5].m2928d());
                                if (viewMo2726q2 != null && viewMo2726q2 != viewM2747D) {
                                    return viewMo2726q2;
                                }
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < this.f5015p; i6++) {
                            View viewMo2726q3 = mo2726q(z ? this.f5016q[i6].m2927c() : this.f5016q[i6].m2928d());
                            if (viewMo2726q3 != null && viewMo2726q3 != viewM2747D) {
                                return viewMo2726q3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0417  */
    /* JADX INFO: renamed from: T0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2909T0(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w, boolean z) {
        C1194e c1194e;
        int iM2827H;
        int i;
        boolean z2;
        C1194e c1194e2 = this.f5009F;
        C1191b c1191b = this.f5011H;
        if (!(c1194e2 == null && this.f5025z == -1) && c1186w.m2887b() == 0) {
            m2849i0(c1181r);
            c1191b.m2920a();
            return;
        }
        boolean z3 = true;
        boolean z4 = (c1191b.f5031e && this.f5025z == -1 && this.f5009F == null) ? false : true;
        C1193d c1193d = this.f5005B;
        StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
        if (z4) {
            c1191b.m2920a();
            C1194e c1194e3 = this.f5009F;
            if (c1194e3 != null) {
                int i2 = c1194e3.f5043c;
                if (i2 > 0) {
                    if (i2 == this.f5015p) {
                        for (int i3 = 0; i3 < this.f5015p; i3++) {
                            this.f5016q[i3].m2926b();
                            C1194e c1194e4 = this.f5009F;
                            int iMo2984g = c1194e4.f5044d[i3];
                            if (iMo2984g != Integer.MIN_VALUE) {
                                iMo2984g += c1194e4.f5049i ? this.f5017r.mo2984g() : this.f5017r.mo2988k();
                            }
                            C1195f c1195f = this.f5016q[i3];
                            c1195f.f5052b = iMo2984g;
                            c1195f.f5053c = iMo2984g;
                        }
                    } else {
                        c1194e3.f5044d = null;
                        c1194e3.f5043c = 0;
                        c1194e3.f5045e = 0;
                        c1194e3.f5046f = null;
                        c1194e3.f5047g = null;
                        c1194e3.f5041a = c1194e3.f5042b;
                    }
                }
                C1194e c1194e5 = this.f5009F;
                this.f5008E = c1194e5.f5050j;
                boolean z5 = c1194e5.f5048h;
                mo2713c(null);
                C1194e c1194e6 = this.f5009F;
                if (c1194e6 != null && c1194e6.f5048h != z5) {
                    c1194e6.f5048h = z5;
                }
                this.f5022w = z5;
                m2854n0();
                m2915Z0();
                C1194e c1194e7 = this.f5009F;
                int i4 = c1194e7.f5041a;
                if (i4 != -1) {
                    this.f5025z = i4;
                    c1191b.f5029c = c1194e7.f5049i;
                } else {
                    c1191b.f5029c = this.f5023x;
                }
                if (c1194e7.f5045e > 1) {
                    c1193d.f5035a = c1194e7.f5046f;
                    c1193d.f5036b = c1194e7.f5047g;
                }
            } else {
                m2915Z0();
                c1191b.f5029c = this.f5023x;
            }
            if (c1186w.f4989g || (i = this.f5025z) == -1) {
                if (this.f5007D) {
                    int iM2887b = c1186w.m2887b();
                    int iM2860v = m2860v();
                    for (int i5 = 0; i5 < iM2860v; i5++) {
                        int iM2827H2 = RecyclerView.AbstractC1175l.m2827H(m2858u(i5));
                        if (iM2827H2 >= 0 && iM2827H2 < iM2887b) {
                            iM2827H = iM2827H2;
                            break;
                        }
                    }
                    iM2827H = 0;
                    c1191b.f5027a = iM2827H;
                    c1191b.f5028b = Integer.MIN_VALUE;
                    c1191b.f5031e = true;
                } else {
                    int iM2887b2 = c1186w.m2887b();
                    for (int iM2860v2 = m2860v() - 1; iM2860v2 >= 0; iM2860v2--) {
                        iM2827H = RecyclerView.AbstractC1175l.m2827H(m2858u(iM2860v2));
                        if (iM2827H >= 0 && iM2827H < iM2887b2) {
                            break;
                        }
                    }
                    iM2827H = 0;
                    c1191b.f5027a = iM2827H;
                    c1191b.f5028b = Integer.MIN_VALUE;
                    c1191b.f5031e = true;
                }
            } else if (i < 0 || i >= c1186w.m2887b()) {
                this.f5025z = -1;
                this.f5004A = Integer.MIN_VALUE;
                if (this.f5007D) {
                }
            } else {
                C1194e c1194e8 = this.f5009F;
                if (c1194e8 == null || c1194e8.f5041a == -1 || c1194e8.f5043c < 1) {
                    View viewMo2726q = mo2726q(this.f5025z);
                    if (viewMo2726q != null) {
                        c1191b.f5027a = this.f5023x ? m2902M0() : m2901L0();
                        if (this.f5004A != Integer.MIN_VALUE) {
                            if (c1191b.f5029c) {
                                c1191b.f5028b = (this.f5017r.mo2984g() - this.f5004A) - this.f5017r.mo2979b(viewMo2726q);
                            } else {
                                c1191b.f5028b = (this.f5017r.mo2988k() + this.f5004A) - this.f5017r.mo2982e(viewMo2726q);
                            }
                        } else if (this.f5017r.mo2980c(viewMo2726q) > this.f5017r.mo2989l()) {
                            c1191b.f5028b = c1191b.f5029c ? this.f5017r.mo2984g() : this.f5017r.mo2988k();
                        } else {
                            int iMo2982e = this.f5017r.mo2982e(viewMo2726q) - this.f5017r.mo2988k();
                            if (iMo2982e < 0) {
                                c1191b.f5028b = -iMo2982e;
                            } else {
                                int iMo2984g2 = this.f5017r.mo2984g() - this.f5017r.mo2979b(viewMo2726q);
                                if (iMo2984g2 < 0) {
                                    c1191b.f5028b = iMo2984g2;
                                } else {
                                    c1191b.f5028b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.f5025z;
                        c1191b.f5027a = i6;
                        int i7 = this.f5004A;
                        if (i7 == Integer.MIN_VALUE) {
                            if (m2860v() == 0) {
                                z2 = this.f5023x;
                            } else if ((i6 < m2901L0()) != this.f5023x) {
                            }
                            c1191b.f5029c = z2;
                            c1191b.f5028b = z2 ? staggeredGridLayoutManager.f5017r.mo2984g() : staggeredGridLayoutManager.f5017r.mo2988k();
                        } else if (c1191b.f5029c) {
                            c1191b.f5028b = staggeredGridLayoutManager.f5017r.mo2984g() - i7;
                        } else {
                            c1191b.f5028b = staggeredGridLayoutManager.f5017r.mo2988k() + i7;
                        }
                        c1191b.f5030d = true;
                    }
                } else {
                    c1191b.f5028b = Integer.MIN_VALUE;
                    c1191b.f5027a = this.f5025z;
                }
                c1191b.f5031e = true;
            }
        }
        if (this.f5009F == null && this.f5025z == -1 && (c1191b.f5029c != this.f5007D || m2907R0() != this.f5008E)) {
            c1193d.m2921a();
            c1191b.f5030d = true;
        }
        if (m2860v() > 0 && ((c1194e = this.f5009F) == null || c1194e.f5043c < 1)) {
            if (c1191b.f5030d) {
                for (int i8 = 0; i8 < this.f5015p; i8++) {
                    this.f5016q[i8].m2926b();
                    int i9 = c1191b.f5028b;
                    if (i9 != Integer.MIN_VALUE) {
                        C1195f c1195f2 = this.f5016q[i8];
                        c1195f2.f5052b = i9;
                        c1195f2.f5053c = i9;
                    }
                }
            } else if (z4 || c1191b.f5032f == null) {
                for (int i10 = 0; i10 < this.f5015p; i10++) {
                    C1195f c1195f3 = this.f5016q[i10];
                    boolean z6 = this.f5023x;
                    int i11 = c1191b.f5028b;
                    int iM2930f = z6 ? c1195f3.m2930f(Integer.MIN_VALUE) : c1195f3.m2932h(Integer.MIN_VALUE);
                    c1195f3.m2926b();
                    if (iM2930f != Integer.MIN_VALUE) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                        if ((!z6 || iM2930f >= staggeredGridLayoutManager2.f5017r.mo2984g()) && (z6 || iM2930f <= staggeredGridLayoutManager2.f5017r.mo2988k())) {
                            if (i11 != Integer.MIN_VALUE) {
                                iM2930f += i11;
                            }
                            c1195f3.f5053c = iM2930f;
                            c1195f3.f5052b = iM2930f;
                        }
                    }
                }
                C1195f[] c1195fArr = this.f5016q;
                int length = c1195fArr.length;
                int[] iArr = c1191b.f5032f;
                if (iArr == null || iArr.length < length) {
                    c1191b.f5032f = new int[staggeredGridLayoutManager.f5016q.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    c1191b.f5032f[i12] = c1195fArr[i12].m2932h(Integer.MIN_VALUE);
                }
            } else {
                for (int i13 = 0; i13 < this.f5015p; i13++) {
                    C1195f c1195f4 = this.f5016q[i13];
                    c1195f4.m2926b();
                    int i14 = c1191b.f5032f[i13];
                    c1195f4.f5052b = i14;
                    c1195f4.f5053c = i14;
                }
            }
        }
        m2855p(c1181r);
        C1209n c1209n = this.f5021v;
        c1209n.f5173a = false;
        int iMo2989l = this.f5018s.mo2989l();
        this.f5020u = iMo2989l / this.f5015p;
        View.MeasureSpec.makeMeasureSpec(iMo2989l, this.f5018s.mo2986i());
        m2918c1(c1191b.f5027a, c1186w);
        if (c1191b.f5029c) {
            m2917b1(-1);
            m2896G0(c1181r, c1209n, c1186w);
            m2917b1(1);
            c1209n.f5175c = c1191b.f5027a + c1209n.f5176d;
            m2896G0(c1181r, c1209n, c1186w);
        } else {
            m2917b1(1);
            m2896G0(c1181r, c1209n, c1186w);
            m2917b1(-1);
            c1209n.f5175c = c1191b.f5027a + c1209n.f5176d;
            m2896G0(c1181r, c1209n, c1186w);
        }
        if (this.f5018s.mo2986i() != 1073741824) {
            int iM2860v3 = m2860v();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < iM2860v3; i15++) {
                View viewM2858u = m2858u(i15);
                float fMo2980c = this.f5018s.mo2980c(viewM2858u);
                if (fMo2980c >= fMax) {
                    ((C1192c) viewM2858u.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fMo2980c);
                }
            }
            int i16 = this.f5020u;
            int iRound = Math.round(fMax * this.f5015p);
            if (this.f5018s.mo2986i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f5018s.mo2989l());
            }
            this.f5020u = iRound / this.f5015p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f5018s.mo2986i());
            if (this.f5020u != i16) {
                for (int i17 = 0; i17 < iM2860v3; i17++) {
                    View viewM2858u2 = m2858u(i17);
                    C1192c c1192c = (C1192c) viewM2858u2.getLayoutParams();
                    c1192c.getClass();
                    if (m2907R0() && this.f5019t == 1) {
                        int i18 = -((this.f5015p - 1) - c1192c.f5034e.f5055e);
                        viewM2858u2.offsetLeftAndRight((this.f5020u * i18) - (i18 * i16));
                    } else {
                        int i19 = c1192c.f5034e.f5055e;
                        int i20 = this.f5020u * i19;
                        int i21 = i19 * i16;
                        if (this.f5019t == 1) {
                            viewM2858u2.offsetLeftAndRight(i20 - i21);
                        } else {
                            viewM2858u2.offsetTopAndBottom(i20 - i21);
                        }
                    }
                }
            }
        }
        if (m2860v() > 0) {
            if (this.f5023x) {
                m2899J0(c1181r, c1186w, true);
                m2900K0(c1181r, c1186w, false);
            } else {
                m2900K0(c1181r, c1186w, true);
                m2899J0(c1181r, c1186w, false);
            }
        }
        if (!z || c1186w.f4989g || this.f5006C == 0 || m2860v() <= 0 || m2906Q0() == null) {
            z3 = false;
        } else {
            RecyclerView recyclerView = this.f4927b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f5014K);
            }
            if (!m2892C0()) {
            }
        }
        if (c1186w.f4989g) {
            c1191b.m2920a();
        }
        this.f5007D = c1191b.f5029c;
        this.f5008E = m2907R0();
        if (z3) {
            c1191b.m2920a();
            m2909T0(c1181r, c1186w, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: U */
    public final void mo2705U(AccessibilityEvent accessibilityEvent) {
        super.mo2705U(accessibilityEvent);
        if (m2860v() > 0) {
            View viewM2898I0 = m2898I0(false);
            View viewM2897H0 = m2897H0(false);
            if (viewM2898I0 == null || viewM2897H0 == null) {
                return;
            }
            int iM2827H = RecyclerView.AbstractC1175l.m2827H(viewM2898I0);
            int iM2827H2 = RecyclerView.AbstractC1175l.m2827H(viewM2897H0);
            if (iM2827H < iM2827H2) {
                accessibilityEvent.setFromIndex(iM2827H);
                accessibilityEvent.setToIndex(iM2827H2);
            } else {
                accessibilityEvent.setFromIndex(iM2827H2);
                accessibilityEvent.setToIndex(iM2827H);
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final boolean m2910U0(int i) {
        if (this.f5019t == 0) {
            return (i == -1) != this.f5023x;
        }
        return ((i == -1) == this.f5023x) == m2907R0();
    }

    /* JADX INFO: renamed from: V0 */
    public final void m2911V0(int i, RecyclerView.C1186w c1186w) {
        int iM2901L0;
        int i2;
        if (i > 0) {
            iM2901L0 = m2902M0();
            i2 = 1;
        } else {
            iM2901L0 = m2901L0();
            i2 = -1;
        }
        C1209n c1209n = this.f5021v;
        c1209n.f5173a = true;
        m2918c1(iM2901L0, c1186w);
        m2917b1(i2);
        c1209n.f5175c = iM2901L0 + c1209n.f5176d;
        c1209n.f5174b = Math.abs(i);
    }

    /* JADX INFO: renamed from: W0 */
    public final void m2912W0(RecyclerView.C1181r c1181r, C1209n c1209n) {
        if (!c1209n.f5173a || c1209n.f5181i) {
            return;
        }
        if (c1209n.f5174b == 0) {
            if (c1209n.f5177e == -1) {
                m2913X0(c1181r, c1209n.f5179g);
                return;
            } else {
                m2914Y0(c1181r, c1209n.f5178f);
                return;
            }
        }
        int i = 1;
        if (c1209n.f5177e == -1) {
            int i2 = c1209n.f5178f;
            int iM2932h = this.f5016q[0].m2932h(i2);
            while (i < this.f5015p) {
                int iM2932h2 = this.f5016q[i].m2932h(i2);
                if (iM2932h2 > iM2932h) {
                    iM2932h = iM2932h2;
                }
                i++;
            }
            int i3 = i2 - iM2932h;
            m2913X0(c1181r, i3 < 0 ? c1209n.f5179g : c1209n.f5179g - Math.min(i3, c1209n.f5174b));
            return;
        }
        int i4 = c1209n.f5179g;
        int iM2930f = this.f5016q[0].m2930f(i4);
        while (i < this.f5015p) {
            int iM2930f2 = this.f5016q[i].m2930f(i4);
            if (iM2930f2 < iM2930f) {
                iM2930f = iM2930f2;
            }
            i++;
        }
        int i5 = iM2930f - c1209n.f5179g;
        m2914Y0(c1181r, i5 < 0 ? c1209n.f5178f : Math.min(i5, c1209n.f5174b) + c1209n.f5178f);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m2913X0(RecyclerView.C1181r c1181r, int i) {
        for (int iM2860v = m2860v() - 1; iM2860v >= 0; iM2860v--) {
            View viewM2858u = m2858u(iM2860v);
            if (this.f5017r.mo2982e(viewM2858u) < i || this.f5017r.mo2991n(viewM2858u) < i) {
                return;
            }
            C1192c c1192c = (C1192c) viewM2858u.getLayoutParams();
            c1192c.getClass();
            if (c1192c.f5034e.f5051a.size() == 1) {
                return;
            }
            C1195f c1195f = c1192c.f5034e;
            ArrayList<View> arrayList = c1195f.f5051a;
            int size = arrayList.size();
            View viewRemove = arrayList.remove(size - 1);
            C1192c c1192c2 = (C1192c) viewRemove.getLayoutParams();
            c1192c2.f5034e = null;
            if (c1192c2.f4947a.m2802h() || c1192c2.f4947a.m2805k()) {
                c1195f.f5054d -= StaggeredGridLayoutManager.this.f5017r.mo2980c(viewRemove);
            }
            if (size == 1) {
                c1195f.f5052b = Integer.MIN_VALUE;
            }
            c1195f.f5053c = Integer.MIN_VALUE;
            m2851k0(viewM2858u, c1181r);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: Y */
    public final void mo2656Y(int i, int i2) {
        m2905P0(i, i2, 1);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m2914Y0(RecyclerView.C1181r c1181r, int i) {
        while (m2860v() > 0) {
            View viewM2858u = m2858u(0);
            if (this.f5017r.mo2979b(viewM2858u) > i || this.f5017r.mo2990m(viewM2858u) > i) {
                return;
            }
            C1192c c1192c = (C1192c) viewM2858u.getLayoutParams();
            c1192c.getClass();
            if (c1192c.f5034e.f5051a.size() == 1) {
                return;
            }
            C1195f c1195f = c1192c.f5034e;
            ArrayList<View> arrayList = c1195f.f5051a;
            View viewRemove = arrayList.remove(0);
            C1192c c1192c2 = (C1192c) viewRemove.getLayoutParams();
            c1192c2.f5034e = null;
            if (arrayList.size() == 0) {
                c1195f.f5053c = Integer.MIN_VALUE;
            }
            if (c1192c2.f4947a.m2802h() || c1192c2.f4947a.m2805k()) {
                c1195f.f5054d -= StaggeredGridLayoutManager.this.f5017r.mo2980c(viewRemove);
            }
            c1195f.f5052b = Integer.MIN_VALUE;
            m2851k0(viewM2858u, c1181r);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: Z */
    public final void mo2657Z() {
        this.f5005B.m2921a();
        m2854n0();
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m2915Z0() {
        if (this.f5019t == 1 || !m2907R0()) {
            this.f5023x = this.f5022w;
        } else {
            this.f5023x = !this.f5022w;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1185v.b
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF mo2710a(int i) {
        int i2 = -1;
        if (m2860v() != 0) {
            if ((i < m2901L0()) == this.f5023x) {
            }
        } else if (this.f5023x) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.f5019t == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: a0 */
    public final void mo2658a0(int i, int i2) {
        m2905P0(i, i2, 8);
    }

    /* JADX INFO: renamed from: a1 */
    public final int m2916a1(int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        if (m2860v() == 0 || i == 0) {
            return 0;
        }
        m2911V0(i, c1186w);
        C1209n c1209n = this.f5021v;
        int iM2896G0 = m2896G0(c1181r, c1209n, c1186w);
        if (c1209n.f5174b >= iM2896G0) {
            i = i < 0 ? -iM2896G0 : iM2896G0;
        }
        this.f5017r.mo2992o(-i);
        this.f5007D = this.f5023x;
        c1209n.f5174b = 0;
        m2912W0(c1181r, c1209n);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: b0 */
    public final void mo2659b0(int i, int i2) {
        m2905P0(i, i2, 2);
    }

    /* JADX INFO: renamed from: b1 */
    public final void m2917b1(int i) {
        C1209n c1209n = this.f5021v;
        c1209n.f5177e = i;
        c1209n.f5176d = this.f5023x != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: c */
    public final void mo2713c(String str) {
        if (this.f5009F == null) {
            super.mo2713c(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: c0 */
    public final void mo2660c0(int i, int i2) {
        m2905P0(i, i2, 4);
    }

    /* JADX INFO: renamed from: c1 */
    public final void m2918c1(int i, RecyclerView.C1186w c1186w) {
        int iMo2989l;
        int iMo2989l2;
        int i2;
        C1209n c1209n = this.f5021v;
        boolean z = false;
        c1209n.f5174b = 0;
        c1209n.f5175c = i;
        C1210o c1210o = this.f4930e;
        if (!(c1210o != null && c1210o.f4972e) || (i2 = c1186w.f4983a) == -1) {
            iMo2989l = 0;
            iMo2989l2 = 0;
        } else {
            if (this.f5023x == (i2 < i)) {
                iMo2989l = this.f5017r.mo2989l();
                iMo2989l2 = 0;
            } else {
                iMo2989l2 = this.f5017r.mo2989l();
                iMo2989l = 0;
            }
        }
        RecyclerView recyclerView = this.f4927b;
        if (recyclerView == null || !recyclerView.f4854h) {
            c1209n.f5179g = this.f5017r.mo2983f() + iMo2989l;
            c1209n.f5178f = -iMo2989l2;
        } else {
            c1209n.f5178f = this.f5017r.mo2988k() - iMo2989l2;
            c1209n.f5179g = this.f5017r.mo2984g() + iMo2989l;
        }
        c1209n.f5180h = false;
        c1209n.f5173a = true;
        if (this.f5017r.mo2986i() == 0 && this.f5017r.mo2983f() == 0) {
            z = true;
        }
        c1209n.f5181i = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: d */
    public final boolean mo2714d() {
        return this.f5019t == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: d0 */
    public final void mo2662d0(RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        m2909T0(c1181r, c1186w, true);
    }

    /* JADX INFO: renamed from: d1 */
    public final void m2919d1(C1195f c1195f, int i, int i2) {
        int i3 = c1195f.f5054d;
        int i4 = c1195f.f5055e;
        if (i != -1) {
            int i5 = c1195f.f5053c;
            if (i5 == Integer.MIN_VALUE) {
                c1195f.m2925a();
                i5 = c1195f.f5053c;
            }
            if (i5 - i3 >= i2) {
                this.f5024y.set(i4, false);
                return;
            }
            return;
        }
        int i6 = c1195f.f5052b;
        if (i6 == Integer.MIN_VALUE) {
            View view = c1195f.f5051a.get(0);
            C1192c c1192c = (C1192c) view.getLayoutParams();
            c1195f.f5052b = StaggeredGridLayoutManager.this.f5017r.mo2982e(view);
            c1192c.getClass();
            i6 = c1195f.f5052b;
        }
        if (i6 + i3 <= i2) {
            this.f5024y.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: e */
    public final boolean mo2716e() {
        return this.f5019t == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: e0 */
    public final void mo2663e0(RecyclerView.C1186w c1186w) {
        this.f5025z = -1;
        this.f5004A = Integer.MIN_VALUE;
        this.f5009F = null;
        this.f5011H.m2920a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: f */
    public final boolean mo2664f(RecyclerView.C1176m c1176m) {
        return c1176m instanceof C1192c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: f0 */
    public final void mo2718f0(Parcelable parcelable) {
        if (parcelable instanceof C1194e) {
            C1194e c1194e = (C1194e) parcelable;
            this.f5009F = c1194e;
            if (this.f5025z != -1) {
                c1194e.f5044d = null;
                c1194e.f5043c = 0;
                c1194e.f5041a = -1;
                c1194e.f5042b = -1;
                c1194e.f5044d = null;
                c1194e.f5043c = 0;
                c1194e.f5045e = 0;
                c1194e.f5046f = null;
                c1194e.f5047g = null;
            }
            m2854n0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: g0 */
    public final Parcelable mo2720g0() {
        int iM2932h;
        int iMo2988k;
        int[] iArr;
        C1194e c1194e = this.f5009F;
        if (c1194e != null) {
            C1194e c1194e2 = new C1194e();
            c1194e2.f5043c = c1194e.f5043c;
            c1194e2.f5041a = c1194e.f5041a;
            c1194e2.f5042b = c1194e.f5042b;
            c1194e2.f5044d = c1194e.f5044d;
            c1194e2.f5045e = c1194e.f5045e;
            c1194e2.f5046f = c1194e.f5046f;
            c1194e2.f5048h = c1194e.f5048h;
            c1194e2.f5049i = c1194e.f5049i;
            c1194e2.f5050j = c1194e.f5050j;
            c1194e2.f5047g = c1194e.f5047g;
            return c1194e2;
        }
        C1194e c1194e3 = new C1194e();
        c1194e3.f5048h = this.f5022w;
        c1194e3.f5049i = this.f5007D;
        c1194e3.f5050j = this.f5008E;
        C1193d c1193d = this.f5005B;
        if (c1193d == null || (iArr = c1193d.f5035a) == null) {
            c1194e3.f5045e = 0;
        } else {
            c1194e3.f5046f = iArr;
            c1194e3.f5045e = iArr.length;
            c1194e3.f5047g = c1193d.f5036b;
        }
        if (m2860v() <= 0) {
            c1194e3.f5041a = -1;
            c1194e3.f5042b = -1;
            c1194e3.f5043c = 0;
            return c1194e3;
        }
        c1194e3.f5041a = this.f5007D ? m2902M0() : m2901L0();
        View viewM2897H0 = this.f5023x ? m2897H0(true) : m2898I0(true);
        c1194e3.f5042b = viewM2897H0 != null ? RecyclerView.AbstractC1175l.m2827H(viewM2897H0) : -1;
        int i = this.f5015p;
        c1194e3.f5043c = i;
        c1194e3.f5044d = new int[i];
        for (int i2 = 0; i2 < this.f5015p; i2++) {
            if (this.f5007D) {
                iM2932h = this.f5016q[i2].m2930f(Integer.MIN_VALUE);
                if (iM2932h != Integer.MIN_VALUE) {
                    iMo2988k = this.f5017r.mo2984g();
                    iM2932h -= iMo2988k;
                }
            } else {
                iM2932h = this.f5016q[i2].m2932h(Integer.MIN_VALUE);
                if (iM2932h != Integer.MIN_VALUE) {
                    iMo2988k = this.f5017r.mo2988k();
                    iM2932h -= iMo2988k;
                }
            }
            c1194e3.f5044d[i2] = iM2932h;
        }
        return c1194e3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: h */
    public final void mo2721h(int i, int i2, RecyclerView.C1186w c1186w, RunnableC1208m.b bVar) {
        C1209n c1209n;
        int iM2930f;
        int iM2932h;
        if (this.f5019t != 0) {
            i = i2;
        }
        if (m2860v() == 0 || i == 0) {
            return;
        }
        m2911V0(i, c1186w);
        int[] iArr = this.f5013J;
        if (iArr == null || iArr.length < this.f5015p) {
            this.f5013J = new int[this.f5015p];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f5015p;
            c1209n = this.f5021v;
            if (i3 >= i5) {
                break;
            }
            if (c1209n.f5176d == -1) {
                iM2930f = c1209n.f5178f;
                iM2932h = this.f5016q[i3].m2932h(iM2930f);
            } else {
                iM2930f = this.f5016q[i3].m2930f(c1209n.f5179g);
                iM2932h = c1209n.f5179g;
            }
            int i6 = iM2930f - iM2932h;
            if (i6 >= 0) {
                this.f5013J[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f5013J, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = c1209n.f5175c;
            if (i8 < 0 || i8 >= c1186w.m2887b()) {
                return;
            }
            bVar.m2975a(c1209n.f5175c, this.f5013J[i7]);
            c1209n.f5175c += c1209n.f5176d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: h0 */
    public final void mo2848h0(int i) {
        if (i == 0) {
            m2892C0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: j */
    public final int mo2723j(RecyclerView.C1186w c1186w) {
        return m2893D0(c1186w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: k */
    public final int mo2669k(RecyclerView.C1186w c1186w) {
        return m2894E0(c1186w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: l */
    public final int mo2671l(RecyclerView.C1186w c1186w) {
        return m2895F0(c1186w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: m */
    public final int mo2724m(RecyclerView.C1186w c1186w) {
        return m2893D0(c1186w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: n */
    public final int mo2674n(RecyclerView.C1186w c1186w) {
        return m2894E0(c1186w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: o */
    public final int mo2676o(RecyclerView.C1186w c1186w) {
        return m2895F0(c1186w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: o0 */
    public final int mo2677o0(int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        return m2916a1(i, c1181r, c1186w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: p0 */
    public final void mo2725p0(int i) {
        C1194e c1194e = this.f5009F;
        if (c1194e != null && c1194e.f5041a != i) {
            c1194e.f5044d = null;
            c1194e.f5043c = 0;
            c1194e.f5041a = -1;
            c1194e.f5042b = -1;
        }
        this.f5025z = i;
        this.f5004A = Integer.MIN_VALUE;
        m2854n0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: q0 */
    public final int mo2679q0(int i, RecyclerView.C1181r c1181r, RecyclerView.C1186w c1186w) {
        return m2916a1(i, c1181r, c1186w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: r */
    public final RecyclerView.C1176m mo2680r() {
        return this.f5019t == 0 ? new C1192c(-2, -1) : new C1192c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: s */
    public final RecyclerView.C1176m mo2681s(Context context, AttributeSet attributeSet) {
        return new C1192c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: t */
    public final RecyclerView.C1176m mo2682t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1192c((ViewGroup.MarginLayoutParams) layoutParams) : new C1192c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: t0 */
    public final void mo2683t0(Rect rect, int i, int i2) {
        int iM2831g;
        int iM2831g2;
        int i3 = this.f5015p;
        int iM2839F = m2839F() + m2838E();
        int iM2837D = m2837D() + m2840G();
        if (this.f5019t == 1) {
            int iHeight = rect.height() + iM2837D;
            RecyclerView recyclerView = this.f4927b;
            WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
            iM2831g2 = RecyclerView.AbstractC1175l.m2831g(i2, iHeight, recyclerView.getMinimumHeight());
            iM2831g = RecyclerView.AbstractC1175l.m2831g(i, (this.f5020u * i3) + iM2839F, this.f4927b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM2839F;
            RecyclerView recyclerView2 = this.f4927b;
            WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
            iM2831g = RecyclerView.AbstractC1175l.m2831g(i, iWidth, recyclerView2.getMinimumWidth());
            iM2831g2 = RecyclerView.AbstractC1175l.m2831g(i2, (this.f5020u * i3) + iM2837D, this.f4927b.getMinimumHeight());
        }
        this.f4927b.setMeasuredDimension(iM2831g, iM2831g2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1175l
    /* JADX INFO: renamed from: z0 */
    public final void mo1486z0(RecyclerView recyclerView, int i) {
        C1210o c1210o = new C1210o(recyclerView.getContext());
        c1210o.f4968a = i;
        m2834A0(c1210o);
    }
}
