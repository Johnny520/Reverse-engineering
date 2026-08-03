package p353xg;

import gg.C1425u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import p162l3.C2463q;

/* JADX INFO: renamed from: xg.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5804a extends Thread {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f23557o = AtomicIntegerFieldUpdater.newUpdater(C5804a.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: g */
    public final C5815l f23558g;

    /* JADX INFO: renamed from: h */
    public final C1425u f23559h;

    /* JADX INFO: renamed from: i */
    public EnumC5805b f23560i;
    private volatile int indexInArray;

    /* JADX INFO: renamed from: j */
    public long f23561j;

    /* JADX INFO: renamed from: k */
    public long f23562k;

    /* JADX INFO: renamed from: l */
    public int f23563l;

    /* JADX INFO: renamed from: m */
    public boolean f23564m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ ExecutorC5806c f23565n;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5804a(ExecutorC5806c executorC5806c, int i9) {
        this.f23565n = executorC5806c;
        setDaemon(true);
        setContextClassLoader(ExecutorC5806c.class.getClassLoader());
        this.f23558g = new C5815l();
        this.f23559h = new C1425u();
        this.f23560i = EnumC5805b.f23569j;
        this.nextParkedWorker = ExecutorC5806c.f23575q;
        int iNanoTime = (int) System.nanoTime();
        this.f23563l = iNanoTime == 0 ? 42 : iNanoTime;
        m10526f(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = p353xg.C5815l.f23600d.get(r9);
        r0 = p353xg.C5815l.f23599c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (p353xg.C5815l.f23601e.get(r9) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r9.m10538c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r7 = r1;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC5811h m10521a(boolean z9) {
        AbstractRunnableC5811h abstractRunnableC5811hM10525e;
        AbstractRunnableC5811h abstractRunnableC5811hM10525e2;
        long j3;
        EnumC5805b enumC5805b = this.f23560i;
        ExecutorC5806c executorC5806c = this.f23565n;
        AbstractRunnableC5811h abstractRunnableC5811h = null;
        C5815l c5815l = this.f23558g;
        EnumC5805b enumC5805b2 = EnumC5805b.f23566g;
        if (enumC5805b != enumC5805b2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC5806c.f23573o;
            do {
                j3 = atomicLongFieldUpdater.get(executorC5806c);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    c5815l.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5815l.f23598b;
                        AbstractRunnableC5811h abstractRunnableC5811h2 = (AbstractRunnableC5811h) atomicReferenceFieldUpdater.get(c5815l);
                        if (abstractRunnableC5811h2 == null || !abstractRunnableC5811h2.f23589h) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(c5815l, abstractRunnableC5811h2, null)) {
                            if (atomicReferenceFieldUpdater.get(c5815l) != abstractRunnableC5811h2) {
                                break;
                            }
                        }
                        abstractRunnableC5811h = abstractRunnableC5811h2;
                        break loop1;
                    }
                    if (abstractRunnableC5811h != null) {
                        return abstractRunnableC5811h;
                    }
                    AbstractRunnableC5811h abstractRunnableC5811h3 = (AbstractRunnableC5811h) executorC5806c.f23581l.m9006d();
                    return abstractRunnableC5811h3 == null ? m10529i(1) : abstractRunnableC5811h3;
                }
            } while (!ExecutorC5806c.f23573o.compareAndSet(executorC5806c, j3, j3 - 4398046511104L));
            this.f23560i = enumC5805b2;
        }
        if (z9) {
            boolean z10 = m10524d(executorC5806c.f23576g * 2) == 0;
            if (z10 && (abstractRunnableC5811hM10525e2 = m10525e()) != null) {
                return abstractRunnableC5811hM10525e2;
            }
            c5815l.getClass();
            AbstractRunnableC5811h abstractRunnableC5811hM10537b = (AbstractRunnableC5811h) C5815l.f23598b.getAndSet(c5815l, null);
            if (abstractRunnableC5811hM10537b == null) {
                abstractRunnableC5811hM10537b = c5815l.m10537b();
            }
            if (abstractRunnableC5811hM10537b != null) {
                return abstractRunnableC5811hM10537b;
            }
            if (!z10 && (abstractRunnableC5811hM10525e = m10525e()) != null) {
                return abstractRunnableC5811hM10525e;
            }
        } else {
            AbstractRunnableC5811h abstractRunnableC5811hM10525e3 = m10525e();
            if (abstractRunnableC5811hM10525e3 != null) {
                return abstractRunnableC5811hM10525e3;
            }
        }
        return m10529i(3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m10522b() {
        return this.indexInArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Object m10523c() {
        return this.nextParkedWorker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m10524d(int i9) {
        int i10 = this.f23563l;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f23563l = i13;
        int i14 = i9 - 1;
        return (i14 & i9) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final AbstractRunnableC5811h m10525e() {
        int iM10524d = m10524d(2);
        ExecutorC5806c executorC5806c = this.f23565n;
        C5809f c5809f = executorC5806c.f23581l;
        C5809f c5809f2 = executorC5806c.f23580k;
        if (iM10524d == 0) {
            AbstractRunnableC5811h abstractRunnableC5811h = (AbstractRunnableC5811h) c5809f2.m9006d();
            return abstractRunnableC5811h != null ? abstractRunnableC5811h : (AbstractRunnableC5811h) c5809f.m9006d();
        }
        AbstractRunnableC5811h abstractRunnableC5811h2 = (AbstractRunnableC5811h) c5809f.m9006d();
        return abstractRunnableC5811h2 != null ? abstractRunnableC5811h2 : (AbstractRunnableC5811h) c5809f2.m9006d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m10526f(int i9) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23565n.f23579j);
        sb2.append("-worker-");
        sb2.append(i9 == 0 ? "TERMINATED" : String.valueOf(i9));
        setName(sb2.toString());
        this.indexInArray = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m10527g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m10528h(EnumC5805b enumC5805b) {
        EnumC5805b enumC5805b2 = this.f23560i;
        boolean z9 = enumC5805b2 == EnumC5805b.f23566g;
        if (z9) {
            ExecutorC5806c.f23573o.addAndGet(this.f23565n, 4398046511104L);
        }
        if (enumC5805b2 != enumC5805b) {
            this.f23560i = enumC5805b;
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC5811h m10529i(int i9) {
        long j3;
        AbstractRunnableC5811h abstractRunnableC5811hM10538c;
        long j4;
        long j5;
        AbstractRunnableC5811h abstractRunnableC5811h;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC5806c.f23573o;
        ExecutorC5806c executorC5806c = this.f23565n;
        int i10 = (int) (atomicLongFieldUpdater.get(executorC5806c) & 2097151);
        AbstractRunnableC5811h abstractRunnableC5811h2 = null;
        if (i10 < 2) {
            return null;
        }
        int iM10524d = m10524d(i10);
        int i11 = 0;
        long jMin = Long.MAX_VALUE;
        while (i11 < i10) {
            iM10524d++;
            if (iM10524d > i10) {
                iM10524d = 1;
            }
            C5804a c5804a = (C5804a) executorC5806c.f23582m.m9012b(iM10524d);
            if (c5804a != null && c5804a != this) {
                C5815l c5815l = c5804a.f23558g;
                if (i9 != 3) {
                    c5815l.getClass();
                    int i12 = C5815l.f23600d.get(c5815l);
                    int i13 = C5815l.f23599c.get(c5815l);
                    boolean z9 = i9 == 1;
                    while (true) {
                        if (i12 == i13) {
                            j3 = 0;
                            break;
                        }
                        j3 = 0;
                        if (!z9 || C5815l.f23601e.get(c5815l) != 0) {
                            int i14 = i12 + 1;
                            abstractRunnableC5811hM10538c = c5815l.m10538c(i12, z9);
                            if (abstractRunnableC5811hM10538c != null) {
                                break;
                            }
                            i12 = i14;
                        } else {
                            break;
                        }
                    }
                } else {
                    abstractRunnableC5811hM10538c = c5815l.m10537b();
                    j3 = 0;
                }
                C1425u c1425u = this.f23559h;
                if (abstractRunnableC5811hM10538c != null) {
                    c1425u.f4738g = abstractRunnableC5811hM10538c;
                    abstractRunnableC5811h = abstractRunnableC5811h2;
                    j5 = -1;
                    j4 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C5815l.f23598b;
                        AbstractRunnableC5811h abstractRunnableC5811h3 = (AbstractRunnableC5811h) atomicReferenceFieldUpdater.get(c5815l);
                        if (abstractRunnableC5811h3 == null) {
                            j4 = -1;
                            break;
                        }
                        j4 = -1;
                        if (((abstractRunnableC5811h3.f23589h ? 1 : 2) & i9) == 0) {
                            break;
                        }
                        AbstractC5813j.f23596f.getClass();
                        C5815l c5815l2 = c5815l;
                        long jNanoTime = System.nanoTime() - abstractRunnableC5811h3.f23588g;
                        long j10 = AbstractC5813j.f23592b;
                        if (jNanoTime < j10) {
                            j5 = j10 - jNanoTime;
                            abstractRunnableC5811h = null;
                            break;
                        }
                        do {
                            abstractRunnableC5811h = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(c5815l2, abstractRunnableC5811h3, null)) {
                                c1425u.f4738g = abstractRunnableC5811h3;
                                j5 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(c5815l2) == abstractRunnableC5811h3);
                        c5815l = c5815l2;
                        abstractRunnableC5811h2 = null;
                    }
                }
                if (j5 == j4) {
                    AbstractRunnableC5811h abstractRunnableC5811h4 = (AbstractRunnableC5811h) c1425u.f4738g;
                    c1425u.f4738g = abstractRunnableC5811h;
                    return abstractRunnableC5811h4;
                }
                if (j5 > j3) {
                    jMin = Math.min(jMin, j5);
                }
            }
            i11++;
            abstractRunnableC5811h2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f23562k = jMin;
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j3;
        loop0: while (true) {
            boolean z9 = false;
            while (ExecutorC5806c.f23574p.get(this.f23565n) == 0) {
                EnumC5805b enumC5805b = this.f23560i;
                EnumC5805b enumC5805b2 = EnumC5805b.f23570k;
                if (enumC5805b == enumC5805b2) {
                    break loop0;
                }
                AbstractRunnableC5811h abstractRunnableC5811hM10521a = m10521a(this.f23564m);
                if (abstractRunnableC5811hM10521a != null) {
                    this.f23562k = 0L;
                    ExecutorC5806c executorC5806c = this.f23565n;
                    this.f23561j = 0L;
                    if (this.f23560i == EnumC5805b.f23568i) {
                        this.f23560i = EnumC5805b.f23567h;
                    }
                    if (abstractRunnableC5811hM10521a.f23589h) {
                        if (m10528h(EnumC5805b.f23567h) && !executorC5806c.m10535h() && !executorC5806c.m10534g(ExecutorC5806c.f23573o.get(executorC5806c))) {
                            executorC5806c.m10535h();
                        }
                        try {
                            abstractRunnableC5811hM10521a.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                        }
                        ExecutorC5806c.f23573o.addAndGet(executorC5806c, -2097152L);
                        if (this.f23560i != enumC5805b2) {
                            this.f23560i = EnumC5805b.f23569j;
                        }
                    } else {
                        try {
                            abstractRunnableC5811hM10521a.run();
                        } catch (Throwable th3) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th3);
                        }
                    }
                } else {
                    this.f23564m = false;
                    if (this.f23562k == 0) {
                        Object obj = this.nextParkedWorker;
                        C2463q c2463q = ExecutorC5806c.f23575q;
                        if (obj != c2463q) {
                            f23557o.set(this, -1);
                            while (this.nextParkedWorker != ExecutorC5806c.f23575q) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f23557o;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    ExecutorC5806c executorC5806c2 = this.f23565n;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC5806c.f23574p;
                                    if (atomicIntegerFieldUpdater2.get(executorC5806c2) != 0) {
                                        break;
                                    }
                                    EnumC5805b enumC5805b3 = this.f23560i;
                                    EnumC5805b enumC5805b4 = EnumC5805b.f23570k;
                                    if (enumC5805b3 == enumC5805b4) {
                                        break;
                                    }
                                    m10528h(EnumC5805b.f23568i);
                                    Thread.interrupted();
                                    if (this.f23561j == 0) {
                                        j3 = 2097151;
                                        this.f23561j = System.nanoTime() + this.f23565n.f23578i;
                                    } else {
                                        j3 = 2097151;
                                    }
                                    LockSupport.parkNanos(this.f23565n.f23578i);
                                    if (System.nanoTime() - this.f23561j >= 0) {
                                        this.f23561j = 0L;
                                        ExecutorC5806c executorC5806c3 = this.f23565n;
                                        synchronized (executorC5806c3.f23582m) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(executorC5806c3) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC5806c.f23573o;
                                                    if (((int) (atomicLongFieldUpdater.get(executorC5806c3) & j3)) > executorC5806c3.f23576g) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int i9 = this.indexInArray;
                                                            m10526f(0);
                                                            executorC5806c3.m10533e(this, i9, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC5806c3) & j3);
                                                            if (andDecrement != i9) {
                                                                Object objM9012b = executorC5806c3.f23582m.m9012b(andDecrement);
                                                                objM9012b.getClass();
                                                                C5804a c5804a = (C5804a) objM9012b;
                                                                executorC5806c3.f23582m.m9013c(i9, c5804a);
                                                                c5804a.m10526f(i9);
                                                                executorC5806c3.m10533e(c5804a, andDecrement, i9);
                                                            }
                                                            executorC5806c3.f23582m.m9013c(andDecrement, null);
                                                            this.f23560i = enumC5805b4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            ExecutorC5806c executorC5806c4 = this.f23565n;
                            if (this.nextParkedWorker == c2463q) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC5806c.f23572n;
                                while (true) {
                                    long j4 = atomicLongFieldUpdater2.get(executorC5806c4);
                                    int i10 = this.indexInArray;
                                    this.nextParkedWorker = executorC5806c4.f23582m.m9012b((int) (j4 & 2097151));
                                    ExecutorC5806c executorC5806c5 = executorC5806c4;
                                    if (ExecutorC5806c.f23572n.compareAndSet(executorC5806c5, j4, ((j4 + 2097152) & (-2097152)) | ((long) i10))) {
                                        break;
                                    } else {
                                        executorC5806c4 = executorC5806c5;
                                    }
                                }
                            }
                        }
                    } else if (z9) {
                        m10528h(EnumC5805b.f23568i);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f23562k);
                        this.f23562k = 0L;
                    } else {
                        z9 = true;
                    }
                }
            }
            break loop0;
        }
        m10528h(EnumC5805b.f23570k);
    }
}
