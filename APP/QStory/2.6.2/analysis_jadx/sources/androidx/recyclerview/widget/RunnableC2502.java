package androidx.recyclerview.widget;

import android.os.Trace;
import androidx.compose.foundation.text.selection.C0920;
import androidx.core.os.AbstractC2177;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2502 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final ThreadLocal f7489 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C2499 f7490 = new C2499();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public long f7492;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f7493;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f7494 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final ArrayList f7491 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static AbstractC2484 m4953(RecyclerView recyclerView, int i, long j) {
        int iM4938 = recyclerView.f7227.m4938();
        for (int i2 = 0; i2 < iM4938; i2++) {
            AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(recyclerView.f7227.m4934(i2));
            if (abstractC2484M4679.mPosition == i && !abstractC2484M4679.isInvalid()) {
                return null;
            }
        }
        C2531 c2531 = recyclerView.f7230;
        if (j == Long.MAX_VALUE) {
            try {
                if (AbstractC2177.m3963()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                recyclerView.m4742(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.m4743();
        AbstractC2484 abstractC2484M5030 = c2531.m5030(i, j);
        if (abstractC2484M5030 != null) {
            if (!abstractC2484M5030.isBound() || abstractC2484M5030.isInvalid()) {
                c2531.m5024(abstractC2484M5030, false);
            } else {
                c2531.m5031(abstractC2484M5030.itemView);
            }
        }
        recyclerView.m4742(false);
        Trace.endSection();
        return abstractC2484M5030;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f7494;
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
                    m4954(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f7493);
                }
            }
        } finally {
            this.f7492 = 0L;
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m4954(long j) {
        C2498 c2498;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C2498 c24982;
        ArrayList arrayList = this.f7494;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            C0920 c0920 = recyclerView3.f7241;
            if (windowVisibility == 0) {
                c0920.m1816(recyclerView3, false);
                i += c0920.f2610;
            }
        }
        ArrayList arrayList2 = this.f7491;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0920 c09202 = recyclerView4.f7241;
                int iAbs = Math.abs(c09202.f2611) + Math.abs(c09202.f2612);
                for (?? r11 = z; r11 < c09202.f2610 * 2; r11 += 2) {
                    if (i4 >= arrayList2.size()) {
                        c24982 = new C2498();
                        arrayList2.add(c24982);
                    } else {
                        c24982 = (C2498) arrayList2.get(i4);
                    }
                    int[] iArr = (int[]) c09202.f2609;
                    int i5 = iArr[r11 + 1];
                    if (i5 <= iAbs) {
                        z = true;
                    }
                    c24982.f7484 = z;
                    c24982.f7483 = iAbs;
                    c24982.f7482 = i5;
                    c24982.f7481 = recyclerView4;
                    c24982.f7480 = iArr[r11];
                    i4++;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, f7490);
        for (int i6 = 0; i6 < arrayList2.size() && (recyclerView = (c2498 = (C2498) arrayList2.get(i6)).f7481) != null; i6++) {
            AbstractC2484 abstractC2484M4953 = m4953(recyclerView, c2498.f7480, c2498.f7484 ? Long.MAX_VALUE : j);
            if (abstractC2484M4953 != null && abstractC2484M4953.mNestedRecyclerView != null && abstractC2484M4953.isBound() && !abstractC2484M4953.isInvalid() && (recyclerView2 = abstractC2484M4953.mNestedRecyclerView.get()) != null) {
                if (recyclerView2.f7184 && recyclerView2.f7227.m4938() != 0) {
                    C2531 c2531 = recyclerView2.f7230;
                    AbstractC2536 abstractC2536 = recyclerView2.f7253;
                    if (abstractC2536 != null) {
                        abstractC2536.mo4958();
                    }
                    AbstractC2519 abstractC2519 = recyclerView2.f7192;
                    if (abstractC2519 != null) {
                        abstractC2519.m4997(c2531);
                        recyclerView2.f7192.m4990(c2531);
                    }
                    c2531.f7634.clear();
                    c2531.m5028();
                }
                C0920 c09203 = recyclerView2.f7241;
                c09203.m1816(recyclerView2, true);
                if (c09203.f2610 != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        C2525 c2525 = recyclerView2.f7240;
                        AbstractC2450 abstractC2450 = recyclerView2.f7193;
                        c2525.f7609 = 1;
                        c2525.f7608 = abstractC2450.mo4784();
                        c2525.f7616 = false;
                        c2525.f7615 = false;
                        c2525.f7619 = false;
                        for (int i7 = 0; i7 < c09203.f2610 * 2; i7 += 2) {
                            m4953(recyclerView2, ((int[]) c09203.f2609)[i7], j);
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            c2498.f7484 = false;
            c2498.f7483 = 0;
            c2498.f7482 = 0;
            c2498.f7481 = null;
            c2498.f7480 = 0;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m4955(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f7199) {
            if (RecyclerView.f7175 && !this.f7494.contains(recyclerView)) {
                C5919.m11250("attempting to post unregistered view!");
                return;
            } else if (this.f7492 == 0) {
                this.f7492 = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C0920 c0920 = recyclerView.f7241;
        c0920.f2612 = i;
        c0920.f2611 = i2;
    }
}
