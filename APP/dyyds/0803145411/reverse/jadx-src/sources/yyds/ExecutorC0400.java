package yyds;

import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: yyds.ᛲᛷᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0400 implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final C1668 f2112;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final C0817 f2113;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final long f2114;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C1668 f2115;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int f2116;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final String f2117;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f2118;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f2111 = AtomicLongFieldUpdater.newUpdater(ExecutorC0400.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f2109 = AtomicLongFieldUpdater.newUpdater(ExecutorC0400.class, "controlState$volatile");

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2110 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0400.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static final C0415 f2108 = new C0415("NOT_IN_STACK", 1);

    public ExecutorC0400(long j, String str, int i, int i2) {
        this.f2116 = i;
        this.f2118 = i2;
        this.f2114 = j;
        this.f2117 = str;
        if (i < 1) {
            C1693.m3439("Core pool size ", i, " should be at least 1");
            throw null;
        }
        if (i2 < i) {
            C0188.m806(AbstractC0897.m1987(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            C1693.m3439("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150");
            throw null;
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f2115 = new C1668();
        this.f2112 = new C1668();
        this.f2113 = new C0817((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws InterruptedException {
        int i;
        AbstractRunnableC2764 abstractRunnableC2764M3598;
        if (f2110.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C1835 c1835 = threadCurrentThread instanceof C1835 ? (C1835) threadCurrentThread : null;
            if (c1835 == null || c1835.f9201 != this) {
                c1835 = null;
            }
            synchronized (this.f2113) {
                i = (int) (f2109.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    C1835 c18352 = (C1835) this.f2113.m1887(i2);
                    if (c18352 != c1835) {
                        while (c18352.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c18352);
                            c18352.join(10000L);
                        }
                        C0994 c0994 = c18352.f9202;
                        C1668 c1668 = this.f2112;
                        c0994.getClass();
                        AbstractRunnableC2764 abstractRunnableC2764 = (AbstractRunnableC2764) AbstractC2112.f10448.getAndSetObject(c0994, C0994.f4514, (Object) null);
                        if (abstractRunnableC2764 != null) {
                            c1668.m1337(abstractRunnableC2764);
                        }
                        while (true) {
                            AbstractRunnableC2764 abstractRunnableC2764M2177 = c0994.m2177();
                            if (abstractRunnableC2764M2177 == null) {
                                break;
                            } else {
                                c1668.m1337(abstractRunnableC2764M2177);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f2112.m1338();
            this.f2115.m1338();
            while (true) {
                if (c1835 == null) {
                    abstractRunnableC2764M3598 = (AbstractRunnableC2764) this.f2115.m1340();
                    if (abstractRunnableC2764M3598 == null && (abstractRunnableC2764M3598 = (AbstractRunnableC2764) this.f2112.m1340()) == null) {
                        break;
                    }
                } else {
                    abstractRunnableC2764M3598 = c1835.m3598(true);
                    if (abstractRunnableC2764M3598 == null) {
                    }
                }
                try {
                    abstractRunnableC2764M3598.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c1835 != null) {
                c1835.m3595(5);
            }
            f2111.set(this, 0L);
            f2109.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m1161(runnable, false);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C0817 c0817 = this.f2113;
        int iM1886 = c0817.m1886();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM1886; i6++) {
            C1835 c1835 = (C1835) c0817.m1887(i6);
            if (c1835 != null) {
                C0994 c0994 = c1835.f9202;
                c0994.getClass();
                Object objectVolatile = AbstractC2112.f10448.getObjectVolatile(c0994, C0994.f4514);
                int iM2176 = c0994.m2176();
                if (objectVolatile != null) {
                    iM2176++;
                }
                int iM4012 = AbstractC2104.m4012(c1835.f9199);
                if (iM4012 == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM2176);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iM4012 == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM2176);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iM4012 == 2) {
                    i3++;
                } else if (iM4012 == 3) {
                    i4++;
                    if (iM2176 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM2176);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iM4012 != 4) {
                        C0188.m801();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = f2109.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f2117);
        sb4.append('@');
        sb4.append(AbstractC2408.m4457(this));
        sb4.append("[Pool Size {core = ");
        int i7 = this.f2116;
        sb4.append(i7);
        sb4.append(", max = ");
        sb4.append(this.f2118);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f2115.m1339());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f2112.m1339());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i7 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int m1157() {
        synchronized (this.f2113) {
            try {
                if (f2110.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f2109;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f2116) {
                    return 0;
                }
                if (i >= this.f2118) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f2113.m1887(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C1835 c1835 = new C1835(this, i3);
                this.f2113.m1888(i3, c1835);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c1835.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final boolean m1158() {
        ExecutorC0400 executorC0400;
        C0415 c0415;
        int iM3599;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2111;
            long j = atomicLongFieldUpdater.get(this);
            C1835 c1835 = (C1835) this.f2113.m1887((int) (2097151 & j));
            if (c1835 == null) {
                c1835 = null;
                executorC0400 = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM3601 = c1835.m3601();
                while (true) {
                    c0415 = f2108;
                    if (objM3601 == c0415) {
                        iM3599 = -1;
                        break;
                    }
                    if (objM3601 == null) {
                        iM3599 = 0;
                        break;
                    }
                    C1835 c18352 = (C1835) objM3601;
                    iM3599 = c18352.m3599();
                    if (iM3599 != 0) {
                        break;
                    }
                    objM3601 = c18352.m3601();
                    atomicLongFieldUpdater = atomicLongFieldUpdater;
                    this = this;
                }
                if (iM3599 >= 0) {
                    ExecutorC0400 executorC04002 = this;
                    boolean zCompareAndSet = atomicLongFieldUpdater.compareAndSet(executorC04002, j, j2 | ((long) iM3599));
                    executorC0400 = executorC04002;
                    if (zCompareAndSet) {
                        c1835.m3600(c0415);
                    }
                    this = executorC0400;
                } else {
                    continue;
                }
            }
            if (c1835 == null) {
                return false;
            }
            if (C1835.f9195.compareAndSet(c1835, -1, 0)) {
                LockSupport.unpark(c1835);
                return true;
            }
            this = executorC0400;
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m1159(C1835 c1835, int i, int i2) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2111;
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM3601 = c1835.m3601();
                    while (true) {
                        if (objM3601 == f2108) {
                            i3 = -1;
                            break;
                        }
                        if (objM3601 == null) {
                            i3 = 0;
                            break;
                        }
                        C1835 c18352 = (C1835) objM3601;
                        int iM3599 = c18352.m3599();
                        if (iM3599 != 0) {
                            i3 = iM3599;
                            break;
                        }
                        objM3601 = c18352.m3601();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                long j3 = j2 | ((long) i3);
                ExecutorC0400 executorC0400 = this;
                if (atomicLongFieldUpdater.compareAndSet(executorC0400, j, j3)) {
                    return;
                } else {
                    this = executorC0400;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final boolean m1160(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f2116;
        if (i < i2) {
            int iM1157 = m1157();
            if (iM1157 == 1 && i2 > 1) {
                m1157();
            }
            if (iM1157 > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m1161(Runnable runnable, boolean z) {
        AbstractRunnableC2764 c0622;
        int i;
        AbstractC2546.f12552.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC2764) {
            c0622 = (AbstractRunnableC2764) runnable;
            c0622.f13496 = jNanoTime;
            c0622.f13497 = z;
        } else {
            c0622 = new C0622(runnable, jNanoTime, z);
        }
        boolean z2 = c0622.f13497;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2109;
        long jAddAndGet = z2 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C1835 c1835 = threadCurrentThread instanceof C1835 ? (C1835) threadCurrentThread : null;
        if (c1835 == null || c1835.f9201 != this) {
            c1835 = null;
        }
        if (c1835 != null && (i = c1835.f9199) != 5 && (c0622.f13497 || i != 2)) {
            c1835.f9198 = true;
            C0994 c0994 = c1835.f9202;
            c0994.getClass();
            c0622 = (AbstractRunnableC2764) AbstractC2112.f10448.getAndSetObject(c0994, C0994.f4514, c0622);
            if (c0622 == null) {
                c0622 = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = c0994.f4516;
                if (c0994.m2176() != 127) {
                    if (c0622.f13497) {
                        C0994.f4513.incrementAndGet(c0994);
                    }
                    int intVolatile = AbstractC2112.f10448.getIntVolatile(c0994, C0994.f4512) & 127;
                    while (atomicReferenceArray.get(intVolatile) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(intVolatile, c0622);
                    C0994.f4511.incrementAndGet(c0994);
                    c0622 = null;
                }
            }
        }
        if (c0622 != null) {
            if (!(c0622.f13497 ? this.f2112.m1337(c0622) : this.f2115.m1337(c0622))) {
                throw new RejectedExecutionException(AbstractC2104.m4015(new StringBuilder(), this.f2117, " was terminated"));
            }
        }
        if (z2) {
            if (m1158() || m1160(jAddAndGet)) {
                return;
            }
            m1158();
            return;
        }
        if (m1158() || m1160(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m1158();
    }
}
