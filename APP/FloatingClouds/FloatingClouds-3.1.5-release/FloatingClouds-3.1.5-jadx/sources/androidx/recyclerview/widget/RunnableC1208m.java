package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p000a.C0016Af;

/* JADX INFO: renamed from: androidx.recyclerview.widget.m */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1208m implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal<RunnableC1208m> f5158e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f */
    public static final a f5159f = new a();

    /* JADX INFO: renamed from: b */
    public long f5161b;

    /* JADX INFO: renamed from: c */
    public long f5162c;

    /* JADX INFO: renamed from: a */
    public final ArrayList<RecyclerView> f5160a = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final ArrayList<c> f5163d = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.m$a */
    public class a implements Comparator<c> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            RecyclerView recyclerView = cVar3.f5171d;
            if ((recyclerView == null) == (cVar4.f5171d == null)) {
                boolean z = cVar3.f5168a;
                if (z == cVar4.f5168a) {
                    int i = cVar4.f5169b - cVar3.f5169b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = cVar3.f5170c - cVar4.f5170c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                }
                if (z) {
                    return -1;
                }
            } else if (recyclerView != null) {
                return -1;
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.m$b */
    @SuppressLint({"VisibleForTests"})
    public static class b {

        /* JADX INFO: renamed from: a */
        public int f5164a;

        /* JADX INFO: renamed from: b */
        public int f5165b;

        /* JADX INFO: renamed from: c */
        public int[] f5166c;

        /* JADX INFO: renamed from: d */
        public int f5167d;

        /* JADX INFO: renamed from: a */
        public final void m2975a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f5167d;
            int i4 = i3 * 2;
            int[] iArr = this.f5166c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f5166c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.f5166c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f5166c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.f5167d++;
        }

        /* JADX INFO: renamed from: b */
        public final void m2976b(RecyclerView recyclerView, boolean z) {
            this.f5167d = 0;
            int[] iArr = this.f5166c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC1175l abstractC1175l = recyclerView.f4864m;
            if (recyclerView.f4862l == null || abstractC1175l == null || !abstractC1175l.f4934i) {
                return;
            }
            if (z) {
                if (!recyclerView.f4848e.m2938f()) {
                    abstractC1175l.mo2722i(recyclerView.f4862l.mo109a(), this);
                }
            } else if (!recyclerView.m2755N()) {
                abstractC1175l.mo2721h(this.f5164a, this.f5165b, recyclerView.f4851f0, this);
            }
            int i = this.f5167d;
            if (i > abstractC1175l.f4935j) {
                abstractC1175l.f4935j = i;
                abstractC1175l.f4936k = z;
                recyclerView.f4844c.m2880m();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.m$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public boolean f5168a;

        /* JADX INFO: renamed from: b */
        public int f5169b;

        /* JADX INFO: renamed from: c */
        public int f5170c;

        /* JADX INFO: renamed from: d */
        public RecyclerView f5171d;

        /* JADX INFO: renamed from: e */
        public int f5172e;
    }

    /* JADX INFO: renamed from: c */
    public static RecyclerView.AbstractC1163A m2972c(RecyclerView recyclerView, int i, long j) {
        int iM2950h = recyclerView.f4850f.m2950h();
        for (int i2 = 0; i2 < iM2950h; i2++) {
            RecyclerView.AbstractC1163A abstractC1163AM2735L = RecyclerView.m2735L(recyclerView.f4850f.m2949g(i2));
            if (abstractC1163AM2735L.f4893c == i && !abstractC1163AM2735L.m2800f()) {
                return null;
            }
        }
        RecyclerView.C1181r c1181r = recyclerView.f4844c;
        try {
            recyclerView.m2760S();
            RecyclerView.AbstractC1163A abstractC1163AM2878k = c1181r.m2878k(j, i);
            if (abstractC1163AM2878k != null) {
                if (!abstractC1163AM2878k.m2799e() || abstractC1163AM2878k.m2800f()) {
                    c1181r.m2868a(abstractC1163AM2878k, false);
                } else {
                    c1181r.m2875h(abstractC1163AM2878k.f4891a);
                }
            }
            recyclerView.m2761T(false);
            return abstractC1163AM2878k;
        } catch (Throwable th) {
            recyclerView.m2761T(false);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2973a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f4876s) {
            if (RecyclerView.f4815y0 && !this.f5160a.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f5161b == 0) {
                this.f5161b = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        b bVar = recyclerView.f4849e0;
        bVar.f5164a = i;
        bVar.f5165b = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2974b(long j) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        ArrayList<RecyclerView> arrayList = this.f5160a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                b bVar = recyclerView3.f4849e0;
                bVar.m2976b(recyclerView3, false);
                i += bVar.f5167d;
            }
        }
        ArrayList<c> arrayList2 = this.f5163d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar2 = recyclerView4.f4849e0;
                int iAbs = Math.abs(bVar2.f5165b) + Math.abs(bVar2.f5164a);
                for (int i5 = 0; i5 < bVar2.f5167d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i3);
                    }
                    int[] iArr = bVar2.f5166c;
                    int i6 = iArr[i5 + 1];
                    cVar2.f5168a = i6 <= iAbs;
                    cVar2.f5169b = iAbs;
                    cVar2.f5170c = i6;
                    cVar2.f5171d = recyclerView4;
                    cVar2.f5172e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f5159f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i7)).f5171d) != null; i7++) {
            RecyclerView.AbstractC1163A abstractC1163AM2972c = m2972c(recyclerView, cVar.f5172e, cVar.f5168a ? Long.MAX_VALUE : j);
            if (abstractC1163AM2972c != null && abstractC1163AM2972c.f4892b != null && abstractC1163AM2972c.m2799e() && !abstractC1163AM2972c.m2800f() && (recyclerView2 = abstractC1163AM2972c.f4892b.get()) != null) {
                if (recyclerView2.f4818B && recyclerView2.f4850f.m2950h() != 0) {
                    RecyclerView.AbstractC1172i abstractC1172i = recyclerView2.f4827K;
                    if (abstractC1172i != null) {
                        abstractC1172i.mo2821e();
                    }
                    RecyclerView.AbstractC1175l abstractC1175l = recyclerView2.f4864m;
                    RecyclerView.C1181r c1181r = recyclerView2.f4844c;
                    if (abstractC1175l != null) {
                        abstractC1175l.m2849i0(c1181r);
                        recyclerView2.f4864m.m2850j0(c1181r);
                    }
                    c1181r.f4958a.clear();
                    c1181r.m2873f();
                }
                b bVar3 = recyclerView2.f4849e0;
                bVar3.m2976b(recyclerView2, true);
                if (bVar3.f5167d != 0) {
                    try {
                        int i8 = C0016Af.f53a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.C1186w c1186w = recyclerView2.f4851f0;
                        RecyclerView.AbstractC1167d abstractC1167d = recyclerView2.f4862l;
                        c1186w.f4986d = 1;
                        c1186w.f4987e = abstractC1167d.mo109a();
                        c1186w.f4989g = false;
                        c1186w.f4990h = false;
                        c1186w.f4991i = false;
                        for (int i9 = 0; i9 < bVar3.f5167d * 2; i9 += 2) {
                            m2972c(recyclerView2, bVar3.f5166c[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = C0016Af.f53a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            cVar.f5168a = false;
            cVar.f5169b = 0;
            cVar.f5170c = 0;
            cVar.f5171d = null;
            cVar.f5172e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = C0016Af.f53a;
            Trace.beginSection("RV Prefetch");
            ArrayList<RecyclerView> arrayList = this.f5160a;
            if (arrayList.isEmpty()) {
                this.f5161b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f5161b = 0L;
                Trace.endSection();
            } else {
                m2974b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f5162c);
                this.f5161b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f5161b = 0L;
            int i3 = C0016Af.f53a;
            Trace.endSection();
            throw th;
        }
    }
}
