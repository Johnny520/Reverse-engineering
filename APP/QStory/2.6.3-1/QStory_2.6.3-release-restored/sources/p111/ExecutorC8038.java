package p111;

import androidx.activity.AbstractC0900;
import io.ktor.util.C5043;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.internal.C6188;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;
import net.bytebuddy.asm.Advice;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪子兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC8038 implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C8035 f19576;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f19577;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C8035 f19578;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C6188 f19579;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f19580;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long f19581;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f19582;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f19574 = AtomicLongFieldUpdater.newUpdater(ExecutorC8038.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f19575 = AtomicLongFieldUpdater.newUpdater(ExecutorC8038.class, "controlState$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f19573 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC8038.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C5317 f19572 = new C5317("NOT_IN_STACK", 1);

    public ExecutorC8038(int i, int i2, long j, String str) {
        this.f19582 = i;
        this.f19580 = i2;
        this.f19581 = j;
        this.f19577 = str;
        if (i < 1) {
            C6755.m11873(AbstractC0900.m722(i, "Core pool size ", " should be at least 1"));
            throw null;
        }
        if (i2 < i) {
            C6755.m11873(AbstractC7012.m12150(i2, i, "Max pool size ", " should be greater than or equals to core pool size "));
            throw null;
        }
        if (i2 > 2097150) {
            C6755.m11873(AbstractC0900.m722(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150"));
            throw null;
        }
        if (j <= 0) {
            C5043.m9168("Idle worker keep alive time ", j, " must be positive");
            throw null;
        }
        this.f19576 = new C8035();
        this.f19578 = new C8035();
        this.f19579 = new C6188((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static /* synthetic */ void m13000(ExecutorC8038 executorC8038, Runnable runnable, int i) {
        executorC8038.m13001(runnable, false, (i & 4) == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws InterruptedException {
        int i;
        AbstractRunnableC8041 abstractRunnableC8041M13011;
        if (f19573.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C8039 c8039 = null;
            C8039 c80392 = threadCurrentThread instanceof C8039 ? (C8039) threadCurrentThread : null;
            if (c80392 != null && c80392.f19586 == this) {
                c8039 = c80392;
            }
            synchronized (this.f19579) {
                i = (int) (f19575.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objM10940 = this.f19579.m10940(i2);
                    objM10940.getClass();
                    C8039 c80393 = (C8039) objM10940;
                    if (c80393 != c8039) {
                        while (c80393.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c80393);
                            c80393.join(10000L);
                        }
                        c80393.f19591.m13017(this.f19578);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f19578.m10968();
            this.f19576.m10968();
            while (true) {
                if (c8039 == null) {
                    abstractRunnableC8041M13011 = (AbstractRunnableC8041) this.f19576.m10966();
                    if (abstractRunnableC8041M13011 == null && (abstractRunnableC8041M13011 = (AbstractRunnableC8041) this.f19578.m10966()) == null) {
                        break;
                    }
                } else {
                    abstractRunnableC8041M13011 = c8039.m13011(true);
                    if (abstractRunnableC8041M13011 == null) {
                    }
                }
                try {
                    abstractRunnableC8041M13011.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c8039 != null) {
                c8039.m13012(CoroutineScheduler$WorkerState.TERMINATED);
            }
            f19574.set(this, 0L);
            f19575.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m13000(this, runnable, 6);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C6188 c6188 = this.f19579;
        int iM10941 = c6188.m10941();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM10941; i6++) {
            C8039 c8039 = (C8039) c6188.m10940(i6);
            if (c8039 != null) {
                int iM13018 = c8039.f19591.m13018();
                int i7 = AbstractC8040.f19592[c8039.f19590.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM13018);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM13018);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (iM13018 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM13018);
                        sb3.append(Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL);
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (i7 != 5) {
                        C5043.m9170();
                        return null;
                    }
                    i5++;
                }
            }
        }
        long j = f19575.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f19577);
        sb4.append('@');
        sb4.append(AbstractC6231.m11060(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f19582;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.f19580);
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
        sb4.append(this.f19576.m10967());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f19578.m10967());
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
    public final void m13001(Runnable runnable, boolean z, boolean z2) {
        AbstractRunnableC8041 c8045;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState;
        AbstractC8046.f19604.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC8041) {
            c8045 = (AbstractRunnableC8041) runnable;
            c8045.f19594 = jNanoTime;
            c8045.f19593 = z;
        } else {
            c8045 = new C8045(runnable, jNanoTime, z);
        }
        boolean z3 = c8045.f19593;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f19575;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C8039 c8039 = null;
        C8039 c80392 = threadCurrentThread instanceof C8039 ? (C8039) threadCurrentThread : null;
        if (c80392 != null && c80392.f19586 == this) {
            c8039 = c80392;
        }
        if (c8039 != null && (coroutineScheduler$WorkerState = c8039.f19590) != CoroutineScheduler$WorkerState.TERMINATED && (c8045.f19593 || coroutineScheduler$WorkerState != CoroutineScheduler$WorkerState.BLOCKING)) {
            c8039.f19588 = true;
            c8045 = c8039.f19591.m13020(c8045, z2);
        }
        if (c8045 != null) {
            if (!(c8045.f19593 ? this.f19578.m10969(c8045) : this.f19576.m10969(c8045))) {
                throw new RejectedExecutionException(AbstractC0900.m711(new StringBuilder(), this.f19577, " was terminated"));
            }
        }
        if (z3) {
            if (m13005() || m13003(jAddAndGet)) {
                return;
            }
            m13005();
            return;
        }
        if (m13005() || m13003(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m13005();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m13002() {
        synchronized (this.f19579) {
            try {
                if (f19573.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f19575;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.f19582) {
                    return 0;
                }
                if (i >= this.f19580) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.f19579.m10940(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C8039 c8039 = new C8039(this, i3);
                this.f19579.m10939(i3, c8039);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                c8039.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean m13003(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f19582;
        if (i < i2) {
            int iM13002 = m13002();
            if (iM13002 == 1 && i2 > 1) {
                m13002();
            }
            if (iM13002 > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13004(C8039 c8039, int i, int i2) {
        while (true) {
            long j = f19574.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objM13009 = c8039.m13009();
                    while (true) {
                        if (objM13009 == f19572) {
                            i3 = -1;
                            break;
                        }
                        if (objM13009 == null) {
                            i3 = 0;
                            break;
                        }
                        C8039 c80392 = (C8039) objM13009;
                        int iM13010 = c80392.m13010();
                        if (iM13010 != 0) {
                            i3 = iM13010;
                            break;
                        }
                        objM13009 = c80392.m13009();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                ExecutorC8038 executorC8038 = this;
                if (f19574.compareAndSet(executorC8038, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = executorC8038;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m13005() {
        ExecutorC8038 executorC8038;
        C5317 c5317;
        int iM13010;
        while (true) {
            long j = f19574.get(this);
            C8039 c8039 = (C8039) this.f19579.m10940((int) (2097151 & j));
            if (c8039 == null) {
                c8039 = null;
                executorC8038 = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM13009 = c8039.m13009();
                while (true) {
                    c5317 = f19572;
                    if (objM13009 == c5317) {
                        iM13010 = -1;
                        break;
                    }
                    if (objM13009 == null) {
                        iM13010 = 0;
                        break;
                    }
                    C8039 c80392 = (C8039) objM13009;
                    iM13010 = c80392.m13010();
                    if (iM13010 != 0) {
                        break;
                    }
                    objM13009 = c80392.m13009();
                    j = j;
                }
                if (iM13010 >= 0) {
                    ExecutorC8038 executorC80382 = this;
                    boolean zCompareAndSet = f19574.compareAndSet(executorC80382, j, ((long) iM13010) | j2);
                    executorC8038 = executorC80382;
                    if (zCompareAndSet) {
                        c8039.m13013(c5317);
                    }
                    this = executorC8038;
                } else {
                    continue;
                }
            }
            if (c8039 == null) {
                return false;
            }
            if (C8039.f19583.compareAndSet(c8039, -1, 0)) {
                LockSupport.unpark(c8039);
                return true;
            }
            this = executorC8038;
        }
    }
}
