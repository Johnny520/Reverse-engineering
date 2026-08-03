package p037U;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p091z.AbstractC1142a;

/* JADX INFO: renamed from: U.n */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0378n implements Runnable {

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal f832e = new ThreadLocal();

    /* JADX INFO: renamed from: f */
    public static final C0375k f833f = new C0375k(0);

    /* JADX INFO: renamed from: a */
    public ArrayList f834a;

    /* JADX INFO: renamed from: b */
    public long f835b;

    /* JADX INFO: renamed from: c */
    public long f836c;

    /* JADX INFO: renamed from: d */
    public ArrayList f837d;

    /* JADX INFO: renamed from: a */
    public final void m958a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.f1585n && this.f835b == 0) {
            this.f835b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0376l c0376l = recyclerView.f1560V;
        c0376l.f824a = i2;
        c0376l.f825b = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        r9 = r5.f1562a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
    
        r5.m1333z();
        r9.m829i(r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b7, code lost:
    
        if (r1.m840f() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        if (r1.m841g() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        r1.getClass();
        r9.m826f(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c6, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c8, code lost:
    
        r9.m821a(null, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
    
        r5.m1302A(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00db, code lost:
    
        r5.m1302A(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        throw r13;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m959b(long j2) {
        C0377m c0377m;
        RecyclerView recyclerView;
        int i2;
        AbstractC0355O abstractC0355O = null;
        ArrayList arrayList = this.f834a;
        int size = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0376l c0376l = recyclerView2.f1560V;
                c0376l.m957a(recyclerView2, false);
                i3 += c0376l.f826c;
            }
        }
        ArrayList arrayList2 = this.f837d;
        arrayList2.ensureCapacity(i3);
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i5);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0376l c0376l2 = recyclerView3.f1560V;
                Math.abs(c0376l2.f824a);
                Math.abs(c0376l2.f825b);
                if (c0376l2.f826c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new C0377m());
                    }
                    c0376l2.getClass();
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f833f);
        for (int i6 = 0; i6 < arrayList2.size() && (recyclerView = (c0377m = (C0377m) arrayList2.get(i6)).f830d) != null; i6++) {
            long j3 = c0377m.f827a ? Long.MAX_VALUE : j2;
            int i7 = c0377m.f831e;
            int iM650m = recyclerView.f1568d.m650m();
            while (true) {
                if (i2 >= iM650m) {
                    break;
                }
                RecyclerView.m1301u(recyclerView.f1568d.m649l(i2));
                abstractC0355O.getClass();
                i2 = (i7 != 0 || abstractC0355O.m841g()) ? i2 + 1 : 0;
            }
            c0377m.f827a = false;
            c0377m.f828b = 0;
            c0377m.f829c = 0;
            c0377m.f830d = null;
            c0377m.f831e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i2 = AbstractC1142a.f4403a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f834a;
            if (arrayList.isEmpty()) {
                this.f835b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i3);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f835b = 0L;
                Trace.endSection();
            } else {
                m959b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f836c);
                this.f835b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f835b = 0L;
            int i4 = AbstractC1142a.f4403a;
            Trace.endSection();
            throw th;
        }
    }
}
