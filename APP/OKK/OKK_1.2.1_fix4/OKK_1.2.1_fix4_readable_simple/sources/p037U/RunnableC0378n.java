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
    public static final ThreadLocal f832e = null;

    /* JADX INFO: renamed from: f */
    public static final C0375k f833f = null;

    /* JADX INFO: renamed from: a */
    public ArrayList f834a;

    /* JADX INFO: renamed from: b */
    public long f835b;

    /* JADX INFO: renamed from: c */
    public long f836c;

    /* JADX INFO: renamed from: d */
    public ArrayList f837d;

    static {
        f832e = new ThreadLocal();
        f833f = new C0375k(0);
    }

    /* JADX INFO: renamed from: a */
    public final void m958a(RecyclerView r5, int r6, int r7) {
        if (r5.f1585n == true) goto L5;
    L7:
        C0376l r52 = r5.f1560V;
        r52.f824a = r6;
        r52.f825b = r7;
        return;
    L5:
        if (this.f835b != 0) goto L7;
        this.f835b = r5.getNanoTime();
        r5.post(this);
        goto L7
    }

    /* JADX INFO: renamed from: b */
    public final void m959b(long r13) {
        AbstractC0355O r1 = null;
        ArrayList r2 = this.f834a;
        int r3 = r2.size();
        int r4 = 0;
        int r5 = 0;
    L3:
        if (r4 >= r3) goto L8;
        RecyclerView r6 = (RecyclerView) r2.get(r4);
        if (r6.getWindowVisibility() != 0) goto L7;
        C0376l r7 = r6.f1560V;
        r7.m957a(r6, false);
        r5 = r5 + r7.f826c;
    L7:
        r4 = r4 + 1;
        goto L3
    L8:
        ArrayList r42 = this.f837d;
        r42.ensureCapacity(r5);
        int r52 = 0;
    L9:
        if (r52 >= r3) goto L22;
        RecyclerView r62 = (RecyclerView) r2.get(r52);
        if (r62.getWindowVisibility() != 0) goto L21;
        C0376l r63 = r62.f1560V;
        Math.abs(r63.f824a);
        Math.abs(r63.f825b);
        if ((r63.f826c * 2) <= 0) goto L21;
        if (r42.size() > 0) goto L18;
        r42.add(new C0377m());
    L19:
        r63.getClass();
        throw null;
    L18:
        C0377m r132 = (C0377m) r42.get(0);
    L21:
        r52 = r52 + 1;
        goto L9
    L22:
        Collections.sort(r42, f833f);
        int r22 = 0;
    L24:
        if (r22 >= r42.size()) goto L53;
        C0377m r32 = (C0377m) r42.get(r22);
        RecyclerView r53 = r32.f830d;
        if (r53 == null) goto L70;
        if (r32.f827a == false) goto L31;
        long r64 = Long.MAX_VALUE;
    L32:
        int r8 = r32.f831e;
        int r9 = r53.f1568d.m650m();
        int r10 = 0;
    L33:
        if (r10 >= r9) goto L40;
        RecyclerView.m1301u(r53.f1568d.m649l(r10));
        r1.getClass();
        if (r8 != 0) goto L39;
        if (r1.m841g() == true) goto L39;
    L50:
        r32.f827a = false;
        r32.f828b = 0;
        r32.f829c = 0;
        r32.f830d = null;
        r32.f831e = 0;
        r22 = r22 + 1;
    L39:
        r10 = r10 + 1;
        goto L33
    L40:
        C0349I r92 = r53.f1562a;
        r53.m1333z();     // Catch: Throwable -> L46
        r92.m829i(r8, r64);     // Catch: Throwable -> L46
        if (r1.m840f() == true) goto L44;
    L48:
        r92.m821a(null, false);     // Catch: Throwable -> L46
    L49:
        r53.m1302A(false);
        goto L50
    L44:
        if (r1.m841g() == true) goto L48;
        r1.getClass();     // Catch: Throwable -> L46
        r92.m826f(null);     // Catch: Throwable -> L46
    L46:
        th = move-exception;
        r53.m1302A(false);
        throw th;
    L31:
        r64 = r13;
        goto L32
    L70:
        return;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r3 = AbstractC1142a.f4403a;     // Catch: Throwable -> L15
        Trace.beginSection("RV Prefetch");     // Catch: Throwable -> L15
        ArrayList r2 = this.f834a;
        if (r2.isEmpty() == false) goto L9;
        this.f835b = 0;
        Trace.endSection();
        return;
    L9:
        int r32 = r2.size();     // Catch: Throwable -> L15
        int r4 = 0;
        long r5 = 0;
    L10:
        if (r4 >= r32) goto L19;
        RecyclerView r7 = (RecyclerView) r2.get(r4);     // Catch: Throwable -> L15
        if (r7.getWindowVisibility() != 0) goto L17;
        r5 = Math.max(r7.getDrawingTime(), r5);     // Catch: Throwable -> L15
    L17:
        r4 = r4 + 1;
        goto L10
    L19:
        if (r5 != 0) goto L22;
        this.f835b = 0;
        Trace.endSection();
        return;
    L22:
        m959b(TimeUnit.MILLISECONDS.toNanos(r5) + this.f836c);     // Catch: Throwable -> L15
        this.f835b = 0;
        Trace.endSection();
        return;
    L15:
        th = move-exception;
        this.f835b = 0;
        int r02 = AbstractC1142a.f4403a;
        Trace.endSection();
        throw th;
    }
}
