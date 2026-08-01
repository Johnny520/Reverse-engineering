package p095;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7209 extends Thread {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19243 = AtomicIntegerFieldUpdater.newUpdater(C7209.class, "workerCtl$volatile");
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public long f19244;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public long f19245;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ ExecutorC7208 f19246;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f19247;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f19248;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Ref$ObjectRef f19249;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public CoroutineScheduler$WorkerState f19250;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C7214 f19251;

    public C7209(ExecutorC7208 executorC7208, int i) {
        this.f19246 = executorC7208;
        setDaemon(true);
        setContextClassLoader(ExecutorC7208.class.getClassLoader());
        this.f19251 = new C7214();
        this.f19249 = new Ref$ObjectRef();
        this.f19250 = CoroutineScheduler$WorkerState.DORMANT;
        this.nextParkedWorker = ExecutorC7208.f19232;
        int iNanoTime = (int) System.nanoTime();
        this.f19247 = iNanoTime == 0 ? 42 : iNanoTime;
        m12420(i);
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
        throw new UnsupportedOperationException("Method not decompiled: p095.C7209.run():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m12420(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19246.f19237);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractRunnableC7211 m12421() {
        int iM12422 = m12422(2);
        ExecutorC7208 executorC7208 = this.f19246;
        C7205 c7205 = executorC7208.f19238;
        C7205 c72052 = executorC7208.f19236;
        if (iM12422 == 0) {
            AbstractRunnableC7211 abstractRunnableC7211 = (AbstractRunnableC7211) c72052.m10403();
            return abstractRunnableC7211 != null ? abstractRunnableC7211 : (AbstractRunnableC7211) c7205.m10403();
        }
        AbstractRunnableC7211 abstractRunnableC72112 = (AbstractRunnableC7211) c7205.m10403();
        return abstractRunnableC72112 != null ? abstractRunnableC72112 : (AbstractRunnableC7211) c72052.m10403();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m12422(int i) {
        int i2 = this.f19247;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f19247 = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m12423() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m12424() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractRunnableC7211 m12425(boolean z) {
        AbstractRunnableC7211 abstractRunnableC7211M12421;
        AbstractRunnableC7211 abstractRunnableC7211M124212;
        long j;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState = this.f19250;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = CoroutineScheduler$WorkerState.CPU_ACQUIRED;
        ExecutorC7208 executorC7208 = this.f19246;
        C7214 c7214 = this.f19251;
        if (coroutineScheduler$WorkerState != coroutineScheduler$WorkerState2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC7208.f19235;
            do {
                j = atomicLongFieldUpdater.get(executorC7208);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    AbstractRunnableC7211 abstractRunnableC7211M12436 = c7214.m12436();
                    return (abstractRunnableC7211M12436 == null && (abstractRunnableC7211M12436 = (AbstractRunnableC7211) executorC7208.f19238.m10403()) == null) ? m12428(1) : abstractRunnableC7211M12436;
                }
            } while (!ExecutorC7208.f19235.compareAndSet(executorC7208, j, j - 4398046511104L));
            this.f19250 = CoroutineScheduler$WorkerState.CPU_ACQUIRED;
        }
        if (z) {
            boolean z2 = m12422(executorC7208.f19242 * 2) == 0;
            if (z2 && (abstractRunnableC7211M124212 = m12421()) != null) {
                return abstractRunnableC7211M124212;
            }
            AbstractRunnableC7211 abstractRunnableC7211M12430 = c7214.m12430();
            if (abstractRunnableC7211M12430 != null) {
                return abstractRunnableC7211M12430;
            }
            if (!z2 && (abstractRunnableC7211M12421 = m12421()) != null) {
                return abstractRunnableC7211M12421;
            }
        } else {
            AbstractRunnableC7211 abstractRunnableC7211M124213 = m12421();
            if (abstractRunnableC7211M124213 != null) {
                return abstractRunnableC7211M124213;
            }
        }
        return m12428(3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m12426(CoroutineScheduler$WorkerState coroutineScheduler$WorkerState) {
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = this.f19250;
        boolean z = coroutineScheduler$WorkerState2 == CoroutineScheduler$WorkerState.CPU_ACQUIRED;
        if (z) {
            ExecutorC7208.f19235.addAndGet(this.f19246, 4398046511104L);
        }
        if (coroutineScheduler$WorkerState2 != coroutineScheduler$WorkerState) {
            this.f19250 = coroutineScheduler$WorkerState;
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m12427(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractRunnableC7211 m12428(int i) {
        T tM12435;
        long jM12437;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC7208.f19235;
        ExecutorC7208 executorC7208 = this.f19246;
        int i2 = (int) (atomicLongFieldUpdater.get(executorC7208) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iM12422 = m12422(i2);
        long jMin = Long.MAX_VALUE;
        for (int i3 = 0; i3 < i2; i3++) {
            iM12422++;
            if (iM12422 > i2) {
                iM12422 = 1;
            }
            C7209 c7209 = (C7209) executorC7208.f19239.m10377(iM12422);
            if (c7209 != null && c7209 != this) {
                C7214 c7214 = c7209.f19251;
                c7214.getClass();
                if (i == 3) {
                    tM12435 = c7214.m12429();
                } else {
                    boolean z = i == 1;
                    int i4 = C7214.f19259.get(c7214);
                    int i5 = C7214.f19260.get(c7214);
                    while (i4 != i5 && (!z || C7214.f19258.get(c7214) != 0)) {
                        int i6 = i4 + 1;
                        tM12435 = c7214.m12435(i4, z);
                        if (tM12435 != 0) {
                            break;
                        }
                        i4 = i6;
                    }
                    tM12435 = 0;
                }
                Ref$ObjectRef ref$ObjectRef = this.f19249;
                if (tM12435 != 0) {
                    ref$ObjectRef.element = tM12435;
                    jM12437 = -1;
                } else {
                    jM12437 = c7214.m12437(ref$ObjectRef, i);
                }
                if (jM12437 == -1) {
                    AbstractRunnableC7211 abstractRunnableC7211 = (AbstractRunnableC7211) ref$ObjectRef.element;
                    ref$ObjectRef.element = null;
                    return abstractRunnableC7211;
                }
                if (jM12437 > 0) {
                    jMin = Math.min(jMin, jM12437);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f19244 = jMin;
        return null;
    }
}
