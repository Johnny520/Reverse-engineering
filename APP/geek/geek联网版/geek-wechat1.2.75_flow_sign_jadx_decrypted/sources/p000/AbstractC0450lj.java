package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: lj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0450lj extends AbstractC0487mj implements InterfaceC0223fg {

    /* JADX INFO: renamed from: f */
    public static final AtomicReferenceFieldUpdater f3006f = AtomicReferenceFieldUpdater.newUpdater(AbstractC0450lj.class, Object.class, "_queue");

    /* JADX INFO: renamed from: g */
    public static final AtomicReferenceFieldUpdater f3007g = AtomicReferenceFieldUpdater.newUpdater(AbstractC0450lj.class, Object.class, "_delayed");

    /* JADX INFO: renamed from: h */
    public static final AtomicIntegerFieldUpdater f3008h = AtomicIntegerFieldUpdater.newUpdater(AbstractC0450lj.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // p000.InterfaceC0223fg
    /* JADX INFO: renamed from: c */
    public final void mo1099c(long j, C0698s8 c0698s8) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C0336ij c0336ij = new C0336ij(this, j2 + jNanoTime, c0698s8);
            m1769r(jNanoTime, c0336ij);
            c0698s8.m2322n(new C0104ch(0, c0336ij));
        }
    }

    @Override // p000.AbstractC0445le
    /* JADX INFO: renamed from: d */
    public final void mo584d(InterfaceC0295he interfaceC0295he, Runnable runnable) {
        mo1763n(runnable);
    }

    /* JADX INFO: renamed from: n */
    public void mo1763n(Runnable runnable) {
        if (!m1766o(runnable)) {
            RunnableC0446lf.f2999i.mo1763n(runnable);
            return;
        }
        Thread threadMo1761j = mo1761j();
        if (Thread.currentThread() != threadMo1761j) {
            LockSupport.unpark(threadMo1761j);
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
    public final boolean m1766o(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.AbstractC0450lj.f3006f
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = p000.AbstractC0450lj.f3008h
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
            boolean r4 = r1 instanceof p000.C0125cs
            if (r4 == 0) goto L47
            r4 = r1
            cs r4 = (p000.C0125cs) r4
            int r5 = r4.m779a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            cs r3 = r4.m781c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            l0 r4 = p000.AbstractC0493mp.f3167e
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            cs r3 = new cs
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.m779a(r4)
            r3.m779a(r7)
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
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0450lj.m1766o(java.lang.Runnable):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m1767p() {
        /*
            r7 = this;
            k6 r0 = r7.f3151e
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
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.AbstractC0450lj.f3007g
            java.lang.Object r0 = r0.get(r7)
            kj r0 = (p000.C0413kj) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = p000.a70.f46b
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
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.AbstractC0450lj.f3006f
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof p000.C0125cs
            if (r3 == 0) goto L4f
            cs r0 = (p000.C0125cs) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = p000.C0125cs.f1253f
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
            l0 r3 = p000.AbstractC0493mp.f3167e
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0450lj.m1767p():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        r7 = null;
     */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m1768q() {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0450lj.m1768q():long");
    }

    /* JADX INFO: renamed from: r */
    public final void m1769r(long j, AbstractRunnableC0376jj abstractRunnableC0376jj) {
        int iM1613a;
        Thread threadMo1761j;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3007g;
        if (f3008h.get(this) != 0) {
            iM1613a = 1;
        } else {
            C0413kj c0413kj = (C0413kj) atomicReferenceFieldUpdater.get(this);
            if (c0413kj == null) {
                C0413kj c0413kj2 = new C0413kj();
                c0413kj2.f2844c = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0413kj2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                AbstractC0493mp.m1854d(obj);
                c0413kj = (C0413kj) obj;
            }
            iM1613a = abstractRunnableC0376jj.m1613a(j, c0413kj, this);
        }
        if (iM1613a != 0) {
            if (iM1613a == 1) {
                mo1762m(j, abstractRunnableC0376jj);
                return;
            } else {
                if (iM1613a != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C0413kj c0413kj3 = (C0413kj) atomicReferenceFieldUpdater.get(this);
        if (c0413kj3 != null) {
            synchronized (c0413kj3) {
                AbstractRunnableC0376jj[] abstractRunnableC0376jjArr = c0413kj3.f47a;
                abstractRunnableC0376jj = abstractRunnableC0376jjArr != null ? abstractRunnableC0376jjArr[0] : null;
            }
        }
        if (abstractRunnableC0376jj != abstractRunnableC0376jj || Thread.currentThread() == (threadMo1761j = mo1761j())) {
            return;
        }
        LockSupport.unpark(threadMo1761j);
    }

    @Override // p000.AbstractC0487mj
    public void shutdown() {
        AbstractRunnableC0376jj abstractRunnableC0376jjM31b;
        z60.f5555a.set(null);
        f3008h.set(this, 1);
        C0431l0 c0431l0 = AbstractC0493mp.f3167e;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3006f;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof C0125cs)) {
                    if (obj != c0431l0) {
                        C0125cs c0125cs = new C0125cs(8, true);
                        c0125cs.m779a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0125cs)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C0125cs) obj).m780b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0431l0)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (m1768q() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C0413kj c0413kj = (C0413kj) f3007g.get(this);
            if (c0413kj == null) {
                return;
            }
            synchronized (c0413kj) {
                abstractRunnableC0376jjM31b = a70.f46b.get(c0413kj) > 0 ? c0413kj.m31b(0) : null;
            }
            if (abstractRunnableC0376jjM31b == null) {
                return;
            } else {
                mo1762m(jNanoTime, abstractRunnableC0376jjM31b);
            }
        }
    }
}
