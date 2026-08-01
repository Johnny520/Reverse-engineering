package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class me extends Thread {
    public static final AtomicIntegerFieldUpdater i = null;
    public final zc0 a;
    public final i00 b;
    public int c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final /* synthetic */ ne h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    static {
        i = AtomicIntegerFieldUpdater.newUpdater(me.class, "workerCtl");
    }

    public me(ne r1, int r2) {
        this.h = r1;
        setDaemon(true);
        this.a = new zc0();
        this.b = new i00();
        this.c = 4;
        this.nextParkedWorker = ne.k;
        this.f = az.a.b();
        f(r2);
    }

    public final u50 a(boolean r11) {
        int r0 = this.c;
        ne r2 = this.h;
        u50 r7 = null;
        boolean r8 = true;
        zc0 r9 = this.a;
        if (r0 == 1) goto L37;
        AtomicLongFieldUpdater r02 = ne.i;
    L6:
        long r3 = r02.get(r2);
        if (((int) ((9223367638808264704L & r3) >> 42)) == 0) goto L8;
        if (ne.i.compareAndSet(r2, r3, r3 - 4398046511104L) == false) goto L6;
        this.c = 1;
        goto L37
    L8:
        r9.getClass();
    L9:
        AtomicReferenceFieldUpdater r112 = zc0.b;
        u50 r03 = (u50) r112.get(r9);
        if (r03 == null) goto L20;
        if (r03.b.a != 1) goto L20;
    L15:
        if (r112.compareAndSet(r9, r03, null) == true) goto L16;
        if (r112.get(r9) == r03) goto L15;
    L16:
        r7 = r03;
    L28:
        if (r7 != null) goto L33;
        u50 r113 = (u50) r2.f.d();
        if (r113 == null) goto L32;
        return r113;
    L32:
        return i(1);
    L33:
        return r7;
    L20:
        int r114 = zc0.d.get(r9);
        int r04 = zc0.c.get(r9);
    L21:
        if (r114 == r04) goto L28;
        if (zc0.e.get(r9) == 0) goto L28;
        r04 = r04 - 1;
        u50 r1 = r9.b(r04, true);
        if (r1 == null) goto L21;
        r7 = r1;
    L37:
        if (r11 == true) goto L39;
        u50 r115 = e();
        if (r115 == null) goto L59;
        return r115;
    L59:
        return i(3);
    L39:
        if (d(r2.a * 2) == 0) goto L42;
        r8 = false;
    L42:
        if (r8 == false) goto L46;
        u50 r116 = e();
        if (r116 == null) goto L46;
        return r116;
    L46:
        r9.getClass();
        u50 r117 = (u50) zc0.b.getAndSet(r9, null);
        if (r117 != null) goto L49;
        r117 = r9.a();
    L49:
        if (r117 == null) goto L51;
        return r117;
    L51:
        if (r8 == true) goto L59;
        u50 r118 = e();
        if (r118 == null) goto L59;
        return r118;
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int r4) {
        int r0 = this.f;
        int r02 = r0 ^ (r0 << 13);
        int r03 = r02 ^ (r02 >> 17);
        int r04 = r03 ^ (r03 << 5);
        this.f = r04;
        int r1 = r4 - 1;
        if ((r1 & r4) != 0) goto L7;
        return r04 & r1;
    L7:
        return (r04 & Integer.MAX_VALUE) % r4;
    }

    public final u50 e() {
        int r0 = d(2);
        ne r1 = this.h;
        if (r0 != 0) goto L9;
        u50 r02 = (u50) r1.e.d();
        if (r02 == null) goto L8;
        return r02;
    L8:
        return (u50) r1.f.d();
    L9:
        u50 r03 = (u50) r1.f.d();
        if (r03 == null) goto L13;
        return r03;
    L13:
        return (u50) r1.e.d();
    }

    public final void f(int r3) {
        StringBuilder r0 = new StringBuilder();
        r0.append(this.h.d);
        r0.append("-worker-");
        if (r3 != 0) goto L5;
        String r1 = "TERMINATED";
    L6:
        r0.append(r1);
        setName(r0.toString());
        this.indexInArray = r3;
        return;
    L5:
        r1 = String.valueOf(r3);
        goto L6
    }

    public final void g(Object r1) {
        this.nextParkedWorker = r1;
    }

    public final boolean h(int r7) {
        int r0 = this.c;
        boolean r1 = true;
        if (r0 == 1) goto L6;
        r1 = false;
    L6:
        if (r1 == false) goto L8;
        ne.i.addAndGet(this.h, 4398046511104L);
    L8:
        if (r0 == r7) goto L10;
        this.c = r7;
    L10:
        return r1;
    }

    public final u50 i(int r26) {
        AtomicLongFieldUpdater r2 = ne.i;
        ne r3 = this.h;
        int r22 = (int) (r2.get(r3) & 2097151);
        u50 r4 = null;
        if (r22 >= 2) goto L5;
        return null;
    L5:
        int r6 = d(r22);
        int r10 = 0;
        long r11 = Long.MAX_VALUE;
    L6:
        if (r10 >= r22) goto L63;
        r6 = r6 + 1;
        if (r6 <= r22) goto L10;
        r6 = 1;
    L10:
        me r5 = (me) r3.g.b(r6);
        if (r5 == null) goto L61;
        if (r5 == this) goto L61;
        zc0 r52 = r5.a;
        if (r26 != 3) goto L16;
        u50 r7 = r52.a();
        long r18 = 0;
    L30:
        i00 r13 = this.b;
        if (r7 == null) goto L33;
        r13.b = r7;
        u50 r53 = r4;
        long r72 = -1;
        long r20 = -1;
    L51:
        if (r72 == r20) goto L52;
        if (r72 <= r18) goto L61;
        r11 = Math.min(r11, r72);
        goto L61
    L52:
        u50 r1 = (u50) r13.b;
        r13.b = r53;
        return r1;
    L33:
        AtomicReferenceFieldUpdater r73 = zc0.b;
        u50 r14 = (u50) r73.get(r52);
        if (r14 == null) goto L35;
        r20 = -1;
        if (r14.b.a != 1) goto L39;
        int r8 = 1;
    L41:
        if ((r8 & r26) == 0) goto L42;
        x50.f.getClass();
        zc0 r23 = r52;
        long r82 = System.nanoTime() - r14.a;
        long r42 = x50.b;
        if (r82 < r42) goto L45;
    L47:
        r53 = null;
        if (r73.compareAndSet(r23, r14, null) == true) goto L49;
        if (r73.get(r23) == r14) goto L47;
        r52 = r23;
        r4 = null;
        goto L33
    L49:
        r13.b = r14;
        r72 = -1;
        goto L51
    L45:
        r72 = r42 - r82;
        r53 = null;
    L42:
        r72 = -2;
        r53 = r4;
        goto L51
    L39:
        r8 = 2;
        goto L41
    L35:
        r20 = -1;
        goto L42
    L16:
        r52.getClass();
        int r74 = zc0.d.get(r52);
        int r83 = zc0.c.get(r52);
        if (r26 != 1) goto L19;
        boolean r9 = true;
    L20:
        if (r74 == r83) goto L29;
        r18 = 0;
        if (r9 == true) goto L24;
    L26:
        int r132 = r74 + 1;
        r7 = r52.b(r74, r9);
        if (r7 != null) goto L30;
        r74 = r132;
        goto L20
    L24:
        if (zc0.e.get(r52) != 0) goto L26;
    L25:
        r7 = r4;
        goto L30
    L29:
        r18 = 0;
        goto L25
    L19:
        r9 = false;
    L61:
        r10 = r10 + 1;
        r4 = null;
        goto L6
    L63:
        if (r11 != Long.MAX_VALUE) goto L66;
        r11 = 0;
    L66:
        this.e = r11;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
    L3:
        boolean r0 = false;
    L5:
        if (ne.j.get(this.h) != 0) goto L93;
        if (this.c == 5) goto L93;
        u50 r3 = a(this.g);
        if (r3 != null) goto L11;
        this.g = false;
        if (this.e != 0) goto L36;
        Object r32 = this.nextParkedWorker;
        l0 r11 = ne.k;
        if (r32 != r11) goto L41;
        ne r33 = this.h;
        if (this.nextParkedWorker != r11) goto L5;
        AtomicLongFieldUpdater r5 = ne.h;
    L89:
        long r20 = r5.get(r33);
        int r10 = this.indexInArray;
        this.nextParkedWorker = r33.g.b((int) (r20 & 2097151));
        ne r19 = r33;
        if (ne.h.compareAndSet(r19, r20, ((r20 + 2097152) & (-2097152)) | ((long) r10)) == true) goto L5;
        r33 = r19;
        goto L89
    L41:
        i.set(this, -1);
    L43:
        if (this.nextParkedWorker == ne.k) goto L5;
        AtomicIntegerFieldUpdater r34 = i;
        if (r34.get(this) != (-1)) goto L5;
        ne r7 = this.h;
        AtomicIntegerFieldUpdater r112 = ne.j;
        if (r112.get(r7) != 0) goto L5;
        if (this.c == 5) goto L5;
        h(3);
        Thread.interrupted();
        if (this.d != 0) goto L55;
        long r16 = 2097151;
        this.d = System.nanoTime() + this.h.c;
    L56:
        LockSupport.parkNanos(this.h.c);
        if ((System.nanoTime() - this.d) < 0) goto L43;
        this.d = 0;
        ne r72 = this.h;
        t00 r12 = r72.g;
        monitor-enter(r12);
        if (r112.get(r72) == 0) goto L63;
        boolean r113 = true;
    L64:
        if (r113 == true) goto L65;
        AtomicLongFieldUpdater r114 = ne.i;     // Catch: Throwable -> L78
        if (((int) (r114.get(r72) & r16)) <= r72.a) goto L69;
        if (r34.compareAndSet(this, -1, 1) == false) goto L73;
        int r35 = this.indexInArray;     // Catch: Throwable -> L78
        f(0);     // Catch: Throwable -> L78
        r72.c(this, r35, 0);     // Catch: Throwable -> L78
        int r115 = (int) (r114.getAndDecrement(r72) & r16);     // Catch: Throwable -> L78
        if (r115 == r35) goto L80;
        Object r13 = r72.g.b(r115);     // Catch: Throwable -> L78
        ip.l(r13);     // Catch: Throwable -> L78
        me r132 = (me) r13;     // Catch: Throwable -> L78
        r72.g.c(r35, r132);     // Catch: Throwable -> L78
        r132.f(r35);     // Catch: Throwable -> L78
        r72.c(r132, r115, r35);     // Catch: Throwable -> L78
    L80:
        r72.g.c(r115, null);     // Catch: Throwable -> L78
        monitor-exit(r12);
        this.c = 5;
        goto L43
    L73:
        monitor-exit(r12);
        goto L43
    L69:
        monitor-exit(r12);
        goto L43
    L65:
        monitor-exit(r12);
        goto L43
    L63:
        r113 = false;
    L78:
        th = move-exception;
        throw th;
    L55:
        r16 = 2097151;
        goto L56
    L36:
        if (r0 == true) goto L38;
        r0 = true;
        goto L5
    L38:
        h(3);
        Thread.interrupted();
        LockSupport.parkNanos(this.e);
        this.e = 0;
        goto L3
    L11:
        this.e = 0;
        ne r102 = this.h;
        int r116 = r3.b.a;
        this.d = 0;
        if (this.c != 3) goto L14;
        this.c = 2;
    L14:
        if (r116 != 0) goto L17;
    L95:
        r3.run();     // Catch: Throwable -> L27
    L29:
        if (r116 == 0) goto L3;
        ne.i.addAndGet(r102, -2097152);
        if (this.c == 5) goto L3;
        this.c = 4;
    L27:
        th = move-exception;
        Thread r36 = Thread.currentThread();
        r36.getUncaughtExceptionHandler().uncaughtException(r36, th);
        goto L29
    L17:
        if (h(2) == false) goto L95;
        if (r102.e() == true) goto L95;
        if (r102.d(ne.i.get(r102)) == true) goto L95;
        r102.e();
    L93:
        h(5);
    }
}
