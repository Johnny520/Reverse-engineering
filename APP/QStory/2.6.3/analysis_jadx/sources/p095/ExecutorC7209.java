package p095;

import androidx.activity.AbstractC0053;
import io.ktor.util.C4211;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.internal.C5356;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;
import net.bytebuddy.asm.Advice;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC7209 implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C7206 f19231;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f19232;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C7206 f19233;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C5356 f19234;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f19235;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long f19236;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f19237;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f19229 = AtomicLongFieldUpdater.newUpdater(ExecutorC7209.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f19230 = AtomicLongFieldUpdater.newUpdater(ExecutorC7209.class, "controlState$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19228 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC7209.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C4485 f19227 = new C4485("NOT_IN_STACK", 1);

    public ExecutorC7209(int i, int i2, long j, String str) {
        this.f19237 = i;
        this.f19235 = i2;
        this.f19236 = j;
        this.f19232 = str;
        if (i < 1) {
            C5925.m11314(AbstractC0053.m162(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            C5925.m11314(AbstractC6183.m11591(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            C5925.m11314(AbstractC0053.m162(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            C4211.m8609("Idle worker keep alive time ", j, " must be positive");
            throw null;
        }
        this.f19231 = new C7206();
        this.f19233 = new C7206();
        this.f19234 = new C5356((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m12441(ExecutorC7209 executorC7209, Runnable runnable, int i) {
        executorC7209.m12442(runnable, false, (i & 4) == 0);
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
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p095.ExecutorC7209.f19228
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof p095.C7210
            r3 = 0
            if (r1 == 0) goto L17
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世苏兰哲 r0 = (p095.C7210) r0
            goto L18
        L17:
            r0 = r3
        L18:
            if (r0 == 0) goto L20
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世哲苏兰 r1 = r0.f19241
            if (r1 == r8) goto L1f
            goto L20
        L1f:
            r3 = r0
        L20:
            kotlinx.coroutines.internal.飘花落叶言子楪哲世兰苏 r0 = r8.f19234
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p095.ExecutorC7209.f19230     // Catch: java.lang.Throwable -> La7
            long r4 = r1.get(r8)     // Catch: java.lang.Throwable -> La7
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r1 = (int) r4
            monitor-exit(r0)
            if (r2 > r1) goto L5c
            r0 = r2
        L32:
            kotlinx.coroutines.internal.飘花落叶言子楪哲世兰苏 r4 = r8.f19234
            java.lang.Object r4 = r4.m10381(r0)
            r4.getClass()
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世苏兰哲 r4 = (p095.C7210) r4
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
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏兰哲世 r4 = r4.f19246
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰哲苏 r5 = r8.f19233
            r4.m12458(r5)
        L57:
            if (r0 == r1) goto L5c
            int r0 = r0 + 1
            goto L32
        L5c:
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰哲苏 r0 = r8.f19233
            r0.m10409()
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰哲苏 r0 = r8.f19231
            r0.m10409()
        L66:
            if (r3 == 0) goto L6e
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲 r0 = r3.m12452(r2)
            if (r0 != 0) goto L96
        L6e:
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰哲苏 r0 = r8.f19231
            java.lang.Object r0 = r0.m10407()
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲 r0 = (p095.AbstractRunnableC7212) r0
            if (r0 != 0) goto L96
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪世兰哲苏 r0 = r8.f19233
            java.lang.Object r0 = r0.m10407()
            飘花落叶言世苏哲楪子兰.飘花落叶言子楪苏世兰哲 r0 = (p095.AbstractRunnableC7212) r0
            if (r0 != 0) goto L96
            if (r3 == 0) goto L89
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState.TERMINATED
            r3.m12453(r0)
        L89:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p095.ExecutorC7209.f19229
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p095.ExecutorC7209.f19230
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
        throw new UnsupportedOperationException("Method not decompiled: p095.ExecutorC7209.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m12441(this, runnable, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C5356 c5356 = this.f19234;
        int iM10382 = c5356.m10382();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM10382; i6++) {
            C7210 c7210 = (C7210) c5356.m10381(i6);
            if (c7210 != null) {
                int iM12459 = c7210.f19246.m12459();
                int i7 = AbstractC7211.f19247[c7210.f19245.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM12459);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM12459);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (iM12459 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM12459);
                        sb3.append(Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL);
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i7 != 5) {
                        C4211.m8611();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = f19230.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f19232);
        sb4.append('@');
        sb4.append(AbstractC5399.m10501(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f19237;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.f19235);
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
        sb4.append(this.f19231.m10408());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f19233.m10408());
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
    public final void m12442(Runnable runnable, boolean z, boolean z2) {
        AbstractRunnableC7212 c7216;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState;
        AbstractC7217.f19259.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC7212) {
            c7216 = (AbstractRunnableC7212) runnable;
            c7216.f19249 = jNanoTime;
            c7216.f19248 = z;
        } else {
            c7216 = new C7216(runnable, jNanoTime, z);
        }
        boolean z3 = c7216.f19248;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19230;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C7210 c7210 = null;
        C7210 c72102 = threadCurrentThread instanceof C7210 ? (C7210) threadCurrentThread : null;
        if (c72102 != null && c72102.f19241 == this) {
            c7210 = c72102;
        }
        if (c7210 != null && (coroutineScheduler$WorkerState = c7210.f19245) != CoroutineScheduler$WorkerState.TERMINATED && (c7216.f19248 || coroutineScheduler$WorkerState != CoroutineScheduler$WorkerState.BLOCKING)) {
            c7210.f19243 = true;
            c7216 = c7210.f19246.m12461(c7216, z2);
        }
        if (c7216 != null) {
            if (!(c7216.f19248 ? this.f19233.m10410(c7216) : this.f19231.m10410(c7216))) {
                throw new RejectedExecutionException(AbstractC0053.m151(new StringBuilder(), this.f19232, " was terminated"));
            }
        }
        if (z3) {
            if (m12446() || m12444(jAddAndGet)) {
                return;
            }
            m12446();
            return;
        }
        if (m12446() || m12444(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m12446();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m12443() {
        synchronized (this.f19234) {
            try {
                if (f19228.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f19230;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f19237) {
                    return 0;
                }
                if (i >= this.f19235) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f19234.m10381(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C7210 c7210 = new C7210(this, i3);
                this.f19234.m10380(i3, c7210);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c7210.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m12444(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f19237;
        if (i < i2) {
            int iM12443 = m12443();
            if (iM12443 == 1 && i2 > 1) {
                m12443();
            }
            if (iM12443 > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m12445(C7210 c7210, int i, int i2) {
        while (true) {
            long j = f19229.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM12450 = c7210.m12450();
                    while (true) {
                        if (objM12450 == f19227) {
                            i3 = -1;
                            break;
                        }
                        if (objM12450 == null) {
                            i3 = 0;
                            break;
                        }
                        C7210 c72102 = (C7210) objM12450;
                        int iM12451 = c72102.m12451();
                        if (iM12451 != 0) {
                            i3 = iM12451;
                            break;
                        }
                        objM12450 = c72102.m12450();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                ExecutorC7209 executorC7209 = this;
                if (f19229.compareAndSet(executorC7209, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = executorC7209;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m12446() {
        ExecutorC7209 executorC7209;
        C4485 c4485;
        int iM12451;
        while (true) {
            long j = f19229.get(this);
            C7210 c7210 = (C7210) this.f19234.m10381((int) (2097151 & j));
            if (c7210 == null) {
                c7210 = null;
                executorC7209 = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM12450 = c7210.m12450();
                while (true) {
                    c4485 = f19227;
                    if (objM12450 == c4485) {
                        iM12451 = -1;
                        break;
                    }
                    if (objM12450 == null) {
                        iM12451 = 0;
                        break;
                    }
                    C7210 c72102 = (C7210) objM12450;
                    iM12451 = c72102.m12451();
                    if (iM12451 != 0) {
                        break;
                    }
                    objM12450 = c72102.m12450();
                    j = j;
                }
                if (iM12451 >= 0) {
                    ExecutorC7209 executorC72092 = this;
                    boolean zCompareAndSet = f19229.compareAndSet(executorC72092, j, ((long) iM12451) | j2);
                    executorC7209 = executorC72092;
                    if (zCompareAndSet) {
                        c7210.m12454(c4485);
                    }
                    this = executorC7209;
                } else {
                    continue;
                }
            }
            if (c7210 == null) {
                return false;
            }
            if (C7210.f19238.compareAndSet(c7210, -1, 0)) {
                LockSupport.unpark(c7210);
                return true;
            }
            this = executorC7209;
        }
    }
}
