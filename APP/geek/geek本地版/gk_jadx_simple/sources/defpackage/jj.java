package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public abstract class jj extends kj implements eg {
    public static final AtomicReferenceFieldUpdater f = null;
    public static final AtomicReferenceFieldUpdater g = null;
    public static final AtomicIntegerFieldUpdater h = null;
    private volatile Object _delayed;
    private volatile int _isCompleted;
    private volatile Object _queue;

    static {
        f = AtomicReferenceFieldUpdater.newUpdater(jj.class, Object.class, "_queue");
        g = AtomicReferenceFieldUpdater.newUpdater(jj.class, Object.class, "_delayed");
        h = AtomicIntegerFieldUpdater.newUpdater(jj.class, "_isCompleted");
    }

    public jj() {
        this._isCompleted = 0;
    }

    @Override // defpackage.eg
    public final void c(long r4, i8 r6) {
        long r0 = 0;
        if (r4 <= 0) goto L10;
        if (r4 < 9223372036854L) goto L8;
        r0 = Long.MAX_VALUE;
        goto L10
    L8:
        r0 = 1000000 * r4;
    L10:
        if (r0 >= 4611686018427387903L) goto L13;
        long r42 = System.nanoTime();
        gj r2 = new gj(this, r0 + r42, r6);
        r(r42, r2);
        r6.n(new ah(0, r2));
        return;
    }

    @Override // defpackage.ke
    public final void d(ge r1, Runnable r2) {
        n(r2);
    }

    public void n(Runnable r2) {
        if (o(r2) == false) goto L8;
        Thread r22 = j();
        if (Thread.currentThread() == r22) goto L10;
        LockSupport.unpark(r22);
        return;
    L10:
        return;
    L8:
        kf.i.n(r2);
    }

    public final boolean o(Runnable r7) {
    L2:
        AtomicReferenceFieldUpdater r0 = f;
        Object r1 = r0.get(this);
        if (h.get(this) != 0) goto L4;
        if (r1 == null) goto L8;
        if ((r1 instanceof yr) == true) goto L15;
        if (r1 == ip.e) goto L30;
        yr r3 = new yr(8, true);
        r3.a((Runnable) r1);
        r3.a(r7);
    L33:
        if (r0.compareAndSet(this, r1, r3) == true) goto L34;
        if (r0.get(this) == r1) goto L33;
    L34:
        return true;
    L30:
        return false;
    L15:
        yr r4 = (yr) r1;
        int r5 = r4.a(r7);
        if (r5 == 0) goto L34;
        if (r5 != 1) goto L19;
        yr r32 = r4.c();
    L23:
        if (r0.compareAndSet(this, r1, r32) == true) goto L2;
        if (r0.get(this) == r1) goto L23;
    L19:
        if (r5 == 2) goto L30;
    L8:
        if (r0.compareAndSet(this, null, r7) == true) goto L34;
        if (r0.get(this) == null) goto L8;
    L4:
        return false;
    }

    public final boolean p() {
        k6 r0 = this.e;
        if (r0 == null) goto L5;
        boolean r02 = r0.isEmpty();
    L7:
        if (r02 == false) goto L29;
        ij r03 = (ij) g.get(this);
        if (r03 != null) goto L12;
    L17:
        Object r04 = f.get(this);
        if (r04 != null) goto L21;
    L28:
        return true;
    L21:
        if ((r04 instanceof yr) == false) goto L27;
        long r3 = yr.f.get((yr) r04);
        if (((int) (1073741823 & r3)) != ((int) ((r3 & 1152921503533105152L) >> 30))) goto L25;
        return true;
    L25:
        return false;
    L27:
        if (r04 != ip.e) goto L29;
    L12:
        if (u60.b.get(r03) != 0) goto L14;
        boolean r05 = true;
    L15:
        if (r05 == true) goto L17;
    L14:
        r05 = false;
    L29:
        return false;
    L5:
        r02 = true;
        goto L7
    }

    public final long q() {
        if (l() == true) goto L97;
        ij r0 = (ij) g.get(this);
        hj r4 = null;
        if (r0 != null) goto L8;
    L35:
        AtomicReferenceFieldUpdater r02 = f;
    L36:
        Object r5 = r02.get(this);
        if (r5 == null) goto L38;
        if ((r5 instanceof yr) == true) goto L41;
        if (r5 == ip.e) goto L38;
    L55:
        if (r02.compareAndSet(this, r5, null) == true) goto L56;
        if (r02.get(this) == r5) goto L55;
    L56:
        Runnable r7 = (Runnable) r5;
    L57:
        if (r7 == null) goto L60;
        r7.run();
        return 0;
    L60:
        k6 r03 = this.e;
        if (r03 != null) goto L64;
    L62:
        long r72 = Long.MAX_VALUE;
    L68:
        if (r72 == 0) goto L97;
        Object r04 = f.get(this);
        if (r04 != null) goto L73;
    L83:
        ij r05 = (ij) g.get(this);
        if (r05 == null) goto L101;
        monitor-enter(r05);
        hj[] r73 = r05.a;     // Catch: Throwable -> L90
        if (r73 == null) goto L92;
        r4 = r73[0];     // Catch: Throwable -> L90
    L92:
        monitor-exit(r05);
        if (r4 == null) goto L101;
        long r3 = r4.a - System.nanoTime();
        if (r3 < 0) goto L97;
        return r3;
    L90:
        th = move-exception;
        throw th;
    L101:
        return Long.MAX_VALUE;
    L73:
        if ((r04 instanceof yr) == false) goto L81;
        long r74 = yr.f.get((yr) r04);
        if (((int) (1073741823 & r74)) != ((int) ((r74 & 1152921503533105152L) >> 30))) goto L77;
        boolean r06 = true;
    L78:
        if (r06 == true) goto L83;
    L77:
        r06 = false;
        goto L78
    L81:
        if (r04 != ip.e) goto L97;
    L64:
        if (r03.isEmpty() == true) goto L62;
        r72 = 0;
        goto L68
    L41:
        yr r6 = (yr) r5;
        Object r75 = r6.d();
        if (r75 != yr.g) goto L43;
        yr r62 = r6.c();
    L46:
        if (r02.compareAndSet(this, r5, r62) == true) goto L36;
        if (r02.get(this) == r5) goto L46;
    L43:
        r7 = (Runnable) r75;
    L38:
        r7 = null;
        goto L57
    L8:
        if (u60.b.get(r0) == 0) goto L35;
        long r52 = System.nanoTime();
    L11:
        monitor-enter(r0);
        hj[] r76 = r0.a;     // Catch: Throwable -> L23
        if (r76 == null) goto L16;
        hj r77 = r76[0];     // Catch: Throwable -> L23
    L17:
        if (r77 != null) goto L21;
        monitor-exit(r0);
        hj r78 = null;
    L31:
        if (r78 != null) goto L11;
    L21:
        if ((r52 - r77.a) < 0) goto L25;
        boolean r79 = o(r77);     // Catch: Throwable -> L23
    L26:
        if (r79 == false) goto L29;
        r78 = r0.b(0);     // Catch: Throwable -> L23
    L30:
        monitor-exit(r0);
        goto L31
    L29:
        r78 = null;
        goto L30
    L25:
        r79 = false;
        goto L26
    L16:
        r77 = null;
    L23:
        th = move-exception;
        throw th;
    L97:
        return 0;
    }

    public final void r(long r6, hj r8) {
        AtomicReferenceFieldUpdater r0 = g;
        hj r2 = null;
        if (h.get(this) == 0) goto L5;
        int r1 = 1;
    L15:
        if (r1 == 0) goto L24;
        if (r1 != 1) goto L18;
        m(r6, r8);
        return;
    L18:
        if (r1 != 2) goto L21;
        return;
    L21:
        throw new IllegalStateException("unexpected result");
    L24:
        ij r62 = (ij) r0.get(this);
        if (r62 == null) goto L37;
        monitor-enter(r62);
        hj[] r7 = r62.a;     // Catch: Throwable -> L31
        if (r7 == null) goto L33;
        r2 = r7[0];     // Catch: Throwable -> L31
    L33:
        monitor-exit(r62);
    L31:
        th = move-exception;
        throw th;
    L37:
        if (r2 != r8) goto L47;
        Thread r63 = j();
        if (Thread.currentThread() == r63) goto L48;
        LockSupport.unpark(r63);
        return;
    L48:
        return;
    L47:
        return;
    L5:
        ij r12 = (ij) r0.get(this);
        if (r12 != null) goto L14;
        ij r4 = new ij();
        r4.c = r6;
    L9:
        if (r0.compareAndSet(this, null, r4) == true) goto L13;
        if (r0.get(this) == null) goto L9;
    L13:
        Object r13 = r0.get(this);
        ip.l(r13);
        r12 = (ij) r13;
    L14:
        r1 = r8.a(r6, r12, this);
        goto L15
    }

    @Override // defpackage.kj
    public void shutdown() {
        t60.a.set(null);
        h.set(this, 1);
        l0 r0 = ip.e;
        AtomicReferenceFieldUpdater r3 = f;
    L3:
        Object r4 = r3.get(this);
        if (r4 == null) goto L6;
        if ((r4 instanceof yr) == true) goto L13;
        if (r4 == r0) goto L20;
        yr r5 = new yr(8, true);
        r5.a((Runnable) r4);
    L18:
        if (r3.compareAndSet(this, r4, r5) == true) goto L20;
        if (r3.get(this) == r4) goto L18;
    L20:
        if (q() <= 0) goto L20;
        long r2 = System.nanoTime();
    L22:
        ij r02 = (ij) g.get(this);
        if (r02 == null) goto L60;
        monitor-enter(r02);
        if (u60.b.get(r02) <= 0) goto L31;
        hj r42 = r02.b(0);     // Catch: Throwable -> L29
    L32:
        monitor-exit(r02);
        if (r42 == null) goto L38;
        m(r2, r42);
        goto L22
    L38:
        return;
    L31:
        r42 = null;
    L29:
        th = move-exception;
        throw th;
    L60:
        return;
    L13:
        ((yr) r4).b();
    L6:
        if (r3.compareAndSet(this, null, r0) == true) goto L20;
        if (r3.get(this) == null) goto L6;
        goto L3
    }
}
