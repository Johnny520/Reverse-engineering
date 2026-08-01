package androidx.recyclerview.widget;

import android.os.Trace;
import androidx.compose.foundation.text.selection.C0920;
import androidx.core.os.AbstractC2177;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2502 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final ThreadLocal f7490 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C2499 f7491 = new C2499();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f7493;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f7494;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f7495 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ArrayList f7492 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static AbstractC2484 m4963(RecyclerView recyclerView, int i, long j) {
        int iM4948 = recyclerView.f7228.m4948();
        for (int i2 = 0; i2 < iM4948; i2++) {
            AbstractC2484 abstractC2484M4689 = RecyclerView.m4689(recyclerView.f7228.m4944(i2));
            if (abstractC2484M4689.mPosition == i && !abstractC2484M4689.isInvalid()) {
                return null;
            }
        }
        C2531 c2531 = recyclerView.f7231;
        if (j == Long.MAX_VALUE) {
            try {
                if (AbstractC2177.m3973()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.m4752(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.m4753();
        AbstractC2484 abstractC2484M5040 = c2531.m5040(i, j);
        if (abstractC2484M5040 != null) {
            if (!abstractC2484M5040.isBound() || abstractC2484M5040.isInvalid()) {
                c2531.m5034(abstractC2484M5040, false);
            } else {
                c2531.m5041(abstractC2484M5040.itemView);
            }
        }
        recyclerView.m4752(false);
        Trace.endSection();
        return abstractC2484M5040;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f7495;
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
                    m4964(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f7494);
                }
            }
        } finally {
            this.f7493 = 0L;
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4964(long j) {
        C2498 c2498;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C2498 c24982;
        ArrayList arrayList = this.f7495;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            C0920 c0920 = recyclerView3.f7242;
            if (windowVisibility == 0) {
                c0920.m1826(recyclerView3, false);
                i += c0920.f2611;
            }
        }
        ArrayList arrayList2 = this.f7492;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0920 c09202 = recyclerView4.f7242;
                int iAbs = Math.abs(c09202.f2612) + Math.abs(c09202.f2613);
                for (?? r11 = z; r11 < c09202.f2611 * 2; r11 += 2) {
                    if (i4 >= arrayList2.size()) {
                        c24982 = new C2498();
                        arrayList2.add(c24982);
                    } else {
                        c24982 = (C2498) arrayList2.get(i4);
                    }
                    int[] iArr = (int[]) c09202.f2610;
                    int i5 = iArr[r11 + 1];
                    if (i5 <= iAbs) {
                        z = true;
                    }
                    c24982.f7485 = z;
                    c24982.f7484 = iAbs;
                    c24982.f7483 = i5;
                    c24982.f7482 = recyclerView4;
                    c24982.f7481 = iArr[r11];
                    i4++;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, f7491);
        for (int i6 = 0; i6 < arrayList2.size() && (recyclerView = (c2498 = (C2498) arrayList2.get(i6)).f7482) != null; i6++) {
            AbstractC2484 abstractC2484M4963 = m4963(recyclerView, c2498.f7481, c2498.f7485 ? Long.MAX_VALUE : j);
            if (abstractC2484M4963 != null && abstractC2484M4963.mNestedRecyclerView != null && abstractC2484M4963.isBound() && !abstractC2484M4963.isInvalid() && (recyclerView2 = abstractC2484M4963.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.f7185 && recyclerView2.f7228.m4948() != 0) {
                    C2531 c2531 = recyclerView2.f7231;
                    AbstractC2536 abstractC2536 = recyclerView2.f7254;
                    if (abstractC2536 != null) {
                        abstractC2536.mo4968();
                    }
                    AbstractC2519 abstractC2519 = recyclerView2.f7193;
                    if (abstractC2519 != null) {
                        abstractC2519.m5007(c2531);
                        recyclerView2.f7193.m5000(c2531);
                    }
                    c2531.f7635.clear();
                    c2531.m5038();
                }
                C0920 c09203 = recyclerView2.f7242;
                c09203.m1826(recyclerView2, true);
                if (c09203.f2611 != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        C2525 c2525 = recyclerView2.f7241;
                        AbstractC2450 abstractC2450 = recyclerView2.f7194;
                        c2525.f7610 = 1;
                        c2525.f7609 = abstractC2450.mo4794();
                        c2525.f7617 = false;
                        c2525.f7616 = false;
                        c2525.f7620 = false;
                        for (int i7 = 0; i7 < c09203.f2611 * 2; i7 += 2) {
                            m4963(recyclerView2, ((int[]) c09203.f2610)[i7], j);
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            c2498.f7485 = false;
            c2498.f7484 = 0;
            c2498.f7483 = 0;
            c2498.f7482 = null;
            c2498.f7481 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4965(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f7200) {
            if (RecyclerView.f7176 && !this.f7495.contains(recyclerView)) {
                C5925.m11311("attempting to post unregistered view!");
                return;
            } else if (this.f7493 == 0) {
                this.f7493 = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C0920 c0920 = recyclerView.f7242;
        c0920.f2613 = i;
        c0920.f2612 = i2;
    }
}
