package p095;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7210 extends Thread {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19238 = AtomicIntegerFieldUpdater.newUpdater(C7210.class, "workerCtl$volatile");
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f19239;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f19240;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ ExecutorC7209 f19241;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f19242;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f19243;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Ref$ObjectRef f19244;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public CoroutineScheduler$WorkerState f19245;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7215 f19246;

    public C7210(ExecutorC7209 executorC7209, int i) {
        this.f19241 = executorC7209;
        setDaemon(true);
        setContextClassLoader(ExecutorC7209.class.getClassLoader());
        this.f19246 = new C7215();
        this.f19244 = new Ref$ObjectRef();
        this.f19245 = CoroutineScheduler$WorkerState.DORMANT;
        this.nextParkedWorker = ExecutorC7209.f19227;
        int iNanoTime = (int) System.nanoTime();
        this.f19242 = iNanoTime == 0 ? 42 : iNanoTime;
        m12447(i);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p095.C7210.run():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m12447(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19241.f19232);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractRunnableC7212 m12448() {
        int iM12449 = m12449(2);
        ExecutorC7209 executorC7209 = this.f19241;
        C7206 c7206 = executorC7209.f19233;
        C7206 c72062 = executorC7209.f19231;
        if (iM12449 == 0) {
            AbstractRunnableC7212 abstractRunnableC7212 = (AbstractRunnableC7212) c72062.m10407();
            return abstractRunnableC7212 != null ? abstractRunnableC7212 : (AbstractRunnableC7212) c7206.m10407();
        }
        AbstractRunnableC7212 abstractRunnableC72122 = (AbstractRunnableC7212) c7206.m10407();
        return abstractRunnableC72122 != null ? abstractRunnableC72122 : (AbstractRunnableC7212) c72062.m10407();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m12449(int i) {
        int i2 = this.f19242;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f19242 = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m12450() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m12451() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractRunnableC7212 m12452(boolean z) {
        AbstractRunnableC7212 abstractRunnableC7212M12448;
        AbstractRunnableC7212 abstractRunnableC7212M124482;
        long j;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState = this.f19245;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = CoroutineScheduler$WorkerState.CPU_ACQUIRED;
        ExecutorC7209 executorC7209 = this.f19241;
        C7215 c7215 = this.f19246;
        if (coroutineScheduler$WorkerState != coroutineScheduler$WorkerState2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC7209.f19230;
            do {
                j = atomicLongFieldUpdater.get(executorC7209);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    AbstractRunnableC7212 abstractRunnableC7212M12463 = c7215.m12463();
                    return (abstractRunnableC7212M12463 == null && (abstractRunnableC7212M12463 = (AbstractRunnableC7212) executorC7209.f19233.m10407()) == null) ? m12455(1) : abstractRunnableC7212M12463;
                }
            } while (!ExecutorC7209.f19230.compareAndSet(executorC7209, j, j - 4398046511104L));
            this.f19245 = CoroutineScheduler$WorkerState.CPU_ACQUIRED;
        }
        if (z) {
            boolean z2 = m12449(executorC7209.f19237 * 2) == 0;
            if (z2 && (abstractRunnableC7212M124482 = m12448()) != null) {
                return abstractRunnableC7212M124482;
            }
            AbstractRunnableC7212 abstractRunnableC7212M12457 = c7215.m12457();
            if (abstractRunnableC7212M12457 != null) {
                return abstractRunnableC7212M12457;
            }
            if (!z2 && (abstractRunnableC7212M12448 = m12448()) != null) {
                return abstractRunnableC7212M12448;
            }
        } else {
            AbstractRunnableC7212 abstractRunnableC7212M124483 = m12448();
            if (abstractRunnableC7212M124483 != null) {
                return abstractRunnableC7212M124483;
            }
        }
        return m12455(3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m12453(CoroutineScheduler$WorkerState coroutineScheduler$WorkerState) {
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = this.f19245;
        boolean z = coroutineScheduler$WorkerState2 == CoroutineScheduler$WorkerState.CPU_ACQUIRED;
        if (z) {
            ExecutorC7209.f19230.addAndGet(this.f19241, 4398046511104L);
        }
        if (coroutineScheduler$WorkerState2 != coroutineScheduler$WorkerState) {
            this.f19245 = coroutineScheduler$WorkerState;
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m12454(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractRunnableC7212 m12455(int i) {
        T tM12462;
        long jM12464;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC7209.f19230;
        ExecutorC7209 executorC7209 = this.f19241;
        int i2 = (int) (atomicLongFieldUpdater.get(executorC7209) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iM12449 = m12449(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iM12449++;
            if (iM12449 > i2) {
                iM12449 = 1;
            }
            C7210 c7210 = (C7210) executorC7209.f19234.m10381(iM12449);
            if (c7210 != null && c7210 != this) {
                C7215 c7215 = c7210.f19246;
                c7215.getClass();
                if (i == 3) {
                    tM12462 = c7215.m12456();
                } else {
                    boolean z = i == 1;
                    int i4 = C7215.f19254.get(c7215);
                    int i5 = C7215.f19255.get(c7215);
                    while (i4 != i5 && (!z || C7215.f19253.get(c7215) != 0)) {
                        int i6 = i4 + 1;
                        tM12462 = c7215.m12462(i4, z);
                        if (tM12462 != 0) {
                            break;
                        }
                        i4 = i6;
                    }
                    tM12462 = 0;
                }
                Ref$ObjectRef ref$ObjectRef = this.f19244;
                if (tM12462 != 0) {
                    ref$ObjectRef.element = tM12462;
                    jM12464 = -1;
                } else {
                    jM12464 = c7215.m12464(ref$ObjectRef, i);
                }
                if (jM12464 == -1) {
                    AbstractRunnableC7212 abstractRunnableC7212 = (AbstractRunnableC7212) ref$ObjectRef.element;
                    ref$ObjectRef.element = null;
                    return abstractRunnableC7212;
                }
                if (jM12464 > 0) {
                    jMin = Math.min(jMin, jM12464);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f19239 = jMin;
        return null;
    }
}
