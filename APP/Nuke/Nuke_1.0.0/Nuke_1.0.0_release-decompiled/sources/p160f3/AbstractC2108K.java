package p160f3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p074O2.InterfaceC1051i;
import p117X2.AbstractC1665j;
import p121Y1.C1753n;
import p190k3.C2465m;
import p190k3.C2473u;

/* JADX INFO: renamed from: f3.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2108K extends AbstractC2109L implements InterfaceC2165y {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7039j = AtomicReferenceFieldUpdater.newUpdater(AbstractC2108K.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7040k = AtomicReferenceFieldUpdater.newUpdater(AbstractC2108K.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7041l = AtomicIntegerFieldUpdater.newUpdater(AbstractC2108K.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // p160f3.AbstractC2153p
    /* JADX INFO: renamed from: D */
    public final void mo1207D(InterfaceC1051i interfaceC1051i, Runnable runnable) {
        mo3891N(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r7 = null;
     */
    @Override // p160f3.AbstractC2109L
    /* JADX INFO: renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo3890K() {
        /*
            r10 = this;
            Y1.n r0 = p160f3.AbstractC2162v.f7112c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p160f3.AbstractC2108K.f7039j
            boolean r2 = r10.m3902L()
            r3 = 0
            if (r2 == 0) goto Le
            goto Lb4
        Le:
            r10.m3892O()
        L11:
            java.lang.Object r2 = r1.get(r10)
            r5 = 0
            if (r2 != 0) goto L1a
        L18:
            r7 = r5
            goto L4a
        L1a:
            boolean r6 = r2 instanceof p190k3.C2465m
            if (r6 == 0) goto L3e
            r6 = r2
            k3.m r6 = (p190k3.C2465m) r6
            java.lang.Object r7 = r6.m4401d()
            Y1.n r8 = p190k3.C2465m.f7949g
            if (r7 == r8) goto L2c
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            goto L4a
        L2c:
            k3.m r6 = r6.m4400c()
        L30:
            boolean r5 = r1.compareAndSet(r10, r2, r6)
            if (r5 == 0) goto L37
            goto L11
        L37:
            java.lang.Object r5 = r1.get(r10)
            if (r5 == r2) goto L30
            goto L11
        L3e:
            if (r2 != r0) goto L41
            goto L18
        L41:
            boolean r6 = r1.compareAndSet(r10, r2, r5)
            if (r6 == 0) goto Lb9
            r7 = r2
            java.lang.Runnable r7 = (java.lang.Runnable) r7
        L4a:
            if (r7 == 0) goto L50
            r7.run()
            return r3
        L50:
            L2.k r2 = r10.f7045h
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 != 0) goto L5b
        L59:
            r8 = r6
            goto L63
        L5b:
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L59
        L62:
            r8 = r3
        L63:
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lb4
        L68:
            java.lang.Object r1 = r1.get(r10)
            if (r1 == 0) goto L90
            boolean r2 = r1 instanceof p190k3.C2465m
            if (r2 == 0) goto L8d
            k3.m r1 = (p190k3.C2465m) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p190k3.C2465m.f7948f
            long r0 = r0.get(r1)
            r8 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r8 = r8 & r0
            int r2 = (int) r8
            r8 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r0 = r0 & r8
            r8 = 30
            long r0 = r0 >> r8
            int r0 = (int) r0
            if (r2 != r0) goto L8c
            goto L90
        L8c:
            return r3
        L8d:
            if (r1 != r0) goto Lb4
            goto Lb8
        L90:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p160f3.AbstractC2108K.f7040k
            java.lang.Object r0 = r0.get(r10)
            f3.J r0 = (p160f3.C2107J) r0
            if (r0 == 0) goto Lb8
            monitor-enter(r0)
            f3.I[] r1 = r0.f7962a     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto La5
            r2 = 0
            r5 = r1[r2]     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r1 = move-exception
            goto Lb6
        La5:
            monitor-exit(r0)
            if (r5 != 0) goto La9
            goto Lb8
        La9:
            long r0 = r5.f7036d
            long r5 = java.lang.System.nanoTime()
            long r0 = r0 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto Lb5
        Lb4:
            return r3
        Lb5:
            return r0
        Lb6:
            monitor-exit(r0)
            throw r1
        Lb8:
            return r6
        Lb9:
            java.lang.Object r6 = r1.get(r10)
            if (r6 == r2) goto L41
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: p160f3.AbstractC2108K.mo3890K():long");
    }

    /* JADX INFO: renamed from: N */
    public void mo3891N(Runnable runnable) {
        m3892O();
        if (!m3893P(runnable)) {
            RunnableC2163w.f7120m.mo3891N(runnable);
            return;
        }
        Thread threadMo3900I = mo3900I();
        if (Thread.currentThread() != threadMo3900I) {
            LockSupport.unpark(threadMo3900I);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m3892O() {
        AbstractRunnableC2106I abstractRunnableC2106IM4409b;
        C2107J c2107j = (C2107J) f7040k.get(this);
        if (c2107j == null || C2473u.f7961b.get(c2107j) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c2107j) {
                try {
                    AbstractRunnableC2106I[] abstractRunnableC2106IArr = c2107j.f7962a;
                    AbstractRunnableC2106I abstractRunnableC2106I = abstractRunnableC2106IArr != null ? abstractRunnableC2106IArr[0] : null;
                    if (abstractRunnableC2106I != null) {
                        abstractRunnableC2106IM4409b = ((jNanoTime - abstractRunnableC2106I.f7036d) > 0L ? 1 : ((jNanoTime - abstractRunnableC2106I.f7036d) == 0L ? 0 : -1)) >= 0 ? m3893P(abstractRunnableC2106I) : false ? c2107j.m4409b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC2106IM4409b != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3893P(java.lang.Runnable r7) {
        /*
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p160f3.AbstractC2108K.f7039j
            java.lang.Object r1 = r0.get(r6)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = p160f3.AbstractC2108K.f7041l
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
            boolean r4 = r1 instanceof p190k3.C2465m
            if (r4 == 0) goto L47
            r4 = r1
            k3.m r4 = (p190k3.C2465m) r4
            int r5 = r4.m4398a(r7)
            if (r5 == 0) goto L62
            if (r5 == r2) goto L35
            r0 = 2
            if (r5 == r0) goto L4b
            goto L0
        L35:
            k3.m r3 = r4.m4400c()
        L39:
            boolean r2 = r0.compareAndSet(r6, r1, r3)
            if (r2 == 0) goto L40
            goto L0
        L40:
            java.lang.Object r2 = r0.get(r6)
            if (r2 == r1) goto L39
            goto L0
        L47:
            Y1.n r4 = p160f3.AbstractC2162v.f7112c
            if (r1 != r4) goto L4c
        L4b:
            return r3
        L4c:
            k3.m r3 = new k3.m
            r4 = 8
            r3.<init>(r4, r2)
            r4 = r1
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r3.m4398a(r4)
            r3.m4398a(r7)
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
        throw new UnsupportedOperationException("Method not decompiled: p160f3.AbstractC2108K.m3893P(java.lang.Runnable):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3894Q() {
        /*
            r7 = this;
            L2.k r0 = r7.f7045h
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
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p160f3.AbstractC2108K.f7040k
            java.lang.Object r0 = r0.get(r7)
            f3.J r0 = (p160f3.C2107J) r0
            if (r0 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = p190k3.C2473u.f7961b
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
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p160f3.AbstractC2108K.f7039j
            java.lang.Object r0 = r0.get(r7)
            if (r0 != 0) goto L30
            goto L53
        L30:
            boolean r3 = r0 instanceof p190k3.C2465m
            if (r3 == 0) goto L4f
            k3.m r0 = (p190k3.C2465m) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = p190k3.C2465m.f7948f
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
            Y1.n r3 = p160f3.AbstractC2162v.f7112c
            if (r0 != r3) goto L54
        L53:
            return r1
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p160f3.AbstractC2108K.m3894Q():boolean");
    }

    /* JADX INFO: renamed from: R */
    public final void m3895R(long j5, AbstractRunnableC2106I abstractRunnableC2106I) {
        int iM3888b;
        Thread threadMo3900I;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7040k;
        if (f7041l.get(this) != 0) {
            iM3888b = 1;
        } else {
            C2107J c2107j = (C2107J) atomicReferenceFieldUpdater.get(this);
            if (c2107j == null) {
                C2107J c2107j2 = new C2107J();
                c2107j2.f7038c = j5;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c2107j2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                AbstractC1665j.m2982b(obj);
                c2107j = (C2107J) obj;
            }
            iM3888b = abstractRunnableC2106I.m3888b(j5, c2107j, this);
        }
        if (iM3888b != 0) {
            if (iM3888b == 1) {
                mo3903M(j5, abstractRunnableC2106I);
                return;
            } else {
                if (iM3888b != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C2107J c2107j3 = (C2107J) atomicReferenceFieldUpdater.get(this);
        if (c2107j3 != null) {
            synchronized (c2107j3) {
                AbstractRunnableC2106I[] abstractRunnableC2106IArr = c2107j3.f7962a;
                abstractRunnableC2106I = abstractRunnableC2106IArr != null ? abstractRunnableC2106IArr[0] : null;
            }
        }
        if (abstractRunnableC2106I != abstractRunnableC2106I || Thread.currentThread() == (threadMo3900I = mo3900I())) {
            return;
        }
        LockSupport.unpark(threadMo3900I);
    }

    @Override // p160f3.InterfaceC2165y
    /* JADX INFO: renamed from: d */
    public final void mo3896d(long j5, C2135g c2135g) {
        long j6 = j5 > 0 ? j5 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j5 : 0L;
        if (j6 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C2104G c2104g = new C2104G(this, j6 + jNanoTime, c2135g);
            m3895R(jNanoTime, c2104g);
            c2135g.m3971x(new C2131e(1, c2104g));
        }
    }

    @Override // p160f3.InterfaceC2165y
    /* JADX INFO: renamed from: f */
    public InterfaceC2101D mo3897f(long j5, RunnableC2148m0 runnableC2148m0, InterfaceC1051i interfaceC1051i) {
        return AbstractC2164x.f7122a.mo3897f(j5, runnableC2148m0, interfaceC1051i);
    }

    @Override // p160f3.AbstractC2109L
    public void shutdown() {
        AbstractRunnableC2106I abstractRunnableC2106IM4409b;
        AbstractC2144k0.f7083a.set(null);
        f7041l.set(this, 1);
        C1753n c1753n = AbstractC2162v.f7112c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7039j;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                if (!(obj instanceof C2465m)) {
                    if (obj != c1753n) {
                        C2465m c2465m = new C2465m(8, true);
                        c2465m.m4398a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2465m)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((C2465m) obj).m4399b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c1753n)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (mo3890K() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C2107J c2107j = (C2107J) f7040k.get(this);
            if (c2107j == null) {
                return;
            }
            synchronized (c2107j) {
                abstractRunnableC2106IM4409b = C2473u.f7961b.get(c2107j) > 0 ? c2107j.m4409b(0) : null;
            }
            if (abstractRunnableC2106IM4409b == null) {
                return;
            } else {
                mo3903M(jNanoTime, abstractRunnableC2106IM4409b);
            }
        }
    }
}
