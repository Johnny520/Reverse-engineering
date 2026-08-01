package p095;

import androidx.activity.AbstractC0053;
import io.ktor.util.C4210;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.internal.C5355;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;
import net.bytebuddy.asm.Advice;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC7208 implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C7205 f19236;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f19237;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C7205 f19238;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C5355 f19239;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f19240;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long f19241;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f19242;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f19234 = AtomicLongFieldUpdater.newUpdater(ExecutorC7208.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f19235 = AtomicLongFieldUpdater.newUpdater(ExecutorC7208.class, "controlState$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19233 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC7208.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C4484 f19232 = new C4484("NOT_IN_STACK", 1);

    public ExecutorC7208(int i, int i2, long j, String str) {
        this.f19242 = i;
        this.f19240 = i2;
        this.f19241 = j;
        this.f19237 = str;
        if (i < 1) {
            C5919.m11253(AbstractC0053.m161(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            C5919.m11253(AbstractC6136.m11559(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            C5919.m11253(AbstractC0053.m161(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            C4210.m8619("Idle worker keep alive time ", j, " must be positive");
            throw null;
        }
        this.f19236 = new C7205();
        this.f19238 = new C7205();
        this.f19239 = new C5355((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m12414(ExecutorC7208 executorC7208, Runnable runnable, int i) {
        executorC7208.m12415(runnable, false, (i & 4) == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p095.ExecutorC7208.f19233
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof p095.C7209
            r3 = 0
            if (r1 == 0) goto L17
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世苏兰哲 r0 = (p095.C7209) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L20
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世哲苏兰 r1 = r0.f19246
            if (r1 == r8) goto L1f
            goto L20
        L1f:
            r3 = r0
        L20:
            kotlinx.coroutines.internal.飘花落叶言子楪哲世兰苏 r0 = r8.f19239
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p095.ExecutorC7208.f19235     // Catch: java.lang.Throwable -> La7
            long r4 = r1.get(r8)     // Catch: java.lang.Throwable -> La7
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r1 = (int) r4
            monitor-exit(r0)
            if (r2 > r1) goto L5c
            r0 = r2
        L32:
            kotlinx.coroutines.internal.飘花落叶言子楪哲世兰苏 r4 = r8.f19239
            java.lang.Object r4 = r4.m10377(r0)
            r4.getClass()
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世苏兰哲 r4 = (p095.C7209) r4
            if (r4 == r3) goto L57
        L3f:
            java.lang.Thread$State r5 = r4.getState()
            java.lang.Thread$State r6 = java.lang.Thread.State.TERMINATED
            if (r5 == r6) goto L50
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r5 = 10000(0x2710, double:4.9407E-320)
            r4.join(r5)
            goto L3f
        L50:
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏兰哲世 r4 = r4.f19251
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰哲苏 r5 = r8.f19238
            r4.m12431(r5)
        L57:
            if (r0 == r1) goto L5c
            int r0 = r0 + 1
            goto L32
        L5c:
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰哲苏 r0 = r8.f19238
            r0.m10405()
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰哲苏 r0 = r8.f19236
            r0.m10405()
        L66:
            if (r3 == 0) goto L6e
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲 r0 = r3.m12425(r2)
            if (r0 != 0) goto L96
        L6e:
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰哲苏 r0 = r8.f19236
            java.lang.Object r0 = r0.m10403()
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲 r0 = (p095.AbstractRunnableC7211) r0
            if (r0 != 0) goto L96
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰哲苏 r0 = r8.f19238
            java.lang.Object r0 = r0.m10403()
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲 r0 = (p095.AbstractRunnableC7211) r0
            if (r0 != 0) goto L96
            if (r3 == 0) goto L89
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState.TERMINATED
            r3.m12426(r0)
        L89:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p095.ExecutorC7208.f19234
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p095.ExecutorC7208.f19235
            r0.set(r8, r1)
            return
        L96:
            r0.run()     // Catch: java.lang.Throwable -> L9a
            goto L66
        L9a:
            r0 = move-exception
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r1.getUncaughtExceptionHandler()
            r4.uncaughtException(r1, r0)
            goto L66
        La7:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p095.ExecutorC7208.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m12414(this, runnable, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C5355 c5355 = this.f19239;
        int iM10378 = c5355.m10378();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM10378; i6++) {
            C7209 c7209 = (C7209) c5355.m10377(i6);
            if (c7209 != null) {
                int iM12432 = c7209.f19251.m12432();
                int i7 = AbstractC7210.f19252[c7209.f19250.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM12432);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM12432);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (iM12432 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM12432);
                        sb3.append(Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL);
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i7 != 5) {
                        C4210.m8621();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = f19235.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f19237);
        sb4.append('@');
        sb4.append(AbstractC5398.m10497(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f19242;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.f19240);
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
        sb4.append(this.f19236.m10404());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f19238.m10404());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12415(Runnable runnable, boolean z, boolean z2) {
        AbstractRunnableC7211 c7215;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState;
        AbstractC7216.f19264.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC7211) {
            c7215 = (AbstractRunnableC7211) runnable;
            c7215.f19254 = jNanoTime;
            c7215.f19253 = z;
        } else {
            c7215 = new C7215(runnable, jNanoTime, z);
        }
        boolean z3 = c7215.f19253;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19235;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C7209 c7209 = null;
        C7209 c72092 = threadCurrentThread instanceof C7209 ? (C7209) threadCurrentThread : null;
        if (c72092 != null && c72092.f19246 == this) {
            c7209 = c72092;
        }
        if (c7209 != null && (coroutineScheduler$WorkerState = c7209.f19250) != CoroutineScheduler$WorkerState.TERMINATED && (c7215.f19253 || coroutineScheduler$WorkerState != CoroutineScheduler$WorkerState.BLOCKING)) {
            c7209.f19248 = true;
            c7215 = c7209.f19251.m12434(c7215, z2);
        }
        if (c7215 != null) {
            if (!(c7215.f19253 ? this.f19238.m10406(c7215) : this.f19236.m10406(c7215))) {
                throw new RejectedExecutionException(AbstractC0053.m146(new StringBuilder(), this.f19237, " was terminated"));
            }
        }
        if (z3) {
            if (m12419() || m12417(jAddAndGet)) {
                return;
            }
            m12419();
            return;
        }
        if (m12419() || m12417(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m12419();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m12416() {
        synchronized (this.f19239) {
            try {
                if (f19233.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f19235;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f19242) {
                    return 0;
                }
                if (i >= this.f19240) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f19239.m10377(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C7209 c7209 = new C7209(this, i3);
                this.f19239.m10376(i3, c7209);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c7209.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m12417(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f19242;
        if (i < i2) {
            int iM12416 = m12416();
            if (iM12416 == 1 && i2 > 1) {
                m12416();
            }
            if (iM12416 > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m12418(C7209 c7209, int i, int i2) {
        while (true) {
            long j = f19234.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM12423 = c7209.m12423();
                    while (true) {
                        if (objM12423 == f19232) {
                            i3 = -1;
                            break;
                        }
                        if (objM12423 == null) {
                            i3 = 0;
                            break;
                        }
                        C7209 c72092 = (C7209) objM12423;
                        int iM12424 = c72092.m12424();
                        if (iM12424 != 0) {
                            i3 = iM12424;
                            break;
                        }
                        objM12423 = c72092.m12423();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                ExecutorC7208 executorC7208 = this;
                if (f19234.compareAndSet(executorC7208, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = executorC7208;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m12419() {
        ExecutorC7208 executorC7208;
        C4484 c4484;
        int iM12424;
        while (true) {
            long j = f19234.get(this);
            C7209 c7209 = (C7209) this.f19239.m10377((int) (2097151 & j));
            if (c7209 == null) {
                c7209 = null;
                executorC7208 = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM12423 = c7209.m12423();
                while (true) {
                    c4484 = f19232;
                    if (objM12423 == c4484) {
                        iM12424 = -1;
                        break;
                    }
                    if (objM12423 == null) {
                        iM12424 = 0;
                        break;
                    }
                    C7209 c72092 = (C7209) objM12423;
                    iM12424 = c72092.m12424();
                    if (iM12424 != 0) {
                        break;
                    }
                    objM12423 = c72092.m12423();
                    j = j;
                }
                if (iM12424 >= 0) {
                    ExecutorC7208 executorC72082 = this;
                    boolean zCompareAndSet = f19234.compareAndSet(executorC72082, j, ((long) iM12424) | j2);
                    executorC7208 = executorC72082;
                    if (zCompareAndSet) {
                        c7209.m12427(c4484);
                    }
                    this = executorC7208;
                } else {
                    continue;
                }
            }
            if (c7209 == null) {
                return false;
            }
            if (C7209.f19243.compareAndSet(c7209, -1, 0)) {
                LockSupport.unpark(c7209);
                return true;
            }
            this = executorC7208;
        }
    }
}
