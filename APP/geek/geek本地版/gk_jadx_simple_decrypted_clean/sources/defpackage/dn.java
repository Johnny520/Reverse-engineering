package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class dn implements Runnable {
    public static final ThreadLocal e = null;
    public static final ce f = null;
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    static {
        e = new ThreadLocal();
        f = new ce(1);
    }

    public static b00 c(RecyclerView r5, int r6, long r7) {
        int r0 = r5.e.t();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L11;
        b00 r3 = RecyclerView.I(r5.e.s(r2));
        if (r3.c != r6) goto L10;
        if (r3.f() == true) goto L10;
        return null;
    L10:
        r2 = r2 + 1;
        goto L3
    L11:
        tz r02 = r5.b;
        r5.P();     // Catch: Throwable -> L19
        b00 r62 = r02.i(r6, r7);     // Catch: Throwable -> L19
        if (r62 != null) goto L15;
    L22:
        r5.Q(false);
        return r62;
    L15:
        if (r62.e() == true) goto L17;
    L21:
        r02.a(r62, false);     // Catch: Throwable -> L19
        goto L22
    L17:
        if (r62.f() == true) goto L21;
        r02.f(r62.a);     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        r5.Q(false);
        throw th;
    }

    public final void a(RecyclerView r5, int r6, int r7) {
        if (r5.p == true) goto L5;
    L7:
        bn r52 = r5.b0;
        r52.a = r6;
        r52.b = r7;
        return;
    L5:
        if (this.b != 0) goto L7;
        this.b = r5.getNanoTime();
        r5.post(this);
        goto L7
    }

    public final void b(long r17) {
        ArrayList r0 = this.d;
        ArrayList r2 = this.a;
        int r3 = r2.size();
        int r5 = 0;
        int r6 = 0;
    L3:
        if (r5 >= r3) goto L8;
        RecyclerView r7 = (RecyclerView) r2.get(r5);
        int r8 = r7.getWindowVisibility();
        bn r9 = r7.b0;
        if (r8 != 0) goto L7;
        r9.b(r7, false);
        r6 = r6 + r9.d;
    L7:
        r5 = r5 + 1;
        goto L3
    L8:
        r0.ensureCapacity(r6);
        int r52 = 0;
        int r62 = 0;
    L10:
        if (r52 >= r3) goto L27;
        RecyclerView r82 = (RecyclerView) r2.get(r52);
        if (r82.getWindowVisibility() != 0) goto L26;
        bn r92 = r82.b0;
        int r11 = Math.abs(r92.b) + Math.abs(r92.a);
        int r10 = 0;
    L16:
        if (r10 >= (r92.d * 2)) goto L26;
        if (r62 < r0.size()) goto L20;
        cn r12 = new cn();
        r0.add(r12);
    L21:
        int[] r13 = r92.c;
        int r14 = r13[r10 + 1];
        if (r14 > r11) goto L24;
        boolean r15 = true;
    L25:
        r12.a = r15;
        r12.b = r11;
        r12.c = r14;
        r12.d = r82;
        r12.e = r13[r10];
        r62 = r62 + 1;
        r10 = r10 + 2;
        goto L16
    L24:
        r15 = false;
        goto L25
    L20:
        r12 = (cn) r0.get(r62);
    L26:
        r52 = r52 + 1;
        goto L10
    L27:
        Collections.sort(r0, f);
        int r22 = 0;
    L29:
        if (r22 >= r0.size()) goto L72;
        cn r32 = (cn) r0.get(r22);
        RecyclerView r53 = r32.d;
        if (r53 == null) goto L88;
        if (r32.a == false) goto L36;
        long r83 = Long.MAX_VALUE;
    L37:
        b00 r54 = c(r53, r32.e, r83);
        if (r54 == null) goto L71;
        if (r54.b == null) goto L71;
        if (r54.e() == false) goto L71;
        if (r54.f() == true) goto L71;
        RecyclerView r55 = (RecyclerView) r54.b.get();
        if (r55 == null) goto L71;
        if (r55.y == true) goto L51;
    L59:
        bn r63 = r55.b0;
        r63.b(r55, true);
        if (r63.d == 0) goto L71;
        int r93 = n70.a;     // Catch: Throwable -> L66
        m70.a("RV Nested Prefetch");     // Catch: Throwable -> L66
        yz r84 = r55.c0;     // Catch: Throwable -> L66
        fz r94 = r55.k;     // Catch: Throwable -> L66
        r84.d = 1;     // Catch: Throwable -> L66
        r84.e = r94.a();     // Catch: Throwable -> L66
        r84.g = false;     // Catch: Throwable -> L66
        r84.h = false;     // Catch: Throwable -> L66
        r84.i = false;     // Catch: Throwable -> L66
        int r85 = 0;
    L62:
        if (r85 >= (r63.d * 2)) goto L68;
        c(r55, r63.c[r85], r17);     // Catch: Throwable -> L66
        r85 = r85 + 2;
        goto L62
    L68:
        m70.b();
    L66:
        th = move-exception;
        int r23 = n70.a;
        m70.b();
        throw th;
    L51:
        if (r55.e.t() == 0) goto L59;
        tz r64 = r55.b;
        jz r86 = r55.H;
        if (r86 == null) goto L55;
        r86.e();
    L55:
        nz r87 = r55.l;
        if (r87 == null) goto L58;
        r87.e0(r64);
        r55.l.f0(r64);
    L58:
        r64.a.clear();
        r64.d();
    L71:
        r32.a = false;
        r32.b = 0;
        r32.c = 0;
        r32.d = null;
        r32.e = 0;
        r22 = r22 + 1;
        goto L29
    L36:
        r83 = r17;
        goto L37
    L88:
        return;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList r0 = this.a;
        int r4 = n70.a;     // Catch: Throwable -> L12
        m70.a("RV Prefetch");     // Catch: Throwable -> L12
        if (r0.isEmpty() == false) goto L7;
    L5:
        this.b = 0;
        m70.b();
        return;
    L7:
        int r3 = r0.size();     // Catch: Throwable -> L12
        int r42 = 0;
        long r5 = 0;
    L8:
        if (r42 >= r3) goto L16;
        RecyclerView r7 = (RecyclerView) r0.get(r42);     // Catch: Throwable -> L12
        if (r7.getWindowVisibility() != 0) goto L14;
        r5 = Math.max(r7.getDrawingTime(), r5);     // Catch: Throwable -> L12
    L14:
        r42 = r42 + 1;     // Catch: Throwable -> L12
        goto L8
    L16:
        if (r5 == 0) goto L5;
        b(TimeUnit.MILLISECONDS.toNanos(r5) + this.c);     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        this.b = 0;
        int r1 = n70.a;
        m70.b();
        throw th;
    }
}
