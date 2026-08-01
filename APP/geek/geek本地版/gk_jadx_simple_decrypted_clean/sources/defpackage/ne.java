package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class ne implements Executor, Closeable {
    public static final AtomicLongFieldUpdater h = null;
    public static final AtomicLongFieldUpdater i = null;
    public static final AtomicIntegerFieldUpdater j = null;
    public static final l0 k = null;
    private volatile int _isTerminated;
    public final int a;
    public final int b;
    public final long c;
    private volatile long controlState;
    public final String d;
    public final bo e;
    public final bo f;
    public final t00 g;
    private volatile long parkedWorkersStack;

    static {
        h = AtomicLongFieldUpdater.newUpdater(ne.class, "parkedWorkersStack");
        i = AtomicLongFieldUpdater.newUpdater(ne.class, "controlState");
        j = AtomicIntegerFieldUpdater.newUpdater(ne.class, "_isTerminated");
        int r2 = 27;
        k = new l0(r2, "NOT_IN_STACK");
    }

    public ne(int r3, int r4, long r5, String r7) {
        this.a = r3;
        this.b = r4;
        this.c = r5;
        this.d = r7;
        if (r3 < 1) goto L19;
        if (r4 < r3) goto L17;
        if (r4 > 2097150) goto L15;
        if (r5 <= 0) goto L13;
        this.e = new bo();
        this.f = new bo();
        this.g = new t00((r3 + 1) * 2);
        this.controlState = ((long) r3) << 42;
        this._isTerminated = 0;
        return;
    L13:
        throw new IllegalArgumentException(("Idle worker keep alive time " + r5 + " must be positive").toString());
    L15:
        throw new IllegalArgumentException(("Max pool size " + r4 + " should not exceed maximal supported number of threads 2097150").toString());
    L17:
        throw new IllegalArgumentException(("Max pool size " + r4 + " should be greater than or equals to core pool size " + r3).toString());
    L19:
        throw new IllegalArgumentException(("Core pool size " + r3 + " should be at least 1").toString());
    }

    public final int a() {
        t00 r0 = this.g;
        monitor-enter(r0);
    L37:
        th = move-exception;
        throw th;
    L6:
        if (j.get(this) == 0) goto L8;
        boolean r1 = true;
    L9:
        if (r1 == false) goto L13;
        monitor-exit(r0);
        return -1;
    L13:
        AtomicLongFieldUpdater r12 = i;     // Catch: Throwable -> L37
        long r4 = r12.get(this);     // Catch: Throwable -> L37
        int r8 = (int) (r4 & 2097151);     // Catch: Throwable -> L37
        int r42 = r8 - ((int) ((r4 & 4398044413952L) >> 21));     // Catch: Throwable -> L37
        if (r42 >= 0) goto L17;
        r42 = 0;
    L17:
        if (r42 < this.a) goto L21;
        monitor-exit(r0);
        return 0;
    L21:
        if (r8 < this.b) goto L24;
        monitor-exit(r0);
        return 0;
    L24:
        int r3 = ((int) (r12.get(this) & 2097151)) + 1;     // Catch: Throwable -> L37
        if (r3 <= 0) goto L40;
        if (this.g.b(r3) != null) goto L40;
        me r5 = new me(this, r3);     // Catch: Throwable -> L37
        this.g.c(r3, r5);     // Catch: Throwable -> L37
        if (r3 != ((int) (2097151 & r12.incrementAndGet(this)))) goto L36;
        int r43 = r42 + 1;
        monitor-exit(r0);
        r5.start();
        return r43;
    L36:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L37
    L40:
        throw new IllegalArgumentException("Failed requirement.");     // Catch: Throwable -> L37
    L8:
        r1 = false;
        goto L9
    }

    public final void b(Runnable r11, v50 r12) {
        x50.f.getClass();
        long r0 = System.nanoTime();
        if ((r11 instanceof u50) == false) goto L5;
        u50 r112 = (u50) r11;
        r112.a = r0;
        r112.b = r12;
    L7:
        if (r112.b.a != 1) goto L9;
        boolean r122 = true;
    L10:
        AtomicLongFieldUpdater r1 = i;
        if (r122 == false) goto L13;
        long r2 = r1.addAndGet(this, 2097152);
    L14:
        Thread r4 = Thread.currentThread();
        if ((r4 instanceof me) == false) goto L17;
        me r42 = (me) r4;
    L18:
        if (r42 != null) goto L20;
    L22:
        r42 = null;
    L23:
        if (r42 == null) goto L47;
        int r5 = r42.c;
        if (r5 == 5) goto L47;
        if (r112.b.a == 0) goto L31;
    L33:
        r42.g = true;
        zc0 r43 = r42.a;
        r43.getClass();
        r112 = (u50) zc0.b.getAndSet(r43, r112);
        if (r112 != null) goto L36;
        r112 = null;
        goto L47
    L36:
        AtomicReferenceArray r52 = r43.a;
        AtomicIntegerFieldUpdater r6 = zc0.c;
        if ((r6.get(r43) - zc0.d.get(r43)) == 127) goto L47;
        if (r112.b.a != 1) goto L42;
        zc0.e.incrementAndGet(r43);
    L42:
        int r7 = r6.get(r43) & 127;
    L44:
        if (r52.get(r7) == null) goto L46;
        Thread.yield();
        goto L44
    L46:
        r52.lazySet(r7, r112);
        r6.incrementAndGet(r43);
        r112 = null;
        goto L47
    L31:
        if (r5 != 2) goto L33;
    L47:
        if (r112 != null) goto L49;
    L56:
        if (r122 == false) goto L66;
        if (e() == false) goto L61;
        return;
    L61:
        if (d(r2) == true) goto L75;
        e();
        return;
    L75:
        return;
    L66:
        if (e() == false) goto L69;
        return;
    L69:
        if (d(r1.get(this)) == false) goto L71;
        return;
    L71:
        e();
        return;
    L49:
        if (r112.b.a != 1) goto L51;
        boolean r113 = this.f.a(r112);
    L52:
        if (r113 == true) goto L56;
        throw new RejectedExecutionException(z30.l(new StringBuilder(), this.d, " was terminated"));
    L51:
        r113 = this.e.a(r112);
        goto L52
    L20:
        if (ip.i(r42.h, this) == false) goto L22;
    L17:
        r42 = null;
        goto L18
    L13:
        r2 = 0;
        goto L14
    L9:
        r122 = false;
        goto L10
    L5:
        r112 = new w50(r11, r0, r12);
        goto L7
    }

    public final void c(me r8, int r9, int r10) {
    L2:
        long r3 = h.get(this);
        int r0 = (int) (2097151 & r3);
        long r1 = (2097152 + r3) & (-2097152);
        if (r0 != r9) goto L16;
        if (r10 != 0) goto L15;
        Object r02 = r8.c();
    L7:
        if (r02 == k) goto L8;
        if (r02 == null) goto L10;
        me r03 = (me) r02;
        int r5 = r03.b();
        if (r5 != 0) goto L13;
        r02 = r03.c();
        goto L7
    L13:
        r0 = r5;
        goto L16
    L10:
        r0 = 0;
        goto L16
    L8:
        r0 = -1;
        goto L16
    L15:
        r0 = r10;
    L16:
        if (r0 < 0) goto L2;
        long r52 = ((long) r0) | r1;
        if (h.compareAndSet(this, r3, r52) == false) goto L2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (j.compareAndSet(this, 0, 1) == true) goto L5;
        return;
    L5:
        Thread r0 = Thread.currentThread();
        if ((r0 instanceof me) == false) goto L8;
        me r02 = (me) r0;
    L9:
        if (r02 != null) goto L11;
    L13:
        r02 = null;
    L14:
        t00 r1 = this.g;
        monitor-enter(r1);
        int r4 = (int) (i.get(this) & 2097151);
        monitor-exit(r1);
        if (1 > r4) goto L35;
        int r12 = 1;
    L21:
        Object r5 = this.g.b(r12);
        ip.l(r5);
        me r52 = (me) r5;
        if (r52 != r02) goto L24;
    L33:
        if (r12 == r4) goto L35;
        r12 = r12 + 1;
    L24:
        if (r52.isAlive() == false) goto L26;
        LockSupport.unpark(r52);
        r52.join(10000);
        goto L24
    L26:
        zc0 r53 = r52.a;
        bo r6 = this.f;
        r53.getClass();
        u50 r7 = (u50) zc0.b.getAndSet(r53, null);
        if (r7 == null) goto L29;
        r6.a(r7);
    L29:
        u50 r72 = r53.a();
        if (r72 == null) goto L33;
        r6.a(r72);
    L35:
        this.f.b();
        this.e.b();
    L36:
        if (r02 == null) goto L39;
        u50 r13 = r02.a(true);
        if (r13 == null) goto L39;
    L56:
        r13.run();     // Catch: Throwable -> L49
    L49:
        th = move-exception;
        Thread r3 = Thread.currentThread();
        r3.getUncaughtExceptionHandler().uncaughtException(r3, th);
    L39:
        r13 = (u50) this.e.d();
        if (r13 != null) goto L56;
        r13 = (u50) this.f.d();
        if (r13 != null) goto L56;
        if (r02 == null) goto L45;
        r02.h(5);
    L45:
        h.set(this, 0);
        i.set(this, 0);
        return;
    L51:
        th = move-exception;
        throw th;
    L11:
        if (ip.i(r02.h, this) == false) goto L13;
    L8:
        r02 = null;
        goto L9
    }

    public final boolean d(long r4) {
        int r0 = ((int) (2097151 & r4)) - ((int) ((r4 & 4398044413952L) >> 21));
        if (r0 >= 0) goto L5;
        r0 = 0;
    L5:
        int r5 = this.a;
        if (r0 >= r5) goto L13;
        int r02 = a();
        if (r02 != 1) goto L11;
        if (r5 <= 1) goto L11;
        a();
    L11:
        if (r02 <= 0) goto L13;
        return true;
    L13:
        return false;
    }

    public final boolean e() {
    L2:
        long r3 = h.get(this);
        me r0 = (me) this.g.b((int) (2097151 & r3));
        if (r0 == null) goto L4;
        long r1 = (2097152 + r3) & (-2097152);
        Object r5 = r0.c();
    L6:
        l0 r9 = k;
        if (r5 == r9) goto L8;
        if (r5 == null) goto L10;
        me r52 = (me) r5;
        int r6 = r52.b();
        if (r6 != 0) goto L13;
        r5 = r52.c();
    L13:
        if (r6 < 0) goto L2;
        if (h.compareAndSet(this, r3, ((long) r6) | r1) == false) goto L2;
        r0.g(r9);
    L17:
        if (r0 == null) goto L18;
        if (me.i.compareAndSet(r0, -1, 0) == false) goto L2;
        LockSupport.unpark(r0);
        return true;
    L18:
        return false;
    L10:
        r6 = 0;
        goto L13
    L8:
        r6 = -1;
        goto L13
    L4:
        r0 = null;
        goto L17
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable r2) {
        b(r2, x50.g);
    }

    public final String toString() {
        ArrayList r0 = new ArrayList();
        t00 r1 = this.g;
        int r2 = r1.a();
        int r3 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 1;
    L3:
        if (r9 >= r2) goto L29;
        me r10 = (me) r1.b(r9);
        if (r10 == null) goto L28;
        zc0 r11 = r10.a;
        r11.getClass();
        if (zc0.b.get(r11) == null) goto L10;
        int r12 = (zc0.c.get(r11) - zc0.d.get(r11)) + 1;
    L11:
        int r102 = z30.t(r10.c);
        if (r102 == 0) goto L27;
        if (r102 != 1) goto L15;
        r5 = r5 + 1;
        StringBuilder r103 = new StringBuilder();
        r103.append(r12);
        r103.append('b');
        r0.add(r103.toString());
        goto L28
    L15:
        if (r102 != 2) goto L17;
        r6 = r6 + 1;
        goto L28
    L17:
        if (r102 != 3) goto L19;
        r7 = r7 + 1;
        if (r12 <= 0) goto L28;
        StringBuilder r104 = new StringBuilder();
        r104.append(r12);
        r104.append('d');
        r0.add(r104.toString());
        goto L28
    L19:
        if (r102 != 4) goto L28;
        r8 = r8 + 1;
        goto L28
    L27:
        r3 = r3 + 1;
        StringBuilder r105 = new StringBuilder();
        r105.append(r12);
        r105.append('c');
        r0.add(r105.toString());
        goto L28
    L10:
        r12 = zc0.c.get(r11) - zc0.d.get(r11);
    L28:
        r9 = r9 + 1;
        goto L3
    L29:
        long r13 = i.get(this);
        StringBuilder r4 = new StringBuilder();
        r4.append(this.d);
        r4.append('@');
        r4.append(ff.s(this));
        r4.append("[Pool Size {core = ");
        int r92 = this.a;
        r4.append(r92);
        r4.append(", max = ");
        r4.append(this.b);
        r4.append("}, Worker States {CPU = ");
        r4.append(r3);
        r4.append(", blocking = ");
        r4.append(r5);
        r4.append(", parked = ");
        r4.append(r6);
        r4.append(", dormant = ");
        r4.append(r7);
        r4.append(", terminated = ");
        r4.append(r8);
        r4.append("}, running workers queues = ");
        r4.append(r0);
        r4.append(", global CPU queue size = ");
        r4.append(this.e.c());
        r4.append(", global blocking queue size = ");
        r4.append(this.f.c());
        r4.append(", Control State {created workers= ");
        r4.append((int) (2097151 & r13));
        r4.append(", blocking tasks = ");
        r4.append((int) ((4398044413952L & r13) >> 21));
        r4.append(", CPUs acquired = ");
        r4.append(r92 - ((int) ((r13 & 9223367638808264704L) >> 42)));
        r4.append("}]");
        return r4.toString();
    }
}
