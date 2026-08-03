package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000a.C0181Jg;
import p000a.C0866ug;
import p000a.C0944z;

/* JADX INFO: renamed from: androidx.recyclerview.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1197b {

    /* JADX INFO: renamed from: a */
    public final C1217v f5065a;

    /* JADX INFO: renamed from: e */
    public View f5069e;

    /* JADX INFO: renamed from: d */
    public int f5068d = 0;

    /* JADX INFO: renamed from: b */
    public final a f5066b = new a();

    /* JADX INFO: renamed from: c */
    public final ArrayList f5067c = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public long f5070a = 0;

        /* JADX INFO: renamed from: b */
        public a f5071b;

        /* JADX INFO: renamed from: a */
        public final void m2953a(int i) {
            if (i < 64) {
                this.f5070a &= ~(1 << i);
                return;
            }
            a aVar = this.f5071b;
            if (aVar != null) {
                aVar.m2953a(i - 64);
            }
        }

        /* JADX INFO: renamed from: b */
        public final int m2954b(int i) {
            a aVar = this.f5071b;
            if (aVar == null) {
                return i >= 64 ? Long.bitCount(this.f5070a) : Long.bitCount(this.f5070a & ((1 << i) - 1));
            }
            if (i < 64) {
                return Long.bitCount(this.f5070a & ((1 << i) - 1));
            }
            return Long.bitCount(this.f5070a) + aVar.m2954b(i - 64);
        }

        /* JADX INFO: renamed from: c */
        public final void m2955c() {
            if (this.f5071b == null) {
                this.f5071b = new a();
            }
        }

        /* JADX INFO: renamed from: d */
        public final boolean m2956d(int i) {
            if (i < 64) {
                return (this.f5070a & (1 << i)) != 0;
            }
            m2955c();
            return this.f5071b.m2956d(i - 64);
        }

        /* JADX INFO: renamed from: e */
        public final void m2957e(int i, boolean z) {
            if (i >= 64) {
                m2955c();
                this.f5071b.m2957e(i - 64, z);
                return;
            }
            long j = this.f5070a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f5070a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                m2960h(i);
            } else {
                m2953a(i);
            }
            if (z2 || this.f5071b != null) {
                m2955c();
                this.f5071b.m2957e(0, z2);
            }
        }

        /* JADX INFO: renamed from: f */
        public final boolean m2958f(int i) {
            if (i >= 64) {
                m2955c();
                return this.f5071b.m2958f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f5070a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f5070a = j3;
            long j4 = j - 1;
            this.f5070a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.f5071b;
            if (aVar != null) {
                if (aVar.m2956d(0)) {
                    m2960h(63);
                }
                this.f5071b.m2958f(0);
            }
            return z;
        }

        /* JADX INFO: renamed from: g */
        public final void m2959g() {
            this.f5070a = 0L;
            a aVar = this.f5071b;
            if (aVar != null) {
                aVar.m2959g();
            }
        }

        /* JADX INFO: renamed from: h */
        public final void m2960h(int i) {
            if (i < 64) {
                this.f5070a |= 1 << i;
            } else {
                m2955c();
                this.f5071b.m2960h(i - 64);
            }
        }

        public final String toString() {
            if (this.f5071b == null) {
                return Long.toBinaryString(this.f5070a);
            }
            return this.f5071b.toString() + "xx" + Long.toBinaryString(this.f5070a);
        }
    }

    public C1197b(C1217v c1217v) {
        this.f5065a = c1217v;
    }

    /* JADX INFO: renamed from: a */
    public final void m2943a(View view, int i, boolean z) {
        RecyclerView recyclerView = this.f5065a.f5197a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m2948f(i);
        this.f5066b.m2957e(childCount, z);
        if (z) {
            m2951i(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.m2735L(view);
    }

    /* JADX INFO: renamed from: b */
    public final void m2944b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        RecyclerView recyclerView = this.f5065a.f5197a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m2948f(i);
        this.f5066b.m2957e(childCount, z);
        if (z) {
            m2951i(view);
        }
        RecyclerView.AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(view);
        if (abstractC1163AM2735L != null) {
            if (!abstractC1163AM2735L.m2804j() && !abstractC1163AM2735L.m2809o()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(abstractC1163AM2735L);
                throw new IllegalArgumentException(C0944z.m2224d(recyclerView, sb));
            }
            if (RecyclerView.f4816z0) {
                Log.d("RecyclerView", "reAttach " + abstractC1163AM2735L);
            }
            abstractC1163AM2735L.f4900j &= -257;
        } else if (RecyclerView.f4815y0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(C0944z.m2224d(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public final void m2945c(int i) {
        int iM2948f = m2948f(i);
        this.f5066b.m2958f(iM2948f);
        RecyclerView recyclerView = this.f5065a.f5197a;
        View childAt = recyclerView.getChildAt(iM2948f);
        if (childAt != null) {
            RecyclerView.AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(childAt);
            if (abstractC1163AM2735L != null) {
                if (abstractC1163AM2735L.m2804j() && !abstractC1163AM2735L.m2809o()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(abstractC1163AM2735L);
                    throw new IllegalArgumentException(C0944z.m2224d(recyclerView, sb));
                }
                if (RecyclerView.f4816z0) {
                    Log.d("RecyclerView", "tmpDetach " + abstractC1163AM2735L);
                }
                abstractC1163AM2735L.m2795a(256);
            }
        } else if (RecyclerView.f4815y0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iM2948f);
            throw new IllegalArgumentException(C0944z.m2224d(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iM2948f);
    }

    /* JADX INFO: renamed from: d */
    public final View m2946d(int i) {
        return this.f5065a.f5197a.getChildAt(m2948f(i));
    }

    /* JADX INFO: renamed from: e */
    public final int m2947e() {
        return this.f5065a.f5197a.getChildCount() - this.f5067c.size();
    }

    /* JADX INFO: renamed from: f */
    public final int m2948f(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f5065a.f5197a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            a aVar = this.f5066b;
            int iM2954b = i - (i2 - aVar.m2954b(i2));
            if (iM2954b == 0) {
                while (aVar.m2956d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM2954b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public final View m2949g(int i) {
        return this.f5065a.f5197a.getChildAt(i);
    }

    /* JADX INFO: renamed from: h */
    public final int m2950h() {
        return this.f5065a.f5197a.getChildCount();
    }

    /* JADX INFO: renamed from: i */
    public final void m2951i(View view) {
        this.f5067c.add(view);
        C1217v c1217v = this.f5065a;
        RecyclerView.AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(view);
        if (abstractC1163AM2735L != null) {
            int i = abstractC1163AM2735L.f4907q;
            View view2 = abstractC1163AM2735L.f4891a;
            if (i != -1) {
                abstractC1163AM2735L.f4906p = i;
            } else {
                WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                abstractC1163AM2735L.f4906p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c1217v.f5197a;
            if (recyclerView.m2756O()) {
                abstractC1163AM2735L.f4907q = 4;
                recyclerView.f4877s0.add(abstractC1163AM2735L);
            } else {
                WeakHashMap<View, C0181Jg> weakHashMap2 = C0866ug.f3395a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2952j(View view) {
        if (this.f5067c.remove(view)) {
            C1217v c1217v = this.f5065a;
            RecyclerView.AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(view);
            if (abstractC1163AM2735L != null) {
                int i = abstractC1163AM2735L.f4906p;
                RecyclerView recyclerView = c1217v.f5197a;
                if (recyclerView.m2756O()) {
                    abstractC1163AM2735L.f4907q = i;
                    recyclerView.f4877s0.add(abstractC1163AM2735L);
                } else {
                    WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
                    abstractC1163AM2735L.f4891a.setImportantForAccessibility(i);
                }
                abstractC1163AM2735L.f4906p = 0;
            }
        }
    }

    public final String toString() {
        return this.f5066b.toString() + ", hidden list:" + this.f5067c.size();
    }
}
