package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: jj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0376jj extends AbstractC0413kj implements InterfaceC0186eg {

    /* JADX INFO: renamed from: f */
    public static final AtomicReferenceFieldUpdater f2636f = AtomicReferenceFieldUpdater.newUpdater(AbstractC0376jj.class, Object.class, "_queue");

    /* JADX INFO: renamed from: g */
    public static final AtomicReferenceFieldUpdater f2637g = AtomicReferenceFieldUpdater.newUpdater(AbstractC0376jj.class, Object.class, "_delayed");

    /* JADX INFO: renamed from: h */
    public static final AtomicIntegerFieldUpdater f2638h = AtomicIntegerFieldUpdater.newUpdater(AbstractC0376jj.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // p000.InterfaceC0186eg
    /* JADX INFO: renamed from: c */
    public final void mo1026c(long j, C0326i8 c0326i8) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C0263gj c0263gj = new C0263gj(this, j2 + jNanoTime, c0326i8);
            m1603r(jNanoTime, c0263gj);
            c0326i8.m1413n(new C0018ah(0, c0263gj));
        }
    }

    @Override // p000.AbstractC0408ke
    /* JADX INFO: renamed from: d */
    public final void mo1598d(InterfaceC0258ge interfaceC0258ge, Runnable runnable) {
        mo1599n(runnable);
    }

    /* JADX INFO: renamed from: n */
    public void mo1599n(Runnable runnable) {
        if (!m1600o(runnable)) {
            RunnableC0409kf.f2886i.mo1599n(runnable);
            return;
        }
        Thread threadMo1695j = mo1695j();
        if (Thread.currentThread() != threadMo1695j) {
            LockSupport.unpark(threadMo1695j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1600o(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.AbstractC0376jj.f2636f
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = p000.AbstractC0376jj.f2638h
            int r2 = r2.get(r6)
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            r2 = 1
            if (r1 != 0) goto L22
        L13:
            r1 = 0
            boolean r1 = r0.compareAndSet(r6, r1, r7)
            if (r1 == 0) goto L1b
            goto L62
        L1b:
            java.lang.Object r1 = r0.get(r6)
            if (r1 == 0) goto L13
            goto L0
        L22:
            boolean r4 = r1 instanceof p000.C0940yr
            if (r4 == 0) goto L47
            r4 = r1
            yr r4 = (p000.C0940yr) r4
            int r5 = r4.m2738a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            yr r3 = r4.m2740c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            l0 r4 = p000.AbstractC0346ip.f2476e
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            yr r3 = new yr
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.m2738a(r4)
            r3.m2738a(r7)
        L5c:
            boolean r4 = r0.compareAndSet(r6, r1, r3)
            if (r4 == 0) goto L63
        L62:
            return r2
        L63:
            java.lang.Object r4 = r0.get(r6)
            if (r4 == r1) goto L5c
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0376jj.m1600o(java.lang.Runnable):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1601p() {
        /*
            r7 = this;
            k6 r0 = r7.f2906e
            r1 = 1
            if (r0 == 0) goto La
            boolean r0 = r0.isEmpty()
            goto Lb
        La:
            r0 = r1
        Lb:
            r2 = 0
            if (r0 != 0) goto Lf
            goto L54
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.AbstractC0376jj.f2637g
            java.lang.Object r0 = r0.get(r7)
            ij r0 = (p000.C0336ij) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = p000.u60.f4672b
            int r0 = r3.get(r0)
            if (r0 != 0) goto L23
            r0 = r1
            goto L24
        L23:
            r0 = r2
        L24:
            if (r0 != 0) goto L27
            goto L54
        L27:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.AbstractC0376jj.f2636f
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof p000.C0940yr
            if (r3 == 0) goto L4f
            yr r0 = (p000.C0940yr) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = p000.C0940yr.f5396f
            long r3 = r3.get(r0)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            int r0 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r3 = r3 & r5
            r5 = 30
            long r3 = r3 >> r5
            int r3 = (int) r3
            if (r0 != r3) goto L4e
            return r1
        L4e:
            return r2
        L4f:
            l0 r3 = p000.AbstractC0346ip.f2476e
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0376jj.m1601p():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        r7 = null;
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m1602q() {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0376jj.m1602q():long");
    }

    /* JADX INFO: renamed from: r */
    public final void m1603r(long j, AbstractRunnableC0300hj abstractRunnableC0300hj) {
        int iM1360a;
        Thread threadMo1695j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2637g;
        if (f2638h.get(this) != 0) {
            iM1360a = 1;
        } else {
            C0336ij c0336ij = (C0336ij) atomicReferenceFieldUpdater.get(this);
            if (c0336ij == null) {
                C0336ij c0336ij2 = new C0336ij();
                c0336ij2.f2436c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0336ij2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                AbstractC0346ip.m1500l(obj);
                c0336ij = (C0336ij) obj;
            }
            iM1360a = abstractRunnableC0300hj.m1360a(j, c0336ij, this);
        }
        if (iM1360a != 0) {
            if (iM1360a == 1) {
                mo1696m(j, abstractRunnableC0300hj);
                return;
            } else {
                if (iM1360a != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C0336ij c0336ij3 = (C0336ij) atomicReferenceFieldUpdater.get(this);
        if (c0336ij3 != null) {
            synchronized (c0336ij3) {
                AbstractRunnableC0300hj[] abstractRunnableC0300hjArr = c0336ij3.f4673a;
                abstractRunnableC0300hj = abstractRunnableC0300hjArr != null ? abstractRunnableC0300hjArr[0] : null;
            }
        }
        if (abstractRunnableC0300hj != abstractRunnableC0300hj || Thread.currentThread() == (threadMo1695j = mo1695j())) {
            return;
        }
        LockSupport.unpark(threadMo1695j);
    }

    @Override // p000.AbstractC0413kj
    public void shutdown() {
        AbstractRunnableC0300hj abstractRunnableC0300hjM2422b;
        t60.f4515a.set(null);
        f2638h.set(this, 1);
        C0431l0 c0431l0 = AbstractC0346ip.f2476e;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2636f;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof C0940yr)) {
                    if (obj != c0431l0) {
                        C0940yr c0940yr = new C0940yr(8, true);
                        c0940yr.m2738a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0940yr)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C0940yr) obj).m2739b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0431l0)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (m1602q() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C0336ij c0336ij = (C0336ij) f2637g.get(this);
            if (c0336ij == null) {
                return;
            }
            synchronized (c0336ij) {
                abstractRunnableC0300hjM2422b = u60.f4672b.get(c0336ij) > 0 ? c0336ij.m2422b(0) : null;
            }
            if (abstractRunnableC0300hjM2422b == null) {
                return;
            } else {
                mo1696m(jNanoTime, abstractRunnableC0300hjM2422b);
            }
        }
    }
}
