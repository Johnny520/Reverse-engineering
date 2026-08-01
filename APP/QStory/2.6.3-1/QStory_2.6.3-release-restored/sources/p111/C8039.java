package p111;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8039 extends Thread {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19583 = AtomicIntegerFieldUpdater.newUpdater(C8039.class, "workerCtl$volatile");
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f19584;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f19585;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ ExecutorC8038 f19586;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f19587;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f19588;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Ref$ObjectRef f19589;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public CoroutineScheduler$WorkerState f19590;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8044 f19591;

    public C8039(ExecutorC8038 executorC8038, int i) {
        this.f19586 = executorC8038;
        setDaemon(true);
        setContextClassLoader(ExecutorC8038.class.getClassLoader());
        this.f19591 = new C8044();
        this.f19589 = new Ref$ObjectRef();
        this.f19590 = CoroutineScheduler$WorkerState.DORMANT;
        this.nextParkedWorker = ExecutorC8038.f19572;
        int iNanoTime = (int) System.nanoTime();
        this.f19587 = iNanoTime == 0 ? 42 : iNanoTime;
        m13006(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (ExecutorC8038.f19573.get(this.f19586) != 1) {
                CoroutineScheduler$WorkerState coroutineScheduler$WorkerState = this.f19590;
                CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = CoroutineScheduler$WorkerState.TERMINATED;
                if (coroutineScheduler$WorkerState == coroutineScheduler$WorkerState2) {
                    break loop0;
                }
                AbstractRunnableC8041 abstractRunnableC8041M13011 = m13011(this.f19588);
                if (abstractRunnableC8041M13011 != null) {
                    this.f19584 = 0L;
                    ExecutorC8038 executorC8038 = this.f19586;
                    this.f19585 = 0L;
                    if (this.f19590 == CoroutineScheduler$WorkerState.PARKING) {
                        this.f19590 = CoroutineScheduler$WorkerState.BLOCKING;
                    }
                    if (abstractRunnableC8041M13011.f19593) {
                        if (m13012(CoroutineScheduler$WorkerState.BLOCKING) && !executorC8038.m13005() && !executorC8038.m13003(ExecutorC8038.f19575.get(executorC8038))) {
                            executorC8038.m13005();
                        }
                        try {
                            abstractRunnableC8041M13011.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        ExecutorC8038.f19575.addAndGet(executorC8038, -2097152L);
                        if (this.f19590 != coroutineScheduler$WorkerState2) {
                            this.f19590 = CoroutineScheduler$WorkerState.DORMANT;
                        }
                    } else {
                        try {
                            abstractRunnableC8041M13011.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                    }
                } else {
                    this.f19588 = false;
                    if (this.f19584 == 0) {
                        Object obj = this.nextParkedWorker;
                        C5317 c5317 = ExecutorC8038.f19572;
                        if (obj != c5317) {
                            f19583.set(this, -1);
                            while (this.nextParkedWorker != ExecutorC8038.f19572) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f19583;
                                if (atomicIntegerFieldUpdater.get(this) == -1) {
                                    ExecutorC8038 executorC80382 = this.f19586;
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC8038.f19573;
                                    if (atomicIntegerFieldUpdater2.get(executorC80382) == 1) {
                                        break;
                                    }
                                    CoroutineScheduler$WorkerState coroutineScheduler$WorkerState3 = this.f19590;
                                    CoroutineScheduler$WorkerState coroutineScheduler$WorkerState4 = CoroutineScheduler$WorkerState.TERMINATED;
                                    if (coroutineScheduler$WorkerState3 == coroutineScheduler$WorkerState4) {
                                        break;
                                    }
                                    m13012(CoroutineScheduler$WorkerState.PARKING);
                                    Thread.interrupted();
                                    if (this.f19585 == 0) {
                                        j = 2097151;
                                        this.f19585 = System.nanoTime() + this.f19586.f19581;
                                    } else {
                                        j = 2097151;
                                    }
                                    LockSupport.parkNanos(this.f19586.f19581);
                                    if (System.nanoTime() - this.f19585 >= 0) {
                                        this.f19585 = 0L;
                                        ExecutorC8038 executorC80383 = this.f19586;
                                        synchronized (executorC80383.f19579) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater2.get(executorC80383) == 1)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC8038.f19575;
                                                    if (((int) (atomicLongFieldUpdater.get(executorC80383) & j)) > executorC80383.f19582 && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        m13006(0);
                                                        executorC80383.m13004(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC80383) & j);
                                                        if (andDecrement != i) {
                                                            Object objM10940 = executorC80383.f19579.m10940(andDecrement);
                                                            objM10940.getClass();
                                                            C8039 c8039 = (C8039) objM10940;
                                                            executorC80383.f19579.m10939(i, c8039);
                                                            c8039.m13006(i);
                                                            executorC80383.m13004(c8039, andDecrement, i);
                                                        }
                                                        executorC80383.f19579.m10939(andDecrement, null);
                                                        this.f19590 = coroutineScheduler$WorkerState4;
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            ExecutorC8038 executorC80384 = this.f19586;
                            if (this.nextParkedWorker == c5317) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC8038.f19574;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(executorC80384);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = executorC80384.f19579.m10940((int) (j2 & 2097151));
                                    ExecutorC8038 executorC80385 = executorC80384;
                                    if (ExecutorC8038.f19574.compareAndSet(executorC80385, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        executorC80384 = executorC80385;
                                    }
                                }
                            }
                        }
                    } else if (z) {
                        m13012(CoroutineScheduler$WorkerState.PARKING);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f19584);
                        this.f19584 = 0L;
                    } else {
                        z = true;
                    }
                }
            }
            break loop0;
        }
        m13012(CoroutineScheduler$WorkerState.TERMINATED);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13006(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19586.f19577);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractRunnableC8041 m13007() {
        int iM13008 = m13008(2);
        ExecutorC8038 executorC8038 = this.f19586;
        C8035 c8035 = executorC8038.f19578;
        C8035 c80352 = executorC8038.f19576;
        if (iM13008 == 0) {
            AbstractRunnableC8041 abstractRunnableC8041 = (AbstractRunnableC8041) c80352.m10966();
            return abstractRunnableC8041 != null ? abstractRunnableC8041 : (AbstractRunnableC8041) c8035.m10966();
        }
        AbstractRunnableC8041 abstractRunnableC80412 = (AbstractRunnableC8041) c8035.m10966();
        return abstractRunnableC80412 != null ? abstractRunnableC80412 : (AbstractRunnableC8041) c80352.m10966();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m13008(int i) {
        int i2 = this.f19587;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f19587 = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m13009() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m13010() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractRunnableC8041 m13011(boolean z) {
        AbstractRunnableC8041 abstractRunnableC8041M13007;
        AbstractRunnableC8041 abstractRunnableC8041M130072;
        long j;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState = this.f19590;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = CoroutineScheduler$WorkerState.CPU_ACQUIRED;
        ExecutorC8038 executorC8038 = this.f19586;
        C8044 c8044 = this.f19591;
        if (coroutineScheduler$WorkerState != coroutineScheduler$WorkerState2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC8038.f19575;
            do {
                j = atomicLongFieldUpdater.get(executorC8038);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    AbstractRunnableC8041 abstractRunnableC8041M13022 = c8044.m13022();
                    return (abstractRunnableC8041M13022 == null && (abstractRunnableC8041M13022 = (AbstractRunnableC8041) executorC8038.f19578.m10966()) == null) ? m13014(1) : abstractRunnableC8041M13022;
                }
            } while (!ExecutorC8038.f19575.compareAndSet(executorC8038, j, j - 4398046511104L));
            this.f19590 = CoroutineScheduler$WorkerState.CPU_ACQUIRED;
        }
        if (z) {
            boolean z2 = m13008(executorC8038.f19582 * 2) == 0;
            if (z2 && (abstractRunnableC8041M130072 = m13007()) != null) {
                return abstractRunnableC8041M130072;
            }
            AbstractRunnableC8041 abstractRunnableC8041M13016 = c8044.m13016();
            if (abstractRunnableC8041M13016 != null) {
                return abstractRunnableC8041M13016;
            }
            if (!z2 && (abstractRunnableC8041M13007 = m13007()) != null) {
                return abstractRunnableC8041M13007;
            }
        } else {
            AbstractRunnableC8041 abstractRunnableC8041M130073 = m13007();
            if (abstractRunnableC8041M130073 != null) {
                return abstractRunnableC8041M130073;
            }
        }
        return m13014(3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m13012(CoroutineScheduler$WorkerState coroutineScheduler$WorkerState) {
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = this.f19590;
        boolean z = coroutineScheduler$WorkerState2 == CoroutineScheduler$WorkerState.CPU_ACQUIRED;
        if (z) {
            ExecutorC8038.f19575.addAndGet(this.f19586, 4398046511104L);
        }
        if (coroutineScheduler$WorkerState2 != coroutineScheduler$WorkerState) {
            this.f19590 = coroutineScheduler$WorkerState;
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13013(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractRunnableC8041 m13014(int i) {
        T tM13021;
        long jM13023;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC8038.f19575;
        ExecutorC8038 executorC8038 = this.f19586;
        int i2 = (int) (atomicLongFieldUpdater.get(executorC8038) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iM13008 = m13008(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iM13008++;
            if (iM13008 > i2) {
                iM13008 = 1;
            }
            C8039 c8039 = (C8039) executorC8038.f19579.m10940(iM13008);
            if (c8039 != null && c8039 != this) {
                C8044 c8044 = c8039.f19591;
                c8044.getClass();
                if (i == 3) {
                    tM13021 = c8044.m13015();
                } else {
                    boolean z = i == 1;
                    int i4 = C8044.f19599.get(c8044);
                    int i5 = C8044.f19600.get(c8044);
                    while (i4 != i5 && (!z || C8044.f19598.get(c8044) != 0)) {
                        int i6 = i4 + 1;
                        tM13021 = c8044.m13021(i4, z);
                        if (tM13021 != 0) {
                            break;
                        }
                        i4 = i6;
                    }
                    tM13021 = 0;
                }
                Ref$ObjectRef ref$ObjectRef = this.f19589;
                if (tM13021 != 0) {
                    ref$ObjectRef.element = tM13021;
                    jM13023 = -1;
                } else {
                    jM13023 = c8044.m13023(ref$ObjectRef, i);
                }
                if (jM13023 == -1) {
                    AbstractRunnableC8041 abstractRunnableC8041 = (AbstractRunnableC8041) ref$ObjectRef.element;
                    ref$ObjectRef.element = null;
                    return abstractRunnableC8041;
                }
                if (jM13023 > 0) {
                    jMin = Math.min(jMin, jM13023);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f19584 = jMin;
        return null;
    }
}
