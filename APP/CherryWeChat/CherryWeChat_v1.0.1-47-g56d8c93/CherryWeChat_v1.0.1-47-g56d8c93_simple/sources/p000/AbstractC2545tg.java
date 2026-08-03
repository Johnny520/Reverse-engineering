package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: tg */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2545tg extends AbstractC2588ug implements InterfaceC2413qd {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8861e = null;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8862f = null;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8863g = null;
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    static {
        f8861e = AtomicReferenceFieldUpdater.newUpdater(AbstractC2545tg.class, Object.class, "_queue$volatile");
        f8862f = AtomicReferenceFieldUpdater.newUpdater(AbstractC2545tg.class, Object.class, "_delayed$volatile");
        f8863g = AtomicIntegerFieldUpdater.newUpdater(AbstractC2545tg.class, "_isCompleted$volatile");
    }

    /* JADX INFO: renamed from: B */
    public void mo1323B(Runnable r2) {
        m5026C();
        if (m5027D(r2) == false) goto L8;
        Thread r22 = mo1325x();
        if (Thread.currentThread() == r22) goto L10;
        LockSupport.unpark(r22);
        return;
    L10:
        return;
    L8:
        RunnableC0664Pc.f2120h.mo1323B(r2);
    }

    /* JADX INFO: renamed from: C */
    public final void m5026C() {
        C2502sg r0 = (C2502sg) f8862f.get(this);
        if (r0 != null) goto L5;
        return;
    L5:
        if (C1209bB.f4139b.get(r0) != 0) goto L7;
        return;
    L7:
        long r1 = System.nanoTime();
    L8:
        monitor-enter(r0);
        AbstractRunnableC2459rg[] r3 = r0.f4140a;     // Catch: Throwable -> L20
        AbstractRunnableC2459rg r4 = null;
        if (r3 == null) goto L13;
        AbstractRunnableC2459rg r32 = r3[0];     // Catch: Throwable -> L20
    L14:
        if (r32 != null) goto L18;
        monitor-exit(r0);
    L26:
        if (r4 != null) goto L8;
        return;
    L18:
        if ((r1 - r32.f8666a) < 0) goto L22;
        boolean r33 = m5027D(r32);     // Catch: Throwable -> L20
    L23:
        if (r33 == false) goto L25;
        r4 = r0.m2331b(0);     // Catch: Throwable -> L20
    L25:
        monitor-exit(r0);
        goto L26
    L22:
        r33 = false;
        goto L23
    L13:
        r32 = null;
    L20:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m5027D(Runnable r6) {
    L2:
        AtomicReferenceFieldUpdater r0 = f8861e;
        Object r1 = r0.get(this);
        if (f8863g.get(this) == 1) goto L29;
        if (r1 == null) goto L7;
        if ((r1 instanceof C1422fp) == true) goto L14;
        if (r1 == AbstractC0628Oj.f2012f) goto L60;
        C1422fp r2 = new C1422fp(8, true);
        r2.m2732a((Runnable) r1);
        r2.m2732a(r6);
    L33:
        if (r0.compareAndSet(this, r1, r2) == true) goto L34;
        if (r0.get(this) == r1) goto L33;
    L34:
        return true;
    L60:
        return false;
    L14:
        C1422fp r22 = (C1422fp) r1;
        int r4 = r22.m2732a(r6);
        if (r4 == 0) goto L34;
        if (r4 != 1) goto L18;
        C1422fp r23 = r22.m2734c();
    L22:
        if (r0.compareAndSet(this, r1, r23) == true) goto L2;
        if (r0.get(this) == r1) goto L22;
    L18:
        if (r4 != 2) goto L2;
        return false;
    L7:
        if (r0.compareAndSet(this, null, r6) == true) goto L34;
        if (r0.get(this) == null) goto L7;
    L29:
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m5028E() {
        C0134D4 r0 = this.f8959d;
        if (r0 == null) goto L5;
        boolean r02 = r0.isEmpty();
    L7:
        if (r02 == false) goto L29;
        C2502sg r03 = (C2502sg) f8862f.get(this);
        if (r03 != null) goto L12;
    L17:
        Object r04 = f8861e.get(this);
        if (r04 != null) goto L21;
    L28:
        return true;
    L21:
        if ((r04 instanceof C1422fp) == false) goto L27;
        long r3 = C1422fp.f5016f.get((C1422fp) r04);
        if (((int) (1073741823 & r3)) != ((int) ((r3 & 1152921503533105152L) >> 30))) goto L25;
        return true;
    L25:
        return false;
    L27:
        if (r04 != AbstractC0628Oj.f2012f) goto L29;
    L12:
        if (C1209bB.f4139b.get(r03) != 0) goto L14;
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

    /* JADX INFO: renamed from: F */
    public final long m5029F() {
        C2610v1 r0 = AbstractC0628Oj.f2012f;
        AtomicReferenceFieldUpdater r1 = f8861e;
        if (m5097z() == true) goto L63;
        m5026C();
    L6:
        Object r2 = r1.get(this);
        AbstractRunnableC2459rg r5 = null;
        if (r2 == null) goto L8;
        if ((r2 instanceof C1422fp) == true) goto L11;
        if (r2 == r0) goto L8;
    L24:
        if (r1.compareAndSet(this, r2, null) == true) goto L25;
        if (r1.get(this) == r2) goto L24;
    L25:
        Runnable r7 = (Runnable) r2;
    L26:
        if (r7 == null) goto L29;
        r7.run();
        return 0;
    L29:
        C0134D4 r22 = this.f8959d;
        if (r22 != null) goto L33;
    L31:
        long r8 = Long.MAX_VALUE;
    L37:
        if (r8 == 0) goto L63;
        Object r12 = r1.get(this);
        if (r12 != null) goto L42;
    L49:
        C2502sg r02 = (C2502sg) f8862f.get(this);
        if (r02 == null) goto L67;
        monitor-enter(r02);
        AbstractRunnableC2459rg[] r13 = r02.f4140a;     // Catch: Throwable -> L56
        if (r13 == null) goto L58;
        r5 = r13[0];     // Catch: Throwable -> L56
    L58:
        monitor-exit(r02);
        if (r5 == null) goto L67;
        long r03 = r5.f8666a - System.nanoTime();
        if (r03 < 0) goto L63;
        return r03;
    L56:
        th = move-exception;
        throw th;
    L67:
        return Long.MAX_VALUE;
    L42:
        if ((r12 instanceof C1422fp) == false) goto L47;
        long r04 = C1422fp.f5016f.get((C1422fp) r12);
        if (((int) (1073741823 & r04)) == ((int) ((r04 & 1152921503533105152L) >> 30))) goto L49;
        return 0;
    L47:
        if (r12 != r0) goto L63;
    L33:
        if (r22.isEmpty() == true) goto L31;
        r8 = 0;
        goto L37
    L11:
        C1422fp r6 = (C1422fp) r2;
        Object r72 = r6.m2735d();
        if (r72 != C1422fp.f5017g) goto L13;
        C1422fp r62 = r6.m2734c();
    L16:
        if (r1.compareAndSet(this, r2, r62) == true) goto L6;
        if (r1.get(this) == r2) goto L16;
    L13:
        r7 = (Runnable) r72;
    L8:
        r7 = null;
    L63:
        return 0;
    }

    /* JADX INFO: renamed from: G */
    public final void m5030G(long r6, AbstractRunnableC2459rg r8) {
        AtomicReferenceFieldUpdater r0 = f8862f;
        AbstractRunnableC2459rg r2 = null;
        if (f8863g.get(this) != 1) goto L5;
        int r1 = 1;
    L15:
        if (r1 == 0) goto L24;
        if (r1 != 1) goto L18;
        mo1322A(r6, r8);
        return;
    L18:
        if (r1 != 2) goto L21;
        return;
    L21:
        throw new IllegalStateException("unexpected result");
    L24:
        C2502sg r62 = (C2502sg) r0.get(this);
        if (r62 == null) goto L37;
        monitor-enter(r62);
        AbstractRunnableC2459rg[] r7 = r62.f4140a;     // Catch: Throwable -> L31
        if (r7 == null) goto L33;
        r2 = r7[0];     // Catch: Throwable -> L31
    L33:
        monitor-exit(r62);
    L31:
        th = move-exception;
        throw th;
    L37:
        if (r2 != r8) goto L47;
        Thread r63 = mo1325x();
        if (Thread.currentThread() == r63) goto L48;
        LockSupport.unpark(r63);
        return;
    L48:
        return;
    L47:
        return;
    L5:
        C2502sg r12 = (C2502sg) r0.get(this);
        if (r12 != null) goto L14;
        C2502sg r4 = new C2502sg();
        r4.f8789c = r6;
    L9:
        if (r0.compareAndSet(this, null, r4) == true) goto L13;
        if (r0.get(this) == null) goto L9;
    L13:
        r12 = (C2502sg) r0.get(this);
    L14:
        r1 = r8.m4950c(r6, r12, this);
        goto L15
    }

    @Override // p000.InterfaceC2413qd
    /* JADX INFO: renamed from: f */
    public final void mo2668f(long r4, C0523M6 r6) {
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
        C2416qg r2 = new C2416qg(this, r0 + r42, r6);
        m5030G(r42, r2);
        AbstractC0828TB.m1649r(r6, new C0394J6(1, r2));
        return;
    }

    @Override // p000.AbstractC2588ug
    public void shutdown() {
        AbstractC1129aB.f3579a.set(null);
        f8863g.set(this, 1);
        C2610v1 r0 = AbstractC0628Oj.f2012f;
        AtomicReferenceFieldUpdater r3 = f8861e;
    L3:
        Object r4 = r3.get(this);
        if (r4 == null) goto L6;
        if ((r4 instanceof C1422fp) == true) goto L13;
        if (r4 == r0) goto L20;
        C1422fp r5 = new C1422fp(8, true);
        r5.m2732a((Runnable) r4);
    L18:
        if (r3.compareAndSet(this, r4, r5) == true) goto L20;
        if (r3.get(this) == r4) goto L18;
    L20:
        if (m5029F() <= 0) goto L20;
        long r2 = System.nanoTime();
    L22:
        C2502sg r02 = (C2502sg) f8862f.get(this);
        if (r02 == null) goto L60;
        monitor-enter(r02);
        if (C1209bB.f4139b.get(r02) <= 0) goto L31;
        AbstractRunnableC2459rg r42 = r02.m2331b(0);     // Catch: Throwable -> L29
    L32:
        monitor-exit(r02);
        if (r42 == null) goto L38;
        mo1322A(r2, r42);
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
        ((C1422fp) r4).m2733b();
    L6:
        if (r3.compareAndSet(this, null, r0) == true) goto L20;
        if (r3.get(this) == null) goto L6;
        goto L3
    }

    @Override // p000.AbstractC1217bc
    /* JADX INFO: renamed from: t */
    public final void mo1781t(InterfaceC1137ac r1, Runnable r2) {
        mo1323B(r2);
    }
}
