package yyds;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: yyds.ᛳᲈᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0737 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public long f3422;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ArrayList f3423 = new ArrayList();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final ArrayList f3424 = new ArrayList();

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public long f3425;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final ThreadLocal f3421 = new ThreadLocal();

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final C1300 f3420 = new C1300(14);

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static AbstractC0185 m1694(C1213 c1213, int i, long j) {
        int iM4907 = c1213.f5523.m4907();
        for (int i2 = 0; i2 < iM4907; i2++) {
            AbstractC0185 abstractC0185M2412 = C1213.m2412(c1213.f5523.m4909(i2));
            if (abstractC0185M2412.f1102 == i && !abstractC0185M2412.m780()) {
                return null;
            }
        }
        C2808 c2808 = c1213.f5529;
        if (j == Long.MAX_VALUE) {
            try {
                if (Trace.isEnabled()) {
                    Trace.beginSection("RV Prefetch forced - needed next frame");
                }
            } catch (Throwable th) {
                c1213.m2431(false);
                Trace.endSection();
                throw th;
            }
        }
        c1213.m2465();
        AbstractC0185 abstractC0185M4934 = c2808.m4934(i, j);
        if (abstractC0185M4934 != null) {
            if (!abstractC0185M4934.m786() || abstractC0185M4934.m780()) {
                c2808.m4931(abstractC0185M4934, false);
            } else {
                c2808.m4927(abstractC0185M4934.f1093);
            }
        }
        c1213.m2431(false);
        Trace.endSection();
        return abstractC0185M4934;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f3423;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    C1213 c1213 = (C1213) arrayList.get(i);
                    if (c1213.getWindowVisibility() == 0) {
                        jMax = Math.max(c1213.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m1696(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f3422);
                }
            }
        } finally {
            this.f3425 = 0L;
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1695(C1213 c1213, int i, int i2) {
        if (c1213.f5557) {
            if (C1213.f5511 && !this.f3423.contains(c1213)) {
                C0188.m800("attempting to post unregistered view!");
                return;
            } else if (this.f3425 == 0) {
                this.f3425 = c1213.getNanoTime();
                c1213.post(this);
            }
        }
        C2347 c2347 = c1213.f22;
        c2347.f11526 = i;
        c2347.f11528 = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m1696(long j) {
        C0245 c0245;
        C1213 c1213;
        C1213 c12132;
        C0245 c02452;
        ArrayList arrayList = this.f3423;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C1213 c12133 = (C1213) arrayList.get(i2);
            int windowVisibility = c12133.getWindowVisibility();
            C2347 c2347 = c12133.f22;
            if (windowVisibility == 0) {
                c2347.m4362(c12133, false);
                i += c2347.f11529;
            }
        }
        ArrayList arrayList2 = this.f3424;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            C1213 c12134 = (C1213) arrayList.get(i3);
            if (c12134.getWindowVisibility() == 0) {
                C2347 c23472 = c12134.f22;
                int iAbs = Math.abs(c23472.f11528) + Math.abs(c23472.f11526);
                for (?? r11 = z; r11 < c23472.f11529 * 2; r11 += 2) {
                    if (i4 >= arrayList2.size()) {
                        c02452 = new C0245();
                        arrayList2.add(c02452);
                    } else {
                        c02452 = (C0245) arrayList2.get(i4);
                    }
                    int[] iArr = c23472.f11527;
                    int i5 = iArr[r11 + 1];
                    if (i5 <= iAbs) {
                        z = true;
                    }
                    c02452.f1349 = z;
                    c02452.f1350 = iAbs;
                    c02452.f1351 = i5;
                    c02452.f1352 = c12134;
                    c02452.f1348 = iArr[r11];
                    i4++;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, f3420);
        for (int i6 = 0; i6 < arrayList2.size() && (c1213 = (c0245 = (C0245) arrayList2.get(i6)).f1352) != null; i6++) {
            AbstractC0185 abstractC0185M1694 = m1694(c1213, c0245.f1348, c0245.f1349 ? Long.MAX_VALUE : j);
            if (abstractC0185M1694 != null && abstractC0185M1694.f1096 != null && abstractC0185M1694.m786() && !abstractC0185M1694.m780() && (c12132 = (C1213) abstractC0185M1694.f1096.get()) != null) {
                if (c12132.f5575 && c12132.f5523.m4907() != 0) {
                    C2808 c2808 = c12132.f5529;
                    AbstractC2411 abstractC2411 = c12132.f5532;
                    if (abstractC2411 != null) {
                        abstractC2411.mo4463();
                    }
                    AbstractC2551 abstractC2551 = c12132.f5583;
                    if (abstractC2551 != null) {
                        abstractC2551.m4607(c2808);
                        c12132.f5583.m4608(c2808);
                    }
                    c2808.f13689.clear();
                    c2808.m4938();
                }
                C2347 c23473 = c12132.f22;
                c23473.m4362(c12132, true);
                if (c23473.f11529 != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        C2637 c2637 = c12132.f5568;
                        AbstractC0359 abstractC0359 = c12132.f5537;
                        c2637.f12983 = 1;
                        c2637.f12974 = abstractC0359.mo531();
                        c2637.f12977 = false;
                        c2637.f12971 = false;
                        c2637.f12973 = false;
                        for (int i7 = 0; i7 < c23473.f11529 * 2; i7 += 2) {
                            m1694(c12132, c23473.f11527[i7], j);
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            c0245.f1349 = false;
            c0245.f1350 = 0;
            c0245.f1351 = 0;
            c0245.f1352 = null;
            c0245.f1348 = 0;
        }
    }
}
