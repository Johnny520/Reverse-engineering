package androidx.recyclerview.widget;

import android.os.Trace;
import androidx.compose.foundation.text.selection.C1758;
import androidx.core.os.AbstractC3010;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3335 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final ThreadLocal f7835 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C3332 f7836 = new C3332();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f7838;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f7839;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f7840 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ArrayList f7837 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static AbstractC3317 m5523(RecyclerView recyclerView, int i, long j) {
        int iM5508 = recyclerView.f7573.m5508();
        for (int i2 = 0; i2 < iM5508; i2++) {
            AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(recyclerView.f7573.m5504(i2));
            if (abstractC3317M5249.mPosition == i && !abstractC3317M5249.isInvalid()) {
                return null;
            }
        }
        C3364 c3364 = recyclerView.f7576;
        if (j == Long.MAX_VALUE) {
            try {
                if (AbstractC3010.m4533()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.m5312(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.m5313();
        AbstractC3317 abstractC3317M5600 = c3364.m5600(i, j);
        if (abstractC3317M5600 != null) {
            if (!abstractC3317M5600.isBound() || abstractC3317M5600.isInvalid()) {
                c3364.m5594(abstractC3317M5600, false);
            } else {
                c3364.m5601(abstractC3317M5600.itemView);
            }
        }
        recyclerView.m5312(false);
        Trace.endSection();
        return abstractC3317M5600;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f7840;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m5524(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f7839);
                }
            }
        } finally {
            this.f7838 = 0L;
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m5524(long j) {
        C3331 c3331;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C3331 c33312;
        ArrayList arrayList = this.f7840;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            C1758 c1758 = recyclerView3.f7587;
            if (windowVisibility == 0) {
                c1758.m2386(recyclerView3, false);
                i += c1758.f2956;
            }
        }
        ArrayList arrayList2 = this.f7837;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                C1758 c17582 = recyclerView4.f7587;
                int iAbs = Math.abs(c17582.f2957) + Math.abs(c17582.f2958);
                for (?? r11 = z; r11 < c17582.f2956 * 2; r11 += 2) {
                    if (i4 >= arrayList2.size()) {
                        c33312 = new C3331();
                        arrayList2.add(c33312);
                    } else {
                        c33312 = (C3331) arrayList2.get(i4);
                    }
                    int[] iArr = (int[]) c17582.f2955;
                    int i5 = iArr[r11 + 1];
                    if (i5 <= iAbs) {
                        z = true;
                    }
                    c33312.f7830 = z;
                    c33312.f7829 = iAbs;
                    c33312.f7828 = i5;
                    c33312.f7827 = recyclerView4;
                    c33312.f7826 = iArr[r11];
                    i4++;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, f7836);
        for (int i6 = 0; i6 < arrayList2.size() && (recyclerView = (c3331 = (C3331) arrayList2.get(i6)).f7827) != null; i6++) {
            AbstractC3317 abstractC3317M5523 = m5523(recyclerView, c3331.f7826, c3331.f7830 ? Long.MAX_VALUE : j);
            if (abstractC3317M5523 != null && abstractC3317M5523.mNestedRecyclerView != null && abstractC3317M5523.isBound() && !abstractC3317M5523.isInvalid() && (recyclerView2 = abstractC3317M5523.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.f7530 && recyclerView2.f7573.m5508() != 0) {
                    C3364 c3364 = recyclerView2.f7576;
                    AbstractC3369 abstractC3369 = recyclerView2.f7599;
                    if (abstractC3369 != null) {
                        abstractC3369.mo5528();
                    }
                    AbstractC3352 abstractC3352 = recyclerView2.f7538;
                    if (abstractC3352 != null) {
                        abstractC3352.m5567(c3364);
                        recyclerView2.f7538.m5560(c3364);
                    }
                    c3364.f7980.clear();
                    c3364.m5598();
                }
                C1758 c17583 = recyclerView2.f7587;
                c17583.m2386(recyclerView2, true);
                if (c17583.f2956 != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        C3358 c3358 = recyclerView2.f7586;
                        AbstractC3283 abstractC3283 = recyclerView2.f7539;
                        c3358.f7955 = 1;
                        c3358.f7954 = abstractC3283.mo5354();
                        c3358.f7962 = false;
                        c3358.f7961 = false;
                        c3358.f7965 = false;
                        for (int i7 = 0; i7 < c17583.f2956 * 2; i7 += 2) {
                            m5523(recyclerView2, ((int[]) c17583.f2955)[i7], j);
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            c3331.f7830 = false;
            c3331.f7829 = 0;
            c3331.f7828 = 0;
            c3331.f7827 = null;
            c3331.f7826 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5525(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f7545) {
            if (RecyclerView.f7521 && !this.f7840.contains(recyclerView)) {
                C6755.m11870("attempting to post unregistered view!");
                return;
            } else if (this.f7838 == 0) {
                this.f7838 = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C1758 c1758 = recyclerView.f7587;
        c1758.f2958 = i;
        c1758.f2957 = i2;
    }
}
