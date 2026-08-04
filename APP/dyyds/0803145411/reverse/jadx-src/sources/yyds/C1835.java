package yyds;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛸᛸᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1835 extends Thread {

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9195 = AtomicIntegerFieldUpdater.newUpdater(C1835.class, "workerCtl$volatile");

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final /* synthetic */ long f9196 = AbstractC2112.f10448.objectFieldOffset(C1835.class.getDeclaredField("workerCtl$volatile"));
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f9197;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean f9198;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f9199;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public long f9200;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ExecutorC0400 f9201;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0994 f9202;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public long f9203;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0172 f9204;

    public C1835(ExecutorC0400 executorC0400, int i) {
        this.f9201 = executorC0400;
        setDaemon(true);
        setContextClassLoader(ExecutorC0400.class.getClassLoader());
        this.f9202 = new C0994();
        this.f9204 = new C0172();
        this.f9199 = 4;
        this.nextParkedWorker = ExecutorC0400.f2108;
        int iNanoTime = (int) System.nanoTime();
        this.f9197 = iNanoTime == 0 ? 42 : iNanoTime;
        m3602(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        int i;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                int i2 = 5;
                if (ExecutorC0400.f2110.get(this.f9201) != 0 || this.f9199 == 5) {
                    break loop0;
                }
                AbstractRunnableC2764 abstractRunnableC2764M3598 = m3598(this.f9198);
                int i3 = 3;
                if (abstractRunnableC2764M3598 != null) {
                    this.f9200 = 0L;
                    ExecutorC0400 executorC0400 = this.f9201;
                    this.f9203 = 0L;
                    if (this.f9199 == 3) {
                        this.f9199 = 2;
                    }
                    if (abstractRunnableC2764M3598.f13497) {
                        if (m3595(2) && !executorC0400.m1158() && !executorC0400.m1160(ExecutorC0400.f2109.get(executorC0400))) {
                            executorC0400.m1158();
                        }
                        try {
                            abstractRunnableC2764M3598.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        ExecutorC0400.f2109.addAndGet(executorC0400, -2097152L);
                        if (this.f9199 != 5) {
                            this.f9199 = 4;
                        }
                    } else {
                        try {
                            abstractRunnableC2764M3598.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                    }
                } else {
                    this.f9198 = false;
                    if (this.f9200 == 0) {
                        Object obj = this.nextParkedWorker;
                        C0415 c0415 = ExecutorC0400.f2108;
                        if (obj != c0415) {
                            AbstractC2112.f10448.putIntVolatile(this, f9196, -1);
                            while (this.nextParkedWorker != ExecutorC0400.f2108) {
                                Unsafe unsafe = AbstractC2112.f10448;
                                long j2 = f9196;
                                if (unsafe.getIntVolatile(this, j2) == -1) {
                                    ExecutorC0400 executorC04002 = this.f9201;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ExecutorC0400.f2110;
                                    if (atomicIntegerFieldUpdater.get(executorC04002) == 0 && this.f9199 != i2) {
                                        m3595(i3);
                                        Thread.interrupted();
                                        if (this.f9203 == 0) {
                                            this.f9203 = System.nanoTime() + this.f9201.f2114;
                                        }
                                        LockSupport.parkNanos(this.f9201.f2114);
                                        if (System.nanoTime() - this.f9203 >= 0) {
                                            this.f9203 = 0L;
                                            ExecutorC0400 executorC04003 = this.f9201;
                                            synchronized (executorC04003.f2113) {
                                                try {
                                                    if (!(atomicIntegerFieldUpdater.get(executorC04003) != 0)) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0400.f2109;
                                                        if (((int) (atomicLongFieldUpdater.get(executorC04003) & 2097151)) > executorC04003.f2116) {
                                                            if (unsafe.compareAndSwapInt(this, j2, -1, 1)) {
                                                                int i4 = this.indexInArray;
                                                                m3602(0);
                                                                executorC04003.m1159(this, i4, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC04003) & 2097151);
                                                                if (andDecrement != i4) {
                                                                    C1835 c1835 = (C1835) executorC04003.f2113.m1887(andDecrement);
                                                                    executorC04003.f2113.m1888(i4, c1835);
                                                                    c1835.m3602(i4);
                                                                    executorC04003.m1159(c1835, andDecrement, i4);
                                                                }
                                                                executorC04003.f2113.m1888(andDecrement, null);
                                                                this.f9199 = 5;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    throw th3;
                                                }
                                            }
                                        }
                                        i2 = 5;
                                        i3 = 3;
                                    }
                                }
                            }
                        } else {
                            ExecutorC0400 executorC04004 = this.f9201;
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC0400.f2111;
                            if (this.nextParkedWorker == c0415) {
                                do {
                                    j = atomicLongFieldUpdater2.get(executorC04004);
                                    i = this.indexInArray;
                                    this.nextParkedWorker = executorC04004.f2113.m1887((int) (j & 2097151));
                                } while (!atomicLongFieldUpdater2.compareAndSet(executorC04004, j, ((2097152 + j) & (-2097152)) | ((long) i)));
                            }
                        }
                    } else {
                        if (z) {
                            m3595(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f9200);
                            this.f9200 = 0L;
                            break;
                        }
                        z = true;
                    }
                }
            }
        }
        m3595(5);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean m3595(int i) {
        int i2 = this.f9199;
        boolean z = i2 == 1;
        if (z) {
            ExecutorC0400.f2109.addAndGet(this.f9201, 4398046511104L);
        }
        if (i2 != i) {
            this.f9199 = i;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
    
        r1 = -2;
     */
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC2764 m3596(int i) {
        int i2;
        long j;
        AbstractRunnableC2764 abstractRunnableC2764M2177;
        long j2;
        long j3;
        Unsafe unsafe;
        int i3 = i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0400.f2109;
        ExecutorC0400 executorC0400 = this.f9201;
        int i4 = (int) (atomicLongFieldUpdater.get(executorC0400) & 2097151);
        AbstractRunnableC2764 abstractRunnableC2764 = null;
        if (i4 < 2) {
            return null;
        }
        int iM3603 = m3603(i4);
        int i5 = 0;
        long jMin = Long.MAX_VALUE;
        while (i5 < i4) {
            iM3603++;
            if (iM3603 > i4) {
                iM3603 = 1;
            }
            C1835 c1835 = (C1835) executorC0400.f2113.m1887(iM3603);
            if (c1835 == null || c1835 == this) {
                i2 = i4;
            } else {
                C0994 c0994 = c1835.f9202;
                if (i3 != 3) {
                    c0994.getClass();
                    Unsafe unsafe2 = AbstractC2112.f10448;
                    int intVolatile = unsafe2.getIntVolatile(c0994, C0994.f4510);
                    j = 0;
                    int intVolatile2 = unsafe2.getIntVolatile(c0994, C0994.f4512);
                    boolean z = i3 == 1;
                    while (true) {
                        if (intVolatile == intVolatile2) {
                            i2 = i4;
                            break;
                        }
                        if (z) {
                            i2 = i4;
                            if (AbstractC2112.f10448.getIntVolatile(c0994, C0994.f4515) == 0) {
                                break;
                            }
                        } else {
                            i2 = i4;
                        }
                        int i6 = intVolatile + 1;
                        AbstractRunnableC2764 abstractRunnableC2764M2178 = c0994.m2178(intVolatile, z);
                        if (abstractRunnableC2764M2178 != null) {
                            abstractRunnableC2764M2177 = abstractRunnableC2764M2178;
                            break;
                        }
                        intVolatile = i6;
                        i4 = i2;
                    }
                } else {
                    abstractRunnableC2764M2177 = c0994.m2177();
                    i2 = i4;
                    j = 0;
                }
                C0172 c0172 = this.f9204;
                if (abstractRunnableC2764M2177 == null) {
                    j2 = -1;
                    long j4 = C0994.f4514;
                    while (true) {
                        AbstractRunnableC2764 abstractRunnableC27642 = (AbstractRunnableC2764) AbstractC2112.f10448.getObjectVolatile(c0994, j4);
                        if (abstractRunnableC27642 == null) {
                            break;
                        }
                        if (((abstractRunnableC27642.f13497 ? 1 : 2) & i) == 0) {
                            break;
                        }
                        AbstractC2546.f12552.getClass();
                        C0994 c09942 = c0994;
                        long jNanoTime = System.nanoTime() - abstractRunnableC27642.f13496;
                        long j5 = AbstractC2546.f12550;
                        if (jNanoTime < j5) {
                            j3 = j5 - jNanoTime;
                            break;
                        }
                        do {
                            unsafe = AbstractC2112.f10448;
                            if (unsafe.compareAndSwapObject(c09942, C0994.f4514, abstractRunnableC27642, (Object) null)) {
                                c0172.f997 = abstractRunnableC27642;
                                j3 = -1;
                                break;
                            }
                        } while (unsafe.getObjectVolatile(c09942, j4) == abstractRunnableC27642);
                        c0994 = c09942;
                    }
                } else {
                    c0172.f997 = abstractRunnableC2764M2177;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    AbstractRunnableC2764 abstractRunnableC27643 = (AbstractRunnableC2764) c0172.f997;
                    c0172.f997 = null;
                    return abstractRunnableC27643;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i5++;
            i3 = i;
            i4 = i2;
            abstractRunnableC2764 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f9200 = jMin;
        return null;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final AbstractRunnableC2764 m3597() {
        int iM3603 = m3603(2);
        ExecutorC0400 executorC0400 = this.f9201;
        C1668 c1668 = executorC0400.f2112;
        C1668 c16682 = executorC0400.f2115;
        if (iM3603 == 0) {
            AbstractRunnableC2764 abstractRunnableC2764 = (AbstractRunnableC2764) c16682.m1340();
            return abstractRunnableC2764 != null ? abstractRunnableC2764 : (AbstractRunnableC2764) c1668.m1340();
        }
        AbstractRunnableC2764 abstractRunnableC27642 = (AbstractRunnableC2764) c1668.m1340();
        return abstractRunnableC27642 != null ? abstractRunnableC27642 : (AbstractRunnableC2764) c16682.m1340();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        r1 = r4.getIntVolatile(r11, yyds.C0994.f4510);
        r2 = r4.getIntVolatile(r11, yyds.C0994.f4512);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r1 == r2) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (yyds.AbstractC2112.f10448.getIntVolatile(r11, yyds.C0994.f4515) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        r2 = r2 - 1;
        r4 = r11.m2178(r2, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r4 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        r8 = r4;
     */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC2764 m3598(boolean z) {
        AbstractRunnableC2764 abstractRunnableC2764M3597;
        AbstractRunnableC2764 abstractRunnableC2764M35972;
        long j;
        Unsafe unsafe;
        int i = this.f9199;
        ExecutorC0400 executorC0400 = this.f9201;
        AbstractRunnableC2764 abstractRunnableC2764 = null;
        C0994 c0994 = this.f9202;
        if (i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0400.f2109;
            do {
                j = atomicLongFieldUpdater.get(executorC0400);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    c0994.getClass();
                    long j2 = C0994.f4514;
                    loop1: while (true) {
                        Unsafe unsafe2 = AbstractC2112.f10448;
                        AbstractRunnableC2764 abstractRunnableC27642 = (AbstractRunnableC2764) unsafe2.getObjectVolatile(c0994, j2);
                        if (abstractRunnableC27642 == null || !abstractRunnableC27642.f13497) {
                            break;
                        }
                        do {
                            unsafe = AbstractC2112.f10448;
                            if (unsafe.compareAndSwapObject(c0994, C0994.f4514, abstractRunnableC27642, (Object) null)) {
                                abstractRunnableC2764 = abstractRunnableC27642;
                                break loop1;
                            }
                        } while (unsafe.getObjectVolatile(c0994, j2) == abstractRunnableC27642);
                    }
                    if (abstractRunnableC2764 != null) {
                        return abstractRunnableC2764;
                    }
                    AbstractRunnableC2764 abstractRunnableC27643 = (AbstractRunnableC2764) executorC0400.f2112.m1340();
                    return abstractRunnableC27643 == null ? m3596(1) : abstractRunnableC27643;
                }
            } while (!ExecutorC0400.f2109.compareAndSet(executorC0400, j, j - 4398046511104L));
            this.f9199 = 1;
        }
        if (z) {
            boolean z2 = m3603(executorC0400.f2116 * 2) == 0;
            if (z2 && (abstractRunnableC2764M35972 = m3597()) != null) {
                return abstractRunnableC2764M35972;
            }
            c0994.getClass();
            AbstractRunnableC2764 abstractRunnableC2764M2177 = (AbstractRunnableC2764) AbstractC2112.f10448.getAndSetObject(c0994, C0994.f4514, (Object) null);
            if (abstractRunnableC2764M2177 == null) {
                abstractRunnableC2764M2177 = c0994.m2177();
            }
            if (abstractRunnableC2764M2177 != null) {
                return abstractRunnableC2764M2177;
            }
            if (!z2 && (abstractRunnableC2764M3597 = m3597()) != null) {
                return abstractRunnableC2764M3597;
            }
        } else {
            AbstractRunnableC2764 abstractRunnableC2764M35973 = m3597();
            if (abstractRunnableC2764M35973 != null) {
                return abstractRunnableC2764M35973;
            }
        }
        return m3596(3);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int m3599() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m3600(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Object m3601() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m3602(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9201.f2117);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int m3603(int i) {
        int i2 = this.f9197;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f9197 = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }
}
